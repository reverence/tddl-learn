package com.taobao.tddl.sqlobjecttree.common.expression;

import com.taobao.tddl.common.sqljep.function.Comparative;

public class NotLike extends ComparableExpression {

	protected int getComparativeOperation() {
		return Comparative.NotLike;
	}

	public String getRelationString() {
		return " not like ";
	}


}
