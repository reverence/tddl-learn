package com.taobao.tddl.client.dispatcher;

import java.util.List;

import com.taobao.tddl.client.RouteCondition;
import com.taobao.tddl.common.exception.checked.TDLCheckedExcption;

/**
 * 数据源和对应列表的选择器，可以通过sql和arg获取执行目标
 * 也可以通过rc获取，同时还可以通过这个接口获得所有的数据库和表
 *
 * Result结构和内部实现无关，业务方可以进行修改 不会影响到TDDL内部实现。
 *
 * @author shenxun
 *
 */
public interface DatabaseChoicer {
	/**
	 * 获取当前数据库和表。
	 * @param sql
	 * @param args
	 * @return
	 * @throws TDLCheckedExcption
	 */
	Result getDBAndTables(String sql, List<Object> args) throws TDLCheckedExcption;

	/**
	 * 不解析SQL，由ThreadLocal传入的指定对象（RouteCondition），决定库表目的地的接口
	 * @param rc
	 * @return
	 */
	Result getDBAndTables(RouteCondition rc);
	/**
	 * 获取全库全表信息
	 * @param logicTableName
	 * @return
	 */
	Result getAllDatabasesAndTables(String logicTableName);
}
