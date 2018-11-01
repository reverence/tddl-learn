package com.taobao.tddl.sqlobjecttree.oracle.hint;

import java.util.Collections;
import java.util.List;

import com.taobao.tddl.sqlobjecttree.HintSetter;

public class RandomStrIndex implements HintSetter {
	List<String> args=Collections.emptyList();
	public List<String> getArguments() {
		return args;
	}

	public void appendSQL(StringBuilder sb) {
		if (args.size() > 1 || args.size() <= 0) {
			throw new IllegalArgumentException("randomStrIndex hint暂时只支持一个参数!size=" + args.size());
		}

		String str = args.get(0);
		sb.append(str);

	}

	public StringBuilder regTableModifiable(String oraTabName,
											List<Object> list, StringBuilder sb) {
		if (args.size() > 1 || args.size() <= 0) {
			throw new IllegalArgumentException("randomStrIndex hint暂时只支持一个参数!size=" + args.size());
		}

		String str = args.get(0);
		sb.append(str);
		return sb;
	}

	public void addHint(List<String> args) {
		this.args=args;
	}

}
