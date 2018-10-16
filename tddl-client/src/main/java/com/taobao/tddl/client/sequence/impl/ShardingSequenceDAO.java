package com.taobao.tddl.client.sequence.impl;

import com.taobao.tddl.client.ThreadLocalString;
import com.taobao.tddl.client.jdbc.TDataSource;
import com.taobao.tddl.client.sequence.SequenceException;
import com.taobao.tddl.client.sequence.ShardingSequenceRange;
import com.taobao.tddl.client.util.ThreadLocalMap;
import com.taobao.tddl.util.IDAndDateCondition.routeCondImp.SimpleCondition;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.sql.*;

/**
 *
 *
 * @author zhengjiaqing878 [ http://jiaqing.me ]
 * @version $Id: ShardingSequenceDAO.java, v 0.1 2016年1月20日 上午11:14:16 zhengjiaqing Exp $
 */
public class ShardingSequenceDAO {
    private static final Log logger      = LogFactory.getLog(ShardingSequenceDAO.class);

    private String           selectSQL;
    private String           updateSQL;

    /** 乐观锁重试次数，内置128次 */
    private final int        optimisticRetryTimes = 128;

    private TDataSource      dataSource;

    public ShardingSequenceDAO() {

    }

    /**
     * 获取一个新的数字序列段。
     *
     * @param sequenceName
     * @return
     * @throws SequenceException
     */
    // 与原方案（MultipleSequenceDao）的区别，这里不带synchronized,避免所有分表操作的串行化
    public ShardingSequenceRange nextRange(String sequenceName, String seqTableName)
            throws SequenceException {
        SimpleCondition rc = (SimpleCondition) ThreadLocalMap
                .get(ThreadLocalString.ROUTE_CONDITION);

        for (int i = 0; i < optimisticRetryTimes; i++) {
            ShardingSequenceRange result = doNextRange(sequenceName, seqTableName, rc);
            if (result == null) {
                logger.warn("[DAL]OptimisticLock conflict, seq=" + sequenceName + ", table="
                        + seqTableName + ", retryTimes=" + i);
                continue;
            }
            logger
                    .info("[DAL]NextRange: seq=" + sequenceName + ", table=" + seqTableName
                            + ", value=" + result.getCurrentValue() + ", max=" + result.getCurrentMax());
            return result;
        }

        throw new SequenceException("get NextRange fail, no more retry! seq=" + sequenceName
                + ", table=" + seqTableName);
    }

    /**
     * <li>自己管理一个独立事务，不受外围事务影响。
     *
     * @param sequenceName
     * @return
     * @throws SequenceException
     */
    private ShardingSequenceRange doNextRange(String sequenceName, String seqTableName, SimpleCondition rc)
            throws SequenceException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        /*Transaction trx = Cat.newTransaction("TDDL", "sequence.doNextRange");
        trx.addData("sequenceName", sequenceName);
        trx.addData("seqTableName", seqTableName);
        trx.setStatus(Message.SUCCESS);*/

        try {
            conn = dataSource.getConnection();
            conn.setAutoCommit(false);
            conn.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);

            // 1. select
            ThreadLocalMap.put(ThreadLocalString.ROUTE_CONDITION, rc);
            stmt = conn.prepareStatement(selectSQL(seqTableName));
            stmt.setString(1, sequenceName);
            rs = stmt.executeQuery();

            if (!rs.next()) { // 结果集：有一笔
                throw new SequenceException("no sequence record in the table, name=" + sequenceName);
            }

            long id = rs.getLong(1); // id
            long origValue = rs.getLong(2); // value
            long maxValue = rs.getLong(3); // maxValue
            long minValue = rs.getLong(4); // minValue
            int cacheSize = rs.getInt(5); // cacheSize
            long version = rs.getLong(6); // version

            if (rs.next()) { // 结果集：且仅有一笔
                throw new SequenceException("multip sequence records in the table, name="
                        + sequenceName);
            }

            closeResultSet(rs);
            closeStatement(stmt);

            ShardingSequenceRange currentRange = new ShardingSequenceRange(id, origValue, maxValue,
                    minValue, cacheSize, version);
            //currentRange.addCat(trx);

            if (logger.isDebugEnabled()) {
                logger.debug("[DAL]get next range in table=" + seqTableName + " for seq="
                        + sequenceName + " currentRange=" + currentRange);
            }

            // 2. update
            ThreadLocalMap.put(ThreadLocalString.ROUTE_CONDITION, rc);
            stmt = conn.prepareStatement(updateSQL(seqTableName));
            stmt.setLong(1, currentRange.getCurrentMax());
            stmt.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
            stmt.setString(3, "sys");
            stmt.setLong(4, currentRange.getId());
            stmt.setLong(5, currentRange.getOrigVersion());
            int updateCount = stmt.executeUpdate();

