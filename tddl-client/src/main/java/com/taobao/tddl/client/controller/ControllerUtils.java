package com.taobao.tddl.client.controller;

import com.taobao.tddl.client.dispatcher.DispatcherResult;
import com.taobao.tddl.client.dispatcher.EXECUTE_PLAN;
import com.taobao.tddl.common.sqljep.function.Comparative;
import com.taobao.tddl.rule.ruleengine.entities.retvalue.PartitionElement;
import com.taobao.tddl.rule.ruleengine.entities.retvalue.ReverseOutput;
import com.taobao.tddl.rule.ruleengine.entities.retvalue.TargetDB;
import com.taobao.tddl.sqlobjecttree.*;

import java.util.*;
import java.util.Map.Entry;

public class ControllerUtils {

	/**
	 * 添加分库的相关信息，但如果唯一键和分库键的key一致，则分库键内不会重复出现唯一键已经有的key=value对
	 * TODO:main
	 * @param mapList
	 * @param retMeta
	 */
	public static void appendDatabaseSharedMetaData(
			Map<String, Comparative> mapList,DispatcherResultImp retMeta){

		if(mapList == null){
			return ;
		}
		String uniqueColumnKey = getUniqueKey(retMeta);
		for(Entry<String, Comparative> oneValue:mapList.entrySet()){

			String sharedKey = toLowerCaseIgnoreNull(oneValue.getKey());

			//如果分库键和唯一键重复，则分库键内不重复出现唯一键
			if(!sharedKey.equals(uniqueColumnKey)){
				//给前端传入的全部是小写
				ColumnMetaData colMeta = new ColumnMetaData(sharedKey,oneValue.getValue());
				retMeta.addSplitDB(colMeta);
			}
		}
	}
	public  static String toLowerCaseIgnoreNull(String tobeDone){
		if(tobeDone != null){
			return tobeDone.toLowerCase();
		}
		return null;
	}
	/**
	 * 这里返回null如果没有主键，为的是在TStatement中已经做了对pk为null的判断，为了保证测试一致性
	 * @param retMeta
	 * @return
	 */
	protected static String getUniqueKey(DispatcherResultImp retMeta){
		ColumnMetaData uniqueKey = retMeta.getPrimaryKey();
		if(uniqueKey == null){
			return null;
		}
		return uniqueKey.key;
	}

