package com.taobao.tddl.client.controller;

import com.taobao.tddl.client.controller.hintHandler.DirectlyTargetingHandler;
import com.taobao.tddl.client.controller.hintHandler.HintHandler;
import com.taobao.tddl.parser.AntlrStringStream;
import com.taobao.tddl.parser.hint.HintParserLexer;
import com.taobao.tddl.parser.hint.HintParserParser;
import com.taobao.tddl.parser.hint.HintWalker;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HintController {
	private static final String TDDL_INDEX_TEMP_PLACER="TDDL_INDEX_TEMP_PLACER";
	private static Map<String,HintHandler> map=new HashMap<String, HintHandler>();
	{
		map.put("DB",new DirectlyTargetingHandler());
	}

	public HintContext process(Map<Object,Object> hintElementMap){
		HintContext context=new HintContext();
		for(Map.Entry<Object, Object> entry:hintElementMap.entrySet()){
			Object key=entry.getKey();
			if(key instanceof String){
				HintHandler handler=map.get(((String) key).toUpperCase());
				handler.process(context, entry.getValue());
			}else{
				throw new IllegalArgumentException("key不为String:"+key);
			}
		}
		return context;
	}
	public HintContext process(String comment,List<Object> arguments){
		Map<Object,Object> hintElementMap=null;
		try {
			hintElementMap=getParsedHintKeyValueMap(comment, arguments);
		} catch (RecognitionException e) {
			throw new RuntimeException("解析注释出错，错误的注释:"+comment,e);
		}
		return process(hintElementMap);
	}

	@SuppressWarnings("unchecked")
	public Map<Object,Object> getParsedHintKeyValueMap(String comment,List<Object> arguments) throws RecognitionException{
		AntlrStringStream st = new AntlrStringStream(
				comment);
		HintWalker.beg_return ret = null;
		HintParserLexer pl = new HintParserLexer(
				st);
		TokenRewriteStream tokens = new TokenRewriteStream(
				pl);
		HintParserParser pa = new HintParserParser(
				tokens);

		HintParserParser.hints_return beg = null;
		beg = pa.hints();
		CommonTree tree = (CommonTree) beg
				.getTree();
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(
				tree);
		nodes.setTokenStream(tokens);
		HintWalker walker = new HintWalker(nodes);
		ret = walker.beg();
		//TODO:处理绑定变量
		ret.map.put(TDDL_INDEX_TEMP_PLACER, walker.index);
		return ret.map;
	}
}
