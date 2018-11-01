// $ANTLR 3.3 Nov 30, 2010 12:50:56 OracleParser.g 2017-07-10 19:33:04

package com.taobao.tddl.parser.oracle;

import java.util.Map;
import java.util.HashMap;
import com.taobao.tddl.sqlobjecttree.oracle.function.OracleConsistStringRegister;
import com.taobao.tddl.sqlobjecttree.oracle.function.OracleFunctionRegister;
import com.taobao.tddl.sqlobjecttree.oracle.function.OracleHintRegister;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class OracleParserParser extends Parser {
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


        public OracleParserParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public OracleParserParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return OracleParserParser.tokenNames; }
    public String getGrammarFileName() { return "OracleParser.g"; }



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
    // OracleParser.g:121:1: beg : start_rule ;
    public final OracleParserParser.beg_return beg() throws RecognitionException {
        OracleParserParser.beg_return retval = new OracleParserParser.beg_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        OracleParserParser.start_rule_return start_rule1 = null;



        try {
            // OracleParser.g:121:5: ( start_rule )
            // OracleParser.g:122:1: start_rule
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_start_rule_in_beg264);
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
    // OracleParser.g:125:1: start_rule : ( select_command | update_command | insert_command | delete_command );
    public final OracleParserParser.start_rule_return start_rule() throws RecognitionException {
        OracleParserParser.start_rule_return retval = new OracleParserParser.start_rule_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        OracleParserParser.select_command_return select_command2 = null;

        OracleParserParser.update_command_return update_command3 = null;

        OracleParserParser.insert_command_return insert_command4 = null;

        OracleParserParser.delete_command_return delete_command5 = null;



        try {
            // OracleParser.g:126:2: ( select_command | update_command | insert_command | delete_command )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 106:
                {
                alt1=1;
                }
                break;
            case 113:
                {
                alt1=2;
                }
                break;
            case 109:
                {
                alt1=3;
                }
                break;
            case 117:
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
                    // OracleParser.g:126:3: select_command
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_select_command_in_start_rule276);
                    select_command2=select_command();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, select_command2.getTree());

                    }
                    break;
                case 2 :
                    // OracleParser.g:127:3: update_command
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_update_command_in_start_rule280);
                    update_command3=update_command();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, update_command3.getTree());

                    }
                    break;
                case 3 :
                    // OracleParser.g:128:3: insert_command
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_insert_command_in_start_rule284);
                    insert_command4=insert_command();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, insert_command4.getTree());

                    }
                    break;
                case 4 :
                    // OracleParser.g:129:3: delete_command
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_delete_command_in_start_rule288);
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
    // OracleParser.g:133:1: setclause : 'SET' updateColumnSpecs -> ^( SET updateColumnSpecs ) ;
    public final OracleParserParser.setclause_return setclause() throws RecognitionException {
        OracleParserParser.setclause_return retval = new OracleParserParser.setclause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal6=null;
        OracleParserParser.updateColumnSpecs_return updateColumnSpecs7 = null;


        CommonTree string_literal6_tree=null;
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_updateColumnSpecs=new RewriteRuleSubtreeStream(adaptor,"rule updateColumnSpecs");
        try {
            // OracleParser.g:134:2: ( 'SET' updateColumnSpecs -> ^( SET updateColumnSpecs ) )
            // OracleParser.g:134:3: 'SET' updateColumnSpecs
            {
            string_literal6=(Token)match(input,85,FOLLOW_85_in_setclause300); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_85.add(string_literal6);

            pushFollow(FOLLOW_updateColumnSpecs_in_setclause302);
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
            // 134:26: -> ^( SET updateColumnSpecs )
            {
                // OracleParser.g:134:28: ^( SET updateColumnSpecs )
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
    // OracleParser.g:137:1: updateColumnSpecs : updateColumnSpec ( COMMA updateColumnSpec )* -> ( ^( SET_ELE updateColumnSpec ) )+ ;
    public final OracleParserParser.updateColumnSpecs_return updateColumnSpecs() throws RecognitionException {
        OracleParserParser.updateColumnSpecs_return retval = new OracleParserParser.updateColumnSpecs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA9=null;
        OracleParserParser.updateColumnSpec_return updateColumnSpec8 = null;

        OracleParserParser.updateColumnSpec_return updateColumnSpec10 = null;


        CommonTree COMMA9_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_updateColumnSpec=new RewriteRuleSubtreeStream(adaptor,"rule updateColumnSpec");
        try {
            // OracleParser.g:138:2: ( updateColumnSpec ( COMMA updateColumnSpec )* -> ( ^( SET_ELE updateColumnSpec ) )+ )
            // OracleParser.g:138:3: updateColumnSpec ( COMMA updateColumnSpec )*
            {
            pushFollow(FOLLOW_updateColumnSpec_in_updateColumnSpecs319);
            updateColumnSpec8=updateColumnSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_updateColumnSpec.add(updateColumnSpec8.getTree());
            // OracleParser.g:138:20: ( COMMA updateColumnSpec )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==COMMA) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // OracleParser.g:138:21: COMMA updateColumnSpec
            	    {
            	    COMMA9=(Token)match(input,COMMA,FOLLOW_COMMA_in_updateColumnSpecs322); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA9);

            	    pushFollow(FOLLOW_updateColumnSpec_in_updateColumnSpecs324);
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
            // 138:45: -> ( ^( SET_ELE updateColumnSpec ) )+
            {
                if ( !(stream_updateColumnSpec.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_updateColumnSpec.hasNext() ) {
                    // OracleParser.g:138:47: ^( SET_ELE updateColumnSpec )
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
    // OracleParser.g:140:1: updateColumnSpec : columnNameInUpdate EQ expr ;
    public final OracleParserParser.updateColumnSpec_return updateColumnSpec() throws RecognitionException {
        OracleParserParser.updateColumnSpec_return retval = new OracleParserParser.updateColumnSpec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQ12=null;
        OracleParserParser.columnNameInUpdate_return columnNameInUpdate11 = null;

        OracleParserParser.expr_return expr13 = null;


        CommonTree EQ12_tree=null;

        try {
            // OracleParser.g:141:2: ( columnNameInUpdate EQ expr )
            // OracleParser.g:141:3: columnNameInUpdate EQ expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_columnNameInUpdate_in_updateColumnSpec342);
            columnNameInUpdate11=columnNameInUpdate();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, columnNameInUpdate11.getTree());
            EQ12=(Token)match(input,EQ,FOLLOW_EQ_in_updateColumnSpec344); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ12_tree = (CommonTree)adaptor.create(EQ12);
            root_0 = (CommonTree)adaptor.becomeRoot(EQ12_tree, root_0);
            }
            pushFollow(FOLLOW_expr_in_updateColumnSpec347);
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

    public static class groupByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "groupByClause"
    // OracleParser.g:144:1: groupByClause : 'GRUOP' 'BY' columnNamesAfterWhere -> ^( GROUPBY columnNamesAfterWhere ) ;
    public final OracleParserParser.groupByClause_return groupByClause() throws RecognitionException {
        OracleParserParser.groupByClause_return retval = new OracleParserParser.groupByClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal14=null;
        Token string_literal15=null;
        OracleParserParser.columnNamesAfterWhere_return columnNamesAfterWhere16 = null;


        CommonTree string_literal14_tree=null;
        CommonTree string_literal15_tree=null;
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_columnNamesAfterWhere=new RewriteRuleSubtreeStream(adaptor,"rule columnNamesAfterWhere");
        try {
            // OracleParser.g:145:2: ( 'GRUOP' 'BY' columnNamesAfterWhere -> ^( GROUPBY columnNamesAfterWhere ) )
            // OracleParser.g:145:3: 'GRUOP' 'BY' columnNamesAfterWhere
            {
            string_literal14=(Token)match(input,86,FOLLOW_86_in_groupByClause357); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_86.add(string_literal14);

            string_literal15=(Token)match(input,87,FOLLOW_87_in_groupByClause359); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_87.add(string_literal15);

            pushFollow(FOLLOW_columnNamesAfterWhere_in_groupByClause361);
            columnNamesAfterWhere16=columnNamesAfterWhere();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnNamesAfterWhere.add(columnNamesAfterWhere16.getTree());


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
            // 145:37: -> ^( GROUPBY columnNamesAfterWhere )
            {
                // OracleParser.g:145:39: ^( GROUPBY columnNamesAfterWhere )
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
    // OracleParser.g:147:1: orderByClause : 'ORDER' 'BY' columnNamesAfterWhere -> ^( ORDERBY columnNamesAfterWhere ) ;
    public final OracleParserParser.orderByClause_return orderByClause() throws RecognitionException {
        OracleParserParser.orderByClause_return retval = new OracleParserParser.orderByClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal17=null;
        Token string_literal18=null;
        OracleParserParser.columnNamesAfterWhere_return columnNamesAfterWhere19 = null;


        CommonTree string_literal17_tree=null;
        CommonTree string_literal18_tree=null;
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleSubtreeStream stream_columnNamesAfterWhere=new RewriteRuleSubtreeStream(adaptor,"rule columnNamesAfterWhere");
        try {
            // OracleParser.g:148:2: ( 'ORDER' 'BY' columnNamesAfterWhere -> ^( ORDERBY columnNamesAfterWhere ) )
            // OracleParser.g:148:3: 'ORDER' 'BY' columnNamesAfterWhere
            {
            string_literal17=(Token)match(input,88,FOLLOW_88_in_orderByClause380); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_88.add(string_literal17);

            string_literal18=(Token)match(input,87,FOLLOW_87_in_orderByClause382); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_87.add(string_literal18);

            pushFollow(FOLLOW_columnNamesAfterWhere_in_orderByClause384);
            columnNamesAfterWhere19=columnNamesAfterWhere();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnNamesAfterWhere.add(columnNamesAfterWhere19.getTree());


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
            // 148:37: -> ^( ORDERBY columnNamesAfterWhere )
            {
                // OracleParser.g:148:39: ^( ORDERBY columnNamesAfterWhere )
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
    // OracleParser.g:152:1: columnNamesAfterWhere : columnNameAfterWhere ( COMMA columnNameAfterWhere )* ;
    public final OracleParserParser.columnNamesAfterWhere_return columnNamesAfterWhere() throws RecognitionException {
        OracleParserParser.columnNamesAfterWhere_return retval = new OracleParserParser.columnNamesAfterWhere_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA21=null;
        OracleParserParser.columnNameAfterWhere_return columnNameAfterWhere20 = null;

        OracleParserParser.columnNameAfterWhere_return columnNameAfterWhere22 = null;


        CommonTree COMMA21_tree=null;

        try {
            // OracleParser.g:153:5: ( columnNameAfterWhere ( COMMA columnNameAfterWhere )* )
            // OracleParser.g:153:6: columnNameAfterWhere ( COMMA columnNameAfterWhere )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_columnNameAfterWhere_in_columnNamesAfterWhere404);
            columnNameAfterWhere20=columnNameAfterWhere();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, columnNameAfterWhere20.getTree());
            // OracleParser.g:153:27: ( COMMA columnNameAfterWhere )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==COMMA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // OracleParser.g:153:28: COMMA columnNameAfterWhere
            	    {
            	    COMMA21=(Token)match(input,COMMA,FOLLOW_COMMA_in_columnNamesAfterWhere407); if (state.failed) return retval;
            	    pushFollow(FOLLOW_columnNameAfterWhere_in_columnNamesAfterWhere410);
            	    columnNameAfterWhere22=columnNameAfterWhere();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, columnNameAfterWhere22.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
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

    public static class whereClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whereClause"
    // OracleParser.g:156:1: whereClause : 'WHERE' sqlCondition -> ^( WHERE sqlCondition ) ;
    public final OracleParserParser.whereClause_return whereClause() throws RecognitionException {
        OracleParserParser.whereClause_return retval = new OracleParserParser.whereClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal23=null;
        OracleParserParser.sqlCondition_return sqlCondition24 = null;


        CommonTree string_literal23_tree=null;
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_sqlCondition=new RewriteRuleSubtreeStream(adaptor,"rule sqlCondition");
        try {
            // OracleParser.g:157:2: ( 'WHERE' sqlCondition -> ^( WHERE sqlCondition ) )
            // OracleParser.g:157:3: 'WHERE' sqlCondition
            {
            string_literal23=(Token)match(input,89,FOLLOW_89_in_whereClause426); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_89.add(string_literal23);

            pushFollow(FOLLOW_sqlCondition_in_whereClause428);
            sqlCondition24=sqlCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlCondition.add(sqlCondition24.getTree());


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
            // 157:23: -> ^( WHERE sqlCondition )
            {
                // OracleParser.g:157:25: ^( WHERE sqlCondition )
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
    // OracleParser.g:160:1: sqlCondition : ( 'NOT' condition_or -> ^( CONDITION_OR_NOT condition_or ) | condition_or -> ^( CONDITION_OR condition_or ) );
    public final OracleParserParser.sqlCondition_return sqlCondition() throws RecognitionException {
        OracleParserParser.sqlCondition_return retval = new OracleParserParser.sqlCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal25=null;
        OracleParserParser.condition_or_return condition_or26 = null;

        OracleParserParser.condition_or_return condition_or27 = null;


        CommonTree string_literal25_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_condition_or=new RewriteRuleSubtreeStream(adaptor,"rule condition_or");
        try {
            // OracleParser.g:161:2: ( 'NOT' condition_or -> ^( CONDITION_OR_NOT condition_or ) | condition_or -> ^( CONDITION_OR condition_or ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==90) ) {
                alt4=1;
            }
            else if ( (LA4_0==LPAREN||LA4_0==ID||(LA4_0>=PLUS && LA4_0<=ASTERISK)||(LA4_0>=N && LA4_0<=NUMBER)||LA4_0==QUOTED_STRING||LA4_0==97||(LA4_0>=100 && LA4_0<=101)||(LA4_0>=104 && LA4_0<=105)) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // OracleParser.g:161:3: 'NOT' condition_or
                    {
                    string_literal25=(Token)match(input,90,FOLLOW_90_in_sqlCondition444); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_90.add(string_literal25);

                    pushFollow(FOLLOW_condition_or_in_sqlCondition446);
                    condition_or26=condition_or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condition_or.add(condition_or26.getTree());


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
                    // 161:21: -> ^( CONDITION_OR_NOT condition_or )
                    {
                        // OracleParser.g:161:23: ^( CONDITION_OR_NOT condition_or )
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
                    // OracleParser.g:162:3: condition_or
                    {
                    pushFollow(FOLLOW_condition_or_in_sqlCondition457);
                    condition_or27=condition_or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condition_or.add(condition_or27.getTree());


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
                    // 162:16: -> ^( CONDITION_OR condition_or )
                    {
                        // OracleParser.g:162:18: ^( CONDITION_OR condition_or )
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
    // OracleParser.g:166:1: condition_or : condition_and ( 'OR' condition_and )* ;
    public final OracleParserParser.condition_or_return condition_or() throws RecognitionException {
        OracleParserParser.condition_or_return retval = new OracleParserParser.condition_or_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal29=null;
        OracleParserParser.condition_and_return condition_and28 = null;

        OracleParserParser.condition_and_return condition_and30 = null;


        CommonTree string_literal29_tree=null;

        try {
            // OracleParser.g:167:2: ( condition_and ( 'OR' condition_and )* )
            // OracleParser.g:167:3: condition_and ( 'OR' condition_and )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_condition_and_in_condition_or475);
            condition_and28=condition_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condition_and28.getTree());
            // OracleParser.g:167:17: ( 'OR' condition_and )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==91) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // OracleParser.g:167:19: 'OR' condition_and
            	    {
            	    string_literal29=(Token)match(input,91,FOLLOW_91_in_condition_or479); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal29_tree = (CommonTree)adaptor.create(string_literal29);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal29_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_condition_and_in_condition_or482);
            	    condition_and30=condition_and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, condition_and30.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // OracleParser.g:170:1: condition_and : condition_PAREN ( 'AND' condition_PAREN )* ;
    public final OracleParserParser.condition_and_return condition_and() throws RecognitionException {
        OracleParserParser.condition_and_return retval = new OracleParserParser.condition_and_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal32=null;
        OracleParserParser.condition_PAREN_return condition_PAREN31 = null;

        OracleParserParser.condition_PAREN_return condition_PAREN33 = null;


        CommonTree string_literal32_tree=null;

        try {
            // OracleParser.g:171:2: ( condition_PAREN ( 'AND' condition_PAREN )* )
            // OracleParser.g:171:3: condition_PAREN ( 'AND' condition_PAREN )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_condition_PAREN_in_condition_and495);
            condition_PAREN31=condition_PAREN();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condition_PAREN31.getTree());
            // OracleParser.g:171:19: ( 'AND' condition_PAREN )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==92) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // OracleParser.g:171:21: 'AND' condition_PAREN
            	    {
            	    string_literal32=(Token)match(input,92,FOLLOW_92_in_condition_and499); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal32_tree = (CommonTree)adaptor.create(string_literal32);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal32_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_condition_PAREN_in_condition_and502);
            	    condition_PAREN33=condition_PAREN();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, condition_PAREN33.getTree());

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
    // $ANTLR end "condition_and"

    public static class condition_PAREN_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition_PAREN"
    // OracleParser.g:173:1: condition_PAREN : ( ( LPAREN condition_or RPAREN )=> LPAREN condition_or RPAREN -> ^( PRIORITY condition_or ) | condition_expr );
    public final OracleParserParser.condition_PAREN_return condition_PAREN() throws RecognitionException {
        OracleParserParser.condition_PAREN_return retval = new OracleParserParser.condition_PAREN_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN34=null;
        Token RPAREN36=null;
        OracleParserParser.condition_or_return condition_or35 = null;

        OracleParserParser.condition_expr_return condition_expr37 = null;


        CommonTree LPAREN34_tree=null;
        CommonTree RPAREN36_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_condition_or=new RewriteRuleSubtreeStream(adaptor,"rule condition_or");
        try {
            // OracleParser.g:174:2: ( ( LPAREN condition_or RPAREN )=> LPAREN condition_or RPAREN -> ^( PRIORITY condition_or ) | condition_expr )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // OracleParser.g:174:3: ( LPAREN condition_or RPAREN )=> LPAREN condition_or RPAREN
                    {
                    LPAREN34=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_condition_PAREN522); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN34);

                    pushFollow(FOLLOW_condition_or_in_condition_PAREN524);
                    condition_or35=condition_or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condition_or.add(condition_or35.getTree());
                    RPAREN36=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_condition_PAREN526); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN36);



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
                    // 174:59: -> ^( PRIORITY condition_or )
                    {
                        // OracleParser.g:174:61: ^( PRIORITY condition_or )
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
                    // OracleParser.g:175:3: condition_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_condition_expr_in_condition_PAREN536);
                    condition_expr37=condition_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, condition_expr37.getTree());

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
    // OracleParser.g:177:1: condition_expr : condition_left ( comparisonCondition | inCondition | isCondition | likeCondition | betweenCondition ) ;
    public final OracleParserParser.condition_expr_return condition_expr() throws RecognitionException {
        OracleParserParser.condition_expr_return retval = new OracleParserParser.condition_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        OracleParserParser.condition_left_return condition_left38 = null;

        OracleParserParser.comparisonCondition_return comparisonCondition39 = null;

        OracleParserParser.inCondition_return inCondition40 = null;

        OracleParserParser.isCondition_return isCondition41 = null;

        OracleParserParser.likeCondition_return likeCondition42 = null;

        OracleParserParser.betweenCondition_return betweenCondition43 = null;



        try {
            // OracleParser.g:178:2: ( condition_left ( comparisonCondition | inCondition | isCondition | likeCondition | betweenCondition ) )
            // OracleParser.g:178:4: condition_left ( comparisonCondition | inCondition | isCondition | likeCondition | betweenCondition )
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_condition_left_in_condition_expr546);
            condition_left38=condition_left();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(condition_left38.getTree(), root_0);
            // OracleParser.g:179:2: ( comparisonCondition | inCondition | isCondition | likeCondition | betweenCondition )
            int alt8=5;
            switch ( input.LA(1) ) {
            case EQ:
            case LTH:
            case GTH:
            case NOT_EQ:
            case LEQ:
            case GEQ:
                {
                alt8=1;
                }
                break;
            case 90:
                {
                switch ( input.LA(2) ) {
                case 99:
                    {
                    alt8=4;
                    }
                    break;
                case 93:
                    {
                    alt8=5;
                    }
                    break;
                case 98:
                    {
                    alt8=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }

                }
                break;
            case 98:
                {
                alt8=2;
                }
                break;
            case 94:
                {
                alt8=3;
                }
                break;
            case 99:
                {
                alt8=4;
                }
                break;
            case 93:
                {
                alt8=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // OracleParser.g:179:3: comparisonCondition
                    {
                    pushFollow(FOLLOW_comparisonCondition_in_condition_expr551);
                    comparisonCondition39=comparisonCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(comparisonCondition39.getTree(), root_0);

                    }
                    break;
                case 2 :
                    // OracleParser.g:180:4: inCondition
                    {
                    pushFollow(FOLLOW_inCondition_in_condition_expr557);
                    inCondition40=inCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(inCondition40.getTree(), root_0);

                    }
                    break;
                case 3 :
                    // OracleParser.g:181:4: isCondition
                    {
                    pushFollow(FOLLOW_isCondition_in_condition_expr563);
                    isCondition41=isCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(isCondition41.getTree(), root_0);

                    }
                    break;
                case 4 :
                    // OracleParser.g:182:4: likeCondition
                    {
                    pushFollow(FOLLOW_likeCondition_in_condition_expr570);
                    likeCondition42=likeCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(likeCondition42.getTree(), root_0);

                    }
                    break;
                case 5 :
                    // OracleParser.g:183:4: betweenCondition
                    {
                    pushFollow(FOLLOW_betweenCondition_in_condition_expr576);
                    betweenCondition43=betweenCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(betweenCondition43.getTree(), root_0);

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
    // OracleParser.g:186:1: condition_left : expr -> ^( CONDITION_LEFT expr ) ;
    public final OracleParserParser.condition_left_return condition_left() throws RecognitionException {
        OracleParserParser.condition_left_return retval = new OracleParserParser.condition_left_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        OracleParserParser.expr_return expr44 = null;


        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // OracleParser.g:187:2: ( expr -> ^( CONDITION_LEFT expr ) )
            // OracleParser.g:187:3: expr
            {
            pushFollow(FOLLOW_expr_in_condition_left590);
            expr44=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr44.getTree());


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
            // 187:7: -> ^( CONDITION_LEFT expr )
            {
                // OracleParser.g:187:9: ^( CONDITION_LEFT expr )
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
    // OracleParser.g:189:1: betweenCondition : ( 'NOT' 'BETWEEN' between_and -> ^( NOT_BETWEEN between_and ) | 'BETWEEN' between_and -> ^( BETWEEN between_and ) );
    public final OracleParserParser.betweenCondition_return betweenCondition() throws RecognitionException {
        OracleParserParser.betweenCondition_return retval = new OracleParserParser.betweenCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal45=null;
        Token string_literal46=null;
        Token string_literal48=null;
        OracleParserParser.between_and_return between_and47 = null;

        OracleParserParser.between_and_return between_and49 = null;


        CommonTree string_literal45_tree=null;
        CommonTree string_literal46_tree=null;
        CommonTree string_literal48_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_between_and=new RewriteRuleSubtreeStream(adaptor,"rule between_and");
        try {
            // OracleParser.g:190:2: ( 'NOT' 'BETWEEN' between_and -> ^( NOT_BETWEEN between_and ) | 'BETWEEN' between_and -> ^( BETWEEN between_and ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==90) ) {
                alt9=1;
            }
            else if ( (LA9_0==93) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // OracleParser.g:190:4: 'NOT' 'BETWEEN' between_and
                    {
                    string_literal45=(Token)match(input,90,FOLLOW_90_in_betweenCondition606); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_90.add(string_literal45);

                    string_literal46=(Token)match(input,93,FOLLOW_93_in_betweenCondition608); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(string_literal46);

                    pushFollow(FOLLOW_between_and_in_betweenCondition610);
                    between_and47=between_and();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_between_and.add(between_and47.getTree());


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
                    // 190:31: -> ^( NOT_BETWEEN between_and )
                    {
                        // OracleParser.g:190:33: ^( NOT_BETWEEN between_and )
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
                    // OracleParser.g:191:4: 'BETWEEN' between_and
                    {
                    string_literal48=(Token)match(input,93,FOLLOW_93_in_betweenCondition621); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(string_literal48);

                    pushFollow(FOLLOW_between_and_in_betweenCondition623);
                    between_and49=between_and();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_between_and.add(between_and49.getTree());


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
                    // 191:25: -> ^( BETWEEN between_and )
                    {
                        // OracleParser.g:191:27: ^( BETWEEN between_and )
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
    // OracleParser.g:194:1: between_and : between_and_expression 'AND' between_and_expression ;
    public final OracleParserParser.between_and_return between_and() throws RecognitionException {
        OracleParserParser.between_and_return retval = new OracleParserParser.between_and_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal51=null;
        OracleParserParser.between_and_expression_return between_and_expression50 = null;

        OracleParserParser.between_and_expression_return between_and_expression52 = null;


        CommonTree string_literal51_tree=null;

        try {
            // OracleParser.g:195:2: ( between_and_expression 'AND' between_and_expression )
            // OracleParser.g:195:3: between_and_expression 'AND' between_and_expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_between_and_expression_in_between_and640);
            between_and_expression50=between_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, between_and_expression50.getTree());
            string_literal51=(Token)match(input,92,FOLLOW_92_in_between_and642); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal51_tree = (CommonTree)adaptor.create(string_literal51);
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal51_tree, root_0);
            }
            pushFollow(FOLLOW_between_and_expression_in_between_and645);
            between_and_expression52=between_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, between_and_expression52.getTree());

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
    // OracleParser.g:198:1: between_and_expression : expr_bit ;
    public final OracleParserParser.between_and_expression_return between_and_expression() throws RecognitionException {
        OracleParserParser.between_and_expression_return retval = new OracleParserParser.between_and_expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        OracleParserParser.expr_bit_return expr_bit53 = null;



        try {
            // OracleParser.g:199:2: ( expr_bit )
            // OracleParser.g:199:3: expr_bit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_bit_in_between_and_expression657);
            expr_bit53=expr_bit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_bit53.getTree());

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
    // OracleParser.g:202:1: isCondition : ( 'IS' 'NOT' condition_is_valobject -> ^( ISNOT condition_is_valobject ) | 'IS' condition_is_valobject -> ^( IS condition_is_valobject ) );
    public final OracleParserParser.isCondition_return isCondition() throws RecognitionException {
        OracleParserParser.isCondition_return retval = new OracleParserParser.isCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal54=null;
        Token string_literal55=null;
        Token string_literal57=null;
        OracleParserParser.condition_is_valobject_return condition_is_valobject56 = null;

        OracleParserParser.condition_is_valobject_return condition_is_valobject58 = null;


        CommonTree string_literal54_tree=null;
        CommonTree string_literal55_tree=null;
        CommonTree string_literal57_tree=null;
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_condition_is_valobject=new RewriteRuleSubtreeStream(adaptor,"rule condition_is_valobject");
        try {
            // OracleParser.g:203:2: ( 'IS' 'NOT' condition_is_valobject -> ^( ISNOT condition_is_valobject ) | 'IS' condition_is_valobject -> ^( IS condition_is_valobject ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==94) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==90) ) {
                    alt10=1;
                }
                else if ( ((LA10_1>=95 && LA10_1<=97)) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // OracleParser.g:203:4: 'IS' 'NOT' condition_is_valobject
                    {
                    string_literal54=(Token)match(input,94,FOLLOW_94_in_isCondition669); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_94.add(string_literal54);

                    string_literal55=(Token)match(input,90,FOLLOW_90_in_isCondition671); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_90.add(string_literal55);

                    pushFollow(FOLLOW_condition_is_valobject_in_isCondition673);
                    condition_is_valobject56=condition_is_valobject();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condition_is_valobject.add(condition_is_valobject56.getTree());


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
                    // 203:37: -> ^( ISNOT condition_is_valobject )
                    {
                        // OracleParser.g:203:39: ^( ISNOT condition_is_valobject )
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
                    // OracleParser.g:204:3: 'IS' condition_is_valobject
                    {
                    string_literal57=(Token)match(input,94,FOLLOW_94_in_isCondition683); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_94.add(string_literal57);

                    pushFollow(FOLLOW_condition_is_valobject_in_isCondition685);
                    condition_is_valobject58=condition_is_valobject();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condition_is_valobject.add(condition_is_valobject58.getTree());


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
                    // 204:30: -> ^( IS condition_is_valobject )
                    {
                        // OracleParser.g:204:32: ^( IS condition_is_valobject )
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
    // OracleParser.g:208:1: condition_is_valobject : ( 'NAN' -> NAN | 'INFINITE' -> INFINITE | 'NULL' -> NULL );
    public final OracleParserParser.condition_is_valobject_return condition_is_valobject() throws RecognitionException {
        OracleParserParser.condition_is_valobject_return retval = new OracleParserParser.condition_is_valobject_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal59=null;
        Token string_literal60=null;
        Token string_literal61=null;

        CommonTree string_literal59_tree=null;
        CommonTree string_literal60_tree=null;
        CommonTree string_literal61_tree=null;
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");

        try {
            // OracleParser.g:209:2: ( 'NAN' -> NAN | 'INFINITE' -> INFINITE | 'NULL' -> NULL )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt11=1;
                }
                break;
            case 96:
                {
                alt11=2;
                }
                break;
            case 97:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // OracleParser.g:209:4: 'NAN'
                    {
                    string_literal59=(Token)match(input,95,FOLLOW_95_in_condition_is_valobject703); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_95.add(string_literal59);



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
                    // 209:10: -> NAN
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NAN, "NAN"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // OracleParser.g:210:4: 'INFINITE'
                    {
                    string_literal60=(Token)match(input,96,FOLLOW_96_in_condition_is_valobject711); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(string_literal60);



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
                    // 210:15: -> INFINITE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(INFINITE, "INFINITE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // OracleParser.g:211:4: 'NULL'
                    {
                    string_literal61=(Token)match(input,97,FOLLOW_97_in_condition_is_valobject719); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_97.add(string_literal61);



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
                    // 211:11: -> NULL
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
    // OracleParser.g:214:1: inCondition : (not= 'NOT' )? 'IN' ( subquery | ( LPAREN inCondition_expr_bits RPAREN ) ) -> ^( IN ( $not)? ( subquery )? ( inCondition_expr_bits )? ) ;
    public final OracleParserParser.inCondition_return inCondition() throws RecognitionException {
        OracleParserParser.inCondition_return retval = new OracleParserParser.inCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token not=null;
        Token string_literal62=null;
        Token LPAREN64=null;
        Token RPAREN66=null;
        OracleParserParser.subquery_return subquery63 = null;

        OracleParserParser.inCondition_expr_bits_return inCondition_expr_bits65 = null;


        CommonTree not_tree=null;
        CommonTree string_literal62_tree=null;
        CommonTree LPAREN64_tree=null;
        CommonTree RPAREN66_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_inCondition_expr_bits=new RewriteRuleSubtreeStream(adaptor,"rule inCondition_expr_bits");
        RewriteRuleSubtreeStream stream_subquery=new RewriteRuleSubtreeStream(adaptor,"rule subquery");
        try {
            // OracleParser.g:215:2: ( (not= 'NOT' )? 'IN' ( subquery | ( LPAREN inCondition_expr_bits RPAREN ) ) -> ^( IN ( $not)? ( subquery )? ( inCondition_expr_bits )? ) )
            // OracleParser.g:215:3: (not= 'NOT' )? 'IN' ( subquery | ( LPAREN inCondition_expr_bits RPAREN ) )
            {
            // OracleParser.g:215:3: (not= 'NOT' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==90) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // OracleParser.g:215:4: not= 'NOT'
                    {
                    not=(Token)match(input,90,FOLLOW_90_in_inCondition735); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_90.add(not);


                    }
                    break;

            }

            string_literal62=(Token)match(input,98,FOLLOW_98_in_inCondition739); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_98.add(string_literal62);

            // OracleParser.g:215:21: ( subquery | ( LPAREN inCondition_expr_bits RPAREN ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LPAREN) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==106) ) {
                    alt13=1;
                }
                else if ( (LA13_1==LPAREN||LA13_1==ID||(LA13_1>=PLUS && LA13_1<=ASTERISK)||(LA13_1>=N && LA13_1<=NUMBER)||LA13_1==QUOTED_STRING||LA13_1==97||(LA13_1>=100 && LA13_1<=101)||(LA13_1>=104 && LA13_1<=105)) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // OracleParser.g:215:23: subquery
                    {
                    pushFollow(FOLLOW_subquery_in_inCondition743);
                    subquery63=subquery();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_subquery.add(subquery63.getTree());

                    }
                    break;
                case 2 :
                    // OracleParser.g:216:3: ( LPAREN inCondition_expr_bits RPAREN )
                    {
                    // OracleParser.g:216:3: ( LPAREN inCondition_expr_bits RPAREN )
                    // OracleParser.g:216:5: LPAREN inCondition_expr_bits RPAREN
                    {
                    LPAREN64=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_inCondition749); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN64);

                    pushFollow(FOLLOW_inCondition_expr_bits_in_inCondition751);
                    inCondition_expr_bits65=inCondition_expr_bits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inCondition_expr_bits.add(inCondition_expr_bits65.getTree());
                    RPAREN66=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_inCondition753); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN66);


                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: not, inCondition_expr_bits, subquery
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
            // 216:42: -> ^( IN ( $not)? ( subquery )? ( inCondition_expr_bits )? )
            {
                // OracleParser.g:216:44: ^( IN ( $not)? ( subquery )? ( inCondition_expr_bits )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IN, "IN"), root_1);

                // OracleParser.g:216:49: ( $not)?
                if ( stream_not.hasNext() ) {
                    adaptor.addChild(root_1, stream_not.nextNode());

                }
                stream_not.reset();
                // OracleParser.g:216:55: ( subquery )?
                if ( stream_subquery.hasNext() ) {
                    adaptor.addChild(root_1, stream_subquery.nextTree());

                }
                stream_subquery.reset();
                // OracleParser.g:216:65: ( inCondition_expr_bits )?
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
    // OracleParser.g:220:1: likeCondition : ( 'NOT' 'LIKE' like_value -> ^( NOT_LIKE like_value ) | 'LIKE' like_value -> ^( LIKE like_value ) );
    public final OracleParserParser.likeCondition_return likeCondition() throws RecognitionException {
        OracleParserParser.likeCondition_return retval = new OracleParserParser.likeCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal67=null;
        Token string_literal68=null;
        Token string_literal70=null;
        OracleParserParser.like_value_return like_value69 = null;

        OracleParserParser.like_value_return like_value71 = null;


        CommonTree string_literal67_tree=null;
        CommonTree string_literal68_tree=null;
        CommonTree string_literal70_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleSubtreeStream stream_like_value=new RewriteRuleSubtreeStream(adaptor,"rule like_value");
        try {
            // OracleParser.g:221:2: ( 'NOT' 'LIKE' like_value -> ^( NOT_LIKE like_value ) | 'LIKE' like_value -> ^( LIKE like_value ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==90) ) {
                alt14=1;
            }
            else if ( (LA14_0==99) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // OracleParser.g:221:3: 'NOT' 'LIKE' like_value
                    {
                    string_literal67=(Token)match(input,90,FOLLOW_90_in_likeCondition780); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_90.add(string_literal67);

                    string_literal68=(Token)match(input,99,FOLLOW_99_in_likeCondition781); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_99.add(string_literal68);

                    pushFollow(FOLLOW_like_value_in_likeCondition784);
                    like_value69=like_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_like_value.add(like_value69.getTree());


                    // AST REWRITE
                    // elements: like_value
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 221:26: -> ^( NOT_LIKE like_value )
                    {
                        // OracleParser.g:221:28: ^( NOT_LIKE like_value )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NOT_LIKE, "NOT_LIKE"), root_1);

                        adaptor.addChild(root_1, stream_like_value.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // OracleParser.g:222:3: 'LIKE' like_value
                    {
                    string_literal70=(Token)match(input,99,FOLLOW_99_in_likeCondition794); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_99.add(string_literal70);

                    pushFollow(FOLLOW_like_value_in_likeCondition796);
                    like_value71=like_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_like_value.add(like_value71.getTree());


                    // AST REWRITE
                    // elements: like_value
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 222:20: -> ^( LIKE like_value )
                    {
                        // OracleParser.g:222:22: ^( LIKE like_value )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIKE, "LIKE"), root_1);

                        adaptor.addChild(root_1, stream_like_value.nextTree());

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

    public static class like_value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "like_value"
    // OracleParser.g:225:1: like_value : ( single_concat_value | multi_concat_values -> ^( MULTI_STR multi_concat_values ) );
    public final OracleParserParser.like_value_return like_value() throws RecognitionException {
        OracleParserParser.like_value_return retval = new OracleParserParser.like_value_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        OracleParserParser.single_concat_value_return single_concat_value72 = null;

        OracleParserParser.multi_concat_values_return multi_concat_values73 = null;


        RewriteRuleSubtreeStream stream_multi_concat_values=new RewriteRuleSubtreeStream(adaptor,"rule multi_concat_values");
        try {
            // OracleParser.g:226:2: ( single_concat_value | multi_concat_values -> ^( MULTI_STR multi_concat_values ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==QUOTED_STRING||LA15_0==100) ) {
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
                    // OracleParser.g:226:4: single_concat_value
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_single_concat_value_in_like_value814);
                    single_concat_value72=single_concat_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, single_concat_value72.getTree());

                    }
                    break;
                case 2 :
                    // OracleParser.g:227:4: multi_concat_values
                    {
                    pushFollow(FOLLOW_multi_concat_values_in_like_value819);
                    multi_concat_values73=multi_concat_values();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_multi_concat_values.add(multi_concat_values73.getTree());


                    // AST REWRITE
                    // elements: multi_concat_values
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 227:23: -> ^( MULTI_STR multi_concat_values )
                    {
                        // OracleParser.g:227:25: ^( MULTI_STR multi_concat_values )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MULTI_STR, "MULTI_STR"), root_1);

                        adaptor.addChild(root_1, stream_multi_concat_values.nextTree());

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
    // $ANTLR end "like_value"

    public static class concat_values_func_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "concat_values_func"
    // OracleParser.g:230:1: concat_values_func : ( lu_value COMMA lu_value | single_concat_value COMMA lu_value | lu_value COMMA single_concat_value );
    public final OracleParserParser.concat_values_func_return concat_values_func() throws RecognitionException {
        OracleParserParser.concat_values_func_return retval = new OracleParserParser.concat_values_func_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA75=null;
        Token COMMA78=null;
        Token COMMA81=null;
        OracleParserParser.lu_value_return lu_value74 = null;

        OracleParserParser.lu_value_return lu_value76 = null;

        OracleParserParser.single_concat_value_return single_concat_value77 = null;

        OracleParserParser.lu_value_return lu_value79 = null;

        OracleParserParser.lu_value_return lu_value80 = null;

        OracleParserParser.single_concat_value_return single_concat_value82 = null;


        CommonTree COMMA75_tree=null;
        CommonTree COMMA78_tree=null;
        CommonTree COMMA81_tree=null;

        try {
            // OracleParser.g:231:2: ( lu_value COMMA lu_value | single_concat_value COMMA lu_value | lu_value COMMA single_concat_value )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 100:
                {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==COMMA) ) {
                    int LA16_4 = input.LA(3);

                    if ( (LA16_4==QUOTED_STRING||LA16_4==100) ) {
                        alt16=1;
                    }
                    else if ( (LA16_4==ID) ) {
                        alt16=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
                }
                break;
            case QUOTED_STRING:
                {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==COMMA) ) {
                    int LA16_4 = input.LA(3);

                    if ( (LA16_4==QUOTED_STRING||LA16_4==100) ) {
                        alt16=1;
                    }
                    else if ( (LA16_4==ID) ) {
                        alt16=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                alt16=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // OracleParser.g:231:3: lu_value COMMA lu_value
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lu_value_in_concat_values_func836);
                    lu_value74=lu_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lu_value74.getTree());
                    COMMA75=(Token)match(input,COMMA,FOLLOW_COMMA_in_concat_values_func838); if (state.failed) return retval;
                    pushFollow(FOLLOW_lu_value_in_concat_values_func841);
                    lu_value76=lu_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lu_value76.getTree());

                    }
                    break;
                case 2 :
                    // OracleParser.g:232:3: single_concat_value COMMA lu_value
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_single_concat_value_in_concat_values_func845);
                    single_concat_value77=single_concat_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, single_concat_value77.getTree());
                    COMMA78=(Token)match(input,COMMA,FOLLOW_COMMA_in_concat_values_func847); if (state.failed) return retval;
                    pushFollow(FOLLOW_lu_value_in_concat_values_func850);
                    lu_value79=lu_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lu_value79.getTree());

                    }
                    break;
                case 3 :
                    // OracleParser.g:233:3: lu_value COMMA single_concat_value
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lu_value_in_concat_values_func854);
                    lu_value80=lu_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lu_value80.getTree());
                    COMMA81=(Token)match(input,COMMA,FOLLOW_COMMA_in_concat_values_func856); if (state.failed) return retval;
                    pushFollow(FOLLOW_single_concat_value_in_concat_values_func859);
                    single_concat_value82=single_concat_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, single_concat_value82.getTree());

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
    // $ANTLR end "concat_values_func"

    public static class single_concat_value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "single_concat_value"
    // OracleParser.g:236:1: single_concat_value : {...}? ID ( LPAREN ( concat_values_func )? RPAREN ) -> ^( ID ( concat_values_func )? ) ;
    public final OracleParserParser.single_concat_value_return single_concat_value() throws RecognitionException {
        OracleParserParser.single_concat_value_return retval = new OracleParserParser.single_concat_value_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID83=null;
        Token LPAREN84=null;
        Token RPAREN86=null;
        OracleParserParser.concat_values_func_return concat_values_func85 = null;


        CommonTree ID83_tree=null;
        CommonTree LPAREN84_tree=null;
        CommonTree RPAREN86_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_concat_values_func=new RewriteRuleSubtreeStream(adaptor,"rule concat_values_func");
        try {
            // OracleParser.g:237:2: ({...}? ID ( LPAREN ( concat_values_func )? RPAREN ) -> ^( ID ( concat_values_func )? ) )
            // OracleParser.g:237:3: {...}? ID ( LPAREN ( concat_values_func )? RPAREN )
            {
            if ( !((functionMap.containsKey(input.LT(1).getText().toUpperCase()))) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "single_concat_value", "functionMap.containsKey(input.LT(1).getText().toUpperCase())");
            }
            ID83=(Token)match(input,ID,FOLLOW_ID_in_single_concat_value872); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID83);

            // OracleParser.g:237:70: ( LPAREN ( concat_values_func )? RPAREN )
            // OracleParser.g:237:71: LPAREN ( concat_values_func )? RPAREN
            {
            LPAREN84=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_concat_value875); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN84);

            // OracleParser.g:237:78: ( concat_values_func )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID||LA17_0==QUOTED_STRING||LA17_0==100) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // OracleParser.g:237:78: concat_values_func
                    {
                    pushFollow(FOLLOW_concat_values_func_in_single_concat_value877);
                    concat_values_func85=concat_values_func();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_concat_values_func.add(concat_values_func85.getTree());

                    }
                    break;

            }

            RPAREN86=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_concat_value880); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN86);


            }



            // AST REWRITE
            // elements: concat_values_func, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 237:105: -> ^( ID ( concat_values_func )? )
            {
                // OracleParser.g:237:107: ^( ID ( concat_values_func )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ID.nextNode(), root_1);

                // OracleParser.g:237:112: ( concat_values_func )?
                if ( stream_concat_values_func.hasNext() ) {
                    adaptor.addChild(root_1, stream_concat_values_func.nextTree());

                }
                stream_concat_values_func.reset();

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
    // $ANTLR end "single_concat_value"

    public static class multi_concat_values_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multi_concat_values"
    // OracleParser.g:240:1: multi_concat_values : lu_value ( '||' lu_value )* ;
    public final OracleParserParser.multi_concat_values_return multi_concat_values() throws RecognitionException {
        OracleParserParser.multi_concat_values_return retval = new OracleParserParser.multi_concat_values_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal88=null;
        OracleParserParser.lu_value_return lu_value87 = null;

        OracleParserParser.lu_value_return lu_value89 = null;


        CommonTree string_literal88_tree=null;

        try {
            // OracleParser.g:241:2: ( lu_value ( '||' lu_value )* )
            // OracleParser.g:241:4: lu_value ( '||' lu_value )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_lu_value_in_multi_concat_values900);
            lu_value87=lu_value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, lu_value87.getTree());
            // OracleParser.g:241:12: ( '||' lu_value )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==DOUBLEVERTBAR) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // OracleParser.g:241:13: '||' lu_value
            	    {
            	    string_literal88=(Token)match(input,DOUBLEVERTBAR,FOLLOW_DOUBLEVERTBAR_in_multi_concat_values902); if (state.failed) return retval;
            	    pushFollow(FOLLOW_lu_value_in_multi_concat_values905);
            	    lu_value89=lu_value();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, lu_value89.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "multi_concat_values"

    public static class lu_value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lu_value"
    // OracleParser.g:244:1: lu_value : ( '?' | quoted_string -> ^( QUTED_STR quoted_string ) );
    public final OracleParserParser.lu_value_return lu_value() throws RecognitionException {
        OracleParserParser.lu_value_return retval = new OracleParserParser.lu_value_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal90=null;
        OracleParserParser.quoted_string_return quoted_string91 = null;


        CommonTree char_literal90_tree=null;
        RewriteRuleSubtreeStream stream_quoted_string=new RewriteRuleSubtreeStream(adaptor,"rule quoted_string");
        try {
            // OracleParser.g:245:2: ( '?' | quoted_string -> ^( QUTED_STR quoted_string ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==100) ) {
                alt19=1;
            }
            else if ( (LA19_0==QUOTED_STRING) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // OracleParser.g:245:3: '?'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal90=(Token)match(input,100,FOLLOW_100_in_lu_value918); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal90_tree = (CommonTree)adaptor.create(char_literal90);
                    adaptor.addChild(root_0, char_literal90_tree);
                    }

                    }
                    break;
                case 2 :
                    // OracleParser.g:246:3: quoted_string
                    {
                    pushFollow(FOLLOW_quoted_string_in_lu_value922);
                    quoted_string91=quoted_string();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_quoted_string.add(quoted_string91.getTree());


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
                    // 246:17: -> ^( QUTED_STR quoted_string )
                    {
                        // OracleParser.g:246:19: ^( QUTED_STR quoted_string )
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
    // $ANTLR end "lu_value"

    public static class inCondition_expr_bits_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inCondition_expr_bits"
    // OracleParser.g:249:1: inCondition_expr_bits : expr ( COMMA expr )* -> ^( IN_LISTS ( expr )+ ) ;
    public final OracleParserParser.inCondition_expr_bits_return inCondition_expr_bits() throws RecognitionException {
        OracleParserParser.inCondition_expr_bits_return retval = new OracleParserParser.inCondition_expr_bits_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA93=null;
        OracleParserParser.expr_return expr92 = null;

        OracleParserParser.expr_return expr94 = null;


        CommonTree COMMA93_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // OracleParser.g:249:22: ( expr ( COMMA expr )* -> ^( IN_LISTS ( expr )+ ) )
            // OracleParser.g:250:2: expr ( COMMA expr )*
            {
            pushFollow(FOLLOW_expr_in_inCondition_expr_bits940);
            expr92=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr92.getTree());
            // OracleParser.g:250:6: ( COMMA expr )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // OracleParser.g:250:7: COMMA expr
            	    {
            	    COMMA93=(Token)match(input,COMMA,FOLLOW_COMMA_in_inCondition_expr_bits942); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA93);

            	    pushFollow(FOLLOW_expr_in_inCondition_expr_bits944);
            	    expr94=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr94.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
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
            // 250:19: -> ^( IN_LISTS ( expr )+ )
            {
                // OracleParser.g:250:21: ^( IN_LISTS ( expr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IN_LISTS, "IN_LISTS"), root_1);

                if ( !(stream_expr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
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
    // $ANTLR end "inCondition_expr_bits"

    public static class identifiers_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifiers"
    // OracleParser.g:253:1: identifiers : columnNameAfterWhere ( COMMA identifier )* ;
    public final OracleParserParser.identifiers_return identifiers() throws RecognitionException {
        OracleParserParser.identifiers_return retval = new OracleParserParser.identifiers_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA96=null;
        OracleParserParser.columnNameAfterWhere_return columnNameAfterWhere95 = null;

        OracleParserParser.identifier_return identifier97 = null;


        CommonTree COMMA96_tree=null;

        try {
            // OracleParser.g:254:2: ( columnNameAfterWhere ( COMMA identifier )* )
            // OracleParser.g:254:3: columnNameAfterWhere ( COMMA identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_columnNameAfterWhere_in_identifiers964);
            columnNameAfterWhere95=columnNameAfterWhere();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, columnNameAfterWhere95.getTree());
            // OracleParser.g:254:24: ( COMMA identifier )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // OracleParser.g:254:25: COMMA identifier
            	    {
            	    COMMA96=(Token)match(input,COMMA,FOLLOW_COMMA_in_identifiers967); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA96_tree = (CommonTree)adaptor.create(COMMA96);
            	    adaptor.addChild(root_0, COMMA96_tree);
            	    }
            	    pushFollow(FOLLOW_identifier_in_identifiers969);
            	    identifier97=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier97.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // OracleParser.g:257:1: comparisonCondition : relational_op expr -> ^( relational_op expr ) ;
    public final OracleParserParser.comparisonCondition_return comparisonCondition() throws RecognitionException {
        OracleParserParser.comparisonCondition_return retval = new OracleParserParser.comparisonCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        OracleParserParser.relational_op_return relational_op98 = null;

        OracleParserParser.expr_return expr99 = null;


        RewriteRuleSubtreeStream stream_relational_op=new RewriteRuleSubtreeStream(adaptor,"rule relational_op");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // OracleParser.g:258:2: ( relational_op expr -> ^( relational_op expr ) )
            // OracleParser.g:258:3: relational_op expr
            {
            pushFollow(FOLLOW_relational_op_in_comparisonCondition981);
            relational_op98=relational_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_relational_op.add(relational_op98.getTree());
            pushFollow(FOLLOW_expr_in_comparisonCondition983);
            expr99=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr99.getTree());


            // AST REWRITE
            // elements: relational_op, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 258:21: -> ^( relational_op expr )
            {
                // OracleParser.g:258:23: ^( relational_op expr )
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
    // OracleParser.g:261:1: expr : ( expr_bit | subquery ) ;
    public final OracleParserParser.expr_return expr() throws RecognitionException {
        OracleParserParser.expr_return retval = new OracleParserParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        OracleParserParser.expr_bit_return expr_bit100 = null;

        OracleParserParser.subquery_return subquery101 = null;



        try {
            // OracleParser.g:261:6: ( ( expr_bit | subquery ) )
            // OracleParser.g:261:7: ( expr_bit | subquery )
            {
            root_0 = (CommonTree)adaptor.nil();

            // OracleParser.g:261:7: ( expr_bit | subquery )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ID||(LA22_0>=PLUS && LA22_0<=ASTERISK)||(LA22_0>=N && LA22_0<=NUMBER)||LA22_0==QUOTED_STRING||LA22_0==97||(LA22_0>=100 && LA22_0<=101)||(LA22_0>=104 && LA22_0<=105)) ) {
                alt22=1;
            }
            else if ( (LA22_0==LPAREN) ) {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==LPAREN||LA22_2==ID||(LA22_2>=PLUS && LA22_2<=ASTERISK)||(LA22_2>=N && LA22_2<=NUMBER)||LA22_2==QUOTED_STRING||LA22_2==97||(LA22_2>=100 && LA22_2<=101)||(LA22_2>=104 && LA22_2<=105)) ) {
                    alt22=1;
                }
                else if ( (LA22_2==106) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // OracleParser.g:261:8: expr_bit
                    {
                    pushFollow(FOLLOW_expr_bit_in_expr1000);
                    expr_bit100=expr_bit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_bit100.getTree());

                    }
                    break;
                case 2 :
                    // OracleParser.g:262:4: subquery
                    {
                    pushFollow(FOLLOW_subquery_in_expr1005);
                    subquery101=subquery();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery101.getTree());

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
    // OracleParser.g:266:1: subquery : LPAREN select_command RPAREN -> ^( SUBQUERY select_command ) ;
    public final OracleParserParser.subquery_return subquery() throws RecognitionException {
        OracleParserParser.subquery_return retval = new OracleParserParser.subquery_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN102=null;
        Token RPAREN104=null;
        OracleParserParser.select_command_return select_command103 = null;


        CommonTree LPAREN102_tree=null;
        CommonTree RPAREN104_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_select_command=new RewriteRuleSubtreeStream(adaptor,"rule select_command");
        try {
            // OracleParser.g:266:9: ( LPAREN select_command RPAREN -> ^( SUBQUERY select_command ) )
            // OracleParser.g:267:2: LPAREN select_command RPAREN
            {
            LPAREN102=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_subquery1021); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN102);

            pushFollow(FOLLOW_select_command_in_subquery1023);
            select_command103=select_command();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_select_command.add(select_command103.getTree());
            RPAREN104=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_subquery1025); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN104);



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
            // 267:30: -> ^( SUBQUERY select_command )
            {
                // OracleParser.g:267:32: ^( SUBQUERY select_command )
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
    // OracleParser.g:270:1: expr_bit : expr_add ( ( BITOR | BITAND | BITXOR | SHIFTLEFT | SHIFTRIGHT ) ( expr_add ) )* ;
    public final OracleParserParser.expr_bit_return expr_bit() throws RecognitionException {
        OracleParserParser.expr_bit_return retval = new OracleParserParser.expr_bit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BITOR106=null;
        Token BITAND107=null;
        Token BITXOR108=null;
        Token SHIFTLEFT109=null;
        Token SHIFTRIGHT110=null;
        OracleParserParser.expr_add_return expr_add105 = null;

        OracleParserParser.expr_add_return expr_add111 = null;


        CommonTree BITOR106_tree=null;
        CommonTree BITAND107_tree=null;
        CommonTree BITXOR108_tree=null;
        CommonTree SHIFTLEFT109_tree=null;
        CommonTree SHIFTRIGHT110_tree=null;

        try {
            // OracleParser.g:271:2: ( expr_add ( ( BITOR | BITAND | BITXOR | SHIFTLEFT | SHIFTRIGHT ) ( expr_add ) )* )
            // OracleParser.g:271:3: expr_add ( ( BITOR | BITAND | BITXOR | SHIFTLEFT | SHIFTRIGHT ) ( expr_add ) )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_add_in_expr_bit1043);
            expr_add105=expr_add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_add105.getTree());
            // OracleParser.g:271:12: ( ( BITOR | BITAND | BITXOR | SHIFTLEFT | SHIFTRIGHT ) ( expr_add ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=BITOR && LA24_0<=SHIFTRIGHT)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // OracleParser.g:271:14: ( BITOR | BITAND | BITXOR | SHIFTLEFT | SHIFTRIGHT ) ( expr_add )
            	    {
            	    // OracleParser.g:271:14: ( BITOR | BITAND | BITXOR | SHIFTLEFT | SHIFTRIGHT )
            	    int alt23=5;
            	    switch ( input.LA(1) ) {
            	    case BITOR:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case BITAND:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case BITXOR:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    case SHIFTLEFT:
            	        {
            	        alt23=4;
            	        }
            	        break;
            	    case SHIFTRIGHT:
            	        {
            	        alt23=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // OracleParser.g:271:16: BITOR
            	            {
            	            BITOR106=(Token)match(input,BITOR,FOLLOW_BITOR_in_expr_bit1049); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BITOR106_tree = (CommonTree)adaptor.create(BITOR106);
            	            root_0 = (CommonTree)adaptor.becomeRoot(BITOR106_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // OracleParser.g:271:25: BITAND
            	            {
            	            BITAND107=(Token)match(input,BITAND,FOLLOW_BITAND_in_expr_bit1054); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BITAND107_tree = (CommonTree)adaptor.create(BITAND107);
            	            root_0 = (CommonTree)adaptor.becomeRoot(BITAND107_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // OracleParser.g:271:33: BITXOR
            	            {
            	            BITXOR108=(Token)match(input,BITXOR,FOLLOW_BITXOR_in_expr_bit1057); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BITXOR108_tree = (CommonTree)adaptor.create(BITXOR108);
            	            root_0 = (CommonTree)adaptor.becomeRoot(BITXOR108_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // OracleParser.g:271:41: SHIFTLEFT
            	            {
            	            SHIFTLEFT109=(Token)match(input,SHIFTLEFT,FOLLOW_SHIFTLEFT_in_expr_bit1060); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SHIFTLEFT109_tree = (CommonTree)adaptor.create(SHIFTLEFT109);
            	            root_0 = (CommonTree)adaptor.becomeRoot(SHIFTLEFT109_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // OracleParser.g:271:52: SHIFTRIGHT
            	            {
            	            SHIFTRIGHT110=(Token)match(input,SHIFTRIGHT,FOLLOW_SHIFTRIGHT_in_expr_bit1063); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SHIFTRIGHT110_tree = (CommonTree)adaptor.create(SHIFTRIGHT110);
            	            root_0 = (CommonTree)adaptor.becomeRoot(SHIFTRIGHT110_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // OracleParser.g:271:65: ( expr_add )
            	    // OracleParser.g:271:66: expr_add
            	    {
            	    pushFollow(FOLLOW_expr_add_in_expr_bit1068);
            	    expr_add111=expr_add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_add111.getTree());

            	    }


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
    // $ANTLR end "expr_bit"

    public static class expr_add_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_add"
    // OracleParser.g:273:1: expr_add : expr_mul ( ( PLUS | MINUS ) ( expr_mul ) )* ;
    public final OracleParserParser.expr_add_return expr_add() throws RecognitionException {
        OracleParserParser.expr_add_return retval = new OracleParserParser.expr_add_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS113=null;
        Token MINUS114=null;
        OracleParserParser.expr_mul_return expr_mul112 = null;

        OracleParserParser.expr_mul_return expr_mul115 = null;


        CommonTree PLUS113_tree=null;
        CommonTree MINUS114_tree=null;

        try {
            // OracleParser.g:274:2: ( expr_mul ( ( PLUS | MINUS ) ( expr_mul ) )* )
            // OracleParser.g:274:3: expr_mul ( ( PLUS | MINUS ) ( expr_mul ) )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_mul_in_expr_add1081);
            expr_mul112=expr_mul();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_mul112.getTree());
            // OracleParser.g:274:12: ( ( PLUS | MINUS ) ( expr_mul ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=PLUS && LA26_0<=MINUS)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // OracleParser.g:274:14: ( PLUS | MINUS ) ( expr_mul )
            	    {
            	    // OracleParser.g:274:14: ( PLUS | MINUS )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==PLUS) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==MINUS) ) {
            	        alt25=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // OracleParser.g:274:16: PLUS
            	            {
            	            PLUS113=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_add1087); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS113_tree = (CommonTree)adaptor.create(PLUS113);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS113_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // OracleParser.g:274:24: MINUS
            	            {
            	            MINUS114=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_add1092); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS114_tree = (CommonTree)adaptor.create(MINUS114);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS114_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // OracleParser.g:274:33: ( expr_mul )
            	    // OracleParser.g:274:34: expr_mul
            	    {
            	    pushFollow(FOLLOW_expr_mul_in_expr_add1098);
            	    expr_mul115=expr_mul();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_mul115.getTree());

            	    }


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
    // $ANTLR end "expr_add"

    public static class expr_mul_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_mul"
    // OracleParser.g:276:1: expr_mul : expr_sign ( ( ASTERISK | DIVIDE ) expr_sign )* ;
    public final OracleParserParser.expr_mul_return expr_mul() throws RecognitionException {
        OracleParserParser.expr_mul_return retval = new OracleParserParser.expr_mul_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASTERISK117=null;
        Token DIVIDE118=null;
        OracleParserParser.expr_sign_return expr_sign116 = null;

        OracleParserParser.expr_sign_return expr_sign119 = null;


        CommonTree ASTERISK117_tree=null;
        CommonTree DIVIDE118_tree=null;

        try {
            // OracleParser.g:277:2: ( expr_sign ( ( ASTERISK | DIVIDE ) expr_sign )* )
            // OracleParser.g:277:4: expr_sign ( ( ASTERISK | DIVIDE ) expr_sign )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_sign_in_expr_mul1112);
            expr_sign116=expr_sign();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_sign116.getTree());
            // OracleParser.g:277:14: ( ( ASTERISK | DIVIDE ) expr_sign )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=ASTERISK && LA28_0<=DIVIDE)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // OracleParser.g:277:16: ( ASTERISK | DIVIDE ) expr_sign
            	    {
            	    // OracleParser.g:277:16: ( ASTERISK | DIVIDE )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==ASTERISK) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==DIVIDE) ) {
            	        alt27=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // OracleParser.g:277:18: ASTERISK
            	            {
            	            ASTERISK117=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_expr_mul1118); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            ASTERISK117_tree = (CommonTree)adaptor.create(ASTERISK117);
            	            root_0 = (CommonTree)adaptor.becomeRoot(ASTERISK117_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // OracleParser.g:277:30: DIVIDE
            	            {
            	            DIVIDE118=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_expr_mul1123); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DIVIDE118_tree = (CommonTree)adaptor.create(DIVIDE118);
            	            root_0 = (CommonTree)adaptor.becomeRoot(DIVIDE118_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_expr_sign_in_expr_mul1128);
            	    expr_sign119=expr_sign();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_sign119.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // OracleParser.g:279:1: expr_sign : ( PLUS expr_pow -> ^( POSITIVE expr_pow ) | MINUS expr_pow -> ^( NEGATIVE expr_pow ) | expr_pow );
    public final OracleParserParser.expr_sign_return expr_sign() throws RecognitionException {
        OracleParserParser.expr_sign_return retval = new OracleParserParser.expr_sign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS120=null;
        Token MINUS122=null;
        OracleParserParser.expr_pow_return expr_pow121 = null;

        OracleParserParser.expr_pow_return expr_pow123 = null;

        OracleParserParser.expr_pow_return expr_pow124 = null;


        CommonTree PLUS120_tree=null;
        CommonTree MINUS122_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_expr_pow=new RewriteRuleSubtreeStream(adaptor,"rule expr_pow");
        try {
            // OracleParser.g:280:2: ( PLUS expr_pow -> ^( POSITIVE expr_pow ) | MINUS expr_pow -> ^( NEGATIVE expr_pow ) | expr_pow )
            int alt29=3;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt29=1;
                }
                break;
            case MINUS:
                {
                alt29=2;
                }
                break;
            case LPAREN:
            case ID:
            case ASTERISK:
            case N:
            case NUMBER:
            case QUOTED_STRING:
            case 97:
            case 100:
            case 101:
            case 104:
            case 105:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // OracleParser.g:280:4: PLUS expr_pow
                    {
                    PLUS120=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_sign1141); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(PLUS120);

                    pushFollow(FOLLOW_expr_pow_in_expr_sign1143);
                    expr_pow121=expr_pow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr_pow.add(expr_pow121.getTree());


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
                    // 280:18: -> ^( POSITIVE expr_pow )
                    {
                        // OracleParser.g:280:21: ^( POSITIVE expr_pow )
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
                    // OracleParser.g:281:4: MINUS expr_pow
                    {
                    MINUS122=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_sign1156); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS122);

                    pushFollow(FOLLOW_expr_pow_in_expr_sign1158);
                    expr_pow123=expr_pow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr_pow.add(expr_pow123.getTree());


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
                    // 281:19: -> ^( NEGATIVE expr_pow )
                    {
                        // OracleParser.g:281:22: ^( NEGATIVE expr_pow )
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
                    // OracleParser.g:282:4: expr_pow
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_pow_in_expr_sign1171);
                    expr_pow124=expr_pow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_pow124.getTree());

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
    // OracleParser.g:284:1: expr_pow : expr_expr ( EXPONENT expr_expr )* ;
    public final OracleParserParser.expr_pow_return expr_pow() throws RecognitionException {
        OracleParserParser.expr_pow_return retval = new OracleParserParser.expr_pow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXPONENT126=null;
        OracleParserParser.expr_expr_return expr_expr125 = null;

        OracleParserParser.expr_expr_return expr_expr127 = null;


        CommonTree EXPONENT126_tree=null;

        try {
            // OracleParser.g:285:2: ( expr_expr ( EXPONENT expr_expr )* )
            // OracleParser.g:285:4: expr_expr ( EXPONENT expr_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_expr_in_expr_pow1181);
            expr_expr125=expr_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_expr125.getTree());
            // OracleParser.g:285:14: ( EXPONENT expr_expr )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==EXPONENT) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // OracleParser.g:285:16: EXPONENT expr_expr
            	    {
            	    EXPONENT126=(Token)match(input,EXPONENT,FOLLOW_EXPONENT_in_expr_pow1185); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    EXPONENT126_tree = (CommonTree)adaptor.create(EXPONENT126);
            	    root_0 = (CommonTree)adaptor.becomeRoot(EXPONENT126_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_expr_expr_in_expr_pow1188);
            	    expr_expr127=expr_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_expr127.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // OracleParser.g:288:1: expr_expr : ( value | boolean_literal | 'NULL' | {...}? ID ( LPAREN ( values_func )? RPAREN ) -> ^( ID ( values_func )? ) | {...}? ID -> ^( CONSIST ID ) | 'CAST' LPAREN values_func 'AS' ID RPAREN -> ^( CAST values_func ID ) );
    public final OracleParserParser.expr_expr_return expr_expr() throws RecognitionException {
        OracleParserParser.expr_expr_return retval = new OracleParserParser.expr_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal130=null;
        Token ID131=null;
        Token LPAREN132=null;
        Token RPAREN134=null;
        Token ID135=null;
        Token string_literal136=null;
        Token LPAREN137=null;
        Token string_literal139=null;
        Token ID140=null;
        Token RPAREN141=null;
        OracleParserParser.value_return value128 = null;

        OracleParserParser.boolean_literal_return boolean_literal129 = null;

        OracleParserParser.values_func_return values_func133 = null;

        OracleParserParser.values_func_return values_func138 = null;


        CommonTree string_literal130_tree=null;
        CommonTree ID131_tree=null;
        CommonTree LPAREN132_tree=null;
        CommonTree RPAREN134_tree=null;
        CommonTree ID135_tree=null;
        CommonTree string_literal136_tree=null;
        CommonTree LPAREN137_tree=null;
        CommonTree string_literal139_tree=null;
        CommonTree ID140_tree=null;
        CommonTree RPAREN141_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_values_func=new RewriteRuleSubtreeStream(adaptor,"rule values_func");
        try {
            // OracleParser.g:289:2: ( value | boolean_literal | 'NULL' | {...}? ID ( LPAREN ( values_func )? RPAREN ) -> ^( ID ( values_func )? ) | {...}? ID -> ^( CONSIST ID ) | 'CAST' LPAREN values_func 'AS' ID RPAREN -> ^( CAST values_func ID ) )
            int alt32=6;
            switch ( input.LA(1) ) {
            case LPAREN:
            case ASTERISK:
            case N:
            case NUMBER:
            case QUOTED_STRING:
            case 100:
                {
                alt32=1;
                }
                break;
            case ID:
                {
                int LA32_2 = input.LA(2);

                if ( (LA32_2==LPAREN) ) {
                    alt32=4;
                }
                else if ( (!(((consistStr.containsKey(input.LT(1).getText().toUpperCase()))))) ) {
                    alt32=1;
                }
                else if ( ((consistStr.containsKey(input.LT(1).getText().toUpperCase()))) ) {
                    alt32=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 2, input);

                    throw nvae;
                }
                }
                break;
            case 104:
            case 105:
                {
                alt32=2;
                }
                break;
            case 97:
                {
                alt32=3;
                }
                break;
            case 101:
                {
                alt32=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // OracleParser.g:289:3: value
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_value_in_expr_expr1201);
                    value128=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value128.getTree());

                    }
                    break;
                case 2 :
                    // OracleParser.g:290:3: boolean_literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_boolean_literal_in_expr_expr1205);
                    boolean_literal129=boolean_literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_literal129.getTree());

                    }
                    break;
                case 3 :
                    // OracleParser.g:291:3: 'NULL'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal130=(Token)match(input,97,FOLLOW_97_in_expr_expr1209); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal130_tree = (CommonTree)adaptor.create(string_literal130);
                    adaptor.addChild(root_0, string_literal130_tree);
                    }

                    }
                    break;
                case 4 :
                    // OracleParser.g:294:3: {...}? ID ( LPAREN ( values_func )? RPAREN )
                    {
                    if ( !((functionMap.containsKey(input.LT(1).getText().toUpperCase()))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "expr_expr", "functionMap.containsKey(input.LT(1).getText().toUpperCase())");
                    }
                    ID131=(Token)match(input,ID,FOLLOW_ID_in_expr_expr1217); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID131);

                    // OracleParser.g:294:70: ( LPAREN ( values_func )? RPAREN )
                    // OracleParser.g:294:71: LPAREN ( values_func )? RPAREN
                    {
                    LPAREN132=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr_expr1220); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN132);

                    // OracleParser.g:294:78: ( values_func )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==LPAREN||LA31_0==ID||(LA31_0>=PLUS && LA31_0<=ASTERISK)||(LA31_0>=N && LA31_0<=NUMBER)||LA31_0==QUOTED_STRING||LA31_0==97||(LA31_0>=100 && LA31_0<=101)||(LA31_0>=104 && LA31_0<=105)) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // OracleParser.g:294:78: values_func
                            {
                            pushFollow(FOLLOW_values_func_in_expr_expr1222);
                            values_func133=values_func();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_values_func.add(values_func133.getTree());

                            }
                            break;

                    }

                    RPAREN134=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr_expr1225); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN134);


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
                    // 294:98: -> ^( ID ( values_func )? )
                    {
                        // OracleParser.g:294:100: ^( ID ( values_func )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ID.nextNode(), root_1);

                        // OracleParser.g:294:105: ( values_func )?
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
                case 5 :
                    // OracleParser.g:295:3: {...}? ID
                    {
                    if ( !((consistStr.containsKey(input.LT(1).getText().toUpperCase()))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "expr_expr", "consistStr.containsKey(input.LT(1).getText().toUpperCase())");
                    }
                    ID135=(Token)match(input,ID,FOLLOW_ID_in_expr_expr1239); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID135);



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
                    // 295:69: -> ^( CONSIST ID )
                    {
                        // OracleParser.g:295:71: ^( CONSIST ID )
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
                case 6 :
                    // OracleParser.g:296:3: 'CAST' LPAREN values_func 'AS' ID RPAREN
                    {
                    string_literal136=(Token)match(input,101,FOLLOW_101_in_expr_expr1250); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_101.add(string_literal136);

                    LPAREN137=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr_expr1252); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN137);

                    pushFollow(FOLLOW_values_func_in_expr_expr1254);
                    values_func138=values_func();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_values_func.add(values_func138.getTree());
                    string_literal139=(Token)match(input,102,FOLLOW_102_in_expr_expr1256); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_102.add(string_literal139);

                    ID140=(Token)match(input,ID,FOLLOW_ID_in_expr_expr1258); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID140);

                    RPAREN141=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr_expr1260); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN141);



                    // AST REWRITE
                    // elements: values_func, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 296:43: -> ^( CAST values_func ID )
                    {
                        // OracleParser.g:296:45: ^( CAST values_func ID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CAST, "CAST"), root_1);

                        adaptor.addChild(root_1, stream_values_func.nextTree());
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
    // OracleParser.g:301:1: sql_condition : condition_or ;
    public final OracleParserParser.sql_condition_return sql_condition() throws RecognitionException {
        OracleParserParser.sql_condition_return retval = new OracleParserParser.sql_condition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        OracleParserParser.condition_or_return condition_or142 = null;



        try {
            // OracleParser.g:302:2: ( condition_or )
            // OracleParser.g:302:4: condition_or
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_condition_or_in_sql_condition1280);
            condition_or142=condition_or();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condition_or142.getTree());

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
    // OracleParser.g:304:1: relational_op : ( EQ | LTH | GTH | NOT_EQ | LEQ | GEQ );
    public final OracleParserParser.relational_op_return relational_op() throws RecognitionException {
        OracleParserParser.relational_op_return retval = new OracleParserParser.relational_op_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set143=null;

        CommonTree set143_tree=null;

        try {
            // OracleParser.g:305:2: ( EQ | LTH | GTH | NOT_EQ | LEQ | GEQ )
            // OracleParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set143=(Token)input.LT(1);
            if ( input.LA(1)==EQ||(input.LA(1)>=LTH && input.LA(1)<=GEQ) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set143));
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
    // OracleParser.g:308:1: fromClause : 'FROM' selected_table ;
    public final OracleParserParser.fromClause_return fromClause() throws RecognitionException {
        OracleParserParser.fromClause_return retval = new OracleParserParser.fromClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal144=null;
        OracleParserParser.selected_table_return selected_table145 = null;


        CommonTree string_literal144_tree=null;

        try {
            // OracleParser.g:309:2: ( 'FROM' selected_table )
            // OracleParser.g:309:3: 'FROM' selected_table
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal144=(Token)match(input,103,FOLLOW_103_in_fromClause1320); if (state.failed) return retval;
            pushFollow(FOLLOW_selected_table_in_fromClause1323);
            selected_table145=selected_table();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, selected_table145.getTree());

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
    // OracleParser.g:312:1: select_list : displayed_column ( COMMA displayed_column )* -> ^( SELECT_LIST ( displayed_column )+ ) ;
    public final OracleParserParser.select_list_return select_list() throws RecognitionException {
        OracleParserParser.select_list_return retval = new OracleParserParser.select_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA147=null;
        OracleParserParser.displayed_column_return displayed_column146 = null;

        OracleParserParser.displayed_column_return displayed_column148 = null;


        CommonTree COMMA147_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_displayed_column=new RewriteRuleSubtreeStream(adaptor,"rule displayed_column");
        try {
            // OracleParser.g:313:2: ( displayed_column ( COMMA displayed_column )* -> ^( SELECT_LIST ( displayed_column )+ ) )
            // OracleParser.g:313:4: displayed_column ( COMMA displayed_column )*
            {
            pushFollow(FOLLOW_displayed_column_in_select_list1334);
            displayed_column146=displayed_column();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_displayed_column.add(displayed_column146.getTree());
            // OracleParser.g:313:21: ( COMMA displayed_column )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==COMMA) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // OracleParser.g:313:23: COMMA displayed_column
            	    {
            	    COMMA147=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_list1338); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA147);

            	    pushFollow(FOLLOW_displayed_column_in_select_list1340);
            	    displayed_column148=displayed_column();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_displayed_column.add(displayed_column148.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
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
            // 313:48: -> ^( SELECT_LIST ( displayed_column )+ )
            {
                // OracleParser.g:313:50: ^( SELECT_LIST ( displayed_column )+ )
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
    // OracleParser.g:316:1: displayed_column : ({...}? ID ( ( LPAREN ( values_func )? RPAREN ) ) ( alias )? -> ^( ID ( values_func )? ( alias )? ) | {...}? ID ( alias )? -> ^( CONSIST ID ( alias )? ) | ( table_alias )? column ( alias )? -> ^( COLUMN ( table_alias )? column ( alias )? ) );
    public final OracleParserParser.displayed_column_return displayed_column() throws RecognitionException {
        OracleParserParser.displayed_column_return retval = new OracleParserParser.displayed_column_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID149=null;
        Token LPAREN150=null;
        Token RPAREN152=null;
        Token ID154=null;
        OracleParserParser.values_func_return values_func151 = null;

        OracleParserParser.alias_return alias153 = null;

        OracleParserParser.alias_return alias155 = null;

        OracleParserParser.table_alias_return table_alias156 = null;

        OracleParserParser.column_return column157 = null;

        OracleParserParser.alias_return alias158 = null;


        CommonTree ID149_tree=null;
        CommonTree LPAREN150_tree=null;
        CommonTree RPAREN152_tree=null;
        CommonTree ID154_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_alias=new RewriteRuleSubtreeStream(adaptor,"rule alias");
        RewriteRuleSubtreeStream stream_column=new RewriteRuleSubtreeStream(adaptor,"rule column");
        RewriteRuleSubtreeStream stream_values_func=new RewriteRuleSubtreeStream(adaptor,"rule values_func");
        RewriteRuleSubtreeStream stream_table_alias=new RewriteRuleSubtreeStream(adaptor,"rule table_alias");
        try {
            // OracleParser.g:317:2: ({...}? ID ( ( LPAREN ( values_func )? RPAREN ) ) ( alias )? -> ^( ID ( values_func )? ( alias )? ) | {...}? ID ( alias )? -> ^( CONSIST ID ( alias )? ) | ( table_alias )? column ( alias )? -> ^( COLUMN ( table_alias )? column ( alias )? ) )
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ID) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==LPAREN) ) {
                    alt39=1;
                }
                else if ( ((consistStr.containsKey(input.LT(1).getText().toUpperCase()))) ) {
                    alt39=2;
                }
                else if ( (true) ) {
                    alt39=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA39_0==ASTERISK||LA39_0==N) ) {
                alt39=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // OracleParser.g:318:2: {...}? ID ( ( LPAREN ( values_func )? RPAREN ) ) ( alias )?
                    {
                    if ( !((functionMap.containsKey(input.LT(1).getText().toUpperCase()))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "displayed_column", "functionMap.containsKey(input.LT(1).getText().toUpperCase())");
                    }
                    ID149=(Token)match(input,ID,FOLLOW_ID_in_displayed_column1365); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID149);

                    // OracleParser.g:318:69: ( ( LPAREN ( values_func )? RPAREN ) )
                    // OracleParser.g:318:70: ( LPAREN ( values_func )? RPAREN )
                    {
                    // OracleParser.g:318:70: ( LPAREN ( values_func )? RPAREN )
                    // OracleParser.g:318:71: LPAREN ( values_func )? RPAREN
                    {
                    LPAREN150=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_displayed_column1369); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN150);

                    // OracleParser.g:318:78: ( values_func )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==LPAREN||LA34_0==ID||(LA34_0>=PLUS && LA34_0<=ASTERISK)||(LA34_0>=N && LA34_0<=NUMBER)||LA34_0==QUOTED_STRING||LA34_0==97||(LA34_0>=100 && LA34_0<=101)||(LA34_0>=104 && LA34_0<=105)) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // OracleParser.g:318:78: values_func
                            {
                            pushFollow(FOLLOW_values_func_in_displayed_column1371);
                            values_func151=values_func();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_values_func.add(values_func151.getTree());

                            }
                            break;

                    }

                    RPAREN152=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_displayed_column1374); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN152);


                    }


                    }

                    // OracleParser.g:318:100: ( alias )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ID||LA35_0==102) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // OracleParser.g:318:100: alias
                            {
                            pushFollow(FOLLOW_alias_in_displayed_column1378);
                            alias153=alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_alias.add(alias153.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: values_func, alias, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 318:106: -> ^( ID ( values_func )? ( alias )? )
                    {
                        // OracleParser.g:318:108: ^( ID ( values_func )? ( alias )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ID.nextNode(), root_1);

                        // OracleParser.g:318:113: ( values_func )?
                        if ( stream_values_func.hasNext() ) {
                            adaptor.addChild(root_1, stream_values_func.nextTree());

                        }
                        stream_values_func.reset();
                        // OracleParser.g:318:126: ( alias )?
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
                    // OracleParser.g:319:3: {...}? ID ( alias )?
                    {
                    if ( !((consistStr.containsKey(input.LT(1).getText().toUpperCase()))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "displayed_column", "consistStr.containsKey(input.LT(1).getText().toUpperCase())");
                    }
                    ID154=(Token)match(input,ID,FOLLOW_ID_in_displayed_column1395); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID154);

                    // OracleParser.g:319:69: ( alias )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==ID||LA36_0==102) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // OracleParser.g:319:69: alias
                            {
                            pushFollow(FOLLOW_alias_in_displayed_column1397);
                            alias155=alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_alias.add(alias155.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: alias, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 319:76: -> ^( CONSIST ID ( alias )? )
                    {
                        // OracleParser.g:319:78: ^( CONSIST ID ( alias )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONSIST, "CONSIST"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // OracleParser.g:319:91: ( alias )?
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
                    // OracleParser.g:320:3: ( table_alias )? column ( alias )?
                    {
                    // OracleParser.g:320:3: ( table_alias )?
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
                            // OracleParser.g:320:3: table_alias
                            {
                            pushFollow(FOLLOW_table_alias_in_displayed_column1412);
                            table_alias156=table_alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_table_alias.add(table_alias156.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_column_in_displayed_column1416);
                    column157=column();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_column.add(column157.getTree());
                    // OracleParser.g:320:24: ( alias )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==ID||LA38_0==102) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // OracleParser.g:320:25: alias
                            {
                            pushFollow(FOLLOW_alias_in_displayed_column1419);
                            alias158=alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_alias.add(alias158.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: table_alias, column, alias
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 320:32: -> ^( COLUMN ( table_alias )? column ( alias )? )
                    {
                        // OracleParser.g:320:34: ^( COLUMN ( table_alias )? column ( alias )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COLUMN, "COLUMN"), root_1);

                        // OracleParser.g:320:43: ( table_alias )?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextTree());

                        }
                        stream_table_alias.reset();
                        adaptor.addChild(root_1, stream_column.nextTree());
                        // OracleParser.g:320:63: ( alias )?
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
    // OracleParser.g:323:1: columnNameAfterWhere : ( ( table_alias )? identifier -> ^( ASC identifier ( table_alias )? ) | ( table_alias )? identifier ASC -> ^( ASC identifier ( table_alias )? ) | ( table_alias )? identifier DESC -> ^( DESC identifier ( table_alias )? ) );
    public final OracleParserParser.columnNameAfterWhere_return columnNameAfterWhere() throws RecognitionException {
        OracleParserParser.columnNameAfterWhere_return retval = new OracleParserParser.columnNameAfterWhere_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASC163=null;
        Token DESC166=null;
        OracleParserParser.table_alias_return table_alias159 = null;

        OracleParserParser.identifier_return identifier160 = null;

        OracleParserParser.table_alias_return table_alias161 = null;

        OracleParserParser.identifier_return identifier162 = null;

        OracleParserParser.table_alias_return table_alias164 = null;

        OracleParserParser.identifier_return identifier165 = null;


        CommonTree ASC163_tree=null;
        CommonTree DESC166_tree=null;
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleSubtreeStream stream_table_alias=new RewriteRuleSubtreeStream(adaptor,"rule table_alias");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // OracleParser.g:324:2: ( ( table_alias )? identifier -> ^( ASC identifier ( table_alias )? ) | ( table_alias )? identifier ASC -> ^( ASC identifier ( table_alias )? ) | ( table_alias )? identifier DESC -> ^( DESC identifier ( table_alias )? ) )
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ID) ) {
                switch ( input.LA(2) ) {
                case DOT:
                    {
                    int LA43_2 = input.LA(3);

                    if ( (LA43_2==ID) ) {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case COMMA:
                        case RPAREN:
                        case 88:
                        case 112:
                            {
                            alt43=1;
                            }
                            break;
                        case ASC:
                            {
                            alt43=2;
                            }
                            break;
                        case DESC:
                            {
                            alt43=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 43, 6, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case COMMA:
                case RPAREN:
                case 88:
                case 112:
                    {
                    alt43=1;
                    }
                    break;
                case ASC:
                    {
                    alt43=2;
                    }
                    break;
                case DESC:
                    {
                    alt43=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // OracleParser.g:324:3: ( table_alias )? identifier
                    {
                    // OracleParser.g:324:3: ( table_alias )?
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
                            // OracleParser.g:324:3: table_alias
                            {
                            pushFollow(FOLLOW_table_alias_in_columnNameAfterWhere1444);
                            table_alias159=table_alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_table_alias.add(table_alias159.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_identifier_in_columnNameAfterWhere1447);
                    identifier160=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier160.getTree());


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
                    // 324:28: -> ^( ASC identifier ( table_alias )? )
                    {
                        // OracleParser.g:324:30: ^( ASC identifier ( table_alias )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASC, "ASC"), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        // OracleParser.g:324:47: ( table_alias )?
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
                    // OracleParser.g:325:3: ( table_alias )? identifier ASC
                    {
                    // OracleParser.g:325:3: ( table_alias )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==ID) ) {
                        int LA41_1 = input.LA(2);

                        if ( (LA41_1==DOT) ) {
                            alt41=1;
                        }
                    }
                    switch (alt41) {
                        case 1 :
                            // OracleParser.g:325:3: table_alias
                            {
                            pushFollow(FOLLOW_table_alias_in_columnNameAfterWhere1462);
                            table_alias161=table_alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_table_alias.add(table_alias161.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_identifier_in_columnNameAfterWhere1465);
                    identifier162=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier162.getTree());
                    ASC163=(Token)match(input,ASC,FOLLOW_ASC_in_columnNameAfterWhere1468); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASC.add(ASC163);



                    // AST REWRITE
                    // elements: ASC, table_alias, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 325:33: -> ^( ASC identifier ( table_alias )? )
                    {
                        // OracleParser.g:325:35: ^( ASC identifier ( table_alias )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ASC.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        // OracleParser.g:325:52: ( table_alias )?
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
                    // OracleParser.g:326:3: ( table_alias )? identifier DESC
                    {
                    // OracleParser.g:326:3: ( table_alias )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==ID) ) {
                        int LA42_1 = input.LA(2);

                        if ( (LA42_1==DOT) ) {
                            alt42=1;
                        }
                    }
                    switch (alt42) {
                        case 1 :
                            // OracleParser.g:326:3: table_alias
                            {
                            pushFollow(FOLLOW_table_alias_in_columnNameAfterWhere1483);
                            table_alias164=table_alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_table_alias.add(table_alias164.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_identifier_in_columnNameAfterWhere1486);
                    identifier165=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier165.getTree());
                    DESC166=(Token)match(input,DESC,FOLLOW_DESC_in_columnNameAfterWhere1489); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DESC.add(DESC166);



                    // AST REWRITE
                    // elements: DESC, table_alias, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 326:33: -> ^( DESC identifier ( table_alias )? )
                    {
                        // OracleParser.g:326:35: ^( DESC identifier ( table_alias )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_DESC.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        // OracleParser.g:326:53: ( table_alias )?
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
    // OracleParser.g:329:1: columnNameInUpdate : ( table_alias )? identifier ;
    public final OracleParserParser.columnNameInUpdate_return columnNameInUpdate() throws RecognitionException {
        OracleParserParser.columnNameInUpdate_return retval = new OracleParserParser.columnNameInUpdate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        OracleParserParser.table_alias_return table_alias167 = null;

        OracleParserParser.identifier_return identifier168 = null;



        try {
            // OracleParser.g:330:2: ( ( table_alias )? identifier )
            // OracleParser.g:330:3: ( table_alias )? identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            // OracleParser.g:330:3: ( table_alias )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==ID) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==DOT) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // OracleParser.g:330:3: table_alias
                    {
                    pushFollow(FOLLOW_table_alias_in_columnNameInUpdate1511);
                    table_alias167=table_alias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, table_alias167.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_identifier_in_columnNameInUpdate1514);
            identifier168=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier168.getTree());

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
    // OracleParser.g:332:1: table_alias : identifier DOT -> ^( COL_TAB identifier ) ;
    public final OracleParserParser.table_alias_return table_alias() throws RecognitionException {
        OracleParserParser.table_alias_return retval = new OracleParserParser.table_alias_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT170=null;
        OracleParserParser.identifier_return identifier169 = null;


        CommonTree DOT170_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // OracleParser.g:333:2: ( identifier DOT -> ^( COL_TAB identifier ) )
            // OracleParser.g:333:3: identifier DOT
            {
            pushFollow(FOLLOW_identifier_in_table_alias1524);
            identifier169=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier169.getTree());
            DOT170=(Token)match(input,DOT,FOLLOW_DOT_in_table_alias1526); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT170);



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
            // 333:17: -> ^( COL_TAB identifier )
            {
                // OracleParser.g:333:19: ^( COL_TAB identifier )
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
    // OracleParser.g:335:1: column : ( ASTERISK | {...}? N | identifier );
    public final OracleParserParser.column_return column() throws RecognitionException {
        OracleParserParser.column_return retval = new OracleParserParser.column_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASTERISK171=null;
        Token N172=null;
        OracleParserParser.identifier_return identifier173 = null;


        CommonTree ASTERISK171_tree=null;
        CommonTree N172_tree=null;

        try {
            // OracleParser.g:336:2: ( ASTERISK | {...}? N | identifier )
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
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // OracleParser.g:336:3: ASTERISK
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ASTERISK171=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_column1542); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASTERISK171_tree = (CommonTree)adaptor.create(ASTERISK171);
                    adaptor.addChild(root_0, ASTERISK171_tree);
                    }

                    }
                    break;
                case 2 :
                    // OracleParser.g:337:3: {...}? N
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    if ( !(("1".equals(input.LT(1).getText().toUpperCase()))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "column", "\"1\".equals(input.LT(1).getText().toUpperCase())");
                    }
                    N172=(Token)match(input,N,FOLLOW_N_in_column1548); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    N172_tree = (CommonTree)adaptor.create(N172);
                    adaptor.addChild(root_0, N172_tree);
                    }

                    }
                    break;
                case 3 :
                    // OracleParser.g:338:3: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_column1552);
                    identifier173=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier173.getTree());

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
    // OracleParser.g:340:1: values : expr ( COMMA expr )* -> ^( INSERT_VAL ( expr )* ) ;
    public final OracleParserParser.values_return values() throws RecognitionException {
        OracleParserParser.values_return retval = new OracleParserParser.values_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA175=null;
        OracleParserParser.expr_return expr174 = null;

        OracleParserParser.expr_return expr176 = null;


        CommonTree COMMA175_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // OracleParser.g:341:2: ( expr ( COMMA expr )* -> ^( INSERT_VAL ( expr )* ) )
            // OracleParser.g:341:3: expr ( COMMA expr )*
            {
            pushFollow(FOLLOW_expr_in_values1561);
            expr174=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr174.getTree());
            // OracleParser.g:341:8: ( COMMA expr )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==COMMA) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // OracleParser.g:341:10: COMMA expr
            	    {
            	    COMMA175=(Token)match(input,COMMA,FOLLOW_COMMA_in_values1565); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA175);

            	    pushFollow(FOLLOW_expr_in_values1567);
            	    expr176=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr176.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
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
            // 341:23: -> ^( INSERT_VAL ( expr )* )
            {
                // OracleParser.g:341:25: ^( INSERT_VAL ( expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INSERT_VAL, "INSERT_VAL"), root_1);

                // OracleParser.g:341:38: ( expr )*
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
    // OracleParser.g:343:1: values_func : expr ( COMMA expr )* ;
    public final OracleParserParser.values_func_return values_func() throws RecognitionException {
        OracleParserParser.values_func_return retval = new OracleParserParser.values_func_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA178=null;
        OracleParserParser.expr_return expr177 = null;

        OracleParserParser.expr_return expr179 = null;


        CommonTree COMMA178_tree=null;

        try {
            // OracleParser.g:344:2: ( expr ( COMMA expr )* )
            // OracleParser.g:344:3: expr ( COMMA expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_in_values_func1586);
            expr177=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr177.getTree());
            // OracleParser.g:344:8: ( COMMA expr )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==COMMA) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // OracleParser.g:344:10: COMMA expr
            	    {
            	    COMMA178=(Token)match(input,COMMA,FOLLOW_COMMA_in_values_func1590); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expr_in_values_func1593);
            	    expr179=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr179.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // OracleParser.g:346:1: value : ( N | NUMBER | '?' | LPAREN expr RPAREN | quoted_string -> ^( QUTED_STR quoted_string ) | column_spec );
    public final OracleParserParser.value_return value() throws RecognitionException {
        OracleParserParser.value_return retval = new OracleParserParser.value_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token N180=null;
        Token NUMBER181=null;
        Token char_literal182=null;
        Token LPAREN183=null;
        Token RPAREN185=null;
        OracleParserParser.expr_return expr184 = null;

        OracleParserParser.quoted_string_return quoted_string186 = null;

        OracleParserParser.column_spec_return column_spec187 = null;


        CommonTree N180_tree=null;
        CommonTree NUMBER181_tree=null;
        CommonTree char_literal182_tree=null;
        CommonTree LPAREN183_tree=null;
        CommonTree RPAREN185_tree=null;
        RewriteRuleSubtreeStream stream_quoted_string=new RewriteRuleSubtreeStream(adaptor,"rule quoted_string");
        try {
            // OracleParser.g:347:2: ( N | NUMBER | '?' | LPAREN expr RPAREN | quoted_string -> ^( QUTED_STR quoted_string ) | column_spec )
            int alt48=6;
            switch ( input.LA(1) ) {
            case N:
                {
                alt48=1;
                }
                break;
            case NUMBER:
                {
                alt48=2;
                }
                break;
            case 100:
                {
                alt48=3;
                }
                break;
            case LPAREN:
                {
                alt48=4;
                }
                break;
            case QUOTED_STRING:
                {
                alt48=5;
                }
                break;
            case ID:
            case ASTERISK:
                {
                alt48=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // OracleParser.g:347:3: N
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    N180=(Token)match(input,N,FOLLOW_N_in_value1607); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    N180_tree = (CommonTree)adaptor.create(N180);
                    adaptor.addChild(root_0, N180_tree);
                    }

                    }
                    break;
                case 2 :
                    // OracleParser.g:348:3: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NUMBER181=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_value1611); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER181_tree = (CommonTree)adaptor.create(NUMBER181);
                    adaptor.addChild(root_0, NUMBER181_tree);
                    }

                    }
                    break;
                case 3 :
                    // OracleParser.g:349:3: '?'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal182=(Token)match(input,100,FOLLOW_100_in_value1615); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal182_tree = (CommonTree)adaptor.create(char_literal182);
                    adaptor.addChild(root_0, char_literal182_tree);
                    }

                    }
                    break;
                case 4 :
                    // OracleParser.g:350:3: LPAREN expr RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LPAREN183=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value1619); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_value1622);
                    expr184=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr184.getTree());
                    RPAREN185=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value1624); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // OracleParser.g:351:3: quoted_string
                    {
                    pushFollow(FOLLOW_quoted_string_in_value1629);
                    quoted_string186=quoted_string();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_quoted_string.add(quoted_string186.getTree());


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
                    // 351:17: -> ^( QUTED_STR quoted_string )
                    {
                        // OracleParser.g:351:19: ^( QUTED_STR quoted_string )
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
                    // OracleParser.g:352:3: column_spec
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_column_spec_in_value1640);
                    column_spec187=column_spec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, column_spec187.getTree());

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
    // OracleParser.g:355:1: column_specs : column_spec ( COMMA column_spec )* -> ^( COLUMNS ( column_spec )+ ) ;
    public final OracleParserParser.column_specs_return column_specs() throws RecognitionException {
        OracleParserParser.column_specs_return retval = new OracleParserParser.column_specs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA189=null;
        OracleParserParser.column_spec_return column_spec188 = null;

        OracleParserParser.column_spec_return column_spec190 = null;


        CommonTree COMMA189_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_column_spec=new RewriteRuleSubtreeStream(adaptor,"rule column_spec");
        try {
            // OracleParser.g:356:2: ( column_spec ( COMMA column_spec )* -> ^( COLUMNS ( column_spec )+ ) )
            // OracleParser.g:356:4: column_spec ( COMMA column_spec )*
            {
            pushFollow(FOLLOW_column_spec_in_column_specs1655);
            column_spec188=column_spec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_column_spec.add(column_spec188.getTree());
            // OracleParser.g:356:16: ( COMMA column_spec )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==COMMA) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // OracleParser.g:356:18: COMMA column_spec
            	    {
            	    COMMA189=(Token)match(input,COMMA,FOLLOW_COMMA_in_column_specs1659); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA189);

            	    pushFollow(FOLLOW_column_spec_in_column_specs1661);
            	    column_spec190=column_spec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_column_spec.add(column_spec190.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
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
            // 356:38: -> ^( COLUMNS ( column_spec )+ )
            {
                // OracleParser.g:356:40: ^( COLUMNS ( column_spec )+ )
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
    // OracleParser.g:359:1: selected_table : a_table ( COMMA a_table )* -> ^( TABLENAMES ( a_table )+ ) ;
    public final OracleParserParser.selected_table_return selected_table() throws RecognitionException {
        OracleParserParser.selected_table_return retval = new OracleParserParser.selected_table_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA192=null;
        OracleParserParser.a_table_return a_table191 = null;

        OracleParserParser.a_table_return a_table193 = null;


        CommonTree COMMA192_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_a_table=new RewriteRuleSubtreeStream(adaptor,"rule a_table");
        try {
            // OracleParser.g:360:2: ( a_table ( COMMA a_table )* -> ^( TABLENAMES ( a_table )+ ) )
            // OracleParser.g:360:3: a_table ( COMMA a_table )*
            {
            pushFollow(FOLLOW_a_table_in_selected_table1682);
            a_table191=a_table();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_a_table.add(a_table191.getTree());
            // OracleParser.g:360:11: ( COMMA a_table )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==COMMA) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // OracleParser.g:360:12: COMMA a_table
            	    {
            	    COMMA192=(Token)match(input,COMMA,FOLLOW_COMMA_in_selected_table1685); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA192);

            	    pushFollow(FOLLOW_a_table_in_selected_table1687);
            	    a_table193=a_table();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_a_table.add(a_table193.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
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
            // 360:27: -> ^( TABLENAMES ( a_table )+ )
            {
                // OracleParser.g:360:29: ^( TABLENAMES ( a_table )+ )
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
    // OracleParser.g:362:1: a_table : table_spec ( alias )? -> ^( TABLENAME table_spec ( alias )? ) ;
    public final OracleParserParser.a_table_return a_table() throws RecognitionException {
        OracleParserParser.a_table_return retval = new OracleParserParser.a_table_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        OracleParserParser.table_spec_return table_spec194 = null;

        OracleParserParser.alias_return alias195 = null;


        RewriteRuleSubtreeStream stream_alias=new RewriteRuleSubtreeStream(adaptor,"rule alias");
        RewriteRuleSubtreeStream stream_table_spec=new RewriteRuleSubtreeStream(adaptor,"rule table_spec");
        try {
            // OracleParser.g:363:2: ( table_spec ( alias )? -> ^( TABLENAME table_spec ( alias )? ) )
            // OracleParser.g:363:3: table_spec ( alias )?
            {
            pushFollow(FOLLOW_table_spec_in_a_table1705);
            table_spec194=table_spec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_table_spec.add(table_spec194.getTree());
            // OracleParser.g:363:15: ( alias )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ID||LA51_0==102) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // OracleParser.g:363:15: alias
                    {
                    pushFollow(FOLLOW_alias_in_a_table1708);
                    alias195=alias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_alias.add(alias195.getTree());

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
            // 363:21: -> ^( TABLENAME table_spec ( alias )? )
            {
                // OracleParser.g:363:23: ^( TABLENAME table_spec ( alias )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLENAME, "TABLENAME"), root_1);

                adaptor.addChild(root_1, stream_table_spec.nextTree());
                // OracleParser.g:363:46: ( alias )?
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
    // OracleParser.g:365:1: table_spec : ( ( schema_name DOT )? table_name | subquery );
    public final OracleParserParser.table_spec_return table_spec() throws RecognitionException {
        OracleParserParser.table_spec_return retval = new OracleParserParser.table_spec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT197=null;
        OracleParserParser.schema_name_return schema_name196 = null;

        OracleParserParser.table_name_return table_name198 = null;

        OracleParserParser.subquery_return subquery199 = null;


        CommonTree DOT197_tree=null;

        try {
            // OracleParser.g:366:2: ( ( schema_name DOT )? table_name | subquery )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==ID) ) {
                alt53=1;
            }
            else if ( (LA53_0==LPAREN) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // OracleParser.g:366:3: ( schema_name DOT )? table_name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // OracleParser.g:366:3: ( schema_name DOT )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==ID) ) {
                        int LA52_1 = input.LA(2);

                        if ( (LA52_1==DOT) ) {
                            alt52=1;
                        }
                    }
                    switch (alt52) {
                        case 1 :
                            // OracleParser.g:366:5: schema_name DOT
                            {
                            pushFollow(FOLLOW_schema_name_in_table_spec1729);
                            schema_name196=schema_name();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, schema_name196.getTree());
                            DOT197=(Token)match(input,DOT,FOLLOW_DOT_in_table_spec1731); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_table_name_in_table_spec1736);
                    table_name198=table_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, table_name198.getTree());

                    }
                    break;
                case 2 :
                    // OracleParser.g:367:4: subquery
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_subquery_in_table_spec1742);
                    subquery199=subquery();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery199.getTree());

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
    // OracleParser.g:371:1: table_name : identifier ;
    public final OracleParserParser.table_name_return table_name() throws RecognitionException {
        OracleParserParser.table_name_return retval = new OracleParserParser.table_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        OracleParserParser.identifier_return identifier200 = null;



        try {
            // OracleParser.g:372:2: ( identifier )
            // OracleParser.g:372:3: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_table_name1754);
            identifier200=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier200.getTree());

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
    // OracleParser.g:375:1: column_spec : ( ( table_name DOT )? identifier -> ^( COLUMN identifier ( table_name )? ) | ASTERISK -> ^( COLUMNAST ASTERISK ) );
    public final OracleParserParser.column_spec_return column_spec() throws RecognitionException {
        OracleParserParser.column_spec_return retval = new OracleParserParser.column_spec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT202=null;
        Token ASTERISK204=null;
        OracleParserParser.table_name_return table_name201 = null;

        OracleParserParser.identifier_return identifier203 = null;


        CommonTree DOT202_tree=null;
        CommonTree ASTERISK204_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // OracleParser.g:376:2: ( ( table_name DOT )? identifier -> ^( COLUMN identifier ( table_name )? ) | ASTERISK -> ^( COLUMNAST ASTERISK ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==ID) ) {
                alt55=1;
            }
            else if ( (LA55_0==ASTERISK) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // OracleParser.g:376:3: ( table_name DOT )? identifier
                    {
                    // OracleParser.g:376:3: ( table_name DOT )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==ID) ) {
                        int LA54_1 = input.LA(2);

                        if ( (LA54_1==DOT) ) {
                            alt54=1;
                        }
                    }
                    switch (alt54) {
                        case 1 :
                            // OracleParser.g:376:4: table_name DOT
                            {
                            pushFollow(FOLLOW_table_name_in_column_spec1766);
                            table_name201=table_name();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_table_name.add(table_name201.getTree());
                            DOT202=(Token)match(input,DOT,FOLLOW_DOT_in_column_spec1768); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(DOT202);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_identifier_in_column_spec1772);
                    identifier203=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier203.getTree());


                    // AST REWRITE
                    // elements: identifier, table_name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 376:32: -> ^( COLUMN identifier ( table_name )? )
                    {
                        // OracleParser.g:376:34: ^( COLUMN identifier ( table_name )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COLUMN, "COLUMN"), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        // OracleParser.g:376:54: ( table_name )?
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
                    // OracleParser.g:377:3: ASTERISK
                    {
                    ASTERISK204=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_column_spec1786); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASTERISK.add(ASTERISK204);



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
                    // 377:11: -> ^( COLUMNAST ASTERISK )
                    {
                        // OracleParser.g:377:13: ^( COLUMNAST ASTERISK )
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
    // OracleParser.g:380:1: schema_name : identifier ;
    public final OracleParserParser.schema_name_return schema_name() throws RecognitionException {
        OracleParserParser.schema_name_return retval = new OracleParserParser.schema_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        OracleParserParser.identifier_return identifier205 = null;



        try {
            // OracleParser.g:381:2: ( identifier )
            // OracleParser.g:381:3: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_schema_name1802);
            identifier205=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier205.getTree());

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
    // OracleParser.g:384:1: boolean_literal : ( 'TRUE' | 'FALSE' );
    public final OracleParserParser.boolean_literal_return boolean_literal() throws RecognitionException {
        OracleParserParser.boolean_literal_return retval = new OracleParserParser.boolean_literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set206=null;

        CommonTree set206_tree=null;

        try {
            // OracleParser.g:385:2: ( 'TRUE' | 'FALSE' )
            // OracleParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set206=(Token)input.LT(1);
            if ( (input.LA(1)>=104 && input.LA(1)<=105) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set206));
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
    // OracleParser.g:388:1: alias : ( 'AS' )? identifier -> ^( AS identifier ) ;
    public final OracleParserParser.alias_return alias() throws RecognitionException {
        OracleParserParser.alias_return retval = new OracleParserParser.alias_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal207=null;
        OracleParserParser.identifier_return identifier208 = null;


        CommonTree string_literal207_tree=null;
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // OracleParser.g:389:2: ( ( 'AS' )? identifier -> ^( AS identifier ) )
            // OracleParser.g:389:4: ( 'AS' )? identifier
            {
            // OracleParser.g:389:4: ( 'AS' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==102) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // OracleParser.g:389:6: 'AS'
                    {
                    string_literal207=(Token)match(input,102,FOLLOW_102_in_alias1832); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_102.add(string_literal207);


                    }
                    break;

            }

            pushFollow(FOLLOW_identifier_in_alias1836);
            identifier208=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier208.getTree());


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
            // 389:23: -> ^( AS identifier )
            {
                // OracleParser.g:389:25: ^( AS identifier )
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
    // OracleParser.g:392:1: identifier : ID ;
    public final OracleParserParser.identifier_return identifier() throws RecognitionException {
        OracleParserParser.identifier_return retval = new OracleParserParser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID209=null;

        CommonTree ID209_tree=null;

        try {
            // OracleParser.g:393:2: ( ID )
            // OracleParser.g:393:4: ID
            {
            root_0 = (CommonTree)adaptor.nil();

            ID209=(Token)match(input,ID,FOLLOW_ID_in_identifier1854); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID209_tree = (CommonTree)adaptor.create(ID209);
            adaptor.addChild(root_0, ID209_tree);
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
    // OracleParser.g:472:1: quoted_string : QUOTED_STRING ;
    public final OracleParserParser.quoted_string_return quoted_string() throws RecognitionException {
        OracleParserParser.quoted_string_return retval = new OracleParserParser.quoted_string_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUOTED_STRING210=null;

        CommonTree QUOTED_STRING210_tree=null;

        try {
            // OracleParser.g:473:2: ( QUOTED_STRING )
            // OracleParser.g:473:4: QUOTED_STRING
            {
            root_0 = (CommonTree)adaptor.nil();

            QUOTED_STRING210=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_quoted_string2224); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            QUOTED_STRING210_tree = (CommonTree)adaptor.create(QUOTED_STRING210);
            adaptor.addChild(root_0, QUOTED_STRING210_tree);
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

    public static class selectClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selectClause"
    // OracleParser.g:515:1: selectClause : 'SELECT' ( indexClause )? select_list -> ^( SELECT ( indexClause )? select_list ) ;
    public final OracleParserParser.selectClause_return selectClause() throws RecognitionException {
        OracleParserParser.selectClause_return retval = new OracleParserParser.selectClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal211=null;
        OracleParserParser.indexClause_return indexClause212 = null;

        OracleParserParser.select_list_return select_list213 = null;


        CommonTree string_literal211_tree=null;
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_select_list=new RewriteRuleSubtreeStream(adaptor,"rule select_list");
        RewriteRuleSubtreeStream stream_indexClause=new RewriteRuleSubtreeStream(adaptor,"rule indexClause");
        try {
            // OracleParser.g:516:5: ( 'SELECT' ( indexClause )? select_list -> ^( SELECT ( indexClause )? select_list ) )
            // OracleParser.g:516:6: 'SELECT' ( indexClause )? select_list
            {
            string_literal211=(Token)match(input,106,FOLLOW_106_in_selectClause2413); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_106.add(string_literal211);

            // OracleParser.g:516:16: ( indexClause )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==107) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // OracleParser.g:516:16: indexClause
                    {
                    pushFollow(FOLLOW_indexClause_in_selectClause2416);
                    indexClause212=indexClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_indexClause.add(indexClause212.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_select_list_in_selectClause2419);
            select_list213=select_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_select_list.add(select_list213.getTree());


            // AST REWRITE
            // elements: select_list, indexClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 516:40: -> ^( SELECT ( indexClause )? select_list )
            {
                // OracleParser.g:516:42: ^( SELECT ( indexClause )? select_list )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SELECT, "SELECT"), root_1);

                // OracleParser.g:516:52: ( indexClause )?
                if ( stream_indexClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_indexClause.nextTree());

                }
                stream_indexClause.reset();
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

    public static class select_command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select_command"
    // OracleParser.g:519:1: select_command : selectClause ( fromClause )? ( whereClause )? ( groupByClause )? ( orderByClause )? ( for_update )? ;
    public final OracleParserParser.select_command_return select_command() throws RecognitionException {
        OracleParserParser.select_command_return retval = new OracleParserParser.select_command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        OracleParserParser.selectClause_return selectClause214 = null;

        OracleParserParser.fromClause_return fromClause215 = null;

        OracleParserParser.whereClause_return whereClause216 = null;

        OracleParserParser.groupByClause_return groupByClause217 = null;

        OracleParserParser.orderByClause_return orderByClause218 = null;

        OracleParserParser.for_update_return for_update219 = null;



        try {
            // OracleParser.g:520:6: ( selectClause ( fromClause )? ( whereClause )? ( groupByClause )? ( orderByClause )? ( for_update )? )
            // OracleParser.g:520:8: selectClause ( fromClause )? ( whereClause )? ( groupByClause )? ( orderByClause )? ( for_update )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_selectClause_in_select_command2450);
            selectClause214=selectClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, selectClause214.getTree());
            // OracleParser.g:520:21: ( fromClause )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==103) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // OracleParser.g:520:22: fromClause
                    {
                    pushFollow(FOLLOW_fromClause_in_select_command2453);
                    fromClause215=fromClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fromClause215.getTree());

                    }
                    break;

            }

            // OracleParser.g:520:35: ( whereClause )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==89) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // OracleParser.g:520:36: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_select_command2458);
                    whereClause216=whereClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whereClause216.getTree());

                    }
                    break;

            }

            // OracleParser.g:520:50: ( groupByClause )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==86) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // OracleParser.g:520:50: groupByClause
                    {
                    pushFollow(FOLLOW_groupByClause_in_select_command2462);
                    groupByClause217=groupByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, groupByClause217.getTree());

                    }
                    break;

            }

            // OracleParser.g:520:65: ( orderByClause )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==88) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // OracleParser.g:520:66: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_select_command2466);
                    orderByClause218=orderByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, orderByClause218.getTree());

                    }
                    break;

            }

            // OracleParser.g:520:82: ( for_update )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==112) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // OracleParser.g:520:82: for_update
                    {
                    pushFollow(FOLLOW_for_update_in_select_command2470);
                    for_update219=for_update();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_update219.getTree());

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
    // OracleParser.g:522:2: indexClause : '/*' '+' ( hints )+ '*/' -> ( hints )+ ;
    public final OracleParserParser.indexClause_return indexClause() throws RecognitionException {
        OracleParserParser.indexClause_return retval = new OracleParserParser.indexClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal220=null;
        Token char_literal221=null;
        Token string_literal223=null;
        OracleParserParser.hints_return hints222 = null;


        CommonTree string_literal220_tree=null;
        CommonTree char_literal221_tree=null;
        CommonTree string_literal223_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleSubtreeStream stream_hints=new RewriteRuleSubtreeStream(adaptor,"rule hints");
        try {
            // OracleParser.g:523:3: ( '/*' '+' ( hints )+ '*/' -> ( hints )+ )
            // OracleParser.g:523:4: '/*' '+' ( hints )+ '*/'
            {
            string_literal220=(Token)match(input,107,FOLLOW_107_in_indexClause2486); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_107.add(string_literal220);

            char_literal221=(Token)match(input,PLUS,FOLLOW_PLUS_in_indexClause2488); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PLUS.add(char_literal221);

            // OracleParser.g:523:13: ( hints )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==ID) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // OracleParser.g:523:13: hints
            	    {
            	    pushFollow(FOLLOW_hints_in_indexClause2490);
            	    hints222=hints();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hints.add(hints222.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
            } while (true);

            string_literal223=(Token)match(input,108,FOLLOW_108_in_indexClause2493); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_108.add(string_literal223);



            // AST REWRITE
            // elements: hints
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 523:24: -> ( hints )+
            {
                if ( !(stream_hints.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_hints.hasNext() ) {
                    adaptor.addChild(root_0, stream_hints.nextTree());

                }
                stream_hints.reset();

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
    // $ANTLR end "indexClause"

    public static class hints_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hints"
    // OracleParser.g:526:2: hints : {...}? ID ( LPAREN identifier ( ( COMMA )? identifier )* RPAREN )? -> ^( ID ( identifier )* ) ;
    public final OracleParserParser.hints_return hints() throws RecognitionException {
        OracleParserParser.hints_return retval = new OracleParserParser.hints_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID224=null;
        Token LPAREN225=null;
        Token COMMA227=null;
        Token RPAREN229=null;
        OracleParserParser.identifier_return identifier226 = null;

        OracleParserParser.identifier_return identifier228 = null;


        CommonTree ID224_tree=null;
        CommonTree LPAREN225_tree=null;
        CommonTree COMMA227_tree=null;
        CommonTree RPAREN229_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // OracleParser.g:527:3: ({...}? ID ( LPAREN identifier ( ( COMMA )? identifier )* RPAREN )? -> ^( ID ( identifier )* ) )
            // OracleParser.g:527:4: {...}? ID ( LPAREN identifier ( ( COMMA )? identifier )* RPAREN )?
            {
            if ( !((hintReg.containsKey(input.LT(1).getText().toUpperCase()))) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "hints", "hintReg.containsKey(input.LT(1).getText().toUpperCase())");
            }
            ID224=(Token)match(input,ID,FOLLOW_ID_in_hints2517); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID224);

            // OracleParser.g:528:7: ( LPAREN identifier ( ( COMMA )? identifier )* RPAREN )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==LPAREN) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // OracleParser.g:528:8: LPAREN identifier ( ( COMMA )? identifier )* RPAREN
                    {
                    LPAREN225=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_hints2520); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN225);

                    pushFollow(FOLLOW_identifier_in_hints2522);
                    identifier226=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier226.getTree());
                    // OracleParser.g:528:26: ( ( COMMA )? identifier )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==COMMA||LA65_0==ID) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // OracleParser.g:528:27: ( COMMA )? identifier
                    	    {
                    	    // OracleParser.g:528:27: ( COMMA )?
                    	    int alt64=2;
                    	    int LA64_0 = input.LA(1);

                    	    if ( (LA64_0==COMMA) ) {
                    	        alt64=1;
                    	    }
                    	    switch (alt64) {
                    	        case 1 :
                    	            // OracleParser.g:528:27: COMMA
                    	            {
                    	            COMMA227=(Token)match(input,COMMA,FOLLOW_COMMA_in_hints2525); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA227);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_identifier_in_hints2528);
                    	    identifier228=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier228.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    RPAREN229=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_hints2532); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN229);


                    }
                    break;

            }



            // AST REWRITE
            // elements: ID, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 529:4: -> ^( ID ( identifier )* )
            {
                // OracleParser.g:529:6: ^( ID ( identifier )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ID.nextNode(), root_1);

                // OracleParser.g:529:11: ( identifier )*
                while ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();

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
    // $ANTLR end "hints"

    public static class insert_command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "insert_command"
    // OracleParser.g:532:1: insert_command : 'INSERT' ( indexClause )? 'INTO' selected_table ( LPAREN column_specs RPAREN )? ( 'VALUES' LPAREN values RPAREN ) -> ^( INSERT ( indexClause )? selected_table column_specs values ) ;
    public final OracleParserParser.insert_command_return insert_command() throws RecognitionException {
        OracleParserParser.insert_command_return retval = new OracleParserParser.insert_command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal230=null;
        Token string_literal232=null;
        Token LPAREN234=null;
        Token RPAREN236=null;
        Token string_literal237=null;
        Token LPAREN238=null;
        Token RPAREN240=null;
        OracleParserParser.indexClause_return indexClause231 = null;

        OracleParserParser.selected_table_return selected_table233 = null;

        OracleParserParser.column_specs_return column_specs235 = null;

        OracleParserParser.values_return values239 = null;


        CommonTree string_literal230_tree=null;
        CommonTree string_literal232_tree=null;
        CommonTree LPAREN234_tree=null;
        CommonTree RPAREN236_tree=null;
        CommonTree string_literal237_tree=null;
        CommonTree LPAREN238_tree=null;
        CommonTree RPAREN240_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_selected_table=new RewriteRuleSubtreeStream(adaptor,"rule selected_table");
        RewriteRuleSubtreeStream stream_values=new RewriteRuleSubtreeStream(adaptor,"rule values");
        RewriteRuleSubtreeStream stream_indexClause=new RewriteRuleSubtreeStream(adaptor,"rule indexClause");
        RewriteRuleSubtreeStream stream_column_specs=new RewriteRuleSubtreeStream(adaptor,"rule column_specs");
        try {
            // OracleParser.g:533:2: ( 'INSERT' ( indexClause )? 'INTO' selected_table ( LPAREN column_specs RPAREN )? ( 'VALUES' LPAREN values RPAREN ) -> ^( INSERT ( indexClause )? selected_table column_specs values ) )
            // OracleParser.g:533:4: 'INSERT' ( indexClause )? 'INTO' selected_table ( LPAREN column_specs RPAREN )? ( 'VALUES' LPAREN values RPAREN )
            {
            string_literal230=(Token)match(input,109,FOLLOW_109_in_insert_command2559); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_109.add(string_literal230);

            // OracleParser.g:533:13: ( indexClause )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==107) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // OracleParser.g:533:13: indexClause
                    {
                    pushFollow(FOLLOW_indexClause_in_insert_command2561);
                    indexClause231=indexClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_indexClause.add(indexClause231.getTree());

                    }
                    break;

            }

            string_literal232=(Token)match(input,110,FOLLOW_110_in_insert_command2564); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_110.add(string_literal232);

            pushFollow(FOLLOW_selected_table_in_insert_command2566);
            selected_table233=selected_table();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selected_table.add(selected_table233.getTree());
            // OracleParser.g:534:3: ( LPAREN column_specs RPAREN )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==LPAREN) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // OracleParser.g:534:5: LPAREN column_specs RPAREN
                    {
                    LPAREN234=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_command2572); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN234);

                    pushFollow(FOLLOW_column_specs_in_insert_command2574);
                    column_specs235=column_specs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_column_specs.add(column_specs235.getTree());
                    RPAREN236=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_command2577); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN236);


                    }
                    break;

            }

            // OracleParser.g:535:3: ( 'VALUES' LPAREN values RPAREN )
            // OracleParser.g:535:4: 'VALUES' LPAREN values RPAREN
            {
            string_literal237=(Token)match(input,111,FOLLOW_111_in_insert_command2585); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_111.add(string_literal237);

            LPAREN238=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_command2587); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN238);

            pushFollow(FOLLOW_values_in_insert_command2589);
            values239=values();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_values.add(values239.getTree());
            RPAREN240=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_command2591); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN240);


            }



            // AST REWRITE
            // elements: selected_table, column_specs, values, indexClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 536:4: -> ^( INSERT ( indexClause )? selected_table column_specs values )
            {
                // OracleParser.g:536:6: ^( INSERT ( indexClause )? selected_table column_specs values )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INSERT, "INSERT"), root_1);

                // OracleParser.g:536:15: ( indexClause )?
                if ( stream_indexClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_indexClause.nextTree());

                }
                stream_indexClause.reset();
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

    public static class for_update_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_update"
    // OracleParser.g:538:1: for_update : 'FOR' 'UPDATE' ( of_statement )? ( wait_statement )? -> ^( FORUPDATE ( of_statement )? ( wait_statement )? ) ;
    public final OracleParserParser.for_update_return for_update() throws RecognitionException {
        OracleParserParser.for_update_return retval = new OracleParserParser.for_update_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal241=null;
        Token string_literal242=null;
        OracleParserParser.of_statement_return of_statement243 = null;

        OracleParserParser.wait_statement_return wait_statement244 = null;


        CommonTree string_literal241_tree=null;
        CommonTree string_literal242_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_of_statement=new RewriteRuleSubtreeStream(adaptor,"rule of_statement");
        RewriteRuleSubtreeStream stream_wait_statement=new RewriteRuleSubtreeStream(adaptor,"rule wait_statement");
        try {
            // OracleParser.g:539:2: ( 'FOR' 'UPDATE' ( of_statement )? ( wait_statement )? -> ^( FORUPDATE ( of_statement )? ( wait_statement )? ) )
            // OracleParser.g:539:3: 'FOR' 'UPDATE' ( of_statement )? ( wait_statement )?
            {
            string_literal241=(Token)match(input,112,FOLLOW_112_in_for_update2617); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_112.add(string_literal241);

            string_literal242=(Token)match(input,113,FOLLOW_113_in_for_update2619); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_113.add(string_literal242);

            // OracleParser.g:539:18: ( of_statement )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==114) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // OracleParser.g:539:18: of_statement
                    {
                    pushFollow(FOLLOW_of_statement_in_for_update2621);
                    of_statement243=of_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_of_statement.add(of_statement243.getTree());

                    }
                    break;

            }

            // OracleParser.g:539:32: ( wait_statement )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=115 && LA70_0<=116)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // OracleParser.g:539:32: wait_statement
                    {
                    pushFollow(FOLLOW_wait_statement_in_for_update2624);
                    wait_statement244=wait_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_wait_statement.add(wait_statement244.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: wait_statement, of_statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 539:47: -> ^( FORUPDATE ( of_statement )? ( wait_statement )? )
            {
                // OracleParser.g:539:49: ^( FORUPDATE ( of_statement )? ( wait_statement )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORUPDATE, "FORUPDATE"), root_1);

                // OracleParser.g:539:61: ( of_statement )?
                if ( stream_of_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_of_statement.nextTree());

                }
                stream_of_statement.reset();
                // OracleParser.g:539:75: ( wait_statement )?
                if ( stream_wait_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_wait_statement.nextTree());

                }
                stream_wait_statement.reset();

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
    // $ANTLR end "for_update"

    public static class of_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "of_statement"
    // OracleParser.g:541:1: of_statement : 'OF' expr -> ^( OF expr ) ;
    public final OracleParserParser.of_statement_return of_statement() throws RecognitionException {
        OracleParserParser.of_statement_return retval = new OracleParserParser.of_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal245=null;
        OracleParserParser.expr_return expr246 = null;


        CommonTree string_literal245_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // OracleParser.g:542:2: ( 'OF' expr -> ^( OF expr ) )
            // OracleParser.g:542:3: 'OF' expr
            {
            string_literal245=(Token)match(input,114,FOLLOW_114_in_of_statement2644); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_114.add(string_literal245);

            pushFollow(FOLLOW_expr_in_of_statement2646);
            expr246=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr246.getTree());


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
            // 542:12: -> ^( OF expr )
            {
                // OracleParser.g:542:14: ^( OF expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OF, "OF"), root_1);

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
    // $ANTLR end "of_statement"

    public static class wait_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "wait_statement"
    // OracleParser.g:544:1: wait_statement : ( 'NOWAIT' -> ^( NOWAIT ) | 'WAIT' N -> ^( WAIT N ) );
    public final OracleParserParser.wait_statement_return wait_statement() throws RecognitionException {
        OracleParserParser.wait_statement_return retval = new OracleParserParser.wait_statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal247=null;
        Token string_literal248=null;
        Token N249=null;

        CommonTree string_literal247_tree=null;
        CommonTree string_literal248_tree=null;
        CommonTree N249_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_N=new RewriteRuleTokenStream(adaptor,"token N");

        try {
            // OracleParser.g:545:2: ( 'NOWAIT' -> ^( NOWAIT ) | 'WAIT' N -> ^( WAIT N ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==115) ) {
                alt71=1;
            }
            else if ( (LA71_0==116) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // OracleParser.g:545:3: 'NOWAIT'
                    {
                    string_literal247=(Token)match(input,115,FOLLOW_115_in_wait_statement2661); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_115.add(string_literal247);



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
                    // 545:11: -> ^( NOWAIT )
                    {
                        // OracleParser.g:545:13: ^( NOWAIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NOWAIT, "NOWAIT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // OracleParser.g:546:3: 'WAIT' N
                    {
                    string_literal248=(Token)match(input,116,FOLLOW_116_in_wait_statement2669); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_116.add(string_literal248);

                    N249=(Token)match(input,N,FOLLOW_N_in_wait_statement2671); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_N.add(N249);



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
                    // 546:12: -> ^( WAIT N )
                    {
                        // OracleParser.g:546:14: ^( WAIT N )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WAIT, "WAIT"), root_1);

                        adaptor.addChild(root_1, stream_N.nextNode());

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
    // $ANTLR end "wait_statement"

    public static class delete_command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delete_command"
    // OracleParser.g:549:1: delete_command : 'DELETE' ( indexClause )? fromClause ( whereClause )? ( orderByClause )? -> ^( DELETE ( indexClause )? fromClause ( whereClause )? ( orderByClause )? ) ;
    public final OracleParserParser.delete_command_return delete_command() throws RecognitionException {
        OracleParserParser.delete_command_return retval = new OracleParserParser.delete_command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal250=null;
        OracleParserParser.indexClause_return indexClause251 = null;

        OracleParserParser.fromClause_return fromClause252 = null;

        OracleParserParser.whereClause_return whereClause253 = null;

        OracleParserParser.orderByClause_return orderByClause254 = null;


        CommonTree string_literal250_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_indexClause=new RewriteRuleSubtreeStream(adaptor,"rule indexClause");
        RewriteRuleSubtreeStream stream_orderByClause=new RewriteRuleSubtreeStream(adaptor,"rule orderByClause");
        RewriteRuleSubtreeStream stream_fromClause=new RewriteRuleSubtreeStream(adaptor,"rule fromClause");
        try {
            // OracleParser.g:550:2: ( 'DELETE' ( indexClause )? fromClause ( whereClause )? ( orderByClause )? -> ^( DELETE ( indexClause )? fromClause ( whereClause )? ( orderByClause )? ) )
            // OracleParser.g:550:3: 'DELETE' ( indexClause )? fromClause ( whereClause )? ( orderByClause )?
            {
            string_literal250=(Token)match(input,117,FOLLOW_117_in_delete_command2688); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_117.add(string_literal250);

            // OracleParser.g:550:12: ( indexClause )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==107) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // OracleParser.g:550:12: indexClause
                    {
                    pushFollow(FOLLOW_indexClause_in_delete_command2690);
                    indexClause251=indexClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_indexClause.add(indexClause251.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_fromClause_in_delete_command2693);
            fromClause252=fromClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fromClause.add(fromClause252.getTree());
            // OracleParser.g:550:36: ( whereClause )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==89) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // OracleParser.g:550:36: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_delete_command2695);
                    whereClause253=whereClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_whereClause.add(whereClause253.getTree());

                    }
                    break;

            }

            // OracleParser.g:550:49: ( orderByClause )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==88) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // OracleParser.g:550:49: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_delete_command2698);
                    orderByClause254=orderByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_orderByClause.add(orderByClause254.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: whereClause, indexClause, orderByClause, fromClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 550:65: -> ^( DELETE ( indexClause )? fromClause ( whereClause )? ( orderByClause )? )
            {
                // OracleParser.g:550:67: ^( DELETE ( indexClause )? fromClause ( whereClause )? ( orderByClause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DELETE, "DELETE"), root_1);

                // OracleParser.g:550:76: ( indexClause )?
                if ( stream_indexClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_indexClause.nextTree());

                }
                stream_indexClause.reset();
                adaptor.addChild(root_1, stream_fromClause.nextTree());
                // OracleParser.g:550:100: ( whereClause )?
                if ( stream_whereClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_whereClause.nextTree());

                }
                stream_whereClause.reset();
                // OracleParser.g:550:113: ( orderByClause )?
                if ( stream_orderByClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_orderByClause.nextTree());

                }
                stream_orderByClause.reset();

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
    // $ANTLR end "delete_command"

    public static class update_command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "update_command"
    // OracleParser.g:552:1: update_command : 'UPDATE' ( indexClause )? selected_table setclause ( whereClause )? -> ^( UPDATE selected_table setclause ( whereClause )? ) ;
    public final OracleParserParser.update_command_return update_command() throws RecognitionException {
        OracleParserParser.update_command_return retval = new OracleParserParser.update_command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal255=null;
        OracleParserParser.indexClause_return indexClause256 = null;

        OracleParserParser.selected_table_return selected_table257 = null;

        OracleParserParser.setclause_return setclause258 = null;

        OracleParserParser.whereClause_return whereClause259 = null;


        CommonTree string_literal255_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_selected_table=new RewriteRuleSubtreeStream(adaptor,"rule selected_table");
        RewriteRuleSubtreeStream stream_indexClause=new RewriteRuleSubtreeStream(adaptor,"rule indexClause");
        RewriteRuleSubtreeStream stream_setclause=new RewriteRuleSubtreeStream(adaptor,"rule setclause");
        try {
            // OracleParser.g:553:2: ( 'UPDATE' ( indexClause )? selected_table setclause ( whereClause )? -> ^( UPDATE selected_table setclause ( whereClause )? ) )
            // OracleParser.g:553:3: 'UPDATE' ( indexClause )? selected_table setclause ( whereClause )?
            {
            string_literal255=(Token)match(input,113,FOLLOW_113_in_update_command2726); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_113.add(string_literal255);

            // OracleParser.g:553:12: ( indexClause )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==107) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // OracleParser.g:553:12: indexClause
                    {
                    pushFollow(FOLLOW_indexClause_in_update_command2728);
                    indexClause256=indexClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_indexClause.add(indexClause256.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_selected_table_in_update_command2731);
            selected_table257=selected_table();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selected_table.add(selected_table257.getTree());
            pushFollow(FOLLOW_setclause_in_update_command2734);
            setclause258=setclause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_setclause.add(setclause258.getTree());
            // OracleParser.g:553:51: ( whereClause )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==89) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // OracleParser.g:553:51: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_update_command2736);
                    whereClause259=whereClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_whereClause.add(whereClause259.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: whereClause, setclause, selected_table
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 553:65: -> ^( UPDATE selected_table setclause ( whereClause )? )
            {
                // OracleParser.g:553:67: ^( UPDATE selected_table setclause ( whereClause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UPDATE, "UPDATE"), root_1);

                adaptor.addChild(root_1, stream_selected_table.nextTree());
                adaptor.addChild(root_1, stream_setclause.nextTree());
                // OracleParser.g:553:101: ( whereClause )?
                if ( stream_whereClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_whereClause.nextTree());

                }
                stream_whereClause.reset();

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
    // $ANTLR end "update_command"

    // $ANTLR start synpred1_OracleParser
    public final void synpred1_OracleParser_fragment() throws RecognitionException {   
        // OracleParser.g:174:3: ( LPAREN condition_or RPAREN )
        // OracleParser.g:174:4: LPAREN condition_or RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred1_OracleParser515); if (state.failed) return ;
        pushFollow(FOLLOW_condition_or_in_synpred1_OracleParser517);
        condition_or();

        state._fsp--;
        if (state.failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred1_OracleParser519); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_OracleParser

    // Delegated rules

    public final boolean synpred1_OracleParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_OracleParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\16\uffff";
    static final String DFA7_eofS =
        "\16\uffff";
    static final String DFA7_minS =
        "\1\70\1\0\14\uffff";
    static final String DFA7_maxS =
        "\1\151\1\0\14\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\12\uffff\1\1";
    static final String DFA7_specialS =
        "\1\uffff\1\0\14\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\1\uffff\1\2\5\uffff\3\2\12\uffff\2\2\3\uffff\1\2\16\uffff"+
            "\1\2\2\uffff\2\2\2\uffff\2\2",
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

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "173:1: condition_PAREN : ( ( LPAREN condition_or RPAREN )=> LPAREN condition_or RPAREN -> ^( PRIORITY condition_or ) | condition_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_1 = input.LA(1);

                         
                        int index7_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_OracleParser()) ) {s = 13;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index7_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_start_rule_in_beg264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_command_in_start_rule276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_command_in_start_rule280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_command_in_start_rule284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_command_in_start_rule288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_setclause300 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_updateColumnSpecs_in_setclause302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateColumnSpec_in_updateColumnSpecs319 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_COMMA_in_updateColumnSpecs322 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_updateColumnSpec_in_updateColumnSpecs324 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_columnNameInUpdate_in_updateColumnSpec342 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_EQ_in_updateColumnSpec344 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_expr_in_updateColumnSpec347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_groupByClause357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_groupByClause359 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_columnNamesAfterWhere_in_groupByClause361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_orderByClause380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_orderByClause382 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_columnNamesAfterWhere_in_orderByClause384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnNameAfterWhere_in_columnNamesAfterWhere404 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_COMMA_in_columnNamesAfterWhere407 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_columnNameAfterWhere_in_columnNamesAfterWhere410 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_89_in_whereClause426 = new BitSet(new long[]{0x0500000000000000L,0x0000033204046007L});
    public static final BitSet FOLLOW_sqlCondition_in_whereClause428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_sqlCondition444 = new BitSet(new long[]{0x0500000000000000L,0x0000033204046007L});
    public static final BitSet FOLLOW_condition_or_in_sqlCondition446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_or_in_sqlCondition457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_and_in_condition_or475 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_condition_or479 = new BitSet(new long[]{0x0500000000000000L,0x0000033204046007L});
    public static final BitSet FOLLOW_condition_and_in_condition_or482 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_condition_PAREN_in_condition_and495 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_condition_and499 = new BitSet(new long[]{0x0500000000000000L,0x0000033204046007L});
    public static final BitSet FOLLOW_condition_PAREN_in_condition_and502 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_condition_PAREN522 = new BitSet(new long[]{0x0500000000000000L,0x0000033204046007L});
    public static final BitSet FOLLOW_condition_or_in_condition_PAREN524 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_condition_PAREN526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_expr_in_condition_PAREN536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_left_in_condition_expr546 = new BitSet(new long[]{0x0080000000000000L,0x0000000C640003E0L});
    public static final BitSet FOLLOW_comparisonCondition_in_condition_expr551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inCondition_in_condition_expr557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isCondition_in_condition_expr563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_likeCondition_in_condition_expr570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_betweenCondition_in_condition_expr576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_condition_left590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_betweenCondition606 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_betweenCondition608 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_between_and_in_betweenCondition610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_betweenCondition621 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_between_and_in_betweenCondition623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_between_and_expression_in_between_and640 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_between_and642 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_between_and_expression_in_between_and645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_bit_in_between_and_expression657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_isCondition669 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_isCondition671 = new BitSet(new long[]{0x0000000000000000L,0x0000000380000000L});
    public static final BitSet FOLLOW_condition_is_valobject_in_isCondition673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_isCondition683 = new BitSet(new long[]{0x0000000000000000L,0x0000000380000000L});
    public static final BitSet FOLLOW_condition_is_valobject_in_isCondition685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_condition_is_valobject703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_condition_is_valobject711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_condition_is_valobject719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_inCondition735 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_inCondition739 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_subquery_in_inCondition743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_inCondition749 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_inCondition_expr_bits_in_inCondition751 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_inCondition753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_likeCondition780 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_likeCondition781 = new BitSet(new long[]{0x0400000000000000L,0x0000001000040000L});
    public static final BitSet FOLLOW_like_value_in_likeCondition784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_likeCondition794 = new BitSet(new long[]{0x0400000000000000L,0x0000001000040000L});
    public static final BitSet FOLLOW_like_value_in_likeCondition796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_concat_value_in_like_value814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multi_concat_values_in_like_value819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lu_value_in_concat_values_func836 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_COMMA_in_concat_values_func838 = new BitSet(new long[]{0x0400000000000000L,0x0000001000040000L});
    public static final BitSet FOLLOW_lu_value_in_concat_values_func841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_concat_value_in_concat_values_func845 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_COMMA_in_concat_values_func847 = new BitSet(new long[]{0x0400000000000000L,0x0000001000040000L});
    public static final BitSet FOLLOW_lu_value_in_concat_values_func850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lu_value_in_concat_values_func854 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_COMMA_in_concat_values_func856 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_single_concat_value_in_concat_values_func859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_single_concat_value872 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_single_concat_value875 = new BitSet(new long[]{0x0600000000000000L,0x0000001000040000L});
    public static final BitSet FOLLOW_concat_values_func_in_single_concat_value877 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_concat_value880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lu_value_in_multi_concat_values900 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_DOUBLEVERTBAR_in_multi_concat_values902 = new BitSet(new long[]{0x0400000000000000L,0x0000001000040000L});
    public static final BitSet FOLLOW_lu_value_in_multi_concat_values905 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_100_in_lu_value918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quoted_string_in_lu_value922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_inCondition_expr_bits940 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_COMMA_in_inCondition_expr_bits942 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_expr_in_inCondition_expr_bits944 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_columnNameAfterWhere_in_identifiers964 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_COMMA_in_identifiers967 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_identifier_in_identifiers969 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_relational_op_in_comparisonCondition981 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_bit_in_expr1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_expr1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_subquery1021 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_select_command_in_subquery1023 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_subquery1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_add_in_expr_bit1043 = new BitSet(new long[]{0xF800000000000002L});
    public static final BitSet FOLLOW_BITOR_in_expr_bit1049 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_BITAND_in_expr_bit1054 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_BITXOR_in_expr_bit1057 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_SHIFTLEFT_in_expr_bit1060 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_SHIFTRIGHT_in_expr_bit1063 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_expr_add_in_expr_bit1068 = new BitSet(new long[]{0xF800000000000002L});
    public static final BitSet FOLLOW_expr_mul_in_expr_add1081 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_PLUS_in_expr_add1087 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_MINUS_in_expr_add1092 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_expr_mul_in_expr_add1098 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_expr_sign_in_expr_mul1112 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_ASTERISK_in_expr_mul1118 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_DIVIDE_in_expr_mul1123 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_expr_sign_in_expr_mul1128 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_PLUS_in_expr_sign1141 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_expr_pow_in_expr_sign1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_expr_sign1156 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_expr_pow_in_expr_sign1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_pow_in_expr_sign1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_expr_in_expr_pow1181 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_EXPONENT_in_expr_pow1185 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_expr_expr_in_expr_pow1188 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_value_in_expr_expr1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_literal_in_expr_expr1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_expr_expr1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr_expr1217 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_expr_expr1220 = new BitSet(new long[]{0x0700000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_values_func_in_expr_expr1222 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_expr_expr1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr_expr1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_expr_expr1250 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_expr_expr1252 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_values_func_in_expr_expr1254 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_expr_expr1256 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_ID_in_expr_expr1258 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_expr_expr1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_or_in_sql_condition1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relational_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_fromClause1320 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_selected_table_in_fromClause1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_displayed_column_in_select_list1334 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_COMMA_in_select_list1338 = new BitSet(new long[]{0x0400000000000000L,0x0000000000002004L});
    public static final BitSet FOLLOW_displayed_column_in_select_list1340 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ID_in_displayed_column1365 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_displayed_column1369 = new BitSet(new long[]{0x0700000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_values_func_in_displayed_column1371 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_displayed_column1374 = new BitSet(new long[]{0x0400000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_alias_in_displayed_column1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_displayed_column1395 = new BitSet(new long[]{0x0400000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_alias_in_displayed_column1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_alias_in_displayed_column1412 = new BitSet(new long[]{0x0400000000000000L,0x0000000000002004L});
    public static final BitSet FOLLOW_column_in_displayed_column1416 = new BitSet(new long[]{0x0400000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_alias_in_displayed_column1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_alias_in_columnNameAfterWhere1444 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_identifier_in_columnNameAfterWhere1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_alias_in_columnNameAfterWhere1462 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_identifier_in_columnNameAfterWhere1465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ASC_in_columnNameAfterWhere1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_alias_in_columnNameAfterWhere1483 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_identifier_in_columnNameAfterWhere1486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_DESC_in_columnNameAfterWhere1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_alias_in_columnNameInUpdate1511 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_identifier_in_columnNameInUpdate1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_table_alias1524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_table_alias1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_column1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_N_in_column1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_column1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_values1561 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_COMMA_in_values1565 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_expr_in_values1567 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_expr_in_values_func1586 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_COMMA_in_values_func1590 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_expr_in_values_func1593 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_N_in_value1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_value1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_value1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value1619 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_expr_in_value1622 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_value1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quoted_string_in_value1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_spec_in_value1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_spec_in_column_specs1655 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_COMMA_in_column_specs1659 = new BitSet(new long[]{0x0500000000000000L,0x0000001000046004L});
    public static final BitSet FOLLOW_column_spec_in_column_specs1661 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_a_table_in_selected_table1682 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_COMMA_in_selected_table1685 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_a_table_in_selected_table1687 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_table_spec_in_a_table1705 = new BitSet(new long[]{0x0400000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_alias_in_a_table1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schema_name_in_table_spec1729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_table_spec1731 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_table_name_in_table_spec1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_table_spec1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_table_name1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_name_in_column_spec1766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_column_spec1768 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_identifier_in_column_spec1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_column_spec1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_schema_name1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolean_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_alias1832 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_identifier_in_alias1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_quoted_string2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_selectClause2413 = new BitSet(new long[]{0x0400000000000000L,0x0000080000002004L});
    public static final BitSet FOLLOW_indexClause_in_selectClause2416 = new BitSet(new long[]{0x0400000000000000L,0x0000080000002004L});
    public static final BitSet FOLLOW_select_list_in_selectClause2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectClause_in_select_command2450 = new BitSet(new long[]{0x0000000000000002L,0x0001008003400000L});
    public static final BitSet FOLLOW_fromClause_in_select_command2453 = new BitSet(new long[]{0x0000000000000002L,0x0001000003400000L});
    public static final BitSet FOLLOW_whereClause_in_select_command2458 = new BitSet(new long[]{0x0000000000000002L,0x0001000001400000L});
    public static final BitSet FOLLOW_groupByClause_in_select_command2462 = new BitSet(new long[]{0x0000000000000002L,0x0001000001000000L});
    public static final BitSet FOLLOW_orderByClause_in_select_command2466 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_for_update_in_select_command2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_indexClause2486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_PLUS_in_indexClause2488 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_hints_in_indexClause2490 = new BitSet(new long[]{0x0400000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_indexClause2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_hints2517 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_hints2520 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_identifier_in_hints2522 = new BitSet(new long[]{0x0640000000000000L});
    public static final BitSet FOLLOW_COMMA_in_hints2525 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_identifier_in_hints2528 = new BitSet(new long[]{0x0640000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_hints2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_insert_command2559 = new BitSet(new long[]{0x0000000000000000L,0x0000480000000000L});
    public static final BitSet FOLLOW_indexClause_in_insert_command2561 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_insert_command2564 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_selected_table_in_insert_command2566 = new BitSet(new long[]{0x0100000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_command2572 = new BitSet(new long[]{0x0500000000000000L,0x0000001000046004L});
    public static final BitSet FOLLOW_column_specs_in_insert_command2574 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_command2577 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_insert_command2585 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_command2587 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_values_in_insert_command2589 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_command2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_for_update2617 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_for_update2619 = new BitSet(new long[]{0x0000000000000002L,0x001C000000000000L});
    public static final BitSet FOLLOW_of_statement_in_for_update2621 = new BitSet(new long[]{0x0000000000000002L,0x0018000000000000L});
    public static final BitSet FOLLOW_wait_statement_in_for_update2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_of_statement2644 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_expr_in_of_statement2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_wait_statement2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_wait_statement2669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_N_in_wait_statement2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_delete_command2688 = new BitSet(new long[]{0x0000000000000000L,0x0000088000000000L});
    public static final BitSet FOLLOW_indexClause_in_delete_command2690 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_fromClause_in_delete_command2693 = new BitSet(new long[]{0x0000000000000002L,0x0000000003000000L});
    public static final BitSet FOLLOW_whereClause_in_delete_command2695 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_orderByClause_in_delete_command2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_update_command2726 = new BitSet(new long[]{0x0500000000000000L,0x00000B3200046007L});
    public static final BitSet FOLLOW_indexClause_in_update_command2728 = new BitSet(new long[]{0x0500000000000000L,0x0000033200046007L});
    public static final BitSet FOLLOW_selected_table_in_update_command2731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_setclause_in_update_command2734 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_whereClause_in_update_command2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred1_OracleParser515 = new BitSet(new long[]{0x0500000000000000L,0x0000033204046007L});
    public static final BitSet FOLLOW_condition_or_in_synpred1_OracleParser517 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred1_OracleParser519 = new BitSet(new long[]{0x0000000000000002L});

}