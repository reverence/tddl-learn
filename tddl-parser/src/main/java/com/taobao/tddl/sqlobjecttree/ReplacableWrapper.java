package com.taobao.tddl.sqlobjecttree;

public interface ReplacableWrapper {
	public enum TYPE{
		INDEX,TABLE,VERSION_COL
	}
	TYPE getType();
	String getReplacedStr();
}
