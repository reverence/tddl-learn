package com.taobao.tddl.rule.ruleengine.entities.retvalue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 目标数据库特征
 * 包含读写目标ds的id
 * 以及该ds中符合要求的表名列表。
 * @author shenxun
 *
 */
public class TargetDB  implements DatabasesAndTables{
	/**
	 * 这个库在TDatasource索引中的索引
	 */
	private String dbIndex;
	/**
	 * 写池组
	 */
	private String[] writePool;

	/**
	 * 读池组
	 */
	private String[] readPool;
	/**
	 * 这个规则下的符合查询条件的表名列表
	 */
	private Set<String> tableNames ;
	/**
	 * 反向输出的sql,如果reverseOutput不为false,则这里不会为null.
	 * 但仍然可能为一个empty list
	 */
	private List<ReverseOutput> outputSQL;

	public String[] getWritePool() {
		return writePool;
	}
	public void setWritePool(String[] writePool) {
		this.writePool = writePool;
	}
	public String[] getReadPool() {
		return readPool;
	}
	public void setReadPool(String[] readPool) {
		this.readPool = readPool;
	}
	/**
	 * 返回表名的结果集
	 *
	 * @return 空Set if 没有表
	 * 		   表名结果集
	 */
	public Set<String> getTableNames() {
		return tableNames;
	}
	public void setTableNames(Set<String> tableNames) {
		this.tableNames = tableNames;
	}
	public List<ReverseOutput> getOutputSQL() {
		return outputSQL;
	}

	public void setOutputSQL(List<ReverseOutput> outputSQL) {
		this.outputSQL = outputSQL;
	}

	public void addOneTable(String table){
		if(tableNames == null){
			tableNames = new HashSet<String>();
		}
		tableNames.add(table);
	}
	public String getDbIndex() {
		return dbIndex;
	}
	public void setDbIndex(String dbIndex) {
		this.dbIndex = dbIndex;
	}
	@Override
	public String toString() {
		return "TargetDB [dbIndex=" + dbIndex + ", outputSQL=" + outputSQL
				+ ", readPool=" + Arrays.toString(readPool) + ", tableNames="
				+ tableNames + ", writePool=" + Arrays.toString(writePool)
				+ "]";
	}
}
