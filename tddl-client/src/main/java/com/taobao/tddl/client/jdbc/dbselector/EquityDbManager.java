package com.taobao.tddl.client.jdbc.dbselector;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.alibaba.common.lang.StringUtil;
import com.taobao.datasource.LocalTxDataSourceDO;
import com.taobao.tddl.client.jdbc.TStatement.DB_OPERATION_TYPE;
import com.taobao.tddl.common.ConfigServerHelper;
import com.taobao.tddl.common.RuntimeConfigHolder;
import com.taobao.tddl.common.WeightRandom;
import com.taobao.tddl.common.operationDBType;
import com.taobao.tddl.common.ConfigServerHelper.AbstractDataListener;
import com.taobao.tddl.common.ConfigServerHelper.DataListener;
import com.taobao.tddl.common.config.DataSourceHelper;
import com.taobao.tddl.common.jdbc.DataSourceConfig;

/**
 * 对等数据库管理器
 * 可以是读对等：如多个读库，每个库的数据完全相同。对等读取
 * 可以是写对等：如日志库，每个库数据不同，一条数据写入哪个库都可以。对等写入
 *
 * 支持动态推送权重，动态加减库
 *
 * @author linxuan
 *
 * @param <T> JdbcTemplate 或则 DataSource
 *
 * TODO 从DataSource对象本身判断是不是同一个库，不再保留这种配置信息：Map<String, Map<String, Object>>
 */
public class EquityDbManager extends AbstractDBSelector {
    private static final Log logger = LogFactory.getLog(EquityDbManager.class);

    /**
     * 运行期会动态改变的状态。保持不变对象，只能重建，不能修改。
     */
    private static class DbRuntime {
        public final Map<String, DataSource>       dataSources;      //最终结果
        public final Map<String, DataSourceHolder> dataSourceHolders; //包装过的datasource集合,主要包括是否可读等属性
        public final Map<String, DataSourceConfig> dataSourceConfigs;
        public final WeightRandom                  weightRandom;

        public DbRuntime(Map<String, DataSource> dataSources,
                         Map<String, DataSourceConfig> dataSourceConfigs, WeightRandom weightRandom) {
            this.dataSources = Collections.unmodifiableMap(dataSources);

            this.dataSourceConfigs = dataSourceConfigs == null ? new HashMap<String, DataSourceConfig>(
                    0)
                    : Collections.unmodifiableMap(dataSourceConfigs);
            this.weightRandom = weightRandom;

            this.dataSourceHolders = getDataSourceHolders(dataSources);

        }

        /**
         * 得到包装过的datasource集合；
         * @param dataSources
         * @return
         */
        public Map<String, DataSourceHolder> getDataSourceHolders(
                Map<String, DataSource> dataSources) {
            Map<String, DataSourceHolder> map = new HashMap<String, DataSourceHolder>(dataSources
                    .size());
            for (Map.Entry<String, DataSource> entry : dataSources.entrySet()) {
                map.put(entry.getKey(), new DataSourceHolder(entry.getValue()));

            }
            return Collections.unmodifiableMap(map);
        }

        public DataSource select() {
            return this.dataSources.get(this.weightRandom.select(null));
        }
    }

    private final RuntimeConfigHolder<DbRuntime> dbHolder = new RuntimeConfigHolder<DbRuntime>();

    private DataSourceChangeListener             dataSourceChangeListener;

    /**
     * key:日志库键值，单独推送权重时使用
     *     日志库中是properties文件中自定义的key, 在分库分表读重试中是dbSelectId_index
     * value：日志库对应的JdbcTemplate
     */
    private Map<String, DataSource>              initDataSources;                                //最终结果
    /**
     * key: 一个log数据源键值
     * value:数据源配置Properties对应的Map
     *    key：数据源需要的参数如driver,username..
     *    value:参数的值
     */
    private Map<String, DataSourceConfig>        initDataSourceConfigs;
    private String                               dataSourceConfigFile;
    private String                               dbConfigDataId;                                 //订阅数据源配置的dataId
    private String                               dbWeightDataId;                                 //订阅数据源权重配置的dataId

    public EquityDbManager(String id) {
        super(id);
    }

    public EquityDbManager(String id, Map<String, DataSource> initDataSources) {
        super(id);
        this.initDataSources = initDataSources;
        try {
            this.init();
        } catch (IOException e) {
            logger.error("Should not happen!!", e); //因为是在解析dataSourceConfigFile才会报IOException
        }
    }

