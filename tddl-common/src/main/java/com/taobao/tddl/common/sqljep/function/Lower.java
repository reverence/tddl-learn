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

public class Lower extends PostfixCommand {
	final public int getNumberOfParameters() {
		return 1;
	}
	
	public Comparable<?>[] evaluate(ASTFunNode node, JepRuntime runtime) throws ParseException {
		node.childrenAccept(runtime.ev, null);
		Comparable<?>  param = runtime.stack.pop();
		return new Comparable<?>[]{param};
	}

	public static String lower(Comparable<?>  param) throws ParseException {
		if (param == null) {
			return null;
		}
		return param.toString().toLowerCase();
	}

	public Comparable<?> getResult(Comparable<?>... comparables)
			throws ParseException {
		return lower(comparables[0]);
	}
}

