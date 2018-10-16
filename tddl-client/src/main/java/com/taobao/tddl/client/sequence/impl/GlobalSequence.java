package com.taobao.tddl.client.sequence.impl;

import com.taobao.tddl.client.sequence.SequenceException;

/**
 * 不依赖于数据库,参见https://blog.csdn.net/chengzhang1989/article/details/81100715
 */
public class GlobalSequence {

    /**
     * 开始时间2018-01-01
     */
    private long twepoch = 1514736000000L;

    /**
     * 业务线标识 4bit
     */
    private long businessIdBits = 4l;
    /**
     * 机器id 9bit
     */
    private long machineIdBits = 9l;
    /**
     * 预留 4bit
     */
    private long reservedBits = 4l;

    /**
     * 序列号 6bit
     */
    private long sequenceBits = 6l;

    /**
     * 机器节点 向左移sequenceBits+reservedBits位
     */
    private long machineIdShift;
    /**
     * 业务节点 machineIdShift+machineIdBits
     */
    private long businessIdShift;
    /**
     * 时间戳
     */
    private long timestampLeftShift;

    /**
     * 序列掩码
     */
    private long sequenceMask;


    private long maxMachineId;

    private long maxBusinessId;

    /**
     * 毫秒内序列
     */
    private long sequence;

    /**
     * 上次生成id的时间戳
     */
    private long lastTimestamp = -1L;

    public GlobalSequence(long businessIdBits,long machineIdBits,long reservedBits,long sequenceBits){
        this.businessIdBits = businessIdBits;
        this.machineIdBits = machineIdBits;
        this.reservedBits = reservedBits;
        this.sequenceBits = sequenceBits;

        this.machineIdShift = sequenceBits+reservedBits;
        this.businessIdShift = machineIdShift+machineIdBits;
        this.timestampLeftShift = businessIdShift+businessIdBits;
        this.sequenceMask = -1L ^ (-1L << sequenceBits);
        this.maxMachineId = -1L ^ (-1L << machineIdBits);
        this.maxBusinessId = -1L ^ (-1L << businessIdBits);
    }

    /**
     * 需要自行确保businessId和 machineId在配置的范围内
     * @param businessId
     * @param machineId
     * @return
     * @throws SequenceException
     */
    public synchronized long nextValue(long businessId,long machineId) throws SequenceException {

        if(businessId<0 || businessId>maxBusinessId){
            throw new SequenceException("invalid businessId:"+businessId);
        }
        if(machineId<0 || machineId>maxMachineId){
            throw new SequenceException("invalid machineId:"+machineId);
        }

        long timestamp = System.currentTimeMillis();
        // 如果是同一时间生成的，则进行毫秒内序列
        if (this.lastTimestamp == timestamp) {
            this.sequence = (this.sequence + 1) & this.sequenceMask;
            if (this.sequence == 0) {// 毫秒内序列溢出
                timestamp = this.tilNextMillis(this.lastTimestamp);// 阻塞到下一个毫秒,获得新的时间戳
            }
        } else {
            // 时间戳改变，毫秒内序列重置
            this.sequence = 0;
        }
        // 如果当前时间小于上一次ID生成的时间戳，说明系统时钟回退过这个时候应当抛出异常
        if (timestamp < this.lastTimestamp) {
            throw new SequenceException(String.format("Clock moved backwards. Refusing to generate id for %d milliseconds",
                    this.lastTimestamp - timestamp));
        }

        this.lastTimestamp = timestamp;
        long nextId = (((timestamp - twepoch) << timestampLeftShift))
                | (businessId << this.businessIdShift) |(machineId<<this.machineIdShift) | (this.sequence);

        return nextId;
    }


    private long tilNextMillis(final long lastTimestamp) {
        long timestamp = System.currentTimeMillis();
        while (timestamp <= lastTimestamp) {
            timestamp = System.currentTimeMillis();
        }
        return timestamp;
    }


    public void setBusinessIdBits(long businessIdBits) {
        this.businessIdBits = businessIdBits;
    }

    public void setMachineIdBits(long machineIdBits) {
        this.machineIdBits = machineIdBits;
    }

    public void setReservedBits(long reservedBits) {
        this.reservedBits = reservedBits;
    }

    public void setSequenceBits(long sequenceBits) {
        this.sequenceBits = sequenceBits;
    }
}
