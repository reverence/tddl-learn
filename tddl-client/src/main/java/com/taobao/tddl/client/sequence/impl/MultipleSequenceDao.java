/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2011 All Rights Reserved.
 */
package com.taobao.tddl.client.sequence.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.alibaba.common.lang.StringUtil;
import com.taobao.tddl.client.sequence.SequenceException;
import com.taobao.tddl.client.sequence.SequenceRange;
import com.taobao.tddl.client.util.SequenceWeightRandom;

/**
 * 高可用 sequence 的数据源管理器，实现功能如下<br>
 * 1）根据权重随机在多个数据源中选择一个进行获取sequence段<br>
 *    在单次内，如果某个数据源故障，则在其他数据源里随机选择一个提供服务<br>
 *    如果单位时间内异常次数超过一定阈值，就将其置为不可用，并且每隔2s有一个业务线程对其进行重试<br>
 *    如果一次成功，即将该数据源置为可用<br>
 * 2）数据源管理器还包含sequence表以及sequence_log表的字段属性，可根据业务需求进行配置。
 *
 *
 * @author zhaofeng.wang
 * @version $Id: MultipleSequenceDao.java, v 0.1 2011-12-15 下午05:32:06 zhaofeng.wang Exp $
 */
public class MultipleSequenceDao {

    private static final Log               logger                           = LogFactory
            .getLog(MultipleSequenceDao.class);
    /** 默认的数据源个数，为保证高可用，最起码是两个*/
    private final int                      DEFAULT_DATA_SOURCE_NUMBER       = 2;
    /** 数据源个数 */
    private int                            dataSourceNum                    = DEFAULT_DATA_SOURCE_NUMBER;
    /** 数据源的列表 */
    private List<SequenceDataSourceHolder> dataSourceList                   = new ArrayList<SequenceDataSourceHolder>();
    /** log 数据源*/
    private DataSource                     logDataSource;
    /**重试次数*/
    private int                            retryTimes                       = 150;
    /**随机权重 */
    private SequenceWeightRandom           weightRandom;
    /** sequence表名默认值*/
    private static final String            DEFAULT_TABLE_NAME               = "sequence";
    /** sequence log表名默认值*/
    private static final String            DEFAULT_LOG_TABLE_NAME           = "sequence_log";
    /** 以下表结构字段默认值
     * 分别是：sequence名称、sequence当前值、库的标号、最小值、最大值、内步长、创建时间以及修改时间
     */
    private static final String            DEFAULT_NAME_COLUMN_NAME         = "name";
    private static final String            DEFAULT_VALUE_COLUMN_NAME        = "value";
    private static final String            DEFAULT_INDEX_COLUMN_NAME        = "db_index";
    private static final String            DEFAULT_MIN_VALUE_COLUMN_NAME    = "min_value";
    private static final String            DEFAULT_MAX_VALUE_COLUMN_NAME    = "max_value";
    private static final String            DEFAULT_INNER_STEP_COLUMN_NAME   = "step";
    private static final String            DEFAULT_GMT_CREATE_COLUMN_NAME   = "gmt_create";
    private static final String            DEFAULT_GMT_MODIFIED_COLUMN_NAME = "gmt_modified";

    /** 序列所在的表名 默认为 sequence */
    private String                         tableName                        = DEFAULT_TABLE_NAME;
    /** 异步记录log的表名 默认为sequence*/
    private String                         logTableName                     = DEFAULT_LOG_TABLE_NAME;
    /** 存储序列名称的列名 默认为 name */
    private String                         nameColumnName                   = DEFAULT_NAME_COLUMN_NAME;
    /**存储序列值的列名 默认为 value*/
    private String                         valueColumnName                  = DEFAULT_VALUE_COLUMN_NAME;

    /**log库里存储数据库的序列号 默认为 db_index*/
    private String                         indexColumnName                  = DEFAULT_INDEX_COLUMN_NAME;

    /** 最小值的列名 默认为 min_value*/
    private String                         minValueColumnName               = DEFAULT_MIN_VALUE_COLUMN_NAME;
    /** 最大值的列名 默认为max_value*/
    private String                         maxValueColumnName               = DEFAULT_MAX_VALUE_COLUMN_NAME;
    /** 内步长的列名 默认为step*/
    private String                         innerStepColumnName              = DEFAULT_INNER_STEP_COLUMN_NAME;
    /** 创建时间 默认为gmt_create*/
    private String                         gmtCreateColumnName              = DEFAULT_GMT_CREATE_COLUMN_NAME;
    /** 存储序列最后更新时间的列名 默认为 gmt_modified */
    private String                         gmtModifiedColumnName            = DEFAULT_GMT_MODIFIED_COLUMN_NAME;

