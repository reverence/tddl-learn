package com.taobao.tddl.client.jdbc;

import com.alibaba.common.lang.StringUtil;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.taobao.tddl.client.controller.SpringBasedDispatcherImpl;
import com.taobao.tddl.client.datasource.keyweight.GetDataSourceSequenceRules;
import com.taobao.tddl.client.datasource.keyweight.TDataSourceKeyWeightRandom;
import com.taobao.tddl.client.datasource.keyweight.TDataSourceKeyWeightRumtime;
import com.taobao.tddl.client.dispatcher.SqlDispatcher;
import com.taobao.tddl.client.jdbc.dbselector.EquityDbManager;
import com.taobao.tddl.client.jdbc.dbselector.OneDBSelector;
import com.taobao.tddl.client.jdbc.dbselector.PriorityDbGroupSelector;
import com.taobao.tddl.common.ConfigServerHelper;
import com.taobao.tddl.common.ConfigServerHelper.AbstractDataListener;
import com.taobao.tddl.common.ConfigServerHelper.DataListener;
import com.taobao.tddl.common.DBType;
import com.taobao.tddl.common.Monitor;
import com.taobao.tddl.common.RuntimeConfigHolder;
import com.taobao.tddl.common.config.beans.AppRule;
import com.taobao.tddl.common.mockdatasource.MockDataSource;
import com.taobao.tddl.conf.client.ZkClient;
import com.taobao.tddl.conf.client.ZkConfig;
import com.taobao.tddl.conf.client.ZkNodeCahce;
import com.taobao.tddl.parser.SQLParser;
import com.taobao.tddl.parser.SQLParserImp;
import com.taobao.tddl.rule.bean.TDDLRoot;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.curator.framework.recipes.cache.NodeCacheListener;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;
import java.io.ByteArrayInputStream;
import java.net.InetAddress;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * TDataSource的配置类，专门放置TDataSource的配置处理代码，为简化配置服务
 */
public class TGroupDataSourceConfig implements ApplicationContextAware {
    public static final String DBINDEX_DSKEY_CONN_CHAR = "_";
    public static final int DEFAULT_RETRY_TIMES = 3;
    public static final String DEFAULT_DB_INDEX = "default_group";
    protected static final Log logger = LogFactory.getLog(TGroupDataSourceConfig.class);
    /**
     * 权重码以rwp分别代表读权重、写权重、读级别3项。不区分大小和顺序，后面可以跟一个数字。
     * 若字母不出现，对应项的值默认为0；若字母出现数字不出现，对应项的默认值见return说明
     *
     * @param weight 格式
     * @return int[0] R后面的数字(默认10), int[1] W后面的数字(默认10), int[2] P后面的数字(默认0);
     * R20W10 --> int[]{20,10,0}
     * rp2w30 --> int[]{10,30,2}
     */
    private static final Pattern weightPattern_r = Pattern.compile("[Rr](\\d*)");
    private static final Pattern weightPattern_w = Pattern.compile("[Ww](\\d*)");
    private static final Pattern weightPattern_p = Pattern.compile("[Pp](\\d*)");
    private static final Pattern weightPattern_q = Pattern.compile("[Qq](\\d*)");
    protected final RuntimeConfigHolder<TddlRuntime> runtimeConfigHolder = new RuntimeConfigHolder<TddlRuntime>();
    protected int retryingTimes = DEFAULT_RETRY_TIMES;
    protected SqlDispatcher writeDispatcher;
    protected SqlDispatcher readDispatcher;
    protected boolean enableProfileRealDBAndTables;
    /**
     * 默认读写打开，读写分离：写走master，读走slave
     */
    protected boolean isReadOnly = false;                                 //??????
    protected boolean isMasterOnly = false;                                 //???????master????
    protected boolean isSlaveOnly = false;                                 //???????slave????
    protected DBType defaultDbType = DBType.ORACLE;
    protected Map<String, ?> rwDataSourcePoolConfig = Maps.newHashMap();
    protected ConfigurableApplicationContext springContext;
    private Map<String, ?> dataSourcePoolConfig;
    private Map<String, TDataSourceKeyWeightRandom> keyWeightMapConfig;
    private Map<String, String> keyWeightConfig;
    private String appName;

    private ConfigServerType confServerType = ConfigServerType.MY_CONFIG_SERVER;

    /**
     * added by fanzeng
     * 是否必须等待订阅configserver推送过来的对等库权重配置数据，
     * 主要是用于启动时接受从configserver推送过来的权重数据，以覆盖掉本地配置
     * 如果等待5s，尚未接收到消息，则抛异常，禁止服务启动
     * 默认是不等待
     */
    private boolean isWaitConfigServerRWData = false;

    /**
     * 是否支持zk动态调整db权重,这里我们不使用configserver,直接自己通过zk实现
     */
    private boolean isSupportZkConfigDbWeight=false;

    private String defaultDBWeightConfigFile="/tddl/dbweight";

    private ZkClient dbWeightzkClientBean;

    protected final ZkNodeCahce nodeCache = new ZkNodeCahce(appName+defaultDBWeightConfigFile);
    protected NodeCacheListener dbWeightChangeListener = new NodeCacheListener() {
        @Override
        public void nodeChanged() throws Exception {
            byte[] bytes = nodeCache.getData();
            ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
            Properties p = new Properties();
            p.load(inputStream);
            resetDbWeight(p);
        }
    };

