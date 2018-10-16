package com.taobao.tddl.client.jdbc;

import java.util.HashMap;
import java.util.Map;

/**
 * 保持为Final类，只可重建，不可修改
 *
 * 第一阶段：只支持数据源的动态，不支持规则和dbindex的动态
 *
 * @author linxuan
 *
 */
public class TddlRuntime {
	public final Map<String, DBSelector> dbSelectors;

	public TddlRuntime(Map<String, DBSelector> dbSelectors) {
		this.dbSelectors = dbSelectors;
	}

	/**
	 * 以原有的dbIndex去新的推送下来的map中查找，若找到则用新的
	 */
	public static TddlRuntime resetDbSelectors(TddlRuntime oldrt, Map<String, DBSelector> newDbSelectors) {
		Map<String, DBSelector> resSelectors = new HashMap<String, DBSelector>();
		for (Map.Entry<String, DBSelector> e : oldrt.dbSelectors.entrySet()) {
			DBSelector newdb = newDbSelectors.get(e.getKey());
			resSelectors.put(e.getKey(), newdb == null ? e.getValue() : newdb);
		}
		return new TddlRuntime(resSelectors);
	}
}
