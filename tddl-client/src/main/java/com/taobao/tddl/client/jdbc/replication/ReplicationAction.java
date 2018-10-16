package com.taobao.tddl.client.jdbc.replication;

/**
 * 需要以下action，在配置时组装：
 * 1. 读主库action
 * 2. 写日志action
 * 3. 删除日志action
 * 4. 其他自定义action
 *
 * @author linxuan
 *
 */
public interface ReplicationAction {
    boolean doAction();

    /**
     * 告诉总控器，是否需要在本action处理成功后保留日志。
     * 若所有的Action都不需要保留日志，则总控器会将可以删除日志的标志，设置为true
     * 不支持一个处理器要求一定删除日志的情况。任何情况下日志都可以不删除
     * 之所以将这个判断放在Action接口里，而不是一个总控的配置项，是考虑到它可能不是能够静态决定的。
     * 比如同样一个action有的时候需要保留日志（比如处理失败），有的时候需要删除日志（比如处理成功了）。
     * 只要有一个Action即使处理成功了也需要保留日志，或者
     * 只要有一个不需要保留日志的action，处理失败了（doAction返回false）总控器就会保留日志，否则删除
     */
    boolean isNeedReserveLog();
}
