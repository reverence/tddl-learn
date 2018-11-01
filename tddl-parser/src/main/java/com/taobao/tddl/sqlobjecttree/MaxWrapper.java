package com.taobao.tddl.sqlobjecttree;

import java.util.List;
import java.util.Map;


public class MaxWrapper extends PageWrapperCommon{

	public MaxWrapper(Object obj) {
		super(obj);
	}
	protected String getSqlReturn(Number limitFrom, Number limitTo) {
		return limitTo.toString();
	}

	protected void modifyParam(Number limitFrom, Number limitTo,List<Object> param,Map<Integer,Object> modifiedMap) {
		Object obj=null;
		if(limitTo instanceof Long){
			obj=(Long)limitTo;
		}else if(limitTo instanceof Integer){
			obj=(Integer)limitTo;
		}else{
			throw new IllegalArgumentException("只支持int long的情况");
		}
		modifiedMap.put(index,obj);
	}
}
