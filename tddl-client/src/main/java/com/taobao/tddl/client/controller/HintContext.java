package com.taobao.tddl.client.controller;

import com.taobao.tddl.parser.hint.HintTargetDB;

import java.util.List;

public class HintContext {
	List<HintTargetDB> directlyTargetingDBList;

	public List<HintTargetDB> getDirectlyTargetingDBList() {
		return directlyTargetingDBList;
	}

	public void setDirectlyTargetingDBList(
			List<HintTargetDB> directlyTargetingDBList) {
		this.directlyTargetingDBList = directlyTargetingDBList;
	}
	
}
