package com.taobao.tddl.util.IDAndDateCondition.routeCondImp;


import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.taobao.tddl.sqlobjecttree.ColumnValuePairAndMatchRulesIndex;
import com.taobao.tddl.sqlobjecttree.ComparativeMapChoicer;
import com.taobao.tddl.sqlobjecttree.DMLCommon;
import com.taobao.tddl.sqlobjecttree.GroupFunctionType;
import com.taobao.tddl.sqlobjecttree.OrderByEle;
import com.taobao.tddl.sqlobjecttree.OutputHandler;
import com.taobao.tddl.sqlobjecttree.SqlAndTableAtParser;
import com.taobao.tddl.sqlobjecttree.SqlParserResult;

public class DummySqlParcerResult implements SqlParserResult {

    final ComparativeMapChoicer choicer;
    final String logicTableName;
    List<OrderByEle> orderBys = Collections.emptyList();
    List<OrderByEle> groupBys = Collections.emptyList();
    int max = DMLCommon.DEFAULT_SKIP_MAX;
    int skip = DMLCommon.DEFAULT_SKIP_MAX;
    GroupFunctionType groupFunctionType = GroupFunctionType.NORMAL; 
    
    public DummySqlParcerResult(ComparativeMapChoicer choicer, String logicTableName) {
        this.choicer = choicer;
        this.logicTableName = logicTableName;
    }
    
    public DummySqlParcerResult(SimpleCondition simpleCondition) {
    	this.logicTableName = simpleCondition.getVirtualTableName();
    	this.choicer = simpleCondition;
    	this.orderBys = simpleCondition.getOrderBys();
    	this.groupBys = simpleCondition.getGroupBys();
    	this.max = simpleCondition.getMax();
    	this.skip = simpleCondition.getSkip();
    	this.groupFunctionType = simpleCondition.getGroupFunctionType();
    }

    public ColumnValuePairAndMatchRulesIndex getColumnsMapLists(
            List<Object> arguments, List<Set<String>> uniqueKeySetList,
            List<Set<String>> databaseSharedingSetList,
            List<Set<String>> tableShardingSetList) {
        return null;
    }

    public ComparativeMapChoicer getComparativeMapChoicer() {
        return choicer;
    }

    public GroupFunctionType getGroupFuncType() {
        return groupFunctionType;
    }

    public int getMax(List<Object> param) {
        return max;
    }

    public List<OrderByEle> getOrderByEles() {
        return orderBys;
    }

    public int getSkip(List<Object> param) {
        return skip;
    }

    public List<SqlAndTableAtParser> getSqlReadyToRun(Set<String> tables,
            List<Object> args, Number skip, Number max,
            OutputHandler outputType, Map<Integer, Object> modifiedMap) {
        return Collections.emptyList();
    }

    public String getTableName() {
        return logicTableName;
    }

    public List<OrderByEle> getGroupByEles() {
        return groupBys;
    }
}
