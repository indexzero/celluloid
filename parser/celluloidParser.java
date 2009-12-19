// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g 2009-12-19 03:06:01

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class celluloidParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VARDEF", "FUNC", "PRED", "ARG", "ARGS", "OBJCALL", "CALL", "PROGRAM", "EVENTS", "CONSTRAINTS", "DEVICES", "FUNCTIONS", "IF", "ELSEIF", "ELSE", "LISTENER", "EVERY", "COND", "RETURN", "IN", "WHEN", "PROGBLOCK", "INBLOCK", "LISTENBLOCK", "IFBLOCK", "FUNBLOCK", "CONBLOCK", "DEVBLOCK", "LANGBLOCK", "FUNHEAD", "PREDHEAD", "EVENT", "CONSTRAINT", "REQUIRES", "ANNOUNCES", "ANNOUNCEMENT", "ANNOUNCEMENTS", "DEVICE", "ACCEPTS", "NEWLINE", "ID", "START", "END", "TIME", "TYPE", "ASSIGNMENT_OPERATOR", "EQUALITY_OPERATOR", "RELATIONAL_OPERATOR", "ADDITIVE_OPERATOR", "MULTIPLICATIVE_OPERATOR", "BOOL", "NUMBER", "STRING", "ESCAPE", "DAY", "HOUR", "MINUTE", "SECOND", "EXPONENT", "WS", "COMMENT", "'event'", "'announce'", "'when'", "'constraint'", "'requires'", "'announces'", "'device'", "'accepts'", "'function'", "'('", "')'", "'predicate'", "'return'", "'in'", "'if'", "'else if'", "'else'", "'unless'", "'every'", "','", "'timeline'", "'='", "'not'", "'or'", "'and'", "'new'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int CONSTRAINTS=13;
    public static final int EXPONENT=62;
    public static final int LISTENBLOCK=27;
    public static final int T__67=67;
    public static final int T__65=65;
    public static final int FUNCTIONS=15;
    public static final int OBJCALL=9;
    public static final int DAY=58;
    public static final int ID=44;
    public static final int EOF=-1;
    public static final int EQUALITY_OPERATOR=50;
    public static final int CONBLOCK=30;
    public static final int LISTENER=19;
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
    public static final int NUMBER=55;
    public static final int BOOL=54;
    public static final int EVERY=20;
    public static final int DEVICES=14;
    public static final int HOUR=59;
    public static final int ADDITIVE_OPERATOR=52;
    public static final int EVENT=35;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int EVENTS=12;
    public static final int T__86=86;
    public static final int RELATIONAL_OPERATOR=51;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int ELSEIF=17;
    public static final int WS=63;
    public static final int T__71=71;
    public static final int REQUIRES=37;
    public static final int T__72=72;
    public static final int NEWLINE=43;
    public static final int T__70=70;
    public static final int PREDHEAD=34;
    public static final int WHEN=24;
    public static final int FUNC=5;
    public static final int ASSIGNMENT_OPERATOR=49;
    public static final int START=45;
    public static final int INBLOCK=26;
    public static final int PROGRAM=11;
    public static final int ANNOUNCES=38;
    public static final int CALL=10;
    public static final int MINUTE=60;
    public static final int END=46;
    public static final int T__76=76;
    public static final int COND=21;
    public static final int T__75=75;
    public static final int CONSTRAINT=36;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int DEVBLOCK=31;
    public static final int T__79=79;
    public static final int STRING=56;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public celluloidParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public celluloidParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[131+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return celluloidParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:61:1: program : (events+= eventDefinition )* ( NEWLINE )* (constraints+= constraintDefinition NEWLINE )* ( NEWLINE )* (devices+= deviceDefinition NEWLINE )* ( NEWLINE )* (functionsPredicates+= functionDefinition | functionsPredicates+= predicateDefinition | NEWLINE )* ( NEWLINE )* (block+= functionPredicateBlockDeclaration )* ( NEWLINE )* -> ^( PROGRAM ^( EVENTS ( $events)* ) ^( CONSTRAINTS ( $constraints)* ) ^( DEVICES ( $devices)* ) ^( FUNCTIONS ( $functionsPredicates)* ) ^( PROGBLOCK ( $block)* ) ) ;
    public final celluloidParser.program_return program() throws RecognitionException {
        celluloidParser.program_return retval = new celluloidParser.program_return();
        retval.start = input.LT(1);
        int program_StartIndex = input.index();
        Object root_0 = null;

        Token NEWLINE1=null;
        Token NEWLINE2=null;
        Token NEWLINE3=null;
        Token NEWLINE4=null;
        Token NEWLINE5=null;
        Token NEWLINE6=null;
        Token NEWLINE7=null;
        Token NEWLINE8=null;
        List list_events=null;
        List list_constraints=null;
        List list_devices=null;
        List list_functionsPredicates=null;
        List list_block=null;
        RuleReturnScope events = null;
        RuleReturnScope constraints = null;
        RuleReturnScope devices = null;
        RuleReturnScope functionsPredicates = null;
        RuleReturnScope block = null;
        Object NEWLINE1_tree=null;
        Object NEWLINE2_tree=null;
        Object NEWLINE3_tree=null;
        Object NEWLINE4_tree=null;
        Object NEWLINE5_tree=null;
        Object NEWLINE6_tree=null;
        Object NEWLINE7_tree=null;
        Object NEWLINE8_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_functionPredicateBlockDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule functionPredicateBlockDeclaration");
        RewriteRuleSubtreeStream stream_functionDefinition=new RewriteRuleSubtreeStream(adaptor,"rule functionDefinition");
        RewriteRuleSubtreeStream stream_predicateDefinition=new RewriteRuleSubtreeStream(adaptor,"rule predicateDefinition");
        RewriteRuleSubtreeStream stream_deviceDefinition=new RewriteRuleSubtreeStream(adaptor,"rule deviceDefinition");
        RewriteRuleSubtreeStream stream_constraintDefinition=new RewriteRuleSubtreeStream(adaptor,"rule constraintDefinition");
        RewriteRuleSubtreeStream stream_eventDefinition=new RewriteRuleSubtreeStream(adaptor,"rule eventDefinition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:62:5: ( (events+= eventDefinition )* ( NEWLINE )* (constraints+= constraintDefinition NEWLINE )* ( NEWLINE )* (devices+= deviceDefinition NEWLINE )* ( NEWLINE )* (functionsPredicates+= functionDefinition | functionsPredicates+= predicateDefinition | NEWLINE )* ( NEWLINE )* (block+= functionPredicateBlockDeclaration )* ( NEWLINE )* -> ^( PROGRAM ^( EVENTS ( $events)* ) ^( CONSTRAINTS ( $constraints)* ) ^( DEVICES ( $devices)* ) ^( FUNCTIONS ( $functionsPredicates)* ) ^( PROGBLOCK ( $block)* ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:62:10: (events+= eventDefinition )* ( NEWLINE )* (constraints+= constraintDefinition NEWLINE )* ( NEWLINE )* (devices+= deviceDefinition NEWLINE )* ( NEWLINE )* (functionsPredicates+= functionDefinition | functionsPredicates+= predicateDefinition | NEWLINE )* ( NEWLINE )* (block+= functionPredicateBlockDeclaration )* ( NEWLINE )*
            {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:62:10: (events+= eventDefinition )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==65) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:62:11: events+= eventDefinition
            	    {
            	    pushFollow(FOLLOW_eventDefinition_in_program287);
            	    events=eventDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_eventDefinition.add(events.getTree());
            	    if (list_events==null) list_events=new ArrayList();
            	    list_events.add(events.getTree());


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:63:10: ( NEWLINE )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NEWLINE) ) {
                    int LA2_2 = input.LA(2);

                    if ( (synpred2_celluloid()) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: NEWLINE
            	    {
            	    NEWLINE1=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_program301); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE1);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:64:10: (constraints+= constraintDefinition NEWLINE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==68) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:64:11: constraints+= constraintDefinition NEWLINE
            	    {
            	    pushFollow(FOLLOW_constraintDefinition_in_program318);
            	    constraints=constraintDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_constraintDefinition.add(constraints.getTree());
            	    if (list_constraints==null) list_constraints=new ArrayList();
            	    list_constraints.add(constraints.getTree());

            	    NEWLINE2=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_program320); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE2);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:65:10: ( NEWLINE )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NEWLINE) ) {
                    int LA4_2 = input.LA(2);

                    if ( (synpred4_celluloid()) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: NEWLINE
            	    {
            	    NEWLINE3=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_program333); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE3);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:66:10: (devices+= deviceDefinition NEWLINE )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==71) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:66:11: devices+= deviceDefinition NEWLINE
            	    {
            	    pushFollow(FOLLOW_deviceDefinition_in_program351);
            	    devices=deviceDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_deviceDefinition.add(devices.getTree());
            	    if (list_devices==null) list_devices=new ArrayList();
            	    list_devices.add(devices.getTree());

            	    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_program353); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE4);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:67:10: ( NEWLINE )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==NEWLINE) ) {
                    int LA6_2 = input.LA(2);

                    if ( (synpred6_celluloid()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: NEWLINE
            	    {
            	    NEWLINE5=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_program366); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE5);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:68:10: (functionsPredicates+= functionDefinition | functionsPredicates+= predicateDefinition | NEWLINE )*
            loop7:
            do {
                int alt7=4;
                switch ( input.LA(1) ) {
                case NEWLINE:
                    {
                    int LA7_1 = input.LA(2);

                    if ( (synpred9_celluloid()) ) {
                        alt7=3;
                    }


                    }
                    break;
                case 73:
                    {
                    alt7=1;
                    }
                    break;
                case 76:
                    {
                    alt7=2;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:68:11: functionsPredicates+= functionDefinition
            	    {
            	    pushFollow(FOLLOW_functionDefinition_in_program383);
            	    functionsPredicates=functionDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_functionDefinition.add(functionsPredicates.getTree());
            	    if (list_functionsPredicates==null) list_functionsPredicates=new ArrayList();
            	    list_functionsPredicates.add(functionsPredicates.getTree());


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:69:13: functionsPredicates+= predicateDefinition
            	    {
            	    pushFollow(FOLLOW_predicateDefinition_in_program402);
            	    functionsPredicates=predicateDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_predicateDefinition.add(functionsPredicates.getTree());
            	    if (list_functionsPredicates==null) list_functionsPredicates=new ArrayList();
            	    list_functionsPredicates.add(functionsPredicates.getTree());


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:70:13: NEWLINE
            	    {
            	    NEWLINE6=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_program416); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE6);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:71:10: ( NEWLINE )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==NEWLINE) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred10_celluloid()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: NEWLINE
            	    {
            	    NEWLINE7=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_program429); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE7);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:72:10: (block+= functionPredicateBlockDeclaration )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ID||(LA9_0>=TIME && LA9_0<=TYPE)||(LA9_0>=BOOL && LA9_0<=STRING)||(LA9_0>=78 && LA9_0<=79)||LA9_0==85||LA9_0==87||LA9_0==90) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:72:11: block+= functionPredicateBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_functionPredicateBlockDeclaration_in_program446);
            	    block=functionPredicateBlockDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_functionPredicateBlockDeclaration.add(block.getTree());
            	    if (list_block==null) list_block=new ArrayList();
            	    list_block.add(block.getTree());


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:73:10: ( NEWLINE )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==NEWLINE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: NEWLINE
            	    {
            	    NEWLINE8=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_program459); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE8);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);



            // AST REWRITE
            // elements: functionsPredicates, devices, block, events, constraints
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: functionsPredicates, events, constraints, block, devices
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_functionsPredicates=new RewriteRuleSubtreeStream(adaptor,"token functionsPredicates",list_functionsPredicates);
            RewriteRuleSubtreeStream stream_events=new RewriteRuleSubtreeStream(adaptor,"token events",list_events);
            RewriteRuleSubtreeStream stream_constraints=new RewriteRuleSubtreeStream(adaptor,"token constraints",list_constraints);
            RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"token block",list_block);
            RewriteRuleSubtreeStream stream_devices=new RewriteRuleSubtreeStream(adaptor,"token devices",list_devices);
            root_0 = (Object)adaptor.nil();
            // 74:10: -> ^( PROGRAM ^( EVENTS ( $events)* ) ^( CONSTRAINTS ( $constraints)* ) ^( DEVICES ( $devices)* ) ^( FUNCTIONS ( $functionsPredicates)* ) ^( PROGBLOCK ( $block)* ) )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:74:13: ^( PROGRAM ^( EVENTS ( $events)* ) ^( CONSTRAINTS ( $constraints)* ) ^( DEVICES ( $devices)* ) ^( FUNCTIONS ( $functionsPredicates)* ) ^( PROGBLOCK ( $block)* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:75:17: ^( EVENTS ( $events)* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EVENTS, "EVENTS"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:75:26: ( $events)*
                while ( stream_events.hasNext() ) {
                    adaptor.addChild(root_2, stream_events.nextTree());

                }
                stream_events.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:76:17: ^( CONSTRAINTS ( $constraints)* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:76:31: ( $constraints)*
                while ( stream_constraints.hasNext() ) {
                    adaptor.addChild(root_2, stream_constraints.nextTree());

                }
                stream_constraints.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:77:17: ^( DEVICES ( $devices)* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEVICES, "DEVICES"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:77:27: ( $devices)*
                while ( stream_devices.hasNext() ) {
                    adaptor.addChild(root_2, stream_devices.nextTree());

                }
                stream_devices.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:78:17: ^( FUNCTIONS ( $functionsPredicates)* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTIONS, "FUNCTIONS"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:78:29: ( $functionsPredicates)*
                while ( stream_functionsPredicates.hasNext() ) {
                    adaptor.addChild(root_2, stream_functionsPredicates.nextTree());

                }
                stream_functionsPredicates.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:79:17: ^( PROGBLOCK ( $block)* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGBLOCK, "PROGBLOCK"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:79:29: ( $block)*
                while ( stream_block.hasNext() ) {
                    adaptor.addChild(root_2, stream_block.nextTree());

                }
                stream_block.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, program_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class eventDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eventDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:84:1: eventDefinition : 'event' ID NEWLINE -> ^( EVENT ID ) ;
    public final celluloidParser.eventDefinition_return eventDefinition() throws RecognitionException {
        celluloidParser.eventDefinition_return retval = new celluloidParser.eventDefinition_return();
        retval.start = input.LT(1);
        int eventDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal9=null;
        Token ID10=null;
        Token NEWLINE11=null;

        Object string_literal9_tree=null;
        Object ID10_tree=null;
        Object NEWLINE11_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:85:5: ( 'event' ID NEWLINE -> ^( EVENT ID ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:85:10: 'event' ID NEWLINE
            {
            string_literal9=(Token)match(input,65,FOLLOW_65_in_eventDefinition619); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_65.add(string_literal9);

            ID10=(Token)match(input,ID,FOLLOW_ID_in_eventDefinition621); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID10);

            NEWLINE11=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_eventDefinition623); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE11);



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

            root_0 = (Object)adaptor.nil();
            // 86:10: -> ^( EVENT ID )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:86:13: ^( EVENT ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EVENT, "EVENT"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, eventDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "eventDefinition"

    public static class announcementDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "announcementDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:92:1: announcementDeclaration : 'announce' eventName= ID 'when' functionName= ID (predicateExpr= variableDeclaration )? NEWLINE -> ^( ANNOUNCEMENT $eventName $functionName ( $predicateExpr)? ) ;
    public final celluloidParser.announcementDeclaration_return announcementDeclaration() throws RecognitionException {
        celluloidParser.announcementDeclaration_return retval = new celluloidParser.announcementDeclaration_return();
        retval.start = input.LT(1);
        int announcementDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token eventName=null;
        Token functionName=null;
        Token string_literal12=null;
        Token string_literal13=null;
        Token NEWLINE14=null;
        celluloidParser.variableDeclaration_return predicateExpr = null;


        Object eventName_tree=null;
        Object functionName_tree=null;
        Object string_literal12_tree=null;
        Object string_literal13_tree=null;
        Object NEWLINE14_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:93:5: ( 'announce' eventName= ID 'when' functionName= ID (predicateExpr= variableDeclaration )? NEWLINE -> ^( ANNOUNCEMENT $eventName $functionName ( $predicateExpr)? ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:94:10: 'announce' eventName= ID 'when' functionName= ID (predicateExpr= variableDeclaration )? NEWLINE
            {
            string_literal12=(Token)match(input,66,FOLLOW_66_in_announcementDeclaration682); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(string_literal12);

            eventName=(Token)match(input,ID,FOLLOW_ID_in_announcementDeclaration688); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(eventName);

            string_literal13=(Token)match(input,67,FOLLOW_67_in_announcementDeclaration690); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(string_literal13);

            functionName=(Token)match(input,ID,FOLLOW_ID_in_announcementDeclaration696); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(functionName);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:94:61: (predicateExpr= variableDeclaration )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==TYPE||LA11_0==85) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:94:62: predicateExpr= variableDeclaration
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_announcementDeclaration703);
                    predicateExpr=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(predicateExpr.getTree());

                    }
                    break;

            }

            NEWLINE14=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_announcementDeclaration707); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE14);



            // AST REWRITE
            // elements: eventName, predicateExpr, functionName
            // token labels: eventName, functionName
            // rule labels: retval, predicateExpr
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_eventName=new RewriteRuleTokenStream(adaptor,"token eventName",eventName);
            RewriteRuleTokenStream stream_functionName=new RewriteRuleTokenStream(adaptor,"token functionName",functionName);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_predicateExpr=new RewriteRuleSubtreeStream(adaptor,"rule predicateExpr",predicateExpr!=null?predicateExpr.tree:null);

            root_0 = (Object)adaptor.nil();
            // 95:10: -> ^( ANNOUNCEMENT $eventName $functionName ( $predicateExpr)? )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:95:13: ^( ANNOUNCEMENT $eventName $functionName ( $predicateExpr)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ANNOUNCEMENT, "ANNOUNCEMENT"), root_1);

                adaptor.addChild(root_1, stream_eventName.nextNode());
                adaptor.addChild(root_1, stream_functionName.nextNode());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:95:53: ( $predicateExpr)?
                if ( stream_predicateExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_predicateExpr.nextTree());

                }
                stream_predicateExpr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, announcementDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "announcementDeclaration"

    public static class constraintDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constraintDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:100:1: constraintDefinition : 'constraint' ID ( 'requires' requires= idList )? ( 'announces' announces= idList )? constraintBlock -> ^( CONSTRAINT ID ^( REQUIRES ( $requires)? ) ^( ANNOUNCES ( $announces)? ) constraintBlock ) ;
    public final celluloidParser.constraintDefinition_return constraintDefinition() throws RecognitionException {
        celluloidParser.constraintDefinition_return retval = new celluloidParser.constraintDefinition_return();
        retval.start = input.LT(1);
        int constraintDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal15=null;
        Token ID16=null;
        Token string_literal17=null;
        Token string_literal18=null;
        celluloidParser.idList_return requires = null;

        celluloidParser.idList_return announces = null;

        celluloidParser.constraintBlock_return constraintBlock19 = null;


        Object string_literal15_tree=null;
        Object ID16_tree=null;
        Object string_literal17_tree=null;
        Object string_literal18_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_constraintBlock=new RewriteRuleSubtreeStream(adaptor,"rule constraintBlock");
        RewriteRuleSubtreeStream stream_idList=new RewriteRuleSubtreeStream(adaptor,"rule idList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:101:5: ( 'constraint' ID ( 'requires' requires= idList )? ( 'announces' announces= idList )? constraintBlock -> ^( CONSTRAINT ID ^( REQUIRES ( $requires)? ) ^( ANNOUNCES ( $announces)? ) constraintBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:101:10: 'constraint' ID ( 'requires' requires= idList )? ( 'announces' announces= idList )? constraintBlock
            {
            string_literal15=(Token)match(input,68,FOLLOW_68_in_constraintDefinition755); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_68.add(string_literal15);

            ID16=(Token)match(input,ID,FOLLOW_ID_in_constraintDefinition757); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID16);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:101:26: ( 'requires' requires= idList )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==69) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:101:27: 'requires' requires= idList
                    {
                    string_literal17=(Token)match(input,69,FOLLOW_69_in_constraintDefinition760); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_69.add(string_literal17);

                    pushFollow(FOLLOW_idList_in_constraintDefinition766);
                    requires=idList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_idList.add(requires.getTree());

                    }
                    break;

            }

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:102:10: ( 'announces' announces= idList )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==70) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:102:11: 'announces' announces= idList
                    {
                    string_literal18=(Token)match(input,70,FOLLOW_70_in_constraintDefinition780); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_70.add(string_literal18);

                    pushFollow(FOLLOW_idList_in_constraintDefinition786);
                    announces=idList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_idList.add(announces.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_constraintBlock_in_constraintDefinition800);
            constraintBlock19=constraintBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_constraintBlock.add(constraintBlock19.getTree());


            // AST REWRITE
            // elements: announces, requires, constraintBlock, ID
            // token labels: 
            // rule labels: retval, announces, requires
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_announces=new RewriteRuleSubtreeStream(adaptor,"rule announces",announces!=null?announces.tree:null);
            RewriteRuleSubtreeStream stream_requires=new RewriteRuleSubtreeStream(adaptor,"rule requires",requires!=null?requires.tree:null);

            root_0 = (Object)adaptor.nil();
            // 104:10: -> ^( CONSTRAINT ID ^( REQUIRES ( $requires)? ) ^( ANNOUNCES ( $announces)? ) constraintBlock )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:104:13: ^( CONSTRAINT ID ^( REQUIRES ( $requires)? ) ^( ANNOUNCES ( $announces)? ) constraintBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINT, "CONSTRAINT"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:104:29: ^( REQUIRES ( $requires)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(REQUIRES, "REQUIRES"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:104:40: ( $requires)?
                if ( stream_requires.hasNext() ) {
                    adaptor.addChild(root_2, stream_requires.nextTree());

                }
                stream_requires.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:104:52: ^( ANNOUNCES ( $announces)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ANNOUNCES, "ANNOUNCES"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:104:64: ( $announces)?
                if ( stream_announces.hasNext() ) {
                    adaptor.addChild(root_2, stream_announces.nextTree());

                }
                stream_announces.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_constraintBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, constraintDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constraintDefinition"

    public static class constraintBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constraintBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:109:1: constraintBlock : START (block+= constraintBlockDeclaration | announcements+= announcementDeclaration )* END -> ^( CONBLOCK ( $block)* ^( ANNOUNCEMENTS ( $announcements)* ) ) ;
    public final celluloidParser.constraintBlock_return constraintBlock() throws RecognitionException {
        celluloidParser.constraintBlock_return retval = new celluloidParser.constraintBlock_return();
        retval.start = input.LT(1);
        int constraintBlock_StartIndex = input.index();
        Object root_0 = null;

        Token START20=null;
        Token END21=null;
        List list_block=null;
        List list_announcements=null;
        RuleReturnScope block = null;
        RuleReturnScope announcements = null;
        Object START20_tree=null;
        Object END21_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_announcementDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule announcementDeclaration");
        RewriteRuleSubtreeStream stream_constraintBlockDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule constraintBlockDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:110:5: ( START (block+= constraintBlockDeclaration | announcements+= announcementDeclaration )* END -> ^( CONBLOCK ( $block)* ^( ANNOUNCEMENTS ( $announcements)* ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:110:10: START (block+= constraintBlockDeclaration | announcements+= announcementDeclaration )* END
            {
            START20=(Token)match(input,START,FOLLOW_START_in_constraintBlock888); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START20);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:111:14: (block+= constraintBlockDeclaration | announcements+= announcementDeclaration )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==TYPE||LA14_0==73||LA14_0==76||LA14_0==85) ) {
                    alt14=1;
                }
                else if ( (LA14_0==66) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:111:15: block+= constraintBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_constraintBlockDeclaration_in_constraintBlock909);
            	    block=constraintBlockDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_constraintBlockDeclaration.add(block.getTree());
            	    if (list_block==null) list_block=new ArrayList();
            	    list_block.add(block.getTree());


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:111:53: announcements+= announcementDeclaration
            	    {
            	    pushFollow(FOLLOW_announcementDeclaration_in_constraintBlock917);
            	    announcements=announcementDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_announcementDeclaration.add(announcements.getTree());
            	    if (list_announcements==null) list_announcements=new ArrayList();
            	    list_announcements.add(announcements.getTree());


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            END21=(Token)match(input,END,FOLLOW_END_in_constraintBlock930); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END21);



            // AST REWRITE
            // elements: announcements, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: announcements, block
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_announcements=new RewriteRuleSubtreeStream(adaptor,"token announcements",list_announcements);
            RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"token block",list_block);
            root_0 = (Object)adaptor.nil();
            // 113:10: -> ^( CONBLOCK ( $block)* ^( ANNOUNCEMENTS ( $announcements)* ) )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:113:13: ^( CONBLOCK ( $block)* ^( ANNOUNCEMENTS ( $announcements)* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONBLOCK, "CONBLOCK"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:113:24: ( $block)*
                while ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:113:32: ^( ANNOUNCEMENTS ( $announcements)* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ANNOUNCEMENTS, "ANNOUNCEMENTS"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:113:48: ( $announcements)*
                while ( stream_announcements.hasNext() ) {
                    adaptor.addChild(root_2, stream_announcements.nextTree());

                }
                stream_announcements.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, constraintBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constraintBlock"

    public static class constraintBlockDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constraintBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:115:1: constraintBlockDeclaration : ( variableDeclaration | predicateHeader | functionHeader );
    public final celluloidParser.constraintBlockDeclaration_return constraintBlockDeclaration() throws RecognitionException {
        celluloidParser.constraintBlockDeclaration_return retval = new celluloidParser.constraintBlockDeclaration_return();
        retval.start = input.LT(1);
        int constraintBlockDeclaration_StartIndex = input.index();
        Object root_0 = null;

        celluloidParser.variableDeclaration_return variableDeclaration22 = null;

        celluloidParser.predicateHeader_return predicateHeader23 = null;

        celluloidParser.functionHeader_return functionHeader24 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:116:5: ( variableDeclaration | predicateHeader | functionHeader )
            int alt15=3;
            switch ( input.LA(1) ) {
            case TYPE:
            case 85:
                {
                alt15=1;
                }
                break;
            case 76:
                {
                alt15=2;
                }
                break;
            case 73:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:116:7: variableDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableDeclaration_in_constraintBlockDeclaration975);
                    variableDeclaration22=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration22.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:117:9: predicateHeader
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_predicateHeader_in_constraintBlockDeclaration986);
                    predicateHeader23=predicateHeader();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, predicateHeader23.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:118:9: functionHeader
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionHeader_in_constraintBlockDeclaration997);
                    functionHeader24=functionHeader();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionHeader24.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, constraintBlockDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constraintBlockDeclaration"

    public static class deviceDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "deviceDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:123:1: deviceDefinition : 'device' ID ( 'accepts' accepts= idList )? deviceBlock -> ^( DEVICE ID ^( ACCEPTS ( $accepts)? ) deviceBlock ) ;
    public final celluloidParser.deviceDefinition_return deviceDefinition() throws RecognitionException {
        celluloidParser.deviceDefinition_return retval = new celluloidParser.deviceDefinition_return();
        retval.start = input.LT(1);
        int deviceDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal25=null;
        Token ID26=null;
        Token string_literal27=null;
        celluloidParser.idList_return accepts = null;

        celluloidParser.deviceBlock_return deviceBlock28 = null;


        Object string_literal25_tree=null;
        Object ID26_tree=null;
        Object string_literal27_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_idList=new RewriteRuleSubtreeStream(adaptor,"rule idList");
        RewriteRuleSubtreeStream stream_deviceBlock=new RewriteRuleSubtreeStream(adaptor,"rule deviceBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:124:5: ( 'device' ID ( 'accepts' accepts= idList )? deviceBlock -> ^( DEVICE ID ^( ACCEPTS ( $accepts)? ) deviceBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:124:10: 'device' ID ( 'accepts' accepts= idList )? deviceBlock
            {
            string_literal25=(Token)match(input,71,FOLLOW_71_in_deviceDefinition1030); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_71.add(string_literal25);

            ID26=(Token)match(input,ID,FOLLOW_ID_in_deviceDefinition1032); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID26);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:124:22: ( 'accepts' accepts= idList )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==72) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:124:23: 'accepts' accepts= idList
                    {
                    string_literal27=(Token)match(input,72,FOLLOW_72_in_deviceDefinition1035); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_72.add(string_literal27);

                    pushFollow(FOLLOW_idList_in_deviceDefinition1041);
                    accepts=idList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_idList.add(accepts.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_deviceBlock_in_deviceDefinition1045);
            deviceBlock28=deviceBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_deviceBlock.add(deviceBlock28.getTree());


            // AST REWRITE
            // elements: deviceBlock, ID, accepts
            // token labels: 
            // rule labels: retval, accepts
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_accepts=new RewriteRuleSubtreeStream(adaptor,"rule accepts",accepts!=null?accepts.tree:null);

            root_0 = (Object)adaptor.nil();
            // 125:10: -> ^( DEVICE ID ^( ACCEPTS ( $accepts)? ) deviceBlock )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:125:13: ^( DEVICE ID ^( ACCEPTS ( $accepts)? ) deviceBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEVICE, "DEVICE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:125:25: ^( ACCEPTS ( $accepts)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ACCEPTS, "ACCEPTS"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:125:35: ( $accepts)?
                if ( stream_accepts.hasNext() ) {
                    adaptor.addChild(root_2, stream_accepts.nextTree());

                }
                stream_accepts.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_deviceBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, deviceDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "deviceDefinition"

    public static class deviceBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "deviceBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:128:1: deviceBlock : START (block+= deviceBlockDeclaration )* END -> ^( DEVBLOCK ( $block)* ) ;
    public final celluloidParser.deviceBlock_return deviceBlock() throws RecognitionException {
        celluloidParser.deviceBlock_return retval = new celluloidParser.deviceBlock_return();
        retval.start = input.LT(1);
        int deviceBlock_StartIndex = input.index();
        Object root_0 = null;

        Token START29=null;
        Token END30=null;
        List list_block=null;
        RuleReturnScope block = null;
        Object START29_tree=null;
        Object END30_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_deviceBlockDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule deviceBlockDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:129:5: ( START (block+= deviceBlockDeclaration )* END -> ^( DEVBLOCK ( $block)* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:129:10: START (block+= deviceBlockDeclaration )* END
            {
            START29=(Token)match(input,START,FOLLOW_START_in_deviceBlock1102); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START29);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:130:15: (block+= deviceBlockDeclaration )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==TYPE||LA17_0==73||LA17_0==76||LA17_0==85) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:130:16: block+= deviceBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_deviceBlockDeclaration_in_deviceBlock1124);
            	    block=deviceBlockDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_deviceBlockDeclaration.add(block.getTree());
            	    if (list_block==null) list_block=new ArrayList();
            	    list_block.add(block.getTree());


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            END30=(Token)match(input,END,FOLLOW_END_in_deviceBlock1137); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END30);



            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: block
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"token block",list_block);
            root_0 = (Object)adaptor.nil();
            // 132:10: -> ^( DEVBLOCK ( $block)* )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:132:13: ^( DEVBLOCK ( $block)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEVBLOCK, "DEVBLOCK"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:132:24: ( $block)*
                while ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, deviceBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "deviceBlock"

    public static class deviceBlockDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "deviceBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:134:1: deviceBlockDeclaration : ( variableDeclaration | predicateDefinition | functionDefinition );
    public final celluloidParser.deviceBlockDeclaration_return deviceBlockDeclaration() throws RecognitionException {
        celluloidParser.deviceBlockDeclaration_return retval = new celluloidParser.deviceBlockDeclaration_return();
        retval.start = input.LT(1);
        int deviceBlockDeclaration_StartIndex = input.index();
        Object root_0 = null;

        celluloidParser.variableDeclaration_return variableDeclaration31 = null;

        celluloidParser.predicateDefinition_return predicateDefinition32 = null;

        celluloidParser.functionDefinition_return functionDefinition33 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:135:5: ( variableDeclaration | predicateDefinition | functionDefinition )
            int alt18=3;
            switch ( input.LA(1) ) {
            case TYPE:
            case 85:
                {
                alt18=1;
                }
                break;
            case 76:
                {
                alt18=2;
                }
                break;
            case 73:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:135:10: variableDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableDeclaration_in_deviceBlockDeclaration1176);
                    variableDeclaration31=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration31.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:136:10: predicateDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_predicateDefinition_in_deviceBlockDeclaration1188);
                    predicateDefinition32=predicateDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, predicateDefinition32.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:137:10: functionDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionDefinition_in_deviceBlockDeclaration1200);
                    functionDefinition33=functionDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDefinition33.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, deviceBlockDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "deviceBlockDeclaration"

    public static class functionHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionHeader"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:143:1: functionHeader : 'function' ID '(' variableList ')' NEWLINE -> ^( FUNHEAD ID ^( ARGS variableList ) ) ;
    public final celluloidParser.functionHeader_return functionHeader() throws RecognitionException {
        celluloidParser.functionHeader_return retval = new celluloidParser.functionHeader_return();
        retval.start = input.LT(1);
        int functionHeader_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal34=null;
        Token ID35=null;
        Token char_literal36=null;
        Token char_literal38=null;
        Token NEWLINE39=null;
        celluloidParser.variableList_return variableList37 = null;


        Object string_literal34_tree=null;
        Object ID35_tree=null;
        Object char_literal36_tree=null;
        Object char_literal38_tree=null;
        Object NEWLINE39_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_variableList=new RewriteRuleSubtreeStream(adaptor,"rule variableList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:144:5: ( 'function' ID '(' variableList ')' NEWLINE -> ^( FUNHEAD ID ^( ARGS variableList ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:144:10: 'function' ID '(' variableList ')' NEWLINE
            {
            string_literal34=(Token)match(input,73,FOLLOW_73_in_functionHeader1223); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_73.add(string_literal34);

            ID35=(Token)match(input,ID,FOLLOW_ID_in_functionHeader1225); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID35);

            char_literal36=(Token)match(input,74,FOLLOW_74_in_functionHeader1227); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_74.add(char_literal36);

            pushFollow(FOLLOW_variableList_in_functionHeader1229);
            variableList37=variableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableList.add(variableList37.getTree());
            char_literal38=(Token)match(input,75,FOLLOW_75_in_functionHeader1231); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_75.add(char_literal38);

            NEWLINE39=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_functionHeader1233); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE39);



            // AST REWRITE
            // elements: ID, variableList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 145:10: -> ^( FUNHEAD ID ^( ARGS variableList ) )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:145:13: ^( FUNHEAD ID ^( ARGS variableList ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNHEAD, "FUNHEAD"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:145:26: ^( ARGS variableList )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_2);

                adaptor.addChild(root_2, stream_variableList.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, functionHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionHeader"

    public static class functionDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:147:1: functionDefinition : 'function' ID '(' variableList ')' functionBlock -> ^( FUNC ID ^( ARGS variableList ) ( functionBlock )? ) ;
    public final celluloidParser.functionDefinition_return functionDefinition() throws RecognitionException {
        celluloidParser.functionDefinition_return retval = new celluloidParser.functionDefinition_return();
        retval.start = input.LT(1);
        int functionDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal40=null;
        Token ID41=null;
        Token char_literal42=null;
        Token char_literal44=null;
        celluloidParser.variableList_return variableList43 = null;

        celluloidParser.functionBlock_return functionBlock45 = null;


        Object string_literal40_tree=null;
        Object ID41_tree=null;
        Object char_literal42_tree=null;
        Object char_literal44_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_variableList=new RewriteRuleSubtreeStream(adaptor,"rule variableList");
        RewriteRuleSubtreeStream stream_functionBlock=new RewriteRuleSubtreeStream(adaptor,"rule functionBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:148:5: ( 'function' ID '(' variableList ')' functionBlock -> ^( FUNC ID ^( ARGS variableList ) ( functionBlock )? ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:148:10: 'function' ID '(' variableList ')' functionBlock
            {
            string_literal40=(Token)match(input,73,FOLLOW_73_in_functionDefinition1276); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_73.add(string_literal40);

            ID41=(Token)match(input,ID,FOLLOW_ID_in_functionDefinition1278); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID41);

            char_literal42=(Token)match(input,74,FOLLOW_74_in_functionDefinition1280); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_74.add(char_literal42);

            pushFollow(FOLLOW_variableList_in_functionDefinition1282);
            variableList43=variableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableList.add(variableList43.getTree());
            char_literal44=(Token)match(input,75,FOLLOW_75_in_functionDefinition1284); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_75.add(char_literal44);

            pushFollow(FOLLOW_functionBlock_in_functionDefinition1286);
            functionBlock45=functionBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionBlock.add(functionBlock45.getTree());


            // AST REWRITE
            // elements: functionBlock, variableList, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 149:10: -> ^( FUNC ID ^( ARGS variableList ) ( functionBlock )? )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:149:13: ^( FUNC ID ^( ARGS variableList ) ( functionBlock )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC, "FUNC"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:149:23: ^( ARGS variableList )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_2);

                adaptor.addChild(root_2, stream_variableList.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:149:44: ( functionBlock )?
                if ( stream_functionBlock.hasNext() ) {
                    adaptor.addChild(root_1, stream_functionBlock.nextTree());

                }
                stream_functionBlock.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, functionDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionDefinition"

    public static class functionBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:152:1: functionBlock : START (block+= functionPredicateBlockDeclaration | NEWLINE )* END -> ^( FUNBLOCK[$START, \"FUNCBLOCK\"] RETURN ( $block)* ) ;
    public final celluloidParser.functionBlock_return functionBlock() throws RecognitionException {
        celluloidParser.functionBlock_return retval = new celluloidParser.functionBlock_return();
        retval.start = input.LT(1);
        int functionBlock_StartIndex = input.index();
        Object root_0 = null;

        Token START46=null;
        Token NEWLINE47=null;
        Token END48=null;
        List list_block=null;
        RuleReturnScope block = null;
        Object START46_tree=null;
        Object NEWLINE47_tree=null;
        Object END48_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_functionPredicateBlockDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule functionPredicateBlockDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:153:5: ( START (block+= functionPredicateBlockDeclaration | NEWLINE )* END -> ^( FUNBLOCK[$START, \"FUNCBLOCK\"] RETURN ( $block)* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:153:10: START (block+= functionPredicateBlockDeclaration | NEWLINE )* END
            {
            START46=(Token)match(input,START,FOLLOW_START_in_functionBlock1348); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START46);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:154:12: (block+= functionPredicateBlockDeclaration | NEWLINE )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==ID||(LA19_0>=TIME && LA19_0<=TYPE)||(LA19_0>=BOOL && LA19_0<=STRING)||(LA19_0>=78 && LA19_0<=79)||LA19_0==85||LA19_0==87||LA19_0==90) ) {
                    alt19=1;
                }
                else if ( (LA19_0==NEWLINE) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:154:14: block+= functionPredicateBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_functionPredicateBlockDeclaration_in_functionBlock1368);
            	    block=functionPredicateBlockDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_functionPredicateBlockDeclaration.add(block.getTree());
            	    if (list_block==null) list_block=new ArrayList();
            	    list_block.add(block.getTree());


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:154:59: NEWLINE
            	    {
            	    NEWLINE47=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_functionBlock1372); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE47);


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            END48=(Token)match(input,END,FOLLOW_END_in_functionBlock1387); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END48);



            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: block
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"token block",list_block);
            root_0 = (Object)adaptor.nil();
            // 156:10: -> ^( FUNBLOCK[$START, \"FUNCBLOCK\"] RETURN ( $block)* )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:156:13: ^( FUNBLOCK[$START, \"FUNCBLOCK\"] RETURN ( $block)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNBLOCK, START46, "FUNCBLOCK"), root_1);

                adaptor.addChild(root_1, (Object)adaptor.create(RETURN, "RETURN"));
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:156:52: ( $block)*
                while ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, functionBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionBlock"

    public static class functionPredicateBlockDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionPredicateBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:161:1: functionPredicateBlockDeclaration : ( variableDeclaration | expression | inStatement | ifStatement | functionPredicateCall );
    public final celluloidParser.functionPredicateBlockDeclaration_return functionPredicateBlockDeclaration() throws RecognitionException {
        celluloidParser.functionPredicateBlockDeclaration_return retval = new celluloidParser.functionPredicateBlockDeclaration_return();
        retval.start = input.LT(1);
        int functionPredicateBlockDeclaration_StartIndex = input.index();
        Object root_0 = null;

        celluloidParser.variableDeclaration_return variableDeclaration49 = null;

        celluloidParser.expression_return expression50 = null;

        celluloidParser.inStatement_return inStatement51 = null;

        celluloidParser.ifStatement_return ifStatement52 = null;

        celluloidParser.functionPredicateCall_return functionPredicateCall53 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:162:5: ( variableDeclaration | expression | inStatement | ifStatement | functionPredicateCall )
            int alt20=5;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:162:10: variableDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableDeclaration_in_functionPredicateBlockDeclaration1461);
                    variableDeclaration49=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration49.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:163:10: expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_functionPredicateBlockDeclaration1472);
                    expression50=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression50.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:164:10: inStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_inStatement_in_functionPredicateBlockDeclaration1483);
                    inStatement51=inStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inStatement51.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:165:10: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_functionPredicateBlockDeclaration1495);
                    ifStatement52=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement52.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:166:10: functionPredicateCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionPredicateCall_in_functionPredicateBlockDeclaration1506);
                    functionPredicateCall53=functionPredicateCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionPredicateCall53.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, functionPredicateBlockDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionPredicateBlockDeclaration"

    public static class predicateHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predicateHeader"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:171:1: predicateHeader : 'predicate' ID '(' variableList ')' NEWLINE -> ^( PREDHEAD ID ^( ARGS variableList ) ) ;
    public final celluloidParser.predicateHeader_return predicateHeader() throws RecognitionException {
        celluloidParser.predicateHeader_return retval = new celluloidParser.predicateHeader_return();
        retval.start = input.LT(1);
        int predicateHeader_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal54=null;
        Token ID55=null;
        Token char_literal56=null;
        Token char_literal58=null;
        Token NEWLINE59=null;
        celluloidParser.variableList_return variableList57 = null;


        Object string_literal54_tree=null;
        Object ID55_tree=null;
        Object char_literal56_tree=null;
        Object char_literal58_tree=null;
        Object NEWLINE59_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_variableList=new RewriteRuleSubtreeStream(adaptor,"rule variableList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:172:5: ( 'predicate' ID '(' variableList ')' NEWLINE -> ^( PREDHEAD ID ^( ARGS variableList ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:172:10: 'predicate' ID '(' variableList ')' NEWLINE
            {
            string_literal54=(Token)match(input,76,FOLLOW_76_in_predicateHeader1533); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_76.add(string_literal54);

            ID55=(Token)match(input,ID,FOLLOW_ID_in_predicateHeader1535); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID55);

            char_literal56=(Token)match(input,74,FOLLOW_74_in_predicateHeader1537); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_74.add(char_literal56);

            pushFollow(FOLLOW_variableList_in_predicateHeader1539);
            variableList57=variableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableList.add(variableList57.getTree());
            char_literal58=(Token)match(input,75,FOLLOW_75_in_predicateHeader1541); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_75.add(char_literal58);

            NEWLINE59=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_predicateHeader1543); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE59);



            // AST REWRITE
            // elements: variableList, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 173:10: -> ^( PREDHEAD ID ^( ARGS variableList ) )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:173:13: ^( PREDHEAD ID ^( ARGS variableList ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PREDHEAD, "PREDHEAD"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:173:27: ^( ARGS variableList )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_2);

                adaptor.addChild(root_2, stream_variableList.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, predicateHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "predicateHeader"

    public static class predicateDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predicateDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:176:1: predicateDefinition : 'predicate' ID '(' variableList ')' predicateBlock -> ^( PRED ID ^( ARGS variableList ) predicateBlock ) ;
    public final celluloidParser.predicateDefinition_return predicateDefinition() throws RecognitionException {
        celluloidParser.predicateDefinition_return retval = new celluloidParser.predicateDefinition_return();
        retval.start = input.LT(1);
        int predicateDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal60=null;
        Token ID61=null;
        Token char_literal62=null;
        Token char_literal64=null;
        celluloidParser.variableList_return variableList63 = null;

        celluloidParser.predicateBlock_return predicateBlock65 = null;


        Object string_literal60_tree=null;
        Object ID61_tree=null;
        Object char_literal62_tree=null;
        Object char_literal64_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_predicateBlock=new RewriteRuleSubtreeStream(adaptor,"rule predicateBlock");
        RewriteRuleSubtreeStream stream_variableList=new RewriteRuleSubtreeStream(adaptor,"rule variableList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:177:5: ( 'predicate' ID '(' variableList ')' predicateBlock -> ^( PRED ID ^( ARGS variableList ) predicateBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:177:10: 'predicate' ID '(' variableList ')' predicateBlock
            {
            string_literal60=(Token)match(input,76,FOLLOW_76_in_predicateDefinition1597); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_76.add(string_literal60);

            ID61=(Token)match(input,ID,FOLLOW_ID_in_predicateDefinition1599); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID61);

            char_literal62=(Token)match(input,74,FOLLOW_74_in_predicateDefinition1601); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_74.add(char_literal62);

            pushFollow(FOLLOW_variableList_in_predicateDefinition1603);
            variableList63=variableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableList.add(variableList63.getTree());
            char_literal64=(Token)match(input,75,FOLLOW_75_in_predicateDefinition1605); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_75.add(char_literal64);

            pushFollow(FOLLOW_predicateBlock_in_predicateDefinition1607);
            predicateBlock65=predicateBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_predicateBlock.add(predicateBlock65.getTree());


            // AST REWRITE
            // elements: ID, predicateBlock, variableList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 178:7: -> ^( PRED ID ^( ARGS variableList ) predicateBlock )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:178:10: ^( PRED ID ^( ARGS variableList ) predicateBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRED, "PRED"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:178:20: ^( ARGS variableList )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_2);

                adaptor.addChild(root_2, stream_variableList.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_predicateBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, predicateDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "predicateDefinition"

    public static class predicateBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predicateBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:181:1: predicateBlock : START (block+= functionPredicateBlockDeclaration | NEWLINE )* 'return' retexp= expression END -> ^( FUNBLOCK[$START, \"FUNBLOCK\"] ^( RETURN $retexp) ( $block)* ) ;
    public final celluloidParser.predicateBlock_return predicateBlock() throws RecognitionException {
        celluloidParser.predicateBlock_return retval = new celluloidParser.predicateBlock_return();
        retval.start = input.LT(1);
        int predicateBlock_StartIndex = input.index();
        Object root_0 = null;

        Token START66=null;
        Token NEWLINE67=null;
        Token string_literal68=null;
        Token END69=null;
        List list_block=null;
        celluloidParser.expression_return retexp = null;

        RuleReturnScope block = null;
        Object START66_tree=null;
        Object NEWLINE67_tree=null;
        Object string_literal68_tree=null;
        Object END69_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_functionPredicateBlockDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule functionPredicateBlockDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:182:5: ( START (block+= functionPredicateBlockDeclaration | NEWLINE )* 'return' retexp= expression END -> ^( FUNBLOCK[$START, \"FUNBLOCK\"] ^( RETURN $retexp) ( $block)* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:183:10: START (block+= functionPredicateBlockDeclaration | NEWLINE )* 'return' retexp= expression END
            {
            START66=(Token)match(input,START,FOLLOW_START_in_predicateBlock1675); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START66);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:184:12: (block+= functionPredicateBlockDeclaration | NEWLINE )*
            loop21:
            do {
                int alt21=3;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==ID||(LA21_0>=TIME && LA21_0<=TYPE)||(LA21_0>=BOOL && LA21_0<=STRING)||(LA21_0>=78 && LA21_0<=79)||LA21_0==85||LA21_0==87||LA21_0==90) ) {
                    alt21=1;
                }
                else if ( (LA21_0==NEWLINE) ) {
                    alt21=2;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:184:14: block+= functionPredicateBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_functionPredicateBlockDeclaration_in_predicateBlock1694);
            	    block=functionPredicateBlockDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_functionPredicateBlockDeclaration.add(block.getTree());
            	    if (list_block==null) list_block=new ArrayList();
            	    list_block.add(block.getTree());


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:184:59: NEWLINE
            	    {
            	    NEWLINE67=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_predicateBlock1698); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE67);


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            string_literal68=(Token)match(input,77,FOLLOW_77_in_predicateBlock1715); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_77.add(string_literal68);

            pushFollow(FOLLOW_expression_in_predicateBlock1721);
            retexp=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(retexp.getTree());
            END69=(Token)match(input,END,FOLLOW_END_in_predicateBlock1733); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END69);



            // AST REWRITE
            // elements: block, retexp
            // token labels: 
            // rule labels: retexp, retval
            // token list labels: 
            // rule list labels: block
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retexp=new RewriteRuleSubtreeStream(adaptor,"rule retexp",retexp!=null?retexp.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"token block",list_block);
            root_0 = (Object)adaptor.nil();
            // 187:10: -> ^( FUNBLOCK[$START, \"FUNBLOCK\"] ^( RETURN $retexp) ( $block)* )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:187:13: ^( FUNBLOCK[$START, \"FUNBLOCK\"] ^( RETURN $retexp) ( $block)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNBLOCK, START66, "FUNBLOCK"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:187:44: ^( RETURN $retexp)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_2);

                adaptor.addChild(root_2, stream_retexp.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:187:62: ( $block)*
                while ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, predicateBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "predicateBlock"

    public static class inStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:194:1: inStatement : 'in' ID inBlock -> ^( IN ID inBlock ) ;
    public final celluloidParser.inStatement_return inStatement() throws RecognitionException {
        celluloidParser.inStatement_return retval = new celluloidParser.inStatement_return();
        retval.start = input.LT(1);
        int inStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal70=null;
        Token ID71=null;
        celluloidParser.inBlock_return inBlock72 = null;


        Object string_literal70_tree=null;
        Object ID71_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_inBlock=new RewriteRuleSubtreeStream(adaptor,"rule inBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:195:5: ( 'in' ID inBlock -> ^( IN ID inBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:195:8: 'in' ID inBlock
            {
            string_literal70=(Token)match(input,78,FOLLOW_78_in_inStatement1801); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_78.add(string_literal70);

            ID71=(Token)match(input,ID,FOLLOW_ID_in_inStatement1803); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID71);

            pushFollow(FOLLOW_inBlock_in_inStatement1805);
            inBlock72=inBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inBlock.add(inBlock72.getTree());


            // AST REWRITE
            // elements: inBlock, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 196:9: -> ^( IN ID inBlock )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:196:12: ^( IN ID inBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN, "IN"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_inBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, inStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inStatement"

    public static class inBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:199:1: inBlock : START (block+= inBlockDeclaration | NEWLINE )* END -> ^( INBLOCK ( $block)* ) ;
    public final celluloidParser.inBlock_return inBlock() throws RecognitionException {
        celluloidParser.inBlock_return retval = new celluloidParser.inBlock_return();
        retval.start = input.LT(1);
        int inBlock_StartIndex = input.index();
        Object root_0 = null;

        Token START73=null;
        Token NEWLINE74=null;
        Token END75=null;
        List list_block=null;
        RuleReturnScope block = null;
        Object START73_tree=null;
        Object NEWLINE74_tree=null;
        Object END75_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_inBlockDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule inBlockDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:200:5: ( START (block+= inBlockDeclaration | NEWLINE )* END -> ^( INBLOCK ( $block)* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:200:7: START (block+= inBlockDeclaration | NEWLINE )* END
            {
            START73=(Token)match(input,START,FOLLOW_START_in_inBlock1849); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START73);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:201:13: (block+= inBlockDeclaration | NEWLINE )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ID||LA22_0==67||(LA22_0>=82 && LA22_0<=83)) ) {
                    alt22=1;
                }
                else if ( (LA22_0==NEWLINE) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:201:14: block+= inBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_inBlockDeclaration_in_inBlock1868);
            	    block=inBlockDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_inBlockDeclaration.add(block.getTree());
            	    if (list_block==null) list_block=new ArrayList();
            	    list_block.add(block.getTree());


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:201:44: NEWLINE
            	    {
            	    NEWLINE74=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_inBlock1872); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE74);


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            END75=(Token)match(input,END,FOLLOW_END_in_inBlock1884); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END75);



            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: block
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"token block",list_block);
            root_0 = (Object)adaptor.nil();
            // 203:9: -> ^( INBLOCK ( $block)* )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:203:12: ^( INBLOCK ( $block)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INBLOCK, "INBLOCK"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:203:22: ( $block)*
                while ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, inBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inBlock"

    public static class inBlockDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:205:1: inBlockDeclaration : ( whenStatement | everyStatement | constraintFunctionCall );
    public final celluloidParser.inBlockDeclaration_return inBlockDeclaration() throws RecognitionException {
        celluloidParser.inBlockDeclaration_return retval = new celluloidParser.inBlockDeclaration_return();
        retval.start = input.LT(1);
        int inBlockDeclaration_StartIndex = input.index();
        Object root_0 = null;

        celluloidParser.whenStatement_return whenStatement76 = null;

        celluloidParser.everyStatement_return everyStatement77 = null;

        celluloidParser.constraintFunctionCall_return constraintFunctionCall78 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:206:5: ( whenStatement | everyStatement | constraintFunctionCall )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 67:
            case 82:
                {
                alt23=1;
                }
                break;
            case 83:
                {
                alt23=2;
                }
                break;
            case ID:
                {
                alt23=3;
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:206:7: whenStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whenStatement_in_inBlockDeclaration1918);
                    whenStatement76=whenStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whenStatement76.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:207:9: everyStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_everyStatement_in_inBlockDeclaration1929);
                    everyStatement77=everyStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, everyStatement77.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:208:9: constraintFunctionCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constraintFunctionCall_in_inBlockDeclaration1940);
                    constraintFunctionCall78=constraintFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constraintFunctionCall78.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, inBlockDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inBlockDeclaration"

    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:211:1: ifStatement : 'if' (ifTest= logicalORExpression ) ifBlock -> ^( IF $ifTest ifBlock ) ;
    public final celluloidParser.ifStatement_return ifStatement() throws RecognitionException {
        celluloidParser.ifStatement_return retval = new celluloidParser.ifStatement_return();
        retval.start = input.LT(1);
        int ifStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal79=null;
        celluloidParser.logicalORExpression_return ifTest = null;

        celluloidParser.ifBlock_return ifBlock80 = null;


        Object string_literal79_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleSubtreeStream stream_ifBlock=new RewriteRuleSubtreeStream(adaptor,"rule ifBlock");
        RewriteRuleSubtreeStream stream_logicalORExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalORExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:212:5: ( 'if' (ifTest= logicalORExpression ) ifBlock -> ^( IF $ifTest ifBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:212:8: 'if' (ifTest= logicalORExpression ) ifBlock
            {
            string_literal79=(Token)match(input,79,FOLLOW_79_in_ifStatement1958); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_79.add(string_literal79);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:212:13: (ifTest= logicalORExpression )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:212:14: ifTest= logicalORExpression
            {
            pushFollow(FOLLOW_logicalORExpression_in_ifStatement1965);
            ifTest=logicalORExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logicalORExpression.add(ifTest.getTree());

            }

            pushFollow(FOLLOW_ifBlock_in_ifStatement1968);
            ifBlock80=ifBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ifBlock.add(ifBlock80.getTree());


            // AST REWRITE
            // elements: ifTest, ifBlock
            // token labels: 
            // rule labels: retval, ifTest
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ifTest=new RewriteRuleSubtreeStream(adaptor,"rule ifTest",ifTest!=null?ifTest.tree:null);

            root_0 = (Object)adaptor.nil();
            // 213:9: -> ^( IF $ifTest ifBlock )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:213:12: ^( IF $ifTest ifBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_ifTest.nextTree());
                adaptor.addChild(root_1, stream_ifBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, ifStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class ifBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:216:1: ifBlock : START (block+= ifBlockDeclaration )+ (elseifBlock+= elseIfStatement )* ( elseStatement )? END -> ^( IFBLOCK $block) ^( ELSEIF ( $elseifBlock)? ) ^( ELSE ( elseStatement )? ) ;
    public final celluloidParser.ifBlock_return ifBlock() throws RecognitionException {
        celluloidParser.ifBlock_return retval = new celluloidParser.ifBlock_return();
        retval.start = input.LT(1);
        int ifBlock_StartIndex = input.index();
        Object root_0 = null;

        Token START81=null;
        Token END83=null;
        List list_block=null;
        List list_elseifBlock=null;
        celluloidParser.elseStatement_return elseStatement82 = null;

        RuleReturnScope block = null;
        RuleReturnScope elseifBlock = null;
        Object START81_tree=null;
        Object END83_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_ifBlockDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule ifBlockDeclaration");
        RewriteRuleSubtreeStream stream_elseStatement=new RewriteRuleSubtreeStream(adaptor,"rule elseStatement");
        RewriteRuleSubtreeStream stream_elseIfStatement=new RewriteRuleSubtreeStream(adaptor,"rule elseIfStatement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:217:5: ( START (block+= ifBlockDeclaration )+ (elseifBlock+= elseIfStatement )* ( elseStatement )? END -> ^( IFBLOCK $block) ^( ELSEIF ( $elseifBlock)? ) ^( ELSE ( elseStatement )? ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:217:9: START (block+= ifBlockDeclaration )+ (elseifBlock+= elseIfStatement )* ( elseStatement )? END
            {
            START81=(Token)match(input,START,FOLLOW_START_in_ifBlock2014); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START81);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:218:13: (block+= ifBlockDeclaration )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ID||(LA24_0>=TIME && LA24_0<=TYPE)||(LA24_0>=BOOL && LA24_0<=STRING)||(LA24_0>=78 && LA24_0<=79)||LA24_0==85||LA24_0==87||LA24_0==90) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:218:14: block+= ifBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_ifBlockDeclaration_in_ifBlock2033);
            	    block=ifBlockDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ifBlockDeclaration.add(block.getTree());
            	    if (list_block==null) list_block=new ArrayList();
            	    list_block.add(block.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:219:13: (elseifBlock+= elseIfStatement )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==80) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:219:14: elseifBlock+= elseIfStatement
            	    {
            	    pushFollow(FOLLOW_elseIfStatement_in_ifBlock2054);
            	    elseifBlock=elseIfStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elseIfStatement.add(elseifBlock.getTree());
            	    if (list_elseifBlock==null) list_elseifBlock=new ArrayList();
            	    list_elseifBlock.add(elseifBlock.getTree());


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:220:13: ( elseStatement )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==81) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: elseStatement
                    {
                    pushFollow(FOLLOW_elseStatement_in_ifBlock2070);
                    elseStatement82=elseStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseStatement.add(elseStatement82.getTree());

                    }
                    break;

            }

            END83=(Token)match(input,END,FOLLOW_END_in_ifBlock2081); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END83);



            // AST REWRITE
            // elements: elseifBlock, block, elseStatement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: block, elseifBlock
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"token block",list_block);
            RewriteRuleSubtreeStream stream_elseifBlock=new RewriteRuleSubtreeStream(adaptor,"token elseifBlock",list_elseifBlock);
            root_0 = (Object)adaptor.nil();
            // 222:9: -> ^( IFBLOCK $block) ^( ELSEIF ( $elseifBlock)? ) ^( ELSE ( elseStatement )? )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:222:12: ^( IFBLOCK $block)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IFBLOCK, "IFBLOCK"), root_1);

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:222:30: ^( ELSEIF ( $elseifBlock)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSEIF, "ELSEIF"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:222:39: ( $elseifBlock)?
                if ( stream_elseifBlock.hasNext() ) {
                    adaptor.addChild(root_1, stream_elseifBlock.nextTree());

                }
                stream_elseifBlock.reset();

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:222:54: ^( ELSE ( elseStatement )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:222:61: ( elseStatement )?
                if ( stream_elseStatement.hasNext() ) {
                    adaptor.addChild(root_1, stream_elseStatement.nextTree());

                }
                stream_elseStatement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, ifBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifBlock"

    public static class elseIfStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseIfStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:224:1: elseIfStatement : 'else if' elseIfTest= logicalORExpression NEWLINE (block+= ifBlockDeclaration )+ -> ^( $elseIfTest ^( IFBLOCK $block) ) ;
    public final celluloidParser.elseIfStatement_return elseIfStatement() throws RecognitionException {
        celluloidParser.elseIfStatement_return retval = new celluloidParser.elseIfStatement_return();
        retval.start = input.LT(1);
        int elseIfStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal84=null;
        Token NEWLINE85=null;
        List list_block=null;
        celluloidParser.logicalORExpression_return elseIfTest = null;

        RuleReturnScope block = null;
        Object string_literal84_tree=null;
        Object NEWLINE85_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleSubtreeStream stream_ifBlockDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule ifBlockDeclaration");
        RewriteRuleSubtreeStream stream_logicalORExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalORExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:225:5: ( 'else if' elseIfTest= logicalORExpression NEWLINE (block+= ifBlockDeclaration )+ -> ^( $elseIfTest ^( IFBLOCK $block) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:225:9: 'else if' elseIfTest= logicalORExpression NEWLINE (block+= ifBlockDeclaration )+
            {
            string_literal84=(Token)match(input,80,FOLLOW_80_in_elseIfStatement2136); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_80.add(string_literal84);

            pushFollow(FOLLOW_logicalORExpression_in_elseIfStatement2142);
            elseIfTest=logicalORExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logicalORExpression.add(elseIfTest.getTree());
            NEWLINE85=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elseIfStatement2144); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE85);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:226:11: (block+= ifBlockDeclaration )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==ID||(LA27_0>=TIME && LA27_0<=TYPE)||(LA27_0>=BOOL && LA27_0<=STRING)||(LA27_0>=78 && LA27_0<=79)||LA27_0==85||LA27_0==87||LA27_0==90) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:226:12: block+= ifBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_ifBlockDeclaration_in_elseIfStatement2162);
            	    block=ifBlockDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ifBlockDeclaration.add(block.getTree());
            	    if (list_block==null) list_block=new ArrayList();
            	    list_block.add(block.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);



            // AST REWRITE
            // elements: block, elseIfTest
            // token labels: 
            // rule labels: retval, elseIfTest
            // token list labels: 
            // rule list labels: block
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_elseIfTest=new RewriteRuleSubtreeStream(adaptor,"rule elseIfTest",elseIfTest!=null?elseIfTest.tree:null);
            RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"token block",list_block);
            root_0 = (Object)adaptor.nil();
            // 227:9: -> ^( $elseIfTest ^( IFBLOCK $block) )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:227:12: ^( $elseIfTest ^( IFBLOCK $block) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_elseIfTest.nextNode(), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:227:26: ^( IFBLOCK $block)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IFBLOCK, "IFBLOCK"), root_2);

                adaptor.addChild(root_2, stream_block.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, elseIfStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elseIfStatement"

    public static class elseStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:229:1: elseStatement : 'else' NEWLINE (block+= ifBlockDeclaration )* -> ^( IFBLOCK $block) ;
    public final celluloidParser.elseStatement_return elseStatement() throws RecognitionException {
        celluloidParser.elseStatement_return retval = new celluloidParser.elseStatement_return();
        retval.start = input.LT(1);
        int elseStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal86=null;
        Token NEWLINE87=null;
        List list_block=null;
        RuleReturnScope block = null;
        Object string_literal86_tree=null;
        Object NEWLINE87_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_ifBlockDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule ifBlockDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:230:5: ( 'else' NEWLINE (block+= ifBlockDeclaration )* -> ^( IFBLOCK $block) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:230:9: 'else' NEWLINE (block+= ifBlockDeclaration )*
            {
            string_literal86=(Token)match(input,81,FOLLOW_81_in_elseStatement2205); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_81.add(string_literal86);

            NEWLINE87=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elseStatement2207); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE87);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:230:24: (block+= ifBlockDeclaration )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==ID||(LA28_0>=TIME && LA28_0<=TYPE)||(LA28_0>=BOOL && LA28_0<=STRING)||(LA28_0>=78 && LA28_0<=79)||LA28_0==85||LA28_0==87||LA28_0==90) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:230:25: block+= ifBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_ifBlockDeclaration_in_elseStatement2214);
            	    block=ifBlockDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ifBlockDeclaration.add(block.getTree());
            	    if (list_block==null) list_block=new ArrayList();
            	    list_block.add(block.getTree());


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);



            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: block
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"token block",list_block);
            root_0 = (Object)adaptor.nil();
            // 231:9: -> ^( IFBLOCK $block)
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:231:12: ^( IFBLOCK $block)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IFBLOCK, "IFBLOCK"), root_1);

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, elseStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elseStatement"

    public static class ifBlockDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:233:1: ifBlockDeclaration : ( variableDeclaration | expression | inStatement | ifStatement | functionPredicateCall );
    public final celluloidParser.ifBlockDeclaration_return ifBlockDeclaration() throws RecognitionException {
        celluloidParser.ifBlockDeclaration_return retval = new celluloidParser.ifBlockDeclaration_return();
        retval.start = input.LT(1);
        int ifBlockDeclaration_StartIndex = input.index();
        Object root_0 = null;

        celluloidParser.variableDeclaration_return variableDeclaration88 = null;

        celluloidParser.expression_return expression89 = null;

        celluloidParser.inStatement_return inStatement90 = null;

        celluloidParser.ifStatement_return ifStatement91 = null;

        celluloidParser.functionPredicateCall_return functionPredicateCall92 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:234:5: ( variableDeclaration | expression | inStatement | ifStatement | functionPredicateCall )
            int alt29=5;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:234:7: variableDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableDeclaration_in_ifBlockDeclaration2249);
                    variableDeclaration88=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration88.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:235:9: expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_ifBlockDeclaration2259);
                    expression89=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression89.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:236:9: inStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_inStatement_in_ifBlockDeclaration2270);
                    inStatement90=inStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inStatement90.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:237:9: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_ifBlockDeclaration2281);
                    ifStatement91=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement91.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:238:9: functionPredicateCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionPredicateCall_in_ifBlockDeclaration2291);
                    functionPredicateCall92=functionPredicateCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionPredicateCall92.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, ifBlockDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifBlockDeclaration"

    public static class whenStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whenStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:241:1: whenStatement : (when= 'when' | unless= 'unless' ) (target= ID )? (exp= logicalORExpression | event= ID ) listenerBlock -> ^( LISTENER ^( ARG ( $target)? ) EVERY ^( COND ( $when)? ( $unless)? ( $exp)? ( $event)? ) listenerBlock ) ;
    public final celluloidParser.whenStatement_return whenStatement() throws RecognitionException {
        celluloidParser.whenStatement_return retval = new celluloidParser.whenStatement_return();
        retval.start = input.LT(1);
        int whenStatement_StartIndex = input.index();
        Object root_0 = null;

        Token when=null;
        Token unless=null;
        Token target=null;
        Token event=null;
        celluloidParser.logicalORExpression_return exp = null;

        celluloidParser.listenerBlock_return listenerBlock93 = null;


        Object when_tree=null;
        Object unless_tree=null;
        Object target_tree=null;
        Object event_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleSubtreeStream stream_listenerBlock=new RewriteRuleSubtreeStream(adaptor,"rule listenerBlock");
        RewriteRuleSubtreeStream stream_logicalORExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalORExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:242:5: ( (when= 'when' | unless= 'unless' ) (target= ID )? (exp= logicalORExpression | event= ID ) listenerBlock -> ^( LISTENER ^( ARG ( $target)? ) EVERY ^( COND ( $when)? ( $unless)? ( $exp)? ( $event)? ) listenerBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:242:9: (when= 'when' | unless= 'unless' ) (target= ID )? (exp= logicalORExpression | event= ID ) listenerBlock
            {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:242:9: (when= 'when' | unless= 'unless' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==67) ) {
                alt30=1;
            }
            else if ( (LA30_0==82) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:242:10: when= 'when'
                    {
                    when=(Token)match(input,67,FOLLOW_67_in_whenStatement2315); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(when);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:242:26: unless= 'unless'
                    {
                    unless=(Token)match(input,82,FOLLOW_82_in_whenStatement2323); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_82.add(unless);


                    }
                    break;

            }

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:242:45: (target= ID )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==ID) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==ID||LA31_1==TIME||(LA31_1>=BOOL && LA31_1<=STRING)||LA31_1==87||LA31_1==90) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:242:46: target= ID
                    {
                    target=(Token)match(input,ID,FOLLOW_ID_in_whenStatement2331); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(target);


                    }
                    break;

            }

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:242:60: (exp= logicalORExpression | event= ID )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==TIME||(LA32_0>=BOOL && LA32_0<=STRING)||LA32_0==87||LA32_0==90) ) {
                alt32=1;
            }
            else if ( (LA32_0==ID) ) {
                int LA32_2 = input.LA(2);

                if ( (synpred47_celluloid()) ) {
                    alt32=1;
                }
                else if ( (true) ) {
                    alt32=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:242:61: exp= logicalORExpression
                    {
                    pushFollow(FOLLOW_logicalORExpression_in_whenStatement2340);
                    exp=logicalORExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logicalORExpression.add(exp.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:242:89: event= ID
                    {
                    event=(Token)match(input,ID,FOLLOW_ID_in_whenStatement2348); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(event);


                    }
                    break;

            }

            pushFollow(FOLLOW_listenerBlock_in_whenStatement2362);
            listenerBlock93=listenerBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_listenerBlock.add(listenerBlock93.getTree());


            // AST REWRITE
            // elements: target, listenerBlock, when, exp, unless, event
            // token labels: unless, event, when, target
            // rule labels: exp, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_unless=new RewriteRuleTokenStream(adaptor,"token unless",unless);
            RewriteRuleTokenStream stream_event=new RewriteRuleTokenStream(adaptor,"token event",event);
            RewriteRuleTokenStream stream_when=new RewriteRuleTokenStream(adaptor,"token when",when);
            RewriteRuleTokenStream stream_target=new RewriteRuleTokenStream(adaptor,"token target",target);
            RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp",exp!=null?exp.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 244:9: -> ^( LISTENER ^( ARG ( $target)? ) EVERY ^( COND ( $when)? ( $unless)? ( $exp)? ( $event)? ) listenerBlock )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:244:12: ^( LISTENER ^( ARG ( $target)? ) EVERY ^( COND ( $when)? ( $unless)? ( $exp)? ( $event)? ) listenerBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LISTENER, "LISTENER"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:244:23: ^( ARG ( $target)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARG, "ARG"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:244:29: ( $target)?
                if ( stream_target.hasNext() ) {
                    adaptor.addChild(root_2, stream_target.nextNode());

                }
                stream_target.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, (Object)adaptor.create(EVERY, "EVERY"));
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:244:45: ^( COND ( $when)? ( $unless)? ( $exp)? ( $event)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:244:52: ( $when)?
                if ( stream_when.hasNext() ) {
                    adaptor.addChild(root_2, stream_when.nextNode());

                }
                stream_when.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:244:59: ( $unless)?
                if ( stream_unless.hasNext() ) {
                    adaptor.addChild(root_2, stream_unless.nextNode());

                }
                stream_unless.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:244:68: ( $exp)?
                if ( stream_exp.hasNext() ) {
                    adaptor.addChild(root_2, stream_exp.nextTree());

                }
                stream_exp.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:244:74: ( $event)?
                if ( stream_event.hasNext() ) {
                    adaptor.addChild(root_2, stream_event.nextNode());

                }
                stream_event.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_listenerBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, whenStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "whenStatement"

    public static class everyStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "everyStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:247:1: everyStatement : 'every' TIME ( (when= 'when' | unless= 'unless' ) (target= ID )? (exp= logicalORExpression | event= ID ) )? listenerBlock -> ^( LISTENER ^( ARG ( $target)? ) ^( EVERY TIME ) ^( COND ( $when)? ( $unless)? ( $exp)? ( $event)? ) listenerBlock ) ;
    public final celluloidParser.everyStatement_return everyStatement() throws RecognitionException {
        celluloidParser.everyStatement_return retval = new celluloidParser.everyStatement_return();
        retval.start = input.LT(1);
        int everyStatement_StartIndex = input.index();
        Object root_0 = null;

        Token when=null;
        Token unless=null;
        Token target=null;
        Token event=null;
        Token string_literal94=null;
        Token TIME95=null;
        celluloidParser.logicalORExpression_return exp = null;

        celluloidParser.listenerBlock_return listenerBlock96 = null;


        Object when_tree=null;
        Object unless_tree=null;
        Object target_tree=null;
        Object event_tree=null;
        Object string_literal94_tree=null;
        Object TIME95_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_TIME=new RewriteRuleTokenStream(adaptor,"token TIME");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleSubtreeStream stream_listenerBlock=new RewriteRuleSubtreeStream(adaptor,"rule listenerBlock");
        RewriteRuleSubtreeStream stream_logicalORExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalORExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:248:5: ( 'every' TIME ( (when= 'when' | unless= 'unless' ) (target= ID )? (exp= logicalORExpression | event= ID ) )? listenerBlock -> ^( LISTENER ^( ARG ( $target)? ) ^( EVERY TIME ) ^( COND ( $when)? ( $unless)? ( $exp)? ( $event)? ) listenerBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:248:9: 'every' TIME ( (when= 'when' | unless= 'unless' ) (target= ID )? (exp= logicalORExpression | event= ID ) )? listenerBlock
            {
            string_literal94=(Token)match(input,83,FOLLOW_83_in_everyStatement2435); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_83.add(string_literal94);

            TIME95=(Token)match(input,TIME,FOLLOW_TIME_in_everyStatement2437); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TIME.add(TIME95);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:249:9: ( (when= 'when' | unless= 'unless' ) (target= ID )? (exp= logicalORExpression | event= ID ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==67||LA36_0==82) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:249:10: (when= 'when' | unless= 'unless' ) (target= ID )? (exp= logicalORExpression | event= ID )
                    {
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:249:10: (when= 'when' | unless= 'unless' )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==67) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==82) ) {
                        alt33=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:249:11: when= 'when'
                            {
                            when=(Token)match(input,67,FOLLOW_67_in_everyStatement2454); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_67.add(when);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:249:27: unless= 'unless'
                            {
                            unless=(Token)match(input,82,FOLLOW_82_in_everyStatement2462); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_82.add(unless);


                            }
                            break;

                    }

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:249:46: (target= ID )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==ID) ) {
                        int LA34_1 = input.LA(2);

                        if ( (LA34_1==ID||LA34_1==TIME||(LA34_1>=BOOL && LA34_1<=STRING)||LA34_1==87||LA34_1==90) ) {
                            alt34=1;
                        }
                    }
                    switch (alt34) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:249:47: target= ID
                            {
                            target=(Token)match(input,ID,FOLLOW_ID_in_everyStatement2470); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ID.add(target);


                            }
                            break;

                    }

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:249:61: (exp= logicalORExpression | event= ID )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==TIME||(LA35_0>=BOOL && LA35_0<=STRING)||LA35_0==87||LA35_0==90) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==ID) ) {
                        int LA35_2 = input.LA(2);

                        if ( (synpred50_celluloid()) ) {
                            alt35=1;
                        }
                        else if ( (true) ) {
                            alt35=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 35, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:249:62: exp= logicalORExpression
                            {
                            pushFollow(FOLLOW_logicalORExpression_in_everyStatement2479);
                            exp=logicalORExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_logicalORExpression.add(exp.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:249:90: event= ID
                            {
                            event=(Token)match(input,ID,FOLLOW_ID_in_everyStatement2487); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ID.add(event);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_listenerBlock_in_everyStatement2503);
            listenerBlock96=listenerBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_listenerBlock.add(listenerBlock96.getTree());


            // AST REWRITE
            // elements: when, exp, unless, listenerBlock, event, TIME, target
            // token labels: unless, event, when, target
            // rule labels: exp, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_unless=new RewriteRuleTokenStream(adaptor,"token unless",unless);
            RewriteRuleTokenStream stream_event=new RewriteRuleTokenStream(adaptor,"token event",event);
            RewriteRuleTokenStream stream_when=new RewriteRuleTokenStream(adaptor,"token when",when);
            RewriteRuleTokenStream stream_target=new RewriteRuleTokenStream(adaptor,"token target",target);
            RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp",exp!=null?exp.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 251:9: -> ^( LISTENER ^( ARG ( $target)? ) ^( EVERY TIME ) ^( COND ( $when)? ( $unless)? ( $exp)? ( $event)? ) listenerBlock )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:251:12: ^( LISTENER ^( ARG ( $target)? ) ^( EVERY TIME ) ^( COND ( $when)? ( $unless)? ( $exp)? ( $event)? ) listenerBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LISTENER, "LISTENER"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:251:23: ^( ARG ( $target)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARG, "ARG"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:251:29: ( $target)?
                if ( stream_target.hasNext() ) {
                    adaptor.addChild(root_2, stream_target.nextNode());

                }
                stream_target.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:251:39: ^( EVERY TIME )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EVERY, "EVERY"), root_2);

                adaptor.addChild(root_2, stream_TIME.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:251:53: ^( COND ( $when)? ( $unless)? ( $exp)? ( $event)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:251:60: ( $when)?
                if ( stream_when.hasNext() ) {
                    adaptor.addChild(root_2, stream_when.nextNode());

                }
                stream_when.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:251:67: ( $unless)?
                if ( stream_unless.hasNext() ) {
                    adaptor.addChild(root_2, stream_unless.nextNode());

                }
                stream_unless.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:251:76: ( $exp)?
                if ( stream_exp.hasNext() ) {
                    adaptor.addChild(root_2, stream_exp.nextTree());

                }
                stream_exp.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:251:82: ( $event)?
                if ( stream_event.hasNext() ) {
                    adaptor.addChild(root_2, stream_event.nextNode());

                }
                stream_event.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_listenerBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, everyStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "everyStatement"

    public static class listenerBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listenerBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:254:1: listenerBlock : START (block+= listenerBlockDeclaration )* END -> ^( LISTENBLOCK ( $block)* ) ;
    public final celluloidParser.listenerBlock_return listenerBlock() throws RecognitionException {
        celluloidParser.listenerBlock_return retval = new celluloidParser.listenerBlock_return();
        retval.start = input.LT(1);
        int listenerBlock_StartIndex = input.index();
        Object root_0 = null;

        Token START97=null;
        Token END98=null;
        List list_block=null;
        RuleReturnScope block = null;
        Object START97_tree=null;
        Object END98_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_listenerBlockDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule listenerBlockDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:255:5: ( START (block+= listenerBlockDeclaration )* END -> ^( LISTENBLOCK ( $block)* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:255:8: START (block+= listenerBlockDeclaration )* END
            {
            START97=(Token)match(input,START,FOLLOW_START_in_listenerBlock2579); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START97);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:256:12: (block+= listenerBlockDeclaration )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==ID||(LA37_0>=TIME && LA37_0<=TYPE)||(LA37_0>=BOOL && LA37_0<=STRING)||LA37_0==85||LA37_0==87||LA37_0==90) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:256:13: block+= listenerBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_listenerBlockDeclaration_in_listenerBlock2597);
            	    block=listenerBlockDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_listenerBlockDeclaration.add(block.getTree());
            	    if (list_block==null) list_block=new ArrayList();
            	    list_block.add(block.getTree());


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            END98=(Token)match(input,END,FOLLOW_END_in_listenerBlock2608); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END98);



            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: block
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"token block",list_block);
            root_0 = (Object)adaptor.nil();
            // 258:8: -> ^( LISTENBLOCK ( $block)* )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:258:11: ^( LISTENBLOCK ( $block)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LISTENBLOCK, "LISTENBLOCK"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:258:25: ( $block)*
                while ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, listenerBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "listenerBlock"

    public static class listenerBlockDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listenerBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:260:1: listenerBlockDeclaration : ( constraintFunctionCall | expression | variableDeclaration | functionPredicateCall );
    public final celluloidParser.listenerBlockDeclaration_return listenerBlockDeclaration() throws RecognitionException {
        celluloidParser.listenerBlockDeclaration_return retval = new celluloidParser.listenerBlockDeclaration_return();
        retval.start = input.LT(1);
        int listenerBlockDeclaration_StartIndex = input.index();
        Object root_0 = null;

        celluloidParser.constraintFunctionCall_return constraintFunctionCall99 = null;

        celluloidParser.expression_return expression100 = null;

        celluloidParser.variableDeclaration_return variableDeclaration101 = null;

        celluloidParser.functionPredicateCall_return functionPredicateCall102 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:261:5: ( constraintFunctionCall | expression | variableDeclaration | functionPredicateCall )
            int alt38=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA38_1 = input.LA(2);

                if ( (synpred53_celluloid()) ) {
                    alt38=1;
                }
                else if ( (synpred54_celluloid()) ) {
                    alt38=2;
                }
                else if ( (true) ) {
                    alt38=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
                }
                break;
            case TIME:
            case BOOL:
            case NUMBER:
            case STRING:
            case 87:
            case 90:
                {
                alt38=2;
                }
                break;
            case TYPE:
            case 85:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:261:10: constraintFunctionCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constraintFunctionCall_in_listenerBlockDeclaration2645);
                    constraintFunctionCall99=constraintFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constraintFunctionCall99.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:262:10: expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_listenerBlockDeclaration2657);
                    expression100=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression100.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:263:10: variableDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableDeclaration_in_listenerBlockDeclaration2669);
                    variableDeclaration101=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration101.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:264:10: functionPredicateCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionPredicateCall_in_listenerBlockDeclaration2680);
                    functionPredicateCall102=functionPredicateCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionPredicateCall102.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, listenerBlockDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "listenerBlockDeclaration"

    public static class constraintFunctionCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constraintFunctionCall"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:267:1: constraintFunctionCall : function= ID id+= ID ( ',' id+= ID )* ( expressionList )? ( NEWLINE )? -> ( ^( OBJCALL $id $function ^( ARGS ( expressionList )? ) ) )* ;
    public final celluloidParser.constraintFunctionCall_return constraintFunctionCall() throws RecognitionException {
        celluloidParser.constraintFunctionCall_return retval = new celluloidParser.constraintFunctionCall_return();
        retval.start = input.LT(1);
        int constraintFunctionCall_StartIndex = input.index();
        Object root_0 = null;

        Token function=null;
        Token char_literal103=null;
        Token NEWLINE105=null;
        Token id=null;
        List list_id=null;
        celluloidParser.expressionList_return expressionList104 = null;


        Object function_tree=null;
        Object char_literal103_tree=null;
        Object NEWLINE105_tree=null;
        Object id_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:268:5: (function= ID id+= ID ( ',' id+= ID )* ( expressionList )? ( NEWLINE )? -> ( ^( OBJCALL $id $function ^( ARGS ( expressionList )? ) ) )* )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:268:10: function= ID id+= ID ( ',' id+= ID )* ( expressionList )? ( NEWLINE )?
            {
            function=(Token)match(input,ID,FOLLOW_ID_in_constraintFunctionCall2709); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(function);

            id=(Token)match(input,ID,FOLLOW_ID_in_constraintFunctionCall2715); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(id);

            if (list_id==null) list_id=new ArrayList();
            list_id.add(id);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:268:33: ( ',' id+= ID )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==84) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:268:34: ',' id+= ID
            	    {
            	    char_literal103=(Token)match(input,84,FOLLOW_84_in_constraintFunctionCall2718); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_84.add(char_literal103);

            	    id=(Token)match(input,ID,FOLLOW_ID_in_constraintFunctionCall2724); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(id);

            	    if (list_id==null) list_id=new ArrayList();
            	    list_id.add(id);


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:268:49: ( expressionList )?
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_constraintFunctionCall2728);
                    expressionList104=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionList.add(expressionList104.getTree());

                    }
                    break;

            }

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:268:65: ( NEWLINE )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==NEWLINE) ) {
                int LA41_1 = input.LA(2);

                if ( (synpred58_celluloid()) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: NEWLINE
                    {
                    NEWLINE105=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_constraintFunctionCall2731); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE105);


                    }
                    break;

            }



            // AST REWRITE
            // elements: expressionList, id, function
            // token labels: function
            // rule labels: retval
            // token list labels: id
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_function=new RewriteRuleTokenStream(adaptor,"token function",function);
            RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id", list_id);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 269:10: -> ( ^( OBJCALL $id $function ^( ARGS ( expressionList )? ) ) )*
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:269:13: ( ^( OBJCALL $id $function ^( ARGS ( expressionList )? ) ) )*
                while ( stream_id.hasNext()||stream_function.hasNext() ) {
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:269:13: ^( OBJCALL $id $function ^( ARGS ( expressionList )? ) )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OBJCALL, "OBJCALL"), root_1);

                    adaptor.addChild(root_1, stream_id.nextNode());
                    adaptor.addChild(root_1, stream_function.nextNode());
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:269:37: ^( ARGS ( expressionList )? )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_2);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:269:44: ( expressionList )?
                    if ( stream_expressionList.hasNext() ) {
                        adaptor.addChild(root_2, stream_expressionList.nextTree());

                    }
                    stream_expressionList.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_id.reset();
                stream_function.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, constraintFunctionCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constraintFunctionCall"

    public static class functionPredicateCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionPredicateCall"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:272:1: functionPredicateCall : ID '(' expressionList ')' ( NEWLINE )? -> ^( CALL ID ^( ARGS expressionList ) ) ;
    public final celluloidParser.functionPredicateCall_return functionPredicateCall() throws RecognitionException {
        celluloidParser.functionPredicateCall_return retval = new celluloidParser.functionPredicateCall_return();
        retval.start = input.LT(1);
        int functionPredicateCall_StartIndex = input.index();
        Object root_0 = null;

        Token ID106=null;
        Token char_literal107=null;
        Token char_literal109=null;
        Token NEWLINE110=null;
        celluloidParser.expressionList_return expressionList108 = null;


        Object ID106_tree=null;
        Object char_literal107_tree=null;
        Object char_literal109_tree=null;
        Object NEWLINE110_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:273:5: ( ID '(' expressionList ')' ( NEWLINE )? -> ^( CALL ID ^( ARGS expressionList ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:273:10: ID '(' expressionList ')' ( NEWLINE )?
            {
            ID106=(Token)match(input,ID,FOLLOW_ID_in_functionPredicateCall2793); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID106);

            char_literal107=(Token)match(input,74,FOLLOW_74_in_functionPredicateCall2795); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_74.add(char_literal107);

            pushFollow(FOLLOW_expressionList_in_functionPredicateCall2797);
            expressionList108=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expressionList.add(expressionList108.getTree());
            char_literal109=(Token)match(input,75,FOLLOW_75_in_functionPredicateCall2799); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_75.add(char_literal109);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:273:36: ( NEWLINE )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==NEWLINE) ) {
                int LA42_1 = input.LA(2);

                if ( (synpred59_celluloid()) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: NEWLINE
                    {
                    NEWLINE110=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_functionPredicateCall2801); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE110);


                    }
                    break;

            }



            // AST REWRITE
            // elements: expressionList, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 274:10: -> ^( CALL ID ^( ARGS expressionList ) )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:274:13: ^( CALL ID ^( ARGS expressionList ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:274:23: ^( ARGS expressionList )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_2);

                adaptor.addChild(root_2, stream_expressionList.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, functionPredicateCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionPredicateCall"

    public static class idList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idList"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:280:1: idList : (ids+= ID ( ',' ids+= ID )* -> ( ID )+ | '(' ids+= ID ( ',' ids+= ID )* ')' -> ( ID )+ );
    public final celluloidParser.idList_return idList() throws RecognitionException {
        celluloidParser.idList_return retval = new celluloidParser.idList_return();
        retval.start = input.LT(1);
        int idList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal111=null;
        Token char_literal112=null;
        Token char_literal113=null;
        Token char_literal114=null;
        Token ids=null;
        List list_ids=null;

        Object char_literal111_tree=null;
        Object char_literal112_tree=null;
        Object char_literal113_tree=null;
        Object char_literal114_tree=null;
        Object ids_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:281:5: (ids+= ID ( ',' ids+= ID )* -> ( ID )+ | '(' ids+= ID ( ',' ids+= ID )* ')' -> ( ID )+ )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==ID) ) {
                alt45=1;
            }
            else if ( (LA45_0==74) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:281:10: ids+= ID ( ',' ids+= ID )*
                    {
                    ids=(Token)match(input,ID,FOLLOW_ID_in_idList2863); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ids);

                    if (list_ids==null) list_ids=new ArrayList();
                    list_ids.add(ids);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:281:20: ( ',' ids+= ID )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==84) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:281:21: ',' ids+= ID
                    	    {
                    	    char_literal111=(Token)match(input,84,FOLLOW_84_in_idList2866); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_84.add(char_literal111);

                    	    ids=(Token)match(input,ID,FOLLOW_ID_in_idList2872); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ids);

                    	    if (list_ids==null) list_ids=new ArrayList();
                    	    list_ids.add(ids);


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);



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

                    root_0 = (Object)adaptor.nil();
                    // 281:37: -> ( ID )+
                    {
                        if ( !(stream_ID.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_ID.hasNext() ) {
                            adaptor.addChild(root_0, stream_ID.nextNode());

                        }
                        stream_ID.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:283:10: '(' ids+= ID ( ',' ids+= ID )* ')'
                    {
                    char_literal112=(Token)match(input,74,FOLLOW_74_in_idList2900); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(char_literal112);

                    ids=(Token)match(input,ID,FOLLOW_ID_in_idList2906); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ids);

                    if (list_ids==null) list_ids=new ArrayList();
                    list_ids.add(ids);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:283:24: ( ',' ids+= ID )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==84) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:283:25: ',' ids+= ID
                    	    {
                    	    char_literal113=(Token)match(input,84,FOLLOW_84_in_idList2909); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_84.add(char_literal113);

                    	    ids=(Token)match(input,ID,FOLLOW_ID_in_idList2915); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ids);

                    	    if (list_ids==null) list_ids=new ArrayList();
                    	    list_ids.add(ids);


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    char_literal114=(Token)match(input,75,FOLLOW_75_in_idList2919); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(char_literal114);



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

                    root_0 = (Object)adaptor.nil();
                    // 283:45: -> ( ID )+
                    {
                        if ( !(stream_ID.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_ID.hasNext() ) {
                            adaptor.addChild(root_0, stream_ID.nextNode());

                        }
                        stream_ID.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, idList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "idList"

    public static class variableList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableList"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:287:1: variableList : (vars+= variableDeclaration ( ',' vars+= variableDeclaration )* -> ( variableDeclaration )+ | '(' vars+= variableDeclaration ( ',' vars+= variableDeclaration )* ')' -> ( variableDeclaration )+ );
    public final celluloidParser.variableList_return variableList() throws RecognitionException {
        celluloidParser.variableList_return retval = new celluloidParser.variableList_return();
        retval.start = input.LT(1);
        int variableList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal115=null;
        Token char_literal116=null;
        Token char_literal117=null;
        Token char_literal118=null;
        List list_vars=null;
        RuleReturnScope vars = null;
        Object char_literal115_tree=null;
        Object char_literal116_tree=null;
        Object char_literal117_tree=null;
        Object char_literal118_tree=null;
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:288:5: (vars+= variableDeclaration ( ',' vars+= variableDeclaration )* -> ( variableDeclaration )+ | '(' vars+= variableDeclaration ( ',' vars+= variableDeclaration )* ')' -> ( variableDeclaration )+ )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==TYPE||LA48_0==85) ) {
                alt48=1;
            }
            else if ( (LA48_0==74) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:288:10: vars+= variableDeclaration ( ',' vars+= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_variableList2960);
                    vars=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(vars.getTree());
                    if (list_vars==null) list_vars=new ArrayList();
                    list_vars.add(vars.getTree());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:288:38: ( ',' vars+= variableDeclaration )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==84) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:288:39: ',' vars+= variableDeclaration
                    	    {
                    	    char_literal115=(Token)match(input,84,FOLLOW_84_in_variableList2963); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_84.add(char_literal115);

                    	    pushFollow(FOLLOW_variableDeclaration_in_variableList2969);
                    	    vars=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_variableDeclaration.add(vars.getTree());
                    	    if (list_vars==null) list_vars=new ArrayList();
                    	    list_vars.add(vars.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: variableDeclaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 289:10: -> ( variableDeclaration )+
                    {
                        if ( !(stream_variableDeclaration.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_variableDeclaration.hasNext() ) {
                            adaptor.addChild(root_0, stream_variableDeclaration.nextTree());

                        }
                        stream_variableDeclaration.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:291:10: '(' vars+= variableDeclaration ( ',' vars+= variableDeclaration )* ')'
                    {
                    char_literal116=(Token)match(input,74,FOLLOW_74_in_variableList3007); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(char_literal116);

                    pushFollow(FOLLOW_variableDeclaration_in_variableList3013);
                    vars=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(vars.getTree());
                    if (list_vars==null) list_vars=new ArrayList();
                    list_vars.add(vars.getTree());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:291:42: ( ',' vars+= variableDeclaration )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==84) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:291:43: ',' vars+= variableDeclaration
                    	    {
                    	    char_literal117=(Token)match(input,84,FOLLOW_84_in_variableList3016); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_84.add(char_literal117);

                    	    pushFollow(FOLLOW_variableDeclaration_in_variableList3022);
                    	    vars=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_variableDeclaration.add(vars.getTree());
                    	    if (list_vars==null) list_vars=new ArrayList();
                    	    list_vars.add(vars.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    char_literal118=(Token)match(input,75,FOLLOW_75_in_variableList3026); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(char_literal118);



                    // AST REWRITE
                    // elements: variableDeclaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 292:10: -> ( variableDeclaration )+
                    {
                        if ( !(stream_variableDeclaration.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_variableDeclaration.hasNext() ) {
                            adaptor.addChild(root_0, stream_variableDeclaration.nextTree());

                        }
                        stream_variableDeclaration.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, variableList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableList"

    public static class expressionList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionList"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:296:1: expressionList : (exps+= expression ( ',' exps+= expression )* -> ( expression )+ | '(' exps+= expression ( ',' exps+= expression )* ')' -> ( expression )+ );
    public final celluloidParser.expressionList_return expressionList() throws RecognitionException {
        celluloidParser.expressionList_return retval = new celluloidParser.expressionList_return();
        retval.start = input.LT(1);
        int expressionList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal119=null;
        Token char_literal120=null;
        Token char_literal121=null;
        Token char_literal122=null;
        List list_exps=null;
        RuleReturnScope exps = null;
        Object char_literal119_tree=null;
        Object char_literal120_tree=null;
        Object char_literal121_tree=null;
        Object char_literal122_tree=null;
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:297:5: (exps+= expression ( ',' exps+= expression )* -> ( expression )+ | '(' exps+= expression ( ',' exps+= expression )* ')' -> ( expression )+ )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ID||LA51_0==TIME||(LA51_0>=BOOL && LA51_0<=STRING)||LA51_0==87||LA51_0==90) ) {
                alt51=1;
            }
            else if ( (LA51_0==74) ) {
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:297:10: exps+= expression ( ',' exps+= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_expressionList3075);
                    exps=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(exps.getTree());
                    if (list_exps==null) list_exps=new ArrayList();
                    list_exps.add(exps.getTree());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:297:29: ( ',' exps+= expression )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==84) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:297:30: ',' exps+= expression
                    	    {
                    	    char_literal119=(Token)match(input,84,FOLLOW_84_in_expressionList3078); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_84.add(char_literal119);

                    	    pushFollow(FOLLOW_expression_in_expressionList3084);
                    	    exps=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(exps.getTree());
                    	    if (list_exps==null) list_exps=new ArrayList();
                    	    list_exps.add(exps.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 298:10: -> ( expression )+
                    {
                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_0, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:300:10: '(' exps+= expression ( ',' exps+= expression )* ')'
                    {
                    char_literal120=(Token)match(input,74,FOLLOW_74_in_expressionList3121); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(char_literal120);

                    pushFollow(FOLLOW_expression_in_expressionList3127);
                    exps=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(exps.getTree());
                    if (list_exps==null) list_exps=new ArrayList();
                    list_exps.add(exps.getTree());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:300:33: ( ',' exps+= expression )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==84) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:300:34: ',' exps+= expression
                    	    {
                    	    char_literal121=(Token)match(input,84,FOLLOW_84_in_expressionList3130); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_84.add(char_literal121);

                    	    pushFollow(FOLLOW_expression_in_expressionList3136);
                    	    exps=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(exps.getTree());
                    	    if (list_exps==null) list_exps=new ArrayList();
                    	    list_exps.add(exps.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    char_literal122=(Token)match(input,75,FOLLOW_75_in_expressionList3140); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(char_literal122);



                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 301:10: -> ( expression )+
                    {
                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_0, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, expressionList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expressionList"

    public static class variableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:310:1: variableDeclaration : ( 'timeline' ID ( NEWLINE -> ^( VARDEF 'timeline' ID ) | -> ^( ARG 'timeline' ID ) ) | TYPE ID ( initializer )? ( NEWLINE -> ^( VARDEF TYPE ID ( initializer )? ) | -> ^( ARG TYPE ID ) ) );
    public final celluloidParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        celluloidParser.variableDeclaration_return retval = new celluloidParser.variableDeclaration_return();
        retval.start = input.LT(1);
        int variableDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal123=null;
        Token ID124=null;
        Token NEWLINE125=null;
        Token TYPE126=null;
        Token ID127=null;
        Token NEWLINE129=null;
        celluloidParser.initializer_return initializer128 = null;


        Object string_literal123_tree=null;
        Object ID124_tree=null;
        Object NEWLINE125_tree=null;
        Object TYPE126_tree=null;
        Object ID127_tree=null;
        Object NEWLINE129_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:311:5: ( 'timeline' ID ( NEWLINE -> ^( VARDEF 'timeline' ID ) | -> ^( ARG 'timeline' ID ) ) | TYPE ID ( initializer )? ( NEWLINE -> ^( VARDEF TYPE ID ( initializer )? ) | -> ^( ARG TYPE ID ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==85) ) {
                alt55=1;
            }
            else if ( (LA55_0==TYPE) ) {
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:311:10: 'timeline' ID ( NEWLINE -> ^( VARDEF 'timeline' ID ) | -> ^( ARG 'timeline' ID ) )
                    {
                    string_literal123=(Token)match(input,85,FOLLOW_85_in_variableDeclaration3190); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_85.add(string_literal123);

                    ID124=(Token)match(input,ID,FOLLOW_ID_in_variableDeclaration3192); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID124);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:312:10: ( NEWLINE -> ^( VARDEF 'timeline' ID ) | -> ^( ARG 'timeline' ID ) )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==NEWLINE) ) {
                        int LA52_1 = input.LA(2);

                        if ( (synpred69_celluloid()) ) {
                            alt52=1;
                        }
                        else if ( (true) ) {
                            alt52=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 52, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA52_0==EOF||LA52_0==ID||(LA52_0>=END && LA52_0<=TYPE)||(LA52_0>=BOOL && LA52_0<=STRING)||LA52_0==66||LA52_0==73||(LA52_0>=75 && LA52_0<=81)||(LA52_0>=84 && LA52_0<=85)||LA52_0==87||LA52_0==90) ) {
                        alt52=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        throw nvae;
                    }
                    switch (alt52) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:312:11: NEWLINE
                            {
                            NEWLINE125=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_variableDeclaration3205); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE125);



                            // AST REWRITE
                            // elements: ID, 85
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 312:19: -> ^( VARDEF 'timeline' ID )
                            {
                                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:312:22: ^( VARDEF 'timeline' ID )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDEF, "VARDEF"), root_1);

                                adaptor.addChild(root_1, stream_85.nextNode());
                                adaptor.addChild(root_1, stream_ID.nextNode());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:313:19: 
                            {

                            // AST REWRITE
                            // elements: ID, 85
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 313:19: -> ^( ARG 'timeline' ID )
                            {
                                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:313:22: ^( ARG 'timeline' ID )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARG, "ARG"), root_1);

                                adaptor.addChild(root_1, stream_85.nextNode());
                                adaptor.addChild(root_1, stream_ID.nextNode());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:316:10: TYPE ID ( initializer )? ( NEWLINE -> ^( VARDEF TYPE ID ( initializer )? ) | -> ^( ARG TYPE ID ) )
                    {
                    TYPE126=(Token)match(input,TYPE,FOLLOW_TYPE_in_variableDeclaration3275); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPE.add(TYPE126);

                    ID127=(Token)match(input,ID,FOLLOW_ID_in_variableDeclaration3277); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID127);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:316:18: ( initializer )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==86) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: initializer
                            {
                            pushFollow(FOLLOW_initializer_in_variableDeclaration3279);
                            initializer128=initializer();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_initializer.add(initializer128.getTree());

                            }
                            break;

                    }

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:317:10: ( NEWLINE -> ^( VARDEF TYPE ID ( initializer )? ) | -> ^( ARG TYPE ID ) )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==NEWLINE) ) {
                        int LA54_1 = input.LA(2);

                        if ( (synpred72_celluloid()) ) {
                            alt54=1;
                        }
                        else if ( (true) ) {
                            alt54=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 54, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA54_0==EOF||LA54_0==ID||(LA54_0>=END && LA54_0<=TYPE)||(LA54_0>=BOOL && LA54_0<=STRING)||LA54_0==66||LA54_0==73||(LA54_0>=75 && LA54_0<=81)||(LA54_0>=84 && LA54_0<=85)||LA54_0==87||LA54_0==90) ) {
                        alt54=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:317:11: NEWLINE
                            {
                            NEWLINE129=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_variableDeclaration3293); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE129);



                            // AST REWRITE
                            // elements: initializer, TYPE, ID
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 317:19: -> ^( VARDEF TYPE ID ( initializer )? )
                            {
                                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:317:22: ^( VARDEF TYPE ID ( initializer )? )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDEF, "VARDEF"), root_1);

                                adaptor.addChild(root_1, stream_TYPE.nextNode());
                                adaptor.addChild(root_1, stream_ID.nextNode());
                                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:317:39: ( initializer )?
                                if ( stream_initializer.hasNext() ) {
                                    adaptor.addChild(root_1, stream_initializer.nextTree());

                                }
                                stream_initializer.reset();

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:318:19: 
                            {

                            // AST REWRITE
                            // elements: ID, TYPE
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 318:19: -> ^( ARG TYPE ID )
                            {
                                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:318:22: ^( ARG TYPE ID )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARG, "ARG"), root_1);

                                adaptor.addChild(root_1, stream_TYPE.nextNode());
                                adaptor.addChild(root_1, stream_ID.nextNode());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, variableDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableDeclaration"

    public static class initializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "initializer"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:322:1: initializer : '=' logicalORExpression ;
    public final celluloidParser.initializer_return initializer() throws RecognitionException {
        celluloidParser.initializer_return retval = new celluloidParser.initializer_return();
        retval.start = input.LT(1);
        int initializer_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal130=null;
        celluloidParser.logicalORExpression_return logicalORExpression131 = null;


        Object char_literal130_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:323:5: ( '=' logicalORExpression )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:323:10: '=' logicalORExpression
            {
            root_0 = (Object)adaptor.nil();

            char_literal130=(Token)match(input,86,FOLLOW_86_in_initializer3375); if (state.failed) return retval;
            pushFollow(FOLLOW_logicalORExpression_in_initializer3378);
            logicalORExpression131=logicalORExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalORExpression131.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, initializer_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "initializer"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:327:1: expression : logicalORExpression ( ASSIGNMENT_OPERATOR expression )? ( NEWLINE )? ;
    public final celluloidParser.expression_return expression() throws RecognitionException {
        celluloidParser.expression_return retval = new celluloidParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        Object root_0 = null;

        Token ASSIGNMENT_OPERATOR133=null;
        Token NEWLINE135=null;
        celluloidParser.logicalORExpression_return logicalORExpression132 = null;

        celluloidParser.expression_return expression134 = null;


        Object ASSIGNMENT_OPERATOR133_tree=null;
        Object NEWLINE135_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:328:5: ( logicalORExpression ( ASSIGNMENT_OPERATOR expression )? ( NEWLINE )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:328:10: logicalORExpression ( ASSIGNMENT_OPERATOR expression )? ( NEWLINE )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpression_in_expression3433);
            logicalORExpression132=logicalORExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalORExpression132.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:328:30: ( ASSIGNMENT_OPERATOR expression )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==ASSIGNMENT_OPERATOR) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:328:31: ASSIGNMENT_OPERATOR expression
                    {
                    ASSIGNMENT_OPERATOR133=(Token)match(input,ASSIGNMENT_OPERATOR,FOLLOW_ASSIGNMENT_OPERATOR_in_expression3436); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGNMENT_OPERATOR133_tree = (Object)adaptor.create(ASSIGNMENT_OPERATOR133);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGNMENT_OPERATOR133_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_expression3439);
                    expression134=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression134.getTree());

                    }
                    break;

            }

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:328:72: ( NEWLINE )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==NEWLINE) ) {
                int LA57_1 = input.LA(2);

                if ( (synpred74_celluloid()) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: NEWLINE
                    {
                    NEWLINE135=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_expression3443); if (state.failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class logicalORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalORExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:331:1: logicalORExpression : ( 'not' )? logicalANDExpression ( 'or' logicalORExpression )? ;
    public final celluloidParser.logicalORExpression_return logicalORExpression() throws RecognitionException {
        celluloidParser.logicalORExpression_return retval = new celluloidParser.logicalORExpression_return();
        retval.start = input.LT(1);
        int logicalORExpression_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal136=null;
        Token string_literal138=null;
        celluloidParser.logicalANDExpression_return logicalANDExpression137 = null;

        celluloidParser.logicalORExpression_return logicalORExpression139 = null;


        Object string_literal136_tree=null;
        Object string_literal138_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:332:5: ( ( 'not' )? logicalANDExpression ( 'or' logicalORExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:332:10: ( 'not' )? logicalANDExpression ( 'or' logicalORExpression )?
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:332:10: ( 'not' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==87) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: 'not'
                    {
                    string_literal136=(Token)match(input,87,FOLLOW_87_in_logicalORExpression3500); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal136_tree = (Object)adaptor.create(string_literal136);
                    adaptor.addChild(root_0, string_literal136_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression3503);
            logicalANDExpression137=logicalANDExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalANDExpression137.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:332:38: ( 'or' logicalORExpression )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==88) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:332:39: 'or' logicalORExpression
                    {
                    string_literal138=(Token)match(input,88,FOLLOW_88_in_logicalORExpression3506); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal138_tree = (Object)adaptor.create(string_literal138);
                    root_0 = (Object)adaptor.becomeRoot(string_literal138_tree, root_0);
                    }
                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression3509);
                    logicalORExpression139=logicalORExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalORExpression139.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, logicalORExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicalORExpression"

    public static class logicalANDExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalANDExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:335:1: logicalANDExpression : equalityExpression ( 'and' logicalANDExpression )? ;
    public final celluloidParser.logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        celluloidParser.logicalANDExpression_return retval = new celluloidParser.logicalANDExpression_return();
        retval.start = input.LT(1);
        int logicalANDExpression_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal141=null;
        celluloidParser.equalityExpression_return equalityExpression140 = null;

        celluloidParser.logicalANDExpression_return logicalANDExpression142 = null;


        Object string_literal141_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:336:5: ( equalityExpression ( 'and' logicalANDExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:336:10: equalityExpression ( 'and' logicalANDExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_logicalANDExpression3534);
            equalityExpression140=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression140.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:336:29: ( 'and' logicalANDExpression )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==89) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:336:30: 'and' logicalANDExpression
                    {
                    string_literal141=(Token)match(input,89,FOLLOW_89_in_logicalANDExpression3537); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal141_tree = (Object)adaptor.create(string_literal141);
                    root_0 = (Object)adaptor.becomeRoot(string_literal141_tree, root_0);
                    }
                    pushFollow(FOLLOW_logicalANDExpression_in_logicalANDExpression3540);
                    logicalANDExpression142=logicalANDExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalANDExpression142.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, logicalANDExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicalANDExpression"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:339:1: equalityExpression : relationalExpression ( EQUALITY_OPERATOR equalityExpression )? ;
    public final celluloidParser.equalityExpression_return equalityExpression() throws RecognitionException {
        celluloidParser.equalityExpression_return retval = new celluloidParser.equalityExpression_return();
        retval.start = input.LT(1);
        int equalityExpression_StartIndex = input.index();
        Object root_0 = null;

        Token EQUALITY_OPERATOR144=null;
        celluloidParser.relationalExpression_return relationalExpression143 = null;

        celluloidParser.equalityExpression_return equalityExpression145 = null;


        Object EQUALITY_OPERATOR144_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:340:5: ( relationalExpression ( EQUALITY_OPERATOR equalityExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:340:10: relationalExpression ( EQUALITY_OPERATOR equalityExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression3569);
            relationalExpression143=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression143.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:340:31: ( EQUALITY_OPERATOR equalityExpression )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==EQUALITY_OPERATOR) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:340:32: EQUALITY_OPERATOR equalityExpression
                    {
                    EQUALITY_OPERATOR144=(Token)match(input,EQUALITY_OPERATOR,FOLLOW_EQUALITY_OPERATOR_in_equalityExpression3572); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUALITY_OPERATOR144_tree = (Object)adaptor.create(EQUALITY_OPERATOR144);
                    root_0 = (Object)adaptor.becomeRoot(EQUALITY_OPERATOR144_tree, root_0);
                    }
                    pushFollow(FOLLOW_equalityExpression_in_equalityExpression3575);
                    equalityExpression145=equalityExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression145.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, equalityExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "equalityExpression"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:343:1: relationalExpression : additiveExpression ( RELATIONAL_OPERATOR relationalExpression )? ;
    public final celluloidParser.relationalExpression_return relationalExpression() throws RecognitionException {
        celluloidParser.relationalExpression_return retval = new celluloidParser.relationalExpression_return();
        retval.start = input.LT(1);
        int relationalExpression_StartIndex = input.index();
        Object root_0 = null;

        Token RELATIONAL_OPERATOR147=null;
        celluloidParser.additiveExpression_return additiveExpression146 = null;

        celluloidParser.relationalExpression_return relationalExpression148 = null;


        Object RELATIONAL_OPERATOR147_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:344:5: ( additiveExpression ( RELATIONAL_OPERATOR relationalExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:344:10: additiveExpression ( RELATIONAL_OPERATOR relationalExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_relationalExpression3602);
            additiveExpression146=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression146.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:344:29: ( RELATIONAL_OPERATOR relationalExpression )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RELATIONAL_OPERATOR) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:344:30: RELATIONAL_OPERATOR relationalExpression
                    {
                    RELATIONAL_OPERATOR147=(Token)match(input,RELATIONAL_OPERATOR,FOLLOW_RELATIONAL_OPERATOR_in_relationalExpression3605); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RELATIONAL_OPERATOR147_tree = (Object)adaptor.create(RELATIONAL_OPERATOR147);
                    root_0 = (Object)adaptor.becomeRoot(RELATIONAL_OPERATOR147_tree, root_0);
                    }
                    pushFollow(FOLLOW_relationalExpression_in_relationalExpression3608);
                    relationalExpression148=relationalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression148.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, relationalExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "relationalExpression"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:347:1: additiveExpression : multiplicativeExpression ( ADDITIVE_OPERATOR additiveExpression )? ;
    public final celluloidParser.additiveExpression_return additiveExpression() throws RecognitionException {
        celluloidParser.additiveExpression_return retval = new celluloidParser.additiveExpression_return();
        retval.start = input.LT(1);
        int additiveExpression_StartIndex = input.index();
        Object root_0 = null;

        Token ADDITIVE_OPERATOR150=null;
        celluloidParser.multiplicativeExpression_return multiplicativeExpression149 = null;

        celluloidParser.additiveExpression_return additiveExpression151 = null;


        Object ADDITIVE_OPERATOR150_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:348:5: ( multiplicativeExpression ( ADDITIVE_OPERATOR additiveExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:348:10: multiplicativeExpression ( ADDITIVE_OPERATOR additiveExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3636);
            multiplicativeExpression149=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression149.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:348:35: ( ADDITIVE_OPERATOR additiveExpression )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==ADDITIVE_OPERATOR) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:348:36: ADDITIVE_OPERATOR additiveExpression
                    {
                    ADDITIVE_OPERATOR150=(Token)match(input,ADDITIVE_OPERATOR,FOLLOW_ADDITIVE_OPERATOR_in_additiveExpression3639); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ADDITIVE_OPERATOR150_tree = (Object)adaptor.create(ADDITIVE_OPERATOR150);
                    root_0 = (Object)adaptor.becomeRoot(ADDITIVE_OPERATOR150_tree, root_0);
                    }
                    pushFollow(FOLLOW_additiveExpression_in_additiveExpression3642);
                    additiveExpression151=additiveExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression151.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, additiveExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:351:1: multiplicativeExpression : primaryExpression ( MULTIPLICATIVE_OPERATOR multiplicativeExpression )? ;
    public final celluloidParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        celluloidParser.multiplicativeExpression_return retval = new celluloidParser.multiplicativeExpression_return();
        retval.start = input.LT(1);
        int multiplicativeExpression_StartIndex = input.index();
        Object root_0 = null;

        Token MULTIPLICATIVE_OPERATOR153=null;
        celluloidParser.primaryExpression_return primaryExpression152 = null;

        celluloidParser.multiplicativeExpression_return multiplicativeExpression154 = null;


        Object MULTIPLICATIVE_OPERATOR153_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:352:5: ( primaryExpression ( MULTIPLICATIVE_OPERATOR multiplicativeExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:352:7: primaryExpression ( MULTIPLICATIVE_OPERATOR multiplicativeExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_primaryExpression_in_multiplicativeExpression3662);
            primaryExpression152=primaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpression152.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:352:25: ( MULTIPLICATIVE_OPERATOR multiplicativeExpression )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==MULTIPLICATIVE_OPERATOR) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:352:26: MULTIPLICATIVE_OPERATOR multiplicativeExpression
                    {
                    MULTIPLICATIVE_OPERATOR153=(Token)match(input,MULTIPLICATIVE_OPERATOR,FOLLOW_MULTIPLICATIVE_OPERATOR_in_multiplicativeExpression3665); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MULTIPLICATIVE_OPERATOR153_tree = (Object)adaptor.create(MULTIPLICATIVE_OPERATOR153);
                    root_0 = (Object)adaptor.becomeRoot(MULTIPLICATIVE_OPERATOR153_tree, root_0);
                    }
                    pushFollow(FOLLOW_multiplicativeExpression_in_multiplicativeExpression3668);
                    multiplicativeExpression154=multiplicativeExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression154.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, multiplicativeExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class primaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primaryExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:355:1: primaryExpression : ( literal | ID | 'new' ID '(' expressionList ')' | functionPredicateCall );
    public final celluloidParser.primaryExpression_return primaryExpression() throws RecognitionException {
        celluloidParser.primaryExpression_return retval = new celluloidParser.primaryExpression_return();
        retval.start = input.LT(1);
        int primaryExpression_StartIndex = input.index();
        Object root_0 = null;

        Token ID156=null;
        Token string_literal157=null;
        Token ID158=null;
        Token char_literal159=null;
        Token char_literal161=null;
        celluloidParser.literal_return literal155 = null;

        celluloidParser.expressionList_return expressionList160 = null;

        celluloidParser.functionPredicateCall_return functionPredicateCall162 = null;


        Object ID156_tree=null;
        Object string_literal157_tree=null;
        Object ID158_tree=null;
        Object char_literal159_tree=null;
        Object char_literal161_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:356:5: ( literal | ID | 'new' ID '(' expressionList ')' | functionPredicateCall )
            int alt65=4;
            switch ( input.LA(1) ) {
            case TIME:
            case BOOL:
            case NUMBER:
            case STRING:
                {
                alt65=1;
                }
                break;
            case ID:
                {
                int LA65_2 = input.LA(2);

                if ( (LA65_2==74) ) {
                    alt65=4;
                }
                else if ( (LA65_2==EOF||(LA65_2>=NEWLINE && LA65_2<=STRING)||(LA65_2>=66 && LA65_2<=67)||LA65_2==73||(LA65_2>=75 && LA65_2<=85)||(LA65_2>=87 && LA65_2<=90)) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 2, input);

                    throw nvae;
                }
                }
                break;
            case 90:
                {
                alt65=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:356:10: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primaryExpression3691);
                    literal155=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal155.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:357:10: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID156=(Token)match(input,ID,FOLLOW_ID_in_primaryExpression3702); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID156_tree = (Object)adaptor.create(ID156);
                    adaptor.addChild(root_0, ID156_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:358:10: 'new' ID '(' expressionList ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal157=(Token)match(input,90,FOLLOW_90_in_primaryExpression3713); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal157_tree = (Object)adaptor.create(string_literal157);
                    adaptor.addChild(root_0, string_literal157_tree);
                    }
                    ID158=(Token)match(input,ID,FOLLOW_ID_in_primaryExpression3715); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID158_tree = (Object)adaptor.create(ID158);
                    adaptor.addChild(root_0, ID158_tree);
                    }
                    char_literal159=(Token)match(input,74,FOLLOW_74_in_primaryExpression3717); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal159_tree = (Object)adaptor.create(char_literal159);
                    adaptor.addChild(root_0, char_literal159_tree);
                    }
                    pushFollow(FOLLOW_expressionList_in_primaryExpression3719);
                    expressionList160=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList160.getTree());
                    char_literal161=(Token)match(input,75,FOLLOW_75_in_primaryExpression3721); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal161_tree = (Object)adaptor.create(char_literal161);
                    adaptor.addChild(root_0, char_literal161_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:359:10: functionPredicateCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionPredicateCall_in_primaryExpression3732);
                    functionPredicateCall162=functionPredicateCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionPredicateCall162.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, primaryExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primaryExpression"

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:376:1: literal : ( BOOL | NUMBER | STRING | TIME );
    public final celluloidParser.literal_return literal() throws RecognitionException {
        celluloidParser.literal_return retval = new celluloidParser.literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        Object root_0 = null;

        Token set163=null;

        Object set163_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:376:9: ( BOOL | NUMBER | STRING | TIME )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:
            {
            root_0 = (Object)adaptor.nil();

            set163=(Token)input.LT(1);
            if ( input.LA(1)==TIME||(input.LA(1)>=BOOL && input.LA(1)<=STRING) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set163));
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, literal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literal"

    // $ANTLR start synpred2_celluloid
    public final void synpred2_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:63:10: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:63:10: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred2_celluloid301); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_celluloid

    // $ANTLR start synpred4_celluloid
    public final void synpred4_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:65:10: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:65:10: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred4_celluloid333); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_celluloid

    // $ANTLR start synpred6_celluloid
    public final void synpred6_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:67:10: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:67:10: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred6_celluloid366); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_celluloid

    // $ANTLR start synpred9_celluloid
    public final void synpred9_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:70:13: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:70:13: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred9_celluloid416); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_celluloid

    // $ANTLR start synpred10_celluloid
    public final void synpred10_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:71:10: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:71:10: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred10_celluloid429); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_celluloid

    // $ANTLR start synpred27_celluloid
    public final void synpred27_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:163:10: ( expression )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:163:10: expression
        {
        pushFollow(FOLLOW_expression_in_synpred27_celluloid1472);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_celluloid

    // $ANTLR start synpred42_celluloid
    public final void synpred42_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:235:9: ( expression )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:235:9: expression
        {
        pushFollow(FOLLOW_expression_in_synpred42_celluloid2259);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_celluloid

    // $ANTLR start synpred47_celluloid
    public final void synpred47_celluloid_fragment() throws RecognitionException {   
        celluloidParser.logicalORExpression_return exp = null;


        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:242:61: (exp= logicalORExpression )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:242:61: exp= logicalORExpression
        {
        pushFollow(FOLLOW_logicalORExpression_in_synpred47_celluloid2340);
        exp=logicalORExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_celluloid

    // $ANTLR start synpred50_celluloid
    public final void synpred50_celluloid_fragment() throws RecognitionException {   
        celluloidParser.logicalORExpression_return exp = null;


        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:249:62: (exp= logicalORExpression )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:249:62: exp= logicalORExpression
        {
        pushFollow(FOLLOW_logicalORExpression_in_synpred50_celluloid2479);
        exp=logicalORExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_celluloid

    // $ANTLR start synpred53_celluloid
    public final void synpred53_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:261:10: ( constraintFunctionCall )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:261:10: constraintFunctionCall
        {
        pushFollow(FOLLOW_constraintFunctionCall_in_synpred53_celluloid2645);
        constraintFunctionCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_celluloid

    // $ANTLR start synpred54_celluloid
    public final void synpred54_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:262:10: ( expression )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:262:10: expression
        {
        pushFollow(FOLLOW_expression_in_synpred54_celluloid2657);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_celluloid

    // $ANTLR start synpred57_celluloid
    public final void synpred57_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:268:49: ( expressionList )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:268:49: expressionList
        {
        pushFollow(FOLLOW_expressionList_in_synpred57_celluloid2728);
        expressionList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_celluloid

    // $ANTLR start synpred58_celluloid
    public final void synpred58_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:268:65: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:268:65: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred58_celluloid2731); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_celluloid

    // $ANTLR start synpred59_celluloid
    public final void synpred59_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:273:36: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:273:36: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred59_celluloid2801); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_celluloid

    // $ANTLR start synpred69_celluloid
    public final void synpred69_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:312:11: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:312:11: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred69_celluloid3205); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_celluloid

    // $ANTLR start synpred72_celluloid
    public final void synpred72_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:317:11: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:317:11: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred72_celluloid3293); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_celluloid

    // $ANTLR start synpred74_celluloid
    public final void synpred74_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:328:65: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:328:65: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred74_celluloid3443); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred74_celluloid

    // Delegated rules

    public final boolean synpred47_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA20 dfa20 = new DFA20(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA40 dfa40 = new DFA40(this);
    static final String DFA20_eotS =
        "\12\uffff";
    static final String DFA20_eofS =
        "\12\uffff";
    static final String DFA20_minS =
        "\1\54\4\uffff\1\0\4\uffff";
    static final String DFA20_maxS =
        "\1\132\4\uffff\1\0\4\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\3\uffff\1\3\1\4\1\5";
    static final String DFA20_specialS =
        "\5\uffff\1\0\4\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\5\2\uffff\1\3\1\1\5\uffff\3\3\25\uffff\1\7\1\10\5\uffff"+
            "\1\1\1\uffff\1\3\2\uffff\1\3",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
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
            return "161:1: functionPredicateBlockDeclaration : ( variableDeclaration | expression | inStatement | ifStatement | functionPredicateCall );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_5 = input.LA(1);

                         
                        int index20_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_celluloid()) ) {s = 3;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index20_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\12\uffff";
    static final String DFA29_eofS =
        "\12\uffff";
    static final String DFA29_minS =
        "\1\54\4\uffff\1\0\4\uffff";
    static final String DFA29_maxS =
        "\1\132\4\uffff\1\0\4\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\3\uffff\1\3\1\4\1\5";
    static final String DFA29_specialS =
        "\5\uffff\1\0\4\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\5\2\uffff\1\3\1\1\5\uffff\3\3\25\uffff\1\7\1\10\5\uffff"+
            "\1\1\1\uffff\1\3\2\uffff\1\3",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
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
            return "233:1: ifBlockDeclaration : ( variableDeclaration | expression | inStatement | ifStatement | functionPredicateCall );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_5 = input.LA(1);

                         
                        int index29_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_celluloid()) ) {s = 3;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index29_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA40_eotS =
        "\16\uffff";
    static final String DFA40_eofS =
        "\1\6\15\uffff";
    static final String DFA40_minS =
        "\1\53\4\0\11\uffff";
    static final String DFA40_maxS =
        "\1\132\4\0\11\uffff";
    static final String DFA40_acceptS =
        "\5\uffff\1\1\1\2\7\uffff";
    static final String DFA40_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\11\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\6\1\3\1\uffff\1\6\1\2\1\6\5\uffff\3\2\12\uffff\1\6\6\uffff"+
            "\1\5\7\uffff\2\6\1\uffff\1\6\1\uffff\1\1\2\uffff\1\4",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "268:49: ( expressionList )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_1 = input.LA(1);

                         
                        int index40_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_celluloid()) ) {s = 5;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index40_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA40_2 = input.LA(1);

                         
                        int index40_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_celluloid()) ) {s = 5;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index40_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA40_3 = input.LA(1);

                         
                        int index40_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_celluloid()) ) {s = 5;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index40_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA40_4 = input.LA(1);

                         
                        int index40_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_celluloid()) ) {s = 5;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index40_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_eventDefinition_in_program287 = new BitSet(new long[]{0x01C1980000000002L,0x0000000004A0D292L});
    public static final BitSet FOLLOW_NEWLINE_in_program301 = new BitSet(new long[]{0x01C1980000000002L,0x0000000004A0D290L});
    public static final BitSet FOLLOW_constraintDefinition_in_program318 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_program320 = new BitSet(new long[]{0x01C1980000000002L,0x0000000004A0D290L});
    public static final BitSet FOLLOW_NEWLINE_in_program333 = new BitSet(new long[]{0x01C1980000000002L,0x0000000004A0D280L});
    public static final BitSet FOLLOW_deviceDefinition_in_program351 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_program353 = new BitSet(new long[]{0x01C1980000000002L,0x0000000004A0D280L});
    public static final BitSet FOLLOW_NEWLINE_in_program366 = new BitSet(new long[]{0x01C1980000000002L,0x0000000004A0D200L});
    public static final BitSet FOLLOW_functionDefinition_in_program383 = new BitSet(new long[]{0x01C1980000000002L,0x0000000004A0D200L});
    public static final BitSet FOLLOW_predicateDefinition_in_program402 = new BitSet(new long[]{0x01C1980000000002L,0x0000000004A0D200L});
    public static final BitSet FOLLOW_NEWLINE_in_program416 = new BitSet(new long[]{0x01C1980000000002L,0x0000000004A0D200L});
    public static final BitSet FOLLOW_NEWLINE_in_program429 = new BitSet(new long[]{0x01C1980000000002L,0x0000000004A0C000L});
    public static final BitSet FOLLOW_functionPredicateBlockDeclaration_in_program446 = new BitSet(new long[]{0x01C1980000000002L,0x0000000004A0C000L});
    public static final BitSet FOLLOW_NEWLINE_in_program459 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_65_in_eventDefinition619 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_eventDefinition621 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_eventDefinition623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_announcementDeclaration682 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_announcementDeclaration688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_announcementDeclaration690 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_announcementDeclaration696 = new BitSet(new long[]{0x0001080000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_variableDeclaration_in_announcementDeclaration703 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_announcementDeclaration707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_constraintDefinition755 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_constraintDefinition757 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_constraintDefinition760 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_idList_in_constraintDefinition766 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_70_in_constraintDefinition780 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_idList_in_constraintDefinition786 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_constraintBlock_in_constraintDefinition800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_constraintBlock888 = new BitSet(new long[]{0x0001400000000000L,0x0000000000201204L});
    public static final BitSet FOLLOW_constraintBlockDeclaration_in_constraintBlock909 = new BitSet(new long[]{0x0001400000000000L,0x0000000000201204L});
    public static final BitSet FOLLOW_announcementDeclaration_in_constraintBlock917 = new BitSet(new long[]{0x0001400000000000L,0x0000000000201204L});
    public static final BitSet FOLLOW_END_in_constraintBlock930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_constraintBlockDeclaration975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicateHeader_in_constraintBlockDeclaration986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionHeader_in_constraintBlockDeclaration997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_deviceDefinition1030 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_deviceDefinition1032 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_deviceDefinition1035 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_idList_in_deviceDefinition1041 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_deviceBlock_in_deviceDefinition1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_deviceBlock1102 = new BitSet(new long[]{0x0001400000000000L,0x0000000000201200L});
    public static final BitSet FOLLOW_deviceBlockDeclaration_in_deviceBlock1124 = new BitSet(new long[]{0x0001400000000000L,0x0000000000201200L});
    public static final BitSet FOLLOW_END_in_deviceBlock1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_deviceBlockDeclaration1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicateDefinition_in_deviceBlockDeclaration1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDefinition_in_deviceBlockDeclaration1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_functionHeader1223 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_functionHeader1225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_functionHeader1227 = new BitSet(new long[]{0x0001000000000000L,0x0000000000200400L});
    public static final BitSet FOLLOW_variableList_in_functionHeader1229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_functionHeader1231 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_functionHeader1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_functionDefinition1276 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_functionDefinition1278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_functionDefinition1280 = new BitSet(new long[]{0x0001000000000000L,0x0000000000200400L});
    public static final BitSet FOLLOW_variableList_in_functionDefinition1282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_functionDefinition1284 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_functionBlock_in_functionDefinition1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_functionBlock1348 = new BitSet(new long[]{0x01C1D80000000000L,0x0000000004A0C000L});
    public static final BitSet FOLLOW_functionPredicateBlockDeclaration_in_functionBlock1368 = new BitSet(new long[]{0x01C1D80000000000L,0x0000000004A0C000L});
    public static final BitSet FOLLOW_NEWLINE_in_functionBlock1372 = new BitSet(new long[]{0x01C1D80000000000L,0x0000000004A0C000L});
    public static final BitSet FOLLOW_END_in_functionBlock1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_functionPredicateBlockDeclaration1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_functionPredicateBlockDeclaration1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inStatement_in_functionPredicateBlockDeclaration1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_functionPredicateBlockDeclaration1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionPredicateCall_in_functionPredicateBlockDeclaration1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_predicateHeader1533 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_predicateHeader1535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_predicateHeader1537 = new BitSet(new long[]{0x0001000000000000L,0x0000000000200400L});
    public static final BitSet FOLLOW_variableList_in_predicateHeader1539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_predicateHeader1541 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_predicateHeader1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_predicateDefinition1597 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_predicateDefinition1599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_predicateDefinition1601 = new BitSet(new long[]{0x0001000000000000L,0x0000000000200400L});
    public static final BitSet FOLLOW_variableList_in_predicateDefinition1603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_predicateDefinition1605 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_predicateBlock_in_predicateDefinition1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_predicateBlock1675 = new BitSet(new long[]{0x01C1980000000000L,0x0000000004A0E000L});
    public static final BitSet FOLLOW_functionPredicateBlockDeclaration_in_predicateBlock1694 = new BitSet(new long[]{0x01C1980000000000L,0x0000000004A0E000L});
    public static final BitSet FOLLOW_NEWLINE_in_predicateBlock1698 = new BitSet(new long[]{0x01C1980000000000L,0x0000000004A0E000L});
    public static final BitSet FOLLOW_77_in_predicateBlock1715 = new BitSet(new long[]{0x01C0900000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_expression_in_predicateBlock1721 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_END_in_predicateBlock1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_inStatement1801 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_inStatement1803 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_inBlock_in_inStatement1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_inBlock1849 = new BitSet(new long[]{0x0000580000000000L,0x00000000000C0008L});
    public static final BitSet FOLLOW_inBlockDeclaration_in_inBlock1868 = new BitSet(new long[]{0x0000580000000000L,0x00000000000C0008L});
    public static final BitSet FOLLOW_NEWLINE_in_inBlock1872 = new BitSet(new long[]{0x0000580000000000L,0x00000000000C0008L});
    public static final BitSet FOLLOW_END_in_inBlock1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whenStatement_in_inBlockDeclaration1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_everyStatement_in_inBlockDeclaration1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraintFunctionCall_in_inBlockDeclaration1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ifStatement1958 = new BitSet(new long[]{0x01C0900000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_logicalORExpression_in_ifStatement1965 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ifBlock_in_ifStatement1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_ifBlock2014 = new BitSet(new long[]{0x01C1900000000000L,0x0000000004A0C000L});
    public static final BitSet FOLLOW_ifBlockDeclaration_in_ifBlock2033 = new BitSet(new long[]{0x01C1D00000000000L,0x0000000004A3C000L});
    public static final BitSet FOLLOW_elseIfStatement_in_ifBlock2054 = new BitSet(new long[]{0x0000400000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_elseStatement_in_ifBlock2070 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_END_in_ifBlock2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_elseIfStatement2136 = new BitSet(new long[]{0x01C0900000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_logicalORExpression_in_elseIfStatement2142 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_elseIfStatement2144 = new BitSet(new long[]{0x01C1900000000000L,0x0000000004A0C000L});
    public static final BitSet FOLLOW_ifBlockDeclaration_in_elseIfStatement2162 = new BitSet(new long[]{0x01C1900000000002L,0x0000000004A0C000L});
    public static final BitSet FOLLOW_81_in_elseStatement2205 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_elseStatement2207 = new BitSet(new long[]{0x01C1900000000002L,0x0000000004A0C000L});
    public static final BitSet FOLLOW_ifBlockDeclaration_in_elseStatement2214 = new BitSet(new long[]{0x01C1900000000002L,0x0000000004A0C000L});
    public static final BitSet FOLLOW_variableDeclaration_in_ifBlockDeclaration2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_ifBlockDeclaration2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inStatement_in_ifBlockDeclaration2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_ifBlockDeclaration2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionPredicateCall_in_ifBlockDeclaration2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_whenStatement2315 = new BitSet(new long[]{0x01C0900000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_82_in_whenStatement2323 = new BitSet(new long[]{0x01C0900000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_ID_in_whenStatement2331 = new BitSet(new long[]{0x01C0900000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_logicalORExpression_in_whenStatement2340 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ID_in_whenStatement2348 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_listenerBlock_in_whenStatement2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_everyStatement2435 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_TIME_in_everyStatement2437 = new BitSet(new long[]{0x0000200000000000L,0x0000000000040008L});
    public static final BitSet FOLLOW_67_in_everyStatement2454 = new BitSet(new long[]{0x01C0900000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_82_in_everyStatement2462 = new BitSet(new long[]{0x01C0900000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_ID_in_everyStatement2470 = new BitSet(new long[]{0x01C0900000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_logicalORExpression_in_everyStatement2479 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ID_in_everyStatement2487 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_listenerBlock_in_everyStatement2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_listenerBlock2579 = new BitSet(new long[]{0x01C1D00000000000L,0x0000000004AC0008L});
    public static final BitSet FOLLOW_listenerBlockDeclaration_in_listenerBlock2597 = new BitSet(new long[]{0x01C1D00000000000L,0x0000000004AC0008L});
    public static final BitSet FOLLOW_END_in_listenerBlock2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraintFunctionCall_in_listenerBlockDeclaration2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_listenerBlockDeclaration2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_listenerBlockDeclaration2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionPredicateCall_in_listenerBlockDeclaration2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_constraintFunctionCall2709 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_constraintFunctionCall2715 = new BitSet(new long[]{0x01C0980000000002L,0x0000000004900400L});
    public static final BitSet FOLLOW_84_in_constraintFunctionCall2718 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_constraintFunctionCall2724 = new BitSet(new long[]{0x01C0980000000002L,0x0000000004900400L});
    public static final BitSet FOLLOW_expressionList_in_constraintFunctionCall2728 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_constraintFunctionCall2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_functionPredicateCall2793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_functionPredicateCall2795 = new BitSet(new long[]{0x01C0900000000000L,0x0000000004800400L});
    public static final BitSet FOLLOW_expressionList_in_functionPredicateCall2797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_functionPredicateCall2799 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_functionPredicateCall2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idList2863 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_idList2866 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_idList2872 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_74_in_idList2900 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_idList2906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100800L});
    public static final BitSet FOLLOW_84_in_idList2909 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_idList2915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100800L});
    public static final BitSet FOLLOW_75_in_idList2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList2960 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_variableList2963 = new BitSet(new long[]{0x0001000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList2969 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_74_in_variableList3007 = new BitSet(new long[]{0x0001000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList3013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100800L});
    public static final BitSet FOLLOW_84_in_variableList3016 = new BitSet(new long[]{0x0001000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList3022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100800L});
    public static final BitSet FOLLOW_75_in_variableList3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList3075 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_expressionList3078 = new BitSet(new long[]{0x01C0900000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_expression_in_expressionList3084 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_74_in_expressionList3121 = new BitSet(new long[]{0x01C0900000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_expression_in_expressionList3127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100800L});
    public static final BitSet FOLLOW_84_in_expressionList3130 = new BitSet(new long[]{0x01C0900000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_expression_in_expressionList3136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100800L});
    public static final BitSet FOLLOW_75_in_expressionList3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_variableDeclaration3190 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_variableDeclaration3192 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_variableDeclaration3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_variableDeclaration3275 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_variableDeclaration3277 = new BitSet(new long[]{0x0000080000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_initializer_in_variableDeclaration3279 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_variableDeclaration3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_initializer3375 = new BitSet(new long[]{0x01C0900000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_logicalORExpression_in_initializer3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_expression3433 = new BitSet(new long[]{0x0002080000000002L});
    public static final BitSet FOLLOW_ASSIGNMENT_OPERATOR_in_expression3436 = new BitSet(new long[]{0x01C0900000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_expression_in_expression3439 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_expression3443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_logicalORExpression3500 = new BitSet(new long[]{0x01C0900000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression3503 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_logicalORExpression3506 = new BitSet(new long[]{0x01C0900000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalANDExpression3534 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_logicalANDExpression3537 = new BitSet(new long[]{0x01C0900000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalANDExpression3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3569 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_EQUALITY_OPERATOR_in_equalityExpression3572 = new BitSet(new long[]{0x01C0900000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_equalityExpression_in_equalityExpression3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression3602 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_RELATIONAL_OPERATOR_in_relationalExpression3605 = new BitSet(new long[]{0x01C0900000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_relationalExpression_in_relationalExpression3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3636 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ADDITIVE_OPERATOR_in_additiveExpression3639 = new BitSet(new long[]{0x01C0900000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_additiveExpression_in_additiveExpression3642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_multiplicativeExpression3662 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_MULTIPLICATIVE_OPERATOR_in_multiplicativeExpression3665 = new BitSet(new long[]{0x01C0900000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_multiplicativeExpression3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primaryExpression3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_primaryExpression3713 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_primaryExpression3715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_primaryExpression3717 = new BitSet(new long[]{0x01C0900000000000L,0x0000000004800400L});
    public static final BitSet FOLLOW_expressionList_in_primaryExpression3719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_primaryExpression3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionPredicateCall_in_primaryExpression3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred2_celluloid301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred4_celluloid333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred6_celluloid366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred9_celluloid416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred10_celluloid429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred27_celluloid1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred42_celluloid2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_synpred47_celluloid2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_synpred50_celluloid2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraintFunctionCall_in_synpred53_celluloid2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred54_celluloid2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_synpred57_celluloid2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred58_celluloid2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred59_celluloid2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred69_celluloid3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred72_celluloid3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred74_celluloid3443 = new BitSet(new long[]{0x0000000000000002L});

}