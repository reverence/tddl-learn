package com.taobao.tddl.rule.ruleengine.entities.abstractentities;

import java.util.List;

import com.taobao.tddl.rule.ruleengine.entities.convientobjectmaker.TableMapProvider;
import com.taobao.tddl.rule.ruleengine.rule.ListAbstractResultRule;

/**
 * 表名properties的设置器。
 *
 * 如果是在一个一对多的节点，当然也就是logicTable节点，那么使用当前接口的结果是
 *
 * 设置给当前接口的数据会被扩散到子节点。
 *
 * 如果子节点本身也有对应的属性，则子节点属性会替由一对多传递过来的属性。
 *
 * @author shenxun
 *
 */
public interface TablePropertiesSetter {
	public void setTableMapProvider(TableMapProvider tableMapProvider);
	public void setTableRule(List<ListAbstractResultRule> tableRule) ;
	public void setLogicTableName(String logicTable);
	public void setTableRuleChain(RuleChain ruleChain);
}
