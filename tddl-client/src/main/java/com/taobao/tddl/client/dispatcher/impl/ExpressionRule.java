//package com.taobao.tddl.client.dispatcher.impl;
//
//import com.taobao.tddl.client.dispatcher.RouteRule;
//
//public abstract class ExpressionRule implements RouteRule {
//
//	protected String expression;
//	protected String[] routeFields;
//	
//	public void setExpression(String expression) {
//		this.expression = expression;
//	}
//
//	/**
//	 * 简化spring：逗号分隔代替List
//	 */
//	public void setRouteFields(String commarRouteFields) {
//		this.routeFields = commarRouteFields.split(",");
//	} 
//
//	public String[] getRouteFields() {
//		return routeFields;
//	}
//
//	public void setRouteFields(String[] routeFields) {
//		this.routeFields = routeFields;
//	} 
//
//}
