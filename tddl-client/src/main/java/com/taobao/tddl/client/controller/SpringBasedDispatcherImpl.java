package com.taobao.tddl.client.controller;

import com.alibaba.common.lang.StringUtil;
import com.taobao.tddl.client.RouteCondition;
import com.taobao.tddl.client.dispatcher.*;
import com.taobao.tddl.client.dispatcher.impl.DatabaseAndTablesDispatcherResultImp;
import com.taobao.tddl.common.DBType;
import com.taobao.tddl.common.exception.checked.TDLCheckedExcption;
import com.taobao.tddl.common.sqljep.function.Comparative;
import com.taobao.tddl.parser.SQLParser;
import com.taobao.tddl.rule.LogicTableRule;
import com.taobao.tddl.rule.bean.LogicTable;
import com.taobao.tddl.rule.bean.TDDLRoot;
import com.taobao.tddl.rule.ruleengine.entities.retvalue.TargetDB;
import com.taobao.tddl.sqlobjecttree.ComparativeMapChoicer;
import com.taobao.tddl.sqlobjecttree.OrderByEle;
import com.taobao.tddl.sqlobjecttree.OutputHandlerConsist;
import com.taobao.tddl.sqlobjecttree.SqlParserResult;
import com.taobao.tddl.util.IDAndDateCondition.routeCondImp.DBSelectorRouteCondition;
import com.taobao.tddl.util.IDAndDateCondition.routeCondImp.DummySqlParcerResult;
import com.taobao.tddl.util.IDAndDateCondition.routeCondImp.JoinCondition;
import com.taobao.tddl.util.IDAndDateCondition.routeCondImp.RuleRouteCondition;

import java.util.*;

/**
 * 主要负责root中拿到需要的信息。然后用matcher进行匹配。
 * <p/>
 * 最后返回需要的结果
 *
 * @author shenxun
 */
public class SpringBasedDispatcherImpl implements SqlDispatcher {
    /**
     * 反向输出的类型对象
     */
    public final static OutputHandlerConsist consist = new OutputHandlerConsist();
    private final Matcher matcher = new SpringBasedRuleMatcherImpl();
    /**
     * TDDL的根节点
     */
    TDDLRoot root;
    /**
     * 需要注入的sql 解析器对象
     */
    private SQLParser parser = null;

    /*
     * (non-Javadoc)
     *
     * @see
     * com.taobao.tddl.client.dispatcher.SqlDispatcher#getDBAndTables(java.lang
     * .String, java.util.List)
     */
    public DispatcherResult getDBAndTables(String sql, List<Object> args) throws TDLCheckedExcption {
        // 因为只有mysql和oracle实现，暂时不考虑其他实现。3年内用不到
        DBType dbType = getDBType();
        boolean isMySQL = DBType.MYSQL.equals(dbType);

        // 解析sql得到sql本身的结构化信息
        SqlParserResult sqlParserResult = parser.parse(sql, isMySQL);
        // TODO: 反向查找，也就是先拿sql里面的一列表名，然后去规则里
        // 查看哪个表名match，如果有一个表示单表操作。
        // 如果有多个表示要join，join里有两种情况是可以支持但没有支持的
        String logicTableName = sqlParserResult.getTableName();
        // 从root对象中拿到逻辑表
        LogicTableRule rule = root.getLogicTableMap(logicTableName);
        if (rule == null) {
            throw new IllegalArgumentException("未能找到对应规则,逻辑表:" + logicTableName);
        }

        boolean isNeedRowCopy = rule.isNeedRowCopy();
        boolean isAllowReverseOutput = rule.isAllowReverseOutput();
        MatcherResult matcherResult = matcher.match(sqlParserResult.getComparativeMapChoicer(),
                args, rule);
        return getDispatcherResult(matcherResult, sqlParserResult, args, dbType, rule
                .getUniqueColumns(), isNeedRowCopy, isAllowReverseOutput, true);

    }

    //TODO:以后考虑加一个sql的状态，就表名这条sql的执行属性，这样就不用所有地方都搞一次了
    //	private boolean validIsSingleDBandSingleTable(List<TargetDB> targetDB){
    //
    //	}

