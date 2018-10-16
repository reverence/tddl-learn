package com.taobao.tddl.client.exception;

public class DAOException extends Exception {

	private static final long serialVersionUID = -3466063003090477536L;

	public DAOException() {
		super();
	}

	public DAOException(String msg) {
		super(msg);
	}

	public DAOException(Throwable cause) {
		super(cause);
	}

	public DAOException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