	protected static Set<String> getDatabaseSharedingKeys(DispatcherResultImp retMeta){
		List<ColumnMetaData> dbExpression = retMeta.getSplitDB();
		if(dbExpression == null||dbExpression.size() == 0){
			return Collections.emptySet();
		}

		Set<String> dbkeys = new HashSet<String>(dbExpression.size());
		for(ColumnMetaData col : dbExpression){
			dbkeys.add(col.key);
		}
		return dbkeys;
	}
	/**
	 * 创建执行计划
	 *
	 * 其中表的执行计划，如果有多个库里面的多个表的个数不同，那么按照表的数量最多的那个值为准。
	 * 即：如db1~5，表的个数分别为0,0,0,0,1:那么返回的表执行计划为SINGLE
	 * 若，表的个数分别为0,1,2,3,4,5：那么返回表的执行计划为MULTIPLE.
	 * @param dispatcherResult
	 * @param targetDBList
	 */
	public static void buildExecutePlan(DispatcherResult dispatcherResult,List<TargetDB> targetDBList){
		if(targetDBList == null){
			throw new IllegalArgumentException("targetDBList is null");
		}
		int size = targetDBList.size();
		switch (size) {
			case 0:
				dispatcherResult.setDatabaseExecutePlan(EXECUTE_PLAN.NONE);
				dispatcherResult.setTableExecutePlan(EXECUTE_PLAN.NONE);
				break;
			case 1:
				TargetDB targetDB = targetDBList.get(0);
				Set<String> set = targetDB.getTableNames();
				dispatcherResult.setTableExecutePlan(buildTableExecutePlan(set, null));
				//如果表为none，那么库也为none.如果表不为none，那么库为single
				if(dispatcherResult.getTableExecutePlan() != EXECUTE_PLAN.NONE){
					dispatcherResult.setDatabaseExecutePlan(EXECUTE_PLAN.SINGLE);
				}else{
					dispatcherResult.setDatabaseExecutePlan(EXECUTE_PLAN.NONE);
				}
				break;
			default:
				EXECUTE_PLAN currentExeutePlan = EXECUTE_PLAN.NONE;
				for(TargetDB oneDB:targetDBList){
					currentExeutePlan = buildTableExecutePlan(oneDB.getTableNames(),currentExeutePlan);
				}
				dispatcherResult.setTableExecutePlan(currentExeutePlan);
				if(dispatcherResult.getTableExecutePlan() != EXECUTE_PLAN.NONE){
					dispatcherResult.setDatabaseExecutePlan(EXECUTE_PLAN.MULTIPLE);
				}else{
					dispatcherResult.setDatabaseExecutePlan(EXECUTE_PLAN.NONE);
				}
				break;
		}

	}
	private static EXECUTE_PLAN buildTableExecutePlan(Set<String> tableSet,EXECUTE_PLAN currentExecutePlan){
		if(currentExecutePlan == null){
			currentExecutePlan = EXECUTE_PLAN.NONE;
		}
		EXECUTE_PLAN tempExecutePlan = null;
		if(tableSet == null){
			throw new IllegalStateException("targetTab is null");
		}
		int tableSize = tableSet.size();
		//不可能为负数
		switch (tableSize) {
			case 0:
				tempExecutePlan = EXECUTE_PLAN.NONE;
				break;
			case 1:
				tempExecutePlan = EXECUTE_PLAN.SINGLE;
				break;
			default:
				tempExecutePlan = EXECUTE_PLAN.MULTIPLE;
		}
		return tempExecutePlan.value()>currentExecutePlan.value()?tempExecutePlan:currentExecutePlan;
	}
	/**
	 * 添加分表的相关信息，但如果唯一键和分表键的key一致，则分表键内不会重复出现唯一键已经有的key=value对
	 * 同时，如果分库键中所有的key，也不会出现在分表键中
	 * @param mapList
	 * @param retMeta
	 * TODO:main
	 */
	public static void appendTableSharedMetaData(Map<String, Comparative> mapList,DispatcherResultImp retMeta){
		for(Entry<String, Comparative> oneValue:mapList.entrySet()){
			if(mapList == null){
				return ;
			}
			String uniqueColumnKey = getUniqueKey(retMeta);
			Set<String> dbSharedingKeys = getDatabaseSharedingKeys(retMeta);

			String sharedKey = toLowerCaseIgnoreNull(oneValue.getKey());
			//如果分表键和唯一键或分库键重复，则分表键内不重复出现唯一键和分库键
			if(!sharedKey.equals(uniqueColumnKey)&&!dbSharedingKeys.contains(sharedKey)){
				ColumnMetaData colMeta = new ColumnMetaData(sharedKey,oneValue.getValue());
				retMeta.addSplitTab(colMeta);
			}
		}
	}
	public static void appendUniqueKeysMetaData(Map<String, Comparative> mapList,DispatcherResultImp retMeta){
		if(mapList == null){
			return ;
		}
		for(Entry<String, Comparative> oneValue:mapList.entrySet()){
			String key = toLowerCaseIgnoreNull(oneValue.getKey());
			ColumnMetaData colMeta = new ColumnMetaData(key,oneValue.getValue());
			retMeta.setUniqueKey(colMeta);
		}
	}