    public EquityDbManager(String id, Map<String, DataSource> initDataSources,
                           Map<String, Integer> weights) {
        this(id, initDataSources);
        if (weights != null) {
            setWeightRandom(new WeightRandom(weights));
        }
    }

    /**
     * 各个配置优先级：1.dataSources 2.dataSourceConfigs 3.dataSourceConfigFile 4.订阅
     */
    public void init() throws IOException {
        //初始化数据源
        if (this.initDataSources != null) {
            //如果直接配置了syncLogDataSources，则直接使用，不支持订阅和动态修改
            WeightRandom weightRandom = new WeightRandom(this.initDataSources.keySet().toArray(
                    new String[0]));
            this.dbHolder.set(new DbRuntime(this.initDataSources, null, weightRandom));
        } else if (this.initDataSourceConfigs != null) {
            //如果直接配置了syncLogDataSourceConfigs，则直接使用，不支持订阅和动态修改
            initDataSources(this.initDataSourceConfigs);
        } else if (this.dataSourceConfigFile != null) {
            //如果直接配置了dataSourceConfigFile，则解析文件，不支持订阅和动态修改
            Properties p = new Properties();
            if (dataSourceConfigFile.startsWith("/")) {
                dataSourceConfigFile = StringUtil.substringAfter(dataSourceConfigFile, "/");
            }
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(
                    dataSourceConfigFile);
            if (null == inputStream) {
                throw new IllegalArgumentException("dataSource配置文件不存在: " + dataSourceConfigFile);
            }
            p.load(inputStream);
            initDataSources(parseDataSourceConfig(p));
        } else {
            if (this.dbConfigDataId == null) {
                throw new IllegalArgumentException("没有配置dbConfigDataId");
            }
            //订阅日志库数据源配置
            Object firstDbConfig = ConfigServerHelper.subscribePersistentData(dbConfigDataId,
                    datasourceListener);
            if (firstDbConfig == null) {
                throw new IllegalStateException("没有接收到数据库配置");
            }
            //设置数据源信息
            Map<String, DataSourceConfig> configMap = parseDataSourceConfig((Properties) firstDbConfig);
            initDataSources(configMap);
        }
        if (this.dbWeightDataId != null) {
            //订阅据源权重配置：即使没有订阅数据源配置，也可以单独订阅权重配置
            Object firstDbWeight = ConfigServerHelper.subscribePersistentData(dbWeightDataId,
                    weightConfigListener);
            if (firstDbWeight == null) {
                logger.warn("没有接收到数据库权重配置，使用默认权重");
            }
        }
    }

    /**
     * 根据权重，随机返回一个DataSource
     * @return
     */
    public DataSource select() {
        return this.dbHolder.get().select();
    }

    //TODO 考虑接口是否缩小为只返回DataSource[]
    public Map<String, DataSource> getDataSources() {
        return this.dbHolder.get().dataSources;
    }

    public Map<String, Integer> getWeights() {
        return this.dbHolder.get().weightRandom.getWeightConfig();
    }

