package com.taobao.tddl.common.sqljep;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.taobao.tddl.common.route.FuncRegister;
import com.taobao.tddl.common.sqljep.function.Comparative;
import com.taobao.tddl.common.sqljep.function.ComparativeAND;
import com.taobao.tddl.common.sqljep.function.ComparativeBaseList;
import com.taobao.tddl.common.sqljep.function.ComparativeOR;
import com.taobao.tddl.common.sqljep.variable.Variable;

public class Main {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		ComparativeBaseList idOR = new ComparativeOR();
		ComparativeOR or=new ComparativeOR();
		ComparativeAND and2=new ComparativeAND();
		idOR.addComparative(new Comparative(Comparative.Equivalent,1L));
		or.addComparative(new Comparative(Comparative.Equivalent,1L));
		idOR.addComparative(or);
		or.addComparative(new Comparative(Comparative.Equivalent,1L));
		Comparative com=new Comparative(Comparative.Equivalent,new BigDecimal(12));
//		and1.addComparative(idOR);
		
//		and2.addComparative(new Comparative(Comparative.Equivalent,132));
//		and2.addComparative(new Comparative(Comparative.Equivalent,142));
//		idOR.addComparative(and1);
//		idOR.addComparative(and2);
		// idOR.addComparative(new Comparative(Comparative.Equivalent,100));
		Comparable<?>[] row = {com,
				or,
				new Comparative(Comparative.LessThan, 100),
				new Comparative(Comparative.GreaterThanOrEqual,
						new java.util.Date()), "wwe" };
//		Comparable<?>[] row = {};
		HashMap<String, Integer> columnMapping = new HashMap<String, Integer>();
		columnMapping.put("id", 0);
		final Map<String, Variable> valMap = new HashMap<String, Variable>();
		valMap.put("age", new Variable() {
			public Comparable<?> getValue() {
				return "223";
			}

		});

		valMap.put("sysdate", new Variable() {
			public Comparable<?> getValue() {
				return new Date();
			}

		});

		// System.out.println("wwe".hashCode()%500);
		// RowJEP sqljep = new RowJEP(
		// "ID in (1,2,4,3,8) and hash(ID)>=4 and 1=1 and SUM =100 and  trunc(SALE_DATE) < to_date('2009-04-03','yyyy-mm-dd')  and abs(hash(name))%500<300"
		// );
		RowJEP sqljep = new RowJEP("conv(right(id,2),16,10) mod 128");
//		RowJEP sqljep = new RowJEP("id mod 128");


		long start = System.currentTimeMillis();
		long t=System.currentTimeMillis();
		sqljep.parseExpression(columnMapping, null,
				FuncRegister.ruleFunTab);
		System.out.println("parse:"+(System.currentTimeMillis()-t));
		long temp=System.currentTimeMillis();
		try {
//			for (int i = 0; i < 1000000; i++) {
//                while(true){
			System.out.println( sqljep.getValue(row));
			
//			}

		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("times:"+(System.currentTimeMillis()-temp));
		System.out.println("totle:" + (System.currentTimeMillis() - start));
	}

}
