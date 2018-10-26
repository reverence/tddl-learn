package com.taobao.tddl.common;

import com.alibaba.common.lang.StringUtil;
import com.taobao.tddl.common.ConfigServerHelper.AbstractDataListener;
import com.taobao.tddl.common.ConfigServerHelper.DataListener;
import com.taobao.tddl.common.monitor.MonitorLogUtil;
import com.taobao.tddl.common.util.BoundedConcurrentHashMap;
import com.taobao.tddl.common.util.NagiosUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Map;
import java.util.Properties;

public class Monitor {
    private static final Log                                      logger                        = LogFactory
            .getLog(Monitor.class);
    private static final BoundedConcurrentHashMap<String, String> sqlToMD5Map                   = new BoundedConcurrentHashMap<String, String>();
    private static MD5Maker                                       md5Maker                      = MD5Maker
            .getInstance();
    private static final Log                                      log                           = LogFactory
            .getLog("TDDL_MD5_TO_SQL_MAPPING");
    public static final String                                    KEY1                          = "TDDL";
    public static final String                                    KEY1_TABLE                    = "TDDL_TABLE|";
    public static final String                                    KEY2_EXEC_SQL                 = "TDDL_SQL|";
    public static final String                                    KEY2_SYNC                     = "Sync";
    public static final String                                    KEY2_SYNC_CONTEXT_SQL         = "SyncServerContextSql";                        //added by huali，是在同步服务器同步的时候设置给context的sql，否则监控的代码会NPE
    public static final String                                    KEY3_BatchUpdateSyncLog       = "BatchUpdateSyncLog";
    public static final String                                    KEY3_BatchDeleteSyncLog       = "BatchDeleteSyncLog";
    public static final String                                    KEY3_SyncLogFetched           = "SyncLogFetched";
    public static final String                                    KEY3_ReplicationTasksAccepted = "ReplicationTasksAccepted";
    public static final String                                    KEY3_UpdateSlaveRow_dup_all   = "UpdateSlaveRow_dup_all";
    public static final String                                    KEY3_PARSE_SQL                = "PARSE_SQL_SUCCESS";
    public static volatile String                                 APPNAME                       = "TDDL";

    public enum RECORD_TYPE {
        RECORD_SQL, MD5, NONE
    }

    public enum TddlConfigKey {
        statKeyRecordType, statKeyLeftCutLen, statKeyRight
    }

    private static volatile RECORD_TYPE recordType = RECORD_TYPE.NONE;
    private static volatile int         left       = 0;               //从左起保留多少个字符
    private static volatile int         right      = 0;               //从右起保留多少个字符

    private static void init() {
        if ("TDDL".equals(APPNAME)) {
            logger.warn("不指定TDDL以外的appName则不订阅");
            return;
        }
        Object firstFetchedConfigs = ConfigServerHelper.subscribeReplicationSwitch(APPNAME,
                tddlConfigListener);
        if (firstFetchedConfigs == null) {
            logger.warn("No tddlconfig received, use default");
        }
    }

    protected static DataListener             tddlConfigListener                                       = new AbstractDataListener() {
        public void onDataReceive(
                Object data) {
            Properties p = ConfigServerHelper
                    .parseProperties(
                            data,
                            "[tddlConfigListener]");
            if (p == null) {
                logger
                        .warn("Empty tddlconfig");
                return;
            }
            try {
                for (Map.Entry<Object, Object> entry : p
                        .entrySet()) {
                    String key = ((String) entry
                            .getKey())
                            .trim();
                    String value = ((String) entry
                            .getValue())
                            .trim();
                    switch (TddlConfigKey
                            .valueOf(key)) {
                        case statKeyRecordType: {
                            RECORD_TYPE old = recordType;
                            recordType = RECORD_TYPE
                                    .valueOf(value);
                            logger
                                    .warn("recordType switch from ["
                                            + old
                                            + "] to ["
                                            + recordType
                                            + "]");
                            break;
                        }
                        case statKeyLeftCutLen: {
                            int old = left;
                            left = Integer
                                    .valueOf(value);
                            logger
                                    .warn("left switch from ["
                                            + old
                                            + "] to ["
                                            + left
                                            + "]");
                            break;
                        }
                        case statKeyRight: {
                            int old = right;
                            right = Integer
                                    .valueOf(value);
                            logger
                                    .warn("right switch from ["
                                            + old
                                            + "] to ["
                                            + right
                                            + "]");
                            break;
                        }
                        default:
                            logger
                                    .error("Should not be occour!");
                    }
                }
            } catch (Exception e) {
                logger
                        .error(
                                "[tddlConfigListener.onDataReceive]",
                                e);
            }
        }
    };

    public static final String                KEY3_TAIR_HIT_RATING                                     = "TAIR_HIT_RATING";

