// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g 2009-12-19 17:21:32
 
  import java.util.HashMap;  


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
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
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("celluloidWalkerTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return celluloidWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g"; }


      private class SymbolEntry {
        private String name;
        private String type;
        
        public SymbolEntry(String name, String type) {
          this.name = name;
          this.type = type;
        }
        
        public String getName() {
          return this.name;
        }
        
        public String getType() {
          return this.type;
        }
      }

      private HashMap<String, SymbolEntry> symbolTable;  


    public static class program_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "program"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:37:1: program : ^( PROGRAM ^( EVENTS eventDefinition ( NEWLINE )* ) ^( CONSTRAINTS constraintDefinition ( NEWLINE )* ) ^( DEVICES deviceDefinition ( NEWLINE )* ) ^( FUNCTIONS ( functionDefinition | predicateDefinition )* ) ^( PROGBLOCK ( functionPredicateBlockDeclaration )* ) ) ;
    public final celluloidWalker.program_return program() throws RecognitionException {
        celluloidWalker.program_return retval = new celluloidWalker.program_return();
        retval.start = input.LT(1);


          this.symbolTable = new HashMap<String, SymbolEntry>();

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:41:5: ( ^( PROGRAM ^( EVENTS eventDefinition ( NEWLINE )* ) ^( CONSTRAINTS constraintDefinition ( NEWLINE )* ) ^( DEVICES deviceDefinition ( NEWLINE )* ) ^( FUNCTIONS ( functionDefinition | predicateDefinition )* ) ^( PROGBLOCK ( functionPredicateBlockDeclaration )* ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:41:10: ^( PROGRAM ^( EVENTS eventDefinition ( NEWLINE )* ) ^( CONSTRAINTS constraintDefinition ( NEWLINE )* ) ^( DEVICES deviceDefinition ( NEWLINE )* ) ^( FUNCTIONS ( functionDefinition | predicateDefinition )* ) ^( PROGBLOCK ( functionPredicateBlockDeclaration )* ) )
            {
            match(input,PROGRAM,FOLLOW_PROGRAM_in_program63); 

            match(input, Token.DOWN, null); 
            match(input,EVENTS,FOLLOW_EVENTS_in_program80); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventDefinition_in_program82);
            eventDefinition();

            state._fsp--;

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:42:39: ( NEWLINE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NEWLINE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:42:39: NEWLINE
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_program84); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input, Token.UP, null); 
            match(input,CONSTRAINTS,FOLLOW_CONSTRAINTS_in_program102); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_constraintDefinition_in_program104);
            constraintDefinition();

            state._fsp--;

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:43:49: ( NEWLINE )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NEWLINE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:43:49: NEWLINE
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_program106); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input, Token.UP, null); 
            match(input,DEVICES,FOLLOW_DEVICES_in_program124); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_deviceDefinition_in_program126);
            deviceDefinition();

            state._fsp--;

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:44:41: ( NEWLINE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NEWLINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:44:41: NEWLINE
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_program128); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input, Token.UP, null); 
            match(input,FUNCTIONS,FOLLOW_FUNCTIONS_in_program146); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:45:26: ( functionDefinition | predicateDefinition )*
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
                	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:45:27: functionDefinition
                	    {
                	    pushFollow(FOLLOW_functionDefinition_in_program149);
                	    functionDefinition();

                	    state._fsp--;


                	    }
                	    break;
                	case 2 :
                	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:45:48: predicateDefinition
                	    {
                	    pushFollow(FOLLOW_predicateDefinition_in_program153);
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
            match(input,PROGBLOCK,FOLLOW_PROGBLOCK_in_program172); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:46:26: ( functionPredicateBlockDeclaration )*
                loop5:
                do {
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==VARDEF||LA5_0==ARG||LA5_0==CALL||LA5_0==IF||LA5_0==IN||LA5_0==ASSIGNMENT_OPERATOR) ) {
                        alt5=1;
                    }


                    switch (alt5) {
                	case 1 :
                	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:46:26: functionPredicateBlockDeclaration
                	    {
                	    pushFollow(FOLLOW_functionPredicateBlockDeclaration_in_program174);
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
        return retval;
    }
    // $ANTLR end "program"

    public static class eventDefinition_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "eventDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:50:1: eventDefinition : ^( EVENT ID ) ;
    public final celluloidWalker.eventDefinition_return eventDefinition() throws RecognitionException {
        celluloidWalker.eventDefinition_return retval = new celluloidWalker.eventDefinition_return();
        retval.start = input.LT(1);

        CommonTree ID1=null;

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:51:5: ( ^( EVENT ID ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:51:10: ^( EVENT ID )
            {
            match(input,EVENT,FOLLOW_EVENT_in_eventDefinition200); 

            match(input, Token.DOWN, null); 
            ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_eventDefinition202); 

            match(input, Token.UP, null); 

                       retval.st = templateLib.getInstanceOf("eventDefinition");
                       (retval.st).setAttribute("name", (ID1!=null?ID1.getText():null));
                       this.symbolTable.put((ID1!=null?ID1.getText():null), new SymbolEntry((ID1!=null?ID1.getText():null), "event"));
                     

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "eventDefinition"

    public static class announcementDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "announcementDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:59:1: announcementDeclaration : ^( ANNOUNCEMENT ID ID ( variableDeclaration )? ) ;
    public final celluloidWalker.announcementDeclaration_return announcementDeclaration() throws RecognitionException {
        celluloidWalker.announcementDeclaration_return retval = new celluloidWalker.announcementDeclaration_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:60:5: ( ^( ANNOUNCEMENT ID ID ( variableDeclaration )? ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:60:10: ^( ANNOUNCEMENT ID ID ( variableDeclaration )? )
            {
            match(input,ANNOUNCEMENT,FOLLOW_ANNOUNCEMENT_in_announcementDeclaration227); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_announcementDeclaration229); 
            match(input,ID,FOLLOW_ID_in_announcementDeclaration231); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:60:31: ( variableDeclaration )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==VARDEF||LA6_0==ARG) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:60:31: variableDeclaration
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_announcementDeclaration233);
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
        return retval;
    }
    // $ANTLR end "announcementDeclaration"

    public static class constraintDefinition_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "constraintDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:63:1: constraintDefinition : ^( CONSTRAINT ID ^( REQUIRES (requires= idList )? ) ^( ANNOUNCES (announces= idList )? ) constraintBlock ) ;
    public final celluloidWalker.constraintDefinition_return constraintDefinition() throws RecognitionException {
        celluloidWalker.constraintDefinition_return retval = new celluloidWalker.constraintDefinition_return();
        retval.start = input.LT(1);

        CommonTree ID2=null;
        celluloidWalker.idList_return requires = null;

        celluloidWalker.idList_return announces = null;


        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:64:5: ( ^( CONSTRAINT ID ^( REQUIRES (requires= idList )? ) ^( ANNOUNCES (announces= idList )? ) constraintBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:64:10: ^( CONSTRAINT ID ^( REQUIRES (requires= idList )? ) ^( ANNOUNCES (announces= idList )? ) constraintBlock )
            {
            match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_constraintDefinition257); 

            match(input, Token.DOWN, null); 
            ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_constraintDefinition259); 
            match(input,REQUIRES,FOLLOW_REQUIRES_in_constraintDefinition262); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:64:46: (requires= idList )?
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ID) ) {
                    alt7=1;
                }
                switch (alt7) {
                    case 1 :
                        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:64:46: requires= idList
                        {
                        pushFollow(FOLLOW_idList_in_constraintDefinition268);
                        requires=idList();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            match(input,ANNOUNCES,FOLLOW_ANNOUNCES_in_constraintDefinition273); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:64:79: (announces= idList )?
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ID) ) {
                    alt8=1;
                }
                switch (alt8) {
                    case 1 :
                        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:64:79: announces= idList
                        {
                        pushFollow(FOLLOW_idList_in_constraintDefinition279);
                        announces=idList();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            pushFollow(FOLLOW_constraintBlock_in_constraintDefinition283);
            constraintBlock();

            state._fsp--;


            match(input, Token.UP, null); 

                       retval.st = templateLib.getInstanceOf("constraintDefinition");
                       (retval.st).setAttribute("name", (ID2!=null?ID2.getText():null));
                       (retval.st).setAttribute("requires", (requires!=null?requires.st:null));
                       
                       System.out.println(announces);
                     

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constraintDefinition"

    public static class constraintBlock_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "constraintBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:72:1: constraintBlock : ^( CONBLOCK ( constraintBlockDeclaration )* ^( ANNOUNCEMENTS ( announcementDeclaration )* ) ) ;
    public final celluloidWalker.constraintBlock_return constraintBlock() throws RecognitionException {
        celluloidWalker.constraintBlock_return retval = new celluloidWalker.constraintBlock_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:73:5: ( ^( CONBLOCK ( constraintBlockDeclaration )* ^( ANNOUNCEMENTS ( announcementDeclaration )* ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:73:10: ^( CONBLOCK ( constraintBlockDeclaration )* ^( ANNOUNCEMENTS ( announcementDeclaration )* ) )
            {
            match(input,CONBLOCK,FOLLOW_CONBLOCK_in_constraintBlock307); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:73:21: ( constraintBlockDeclaration )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==VARDEF||LA9_0==ARG||(LA9_0>=FUNHEAD && LA9_0<=PREDHEAD)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:73:21: constraintBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_constraintBlockDeclaration_in_constraintBlock309);
            	    constraintBlockDeclaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,ANNOUNCEMENTS,FOLLOW_ANNOUNCEMENTS_in_constraintBlock313); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:73:65: ( announcementDeclaration )*
                loop10:
                do {
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ANNOUNCEMENT) ) {
                        alt10=1;
                    }


                    switch (alt10) {
                	case 1 :
                	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:73:65: announcementDeclaration
                	    {
                	    pushFollow(FOLLOW_announcementDeclaration_in_constraintBlock315);
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
        return retval;
    }
    // $ANTLR end "constraintBlock"

    public static class constraintBlockDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "constraintBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:75:1: constraintBlockDeclaration : ( variableDeclaration | predicateHeader | functionHeader );
    public final celluloidWalker.constraintBlockDeclaration_return constraintBlockDeclaration() throws RecognitionException {
        celluloidWalker.constraintBlockDeclaration_return retval = new celluloidWalker.constraintBlockDeclaration_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:76:5: ( variableDeclaration | predicateHeader | functionHeader )
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:76:8: variableDeclaration
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_constraintBlockDeclaration340);
                    variableDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:77:10: predicateHeader
                    {
                    pushFollow(FOLLOW_predicateHeader_in_constraintBlockDeclaration352);
                    predicateHeader();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:78:10: functionHeader
                    {
                    pushFollow(FOLLOW_functionHeader_in_constraintBlockDeclaration364);
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
        return retval;
    }
    // $ANTLR end "constraintBlockDeclaration"

    public static class deviceDefinition_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "deviceDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:82:1: deviceDefinition : ^( DEVICE ID ^( ACCEPTS ( idList )? ) deviceBlock ) ;
    public final celluloidWalker.deviceDefinition_return deviceDefinition() throws RecognitionException {
        celluloidWalker.deviceDefinition_return retval = new celluloidWalker.deviceDefinition_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:83:5: ( ^( DEVICE ID ^( ACCEPTS ( idList )? ) deviceBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:83:10: ^( DEVICE ID ^( ACCEPTS ( idList )? ) deviceBlock )
            {
            match(input,DEVICE,FOLLOW_DEVICE_in_deviceDefinition396); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_deviceDefinition398); 
            match(input,ACCEPTS,FOLLOW_ACCEPTS_in_deviceDefinition401); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:83:33: ( idList )?
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==ID) ) {
                    alt12=1;
                }
                switch (alt12) {
                    case 1 :
                        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:83:33: idList
                        {
                        pushFollow(FOLLOW_idList_in_deviceDefinition404);
                        idList();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            pushFollow(FOLLOW_deviceBlock_in_deviceDefinition408);
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
        return retval;
    }
    // $ANTLR end "deviceDefinition"

    public static class deviceBlock_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "deviceBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:85:1: deviceBlock : ^( DEVBLOCK ( deviceBlockDeclaration )* ) ;
    public final celluloidWalker.deviceBlock_return deviceBlock() throws RecognitionException {
        celluloidWalker.deviceBlock_return retval = new celluloidWalker.deviceBlock_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:86:5: ( ^( DEVBLOCK ( deviceBlockDeclaration )* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:86:10: ^( DEVBLOCK ( deviceBlockDeclaration )* )
            {
            match(input,DEVBLOCK,FOLLOW_DEVBLOCK_in_deviceBlock430); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:86:21: ( deviceBlockDeclaration )*
                loop13:
                do {
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=VARDEF && LA13_0<=ARG)) ) {
                        alt13=1;
                    }


                    switch (alt13) {
                	case 1 :
                	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:86:21: deviceBlockDeclaration
                	    {
                	    pushFollow(FOLLOW_deviceBlockDeclaration_in_deviceBlock432);
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
        return retval;
    }
    // $ANTLR end "deviceBlock"

    public static class deviceBlockDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "deviceBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:88:1: deviceBlockDeclaration : ( variableDeclaration | predicateDefinition | functionDefinition );
    public final celluloidWalker.deviceBlockDeclaration_return deviceBlockDeclaration() throws RecognitionException {
        celluloidWalker.deviceBlockDeclaration_return retval = new celluloidWalker.deviceBlockDeclaration_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:89:5: ( variableDeclaration | predicateDefinition | functionDefinition )
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:89:10: variableDeclaration
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_deviceBlockDeclaration453);
                    variableDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:90:10: predicateDefinition
                    {
                    pushFollow(FOLLOW_predicateDefinition_in_deviceBlockDeclaration465);
                    predicateDefinition();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:91:10: functionDefinition
                    {
                    pushFollow(FOLLOW_functionDefinition_in_deviceBlockDeclaration477);
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
        return retval;
    }
    // $ANTLR end "deviceBlockDeclaration"

    public static class functionHeader_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionHeader"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:95:1: functionHeader : ^( FUNHEAD ID ^( ARGS variableList ) ) ;
    public final celluloidWalker.functionHeader_return functionHeader() throws RecognitionException {
        celluloidWalker.functionHeader_return retval = new celluloidWalker.functionHeader_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:96:5: ( ^( FUNHEAD ID ^( ARGS variableList ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:96:10: ^( FUNHEAD ID ^( ARGS variableList ) )
            {
            match(input,FUNHEAD,FOLLOW_FUNHEAD_in_functionHeader504); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_functionHeader506); 
            match(input,ARGS,FOLLOW_ARGS_in_functionHeader509); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variableList_in_functionHeader511);
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
        return retval;
    }
    // $ANTLR end "functionHeader"

    public static class functionDefinition_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:98:1: functionDefinition : ^( FUNC ID ^( ARGS variableList ) ( functionBlock )? ) ;
    public final celluloidWalker.functionDefinition_return functionDefinition() throws RecognitionException {
        celluloidWalker.functionDefinition_return retval = new celluloidWalker.functionDefinition_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:99:5: ( ^( FUNC ID ^( ARGS variableList ) ( functionBlock )? ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:99:10: ^( FUNC ID ^( ARGS variableList ) ( functionBlock )? )
            {
            match(input,FUNC,FOLLOW_FUNC_in_functionDefinition534); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_functionDefinition536); 
            match(input,ARGS,FOLLOW_ARGS_in_functionDefinition539); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variableList_in_functionDefinition541);
            variableList();

            state._fsp--;


            match(input, Token.UP, null); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:99:41: ( functionBlock )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==FUNBLOCK) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:99:41: functionBlock
                    {
                    pushFollow(FOLLOW_functionBlock_in_functionDefinition544);
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
        return retval;
    }
    // $ANTLR end "functionDefinition"

    public static class functionBlock_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:101:1: functionBlock : ^( FUNBLOCK RETURN ( functionPredicateBlockDeclaration )* ) ;
    public final celluloidWalker.functionBlock_return functionBlock() throws RecognitionException {
        celluloidWalker.functionBlock_return retval = new celluloidWalker.functionBlock_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:102:5: ( ^( FUNBLOCK RETURN ( functionPredicateBlockDeclaration )* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:102:10: ^( FUNBLOCK RETURN ( functionPredicateBlockDeclaration )* )
            {
            match(input,FUNBLOCK,FOLLOW_FUNBLOCK_in_functionBlock572); 

            match(input, Token.DOWN, null); 
            match(input,RETURN,FOLLOW_RETURN_in_functionBlock574); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:102:28: ( functionPredicateBlockDeclaration )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==VARDEF||LA16_0==ARG||LA16_0==CALL||LA16_0==IF||LA16_0==IN||LA16_0==ASSIGNMENT_OPERATOR) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:102:28: functionPredicateBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_functionPredicateBlockDeclaration_in_functionBlock576);
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
        return retval;
    }
    // $ANTLR end "functionBlock"

    public static class functionPredicateBlockDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionPredicateBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:104:1: functionPredicateBlockDeclaration : ( variableDeclaration | expression | inStatement | ifStatement | functionPredicateCall );
    public final celluloidWalker.functionPredicateBlockDeclaration_return functionPredicateBlockDeclaration() throws RecognitionException {
        celluloidWalker.functionPredicateBlockDeclaration_return retval = new celluloidWalker.functionPredicateBlockDeclaration_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:105:5: ( variableDeclaration | expression | inStatement | ifStatement | functionPredicateCall )
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:105:10: variableDeclaration
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_functionPredicateBlockDeclaration599);
                    variableDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:106:10: expression
                    {
                    pushFollow(FOLLOW_expression_in_functionPredicateBlockDeclaration610);
                    expression();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:107:10: inStatement
                    {
                    pushFollow(FOLLOW_inStatement_in_functionPredicateBlockDeclaration621);
                    inStatement();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:108:10: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_functionPredicateBlockDeclaration633);
                    ifStatement();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:109:10: functionPredicateCall
                    {
                    pushFollow(FOLLOW_functionPredicateCall_in_functionPredicateBlockDeclaration644);
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
        return retval;
    }
    // $ANTLR end "functionPredicateBlockDeclaration"

    public static class predicateHeader_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "predicateHeader"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:112:1: predicateHeader : ^( PREDHEAD ID ^( ARGS variableList ) ) ;
    public final celluloidWalker.predicateHeader_return predicateHeader() throws RecognitionException {
        celluloidWalker.predicateHeader_return retval = new celluloidWalker.predicateHeader_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:113:5: ( ^( PREDHEAD ID ^( ARGS variableList ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:113:10: ^( PREDHEAD ID ^( ARGS variableList ) )
            {
            match(input,PREDHEAD,FOLLOW_PREDHEAD_in_predicateHeader670); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_predicateHeader672); 
            match(input,ARGS,FOLLOW_ARGS_in_predicateHeader675); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variableList_in_predicateHeader677);
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
        return retval;
    }
    // $ANTLR end "predicateHeader"

    public static class predicateDefinition_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "predicateDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:115:1: predicateDefinition : ^( PRED ID ^( ARGS variableList ) predicateBlock ) ;
    public final celluloidWalker.predicateDefinition_return predicateDefinition() throws RecognitionException {
        celluloidWalker.predicateDefinition_return retval = new celluloidWalker.predicateDefinition_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:116:5: ( ^( PRED ID ^( ARGS variableList ) predicateBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:116:10: ^( PRED ID ^( ARGS variableList ) predicateBlock )
            {
            match(input,PRED,FOLLOW_PRED_in_predicateDefinition704); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_predicateDefinition706); 
            match(input,ARGS,FOLLOW_ARGS_in_predicateDefinition709); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variableList_in_predicateDefinition711);
            variableList();

            state._fsp--;


            match(input, Token.UP, null); 
            pushFollow(FOLLOW_predicateBlock_in_predicateDefinition714);
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
        return retval;
    }
    // $ANTLR end "predicateDefinition"

    public static class predicateBlock_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "predicateBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:118:1: predicateBlock : ^( FUNBLOCK ^( RETURN expression ) ( functionPredicateBlockDeclaration )* ) ;
    public final celluloidWalker.predicateBlock_return predicateBlock() throws RecognitionException {
        celluloidWalker.predicateBlock_return retval = new celluloidWalker.predicateBlock_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:119:5: ( ^( FUNBLOCK ^( RETURN expression ) ( functionPredicateBlockDeclaration )* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:119:10: ^( FUNBLOCK ^( RETURN expression ) ( functionPredicateBlockDeclaration )* )
            {
            match(input,FUNBLOCK,FOLLOW_FUNBLOCK_in_predicateBlock746); 

            match(input, Token.DOWN, null); 
            match(input,RETURN,FOLLOW_RETURN_in_predicateBlock749); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_predicateBlock751);
            expression();

            state._fsp--;


            match(input, Token.UP, null); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:119:42: ( functionPredicateBlockDeclaration )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==VARDEF||LA18_0==ARG||LA18_0==CALL||LA18_0==IF||LA18_0==IN||LA18_0==ASSIGNMENT_OPERATOR) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:119:42: functionPredicateBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_functionPredicateBlockDeclaration_in_predicateBlock754);
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
        return retval;
    }
    // $ANTLR end "predicateBlock"

    public static class inStatement_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "inStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:123:1: inStatement : ^( IN ID inBlock ) ;
    public final celluloidWalker.inStatement_return inStatement() throws RecognitionException {
        celluloidWalker.inStatement_return retval = new celluloidWalker.inStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:124:5: ( ^( IN ID inBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:124:8: ^( IN ID inBlock )
            {
            match(input,IN,FOLLOW_IN_in_inStatement777); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_inStatement779); 
            pushFollow(FOLLOW_inBlock_in_inStatement781);
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
        return retval;
    }
    // $ANTLR end "inStatement"

    public static class inBlock_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "inBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:127:1: inBlock : ^( INBLOCK ( inBlockDeclaration )* ) ;
    public final celluloidWalker.inBlock_return inBlock() throws RecognitionException {
        celluloidWalker.inBlock_return retval = new celluloidWalker.inBlock_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:128:5: ( ^( INBLOCK ( inBlockDeclaration )* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:128:7: ^( INBLOCK ( inBlockDeclaration )* )
            {
            match(input,INBLOCK,FOLLOW_INBLOCK_in_inBlock809); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:128:17: ( inBlockDeclaration )*
                loop19:
                do {
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==OBJCALL||LA19_0==LISTENER) ) {
                        alt19=1;
                    }


                    switch (alt19) {
                	case 1 :
                	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:128:17: inBlockDeclaration
                	    {
                	    pushFollow(FOLLOW_inBlockDeclaration_in_inBlock811);
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
        return retval;
    }
    // $ANTLR end "inBlock"

    public static class inBlockDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "inBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:130:1: inBlockDeclaration : ( whenStatement | everyStatement | constraintFunctionCall );
    public final celluloidWalker.inBlockDeclaration_return inBlockDeclaration() throws RecognitionException {
        celluloidWalker.inBlockDeclaration_return retval = new celluloidWalker.inBlockDeclaration_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:131:5: ( whenStatement | everyStatement | constraintFunctionCall )
            int alt20=3;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:131:7: whenStatement
                    {
                    pushFollow(FOLLOW_whenStatement_in_inBlockDeclaration830);
                    whenStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:132:9: everyStatement
                    {
                    pushFollow(FOLLOW_everyStatement_in_inBlockDeclaration841);
                    everyStatement();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:133:9: constraintFunctionCall
                    {
                    pushFollow(FOLLOW_constraintFunctionCall_in_inBlockDeclaration852);
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
        return retval;
    }
    // $ANTLR end "inBlockDeclaration"

    public static class ifStatement_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ifStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:136:1: ifStatement : ^( IF logicalORExpression ifBlock ) ;
    public final celluloidWalker.ifStatement_return ifStatement() throws RecognitionException {
        celluloidWalker.ifStatement_return retval = new celluloidWalker.ifStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:137:5: ( ^( IF logicalORExpression ifBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:137:8: ^( IF logicalORExpression ifBlock )
            {
            match(input,IF,FOLLOW_IF_in_ifStatement871); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_logicalORExpression_in_ifStatement873);
            logicalORExpression();

            state._fsp--;

            pushFollow(FOLLOW_ifBlock_in_ifStatement875);
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
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class ifBlock_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ifBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:139:1: ifBlock : ^( IFBLOCK ( ifBlockDeclaration )+ ) ^( ELSEIF ( elseIfStatement )* ) ^( ELSE ( elseStatement )? ) ;
    public final celluloidWalker.ifBlock_return ifBlock() throws RecognitionException {
        celluloidWalker.ifBlock_return retval = new celluloidWalker.ifBlock_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:140:5: ( ^( IFBLOCK ( ifBlockDeclaration )+ ) ^( ELSEIF ( elseIfStatement )* ) ^( ELSE ( elseStatement )? ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:140:9: ^( IFBLOCK ( ifBlockDeclaration )+ ) ^( ELSEIF ( elseIfStatement )* ) ^( ELSE ( elseStatement )? )
            {
            match(input,IFBLOCK,FOLLOW_IFBLOCK_in_ifBlock895); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:140:19: ( ifBlockDeclaration )+
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
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:140:19: ifBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_ifBlockDeclaration_in_ifBlock897);
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
            match(input,ELSEIF,FOLLOW_ELSEIF_in_ifBlock902); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:140:49: ( elseIfStatement )*
                loop22:
                do {
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=EQUALITY_OPERATOR && LA22_0<=MULTIPLICATIVE_OPERATOR)||(LA22_0>=88 && LA22_0<=89)) ) {
                        alt22=1;
                    }


                    switch (alt22) {
                	case 1 :
                	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:140:49: elseIfStatement
                	    {
                	    pushFollow(FOLLOW_elseIfStatement_in_ifBlock904);
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
            match(input,ELSE,FOLLOW_ELSE_in_ifBlock909); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:140:74: ( elseStatement )?
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==IFBLOCK) ) {
                    alt23=1;
                }
                switch (alt23) {
                    case 1 :
                        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:140:74: elseStatement
                        {
                        pushFollow(FOLLOW_elseStatement_in_ifBlock911);
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
        return retval;
    }
    // $ANTLR end "ifBlock"

    public static class elseStatement_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "elseStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:143:1: elseStatement : ^( IFBLOCK ifBlockDeclaration ) ;
    public final celluloidWalker.elseStatement_return elseStatement() throws RecognitionException {
        celluloidWalker.elseStatement_return retval = new celluloidWalker.elseStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:144:5: ( ^( IFBLOCK ifBlockDeclaration ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:144:9: ^( IFBLOCK ifBlockDeclaration )
            {
            match(input,IFBLOCK,FOLLOW_IFBLOCK_in_elseStatement938); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_ifBlockDeclaration_in_elseStatement940);
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
        return retval;
    }
    // $ANTLR end "elseStatement"

    public static class elseIfStatement_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "elseIfStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:146:1: elseIfStatement : ^( logicalORExpression ^( IFBLOCK ifBlockDeclaration ) ) ;
    public final celluloidWalker.elseIfStatement_return elseIfStatement() throws RecognitionException {
        celluloidWalker.elseIfStatement_return retval = new celluloidWalker.elseIfStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:147:5: ( ^( logicalORExpression ^( IFBLOCK ifBlockDeclaration ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:147:9: ^( logicalORExpression ^( IFBLOCK ifBlockDeclaration ) )
            {
            pushFollow(FOLLOW_logicalORExpression_in_elseIfStatement961);
            logicalORExpression();

            state._fsp--;


            match(input, Token.DOWN, null); 
            match(input,IFBLOCK,FOLLOW_IFBLOCK_in_elseIfStatement964); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_ifBlockDeclaration_in_elseIfStatement966);
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
        return retval;
    }
    // $ANTLR end "elseIfStatement"

    public static class ifBlockDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ifBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:149:1: ifBlockDeclaration : ( variableDeclaration | expression | inStatement | ifStatement | functionPredicateCall );
    public final celluloidWalker.ifBlockDeclaration_return ifBlockDeclaration() throws RecognitionException {
        celluloidWalker.ifBlockDeclaration_return retval = new celluloidWalker.ifBlockDeclaration_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:150:5: ( variableDeclaration | expression | inStatement | ifStatement | functionPredicateCall )
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:150:7: variableDeclaration
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_ifBlockDeclaration984);
                    variableDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:151:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_ifBlockDeclaration994);
                    expression();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:152:9: inStatement
                    {
                    pushFollow(FOLLOW_inStatement_in_ifBlockDeclaration1005);
                    inStatement();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:153:9: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_ifBlockDeclaration1016);
                    ifStatement();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:154:9: functionPredicateCall
                    {
                    pushFollow(FOLLOW_functionPredicateCall_in_ifBlockDeclaration1026);
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
        return retval;
    }
    // $ANTLR end "ifBlockDeclaration"

    public static class whenStatement_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "whenStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:157:1: whenStatement : ^( LISTENER ^( ARG ( ID )? ) EVERY ^( COND ( 'when' )? 'unless' ( ID )? ) listenerBlock ) ;
    public final celluloidWalker.whenStatement_return whenStatement() throws RecognitionException {
        celluloidWalker.whenStatement_return retval = new celluloidWalker.whenStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:158:5: ( ^( LISTENER ^( ARG ( ID )? ) EVERY ^( COND ( 'when' )? 'unless' ( ID )? ) listenerBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:158:9: ^( LISTENER ^( ARG ( ID )? ) EVERY ^( COND ( 'when' )? 'unless' ( ID )? ) listenerBlock )
            {
            match(input,LISTENER,FOLLOW_LISTENER_in_whenStatement1046); 

            match(input, Token.DOWN, null); 
            match(input,ARG,FOLLOW_ARG_in_whenStatement1049); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:158:26: ( ID )?
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==ID) ) {
                    alt25=1;
                }
                switch (alt25) {
                    case 1 :
                        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:158:26: ID
                        {
                        match(input,ID,FOLLOW_ID_in_whenStatement1051); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            match(input,EVERY,FOLLOW_EVERY_in_whenStatement1055); 
            match(input,COND,FOLLOW_COND_in_whenStatement1058); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:158:44: ( 'when' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==67) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:158:44: 'when'
                    {
                    match(input,67,FOLLOW_67_in_whenStatement1060); 

                    }
                    break;

            }

            match(input,82,FOLLOW_82_in_whenStatement1063); 
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:158:61: ( ID )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:158:61: ID
                    {
                    match(input,ID,FOLLOW_ID_in_whenStatement1065); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
            pushFollow(FOLLOW_listenerBlock_in_whenStatement1069);
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
        return retval;
    }
    // $ANTLR end "whenStatement"

    public static class everyStatement_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "everyStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:161:1: everyStatement : ^( LISTENER ^( ARG ( ID )? ) ^( EVERY TIME ) ^( COND ( 'when' )? ( 'unless' )? ( ID )? ) listenerBlock ) ;
    public final celluloidWalker.everyStatement_return everyStatement() throws RecognitionException {
        celluloidWalker.everyStatement_return retval = new celluloidWalker.everyStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:162:5: ( ^( LISTENER ^( ARG ( ID )? ) ^( EVERY TIME ) ^( COND ( 'when' )? ( 'unless' )? ( ID )? ) listenerBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:162:9: ^( LISTENER ^( ARG ( ID )? ) ^( EVERY TIME ) ^( COND ( 'when' )? ( 'unless' )? ( ID )? ) listenerBlock )
            {
            match(input,LISTENER,FOLLOW_LISTENER_in_everyStatement1098); 

            match(input, Token.DOWN, null); 
            match(input,ARG,FOLLOW_ARG_in_everyStatement1101); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:162:26: ( ID )?
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==ID) ) {
                    alt28=1;
                }
                switch (alt28) {
                    case 1 :
                        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:162:26: ID
                        {
                        match(input,ID,FOLLOW_ID_in_everyStatement1103); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            match(input,EVERY,FOLLOW_EVERY_in_everyStatement1108); 

            match(input, Token.DOWN, null); 
            match(input,TIME,FOLLOW_TIME_in_everyStatement1110); 

            match(input, Token.UP, null); 
            match(input,COND,FOLLOW_COND_in_everyStatement1114); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:162:52: ( 'when' )?
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==67) ) {
                    alt29=1;
                }
                switch (alt29) {
                    case 1 :
                        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:162:52: 'when'
                        {
                        match(input,67,FOLLOW_67_in_everyStatement1116); 

                        }
                        break;

                }

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:162:60: ( 'unless' )?
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==82) ) {
                    alt30=1;
                }
                switch (alt30) {
                    case 1 :
                        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:162:60: 'unless'
                        {
                        match(input,82,FOLLOW_82_in_everyStatement1119); 

                        }
                        break;

                }

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:162:70: ( ID )?
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==ID) ) {
                    alt31=1;
                }
                switch (alt31) {
                    case 1 :
                        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:162:70: ID
                        {
                        match(input,ID,FOLLOW_ID_in_everyStatement1122); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            pushFollow(FOLLOW_listenerBlock_in_everyStatement1126);
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
        return retval;
    }
    // $ANTLR end "everyStatement"

    public static class listenerBlock_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "listenerBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:165:1: listenerBlock : ^( LISTENBLOCK ( listenerBlockDeclaration )* ) ;
    public final celluloidWalker.listenerBlock_return listenerBlock() throws RecognitionException {
        celluloidWalker.listenerBlock_return retval = new celluloidWalker.listenerBlock_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:166:5: ( ^( LISTENBLOCK ( listenerBlockDeclaration )* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:166:8: ^( LISTENBLOCK ( listenerBlockDeclaration )* )
            {
            match(input,LISTENBLOCK,FOLLOW_LISTENBLOCK_in_listenerBlock1154); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:166:22: ( listenerBlockDeclaration )*
                loop32:
                do {
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==VARDEF||LA32_0==ARG||(LA32_0>=OBJCALL && LA32_0<=CALL)||LA32_0==ASSIGNMENT_OPERATOR) ) {
                        alt32=1;
                    }


                    switch (alt32) {
                	case 1 :
                	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:166:22: listenerBlockDeclaration
                	    {
                	    pushFollow(FOLLOW_listenerBlockDeclaration_in_listenerBlock1156);
                	    listenerBlockDeclaration();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop32;
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
        return retval;
    }
    // $ANTLR end "listenerBlock"

    public static class listenerBlockDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "listenerBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:168:1: listenerBlockDeclaration : ( constraintFunctionCall | expression | variableDeclaration | functionPredicateCall );
    public final celluloidWalker.listenerBlockDeclaration_return listenerBlockDeclaration() throws RecognitionException {
        celluloidWalker.listenerBlockDeclaration_return retval = new celluloidWalker.listenerBlockDeclaration_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:169:5: ( constraintFunctionCall | expression | variableDeclaration | functionPredicateCall )
            int alt33=4;
            switch ( input.LA(1) ) {
            case OBJCALL:
                {
                alt33=1;
                }
                break;
            case ASSIGNMENT_OPERATOR:
                {
                alt33=2;
                }
                break;
            case VARDEF:
            case ARG:
                {
                alt33=3;
                }
                break;
            case CALL:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:169:10: constraintFunctionCall
                    {
                    pushFollow(FOLLOW_constraintFunctionCall_in_listenerBlockDeclaration1177);
                    constraintFunctionCall();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:170:10: expression
                    {
                    pushFollow(FOLLOW_expression_in_listenerBlockDeclaration1189);
                    expression();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:171:10: variableDeclaration
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_listenerBlockDeclaration1201);
                    variableDeclaration();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:172:10: functionPredicateCall
                    {
                    pushFollow(FOLLOW_functionPredicateCall_in_listenerBlockDeclaration1212);
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
        return retval;
    }
    // $ANTLR end "listenerBlockDeclaration"

    public static class constraintFunctionCall_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "constraintFunctionCall"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:175:1: constraintFunctionCall : ^( OBJCALL ID ID ^( ARGS ( expressionList )? ) ) ;
    public final celluloidWalker.constraintFunctionCall_return constraintFunctionCall() throws RecognitionException {
        celluloidWalker.constraintFunctionCall_return retval = new celluloidWalker.constraintFunctionCall_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:176:5: ( ^( OBJCALL ID ID ^( ARGS ( expressionList )? ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:176:10: ^( OBJCALL ID ID ^( ARGS ( expressionList )? ) )
            {
            match(input,OBJCALL,FOLLOW_OBJCALL_in_constraintFunctionCall1238); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_constraintFunctionCall1240); 
            match(input,ID,FOLLOW_ID_in_constraintFunctionCall1242); 
            match(input,ARGS,FOLLOW_ARGS_in_constraintFunctionCall1245); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:176:33: ( expressionList )?
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ASSIGNMENT_OPERATOR) ) {
                    alt34=1;
                }
                switch (alt34) {
                    case 1 :
                        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:176:33: expressionList
                        {
                        pushFollow(FOLLOW_expressionList_in_constraintFunctionCall1247);
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
        return retval;
    }
    // $ANTLR end "constraintFunctionCall"

    public static class functionPredicateCall_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionPredicateCall"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:179:1: functionPredicateCall : ^( CALL ID ^( ARGS expressionList ) ) ;
    public final celluloidWalker.functionPredicateCall_return functionPredicateCall() throws RecognitionException {
        celluloidWalker.functionPredicateCall_return retval = new celluloidWalker.functionPredicateCall_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:180:5: ( ^( CALL ID ^( ARGS expressionList ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:180:10: ^( CALL ID ^( ARGS expressionList ) )
            {
            match(input,CALL,FOLLOW_CALL_in_functionPredicateCall1283); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_functionPredicateCall1285); 
            match(input,ARGS,FOLLOW_ARGS_in_functionPredicateCall1288); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expressionList_in_functionPredicateCall1290);
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
        return retval;
    }
    // $ANTLR end "functionPredicateCall"

    public static class idList_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "idList"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:185:1: idList : (ids+= ID )+ -> idList(ids= $ids );
    public final celluloidWalker.idList_return idList() throws RecognitionException {
        celluloidWalker.idList_return retval = new celluloidWalker.idList_return();
        retval.start = input.LT(1);

        CommonTree ids=null;
        List list_ids=null;

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:186:5: ( (ids+= ID )+ -> idList(ids= $ids ))
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:186:10: (ids+= ID )+
            {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:186:14: (ids+= ID )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:186:14: ids+= ID
            	    {
            	    ids=(CommonTree)match(input,ID,FOLLOW_ID_in_idList1329); 
            	    if (list_ids==null) list_ids=new ArrayList();
            	    list_ids.add(ids);


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);



            // TEMPLATE REWRITE
            // 186:21: -> idList(ids= $ids )
            {
                retval.st = templateLib.getInstanceOf("idList",
              new STAttrMap().put("ids",  list_ids ));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "idList"

    public static class variableList_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableList"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:189:1: variableList : ( variableDeclaration )+ ;
    public final celluloidWalker.variableList_return variableList() throws RecognitionException {
        celluloidWalker.variableList_return retval = new celluloidWalker.variableList_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:190:5: ( ( variableDeclaration )+ )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:190:10: ( variableDeclaration )+
            {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:190:10: ( variableDeclaration )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==VARDEF||LA36_0==ARG) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:190:10: variableDeclaration
            	    {
            	    pushFollow(FOLLOW_variableDeclaration_in_variableList1364);
            	    variableDeclaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableList"

    public static class expressionList_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expressionList"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:193:1: expressionList : ( expression )+ ;
    public final celluloidWalker.expressionList_return expressionList() throws RecognitionException {
        celluloidWalker.expressionList_return retval = new celluloidWalker.expressionList_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:194:5: ( ( expression )+ )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:194:10: ( expression )+
            {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:194:10: ( expression )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==ASSIGNMENT_OPERATOR) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:194:10: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_expressionList1386);
            	    expression();

            	    state._fsp--;


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
        return retval;
    }
    // $ANTLR end "expressionList"

    public static class variableDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:198:1: variableDeclaration : ( ^( VARDEF 'timeline' ID ) | ^( ARG 'timeline' ID ) | ^( VARDEF TYPE ID ( initializer )? ) | ^( ARG TYPE ID ) );
    public final celluloidWalker.variableDeclaration_return variableDeclaration() throws RecognitionException {
        celluloidWalker.variableDeclaration_return retval = new celluloidWalker.variableDeclaration_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:199:5: ( ^( VARDEF 'timeline' ID ) | ^( ARG 'timeline' ID ) | ^( VARDEF TYPE ID ( initializer )? ) | ^( ARG TYPE ID ) )
            int alt39=4;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==VARDEF) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==DOWN) ) {
                    int LA39_3 = input.LA(3);

                    if ( (LA39_3==85) ) {
                        alt39=1;
                    }
                    else if ( (LA39_3==TYPE) ) {
                        alt39=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA39_0==ARG) ) {
                int LA39_2 = input.LA(2);

                if ( (LA39_2==DOWN) ) {
                    int LA39_4 = input.LA(3);

                    if ( (LA39_4==85) ) {
                        alt39=2;
                    }
                    else if ( (LA39_4==TYPE) ) {
                        alt39=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:199:10: ^( VARDEF 'timeline' ID )
                    {
                    match(input,VARDEF,FOLLOW_VARDEF_in_variableDeclaration1419); 

                    match(input, Token.DOWN, null); 
                    match(input,85,FOLLOW_85_in_variableDeclaration1421); 
                    match(input,ID,FOLLOW_ID_in_variableDeclaration1423); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:200:10: ^( ARG 'timeline' ID )
                    {
                    match(input,ARG,FOLLOW_ARG_in_variableDeclaration1436); 

                    match(input, Token.DOWN, null); 
                    match(input,85,FOLLOW_85_in_variableDeclaration1438); 
                    match(input,ID,FOLLOW_ID_in_variableDeclaration1440); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:201:10: ^( VARDEF TYPE ID ( initializer )? )
                    {
                    match(input,VARDEF,FOLLOW_VARDEF_in_variableDeclaration1453); 

                    match(input, Token.DOWN, null); 
                    match(input,TYPE,FOLLOW_TYPE_in_variableDeclaration1455); 
                    match(input,ID,FOLLOW_ID_in_variableDeclaration1457); 
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:201:27: ( initializer )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( ((LA38_0>=EQUALITY_OPERATOR && LA38_0<=MULTIPLICATIVE_OPERATOR)||(LA38_0>=88 && LA38_0<=89)) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:201:27: initializer
                            {
                            pushFollow(FOLLOW_initializer_in_variableDeclaration1459);
                            initializer();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:202:10: ^( ARG TYPE ID )
                    {
                    match(input,ARG,FOLLOW_ARG_in_variableDeclaration1473); 

                    match(input, Token.DOWN, null); 
                    match(input,TYPE,FOLLOW_TYPE_in_variableDeclaration1475); 
                    match(input,ID,FOLLOW_ID_in_variableDeclaration1477); 

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
        return retval;
    }
    // $ANTLR end "variableDeclaration"

    public static class initializer_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "initializer"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:205:1: initializer : logicalORExpression ;
    public final celluloidWalker.initializer_return initializer() throws RecognitionException {
        celluloidWalker.initializer_return retval = new celluloidWalker.initializer_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:206:5: ( logicalORExpression )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:206:10: logicalORExpression
            {
            pushFollow(FOLLOW_logicalORExpression_in_initializer1508);
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
        return retval;
    }
    // $ANTLR end "initializer"

    public static class expression_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:209:1: expression : ^( ASSIGNMENT_OPERATOR logicalORExpression expression ) ;
    public final celluloidWalker.expression_return expression() throws RecognitionException {
        celluloidWalker.expression_return retval = new celluloidWalker.expression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:210:5: ( ^( ASSIGNMENT_OPERATOR logicalORExpression expression ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:210:10: ^( ASSIGNMENT_OPERATOR logicalORExpression expression )
            {
            match(input,ASSIGNMENT_OPERATOR,FOLLOW_ASSIGNMENT_OPERATOR_in_expression1534); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_logicalORExpression_in_expression1536);
            logicalORExpression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_expression1538);
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
        return retval;
    }
    // $ANTLR end "expression"

    public static class logicalORExpression_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "logicalORExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:212:1: logicalORExpression : ( ^( 'or' ( 'not' )? logicalORExpression logicalORExpression ) | ^( 'and' logicalORExpression logicalORExpression ) | ^( EQUALITY_OPERATOR logicalORExpression logicalORExpression ) | ^( RELATIONAL_OPERATOR logicalORExpression logicalORExpression ) | ^( ADDITIVE_OPERATOR logicalORExpression logicalORExpression ) | ^( MULTIPLICATIVE_OPERATOR primaryExpression logicalORExpression ) );
    public final celluloidWalker.logicalORExpression_return logicalORExpression() throws RecognitionException {
        celluloidWalker.logicalORExpression_return retval = new celluloidWalker.logicalORExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:213:5: ( ^( 'or' ( 'not' )? logicalORExpression logicalORExpression ) | ^( 'and' logicalORExpression logicalORExpression ) | ^( EQUALITY_OPERATOR logicalORExpression logicalORExpression ) | ^( RELATIONAL_OPERATOR logicalORExpression logicalORExpression ) | ^( ADDITIVE_OPERATOR logicalORExpression logicalORExpression ) | ^( MULTIPLICATIVE_OPERATOR primaryExpression logicalORExpression ) )
            int alt41=6;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt41=1;
                }
                break;
            case 89:
                {
                alt41=2;
                }
                break;
            case EQUALITY_OPERATOR:
                {
                alt41=3;
                }
                break;
            case RELATIONAL_OPERATOR:
                {
                alt41=4;
                }
                break;
            case ADDITIVE_OPERATOR:
                {
                alt41=5;
                }
                break;
            case MULTIPLICATIVE_OPERATOR:
                {
                alt41=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:213:10: ^( 'or' ( 'not' )? logicalORExpression logicalORExpression )
                    {
                    match(input,88,FOLLOW_88_in_logicalORExpression1565); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:213:17: ( 'not' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==87) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:213:17: 'not'
                            {
                            match(input,87,FOLLOW_87_in_logicalORExpression1567); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1570);
                    logicalORExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1572);
                    logicalORExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:214:10: ^( 'and' logicalORExpression logicalORExpression )
                    {
                    match(input,89,FOLLOW_89_in_logicalORExpression1585); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1587);
                    logicalORExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1589);
                    logicalORExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:215:10: ^( EQUALITY_OPERATOR logicalORExpression logicalORExpression )
                    {
                    match(input,EQUALITY_OPERATOR,FOLLOW_EQUALITY_OPERATOR_in_logicalORExpression1602); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1604);
                    logicalORExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1606);
                    logicalORExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:216:10: ^( RELATIONAL_OPERATOR logicalORExpression logicalORExpression )
                    {
                    match(input,RELATIONAL_OPERATOR,FOLLOW_RELATIONAL_OPERATOR_in_logicalORExpression1619); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1621);
                    logicalORExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1623);
                    logicalORExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:217:10: ^( ADDITIVE_OPERATOR logicalORExpression logicalORExpression )
                    {
                    match(input,ADDITIVE_OPERATOR,FOLLOW_ADDITIVE_OPERATOR_in_logicalORExpression1636); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1638);
                    logicalORExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1640);
                    logicalORExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:218:10: ^( MULTIPLICATIVE_OPERATOR primaryExpression logicalORExpression )
                    {
                    match(input,MULTIPLICATIVE_OPERATOR,FOLLOW_MULTIPLICATIVE_OPERATOR_in_logicalORExpression1653); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primaryExpression_in_logicalORExpression1655);
                    primaryExpression();

                    state._fsp--;

                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1657);
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
        return retval;
    }
    // $ANTLR end "logicalORExpression"

    public static class primaryExpression_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "primaryExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:220:1: primaryExpression : ( ID | ID expressionList | literal | functionPredicateCall );
    public final celluloidWalker.primaryExpression_return primaryExpression() throws RecognitionException {
        celluloidWalker.primaryExpression_return retval = new celluloidWalker.primaryExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:221:5: ( ID | ID expressionList | literal | functionPredicateCall )
            int alt42=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==ASSIGNMENT_OPERATOR) ) {
                    alt42=2;
                }
                else if ( ((LA42_1>=EQUALITY_OPERATOR && LA42_1<=MULTIPLICATIVE_OPERATOR)||(LA42_1>=88 && LA42_1<=89)) ) {
                    alt42=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
                }
                break;
            case TIME:
            case BOOL:
            case NUMBER:
            case STRING:
                {
                alt42=3;
                }
                break;
            case CALL:
                {
                alt42=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:221:8: ID
                    {
                    match(input,ID,FOLLOW_ID_in_primaryExpression1676); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:222:8: ID expressionList
                    {
                    match(input,ID,FOLLOW_ID_in_primaryExpression1685); 
                    pushFollow(FOLLOW_expressionList_in_primaryExpression1687);
                    expressionList();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:223:8: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression1696);
                    literal();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:224:8: functionPredicateCall
                    {
                    pushFollow(FOLLOW_functionPredicateCall_in_primaryExpression1705);
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
        return retval;
    }
    // $ANTLR end "primaryExpression"

    public static class literal_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "literal"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:228:1: literal : ( BOOL | NUMBER | STRING | TIME );
    public final celluloidWalker.literal_return literal() throws RecognitionException {
        celluloidWalker.literal_return retval = new celluloidWalker.literal_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloidWalker.g:228:9: ( BOOL | NUMBER | STRING | TIME )
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
        return retval;
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
        "\2\uffff\1\3\6\uffff\1\1\1\2";
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
            "\1\12\22\uffff\1\11",
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
            return "130:1: inBlockDeclaration : ( whenStatement | everyStatement | constraintFunctionCall );";
        }
    }
 

    public static final BitSet FOLLOW_PROGRAM_in_program63 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EVENTS_in_program80 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventDefinition_in_program82 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_program84 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_CONSTRAINTS_in_program102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constraintDefinition_in_program104 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_program106 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_DEVICES_in_program124 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_deviceDefinition_in_program126 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_program128 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_FUNCTIONS_in_program146 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_functionDefinition_in_program149 = new BitSet(new long[]{0x0000000000000068L});
    public static final BitSet FOLLOW_predicateDefinition_in_program153 = new BitSet(new long[]{0x0000000000000068L});
    public static final BitSet FOLLOW_PROGBLOCK_in_program172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_functionPredicateBlockDeclaration_in_program174 = new BitSet(new long[]{0x0002000000810498L});
    public static final BitSet FOLLOW_EVENT_in_eventDefinition200 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_eventDefinition202 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOUNCEMENT_in_announcementDeclaration227 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_announcementDeclaration229 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_announcementDeclaration231 = new BitSet(new long[]{0x0000000000000098L});
    public static final BitSet FOLLOW_variableDeclaration_in_announcementDeclaration233 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRAINT_in_constraintDefinition257 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_constraintDefinition259 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_REQUIRES_in_constraintDefinition262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_idList_in_constraintDefinition268 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOUNCES_in_constraintDefinition273 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_idList_in_constraintDefinition279 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constraintBlock_in_constraintDefinition283 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONBLOCK_in_constraintBlock307 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constraintBlockDeclaration_in_constraintBlock309 = new BitSet(new long[]{0x0000010600000090L});
    public static final BitSet FOLLOW_ANNOUNCEMENTS_in_constraintBlock313 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_announcementDeclaration_in_constraintBlock315 = new BitSet(new long[]{0x0000008000000008L});
    public static final BitSet FOLLOW_variableDeclaration_in_constraintBlockDeclaration340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicateHeader_in_constraintBlockDeclaration352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionHeader_in_constraintBlockDeclaration364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEVICE_in_deviceDefinition396 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_deviceDefinition398 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ACCEPTS_in_deviceDefinition401 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_idList_in_deviceDefinition404 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_deviceBlock_in_deviceDefinition408 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEVBLOCK_in_deviceBlock430 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_deviceBlockDeclaration_in_deviceBlock432 = new BitSet(new long[]{0x00000000000000F8L});
    public static final BitSet FOLLOW_variableDeclaration_in_deviceBlockDeclaration453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicateDefinition_in_deviceBlockDeclaration465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDefinition_in_deviceBlockDeclaration477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNHEAD_in_functionHeader504 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_functionHeader506 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ARGS_in_functionHeader509 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableList_in_functionHeader511 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_in_functionDefinition534 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_functionDefinition536 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ARGS_in_functionDefinition539 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableList_in_functionDefinition541 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_functionBlock_in_functionDefinition544 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNBLOCK_in_functionBlock572 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RETURN_in_functionBlock574 = new BitSet(new long[]{0x0002000000810498L});
    public static final BitSet FOLLOW_functionPredicateBlockDeclaration_in_functionBlock576 = new BitSet(new long[]{0x0002000000810498L});
    public static final BitSet FOLLOW_variableDeclaration_in_functionPredicateBlockDeclaration599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_functionPredicateBlockDeclaration610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inStatement_in_functionPredicateBlockDeclaration621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_functionPredicateBlockDeclaration633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionPredicateCall_in_functionPredicateBlockDeclaration644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREDHEAD_in_predicateHeader670 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_predicateHeader672 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ARGS_in_predicateHeader675 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableList_in_predicateHeader677 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRED_in_predicateDefinition704 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_predicateDefinition706 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ARGS_in_predicateDefinition709 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableList_in_predicateDefinition711 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_predicateBlock_in_predicateDefinition714 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNBLOCK_in_predicateBlock746 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RETURN_in_predicateBlock749 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_predicateBlock751 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_functionPredicateBlockDeclaration_in_predicateBlock754 = new BitSet(new long[]{0x0002000000810498L});
    public static final BitSet FOLLOW_IN_in_inStatement777 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_inStatement779 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_inBlock_in_inStatement781 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INBLOCK_in_inBlock809 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_inBlockDeclaration_in_inBlock811 = new BitSet(new long[]{0x0000000000080208L});
    public static final BitSet FOLLOW_whenStatement_in_inBlockDeclaration830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_everyStatement_in_inBlockDeclaration841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraintFunctionCall_in_inBlockDeclaration852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement871 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_logicalORExpression_in_ifStatement873 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ifBlock_in_ifStatement875 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IFBLOCK_in_ifBlock895 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ifBlockDeclaration_in_ifBlock897 = new BitSet(new long[]{0x0002000000810498L});
    public static final BitSet FOLLOW_ELSEIF_in_ifBlock902 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_elseIfStatement_in_ifBlock904 = new BitSet(new long[]{0x003C000000000008L,0x0000000003000000L});
    public static final BitSet FOLLOW_ELSE_in_ifBlock909 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_elseStatement_in_ifBlock911 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IFBLOCK_in_elseStatement938 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ifBlockDeclaration_in_elseStatement940 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_logicalORExpression_in_elseIfStatement961 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IFBLOCK_in_elseIfStatement964 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ifBlockDeclaration_in_elseIfStatement966 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variableDeclaration_in_ifBlockDeclaration984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_ifBlockDeclaration994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inStatement_in_ifBlockDeclaration1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_ifBlockDeclaration1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionPredicateCall_in_ifBlockDeclaration1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LISTENER_in_whenStatement1046 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARG_in_whenStatement1049 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_whenStatement1051 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVERY_in_whenStatement1055 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COND_in_whenStatement1058 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_67_in_whenStatement1060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_whenStatement1063 = new BitSet(new long[]{0x0000100000000008L});
    public static final BitSet FOLLOW_ID_in_whenStatement1065 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_listenerBlock_in_whenStatement1069 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LISTENER_in_everyStatement1098 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARG_in_everyStatement1101 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_everyStatement1103 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVERY_in_everyStatement1108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TIME_in_everyStatement1110 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COND_in_everyStatement1114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_67_in_everyStatement1116 = new BitSet(new long[]{0x0000100000000008L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_everyStatement1119 = new BitSet(new long[]{0x0000100000000008L});
    public static final BitSet FOLLOW_ID_in_everyStatement1122 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_listenerBlock_in_everyStatement1126 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LISTENBLOCK_in_listenerBlock1154 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_listenerBlockDeclaration_in_listenerBlock1156 = new BitSet(new long[]{0x0002000000890698L});
    public static final BitSet FOLLOW_constraintFunctionCall_in_listenerBlockDeclaration1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_listenerBlockDeclaration1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_listenerBlockDeclaration1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionPredicateCall_in_listenerBlockDeclaration1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJCALL_in_constraintFunctionCall1238 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_constraintFunctionCall1240 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_constraintFunctionCall1242 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ARGS_in_constraintFunctionCall1245 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_constraintFunctionCall1247 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_functionPredicateCall1283 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_functionPredicateCall1285 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ARGS_in_functionPredicateCall1288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_functionPredicateCall1290 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_idList1329 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1364 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_expression_in_expressionList1386 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_VARDEF_in_variableDeclaration1419 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_85_in_variableDeclaration1421 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_variableDeclaration1423 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARG_in_variableDeclaration1436 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_85_in_variableDeclaration1438 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_variableDeclaration1440 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARDEF_in_variableDeclaration1453 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPE_in_variableDeclaration1455 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_variableDeclaration1457 = new BitSet(new long[]{0x003C000000000008L,0x0000000003000000L});
    public static final BitSet FOLLOW_initializer_in_variableDeclaration1459 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARG_in_variableDeclaration1473 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPE_in_variableDeclaration1475 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_variableDeclaration1477 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_logicalORExpression_in_initializer1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGNMENT_OPERATOR_in_expression1534 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_logicalORExpression_in_expression1536 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_expression_in_expression1538 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_88_in_logicalORExpression1565 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_87_in_logicalORExpression1567 = new BitSet(new long[]{0x003C000000000008L,0x0000000003000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1570 = new BitSet(new long[]{0x003C000000000008L,0x0000000003000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1572 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_89_in_logicalORExpression1585 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1587 = new BitSet(new long[]{0x003C000000000008L,0x0000000003000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1589 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALITY_OPERATOR_in_logicalORExpression1602 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1604 = new BitSet(new long[]{0x003C000000000008L,0x0000000003000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1606 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RELATIONAL_OPERATOR_in_logicalORExpression1619 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1621 = new BitSet(new long[]{0x003C000000000008L,0x0000000003000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1623 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADDITIVE_OPERATOR_in_logicalORExpression1636 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1638 = new BitSet(new long[]{0x003C000000000008L,0x0000000003000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1640 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MULTIPLICATIVE_OPERATOR_in_logicalORExpression1653 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_logicalORExpression1655 = new BitSet(new long[]{0x003C000000000008L,0x0000000003000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1657 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_primaryExpression1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primaryExpression1685 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_expressionList_in_primaryExpression1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionPredicateCall_in_primaryExpression1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});

}