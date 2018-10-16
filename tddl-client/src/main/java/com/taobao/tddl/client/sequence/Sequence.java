package com.taobao.tddl.client.sequence;

/**
 * 序列接口
 *
 * @author nianbing
 */
public interface Sequence {
    /**
     * 取得序列下一个值
     *
     * @return 返回序列下一个值
     * @throws SequenceException
     */
    long nextValue() throws SequenceException;
}
