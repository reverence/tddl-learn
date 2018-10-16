package com.taobao.tddl.client.jdbc;

import com.taobao.tddl.client.ThreadLocalString;
import com.taobao.tddl.client.controller.RuleController;
import com.taobao.tddl.client.dispatcher.SqlDispatcher;
import com.taobao.tddl.client.jdbc.TDataSourceConfig.HintReplaceType;
import com.taobao.tddl.client.util.ExceptionUtils;
import com.taobao.tddl.client.util.ThreadLocalMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.sql.*;
import java.util.*;
import java.util.concurrent.Executor;

public class TConnection implements Connection {
    private static final Log log = LogFactory.getLog(TConnection.class);
    /**
     * 决定是否记录在真实数据库上执行真实sql的信息 默认关闭
     */
    protected boolean enableProfileRealDBAndTables;
    //private Map<String, DataSource> dataSourcePool;
    private Map<String, DBSelector> dbSelectors;
    private RuleController ruleController;
    private SqlDispatcher writeDispatcher;
    private SqlDispatcher readDispatcher;
    private int retryingTimes;
    private String username;
    private String password;

    // TConnection对象所持有的真正数据库连接
    private Map<String, ConnectionAndDatasource> actualConnections = new HashMap<String, ConnectionAndDatasource>();

    private boolean autoCommit = true;

    private int transactionIsolation = -1;

    private boolean closed;

    private boolean readOnly;

    private boolean txStart;
    private String txTarget;

//	private PoolRandom poolRandom;

    private long timeoutThreshold;

    // TConnection对象创建的所有TStatement对象，包括TPreparedStatement对象
    private Set<TStatement> openStatements = new HashSet<TStatement>();

    private SqlExecuteListener sqlExecuteListener;

    private List<SqlExecuteEvent> sqlExecuteEvents = new ArrayList<SqlExecuteEvent>();

    private boolean sharding = false;

    private boolean isHintReplace = false;

    private HintReplaceType hintReplaceType = HintReplaceType.MY;

    public TConnection() {
    }