    /** 调整开关 adjust 默认false*/
    private Boolean                        adjust                           = false;

    /**
     * 查询sequence记录的sql<br>
     * 格式：select value from sequence where name=?
     */
    private String                         selectSql;

    /**
     * 更新sequence记录的sql<br>
     * 格式 update table_name(default：sequence) set value=? ,gmt_modified=? where name= and value=?
     */
    private String                         updateSql;

    /**
     * 插入sequence记录的sql<br>
     * 格式: insert into table_name(default:sequence)(name,value,min_value,max_value,step,gmt_create,gmt_modified) values(?,?,?,?,?,?,?)
     */
    private String                         insertSql;

    /**
     * 获取db里所有sequence记录的sql<br>
     * 格式：select name,value,min_value,max_value,step from sequence
     */
    private String                         selectAllRecordSql;

    /**
     * 根据sequence name获取一条sequence记录<br>
     * 格式：select value,min_value,max_value,step from sequence where name=?
     */
    private String                         selectSeqRecordSql;

    /**
     * 插入异步log的sql<br>
     * 格式: insert into table_name(sequence)(name,value,gmt_create,gmt_modified) values(?,?,?,?)
     */
    private String                         insertLogSql;

    /** MultipleSequenceDao是否已经初始化 */
    private volatile boolean               isInitialize                     = false;

    /**
     * 初始化multiSequenceDao<br>
     * 1）获取数据源的个数；2）生成随机对象； 3）初始化各个数据源包装器的sql等参数 4）如果配置了log库，则初始化异步log库
     * @throws SequenceException
     */
    public synchronized void init() {
        if (!isInitialize) {
            {
                //计算数据源个数
                dataSourceNum = dataSourceList.size();
                if (dataSourceNum <= 0) {
                    throw new IllegalArgumentException("为保证高可用，数据源的个数建议设置多于两个,size="
                            + dataSourceNum);
                }
                weightRandom = new SequenceWeightRandom(dataSourceNum);
                if (logger.isWarnEnabled()) {
                    logger.warn("初始化结束,其中dataSourceNum=" + dataSourceNum);
                }
                //初始化SequenceDataSourceHolder数据源包装器的一些参数
                for (SequenceDataSourceHolder dsHolder : dataSourceList) {
                    dsHolder.setParameters(getTableName(), getSelectSql(), getUpdateSql(),
                            getInsertSql(), adjust);
                }
                if (logDataSource != null) {
                    InsertSequenceLogTask.setParameters(logDataSource, getInsertLogSql());
                } else {
                    logger.warn("该系统没有配置记录 sequence log 的数据源!");
                }
                isInitialize = true;
            }
        }
    }

    /**
     * 初始化sequence的初始值,每个数据源都要去检查一遍，如果不存在就插入一条记录
     *
     * @param sequenceName sequence名称
     * @throws SequenceException
     */
    public void initSequenceRecord(String sequenceName, long minValue, long maxValue, int innerStep)
            throws SequenceException {
        if (!isInitialize) {
            init();
        }
        for (int index = 0; index < dataSourceNum; index++) {
            SequenceDataSourceHolder dsHolder = dataSourceList.get(index);
            dsHolder.initSequenceRecord(index, sequenceName, innerStep, innerStep * dataSourceNum,
                    minValue, maxValue, getValueColumnName());
        }
    }

    /**
     * 获取所有的sequence记录
     *
     * @return
     * @throws SQLException
     */
    public Map<String, Map<String, Object>> getAllSequenceNameRecord() throws SQLException {
        Map<String, Map<String, Object>> sequenceRecordMap = new HashMap<String, Map<String, Object>>(
                0);
        //因为每个数据源里的表 sequence-name列 列值原则上都相同
        for (int i = 0; i < dataSourceList.size(); i++) {
            try {
                SequenceDataSourceHolder dsHolder = dataSourceList.get(i);
                sequenceRecordMap = dsHolder.getAllSequenceRecordName(getSelectAllRecord(),
                        getNameColumnName(), getMinValueColumnName(), getMaxValueColumnName(),
                        getInnerStepColumnName());
                break;
            } catch (Exception e) {
                logger.warn("The " + i + "th datasource failed,", e);
                continue;
            }
        }
        return sequenceRecordMap;
    }

