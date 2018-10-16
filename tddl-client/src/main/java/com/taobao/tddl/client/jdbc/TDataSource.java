package com.taobao.tddl.client.jdbc;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.List;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.taobao.tddl.client.controller.RuleController;
import com.taobao.tddl.client.dispatcher.SqlDispatcher;
import com.taobao.tddl.client.jdbc.replication.ReplicationConfig;
import com.taobao.tddl.client.jdbc.replication.RowBasedReplicationListener;
import com.taobao.tddl.rule.bean.DatabaseBasedMapping;

public class TDataSource extends TDataSourceConfig implements DataSource, Cloneable {

	protected static final Log logger                      = LogFactory.getLog(TDataSource.class);
	private static final long DEFAULT_TIMEOUT_THRESHOLD = 100;
	private static DataSource indexMappingCacheDatasource = null;
	private long timeoutThreshold = DEFAULT_TIMEOUT_THRESHOLD;
	private ReplicationConfig replicationConfig;
	private String replicationConfigFile; //新本地文件配置

	public DataSource getDataSource(String dbIndex){
		return this.runtimeConfigHolder.get().dbSelectors.get(dbIndex).select();
	}

	public TDataSourceState state = new TDataSourceState();

	protected void postInit() {
		super.postInit();

		if (this.mappingHandlers != null) {
			//针对IC将路由表分库分表并且放在读库的情况做的特殊处理！！！
			List<DatabaseBasedMapping> handlers = this.mappingHandlers.get();
			if (handlers != null) {
				DataSource slaveds = cloneReplicationSlave();
				for(DatabaseBasedMapping dbMapping: handlers){
					dbMapping.setRouteDatasource(slaveds);
				}
			}
		}

		if (this.isHandleReplication || this.sqlExecuteListener != null
				&& this.sqlExecuteListener instanceof RowBasedReplicationListener) {
			this.replicationConfig = new ReplicationConfig();
			this.replicationConfig.setAppName(this.getAppName());
			this.replicationConfig.setUseLocalConfig(this.isUseLocalConfig());
			this.replicationConfig.setReplicationConfigFile(this.replicationConfigFile);
			this.replicationConfig.init(this);
		}
		if (this.sqlExecuteListener != null) {
			this.sqlExecuteListener.init(this);
		}
	}

	public TDataSource cloneReplicationMaster() {
		TDataSource master4replication;
		try {
			master4replication = this.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(e);
		}
		master4replication.setSqlExecuteListener(null); //关闭行复制
		master4replication.setWriteDispatcher(null);
		master4replication.setReadDispatcher(this.writeDispatcher); //只读主库
		//TODO 将规则中的needRowCopy都设置为false？只读，不会有update语句
		return master4replication;
	}

	public TDataSource cloneReplicationSlave() {
		TDataSource slave4replication;
		try {
			slave4replication = this.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(e);
		}
		slave4replication.setSqlExecuteListener(null); //关闭行复制
		slave4replication.setWriteDispatcher(this.readDispatcher);
		slave4replication.setReadDispatcher(this.readDispatcher); //读写都到slave库
		return slave4replication;
	}

	public Connection getConnection() throws SQLException {
		TConnection connection = new TConnection();
		buildTconnection(connection);

		return connection;
	}

	private void buildTconnection(TConnection connection) {
		TddlRuntime rt = super.runtimeConfigHolder.get();
		connection.setDataSourcePool(rt == null ? null : rt.dbSelectors);
		connection.setRuleController(super.ruleController);
		connection.setWriteDispatcher(super.writeDispatcher);
		connection.setReadDispatcher(super.readDispatcher);
		connection.setTimeoutThreshold(timeoutThreshold);
		connection.setSqlExecuteListener(sqlExecuteListener);
		connection.setEnableProfileRealDBAndTables(enableProfileRealDBAndTables);
		connection.setRetryingTimes(retryingTimes);
		connection.setSharding(true);
		connection.setIsHintReplace(isHintReplaceSupport());
		connection.setHintReplaceType(getHintReplaceType());
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

	public String getGeneratorUrl() {
		if(ruleController != null)
			return ruleController.getGeneratorUrl();
		else
			return null;
	}

	@Override
	protected TDataSource clone() throws CloneNotSupportedException {
		return (TDataSource)super.clone();
	}

	@Override
	public String toString() {
		return new StringBuilder("{MasterOnly:").append(isMasterOnly).append(",SlaveOnly:")
				.append(this.isSlaveOnly).append(",ReadOnly:").append(this.isReadOnly).append(",sqlExecuteListener:")
				.append(this.sqlExecuteListener).append("}").toString();
	}

	public void setGeneratorUrl(String generatorUrl) {
		if(ruleController != null)
			ruleController.setGeneratorUrl(generatorUrl);
	}

	public void setRuleController(RuleController ruleController) {
		this.ruleController = ruleController;
	}

	public void setTimeoutThreshold(long timeoutThreshold) {
		this.timeoutThreshold = timeoutThreshold;
	}

	public static DataSource getIndexMappingCacheDatasource() {
		return indexMappingCacheDatasource;
	}

	public static void setIndexMappingCacheDatasource(
			DataSource indexMappingCacheDatasource) {
		TDataSource.indexMappingCacheDatasource = indexMappingCacheDatasource;
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

	public ReplicationConfig getReplicationConfig() {
		return replicationConfig;
	}

	/*public void setReplicationConfig(ReplicationConfig replicationConfig) {
		this.replicationConfig = replicationConfig;
	}*/
	public void setReplicationConfigFile(String replicationConfigFile) {
		this.replicationConfigFile = replicationConfigFile;
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
