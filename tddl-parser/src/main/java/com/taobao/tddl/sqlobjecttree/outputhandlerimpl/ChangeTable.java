package com.taobao.tddl.sqlobjecttree.outputhandlerimpl;

import com.taobao.tddl.sqlobjecttree.ReplacableWrapper;

public class ChangeTable extends ChangeMethodCommon{

	protected boolean allowChangePageNumber() {
		return false;
	}

	protected String getReplacedString(String targetTableName,
			ReplacableWrapper replacedObj) {
		return getReplacedString_changeTable(targetTableName, replacedObj);
	}



}
