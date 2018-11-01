package com.taobao.tddl.sqlobjecttree.outputhandlerimpl;

import com.taobao.tddl.sqlobjecttree.ReplacableWrapper;



public class ChangePageNumber extends ChangeMethodCommon{

	protected boolean allowChangePageNumber() {
		return true;
	}

	protected String getReplacedString(String targetTableName,
			ReplacableWrapper replacedObj) {
		return replacedObj.getReplacedStr();
	}
}
