tree grammar MySQLWalker;
options {
tokenVocab=MySQLParser; // reuse token types
ASTLabelType=CommonTree; // $label will have type CommonTree
language=Java;
output=AST;
}
@header
{
 package  com.taobao.tddl.parser.mysql; 

import com.taobao.tddl.common.sqlobjecttree.Column;
import com.taobao.tddl.sqlobjecttree.*;

import com.taobao.tddl.sqlobjecttree.common.expression.ExpressionGroup;

import com.taobao.tddl.sqlobjecttree.common.value.function.*;
import com.taobao.tddl.sqlobjecttree.common.value.*;

import com.taobao.tddl.sqlobjecttree.mysql.*;

import com.taobao.tddl.sqlobjecttree.common.expression.OrExpressionGroup;
import com.taobao.tddl.sqlobjecttree.common.*;
import com.taobao.tddl.sqlobjecttree.mysql.function.*;


import com.taobao.tddl.sqlobjecttree.common.expression.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.taobao.tddl.parser.AntlrStringStream;

}
@members{



		protected MySQLConsistStringRegister consistStr;
		public MySQLConsistStringRegister getConsist(){
				return consistStr;
		}
		public void setConsist(MySQLConsistStringRegister consist){
				this.consistStr=consist;
		}
		protected  MySQLFunctionRegister funcreg;


    		public MySQLFunctionRegister getFunc() {
				return funcreg;
			}
			public void setFunc(MySQLFunctionRegister funcreg) {
				this.funcreg = funcreg;
			}

		public boolean mismatchIsMissingToken(IntStream arg0, BitSet follow) {
		if ( follow==null ) {
		throw new IllegalArgumentException("can't know what's wrong...");
		}
		throw new IllegalArgumentException("LT(1)=="+((TokenStream)input).LT(1)+" is consistent with what follows; inserting...viable tokens="+follow.toString(getTokenNames())+"LT(1)="+((TokenStream)input).LT(1));
	}
	public boolean mismatchIsUnwantedToken(IntStream input, int ttype) {
    		throw new IllegalArgumentException(""+ttype);
    	}
}
beg	returns[DMLCommon obj]:
start_rule{$obj=$start_rule.obj;} 	
	;
	
start_rule returns[DMLCommon obj]
	:select_command{$obj=$select_command.select;}
	|insert_command{$obj=$insert_command.ins;}
	|update_command{$obj=$update_command.update;}
	|delete_command{$obj=$delete_command.del;}
	;

setclause[Update update]
	:^(SET updateColumnSpecs[$update]+)	
	;
updateColumnSpecs[Update update]
	:^(SET_ELE updateColumnSpec[$update])	
	;
updateColumnSpec[Update update]
	:^(EQ table_alias? identifier expr[$update.getIndexHolder()])
	{
	$update.addSetElement($identifier.text,$table_alias.aText,$expr.valueObj);
	}
	;

insert_command returns[Insert ins]
@init{$ins=new Insert();}
	:^(INSERT tables[$ins] column_specs[$ins]* values[$ins])
	;
values[Insert ins]	:^(INSERT_VAL (expr[$ins.getIndexHolder()]{ins.addValue($expr.valueObj);})*)
	;
column_specs[Insert ins]
	:^(COLUMNS column_spec[$ins]+)
	;
column_spec[Insert ins]
	:^(COLUMN identifier table_name?)
	{
		$ins.addColumnTandC($table_name.text,$identifier.text);
	}
	;



whereClause[WhereCondition where]
	:^(WHERE sqlCondition[$where])
	;
groupByClause[WhereCondition where]
	:^(GROUPBY columnNamesAfterWhere){
		$where.setGroupByColumns($columnNamesAfterWhere.ret);
	}
	;
orderByClause[WhereCondition where]
	:^(ORDERBY columnNamesAfterWhere){
		$where.setOrderByColumns($columnNamesAfterWhere.ret);
	}
	;
columnNamesAfterWhere returns[List<OrderByEle> ret]
@init{
	$ret = new ArrayList<OrderByEle>();
}
	:(columnNameAfterWhere[$ret])+
	;
