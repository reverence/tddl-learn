/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2011 All Rights Reserved.
 */
package com.taobao.tddl.client.sequence.impl;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.taobao.tddl.client.sequence.Sequence;
import com.taobao.tddl.client.sequence.SequenceException;
import com.taobao.tddl.client.sequence.SequenceRange;

/**
 *
 * 高可用 sequence 序列实现,sequence包含名称、当前值、步长、最小值、最大值、创建时间和修改时间等属性。
 * 采用乐观锁的方式实现从db获取当前sequence段，取完缓存起来，供业务使用
 *
 * @author zhaofeng.wang
 * @version $Id: MultipleSequenceDao.java, v 0.1 2011-12-20 下午05:32:06 zhaofeng.wang Exp $
 */
public class MultipleSequence implements Sequence {
    private static final Log       logger            = LogFactory.getLog(MultipleSequence.class);
    private final Lock             lock              = new ReentrantLock();

    /** 默认步长 */
    private static final int       DEFAULT_STEP      = 1000;
    /**默认sequence的最小值*/
    private static final long      DEFAULT_MIN_VALUE = 0;
    /**默认sequence的最大值*/
    private static final long      DEFAULT_MAX_VALUE = Long.MAX_VALUE;
    /**内步长*/
    private int                    innerStep         = DEFAULT_STEP;
    /** 最小值*/
    private long                   minValue          = DEFAULT_MIN_VALUE;
    /** 最大值*/
    private long                   maxValue          = DEFAULT_MAX_VALUE;
    /**序列名称*/
    private String                 sequenceName;
    /** sequence 段*/
    private volatile SequenceRange currentRange;
    /** 数据源的包装器*/
    private MultipleSequenceDao    sequenceDao;

    /**
     * 默认构造方法
     */
    public MultipleSequence() {

    }

    /**
     * 在db里如果存在记录的情况下，调用的构造函数,此时不需要再初始化
     * @param sequenceDao
     * @param name    序列名称
     * @param innerStep 内步长
     * @param minValue  最小值
     * @param maxValue  最大值
     */

    public MultipleSequence(MultipleSequenceDao sequenceDao, String name, long minValue,
                            long maxValue, int innerStep) {
        this.sequenceDao = sequenceDao;
        this.sequenceName = name;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.innerStep = innerStep;
    }

    /**
     * 初始化各个数据源的sequence，如果不存在记录就插入一条到db
     *
     * @throws SequenceException
     */
    public void init() throws SequenceException {
        if (sequenceDao == null) {
            throw new SequenceException("please make sure the sequence no null!");
        }
        //初始化该sequence
        try {
            sequenceDao.initSequenceRecord(sequenceName, minValue, maxValue, innerStep);
        } catch (SequenceException e) {
            logger.error("init the multiple sequence failed!", e);
        }
    }

    /**
     * 获取sequence值
     * @see com.taobao.tddl.client.sequence.Sequence#nextValue()
     */
    public long nextValue() throws SequenceException {
        if (currentRange == null) {
            lock.lock();
            //获取一个sequence段
            try {
                if (currentRange == null) {
                    currentRange = sequenceDao.nextRange(sequenceName, minValue, maxValue,
                            innerStep);
                    if (logger.isDebugEnabled()) {
                        logger.debug("get the sequence range, from " + currentRange.getMin()
                                + " to " + currentRange.getMax());
                    }
                }
            } finally {
                lock.unlock();
            }
        }

        long value = currentRange.getAndIncrement();
        //如果获取sequence失败
        if (value == -1) {
            lock.lock();
            try {
                for (;;) {
                    if (currentRange.isOver()) {
                        currentRange = sequenceDao.nextRange(sequenceName, minValue, maxValue,
                                innerStep);
                        if (logger.isDebugEnabled()) {
                            logger.debug("after over,get the sequence range, from "
                                    + currentRange.getMin() + " to " + currentRange.getMax());
                        }
                    }

                    value = currentRange.getAndIncrement();
                    if (value == -1) {
                        continue;
                    }

                    break;
                }
            } finally {
                lock.unlock();
            }
        }

        if (value < 0) {
            throw new SequenceException("Sequence value overflow, value = " + value);
        }

        return value;
    }

    /**
     * Getter method for property <tt>innerStep</tt>.
     *
     * @return property value of innerStep
     */
    public int getInnerStep() {
        return innerStep;
    }

    /**
     * Setter method for property <tt>innerStep</tt>.
     *
     * @param innerStep value to be assigned to property innerStep
     */
    public void setInnerStep(int innerStep) {
        this.innerStep = innerStep;
    }

    /**
     * Getter method for property <tt>minValue</tt>.
     *
     * @return property value of minValue
     */
    public long getMinValue() {
        return minValue;
    }

    /**
     * Setter method for property <tt>minValue</tt>.
     *
     * @param minValue value to be assigned to property minValue
     */
    public void setMinValue(long minValue) {
        this.minValue = minValue;
    }

    /**
     * Getter method for property <tt>maxValue</tt>.
     *
     * @return property value of maxValue
     */
    public long getMaxValue() {
        return maxValue;
    }

    /**
     * Setter method for property <tt>maxValue</tt>.
     *
     * @param maxValue value to be assigned to property maxValue
     */
    public void setMaxValue(long maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * Getter method for property <tt>sequenceName</tt>.
     *
     * @return property value of sequenceName
     */
    public String getSequenceName() {
        return sequenceName;
    }

    /**
     * Setter method for property <tt>sequenceName</tt>.
     *
     * @param sequenceName value to be assigned to property sequenceName
     */
    public void setSequenceName(String sequenceName) {
        this.sequenceName = sequenceName;
    }

    /**
     * Getter method for property <tt>currentRange</tt>.
     *
     * @return property value of currentRange
     */
    public SequenceRange getCurrentRange() {
        return currentRange;
    }

    /**
     * Setter method for property <tt>currentRange</tt>.
     *
     * @param currentRange value to be assigned to property currentRange
     */
    public void setCurrentRange(SequenceRange currentRange) {
        this.currentRange = currentRange;
    }

    /**
     * Getter method for property <tt>sequenceDao</tt>.
     *
     * @return property value of sequenceDao
     */
    public MultipleSequenceDao getSequenceDao() {
        return sequenceDao;
    }

    /**
     * Setter method for property <tt>sequenceDao</tt>.
     *
     * @param sequenceDao value to be assigned to property sequenceDao
     */
    public void setSequenceDao(MultipleSequenceDao sequenceDao) {
        this.sequenceDao = sequenceDao;
    }
}
