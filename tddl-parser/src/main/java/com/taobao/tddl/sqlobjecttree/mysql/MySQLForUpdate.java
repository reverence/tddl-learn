package com.taobao.tddl.sqlobjecttree.mysql;

import java.util.List;

import com.taobao.tddl.sqlobjecttree.SelectUpdate;

public class MySQLForUpdate implements SelectUpdate{

	public void appendSQL(StringBuilder sb) {
		sb.append(" FOR UPDATE");
	}

	public StringBuilder regTableModifiable(String oraTabName,
			List<Object> list, StringBuilder sb) {
		sb.append(" FOR UPDATE");
		return sb;
	}
}