    /**
     * 会记录走则引擎用的时间和总耗时
     */
    public static final String                KEY3_GET_DB_AND_TABLES                                   = "GET_DB_ANDTABLES_SUCCESS";
    /**
     * 执行sql的总时间，包含真正数据库的执行时间和总时间
     */
    public static final String                KEY3_EXECUTE_A_SQL_SUCCESS                               = "EXECUTE_A_SQL_SUCCESS";
    /**
     * 超时情况下，tddl用掉的时间
     */
    public static final String                KEY3_EXECUTE_TIMEOUT_TDDL                                = "EXECUTE_TIMEOUT_TDDL";
    /**
     * 超时情况下，数据库执行用掉的时间
     */
    public static final String                KEY3_EXECUTE_TIMEOUT_DB                                  = "EXECUTE_TIMEOUT_DB";
    /**
     * 正常情况下，tddl执行用掉的时间
     */
    public static final String                KEY3_EXECUTE_SUCCESS_TDDL                                = "EXECUTE_SUCCESS_TDDL";
    /**
     * 正常情况下，数据库执行用掉的时间
     */
    public static final String                KEY3_EXECUTE_SUCCESS_DB                                  = "EXECUTE_SUCCESS_DB";
    /**
     * 总共执行了几个库，几个表
     */
    public static final String                KEY3_EXECUTE_A_SQL_SUCCESS_DBTAB                         = "EXECUTE_A_SQL_SUCCESS_DBTAB";
    /**
     * 执行sql的总时间，包含真正数据库的执行时间和总时间
     */
    public static final String                KEY3_EXECUTE_A_SQL_TIMEOUT                               = "EXECUTE_A_SQL_TIMEOUT";

    public static final String                KEY3_EXECUTE_A_SQL_TIMEOUT_DBTAB                         = "EXECUTE_A_SQL_TIMEOUT_DBTAB";

    public static final String                KEY3_EXECUTE_A_SQL_EXCEPTION                             = "EXECUTE_A_SQL_WITH_EXCEPTION";

    public static final String                KEY3_EXECUTE_A_SQL_EXCEPTION_DBTAB                       = "EXECUTE_A_SQL_WITH_EXCEPTION_DBTAB";

    public static final String                KEY2_REPLICATION_SQL                                     = "TDDL_REPLICATION_SQL|";

    /**
     * 复制到从库成功，计入写库时间和总耗费时间
     */
    public static final String                KEY3_COPY_2_SLAVE_SUCCESS                                = "COPY_2_SLAVE_SUCCESS";

    /**
     * 记录从生成任务到该任务开始被执行之间所消耗的时间
     */
    public static final String                KEY3_COPY_2_SLAVE_SUCCESS_TIME_CONSUMING_IN_THREADPOOL   = "COPY_2_SLAVE_SUCCESS_TIME_CONSUMING_IN_THREADPOOL";
    /**
     * 复制到从库超时，要记录查询+写入sql所耗费的时间。
     */
    public static final String                KEY3_COPY_2_SLAVE_TIMEOUT                                = "COPY_2_SLAVE_TIMEOUT";

    /**
     * 记录从生成任务到该任务开始被执行之间所消耗的时间
     */
    public static final String                KEY3_COPY_2_SLAVE_TIMEOUT_TIME_CONSUMING_IN_THREADPOOL   = "COPY_2_SLAVE_TIMEOUT_TIME_CONSUMING_IN_THREADPOOL";
    /**
     * 复制到从库异常，不计入主键冲突认为更新成功这种情况。
     */
    public static final String                KEY3_COPY_2_SLAVE_EXCEPTION                              = "COPY_2_SLAVE_EXCEPTION";

    public static final String                KEY3_COPY_2_SLAVE_EXCEPTION_TIME_CONSUMING_IN_THREADPOOL = "COPY_2_SLAVE_EXCEPTION_TIME_CONSUMING_IN_THREADPOOL";

    /**
     * 记log的时间
     */
    public static final String                KEY3_WRITE_LOG_SUCCESS                                   = "WRITE_LOG_SUCCESS";

    public static final String                KEY3_WRITE_LOG_EXCEPTION                                 = "WRITE_LOG_EXCEPTION";

    //public static final StatMonitor statMonitor = StatMonitor.getInstance();
    public static final StatMonitorSingleHash statMonitor                                              = StatMonitorSingleHash
            .getInstance();
    static {
        statMonitor.start();
    }

