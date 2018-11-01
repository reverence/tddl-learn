package com.taobao.tddl.sqlobjecttree.mysql;

import java.util.List;

import com.taobao.tddl.sqlobjecttree.SelectUpdate;

public class MySQLLockInShareMode implements SelectUpdate{

	public void appendSQL(StringBuilder sb) {
		sb.append(" LOCK IN SHARE MODE");
		
	}

	public StringBuilder regTableModifiable(String oraTabName,
			List<Object> list, StringBuilder sb) {
		sb.append(" LOCK IN SHARE MODE");
		return sb;
	}

}
