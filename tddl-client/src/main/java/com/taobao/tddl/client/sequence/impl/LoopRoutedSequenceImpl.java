/**
 *
 */
package com.taobao.tddl.client.sequence.impl;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.taobao.tddl.client.RouteCondition;
import com.taobao.tddl.client.sequence.LoopRoutedSequence;
import com.taobao.tddl.client.sequence.LoopRoutedSequenceDAO;
import com.taobao.tddl.client.sequence.SequenceException;
import com.taobao.tddl.client.sequence.SequenceRange;

/**
 * 采用乐观锁实现的sequence
 * @author liang.chenl
 *
 */
public class LoopRoutedSequenceImpl  implements LoopRoutedSequence {
	private final Lock lock = new ReentrantLock();

	private static final int DEFAULT_STEP = 1000;
	private static final int DEFAULT_RETRY_TIMES = 150;
	private static final long DEFAULT_MAX_VALUE= Long.MAX_VALUE;

	/**
	 * 序列名称
	 */
	private String name;

	private LoopRoutedSequenceDAO loopRoutedSequenceDAO;

	private volatile SequenceRange currentRange;

	private int retryTimes = DEFAULT_RETRY_TIMES;

	private long maxValue = DEFAULT_MAX_VALUE;

	private long step = DEFAULT_STEP;

	/* (non-Javadoc)
	 * @see com.taobao.tddl.client.sequence.LoopRoutedSequence#nextValue(com.taobao.tddl.client.RouteCondition)
	 */
	public long nextValue(RouteCondition routeCondition)
			throws SequenceException {

		if (currentRange == null) {
			lock.lock();
			try {
				if (currentRange == null) {
					currentRange = nextRange(routeCondition);
				}
			} finally {
				lock.unlock();
			}
		}

		long value = currentRange.getAndIncrement();
		if (value == -1) {
			lock.lock();
			try {
				for (;;) {
					if (currentRange.isOver()) {
						currentRange = nextRange(routeCondition);
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


	protected SequenceRange nextRange(RouteCondition routeCondition) throws SequenceException {
		if (name == null) {
			throw new IllegalArgumentException("序列名称不能为空");
		}

		long oldValue;
		long newValue;
		long seqStartValue ;
		for (int i = 0; i < retryTimes + 1; ++i) {
			seqStartValue = oldValue = loopRoutedSequenceDAO.findCurrent(name, routeCondition);
			if (oldValue < 0) {
				StringBuilder message = new StringBuilder();
				message.append("Sequence value cannot be less than zero, value = ").append(oldValue);
				message.append(", please check seq table ");
				throw new SequenceException(message.toString());
			}
			if (oldValue >= maxValue) {
				//回归0
				newValue = 0 + step;
				seqStartValue = 0;
			} else {
				newValue = oldValue + step;
			}
			if (newValue >= maxValue) {
				newValue = 	maxValue;
			}

			int affectedRows = loopRoutedSequenceDAO.update(newValue, name, oldValue, routeCondition);
			if (affectedRows == 0) {
				continue;
			}

			return new SequenceRange(seqStartValue + 1, newValue);
		}

		throw new SequenceException("Retried too many times, retryTimes = " + retryTimes);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the loopRoutedSequenceDAO
	 */
	public LoopRoutedSequenceDAO getLoopRoutedSequenceDAO() {
		return loopRoutedSequenceDAO;
	}


	/**
	 * @param loopRoutedSequenceDAO the loopRoutedSequenceDAO to set
	 */
	public void setLoopRoutedSequenceDAO(LoopRoutedSequenceDAO loopRoutedSequenceDAO) {
		this.loopRoutedSequenceDAO = loopRoutedSequenceDAO;
	}


	/**
	 * @return the retryTimes
	 */
	public int getRetryTimes() {
		return retryTimes;
	}


	/**
	 * @param retryTimes the retryTimes to set
	 */
	public void setRetryTimes(int retryTimes) {
		this.retryTimes = retryTimes;
	}


	/**
	 * @return the maxValue
	 */
	public long getMaxValue() {
		return maxValue;
	}


	/**
	 * @param maxValue the maxValue to set
	 */
	public void setMaxValue(long maxValue) {
		this.maxValue = maxValue;
	}


	/**
	 * @return the step
	 */
	public long getStep() {
		return step;
	}


	/**
	 * @param step the step to set
	 */
	public void setStep(long step) {
		this.step = step;
	}


}
