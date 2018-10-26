/*****************************************************************************
 SQLJEP - Java SQL Expression Parser 0.2
 November 1 2006
 (c) Copyright 2006, Alexey Gaidukov
 SQLJEP Author: Alexey Gaidukov

 SQLJEP is based on JEP 2.24 (http://www.singularsys.com/jep/)
 (c) Copyright 2002, Nathan Funk

 See LICENSE.txt for license information.
 *****************************************************************************/

package com.taobao.tddl.common.sqljep.function;


import java.math.BigInteger;

import com.taobao.tddl.common.sequence.Config;
import com.taobao.tddl.common.sequence.IDParse;
import com.taobao.tddl.common.sequence.IDParseFactory;
import com.taobao.tddl.common.sqljep.ASTFunNode;
import com.taobao.tddl.common.sqljep.JepRuntime;
import com.taobao.tddl.common.sqljep.ParseException;
import com.taobao.tddl.common.util.NestThreadLocalMap;
import com.taobao.tddl.common.util.StaticString;

public abstract class TBIDGeneratorCommon extends PostfixCommand {
	private IDParseFactory factory=IDParseFactory.newInstance();
//	private static final IDParse<Long, Integer, Integer> idParse = new IDParseImp();

	final public int getNumberOfParameters() {
		return 1;
	}

	public Comparable<?>[] evaluate(ASTFunNode node, JepRuntime runtime) throws ParseException {
		node.childrenAccept(runtime.ev, null);
		Comparable<?>  param = runtime.stack.pop();
		return new Comparable<?>[]{param};
	}

	public abstract String getExceptionText(Comparable<?>  param);

	public Comparable<?> getResult(Comparable<?>... comparables)
			throws ParseException {
		if (comparables[0] == null) {
			return null;
		}
		Config config=(Config)NestThreadLocalMap.get(StaticString.CONFIG);
		Long lo=null;
		BigInteger bigInteger = null;
		if(comparables[0] instanceof Long){
			lo=((Long)comparables[0]).longValue();
		}else if(comparables[0] instanceof Integer){
			lo=((Integer)comparables[0]).longValue();
		} else if(comparables[0] instanceof BigInteger) {
			bigInteger = (BigInteger)comparables[0];
		}else{
			throw new ParseException(getExceptionText(comparables[0]));
		}
		if(config==null){
			throw new ParseException("id生成器配置为null,却调用了需要使用id生成器配置的接口。这可能是因为没有指定" +
					"id配置文件造成的");
		}
		Integer intg;
		if (lo != null) {
			IDParse<Long, Integer, Integer> idParse = (IDParse<Long, Integer, Integer>) factory
					.createIDParse(config);
			com.taobao.tddl.common.sequence.IDParse.DetachID<Long, Integer, Integer> detachId = idParse
					.parse(lo);
			intg = detachId.getDatabaseArg();
		} else {
			IDParse<BigInteger, Integer, Integer> idParse = (IDParse<BigInteger, Integer, Integer>) factory
					.createIDParse(config);
			com.taobao.tddl.common.sequence.IDParse.DetachID<BigInteger, Integer, Integer> detachId = idParse
					.parse(bigInteger);
			intg = detachId.getDatabaseArg();
		}
		if(intg==null)
		{
			throw new ParseException("不能从id中分析出分库字段");
		}
		return intg;
	}
}
