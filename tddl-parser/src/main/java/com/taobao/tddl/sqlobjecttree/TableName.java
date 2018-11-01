package com.taobao.tddl.sqlobjecttree;

import java.util.Map;

import com.taobao.tddl.common.sqlobjecttree.SQLFragment;


/**
 * 用于实现强制索引和强制忽视索引的接口
 *
 * 表示一个表
 *
 * @author shenxun
 *
 */
public interface TableName extends SQLFragment{
	public void setAlias(String alias);
	public String getTableName();
	public String getAlias();
	public void appendAliasToSQLMap(Map<String, SQLFragment> map);
}