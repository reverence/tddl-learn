package com.taobao.tddl.sqlobjecttree.mysql.function;


import java.util.HashMap;
import java.util.Map;

import com.taobao.tddl.sqlobjecttree.Function;
import com.taobao.tddl.sqlobjecttree.mysql.function.datefunction.Current_date;
import com.taobao.tddl.sqlobjecttree.mysql.function.datefunction.Sysdate;


public class MySQLConsistStringRegister {
	public final static MySQLConsistStringRegister reg=new MySQLConsistStringRegister();
	private  final static Map<String, Class<? extends Function>> consistReg=new HashMap<String, Class<? extends Function>>();
	static{
		consistReg.put("SYSDATE", Sysdate.class);
		consistReg.put("CURRENT_DATE", Current_date.class);
	}
	public boolean containsKey(String key){
		return  consistReg.containsKey(key);
	}
	public Function get(String key){
		Function cls=null;
		try {
			if(key==null||key.trim().equals("")){
				throw new IllegalArgumentException("group function不能为空");
			}
			cls=consistReg.get(key.toUpperCase()).newInstance();
		} catch (InstantiationException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
		return cls;
	}

}
