package com.taobao.tddl.client.jdbc.resultset;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.taobao.tddl.client.jdbc.TStatement;

/**
 * 调用rs.next永远返回false的空结果集。
 * 主要用于一些特殊的情况
 *
 * @author shenxun
 *
 */
public class EmptySimpleTResultSet extends AbstractTResultSet{

	public EmptySimpleTResultSet(TStatement statementProxy,
								 List<ResultSet> resultSets) {
		super(statementProxy, resultSets);
	}

	@Override
	public boolean next() throws SQLException {
		return false;
	}
}
