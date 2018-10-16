package com.taobao.tddl.client.dispatcher;

import java.util.Map;

import com.taobao.tddl.common.sqljep.function.Comparative;

public interface SamplableRouteRule extends RouteRule{
	Integer getCumulativeTimes();
	Comparative getAtomicIncreateValue();
	@SuppressWarnings("unchecked")
	String getIndex(Map<String/*对多个分表分库字段的支持*/, Comparable> aSample);
}
