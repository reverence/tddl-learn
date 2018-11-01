package com.taobao.tddl.parser;

import static com.taobao.tddl.common.Monitor.KEY3_PARSE_SQL;
import static com.taobao.tddl.common.Monitor.add;
import static com.taobao.tddl.common.Monitor.buildExecuteSqlKey2;
import static com.taobao.tddl.common.Monitor.buildTableKey1;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.apache.log4j.Logger;

import com.taobao.tddl.common.exception.runtime.NotSupportException;
import com.taobao.tddl.common.sqljep.function.Comparative;
import com.taobao.tddl.common.util.NagiosUtils;
import com.taobao.tddl.parser.mysql.MySQLParserLexer;
import com.taobao.tddl.parser.mysql.MySQLParserParser;
import com.taobao.tddl.parser.mysql.MySQLWalker;
import com.taobao.tddl.parser.oracle.OracleParserLexer;
import com.taobao.tddl.parser.oracle.OracleParserParser;
import com.taobao.tddl.parser.oracle.OracleWalker;
import com.taobao.tddl.sqlobjecttree.DMLCommon;
import com.taobao.tddl.sqlobjecttree.OrderByEle;
import com.taobao.tddl.sqlobjecttree.OutputHandler;
import com.taobao.tddl.sqlobjecttree.SqlAndTableAtParser;
import com.taobao.tddl.sqlobjecttree.SqlParserResult;
import com.taobao.tddl.sqlobjecttree.Statement;
import com.taobao.tddl.sqlobjecttree.mysql.function.MySQLConsistStringRegister;
import com.taobao.tddl.sqlobjecttree.mysql.function.MySQLFunctionRegister;
import com.taobao.tddl.sqlobjecttree.oracle.function.OracleConsistStringRegister;
import com.taobao.tddl.sqlobjecttree.oracle.function.OracleFunctionRegister;
import com.taobao.tddl.sqlobjecttree.oracle.function.OracleHintRegister;

/**
 * SQL 解析器的实现类，主要是将SQL解析后存放到cache中，
 * 如果cache中有该条SQL,则直接从cache中取，否则进行parse
 *
 * @author shenxun
 *
 */
public class SQLParserImp implements SQLParser{
	private static final Logger log = Logger.getLogger(SQLParserImp.class);

	/**
	 * 尝试从cache中取该sql,如果未取到，则分析该sql并初始化。
	 *
	 * 最坏情况是多次初始化，但因为key一致，同一条sql分析并初始化以后的结果是一致的
	 *
	 * 但有可能因为乱序发生put在init之前的问题,因此整个加锁。
	 * @param sql
	 */
	public void parseSQL(String sql) {
		nestedParseSql(sql,true);
	}

	private final ParserCache globalCache = ParserCache.instance();

	public void parseSQL(String sql,boolean isMysql){
		nestedParseSql(sql, isMysql);
	}

	private void nestedParseSql(final String sql,final boolean isMysql) {
		if (sql == null) {
			throw new IllegalArgumentException("sql must not be null");
		}
		//为了防止多次重复初始化，所以使用了future task来确保初始化只进行一次
		FutureTask<DMLCommon> future = globalCache.getFutureTask(sql);
		if (future == null) {
			Callable<DMLCommon> handle = new Callable<DMLCommon>() {
				public DMLCommon call() throws Exception {
					final DMLCommon com = getDMLCommonObject(sql, isMysql);
					com.init();
					log.info("successfully parse a sql");
					log.info("original sql:"+sql);
					StringBuilder sb = new StringBuilder();
					com.appendSQL(sb);
					log.info("parsed sql:"+sb.toString());
					return com;
				}


			};
			future = new FutureTask<DMLCommon>(handle);
			future = globalCache.setFutureTaskIfAbsent(sql,future);
			future.run();
		}
	}

	/**
	 * Antlr分析sql，返回用java对象表示的SQL。
	 *
	 * @param sql
	 * @param isMysql
	 * @return
	 */
	private DMLCommon getDMLCommonObject(final String sql,
										 final boolean isMysql) {
		final DMLCommon com;
		try {
			AntlrStringStream st = new AntlrStringStream(
					sql);
			if (isMysql) {
				MySQLWalker.beg_return ret = null;
				MySQLParserLexer pl = new MySQLParserLexer(
						st);
				TokenRewriteStream tokens = new TokenRewriteStream(
						pl);
				MySQLParserParser pa = new MySQLParserParser(
						tokens);

				pa.setFunc(MySQLFunctionRegister.reg);
				pa
						.setConsist(MySQLConsistStringRegister.reg);
				MySQLParserParser.beg_return beg = null;
				beg = pa.beg();
				CommonTree tree = (CommonTree) beg
						.getTree();
				log.debug(tree.toStringTree());
				CommonTreeNodeStream nodes = new CommonTreeNodeStream(
						tree);
				nodes.setTokenStream(tokens);
				MySQLWalker walker = new MySQLWalker(nodes);
				walker.setFunc(MySQLFunctionRegister.reg);
				walker
						.setConsist(MySQLConsistStringRegister.reg);
				ret = walker.beg();
				com = ret.obj;
			} else {
				OracleWalker.beg_return ret = null;
				OracleParserLexer pl = new OracleParserLexer(
						st);
				TokenRewriteStream tokens = new TokenRewriteStream(
						pl);
				OracleParserParser pa = new OracleParserParser(
						tokens);

				pa.setFunc(OracleFunctionRegister.reg);
				pa.setOracleHint(OracleHintRegister.reg);
				pa
						.setConsist(OracleConsistStringRegister.reg);

				OracleParserParser.beg_return beg = null;
				beg = pa.beg();
				CommonTree tree = (CommonTree) beg
						.getTree();
				log.debug(tree.toStringTree());
				CommonTreeNodeStream nodes = new CommonTreeNodeStream(
						tree);
				nodes.setTokenStream(tokens);
				OracleWalker walker = new OracleWalker(
						nodes);
				walker.setFunc(OracleFunctionRegister.reg);
				walker
						.setConsist(OracleConsistStringRegister.reg);
				walker
						.setOracleHint(OracleHintRegister.reg);
				ret = walker.beg();
				com = ret.obj;
			}
		} catch (RecognitionException e) {
			NagiosUtils.addNagiosLog(NagiosUtils.KEY_SQL_PARSE_FAIL, 1);
			throw new RuntimeException("分析sql错误，错误的sql是:"
					+ sql, e);
		}
		return com;
	}