    public TConnection(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public DatabaseMetaData getMetaData() throws SQLException {
        checkClosed();

        DatabaseMetaData metaData = new TDatabaseMetaData();
        // DatabaseMetaData目前还不存在元数据的信息，直接返回底层真正数据源的元信息，若没有则返回TDatabaseMetaData()
        // 首先从当前持有的连接中获取
        if(!actualConnections.isEmpty()){
            String dbSelectorIndex = actualConnections.keySet().toArray(new String[0])[0];
            ConnectionAndDatasource cd = getConnectionAndDatasourceByDBSelectorID(dbSelectorIndex);
            try{
                return cd.connection.getMetaData();
            } catch (Exception e){
                log.warn("Meet exception during fetch connection from underlying datasource: ", e);
            }
        }

        // 否则创建连接后获取
        if (!dbSelectors.isEmpty()) {
            String dbSelectorIndex = dbSelectors.keySet().toArray(new String[0])[0];
            TStatement statement = (TStatement) createStatement();
            try {
                statement.createConnectionByID(dbSelectorIndex);
                ConnectionAndDatasource cd = getConnectionAndDatasourceByDBSelectorID(dbSelectorIndex);
                return cd.connection.getMetaData();
            } catch (Exception e){
                log.warn("Meet exception during fetch connection from underlying datasource: ", e);
            } finally {
                statement.close();
            }
        }
        return metaData;
    }

    public boolean getAutoCommit() throws SQLException {
        checkClosed();

        return autoCommit;
    }

    public void setAutoCommit(boolean autoCommit) throws SQLException {
        checkClosed();

        this.autoCommit = autoCommit;
        this.txStart = !autoCommit;

        if (!this.autoCommit) {
            sqlExecuteEvents.clear();
            //added by fanzeng. 用于在每次事务开启之前清除掉缓存的内容
            ThreadLocalMap.put(ThreadLocalString.GET_DB_ORDER_IN_GROUP, null);
        }
        List<SQLException> exceptions = null;
        // 传递auto commit至底层实连接
        for (Map.Entry<String, ConnectionAndDatasource> entry : actualConnections.entrySet()) {
            try {
                Connection con = entry.getValue().connection;
                if(autoCommit != con.getAutoCommit()){
                    con.setAutoCommit(autoCommit);
                }
            } catch (SQLException e) {
                if (exceptions == null) {
                    exceptions = new ArrayList<SQLException>();
                }
                exceptions.add(e);
                log.error(new StringBuilder("data source name: ").append(entry.getKey()).toString(), e);
            }
        }
        ExceptionUtils.throwSQLException(exceptions, null, null);
    }

    public int getTransactionIsolation() throws SQLException {
        checkClosed();

        return transactionIsolation;
    }

    public void setTransactionIsolation(int transactionIsolation) throws SQLException {
        checkClosed();

        this.transactionIsolation = transactionIsolation;
    }

    public Statement createStatement() throws SQLException {
        checkClosed();

        TStatement stmt = new RetryableTStatement(writeDispatcher, readDispatcher);
        stmt.setDataSourcePool(dbSelectors);
        stmt.setRuleController(ruleController);
        stmt.setAutoCommit(autoCommit);
        stmt.setReadOnly(readOnly);
        stmt.setTimeoutThreshold(timeoutThreshold);
        stmt.setConnectionProxy(this);
        stmt.setSqlExecuteListener(sqlExecuteListener);
        stmt.setEnableProfileRealDBAndTables(enableProfileRealDBAndTables);
        stmt.setRetryingTimes(retryingTimes);
//		stmt.setPoolRandom(poolRandom);
        stmt.setSharding(this.sharding);
        stmt.setIsHintReplace(isHintReplace);
        stmt.setHintReplaceType(hintReplaceType);
        openStatements.add(stmt);

        return stmt;
    }

    public Statement createStatement(int resultSetType, int resultSetConcurrency)
            throws SQLException {
        TStatement stmt = (TStatement) createStatement();
        stmt.setResultSetType(resultSetType);
        stmt.setResultSetConcurrency(resultSetConcurrency);
        return stmt;
    }

    public Statement createStatement(int resultSetType,
                                     int resultSetConcurrency, int resultSetHoldability)
            throws SQLException {
        TStatement stmt = (TStatement) createStatement(resultSetType, resultSetConcurrency);

        stmt.setResultSetHoldability(resultSetHoldability);

        return stmt;
    }

    public PreparedStatement prepareStatement(String sql) throws SQLException {
        checkClosed();

        TPreparedStatement stmt = new RetryableTPreparedStatement(writeDispatcher, readDispatcher);
        stmt.setDataSourcePool(dbSelectors);
        stmt.setRuleController(ruleController);
        stmt.setAutoCommit(autoCommit);
        stmt.setReadOnly(readOnly);
        stmt.setTimeoutThreshold(timeoutThreshold);
        stmt.setConnectionProxy(this);
        stmt.setSql(sql);
        stmt.setSqlExecuteListener(sqlExecuteListener);
        stmt.setEnableProfileRealDBAndTables(enableProfileRealDBAndTables);
        stmt.setRetryingTimes(retryingTimes);
//		stmt.setPoolRandom(poolRandom);
        stmt.setSharding(this.sharding);
        stmt.setIsHintReplace(isHintReplace);
        stmt.setHintReplaceType(HintReplaceType.MY);
        openStatements.add(stmt);

        return stmt;
    }

    public PreparedStatement prepareStatement(String sql, int resultSetType,
                                              int resultSetConcurrency) throws SQLException {
        TPreparedStatement stmt = (TPreparedStatement) prepareStatement(sql);

        stmt.setResultSetType(resultSetType);
        stmt.setResultSetConcurrency(resultSetConcurrency);

        return stmt;
    }

    public PreparedStatement prepareStatement(String sql, int resultSetType,
                                              int resultSetConcurrency, int resultSetHoldability)
            throws SQLException {
        TPreparedStatement stmt = (TPreparedStatement) prepareStatement(sql, resultSetType, resultSetConcurrency);

        stmt.setResultSetHoldability(resultSetHoldability);

        return stmt;
    }

    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys)
            throws SQLException {
        TPreparedStatement stmt = (TPreparedStatement) prepareStatement(sql);

        stmt.setAutoGeneratedKeys(autoGeneratedKeys);

        return stmt;
    }

    public PreparedStatement prepareStatement(String sql, int[] columnIndexes)
            throws SQLException {
        TPreparedStatement stmt = (TPreparedStatement) prepareStatement(sql);

        stmt.setColumnIndexes(columnIndexes);

        return stmt;
    }

    public PreparedStatement prepareStatement(String sql, String[] columnNames)
            throws SQLException {
        TPreparedStatement stmt = (TPreparedStatement) prepareStatement(sql);

        stmt.setColumnNames(columnNames);

        return stmt;
    }

    public CallableStatement prepareCall(String sql) throws SQLException {
        throw new UnsupportedOperationException("prepareCall");
    }

    public CallableStatement prepareCall(String sql, int resultSetType,
                                         int resultSetConcurrency) throws SQLException {
        throw new UnsupportedOperationException("prepareCall");
    }

    public CallableStatement prepareCall(String sql, int resultSetType,
                                         int resultSetConcurrency, int resultSetHoldability)
            throws SQLException {
        throw new UnsupportedOperationException("prepareCall");
    }

