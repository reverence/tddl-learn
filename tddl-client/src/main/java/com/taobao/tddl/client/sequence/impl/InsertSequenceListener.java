/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.taobao.tddl.client.sequence.impl;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author zhaofeng.wang
 * @version $Id: InsertSequenceListener.java, v 0.1 2012-3-7 上午10:19:26 zhaofeng.wang Exp $
 */
public class InsertSequenceListener {
    private static final Log          logger         = LogFactory
            .getLog(InsertSequenceListener.class);
    private static int                threadPoolSize = 4;
    private static int                workQueueSize  = 1024;

    private static ThreadPoolExecutor insertSequenceLogExecutor;

    /**
     * 获得单例的线程池
     *
     * @return
     */
    public static ThreadPoolExecutor getThreadPoolExecutorInstance() {
        if (insertSequenceLogExecutor == null) {
            insertSequenceLogExecutor = new ThreadPoolExecutor(threadPoolSize, threadPoolSize, 0L,
                    TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(workQueueSize),
                    new RejectedExecutionHandler() {
                        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                            logger.warn("A insertSequenceLogTask discarded!");
                        }
                    });
        }
        return insertSequenceLogExecutor;
    }

    /**
     * 被调用的插入log的方法
     *
     * @param selectSql
     * @param insertSql
     * @param updateSql
     * @param sequenceName
     * @param index
     * @param newValue
     * @param gmt_modified
     */
    public static void insertSequenceLog(String sequenceName, int index, long newValue,
                                         long gmt_modified) {
        getThreadPoolExecutorInstance().execute(
                new InsertSequenceLogTask(sequenceName, index, newValue, gmt_modified));
    }
}
