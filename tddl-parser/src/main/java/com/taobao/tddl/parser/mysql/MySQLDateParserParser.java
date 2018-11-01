// $ANTLR 3.1.1 MySQLDateParser.g 2009-07-29 15:36:00

package com.taobao.tddl.parser.mysql;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.DFA;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.RewriteEarlyExitException;
import org.antlr.runtime.tree.RewriteRuleSubtreeStream;
import org.antlr.runtime.tree.RewriteRuleTokenStream;
import org.antlr.runtime.tree.TreeAdaptor;

public class MySQLDateParserParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TIMESTRING", "DATE", "QUOTA", "TIME", "NS", "SPLIT", "WS", "ID", "P", "ARROW", "DOUBLEVERTBAR", "RPAREN", "LPAREN", "LTH", "NOT_EQ", "LEQ", "GEQ", "GTH", "'\\''"
    };
    public static final int NS=8;
    public static final int T__22=22;
    public static final int SPLIT=9;
    public static final int GTH=21;
    public static final int P=12;
    public static final int DOUBLEVERTBAR=14;
    public static final int ID=11;
    public static final int EOF=-1;
    public static final int LPAREN=16;
    public static final int NOT_EQ=18;
    public static final int TIMESTRING=4;
    public static final int LTH=17;
    public static final int TIME=7;
    public static final int RPAREN=15;
    public static final int WS=10;
    public static final int QUOTA=6;
    public static final int ARROW=13;
    public static final int GEQ=20;
    public static final int DATE=5;
    public static final int LEQ=19;

    // delegates
    // delegators


        public MySQLDateParserParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public MySQLDateParserParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return MySQLDateParserParser.tokenNames; }
    public String getGrammarFileName() { return "MySQLDateParser.g"; }


    public static class quoted_string_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "quoted_string"
    // MySQLDateParser.g:23:1: quoted_string : time_quoted ;
    public final MySQLDateParserParser.quoted_string_return quoted_string() throws RecognitionException {
        MySQLDateParserParser.quoted_string_return retval = new MySQLDateParserParser.quoted_string_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        MySQLDateParserParser.time_quoted_return time_quoted1 = null;



        try {
            // MySQLDateParser.g:24:2: ( time_quoted )
            // MySQLDateParser.g:24:4: time_quoted
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_time_quoted_in_quoted_string61);
            time_quoted1=time_quoted();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, time_quoted1.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "quoted_string"

    public static class time_quoted_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time_quoted"
    // MySQLDateParser.g:26:1: time_quoted : ( ( '\\'' date_string ( time_string )? '\\'' )=> '\\'' datetime_string '\\'' -> datetime_string | quo );
    public final MySQLDateParserParser.time_quoted_return time_quoted() throws RecognitionException {
        MySQLDateParserParser.time_quoted_return retval = new MySQLDateParserParser.time_quoted_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal2=null;
        Token char_literal4=null;
        MySQLDateParserParser.datetime_string_return datetime_string3 = null;

        MySQLDateParserParser.quo_return quo5 = null;


        CommonTree char_literal2_tree=null;
        CommonTree char_literal4_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleSubtreeStream stream_datetime_string=new RewriteRuleSubtreeStream(adaptor,"rule datetime_string");
        try {
            // MySQLDateParser.g:27:2: ( ( '\\'' date_string ( time_string )? '\\'' )=> '\\'' datetime_string '\\'' -> datetime_string | quo )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // MySQLDateParser.g:27:3: ( '\\'' date_string ( time_string )? '\\'' )=> '\\'' datetime_string '\\''
                    {
                    char_literal2=(Token)match(input,22,FOLLOW_22_in_time_quoted84); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_22.add(char_literal2);

                    pushFollow(FOLLOW_datetime_string_in_time_quoted86);
                    datetime_string3=datetime_string();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_datetime_string.add(datetime_string3.getTree());
                    char_literal4=(Token)match(input,22,FOLLOW_22_in_time_quoted89); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_22.add(char_literal4);



                    // AST REWRITE
                    // elements: datetime_string
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 27:69: -> datetime_string
                    {
                        adaptor.addChild(root_0, stream_datetime_string.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // MySQLDateParser.g:28:3: quo
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_quo_in_time_quoted95);
                    quo5=quo();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, quo5.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "time_quoted"

    public static class datetime_string_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "datetime_string"
    // MySQLDateParser.g:30:1: datetime_string : date_string ( time_string )? -> ^( TIMESTRING date_string ( time_string )? ) ;
    public final MySQLDateParserParser.datetime_string_return datetime_string() throws RecognitionException {
        MySQLDateParserParser.datetime_string_return retval = new MySQLDateParserParser.datetime_string_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        MySQLDateParserParser.date_string_return date_string6 = null;

        MySQLDateParserParser.time_string_return time_string7 = null;


        RewriteRuleSubtreeStream stream_date_string=new RewriteRuleSubtreeStream(adaptor,"rule date_string");
        RewriteRuleSubtreeStream stream_time_string=new RewriteRuleSubtreeStream(adaptor,"rule time_string");
        try {
            // MySQLDateParser.g:31:2: ( date_string ( time_string )? -> ^( TIMESTRING date_string ( time_string )? ) )
            // MySQLDateParser.g:31:4: date_string ( time_string )?
            {
            pushFollow(FOLLOW_date_string_in_datetime_string105);
            date_string6=date_string();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_date_string.add(date_string6.getTree());
            // MySQLDateParser.g:31:17: ( time_string )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==NS) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // MySQLDateParser.g:31:17: time_string
                    {
                    pushFollow(FOLLOW_time_string_in_datetime_string108);
                    time_string7=time_string();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_time_string.add(time_string7.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: time_string, date_string
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 31:30: -> ^( TIMESTRING date_string ( time_string )? )
            {
                // MySQLDateParser.g:31:33: ^( TIMESTRING date_string ( time_string )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIMESTRING, "TIMESTRING"), root_1);

                adaptor.addChild(root_1, stream_date_string.nextTree());
                // MySQLDateParser.g:31:58: ( time_string )?
                if ( stream_time_string.hasNext() ) {
                    adaptor.addChild(root_1, stream_time_string.nextTree());

                }
                stream_time_string.reset();

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "datetime_string"

    public static class date_string_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date_string"
    // MySQLDateParser.g:33:1: date_string : NS SPLIT NS SPLIT NS -> ( ^( DATE NS ) )+ ;
    public final MySQLDateParserParser.date_string_return date_string() throws RecognitionException {
        MySQLDateParserParser.date_string_return retval = new MySQLDateParserParser.date_string_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NS8=null;
        Token SPLIT9=null;
        Token NS10=null;
        Token SPLIT11=null;
        Token NS12=null;

        CommonTree NS8_tree=null;
        CommonTree SPLIT9_tree=null;
        CommonTree NS10_tree=null;
        CommonTree SPLIT11_tree=null;
        CommonTree NS12_tree=null;
        RewriteRuleTokenStream stream_NS=new RewriteRuleTokenStream(adaptor,"token NS");
        RewriteRuleTokenStream stream_SPLIT=new RewriteRuleTokenStream(adaptor,"token SPLIT");

        try {
            // MySQLDateParser.g:34:2: ( NS SPLIT NS SPLIT NS -> ( ^( DATE NS ) )+ )
            // MySQLDateParser.g:34:4: NS SPLIT NS SPLIT NS
            {
            NS8=(Token)match(input,NS,FOLLOW_NS_in_date_string130); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NS.add(NS8);

            SPLIT9=(Token)match(input,SPLIT,FOLLOW_SPLIT_in_date_string132); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SPLIT.add(SPLIT9);

            NS10=(Token)match(input,NS,FOLLOW_NS_in_date_string134); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NS.add(NS10);

            SPLIT11=(Token)match(input,SPLIT,FOLLOW_SPLIT_in_date_string136); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SPLIT.add(SPLIT11);

            NS12=(Token)match(input,NS,FOLLOW_NS_in_date_string138); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NS.add(NS12);



            // AST REWRITE
            // elements: NS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 34:24: -> ( ^( DATE NS ) )+
            {
                if ( !(stream_NS.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_NS.hasNext() ) {
                    // MySQLDateParser.g:34:26: ^( DATE NS )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DATE, "DATE"), root_1);

                    adaptor.addChild(root_1, stream_NS.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_NS.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "date_string"

    public static class time_string_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time_string"
    // MySQLDateParser.g:45:1: time_string : NS SPLIT NS SPLIT NS -> ( ^( TIME NS ) )+ ;
    public final MySQLDateParserParser.time_string_return time_string() throws RecognitionException {
        MySQLDateParserParser.time_string_return retval = new MySQLDateParserParser.time_string_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NS13=null;
        Token SPLIT14=null;
        Token NS15=null;
        Token SPLIT16=null;
        Token NS17=null;

        CommonTree NS13_tree=null;
        CommonTree SPLIT14_tree=null;
        CommonTree NS15_tree=null;
        CommonTree SPLIT16_tree=null;
        CommonTree NS17_tree=null;
        RewriteRuleTokenStream stream_NS=new RewriteRuleTokenStream(adaptor,"token NS");
        RewriteRuleTokenStream stream_SPLIT=new RewriteRuleTokenStream(adaptor,"token SPLIT");

        try {
            // MySQLDateParser.g:46:2: ( NS SPLIT NS SPLIT NS -> ( ^( TIME NS ) )+ )
            // MySQLDateParser.g:46:4: NS SPLIT NS SPLIT NS
            {
            NS13=(Token)match(input,NS,FOLLOW_NS_in_time_string188); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NS.add(NS13);

            SPLIT14=(Token)match(input,SPLIT,FOLLOW_SPLIT_in_time_string190); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SPLIT.add(SPLIT14);

            NS15=(Token)match(input,NS,FOLLOW_NS_in_time_string192); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NS.add(NS15);

            SPLIT16=(Token)match(input,SPLIT,FOLLOW_SPLIT_in_time_string194); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SPLIT.add(SPLIT16);

            NS17=(Token)match(input,NS,FOLLOW_NS_in_time_string196); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NS.add(NS17);



            // AST REWRITE
            // elements: NS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 46:24: -> ( ^( TIME NS ) )+
            {
                if ( !(stream_NS.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_NS.hasNext() ) {
                    // MySQLDateParser.g:46:26: ^( TIME NS )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIME, "TIME"), root_1);

                    adaptor.addChild(root_1, stream_NS.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_NS.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "time_string"

    public static class quo_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "quo"
    // MySQLDateParser.g:96:1: quo : '\\'' ( . )* '\\'' -> ^( QUOTA ID ) ;
    public final MySQLDateParserParser.quo_return quo() throws RecognitionException {
        MySQLDateParserParser.quo_return retval = new MySQLDateParserParser.quo_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal18=null;
        Token wildcard19=null;
        Token char_literal20=null;

        CommonTree char_literal18_tree=null;
        CommonTree wildcard19_tree=null;
        CommonTree char_literal20_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");

        try {
            // MySQLDateParser.g:96:5: ( '\\'' ( . )* '\\'' -> ^( QUOTA ID ) )
            // MySQLDateParser.g:96:6: '\\'' ( . )* '\\''
            {
            char_literal18=(Token)match(input,22,FOLLOW_22_in_quo498); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_22.add(char_literal18);

            // MySQLDateParser.g:96:11: ( . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=2;
                }
                else if ( ((LA3_0>=TIMESTRING && LA3_0<=GTH)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // MySQLDateParser.g:96:11: .
            	    {
            	    wildcard19=(Token)input.LT(1);
            	    matchAny(input); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            char_literal20=(Token)match(input,22,FOLLOW_22_in_quo503); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_22.add(char_literal20);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 96:18: -> ^( QUOTA ID )
            {
                // MySQLDateParser.g:96:20: ^( QUOTA ID )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(QUOTA, "QUOTA"), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(ID, "ID"));

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "quo"

    // $ANTLR start synpred1_MySQLDateParser
    public final void synpred1_MySQLDateParser_fragment() throws RecognitionException {   
        // MySQLDateParser.g:27:3: ( '\\'' date_string ( time_string )? '\\'' )
        // MySQLDateParser.g:27:4: '\\'' date_string ( time_string )? '\\''
        {
        match(input,22,FOLLOW_22_in_synpred1_MySQLDateParser72); if (state.failed) return ;
        pushFollow(FOLLOW_date_string_in_synpred1_MySQLDateParser74);
        date_string();

        state._fsp--;
        if (state.failed) return ;
        // MySQLDateParser.g:27:21: ( time_string )?
        int alt4=2;
        int LA4_0 = input.LA(1);

        if ( (LA4_0==NS) ) {
            alt4=1;
        }
        switch (alt4) {
            case 1 :
                // MySQLDateParser.g:27:21: time_string
                {
                pushFollow(FOLLOW_time_string_in_synpred1_MySQLDateParser76);
                time_string();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,22,FOLLOW_22_in_synpred1_MySQLDateParser79); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_MySQLDateParser

    // Delegated rules

    public final boolean synpred1_MySQLDateParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_MySQLDateParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\17\uffff";
    static final String DFA1_eofS =
        "\17\uffff";
    static final String DFA1_minS =
        "\1\26\2\4\1\uffff\5\4\1\0\1\4\1\uffff\3\4";
    static final String DFA1_maxS =
        "\3\26\1\uffff\5\26\1\0\1\26\1\uffff\3\26";
    static final String DFA1_acceptS =
        "\3\uffff\1\2\7\uffff\1\1\3\uffff";
    static final String DFA1_specialS =
        "\11\uffff\1\0\5\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1",
            "\4\3\1\2\16\3",
            "\5\3\1\4\15\3",
            "",
            "\4\3\1\5\16\3",
            "\5\3\1\6\15\3",
            "\4\3\1\7\16\3",
            "\4\3\1\10\15\3\1\11",
            "\5\3\1\12\15\3",
            "\1\uffff",
            "\4\3\1\14\16\3",
            "",
            "\5\3\1\15\15\3",
            "\4\3\1\16\16\3",
            "\22\3\1\11"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "26:1: time_quoted : ( ( '\\'' date_string ( time_string )? '\\'' )=> '\\'' datetime_string '\\'' -> datetime_string | quo );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_MySQLDateParser()) ) {s = 11;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index1_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_time_quoted_in_quoted_string61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_time_quoted84 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_datetime_string_in_time_quoted86 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_time_quoted89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quo_in_time_quoted95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_string_in_datetime_string105 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_time_string_in_datetime_string108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NS_in_date_string130 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SPLIT_in_date_string132 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NS_in_date_string134 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SPLIT_in_date_string136 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NS_in_date_string138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NS_in_time_string188 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SPLIT_in_time_string190 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NS_in_time_string192 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SPLIT_in_time_string194 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NS_in_time_string196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_quo498 = new BitSet(new long[]{0x00000000007FFFF0L});
    public static final BitSet FOLLOW_22_in_quo503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred1_MySQLDateParser72 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_date_string_in_synpred1_MySQLDateParser74 = new BitSet(new long[]{0x0000000000400100L});
    public static final BitSet FOLLOW_time_string_in_synpred1_MySQLDateParser76 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_synpred1_MySQLDateParser79 = new BitSet(new long[]{0x0000000000000002L});

}