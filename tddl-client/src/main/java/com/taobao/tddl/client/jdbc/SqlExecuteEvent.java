package com.taobao.tddl.client.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import com.taobao.tddl.common.SqlType;

public interface SqlExecuteEvent {
	SqlType getSqlType();
	String getLogicTableName();
	String getPrimaryKeyColumn();
	Object getPrimaryKeyValue();
	String getDatabaseShardColumn();
	Object getDatabaseShardValue();
	String getTableShardColumn();
	Object getTableShardValue();
	JdbcTemplate getSyncLogJdbcTemplate();
	void setSyncLogJdbcTemplate(JdbcTemplate syncLogJdbcTemplate);
	String getSyncLogId();
	void setSyncLogId(String syncLogId);
	boolean isReplicated();
	void setReplicated(boolean replicated);
	String getSql();
	long getAfterMainDBSqlExecuteTime();
	void setAfterMainDBSqlExecuteTime(long afterMainDBSqlExecuteTime);
}
