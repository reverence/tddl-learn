package com.taobao.tddl.client.jdbc;

import com.taobao.tddl.client.dispatcher.SqlDispatcher;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

public class TGroupDataSource extends TGroupDataSourceConfig implements DataSource, Cloneable {

    protected static final Log logger = LogFactory.getLog(TGroupDataSource.class);

    private static final long DEFAULT_TIMEOUT_THRESHOLD = 100;
    private long timeoutThreshold = DEFAULT_TIMEOUT_THRESHOLD;

    public TDataSourceState state = new TDataSourceState();

    public DataSource getDataSource(String dbIndex) {
        return this.runtimeConfigHolder.get().dbSelectors.get(dbIndex).select();
    }

    public Connection getConnection() throws SQLException {
        TConnection connection = new TConnection();
        buildTconnection(connection);

        return connection;
    }

    private void buildTconnection(TConnection connection) {
        TddlRuntime rt = super.runtimeConfigHolder.get();
        connection.setDataSourcePool(rt == null ? null : rt.dbSelectors);
        connection.setWriteDispatcher(super.writeDispatcher);
        connection.setReadDispatcher(super.readDispatcher);
        connection.setTimeoutThreshold(timeoutThreshold);
        connection.setEnableProfileRealDBAndTables(enableProfileRealDBAndTables);
        connection.setRetryingTimes(retryingTimes);
        connection.setSharding(false);
    }

    public Connection getConnection(String username, String password) throws SQLException {
        TConnection connection = new TConnection(username, password);
        buildTconnection(connection);

        return connection;
    }

    public int getLoginTimeout() throws SQLException {
        throw new UnsupportedOperationException("getLoginTimeout");
    }

    public void setLoginTimeout(int seconds) throws SQLException {
        throw new UnsupportedOperationException("setLoginTimeout");
    }

    public PrintWriter getLogWriter() throws SQLException {
        throw new UnsupportedOperationException("getLogWriter");
    }

    public void setLogWriter(PrintWriter out) throws SQLException {
        throw new UnsupportedOperationException("setLogWriter");
    }

    @Override
    protected TDataSource clone() throws CloneNotSupportedException {
        return (TDataSource) super.clone();
    }

    @Override
    public String toString() {
        return new StringBuilder("{MasterOnly:").append(isMasterOnly).append(",SlaveOnly:")
                .append(this.isSlaveOnly).append(",ReadOnly:").append(this.isReadOnly).append(",sqlExecuteListener:")
                .append("}").toString();
    }

    public void setTimeoutThreshold(long timeoutThreshold) {
        this.timeoutThreshold = timeoutThreshold;
    }

    /**
     * 无逻辑的getter/setter
     */
    public SqlDispatcher getWriteDispatcher() {
        return writeDispatcher;
    }

    public void setWriteDispatcher(SqlDispatcher writeDispatcher) {
        this.writeDispatcher = writeDispatcher;
    }

    public SqlDispatcher getReadDispatcher() {
        return readDispatcher;
    }

    public void setReadDispatcher(SqlDispatcher readDispatcher) {
        this.readDispatcher = readDispatcher;
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
}