	public static void buildRowCopyMetaData(PartitionElement part,
											Map<String, Comparative> mapList, TargetDBMeta retMeta) {

		if (!part.getDbFirstElement().isEmpty()) {
			for (String str : part.getDbFirstElement()) {
				ColumnMetaData colMeta = new ColumnMetaData(str, mapList
						.get(str));
				retMeta.addSplitDB(colMeta);
			}
		}
		if (!part.getPkFirstElement().isEmpty()) {
			if (part.getPkFirstElement().size() != 1) {
				throw new IllegalArgumentException("pk多于一个" + part.getPkFirstElement());
			}
			for (String str : part.getPkFirstElement()) {
				ColumnMetaData colMeta = new ColumnMetaData(str, mapList
						.get(str));
				retMeta.setPrimaryKey(colMeta);
			}
		}
		if (!part.getTabFirstElement().isEmpty()) {
			if (part.getTabFirstElement().size() != 1) {
				throw new IllegalArgumentException("分表规则字段多于一个，"
						+ part.getTabFirstElement());
			}
			for (String str : part.getTabFirstElement()) {
				ColumnMetaData colMeta = new ColumnMetaData(str, mapList
						.get(str));
				retMeta.addSplitTab(colMeta);
			}
		}
	}
	/**
	 * 创建反向输出相关的context，反向输出目前主要是解决以下问题
	 *
	 * :1.如果sql中带有了符合表名替换pattern的字段，并且不想被替换掉。
	 * 2.如果sql中包含了跨表的limit m,n的操作，
	 * 3.update+数据复制的情况下，因为分库的version字段默认的情况下是null.
	 * 所以where条件中要加入ifnull或者nvl来保证将原来为Null的参数还原为0、
	 * 这两种情况下都需要进行反向输出，也即通过对象树反向生成sql.
	 *
	 * 其余的情况因为反向输出本身也会带来风险因此不进行反向。
	 *
	 *
	 *
	 *
	 * @param args
	 * @param dmlc
	 * @param max
	 * @param skip
	 * @param retMeta
	 * @param isMySQL
	 * @param needRowCopy
	 */
	public static void buildReverseOutput(List<Object> args, SqlParserResult dmlc, int max,
										  int skip, DispatcherResult retMeta,
										  boolean isMySQL, boolean needRowCopy) {
		boolean allowReverseOutput = retMeta.allowReverseOutput();
		List<SqlAndTableAtParser> sqls = Collections.emptyList();
		List<TargetDB> targetdbs = retMeta.getTarget();
		for (TargetDB targetDB : targetdbs) {
			Set<String> tabs = targetDB.getTableNames();
			Map<Integer, Object> modifiedMap = new HashMap<Integer, Object>();
			// 如果目标数据库为一个则有可能是单库单表或单库多表
			if (targetdbs.size() == 1) {
				Set<String> temp_tabs = targetdbs.get(0).getTableNames();
				if (temp_tabs.size() == 1) {

					if (allowReverseOutput) {
						if (!needRowCopy) {
							// 单表,不需要行拷贝的情况下，只需要改表名 o
							sqls = dmlc.getSqlReadyToRun(temp_tabs, args, skip,
									max, OutputHandlerConsist.CHANGE_TABLE, modifiedMap);
						} else {
							sqls = singleTableReverseOutput(args, dmlc, max,
									skip, isMySQL, modifiedMap, temp_tabs);
						}
					} else {
						// 单表，不允许反向输出，但需要行复制时 o
						if (needRowCopy) {
							if (dmlc instanceof Update) {
								sqls = singleTableReverseOutput(args, dmlc,
										max, skip, isMySQL, modifiedMap,
										temp_tabs);
								retMeta.needAllowReverseOutput(true);
							}
						}
					}
				} else {
					sqls = mutiTableReverseOutput(args, dmlc, max, skip,
							retMeta, allowReverseOutput, sqls, temp_tabs,
							modifiedMap, isMySQL, needRowCopy);
				}
			} else {
				sqls = mutiTableReverseOutput(args, dmlc, max, skip, retMeta,
						allowReverseOutput, sqls, tabs, modifiedMap, isMySQL,
						needRowCopy);
			}
			if (retMeta.allowReverseOutput()) {
				List<ReverseOutput> reverse = new ArrayList<ReverseOutput>(sqls
						.size());
				for (SqlAndTableAtParser sql : sqls) {
					ReverseOutput out = new ReverseOutput();
					out.setParams(modifiedMap);
					out.setSql(sql.sql);
					out.setTable(sql.table);
					reverse.add(out);
				}
				targetDB.setOutputSQL(reverse);
			}
		}
	}

