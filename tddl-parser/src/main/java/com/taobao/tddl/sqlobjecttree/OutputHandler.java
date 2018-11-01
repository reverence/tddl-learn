package com.taobao.tddl.sqlobjecttree;

import java.util.List;
import java.util.Map;

public interface OutputHandler {
	public String handle(String table,List<Object> param,List<Object> modifiableTableName,String originalTable,Number skip,Number max,Map<Integer, Object> changeParam);
}
