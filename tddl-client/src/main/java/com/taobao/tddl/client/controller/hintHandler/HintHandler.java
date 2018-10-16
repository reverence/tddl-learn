package com.taobao.tddl.client.controller.hintHandler;

import com.taobao.tddl.client.controller.HintContext;

public interface HintHandler {
	public void process(HintContext context,Object value);
}