	private static List<SqlAndTableAtParser> singleTableReverseOutput(List<Object> args,
																	  SqlParserResult dmlc, int max, int skip, boolean isMySQL,
																	  Map<Integer, Object> modifiedMap, Set<String> temp_tabs) {
		List<SqlAndTableAtParser> sqls;
		if (isMySQL) {
			// 单库单表，需要行拷贝，要改version字段和表名
			sqls = dmlc.getSqlReadyToRun(temp_tabs, args, skip, max,
					OutputHandlerConsist.MYSQL_CHANGE_TABLE_VERSION, modifiedMap);
		} else {
			// oracle.
			sqls = dmlc.getSqlReadyToRun(temp_tabs, args, skip, max,
					OutputHandlerConsist.ORACLE_CHANGE_TABLE_VERSION, modifiedMap);
		}
		return sqls;
	}

	/**
	 * 多库单表或多库多表或单库多表，需要改表名和页数
	 */
	private static List<SqlAndTableAtParser> mutiTableReverseOutput(List<Object> args,
																	SqlParserResult dmlc, int max, int skip, DispatcherResult retMeta,
																	boolean allowReverseOutput, List<SqlAndTableAtParser> sqls, Set<String> tabs,
																	Map<Integer, Object> modifiedMap, boolean isMySQL,
																	boolean needRowCopy) {
		if (allowReverseOutput) {
			if (!needRowCopy) {
				// 不需要行拷贝的情况下，多库单表或多库多表，需要改表名和页数
				sqls = dmlc.getSqlReadyToRun(tabs, args, 0, max,
						OutputHandlerConsist.CHANGE_TABLE_AND_PAGENUMBER, modifiedMap);
			} else {
				sqls = mutiTablesNeedRowCopyFunction(args, dmlc, max, skip,
						tabs, modifiedMap, isMySQL);
			}
		} else {
			sqls = functionalReverseOutput(args, dmlc, max, skip, retMeta,
					sqls, tabs, modifiedMap, isMySQL, needRowCopy);
		}
		return sqls;
	}

	private static List<SqlAndTableAtParser> mutiTablesNeedRowCopyFunction(List<Object> args,
																		   SqlParserResult dmlc, int max, int skip, Set<String> tabs,
																		   Map<Integer, Object> modifiedMap, boolean isMySQL) {
		List<SqlAndTableAtParser> sqls;
		if (isMySQL) {
			// 多库多表，需要行拷贝，要改version字段和表名
			sqls = dmlc.getSqlReadyToRun(tabs, args, 0, max,
					OutputHandlerConsist.MYSQL_CHANGE_TABLE_PAGENUMBER_VERSION,
					modifiedMap);
		} else {
			// oracle.
			sqls = dmlc.getSqlReadyToRun(tabs, args, 0, max,
					OutputHandlerConsist.ORACLE_CHANGE_TABLE_PAGENUMBER_VERSION,
					modifiedMap);
		}
		return sqls;
	}

	/**
	 * 多库单表或多库多表或单库多表情况下，虽然不允许反向输出 但仍然要强制反向输出以支持该功能
	 */
	private static List<SqlAndTableAtParser> functionalReverseOutput(List<Object> args,
																	 SqlParserResult dmlc, int max, int skip, DispatcherResult retMeta,
																	 List<SqlAndTableAtParser> sqls, Set<String> tabs,
																	 Map<Integer, Object> modifiedMap, boolean isMySQL,
																	 boolean needRowCopy) {
		if (skip != DMLCommon.DEFAULT_SKIP_MAX
				&& max != DMLCommon.DEFAULT_SKIP_MAX) {
			if (!needRowCopy) {
				// skip max非默认值的情况下，不需要行复制的情况下的反向输出
				sqls = dmlc.getSqlReadyToRun(tabs, args, 0, max,
						OutputHandlerConsist.CHANGE_TABLE_AND_PAGENUMBER, modifiedMap);
			} else {
				sqls = mutiTablesNeedRowCopyFunction(args, dmlc, max, skip,
						tabs, modifiedMap, isMySQL);
			}
			retMeta.needAllowReverseOutput(true);
		} else if (needRowCopy) {
			if (dmlc instanceof Update) {
				sqls = mutiTablesNeedRowCopyFunction(args, dmlc, max, skip,
						tabs, modifiedMap, isMySQL);
				retMeta.needAllowReverseOutput(true);
			}
		}

		/*
		 * else{ 非skip max,或者需要rowcopy的情况，不需要反向输出也可解决问题 }
		 */
		return sqls;
	}
}
