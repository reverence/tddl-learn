package com.taobao.tddl.client.jdbc.parameter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SetNull1Handler implements ParameterHandler {
	public void setParameter(PreparedStatement stmt, Object[] args)
			throws SQLException {
		stmt.setNull((Integer) args[0], (Integer) args[1]);
	}
}
