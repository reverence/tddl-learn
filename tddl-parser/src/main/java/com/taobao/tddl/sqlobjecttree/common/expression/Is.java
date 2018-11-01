package com.taobao.tddl.sqlobjecttree.common.expression;

import com.taobao.tddl.common.sqljep.function.Comparative;

public class Is extends ComparableExpression {

	protected int getComparativeOperation() {
		return Comparative.Equivalent;
	}

	public String getRelationString() {
		return " is ";
	}

}
