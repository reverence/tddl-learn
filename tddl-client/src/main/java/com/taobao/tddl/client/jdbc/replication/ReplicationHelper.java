package com.taobao.tddl.client.jdbc.replication;

import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.taobao.tddl.client.jdbc.TDataSource;
import com.taobao.tddl.common.sync.BizTDDLContext;
import com.taobao.tddl.common.sync.SlaveInfo;

/**
 * 行复制辅助类
 * @author linxuan
 */
public class ReplicationHelper {

	/**
	 * 用TDataSource中的master4replication/slave4replication
	 * 初始化复制配置结构BizTDDLContext中的主库读库数据源
	 * @param tds 应用的TDataSource数据源
	 * @param logicTableName2TDDLContext: key：逻辑表名；value：复制配置
	 */
	public static void initReplicationContextByTDataSource(TDataSource tds,
														   Map<String, BizTDDLContext> logicTableName2TDDLContext) {

		//用TDataSourceConfig初始化logicTableName2TDDLContext
		TDataSource master4replication = tds.cloneReplicationMaster();
		TDataSource slave4replication = tds.cloneReplicationSlave();

		for (Map.Entry<String, BizTDDLContext> e : logicTableName2TDDLContext.entrySet()) {
			BizTDDLContext rplCtx = e.getValue();
			rplCtx.setMasterJdbcTemplate(new JdbcTemplate(master4replication));
			for (SlaveInfo slaveInfo : rplCtx.getSlaveInfos()) {
				if (slaveInfo.getName() == null) {
					slaveInfo.setName(e.getKey());
				}
				if(slaveInfo.getJdbcTemplate() != null){
					continue;
				}
				if (slaveInfo.getDataSourceName() == null) {
					//默认复制到分库
					slaveInfo.setJdbcTemplate(new JdbcTemplate(slave4replication));
					if (slaveInfo.getType() == null) {
						slaveInfo.setType(slave4replication.getReadDispatcher().getDBType().toString());
					}
				} else {
					//目标不是slave库时，应用的主TDataSource中要配置目标库到dataSourcePool中，key作为此处的dataSourceName
					slaveInfo.setJdbcTemplate(new JdbcTemplate(tds.getDataSource(slaveInfo.getDataSourceName())));
				}
				//当目标不是数据库时，应该由其他类型的listener处理
			}
		}
	}
}
