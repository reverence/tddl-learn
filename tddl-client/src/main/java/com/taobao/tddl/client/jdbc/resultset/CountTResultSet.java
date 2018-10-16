package com.taobao.tddl.client.jdbc.resultset;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;

import com.taobao.tddl.client.jdbc.TStatement;

public class CountTResultSet extends AbstractTResultSet {
	private long value;
	private int cursor;

	public CountTResultSet(TStatement statementProxy, List<ResultSet> resultSets) throws SQLException {
		super(statementProxy, resultSets);
	}

	@Override
	public boolean next() throws SQLException {
		if (cursor > 0) {
			return false;
		}
		reducer();
		cursor++;
		return true;
	}
	
	protected ResultSet reducer() throws SQLException {
		long sum = 0;
		for (ResultSet resultSet : actualResultSets) {
			resultSet.next();
			sum += resultSet.getLong(1);
		}
		this.value = sum;
		return null;
	}

	private void checkCursor() throws SQLException {
		if (cursor != 1) {
			throw new SQLException();
		}
	}

	private void checkIndex(int columnIndex) throws SQLException {
		checkCursor();
		if (columnIndex < 1) {
			throw new SQLException("Column index out of range, " + columnIndex + " < 1");
		} else if (columnIndex > 1) {
			throw new SQLException("Column index out of range, " + columnIndex + " > 1");
		}
	}

	@Override
	public int getInt(int columnIndex) throws SQLException {
		checkIndex(columnIndex);
		return (int) value;
	}

	@Override
	public long getLong(int columnIndex) throws SQLException {
		checkIndex(columnIndex);
		return value;
	}

	@Override
	public int findColumn(String columnName) throws SQLException {
		if (!columnName.equalsIgnoreCase(actualResultSets.get(0).getMetaData().getColumnName(1))) {
			throw new SQLException("Column '" + columnName + "' not found");
		}
		checkCursor();
		return 1;
	}

	@Override
	public int getInt(String columnName) throws SQLException {
		return getInt(findColumn(columnName));
	}

	@Override
	public long getLong(String columnName) throws SQLException {
		return getLong(findColumn(columnName));
	}

	@Override
	public Object getObject(int columnIndex) throws SQLException {
		return Long.valueOf(getLong(columnIndex));
	}

	@Override
	public Object getObject(String columnName) throws SQLException {
		return Long.valueOf(getLong(columnName));
	}

	@Override
	public ResultSetMetaData getMetaData() throws SQLException {
		return actualResultSets.get(0).getMetaData();
	}

	@Override
	public boolean wasNull() throws SQLException {
		return false;
	}
}
