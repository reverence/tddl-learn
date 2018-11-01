package com.taobao.tddl.sqlobjecttree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.taobao.tddl.common.sqlobjecttree.Column;
import com.taobao.tddl.common.sqlobjecttree.SQLFragment;
import com.taobao.tddl.sqlobjecttree.common.ColumnImp;
import com.taobao.tddl.sqlobjecttree.common.value.function.Avg;
import com.taobao.tddl.sqlobjecttree.common.value.function.Count;
import com.taobao.tddl.sqlobjecttree.common.value.function.Max;
import com.taobao.tddl.sqlobjecttree.common.value.function.Min;
import com.taobao.tddl.sqlobjecttree.common.value.function.Sum;

public class Columns implements SQLFragment {
	private List<Column> columns = new ArrayList<Column>();
	private static final Map<Class<? extends Function>, GroupFunctionType> groupfunc = new HashMap<Class<? extends Function>, GroupFunctionType>();
	static {
		groupfunc.put(Count.class, GroupFunctionType.COUNT);
		groupfunc.put(Max.class, GroupFunctionType.MAX);
		groupfunc.put(Min.class, GroupFunctionType.MIN);
		groupfunc.put(Avg.class, GroupFunctionType.AVG);
		groupfunc.put(Sum.class, GroupFunctionType.SUM);

	}

	public Column[] getColumns() {
		return columns.toArray(new Column[columns.size()]);

	}

	public GroupFunctionType getSelectType(){
		for(Column col:columns){
			GroupFunctionType type=groupfunc.get(col.getNestClass());
			if(type!=null){
				if(columns.size()==1){
					return type;
				}else{
					return GroupFunctionType.NORMAL;
				}
			}
		}
		return GroupFunctionType.NORMAL;
	}

	public List<Column> getColumnsList() {
		return columns;
	}

	public void setColumns(Column[] columns) {
		this.columns.addAll(Arrays.asList(columns));
	}

	public void setColumns(Collection<Column> cols) {
		this.columns.addAll(cols);
	}

	public void addColumn(String table, String col, String alias) {
		columns.add(new ColumnImp(table, col, alias));
	}

	public void addColumn(Column col) {
		columns.add(col);
	}

	public void addColumnTabAndCol(String tab, String col) {
		columns.add(new ColumnImp(tab, col, null));
	}

	public void appendSQL(StringBuilder sb) {
		boolean firstElement = true;
		for (Column col : columns) {
			if (firstElement) {
				firstElement = false;
			} else {
				sb.append(",");
			}
			Utils.appendSQLList(col, sb);
		}
	}

	public StringBuilder regTableModifiable(String oraTabName,
			List<Object> list, StringBuilder sb) {
		boolean firstElement = true;
		for (Column col : columns) {
			if (firstElement) {
				firstElement = false;
			} else {
				sb.append(",");
			}
			sb = Utils.appendSQLListWithList(oraTabName, col, sb, list);
		}
		return sb;
	}

	public void appendAliasToColumnMap(Map<String, SQLFragment> sqlAliasMap) {
		for (Column col : columns) {
			if (col.getAlias() != null) {
				sqlAliasMap.put(col.getAlias(), col);
			}
		}
	}
}