            if (updateCount == 1) {
                conn.commit();
                conn.setAutoCommit(true);
                //trx.addData("isCommit", true);
                return currentRange;
            } else {
                conn.rollback();
                conn.setAutoCommit(true);
                //trx.addData("isCommit", false);
                return null; // 乐观锁冲突
            }

        } catch (SQLException e) {
            logger.error("[DAL]doNextRange fail, seq=" + sequenceName + ", table=" + seqTableName,
                    e);
            //trx.setStatus(e);
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException ee) {
                logger.error("[DAL]rollback fail, seq=" + sequenceName + ", table=" + seqTableName,
                        ee);
            }
            throw new SequenceException("doNextRange fail, seq=" + sequenceName + ", table="
                    + seqTableName, e);
        } finally {
            closeResultSet(rs);
            closeStatement(stmt);
            closeConnection(conn);
            //trx.complete();
        }
    }

    //~~~ privates:

    /**
     * 获取selectSQL
     *
     * @param seqTableName
     * @return
     */
    private String selectSQL(String seqTableName) {
        if (selectSQL == null) { // 只读，无需并发控制
            selectSQL = "/* __sqlId__=shardingSequence.selectRange */select id, value, max_value, min_value, cache_size, version from "
                    + seqTableName + " where seq_name = ?";
        }
        return selectSQL;
    }

    /**
     * 获取updateSQL
     *
     * @param seqTableName
     * @return
     */
    private String updateSQL(String seqTableName) {
        if (updateSQL == null) { // 只读，无需并发控制
            updateSQL = "/* __sqlId__=shardingSequence.updateRange */update "
                    + seqTableName
                    + " set value = ?, version = version+1, updated_at = ?, updated_by = ? where id = ? and version = ?";
        }
        return updateSQL;
    }

    private void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                logger.error("[DAL]Could not close JDBC ResultSet", e);
            } catch (Throwable e) {
                logger.error("[DAL]Unexpected exception on closing JDBC ResultSet", e);
            }
            rs = null;
        }
    }

    private void closeStatement(Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                logger.error("[DAL]Could not close JDBC Statement", e);
            } catch (Throwable e) {
                logger.error("[DAL]Unexpected exception on closing JDBC Statement", e);
            }
            stmt = null;
        }
    }

    private void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                logger.error("[DAL]Could not close JDBC Connection", e);
            } catch (Throwable e) {
                logger.error("[DAL]Unexpected exception on closing JDBC Connection", e);
            }
            conn = null;
        }
    }

    //~~~ getter and setters:

    /**
     * Getter method for property <tt>dataSource</tt>.
     *
     * @return property value of dataSource
     */
    public TDataSource getDataSource() {
        return dataSource;
    }

    /**
     * Setter method for property <tt>dataSource</tt>.
     *
     * @param dataSource value to be assigned to property dataSource
     */
    public void setDataSource(TDataSource dataSource) {
        this.dataSource = dataSource;
    }

    // 暂时不用：
    //  public void initSequenceRecord(String sequenceName, long maxValue, long minValue, int cacheSize)
    //                                                                                                  throws SQLException { // TODO exception?
    //      Connection conn = null;
    //      PreparedStatement stmt = null;
    //
    //      try {
    //          Date now = new Date(System.currentTimeMillis());
    //          conn = dataSource.getConnection();
    //          stmt = conn.prepareStatement(INSERT_SQL);
    //          stmt.setString(0, sequenceName);
    //          stmt.setLong(1, 0);
    //          stmt.setLong(2, maxValue);
    //          stmt.setLong(3, minValue);
    //          stmt.setInt(4, cacheSize);
    //          stmt.setLong(5, 0);
    //          stmt.setString(6, "sys");
    //          stmt.setDate(7, now);
    //          stmt.setString(8, "sys");
    //          stmt.setDate(9, now);
    //          stmt.executeUpdate();
    //      } catch (SQLException e) {
    //          if (isExist(sequenceName)) {
    //              logger.warn("Sequence record has inserted, name=" + sequenceName + ",time="
    //                          + new Timestamp(System.currentTimeMillis()));
    //          } else {
    //              throw e;
    //          }
    //      } finally {
    //          closeStatement(stmt);
    //          closeConnection(conn);
    //      }
    //  }
    //
    //  private boolean isExist(String sequenceName) throws SQLException {
    //      Connection conn = null;
    //      PreparedStatement stmt = null;
    //      ResultSet rs = null;
    //
    //      try {
    //          conn = dataSource.getConnection();
    //          stmt = conn.prepareStatement(EXIST_SQL);
    //          stmt.setString(1, sequenceName);
    //          rs = stmt.executeQuery();
    //          if (rs.next()) {
    //              return true;
    //          } else {
    //              return false;
    //          }
    //      } finally {
    //          closeResultSet(rs);
    //          closeStatement(stmt);
    //          closeConnection(conn);
    //      }
    //  }
}
