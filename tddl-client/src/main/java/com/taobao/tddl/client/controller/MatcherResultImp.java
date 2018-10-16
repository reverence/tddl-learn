package com.taobao.tddl.client.controller;

import com.taobao.tddl.common.sqljep.function.Comparative;
import com.taobao.tddl.rule.ruleengine.entities.retvalue.TargetDB;

import java.util.List;
import java.util.Map;

public class MatcherResultImp implements MatcherResult{
	List<TargetDB> calculationResult;
	Map<String, Comparative> databaseComparativeMap;
	Map<String, Comparative> tableComparativeMap;
	
	public void setCalculationResult(List<TargetDB> calculationResult) {
		this.calculationResult = calculationResult;
	}

	public void setDatabaseComparativeMap(
			Map<String, Comparative> databaseComparativeMap) {
		this.databaseComparativeMap = databaseComparativeMap;
	}

	public void setTableComparativeMap(Map<String, Comparative> tableComparativeMap) {
		this.tableComparativeMap = tableComparativeMap;
	}

	public List<TargetDB> getCalculationResult() {
		return calculationResult;
	}

	public Map<String, Comparative> getDatabaseComparativeMap() {
		return databaseComparativeMap;
	}

	public Map<String, Comparative> getTableComparativeMap() {
		return tableComparativeMap;
	}

}
