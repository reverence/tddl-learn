package com.taobao.tddl.client.controller.route_condition_handler;

import com.taobao.tddl.client.RouteCondition;
import com.taobao.tddl.client.controller.TargetDBMeta;

public interface RouteConditionHandler {
	TargetDBMeta handle(RouteCondition routeCondition);
}
