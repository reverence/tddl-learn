// $ANTLR 3.2 Sep 23, 2009 12:02:23 MySQLParser.g 2009-12-09 12:38:24
 package  com.taobao.tddl.parser.mysql; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class MySQLParserLexer extends Lexer {
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
    public static final int GROUPBY=33;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int DIVIDE=64;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int FORUPDATE=49;
    public static final int POSITIVE=51;
    public static final int DISPLAYED_COLUMN=12;
    public static final int T__83=83;
    public static final int ASC=72;
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
    public static final int RANGE=47;
    public static final int NOT_BETWEEN=31;
    public static final int SET=41;
    public static final int INFINITE=28;
    public static final int T__102=102;
    public static final int INSERT_VAL=36;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int MINUS=62;
    public static final int CONDITION_OR_NOT=21;
    public static final int NOT_EQ=69;
    public static final int LTH=67;
    public static final int COLUMNS=39;
    public static final int COL_TAB=43;
    public static final int SET_ELE=42;
    public static final int ARROW=78;
    public static final int ISNOT=24;
    public static final int DESC=73;
    public static final int BETWEEN=32;
    public static final int TABLENAME=5;
    public static final int LEQ=70;

    // delegates
    // delegators

    public MySQLParserLexer() {;} 
    public MySQLParserLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MySQLParserLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "MySQLParser.g"; }

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MySQLParser.g:9:7: ( 'SET' )
            // MySQLParser.g:9:9: 'SET'
            {
            match("SET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MySQLParser.g:10:7: ( 'INSERT' )
            // MySQLParser.g:10:9: 'INSERT'
            {
            match("INSERT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MySQLParser.g:11:7: ( 'INTO' )
            // MySQLParser.g:11:9: 'INTO'
            {
            match("INTO"); 


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
            // MySQLParser.g:12:7: ( 'VALUES' )
            // MySQLParser.g:12:9: 'VALUES'
            {
            match("VALUES"); 


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
            // MySQLParser.g:13:7: ( 'GROUP' )
            // MySQLParser.g:13:9: 'GROUP'
            {
            match("GROUP"); 


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
            // MySQLParser.g:14:7: ( 'BY' )
            // MySQLParser.g:14:9: 'BY'
            {
            match("BY"); 


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
            // MySQLParser.g:15:7: ( 'ORDER' )
            // MySQLParser.g:15:9: 'ORDER'
            {
            match("ORDER"); 


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
            // MySQLParser.g:16:7: ( 'SELECT' )
            // MySQLParser.g:16:9: 'SELECT'
            {
            match("SELECT"); 


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
            // MySQLParser.g:17:7: ( 'WHERE' )
            // MySQLParser.g:17:9: 'WHERE'
            {
            match("WHERE"); 


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
            // MySQLParser.g:18:7: ( 'NOT' )
            // MySQLParser.g:18:9: 'NOT'
            {
            match("NOT"); 


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
            // MySQLParser.g:19:7: ( 'OR' )
            // MySQLParser.g:19:9: 'OR'
            {
            match("OR"); 


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
            // MySQLParser.g:20:7: ( 'AND' )
            // MySQLParser.g:20:9: 'AND'
            {
            match("AND"); 


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
            // MySQLParser.g:21:7: ( 'BETWEEN' )
            // MySQLParser.g:21:9: 'BETWEEN'
            {
            match("BETWEEN"); 


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
            // MySQLParser.g:22:7: ( 'IS' )
            // MySQLParser.g:22:9: 'IS'
            {
            match("IS"); 


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
            // MySQLParser.g:23:7: ( 'NAN' )
            // MySQLParser.g:23:9: 'NAN'
            {
            match("NAN"); 


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
            // MySQLParser.g:24:7: ( 'INFINITE' )
            // MySQLParser.g:24:9: 'INFINITE'
            {
            match("INFINITE"); 


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
            // MySQLParser.g:25:7: ( 'NULL' )
            // MySQLParser.g:25:9: 'NULL'
            {
            match("NULL"); 


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
            // MySQLParser.g:26:8: ( 'IN' )
            // MySQLParser.g:26:10: 'IN'
            {
            match("IN"); 


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
            // MySQLParser.g:27:8: ( 'LIKE' )
            // MySQLParser.g:27:10: 'LIKE'
            {
            match("LIKE"); 


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
            // MySQLParser.g:28:8: ( 'ROWNUM' )
            // MySQLParser.g:28:10: 'ROWNUM'
            {
            match("ROWNUM"); 


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
            // MySQLParser.g:29:8: ( 'FROM' )
            // MySQLParser.g:29:10: 'FROM'
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
            // MySQLParser.g:30:8: ( '?' )
            // MySQLParser.g:30:10: '?'
            {
            match('?'); 

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
            // MySQLParser.g:31:8: ( 'TRUE' )
            // MySQLParser.g:31:10: 'TRUE'
            {
            match("TRUE"); 


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
            // MySQLParser.g:32:8: ( 'FALSE' )
            // MySQLParser.g:32:10: 'FALSE'
            {
            match("FALSE"); 


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
            // MySQLParser.g:33:8: ( 'AS' )
            // MySQLParser.g:33:10: 'AS'
            {
            match("AS"); 


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
            // MySQLParser.g:34:8: ( 'FORCE' )
            // MySQLParser.g:34:10: 'FORCE'
            {
            match("FORCE"); 


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
            // MySQLParser.g:35:8: ( 'INDEX' )
            // MySQLParser.g:35:10: 'INDEX'
            {
            match("INDEX"); 


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
            // MySQLParser.g:36:8: ( 'IGNORE' )
            // MySQLParser.g:36:10: 'IGNORE'
            {
            match("IGNORE"); 


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
            // MySQLParser.g:37:8: ( 'DELETE' )
            // MySQLParser.g:37:10: 'DELETE'
            {
            match("DELETE"); 


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
            // MySQLParser.g:38:8: ( 'UPDATE' )
            // MySQLParser.g:38:10: 'UPDATE'
            {
            match("UPDATE"); 


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
            // MySQLParser.g:39:8: ( 'LIMIT' )
            // MySQLParser.g:39:10: 'LIMIT'
            {
            match("LIMIT"); 


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
            // MySQLParser.g:40:8: ( 'FOR' )
            // MySQLParser.g:40:10: 'FOR'
            {
            match("FOR"); 


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
            // MySQLParser.g:41:8: ( 'LOCK' )
            // MySQLParser.g:41:10: 'LOCK'
            {
            match("LOCK"); 


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
            // MySQLParser.g:42:8: ( 'SHARE' )
            // MySQLParser.g:42:10: 'SHARE'
            {
            match("SHARE"); 


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
            // MySQLParser.g:43:8: ( 'MODE' )
            // MySQLParser.g:43:10: 'MODE'
            {
            match("MODE"); 


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
            // MySQLParser.g:372:5: ( '0' .. '9' ( '0' .. '9' )* )
            // MySQLParser.g:372:7: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // MySQLParser.g:372:18: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // MySQLParser.g:372:20: '0' .. '9'
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
            // MySQLParser.g:375:4: ( 'ASC' )
            // MySQLParser.g:375:5: 'ASC'
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
            // MySQLParser.g:376:5: ( 'DESC' )
            // MySQLParser.g:376:6: 'DESC'
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
            // MySQLParser.g:378:2: ( '**' )
            // MySQLParser.g:378:4: '**'
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
            // MySQLParser.g:381:5: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )* | '`' ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )* '`' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                alt4=1;
            }
            else if ( (LA4_0=='`') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // MySQLParser.g:381:7: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )*
                    {
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // MySQLParser.g:381:29: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='#' && LA2_0<='$')||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // MySQLParser.g:
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
                    break;
                case 2 :
                    // MySQLParser.g:382:7: '`' ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )* '`'
                    {
                    match('`'); 
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // MySQLParser.g:382:32: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='#' && LA3_0<='$')||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // MySQLParser.g:
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
                    	    break loop3;
                        }
                    } while (true);

                    match('`'); 

                    }
                    break;

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
            // MySQLParser.g:385:2: ( '+' )
            // MySQLParser.g:385:4: '+'
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
            // MySQLParser.g:389:2: ( ( ( N '.' N ) | ( '.' N ) ) )
            // MySQLParser.g:390:2: ( ( N '.' N ) | ( '.' N ) )
            {
            // MySQLParser.g:390:2: ( ( N '.' N ) | ( '.' N ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                alt5=1;
            }
            else if ( (LA5_0=='.') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // MySQLParser.g:390:3: ( N '.' N )
                    {
                    // MySQLParser.g:390:3: ( N '.' N )
                    // MySQLParser.g:390:5: N '.' N
                    {
                    mN(); 
                    match('.'); 
                    mN(); 

                    }


                    }
                    break;
                case 2 :
                    // MySQLParser.g:391:3: ( '.' N )
                    {
                    // MySQLParser.g:391:3: ( '.' N )
                    // MySQLParser.g:391:4: '.' N
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
            // MySQLParser.g:397:2: ( '-' )
            // MySQLParser.g:397:4: '-'
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
            // MySQLParser.g:400:2: ( POINT )
            // MySQLParser.g:400:4: POINT
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
            // MySQLParser.g:403:2: ( ',' )
            // MySQLParser.g:403:4: ','
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
            // MySQLParser.g:406:2: ( '=' )
            // MySQLParser.g:406:4: '='
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
            // MySQLParser.g:410:2: ( '/' )
            // MySQLParser.g:410:4: '/'
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
            // MySQLParser.g:413:2: ( '*' )
            // MySQLParser.g:413:4: '*'
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
            // MySQLParser.g:416:2: ( '=>' )
            // MySQLParser.g:416:4: '=>'
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
            // MySQLParser.g:419:2: ( '||' )
            // MySQLParser.g:419:4: '||'
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
            // MySQLParser.g:424:2: ( '.' )
            // MySQLParser.g:424:4: '.'
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
            // MySQLParser.g:427:2: ( ')' )
            // MySQLParser.g:427:4: ')'
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
            // MySQLParser.g:430:2: ( '(' )
            // MySQLParser.g:430:4: '('
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
            // MySQLParser.g:433:2: ( '<' )
            // MySQLParser.g:433:4: '<'
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
            // MySQLParser.g:436:2: ( '<>' | '!=' | '^=' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case '<':
                {
                alt6=1;
                }
                break;
            case '!':
                {
                alt6=2;
                }
                break;
            case '^':
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // MySQLParser.g:436:4: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 2 :
                    // MySQLParser.g:436:11: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // MySQLParser.g:436:18: '^='
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
            // MySQLParser.g:439:2: ( '<=' )
            // MySQLParser.g:439:4: '<='
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
            // MySQLParser.g:442:2: ( '>=' )
            // MySQLParser.g:442:4: '>='
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
            // MySQLParser.g:445:2: ( '>' )
            // MySQLParser.g:445:4: '>'
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
            // MySQLParser.g:453:2: ( '\\'' (~ '\\'' | '\\'\\'' )* '\\'' )
            // MySQLParser.g:453:3: '\\'' (~ '\\'' | '\\'\\'' )* '\\''
            {
            match('\''); 
            // MySQLParser.g:453:8: (~ '\\'' | '\\'\\'' )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\'') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='\'') ) {
                        alt7=2;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // MySQLParser.g:453:9: ~ '\\''
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
            	    // MySQLParser.g:453:15: '\\'\\''
            	    {
            	    match("''"); 


            	    }
            	    break;

            	default :
            	    break loop7;
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
            // MySQLParser.g:458:2: ( '\"' (~ ( '\"' ) )* '\"' )
            // MySQLParser.g:458:4: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // MySQLParser.g:458:8: (~ ( '\"' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // MySQLParser.g:458:10: ~ ( '\"' )
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
            	    break loop8;
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
            // MySQLParser.g:461:5: ( ( ' ' | '\\t' | '\\r' '\\n' | '\\n' | '\\r' ) )
            // MySQLParser.g:461:9: ( ' ' | '\\t' | '\\r' '\\n' | '\\n' | '\\r' )
            {
            // MySQLParser.g:461:9: ( ' ' | '\\t' | '\\r' '\\n' | '\\n' | '\\r' )
            int alt9=5;
            switch ( input.LA(1) ) {
            case ' ':
                {
                alt9=1;
                }
                break;
            case '\t':
                {
                alt9=2;
                }
                break;
            case '\r':
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3=='\n') ) {
                    alt9=3;
                }
                else {
                    alt9=5;}
                }
                break;
            case '\n':
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // MySQLParser.g:461:13: ' '
                    {
                    match(' '); 

                    }
                    break;
                case 2 :
                    // MySQLParser.g:462:7: '\\t'
                    {
                    match('\t'); 

                    }
                    break;
                case 3 :
                    // MySQLParser.g:463:7: '\\r' '\\n'
                    {
                    match('\r'); 
                    match('\n'); 

                    }
                    break;
                case 4 :
                    // MySQLParser.g:464:7: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 5 :
                    // MySQLParser.g:465:7: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            skip();

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
            // MySQLParser.g:471:2: ( '|' )
            // MySQLParser.g:471:3: '|'
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
            // MySQLParser.g:474:2: ( '&' )
            // MySQLParser.g:474:3: '&'
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
            // MySQLParser.g:477:2: ( '^' )
            // MySQLParser.g:477:3: '^'
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
            // MySQLParser.g:480:2: ( '<<' )
            // MySQLParser.g:480:3: '<<'
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
            // MySQLParser.g:483:2: ( '>>' )
            // MySQLParser.g:483:3: '>>'
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
        // MySQLParser.g:1:8: ( T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | N | ASC | DESC | EXPONENT | ID | PLUS | NUMBER | MINUS | DOT | COMMA | EQ | DIVIDE | ASTERISK | ARROW | DOUBLEVERTBAR | RPAREN | LPAREN | LTH | NOT_EQ | LEQ | GEQ | GTH | QUOTED_STRING | WS | BITOR | BITAND | BITXOR | SHIFTLEFT | SHIFTRIGHT )
        int alt10=64;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // MySQLParser.g:1:10: T__83
                {
                mT__83(); 

                }
                break;
            case 2 :
                // MySQLParser.g:1:16: T__84
                {
                mT__84(); 

                }
                break;
            case 3 :
                // MySQLParser.g:1:22: T__85
                {
                mT__85(); 

                }
                break;
            case 4 :
                // MySQLParser.g:1:28: T__86
                {
                mT__86(); 

                }
                break;
            case 5 :
                // MySQLParser.g:1:34: T__87
                {
                mT__87(); 

                }
                break;
            case 6 :
                // MySQLParser.g:1:40: T__88
                {
                mT__88(); 

                }
                break;
            case 7 :
                // MySQLParser.g:1:46: T__89
                {
                mT__89(); 

                }
                break;
            case 8 :
                // MySQLParser.g:1:52: T__90
                {
                mT__90(); 

                }
                break;
            case 9 :
                // MySQLParser.g:1:58: T__91
                {
                mT__91(); 

                }
                break;
            case 10 :
                // MySQLParser.g:1:64: T__92
                {
                mT__92(); 

                }
                break;
            case 11 :
                // MySQLParser.g:1:70: T__93
                {
                mT__93(); 

                }
                break;
            case 12 :
                // MySQLParser.g:1:76: T__94
                {
                mT__94(); 

                }
                break;
            case 13 :
                // MySQLParser.g:1:82: T__95
                {
                mT__95(); 

                }
                break;
            case 14 :
                // MySQLParser.g:1:88: T__96
                {
                mT__96(); 

                }
                break;
            case 15 :
                // MySQLParser.g:1:94: T__97
                {
                mT__97(); 

                }
                break;
            case 16 :
                // MySQLParser.g:1:100: T__98
                {
                mT__98(); 

                }
                break;
            case 17 :
                // MySQLParser.g:1:106: T__99
                {
                mT__99(); 

                }
                break;
            case 18 :
                // MySQLParser.g:1:112: T__100
                {
                mT__100(); 

                }
                break;
            case 19 :
                // MySQLParser.g:1:119: T__101
                {
                mT__101(); 

                }
                break;
            case 20 :
                // MySQLParser.g:1:126: T__102
                {
                mT__102(); 

                }
                break;
            case 21 :
                // MySQLParser.g:1:133: T__103
                {
                mT__103(); 

                }
                break;
            case 22 :
                // MySQLParser.g:1:140: T__104
                {
                mT__104(); 

                }
                break;
            case 23 :
                // MySQLParser.g:1:147: T__105
                {
                mT__105(); 

                }
                break;
            case 24 :
                // MySQLParser.g:1:154: T__106
                {
                mT__106(); 

                }
                break;
            case 25 :
                // MySQLParser.g:1:161: T__107
                {
                mT__107(); 

                }
                break;
            case 26 :
                // MySQLParser.g:1:168: T__108
                {
                mT__108(); 

                }
                break;
            case 27 :
                // MySQLParser.g:1:175: T__109
                {
                mT__109(); 

                }
                break;
            case 28 :
                // MySQLParser.g:1:182: T__110
                {
                mT__110(); 

                }
                break;
            case 29 :
                // MySQLParser.g:1:189: T__111
                {
                mT__111(); 

                }
                break;
            case 30 :
                // MySQLParser.g:1:196: T__112
                {
                mT__112(); 

                }
                break;
            case 31 :
                // MySQLParser.g:1:203: T__113
                {
                mT__113(); 

                }
                break;
            case 32 :
                // MySQLParser.g:1:210: T__114
                {
                mT__114(); 

                }
                break;
            case 33 :
                // MySQLParser.g:1:217: T__115
                {
                mT__115(); 

                }
                break;
            case 34 :
                // MySQLParser.g:1:224: T__116
                {
                mT__116(); 

                }
                break;
            case 35 :
                // MySQLParser.g:1:231: T__117
                {
                mT__117(); 

                }
                break;
            case 36 :
                // MySQLParser.g:1:238: N
                {
                mN(); 

                }
                break;
            case 37 :
                // MySQLParser.g:1:240: ASC
                {
                mASC(); 

                }
                break;
            case 38 :
                // MySQLParser.g:1:244: DESC
                {
                mDESC(); 

                }
                break;
            case 39 :
                // MySQLParser.g:1:249: EXPONENT
                {
                mEXPONENT(); 

                }
                break;
            case 40 :
                // MySQLParser.g:1:258: ID
                {
                mID(); 

                }
                break;
            case 41 :
                // MySQLParser.g:1:261: PLUS
                {
                mPLUS(); 

                }
                break;
            case 42 :
                // MySQLParser.g:1:266: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 43 :
                // MySQLParser.g:1:273: MINUS
                {
                mMINUS(); 

                }
                break;
            case 44 :
                // MySQLParser.g:1:279: DOT
                {
                mDOT(); 

                }
                break;
            case 45 :
                // MySQLParser.g:1:283: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 46 :
                // MySQLParser.g:1:289: EQ
                {
                mEQ(); 

                }
                break;
            case 47 :
                // MySQLParser.g:1:292: DIVIDE
                {
                mDIVIDE(); 

                }
                break;
            case 48 :
                // MySQLParser.g:1:299: ASTERISK
                {
                mASTERISK(); 

                }
                break;
            case 49 :
                // MySQLParser.g:1:308: ARROW
                {
                mARROW(); 

                }
                break;
            case 50 :
                // MySQLParser.g:1:314: DOUBLEVERTBAR
                {
                mDOUBLEVERTBAR(); 

                }
                break;
            case 51 :
                // MySQLParser.g:1:328: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 52 :
                // MySQLParser.g:1:335: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 53 :
                // MySQLParser.g:1:342: LTH
                {
                mLTH(); 

                }
                break;
            case 54 :
                // MySQLParser.g:1:346: NOT_EQ
                {
                mNOT_EQ(); 

                }
                break;
            case 55 :
                // MySQLParser.g:1:353: LEQ
                {
                mLEQ(); 

                }
                break;
            case 56 :
                // MySQLParser.g:1:357: GEQ
                {
                mGEQ(); 

                }
                break;
            case 57 :
                // MySQLParser.g:1:361: GTH
                {
                mGTH(); 

                }
                break;
            case 58 :
                // MySQLParser.g:1:365: QUOTED_STRING
                {
                mQUOTED_STRING(); 

                }
                break;
            case 59 :
                // MySQLParser.g:1:379: WS
                {
                mWS(); 

                }
                break;
            case 60 :
                // MySQLParser.g:1:382: BITOR
                {
                mBITOR(); 

                }
                break;
            case 61 :
                // MySQLParser.g:1:388: BITAND
                {
                mBITAND(); 

                }
                break;
            case 62 :
                // MySQLParser.g:1:395: BITXOR
                {
                mBITXOR(); 

                }
                break;
            case 63 :
                // MySQLParser.g:1:402: SHIFTLEFT
                {
                mSHIFTLEFT(); 

                }
                break;
            case 64 :
                // MySQLParser.g:1:412: SHIFTRIGHT
                {
                mSHIFTRIGHT(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\14\24\1\uffff\4\24\1\100\1\103\2\uffff\1\104\2\uffff\1"+
        "\106\1\uffff\1\110\2\uffff\1\113\1\uffff\1\114\1\117\3\uffff\2\24"+
        "\1\127\1\130\3\24\1\134\1\24\1\137\5\24\1\146\12\24\1\100\20\uffff"+
        "\1\163\6\24\2\uffff\3\24\1\uffff\2\24\1\uffff\1\24\1\u0080\1\u0081"+
        "\1\24\1\u0083\1\u0084\1\uffff\6\24\1\u008c\5\24\1\uffff\3\24\1\u0095"+
        "\10\24\2\uffff\1\u009e\2\uffff\1\u009f\1\24\1\u00a1\1\24\1\u00a3"+
        "\2\24\1\uffff\1\u00a6\1\24\1\u00a8\1\24\1\u00aa\1\24\1\u00ac\1\24"+
        "\1\uffff\1\24\1\u00af\2\24\1\u00b2\1\24\1\u00b4\1\u00b5\2\uffff"+
        "\1\u00b6\1\uffff\1\24\1\uffff\1\u00b8\1\u00b9\1\uffff\1\24\1\uffff"+
        "\1\24\1\uffff\1\u00bc\1\uffff\1\u00bd\1\24\1\uffff\1\u00bf\1\u00c0"+
        "\1\uffff\1\24\3\uffff\1\u00c2\2\uffff\1\u00c3\1\u00c4\2\uffff\1"+
        "\24\2\uffff\1\u00c6\3\uffff\1\u00c7\2\uffff";
    static final String DFA10_eofS =
        "\u00c8\uffff";
    static final String DFA10_minS =
        "\1\11\1\105\1\107\1\101\1\122\1\105\1\122\1\110\1\101\1\116\1\111"+
        "\1\117\1\101\1\uffff\1\122\1\105\1\120\1\117\1\56\1\52\2\uffff\1"+
        "\60\2\uffff\1\76\1\uffff\1\174\2\uffff\1\74\1\uffff\2\75\3\uffff"+
        "\1\114\1\101\2\43\1\116\1\114\1\117\1\43\1\124\1\43\1\105\1\124"+
        "\1\116\1\114\1\104\1\43\1\113\1\103\1\127\1\117\1\114\1\122\1\125"+
        "\1\114\2\104\1\56\20\uffff\1\43\1\105\1\122\1\105\1\117\1\111\1"+
        "\105\2\uffff\1\117\2\125\1\uffff\1\127\1\105\1\uffff\1\122\2\43"+
        "\1\114\2\43\1\uffff\1\105\1\111\1\113\1\116\1\115\1\123\1\43\2\105"+
        "\1\103\1\101\1\105\1\uffff\1\103\1\105\1\122\1\43\1\116\1\130\1"+
        "\122\1\105\1\120\1\105\1\122\1\105\2\uffff\1\43\2\uffff\1\43\1\124"+
        "\1\43\1\125\1\43\2\105\1\uffff\1\43\1\124\1\43\1\124\1\43\1\124"+
        "\1\43\1\124\1\uffff\1\111\1\43\1\105\1\123\1\43\1\105\2\43\2\uffff"+
        "\1\43\1\uffff\1\115\1\uffff\2\43\1\uffff\1\105\1\uffff\1\105\1\uffff"+
        "\1\43\1\uffff\1\43\1\124\1\uffff\2\43\1\uffff\1\116\3\uffff\1\43"+
        "\2\uffff\2\43\2\uffff\1\105\2\uffff\1\43\3\uffff\1\43\2\uffff";
    static final String DFA10_maxS =
        "\1\174\1\110\1\123\1\101\1\122\1\131\1\122\1\110\1\125\1\123\2\117"+
        "\1\122\1\uffff\1\122\1\105\1\120\1\117\1\71\1\52\2\uffff\1\71\2"+
        "\uffff\1\76\1\uffff\1\174\2\uffff\1\76\1\uffff\1\75\1\76\3\uffff"+
        "\1\124\1\101\2\172\1\116\1\114\1\117\1\172\1\124\1\172\1\105\1\124"+
        "\1\116\1\114\1\104\1\172\1\115\1\103\1\127\1\117\1\114\1\122\1\125"+
        "\1\123\2\104\1\71\20\uffff\1\172\1\105\1\122\1\105\1\117\1\111\1"+
        "\105\2\uffff\1\117\2\125\1\uffff\1\127\1\105\1\uffff\1\122\2\172"+
        "\1\114\2\172\1\uffff\1\105\1\111\1\113\1\116\1\115\1\123\1\172\2"+
        "\105\1\103\1\101\1\105\1\uffff\1\103\1\105\1\122\1\172\1\116\1\130"+
        "\1\122\1\105\1\120\1\105\1\122\1\105\2\uffff\1\172\2\uffff\1\172"+
        "\1\124\1\172\1\125\1\172\2\105\1\uffff\1\172\1\124\1\172\1\124\1"+
        "\172\1\124\1\172\1\124\1\uffff\1\111\1\172\1\105\1\123\1\172\1\105"+
        "\2\172\2\uffff\1\172\1\uffff\1\115\1\uffff\2\172\1\uffff\1\105\1"+
        "\uffff\1\105\1\uffff\1\172\1\uffff\1\172\1\124\1\uffff\2\172\1\uffff"+
        "\1\116\3\uffff\1\172\2\uffff\2\172\2\uffff\1\105\2\uffff\1\172\3"+
        "\uffff\1\172\2\uffff";
    static final String DFA10_acceptS =
        "\15\uffff\1\26\6\uffff\1\50\1\51\1\uffff\1\53\1\55\1\uffff\1\57"+
        "\1\uffff\1\63\1\64\1\uffff\1\66\2\uffff\1\72\1\73\1\75\33\uffff"+
        "\1\44\1\52\1\47\1\60\1\54\1\61\1\56\1\62\1\74\1\67\1\77\1\65\1\76"+
        "\1\70\1\100\1\71\7\uffff\1\22\1\16\3\uffff\1\6\2\uffff\1\13\6\uffff"+
        "\1\31\14\uffff\1\1\14\uffff\1\12\1\17\1\uffff\1\14\1\45\7\uffff"+
        "\1\40\10\uffff\1\3\10\uffff\1\21\1\23\1\uffff\1\41\1\uffff\1\25"+
        "\2\uffff\1\27\1\uffff\1\46\1\uffff\1\43\1\uffff\1\42\2\uffff\1\33"+
        "\2\uffff\1\5\1\uffff\1\7\1\11\1\37\1\uffff\1\30\1\32\2\uffff\1\10"+
        "\1\2\1\uffff\1\34\1\4\1\uffff\1\24\1\35\1\36\1\uffff\1\15\1\20";
    static final String DFA10_specialS =
        "\u00c8\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\43\2\uffff\1\43\22\uffff\1\43\1\37\4\uffff\1\44\1\42\1\35"+
            "\1\34\1\23\1\25\1\30\1\27\1\26\1\32\12\22\2\uffff\1\36\1\31"+
            "\1\41\1\15\1\uffff\1\11\1\5\1\24\1\17\1\24\1\14\1\4\1\24\1\2"+
            "\2\24\1\12\1\21\1\10\1\6\2\24\1\13\1\1\1\16\1\20\1\3\1\7\3\24"+
            "\3\uffff\1\40\1\uffff\33\24\1\uffff\1\33",
            "\1\45\2\uffff\1\46",
            "\1\51\6\uffff\1\47\4\uffff\1\50",
            "\1\52",
            "\1\53",
            "\1\55\23\uffff\1\54",
            "\1\56",
            "\1\57",
            "\1\61\15\uffff\1\60\5\uffff\1\62",
            "\1\63\4\uffff\1\64",
            "\1\65\5\uffff\1\66",
            "\1\67",
            "\1\71\15\uffff\1\72\2\uffff\1\70",
            "",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\101\1\uffff\12\77",
            "\1\102",
            "",
            "",
            "\12\101",
            "",
            "",
            "\1\105",
            "",
            "\1\107",
            "",
            "",
            "\1\112\1\111\1\37",
            "",
            "\1\37",
            "\1\115\1\116",
            "",
            "",
            "",
            "\1\121\7\uffff\1\120",
            "\1\122",
            "\2\24\13\uffff\12\24\7\uffff\3\24\1\126\1\24\1\125\14\24\1"+
            "\123\1\124\6\24\4\uffff\1\24\1\uffff\32\24",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\131",
            "\1\132",
            "\1\133",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\135",
            "\2\24\13\uffff\12\24\7\uffff\3\24\1\136\26\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\2\24\13\uffff\12\24\7\uffff\2\24\1\145\27\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\147\1\uffff\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157\6\uffff\1\160",
            "\1\161",
            "\1\162",
            "\1\101\1\uffff\12\77",
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
            "",
            "",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "",
            "\1\177",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\u0082",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\2\24\13\uffff\12\24\7\uffff\2\24\1\u008b\27\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "",
            "",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\u00a0",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\u00a2",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\u00a7",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\u00a9",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\u00ab",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\u00b0",
            "\1\u00b1",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\u00b3",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "",
            "",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "",
            "\1\u00b7",
            "",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\u00be",
            "",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "",
            "\1\u00c1",
            "",
            "",
            "",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "",
            "",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "",
            "",
            "\1\u00c5",
            "",
            "",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "",
            "",
            "",
            "\2\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | N | ASC | DESC | EXPONENT | ID | PLUS | NUMBER | MINUS | DOT | COMMA | EQ | DIVIDE | ASTERISK | ARROW | DOUBLEVERTBAR | RPAREN | LPAREN | LTH | NOT_EQ | LEQ | GEQ | GTH | QUOTED_STRING | WS | BITOR | BITAND | BITXOR | SHIFTLEFT | SHIFTRIGHT );";
        }
    }
 

}