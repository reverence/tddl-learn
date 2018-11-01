package com.taobao.tddl.sqlobjecttree.traversalAction;

import java.util.List;

import com.taobao.tddl.sqlobjecttree.TableName;
import com.taobao.tddl.sqlobjecttree.common.TableNameImp;

public class TableNameTraversalAction implements TraversalSQLAction {
	private String snap=null;
	public void actionProformed(TraversalSQLEvent event) {
		List<TableName> tbNames=event.getCurrStatement().getTbNames();
		for (TableName tbName : tbNames) {
			String temp=null;
			if(tbName instanceof TableNameImp){
				temp=tbName.getTableName();
			}
			if (snap == null) {
				if (temp != null) {
					snap=temp.toLowerCase();
				}
			} else {
				if (temp!= null
						&& !snap.equals(tbName.getTableName().toLowerCase())) {
					throw new IllegalArgumentException(
							"sql语句中的表名不同，请保证所有sql语句的表名"
									+ "以及他们的schemaName相同，包括内嵌sql");
				}
			}
		}
	}
	public String getTableName(){
		return snap;
	}

}