columnNameAfterWhere[List<OrderByEle> orderByEles]
	:^(ASC  identifier table_alias?){
		$orderByEles.add(new OrderByEle($table_alias.aText,$identifier.text,true));
	}
	|^(DESC  identifier table_alias?){
		$orderByEles.add(new OrderByEle($table_alias.aText,$identifier.text,false));
	}
	;

selectClause[Select select]
    :^(SELECT select_list[$select])
    ;  

sqlCondition[WhereCondition where]
	
	:^(CONDITION_OR_NOT condition[where.getHolder(),where.getExpGroup(),false])
	|^(CONDITION_OR condition[where.getHolder(),where.getExpGroup(),false])
	;

condition[BindIndexHolder where,ExpressionGroup eg,boolean isPriority]	



	:
	{
		OrExpressionGroup orExp=new OrExpressionGroup();
		$eg.addExpressionGroup(orExp);
	}^('OR' s1=condition[where,orExp,$isPriority]+)
	| 
	{
		ExpressionGroup andExp=new ExpressionGroup();
		$eg.addExpressionGroup(andExp);
	}^('AND' condition[where,andExp,$isPriority]+)




	|condition_PAREN[where,$eg]
	|^(PRIORITY condition[where,$eg,true])
	;

/*condition_and[OrExpressionGroup orGroup] returns[ExpressionGroup andExpGrp]
	:
	{
		$andExpGrp=new ExpressionGroup();
	}
	 ^('AND' condition_PAREN[$andExpGrp]+)
	 
	|condition_PAREN[$orGroup]
	
	|^('OR' s1=condition_and[orExp] s2=condition_and[orExp])
	
	{
	where.addAndExpression($s1.andExpGrp);
	where.addAndExpression($s2.andExpGrp);
	}
	;
	*/
condition_PAREN[BindIndexHolder where,ExpressionGroup exp]
	:condition_expr[$where,$exp]+
	;
condition_expr[BindIndexHolder where,ExpressionGroup exp]
	: comparisonCondition[$where,$exp]
	| inCondition[$where,$exp] 
	| isCondition [$where,$exp]
	| likeCondition[$where,$exp]
//	| betweenCondition^
	;
betweenCondition
	:^(NOT_BETWEEN between_and)
	|^(BETWEEN between_and)
	;
between_and
	:	
	;
likeCondition[BindIndexHolder where,ExpressionGroup exp]
	:^(NOT_LIKE expr[$where] left_cond[$where]){
			NotLike notlike=new NotLike();
		notlike.setLeft($left_cond.ret);
		notlike.setRight($expr.valueObj);
		$exp.addExpression(notlike);
	}
	|^(LIKE expr[$where] left_cond[$where]){
		Like like=new Like();
		like.setLeft($left_cond.ret);
		like.setRight($expr.valueObj);
		$exp.addExpression(like);
	}
	;
	
isCondition[BindIndexHolder where,ExpressionGroup exp]
	:^(ISNOT NULL left_cond[$where]){
		IsNot arg=new IsNot();
		arg.setLeft($left_cond.ret);
		arg.setRight(null);
		$exp.addExpression(arg);
	}
	|^(IS NULL left_cond[$where]){
		Is arg=new Is();
		arg.setLeft($left_cond.ret);
		arg.setRight(null);
		$exp.addExpression(arg);
	}	
	;


comparisonCondition[BindIndexHolder where,ExpressionGroup exp]
	:^(EQ expr[$where] left_cond[$where])
	{
		Equivalent arg=new Equivalent();
		arg.setLeft($left_cond.ret);
		arg.setRight($expr.valueObj);
		$exp.addExpression(arg);
	}
	|^(NOT_EQ expr[$where] left_cond[$where])
	{
		NotEquivalent arg=new NotEquivalent();
		arg.setLeft($left_cond.ret);
		arg.setRight($expr.valueObj);
		$exp.addExpression(arg);
	}
	|^(LTH expr[$where] left_cond[$where])
	{
		LessThan arg=new LessThan();
		arg.setLeft($left_cond.ret);
		arg.setRight($expr.valueObj);
		$exp.addExpression(arg);
	}
	|^(GTH expr[$where] left_cond[$where])
	{
		GreaterThan arg=new GreaterThan();
		arg.setLeft($left_cond.ret);
		arg.setRight($expr.valueObj);
		$exp.addExpression(arg);
	}
	|^(LEQ expr[$where] left_cond[$where])
	{
		LessThanOrEquivalent arg=new LessThanOrEquivalent();
		arg.setLeft($left_cond.ret);
		arg.setRight($expr.valueObj);
		$exp.addExpression(arg);
	}
	|^(GEQ expr[$where] left_cond[$where])
	{
		GreaterThanOrEquivalent arg=new GreaterThanOrEquivalent();
		arg.setLeft($left_cond.ret);
		arg.setRight($expr.valueObj);
		$exp.addExpression(arg);
	}

	;
