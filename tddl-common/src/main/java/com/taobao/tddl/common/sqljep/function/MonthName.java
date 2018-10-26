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

import static java.util.Calendar.MONTH;

import java.sql.Timestamp;
import java.text.DateFormatSymbols;
import java.util.Calendar;

import com.taobao.tddl.common.sqljep.ASTFunNode;
import com.taobao.tddl.common.sqljep.JepRuntime;
import com.taobao.tddl.common.sqljep.ParseException;

public class MonthName extends PostfixCommand {
	final public int getNumberOfParameters() {
		return 1;
	}
	
	public Comparable<?>[] evaluate(ASTFunNode node, JepRuntime runtime) throws ParseException {
		node.childrenAccept(runtime.ev, null);
		Comparable<?>  param = runtime.stack.pop();
		return new Comparable<?>[]{param};
	}

	public static String monthName(Comparable<?>  param, Calendar cal, DateFormatSymbols symb) throws ParseException {
		if (param == null) {
			return null;
		}
		if (param instanceof Timestamp || param instanceof java.sql.Date) {
			java.util.Date ts = (java.util.Date)param;
			cal.setTimeInMillis(ts.getTime());
			int month = cal.get(MONTH);
			String[] months = symb.getMonths();
			return months[month];
		}
		throw new ParseException(WRONG_TYPE+" month("+param.getClass()+")");
	}

	public Comparable<?> getResult(Comparable<?>... comparables)
			throws ParseException {
		return monthName(comparables[0], JepRuntime.getCalendar(), JepRuntime.getDateFormatSymbols());
	}
}

