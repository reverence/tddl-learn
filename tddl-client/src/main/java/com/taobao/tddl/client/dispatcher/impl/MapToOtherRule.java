//package com.taobao.tddl.client.dispatcher.impl;
//
//import java.util.List;
//import java.util.Map;
//
//import com.taobao.tddl.client.dispatcher.RouteRule;
//import com.taobao.tddl.common.sqljep.function.Comparative;
//
//public class MapToOtherRule implements RouteRule{
//
//	protected String[] routeFields;
//	private RouteRule targetRule;
//	@SuppressWarnings("unchecked")
//	private Map<Comparable, Comparable> valueMappingTable;
//
//	@SuppressWarnings("unchecked")
//	public List<String> getIndex(Map<String, Comparative> mapList) {
//		//TODO mapList做深度复制？
//		for(int i=0; i<routeFields.length; i++){
//			String field = routeFields[i];
//			Comparative from = mapList.get(field);
//			Comparable fromvalue = from.getValue();
//			Comparable tovalue =  valueMappingTable.get(fromvalue);
//			String targetField = targetRule.getRouteFields()[i];
//			Comparative to = new Comparative(from.getComparison(), tovalue);
//			mapList.put(targetField, to);
//		}
//
//		return targetRule.getIndex(mapList);
//	}
//
//	/**
//	 * 简化spring：逗号分隔代替List
//	 */
//	public void setRouteFields(String commarRouteFields) {
//		this.routeFields = commarRouteFields.split(",");
//	}
//
//	/**
//	 * 无逻辑的getter、setter
//	 */
//	public String[] getRouteFields() {
//		return routeFields;
//	}
//
//	public void setRouteFields(String[] routeFields) {
//		this.routeFields = routeFields;
//	}
//
//	public void setTargetRule(RouteRule targetRule) {
//		this.targetRule = targetRule;
//	}
//
//	@SuppressWarnings("unchecked")
//	public void setValueMappingTable(Map<Comparable, Comparable> valueMappingTable) {
//		this.valueMappingTable = valueMappingTable;
//	} 
//
//}
