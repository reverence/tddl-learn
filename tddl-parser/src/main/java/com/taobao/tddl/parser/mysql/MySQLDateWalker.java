// $ANTLR 3.1.1 MySQLDateWalker.g 2009-07-29 15:36:04

 package  com.taobao.tddl.parser.mysql; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.runtime.tree.TreeParser;
import org.antlr.runtime.tree.TreeRuleReturnScope;

import com.taobao.tddl.sqlobjecttree.mysql.function.datefunction.MySQLDateStringWrapperFunction;


public class MySQLDateWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TIMESTRING", "DATE", "QUOTA", "TIME", "NS", "SPLIT", "WS", "ID", "P", "ARROW", "DOUBLEVERTBAR", "RPAREN", "LPAREN", "LTH", "NOT_EQ", "LEQ", "GEQ", "GTH", "'''"
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


        public MySQLDateWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public MySQLDateWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return MySQLDateWalker.tokenNames; }
    public String getGrammarFileName() { return "MySQLDateWalker.g"; }




    		public boolean mismatchIsMissingToken(IntStream arg0, BitSet follow) {
    		if ( follow==null ) {
    		throw new IllegalArgumentException("can't know what's wrong...");
    		}
    		throw new IllegalArgumentException("LT(1)=="+((TokenStream)input).LT(1)+" is consistent with what follows; inserting...viable tokens="+follow.toString(getTokenNames())+"LT(1)="+((TokenStream)input).LT(1));
    	}
    	public boolean mismatchIsUnwantedToken(IntStream input, int ttype) {
        		throw new IllegalArgumentException(""+ttype);
        	}


    public static class quoted_string_return extends TreeRuleReturnScope {
        public Object aText;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "quoted_string"
    // MySQLDateWalker.g:49:1: quoted_string returns [Object aText] : ( timedate_str | quo );
    public final MySQLDateWalker.quoted_string_return quoted_string() throws RecognitionException {
        MySQLDateWalker.quoted_string_return retval = new MySQLDateWalker.quoted_string_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLDateWalker.timedate_str_return timedate_str1 = null;

        MySQLDateWalker.quo_return quo2 = null;



        try {
            // MySQLDateWalker.g:50:2: ( timedate_str | quo )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==TIMESTRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==QUOTA) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // MySQLDateWalker.g:50:4: timedate_str
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_timedate_str_in_quoted_string50);
                    timedate_str1=timedate_str();

                    state._fsp--;

                    adaptor.addChild(root_0, timedate_str1.getTree());
                    retval.aText = (timedate_str1!=null?timedate_str1.aText:null);

                    }
                    break;
                case 2 :
                    // MySQLDateWalker.g:51:3: quo
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_quo_in_quoted_string56);
                    quo2=quo();

                    state._fsp--;

                    adaptor.addChild(root_0, quo2.getTree());

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
    // $ANTLR end "quoted_string"

    public static class quo_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "quo"
    // MySQLDateWalker.g:53:1: quo : ^( QUOTA ID ) ;
    public final MySQLDateWalker.quo_return quo() throws RecognitionException {
        MySQLDateWalker.quo_return retval = new MySQLDateWalker.quo_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QUOTA3=null;
        CommonTree ID4=null;

        CommonTree QUOTA3_tree=null;
        CommonTree ID4_tree=null;

        try {
            // MySQLDateWalker.g:54:2: ( ^( QUOTA ID ) )
            // MySQLDateWalker.g:54:3: ^( QUOTA ID )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            QUOTA3=(CommonTree)match(input,QUOTA,FOLLOW_QUOTA_in_quo66); 
            QUOTA3_tree = (CommonTree)adaptor.dupNode(QUOTA3);

            root_1 = (CommonTree)adaptor.becomeRoot(QUOTA3_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_quo68); 
            ID4_tree = (CommonTree)adaptor.dupNode(ID4);

            adaptor.addChild(root_1, ID4_tree);


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
    // $ANTLR end "quo"

    public static class timedate_str_return extends TreeRuleReturnScope {
        public Object aText;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timedate_str"
    // MySQLDateWalker.g:56:1: timedate_str returns [Object aText] : ^( TIMESTRING date_string time_string ) ;
    public final MySQLDateWalker.timedate_str_return timedate_str() throws RecognitionException {
        MySQLDateWalker.timedate_str_return retval = new MySQLDateWalker.timedate_str_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TIMESTRING5=null;
        MySQLDateWalker.date_string_return date_string6 = null;

        MySQLDateWalker.time_string_return time_string7 = null;


        CommonTree TIMESTRING5_tree=null;

        try {
            // MySQLDateWalker.g:57:2: ( ^( TIMESTRING date_string time_string ) )
            // MySQLDateWalker.g:57:3: ^( TIMESTRING date_string time_string )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TIMESTRING5=(CommonTree)match(input,TIMESTRING,FOLLOW_TIMESTRING_in_timedate_str83); 
            TIMESTRING5_tree = (CommonTree)adaptor.dupNode(TIMESTRING5);

            root_1 = (CommonTree)adaptor.becomeRoot(TIMESTRING5_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_date_string_in_timedate_str85);
            date_string6=date_string();

            state._fsp--;

            adaptor.addChild(root_1, date_string6.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_time_string_in_timedate_str87);
            time_string7=time_string();

            state._fsp--;

            adaptor.addChild(root_1, time_string7.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		retval.aText =new MySQLDateStringWrapperFunction((date_string6!=null?date_string6.aText:null)+" "+(time_string7!=null?time_string7.aText:null));
            	

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
    // $ANTLR end "timedate_str"

    public static class time_string_return extends TreeRuleReturnScope {
        public String aText;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time_string"
    // MySQLDateWalker.g:61:1: time_string returns [String aText] : ( time_one )+ ;
    public final MySQLDateWalker.time_string_return time_string() throws RecognitionException {
        MySQLDateWalker.time_string_return retval = new MySQLDateWalker.time_string_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLDateWalker.time_one_return time_one8 = null;




        	StringBuilder sb=new StringBuilder();
        	boolean firstElement=true;
        	
        try {
            // MySQLDateWalker.g:66:2: ( ( time_one )+ )
            // MySQLDateWalker.g:66:3: ( time_one )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // MySQLDateWalker.g:66:3: ( time_one )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TIME) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // MySQLDateWalker.g:66:4: time_one
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_time_one_in_time_string106);
            	    time_one8=time_one();

            	    state._fsp--;

            	    adaptor.addChild(root_0, time_one8.getTree());

            	    		if(firstElement){
            	    			firstElement=false;
            	    			sb.append((time_one8!=null?time_one8.s:null));
            	    		}else{
            	    			sb.append(":");
            	    			sb.append((time_one8!=null?time_one8.s:null));
            	    		}
            	    	

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


            		retval.aText =sb.toString();
            	

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
    // $ANTLR end "time_string"

    public static class time_one_return extends TreeRuleReturnScope {
        public String s;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time_one"
    // MySQLDateWalker.g:79:1: time_one returns [String s] : ^( TIME NS ) ;
    public final MySQLDateWalker.time_one_return time_one() throws RecognitionException {
        MySQLDateWalker.time_one_return retval = new MySQLDateWalker.time_one_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TIME9=null;
        CommonTree NS10=null;

        CommonTree TIME9_tree=null;
        CommonTree NS10_tree=null;

        try {
            // MySQLDateWalker.g:80:2: ( ^( TIME NS ) )
            // MySQLDateWalker.g:80:3: ^( TIME NS )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TIME9=(CommonTree)match(input,TIME,FOLLOW_TIME_in_time_one125); 
            TIME9_tree = (CommonTree)adaptor.dupNode(TIME9);

            root_1 = (CommonTree)adaptor.becomeRoot(TIME9_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            NS10=(CommonTree)match(input,NS,FOLLOW_NS_in_time_one127); 
            NS10_tree = (CommonTree)adaptor.dupNode(NS10);

            adaptor.addChild(root_1, NS10_tree);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		retval.s =(NS10!=null?NS10.getText():null);
            	

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
    // $ANTLR end "time_one"

    public static class date_string_return extends TreeRuleReturnScope {
        public String aText;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date_string"
    // MySQLDateWalker.g:84:1: date_string returns [String aText] : ( date_one )+ ;
    public final MySQLDateWalker.date_string_return date_string() throws RecognitionException {
        MySQLDateWalker.date_string_return retval = new MySQLDateWalker.date_string_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLDateWalker.date_one_return date_one11 = null;




        	StringBuilder sb=new StringBuilder();
        	boolean firstElement=true;
        	
        try {
            // MySQLDateWalker.g:89:2: ( ( date_one )+ )
            // MySQLDateWalker.g:89:3: ( date_one )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // MySQLDateWalker.g:89:3: ( date_one )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==DATE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // MySQLDateWalker.g:89:4: date_one
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_date_one_in_date_string147);
            	    date_one11=date_one();

            	    state._fsp--;

            	    adaptor.addChild(root_0, date_one11.getTree());

            	    		if(firstElement){
            	    			firstElement=false;
            	    			sb.append((date_one11!=null?date_one11.s:null));
            	    		}else{
            	    			sb.append("-");
            	    			sb.append((date_one11!=null?date_one11.s:null));
            	    		}
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            		retval.aText =sb.toString();
            	

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
    // $ANTLR end "date_string"

    public static class date_one_return extends TreeRuleReturnScope {
        public String s;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date_one"
    // MySQLDateWalker.g:102:1: date_one returns [String s] : ^( DATE NS ) ;
    public final MySQLDateWalker.date_one_return date_one() throws RecognitionException {
        MySQLDateWalker.date_one_return retval = new MySQLDateWalker.date_one_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DATE12=null;
        CommonTree NS13=null;

        CommonTree DATE12_tree=null;
        CommonTree NS13_tree=null;

        try {
            // MySQLDateWalker.g:103:2: ( ^( DATE NS ) )
            // MySQLDateWalker.g:103:3: ^( DATE NS )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            DATE12=(CommonTree)match(input,DATE,FOLLOW_DATE_in_date_one166); 
            DATE12_tree = (CommonTree)adaptor.dupNode(DATE12);

            root_1 = (CommonTree)adaptor.becomeRoot(DATE12_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            NS13=(CommonTree)match(input,NS,FOLLOW_NS_in_date_one168); 
            NS13_tree = (CommonTree)adaptor.dupNode(NS13);

            adaptor.addChild(root_1, NS13_tree);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		retval.s =(NS13!=null?NS13.getText():null);
            	

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
    // $ANTLR end "date_one"

    // Delegated rules


 

    public static final BitSet FOLLOW_timedate_str_in_quoted_string50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quo_in_quoted_string56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTA_in_quo66 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_quo68 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMESTRING_in_timedate_str83 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_date_string_in_timedate_str85 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_time_string_in_timedate_str87 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_time_one_in_time_string106 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_TIME_in_time_one125 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NS_in_time_one127 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_date_one_in_date_string147 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_DATE_in_date_one166 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NS_in_date_one168 = new BitSet(new long[]{0x0000000000000008L});

}