    /**
     * 在所管理的数据库上重试执行一个回调操作。失败了根据权重选下一个库重试
     * 以根据权重选择到的DataSource，和用户传入的自用参数args，重试调用DataSourceTryer的tryOnDataSource方法
     * @param failedDataSources 已知的失败DS及其异常
     * @param args 透传到DataSourceTryer的tryOnDataSource方法中
     * @return null表示执行成功。否则表示重试次内执行失败，返回SQLException列表
     */
    public <T> T tryExecute(Map<DataSource, SQLException> failedDataSources,
                            DataSourceTryer<T> tryer, int times, DB_OPERATION_TYPE operationType,
                            Object... args)
            throws SQLException {
        DbRuntime dbrt = this.dbHolder.get();
        WeightRandom wr = dbrt.weightRandom;
        List<SQLException> exceptions = new ArrayList<SQLException>(0);
        List<String> excludeKeys = new ArrayList<String>(0);
        if (failedDataSources != null) {
            exceptions.addAll(failedDataSources.values());
            times = times - failedDataSources.size(); //扣除已经失败掉的重试次数
            for (SQLException e : failedDataSources.values()) {
                if (!exceptionSorter.isExceptionFatal(e)) {
                    //有一个异常（其实是最后加入的异常，因map无法知道顺序，只能遍历）不是数据库不可用异常，则抛出
                    //是不是应该在发现非数据库fatal之后就立刻抛出，而不是放到failedDataSources这个map里?(guangxia)
                    return tryer.onSQLException(exceptions, exceptionSorter, args);
                }
            }
        }
        for (int i = 0; i < times; i++) {
            String name = wr.select(excludeKeys);
            if (name == null) {
                exceptions.add(new NoMoreDataSourceException("在执行sql的过程中，没有可用数据源了！"));
                if (logger.isWarnEnabled()) {
                    logger.warn("在此次执行sql的过程中，数据源" + wr.getAllDbKeys() + "均不可用了！");
                }
                break;
            }
            DataSourceHolder selectedDS = dbrt.dataSourceHolders.get(name);
            if (selectedDS == null) {
                //不应该出现的。初始化逻辑应该保证空的数据源(null)不会被加入DataSourceHolders
                throw new IllegalStateException("Can't find DataSource for name:" + name
                        + "from dataSourceHolders!");
            }
            if (failedDataSources != null && failedDataSources.containsKey(selectedDS.getDs())) {
                excludeKeys.add(name);
                i--; //这次不算重试次数
                continue;
            }
            if (logger.isDebugEnabled()) {
                logger.debug("selected database name=" + name);
            }
            int size1=excludeKeys.size();
            //如果该数据源已经被标识为不可用
            T t = selectedDS.tryOnSelectedDataSource(operationType, wr, dbrt.dataSourceHolders,
                    failedDataSources, tryer,
                    exceptions,
                    excludeKeys, exceptionSorter, name, args);
            boolean isAddedIntoExcludeKeys= excludeKeys.size()-size1>0;
            if (isAddedIntoExcludeKeys) {
                continue;
            } else {
                return t;
            }
        }
        //return exceptions; //返回以方便业务记log, 不想tryExecute上多两个参数去填throwSQLException
        return tryer.onSQLException(exceptions, exceptionSorter, args);
    }


    public static interface DataSourceChangeListener {
        public void onDataSourceChanged(Map<String, DataSource> dataSources);
    }

    private final DataListener datasourceListener   = new DataListener() {
        public void onDataReceive(Object data) {
            Properties p = ConfigServerHelper
                    .parseProperties(data,
                            "[synclogDbListener]");
            resetDataSources(parseDataSourceConfig(p));
        }

        public void onDataReceiveAtRegister(
                Object data) {
            Properties p = ConfigServerHelper
                    .parseProperties(data,
                            "[synclogDbListener]");
            initDataSources(parseDataSourceConfig(p));
        }
    };

    protected DataListener     weightConfigListener = new AbstractDataListener() {
        public void onDataReceive(Object data) {
            setWeightRandom(buildWeightRandom(data));
        }
    };

    /**
     * 可以由子类覆写，支持特殊格式
     */
    protected WeightRandom buildWeightRandom(Object data) {
        Map<String, Integer> newWeight = parseWeightConfig(data, "[weightConfig]");
        if (newWeight == null) {
            return null;
        }
        return new WeightRandom(newWeight);
    }

    public void setWeight(Map<String, Integer> weightMap) {
        setWeightRandom(new WeightRandom(weightMap));
    }

    /**
     * 支持动态修改权重
     */
    synchronized boolean setWeightRandom(WeightRandom weightRandom) {
        if (weightRandom == null) {
            return false;
        }
        Map<String, Integer> newWeight = weightRandom.getWeightConfig();
        DbRuntime dbrt = EquityDbManager.this.dbHolder.get();
        for (String newkey : newWeight.keySet()) {
            if (!dbrt.dataSources.containsKey(newkey)) {
                logger.error("新权重的数据源名称在现有数据源中不存在:" + newkey);
                return false;
            }
        }
        if (newWeight.size() < dbrt.dataSources.size()) {
            logger.warn("新权重的数据源名称个数小于原有数据源！");
            return false; //这种情况不被允许更安全一些
        }
        Map<String, DataSource> dataSources = new HashMap<String, DataSource>(dbrt.dataSources
                .size());
        Map<String, DataSourceConfig> configs = new HashMap<String, DataSourceConfig>(
                dbrt.dataSources.size());
        dataSources.putAll(dbrt.dataSources);
        configs.putAll(dbrt.dataSourceConfigs);
        DbRuntime newrt = new DbRuntime(dataSources, configs, weightRandom);
        EquityDbManager.this.dbHolder.set(newrt);
        return true;
    }

