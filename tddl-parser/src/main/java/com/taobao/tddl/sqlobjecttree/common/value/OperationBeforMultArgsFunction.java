package com.taobao.tddl.sqlobjecttree.common.value;

import java.util.List;

import com.taobao.tddl.common.sqlobjecttree.Column;
import com.taobao.tddl.sqlobjecttree.Function;
import com.taobao.tddl.sqlobjecttree.Utils;

public abstract class OperationBeforMultArgsFunction implements Function {
	protected Object[] args = new Object[0];

	public void setValue(List<Object> values) {
		args = values.toArray(new Object[0]);
	}

	public final Comparable<?> eval() {
		return this;
	}

	public String getNestedColName() {
		String ret = null;

		for(Object arg : args) {
			if (arg instanceof Column) {
				if (ret == null) {
					ret = ((Column) arg).getColumn();
				} else {
					throw new IllegalArgumentException("双参数函数中不能出现多个列名的函数");
				}
			}
		}

		return ret;
	}

	public abstract String getFuncName();
	public abstract void setFuncName(String funcName);

	public void appendSQL(StringBuilder sb) {
		sb.append(getFuncName());
		sb.append("(");
		if(args != null && args.length > 0) {
			for(Object arg : args) {
				Utils.appendSQLList(arg, sb);
				sb.append(",");
			}

			sb.deleteCharAt(sb.length()-1);
		}
		sb.append(")");
	}

	public StringBuilder regTableModifiable(String oraTabName,
											List<Object> list, StringBuilder sb) {
		sb.append(getFuncName());
		sb.append("(");
		if(args != null && args.length > 0) {
			for(Object arg : args) {
				Utils.appendSQLListWithList(oraTabName, arg, sb, list);
				sb.append(",");
			}

			sb.deleteCharAt(sb.length()-1);
		}
		sb.append(")");

		return sb;
	}

	public Comparable<?> getVal(List<Object> args) {
		return UnknowValueObject.getUnknowValueObject();
	}

	public int compareTo(Object o) {
		throw new IllegalStateException("should not be here");
	}
}
