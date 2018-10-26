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

public class Right extends PostfixCommand {
	private static final String PARAM_EXCEPTION = "BeginIndex and CountChars in substr shoud be integers";
	
	final public int getNumberOfParameters() {
		return -1;
	}
	
	public Comparable<?>[] evaluate(ASTFunNode node, JepRuntime runtime) throws ParseException {
		node.childrenAccept(runtime.ev, null);
		int num = node.jjtGetNumChildren();
		if (num == 2) {
			Comparable<?>  param2 = runtime.stack.pop();
			Comparable<?>  param1 = runtime.stack.pop();
			return new Comparable<?>[]{param1,param2};
		}else {
			// remove all parameters from stack and push null
			removeParams(runtime.stack, num);
			throw new ParseException(PARAMS_NUMBER+" for right");
		}
	}

	public static String right(Comparable<?>  param1, Comparable<?>  param2) throws ParseException {
		if (param1 == null) {
			return null;
		}
		try {
			int right = getInteger(param2);
			String paramStr=param1.toString();
			int length = paramStr.length();
			return paramStr.substring(length-right);
		}  catch (StringIndexOutOfBoundsException e) {
			throw new ParseException("param1:"+param1+"param2:"+param2+","+e.getMessage());
		}
	}


	public Comparable<?> getResult(Comparable<?>... comparables)
			throws ParseException {
			return right(comparables[0],comparables[1]);
	}
}