    private synchronized void initDataSources(Map<String, DataSourceConfig> configs) {
        if (configs == null)
            return;
        Map<String, DataSource> dataSources = DataSourceHelper.buildDataSources(configs);
        Properties weightPro = paseWeightMapToProp(configs);
        WeightRandom weightRandom = buildWeightRandom(weightPro);
        this.dbHolder.set(new DbRuntime(dataSources, configs, weightRandom));
        if (this.dataSourceChangeListener != null) {
            this.dataSourceChangeListener.onDataSourceChanged(this.dbHolder.get().dataSources);
        }
    }

    private Properties paseWeightMapToProp(Map<String, DataSourceConfig> configs) {
        Properties weightPro = new Properties();
        for (Entry<String, DataSourceConfig> entry : configs.entrySet()) {
            String key = entry.getKey();
            String value = String.valueOf(entry.getValue().getWeight());
            weightPro.put(key, value);
        }
        return weightPro;
    }

    private synchronized void resetDataSources(Map<String, DataSourceConfig> configs) {
        if (configs == null)
            return;
        DbRuntime dbrt = this.dbHolder.get();
        Map<String, DataSource> newDataSources = DataSourceHelper.buildDataSource(configs,
                dbrt.dataSourceConfigs);
        Properties weightPro = paseWeightMapToProp(configs);
        WeightRandom weightRandom = buildWeightRandom(weightPro);
        DbRuntime newrt = new DbRuntime(newDataSources, configs, weightRandom);
        this.dbHolder.set(newrt);
        if (this.dataSourceChangeListener != null) {
            this.dataSourceChangeListener.onDataSourceChanged(this.dbHolder.get().dataSources);
        }
    }

    private static Map<String, Integer> parseWeightConfig(Object data, String msg) {
        Properties p = ConfigServerHelper.parseProperties(data, msg);
        if (p == null) {
            return null;
        }
        Map<String, Integer> config = new HashMap<String, Integer>(p.size());
        for (Entry<Object, Object> entrySet : p.entrySet()) {
            String key = ((String) entrySet.getKey()).trim();
            String value = ((String) entrySet.getValue()).trim();
            try {
                config.put(key, Integer.valueOf(value));
            } catch (Exception e) {
                logger.error("从config server中接收到了错误的配置:" + value, e);
                return null;
            }
        }
        return config;
    }

    /**
     * @param properties 样例如下：
     * datasource0.driver=com.mysql.jdbc.Driver
     * datasource0.url=jdbc:mysql://10.253.65.94:3306/main
     * datasource0.user=main
     * datasource0.password=main
     * datasource0.maxActive=1
     * #datasource0.weight=10 #介于每个持久dataId的内容不能重复，否则很难一致，故放弃weight权重属性
     *
     * datasource1.driver=com.mysql.jdbc.Driver
     * datasource1.url=jdbc:mysql://10.253.65.94:3306/main
     * datasource1.user=tddl
     * datasource1.password=tddl
     */
    protected static Map<String, DataSourceConfig> parseDataSourceConfig(Properties properties) {
        if (properties == null) {
            return null;
        }
        Map<String, DataSourceConfig> configs = new HashMap<String, DataSourceConfig>();
        for (Entry<Object, Object> entry : properties.entrySet()) {
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            String dataSourceKey = StringUtil.substringBeforeLast(key, ".");
            ;
            String configKey = StringUtil.substringAfterLast(key, ".");
            DataSourceConfig config = configs.get(dataSourceKey);
            if (null == config) {
                config = new DataSourceConfig();
                configs.put(dataSourceKey, config);
            }
            LocalTxDataSourceDO configDO = config.getLocalTxDataSourceDO();
            if (null == configDO) {
                configDO = new LocalTxDataSourceDO();
                config.setLocalTxDataSourceDO(configDO);
            }
            if ("type".equalsIgnoreCase(configKey)) {
                config.setType(value);
            }
            if ("weight".equalsIgnoreCase(configKey) && StringUtil.isNumeric(value)) {
                config.setWeight(Integer.valueOf(value));
            }
            //如果type是 jndi方式，jidiName从这里指定
            if ("jndiName".equalsIgnoreCase(configKey)) {
                configDO.setJndiName(value);
            }
            if ("driver".equalsIgnoreCase(configKey)) {
                configDO.setDriverClass(value);
            }
            if ("url".equalsIgnoreCase(configKey)) {
                configDO.setConnectionURL(value);
            }
            if ("user".equalsIgnoreCase(configKey)) {
                configDO.setUserName(value);
            }
            if ("password".equalsIgnoreCase(configKey)) {
                configDO.setPassword(value);
            }
            if ("maxActive".equalsIgnoreCase(configKey)) {
                configDO.setMaxPoolSize(Integer.parseInt(value));
            }
            if ("initialSize".equalsIgnoreCase(configKey)
                    || "minActive".equalsIgnoreCase(configKey)) {
                configDO.setMinPoolSize(Integer.parseInt(value));
            }
        }
        return configs;
    }

