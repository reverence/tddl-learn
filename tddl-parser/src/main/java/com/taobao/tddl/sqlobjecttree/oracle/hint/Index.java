package com.taobao.tddl.sqlobjecttree.oracle.hint;

import java.util.Collections;
import java.util.List;

import com.taobao.tddl.sqlobjecttree.HintSetter;
import com.taobao.tddl.sqlobjecttree.IndexWrapper;

public class Index implements HintSetter {
	List<String> args=Collections.emptyList();
	public List<String> getArguments() {
		return args;
	}

	public void appendSQL(StringBuilder sb) {
		sb.append("INDEX").append("(");
		boolean firstElement=true;
		for(String str:args){
			if(firstElement){
				firstElement=false;
			}else{
				sb.append(",");
			}
			sb.append(str);
		}
		sb.append(")");
	}

	public StringBuilder regTableModifiable(String oraTabName,
											List<Object> list, StringBuilder sb) {
		//这里实现比较诡异，因为regTableModifiable这个方法涉及了太多类需要变动
		//为了这一个index变动去修改整个架构得不偿失。所以暂时采用一种临时的方式来处理这个问题
		//直接在ChangeMethodCommon中添加了需要替换的index方法。
		/*
		 * 修改支持一个参数的形式，\/*+index(a)*\/
		 * 修改简单去除原先只能有两种参数的限制（原先的形式\/*+index(a,abc)*\/)
		 */

		sb.append("INDEX").append("(");
//		boolean firstElement=true;
		if(args.size()>2){
			throw new IllegalArgumentException("index hint暂时只支持一个或两个参数");
		}
//		for(String str:args){
//			if(firstElement){
//				firstElement=false;
//			}else{
//				sb.append(",");
//			}
//			sb.append(str);
//		}
		sb.append(args.get(0));
		sb.append(",");
		list.add(sb.toString());
		if(args.size()==2){
			IndexWrapper wa=new IndexWrapper();
			wa.setIndex(args.get(1));
			wa.setOriginalTableName(oraTabName);
			list.add(wa);
		}
		sb=new StringBuilder();
		sb.append(")");
		return sb;
	}

	public void addHint(List<String> args) {
		this.args=args;
	}

}
