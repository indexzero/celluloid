// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g 2009-12-19 03:24:24

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class celluloidWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VARDEF", "FUNC", "PRED", "ARG", "ARGS", "OBJCALL", "CALL", "PROGRAM", "EVENTS", "CONSTRAINTS", "DEVICES", "FUNCTIONS", "IF", "ELSEIF", "ELSE", "LISTENER", "EVERY", "COND", "RETURN", "IN", "WHEN", "PROGBLOCK", "INBLOCK", "LISTENBLOCK", "IFBLOCK", "FUNBLOCK", "CONBLOCK", "DEVBLOCK", "LANGBLOCK", "FUNHEAD", "PREDHEAD", "EVENT", "CONSTRAINT", "REQUIRES", "ANNOUNCES", "ANNOUNCEMENT", "ANNOUNCEMENTS", "DEVICE", "ACCEPTS", "NEWLINE", "ID", "START", "END", "TIME", "TYPE", "ASSIGNMENT_OPERATOR", "EQUALITY_OPERATOR", "RELATIONAL_OPERATOR", "ADDITIVE_OPERATOR", "MULTIPLICATIVE_OPERATOR", "BOOL", "NUMBER", "STRING", "ESCAPE", "DAY", "HOUR", "MINUTE", "SECOND", "EXPONENT", "WS", "COMMENT", "'event'", "'announce'", "'when'", "'constraint'", "'requires'", "'announces'", "'device'", "'accepts'", "'function'", "'('", "')'", "'predicate'", "'return'", "'in'", "'if'", "'else if'", "'else'", "'unless'", "'every'", "','", "'timeline'", "'='", "'not'", "'or'", "'and'", "'new'"
    };
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
    public static final int ID=44;
    public static final int EOF=-1;
    public static final int EQUALITY_OPERATOR=50;
    public static final int LISTENER=19;
    public static final int CONBLOCK=30;
    public static final int TYPE=48;
    public static final int IF=16;
    public static final int ACCEPTS=42;
    public static final int FUNHEAD=33;
    public static final int TIME=47;
    public static final int PROGBLOCK=25;
    public static final int ANNOUNCEMENT=39;
    public static final int IN=23;
    public static final int T__90=90;
    public static final int ESCAPE=57;
    public static final int ARG=7;
    public static final int LANGBLOCK=32;
    public static final int FUNBLOCK=29;
    public static final int RETURN=22;
    public static final int DEVICE=41;
    public static final int ARGS=8;
    public static final int ANNOUNCEMENTS=40;
    public static final int MULTIPLICATIVE_OPERATOR=53;
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
    public static final int BOOL=54;
    public static final int NUMBER=55;
    public static final int EVERY=20;
    public static final int DEVICES=14;
    public static final int T__85=85;
    public static final int EVENT=35;
    public static final int ADDITIVE_OPERATOR=52;
    public static final int HOUR=59;
    public static final int T__84=84;
    public static final int EVENTS=12;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int RELATIONAL_OPERATOR=51;
    public static final int T__88=88;
    public static final int ELSEIF=17;
    public static final int T__71=71;
    public static final int WS=63;
    public static final int T__72=72;
    public static final int REQUIRES=37;
    public static final int NEWLINE=43;
    public static final int T__70=70;
    public static final int WHEN=24;
    public static final int PREDHEAD=34;
    public static final int FUNC=5;
    public static final int INBLOCK=26;
    public static final int START=45;
    public static final int ASSIGNMENT_OPERATOR=49;
    public static final int PROGRAM=11;
    public static final int ANNOUNCES=38;
    public static final int CALL=10;
    public static final int T__76=76;
    public static final int END=46;
    public static final int MINUTE=60;
    public static final int T__75=75;
    public static final int COND=21;
    public static final int T__74=74;
    public static final int CONSTRAINT=36;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int DEVBLOCK=31;
    public static final int T__78=78;
    public static final int STRING=56;
    public static final int T__77=77;

    // delegates
    // delegators


        public celluloidWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public celluloidWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return celluloidWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g"; }



    // $ANTLR start "program"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:9:1: program : ^( PROGRAM ^( EVENTS eventDefinition ( NEWLINE )* ) ^( CONSTRAINTS constraintDefinition ( NEWLINE )* ) ^( DEVICES deviceDefinition ( NEWLINE )* ) ^( FUNCTIONS ( functionDefinition | predicateDefinition )* ) ^( PROGBLOCK ( functionPredicateBlockDeclaration )* ) ) ;
    public final void program() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:10:5: ( ^( PROGRAM ^( EVENTS eventDefinition ( NEWLINE )* ) ^( CONSTRAINTS constraintDefinition ( NEWLINE )* ) ^( DEVICES deviceDefinition ( NEWLINE )* ) ^( FUNCTIONS ( functionDefinition | predicateDefinition )* ) ^( PROGBLOCK ( functionPredicateBlockDeclaration )* ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:10:10: ^( PROGRAM ^( EVENTS eventDefinition ( NEWLINE )* ) ^( CONSTRAINTS constraintDefinition ( NEWLINE )* ) ^( DEVICES deviceDefinition ( NEWLINE )* ) ^( FUNCTIONS ( functionDefinition | predicateDefinition )* ) ^( PROGBLOCK ( functionPredicateBlockDeclaration )* ) )
            {
            match(input,PROGRAM,FOLLOW_PROGRAM_in_program39); 

            match(input, Token.DOWN, null); 
            match(input,EVENTS,FOLLOW_EVENTS_in_program56); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventDefinition_in_program58);
            eventDefinition();

            state._fsp--;

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:11:39: ( NEWLINE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NEWLINE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:11:39: NEWLINE
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_program60); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input, Token.UP, null); 
            match(input,CONSTRAINTS,FOLLOW_CONSTRAINTS_in_program78); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_constraintDefinition_in_program80);
            constraintDefinition();

            state._fsp--;

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:12:49: ( NEWLINE )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NEWLINE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:12:49: NEWLINE
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_program82); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input, Token.UP, null); 
            match(input,DEVICES,FOLLOW_DEVICES_in_program100); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_deviceDefinition_in_program102);
            deviceDefinition();

            state._fsp--;

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:13:41: ( NEWLINE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NEWLINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:13:41: NEWLINE
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_program104); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input, Token.UP, null); 
            match(input,FUNCTIONS,FOLLOW_FUNCTIONS_in_program122); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:14:26: ( functionDefinition | predicateDefinition )*
                loop4:
                do {
                    int alt4=3;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==FUNC) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==PRED) ) {
                        alt4=2;
                    }


                    switch (alt4) {
                	case 1 :
                	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:14:27: functionDefinition
                	    {
                	    pushFollow(FOLLOW_functionDefinition_in_program125);
                	    functionDefinition();

                	    state._fsp--;


                	    }
                	    break;
                	case 2 :
                	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:14:48: predicateDefinition
                	    {
                	    pushFollow(FOLLOW_predicateDefinition_in_program129);
                	    predicateDefinition();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop4;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            match(input,PROGBLOCK,FOLLOW_PROGBLOCK_in_program148); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:15:26: ( functionPredicateBlockDeclaration )*
                loop5:
                do {
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==VARDEF||LA5_0==ARG||LA5_0==CALL||LA5_0==IF||LA5_0==IN||LA5_0==ASSIGNMENT_OPERATOR) ) {
                        alt5=1;
                    }


                    switch (alt5) {
                	case 1 :
                	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:15:26: functionPredicateBlockDeclaration
                	    {
                	    pushFollow(FOLLOW_functionPredicateBlockDeclaration_in_program150);
                	    functionPredicateBlockDeclaration();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop5;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "program"


    // $ANTLR start "eventDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:19:1: eventDefinition : ^( EVENT ID ) ;
    public final void eventDefinition() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:20:5: ( ^( EVENT ID ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:20:10: ^( EVENT ID )
            {
            match(input,EVENT,FOLLOW_EVENT_in_eventDefinition176); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_eventDefinition178); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "eventDefinition"


    // $ANTLR start "announcementDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:24:1: announcementDeclaration : ^( ANNOUNCEMENT ID 'when' ID ( variableDeclaration )? ) ;
    public final void announcementDeclaration() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:25:5: ( ^( ANNOUNCEMENT ID 'when' ID ( variableDeclaration )? ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:25:10: ^( ANNOUNCEMENT ID 'when' ID ( variableDeclaration )? )
            {
            match(input,ANNOUNCEMENT,FOLLOW_ANNOUNCEMENT_in_announcementDeclaration201); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_announcementDeclaration203); 
            match(input,67,FOLLOW_67_in_announcementDeclaration205); 
            match(input,ID,FOLLOW_ID_in_announcementDeclaration207); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:25:38: ( variableDeclaration )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==VARDEF||LA6_0==ARG) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:25:38: variableDeclaration
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_announcementDeclaration209);
                    variableDeclaration();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "announcementDeclaration"


    // $ANTLR start "constraintDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:29:1: constraintDefinition : ^( CONSTRAINT ID ^( REQUIRES ( idList )? ) ^( ANNOUNCES ( idList )? ) constraintBlock ) ;
    public final void constraintDefinition() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:30:5: ( ^( CONSTRAINT ID ^( REQUIRES ( idList )? ) ^( ANNOUNCES ( idList )? ) constraintBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:30:10: ^( CONSTRAINT ID ^( REQUIRES ( idList )? ) ^( ANNOUNCES ( idList )? ) constraintBlock )
            {
            match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_constraintDefinition234); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_constraintDefinition236); 
            match(input,REQUIRES,FOLLOW_REQUIRES_in_constraintDefinition239); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:30:38: ( idList )?
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ID) ) {
                    alt7=1;
                }
                switch (alt7) {
                    case 1 :
                        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:30:38: idList
                        {
                        pushFollow(FOLLOW_idList_in_constraintDefinition242);
                        idList();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            match(input,ANNOUNCES,FOLLOW_ANNOUNCES_in_constraintDefinition247); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:30:60: ( idList )?
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ID) ) {
                    alt8=1;
                }
                switch (alt8) {
                    case 1 :
                        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:30:60: idList
                        {
                        pushFollow(FOLLOW_idList_in_constraintDefinition250);
                        idList();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            pushFollow(FOLLOW_constraintBlock_in_constraintDefinition254);
            constraintBlock();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constraintDefinition"


    // $ANTLR start "constraintBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:32:1: constraintBlock : ^( CONBLOCK ( constraintBlockDeclaration )* ^( ANNOUNCEMENTS ( announcementDeclaration )* ) ) ;
    public final void constraintBlock() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:33:5: ( ^( CONBLOCK ( constraintBlockDeclaration )* ^( ANNOUNCEMENTS ( announcementDeclaration )* ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:33:10: ^( CONBLOCK ( constraintBlockDeclaration )* ^( ANNOUNCEMENTS ( announcementDeclaration )* ) )
            {
            match(input,CONBLOCK,FOLLOW_CONBLOCK_in_constraintBlock276); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:33:21: ( constraintBlockDeclaration )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==VARDEF||LA9_0==ARG||(LA9_0>=FUNHEAD && LA9_0<=PREDHEAD)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:33:21: constraintBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_constraintBlockDeclaration_in_constraintBlock278);
            	    constraintBlockDeclaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,ANNOUNCEMENTS,FOLLOW_ANNOUNCEMENTS_in_constraintBlock282); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:33:65: ( announcementDeclaration )*
                loop10:
                do {
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ANNOUNCEMENT) ) {
                        alt10=1;
                    }


                    switch (alt10) {
                	case 1 :
                	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:33:65: announcementDeclaration
                	    {
                	    pushFollow(FOLLOW_announcementDeclaration_in_constraintBlock284);
                	    announcementDeclaration();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop10;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constraintBlock"


    // $ANTLR start "constraintBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:35:1: constraintBlockDeclaration : ( variableDeclaration | predicateHeader | functionHeader );
    public final void constraintBlockDeclaration() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:36:5: ( variableDeclaration | predicateHeader | functionHeader )
            int alt11=3;
            switch ( input.LA(1) ) {
            case VARDEF:
            case ARG:
                {
                alt11=1;
                }
                break;
            case PREDHEAD:
                {
                alt11=2;
                }
                break;
            case FUNHEAD:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:36:8: variableDeclaration
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_constraintBlockDeclaration309);
                    variableDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:37:10: predicateHeader
                    {
                    pushFollow(FOLLOW_predicateHeader_in_constraintBlockDeclaration321);
                    predicateHeader();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:38:10: functionHeader
                    {
                    pushFollow(FOLLOW_functionHeader_in_constraintBlockDeclaration333);
                    functionHeader();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constraintBlockDeclaration"


    // $ANTLR start "deviceDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:42:1: deviceDefinition : ^( DEVICE ID ^( ACCEPTS ( idList )? ) deviceBlock ) ;
    public final void deviceDefinition() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:43:5: ( ^( DEVICE ID ^( ACCEPTS ( idList )? ) deviceBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:43:10: ^( DEVICE ID ^( ACCEPTS ( idList )? ) deviceBlock )
            {
            match(input,DEVICE,FOLLOW_DEVICE_in_deviceDefinition365); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_deviceDefinition367); 
            match(input,ACCEPTS,FOLLOW_ACCEPTS_in_deviceDefinition370); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:43:33: ( idList )?
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==ID) ) {
                    alt12=1;
                }
                switch (alt12) {
                    case 1 :
                        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:43:33: idList
                        {
                        pushFollow(FOLLOW_idList_in_deviceDefinition373);
                        idList();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            pushFollow(FOLLOW_deviceBlock_in_deviceDefinition377);
            deviceBlock();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "deviceDefinition"


    // $ANTLR start "deviceBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:45:1: deviceBlock : ^( DEVBLOCK ( deviceBlockDeclaration )* ) ;
    public final void deviceBlock() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:46:5: ( ^( DEVBLOCK ( deviceBlockDeclaration )* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:46:10: ^( DEVBLOCK ( deviceBlockDeclaration )* )
            {
            match(input,DEVBLOCK,FOLLOW_DEVBLOCK_in_deviceBlock399); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:46:21: ( deviceBlockDeclaration )*
                loop13:
                do {
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=VARDEF && LA13_0<=ARG)) ) {
                        alt13=1;
                    }


                    switch (alt13) {
                	case 1 :
                	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:46:21: deviceBlockDeclaration
                	    {
                	    pushFollow(FOLLOW_deviceBlockDeclaration_in_deviceBlock401);
                	    deviceBlockDeclaration();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop13;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "deviceBlock"


    // $ANTLR start "deviceBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:48:1: deviceBlockDeclaration : ( variableDeclaration | predicateDefinition | functionDefinition );
    public final void deviceBlockDeclaration() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:49:5: ( variableDeclaration | predicateDefinition | functionDefinition )
            int alt14=3;
            switch ( input.LA(1) ) {
            case VARDEF:
            case ARG:
                {
                alt14=1;
                }
                break;
            case PRED:
                {
                alt14=2;
                }
                break;
            case FUNC:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:49:10: variableDeclaration
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_deviceBlockDeclaration422);
                    variableDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:50:10: predicateDefinition
                    {
                    pushFollow(FOLLOW_predicateDefinition_in_deviceBlockDeclaration434);
                    predicateDefinition();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:51:10: functionDefinition
                    {
                    pushFollow(FOLLOW_functionDefinition_in_deviceBlockDeclaration446);
                    functionDefinition();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "deviceBlockDeclaration"


    // $ANTLR start "functionHeader"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:55:1: functionHeader : ^( FUNHEAD ID ^( ARGS variableList ) ) ;
    public final void functionHeader() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:56:5: ( ^( FUNHEAD ID ^( ARGS variableList ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:56:10: ^( FUNHEAD ID ^( ARGS variableList ) )
            {
            match(input,FUNHEAD,FOLLOW_FUNHEAD_in_functionHeader473); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_functionHeader475); 
            match(input,ARGS,FOLLOW_ARGS_in_functionHeader478); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variableList_in_functionHeader480);
            variableList();

            state._fsp--;


            match(input, Token.UP, null); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "functionHeader"


    // $ANTLR start "functionDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:58:1: functionDefinition : ^( FUNC ID ^( ARGS variableList ) ( functionBlock )? ) ;
    public final void functionDefinition() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:59:5: ( ^( FUNC ID ^( ARGS variableList ) ( functionBlock )? ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:59:10: ^( FUNC ID ^( ARGS variableList ) ( functionBlock )? )
            {
            match(input,FUNC,FOLLOW_FUNC_in_functionDefinition503); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_functionDefinition505); 
            match(input,ARGS,FOLLOW_ARGS_in_functionDefinition508); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variableList_in_functionDefinition510);
            variableList();

            state._fsp--;


            match(input, Token.UP, null); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:59:41: ( functionBlock )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==FUNBLOCK) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:59:41: functionBlock
                    {
                    pushFollow(FOLLOW_functionBlock_in_functionDefinition513);
                    functionBlock();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "functionDefinition"


    // $ANTLR start "functionBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:61:1: functionBlock : ^( FUNBLOCK RETURN ( functionPredicateBlockDeclaration )* ) ;
    public final void functionBlock() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:62:5: ( ^( FUNBLOCK RETURN ( functionPredicateBlockDeclaration )* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:62:10: ^( FUNBLOCK RETURN ( functionPredicateBlockDeclaration )* )
            {
            match(input,FUNBLOCK,FOLLOW_FUNBLOCK_in_functionBlock541); 

            match(input, Token.DOWN, null); 
            match(input,RETURN,FOLLOW_RETURN_in_functionBlock543); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:62:28: ( functionPredicateBlockDeclaration )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==VARDEF||LA16_0==ARG||LA16_0==CALL||LA16_0==IF||LA16_0==IN||LA16_0==ASSIGNMENT_OPERATOR) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:62:28: functionPredicateBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_functionPredicateBlockDeclaration_in_functionBlock545);
            	    functionPredicateBlockDeclaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "functionBlock"


    // $ANTLR start "functionPredicateBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:64:1: functionPredicateBlockDeclaration : ( variableDeclaration | expression | inStatement | ifStatement | functionPredicateCall );
    public final void functionPredicateBlockDeclaration() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:65:5: ( variableDeclaration | expression | inStatement | ifStatement | functionPredicateCall )
            int alt17=5;
            switch ( input.LA(1) ) {
            case VARDEF:
            case ARG:
                {
                alt17=1;
                }
                break;
            case ASSIGNMENT_OPERATOR:
                {
                alt17=2;
                }
                break;
            case IN:
                {
                alt17=3;
                }
                break;
            case IF:
                {
                alt17=4;
                }
                break;
            case CALL:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:65:10: variableDeclaration
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_functionPredicateBlockDeclaration568);
                    variableDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:66:10: expression
                    {
                    pushFollow(FOLLOW_expression_in_functionPredicateBlockDeclaration579);
                    expression();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:67:10: inStatement
                    {
                    pushFollow(FOLLOW_inStatement_in_functionPredicateBlockDeclaration590);
                    inStatement();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:68:10: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_functionPredicateBlockDeclaration602);
                    ifStatement();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:69:10: functionPredicateCall
                    {
                    pushFollow(FOLLOW_functionPredicateCall_in_functionPredicateBlockDeclaration613);
                    functionPredicateCall();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "functionPredicateBlockDeclaration"


    // $ANTLR start "predicateHeader"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:72:1: predicateHeader : ^( PREDHEAD ID ^( ARGS variableList ) ) ;
    public final void predicateHeader() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:73:5: ( ^( PREDHEAD ID ^( ARGS variableList ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:73:10: ^( PREDHEAD ID ^( ARGS variableList ) )
            {
            match(input,PREDHEAD,FOLLOW_PREDHEAD_in_predicateHeader639); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_predicateHeader641); 
            match(input,ARGS,FOLLOW_ARGS_in_predicateHeader644); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variableList_in_predicateHeader646);
            variableList();

            state._fsp--;


            match(input, Token.UP, null); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "predicateHeader"


    // $ANTLR start "predicateDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:75:1: predicateDefinition : ^( PRED ID ^( ARGS variableList ) predicateBlock ) ;
    public final void predicateDefinition() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:76:5: ( ^( PRED ID ^( ARGS variableList ) predicateBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:76:10: ^( PRED ID ^( ARGS variableList ) predicateBlock )
            {
            match(input,PRED,FOLLOW_PRED_in_predicateDefinition673); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_predicateDefinition675); 
            match(input,ARGS,FOLLOW_ARGS_in_predicateDefinition678); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variableList_in_predicateDefinition680);
            variableList();

            state._fsp--;


            match(input, Token.UP, null); 
            pushFollow(FOLLOW_predicateBlock_in_predicateDefinition683);
            predicateBlock();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "predicateDefinition"


    // $ANTLR start "predicateBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:78:1: predicateBlock : ^( FUNBLOCK ^( RETURN expression ) ( functionPredicateBlockDeclaration )* ) ;
    public final void predicateBlock() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:79:5: ( ^( FUNBLOCK ^( RETURN expression ) ( functionPredicateBlockDeclaration )* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:79:10: ^( FUNBLOCK ^( RETURN expression ) ( functionPredicateBlockDeclaration )* )
            {
            match(input,FUNBLOCK,FOLLOW_FUNBLOCK_in_predicateBlock715); 

            match(input, Token.DOWN, null); 
            match(input,RETURN,FOLLOW_RETURN_in_predicateBlock718); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_predicateBlock720);
            expression();

            state._fsp--;


            match(input, Token.UP, null); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:79:42: ( functionPredicateBlockDeclaration )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==VARDEF||LA18_0==ARG||LA18_0==CALL||LA18_0==IF||LA18_0==IN||LA18_0==ASSIGNMENT_OPERATOR) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:79:42: functionPredicateBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_functionPredicateBlockDeclaration_in_predicateBlock723);
            	    functionPredicateBlockDeclaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "predicateBlock"


    // $ANTLR start "inStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:83:1: inStatement : ^( IN ID inBlock ) ;
    public final void inStatement() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:84:5: ( ^( IN ID inBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:84:8: ^( IN ID inBlock )
            {
            match(input,IN,FOLLOW_IN_in_inStatement746); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_inStatement748); 
            pushFollow(FOLLOW_inBlock_in_inStatement750);
            inBlock();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "inStatement"


    // $ANTLR start "inBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:87:1: inBlock : ^( INBLOCK ( inBlockDeclaration )* ) ;
    public final void inBlock() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:88:5: ( ^( INBLOCK ( inBlockDeclaration )* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:88:7: ^( INBLOCK ( inBlockDeclaration )* )
            {
            match(input,INBLOCK,FOLLOW_INBLOCK_in_inBlock778); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:88:17: ( inBlockDeclaration )*
                loop19:
                do {
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==OBJCALL||LA19_0==LISTENER) ) {
                        alt19=1;
                    }


                    switch (alt19) {
                	case 1 :
                	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:88:17: inBlockDeclaration
                	    {
                	    pushFollow(FOLLOW_inBlockDeclaration_in_inBlock780);
                	    inBlockDeclaration();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop19;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "inBlock"


    // $ANTLR start "inBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:90:1: inBlockDeclaration : ( whenStatement | everyStatement | constraintFunctionCall );
    public final void inBlockDeclaration() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:91:5: ( whenStatement | everyStatement | constraintFunctionCall )
            int alt20=3;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:91:7: whenStatement
                    {
                    pushFollow(FOLLOW_whenStatement_in_inBlockDeclaration799);
                    whenStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:92:9: everyStatement
                    {
                    pushFollow(FOLLOW_everyStatement_in_inBlockDeclaration810);
                    everyStatement();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:93:9: constraintFunctionCall
                    {
                    pushFollow(FOLLOW_constraintFunctionCall_in_inBlockDeclaration821);
                    constraintFunctionCall();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "inBlockDeclaration"


    // $ANTLR start "ifStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:96:1: ifStatement : ^( IF logicalORExpression ifBlock ) ;
    public final void ifStatement() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:97:5: ( ^( IF logicalORExpression ifBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:97:8: ^( IF logicalORExpression ifBlock )
            {
            match(input,IF,FOLLOW_IF_in_ifStatement840); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_logicalORExpression_in_ifStatement842);
            logicalORExpression();

            state._fsp--;

            pushFollow(FOLLOW_ifBlock_in_ifStatement844);
            ifBlock();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ifStatement"


    // $ANTLR start "ifBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:99:1: ifBlock : ^( IFBLOCK ( ifBlockDeclaration )+ ) ^( ELSEIF ( elseIfStatement )* ) ^( ELSE ( elseStatement )? ) ;
    public final void ifBlock() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:100:5: ( ^( IFBLOCK ( ifBlockDeclaration )+ ) ^( ELSEIF ( elseIfStatement )* ) ^( ELSE ( elseStatement )? ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:100:9: ^( IFBLOCK ( ifBlockDeclaration )+ ) ^( ELSEIF ( elseIfStatement )* ) ^( ELSE ( elseStatement )? )
            {
            match(input,IFBLOCK,FOLLOW_IFBLOCK_in_ifBlock864); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:100:19: ( ifBlockDeclaration )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==VARDEF||LA21_0==ARG||LA21_0==CALL||LA21_0==IF||LA21_0==IN||LA21_0==ASSIGNMENT_OPERATOR) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:100:19: ifBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_ifBlockDeclaration_in_ifBlock866);
            	    ifBlockDeclaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            match(input, Token.UP, null); 
            match(input,ELSEIF,FOLLOW_ELSEIF_in_ifBlock871); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:100:49: ( elseIfStatement )*
                loop22:
                do {
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=EQUALITY_OPERATOR && LA22_0<=MULTIPLICATIVE_OPERATOR)||(LA22_0>=88 && LA22_0<=89)) ) {
                        alt22=1;
                    }


                    switch (alt22) {
                	case 1 :
                	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:100:49: elseIfStatement
                	    {
                	    pushFollow(FOLLOW_elseIfStatement_in_ifBlock873);
                	    elseIfStatement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop22;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            match(input,ELSE,FOLLOW_ELSE_in_ifBlock878); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:100:74: ( elseStatement )?
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==IFBLOCK) ) {
                    alt23=1;
                }
                switch (alt23) {
                    case 1 :
                        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:100:74: elseStatement
                        {
                        pushFollow(FOLLOW_elseStatement_in_ifBlock880);
                        elseStatement();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ifBlock"


    // $ANTLR start "elseStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:103:1: elseStatement : ^( IFBLOCK ifBlockDeclaration ) ;
    public final void elseStatement() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:104:5: ( ^( IFBLOCK ifBlockDeclaration ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:104:9: ^( IFBLOCK ifBlockDeclaration )
            {
            match(input,IFBLOCK,FOLLOW_IFBLOCK_in_elseStatement907); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_ifBlockDeclaration_in_elseStatement909);
            ifBlockDeclaration();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "elseStatement"


    // $ANTLR start "elseIfStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:106:1: elseIfStatement : ^( logicalORExpression ^( IFBLOCK ifBlockDeclaration ) ) ;
    public final void elseIfStatement() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:107:5: ( ^( logicalORExpression ^( IFBLOCK ifBlockDeclaration ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:107:9: ^( logicalORExpression ^( IFBLOCK ifBlockDeclaration ) )
            {
            pushFollow(FOLLOW_logicalORExpression_in_elseIfStatement930);
            logicalORExpression();

            state._fsp--;


            match(input, Token.DOWN, null); 
            match(input,IFBLOCK,FOLLOW_IFBLOCK_in_elseIfStatement933); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_ifBlockDeclaration_in_elseIfStatement935);
            ifBlockDeclaration();

            state._fsp--;


            match(input, Token.UP, null); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "elseIfStatement"


    // $ANTLR start "ifBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:109:1: ifBlockDeclaration : ( variableDeclaration | expression | inStatement | ifStatement | functionPredicateCall );
    public final void ifBlockDeclaration() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:110:5: ( variableDeclaration | expression | inStatement | ifStatement | functionPredicateCall )
            int alt24=5;
            switch ( input.LA(1) ) {
            case VARDEF:
            case ARG:
                {
                alt24=1;
                }
                break;
            case ASSIGNMENT_OPERATOR:
                {
                alt24=2;
                }
                break;
            case IN:
                {
                alt24=3;
                }
                break;
            case IF:
                {
                alt24=4;
                }
                break;
            case CALL:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:110:7: variableDeclaration
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_ifBlockDeclaration953);
                    variableDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:111:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_ifBlockDeclaration963);
                    expression();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:112:9: inStatement
                    {
                    pushFollow(FOLLOW_inStatement_in_ifBlockDeclaration974);
                    inStatement();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:113:9: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_ifBlockDeclaration985);
                    ifStatement();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:114:9: functionPredicateCall
                    {
                    pushFollow(FOLLOW_functionPredicateCall_in_ifBlockDeclaration995);
                    functionPredicateCall();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ifBlockDeclaration"


    // $ANTLR start "whenStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:117:1: whenStatement : ^( LISTENER ^( ARG ( ID )? ) EVERY ^( COND ( 'when' )? 'unless' ( logicalORExpression )? ( ID )? ) listenerBlock ) ;
    public final void whenStatement() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:118:5: ( ^( LISTENER ^( ARG ( ID )? ) EVERY ^( COND ( 'when' )? 'unless' ( logicalORExpression )? ( ID )? ) listenerBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:118:9: ^( LISTENER ^( ARG ( ID )? ) EVERY ^( COND ( 'when' )? 'unless' ( logicalORExpression )? ( ID )? ) listenerBlock )
            {
            match(input,LISTENER,FOLLOW_LISTENER_in_whenStatement1015); 

            match(input, Token.DOWN, null); 
            match(input,ARG,FOLLOW_ARG_in_whenStatement1018); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:118:26: ( ID )?
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==ID) ) {
                    alt25=1;
                }
                switch (alt25) {
                    case 1 :
                        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:118:26: ID
                        {
                        match(input,ID,FOLLOW_ID_in_whenStatement1020); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            match(input,EVERY,FOLLOW_EVERY_in_whenStatement1024); 
            match(input,COND,FOLLOW_COND_in_whenStatement1027); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:118:44: ( 'when' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==67) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:118:44: 'when'
                    {
                    match(input,67,FOLLOW_67_in_whenStatement1029); 

                    }
                    break;

            }

            match(input,82,FOLLOW_82_in_whenStatement1032); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:118:61: ( logicalORExpression )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=EQUALITY_OPERATOR && LA27_0<=MULTIPLICATIVE_OPERATOR)||(LA27_0>=88 && LA27_0<=89)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:118:61: logicalORExpression
                    {
                    pushFollow(FOLLOW_logicalORExpression_in_whenStatement1034);
                    logicalORExpression();

                    state._fsp--;


                    }
                    break;

            }

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:118:82: ( ID )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:118:82: ID
                    {
                    match(input,ID,FOLLOW_ID_in_whenStatement1037); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
            pushFollow(FOLLOW_listenerBlock_in_whenStatement1041);
            listenerBlock();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "whenStatement"


    // $ANTLR start "everyStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:121:1: everyStatement : ^( LISTENER ^( ARG ( ID )? ) ^( EVERY TIME ) ^( COND ( 'when' )? ( 'unless' )? ( logicalORExpression )? ( ID )? ) listenerBlock ) ;
    public final void everyStatement() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:122:5: ( ^( LISTENER ^( ARG ( ID )? ) ^( EVERY TIME ) ^( COND ( 'when' )? ( 'unless' )? ( logicalORExpression )? ( ID )? ) listenerBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:122:9: ^( LISTENER ^( ARG ( ID )? ) ^( EVERY TIME ) ^( COND ( 'when' )? ( 'unless' )? ( logicalORExpression )? ( ID )? ) listenerBlock )
            {
            match(input,LISTENER,FOLLOW_LISTENER_in_everyStatement1070); 

            match(input, Token.DOWN, null); 
            match(input,ARG,FOLLOW_ARG_in_everyStatement1073); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:122:26: ( ID )?
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==ID) ) {
                    alt29=1;
                }
                switch (alt29) {
                    case 1 :
                        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:122:26: ID
                        {
                        match(input,ID,FOLLOW_ID_in_everyStatement1075); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            match(input,EVERY,FOLLOW_EVERY_in_everyStatement1080); 

            match(input, Token.DOWN, null); 
            match(input,TIME,FOLLOW_TIME_in_everyStatement1082); 

            match(input, Token.UP, null); 
            match(input,COND,FOLLOW_COND_in_everyStatement1086); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:122:52: ( 'when' )?
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==67) ) {
                    alt30=1;
                }
                switch (alt30) {
                    case 1 :
                        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:122:52: 'when'
                        {
                        match(input,67,FOLLOW_67_in_everyStatement1088); 

                        }
                        break;

                }

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:122:60: ( 'unless' )?
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==82) ) {
                    alt31=1;
                }
                switch (alt31) {
                    case 1 :
                        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:122:60: 'unless'
                        {
                        match(input,82,FOLLOW_82_in_everyStatement1091); 

                        }
                        break;

                }

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:122:70: ( logicalORExpression )?
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=EQUALITY_OPERATOR && LA32_0<=MULTIPLICATIVE_OPERATOR)||(LA32_0>=88 && LA32_0<=89)) ) {
                    alt32=1;
                }
                switch (alt32) {
                    case 1 :
                        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:122:70: logicalORExpression
                        {
                        pushFollow(FOLLOW_logicalORExpression_in_everyStatement1094);
                        logicalORExpression();

                        state._fsp--;


                        }
                        break;

                }

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:122:91: ( ID )?
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==ID) ) {
                    alt33=1;
                }
                switch (alt33) {
                    case 1 :
                        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:122:91: ID
                        {
                        match(input,ID,FOLLOW_ID_in_everyStatement1097); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            pushFollow(FOLLOW_listenerBlock_in_everyStatement1101);
            listenerBlock();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "everyStatement"


    // $ANTLR start "listenerBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:125:1: listenerBlock : ^( LISTENBLOCK ( listenerBlockDeclaration )* ) ;
    public final void listenerBlock() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:126:5: ( ^( LISTENBLOCK ( listenerBlockDeclaration )* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:126:8: ^( LISTENBLOCK ( listenerBlockDeclaration )* )
            {
            match(input,LISTENBLOCK,FOLLOW_LISTENBLOCK_in_listenerBlock1129); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:126:22: ( listenerBlockDeclaration )*
                loop34:
                do {
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==VARDEF||LA34_0==ARG||(LA34_0>=OBJCALL && LA34_0<=CALL)||LA34_0==ASSIGNMENT_OPERATOR) ) {
                        alt34=1;
                    }


                    switch (alt34) {
                	case 1 :
                	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:126:22: listenerBlockDeclaration
                	    {
                	    pushFollow(FOLLOW_listenerBlockDeclaration_in_listenerBlock1131);
                	    listenerBlockDeclaration();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop34;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "listenerBlock"


    // $ANTLR start "listenerBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:128:1: listenerBlockDeclaration : ( constraintFunctionCall | expression | variableDeclaration | functionPredicateCall );
    public final void listenerBlockDeclaration() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:129:5: ( constraintFunctionCall | expression | variableDeclaration | functionPredicateCall )
            int alt35=4;
            switch ( input.LA(1) ) {
            case OBJCALL:
                {
                alt35=1;
                }
                break;
            case ASSIGNMENT_OPERATOR:
                {
                alt35=2;
                }
                break;
            case VARDEF:
            case ARG:
                {
                alt35=3;
                }
                break;
            case CALL:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:129:10: constraintFunctionCall
                    {
                    pushFollow(FOLLOW_constraintFunctionCall_in_listenerBlockDeclaration1152);
                    constraintFunctionCall();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:130:10: expression
                    {
                    pushFollow(FOLLOW_expression_in_listenerBlockDeclaration1164);
                    expression();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:131:10: variableDeclaration
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_listenerBlockDeclaration1176);
                    variableDeclaration();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:132:10: functionPredicateCall
                    {
                    pushFollow(FOLLOW_functionPredicateCall_in_listenerBlockDeclaration1187);
                    functionPredicateCall();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "listenerBlockDeclaration"


    // $ANTLR start "constraintFunctionCall"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:135:1: constraintFunctionCall : ^( OBJCALL ID ID ^( ARGS ( expressionList )? ) ) ;
    public final void constraintFunctionCall() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:136:5: ( ^( OBJCALL ID ID ^( ARGS ( expressionList )? ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:136:10: ^( OBJCALL ID ID ^( ARGS ( expressionList )? ) )
            {
            match(input,OBJCALL,FOLLOW_OBJCALL_in_constraintFunctionCall1213); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_constraintFunctionCall1215); 
            match(input,ID,FOLLOW_ID_in_constraintFunctionCall1217); 
            match(input,ARGS,FOLLOW_ARGS_in_constraintFunctionCall1220); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:136:33: ( expressionList )?
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==ASSIGNMENT_OPERATOR) ) {
                    alt36=1;
                }
                switch (alt36) {
                    case 1 :
                        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:136:33: expressionList
                        {
                        pushFollow(FOLLOW_expressionList_in_constraintFunctionCall1222);
                        expressionList();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constraintFunctionCall"


    // $ANTLR start "functionPredicateCall"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:139:1: functionPredicateCall : ^( CALL ID ^( ARGS expressionList ) ) ;
    public final void functionPredicateCall() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:140:5: ( ^( CALL ID ^( ARGS expressionList ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:140:10: ^( CALL ID ^( ARGS expressionList ) )
            {
            match(input,CALL,FOLLOW_CALL_in_functionPredicateCall1258); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_functionPredicateCall1260); 
            match(input,ARGS,FOLLOW_ARGS_in_functionPredicateCall1263); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expressionList_in_functionPredicateCall1265);
            expressionList();

            state._fsp--;


            match(input, Token.UP, null); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "functionPredicateCall"


    // $ANTLR start "idList"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:145:1: idList : ( ID )+ ;
    public final void idList() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:146:5: ( ( ID )+ )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:146:10: ( ID )+
            {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:146:10: ( ID )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:146:10: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_idList1300); 

            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "idList"


    // $ANTLR start "variableList"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:149:1: variableList : ( variableDeclaration )+ ;
    public final void variableList() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:150:5: ( ( variableDeclaration )+ )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:150:10: ( variableDeclaration )+
            {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:150:10: ( variableDeclaration )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==VARDEF||LA38_0==ARG) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:150:10: variableDeclaration
            	    {
            	    pushFollow(FOLLOW_variableDeclaration_in_variableList1323);
            	    variableDeclaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "variableList"


    // $ANTLR start "expressionList"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:153:1: expressionList : ( expression )+ ;
    public final void expressionList() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:154:5: ( ( expression )+ )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:154:10: ( expression )+
            {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:154:10: ( expression )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==ASSIGNMENT_OPERATOR) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:154:10: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_expressionList1345);
            	    expression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expressionList"


    // $ANTLR start "variableDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:158:1: variableDeclaration : ( ^( VARDEF 'timeline' ID ) | ^( ARG 'timeline' ID ) | ^( VARDEF TYPE ID ( initializer )? ) | ^( ARG TYPE ID ) );
    public final void variableDeclaration() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:159:5: ( ^( VARDEF 'timeline' ID ) | ^( ARG 'timeline' ID ) | ^( VARDEF TYPE ID ( initializer )? ) | ^( ARG TYPE ID ) )
            int alt41=4;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==VARDEF) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==DOWN) ) {
                    int LA41_3 = input.LA(3);

                    if ( (LA41_3==85) ) {
                        alt41=1;
                    }
                    else if ( (LA41_3==TYPE) ) {
                        alt41=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA41_0==ARG) ) {
                int LA41_2 = input.LA(2);

                if ( (LA41_2==DOWN) ) {
                    int LA41_4 = input.LA(3);

                    if ( (LA41_4==85) ) {
                        alt41=2;
                    }
                    else if ( (LA41_4==TYPE) ) {
                        alt41=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:159:10: ^( VARDEF 'timeline' ID )
                    {
                    match(input,VARDEF,FOLLOW_VARDEF_in_variableDeclaration1378); 

                    match(input, Token.DOWN, null); 
                    match(input,85,FOLLOW_85_in_variableDeclaration1380); 
                    match(input,ID,FOLLOW_ID_in_variableDeclaration1382); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:160:10: ^( ARG 'timeline' ID )
                    {
                    match(input,ARG,FOLLOW_ARG_in_variableDeclaration1395); 

                    match(input, Token.DOWN, null); 
                    match(input,85,FOLLOW_85_in_variableDeclaration1397); 
                    match(input,ID,FOLLOW_ID_in_variableDeclaration1399); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:161:10: ^( VARDEF TYPE ID ( initializer )? )
                    {
                    match(input,VARDEF,FOLLOW_VARDEF_in_variableDeclaration1412); 

                    match(input, Token.DOWN, null); 
                    match(input,TYPE,FOLLOW_TYPE_in_variableDeclaration1414); 
                    match(input,ID,FOLLOW_ID_in_variableDeclaration1416); 
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:161:27: ( initializer )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>=EQUALITY_OPERATOR && LA40_0<=MULTIPLICATIVE_OPERATOR)||(LA40_0>=88 && LA40_0<=89)) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:161:27: initializer
                            {
                            pushFollow(FOLLOW_initializer_in_variableDeclaration1418);
                            initializer();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:162:10: ^( ARG TYPE ID )
                    {
                    match(input,ARG,FOLLOW_ARG_in_variableDeclaration1432); 

                    match(input, Token.DOWN, null); 
                    match(input,TYPE,FOLLOW_TYPE_in_variableDeclaration1434); 
                    match(input,ID,FOLLOW_ID_in_variableDeclaration1436); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "variableDeclaration"


    // $ANTLR start "initializer"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:165:1: initializer : logicalORExpression ;
    public final void initializer() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:166:5: ( logicalORExpression )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:166:10: logicalORExpression
            {
            pushFollow(FOLLOW_logicalORExpression_in_initializer1467);
            logicalORExpression();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "initializer"


    // $ANTLR start "expression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:169:1: expression : ^( ASSIGNMENT_OPERATOR logicalORExpression expression ) ;
    public final void expression() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:170:5: ( ^( ASSIGNMENT_OPERATOR logicalORExpression expression ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:170:10: ^( ASSIGNMENT_OPERATOR logicalORExpression expression )
            {
            match(input,ASSIGNMENT_OPERATOR,FOLLOW_ASSIGNMENT_OPERATOR_in_expression1493); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_logicalORExpression_in_expression1495);
            logicalORExpression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_expression1497);
            expression();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expression"


    // $ANTLR start "logicalORExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:172:1: logicalORExpression : ( ^( 'or' ( 'not' )? logicalORExpression logicalORExpression ) | ^( 'and' logicalORExpression logicalORExpression ) | ^( EQUALITY_OPERATOR logicalORExpression logicalORExpression ) | ^( RELATIONAL_OPERATOR logicalORExpression logicalORExpression ) | ^( ADDITIVE_OPERATOR logicalORExpression logicalORExpression ) | ^( MULTIPLICATIVE_OPERATOR primaryExpression logicalORExpression ) );
    public final void logicalORExpression() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:173:5: ( ^( 'or' ( 'not' )? logicalORExpression logicalORExpression ) | ^( 'and' logicalORExpression logicalORExpression ) | ^( EQUALITY_OPERATOR logicalORExpression logicalORExpression ) | ^( RELATIONAL_OPERATOR logicalORExpression logicalORExpression ) | ^( ADDITIVE_OPERATOR logicalORExpression logicalORExpression ) | ^( MULTIPLICATIVE_OPERATOR primaryExpression logicalORExpression ) )
            int alt43=6;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt43=1;
                }
                break;
            case 89:
                {
                alt43=2;
                }
                break;
            case EQUALITY_OPERATOR:
                {
                alt43=3;
                }
                break;
            case RELATIONAL_OPERATOR:
                {
                alt43=4;
                }
                break;
            case ADDITIVE_OPERATOR:
                {
                alt43=5;
                }
                break;
            case MULTIPLICATIVE_OPERATOR:
                {
                alt43=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:173:10: ^( 'or' ( 'not' )? logicalORExpression logicalORExpression )
                    {
                    match(input,88,FOLLOW_88_in_logicalORExpression1524); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:173:17: ( 'not' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==87) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:173:17: 'not'
                            {
                            match(input,87,FOLLOW_87_in_logicalORExpression1526); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1529);
                    logicalORExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1531);
                    logicalORExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:174:10: ^( 'and' logicalORExpression logicalORExpression )
                    {
                    match(input,89,FOLLOW_89_in_logicalORExpression1544); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1546);
                    logicalORExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1548);
                    logicalORExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:175:10: ^( EQUALITY_OPERATOR logicalORExpression logicalORExpression )
                    {
                    match(input,EQUALITY_OPERATOR,FOLLOW_EQUALITY_OPERATOR_in_logicalORExpression1561); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1563);
                    logicalORExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1565);
                    logicalORExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:176:10: ^( RELATIONAL_OPERATOR logicalORExpression logicalORExpression )
                    {
                    match(input,RELATIONAL_OPERATOR,FOLLOW_RELATIONAL_OPERATOR_in_logicalORExpression1578); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1580);
                    logicalORExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1582);
                    logicalORExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:177:10: ^( ADDITIVE_OPERATOR logicalORExpression logicalORExpression )
                    {
                    match(input,ADDITIVE_OPERATOR,FOLLOW_ADDITIVE_OPERATOR_in_logicalORExpression1595); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1597);
                    logicalORExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1599);
                    logicalORExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:178:10: ^( MULTIPLICATIVE_OPERATOR primaryExpression logicalORExpression )
                    {
                    match(input,MULTIPLICATIVE_OPERATOR,FOLLOW_MULTIPLICATIVE_OPERATOR_in_logicalORExpression1612); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primaryExpression_in_logicalORExpression1614);
                    primaryExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1616);
                    logicalORExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "logicalORExpression"


    // $ANTLR start "primaryExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:180:1: primaryExpression : ( ID | ID expressionList | literal | functionPredicateCall );
    public final void primaryExpression() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:181:5: ( ID | ID expressionList | literal | functionPredicateCall )
            int alt44=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==ASSIGNMENT_OPERATOR) ) {
                    alt44=2;
                }
                else if ( ((LA44_1>=EQUALITY_OPERATOR && LA44_1<=MULTIPLICATIVE_OPERATOR)||(LA44_1>=88 && LA44_1<=89)) ) {
                    alt44=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
                }
                break;
            case TIME:
            case BOOL:
            case NUMBER:
            case STRING:
                {
                alt44=3;
                }
                break;
            case CALL:
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:181:8: ID
                    {
                    match(input,ID,FOLLOW_ID_in_primaryExpression1635); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:182:8: ID expressionList
                    {
                    match(input,ID,FOLLOW_ID_in_primaryExpression1644); 
                    pushFollow(FOLLOW_expressionList_in_primaryExpression1646);
                    expressionList();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:183:8: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression1655);
                    literal();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:184:8: functionPredicateCall
                    {
                    pushFollow(FOLLOW_functionPredicateCall_in_primaryExpression1664);
                    functionPredicateCall();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "primaryExpression"


    // $ANTLR start "literal"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:188:1: literal : ( BOOL | NUMBER | STRING | TIME );
    public final void literal() throws RecognitionException {
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:188:9: ( BOOL | NUMBER | STRING | TIME )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:
            {
            if ( input.LA(1)==TIME||(input.LA(1)>=BOOL && input.LA(1)<=STRING) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "literal"

    // Delegated rules


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\13\uffff";
    static final String DFA20_eofS =
        "\13\uffff";
    static final String DFA20_minS =
        "\1\11\1\2\1\uffff\1\7\1\2\2\3\1\24\1\2\2\uffff";
    static final String DFA20_maxS =
        "\1\23\1\2\1\uffff\1\7\1\2\1\54\1\3\1\24\1\25\2\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\3\6\uffff\1\2\1\1";
    static final String DFA20_specialS =
        "\13\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\2\11\uffff\1\1",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\7\50\uffff\1\6",
            "\1\7",
            "\1\10",
            "\1\11\22\uffff\1\12",
            "",
            ""
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
            return "90:1: inBlockDeclaration : ( whenStatement | everyStatement | constraintFunctionCall );";
        }
    }
 

    public static final BitSet FOLLOW_PROGRAM_in_program39 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EVENTS_in_program56 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventDefinition_in_program58 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_program60 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_CONSTRAINTS_in_program78 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constraintDefinition_in_program80 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_program82 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_DEVICES_in_program100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_deviceDefinition_in_program102 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_program104 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_FUNCTIONS_in_program122 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_functionDefinition_in_program125 = new BitSet(new long[]{0x0000000000000068L});
    public static final BitSet FOLLOW_predicateDefinition_in_program129 = new BitSet(new long[]{0x0000000000000068L});
    public static final BitSet FOLLOW_PROGBLOCK_in_program148 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_functionPredicateBlockDeclaration_in_program150 = new BitSet(new long[]{0x0002000000810498L});
    public static final BitSet FOLLOW_EVENT_in_eventDefinition176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_eventDefinition178 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOUNCEMENT_in_announcementDeclaration201 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_announcementDeclaration203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_announcementDeclaration205 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_announcementDeclaration207 = new BitSet(new long[]{0x0000000000000098L});
    public static final BitSet FOLLOW_variableDeclaration_in_announcementDeclaration209 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRAINT_in_constraintDefinition234 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_constraintDefinition236 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_REQUIRES_in_constraintDefinition239 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_idList_in_constraintDefinition242 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOUNCES_in_constraintDefinition247 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_idList_in_constraintDefinition250 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constraintBlock_in_constraintDefinition254 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONBLOCK_in_constraintBlock276 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constraintBlockDeclaration_in_constraintBlock278 = new BitSet(new long[]{0x0000010600000090L});
    public static final BitSet FOLLOW_ANNOUNCEMENTS_in_constraintBlock282 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_announcementDeclaration_in_constraintBlock284 = new BitSet(new long[]{0x0000008000000008L});
    public static final BitSet FOLLOW_variableDeclaration_in_constraintBlockDeclaration309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicateHeader_in_constraintBlockDeclaration321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionHeader_in_constraintBlockDeclaration333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEVICE_in_deviceDefinition365 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_deviceDefinition367 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ACCEPTS_in_deviceDefinition370 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_idList_in_deviceDefinition373 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_deviceBlock_in_deviceDefinition377 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEVBLOCK_in_deviceBlock399 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_deviceBlockDeclaration_in_deviceBlock401 = new BitSet(new long[]{0x00000000000000F8L});
    public static final BitSet FOLLOW_variableDeclaration_in_deviceBlockDeclaration422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicateDefinition_in_deviceBlockDeclaration434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDefinition_in_deviceBlockDeclaration446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNHEAD_in_functionHeader473 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_functionHeader475 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ARGS_in_functionHeader478 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableList_in_functionHeader480 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_in_functionDefinition503 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_functionDefinition505 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ARGS_in_functionDefinition508 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableList_in_functionDefinition510 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_functionBlock_in_functionDefinition513 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNBLOCK_in_functionBlock541 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RETURN_in_functionBlock543 = new BitSet(new long[]{0x0002000000810498L});
    public static final BitSet FOLLOW_functionPredicateBlockDeclaration_in_functionBlock545 = new BitSet(new long[]{0x0002000000810498L});
    public static final BitSet FOLLOW_variableDeclaration_in_functionPredicateBlockDeclaration568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_functionPredicateBlockDeclaration579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inStatement_in_functionPredicateBlockDeclaration590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_functionPredicateBlockDeclaration602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionPredicateCall_in_functionPredicateBlockDeclaration613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREDHEAD_in_predicateHeader639 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_predicateHeader641 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ARGS_in_predicateHeader644 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableList_in_predicateHeader646 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRED_in_predicateDefinition673 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_predicateDefinition675 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ARGS_in_predicateDefinition678 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableList_in_predicateDefinition680 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_predicateBlock_in_predicateDefinition683 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNBLOCK_in_predicateBlock715 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RETURN_in_predicateBlock718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_predicateBlock720 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_functionPredicateBlockDeclaration_in_predicateBlock723 = new BitSet(new long[]{0x0002000000810498L});
    public static final BitSet FOLLOW_IN_in_inStatement746 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_inStatement748 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_inBlock_in_inStatement750 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INBLOCK_in_inBlock778 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_inBlockDeclaration_in_inBlock780 = new BitSet(new long[]{0x0000000000080208L});
    public static final BitSet FOLLOW_whenStatement_in_inBlockDeclaration799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_everyStatement_in_inBlockDeclaration810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraintFunctionCall_in_inBlockDeclaration821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement840 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_logicalORExpression_in_ifStatement842 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ifBlock_in_ifStatement844 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IFBLOCK_in_ifBlock864 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ifBlockDeclaration_in_ifBlock866 = new BitSet(new long[]{0x0002000000810498L});
    public static final BitSet FOLLOW_ELSEIF_in_ifBlock871 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_elseIfStatement_in_ifBlock873 = new BitSet(new long[]{0x003C000000000008L,0x0000000003000000L});
    public static final BitSet FOLLOW_ELSE_in_ifBlock878 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_elseStatement_in_ifBlock880 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IFBLOCK_in_elseStatement907 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ifBlockDeclaration_in_elseStatement909 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_logicalORExpression_in_elseIfStatement930 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IFBLOCK_in_elseIfStatement933 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ifBlockDeclaration_in_elseIfStatement935 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variableDeclaration_in_ifBlockDeclaration953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_ifBlockDeclaration963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inStatement_in_ifBlockDeclaration974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_ifBlockDeclaration985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionPredicateCall_in_ifBlockDeclaration995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LISTENER_in_whenStatement1015 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARG_in_whenStatement1018 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_whenStatement1020 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVERY_in_whenStatement1024 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COND_in_whenStatement1027 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_67_in_whenStatement1029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_whenStatement1032 = new BitSet(new long[]{0x003C100000000008L,0x0000000003000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_whenStatement1034 = new BitSet(new long[]{0x0000100000000008L});
    public static final BitSet FOLLOW_ID_in_whenStatement1037 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_listenerBlock_in_whenStatement1041 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LISTENER_in_everyStatement1070 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARG_in_everyStatement1073 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_everyStatement1075 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVERY_in_everyStatement1080 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TIME_in_everyStatement1082 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COND_in_everyStatement1086 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_67_in_everyStatement1088 = new BitSet(new long[]{0x003C100000000008L,0x0000000003040000L});
    public static final BitSet FOLLOW_82_in_everyStatement1091 = new BitSet(new long[]{0x003C100000000008L,0x0000000003000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_everyStatement1094 = new BitSet(new long[]{0x0000100000000008L});
    public static final BitSet FOLLOW_ID_in_everyStatement1097 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_listenerBlock_in_everyStatement1101 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LISTENBLOCK_in_listenerBlock1129 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_listenerBlockDeclaration_in_listenerBlock1131 = new BitSet(new long[]{0x0002000000890698L});
    public static final BitSet FOLLOW_constraintFunctionCall_in_listenerBlockDeclaration1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_listenerBlockDeclaration1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_listenerBlockDeclaration1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionPredicateCall_in_listenerBlockDeclaration1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJCALL_in_constraintFunctionCall1213 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_constraintFunctionCall1215 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_constraintFunctionCall1217 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ARGS_in_constraintFunctionCall1220 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_constraintFunctionCall1222 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_functionPredicateCall1258 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_functionPredicateCall1260 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ARGS_in_functionPredicateCall1263 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_functionPredicateCall1265 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_idList1300 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1323 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_expression_in_expressionList1345 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_VARDEF_in_variableDeclaration1378 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_85_in_variableDeclaration1380 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_variableDeclaration1382 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARG_in_variableDeclaration1395 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_85_in_variableDeclaration1397 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_variableDeclaration1399 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARDEF_in_variableDeclaration1412 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPE_in_variableDeclaration1414 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_variableDeclaration1416 = new BitSet(new long[]{0x003C000000000008L,0x0000000003000000L});
    public static final BitSet FOLLOW_initializer_in_variableDeclaration1418 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARG_in_variableDeclaration1432 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPE_in_variableDeclaration1434 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_variableDeclaration1436 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_logicalORExpression_in_initializer1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGNMENT_OPERATOR_in_expression1493 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_logicalORExpression_in_expression1495 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_expression_in_expression1497 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_88_in_logicalORExpression1524 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_87_in_logicalORExpression1526 = new BitSet(new long[]{0x003C000000000008L,0x0000000003000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1529 = new BitSet(new long[]{0x003C000000000008L,0x0000000003000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1531 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_89_in_logicalORExpression1544 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1546 = new BitSet(new long[]{0x003C000000000008L,0x0000000003000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1548 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALITY_OPERATOR_in_logicalORExpression1561 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1563 = new BitSet(new long[]{0x003C000000000008L,0x0000000003000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1565 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RELATIONAL_OPERATOR_in_logicalORExpression1578 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1580 = new BitSet(new long[]{0x003C000000000008L,0x0000000003000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1582 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADDITIVE_OPERATOR_in_logicalORExpression1595 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1597 = new BitSet(new long[]{0x003C000000000008L,0x0000000003000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1599 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MULTIPLICATIVE_OPERATOR_in_logicalORExpression1612 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_logicalORExpression1614 = new BitSet(new long[]{0x003C000000000008L,0x0000000003000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1616 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_primaryExpression1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primaryExpression1644 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_expressionList_in_primaryExpression1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionPredicateCall_in_primaryExpression1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});

}