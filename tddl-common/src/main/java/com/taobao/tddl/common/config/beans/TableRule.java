package com.taobao.tddl.common.config.beans;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.taobao.tddl.common.util.SimpleNamedMessageFormat;
import com.taobao.tddl.common.util.TableSuffixTypeEnum;

/**
 * 一个逻辑表怎样分库分表
 *
 * @author linxuan
 *
 */
public class TableRule implements Cloneable {
	private String[] dbIndexes;
	private String dbIndexPrefix;
	private int dbIndexCount;
	private List<Object>  shardingRules;
	private String        tbSuffixPadding;
	private Object[]      dbRules;                                   //string expression or mappingrule
	private Object[] tbRules; //string expression or mappingrule
	private String[] uniqueKeys;

	private boolean allowReverseOutput;
	private boolean needRowCopy;
	private boolean disableFullTableScan=true; //是否关闭全表扫描

	/**
	 * 用来替换dbRules、tbRules中的占位符
	 * 优先用dbRuleParames，tbRuleParames替换，其为空时再用ruleParames替换
	 */
	private String[] ruleParames;
	private String[] dbRuleParames;
	private String[] tbRuleParames;
	/**
	 * 描述表后缀配置。格式：
	 * throughAllDB:[_0000-_0063] #如果3特殊的：throughAllDB:[_0000-_0063],3:[_00-_63]
	 * resetForEachDB:[_0-_4]
	 * twoColumnForEachDB: [_00-_99],[_00-_11]
	 * dbIndexForEachDB:[_00-_09]
	 */
	private SuffixManager suffixManager = new SuffixManager();
	/**
	 * 表名前辍
	 */
	private Preffix tbPreffix;

	public static class ParseException extends Exception {
		private static final long serialVersionUID = 1L;

		public ParseException() {
			super();
		}

		public ParseException(String msg) {
			super(msg);
		}
	}

	public void parseTbSuffix() throws ParseException {
		suffixManager.parseTbSuffix(dbIndexes);
	}

	/**
	 * 1.解析tbSuffix 2.替换rule表达式中的占位符
	 * @throws ParseException
	 */
	public void init() throws ParseException {

		if (dbIndexes == null) {
			if (dbIndexPrefix == null || dbIndexCount <= 0) {
				throw new IllegalArgumentException("dbIndexes没有配置");
			}
			//按dbIndexPrefix和dbIndexCount生成dbIndexes
			int suffixLen = Integer.valueOf(dbIndexCount).toString().length();
			dbIndexes = new String[dbIndexCount];
			for (int i = 0; i < dbIndexCount; i++) {
				String suffix = String.valueOf(i);
				while (suffix.length() < suffixLen) {
					suffix = "0" + suffix;
				}
				dbIndexes[i] = dbIndexPrefix + suffix;
			}
		}
		//设定db的个数
		setDbIndexCount(dbIndexes.length);
		replaceWithParam(this.dbRules, dbRuleParames != null ? dbRuleParames : ruleParames);
		replaceWithParam(this.tbRules, tbRuleParames != null ? tbRuleParames : ruleParames);
		String tbSuffix = suffixManager.getTbSuffix();
		if (tbSuffix != null ) {
			if(!tbSuffix.startsWith(TableSuffixTypeEnum.groovyTableList.getValue())){
				tbSuffix = replaceWithParam(tbSuffix, ruleParames);
			}
			suffixManager.setTbSuffix(tbSuffix);
			suffixManager.parseTbSuffix(dbIndexes);
		} else {
			suffixManager.init(dbIndexes);
		}
	}

	private static void replaceWithParam(Object[] rules, String[] params) {
		if (params == null || rules == null) {
			return;
		}
		for (int i = 0; i < rules.length; i++) {
			if (rules[i] instanceof String) {
				//rules[i] = new MessageFormat((String) rules[i]).format(params);
				rules[i] = replaceWithParam((String) rules[i], params);
			} else if (rules[i] instanceof MappingRuleBean) {
				MappingRuleBean tmr = (MappingRuleBean) rules[i];
				//String finalParameter = new MessageFormat((String) tmr.getParameter()).format(params);
				//String finalExpression = new MessageFormat((String) tmr.getExpression()).format(params);
				String finalParameter = replaceWithParam(tmr.getParameter(), params);
				String finalExpression = replaceWithParam(tmr.getExpression(), params);
				tmr.setParameter(finalParameter);
				tmr.setExpression(finalExpression);
			}
		}
	}

	private static String replaceWithParam(String template, String[] params) {
		if (params == null || template == null) {
			return template;
		}
		if (params.length != 0 && params[0].indexOf(":") != -1) {
			//只要params的第一个参数中含有冒号，就认为是NamedParam
			return replaceWithNamedParam(template, params);
		}
		return new MessageFormat(template).format(params);
	}

	private static String replaceWithNamedParam(String template, String[] params) {
		Map<String, String> args = new HashMap<String, String>();
		for (String param : params) {
			int index = param.indexOf(":");
			if (index == -1) {
				throw new IllegalArgumentException("使用名字化的占位符替换失败！请检查配置。 params:"
						+ Arrays.asList(params));
			}
			args.put(param.substring(0, index).trim(), param.substring(index + 1).trim());
		}
		return new SimpleNamedMessageFormat(template).format(args);
	}

