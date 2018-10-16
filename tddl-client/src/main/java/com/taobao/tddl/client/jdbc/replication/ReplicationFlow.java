package com.taobao.tddl.client.jdbc.replication;

import java.sql.SQLException;
import java.util.List;

import com.taobao.tddl.client.jdbc.SqlExecuteEvent;
import com.taobao.tddl.client.jdbc.SqlExecuteListener;
import com.taobao.tddl.client.jdbc.TDataSource;

/**
 * sql执行各个事件对应要做哪些事情的总控器
 * 可对应一个类似流程定义文件的东西。形式为spring中配置组装action
 *
 * @author linxuan
 *
 */
public class ReplicationFlow implements SqlExecuteListener{

	/**
	 * action和事件的具体阶段怎界定，需要进一步确定。建议action越单纯越好，action不知晓它在那个阶段最好
	 * 它只知道做什么事。整体哪个阶段做什么事情，由ReplicationFlow总控类组装
	 */
//	private List<ReplicationAction> beforeSqlExecuteActions;
//	private List<ReplicationAction> afterSqlExecuteActions;
//	private List<ReplicationAction> afterTxCommitActions;
//	private List<ReplicationAction> afterTxRollbackActions;

//	/**
//     * 是否需要读主库
//     * @return
//     */
//    private boolean isNeedFetchMasterRow;
//
//    /**
//     * 是否需要记录日志
//     * @return
//     */
//    private boolean isNeedProduceLog;


	public void afterSqlExecute(List<SqlExecuteEvent> event) throws SQLException {

	}

	public void afterTxCommit(List<SqlExecuteEvent> events) throws SQLException {
		// TODO Auto-generated method stub

	}

	public void afterTxRollback(List<SqlExecuteEvent> events) throws SQLException {
		// TODO Auto-generated method stub

	}

	public void beforeSqlExecute(List<SqlExecuteEvent> event) throws SQLException {
		// TODO Auto-generated method stub

	}

	public void init(TDataSource config) {
	}

}