    public void commit() throws SQLException {
        if (log.isDebugEnabled()) {
            log.debug("invoke commit");
        }

        checkClosed();

        if (autoCommit) {
            return;
        }

        txStart = true;

        List<SQLException> exceptions = null;

        for (Map.Entry<String, ConnectionAndDatasource> entry : actualConnections.entrySet()) {
            try {
                entry.getValue().connection.commit();
            } catch (SQLException e) {
                if (exceptions == null) {
                    exceptions = new ArrayList<SQLException>();
                }
                exceptions.add(e);

                log.error(new StringBuilder("data source name: ").append(entry.getKey()).toString(), e);
            }
        }

        ExceptionUtils.throwSQLException(exceptions, null, null);

        if (sqlExecuteListener != null) {
            sqlExecuteListener.afterTxCommit(sqlExecuteEvents);
            sqlExecuteEvents.clear();
        }
        //added by fanzeng. 用于在每次事务开启之前清除掉缓存的内容
        ThreadLocalMap.put(ThreadLocalString.GET_DB_ORDER_IN_GROUP, null);
    }

    public void rollback() throws SQLException {
        if (log.isDebugEnabled()) {
            log.debug("invoke rollback");
        }

        checkClosed();

        if (autoCommit) {
            return;
        }

        txStart = true;

        List<SQLException> exceptions = null;

        for (Map.Entry<String, ConnectionAndDatasource> entry : actualConnections.entrySet()) {
            try {
                entry.getValue().connection.rollback();
            } catch (SQLException e) {
                if (exceptions == null) {
                    exceptions = new ArrayList<SQLException>();
                }
                exceptions.add(e);

                log.error(new StringBuilder("data source name: ").append(entry.getKey()).toString(), e);
            }
        }

        if (sqlExecuteListener != null) {
            try {
                sqlExecuteListener.afterTxRollback(sqlExecuteEvents);
            } catch (SQLException e) {
                log.error("com.taobao.tddl.client.jdbc.TConnection.rollback(): clear sync log fail!", e);
            }
            sqlExecuteEvents.clear();
        }
        //added by fanzeng. 用于在每次事务开启之前清除掉缓存的内容
        ThreadLocalMap.put(ThreadLocalString.GET_DB_ORDER_IN_GROUP, null);
        ExceptionUtils.throwSQLException(exceptions, null, null);
    }

    public void rollback(Savepoint savepoint) throws SQLException {
        throw new UnsupportedOperationException("rollback");
    }

    public Savepoint setSavepoint() throws SQLException {
        throw new UnsupportedOperationException("setSavepoint");
    }

    public Savepoint setSavepoint(String name) throws SQLException {
        throw new UnsupportedOperationException("setSavepoint");
    }

    public void releaseSavepoint(Savepoint savepoint) throws SQLException {
        throw new UnsupportedOperationException("releaseSavepoint");
    }

    protected void checkClosed() throws SQLException {
        if (closed) {
            throw new SQLException("No operations allowed after connection closed.");
        }
    }

    public boolean isClosed() throws SQLException {
        return closed;
    }

    public void close() throws SQLException {
        if (log.isDebugEnabled()) {
            log.debug("invoke close");
        }

        if (closed) {
            return;
        }

        List<SQLException> exceptions = null;

        try {
            for (TStatement stmt : openStatements) {
                try {
                    //bug fix by shenxun :这里不允许内部调用remove的方法，而在外部显示的调用该方法
                    //引发bug的主要原因是当set里面的size多于1个，并且调用remove方法时会发生这时候HashSet会检查modification.
                    stmt.closeInternal(false);
                } catch (SQLException e) {
                    if (exceptions == null) {
                        exceptions = new ArrayList<SQLException>();
                    }
                    exceptions.add(e);
                }
            }

            for (Map.Entry<String, ConnectionAndDatasource> entry : actualConnections.entrySet()) {
                try {
                    entry.getValue().connection.close();
                } catch (SQLException e) {
                    if (exceptions == null) {
                        exceptions = new ArrayList<SQLException>();
                    }
                    exceptions.add(e);

                    log.error(new StringBuilder("data source name: ").append(entry.getKey()).toString(), e);
                }
            }
        } finally {
            closed = true;
            openStatements.clear();
            actualConnections.clear();
            sqlExecuteEvents.clear();
        }

        ExceptionUtils.throwSQLException(exceptions, null, null);
    }

    public boolean isReadOnly() throws SQLException {
        checkClosed();

        return readOnly;
    }

    public void setReadOnly(boolean readOnly) throws SQLException {
        checkClosed();

        this.readOnly = readOnly;
    }

    public String getCatalog() throws SQLException {
        throw new UnsupportedOperationException("getCatalog");
    }

    public void setCatalog(String catalog) throws SQLException {
        throw new UnsupportedOperationException("setCatalog");
    }

    public int getHoldability() throws SQLException {
        throw new UnsupportedOperationException("getHoldability");
    }

