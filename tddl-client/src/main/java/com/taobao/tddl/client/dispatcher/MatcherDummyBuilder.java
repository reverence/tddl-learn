package com.taobao.tddl.client.dispatcher;

import java.util.List;

import com.taobao.tddl.client.controller.MatcherResult;
import com.taobao.tddl.rule.ruleengine.entities.retvalue.DatabasesAndTables;

public interface MatcherDummyBuilder {
	MatcherResult buildDummyMatcherResult(List<DatabasesAndTables> databasesAndTables);
}