    /**
     * 根据匹配结果，进行最终给TStatement的结果的拼装,不同的matcher可以共用
     *
     * @param matcherResult
     * @return
     */
    protected DispatcherResult getDispatcherResult(MatcherResult matcherResult,
                                                   SqlParserResult sqlParserResult,
                                                   List<Object> args, DBType dbType,
                                                   List<String> uniqueColumnSet,
                                                   boolean isNeedRowCopy,
                                                   boolean isAllowReverseOutput,
                                                   boolean isSqlParser) {
        DispatcherResultImp dispatcherResult = getTargetDatabaseMetaDataBydatabaseGroups(
                matcherResult.getCalculationResult(), sqlParserResult, args, isNeedRowCopy,
                isAllowReverseOutput);

        //虽然判断sql输入输出的逻辑应该放到规则里，但因为觉得没必要在走了规则以后就放在TargetDBList里面多传递一次
        //在这里搞一次就可以了

        ControllerUtils.buildExecutePlan(dispatcherResult, matcherResult.getCalculationResult());

        validGroupByFunction(sqlParserResult, dispatcherResult);

        //TODO:reverseoutput也可以使用上面的结果
        if (isSqlParser) {
            //做过sql parse才有可能做反向输出
            ControllerUtils.buildReverseOutput(args, sqlParserResult, dispatcherResult.getMax(),
                    dispatcherResult.getSkip(), dispatcherResult, DBType.MYSQL.equals(dbType),
                    dispatcherResult.needRowCopy());
        }

        if (dispatcherResult.needRowCopy()) {

            // TODO: 添加listener
            // 临时用作参数输入的key
            // 虽然ic可以不需要charid了，但如果能够直接获取映射后的key也是一种比较好的方式。

            //@Important 这里注意一定不能点到次序，否则会出现数据复制的sql中重复出现相同结果的列的问题
            buildUniqueKeyToBeReturn(sqlParserResult, args, uniqueColumnSet, dispatcherResult);

            ControllerUtils.appendDatabaseSharedMetaData(matcherResult.getDatabaseComparativeMap(),
                    dispatcherResult);
            ControllerUtils.appendTableSharedMetaData(matcherResult.getTableComparativeMap(),
                    dispatcherResult);
            //@Important end

        }

        return dispatcherResult;
    }

    protected void buildUniqueKeyToBeReturn(SqlParserResult sqlParserResult, List<Object> args,
                                            List<String> uniqueColumnSet,
                                            DispatcherResultImp dispatcherResult) {
        Set<String> tempSet = new HashSet<String>(1);
        for (String str : uniqueColumnSet) {
            tempSet.clear();
            tempSet.add(str);
            Map<String, Comparative> uniqueMap = sqlParserResult.getComparativeMapChoicer()
                    .getColumnsMap(args, tempSet);
            if (!uniqueMap.isEmpty()) {
                ControllerUtils.appendUniqueKeysMetaData(uniqueMap, dispatcherResult);
            }
        }

    }

    /**
     * 如果有groupby函数并且执行计划不为单库单表或单库无表或无库无表
     * 则允许通过
     *
     * @param sqlParserResult
     * @param dispatcherResult
     */
    protected void validGroupByFunction(SqlParserResult sqlParserResult,
                                        DispatcherResult dispatcherResult) {
        List<OrderByEle> groupByElement = sqlParserResult.getGroupByEles();
        if (groupByElement.size() != 0) {
            if (dispatcherResult.getDatabaseExecutePlan() == EXECUTE_PLAN.MULTIPLE) {
                throw new IllegalArgumentException("多库的情况下，不允许使用group by 函数");
            }
            if (dispatcherResult.getTableExecutePlan() == EXECUTE_PLAN.MULTIPLE) {
                throw new IllegalArgumentException("多表的情况下，不允许使用group by函数");
            }
        }
    }

    protected DispatcherResultImp getTargetDatabaseMetaDataBydatabaseGroups(
            List<TargetDB> targetDatabases,
            SqlParserResult sqlParserResult,
            List<Object> arguments,
            boolean isNeedRowCopy,
            boolean isAllowReverseOutput) {
        // targetDatabase.set
        DispatcherResultImp dispatcherResultImp = new DispatcherResultImp(sqlParserResult
                .getTableName(), targetDatabases, isNeedRowCopy, isAllowReverseOutput, sqlParserResult
                .getSkip(arguments), sqlParserResult.getMax(arguments), new OrderByMessagesImp(
                sqlParserResult.getOrderByEles()), sqlParserResult.getGroupFuncType());
        return dispatcherResultImp;
    }