    public static void addMonitor(String key1, String key2, String key3, long value1, long value2) {
        //一段时间内插日志库的失败率和平均响应时间
        if (KEY3_WRITE_LOG_SUCCESS.equals(key3)) {
            statMonitor.addStat(key1, "", NagiosUtils.KEY_INSERT_LOGDB_FAIL_RATE, 0);
            statMonitor.addStat(key1, "", NagiosUtils.KEY_INSERT_LOGDB_TIME_AVG, value1);
        } else if (KEY3_WRITE_LOG_EXCEPTION.equals(key3)) {
            statMonitor.addStat(key1, "", NagiosUtils.KEY_INSERT_LOGDB_FAIL_RATE, 1);
        }
        //一段时间内行复制的失败率和平均响应时间
        else if (KEY3_COPY_2_SLAVE_SUCCESS.equals(key3)) {
            statMonitor.addStat(key1, "", NagiosUtils.KEY_REPLICATION_FAIL_RATE, 0);
            statMonitor.addStat(key1, "", NagiosUtils.KEY_REPLICATION_TIME_AVG, value1);
        } else if (KEY3_WRITE_LOG_EXCEPTION.equals(key3)) {
            statMonitor.addStat(key1, "", NagiosUtils.KEY_REPLICATION_FAIL_RATE, 1);
        }
    }

    public static String buildTableKey1(String virtualTableName) {
        return KEY1_TABLE + virtualTableName;
    }

    /**
     * 记录sql
     * 不记录sql
     * 记录前截取sql
     * 记录后截取sql
     * 记录md5
     *
     * 先左后右
     *
     * @param sql
     * @return
     */
    public static String buildExecuteSqlKey2(String sql) {
        switch (recordType) {
            case RECORD_SQL:
                String s = fillTabWithSpace(sql);
                if (left > 0) {
                    s = StringUtil.left(s, left);
                }
                if (right > 0) {
                    s = StringUtil.right(s, right);
                }
                return s;
            case MD5:
                String s1 = fillTabWithSpace(sql);
                if (left > 0) {
                    s1 = StringUtil.left(s1, left);
                }
                if (right > 0) {
                    s1 = StringUtil.right(s1, right);
                }
                String md5 = sqlToMD5Map.get(s1);
                if (md5 != null) {
                    return md5;
                } else {
                    String sqlmd5 = md5Maker.getMD5(s1);
                    StringBuilder sb = new StringBuilder();
                    sb.append("[md5]").append(sqlmd5).append(" [sql]").append(s1);
                    log.warn(sb.toString());
                    sqlToMD5Map.put(s1, sqlmd5);
                    return sqlmd5;
                }
            case NONE:
                return "";
            default:
                throw new IllegalArgumentException("不符合要求的记录log类型! " + recordType);
        }
        //		String md5=sqlToMD5Map.get(sql);
        //		if(md5!=null){
        //			return md5;
        //		}else{
        //			String sqlmd5=md5Maker.getMD5(sql);
        //			StringBuilder sb=new StringBuilder();
        //			sb.append("[md5]").append(sqlmd5).append(" [sql]").append(sql);
        //			log.warn(sb.toString());
        //			sqlToMD5Map.put(sql, sqlmd5);
        //			return sqlmd5;
        //		}

    }

    public static String buildExecuteDBAndTableKey1(String realDSKey, String realTable) {
        StringBuilder sb = new StringBuilder();
        sb.append(KEY1).append("|").append(realDSKey).append("|").append(realTable);
        return sb.toString();
    }

    /**
     * 数据复制过程中需要用到的sql的key
     *
     * @param sql
     * @return
     */
    public static String buildReplicationSqlKey2(String sql) {
        return buildExecuteSqlKey2(sql);
    }

    public static void add(String key1, String key2, String key3, long value1, long value2) {
        MonitorLogUtil.addStat(key1, key2, key3, value1, value2);
        //		StatLog.addStat(APPNAME,key1,key2,key3,value1,value2);
        //statMonitor.addStat(key1, key2, key3, value1);
        //NagiosUtils.addNagiosLog(key1+"_"+key2+"_"+key3, value1);
        addMonitor(key1, key2, key3, value1, value2);
    }

    /*public static void add(String key1, String key2, String key3) {
    	MonitorLog.addStat(key1, key2, key3);
    	StatLog.addStat(APPNAME,key1,key2, key3);
    	//statMonitor.addStat(key1, key2, key3);
    	//NagiosUtils.addNagiosLog(key1+"_"+key2+"_"+key3, 1);
    }*/

    /*public static void add(String key1, String key2, String key3, long value) {
    	MonitorLog.addStatValue2(key1, key2, key3, value);
    	//monitor log应该是value1默认给了1，然后value1/value2,用statLog模拟
    	StatLog.addStat(APPNAME,key1,key2,key3,1,value);
    	//statMonitor.addStat(key1, key2, key3, value);
    	//NagiosUtils.addNagiosLog(key1+"_"+key2+"_"+key3, value);
    }*/

    public static void setAppName(String appname) {
        if (appname != null) {
            APPNAME = appname;
            init();
        }
    }

    /**
     * 将所有/t /s 全部替换为/s
     * @param str
     * @return
     */
    public static String fillTabWithSpace(String str) {
        if (str == null) {
            return null;
        }

        int sz = str.length();
        StringBuilder buffer = new StringBuilder(sz);

        for (int i = 0; i < sz; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                buffer.append(str.charAt(i));
            } else {
                buffer.append(" ");
            }
        }

        return buffer.toString();
    }
}
