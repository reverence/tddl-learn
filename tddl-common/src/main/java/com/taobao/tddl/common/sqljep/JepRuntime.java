/*****************************************************************************
      SQLJEP - Java SQL Expression Parser 0.2
      November 1 2006
         (c) Copyright 2006, Alexey Gaidukov
      SQLJEP Author: Alexey Gaidukov

      SQLJEP is based on JEP 2.24 (http://www.singularsys.com/jep/)
           (c) Copyright 2002, Nathan Funk
 
      See LICENSE.txt for license information.
*****************************************************************************/

package com.taobao.tddl.common.sqljep;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Stack;

import com.taobao.tddl.common.util.NestThreadLocalMap;
import com.taobao.tddl.common.util.StaticString;


final public class JepRuntime {
	
	@SuppressWarnings("unchecked")
	public Stack<Comparable> stack = new Stack<Comparable>();
	
	public Calendar calendar = JepRuntime.getCalendar();
	public DateFormatSymbols dateSymbols = JepRuntime.getDateFormatSymbols();
	public ParserVisitor ev;
	public Comparable<?>[] row;
	public JepRuntime(ParserVisitor visitor) {
		ev = visitor;
	}
	public static Calendar getCalendar(){
		Calendar calendar = (Calendar)NestThreadLocalMap.get(StaticString.CALENDAR);
		if (calendar == null) {
			calendar = Calendar.getInstance();
			NestThreadLocalMap.put(StaticString.CALENDAR,calendar);
		}
		return calendar;
	}
	
	public static DateFormatSymbols getDateFormatSymbols(){
		DateFormatSymbols dateSymbols = (DateFormatSymbols)NestThreadLocalMap.get(StaticString.DATE_FORMAT_SYMBOLS);
		if (dateSymbols == null) {
			dateSymbols = new DateFormatSymbols();
			NestThreadLocalMap.put(StaticString.DATE_FORMAT_SYMBOLS,dateSymbols);
		}
		return dateSymbols;
	}
}
