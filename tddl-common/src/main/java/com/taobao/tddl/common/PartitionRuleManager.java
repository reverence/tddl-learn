package com.taobao.tddl.common;

/**
 * 分库规则管理
 *
 * @author nianbing
 */
public interface PartitionRuleManager {
	/**
	 * 根据主库数据库名和表名得到主键
	 *
	 * @param masterName 主库数据库名
	 * @param tableName 表名
	 * @return 返回主键，如果没有配置，则返回null。
	 */
	String getPrimaryKey(String masterName, String tableName);

	/**
	 * 根据主库数据库名和表名得到分库键
	 *
	 * @param masterName 主库数据库名
	 * @param tableName 表名
	 * @return 返回分库键，如果没有配置，则返回null。
	 */
	String getPartitionKey(String masterName, String tableName);

	/**
	 * 根据分库规则返回分库列表
	 *
	 * @param masterName 主库数据库名
	 * @param tableName 表名
	 * @param value 分库键值
	 * @return 返回分库列表，如果分库键值不匹配任何分库规则，则返回null。
	 */
	String[] getSlaves(String masterName, String tableName, Object value);
}
