package com.taobao.tddl.common.jdbc;

import com.taobao.datasource.LocalTxDataSourceDO;
import com.taobao.datasource.resource.adapter.jdbc.local.LocalTxDataSource;

public class DataSourceConfig {

	private LocalTxDataSourceDO localTxDataSourceDO;

	private LocalTxDataSource localTxDataSource;

	private Integer weight=Integer.valueOf(10);
	
	private String type;

	public LocalTxDataSourceDO getLocalTxDataSourceDO() {
		return localTxDataSourceDO;
	}

	public void setLocalTxDataSourceDO(LocalTxDataSourceDO localTxDataSourceDO) {
		this.localTxDataSourceDO = localTxDataSourceDO;
	}

	public LocalTxDataSource getLocalTxDataSource() {
		return localTxDataSource;
	}

	public void setLocalTxDataSource(LocalTxDataSource localTxDataSource) {
		this.localTxDataSource = localTxDataSource;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
