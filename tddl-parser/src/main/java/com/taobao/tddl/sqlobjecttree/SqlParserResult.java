package com.taobao.tddl.sqlobjecttree;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * DMLCommon dmlc 中所有用到的方法的抽象
 *
 * @author linxuan
 */
public interface SqlParserResult {
	/**
	 * 获取当前表名
	 * @return
	 */
	String getTableName();

	/**
	 * 获取sql的SKIP值如果有的话，没有的情况下会返回DEFAULT值
	 * TODO 考虑把参数去掉。因为在解析这个对象时，已经将param传给过解析器了
	 * @param param
	 * @return
	 */
	int getSkip(List<Object> param);

	/**
	 * 获取sql的max值如果有的话，没有的话会返回DEFAULT值
	 * TODO 考虑把参数去掉。因为在解析这个对象时，已经将param传给过解析器了
	 * @param param
	 * @return
	 */
	int getMax(List<Object> param);

	/**
	 * 或许当前sql的最外层的group function.如果有且仅有一个group function,那么使用该function
	 * 如果没有group function或者有多个group function.则返回NORMAL
	 *
	 * @return
	 */
	GroupFunctionType getGroupFuncType();

	/**
	 * 获取order by 的信息
	 * @return
	 */
	List<OrderByEle> getOrderByEles();

	/**
	 * 获取group by 信息
	 * @return
	 */
	List<OrderByEle> getGroupByEles();

	/**
	 * 反向输出的接口
	 * @param tables
	 * @param args
	 * @param skip
	 * @param max
	 * @param outputType
	 * @param modifiedMap
	 * @return
	 */
	List<SqlAndTableAtParser> getSqlReadyToRun(Set<String> tables, List<Object> args, Number skip, Number max,
											   OutputHandler outputType, Map<Integer, Object> modifiedMap);

	/**
	 * 新规则接口
	 * TODO 这接口定的有点难看。。
	 * @deprecated 不再调用这个接口了
	 * @param arguments
	 * @param uniqueKeySetList
	 * @param databaseSharedingSetList
	 * @param tableShardingSetList
	 * @return
	 */
	@Deprecated
	public ColumnValuePairAndMatchRulesIndex getColumnsMapLists(List<Object> arguments,
																List<Set<String>> uniqueKeySetList, List<Set<String>> databaseSharedingSetList, List<Set<String>> tableShardingSetList);

	/**
	 * 获取结果集筛选器
	 * @return
	 */
	ComparativeMapChoicer getComparativeMapChoicer();
}
