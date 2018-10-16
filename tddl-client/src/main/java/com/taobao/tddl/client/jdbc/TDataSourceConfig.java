package com.taobao.tddl.client.jdbc;

import com.google.common.collect.ImmutableMap;
import com.taobao.tddl.client.controller.RuleController;
import com.taobao.tddl.client.controller.RuleControllerImpl;
import com.taobao.tddl.client.controller.SpringBasedDispatcherImpl;
import com.taobao.tddl.client.dispatcher.SqlDispatcher;
import com.taobao.tddl.client.jdbc.dbselector.EquityDbManager;
import com.taobao.tddl.client.jdbc.dbselector.PriorityDbGroupSelector;
import com.taobao.tddl.common.ConfigServerHelper;
import com.taobao.tddl.common.ConfigServerHelper.DataListener;
import com.taobao.tddl.common.DBType;
import com.taobao.tddl.common.config.DefaultTddlConfigParser;
import com.taobao.tddl.common.config.TddlConfigParser;
import com.taobao.tddl.common.config.beans.*;
import com.taobao.tddl.common.config.beans.TableRule.ParseException;
import com.taobao.tddl.common.util.TableSuffixTypeEnum;
import com.taobao.tddl.parser.SQLParser;
import com.taobao.tddl.parser.SQLParserImp;
import com.taobao.tddl.rule.bean.*;
import com.taobao.tddl.rule.ruleengine.entities.abstractentities.ListSharedElement.DEFAULT_LIST_RESULT_STRAGETY;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.*;

/**
 * TDataSource的配置类，专门放置TDataSource的配置处理代码，为简化配置服务
 */
public class TDataSourceConfig extends TGroupDataSourceConfig {

    protected static final Log logger = LogFactory
            .getLog(TDataSourceConfig.class);

    private static final String DEFAULT_WRITE_RULE_ID = "tddl_root";
    private static final String DEFAULT_READ_RULE_ID = "tddl_root";
    private static final String DEFAULT_GENERATOR_URL = null;
    private static final String DEFAULT_RULE_URL = "/tddl-rule.xml";
    /*
     *  是否替换hint中的逻辑表名，默认是不替换
     */
    private boolean isHintReplaceSupport = false;
    private HintReplaceType hintReplaceType = HintReplaceType.MY;

    private final TddlConfigParser<AppRule> shardRuleParser = new DefaultTddlConfigParser<AppRule>();
    protected ThreadLocal<List<DatabaseBasedMapping>> mappingHandlers;
    //protected Map<String, DBSelector> dsSelectors = new HashMap<String, DBSelector>();
    protected RuleController ruleController;
    protected SqlExecuteListener sqlExecuteListener;
    /**
     * 指定该TDS是否需要处理行复制（初始化或订阅行复制配置）
     */
    protected boolean isHandleReplication;
    /**
     * 是否在statlog上打印真正的db和tables执行信息。默认关闭
     */
    protected boolean enableProfileRealDBAndTables;
    private String[] writeDispatcherRuleUrl;
    private String[] readDispatcherRuleUrl;
    private String[] writeReadDispatcherRuleUrl;
    private String writeRuleRootBeanID = DEFAULT_WRITE_RULE_ID;
    private String readRuleRootBeanID = DEFAULT_READ_RULE_ID;
    private boolean isUseLocalConfig = false;
    private String[] appRuleFiles;
    private String appRuleContent;

    private String defaultDBWeightConfigFile="/tddl/dbweight";
    //处理规则订阅的监听器
    private DataListener shardRuleListener = new DataListener() {
        public void onDataReceiveAtRegister(
                Object data) {
            AppRule tddlConfig = shardRuleParser
                    .parseCongfig((String) data);
            if (tddlConfig != null) {
                TDataSourceConfig.this
                        .init(tddlConfig);
            }
        }

        public void onDataReceive(
                Object data) {
            logger
                    .warn("暂不支持动态修改分库分表规则，收到推送："
                            + data);
        }
    };
    private DataListener dbWeightListeners = new ConfigServerHelper.AbstractDataListener() {
        public void onDataReceive(Object data) {
            Properties p = ConfigServerHelper.parseProperties(data, "[dbWeightListener]");
            logger.warn("收到对等数据库权重配置：" + getReceivDataStr(p));
            //如果包含 machine-name信息，表明此时开启了单机推送读写权重配置信息，反之认为全部推送；
            //但如果value和本机hostname不同的话，说明不是推送的不是本机，此时不更改本地配置，即不接受推送
            if (p != null && isResetWeightConfig(p)) {
                resetDbWeight(p);
            }
        }
    };