    private DataListener keyWeightConfigListener = new AbstractDataListener() {
        public void onDataReceive(
                Object data) {
            Properties p = ConfigServerHelper.parseProperties(data, "[keyWeightConfigListener]");
            logger.warn("收到keyWeightConfig数据源分组权重配置：" + getReceivDataStr(p));
            if (p != null && isResetWeightConfig(p)) {
                TGroupDataSourceConfig.this.resetKeyWeightConfig(p);
            }
        }
    };

    private static SpringBasedDispatcherImpl buildSqlDispatcher(SQLParser parser, TDDLRoot tddlRoot) {
        if (tddlRoot != null) {
            SpringBasedDispatcherImpl dispatcher = new SpringBasedDispatcherImpl();
            dispatcher.setParser(parser);
            dispatcher.setRoot(tddlRoot);
            return dispatcher;
        } else {
            return null;
        }
    }

    private static String showDbSelectors(Map<String, DBSelector> dsSelectors,
                                          Map<String, ? extends Object> dataSourcePool) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, ? extends Object> e : dataSourcePool.entrySet()) {
            sb.append(e.getKey()).append(":").append(e.getValue()).append("\n");
        }
        sb.append("convert to:\n");
        for (Map.Entry<String, DBSelector> e : dsSelectors.entrySet()) {
            if ((e.getValue() instanceof EquityDbManager)) {
                EquityDbManager db = (EquityDbManager) e.getValue();
                sb.append(e.getKey()).append(":").append(db.getWeights()).append("\n");
            } else if ((e.getValue() instanceof PriorityDbGroupSelector)) {
                PriorityDbGroupSelector selector = (PriorityDbGroupSelector) e.getValue();
                sb.append(selector.getId() + ": \n");
                EquityDbManager[] dbs = selector.getPriorityGroups();
                for (EquityDbManager db : dbs) {
                    sb.append(db.getId()).append(db.getWeights()).append("\n");
                }
                sb.append("-------------------------------------------------\n");

            }

        }
        return sb.toString();
    }

    /**
     * 动态修改运行时配置
     */
    //  private void reset(AppRule shardRule) {
    //      //暂不支持
    //  }
    private static int[] parseWeightRW(String weight) {
        if (weight == null) {
            return new int[]{10, 10, 0, 0}; //默认读写都打开，读写均为P0级
        }
        int r, w, p, q;
        weight = weight.trim().toLowerCase(); //统计到小写方便后续处理
        if (weight.indexOf('R') == -1 && weight.indexOf('r') == -1) {
            r = 0;
        } else {
            r = parseNumber(weightPattern_r, weight, 10);
        }

        if (weight.indexOf('W') == -1 && weight.indexOf('w') == -1) {
            w = 0;
        } else {
            w = parseNumber(weightPattern_w, weight, 10);
        }
        if (weight.indexOf('P') == -1 && weight.indexOf('p') == -1) {
            p = 0;
        } else {
            p = parseNumber(weightPattern_p, weight, 0);
        }
        if (weight.indexOf('Q') == -1 && weight.indexOf('q') == -1) {
            q = 0;
        } else {
            q = parseNumber(weightPattern_q, weight, 0);
        }

        return new int[]{r, w, p, q};

    }

    private static int parseNumber(Pattern p, String weight, int defaultValue) {
        Matcher m = p.matcher(weight);
        if (!m.find()) {//这里用matches()就不行？
            throw new IllegalArgumentException(
                    "权重配置不符合正则式[Rr](\\d*)[Ww](\\d*)[Pp](\\d*)[Qq](\\d*)：" + weight);
        }
        if (m.group(1).length() == 0) {
            return defaultValue;
        } else {
            return Integer.parseInt(m.group(1));
        }
    }

    /**
     * @param commaWeights: R10W10,R10W0
     */
    private static void resetRwDbWeight(String dbIndex, Map<String, DBSelector> dbSelectors,
                                        String commaWeights) {
        String[] rdwds = commaWeights.split(",");
        int[] rWeights = new int[rdwds.length];
        int[] wWeights = new int[rdwds.length];
        for (int i = 0; i < rdwds.length; i++) {
            int[] weightRW = parseWeightRW(rdwds[i]);
            rWeights[i] = weightRW[0];
            wWeights[i] = weightRW[1];
        }
        resetDbWeight(dbIndex + AppRule.DBINDEX_SUFFIX_READ, dbSelectors, rWeights);
        resetDbWeight(dbIndex + AppRule.DBINDEX_SUFFIX_WRITE, dbSelectors, wWeights);
        if (logger.isInfoEnabled()) {
            logger.info(dbIndex + "所对应的对等数据库权重调整结束！");
        }
    }

    private static void resetDbWeight(String dbIndex, Map<String, DBSelector> dbSelectors,
                                      int[] weights) {
        DBSelector dbSelector = dbSelectors.get(dbIndex);
        if (dbSelector == null) {
            logger.error("Couldn't find dbIndex in current datasoures. dbIndex:" + dbIndex);
            return;
        }
        Map<String, Integer> weightMap = new HashMap<String, Integer>(weights.length);
        for (int i = 0; i < weights.length; i++) {
            weightMap.put(dbIndex + DBINDEX_DSKEY_CONN_CHAR + i, weights[i]);
        }
        dbSelector.setWeight(weightMap);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.springContext = (ConfigurableApplicationContext) applicationContext;
    }

    private String[] appendMasterSlaveDispatcherRuleUrl(String[] masterSlaveDispatcherUrl,
                                                        String[] targetUrl) {
        if (targetUrl == null) {
            return masterSlaveDispatcherUrl;
        } else {
            //因为他们之间有可能重复，因此用set进行划分
            Set<String> all = new HashSet<String>();
            //因为担心业务方可能会在同一个url中加多一个空格造成set不匹配，因此添加trim函数
            for (String str : masterSlaveDispatcherUrl) {
                all.add(str.trim());
            }
            for (String str : targetUrl) {
                all.add(str.trim());
            }
            return all.toArray(new String[all.size()]);
        }
    }

    protected String getReceivDataStr(Properties p) {
        String str = null;
        if (p != null) {
            StringBuilder sb = new StringBuilder();
            for (Entry<Object, Object> entry : p.entrySet()) {
                String key = ((String) entry.getKey()).trim();
                String value = ((String) entry.getValue()).trim();
                sb.append(key).append("=").append(value).append("\t");
            }
            str = sb.toString();
        }
        return str;
    }

    /**
     * 获取机器的名字即hostname
     */
    private String getMachineName() {
        String machineName = "";
        try {
            machineName = InetAddress.getLocalHost().getHostName();
        } catch (Exception e) {
            logger.error("tddl getMachineName error!", e);
            throw new IllegalArgumentException("get machinename error!", e);
        }
        return machineName;
    }

    /**
     * 判定是否需要重置本地的db权重，
     * 如果包含machine-name,并且value不等于本机的hostname，则不重置
     */
    protected boolean isResetWeightConfig(Properties p) {
        boolean flag = true;
        String machineKey = "";
        String systemName = "";
        for (Entry<Object, Object> entrySet : p.entrySet()) {
            String key = ((String) entrySet.getKey());
            String value = ((String) entrySet.getValue());
            if (StringUtil.isNotBlank(key) && StringUtil.isNotBlank(value)) {
                String machineName = getMachineName();
                if (key.equals("machine-name")) {
                    if (!value.equals(machineName)) {
                        flag = false;
                        logger.info("目前配置为只进行单机推送,推送机器名为：" + value + ",本机为:" + machineName
                                + ", failed!");
                        break;
                    } else {
                        machineKey = key;
                        logger.info("目前配置为只进行单机推送,推送机器名为：" + value + ",本机为:" + machineName
                                + ", success!");
                    }
                } else if (key.equals("system-name")) {
                    String systemNameStr = null;
                    //默认是系统名是机器名字即host的一部分,比如tradequery系统在线上机器名为tradequery-1-1,线下为tradequery.sit.alipay.net

                    if (StringUtil.isNotBlank(machineName)) {
                        systemNameStr = machineName.split("[-.]")[0];
                    }
                    if (StringUtil.isBlank(systemNameStr) || !systemNameStr.equals(value)) {
                        flag = false;
                        logger.info("目前配置为只按系统推送,推送系统名为：" + value + ",本机为:" + machineName
                                + ", failed!");
                        break;
                    } else {
                        systemName = key;
                        logger.info("目前配置为只按系统推送,推送系统名为：" + value + ",本机为:" + machineName
                                + ", success!");
                    }
                }
            } else {
                flag = false;
                logger.error("推送的内容不能为空，key=" + key + ",value=" + value);
            }
        }
        if (flag == true) {
            if (StringUtil.isNotBlank(machineKey)) {
                p.remove(machineKey);
            }
            if (StringUtil.isNotBlank(systemName)) {
                p.remove(systemName);
            }
        }
        return flag;
    }

    /**
     * 可以供Spring使用。如果业务绕开spring直接使用，必需先set所有需注入属性，再调用init
     */
    public final void init() {
        long t1 = System.currentTimeMillis();

        initDbSelectors();

        initSqlDispatcher();

        postInit();

        long eclipseTime = System.currentTimeMillis() - t1;
        if (logger.isWarnEnabled()) {
            logger.warn("tddl初始化耗费的时间是：" + eclipseTime + "ms");
        }
    }

    private void initDbSelectors() {
        long t1 = System.currentTimeMillis();
        Map<String, DBSelector> dsSelectors = this.rwDataSourcePoolConfig == null ? buildDbSelectors(this.dataSourcePoolConfig)
                : this.buildRwDbSelectors(this.rwDataSourcePoolConfig);
        this.runtimeConfigHolder.set(new TddlRuntime(dsSelectors));

        //添加按数据源key分组的权重配置属性
        if (keyWeightConfig != null) {
            // 解析各个分组内数据源的权重信息
            Map<String, ? extends Object> dataSourceKeyConfig = this.rwDataSourcePoolConfig == null ? this.dataSourcePoolConfig
                    : this.rwDataSourcePoolConfig;
            keyWeightMapConfig = TDataSourceKeyWeightRumtime.buildKeyWeightConfig(keyWeightConfig,
                    dataSourceKeyConfig);
            if (keyWeightMapConfig == null) {
                throw new IllegalStateException("数据源key按分组权重配置错误,tddl初始化失败！");
            }
            GetDataSourceSequenceRules.getKeyWeightRuntimeConfigHoder().set(
                    new TDataSourceKeyWeightRumtime(keyWeightMapConfig));
            if (logger.isInfoEnabled()) {
                logger.info("数据源key按分组权重配置初始化完毕！");
            }
            Object firstFetchedDbKeyWeights = ConfigServerHelper.subscribeAppDbGroupKeyWeight(
                    appName, keyWeightConfigListener);
            if (firstFetchedDbKeyWeights == null) {
                logger.warn("tddl初始化过程中，没有接收到数据源按key分组的权重配置!");
            }
        }
        long t2 = System.currentTimeMillis();
        logger.warn("tddl初始化数据库实例池的时间是：" + (t2 - t1) + "ms");

        //订阅数据库权重
        if (appName != null) {
            switch (this.confServerType) {
                case TB_DIAMOND:
                    if (getDbWeightListeners().containsKey(confServerType)) {
                        Object firstFetchedDbWeights = ConfigServerHelper.subscribeAppDbWeight(appName,
                                (DataListener) getDbWeightListeners().get(confServerType), isWaitConfigServerRWData);
                        if (firstFetchedDbWeights == null) {
                            logger.warn("没有接收到数据库权重配置");
                        }
                        //modified by shen.添加一个appName的注册。这样在statlog中就可以直接使用add方法。不用大改代码
                        Monitor.setAppName(appName);
                    }
                    break;
                case MY_CONFIG_SERVER:
                    if(isSupportZkConfigDbWeight){
                        ZkConfig.registryListener(dbWeightzkClientBean,nodeCache,dbWeightChangeListener);
                    }
                    break;
                default:
                    checkArgument(false, "not supportted confServerType");
            }
        }
    }

    protected void postInit() {
        //本TDS的使用方式
        if (this.isMasterOnly) {
            //只使用master主库
            SqlDispatcher sd = this.writeDispatcher;
            if (this.isReadOnly) {
                this.writeDispatcher = null;
                this.readDispatcher = sd;
            } else {
                this.writeDispatcher = sd;
                this.readDispatcher = null;
            }
        } else if (this.isSlaveOnly) {
            //只使用slave读库
            SqlDispatcher sd = this.readDispatcher;
            if (this.isReadOnly) {
                this.writeDispatcher = null;
                this.readDispatcher = sd;
            } else {
                this.writeDispatcher = sd;
                this.readDispatcher = null;
            }
        }
    }

    /**
     * 根据dataSourcePool初始化dispatcher；
     */
    protected void initSqlDispatcher() {
        SQLParser parser = new SQLParserImp();
        this.writeDispatcher = buildSqlDispatcher(AppRule.DBINDEX_SUFFIX_WRITE, parser);
        this.readDispatcher = buildSqlDispatcher(AppRule.DBINDEX_SUFFIX_READ, parser);
    }

    private SqlDispatcher buildSqlDispatcher(String dbIndexSuffix, SQLParser parser) {
        SqlDispatcher dispatcher = new SpringBasedDispatcherImpl();
        TDDLRoot root = new TDDLRoot();
        root.setDBType(this.defaultDbType);
        root.setDefaultDBSelectorID(DEFAULT_DB_INDEX + dbIndexSuffix);
        return buildSqlDispatcher(parser, root);
    }

    private DBSelector buildDbSelector(String dbIndex, DataSource[] dataSourceArray) {
        Map<String, DataSource> map = new HashMap<String, DataSource>(dataSourceArray.length);
        for (int i = 0; i < dataSourceArray.length; i++) {
            map.put(dbIndex + DBINDEX_DSKEY_CONN_CHAR + i, dataSourceArray[i]);
        }
        return new EquityDbManager(dbIndex, map);
    }

    private DBSelector buildDbSelector(String dbIndex, List<DataSource> dataSourceList) {
        Map<String, DataSource> map = new HashMap<String, DataSource>(dataSourceList.size());
        for (int i = 0, n = dataSourceList.size(); i < n; i++) {
            map.put(dbIndex + DBINDEX_DSKEY_CONN_CHAR + i, dataSourceList.get(i));
        }
        return new EquityDbManager(dbIndex, map);
    }

    @SuppressWarnings("unchecked")
    private Map<String, DBSelector> buildDbSelectors(Map<String, ? extends Object> dataSourcePool) {
        Map<String, DBSelector> dsSelectors = new HashMap<String, DBSelector>();
        for (Map.Entry<String, ? extends Object> e : dataSourcePool.entrySet()) {
            if (e.getValue() instanceof DataSource) {
                dsSelectors.put(e.getKey(),
                        new OneDBSelector(e.getKey(), (DataSource) e.getValue()));
            } else if (e.getValue() instanceof DataSource[]) {
                dsSelectors.put(e.getKey(),
                        buildDbSelector(e.getKey(), (DataSource[]) e.getValue()));
            } else if (e.getValue() instanceof List) {
                dsSelectors.put(e.getKey(), buildDbSelector(e.getKey(), (List<DataSource>) e
                        .getValue()));
            } else if (e.getValue() instanceof DBSelector) {
                dsSelectors.put(e.getKey(), (DBSelector) e.getValue());
            } else if (e.getValue() instanceof String) {
                String[] dbs = ((String) e.getValue()).split(","); //支持以逗号分隔的多个数据源ID
                if (dbs.length == 1) {
                    DBSelector selector = new OneDBSelector(e.getKey(), (DataSource) springContext
                            .getBean(dbs[0]));
                    dsSelectors.put(e.getKey(), selector);
                } else {
                    DataSource[] dsArray = new DataSource[dbs.length];
                    for (int i = 0; i < dbs.length; i++) {
                        dsArray[i] = (DataSource) springContext.getBean(dbs[i]);
                    }
                    dsSelectors.put(e.getKey(), buildDbSelector(e.getKey(), dsArray));
                }
            }
            dsSelectors.get(e.getKey()).setDbType(this.defaultDbType);
        }
        return dsSelectors;
    }

    /**
     * 对老式配置模式的支持：
     * 分库规则定位到的是一个dbgroup，dbgroup内又包含读库和写库，这时规则不分masterRule、slaveRule，只有一个oneRule
     * <p/>
     * 每个key对应dbgroup中，每个库可以有读写属性及权重，格式如下
     * <entry key="slave_0" value="slaver_db1_a:RW    ,slaver_db1_b:R" />
     * <entry key="slave_1" value="slaver_db2_a:R10W  ,slaver_db2_b:R20" />
     * <entry key="slave_2" value="slaver_db3_a:R10W10,slaver_db3_b:R20W0" />
     * <entry key="slave_3" value="slaver_db4_a:R10W20,slaver_db3_b:R20W10" /> <!-- 主主 -->
     * <entry key="slave_4" value="slaver_db5_a,slaver_db5_b" /><!-- 主主 -->
     * <entry key="slave_5" value="slaver_db6" />     *
     * 对应的权重：
     * slave_0=R10W10,R10W0
     * slave_1=R10W10,R20W0
     * slave_3=R10W20,R20W10
     * slave_4=R10W10,R10W10
     * slave_5=RW
     * <p/>
     * <p/>
     * 适配做法是
     * 将oneRule拆分成masterRule和slaveRule；将oneRule中的dbIndex分别在masterRule中加_w后缀，在slaveRule中加_r后缀
     * tabaleA: <property name="dbIndexes" value="slave_0,slave_1,slave_2,slave_3" />
     * <p/>
     * master.tabaleA: <property name="dbIndexes" value="slave_0_w,slave_1_w,slave_2_w,slave_3_w" />
     * slaver.tabaleA: <property name="dbIndexes" value="slave_0_r,slave_1_r,slave_2_r,slave_3_r" />
     * 将dbindex中每个数据源的读写属性，按权重拆分到master_dbindex 和slave_dbindex
     * master和slave的具体数据源列出所有的，只是
     * <entry key="slave_0_w" value="slaver_db1_a:10,slaver_db1_b:0" />
     * <entry key="slave_0_r" value="slaver_db1_a:10,slaver_db1_b:10" />
     * <entry key="slave_1_w" value="slaver_db2_a:10,slaver_db2_b:0" />
     * <entry key="slave_1_r" value="slaver_db2_a:10,slaver_db2_b:20" />
     * <entry key="slave_2_w" value="slaver_db3_a:10,slaver_db3_b:0" />
     * <entry key="slave_2_r" value="slaver_db3_a:10,slaver_db3_b:20" />
     * <entry key="slave_3_w" value="slaver_db4_a:20,slaver_db3_b:10" /> <!-- 主主 -->
     * <entry key="slave_3_r" value="slaver_db4_a:10,slaver_db3_b:20" /> <!-- 主主 -->
     * <entry key="slave_4_w" value="slaver_db5_a:10,slaver_db5_b:10" /><!-- 主主 -->
     * <entry key="slave_4_r" value="slaver_db5_a:10,slaver_db5_b:10" /><!-- 主主 -->
     * <entry key="slave_5_w" value="slaver_db6" />
     * <entry key="slave_5_r" value="slaver_db6" />
     * <p/>
     * 权重推送：
     * slave_1=R10W10,R20W0  |--> slave_1_w[10,0], slave_1_r[10,20]
     * 变为：
     * slave_1=R10W10,R0,W0  |--> slave_1_w[10,0], slave_1_r[10,0]
     *
     * @param dataSourcePool
     * @return
     */
    @SuppressWarnings("unchecked")
    private Map<String, DBSelector> buildRwDbSelectors(Map<String, ? extends Object> dataSourcePool) {
        Map<String, DBSelector> dsSelectors = new HashMap<String, DBSelector>();
        for (Map.Entry<String, ? extends Object> e : dataSourcePool.entrySet()) {
            String rdbIndex = e.getKey() + AppRule.DBINDEX_SUFFIX_READ; //"_r";
            String wdbIndex = e.getKey() + AppRule.DBINDEX_SUFFIX_WRITE;//"_w";
            if (e.getValue() instanceof DataSource) {
                dsSelectors.put(rdbIndex, new OneDBSelector(rdbIndex, (DataSource) e.getValue()));
                dsSelectors.put(wdbIndex, new OneDBSelector(wdbIndex, (DataSource) e.getValue()));
            } else if (e.getValue() instanceof DataSource[]) {
                dsSelectors.put(rdbIndex, buildDbSelector(rdbIndex, (DataSource[]) e.getValue()));
                dsSelectors.put(wdbIndex, buildDbSelector(wdbIndex, (DataSource[]) e.getValue()));
            } else if (e.getValue() instanceof List) {
                dsSelectors.put(rdbIndex,
                        buildDbSelector(rdbIndex, (List<DataSource>) e.getValue()));
                dsSelectors.put(wdbIndex,
                        buildDbSelector(wdbIndex, (List<DataSource>) e.getValue()));
            } else if (e.getValue() instanceof DBSelector) {
                dsSelectors.put(rdbIndex, (DBSelector) e.getValue());
                dsSelectors.put(wdbIndex, (DBSelector) e.getValue());
            } else if (e.getValue() instanceof String) {
                parse(dsSelectors, e.getKey(), (String) e.getValue());
            }
            dsSelectors.get(rdbIndex).setDbType(this.defaultDbType);
            dsSelectors.get(wdbIndex).setDbType(this.defaultDbType);
        }
        if (logger.isInfoEnabled()) {
            logger.info(showDbSelectors(dsSelectors, dataSourcePool));
        }
        return dsSelectors;
    }

    /**
     * 如果不仅一组，则用优先队列来存储数据源。
     * 同一组内随机选取一个，不同组严格按优先级别来选取，只有高级别出错误才会向下选取低级别的数据源
     * <p/>
     * 只写rw时，pr=pw=0默认值，即大家都在同一组内，大家随便选取,只写p 时，pr=pw=p
     * dbs = slaver_db3_a:R10W10p10,slaver_db3_b:R20W0p5
     * 对读和写都分别分级，pr pw
     * dbs = slaver_db3_a:R10W10pr10pw2,slaver_db3_b:R20W0pr5pw10
     *
     * @param databaseSources
     * @param dbIndex
     * @param dsSelectors
     */
    private void parseDbSelector(String[] databaseSources, String dbIndex,
                                 Map<String, DBSelector> dsSelectors, weightRWPQEnum rwPriority) {

        Map<Integer, Map<String, DataSource>> initDataSourceGroups = new HashMap<Integer, Map<String, DataSource>>(
                1);
        Map<Integer, Map<String, Integer>> weightGroups = new HashMap<Integer, Map<String, Integer>>(
                1);

        for (int i = 0; i < databaseSources.length; i++) {
            //对于每个DataSource和权重
            String dsKey = dbIndex + DBINDEX_DSKEY_CONN_CHAR + i;
            String[] beanIdAndWeight = databaseSources[i].split(":"); //dbs[i]=slaver_db3_a:R10W10
            DataSource dataSource = (DataSource) springContext.getBean(beanIdAndWeight[0].trim());
            int[] weightRWPQ = parseWeightRW(beanIdAndWeight.length == 2 ? beanIdAndWeight[1]
                    : null);

            //获得本级别的数据库组，没有则创建
            Map<String, DataSource> initDataSources = initDataSourceGroups
                    .get(weightRWPQ[rwPriority.value()]);
            if (initDataSources == null) {
                initDataSources = new HashMap<String, DataSource>(databaseSources.length);
                initDataSourceGroups.put(weightRWPQ[rwPriority.value()], initDataSources);
            }

            //获得本级别的权重组，没有则创建
            Map<String, Integer> weights = weightGroups.get(weightRWPQ[rwPriority.value()]);
            if (weights == null) {
                weights = new HashMap<String, Integer>(databaseSources.length);
                weightGroups.put(weightRWPQ[rwPriority.value()], weights);
            }

            weights.put(dsKey, weightRWPQ[rwPriority.value() - 2]);
            if (dataSource instanceof MockDataSource) {
                //为测试做点儿工作，将rDsKey，wDsKey的ds分开好让Test通过MockDataSource检测dbIndex
                try {
                    MockDataSource rds = ((MockDataSource) dataSource).clone();
                    MockDataSource wds = ((MockDataSource) dataSource).clone();
                    rds.setDbIndex(dbIndex);
                    initDataSources.put(dsKey, rds);
                } catch (CloneNotSupportedException e) {
                    logger.error("Shouldn't happen!!");
                }
            } else {
                initDataSources.put(dsKey, dataSource);
            }
        }

        if (initDataSourceGroups.size() == 1) {
            Map<String, DataSource> rInitDataSources = initDataSourceGroups.values().toArray(
                    new Map[1])[0];
            Map<String, Integer> rWeights = weightGroups.values().toArray(new Map[1])[0];
            EquityDbManager equityDbManager = new EquityDbManager(dbIndex, rInitDataSources,
                    rWeights);
            if (defaultDbType != null)
                equityDbManager.setDbType(defaultDbType);
            dsSelectors.put(dbIndex, equityDbManager);
        } else {
            List<Integer> rpriorityKeys = new ArrayList<Integer>(initDataSourceGroups.size());
            rpriorityKeys.addAll(initDataSourceGroups.keySet());
            Collections.sort(rpriorityKeys);
            EquityDbManager[] rpriorityGroups = new EquityDbManager[rpriorityKeys.size()];

            for (int i = 0; i < rpriorityGroups.length; i++) {
                Integer key = rpriorityKeys.get(i);
                Map<String, DataSource> rInitDataSources = initDataSourceGroups.get(key);
                Map<String, Integer> rWeights = weightGroups.get(key);
                EquityDbManager equityDbManager = new EquityDbManager(dbIndex, rInitDataSources,
                        rWeights);
                if (defaultDbType != null)
                    equityDbManager.setDbType(defaultDbType);
                rpriorityGroups[i] = equityDbManager;

            }
            dsSelectors.put(dbIndex, new PriorityDbGroupSelector(dbIndex, rpriorityGroups));
        }
    }

    //<entry key="slave_2" value="slaver_db3_a:R10W10,slaver_db3_b:R20W0" />
    private void parse(Map<String, DBSelector> dsSelectors, String dbIndex, String commaDbs) {
        String rdbIndex = dbIndex + AppRule.DBINDEX_SUFFIX_READ; //"_r";
        String wdbIndex = dbIndex + AppRule.DBINDEX_SUFFIX_WRITE;//"_w";
        String[] dbs = commaDbs.split(","); //支持以逗号分隔的多个数据源ID
        //如果只有一个DataSource，则用OneDBSelector
        if (dbs.length == 1) {
            int index = dbs[0].indexOf(":");
            String dsbeanId = index == -1 ? dbs[0] : dbs[0].substring(0, index);//单个DS去除不必要的权重
            DBSelector selectorRead = new OneDBSelector(rdbIndex, (DataSource) springContext
                    .getBean(dsbeanId.trim()));
            DBSelector selectorWrite = new OneDBSelector(wdbIndex, (DataSource) springContext
                    .getBean(dsbeanId.trim()));
            dsSelectors.put(rdbIndex, selectorRead);
            dsSelectors.put(wdbIndex, selectorWrite);
        } else {
            //分别分析写读数据源
            parseDbSelector(dbs, wdbIndex, dsSelectors, weightRWPQEnum.writePriority);
            parseDbSelector(dbs, rdbIndex, dsSelectors, weightRWPQEnum.readPriority);
        }
    }

    /**
     * 拿出现有的dbSelectors，更新权重后设回runtimeConfigHolder；
     * 支持两种格式，readwriteRule格式：读写库配在一起
     * slave_0=R10W10,R10W0
     * slave_1=R10W10,R20W0
     * slave_2=RWP1,RP0,RP0
     * master/slave格式：读写库及规则分开配置
     * master_0=10,0
     * slaver_1=10,20
     */
    protected synchronized void resetDbWeight(Properties p) {
        Map<String, DBSelector> dbSelectors = this.runtimeConfigHolder.get().dbSelectors;
        for (Entry<Object, Object> entrySet : p.entrySet()) {
            String dbIndex = ((String) entrySet.getKey()).trim();
            String commaWeights = ((String) entrySet.getValue()).trim();

            if ((this.rwDataSourcePoolConfig != null)
                    && (this.rwDataSourcePoolConfig.get(dbIndex) != null)) {
                //readwriteRule方式的weight
                resetRwDbWeight(dbIndex, dbSelectors, commaWeights);
            } else if ((this.dataSourcePoolConfig != null)
                    && (dataSourcePoolConfig.get(dbIndex) != null)) {
                String[] rdwds = commaWeights.split(",");
                int[] weights = new int[rdwds.length];
                for (int i = 0; i < rdwds.length; i++) {
                    weights[i] = Integer.parseInt(rdwds[i]);
                }
                resetDbWeight(dbIndex, dbSelectors, weights);
            }
        }
    }

    /**
     * added by fanzeng.
     * 参数p格式如下
     * group_0=TradeCore00:10,TradeCore00_0:0
     * group_1=TradeCore01:10,TradeCore01_0:0
     * group_2=TradeCore02:0,TradeCore02_0:10
     * 一组只有一个库的时候不用调整其权重，默认为10
     *
     * @param p 推送过来的内容
     */
    protected synchronized void resetKeyWeightConfig(Properties p) {
        Map<String, TDataSourceKeyWeightRandom> keyWeightMapHolder = GetDataSourceSequenceRules
                .getKeyWeightRuntimeConfigHoder().get().getKeyWeightMapHolder();
        for (Entry<Object, Object> entrySet : p.entrySet()) {
            String groupKey = ((String) entrySet.getKey());
            String value = ((String) entrySet.getValue());
            if (StringUtil.isBlank(groupKey) || StringUtil.isBlank(value)) {
                logger.error("数据源groupKey=" + groupKey + "分组权重配置信息不能为空,value=" + value);
                return;
            }
            String[] keyWeightStr = value.split(",");
            String[] weightKeys = new String[keyWeightStr.length];
            int[] weights = new int[keyWeightStr.length];
            // 示例:group_0=TradeCore00:10,TradeCore00_0:0

            for (int i = 0; i < keyWeightStr.length; i++) {
                if (StringUtil.isBlank(keyWeightStr[i])) {
                    logger.error("数据源keyWeightStr[" + i + "]分组权重配置信息不能为空.");
                    return;
                }
                String[] keyAndWeight = keyWeightStr[i].split(":");
                if (keyAndWeight.length != 2) {
                    logger.error("数据源key按组配置权重错误,keyWeightStr[" + i + "]=" + keyWeightStr[i] + ".");
                    return;
                }
                String key = keyAndWeight[0];
                String weightStr = keyAndWeight[1];
                if (StringUtil.isBlank(key) || StringUtil.isBlank(weightStr)) {
                    logger.error("数据源分组权重配置信息不能为空,key=" + key + ",weightStr=" + weightStr);
                    return;
                }
                weightKeys[i] = key.trim();
                weights[i] = Integer.parseInt(weightStr.trim());
            }
            //根据 groupKey以及对应的keyAndWeightMap去查询
            TDataSourceKeyWeightRandom weightRandom = keyWeightMapHolder.get(groupKey);
            if (weightRandom == null) {
                logger.error("新推送的按数据源key分组权重配置中的key不对,非法的groupKey=" + groupKey);
                return;
            }
            for (String newKey : weightKeys) {
                if (weightRandom.getWeightConfig() == null
                        || !weightRandom.getWeightConfig().containsKey(newKey)) {
                    logger.error("新推送的数据源分组" + groupKey + "权重配置中包含不属于该组的数据源标识,key=" + newKey);
                    return;
                }
            }
            if (weightKeys.length != weightRandom.getDataSourceNumberInGroup()) {
                logger.error("新推送的按数据源key分组权重配置中，分组groupKey=" + groupKey + "包含的数据源个数不对 ,size="
                        + weightKeys.length + ",the size should be "
                        + weightRandom.getDataSourceNumberInGroup());
                return;
            }
            //根据该组的groupKey以及对应的keyAndWeightMap生成TDataSourceKeyWeightRandom
            TDataSourceKeyWeightRandom TDataSourceKeyWeightRandom = new TDataSourceKeyWeightRandom(
                    weightKeys, weights);
            keyWeightMapHolder.put(groupKey, TDataSourceKeyWeightRandom);

        }
        GetDataSourceSequenceRules.getKeyWeightRuntimeConfigHoder().set(
                new TDataSourceKeyWeightRumtime(keyWeightMapHolder));

        //设置本地的keyWeightMapCofig属性，全活策略会依赖于该配置
        setKeyWeightMapConfig(keyWeightMapHolder);
        //当所有的权重调整完毕后再打印该日志
        if (logger.isWarnEnabled()) {
            logger.warn("数据源按key分组的权重调整完毕！调整内容为：" + getReceivDataStr(p));
        }
    }

    //不再兼容旧规则下不设置init-method的配置方式
    public void setDataSourcePool(Map<String, ? extends Object> dataSourcePool) {
        //Map<String, DBSelector> dsSelectors = buildDbSelectors(this.dataSourcePoolConfig);
        //this.runtimeConfigHolder.set(new TddlRuntime(dsSelectors));
        this.dataSourcePoolConfig = dataSourcePool;
    }

    public Map<String, ? extends Object> getRwDataSourcePool() {
        return rwDataSourcePoolConfig;
    }

    public void setRwDataSourcePool(Map<String, ? extends Object> dataSourcePool) {
        this.rwDataSourcePoolConfig = dataSourcePool;
    }

    public String getDefaultDbType() {
        return defaultDbType.name();
    }

    public void setDefaultDbType(String defaultDbType) {
        this.defaultDbType = DBType.valueOf(defaultDbType);
    }

    public String getDbType() {
        return defaultDbType.name();
    }

    public void setDbType(String defaultDbType) {
        this.defaultDbType = DBType.valueOfString(defaultDbType);
    }

    public boolean isEnableProfileRealDBAndTables() {
        return enableProfileRealDBAndTables;
    }

    public void setEnableProfileRealDBAndTables(boolean enableProfileRealDBAndTables) {
        this.enableProfileRealDBAndTables = enableProfileRealDBAndTables;
    }

    public void setReadOnly(boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }

    public void setMasterOnly(boolean isMasterOnly) {
        this.isMasterOnly = isMasterOnly;
    }

    public void setSlaveOnly(boolean isSlaveOnly) {
        this.isSlaveOnly = isSlaveOnly;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getRetryingTimes() {
        return retryingTimes;
    }

    public void setRetryingTimes(int retryingTimes) {
        this.retryingTimes = retryingTimes;
    }

    /**
     * added by fanzeng
     * 是否需要等待configserver推送过来的权重配置信息
     *
     * @return
     */
    public boolean getIsWaitConfigServerRWData() {
        return isWaitConfigServerRWData;
    }

    public void setIsWaitConfigServerRWData(boolean isWaitConfigServerRWData) {
        this.isWaitConfigServerRWData = isWaitConfigServerRWData;
    }

    public Map<String, String> getKeyWeightConfig() {
        return keyWeightConfig;
    }

    public void setKeyWeightConfig(Map<String, String> keyWeightConfig) {
        this.keyWeightConfig = keyWeightConfig;
    }

    /**
     * Getter method for property <tt>keyWeightMapConfig</tt>.
     *
     * @return property value of keyWeightMapConfig
     */
    public Map<String, TDataSourceKeyWeightRandom> getKeyWeightMapConfig() {
        return keyWeightMapConfig;
    }

    /**
     * Setter method for property <tt>keyWeightMapConfig</tt>.
     *
     * @param keyWeightMapConfig value to be assigned to property keyWeightMapConfig
     */
    public void setKeyWeightMapConfig(Map<String, TDataSourceKeyWeightRandom> keyWeightMapConfig) {
        this.keyWeightMapConfig = keyWeightMapConfig;
    }

    public RuntimeConfigHolder<TddlRuntime> getRuntimeConfigHolder() {
        return runtimeConfigHolder;
    }

    public String getConfServerType() {
        return confServerType.name();
    }

    public void setConfServerType(String confServerType) {
        this.confServerType = Enum.valueOf(ConfigServerType.class, confServerType);
    }

    public Map<ConfigServerType, ?> getDbWeightListeners() {
        return ImmutableMap.of(ConfigServerType.MY_CONFIG_SERVER, this.dbWeightChangeListener);
    }

    public enum ConfigServerType {
        MY_CONFIG_SERVER,
        TB_DIAMOND;
    }

    private static enum weightRWPQEnum {
        rWeight(0), wWeight(1), readPriority(2), writePriority(3);
        private Integer value;

        weightRWPQEnum(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return value;
        }
    }

    public void setSupportZkConfigDbWeight(boolean supportZkConfigDbWeight) {
        isSupportZkConfigDbWeight = supportZkConfigDbWeight;
    }

    public void setDbWeightzkClientBean(ZkClient dbWeightzkClientBean) {
        this.dbWeightzkClientBean = dbWeightzkClientBean;
    }
}
