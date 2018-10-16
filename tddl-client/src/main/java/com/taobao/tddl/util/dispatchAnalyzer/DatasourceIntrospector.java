package com.taobao.tddl.util.dispatchAnalyzer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.sql.DataSource;

import com.taobao.tddl.client.datasource.keyweight.TDataSourceKeyWeightRandom;
import com.taobao.tddl.client.dispatcher.DatabaseChoicer;
import com.taobao.tddl.client.dispatcher.Result;
import com.taobao.tddl.client.jdbc.TDataSource;
import com.taobao.tddl.rule.ruleengine.entities.retvalue.TargetDB;

public class DatasourceIntrospector {
    /**TDDL封装的数据源 */
    private TDataSource  targetDataSource;
    /**主库的数据源标识 */
    private Map<String, String> primaryDBKeysCache  = new HashMap<String, String>(0);
    /**Failover库的数据源标识 */
    private Map<String, String> failoverDBKeysCache = new HashMap<String, String>(0);


    public void init() {
        Map<String, TDataSourceKeyWeightRandom> keyWeightMapConfig = targetDataSource
                .getKeyWeightMapConfig();
        for (Entry<String, TDataSourceKeyWeightRandom> entry : keyWeightMapConfig.entrySet()) {
            String groupNo = entry.getKey();
            String keys[] = entry.getValue().getDBKeysArray();
            for (int i = 0; i < keys.length; i++) {
                if (i == 0) {
                    primaryDBKeysCache.put(keys[i], groupNo);
                } else {
                    failoverDBKeysCache.put(keys[i], groupNo);
                }
            }
        }
    }


    public DatabaseChoicer getDatabaseChoicer(boolean isWrite) {
        if (isWrite) {
            return targetDataSource.getWriteDispatcher();
        } else {
            return targetDataSource.getReadDispatcher();
        }
    }

    public Map<String, DBMode> getAllTableNamesByLogicTableName(String logicTableName,
                                                                boolean isWrite) {
        DatabaseChoicer databaseChoicer = getDatabaseChoicer(isWrite);
        if (databaseChoicer == null) {
            throw new IllegalArgumentException("The dispatcher is null, isWrite=" + isWrite
                    + ",logicTableName=" + logicTableName);
        }
        Result result = databaseChoicer.getAllDatabasesAndTables(logicTableName);
        if (result == null) {
            throw new IllegalArgumentException("The result is null, isWrite=" + isWrite
                    + ",logicTableName=" + logicTableName);
        }
        List<TargetDB> targetDBs = result.getTarget();
        Map<String, DBMode> tableNames = new HashMap<String, DBMode>(0);
        for (TargetDB targetDB : targetDBs) {
            String dbKey = targetDB.getDbIndex();
            tableNames.put(dbKey, new DBMode(isFailoverDB(dbKey), targetDB.getTableNames()));
        }
        return tableNames;
    }

    /**
     * 根据key即数据库的标识来判定当前是主库模式还是Failover模式
     *
     * @param key 数据库标识
     * @return
     */
    public boolean isFailoverDB(String key) {
        //判断是不是主库
        for (Entry<String, String> primarykeyGroupMap : primaryDBKeysCache.entrySet()) {
            String dbKey0 = primarykeyGroupMap.getKey();
            if (dbKey0.equals(key)) {
                return false;
            }
        }
        //判断是不是failover库
        for (Entry<String, String> failoverKeyGroupMap : failoverDBKeysCache.entrySet()) {
            String dbKey1 = failoverKeyGroupMap.getKey();
            if (dbKey1.equals(key)) {
                return true;
            }
        }
        throw new IllegalArgumentException("The key is not found in the config,key=" + key);
    }

    public DataSource getTargetDataSource() {
        return targetDataSource;
    }

    public void setTargetDataSource(DataSource targetDataSource) {
        try {
            this.targetDataSource = (TDataSource) targetDataSource;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("内省器要求必须使用TDataSource才可以使用", e);
        }
    }



    /**
     * 根据db标识判断是否该db属于failover库
     * 在该db上，某个逻辑表对应的物理表集合
     *
     * @author zhaofeng.wang
     * @version $Id: DatasourceIntrospector.java, v 0.1 2012-3-5 下午02:36:56 zhaofeng.wang Exp $
     */
    public static class DBMode {
        public DBMode(boolean isFailoverDB, Set<String> tableSet) {
            this.isFailoverDB = isFailoverDB;
            this.tableSet = tableSet;
        }
        private boolean     isFailoverDB;
        private Set<String> tableSet;

        /**
         * Setter method for property <tt>isFailoverDB</tt>.
         *
         * @param isFailoverDB value to be assigned to property isFailoverDB
         */
        public void setFailoverDB(boolean isFailoverDB) {
            this.isFailoverDB = isFailoverDB;
        }

        /**
         * Getter method for property <tt>isFailoverDB</tt>.
         *
         * @return property value of isFailoverDB
         */
        public boolean isFailoverDB() {
            return isFailoverDB;
        }

        /**
         * Setter method for property <tt>tableSet</tt>.
         *
         * @param tableSet value to be assigned to property tableSet
         */
        public void setTableSet(Set<String> tableSet) {
            this.tableSet = tableSet;
        }

        /**
         * Getter method for property <tt>tableSet</tt>.
         *
         * @return property value of tableSet
         */
        public Set<String> getTableSet() {
            return tableSet;
        }

    }

}
