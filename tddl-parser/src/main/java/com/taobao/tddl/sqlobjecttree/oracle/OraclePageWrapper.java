package com.taobao.tddl.sqlobjecttree.oracle;

import java.util.List;
import java.util.Map;

import com.taobao.tddl.sqlobjecttree.Utils;
import com.taobao.tddl.sqlobjecttree.common.expression.ComparableExpression;
import com.taobao.tddl.sqlobjecttree.common.value.BindVar;

/*
 * @author guangxia
 * @since 1.0, 2009-9-2 下午11:28:14
 */
public abstract class OraclePageWrapper {

	protected ComparableExpression comparableExpression;

	public OraclePageWrapper(ComparableExpression comp) {
		this.comparableExpression = comp;
	}

	public StringBuilder regTableModifiable(String oraTabName, List<Object> list,
											StringBuilder sb) {
		sb = Utils.appendSQLListWithList(oraTabName, comparableExpression.getLeft(), sb, list);
		sb.append(comparableExpression.getRelationString());
		list.add(sb.toString());
		list.add(this);
		return new StringBuilder();
	}

	public String getSqlEle(Number limitFrom, Number limitTo,
							List<Object> param, boolean allowChangeValue,
							Map<Integer, Object> changeParam) {
		StringBuilder sb = new StringBuilder();
		if (comparableExpression.getRight() instanceof BindVar) {
			if (allowChangeValue) {
				modifyParam(limitFrom, limitTo, param, changeParam);
			}
			sb.append("?");
		} else {
			if (allowChangeValue) {
				sb.append(getSqlReturn(limitFrom, limitTo));
			} else {
				sb.append(comparableExpression.getRight().toString());
			}
		}
		return sb.toString();
	}

	protected abstract void modifyParam(Number skip, Number max, List<Object> param,Map<Integer, Object> changeParam);
	protected abstract String getSqlReturn(Number skip, Number max);

}