    /**
     * 根据sequenceName来获取一条记录
     *
     * @return
     * @throws SQLException
     * @throws SequenceException
     */
    public Map<String, Map<String, Object>> getSequenceRecordByName(String sequenceName)
            throws SQLException,
            SequenceException {
        Map<String, Map<String, Object>> sequenceRecordMap = new HashMap<String, Map<String, Object>>(
                0);
        //因为每个数据源里的表 sequence-name列 列值原则上都相同，就只取0库既可。
        SequenceDataSourceHolder dsHolder = dataSourceList.get(0);
        sequenceRecordMap = dsHolder.getSequenceRecordByName(getSequenceRecordSql(),
                getMinValueColumnName(), getMaxValueColumnName(), getInnerStepColumnName(),
                sequenceName);
        return sequenceRecordMap;
    }

    /**
     *  获取下一个sequence 段
     *  @param sequenceName sequence名称
     * @see com.taobao.tddl.client.sequence.SequenceDao#nextRange(java.lang.String)
     */
    public synchronized SequenceRange nextRange(String sequenceName, long minValue, long maxValue,
                                                int innerStep) throws SequenceException {

        long begin = System.currentTimeMillis();
        if (StringUtil.isBlank(sequenceName)) {
            throw new IllegalArgumentException("序列表名称不能为空!");
        }
        for (int i = 0; i < retryTimes; i++) {
            List<Integer> excludeIndexes = new ArrayList<Integer>(0);
            for (int j = 0; j < dataSourceNum; j++) {
                //随机选库
                int index = weightRandom.getRandomDataSourceIndex(excludeIndexes);
                if (index == -1) {
                    logger.error("没有可用的数据源了!");
                    break;
                }
                SequenceDataSourceHolder dsHolder = dataSourceList.get(index);
                SequenceRange sequenceRange = null;

                sequenceRange = dsHolder.tryOnSelectedDataSource(index, sequenceName, minValue,
                        maxValue, innerStep, innerStep * dataSourceNum, excludeIndexes);

                if (sequenceRange == null) {
                    logger.warn("重试去取 sequenceRange，第" + (i + 1) + "次尝试!");
                    continue;
                }
                long end = System.currentTimeMillis();
                if (logger.isDebugEnabled()) {
                    logger.debug("访问db-index=" + index + "取sequence段耗时:" + (end - begin) + "ms"
                            + ",min=" + sequenceRange.getMin() + ",max="
                            + sequenceRange.getMax());
                }
                return sequenceRange;
            }
        }
        throw new SequenceException("MultipleSequenceDao没有可用的数据源了,数据源个数dataSourceNum="
                + this.dataSourceNum + ",重试次数retryTimes=" + this.retryTimes);
    }

    /**格式：select value from table_name(default:sequence) where name=? */
    private String getSelectSql() {
        if (selectSql == null) {
            StringBuilder buffer = new StringBuilder();
            buffer.append("select ").append(getValueColumnName());
            buffer.append(" from ").append(getTableName());
            buffer.append(" where ").append(getNameColumnName()).append(" = ?");
            selectSql = buffer.toString();
        }
        return selectSql;
    }

    /**格式：select name,value,min_value,max_value,step from table_name(default:sequence) */
    public String getSelectAllRecord() {
        if (selectAllRecordSql == null) {
            StringBuilder buffer = new StringBuilder();
            buffer.append("select ").append(getNameColumnName()).append(",");
            buffer.append(this.getValueColumnName()).append(",");
            buffer.append(this.getMinValueColumnName()).append(",");
            buffer.append(this.getMaxValueColumnName()).append(",");
            buffer.append(this.getInnerStepColumnName());
            buffer.append(" from ").append(getTableName());
            selectAllRecordSql = buffer.toString();
        }
        return selectAllRecordSql;
    }

    /**格式：select value,min_value,max_value,step from sequence where name=? */
    public String getSequenceRecordSql() {
        if (selectSeqRecordSql == null) {
            StringBuilder buffer = new StringBuilder();
            buffer.append("select ").append(getNameColumnName()).append(",");
            buffer.append(this.getValueColumnName()).append(",");
            buffer.append(this.getMinValueColumnName()).append(",");
            buffer.append(this.getMaxValueColumnName()).append(",");
            buffer.append(this.getInnerStepColumnName());
            buffer.append(" from ").append(getTableName());
            buffer.append(" where ").append(getNameColumnName()).append("= ?");
            selectSeqRecordSql = buffer.toString();
        }
        return selectSeqRecordSql;
    }

