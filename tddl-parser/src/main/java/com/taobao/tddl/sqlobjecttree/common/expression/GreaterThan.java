package com.taobao.tddl.sqlobjecttree.common.expression;

import java.util.List;

import com.taobao.tddl.common.sqljep.function.Comparative;
import com.taobao.tddl.sqlobjecttree.oracle.OracleFrom;

public class GreaterThan extends ComparableExpression {

	protected int getComparativeOperation() {
		return Comparative.GreaterThan;
	}

	public String getRelationString() {
		return " > ";
	}

	public StringBuilder regTableModifiable(String oraTabName, List<Object> list,
			StringBuilder sb) {
		if(this.isRownum()) {
			return  new OracleFrom(this).regTableModifiable(oraTabName, list, sb);
		} else {
			return super.regTableModifiable(oraTabName, list, sb);
		}
	}

}
