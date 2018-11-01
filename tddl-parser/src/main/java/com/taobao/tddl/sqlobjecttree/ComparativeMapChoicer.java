package com.taobao.tddl.sqlobjecttree;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.taobao.tddl.common.sqljep.function.Comparative;

/**
 * 结果集筛选器
 *
 * @author shenxun
 *
 */
public interface ComparativeMapChoicer {

	/**
	 * 根据PartinationSet 获取列名和他对应值的map.
	 * @param arguments
	 * @param partnationSet
	 * @return
	 */
	Map<String, Comparative> getColumnsMap(List<Object> arguments, Set<String> partnationSet);
}
