// $ANTLR 3.3 Nov 30, 2010 12:50:56 OracleParser.g 2017-07-10 19:33:05
 package  com.taobao.tddl.parser.oracle; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class OracleParserLexer extends Lexer {
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

    public OracleParserLexer() {;} 
    public OracleParserLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public OracleParserLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "OracleParser.g"; }

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:9:7: ( 'SET' )
            // OracleParser.g:9:9: 'SET'
            {
            match("SET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:10:7: ( 'GRUOP' )
            // OracleParser.g:10:9: 'GRUOP'
            {
            match("GRUOP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:11:7: ( 'BY' )
            // OracleParser.g:11:9: 'BY'
            {
            match("BY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:12:7: ( 'ORDER' )
            // OracleParser.g:12:9: 'ORDER'
            {
            match("ORDER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:13:7: ( 'WHERE' )
            // OracleParser.g:13:9: 'WHERE'
            {
            match("WHERE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:14:7: ( 'NOT' )
            // OracleParser.g:14:9: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:15:7: ( 'OR' )
            // OracleParser.g:15:9: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:16:7: ( 'AND' )
            // OracleParser.g:16:9: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:17:7: ( 'BETWEEN' )
            // OracleParser.g:17:9: 'BETWEEN'
            {
            match("BETWEEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:18:7: ( 'IS' )
            // OracleParser.g:18:9: 'IS'
            {
            match("IS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:19:7: ( 'NAN' )
            // OracleParser.g:19:9: 'NAN'
            {
            match("NAN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:20:7: ( 'INFINITE' )
            // OracleParser.g:20:9: 'INFINITE'
            {
            match("INFINITE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:21:7: ( 'NULL' )
            // OracleParser.g:21:9: 'NULL'
            {
            match("NULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:22:7: ( 'IN' )
            // OracleParser.g:22:9: 'IN'
            {
            match("IN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:23:7: ( 'LIKE' )
            // OracleParser.g:23:9: 'LIKE'
            {
            match("LIKE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:24:8: ( '?' )
            // OracleParser.g:24:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:25:8: ( 'CAST' )
            // OracleParser.g:25:10: 'CAST'
            {
            match("CAST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:26:8: ( 'AS' )
            // OracleParser.g:26:10: 'AS'
            {
            match("AS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:27:8: ( 'FROM' )
            // OracleParser.g:27:10: 'FROM'
            {
            match("FROM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:28:8: ( 'TRUE' )
            // OracleParser.g:28:10: 'TRUE'
            {
            match("TRUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:29:8: ( 'FALSE' )
            // OracleParser.g:29:10: 'FALSE'
            {
            match("FALSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:30:8: ( 'SELECT' )
            // OracleParser.g:30:10: 'SELECT'
            {
            match("SELECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:31:8: ( '/*' )
            // OracleParser.g:31:10: '/*'
            {
            match("/*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:32:8: ( '*/' )
            // OracleParser.g:32:10: '*/'
            {
            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:33:8: ( 'INSERT' )
            // OracleParser.g:33:10: 'INSERT'
            {
            match("INSERT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:34:8: ( 'INTO' )
            // OracleParser.g:34:10: 'INTO'
            {
            match("INTO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:35:8: ( 'VALUES' )
            // OracleParser.g:35:10: 'VALUES'
            {
            match("VALUES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:36:8: ( 'FOR' )
            // OracleParser.g:36:10: 'FOR'
            {
            match("FOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:37:8: ( 'UPDATE' )
            // OracleParser.g:37:10: 'UPDATE'
            {
            match("UPDATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:38:8: ( 'OF' )
            // OracleParser.g:38:10: 'OF'
            {
            match("OF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:39:8: ( 'NOWAIT' )
            // OracleParser.g:39:10: 'NOWAIT'
            {
            match("NOWAIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:40:8: ( 'WAIT' )
            // OracleParser.g:40:10: 'WAIT'
            {
            match("WAIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:41:8: ( 'DELETE' )
            // OracleParser.g:41:10: 'DELETE'
            {
            match("DELETE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            int _type = N;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:397:5: ( '0' .. '9' ( '0' .. '9' )* )
            // OracleParser.g:397:7: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // OracleParser.g:397:18: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // OracleParser.g:397:20: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "ASC"
    public final void mASC() throws RecognitionException {
        try {
            int _type = ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:400:4: ( 'ASC' )
            // OracleParser.g:400:5: 'ASC'
            {
            match("ASC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASC"

    // $ANTLR start "DESC"
    public final void mDESC() throws RecognitionException {
        try {
            int _type = DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:401:5: ( 'DESC' )
            // OracleParser.g:401:6: 'DESC'
            {
            match("DESC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DESC"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            int _type = EXPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:403:2: ( '**' )
            // OracleParser.g:403:4: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:406:5: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )* )
            // OracleParser.g:406:7: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // OracleParser.g:406:29: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='#' && LA2_0<='$')||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // OracleParser.g:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:410:2: ( '+' )
            // OracleParser.g:410:4: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:414:2: ( ( ( N '.' N ) | ( '.' N ) ) )
            // OracleParser.g:415:2: ( ( N '.' N ) | ( '.' N ) )
            {
            // OracleParser.g:415:2: ( ( N '.' N ) | ( '.' N ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                alt3=1;
            }
            else if ( (LA3_0=='.') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // OracleParser.g:415:3: ( N '.' N )
                    {
                    // OracleParser.g:415:3: ( N '.' N )
                    // OracleParser.g:415:5: N '.' N
                    {
                    mN(); 
                    match('.'); 
                    mN(); 

                    }


                    }
                    break;
                case 2 :
                    // OracleParser.g:416:3: ( '.' N )
                    {
                    // OracleParser.g:416:3: ( '.' N )
                    // OracleParser.g:416:4: '.' N
                    {
                    match('.'); 
                    mN(); 

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:421:2: ( '-' )
            // OracleParser.g:421:4: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:424:2: ( POINT )
            // OracleParser.g:424:4: POINT
            {
            mPOINT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:427:2: ( ',' )
            // OracleParser.g:427:4: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:430:2: ( '=' )
            // OracleParser.g:430:4: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:434:2: ( '/' )
            // OracleParser.g:434:4: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:437:2: ( '*' )
            // OracleParser.g:437:4: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASTERISK"

    // $ANTLR start "ARROW"
    public final void mARROW() throws RecognitionException {
        try {
            int _type = ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:440:2: ( '=>' )
            // OracleParser.g:440:4: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARROW"

    // $ANTLR start "DOUBLEVERTBAR"
    public final void mDOUBLEVERTBAR() throws RecognitionException {
        try {
            int _type = DOUBLEVERTBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:443:2: ( '||' )
            // OracleParser.g:443:4: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLEVERTBAR"

    // $ANTLR start "POINT"
    public final void mPOINT() throws RecognitionException {
        try {
            // OracleParser.g:448:2: ( '.' )
            // OracleParser.g:448:4: '.'
            {
            match('.'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "POINT"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:451:2: ( ')' )
            // OracleParser.g:451:4: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:454:2: ( '(' )
            // OracleParser.g:454:4: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "LTH"
    public final void mLTH() throws RecognitionException {
        try {
            int _type = LTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:457:2: ( '<' )
            // OracleParser.g:457:4: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTH"

    // $ANTLR start "NOT_EQ"
    public final void mNOT_EQ() throws RecognitionException {
        try {
            int _type = NOT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:460:2: ( '<>' | '!=' | '^=' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case '<':
                {
                alt4=1;
                }
                break;
            case '!':
                {
                alt4=2;
                }
                break;
            case '^':
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // OracleParser.g:460:4: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 2 :
                    // OracleParser.g:460:11: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // OracleParser.g:460:18: '^='
                    {
                    match("^="); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQ"

    // $ANTLR start "LEQ"
    public final void mLEQ() throws RecognitionException {
        try {
            int _type = LEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:463:2: ( '<=' )
            // OracleParser.g:463:4: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEQ"

    // $ANTLR start "GEQ"
    public final void mGEQ() throws RecognitionException {
        try {
            int _type = GEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:466:2: ( '>=' )
            // OracleParser.g:466:4: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GEQ"

    // $ANTLR start "GTH"
    public final void mGTH() throws RecognitionException {
        try {
            int _type = GTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:469:2: ( '>' )
            // OracleParser.g:469:4: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTH"

    // $ANTLR start "QUOTED_STRING"
    public final void mQUOTED_STRING() throws RecognitionException {
        try {
            int _type = QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:477:2: ( '\\'' (~ '\\'' | '\\'\\'' )* '\\'' )
            // OracleParser.g:477:3: '\\'' (~ '\\'' | '\\'\\'' )* '\\''
            {
            match('\''); 
            // OracleParser.g:477:8: (~ '\\'' | '\\'\\'' )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\'') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='\'') ) {
                        alt5=2;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // OracleParser.g:477:9: ~ '\\''
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // OracleParser.g:477:15: '\\'\\''
            	    {
            	    match("''"); 


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTED_STRING"

    // $ANTLR start "DOUBLEQUOTED_STRING"
    public final void mDOUBLEQUOTED_STRING() throws RecognitionException {
        try {
            // OracleParser.g:482:2: ( '\"' (~ ( '\"' ) )* '\"' )
            // OracleParser.g:482:4: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // OracleParser.g:482:8: (~ ( '\"' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // OracleParser.g:482:10: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match('\"'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DOUBLEQUOTED_STRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:485:5: ( ( ' ' | '\\t' | '\\r' '\\n' | '\\n' | '\\r' ) )
            // OracleParser.g:485:9: ( ' ' | '\\t' | '\\r' '\\n' | '\\n' | '\\r' )
            {
            // OracleParser.g:485:9: ( ' ' | '\\t' | '\\r' '\\n' | '\\n' | '\\r' )
            int alt7=5;
            switch ( input.LA(1) ) {
            case ' ':
                {
                alt7=1;
                }
                break;
            case '\t':
                {
                alt7=2;
                }
                break;
            case '\r':
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3=='\n') ) {
                    alt7=3;
                }
                else {
                    alt7=5;}
                }
                break;
            case '\n':
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // OracleParser.g:485:13: ' '
                    {
                    match(' '); 

                    }
                    break;
                case 2 :
                    // OracleParser.g:486:7: '\\t'
                    {
                    match('\t'); 

                    }
                    break;
                case 3 :
                    // OracleParser.g:487:7: '\\r' '\\n'
                    {
                    match('\r'); 
                    match('\n'); 

                    }
                    break;
                case 4 :
                    // OracleParser.g:488:7: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 5 :
                    // OracleParser.g:489:7: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "BITOR"
    public final void mBITOR() throws RecognitionException {
        try {
            int _type = BITOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:495:2: ( '|' )
            // OracleParser.g:495:3: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BITOR"

    // $ANTLR start "BITAND"
    public final void mBITAND() throws RecognitionException {
        try {
            int _type = BITAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:498:2: ( '&' )
            // OracleParser.g:498:3: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BITAND"

    // $ANTLR start "BITXOR"
    public final void mBITXOR() throws RecognitionException {
        try {
            int _type = BITXOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:501:2: ( '^' )
            // OracleParser.g:501:3: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BITXOR"

    // $ANTLR start "SHIFTLEFT"
    public final void mSHIFTLEFT() throws RecognitionException {
        try {
            int _type = SHIFTLEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:504:2: ( '<<' )
            // OracleParser.g:504:3: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHIFTLEFT"

    // $ANTLR start "SHIFTRIGHT"
    public final void mSHIFTRIGHT() throws RecognitionException {
        try {
            int _type = SHIFTRIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // OracleParser.g:507:2: ( '>>' )
            // OracleParser.g:507:3: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHIFTRIGHT"

    public void mTokens() throws RecognitionException {
        // OracleParser.g:1:8: ( T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | N | ASC | DESC | EXPONENT | ID | PLUS | NUMBER | MINUS | DOT | COMMA | EQ | DIVIDE | ASTERISK | ARROW | DOUBLEVERTBAR | RPAREN | LPAREN | LTH | NOT_EQ | LEQ | GEQ | GTH | QUOTED_STRING | WS | BITOR | BITAND | BITXOR | SHIFTLEFT | SHIFTRIGHT )
        int alt8=62;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // OracleParser.g:1:10: T__85
                {
                mT__85(); 

                }
                break;
            case 2 :
                // OracleParser.g:1:16: T__86
                {
                mT__86(); 

                }
                break;
            case 3 :
                // OracleParser.g:1:22: T__87
                {
                mT__87(); 

                }
                break;
            case 4 :
                // OracleParser.g:1:28: T__88
                {
                mT__88(); 

                }
                break;
            case 5 :
                // OracleParser.g:1:34: T__89
                {
                mT__89(); 

                }
                break;
            case 6 :
                // OracleParser.g:1:40: T__90
                {
                mT__90(); 

                }
                break;
            case 7 :
                // OracleParser.g:1:46: T__91
                {
                mT__91(); 

                }
                break;
            case 8 :
                // OracleParser.g:1:52: T__92
                {
                mT__92(); 

                }
                break;
            case 9 :
                // OracleParser.g:1:58: T__93
                {
                mT__93(); 

                }
                break;
            case 10 :
                // OracleParser.g:1:64: T__94
                {
                mT__94(); 

                }
                break;
            case 11 :
                // OracleParser.g:1:70: T__95
                {
                mT__95(); 

                }
                break;
            case 12 :
                // OracleParser.g:1:76: T__96
                {
                mT__96(); 

                }
                break;
            case 13 :
                // OracleParser.g:1:82: T__97
                {
                mT__97(); 

                }
                break;
            case 14 :
                // OracleParser.g:1:88: T__98
                {
                mT__98(); 

                }
                break;
            case 15 :
                // OracleParser.g:1:94: T__99
                {
                mT__99(); 

                }
                break;
            case 16 :
                // OracleParser.g:1:100: T__100
                {
                mT__100(); 

                }
                break;
            case 17 :
                // OracleParser.g:1:107: T__101
                {
                mT__101(); 

                }
                break;
            case 18 :
                // OracleParser.g:1:114: T__102
                {
                mT__102(); 

                }
                break;
            case 19 :
                // OracleParser.g:1:121: T__103
                {
                mT__103(); 

                }
                break;
            case 20 :
                // OracleParser.g:1:128: T__104
                {
                mT__104(); 

                }
                break;
            case 21 :
                // OracleParser.g:1:135: T__105
                {
                mT__105(); 

                }
                break;
            case 22 :
                // OracleParser.g:1:142: T__106
                {
                mT__106(); 

                }
                break;
            case 23 :
                // OracleParser.g:1:149: T__107
                {
                mT__107(); 

                }
                break;
            case 24 :
                // OracleParser.g:1:156: T__108
                {
                mT__108(); 

                }
                break;
            case 25 :
                // OracleParser.g:1:163: T__109
                {
                mT__109(); 

                }
                break;
            case 26 :
                // OracleParser.g:1:170: T__110
                {
                mT__110(); 

                }
                break;
            case 27 :
                // OracleParser.g:1:177: T__111
                {
                mT__111(); 

                }
                break;
            case 28 :
                // OracleParser.g:1:184: T__112
                {
                mT__112(); 

                }
                break;
            case 29 :
                // OracleParser.g:1:191: T__113
                {
                mT__113(); 

                }
                break;
            case 30 :
                // OracleParser.g:1:198: T__114
                {
                mT__114(); 

                }
                break;
            case 31 :
                // OracleParser.g:1:205: T__115
                {
                mT__115(); 

                }
                break;
            case 32 :
                // OracleParser.g:1:212: T__116
                {
                mT__116(); 

                }
                break;
            case 33 :
                // OracleParser.g:1:219: T__117
                {
                mT__117(); 

                }
                break;
            case 34 :
                // OracleParser.g:1:226: N
                {
                mN(); 

                }
                break;
            case 35 :
                // OracleParser.g:1:228: ASC
                {
                mASC(); 

                }
                break;
            case 36 :
                // OracleParser.g:1:232: DESC
                {
                mDESC(); 

                }
                break;
            case 37 :
                // OracleParser.g:1:237: EXPONENT
                {
                mEXPONENT(); 

                }
                break;
            case 38 :
                // OracleParser.g:1:246: ID
                {
                mID(); 

                }
                break;
            case 39 :
                // OracleParser.g:1:249: PLUS
                {
                mPLUS(); 

                }
                break;
            case 40 :
                // OracleParser.g:1:254: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 41 :
                // OracleParser.g:1:261: MINUS
                {
                mMINUS(); 

                }
                break;
            case 42 :
                // OracleParser.g:1:267: DOT
                {
                mDOT(); 

                }
                break;
            case 43 :
                // OracleParser.g:1:271: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 44 :
                // OracleParser.g:1:277: EQ
                {
                mEQ(); 

                }
                break;
            case 45 :
                // OracleParser.g:1:280: DIVIDE
                {
                mDIVIDE(); 

                }
                break;
            case 46 :
                // OracleParser.g:1:287: ASTERISK
                {
                mASTERISK(); 

                }
                break;
            case 47 :
                // OracleParser.g:1:296: ARROW
                {
                mARROW(); 

                }
                break;
            case 48 :
                // OracleParser.g:1:302: DOUBLEVERTBAR
                {
                mDOUBLEVERTBAR(); 

                }
                break;
            case 49 :
                // OracleParser.g:1:316: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 50 :
                // OracleParser.g:1:323: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 51 :
                // OracleParser.g:1:330: LTH
                {
                mLTH(); 

                }
                break;
            case 52 :
                // OracleParser.g:1:334: NOT_EQ
                {
                mNOT_EQ(); 

                }
                break;
            case 53 :
                // OracleParser.g:1:341: LEQ
                {
                mLEQ(); 

                }
                break;
            case 54 :
                // OracleParser.g:1:345: GEQ
                {
                mGEQ(); 

                }
                break;
            case 55 :
                // OracleParser.g:1:349: GTH
                {
                mGTH(); 

                }
                break;
            case 56 :
                // OracleParser.g:1:353: QUOTED_STRING
                {
                mQUOTED_STRING(); 

                }
                break;
            case 57 :
                // OracleParser.g:1:367: WS
                {
                mWS(); 

                }
                break;
            case 58 :
                // OracleParser.g:1:370: BITOR
                {
                mBITOR(); 

                }
                break;
            case 59 :
                // OracleParser.g:1:376: BITAND
                {
                mBITAND(); 

                }
                break;
            case 60 :
                // OracleParser.g:1:383: BITXOR
                {
                mBITXOR(); 

                }
                break;
            case 61 :
                // OracleParser.g:1:390: SHIFTLEFT
                {
                mSHIFTLEFT(); 

                }
                break;
            case 62 :
                // OracleParser.g:1:400: SHIFTRIGHT
                {
                mSHIFTRIGHT(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\11\24\1\uffff\3\24\1\72\1\75\3\24\1\102\2\uffff\1\104\2"+
        "\uffff\1\106\1\110\2\uffff\1\113\1\uffff\1\114\1\117\3\uffff\2\24"+
        "\1\123\1\24\1\126\1\127\6\24\1\140\1\141\1\145\6\24\5\uffff\3\24"+
        "\1\102\16\uffff\1\160\2\24\1\uffff\2\24\2\uffff\2\24\1\167\1\24"+
        "\1\171\1\24\1\173\1\174\2\uffff\3\24\1\uffff\4\24\1\u0084\5\24\1"+
        "\uffff\5\24\1\u008f\1\uffff\1\24\1\uffff\1\u0091\2\uffff\2\24\1"+
        "\u0094\1\u0095\1\u0096\1\u0097\1\24\1\uffff\1\u0099\3\24\1\u009d"+
        "\1\24\1\u009f\1\24\1\u00a1\1\u00a2\1\uffff\1\24\1\uffff\2\24\4\uffff"+
        "\1\u00a6\1\uffff\3\24\1\uffff\1\u00aa\1\uffff\1\24\2\uffff\1\u00ac"+
        "\1\24\1\u00ae\1\uffff\1\u00af\1\u00b0\1\u00b1\1\uffff\1\u00b2\1"+
        "\uffff\1\24\5\uffff\1\u00b4\1\uffff";
    static final String DFA8_eofS =
        "\u00b5\uffff";
    static final String DFA8_minS =
        "\1\11\1\105\1\122\1\105\1\106\2\101\2\116\1\111\1\uffff\2\101\1"+
        "\122\2\52\1\101\1\120\1\105\1\56\2\uffff\1\60\2\uffff\1\76\1\174"+
        "\2\uffff\1\74\1\uffff\2\75\3\uffff\1\114\1\125\1\43\1\124\2\43\1"+
        "\105\1\111\1\124\1\116\1\114\1\104\3\43\1\113\1\123\1\117\1\114"+
        "\1\122\1\125\5\uffff\1\114\1\104\1\114\1\56\16\uffff\1\43\1\105"+
        "\1\117\1\uffff\1\127\1\105\2\uffff\1\122\1\124\1\43\1\101\1\43\1"+
        "\114\2\43\2\uffff\1\111\1\105\1\117\1\uffff\1\105\1\124\1\115\1"+
        "\123\1\43\1\105\1\125\1\101\1\105\1\103\1\uffff\1\103\1\120\1\105"+
        "\1\122\1\105\1\43\1\uffff\1\111\1\uffff\1\43\2\uffff\1\116\1\122"+
        "\4\43\1\105\1\uffff\1\43\1\105\2\124\1\43\1\124\1\43\1\105\2\43"+
        "\1\uffff\1\124\1\uffff\1\111\1\124\4\uffff\1\43\1\uffff\1\123\2"+
        "\105\1\uffff\1\43\1\uffff\1\116\2\uffff\1\43\1\124\1\43\1\uffff"+
        "\3\43\1\uffff\1\43\1\uffff\1\105\5\uffff\1\43\1\uffff";
    static final String DFA8_maxS =
        "\1\174\1\105\1\122\1\131\1\122\1\110\1\125\2\123\1\111\1\uffff\1"+
        "\101\2\122\1\52\1\57\1\101\1\120\1\105\1\71\2\uffff\1\71\2\uffff"+
        "\1\76\1\174\2\uffff\1\76\1\uffff\1\75\1\76\3\uffff\1\124\1\125\1"+
        "\172\1\124\2\172\1\105\1\111\1\127\1\116\1\114\1\104\3\172\1\113"+
        "\1\123\1\117\1\114\1\122\1\125\5\uffff\1\114\1\104\1\123\1\71\16"+
        "\uffff\1\172\1\105\1\117\1\uffff\1\127\1\105\2\uffff\1\122\1\124"+
        "\1\172\1\101\1\172\1\114\2\172\2\uffff\1\111\1\105\1\117\1\uffff"+
        "\1\105\1\124\1\115\1\123\1\172\1\105\1\125\1\101\1\105\1\103\1\uffff"+
        "\1\103\1\120\1\105\1\122\1\105\1\172\1\uffff\1\111\1\uffff\1\172"+
        "\2\uffff\1\116\1\122\4\172\1\105\1\uffff\1\172\1\105\2\124\1\172"+
        "\1\124\1\172\1\105\2\172\1\uffff\1\124\1\uffff\1\111\1\124\4\uffff"+
        "\1\172\1\uffff\1\123\2\105\1\uffff\1\172\1\uffff\1\116\2\uffff\1"+
        "\172\1\124\1\172\1\uffff\3\172\1\uffff\1\172\1\uffff\1\105\5\uffff"+
        "\1\172\1\uffff";
    static final String DFA8_acceptS =
        "\12\uffff\1\20\11\uffff\1\46\1\47\1\uffff\1\51\1\53\2\uffff\1\61"+
        "\1\62\1\uffff\1\64\2\uffff\1\70\1\71\1\73\25\uffff\1\27\1\55\1\30"+
        "\1\45\1\56\4\uffff\1\42\1\50\1\52\1\57\1\54\1\60\1\72\1\65\1\75"+
        "\1\63\1\74\1\66\1\76\1\67\3\uffff\1\3\2\uffff\1\7\1\36\10\uffff"+
        "\1\22\1\12\3\uffff\1\16\12\uffff\1\1\6\uffff\1\6\1\uffff\1\13\1"+
        "\uffff\1\10\1\43\7\uffff\1\34\12\uffff\1\40\1\uffff\1\15\2\uffff"+
        "\1\32\1\17\1\21\1\23\1\uffff\1\24\3\uffff\1\44\1\uffff\1\2\1\uffff"+
        "\1\4\1\5\3\uffff\1\25\3\uffff\1\26\1\uffff\1\37\1\uffff\1\31\1\33"+
        "\1\35\1\41\1\11\1\uffff\1\14";
    static final String DFA8_specialS =
        "\u00b5\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\42\2\uffff\1\42\22\uffff\1\42\1\36\4\uffff\1\43\1\41\1\34"+
            "\1\33\1\17\1\25\1\30\1\27\1\26\1\16\12\23\2\uffff\1\35\1\31"+
            "\1\40\1\12\1\uffff\1\7\1\3\1\13\1\22\1\24\1\14\1\2\1\24\1\10"+
            "\2\24\1\11\1\24\1\6\1\4\3\24\1\1\1\15\1\21\1\20\1\5\3\24\3\uffff"+
            "\1\37\2\uffff\32\24\1\uffff\1\32",
            "\1\44",
            "\1\45",
            "\1\47\23\uffff\1\46",
            "\1\51\13\uffff\1\50",
            "\1\53\6\uffff\1\52",
            "\1\55\15\uffff\1\54\5\uffff\1\56",
            "\1\57\4\uffff\1\60",
            "\1\62\4\uffff\1\61",
            "\1\63",
            "",
            "\1\64",
            "\1\66\15\uffff\1\67\2\uffff\1\65",
            "\1\70",
            "\1\71",
            "\1\74\4\uffff\1\73",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\103\1\uffff\12\101",
            "",
            "",
            "\12\103",
            "",
            "",
            "\1\105",
            "\1\107",
            "",
            "",
            "\1\112\1\111\1\36",
            "",
            "\1\36",
            "\1\115\1\116",
            "",
            "",
            "",
            "\1\121\7\uffff\1\120",
            "\1\122",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\124",
            "\2\24\13\uffff\12\24\7\uffff\3\24\1\125\26\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\130",
            "\1\131",
            "\1\132\2\uffff\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\2\24\13\uffff\12\24\7\uffff\2\24\1\137\27\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\2\24\13\uffff\12\24\7\uffff\5\24\1\142\14\24\1\143\1\144\6"+
            "\24\4\uffff\1\24\1\uffff\32\24",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "",
            "",
            "",
            "",
            "\1\154",
            "\1\155",
            "\1\156\6\uffff\1\157",
            "\1\103\1\uffff\12\101",
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
            "",
            "",
            "",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\161",
            "\1\162",
            "",
            "\1\163",
            "\1\164",
            "",
            "",
            "\1\165",
            "\1\166",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\170",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\172",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "",
            "\1\u0090",
            "",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "",
            "",
            "\1\u0092",
            "\1\u0093",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\u0098",
            "",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\u009e",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\u00a0",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "",
            "",
            "",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "",
            "\1\u00ab",
            "",
            "",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\u00ad",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "",
            "\1\u00b3",
            "",
            "",
            "",
            "",
            "",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
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
            return "1:1: Tokens : ( T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | N | ASC | DESC | EXPONENT | ID | PLUS | NUMBER | MINUS | DOT | COMMA | EQ | DIVIDE | ASTERISK | ARROW | DOUBLEVERTBAR | RPAREN | LPAREN | LTH | NOT_EQ | LEQ | GEQ | GTH | QUOTED_STRING | WS | BITOR | BITAND | BITXOR | SHIFTLEFT | SHIFTRIGHT );";
        }
    }
 

}