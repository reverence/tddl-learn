package com.taobao.tddl.sqlobjecttree.oracle;

import java.util.List;

import com.taobao.tddl.sqlobjecttree.Hint;
import com.taobao.tddl.sqlobjecttree.oracle.hint.RandomStrIndex;

public class HintUtils {
	public static StringBuilder appendHint(String oraTabName, List<Object> list,
			StringBuilder sb,List<Hint> hints) {
		if (hints!=null&&hints.size() != 0) {
			boolean firestElement = true;
			for (Hint hint : hints) {
				if (firestElement) {
				    if (hint instanceof RandomStrIndex) {
                        sb.append("/* ");
                    } else {
                        sb.append("/*+ ");
                    } 
					firestElement = false;
				} else {
					sb.append(" ");
				}
				sb = hint.regTableModifiable(oraTabName, list, sb);
			}
			sb.append(" */ ");
		}
		return sb;
	}
}
