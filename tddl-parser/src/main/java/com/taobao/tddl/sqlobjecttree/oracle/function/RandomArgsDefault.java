package com.taobao.tddl.sqlobjecttree.oracle.function;

import com.taobao.tddl.sqlobjecttree.common.value.OperationBeforMultArgsFunction;

public class RandomArgsDefault extends OperationBeforMultArgsFunction{
	private String funcName = "RandomArgsDefault";
	
	@Override
	public String getFuncName() {
		return funcName;
	}

	public void setFuncName(String funcName) {
		this.funcName = funcName;
	}
}
