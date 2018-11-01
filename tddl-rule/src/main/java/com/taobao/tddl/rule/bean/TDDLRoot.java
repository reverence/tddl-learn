package com.taobao.tddl.rule.bean;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.taobao.tddl.common.DBType;
import com.taobao.tddl.rule.LogicTableRule;

public class TDDLRoot {
	final Log log = LogFactory.getLog(TDDLRoot.class);
	private DBType dbType = DBType.MYSQL;
	private Map<String/* key */, LogicTable> logicTableMap;
	private String defaultDBSelectorID;

	public Map<String, LogicTable> getLogicTableMap() {
		return Collections.unmodifiableMap(logicTableMap);
	}

	public LogicTableRule getLogicTableMap(String logicTableName) {
		LogicTableRule logicTableRule = getLogicTable(logicTableName);
		if (logicTableRule == null) {
			// 逻辑表名不存在于规则表中，尝试从默认表规则寻找，如果再找不到就抛异常了。
			if (defaultDBSelectorID != null && defaultDBSelectorID.length() != 0){
				// 如果有默认规则，那么因为默认规则中持有的只有数据源，需要将表名赋给克隆一份以后的他，这样保证线程安全
				log.debug("use default table rule");
				DefaultLogicTableRule defaultLogicTableRule = new DefaultLogicTableRule(
						defaultDBSelectorID, logicTableName);
				logicTableRule = defaultLogicTableRule;
			} else {
				throw new IllegalArgumentException("未能找到对应规则,逻辑表:"
						+ logicTableName);
			}
		}
		return logicTableRule;
	}

	public LogicTable getLogicTable(String logicTableName) {
		if (logicTableName == null) {
			throw new IllegalArgumentException("logic table name is null");
		}
		LogicTable logicTable = logicTableMap.get(logicTableName);
		return logicTable;
	}

	/**
	 * logicMap的key必须都显示的设置为小写
	 *
	 * @param logicTableMap
	 */
	public void setLogicTableMap(Map<String, LogicTable> logicTableMap) {
		this.logicTableMap = new HashMap<String, LogicTable>(logicTableMap
				.size());
		for (Entry<String, LogicTable> entry : logicTableMap.entrySet()) {
			String key = entry.getKey();
			if (key != null) {
				key = key.toLowerCase();
			}
			this.logicTableMap.put(key, entry.getValue());
		}
	}

	/**
	 * 需要注意这个init方法是和内部持有的类的init方法无关的，虽然可以在放在一个初始化链中
	 *
	 */
	public void init() {
		for (Entry<String, LogicTable> logicTableEntry : logicTableMap
				.entrySet()) {
			log.warn("logic Table is starting :"+logicTableEntry.getKey());
			LogicTable logicTable = logicTableEntry.getValue();
			String logicTableName = logicTable.getLogicTableName();
			if (logicTableName == null || logicTableName.length() == 0) {
				// 如果没有指定logicTableName,那么以map的key作为logicTable的key
				logicTable.setLogicTableName(logicTableEntry.getKey());
			}
			logicTable.setDBType(dbType);
			logicTable.init();
			if (log.isInfoEnabled()) {
				log.info("logic Table inited :" + logicTable.toString());
			}
		}
	}

	public Object getDBType() {
		return dbType;
	}

	public void setDBType(Object dbType) {
		if (dbType instanceof DBType) {
			this.dbType = (DBType) dbType;
		} else if (dbType instanceof String) {
			this.dbType = DBType.valueOf(((String) dbType).toUpperCase());
		}
	}

	public String getDefaultDBSelectorID() {
		return defaultDBSelectorID;
	}

	public void setDefaultDBSelectorID(String defaultDBSelectorID) {
		this.defaultDBSelectorID = defaultDBSelectorID;
	}


}
