package com.taobao.tddl.client.controller;

import com.taobao.tddl.common.DBType;
import com.taobao.tddl.common.SqlType;
import com.taobao.tddl.common.exception.checked.TDLCheckedExcption;
import com.taobao.tddl.common.exception.runtime.NotSupportException;
import com.taobao.tddl.common.sqljep.function.Comparative;
import com.taobao.tddl.parser.SQLParserImp;
import com.taobao.tddl.rule.ruleengine.entities.retvalue.PartitionElement;
import com.taobao.tddl.rule.ruleengine.entities.retvalue.TargetDBMetaData;
import com.taobao.tddl.rule.ruleengine.impl.DBRuleProviderImp;
import com.taobao.tddl.rule.ruleengine.xml.TDLXmlParser;
import com.taobao.tddl.sqlobjecttree.DMLCommon;
import com.taobao.tddl.sqlobjecttree.GroupFunctionType;
import com.taobao.tddl.sqlobjecttree.Statement;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.taobao.tddl.common.Monitor.*;
public class RuleControllerImpl implements RuleController {
	SQLParserImp parser = null;
	DBRuleProviderImp provider = null;

	public RuleControllerImpl(String generatorUrl, String ruleUrl) {
		parser = new SQLParserImp();
		DBRuleProviderImp provider = new DBRuleProviderImp();
		provider.setParser(new TDLXmlParser());
		provider.setIDGeneratorUrl(generatorUrl);
		provider.setUrl(ruleUrl);
		this.provider = provider;
	}

