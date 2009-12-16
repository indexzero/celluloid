// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g 2009-12-16 18:13:53

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class celluloidLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int LISTENBLOCK=20;
    public static final int EXPONENT=44;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int CHAR=53;
    public static final int DAY=49;
    public static final int T__61=61;
    public static final int ID=40;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int EQUALITY_OPERATOR=55;
    public static final int CONBLOCK=23;
    public static final int LISTENER=13;
    public static final int TYPE=36;
    public static final int IF=10;
    public static final int ACCEPTS=34;
    public static final int FUNHEAD=25;
    public static final int TIME=50;
    public static final int ANNOUNCEMENT=31;
    public static final int IN=17;
    public static final int ESCAPE=51;
    public static final int ARG=7;
    public static final int FUNBLOCK=22;
    public static final int RETURN=16;
    public static final int DEVICE=33;
    public static final int ARGS=8;
    public static final int ANNOUNCEMENTS=32;
    public static final int MULTIPLICATIVE_OPERATOR=58;
    public static final int COMMENT=43;
    public static final int VARDEF=4;
    public static final int SECOND=46;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int IFBLOCK=21;
    public static final int PRED=6;
    public static final int ELSE=12;
    public static final int BOOL=35;
    public static final int NUMBER=45;
    public static final int EVERY=14;
    public static final int LITERAL=59;
    public static final int T__85=85;
    public static final int EVENT=27;
    public static final int HOUR=48;
    public static final int ADDITIVE_OPERATOR=57;
    public static final int T__84=84;
    public static final int T__86=86;
    public static final int RELATIONAL_OPERATOR=56;
    public static final int ELSEIF=11;
    public static final int T__71=71;
    public static final int LANGUAGE=37;
    public static final int WS=42;
    public static final int T__72=72;
    public static final int REQUIRES=29;
    public static final int NEWLINE=41;
    public static final int T__70=70;
    public static final int WHEN=18;
    public static final int PREDHEAD=26;
    public static final int FUNC=5;
    public static final int INBLOCK=19;
    public static final int START=38;
    public static final int ASSIGNMENT_OPERATOR=54;
    public static final int ANNOUNCES=30;
    public static final int CALL=9;
    public static final int T__76=76;
    public static final int END=39;
    public static final int MINUTE=47;
    public static final int COND=15;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int CONSTRAINT=28;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int DEVBLOCK=24;
    public static final int T__78=78;
    public static final int STRING=52;
    public static final int T__77=77;

    // delegates
    // delegators

    public celluloidLexer() {;} 
    public celluloidLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public celluloidLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g"; }

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:3:7: ( 'in' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:3:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:4:7: ( '*' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:4:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:5:7: ( 'timeline' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:5:9: 'timeline'
            {
            match("timeline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:6:7: ( '=' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:6:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:7:7: ( 'not' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:7:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:8:7: ( 'or' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:8:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:9:7: ( 'and' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:9:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:10:7: ( 'new' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:10:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:11:7: ( '(' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:12:7: ( ')' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:13:7: ( ',' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:14:7: ( 'if' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:14:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:15:7: ( 'else if' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:15:9: 'else if'
            {
            match("else if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:16:7: ( 'else' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:16:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:17:7: ( 'when' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:17:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:18:7: ( 'unless' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:18:9: 'unless'
            {
            match("unless"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:19:7: ( 'every' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:19:9: 'every'
            {
            match("every"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:20:7: ( 'function' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:20:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:21:7: ( 'predicate' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:21:9: 'predicate'
            {
            match("predicate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:22:7: ( 'return' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:22:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:23:7: ( 'event' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:23:9: 'event'
            {
            match("event"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:24:7: ( 'announce' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:24:9: 'announce'
            {
            match("announce"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:25:7: ( 'constraint' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:25:9: 'constraint'
            {
            match("constraint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:26:7: ( 'requires' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:26:9: 'requires'
            {
            match("requires"); 


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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:27:7: ( 'announces' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:27:9: 'announces'
            {
            match("announces"); 


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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:28:7: ( 'device' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:28:9: 'device'
            {
            match("device"); 


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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:29:7: ( 'accepts' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:29:9: 'accepts'
            {
            match("accepts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "BOOL"
    public final void mBOOL() throws RecognitionException {
        try {
            int _type = BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:53:9: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:53:11: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:53:20: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOL"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:54:9: ( 'time' | 'number' | 'string' | 'boolean' | 'input' | 'output' )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt2=1;
                }
                break;
            case 'n':
                {
                alt2=2;
                }
                break;
            case 's':
                {
                alt2=3;
                }
                break;
            case 'b':
                {
                alt2=4;
                }
                break;
            case 'i':
                {
                alt2=5;
                }
                break;
            case 'o':
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:54:11: 'time'
                    {
                    match("time"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:54:20: 'number'
                    {
                    match("number"); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:54:31: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:54:42: 'boolean'
                    {
                    match("boolean"); 


                    }
                    break;
                case 5 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:54:54: 'input'
                    {
                    match("input"); 


                    }
                    break;
                case 6 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:54:64: 'output'
                    {
                    match("output"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "LANGUAGE"
    public final void mLANGUAGE() throws RecognitionException {
        try {
            int _type = LANGUAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:59:21: ( 'JAVA' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:59:23: 'JAVA'
            {
            match("JAVA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LANGUAGE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:64:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:64:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:64:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "START"
    public final void mSTART() throws RecognitionException {
        try {
            int _type = START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:65:7: ( ( 'do' | '{' ) ( NEWLINE )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:65:9: ( 'do' | '{' ) ( NEWLINE )?
            {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:65:9: ( 'do' | '{' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='d') ) {
                alt4=1;
            }
            else if ( (LA4_0=='{') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:65:10: 'do'
                    {
                    match("do"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:65:17: '{'
                    {
                    match('{'); 

                    }
                    break;

            }

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:65:22: ( NEWLINE )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\n'||LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:65:22: NEWLINE
                    {
                    mNEWLINE(); 

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
    // $ANTLR end "START"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:66:7: ( ( 'end' | '}' ) ( NEWLINE )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:66:9: ( 'end' | '}' ) ( NEWLINE )?
            {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:66:9: ( 'end' | '}' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='e') ) {
                alt6=1;
            }
            else if ( (LA6_0=='}') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:66:10: 'end'
                    {
                    match("end"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:66:18: '}'
                    {
                    match('}'); 

                    }
                    break;

            }

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:66:23: ( NEWLINE )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:66:23: NEWLINE
                    {
                    mNEWLINE(); 

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
    // $ANTLR end "END"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:70:9: ( '\\n' | '\\r\\n' | '\\r' )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\r') ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2=='\n') ) {
                    alt8=2;
                }
                else {
                    alt8=3;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:70:11: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:70:18: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:70:27: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:71:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:71:11: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:72:9: ( '#' (~ ( NEWLINE ) )* )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:72:11: '#' (~ ( NEWLINE ) )*
            {
            match('#'); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:72:15: (~ ( NEWLINE ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:72:15: ~ ( NEWLINE )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:76:8: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ ( EXPONENT )? )
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:76:12: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:76:12: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:76:13: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    match('.'); 
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:76:28: ( '0' .. '9' )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:76:29: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:76:40: ( EXPONENT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='E'||LA12_0=='e') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:76:40: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:77:12: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:77:16: ( '0' .. '9' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:77:17: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:77:28: ( EXPONENT )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='E'||LA14_0=='e') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:77:28: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:78:12: ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:78:12: ( '0' .. '9' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:78:13: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:78:24: ( EXPONENT )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='E'||LA16_0=='e') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:78:24: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:79:19: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:79:21: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:79:31: ( '+' | '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='+'||LA18_0=='-') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:79:42: ( '0' .. '9' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:79:43: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "SECOND"
    public final void mSECOND() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:84:17: ( NUMBER 's' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:84:19: NUMBER 's'
            {
            mNUMBER(); 
            match('s'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "SECOND"

    // $ANTLR start "MINUTE"
    public final void mMINUTE() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:85:17: ( NUMBER 'm' SECOND | SECOND )
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:85:19: NUMBER 'm' SECOND
                    {
                    mNUMBER(); 
                    match('m'); 
                    mSECOND(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:85:39: SECOND
                    {
                    mSECOND(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "MINUTE"

    // $ANTLR start "HOUR"
    public final void mHOUR() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:86:16: ( NUMBER 'h' MINUTE | MINUTE )
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:86:18: NUMBER 'h' MINUTE
                    {
                    mNUMBER(); 
                    match('h'); 
                    mMINUTE(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:86:38: MINUTE
                    {
                    mMINUTE(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "HOUR"

    // $ANTLR start "DAY"
    public final void mDAY() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:87:15: ( NUMBER 'd' HOUR | HOUR )
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:87:17: NUMBER 'd' HOUR
                    {
                    mNUMBER(); 
                    match('d'); 
                    mHOUR(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:87:35: HOUR
                    {
                    mHOUR(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "DAY"

    // $ANTLR start "TIME"
    public final void mTIME() throws RecognitionException {
        try {
            int _type = TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:88:14: ( '@' ( DAY | 'start' | 'now' ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:88:16: '@' ( DAY | 'start' | 'now' )
            {
            match('@'); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:88:19: ( DAY | 'start' | 'now' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case '.':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt23=1;
                }
                break;
            case 's':
                {
                alt23=2;
                }
                break;
            case 'n':
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:88:20: DAY
                    {
                    mDAY(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:88:26: 'start'
                    {
                    match("start"); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:88:36: 'now'
                    {
                    match("now"); 


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
    // $ANTLR end "TIME"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:93:18: ( '\"' ( ESCAPE | ~ ( '\"' | '\\\\' ) )* '\"' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:93:20: '\"' ( ESCAPE | ~ ( '\"' | '\\\\' ) )* '\"'
            {
            match('\"'); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:93:24: ( ESCAPE | ~ ( '\"' | '\\\\' ) )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0=='\\') ) {
                    alt24=1;
                }
                else if ( ((LA24_0>='\u0000' && LA24_0<='!')||(LA24_0>='#' && LA24_0<='[')||(LA24_0>=']' && LA24_0<='\uFFFF')) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:93:26: ESCAPE
            	    {
            	    mESCAPE(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:93:35: ~ ( '\"' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            match('\"'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:94:18: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:94:20: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "ESCAPE"
    public final void mESCAPE() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:95:18: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:95:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "ESCAPE"

    // $ANTLR start "ASSIGNMENT_OPERATOR"
    public final void mASSIGNMENT_OPERATOR() throws RecognitionException {
        try {
            int _type = ASSIGNMENT_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:100:26: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' )
            int alt25=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt25=1;
                }
                break;
            case '*':
                {
                alt25=2;
                }
                break;
            case '/':
                {
                alt25=3;
                }
                break;
            case '%':
                {
                alt25=4;
                }
                break;
            case '+':
                {
                alt25=5;
                }
                break;
            case '-':
                {
                alt25=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:100:28: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:100:34: '*='
                    {
                    match("*="); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:100:41: '/='
                    {
                    match("/="); 


                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:100:48: '%='
                    {
                    match("%="); 


                    }
                    break;
                case 5 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:100:55: '+='
                    {
                    match("+="); 


                    }
                    break;
                case 6 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:100:62: '-='
                    {
                    match("-="); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGNMENT_OPERATOR"

    // $ANTLR start "EQUALITY_OPERATOR"
    public final void mEQUALITY_OPERATOR() throws RecognitionException {
        try {
            int _type = EQUALITY_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:101:26: ( '==' | '!=' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='=') ) {
                alt26=1;
            }
            else if ( (LA26_0=='!') ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:101:28: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:101:35: '!='
                    {
                    match("!="); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALITY_OPERATOR"

    // $ANTLR start "RELATIONAL_OPERATOR"
    public final void mRELATIONAL_OPERATOR() throws RecognitionException {
        try {
            int _type = RELATIONAL_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:102:26: ( '>' | '<' | '<=' | '>=' )
            int alt27=4;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='>') ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1=='=') ) {
                    alt27=4;
                }
                else {
                    alt27=1;}
            }
            else if ( (LA27_0=='<') ) {
                int LA27_2 = input.LA(2);

                if ( (LA27_2=='=') ) {
                    alt27=3;
                }
                else {
                    alt27=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:102:28: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:102:34: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:102:40: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:102:47: '>='
                    {
                    match(">="); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RELATIONAL_OPERATOR"

    // $ANTLR start "ADDITIVE_OPERATOR"
    public final void mADDITIVE_OPERATOR() throws RecognitionException {
        try {
            int _type = ADDITIVE_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:103:26: ( '+' | '-' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADDITIVE_OPERATOR"

    // $ANTLR start "MULTIPLICATIVE_OPERATOR"
    public final void mMULTIPLICATIVE_OPERATOR() throws RecognitionException {
        try {
            int _type = MULTIPLICATIVE_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:104:26: ( '*' | '/' | '%' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:
            {
            if ( input.LA(1)=='%'||input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTIPLICATIVE_OPERATOR"

    // $ANTLR start "LITERAL"
    public final void mLITERAL() throws RecognitionException {
        try {
            int _type = LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:108:9: ( BOOL | NUMBER | STRING | TIME )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 'f':
            case 't':
                {
                alt28=1;
                }
                break;
            case '.':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt28=2;
                }
                break;
            case '\"':
                {
                alt28=3;
                }
                break;
            case '@':
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:108:11: BOOL
                    {
                    mBOOL(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:108:18: NUMBER
                    {
                    mNUMBER(); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:108:27: STRING
                    {
                    mSTRING(); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:108:36: TIME
                    {
                    mTIME(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LITERAL"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:8: ( T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | BOOL | TYPE | LANGUAGE | ID | START | END | NEWLINE | WS | COMMENT | NUMBER | TIME | ASSIGNMENT_OPERATOR | EQUALITY_OPERATOR | RELATIONAL_OPERATOR | ADDITIVE_OPERATOR | MULTIPLICATIVE_OPERATOR | LITERAL )
        int alt29=44;
        alt29 = dfa29.predict(input);
        switch (alt29) {
            case 1 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:10: T__60
                {
                mT__60(); 

                }
                break;
            case 2 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:16: T__61
                {
                mT__61(); 

                }
                break;
            case 3 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:22: T__62
                {
                mT__62(); 

                }
                break;
            case 4 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:28: T__63
                {
                mT__63(); 

                }
                break;
            case 5 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:34: T__64
                {
                mT__64(); 

                }
                break;
            case 6 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:40: T__65
                {
                mT__65(); 

                }
                break;
            case 7 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:46: T__66
                {
                mT__66(); 

                }
                break;
            case 8 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:52: T__67
                {
                mT__67(); 

                }
                break;
            case 9 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:58: T__68
                {
                mT__68(); 

                }
                break;
            case 10 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:64: T__69
                {
                mT__69(); 

                }
                break;
            case 11 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:70: T__70
                {
                mT__70(); 

                }
                break;
            case 12 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:76: T__71
                {
                mT__71(); 

                }
                break;
            case 13 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:82: T__72
                {
                mT__72(); 

                }
                break;
            case 14 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:88: T__73
                {
                mT__73(); 

                }
                break;
            case 15 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:94: T__74
                {
                mT__74(); 

                }
                break;
            case 16 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:100: T__75
                {
                mT__75(); 

                }
                break;
            case 17 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:106: T__76
                {
                mT__76(); 

                }
                break;
            case 18 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:112: T__77
                {
                mT__77(); 

                }
                break;
            case 19 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:118: T__78
                {
                mT__78(); 

                }
                break;
            case 20 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:124: T__79
                {
                mT__79(); 

                }
                break;
            case 21 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:130: T__80
                {
                mT__80(); 

                }
                break;
            case 22 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:136: T__81
                {
                mT__81(); 

                }
                break;
            case 23 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:142: T__82
                {
                mT__82(); 

                }
                break;
            case 24 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:148: T__83
                {
                mT__83(); 

                }
                break;
            case 25 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:154: T__84
                {
                mT__84(); 

                }
                break;
            case 26 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:160: T__85
                {
                mT__85(); 

                }
                break;
            case 27 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:166: T__86
                {
                mT__86(); 

                }
                break;
            case 28 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:172: BOOL
                {
                mBOOL(); 

                }
                break;
            case 29 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:177: TYPE
                {
                mTYPE(); 

                }
                break;
            case 30 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:182: LANGUAGE
                {
                mLANGUAGE(); 

                }
                break;
            case 31 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:191: ID
                {
                mID(); 

                }
                break;
            case 32 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:194: START
                {
                mSTART(); 

                }
                break;
            case 33 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:200: END
                {
                mEND(); 

                }
                break;
            case 34 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:204: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 35 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:212: WS
                {
                mWS(); 

                }
                break;
            case 36 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:215: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 37 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:223: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 38 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:230: TIME
                {
                mTIME(); 

                }
                break;
            case 39 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:235: ASSIGNMENT_OPERATOR
                {
                mASSIGNMENT_OPERATOR(); 

                }
                break;
            case 40 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:255: EQUALITY_OPERATOR
                {
                mEQUALITY_OPERATOR(); 

                }
                break;
            case 41 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:273: RELATIONAL_OPERATOR
                {
                mRELATIONAL_OPERATOR(); 

                }
                break;
            case 42 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:293: ADDITIVE_OPERATOR
                {
                mADDITIVE_OPERATOR(); 

                }
                break;
            case 43 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:311: MULTIPLICATIVE_OPERATOR
                {
                mMULTIPLICATIVE_OPERATOR(); 

                }
                break;
            case 44 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:335: LITERAL
                {
                mLITERAL(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA17_eotS =
        "\1\uffff\1\4\3\uffff";
    static final String DFA17_eofS =
        "\5\uffff";
    static final String DFA17_minS =
        "\2\56\3\uffff";
    static final String DFA17_maxS =
        "\2\71\3\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA17_specialS =
        "\5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "76:1: NUMBER : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ ( EXPONENT )? );";
        }
    }
    static final String DFA20_eotS =
        "\21\uffff";
    static final String DFA20_eofS =
        "\21\uffff";
    static final String DFA20_minS =
        "\2\56\1\60\1\53\2\uffff\5\60\2\53\4\60";
    static final String DFA20_maxS =
        "\1\71\1\163\2\71\2\uffff\2\163\1\71\2\163\3\71\1\163\1\71\1\163";
    static final String DFA20_acceptS =
        "\4\uffff\1\1\1\2\13\uffff";
    static final String DFA20_specialS =
        "\21\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\6\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3\7\uffff\1\4\5"+
            "\uffff\1\5",
            "\12\7",
            "\1\10\1\uffff\1\10\2\uffff\12\11",
            "",
            "",
            "\12\12\13\uffff\1\13\37\uffff\1\13\7\uffff\1\4\5\uffff\1\5",
            "\12\7\13\uffff\1\14\37\uffff\1\14\7\uffff\1\4\5\uffff\1\5",
            "\12\11",
            "\12\11\63\uffff\1\4\5\uffff\1\5",
            "\12\12\13\uffff\1\13\37\uffff\1\13\7\uffff\1\4\5\uffff\1\5",
            "\1\15\1\uffff\1\15\2\uffff\12\16",
            "\1\17\1\uffff\1\17\2\uffff\12\20",
            "\12\16",
            "\12\16\63\uffff\1\4\5\uffff\1\5",
            "\12\20",
            "\12\20\63\uffff\1\4\5\uffff\1\5"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "85:10: fragment MINUTE : ( NUMBER 'm' SECOND | SECOND );";
        }
    }
    static final String DFA21_eotS =
        "\21\uffff";
    static final String DFA21_eofS =
        "\21\uffff";
    static final String DFA21_minS =
        "\2\56\1\60\1\53\1\uffff\1\60\1\uffff\4\60\2\53\4\60";
    static final String DFA21_maxS =
        "\1\71\1\163\2\71\1\uffff\1\163\1\uffff\1\163\1\71\2\163\3\71\1"+
        "\163\1\71\1\163";
    static final String DFA21_acceptS =
        "\4\uffff\1\1\1\uffff\1\2\12\uffff";
    static final String DFA21_specialS =
        "\21\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\5\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3\2\uffff\1\4\4"+
            "\uffff\1\6\5\uffff\1\6",
            "\12\7",
            "\1\10\1\uffff\1\10\2\uffff\12\11",
            "",
            "\12\12\13\uffff\1\13\37\uffff\1\13\2\uffff\1\4\4\uffff\1\6"+
            "\5\uffff\1\6",
            "",
            "\12\7\13\uffff\1\14\37\uffff\1\14\2\uffff\1\4\4\uffff\1\6"+
            "\5\uffff\1\6",
            "\12\11",
            "\12\11\56\uffff\1\4\4\uffff\1\6\5\uffff\1\6",
            "\12\12\13\uffff\1\13\37\uffff\1\13\2\uffff\1\4\4\uffff\1\6"+
            "\5\uffff\1\6",
            "\1\15\1\uffff\1\15\2\uffff\12\16",
            "\1\17\1\uffff\1\17\2\uffff\12\20",
            "\12\16",
            "\12\16\56\uffff\1\4\4\uffff\1\6\5\uffff\1\6",
            "\12\20",
            "\12\20\56\uffff\1\4\4\uffff\1\6\5\uffff\1\6"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "86:10: fragment HOUR : ( NUMBER 'h' MINUTE | MINUTE );";
        }
    }
    static final String DFA22_eotS =
        "\21\uffff";
    static final String DFA22_eofS =
        "\21\uffff";
    static final String DFA22_minS =
        "\2\56\1\60\1\53\1\uffff\1\60\1\uffff\4\60\2\53\4\60";
    static final String DFA22_maxS =
        "\1\71\1\163\2\71\1\uffff\1\163\1\uffff\1\163\1\71\2\163\3\71\1"+
        "\163\1\71\1\163";
    static final String DFA22_acceptS =
        "\4\uffff\1\2\1\uffff\1\1\12\uffff";
    static final String DFA22_specialS =
        "\21\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\5\1\uffff\12\1\13\uffff\1\3\36\uffff\1\6\1\3\2\uffff\1"+
            "\4\4\uffff\1\4\5\uffff\1\4",
            "\12\7",
            "\1\10\1\uffff\1\10\2\uffff\12\11",
            "",
            "\12\12\13\uffff\1\13\36\uffff\1\6\1\13\2\uffff\1\4\4\uffff"+
            "\1\4\5\uffff\1\4",
            "",
            "\12\7\13\uffff\1\14\36\uffff\1\6\1\14\2\uffff\1\4\4\uffff"+
            "\1\4\5\uffff\1\4",
            "\12\11",
            "\12\11\52\uffff\1\6\3\uffff\1\4\4\uffff\1\4\5\uffff\1\4",
            "\12\12\13\uffff\1\13\36\uffff\1\6\1\13\2\uffff\1\4\4\uffff"+
            "\1\4\5\uffff\1\4",
            "\1\15\1\uffff\1\15\2\uffff\12\16",
            "\1\17\1\uffff\1\17\2\uffff\12\20",
            "\12\16",
            "\12\16\52\uffff\1\6\3\uffff\1\4\4\uffff\1\4\5\uffff\1\4",
            "\12\20",
            "\12\20\52\uffff\1\6\3\uffff\1\4\4\uffff\1\4\5\uffff\1\4"
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "87:10: fragment DAY : ( NUMBER 'd' HOUR | HOUR );";
        }
    }
    static final String DFA29_eotS =
        "\1\uffff\1\26\1\52\1\26\1\55\3\26\3\uffff\13\26\7\uffff\1\107\2"+
        "\uffff\2\115\2\116\3\uffff\1\120\1\121\2\uffff\2\26\1\uffff\3\26"+
        "\1\127\22\26\1\uffff\1\107\2\uffff\1\107\6\uffff\1\26\2\uffff\2"+
        "\26\1\174\1\175\1\26\1\uffff\1\26\1\u0080\21\26\1\107\2\uffff\1"+
        "\107\12\uffff\1\26\1\u00a6\1\u00a7\2\uffff\2\26\1\uffff\2\26\1\u00ad"+
        "\2\26\1\u00b0\12\26\1\u00bb\1\uffff\1\107\1\uffff\1\107\16\uffff"+
        "\1\u00a6\1\26\2\uffff\4\26\2\uffff\1\u00d5\1\u00d6\1\uffff\2\26"+
        "\1\u00a7\7\26\25\uffff\1\26\2\u00a6\2\26\2\uffff\1\u00f9\2\26\1"+
        "\u00fc\2\26\1\u00ff\1\u00a6\1\26\26\uffff\2\26\1\u011c\1\uffff\2"+
        "\26\1\uffff\2\26\1\uffff\1\u00a6\31\uffff\1\u0132\1\u0134\1\uffff"+
        "\1\u0135\1\26\1\u0137\1\26\22\uffff\1\u0149\2\uffff\1\u014a\1\uffff"+
        "\1\26\22\uffff\1\u0151\12\uffff";
    static final String DFA29_eofS =
        "\u0156\uffff";
    static final String DFA29_minS =
        "\1\11\1\146\1\75\1\151\1\75\1\145\1\162\1\143\3\uffff\1\154\1\150"+
        "\1\156\1\141\1\162\1\145\1\157\1\145\1\164\1\157\1\101\7\uffff\1"+
        "\56\1\60\1\56\4\75\3\uffff\2\60\2\uffff\1\155\1\165\1\uffff\1\164"+
        "\1\167\1\155\1\60\1\164\1\144\1\143\1\163\1\145\1\144\1\145\1\154"+
        "\1\156\1\154\1\145\1\161\1\156\1\166\1\12\1\162\1\157\1\126\1\uffff"+
        "\1\60\1\53\1\uffff\1\60\1\56\1\60\1\164\1\157\2\uffff\1\165\2\uffff"+
        "\2\145\2\60\1\142\1\uffff\1\160\1\60\1\157\2\145\1\156\1\12\1\156"+
        "\1\145\1\143\1\163\1\144\2\165\1\163\2\151\1\154\1\101\1\60\1\53"+
        "\2\60\2\53\2\56\1\60\1\uffff\1\56\1\60\1\141\1\167\1\164\2\60\2"+
        "\uffff\1\145\1\165\1\uffff\1\165\1\160\1\40\1\171\1\164\1\60\1\163"+
        "\1\164\1\145\1\151\1\162\1\151\1\164\1\143\1\156\1\145\7\60\1\56"+
        "\1\60\1\56\2\60\1\53\1\uffff\1\56\1\60\1\53\1\162\1\uffff\1\60\1"+
        "\151\2\uffff\1\162\1\164\1\156\1\164\2\uffff\2\60\1\uffff\1\163"+
        "\1\151\1\60\1\143\1\156\2\162\1\145\1\147\1\141\1\uffff\1\60\1\53"+
        "\1\uffff\1\56\2\60\1\53\1\uffff\4\60\1\53\1\uffff\2\56\3\60\1\164"+
        "\1\156\2\60\1\143\1\163\2\uffff\1\60\1\157\1\141\1\60\1\145\1\141"+
        "\2\60\1\156\1\60\1\53\2\60\1\56\1\60\1\53\1\60\1\53\2\60\1\53\1"+
        "\60\1\53\2\60\1\56\1\60\1\56\1\60\1\53\1\uffff\2\145\1\60\1\uffff"+
        "\1\156\1\164\1\uffff\1\163\1\151\1\uffff\4\60\1\53\1\uffff\12\60"+
        "\1\53\1\uffff\2\60\1\53\1\uffff\1\56\5\60\1\uffff\1\60\1\145\1\60"+
        "\1\156\1\60\1\53\2\60\1\53\1\60\1\53\2\60\1\53\1\60\1\53\2\60\1"+
        "\56\1\60\1\53\1\uffff\1\60\2\uffff\1\60\1\uffff\1\164\12\60\1\53"+
        "\1\uffff\4\60\2\uffff\4\60\2\53\1\uffff\4\60";
    static final String DFA29_maxS =
        "\1\175\1\156\1\75\1\162\1\75\2\165\1\156\3\uffff\1\166\1\150\1"+
        "\156\1\165\1\162\1\145\2\157\1\164\1\157\1\101\7\uffff\1\145\1\71"+
        "\1\163\4\75\3\uffff\2\172\2\uffff\1\155\1\165\1\uffff\1\164\1\167"+
        "\1\155\1\172\1\164\1\156\1\143\1\163\1\145\1\144\1\145\1\154\1\156"+
        "\1\154\1\145\1\164\1\156\1\166\1\15\1\162\1\157\1\126\1\uffff\1"+
        "\145\1\71\1\uffff\1\145\1\163\1\71\1\164\1\157\2\uffff\1\165\2\uffff"+
        "\2\145\2\172\1\142\1\uffff\1\160\1\172\1\157\2\145\1\162\1\15\1"+
        "\156\1\145\1\143\1\163\1\144\2\165\1\163\2\151\1\154\1\101\1\145"+
        "\7\71\1\163\1\uffff\1\71\1\163\1\141\1\167\1\164\2\172\2\uffff\1"+
        "\145\1\165\1\uffff\1\165\1\160\1\172\1\171\1\164\1\172\1\163\1\164"+
        "\1\145\1\151\1\162\1\151\1\164\1\143\1\156\1\145\1\172\5\71\2\163"+
        "\1\71\1\163\1\71\1\163\1\71\1\uffff\1\163\2\71\1\162\1\uffff\1\172"+
        "\1\151\2\uffff\1\162\1\164\1\156\1\164\2\uffff\2\172\1\uffff\1\163"+
        "\1\151\1\172\1\143\1\156\2\162\1\145\1\147\1\141\1\uffff\1\163\1"+
        "\71\1\uffff\1\71\2\163\1\71\1\uffff\1\163\1\71\2\163\1\71\1\uffff"+
        "\2\71\1\163\1\71\1\163\1\164\1\156\2\172\1\143\1\163\2\uffff\1\172"+
        "\1\157\1\141\1\172\1\145\1\141\2\172\1\156\1\163\2\71\2\163\2\71"+
        "\1\163\2\71\1\163\1\71\1\163\2\71\2\163\1\71\1\163\2\71\1\uffff"+
        "\2\145\1\172\1\uffff\1\156\1\164\1\uffff\1\163\1\151\1\uffff\1\172"+
        "\1\71\2\163\1\71\1\uffff\1\163\1\71\1\163\1\71\1\163\1\71\1\163"+
        "\1\71\2\163\1\71\1\uffff\2\163\1\71\1\uffff\1\71\1\163\1\71\1\163"+
        "\2\172\1\uffff\1\172\1\145\1\172\1\156\1\163\2\71\1\163\1\71\1\163"+
        "\2\71\1\163\1\71\1\163\2\71\2\163\2\71\1\uffff\1\172\2\uffff\1\172"+
        "\1\uffff\1\164\1\71\1\163\1\71\1\163\1\71\1\163\1\71\1\163\1\71"+
        "\1\163\1\71\1\uffff\2\163\1\71\1\163\2\uffff\1\172\1\71\2\163\2"+
        "\71\1\uffff\1\71\1\163\1\71\1\163";
    static final String DFA29_acceptS =
        "\10\uffff\1\11\1\12\1\13\13\uffff\1\37\1\40\1\41\2\42\1\43\1\44"+
        "\7\uffff\1\50\1\51\1\54\2\uffff\1\47\1\2\2\uffff\1\4\26\uffff\1"+
        "\42\2\uffff\1\45\5\uffff\1\53\1\52\1\uffff\1\1\1\14\5\uffff\1\6"+
        "\34\uffff\1\46\7\uffff\1\5\1\10\2\uffff\1\7\35\uffff\1\46\4\uffff"+
        "\1\46\2\uffff\1\35\1\34\4\uffff\1\15\1\16\2\uffff\1\17\12\uffff"+
        "\1\36\2\uffff\1\46\4\uffff\1\46\5\uffff\1\46\13\uffff\1\21\1\25"+
        "\36\uffff\1\46\3\uffff\1\20\2\uffff\1\24\2\uffff\1\32\5\uffff\1"+
        "\46\13\uffff\1\46\3\uffff\1\46\6\uffff\1\33\25\uffff\1\3\1\uffff"+
        "\1\26\1\22\1\uffff\1\30\14\uffff\1\46\4\uffff\1\31\1\23\6\uffff"+
        "\1\27\4\uffff";
    static final String DFA29_specialS =
        "\u0156\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\33\1\31\2\uffff\1\32\22\uffff\1\33\1\44\1\46\1\34\1\uffff"+
            "\1\41\2\uffff\1\10\1\11\1\2\1\42\1\12\1\43\1\36\1\40\12\35\2"+
            "\uffff\1\45\1\4\1\45\1\uffff\1\37\11\26\1\25\20\26\4\uffff\1"+
            "\26\1\uffff\1\7\1\24\1\21\1\22\1\13\1\16\2\26\1\1\4\26\1\5\1"+
            "\6\1\17\1\26\1\20\1\23\1\3\1\15\1\26\1\14\3\26\1\27\1\uffff"+
            "\1\30",
            "\1\50\7\uffff\1\47",
            "\1\51",
            "\1\53\10\uffff\1\54",
            "\1\44",
            "\1\57\11\uffff\1\56\5\uffff\1\60",
            "\1\61\2\uffff\1\62",
            "\1\64\12\uffff\1\63",
            "",
            "",
            "",
            "\1\65\1\uffff\1\67\7\uffff\1\66",
            "\1\70",
            "\1\71",
            "\1\73\23\uffff\1\72",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77\11\uffff\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\105\1\uffff\12\35\13\uffff\1\106\37\uffff\1\106",
            "\12\110",
            "\1\112\1\uffff\12\111\64\uffff\1\114\4\uffff\1\113",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\17\26\1\117\12\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\1\122",
            "\1\123",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\130",
            "\1\131\11\uffff\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\145\2\uffff\1\144",
            "\1\146",
            "\1\147",
            "\1\27\2\uffff\1\27",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "\12\153\13\uffff\1\154\37\uffff\1\154",
            "\1\155\1\uffff\1\155\2\uffff\12\156",
            "",
            "\12\110\13\uffff\1\157\37\uffff\1\157",
            "\1\163\1\uffff\12\111\13\uffff\1\160\36\uffff\1\165\1\160"+
            "\2\uffff\1\161\4\uffff\1\162\5\uffff\1\164",
            "\12\166",
            "\1\167",
            "\1\170",
            "",
            "",
            "\1\171",
            "",
            "",
            "\1\172",
            "\1\173",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\176",
            "",
            "\1\177",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0085\3\uffff\1\u0084",
            "\1\30\2\uffff\1\30",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\153\13\uffff\1\154\37\uffff\1\154",
            "\1\u0092\1\uffff\1\u0092\2\uffff\12\u0093",
            "\12\156",
            "\12\156",
            "\1\u0094\1\uffff\1\u0094\2\uffff\12\u0095",
            "\1\u0096\1\uffff\1\u0096\2\uffff\12\u0097",
            "\1\u0099\1\uffff\12\u0098",
            "\1\u009b\1\uffff\12\u009a",
            "\12\u009c\13\uffff\1\u009d\36\uffff\1\165\1\u009d\2\uffff"+
            "\1\161\4\uffff\1\162\5\uffff\1\164",
            "",
            "\1\u00a0\1\uffff\12\u009f",
            "\12\166\13\uffff\1\u00a1\36\uffff\1\165\1\u00a1\2\uffff\1"+
            "\161\4\uffff\1\162\5\uffff\1\164",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\13\26\1\u00a5\16"+
            "\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac\17\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff"+
            "\32\26",
            "\1\u00ae",
            "\1\u00af",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\u0093",
            "\12\u0093",
            "\12\u0095",
            "\12\u0095",
            "\12\u0097",
            "\12\u0097\52\uffff\1\165\3\uffff\1\161\4\uffff\1\162\5\uffff"+
            "\1\164",
            "\1\u00bc\1\uffff\12\u0098\13\uffff\1\u00bd\37\uffff\1\u00bd"+
            "\7\uffff\1\u00bf\5\uffff\1\u00be",
            "\12\u00c0",
            "\1\u00c1\1\uffff\12\u009a\13\uffff\1\u00c2\37\uffff\1\u00c2"+
            "\15\uffff\1\u00c3",
            "\12\u00c4",
            "\12\u009c\13\uffff\1\u009d\36\uffff\1\165\1\u009d\2\uffff"+
            "\1\161\4\uffff\1\162\5\uffff\1\164",
            "\1\u00c5\1\uffff\1\u00c5\2\uffff\12\u00c6",
            "",
            "\1\u00c7\1\uffff\12\u009f\13\uffff\1\u00c8\37\uffff\1\u00c8"+
            "\2\uffff\1\u00cb\4\uffff\1\u00ca\5\uffff\1\u00c9",
            "\12\u00cc",
            "\1\u00cd\1\uffff\1\u00cd\2\uffff\12\u00ce",
            "\1\u00cf",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00d0",
            "",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "",
            "\12\u00e0\13\uffff\1\u00e1\37\uffff\1\u00e1\7\uffff\1\u00bf"+
            "\5\uffff\1\u00be",
            "\1\u00e2\1\uffff\1\u00e2\2\uffff\12\u00e3",
            "",
            "\1\u00e5\1\uffff\12\u00e4",
            "\12\u00c0\13\uffff\1\u00e6\37\uffff\1\u00e6\7\uffff\1\u00bf"+
            "\5\uffff\1\u00be",
            "\12\u00e7\13\uffff\1\u00e8\37\uffff\1\u00e8\15\uffff\1\u00c3",
            "\1\u00e9\1\uffff\1\u00e9\2\uffff\12\u00ea",
            "",
            "\12\u00c4\13\uffff\1\u00eb\37\uffff\1\u00eb\15\uffff\1\u00c3",
            "\12\u00c6",
            "\12\u00c6\52\uffff\1\165\3\uffff\1\161\4\uffff\1\162\5\uffff"+
            "\1\164",
            "\12\u00ec\13\uffff\1\u00ed\37\uffff\1\u00ed\2\uffff\1\u00cb"+
            "\4\uffff\1\u00ca\5\uffff\1\u00c9",
            "\1\u00ee\1\uffff\1\u00ee\2\uffff\12\u00ef",
            "",
            "\1\u00f1\1\uffff\12\u00f0",
            "\1\u00f3\1\uffff\12\u00f2",
            "\12\u00cc\13\uffff\1\u00f4\37\uffff\1\u00f4\2\uffff\1\u00cb"+
            "\4\uffff\1\u00ca\5\uffff\1\u00c9",
            "\12\u00ce",
            "\12\u00ce\52\uffff\1\165\3\uffff\1\161\4\uffff\1\162\5\uffff"+
            "\1\164",
            "\1\u00f5",
            "\1\u00f6",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00f7",
            "\1\u00f8",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00fa",
            "\1\u00fb",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00fd",
            "\1\u00fe",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u0100",
            "\12\u00e0\13\uffff\1\u00e1\37\uffff\1\u00e1\7\uffff\1\u00bf"+
            "\5\uffff\1\u00be",
            "\1\u0101\1\uffff\1\u0101\2\uffff\12\u0102",
            "\12\u00e3",
            "\12\u00e3\63\uffff\1\u00bf\5\uffff\1\u00be",
            "\1\u0103\1\uffff\12\u00e4\13\uffff\1\u0104\37\uffff\1\u0104"+
            "\15\uffff\1\u0105",
            "\12\u0106",
            "\1\u0107\1\uffff\1\u0107\2\uffff\12\u0108",
            "\12\u00e7\13\uffff\1\u00e8\37\uffff\1\u00e8\15\uffff\1\u00c3",
            "\1\u0109\1\uffff\1\u0109\2\uffff\12\u010a",
            "\12\u00ea",
            "\12\u00ea\71\uffff\1\u00c3",
            "\1\u010b\1\uffff\1\u010b\2\uffff\12\u010c",
            "\12\u00ec\13\uffff\1\u00ed\37\uffff\1\u00ed\2\uffff\1\u00cb"+
            "\4\uffff\1\u00ca\5\uffff\1\u00c9",
            "\1\u010d\1\uffff\1\u010d\2\uffff\12\u010e",
            "\12\u00ef",
            "\12\u00ef\56\uffff\1\u00cb\4\uffff\1\u00ca\5\uffff\1\u00c9",
            "\1\u010f\1\uffff\12\u00f0\13\uffff\1\u0110\37\uffff\1\u0110"+
            "\15\uffff\1\u0111",
            "\12\u0112",
            "\1\u0113\1\uffff\12\u00f2\13\uffff\1\u0114\37\uffff\1\u0114"+
            "\7\uffff\1\u0116\5\uffff\1\u0115",
            "\12\u0117",
            "\1\u0118\1\uffff\1\u0118\2\uffff\12\u0119",
            "",
            "\1\u011a",
            "\1\u011b",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\u011d",
            "\1\u011e",
            "",
            "\1\u011f",
            "\1\u0120",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\u0102",
            "\12\u0102\63\uffff\1\u00bf\5\uffff\1\u00be",
            "\12\u0121\13\uffff\1\u0122\37\uffff\1\u0122\15\uffff\1\u0105",
            "\1\u0123\1\uffff\1\u0123\2\uffff\12\u0124",
            "",
            "\12\u0106\13\uffff\1\u0125\37\uffff\1\u0125\15\uffff\1\u0105",
            "\12\u0108",
            "\12\u0108\63\uffff\1\u00bf\5\uffff\1\u00be",
            "\12\u010a",
            "\12\u010a\71\uffff\1\u00c3",
            "\12\u010c",
            "\12\u010c\71\uffff\1\u00c3",
            "\12\u010e",
            "\12\u010e\56\uffff\1\u00cb\4\uffff\1\u00ca\5\uffff\1\u00c9",
            "\12\u0126\13\uffff\1\u0127\37\uffff\1\u0127\15\uffff\1\u0111",
            "\1\u0128\1\uffff\1\u0128\2\uffff\12\u0129",
            "",
            "\12\u0112\13\uffff\1\u012a\37\uffff\1\u012a\15\uffff\1\u0111",
            "\12\u012b\13\uffff\1\u012c\37\uffff\1\u012c\7\uffff\1\u0116"+
            "\5\uffff\1\u0115",
            "\1\u012d\1\uffff\1\u012d\2\uffff\12\u012e",
            "",
            "\1\u0130\1\uffff\12\u012f",
            "\12\u0117\13\uffff\1\u0131\37\uffff\1\u0131\7\uffff\1\u0116"+
            "\5\uffff\1\u0115",
            "\12\u0119",
            "\12\u0119\56\uffff\1\u00cb\4\uffff\1\u00ca\5\uffff\1\u00c9",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\22\26\1\u0133\7"+
            "\26",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u0136",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u0138",
            "\12\u0121\13\uffff\1\u0122\37\uffff\1\u0122\15\uffff\1\u0105",
            "\1\u0139\1\uffff\1\u0139\2\uffff\12\u013a",
            "\12\u0124",
            "\12\u0124\71\uffff\1\u0105",
            "\1\u013b\1\uffff\1\u013b\2\uffff\12\u013c",
            "\12\u0126\13\uffff\1\u0127\37\uffff\1\u0127\15\uffff\1\u0111",
            "\1\u013d\1\uffff\1\u013d\2\uffff\12\u013e",
            "\12\u0129",
            "\12\u0129\71\uffff\1\u0111",
            "\1\u013f\1\uffff\1\u013f\2\uffff\12\u0140",
            "\12\u012b\13\uffff\1\u012c\37\uffff\1\u012c\7\uffff\1\u0116"+
            "\5\uffff\1\u0115",
            "\1\u0141\1\uffff\1\u0141\2\uffff\12\u0142",
            "\12\u012e",
            "\12\u012e\63\uffff\1\u0116\5\uffff\1\u0115",
            "\1\u0145\1\uffff\12\u012f\13\uffff\1\u0143\37\uffff\1\u0143"+
            "\15\uffff\1\u0144",
            "\12\u0146",
            "\1\u0147\1\uffff\1\u0147\2\uffff\12\u0148",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\u014b",
            "\12\u013a",
            "\12\u013a\71\uffff\1\u0105",
            "\12\u013c",
            "\12\u013c\71\uffff\1\u0105",
            "\12\u013e",
            "\12\u013e\71\uffff\1\u0111",
            "\12\u0140",
            "\12\u0140\71\uffff\1\u0111",
            "\12\u0142",
            "\12\u0142\63\uffff\1\u0116\5\uffff\1\u0115",
            "\1\u014c\1\uffff\1\u014c\2\uffff\12\u014d",
            "",
            "\12\u014e\13\uffff\1\u014f\37\uffff\1\u014f\15\uffff\1\u0144",
            "\12\u0146\13\uffff\1\u0150\37\uffff\1\u0150\15\uffff\1\u0144",
            "\12\u0148",
            "\12\u0148\63\uffff\1\u0116\5\uffff\1\u0115",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\u014d",
            "\12\u014d\71\uffff\1\u0144",
            "\12\u014e\13\uffff\1\u014f\37\uffff\1\u014f\15\uffff\1\u0144",
            "\1\u0152\1\uffff\1\u0152\2\uffff\12\u0153",
            "\1\u0154\1\uffff\1\u0154\2\uffff\12\u0155",
            "",
            "\12\u0153",
            "\12\u0153\71\uffff\1\u0144",
            "\12\u0155",
            "\12\u0155\71\uffff\1\u0144"
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | BOOL | TYPE | LANGUAGE | ID | START | END | NEWLINE | WS | COMMENT | NUMBER | TIME | ASSIGNMENT_OPERATOR | EQUALITY_OPERATOR | RELATIONAL_OPERATOR | ADDITIVE_OPERATOR | MULTIPLICATIVE_OPERATOR | LITERAL );";
        }
    }
 

}