    public void setHoldability(int holdability) throws SQLException {
        throw new UnsupportedOperationException("setHoldability");
    }

    public SQLWarning getWarnings() throws SQLException {
        // TODO:
        return null;
    }

    public void clearWarnings() throws SQLException {
        // TODO:
    }

    public Map<String, Class<?>> getTypeMap() throws SQLException {
        throw new UnsupportedOperationException("getTypeMap");
    }

    public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
        throw new UnsupportedOperationException("setTypeMap");
    }

    public String nativeSQL(String sql) throws SQLException {
        throw new UnsupportedOperationException("nativeSQL");
    }

    public Map<String, DBSelector> getDataSourcePool() {
        return dbSelectors;
    }

    public void setDataSourcePool(Map<String, DBSelector> dbSelectors) {
        this.dbSelectors = dbSelectors;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

/*	public Map<String, ConnectionAndDatasource> getActualConnections() {
        return actualConnections;
	}*/

    public ConnectionAndDatasource getConnectionAndDatasourceByDBSelectorID(String id) {
//		Map<String, ConnectionAndDatasource> connectionAndDatasources = actualConnections;
        ConnectionAndDatasource connectionAndDatasource = actualConnections.get(id);
        return connectionAndDatasource;
    }

    public void put(String key, ConnectionAndDatasource connectionAndDatasource) {
        actualConnections.put(key, connectionAndDatasource);
    }

    public void removeConnectionAndDatasourceByID(String id) {
        ConnectionAndDatasource connectionAndDatasource = actualConnections.remove(id);
        if (connectionAndDatasource == null) {
            log.warn("remove by other object?");
        } else {
            if (connectionAndDatasource.connection == null) {
                log.warn("connection is null");
            } else {
                try {
                    connectionAndDatasource.connection.close();
                } catch (SQLException e) {
                    log.error("Failed to close connection", e);
                }
            }
        }

    }

    public boolean containsID(String id) {
        return actualConnections.containsKey(id);
    }

    public Set<? extends Statement> getOpenStatements() {
        return openStatements;
    }

    public boolean getTxStart() {
        return txStart;
    }

    public void setTxStart(boolean txStart) {
        this.txStart = txStart;
    }

    public int size() {
        return actualConnections.size();
    }

    public boolean isEmpty() {
        return actualConnections.isEmpty();
    }

    public String getTxTarget() {
        return txTarget;
    }

    public void setTxTarget(String txTarget) {
        this.txTarget = txTarget;
    }

    public void setRuleController(RuleController ruleController) {
        this.ruleController = ruleController;
    }

    public void setTimeoutThreshold(long timeoutThreshold) {
        this.timeoutThreshold = timeoutThreshold;
    }

    public void setSqlExecuteListener(SqlExecuteListener sqlExecuteListener) {
        this.sqlExecuteListener = sqlExecuteListener;
    }

    public List<SqlExecuteEvent> getSqlExecuteEvents() {
        return sqlExecuteEvents;
    }

    public void setWriteDispatcher(SqlDispatcher writeDispatcher) {
        this.writeDispatcher = writeDispatcher;
    }

    public void setReadDispatcher(SqlDispatcher readDispatcher) {
        this.readDispatcher = readDispatcher;
    }

    public boolean isEnableProfileRealDBAndTables() {
        return enableProfileRealDBAndTables;
    }

    public void setEnableProfileRealDBAndTables(boolean enableProfileRealDBAndTables) {
        this.enableProfileRealDBAndTables = enableProfileRealDBAndTables;
    }

    public int getRetryingTimes() {
        return retryingTimes;
    }

    public void setRetryingTimes(int retryingTimes) {
        this.retryingTimes = retryingTimes;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Clob createClob() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Blob createBlob() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public NClob createNClob() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SQLXML createSQLXML() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isValid(int timeout) throws SQLException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void setClientInfo(String name, String value)
            throws SQLClientInfoException {
        // TODO Auto-generated method stub

    }

    @Override
    public String getClientInfo(String name) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Properties getClientInfo() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setClientInfo(Properties properties)
            throws SQLClientInfoException {
        // TODO Auto-generated method stub

    }

    @Override
    public Array createArrayOf(String typeName, Object[] elements)
            throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Struct createStruct(String typeName, Object[] attributes)
            throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }


    public boolean isSharding() {
        return sharding;
    }

    public void setSharding(boolean sharding) {
        this.sharding = sharding;
    }

    public boolean isHintReplace() {
        return isHintReplace;
    }

    public void setIsHintReplace(boolean isHintReplace) {
        this.isHintReplace = isHintReplace;
    }

    public HintReplaceType getHintReplaceType() {
        return hintReplaceType;
    }

    public void setHintReplaceType(HintReplaceType hintReplaceType) {
        this.hintReplaceType = hintReplaceType;
    }
}
