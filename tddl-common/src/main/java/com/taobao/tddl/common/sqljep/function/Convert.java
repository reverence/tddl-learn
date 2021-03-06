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


import com.taobao.tddl.common.sqljep.ASTFunNode;
import com.taobao.tddl.common.sqljep.JepRuntime;
import com.taobao.tddl.common.sqljep.ParseException;

public class Convert extends PostfixCommand {
	private static final String PARAM_EXCEPTION = "BeginIndex and CountChars in substr shoud be integers";

	final public int getNumberOfParameters() {
		return -1;
	}

	public Comparable<?>[] evaluate(ASTFunNode node, JepRuntime runtime) throws ParseException {
		node.childrenAccept(runtime.ev, null);
		int num = node.jjtGetNumChildren();
		if (num == 3) {
			Comparable<?>  param3 = runtime.stack.pop();
			Comparable<?>  param2 = runtime.stack.pop();
			Comparable<?>  param1 = runtime.stack.pop();
			return new Comparable<?>[]{param1,param2,param3};
		} else {
			// remove all parameters from stack and push null
			removeParams(runtime.stack, num);
			throw new ParseException(PARAMS_NUMBER+" for conv");
		}
	}


	public static Comparable<?> substr(Comparable<?>  param1, Comparable<?>  param2, Comparable<?>  param3) throws ParseException {
		if (param1 == null) {
			return null;
		}
		try {
			int fromBase = getInteger(param2);
			int toBase = getInteger(param3);
			String source = param1.toString();
			if(fromBase<2||fromBase>36)
				throw new ParseException("The minimum base is 2 and the maximum base is 36. ");
			Integer convertedInt = Integer.valueOf(source, fromBase);
			switch (toBase) {
				case 10:
					return convertedInt;
				default:
					throw new ParseException("只支持输出10进制数据。");
			}
		} catch (ParseException e) {
			throw new ParseException(PARAM_EXCEPTION);
		} catch (StringIndexOutOfBoundsException e) {
			return null;
		}
	}

	public Comparable<?> getResult(Comparable<?>... comparables)
			throws ParseException {
		return substr(comparables[0],comparables[1],comparables[2]);
	}
}

