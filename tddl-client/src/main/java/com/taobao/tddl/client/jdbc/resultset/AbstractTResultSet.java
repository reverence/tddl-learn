package com.taobao.tddl.client.jdbc.resultset;

import java.io.InputStream;
import java.io.Reader;
import java.sql.NClob;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.taobao.tddl.client.jdbc.TStatement;
import com.taobao.tddl.client.util.ExceptionUtils;

public class AbstractTResultSet extends DummyTResultSet {

	private static final Log log = LogFactory.getLog(AbstractTResultSet.class);
	protected List<ResultSet> actualResultSets;
	protected TStatement statementProxy;
	protected boolean closed = false;

	public AbstractTResultSet(TStatement statementProxy, List<ResultSet> resultSets) {
		this.statementProxy = statementProxy;
		this.actualResultSets = resultSets;
	}
	/**
	 * bug fix by shenxun : 原来会发生一个情况就是如果TStatement调用了close()方法
	 * 而本身其管理的TResultSet没有closed时候。外部会使用iterator来遍历每一个
	 * TResultSet，调用关闭的方法，但因为TResultSet的close方法会回调
	 * TStatement里面用于创建iterator的Set<ResultSet>对象，并使用remove方法。
	 * 这就会抛出一个concurrentModificationException。
	 *
	 * @param removeThis
	 * @throws SQLException
	 */
	public void closeInternal(boolean removeThis) throws SQLException{
		if (log.isDebugEnabled()) {
			log.debug("invoke close");
		}

		if (closed) {
			return;
		}

		List<SQLException> exceptions = null;

		try {
			for (int i = 0; i < actualResultSets.size(); ++i) {
				try {
					actualResultSets.get(i).close();
				} catch (SQLException e) {
					if (exceptions == null) {
						exceptions = new ArrayList<SQLException>();
					}
					exceptions.add(e);
				}
			}
		} finally {
			closed = true;
			actualResultSets.clear();
			//如果removeThis=true则从parent中移除当前节点。
			if(removeThis){
				if (!statementProxy.getTResultSets().remove(this)) {
					log.warn("open result set does not exist");
				}
			}
		}

		ExceptionUtils.throwSQLException(exceptions,null,null);
	}
	public void close() throws SQLException {

		closeInternal(true);
	}

	protected void checkClosed() throws SQLException {
		if (closed) {
			throw new SQLException("No operations allowed after result set closed.");
		}
	}

	@Override
	public int getType() throws SQLException {
		return ResultSet.TYPE_FORWARD_ONLY;
	}
	@Override
	public RowId getRowId(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public RowId getRowId(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updateRowId(int columnIndex, RowId x) throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateRowId(String columnLabel, RowId x) throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public int getHoldability() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isClosed() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void updateNString(int columnIndex, String nString)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateNString(String columnLabel, String nString)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateNClob(int columnIndex, NClob nClob) throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateNClob(String columnLabel, NClob nClob)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public NClob getNClob(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public NClob getNClob(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public SQLXML getSQLXML(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public SQLXML getSQLXML(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updateSQLXML(int columnIndex, SQLXML xmlObject)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateSQLXML(String columnLabel, SQLXML xmlObject)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public String getNString(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getNString(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Reader getNCharacterStream(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Reader getNCharacterStream(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updateNCharacterStream(int columnIndex, Reader x, long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateNCharacterStream(String columnLabel, Reader reader,
									   long length) throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateAsciiStream(int columnIndex, InputStream x, long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateBinaryStream(int columnIndex, InputStream x, long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateCharacterStream(int columnIndex, Reader x, long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateAsciiStream(String columnLabel, InputStream x, long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateBinaryStream(String columnLabel, InputStream x,
								   long length) throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateCharacterStream(String columnLabel, Reader reader,
									  long length) throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateBlob(int columnIndex, InputStream inputStream, long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateBlob(String columnLabel, InputStream inputStream,
						   long length) throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateClob(int columnIndex, Reader reader, long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateClob(String columnLabel, Reader reader, long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateNClob(int columnIndex, Reader reader, long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateNClob(String columnLabel, Reader reader, long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateNCharacterStream(int columnIndex, Reader x)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateNCharacterStream(String columnLabel, Reader reader)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateAsciiStream(int columnIndex, InputStream x)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateBinaryStream(int columnIndex, InputStream x)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateCharacterStream(int columnIndex, Reader x)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateAsciiStream(String columnLabel, InputStream x)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateBinaryStream(String columnLabel, InputStream x)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateCharacterStream(String columnLabel, Reader reader)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateBlob(int columnIndex, InputStream inputStream)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateBlob(String columnLabel, InputStream inputStream)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateClob(int columnIndex, Reader reader) throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateClob(String columnLabel, Reader reader)
			throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateNClob(int columnIndex, Reader reader) throws SQLException {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateNClob(String columnLabel, Reader reader)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
