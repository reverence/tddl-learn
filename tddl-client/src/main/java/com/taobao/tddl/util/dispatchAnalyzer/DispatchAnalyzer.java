package com.taobao.tddl.util.dispatchAnalyzer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.taobao.tddl.client.RouteCondition;
import com.taobao.tddl.client.controller.OrderByMessagesImp;
import com.taobao.tddl.client.controller.RuleController;
import com.taobao.tddl.client.controller.RuleControllerImpl;
import com.taobao.tddl.client.controller.TargetDBMeta;
import com.taobao.tddl.client.dispatcher.Result;
import com.taobao.tddl.common.SqlType;
import com.taobao.tddl.common.exception.checked.TDLCheckedExcption;
import com.taobao.tddl.common.sqljep.function.Comparative;
import com.taobao.tddl.rule.ruleengine.entities.retvalue.TargetDB;
import com.taobao.tddl.rule.ruleengine.entities.retvalue.TargetDBMetaData;
import com.taobao.tddl.rule.ruleengine.impl.DBRuleProviderImp;
import com.taobao.tddl.sqlobjecttree.GroupFunctionType;

public class DispatchAnalyzer {
	public void analyze(String sql, List<Object> args, String url) {

		try {
			TargetDBMeta li = getTargetDBS(url, sql, args);
			analyze(li);
		} catch (TDLCheckedExcption e) {
			e.printStackTrace();
		}
	}
//	TargetComparator.Bean b = new TargetComparator.Bean();
//	b.index = 0;
//	b.tableSuffix = new int[]{1};

	public TargetDBMeta analyzenew( String url,String sql, List<Object> args,DatasourceIntrospector datasourceIntrospector) {

		try {
			Result result = datasourceIntrospector.getDatabaseChoicer(true).getDBAndTables(sql, args);
			return buildResult(result);
		} catch (TDLCheckedExcption e) {
			e.printStackTrace();
			return null;
		}

	}
	public TargetDBMeta analyzenew( String url,RouteCondition routeCondition,DatasourceIntrospector datasourceIntrospector) {
		Result result = datasourceIntrospector.getDatabaseChoicer(true).getDBAndTables(routeCondition);
		return buildResult(result);

	}
	@SuppressWarnings("unchecked")
	private TargetDBMeta buildResult(Result result) {
		TargetDBMetaData meta = new TargetDBMetaData(result.getVirtualTableName(), result.getTarget(), false, false);
		return new TargetDBMeta(meta, result.getSkip(),result.getMax(),new OrderByMessagesImp(Collections.EMPTY_LIST),GroupFunctionType.NORMAL);
	}

	public TargetDBMeta analyzenew( String url,String urls,String sql, List<Object> args,DatasourceIntrospector datasourceIntrospector){
		return analyzenew(urls, sql, args,datasourceIntrospector);
	}
	private void analyze(TargetDBMeta li) {
		for (TargetDB d : li.getTarget()) {
			System.out.println("该sql分析如下：");
			System.out.print("虚拟表名：" + li.getVirtualTableName());
			System.out.println("读库标识：");
			System.out.print("      ");
			for (String id : d.getReadPool()) {
				System.out.print(id);
				System.out.print("||");
			}
			System.out.println("");
			System.out.println("写库标识：");
			System.out.print("      ");
			for (String id : d.getWritePool()) {
				System.out.print(id);
				System.out.print("||");
			}
			System.out.println("");
			System.out.println("目标表名：");

			System.out.print("      ");
			Iterator<String> itr = d.getTableNames().iterator();
			while (itr.hasNext()) {
				System.out.print(itr.next());
				System.out.print("||");
			}

			System.out.println();
			;

		}
	}

	public TargetDBMeta getTargetDBS(String url, String sql, List<Object> args)
			throws TDLCheckedExcption {
		RuleController controller = new RuleControllerImpl(null, url);
		TargetDBMeta target = controller.getDBAndTables(sql, args);

		return target;
	}

	public TargetDBMeta getTargetDBS(String url, String gidurl, String sql,
									 List<Object> args) throws TDLCheckedExcption {
		RuleController controller = new RuleControllerImpl(gidurl, url);
		TargetDBMeta target = controller.getDBAndTables(sql, args);

		return target;
	}

	public TargetDBMeta getTargetDBS(String url, String virtualTableName,
									 String ruleID, Set<String> tables, SqlType sqlType)
			throws TDLCheckedExcption {
		RuleController controller = new RuleControllerImpl(null, url);
		TargetDBMeta meta = controller.getTargetDB(virtualTableName, ruleID,
				tables, sqlType);
		return meta;
	}

	public TargetDBMetaData getTargetDBS(String virtualTabName,
										 Comparative[] comp, String para, String url)
			throws TDLCheckedExcption {

		DBRuleProviderImp provider = new DBRuleProviderImp();
		provider.setUrl(url);
		provider
				.setParser(new com.taobao.tddl.rule.ruleengine.xml.TDLXmlParser());
		provider.setIDGeneratorUrl(null);

		Map<String, Comparative> cMap = new HashMap<String, Comparative>();

		int i = 0;
		if (para != null) {
			String[] paratoken = para.toLowerCase().split(",");
			for (String str : paratoken) {
				cMap.put(str, comp[i]);
				i++;
			}
		}
		return provider.getDBAndTabs(virtualTabName, cMap);

	}

	public static void main(String[] args) {

		DispatchAnalyzer ana = new DispatchAnalyzer();
		// String sql="SELECT "+
		// "info.collect_info_id as collect_info_id,"+
		// "info.user_id as user_id,"+
		// "info.isshared as isshared,"+
		// "info.status as status,"+
		// "info.collect_item_id as collect_item_id,"+
		// "info.collect_time as collect_time,"+
		// "info.tag as tag "+
		// "FROM collect_info info"+
		// "WHERE "+
		// "info.user_id = 175964415 and info.status > -1"+
		// " and "+
		// "info.item_type = 1 "+
		// "ORDER BY info.collect_time DESC"+
		// " LIMIT 20,20";
		//		
		String sql = "INSERT INTO info_log (user_id, user_name, gmt) values (?, ?, now())";
		// String sql =
		// "SELECT USER_ID,COLL_COUNT,VERIFIED,STAT_DATE FROM COLL_NUM_CTL  WHERE USER_ID = ?";
		List<Object> objs = new ArrayList<Object>();
		objs.add(20007);
		objs.add("test");
		// objs.add(new java.sql.Date(System.currentTimeMillis()));

		String url = "/route_rule_1.xml";
		try {
			TargetDBMeta ds = ana.getTargetDBS(url, sql, objs);

			ana.analyze(ds);
		} catch (TDLCheckedExcption e) {
			e.printStackTrace();
		}
	}
}