    @SuppressWarnings("unchecked")
    public DispatcherResult getDBAndTables(RouteCondition rc) {
        //bug : see http://jira.taobao.ali.com/browse/TDDL-47
        String logicTableName = rc.getVirtualTableName();
        List<String> uniqueColumns = Collections.emptyList();
        SqlParserResult sqlParserResult = null;
        if (rc instanceof RuleRouteCondition) {
            //需要模拟sqlparser走规则的 condition
            sqlParserResult = ((RuleRouteCondition) rc).getSqlParserResult();
            try {
                LogicTableRule rule = root.getLogicTableMap(logicTableName);
                uniqueColumns = rule.getUniqueColumns();
                MatcherResult matcherResult = matcher.match(sqlParserResult
                        .getComparativeMapChoicer(), null, rule);

                DispatcherResult result = getDispatcherResult(matcherResult, sqlParserResult,
                        Collections.emptyList(), null, rule.getUniqueColumns(), false, false, false);
                //如果是JoinCondition 那么要在DispatcherResult中添加join表的虚拟表名;
                if (rc instanceof JoinCondition) {
                    result
                            .setVirtualJoinTableNames(((JoinCondition) rc).getVirtualJoinTableNames());
                }

                return result;
            } catch (TDLCheckedExcption e) {
                throw new RuntimeException(e);
            }
        } else if (rc instanceof DBSelectorRouteCondition) {
            final DBSelectorRouteCondition dBSelectorRouteCondition = (DBSelectorRouteCondition) rc;
            List<TargetDB> targetDBs = new ArrayList<TargetDB>(1);
            TargetDB targetDB = new TargetDB();
            targetDB.setDbIndex(dBSelectorRouteCondition.getDBSelectorID());
            Set<String> targetDBSet = new HashSet<String>();
            targetDBSet.addAll(dBSelectorRouteCondition.getTableList());
            targetDB.setTableNames(targetDBSet);
            targetDBs.add(targetDB);
            ComparativeMapChoicer choicer = new ComparativeMapChoicer() {

                public Map<String, Comparative> getColumnsMap(List<Object> arguments,
                                                              Set<String> partnationSet) {
                    return Collections.emptyMap();
                }
            };
            //建立伪装类
            sqlParserResult = new DummySqlParcerResult(choicer, logicTableName);
            MatcherResult matcherResult = matcher.buildMatcherResult(Collections.EMPTY_MAP, Collections.EMPTY_MAP, targetDBs);
            return getDispatcherResult(matcherResult, sqlParserResult,
                    Collections.emptyList(), null, uniqueColumns, false, false, false);


        } else {
            throw new IllegalArgumentException("wrong RouteCondition type:"
                    + rc.getClass().getName());
        }
    }

    @SuppressWarnings("unchecked")
    public DispatcherResult getDBAndTables() {
        SqlParserResult sqlParserResult = null;
        String logicTableName = "";
        List<TargetDB> targetDBs = new ArrayList<TargetDB>(1);
        TargetDB targetDB = new TargetDB();
        targetDB.setDbIndex(root.getDefaultDBSelectorID());
        Set<String> targetDBSet = new HashSet<String>();
        targetDBSet.add(logicTableName);
        targetDB.setTableNames(targetDBSet);
        targetDBs.add(targetDB);
        ComparativeMapChoicer choicer = new ComparativeMapChoicer() {

            public Map<String, Comparative> getColumnsMap(List<Object> arguments,
                                                          Set<String> partnationSet) {
                return Collections.emptyMap();
            }
        };
        //建立伪装类
        sqlParserResult = new DummySqlParcerResult(choicer, logicTableName);
        MatcherResult matcherResult = matcher.buildMatcherResult(Collections.EMPTY_MAP, Collections.EMPTY_MAP, targetDBs);
        return getDispatcherResult(matcherResult, sqlParserResult,
                Collections.emptyList(), null, Collections.<String>emptyList(), false, false, false);

    }

    public Result getAllDatabasesAndTables(String logicTableName) {
        LogicTable logicTable = root.getLogicTable(StringUtil.toLowerCase(logicTableName));
        if (logicTable == null) {
            throw new IllegalArgumentException("逻辑表名未找到");
        }
        return new DatabaseAndTablesDispatcherResultImp(logicTable.getAllTargetDBList(),
                logicTableName);
    }


    /**
     * 无逻辑的getter/setter
     */
    public SQLParser getParser() {
        return parser;
    }

    public void setParser(SQLParser parser) {
        this.parser = parser;
    }

    public TDDLRoot getRoot() {
        return root;
    }

    public void setRoot(TDDLRoot root) {
        this.root = root;
    }

    public DBType getDBType() {
        return (DBType) root.getDBType();
    }

}
