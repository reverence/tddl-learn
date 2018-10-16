package com.taobao.tddl.util.IDAndDateCondition.routeCondImp;

import java.util.HashSet;
import java.util.Set;

import com.taobao.tddl.client.RouteCondition;
import com.taobao.tddl.common.DBType;
import com.taobao.tddl.common.exception.checked.TDLCheckedExcption;
import com.taobao.tddl.common.exception.runtime.NotSupportException;
import com.taobao.tddl.rule.ruleengine.DBRuleProvider;
import com.taobao.tddl.rule.ruleengine.entities.retvalue.TargetDBMetaData;


public class DirectlyRouteCondition implements RouteCondition{
	DBType dbType ;

	Set<String> tables = new HashSet<String>(2);
	String virtualTableName;
	String dbRuleID;
	public Set<String> getTables() {
		if(tables.size()!=0){
			return tables;
		}else{
			//如果没有指定替换后表名，则默认使用虚拟表名
			tables.add(virtualTableName);
			return tables;
		}
	}

	public TargetDBMetaData visit(DBRuleProvider provider) throws TDLCheckedExcption {
		throw new NotSupportException("not support yet");
	}
	public void setDBType(DBType dbType) {
		this.dbType = dbType;
	}

	public DBType getDBType() {
		return dbType;
	}

	public void setTables(Set<String> tables) {
		this.tables = tables;
	}

	public void addATable(String table){
		tables.add(table);
	}
	public String getVirtualTableName() {
		return virtualTableName;
	}
	/**
	 * 虚拟表名
	 * @param virtualTableName
	 */
	public void setVirtualTableName(String virtualTableName){
		this.virtualTableName=virtualTableName;
	}
	public String getDbRuleID() {
		return dbRuleID;
	}
	/**
	 * 对应你在规则文件中每一个rule都会要求指定的那个id
	 * @param dbRuleID
	 */
	public void setDbRuleID(String dbRuleID) {
		this.dbRuleID = dbRuleID;
	}


}