	private String toCommaString(String[] strArray) {
		if (strArray == null)
			return null;
		StringBuilder sb = new StringBuilder();
		for (String str : strArray) {
			sb.append(",").append(str);
		}
		if (strArray.length > 0) {
			sb.deleteCharAt(0);
		}
		return sb.toString();
	}

	/**
	 * 有逻辑的getter/setter
	 */
	public void setDbIndexes(String dbIndexes) {
		this.dbIndexes = dbIndexes.split(",");
		for (int i = 0; i < this.dbIndexes.length; i++) {
			this.dbIndexes[i] = this.dbIndexes[i].trim();
		}
	}

	public String getDbIndexes() {
		return toCommaString(this.dbIndexes);
	}

	public void setDbIndexArray(String[] array) {
		this.dbIndexes = array;
	}

	public String[] getDbIndexArray() {
		return dbIndexes;
	}

	public String[] getUniqueKeyArray() {
		return uniqueKeys;
	}

	public void setUniqueKeys(String uniquekeys) {
		this.uniqueKeys = uniquekeys.split(",");
	}

	public Object[] getDbRuleArray() {
		return dbRules;
	}

	public void setDbRuleArray(Object[] dbRules) {
		this.dbRules = dbRules;
	}

	public void setDbRules(String dbRules) {
		if (this.dbRules == null) {
			//优先级比dbRuleArray低
			this.dbRules = dbRules.split("\\|");
		}
	}

	public Object[] getTbRuleArray() {
		return tbRules;
	}

	public void setTbRuleArray(Object[] tbRules) {
		this.tbRules = tbRules;
	}

	public void setTbRules(String tbRules) {
		if (this.tbRules == null) {
			//优先级比tbRuleArray低
			this.tbRules = tbRules.split("\\|");
		}
	}

	public void setRuleParames(String ruleParames) {
		if (ruleParames.indexOf('|') != -1) {
			//优先用|线分隔,因为有些规则表达式中会有逗号
			this.ruleParames = ruleParames.split("\\|");
		} else {
			this.ruleParames = ruleParames.split(",");
		}
	}

	public void setRuleParameArray(String[] ruleParames) {
		this.ruleParames = ruleParames;
	}

	public void setDbRuleParames(String dbRuleParames) {
		this.dbRuleParames = dbRuleParames.split(",");
	}

	public void setDbRuleParameArray(String[] dbRuleParames) {
		this.dbRuleParames = dbRuleParames;
	}

	public void setTbRuleParames(String tbRuleParames) {
		this.tbRuleParames = tbRuleParames.split(",");
	}

	public void setTbRuleParameArray(String[] tbRuleParames) {
		this.tbRuleParames = tbRuleParames;
	}

	/**
	 * 无逻辑的getter/setter
	 */

	public void setTbSuffix(String tbSuffix) {
		this.suffixManager.setTbSuffix(tbSuffix);
	}

	public boolean isAllowReverseOutput() {
		return allowReverseOutput;
	}

	public void setAllowReverseOutput(boolean allowReverseOutput) {
		this.allowReverseOutput = allowReverseOutput;
	}

	public boolean isNeedRowCopy() {
		return needRowCopy;
	}

	public void setNeedRowCopy(boolean needRowCopy) {
		this.needRowCopy = needRowCopy;
	}

	public String getDbIndexPrefix() {
		return dbIndexPrefix;
	}

	public void setDbIndexPrefix(String dbIndexPrefix) {
		this.dbIndexPrefix = dbIndexPrefix;
	}

	public int getDbIndexCount() {
		return dbIndexCount;
	}

	public void setDbIndexCount(int dbIndexCount) {
		this.dbIndexCount = dbIndexCount;
	}

	public void setTbSuffixFrom(int tbSuffixFrom) {
		this.suffixManager.getSuffix(0).setTbSuffixFrom(tbSuffixFrom);
	}
	public void setTbSuffixTo(int tbSuffixTo) {
		this.suffixManager.getSuffix(0).setTbSuffixTo(tbSuffixTo);
	}
	public void setTbSuffixWidth(int tbSuffixWidth) {
		this.suffixManager.getSuffix(0).setTbSuffixWidth(tbSuffixWidth);
	}
	public void setTbSuffixPadding(String tbSuffixPadding) {
		this.suffixManager.getSuffix(0).setTbSuffixPadding(tbSuffixPadding);
	}
	public String getTbSuffixPadding() {
		return tbSuffixPadding;
	}

	public void setTbNumForEachDb(int tbNumForEachDb) {
		this.suffixManager.getSuffix(0).setTbNumForEachDb(tbNumForEachDb);
	}
	@Override
	public TableRule clone() throws CloneNotSupportedException {
		return (TableRule) super.clone();
	}


	public boolean isDisableFullTableScan() {
		return disableFullTableScan;
	}

	public void setDisableFullTableScan(boolean disableFullTableScan) {
		this.disableFullTableScan = disableFullTableScan;
	}

	public SuffixManager getSuffixManager() {
		return suffixManager;
	}

	public Preffix getTbPreffix() {
		return tbPreffix;
	}

	public void setTbPreffix(Preffix tbPreffix) {
		this.tbPreffix = tbPreffix;
	}

	public void setShardingRules(List<Object> shardingRules) {
		this.shardingRules = shardingRules;
	}

	public List<Object> getShardingRules() {
		return shardingRules;
	}




	/* //暴露得有问题
	public void setSuffixManager(SuffixManager suffixManager) {
		this.suffixManager = suffixManager;
	}
	*/

}
