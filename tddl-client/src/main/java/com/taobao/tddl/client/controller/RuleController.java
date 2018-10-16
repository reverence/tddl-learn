package com.taobao.tddl.client.controller;

import com.taobao.tddl.common.DBType;
import com.taobao.tddl.common.SqlType;
import com.taobao.tddl.common.exception.checked.TDLCheckedExcption;
import com.taobao.tddl.common.sqljep.function.Comparative;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface RuleController {

	/**
	 * 根据sql获取分库分表信息，必须先设置ruleUrl以后才能正确使用
	 * @param sql
	 * @param args
	 * @return
	 * @throws TDLCheckedExcption
	 */
	public abstract TargetDBMeta getDBAndTables(String sql, List<Object> args)
			throws TDLCheckedExcption;
	public TargetDBMeta getDBAndTables(String sql, List<Object> args,boolean isMysqlSQL)
			throws TDLCheckedExcption;
	public DBType getDBType();
//	public abstract List<Integer> getSplitDbArgsPositions(String sql,
//			boolean isPK);

	/**
	 * 直接指定分库分表列的方式来走规则引擎
	 * @param virtualTableName
	 * @param map
	 * @param sqlType
	 * @return
	 * @throws TDLCheckedExcption
	 */
	public abstract TargetDBMeta getTargetDB(String virtualTableName,
											 Map<String, Comparative> map,SqlType sqlType) throws TDLCheckedExcption;

	/**
	 *	直接指定分库分表
	 * @param virtualTableName
	 * @param ruleID
	 * @param tables
	 * @param sqlType
	 * @return
	 * @throws TDLCheckedExcption
	 */
	public TargetDBMeta getTargetDB(String virtualTableName, String ruleID,
									Set<String> tables, SqlType sqlType) throws TDLCheckedExcption;
	public abstract String getGeneratorUrl();

	public abstract void setGeneratorUrl(String generatorUrl);

	public abstract String getRuleUrl();

	public abstract void setRuleUrl(String ruleUrl);
}