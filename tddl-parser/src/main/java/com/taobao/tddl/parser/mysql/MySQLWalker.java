// $ANTLR 3.3 Nov 30, 2010 12:50:56 MySQLWalker.g 2017-07-06 19:09:20

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



import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


public class MySQLWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALIAS", "TABLENAME", "TABLENAMES", "SUBQUERY", "COLUMN", "AS", "SELECT", "DISPLAYED_COUNT_COLUMN", "DISPLAYED_COLUMN", "IN", "NOT", "SELECT_LIST", "QUTED_STR", "WHERE", "CONDITION_OR", "CONDITION_LEFT", "IN_LISTS", "CONDITION_OR_NOT", "AND", "OR", "ISNOT", "IS", "NULL", "NAN", "INFINITE", "LIKE", "NOT_LIKE", "NOT_BETWEEN", "BETWEEN", "GROUPBY", "ORDERBY", "INSERT", "INSERT_VAL", "PRIORITY", "COLUMNAST", "COLUMNS", "UPDATE", "SET", "SET_ELE", "COL_TAB", "DELETE", "CONSIST", "SKIP", "RANGE", "SHAREMODE", "FORUPDATE", "NEGATIVE", "POSITIVE", "COMMA", "EQ", "LPAREN", "RPAREN", "BITOR", "BITAND", "BITXOR", "SHIFTLEFT", "SHIFTRIGHT", "PLUS", "MINUS", "ASTERISK", "DIVIDE", "EXPONENT", "ID", "LTH", "GTH", "NOT_EQ", "LEQ", "GEQ", "ASC", "DESC", "DOT", "N", "NUMBER", "POINT", "ARROW", "DOUBLEVERTBAR", "QUOTED_STRING", "DOUBLEQUOTED_STRING", "WS", "'SET'", "'INSERT'", "'INTO'", "'VALUES'", "'GROUP'", "'BY'", "'ORDER'", "'SELECT'", "'WHERE'", "'NOT'", "'OR'", "'AND'", "'BETWEEN'", "'IS'", "'NAN'", "'INFINITE'", "'NULL'", "'IN'", "'LIKE'", "'ROWNUM'", "'FROM'", "'?'", "'TRUE'", "'FALSE'", "'AS'", "'FORCE'", "'INDEX'", "'IGNORE'", "'DELETE'", "'UPDATE'", "'LIMIT'", "'FOR'", "'LOCK'", "'SHARE'", "'MODE'"
    };
    public static final int EOF=-1;
    public static final int T__83=83;
    public static final int T__84=84;
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
    public static final int SKIP=46;
    public static final int RANGE=47;
    public static final int SHAREMODE=48;
    public static final int FORUPDATE=49;
    public static final int NEGATIVE=50;
    public static final int POSITIVE=51;
    public static final int COMMA=52;
    public static final int EQ=53;
    public static final int LPAREN=54;
    public static final int RPAREN=55;
    public static final int BITOR=56;
    public static final int BITAND=57;
    public static final int BITXOR=58;
    public static final int SHIFTLEFT=59;
    public static final int SHIFTRIGHT=60;
    public static final int PLUS=61;
    public static final int MINUS=62;
    public static final int ASTERISK=63;
    public static final int DIVIDE=64;
    public static final int EXPONENT=65;
    public static final int ID=66;
    public static final int LTH=67;
    public static final int GTH=68;
    public static final int NOT_EQ=69;
    public static final int LEQ=70;
    public static final int GEQ=71;
    public static final int ASC=72;
    public static final int DESC=73;
    public static final int DOT=74;
    public static final int N=75;
    public static final int NUMBER=76;
    public static final int POINT=77;
    public static final int ARROW=78;
    public static final int DOUBLEVERTBAR=79;
    public static final int QUOTED_STRING=80;
    public static final int DOUBLEQUOTED_STRING=81;
    public static final int WS=82;

    // delegates
    // delegators


        public MySQLWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public MySQLWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return MySQLWalker.tokenNames; }
    public String getGrammarFileName() { return "MySQLWalker.g"; }





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


    public static class beg_return extends TreeRuleReturnScope {
        public DMLCommon obj;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "beg"
    // MySQLWalker.g:67:1: beg returns [DMLCommon obj] : start_rule ;
    public final MySQLWalker.beg_return beg() throws RecognitionException {
        MySQLWalker.beg_return retval = new MySQLWalker.beg_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.start_rule_return start_rule1 = null;



        try {
            // MySQLWalker.g:67:27: ( start_rule )
            // MySQLWalker.g:68:1: start_rule
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
    // MySQLWalker.g:71:1: start_rule returns [DMLCommon obj] : ( select_command | insert_command | update_command | delete_command );
    public final MySQLWalker.start_rule_return start_rule() throws RecognitionException {
        MySQLWalker.start_rule_return retval = new MySQLWalker.start_rule_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.select_command_return select_command2 = null;

        MySQLWalker.insert_command_return insert_command3 = null;

        MySQLWalker.update_command_return update_command4 = null;

        MySQLWalker.delete_command_return delete_command5 = null;



        try {
            // MySQLWalker.g:72:2: ( select_command | insert_command | update_command | delete_command )
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
                    // MySQLWalker.g:72:3: select_command
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_select_command_in_start_rule65);
                    select_command2=select_command();

                    state._fsp--;

                    adaptor.addChild(root_0, select_command2.getTree());
                    retval.obj =(select_command2!=null?select_command2.select:null);

                    }
                    break;
                case 2 :
                    // MySQLWalker.g:73:3: insert_command
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_insert_command_in_start_rule70);
                    insert_command3=insert_command();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_command3.getTree());
                    retval.obj =(insert_command3!=null?insert_command3.ins:null);

                    }
                    break;
                case 3 :
                    // MySQLWalker.g:74:3: update_command
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_update_command_in_start_rule75);
                    update_command4=update_command();

                    state._fsp--;

                    adaptor.addChild(root_0, update_command4.getTree());
                    retval.obj =(update_command4!=null?update_command4.update:null);

                    }
                    break;
                case 4 :
                    // MySQLWalker.g:75:3: delete_command
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_delete_command_in_start_rule80);
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
    // MySQLWalker.g:78:1: setclause[Update update] : ^( SET ( updateColumnSpecs[$update] )+ ) ;
    public final MySQLWalker.setclause_return setclause(Update update) throws RecognitionException {
        MySQLWalker.setclause_return retval = new MySQLWalker.setclause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SET6=null;
        MySQLWalker.updateColumnSpecs_return updateColumnSpecs7 = null;


        CommonTree SET6_tree=null;

        try {
            // MySQLWalker.g:79:2: ( ^( SET ( updateColumnSpecs[$update] )+ ) )
            // MySQLWalker.g:79:3: ^( SET ( updateColumnSpecs[$update] )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            SET6=(CommonTree)match(input,SET,FOLLOW_SET_in_setclause93); 
            SET6_tree = (CommonTree)adaptor.dupNode(SET6);

            root_1 = (CommonTree)adaptor.becomeRoot(SET6_tree, root_1);



            match(input, Token.DOWN, null); 
            // MySQLWalker.g:79:9: ( updateColumnSpecs[$update] )+
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
            	    // MySQLWalker.g:79:9: updateColumnSpecs[$update]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_updateColumnSpecs_in_setclause95);
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
    // MySQLWalker.g:81:1: updateColumnSpecs[Update update] : ^( SET_ELE updateColumnSpec[$update] ) ;
    public final MySQLWalker.updateColumnSpecs_return updateColumnSpecs(Update update) throws RecognitionException {
        MySQLWalker.updateColumnSpecs_return retval = new MySQLWalker.updateColumnSpecs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SET_ELE8=null;
        MySQLWalker.updateColumnSpec_return updateColumnSpec9 = null;


        CommonTree SET_ELE8_tree=null;

        try {
            // MySQLWalker.g:82:2: ( ^( SET_ELE updateColumnSpec[$update] ) )
            // MySQLWalker.g:82:3: ^( SET_ELE updateColumnSpec[$update] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            SET_ELE8=(CommonTree)match(input,SET_ELE,FOLLOW_SET_ELE_in_updateColumnSpecs110); 
            SET_ELE8_tree = (CommonTree)adaptor.dupNode(SET_ELE8);

            root_1 = (CommonTree)adaptor.becomeRoot(SET_ELE8_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_updateColumnSpec_in_updateColumnSpecs112);
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
    // MySQLWalker.g:84:1: updateColumnSpec[Update update] : ^( EQ ( table_alias )? identifier expr[$update.getIndexHolder()] ) ;
    public final MySQLWalker.updateColumnSpec_return updateColumnSpec(Update update) throws RecognitionException {
        MySQLWalker.updateColumnSpec_return retval = new MySQLWalker.updateColumnSpec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQ10=null;
        MySQLWalker.table_alias_return table_alias11 = null;

        MySQLWalker.identifier_return identifier12 = null;

        MySQLWalker.expr_return expr13 = null;


        CommonTree EQ10_tree=null;

        try {
            // MySQLWalker.g:85:2: ( ^( EQ ( table_alias )? identifier expr[$update.getIndexHolder()] ) )
            // MySQLWalker.g:85:3: ^( EQ ( table_alias )? identifier expr[$update.getIndexHolder()] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            EQ10=(CommonTree)match(input,EQ,FOLLOW_EQ_in_updateColumnSpec126); 
            EQ10_tree = (CommonTree)adaptor.dupNode(EQ10);

            root_1 = (CommonTree)adaptor.becomeRoot(EQ10_tree, root_1);



            match(input, Token.DOWN, null); 
            // MySQLWalker.g:85:8: ( table_alias )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==COL_TAB) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // MySQLWalker.g:85:8: table_alias
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_table_alias_in_updateColumnSpec128);
                    table_alias11=table_alias();

                    state._fsp--;

                    adaptor.addChild(root_1, table_alias11.getTree());

                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_updateColumnSpec131);
            identifier12=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier12.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_updateColumnSpec133);
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

    public static class insert_command_return extends TreeRuleReturnScope {
        public Insert ins;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "insert_command"
    // MySQLWalker.g:91:1: insert_command returns [Insert ins] : ^( INSERT tables[$ins] ( column_specs[$ins] )* values[$ins] ) ;
    public final MySQLWalker.insert_command_return insert_command() throws RecognitionException {
        MySQLWalker.insert_command_return retval = new MySQLWalker.insert_command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INSERT14=null;
        MySQLWalker.tables_return tables15 = null;

        MySQLWalker.column_specs_return column_specs16 = null;

        MySQLWalker.values_return values17 = null;


        CommonTree INSERT14_tree=null;

        retval.ins =new Insert();
        try {
            // MySQLWalker.g:93:2: ( ^( INSERT tables[$ins] ( column_specs[$ins] )* values[$ins] ) )
            // MySQLWalker.g:93:3: ^( INSERT tables[$ins] ( column_specs[$ins] )* values[$ins] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            INSERT14=(CommonTree)match(input,INSERT,FOLLOW_INSERT_in_insert_command156); 
            INSERT14_tree = (CommonTree)adaptor.dupNode(INSERT14);

            root_1 = (CommonTree)adaptor.becomeRoot(INSERT14_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_tables_in_insert_command158);
            tables15=tables(retval.ins);

            state._fsp--;

            adaptor.addChild(root_1, tables15.getTree());
            // MySQLWalker.g:93:25: ( column_specs[$ins] )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COLUMNS) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // MySQLWalker.g:93:25: column_specs[$ins]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_column_specs_in_insert_command161);
            	    column_specs16=column_specs(retval.ins);

            	    state._fsp--;

            	    adaptor.addChild(root_1, column_specs16.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_values_in_insert_command165);
            values17=values(retval.ins);

            state._fsp--;

            adaptor.addChild(root_1, values17.getTree());

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

    public static class values_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "values"
    // MySQLWalker.g:95:1: values[Insert ins] : ^( INSERT_VAL ( expr[$ins.getIndexHolder()] )* ) ;
    public final MySQLWalker.values_return values(Insert ins) throws RecognitionException {
        MySQLWalker.values_return retval = new MySQLWalker.values_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INSERT_VAL18=null;
        MySQLWalker.expr_return expr19 = null;


        CommonTree INSERT_VAL18_tree=null;

        try {
            // MySQLWalker.g:95:20: ( ^( INSERT_VAL ( expr[$ins.getIndexHolder()] )* ) )
            // MySQLWalker.g:95:21: ^( INSERT_VAL ( expr[$ins.getIndexHolder()] )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            INSERT_VAL18=(CommonTree)match(input,INSERT_VAL,FOLLOW_INSERT_VAL_in_values177); 
            INSERT_VAL18_tree = (CommonTree)adaptor.dupNode(INSERT_VAL18);

            root_1 = (CommonTree)adaptor.becomeRoot(INSERT_VAL18_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // MySQLWalker.g:95:34: ( expr[$ins.getIndexHolder()] )*
                loop5:
                do {
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=SUBQUERY && LA5_0<=COLUMN)||LA5_0==QUTED_STR||LA5_0==COLUMNAST||LA5_0==CONSIST||(LA5_0>=NEGATIVE && LA5_0<=POSITIVE)||(LA5_0>=BITOR && LA5_0<=DIVIDE)||LA5_0==ID||(LA5_0>=N && LA5_0<=NUMBER)||LA5_0==99||LA5_0==102||(LA5_0>=104 && LA5_0<=106)) ) {
                        alt5=1;
                    }


                    switch (alt5) {
                	case 1 :
                	    // MySQLWalker.g:95:35: expr[$ins.getIndexHolder()]
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_expr_in_values180);
                	    expr19=expr(ins.getIndexHolder());

                	    state._fsp--;

                	    adaptor.addChild(root_1, expr19.getTree());
                	    ins.addValue((expr19!=null?expr19.valueObj:null));

                	    }
                	    break;

                	default :
                	    break loop5;
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
    // MySQLWalker.g:97:1: column_specs[Insert ins] : ^( COLUMNS ( column_spec[$ins] )+ ) ;
    public final MySQLWalker.column_specs_return column_specs(Insert ins) throws RecognitionException {
        MySQLWalker.column_specs_return retval = new MySQLWalker.column_specs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COLUMNS20=null;
        MySQLWalker.column_spec_return column_spec21 = null;


        CommonTree COLUMNS20_tree=null;

        try {
            // MySQLWalker.g:98:2: ( ^( COLUMNS ( column_spec[$ins] )+ ) )
            // MySQLWalker.g:98:3: ^( COLUMNS ( column_spec[$ins] )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            COLUMNS20=(CommonTree)match(input,COLUMNS,FOLLOW_COLUMNS_in_column_specs196); 
            COLUMNS20_tree = (CommonTree)adaptor.dupNode(COLUMNS20);

            root_1 = (CommonTree)adaptor.becomeRoot(COLUMNS20_tree, root_1);



            match(input, Token.DOWN, null); 
            // MySQLWalker.g:98:13: ( column_spec[$ins] )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COLUMN) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // MySQLWalker.g:98:13: column_spec[$ins]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_column_spec_in_column_specs198);
            	    column_spec21=column_spec(ins);

            	    state._fsp--;

            	    adaptor.addChild(root_1, column_spec21.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // MySQLWalker.g:100:1: column_spec[Insert ins] : ^( COLUMN identifier ( table_name )? ) ;
    public final MySQLWalker.column_spec_return column_spec(Insert ins) throws RecognitionException {
        MySQLWalker.column_spec_return retval = new MySQLWalker.column_spec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COLUMN22=null;
        MySQLWalker.identifier_return identifier23 = null;

        MySQLWalker.table_name_return table_name24 = null;


        CommonTree COLUMN22_tree=null;

        try {
            // MySQLWalker.g:101:2: ( ^( COLUMN identifier ( table_name )? ) )
            // MySQLWalker.g:101:3: ^( COLUMN identifier ( table_name )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            COLUMN22=(CommonTree)match(input,COLUMN,FOLLOW_COLUMN_in_column_spec212); 
            COLUMN22_tree = (CommonTree)adaptor.dupNode(COLUMN22);

            root_1 = (CommonTree)adaptor.becomeRoot(COLUMN22_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_column_spec214);
            identifier23=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier23.getTree());
            // MySQLWalker.g:101:23: ( table_name )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // MySQLWalker.g:101:23: table_name
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_table_name_in_column_spec216);
                    table_name24=table_name();

                    state._fsp--;

                    adaptor.addChild(root_1, table_name24.getTree());

                    }
                    break;

            }


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		ins.addColumnTandC((table_name24!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(table_name24.start),
              input.getTreeAdaptor().getTokenStopIndex(table_name24.start))):null),(identifier23!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(identifier23.start),
              input.getTreeAdaptor().getTokenStopIndex(identifier23.start))):null));
            	

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
    // MySQLWalker.g:109:1: whereClause[WhereCondition where] : ^( WHERE sqlCondition[$where] ) ;
    public final MySQLWalker.whereClause_return whereClause(WhereCondition where) throws RecognitionException {
        MySQLWalker.whereClause_return retval = new MySQLWalker.whereClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree WHERE25=null;
        MySQLWalker.sqlCondition_return sqlCondition26 = null;


        CommonTree WHERE25_tree=null;

        try {
            // MySQLWalker.g:110:2: ( ^( WHERE sqlCondition[$where] ) )
            // MySQLWalker.g:110:3: ^( WHERE sqlCondition[$where] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            WHERE25=(CommonTree)match(input,WHERE,FOLLOW_WHERE_in_whereClause235); 
            WHERE25_tree = (CommonTree)adaptor.dupNode(WHERE25);

            root_1 = (CommonTree)adaptor.becomeRoot(WHERE25_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_sqlCondition_in_whereClause237);
            sqlCondition26=sqlCondition(where);

            state._fsp--;

            adaptor.addChild(root_1, sqlCondition26.getTree());

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
    // MySQLWalker.g:112:1: groupByClause[WhereCondition where] : ^( GROUPBY columnNamesAfterWhere ) ;
    public final MySQLWalker.groupByClause_return groupByClause(WhereCondition where) throws RecognitionException {
        MySQLWalker.groupByClause_return retval = new MySQLWalker.groupByClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GROUPBY27=null;
        MySQLWalker.columnNamesAfterWhere_return columnNamesAfterWhere28 = null;


        CommonTree GROUPBY27_tree=null;

        try {
            // MySQLWalker.g:113:2: ( ^( GROUPBY columnNamesAfterWhere ) )
            // MySQLWalker.g:113:3: ^( GROUPBY columnNamesAfterWhere )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            GROUPBY27=(CommonTree)match(input,GROUPBY,FOLLOW_GROUPBY_in_groupByClause250); 
            GROUPBY27_tree = (CommonTree)adaptor.dupNode(GROUPBY27);

            root_1 = (CommonTree)adaptor.becomeRoot(GROUPBY27_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_columnNamesAfterWhere_in_groupByClause252);
            columnNamesAfterWhere28=columnNamesAfterWhere();

            state._fsp--;

            adaptor.addChild(root_1, columnNamesAfterWhere28.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		where.setGroupByColumns((columnNamesAfterWhere28!=null?columnNamesAfterWhere28.ret:null));
            	

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
    // MySQLWalker.g:117:1: orderByClause[WhereCondition where] : ^( ORDERBY columnNamesAfterWhere ) ;
    public final MySQLWalker.orderByClause_return orderByClause(WhereCondition where) throws RecognitionException {
        MySQLWalker.orderByClause_return retval = new MySQLWalker.orderByClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ORDERBY29=null;
        MySQLWalker.columnNamesAfterWhere_return columnNamesAfterWhere30 = null;


        CommonTree ORDERBY29_tree=null;

        try {
            // MySQLWalker.g:118:2: ( ^( ORDERBY columnNamesAfterWhere ) )
            // MySQLWalker.g:118:3: ^( ORDERBY columnNamesAfterWhere )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ORDERBY29=(CommonTree)match(input,ORDERBY,FOLLOW_ORDERBY_in_orderByClause265); 
            ORDERBY29_tree = (CommonTree)adaptor.dupNode(ORDERBY29);

            root_1 = (CommonTree)adaptor.becomeRoot(ORDERBY29_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_columnNamesAfterWhere_in_orderByClause267);
            columnNamesAfterWhere30=columnNamesAfterWhere();

            state._fsp--;

            adaptor.addChild(root_1, columnNamesAfterWhere30.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		where.setOrderByColumns((columnNamesAfterWhere30!=null?columnNamesAfterWhere30.ret:null));
            	

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
    // MySQLWalker.g:122:1: columnNamesAfterWhere returns [List<OrderByEle> ret] : ( columnNameAfterWhere[$ret] )+ ;
    public final MySQLWalker.columnNamesAfterWhere_return columnNamesAfterWhere() throws RecognitionException {
        MySQLWalker.columnNamesAfterWhere_return retval = new MySQLWalker.columnNamesAfterWhere_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.columnNameAfterWhere_return columnNameAfterWhere31 = null;




        	retval.ret = new ArrayList<OrderByEle>();

        try {
            // MySQLWalker.g:126:2: ( ( columnNameAfterWhere[$ret] )+ )
            // MySQLWalker.g:126:3: ( columnNameAfterWhere[$ret] )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // MySQLWalker.g:126:3: ( columnNameAfterWhere[$ret] )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=ASC && LA8_0<=DESC)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // MySQLWalker.g:126:4: columnNameAfterWhere[$ret]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_columnNameAfterWhere_in_columnNamesAfterWhere286);
            	    columnNameAfterWhere31=columnNameAfterWhere(retval.ret);

            	    state._fsp--;

            	    adaptor.addChild(root_0, columnNameAfterWhere31.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // MySQLWalker.g:128:1: columnNameAfterWhere[List<OrderByEle> orderByEles] : ( ^( ASC identifier ( table_alias )? ) | ^( DESC identifier ( table_alias )? ) );
    public final MySQLWalker.columnNameAfterWhere_return columnNameAfterWhere(List<OrderByEle> orderByEles) throws RecognitionException {
        MySQLWalker.columnNameAfterWhere_return retval = new MySQLWalker.columnNameAfterWhere_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASC32=null;
        CommonTree DESC35=null;
        MySQLWalker.identifier_return identifier33 = null;

        MySQLWalker.table_alias_return table_alias34 = null;

        MySQLWalker.identifier_return identifier36 = null;

        MySQLWalker.table_alias_return table_alias37 = null;


        CommonTree ASC32_tree=null;
        CommonTree DESC35_tree=null;

        try {
            // MySQLWalker.g:129:2: ( ^( ASC identifier ( table_alias )? ) | ^( DESC identifier ( table_alias )? ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ASC) ) {
                alt11=1;
            }
            else if ( (LA11_0==DESC) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // MySQLWalker.g:129:3: ^( ASC identifier ( table_alias )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ASC32=(CommonTree)match(input,ASC,FOLLOW_ASC_in_columnNameAfterWhere300); 
                    ASC32_tree = (CommonTree)adaptor.dupNode(ASC32);

                    root_1 = (CommonTree)adaptor.becomeRoot(ASC32_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_columnNameAfterWhere303);
                    identifier33=identifier();

                    state._fsp--;

                    adaptor.addChild(root_1, identifier33.getTree());
                    // MySQLWalker.g:129:21: ( table_alias )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==COL_TAB) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // MySQLWalker.g:129:21: table_alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_table_alias_in_columnNameAfterWhere305);
                            table_alias34=table_alias();

                            state._fsp--;

                            adaptor.addChild(root_1, table_alias34.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		orderByEles.add(new OrderByEle((table_alias34!=null?table_alias34.aText:null),(identifier33!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(identifier33.start),
                      input.getTreeAdaptor().getTokenStopIndex(identifier33.start))):null),true));
                    	

                    }
                    break;
                case 2 :
                    // MySQLWalker.g:132:3: ^( DESC identifier ( table_alias )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DESC35=(CommonTree)match(input,DESC,FOLLOW_DESC_in_columnNameAfterWhere313); 
                    DESC35_tree = (CommonTree)adaptor.dupNode(DESC35);

                    root_1 = (CommonTree)adaptor.becomeRoot(DESC35_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_columnNameAfterWhere316);
                    identifier36=identifier();

                    state._fsp--;

                    adaptor.addChild(root_1, identifier36.getTree());
                    // MySQLWalker.g:132:22: ( table_alias )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==COL_TAB) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // MySQLWalker.g:132:22: table_alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_table_alias_in_columnNameAfterWhere318);
                            table_alias37=table_alias();

                            state._fsp--;

                            adaptor.addChild(root_1, table_alias37.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		orderByEles.add(new OrderByEle((table_alias37!=null?table_alias37.aText:null),(identifier36!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(identifier36.start),
                      input.getTreeAdaptor().getTokenStopIndex(identifier36.start))):null),false));
                    	

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

    public static class selectClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selectClause"
    // MySQLWalker.g:137:1: selectClause[Select select] : ^( SELECT select_list[$select] ) ;
    public final MySQLWalker.selectClause_return selectClause(Select select) throws RecognitionException {
        MySQLWalker.selectClause_return retval = new MySQLWalker.selectClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SELECT38=null;
        MySQLWalker.select_list_return select_list39 = null;


        CommonTree SELECT38_tree=null;

        try {
            // MySQLWalker.g:138:5: ( ^( SELECT select_list[$select] ) )
            // MySQLWalker.g:138:6: ^( SELECT select_list[$select] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            SELECT38=(CommonTree)match(input,SELECT,FOLLOW_SELECT_in_selectClause336); 
            SELECT38_tree = (CommonTree)adaptor.dupNode(SELECT38);

            root_1 = (CommonTree)adaptor.becomeRoot(SELECT38_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_select_list_in_selectClause338);
            select_list39=select_list(select);

            state._fsp--;

            adaptor.addChild(root_1, select_list39.getTree());

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

    public static class sqlCondition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlCondition"
    // MySQLWalker.g:141:1: sqlCondition[WhereCondition where] : ( ^( CONDITION_OR_NOT condition[where.getHolder(),where.getExpGroup(),false] ) | ^( CONDITION_OR condition[where.getHolder(),where.getExpGroup(),false] ) );
    public final MySQLWalker.sqlCondition_return sqlCondition(WhereCondition where) throws RecognitionException {
        MySQLWalker.sqlCondition_return retval = new MySQLWalker.sqlCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CONDITION_OR_NOT40=null;
        CommonTree CONDITION_OR42=null;
        MySQLWalker.condition_return condition41 = null;

        MySQLWalker.condition_return condition43 = null;


        CommonTree CONDITION_OR_NOT40_tree=null;
        CommonTree CONDITION_OR42_tree=null;

        try {
            // MySQLWalker.g:143:2: ( ^( CONDITION_OR_NOT condition[where.getHolder(),where.getExpGroup(),false] ) | ^( CONDITION_OR condition[where.getHolder(),where.getExpGroup(),false] ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==CONDITION_OR_NOT) ) {
                alt12=1;
            }
            else if ( (LA12_0==CONDITION_OR) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // MySQLWalker.g:143:3: ^( CONDITION_OR_NOT condition[where.getHolder(),where.getExpGroup(),false] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CONDITION_OR_NOT40=(CommonTree)match(input,CONDITION_OR_NOT,FOLLOW_CONDITION_OR_NOT_in_sqlCondition359); 
                    CONDITION_OR_NOT40_tree = (CommonTree)adaptor.dupNode(CONDITION_OR_NOT40);

                    root_1 = (CommonTree)adaptor.becomeRoot(CONDITION_OR_NOT40_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_sqlCondition361);
                    condition41=condition(where.getHolder(), where.getExpGroup(), false);

                    state._fsp--;

                    adaptor.addChild(root_1, condition41.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // MySQLWalker.g:144:3: ^( CONDITION_OR condition[where.getHolder(),where.getExpGroup(),false] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CONDITION_OR42=(CommonTree)match(input,CONDITION_OR,FOLLOW_CONDITION_OR_in_sqlCondition368); 
                    CONDITION_OR42_tree = (CommonTree)adaptor.dupNode(CONDITION_OR42);

                    root_1 = (CommonTree)adaptor.becomeRoot(CONDITION_OR42_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_sqlCondition370);
                    condition43=condition(where.getHolder(), where.getExpGroup(), false);

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
    // $ANTLR end "sqlCondition"

    public static class condition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition"
    // MySQLWalker.g:147:1: condition[BindIndexHolder where,ExpressionGroup eg,boolean isPriority] : ( ^( 'OR' (s1= condition[where,orExp,$isPriority] )+ ) | ^( 'AND' ( condition[where,andExp,$isPriority] )+ ) | condition_PAREN[where,$eg] | ^( PRIORITY condition[where,$eg,true] ) );
    public final MySQLWalker.condition_return condition(BindIndexHolder where, ExpressionGroup eg, boolean isPriority) throws RecognitionException {
        MySQLWalker.condition_return retval = new MySQLWalker.condition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree string_literal44=null;
        CommonTree string_literal45=null;
        CommonTree PRIORITY48=null;
        MySQLWalker.condition_return s1 = null;

        MySQLWalker.condition_return condition46 = null;

        MySQLWalker.condition_PAREN_return condition_PAREN47 = null;

        MySQLWalker.condition_return condition49 = null;


        CommonTree string_literal44_tree=null;
        CommonTree string_literal45_tree=null;
        CommonTree PRIORITY48_tree=null;

        try {
            // MySQLWalker.g:151:2: ( ^( 'OR' (s1= condition[where,orExp,$isPriority] )+ ) | ^( 'AND' ( condition[where,andExp,$isPriority] )+ ) | condition_PAREN[where,$eg] | ^( PRIORITY condition[where,$eg,true] ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt15=1;
                }
                break;
            case 94:
                {
                alt15=2;
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
                alt15=3;
                }
                break;
            case PRIORITY:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // MySQLWalker.g:152:2: ^( 'OR' (s1= condition[where,orExp,$isPriority] )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    		OrExpressionGroup orExp=new OrExpressionGroup();
                    		eg.addExpressionGroup(orExp);
                    	
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    string_literal44=(CommonTree)match(input,93,FOLLOW_93_in_condition391); 
                    string_literal44_tree = (CommonTree)adaptor.dupNode(string_literal44);

                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal44_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // MySQLWalker.g:155:12: (s1= condition[where,orExp,$isPriority] )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==IN||(LA13_0>=ISNOT && LA13_0<=IS)||(LA13_0>=LIKE && LA13_0<=NOT_LIKE)||LA13_0==PRIORITY||LA13_0==EQ||(LA13_0>=LTH && LA13_0<=GEQ)||(LA13_0>=93 && LA13_0<=94)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // MySQLWalker.g:155:12: s1= condition[where,orExp,$isPriority]
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_condition_in_condition395);
                    	    s1=condition(where, orExp, isPriority);

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, s1.getTree());

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
                case 2 :
                    // MySQLWalker.g:157:2: ^( 'AND' ( condition[where,andExp,$isPriority] )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    		ExpressionGroup andExp=new ExpressionGroup();
                    		eg.addExpressionGroup(andExp);
                    	
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    string_literal45=(CommonTree)match(input,94,FOLLOW_94_in_condition407); 
                    string_literal45_tree = (CommonTree)adaptor.dupNode(string_literal45);

                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal45_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // MySQLWalker.g:160:11: ( condition[where,andExp,$isPriority] )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==IN||(LA14_0>=ISNOT && LA14_0<=IS)||(LA14_0>=LIKE && LA14_0<=NOT_LIKE)||LA14_0==PRIORITY||LA14_0==EQ||(LA14_0>=LTH && LA14_0<=GEQ)||(LA14_0>=93 && LA14_0<=94)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // MySQLWalker.g:160:11: condition[where,andExp,$isPriority]
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_condition_in_condition409);
                    	    condition46=condition(where, andExp, isPriority);

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, condition46.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // MySQLWalker.g:165:3: condition_PAREN[where,$eg]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_PAREN_in_condition420);
                    condition_PAREN47=condition_PAREN(where, eg);

                    state._fsp--;

                    adaptor.addChild(root_0, condition_PAREN47.getTree());

                    }
                    break;
                case 4 :
                    // MySQLWalker.g:166:3: ^( PRIORITY condition[where,$eg,true] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PRIORITY48=(CommonTree)match(input,PRIORITY,FOLLOW_PRIORITY_in_condition426); 
                    PRIORITY48_tree = (CommonTree)adaptor.dupNode(PRIORITY48);

                    root_1 = (CommonTree)adaptor.becomeRoot(PRIORITY48_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_condition428);
                    condition49=condition(where, eg, true);

                    state._fsp--;

                    adaptor.addChild(root_1, condition49.getTree());

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
    // MySQLWalker.g:186:1: condition_PAREN[BindIndexHolder where,ExpressionGroup exp] : ( condition_expr[$where,$exp] )+ ;
    public final MySQLWalker.condition_PAREN_return condition_PAREN(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        MySQLWalker.condition_PAREN_return retval = new MySQLWalker.condition_PAREN_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.condition_expr_return condition_expr50 = null;



        try {
            // MySQLWalker.g:187:2: ( ( condition_expr[$where,$exp] )+ )
            // MySQLWalker.g:187:3: ( condition_expr[$where,$exp] )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // MySQLWalker.g:187:3: ( condition_expr[$where,$exp] )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // MySQLWalker.g:187:3: condition_expr[$where,$exp]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_condition_expr_in_condition_PAREN443);
            	    condition_expr50=condition_expr(where, exp);

            	    state._fsp--;

            	    adaptor.addChild(root_0, condition_expr50.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
    // MySQLWalker.g:189:1: condition_expr[BindIndexHolder where,ExpressionGroup exp] : ( comparisonCondition[$where,$exp] | inCondition[$where,$exp] | isCondition[$where,$exp] | likeCondition[$where,$exp] );
    public final MySQLWalker.condition_expr_return condition_expr(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        MySQLWalker.condition_expr_return retval = new MySQLWalker.condition_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.comparisonCondition_return comparisonCondition51 = null;

        MySQLWalker.inCondition_return inCondition52 = null;

        MySQLWalker.isCondition_return isCondition53 = null;

        MySQLWalker.likeCondition_return likeCondition54 = null;



        try {
            // MySQLWalker.g:190:2: ( comparisonCondition[$where,$exp] | inCondition[$where,$exp] | isCondition[$where,$exp] | likeCondition[$where,$exp] )
            int alt17=4;
            switch ( input.LA(1) ) {
            case EQ:
            case LTH:
            case GTH:
            case NOT_EQ:
            case LEQ:
            case GEQ:
                {
                alt17=1;
                }
                break;
            case IN:
                {
                alt17=2;
                }
                break;
            case ISNOT:
            case IS:
                {
                alt17=3;
                }
                break;
            case LIKE:
            case NOT_LIKE:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // MySQLWalker.g:190:4: comparisonCondition[$where,$exp]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_comparisonCondition_in_condition_expr456);
                    comparisonCondition51=comparisonCondition(where, exp);

                    state._fsp--;

                    adaptor.addChild(root_0, comparisonCondition51.getTree());

                    }
                    break;
                case 2 :
                    // MySQLWalker.g:191:4: inCondition[$where,$exp]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_inCondition_in_condition_expr462);
                    inCondition52=inCondition(where, exp);

                    state._fsp--;

                    adaptor.addChild(root_0, inCondition52.getTree());

                    }
                    break;
                case 3 :
                    // MySQLWalker.g:192:4: isCondition[$where,$exp]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_isCondition_in_condition_expr469);
                    isCondition53=isCondition(where, exp);

                    state._fsp--;

                    adaptor.addChild(root_0, isCondition53.getTree());

                    }
                    break;
                case 4 :
                    // MySQLWalker.g:193:4: likeCondition[$where,$exp]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_likeCondition_in_condition_expr476);
                    likeCondition54=likeCondition(where, exp);

                    state._fsp--;

                    adaptor.addChild(root_0, likeCondition54.getTree());

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
    // MySQLWalker.g:196:1: betweenCondition : ( ^( NOT_BETWEEN between_and ) | ^( BETWEEN between_and ) );
    public final MySQLWalker.betweenCondition_return betweenCondition() throws RecognitionException {
        MySQLWalker.betweenCondition_return retval = new MySQLWalker.betweenCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NOT_BETWEEN55=null;
        CommonTree BETWEEN57=null;
        MySQLWalker.between_and_return between_and56 = null;

        MySQLWalker.between_and_return between_and58 = null;


        CommonTree NOT_BETWEEN55_tree=null;
        CommonTree BETWEEN57_tree=null;

        try {
            // MySQLWalker.g:197:2: ( ^( NOT_BETWEEN between_and ) | ^( BETWEEN between_and ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==NOT_BETWEEN) ) {
                alt18=1;
            }
            else if ( (LA18_0==BETWEEN) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // MySQLWalker.g:197:3: ^( NOT_BETWEEN between_and )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    NOT_BETWEEN55=(CommonTree)match(input,NOT_BETWEEN,FOLLOW_NOT_BETWEEN_in_betweenCondition488); 
                    NOT_BETWEEN55_tree = (CommonTree)adaptor.dupNode(NOT_BETWEEN55);

                    root_1 = (CommonTree)adaptor.becomeRoot(NOT_BETWEEN55_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_between_and_in_betweenCondition490);
                        between_and56=between_and();

                        state._fsp--;

                        adaptor.addChild(root_1, between_and56.getTree());

                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // MySQLWalker.g:198:3: ^( BETWEEN between_and )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    BETWEEN57=(CommonTree)match(input,BETWEEN,FOLLOW_BETWEEN_in_betweenCondition496); 
                    BETWEEN57_tree = (CommonTree)adaptor.dupNode(BETWEEN57);

                    root_1 = (CommonTree)adaptor.becomeRoot(BETWEEN57_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_between_and_in_betweenCondition498);
                        between_and58=between_and();

                        state._fsp--;

                        adaptor.addChild(root_1, between_and58.getTree());

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
    // MySQLWalker.g:200:1: between_and : ;
    public final MySQLWalker.between_and_return between_and() throws RecognitionException {
        MySQLWalker.between_and_return retval = new MySQLWalker.between_and_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        try {
            // MySQLWalker.g:201:2: ()
            // MySQLWalker.g:202:2: 
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
    // MySQLWalker.g:203:1: likeCondition[BindIndexHolder where,ExpressionGroup exp] : ( ^( NOT_LIKE expr[$where] left_cond[$where] ) | ^( LIKE expr[$where] left_cond[$where] ) );
    public final MySQLWalker.likeCondition_return likeCondition(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        MySQLWalker.likeCondition_return retval = new MySQLWalker.likeCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NOT_LIKE59=null;
        CommonTree LIKE62=null;
        MySQLWalker.expr_return expr60 = null;

        MySQLWalker.left_cond_return left_cond61 = null;

        MySQLWalker.expr_return expr63 = null;

        MySQLWalker.left_cond_return left_cond64 = null;


        CommonTree NOT_LIKE59_tree=null;
        CommonTree LIKE62_tree=null;

        try {
            // MySQLWalker.g:204:2: ( ^( NOT_LIKE expr[$where] left_cond[$where] ) | ^( LIKE expr[$where] left_cond[$where] ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==NOT_LIKE) ) {
                alt19=1;
            }
            else if ( (LA19_0==LIKE) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // MySQLWalker.g:204:3: ^( NOT_LIKE expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    NOT_LIKE59=(CommonTree)match(input,NOT_LIKE,FOLLOW_NOT_LIKE_in_likeCondition519); 
                    NOT_LIKE59_tree = (CommonTree)adaptor.dupNode(NOT_LIKE59);

                    root_1 = (CommonTree)adaptor.becomeRoot(NOT_LIKE59_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_likeCondition521);
                    expr60=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr60.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_likeCondition524);
                    left_cond61=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond61.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    			NotLike notlike=new NotLike();
                    		notlike.setLeft((left_cond61!=null?left_cond61.ret:null));
                    		notlike.setRight((expr60!=null?expr60.valueObj:null));
                    		exp.addExpression(notlike);
                    	

                    }
                    break;
                case 2 :
                    // MySQLWalker.g:210:3: ^( LIKE expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    LIKE62=(CommonTree)match(input,LIKE,FOLLOW_LIKE_in_likeCondition532); 
                    LIKE62_tree = (CommonTree)adaptor.dupNode(LIKE62);

                    root_1 = (CommonTree)adaptor.becomeRoot(LIKE62_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_likeCondition534);
                    expr63=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr63.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_likeCondition537);
                    left_cond64=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond64.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		Like like=new Like();
                    		like.setLeft((left_cond64!=null?left_cond64.ret:null));
                    		like.setRight((expr63!=null?expr63.valueObj:null));
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
    // MySQLWalker.g:218:1: isCondition[BindIndexHolder where,ExpressionGroup exp] : ( ^( ISNOT NULL left_cond[$where] ) | ^( IS NULL left_cond[$where] ) );
    public final MySQLWalker.isCondition_return isCondition(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        MySQLWalker.isCondition_return retval = new MySQLWalker.isCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ISNOT65=null;
        CommonTree NULL66=null;
        CommonTree IS68=null;
        CommonTree NULL69=null;
        MySQLWalker.left_cond_return left_cond67 = null;

        MySQLWalker.left_cond_return left_cond70 = null;


        CommonTree ISNOT65_tree=null;
        CommonTree NULL66_tree=null;
        CommonTree IS68_tree=null;
        CommonTree NULL69_tree=null;

        try {
            // MySQLWalker.g:219:2: ( ^( ISNOT NULL left_cond[$where] ) | ^( IS NULL left_cond[$where] ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ISNOT) ) {
                alt20=1;
            }
            else if ( (LA20_0==IS) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // MySQLWalker.g:219:3: ^( ISNOT NULL left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ISNOT65=(CommonTree)match(input,ISNOT,FOLLOW_ISNOT_in_isCondition553); 
                    ISNOT65_tree = (CommonTree)adaptor.dupNode(ISNOT65);

                    root_1 = (CommonTree)adaptor.becomeRoot(ISNOT65_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    NULL66=(CommonTree)match(input,NULL,FOLLOW_NULL_in_isCondition555); 
                    NULL66_tree = (CommonTree)adaptor.dupNode(NULL66);

                    adaptor.addChild(root_1, NULL66_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_isCondition557);
                    left_cond67=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond67.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		IsNot arg=new IsNot();
                    		arg.setLeft((left_cond67!=null?left_cond67.ret:null));
                    		arg.setRight(null);
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 2 :
                    // MySQLWalker.g:225:3: ^( IS NULL left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    IS68=(CommonTree)match(input,IS,FOLLOW_IS_in_isCondition565); 
                    IS68_tree = (CommonTree)adaptor.dupNode(IS68);

                    root_1 = (CommonTree)adaptor.becomeRoot(IS68_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    NULL69=(CommonTree)match(input,NULL,FOLLOW_NULL_in_isCondition567); 
                    NULL69_tree = (CommonTree)adaptor.dupNode(NULL69);

                    adaptor.addChild(root_1, NULL69_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_isCondition569);
                    left_cond70=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond70.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		Is arg=new Is();
                    		arg.setLeft((left_cond70!=null?left_cond70.ret:null));
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
    // MySQLWalker.g:234:1: comparisonCondition[BindIndexHolder where,ExpressionGroup exp] : ( ^( EQ expr[$where] left_cond[$where] ) | ^( NOT_EQ expr[$where] left_cond[$where] ) | ^( LTH expr[$where] left_cond[$where] ) | ^( GTH expr[$where] left_cond[$where] ) | ^( LEQ expr[$where] left_cond[$where] ) | ^( GEQ expr[$where] left_cond[$where] ) );
    public final MySQLWalker.comparisonCondition_return comparisonCondition(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        MySQLWalker.comparisonCondition_return retval = new MySQLWalker.comparisonCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQ71=null;
        CommonTree NOT_EQ74=null;
        CommonTree LTH77=null;
        CommonTree GTH80=null;
        CommonTree LEQ83=null;
        CommonTree GEQ86=null;
        MySQLWalker.expr_return expr72 = null;

        MySQLWalker.left_cond_return left_cond73 = null;

        MySQLWalker.expr_return expr75 = null;

        MySQLWalker.left_cond_return left_cond76 = null;

        MySQLWalker.expr_return expr78 = null;

        MySQLWalker.left_cond_return left_cond79 = null;

        MySQLWalker.expr_return expr81 = null;

        MySQLWalker.left_cond_return left_cond82 = null;

        MySQLWalker.expr_return expr84 = null;

        MySQLWalker.left_cond_return left_cond85 = null;

        MySQLWalker.expr_return expr87 = null;

        MySQLWalker.left_cond_return left_cond88 = null;


        CommonTree EQ71_tree=null;
        CommonTree NOT_EQ74_tree=null;
        CommonTree LTH77_tree=null;
        CommonTree GTH80_tree=null;
        CommonTree LEQ83_tree=null;
        CommonTree GEQ86_tree=null;

        try {
            // MySQLWalker.g:235:2: ( ^( EQ expr[$where] left_cond[$where] ) | ^( NOT_EQ expr[$where] left_cond[$where] ) | ^( LTH expr[$where] left_cond[$where] ) | ^( GTH expr[$where] left_cond[$where] ) | ^( LEQ expr[$where] left_cond[$where] ) | ^( GEQ expr[$where] left_cond[$where] ) )
            int alt21=6;
            switch ( input.LA(1) ) {
            case EQ:
                {
                alt21=1;
                }
                break;
            case NOT_EQ:
                {
                alt21=2;
                }
                break;
            case LTH:
                {
                alt21=3;
                }
                break;
            case GTH:
                {
                alt21=4;
                }
                break;
            case LEQ:
                {
                alt21=5;
                }
                break;
            case GEQ:
                {
                alt21=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // MySQLWalker.g:235:3: ^( EQ expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EQ71=(CommonTree)match(input,EQ,FOLLOW_EQ_in_comparisonCondition586); 
                    EQ71_tree = (CommonTree)adaptor.dupNode(EQ71);

                    root_1 = (CommonTree)adaptor.becomeRoot(EQ71_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition588);
                    expr72=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr72.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition591);
                    left_cond73=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond73.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		Equivalent arg=new Equivalent();
                    		arg.setLeft((left_cond73!=null?left_cond73.ret:null));
                    		arg.setRight((expr72!=null?expr72.valueObj:null));
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 2 :
                    // MySQLWalker.g:242:3: ^( NOT_EQ expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    NOT_EQ74=(CommonTree)match(input,NOT_EQ,FOLLOW_NOT_EQ_in_comparisonCondition601); 
                    NOT_EQ74_tree = (CommonTree)adaptor.dupNode(NOT_EQ74);

                    root_1 = (CommonTree)adaptor.becomeRoot(NOT_EQ74_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition603);
                    expr75=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr75.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition606);
                    left_cond76=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond76.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		NotEquivalent arg=new NotEquivalent();
                    		arg.setLeft((left_cond76!=null?left_cond76.ret:null));
                    		arg.setRight((expr75!=null?expr75.valueObj:null));
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 3 :
                    // MySQLWalker.g:249:3: ^( LTH expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    LTH77=(CommonTree)match(input,LTH,FOLLOW_LTH_in_comparisonCondition616); 
                    LTH77_tree = (CommonTree)adaptor.dupNode(LTH77);

                    root_1 = (CommonTree)adaptor.becomeRoot(LTH77_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition618);
                    expr78=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr78.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition621);
                    left_cond79=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond79.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		LessThan arg=new LessThan();
                    		arg.setLeft((left_cond79!=null?left_cond79.ret:null));
                    		arg.setRight((expr78!=null?expr78.valueObj:null));
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 4 :
                    // MySQLWalker.g:256:3: ^( GTH expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    GTH80=(CommonTree)match(input,GTH,FOLLOW_GTH_in_comparisonCondition631); 
                    GTH80_tree = (CommonTree)adaptor.dupNode(GTH80);

                    root_1 = (CommonTree)adaptor.becomeRoot(GTH80_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition633);
                    expr81=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr81.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition636);
                    left_cond82=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond82.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		GreaterThan arg=new GreaterThan();
                    		arg.setLeft((left_cond82!=null?left_cond82.ret:null));
                    		arg.setRight((expr81!=null?expr81.valueObj:null));
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 5 :
                    // MySQLWalker.g:263:3: ^( LEQ expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    LEQ83=(CommonTree)match(input,LEQ,FOLLOW_LEQ_in_comparisonCondition646); 
                    LEQ83_tree = (CommonTree)adaptor.dupNode(LEQ83);

                    root_1 = (CommonTree)adaptor.becomeRoot(LEQ83_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition648);
                    expr84=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr84.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition651);
                    left_cond85=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond85.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		LessThanOrEquivalent arg=new LessThanOrEquivalent();
                    		arg.setLeft((left_cond85!=null?left_cond85.ret:null));
                    		arg.setRight((expr84!=null?expr84.valueObj:null));
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 6 :
                    // MySQLWalker.g:270:3: ^( GEQ expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    GEQ86=(CommonTree)match(input,GEQ,FOLLOW_GEQ_in_comparisonCondition661); 
                    GEQ86_tree = (CommonTree)adaptor.dupNode(GEQ86);

                    root_1 = (CommonTree)adaptor.becomeRoot(GEQ86_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition663);
                    expr87=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr87.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition666);
                    left_cond88=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond88.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		GreaterThanOrEquivalent arg=new GreaterThanOrEquivalent();
                    		arg.setLeft((left_cond88!=null?left_cond88.ret:null));
                    		arg.setRight((expr87!=null?expr87.valueObj:null));
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
    // MySQLWalker.g:279:1: left_cond[BindIndexHolder where] returns [Object ret] : ^( CONDITION_LEFT expr[$where] ) ;
    public final MySQLWalker.left_cond_return left_cond(BindIndexHolder where) throws RecognitionException {
        MySQLWalker.left_cond_return retval = new MySQLWalker.left_cond_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CONDITION_LEFT89=null;
        MySQLWalker.expr_return expr90 = null;


        CommonTree CONDITION_LEFT89_tree=null;

        try {
            // MySQLWalker.g:281:2: ( ^( CONDITION_LEFT expr[$where] ) )
            // MySQLWalker.g:281:3: ^( CONDITION_LEFT expr[$where] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            CONDITION_LEFT89=(CommonTree)match(input,CONDITION_LEFT,FOLLOW_CONDITION_LEFT_in_left_cond687); 
            CONDITION_LEFT89_tree = (CommonTree)adaptor.dupNode(CONDITION_LEFT89);

            root_1 = (CommonTree)adaptor.becomeRoot(CONDITION_LEFT89_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_left_cond689);
            expr90=expr(where);

            state._fsp--;

            adaptor.addChild(root_1, expr90.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		retval.ret =(expr90!=null?expr90.valueObj:null);
            	

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
    // MySQLWalker.g:286:1: in_list[BindIndexHolder where] returns [List list] : ^( IN_LISTS inCondition_expr_adds[$where] ) ;
    public final MySQLWalker.in_list_return in_list(BindIndexHolder where) throws RecognitionException {
        MySQLWalker.in_list_return retval = new MySQLWalker.in_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IN_LISTS91=null;
        MySQLWalker.inCondition_expr_adds_return inCondition_expr_adds92 = null;


        CommonTree IN_LISTS91_tree=null;

        try {
            // MySQLWalker.g:287:2: ( ^( IN_LISTS inCondition_expr_adds[$where] ) )
            // MySQLWalker.g:287:3: ^( IN_LISTS inCondition_expr_adds[$where] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            IN_LISTS91=(CommonTree)match(input,IN_LISTS,FOLLOW_IN_LISTS_in_in_list708); 
            IN_LISTS91_tree = (CommonTree)adaptor.dupNode(IN_LISTS91);

            root_1 = (CommonTree)adaptor.becomeRoot(IN_LISTS91_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_inCondition_expr_adds_in_in_list710);
            inCondition_expr_adds92=inCondition_expr_adds(where);

            state._fsp--;

            adaptor.addChild(root_1, inCondition_expr_adds92.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		retval.list =(inCondition_expr_adds92!=null?inCondition_expr_adds92.list:null);
            	

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
    // MySQLWalker.g:292:1: inCondition[BindIndexHolder where,ExpressionGroup exp] : ^( IN (not= 'NOT' )? ( subquery )? ( in_list[$where] )? left_cond[$where] ) ;
    public final MySQLWalker.inCondition_return inCondition(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        MySQLWalker.inCondition_return retval = new MySQLWalker.inCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree not=null;
        CommonTree IN93=null;
        MySQLWalker.subquery_return subquery94 = null;

        MySQLWalker.in_list_return in_list95 = null;

        MySQLWalker.left_cond_return left_cond96 = null;


        CommonTree not_tree=null;
        CommonTree IN93_tree=null;

        try {
            // MySQLWalker.g:293:2: ( ^( IN (not= 'NOT' )? ( subquery )? ( in_list[$where] )? left_cond[$where] ) )
            // MySQLWalker.g:293:3: ^( IN (not= 'NOT' )? ( subquery )? ( in_list[$where] )? left_cond[$where] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            IN93=(CommonTree)match(input,IN,FOLLOW_IN_in_inCondition728); 
            IN93_tree = (CommonTree)adaptor.dupNode(IN93);

            root_1 = (CommonTree)adaptor.becomeRoot(IN93_tree, root_1);



            match(input, Token.DOWN, null); 
            // MySQLWalker.g:293:11: (not= 'NOT' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==92) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // MySQLWalker.g:293:11: not= 'NOT'
                    {
                    _last = (CommonTree)input.LT(1);
                    not=(CommonTree)match(input,92,FOLLOW_92_in_inCondition732); 
                    not_tree = (CommonTree)adaptor.dupNode(not);

                    adaptor.addChild(root_1, not_tree);


                    }
                    break;

            }

            // MySQLWalker.g:293:19: ( subquery )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==SUBQUERY) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // MySQLWalker.g:293:19: subquery
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_subquery_in_inCondition735);
                    subquery94=subquery();

                    state._fsp--;

                    adaptor.addChild(root_1, subquery94.getTree());

                    }
                    break;

            }

            // MySQLWalker.g:293:29: ( in_list[$where] )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==IN_LISTS) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // MySQLWalker.g:293:29: in_list[$where]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_in_list_in_inCondition738);
                    in_list95=in_list(where);

                    state._fsp--;

                    adaptor.addChild(root_1, in_list95.getTree());

                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_left_cond_in_inCondition743);
            left_cond96=left_cond(where);

            state._fsp--;

            adaptor.addChild(root_1, left_cond96.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		if((not!=null?not.getText():null)!=null){
            			if((subquery94!=null?subquery94.subselect:null)!=null){
            					NotInExpression arg=new NotInExpression();
            					arg.setLeft((left_cond96!=null?left_cond96.ret:null));
            					arg.setRight((subquery94!=null?subquery94.subselect:null));
            					exp.addExpression(arg);
            			}
            			else if((in_list95!=null?in_list95.list:null)!=null){
            					NotInExpression arg=new NotInExpression();
            					arg.setLeft((left_cond96!=null?left_cond96.ret:null));
            					arg.setRight((in_list95!=null?in_list95.list:null));
            					exp.addExpression(arg);
            			}
            		}else{
            			if((subquery94!=null?subquery94.subselect:null)!=null){
            					InExpression arg=new InExpression();
            					arg.setLeft((left_cond96!=null?left_cond96.ret:null));
            					arg.setRight((subquery94!=null?subquery94.subselect:null));
            					exp.addExpression(arg);
            			}
            			else if((in_list95!=null?in_list95.list:null)!=null){
            					InExpression arg=new InExpression();
            					arg.setLeft((left_cond96!=null?left_cond96.ret:null));
            					arg.setRight((in_list95!=null?in_list95.list:null));
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
    // MySQLWalker.g:330:1: inCondition_expr_adds[BindIndexHolder where] returns [List list] : ( expr_add[$where] )+ ;
    public final MySQLWalker.inCondition_expr_adds_return inCondition_expr_adds(BindIndexHolder where) throws RecognitionException {
        MySQLWalker.inCondition_expr_adds_return retval = new MySQLWalker.inCondition_expr_adds_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.expr_add_return expr_add97 = null;



        retval.list =new ArrayList();
        try {
            // MySQLWalker.g:331:31: ( ( expr_add[$where] )+ )
            // MySQLWalker.g:332:2: ( expr_add[$where] )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // MySQLWalker.g:332:2: ( expr_add[$where] )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==COLUMN||LA25_0==QUTED_STR||LA25_0==COLUMNAST||LA25_0==CONSIST||(LA25_0>=NEGATIVE && LA25_0<=POSITIVE)||(LA25_0>=BITOR && LA25_0<=DIVIDE)||LA25_0==ID||(LA25_0>=N && LA25_0<=NUMBER)||LA25_0==99||LA25_0==102||(LA25_0>=104 && LA25_0<=106)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // MySQLWalker.g:332:3: expr_add[$where]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expr_add_in_inCondition_expr_adds777);
            	    expr_add97=expr_add(where);

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr_add97.getTree());

            	    		retval.list.add((expr_add97!=null?expr_add97.valueObjExpr:null));
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
    // MySQLWalker.g:339:1: expr[BindIndexHolder where] returns [Object valueObj] : ( expr_add[$where] | subquery ) ;
    public final MySQLWalker.expr_return expr(BindIndexHolder where) throws RecognitionException {
        MySQLWalker.expr_return retval = new MySQLWalker.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.expr_add_return expr_add98 = null;

        MySQLWalker.subquery_return subquery99 = null;



        try {
            // MySQLWalker.g:340:2: ( ( expr_add[$where] | subquery ) )
            // MySQLWalker.g:340:3: ( expr_add[$where] | subquery )
            {
            root_0 = (CommonTree)adaptor.nil();

            // MySQLWalker.g:340:3: ( expr_add[$where] | subquery )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==COLUMN||LA26_0==QUTED_STR||LA26_0==COLUMNAST||LA26_0==CONSIST||(LA26_0>=NEGATIVE && LA26_0<=POSITIVE)||(LA26_0>=BITOR && LA26_0<=DIVIDE)||LA26_0==ID||(LA26_0>=N && LA26_0<=NUMBER)||LA26_0==99||LA26_0==102||(LA26_0>=104 && LA26_0<=106)) ) {
                alt26=1;
            }
            else if ( (LA26_0==SUBQUERY) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // MySQLWalker.g:340:4: expr_add[$where]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr802);
                    expr_add98=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_0, expr_add98.getTree());
                    retval.valueObj =(expr_add98!=null?expr_add98.valueObjExpr:null);

                    }
                    break;
                case 2 :
                    // MySQLWalker.g:341:3: subquery
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_subquery_in_expr809);
                    subquery99=subquery();

                    state._fsp--;

                    adaptor.addChild(root_0, subquery99.getTree());
                    retval.valueObj =(subquery99!=null?subquery99.subselect:null);

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
    // MySQLWalker.g:345:1: expr_add[BindIndexHolder where] returns [Object valueObjExpr] : ( ^( NEGATIVE s1= expr_add[$where] ) | ^( POSITIVE s1= expr_add[$where] ) | ^( PLUS s1= expr_add[$where] s2= expr_add[$where] ) | ^( MINUS s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITOR s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITAND s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITXOR s1= expr_add[$where] s2= expr_add[$where] ) | ^( SHIFTLEFT s1= expr_add[$where] s2= expr_add[$where] ) | ^( SHIFTRIGHT s1= expr_add[$where] s2= expr_add[$where] ) | ^( ASTERISK s1= expr_add[$where] s2= expr_add[$where] ) | ^( DIVIDE s1= expr_add[$where] s2= expr_add[$where] ) | N | NUMBER | boolean_literal | 'NULL' | 'ROWNUM' | '?' | ^( QUTED_STR quoted_string ) | ^( COLUMN identifier ( table_name )? ) | ^( COLUMNAST ASTERISK ) | ^( ID ( expr[$where] )* ) | ^( CONSIST ID ) );
    public final MySQLWalker.expr_add_return expr_add(BindIndexHolder where) throws RecognitionException {
        MySQLWalker.expr_add_return retval = new MySQLWalker.expr_add_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NEGATIVE100=null;
        CommonTree POSITIVE101=null;
        CommonTree PLUS102=null;
        CommonTree MINUS103=null;
        CommonTree BITOR104=null;
        CommonTree BITAND105=null;
        CommonTree BITXOR106=null;
        CommonTree SHIFTLEFT107=null;
        CommonTree SHIFTRIGHT108=null;
        CommonTree ASTERISK109=null;
        CommonTree DIVIDE110=null;
        CommonTree N111=null;
        CommonTree NUMBER112=null;
        CommonTree string_literal114=null;
        CommonTree string_literal115=null;
        CommonTree char_literal116=null;
        CommonTree QUTED_STR117=null;
        CommonTree COLUMN119=null;
        CommonTree COLUMNAST122=null;
        CommonTree ASTERISK123=null;
        CommonTree ID124=null;
        CommonTree CONSIST126=null;
        CommonTree ID127=null;
        MySQLWalker.expr_add_return s1 = null;

        MySQLWalker.expr_add_return s2 = null;

        MySQLWalker.boolean_literal_return boolean_literal113 = null;

        MySQLWalker.quoted_string_return quoted_string118 = null;

        MySQLWalker.identifier_return identifier120 = null;

        MySQLWalker.table_name_return table_name121 = null;

        MySQLWalker.expr_return expr125 = null;


        CommonTree NEGATIVE100_tree=null;
        CommonTree POSITIVE101_tree=null;
        CommonTree PLUS102_tree=null;
        CommonTree MINUS103_tree=null;
        CommonTree BITOR104_tree=null;
        CommonTree BITAND105_tree=null;
        CommonTree BITXOR106_tree=null;
        CommonTree SHIFTLEFT107_tree=null;
        CommonTree SHIFTRIGHT108_tree=null;
        CommonTree ASTERISK109_tree=null;
        CommonTree DIVIDE110_tree=null;
        CommonTree N111_tree=null;
        CommonTree NUMBER112_tree=null;
        CommonTree string_literal114_tree=null;
        CommonTree string_literal115_tree=null;
        CommonTree char_literal116_tree=null;
        CommonTree QUTED_STR117_tree=null;
        CommonTree COLUMN119_tree=null;
        CommonTree COLUMNAST122_tree=null;
        CommonTree ASTERISK123_tree=null;
        CommonTree ID124_tree=null;
        CommonTree CONSIST126_tree=null;
        CommonTree ID127_tree=null;


        List<Object> list=new ArrayList<Object>();

        try {
            // MySQLWalker.g:349:2: ( ^( NEGATIVE s1= expr_add[$where] ) | ^( POSITIVE s1= expr_add[$where] ) | ^( PLUS s1= expr_add[$where] s2= expr_add[$where] ) | ^( MINUS s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITOR s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITAND s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITXOR s1= expr_add[$where] s2= expr_add[$where] ) | ^( SHIFTLEFT s1= expr_add[$where] s2= expr_add[$where] ) | ^( SHIFTRIGHT s1= expr_add[$where] s2= expr_add[$where] ) | ^( ASTERISK s1= expr_add[$where] s2= expr_add[$where] ) | ^( DIVIDE s1= expr_add[$where] s2= expr_add[$where] ) | N | NUMBER | boolean_literal | 'NULL' | 'ROWNUM' | '?' | ^( QUTED_STR quoted_string ) | ^( COLUMN identifier ( table_name )? ) | ^( COLUMNAST ASTERISK ) | ^( ID ( expr[$where] )* ) | ^( CONSIST ID ) )
            int alt29=22;
            switch ( input.LA(1) ) {
            case NEGATIVE:
                {
                alt29=1;
                }
                break;
            case POSITIVE:
                {
                alt29=2;
                }
                break;
            case PLUS:
                {
                alt29=3;
                }
                break;
            case MINUS:
                {
                alt29=4;
                }
                break;
            case BITOR:
                {
                alt29=5;
                }
                break;
            case BITAND:
                {
                alt29=6;
                }
                break;
            case BITXOR:
                {
                alt29=7;
                }
                break;
            case SHIFTLEFT:
                {
                alt29=8;
                }
                break;
            case SHIFTRIGHT:
                {
                alt29=9;
                }
                break;
            case ASTERISK:
                {
                alt29=10;
                }
                break;
            case DIVIDE:
                {
                alt29=11;
                }
                break;
            case N:
                {
                alt29=12;
                }
                break;
            case NUMBER:
                {
                alt29=13;
                }
                break;
            case 105:
            case 106:
                {
                alt29=14;
                }
                break;
            case 99:
                {
                alt29=15;
                }
                break;
            case 102:
                {
                alt29=16;
                }
                break;
            case 104:
                {
                alt29=17;
                }
                break;
            case QUTED_STR:
                {
                alt29=18;
                }
                break;
            case COLUMN:
                {
                alt29=19;
                }
                break;
            case COLUMNAST:
                {
                alt29=20;
                }
                break;
            case ID:
                {
                alt29=21;
                }
                break;
            case CONSIST:
                {
                alt29=22;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // MySQLWalker.g:349:3: ^( NEGATIVE s1= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    NEGATIVE100=(CommonTree)match(input,NEGATIVE,FOLLOW_NEGATIVE_in_expr_add836); 
                    NEGATIVE100_tree = (CommonTree)adaptor.dupNode(NEGATIVE100);

                    root_1 = (CommonTree)adaptor.becomeRoot(NEGATIVE100_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add840);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	retval.valueObjExpr =((BigDecimal)(s1!=null?s1.valueObjExpr:null)).negate();
                    	

                    }
                    break;
                case 2 :
                    // MySQLWalker.g:352:3: ^( POSITIVE s1= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    POSITIVE101=(CommonTree)match(input,POSITIVE,FOLLOW_POSITIVE_in_expr_add849); 
                    POSITIVE101_tree = (CommonTree)adaptor.dupNode(POSITIVE101);

                    root_1 = (CommonTree)adaptor.becomeRoot(POSITIVE101_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add853);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	retval.valueObjExpr =(s1!=null?s1.valueObjExpr:null);
                    	

                    }
                    break;
                case 3 :
                    // MySQLWalker.g:355:3: ^( PLUS s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PLUS102=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expr_add862); 
                    PLUS102_tree = (CommonTree)adaptor.dupNode(PLUS102);

                    root_1 = (CommonTree)adaptor.becomeRoot(PLUS102_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add866);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add871);
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
                    // MySQLWalker.g:362:3: ^( MINUS s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MINUS103=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expr_add880); 
                    MINUS103_tree = (CommonTree)adaptor.dupNode(MINUS103);

                    root_1 = (CommonTree)adaptor.becomeRoot(MINUS103_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add884);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add889);
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
                    // MySQLWalker.g:369:3: ^( BITOR s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    BITOR104=(CommonTree)match(input,BITOR,FOLLOW_BITOR_in_expr_add897); 
                    BITOR104_tree = (CommonTree)adaptor.dupNode(BITOR104);

                    root_1 = (CommonTree)adaptor.becomeRoot(BITOR104_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add901);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add906);
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
                    // MySQLWalker.g:376:3: ^( BITAND s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    BITAND105=(CommonTree)match(input,BITAND,FOLLOW_BITAND_in_expr_add914); 
                    BITAND105_tree = (CommonTree)adaptor.dupNode(BITAND105);

                    root_1 = (CommonTree)adaptor.becomeRoot(BITAND105_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add918);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add923);
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
                    // MySQLWalker.g:383:3: ^( BITXOR s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    BITXOR106=(CommonTree)match(input,BITXOR,FOLLOW_BITXOR_in_expr_add931); 
                    BITXOR106_tree = (CommonTree)adaptor.dupNode(BITXOR106);

                    root_1 = (CommonTree)adaptor.becomeRoot(BITXOR106_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add935);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add940);
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
                    // MySQLWalker.g:390:3: ^( SHIFTLEFT s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SHIFTLEFT107=(CommonTree)match(input,SHIFTLEFT,FOLLOW_SHIFTLEFT_in_expr_add948); 
                    SHIFTLEFT107_tree = (CommonTree)adaptor.dupNode(SHIFTLEFT107);

                    root_1 = (CommonTree)adaptor.becomeRoot(SHIFTLEFT107_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add952);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add957);
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
                    // MySQLWalker.g:397:3: ^( SHIFTRIGHT s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SHIFTRIGHT108=(CommonTree)match(input,SHIFTRIGHT,FOLLOW_SHIFTRIGHT_in_expr_add965); 
                    SHIFTRIGHT108_tree = (CommonTree)adaptor.dupNode(SHIFTRIGHT108);

                    root_1 = (CommonTree)adaptor.becomeRoot(SHIFTRIGHT108_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add969);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add974);
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
                    // MySQLWalker.g:404:3: ^( ASTERISK s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ASTERISK109=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_expr_add982); 
                    ASTERISK109_tree = (CommonTree)adaptor.dupNode(ASTERISK109);

                    root_1 = (CommonTree)adaptor.becomeRoot(ASTERISK109_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add986);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add991);
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
                    // MySQLWalker.g:411:3: ^( DIVIDE s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DIVIDE110=(CommonTree)match(input,DIVIDE,FOLLOW_DIVIDE_in_expr_add999); 
                    DIVIDE110_tree = (CommonTree)adaptor.dupNode(DIVIDE110);

                    root_1 = (CommonTree)adaptor.becomeRoot(DIVIDE110_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1003);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1008);
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
                    // MySQLWalker.g:418:3: N
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    N111=(CommonTree)match(input,N,FOLLOW_N_in_expr_add1015); 
                    N111_tree = (CommonTree)adaptor.dupNode(N111);

                    adaptor.addChild(root_0, N111_tree);

                    retval.valueObjExpr =new BigDecimal((N111!=null?N111.getText():null));

                    }
                    break;
                case 13 :
                    // MySQLWalker.g:419:3: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    NUMBER112=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_expr_add1021); 
                    NUMBER112_tree = (CommonTree)adaptor.dupNode(NUMBER112);

                    adaptor.addChild(root_0, NUMBER112_tree);

                    retval.valueObjExpr =new BigDecimal((NUMBER112!=null?NUMBER112.getText():null));

                    }
                    break;
                case 14 :
                    // MySQLWalker.g:420:3: boolean_literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_boolean_literal_in_expr_add1026);
                    boolean_literal113=boolean_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_literal113.getTree());

                    }
                    break;
                case 15 :
                    // MySQLWalker.g:421:3: 'NULL'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    string_literal114=(CommonTree)match(input,99,FOLLOW_99_in_expr_add1030); 
                    string_literal114_tree = (CommonTree)adaptor.dupNode(string_literal114);

                    adaptor.addChild(root_0, string_literal114_tree);

                    retval.valueObjExpr =null;

                    }
                    break;
                case 16 :
                    // MySQLWalker.g:422:3: 'ROWNUM'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    string_literal115=(CommonTree)match(input,102,FOLLOW_102_in_expr_add1036); 
                    string_literal115_tree = (CommonTree)adaptor.dupNode(string_literal115);

                    adaptor.addChild(root_0, string_literal115_tree);


                    }
                    break;
                case 17 :
                    // MySQLWalker.g:423:3: '?'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    char_literal116=(CommonTree)match(input,104,FOLLOW_104_in_expr_add1040); 
                    char_literal116_tree = (CommonTree)adaptor.dupNode(char_literal116);

                    adaptor.addChild(root_0, char_literal116_tree);


                    	BindVar val=new BindVar(where.selfAddAndGet());
                    	retval.valueObjExpr =val;
                    	

                    }
                    break;
                case 18 :
                    // MySQLWalker.g:427:3: ^( QUTED_STR quoted_string )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    QUTED_STR117=(CommonTree)match(input,QUTED_STR,FOLLOW_QUTED_STR_in_expr_add1046); 
                    QUTED_STR117_tree = (CommonTree)adaptor.dupNode(QUTED_STR117);

                    root_1 = (CommonTree)adaptor.becomeRoot(QUTED_STR117_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_quoted_string_in_expr_add1048);
                    quoted_string118=quoted_string();

                    state._fsp--;

                    adaptor.addChild(root_1, quoted_string118.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    retval.valueObjExpr =(quoted_string118!=null?quoted_string118.aText:null);

                    }
                    break;
                case 19 :
                    // MySQLWalker.g:428:3: ^( COLUMN identifier ( table_name )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    COLUMN119=(CommonTree)match(input,COLUMN,FOLLOW_COLUMN_in_expr_add1055); 
                    COLUMN119_tree = (CommonTree)adaptor.dupNode(COLUMN119);

                    root_1 = (CommonTree)adaptor.becomeRoot(COLUMN119_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_expr_add1057);
                    identifier120=identifier();

                    state._fsp--;

                    adaptor.addChild(root_1, identifier120.getTree());
                    // MySQLWalker.g:428:23: ( table_name )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==ID) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // MySQLWalker.g:428:23: table_name
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_table_name_in_expr_add1059);
                            table_name121=table_name();

                            state._fsp--;

                            adaptor.addChild(root_1, table_name121.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	Column col=new ColumnImp((table_name121!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(table_name121.start),
                      input.getTreeAdaptor().getTokenStopIndex(table_name121.start))):null),(identifier120!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(identifier120.start),
                      input.getTreeAdaptor().getTokenStopIndex(identifier120.start))):null),null);
                    	retval.valueObjExpr =col;
                    	

                    }
                    break;
                case 20 :
                    // MySQLWalker.g:433:3: ^( COLUMNAST ASTERISK )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    COLUMNAST122=(CommonTree)match(input,COLUMNAST,FOLLOW_COLUMNAST_in_expr_add1069); 
                    COLUMNAST122_tree = (CommonTree)adaptor.dupNode(COLUMNAST122);

                    root_1 = (CommonTree)adaptor.becomeRoot(COLUMNAST122_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ASTERISK123=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_expr_add1071); 
                    ASTERISK123_tree = (CommonTree)adaptor.dupNode(ASTERISK123);

                    adaptor.addChild(root_1, ASTERISK123_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	Column col=new ColumnImp(null,(ASTERISK123!=null?ASTERISK123.getText():null),null);
                    	retval.valueObjExpr =col;
                    	

                    }
                    break;
                case 21 :
                    // MySQLWalker.g:438:3: ^( ID ( expr[$where] )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ID124=(CommonTree)match(input,ID,FOLLOW_ID_in_expr_add1080); 
                    ID124_tree = (CommonTree)adaptor.dupNode(ID124);

                    root_1 = (CommonTree)adaptor.becomeRoot(ID124_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // MySQLWalker.g:439:2: ( expr[$where] )*
                        loop28:
                        do {
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( ((LA28_0>=SUBQUERY && LA28_0<=COLUMN)||LA28_0==QUTED_STR||LA28_0==COLUMNAST||LA28_0==CONSIST||(LA28_0>=NEGATIVE && LA28_0<=POSITIVE)||(LA28_0>=BITOR && LA28_0<=DIVIDE)||LA28_0==ID||(LA28_0>=N && LA28_0<=NUMBER)||LA28_0==99||LA28_0==102||(LA28_0>=104 && LA28_0<=106)) ) {
                                alt28=1;
                            }


                            switch (alt28) {
                        	case 1 :
                        	    // MySQLWalker.g:439:3: expr[$where]
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_expr_in_expr_add1085);
                        	    expr125=expr(where);

                        	    state._fsp--;

                        	    adaptor.addChild(root_1, expr125.getTree());
                        	    list.add((expr125!=null?expr125.valueObj:null));

                        	    }
                        	    break;

                        	default :
                        	    break loop28;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	Function func=funcreg.get(((ID124!=null?ID124.getText():null)).toUpperCase());
                    	func.setValue(list);
                    	retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 22 :
                    // MySQLWalker.g:444:3: ^( CONSIST ID )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CONSIST126=(CommonTree)match(input,CONSIST,FOLLOW_CONSIST_in_expr_add1096); 
                    CONSIST126_tree = (CommonTree)adaptor.dupNode(CONSIST126);

                    root_1 = (CommonTree)adaptor.becomeRoot(CONSIST126_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ID127=(CommonTree)match(input,ID,FOLLOW_ID_in_expr_add1098); 
                    ID127_tree = (CommonTree)adaptor.dupNode(ID127);

                    adaptor.addChild(root_1, ID127_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	Function func=consistStr.get(((ID127!=null?ID127.getText():null)).toUpperCase());
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
    // MySQLWalker.g:449:1: value : ( N | NUMBER | '?' );
    public final MySQLWalker.value_return value() throws RecognitionException {
        MySQLWalker.value_return retval = new MySQLWalker.value_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set128=null;

        CommonTree set128_tree=null;

        try {
            // MySQLWalker.g:449:7: ( N | NUMBER | '?' )
            // MySQLWalker.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set128=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=N && input.LA(1)<=NUMBER)||input.LA(1)==104 ) {
                input.consume();

                set128_tree = (CommonTree)adaptor.dupNode(set128);

                adaptor.addChild(root_0, set128_tree);

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
    // MySQLWalker.g:454:1: boolean_literal returns [Object valueObj] : (s1= 'TRUE' | s1= 'FALSE' );
    public final MySQLWalker.boolean_literal_return boolean_literal() throws RecognitionException {
        MySQLWalker.boolean_literal_return retval = new MySQLWalker.boolean_literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree s1=null;

        CommonTree s1_tree=null;

        try {
            // MySQLWalker.g:455:2: (s1= 'TRUE' | s1= 'FALSE' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==105) ) {
                alt30=1;
            }
            else if ( (LA30_0==106) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // MySQLWalker.g:455:3: s1= 'TRUE'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    s1=(CommonTree)match(input,105,FOLLOW_105_in_boolean_literal1132); 
                    s1_tree = (CommonTree)adaptor.dupNode(s1);

                    adaptor.addChild(root_0, s1_tree);

                    retval.valueObj =Boolean.parseBoolean((s1!=null?s1.getText():null));

                    }
                    break;
                case 2 :
                    // MySQLWalker.g:456:4: s1= 'FALSE'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    s1=(CommonTree)match(input,106,FOLLOW_106_in_boolean_literal1141); 
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
    // MySQLWalker.g:460:1: select_list[Select select] : ^( SELECT_LIST ( displayed_column[$select] )+ ) ;
    public final MySQLWalker.select_list_return select_list(Select select) throws RecognitionException {
        MySQLWalker.select_list_return retval = new MySQLWalker.select_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SELECT_LIST129=null;
        MySQLWalker.displayed_column_return displayed_column130 = null;


        CommonTree SELECT_LIST129_tree=null;

        try {
            // MySQLWalker.g:461:2: ( ^( SELECT_LIST ( displayed_column[$select] )+ ) )
            // MySQLWalker.g:461:3: ^( SELECT_LIST ( displayed_column[$select] )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            SELECT_LIST129=(CommonTree)match(input,SELECT_LIST,FOLLOW_SELECT_LIST_in_select_list1157); 
            SELECT_LIST129_tree = (CommonTree)adaptor.dupNode(SELECT_LIST129);

            root_1 = (CommonTree)adaptor.becomeRoot(SELECT_LIST129_tree, root_1);



            match(input, Token.DOWN, null); 
            // MySQLWalker.g:461:17: ( displayed_column[$select] )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==COLUMN||LA31_0==CONSIST||LA31_0==ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // MySQLWalker.g:461:17: displayed_column[$select]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_displayed_column_in_select_list1159);
            	    displayed_column130=displayed_column(select);

            	    state._fsp--;

            	    adaptor.addChild(root_1, displayed_column130.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
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
    // MySQLWalker.g:463:1: fromClause[Select select] : ^( TABLENAMES ( table[$select] )+ ) ;
    public final MySQLWalker.fromClause_return fromClause(Select select) throws RecognitionException {
        MySQLWalker.fromClause_return retval = new MySQLWalker.fromClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TABLENAMES131=null;
        MySQLWalker.table_return table132 = null;


        CommonTree TABLENAMES131_tree=null;

        try {
            // MySQLWalker.g:464:2: ( ^( TABLENAMES ( table[$select] )+ ) )
            // MySQLWalker.g:464:3: ^( TABLENAMES ( table[$select] )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TABLENAMES131=(CommonTree)match(input,TABLENAMES,FOLLOW_TABLENAMES_in_fromClause1174); 
            TABLENAMES131_tree = (CommonTree)adaptor.dupNode(TABLENAMES131);

            root_1 = (CommonTree)adaptor.becomeRoot(TABLENAMES131_tree, root_1);



            match(input, Token.DOWN, null); 
            // MySQLWalker.g:464:16: ( table[$select] )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==TABLENAME) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // MySQLWalker.g:464:16: table[$select]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_table_in_fromClause1176);
            	    table132=table(select);

            	    state._fsp--;

            	    adaptor.addChild(root_1, table132.getTree());

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
    // $ANTLR end "fromClause"

    public static class table_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table"
    // MySQLWalker.g:467:1: table[DMLCommon common] : ^( TABLENAME table_spec[$common] ) ;
    public final MySQLWalker.table_return table(DMLCommon common) throws RecognitionException {
        MySQLWalker.table_return retval = new MySQLWalker.table_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TABLENAME133=null;
        MySQLWalker.table_spec_return table_spec134 = null;


        CommonTree TABLENAME133_tree=null;

        try {
            // MySQLWalker.g:468:2: ( ^( TABLENAME table_spec[$common] ) )
            // MySQLWalker.g:468:3: ^( TABLENAME table_spec[$common] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TABLENAME133=(CommonTree)match(input,TABLENAME,FOLLOW_TABLENAME_in_table1191); 
            TABLENAME133_tree = (CommonTree)adaptor.dupNode(TABLENAME133);

            root_1 = (CommonTree)adaptor.becomeRoot(TABLENAME133_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_table_spec_in_table1193);
            table_spec134=table_spec(common);

            state._fsp--;

            adaptor.addChild(root_1, table_spec134.getTree());

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
    // MySQLWalker.g:470:1: tables[DMLCommon common] : ^( TABLENAMES ( table[$common] )+ ) ;
    public final MySQLWalker.tables_return tables(DMLCommon common) throws RecognitionException {
        MySQLWalker.tables_return retval = new MySQLWalker.tables_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TABLENAMES135=null;
        MySQLWalker.table_return table136 = null;


        CommonTree TABLENAMES135_tree=null;

        try {
            // MySQLWalker.g:471:2: ( ^( TABLENAMES ( table[$common] )+ ) )
            // MySQLWalker.g:471:3: ^( TABLENAMES ( table[$common] )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TABLENAMES135=(CommonTree)match(input,TABLENAMES,FOLLOW_TABLENAMES_in_tables1206); 
            TABLENAMES135_tree = (CommonTree)adaptor.dupNode(TABLENAMES135);

            root_1 = (CommonTree)adaptor.becomeRoot(TABLENAMES135_tree, root_1);



            match(input, Token.DOWN, null); 
            // MySQLWalker.g:471:16: ( table[$common] )+
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
            	    // MySQLWalker.g:471:16: table[$common]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_table_in_tables1208);
            	    table136=table(common);

            	    state._fsp--;

            	    adaptor.addChild(root_1, table136.getTree());

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
    // $ANTLR end "tables"

    public static class table_spec_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table_spec"
    // MySQLWalker.g:473:1: table_spec[DMLCommon common] : ( ( schema_name )? table_name ( alias )? | subquery ( alias )? );
    public final MySQLWalker.table_spec_return table_spec(DMLCommon common) throws RecognitionException {
        MySQLWalker.table_spec_return retval = new MySQLWalker.table_spec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.schema_name_return schema_name137 = null;

        MySQLWalker.table_name_return table_name138 = null;

        MySQLWalker.alias_return alias139 = null;

        MySQLWalker.subquery_return subquery140 = null;

        MySQLWalker.alias_return alias141 = null;



        try {
            // MySQLWalker.g:474:2: ( ( schema_name )? table_name ( alias )? | subquery ( alias )? )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==ID) ) {
                alt37=1;
            }
            else if ( (LA37_0==SUBQUERY) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // MySQLWalker.g:474:3: ( schema_name )? table_name ( alias )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // MySQLWalker.g:474:3: ( schema_name )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==ID) ) {
                        int LA34_1 = input.LA(2);

                        if ( (LA34_1==ID) ) {
                            alt34=1;
                        }
                    }
                    switch (alt34) {
                        case 1 :
                            // MySQLWalker.g:474:5: schema_name
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_schema_name_in_table_spec1223);
                            schema_name137=schema_name();

                            state._fsp--;

                            adaptor.addChild(root_0, schema_name137.getTree());

                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_table_name_in_table_spec1227);
                    table_name138=table_name();

                    state._fsp--;

                    adaptor.addChild(root_0, table_name138.getTree());
                    // MySQLWalker.g:474:31: ( alias )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==AS) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // MySQLWalker.g:474:31: alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_alias_in_table_spec1230);
                            alias139=alias();

                            state._fsp--;

                            adaptor.addChild(root_0, alias139.getTree());

                            }
                            break;

                    }


                    		common.addTableNameAndSchemaName((table_name138!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(table_name138.start),
                      input.getTreeAdaptor().getTokenStopIndex(table_name138.start))):null),(schema_name137!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(schema_name137.start),
                      input.getTreeAdaptor().getTokenStopIndex(schema_name137.start))):null),(alias139!=null?alias139.aliText:null));
                    	

                    }
                    break;
                case 2 :
                    // MySQLWalker.g:478:3: subquery ( alias )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_subquery_in_table_spec1238);
                    subquery140=subquery();

                    state._fsp--;

                    adaptor.addChild(root_0, subquery140.getTree());
                    // MySQLWalker.g:478:12: ( alias )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==AS) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // MySQLWalker.g:478:12: alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_alias_in_table_spec1240);
                            alias141=alias();

                            state._fsp--;

                            adaptor.addChild(root_0, alias141.getTree());

                            }
                            break;

                    }


                    		common.addTableSubQuery((subquery140!=null?subquery140.subselect:null),(alias141!=null?alias141.aliText:null));

                    	

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
    // MySQLWalker.g:485:1: schema_name : identifier ;
    public final MySQLWalker.schema_name_return schema_name() throws RecognitionException {
        MySQLWalker.schema_name_return retval = new MySQLWalker.schema_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.identifier_return identifier142 = null;



        try {
            // MySQLWalker.g:486:2: ( identifier )
            // MySQLWalker.g:486:3: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_schema_name1255);
            identifier142=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier142.getTree());

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
    // MySQLWalker.g:488:1: subquery returns [Select subselect] : ^( SUBQUERY select_command ) ;
    public final MySQLWalker.subquery_return subquery() throws RecognitionException {
        MySQLWalker.subquery_return retval = new MySQLWalker.subquery_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SUBQUERY143=null;
        MySQLWalker.select_command_return select_command144 = null;


        CommonTree SUBQUERY143_tree=null;

        try {
            // MySQLWalker.g:488:36: ( ^( SUBQUERY select_command ) )
            // MySQLWalker.g:489:2: ^( SUBQUERY select_command )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            SUBQUERY143=(CommonTree)match(input,SUBQUERY,FOLLOW_SUBQUERY_in_subquery1269); 
            SUBQUERY143_tree = (CommonTree)adaptor.dupNode(SUBQUERY143);

            root_1 = (CommonTree)adaptor.becomeRoot(SUBQUERY143_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_select_command_in_subquery1271);
            select_command144=select_command();

            state._fsp--;

            adaptor.addChild(root_1, select_command144.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            	retval.subselect =(select_command144!=null?select_command144.select:null);
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
    // MySQLWalker.g:495:1: table_name : identifier ;
    public final MySQLWalker.table_name_return table_name() throws RecognitionException {
        MySQLWalker.table_name_return retval = new MySQLWalker.table_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.identifier_return identifier145 = null;



        try {
            // MySQLWalker.g:496:2: ( identifier )
            // MySQLWalker.g:496:3: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_table_name1285);
            identifier145=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier145.getTree());

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
    // MySQLWalker.g:498:1: displayed_column[Select select] : ( ^( ID ( expr[$select.getIndexHolder()] ( alias )? )* ) | ^( ID ( alias )? ) | ^( CONSIST ID ( alias )? ) | ^( COLUMN ( table_alias )? columnAnt ( alias )? ) );
    public final MySQLWalker.displayed_column_return displayed_column(Select select) throws RecognitionException {
        MySQLWalker.displayed_column_return retval = new MySQLWalker.displayed_column_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ID146=null;
        CommonTree ID149=null;
        CommonTree CONSIST151=null;
        CommonTree ID152=null;
        CommonTree COLUMN154=null;
        MySQLWalker.expr_return expr147 = null;

        MySQLWalker.alias_return alias148 = null;

        MySQLWalker.alias_return alias150 = null;

        MySQLWalker.alias_return alias153 = null;

        MySQLWalker.table_alias_return table_alias155 = null;

        MySQLWalker.columnAnt_return columnAnt156 = null;

        MySQLWalker.alias_return alias157 = null;


        CommonTree ID146_tree=null;
        CommonTree ID149_tree=null;
        CommonTree CONSIST151_tree=null;
        CommonTree ID152_tree=null;
        CommonTree COLUMN154_tree=null;


        List<Object> list=new ArrayList<Object>();

        try {
            // MySQLWalker.g:502:2: ( ^( ID ( expr[$select.getIndexHolder()] ( alias )? )* ) | ^( ID ( alias )? ) | ^( CONSIST ID ( alias )? ) | ^( COLUMN ( table_alias )? columnAnt ( alias )? ) )
            int alt44=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case SUBQUERY:
                    case COLUMN:
                    case QUTED_STR:
                    case COLUMNAST:
                    case CONSIST:
                    case NEGATIVE:
                    case POSITIVE:
                    case BITOR:
                    case BITAND:
                    case BITXOR:
                    case SHIFTLEFT:
                    case SHIFTRIGHT:
                    case PLUS:
                    case MINUS:
                    case ASTERISK:
                    case DIVIDE:
                    case ID:
                    case N:
                    case NUMBER:
                    case 99:
                    case 102:
                    case 104:
                    case 105:
                    case 106:
                        {
                        alt44=1;
                        }
                        break;
                    case UP:
                        {
                        alt44=1;
                        }
                        break;
                    case AS:
                        {
                        alt44=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 4, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
                }
                break;
            case CONSIST:
                {
                alt44=3;
                }
                break;
            case COLUMN:
                {
                alt44=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // MySQLWalker.g:503:2: ^( ID ( expr[$select.getIndexHolder()] ( alias )? )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ID146=(CommonTree)match(input,ID,FOLLOW_ID_in_displayed_column1303); 
                    ID146_tree = (CommonTree)adaptor.dupNode(ID146);

                    root_1 = (CommonTree)adaptor.becomeRoot(ID146_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // MySQLWalker.g:503:8: ( expr[$select.getIndexHolder()] ( alias )? )*
                        loop39:
                        do {
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( ((LA39_0>=SUBQUERY && LA39_0<=COLUMN)||LA39_0==QUTED_STR||LA39_0==COLUMNAST||LA39_0==CONSIST||(LA39_0>=NEGATIVE && LA39_0<=POSITIVE)||(LA39_0>=BITOR && LA39_0<=DIVIDE)||LA39_0==ID||(LA39_0>=N && LA39_0<=NUMBER)||LA39_0==99||LA39_0==102||(LA39_0>=104 && LA39_0<=106)) ) {
                                alt39=1;
                            }


                            switch (alt39) {
                        	case 1 :
                        	    // MySQLWalker.g:503:9: expr[$select.getIndexHolder()] ( alias )?
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_expr_in_displayed_column1307);
                        	    expr147=expr(select.getIndexHolder());

                        	    state._fsp--;

                        	    adaptor.addChild(root_1, expr147.getTree());
                        	    list.add((expr147!=null?expr147.valueObj:null));
                        	    // MySQLWalker.g:503:67: ( alias )?
                        	    int alt38=2;
                        	    int LA38_0 = input.LA(1);

                        	    if ( (LA38_0==AS) ) {
                        	        alt38=1;
                        	    }
                        	    switch (alt38) {
                        	        case 1 :
                        	            // MySQLWalker.g:503:67: alias
                        	            {
                        	            _last = (CommonTree)input.LT(1);
                        	            pushFollow(FOLLOW_alias_in_displayed_column1311);
                        	            alias148=alias();

                        	            state._fsp--;

                        	            adaptor.addChild(root_1, alias148.getTree());

                        	            }
                        	            break;

                        	    }


                        	    }
                        	    break;

                        	default :
                        	    break loop39;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	Function func=funcreg.get(((ID146!=null?ID146.getText():null)).toUpperCase());
                    	func.setValue(list);
                    	FunctionColumn funcolumn=new FunctionColumn();
                    	funcolumn.setFunction(func);
                    	funcolumn.setAlias((alias148!=null?alias148.aliText:null));
                    	select.addColumn(funcolumn);
                    	

                    }
                    break;
                case 2 :
                    // MySQLWalker.g:511:3: ^( ID ( alias )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ID149=(CommonTree)match(input,ID,FOLLOW_ID_in_displayed_column1323); 
                    ID149_tree = (CommonTree)adaptor.dupNode(ID149);

                    root_1 = (CommonTree)adaptor.becomeRoot(ID149_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // MySQLWalker.g:511:8: ( alias )?
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==AS) ) {
                            alt40=1;
                        }
                        switch (alt40) {
                            case 1 :
                                // MySQLWalker.g:511:8: alias
                                {
                                _last = (CommonTree)input.LT(1);
                                pushFollow(FOLLOW_alias_in_displayed_column1325);
                                alias150=alias();

                                state._fsp--;

                                adaptor.addChild(root_1, alias150.getTree());

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	Function func=funcreg.get(((ID149!=null?ID149.getText():null)).toUpperCase());
                    	FunctionColumn funcolumn=new FunctionColumn();
                    	funcolumn.setFunction(func);
                    	funcolumn.setAlias((alias150!=null?alias150.aliText:null));
                    	select.addColumn(funcolumn);
                    	

                    }
                    break;
                case 3 :
                    // MySQLWalker.g:518:3: ^( CONSIST ID ( alias )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CONSIST151=(CommonTree)match(input,CONSIST,FOLLOW_CONSIST_in_displayed_column1333); 
                    CONSIST151_tree = (CommonTree)adaptor.dupNode(CONSIST151);

                    root_1 = (CommonTree)adaptor.becomeRoot(CONSIST151_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ID152=(CommonTree)match(input,ID,FOLLOW_ID_in_displayed_column1335); 
                    ID152_tree = (CommonTree)adaptor.dupNode(ID152);

                    adaptor.addChild(root_1, ID152_tree);

                    // MySQLWalker.g:518:16: ( alias )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==AS) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // MySQLWalker.g:518:16: alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_alias_in_displayed_column1337);
                            alias153=alias();

                            state._fsp--;

                            adaptor.addChild(root_1, alias153.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	Function func=consistStr.get(((ID152!=null?ID152.getText():null)).toUpperCase());
                    	FunctionColumn funcolumn=new FunctionColumn();
                    	funcolumn.setFunction(func);
                    	funcolumn.setAlias((alias153!=null?alias153.aliText:null));
                    	select.addColumn(funcolumn);
                    	

                    }
                    break;
                case 4 :
                    // MySQLWalker.g:525:3: ^( COLUMN ( table_alias )? columnAnt ( alias )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    COLUMN154=(CommonTree)match(input,COLUMN,FOLLOW_COLUMN_in_displayed_column1345); 
                    COLUMN154_tree = (CommonTree)adaptor.dupNode(COLUMN154);

                    root_1 = (CommonTree)adaptor.becomeRoot(COLUMN154_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // MySQLWalker.g:525:12: ( table_alias )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==COL_TAB) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // MySQLWalker.g:525:12: table_alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_table_alias_in_displayed_column1347);
                            table_alias155=table_alias();

                            state._fsp--;

                            adaptor.addChild(root_1, table_alias155.getTree());

                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_columnAnt_in_displayed_column1350);
                    columnAnt156=columnAnt();

                    state._fsp--;

                    adaptor.addChild(root_1, columnAnt156.getTree());
                    // MySQLWalker.g:525:35: ( alias )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==AS) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // MySQLWalker.g:525:35: alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_alias_in_displayed_column1352);
                            alias157=alias();

                            state._fsp--;

                            adaptor.addChild(root_1, alias157.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    select.addColumn((table_alias155!=null?table_alias155.aText:null),(columnAnt156!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(columnAnt156.start),
                      input.getTreeAdaptor().getTokenStopIndex(columnAnt156.start))):null),(alias157!=null?alias157.aliText:null));

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
    // MySQLWalker.g:530:1: columnAnt returns [String aText] : ( ASTERISK | N | identifier );
    public final MySQLWalker.columnAnt_return columnAnt() throws RecognitionException {
        MySQLWalker.columnAnt_return retval = new MySQLWalker.columnAnt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASTERISK158=null;
        CommonTree N159=null;
        MySQLWalker.identifier_return identifier160 = null;


        CommonTree ASTERISK158_tree=null;
        CommonTree N159_tree=null;

        try {
            // MySQLWalker.g:531:2: ( ASTERISK | N | identifier )
            int alt45=3;
            switch ( input.LA(1) ) {
            case ASTERISK:
                {
                alt45=1;
                }
                break;
            case N:
                {
                alt45=2;
                }
                break;
            case ID:
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
                    // MySQLWalker.g:531:3: ASTERISK
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    ASTERISK158=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_columnAnt1376); 
                    ASTERISK158_tree = (CommonTree)adaptor.dupNode(ASTERISK158);

                    adaptor.addChild(root_0, ASTERISK158_tree);

                    retval.aText =(ASTERISK158!=null?ASTERISK158.getText():null);

                    }
                    break;
                case 2 :
                    // MySQLWalker.g:532:3: N
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    N159=(CommonTree)match(input,N,FOLLOW_N_in_columnAnt1382); 
                    N159_tree = (CommonTree)adaptor.dupNode(N159);

                    adaptor.addChild(root_0, N159_tree);

                    retval.aText =(N159!=null?N159.getText():null);

                    }
                    break;
                case 3 :
                    // MySQLWalker.g:533:3: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_columnAnt1388);
                    identifier160=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, identifier160.getTree());
                    retval.aText =(identifier160!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(identifier160.start),
                      input.getTreeAdaptor().getTokenStopIndex(identifier160.start))):null);

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
        public Object aText;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "quoted_string"
    // MySQLWalker.g:536:1: quoted_string returns [Object aText] : QUOTED_STRING ;
    public final MySQLWalker.quoted_string_return quoted_string() throws RecognitionException {
        MySQLWalker.quoted_string_return retval = new MySQLWalker.quoted_string_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QUOTED_STRING161=null;

        CommonTree QUOTED_STRING161_tree=null;

        try {
            // MySQLWalker.g:537:2: ( QUOTED_STRING )
            // MySQLWalker.g:537:4: QUOTED_STRING
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            QUOTED_STRING161=(CommonTree)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_quoted_string1404); 
            QUOTED_STRING161_tree = (CommonTree)adaptor.dupNode(QUOTED_STRING161);

            adaptor.addChild(root_0, QUOTED_STRING161_tree);


                        String temp=(QUOTED_STRING161!=null?QUOTED_STRING161.getText():null);
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
    // MySQLWalker.g:567:1: identifier : ID ;
    public final MySQLWalker.identifier_return identifier() throws RecognitionException {
        MySQLWalker.identifier_return retval = new MySQLWalker.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ID162=null;

        CommonTree ID162_tree=null;

        try {
            // MySQLWalker.g:568:2: ( ID )
            // MySQLWalker.g:568:3: ID
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            ID162=(CommonTree)match(input,ID,FOLLOW_ID_in_identifier1416); 
            ID162_tree = (CommonTree)adaptor.dupNode(ID162);

            adaptor.addChild(root_0, ID162_tree);


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
    // MySQLWalker.g:570:1: table_alias returns [String aText] : ^( COL_TAB identifier ) ;
    public final MySQLWalker.table_alias_return table_alias() throws RecognitionException {
        MySQLWalker.table_alias_return retval = new MySQLWalker.table_alias_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COL_TAB163=null;
        MySQLWalker.identifier_return identifier164 = null;


        CommonTree COL_TAB163_tree=null;

        try {
            // MySQLWalker.g:571:2: ( ^( COL_TAB identifier ) )
            // MySQLWalker.g:571:3: ^( COL_TAB identifier )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            COL_TAB163=(CommonTree)match(input,COL_TAB,FOLLOW_COL_TAB_in_table_alias1433); 
            COL_TAB163_tree = (CommonTree)adaptor.dupNode(COL_TAB163);

            root_1 = (CommonTree)adaptor.becomeRoot(COL_TAB163_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_table_alias1435);
            identifier164=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier164.getTree());
            retval.aText =(identifier164!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(identifier164.start),
              input.getTreeAdaptor().getTokenStopIndex(identifier164.start))):null);

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
    // MySQLWalker.g:574:1: alias returns [String aliText] : ^( AS identifier ) ;
    public final MySQLWalker.alias_return alias() throws RecognitionException {
        MySQLWalker.alias_return retval = new MySQLWalker.alias_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AS165=null;
        MySQLWalker.identifier_return identifier166 = null;


        CommonTree AS165_tree=null;

        try {
            // MySQLWalker.g:575:2: ( ^( AS identifier ) )
            // MySQLWalker.g:575:3: ^( AS identifier )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            AS165=(CommonTree)match(input,AS,FOLLOW_AS_in_alias1454); 
            AS165_tree = (CommonTree)adaptor.dupNode(AS165);

            root_1 = (CommonTree)adaptor.becomeRoot(AS165_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_alias1456);
            identifier166=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier166.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            retval.aliText =(identifier166!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(identifier166.start),
              input.getTreeAdaptor().getTokenStopIndex(identifier166.start))):null);

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

    public static class select_command_return extends TreeRuleReturnScope {
        public Select select;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select_command"
    // MySQLWalker.g:582:1: select_command returns [Select select] : selectClause[$select] ( fromClause[$select] )? ( whereClause[$select.getWhere()] )? ( groupByClause[$select.getWhere()] )? ( orderByClause[$select.getWhere()] )? ( limitClause[(MyWhereCondition)$select.getWhere()] )? ( for_update[$select] )? ;
    public final MySQLWalker.select_command_return select_command() throws RecognitionException {
        MySQLWalker.select_command_return retval = new MySQLWalker.select_command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.selectClause_return selectClause167 = null;

        MySQLWalker.fromClause_return fromClause168 = null;

        MySQLWalker.whereClause_return whereClause169 = null;

        MySQLWalker.groupByClause_return groupByClause170 = null;

        MySQLWalker.orderByClause_return orderByClause171 = null;

        MySQLWalker.limitClause_return limitClause172 = null;

        MySQLWalker.for_update_return for_update173 = null;



        retval.select =new MySelect();
        try {
            // MySQLWalker.g:584:6: ( selectClause[$select] ( fromClause[$select] )? ( whereClause[$select.getWhere()] )? ( groupByClause[$select.getWhere()] )? ( orderByClause[$select.getWhere()] )? ( limitClause[(MyWhereCondition)$select.getWhere()] )? ( for_update[$select] )? )
            // MySQLWalker.g:584:8: selectClause[$select] ( fromClause[$select] )? ( whereClause[$select.getWhere()] )? ( groupByClause[$select.getWhere()] )? ( orderByClause[$select.getWhere()] )? ( limitClause[(MyWhereCondition)$select.getWhere()] )? ( for_update[$select] )?
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_selectClause_in_select_command1485);
            selectClause167=selectClause(retval.select);

            state._fsp--;

            adaptor.addChild(root_0, selectClause167.getTree());
            // MySQLWalker.g:584:30: ( fromClause[$select] )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==TABLENAMES) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // MySQLWalker.g:584:31: fromClause[$select]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_fromClause_in_select_command1489);
                    fromClause168=fromClause(retval.select);

                    state._fsp--;

                    adaptor.addChild(root_0, fromClause168.getTree());

                    }
                    break;

            }

            // MySQLWalker.g:584:54: ( whereClause[$select.getWhere()] )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==WHERE) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // MySQLWalker.g:584:55: whereClause[$select.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_whereClause_in_select_command1496);
                    whereClause169=whereClause(retval.select.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_0, whereClause169.getTree());

                    }
                    break;

            }

            // MySQLWalker.g:584:89: ( groupByClause[$select.getWhere()] )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==GROUPBY) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // MySQLWalker.g:584:90: groupByClause[$select.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_groupByClause_in_select_command1502);
                    groupByClause170=groupByClause(retval.select.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_0, groupByClause170.getTree());

                    }
                    break;

            }

            // MySQLWalker.g:584:126: ( orderByClause[$select.getWhere()] )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ORDERBY) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // MySQLWalker.g:584:127: orderByClause[$select.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_orderByClause_in_select_command1508);
                    orderByClause171=orderByClause(retval.select.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_0, orderByClause171.getTree());

                    }
                    break;

            }

            // MySQLWalker.g:584:164: ( limitClause[(MyWhereCondition)$select.getWhere()] )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==113) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // MySQLWalker.g:584:165: limitClause[(MyWhereCondition)$select.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_limitClause_in_select_command1515);
                    limitClause172=limitClause((MyWhereCondition)retval.select.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_0, limitClause172.getTree());

                    }
                    break;

            }

            // MySQLWalker.g:584:217: ( for_update[$select] )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=SHAREMODE && LA51_0<=FORUPDATE)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // MySQLWalker.g:584:217: for_update[$select]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_for_update_in_select_command1520);
                    for_update173=for_update(retval.select);

                    state._fsp--;

                    adaptor.addChild(root_0, for_update173.getTree());

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

    public static class delete_command_return extends TreeRuleReturnScope {
        public Delete del;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delete_command"
    // MySQLWalker.g:586:1: delete_command returns [Delete del] : ^( DELETE tables[$del] ( whereClause[$del.getWhere()] )? ( orderByClause[$del.getWhere()] )? ( limitClause[(MyWhereCondition)$del.getWhere()] )? ) ;
    public final MySQLWalker.delete_command_return delete_command() throws RecognitionException {
        MySQLWalker.delete_command_return retval = new MySQLWalker.delete_command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DELETE174=null;
        MySQLWalker.tables_return tables175 = null;

        MySQLWalker.whereClause_return whereClause176 = null;

        MySQLWalker.orderByClause_return orderByClause177 = null;

        MySQLWalker.limitClause_return limitClause178 = null;


        CommonTree DELETE174_tree=null;

        retval.del =new Delete();
        try {
            // MySQLWalker.g:588:2: ( ^( DELETE tables[$del] ( whereClause[$del.getWhere()] )? ( orderByClause[$del.getWhere()] )? ( limitClause[(MyWhereCondition)$del.getWhere()] )? ) )
            // MySQLWalker.g:588:3: ^( DELETE tables[$del] ( whereClause[$del.getWhere()] )? ( orderByClause[$del.getWhere()] )? ( limitClause[(MyWhereCondition)$del.getWhere()] )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            DELETE174=(CommonTree)match(input,DELETE,FOLLOW_DELETE_in_delete_command1543); 
            DELETE174_tree = (CommonTree)adaptor.dupNode(DELETE174);

            root_1 = (CommonTree)adaptor.becomeRoot(DELETE174_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_tables_in_delete_command1545);
            tables175=tables(retval.del);

            state._fsp--;

            adaptor.addChild(root_1, tables175.getTree());
            // MySQLWalker.g:588:25: ( whereClause[$del.getWhere()] )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==WHERE) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // MySQLWalker.g:588:25: whereClause[$del.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_whereClause_in_delete_command1548);
                    whereClause176=whereClause(retval.del.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_1, whereClause176.getTree());

                    }
                    break;

            }

            // MySQLWalker.g:588:55: ( orderByClause[$del.getWhere()] )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==ORDERBY) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // MySQLWalker.g:588:55: orderByClause[$del.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_orderByClause_in_delete_command1552);
                    orderByClause177=orderByClause(retval.del.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_1, orderByClause177.getTree());

                    }
                    break;

            }

            // MySQLWalker.g:588:88: ( limitClause[(MyWhereCondition)$del.getWhere()] )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==113) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // MySQLWalker.g:588:89: limitClause[(MyWhereCondition)$del.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_limitClause_in_delete_command1558);
                    limitClause178=limitClause((MyWhereCondition)retval.del.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_1, limitClause178.getTree());

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
    // MySQLWalker.g:590:1: update_command returns [Update update] : ^( UPDATE tables[$update] setclause[$update] ( whereClause[$update.getWhere()] )? ( orderByClause[$update.getWhere()] )? ( limitClause[(MyWhereCondition)$update.getWhere()] )? ) ;
    public final MySQLWalker.update_command_return update_command() throws RecognitionException {
        MySQLWalker.update_command_return retval = new MySQLWalker.update_command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UPDATE179=null;
        MySQLWalker.tables_return tables180 = null;

        MySQLWalker.setclause_return setclause181 = null;

        MySQLWalker.whereClause_return whereClause182 = null;

        MySQLWalker.orderByClause_return orderByClause183 = null;

        MySQLWalker.limitClause_return limitClause184 = null;


        CommonTree UPDATE179_tree=null;

        retval.update =new Update();
        try {
            // MySQLWalker.g:592:2: ( ^( UPDATE tables[$update] setclause[$update] ( whereClause[$update.getWhere()] )? ( orderByClause[$update.getWhere()] )? ( limitClause[(MyWhereCondition)$update.getWhere()] )? ) )
            // MySQLWalker.g:592:3: ^( UPDATE tables[$update] setclause[$update] ( whereClause[$update.getWhere()] )? ( orderByClause[$update.getWhere()] )? ( limitClause[(MyWhereCondition)$update.getWhere()] )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            UPDATE179=(CommonTree)match(input,UPDATE,FOLLOW_UPDATE_in_update_command1580); 
            UPDATE179_tree = (CommonTree)adaptor.dupNode(UPDATE179);

            root_1 = (CommonTree)adaptor.becomeRoot(UPDATE179_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_tables_in_update_command1582);
            tables180=tables(retval.update);

            state._fsp--;

            adaptor.addChild(root_1, tables180.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_setclause_in_update_command1585);
            setclause181=setclause(retval.update);

            state._fsp--;

            adaptor.addChild(root_1, setclause181.getTree());
            // MySQLWalker.g:592:47: ( whereClause[$update.getWhere()] )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==WHERE) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // MySQLWalker.g:592:47: whereClause[$update.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_whereClause_in_update_command1588);
                    whereClause182=whereClause(retval.update.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_1, whereClause182.getTree());

                    }
                    break;

            }

            // MySQLWalker.g:592:80: ( orderByClause[$update.getWhere()] )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==ORDERBY) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // MySQLWalker.g:592:80: orderByClause[$update.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_orderByClause_in_update_command1592);
                    orderByClause183=orderByClause(retval.update.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_1, orderByClause183.getTree());

                    }
                    break;

            }

            // MySQLWalker.g:592:116: ( limitClause[(MyWhereCondition)$update.getWhere()] )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==113) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // MySQLWalker.g:592:117: limitClause[(MyWhereCondition)$update.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_limitClause_in_update_command1598);
                    limitClause184=limitClause((MyWhereCondition)retval.update.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_1, limitClause184.getTree());

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

    public static class limitClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "limitClause"
    // MySQLWalker.g:595:1: limitClause[MyWhereCondition where] : ^( 'LIMIT' ( skip[$where] )? range[$where] ) ;
    public final MySQLWalker.limitClause_return limitClause(MyWhereCondition where) throws RecognitionException {
        MySQLWalker.limitClause_return retval = new MySQLWalker.limitClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree string_literal185=null;
        MySQLWalker.skip_return skip186 = null;

        MySQLWalker.range_return range187 = null;


        CommonTree string_literal185_tree=null;

        try {
            // MySQLWalker.g:596:2: ( ^( 'LIMIT' ( skip[$where] )? range[$where] ) )
            // MySQLWalker.g:596:3: ^( 'LIMIT' ( skip[$where] )? range[$where] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            string_literal185=(CommonTree)match(input,113,FOLLOW_113_in_limitClause1615); 
            string_literal185_tree = (CommonTree)adaptor.dupNode(string_literal185);

            root_1 = (CommonTree)adaptor.becomeRoot(string_literal185_tree, root_1);



            match(input, Token.DOWN, null); 
            // MySQLWalker.g:596:13: ( skip[$where] )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==SKIP) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // MySQLWalker.g:596:13: skip[$where]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_skip_in_limitClause1617);
                    skip186=skip(where);

                    state._fsp--;

                    adaptor.addChild(root_1, skip186.getTree());

                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_range_in_limitClause1621);
            range187=range(where);

            state._fsp--;

            adaptor.addChild(root_1, range187.getTree());

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
    // $ANTLR end "limitClause"

    public static class skip_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "skip"
    // MySQLWalker.g:598:1: skip[MyWhereCondition where] : ( ^( SKIP MINUS N ) | ^( SKIP N ) | ^( SKIP '?' ) );
    public final MySQLWalker.skip_return skip(MyWhereCondition where) throws RecognitionException {
        MySQLWalker.skip_return retval = new MySQLWalker.skip_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SKIP188=null;
        CommonTree MINUS189=null;
        CommonTree N190=null;
        CommonTree SKIP191=null;
        CommonTree N192=null;
        CommonTree SKIP193=null;
        CommonTree char_literal194=null;

        CommonTree SKIP188_tree=null;
        CommonTree MINUS189_tree=null;
        CommonTree N190_tree=null;
        CommonTree SKIP191_tree=null;
        CommonTree N192_tree=null;
        CommonTree SKIP193_tree=null;
        CommonTree char_literal194_tree=null;

        try {
            // MySQLWalker.g:599:2: ( ^( SKIP MINUS N ) | ^( SKIP N ) | ^( SKIP '?' ) )
            int alt59=3;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==SKIP) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case MINUS:
                        {
                        alt59=1;
                        }
                        break;
                    case N:
                        {
                        alt59=2;
                        }
                        break;
                    case 104:
                        {
                        alt59=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // MySQLWalker.g:599:3: ^( SKIP MINUS N )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SKIP188=(CommonTree)match(input,SKIP,FOLLOW_SKIP_in_skip1635); 
                    SKIP188_tree = (CommonTree)adaptor.dupNode(SKIP188);

                    root_1 = (CommonTree)adaptor.becomeRoot(SKIP188_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    MINUS189=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_skip1637); 
                    MINUS189_tree = (CommonTree)adaptor.dupNode(MINUS189);

                    adaptor.addChild(root_1, MINUS189_tree);

                    _last = (CommonTree)input.LT(1);
                    N190=(CommonTree)match(input,N,FOLLOW_N_in_skip1639); 
                    N190_tree = (CommonTree)adaptor.dupNode(N190);

                    adaptor.addChild(root_1, N190_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    where.setStart(-Integer.valueOf((N190!=null?N190.getText():null)));

                    }
                    break;
                case 2 :
                    // MySQLWalker.g:600:3: ^( SKIP N )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SKIP191=(CommonTree)match(input,SKIP,FOLLOW_SKIP_in_skip1646); 
                    SKIP191_tree = (CommonTree)adaptor.dupNode(SKIP191);

                    root_1 = (CommonTree)adaptor.becomeRoot(SKIP191_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    N192=(CommonTree)match(input,N,FOLLOW_N_in_skip1648); 
                    N192_tree = (CommonTree)adaptor.dupNode(N192);

                    adaptor.addChild(root_1, N192_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    where.setStart(Integer.valueOf((N192!=null?N192.getText():null)));

                    }
                    break;
                case 3 :
                    // MySQLWalker.g:601:3: ^( SKIP '?' )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SKIP193=(CommonTree)match(input,SKIP,FOLLOW_SKIP_in_skip1655); 
                    SKIP193_tree = (CommonTree)adaptor.dupNode(SKIP193);

                    root_1 = (CommonTree)adaptor.becomeRoot(SKIP193_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    char_literal194=(CommonTree)match(input,104,FOLLOW_104_in_skip1657); 
                    char_literal194_tree = (CommonTree)adaptor.dupNode(char_literal194);

                    adaptor.addChild(root_1, char_literal194_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		BindVar val=new BindVar(where.selfAddAndGet());
                    		where.setStart(val);
                    	

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
    // $ANTLR end "skip"

    public static class range_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "range"
    // MySQLWalker.g:606:1: range[MyWhereCondition where] : ( ^( RANGE MINUS N ) | ^( RANGE N ) | ^( RANGE '?' ) );
    public final MySQLWalker.range_return range(MyWhereCondition where) throws RecognitionException {
        MySQLWalker.range_return retval = new MySQLWalker.range_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RANGE195=null;
        CommonTree MINUS196=null;
        CommonTree N197=null;
        CommonTree RANGE198=null;
        CommonTree N199=null;
        CommonTree RANGE200=null;
        CommonTree char_literal201=null;

        CommonTree RANGE195_tree=null;
        CommonTree MINUS196_tree=null;
        CommonTree N197_tree=null;
        CommonTree RANGE198_tree=null;
        CommonTree N199_tree=null;
        CommonTree RANGE200_tree=null;
        CommonTree char_literal201_tree=null;

        try {
            // MySQLWalker.g:607:2: ( ^( RANGE MINUS N ) | ^( RANGE N ) | ^( RANGE '?' ) )
            int alt60=3;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RANGE) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case MINUS:
                        {
                        alt60=1;
                        }
                        break;
                    case N:
                        {
                        alt60=2;
                        }
                        break;
                    case 104:
                        {
                        alt60=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // MySQLWalker.g:607:3: ^( RANGE MINUS N )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    RANGE195=(CommonTree)match(input,RANGE,FOLLOW_RANGE_in_range1671); 
                    RANGE195_tree = (CommonTree)adaptor.dupNode(RANGE195);

                    root_1 = (CommonTree)adaptor.becomeRoot(RANGE195_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    MINUS196=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_range1673); 
                    MINUS196_tree = (CommonTree)adaptor.dupNode(MINUS196);

                    adaptor.addChild(root_1, MINUS196_tree);

                    _last = (CommonTree)input.LT(1);
                    N197=(CommonTree)match(input,N,FOLLOW_N_in_range1675); 
                    N197_tree = (CommonTree)adaptor.dupNode(N197);

                    adaptor.addChild(root_1, N197_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    where.setRange(-Integer.valueOf((N197!=null?N197.getText():null)));

                    }
                    break;
                case 2 :
                    // MySQLWalker.g:608:3: ^( RANGE N )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    RANGE198=(CommonTree)match(input,RANGE,FOLLOW_RANGE_in_range1682); 
                    RANGE198_tree = (CommonTree)adaptor.dupNode(RANGE198);

                    root_1 = (CommonTree)adaptor.becomeRoot(RANGE198_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    N199=(CommonTree)match(input,N,FOLLOW_N_in_range1684); 
                    N199_tree = (CommonTree)adaptor.dupNode(N199);

                    adaptor.addChild(root_1, N199_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    where.setRange(Integer.valueOf((N199!=null?N199.getText():null)));

                    }
                    break;
                case 3 :
                    // MySQLWalker.g:609:3: ^( RANGE '?' )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    RANGE200=(CommonTree)match(input,RANGE,FOLLOW_RANGE_in_range1691); 
                    RANGE200_tree = (CommonTree)adaptor.dupNode(RANGE200);

                    root_1 = (CommonTree)adaptor.becomeRoot(RANGE200_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    char_literal201=(CommonTree)match(input,104,FOLLOW_104_in_range1693); 
                    char_literal201_tree = (CommonTree)adaptor.dupNode(char_literal201);

                    adaptor.addChild(root_1, char_literal201_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		BindVar val=new BindVar(where.selfAddAndGet());
                    	where.setRange(val);
                    	

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
    // $ANTLR end "range"

    public static class for_update_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_update"
    // MySQLWalker.g:615:1: for_update[Select select] : ( ^( FORUPDATE ( N )? ) | ^( SHAREMODE ( N )? ) );
    public final MySQLWalker.for_update_return for_update(Select select) throws RecognitionException {
        MySQLWalker.for_update_return retval = new MySQLWalker.for_update_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FORUPDATE202=null;
        CommonTree N203=null;
        CommonTree SHAREMODE204=null;
        CommonTree N205=null;

        CommonTree FORUPDATE202_tree=null;
        CommonTree N203_tree=null;
        CommonTree SHAREMODE204_tree=null;
        CommonTree N205_tree=null;

        try {
            // MySQLWalker.g:616:2: ( ^( FORUPDATE ( N )? ) | ^( SHAREMODE ( N )? ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==FORUPDATE) ) {
                alt63=1;
            }
            else if ( (LA63_0==SHAREMODE) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // MySQLWalker.g:616:3: ^( FORUPDATE ( N )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    FORUPDATE202=(CommonTree)match(input,FORUPDATE,FOLLOW_FORUPDATE_in_for_update1709); 
                    FORUPDATE202_tree = (CommonTree)adaptor.dupNode(FORUPDATE202);

                    root_1 = (CommonTree)adaptor.becomeRoot(FORUPDATE202_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // MySQLWalker.g:616:15: ( N )?
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==N) ) {
                            alt61=1;
                        }
                        switch (alt61) {
                            case 1 :
                                // MySQLWalker.g:616:15: N
                                {
                                _last = (CommonTree)input.LT(1);
                                N203=(CommonTree)match(input,N,FOLLOW_N_in_for_update1711); 
                                N203_tree = (CommonTree)adaptor.dupNode(N203);

                                adaptor.addChild(root_1, N203_tree);


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		MySQLForUpdate forUpdate = new MySQLForUpdate();
                    		select.addForUpdate(forUpdate);
                    	

                    }
                    break;
                case 2 :
                    // MySQLWalker.g:621:3: ^( SHAREMODE ( N )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SHAREMODE204=(CommonTree)match(input,SHAREMODE,FOLLOW_SHAREMODE_in_for_update1721); 
                    SHAREMODE204_tree = (CommonTree)adaptor.dupNode(SHAREMODE204);

                    root_1 = (CommonTree)adaptor.becomeRoot(SHAREMODE204_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // MySQLWalker.g:621:15: ( N )?
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==N) ) {
                            alt62=1;
                        }
                        switch (alt62) {
                            case 1 :
                                // MySQLWalker.g:621:15: N
                                {
                                _last = (CommonTree)input.LT(1);
                                N205=(CommonTree)match(input,N,FOLLOW_N_in_for_update1723); 
                                N205_tree = (CommonTree)adaptor.dupNode(N205);

                                adaptor.addChild(root_1, N205_tree);


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		MySQLLockInShareMode share = new MySQLLockInShareMode();
                    		select.addForUpdate(share);
                    	

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
    // $ANTLR end "for_update"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\15\uffff";
    static final String DFA16_eofS =
        "\15\uffff";
    static final String DFA16_minS =
        "\1\3\14\uffff";
    static final String DFA16_maxS =
        "\1\136\14\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\2\13\1";
    static final String DFA16_specialS =
        "\15\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\11\uffff\1\10\12\uffff\1\11\1\12\3\uffff\1\14\1\13\6\uffff"+
            "\1\1\17\uffff\1\2\15\uffff\1\4\1\5\1\3\1\6\1\7\25\uffff\2\1",
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

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "()+ loopback of 187:3: ( condition_expr[$where,$exp] )+";
        }
    }
 

    public static final BitSet FOLLOW_start_rule_in_beg48 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_command_in_start_rule65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_command_in_start_rule70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_command_in_start_rule75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_command_in_start_rule80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setclause93 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_updateColumnSpecs_in_setclause95 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_SET_ELE_in_updateColumnSpecs110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_updateColumnSpec_in_updateColumnSpecs112 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_updateColumnSpec126 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_alias_in_updateColumnSpec128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_updateColumnSpec131 = new BitSet(new long[]{0xFF0C204000010180L,0x0000074800001805L});
    public static final BitSet FOLLOW_expr_in_updateColumnSpec133 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSERT_in_insert_command156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tables_in_insert_command158 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_column_specs_in_insert_command161 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_values_in_insert_command165 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSERT_VAL_in_values177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_values180 = new BitSet(new long[]{0xFF0C204000010188L,0x0000074800001805L});
    public static final BitSet FOLLOW_COLUMNS_in_column_specs196 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_column_spec_in_column_specs198 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_COLUMN_in_column_spec212 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_column_spec214 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000004L});
    public static final BitSet FOLLOW_table_name_in_column_spec216 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_in_whereClause235 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sqlCondition_in_whereClause237 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUPBY_in_groupByClause250 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_columnNamesAfterWhere_in_groupByClause252 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ORDERBY_in_orderByClause265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_columnNamesAfterWhere_in_orderByClause267 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_columnNameAfterWhere_in_columnNamesAfterWhere286 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_ASC_in_columnNameAfterWhere300 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_columnNameAfterWhere303 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_table_alias_in_columnNameAfterWhere305 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DESC_in_columnNameAfterWhere313 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_columnNameAfterWhere316 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_table_alias_in_columnNameAfterWhere318 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_in_selectClause336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_select_list_in_selectClause338 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_OR_NOT_in_sqlCondition359 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_sqlCondition361 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_OR_in_sqlCondition368 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_sqlCondition370 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_93_in_condition391 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition395 = new BitSet(new long[]{0x0020002063002008L,0x00000000600000F8L});
    public static final BitSet FOLLOW_94_in_condition407 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition409 = new BitSet(new long[]{0x0020002063002008L,0x00000000600000F8L});
    public static final BitSet FOLLOW_condition_PAREN_in_condition420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIORITY_in_condition426 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition428 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_condition_expr_in_condition_PAREN443 = new BitSet(new long[]{0x0020000063002002L,0x00000000000000F8L});
    public static final BitSet FOLLOW_comparisonCondition_in_condition_expr456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inCondition_in_condition_expr462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isCondition_in_condition_expr469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_likeCondition_in_condition_expr476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_BETWEEN_in_betweenCondition488 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_between_and_in_betweenCondition490 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BETWEEN_in_betweenCondition496 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_between_and_in_betweenCondition498 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_LIKE_in_likeCondition519 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_likeCondition521 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_likeCondition524 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIKE_in_likeCondition532 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_likeCondition534 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_likeCondition537 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISNOT_in_isCondition553 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NULL_in_isCondition555 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_isCondition557 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IS_in_isCondition565 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NULL_in_isCondition567 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_isCondition569 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_comparisonCondition586 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition588 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition591 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQ_in_comparisonCondition601 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition603 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition606 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LTH_in_comparisonCondition616 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition618 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition621 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GTH_in_comparisonCondition631 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition633 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition636 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LEQ_in_comparisonCondition646 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition648 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition651 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEQ_in_comparisonCondition661 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition663 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition666 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_LEFT_in_left_cond687 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_left_cond689 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_LISTS_in_in_list708 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_inCondition_expr_adds_in_in_list710 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_in_inCondition728 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_92_in_inCondition732 = new BitSet(new long[]{0xFF0C204000190180L,0x0000074800001805L});
    public static final BitSet FOLLOW_subquery_in_inCondition735 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_in_list_in_inCondition738 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_inCondition743 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_add_in_inCondition_expr_adds777 = new BitSet(new long[]{0xFF0C204000010102L,0x0000074800001805L});
    public static final BitSet FOLLOW_expr_add_in_expr802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_expr809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEGATIVE_in_expr_add836 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add840 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSITIVE_in_expr_add849 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add853 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr_add862 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add866 = new BitSet(new long[]{0xFF0C204000010100L,0x0000074800001805L});
    public static final BitSet FOLLOW_expr_add_in_expr_add871 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr_add880 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add884 = new BitSet(new long[]{0xFF0C204000010100L,0x0000074800001805L});
    public static final BitSet FOLLOW_expr_add_in_expr_add889 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BITOR_in_expr_add897 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add901 = new BitSet(new long[]{0xFF0C204000010100L,0x0000074800001805L});
    public static final BitSet FOLLOW_expr_add_in_expr_add906 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BITAND_in_expr_add914 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add918 = new BitSet(new long[]{0xFF0C204000010100L,0x0000074800001805L});
    public static final BitSet FOLLOW_expr_add_in_expr_add923 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BITXOR_in_expr_add931 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add935 = new BitSet(new long[]{0xFF0C204000010100L,0x0000074800001805L});
    public static final BitSet FOLLOW_expr_add_in_expr_add940 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFTLEFT_in_expr_add948 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add952 = new BitSet(new long[]{0xFF0C204000010100L,0x0000074800001805L});
    public static final BitSet FOLLOW_expr_add_in_expr_add957 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFTRIGHT_in_expr_add965 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add969 = new BitSet(new long[]{0xFF0C204000010100L,0x0000074800001805L});
    public static final BitSet FOLLOW_expr_add_in_expr_add974 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASTERISK_in_expr_add982 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add986 = new BitSet(new long[]{0xFF0C204000010100L,0x0000074800001805L});
    public static final BitSet FOLLOW_expr_add_in_expr_add991 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIVIDE_in_expr_add999 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1003 = new BitSet(new long[]{0xFF0C204000010100L,0x0000074800001805L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1008 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_N_in_expr_add1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_expr_add1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_literal_in_expr_add1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_expr_add1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_expr_add1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_expr_add1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUTED_STR_in_expr_add1046 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_quoted_string_in_expr_add1048 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLUMN_in_expr_add1055 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_expr_add1057 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000004L});
    public static final BitSet FOLLOW_table_name_in_expr_add1059 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLUMNAST_in_expr_add1069 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASTERISK_in_expr_add1071 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_expr_add1080 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr_add1085 = new BitSet(new long[]{0xFF0C204000010188L,0x0000074800001805L});
    public static final BitSet FOLLOW_CONSIST_in_expr_add1096 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr_add1098 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_value0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_boolean_literal1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_boolean_literal1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_LIST_in_select_list1157 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_displayed_column_in_select_list1159 = new BitSet(new long[]{0x0000200000000108L,0x0000000000000004L});
    public static final BitSet FOLLOW_TABLENAMES_in_fromClause1174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_in_fromClause1176 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_TABLENAME_in_table1191 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_spec_in_table1193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TABLENAMES_in_tables1206 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_in_tables1208 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_schema_name_in_table_spec1223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_table_name_in_table_spec1227 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_alias_in_table_spec1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_table_spec1238 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_alias_in_table_spec1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_schema_name1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBQUERY_in_subquery1269 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_select_command_in_subquery1271 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_identifier_in_table_name1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_displayed_column1303 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_displayed_column1307 = new BitSet(new long[]{0xFF0C204000010388L,0x0000074800001805L});
    public static final BitSet FOLLOW_alias_in_displayed_column1311 = new BitSet(new long[]{0xFF0C204000010188L,0x0000074800001805L});
    public static final BitSet FOLLOW_ID_in_displayed_column1323 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_alias_in_displayed_column1325 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSIST_in_displayed_column1333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_displayed_column1335 = new BitSet(new long[]{0x0000000000000208L});
    public static final BitSet FOLLOW_alias_in_displayed_column1337 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLUMN_in_displayed_column1345 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_alias_in_displayed_column1347 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_columnAnt_in_displayed_column1350 = new BitSet(new long[]{0x0000000000000208L});
    public static final BitSet FOLLOW_alias_in_displayed_column1352 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASTERISK_in_columnAnt1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_N_in_columnAnt1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_columnAnt1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_quoted_string1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COL_TAB_in_table_alias1433 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_table_alias1435 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AS_in_alias1454 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_alias1456 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_selectClause_in_select_command1485 = new BitSet(new long[]{0x0003000600020042L,0x0002000000000000L});
    public static final BitSet FOLLOW_fromClause_in_select_command1489 = new BitSet(new long[]{0x0003000600020002L,0x0002000000000000L});
    public static final BitSet FOLLOW_whereClause_in_select_command1496 = new BitSet(new long[]{0x0003000600000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_groupByClause_in_select_command1502 = new BitSet(new long[]{0x0003000400000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_orderByClause_in_select_command1508 = new BitSet(new long[]{0x0003000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_limitClause_in_select_command1515 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_for_update_in_select_command1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_command1543 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tables_in_delete_command1545 = new BitSet(new long[]{0x0000000400020008L,0x0002000000000000L});
    public static final BitSet FOLLOW_whereClause_in_delete_command1548 = new BitSet(new long[]{0x0000000400000008L,0x0002000000000000L});
    public static final BitSet FOLLOW_orderByClause_in_delete_command1552 = new BitSet(new long[]{0x0000000000000008L,0x0002000000000000L});
    public static final BitSet FOLLOW_limitClause_in_delete_command1558 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UPDATE_in_update_command1580 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tables_in_update_command1582 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_setclause_in_update_command1585 = new BitSet(new long[]{0x0000000400020008L,0x0002000000000000L});
    public static final BitSet FOLLOW_whereClause_in_update_command1588 = new BitSet(new long[]{0x0000000400000008L,0x0002000000000000L});
    public static final BitSet FOLLOW_orderByClause_in_update_command1592 = new BitSet(new long[]{0x0000000000000008L,0x0002000000000000L});
    public static final BitSet FOLLOW_limitClause_in_update_command1598 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_113_in_limitClause1615 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_skip_in_limitClause1617 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_range_in_limitClause1621 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SKIP_in_skip1635 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_in_skip1637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_N_in_skip1639 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SKIP_in_skip1646 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_N_in_skip1648 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SKIP_in_skip1655 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_104_in_skip1657 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RANGE_in_range1671 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_in_range1673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_N_in_range1675 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RANGE_in_range1682 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_N_in_range1684 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RANGE_in_range1691 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_104_in_range1693 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORUPDATE_in_for_update1709 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_N_in_for_update1711 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHAREMODE_in_for_update1721 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_N_in_for_update1723 = new BitSet(new long[]{0x0000000000000008L});

}