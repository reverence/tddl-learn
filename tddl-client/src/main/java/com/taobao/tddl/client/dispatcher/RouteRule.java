package com.taobao.tddl.client.dispatcher;

import java.util.List;
import java.util.Map;

import com.taobao.tddl.common.sqljep.function.Comparative;

public interface RouteRule {

	String[] getRouteFields();

	/**
	 * @param compareValue 比较值
	 * @param compareOperator 比较符 : =,<,<=,>,>=
	 * @return 在那些库/表中
	 */
	List<String> getIndex(Map<String, Comparative> mapList);
}
