package com.taobao.tddl.client.dispatcher.impl;

import com.taobao.tddl.client.dispatcher.Result;
import com.taobao.tddl.rule.ruleengine.entities.retvalue.TargetDB;
import com.taobao.tddl.sqlobjecttree.DMLCommon;
import com.taobao.tddl.sqlobjecttree.GroupFunctionType;

import java.util.List;

public class DatabaseAndTablesDispatcherResultImp implements Result {
	final String logicTableName;
	final List<TargetDB> target;
	
	public List<TargetDB> getTarget() {
		return target;
	}
	public DatabaseAndTablesDispatcherResultImp(List<TargetDB> target
			,String logicTableName) {
		this.target =(List<TargetDB>) target;
		this.logicTableName = logicTableName;
	}
	public String getLogicTableName() {
		return logicTableName;
	}
	public GroupFunctionType getGroupFunctionType() {
		return GroupFunctionType.NORMAL;
	}
	public String getVirtualTableName() {
		return logicTableName;
	}
	public int getMax() {
		return DMLCommon.DEFAULT_SKIP_MAX;
	}
	public int getSkip() {
		return DMLCommon.DEFAULT_SKIP_MAX;
	}
	
}
