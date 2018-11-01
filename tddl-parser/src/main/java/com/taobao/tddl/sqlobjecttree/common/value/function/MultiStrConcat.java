package com.taobao.tddl.sqlobjecttree.common.value.function;

import java.util.ArrayList;
import java.util.List;

import com.taobao.tddl.sqlobjecttree.Function;
import com.taobao.tddl.sqlobjecttree.Utils;
import com.taobao.tddl.sqlobjecttree.common.value.UnknowValueObject;

public class MultiStrConcat implements Function{
	List<Object> values = new ArrayList<Object>();
	
	public String getFuncName() {
		return "MULTI_STR";
	}
	
	public final Comparable<?> eval() {
		return this;
	}
	
	public int compareTo(Object o) {
		throw new IllegalStateException("should not be here");
	}
	
	public String getNestedColName() {
		String ret=null;
		
		return ret;
	}
	
	public Comparable<?> getVal(List<Object> args) {
		return UnknowValueObject.getUnknowValueObject();
	}
	
	public void appendSQL(StringBuilder sb) {
		Utils.appendConcatStr(values, sb);
	}
	
	@Override
	public StringBuilder regTableModifiable(String oraTabName, List<Object> list, StringBuilder sb) {
		sb = Utils.appendConcatStr(oraTabName, values, sb, list);

		return sb;
	}

	@Override
	public void setValue(List<Object> values) {
		this.values = values;
	}
}
