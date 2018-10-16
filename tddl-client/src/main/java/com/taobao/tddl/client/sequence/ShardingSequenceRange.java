package com.taobao.tddl.client.sequence;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 支持分表策略的Sequence数据段。
 *
 * @author zhengjiaqing878 [ http://jiaqing.me ]
 * @version $Id: ShardingSequenceRange.java, v 0.1 2016年1月22日 下午4:04:48 zhengjiaqing Exp $
 */
public class ShardingSequenceRange {
    //    private static final Log logger = LogFactory.getLog(ShardingSequenceRange.class);

    //~~~ 当前数据表状态：

    private final long       id;
    private final long       origValue;
    private final long       maxValue;
    private final long       minValue;
    private final int        cacheSize;
    private final long       origVersion;

    //~~~ 当前内存状态：
    /** 当前段允许的最大值 */
    private long             currentMax;
    /** 当前可用的值（还未使用） */
    private AtomicLong       currentValue;
    /** 是否已经溢出 */
    private volatile boolean over = false;

    /**
     * 构造一个数据段。
     * @param id
     * @param origValue
     * @param maxValue
     * @param minValue
     * @param cacheSize
     * @param origVersion
     */
    public ShardingSequenceRange(long id, long origValue, long maxValue, long minValue,
                                 int cacheSize, long origVersion) {
        if (origValue < 0 || maxValue < 0 || minValue < 0 || maxValue <= minValue || cacheSize < 0) {
            throw new IllegalArgumentException("Illegal args from db: id=" + id + ", value="
                    + origValue + ", maxValue=" + maxValue
                    + ", minValue=" + minValue + ", cacheSize="
                    + cacheSize + ", version=" + origVersion);
        }

        this.id = id;
        this.origValue = origValue;
        this.maxValue = maxValue;
        this.minValue = minValue;
        this.cacheSize = cacheSize;
        this.origVersion = origVersion;

        // 根据数据表最新状态做调整
        this.currentMax = this.origValue + this.cacheSize;
        // 最小值已经超过MAX，直接重置
        if (this.origValue + 1 > this.maxValue) {
            this.currentValue = new AtomicLong(this.minValue);
            this.currentMax = this.currentValue.get() + this.cacheSize;
        }
        // 当前段最大值没有超过MAX
        else if (this.currentMax <= this.maxValue) {
            this.currentValue = new AtomicLong(this.origValue + 1);
        }
        // 当前段最大值已经超过MAX，当前段最大值取MAX
        else if (this.currentMax > this.maxValue) {
            this.currentValue = new AtomicLong(this.origValue + 1);
            this.currentMax = this.maxValue;
        }
        // 不存在这种情况
        else {
            throw new IllegalArgumentException("Illegal args=" + toString());
        }
    }

    /**
     * 获取下一个值。
     *
     * @return
     */
    public long getAndIncrement() {
        long newValue = this.currentValue.getAndIncrement();
        if (newValue > this.currentMax) {
            over = true;
            return -1;
        }

        return newValue;
    }

    /**
     * 输出对象详情。
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id=" + this.id);
        sb.append(",maxValue=" + this.maxValue);
        sb.append(",minValue=" + this.minValue);
        sb.append(",cacheSize=" + this.cacheSize);
        sb.append(",origValue=" + this.origValue);
        sb.append(",origVersion=" + this.origVersion);
        sb.append(",currentValue=" + this.currentValue.get());
        sb.append(",currentMax=" + this.currentMax);
        return sb.toString();
    }

    /**
     * 将自身状态添加到Cat监控。
     *
     * @param trx
     */
    /*public void addCat(Transaction trx) {
        trx.addData("id", this.id);
        trx.addData("maxValue", this.maxValue);
        trx.addData("minValue", this.minValue);
        trx.addData("cacheSize", this.cacheSize);
        trx.addData("origValue", this.origValue);
        trx.addData("origVersion", this.origVersion);
        trx.addData("currentValue", this.currentValue);
        trx.addData("currentMax", this.currentMax);
    }*/

    //~~~ getters:

    public long getId() {
        return this.id;
    }

    public long getCurrentMax() {
        return this.currentMax;
    }

    public boolean isOver() {
        return this.over;
    }

    public long getOrigVersion() {
        return this.origVersion;
    }

    /**
     * 注意，currentValue表示当前可用的值（还未使用）
     *
     * @return
     */
    public long getCurrentValue() {
        return this.currentValue.get();
    }
}