    /*
     * 对等库默认不读重试，只有读库才进行读重试，写库不进行写重试；
     */
    public boolean isSupportRetry(operationDBType type) {
        boolean flag = false;
        String dbSelectorId = getId();
        if (dbSelectorId.endsWith("_r") || (type == operationDBType.readFromDb)) {
            flag = true;
        }
        return flag;
    }

    /**
     * 无逻辑的getter/setter
     */
    public void setInitDataSources(Map<String, DataSource> initDataSources) {
        this.initDataSources = initDataSources;
    }

    public void setInitDataSourceConfigs(Map<String, Map<String, Object>> initDataSourceConfigs) {
        if (null != initDataSourceConfigs && !initDataSourceConfigs.isEmpty()) {
            Map<String, DataSourceConfig> dataSourceConfigs = new HashMap<String, DataSourceConfig>(
                    initDataSourceConfigs.size());
            for (Map.Entry<String, Map<String, Object>> entry : initDataSourceConfigs.entrySet()) {
                String key = entry.getKey();
                DataSourceConfig dataSourceConfig = new DataSourceConfig();
                Map<String, Object> config = entry.getValue();
                if (null != config && !config.isEmpty()) {
                    LocalTxDataSourceDO localTxDataSourceDO = new LocalTxDataSourceDO();
                    for (Map.Entry<String, Object> configEntry : config.entrySet()) {
                        String configKey = configEntry.getKey();
                        String configValue = (String) configEntry.getValue();
                        if ("weight".equalsIgnoreCase(configKey)
                                && StringUtil.isNumeric(configValue)) {
                            dataSourceConfig.setWeight(Integer.valueOf(configValue));
                        }
                        if ("type".equalsIgnoreCase(configKey)) {
                            dataSourceConfig.setType(configValue);
                        }
                        if ("jndiName".equalsIgnoreCase(configKey)) {
                            localTxDataSourceDO.setJndiName(configValue);
                        }
                        if ("driver".equalsIgnoreCase(configKey)) {
                            localTxDataSourceDO.setDriverClass(configValue);
                        }
                        if ("url".equalsIgnoreCase(configKey)) {
                            localTxDataSourceDO.setConnectionURL(configValue);
                        }
                        if ("user".equalsIgnoreCase(configKey)) {
                            localTxDataSourceDO.setUserName(configValue);
                        }
                        if ("password".equalsIgnoreCase(configKey)) {
                            localTxDataSourceDO.setPassword(configValue);
                        }
                        if ("maxActive".equalsIgnoreCase(configKey)) {
                            localTxDataSourceDO.setMaxPoolSize(Integer.parseInt(configValue));
                        }
                        if ("initialSize".equalsIgnoreCase(configKey)
                                || "minActive".equalsIgnoreCase(configKey)) {
                            localTxDataSourceDO.setMinPoolSize(Integer.parseInt(configValue));
                        }
                        dataSourceConfig.setLocalTxDataSourceDO(localTxDataSourceDO);
                    }
                    dataSourceConfigs.put(key, dataSourceConfig);
                }
            }
            this.initDataSourceConfigs = dataSourceConfigs;
        }
    }

    public void setDataSourceConfigFile(String dataSourceConfigFile) {
        this.dataSourceConfigFile = dataSourceConfigFile;
    }

    public void setDbConfigDataId(String dbConfigDataId) {
        this.dbConfigDataId = dbConfigDataId;
    }

    public void setDbWeightDataId(String dbWeightDataId) {
        this.dbWeightDataId = dbWeightDataId;
    }

    public void setDataSourceChangeListener(DataSourceChangeListener dataSourceChangeListener) {
        this.dataSourceChangeListener = dataSourceChangeListener;
    }


}