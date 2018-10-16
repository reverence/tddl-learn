/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.taobao.tddl.client.sequence.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.taobao.tddl.client.sequence.SequenceException;

/**
 *
 * @author zhaofeng.wang
 * @version $Id: InsertSequenceLogTask.java, v 0.1 2012-3-7 上午09:46:59 zhaofeng.wang Exp $
 */
public class InsertSequenceLogTask implements Runnable {

    private static final Log  logger = LogFactory.getLog(InsertSequenceLogTask.class);

    private static DataSource ds;
    private static String     selectSql;

    private static String     insertSql;
    private static String     updateSql;

    private long              newValue;
    private int               index;
    private String            sequenceName;
    private long              gmt_create;

    /**
     * db里的字段包括：  index,name,value,gmt_modified
     * @param selectSql : select value from table_name(default:sequence) where name=?
     * @param insertSql : insert into table_name(default:sequence)(name,value,gmt_create,gmt_modified) values(?,?,?,?)
     * @param updateSql : update table_name(default:sequence) set value=? ,gmt_modified=? where name=?
     * @param sequenceName: sequence name
     * @param index : db index
     * @param newValue : new value
     * @param gmt_modified :the modified time.
     */
    public InsertSequenceLogTask(String sequenceName, int index, long newValue, long gmt_create) {
        this.sequenceName = sequenceName;
        this.index = index;
        this.newValue = newValue;
        this.gmt_create = gmt_create;
    }

    public static void setParameters(DataSource ds, String insertSql) {
        InsertSequenceLogTask.ds = ds;
        InsertSequenceLogTask.insertSql = insertSql;
    }

    /**
     *
     *
     *
     * @see java.lang.Runnable#run()
     */
    public void run() {
        //先查询该记录是否存在,如果不存在即插入该记录，如果存在就更新该记录

        this.insertLog();

    }

    /**格式: insert into table_name(sequence)(name,value,db_index,gmt_create) values(?,?,?,?) */
    public void insertLog() {
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = ds.getConnection();
            stmt = con.prepareStatement(insertSql);
            stmt.setString(1, sequenceName);//字段名
            stmt.setLong(2, newValue);//初始值
            stmt.setInt(3, index);
            stmt.setTimestamp(4, new Timestamp(gmt_create));
            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SequenceException("insert the record failed!!!");
            }
        } catch (Exception e) {
            logger.error("insert the log record failed,name=" + sequenceName + ",value" + newValue
                    + ",index=" + index + ",gmt_create=" + gmt_create, e);
        } finally {
            closeStatement(stmt);
            stmt = null;
            closeConnection(con);
            con = null;
        }
    }

    /**
     * 关闭statement
     *
     * @param stmt
     */
    private static void closeStatement(Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                logger.debug("Could not close JDBC Statement", e);
            } catch (Throwable e) {
                logger.debug("Unexpected exception on closing JDBC Statement", e);
            }
        }
    }

    /**
     * 关闭连接
     *
     * @param conn
     */
    private static void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                logger.debug("Could not close JDBC Connection", e);
            } catch (Throwable e) {
                logger.debug("Unexpected exception on closing JDBC Connection", e);
            }
        }
    }

    /**
     * Setter method for property <tt>ds</tt>.
     *
     * @param ds value to be assigned to property ds
     */
    public static void setDs(DataSource ds) {
        InsertSequenceLogTask.ds = ds;
    }

    /**
     * Getter method for property <tt>ds</tt>.
     *
     * @return property value of ds
     */
    public static DataSource getDs() {
        return ds;
    }

    /**
     * Getter method for property <tt>selectSql</tt>.
     *
     * @return property value of selectSql
     */
    public static String getSelectSql() {
        return selectSql;
    }

    /**
     * Getter method for property <tt>insertSql</tt>.
     *
     * @return property value of insertSql
     */
    public static String getInsertSql() {
        return insertSql;
    }

    /**
     * Setter method for property <tt>selectSql</tt>.
     *
     * @param selectSql value to be assigned to property selectSql
     */
    public static void setSelectSql(String selectSql) {
        InsertSequenceLogTask.selectSql = selectSql;
    }

    /**
     * Setter method for property <tt>insertSql</tt>.
     *
     * @param insertSql value to be assigned to property insertSql
     */
    public static void setInsertSql(String insertSql) {
        InsertSequenceLogTask.insertSql = insertSql;
    }

    /**
     * Getter method for property <tt>updateSql</tt>.
     *
     * @return property value of updateSql
     */
    public static String getUpdateSql() {
        return updateSql;
    }

    /**
     * Setter method for property <tt>updateSql</tt>.
     *
     * @param updateSql value to be assigned to property updateSql
     */
    public static void setUpdateSql(String updateSql) {
        InsertSequenceLogTask.updateSql = updateSql;
    }

    /**
     * Setter method for property <tt>gmt_create</tt>.
     *
     * @param gmt_create value to be assigned to property gmt_create
     */
    public void setGmt_create(long gmt_create) {
        this.gmt_create = gmt_create;
    }

    /**
     * Getter method for property <tt>gmt_create</tt>.
     *
     * @return property value of gmt_create
     */
    public long getGmt_create() {
        return gmt_create;
    }

}
