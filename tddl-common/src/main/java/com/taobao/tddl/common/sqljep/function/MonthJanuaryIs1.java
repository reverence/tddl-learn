package com.taobao.tddl.common.sqljep.function;

import static java.util.Calendar.MONTH;

import java.sql.Timestamp;
import java.util.Calendar;

import com.taobao.tddl.common.sqljep.ASTFunNode;
import com.taobao.tddl.common.sqljep.JepRuntime;
import com.taobao.tddl.common.sqljep.ParseException;

/*
 * @author guangxia
 * @since 1.0, 2009-10-27 上午11:52:04
 */
public class MonthJanuaryIs1 extends PostfixCommand {
	final public int getNumberOfParameters() {
		return 1;
	}

	public Comparable<?>[] evaluate(ASTFunNode node, JepRuntime runtime) throws ParseException {
		node.childrenAccept(runtime.ev, null);
		Comparable<?>  param = runtime.stack.pop();
		return new Comparable<?>[]{param};
	}

	public static Integer month(Comparable<?>  param, Calendar cal) throws ParseException {
		if (param == null) {
			return null;
		}
		if (param instanceof Timestamp || param instanceof java.sql.Date) {
			java.util.Date ts = (java.util.Date)param;
			cal.setTimeInMillis(ts.getTime());
			return new Integer(cal.get(MONTH) + 1);
		}
		throw new ParseException(WRONG_TYPE+" month("+param.getClass()+")");
	}

	public Comparable<?> getResult(Comparable<?>... comparables)
			throws ParseException {
		return month(comparables[0],JepRuntime.getCalendar());
	}
}
