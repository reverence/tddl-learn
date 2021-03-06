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

public final class ComparativeLE extends PostfixCommand {
	final public int getNumberOfParameters() {
		return 2;
	}

	public boolean isAutoBox() {
		return false;
	}

	public Comparable<?>[] evaluate(ASTFunNode node, JepRuntime runtime)
			throws ParseException {
		node.childrenAccept(runtime.ev, null);

		Comparable<?> param2 = runtime.stack.pop();
		Comparable<?> param1 = runtime.stack.pop();
		return new Comparable<?>[] { param1, param2 };

	}

	public Comparable<?> getResult(Comparable<?>... comparables)
			throws ParseException {
		Comparable<?> param2 = comparables[1];
		Comparable<?> param1 = comparables[0];
		if (param1 == null || param2 == null) {
			return (Boolean.FALSE);
		} else {
			if (param1 instanceof Comparative) {
				Comparative other = (Comparative) param1;
				boolean result = other.intersect(Comparative.LessThanOrEqual,
						param2, ComparativeComparator.comparator);
				return (result);
			} else {
				return (ComparativeComparator.compareTo(param1, param2) <= 0);
			}
		}
	}
}
