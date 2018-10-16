package com.taobao.tddl.client.controller.hintHandler;

import com.taobao.tddl.client.controller.HintContext;
import com.taobao.tddl.parser.hint.HintElement;
import com.taobao.tddl.parser.hint.HintTargetDB;

import java.util.LinkedList;
import java.util.List;

public class DirectlyTargetingHandler implements HintHandler {

	@SuppressWarnings("unchecked")
	public void process(HintContext context, Object value) {
		List<HintTargetDB> r=new LinkedList<HintTargetDB>();

		if(value==null){
			throw new IllegalArgumentException("直接定位数据库的规则中，value不允许为空");
		}
		if(value instanceof List){
			for(Object obj:(List)value){
				processOneHintElement(context, (HintElement)obj, r);
			}
		}else if(value instanceof HintElement){
			processOneHintElement(context, (HintElement)value, r);
		}else{
			throw new IllegalStateException("should not be here");
		}
		context.setDirectlyTargetingDBList(r);
	}

	public void processOneHintElement(HintContext context,HintElement hintElement,List<HintTargetDB> hintTargetDBs){
		Object obj=hintElement.key;
		if(!(obj instanceof String)){
			throw new IllegalArgumentException("每一个数据库的id不能为空，或为非String字串");
		}
		HintTargetDB db=new HintTargetDB((String)obj);
		processTableElement((String)obj, hintElement.value, db);
		hintTargetDBs.add(db);
	}
	@SuppressWarnings("unchecked")
	public void processTableElement(String key,Object hintElementValue,HintTargetDB db){
		if(hintElementValue == null){
			return ;
		}
		if(hintElementValue instanceof List){
			for(Object obj:(List)hintElementValue){
				if(obj!=null&&obj instanceof String){
					db.add((String)obj);
				}else{
					throw new IllegalArgumentException(obj+"不为String");
				}
			}
		}else{
			throw new IllegalArgumentException(key+"的value不为List");
		}
	}
}
