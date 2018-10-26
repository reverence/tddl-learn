/**
 *
 */
package com.taobao.tddl.common.config.beans;

/**
 * 一个前辍
 * @author zuomou
 *
 */
public class Preffix {

	private String tbPreffix = "_";
	private String tbType;

	public Preffix(){}

	public Preffix(String pre){
		tbPreffix = pre;
	}

	public String getTbPreffix() {
		return tbPreffix;
	}
	public void setTbPreffix(String tbPreffix) {
		this.tbPreffix = tbPreffix;
	}
	public String getTbType() {
		return tbType;
	}
	public void setTbType(String tbType) {
		this.tbType = tbType;
	}

}