left_cond[BindIndexHolder where] returns[Object ret]

	:^(CONDITION_LEFT expr[$where])
	{
		$ret=$expr.valueObj;
	}
	;
in_list[BindIndexHolder where] returns[List list]
	:^(IN_LISTS inCondition_expr_adds[$where])
	{
		$list=$inCondition_expr_adds.list;
	}	
	;
inCondition [BindIndexHolder where,ExpressionGroup exp]
	:^(IN not='NOT'? subquery? in_list[$where]?  left_cond[$where])
		{
		if($not.text!=null){
			if($subquery.subselect!=null){
					NotInExpression arg=new NotInExpression();
					arg.setLeft($left_cond.ret);
					arg.setRight($subquery.subselect);
					$exp.addExpression(arg);
			}
			else if($in_list.list!=null){
					NotInExpression arg=new NotInExpression();
					arg.setLeft($left_cond.ret);
					arg.setRight($in_list.list);
					$exp.addExpression(arg);
			}
		}else{
			if($subquery.subselect!=null){
					InExpression arg=new InExpression();
					arg.setLeft($left_cond.ret);
					arg.setRight($subquery.subselect);
					$exp.addExpression(arg);
			}
			else if($in_list.list!=null){
					InExpression arg=new InExpression();
					arg.setLeft($left_cond.ret);
					arg.setRight($in_list.list);
					$exp.addExpression(arg);
			}
		}
		;
		}
		
	;



	
inCondition_expr_adds[BindIndexHolder where] returns [List list]
	@init{$list=new ArrayList();}:
	(expr_add[$where]
	{
		$list.add($expr_add.valueObjExpr);
	})+

	;
	
expr[BindIndexHolder where] returns [Object valueObj]	
	:(expr_add[$where] {$valueObj=$expr_add.valueObjExpr;}
	|subquery {$valueObj=$subquery.subselect;}
	
	)	
	;
