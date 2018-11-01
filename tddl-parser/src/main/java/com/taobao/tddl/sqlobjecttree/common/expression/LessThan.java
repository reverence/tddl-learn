package com.taobao.tddl.sqlobjecttree.common.expression;

import java.util.List;

import com.taobao.tddl.common.sqljep.function.Comparative;
import com.taobao.tddl.sqlobjecttree.oracle.OracleTo;

public class LessThan extends ComparableExpression {

	protected int getComparativeOperation() {
		return Comparative.LessThan;
	}

	public String getRelationString() {
		return " < ";
	}

	public StringBuilder regTableModifiable(String oraTabName, List<Object> list,
			StringBuilder sb) {
		if(this.isRownum()) {
			return  new OracleTo(this).regTableModifiable(oraTabName, list, sb);
		} else {
			return super.regTableModifiable(oraTabName, list, sb);
		}
	}

}
