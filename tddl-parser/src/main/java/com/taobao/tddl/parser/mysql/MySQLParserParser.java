// $ANTLR 3.2 Sep 23, 2009 12:02:23 MySQLParser.g 2009-12-09 12:38:23

package com.taobao.tddl.parser.mysql;

import java.util.Map;
import java.util.HashMap;
import com.taobao.tddl.sqlobjecttree.Function;
import com.taobao.tddl.sqlobjecttree.mysql.function.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class MySQLParserParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALIAS", "TABLENAME", "TABLENAMES", "SUBQUERY", "COLUMN", "AS", "SELECT", "DISPLAYED_COUNT_COLUMN", "DISPLAYED_COLUMN", "IN", "NOT", "SELECT_LIST", "QUTED_STR", "WHERE", "CONDITION_OR", "CONDITION_LEFT", "IN_LISTS", "CONDITION_OR_NOT", "AND", "OR", "ISNOT", "IS", "NULL", "NAN", "INFINITE", "LIKE", "NOT_LIKE", "NOT_BETWEEN", "BETWEEN", "GROUPBY", "ORDERBY", "INSERT", "INSERT_VAL", "PRIORITY", "COLUMNAST", "COLUMNS", "UPDATE", "SET", "SET_ELE", "COL_TAB", "DELETE", "CONSIST", "SKIP", "RANGE", "SHAREMODE", "FORUPDATE", "NEGATIVE", "POSITIVE", "COMMA", "EQ", "LPAREN", "RPAREN", "BITOR", "BITAND", "BITXOR", "SHIFTLEFT", "SHIFTRIGHT", "PLUS", "MINUS", "ASTERISK", "DIVIDE", "EXPONENT", "ID", "LTH", "GTH", "NOT_EQ", "LEQ", "GEQ", "ASC", "DESC", "DOT", "N", "NUMBER", "POINT", "ARROW", "DOUBLEVERTBAR", "QUOTED_STRING", "DOUBLEQUOTED_STRING", "WS", "'SET'", "'INSERT'", "'INTO'", "'VALUES'", "'GROUP'", "'BY'", "'ORDER'", "'SELECT'", "'WHERE'", "'NOT'", "'OR'", "'AND'", "'BETWEEN'", "'IS'", "'NAN'", "'INFINITE'", "'NULL'", "'IN'", "'LIKE'", "'ROWNUM'", "'FROM'", "'?'", "'TRUE'", "'FALSE'", "'AS'", "'FORCE'", "'INDEX'", "'IGNORE'", "'DELETE'", "'UPDATE'", "'LIMIT'", "'FOR'", "'LOCK'", "'SHARE'", "'MODE'"
    };
    public static final int COLUMNAST=38;
    public static final int EXPONENT=65;
    public static final int CONDITION_LEFT=19;
    public static final int NOT=14;
    public static final int CONSIST=45;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int DISPLAYED_COUNT_COLUMN=11;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int RPAREN=55;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int INSERT=35;
    public static final int GEQ=71;
    public static final int EQ=53;
    public static final int SELECT=10;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int GROUPBY=33;
    public static final int DIVIDE=64;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int FORUPDATE=49;
    public static final int POSITIVE=51;
    public static final int ASC=72;
    public static final int T__83=83;
    public static final int DISPLAYED_COLUMN=12;
    public static final int N=75;
    public static final int NULL=26;
    public static final int NUMBER=76;
    public static final int CONDITION_OR=18;
    public static final int DELETE=44;
    public static final int DOUBLEVERTBAR=79;
    public static final int TABLENAMES=6;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int SKIP=46;
    public static final int WS=82;
    public static final int BITOR=56;
    public static final int PRIORITY=37;
    public static final int SELECT_LIST=15;
    public static final int OR=23;
    public static final int ALIAS=4;
    public static final int NAN=27;
    public static final int WHERE=17;
    public static final int POINT=77;
    public static final int T__116=116;
    public static final int GTH=68;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int IN_LISTS=20;
    public static final int SHIFTLEFT=59;
    public static final int UPDATE=40;
    public static final int ORDERBY=34;
    public static final int ID=66;
    public static final int AND=22;
    public static final int BITAND=57;
    public static final int ASTERISK=63;
    public static final int LPAREN=54;
    public static final int SUBQUERY=7;
    public static final int AS=9;
    public static final int IN=13;
    public static final int QUTED_STR=16;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int COMMA=52;
    public static final int T__109=109;
    public static final int IS=25;
    public static final int T__103=103;
    public static final int SHIFTRIGHT=60;
    public static final int T__104=104;
    public static final int BITXOR=58;
    public static final int T__105=105;
    public static final int COLUMN=8;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int QUOTED_STRING=80;
    public static final int PLUS=61;
    public static final int T__112=112;
    public static final int DOT=74;
    public static final int SHAREMODE=48;
    public static final int LIKE=29;
    public static final int DOUBLEQUOTED_STRING=81;
    public static final int NEGATIVE=50;
    public static final int NOT_LIKE=30;
    public static final int NOT_BETWEEN=31;
    public static final int RANGE=47;
    public static final int INFINITE=28;
    public static final int SET=41;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int INSERT_VAL=36;
    public static final int T__100=100;
    public static final int MINUS=62;
    public static final int CONDITION_OR_NOT=21;
    public static final int NOT_EQ=69;
    public static final int LTH=67;
    public static final int COLUMNS=39;
    public static final int COL_TAB=43;
    public static final int ARROW=78;
    public static final int SET_ELE=42;
    public static final int ISNOT=24;
    public static final int DESC=73;
    public static final int TABLENAME=5;
    public static final int BETWEEN=32;
    public static final int LEQ=70;

    // delegates
    // delegators


        public MySQLParserParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public MySQLParserParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return MySQLParserParser.tokenNames; }
    public String getGrammarFileName() { return "MySQLParser.g"; }



    		protected MySQLConsistStringRegister consistStr;
    		public MySQLConsistStringRegister getConsist(){
    				return consistStr;
    		}
    		public void setConsist(MySQLConsistStringRegister consist){
    				this.consistStr=consist;
    		}
    		protected  MySQLFunctionRegister functionMap;


        	public MySQLFunctionRegister getFunc() {
    			return functionMap;
    		}
    		public void setFunc(MySQLFunctionRegister funcreg) {
    				this.functionMap = funcreg;
    		}
    	protected void mismatch(IntStream input, int ttype, BitSet follow)
    			throws RecognitionException {
    		throw new MismatchedTokenException(ttype, input);
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
    // Alter code generation so catch-clauses get replace with
    // this action.



    public static class beg_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "beg"
    // MySQLParser.g:111:1: beg : start_rule ;
    public final MySQLParserParser.beg_return beg() throws RecognitionException {
        MySQLParserParser.beg_return retval = new MySQLParserParser.beg_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        MySQLParserParser.start_rule_return start_rule1 = null;



        try {
            // MySQLParser.g:111:5: ( start_rule )
            // MySQLParser.g:112:1: start_rule
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_start_rule_in_beg252);
            start_rule1=start_rule();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, start_rule1.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "beg"

    public static class start_rule_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start_rule"
    // MySQLParser.g:115:1: start_rule : ( select_command | update_command | insert_command | delete_command );
    public final MySQLParserParser.start_rule_return start_rule() throws RecognitionException {
        MySQLParserParser.start_rule_return retval = new MySQLParserParser.start_rule_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        MySQLParserParser.select_command_return select_command2 = null;

        MySQLParserParser.update_command_return update_command3 = null;

        MySQLParserParser.insert_command_return insert_command4 = null;

        MySQLParserParser.delete_command_return delete_command5 = null;



        try {
            // MySQLParser.g:116:2: ( select_command | update_command | insert_command | delete_command )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt1=1;
                }
                break;
            case 112:
                {
                alt1=2;
                }
                break;
            case 84:
                {
                alt1=3;
                }
                break;
            case 111:
                {
                alt1=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // MySQLParser.g:116:3: select_command
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_select_command_in_start_rule264);
                    select_command2=select_command();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, select_command2.getTree());

                    }
                    break;
                case 2 :
                    // MySQLParser.g:117:3: update_command
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_update_command_in_start_rule268);
                    update_command3=update_command();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, update_command3.getTree());

                    }
                    break;
                case 3 :
                    // MySQLParser.g:118:3: insert_command
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_insert_command_in_start_rule272);
                    insert_command4=insert_command();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, insert_command4.getTree());

                    }
                    break;
                case 4 :
                    // MySQLParser.g:119:3: delete_command
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_delete_command_in_start_rule276);
                    delete_command5=delete_command();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delete_command5.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "start_rule"

    public static class setclause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setclause"
    // MySQLParser.g:123:1: setclause : 'SET' updateColumnSpecs -> ^( SET updateColumnSpecs ) ;
    public final MySQLParserParser.setclause_return setclause() throws RecognitionException {
        MySQLParserParser.setclause_return retval = new MySQLParserParser.setclause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal6=null;
        MySQLParserParser.updateColumnSpecs_return updateColumnSpecs7 = null;


        CommonTree string_literal6_tree=null;
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleSubtreeStream stream_updateColumnSpecs=new RewriteRuleSubtreeStream(adaptor,"rule updateColumnSpecs");
        try {
            // MySQLParser.g:124:2: ( 'SET' updateColumnSpecs -> ^( SET updateColumnSpecs ) )
            // MySQLParser.g:124:3: 'SET' updateColumnSpecs
            {
            string_literal6=(Token)match(input,83,FOLLOW_83_in_setclause288); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_83.add(string_literal6);

            pushFollow(FOLLOW_updateColumnSpecs_in_setclause290);
            updateColumnSpecs7=updateColumnSpecs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_updateColumnSpecs.add(updateColumnSpecs7.getTree());


            // AST REWRITE
            // elements: updateColumnSpecs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 124:26: -> ^( SET updateColumnSpecs )
            {
                // MySQLParser.g:124:28: ^( SET updateColumnSpecs )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET, "SET"), root_1);

                adaptor.addChild(root_1, stream_updateColumnSpecs.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "setclause"

    public static class updateColumnSpecs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "updateColumnSpecs"
    // MySQLParser.g:127:1: updateColumnSpecs : updateColumnSpec ( COMMA updateColumnSpec )* -> ( ^( SET_ELE updateColumnSpec ) )+ ;
    public final MySQLParserParser.updateColumnSpecs_return updateColumnSpecs() throws RecognitionException {
        MySQLParserParser.updateColumnSpecs_return retval = new MySQLParserParser.updateColumnSpecs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA9=null;
        MySQLParserParser.updateColumnSpec_return updateColumnSpec8 = null;

        MySQLParserParser.updateColumnSpec_return updateColumnSpec10 = null;


        CommonTree COMMA9_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_updateColumnSpec=new RewriteRuleSubtreeStream(adaptor,"rule updateColumnSpec");
        try {
            // MySQLParser.g:128:2: ( updateColumnSpec ( COMMA updateColumnSpec )* -> ( ^( SET_ELE updateColumnSpec ) )+ )
            // MySQLParser.g:128:3: updateColumnSpec ( COMMA updateColumnSpec )*
            {
            pushFollow(FOLLOW_updateColumnSpec_in_updateColumnSpecs307);
            updateColumnSpec8=updateColumnSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_updateColumnSpec.add(updateColumnSpec8.getTree());
            // MySQLParser.g:128:20: ( COMMA updateColumnSpec )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==COMMA) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // MySQLParser.g:128:21: COMMA updateColumnSpec
            	    {
            	    COMMA9=(Token)match(input,COMMA,FOLLOW_COMMA_in_updateColumnSpecs310); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA9);

            	    pushFollow(FOLLOW_updateColumnSpec_in_updateColumnSpecs312);
            	    updateColumnSpec10=updateColumnSpec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_updateColumnSpec.add(updateColumnSpec10.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);



            // AST REWRITE
            // elements: updateColumnSpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 128:45: -> ( ^( SET_ELE updateColumnSpec ) )+
            {
                if ( !(stream_updateColumnSpec.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_updateColumnSpec.hasNext() ) {
                    // MySQLParser.g:128:47: ^( SET_ELE updateColumnSpec )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_ELE, "SET_ELE"), root_1);

                    adaptor.addChild(root_1, stream_updateColumnSpec.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_updateColumnSpec.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "updateColumnSpecs"

    public static class updateColumnSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "updateColumnSpec"
    // MySQLParser.g:130:1: updateColumnSpec : columnNameInUpdate EQ expr ;
    public final MySQLParserParser.updateColumnSpec_return updateColumnSpec() throws RecognitionException {
        MySQLParserParser.updateColumnSpec_return retval = new MySQLParserParser.updateColumnSpec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQ12=null;
        MySQLParserParser.columnNameInUpdate_return columnNameInUpdate11 = null;

        MySQLParserParser.expr_return expr13 = null;


        CommonTree EQ12_tree=null;

        try {
            // MySQLParser.g:131:2: ( columnNameInUpdate EQ expr )
            // MySQLParser.g:131:3: columnNameInUpdate EQ expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_columnNameInUpdate_in_updateColumnSpec330);
            columnNameInUpdate11=columnNameInUpdate();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, columnNameInUpdate11.getTree());
            EQ12=(Token)match(input,EQ,FOLLOW_EQ_in_updateColumnSpec332); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ12_tree = (CommonTree)adaptor.create(EQ12);
            root_0 = (CommonTree)adaptor.becomeRoot(EQ12_tree, root_0);
            }
            pushFollow(FOLLOW_expr_in_updateColumnSpec335);
            expr13=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr13.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "updateColumnSpec"

    public static class insert_command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "insert_command"
    // MySQLParser.g:133:1: insert_command : 'INSERT' 'INTO' selected_table ( LPAREN column_specs RPAREN )? ( 'VALUES' LPAREN values RPAREN ) -> ^( INSERT selected_table column_specs values ) ;
    public final MySQLParserParser.insert_command_return insert_command() throws RecognitionException {
        MySQLParserParser.insert_command_return retval = new MySQLParserParser.insert_command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal14=null;
        Token string_literal15=null;
        Token LPAREN17=null;
        Token RPAREN19=null;
        Token string_literal20=null;
        Token LPAREN21=null;
        Token RPAREN23=null;
        MySQLParserParser.selected_table_return selected_table16 = null;

        MySQLParserParser.column_specs_return column_specs18 = null;

        MySQLParserParser.values_return values22 = null;


        CommonTree string_literal14_tree=null;
        CommonTree string_literal15_tree=null;
        CommonTree LPAREN17_tree=null;
        CommonTree RPAREN19_tree=null;
        CommonTree string_literal20_tree=null;
        CommonTree LPAREN21_tree=null;
        CommonTree RPAREN23_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_selected_table=new RewriteRuleSubtreeStream(adaptor,"rule selected_table");
        RewriteRuleSubtreeStream stream_values=new RewriteRuleSubtreeStream(adaptor,"rule values");
        RewriteRuleSubtreeStream stream_column_specs=new RewriteRuleSubtreeStream(adaptor,"rule column_specs");
        try {
            // MySQLParser.g:134:2: ( 'INSERT' 'INTO' selected_table ( LPAREN column_specs RPAREN )? ( 'VALUES' LPAREN values RPAREN ) -> ^( INSERT selected_table column_specs values ) )
            // MySQLParser.g:134:4: 'INSERT' 'INTO' selected_table ( LPAREN column_specs RPAREN )? ( 'VALUES' LPAREN values RPAREN )
            {
            string_literal14=(Token)match(input,84,FOLLOW_84_in_insert_command345); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_84.add(string_literal14);

            string_literal15=(Token)match(input,85,FOLLOW_85_in_insert_command347); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_85.add(string_literal15);

            pushFollow(FOLLOW_selected_table_in_insert_command349);
            selected_table16=selected_table();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selected_table.add(selected_table16.getTree());
            // MySQLParser.g:135:3: ( LPAREN column_specs RPAREN )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==LPAREN) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // MySQLParser.g:135:5: LPAREN column_specs RPAREN
                    {
                    LPAREN17=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_command355); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN17);

                    pushFollow(FOLLOW_column_specs_in_insert_command357);
                    column_specs18=column_specs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_column_specs.add(column_specs18.getTree());
                    RPAREN19=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_command360); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN19);


                    }
                    break;

            }

            // MySQLParser.g:136:3: ( 'VALUES' LPAREN values RPAREN )
            // MySQLParser.g:136:4: 'VALUES' LPAREN values RPAREN
            {
            string_literal20=(Token)match(input,86,FOLLOW_86_in_insert_command368); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_86.add(string_literal20);

            LPAREN21=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_command370); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN21);

            pushFollow(FOLLOW_values_in_insert_command372);
            values22=values();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_values.add(values22.getTree());
            RPAREN23=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_command374); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN23);


            }



            // AST REWRITE
            // elements: values, column_specs, selected_table
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 137:4: -> ^( INSERT selected_table column_specs values )
            {
                // MySQLParser.g:137:6: ^( INSERT selected_table column_specs values )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INSERT, "INSERT"), root_1);

                adaptor.addChild(root_1, stream_selected_table.nextTree());
                adaptor.addChild(root_1, stream_column_specs.nextTree());
                adaptor.addChild(root_1, stream_values.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "insert_command"

    public static class groupByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "groupByClause"
    // MySQLParser.g:140:1: groupByClause : 'GROUP' 'BY' columnNamesAfterWhere -> ^( GROUPBY columnNamesAfterWhere ) ;
    public final MySQLParserParser.groupByClause_return groupByClause() throws RecognitionException {
        MySQLParserParser.groupByClause_return retval = new MySQLParserParser.groupByClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal24=null;
        Token string_literal25=null;
        MySQLParserParser.columnNamesAfterWhere_return columnNamesAfterWhere26 = null;


        CommonTree string_literal24_tree=null;
        CommonTree string_literal25_tree=null;
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleSubtreeStream stream_columnNamesAfterWhere=new RewriteRuleSubtreeStream(adaptor,"rule columnNamesAfterWhere");
        try {
            // MySQLParser.g:141:2: ( 'GROUP' 'BY' columnNamesAfterWhere -> ^( GROUPBY columnNamesAfterWhere ) )
            // MySQLParser.g:141:3: 'GROUP' 'BY' columnNamesAfterWhere
            {
            string_literal24=(Token)match(input,87,FOLLOW_87_in_groupByClause398); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_87.add(string_literal24);

            string_literal25=(Token)match(input,88,FOLLOW_88_in_groupByClause400); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_88.add(string_literal25);

            pushFollow(FOLLOW_columnNamesAfterWhere_in_groupByClause402);
            columnNamesAfterWhere26=columnNamesAfterWhere();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnNamesAfterWhere.add(columnNamesAfterWhere26.getTree());


            // AST REWRITE
            // elements: columnNamesAfterWhere
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 141:37: -> ^( GROUPBY columnNamesAfterWhere )
            {
                // MySQLParser.g:141:39: ^( GROUPBY columnNamesAfterWhere )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GROUPBY, "GROUPBY"), root_1);

                adaptor.addChild(root_1, stream_columnNamesAfterWhere.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "groupByClause"

    public static class orderByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orderByClause"
    // MySQLParser.g:144:1: orderByClause : 'ORDER' 'BY' columnNamesAfterWhere -> ^( ORDERBY columnNamesAfterWhere ) ;
    public final MySQLParserParser.orderByClause_return orderByClause() throws RecognitionException {
        MySQLParserParser.orderByClause_return retval = new MySQLParserParser.orderByClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal27=null;
        Token string_literal28=null;
        MySQLParserParser.columnNamesAfterWhere_return columnNamesAfterWhere29 = null;


        CommonTree string_literal27_tree=null;
        CommonTree string_literal28_tree=null;
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_columnNamesAfterWhere=new RewriteRuleSubtreeStream(adaptor,"rule columnNamesAfterWhere");
        try {
            // MySQLParser.g:145:2: ( 'ORDER' 'BY' columnNamesAfterWhere -> ^( ORDERBY columnNamesAfterWhere ) )
            // MySQLParser.g:145:3: 'ORDER' 'BY' columnNamesAfterWhere
            {
            string_literal27=(Token)match(input,89,FOLLOW_89_in_orderByClause422); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_89.add(string_literal27);

            string_literal28=(Token)match(input,88,FOLLOW_88_in_orderByClause424); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_88.add(string_literal28);

            pushFollow(FOLLOW_columnNamesAfterWhere_in_orderByClause426);
            columnNamesAfterWhere29=columnNamesAfterWhere();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnNamesAfterWhere.add(columnNamesAfterWhere29.getTree());


            // AST REWRITE
            // elements: columnNamesAfterWhere
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 145:37: -> ^( ORDERBY columnNamesAfterWhere )
            {
                // MySQLParser.g:145:39: ^( ORDERBY columnNamesAfterWhere )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ORDERBY, "ORDERBY"), root_1);

                adaptor.addChild(root_1, stream_columnNamesAfterWhere.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "orderByClause"

    public static class columnNamesAfterWhere_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnNamesAfterWhere"
    // MySQLParser.g:149:1: columnNamesAfterWhere : columnNameAfterWhere ( COMMA columnNameAfterWhere )* ;
    public final MySQLParserParser.columnNamesAfterWhere_return columnNamesAfterWhere() throws RecognitionException {
        MySQLParserParser.columnNamesAfterWhere_return retval = new MySQLParserParser.columnNamesAfterWhere_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA31=null;
        MySQLParserParser.columnNameAfterWhere_return columnNameAfterWhere30 = null;

        MySQLParserParser.columnNameAfterWhere_return columnNameAfterWhere32 = null;


        CommonTree COMMA31_tree=null;

        try {
            // MySQLParser.g:150:5: ( columnNameAfterWhere ( COMMA columnNameAfterWhere )* )
            // MySQLParser.g:150:6: columnNameAfterWhere ( COMMA columnNameAfterWhere )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_columnNameAfterWhere_in_columnNamesAfterWhere446);
            columnNameAfterWhere30=columnNameAfterWhere();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, columnNameAfterWhere30.getTree());
            // MySQLParser.g:150:27: ( COMMA columnNameAfterWhere )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // MySQLParser.g:150:28: COMMA columnNameAfterWhere
            	    {
            	    COMMA31=(Token)match(input,COMMA,FOLLOW_COMMA_in_columnNamesAfterWhere449); if (state.failed) return retval;
            	    pushFollow(FOLLOW_columnNameAfterWhere_in_columnNamesAfterWhere452);
            	    columnNameAfterWhere32=columnNameAfterWhere();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, columnNameAfterWhere32.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnNamesAfterWhere"

    public static class selectClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selectClause"
    // MySQLParser.g:152:1: selectClause : 'SELECT' select_list -> ^( SELECT select_list ) ;
    public final MySQLParserParser.selectClause_return selectClause() throws RecognitionException {
        MySQLParserParser.selectClause_return retval = new MySQLParserParser.selectClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal33=null;
        MySQLParserParser.select_list_return select_list34 = null;


        CommonTree string_literal33_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_select_list=new RewriteRuleSubtreeStream(adaptor,"rule select_list");
        try {
            // MySQLParser.g:153:5: ( 'SELECT' select_list -> ^( SELECT select_list ) )
            // MySQLParser.g:153:6: 'SELECT' select_list
            {
            string_literal33=(Token)match(input,90,FOLLOW_90_in_selectClause470); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_90.add(string_literal33);

            pushFollow(FOLLOW_select_list_in_selectClause473);
            select_list34=select_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_select_list.add(select_list34.getTree());


            // AST REWRITE
            // elements: select_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 153:27: -> ^( SELECT select_list )
            {
                // MySQLParser.g:153:29: ^( SELECT select_list )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SELECT, "SELECT"), root_1);

                adaptor.addChild(root_1, stream_select_list.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "selectClause"

    public static class whereClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whereClause"
    // MySQLParser.g:155:1: whereClause : 'WHERE' sqlCondition -> ^( WHERE sqlCondition ) ;
    public final MySQLParserParser.whereClause_return whereClause() throws RecognitionException {
        MySQLParserParser.whereClause_return retval = new MySQLParserParser.whereClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal35=null;
        MySQLParserParser.sqlCondition_return sqlCondition36 = null;


        CommonTree string_literal35_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_sqlCondition=new RewriteRuleSubtreeStream(adaptor,"rule sqlCondition");
        try {
            // MySQLParser.g:156:2: ( 'WHERE' sqlCondition -> ^( WHERE sqlCondition ) )
            // MySQLParser.g:156:3: 'WHERE' sqlCondition
            {
            string_literal35=(Token)match(input,91,FOLLOW_91_in_whereClause493); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_91.add(string_literal35);

            pushFollow(FOLLOW_sqlCondition_in_whereClause495);
            sqlCondition36=sqlCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlCondition.add(sqlCondition36.getTree());


            // AST REWRITE
            // elements: sqlCondition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 156:23: -> ^( WHERE sqlCondition )
            {
                // MySQLParser.g:156:25: ^( WHERE sqlCondition )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHERE, "WHERE"), root_1);

                adaptor.addChild(root_1, stream_sqlCondition.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whereClause"

    public static class sqlCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlCondition"
    // MySQLParser.g:159:1: sqlCondition : ( 'NOT' condition_or -> ^( CONDITION_OR_NOT condition_or ) | condition_or -> ^( CONDITION_OR condition_or ) );
    public final MySQLParserParser.sqlCondition_return sqlCondition() throws RecognitionException {
        MySQLParserParser.sqlCondition_return retval = new MySQLParserParser.sqlCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal37=null;
        MySQLParserParser.condition_or_return condition_or38 = null;

        MySQLParserParser.condition_or_return condition_or39 = null;


        CommonTree string_literal37_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleSubtreeStream stream_condition_or=new RewriteRuleSubtreeStream(adaptor,"rule condition_or");
        try {
            // MySQLParser.g:160:2: ( 'NOT' condition_or -> ^( CONDITION_OR_NOT condition_or ) | condition_or -> ^( CONDITION_OR condition_or ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==92) ) {
                alt5=1;
            }
            else if ( (LA5_0==LPAREN||(LA5_0>=PLUS && LA5_0<=ASTERISK)||LA5_0==ID||(LA5_0>=N && LA5_0<=NUMBER)||LA5_0==QUOTED_STRING||LA5_0==99||LA5_0==102||(LA5_0>=104 && LA5_0<=106)) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // MySQLParser.g:160:3: 'NOT' condition_or
                    {
                    string_literal37=(Token)match(input,92,FOLLOW_92_in_sqlCondition511); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(string_literal37);

                    pushFollow(FOLLOW_condition_or_in_sqlCondition513);
                    condition_or38=condition_or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condition_or.add(condition_or38.getTree());


                    // AST REWRITE
                    // elements: condition_or
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 160:21: -> ^( CONDITION_OR_NOT condition_or )
                    {
                        // MySQLParser.g:160:23: ^( CONDITION_OR_NOT condition_or )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION_OR_NOT, "CONDITION_OR_NOT"), root_1);

                        adaptor.addChild(root_1, stream_condition_or.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // MySQLParser.g:161:3: condition_or
                    {
                    pushFollow(FOLLOW_condition_or_in_sqlCondition524);
                    condition_or39=condition_or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condition_or.add(condition_or39.getTree());


                    // AST REWRITE
                    // elements: condition_or
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 161:16: -> ^( CONDITION_OR condition_or )
                    {
                        // MySQLParser.g:161:18: ^( CONDITION_OR condition_or )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION_OR, "CONDITION_OR"), root_1);

                        adaptor.addChild(root_1, stream_condition_or.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sqlCondition"

    public static class condition_or_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition_or"
    // MySQLParser.g:165:1: condition_or : condition_and ( 'OR' condition_and )* ;
    public final MySQLParserParser.condition_or_return condition_or() throws RecognitionException {
        MySQLParserParser.condition_or_return retval = new MySQLParserParser.condition_or_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal41=null;
        MySQLParserParser.condition_and_return condition_and40 = null;

        MySQLParserParser.condition_and_return condition_and42 = null;


        CommonTree string_literal41_tree=null;

        try {
            // MySQLParser.g:166:2: ( condition_and ( 'OR' condition_and )* )
            // MySQLParser.g:166:3: condition_and ( 'OR' condition_and )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_condition_and_in_condition_or542);
            condition_and40=condition_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condition_and40.getTree());
            // MySQLParser.g:166:17: ( 'OR' condition_and )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==93) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // MySQLParser.g:166:19: 'OR' condition_and
            	    {
            	    string_literal41=(Token)match(input,93,FOLLOW_93_in_condition_or546); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal41_tree = (CommonTree)adaptor.create(string_literal41);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal41_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_condition_and_in_condition_or549);
            	    condition_and42=condition_and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, condition_and42.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condition_or"

    public static class condition_and_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition_and"
    // MySQLParser.g:169:1: condition_and : condition_PAREN ( 'AND' condition_PAREN )* ;
    public final MySQLParserParser.condition_and_return condition_and() throws RecognitionException {
        MySQLParserParser.condition_and_return retval = new MySQLParserParser.condition_and_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal44=null;
        MySQLParserParser.condition_PAREN_return condition_PAREN43 = null;

        MySQLParserParser.condition_PAREN_return condition_PAREN45 = null;


        CommonTree string_literal44_tree=null;

        try {
            // MySQLParser.g:170:2: ( condition_PAREN ( 'AND' condition_PAREN )* )
            // MySQLParser.g:170:3: condition_PAREN ( 'AND' condition_PAREN )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_condition_PAREN_in_condition_and562);
            condition_PAREN43=condition_PAREN();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condition_PAREN43.getTree());
            // MySQLParser.g:170:19: ( 'AND' condition_PAREN )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==94) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // MySQLParser.g:170:21: 'AND' condition_PAREN
            	    {
            	    string_literal44=(Token)match(input,94,FOLLOW_94_in_condition_and566); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal44_tree = (CommonTree)adaptor.create(string_literal44);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal44_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_condition_PAREN_in_condition_and569);
            	    condition_PAREN45=condition_PAREN();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, condition_PAREN45.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condition_and"

    public static class condition_PAREN_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition_PAREN"
    // MySQLParser.g:172:1: condition_PAREN : ( ( LPAREN condition_or RPAREN )=> LPAREN condition_or RPAREN -> ^( PRIORITY condition_or ) | condition_expr );
    public final MySQLParserParser.condition_PAREN_return condition_PAREN() throws RecognitionException {
        MySQLParserParser.condition_PAREN_return retval = new MySQLParserParser.condition_PAREN_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN46=null;
        Token RPAREN48=null;
        MySQLParserParser.condition_or_return condition_or47 = null;

        MySQLParserParser.condition_expr_return condition_expr49 = null;


        CommonTree LPAREN46_tree=null;
        CommonTree RPAREN48_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_condition_or=new RewriteRuleSubtreeStream(adaptor,"rule condition_or");
        try {
            // MySQLParser.g:173:2: ( ( LPAREN condition_or RPAREN )=> LPAREN condition_or RPAREN -> ^( PRIORITY condition_or ) | condition_expr )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // MySQLParser.g:173:3: ( LPAREN condition_or RPAREN )=> LPAREN condition_or RPAREN
                    {
                    LPAREN46=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_condition_PAREN589); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN46);

                    pushFollow(FOLLOW_condition_or_in_condition_PAREN591);
                    condition_or47=condition_or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condition_or.add(condition_or47.getTree());
                    RPAREN48=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_condition_PAREN593); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN48);



                    // AST REWRITE
                    // elements: condition_or
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 173:59: -> ^( PRIORITY condition_or )
                    {
                        // MySQLParser.g:173:61: ^( PRIORITY condition_or )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PRIORITY, "PRIORITY"), root_1);

                        adaptor.addChild(root_1, stream_condition_or.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // MySQLParser.g:174:3: condition_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_condition_expr_in_condition_PAREN603);
                    condition_expr49=condition_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, condition_expr49.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condition_PAREN"

    public static class condition_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition_expr"
    // MySQLParser.g:176:1: condition_expr : condition_left ( comparisonCondition | inCondition | isCondition | likeCondition | betweenCondition ) ;
    public final MySQLParserParser.condition_expr_return condition_expr() throws RecognitionException {
        MySQLParserParser.condition_expr_return retval = new MySQLParserParser.condition_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        MySQLParserParser.condition_left_return condition_left50 = null;

        MySQLParserParser.comparisonCondition_return comparisonCondition51 = null;

        MySQLParserParser.inCondition_return inCondition52 = null;

        MySQLParserParser.isCondition_return isCondition53 = null;

        MySQLParserParser.likeCondition_return likeCondition54 = null;

        MySQLParserParser.betweenCondition_return betweenCondition55 = null;



        try {
            // MySQLParser.g:177:2: ( condition_left ( comparisonCondition | inCondition | isCondition | likeCondition | betweenCondition ) )
            // MySQLParser.g:177:4: condition_left ( comparisonCondition | inCondition | isCondition | likeCondition | betweenCondition )
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_condition_left_in_condition_expr613);
            condition_left50=condition_left();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(condition_left50.getTree(), root_0);
            // MySQLParser.g:178:2: ( comparisonCondition | inCondition | isCondition | likeCondition | betweenCondition )
            int alt9=5;
            switch ( input.LA(1) ) {
            case EQ:
            case LTH:
            case GTH:
            case NOT_EQ:
            case LEQ:
            case GEQ:
                {
                alt9=1;
                }
                break;
            case 92:
                {
                switch ( input.LA(2) ) {
                case 101:
                    {
                    alt9=4;
                    }
                    break;
                case 95:
                    {
                    alt9=5;
                    }
                    break;
                case 100:
                    {
                    alt9=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }

                }
                break;
            case 100:
                {
                alt9=2;
                }
                break;
            case 96:
                {
                alt9=3;
                }
                break;
            case 101:
                {
                alt9=4;
                }
                break;
            case 95:
                {
                alt9=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // MySQLParser.g:178:3: comparisonCondition
                    {
                    pushFollow(FOLLOW_comparisonCondition_in_condition_expr618);
                    comparisonCondition51=comparisonCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(comparisonCondition51.getTree(), root_0);

                    }
                    break;
                case 2 :
                    // MySQLParser.g:179:4: inCondition
                    {
                    pushFollow(FOLLOW_inCondition_in_condition_expr624);
                    inCondition52=inCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(inCondition52.getTree(), root_0);

                    }
                    break;
                case 3 :
                    // MySQLParser.g:180:4: isCondition
                    {
                    pushFollow(FOLLOW_isCondition_in_condition_expr630);
                    isCondition53=isCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(isCondition53.getTree(), root_0);

                    }
                    break;
                case 4 :
                    // MySQLParser.g:181:4: likeCondition
                    {
                    pushFollow(FOLLOW_likeCondition_in_condition_expr637);
                    likeCondition54=likeCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(likeCondition54.getTree(), root_0);

                    }
                    break;
                case 5 :
                    // MySQLParser.g:182:4: betweenCondition
                    {
                    pushFollow(FOLLOW_betweenCondition_in_condition_expr643);
                    betweenCondition55=betweenCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(betweenCondition55.getTree(), root_0);

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condition_expr"

    public static class condition_left_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition_left"
    // MySQLParser.g:185:1: condition_left : expr -> ^( CONDITION_LEFT expr ) ;
    public final MySQLParserParser.condition_left_return condition_left() throws RecognitionException {
        MySQLParserParser.condition_left_return retval = new MySQLParserParser.condition_left_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        MySQLParserParser.expr_return expr56 = null;


        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // MySQLParser.g:186:2: ( expr -> ^( CONDITION_LEFT expr ) )
            // MySQLParser.g:186:3: expr
            {
            pushFollow(FOLLOW_expr_in_condition_left657);
            expr56=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr56.getTree());


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 186:7: -> ^( CONDITION_LEFT expr )
            {
                // MySQLParser.g:186:9: ^( CONDITION_LEFT expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION_LEFT, "CONDITION_LEFT"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condition_left"

    public static class betweenCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "betweenCondition"
    // MySQLParser.g:188:1: betweenCondition : ( 'NOT' 'BETWEEN' between_and -> ^( NOT_BETWEEN between_and ) | 'BETWEEN' between_and -> ^( BETWEEN between_and ) );
    public final MySQLParserParser.betweenCondition_return betweenCondition() throws RecognitionException {
        MySQLParserParser.betweenCondition_return retval = new MySQLParserParser.betweenCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal57=null;
        Token string_literal58=null;
        Token string_literal60=null;
        MySQLParserParser.between_and_return between_and59 = null;

        MySQLParserParser.between_and_return between_and61 = null;


        CommonTree string_literal57_tree=null;
        CommonTree string_literal58_tree=null;
        CommonTree string_literal60_tree=null;
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleSubtreeStream stream_between_and=new RewriteRuleSubtreeStream(adaptor,"rule between_and");
        try {
            // MySQLParser.g:189:2: ( 'NOT' 'BETWEEN' between_and -> ^( NOT_BETWEEN between_and ) | 'BETWEEN' between_and -> ^( BETWEEN between_and ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==92) ) {
                alt10=1;
            }
            else if ( (LA10_0==95) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // MySQLParser.g:189:4: 'NOT' 'BETWEEN' between_and
                    {
                    string_literal57=(Token)match(input,92,FOLLOW_92_in_betweenCondition673); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(string_literal57);

                    string_literal58=(Token)match(input,95,FOLLOW_95_in_betweenCondition675); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_95.add(string_literal58);

                    pushFollow(FOLLOW_between_and_in_betweenCondition677);
                    between_and59=between_and();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_between_and.add(between_and59.getTree());


                    // AST REWRITE
                    // elements: between_and
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 189:31: -> ^( NOT_BETWEEN between_and )
                    {
                        // MySQLParser.g:189:33: ^( NOT_BETWEEN between_and )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NOT_BETWEEN, "NOT_BETWEEN"), root_1);

                        adaptor.addChild(root_1, stream_between_and.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // MySQLParser.g:190:4: 'BETWEEN' between_and
                    {
                    string_literal60=(Token)match(input,95,FOLLOW_95_in_betweenCondition688); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_95.add(string_literal60);

                    pushFollow(FOLLOW_between_and_in_betweenCondition690);
                    between_and61=between_and();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_between_and.add(between_and61.getTree());


                    // AST REWRITE
                    // elements: between_and
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 190:25: -> ^( BETWEEN between_and )
                    {
                        // MySQLParser.g:190:27: ^( BETWEEN between_and )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BETWEEN, "BETWEEN"), root_1);

                        adaptor.addChild(root_1, stream_between_and.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "betweenCondition"

    public static class between_and_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "between_and"
    // MySQLParser.g:193:1: between_and : between_and_expression 'AND' between_and_expression ;
    public final MySQLParserParser.between_and_return between_and() throws RecognitionException {
        MySQLParserParser.between_and_return retval = new MySQLParserParser.between_and_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal63=null;
        MySQLParserParser.between_and_expression_return between_and_expression62 = null;

        MySQLParserParser.between_and_expression_return between_and_expression64 = null;


        CommonTree string_literal63_tree=null;

        try {
            // MySQLParser.g:194:2: ( between_and_expression 'AND' between_and_expression )
            // MySQLParser.g:194:3: between_and_expression 'AND' between_and_expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_between_and_expression_in_between_and707);
            between_and_expression62=between_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, between_and_expression62.getTree());
            string_literal63=(Token)match(input,94,FOLLOW_94_in_between_and709); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal63_tree = (CommonTree)adaptor.create(string_literal63);
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal63_tree, root_0);
            }
            pushFollow(FOLLOW_between_and_expression_in_between_and712);
            between_and_expression64=between_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, between_and_expression64.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "between_and"

    public static class between_and_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "between_and_expression"
    // MySQLParser.g:197:1: between_and_expression : expr_bit ;
    public final MySQLParserParser.between_and_expression_return between_and_expression() throws RecognitionException {
        MySQLParserParser.between_and_expression_return retval = new MySQLParserParser.between_and_expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        MySQLParserParser.expr_bit_return expr_bit65 = null;



        try {
            // MySQLParser.g:198:2: ( expr_bit )
            // MySQLParser.g:198:3: expr_bit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_bit_in_between_and_expression724);
            expr_bit65=expr_bit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_bit65.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "between_and_expression"

    public static class isCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "isCondition"
    // MySQLParser.g:201:1: isCondition : ( 'IS' 'NOT' condition_is_valobject -> ^( ISNOT condition_is_valobject ) | 'IS' condition_is_valobject -> ^( IS condition_is_valobject ) );
    public final MySQLParserParser.isCondition_return isCondition() throws RecognitionException {
        MySQLParserParser.isCondition_return retval = new MySQLParserParser.isCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal66=null;
        Token string_literal67=null;
        Token string_literal69=null;
        MySQLParserParser.condition_is_valobject_return condition_is_valobject68 = null;

        MySQLParserParser.condition_is_valobject_return condition_is_valobject70 = null;


        CommonTree string_literal66_tree=null;
        CommonTree string_literal67_tree=null;
        CommonTree string_literal69_tree=null;
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleSubtreeStream stream_condition_is_valobject=new RewriteRuleSubtreeStream(adaptor,"rule condition_is_valobject");
        try {
            // MySQLParser.g:202:2: ( 'IS' 'NOT' condition_is_valobject -> ^( ISNOT condition_is_valobject ) | 'IS' condition_is_valobject -> ^( IS condition_is_valobject ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==96) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==92) ) {
                    alt11=1;
                }
                else if ( ((LA11_1>=97 && LA11_1<=99)) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // MySQLParser.g:202:4: 'IS' 'NOT' condition_is_valobject
                    {
                    string_literal66=(Token)match(input,96,FOLLOW_96_in_isCondition736); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(string_literal66);

                    string_literal67=(Token)match(input,92,FOLLOW_92_in_isCondition738); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(string_literal67);

                    pushFollow(FOLLOW_condition_is_valobject_in_isCondition740);
                    condition_is_valobject68=condition_is_valobject();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condition_is_valobject.add(condition_is_valobject68.getTree());


                    // AST REWRITE
                    // elements: condition_is_valobject
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 202:37: -> ^( ISNOT condition_is_valobject )
                    {
                        // MySQLParser.g:202:39: ^( ISNOT condition_is_valobject )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ISNOT, "ISNOT"), root_1);

                        adaptor.addChild(root_1, stream_condition_is_valobject.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // MySQLParser.g:203:3: 'IS' condition_is_valobject
                    {
                    string_literal69=(Token)match(input,96,FOLLOW_96_in_isCondition750); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(string_literal69);

                    pushFollow(FOLLOW_condition_is_valobject_in_isCondition752);
                    condition_is_valobject70=condition_is_valobject();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condition_is_valobject.add(condition_is_valobject70.getTree());


                    // AST REWRITE
                    // elements: condition_is_valobject
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 203:30: -> ^( IS condition_is_valobject )
                    {
                        // MySQLParser.g:203:32: ^( IS condition_is_valobject )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IS, "IS"), root_1);

                        adaptor.addChild(root_1, stream_condition_is_valobject.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "isCondition"

    public static class condition_is_valobject_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition_is_valobject"
    // MySQLParser.g:207:1: condition_is_valobject : ( 'NAN' -> NAN | 'INFINITE' -> INFINITE | 'NULL' -> NULL );
    public final MySQLParserParser.condition_is_valobject_return condition_is_valobject() throws RecognitionException {
        MySQLParserParser.condition_is_valobject_return retval = new MySQLParserParser.condition_is_valobject_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal71=null;
        Token string_literal72=null;
        Token string_literal73=null;

        CommonTree string_literal71_tree=null;
        CommonTree string_literal72_tree=null;
        CommonTree string_literal73_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");

        try {
            // MySQLParser.g:208:2: ( 'NAN' -> NAN | 'INFINITE' -> INFINITE | 'NULL' -> NULL )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt12=1;
                }
                break;
            case 98:
                {
                alt12=2;
                }
                break;
            case 99:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // MySQLParser.g:208:4: 'NAN'
                    {
                    string_literal71=(Token)match(input,97,FOLLOW_97_in_condition_is_valobject770); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_97.add(string_literal71);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 208:10: -> NAN
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NAN, "NAN"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // MySQLParser.g:209:4: 'INFINITE'
                    {
                    string_literal72=(Token)match(input,98,FOLLOW_98_in_condition_is_valobject778); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_98.add(string_literal72);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 209:15: -> INFINITE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(INFINITE, "INFINITE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // MySQLParser.g:210:4: 'NULL'
                    {
                    string_literal73=(Token)match(input,99,FOLLOW_99_in_condition_is_valobject786); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_99.add(string_literal73);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 210:11: -> NULL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NULL, "NULL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condition_is_valobject"

    public static class inCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inCondition"
    // MySQLParser.g:213:1: inCondition : (not= 'NOT' )? 'IN' ( subquery | ( LPAREN inCondition_expr_bits RPAREN ) ) -> ^( IN ( $not)? ( subquery )? ( inCondition_expr_bits )? ) ;
    public final MySQLParserParser.inCondition_return inCondition() throws RecognitionException {
        MySQLParserParser.inCondition_return retval = new MySQLParserParser.inCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token not=null;
        Token string_literal74=null;
        Token LPAREN76=null;
        Token RPAREN78=null;
        MySQLParserParser.subquery_return subquery75 = null;

        MySQLParserParser.inCondition_expr_bits_return inCondition_expr_bits77 = null;


        CommonTree not_tree=null;
        CommonTree string_literal74_tree=null;
        CommonTree LPAREN76_tree=null;
        CommonTree RPAREN78_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_inCondition_expr_bits=new RewriteRuleSubtreeStream(adaptor,"rule inCondition_expr_bits");
        RewriteRuleSubtreeStream stream_subquery=new RewriteRuleSubtreeStream(adaptor,"rule subquery");
        try {
            // MySQLParser.g:214:2: ( (not= 'NOT' )? 'IN' ( subquery | ( LPAREN inCondition_expr_bits RPAREN ) ) -> ^( IN ( $not)? ( subquery )? ( inCondition_expr_bits )? ) )
            // MySQLParser.g:214:3: (not= 'NOT' )? 'IN' ( subquery | ( LPAREN inCondition_expr_bits RPAREN ) )
            {
            // MySQLParser.g:214:3: (not= 'NOT' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==92) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // MySQLParser.g:214:4: not= 'NOT'
                    {
                    not=(Token)match(input,92,FOLLOW_92_in_inCondition802); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(not);


                    }
                    break;

            }

            string_literal74=(Token)match(input,100,FOLLOW_100_in_inCondition806); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_100.add(string_literal74);

            // MySQLParser.g:214:21: ( subquery | ( LPAREN inCondition_expr_bits RPAREN ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LPAREN) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==LPAREN||(LA14_1>=PLUS && LA14_1<=ASTERISK)||LA14_1==ID||(LA14_1>=N && LA14_1<=NUMBER)||LA14_1==QUOTED_STRING||LA14_1==99||LA14_1==102||(LA14_1>=104 && LA14_1<=106)) ) {
                    alt14=2;
                }
                else if ( (LA14_1==90) ) {
                    alt14=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // MySQLParser.g:214:22: subquery
                    {
                    pushFollow(FOLLOW_subquery_in_inCondition809);
                    subquery75=subquery();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_subquery.add(subquery75.getTree());

                    }
                    break;
                case 2 :
                    // MySQLParser.g:215:3: ( LPAREN inCondition_expr_bits RPAREN )
                    {
                    // MySQLParser.g:215:3: ( LPAREN inCondition_expr_bits RPAREN )
                    // MySQLParser.g:215:5: LPAREN inCondition_expr_bits RPAREN
                    {
                    LPAREN76=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_inCondition815); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN76);

                    pushFollow(FOLLOW_inCondition_expr_bits_in_inCondition817);
                    inCondition_expr_bits77=inCondition_expr_bits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inCondition_expr_bits.add(inCondition_expr_bits77.getTree());
                    RPAREN78=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_inCondition819); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN78);


                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: not, subquery, inCondition_expr_bits
            // token labels: not
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_not=new RewriteRuleTokenStream(adaptor,"token not",not);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 215:42: -> ^( IN ( $not)? ( subquery )? ( inCondition_expr_bits )? )
            {
                // MySQLParser.g:215:44: ^( IN ( $not)? ( subquery )? ( inCondition_expr_bits )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IN, "IN"), root_1);

                // MySQLParser.g:215:49: ( $not)?
                if ( stream_not.hasNext() ) {
                    adaptor.addChild(root_1, stream_not.nextNode());

                }
                stream_not.reset();
                // MySQLParser.g:215:55: ( subquery )?
                if ( stream_subquery.hasNext() ) {
                    adaptor.addChild(root_1, stream_subquery.nextTree());

                }
                stream_subquery.reset();
                // MySQLParser.g:215:65: ( inCondition_expr_bits )?
                if ( stream_inCondition_expr_bits.hasNext() ) {
                    adaptor.addChild(root_1, stream_inCondition_expr_bits.nextTree());

                }
                stream_inCondition_expr_bits.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "inCondition"

    public static class likeCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "likeCondition"
    // MySQLParser.g:219:1: likeCondition : ( 'NOT' 'LIKE' value -> ^( NOT_LIKE value ) | 'LIKE' value -> ^( LIKE value ) );
    public final MySQLParserParser.likeCondition_return likeCondition() throws RecognitionException {
        MySQLParserParser.likeCondition_return retval = new MySQLParserParser.likeCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal79=null;
        Token string_literal80=null;
        Token string_literal82=null;
        MySQLParserParser.value_return value81 = null;

        MySQLParserParser.value_return value83 = null;


        CommonTree string_literal79_tree=null;
        CommonTree string_literal80_tree=null;
        CommonTree string_literal82_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // MySQLParser.g:220:2: ( 'NOT' 'LIKE' value -> ^( NOT_LIKE value ) | 'LIKE' value -> ^( LIKE value ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==92) ) {
                alt15=1;
            }
            else if ( (LA15_0==101) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // MySQLParser.g:220:3: 'NOT' 'LIKE' value
                    {
                    string_literal79=(Token)match(input,92,FOLLOW_92_in_likeCondition846); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(string_literal79);

                    string_literal80=(Token)match(input,101,FOLLOW_101_in_likeCondition847); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_101.add(string_literal80);

                    pushFollow(FOLLOW_value_in_likeCondition850);
                    value81=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value81.getTree());


                    // AST REWRITE
                    // elements: value
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 220:21: -> ^( NOT_LIKE value )
                    {
                        // MySQLParser.g:220:23: ^( NOT_LIKE value )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NOT_LIKE, "NOT_LIKE"), root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // MySQLParser.g:221:3: 'LIKE' value
                    {
                    string_literal82=(Token)match(input,101,FOLLOW_101_in_likeCondition860); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_101.add(string_literal82);

                    pushFollow(FOLLOW_value_in_likeCondition862);
                    value83=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value83.getTree());


                    // AST REWRITE
                    // elements: value
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 221:15: -> ^( LIKE value )
                    {
                        // MySQLParser.g:221:17: ^( LIKE value )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIKE, "LIKE"), root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "likeCondition"

    public static class inCondition_expr_bits_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inCondition_expr_bits"
    // MySQLParser.g:224:1: inCondition_expr_bits : expr_bit ( COMMA expr_bit )* -> ^( IN_LISTS ( expr_bit )+ ) ;
    public final MySQLParserParser.inCondition_expr_bits_return inCondition_expr_bits() throws RecognitionException {
        MySQLParserParser.inCondition_expr_bits_return retval = new MySQLParserParser.inCondition_expr_bits_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA85=null;
        MySQLParserParser.expr_bit_return expr_bit84 = null;

        MySQLParserParser.expr_bit_return expr_bit86 = null;


        CommonTree COMMA85_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr_bit=new RewriteRuleSubtreeStream(adaptor,"rule expr_bit");
        try {
            // MySQLParser.g:224:22: ( expr_bit ( COMMA expr_bit )* -> ^( IN_LISTS ( expr_bit )+ ) )
            // MySQLParser.g:225:2: expr_bit ( COMMA expr_bit )*
            {
            pushFollow(FOLLOW_expr_bit_in_inCondition_expr_bits878);
            expr_bit84=expr_bit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr_bit.add(expr_bit84.getTree());
            // MySQLParser.g:225:10: ( COMMA expr_bit )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // MySQLParser.g:225:11: COMMA expr_bit
            	    {
            	    COMMA85=(Token)match(input,COMMA,FOLLOW_COMMA_in_inCondition_expr_bits880); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA85);

            	    pushFollow(FOLLOW_expr_bit_in_inCondition_expr_bits882);
            	    expr_bit86=expr_bit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr_bit.add(expr_bit86.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);



            // AST REWRITE
            // elements: expr_bit
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 225:27: -> ^( IN_LISTS ( expr_bit )+ )
            {
                // MySQLParser.g:225:29: ^( IN_LISTS ( expr_bit )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IN_LISTS, "IN_LISTS"), root_1);

                if ( !(stream_expr_bit.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr_bit.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr_bit.nextTree());

                }
                stream_expr_bit.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "inCondition_expr_bits"

    public static class identifiers_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifiers"
    // MySQLParser.g:228:1: identifiers : columnNameAfterWhere ( COMMA identifier )* ;
    public final MySQLParserParser.identifiers_return identifiers() throws RecognitionException {
        MySQLParserParser.identifiers_return retval = new MySQLParserParser.identifiers_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA88=null;
        MySQLParserParser.columnNameAfterWhere_return columnNameAfterWhere87 = null;

        MySQLParserParser.identifier_return identifier89 = null;


        CommonTree COMMA88_tree=null;

        try {
            // MySQLParser.g:229:2: ( columnNameAfterWhere ( COMMA identifier )* )
            // MySQLParser.g:229:3: columnNameAfterWhere ( COMMA identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_columnNameAfterWhere_in_identifiers902);
            columnNameAfterWhere87=columnNameAfterWhere();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, columnNameAfterWhere87.getTree());
            // MySQLParser.g:229:24: ( COMMA identifier )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // MySQLParser.g:229:25: COMMA identifier
            	    {
            	    COMMA88=(Token)match(input,COMMA,FOLLOW_COMMA_in_identifiers905); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA88_tree = (CommonTree)adaptor.create(COMMA88);
            	    adaptor.addChild(root_0, COMMA88_tree);
            	    }
            	    pushFollow(FOLLOW_identifier_in_identifiers907);
            	    identifier89=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier89.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "identifiers"

    public static class comparisonCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comparisonCondition"
    // MySQLParser.g:232:1: comparisonCondition : relational_op expr -> ^( relational_op expr ) ;
    public final MySQLParserParser.comparisonCondition_return comparisonCondition() throws RecognitionException {
        MySQLParserParser.comparisonCondition_return retval = new MySQLParserParser.comparisonCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        MySQLParserParser.relational_op_return relational_op90 = null;

        MySQLParserParser.expr_return expr91 = null;


        RewriteRuleSubtreeStream stream_relational_op=new RewriteRuleSubtreeStream(adaptor,"rule relational_op");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // MySQLParser.g:233:2: ( relational_op expr -> ^( relational_op expr ) )
            // MySQLParser.g:233:3: relational_op expr
            {
            pushFollow(FOLLOW_relational_op_in_comparisonCondition919);
            relational_op90=relational_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_relational_op.add(relational_op90.getTree());
            pushFollow(FOLLOW_expr_in_comparisonCondition921);
            expr91=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr91.getTree());


            // AST REWRITE
            // elements: expr, relational_op
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 233:21: -> ^( relational_op expr )
            {
                // MySQLParser.g:233:23: ^( relational_op expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_relational_op.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comparisonCondition"

    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // MySQLParser.g:236:1: expr : ( expr_bit | subquery ) ;
    public final MySQLParserParser.expr_return expr() throws RecognitionException {
        MySQLParserParser.expr_return retval = new MySQLParserParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        MySQLParserParser.expr_bit_return expr_bit92 = null;

        MySQLParserParser.subquery_return subquery93 = null;



        try {
            // MySQLParser.g:236:6: ( ( expr_bit | subquery ) )
            // MySQLParser.g:236:7: ( expr_bit | subquery )
            {
            root_0 = (CommonTree)adaptor.nil();

            // MySQLParser.g:236:7: ( expr_bit | subquery )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=PLUS && LA18_0<=ASTERISK)||LA18_0==ID||(LA18_0>=N && LA18_0<=NUMBER)||LA18_0==QUOTED_STRING||LA18_0==99||LA18_0==102||(LA18_0>=104 && LA18_0<=106)) ) {
                alt18=1;
            }
            else if ( (LA18_0==LPAREN) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==LPAREN||(LA18_2>=PLUS && LA18_2<=ASTERISK)||LA18_2==ID||(LA18_2>=N && LA18_2<=NUMBER)||LA18_2==QUOTED_STRING||LA18_2==99||LA18_2==102||(LA18_2>=104 && LA18_2<=106)) ) {
                    alt18=1;
                }
                else if ( (LA18_2==90) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // MySQLParser.g:236:8: expr_bit
                    {
                    pushFollow(FOLLOW_expr_bit_in_expr938);
                    expr_bit92=expr_bit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_bit92.getTree());

                    }
                    break;
                case 2 :
                    // MySQLParser.g:237:4: subquery
                    {
                    pushFollow(FOLLOW_subquery_in_expr943);
                    subquery93=subquery();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery93.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class subquery_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subquery"
    // MySQLParser.g:241:1: subquery : LPAREN select_command RPAREN -> ^( SUBQUERY select_command ) ;
    public final MySQLParserParser.subquery_return subquery() throws RecognitionException {
        MySQLParserParser.subquery_return retval = new MySQLParserParser.subquery_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN94=null;
        Token RPAREN96=null;
        MySQLParserParser.select_command_return select_command95 = null;


        CommonTree LPAREN94_tree=null;
        CommonTree RPAREN96_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_select_command=new RewriteRuleSubtreeStream(adaptor,"rule select_command");
        try {
            // MySQLParser.g:241:9: ( LPAREN select_command RPAREN -> ^( SUBQUERY select_command ) )
            // MySQLParser.g:242:2: LPAREN select_command RPAREN
            {
            LPAREN94=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_subquery959); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN94);

            pushFollow(FOLLOW_select_command_in_subquery961);
            select_command95=select_command();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_select_command.add(select_command95.getTree());
            RPAREN96=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_subquery963); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN96);



            // AST REWRITE
            // elements: select_command
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 242:30: -> ^( SUBQUERY select_command )
            {
                // MySQLParser.g:242:32: ^( SUBQUERY select_command )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SUBQUERY, "SUBQUERY"), root_1);

                adaptor.addChild(root_1, stream_select_command.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "subquery"

    public static class expr_bit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_bit"
    // MySQLParser.g:245:1: expr_bit : expr_add ( ( BITOR | BITAND | BITXOR | SHIFTLEFT | SHIFTRIGHT ) ( expr_add ) )* ;
    public final MySQLParserParser.expr_bit_return expr_bit() throws RecognitionException {
        MySQLParserParser.expr_bit_return retval = new MySQLParserParser.expr_bit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BITOR98=null;
        Token BITAND99=null;
        Token BITXOR100=null;
        Token SHIFTLEFT101=null;
        Token SHIFTRIGHT102=null;
        MySQLParserParser.expr_add_return expr_add97 = null;

        MySQLParserParser.expr_add_return expr_add103 = null;


        CommonTree BITOR98_tree=null;
        CommonTree BITAND99_tree=null;
        CommonTree BITXOR100_tree=null;
        CommonTree SHIFTLEFT101_tree=null;
        CommonTree SHIFTRIGHT102_tree=null;

        try {
            // MySQLParser.g:246:2: ( expr_add ( ( BITOR | BITAND | BITXOR | SHIFTLEFT | SHIFTRIGHT ) ( expr_add ) )* )
            // MySQLParser.g:246:3: expr_add ( ( BITOR | BITAND | BITXOR | SHIFTLEFT | SHIFTRIGHT ) ( expr_add ) )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_add_in_expr_bit981);
            expr_add97=expr_add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_add97.getTree());
            // MySQLParser.g:246:12: ( ( BITOR | BITAND | BITXOR | SHIFTLEFT | SHIFTRIGHT ) ( expr_add ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=BITOR && LA20_0<=SHIFTRIGHT)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // MySQLParser.g:246:14: ( BITOR | BITAND | BITXOR | SHIFTLEFT | SHIFTRIGHT ) ( expr_add )
            	    {
            	    // MySQLParser.g:246:14: ( BITOR | BITAND | BITXOR | SHIFTLEFT | SHIFTRIGHT )
            	    int alt19=5;
            	    switch ( input.LA(1) ) {
            	    case BITOR:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case BITAND:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case BITXOR:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    case SHIFTLEFT:
            	        {
            	        alt19=4;
            	        }
            	        break;
            	    case SHIFTRIGHT:
            	        {
            	        alt19=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // MySQLParser.g:246:16: BITOR
            	            {
            	            BITOR98=(Token)match(input,BITOR,FOLLOW_BITOR_in_expr_bit987); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BITOR98_tree = (CommonTree)adaptor.create(BITOR98);
            	            root_0 = (CommonTree)adaptor.becomeRoot(BITOR98_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // MySQLParser.g:246:25: BITAND
            	            {
            	            BITAND99=(Token)match(input,BITAND,FOLLOW_BITAND_in_expr_bit992); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BITAND99_tree = (CommonTree)adaptor.create(BITAND99);
            	            root_0 = (CommonTree)adaptor.becomeRoot(BITAND99_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // MySQLParser.g:246:33: BITXOR
            	            {
            	            BITXOR100=(Token)match(input,BITXOR,FOLLOW_BITXOR_in_expr_bit995); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BITXOR100_tree = (CommonTree)adaptor.create(BITXOR100);
            	            root_0 = (CommonTree)adaptor.becomeRoot(BITXOR100_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // MySQLParser.g:246:41: SHIFTLEFT
            	            {
            	            SHIFTLEFT101=(Token)match(input,SHIFTLEFT,FOLLOW_SHIFTLEFT_in_expr_bit998); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SHIFTLEFT101_tree = (CommonTree)adaptor.create(SHIFTLEFT101);
            	            root_0 = (CommonTree)adaptor.becomeRoot(SHIFTLEFT101_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // MySQLParser.g:246:52: SHIFTRIGHT
            	            {
            	            SHIFTRIGHT102=(Token)match(input,SHIFTRIGHT,FOLLOW_SHIFTRIGHT_in_expr_bit1001); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SHIFTRIGHT102_tree = (CommonTree)adaptor.create(SHIFTRIGHT102);
            	            root_0 = (CommonTree)adaptor.becomeRoot(SHIFTRIGHT102_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // MySQLParser.g:246:65: ( expr_add )
            	    // MySQLParser.g:246:66: expr_add
            	    {
            	    pushFollow(FOLLOW_expr_add_in_expr_bit1006);
            	    expr_add103=expr_add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_add103.getTree());

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_bit"

    public static class expr_add_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_add"
    // MySQLParser.g:248:1: expr_add : expr_mul ( ( PLUS | MINUS ) ( expr_mul ) )* ;
    public final MySQLParserParser.expr_add_return expr_add() throws RecognitionException {
        MySQLParserParser.expr_add_return retval = new MySQLParserParser.expr_add_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS105=null;
        Token MINUS106=null;
        MySQLParserParser.expr_mul_return expr_mul104 = null;

        MySQLParserParser.expr_mul_return expr_mul107 = null;


        CommonTree PLUS105_tree=null;
        CommonTree MINUS106_tree=null;

        try {
            // MySQLParser.g:249:2: ( expr_mul ( ( PLUS | MINUS ) ( expr_mul ) )* )
            // MySQLParser.g:249:3: expr_mul ( ( PLUS | MINUS ) ( expr_mul ) )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_mul_in_expr_add1019);
            expr_mul104=expr_mul();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_mul104.getTree());
            // MySQLParser.g:249:12: ( ( PLUS | MINUS ) ( expr_mul ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=PLUS && LA22_0<=MINUS)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // MySQLParser.g:249:14: ( PLUS | MINUS ) ( expr_mul )
            	    {
            	    // MySQLParser.g:249:14: ( PLUS | MINUS )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==PLUS) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==MINUS) ) {
            	        alt21=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // MySQLParser.g:249:16: PLUS
            	            {
            	            PLUS105=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_add1025); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS105_tree = (CommonTree)adaptor.create(PLUS105);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS105_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // MySQLParser.g:249:24: MINUS
            	            {
            	            MINUS106=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_add1030); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS106_tree = (CommonTree)adaptor.create(MINUS106);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS106_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // MySQLParser.g:249:33: ( expr_mul )
            	    // MySQLParser.g:249:34: expr_mul
            	    {
            	    pushFollow(FOLLOW_expr_mul_in_expr_add1036);
            	    expr_mul107=expr_mul();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_mul107.getTree());

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_add"

    public static class expr_mul_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_mul"
    // MySQLParser.g:251:1: expr_mul : expr_sign ( ( ASTERISK | DIVIDE ) expr_sign )* ;
    public final MySQLParserParser.expr_mul_return expr_mul() throws RecognitionException {
        MySQLParserParser.expr_mul_return retval = new MySQLParserParser.expr_mul_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASTERISK109=null;
        Token DIVIDE110=null;
        MySQLParserParser.expr_sign_return expr_sign108 = null;

        MySQLParserParser.expr_sign_return expr_sign111 = null;


        CommonTree ASTERISK109_tree=null;
        CommonTree DIVIDE110_tree=null;

        try {
            // MySQLParser.g:252:2: ( expr_sign ( ( ASTERISK | DIVIDE ) expr_sign )* )
            // MySQLParser.g:252:4: expr_sign ( ( ASTERISK | DIVIDE ) expr_sign )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_sign_in_expr_mul1050);
            expr_sign108=expr_sign();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_sign108.getTree());
            // MySQLParser.g:252:14: ( ( ASTERISK | DIVIDE ) expr_sign )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=ASTERISK && LA24_0<=DIVIDE)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // MySQLParser.g:252:16: ( ASTERISK | DIVIDE ) expr_sign
            	    {
            	    // MySQLParser.g:252:16: ( ASTERISK | DIVIDE )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==ASTERISK) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==DIVIDE) ) {
            	        alt23=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // MySQLParser.g:252:18: ASTERISK
            	            {
            	            ASTERISK109=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_expr_mul1056); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            ASTERISK109_tree = (CommonTree)adaptor.create(ASTERISK109);
            	            root_0 = (CommonTree)adaptor.becomeRoot(ASTERISK109_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // MySQLParser.g:252:30: DIVIDE
            	            {
            	            DIVIDE110=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_expr_mul1061); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DIVIDE110_tree = (CommonTree)adaptor.create(DIVIDE110);
            	            root_0 = (CommonTree)adaptor.becomeRoot(DIVIDE110_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_expr_sign_in_expr_mul1066);
            	    expr_sign111=expr_sign();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_sign111.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_mul"

    public static class expr_sign_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_sign"
    // MySQLParser.g:254:1: expr_sign : ( PLUS expr_pow -> ^( POSITIVE expr_pow ) | MINUS expr_pow -> ^( NEGATIVE expr_pow ) | expr_pow );
    public final MySQLParserParser.expr_sign_return expr_sign() throws RecognitionException {
        MySQLParserParser.expr_sign_return retval = new MySQLParserParser.expr_sign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS112=null;
        Token MINUS114=null;
        MySQLParserParser.expr_pow_return expr_pow113 = null;

        MySQLParserParser.expr_pow_return expr_pow115 = null;

        MySQLParserParser.expr_pow_return expr_pow116 = null;


        CommonTree PLUS112_tree=null;
        CommonTree MINUS114_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_expr_pow=new RewriteRuleSubtreeStream(adaptor,"rule expr_pow");
        try {
            // MySQLParser.g:255:2: ( PLUS expr_pow -> ^( POSITIVE expr_pow ) | MINUS expr_pow -> ^( NEGATIVE expr_pow ) | expr_pow )
            int alt25=3;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt25=1;
                }
                break;
            case MINUS:
                {
                alt25=2;
                }
                break;
            case LPAREN:
            case ASTERISK:
            case ID:
            case N:
            case NUMBER:
            case QUOTED_STRING:
            case 99:
            case 102:
            case 104:
            case 105:
            case 106:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // MySQLParser.g:255:4: PLUS expr_pow
                    {
                    PLUS112=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_sign1079); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(PLUS112);

                    pushFollow(FOLLOW_expr_pow_in_expr_sign1081);
                    expr_pow113=expr_pow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr_pow.add(expr_pow113.getTree());


                    // AST REWRITE
                    // elements: expr_pow
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 255:17: -> ^( POSITIVE expr_pow )
                    {
                        // MySQLParser.g:255:19: ^( POSITIVE expr_pow )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POSITIVE, "POSITIVE"), root_1);

                        adaptor.addChild(root_1, stream_expr_pow.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // MySQLParser.g:256:4: MINUS expr_pow
                    {
                    MINUS114=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_sign1092); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS114);

                    pushFollow(FOLLOW_expr_pow_in_expr_sign1094);
                    expr_pow115=expr_pow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr_pow.add(expr_pow115.getTree());


                    // AST REWRITE
                    // elements: expr_pow
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 256:18: -> ^( NEGATIVE expr_pow )
                    {
                        // MySQLParser.g:256:20: ^( NEGATIVE expr_pow )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEGATIVE, "NEGATIVE"), root_1);

                        adaptor.addChild(root_1, stream_expr_pow.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // MySQLParser.g:257:4: expr_pow
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_pow_in_expr_sign1105);
                    expr_pow116=expr_pow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_pow116.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_sign"

    public static class expr_pow_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_pow"
    // MySQLParser.g:259:1: expr_pow : expr_expr ( EXPONENT expr_expr )* ;
    public final MySQLParserParser.expr_pow_return expr_pow() throws RecognitionException {
        MySQLParserParser.expr_pow_return retval = new MySQLParserParser.expr_pow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXPONENT118=null;
        MySQLParserParser.expr_expr_return expr_expr117 = null;

        MySQLParserParser.expr_expr_return expr_expr119 = null;


        CommonTree EXPONENT118_tree=null;

        try {
            // MySQLParser.g:260:2: ( expr_expr ( EXPONENT expr_expr )* )
            // MySQLParser.g:260:4: expr_expr ( EXPONENT expr_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_expr_in_expr_pow1115);
            expr_expr117=expr_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_expr117.getTree());
            // MySQLParser.g:260:14: ( EXPONENT expr_expr )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==EXPONENT) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // MySQLParser.g:260:16: EXPONENT expr_expr
            	    {
            	    EXPONENT118=(Token)match(input,EXPONENT,FOLLOW_EXPONENT_in_expr_pow1119); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    EXPONENT118_tree = (CommonTree)adaptor.create(EXPONENT118);
            	    root_0 = (CommonTree)adaptor.becomeRoot(EXPONENT118_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_expr_expr_in_expr_pow1122);
            	    expr_expr119=expr_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_expr119.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_pow"

    public static class expr_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_expr"
    // MySQLParser.g:263:1: expr_expr : ( value | boolean_literal | 'NULL' | 'ROWNUM' | {...}? ID ( LPAREN ( values_func )? RPAREN ) -> ^( ID ( values_func )? ) | {...}? ID -> ^( CONSIST ID ) );
    public final MySQLParserParser.expr_expr_return expr_expr() throws RecognitionException {
        MySQLParserParser.expr_expr_return retval = new MySQLParserParser.expr_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal122=null;
        Token string_literal123=null;
        Token ID124=null;
        Token LPAREN125=null;
        Token RPAREN127=null;
        Token ID128=null;
        MySQLParserParser.value_return value120 = null;

        MySQLParserParser.boolean_literal_return boolean_literal121 = null;

        MySQLParserParser.values_func_return values_func126 = null;


        CommonTree string_literal122_tree=null;
        CommonTree string_literal123_tree=null;
        CommonTree ID124_tree=null;
        CommonTree LPAREN125_tree=null;
        CommonTree RPAREN127_tree=null;
        CommonTree ID128_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_values_func=new RewriteRuleSubtreeStream(adaptor,"rule values_func");
        try {
            // MySQLParser.g:264:2: ( value | boolean_literal | 'NULL' | 'ROWNUM' | {...}? ID ( LPAREN ( values_func )? RPAREN ) -> ^( ID ( values_func )? ) | {...}? ID -> ^( CONSIST ID ) )
            int alt28=6;
            switch ( input.LA(1) ) {
            case LPAREN:
            case ASTERISK:
            case N:
            case NUMBER:
            case QUOTED_STRING:
            case 104:
                {
                alt28=1;
                }
                break;
            case ID:
                {
                int LA28_2 = input.LA(2);

                if ( (LA28_2==LPAREN) ) {
                    alt28=5;
                }
                else if ( (!(((consistStr.containsKey(input.LT(1).getText().toUpperCase()))))) ) {
                    alt28=1;
                }
                else if ( ((consistStr.containsKey(input.LT(1).getText().toUpperCase()))) ) {
                    alt28=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;
                }
                }
                break;
            case 105:
            case 106:
                {
                alt28=2;
                }
                break;
            case 99:
                {
                alt28=3;
                }
                break;
            case 102:
                {
                alt28=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // MySQLParser.g:264:3: value
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_value_in_expr_expr1135);
                    value120=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value120.getTree());

                    }
                    break;
                case 2 :
                    // MySQLParser.g:265:3: boolean_literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_boolean_literal_in_expr_expr1139);
                    boolean_literal121=boolean_literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_literal121.getTree());

                    }
                    break;
                case 3 :
                    // MySQLParser.g:266:3: 'NULL'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal122=(Token)match(input,99,FOLLOW_99_in_expr_expr1143); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal122_tree = (CommonTree)adaptor.create(string_literal122);
                    adaptor.addChild(root_0, string_literal122_tree);
                    }

                    }
                    break;
                case 4 :
                    // MySQLParser.g:267:3: 'ROWNUM'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal123=(Token)match(input,102,FOLLOW_102_in_expr_expr1147); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal123_tree = (CommonTree)adaptor.create(string_literal123);
                    adaptor.addChild(root_0, string_literal123_tree);
                    }

                    }
                    break;
                case 5 :
                    // MySQLParser.g:270:3: {...}? ID ( LPAREN ( values_func )? RPAREN )
                    {
                    if ( !((functionMap.containsKey(input.LT(1).getText().toUpperCase()))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "expr_expr", "functionMap.containsKey(input.LT(1).getText().toUpperCase())");
                    }
                    ID124=(Token)match(input,ID,FOLLOW_ID_in_expr_expr1155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID124);

                    // MySQLParser.g:270:70: ( LPAREN ( values_func )? RPAREN )
                    // MySQLParser.g:270:71: LPAREN ( values_func )? RPAREN
                    {
                    LPAREN125=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr_expr1158); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN125);

                    // MySQLParser.g:270:78: ( values_func )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==LPAREN||(LA27_0>=PLUS && LA27_0<=ASTERISK)||LA27_0==ID||(LA27_0>=N && LA27_0<=NUMBER)||LA27_0==QUOTED_STRING||LA27_0==99||LA27_0==102||(LA27_0>=104 && LA27_0<=106)) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // MySQLParser.g:270:78: values_func
                            {
                            pushFollow(FOLLOW_values_func_in_expr_expr1160);
                            values_func126=values_func();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_values_func.add(values_func126.getTree());

                            }
                            break;

                    }

                    RPAREN127=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr_expr1163); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN127);


                    }



                    // AST REWRITE
                    // elements: ID, values_func
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 270:98: -> ^( ID ( values_func )? )
                    {
                        // MySQLParser.g:270:100: ^( ID ( values_func )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ID.nextNode(), root_1);

                        // MySQLParser.g:270:105: ( values_func )?
                        if ( stream_values_func.hasNext() ) {
                            adaptor.addChild(root_1, stream_values_func.nextTree());

                        }
                        stream_values_func.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // MySQLParser.g:271:3: {...}? ID
                    {
                    if ( !((consistStr.containsKey(input.LT(1).getText().toUpperCase()))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "expr_expr", "consistStr.containsKey(input.LT(1).getText().toUpperCase())");
                    }
                    ID128=(Token)match(input,ID,FOLLOW_ID_in_expr_expr1177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID128);



                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 271:69: -> ^( CONSIST ID )
                    {
                        // MySQLParser.g:271:71: ^( CONSIST ID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONSIST, "CONSIST"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_expr"

    public static class sql_condition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sql_condition"
    // MySQLParser.g:276:1: sql_condition : condition_or ;
    public final MySQLParserParser.sql_condition_return sql_condition() throws RecognitionException {
        MySQLParserParser.sql_condition_return retval = new MySQLParserParser.sql_condition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        MySQLParserParser.condition_or_return condition_or129 = null;



        try {
            // MySQLParser.g:277:2: ( condition_or )
            // MySQLParser.g:277:4: condition_or
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_condition_or_in_sql_condition1196);
            condition_or129=condition_or();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condition_or129.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sql_condition"

    public static class relational_op_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relational_op"
    // MySQLParser.g:279:1: relational_op : ( EQ | LTH | GTH | NOT_EQ | LEQ | GEQ );
    public final MySQLParserParser.relational_op_return relational_op() throws RecognitionException {
        MySQLParserParser.relational_op_return retval = new MySQLParserParser.relational_op_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set130=null;

        CommonTree set130_tree=null;

        try {
            // MySQLParser.g:280:2: ( EQ | LTH | GTH | NOT_EQ | LEQ | GEQ )
            // MySQLParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set130=(Token)input.LT(1);
            if ( input.LA(1)==EQ||(input.LA(1)>=LTH && input.LA(1)<=GEQ) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set130));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relational_op"

    public static class fromClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fromClause"
    // MySQLParser.g:283:1: fromClause : 'FROM' selected_table ;
    public final MySQLParserParser.fromClause_return fromClause() throws RecognitionException {
        MySQLParserParser.fromClause_return retval = new MySQLParserParser.fromClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal131=null;
        MySQLParserParser.selected_table_return selected_table132 = null;


        CommonTree string_literal131_tree=null;

        try {
            // MySQLParser.g:284:2: ( 'FROM' selected_table )
            // MySQLParser.g:284:3: 'FROM' selected_table
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal131=(Token)match(input,103,FOLLOW_103_in_fromClause1236); if (state.failed) return retval;
            pushFollow(FOLLOW_selected_table_in_fromClause1239);
            selected_table132=selected_table();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, selected_table132.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fromClause"

    public static class select_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select_list"
    // MySQLParser.g:287:1: select_list : displayed_column ( COMMA displayed_column )* -> ^( SELECT_LIST ( displayed_column )+ ) ;
    public final MySQLParserParser.select_list_return select_list() throws RecognitionException {
        MySQLParserParser.select_list_return retval = new MySQLParserParser.select_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA134=null;
        MySQLParserParser.displayed_column_return displayed_column133 = null;

        MySQLParserParser.displayed_column_return displayed_column135 = null;


        CommonTree COMMA134_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_displayed_column=new RewriteRuleSubtreeStream(adaptor,"rule displayed_column");
        try {
            // MySQLParser.g:288:2: ( displayed_column ( COMMA displayed_column )* -> ^( SELECT_LIST ( displayed_column )+ ) )
            // MySQLParser.g:288:4: displayed_column ( COMMA displayed_column )*
            {
            pushFollow(FOLLOW_displayed_column_in_select_list1250);
            displayed_column133=displayed_column();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_displayed_column.add(displayed_column133.getTree());
            // MySQLParser.g:288:21: ( COMMA displayed_column )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==COMMA) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // MySQLParser.g:288:23: COMMA displayed_column
            	    {
            	    COMMA134=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_list1254); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA134);

            	    pushFollow(FOLLOW_displayed_column_in_select_list1256);
            	    displayed_column135=displayed_column();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_displayed_column.add(displayed_column135.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);



            // AST REWRITE
            // elements: displayed_column
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 288:48: -> ^( SELECT_LIST ( displayed_column )+ )
            {
                // MySQLParser.g:288:50: ^( SELECT_LIST ( displayed_column )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SELECT_LIST, "SELECT_LIST"), root_1);

                if ( !(stream_displayed_column.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_displayed_column.hasNext() ) {
                    adaptor.addChild(root_1, stream_displayed_column.nextTree());

                }
                stream_displayed_column.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "select_list"

    public static class displayed_column_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "displayed_column"
    // MySQLParser.g:291:1: displayed_column : ({...}? ID ( ( LPAREN ( values_func )? RPAREN ) ) ( alias )? -> ^( ID ( values_func )? ( alias )? ) | {...}? ID ( alias )? -> ^( CONSIST ID ( alias )? ) | ( table_alias )? column ( alias )? -> ^( COLUMN ( table_alias )? column ( alias )? ) );
    public final MySQLParserParser.displayed_column_return displayed_column() throws RecognitionException {
        MySQLParserParser.displayed_column_return retval = new MySQLParserParser.displayed_column_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID136=null;
        Token LPAREN137=null;
        Token RPAREN139=null;
        Token ID141=null;
        MySQLParserParser.values_func_return values_func138 = null;

        MySQLParserParser.alias_return alias140 = null;

        MySQLParserParser.alias_return alias142 = null;

        MySQLParserParser.table_alias_return table_alias143 = null;

        MySQLParserParser.column_return column144 = null;

        MySQLParserParser.alias_return alias145 = null;


        CommonTree ID136_tree=null;
        CommonTree LPAREN137_tree=null;
        CommonTree RPAREN139_tree=null;
        CommonTree ID141_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_alias=new RewriteRuleSubtreeStream(adaptor,"rule alias");
        RewriteRuleSubtreeStream stream_column=new RewriteRuleSubtreeStream(adaptor,"rule column");
        RewriteRuleSubtreeStream stream_values_func=new RewriteRuleSubtreeStream(adaptor,"rule values_func");
        RewriteRuleSubtreeStream stream_table_alias=new RewriteRuleSubtreeStream(adaptor,"rule table_alias");
        try {
            // MySQLParser.g:292:2: ({...}? ID ( ( LPAREN ( values_func )? RPAREN ) ) ( alias )? -> ^( ID ( values_func )? ( alias )? ) | {...}? ID ( alias )? -> ^( CONSIST ID ( alias )? ) | ( table_alias )? column ( alias )? -> ^( COLUMN ( table_alias )? column ( alias )? ) )
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==ID) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==LPAREN) ) {
                    alt35=1;
                }
                else if ( ((consistStr.containsKey(input.LT(1).getText().toUpperCase()))) ) {
                    alt35=2;
                }
                else if ( (true) ) {
                    alt35=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA35_0==ASTERISK||LA35_0==N) ) {
                alt35=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // MySQLParser.g:293:2: {...}? ID ( ( LPAREN ( values_func )? RPAREN ) ) ( alias )?
                    {
                    if ( !((functionMap.containsKey(input.LT(1).getText().toUpperCase()))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "displayed_column", "functionMap.containsKey(input.LT(1).getText().toUpperCase())");
                    }
                    ID136=(Token)match(input,ID,FOLLOW_ID_in_displayed_column1281); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID136);

                    // MySQLParser.g:293:69: ( ( LPAREN ( values_func )? RPAREN ) )
                    // MySQLParser.g:293:70: ( LPAREN ( values_func )? RPAREN )
                    {
                    // MySQLParser.g:293:70: ( LPAREN ( values_func )? RPAREN )
                    // MySQLParser.g:293:71: LPAREN ( values_func )? RPAREN
                    {
                    LPAREN137=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_displayed_column1285); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN137);

                    // MySQLParser.g:293:78: ( values_func )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==LPAREN||(LA30_0>=PLUS && LA30_0<=ASTERISK)||LA30_0==ID||(LA30_0>=N && LA30_0<=NUMBER)||LA30_0==QUOTED_STRING||LA30_0==99||LA30_0==102||(LA30_0>=104 && LA30_0<=106)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // MySQLParser.g:293:78: values_func
                            {
                            pushFollow(FOLLOW_values_func_in_displayed_column1287);
                            values_func138=values_func();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_values_func.add(values_func138.getTree());

                            }
                            break;

                    }

                    RPAREN139=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_displayed_column1290); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN139);


                    }


                    }

                    // MySQLParser.g:293:100: ( alias )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==ID||LA31_0==107) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // MySQLParser.g:293:100: alias
                            {
                            pushFollow(FOLLOW_alias_in_displayed_column1294);
                            alias140=alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_alias.add(alias140.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: ID, values_func, alias
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 293:106: -> ^( ID ( values_func )? ( alias )? )
                    {
                        // MySQLParser.g:293:108: ^( ID ( values_func )? ( alias )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ID.nextNode(), root_1);

                        // MySQLParser.g:293:113: ( values_func )?
                        if ( stream_values_func.hasNext() ) {
                            adaptor.addChild(root_1, stream_values_func.nextTree());

                        }
                        stream_values_func.reset();
                        // MySQLParser.g:293:126: ( alias )?
                        if ( stream_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_alias.nextTree());

                        }
                        stream_alias.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // MySQLParser.g:294:3: {...}? ID ( alias )?
                    {
                    if ( !((consistStr.containsKey(input.LT(1).getText().toUpperCase()))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "displayed_column", "consistStr.containsKey(input.LT(1).getText().toUpperCase())");
                    }
                    ID141=(Token)match(input,ID,FOLLOW_ID_in_displayed_column1311); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID141);

                    // MySQLParser.g:294:69: ( alias )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==ID||LA32_0==107) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // MySQLParser.g:294:69: alias
                            {
                            pushFollow(FOLLOW_alias_in_displayed_column1313);
                            alias142=alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_alias.add(alias142.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: ID, alias
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 294:76: -> ^( CONSIST ID ( alias )? )
                    {
                        // MySQLParser.g:294:78: ^( CONSIST ID ( alias )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONSIST, "CONSIST"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // MySQLParser.g:294:91: ( alias )?
                        if ( stream_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_alias.nextTree());

                        }
                        stream_alias.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // MySQLParser.g:295:3: ( table_alias )? column ( alias )?
                    {
                    // MySQLParser.g:295:3: ( table_alias )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==ID) ) {
                        int LA33_1 = input.LA(2);

                        if ( (LA33_1==DOT) ) {
                            alt33=1;
                        }
                    }
                    switch (alt33) {
                        case 1 :
                            // MySQLParser.g:295:3: table_alias
                            {
                            pushFollow(FOLLOW_table_alias_in_displayed_column1328);
                            table_alias143=table_alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_table_alias.add(table_alias143.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_column_in_displayed_column1332);
                    column144=column();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_column.add(column144.getTree());
                    // MySQLParser.g:295:24: ( alias )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==ID||LA34_0==107) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // MySQLParser.g:295:25: alias
                            {
                            pushFollow(FOLLOW_alias_in_displayed_column1335);
                            alias145=alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_alias.add(alias145.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: alias, table_alias, column
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 295:32: -> ^( COLUMN ( table_alias )? column ( alias )? )
                    {
                        // MySQLParser.g:295:34: ^( COLUMN ( table_alias )? column ( alias )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COLUMN, "COLUMN"), root_1);

                        // MySQLParser.g:295:43: ( table_alias )?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextTree());

                        }
                        stream_table_alias.reset();
                        adaptor.addChild(root_1, stream_column.nextTree());
                        // MySQLParser.g:295:63: ( alias )?
                        if ( stream_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_alias.nextTree());

                        }
                        stream_alias.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "displayed_column"

    public static class columnNameAfterWhere_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnNameAfterWhere"
    // MySQLParser.g:298:1: columnNameAfterWhere : ( ( table_alias )? identifier -> ^( ASC identifier ( table_alias )? ) | ( table_alias )? identifier ASC -> ^( ASC identifier ( table_alias )? ) | ( table_alias )? identifier DESC -> ^( DESC identifier ( table_alias )? ) );
    public final MySQLParserParser.columnNameAfterWhere_return columnNameAfterWhere() throws RecognitionException {
        MySQLParserParser.columnNameAfterWhere_return retval = new MySQLParserParser.columnNameAfterWhere_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASC150=null;
        Token DESC153=null;
        MySQLParserParser.table_alias_return table_alias146 = null;

        MySQLParserParser.identifier_return identifier147 = null;

        MySQLParserParser.table_alias_return table_alias148 = null;

        MySQLParserParser.identifier_return identifier149 = null;

        MySQLParserParser.table_alias_return table_alias151 = null;

        MySQLParserParser.identifier_return identifier152 = null;


        CommonTree ASC150_tree=null;
        CommonTree DESC153_tree=null;
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleSubtreeStream stream_table_alias=new RewriteRuleSubtreeStream(adaptor,"rule table_alias");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // MySQLParser.g:299:2: ( ( table_alias )? identifier -> ^( ASC identifier ( table_alias )? ) | ( table_alias )? identifier ASC -> ^( ASC identifier ( table_alias )? ) | ( table_alias )? identifier DESC -> ^( DESC identifier ( table_alias )? ) )
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case COMMA:
                case RPAREN:
                case 89:
                case 108:
                case 110:
                case 113:
                case 114:
                case 115:
                    {
                    alt39=1;
                    }
                    break;
                case DOT:
                    {
                    int LA39_3 = input.LA(3);

                    if ( (LA39_3==ID) ) {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case COMMA:
                        case RPAREN:
                        case 89:
                        case 108:
                        case 110:
                        case 113:
                        case 114:
                        case 115:
                            {
                            alt39=1;
                            }
                            break;
                        case ASC:
                            {
                            alt39=2;
                            }
                            break;
                        case DESC:
                            {
                            alt39=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 39, 6, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case ASC:
                    {
                    alt39=2;
                    }
                    break;
                case DESC:
                    {
                    alt39=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // MySQLParser.g:299:3: ( table_alias )? identifier
                    {
                    // MySQLParser.g:299:3: ( table_alias )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==ID) ) {
                        int LA36_1 = input.LA(2);

                        if ( (LA36_1==DOT) ) {
                            alt36=1;
                        }
                    }
                    switch (alt36) {
                        case 1 :
                            // MySQLParser.g:299:3: table_alias
                            {
                            pushFollow(FOLLOW_table_alias_in_columnNameAfterWhere1360);
                            table_alias146=table_alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_table_alias.add(table_alias146.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_identifier_in_columnNameAfterWhere1363);
                    identifier147=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier147.getTree());


                    // AST REWRITE
                    // elements: table_alias, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 299:28: -> ^( ASC identifier ( table_alias )? )
                    {
                        // MySQLParser.g:299:30: ^( ASC identifier ( table_alias )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASC, "ASC"), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        // MySQLParser.g:299:47: ( table_alias )?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextTree());

                        }
                        stream_table_alias.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // MySQLParser.g:300:3: ( table_alias )? identifier ASC
                    {
                    // MySQLParser.g:300:3: ( table_alias )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==ID) ) {
                        int LA37_1 = input.LA(2);

                        if ( (LA37_1==DOT) ) {
                            alt37=1;
                        }
                    }
                    switch (alt37) {
                        case 1 :
                            // MySQLParser.g:300:3: table_alias
                            {
                            pushFollow(FOLLOW_table_alias_in_columnNameAfterWhere1378);
                            table_alias148=table_alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_table_alias.add(table_alias148.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_identifier_in_columnNameAfterWhere1381);
                    identifier149=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier149.getTree());
                    ASC150=(Token)match(input,ASC,FOLLOW_ASC_in_columnNameAfterWhere1384); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASC.add(ASC150);



                    // AST REWRITE
                    // elements: table_alias, identifier, ASC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 300:33: -> ^( ASC identifier ( table_alias )? )
                    {
                        // MySQLParser.g:300:35: ^( ASC identifier ( table_alias )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ASC.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        // MySQLParser.g:300:52: ( table_alias )?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextTree());

                        }
                        stream_table_alias.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // MySQLParser.g:301:3: ( table_alias )? identifier DESC
                    {
                    // MySQLParser.g:301:3: ( table_alias )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==ID) ) {
                        int LA38_1 = input.LA(2);

                        if ( (LA38_1==DOT) ) {
                            alt38=1;
                        }
                    }
                    switch (alt38) {
                        case 1 :
                            // MySQLParser.g:301:3: table_alias
                            {
                            pushFollow(FOLLOW_table_alias_in_columnNameAfterWhere1399);
                            table_alias151=table_alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_table_alias.add(table_alias151.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_identifier_in_columnNameAfterWhere1402);
                    identifier152=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier152.getTree());
                    DESC153=(Token)match(input,DESC,FOLLOW_DESC_in_columnNameAfterWhere1405); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DESC.add(DESC153);



                    // AST REWRITE
                    // elements: table_alias, identifier, DESC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 301:33: -> ^( DESC identifier ( table_alias )? )
                    {
                        // MySQLParser.g:301:35: ^( DESC identifier ( table_alias )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_DESC.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        // MySQLParser.g:301:53: ( table_alias )?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextTree());

                        }
                        stream_table_alias.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnNameAfterWhere"

    public static class columnNameInUpdate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnNameInUpdate"
    // MySQLParser.g:304:1: columnNameInUpdate : ( table_alias )? identifier ;
    public final MySQLParserParser.columnNameInUpdate_return columnNameInUpdate() throws RecognitionException {
        MySQLParserParser.columnNameInUpdate_return retval = new MySQLParserParser.columnNameInUpdate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        MySQLParserParser.table_alias_return table_alias154 = null;

        MySQLParserParser.identifier_return identifier155 = null;



        try {
            // MySQLParser.g:305:2: ( ( table_alias )? identifier )
            // MySQLParser.g:305:3: ( table_alias )? identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            // MySQLParser.g:305:3: ( table_alias )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==ID) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==DOT) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // MySQLParser.g:305:3: table_alias
                    {
                    pushFollow(FOLLOW_table_alias_in_columnNameInUpdate1426);
                    table_alias154=table_alias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, table_alias154.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_identifier_in_columnNameInUpdate1429);
            identifier155=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier155.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnNameInUpdate"

    public static class table_alias_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table_alias"
    // MySQLParser.g:307:1: table_alias : identifier DOT -> ^( COL_TAB identifier ) ;
    public final MySQLParserParser.table_alias_return table_alias() throws RecognitionException {
        MySQLParserParser.table_alias_return retval = new MySQLParserParser.table_alias_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT157=null;
        MySQLParserParser.identifier_return identifier156 = null;


        CommonTree DOT157_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // MySQLParser.g:308:2: ( identifier DOT -> ^( COL_TAB identifier ) )
            // MySQLParser.g:308:3: identifier DOT
            {
            pushFollow(FOLLOW_identifier_in_table_alias1439);
            identifier156=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier156.getTree());
            DOT157=(Token)match(input,DOT,FOLLOW_DOT_in_table_alias1441); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT157);



            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 308:17: -> ^( COL_TAB identifier )
            {
                // MySQLParser.g:308:19: ^( COL_TAB identifier )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COL_TAB, "COL_TAB"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "table_alias"

    public static class column_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column"
    // MySQLParser.g:310:1: column : ( ASTERISK | {...}? N | identifier );
    public final MySQLParserParser.column_return column() throws RecognitionException {
        MySQLParserParser.column_return retval = new MySQLParserParser.column_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASTERISK158=null;
        Token N159=null;
        MySQLParserParser.identifier_return identifier160 = null;


        CommonTree ASTERISK158_tree=null;
        CommonTree N159_tree=null;

        try {
            // MySQLParser.g:311:2: ( ASTERISK | {...}? N | identifier )
            int alt41=3;
            switch ( input.LA(1) ) {
            case ASTERISK:
                {
                alt41=1;
                }
                break;
            case N:
                {
                alt41=2;
                }
                break;
            case ID:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // MySQLParser.g:311:3: ASTERISK
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ASTERISK158=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_column1457); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASTERISK158_tree = (CommonTree)adaptor.create(ASTERISK158);
                    adaptor.addChild(root_0, ASTERISK158_tree);
                    }

                    }
                    break;
                case 2 :
                    // MySQLParser.g:312:3: {...}? N
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    if ( !(("1".equals(input.LT(1).getText()))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "column", "\"1\".equals(input.LT(1).getText())");
                    }
                    N159=(Token)match(input,N,FOLLOW_N_in_column1463); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    N159_tree = (CommonTree)adaptor.create(N159);
                    adaptor.addChild(root_0, N159_tree);
                    }

                    }
                    break;
                case 3 :
                    // MySQLParser.g:313:3: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_column1467);
                    identifier160=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier160.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "column"

    public static class values_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "values"
    // MySQLParser.g:315:1: values : expr ( COMMA expr )* -> ^( INSERT_VAL ( expr )* ) ;
    public final MySQLParserParser.values_return values() throws RecognitionException {
        MySQLParserParser.values_return retval = new MySQLParserParser.values_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA162=null;
        MySQLParserParser.expr_return expr161 = null;

        MySQLParserParser.expr_return expr163 = null;


        CommonTree COMMA162_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // MySQLParser.g:316:2: ( expr ( COMMA expr )* -> ^( INSERT_VAL ( expr )* ) )
            // MySQLParser.g:316:3: expr ( COMMA expr )*
            {
            pushFollow(FOLLOW_expr_in_values1476);
            expr161=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr161.getTree());
            // MySQLParser.g:316:8: ( COMMA expr )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==COMMA) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // MySQLParser.g:316:10: COMMA expr
            	    {
            	    COMMA162=(Token)match(input,COMMA,FOLLOW_COMMA_in_values1480); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA162);

            	    pushFollow(FOLLOW_expr_in_values1482);
            	    expr163=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr163.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);



            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 316:23: -> ^( INSERT_VAL ( expr )* )
            {
                // MySQLParser.g:316:25: ^( INSERT_VAL ( expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INSERT_VAL, "INSERT_VAL"), root_1);

                // MySQLParser.g:316:38: ( expr )*
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "values"

    public static class values_func_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "values_func"
    // MySQLParser.g:318:1: values_func : expr ( COMMA expr )* ;
    public final MySQLParserParser.values_func_return values_func() throws RecognitionException {
        MySQLParserParser.values_func_return retval = new MySQLParserParser.values_func_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA165=null;
        MySQLParserParser.expr_return expr164 = null;

        MySQLParserParser.expr_return expr166 = null;


        CommonTree COMMA165_tree=null;

        try {
            // MySQLParser.g:319:2: ( expr ( COMMA expr )* )
            // MySQLParser.g:319:3: expr ( COMMA expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_in_values_func1501);
            expr164=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr164.getTree());
            // MySQLParser.g:319:8: ( COMMA expr )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // MySQLParser.g:319:10: COMMA expr
            	    {
            	    COMMA165=(Token)match(input,COMMA,FOLLOW_COMMA_in_values_func1505); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expr_in_values_func1508);
            	    expr166=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr166.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "values_func"

    public static class value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // MySQLParser.g:321:1: value : ( N | NUMBER | '?' | LPAREN expr RPAREN | quoted_string -> ^( QUTED_STR quoted_string ) | column_spec );
    public final MySQLParserParser.value_return value() throws RecognitionException {
        MySQLParserParser.value_return retval = new MySQLParserParser.value_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token N167=null;
        Token NUMBER168=null;
        Token char_literal169=null;
        Token LPAREN170=null;
        Token RPAREN172=null;
        MySQLParserParser.expr_return expr171 = null;

        MySQLParserParser.quoted_string_return quoted_string173 = null;

        MySQLParserParser.column_spec_return column_spec174 = null;


        CommonTree N167_tree=null;
        CommonTree NUMBER168_tree=null;
        CommonTree char_literal169_tree=null;
        CommonTree LPAREN170_tree=null;
        CommonTree RPAREN172_tree=null;
        RewriteRuleSubtreeStream stream_quoted_string=new RewriteRuleSubtreeStream(adaptor,"rule quoted_string");
        try {
            // MySQLParser.g:321:7: ( N | NUMBER | '?' | LPAREN expr RPAREN | quoted_string -> ^( QUTED_STR quoted_string ) | column_spec )
            int alt44=6;
            switch ( input.LA(1) ) {
            case N:
                {
                alt44=1;
                }
                break;
            case NUMBER:
                {
                alt44=2;
                }
                break;
            case 104:
                {
                alt44=3;
                }
                break;
            case LPAREN:
                {
                alt44=4;
                }
                break;
            case QUOTED_STRING:
                {
                alt44=5;
                }
                break;
            case ASTERISK:
            case ID:
                {
                alt44=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // MySQLParser.g:322:2: N
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    N167=(Token)match(input,N,FOLLOW_N_in_value1522); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    N167_tree = (CommonTree)adaptor.create(N167);
                    adaptor.addChild(root_0, N167_tree);
                    }

                    }
                    break;
                case 2 :
                    // MySQLParser.g:323:3: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NUMBER168=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_value1526); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER168_tree = (CommonTree)adaptor.create(NUMBER168);
                    adaptor.addChild(root_0, NUMBER168_tree);
                    }

                    }
                    break;
                case 3 :
                    // MySQLParser.g:324:3: '?'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal169=(Token)match(input,104,FOLLOW_104_in_value1530); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal169_tree = (CommonTree)adaptor.create(char_literal169);
                    adaptor.addChild(root_0, char_literal169_tree);
                    }

                    }
                    break;
                case 4 :
                    // MySQLParser.g:325:3: LPAREN expr RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LPAREN170=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value1534); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_value1537);
                    expr171=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr171.getTree());
                    RPAREN172=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value1539); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // MySQLParser.g:326:3: quoted_string
                    {
                    pushFollow(FOLLOW_quoted_string_in_value1544);
                    quoted_string173=quoted_string();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_quoted_string.add(quoted_string173.getTree());


                    // AST REWRITE
                    // elements: quoted_string
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 326:17: -> ^( QUTED_STR quoted_string )
                    {
                        // MySQLParser.g:326:19: ^( QUTED_STR quoted_string )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(QUTED_STR, "QUTED_STR"), root_1);

                        adaptor.addChild(root_1, stream_quoted_string.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // MySQLParser.g:327:3: column_spec
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_column_spec_in_value1555);
                    column_spec174=column_spec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, column_spec174.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "value"

    public static class column_specs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column_specs"
    // MySQLParser.g:331:1: column_specs : column_spec ( COMMA column_spec )* -> ^( COLUMNS ( column_spec )+ ) ;
    public final MySQLParserParser.column_specs_return column_specs() throws RecognitionException {
        MySQLParserParser.column_specs_return retval = new MySQLParserParser.column_specs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA176=null;
        MySQLParserParser.column_spec_return column_spec175 = null;

        MySQLParserParser.column_spec_return column_spec177 = null;


        CommonTree COMMA176_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_column_spec=new RewriteRuleSubtreeStream(adaptor,"rule column_spec");
        try {
            // MySQLParser.g:332:2: ( column_spec ( COMMA column_spec )* -> ^( COLUMNS ( column_spec )+ ) )
            // MySQLParser.g:332:4: column_spec ( COMMA column_spec )*
            {
            pushFollow(FOLLOW_column_spec_in_column_specs1567);
            column_spec175=column_spec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_column_spec.add(column_spec175.getTree());
            // MySQLParser.g:332:16: ( COMMA column_spec )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==COMMA) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // MySQLParser.g:332:18: COMMA column_spec
            	    {
            	    COMMA176=(Token)match(input,COMMA,FOLLOW_COMMA_in_column_specs1571); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA176);

            	    pushFollow(FOLLOW_column_spec_in_column_specs1573);
            	    column_spec177=column_spec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_column_spec.add(column_spec177.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);



            // AST REWRITE
            // elements: column_spec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 332:38: -> ^( COLUMNS ( column_spec )+ )
            {
                // MySQLParser.g:332:40: ^( COLUMNS ( column_spec )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COLUMNS, "COLUMNS"), root_1);

                if ( !(stream_column_spec.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_column_spec.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_spec.nextTree());

                }
                stream_column_spec.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "column_specs"

    public static class selected_table_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selected_table"
    // MySQLParser.g:335:1: selected_table : a_table ( COMMA a_table )* -> ^( TABLENAMES ( a_table )+ ) ;
    public final MySQLParserParser.selected_table_return selected_table() throws RecognitionException {
        MySQLParserParser.selected_table_return retval = new MySQLParserParser.selected_table_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA179=null;
        MySQLParserParser.a_table_return a_table178 = null;

        MySQLParserParser.a_table_return a_table180 = null;


        CommonTree COMMA179_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_a_table=new RewriteRuleSubtreeStream(adaptor,"rule a_table");
        try {
            // MySQLParser.g:336:2: ( a_table ( COMMA a_table )* -> ^( TABLENAMES ( a_table )+ ) )
            // MySQLParser.g:336:3: a_table ( COMMA a_table )*
            {
            pushFollow(FOLLOW_a_table_in_selected_table1594);
            a_table178=a_table();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_a_table.add(a_table178.getTree());
            // MySQLParser.g:336:11: ( COMMA a_table )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==COMMA) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // MySQLParser.g:336:12: COMMA a_table
            	    {
            	    COMMA179=(Token)match(input,COMMA,FOLLOW_COMMA_in_selected_table1597); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA179);

            	    pushFollow(FOLLOW_a_table_in_selected_table1599);
            	    a_table180=a_table();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_a_table.add(a_table180.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);



            // AST REWRITE
            // elements: a_table
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 336:27: -> ^( TABLENAMES ( a_table )+ )
            {
                // MySQLParser.g:336:29: ^( TABLENAMES ( a_table )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLENAMES, "TABLENAMES"), root_1);

                if ( !(stream_a_table.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_a_table.hasNext() ) {
                    adaptor.addChild(root_1, stream_a_table.nextTree());

                }
                stream_a_table.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "selected_table"

    public static class a_table_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "a_table"
    // MySQLParser.g:338:1: a_table : table_spec ( alias )? -> ^( TABLENAME table_spec ( alias )? ) ;
    public final MySQLParserParser.a_table_return a_table() throws RecognitionException {
        MySQLParserParser.a_table_return retval = new MySQLParserParser.a_table_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        MySQLParserParser.table_spec_return table_spec181 = null;

        MySQLParserParser.alias_return alias182 = null;


        RewriteRuleSubtreeStream stream_alias=new RewriteRuleSubtreeStream(adaptor,"rule alias");
        RewriteRuleSubtreeStream stream_table_spec=new RewriteRuleSubtreeStream(adaptor,"rule table_spec");
        try {
            // MySQLParser.g:339:2: ( table_spec ( alias )? -> ^( TABLENAME table_spec ( alias )? ) )
            // MySQLParser.g:339:3: table_spec ( alias )?
            {
            pushFollow(FOLLOW_table_spec_in_a_table1617);
            table_spec181=table_spec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_table_spec.add(table_spec181.getTree());
            // MySQLParser.g:339:15: ( alias )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==ID||LA47_0==107) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // MySQLParser.g:339:15: alias
                    {
                    pushFollow(FOLLOW_alias_in_a_table1620);
                    alias182=alias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_alias.add(alias182.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: alias, table_spec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 339:21: -> ^( TABLENAME table_spec ( alias )? )
            {
                // MySQLParser.g:339:23: ^( TABLENAME table_spec ( alias )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLENAME, "TABLENAME"), root_1);

                adaptor.addChild(root_1, stream_table_spec.nextTree());
                // MySQLParser.g:339:46: ( alias )?
                if ( stream_alias.hasNext() ) {
                    adaptor.addChild(root_1, stream_alias.nextTree());

                }
                stream_alias.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "a_table"

    public static class table_spec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table_spec"
    // MySQLParser.g:341:1: table_spec : ( ( schema_name DOT )? table_name | subquery );
    public final MySQLParserParser.table_spec_return table_spec() throws RecognitionException {
        MySQLParserParser.table_spec_return retval = new MySQLParserParser.table_spec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT184=null;
        MySQLParserParser.schema_name_return schema_name183 = null;

        MySQLParserParser.table_name_return table_name185 = null;

        MySQLParserParser.subquery_return subquery186 = null;


        CommonTree DOT184_tree=null;

        try {
            // MySQLParser.g:342:2: ( ( schema_name DOT )? table_name | subquery )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ID) ) {
                alt49=1;
            }
            else if ( (LA49_0==LPAREN) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // MySQLParser.g:342:4: ( schema_name DOT )? table_name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // MySQLParser.g:342:4: ( schema_name DOT )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==ID) ) {
                        int LA48_1 = input.LA(2);

                        if ( (LA48_1==DOT) ) {
                            alt48=1;
                        }
                    }
                    switch (alt48) {
                        case 1 :
                            // MySQLParser.g:342:6: schema_name DOT
                            {
                            pushFollow(FOLLOW_schema_name_in_table_spec1642);
                            schema_name183=schema_name();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, schema_name183.getTree());
                            DOT184=(Token)match(input,DOT,FOLLOW_DOT_in_table_spec1644); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_table_name_in_table_spec1649);
                    table_name185=table_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, table_name185.getTree());

                    }
                    break;
                case 2 :
                    // MySQLParser.g:343:4: subquery
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_subquery_in_table_spec1655);
                    subquery186=subquery();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery186.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "table_spec"

    public static class table_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table_name"
    // MySQLParser.g:346:1: table_name : identifier ;
    public final MySQLParserParser.table_name_return table_name() throws RecognitionException {
        MySQLParserParser.table_name_return retval = new MySQLParserParser.table_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        MySQLParserParser.identifier_return identifier187 = null;



        try {
            // MySQLParser.g:347:2: ( identifier )
            // MySQLParser.g:347:3: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_table_name1666);
            identifier187=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier187.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "table_name"

    public static class column_spec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column_spec"
    // MySQLParser.g:350:1: column_spec : ( ( table_name DOT )? identifier -> ^( COLUMN identifier ( table_name )? ) | ASTERISK -> ^( COLUMNAST ASTERISK ) );
    public final MySQLParserParser.column_spec_return column_spec() throws RecognitionException {
        MySQLParserParser.column_spec_return retval = new MySQLParserParser.column_spec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT189=null;
        Token ASTERISK191=null;
        MySQLParserParser.table_name_return table_name188 = null;

        MySQLParserParser.identifier_return identifier190 = null;


        CommonTree DOT189_tree=null;
        CommonTree ASTERISK191_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // MySQLParser.g:351:2: ( ( table_name DOT )? identifier -> ^( COLUMN identifier ( table_name )? ) | ASTERISK -> ^( COLUMNAST ASTERISK ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ID) ) {
                alt51=1;
            }
            else if ( (LA51_0==ASTERISK) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // MySQLParser.g:351:3: ( table_name DOT )? identifier
                    {
                    // MySQLParser.g:351:3: ( table_name DOT )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==ID) ) {
                        int LA50_1 = input.LA(2);

                        if ( (LA50_1==DOT) ) {
                            alt50=1;
                        }
                    }
                    switch (alt50) {
                        case 1 :
                            // MySQLParser.g:351:4: table_name DOT
                            {
                            pushFollow(FOLLOW_table_name_in_column_spec1678);
                            table_name188=table_name();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_table_name.add(table_name188.getTree());
                            DOT189=(Token)match(input,DOT,FOLLOW_DOT_in_column_spec1680); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(DOT189);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_identifier_in_column_spec1684);
                    identifier190=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier190.getTree());


                    // AST REWRITE
                    // elements: table_name, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 351:32: -> ^( COLUMN identifier ( table_name )? )
                    {
                        // MySQLParser.g:351:34: ^( COLUMN identifier ( table_name )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COLUMN, "COLUMN"), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        // MySQLParser.g:351:54: ( table_name )?
                        if ( stream_table_name.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_name.nextTree());

                        }
                        stream_table_name.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // MySQLParser.g:352:3: ASTERISK
                    {
                    ASTERISK191=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_column_spec1698); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASTERISK.add(ASTERISK191);



                    // AST REWRITE
                    // elements: ASTERISK
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 352:11: -> ^( COLUMNAST ASTERISK )
                    {
                        // MySQLParser.g:352:13: ^( COLUMNAST ASTERISK )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COLUMNAST, "COLUMNAST"), root_1);

                        adaptor.addChild(root_1, stream_ASTERISK.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "column_spec"

    public static class schema_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "schema_name"
    // MySQLParser.g:355:1: schema_name : identifier ;
    public final MySQLParserParser.schema_name_return schema_name() throws RecognitionException {
        MySQLParserParser.schema_name_return retval = new MySQLParserParser.schema_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        MySQLParserParser.identifier_return identifier192 = null;



        try {
            // MySQLParser.g:356:2: ( identifier )
            // MySQLParser.g:356:3: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_schema_name1714);
            identifier192=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier192.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "schema_name"

    public static class boolean_literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_literal"
    // MySQLParser.g:359:1: boolean_literal : ( 'TRUE' | 'FALSE' );
    public final MySQLParserParser.boolean_literal_return boolean_literal() throws RecognitionException {
        MySQLParserParser.boolean_literal_return retval = new MySQLParserParser.boolean_literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set193=null;

        CommonTree set193_tree=null;

        try {
            // MySQLParser.g:360:2: ( 'TRUE' | 'FALSE' )
            // MySQLParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set193=(Token)input.LT(1);
            if ( (input.LA(1)>=105 && input.LA(1)<=106) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set193));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "boolean_literal"

    public static class alias_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "alias"
    // MySQLParser.g:363:1: alias : ( 'AS' )? identifier -> ^( AS identifier ) ;
    public final MySQLParserParser.alias_return alias() throws RecognitionException {
        MySQLParserParser.alias_return retval = new MySQLParserParser.alias_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal194=null;
        MySQLParserParser.identifier_return identifier195 = null;


        CommonTree string_literal194_tree=null;
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // MySQLParser.g:364:2: ( ( 'AS' )? identifier -> ^( AS identifier ) )
            // MySQLParser.g:364:4: ( 'AS' )? identifier
            {
            // MySQLParser.g:364:4: ( 'AS' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==107) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // MySQLParser.g:364:6: 'AS'
                    {
                    string_literal194=(Token)match(input,107,FOLLOW_107_in_alias1744); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_107.add(string_literal194);


                    }
                    break;

            }

            pushFollow(FOLLOW_identifier_in_alias1748);
            identifier195=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier195.getTree());


            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 364:23: -> ^( AS identifier )
            {
                // MySQLParser.g:364:25: ^( AS identifier )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AS, "AS"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "alias"

    public static class identifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifier"
    // MySQLParser.g:367:1: identifier : ID ;
    public final MySQLParserParser.identifier_return identifier() throws RecognitionException {
        MySQLParserParser.identifier_return retval = new MySQLParserParser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID196=null;

        CommonTree ID196_tree=null;

        try {
            // MySQLParser.g:368:2: ( ID )
            // MySQLParser.g:368:4: ID
            {
            root_0 = (CommonTree)adaptor.nil();

            ID196=(Token)match(input,ID,FOLLOW_ID_in_identifier1766); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID196_tree = (CommonTree)adaptor.create(ID196);
            adaptor.addChild(root_0, ID196_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "identifier"

    public static class quoted_string_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "quoted_string"
    // MySQLParser.g:448:1: quoted_string : QUOTED_STRING ;
    public final MySQLParserParser.quoted_string_return quoted_string() throws RecognitionException {
        MySQLParserParser.quoted_string_return retval = new MySQLParserParser.quoted_string_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUOTED_STRING197=null;

        CommonTree QUOTED_STRING197_tree=null;

        try {
            // MySQLParser.g:449:2: ( QUOTED_STRING )
            // MySQLParser.g:449:4: QUOTED_STRING
            {
            root_0 = (CommonTree)adaptor.nil();

            QUOTED_STRING197=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_quoted_string2194); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            QUOTED_STRING197_tree = (CommonTree)adaptor.create(QUOTED_STRING197);
            adaptor.addChild(root_0, QUOTED_STRING197_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "quoted_string"

    public static class select_command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select_command"
    // MySQLParser.g:490:1: select_command : selectClause ( fromClause )? ( whereClause )? ( groupByClause )? ( orderByClause )? ( limitClause )? ( indexClause )? ( for_update )? ;
    public final MySQLParserParser.select_command_return select_command() throws RecognitionException {
        MySQLParserParser.select_command_return retval = new MySQLParserParser.select_command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        MySQLParserParser.selectClause_return selectClause198 = null;

        MySQLParserParser.fromClause_return fromClause199 = null;

        MySQLParserParser.whereClause_return whereClause200 = null;

        MySQLParserParser.groupByClause_return groupByClause201 = null;

        MySQLParserParser.orderByClause_return orderByClause202 = null;

        MySQLParserParser.limitClause_return limitClause203 = null;

        MySQLParserParser.indexClause_return indexClause204 = null;

        MySQLParserParser.for_update_return for_update205 = null;



        try {
            // MySQLParser.g:491:6: ( selectClause ( fromClause )? ( whereClause )? ( groupByClause )? ( orderByClause )? ( limitClause )? ( indexClause )? ( for_update )? )
            // MySQLParser.g:491:8: selectClause ( fromClause )? ( whereClause )? ( groupByClause )? ( orderByClause )? ( limitClause )? ( indexClause )? ( for_update )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_selectClause_in_select_command2379);
            selectClause198=selectClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, selectClause198.getTree());
            // MySQLParser.g:491:21: ( fromClause )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==103) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // MySQLParser.g:491:22: fromClause
                    {
                    pushFollow(FOLLOW_fromClause_in_select_command2382);
                    fromClause199=fromClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fromClause199.getTree());

                    }
                    break;

            }

            // MySQLParser.g:491:35: ( whereClause )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==91) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // MySQLParser.g:491:36: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_select_command2387);
                    whereClause200=whereClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whereClause200.getTree());

                    }
                    break;

            }

            // MySQLParser.g:491:50: ( groupByClause )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==87) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // MySQLParser.g:491:50: groupByClause
                    {
                    pushFollow(FOLLOW_groupByClause_in_select_command2391);
                    groupByClause201=groupByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, groupByClause201.getTree());

                    }
                    break;

            }

            // MySQLParser.g:491:65: ( orderByClause )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==89) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // MySQLParser.g:491:66: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_select_command2395);
                    orderByClause202=orderByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, orderByClause202.getTree());

                    }
                    break;

            }

            // MySQLParser.g:491:82: ( limitClause )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==113) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // MySQLParser.g:491:83: limitClause
                    {
                    pushFollow(FOLLOW_limitClause_in_select_command2400);
                    limitClause203=limitClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, limitClause203.getTree());

                    }
                    break;

            }

            // MySQLParser.g:491:97: ( indexClause )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==108||LA58_0==110) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // MySQLParser.g:491:97: indexClause
                    {
                    pushFollow(FOLLOW_indexClause_in_select_command2404);
                    indexClause204=indexClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, indexClause204.getTree());

                    }
                    break;

            }

            // MySQLParser.g:491:110: ( for_update )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=114 && LA59_0<=115)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // MySQLParser.g:491:110: for_update
                    {
                    pushFollow(FOLLOW_for_update_in_select_command2407);
                    for_update205=for_update();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_update205.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "select_command"

    public static class indexClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "indexClause"
    // MySQLParser.g:493:2: indexClause : ( 'FORCE' 'INDEX' LPAREN select_list RPAREN | 'IGNORE' 'INDEX' LPAREN select_list RPAREN );
    public final MySQLParserParser.indexClause_return indexClause() throws RecognitionException {
        MySQLParserParser.indexClause_return retval = new MySQLParserParser.indexClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal206=null;
        Token string_literal207=null;
        Token LPAREN208=null;
        Token RPAREN210=null;
        Token string_literal211=null;
        Token string_literal212=null;
        Token LPAREN213=null;
        Token RPAREN215=null;
        MySQLParserParser.select_list_return select_list209 = null;

        MySQLParserParser.select_list_return select_list214 = null;


        CommonTree string_literal206_tree=null;
        CommonTree string_literal207_tree=null;
        CommonTree LPAREN208_tree=null;
        CommonTree RPAREN210_tree=null;
        CommonTree string_literal211_tree=null;
        CommonTree string_literal212_tree=null;
        CommonTree LPAREN213_tree=null;
        CommonTree RPAREN215_tree=null;

        try {
            // MySQLParser.g:494:3: ( 'FORCE' 'INDEX' LPAREN select_list RPAREN | 'IGNORE' 'INDEX' LPAREN select_list RPAREN )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==108) ) {
                alt60=1;
            }
            else if ( (LA60_0==110) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // MySQLParser.g:494:4: 'FORCE' 'INDEX' LPAREN select_list RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal206=(Token)match(input,108,FOLLOW_108_in_indexClause2423); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal206_tree = (CommonTree)adaptor.create(string_literal206);
                    adaptor.addChild(root_0, string_literal206_tree);
                    }
                    string_literal207=(Token)match(input,109,FOLLOW_109_in_indexClause2425); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal207_tree = (CommonTree)adaptor.create(string_literal207);
                    adaptor.addChild(root_0, string_literal207_tree);
                    }
                    LPAREN208=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_indexClause2427); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN208_tree = (CommonTree)adaptor.create(LPAREN208);
                    adaptor.addChild(root_0, LPAREN208_tree);
                    }
                    pushFollow(FOLLOW_select_list_in_indexClause2429);
                    select_list209=select_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, select_list209.getTree());
                    RPAREN210=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_indexClause2432); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN210_tree = (CommonTree)adaptor.create(RPAREN210);
                    adaptor.addChild(root_0, RPAREN210_tree);
                    }

                    }
                    break;
                case 2 :
                    // MySQLParser.g:495:4: 'IGNORE' 'INDEX' LPAREN select_list RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal211=(Token)match(input,110,FOLLOW_110_in_indexClause2437); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal211_tree = (CommonTree)adaptor.create(string_literal211);
                    adaptor.addChild(root_0, string_literal211_tree);
                    }
                    string_literal212=(Token)match(input,109,FOLLOW_109_in_indexClause2439); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal212_tree = (CommonTree)adaptor.create(string_literal212);
                    adaptor.addChild(root_0, string_literal212_tree);
                    }
                    LPAREN213=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_indexClause2441); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN213_tree = (CommonTree)adaptor.create(LPAREN213);
                    adaptor.addChild(root_0, LPAREN213_tree);
                    }
                    pushFollow(FOLLOW_select_list_in_indexClause2443);
                    select_list214=select_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, select_list214.getTree());
                    RPAREN215=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_indexClause2445); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN215_tree = (CommonTree)adaptor.create(RPAREN215);
                    adaptor.addChild(root_0, RPAREN215_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "indexClause"

    public static class delete_command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delete_command"
    // MySQLParser.g:497:1: delete_command : 'DELETE' fromClause ( whereClause )? ( orderByClause )? ( limitClause )? -> ^( DELETE fromClause ( whereClause )? ( orderByClause )? ) ( limitClause )? ;
    public final MySQLParserParser.delete_command_return delete_command() throws RecognitionException {
        MySQLParserParser.delete_command_return retval = new MySQLParserParser.delete_command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal216=null;
        MySQLParserParser.fromClause_return fromClause217 = null;

        MySQLParserParser.whereClause_return whereClause218 = null;

        MySQLParserParser.orderByClause_return orderByClause219 = null;

        MySQLParserParser.limitClause_return limitClause220 = null;


        CommonTree string_literal216_tree=null;
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_limitClause=new RewriteRuleSubtreeStream(adaptor,"rule limitClause");
        RewriteRuleSubtreeStream stream_orderByClause=new RewriteRuleSubtreeStream(adaptor,"rule orderByClause");
        RewriteRuleSubtreeStream stream_fromClause=new RewriteRuleSubtreeStream(adaptor,"rule fromClause");
        try {
            // MySQLParser.g:498:2: ( 'DELETE' fromClause ( whereClause )? ( orderByClause )? ( limitClause )? -> ^( DELETE fromClause ( whereClause )? ( orderByClause )? ) ( limitClause )? )
            // MySQLParser.g:498:3: 'DELETE' fromClause ( whereClause )? ( orderByClause )? ( limitClause )?
            {
            string_literal216=(Token)match(input,111,FOLLOW_111_in_delete_command2455); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_111.add(string_literal216);

            pushFollow(FOLLOW_fromClause_in_delete_command2457);
            fromClause217=fromClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fromClause.add(fromClause217.getTree());
            // MySQLParser.g:498:23: ( whereClause )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==91) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // MySQLParser.g:498:23: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_delete_command2459);
                    whereClause218=whereClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_whereClause.add(whereClause218.getTree());

                    }
                    break;

            }

            // MySQLParser.g:498:36: ( orderByClause )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==89) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // MySQLParser.g:498:36: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_delete_command2462);
                    orderByClause219=orderByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_orderByClause.add(orderByClause219.getTree());

                    }
                    break;

            }

            // MySQLParser.g:498:52: ( limitClause )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==113) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // MySQLParser.g:498:53: limitClause
                    {
                    pushFollow(FOLLOW_limitClause_in_delete_command2467);
                    limitClause220=limitClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_limitClause.add(limitClause220.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: whereClause, limitClause, fromClause, orderByClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 498:66: -> ^( DELETE fromClause ( whereClause )? ( orderByClause )? ) ( limitClause )?
            {
                // MySQLParser.g:498:68: ^( DELETE fromClause ( whereClause )? ( orderByClause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DELETE, "DELETE"), root_1);

                adaptor.addChild(root_1, stream_fromClause.nextTree());
                // MySQLParser.g:498:88: ( whereClause )?
                if ( stream_whereClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_whereClause.nextTree());

                }
                stream_whereClause.reset();
                // MySQLParser.g:498:101: ( orderByClause )?
                if ( stream_orderByClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_orderByClause.nextTree());

                }
                stream_orderByClause.reset();

                adaptor.addChild(root_0, root_1);
                }
                // MySQLParser.g:498:117: ( limitClause )?
                if ( stream_limitClause.hasNext() ) {
                    adaptor.addChild(root_0, stream_limitClause.nextTree());

                }
                stream_limitClause.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delete_command"

    public static class update_command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "update_command"
    // MySQLParser.g:500:1: update_command : 'UPDATE' selected_table setclause ( whereClause )? ( orderByClause )? ( limitClause )? -> ^( UPDATE selected_table setclause ( whereClause )? ( orderByClause )? ) ( limitClause )? ;
    public final MySQLParserParser.update_command_return update_command() throws RecognitionException {
        MySQLParserParser.update_command_return retval = new MySQLParserParser.update_command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal221=null;
        MySQLParserParser.selected_table_return selected_table222 = null;

        MySQLParserParser.setclause_return setclause223 = null;

        MySQLParserParser.whereClause_return whereClause224 = null;

        MySQLParserParser.orderByClause_return orderByClause225 = null;

        MySQLParserParser.limitClause_return limitClause226 = null;


        CommonTree string_literal221_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_selected_table=new RewriteRuleSubtreeStream(adaptor,"rule selected_table");
        RewriteRuleSubtreeStream stream_limitClause=new RewriteRuleSubtreeStream(adaptor,"rule limitClause");
        RewriteRuleSubtreeStream stream_setclause=new RewriteRuleSubtreeStream(adaptor,"rule setclause");
        RewriteRuleSubtreeStream stream_orderByClause=new RewriteRuleSubtreeStream(adaptor,"rule orderByClause");
        try {
            // MySQLParser.g:501:2: ( 'UPDATE' selected_table setclause ( whereClause )? ( orderByClause )? ( limitClause )? -> ^( UPDATE selected_table setclause ( whereClause )? ( orderByClause )? ) ( limitClause )? )
            // MySQLParser.g:501:3: 'UPDATE' selected_table setclause ( whereClause )? ( orderByClause )? ( limitClause )?
            {
            string_literal221=(Token)match(input,112,FOLLOW_112_in_update_command2495); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_112.add(string_literal221);

            pushFollow(FOLLOW_selected_table_in_update_command2497);
            selected_table222=selected_table();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selected_table.add(selected_table222.getTree());
            pushFollow(FOLLOW_setclause_in_update_command2500);
            setclause223=setclause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_setclause.add(setclause223.getTree());
            // MySQLParser.g:501:38: ( whereClause )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==91) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // MySQLParser.g:501:38: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_update_command2502);
                    whereClause224=whereClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_whereClause.add(whereClause224.getTree());

                    }
                    break;

            }

            // MySQLParser.g:501:51: ( orderByClause )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==89) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // MySQLParser.g:501:51: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_update_command2505);
                    orderByClause225=orderByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_orderByClause.add(orderByClause225.getTree());

                    }
                    break;

            }

            // MySQLParser.g:501:67: ( limitClause )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==113) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // MySQLParser.g:501:68: limitClause
                    {
                    pushFollow(FOLLOW_limitClause_in_update_command2510);
                    limitClause226=limitClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_limitClause.add(limitClause226.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: whereClause, limitClause, setclause, orderByClause, selected_table
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 501:81: -> ^( UPDATE selected_table setclause ( whereClause )? ( orderByClause )? ) ( limitClause )?
            {
                // MySQLParser.g:501:83: ^( UPDATE selected_table setclause ( whereClause )? ( orderByClause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UPDATE, "UPDATE"), root_1);

                adaptor.addChild(root_1, stream_selected_table.nextTree());
                adaptor.addChild(root_1, stream_setclause.nextTree());
                // MySQLParser.g:501:117: ( whereClause )?
                if ( stream_whereClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_whereClause.nextTree());

                }
                stream_whereClause.reset();
                // MySQLParser.g:501:130: ( orderByClause )?
                if ( stream_orderByClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_orderByClause.nextTree());

                }
                stream_orderByClause.reset();

                adaptor.addChild(root_0, root_1);
                }
                // MySQLParser.g:501:145: ( limitClause )?
                if ( stream_limitClause.hasNext() ) {
                    adaptor.addChild(root_0, stream_limitClause.nextTree());

                }
                stream_limitClause.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "update_command"

    public static class limitClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "limitClause"
    // MySQLParser.g:503:1: limitClause : 'LIMIT' ( skip COMMA )? range -> ^( 'LIMIT' ( skip )? range ) ;
    public final MySQLParserParser.limitClause_return limitClause() throws RecognitionException {
        MySQLParserParser.limitClause_return retval = new MySQLParserParser.limitClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal227=null;
        Token COMMA229=null;
        MySQLParserParser.skip_return skip228 = null;

        MySQLParserParser.range_return range230 = null;


        CommonTree string_literal227_tree=null;
        CommonTree COMMA229_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");
        RewriteRuleSubtreeStream stream_skip=new RewriteRuleSubtreeStream(adaptor,"rule skip");
        try {
            // MySQLParser.g:504:2: ( 'LIMIT' ( skip COMMA )? range -> ^( 'LIMIT' ( skip )? range ) )
            // MySQLParser.g:504:3: 'LIMIT' ( skip COMMA )? range
            {
            string_literal227=(Token)match(input,113,FOLLOW_113_in_limitClause2539); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_113.add(string_literal227);

            // MySQLParser.g:504:11: ( skip COMMA )?
            int alt67=2;
            switch ( input.LA(1) ) {
                case PLUS:
                    {
                    int LA67_1 = input.LA(2);

                    if ( (LA67_1==N) ) {
                        int LA67_5 = input.LA(3);

                        if ( (LA67_5==COMMA) ) {
                            alt67=1;
                        }
                    }
                    }
                    break;
                case MINUS:
                    {
                    int LA67_2 = input.LA(2);

                    if ( (LA67_2==N) ) {
                        int LA67_6 = input.LA(3);

                        if ( (LA67_6==COMMA) ) {
                            alt67=1;
                        }
                    }
                    }
                    break;
                case N:
                    {
                    int LA67_3 = input.LA(2);

                    if ( (LA67_3==COMMA) ) {
                        alt67=1;
                    }
                    }
                    break;
                case 104:
                    {
                    int LA67_4 = input.LA(2);

                    if ( (LA67_4==COMMA) ) {
                        alt67=1;
                    }
                    }
                    break;
            }

            switch (alt67) {
                case 1 :
                    // MySQLParser.g:504:12: skip COMMA
                    {
                    pushFollow(FOLLOW_skip_in_limitClause2542);
                    skip228=skip();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_skip.add(skip228.getTree());
                    COMMA229=(Token)match(input,COMMA,FOLLOW_COMMA_in_limitClause2544); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA229);


                    }
                    break;

            }

            pushFollow(FOLLOW_range_in_limitClause2549);
            range230=range();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_range.add(range230.getTree());


            // AST REWRITE
            // elements: skip, 113, range
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 504:31: -> ^( 'LIMIT' ( skip )? range )
            {
                // MySQLParser.g:504:33: ^( 'LIMIT' ( skip )? range )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_113.nextNode(), root_1);

                // MySQLParser.g:504:43: ( skip )?
                if ( stream_skip.hasNext() ) {
                    adaptor.addChild(root_1, stream_skip.nextTree());

                }
                stream_skip.reset();
                adaptor.addChild(root_1, stream_range.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "limitClause"

    public static class for_update_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_update"
    // MySQLParser.g:506:1: for_update : ( 'FOR' 'UPDATE' -> ^( FORUPDATE ) | 'LOCK' 'IN' 'SHARE' 'MODE' -> ^( SHAREMODE ) );
    public final MySQLParserParser.for_update_return for_update() throws RecognitionException {
        MySQLParserParser.for_update_return retval = new MySQLParserParser.for_update_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal231=null;
        Token string_literal232=null;
        Token string_literal233=null;
        Token string_literal234=null;
        Token string_literal235=null;
        Token string_literal236=null;

        CommonTree string_literal231_tree=null;
        CommonTree string_literal232_tree=null;
        CommonTree string_literal233_tree=null;
        CommonTree string_literal234_tree=null;
        CommonTree string_literal235_tree=null;
        CommonTree string_literal236_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");

        try {
            // MySQLParser.g:507:2: ( 'FOR' 'UPDATE' -> ^( FORUPDATE ) | 'LOCK' 'IN' 'SHARE' 'MODE' -> ^( SHAREMODE ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==114) ) {
                alt68=1;
            }
            else if ( (LA68_0==115) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // MySQLParser.g:507:3: 'FOR' 'UPDATE'
                    {
                    string_literal231=(Token)match(input,114,FOLLOW_114_in_for_update2567); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_114.add(string_literal231);

                    string_literal232=(Token)match(input,112,FOLLOW_112_in_for_update2569); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_112.add(string_literal232);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 507:18: -> ^( FORUPDATE )
                    {
                        // MySQLParser.g:507:20: ^( FORUPDATE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORUPDATE, "FORUPDATE"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // MySQLParser.g:508:3: 'LOCK' 'IN' 'SHARE' 'MODE'
                    {
                    string_literal233=(Token)match(input,115,FOLLOW_115_in_for_update2578); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_115.add(string_literal233);

                    string_literal234=(Token)match(input,100,FOLLOW_100_in_for_update2580); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_100.add(string_literal234);

                    string_literal235=(Token)match(input,116,FOLLOW_116_in_for_update2582); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_116.add(string_literal235);

                    string_literal236=(Token)match(input,117,FOLLOW_117_in_for_update2584); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_117.add(string_literal236);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 508:29: -> ^( SHAREMODE )
                    {
                        // MySQLParser.g:508:31: ^( SHAREMODE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SHAREMODE, "SHAREMODE"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "for_update"

    public static class skip_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "skip"
    // MySQLParser.g:510:1: skip : ( PLUS N -> ^( SKIP N ) | MINUS N -> ^( SKIP MINUS N ) | N -> ^( SKIP N ) | '?' -> ^( SKIP '?' ) );
    public final MySQLParserParser.skip_return skip() throws RecognitionException {
        MySQLParserParser.skip_return retval = new MySQLParserParser.skip_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS237=null;
        Token N238=null;
        Token MINUS239=null;
        Token N240=null;
        Token N241=null;
        Token char_literal242=null;

        CommonTree PLUS237_tree=null;
        CommonTree N238_tree=null;
        CommonTree MINUS239_tree=null;
        CommonTree N240_tree=null;
        CommonTree N241_tree=null;
        CommonTree char_literal242_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_N=new RewriteRuleTokenStream(adaptor,"token N");

        try {
            // MySQLParser.g:511:2: ( PLUS N -> ^( SKIP N ) | MINUS N -> ^( SKIP MINUS N ) | N -> ^( SKIP N ) | '?' -> ^( SKIP '?' ) )
            int alt69=4;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt69=1;
                }
                break;
            case MINUS:
                {
                alt69=2;
                }
                break;
            case N:
                {
                alt69=3;
                }
                break;
            case 104:
                {
                alt69=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // MySQLParser.g:511:3: PLUS N
                    {
                    PLUS237=(Token)match(input,PLUS,FOLLOW_PLUS_in_skip2598); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(PLUS237);

                    N238=(Token)match(input,N,FOLLOW_N_in_skip2600); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_N.add(N238);



                    // AST REWRITE
                    // elements: N
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 511:10: -> ^( SKIP N )
                    {
                        // MySQLParser.g:511:12: ^( SKIP N )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SKIP, "SKIP"), root_1);

                        adaptor.addChild(root_1, stream_N.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // MySQLParser.g:512:3: MINUS N
                    {
                    MINUS239=(Token)match(input,MINUS,FOLLOW_MINUS_in_skip2611); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS239);

                    N240=(Token)match(input,N,FOLLOW_N_in_skip2613); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_N.add(N240);



                    // AST REWRITE
                    // elements: N, MINUS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 512:11: -> ^( SKIP MINUS N )
                    {
                        // MySQLParser.g:512:13: ^( SKIP MINUS N )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SKIP, "SKIP"), root_1);

                        adaptor.addChild(root_1, stream_MINUS.nextNode());
                        adaptor.addChild(root_1, stream_N.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // MySQLParser.g:513:3: N
                    {
                    N241=(Token)match(input,N,FOLLOW_N_in_skip2626); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_N.add(N241);



                    // AST REWRITE
                    // elements: N
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 513:5: -> ^( SKIP N )
                    {
                        // MySQLParser.g:513:7: ^( SKIP N )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SKIP, "SKIP"), root_1);

                        adaptor.addChild(root_1, stream_N.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // MySQLParser.g:514:3: '?'
                    {
                    char_literal242=(Token)match(input,104,FOLLOW_104_in_skip2637); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_104.add(char_literal242);



                    // AST REWRITE
                    // elements: 104
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 514:6: -> ^( SKIP '?' )
                    {
                        // MySQLParser.g:514:8: ^( SKIP '?' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SKIP, "SKIP"), root_1);

                        adaptor.addChild(root_1, stream_104.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "skip"

    public static class range_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "range"
    // MySQLParser.g:516:1: range : ( PLUS N -> ^( RANGE N ) | MINUS N -> ^( RANGE MINUS N ) | N -> ^( RANGE N ) | '?' -> ^( RANGE '?' ) );
    public final MySQLParserParser.range_return range() throws RecognitionException {
        MySQLParserParser.range_return retval = new MySQLParserParser.range_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS243=null;
        Token N244=null;
        Token MINUS245=null;
        Token N246=null;
        Token N247=null;
        Token char_literal248=null;

        CommonTree PLUS243_tree=null;
        CommonTree N244_tree=null;
        CommonTree MINUS245_tree=null;
        CommonTree N246_tree=null;
        CommonTree N247_tree=null;
        CommonTree char_literal248_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_N=new RewriteRuleTokenStream(adaptor,"token N");

        try {
            // MySQLParser.g:516:7: ( PLUS N -> ^( RANGE N ) | MINUS N -> ^( RANGE MINUS N ) | N -> ^( RANGE N ) | '?' -> ^( RANGE '?' ) )
            int alt70=4;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt70=1;
                }
                break;
            case MINUS:
                {
                alt70=2;
                }
                break;
            case N:
                {
                alt70=3;
                }
                break;
            case 104:
                {
                alt70=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // MySQLParser.g:516:8: PLUS N
                    {
                    PLUS243=(Token)match(input,PLUS,FOLLOW_PLUS_in_range2651); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(PLUS243);

                    N244=(Token)match(input,N,FOLLOW_N_in_range2653); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_N.add(N244);



                    // AST REWRITE
                    // elements: N
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 516:15: -> ^( RANGE N )
                    {
                        // MySQLParser.g:516:17: ^( RANGE N )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RANGE, "RANGE"), root_1);

                        adaptor.addChild(root_1, stream_N.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // MySQLParser.g:517:3: MINUS N
                    {
                    MINUS245=(Token)match(input,MINUS,FOLLOW_MINUS_in_range2664); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS245);

                    N246=(Token)match(input,N,FOLLOW_N_in_range2666); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_N.add(N246);



                    // AST REWRITE
                    // elements: N, MINUS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 517:11: -> ^( RANGE MINUS N )
                    {
                        // MySQLParser.g:517:13: ^( RANGE MINUS N )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RANGE, "RANGE"), root_1);

                        adaptor.addChild(root_1, stream_MINUS.nextNode());
                        adaptor.addChild(root_1, stream_N.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // MySQLParser.g:518:3: N
                    {
                    N247=(Token)match(input,N,FOLLOW_N_in_range2679); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_N.add(N247);



                    // AST REWRITE
                    // elements: N
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 518:4: -> ^( RANGE N )
                    {
                        // MySQLParser.g:518:6: ^( RANGE N )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RANGE, "RANGE"), root_1);

                        adaptor.addChild(root_1, stream_N.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // MySQLParser.g:519:3: '?'
                    {
                    char_literal248=(Token)match(input,104,FOLLOW_104_in_range2689); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_104.add(char_literal248);



                    // AST REWRITE
                    // elements: 104
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 519:6: -> ^( RANGE '?' )
                    {
                        // MySQLParser.g:519:8: ^( RANGE '?' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RANGE, "RANGE"), root_1);

                        adaptor.addChild(root_1, stream_104.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "range"

    // $ANTLR start synpred1_MySQLParser
    public final void synpred1_MySQLParser_fragment() throws RecognitionException {   
        // MySQLParser.g:173:3: ( LPAREN condition_or RPAREN )
        // MySQLParser.g:173:4: LPAREN condition_or RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred1_MySQLParser582); if (state.failed) return ;
        pushFollow(FOLLOW_condition_or_in_synpred1_MySQLParser584);
        condition_or();

        state._fsp--;
        if (state.failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred1_MySQLParser586); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_MySQLParser

    // Delegated rules

    public final boolean synpred1_MySQLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_MySQLParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\16\uffff";
    static final String DFA8_eofS =
        "\16\uffff";
    static final String DFA8_minS =
        "\1\66\1\0\14\uffff";
    static final String DFA8_maxS =
        "\1\152\1\0\14\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\12\uffff\1\1";
    static final String DFA8_specialS =
        "\1\uffff\1\0\14\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\6\uffff\3\2\2\uffff\1\2\10\uffff\2\2\3\uffff\1\2\22\uffff"+
            "\1\2\2\uffff\1\2\1\uffff\3\2",
            "\1\uffff",
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

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "172:1: condition_PAREN : ( ( LPAREN condition_or RPAREN )=> LPAREN condition_or RPAREN -> ^( PRIORITY condition_or ) | condition_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_1 = input.LA(1);

                         
                        int index8_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_MySQLParser()) ) {s = 13;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index8_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_start_rule_in_beg252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_command_in_start_rule264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_command_in_start_rule268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_command_in_start_rule272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_command_in_start_rule276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_setclause288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_updateColumnSpecs_in_setclause290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateColumnSpec_in_updateColumnSpecs307 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_COMMA_in_updateColumnSpecs310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_updateColumnSpec_in_updateColumnSpecs312 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_columnNameInUpdate_in_updateColumnSpec330 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_EQ_in_updateColumnSpec332 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_expr_in_updateColumnSpec335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_insert_command345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_insert_command347 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_selected_table_in_insert_command349 = new BitSet(new long[]{0x0040000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_command355 = new BitSet(new long[]{0x8040000000000000L,0x0000010000011804L});
    public static final BitSet FOLLOW_column_specs_in_insert_command357 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_command360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_insert_command368 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_command370 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_values_in_insert_command372 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_command374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_groupByClause398 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_groupByClause400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_columnNamesAfterWhere_in_groupByClause402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_orderByClause422 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_orderByClause424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_columnNamesAfterWhere_in_orderByClause426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnNameAfterWhere_in_columnNamesAfterWhere446 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_COMMA_in_columnNamesAfterWhere449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_columnNameAfterWhere_in_columnNamesAfterWhere452 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_90_in_selectClause470 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_select_list_in_selectClause473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_whereClause493 = new BitSet(new long[]{0xE040000000000000L,0x0000074810011804L});
    public static final BitSet FOLLOW_sqlCondition_in_whereClause495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_sqlCondition511 = new BitSet(new long[]{0xE040000000000000L,0x0000074810011804L});
    public static final BitSet FOLLOW_condition_or_in_sqlCondition513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_or_in_sqlCondition524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_and_in_condition_or542 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_condition_or546 = new BitSet(new long[]{0xE040000000000000L,0x0000074810011804L});
    public static final BitSet FOLLOW_condition_and_in_condition_or549 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_condition_PAREN_in_condition_and562 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_condition_and566 = new BitSet(new long[]{0xE040000000000000L,0x0000074810011804L});
    public static final BitSet FOLLOW_condition_PAREN_in_condition_and569 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_condition_PAREN589 = new BitSet(new long[]{0xE040000000000000L,0x0000074810011804L});
    public static final BitSet FOLLOW_condition_or_in_condition_PAREN591 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_condition_PAREN593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_expr_in_condition_PAREN603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_left_in_condition_expr613 = new BitSet(new long[]{0x0020000000000000L,0x00000031900000F8L});
    public static final BitSet FOLLOW_comparisonCondition_in_condition_expr618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inCondition_in_condition_expr624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isCondition_in_condition_expr630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_likeCondition_in_condition_expr637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_betweenCondition_in_condition_expr643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_condition_left657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_betweenCondition673 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_betweenCondition675 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_between_and_in_betweenCondition677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_betweenCondition688 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_between_and_in_betweenCondition690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_between_and_expression_in_between_and707 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_between_and709 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_between_and_expression_in_between_and712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_bit_in_between_and_expression724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_isCondition736 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_isCondition738 = new BitSet(new long[]{0x0000000000000000L,0x0000000E00000000L});
    public static final BitSet FOLLOW_condition_is_valobject_in_isCondition740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_isCondition750 = new BitSet(new long[]{0x0000000000000000L,0x0000000E00000000L});
    public static final BitSet FOLLOW_condition_is_valobject_in_isCondition752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_condition_is_valobject770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_condition_is_valobject778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_condition_is_valobject786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_inCondition802 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_inCondition806 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_subquery_in_inCondition809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_inCondition815 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_inCondition_expr_bits_in_inCondition817 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_inCondition819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_likeCondition846 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_likeCondition847 = new BitSet(new long[]{0x8040000000000000L,0x0000010000011804L});
    public static final BitSet FOLLOW_value_in_likeCondition850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_likeCondition860 = new BitSet(new long[]{0x8040000000000000L,0x0000010000011804L});
    public static final BitSet FOLLOW_value_in_likeCondition862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_bit_in_inCondition_expr_bits878 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_COMMA_in_inCondition_expr_bits880 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_expr_bit_in_inCondition_expr_bits882 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_columnNameAfterWhere_in_identifiers902 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_COMMA_in_identifiers905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_identifiers907 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_relational_op_in_comparisonCondition919 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_bit_in_expr938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_expr943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_subquery959 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_select_command_in_subquery961 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_subquery963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_add_in_expr_bit981 = new BitSet(new long[]{0x1F00000000000002L});
    public static final BitSet FOLLOW_BITOR_in_expr_bit987 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_BITAND_in_expr_bit992 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_BITXOR_in_expr_bit995 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_SHIFTLEFT_in_expr_bit998 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_SHIFTRIGHT_in_expr_bit1001 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_expr_add_in_expr_bit1006 = new BitSet(new long[]{0x1F00000000000002L});
    public static final BitSet FOLLOW_expr_mul_in_expr_add1019 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_expr_add1025 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_MINUS_in_expr_add1030 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_expr_mul_in_expr_add1036 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_expr_sign_in_expr_mul1050 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ASTERISK_in_expr_mul1056 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_DIVIDE_in_expr_mul1061 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_expr_sign_in_expr_mul1066 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_PLUS_in_expr_sign1079 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_expr_pow_in_expr_sign1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_expr_sign1092 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_expr_pow_in_expr_sign1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_pow_in_expr_sign1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_expr_in_expr_pow1115 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_EXPONENT_in_expr_pow1119 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_expr_expr_in_expr_pow1122 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_expr_expr1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_literal_in_expr_expr1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_expr_expr1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_expr_expr1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr_expr1155 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_expr_expr1158 = new BitSet(new long[]{0xE0C0000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_values_func_in_expr_expr1160 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_expr_expr1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr_expr1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_or_in_sql_condition1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relational_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_fromClause1236 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_selected_table_in_fromClause1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_displayed_column_in_select_list1250 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_COMMA_in_select_list1254 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_displayed_column_in_select_list1256 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ID_in_displayed_column1281 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_displayed_column1285 = new BitSet(new long[]{0xE0C0000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_values_func_in_displayed_column1287 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_displayed_column1290 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000004L});
    public static final BitSet FOLLOW_alias_in_displayed_column1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_displayed_column1311 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000004L});
    public static final BitSet FOLLOW_alias_in_displayed_column1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_alias_in_displayed_column1328 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_column_in_displayed_column1332 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000004L});
    public static final BitSet FOLLOW_alias_in_displayed_column1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_alias_in_columnNameAfterWhere1360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_columnNameAfterWhere1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_alias_in_columnNameAfterWhere1378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_columnNameAfterWhere1381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ASC_in_columnNameAfterWhere1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_alias_in_columnNameAfterWhere1399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_columnNameAfterWhere1402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_DESC_in_columnNameAfterWhere1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_alias_in_columnNameInUpdate1426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_columnNameInUpdate1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_table_alias1439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_DOT_in_table_alias1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_column1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_N_in_column1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_column1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_values1476 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_COMMA_in_values1480 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_expr_in_values1482 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_expr_in_values_func1501 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_COMMA_in_values_func1505 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_expr_in_values_func1508 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_N_in_value1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_value1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_value1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value1534 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_expr_in_value1537 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_value1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quoted_string_in_value1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_spec_in_value1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_spec_in_column_specs1567 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_COMMA_in_column_specs1571 = new BitSet(new long[]{0x8040000000000000L,0x0000010000011804L});
    public static final BitSet FOLLOW_column_spec_in_column_specs1573 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_a_table_in_selected_table1594 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_COMMA_in_selected_table1597 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_a_table_in_selected_table1599 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_table_spec_in_a_table1617 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000004L});
    public static final BitSet FOLLOW_alias_in_a_table1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schema_name_in_table_spec1642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_DOT_in_table_spec1644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_table_name_in_table_spec1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_table_spec1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_table_name1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_name_in_column_spec1678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_DOT_in_column_spec1680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_column_spec1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_column_spec1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_schema_name1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolean_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_alias1744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_alias1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_quoted_string2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectClause_in_select_command2379 = new BitSet(new long[]{0x0000000000000002L,0x000E50800A800000L});
    public static final BitSet FOLLOW_fromClause_in_select_command2382 = new BitSet(new long[]{0x0000000000000002L,0x000E50000A800000L});
    public static final BitSet FOLLOW_whereClause_in_select_command2387 = new BitSet(new long[]{0x0000000000000002L,0x000E500002800000L});
    public static final BitSet FOLLOW_groupByClause_in_select_command2391 = new BitSet(new long[]{0x0000000000000002L,0x000E500002000000L});
    public static final BitSet FOLLOW_orderByClause_in_select_command2395 = new BitSet(new long[]{0x0000000000000002L,0x000E500000000000L});
    public static final BitSet FOLLOW_limitClause_in_select_command2400 = new BitSet(new long[]{0x0000000000000002L,0x000C500000000000L});
    public static final BitSet FOLLOW_indexClause_in_select_command2404 = new BitSet(new long[]{0x0000000000000002L,0x000C000000000000L});
    public static final BitSet FOLLOW_for_update_in_select_command2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_indexClause2423 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_indexClause2425 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_indexClause2427 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_select_list_in_indexClause2429 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_indexClause2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_indexClause2437 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_indexClause2439 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_indexClause2441 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_select_list_in_indexClause2443 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_indexClause2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_delete_command2455 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_fromClause_in_delete_command2457 = new BitSet(new long[]{0x0000000000000002L,0x000200000A000000L});
    public static final BitSet FOLLOW_whereClause_in_delete_command2459 = new BitSet(new long[]{0x0000000000000002L,0x0002000002000000L});
    public static final BitSet FOLLOW_orderByClause_in_delete_command2462 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_limitClause_in_delete_command2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_update_command2495 = new BitSet(new long[]{0xE040000000000000L,0x0000074800011804L});
    public static final BitSet FOLLOW_selected_table_in_update_command2497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_setclause_in_update_command2500 = new BitSet(new long[]{0x0000000000000002L,0x000200000A000000L});
    public static final BitSet FOLLOW_whereClause_in_update_command2502 = new BitSet(new long[]{0x0000000000000002L,0x0002000002000000L});
    public static final BitSet FOLLOW_orderByClause_in_update_command2505 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_limitClause_in_update_command2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_limitClause2539 = new BitSet(new long[]{0x6000000000000000L,0x0000010000000800L});
    public static final BitSet FOLLOW_skip_in_limitClause2542 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_COMMA_in_limitClause2544 = new BitSet(new long[]{0x6000000000000000L,0x0000010000000800L});
    public static final BitSet FOLLOW_range_in_limitClause2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_for_update2567 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_for_update2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_for_update2578 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_for_update2580 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_for_update2582 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_for_update2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_skip2598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_N_in_skip2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_skip2611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_N_in_skip2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_N_in_skip2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_skip2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_range2651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_N_in_range2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_range2664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_N_in_range2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_N_in_range2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_range2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred1_MySQLParser582 = new BitSet(new long[]{0xE040000000000000L,0x0000074810011804L});
    public static final BitSet FOLLOW_condition_or_in_synpred1_MySQLParser584 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred1_MySQLParser586 = new BitSet(new long[]{0x0000000000000002L});

}