package com.taobao.tddl.common.exception.checked;

public class ParseSQLJEPException extends TDLCheckedExcption{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7724677712426352259L;
	public ParseSQLJEPException(Throwable th){
		super("调用sqlJep的parseExpression的时候发生错误"+th.getMessage());
	}

}
