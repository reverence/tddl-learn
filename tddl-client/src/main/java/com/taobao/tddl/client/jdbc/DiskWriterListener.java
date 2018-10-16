package com.taobao.tddl.client.jdbc;

import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import com.taobao.tddl.common.SqlType;
import com.taobao.tddl.common.sync.RowBasedReplicationContext;
import com.taobao.tddl.common.sync.RowBasedReplicationExecutor;

public class DiskWriterListener implements SqlExecuteListener {
	
	private Log logger =  LogFactory.getLog(DiskWriterListener.class);
	
	private Object diskWriter;
	private Method writeMethod;
	private Class<?> diskWriterClazz;
	
	private DataSource masterDataSource;
	private JdbcTemplate masterJdbcTemplate;
	
	private static final int DEFAULT_THREAD_POOL_SIZE = 16;
	private static final int DEFAULT_WORK_QUEUE_SIZE = 4096;
	private static final String SYNC_VERSION = "sync_version";

	private int threadPoolSize;
	private int workQueueSize;

	private ExecutorService executorService;
	
	public void init() {
		masterJdbcTemplate = new JdbcTemplate(masterDataSource);
		
		try {
			diskWriterClazz = diskWriter.getClass();
			writeMethod = diskWriterClazz.getDeclaredMethod("write", String.class, Map.class);
		} catch (SecurityException e) {
			throw new RuntimeException(e);
		} catch (NoSuchMethodException e) {
			throw new RuntimeException(e);
		}
		
		if (getThreadPoolSize() == 0) {
			setThreadPoolSize(DEFAULT_THREAD_POOL_SIZE);
		}

		if (getWorkQueueSize() == 0) {
			setWorkQueueSize(DEFAULT_WORK_QUEUE_SIZE);
		}

		executorService = new ThreadPoolExecutor(
				getThreadPoolSize(),
				getThreadPoolSize(),
				0L,
				TimeUnit.MILLISECONDS,
				new ArrayBlockingQueue<Runnable>(getWorkQueueSize()),
				new ThreadPoolExecutor.DiscardPolicy());
	}
	
	private RowBasedReplicationContext buildRowBasedReplicationContext(SqlExecuteEvent event) {
		RowBasedReplicationContext context = new RowBasedReplicationContext();
		context.setMasterJdbcTemplate(masterJdbcTemplate);
		context.setSqlType(event.getSqlType());
		context.setPrimaryKeyColumn(event.getPrimaryKeyColumn());
		context.setPrimaryKeyValue(event.getPrimaryKeyValue());
		context.setMasterLogicTableName(event.getLogicTableName());
		context.setMasterDatabaseShardColumn(event.getDatabaseShardColumn());
		context.setMasterDatabaseShardValue(event.getDatabaseShardValue());
		context.setMasterTableShardColumn(event.getTableShardColumn());
		context.setMasterTableShardValue(event.getTableShardValue());
		context.setSyncLogJdbcTemplate(event.getSyncLogJdbcTemplate());
		context.setSyncLogId(event.getSyncLogId());
		context.setAfterMainDBSqlExecuteTime(event.getAfterMainDBSqlExecuteTime());
		context.setSql(event.getSql());
		return context;
	}

	public void afterSqlExecute(List<SqlExecuteEvent> events) throws SQLException {
		for (SqlExecuteEvent event : events) {
			afterSqlExecute(event);
		}
	}
	
	public void afterSqlExecute(final SqlExecuteEvent event) throws SQLException {
		executorService.execute(new Runnable(){
			public void run() {
				SqlType sqlType = event.getSqlType();
				if(sqlType == SqlType.INSERT || sqlType == SqlType.UPDATE) {
					RowBasedReplicationContext context = buildRowBasedReplicationContext(event);
					Map<String, Object> masterRow = RowBasedReplicationExecutor.getMasterRow(context);
					HashMap<String, String> map = new HashMap<String, String>();
					for(Map.Entry<String, Object> entry : masterRow.entrySet()) {
						Object value = entry.getValue();
						if(value == null) {
							if(SYNC_VERSION.equals(entry.getKey())) {
								map.put(entry.getKey(), "0");
							}
						} else {
							map.put(entry.getKey(), value.toString());
						}
					}
					if(map.get(SYNC_VERSION) == null) {
						map.put(SYNC_VERSION, "0");
					}
					write(event.getLogicTableName(), map);
				}
			}});
	}

	public void afterTxCommit(List<SqlExecuteEvent> events) throws SQLException {
		for(SqlExecuteEvent event : events) {
			afterSqlExecute(event);
		}
	}

	public void afterTxRollback(List<SqlExecuteEvent> events)
			throws SQLException {
	}

	public void beforeSqlExecute(List<SqlExecuteEvent> events) throws SQLException {
	}

	public void setDiskWriter(Object diskWriter) {
		this.diskWriter = diskWriter;
	}

	private Object getDiskWriter() {
		return diskWriter;
	}
	
	protected void write(String table, Map<String, String> data) {
		if(logger.isDebugEnabled()) {
			logger.debug(table+":"+data.toString());
		}
		try {
			writeMethod.invoke(getDiskWriter(), table, data);
		} catch (Exception e) {
			logger.error("catch exception when call 'diskWriter.write'", e);
		}
	}

	public void setMasterDataSource(DataSource masterDataSource) {
		this.masterDataSource = masterDataSource;
	}

	public DataSource getMasterDataSource() {
		return masterDataSource;
	}

	public void beforeSqlExecute(SqlExecuteEvent event) throws SQLException {		
	}

	public void setThreadPoolSize(int threadPoolSize) {
		this.threadPoolSize = threadPoolSize;
	}

	public int getThreadPoolSize() {
		return threadPoolSize;
	}

	public void setWorkQueueSize(int workQueueSize) {
		this.workQueueSize = workQueueSize;
	}

	public int getWorkQueueSize() {
		return workQueueSize;
	}

	public void init(TDataSource config) {
	}

}