	public TargetDBMeta getDBAndTables(String sql, List<Object> args,
									   boolean isMysqlSQL) throws TDLCheckedExcption {
		long elapsedTime = System.currentTimeMillis();

		long elapsedTime4parse = 0;

		String table = null;

		TargetDBMeta targetDBMeta = null;

		Statement com = parser.getStatement(sql);
		//TODO: 将parse的逻辑在controller重构的时候移动到parser里面去，现在是有两份的
		try {
			if (com == null) {
				// 如果没取到，尝试分析sql并初始化
				parser.parseSQL(sql, isMysqlSQL);
				com = parser.getStatement(sql);
				table = ((DMLCommon) com).getTableName();
				add(buildTableKey1(table), buildExecuteSqlKey2(sql), KEY3_PARSE_SQL,
						0, 1);

			} else {
				table = ((DMLCommon) com).getTableName();
				add(buildTableKey1(table), buildExecuteSqlKey2(sql), KEY3_PARSE_SQL,
						1, 1);
			}
		} catch (ClassCastException e) {
			throw new NotSupportException(e.getMessage() + ".not support yet");
		}
		elapsedTime4parse = System.currentTimeMillis();

		targetDBMeta = getMetaData(args, com, isMysqlSQL);

		long currentTime = System.currentTimeMillis();

		add(buildTableKey1(table), buildExecuteSqlKey2(sql), KEY3_GET_DB_AND_TABLES,
				currentTime - elapsedTime4parse, currentTime - elapsedTime);

		return targetDBMeta;
	}





	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.taobao.tddl.client.controller.RuleController#getDBAndTables(java.
	 * lang.String, java.util.List)
	 */
	public TargetDBMeta getDBAndTables(String sql, List<Object> args)
			throws TDLCheckedExcption {
		DBType dbType = provider.getDBType();

		switch (dbType) {
			case ORACLE:
				return this.getDBAndTables(sql, args, false);
			case MYSQL:
				return this.getDBAndTables(sql, args, true);

			default:
				throw new IllegalArgumentException("未知类型，当前类型是:" + dbType);
		}
	}

	/**
	 * 获取源信息
	 *
	 * @param args
	 * @param com
	 * @return
	 * @throws TDLCheckedExcption
	 */
	protected TargetDBMeta getMetaData(List<Object> args, Statement com,
									   boolean isMySQL) throws TDLCheckedExcption {
		DMLCommon dmlc;
		if (com == null) {
			// 如果未能找到，则证明sql解析出现了问题
			throw new IllegalArgumentException("sql 解析出现问题，不应该至此处");
		} else {
			if (com.isDML()) {
				dmlc = (DMLCommon) com;
				PartitionElement part = provider.getPartitionColumns(dmlc
						.getTableName());
				//新的时候要调用新接口
				Set<String> tempSet = new HashSet<String>(part.getDbFirstElement().size()
						+ part.getPkFirstElement().size() + part.getTabFirstElement().size());
				tempSet.addAll(part.getDbFirstElement());
				tempSet.addAll(part.getPkFirstElement());
				tempSet.addAll(part.getTabFirstElement());
				Map<String, Comparative> mapList = dmlc.getColumnsMap(args,
						tempSet);

				TargetDBMetaData meta = provider.getDBAndTabs(dmlc
						.getTableName(), mapList);
				int max = DMLCommon.DEFAULT_SKIP_MAX;
				int skip = DMLCommon.DEFAULT_SKIP_MAX;
				skip = dmlc.getSkip(args);
				max = dmlc.getMax(args);
				GroupFunctionType type=dmlc.getGroupFuncType();
				OrderByMessagesImp orderby = new OrderByMessagesImp(dmlc
						.getOrderByEles());
				TargetDBMeta retMeta = new TargetDBMeta(meta, skip, max,
						orderby,type);
				ControllerUtils.buildReverseOutput(args, dmlc, max, skip, retMeta,
						isMySQL, retMeta.needRowCopy());
				if (retMeta.needRowCopy()) {
					ControllerUtils.buildRowCopyMetaData(part, mapList, retMeta);
				}
				return retMeta;
			} else {
				throw new IllegalStateException("目前没有除dml以外的其他sql类型");
			}
		}
	}





	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.taobao.tddl.client.controller.RuleController#getTargetDB(java.lang
	 * .String, java.util.Map)
	 */
	public TargetDBMeta getTargetDB(String virtualTableName,
									Map<String, Comparative> map,SqlType sqlType) throws TDLCheckedExcption {
		long elapsedTime = System.currentTimeMillis();

		TargetDBMetaData metaData = provider
				.getDBAndTabs(virtualTableName, map);
		TargetDBMeta meta = new TargetDBMeta(metaData,
				DMLCommon.DEFAULT_SKIP_MAX, DMLCommon.DEFAULT_SKIP_MAX,
				new OrderByMessagesImp(null), GroupFunctionType.NORMAL);
		if(meta.allowReverseOutput()){
			throw new IllegalArgumentException("在直接指定分库字段的模式中，不允许设置反向输出为true");
		}
		if (meta.needRowCopy()) {
			//sqlType == SqlType.INSERT||这个时候insert也是可以的。因为默认为null
			if(sqlType == SqlType.UPDATE){
				throw new IllegalArgumentException("通过直接使用RouteCondition的这种指定" +
						"分库分表的方式时，在insert和update时不能够设置rowCopy为true");
			}
			PartitionElement part = provider
					.getPartitionColumns(virtualTableName);
			ControllerUtils.buildRowCopyMetaData(part, map, meta);
		}

		long currentTime = System.currentTimeMillis();
		add(buildTableKey1(virtualTableName), buildExecuteSqlKey2(map.toString()), KEY3_GET_DB_AND_TABLES,
				currentTime - elapsedTime, currentTime - elapsedTime);
		return meta;
	}

	public TargetDBMeta getTargetDB(String virtualTableName, String ruleID,
									Set<String> tables, SqlType sqlType) throws TDLCheckedExcption {

		long elapsedTime = System.currentTimeMillis();

		TargetDBMetaData metaData = provider.getDBAndTabs(virtualTableName,
				ruleID, tables);
		if(metaData.allowReverseOutput()||metaData.needRowCopy()){
			throw new IllegalArgumentException("在直接指定分库分表的这种方式中" +
					"不允许使用反向输出和行复制");
		}
		TargetDBMeta meta = new TargetDBMeta(metaData,
				DMLCommon.DEFAULT_SKIP_MAX, DMLCommon.DEFAULT_SKIP_MAX,
				new OrderByMessagesImp(null), GroupFunctionType.NORMAL);
		long currentTime = System.currentTimeMillis();
		StringBuilder key2Builder = new StringBuilder();
		key2Builder.append("DIRECT_DB|").append(virtualTableName).append("|")
				.append(ruleID).append("|").append(tables.toString());
		add(buildTableKey1(virtualTableName), buildExecuteSqlKey2(key2Builder.toString()), KEY3_GET_DB_AND_TABLES,
				currentTime - elapsedTime, currentTime - elapsedTime);
		return meta;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.taobao.tddl.client.controller.RuleController#getGeneratorUrl()
	 */
	public String getGeneratorUrl() {
		return provider.getIDGeneratorUrl();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.taobao.tddl.client.controller.RuleController#setGeneratorUrl(java
	 * .lang.String)
	 */
	public void setGeneratorUrl(String generatorUrl) {
		provider.setIDGeneratorUrl(generatorUrl);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.taobao.tddl.client.controller.RuleController#getRuleUrl()
	 */
	public String getRuleUrl() {
		return provider.getUrl();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.taobao.tddl.client.controller.RuleController#setRuleUrl(java.lang
	 * .String)
	 */
	public void setRuleUrl(String ruleUrl) {
		provider.setUrl(ruleUrl);
	}
	public DBType getDBType() {
		return provider.getDBType();
	}
}
