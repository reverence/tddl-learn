// $ANTLR 3.3 Nov 30, 2010 12:50:56 OracleWalker.g 2017-06-07 19:04:24

 package  com.taobao.tddl.parser.oracle; 


import com.taobao.tddl.common.sqlobjecttree.Column;
import com.taobao.tddl.sqlobjecttree.*;

import com.taobao.tddl.sqlobjecttree.common.expression.ExpressionGroup;

import com.taobao.tddl.sqlobjecttree.common.value.function.*;
import com.taobao.tddl.sqlobjecttree.common.value.*;

import com.taobao.tddl.sqlobjecttree.oracle.*;

import com.taobao.tddl.sqlobjecttree.common.expression.OrExpressionGroup;
import com.taobao.tddl.sqlobjecttree.common.*;


import com.taobao.tddl.sqlobjecttree.oracle.function.*;

import com.taobao.tddl.sqlobjecttree.common.expression.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;




import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


public class OracleWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALIAS", "TABLENAME", "TABLENAMES", "SUBQUERY", "COLUMN", "AS", "SELECT", "DISPLAYED_COUNT_COLUMN", "DISPLAYED_COLUMN", "IN", "NOT", "SELECT_LIST", "QUTED_STR", "WHERE", "CONDITION_OR", "CONDITION_LEFT", "IN_LISTS", "CONDITION_OR_NOT", "AND", "OR", "ISNOT", "IS", "NULL", "NAN", "INFINITE", "LIKE", "NOT_LIKE", "NOT_BETWEEN", "BETWEEN", "GROUPBY", "ORDERBY", "INSERT", "INSERT_VAL", "PRIORITY", "COLUMNAST", "COLUMNS", "UPDATE", "SET", "SET_ELE", "COL_TAB", "DELETE", "CONSIST", "FORUPDATE", "NOWAIT", "OF", "WAIT", "CAST", "NEGATIVE", "POSITIVE", "MULTI_STR", "COMMA", "EQ", "LPAREN", "RPAREN", "ID", "BITOR", "BITAND", "BITXOR", "SHIFTLEFT", "SHIFTRIGHT", "PLUS", "MINUS", "ASTERISK", "DIVIDE", "EXPONENT", "LTH", "GTH", "NOT_EQ", "LEQ", "GEQ", "ASC", "DESC", "DOT", "N", "NUMBER", "POINT", "ARROW", "DOUBLEVERTBAR", "QUOTED_STRING", "DOUBLEQUOTED_STRING", "WS", "'SET'", "'GRUOP'", "'BY'", "'ORDER'", "'WHERE'", "'NOT'", "'OR'", "'AND'", "'BETWEEN'", "'IS'", "'NAN'", "'INFINITE'", "'NULL'", "'IN'", "'LIKE'", "'?'", "'CAST'", "'AS'", "'FROM'", "'TRUE'", "'FALSE'", "'SELECT'", "'/*'", "'*/'", "'INSERT'", "'INTO'", "'VALUES'", "'FOR'", "'UPDATE'", "'OF'", "'NOWAIT'", "'WAIT'", "'DELETE'"
    };
    public static final int EOF=-1;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int T__111=111;
    public static final int T__112=112;
    public static final int T__113=113;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int ALIAS=4;
    public static final int TABLENAME=5;
    public static final int TABLENAMES=6;
    public static final int SUBQUERY=7;
    public static final int COLUMN=8;
    public static final int AS=9;
    public static final int SELECT=10;
    public static final int DISPLAYED_COUNT_COLUMN=11;
    public static final int DISPLAYED_COLUMN=12;
    public static final int IN=13;
    public static final int NOT=14;
    public static final int SELECT_LIST=15;
    public static final int QUTED_STR=16;
    public static final int WHERE=17;
    public static final int CONDITION_OR=18;
    public static final int CONDITION_LEFT=19;
    public static final int IN_LISTS=20;
    public static final int CONDITION_OR_NOT=21;
    public static final int AND=22;
    public static final int OR=23;
    public static final int ISNOT=24;
    public static final int IS=25;
    public static final int NULL=26;
    public static final int NAN=27;
    public static final int INFINITE=28;
    public static final int LIKE=29;
    public static final int NOT_LIKE=30;
    public static final int NOT_BETWEEN=31;
    public static final int BETWEEN=32;
    public static final int GROUPBY=33;
    public static final int ORDERBY=34;
    public static final int INSERT=35;
    public static final int INSERT_VAL=36;
    public static final int PRIORITY=37;
    public static final int COLUMNAST=38;
    public static final int COLUMNS=39;
    public static final int UPDATE=40;
    public static final int SET=41;
    public static final int SET_ELE=42;
    public static final int COL_TAB=43;
    public static final int DELETE=44;
    public static final int CONSIST=45;
    public static final int FORUPDATE=46;
    public static final int NOWAIT=47;
    public static final int OF=48;
    public static final int WAIT=49;
    public static final int CAST=50;
    public static final int NEGATIVE=51;
    public static final int POSITIVE=52;
    public static final int MULTI_STR=53;
    public static final int COMMA=54;
    public static final int EQ=55;
    public static final int LPAREN=56;
    public static final int RPAREN=57;
    public static final int ID=58;
    public static final int BITOR=59;
    public static final int BITAND=60;
    public static final int BITXOR=61;
    public static final int SHIFTLEFT=62;
    public static final int SHIFTRIGHT=63;
    public static final int PLUS=64;
    public static final int MINUS=65;
    public static final int ASTERISK=66;
    public static final int DIVIDE=67;
    public static final int EXPONENT=68;
    public static final int LTH=69;
    public static final int GTH=70;
    public static final int NOT_EQ=71;
    public static final int LEQ=72;
    public static final int GEQ=73;
    public static final int ASC=74;
    public static final int DESC=75;
    public static final int DOT=76;
    public static final int N=77;
    public static final int NUMBER=78;
    public static final int POINT=79;
    public static final int ARROW=80;
    public static final int DOUBLEVERTBAR=81;
    public static final int QUOTED_STRING=82;
    public static final int DOUBLEQUOTED_STRING=83;
    public static final int WS=84;

    // delegates
    // delegators


        public OracleWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public OracleWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return OracleWalker.tokenNames; }
    public String getGrammarFileName() { return "OracleWalker.g"; }





    		protected OracleConsistStringRegister consistStr;
    		public OracleConsistStringRegister getConsist(){
    				return consistStr;
    		}
    		public void setConsist(OracleConsistStringRegister consist){
    				this.consistStr=consist;
    		}
    		protected  OracleFunctionRegister functionMap;

        	public OracleFunctionRegister getFunc() {
    			return functionMap;
    		}
    		public void setFunc(OracleFunctionRegister funcreg) {
    				this.functionMap = funcreg;
    		}
    		protected OracleHintRegister hintReg;
    		public void setOracleHint(OracleHintRegister hintreg){
    				this.hintReg=hintreg;
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


    public static class beg_return extends TreeRuleReturnScope {
        public DMLCommon obj;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "beg"
    // OracleWalker.g:70:1: beg returns [DMLCommon obj] : start_rule ;
    public final OracleWalker.beg_return beg() throws RecognitionException {
        OracleWalker.beg_return retval = new OracleWalker.beg_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.start_rule_return start_rule1 = null;



        try {
            // OracleWalker.g:70:27: ( start_rule )
            // OracleWalker.g:71:1: start_rule
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_start_rule_in_beg48);
            start_rule1=start_rule();

            state._fsp--;

            adaptor.addChild(root_0, start_rule1.getTree());
            retval.obj =(start_rule1!=null?start_rule1.obj:null);

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "beg"

    public static class start_rule_return extends TreeRuleReturnScope {
        public DMLCommon obj;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start_rule"
    // OracleWalker.g:74:1: start_rule returns [DMLCommon obj] : ( select_command[null] | insert_command | update_command | delete_command );
    public final OracleWalker.start_rule_return start_rule() throws RecognitionException {
        OracleWalker.start_rule_return retval = new OracleWalker.start_rule_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.select_command_return select_command2 = null;

        OracleWalker.insert_command_return insert_command3 = null;

        OracleWalker.update_command_return update_command4 = null;

        OracleWalker.delete_command_return delete_command5 = null;



        try {
            // OracleWalker.g:75:2: ( select_command[null] | insert_command | update_command | delete_command )
            int alt1=4;
            switch ( input.LA(1) ) {
            case SELECT:
                {
                alt1=1;
                }
                break;
            case INSERT:
                {
                alt1=2;
                }
                break;
            case UPDATE:
                {
                alt1=3;
                }
                break;
            case DELETE:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // OracleWalker.g:75:3: select_command[null]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_select_command_in_start_rule65);
                    select_command2=select_command(null);

                    state._fsp--;

                    adaptor.addChild(root_0, select_command2.getTree());
                    retval.obj =(select_command2!=null?select_command2.select:null);

                    }
                    break;
                case 2 :
                    // OracleWalker.g:76:3: insert_command
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_insert_command_in_start_rule71);
                    insert_command3=insert_command();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_command3.getTree());
                    retval.obj =(insert_command3!=null?insert_command3.ins:null);

                    }
                    break;
                case 3 :
                    // OracleWalker.g:77:3: update_command
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_update_command_in_start_rule76);
                    update_command4=update_command();

                    state._fsp--;

                    adaptor.addChild(root_0, update_command4.getTree());
                    retval.obj =(update_command4!=null?update_command4.update:null);

                    }
                    break;
                case 4 :
                    // OracleWalker.g:78:3: delete_command
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_delete_command_in_start_rule81);
                    delete_command5=delete_command();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_command5.getTree());
                    retval.obj =(delete_command5!=null?delete_command5.del:null);

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "start_rule"

    public static class setclause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setclause"
    // OracleWalker.g:81:1: setclause[Update update] : ^( SET ( updateColumnSpecs[$update] )+ ) ;
    public final OracleWalker.setclause_return setclause(Update update) throws RecognitionException {
        OracleWalker.setclause_return retval = new OracleWalker.setclause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SET6=null;
        OracleWalker.updateColumnSpecs_return updateColumnSpecs7 = null;


        CommonTree SET6_tree=null;

        try {
            // OracleWalker.g:82:2: ( ^( SET ( updateColumnSpecs[$update] )+ ) )
            // OracleWalker.g:82:3: ^( SET ( updateColumnSpecs[$update] )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            SET6=(CommonTree)match(input,SET,FOLLOW_SET_in_setclause94); 
            SET6_tree = (CommonTree)adaptor.dupNode(SET6);

            root_1 = (CommonTree)adaptor.becomeRoot(SET6_tree, root_1);



            match(input, Token.DOWN, null); 
            // OracleWalker.g:82:9: ( updateColumnSpecs[$update] )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==SET_ELE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // OracleWalker.g:82:9: updateColumnSpecs[$update]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_updateColumnSpecs_in_setclause96);
            	    updateColumnSpecs7=updateColumnSpecs(update);

            	    state._fsp--;

            	    adaptor.addChild(root_1, updateColumnSpecs7.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "setclause"

    public static class updateColumnSpecs_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "updateColumnSpecs"
    // OracleWalker.g:84:1: updateColumnSpecs[Update update] : ^( SET_ELE updateColumnSpec[$update] ) ;
    public final OracleWalker.updateColumnSpecs_return updateColumnSpecs(Update update) throws RecognitionException {
        OracleWalker.updateColumnSpecs_return retval = new OracleWalker.updateColumnSpecs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SET_ELE8=null;
        OracleWalker.updateColumnSpec_return updateColumnSpec9 = null;


        CommonTree SET_ELE8_tree=null;

        try {
            // OracleWalker.g:85:2: ( ^( SET_ELE updateColumnSpec[$update] ) )
            // OracleWalker.g:85:3: ^( SET_ELE updateColumnSpec[$update] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            SET_ELE8=(CommonTree)match(input,SET_ELE,FOLLOW_SET_ELE_in_updateColumnSpecs111); 
            SET_ELE8_tree = (CommonTree)adaptor.dupNode(SET_ELE8);

            root_1 = (CommonTree)adaptor.becomeRoot(SET_ELE8_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_updateColumnSpec_in_updateColumnSpecs113);
            updateColumnSpec9=updateColumnSpec(update);

            state._fsp--;

            adaptor.addChild(root_1, updateColumnSpec9.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "updateColumnSpecs"

    public static class updateColumnSpec_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "updateColumnSpec"
    // OracleWalker.g:87:1: updateColumnSpec[Update update] : ^( EQ ( table_alias )? identifier expr[$update.getIndexHolder()] ) ;
    public final OracleWalker.updateColumnSpec_return updateColumnSpec(Update update) throws RecognitionException {
        OracleWalker.updateColumnSpec_return retval = new OracleWalker.updateColumnSpec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQ10=null;
        OracleWalker.table_alias_return table_alias11 = null;

        OracleWalker.identifier_return identifier12 = null;

        OracleWalker.expr_return expr13 = null;


        CommonTree EQ10_tree=null;

        try {
            // OracleWalker.g:88:2: ( ^( EQ ( table_alias )? identifier expr[$update.getIndexHolder()] ) )
            // OracleWalker.g:88:3: ^( EQ ( table_alias )? identifier expr[$update.getIndexHolder()] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            EQ10=(CommonTree)match(input,EQ,FOLLOW_EQ_in_updateColumnSpec127); 
            EQ10_tree = (CommonTree)adaptor.dupNode(EQ10);

            root_1 = (CommonTree)adaptor.becomeRoot(EQ10_tree, root_1);



            match(input, Token.DOWN, null); 
            // OracleWalker.g:88:8: ( table_alias )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==COL_TAB) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // OracleWalker.g:88:8: table_alias
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_table_alias_in_updateColumnSpec129);
                    table_alias11=table_alias();

                    state._fsp--;

                    adaptor.addChild(root_1, table_alias11.getTree());

                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_updateColumnSpec132);
            identifier12=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier12.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_updateColumnSpec134);
            expr13=expr(update.getIndexHolder());

            state._fsp--;

            adaptor.addChild(root_1, expr13.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            	update.addSetElement((identifier12!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(identifier12.start),
              input.getTreeAdaptor().getTokenStopIndex(identifier12.start))):null),(table_alias11!=null?table_alias11.aText:null),(expr13!=null?expr13.valueObj:null));
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "updateColumnSpec"

    public static class values_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "values"
    // OracleWalker.g:95:1: values[Insert ins] : ^( INSERT_VAL ( expr[$ins.getIndexHolder()] )* ) ;
    public final OracleWalker.values_return values(Insert ins) throws RecognitionException {
        OracleWalker.values_return retval = new OracleWalker.values_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INSERT_VAL14=null;
        OracleWalker.expr_return expr15 = null;


        CommonTree INSERT_VAL14_tree=null;

        try {
            // OracleWalker.g:95:20: ( ^( INSERT_VAL ( expr[$ins.getIndexHolder()] )* ) )
            // OracleWalker.g:95:21: ^( INSERT_VAL ( expr[$ins.getIndexHolder()] )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            INSERT_VAL14=(CommonTree)match(input,INSERT_VAL,FOLLOW_INSERT_VAL_in_values151); 
            INSERT_VAL14_tree = (CommonTree)adaptor.dupNode(INSERT_VAL14);

            root_1 = (CommonTree)adaptor.becomeRoot(INSERT_VAL14_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OracleWalker.g:95:34: ( expr[$ins.getIndexHolder()] )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>=SUBQUERY && LA4_0<=COLUMN)||LA4_0==QUTED_STR||LA4_0==COLUMNAST||LA4_0==CONSIST||(LA4_0>=CAST && LA4_0<=MULTI_STR)||(LA4_0>=ID && LA4_0<=DIVIDE)||(LA4_0>=N && LA4_0<=NUMBER)||LA4_0==97||LA4_0==100||(LA4_0>=104 && LA4_0<=105)) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // OracleWalker.g:95:35: expr[$ins.getIndexHolder()]
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_expr_in_values154);
                	    expr15=expr(ins.getIndexHolder());

                	    state._fsp--;

                	    adaptor.addChild(root_1, expr15.getTree());
                	    ins.addValue((expr15!=null?expr15.valueObj:null));

                	    }
                	    break;

                	default :
                	    break loop4;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "values"

    public static class column_specs_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column_specs"
    // OracleWalker.g:97:1: column_specs[Insert ins] : ^( COLUMNS ( column_spec[$ins] )+ ) ;
    public final OracleWalker.column_specs_return column_specs(Insert ins) throws RecognitionException {
        OracleWalker.column_specs_return retval = new OracleWalker.column_specs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COLUMNS16=null;
        OracleWalker.column_spec_return column_spec17 = null;


        CommonTree COLUMNS16_tree=null;

        try {
            // OracleWalker.g:98:2: ( ^( COLUMNS ( column_spec[$ins] )+ ) )
            // OracleWalker.g:98:3: ^( COLUMNS ( column_spec[$ins] )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            COLUMNS16=(CommonTree)match(input,COLUMNS,FOLLOW_COLUMNS_in_column_specs170); 
            COLUMNS16_tree = (CommonTree)adaptor.dupNode(COLUMNS16);

            root_1 = (CommonTree)adaptor.becomeRoot(COLUMNS16_tree, root_1);



            match(input, Token.DOWN, null); 
            // OracleWalker.g:98:13: ( column_spec[$ins] )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COLUMN) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // OracleWalker.g:98:13: column_spec[$ins]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_column_spec_in_column_specs172);
            	    column_spec17=column_spec(ins);

            	    state._fsp--;

            	    adaptor.addChild(root_1, column_spec17.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "column_specs"

    public static class column_spec_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column_spec"
    // OracleWalker.g:100:1: column_spec[Insert ins] : ^( COLUMN identifier ( table_name )? ) ;
    public final OracleWalker.column_spec_return column_spec(Insert ins) throws RecognitionException {
        OracleWalker.column_spec_return retval = new OracleWalker.column_spec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COLUMN18=null;
        OracleWalker.identifier_return identifier19 = null;

        OracleWalker.table_name_return table_name20 = null;


        CommonTree COLUMN18_tree=null;

        try {
            // OracleWalker.g:101:2: ( ^( COLUMN identifier ( table_name )? ) )
            // OracleWalker.g:101:3: ^( COLUMN identifier ( table_name )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            COLUMN18=(CommonTree)match(input,COLUMN,FOLLOW_COLUMN_in_column_spec186); 
            COLUMN18_tree = (CommonTree)adaptor.dupNode(COLUMN18);

            root_1 = (CommonTree)adaptor.becomeRoot(COLUMN18_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_column_spec188);
            identifier19=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier19.getTree());
            // OracleWalker.g:101:23: ( table_name )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // OracleWalker.g:101:23: table_name
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_table_name_in_column_spec190);
                    table_name20=table_name();

                    state._fsp--;

                    adaptor.addChild(root_1, table_name20.getTree());

                    }
                    break;

            }


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		ins.addColumnTandC((table_name20!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(table_name20.start),
              input.getTreeAdaptor().getTokenStopIndex(table_name20.start))):null),(identifier19!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(identifier19.start),
              input.getTreeAdaptor().getTokenStopIndex(identifier19.start))):null));
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "column_spec"

    public static class whereClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whereClause"
    // OracleWalker.g:109:1: whereClause[WhereCondition where] : ^( WHERE sqlCondition[$where] ) ;
    public final OracleWalker.whereClause_return whereClause(WhereCondition where) throws RecognitionException {
        OracleWalker.whereClause_return retval = new OracleWalker.whereClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree WHERE21=null;
        OracleWalker.sqlCondition_return sqlCondition22 = null;


        CommonTree WHERE21_tree=null;

        try {
            // OracleWalker.g:110:2: ( ^( WHERE sqlCondition[$where] ) )
            // OracleWalker.g:110:3: ^( WHERE sqlCondition[$where] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            WHERE21=(CommonTree)match(input,WHERE,FOLLOW_WHERE_in_whereClause209); 
            WHERE21_tree = (CommonTree)adaptor.dupNode(WHERE21);

            root_1 = (CommonTree)adaptor.becomeRoot(WHERE21_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_sqlCondition_in_whereClause211);
            sqlCondition22=sqlCondition(where);

            state._fsp--;

            adaptor.addChild(root_1, sqlCondition22.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whereClause"

    public static class groupByClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "groupByClause"
    // OracleWalker.g:113:1: groupByClause[WhereCondition where] : ^( GROUPBY columnNamesAfterWhere ) ;
    public final OracleWalker.groupByClause_return groupByClause(WhereCondition where) throws RecognitionException {
        OracleWalker.groupByClause_return retval = new OracleWalker.groupByClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GROUPBY23=null;
        OracleWalker.columnNamesAfterWhere_return columnNamesAfterWhere24 = null;


        CommonTree GROUPBY23_tree=null;

        try {
            // OracleWalker.g:114:2: ( ^( GROUPBY columnNamesAfterWhere ) )
            // OracleWalker.g:114:3: ^( GROUPBY columnNamesAfterWhere )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            GROUPBY23=(CommonTree)match(input,GROUPBY,FOLLOW_GROUPBY_in_groupByClause226); 
            GROUPBY23_tree = (CommonTree)adaptor.dupNode(GROUPBY23);

            root_1 = (CommonTree)adaptor.becomeRoot(GROUPBY23_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_columnNamesAfterWhere_in_groupByClause228);
            columnNamesAfterWhere24=columnNamesAfterWhere();

            state._fsp--;

            adaptor.addChild(root_1, columnNamesAfterWhere24.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		where.setGroupByColumns((columnNamesAfterWhere24!=null?columnNamesAfterWhere24.ret:null));
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "groupByClause"

    public static class orderByClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orderByClause"
    // OracleWalker.g:118:1: orderByClause[WhereCondition where] : ^( ORDERBY columnNamesAfterWhere ) ;
    public final OracleWalker.orderByClause_return orderByClause(WhereCondition where) throws RecognitionException {
        OracleWalker.orderByClause_return retval = new OracleWalker.orderByClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ORDERBY25=null;
        OracleWalker.columnNamesAfterWhere_return columnNamesAfterWhere26 = null;


        CommonTree ORDERBY25_tree=null;

        try {
            // OracleWalker.g:119:2: ( ^( ORDERBY columnNamesAfterWhere ) )
            // OracleWalker.g:119:3: ^( ORDERBY columnNamesAfterWhere )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ORDERBY25=(CommonTree)match(input,ORDERBY,FOLLOW_ORDERBY_in_orderByClause241); 
            ORDERBY25_tree = (CommonTree)adaptor.dupNode(ORDERBY25);

            root_1 = (CommonTree)adaptor.becomeRoot(ORDERBY25_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_columnNamesAfterWhere_in_orderByClause243);
            columnNamesAfterWhere26=columnNamesAfterWhere();

            state._fsp--;

            adaptor.addChild(root_1, columnNamesAfterWhere26.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		where.setOrderByColumns((columnNamesAfterWhere26!=null?columnNamesAfterWhere26.ret:null));
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "orderByClause"

    public static class columnNamesAfterWhere_return extends TreeRuleReturnScope {
        public List<OrderByEle> ret;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnNamesAfterWhere"
    // OracleWalker.g:123:1: columnNamesAfterWhere returns [List<OrderByEle> ret] : ( columnNameAfterWhere[$ret] )+ ;
    public final OracleWalker.columnNamesAfterWhere_return columnNamesAfterWhere() throws RecognitionException {
        OracleWalker.columnNamesAfterWhere_return retval = new OracleWalker.columnNamesAfterWhere_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.columnNameAfterWhere_return columnNameAfterWhere27 = null;




        	retval.ret = new ArrayList<OrderByEle>();

        try {
            // OracleWalker.g:127:2: ( ( columnNameAfterWhere[$ret] )+ )
            // OracleWalker.g:127:3: ( columnNameAfterWhere[$ret] )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // OracleWalker.g:127:3: ( columnNameAfterWhere[$ret] )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=ASC && LA7_0<=DESC)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // OracleWalker.g:127:4: columnNameAfterWhere[$ret]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_columnNameAfterWhere_in_columnNamesAfterWhere262);
            	    columnNameAfterWhere27=columnNameAfterWhere(retval.ret);

            	    state._fsp--;

            	    adaptor.addChild(root_0, columnNameAfterWhere27.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnNamesAfterWhere"

    public static class columnNameAfterWhere_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnNameAfterWhere"
    // OracleWalker.g:129:1: columnNameAfterWhere[List<OrderByEle> orderByEles] : ( ^( ASC identifier ( table_alias )? ) | ^( DESC identifier ( table_alias )? ) );
    public final OracleWalker.columnNameAfterWhere_return columnNameAfterWhere(List<OrderByEle> orderByEles) throws RecognitionException {
        OracleWalker.columnNameAfterWhere_return retval = new OracleWalker.columnNameAfterWhere_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASC28=null;
        CommonTree DESC31=null;
        OracleWalker.identifier_return identifier29 = null;

        OracleWalker.table_alias_return table_alias30 = null;

        OracleWalker.identifier_return identifier32 = null;

        OracleWalker.table_alias_return table_alias33 = null;


        CommonTree ASC28_tree=null;
        CommonTree DESC31_tree=null;

        try {
            // OracleWalker.g:130:2: ( ^( ASC identifier ( table_alias )? ) | ^( DESC identifier ( table_alias )? ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ASC) ) {
                alt10=1;
            }
            else if ( (LA10_0==DESC) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // OracleWalker.g:130:3: ^( ASC identifier ( table_alias )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ASC28=(CommonTree)match(input,ASC,FOLLOW_ASC_in_columnNameAfterWhere276); 
                    ASC28_tree = (CommonTree)adaptor.dupNode(ASC28);

                    root_1 = (CommonTree)adaptor.becomeRoot(ASC28_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_columnNameAfterWhere279);
                    identifier29=identifier();

                    state._fsp--;

                    adaptor.addChild(root_1, identifier29.getTree());
                    // OracleWalker.g:130:21: ( table_alias )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==COL_TAB) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // OracleWalker.g:130:21: table_alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_table_alias_in_columnNameAfterWhere281);
                            table_alias30=table_alias();

                            state._fsp--;

                            adaptor.addChild(root_1, table_alias30.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		orderByEles.add(new OrderByEle((table_alias30!=null?table_alias30.aText:null),(identifier29!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(identifier29.start),
                      input.getTreeAdaptor().getTokenStopIndex(identifier29.start))):null),true));
                    	

                    }
                    break;
                case 2 :
                    // OracleWalker.g:133:3: ^( DESC identifier ( table_alias )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DESC31=(CommonTree)match(input,DESC,FOLLOW_DESC_in_columnNameAfterWhere289); 
                    DESC31_tree = (CommonTree)adaptor.dupNode(DESC31);

                    root_1 = (CommonTree)adaptor.becomeRoot(DESC31_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_columnNameAfterWhere292);
                    identifier32=identifier();

                    state._fsp--;

                    adaptor.addChild(root_1, identifier32.getTree());
                    // OracleWalker.g:133:22: ( table_alias )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==COL_TAB) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // OracleWalker.g:133:22: table_alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_table_alias_in_columnNameAfterWhere294);
                            table_alias33=table_alias();

                            state._fsp--;

                            adaptor.addChild(root_1, table_alias33.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		orderByEles.add(new OrderByEle((table_alias33!=null?table_alias33.aText:null),(identifier32!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(identifier32.start),
                      input.getTreeAdaptor().getTokenStopIndex(identifier32.start))):null),false));
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnNameAfterWhere"

    public static class sqlCondition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlCondition"
    // OracleWalker.g:138:1: sqlCondition[WhereCondition where] : ( ^( CONDITION_OR_NOT condition[where.getHolder(),where.getExpGroup(),false] ) | ^( CONDITION_OR condition[where.getHolder(),where.getExpGroup(),false] ) );
    public final OracleWalker.sqlCondition_return sqlCondition(WhereCondition where) throws RecognitionException {
        OracleWalker.sqlCondition_return retval = new OracleWalker.sqlCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CONDITION_OR_NOT34=null;
        CommonTree CONDITION_OR36=null;
        OracleWalker.condition_return condition35 = null;

        OracleWalker.condition_return condition37 = null;


        CommonTree CONDITION_OR_NOT34_tree=null;
        CommonTree CONDITION_OR36_tree=null;

        try {
            // OracleWalker.g:140:2: ( ^( CONDITION_OR_NOT condition[where.getHolder(),where.getExpGroup(),false] ) | ^( CONDITION_OR condition[where.getHolder(),where.getExpGroup(),false] ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==CONDITION_OR_NOT) ) {
                alt11=1;
            }
            else if ( (LA11_0==CONDITION_OR) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // OracleWalker.g:140:3: ^( CONDITION_OR_NOT condition[where.getHolder(),where.getExpGroup(),false] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CONDITION_OR_NOT34=(CommonTree)match(input,CONDITION_OR_NOT,FOLLOW_CONDITION_OR_NOT_in_sqlCondition311); 
                    CONDITION_OR_NOT34_tree = (CommonTree)adaptor.dupNode(CONDITION_OR_NOT34);

                    root_1 = (CommonTree)adaptor.becomeRoot(CONDITION_OR_NOT34_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_sqlCondition313);
                    condition35=condition(where.getHolder(), where.getExpGroup(), false);

                    state._fsp--;

                    adaptor.addChild(root_1, condition35.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // OracleWalker.g:141:3: ^( CONDITION_OR condition[where.getHolder(),where.getExpGroup(),false] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CONDITION_OR36=(CommonTree)match(input,CONDITION_OR,FOLLOW_CONDITION_OR_in_sqlCondition320); 
                    CONDITION_OR36_tree = (CommonTree)adaptor.dupNode(CONDITION_OR36);

                    root_1 = (CommonTree)adaptor.becomeRoot(CONDITION_OR36_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_sqlCondition322);
                    condition37=condition(where.getHolder(), where.getExpGroup(), false);

                    state._fsp--;

                    adaptor.addChild(root_1, condition37.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sqlCondition"

    public static class condition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition"
    // OracleWalker.g:144:1: condition[BindIndexHolder where,ExpressionGroup eg,boolean isPriority] : ( ^( 'OR' (s1= condition[where,orExp,$isPriority] )+ ) | ^( 'AND' ( condition[where,andExp,$isPriority] )+ ) | condition_PAREN[where,$eg] | ^( PRIORITY condition[where,$eg,true] ) );
    public final OracleWalker.condition_return condition(BindIndexHolder where, ExpressionGroup eg, boolean isPriority) throws RecognitionException {
        OracleWalker.condition_return retval = new OracleWalker.condition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree string_literal38=null;
        CommonTree string_literal39=null;
        CommonTree PRIORITY42=null;
        OracleWalker.condition_return s1 = null;

        OracleWalker.condition_return condition40 = null;

        OracleWalker.condition_PAREN_return condition_PAREN41 = null;

        OracleWalker.condition_return condition43 = null;


        CommonTree string_literal38_tree=null;
        CommonTree string_literal39_tree=null;
        CommonTree PRIORITY42_tree=null;

        try {
            // OracleWalker.g:148:2: ( ^( 'OR' (s1= condition[where,orExp,$isPriority] )+ ) | ^( 'AND' ( condition[where,andExp,$isPriority] )+ ) | condition_PAREN[where,$eg] | ^( PRIORITY condition[where,$eg,true] ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt14=1;
                }
                break;
            case 92:
                {
                alt14=2;
                }
                break;
            case IN:
            case ISNOT:
            case IS:
            case LIKE:
            case NOT_LIKE:
            case EQ:
            case LTH:
            case GTH:
            case NOT_EQ:
            case LEQ:
            case GEQ:
                {
                alt14=3;
                }
                break;
            case PRIORITY:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // OracleWalker.g:149:2: ^( 'OR' (s1= condition[where,orExp,$isPriority] )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    		OrExpressionGroup orExp=new OrExpressionGroup();
                    		eg.addExpressionGroup(orExp);
                    	
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    string_literal38=(CommonTree)match(input,91,FOLLOW_91_in_condition343); 
                    string_literal38_tree = (CommonTree)adaptor.dupNode(string_literal38);

                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal38_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // OracleWalker.g:152:12: (s1= condition[where,orExp,$isPriority] )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==IN||(LA12_0>=ISNOT && LA12_0<=IS)||(LA12_0>=LIKE && LA12_0<=NOT_LIKE)||LA12_0==PRIORITY||LA12_0==EQ||(LA12_0>=LTH && LA12_0<=GEQ)||(LA12_0>=91 && LA12_0<=92)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // OracleWalker.g:152:12: s1= condition[where,orExp,$isPriority]
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_condition_in_condition347);
                    	    s1=condition(where, orExp, isPriority);

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, s1.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // OracleWalker.g:154:2: ^( 'AND' ( condition[where,andExp,$isPriority] )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    		ExpressionGroup andExp=new ExpressionGroup();
                    		eg.addExpressionGroup(andExp);
                    	
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    string_literal39=(CommonTree)match(input,92,FOLLOW_92_in_condition359); 
                    string_literal39_tree = (CommonTree)adaptor.dupNode(string_literal39);

                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal39_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // OracleWalker.g:157:11: ( condition[where,andExp,$isPriority] )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==IN||(LA13_0>=ISNOT && LA13_0<=IS)||(LA13_0>=LIKE && LA13_0<=NOT_LIKE)||LA13_0==PRIORITY||LA13_0==EQ||(LA13_0>=LTH && LA13_0<=GEQ)||(LA13_0>=91 && LA13_0<=92)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // OracleWalker.g:157:11: condition[where,andExp,$isPriority]
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_condition_in_condition361);
                    	    condition40=condition(where, andExp, isPriority);

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, condition40.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // OracleWalker.g:162:3: condition_PAREN[where,$eg]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_PAREN_in_condition372);
                    condition_PAREN41=condition_PAREN(where, eg);

                    state._fsp--;

                    adaptor.addChild(root_0, condition_PAREN41.getTree());

                    }
                    break;
                case 4 :
                    // OracleWalker.g:163:3: ^( PRIORITY condition[where,$eg,true] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PRIORITY42=(CommonTree)match(input,PRIORITY,FOLLOW_PRIORITY_in_condition378); 
                    PRIORITY42_tree = (CommonTree)adaptor.dupNode(PRIORITY42);

                    root_1 = (CommonTree)adaptor.becomeRoot(PRIORITY42_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_condition380);
                    condition43=condition(where, eg, true);

                    state._fsp--;

                    adaptor.addChild(root_1, condition43.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condition"

    public static class condition_PAREN_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition_PAREN"
    // OracleWalker.g:183:1: condition_PAREN[BindIndexHolder where,ExpressionGroup exp] : ( condition_expr[$where,$exp] )+ ;
    public final OracleWalker.condition_PAREN_return condition_PAREN(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        OracleWalker.condition_PAREN_return retval = new OracleWalker.condition_PAREN_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.condition_expr_return condition_expr44 = null;



        try {
            // OracleWalker.g:184:2: ( ( condition_expr[$where,$exp] )+ )
            // OracleWalker.g:184:3: ( condition_expr[$where,$exp] )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // OracleWalker.g:184:3: ( condition_expr[$where,$exp] )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // OracleWalker.g:184:3: condition_expr[$where,$exp]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_condition_expr_in_condition_PAREN395);
            	    condition_expr44=condition_expr(where, exp);

            	    state._fsp--;

            	    adaptor.addChild(root_0, condition_expr44.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condition_PAREN"

    public static class condition_expr_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition_expr"
    // OracleWalker.g:186:1: condition_expr[BindIndexHolder where,ExpressionGroup exp] : ( comparisonCondition[$where,$exp] | inCondition[$where,$exp] | isCondition[$where,$exp] | likeCondition[$where,$exp] );
    public final OracleWalker.condition_expr_return condition_expr(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        OracleWalker.condition_expr_return retval = new OracleWalker.condition_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.comparisonCondition_return comparisonCondition45 = null;

        OracleWalker.inCondition_return inCondition46 = null;

        OracleWalker.isCondition_return isCondition47 = null;

        OracleWalker.likeCondition_return likeCondition48 = null;



        try {
            // OracleWalker.g:187:2: ( comparisonCondition[$where,$exp] | inCondition[$where,$exp] | isCondition[$where,$exp] | likeCondition[$where,$exp] )
            int alt16=4;
            switch ( input.LA(1) ) {
            case EQ:
            case LTH:
            case GTH:
            case NOT_EQ:
            case LEQ:
            case GEQ:
                {
                alt16=1;
                }
                break;
            case IN:
                {
                alt16=2;
                }
                break;
            case ISNOT:
            case IS:
                {
                alt16=3;
                }
                break;
            case LIKE:
            case NOT_LIKE:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // OracleWalker.g:187:4: comparisonCondition[$where,$exp]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_comparisonCondition_in_condition_expr408);
                    comparisonCondition45=comparisonCondition(where, exp);

                    state._fsp--;

                    adaptor.addChild(root_0, comparisonCondition45.getTree());

                    }
                    break;
                case 2 :
                    // OracleWalker.g:188:4: inCondition[$where,$exp]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_inCondition_in_condition_expr414);
                    inCondition46=inCondition(where, exp);

                    state._fsp--;

                    adaptor.addChild(root_0, inCondition46.getTree());

                    }
                    break;
                case 3 :
                    // OracleWalker.g:189:4: isCondition[$where,$exp]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_isCondition_in_condition_expr421);
                    isCondition47=isCondition(where, exp);

                    state._fsp--;

                    adaptor.addChild(root_0, isCondition47.getTree());

                    }
                    break;
                case 4 :
                    // OracleWalker.g:190:4: likeCondition[$where,$exp]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_likeCondition_in_condition_expr428);
                    likeCondition48=likeCondition(where, exp);

                    state._fsp--;

                    adaptor.addChild(root_0, likeCondition48.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condition_expr"

    public static class betweenCondition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "betweenCondition"
    // OracleWalker.g:193:1: betweenCondition : ( ^( NOT_BETWEEN between_and ) | ^( BETWEEN between_and ) );
    public final OracleWalker.betweenCondition_return betweenCondition() throws RecognitionException {
        OracleWalker.betweenCondition_return retval = new OracleWalker.betweenCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NOT_BETWEEN49=null;
        CommonTree BETWEEN51=null;
        OracleWalker.between_and_return between_and50 = null;

        OracleWalker.between_and_return between_and52 = null;


        CommonTree NOT_BETWEEN49_tree=null;
        CommonTree BETWEEN51_tree=null;

        try {
            // OracleWalker.g:194:2: ( ^( NOT_BETWEEN between_and ) | ^( BETWEEN between_and ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==NOT_BETWEEN) ) {
                alt17=1;
            }
            else if ( (LA17_0==BETWEEN) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // OracleWalker.g:194:3: ^( NOT_BETWEEN between_and )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    NOT_BETWEEN49=(CommonTree)match(input,NOT_BETWEEN,FOLLOW_NOT_BETWEEN_in_betweenCondition440); 
                    NOT_BETWEEN49_tree = (CommonTree)adaptor.dupNode(NOT_BETWEEN49);

                    root_1 = (CommonTree)adaptor.becomeRoot(NOT_BETWEEN49_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_between_and_in_betweenCondition442);
                        between_and50=between_and();

                        state._fsp--;

                        adaptor.addChild(root_1, between_and50.getTree());

                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // OracleWalker.g:195:3: ^( BETWEEN between_and )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    BETWEEN51=(CommonTree)match(input,BETWEEN,FOLLOW_BETWEEN_in_betweenCondition448); 
                    BETWEEN51_tree = (CommonTree)adaptor.dupNode(BETWEEN51);

                    root_1 = (CommonTree)adaptor.becomeRoot(BETWEEN51_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_between_and_in_betweenCondition450);
                        between_and52=between_and();

                        state._fsp--;

                        adaptor.addChild(root_1, between_and52.getTree());

                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "betweenCondition"

    public static class between_and_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "between_and"
    // OracleWalker.g:197:1: between_and : ;
    public final OracleWalker.between_and_return between_and() throws RecognitionException {
        OracleWalker.between_and_return retval = new OracleWalker.between_and_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        try {
            // OracleWalker.g:198:2: ()
            // OracleWalker.g:199:2: 
            {
            root_0 = (CommonTree)adaptor.nil();

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "between_and"

    public static class likeCondition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "likeCondition"
    // OracleWalker.g:200:1: likeCondition[BindIndexHolder where,ExpressionGroup exp] : ( ^( NOT_LIKE expr[$where] left_cond[$where] ) | ^( LIKE expr[$where] left_cond[$where] ) );
    public final OracleWalker.likeCondition_return likeCondition(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        OracleWalker.likeCondition_return retval = new OracleWalker.likeCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NOT_LIKE53=null;
        CommonTree LIKE56=null;
        OracleWalker.expr_return expr54 = null;

        OracleWalker.left_cond_return left_cond55 = null;

        OracleWalker.expr_return expr57 = null;

        OracleWalker.left_cond_return left_cond58 = null;


        CommonTree NOT_LIKE53_tree=null;
        CommonTree LIKE56_tree=null;

        try {
            // OracleWalker.g:201:2: ( ^( NOT_LIKE expr[$where] left_cond[$where] ) | ^( LIKE expr[$where] left_cond[$where] ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==NOT_LIKE) ) {
                alt18=1;
            }
            else if ( (LA18_0==LIKE) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // OracleWalker.g:201:3: ^( NOT_LIKE expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    NOT_LIKE53=(CommonTree)match(input,NOT_LIKE,FOLLOW_NOT_LIKE_in_likeCondition471); 
                    NOT_LIKE53_tree = (CommonTree)adaptor.dupNode(NOT_LIKE53);

                    root_1 = (CommonTree)adaptor.becomeRoot(NOT_LIKE53_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_likeCondition473);
                    expr54=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr54.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_likeCondition476);
                    left_cond55=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond55.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    			NotLike notlike=new NotLike();
                    		notlike.setLeft((left_cond55!=null?left_cond55.ret:null));
                    		notlike.setRight((expr54!=null?expr54.valueObj:null));
                    		exp.addExpression(notlike);
                    	

                    }
                    break;
                case 2 :
                    // OracleWalker.g:207:3: ^( LIKE expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    LIKE56=(CommonTree)match(input,LIKE,FOLLOW_LIKE_in_likeCondition484); 
                    LIKE56_tree = (CommonTree)adaptor.dupNode(LIKE56);

                    root_1 = (CommonTree)adaptor.becomeRoot(LIKE56_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_likeCondition486);
                    expr57=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr57.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_likeCondition489);
                    left_cond58=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond58.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		Like like=new Like();
                    		like.setLeft((left_cond58!=null?left_cond58.ret:null));
                    		like.setRight((expr57!=null?expr57.valueObj:null));
                    		exp.addExpression(like);
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "likeCondition"

    public static class isCondition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "isCondition"
    // OracleWalker.g:215:1: isCondition[BindIndexHolder where,ExpressionGroup exp] : ( ^( ISNOT NULL left_cond[$where] ) | ^( IS NULL left_cond[$where] ) );
    public final OracleWalker.isCondition_return isCondition(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        OracleWalker.isCondition_return retval = new OracleWalker.isCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ISNOT59=null;
        CommonTree NULL60=null;
        CommonTree IS62=null;
        CommonTree NULL63=null;
        OracleWalker.left_cond_return left_cond61 = null;

        OracleWalker.left_cond_return left_cond64 = null;


        CommonTree ISNOT59_tree=null;
        CommonTree NULL60_tree=null;
        CommonTree IS62_tree=null;
        CommonTree NULL63_tree=null;

        try {
            // OracleWalker.g:216:2: ( ^( ISNOT NULL left_cond[$where] ) | ^( IS NULL left_cond[$where] ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ISNOT) ) {
                alt19=1;
            }
            else if ( (LA19_0==IS) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // OracleWalker.g:216:3: ^( ISNOT NULL left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ISNOT59=(CommonTree)match(input,ISNOT,FOLLOW_ISNOT_in_isCondition505); 
                    ISNOT59_tree = (CommonTree)adaptor.dupNode(ISNOT59);

                    root_1 = (CommonTree)adaptor.becomeRoot(ISNOT59_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    NULL60=(CommonTree)match(input,NULL,FOLLOW_NULL_in_isCondition507); 
                    NULL60_tree = (CommonTree)adaptor.dupNode(NULL60);

                    adaptor.addChild(root_1, NULL60_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_isCondition509);
                    left_cond61=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond61.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		IsNot arg=new IsNot();
                    		arg.setLeft((left_cond61!=null?left_cond61.ret:null));
                    		arg.setRight(null);
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 2 :
                    // OracleWalker.g:222:3: ^( IS NULL left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    IS62=(CommonTree)match(input,IS,FOLLOW_IS_in_isCondition517); 
                    IS62_tree = (CommonTree)adaptor.dupNode(IS62);

                    root_1 = (CommonTree)adaptor.becomeRoot(IS62_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    NULL63=(CommonTree)match(input,NULL,FOLLOW_NULL_in_isCondition519); 
                    NULL63_tree = (CommonTree)adaptor.dupNode(NULL63);

                    adaptor.addChild(root_1, NULL63_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_isCondition521);
                    left_cond64=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond64.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		Is arg=new Is();
                    		arg.setLeft((left_cond64!=null?left_cond64.ret:null));
                    		arg.setRight(null);
                    		exp.addExpression(arg);
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "isCondition"

    public static class comparisonCondition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comparisonCondition"
    // OracleWalker.g:231:1: comparisonCondition[BindIndexHolder where,ExpressionGroup exp] : ( ^( EQ expr[$where] left_cond[$where] ) | ^( NOT_EQ expr[$where] left_cond[$where] ) | ^( LTH expr[$where] left_cond[$where] ) | ^( GTH expr[$where] left_cond[$where] ) | ^( LEQ expr[$where] left_cond[$where] ) | ^( GEQ expr[$where] left_cond[$where] ) );
    public final OracleWalker.comparisonCondition_return comparisonCondition(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        OracleWalker.comparisonCondition_return retval = new OracleWalker.comparisonCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQ65=null;
        CommonTree NOT_EQ68=null;
        CommonTree LTH71=null;
        CommonTree GTH74=null;
        CommonTree LEQ77=null;
        CommonTree GEQ80=null;
        OracleWalker.expr_return expr66 = null;

        OracleWalker.left_cond_return left_cond67 = null;

        OracleWalker.expr_return expr69 = null;

        OracleWalker.left_cond_return left_cond70 = null;

        OracleWalker.expr_return expr72 = null;

        OracleWalker.left_cond_return left_cond73 = null;

        OracleWalker.expr_return expr75 = null;

        OracleWalker.left_cond_return left_cond76 = null;

        OracleWalker.expr_return expr78 = null;

        OracleWalker.left_cond_return left_cond79 = null;

        OracleWalker.expr_return expr81 = null;

        OracleWalker.left_cond_return left_cond82 = null;


        CommonTree EQ65_tree=null;
        CommonTree NOT_EQ68_tree=null;
        CommonTree LTH71_tree=null;
        CommonTree GTH74_tree=null;
        CommonTree LEQ77_tree=null;
        CommonTree GEQ80_tree=null;

        try {
            // OracleWalker.g:232:2: ( ^( EQ expr[$where] left_cond[$where] ) | ^( NOT_EQ expr[$where] left_cond[$where] ) | ^( LTH expr[$where] left_cond[$where] ) | ^( GTH expr[$where] left_cond[$where] ) | ^( LEQ expr[$where] left_cond[$where] ) | ^( GEQ expr[$where] left_cond[$where] ) )
            int alt20=6;
            switch ( input.LA(1) ) {
            case EQ:
                {
                alt20=1;
                }
                break;
            case NOT_EQ:
                {
                alt20=2;
                }
                break;
            case LTH:
                {
                alt20=3;
                }
                break;
            case GTH:
                {
                alt20=4;
                }
                break;
            case LEQ:
                {
                alt20=5;
                }
                break;
            case GEQ:
                {
                alt20=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // OracleWalker.g:232:3: ^( EQ expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EQ65=(CommonTree)match(input,EQ,FOLLOW_EQ_in_comparisonCondition538); 
                    EQ65_tree = (CommonTree)adaptor.dupNode(EQ65);

                    root_1 = (CommonTree)adaptor.becomeRoot(EQ65_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition540);
                    expr66=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr66.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition543);
                    left_cond67=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond67.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		Equivalent arg=new Equivalent();
                    		arg.setLeft((left_cond67!=null?left_cond67.ret:null));
                    		arg.setRight((expr66!=null?expr66.valueObj:null));
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 2 :
                    // OracleWalker.g:239:3: ^( NOT_EQ expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    NOT_EQ68=(CommonTree)match(input,NOT_EQ,FOLLOW_NOT_EQ_in_comparisonCondition553); 
                    NOT_EQ68_tree = (CommonTree)adaptor.dupNode(NOT_EQ68);

                    root_1 = (CommonTree)adaptor.becomeRoot(NOT_EQ68_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition555);
                    expr69=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr69.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition558);
                    left_cond70=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond70.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		NotEquivalent arg=new NotEquivalent();
                    		arg.setLeft((left_cond70!=null?left_cond70.ret:null));
                    		arg.setRight((expr69!=null?expr69.valueObj:null));
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 3 :
                    // OracleWalker.g:246:3: ^( LTH expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    LTH71=(CommonTree)match(input,LTH,FOLLOW_LTH_in_comparisonCondition568); 
                    LTH71_tree = (CommonTree)adaptor.dupNode(LTH71);

                    root_1 = (CommonTree)adaptor.becomeRoot(LTH71_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition570);
                    expr72=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr72.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition573);
                    left_cond73=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond73.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		LessThan arg=new LessThan();
                    		arg.setLeft((left_cond73!=null?left_cond73.ret:null));
                    		arg.setRight((expr72!=null?expr72.valueObj:null));
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 4 :
                    // OracleWalker.g:253:3: ^( GTH expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    GTH74=(CommonTree)match(input,GTH,FOLLOW_GTH_in_comparisonCondition583); 
                    GTH74_tree = (CommonTree)adaptor.dupNode(GTH74);

                    root_1 = (CommonTree)adaptor.becomeRoot(GTH74_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition585);
                    expr75=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr75.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition588);
                    left_cond76=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond76.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		GreaterThan arg=new GreaterThan();
                    		arg.setLeft((left_cond76!=null?left_cond76.ret:null));
                    		arg.setRight((expr75!=null?expr75.valueObj:null));
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 5 :
                    // OracleWalker.g:260:3: ^( LEQ expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    LEQ77=(CommonTree)match(input,LEQ,FOLLOW_LEQ_in_comparisonCondition598); 
                    LEQ77_tree = (CommonTree)adaptor.dupNode(LEQ77);

                    root_1 = (CommonTree)adaptor.becomeRoot(LEQ77_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition600);
                    expr78=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr78.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition603);
                    left_cond79=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond79.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		LessThanOrEquivalent arg=new LessThanOrEquivalent();
                    		arg.setLeft((left_cond79!=null?left_cond79.ret:null));
                    		arg.setRight((expr78!=null?expr78.valueObj:null));
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 6 :
                    // OracleWalker.g:267:3: ^( GEQ expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    GEQ80=(CommonTree)match(input,GEQ,FOLLOW_GEQ_in_comparisonCondition613); 
                    GEQ80_tree = (CommonTree)adaptor.dupNode(GEQ80);

                    root_1 = (CommonTree)adaptor.becomeRoot(GEQ80_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition615);
                    expr81=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr81.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition618);
                    left_cond82=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond82.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		GreaterThanOrEquivalent arg=new GreaterThanOrEquivalent();
                    		arg.setLeft((left_cond82!=null?left_cond82.ret:null));
                    		arg.setRight((expr81!=null?expr81.valueObj:null));
                    		exp.addExpression(arg);
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comparisonCondition"

    public static class left_cond_return extends TreeRuleReturnScope {
        public Object ret;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "left_cond"
    // OracleWalker.g:276:1: left_cond[BindIndexHolder where] returns [Object ret] : ^( CONDITION_LEFT expr[$where] ) ;
    public final OracleWalker.left_cond_return left_cond(BindIndexHolder where) throws RecognitionException {
        OracleWalker.left_cond_return retval = new OracleWalker.left_cond_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CONDITION_LEFT83=null;
        OracleWalker.expr_return expr84 = null;


        CommonTree CONDITION_LEFT83_tree=null;

        try {
            // OracleWalker.g:278:2: ( ^( CONDITION_LEFT expr[$where] ) )
            // OracleWalker.g:278:3: ^( CONDITION_LEFT expr[$where] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            CONDITION_LEFT83=(CommonTree)match(input,CONDITION_LEFT,FOLLOW_CONDITION_LEFT_in_left_cond639); 
            CONDITION_LEFT83_tree = (CommonTree)adaptor.dupNode(CONDITION_LEFT83);

            root_1 = (CommonTree)adaptor.becomeRoot(CONDITION_LEFT83_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_left_cond641);
            expr84=expr(where);

            state._fsp--;

            adaptor.addChild(root_1, expr84.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		retval.ret =(expr84!=null?expr84.valueObj:null);
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "left_cond"

    public static class in_list_return extends TreeRuleReturnScope {
        public List list;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "in_list"
    // OracleWalker.g:283:1: in_list[BindIndexHolder where] returns [List list] : ^( IN_LISTS inCondition_expr_adds[$where] ) ;
    public final OracleWalker.in_list_return in_list(BindIndexHolder where) throws RecognitionException {
        OracleWalker.in_list_return retval = new OracleWalker.in_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IN_LISTS85=null;
        OracleWalker.inCondition_expr_adds_return inCondition_expr_adds86 = null;


        CommonTree IN_LISTS85_tree=null;

        try {
            // OracleWalker.g:284:2: ( ^( IN_LISTS inCondition_expr_adds[$where] ) )
            // OracleWalker.g:284:3: ^( IN_LISTS inCondition_expr_adds[$where] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            IN_LISTS85=(CommonTree)match(input,IN_LISTS,FOLLOW_IN_LISTS_in_in_list660); 
            IN_LISTS85_tree = (CommonTree)adaptor.dupNode(IN_LISTS85);

            root_1 = (CommonTree)adaptor.becomeRoot(IN_LISTS85_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_inCondition_expr_adds_in_in_list662);
            inCondition_expr_adds86=inCondition_expr_adds(where);

            state._fsp--;

            adaptor.addChild(root_1, inCondition_expr_adds86.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		retval.list =(inCondition_expr_adds86!=null?inCondition_expr_adds86.list:null);
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "in_list"

    public static class inCondition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inCondition"
    // OracleWalker.g:289:1: inCondition[BindIndexHolder where,ExpressionGroup exp] : ^( IN (not= 'NOT' )? ( subquery[$where] )? ( in_list[$where] )? left_cond[$where] ) ;
    public final OracleWalker.inCondition_return inCondition(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        OracleWalker.inCondition_return retval = new OracleWalker.inCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree not=null;
        CommonTree IN87=null;
        OracleWalker.subquery_return subquery88 = null;

        OracleWalker.in_list_return in_list89 = null;

        OracleWalker.left_cond_return left_cond90 = null;


        CommonTree not_tree=null;
        CommonTree IN87_tree=null;

        try {
            // OracleWalker.g:290:2: ( ^( IN (not= 'NOT' )? ( subquery[$where] )? ( in_list[$where] )? left_cond[$where] ) )
            // OracleWalker.g:290:3: ^( IN (not= 'NOT' )? ( subquery[$where] )? ( in_list[$where] )? left_cond[$where] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            IN87=(CommonTree)match(input,IN,FOLLOW_IN_in_inCondition680); 
            IN87_tree = (CommonTree)adaptor.dupNode(IN87);

            root_1 = (CommonTree)adaptor.becomeRoot(IN87_tree, root_1);



            match(input, Token.DOWN, null); 
            // OracleWalker.g:290:11: (not= 'NOT' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==90) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // OracleWalker.g:290:11: not= 'NOT'
                    {
                    _last = (CommonTree)input.LT(1);
                    not=(CommonTree)match(input,90,FOLLOW_90_in_inCondition684); 
                    not_tree = (CommonTree)adaptor.dupNode(not);

                    adaptor.addChild(root_1, not_tree);


                    }
                    break;

            }

            // OracleWalker.g:290:19: ( subquery[$where] )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==SUBQUERY) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // OracleWalker.g:290:19: subquery[$where]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_subquery_in_inCondition687);
                    subquery88=subquery(where);

                    state._fsp--;

                    adaptor.addChild(root_1, subquery88.getTree());

                    }
                    break;

            }

            // OracleWalker.g:290:37: ( in_list[$where] )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==IN_LISTS) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // OracleWalker.g:290:37: in_list[$where]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_in_list_in_inCondition691);
                    in_list89=in_list(where);

                    state._fsp--;

                    adaptor.addChild(root_1, in_list89.getTree());

                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_left_cond_in_inCondition696);
            left_cond90=left_cond(where);

            state._fsp--;

            adaptor.addChild(root_1, left_cond90.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		if((not!=null?not.getText():null)!=null){
            			if((subquery88!=null?subquery88.subselect:null)!=null){
            				NotInExpression arg=new NotInExpression();
            				arg.setLeft((left_cond90!=null?left_cond90.ret:null));
            				arg.setRight((subquery88!=null?subquery88.subselect:null));
            				exp.addExpression(arg);
            			}
            			else if((in_list89!=null?in_list89.list:null)!=null){
            					NotInExpression arg=new NotInExpression();
            					arg.setLeft((left_cond90!=null?left_cond90.ret:null));
            					arg.setRight((in_list89!=null?in_list89.list:null));
            					exp.addExpression(arg);
            			}
            		}else{
            			if((subquery88!=null?subquery88.subselect:null)!=null){
            				InExpression arg=new InExpression();
            				arg.setLeft((left_cond90!=null?left_cond90.ret:null));
            				arg.setRight((subquery88!=null?subquery88.subselect:null));
            				exp.addExpression(arg);}
            			else if((in_list89!=null?in_list89.list:null)!=null){
            					InExpression arg=new InExpression();
            					arg.setLeft((left_cond90!=null?left_cond90.ret:null));
            					arg.setRight((in_list89!=null?in_list89.list:null));
            					exp.addExpression(arg);
            			}
            		}
            		;
            		

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "inCondition"

    public static class inCondition_expr_adds_return extends TreeRuleReturnScope {
        public List list;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inCondition_expr_adds"
    // OracleWalker.g:326:1: inCondition_expr_adds[BindIndexHolder where] returns [List list] : ( expr_add[$where] )+ ;
    public final OracleWalker.inCondition_expr_adds_return inCondition_expr_adds(BindIndexHolder where) throws RecognitionException {
        OracleWalker.inCondition_expr_adds_return retval = new OracleWalker.inCondition_expr_adds_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.expr_add_return expr_add91 = null;



        retval.list =new ArrayList();
        try {
            // OracleWalker.g:327:31: ( ( expr_add[$where] )+ )
            // OracleWalker.g:328:2: ( expr_add[$where] )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // OracleWalker.g:328:2: ( expr_add[$where] )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==COLUMN||LA24_0==QUTED_STR||LA24_0==COLUMNAST||LA24_0==CONSIST||(LA24_0>=CAST && LA24_0<=MULTI_STR)||(LA24_0>=ID && LA24_0<=DIVIDE)||(LA24_0>=N && LA24_0<=NUMBER)||LA24_0==97||LA24_0==100||(LA24_0>=104 && LA24_0<=105)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // OracleWalker.g:328:3: expr_add[$where]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expr_add_in_inCondition_expr_adds730);
            	    expr_add91=expr_add(where);

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr_add91.getTree());

            	    		retval.list.add((expr_add91!=null?expr_add91.valueObjExpr:null));
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "inCondition_expr_adds"

    public static class expr_return extends TreeRuleReturnScope {
        public Object valueObj;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // OracleWalker.g:335:1: expr[BindIndexHolder where] returns [Object valueObj] : ( expr_add[$where] | subquery[$where] ) ;
    public final OracleWalker.expr_return expr(BindIndexHolder where) throws RecognitionException {
        OracleWalker.expr_return retval = new OracleWalker.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.expr_add_return expr_add92 = null;

        OracleWalker.subquery_return subquery93 = null;



        try {
            // OracleWalker.g:336:2: ( ( expr_add[$where] | subquery[$where] ) )
            // OracleWalker.g:336:3: ( expr_add[$where] | subquery[$where] )
            {
            root_0 = (CommonTree)adaptor.nil();

            // OracleWalker.g:336:3: ( expr_add[$where] | subquery[$where] )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==COLUMN||LA25_0==QUTED_STR||LA25_0==COLUMNAST||LA25_0==CONSIST||(LA25_0>=CAST && LA25_0<=MULTI_STR)||(LA25_0>=ID && LA25_0<=DIVIDE)||(LA25_0>=N && LA25_0<=NUMBER)||LA25_0==97||LA25_0==100||(LA25_0>=104 && LA25_0<=105)) ) {
                alt25=1;
            }
            else if ( (LA25_0==SUBQUERY) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // OracleWalker.g:336:4: expr_add[$where]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr755);
                    expr_add92=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_0, expr_add92.getTree());
                    retval.valueObj =(expr_add92!=null?expr_add92.valueObjExpr:null);

                    }
                    break;
                case 2 :
                    // OracleWalker.g:337:3: subquery[$where]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_subquery_in_expr762);
                    subquery93=subquery(where);

                    state._fsp--;

                    adaptor.addChild(root_0, subquery93.getTree());
                    retval.valueObj =(subquery93!=null?subquery93.subselect:null);

                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class expr_add_return extends TreeRuleReturnScope {
        public Object valueObjExpr;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_add"
    // OracleWalker.g:341:1: expr_add[BindIndexHolder where] returns [Object valueObjExpr] : ( ^( NEGATIVE s1= expr_add[$where] ) | ^( POSITIVE s1= expr_add[$where] ) | ^( PLUS s1= expr_add[$where] s2= expr_add[$where] ) | ^( MINUS s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITOR s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITAND s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITXOR s1= expr_add[$where] s2= expr_add[$where] ) | ^( SHIFTLEFT s1= expr_add[$where] s2= expr_add[$where] ) | ^( SHIFTRIGHT s1= expr_add[$where] s2= expr_add[$where] ) | ^( ASTERISK s1= expr_add[$where] s2= expr_add[$where] ) | ^( DIVIDE s1= expr_add[$where] s2= expr_add[$where] ) | N | NUMBER | boolean_literal | 'NULL' | '?' | ^( QUTED_STR quoted_string ) | ^( COLUMN identifier ( table_name )? ) | ^( COLUMNAST ASTERISK ) | ^( ID ( expr[$where] )* ) | ^( CONSIST ID ) | ^( CAST ( expr[$where] )* ID ) | ^( MULTI_STR ( expr[$where] )* ) );
    public final OracleWalker.expr_add_return expr_add(BindIndexHolder where) throws RecognitionException {
        OracleWalker.expr_add_return retval = new OracleWalker.expr_add_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NEGATIVE94=null;
        CommonTree POSITIVE95=null;
        CommonTree PLUS96=null;
        CommonTree MINUS97=null;
        CommonTree BITOR98=null;
        CommonTree BITAND99=null;
        CommonTree BITXOR100=null;
        CommonTree SHIFTLEFT101=null;
        CommonTree SHIFTRIGHT102=null;
        CommonTree ASTERISK103=null;
        CommonTree DIVIDE104=null;
        CommonTree N105=null;
        CommonTree NUMBER106=null;
        CommonTree string_literal108=null;
        CommonTree char_literal109=null;
        CommonTree QUTED_STR110=null;
        CommonTree COLUMN112=null;
        CommonTree COLUMNAST115=null;
        CommonTree ASTERISK116=null;
        CommonTree ID117=null;
        CommonTree CONSIST119=null;
        CommonTree ID120=null;
        CommonTree CAST121=null;
        CommonTree ID123=null;
        CommonTree MULTI_STR124=null;
        OracleWalker.expr_add_return s1 = null;

        OracleWalker.expr_add_return s2 = null;

        OracleWalker.boolean_literal_return boolean_literal107 = null;

        OracleWalker.quoted_string_return quoted_string111 = null;

        OracleWalker.identifier_return identifier113 = null;

        OracleWalker.table_name_return table_name114 = null;

        OracleWalker.expr_return expr118 = null;

        OracleWalker.expr_return expr122 = null;

        OracleWalker.expr_return expr125 = null;


        CommonTree NEGATIVE94_tree=null;
        CommonTree POSITIVE95_tree=null;
        CommonTree PLUS96_tree=null;
        CommonTree MINUS97_tree=null;
        CommonTree BITOR98_tree=null;
        CommonTree BITAND99_tree=null;
        CommonTree BITXOR100_tree=null;
        CommonTree SHIFTLEFT101_tree=null;
        CommonTree SHIFTRIGHT102_tree=null;
        CommonTree ASTERISK103_tree=null;
        CommonTree DIVIDE104_tree=null;
        CommonTree N105_tree=null;
        CommonTree NUMBER106_tree=null;
        CommonTree string_literal108_tree=null;
        CommonTree char_literal109_tree=null;
        CommonTree QUTED_STR110_tree=null;
        CommonTree COLUMN112_tree=null;
        CommonTree COLUMNAST115_tree=null;
        CommonTree ASTERISK116_tree=null;
        CommonTree ID117_tree=null;
        CommonTree CONSIST119_tree=null;
        CommonTree ID120_tree=null;
        CommonTree CAST121_tree=null;
        CommonTree ID123_tree=null;
        CommonTree MULTI_STR124_tree=null;


        List<Object> list=new ArrayList<Object>();

        try {
            // OracleWalker.g:345:2: ( ^( NEGATIVE s1= expr_add[$where] ) | ^( POSITIVE s1= expr_add[$where] ) | ^( PLUS s1= expr_add[$where] s2= expr_add[$where] ) | ^( MINUS s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITOR s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITAND s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITXOR s1= expr_add[$where] s2= expr_add[$where] ) | ^( SHIFTLEFT s1= expr_add[$where] s2= expr_add[$where] ) | ^( SHIFTRIGHT s1= expr_add[$where] s2= expr_add[$where] ) | ^( ASTERISK s1= expr_add[$where] s2= expr_add[$where] ) | ^( DIVIDE s1= expr_add[$where] s2= expr_add[$where] ) | N | NUMBER | boolean_literal | 'NULL' | '?' | ^( QUTED_STR quoted_string ) | ^( COLUMN identifier ( table_name )? ) | ^( COLUMNAST ASTERISK ) | ^( ID ( expr[$where] )* ) | ^( CONSIST ID ) | ^( CAST ( expr[$where] )* ID ) | ^( MULTI_STR ( expr[$where] )* ) )
            int alt30=23;
            switch ( input.LA(1) ) {
            case NEGATIVE:
                {
                alt30=1;
                }
                break;
            case POSITIVE:
                {
                alt30=2;
                }
                break;
            case PLUS:
                {
                alt30=3;
                }
                break;
            case MINUS:
                {
                alt30=4;
                }
                break;
            case BITOR:
                {
                alt30=5;
                }
                break;
            case BITAND:
                {
                alt30=6;
                }
                break;
            case BITXOR:
                {
                alt30=7;
                }
                break;
            case SHIFTLEFT:
                {
                alt30=8;
                }
                break;
            case SHIFTRIGHT:
                {
                alt30=9;
                }
                break;
            case ASTERISK:
                {
                alt30=10;
                }
                break;
            case DIVIDE:
                {
                alt30=11;
                }
                break;
            case N:
                {
                alt30=12;
                }
                break;
            case NUMBER:
                {
                alt30=13;
                }
                break;
            case 104:
            case 105:
                {
                alt30=14;
                }
                break;
            case 97:
                {
                alt30=15;
                }
                break;
            case 100:
                {
                alt30=16;
                }
                break;
            case QUTED_STR:
                {
                alt30=17;
                }
                break;
            case COLUMN:
                {
                alt30=18;
                }
                break;
            case COLUMNAST:
                {
                alt30=19;
                }
                break;
            case ID:
                {
                alt30=20;
                }
                break;
            case CONSIST:
                {
                alt30=21;
                }
                break;
            case CAST:
                {
                alt30=22;
                }
                break;
            case MULTI_STR:
                {
                alt30=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // OracleWalker.g:345:3: ^( NEGATIVE s1= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    NEGATIVE94=(CommonTree)match(input,NEGATIVE,FOLLOW_NEGATIVE_in_expr_add790); 
                    NEGATIVE94_tree = (CommonTree)adaptor.dupNode(NEGATIVE94);

                    root_1 = (CommonTree)adaptor.becomeRoot(NEGATIVE94_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add794);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	retval.valueObjExpr =((BigDecimal)(s1!=null?s1.valueObjExpr:null)).negate();
                    	

                    }
                    break;
                case 2 :
                    // OracleWalker.g:348:3: ^( POSITIVE s1= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    POSITIVE95=(CommonTree)match(input,POSITIVE,FOLLOW_POSITIVE_in_expr_add803); 
                    POSITIVE95_tree = (CommonTree)adaptor.dupNode(POSITIVE95);

                    root_1 = (CommonTree)adaptor.becomeRoot(POSITIVE95_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add807);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	retval.valueObjExpr =(s1!=null?s1.valueObjExpr:null);
                    	

                    }
                    break;
                case 3 :
                    // OracleWalker.g:351:3: ^( PLUS s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PLUS96=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expr_add816); 
                    PLUS96_tree = (CommonTree)adaptor.dupNode(PLUS96);

                    root_1 = (CommonTree)adaptor.becomeRoot(PLUS96_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add820);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add825);
                    s2=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	Function func=new Add();
                    	list.add((s1!=null?s1.valueObjExpr:null));
                    	list.add((s2!=null?s2.valueObjExpr:null));
                    	func.setValue(list);
                    	retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 4 :
                    // OracleWalker.g:358:3: ^( MINUS s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MINUS97=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expr_add834); 
                    MINUS97_tree = (CommonTree)adaptor.dupNode(MINUS97);

                    root_1 = (CommonTree)adaptor.becomeRoot(MINUS97_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add838);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add843);
                    s2=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		Function func=new Subtract();
                    	list.add((s1!=null?s1.valueObjExpr:null));
                    	list.add((s2!=null?s2.valueObjExpr:null));
                    	func.setValue(list);
                    	retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 5 :
                    // OracleWalker.g:365:3: ^( BITOR s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    BITOR98=(CommonTree)match(input,BITOR,FOLLOW_BITOR_in_expr_add851); 
                    BITOR98_tree = (CommonTree)adaptor.dupNode(BITOR98);

                    root_1 = (CommonTree)adaptor.becomeRoot(BITOR98_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add855);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add860);
                    s2=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		Function func=new BitOr();
                    	list.add((s1!=null?s1.valueObjExpr:null));
                    	list.add((s2!=null?s2.valueObjExpr:null));
                    	func.setValue(list);
                    	retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 6 :
                    // OracleWalker.g:372:3: ^( BITAND s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    BITAND99=(CommonTree)match(input,BITAND,FOLLOW_BITAND_in_expr_add868); 
                    BITAND99_tree = (CommonTree)adaptor.dupNode(BITAND99);

                    root_1 = (CommonTree)adaptor.becomeRoot(BITAND99_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add872);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add877);
                    s2=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		Function func=new BitAnd();
                    	list.add((s1!=null?s1.valueObjExpr:null));
                    	list.add((s2!=null?s2.valueObjExpr:null));
                    	func.setValue(list);
                    	retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 7 :
                    // OracleWalker.g:379:3: ^( BITXOR s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    BITXOR100=(CommonTree)match(input,BITXOR,FOLLOW_BITXOR_in_expr_add885); 
                    BITXOR100_tree = (CommonTree)adaptor.dupNode(BITXOR100);

                    root_1 = (CommonTree)adaptor.becomeRoot(BITXOR100_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add889);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add894);
                    s2=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	Function func=new BitXOr();
                    	list.add((s1!=null?s1.valueObjExpr:null));
                    	list.add((s2!=null?s2.valueObjExpr:null));
                    	func.setValue(list);
                    	retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 8 :
                    // OracleWalker.g:386:3: ^( SHIFTLEFT s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SHIFTLEFT101=(CommonTree)match(input,SHIFTLEFT,FOLLOW_SHIFTLEFT_in_expr_add902); 
                    SHIFTLEFT101_tree = (CommonTree)adaptor.dupNode(SHIFTLEFT101);

                    root_1 = (CommonTree)adaptor.becomeRoot(SHIFTLEFT101_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add906);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add911);
                    s2=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	Function func=new ShiftLeft();
                    	list.add((s1!=null?s1.valueObjExpr:null));
                    	list.add((s2!=null?s2.valueObjExpr:null));
                    	func.setValue(list);
                    	retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 9 :
                    // OracleWalker.g:393:3: ^( SHIFTRIGHT s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SHIFTRIGHT102=(CommonTree)match(input,SHIFTRIGHT,FOLLOW_SHIFTRIGHT_in_expr_add919); 
                    SHIFTRIGHT102_tree = (CommonTree)adaptor.dupNode(SHIFTRIGHT102);

                    root_1 = (CommonTree)adaptor.becomeRoot(SHIFTRIGHT102_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add923);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add928);
                    s2=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	Function func=new ShiftRight();
                    	list.add((s1!=null?s1.valueObjExpr:null));
                    	list.add((s2!=null?s2.valueObjExpr:null));
                    	func.setValue(list);
                    	retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 10 :
                    // OracleWalker.g:400:3: ^( ASTERISK s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ASTERISK103=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_expr_add936); 
                    ASTERISK103_tree = (CommonTree)adaptor.dupNode(ASTERISK103);

                    root_1 = (CommonTree)adaptor.becomeRoot(ASTERISK103_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add940);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add945);
                    s2=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	Function func=new Multiply();
                    	list.add((s1!=null?s1.valueObjExpr:null));
                    	list.add((s2!=null?s2.valueObjExpr:null));
                    	func.setValue(list);
                    	retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 11 :
                    // OracleWalker.g:407:3: ^( DIVIDE s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DIVIDE104=(CommonTree)match(input,DIVIDE,FOLLOW_DIVIDE_in_expr_add953); 
                    DIVIDE104_tree = (CommonTree)adaptor.dupNode(DIVIDE104);

                    root_1 = (CommonTree)adaptor.becomeRoot(DIVIDE104_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add957);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add962);
                    s2=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	Function func=new Divide();
                    	list.add((s1!=null?s1.valueObjExpr:null));
                    	list.add((s2!=null?s2.valueObjExpr:null));
                    	func.setValue(list);
                    	retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 12 :
                    // OracleWalker.g:414:3: N
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    N105=(CommonTree)match(input,N,FOLLOW_N_in_expr_add969); 
                    N105_tree = (CommonTree)adaptor.dupNode(N105);

                    adaptor.addChild(root_0, N105_tree);

                    retval.valueObjExpr =new BigDecimal((N105!=null?N105.getText():null));

                    }
                    break;
                case 13 :
                    // OracleWalker.g:415:3: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    NUMBER106=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_expr_add975); 
                    NUMBER106_tree = (CommonTree)adaptor.dupNode(NUMBER106);

                    adaptor.addChild(root_0, NUMBER106_tree);

                    retval.valueObjExpr =new BigDecimal((NUMBER106!=null?NUMBER106.getText():null));

                    }
                    break;
                case 14 :
                    // OracleWalker.g:416:3: boolean_literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_boolean_literal_in_expr_add980);
                    boolean_literal107=boolean_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_literal107.getTree());

                    }
                    break;
                case 15 :
                    // OracleWalker.g:417:3: 'NULL'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    string_literal108=(CommonTree)match(input,97,FOLLOW_97_in_expr_add984); 
                    string_literal108_tree = (CommonTree)adaptor.dupNode(string_literal108);

                    adaptor.addChild(root_0, string_literal108_tree);

                    retval.valueObjExpr =null;

                    }
                    break;
                case 16 :
                    // OracleWalker.g:418:3: '?'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    char_literal109=(CommonTree)match(input,100,FOLLOW_100_in_expr_add990); 
                    char_literal109_tree = (CommonTree)adaptor.dupNode(char_literal109);

                    adaptor.addChild(root_0, char_literal109_tree);


                    	BindVar val=new BindVar(where.selfAddAndGet());
                    	retval.valueObjExpr =val;
                    	

                    }
                    break;
                case 17 :
                    // OracleWalker.g:422:3: ^( QUTED_STR quoted_string )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    QUTED_STR110=(CommonTree)match(input,QUTED_STR,FOLLOW_QUTED_STR_in_expr_add996); 
                    QUTED_STR110_tree = (CommonTree)adaptor.dupNode(QUTED_STR110);

                    root_1 = (CommonTree)adaptor.becomeRoot(QUTED_STR110_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_quoted_string_in_expr_add998);
                    quoted_string111=quoted_string();

                    state._fsp--;

                    adaptor.addChild(root_1, quoted_string111.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    retval.valueObjExpr =(quoted_string111!=null?quoted_string111.aText:null);

                    }
                    break;
                case 18 :
                    // OracleWalker.g:423:3: ^( COLUMN identifier ( table_name )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    COLUMN112=(CommonTree)match(input,COLUMN,FOLLOW_COLUMN_in_expr_add1005); 
                    COLUMN112_tree = (CommonTree)adaptor.dupNode(COLUMN112);

                    root_1 = (CommonTree)adaptor.becomeRoot(COLUMN112_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_expr_add1007);
                    identifier113=identifier();

                    state._fsp--;

                    adaptor.addChild(root_1, identifier113.getTree());
                    // OracleWalker.g:423:23: ( table_name )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==ID) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // OracleWalker.g:423:23: table_name
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_table_name_in_expr_add1009);
                            table_name114=table_name();

                            state._fsp--;

                            adaptor.addChild(root_1, table_name114.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	Column col=new ColumnImp((table_name114!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(table_name114.start),
                      input.getTreeAdaptor().getTokenStopIndex(table_name114.start))):null),(identifier113!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(identifier113.start),
                      input.getTreeAdaptor().getTokenStopIndex(identifier113.start))):null),null);
                    	retval.valueObjExpr =col;
                    	

                    }
                    break;
                case 19 :
                    // OracleWalker.g:428:3: ^( COLUMNAST ASTERISK )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    COLUMNAST115=(CommonTree)match(input,COLUMNAST,FOLLOW_COLUMNAST_in_expr_add1019); 
                    COLUMNAST115_tree = (CommonTree)adaptor.dupNode(COLUMNAST115);

                    root_1 = (CommonTree)adaptor.becomeRoot(COLUMNAST115_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ASTERISK116=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_expr_add1021); 
                    ASTERISK116_tree = (CommonTree)adaptor.dupNode(ASTERISK116);

                    adaptor.addChild(root_1, ASTERISK116_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	Column col=new ColumnImp(null,(ASTERISK116!=null?ASTERISK116.getText():null),null);
                    	retval.valueObjExpr =col;
                    	

                    }
                    break;
                case 20 :
                    // OracleWalker.g:433:3: ^( ID ( expr[$where] )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ID117=(CommonTree)match(input,ID,FOLLOW_ID_in_expr_add1030); 
                    ID117_tree = (CommonTree)adaptor.dupNode(ID117);

                    root_1 = (CommonTree)adaptor.becomeRoot(ID117_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // OracleWalker.g:434:2: ( expr[$where] )*
                        loop27:
                        do {
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( ((LA27_0>=SUBQUERY && LA27_0<=COLUMN)||LA27_0==QUTED_STR||LA27_0==COLUMNAST||LA27_0==CONSIST||(LA27_0>=CAST && LA27_0<=MULTI_STR)||(LA27_0>=ID && LA27_0<=DIVIDE)||(LA27_0>=N && LA27_0<=NUMBER)||LA27_0==97||LA27_0==100||(LA27_0>=104 && LA27_0<=105)) ) {
                                alt27=1;
                            }


                            switch (alt27) {
                        	case 1 :
                        	    // OracleWalker.g:434:3: expr[$where]
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_expr_in_expr_add1035);
                        	    expr118=expr(where);

                        	    state._fsp--;

                        	    adaptor.addChild(root_1, expr118.getTree());
                        	    list.add((expr118!=null?expr118.valueObj:null));

                        	    }
                        	    break;

                        	default :
                        	    break loop27;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	Function func=functionMap.get(((ID117!=null?ID117.getText():null)).toUpperCase());
                    	func.setValue(list);
                    	retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 21 :
                    // OracleWalker.g:439:3: ^( CONSIST ID )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CONSIST119=(CommonTree)match(input,CONSIST,FOLLOW_CONSIST_in_expr_add1046); 
                    CONSIST119_tree = (CommonTree)adaptor.dupNode(CONSIST119);

                    root_1 = (CommonTree)adaptor.becomeRoot(CONSIST119_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ID120=(CommonTree)match(input,ID,FOLLOW_ID_in_expr_add1048); 
                    ID120_tree = (CommonTree)adaptor.dupNode(ID120);

                    adaptor.addChild(root_1, ID120_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	Function func=consistStr.get(((ID120!=null?ID120.getText():null)).toUpperCase());
                    	retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 22 :
                    // OracleWalker.g:443:3: ^( CAST ( expr[$where] )* ID )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CAST121=(CommonTree)match(input,CAST,FOLLOW_CAST_in_expr_add1055); 
                    CAST121_tree = (CommonTree)adaptor.dupNode(CAST121);

                    root_1 = (CommonTree)adaptor.becomeRoot(CAST121_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // OracleWalker.g:443:10: ( expr[$where] )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==ID) ) {
                            int LA28_1 = input.LA(2);

                            if ( (LA28_1==DOWN) ) {
                                alt28=1;
                            }


                        }
                        else if ( ((LA28_0>=SUBQUERY && LA28_0<=COLUMN)||LA28_0==QUTED_STR||LA28_0==COLUMNAST||LA28_0==CONSIST||(LA28_0>=CAST && LA28_0<=MULTI_STR)||(LA28_0>=BITOR && LA28_0<=DIVIDE)||(LA28_0>=N && LA28_0<=NUMBER)||LA28_0==97||LA28_0==100||(LA28_0>=104 && LA28_0<=105)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // OracleWalker.g:443:11: expr[$where]
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_expr_in_expr_add1058);
                    	    expr122=expr(where);

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, expr122.getTree());
                    	    list.add((expr122!=null?expr122.valueObj:null));

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    _last = (CommonTree)input.LT(1);
                    ID123=(CommonTree)match(input,ID,FOLLOW_ID_in_expr_add1064); 
                    ID123_tree = (CommonTree)adaptor.dupNode(ID123);

                    adaptor.addChild(root_1, ID123_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	//list.add("vartabletype");
                    	Cast func= new Cast();
                    	func.setType((ID123!=null?ID123.getText():null));
                    	func.setValue(list);
                    	retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 23 :
                    // OracleWalker.g:450:3: ^( MULTI_STR ( expr[$where] )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MULTI_STR124=(CommonTree)match(input,MULTI_STR,FOLLOW_MULTI_STR_in_expr_add1071); 
                    MULTI_STR124_tree = (CommonTree)adaptor.dupNode(MULTI_STR124);

                    root_1 = (CommonTree)adaptor.becomeRoot(MULTI_STR124_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // OracleWalker.g:450:15: ( expr[$where] )*
                        loop29:
                        do {
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( ((LA29_0>=SUBQUERY && LA29_0<=COLUMN)||LA29_0==QUTED_STR||LA29_0==COLUMNAST||LA29_0==CONSIST||(LA29_0>=CAST && LA29_0<=MULTI_STR)||(LA29_0>=ID && LA29_0<=DIVIDE)||(LA29_0>=N && LA29_0<=NUMBER)||LA29_0==97||LA29_0==100||(LA29_0>=104 && LA29_0<=105)) ) {
                                alt29=1;
                            }


                            switch (alt29) {
                        	case 1 :
                        	    // OracleWalker.g:450:16: expr[$where]
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_expr_in_expr_add1074);
                        	    expr125=expr(where);

                        	    state._fsp--;

                        	    adaptor.addChild(root_1, expr125.getTree());
                        	    list.add((expr125!=null?expr125.valueObj:null));

                        	    }
                        	    break;

                        	default :
                        	    break loop29;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	MultiStrConcat func= new MultiStrConcat();
                    	func.setValue(list);
                    	retval.valueObjExpr =func;
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_add"

    public static class value_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // OracleWalker.g:456:1: value : ( N | NUMBER | '?' );
    public final OracleWalker.value_return value() throws RecognitionException {
        OracleWalker.value_return retval = new OracleWalker.value_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set126=null;

        CommonTree set126_tree=null;

        try {
            // OracleWalker.g:456:7: ( N | NUMBER | '?' )
            // OracleWalker.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set126=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=N && input.LA(1)<=NUMBER)||input.LA(1)==100 ) {
                input.consume();

                set126_tree = (CommonTree)adaptor.dupNode(set126);

                adaptor.addChild(root_0, set126_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "value"

    public static class boolean_literal_return extends TreeRuleReturnScope {
        public Object valueObj;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_literal"
    // OracleWalker.g:461:1: boolean_literal returns [Object valueObj] : (s1= 'TRUE' | s1= 'FALSE' );
    public final OracleWalker.boolean_literal_return boolean_literal() throws RecognitionException {
        OracleWalker.boolean_literal_return retval = new OracleWalker.boolean_literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree s1=null;

        CommonTree s1_tree=null;

        try {
            // OracleWalker.g:462:2: (s1= 'TRUE' | s1= 'FALSE' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==104) ) {
                alt31=1;
            }
            else if ( (LA31_0==105) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // OracleWalker.g:462:3: s1= 'TRUE'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    s1=(CommonTree)match(input,104,FOLLOW_104_in_boolean_literal1113); 
                    s1_tree = (CommonTree)adaptor.dupNode(s1);

                    adaptor.addChild(root_0, s1_tree);

                    retval.valueObj =Boolean.parseBoolean((s1!=null?s1.getText():null));

                    }
                    break;
                case 2 :
                    // OracleWalker.g:463:4: s1= 'FALSE'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    s1=(CommonTree)match(input,105,FOLLOW_105_in_boolean_literal1122); 
                    s1_tree = (CommonTree)adaptor.dupNode(s1);

                    adaptor.addChild(root_0, s1_tree);

                    retval.valueObj =Boolean.parseBoolean((s1!=null?s1.getText():null));

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "boolean_literal"

    public static class select_list_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select_list"
    // OracleWalker.g:467:1: select_list[Select select] : ^( SELECT_LIST ( displayed_column[$select] )+ ) ;
    public final OracleWalker.select_list_return select_list(Select select) throws RecognitionException {
        OracleWalker.select_list_return retval = new OracleWalker.select_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SELECT_LIST127=null;
        OracleWalker.displayed_column_return displayed_column128 = null;


        CommonTree SELECT_LIST127_tree=null;

        try {
            // OracleWalker.g:468:2: ( ^( SELECT_LIST ( displayed_column[$select] )+ ) )
            // OracleWalker.g:468:3: ^( SELECT_LIST ( displayed_column[$select] )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            SELECT_LIST127=(CommonTree)match(input,SELECT_LIST,FOLLOW_SELECT_LIST_in_select_list1138); 
            SELECT_LIST127_tree = (CommonTree)adaptor.dupNode(SELECT_LIST127);

            root_1 = (CommonTree)adaptor.becomeRoot(SELECT_LIST127_tree, root_1);



            match(input, Token.DOWN, null); 
            // OracleWalker.g:468:17: ( displayed_column[$select] )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==COLUMN||LA32_0==CONSIST||LA32_0==ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // OracleWalker.g:468:17: displayed_column[$select]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_displayed_column_in_select_list1140);
            	    displayed_column128=displayed_column(select);

            	    state._fsp--;

            	    adaptor.addChild(root_1, displayed_column128.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "select_list"

    public static class fromClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fromClause"
    // OracleWalker.g:470:1: fromClause[Select select] : ^( TABLENAMES ( table[$select] )+ ) ;
    public final OracleWalker.fromClause_return fromClause(Select select) throws RecognitionException {
        OracleWalker.fromClause_return retval = new OracleWalker.fromClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TABLENAMES129=null;
        OracleWalker.table_return table130 = null;


        CommonTree TABLENAMES129_tree=null;

        try {
            // OracleWalker.g:471:2: ( ^( TABLENAMES ( table[$select] )+ ) )
            // OracleWalker.g:471:3: ^( TABLENAMES ( table[$select] )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TABLENAMES129=(CommonTree)match(input,TABLENAMES,FOLLOW_TABLENAMES_in_fromClause1155); 
            TABLENAMES129_tree = (CommonTree)adaptor.dupNode(TABLENAMES129);

            root_1 = (CommonTree)adaptor.becomeRoot(TABLENAMES129_tree, root_1);



            match(input, Token.DOWN, null); 
            // OracleWalker.g:471:16: ( table[$select] )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==TABLENAME) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // OracleWalker.g:471:16: table[$select]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_table_in_fromClause1157);
            	    table130=table(select);

            	    state._fsp--;

            	    adaptor.addChild(root_1, table130.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fromClause"

    public static class table_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table"
    // OracleWalker.g:474:1: table[DMLCommon common] : ^( TABLENAME table_spec[$common] ) ;
    public final OracleWalker.table_return table(DMLCommon common) throws RecognitionException {
        OracleWalker.table_return retval = new OracleWalker.table_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TABLENAME131=null;
        OracleWalker.table_spec_return table_spec132 = null;


        CommonTree TABLENAME131_tree=null;

        try {
            // OracleWalker.g:475:2: ( ^( TABLENAME table_spec[$common] ) )
            // OracleWalker.g:475:3: ^( TABLENAME table_spec[$common] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TABLENAME131=(CommonTree)match(input,TABLENAME,FOLLOW_TABLENAME_in_table1172); 
            TABLENAME131_tree = (CommonTree)adaptor.dupNode(TABLENAME131);

            root_1 = (CommonTree)adaptor.becomeRoot(TABLENAME131_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_table_spec_in_table1174);
            table_spec132=table_spec(common);

            state._fsp--;

            adaptor.addChild(root_1, table_spec132.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "table"

    public static class tables_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tables"
    // OracleWalker.g:477:1: tables[DMLCommon common] : ^( TABLENAMES ( table[$common] )+ ) ;
    public final OracleWalker.tables_return tables(DMLCommon common) throws RecognitionException {
        OracleWalker.tables_return retval = new OracleWalker.tables_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TABLENAMES133=null;
        OracleWalker.table_return table134 = null;


        CommonTree TABLENAMES133_tree=null;

        try {
            // OracleWalker.g:478:2: ( ^( TABLENAMES ( table[$common] )+ ) )
            // OracleWalker.g:478:3: ^( TABLENAMES ( table[$common] )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TABLENAMES133=(CommonTree)match(input,TABLENAMES,FOLLOW_TABLENAMES_in_tables1187); 
            TABLENAMES133_tree = (CommonTree)adaptor.dupNode(TABLENAMES133);

            root_1 = (CommonTree)adaptor.becomeRoot(TABLENAMES133_tree, root_1);



            match(input, Token.DOWN, null); 
            // OracleWalker.g:478:16: ( table[$common] )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==TABLENAME) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // OracleWalker.g:478:16: table[$common]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_table_in_tables1189);
            	    table134=table(common);

            	    state._fsp--;

            	    adaptor.addChild(root_1, table134.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tables"

    public static class table_spec_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table_spec"
    // OracleWalker.g:480:1: table_spec[DMLCommon common] : ( ( schema_name )? table_name ( alias )? | subquery[$common.getIndexHolder()] ( alias )? | ^( ID ( expr[$common.getIndexHolder()] ) ( alias )? ) );
    public final OracleWalker.table_spec_return table_spec(DMLCommon common) throws RecognitionException {
        OracleWalker.table_spec_return retval = new OracleWalker.table_spec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ID140=null;
        OracleWalker.schema_name_return schema_name135 = null;

        OracleWalker.table_name_return table_name136 = null;

        OracleWalker.alias_return alias137 = null;

        OracleWalker.subquery_return subquery138 = null;

        OracleWalker.alias_return alias139 = null;

        OracleWalker.expr_return expr141 = null;

        OracleWalker.alias_return alias142 = null;


        CommonTree ID140_tree=null;


        	List<Object> list=new ArrayList<Object>();
        	
        try {
            // OracleWalker.g:484:2: ( ( schema_name )? table_name ( alias )? | subquery[$common.getIndexHolder()] ( alias )? | ^( ID ( expr[$common.getIndexHolder()] ) ( alias )? ) )
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ID) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==DOWN) ) {
                    alt39=3;
                }
                else if ( (LA39_1==UP||LA39_1==AS||LA39_1==ID) ) {
                    alt39=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA39_0==SUBQUERY) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // OracleWalker.g:484:3: ( schema_name )? table_name ( alias )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // OracleWalker.g:484:3: ( schema_name )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ID) ) {
                        int LA35_1 = input.LA(2);

                        if ( (LA35_1==ID) ) {
                            alt35=1;
                        }
                    }
                    switch (alt35) {
                        case 1 :
                            // OracleWalker.g:484:5: schema_name
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_schema_name_in_table_spec1209);
                            schema_name135=schema_name();

                            state._fsp--;

                            adaptor.addChild(root_0, schema_name135.getTree());

                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_table_name_in_table_spec1213);
                    table_name136=table_name();

                    state._fsp--;

                    adaptor.addChild(root_0, table_name136.getTree());
                    // OracleWalker.g:484:31: ( alias )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==AS) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // OracleWalker.g:484:31: alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_alias_in_table_spec1216);
                            alias137=alias();

                            state._fsp--;

                            adaptor.addChild(root_0, alias137.getTree());

                            }
                            break;

                    }


                    		common.addTableNameAndSchemaName((table_name136!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(table_name136.start),
                      input.getTreeAdaptor().getTokenStopIndex(table_name136.start))):null),(schema_name135!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(schema_name135.start),
                      input.getTreeAdaptor().getTokenStopIndex(schema_name135.start))):null),(alias137!=null?alias137.aliText:null), true);
                    	

                    }
                    break;
                case 2 :
                    // OracleWalker.g:488:3: subquery[$common.getIndexHolder()] ( alias )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_subquery_in_table_spec1224);
                    subquery138=subquery(common.getIndexHolder());

                    state._fsp--;

                    adaptor.addChild(root_0, subquery138.getTree());
                    // OracleWalker.g:488:38: ( alias )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==AS) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // OracleWalker.g:488:38: alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_alias_in_table_spec1227);
                            alias139=alias();

                            state._fsp--;

                            adaptor.addChild(root_0, alias139.getTree());

                            }
                            break;

                    }


                    		common.addTableSubQuery((subquery138!=null?subquery138.subselect:null),(alias139!=null?alias139.aliText:null), true);

                    	

                    }
                    break;
                case 3 :
                    // OracleWalker.g:493:3: ^( ID ( expr[$common.getIndexHolder()] ) ( alias )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ID140=(CommonTree)match(input,ID,FOLLOW_ID_in_table_spec1236); 
                    ID140_tree = (CommonTree)adaptor.dupNode(ID140);

                    root_1 = (CommonTree)adaptor.becomeRoot(ID140_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // OracleWalker.g:493:8: ( expr[$common.getIndexHolder()] )
                    // OracleWalker.g:493:9: expr[$common.getIndexHolder()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_table_spec1239);
                    expr141=expr(common.getIndexHolder());

                    state._fsp--;

                    adaptor.addChild(root_1, expr141.getTree());
                    list.add((expr141!=null?expr141.valueObj:null));

                    }

                    // OracleWalker.g:493:69: ( alias )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==AS) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // OracleWalker.g:493:69: alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_alias_in_table_spec1245);
                            alias142=alias();

                            state._fsp--;

                            adaptor.addChild(root_1, alias142.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		Function func=functionMap.get(((ID140!=null?ID140.getText():null)).toUpperCase());
                    		func.setValue(list);
                    		common.addTableFunction(func,(alias142!=null?alias142.aliText:null), true);
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "table_spec"

    public static class schema_name_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "schema_name"
    // OracleWalker.g:501:1: schema_name : identifier ;
    public final OracleWalker.schema_name_return schema_name() throws RecognitionException {
        OracleWalker.schema_name_return retval = new OracleWalker.schema_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.identifier_return identifier143 = null;



        try {
            // OracleWalker.g:502:2: ( identifier )
            // OracleWalker.g:502:3: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_schema_name1261);
            identifier143=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier143.getTree());

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "schema_name"

    public static class subquery_return extends TreeRuleReturnScope {
        public Select subselect;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subquery"
    // OracleWalker.g:504:1: subquery[BindIndexHolder holder] returns [Select subselect] : ^( SUBQUERY select_command[$holder] ) ;
    public final OracleWalker.subquery_return subquery(BindIndexHolder holder) throws RecognitionException {
        OracleWalker.subquery_return retval = new OracleWalker.subquery_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SUBQUERY144=null;
        OracleWalker.select_command_return select_command145 = null;


        CommonTree SUBQUERY144_tree=null;

        try {
            // OracleWalker.g:504:60: ( ^( SUBQUERY select_command[$holder] ) )
            // OracleWalker.g:505:2: ^( SUBQUERY select_command[$holder] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            SUBQUERY144=(CommonTree)match(input,SUBQUERY,FOLLOW_SUBQUERY_in_subquery1276); 
            SUBQUERY144_tree = (CommonTree)adaptor.dupNode(SUBQUERY144);

            root_1 = (CommonTree)adaptor.becomeRoot(SUBQUERY144_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_select_command_in_subquery1278);
            select_command145=select_command(holder);

            state._fsp--;

            adaptor.addChild(root_1, select_command145.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            	retval.subselect =(select_command145!=null?select_command145.select:null);
            	retval.subselect.setSubSelect(true);
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "subquery"

    public static class table_name_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table_name"
    // OracleWalker.g:511:1: table_name : identifier ;
    public final OracleWalker.table_name_return table_name() throws RecognitionException {
        OracleWalker.table_name_return retval = new OracleWalker.table_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.identifier_return identifier146 = null;



        try {
            // OracleWalker.g:512:2: ( identifier )
            // OracleWalker.g:512:3: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_table_name1293);
            identifier146=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier146.getTree());

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "table_name"

    public static class displayed_column_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "displayed_column"
    // OracleWalker.g:514:1: displayed_column[Select select] : ( ^( ID ( expr[$select.getIndexHolder()] ( alias )? )* ) | ^( CONSIST ID ( alias )? ) | ^( COLUMN ( table_alias )? columnAnt ( alias )? ) );
    public final OracleWalker.displayed_column_return displayed_column(Select select) throws RecognitionException {
        OracleWalker.displayed_column_return retval = new OracleWalker.displayed_column_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ID147=null;
        CommonTree CONSIST150=null;
        CommonTree ID151=null;
        CommonTree COLUMN153=null;
        OracleWalker.expr_return expr148 = null;

        OracleWalker.alias_return alias149 = null;

        OracleWalker.alias_return alias152 = null;

        OracleWalker.table_alias_return table_alias154 = null;

        OracleWalker.columnAnt_return columnAnt155 = null;

        OracleWalker.alias_return alias156 = null;


        CommonTree ID147_tree=null;
        CommonTree CONSIST150_tree=null;
        CommonTree ID151_tree=null;
        CommonTree COLUMN153_tree=null;


        List<Object> list=new ArrayList<Object>();

        try {
            // OracleWalker.g:518:2: ( ^( ID ( expr[$select.getIndexHolder()] ( alias )? )* ) | ^( CONSIST ID ( alias )? ) | ^( COLUMN ( table_alias )? columnAnt ( alias )? ) )
            int alt45=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt45=1;
                }
                break;
            case CONSIST:
                {
                alt45=2;
                }
                break;
            case COLUMN:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // OracleWalker.g:519:2: ^( ID ( expr[$select.getIndexHolder()] ( alias )? )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ID147=(CommonTree)match(input,ID,FOLLOW_ID_in_displayed_column1311); 
                    ID147_tree = (CommonTree)adaptor.dupNode(ID147);

                    root_1 = (CommonTree)adaptor.becomeRoot(ID147_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // OracleWalker.g:519:8: ( expr[$select.getIndexHolder()] ( alias )? )*
                        loop41:
                        do {
                            int alt41=2;
                            int LA41_0 = input.LA(1);

                            if ( ((LA41_0>=SUBQUERY && LA41_0<=COLUMN)||LA41_0==QUTED_STR||LA41_0==COLUMNAST||LA41_0==CONSIST||(LA41_0>=CAST && LA41_0<=MULTI_STR)||(LA41_0>=ID && LA41_0<=DIVIDE)||(LA41_0>=N && LA41_0<=NUMBER)||LA41_0==97||LA41_0==100||(LA41_0>=104 && LA41_0<=105)) ) {
                                alt41=1;
                            }


                            switch (alt41) {
                        	case 1 :
                        	    // OracleWalker.g:519:9: expr[$select.getIndexHolder()] ( alias )?
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_expr_in_displayed_column1315);
                        	    expr148=expr(select.getIndexHolder());

                        	    state._fsp--;

                        	    adaptor.addChild(root_1, expr148.getTree());
                        	    list.add((expr148!=null?expr148.valueObj:null));
                        	    // OracleWalker.g:519:67: ( alias )?
                        	    int alt40=2;
                        	    int LA40_0 = input.LA(1);

                        	    if ( (LA40_0==AS) ) {
                        	        alt40=1;
                        	    }
                        	    switch (alt40) {
                        	        case 1 :
                        	            // OracleWalker.g:519:67: alias
                        	            {
                        	            _last = (CommonTree)input.LT(1);
                        	            pushFollow(FOLLOW_alias_in_displayed_column1319);
                        	            alias149=alias();

                        	            state._fsp--;

                        	            adaptor.addChild(root_1, alias149.getTree());

                        	            }
                        	            break;

                        	    }


                        	    }
                        	    break;

                        	default :
                        	    break loop41;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	Function func=functionMap.get(((ID147!=null?ID147.getText():null)).toUpperCase());
                    	func.setValue(list);
                    	FunctionColumn funcolumn=new FunctionColumn();
                    	funcolumn.setFunction(func);
                    	funcolumn.setAlias((alias149!=null?alias149.aliText:null));
                    	select.addColumn(funcolumn);
                    	

                    }
                    break;
                case 2 :
                    // OracleWalker.g:527:3: ^( CONSIST ID ( alias )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CONSIST150=(CommonTree)match(input,CONSIST,FOLLOW_CONSIST_in_displayed_column1331); 
                    CONSIST150_tree = (CommonTree)adaptor.dupNode(CONSIST150);

                    root_1 = (CommonTree)adaptor.becomeRoot(CONSIST150_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ID151=(CommonTree)match(input,ID,FOLLOW_ID_in_displayed_column1333); 
                    ID151_tree = (CommonTree)adaptor.dupNode(ID151);

                    adaptor.addChild(root_1, ID151_tree);

                    // OracleWalker.g:527:16: ( alias )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==AS) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // OracleWalker.g:527:16: alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_alias_in_displayed_column1335);
                            alias152=alias();

                            state._fsp--;

                            adaptor.addChild(root_1, alias152.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	Function func=consistStr.get(((ID151!=null?ID151.getText():null)).toUpperCase());
                    	FunctionColumn funcolumn=new FunctionColumn();
                    	funcolumn.setFunction(func);
                    	funcolumn.setAlias((alias152!=null?alias152.aliText:null));
                    	select.addColumn(funcolumn);
                    	

                    }
                    break;
                case 3 :
                    // OracleWalker.g:534:3: ^( COLUMN ( table_alias )? columnAnt ( alias )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    COLUMN153=(CommonTree)match(input,COLUMN,FOLLOW_COLUMN_in_displayed_column1343); 
                    COLUMN153_tree = (CommonTree)adaptor.dupNode(COLUMN153);

                    root_1 = (CommonTree)adaptor.becomeRoot(COLUMN153_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // OracleWalker.g:534:12: ( table_alias )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==COL_TAB) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // OracleWalker.g:534:12: table_alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_table_alias_in_displayed_column1345);
                            table_alias154=table_alias();

                            state._fsp--;

                            adaptor.addChild(root_1, table_alias154.getTree());

                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_columnAnt_in_displayed_column1348);
                    columnAnt155=columnAnt();

                    state._fsp--;

                    adaptor.addChild(root_1, columnAnt155.getTree());
                    // OracleWalker.g:534:35: ( alias )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==AS) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // OracleWalker.g:534:35: alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_alias_in_displayed_column1350);
                            alias156=alias();

                            state._fsp--;

                            adaptor.addChild(root_1, alias156.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    select.addColumn((table_alias154!=null?table_alias154.aText:null),(columnAnt155!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(columnAnt155.start),
                      input.getTreeAdaptor().getTokenStopIndex(columnAnt155.start))):null),(alias156!=null?alias156.aliText:null));

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "displayed_column"

    public static class columnAnt_return extends TreeRuleReturnScope {
        public String aText;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnAnt"
    // OracleWalker.g:539:1: columnAnt returns [String aText] : ( ASTERISK | N | identifier );
    public final OracleWalker.columnAnt_return columnAnt() throws RecognitionException {
        OracleWalker.columnAnt_return retval = new OracleWalker.columnAnt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASTERISK157=null;
        CommonTree N158=null;
        OracleWalker.identifier_return identifier159 = null;


        CommonTree ASTERISK157_tree=null;
        CommonTree N158_tree=null;

        try {
            // OracleWalker.g:540:2: ( ASTERISK | N | identifier )
            int alt46=3;
            switch ( input.LA(1) ) {
            case ASTERISK:
                {
                alt46=1;
                }
                break;
            case N:
                {
                alt46=2;
                }
                break;
            case ID:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // OracleWalker.g:540:3: ASTERISK
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    ASTERISK157=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_columnAnt1374); 
                    ASTERISK157_tree = (CommonTree)adaptor.dupNode(ASTERISK157);

                    adaptor.addChild(root_0, ASTERISK157_tree);

                    retval.aText =(ASTERISK157!=null?ASTERISK157.getText():null);

                    }
                    break;
                case 2 :
                    // OracleWalker.g:541:3: N
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    N158=(CommonTree)match(input,N,FOLLOW_N_in_columnAnt1380); 
                    N158_tree = (CommonTree)adaptor.dupNode(N158);

                    adaptor.addChild(root_0, N158_tree);

                    retval.aText =(N158!=null?N158.getText():null);

                    }
                    break;
                case 3 :
                    // OracleWalker.g:542:3: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_columnAnt1386);
                    identifier159=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, identifier159.getTree());
                    retval.aText =(identifier159!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(identifier159.start),
                      input.getTreeAdaptor().getTokenStopIndex(identifier159.start))):null);

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnAnt"

    public static class quoted_string_return extends TreeRuleReturnScope {
        public String aText;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "quoted_string"
    // OracleWalker.g:545:1: quoted_string returns [String aText] : QUOTED_STRING ;
    public final OracleWalker.quoted_string_return quoted_string() throws RecognitionException {
        OracleWalker.quoted_string_return retval = new OracleWalker.quoted_string_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QUOTED_STRING160=null;

        CommonTree QUOTED_STRING160_tree=null;

        try {
            // OracleWalker.g:546:2: ( QUOTED_STRING )
            // OracleWalker.g:546:4: QUOTED_STRING
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            QUOTED_STRING160=(CommonTree)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_quoted_string1402); 
            QUOTED_STRING160_tree = (CommonTree)adaptor.dupNode(QUOTED_STRING160);

            adaptor.addChild(root_0, QUOTED_STRING160_tree);

            retval.aText = (QUOTED_STRING160!=null?QUOTED_STRING160.getText():null).substring(1, (QUOTED_STRING160!=null?QUOTED_STRING160.getText():null).length() - 1);

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "quoted_string"

    public static class identifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifier"
    // OracleWalker.g:549:1: identifier : ID ;
    public final OracleWalker.identifier_return identifier() throws RecognitionException {
        OracleWalker.identifier_return retval = new OracleWalker.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ID161=null;

        CommonTree ID161_tree=null;

        try {
            // OracleWalker.g:550:2: ( ID )
            // OracleWalker.g:550:3: ID
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            ID161=(CommonTree)match(input,ID,FOLLOW_ID_in_identifier1414); 
            ID161_tree = (CommonTree)adaptor.dupNode(ID161);

            adaptor.addChild(root_0, ID161_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "identifier"

    public static class table_alias_return extends TreeRuleReturnScope {
        public String aText;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table_alias"
    // OracleWalker.g:552:1: table_alias returns [String aText] : ^( COL_TAB identifier ) ;
    public final OracleWalker.table_alias_return table_alias() throws RecognitionException {
        OracleWalker.table_alias_return retval = new OracleWalker.table_alias_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COL_TAB162=null;
        OracleWalker.identifier_return identifier163 = null;


        CommonTree COL_TAB162_tree=null;

        try {
            // OracleWalker.g:553:2: ( ^( COL_TAB identifier ) )
            // OracleWalker.g:553:3: ^( COL_TAB identifier )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            COL_TAB162=(CommonTree)match(input,COL_TAB,FOLLOW_COL_TAB_in_table_alias1431); 
            COL_TAB162_tree = (CommonTree)adaptor.dupNode(COL_TAB162);

            root_1 = (CommonTree)adaptor.becomeRoot(COL_TAB162_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_table_alias1433);
            identifier163=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier163.getTree());
            retval.aText =(identifier163!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(identifier163.start),
              input.getTreeAdaptor().getTokenStopIndex(identifier163.start))):null);

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "table_alias"

    public static class alias_return extends TreeRuleReturnScope {
        public String aliText;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "alias"
    // OracleWalker.g:556:1: alias returns [String aliText] : ^( AS identifier ) ;
    public final OracleWalker.alias_return alias() throws RecognitionException {
        OracleWalker.alias_return retval = new OracleWalker.alias_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AS164=null;
        OracleWalker.identifier_return identifier165 = null;


        CommonTree AS164_tree=null;

        try {
            // OracleWalker.g:557:2: ( ^( AS identifier ) )
            // OracleWalker.g:557:3: ^( AS identifier )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            AS164=(CommonTree)match(input,AS,FOLLOW_AS_in_alias1452); 
            AS164_tree = (CommonTree)adaptor.dupNode(AS164);

            root_1 = (CommonTree)adaptor.becomeRoot(AS164_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_alias1454);
            identifier165=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier165.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            retval.aliText =(identifier165!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(identifier165.start),
              input.getTreeAdaptor().getTokenStopIndex(identifier165.start))):null);

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "alias"

    public static class selectClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selectClause"
    // OracleWalker.g:563:1: selectClause[Select select] : ^( SELECT ( indexClause[select] )? select_list[$select] ) ;
    public final OracleWalker.selectClause_return selectClause(Select select) throws RecognitionException {
        OracleWalker.selectClause_return retval = new OracleWalker.selectClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SELECT166=null;
        OracleWalker.indexClause_return indexClause167 = null;

        OracleWalker.select_list_return select_list168 = null;


        CommonTree SELECT166_tree=null;

        try {
            // OracleWalker.g:564:5: ( ^( SELECT ( indexClause[select] )? select_list[$select] ) )
            // OracleWalker.g:564:6: ^( SELECT ( indexClause[select] )? select_list[$select] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            SELECT166=(CommonTree)match(input,SELECT,FOLLOW_SELECT_in_selectClause1475); 
            SELECT166_tree = (CommonTree)adaptor.dupNode(SELECT166);

            root_1 = (CommonTree)adaptor.becomeRoot(SELECT166_tree, root_1);



            match(input, Token.DOWN, null); 
            // OracleWalker.g:564:15: ( indexClause[select] )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==ID) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // OracleWalker.g:564:15: indexClause[select]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_indexClause_in_selectClause1477);
                    indexClause167=indexClause(select);

                    state._fsp--;

                    adaptor.addChild(root_1, indexClause167.getTree());

                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_select_list_in_selectClause1481);
            select_list168=select_list(select);

            state._fsp--;

            adaptor.addChild(root_1, select_list168.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "selectClause"

    public static class indexClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "indexClause"
    // OracleWalker.g:567:1: indexClause[DMLCommon dmlCommon] : ( hints[$dmlCommon] )+ ;
    public final OracleWalker.indexClause_return indexClause(DMLCommon dmlCommon) throws RecognitionException {
        OracleWalker.indexClause_return retval = new OracleWalker.indexClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.hints_return hints169 = null;



        try {
            // OracleWalker.g:568:2: ( ( hints[$dmlCommon] )+ )
            // OracleWalker.g:568:3: ( hints[$dmlCommon] )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // OracleWalker.g:568:3: ( hints[$dmlCommon] )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==ID) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // OracleWalker.g:568:3: hints[$dmlCommon]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_hints_in_indexClause1500);
            	    hints169=hints(dmlCommon);

            	    state._fsp--;

            	    adaptor.addChild(root_0, hints169.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "indexClause"

    public static class hints_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hints"
    // OracleWalker.g:571:1: hints[DMLCommon dmlCommon] : ^( ID ( identifier )* ) ;
    public final OracleWalker.hints_return hints(DMLCommon dmlCommon) throws RecognitionException {
        OracleWalker.hints_return retval = new OracleWalker.hints_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ID170=null;
        OracleWalker.identifier_return identifier171 = null;


        CommonTree ID170_tree=null;


        	List<String> list=new ArrayList<String>();
        	
        try {
            // OracleWalker.g:575:2: ( ^( ID ( identifier )* ) )
            // OracleWalker.g:575:3: ^( ID ( identifier )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ID170=(CommonTree)match(input,ID,FOLLOW_ID_in_hints1520); 
            ID170_tree = (CommonTree)adaptor.dupNode(ID170);

            root_1 = (CommonTree)adaptor.becomeRoot(ID170_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OracleWalker.g:575:9: ( identifier )*
                loop49:
                do {
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==ID) ) {
                        alt49=1;
                    }


                    switch (alt49) {
                	case 1 :
                	    // OracleWalker.g:575:10: identifier
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_identifier_in_hints1524);
                	    identifier171=identifier();

                	    state._fsp--;

                	    adaptor.addChild(root_1, identifier171.getTree());
                	    list.add(((identifier171!=null?(input.getTokenStream().toString(
                	      input.getTreeAdaptor().getTokenStartIndex(identifier171.start),
                	      input.getTreeAdaptor().getTokenStopIndex(identifier171.start))):null)));

                	    }
                	    break;

                	default :
                	    break loop49;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            	HintSetter hint=hintReg.get(((ID170!=null?ID170.getText():null)).toUpperCase());
            	hint.addHint(list);
            	dmlCommon.addHint(hint);
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "hints"

    public static class select_command_return extends TreeRuleReturnScope {
        public Select select;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select_command"
    // OracleWalker.g:582:1: select_command[BindIndexHolder holder] returns [Select select] : selectClause[$select] ( fromClause[$select] )? ( whereClause[$select.getWhere()] )? ( groupByClause[$select.getWhere()] )? ( orderByClause[$select.getWhere()] )? ( for_update[$select] )? ;
    public final OracleWalker.select_command_return select_command(BindIndexHolder holder) throws RecognitionException {
        OracleWalker.select_command_return retval = new OracleWalker.select_command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.selectClause_return selectClause172 = null;

        OracleWalker.fromClause_return fromClause173 = null;

        OracleWalker.whereClause_return whereClause174 = null;

        OracleWalker.groupByClause_return groupByClause175 = null;

        OracleWalker.orderByClause_return orderByClause176 = null;

        OracleWalker.for_update_return for_update177 = null;




        if(holder ==null){
        	retval.select =new OracleSelect();
        	}
        else{
        	retval.select = new OracleSelect(holder);
        }


        try {
            // OracleWalker.g:592:6: ( selectClause[$select] ( fromClause[$select] )? ( whereClause[$select.getWhere()] )? ( groupByClause[$select.getWhere()] )? ( orderByClause[$select.getWhere()] )? ( for_update[$select] )? )
            // OracleWalker.g:592:8: selectClause[$select] ( fromClause[$select] )? ( whereClause[$select.getWhere()] )? ( groupByClause[$select.getWhere()] )? ( orderByClause[$select.getWhere()] )? ( for_update[$select] )?
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_selectClause_in_select_command1552);
            selectClause172=selectClause(retval.select);

            state._fsp--;

            adaptor.addChild(root_0, selectClause172.getTree());
            // OracleWalker.g:592:30: ( fromClause[$select] )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==TABLENAMES) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // OracleWalker.g:592:31: fromClause[$select]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_fromClause_in_select_command1556);
                    fromClause173=fromClause(retval.select);

                    state._fsp--;

                    adaptor.addChild(root_0, fromClause173.getTree());

                    }
                    break;

            }

            // OracleWalker.g:592:54: ( whereClause[$select.getWhere()] )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==WHERE) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // OracleWalker.g:592:55: whereClause[$select.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_whereClause_in_select_command1563);
                    whereClause174=whereClause(retval.select.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_0, whereClause174.getTree());

                    }
                    break;

            }

            // OracleWalker.g:592:89: ( groupByClause[$select.getWhere()] )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==GROUPBY) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // OracleWalker.g:592:90: groupByClause[$select.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_groupByClause_in_select_command1569);
                    groupByClause175=groupByClause(retval.select.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_0, groupByClause175.getTree());

                    }
                    break;

            }

            // OracleWalker.g:592:126: ( orderByClause[$select.getWhere()] )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==ORDERBY) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // OracleWalker.g:592:127: orderByClause[$select.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_orderByClause_in_select_command1575);
                    orderByClause176=orderByClause(retval.select.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_0, orderByClause176.getTree());

                    }
                    break;

            }

            // OracleWalker.g:592:163: ( for_update[$select] )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==FORUPDATE) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // OracleWalker.g:592:164: for_update[$select]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_for_update_in_select_command1581);
                    for_update177=for_update(retval.select);

                    state._fsp--;

                    adaptor.addChild(root_0, for_update177.getTree());

                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "select_command"

    public static class for_update_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_update"
    // OracleWalker.g:594:1: for_update[Select select] : ^( FORUPDATE ( of_statement[update] )? ( wait_statement[update] )? ) ;
    public final OracleWalker.for_update_return for_update(Select select) throws RecognitionException {
        OracleWalker.for_update_return retval = new OracleWalker.for_update_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FORUPDATE178=null;
        OracleWalker.of_statement_return of_statement179 = null;

        OracleWalker.wait_statement_return wait_statement180 = null;


        CommonTree FORUPDATE178_tree=null;


        		OracleForUpdate update = new OracleForUpdate();
        	
        try {
            // OracleWalker.g:598:2: ( ^( FORUPDATE ( of_statement[update] )? ( wait_statement[update] )? ) )
            // OracleWalker.g:598:3: ^( FORUPDATE ( of_statement[update] )? ( wait_statement[update] )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            FORUPDATE178=(CommonTree)match(input,FORUPDATE,FOLLOW_FORUPDATE_in_for_update1604); 
            FORUPDATE178_tree = (CommonTree)adaptor.dupNode(FORUPDATE178);

            root_1 = (CommonTree)adaptor.becomeRoot(FORUPDATE178_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OracleWalker.g:598:15: ( of_statement[update] )?
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==OF) ) {
                    alt55=1;
                }
                switch (alt55) {
                    case 1 :
                        // OracleWalker.g:598:15: of_statement[update]
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_of_statement_in_for_update1606);
                        of_statement179=of_statement(update);

                        state._fsp--;

                        adaptor.addChild(root_1, of_statement179.getTree());

                        }
                        break;

                }

                // OracleWalker.g:598:37: ( wait_statement[update] )?
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==NOWAIT||LA56_0==WAIT) ) {
                    alt56=1;
                }
                switch (alt56) {
                    case 1 :
                        // OracleWalker.g:598:37: wait_statement[update]
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_wait_statement_in_for_update1610);
                        wait_statement180=wait_statement(update);

                        state._fsp--;

                        adaptor.addChild(root_1, wait_statement180.getTree());

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		select.addForUpdate(update);
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "for_update"

    public static class of_statement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "of_statement"
    // OracleWalker.g:603:1: of_statement[OracleForUpdate update] : ^( OF expr[null] ) ;
    public final OracleWalker.of_statement_return of_statement(OracleForUpdate update) throws RecognitionException {
        OracleWalker.of_statement_return retval = new OracleWalker.of_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OF181=null;
        OracleWalker.expr_return expr182 = null;


        CommonTree OF181_tree=null;

        try {
            // OracleWalker.g:604:2: ( ^( OF expr[null] ) )
            // OracleWalker.g:604:3: ^( OF expr[null] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            OF181=(CommonTree)match(input,OF,FOLLOW_OF_in_of_statement1628); 
            OF181_tree = (CommonTree)adaptor.dupNode(OF181);

            root_1 = (CommonTree)adaptor.becomeRoot(OF181_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_of_statement1630);
            expr182=expr(null);

            state._fsp--;

            adaptor.addChild(root_1, expr182.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		update.setOfColumn((Column)(expr182!=null?expr182.valueObj:null));
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "of_statement"

    public static class wait_statement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "wait_statement"
    // OracleWalker.g:609:1: wait_statement[OracleForUpdate update] : ( ^( NOWAIT ( N )? ) | ^( WAIT N ) );
    public final OracleWalker.wait_statement_return wait_statement(OracleForUpdate update) throws RecognitionException {
        OracleWalker.wait_statement_return retval = new OracleWalker.wait_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NOWAIT183=null;
        CommonTree N184=null;
        CommonTree WAIT185=null;
        CommonTree N186=null;

        CommonTree NOWAIT183_tree=null;
        CommonTree N184_tree=null;
        CommonTree WAIT185_tree=null;
        CommonTree N186_tree=null;

        try {
            // OracleWalker.g:610:2: ( ^( NOWAIT ( N )? ) | ^( WAIT N ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==NOWAIT) ) {
                alt58=1;
            }
            else if ( (LA58_0==WAIT) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // OracleWalker.g:610:3: ^( NOWAIT ( N )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    NOWAIT183=(CommonTree)match(input,NOWAIT,FOLLOW_NOWAIT_in_wait_statement1646); 
                    NOWAIT183_tree = (CommonTree)adaptor.dupNode(NOWAIT183);

                    root_1 = (CommonTree)adaptor.becomeRoot(NOWAIT183_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // OracleWalker.g:610:12: ( N )?
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==N) ) {
                            alt57=1;
                        }
                        switch (alt57) {
                            case 1 :
                                // OracleWalker.g:610:12: N
                                {
                                _last = (CommonTree)input.LT(1);
                                N184=(CommonTree)match(input,N,FOLLOW_N_in_wait_statement1648); 
                                N184_tree = (CommonTree)adaptor.dupNode(N184);

                                adaptor.addChild(root_1, N184_tree);


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		update.setWait(0);
                    	

                    }
                    break;
                case 2 :
                    // OracleWalker.g:614:3: ^( WAIT N )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    WAIT185=(CommonTree)match(input,WAIT,FOLLOW_WAIT_in_wait_statement1658); 
                    WAIT185_tree = (CommonTree)adaptor.dupNode(WAIT185);

                    root_1 = (CommonTree)adaptor.becomeRoot(WAIT185_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    N186=(CommonTree)match(input,N,FOLLOW_N_in_wait_statement1660); 
                    N186_tree = (CommonTree)adaptor.dupNode(N186);

                    adaptor.addChild(root_1, N186_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		update.setWait(Integer.valueOf((N186!=null?N186.getText():null)));
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "wait_statement"

    public static class delete_command_return extends TreeRuleReturnScope {
        public Delete del;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delete_command"
    // OracleWalker.g:619:1: delete_command returns [Delete del] : ^( DELETE ( indexClause[$del] )? tables[$del] ( whereClause[$del.getWhere()] )? ( orderByClause[$del.getWhere()] )? ) ;
    public final OracleWalker.delete_command_return delete_command() throws RecognitionException {
        OracleWalker.delete_command_return retval = new OracleWalker.delete_command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DELETE187=null;
        OracleWalker.indexClause_return indexClause188 = null;

        OracleWalker.tables_return tables189 = null;

        OracleWalker.whereClause_return whereClause190 = null;

        OracleWalker.orderByClause_return orderByClause191 = null;


        CommonTree DELETE187_tree=null;

        retval.del =new OracleDelete();
        try {
            // OracleWalker.g:621:2: ( ^( DELETE ( indexClause[$del] )? tables[$del] ( whereClause[$del.getWhere()] )? ( orderByClause[$del.getWhere()] )? ) )
            // OracleWalker.g:621:3: ^( DELETE ( indexClause[$del] )? tables[$del] ( whereClause[$del.getWhere()] )? ( orderByClause[$del.getWhere()] )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            DELETE187=(CommonTree)match(input,DELETE,FOLLOW_DELETE_in_delete_command1681); 
            DELETE187_tree = (CommonTree)adaptor.dupNode(DELETE187);

            root_1 = (CommonTree)adaptor.becomeRoot(DELETE187_tree, root_1);



            match(input, Token.DOWN, null); 
            // OracleWalker.g:621:12: ( indexClause[$del] )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==ID) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // OracleWalker.g:621:12: indexClause[$del]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_indexClause_in_delete_command1683);
                    indexClause188=indexClause(retval.del);

                    state._fsp--;

                    adaptor.addChild(root_1, indexClause188.getTree());

                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_tables_in_delete_command1687);
            tables189=tables(retval.del);

            state._fsp--;

            adaptor.addChild(root_1, tables189.getTree());
            // OracleWalker.g:621:44: ( whereClause[$del.getWhere()] )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==WHERE) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // OracleWalker.g:621:44: whereClause[$del.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_whereClause_in_delete_command1690);
                    whereClause190=whereClause(retval.del.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_1, whereClause190.getTree());

                    }
                    break;

            }

            // OracleWalker.g:621:74: ( orderByClause[$del.getWhere()] )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==ORDERBY) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // OracleWalker.g:621:74: orderByClause[$del.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_orderByClause_in_delete_command1694);
                    orderByClause191=orderByClause(retval.del.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_1, orderByClause191.getTree());

                    }
                    break;

            }


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delete_command"

    public static class update_command_return extends TreeRuleReturnScope {
        public Update update;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "update_command"
    // OracleWalker.g:623:1: update_command returns [Update update] : ^( UPDATE ( indexClause[$update] )? tables[$update] setclause[$update] ( whereClause[$update.getWhere()] )? ) ;
    public final OracleWalker.update_command_return update_command() throws RecognitionException {
        OracleWalker.update_command_return retval = new OracleWalker.update_command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UPDATE192=null;
        OracleWalker.indexClause_return indexClause193 = null;

        OracleWalker.tables_return tables194 = null;

        OracleWalker.setclause_return setclause195 = null;

        OracleWalker.whereClause_return whereClause196 = null;


        CommonTree UPDATE192_tree=null;

        retval.update =new OracleUpdate();
        try {
            // OracleWalker.g:625:2: ( ^( UPDATE ( indexClause[$update] )? tables[$update] setclause[$update] ( whereClause[$update.getWhere()] )? ) )
            // OracleWalker.g:625:3: ^( UPDATE ( indexClause[$update] )? tables[$update] setclause[$update] ( whereClause[$update.getWhere()] )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            UPDATE192=(CommonTree)match(input,UPDATE,FOLLOW_UPDATE_in_update_command1714); 
            UPDATE192_tree = (CommonTree)adaptor.dupNode(UPDATE192);

            root_1 = (CommonTree)adaptor.becomeRoot(UPDATE192_tree, root_1);



            match(input, Token.DOWN, null); 
            // OracleWalker.g:625:12: ( indexClause[$update] )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==ID) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // OracleWalker.g:625:12: indexClause[$update]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_indexClause_in_update_command1716);
                    indexClause193=indexClause(retval.update);

                    state._fsp--;

                    adaptor.addChild(root_1, indexClause193.getTree());

                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_tables_in_update_command1720);
            tables194=tables(retval.update);

            state._fsp--;

            adaptor.addChild(root_1, tables194.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_setclause_in_update_command1723);
            setclause195=setclause(retval.update);

            state._fsp--;

            adaptor.addChild(root_1, setclause195.getTree());
            // OracleWalker.g:625:69: ( whereClause[$update.getWhere()] )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==WHERE) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // OracleWalker.g:625:69: whereClause[$update.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_whereClause_in_update_command1726);
                    whereClause196=whereClause(retval.update.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_1, whereClause196.getTree());

                    }
                    break;

            }


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "update_command"

    public static class insert_command_return extends TreeRuleReturnScope {
        public Insert ins;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "insert_command"
    // OracleWalker.g:629:1: insert_command returns [Insert ins] : ^( INSERT ( indexClause[$ins] )? tables[$ins] ( column_specs[$ins] )* values[$ins] ) ;
    public final OracleWalker.insert_command_return insert_command() throws RecognitionException {
        OracleWalker.insert_command_return retval = new OracleWalker.insert_command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INSERT197=null;
        OracleWalker.indexClause_return indexClause198 = null;

        OracleWalker.tables_return tables199 = null;

        OracleWalker.column_specs_return column_specs200 = null;

        OracleWalker.values_return values201 = null;


        CommonTree INSERT197_tree=null;

        retval.ins =new Insert();
        try {
            // OracleWalker.g:631:2: ( ^( INSERT ( indexClause[$ins] )? tables[$ins] ( column_specs[$ins] )* values[$ins] ) )
            // OracleWalker.g:631:3: ^( INSERT ( indexClause[$ins] )? tables[$ins] ( column_specs[$ins] )* values[$ins] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            INSERT197=(CommonTree)match(input,INSERT,FOLLOW_INSERT_in_insert_command1750); 
            INSERT197_tree = (CommonTree)adaptor.dupNode(INSERT197);

            root_1 = (CommonTree)adaptor.becomeRoot(INSERT197_tree, root_1);



            match(input, Token.DOWN, null); 
            // OracleWalker.g:631:12: ( indexClause[$ins] )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==ID) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // OracleWalker.g:631:12: indexClause[$ins]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_indexClause_in_insert_command1752);
                    indexClause198=indexClause(retval.ins);

                    state._fsp--;

                    adaptor.addChild(root_1, indexClause198.getTree());

                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_tables_in_insert_command1756);
            tables199=tables(retval.ins);

            state._fsp--;

            adaptor.addChild(root_1, tables199.getTree());
            // OracleWalker.g:631:44: ( column_specs[$ins] )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==COLUMNS) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // OracleWalker.g:631:44: column_specs[$ins]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_column_specs_in_insert_command1759);
            	    column_specs200=column_specs(retval.ins);

            	    state._fsp--;

            	    adaptor.addChild(root_1, column_specs200.getTree());

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_values_in_insert_command1763);
            values201=values(retval.ins);

            state._fsp--;

            adaptor.addChild(root_1, values201.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "insert_command"

    // Delegated rules


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\15\uffff";
    static final String DFA15_eofS =
        "\15\uffff";
    static final String DFA15_minS =
        "\1\3\14\uffff";
    static final String DFA15_maxS =
        "\1\134\14\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\2\13\1";
    static final String DFA15_specialS =
        "\15\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1\11\uffff\1\10\12\uffff\1\11\1\12\3\uffff\1\14\1\13\6\uffff"+
            "\1\1\21\uffff\1\2\15\uffff\1\4\1\5\1\3\1\6\1\7\21\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "()+ loopback of 184:3: ( condition_expr[$where,$exp] )+";
        }
    }
 

    public static final BitSet FOLLOW_start_rule_in_beg48 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_command_in_start_rule65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_command_in_start_rule71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_command_in_start_rule76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_command_in_start_rule81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setclause94 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_updateColumnSpecs_in_setclause96 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_SET_ELE_in_updateColumnSpecs111 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_updateColumnSpec_in_updateColumnSpecs113 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_updateColumnSpec127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_alias_in_updateColumnSpec129 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_identifier_in_updateColumnSpec132 = new BitSet(new long[]{0xFC3C204000010180L,0x000003120000600FL});
    public static final BitSet FOLLOW_expr_in_updateColumnSpec134 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSERT_VAL_in_values151 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_values154 = new BitSet(new long[]{0xFC3C204000010188L,0x000003120000600FL});
    public static final BitSet FOLLOW_COLUMNS_in_column_specs170 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_column_spec_in_column_specs172 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_COLUMN_in_column_spec186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_column_spec188 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_table_name_in_column_spec190 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_in_whereClause209 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sqlCondition_in_whereClause211 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUPBY_in_groupByClause226 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_columnNamesAfterWhere_in_groupByClause228 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ORDERBY_in_orderByClause241 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_columnNamesAfterWhere_in_orderByClause243 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_columnNameAfterWhere_in_columnNamesAfterWhere262 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ASC_in_columnNameAfterWhere276 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_columnNameAfterWhere279 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_table_alias_in_columnNameAfterWhere281 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DESC_in_columnNameAfterWhere289 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_columnNameAfterWhere292 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_table_alias_in_columnNameAfterWhere294 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_OR_NOT_in_sqlCondition311 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_sqlCondition313 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_OR_in_sqlCondition320 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_sqlCondition322 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_91_in_condition343 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition347 = new BitSet(new long[]{0x0080002063002008L,0x00000000180003E0L});
    public static final BitSet FOLLOW_92_in_condition359 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition361 = new BitSet(new long[]{0x0080002063002008L,0x00000000180003E0L});
    public static final BitSet FOLLOW_condition_PAREN_in_condition372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIORITY_in_condition378 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition380 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_condition_expr_in_condition_PAREN395 = new BitSet(new long[]{0x0080000063002002L,0x00000000000003E0L});
    public static final BitSet FOLLOW_comparisonCondition_in_condition_expr408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inCondition_in_condition_expr414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isCondition_in_condition_expr421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_likeCondition_in_condition_expr428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_BETWEEN_in_betweenCondition440 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_between_and_in_betweenCondition442 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BETWEEN_in_betweenCondition448 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_between_and_in_betweenCondition450 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_LIKE_in_likeCondition471 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_likeCondition473 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_likeCondition476 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIKE_in_likeCondition484 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_likeCondition486 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_likeCondition489 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISNOT_in_isCondition505 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NULL_in_isCondition507 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_isCondition509 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IS_in_isCondition517 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NULL_in_isCondition519 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_isCondition521 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_comparisonCondition538 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition540 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition543 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQ_in_comparisonCondition553 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition555 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition558 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LTH_in_comparisonCondition568 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition570 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition573 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GTH_in_comparisonCondition583 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition585 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition588 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LEQ_in_comparisonCondition598 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition600 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition603 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEQ_in_comparisonCondition613 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition615 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition618 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_LEFT_in_left_cond639 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_left_cond641 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_LISTS_in_in_list660 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_inCondition_expr_adds_in_in_list662 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_in_inCondition680 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_90_in_inCondition684 = new BitSet(new long[]{0xFC3C204000190180L,0x000003120000600FL});
    public static final BitSet FOLLOW_subquery_in_inCondition687 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_in_list_in_inCondition691 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_inCondition696 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_add_in_inCondition_expr_adds730 = new BitSet(new long[]{0xFC3C204000010102L,0x000003120000600FL});
    public static final BitSet FOLLOW_expr_add_in_expr755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_expr762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEGATIVE_in_expr_add790 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add794 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSITIVE_in_expr_add803 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add807 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr_add816 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add820 = new BitSet(new long[]{0xFC3C204000010100L,0x000003120000600FL});
    public static final BitSet FOLLOW_expr_add_in_expr_add825 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr_add834 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add838 = new BitSet(new long[]{0xFC3C204000010100L,0x000003120000600FL});
    public static final BitSet FOLLOW_expr_add_in_expr_add843 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BITOR_in_expr_add851 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add855 = new BitSet(new long[]{0xFC3C204000010100L,0x000003120000600FL});
    public static final BitSet FOLLOW_expr_add_in_expr_add860 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BITAND_in_expr_add868 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add872 = new BitSet(new long[]{0xFC3C204000010100L,0x000003120000600FL});
    public static final BitSet FOLLOW_expr_add_in_expr_add877 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BITXOR_in_expr_add885 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add889 = new BitSet(new long[]{0xFC3C204000010100L,0x000003120000600FL});
    public static final BitSet FOLLOW_expr_add_in_expr_add894 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFTLEFT_in_expr_add902 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add906 = new BitSet(new long[]{0xFC3C204000010100L,0x000003120000600FL});
    public static final BitSet FOLLOW_expr_add_in_expr_add911 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFTRIGHT_in_expr_add919 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add923 = new BitSet(new long[]{0xFC3C204000010100L,0x000003120000600FL});
    public static final BitSet FOLLOW_expr_add_in_expr_add928 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASTERISK_in_expr_add936 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add940 = new BitSet(new long[]{0xFC3C204000010100L,0x000003120000600FL});
    public static final BitSet FOLLOW_expr_add_in_expr_add945 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIVIDE_in_expr_add953 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add957 = new BitSet(new long[]{0xFC3C204000010100L,0x000003120000600FL});
    public static final BitSet FOLLOW_expr_add_in_expr_add962 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_N_in_expr_add969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_expr_add975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_literal_in_expr_add980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_expr_add984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_expr_add990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUTED_STR_in_expr_add996 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_quoted_string_in_expr_add998 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLUMN_in_expr_add1005 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_expr_add1007 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_table_name_in_expr_add1009 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLUMNAST_in_expr_add1019 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASTERISK_in_expr_add1021 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_expr_add1030 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr_add1035 = new BitSet(new long[]{0xFC3C204000010188L,0x000003120000600FL});
    public static final BitSet FOLLOW_CONSIST_in_expr_add1046 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr_add1048 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_expr_add1055 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr_add1058 = new BitSet(new long[]{0xFC3C204000010180L,0x000003120000600FL});
    public static final BitSet FOLLOW_ID_in_expr_add1064 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MULTI_STR_in_expr_add1071 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr_add1074 = new BitSet(new long[]{0xFC3C204000010188L,0x000003120000600FL});
    public static final BitSet FOLLOW_set_in_value0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_boolean_literal1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_boolean_literal1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_LIST_in_select_list1138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_displayed_column_in_select_list1140 = new BitSet(new long[]{0x0400200000000108L});
    public static final BitSet FOLLOW_TABLENAMES_in_fromClause1155 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_in_fromClause1157 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_TABLENAME_in_table1172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_spec_in_table1174 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TABLENAMES_in_tables1187 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_in_tables1189 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_schema_name_in_table_spec1209 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_table_name_in_table_spec1213 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_alias_in_table_spec1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_table_spec1224 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_alias_in_table_spec1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_table_spec1236 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_table_spec1239 = new BitSet(new long[]{0x0000000000000208L});
    public static final BitSet FOLLOW_alias_in_table_spec1245 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_identifier_in_schema_name1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBQUERY_in_subquery1276 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_select_command_in_subquery1278 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_identifier_in_table_name1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_displayed_column1311 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_displayed_column1315 = new BitSet(new long[]{0xFC3C204000010388L,0x000003120000600FL});
    public static final BitSet FOLLOW_alias_in_displayed_column1319 = new BitSet(new long[]{0xFC3C204000010188L,0x000003120000600FL});
    public static final BitSet FOLLOW_CONSIST_in_displayed_column1331 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_displayed_column1333 = new BitSet(new long[]{0x0000000000000208L});
    public static final BitSet FOLLOW_alias_in_displayed_column1335 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLUMN_in_displayed_column1343 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_alias_in_displayed_column1345 = new BitSet(new long[]{0x0400000000000000L,0x0000000000002004L});
    public static final BitSet FOLLOW_columnAnt_in_displayed_column1348 = new BitSet(new long[]{0x0000000000000208L});
    public static final BitSet FOLLOW_alias_in_displayed_column1350 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASTERISK_in_columnAnt1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_N_in_columnAnt1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_columnAnt1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_quoted_string1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COL_TAB_in_table_alias1431 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_table_alias1433 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AS_in_alias1452 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_alias1454 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_in_selectClause1475 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_indexClause_in_selectClause1477 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_select_list_in_selectClause1481 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_hints_in_indexClause1500 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ID_in_hints1520 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_hints1524 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_selectClause_in_select_command1552 = new BitSet(new long[]{0x0000400600020042L});
    public static final BitSet FOLLOW_fromClause_in_select_command1556 = new BitSet(new long[]{0x0000400600020002L});
    public static final BitSet FOLLOW_whereClause_in_select_command1563 = new BitSet(new long[]{0x0000400600000002L});
    public static final BitSet FOLLOW_groupByClause_in_select_command1569 = new BitSet(new long[]{0x0000400400000002L});
    public static final BitSet FOLLOW_orderByClause_in_select_command1575 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_for_update_in_select_command1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORUPDATE_in_for_update1604 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_of_statement_in_for_update1606 = new BitSet(new long[]{0x0002800000000008L});
    public static final BitSet FOLLOW_wait_statement_in_for_update1610 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OF_in_of_statement1628 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_of_statement1630 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOWAIT_in_wait_statement1646 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_N_in_wait_statement1648 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WAIT_in_wait_statement1658 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_N_in_wait_statement1660 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DELETE_in_delete_command1681 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_indexClause_in_delete_command1683 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_tables_in_delete_command1687 = new BitSet(new long[]{0x0000000400020008L});
    public static final BitSet FOLLOW_whereClause_in_delete_command1690 = new BitSet(new long[]{0x0000000400000008L});
    public static final BitSet FOLLOW_orderByClause_in_delete_command1694 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UPDATE_in_update_command1714 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_indexClause_in_update_command1716 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_tables_in_update_command1720 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_setclause_in_update_command1723 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_whereClause_in_update_command1726 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSERT_in_insert_command1750 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_indexClause_in_insert_command1752 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_tables_in_insert_command1756 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_column_specs_in_insert_command1759 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_values_in_insert_command1763 = new BitSet(new long[]{0x0000000000000008L});

}