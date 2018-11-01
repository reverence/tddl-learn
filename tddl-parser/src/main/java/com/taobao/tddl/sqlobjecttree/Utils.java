package com.taobao.tddl.sqlobjecttree;

import java.util.List;

import com.taobao.tddl.common.sqlobjecttree.SQLFragment;
import com.taobao.tddl.common.sqlobjecttree.Value;
import com.taobao.tddl.sqlobjecttree.common.value.UnknowValueObject;
import com.taobao.tddl.sqlobjecttree.common.value.function.MultiStrConcat;



public class Utils {
	private final static Object[] ARRAYOBJ = new Object[] {};


	public static void appendSQL(Object obj, StringBuilder sb) {
		if(obj instanceof Select){
			sb.append("(");
			((SQLFragment) obj).appendSQL(sb);
			sb.append(")");
		}else if (obj instanceof SQLFragment) {
			((SQLFragment) obj).appendSQL(sb);
		} else if(obj instanceof String) {
			sb.append("'").append(obj).append("'");
		} else {
			sb.append(obj);
		}
	}

	public static Comparable<?> getVal(List<Object> args,Object target){
		if(target instanceof Value){
			return ((Value) target).getVal(args);
		}else if(target instanceof Comparable){
			return (Comparable<?>)target;
		}else{
			//Column 这类的。直接返回不可比较对象
			return UnknowValueObject.getUnknowValueObject();
		}
	}
	public static StringBuilder appendSQLWithList(String oraTabName,Object obj, StringBuilder sb,List<Object> list) {
		if(obj instanceof Select){
			sb.append("(");
			sb=((SQLFragment) obj).regTableModifiable(oraTabName, list, sb);
			sb.append(")");
		}else if (obj instanceof SQLFragment) {
			sb=((SQLFragment) obj).regTableModifiable(oraTabName, list, sb);
		} else if(obj instanceof String) {
			sb.append("'").append(obj).append("'");
		} else {
			sb.append(obj);
		}
		return sb;
	}

	/**
	 * 处理内联ListValueObject
	 *
	 * @param obj
	 * @param sb
	 */
	@SuppressWarnings("unchecked")
	public static StringBuilder appendSQLListWithList(String oraTabName,Object obj, StringBuilder sb,List<Object> list) {

		if (obj instanceof List) {
			boolean splider = false;
			sb.append("(");
			for (Object innerObj : (List) obj) {

				if (splider) {
					sb.append(",");
				} else {
					splider = true;
				}
				sb=appendSQLListWithList(oraTabName,innerObj, sb,list);
			}
			sb.append(")");
		} else if (obj != null
				&& ARRAYOBJ.getClass().isAssignableFrom(obj.getClass())) {
			boolean splider = false;
			for (Object innerObj : (Object[]) obj) {
				if (splider) {
					sb.append(",");
				} else {
					splider = true;
				}
				sb=appendSQLWithList(oraTabName,innerObj, sb,list);
			}
		} else if (obj instanceof MultiStrConcat) {
			sb = appendConcatStr(oraTabName,obj, sb,list);
		} else {
			sb=appendSQLWithList(oraTabName,obj, sb,list);
		}
		return sb;
	}
	/**
	 * 处理内联ListValueObject
	 *
	 * @param obj
	 * @param sb
	 */
	@SuppressWarnings("unchecked")
	public static void appendSQLList(Object obj, StringBuilder sb) {

		if (obj instanceof List) {
			boolean splider = false;
			sb.append("(");
			for (Object innerObj : (List) obj) {

				if (splider) {
					sb.append(",");
				} else {
					splider = true;
				}
				appendSQLList(innerObj, sb);
			}
			sb.append(")");
		} else if (obj != null
				&& ARRAYOBJ.getClass().isAssignableFrom(obj.getClass())) {
			boolean splider = false;
			for (Object innerObj : (Object[]) obj) {
				if (splider) {
					sb.append(",");
				} else {
					splider = true;
				}
				appendSQL(innerObj, sb);
			}
		} else {
			appendSQL(obj, sb);
		}
	}

	public static void toString(Object obj, StringBuilder sb) {
		if (obj instanceof SQLFragment) {
			if(Constant.useToString(obj)) {
				sb.append(obj.toString());
			} else {
				((SQLFragment) obj).appendSQL(sb);
			}
		} else if(obj==null){
			throw new RuntimeException("expression中的值不能为null,如果想使用null请使用DBFunctions提供的NULL");
		} else if(obj instanceof String) {
			sb.append("'").append(obj).append("'");
		} else {
			sb.append(obj);
		}
	}

	@SuppressWarnings("unchecked")
	public static void listToString(Object obj, StringBuilder sb) {
		if (obj instanceof List) {
			boolean splider = false;
			for (Object innerObj : (List) obj) {

				if (splider) {
					sb.append(",");
				} else {
					splider = true;
				}
				listToString(innerObj, sb);
			}
		} else if (obj != null
				&& ARRAYOBJ.getClass().isAssignableFrom(obj.getClass())) {
			boolean splider = false;
			for (Object innerObj : (Object[]) obj) {
				if (splider) {
					sb.append(",");
				} else {
					splider = true;
				}
				toString(innerObj, sb);
			}
		} else {
			toString(obj, sb);
		}
	}


	/**
	 * 处理||字符串
	 *
	 * @param obj
	 * @param sb
	 */
	@SuppressWarnings("unchecked")
	public static void appendConcatStr(Object obj, StringBuilder sb) {
		if (obj instanceof List) {
			boolean splider = false;

			for (Object innerObj : (List) obj) {
				if (splider) {
					sb.append("||");
				} else {
					splider = true;
				}
				appendConcatStr(innerObj, sb);
			}
		} else {
			appendSQL(obj, sb);
		}
	}

	/**
	 * 处理||字符串
	 *
	 * @param obj
	 * @param sb
	 */
	@SuppressWarnings("unchecked")
	public static StringBuilder appendConcatStr(String oraTabName, Object obj, StringBuilder sb, List<Object> list) {
		if (obj instanceof List) {
			boolean splider = false;

			for (Object innerObj : (List) obj) {
				if (splider) {
					sb.append("||");
				} else {
					splider = true;
				}
				sb = appendSQLWithList(oraTabName, innerObj, sb, list);
			}
		} else {
			sb = appendSQLWithList(oraTabName, obj, sb, list);
		}

		return sb;
	}
}
