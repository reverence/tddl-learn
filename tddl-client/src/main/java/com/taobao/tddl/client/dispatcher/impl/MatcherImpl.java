//package com.taobao.tddl.client.dispatcher.impl;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//import com.taobao.tddl.client.controller.DispatcherResultImp;
//import com.taobao.tddl.client.controller.OrderByMessages;
//import com.taobao.tddl.client.controller.OrderByMessagesImp;
//import com.taobao.tddl.client.dispatcher.DispatcherResult;
//import com.taobao.tddl.client.dispatcher.Matcher;
//import com.taobao.tddl.client.dispatcher.RouteRule;
//import com.taobao.tddl.common.sqljep.function.Comparative;
//import com.taobao.tddl.rule.LogicTableRule;
//import com.taobao.tddl.rule.ruleengine.entities.retvalue.PartitionElement;
//import com.taobao.tddl.rule.ruleengine.entities.retvalue.TargetDB;
//import com.taobao.tddl.sqlobjecttree.GroupFunctionType;
//import com.taobao.tddl.sqlobjecttree.SqlParserResult;
//
//public class MatcherImpl implements Matcher {
//
//	public DispatcherResult match(SqlParserResult pr, List<Object> args, LogicTableRule logicTableRule) {
//		PartitionElement part = logicTableRule.getPartitionElement(); //从规则得到分库分表字段信息
//		//从解析结果中选取分库分表字段相关的信息Map<String, Comparative> peconditions
//		Set<String> tempSet = new HashSet<String>(part.getDbFirstElement().size() + part.getPkFirstElement().size()
//				+ part.getTabFirstElement().size());
//		tempSet.addAll(part.getDbFirstElement());
//		tempSet.addAll(part.getPkFirstElement());
//		tempSet.addAll(part.getTabFirstElement());
//		Map<String, Comparative> peconditions = pr.getColumnsMap(args, tempSet);
//
//		//匹配
//
//		//处理分库规则链
//		List<String> dbIndexs = null;
//		RouteRule[] rules = ((LogicTableRuleImpl)logicTableRule).getDbRouteRules();
//		for (RouteRule rule : rules) {
//			if (isMatch(rule.getRouteFields(), peconditions)) {
//				dbIndexs = rule.getIndex(peconditions);
//			}
//		}
//
//		if (dbIndexs == null) {
//			//TODO
//		}
//		List<TargetDB> targetdbs = new ArrayList<TargetDB>(dbIndexs.size());
//
//		//TODO 一个库上的表，不要把其他库的也拿来，这个是如何过滤的？ defaultTableRange？
//		//取得分库结果以后，在一个具体的库上应用分表规则时，应该把这个库下的分表值范围缩小的这个库上
//		for (String dbIndex : dbIndexs) {
//			TargetDB targetDB = new TargetDB();
//			targetDB.setDbIndex(dbIndex);
//			List<String> tbIndexs = null;
//			for (RouteRule rule : ((LogicTableRuleImpl)logicTableRule).getTableRoutes(dbIndex)) {
//				if (isMatch(rule.getRouteFields(), peconditions)) {
//					tbIndexs = rule.getIndex(peconditions);
//				}
//			}
//			Set<String> tableNames = new HashSet<String>();
//			intersection(((LogicTableRuleImpl)logicTableRule).getDbIndex2tbIndex().get(dbIndex), tbIndexs, tableNames);
//			targetDB.setTableNames(tableNames);
//			targetdbs.add(targetDB);
//		}
//
//		//组装DispatcherResult -- 取自规则中的
//		String virtualTableName = pr.getTableName();
//		boolean needRowCopy = logicTableRule.isNeedRowCopy();
//		boolean allowReverseOutput = logicTableRule.isAllowReverseOutput();
//
//		//组装DispatcherResult -- 取自解析结果的
//		int skip = pr.getSkip(args);
//		int max = pr.getMax(args);
//		OrderByMessages orderByMessages = new OrderByMessagesImp(pr.getOrderByEles());
//		GroupFunctionType groupFunctionType = pr.getGroupFuncType();
//
//		return new DispatcherResultImp(virtualTableName, targetdbs, needRowCopy, allowReverseOutput, skip, max,
//				orderByMessages, groupFunctionType);
//	}
//
//	private boolean isMatch(String[] routeFields, Map<String, Comparative> peconditions) {
//		//TODO
//		return true;
//	}
//
//	/**
//	 * 前两个Collection取交集，结果放入第三个Collection
//	 */
//	private static <T> void intersection(Collection<T> a1, Collection<T> a2, Collection<T> res) {
//		for (T e : a1)
//			if (a2.contains(e))
//				res.add(e);
//	}
//}
