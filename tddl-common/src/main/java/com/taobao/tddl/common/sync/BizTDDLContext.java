package com.taobao.tddl.common.sync;

import java.util.Arrays;

import org.springframework.jdbc.core.JdbcTemplate;

public class BizTDDLContext{
	public BizTDDLContext(){/* 便于搜索new的地方 */};
	private JdbcTemplate masterJdbcTemplate; //主库组的TDataSource对应的JdbcTemplate
	private String masterColumns; //逗号分隔的主库列名
	private SlaveInfo[] slaveInfos;

	public SlaveInfo[] getSlaveInfos() {
		return slaveInfos;
	}

	public void setSlaveInfos(SlaveInfo[] slaveInfos) {
		this.slaveInfos = slaveInfos;
	}

	public JdbcTemplate getMasterJdbcTemplate() {
		return masterJdbcTemplate;
	}

	public void setMasterJdbcTemplate(JdbcTemplate masterJdbcTemplate) {
		this.masterJdbcTemplate = masterJdbcTemplate;
	}

	public String getMasterColumns() {
		return this.masterColumns;
	}

	@Override
	public String toString() {
		return new StringBuilder("{class:").append(getClass().getSimpleName()).append(",masterJdbcTemplate:").append(
				this.masterJdbcTemplate).append(",slaveInfos:").append(Arrays.toString(this.slaveInfos)).toString();
	}
}
