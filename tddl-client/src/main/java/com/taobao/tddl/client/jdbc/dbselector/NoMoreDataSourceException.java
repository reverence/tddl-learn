package com.taobao.tddl.client.jdbc.dbselector;

import java.sql.SQLException;

/**
 * 当一组的数据库都试过，都不可用了，并且没有更多的数据源了，抛出该错误
 *
 * @author linxuan
 *
 */
public class NoMoreDataSourceException extends SQLException{

    private static final long serialVersionUID = 1L;

    public NoMoreDataSourceException(String msg) {
        super(msg);
    }

    public NoMoreDataSourceException() {
        super();
    }
}
