package com.taobao.tddl.rule.ruleengine.enumerator;


import com.taobao.tddl.common.sqljep.function.Comparative;

public class EnumerationInterruptException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private transient  Comparative comparative;
	public EnumerationInterruptException(Comparative comparative){
		this.comparative = comparative;
	}
	public EnumerationInterruptException(){
	}
	public Comparative getComparative() {
		return comparative;
	}
	public void setComparative(Comparative comparative) {
		this.comparative = comparative;
	}
	
}