    /**格式 update table_name(default：sequence) set value=? ,gmt_modified=? where name=? and value=? */
    private String getUpdateSql() {
        if (updateSql == null) {
            StringBuilder buffer = new StringBuilder();
            buffer.append("update ").append(getTableName());
            buffer.append(" set ").append(getValueColumnName()).append(" = ?, ");
            buffer.append(getGmtModifiedColumnName()).append(" = ? where ");
            buffer.append(getNameColumnName()).append(" = ? and ");
            buffer.append(getValueColumnName()).append("=?");
            updateSql = buffer.toString();
        }
        return updateSql;
    }

    /**格式: insert into table_name(default:sequence)(name,value,min_value,max_value,step,gmt_create,gmt_modified) values(?,?,?,?,?,?,?) */
    private String getInsertSql() {
        if (insertSql == null) {
            StringBuilder buffer = new StringBuilder();
            buffer.append("insert into ").append(getTableName()).append("(");
            buffer.append(getNameColumnName()).append(",");
            buffer.append(getValueColumnName()).append(",");
            buffer.append(getMinValueColumnName()).append(",");
            buffer.append(getMaxValueColumnName()).append(",");
            buffer.append(getInnerStepColumnName()).append(",");
            buffer.append(getGmtCreateColumnName()).append(",");
            buffer.append(getGmtModifiedColumnName()).append(") values(?,?,?,?,?,?,?);");
            insertSql = buffer.toString();
        }
        return insertSql;
    }

    /**格式: insert into log_table_name(default:sequence_log)(name,value,db_index,gmt_create) values(?,?,?,?) */
    private String getInsertLogSql() {
        if (insertLogSql == null) {
            StringBuilder buffer = new StringBuilder();
            buffer.append("insert into ").append(getLogTableName()).append("(");
            buffer.append(getNameColumnName()).append(",");
            buffer.append(getValueColumnName()).append(",");
            buffer.append(getIndexColumnName()).append(",");
            buffer.append(getGmtCreateColumnName()).append(") values(?,?,?,?);");
            insertLogSql = buffer.toString();
        }
        return insertLogSql;
    }

    /**
     * Setter method for property <tt>retryTimes</tt>.
     *
     * @param retryTimes value to be assigned to property retryTimes
     */
    public void setRetryTimes(int retryTimes) {
        this.retryTimes = retryTimes;
    }

    /**
     * Getter method for property <tt>retryTimes</tt>.
     *
     * @return property value of retryTimes
     */
    public int getRetryTimes() {
        return retryTimes;
    }

    /**
     * Getter method for property <tt>dataSourceList</tt>.
     *
     * @return property value of dataSourceList
     */
    public List<SequenceDataSourceHolder> getDataSourceList() {
        return dataSourceList;
    }

    /**
     * Setter method for property <tt>dataSourceList</tt>.
     *
     * @param dataSourceList value to be assigned to property dataSourceList
     */
    public void setDataSourceList(List<DataSource> dataSourceList) {
        if (dataSourceList.size() == 0 || dataSourceList == null) {
            throw new IllegalArgumentException("the dataSourceList is empty!");
        }
        for (DataSource ds : dataSourceList) {
            SequenceDataSourceHolder dsHolder = new SequenceDataSourceHolder(ds);
            this.dataSourceList.add(dsHolder);
        }
    }

    /**
     * Getter method for property <tt>tableName</tt>.
     *
     * @return property value of tableName
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Setter method for property <tt>tableName</tt>.
     *
     * @param tableName value to be assigned to property tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * Getter method for property <tt>nameColumnName</tt>.
     *
     * @return property value of nameColumnName
     */
    public String getNameColumnName() {
        return nameColumnName;
    }

    /**
     * Setter method for property <tt>nameColumnName</tt>.
     *
     * @param nameColumnName value to be assigned to property nameColumnName
     */
    public void setNameColumnName(String nameColumnName) {
        this.nameColumnName = nameColumnName;
    }

    /**
     * Getter method for property <tt>valueColumnName</tt>.
     *
     * @return property value of valueColumnName
     */
    public String getValueColumnName() {
        return valueColumnName;
    }

