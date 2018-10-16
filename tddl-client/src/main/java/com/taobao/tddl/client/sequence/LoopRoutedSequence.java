/**
 *
 */
package com.taobao.tddl.client.sequence;

import com.taobao.tddl.client.RouteCondition;

/**
 *
 * 带路由和循环的sequence实现
 * @author liang.chenl
 *
 */
public interface LoopRoutedSequence {

	/**
	 * 返回下一个序列值
	 * @param routeCondition   分库条件
	 * @return
	 * @throws SequenceException
	 */
	long nextValue(RouteCondition routeCondition) throws SequenceException;

	/**
	 *
	 * @param loopRoutedSequenceDAO
	 */
	void setLoopRoutedSequenceDAO(LoopRoutedSequenceDAO loopRoutedSequenceDAO);

}
