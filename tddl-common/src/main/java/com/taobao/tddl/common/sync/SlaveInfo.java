package com.taobao.tddl.common.sync;

import java.util.Arrays;

import org.springframework.jdbc.core.JdbcTemplate;

import com.taobao.tddl.common.DBType;

/**
 * <master name="feed_receive">
 * <master-column></master-column>
 *	<slaves>
 *		<slave name="feed_send" type="oracle">
 *			<data-source-name>REP_SLAVE_ORACLE</data-source-name>     <!-- mandatory -->
 *          <database-shard-column>xxx</database-shard-column>        <!-- optional -->
 *			<table-shard-column>RATER_UID</table-shard-column>        <!-- optional -->
 *          <columns>                                                 <!-- optional -->
 *             <column>id</column>
 *             <column>name</column>
 *          </columns>
 *		</slave>
 *	</slaves>
 * </master>
 *
 * setter中保证databaseShardColumn、tableShardColumn、name、type、columns都为小写
 *
 */
public class SlaveInfo {
	private String name; //备库逻辑表名，Setter方法保证了小写
	private DBType dbType; //备库数据库类型：oracle/mysql（SyncConstants.DATABASE_TYPE_MYSQL/DATABASE_TYPE_ORACLE）
	private String databaseShardColumn; //备库分库小写列名，Setter方法保证了小写
	private String tableShardColumn; //备库分表小写列名，Setter方法保证了小写
	private String[] columns; //需要复制的列的小写列名，缺省为主库的全部列；Setter方法保证了小写
	private JdbcTemplate jdbcTemplate; //备库TDataSource对应的JdbcTemplate，根据dataSourceName手工设入
	/**
	 * 备库TDataSource名称，
	 * 1.兼容旧的xml文件的配置方式，新的spring方式不用配
	 * 2.复制配置推送的方式下，不默认复制到分库时，用来指定主TDS中的dbIndex，以复制到对应的数据库中
	 */
	private String dataSourceName;

	/**
	 * 以下属性，默认false
	 */
	private boolean isDisableUpdate; //是否关闭update
	private boolean isDisableInsert; //是否关闭insert
	private boolean isNoSyncVersion; //是否不关心sync_version(主库或备库没有sync_version字段的时候设为true)
	/**
	 * true 更新时，若主库有记录而分库记录不存在，自动插入分库，返回成功
	 * false 更新时，若主库有记录而分库记录不存在，抛出异常。日志会保留。 默认false
	 */
	private boolean isAutoInsert;    //更新时，若主库有记录而分库记录不存在，是否自动插入分库。否则报错

	public String toString() {
		StringBuilder buffer = new StringBuilder();
		buffer.append("Slave {").append("\n");
		buffer.append("name: ").append(name).append("\n");
		buffer.append("dbType: ").append(dbType).append("\n");
		buffer.append("dataSourceName: ").append(dataSourceName).append("\n");
		if (databaseShardColumn != null) {
			buffer.append("databaseShardColumn: ").append(databaseShardColumn).append("\n");
		}
		if (tableShardColumn != null) {
			buffer.append("tableShardColumn: ").append(tableShardColumn).append("\n");
		}
		if (columns != null) {
			buffer.append("columns: ").append(Arrays.asList(columns)).append("\n");
		}
		buffer.append("}").append("\n");

		return buffer.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.toLowerCase();
	}

	public DBType getDbType() {
		return dbType;
	}

	public String getType() {
		return dbType == null ? null : dbType.toString();
	}

	public void setType(String type) {
		if(type != null){
			type = type.toUpperCase();
		}
		this.dbType = DBType.valueOf(type);
	}

	public String getDataSourceName() {
		return dataSourceName;
	}

	public void setDataSourceName(String dataSourceName) {
		this.dataSourceName = dataSourceName;
	}

	public String getDatabaseShardColumn() {
		return databaseShardColumn;
	}

	public void setDatabaseShardColumn(String databaseShardColumn) {
		this.databaseShardColumn = databaseShardColumn.toLowerCase();
	}

	public String getTableShardColumn() {
		return tableShardColumn;
	}

	public void setTableShardColumn(String tableShardColumn) {
		this.tableShardColumn = tableShardColumn.toLowerCase();
	}

	public String[] getColumns() {
		return columns;
	}

	public void setColumns(String[] columns) {
		this.columns = columns;
		for (int i = 0; i < this.columns.length; i++) {
			this.columns[i] = this.columns[i].toLowerCase();
		}
	}

	public void setCommaSeparatedColumns(String commaSeparatedColumns){
		this.columns = commaSeparatedColumns.split(",");
		for (int i = 0; i < this.columns.length; i++) {
			this.columns[i] = this.columns[i].toLowerCase();
		}
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate slaveJdbcTemplate) {
		this.jdbcTemplate = slaveJdbcTemplate;
	}

	public boolean isDisableUpdate() {
		return isDisableUpdate;
	}

	public void setDisableUpdate(boolean isDisableUpdate) {
		this.isDisableUpdate = isDisableUpdate;
	}

	public boolean isDisableInsert() {
		return isDisableInsert;
	}

	public void setDisableInsert(boolean isDisableInsert) {
		this.isDisableInsert = isDisableInsert;
	}

	/**
	 * TODO:NO sync version还需要能够最终决定主库是否需要sync_version.
	 *
	 * @return
	 */
	public boolean isNoSyncVersion() {
		return isNoSyncVersion;
	}

	public void setNoSyncVersion(boolean isNoSyncVersion) {
		this.isNoSyncVersion = isNoSyncVersion;
	}

	public boolean isAutoInsert() {
		return isAutoInsert;
	}

	public void setAutoInsert(boolean isAutoInsert) {
		this.isAutoInsert = isAutoInsert;
	}

}
