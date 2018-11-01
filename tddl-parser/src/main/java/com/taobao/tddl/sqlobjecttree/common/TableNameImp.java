package com.taobao.tddl.sqlobjecttree.common;

import java.util.List;
import java.util.Map;

import com.taobao.tddl.common.sqlobjecttree.SQLFragment;
import com.taobao.tddl.sqlobjecttree.TableName;
import com.taobao.tddl.sqlobjecttree.TableWrapper;


public class TableNameImp implements TableName{
	private String alias;
	private String tablename;
	private String schemaName;
	private boolean isOracle;

	public TableNameImp() {}
	public TableNameImp(boolean isOracle) {
		this.isOracle = isOracle;
	}

	public String getSchemaName() {
		return schemaName;
	}
	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}
	public String getTableName() {
		return tablename;
	}

	public void appendParams(List<Object> params) {
	}
	public void appendSQL(StringBuilder sb) {
		if (getSchemaName() != null) {
			sb.append(schemaName).append(".");
		}
		sb.append(tablename);
		if (getAlias() != null) {
			sb.append(isOracle ? " " : " as ").append(getAlias());
		}
	}

	@Override
	public int hashCode() {
		StringBuilder sb=new StringBuilder();
		sb.append(this.schemaName).append(".").append(this.tablename);
		return sb.toString().hashCode();

	}
	public boolean equals(Object obj) {
		if(obj==null){
			return false;
		}
		if(!(obj instanceof TableNameImp)){
			return false;
		}
		TableNameImp imp=(TableNameImp)obj;
		return imp.tablename.equals(this.tablename)&&imp.schemaName.equals(this.schemaName);
	}

	public String getTableNameStr(){
		return tablename;
	}
	//	public void regTableModifiable(String oraTabName,
//			List<ModifiableTableName> list) {
//		if(tablename!=null&&tablename.equalsIgnoreCase(oraTabName)){
//			list.add(this);
//		}
//	}
	public StringBuilder regTableModifiable(String oraTabName, List<Object> list,
											StringBuilder sb) {
		if (getSchemaName() != null) {
			sb.append(schemaName).append(".");
		}
		if(tablename!=null&&tablename.equalsIgnoreCase(oraTabName)){
			list.add(sb.toString());
			TableWrapper wr=new TableWrapper();
			wr.setOriTable(tablename);
			list.add(wr);
			sb=new StringBuilder();
		}else if(tablename!=null){
			sb.append(tablename);
		}else{
			throw new IllegalArgumentException("表名对象中不能缺少表名");
		}
		if (getAlias() != null) {
			sb.append(isOracle ? " " : " as ").append(getAlias());
		}
		return sb;
	}
	public void appendAliasToSQLMap(Map<String, SQLFragment> map) {
		if(getAlias()!=null){
			map.put(getAlias().toLowerCase(), this);
		}
	}
}
