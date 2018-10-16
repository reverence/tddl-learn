package com.taobao.tddl.client.controller;

import com.taobao.tddl.common.sqljep.function.Comparative;
import com.taobao.tddl.rule.ruleengine.entities.retvalue.TargetDB;

import java.util.List;
import java.util.Map;

/**
 * 匹配的结果对象，供给给Controller进行返回对象的拼装
 *
 *
 * 这些是纯粹的从匹配中可以获得的数据 主要是应该走哪些库哪些表，是否反向输出，分库分表参数
 *
 * @author shenxun
 *
 */
public interface MatcherResult {
	/**
	 * 规则计算后的结果对象
	 * @return
	 */
	List<TargetDB> getCalculationResult();
	/**
	 * 匹配的库参数是什么,不会出现Null值
	 * @return
	 */
	Map<String, Comparative> getDatabaseComparativeMap();
	/**
	 * 匹配的表参数是什么,不会出现null值
	 * @return
	 */
	Map<String,Comparative> getTableComparativeMap();
}
