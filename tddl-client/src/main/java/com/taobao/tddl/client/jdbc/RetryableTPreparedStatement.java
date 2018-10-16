package com.taobao.tddl.client.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.taobao.tddl.client.dispatcher.SqlDispatcher;
import com.taobao.tddl.common.operationDBType;

public class RetryableTPreparedStatement extends TPreparedStatement {
    private static final Log logger = LogFactory.getLog(RetryableTPreparedStatement.class);
    public RetryableTPreparedStatement(SqlDispatcher writeDispatcher, SqlDispatcher readDispatcher) {
        super(writeDispatcher, readDispatcher);
    }

    /*	
     * 规范没 说允许update时运行select语句。
     * @Override
    	protected int executeUpdateAndCountAffectRows(String dbSelectorId,
    			String targetSql, RetringContext retringContext,
    			Connection connection, int rows) throws SQLException {
    		try{
    		return super.executeUpdateAndCountAffectRows(dbSelectorId, targetSql,
    				retringContext, connection, rows);
    		}catch (SQLException e) {
    			retringContext.addSQLException(e);
    			validRetryable(retringContext, e);
    			connection = tryToConnectToOtherAvaluableDataSource(dbSelectorId,
    					retringContext, e);
    			return executeUpdateAndCountAffectRows(dbSelectorId, targetSql, retringContext, connection, rows);
    		}
    	}*/
    @Override
    protected void executeQueryAndAddIntoCollection(
            String dbSelectorId,
            String targetSql,
            Map<DataSource, SQLException> failedDataSources,
            Connection connection,
            List<ResultSet> actualResultSets)
            throws SQLException {
        try {
            super.executeQueryAndAddIntoCollection(dbSelectorId, targetSql, failedDataSources,
                    connection, actualResultSets);
        } catch (SQLException e) {
            logger
                    .warn("tddl欲进入读重试状态，重复执行executeQueryAndAddIntoCollection()方法, targetSql="
                            + targetSql);
            validRetryable(dbSelectorId, e, operationDBType.readFromDb);
            if (failedDataSources != null) {
                ConnectionAndDatasource connectionAndDatasource = getConnectionProxy()
                        .getConnectionAndDatasourceByDBSelectorID(dbSelectorId);
                failedDataSources.put(connectionAndDatasource.parentDataSource, e);
            } else {
                //当在事务中时不需要重试，failedDataSources为null 值，直接将异常抛出
                //added by fanzeng.
                logger.warn("事务中failedDataSources=null, tddl并未进入读重试状态,targetSql=" + targetSql);
                throw e;
            }
            //为什么不现在判断是否为非fatal后抛出，而要退后，这样影响阅读和理解
            connection = tryToConnectToOtherAvailableDataSource(dbSelectorId, failedDataSources);
            executeQueryAndAddIntoCollection(dbSelectorId, targetSql, failedDataSources,
                    connection, actualResultSets);
        }

    }

    /**
     * 写库重试
     */
    @Override
    protected int executeUpdateAndCountAffectRows(String dbSelectorId, String targetSql,
                                                  Map<DataSource, SQLException> failedDataSources,
                                                  Connection connection, int rows, List<ResultSet> actualGeneratedKeys)
            throws SQLException {
        try {
            rows = super.executeUpdateAndCountAffectRows(dbSelectorId, targetSql,
                    failedDataSources, connection, rows, actualGeneratedKeys);
        } catch (SQLException e) {
            logger.warn("sql执行失败,targetSql=" + targetSql);
            throw e;
            /* validRetryable(dbSelectorId, e, operationDBType.writeIntoDb);
             if (failedDataSources != null) {
                 ConnectionAndDatasource connectionAndDatasource = getConnectionProxy()
                     .getConnectionAndDatasourceByDBSelectorID(dbSelectorId);
                 failedDataSources.put(connectionAndDatasource.parentDataSource, e);
             } else {
                 //在事务中不需要重试，failedDataSources为null值，直接将异常抛出
                 //added by fanzeng.
                 logger.warn("事务中failedDataSources=null， tddl并未进入写重试状态,targetSql=" + targetSql);
                 throw e;
             }
             //为什么不现在判断是否为非fatal后抛出，而要退后，这样影响阅读和理解
             connection = tryToConnectToOtherAvailableDataSource(dbSelectorId, failedDataSources);
             rows = executeUpdateAndCountAffectRows(dbSelectorId, targetSql, failedDataSources,
                 connection, rows);*/
        }
        return rows;
    }

}
