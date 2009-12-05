// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g 2009-12-05 17:10:16

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class celluloidLexer extends Lexer {
    public static final int EXPONENT=13;
    public static final int T__29=29;
    public static final int CHAR=21;
    public static final int DAY=18;
    public static final int ID=9;
    public static final int EOF=-1;
    public static final int EQUALITY_OPERATOR=24;
    public static final int TYPE=5;
    public static final int TIME=19;
    public static final int ESC_SEQ=20;
    public static final int MULTIPLICATIVE_OPERATOR=27;
    public static final int COMMENT=12;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int SECOND=15;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int BOOL=4;
    public static final int NUMBER=14;
    public static final int LITERAL=28;
    public static final int ADDITIVE_OPERATOR=26;
    public static final int HOUR=17;
    public static final int RELATIONAL_OPERATOR=25;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int LANGUAGE=6;
    public static final int WS=11;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int NEWLINE=10;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int START=7;
    public static final int ASSIGNMENT_OPERATOR=23;
    public static final int MINUTE=16;
    public static final int END=8;
    public static final int STRING=22;

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

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:7:7: ( 'or' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:7:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:8:7: ( 'and' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:8:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:9:7: ( 'new' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:9:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:10:7: ( '(' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:10:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:11:7: ( ')' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:11:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:12:7: ( ',' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:12:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:13:7: ( 'function' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:13:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:14:7: ( 'predicate' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:14:9: 'predicate'
            {
            match("predicate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:15:7: ( 'returns' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:15:9: 'returns'
            {
            match("returns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:16:7: ( 'event' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:16:9: 'event'
            {
            match("event"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:17:7: ( 'announce' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:17:9: 'announce'
            {
            match("announce"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:18:7: ( 'when' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:18:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:19:7: ( 'constraint' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:19:9: 'constraint'
            {
            match("constraint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:20:7: ( 'announces' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:20:9: 'announces'
            {
            match("announces"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:21:7: ( 'requires' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:21:9: 'requires'
            {
            match("requires"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:22:7: ( 'accepts' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:22:9: 'accepts'
            {
            match("accepts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:23:7: ( 'device' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:23:9: 'device'
            {
            match("device"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "BOOL"
    public final void mBOOL() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:8:18: ( 'true' | 'false' )
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:8:20: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:8:29: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:9:12: ( 'time' | 'number' | 'string' | 'boolean' | 'input' | 'output' )
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:9:14: 'time'
                    {
                    match("time"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:9:23: 'number'
                    {
                    match("number"); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:9:34: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:9:45: 'boolean'
                    {
                    match("boolean"); 


                    }
                    break;
                case 5 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:9:57: 'input'
                    {
                    match("input"); 


                    }
                    break;
                case 6 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:9:67: 'output'
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:14:21: ( 'JAVA' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:14:23: 'JAVA'
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:19:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:19:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:19:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:20:7: ( ( 'do' | '{' ) NEWLINE )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:20:9: ( 'do' | '{' ) NEWLINE
            {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:20:9: ( 'do' | '{' )
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:20:10: 'do'
                    {
                    match("do"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:20:17: '{'
                    {
                    match('{'); 

                    }
                    break;

            }

            mNEWLINE(); 

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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:21:7: ( ( 'end' | '}' ) NEWLINE )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:21:9: ( 'end' | '}' ) NEWLINE
            {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:21:9: ( 'end' | '}' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='e') ) {
                alt5=1;
            }
            else if ( (LA5_0=='}') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:21:10: 'end'
                    {
                    match("end"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:21:18: '}'
                    {
                    match('}'); 

                    }
                    break;

            }

            mNEWLINE(); 

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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:25:9: ( '\\n' | '\\r' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
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
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:26:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:26:11: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:27:9: ( '#' (~ ( NEWLINE ) )* )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:27:11: '#' (~ ( NEWLINE ) )*
            {
            match('#'); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:27:15: (~ ( NEWLINE ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:27:15: ~ ( NEWLINE )
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
            	    break loop6;
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:31:17: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:31:21: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:31:21: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:31:22: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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

                    match('.'); 
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:31:37: ( '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:31:38: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:31:49: ( EXPONENT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:31:49: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:32:12: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:32:16: ( '0' .. '9' )+
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
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:32:17: '0' .. '9'
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

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:32:28: ( EXPONENT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:32:28: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:33:12: ( '0' .. '9' )+ EXPONENT
                    {
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:33:12: ( '0' .. '9' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:33:13: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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

                    mEXPONENT(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:34:19: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:34:21: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:34:31: ( '+' | '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='+'||LA14_0=='-') ) {
                alt14=1;
            }
            switch (alt14) {
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

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:34:42: ( '0' .. '9' )+
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
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:34:43: '0' .. '9'
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


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "SECOND"
    public final void mSECOND() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:39:17: ( NUMBER 's' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:39:19: NUMBER 's'
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:40:17: ( NUMBER 'm' SECOND | SECOND )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:40:19: NUMBER 'm' SECOND
                    {
                    mNUMBER(); 
                    match('m'); 
                    mSECOND(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:40:39: SECOND
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:41:16: ( NUMBER 'h' MINUTE | MINUTE )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:41:18: NUMBER 'h' MINUTE
                    {
                    mNUMBER(); 
                    match('h'); 
                    mMINUTE(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:41:38: MINUTE
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:42:15: ( NUMBER 'd' HOUR | HOUR )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:42:17: NUMBER 'd' HOUR
                    {
                    mNUMBER(); 
                    match('d'); 
                    mHOUR(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:42:35: HOUR
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:43:15: ( '@' DAY )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:43:17: '@' DAY
            {
            match('@'); 
            mDAY(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "TIME"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:47:19: ( '\"' ( ESC_SEQ | CHAR )* '\"' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:47:22: '\"' ( ESC_SEQ | CHAR )* '\"'
            {
            match('\"'); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:47:26: ( ESC_SEQ | CHAR )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='\\') ) {
                    alt19=1;
                }
                else if ( ((LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='F')||(LA19_0>='a' && LA19_0<='f')) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:47:28: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:47:38: CHAR
            	    {
            	    mCHAR(); 

            	    }
            	    break;

            	default :
            	    break loop19;
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:48:19: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:48:22: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:49:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:49:22: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "ASSIGNMENT_OPERATOR"
    public final void mASSIGNMENT_OPERATOR() throws RecognitionException {
        try {
            int _type = ASSIGNMENT_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:54:26: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' )
            int alt20=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt20=1;
                }
                break;
            case '*':
                {
                alt20=2;
                }
                break;
            case '/':
                {
                alt20=3;
                }
                break;
            case '%':
                {
                alt20=4;
                }
                break;
            case '+':
                {
                alt20=5;
                }
                break;
            case '-':
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:54:28: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:54:34: '*='
                    {
                    match("*="); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:54:41: '/='
                    {
                    match("/="); 


                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:54:48: '%='
                    {
                    match("%="); 


                    }
                    break;
                case 5 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:54:55: '+='
                    {
                    match("+="); 


                    }
                    break;
                case 6 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:54:62: '-='
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:55:26: ( '==' | '!=' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='=') ) {
                alt21=1;
            }
            else if ( (LA21_0=='!') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:55:28: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:55:35: '!='
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:56:26: ( '>' | '<' | '<=' | '>=' )
            int alt22=4;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='>') ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1=='=') ) {
                    alt22=4;
                }
                else {
                    alt22=1;}
            }
            else if ( (LA22_0=='<') ) {
                int LA22_2 = input.LA(2);

                if ( (LA22_2=='=') ) {
                    alt22=3;
                }
                else {
                    alt22=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:56:28: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:56:34: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:56:40: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:56:47: '>='
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:57:26: ( '+' | '-' )
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:58:26: ( '*' | '/' | '%' )
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:62:21: ( STRING | TIME | NUMBER | BOOL )
            int alt23=4;
            switch ( input.LA(1) ) {
            case '\"':
                {
                alt23=1;
                }
                break;
            case '@':
                {
                alt23=2;
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
                alt23=3;
                }
                break;
            case 'f':
            case 't':
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:62:23: STRING
                    {
                    mSTRING(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:62:32: TIME
                    {
                    mTIME(); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:62:39: NUMBER
                    {
                    mNUMBER(); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:62:48: BOOL
                    {
                    mBOOL(); 

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
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:8: ( T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | TYPE | LANGUAGE | ID | START | END | NEWLINE | WS | COMMENT | ASSIGNMENT_OPERATOR | EQUALITY_OPERATOR | RELATIONAL_OPERATOR | ADDITIVE_OPERATOR | MULTIPLICATIVE_OPERATOR | LITERAL )
        int alt24=35;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:10: T__29
                {
                mT__29(); 

                }
                break;
            case 2 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:16: T__30
                {
                mT__30(); 

                }
                break;
            case 3 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:22: T__31
                {
                mT__31(); 

                }
                break;
            case 4 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:28: T__32
                {
                mT__32(); 

                }
                break;
            case 5 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:34: T__33
                {
                mT__33(); 

                }
                break;
            case 6 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:40: T__34
                {
                mT__34(); 

                }
                break;
            case 7 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:46: T__35
                {
                mT__35(); 

                }
                break;
            case 8 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:52: T__36
                {
                mT__36(); 

                }
                break;
            case 9 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:58: T__37
                {
                mT__37(); 

                }
                break;
            case 10 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:64: T__38
                {
                mT__38(); 

                }
                break;
            case 11 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:70: T__39
                {
                mT__39(); 

                }
                break;
            case 12 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:76: T__40
                {
                mT__40(); 

                }
                break;
            case 13 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:82: T__41
                {
                mT__41(); 

                }
                break;
            case 14 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:88: T__42
                {
                mT__42(); 

                }
                break;
            case 15 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:94: T__43
                {
                mT__43(); 

                }
                break;
            case 16 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:100: T__44
                {
                mT__44(); 

                }
                break;
            case 17 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:106: T__45
                {
                mT__45(); 

                }
                break;
            case 18 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:112: T__46
                {
                mT__46(); 

                }
                break;
            case 19 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:118: T__47
                {
                mT__47(); 

                }
                break;
            case 20 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:124: T__48
                {
                mT__48(); 

                }
                break;
            case 21 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:130: T__49
                {
                mT__49(); 

                }
                break;
            case 22 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:136: TYPE
                {
                mTYPE(); 

                }
                break;
            case 23 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:141: LANGUAGE
                {
                mLANGUAGE(); 

                }
                break;
            case 24 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:150: ID
                {
                mID(); 

                }
                break;
            case 25 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:153: START
                {
                mSTART(); 

                }
                break;
            case 26 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:159: END
                {
                mEND(); 

                }
                break;
            case 27 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:163: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 28 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:171: WS
                {
                mWS(); 

                }
                break;
            case 29 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:174: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 30 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:182: ASSIGNMENT_OPERATOR
                {
                mASSIGNMENT_OPERATOR(); 

                }
                break;
            case 31 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:202: EQUALITY_OPERATOR
                {
                mEQUALITY_OPERATOR(); 

                }
                break;
            case 32 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:220: RELATIONAL_OPERATOR
                {
                mRELATIONAL_OPERATOR(); 

                }
                break;
            case 33 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:240: ADDITIVE_OPERATOR
                {
                mADDITIVE_OPERATOR(); 

                }
                break;
            case 34 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:258: MULTIPLICATIVE_OPERATOR
                {
                mMULTIPLICATIVE_OPERATOR(); 

                }
                break;
            case 35 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:282: LITERAL
                {
                mLITERAL(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA13_eotS =
        "\5\uffff";
    static final String DFA13_eofS =
        "\5\uffff";
    static final String DFA13_minS =
        "\2\56\3\uffff";
    static final String DFA13_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA13_specialS =
        "\5\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "31:10: fragment NUMBER : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA16_eotS =
        "\21\uffff";
    static final String DFA16_eofS =
        "\21\uffff";
    static final String DFA16_minS =
        "\2\56\2\60\1\53\2\60\1\53\2\uffff\2\60\1\53\4\60";
    static final String DFA16_maxS =
        "\1\71\1\145\1\71\1\163\1\71\2\163\1\71\2\uffff\1\71\1\163\2\71"+
        "\1\163\1\71\1\163";
    static final String DFA16_acceptS =
        "\10\uffff\1\1\1\2\7\uffff";
    static final String DFA16_specialS =
        "\21\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "\12\5",
            "\12\6\13\uffff\1\7\37\uffff\1\7\7\uffff\1\10\5\uffff\1\11",
            "\1\12\1\uffff\1\12\2\uffff\12\13",
            "\12\5\13\uffff\1\14\37\uffff\1\14\7\uffff\1\10\5\uffff\1\11",
            "\12\6\13\uffff\1\7\37\uffff\1\7\7\uffff\1\10\5\uffff\1\11",
            "\1\15\1\uffff\1\15\2\uffff\12\16",
            "",
            "",
            "\12\13",
            "\12\13\63\uffff\1\10\5\uffff\1\11",
            "\1\17\1\uffff\1\17\2\uffff\12\20",
            "\12\16",
            "\12\16\63\uffff\1\10\5\uffff\1\11",
            "\12\20",
            "\12\20\63\uffff\1\10\5\uffff\1\11"
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
            return "40:10: fragment MINUTE : ( NUMBER 'm' SECOND | SECOND );";
        }
    }
    static final String DFA17_eotS =
        "\21\uffff";
    static final String DFA17_eofS =
        "\21\uffff";
    static final String DFA17_minS =
        "\2\56\1\60\1\53\5\60\1\53\2\uffff\1\53\4\60";
    static final String DFA17_maxS =
        "\1\71\1\145\2\71\2\163\1\71\2\163\1\71\2\uffff\2\71\1\163\1\71"+
        "\1\163";
    static final String DFA17_acceptS =
        "\12\uffff\1\2\1\1\5\uffff";
    static final String DFA17_specialS =
        "\21\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "\12\5",
            "\1\6\1\uffff\1\6\2\uffff\12\7",
            "\12\10\13\uffff\1\11\37\uffff\1\11\2\uffff\1\13\4\uffff\1"+
            "\12\5\uffff\1\12",
            "\12\5\13\uffff\1\14\37\uffff\1\14\2\uffff\1\13\4\uffff\1\12"+
            "\5\uffff\1\12",
            "\12\7",
            "\12\7\56\uffff\1\13\4\uffff\1\12\5\uffff\1\12",
            "\12\10\13\uffff\1\11\37\uffff\1\11\2\uffff\1\13\4\uffff\1"+
            "\12\5\uffff\1\12",
            "\1\15\1\uffff\1\15\2\uffff\12\16",
            "",
            "",
            "\1\17\1\uffff\1\17\2\uffff\12\20",
            "\12\16",
            "\12\16\56\uffff\1\13\4\uffff\1\12\5\uffff\1\12",
            "\12\20",
            "\12\20\56\uffff\1\13\4\uffff\1\12\5\uffff\1\12"
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
            return "41:10: fragment HOUR : ( NUMBER 'h' MINUTE | MINUTE );";
        }
    }
    static final String DFA18_eotS =
        "\21\uffff";
    static final String DFA18_eofS =
        "\21\uffff";
    static final String DFA18_minS =
        "\2\56\1\60\1\53\5\60\1\53\2\uffff\1\53\4\60";
    static final String DFA18_maxS =
        "\1\71\1\145\2\71\2\163\1\71\2\163\1\71\2\uffff\2\71\1\163\1\71"+
        "\1\163";
    static final String DFA18_acceptS =
        "\12\uffff\1\2\1\1\5\uffff";
    static final String DFA18_specialS =
        "\21\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "\12\5",
            "\1\6\1\uffff\1\6\2\uffff\12\7",
            "\12\10\13\uffff\1\11\36\uffff\1\13\1\11\2\uffff\1\12\4\uffff"+
            "\1\12\5\uffff\1\12",
            "\12\5\13\uffff\1\14\36\uffff\1\13\1\14\2\uffff\1\12\4\uffff"+
            "\1\12\5\uffff\1\12",
            "\12\7",
            "\12\7\52\uffff\1\13\3\uffff\1\12\4\uffff\1\12\5\uffff\1\12",
            "\12\10\13\uffff\1\11\36\uffff\1\13\1\11\2\uffff\1\12\4\uffff"+
            "\1\12\5\uffff\1\12",
            "\1\15\1\uffff\1\15\2\uffff\12\16",
            "",
            "",
            "\1\17\1\uffff\1\17\2\uffff\12\20",
            "\12\16",
            "\12\16\52\uffff\1\13\3\uffff\1\12\4\uffff\1\12\5\uffff\1\12",
            "\12\20",
            "\12\20\52\uffff\1\13\3\uffff\1\12\4\uffff\1\12\5\uffff\1\12"
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "42:10: fragment DAY : ( NUMBER 'd' HOUR | HOUR );";
        }
    }
    static final String DFA24_eotS =
        "\1\uffff\1\25\1\44\1\25\1\47\3\25\3\uffff\12\25\6\uffff\2\74\2"+
        "\75\3\uffff\1\77\2\uffff\2\25\1\uffff\1\102\22\25\3\uffff\1\25\1"+
        "\uffff\2\25\1\uffff\1\25\1\132\2\25\1\135\17\25\1\155\1\uffff\1"+
        "\25\1\uffff\2\25\1\uffff\7\25\1\170\4\25\1\175\1\155\1\25\1\uffff"+
        "\5\25\1\uffff\3\25\1\u0087\1\uffff\4\25\1\uffff\1\25\1\155\2\25"+
        "\1\155\4\25\1\uffff\1\25\1\u0094\1\155\3\25\1\u0098\2\25\1\u009b"+
        "\2\25\1\uffff\1\155\1\u009e\1\u00a0\1\uffff\1\u00a1\1\25\1\uffff"+
        "\1\u00a3\1\25\1\uffff\1\u00a5\2\uffff\1\u00a6\1\uffff\1\25\2\uffff"+
        "\1\u00a8\1\uffff";
    static final String DFA24_eofS =
        "\u00a9\uffff";
    static final String DFA24_minS =
        "\1\11\1\156\1\75\1\151\1\75\1\162\1\143\1\145\3\uffff\1\141\1\162"+
        "\1\145\1\156\1\150\1\157\1\145\1\164\1\157\1\101\6\uffff\4\75\3"+
        "\uffff\1\60\2\uffff\1\155\1\165\1\uffff\1\60\1\164\1\144\1\143\1"+
        "\167\1\155\1\156\1\154\1\145\1\161\1\145\1\144\1\145\1\156\1\166"+
        "\1\12\1\162\1\157\1\126\3\uffff\1\165\1\uffff\2\145\1\uffff\1\160"+
        "\1\60\1\157\1\145\1\60\1\142\1\143\1\163\1\144\2\165\1\156\1\12"+
        "\1\156\1\163\2\151\1\154\1\101\1\164\1\60\1\uffff\1\165\1\uffff"+
        "\1\165\1\160\1\uffff\1\145\1\164\1\145\1\151\1\162\1\151\1\164\1"+
        "\60\1\164\1\143\1\156\1\145\2\60\1\151\1\uffff\1\164\1\156\1\164"+
        "\1\162\1\151\1\uffff\1\143\1\156\1\162\1\60\1\uffff\1\162\1\145"+
        "\1\147\1\141\1\uffff\1\156\1\60\1\143\1\163\1\60\1\157\1\141\1\163"+
        "\1\145\1\uffff\1\141\2\60\1\156\2\145\1\60\1\156\1\164\1\60\1\163"+
        "\1\151\1\uffff\3\60\1\uffff\1\60\1\145\1\uffff\1\60\1\156\1\uffff"+
        "\1\60\2\uffff\1\60\1\uffff\1\164\2\uffff\1\60\1\uffff";
    static final String DFA24_maxS =
        "\1\175\1\156\1\75\1\162\1\75\1\165\1\156\1\165\3\uffff\1\165\1"+
        "\162\1\145\1\166\1\150\2\157\1\164\1\157\1\101\6\uffff\4\75\3\uffff"+
        "\1\172\2\uffff\1\155\1\165\1\uffff\1\172\1\164\1\156\1\143\1\167"+
        "\1\155\1\156\1\154\1\145\1\164\1\145\1\144\1\145\1\156\1\166\1\15"+
        "\1\162\1\157\1\126\3\uffff\1\165\1\uffff\2\145\1\uffff\1\160\1\172"+
        "\1\157\1\145\1\172\1\142\1\143\1\163\1\144\2\165\1\156\1\15\1\156"+
        "\1\163\2\151\1\154\1\101\1\164\1\172\1\uffff\1\165\1\uffff\1\165"+
        "\1\160\1\uffff\1\145\1\164\1\145\1\151\1\162\1\151\1\164\1\172\1"+
        "\164\1\143\1\156\1\145\2\172\1\151\1\uffff\1\164\1\156\1\164\1\162"+
        "\1\151\1\uffff\1\143\1\156\1\162\1\172\1\uffff\1\162\1\145\1\147"+
        "\1\141\1\uffff\1\156\1\172\1\143\1\163\1\172\1\157\1\141\1\163\1"+
        "\145\1\uffff\1\141\2\172\1\156\2\145\1\172\1\156\1\164\1\172\1\163"+
        "\1\151\1\uffff\3\172\1\uffff\1\172\1\145\1\uffff\1\172\1\156\1\uffff"+
        "\1\172\2\uffff\1\172\1\uffff\1\164\2\uffff\1\172\1\uffff";
    static final String DFA24_acceptS =
        "\10\uffff\1\10\1\11\1\12\12\uffff\1\30\1\31\1\32\1\33\1\34\1\35"+
        "\4\uffff\1\37\1\40\1\43\1\uffff\1\36\1\2\2\uffff\1\4\23\uffff\1"+
        "\33\1\42\1\41\1\uffff\1\1\2\uffff\1\5\25\uffff\1\30\1\uffff\1\6"+
        "\2\uffff\1\7\17\uffff\1\26\5\uffff\1\30\4\uffff\1\20\4\uffff\1\27"+
        "\11\uffff\1\16\14\uffff\1\25\3\uffff\1\24\2\uffff\1\15\2\uffff\1"+
        "\3\1\uffff\1\17\1\13\1\uffff\1\23\1\uffff\1\22\1\14\1\uffff\1\21";
    static final String DFA24_specialS =
        "\u00a9\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\31\1\30\2\uffff\1\30\22\uffff\1\31\1\37\1\41\1\32\1\uffff"+
            "\1\34\2\uffff\1\10\1\11\1\2\1\35\1\12\1\36\1\41\1\33\12\41\2"+
            "\uffff\1\40\1\4\1\40\1\uffff\1\41\11\25\1\24\20\25\4\uffff\1"+
            "\25\1\uffff\1\6\1\23\1\20\1\21\1\16\1\13\2\25\1\1\4\25\1\7\1"+
            "\5\1\14\1\25\1\15\1\22\1\3\2\25\1\17\3\25\1\26\1\uffff\1\27",
            "\1\42",
            "\1\43",
            "\1\45\10\uffff\1\46",
            "\1\37",
            "\1\50\2\uffff\1\51",
            "\1\53\12\uffff\1\52",
            "\1\54\17\uffff\1\55",
            "",
            "",
            "",
            "\1\57\23\uffff\1\56",
            "\1\60",
            "\1\61",
            "\1\63\7\uffff\1\62",
            "\1\64",
            "\1\65",
            "\1\66\11\uffff\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43",
            "\1\43",
            "\1\43",
            "\1\43",
            "",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\17\25\1\76\12\25",
            "",
            "",
            "\1\100",
            "\1\101",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\103",
            "\1\104\11\uffff\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\115\2\uffff\1\114",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\26\2\uffff\1\26",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "",
            "",
            "\1\126",
            "",
            "\1\127",
            "\1\130",
            "",
            "\1\131",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\133",
            "\1\134",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\27\2\uffff\1\27",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\13\25\1\154\16\25",
            "",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\176",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "",
            "\1\u008c",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u008d",
            "\1\u008e",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "\1\u0093",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0099",
            "\1\u009a",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u009c",
            "\1\u009d",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\22\25\1\u009f\7"+
            "\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00a2",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00a4",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\u00a7",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | TYPE | LANGUAGE | ID | START | END | NEWLINE | WS | COMMENT | ASSIGNMENT_OPERATOR | EQUALITY_OPERATOR | RELATIONAL_OPERATOR | ADDITIVE_OPERATOR | MULTIPLICATIVE_OPERATOR | LITERAL );";
        }
    }
 

}