package com.taobao.tddl.client.jdbc;

import java.util.concurrent.ThreadPoolExecutor;

import com.taobao.tddl.parser.ParserCache;

/**
 * TDDL 内部健康状态访问接口
 *
 * @author linxuan
 *
 */
public class TDataSourceState {
	private ThreadPoolExecutor replicationExecutor;
	private Integer replicationQueueSize;

	public int getReplicationMaxPoolSize() {
		return replicationExecutor == null ? null : replicationExecutor.getMaximumPoolSize();
	}

	public Integer getReplicationMinPoolSize() {
		return replicationExecutor == null ? null : replicationExecutor.getCorePoolSize();
	}

	public Integer getReplicationCurrentQueueSize() {
		return replicationExecutor == null ? null : replicationExecutor.getQueue().size();
	}

	public Integer getReplicationMaxQueueSize() {
		return replicationQueueSize;
	}

	public void getParserCacheSize() {
		ParserCache.instance().size();
	}

	/**
	 * Setter
	 */
	public void setReplicationExecutor(ThreadPoolExecutor replicationExecutor) {
		this.replicationExecutor = replicationExecutor;
	}

	public void setReplicationQueueSize(Integer replicationQueueSize) {
		this.replicationQueueSize = replicationQueueSize;
	}
}
