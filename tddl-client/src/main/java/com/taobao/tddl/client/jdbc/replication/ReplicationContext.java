package com.taobao.tddl.client.jdbc.replication;

import java.util.Map;

import com.taobao.tddl.client.jdbc.SqlExecuteEvent;
import com.taobao.tddl.common.sync.RowBasedReplicationContext;

/**
 * 行复制处理流程context，放置中间结果和标志
 *
 * @author linxuan
 *
 */
public interface ReplicationContext {
	SqlExecuteEvent getEvent();
	boolean isDeleteLog();
	Map<String,Object> getMasterRow();

	/**
	 * 如果记录了日志，将日志ID保存。考虑日志分库分表的定位，可能要返回一个对象，
	 * RowBasedReplicationContext就包含这些信息，考虑何其合并
	 * @return
	 */
	long getLogId();

	//这个RowBasedReplicationContext和SqlExecuteEvent怎么界定需要具体考虑
	RowBasedReplicationContext getRowBasedReplicationContext();
}