   /* private final ZkNodeCahce nodeCache = new ZkNodeCahce(defaultDBWeightConfigFile);
    private NodeCacheListener dbWeightChangeListener = new NodeCacheListener() {
        @Override
        public void nodeChanged() throws Exception {
            byte[] bytes = nodeCache.getCurrentData().getData();
            ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
            Properties p = new Properties();
            p.load(inputStream);
            resetDbWeight(p);
        }
    };*/

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

    //added by fanzeng,添加对hint index是否替换的配置开关
    public boolean isHintReplaceSupport() {
        return isHintReplaceSupport;
    }

    public void setIsHintReplaceSupport(boolean isHintReplaceSupport) {
        this.isHintReplaceSupport = isHintReplaceSupport;
    }

    public HintReplaceType getHintReplaceType() {
        return hintReplaceType;
    }

    public void setHintReplaceType(HintReplaceType hintReplaceType) {
        this.hintReplaceType = hintReplaceType;
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

    /**
     * 根据ShardRule初始化Dispatcher:
     * 将master分库规则，初始化为writeDispatcher;
     * 将slave分库规则，初始化为readDispatcher;
     */
    private void init(AppRule appRule) {
        SQLParser parser = new SQLParserImp();
        this.writeDispatcher = buildSqlDispatcher(appRule.getMasterRule(), parser);
        this.readDispatcher = buildSqlDispatcher(appRule.getSlaveRule(), parser);
    }

    private SqlDispatcher buildSqlDispatcher(ShardRule shardRule, SQLParser parser) {
        if (shardRule == null)
            return null;
        /**
         * Use defaultDbType to overwrite dbType of shardRule.
         * Added by dongjian151
         */
        shardRule.setDbtype(getDbType());
        TDDLRoot tddlRoot = new TDDLRoot();
        tddlRoot.setDBType(shardRule.getDbType());
        Map<String/*key*/, LogicTable> logicTableMap = new HashMap<String, LogicTable>();
        if (shardRule.getTableRules() != null) {
            for (Map.Entry<String/*逻辑表名*/, TableRule> e : shardRule.getTableRules().entrySet()) {
                setDbTypeForDbIndex(shardRule.getDbType(), e.getValue().getDbIndexArray());
                LogicTable logicTable = toLogicTable(e.getValue());
                logicTable.setLogicTableName(e.getKey());
                logicTable.setDBType(shardRule.getDbType());
                //logicTable.init(); //tddlRoot.init()包含了logicTable.init()
                logicTableMap.put(e.getKey(), logicTable);
            }
        }
        tddlRoot.setLogicTableMap(logicTableMap);
        if (shardRule.getDefaultDbIndex() != null) {
            tddlRoot.setDefaultDBSelectorID(shardRule.getDefaultDbIndex());
        }
        tddlRoot.init();
        return buildSqlDispatcher(parser, tddlRoot);
    }

    private void setDbTypeForDbIndex(DBType dbType, String[] dbIndexes) {
        for (String dbIndex : dbIndexes) {
            DBSelector dbs = this.runtimeConfigHolder.get().dbSelectors.get(dbIndex);
            if (dbs == null) {
                throw new IllegalArgumentException("规则配置错误：[" + dbIndex + "]在dataSourcePool中没有配置");
            }
            dbs.setDbType(dbType);
            //bug fixed by fanzeng. 因为tddl默认的dbType 是mysql，而在 按优先级进行选择db的时候，如果连接db出现异常，
            //priorityDbGroupSelector会利用内部包装的对等库的 dbtype去选择 excetptionSorter,如果db类型是oracle的，
            //bug fixed 之前，并未初始化EquityDbManager的dbtype，导致会用默认的 mysql类型去选择；
            if (dbs instanceof PriorityDbGroupSelector) {
                EquityDbManager[] equityDbmanager = ((PriorityDbGroupSelector) dbs)
                        .getPriorityGroups();
                if (equityDbmanager == null) {
                    throw new IllegalArgumentException("优先级的对等库并未初始化，请检查配置！");
                }
                for (int i = 0; i < equityDbmanager.length; i++) {
                    equityDbmanager[i].setDbType(dbType);
                }
            }

        }
    }

    private void addMappingRule(MappingRuleBean bean, List<Object> dbRules) {
        if (!this.springContext.containsBean(bean.getMappingRuleBeanId())) {
            //如果父SpringContext中不包含MappingRuleBeanId的定义,则忽略这条映射规则
            logger
                    .warn("Discard a mapping rule because there is no definition for mappingRuleBeanId: "
                            + bean.getMappingRuleBeanId());
            return;
        }
        MappingRule mr = new MappingRule();
        mr.setParameter(bean.getParameter());
        mr.setExpression(bean.getExpression());
        DatabaseBasedMapping mappingHandler = (TairBasedMapping) this.springContext.getBean(bean
                .getMappingRuleBeanId());
        if (mappingHandler.getRouteDatasource() == null) {
            if (this.mappingHandlers == null) {
                this.mappingHandlers = new ThreadLocal<List<DatabaseBasedMapping>>();
            }
            List<DatabaseBasedMapping> handlers = this.mappingHandlers.get();
            if (handlers == null) {
                handlers = new ArrayList<DatabaseBasedMapping>();
                this.mappingHandlers.set(handlers);
            }
            handlers.add(mappingHandler);
            //只是简单的设为this的话，在事务中读路由表会走到主库，非事务的读才会走读库。所以用ThreadLocal做特殊处理
            mappingHandler.setRouteDatasource((DataSource) this);
        }
        mr.setMappingHandler(mappingHandler);
        dbRules.add(mr);
        return;
    }

    /**
     * @return
     */
    public SimpleTableMapProvider getTableMapProvider(TableRule tableRule) {
        SimpleTableMapProvider simpleTableMapProvider = null;
        SuffixManager suffixManager = tableRule.getSuffixManager();
        Suffix suf = suffixManager.getSuffix(0);
        if (suf.getTbType().equals(TableSuffixTypeEnum.twoColumnForEachDB.getValue())) {
            simpleTableMapProvider = new SimpleTableTwoColumnsMapProvider();
            SimpleTableTwoColumnsMapProvider twoColumns = (SimpleTableTwoColumnsMapProvider) simpleTableMapProvider;
            Suffix suf2 = suffixManager.getSuffix(1);
            twoColumns.setFrom2(suf2.getTbSuffixFrom());
            twoColumns.setTo2(suf2.getTbSuffixTo());
            twoColumns.setWidth2(suf2.getTbSuffixWidth());
            twoColumns.setPadding2(suf2.getTbSuffixPadding());
        } else if (TableSuffixTypeEnum.dbIndexForEachDB.getValue().equals(suf.getTbType())) {
            simpleTableMapProvider = new SimpleTableDatabaseMapProvider();
        } else if (TableSuffixTypeEnum.groovyTableList.getValue().equals(suf.getTbType())
                || TableSuffixTypeEnum.groovyThroughAllDBTableList.getValue().equals(
                suf.getTbType())
                || TableSuffixTypeEnum.groovyAdjustTableList.getValue().equals(suf.getTbType())) {
            simpleTableMapProvider = new GroovyTableDatabaseMapProvider();
            try {
                GroovyTableDatabaseMapProvider groovyTableDatabaseMapProvider = (GroovyTableDatabaseMapProvider) simpleTableMapProvider;
                groovyTableDatabaseMapProvider.setTbType(suf.getTbType());
                groovyTableDatabaseMapProvider.setExpression(suffixManager.getExpression());
                groovyTableDatabaseMapProvider.setTbPreffix(tableRule.getTbPreffix());
                //设定db的个数，在实现groovy的分表均匀分布的时候会用到。
                groovyTableDatabaseMapProvider.setDbNumber(tableRule.getDbIndexCount());
            } catch (ParseException e) {
                logger.error("Tbsuffix的配置有问题！，请检查");
            }

        } else {
            simpleTableMapProvider = new SimpleTableMapProvider();
        }
        return simpleTableMapProvider;
    }

    private LogicTable toLogicTable(TableRule tableRule) {
        SimpleLogicTable st = new SimpleLogicTable();
        st.setAllowReverseOutput(tableRule.isAllowReverseOutput());
        st.setDatabases(tableRule.getDbIndexes());
        if (tableRule.getDbRuleArray() != null) {
            List<Object> dbRules = new ArrayList<Object>(tableRule.getDbRuleArray().length);
            for (Object obj : tableRule.getDbRuleArray()) {
                if (obj instanceof MappingRuleBean) {
                    addMappingRule((MappingRuleBean) obj, dbRules);
                } else {
                    dbRules.add((String) obj);
                }
            }
            st.setDatabaseRuleStringList(dbRules);
        }
        if (tableRule.getTbRuleArray() != null) {
            List<Object> tbRules = new ArrayList<Object>(tableRule.getTbRuleArray().length);
            for (Object obj : tableRule.getTbRuleArray()) {
                if (obj instanceof MappingRuleBean) {
                    addMappingRule((MappingRuleBean) obj, tbRules);
                } else {
                    tbRules.add((String) obj);
                }
            }
            st.setTableRuleStringList(tbRules);
            //如果是2列的情况就用2列的类，否则按以前的逻辑走
            st.setSimpleTableMapProvider(getTableMapProvider(tableRule));
            SuffixManager suffixManager = tableRule.getSuffixManager();
            Suffix suf = suffixManager.getSuffix(0);

            //分表规则存在，才设置表后缀属性，设置了任何一个属性，就表示用simpleTableMapProvider
            st.setFrom(suf.getTbSuffixFrom());
            st.setTo(suf.getTbSuffixTo());
            st.setWidth(suf.getTbSuffixWidth());
            st.setPadding(suf.getTbSuffixPadding());
            st.setTablesNumberForEachDatabases(suf.getTbNumForEachDb());
        }
        if (tableRule.getUniqueKeyArray() != null) {
            st.setUniqueKeys(Arrays.asList(tableRule.getUniqueKeyArray()));
        }
        st.setNeedRowCopy(tableRule.isNeedRowCopy());
        if (tableRule.isDisableFullTableScan()) {
            st.setDefaultListResultStragety(DEFAULT_LIST_RESULT_STRAGETY.NONE);
        } else {
            st.setDefaultListResultStragety(DEFAULT_LIST_RESULT_STRAGETY.FULL_TABLE_SCAN);
        }

        return st;
    }

    protected void initSqlDispatcher() {
        if (this.ruleController != null) {
            //旧规则不需要做其他初始化
            return;
        }
        if (this.isUseLocalConfig) {
            if (appRuleFiles != null) {
                //优先用和configserver对应的新配置方式
                initByAppRuleFile(appRuleFiles);
            } else if (StringUtils.isNotBlank(appRuleContent)) {
                initByAppRuleContent(appRuleContent);
            } else {
                initByLocalConfig();
            }
        } else {
            //订阅分库分表规则
            Object firstFetchedShardRule = ConfigServerHelper.subscribeShardRuleConfig(getAppName(),
                    shardRuleListener);
            if (firstFetchedShardRule == null) {
                throw new IllegalStateException("没有接收到分库分表规则配置");
            }
        }
    }

    private void initByAppRuleFile(String[] appRuleFiles) {
        AppRule appRule = (AppRule) getAppRule(appRuleFiles);
        this.init(appRule);
    }

    private void initByAppRuleContent(String appRuleContent) {
        AppRule appRule = (AppRule) getAppRule(appRuleContent);
        this.init(appRule);
    }

    private Object geAppRuleFromResources(Resource[] resources) {
        GenericApplicationContext ctx = new GenericApplicationContext();
        ctx.setClassLoader(springContext.getClassLoader());
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(ctx);
        beanDefinitionReader.setValidationMode(XmlBeanDefinitionReader.VALIDATION_NONE);
        beanDefinitionReader.setNamespaceAware(true);
        beanDefinitionReader.setBeanClassLoader(springContext.getClassLoader());
        beanDefinitionReader.loadBeanDefinitions(resources);
        ctx.refresh();
        return ctx.getBean("root");
    }

    public Object getAppRule(String content) {
        InputStream stream = null;
        try {
            stream = new ByteArrayInputStream(content.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        Resource resource = new InputStreamResource(stream);
        Resource[] resources = new Resource[]{resource};
        return geAppRuleFromResources(resources);
    }

    public Object getAppRule(String[] appRuleFiles) {
        Resource[] resources = new Resource[appRuleFiles.length];
        ClassLoader appClassLoader = springContext.getBeanFactory().getBeanClassLoader();
        if (appClassLoader == null)
            appClassLoader = Thread.currentThread().getContextClassLoader();
        for (int i = 0; i < appRuleFiles.length; i++) {
            String ruleFile = appRuleFiles[i];
            if (ruleFile.startsWith("classpath:")) {
                ruleFile = ruleFile.substring("classpath:".length(), ruleFile.length());
            }
            InputStream stream = getResourceAsStream(ruleFile, TDataSourceConfig.class,
                    appClassLoader);
            resources[i] = new InputStreamResource(stream);
        }

        return geAppRuleFromResources(resources);
    }

    private URL getResource(String resourceName, Class callingClass, ClassLoader loader) {
        URL url = null;

        url = loader.getResource(resourceName);

        if (url == null) {
            url = Thread.currentThread().getContextClassLoader().getResource(resourceName);
        }

        if (url == null) {
            url = callingClass.getClassLoader().getResource(resourceName);
        }

        return url;
    }

    private InputStream getResourceAsStream(String resourceName, Class callingClass,
                                            ClassLoader loader) {
        URL url = getResource(resourceName, callingClass, loader);

        try {
            return (url != null) ? url.openStream() : null;
        } catch (IOException e) {
            return null;
        }
    }

    private void initByLocalConfig() {
        SQLParser parser = new SQLParserImp();
        if (writeReadDispatcherRuleUrl != null) {
            //有读写属性的应该被添加到一个公共的集合中。
            writeDispatcherRuleUrl = appendMasterSlaveDispatcherRuleUrl(writeReadDispatcherRuleUrl,
                    writeDispatcherRuleUrl);
            readDispatcherRuleUrl = appendMasterSlaveDispatcherRuleUrl(writeReadDispatcherRuleUrl,
                    readDispatcherRuleUrl);
        }

        //如果masterDispatcher设定了url
        if (writeDispatcherRuleUrl != null) {
            //如果有的情况下，获得context.然后将当前外部context注入进去
            FileSystemXmlApplicationContext masterCtx = new FileSystemXmlApplicationContext(
                    writeDispatcherRuleUrl, springContext);

            TDDLRoot writeRoot = (TDDLRoot) masterCtx.getBean(writeRuleRootBeanID);
            //在这个时候，内部的对象已经通过spring拼装完毕并init初始化好。因此我只需要直接for循环将dbtype设置到每一个数据源中。
            writeRoot.init();
            //如果写规则不为空 则组装写规则，规则本身共享parser
            writeDispatcher = buildSqlDispatcher(parser, writeRoot);
        }
        //如果slaveUrl被设定
        if (readDispatcherRuleUrl != null) {
            //如果有的情况下，获得context.然后将当前外部context注入进去
            FileSystemXmlApplicationContext slaveCtx = new FileSystemXmlApplicationContext(
                    readDispatcherRuleUrl, springContext);
            TDDLRoot readRoot = (TDDLRoot) slaveCtx.getBean(readRuleRootBeanID);
            readRoot.init();
            readDispatcher = buildSqlDispatcher(parser, readRoot);
        }

    }

    public String getRuleUrl() {
        if (ruleController == null) {
            //兼容旧的使用方式：spring中不设init，直接设ruleUrl就可以使用
            ruleController = new RuleControllerImpl(DEFAULT_GENERATOR_URL, DEFAULT_RULE_URL);
        }
        return ruleController.getRuleUrl();
    }

    public void setRuleUrl(String ruleUrl) {
        if (ruleController == null) {
            //兼容旧的使用方式：spring中不设init，直接设ruleUrl就可以使用
            ruleController = new RuleControllerImpl(DEFAULT_GENERATOR_URL, DEFAULT_RULE_URL);
        }
        ruleController.setRuleUrl(ruleUrl);
    }

    /**
     * 以下为无逻辑的getter/setter
     */

    public String getWriteRuleRootBeanID() {
        return writeRuleRootBeanID;
    }

    public void setWriteRuleRootBeanID(String writeRuleRootBeanID) {
        this.writeRuleRootBeanID = writeRuleRootBeanID;
    }

    public String[] getMasterDispatcherRuleUrl() {
        return writeDispatcherRuleUrl;
    }

    public void setMasterDispatcherRuleUrl(String[] masterDispatcherRuleUrl) {
        this.writeDispatcherRuleUrl = masterDispatcherRuleUrl;
    }

    public String[] getSlaveDispatcherRuleUrl() {
        return readDispatcherRuleUrl;
    }

    public void setSlaveDispatcherRuleUrl(String[] slaveDispatcherRuleUrl) {
        this.readDispatcherRuleUrl = slaveDispatcherRuleUrl;
    }

    public String getReadRuleRootBeanID() {
        return readRuleRootBeanID;
    }

    public void setReadRuleRootBeanID(String readRuleRootBeanID) {
        this.readRuleRootBeanID = readRuleRootBeanID;
    }

    public String[] getMasterSlaveDispatcherRuleUrl() {
        return writeReadDispatcherRuleUrl;
    }

    public void setMasterSlaveDispatcherRuleUrl(String[] masterSlaveDispatcherRuleUrl) {
        this.writeReadDispatcherRuleUrl = masterSlaveDispatcherRuleUrl;
    }

    public void setWriteDispatcherRuleUrl(String[] writeDispatcherRuleUrl) {
        this.writeDispatcherRuleUrl = writeDispatcherRuleUrl;
    }

    public void setWriteReadDispatcherRuleUrl(String[] writeReadDispatcherRuleUrl) {
        this.writeReadDispatcherRuleUrl = writeReadDispatcherRuleUrl;
    }

    public void setReadDispatcherRuleUrl(String[] readDispatcherRuleUrl) {
        this.readDispatcherRuleUrl = readDispatcherRuleUrl;
    }

    public SqlExecuteListener getSqlExecuteListener() {
        return sqlExecuteListener;
    }

    public void setSqlExecuteListener(SqlExecuteListener sqlExecuteListener) {
        this.sqlExecuteListener = sqlExecuteListener;
    }

    public void setAppRuleFile(String appRuleFile) {
        this.appRuleFiles = appRuleFile.split(",");
    }

    public String[] getAppRuleFiles() {
        return appRuleFiles;
    }

    public void setAppRuleFiles(String[] appRuleFiles) {
        this.appRuleFiles = appRuleFiles;
    }

    public String getAppRuleContent() {
        return appRuleContent;
    }

    public void setAppRuleContent(String appRuleContent) {
        this.appRuleContent = appRuleContent;
    }

    public boolean isUseLocalConfig() {
        return isUseLocalConfig;
    }

    public void setUseLocalConfig(boolean isUseLocalConfig) {
        this.isUseLocalConfig = isUseLocalConfig;
    }

    public boolean isHandleReplication() {
        return isHandleReplication;
    }

    public void setHandleReplication(boolean isHandleReplication) {
        this.isHandleReplication = isHandleReplication;
    }

    public void setIsUseLocalConfig(boolean isUseLocalConfig) {
        this.isUseLocalConfig = isUseLocalConfig;
    }

    public Map<ConfigServerType, ?> getDbWeightListeners() {
        return ImmutableMap.of(ConfigServerType.TB_DIAMOND, this.dbWeightListeners,
                ConfigServerType.MY_CONFIG_SERVER, this.dbWeightChangeListener);
    }

    public enum HintReplaceType {
        MY, TB;
    }
}