expr_add[BindIndexHolder where]  returns[Object valueObjExpr]
@init{
List<Object> list=new ArrayList<Object>();
}
	:^(NEGATIVE s1=expr_add[$where]) {
	$valueObjExpr=((BigDecimal)$s1.valueObjExpr).negate();
	}
	|^(POSITIVE s1=expr_add[$where]) {
	$valueObjExpr=$s1.valueObjExpr;
	}
	|^(PLUS s1=expr_add[$where] s2=expr_add[$where]) {
	Function func=new Add();
	list.add($s1.valueObjExpr);
	list.add($s2.valueObjExpr);
	func.setValue(list);
	$valueObjExpr=func;
	}
	|^(MINUS s1=expr_add[$where] s2=expr_add[$where]){
		Function func=new Subtract();
	list.add($s1.valueObjExpr);
	list.add($s2.valueObjExpr);
	func.setValue(list);
	$valueObjExpr=func;
	}
	|^(BITOR s1=expr_add[$where] s2=expr_add[$where]){
		Function func=new BitOr();
	list.add($s1.valueObjExpr);
	list.add($s2.valueObjExpr);
	func.setValue(list);
	$valueObjExpr=func;
	}
	|^(BITAND s1=expr_add[$where] s2=expr_add[$where]){
		Function func=new BitAnd();
	list.add($s1.valueObjExpr);
	list.add($s2.valueObjExpr);
	func.setValue(list);
	$valueObjExpr=func;
	}
	|^(BITXOR s1=expr_add[$where] s2=expr_add[$where]){
	Function func=new BitXOr();
	list.add($s1.valueObjExpr);
	list.add($s2.valueObjExpr);
	func.setValue(list);
	$valueObjExpr=func;
	}
	|^(SHIFTLEFT s1=expr_add[$where] s2=expr_add[$where]){
	Function func=new ShiftLeft();
	list.add($s1.valueObjExpr);
	list.add($s2.valueObjExpr);
	func.setValue(list);
	$valueObjExpr=func;
	}
	|^(SHIFTRIGHT s1=expr_add[$where] s2=expr_add[$where]){
	Function func=new ShiftRight();
	list.add($s1.valueObjExpr);
	list.add($s2.valueObjExpr);
	func.setValue(list);
	$valueObjExpr=func;
	}
	|^(ASTERISK s1=expr_add[$where] s2=expr_add[$where]){
	Function func=new Multiply();
	list.add($s1.valueObjExpr);
	list.add($s2.valueObjExpr);
	func.setValue(list);
	$valueObjExpr=func;
	}
	|^(DIVIDE s1=expr_add[$where] s2=expr_add[$where]){
	Function func=new Divide();
	list.add($s1.valueObjExpr);
	list.add($s2.valueObjExpr);
	func.setValue(list);
	$valueObjExpr=func;
	}
	|N {$valueObjExpr=new BigDecimal($N.text);}
	|NUMBER{$valueObjExpr=new BigDecimal($NUMBER.text);}
	|boolean_literal//not support true false yet
	|'NULL' {$valueObjExpr=null;}
	|'ROWNUM'
	|'?'{
	BindVar val=new BindVar(where.selfAddAndGet());
	$valueObjExpr=val;
	}
	|^(QUTED_STR quoted_string){$valueObjExpr=$quoted_string.aText;}
	|^(COLUMN identifier table_name?)
	{
	Column col=new ColumnImp($table_name.text,$identifier.text,null);
	$valueObjExpr=col;
	}
	|^(COLUMNAST ASTERISK)
	{
	Column col=new ColumnImp(null,$ASTERISK.text,null);
	$valueObjExpr=col;
	}
	|^(ID 
	(expr[$where]{list.add($expr.valueObj);})*){
	Function func=funcreg.get(($ID.text).toUpperCase());
	func.setValue(list);
	$valueObjExpr=func;
	}
	|^(CONSIST ID){
	Function func=consistStr.get(($ID.text).toUpperCase());
	$valueObjExpr=func;
	}
	;
value	:
	N
	|NUMBER
	|'?'
	;
boolean_literal returns[Object valueObj]
	:s1='TRUE' {$valueObj=Boolean.parseBoolean($s1.text);}
	| s1='FALSE'{$valueObj=Boolean.parseBoolean($s1.text);}
	;	

	
select_list[Select select]
	:^(SELECT_LIST displayed_column[$select]+)
	;	
fromClause[Select select]
	:^(TABLENAMES table[$select]+)
	;

table[DMLCommon common]
	:^(TABLENAME table_spec[$common])
	;
tables[DMLCommon common]
	:^(TABLENAMES table[$common]+)
	;
table_spec[DMLCommon common]
	:( schema_name)? table_name  alias?
	{
		common.addTableNameAndSchemaName($table_name.text,$schema_name.text,$alias.aliText);
	}
	|subquery alias?
	{
		common.addTableSubQuery($subquery.subselect,$alias.aliText);

	}
	;
	
schema_name
	:identifier
	;
subquery returns [Select subselect]:
	^(SUBQUERY select_command)
	{
	$subselect=$select_command.select;
	$subselect.setSubSelect(true);
	}	
	;
table_name
	:identifier
	;	
displayed_column[Select select]
@init{
List<Object> list=new ArrayList<Object>();
}
	:
	^(ID  (expr[$select.getIndexHolder()]{list.add($expr.valueObj);} alias? )* ){
	Function func=funcreg.get(($ID.text).toUpperCase());
	func.setValue(list);
	FunctionColumn funcolumn=new FunctionColumn();
	funcolumn.setFunction(func);
	funcolumn.setAlias($alias.aliText);
	$select.addColumn(funcolumn);
	}
	|^(ID alias?){
	Function func=funcreg.get(($ID.text).toUpperCase());
	FunctionColumn funcolumn=new FunctionColumn();
	funcolumn.setFunction(func);
	funcolumn.setAlias($alias.aliText);
	$select.addColumn(funcolumn);
	}
	|^(CONSIST ID alias?){
	Function func=consistStr.get(($ID.text).toUpperCase());
	FunctionColumn funcolumn=new FunctionColumn();
	funcolumn.setFunction(func);
	funcolumn.setAlias($alias.aliText);
	$select.addColumn(funcolumn);
	}
	|^(COLUMN table_alias? columnAnt alias?)
	{$select.addColumn($table_alias.aText,$columnAnt.text,$alias.aliText);}

	;    
	
