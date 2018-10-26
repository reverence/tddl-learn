package com.taobao.tddl.common.sqlobjecttree;

import java.util.List;

public interface SQLFragment extends Cloneable{

	public void appendSQL(StringBuilder sb);
	/**
	 * 将一个sql中不变的StringToken缓存到第二个参数那个list中，token之间有可能会有一些可变的
	 * 东西，比如limit m,n中的m,n.还有表名等
	 * @param oraTabName
	 * @param list
	 * @param sb
	 * @return
	 */
	public StringBuilder regTableModifiable(String oraTabName,List<Object> list,StringBuilder sb);
}