    /**
     * Setter method for property <tt>valueColumnName</tt>.
     *
     * @param valueColumnName value to be assigned to property valueColumnName
     */
    public void setValueColumnName(String valueColumnName) {
        this.valueColumnName = valueColumnName;
    }

    public String getIndexColumnName() {
        return indexColumnName;
    }

    public void setIndexColumnName(String indexColumnName) {
        this.indexColumnName = indexColumnName;
    }

    /**
     * Getter method for property <tt>gmtModifiedColumnName</tt>.
     *
     * @return property value of gmtModifiedColumnName
     */
    public String getGmtModifiedColumnName() {
        return gmtModifiedColumnName;
    }

    /**
     * Setter method for property <tt>gmtModifiedColumnName</tt>.
     *
     * @param gmtModifiedColumnName value to be assigned to property gmtModifiedColumnName
     */
    public void setGmtModifiedColumnName(String gmtModifiedColumnName) {
        this.gmtModifiedColumnName = gmtModifiedColumnName;
    }

    /**
     * Getter method for property <tt>adjust</tt>.
     *
     * @return property value of adjust
     */
    public Boolean getAdjust() {
        return adjust;
    }

    /**
     * Setter method for property <tt>adjust</tt>.
     *
     * @param adjust value to be assigned to property adjust
     */
    public void setAdjust(Boolean adjust) {
        this.adjust = adjust;
    }

    /**
     * Getter method for property <tt>gmtCreateColumnName</tt>.
     *
     * @return property value of gmtCreateColumnName
     */
    public String getGmtCreateColumnName() {
        return gmtCreateColumnName;
    }

    /**
     * Setter method for property <tt>gmtCreateColumnName</tt>.
     *
     * @param gmtCreateColumnName value to be assigned to property gmtCreateColumnName
     */
    public void setGmtCreateColumnName(String gmtCreateColumnName) {
        this.gmtCreateColumnName = gmtCreateColumnName;
    }

    /**
     * Getter method for property <tt>logDataSource</tt>.
     *
     * @return property value of logDataSource
     */
    public DataSource getLogDataSource() {
        return logDataSource;
    }

    /**
     * Setter method for property <tt>logDataSource</tt>.
     *
     * @param logDataSource value to be assigned to property logDataSource
     */
    public void setLogDataSource(DataSource logDataSource) {
        this.logDataSource = logDataSource;
    }

    /**
     * Setter method for property <tt>insertLogSql</tt>.
     *
     * @param insertLogSql value to be assigned to property insertLogSql
     */
    public void setInsertLogSql(String insertLogSql) {
        this.insertLogSql = insertLogSql;
    }

    /**
     * Setter method for property <tt>logTableName</tt>.
     *
     * @param logTableName value to be assigned to property logTableName
     */
    public void setLogTableName(String logTableName) {
        this.logTableName = logTableName;
    }

    /**
     * Getter method for property <tt>logTableName</tt>.
     *
     * @return property value of logTableName
     */
    public String getLogTableName() {
        return logTableName;
    }

    /**
     * Setter method for property <tt>minValueColumnName</tt>.
     *
     * @param minValueColumnName value to be assigned to property minValueColumnName
     */
    public void setMinValueColumnName(String minValueColumnName) {
        this.minValueColumnName = minValueColumnName;
    }

    /**
     * Getter method for property <tt>minValueColumnName</tt>.
     *
     * @return property value of minValueColumnName
     */
    public String getMinValueColumnName() {
        return minValueColumnName;
    }

    /**
     * Setter method for property <tt>maxValueColumnName</tt>.
     *
     * @param maxValueColumnName value to be assigned to property maxValueColumnName
     */
    public void setMaxValueColumnName(String maxValueColumnName) {
        this.maxValueColumnName = maxValueColumnName;
    }

    /**
     * Getter method for property <tt>maxValueColumnName</tt>.
     *
     * @return property value of maxValueColumnName
     */
    public String getMaxValueColumnName() {
        return maxValueColumnName;
    }

    /**
     * Getter method for property <tt>innerStepColumnName</tt>.
     *
     * @return property value of innerStepColumnName
     */
    public String getInnerStepColumnName() {
        return innerStepColumnName;
    }

    /**
     * Setter method for property <tt>innerStepColumnName</tt>.
     *
     * @param innerStepColumnName value to be assigned to property innerStepColumnName
     */
    public void setInnerStepColumnName(String innerStepColumnName) {
        this.innerStepColumnName = innerStepColumnName;
    }

}
