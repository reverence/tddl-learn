package com.taobao.tddl.sqlobjecttree.common;

import java.util.List;
import java.util.Map;

import com.taobao.tddl.common.sqlobjecttree.SQLFragment;
import com.taobao.tddl.sqlobjecttree.Function;
import com.taobao.tddl.sqlobjecttree.TableName;

public class TableNameFunctionImp  implements TableName {
	private String alias;
	private Function function;
	private boolean isOracle;
	
	public TableNameFunctionImp(Function func,String alias) {
		this.function=func;
		this.alias=alias;
	}
	public TableNameFunctionImp(Function func,String alias, boolean isOracle) {
		this.function=func;
		this.alias=alias;
		this.isOracle = isOracle;
	}
	
	public void appendAliasToSQLMap(Map<String, SQLFragment> map) {
		if(alias!=null){
			map.put(alias.toLowerCase(), this);
		}
	}

	public String getAlias() {
		return alias;
	}

	public String getTableName() {
		throw new IllegalArgumentException("should not be here");
	}

	public void setAlias(String alias) {
		this.alias=alias;
	}

	public void appendSQL(StringBuilder sb) {
		function.appendSQL(sb);
		if(alias != null) {
			sb.append(isOracle ? " " : " AS ");
			sb.append(alias);
		}
	}

	public Function getFunction(){
		return function;
	}
	public StringBuilder regTableModifiable(String oraTabName,
			List<Object> list, StringBuilder sb) {
		sb=function.regTableModifiable(oraTabName, list, sb);
		if(alias != null) {
			sb.append(isOracle ? " " : " AS ");
			sb.append(alias);
		}
		return sb;
		 
	}

}
