package com.taobao.tddl.sqlobjecttree.mysql.function.datefunction;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.taobao.tddl.sqlobjecttree.Function;

public class MySQLDateStringWrapperFunction implements Function{
	String date="";
	DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public String getNestedColName() {
		return date;
	}

	public MySQLDateStringWrapperFunction(String date) {
		this.date=date;
	}

	public void setValue(List<Object> values) {
		throw new IllegalStateException("should not be here");
	}

	public Comparable<?> eval() {
		return this;
	}

	public Comparable<?> getVal(List<Object> args) {
		Date d=null;
		try {
			d=df.parse(date);
		} catch (ParseException e) {
			throw new IllegalArgumentException("tddl不能正确的识别mysql日期,当前系统记录的日期是"+date);
		}
		return d;
	}

	public void appendSQL(StringBuilder sb) {
		sb.append("'").append(date).append("'");
	}

	public StringBuilder regTableModifiable(String oraTabName,
											List<Object> list, StringBuilder sb) {
		sb.append("'").append(date).append("'");
		return sb;
	}

	public int compareTo(Object arg0) {
		throw new IllegalStateException("should not be here");
	}

}