	/**
	 * 根据SQL获取对应的javaSQL对象
	 * @param sql
	 * @return java SQL 对象。 如果cache中没有则返回空
	 */
	public Statement getStatement(String sql) {
		try {
			FutureTask<DMLCommon> future = globalCache.getFutureTask(sql);
			if(future == null){
				return null;
			}
			else{
				return future.get();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 根据partinationSet里面的String去SQL中查找在where条件中是否有对应的列。如果有则全部找出，放入到Comparativemap里
	 *
	 * 如果SQL对象中有的话则将需要被绑定的变量绑定到comparativeMap里面的Comparative中。
	 *
	 * 赋值完成后返回。
	 *
	 * @param sql
	 * @param argument
	 * @param partnation
	 * @return
	 */
	public Map<String, Comparative> eval(String sql,List<Object> argument,Set<String> partnation){
		try {
			DMLCommon dmlc = ((DMLCommon)getStatement(sql));
			if(dmlc == null){
				return Collections.emptyMap();
			}else{
				return dmlc.getColumnsMap(argument,partnation);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	public String getTableName(String sql){
		try {
			DMLCommon dmlc = ((DMLCommon)getStatement(sql));
			if(dmlc == null){
				return null;
			}else{
				return dmlc.getTableName();
			}

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	public long getLimitFrom(String sql,List<Object> param){
		try {
			DMLCommon dmlc = ((DMLCommon)getStatement(sql));
			if(dmlc == null){
				return DMLCommon.DEFAULT_SKIP_MAX;
			}else{
				return dmlc.getSkip(param);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	public long getLimitTo(String sql,List<Object> param){
		try {
			DMLCommon dmlc = ((DMLCommon)getStatement(sql));
			if(dmlc == null){
				return DMLCommon.DEFAULT_SKIP_MAX;
			}else{
				return dmlc.getMax(param);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	public List<OrderByEle> getOrderByList(String sql) {
		try {
			DMLCommon dmlc = ((DMLCommon)getStatement(sql));
			if(dmlc == null){
				return Collections.EMPTY_LIST;
			}else{
				return dmlc.getOrderByEles();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public List<SqlAndTableAtParser> getSqlReadyToRun(String sql,Set<String> tables, List<Object> args,Number limitFrom,Number limitTo,OutputHandler outputType,Map<Integer,Object> map) {
		if(sql==null){
			throw new IllegalArgumentException("目标sql为空");
		}
		try {
			DMLCommon dmlc = ((DMLCommon)getStatement(sql));
			if(dmlc == null){
				return Collections.EMPTY_LIST;
			}else{
				return dmlc.getSqlReadyToRun(tables, args, limitFrom, limitTo, outputType,map);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public SqlParserResult parse(String sql, boolean isMySQL) {
		//TODO 这里实现都是强转，有点不妥但如果b2b那边没有进一步合并的需求则不考虑动他了
		this.parseSQL(sql, isMySQL);
		DMLCommon com = (DMLCommon)getStatement(sql);
		String table = null;
		try {
			if (com == null) {
				// 如果没取到，尝试分析sql并初始化
				parseSQL(sql, isMySQL);
				com = (DMLCommon)getStatement(sql);
				table = ((DMLCommon) com).getTableName();
				add(buildTableKey1(table), buildExecuteSqlKey2(sql), KEY3_PARSE_SQL,
						0, 1);

			} else {
				table = ((DMLCommon) com).getTableName();
				add(buildTableKey1(table), buildExecuteSqlKey2(sql), KEY3_PARSE_SQL,
						1, 1);
			}
		} catch (ClassCastException e) {
			throw new NotSupportException(e.getMessage() + ".not support yet");
		}
		return com;
	}

//	public List<Integer> getSplitDbArgsPosition(String sql,Set<String> parsms){
//		if(sql==null){
//			throw new IllegalArgumentException("没有sql");
//		}
//		return sqlParseCache.get(sql).getSplitDbAndTablesArgsPosition(parsms);
//	}

}
