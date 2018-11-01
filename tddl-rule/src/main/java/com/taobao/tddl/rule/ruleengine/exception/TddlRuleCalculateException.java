package com.taobao.tddl.rule.ruleengine.exception;

public class TddlRuleCalculateException extends RuntimeException {

    private static final long serialVersionUID = -1120481970898678244L;

    public TddlRuleCalculateException() {
        super();
    }

    public TddlRuleCalculateException(String message) {
        super(message);
    }

    public TddlRuleCalculateException(String message, Throwable cause) {
        super(message, cause);
    }
}
