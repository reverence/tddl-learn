package com.taobao.tddl.sqlobjecttree.oracle.function;


import java.util.HashMap;
import java.util.Map;

import com.taobao.tddl.sqlobjecttree.Function;
import com.taobao.tddl.sqlobjecttree.common.value.function.Avg;
import com.taobao.tddl.sqlobjecttree.common.value.function.Concat;
import com.taobao.tddl.sqlobjecttree.common.value.function.Count;
import com.taobao.tddl.sqlobjecttree.common.value.function.Max;
import com.taobao.tddl.sqlobjecttree.common.value.function.Min;
import com.taobao.tddl.sqlobjecttree.common.value.function.Modulo;
import com.taobao.tddl.sqlobjecttree.common.value.function.MultiStrConcat;
import com.taobao.tddl.sqlobjecttree.common.value.function.Sum;


public class OracleFunctionRegister {
	public final static OracleFunctionRegister reg=new OracleFunctionRegister();
	private  final static Map<String, Class<? extends Function>> funcReg=new HashMap<String, Class<? extends Function>>();
	static{
		//有一个比较特殊的函数是写死在里面的，就是cast
		//group
		funcReg.put("COUNT", Count.class);
		funcReg.put("MAX", Max.class);
		funcReg.put("MIN", Min.class);
		funcReg.put("AVG", Avg.class);
		funcReg.put("SUM",Sum.class);

		//table
		funcReg.put("TABLE", Table.class);
		//taobao spec
		funcReg.put("STR2VARLIST",Str2VarList.class);
		funcReg.put("STR2NUMLIST",Str2NumList.class);

		//common
		funcReg.put("BITOR", OracleBitOr.class);
		funcReg.put("BITAND", OracleBitAnd.class);
		funcReg.put("NVL",NVL.class);
		funcReg.put("TRUNC", Trunc.class);
		funcReg.put("LAST_DAY", LastDay.class);

		funcReg.put("TO_DATE", ToDate.class);
		funcReg.put("TO_CHAR", ToChar.class);
		funcReg.put("SUBSTR", SubStr.class);

		funcReg.put("CONCAT", Concat.class);
		funcReg.put("MOD", Modulo.class);
		funcReg.put("MULTI_STR", MultiStrConcat.class);
	}
	public boolean containsKey(String key){
		//return  funcReg.containsKey(key);
		return true;
	}
	public Function get(String key){
		Function cls=null;
		try {
			if(key==null||key.trim().equals("")){
				throw new IllegalArgumentException("group function不能为空");
			}
			if(funcReg.get(key.toUpperCase()) != null) {
				cls=funcReg.get(key.toUpperCase()).newInstance();
			} else {
				RandomArgsDefault tad = new RandomArgsDefault();
				tad.setFuncName(key.toUpperCase());
				cls = tad;
			}

		} catch (InstantiationException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
		return cls;
	}

}
