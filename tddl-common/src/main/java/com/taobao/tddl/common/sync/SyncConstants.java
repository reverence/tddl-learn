package com.taobao.tddl.common.sync;

public class SyncConstants {
	public static final String SYNC_VERSION_COLUMN_NAME = "sync_version";
	public static final int SYNC_VERSION_DEFAULT_VALUE = 0;

	public static final String SQL_STATE_DUPLICATE_PRIMARY_KEY_MYSQL = "23000";
	public static final int ERROR_CODE_DUPLICATE_PRIMARY_KEY_MYSQL = 1062;
	public static final String SQL_STATE_DUPLICATE_PRIMARY_KEY_ORACLE = "23000";
	public static final int ERROR_CODE_DUPLICATE_PRIMARY_KEY_ORACLE = 1;


	//public static final int SQL_TYPE_INSERT = 1;
	//public static final int SQL_TYPE_UPDATE = 2;

	//public static final String DATABASE_TYPE_MYSQL = "mysql";
	//public static final String DATABASE_TYPE_ORACLE = "oracle";
}
