package com.taobao.tddl.client.sequence.impl;

import com.taobao.tddl.client.ThreadLocalString;
import com.taobao.tddl.client.dispatcher.DispatcherResult;
import com.taobao.tddl.client.dispatcher.SqlDispatcher;
import com.taobao.tddl.client.jdbc.TDataSource;
import com.taobao.tddl.client.sequence.SequenceException;
import com.taobao.tddl.client.sequence.ShardingSequenceRange;
import com.taobao.tddl.client.util.ThreadLocalMap;
import com.taobao.tddl.common.DBType;
import com.taobao.tddl.common.sqljep.function.Comparative;
import com.taobao.tddl.common.sqljep.function.In;
import com.taobao.tddl.rule.ruleengine.entities.retvalue.TargetDB;
import com.taobao.tddl.util.IDAndDateCondition.routeCondImp.SimpleCondition;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.InitializingBean;

import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhengjiaqing878 [ http://jiaqing.me ]
 * @version $Id: ShardingSequence.java, v 0.1 2016年1月19日 上午11:15:17 zhengjiaqing Exp $
 */
public class ShardingSequence implements InitializingBean {
    private static final Log                         logger          = LogFactory
            .getLog(ShardingSequence.class);

    //~~~框架内部属性：

    /** 分段锁的个数 */
    private final int                                segmentNum      = 100;
    /** 分段锁，用于支持多个分表的并发操作 */
    private final Map<Long, Lock>                    lockSegments    = new ConcurrentHashMap<Long, Lock>(
            segmentNum);
    /** 维护每个Sequence分表对应的ShardingSequenceRange，key=Sequence分表真实表名(actualTableName) */
    private final Map<String, ShardingSequenceRange> rangeMapping    = new ConcurrentHashMap<String, ShardingSequenceRange>(
            segmentNum * 2);
    /** DAL数据源 */
    private TDataSource                              dataSource;
    /** 写请求分发器 */
    private SqlDispatcher                            wDispatcher;
    /** 框架识别的DB类型 */
    private DBType                                   sysDBType;

    //~~~用户定义属性：

    /** 业务定义的分库分表键名称，默认user_id，大小写无关 */
    private String                                   shardingKeyName = "user_id";
    /** sequence表名，默认LUDAL_SEQUENCE，大小写无关 */
    private String                                   seqTableName    = "LUDAL_SEQUENCE";
    /** sequence名称，默认是找不到的，大小写无关 */
    private String                                   sequenceName    = "no_sequence";
    /** 数据库类型，默认mysql，大小写无关 */
    private String                                   dbType          = "mysql";
    /** DAO */
    private ShardingSequenceDAO                      sequenceDAO;

    // 目前不打算让应用的配置项设置这些参数：
    //  /** 允许的最大值 */
    //  private long                                     maxValue     = 99999999L;
    //  /** 允许的最小值 */
    //  private long                                     minValue     = 0L;
    //  /** 缓存大小 */
    //  private int                                      cacheSize    = 100;

    /**
     *
     */
    public ShardingSequence() {
        // 初始化分段锁
        for (int i = 0; i < segmentNum; i++) {
            lockSegments.put(new Long(i), new ReentrantLock());
        }
    }

    /**
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        this.dataSource = this.sequenceDAO.getDataSource();
        this.wDispatcher = this.dataSource.getWriteDispatcher();
        this.sysDBType = DBType.valueOfString(this.dbType);

        // 初始参数检查
        if (dataSource == null || wDispatcher == null || sysDBType == null
                || shardingKeyName == null || shardingKeyName.trim().equals("") || seqTableName == null
                || seqTableName.trim().equals("") || sequenceName == null
                || sequenceName.trim().equals("") || sequenceDAO == null) {
            throw new IllegalArgumentException("Illegal args in ShardingSequence: " + toString());
        }

        logger.info("[TDDL]init finished. args=" + toString());
    }

    /**
     * 获取唯一序列号。
     * <p>
     * 框架返回由[两位年+两位月+两位日+两位预留位+两位分表位+八位数字序列]组成的唯一序列号，在相同的{@link #sequenceName}下保证每次获取的唯一性。
     *
     * @param shardingKey           业务上的分库分表拆分键，大于等于0的数字
     * @return                      唯一序列号，[两位年+两位月+两位日+两位预留位+两位分表位+八位数字序列]，固定长度18位
     * @throws SequenceException    获取Sequence失败抛出该异常
     */
    public long nextValue(long shardingKey) throws SequenceException {
        // 0. 检查
        if (shardingKey < 0) {
            throw new SequenceException("Illegal args: shardingKey=" + shardingKey);
        }

        /*Transaction trx = Cat.newTransaction("TDDL", "sequence.nextValue");
        trx.addData("shardingKey", shardingKey);
        trx.setStatus(Message.SUCCESS);*/

        // 1. 设定路由上下文
        Calendar now = Calendar.getInstance(); // 请求时间，以此为准
        SimpleCondition rc = new SimpleCondition();
        rc.setDBType(this.sysDBType);
        rc.setVirtualTableName(this.seqTableName);
        rc.put(this.shardingKeyName, new Comparative(3, shardingKey));
        ThreadLocalMap.put(ThreadLocalString.ROUTE_CONDITION, rc);

        // 2. 获取每个数据段并组装成最终序列返回
        try {
            DecimalFormat _2 = new DecimalFormat("00");
            DecimalFormat _8 = new DecimalFormat("00000000");

            Map<String,String> map = getActualDbAndTableName(shardingKey);
            String tableName = map.get("tb");
            String _yy = (now.get(Calendar.YEAR) + "").substring(2); // 两位年
            String yy = _2.format(Integer.valueOf(_yy));
            String _mm = now.get(Calendar.MONTH) + 1 + ""; // 两位月
            String mm = _2.format(Integer.valueOf(_mm));
            String _dd = now.get(Calendar.DAY_OF_MONTH) + ""; // 两位日
            String dd = _2.format(Integer.valueOf(_dd));

            String dbName = map.get("db");
            int id = dbName.indexOf("_");
            if (id == -1 || id >= dbName.length()) {
                throw new SequenceException("sequence db name not match, name=" + dbName);
            }
            String _db = dbName.substring(0,id);
            int i = 0;
            for(i=0;i<_db.length();i++){
                if(_db.charAt(i)>='0' && _db.charAt(i)<='9'){
                    break;
                }
            }
            if(i==_db.length()){
                throw new SequenceException("sequence db name not match, name=" + dbName);
            }
            _db = _db.substring(i);
            Integer idb = 0;
            try {
                idb = Integer.valueOf(_db);
            } catch (NumberFormatException e) {
                throw new SequenceException("sequence db name not match, name=" + dbName);
            }
            String db = _2.format(idb);

            // 下面是两位分表位的计算
            int index = tableName.lastIndexOf("_");
            if (index == -1 || index >= tableName.length()) {
                throw new SequenceException("sequence table name not match, name=" + tableName);
            }
            String _tb = tableName.substring(index + 1);
            Integer itb = 0;
            try {
                itb = Integer.valueOf(_tb);
            } catch (NumberFormatException e) {
                throw new SequenceException("sequence table name not match, name=" + tableName);
            }
            String tb = _2.format(itb);

            long _seq = nextSeqValue(itb,idb,tableName,dbName); // 八位数字序列
            String seq = _8.format(_seq);
            return Long.valueOf(yy + mm + dd + db + tb + seq); // 两位年+两位月+两位日+两位预留位+两位分表位+八位数字序列
        } catch (SequenceException e) {
            //trx.setStatus(e);
            throw e;
        } catch (Throwable e) {
            //trx.setStatus(e);
            throw new SequenceException("get sequence fail", e);
        } finally {
            // 3.释放路由上下文
            ThreadLocalMap.remove(ThreadLocalString.ROUTE_CONDITION);
            //trx.complete();
        }
    }

    /**
     * 获取当前请求的分表名。
     *
     * @param shardingKey
     * @return              当前请求对应的Sequence真实表名
     */
    private Map<String,String> getActualDbAndTableName(long shardingKey) throws SequenceException {
        SimpleCondition rc = (SimpleCondition) ThreadLocalMap
                .get(ThreadLocalString.ROUTE_CONDITION);

        DispatcherResult meta = null;
        try {
            meta = wDispatcher.getDBAndTables(rc); // 通过“写规则”获取真实表名
        } catch (Exception e) {
            throw new SequenceException("get db and table rule fail, shardingKey=" + shardingKey, e);
        }

        List<TargetDB> targets = meta.getTarget();
        if (targets == null || targets.size() != 1) { // 只能对应一个库
            int size = -1;
            if (targets != null) {
                size = targets.size();
            }
            throw new SequenceException("target db not match, shardingKey=" + shardingKey
                    + ", targetDB=" + size);
        }
        TargetDB target = targets.get(0);
        Set<String> names = target.getTableNames();
        if (names == null || names.size() != 1) { // 只能对应一个表
            int size = -1;
            if (names != null) {
                size = names.size();
            }
            throw new SequenceException("target table not match, shardingKey=" + shardingKey
                    + ", tableNames=" + size);
        }

        String tb = names.iterator().next();
        String db = target.getDbIndex();
        Map<String,String> map = new HashMap<String, String>();
        map.put("tb",tb);
        map.put("db",db);
        return map;
    }

    /**
     * 获取数字序列。
     * <p>
     * 关于并发的考虑：
     * <li>先通过分表位计算所在的分段锁，通过分段锁保证一个分表在统一时刻只能有一个线程进行初始化/获取序列
     * <li>对一个序列段的获取操作（sequenceDAO.nextRange），由JDBC事务保证
     * <li>对一个序列的获取操作（currentRange.getAndIncrement），由AtomicLong保证
     *
     * @param itb           分表位
     * @param tableName     真实表名
     * @return              八位数字序列
     * @throws SequenceException
     */
    private long nextSeqValue(int itb,int idb,String tableName,String dbName) throws SequenceException {
        // 1.根据分库分表位计算分段锁索引
        long lockIndex = (idb*10+itb)%segmentNum;

        // 2.获取对应ShardingSequenceRange
        ShardingSequenceRange currentRange = rangeMapping.get(dbName+tableName);
        if (currentRange == null) {
            Lock lock = lockSegments.get(lockIndex);
            lock.lock();
            try {
                if (currentRange == null) {
                    currentRange = sequenceDAO.nextRange(sequenceName, seqTableName);
                    rangeMapping.put(dbName+tableName, currentRange);
                }
            } finally {
                lock.unlock();
            }
        }

        // 3.获取数字序列
        long value = currentRange.getAndIncrement();
        if (value == -1) {
            Lock lock = lockSegments.get(lockIndex);
            lock.lock();
            try {
                for (;;) {
                    if (currentRange.isOver()) {
                        currentRange = sequenceDAO.nextRange(sequenceName, seqTableName);
                        rangeMapping.put(tableName, currentRange);
                    }

                    value = currentRange.getAndIncrement();
                    if (value == -1) {
                        continue;
                    }

                    break; // 拿到值即跳出
                }
            } finally {
                lock.unlock();
            }
        }

        if (value < 0) {
            throw new SequenceException("Sequence value overflow, value = " + value);
        }

        return value;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("shardingKeyName=" + this.shardingKeyName);
        sb.append(",seqTableName=" + this.seqTableName);
        sb.append(",sequenceName=" + this.sequenceName);
        sb.append(",dbType=" + this.dbType);
        sb.append(",dataSource=" + this.dataSource);
        sb.append(",sequenceDAO=" + this.sequenceDAO);
        return sb.toString();
    }

    //~~~ getter and setters:

    /**
     * Getter method for property <tt>shardingKeyName</tt>.
     *
     * @return property value of shardingKeyName
     */
    public String getShardingKeyName() {
        return shardingKeyName;
    }

    /**
     * Setter method for property <tt>shardingKeyName</tt>.
     *
     * @param shardingKeyName value to be assigned to property shardingKeyName
     */
    public void setShardingKeyName(String shardingKeyName) {
        this.shardingKeyName = shardingKeyName;
    }

    /**
     * Getter method for property <tt>sequenceName</tt>.
     *
     * @return property value of sequenceName
     */
    public String getSequenceName() {
        return sequenceName;
    }

    /**
     * Setter method for property <tt>sequenceName</tt>.
     *
     * @param sequenceName value to be assigned to property sequenceName
     */
    public void setSequenceName(String sequenceName) {
        this.sequenceName = sequenceName;
    }

    /**
     * Getter method for property <tt>sequenceDAO</tt>.
     *
     * @return property value of sequenceDAO
     */
    public ShardingSequenceDAO getSequenceDAO() {
        return sequenceDAO;
    }

    /**
     * Setter method for property <tt>sequenceDAO</tt>.
     *
     * @param sequenceDAO value to be assigned to property sequenceDAO
     */
    public void setSequenceDAO(ShardingSequenceDAO sequenceDAO) {
        this.sequenceDAO = sequenceDAO;
    }

    /**
     * Getter method for property <tt>dataSource</tt>.
     *
     * @return property value of dataSource
     */
    public TDataSource getDataSource() {
        return dataSource;
    }

    /**
     * Getter method for property <tt>dbType</tt>.
     *
     * @return property value of dbType
     */
    public String getDbType() {
        return dbType;
    }

    /**
     * Setter method for property <tt>dbType</tt>.
     *
     * @param dbType value to be assigned to property dbType
     */
    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    /**
     * Getter method for property <tt>seqTableName</tt>.
     *
     * @return property value of seqTableName
     */
    public String getSeqTableName() {
        return seqTableName;
    }

    /**
     * Setter method for property <tt>seqTableName</tt>.
     *
     * @param seqTableName value to be assigned to property seqTableName
     */
    public void setSeqTableName(String seqTableName) {
        this.seqTableName = seqTableName;
    }
}