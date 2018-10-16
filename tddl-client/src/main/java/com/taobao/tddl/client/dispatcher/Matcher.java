package com.taobao.tddl.client.dispatcher;

import java.util.List;
import java.util.Map;

import com.taobao.tddl.client.controller.MatcherResult;
import com.taobao.tddl.common.exception.checked.TDLCheckedExcption;
import com.taobao.tddl.common.sqljep.function.Comparative;
import com.taobao.tddl.rule.LogicTableRule;
import com.taobao.tddl.rule.ruleengine.entities.retvalue.TargetDB;
import com.taobao.tddl.sqlobjecttree.ComparativeMapChoicer;

/**
 * 匹配对象用的借口，会将sql计算出的结果，参数以及规则进行匹配
 * @author shenxun
 *
 */
public interface Matcher {
	/**
	 * 这里SqlParserResult pr + List<Object> args还需要抽象出一个更小的对象/接口
	 * 方便业务通过ThreadLocal方式绕过解析，直接指定
	 */
	MatcherResult match(ComparativeMapChoicer comparativeMapChoicer, List<Object> args, LogicTableRule rule) throws TDLCheckedExcption;
	MatcherResult buildMatcherResult(
			Map<String, Comparative> comparativeMapDatabase,
			Map<String, Comparative> comparativeTable, List<TargetDB> calc) ;
}
