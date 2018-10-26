package com.taobao.tddl.common.monitor;

import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.lang.management.ThreadMXBean;
import java.net.InetAddress;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class MonitorLogUtil implements MonitorLogUtilMBean {
    private static final String                 GBK                    = "GBK";
    private static final String                 YYYY_MM_DD             = "'.'yyyy-MM-dd";
    private static final String                 M_N                    = "%m%n";
    public static final String                  USER_HOME              = "user.home";
    public static final String                  LOG_STAT_NAME_STAT_LOG = "log-monitor:name=monitor-client";
    static Logger                               log                    = Logger
            .getLogger(MonitorLogUtil.class);
    private static Logger                       statLog                = Logger
            .getLogger("Sampling");

    private static final String                 DIR_NAME               = "logs" + File.separator
            + "monitor";

    public static final String                  FILE_NAME              = "tddl-monitor.log";

    private static final String                 WRITETHREAD_NAME       = "LOGSTAT-WRITE";

    private static final String                 SPLITTER_1             = "\t";
    private static final String                 SPLITTER_2             = "\n";

    private static final Map<Keys, ValueObject> datas                  = new ConcurrentHashMap<Keys, ValueObject>(
            100);

    private static final ReentrantLock          lock                   = new ReentrantLock();

    private static final ReentrantLock          timerLock              = new ReentrantLock();
    private static final Condition              condition              = timerLock.newCondition();

    /*private static final Calendar cal = Calendar.getInstance(); */
    private static final SimpleDateFormat       formatter              = new SimpleDateFormat(
            "yyyy-MM-dd HH:mm:ss");
    private static final DecimalFormat          decimalformat          = new DecimalFormat("#.##");

    //JVM监控信息
    private static final MemoryMXBean           memoryMXBean           = ManagementFactory
            .getMemoryMXBean();
    private static final ThreadMXBean           threadMXBean           = ManagementFactory
            .getThreadMXBean();

    private static String                       hostName               = "";
    private static String                       appName                = null;
    /**
     * <p>取得默认的MBean Server</p>
     */
    private static MBeanServer                  mbs                    = ManagementFactory
            .getPlatformMBeanServer();

    /** <p>
     * 写入数据的时间间隔.(ie.数据采样时间)
     * </p>
     */
    static long                                 waitTime               = 120000L;
    //static long waitTime = 1200L;

    static boolean                              jvmInfoPower           = true;

    private static final String                 KEY_LEVEL_JVM          = "JVM";
    private static final String                 KEY_LEVEL_CUP          = "CPU";
    private static final String                 KEY_LEVEL_MEMORY       = "MEMORY";
    private static final String                 KEY_LEVEL_SITUATION    = "SITUATION";
    private static final String                 KEY_LEVEL_USAGE        = "USAGE";
    private static final String                 KEY_LEVEL_THREAD       = "THREAD";
    private static final String                 KEY_LEVEL_TOTAL        = "TOTAL";

    public long getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(long waitTime) {
        MonitorLogUtil.waitTime = waitTime;
        MonitorLogUtil.runWriteThread();
    }

    public boolean getJVMInfoPower() {
        return jvmInfoPower;
    }

    public void setJVMInfoPower(boolean power) {
        MonitorLogUtil.jvmInfoPower = power;
    }

    static boolean        writeLog            = true;

    /** 写入数据的线程 */
    private static Thread writeThread         = null;

    /** <p>日志文件的绝对路径 </p>*/
    private static String logFileAbsolutePath = "";

    static { //启动线程
        // 动态创建日志记录的配置
        PatternLayout layout = new PatternLayout(M_N);
        String userHome = System.getProperty(USER_HOME);
        if (!userHome.endsWith(File.separator)) {
            userHome += File.separator;
        }
        String path = userHome + DIR_NAME + File.separator;
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        String fileName = path + FILE_NAME;
        logFileAbsolutePath = fileName;
        FileAppender appender = null;
        try {
            appender = new DailyRollingFileAppender(layout, fileName, YYYY_MM_DD);
            appender.setAppend(true);
            appender.setEncoding(GBK);
            InetAddress addr = InetAddress.getLocalHost();
            hostName = addr.getHostName().toString();
        } catch (IOException e) {
            statLog.error("set the appender error!", e);
        }

        if (appender != null) {
            statLog.removeAllAppenders();
            statLog.addAppender(appender);
        }
        statLog.setLevel(Level.INFO);
        statLog.setAdditivity(false);
        runWriteThread();
        registerSelf();
    }

    /**
     * 执行写入线程
     */
    public static void runWriteThread() {

        if (null != writeThread) { // 如果线程还存在，先interrupt一下
            try {
                writeThread.interrupt();
            } catch (Exception e) {
                log.error("interrupt write thread error", e);
            }
        }
        // 初始化线程
        writeThread = new Thread(new Runnable() {
            public void run() {
                // 等待waitTime秒
                while (true) {
                    timerLock.lock();
                    try {
                        condition.await(waitTime, TimeUnit.MILLISECONDS);
                    } catch (Exception e) {
                        log.error("wait error", e);
                    } finally {
                        timerLock.unlock();
                    }

                    MonitorLogUtil.writeLog();
                }
            }
        });
        writeThread.setName(WRITETHREAD_NAME);
        writeThread.setDaemon(true);
        writeThread.start();
    }

    public static String getLogFileAbsolutePath() {
        return logFileAbsolutePath;
    };


    private static void writeLog() {
        // 进行写入
        Map<Keys, ValueObject> tmp = new HashMap<Keys, ValueObject>(datas.size()); // 设置一个临时的数据是为了保证数据都写到文件后才减少datas的数据
        StringBuilder sb = new StringBuilder();
        /*sb.append(System.currentTimeMillis()).append(SPLITTER_1);*/

        for (Keys key : datas.keySet()) {
            long[] values = datas.get(key).getValues();
            long value1 = values[0];
            long value2 = values[1];
            if (0 == value1 && 0 == value2)
                continue;

            sb.append(key.getString(SPLITTER_1)).append(SPLITTER_1);
            sb.append(value1).append(SPLITTER_1);
            sb.append(value2).append(SPLITTER_1);
            sb.append(formatter.format(Calendar.getInstance().getTime())).append(SPLITTER_1);
            sb.append(hostName).append(SPLITTER_2);
            tmp.put(key, new ValueObject(value1, value2));
        }

        if (jvmInfoPower) {
            sb.append(getJvmInfo());
        }

        if (tmp.size() > 0 && writeLog) {
            statLog.info(sb);
        }
        // 循环把已经写入文件的数据从datas中减少
        for (Keys key : tmp.keySet()) {
            long[] values = tmp.get(key).getValues();
            datas.get(key).deductCount(values[0], values[1]);
        }
    }

    /**
     * keyOne,keyTwo,keyThree不能带有类似\n的回行
     * @param keyOne
     * @param keyTwo
     * @param keyThree
     */
    public static void addStat(String keyOne, String keyTwo, String keyThree) {
        Keys keys = new Keys(keyOne, keyTwo, keyThree);
        addStat(keys, 1, 0);
    }

    /**
     * keyOne,keyTwo,keyThree不能带有类似\n的回行
     * @param keyOne
     * @param keyTwo
     * @param keyThree
     * @param value
     */
    public static void addStatValue2(String keyOne, String keyTwo, String keyThree, long value) {
        Keys keys = new Keys(keyOne, keyTwo, keyThree);
        addStat(keys, 1, value);
    }

    /**
     * keyOne,keyTwo,keyThree不能带有类似\n的回行
     * @param keyOne
     * @param keyTwo
     * @param keyThree
     * @param value1
     * @param value2
     */
    public static void addStat(String keyOne, String keyTwo, String keyThree, long value1,
                               long value2) {
        Keys keys = new Keys(keyOne, keyTwo, keyThree);
        addStat(keys, value1, value2);
    }

    public static void addStat(Keys keys, long value1, long value2) {
        getAppName(keys.getAppName());
        ValueObject v = getValueObject(keys);
        v.addCount(value1, value2);
    }

    /**
     * @deprecated
     *
     * */
    public static void addStatWithAppName(String appName, String keyOne, String keyTwo,
                                          String keyThree, long value1, long value2) {
        Keys keys = new Keys(appName, keyOne, keyTwo, keyThree);
        addStat(keys, value1, value2);
    }

    public static boolean isWriteLog() {
        return writeLog;
    }

    public static void setWriteLog(boolean writeLog) {
        MonitorLogUtil.writeLog = writeLog;
    }

    protected static void getAppName(String name) {
        if (name != null) {
            if (appName == null) {
                appName = name;
            }
        }
    }

    /**
     * 这个方法将确保不会返回null。（当keys无对应的ValueObject时创建之）
     */
    protected static ValueObject getValueObject(Keys keys) {
        ValueObject v = datas.get(keys);
        if (null == v) {
            lock.lock();
            try {
                v = datas.get(keys);
                if (null == v) {
                    v = new ValueObject();
                    datas.put(keys, v);
                }
            } finally {
                lock.unlock();
            }
        }
        return v;
    }

    private MonitorLogUtil() {

    }

    /**
     * <p>
     * 把TBCacheManager自己注册到MBeanServer
     * </p>
     *
     */
    public static synchronized void registerSelf() {
        MonitorLogUtil statLog = new MonitorLogUtil();
        try {
            ObjectName objectName = new ObjectName(LOG_STAT_NAME_STAT_LOG);
            if (!mbs.isRegistered(objectName)) {
                mbs.registerMBean(statLog, objectName);
            }
        } catch (MBeanException e) {
            log.error(e.getMessage(), e);
        } catch (MalformedObjectNameException e) {
            log.error(e.getMessage(), e);
        } catch (NotCompliantMBeanException e) {
            log.error(e.getMessage(), e);
        } catch (InstanceAlreadyExistsException e) {
            log.error(e.getMessage(), e);
        }
    }

    /**
     * 监控jvm信息
     * */
    private static String getJvmInfo() {

        StringBuilder sb = new StringBuilder();

        MemoryUsage memoryUsage = memoryMXBean.getHeapMemoryUsage();

        //jvm 内存信息 TC  JVM  MEMORY SITUATION  1024  856  2009-04-01 18:06:56  vm4.qa
        if (appName != null) {
            sb.append(appName).append(SPLITTER_1);
        }
        sb.append(KEY_LEVEL_JVM).append(SPLITTER_1);
        sb.append(KEY_LEVEL_MEMORY).append(SPLITTER_1);
        sb.append(KEY_LEVEL_SITUATION).append(SPLITTER_1);
        sb.append(formatValue(memoryUsage.getMax())).append(SPLITTER_1);
        sb.append(formatValue(memoryUsage.getUsed())).append(SPLITTER_1);
        sb.append(formatter.format(Calendar.getInstance().getTime())).append(SPLITTER_1);
        sb.append(hostName).append(SPLITTER_2);

        //jvm CPU信息 TC  JVM  CPU    USAGE        68    0   2009-04-01 18:06:56  vm4.qa
        if (appName != null) {
            sb.append(appName).append(SPLITTER_1);
        }

        sb.append(KEY_LEVEL_JVM).append(SPLITTER_1);
        sb.append(KEY_LEVEL_CUP).append(SPLITTER_1);
        sb.append(KEY_LEVEL_USAGE).append(SPLITTER_1);
        sb.append(formatNanosecond(threadMXBean.getCurrentThreadCpuTime())).append(SPLITTER_1);
        sb.append("0").append(SPLITTER_1);
        sb.append(formatter.format(Calendar.getInstance().getTime())).append(SPLITTER_1);
        sb.append(hostName).append(SPLITTER_2);

        // jvm 线程信息  TC  JVM  THREAD TOTAL  100  0  2009-04-01 18:06:56  vm4.qa
        if (appName != null) {
            sb.append(appName).append(SPLITTER_1);
        }
        sb.append(KEY_LEVEL_JVM).append(SPLITTER_1);
        sb.append(KEY_LEVEL_THREAD).append(SPLITTER_1);
        sb.append(KEY_LEVEL_TOTAL).append(SPLITTER_1);
        sb.append(threadMXBean.getDaemonThreadCount()).append(SPLITTER_1);
        sb.append("0").append(SPLITTER_1);
        sb.append(formatter.format(Calendar.getInstance().getTime())).append(SPLITTER_1);
        /*sb.append(hostName).append(SPLITTER_2);*/
        sb.append(hostName);
        return sb.toString();

    }

    /**
     * 将字节单位转为M，保留小数点两位
     * */
    private static String formatValue(long value) {
        Double tempValue = new Double(value) / 1024 / 1024;
        return decimalformat.format(tempValue);
    }

    private static String formatNanosecond(long value) {
        Double tempValue = new Double(value) / 1000000000;
        return decimalformat.format(tempValue);
    }

    public static void main(String[] args) {

        Thread TestwriteThread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    timerLock.lock();
                    try {
                        condition.await(5, TimeUnit.MILLISECONDS);
                    } catch (Exception e) {
                        log.error("wait error", e);
                    } finally {
                        timerLock.unlock();
                    }
                    MonitorLogUtil.addStat("TC2", null, null, 541, 256);
                    MonitorLogUtil.addStat("TC1", "SyncCreateOrder", "ERROR", 541, 256); //ok
                    MonitorLogUtil.addStat("TC3", "SyncCreateOrder", null, 541, 256);
                    MonitorLogUtil.addStat("UIC4", "SyncCreateOrder", "timout", 5621, 10);
                    MonitorLogUtil.addStat("IC5", "SyncCreateOrder", "normal", 999, 5221);
                    MonitorLogUtil.addStatWithAppName("appName", "IC6", "SyncCreateOrder",
                            "normal",
                            999, 5221);
                    MonitorLogUtil.addStatWithAppName("appName1", null, null, null, 999, 5221);//ok
                    MonitorLogUtil.addStatWithAppName("appName2", "SyncCreateOrder", null, null,
                            999,
                            5221);
                    MonitorLogUtil.addStatWithAppName("appName3", "SyncCreateOrder", null, null,
                            999,
                            5221);
                }
            }
        });
        TestwriteThread.setName("TestTreadName");
        TestwriteThread.start();
    }
}
