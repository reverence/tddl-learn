/**
 *
 */
package com.taobao.tddl.client.sequence;

import com.taobao.tddl.client.RouteCondition;

/**
 * seq数据层
 *
 * @author liang.chenl
 *
 */
public interface LoopRoutedSequenceDAO {

	/**
	 * 返回当前的序列值
	 * @param name
	 * @param routeCondition
	 * @return
	 */
	long findCurrent(String name, RouteCondition routeCondition);

	/**
	 * 将当前的序列值更新为新值
	 * @param newValue
	 * @param currentTimeMillis
	 * @param name
	 * @param oldValue
	 * @param routeCondition
	 * @return
	 */
	int update(long newValue, String name, long oldValue, RouteCondition routeCondition);

}
