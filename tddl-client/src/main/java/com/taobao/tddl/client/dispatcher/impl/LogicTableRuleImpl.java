//package com.taobao.tddl.client.dispatcher.impl;
//
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Set;
//
//import com.taobao.tddl.client.dispatcher.RouteRule;
//import com.taobao.tddl.rule.DBType;
//import com.taobao.tddl.rule.LogicTableRule;
//import com.taobao.tddl.rule.ruleengine.entities.retvalue.PartitionElement;
//
///**
// * 一个逻辑表对应的分库分表规则
// * 分库规则分表规则都是一个规则链
// *
// * @author linxuan
// */
//public class LogicTableRuleImpl implements LogicTableRule {
//	private RouteRule[] dbRouteRules;
//	private RouteRule[] tableRouteRuleForEachDB; //默认应用于每个分库的分表规则。
//
//	/**
//	 * 在分库的分表规则不同的情况下，设置针对个别库的分表规则
//	 */
//	private Map<String, RouteRule[]> dbIndex2tableRules;
//	private boolean needRowCopy = false;
//	private boolean allowReverseOutput;
//
//	private Map<String, Set<String>> dbIndex2tbIndex;
//
//	private String dbPrefix;
//	private String tbPrefixForEachDB;
//
//	/**
//	 * 返回所有分库分表字段
//	 */
//	public PartitionElement getPartitionElement() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	/**
//	 * 支持某些分库有不同的分表规则的情况
//	 * 根据分库路由后的索引值，取得该库对应的分表规则
//	 * @param dbRoutedIndex 分库路由后的索引值。对应于TDS中的 @todo 补全
//	 * @return
//	 */
//	public RouteRule[] getTableRoutes(String dbRoutedIndex) {
//		RouteRule[] tableRouteRules = dbIndex2tableRules.get(dbRoutedIndex);
//		return tableRouteRules == null ? tableRouteRuleForEachDB : tableRouteRules;
//	}
//
//	/**
//	 * 逗号分隔的Spring配置转化为内部结构
//			<map>
//				<entry key="r0" value-ref="00,01,02,03,04,05,06,07,08,09,10,11,12,13,14,15" />
//				<entry key="r1" value-ref="16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31" />
//			</map>
//	 * @param indexMatrix
//	 */
//	public void setIndexMatrix(Map<String, String> indexMatrix) {
//		for(Map.Entry<String, String> e: indexMatrix.entrySet()){
//			this.dbIndex2tbIndex.put(e.getKey(), new HashSet<String>(Arrays.asList(e.getValue().split(","))));
//		}
//	}
//
//	/**
//	 * 无逻辑setter、getter
//	 */
//	public void setDbRouteRules(RouteRule[] dbRouteRules) {
//		this.dbRouteRules = dbRouteRules;
//	}
//
//	public RouteRule[] getDbRouteRules() {
//		return dbRouteRules;
//	}
//
//	public void setTableRouteRuleForEachDB(RouteRule[] tableRouteRuleForEachDB) {
//		this.tableRouteRuleForEachDB = tableRouteRuleForEachDB;
//	}
//
//	public boolean isNeedRowCopy() {
//		return needRowCopy;
//	}
//
//	public void setNeedRowCopy(boolean needRowCopy) {
//		this.needRowCopy = needRowCopy;
//	}
//
//	public boolean isAllowReverseOutput() {
//		return allowReverseOutput;
//	}
//
//	public void setAllowReverseOutput(boolean allowReverseOutput) {
//		this.allowReverseOutput = allowReverseOutput;
//	}
//
//	public Map<String, Set<String>> getDbIndex2tbIndex() {
//		return dbIndex2tbIndex;
//	}
//
//	public void setDbIndex2tbIndex(Map<String, Set<String>> dbIndex2tbIndex) {
//		this.dbIndex2tbIndex = dbIndex2tbIndex;
//	}
//
//	public void setDbPrefix(String dbPrefix) {
//		this.dbPrefix = dbPrefix;
//	}
//
//	public void setTbPrefixForEachDB(String tbPrefixForEachDB) {
//		this.tbPrefixForEachDB = tbPrefixForEachDB;
//	}
//
//	public DBType getDBType() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}