columnAnt returns[String aText]
	:ASTERISK {$aText=$ASTERISK.text;}
	|N {$aText=$N.text;}
	|identifier {$aText=$identifier.text;}
	;

quoted_string returns[Object aText]
	: QUOTED_STRING {
            String temp=$QUOTED_STRING.text;
            AntlrStringStream st = new AntlrStringStream(
            		temp);
            MySQLDateWalker.quoted_string_return ret = null;
			MySQLDateParserLexer pl = new MySQLDateParserLexer(
					st);
			TokenRewriteStream tokens = new TokenRewriteStream(
					pl);
			MySQLDateParserParser pa = new MySQLDateParserParser(
					tokens);

			MySQLDateParserParser.quoted_string_return beg = null;
			beg = pa.quoted_string();
			CommonTree tree = (CommonTree) beg
					.getTree();
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(
					tree);
			nodes.setTokenStream(tokens);
			MySQLDateWalker walker = new MySQLDateWalker(nodes);
			ret = walker.quoted_string();
			Object tempObj =ret.aText;
			if(tempObj!=null){
				 retval.aText=tempObj;
			}else{
				 retval.aText=temp.substring(1,temp.length() - 1);;
			}
	}
	;

identifier
	:ID
   	;
table_alias returns [String aText]
	:^(COL_TAB identifier{$aText=$identifier.text;}	)
	;
	
alias returns [String aliText]
	:^(AS identifier){$aliText=$identifier.text;}
	;
		
/*-------------------------------------------the rules below are Redefined by SubParser 
.For Antlr v3 didn't have any method to reuse rules.So we wrote rules which had been modified by subParser here to make
the refactor easily.-----------------------------*/

select_command returns[Select select]
@init{$select =new MySelect();}
     : selectClause[$select] (fromClause[$select])?  (whereClause[$select.getWhere()])? (groupByClause[$select.getWhere()])? (orderByClause[$select.getWhere()])?  (limitClause[(MyWhereCondition)$select.getWhere()])? for_update[$select]?
     ;
delete_command returns[Delete del]
@init{$del=new Delete();}
	:^(DELETE tables[$del] whereClause[$del.getWhere()]? orderByClause[$del.getWhere()]?  (limitClause[(MyWhereCondition)$del.getWhere()])? )
	;
update_command returns[Update update]
@init{$update=new Update();}
	:^(UPDATE tables[$update] setclause[$update] whereClause[$update.getWhere()]? orderByClause[$update.getWhere()]?  (limitClause[(MyWhereCondition)$update.getWhere()])?
	)
	;
limitClause[MyWhereCondition where]
	:^('LIMIT' skip[$where]? range[$where])
	;
skip[MyWhereCondition where]	
	:^(SKIP MINUS N){$where.setStart(-Integer.valueOf($N.text));}
	|^(SKIP N){$where.setStart(Integer.valueOf($N.text));}
	|^(SKIP '?'){
		BindVar val=new BindVar($where.selfAddAndGet());
		$where.setStart(val);
	}	
	;
range[MyWhereCondition where]
	:^(RANGE MINUS N){$where.setRange(-Integer.valueOf($N.text));}
	|^(RANGE N){$where.setRange(Integer.valueOf($N.text));}
	|^(RANGE '?'){
		BindVar val=new BindVar($where.selfAddAndGet());
	$where.setRange(val);
	}	
	;
	
for_update[Select select]
	:^(FORUPDATE N?)
	{
		MySQLForUpdate forUpdate = new MySQLForUpdate();
		$select.addForUpdate(forUpdate);
	}
	|^(SHAREMODE N?)
	{
		MySQLLockInShareMode share = new MySQLLockInShareMode();
		$select.addForUpdate(share);
	}
	;
