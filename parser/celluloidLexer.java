// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g 2009-12-19 01:19:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class celluloidLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int CONSTRAINTS=13;
    public static final int T__67=67;
    public static final int LISTENBLOCK=27;
    public static final int EXPONENT=62;
    public static final int T__65=65;
    public static final int FUNCTIONS=15;
    public static final int OBJCALL=9;
    public static final int DAY=58;
    public static final int ID=43;
    public static final int EOF=-1;
    public static final int EQUALITY_OPERATOR=49;
    public static final int LISTENER=19;
    public static final int CONBLOCK=30;
    public static final int TYPE=47;
    public static final int IF=16;
    public static final int ACCEPTS=41;
    public static final int FUNHEAD=32;
    public static final int TIME=46;
    public static final int PROGBLOCK=25;
    public static final int ANNOUNCEMENT=38;
    public static final int IN=23;
    public static final int T__90=90;
    public static final int ESCAPE=57;
    public static final int ARG=7;
    public static final int FUNBLOCK=29;
    public static final int RETURN=22;
    public static final int DEVICE=40;
    public static final int ARGS=8;
    public static final int ANNOUNCEMENTS=39;
    public static final int MULTIPLICATIVE_OPERATOR=52;
    public static final int COMMENT=64;
    public static final int VARDEF=4;
    public static final int SECOND=61;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int IFBLOCK=28;
    public static final int PRED=6;
    public static final int ELSE=18;
    public static final int BOOL=53;
    public static final int NUMBER=54;
    public static final int EVERY=20;
    public static final int DEVICES=14;
    public static final int T__85=85;
    public static final int EVENT=34;
    public static final int ADDITIVE_OPERATOR=51;
    public static final int HOUR=59;
    public static final int T__84=84;
    public static final int EVENTS=12;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int RELATIONAL_OPERATOR=50;
    public static final int T__88=88;
    public static final int ELSEIF=17;
    public static final int T__71=71;
    public static final int LANGUAGE=56;
    public static final int WS=63;
    public static final int T__72=72;
    public static final int REQUIRES=36;
    public static final int NEWLINE=42;
    public static final int T__70=70;
    public static final int WHEN=24;
    public static final int PREDHEAD=33;
    public static final int FUNC=5;
    public static final int INBLOCK=26;
    public static final int START=44;
    public static final int ASSIGNMENT_OPERATOR=48;
    public static final int PROGRAM=11;
    public static final int ANNOUNCES=37;
    public static final int CALL=10;
    public static final int T__76=76;
    public static final int END=45;
    public static final int MINUTE=60;
    public static final int T__75=75;
    public static final int COND=21;
    public static final int T__74=74;
    public static final int CONSTRAINT=35;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int DEVBLOCK=31;
    public static final int T__78=78;
    public static final int STRING=55;
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

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:3:7: ( 'event' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:3:9: 'event'
            {
            match("event"); 


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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:4:7: ( 'announce' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:4:9: 'announce'
            {
            match("announce"); 


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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:5:7: ( 'when' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:5:9: 'when'
            {
            match("when"); 


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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:6:7: ( 'constraint' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:6:9: 'constraint'
            {
            match("constraint"); 


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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:7:7: ( 'requires' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:7:9: 'requires'
            {
            match("requires"); 


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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:8:7: ( 'announces' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:8:9: 'announces'
            {
            match("announces"); 


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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:9:7: ( 'device' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:9:9: 'device'
            {
            match("device"); 


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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:10:7: ( 'accepts' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:10:9: 'accepts'
            {
            match("accepts"); 


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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:11:7: ( 'function' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:11:9: 'function'
            {
            match("function"); 


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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:12:7: ( '(' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:12:9: '('
            {
            match('('); 

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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:13:7: ( ')' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:13:9: ')'
            {
            match(')'); 

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
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:15:7: ( 'return' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:15:9: 'return'
            {
            match("return"); 


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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:16:7: ( 'in' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:16:9: 'in'
            {
            match("in"); 


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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:17:7: ( 'if' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:17:9: 'if'
            {
            match("if"); 


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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:18:7: ( 'else if' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:18:9: 'else if'
            {
            match("else if"); 


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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:19:7: ( 'else' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:19:9: 'else'
            {
            match("else"); 


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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:20:7: ( 'unless' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:20:9: 'unless'
            {
            match("unless"); 


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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:21:7: ( 'every' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:21:9: 'every'
            {
            match("every"); 


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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:22:7: ( ',' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:22:9: ','
            {
            match(','); 

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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:23:7: ( 'timeline' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:23:9: 'timeline'
            {
            match("timeline"); 


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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:24:7: ( '=' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:24:9: '='
            {
            match('='); 

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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:25:7: ( 'not' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:25:9: 'not'
            {
            match("not"); 


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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:26:7: ( 'or' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:26:9: 'or'
            {
            match("or"); 


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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:27:7: ( 'and' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:27:9: 'and'
            {
            match("and"); 


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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:28:7: ( 'new' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:28:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "ASSIGNMENT_OPERATOR"
    public final void mASSIGNMENT_OPERATOR() throws RecognitionException {
        try {
            int _type = ASSIGNMENT_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:362:26: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt1=1;
                }
                break;
            case '*':
                {
                alt1=2;
                }
                break;
            case '/':
                {
                alt1=3;
                }
                break;
            case '%':
                {
                alt1=4;
                }
                break;
            case '+':
                {
                alt1=5;
                }
                break;
            case '-':
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:362:28: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:362:34: '*='
                    {
                    match("*="); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:362:41: '/='
                    {
                    match("/="); 


                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:362:48: '%='
                    {
                    match("%="); 


                    }
                    break;
                case 5 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:362:55: '+='
                    {
                    match("+="); 


                    }
                    break;
                case 6 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:362:62: '-='
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:363:26: ( '==' | '!=' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='=') ) {
                alt2=1;
            }
            else if ( (LA2_0=='!') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:363:28: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:363:35: '!='
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:364:26: ( '>' | '<' | '<=' | '>=' )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='>') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='=') ) {
                    alt3=4;
                }
                else {
                    alt3=1;}
            }
            else if ( (LA3_0=='<') ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2=='=') ) {
                    alt3=3;
                }
                else {
                    alt3=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:364:28: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:364:34: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:364:40: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:364:47: '>='
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:365:26: ( '+' | '-' )
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:366:26: ( '*' | '/' | '%' )
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

    // $ANTLR start "LANGUAGE"
    public final void mLANGUAGE() throws RecognitionException {
        try {
            int _type = LANGUAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:375:25: ( 'JAVA' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:375:27: 'JAVA'
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

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:380:9: ( '\"' ( ESCAPE | ~ ( '\"' | '\\\\' ) )* '\"' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:380:11: '\"' ( ESCAPE | ~ ( '\"' | '\\\\' ) )* '\"'
            {
            match('\"'); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:380:15: ( ESCAPE | ~ ( '\"' | '\\\\' ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\\') ) {
                    alt4=1;
                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:380:17: ESCAPE
            	    {
            	    mESCAPE(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:380:26: ~ ( '\"' | '\\\\' )
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
            	    break loop4;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESCAPE"
    public final void mESCAPE() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:381:18: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:381:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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

    // $ANTLR start "TIME"
    public final void mTIME() throws RecognitionException {
        try {
            int _type = TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:385:14: ( '@' ( DAY | 'start' | 'now' ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:385:16: '@' ( DAY | 'start' | 'now' )
            {
            match('@'); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:385:19: ( DAY | 'start' | 'now' )
            int alt5=3;
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
                alt5=1;
                }
                break;
            case 's':
                {
                alt5=2;
                }
                break;
            case 'n':
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:385:20: DAY
                    {
                    mDAY(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:385:26: 'start'
                    {
                    match("start"); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:385:36: 'now'
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

    // $ANTLR start "DAY"
    public final void mDAY() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:386:15: ( NUMBER 'd' HOUR | HOUR )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:386:17: NUMBER 'd' HOUR
                    {
                    mNUMBER(); 
                    match('d'); 
                    mHOUR(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:386:35: HOUR
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

    // $ANTLR start "HOUR"
    public final void mHOUR() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:387:16: ( NUMBER 'h' MINUTE | MINUTE )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:387:18: NUMBER 'h' MINUTE
                    {
                    mNUMBER(); 
                    match('h'); 
                    mMINUTE(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:387:38: MINUTE
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

    // $ANTLR start "MINUTE"
    public final void mMINUTE() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:388:17: ( NUMBER 'm' SECOND | SECOND )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:388:19: NUMBER 'm' SECOND
                    {
                    mNUMBER(); 
                    match('m'); 
                    mSECOND(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:388:39: SECOND
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

    // $ANTLR start "SECOND"
    public final void mSECOND() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:389:17: ( NUMBER 's' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:389:19: NUMBER 's'
            {
            mNUMBER(); 
            match('s'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "SECOND"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:393:8: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ ( EXPONENT )? )
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:393:12: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:393:12: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:393:13: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    match('.'); 
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:393:28: ( '0' .. '9' )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:393:29: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:393:40: ( EXPONENT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:393:40: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:394:12: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:394:16: ( '0' .. '9' )+
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
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:394:17: '0' .. '9'
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

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:394:28: ( EXPONENT )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='E'||LA13_0=='e') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:394:28: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:395:12: ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:395:12: ( '0' .. '9' )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:395:13: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:395:24: ( EXPONENT )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='E'||LA15_0=='e') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:395:24: EXPONENT
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:396:19: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:396:21: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:396:31: ( '+' | '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='+'||LA17_0=='-') ) {
                alt17=1;
            }
            switch (alt17) {
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

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:396:42: ( '0' .. '9' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:396:43: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "BOOL"
    public final void mBOOL() throws RecognitionException {
        try {
            int _type = BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:400:9: ( 'true' | 'false' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='t') ) {
                alt19=1;
            }
            else if ( (LA19_0=='f') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:400:11: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:400:20: 'false'
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:401:9: ( 'time' | 'number' | 'string' | 'boolean' | 'input' | 'output' )
            int alt20=6;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt20=1;
                }
                break;
            case 'n':
                {
                alt20=2;
                }
                break;
            case 's':
                {
                alt20=3;
                }
                break;
            case 'b':
                {
                alt20=4;
                }
                break;
            case 'i':
                {
                alt20=5;
                }
                break;
            case 'o':
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:401:11: 'time'
                    {
                    match("time"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:401:20: 'number'
                    {
                    match("number"); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:401:31: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:401:42: 'boolean'
                    {
                    match("boolean"); 


                    }
                    break;
                case 5 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:401:54: 'input'
                    {
                    match("input"); 


                    }
                    break;
                case 6 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:401:64: 'output'
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:405:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:405:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:405:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='0' && LA21_0<='9')||(LA21_0>='A' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='a' && LA21_0<='z')) ) {
                    alt21=1;
                }


                switch (alt21) {
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
            	    break loop21;
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:406:7: ( ( 'do' | '{' ) ( NEWLINE )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:406:9: ( 'do' | '{' ) ( NEWLINE )?
            {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:406:9: ( 'do' | '{' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='d') ) {
                alt22=1;
            }
            else if ( (LA22_0=='{') ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:406:10: 'do'
                    {
                    match("do"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:406:17: '{'
                    {
                    match('{'); 

                    }
                    break;

            }

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:406:22: ( NEWLINE )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\n'||LA23_0=='\r') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:406:22: NEWLINE
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:407:7: ( ( 'end' | '}' ) ( NEWLINE )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:407:9: ( 'end' | '}' ) ( NEWLINE )?
            {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:407:9: ( 'end' | '}' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='e') ) {
                alt24=1;
            }
            else if ( (LA24_0=='}') ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:407:10: 'end'
                    {
                    match("end"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:407:18: '}'
                    {
                    match('}'); 

                    }
                    break;

            }

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:407:23: ( NEWLINE )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\n'||LA25_0=='\r') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:407:23: NEWLINE
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:411:9: ( '\\n' | '\\r\\n' | '\\r' )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\n') ) {
                alt26=1;
            }
            else if ( (LA26_0=='\r') ) {
                int LA26_2 = input.LA(2);

                if ( (LA26_2=='\n') ) {
                    alt26=2;
                }
                else {
                    alt26=3;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:411:11: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:411:18: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:411:27: '\\r'
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:412:9: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\r\\n' ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:412:11: ( ' ' | '\\t' | '\\r' | '\\n' | '\\r\\n' )
            {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:412:11: ( ' ' | '\\t' | '\\r' | '\\n' | '\\r\\n' )
            int alt27=5;
            switch ( input.LA(1) ) {
            case ' ':
                {
                alt27=1;
                }
                break;
            case '\t':
                {
                alt27=2;
                }
                break;
            case '\r':
                {
                int LA27_3 = input.LA(2);

                if ( (LA27_3=='\n') ) {
                    alt27=5;
                }
                else {
                    alt27=3;}
                }
                break;
            case '\n':
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:412:13: ' '
                    {
                    match(' '); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:412:19: '\\t'
                    {
                    match('\t'); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:412:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:412:33: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:412:40: '\\r\\n'
                    {
                    match("\r\n"); 


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

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:413:9: ( '#' (~ ( NEWLINE ) )* NEWLINE )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:413:11: '#' (~ ( NEWLINE ) )* NEWLINE
            {
            match('#'); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:413:15: (~ ( NEWLINE ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='\u0000' && LA28_0<='\t')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\uFFFF')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:413:15: ~ ( NEWLINE )
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
            	    break loop28;
                }
            } while (true);

            mNEWLINE(); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:8: ( T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | ASSIGNMENT_OPERATOR | EQUALITY_OPERATOR | RELATIONAL_OPERATOR | ADDITIVE_OPERATOR | MULTIPLICATIVE_OPERATOR | LANGUAGE | STRING | TIME | NUMBER | BOOL | TYPE | ID | START | END | NEWLINE | WS | COMMENT )
        int alt29=43;
        alt29 = dfa29.predict(input);
        switch (alt29) {
            case 1 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:10: T__65
                {
                mT__65(); 

                }
                break;
            case 2 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:16: T__66
                {
                mT__66(); 

                }
                break;
            case 3 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:22: T__67
                {
                mT__67(); 

                }
                break;
            case 4 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:28: T__68
                {
                mT__68(); 

                }
                break;
            case 5 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:34: T__69
                {
                mT__69(); 

                }
                break;
            case 6 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:40: T__70
                {
                mT__70(); 

                }
                break;
            case 7 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:46: T__71
                {
                mT__71(); 

                }
                break;
            case 8 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:52: T__72
                {
                mT__72(); 

                }
                break;
            case 9 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:58: T__73
                {
                mT__73(); 

                }
                break;
            case 10 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:64: T__74
                {
                mT__74(); 

                }
                break;
            case 11 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:70: T__75
                {
                mT__75(); 

                }
                break;
            case 12 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:76: T__76
                {
                mT__76(); 

                }
                break;
            case 13 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:82: T__77
                {
                mT__77(); 

                }
                break;
            case 14 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:88: T__78
                {
                mT__78(); 

                }
                break;
            case 15 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:94: T__79
                {
                mT__79(); 

                }
                break;
            case 16 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:100: T__80
                {
                mT__80(); 

                }
                break;
            case 17 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:106: T__81
                {
                mT__81(); 

                }
                break;
            case 18 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:112: T__82
                {
                mT__82(); 

                }
                break;
            case 19 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:118: T__83
                {
                mT__83(); 

                }
                break;
            case 20 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:124: T__84
                {
                mT__84(); 

                }
                break;
            case 21 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:130: T__85
                {
                mT__85(); 

                }
                break;
            case 22 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:136: T__86
                {
                mT__86(); 

                }
                break;
            case 23 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:142: T__87
                {
                mT__87(); 

                }
                break;
            case 24 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:148: T__88
                {
                mT__88(); 

                }
                break;
            case 25 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:154: T__89
                {
                mT__89(); 

                }
                break;
            case 26 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:160: T__90
                {
                mT__90(); 

                }
                break;
            case 27 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:166: ASSIGNMENT_OPERATOR
                {
                mASSIGNMENT_OPERATOR(); 

                }
                break;
            case 28 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:186: EQUALITY_OPERATOR
                {
                mEQUALITY_OPERATOR(); 

                }
                break;
            case 29 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:204: RELATIONAL_OPERATOR
                {
                mRELATIONAL_OPERATOR(); 

                }
                break;
            case 30 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:224: ADDITIVE_OPERATOR
                {
                mADDITIVE_OPERATOR(); 

                }
                break;
            case 31 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:242: MULTIPLICATIVE_OPERATOR
                {
                mMULTIPLICATIVE_OPERATOR(); 

                }
                break;
            case 32 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:266: LANGUAGE
                {
                mLANGUAGE(); 

                }
                break;
            case 33 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:275: STRING
                {
                mSTRING(); 

                }
                break;
            case 34 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:282: TIME
                {
                mTIME(); 

                }
                break;
            case 35 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:287: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 36 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:294: BOOL
                {
                mBOOL(); 

                }
                break;
            case 37 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:299: TYPE
                {
                mTYPE(); 

                }
                break;
            case 38 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:304: ID
                {
                mID(); 

                }
                break;
            case 39 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:307: START
                {
                mSTART(); 

                }
                break;
            case 40 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:313: END
                {
                mEND(); 

                }
                break;
            case 41 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:317: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 42 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:325: WS
                {
                mWS(); 

                }
                break;
            case 43 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:1:328: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA6_eotS =
        "\21\uffff";
    static final String DFA6_eofS =
        "\21\uffff";
    static final String DFA6_minS =
        "\2\56\1\60\1\53\2\uffff\5\60\2\53\4\60";
    static final String DFA6_maxS =
        "\1\71\1\163\2\71\2\uffff\2\163\1\71\2\163\3\71\1\163\1\71\1\163";
    static final String DFA6_acceptS =
        "\4\uffff\1\2\1\1\13\uffff";
    static final String DFA6_specialS =
        "\21\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\6\1\uffff\12\1\13\uffff\1\3\36\uffff\1\5\1\3\2\uffff\1"+
            "\4\4\uffff\1\4\5\uffff\1\4",
            "\12\7",
            "\1\10\1\uffff\1\10\2\uffff\12\11",
            "",
            "",
            "\12\12\13\uffff\1\13\36\uffff\1\5\1\13\2\uffff\1\4\4\uffff"+
            "\1\4\5\uffff\1\4",
            "\12\7\13\uffff\1\14\36\uffff\1\5\1\14\2\uffff\1\4\4\uffff"+
            "\1\4\5\uffff\1\4",
            "\12\11",
            "\12\11\52\uffff\1\5\3\uffff\1\4\4\uffff\1\4\5\uffff\1\4",
            "\12\12\13\uffff\1\13\36\uffff\1\5\1\13\2\uffff\1\4\4\uffff"+
            "\1\4\5\uffff\1\4",
            "\1\15\1\uffff\1\15\2\uffff\12\16",
            "\1\17\1\uffff\1\17\2\uffff\12\20",
            "\12\16",
            "\12\16\52\uffff\1\5\3\uffff\1\4\4\uffff\1\4\5\uffff\1\4",
            "\12\20",
            "\12\20\52\uffff\1\5\3\uffff\1\4\4\uffff\1\4\5\uffff\1\4"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "386:10: fragment DAY : ( NUMBER 'd' HOUR | HOUR );";
        }
    }
    static final String DFA7_eotS =
        "\21\uffff";
    static final String DFA7_eofS =
        "\21\uffff";
    static final String DFA7_minS =
        "\2\56\2\60\1\53\2\uffff\2\60\1\53\2\60\1\53\4\60";
    static final String DFA7_maxS =
        "\1\71\1\163\1\71\1\163\1\71\2\uffff\2\163\2\71\1\163\2\71\1\163"+
        "\1\71\1\163";
    static final String DFA7_acceptS =
        "\5\uffff\1\2\1\1\12\uffff";
    static final String DFA7_specialS =
        "\21\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4\2\uffff\1\6\4"+
            "\uffff\1\5\5\uffff\1\5",
            "\12\7",
            "\12\10\13\uffff\1\11\37\uffff\1\11\2\uffff\1\6\4\uffff\1\5"+
            "\5\uffff\1\5",
            "\1\12\1\uffff\1\12\2\uffff\12\13",
            "",
            "",
            "\12\7\13\uffff\1\14\37\uffff\1\14\2\uffff\1\6\4\uffff\1\5"+
            "\5\uffff\1\5",
            "\12\10\13\uffff\1\11\37\uffff\1\11\2\uffff\1\6\4\uffff\1\5"+
            "\5\uffff\1\5",
            "\1\15\1\uffff\1\15\2\uffff\12\16",
            "\12\13",
            "\12\13\56\uffff\1\6\4\uffff\1\5\5\uffff\1\5",
            "\1\17\1\uffff\1\17\2\uffff\12\20",
            "\12\16",
            "\12\16\56\uffff\1\6\4\uffff\1\5\5\uffff\1\5",
            "\12\20",
            "\12\20\56\uffff\1\6\4\uffff\1\5\5\uffff\1\5"
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
            return "387:10: fragment HOUR : ( NUMBER 'h' MINUTE | MINUTE );";
        }
    }
    static final String DFA8_eotS =
        "\21\uffff";
    static final String DFA8_eofS =
        "\21\uffff";
    static final String DFA8_minS =
        "\2\56\2\60\1\53\2\uffff\2\60\1\53\2\60\1\53\4\60";
    static final String DFA8_maxS =
        "\1\71\1\163\1\71\1\163\1\71\2\uffff\2\163\2\71\1\163\2\71\1\163"+
        "\1\71\1\163";
    static final String DFA8_acceptS =
        "\5\uffff\1\2\1\1\12\uffff";
    static final String DFA8_specialS =
        "\21\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4\7\uffff\1\6\5"+
            "\uffff\1\5",
            "\12\7",
            "\12\10\13\uffff\1\11\37\uffff\1\11\7\uffff\1\6\5\uffff\1\5",
            "\1\12\1\uffff\1\12\2\uffff\12\13",
            "",
            "",
            "\12\7\13\uffff\1\14\37\uffff\1\14\7\uffff\1\6\5\uffff\1\5",
            "\12\10\13\uffff\1\11\37\uffff\1\11\7\uffff\1\6\5\uffff\1\5",
            "\1\15\1\uffff\1\15\2\uffff\12\16",
            "\12\13",
            "\12\13\63\uffff\1\6\5\uffff\1\5",
            "\1\17\1\uffff\1\17\2\uffff\12\20",
            "\12\16",
            "\12\16\63\uffff\1\6\5\uffff\1\5",
            "\12\20",
            "\12\20\63\uffff\1\6\5\uffff\1\5"
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
            return "388:10: fragment MINUTE : ( NUMBER 'm' SECOND | SECOND );";
        }
    }
    static final String DFA16_eotS =
        "\1\uffff\1\3\3\uffff";
    static final String DFA16_eofS =
        "\5\uffff";
    static final String DFA16_minS =
        "\2\56\3\uffff";
    static final String DFA16_maxS =
        "\2\71\3\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA16_specialS =
        "\5\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1",
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
            return "393:1: NUMBER : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ ( EXPONENT )? );";
        }
    }
    static final String DFA29_eotS =
        "\1\uffff\7\37\2\uffff\3\37\1\uffff\1\37\1\70\2\37\3\77\2\100\2"+
        "\uffff\1\37\3\uffff\2\37\4\uffff\1\104\2\uffff\15\37\1\125\1\126"+
        "\3\37\1\uffff\3\37\1\135\1\37\3\uffff\3\37\2\uffff\4\37\1\146\12"+
        "\37\2\uffff\3\37\1\164\1\165\1\37\1\uffff\6\37\1\176\1\37\1\uffff"+
        "\1\37\1\u0081\11\37\1\u008c\1\u008d\2\uffff\2\37\1\u0090\2\37\1"+
        "\u0093\1\u0094\2\uffff\2\37\1\uffff\5\37\1\u008d\1\37\1\u008c\2"+
        "\37\2\uffff\2\37\1\uffff\2\37\2\uffff\4\37\1\u00a7\1\u00a8\2\37"+
        "\1\u00ab\1\37\3\u008c\2\37\1\u00af\2\37\2\uffff\2\37\1\uffff\1\37"+
        "\1\u008c\1\u00b6\1\uffff\1\37\1\u00b8\1\u00b9\1\37\1\u00bb\1\u00bc"+
        "\1\uffff\1\37\2\uffff\1\u00be\2\uffff\1\u00bf\2\uffff";
    static final String DFA29_eofS =
        "\u00c0\uffff";
    static final String DFA29_minS =
        "\1\11\1\154\1\143\1\150\1\157\2\145\1\141\2\uffff\1\162\1\146\1"+
        "\156\1\uffff\1\151\1\75\1\145\1\162\5\75\2\uffff\1\101\3\uffff\1"+
        "\164\1\157\4\uffff\1\12\2\uffff\1\145\1\163\2\144\1\143\1\145\1"+
        "\156\1\161\1\166\1\12\1\156\1\154\1\145\2\60\1\154\1\155\1\165\1"+
        "\uffff\1\164\1\167\1\155\1\60\1\164\3\uffff\1\126\1\162\1\157\2"+
        "\uffff\1\156\1\145\1\12\1\157\1\60\1\145\1\156\1\163\2\165\1\151"+
        "\1\143\1\163\1\144\1\165\2\uffff\3\145\2\60\1\142\1\uffff\1\160"+
        "\1\101\1\151\1\154\1\164\1\171\1\40\1\165\1\uffff\1\160\1\60\1\164"+
        "\1\151\1\162\1\143\1\164\1\145\1\151\1\164\1\163\2\60\2\uffff\1"+
        "\145\1\165\1\60\1\156\1\145\2\60\2\uffff\1\156\1\164\1\uffff\2\162"+
        "\1\156\1\145\1\151\1\60\1\143\1\60\1\163\1\151\2\uffff\1\162\1\164"+
        "\1\uffff\1\147\1\141\2\uffff\1\143\1\163\1\141\1\145\2\60\1\157"+
        "\1\141\1\60\1\156\3\60\1\156\1\145\1\60\1\151\1\163\2\uffff\1\156"+
        "\1\164\1\uffff\1\145\2\60\1\uffff\1\156\2\60\1\145\2\60\1\uffff"+
        "\1\164\2\uffff\1\60\2\uffff\1\60\2\uffff";
    static final String DFA29_maxS =
        "\1\175\1\166\1\156\1\150\1\157\1\145\1\157\1\165\2\uffff\1\162"+
        "\2\156\1\uffff\1\162\1\75\2\165\5\75\2\uffff\1\101\3\uffff\1\164"+
        "\1\157\4\uffff\1\12\2\uffff\1\145\1\163\1\144\1\156\1\143\1\145"+
        "\1\156\1\164\1\166\1\15\1\156\1\154\1\145\2\172\1\154\1\155\1\165"+
        "\1\uffff\1\164\1\167\1\155\1\172\1\164\3\uffff\1\126\1\162\1\157"+
        "\2\uffff\1\162\1\145\1\15\1\157\1\172\1\145\1\156\1\163\2\165\1"+
        "\151\1\143\1\163\1\144\1\165\2\uffff\3\145\2\172\1\142\1\uffff\1"+
        "\160\1\101\1\151\1\154\1\164\1\171\1\172\1\165\1\uffff\1\160\1\172"+
        "\1\164\1\151\1\162\1\143\1\164\1\145\1\151\1\164\1\163\2\172\2\uffff"+
        "\1\145\1\165\1\172\1\156\1\145\2\172\2\uffff\1\156\1\164\1\uffff"+
        "\2\162\1\156\1\145\1\151\1\172\1\143\1\172\1\163\1\151\2\uffff\1"+
        "\162\1\164\1\uffff\1\147\1\141\2\uffff\1\143\1\163\1\141\1\145\2"+
        "\172\1\157\1\141\1\172\1\156\3\172\1\156\1\145\1\172\1\151\1\163"+
        "\2\uffff\1\156\1\164\1\uffff\1\145\2\172\1\uffff\1\156\2\172\1\145"+
        "\2\172\1\uffff\1\164\2\uffff\1\172\2\uffff\1\172\2\uffff";
    static final String DFA29_acceptS =
        "\10\uffff\1\12\1\13\3\uffff\1\24\11\uffff\1\34\1\35\1\uffff\1\41"+
        "\1\42\1\43\2\uffff\1\46\1\47\1\50\1\51\1\uffff\1\52\1\53\22\uffff"+
        "\1\26\5\uffff\1\33\1\37\1\36\3\uffff\2\51\17\uffff\1\16\1\17\6\uffff"+
        "\1\30\10\uffff\1\31\15\uffff\1\27\1\32\7\uffff\1\20\1\21\2\uffff"+
        "\1\3\12\uffff\1\45\1\44\2\uffff\1\40\2\uffff\1\1\1\23\22\uffff\1"+
        "\15\1\7\2\uffff\1\22\3\uffff\1\10\6\uffff\1\2\1\uffff\1\5\1\11\1"+
        "\uffff\1\25\1\6\1\uffff\1\14\1\4";
    static final String DFA29_specialS =
        "\u00c0\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\44\1\42\2\uffff\1\43\22\uffff\1\44\1\27\1\32\1\45\1\uffff"+
            "\1\24\2\uffff\1\10\1\11\1\22\1\25\1\15\1\26\1\34\1\23\12\34"+
            "\2\uffff\1\30\1\17\1\30\1\uffff\1\33\11\37\1\31\20\37\4\uffff"+
            "\1\37\1\uffff\1\2\1\36\1\4\1\6\1\1\1\7\2\37\1\13\4\37\1\20\1"+
            "\21\1\12\1\37\1\5\1\35\1\16\1\14\1\37\1\3\3\37\1\40\1\uffff"+
            "\1\41",
            "\1\47\1\uffff\1\50\7\uffff\1\46",
            "\1\52\12\uffff\1\51",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56\11\uffff\1\57",
            "\1\61\23\uffff\1\60",
            "",
            "",
            "\1\62",
            "\1\64\7\uffff\1\63",
            "\1\65",
            "",
            "\1\66\10\uffff\1\67",
            "\1\27",
            "\1\72\11\uffff\1\71\5\uffff\1\73",
            "\1\74\2\uffff\1\75",
            "\1\76",
            "\1\76",
            "\1\76",
            "\1\76",
            "\1\76",
            "",
            "",
            "\1\101",
            "",
            "",
            "",
            "\1\102",
            "\1\103",
            "",
            "",
            "",
            "",
            "\1\105",
            "",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\112\11\uffff\1\111",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116\2\uffff\1\117",
            "\1\120",
            "\1\40\2\uffff\1\40",
            "\1\121",
            "\1\122",
            "\1\123",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\17\37\1\124\12\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\136",
            "",
            "",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "",
            "\1\142\3\uffff\1\143",
            "\1\144",
            "\1\41\2\uffff\1\41",
            "\1\145",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\166",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175\17\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\177",
            "",
            "\1\u0080",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\13\37\1\u008b\16"+
            "\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\u008e",
            "\1\u008f",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0091",
            "\1\u0092",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u009c",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u009d",
            "\1\u009e",
            "",
            "",
            "\1\u009f",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00a9",
            "\1\u00aa",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00ac",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00ad",
            "\1\u00ae",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\22\37\1\u00b5\7"+
            "\37",
            "",
            "\1\u00b7",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00ba",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u00bd",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            ""
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
            return "1:1: Tokens : ( T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | ASSIGNMENT_OPERATOR | EQUALITY_OPERATOR | RELATIONAL_OPERATOR | ADDITIVE_OPERATOR | MULTIPLICATIVE_OPERATOR | LANGUAGE | STRING | TIME | NUMBER | BOOL | TYPE | ID | START | END | NEWLINE | WS | COMMENT );";
        }
    }
 

}