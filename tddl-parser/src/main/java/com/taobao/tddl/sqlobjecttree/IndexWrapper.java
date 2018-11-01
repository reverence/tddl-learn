package com.taobao.tddl.sqlobjecttree;

public class IndexWrapper implements ReplacableWrapper{
	String index;
	String originalTableName;
	
	public String getOriginalTableName() {
		return originalTableName;
	}
	public void setOriginalTableName(String originalTableName) {
		this.originalTableName = originalTableName;
	}
	public String getReplacedStr() {
		return index;
	}
	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}
	public TYPE getType() {
		return TYPE.INDEX;
	}
	
}
