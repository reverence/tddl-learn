package com.taobao.tddl.sqlobjecttree.oracle;

import static com.taobao.tddl.sqlobjecttree.oracle.SkipMaxUtils.buildRownumGroup;
import static com.taobao.tddl.sqlobjecttree.oracle.SkipMaxUtils.getRowNumMaxToInt;
import static com.taobao.tddl.sqlobjecttree.oracle.SkipMaxUtils.getRowNumSkipToInt;

import java.util.List;

import com.taobao.tddl.common.sqljep.function.Comparative;
import com.taobao.tddl.sqlobjecttree.BindIndexHolder;
import com.taobao.tddl.sqlobjecttree.Select;
import com.taobao.tddl.sqlobjecttree.WhereCondition;

public class OracleSelect extends Select {
	private Comparative rownumComparative = null;

	public OracleSelect() {
		super();
	}
	public OracleSelect(BindIndexHolder holder){
		super(holder);
	}

	public StringBuilder regTableModifiable(String oraTabName,
											List<Object> list, StringBuilder sb) {

		super.appendSelect(sb);

		sb = HintUtils.appendHint(oraTabName, list, sb, hints);

		sb = super.appendSelectBody(oraTabName, list, sb);

		return sb;
	}

	public int getSkip(List<Object> param) {
		/*
		 * 这个getSkip的方法实际上会被嵌套调用。
		 */
		// rownum>0 and rownum<10 row>0 nested rownum<10 ;rownum= bigdecimal
		// long int
		int temp = DEFAULT_SKIP_MAX;

		if (rownumComparative != null) {
			temp = getRowNumSkipToInt(rownumComparative.getVal(param, null));
		}
		return temp;

	}

	@Override
	public void init() {
		initAliasAndComparableMap(aliasToSQLFragementMap,repListMap);

		//这个ExpressionGroup用于存放sql中所有的rownum Expression.默认都为and关系，不过其实是and还是or没关系。
		//因为不依赖这个关系作事情。
		rownumComparative =	buildRownumGroup(where.getExpGroup(),tbNames,aliasToSQLFragementMap);

		getSelectSqlType();

		registerTraversalActionAndGet();

		registerUnmodifiableSqlOutputFragement();
	}


	@Override
	protected WhereCondition getWhereCondition() {
		return new OracleWhereCondition();
	}

	protected int getRangeOrMax(List<Object> param) {
		throw new IllegalArgumentException("should not be here");
	}

	@Override
	public int getMax(List<Object> param) {
		int temp = DEFAULT_SKIP_MAX;
		if (rownumComparative != null) {
			temp = getRowNumMaxToInt(rownumComparative.getVal(param, null));
		}
		return temp;
	}

}
