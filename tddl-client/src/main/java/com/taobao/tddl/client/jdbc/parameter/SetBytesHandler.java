package com.taobao.tddl.client.jdbc.parameter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SetBytesHandler implements ParameterHandler {
	public void setParameter(PreparedStatement stmt, Object[] args)
			throws SQLException {
		stmt.setBytes((Integer) args[0], (byte[]) args[1]);
	}
}
