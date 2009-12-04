// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g 2009-12-02 20:58:51

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class celluloidParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOL", "LANGUAGE", "START", "END", "ID", "NEWLINE", "WS", "COMMENT", "EXPONENT", "NUMBER", "SECOND", "MINUTE", "HOUR", "DAY", "TIME", "ESC_SEQ", "CHAR", "STRING", "ASSIGNMENT_OPERATOR", "EQUALITY_OPERATOR", "RELATIONAL_OPERATOR", "ADDITIVE_OPERATOR", "MULTIPLICATIVE_OPERATOR", "LITERAL", "'in'", "'*'", "'timeline'", "'time'", "'number'", "'string'", "'boolean'", "'input'", "'output'", "'='", "'or'", "'and'", "'new'", "'('", "')'", "','", "'function'", "'predicate'", "'returns'", "'event'", "'announce'", "'when'", "'constraint'", "'announces'", "'requires'", "'accepts'", "'device'"
    };
    public static final int EXPONENT=12;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int CHAR=20;
    public static final int DAY=17;
    public static final int ID=8;
    public static final int EOF=-1;
    public static final int EQUALITY_OPERATOR=23;
    public static final int TIME=18;
    public static final int ESC_SEQ=19;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int MULTIPLICATIVE_OPERATOR=26;
    public static final int COMMENT=11;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int SECOND=14;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int BOOL=4;
    public static final int NUMBER=13;
    public static final int LITERAL=27;
    public static final int ADDITIVE_OPERATOR=25;
    public static final int HOUR=16;
    public static final int RELATIONAL_OPERATOR=24;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int LANGUAGE=5;
    public static final int WS=10;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int NEWLINE=9;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int ASSIGNMENT_OPERATOR=22;
    public static final int START=6;
    public static final int END=7;
    public static final int MINUTE=15;
    public static final int STRING=21;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "synpred37_celluloid", "synpred36_celluloid", "synpred4_celluloid", 
        "initializer", "synpred43_celluloid", "logicalANDExpression", "synpred19_celluloid", 
        "synpred39_celluloid", "synpred29_celluloid", "synpred30_celluloid", 
        "predicateCall", "synpred38_celluloid", "synpred45_celluloid", "synpred34_celluloid", 
        "synpred8_celluloid", "synpred15_celluloid", "synpred12_celluloid", 
        "synpred18_celluloid", "equalityExpression", "predicateBlock", "variableDeclaration", 
        "synpred25_celluloid", "synpred32_celluloid", "synpred10_celluloid", 
        "synpred33_celluloid", "logicalORExpression", "synpred17_celluloid", 
        "synpred14_celluloid", "synpred5_celluloid", "synpred13_celluloid", 
        "eventDefinition", "announcement", "synpred9_celluloid", "synpred28_celluloid", 
        "synpred1_celluloid", "synpred21_celluloid", "constraintDefinition", 
        "synpred6_celluloid", "synpred16_celluloid", "multiplicativeExpression", 
        "expressionList", "assignmentExpression", "timelineDeclaration", 
        "synpred26_celluloid", "synpred44_celluloid", "synpred31_celluloid", 
        "language_block", "synpred40_celluloid", "synpred41_celluloid", 
        "synpred35_celluloid", "functionCall", "functionHeader", "synpred2_celluloid", 
        "language_block_decl", "primaryExpression", "variableList", "synpred11_celluloid", 
        "synpred3_celluloid", "synpred22_celluloid", "functionDefinition", 
        "synpred46_celluloid", "additiveExpression", "predicateDefinition", 
        "deviceDefinition", "synpred42_celluloid", "functionBlock", "constraintList", 
        "predicateHeader", "relationalExpression", "synpred27_celluloid", 
        "synpred24_celluloid", "idList", "synpred23_celluloid", "synpred20_celluloid", 
        "synpred7_celluloid"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public celluloidParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public celluloidParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, null);
            setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
        }
    public celluloidParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("celluloidParserTemplates", AngleBracketTemplateLexer.class);

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

    public String[] getTokenNames() { return celluloidParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g"; }


    public static class language_block_decl_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "language_block_decl"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:12:1: language_block_decl : 'in' LANGUAGE START language_block END ;
    public final celluloidParser.language_block_decl_return language_block_decl() throws RecognitionException {
        celluloidParser.language_block_decl_return retval = new celluloidParser.language_block_decl_return();
        retval.start = input.LT(1);

        try { dbg.enterRule(getGrammarFileName(), "language_block_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(12, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:12:21: ( 'in' LANGUAGE START language_block END )
            dbg.enterAlt(1);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:12:23: 'in' LANGUAGE START language_block END
            {
            dbg.location(12,23);
            match(input,28,FOLLOW_28_in_language_block_decl52); if (state.failed) return retval;
            dbg.location(12,28);
            match(input,LANGUAGE,FOLLOW_LANGUAGE_in_language_block_decl54); if (state.failed) return retval;
            dbg.location(12,37);
            match(input,START,FOLLOW_START_in_language_block_decl56); if (state.failed) return retval;
            dbg.location(12,43);
            pushFollow(FOLLOW_language_block_in_language_block_decl58);
            language_block();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(12,58);
            match(input,END,FOLLOW_END_in_language_block_decl60); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(12, 61);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "language_block_decl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "language_block_decl"

    public static class language_block_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "language_block"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:14:1: language_block : '*' ;
    public final celluloidParser.language_block_return language_block() throws RecognitionException {
        celluloidParser.language_block_return retval = new celluloidParser.language_block_return();
        retval.start = input.LT(1);

        try { dbg.enterRule(getGrammarFileName(), "language_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(14, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:14:21: ( '*' )
            dbg.enterAlt(1);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:14:23: '*'
            {
            dbg.location(14,23);
            match(input,29,FOLLOW_29_in_language_block90); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(14, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "language_block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "language_block"

    public static class timelineDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "timelineDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:63:1: timelineDeclaration : 'timeline' ID NEWLINE -> template(name= $ID.text ) \"timeline <name> = new timeline();\";
    public final celluloidParser.timelineDeclaration_return timelineDeclaration() throws RecognitionException {
        celluloidParser.timelineDeclaration_return retval = new celluloidParser.timelineDeclaration_return();
        retval.start = input.LT(1);

        Token ID1=null;

        try { dbg.enterRule(getGrammarFileName(), "timelineDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(63, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:64:5: ( 'timeline' ID NEWLINE -> template(name= $ID.text ) \"timeline <name> = new timeline();\")
            dbg.enterAlt(1);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:64:10: 'timeline' ID NEWLINE
            {
            dbg.location(64,10);
            match(input,30,FOLLOW_30_in_timelineDeclaration650); if (state.failed) return retval;
            dbg.location(64,21);
            ID1=(Token)match(input,ID,FOLLOW_ID_in_timelineDeclaration652); if (state.failed) return retval;
            dbg.location(64,24);
            match(input,NEWLINE,FOLLOW_NEWLINE_in_timelineDeclaration654); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 65:10: -> template(name= $ID.text ) \"timeline <name> = new timeline();\"
              {
                  retval.st = new StringTemplate(templateLib, "timeline <name> = new timeline();",
                new STAttrMap().put("name",  (ID1!=null?ID1.getText():null) ));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(66, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "timelineDeclaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "timelineDeclaration"

    public static class variableDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:67:1: variableDeclaration : ( timelineDeclaration -> template(decl= $timelineDeclaration.st ) \"<decl>\" | type= ( 'time' | 'number' | 'string' | 'boolean' | 'input' | 'output' ) ID ( initializer )? ( NEWLINE )? -> template(type= $type.text name= $ID.text init= $initializer.st ) \"<type> <name> <init>\");
    public final celluloidParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        celluloidParser.variableDeclaration_return retval = new celluloidParser.variableDeclaration_return();
        retval.start = input.LT(1);

        Token type=null;
        Token ID3=null;
        celluloidParser.timelineDeclaration_return timelineDeclaration2 = null;

        celluloidParser.initializer_return initializer4 = null;


        try { dbg.enterRule(getGrammarFileName(), "variableDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(67, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:68:2: ( timelineDeclaration -> template(decl= $timelineDeclaration.st ) \"<decl>\" | type= ( 'time' | 'number' | 'string' | 'boolean' | 'input' | 'output' ) ID ( initializer )? ( NEWLINE )? -> template(type= $type.text name= $ID.text init= $initializer.st ) \"<type> <name> <init>\")
            int alt4=2;
            try { dbg.enterDecision(4);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=31 && LA4_0<=36)) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:68:5: timelineDeclaration
                    {
                    dbg.location(68,5);
                    pushFollow(FOLLOW_timelineDeclaration_in_variableDeclaration691);
                    timelineDeclaration2=timelineDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 69:7: -> template(decl= $timelineDeclaration.st ) \"<decl>\"
                      {
                          retval.st = new StringTemplate(templateLib, "<decl>",
                        new STAttrMap().put("decl",  (timelineDeclaration2!=null?timelineDeclaration2.st:null) ));
                      }

                    }
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:71:10: type= ( 'time' | 'number' | 'string' | 'boolean' | 'input' | 'output' ) ID ( initializer )? ( NEWLINE )?
                    {
                    dbg.location(71,15);
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:71:17: ( 'time' | 'number' | 'string' | 'boolean' | 'input' | 'output' )
                    int alt1=6;
                    try { dbg.enterSubRule(1);
                    try { dbg.enterDecision(1);

                    switch ( input.LA(1) ) {
                    case 31:
                        {
                        alt1=1;
                        }
                        break;
                    case 32:
                        {
                        alt1=2;
                        }
                        break;
                    case 33:
                        {
                        alt1=3;
                        }
                        break;
                    case 34:
                        {
                        alt1=4;
                        }
                        break;
                    case 35:
                        {
                        alt1=5;
                        }
                        break;
                    case 36:
                        {
                        alt1=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(1);}

                    switch (alt1) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:71:18: 'time'
                            {
                            dbg.location(71,18);
                            match(input,31,FOLLOW_31_in_variableDeclaration733); if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:71:27: 'number'
                            {
                            dbg.location(71,27);
                            match(input,32,FOLLOW_32_in_variableDeclaration737); if (state.failed) return retval;

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:71:38: 'string'
                            {
                            dbg.location(71,38);
                            match(input,33,FOLLOW_33_in_variableDeclaration741); if (state.failed) return retval;

                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:71:49: 'boolean'
                            {
                            dbg.location(71,49);
                            match(input,34,FOLLOW_34_in_variableDeclaration745); if (state.failed) return retval;

                            }
                            break;
                        case 5 :
                            dbg.enterAlt(5);

                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:71:61: 'input'
                            {
                            dbg.location(71,61);
                            match(input,35,FOLLOW_35_in_variableDeclaration749); if (state.failed) return retval;

                            }
                            break;
                        case 6 :
                            dbg.enterAlt(6);

                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:71:71: 'output'
                            {
                            dbg.location(71,71);
                            match(input,36,FOLLOW_36_in_variableDeclaration753); if (state.failed) return retval;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(1);}

                    dbg.location(71,81);
                    ID3=(Token)match(input,ID,FOLLOW_ID_in_variableDeclaration756); if (state.failed) return retval;
                    dbg.location(71,84);
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:71:84: ( initializer )?
                    int alt2=2;
                    try { dbg.enterSubRule(2);
                    try { dbg.enterDecision(2);

                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==37) ) {
                        alt2=1;
                    }
                    } finally {dbg.exitDecision(2);}

                    switch (alt2) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: initializer
                            {
                            dbg.location(71,84);
                            pushFollow(FOLLOW_initializer_in_variableDeclaration758);
                            initializer4=initializer();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(2);}

                    dbg.location(71,97);
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:71:97: ( NEWLINE )?
                    int alt3=2;
                    try { dbg.enterSubRule(3);
                    try { dbg.enterDecision(3);

                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==NEWLINE) ) {
                        alt3=1;
                    }
                    } finally {dbg.exitDecision(3);}

                    switch (alt3) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: NEWLINE
                            {
                            dbg.location(71,97);
                            match(input,NEWLINE,FOLLOW_NEWLINE_in_variableDeclaration761); if (state.failed) return retval;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(3);}



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 72:10: -> template(type= $type.text name= $ID.text init= $initializer.st ) \"<type> <name> <init>\"
                      {
                          retval.st = new StringTemplate(templateLib, "<type> <name> <init>",
                        new STAttrMap().put("type",  (type!=null?type.getText():null) ).put("name",  (ID3!=null?ID3.getText():null) ).put("init",  (initializer4!=null?initializer4.st:null) ));
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(76, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variableDeclaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "variableDeclaration"

    public static class initializer_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "initializer"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:78:1: initializer : '=' assignmentExpression -> template() \"\";
    public final celluloidParser.initializer_return initializer() throws RecognitionException {
        celluloidParser.initializer_return retval = new celluloidParser.initializer_return();
        retval.start = input.LT(1);

        try { dbg.enterRule(getGrammarFileName(), "initializer");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(78, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:79:2: ( '=' assignmentExpression -> template() \"\")
            dbg.enterAlt(1);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:79:7: '=' assignmentExpression
            {
            dbg.location(79,7);
            match(input,37,FOLLOW_37_in_initializer895); if (state.failed) return retval;
            dbg.location(79,11);
            pushFollow(FOLLOW_assignmentExpression_in_initializer897);
            assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 80:10: -> template() \"\"
              {
                  retval.st = new StringTemplate(templateLib, "");
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(81, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "initializer");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "initializer"

    public static class assignmentExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignmentExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:84:1: assignmentExpression : ( logicalORExpression | primaryExpression ASSIGNMENT_OPERATOR assignmentExpression );
    public final celluloidParser.assignmentExpression_return assignmentExpression() throws RecognitionException {
        celluloidParser.assignmentExpression_return retval = new celluloidParser.assignmentExpression_return();
        retval.start = input.LT(1);

        try { dbg.enterRule(getGrammarFileName(), "assignmentExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:85:9: ( logicalORExpression | primaryExpression ASSIGNMENT_OPERATOR assignmentExpression )
            int alt5=2;
            try { dbg.enterDecision(5);

            switch ( input.LA(1) ) {
            case ID:
                {
                int LA5_1 = input.LA(2);

                if ( (synpred9_celluloid()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 40:
                {
                int LA5_2 = input.LA(2);

                if ( (synpred9_celluloid()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case LITERAL:
                {
                int LA5_3 = input.LA(2);

                if ( (synpred9_celluloid()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:85:11: logicalORExpression
                    {
                    dbg.location(85,11);
                    pushFollow(FOLLOW_logicalORExpression_in_assignmentExpression938);
                    logicalORExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:86:11: primaryExpression ASSIGNMENT_OPERATOR assignmentExpression
                    {
                    dbg.location(86,11);
                    pushFollow(FOLLOW_primaryExpression_in_assignmentExpression950);
                    primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    dbg.location(86,29);
                    match(input,ASSIGNMENT_OPERATOR,FOLLOW_ASSIGNMENT_OPERATOR_in_assignmentExpression952); if (state.failed) return retval;
                    dbg.location(86,49);
                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression954);
                    assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(86, 69);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignmentExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "assignmentExpression"

    public static class logicalORExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "logicalORExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:88:1: logicalORExpression : logicalANDExpression ( 'or' logicalANDExpression )* ;
    public final celluloidParser.logicalORExpression_return logicalORExpression() throws RecognitionException {
        celluloidParser.logicalORExpression_return retval = new celluloidParser.logicalORExpression_return();
        retval.start = input.LT(1);

        try { dbg.enterRule(getGrammarFileName(), "logicalORExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(88, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:89:9: ( logicalANDExpression ( 'or' logicalANDExpression )* )
            dbg.enterAlt(1);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:89:11: logicalANDExpression ( 'or' logicalANDExpression )*
            {
            dbg.location(89,11);
            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression994);
            logicalANDExpression();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(89,32);
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:89:32: ( 'or' logicalANDExpression )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==38) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:89:33: 'or' logicalANDExpression
            	    {
            	    dbg.location(89,33);
            	    match(input,38,FOLLOW_38_in_logicalORExpression997); if (state.failed) return retval;
            	    dbg.location(89,38);
            	    pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression999);
            	    logicalANDExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(89, 60);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "logicalORExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "logicalORExpression"

    public static class logicalANDExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "logicalANDExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:91:1: logicalANDExpression : equalityExpression ( 'and' equalityExpression )* ;
    public final celluloidParser.logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        celluloidParser.logicalANDExpression_return retval = new celluloidParser.logicalANDExpression_return();
        retval.start = input.LT(1);

        try { dbg.enterRule(getGrammarFileName(), "logicalANDExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(91, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:92:9: ( equalityExpression ( 'and' equalityExpression )* )
            dbg.enterAlt(1);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:92:11: equalityExpression ( 'and' equalityExpression )*
            {
            dbg.location(92,11);
            pushFollow(FOLLOW_equalityExpression_in_logicalANDExpression1023);
            equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(92,30);
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:92:30: ( 'and' equalityExpression )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==39) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:92:31: 'and' equalityExpression
            	    {
            	    dbg.location(92,31);
            	    match(input,39,FOLLOW_39_in_logicalANDExpression1026); if (state.failed) return retval;
            	    dbg.location(92,37);
            	    pushFollow(FOLLOW_equalityExpression_in_logicalANDExpression1028);
            	    equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(92, 57);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "logicalANDExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "logicalANDExpression"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "equalityExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:94:1: equalityExpression : relationalExpression ( EQUALITY_OPERATOR relationalExpression )* ;
    public final celluloidParser.equalityExpression_return equalityExpression() throws RecognitionException {
        celluloidParser.equalityExpression_return retval = new celluloidParser.equalityExpression_return();
        retval.start = input.LT(1);

        try { dbg.enterRule(getGrammarFileName(), "equalityExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(94, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:95:9: ( relationalExpression ( EQUALITY_OPERATOR relationalExpression )* )
            dbg.enterAlt(1);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:95:12: relationalExpression ( EQUALITY_OPERATOR relationalExpression )*
            {
            dbg.location(95,12);
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1054);
            relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(95,33);
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:95:33: ( EQUALITY_OPERATOR relationalExpression )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==EQUALITY_OPERATOR) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:95:34: EQUALITY_OPERATOR relationalExpression
            	    {
            	    dbg.location(95,34);
            	    match(input,EQUALITY_OPERATOR,FOLLOW_EQUALITY_OPERATOR_in_equalityExpression1057); if (state.failed) return retval;
            	    dbg.location(95,53);
            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1060);
            	    relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(95, 75);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "equalityExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "equalityExpression"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "relationalExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:97:1: relationalExpression : additiveExpression ( RELATIONAL_OPERATOR additiveExpression )* ;
    public final celluloidParser.relationalExpression_return relationalExpression() throws RecognitionException {
        celluloidParser.relationalExpression_return retval = new celluloidParser.relationalExpression_return();
        retval.start = input.LT(1);

        try { dbg.enterRule(getGrammarFileName(), "relationalExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(97, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:98:9: ( additiveExpression ( RELATIONAL_OPERATOR additiveExpression )* )
            dbg.enterAlt(1);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:98:11: additiveExpression ( RELATIONAL_OPERATOR additiveExpression )*
            {
            dbg.location(98,11);
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1083);
            additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(98,30);
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:98:30: ( RELATIONAL_OPERATOR additiveExpression )*
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=2;
                try { dbg.enterDecision(9);

                int LA9_0 = input.LA(1);

                if ( (LA9_0==RELATIONAL_OPERATOR) ) {
                    alt9=1;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:98:31: RELATIONAL_OPERATOR additiveExpression
            	    {
            	    dbg.location(98,31);
            	    match(input,RELATIONAL_OPERATOR,FOLLOW_RELATIONAL_OPERATOR_in_relationalExpression1086); if (state.failed) return retval;
            	    dbg.location(98,52);
            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1089);
            	    additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);
            } finally {dbg.exitSubRule(9);}


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(98, 72);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relationalExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "relationalExpression"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "additiveExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:100:1: additiveExpression : multiplicativeExpression ( ADDITIVE_OPERATOR multiplicativeExpression )* ;
    public final celluloidParser.additiveExpression_return additiveExpression() throws RecognitionException {
        celluloidParser.additiveExpression_return retval = new celluloidParser.additiveExpression_return();
        retval.start = input.LT(1);

        try { dbg.enterRule(getGrammarFileName(), "additiveExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(100, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:101:9: ( multiplicativeExpression ( ADDITIVE_OPERATOR multiplicativeExpression )* )
            dbg.enterAlt(1);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:101:11: multiplicativeExpression ( ADDITIVE_OPERATOR multiplicativeExpression )*
            {
            dbg.location(101,11);
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1113);
            multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(101,36);
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:101:36: ( ADDITIVE_OPERATOR multiplicativeExpression )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==ADDITIVE_OPERATOR) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:101:37: ADDITIVE_OPERATOR multiplicativeExpression
            	    {
            	    dbg.location(101,37);
            	    match(input,ADDITIVE_OPERATOR,FOLLOW_ADDITIVE_OPERATOR_in_additiveExpression1116); if (state.failed) return retval;
            	    dbg.location(101,56);
            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1119);
            	    multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(101, 82);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "additiveExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "multiplicativeExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:103:1: multiplicativeExpression : primaryExpression ( MULTIPLICATIVE_OPERATOR primaryExpression )* ;
    public final celluloidParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        celluloidParser.multiplicativeExpression_return retval = new celluloidParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        try { dbg.enterRule(getGrammarFileName(), "multiplicativeExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(103, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:104:2: ( primaryExpression ( MULTIPLICATIVE_OPERATOR primaryExpression )* )
            dbg.enterAlt(1);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:104:4: primaryExpression ( MULTIPLICATIVE_OPERATOR primaryExpression )*
            {
            dbg.location(104,4);
            pushFollow(FOLLOW_primaryExpression_in_multiplicativeExpression1131);
            primaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(104,22);
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:104:22: ( MULTIPLICATIVE_OPERATOR primaryExpression )*
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=2;
                try { dbg.enterDecision(11);

                int LA11_0 = input.LA(1);

                if ( (LA11_0==MULTIPLICATIVE_OPERATOR) ) {
                    alt11=1;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:104:23: MULTIPLICATIVE_OPERATOR primaryExpression
            	    {
            	    dbg.location(104,23);
            	    match(input,MULTIPLICATIVE_OPERATOR,FOLLOW_MULTIPLICATIVE_OPERATOR_in_multiplicativeExpression1134); if (state.failed) return retval;
            	    dbg.location(104,48);
            	    pushFollow(FOLLOW_primaryExpression_in_multiplicativeExpression1137);
            	    primaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);
            } finally {dbg.exitSubRule(11);}


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(104, 67);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "multiplicativeExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class primaryExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "primaryExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:106:1: primaryExpression : ( ID | 'new' ID '(' expressionList ')' | LITERAL | functionCall | predicateCall );
    public final celluloidParser.primaryExpression_return primaryExpression() throws RecognitionException {
        celluloidParser.primaryExpression_return retval = new celluloidParser.primaryExpression_return();
        retval.start = input.LT(1);

        try { dbg.enterRule(getGrammarFileName(), "primaryExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(106, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:107:2: ( ID | 'new' ID '(' expressionList ')' | LITERAL | functionCall | predicateCall )
            int alt12=5;
            try { dbg.enterDecision(12);

            switch ( input.LA(1) ) {
            case ID:
                {
                int LA12_1 = input.LA(2);

                if ( (synpred16_celluloid()) ) {
                    alt12=1;
                }
                else if ( (synpred19_celluloid()) ) {
                    alt12=4;
                }
                else if ( (true) ) {
                    alt12=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 40:
                {
                alt12=2;
                }
                break;
            case LITERAL:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:107:4: ID
                    {
                    dbg.location(107,4);
                    match(input,ID,FOLLOW_ID_in_primaryExpression1149); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:108:4: 'new' ID '(' expressionList ')'
                    {
                    dbg.location(108,4);
                    match(input,40,FOLLOW_40_in_primaryExpression1154); if (state.failed) return retval;
                    dbg.location(108,10);
                    match(input,ID,FOLLOW_ID_in_primaryExpression1156); if (state.failed) return retval;
                    dbg.location(108,13);
                    match(input,41,FOLLOW_41_in_primaryExpression1158); if (state.failed) return retval;
                    dbg.location(108,17);
                    pushFollow(FOLLOW_expressionList_in_primaryExpression1160);
                    expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    dbg.location(108,32);
                    match(input,42,FOLLOW_42_in_primaryExpression1162); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:109:4: LITERAL
                    {
                    dbg.location(109,4);
                    match(input,LITERAL,FOLLOW_LITERAL_in_primaryExpression1167); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:110:4: functionCall
                    {
                    dbg.location(110,4);
                    pushFollow(FOLLOW_functionCall_in_primaryExpression1172);
                    functionCall();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:111:4: predicateCall
                    {
                    dbg.location(111,4);
                    pushFollow(FOLLOW_predicateCall_in_primaryExpression1177);
                    predicateCall();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(112, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "primaryExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "primaryExpression"

    public static class idList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "idList"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:120:1: idList : (ids+= ID ( ',' ids+= ID )* -> template(ids= $ids ) \"<ids; separator=\", \">\" | '(' ids+= ID ( ',' ids+= ID )* ')' -> template(ids= $ids ) \"(<ids; separator=\", \">)\");
    public final celluloidParser.idList_return idList() throws RecognitionException {
        celluloidParser.idList_return retval = new celluloidParser.idList_return();
        retval.start = input.LT(1);

        Token ids=null;
        List list_ids=null;

        try { dbg.enterRule(getGrammarFileName(), "idList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(120, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:121:5: (ids+= ID ( ',' ids+= ID )* -> template(ids= $ids ) \"<ids; separator=\", \">\" | '(' ids+= ID ( ',' ids+= ID )* ')' -> template(ids= $ids ) \"(<ids; separator=\", \">)\")
            int alt15=2;
            try { dbg.enterDecision(15);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==41) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:121:10: ids+= ID ( ',' ids+= ID )*
                    {
                    dbg.location(121,14);
                    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1205); if (state.failed) return retval;
                    if (list_ids==null) list_ids=new ArrayList();
                    list_ids.add(ids);

                    dbg.location(121,20);
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:121:20: ( ',' ids+= ID )*
                    try { dbg.enterSubRule(13);

                    loop13:
                    do {
                        int alt13=2;
                        try { dbg.enterDecision(13);

                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==43) ) {
                            alt13=1;
                        }


                        } finally {dbg.exitDecision(13);}

                        switch (alt13) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:121:21: ',' ids+= ID
                    	    {
                    	    dbg.location(121,21);
                    	    match(input,43,FOLLOW_43_in_idList1208); if (state.failed) return retval;
                    	    dbg.location(121,29);
                    	    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1214); if (state.failed) return retval;
                    	    if (list_ids==null) list_ids=new ArrayList();
                    	    list_ids.add(ids);


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(13);}



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 122:10: -> template(ids= $ids ) \"<ids; separator=\", \">\"
                      {
                          retval.st = new StringTemplate(templateLib, "<ids; separator=\", \">",
                        new STAttrMap().put("ids",  list_ids ));
                      }

                    }
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:123:10: '(' ids+= ID ( ',' ids+= ID )* ')'
                    {
                    dbg.location(123,10);
                    match(input,41,FOLLOW_41_in_idList1250); if (state.failed) return retval;
                    dbg.location(123,18);
                    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1256); if (state.failed) return retval;
                    if (list_ids==null) list_ids=new ArrayList();
                    list_ids.add(ids);

                    dbg.location(123,24);
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:123:24: ( ',' ids+= ID )*
                    try { dbg.enterSubRule(14);

                    loop14:
                    do {
                        int alt14=2;
                        try { dbg.enterDecision(14);

                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==43) ) {
                            alt14=1;
                        }


                        } finally {dbg.exitDecision(14);}

                        switch (alt14) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:123:25: ',' ids+= ID
                    	    {
                    	    dbg.location(123,25);
                    	    match(input,43,FOLLOW_43_in_idList1259); if (state.failed) return retval;
                    	    dbg.location(123,33);
                    	    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1265); if (state.failed) return retval;
                    	    if (list_ids==null) list_ids=new ArrayList();
                    	    list_ids.add(ids);


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(14);}

                    dbg.location(123,41);
                    match(input,42,FOLLOW_42_in_idList1269); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 124:10: -> template(ids= $ids ) \"(<ids; separator=\", \">)\"
                      {
                          retval.st = new StringTemplate(templateLib, "(<ids; separator=\", \">)",
                        new STAttrMap().put("ids",  list_ids ));
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(125, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "idList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "idList"

    public static class variableList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableList"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:127:1: variableList : (vars+= variableDeclaration ( ',' vars+= variableDeclaration )* -> template(vars= $vars ) \"<vars; separator=\", \">\" | '(' vars+= variableDeclaration ( ',' vars+= variableDeclaration )* ')' -> template(vars= $vars ) \"(<vars; separator=\", \">)\");
    public final celluloidParser.variableList_return variableList() throws RecognitionException {
        celluloidParser.variableList_return retval = new celluloidParser.variableList_return();
        retval.start = input.LT(1);

        List list_vars=null;
        RuleReturnScope vars = null;
        try { dbg.enterRule(getGrammarFileName(), "variableList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(127, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:128:5: (vars+= variableDeclaration ( ',' vars+= variableDeclaration )* -> template(vars= $vars ) \"<vars; separator=\", \">\" | '(' vars+= variableDeclaration ( ',' vars+= variableDeclaration )* ')' -> template(vars= $vars ) \"(<vars; separator=\", \">)\")
            int alt18=2;
            try { dbg.enterDecision(18);

            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=30 && LA18_0<=36)) ) {
                alt18=1;
            }
            else if ( (LA18_0==41) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:128:10: vars+= variableDeclaration ( ',' vars+= variableDeclaration )*
                    {
                    dbg.location(128,15);
                    pushFollow(FOLLOW_variableDeclaration_in_variableList1317);
                    vars=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_vars==null) list_vars=new ArrayList();
                    list_vars.add(vars.getTemplate());

                    dbg.location(128,38);
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:128:38: ( ',' vars+= variableDeclaration )*
                    try { dbg.enterSubRule(16);

                    loop16:
                    do {
                        int alt16=2;
                        try { dbg.enterDecision(16);

                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==43) ) {
                            alt16=1;
                        }


                        } finally {dbg.exitDecision(16);}

                        switch (alt16) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:128:39: ',' vars+= variableDeclaration
                    	    {
                    	    dbg.location(128,39);
                    	    match(input,43,FOLLOW_43_in_variableList1320); if (state.failed) return retval;
                    	    dbg.location(128,48);
                    	    pushFollow(FOLLOW_variableDeclaration_in_variableList1326);
                    	    vars=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if (list_vars==null) list_vars=new ArrayList();
                    	    list_vars.add(vars.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(16);}



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 129:10: -> template(vars= $vars ) \"<vars; separator=\", \">\"
                      {
                          retval.st = new StringTemplate(templateLib, "<vars; separator=\", \">",
                        new STAttrMap().put("vars",  list_vars ));
                      }

                    }
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:130:10: '(' vars+= variableDeclaration ( ',' vars+= variableDeclaration )* ')'
                    {
                    dbg.location(130,10);
                    match(input,41,FOLLOW_41_in_variableList1362); if (state.failed) return retval;
                    dbg.location(130,19);
                    pushFollow(FOLLOW_variableDeclaration_in_variableList1368);
                    vars=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_vars==null) list_vars=new ArrayList();
                    list_vars.add(vars.getTemplate());

                    dbg.location(130,42);
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:130:42: ( ',' vars+= variableDeclaration )*
                    try { dbg.enterSubRule(17);

                    loop17:
                    do {
                        int alt17=2;
                        try { dbg.enterDecision(17);

                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==43) ) {
                            alt17=1;
                        }


                        } finally {dbg.exitDecision(17);}

                        switch (alt17) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:130:43: ',' vars+= variableDeclaration
                    	    {
                    	    dbg.location(130,43);
                    	    match(input,43,FOLLOW_43_in_variableList1371); if (state.failed) return retval;
                    	    dbg.location(130,52);
                    	    pushFollow(FOLLOW_variableDeclaration_in_variableList1377);
                    	    vars=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if (list_vars==null) list_vars=new ArrayList();
                    	    list_vars.add(vars.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(17);}

                    dbg.location(130,77);
                    match(input,42,FOLLOW_42_in_variableList1381); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 131:10: -> template(vars= $vars ) \"(<vars; separator=\", \">)\"
                      {
                          retval.st = new StringTemplate(templateLib, "(<vars; separator=\", \">)",
                        new STAttrMap().put("vars",  list_vars ));
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(132, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variableList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "variableList"

    public static class expressionList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expressionList"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:134:1: expressionList : (exps+= assignmentExpression ( ',' exps+= assignmentExpression )* -> template(exps= $exps ) \"<exps; separator=\", \">\" | '(' exps+= assignmentExpression ( ',' exps+= assignmentExpression )* ')' -> template(exps= $exps ) \"(<exps; separator=\", \">)\");
    public final celluloidParser.expressionList_return expressionList() throws RecognitionException {
        celluloidParser.expressionList_return retval = new celluloidParser.expressionList_return();
        retval.start = input.LT(1);

        List list_exps=null;
        RuleReturnScope exps = null;
        try { dbg.enterRule(getGrammarFileName(), "expressionList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(134, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:135:5: (exps+= assignmentExpression ( ',' exps+= assignmentExpression )* -> template(exps= $exps ) \"<exps; separator=\", \">\" | '(' exps+= assignmentExpression ( ',' exps+= assignmentExpression )* ')' -> template(exps= $exps ) \"(<exps; separator=\", \">)\")
            int alt21=2;
            try { dbg.enterDecision(21);

            int LA21_0 = input.LA(1);

            if ( (LA21_0==ID||LA21_0==LITERAL||LA21_0==40) ) {
                alt21=1;
            }
            else if ( (LA21_0==41) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:135:10: exps+= assignmentExpression ( ',' exps+= assignmentExpression )*
                    {
                    dbg.location(135,15);
                    pushFollow(FOLLOW_assignmentExpression_in_expressionList1428);
                    exps=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_exps==null) list_exps=new ArrayList();
                    list_exps.add(exps.getTemplate());

                    dbg.location(135,39);
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:135:39: ( ',' exps+= assignmentExpression )*
                    try { dbg.enterSubRule(19);

                    loop19:
                    do {
                        int alt19=2;
                        try { dbg.enterDecision(19);

                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==43) ) {
                            alt19=1;
                        }


                        } finally {dbg.exitDecision(19);}

                        switch (alt19) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:135:40: ',' exps+= assignmentExpression
                    	    {
                    	    dbg.location(135,40);
                    	    match(input,43,FOLLOW_43_in_expressionList1431); if (state.failed) return retval;
                    	    dbg.location(135,49);
                    	    pushFollow(FOLLOW_assignmentExpression_in_expressionList1437);
                    	    exps=assignmentExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if (list_exps==null) list_exps=new ArrayList();
                    	    list_exps.add(exps.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(19);}



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 136:10: -> template(exps= $exps ) \"<exps; separator=\", \">\"
                      {
                          retval.st = new StringTemplate(templateLib, "<exps; separator=\", \">",
                        new STAttrMap().put("exps",  list_exps ));
                      }

                    }
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:137:10: '(' exps+= assignmentExpression ( ',' exps+= assignmentExpression )* ')'
                    {
                    dbg.location(137,10);
                    match(input,41,FOLLOW_41_in_expressionList1472); if (state.failed) return retval;
                    dbg.location(137,19);
                    pushFollow(FOLLOW_assignmentExpression_in_expressionList1478);
                    exps=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_exps==null) list_exps=new ArrayList();
                    list_exps.add(exps.getTemplate());

                    dbg.location(137,43);
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:137:43: ( ',' exps+= assignmentExpression )*
                    try { dbg.enterSubRule(20);

                    loop20:
                    do {
                        int alt20=2;
                        try { dbg.enterDecision(20);

                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==43) ) {
                            alt20=1;
                        }


                        } finally {dbg.exitDecision(20);}

                        switch (alt20) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:137:44: ',' exps+= assignmentExpression
                    	    {
                    	    dbg.location(137,44);
                    	    match(input,43,FOLLOW_43_in_expressionList1481); if (state.failed) return retval;
                    	    dbg.location(137,53);
                    	    pushFollow(FOLLOW_assignmentExpression_in_expressionList1487);
                    	    exps=assignmentExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if (list_exps==null) list_exps=new ArrayList();
                    	    list_exps.add(exps.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(20);}

                    dbg.location(137,79);
                    match(input,42,FOLLOW_42_in_expressionList1491); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 138:10: -> template(exps= $exps ) \"(<exps; separator=\", \">)\"
                      {
                          retval.st = new StringTemplate(templateLib, "(<exps; separator=\", \">)",
                        new STAttrMap().put("exps",  list_exps ));
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(139, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expressionList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expressionList"

    public static class functionHeader_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionHeader"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:145:1: functionHeader : 'function' ID '(' variableList ')' -> template(name= $ID.text args= $variableList.st ) \"public void <name> (<args>)\";
    public final celluloidParser.functionHeader_return functionHeader() throws RecognitionException {
        celluloidParser.functionHeader_return retval = new celluloidParser.functionHeader_return();
        retval.start = input.LT(1);

        Token ID5=null;
        celluloidParser.variableList_return variableList6 = null;


        try { dbg.enterRule(getGrammarFileName(), "functionHeader");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(145, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:146:5: ( 'function' ID '(' variableList ')' -> template(name= $ID.text args= $variableList.st ) \"public void <name> (<args>)\")
            dbg.enterAlt(1);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:146:10: 'function' ID '(' variableList ')'
            {
            dbg.location(146,10);
            match(input,44,FOLLOW_44_in_functionHeader1542); if (state.failed) return retval;
            dbg.location(146,21);
            ID5=(Token)match(input,ID,FOLLOW_ID_in_functionHeader1544); if (state.failed) return retval;
            dbg.location(146,24);
            match(input,41,FOLLOW_41_in_functionHeader1546); if (state.failed) return retval;
            dbg.location(146,28);
            pushFollow(FOLLOW_variableList_in_functionHeader1548);
            variableList6=variableList();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(146,41);
            match(input,42,FOLLOW_42_in_functionHeader1550); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 148:10: -> template(name= $ID.text args= $variableList.st ) \"public void <name> (<args>)\"
              {
                  retval.st = new StringTemplate(templateLib, "public void <name> (<args>)",
                new STAttrMap().put("name",  (ID5!=null?ID5.getText():null) ).put("args",  (variableList6!=null?variableList6.st:null) ));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(151, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "functionHeader");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "functionHeader"

    public static class functionDefinition_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:152:1: functionDefinition : functionHeader START functionBlock END -> template(header= $functionHeader.stblock= $functionBlock.st) <<\r\n <header> \"{\"\r\n <block>\r\n \"}\"\r\n >>;
    public final celluloidParser.functionDefinition_return functionDefinition() throws RecognitionException {
        celluloidParser.functionDefinition_return retval = new celluloidParser.functionDefinition_return();
        retval.start = input.LT(1);

        celluloidParser.functionHeader_return functionHeader7 = null;

        celluloidParser.functionBlock_return functionBlock8 = null;


        try { dbg.enterRule(getGrammarFileName(), "functionDefinition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(152, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:152:20: ( functionHeader START functionBlock END -> template(header= $functionHeader.stblock= $functionBlock.st) <<\r\n <header> \"{\"\r\n <block>\r\n \"}\"\r\n >>)
            dbg.enterAlt(1);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:152:22: functionHeader START functionBlock END
            {
            dbg.location(152,22);
            pushFollow(FOLLOW_functionHeader_in_functionDefinition1636);
            functionHeader7=functionHeader();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(152,37);
            match(input,START,FOLLOW_START_in_functionDefinition1638); if (state.failed) return retval;
            dbg.location(152,43);
            pushFollow(FOLLOW_functionBlock_in_functionDefinition1640);
            functionBlock8=functionBlock();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(152,57);
            match(input,END,FOLLOW_END_in_functionDefinition1642); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 154:10: -> template(header= $functionHeader.stblock= $functionBlock.st) <<\r\n <header> \"{\"\r\n <block>\r\n \"}\"\r\n >>
              {
                  retval.st = new StringTemplate(templateLib, "\r\n           <header> \"{\"\r\n             <block>\r\n           \"}\"\r\n         ",
                new STAttrMap().put("header",  (functionHeader7!=null?functionHeader7.st:null)).put("block",  (functionBlock8!=null?functionBlock8.st:null)));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(161, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "functionDefinition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "functionDefinition"

    public static class functionBlock_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:162:1: functionBlock : ( language_block | functionCall | predicateCall | variableDeclaration )* -> template() \"\";
    public final celluloidParser.functionBlock_return functionBlock() throws RecognitionException {
        celluloidParser.functionBlock_return retval = new celluloidParser.functionBlock_return();
        retval.start = input.LT(1);

        try { dbg.enterRule(getGrammarFileName(), "functionBlock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(162, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:163:5: ( ( language_block | functionCall | predicateCall | variableDeclaration )* -> template() \"\")
            dbg.enterAlt(1);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:163:10: ( language_block | functionCall | predicateCall | variableDeclaration )*
            {
            dbg.location(163,10);
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:163:10: ( language_block | functionCall | predicateCall | variableDeclaration )*
            try { dbg.enterSubRule(22);

            loop22:
            do {
                int alt22=5;
                try { dbg.enterDecision(22);

                try {
                    isCyclicDecision = true;
                    alt22 = dfa22.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(22);}

                switch (alt22) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:163:11: language_block
            	    {
            	    dbg.location(163,11);
            	    pushFollow(FOLLOW_language_block_in_functionBlock1737);
            	    language_block();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:163:28: functionCall
            	    {
            	    dbg.location(163,28);
            	    pushFollow(FOLLOW_functionCall_in_functionBlock1741);
            	    functionCall();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:163:43: predicateCall
            	    {
            	    dbg.location(163,43);
            	    pushFollow(FOLLOW_predicateCall_in_functionBlock1745);
            	    predicateCall();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;
            	case 4 :
            	    dbg.enterAlt(4);

            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:163:59: variableDeclaration
            	    {
            	    dbg.location(163,59);
            	    pushFollow(FOLLOW_variableDeclaration_in_functionBlock1749);
            	    variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);
            } finally {dbg.exitSubRule(22);}



            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 166:10: -> template() \"\"
              {
                  retval.st = new StringTemplate(templateLib, "");
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(167, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "functionBlock");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "functionBlock"

    public static class functionCall_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionCall"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:168:1: functionCall : ID '(' expressionList ')' NEWLINE -> template(name= $ID.text args= $expressionList.st ) \"<name>(<args>);\";
    public final celluloidParser.functionCall_return functionCall() throws RecognitionException {
        celluloidParser.functionCall_return retval = new celluloidParser.functionCall_return();
        retval.start = input.LT(1);

        Token ID9=null;
        celluloidParser.expressionList_return expressionList10 = null;


        try { dbg.enterRule(getGrammarFileName(), "functionCall");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(168, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:169:5: ( ID '(' expressionList ')' NEWLINE -> template(name= $ID.text args= $expressionList.st ) \"<name>(<args>);\")
            dbg.enterAlt(1);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:169:10: ID '(' expressionList ')' NEWLINE
            {
            dbg.location(169,10);
            ID9=(Token)match(input,ID,FOLLOW_ID_in_functionCall1815); if (state.failed) return retval;
            dbg.location(169,13);
            match(input,41,FOLLOW_41_in_functionCall1817); if (state.failed) return retval;
            dbg.location(169,17);
            pushFollow(FOLLOW_expressionList_in_functionCall1819);
            expressionList10=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(169,32);
            match(input,42,FOLLOW_42_in_functionCall1821); if (state.failed) return retval;
            dbg.location(169,36);
            match(input,NEWLINE,FOLLOW_NEWLINE_in_functionCall1823); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 171:10: -> template(name= $ID.text args= $expressionList.st ) \"<name>(<args>);\"
              {
                  retval.st = new StringTemplate(templateLib, "<name>(<args>);",
                new STAttrMap().put("name",  (ID9!=null?ID9.getText():null) ).put("args",  (expressionList10!=null?expressionList10.st:null) ));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(174, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "functionCall");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "functionCall"

    public static class predicateHeader_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "predicateHeader"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:178:1: predicateHeader : 'predicate' ID '(' args= variableList ')' -> template(name= $ID.text args= $variableList.st ) \"public bool <name> (<args>)\";
    public final celluloidParser.predicateHeader_return predicateHeader() throws RecognitionException {
        celluloidParser.predicateHeader_return retval = new celluloidParser.predicateHeader_return();
        retval.start = input.LT(1);

        Token ID11=null;
        celluloidParser.variableList_return args = null;


        try { dbg.enterRule(getGrammarFileName(), "predicateHeader");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(178, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:179:5: ( 'predicate' ID '(' args= variableList ')' -> template(name= $ID.text args= $variableList.st ) \"public bool <name> (<args>)\")
            dbg.enterAlt(1);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:179:10: 'predicate' ID '(' args= variableList ')'
            {
            dbg.location(179,10);
            match(input,45,FOLLOW_45_in_predicateHeader1924); if (state.failed) return retval;
            dbg.location(179,22);
            ID11=(Token)match(input,ID,FOLLOW_ID_in_predicateHeader1926); if (state.failed) return retval;
            dbg.location(179,25);
            match(input,41,FOLLOW_41_in_predicateHeader1928); if (state.failed) return retval;
            dbg.location(179,34);
            pushFollow(FOLLOW_variableList_in_predicateHeader1934);
            args=variableList();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(179,49);
            match(input,42,FOLLOW_42_in_predicateHeader1936); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 181:10: -> template(name= $ID.text args= $variableList.st ) \"public bool <name> (<args>)\"
              {
                  retval.st = new StringTemplate(templateLib, "public bool <name> (<args>)",
                new STAttrMap().put("name",  (ID11!=null?ID11.getText():null) ).put("args",  (args!=null?args.st:null) ));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(184, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "predicateHeader");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "predicateHeader"

    public static class predicateDefinition_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "predicateDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:185:1: predicateDefinition : predicateHeader START predicateBlock END -> template(header= $predicateHeader.stblock= $predicateBlock.st) <<\r\n <header> \"{\"\r\n <block>\r\n \"}\"\r\n >>;
    public final celluloidParser.predicateDefinition_return predicateDefinition() throws RecognitionException {
        celluloidParser.predicateDefinition_return retval = new celluloidParser.predicateDefinition_return();
        retval.start = input.LT(1);

        celluloidParser.predicateHeader_return predicateHeader12 = null;

        celluloidParser.predicateBlock_return predicateBlock13 = null;


        try { dbg.enterRule(getGrammarFileName(), "predicateDefinition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(185, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:5: ( predicateHeader START predicateBlock END -> template(header= $predicateHeader.stblock= $predicateBlock.st) <<\r\n <header> \"{\"\r\n <block>\r\n \"}\"\r\n >>)
            dbg.enterAlt(1);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:10: predicateHeader START predicateBlock END
            {
            dbg.location(186,10);
            pushFollow(FOLLOW_predicateHeader_in_predicateDefinition2030);
            predicateHeader12=predicateHeader();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(186,26);
            match(input,START,FOLLOW_START_in_predicateDefinition2032); if (state.failed) return retval;
            dbg.location(186,32);
            pushFollow(FOLLOW_predicateBlock_in_predicateDefinition2034);
            predicateBlock13=predicateBlock();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(186,47);
            match(input,END,FOLLOW_END_in_predicateDefinition2036); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 188:10: -> template(header= $predicateHeader.stblock= $predicateBlock.st) <<\r\n <header> \"{\"\r\n <block>\r\n \"}\"\r\n >>
              {
                  retval.st = new StringTemplate(templateLib, "\r\n           <header> \"{\"\r\n             <block>\r\n           \"}\"\r\n         ",
                new STAttrMap().put("header",  (predicateHeader12!=null?predicateHeader12.st:null)).put("block",  (predicateBlock13!=null?predicateBlock13.st:null)));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(195, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "predicateDefinition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "predicateDefinition"

    public static class predicateBlock_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "predicateBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:196:1: predicateBlock : functionBlock 'returns' assignmentExpression -> template() \"\";
    public final celluloidParser.predicateBlock_return predicateBlock() throws RecognitionException {
        celluloidParser.predicateBlock_return retval = new celluloidParser.predicateBlock_return();
        retval.start = input.LT(1);

        try { dbg.enterRule(getGrammarFileName(), "predicateBlock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(196, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:197:5: ( functionBlock 'returns' assignmentExpression -> template() \"\")
            dbg.enterAlt(1);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:197:10: functionBlock 'returns' assignmentExpression
            {
            dbg.location(197,10);
            pushFollow(FOLLOW_functionBlock_in_predicateBlock2130);
            functionBlock();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(197,24);
            match(input,46,FOLLOW_46_in_predicateBlock2132); if (state.failed) return retval;
            dbg.location(197,34);
            pushFollow(FOLLOW_assignmentExpression_in_predicateBlock2134);
            assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 199:10: -> template() \"\"
              {
                  retval.st = new StringTemplate(templateLib, "");
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(200, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "predicateBlock");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "predicateBlock"

    public static class predicateCall_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "predicateCall"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:201:1: predicateCall : ID '(' expressionList ')' NEWLINE -> template(name= $ID.text args= $expressionList.st ) \"<name>(<args>);\";
    public final celluloidParser.predicateCall_return predicateCall() throws RecognitionException {
        celluloidParser.predicateCall_return retval = new celluloidParser.predicateCall_return();
        retval.start = input.LT(1);

        Token ID14=null;
        celluloidParser.expressionList_return expressionList15 = null;


        try { dbg.enterRule(getGrammarFileName(), "predicateCall");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(201, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:202:2: ( ID '(' expressionList ')' NEWLINE -> template(name= $ID.text args= $expressionList.st ) \"<name>(<args>);\")
            dbg.enterAlt(1);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:202:5: ID '(' expressionList ')' NEWLINE
            {
            dbg.location(202,5);
            ID14=(Token)match(input,ID,FOLLOW_ID_in_predicateCall2184); if (state.failed) return retval;
            dbg.location(202,8);
            match(input,41,FOLLOW_41_in_predicateCall2186); if (state.failed) return retval;
            dbg.location(202,12);
            pushFollow(FOLLOW_expressionList_in_predicateCall2188);
            expressionList15=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(202,27);
            match(input,42,FOLLOW_42_in_predicateCall2190); if (state.failed) return retval;
            dbg.location(202,31);
            match(input,NEWLINE,FOLLOW_NEWLINE_in_predicateCall2192); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 204:10: -> template(name= $ID.text args= $expressionList.st ) \"<name>(<args>);\"
              {
                  retval.st = new StringTemplate(templateLib, "<name>(<args>);",
                new STAttrMap().put("name",  (ID14!=null?ID14.getText():null) ).put("args",  (expressionList15!=null?expressionList15.st:null) ));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(207, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "predicateCall");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "predicateCall"

    public static class eventDefinition_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "eventDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:211:1: eventDefinition : 'event' ID NEWLINE -> template(name= $ID.text ) \"public class name extends event { }\";
    public final celluloidParser.eventDefinition_return eventDefinition() throws RecognitionException {
        celluloidParser.eventDefinition_return retval = new celluloidParser.eventDefinition_return();
        retval.start = input.LT(1);

        Token ID16=null;

        try { dbg.enterRule(getGrammarFileName(), "eventDefinition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(211, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:212:5: ( 'event' ID NEWLINE -> template(name= $ID.text ) \"public class name extends event { }\")
            dbg.enterAlt(1);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:212:10: 'event' ID NEWLINE
            {
            dbg.location(212,10);
            match(input,47,FOLLOW_47_in_eventDefinition2283); if (state.failed) return retval;
            dbg.location(212,18);
            ID16=(Token)match(input,ID,FOLLOW_ID_in_eventDefinition2285); if (state.failed) return retval;
            dbg.location(212,21);
            match(input,NEWLINE,FOLLOW_NEWLINE_in_eventDefinition2287); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 214:10: -> template(name= $ID.text ) \"public class name extends event { }\"
              {
                  retval.st = new StringTemplate(templateLib, "public class name extends event { }",
                new STAttrMap().put("name",  (ID16!=null?ID16.getText():null) ));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(215, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "eventDefinition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "eventDefinition"

    public static class announcement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "announcement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:220:1: announcement : 'announce' ID 'when' ID assignmentExpression ;
    public final celluloidParser.announcement_return announcement() throws RecognitionException {
        celluloidParser.announcement_return retval = new celluloidParser.announcement_return();
        retval.start = input.LT(1);

        try { dbg.enterRule(getGrammarFileName(), "announcement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(220, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:221:5: ( 'announce' ID 'when' ID assignmentExpression )
            dbg.enterAlt(1);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:221:10: 'announce' ID 'when' ID assignmentExpression
            {
            dbg.location(221,10);
            match(input,48,FOLLOW_48_in_announcement2342); if (state.failed) return retval;
            dbg.location(221,21);
            match(input,ID,FOLLOW_ID_in_announcement2344); if (state.failed) return retval;
            dbg.location(221,24);
            match(input,49,FOLLOW_49_in_announcement2346); if (state.failed) return retval;
            dbg.location(221,31);
            match(input,ID,FOLLOW_ID_in_announcement2348); if (state.failed) return retval;
            dbg.location(221,34);
            pushFollow(FOLLOW_assignmentExpression_in_announcement2350);
            assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(222, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "announcement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "announcement"

    public static class constraintDefinition_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "constraintDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:226:1: constraintDefinition : 'constraint' ID ( constraintList )? ( 'announces' announces= idList )? START (members= ( variableDeclaration | functionHeader | predicateHeader | announcement ) )* END -> template(name= $ID.text requires= $constraintList.st ) \"public interface <name> <requires> { TODO: Members }\";
    public final celluloidParser.constraintDefinition_return constraintDefinition() throws RecognitionException {
        celluloidParser.constraintDefinition_return retval = new celluloidParser.constraintDefinition_return();
        retval.start = input.LT(1);

        Token members=null;
        Token ID17=null;
        celluloidParser.idList_return announces = null;

        celluloidParser.constraintList_return constraintList18 = null;


        try { dbg.enterRule(getGrammarFileName(), "constraintDefinition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(226, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:227:5: ( 'constraint' ID ( constraintList )? ( 'announces' announces= idList )? START (members= ( variableDeclaration | functionHeader | predicateHeader | announcement ) )* END -> template(name= $ID.text requires= $constraintList.st ) \"public interface <name> <requires> { TODO: Members }\")
            dbg.enterAlt(1);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:227:10: 'constraint' ID ( constraintList )? ( 'announces' announces= idList )? START (members= ( variableDeclaration | functionHeader | predicateHeader | announcement ) )* END
            {
            dbg.location(227,10);
            match(input,50,FOLLOW_50_in_constraintDefinition2374); if (state.failed) return retval;
            dbg.location(227,23);
            ID17=(Token)match(input,ID,FOLLOW_ID_in_constraintDefinition2376); if (state.failed) return retval;
            dbg.location(227,26);
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:227:26: ( constraintList )?
            int alt23=2;
            try { dbg.enterSubRule(23);
            try { dbg.enterDecision(23);

            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=52 && LA23_0<=53)) ) {
                alt23=1;
            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:227:27: constraintList
                    {
                    dbg.location(227,27);
                    pushFollow(FOLLOW_constraintList_in_constraintDefinition2379);
                    constraintList18=constraintList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(23);}

            dbg.location(228,10);
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:228:10: ( 'announces' announces= idList )?
            int alt24=2;
            try { dbg.enterSubRule(24);
            try { dbg.enterDecision(24);

            int LA24_0 = input.LA(1);

            if ( (LA24_0==51) ) {
                alt24=1;
            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:228:11: 'announces' announces= idList
                    {
                    dbg.location(228,11);
                    match(input,51,FOLLOW_51_in_constraintDefinition2393); if (state.failed) return retval;
                    dbg.location(228,33);
                    pushFollow(FOLLOW_idList_in_constraintDefinition2399);
                    announces=idList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(24);}

            dbg.location(229,10);
            match(input,START,FOLLOW_START_in_constraintDefinition2413); if (state.failed) return retval;
            dbg.location(230,22);
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:230:22: (members= ( variableDeclaration | functionHeader | predicateHeader | announcement ) )*
            try { dbg.enterSubRule(26);

            loop26:
            do {
                int alt26=2;
                try { dbg.enterDecision(26);

                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=30 && LA26_0<=36)||(LA26_0>=44 && LA26_0<=45)||LA26_0==48) ) {
                    alt26=1;
                }


                } finally {dbg.exitDecision(26);}

                switch (alt26) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: members= ( variableDeclaration | functionHeader | predicateHeader | announcement )
            	    {
            	    dbg.location(230,22);
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:230:24: ( variableDeclaration | functionHeader | predicateHeader | announcement )
            	    int alt25=4;
            	    try { dbg.enterSubRule(25);
            	    try { dbg.enterDecision(25);

            	    switch ( input.LA(1) ) {
            	    case 30:
            	    case 31:
            	    case 32:
            	    case 33:
            	    case 34:
            	    case 35:
            	    case 36:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt25=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }

            	    } finally {dbg.exitDecision(25);}

            	    switch (alt25) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:230:25: variableDeclaration
            	            {
            	            dbg.location(230,25);
            	            pushFollow(FOLLOW_variableDeclaration_in_constraintDefinition2434);
            	            variableDeclaration();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:230:47: functionHeader
            	            {
            	            dbg.location(230,47);
            	            pushFollow(FOLLOW_functionHeader_in_constraintDefinition2438);
            	            functionHeader();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;
            	        case 3 :
            	            dbg.enterAlt(3);

            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:230:64: predicateHeader
            	            {
            	            dbg.location(230,64);
            	            pushFollow(FOLLOW_predicateHeader_in_constraintDefinition2442);
            	            predicateHeader();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;
            	        case 4 :
            	            dbg.enterAlt(4);

            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:230:82: announcement
            	            {
            	            dbg.location(230,82);
            	            pushFollow(FOLLOW_announcement_in_constraintDefinition2446);
            	            announcement();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(25);}


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);
            } finally {dbg.exitSubRule(26);}

            dbg.location(231,10);
            match(input,END,FOLLOW_END_in_constraintDefinition2459); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 235:10: -> template(name= $ID.text requires= $constraintList.st ) \"public interface <name> <requires> { TODO: Members }\"
              {
                  retval.st = new StringTemplate(templateLib, "public interface <name> <requires> { TODO: Members }",
                new STAttrMap().put("name",  (ID17!=null?ID17.getText():null) ).put("requires",  (constraintList18!=null?constraintList18.st:null) ));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(239, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "constraintDefinition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "constraintDefinition"

    public static class constraintList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "constraintList"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:240:1: constraintList : ( 'requires' idList -> template(ids= $idList.st ) \"implements <ids>\" | 'accepts' idList -> template(ids= $idList.st ) \"implements <ids>\");
    public final celluloidParser.constraintList_return constraintList() throws RecognitionException {
        celluloidParser.constraintList_return retval = new celluloidParser.constraintList_return();
        retval.start = input.LT(1);

        celluloidParser.idList_return idList19 = null;

        celluloidParser.idList_return idList20 = null;


        try { dbg.enterRule(getGrammarFileName(), "constraintList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(240, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:241:2: ( 'requires' idList -> template(ids= $idList.st ) \"implements <ids>\" | 'accepts' idList -> template(ids= $idList.st ) \"implements <ids>\")
            int alt27=2;
            try { dbg.enterDecision(27);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==52) ) {
                alt27=1;
            }
            else if ( (LA27_0==53) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:241:7: 'requires' idList
                    {
                    dbg.location(241,7);
                    match(input,52,FOLLOW_52_in_constraintList2583); if (state.failed) return retval;
                    dbg.location(241,18);
                    pushFollow(FOLLOW_idList_in_constraintList2585);
                    idList19=idList();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 242:7: -> template(ids= $idList.st ) \"implements <ids>\"
                      {
                          retval.st = new StringTemplate(templateLib, "implements <ids>",
                        new STAttrMap().put("ids",  (idList19!=null?idList19.st:null) ));
                      }

                    }
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:243:7: 'accepts' idList
                    {
                    dbg.location(243,7);
                    match(input,53,FOLLOW_53_in_constraintList2612); if (state.failed) return retval;
                    dbg.location(243,17);
                    pushFollow(FOLLOW_idList_in_constraintList2614);
                    idList20=idList();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 244:7: -> template(ids= $idList.st ) \"implements <ids>\"
                      {
                          retval.st = new StringTemplate(templateLib, "implements <ids>",
                        new STAttrMap().put("ids",  (idList20!=null?idList20.st:null) ));
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(245, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "constraintList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "constraintList"

    public static class deviceDefinition_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "deviceDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:247:1: deviceDefinition : 'device' ID ( constraintList )? START (members= ( variableDeclaration | functionDefinition | predicateDefinition | COMMENT ) )* END -> deviceDefinition(name= $ID.text accepts= $constraintList.st );
    public final celluloidParser.deviceDefinition_return deviceDefinition() throws RecognitionException {
        celluloidParser.deviceDefinition_return retval = new celluloidParser.deviceDefinition_return();
        retval.start = input.LT(1);

        Token members=null;
        Token ID21=null;
        celluloidParser.constraintList_return constraintList22 = null;


        try { dbg.enterRule(getGrammarFileName(), "deviceDefinition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(247, 1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:248:5: ( 'device' ID ( constraintList )? START (members= ( variableDeclaration | functionDefinition | predicateDefinition | COMMENT ) )* END -> deviceDefinition(name= $ID.text accepts= $constraintList.st ))
            dbg.enterAlt(1);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:248:10: 'device' ID ( constraintList )? START (members= ( variableDeclaration | functionDefinition | predicateDefinition | COMMENT ) )* END
            {
            dbg.location(248,10);
            match(input,54,FOLLOW_54_in_deviceDefinition2655); if (state.failed) return retval;
            dbg.location(248,19);
            ID21=(Token)match(input,ID,FOLLOW_ID_in_deviceDefinition2657); if (state.failed) return retval;
            dbg.location(248,22);
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:248:22: ( constraintList )?
            int alt28=2;
            try { dbg.enterSubRule(28);
            try { dbg.enterDecision(28);

            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=52 && LA28_0<=53)) ) {
                alt28=1;
            }
            } finally {dbg.exitDecision(28);}

            switch (alt28) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:248:23: constraintList
                    {
                    dbg.location(248,23);
                    pushFollow(FOLLOW_constraintList_in_deviceDefinition2660);
                    constraintList22=constraintList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(28);}

            dbg.location(249,10);
            match(input,START,FOLLOW_START_in_deviceDefinition2674); if (state.failed) return retval;
            dbg.location(250,22);
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:250:22: (members= ( variableDeclaration | functionDefinition | predicateDefinition | COMMENT ) )*
            try { dbg.enterSubRule(30);

            loop30:
            do {
                int alt30=2;
                try { dbg.enterDecision(30);

                int LA30_0 = input.LA(1);

                if ( (LA30_0==COMMENT||(LA30_0>=30 && LA30_0<=36)||(LA30_0>=44 && LA30_0<=45)) ) {
                    alt30=1;
                }


                } finally {dbg.exitDecision(30);}

                switch (alt30) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: members= ( variableDeclaration | functionDefinition | predicateDefinition | COMMENT )
            	    {
            	    dbg.location(250,22);
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:250:24: ( variableDeclaration | functionDefinition | predicateDefinition | COMMENT )
            	    int alt29=4;
            	    try { dbg.enterSubRule(29);
            	    try { dbg.enterDecision(29);

            	    switch ( input.LA(1) ) {
            	    case 30:
            	    case 31:
            	    case 32:
            	    case 33:
            	    case 34:
            	    case 35:
            	    case 36:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    case COMMENT:
            	        {
            	        alt29=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }

            	    } finally {dbg.exitDecision(29);}

            	    switch (alt29) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:250:25: variableDeclaration
            	            {
            	            dbg.location(250,25);
            	            pushFollow(FOLLOW_variableDeclaration_in_deviceDefinition2695);
            	            variableDeclaration();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:250:47: functionDefinition
            	            {
            	            dbg.location(250,47);
            	            pushFollow(FOLLOW_functionDefinition_in_deviceDefinition2699);
            	            functionDefinition();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;
            	        case 3 :
            	            dbg.enterAlt(3);

            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:250:68: predicateDefinition
            	            {
            	            dbg.location(250,68);
            	            pushFollow(FOLLOW_predicateDefinition_in_deviceDefinition2703);
            	            predicateDefinition();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;
            	        case 4 :
            	            dbg.enterAlt(4);

            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:250:90: COMMENT
            	            {
            	            dbg.location(250,90);
            	            match(input,COMMENT,FOLLOW_COMMENT_in_deviceDefinition2707); if (state.failed) return retval;

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(29);}


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);
            } finally {dbg.exitSubRule(30);}

            dbg.location(251,10);
            match(input,END,FOLLOW_END_in_deviceDefinition2721); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 252:10: -> deviceDefinition(name= $ID.text accepts= $constraintList.st )
              {
                  retval.st = templateLib.getInstanceOf("deviceDefinition",
                new STAttrMap().put("name",  (ID21!=null?ID21.getText():null) ).put("accepts",  (constraintList22!=null?constraintList22.st:null) ));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(254, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "deviceDefinition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "deviceDefinition"

    // $ANTLR start synpred9_celluloid
    public final void synpred9_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:85:11: ( logicalORExpression )
        dbg.enterAlt(1);

        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:85:11: logicalORExpression
        {
        dbg.location(85,11);
        pushFollow(FOLLOW_logicalORExpression_in_synpred9_celluloid938);
        logicalORExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_celluloid

    // $ANTLR start synpred16_celluloid
    public final void synpred16_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:107:4: ( ID )
        dbg.enterAlt(1);

        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:107:4: ID
        {
        dbg.location(107,4);
        match(input,ID,FOLLOW_ID_in_synpred16_celluloid1149); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_celluloid

    // $ANTLR start synpred19_celluloid
    public final void synpred19_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:110:4: ( functionCall )
        dbg.enterAlt(1);

        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:110:4: functionCall
        {
        dbg.location(110,4);
        pushFollow(FOLLOW_functionCall_in_synpred19_celluloid1172);
        functionCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_celluloid

    // $ANTLR start synpred30_celluloid
    public final void synpred30_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:163:28: ( functionCall )
        dbg.enterAlt(1);

        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:163:28: functionCall
        {
        dbg.location(163,28);
        pushFollow(FOLLOW_functionCall_in_synpred30_celluloid1741);
        functionCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_celluloid

    // $ANTLR start synpred31_celluloid
    public final void synpred31_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:163:43: ( predicateCall )
        dbg.enterAlt(1);

        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:163:43: predicateCall
        {
        dbg.location(163,43);
        pushFollow(FOLLOW_predicateCall_in_synpred31_celluloid1745);
        predicateCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_celluloid

    // Delegated rules

    public final boolean synpred9_celluloid() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred9_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_celluloid() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred30_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_celluloid() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred19_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_celluloid() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred31_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_celluloid() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred16_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\16\uffff";
    static final String DFA22_eofS =
        "\16\uffff";
    static final String DFA22_minS =
        "\1\7\3\uffff\1\0\11\uffff";
    static final String DFA22_maxS =
        "\1\56\3\uffff\1\0\11\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\5\1\uffff\1\1\1\uffff\1\4\6\uffff\1\2\1\3";
    static final String DFA22_specialS =
        "\4\uffff\1\0\11\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1\1\4\24\uffff\1\3\7\5\11\uffff\1\1",
            "",
            "",
            "",
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
            return "()* loopback of 163:10: ( language_block | functionCall | predicateCall | variableDeclaration )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_4 = input.LA(1);

                         
                        int index22_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_celluloid()) ) {s = 12;}

                        else if ( (synpred31_celluloid()) ) {s = 13;}

                         
                        input.seek(index22_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_28_in_language_block_decl52 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LANGUAGE_in_language_block_decl54 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_START_in_language_block_decl56 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_language_block_in_language_block_decl58 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_END_in_language_block_decl60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_language_block90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_timelineDeclaration650 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_timelineDeclaration652 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NEWLINE_in_timelineDeclaration654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timelineDeclaration_in_variableDeclaration691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_variableDeclaration733 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_32_in_variableDeclaration737 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_33_in_variableDeclaration741 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_34_in_variableDeclaration745 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_35_in_variableDeclaration749 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_36_in_variableDeclaration753 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_variableDeclaration756 = new BitSet(new long[]{0x0000002000000202L});
    public static final BitSet FOLLOW_initializer_in_variableDeclaration758 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_NEWLINE_in_variableDeclaration761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_initializer895 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_assignmentExpression_in_initializer897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_assignmentExpression938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_assignmentExpression950 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ASSIGNMENT_OPERATOR_in_assignmentExpression952 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression994 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_logicalORExpression997 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression999 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalANDExpression1023 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_logicalANDExpression1026 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalANDExpression1028 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1054 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_EQUALITY_OPERATOR_in_equalityExpression1057 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1060 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1083 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_RELATIONAL_OPERATOR_in_relationalExpression1086 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1089 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1113 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ADDITIVE_OPERATOR_in_additiveExpression1116 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1119 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_primaryExpression_in_multiplicativeExpression1131 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_MULTIPLICATIVE_OPERATOR_in_multiplicativeExpression1134 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_primaryExpression_in_multiplicativeExpression1137 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ID_in_primaryExpression1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_primaryExpression1154 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_primaryExpression1156 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_primaryExpression1158 = new BitSet(new long[]{0x0000030008000100L});
    public static final BitSet FOLLOW_expressionList_in_primaryExpression1160 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_primaryExpression1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_in_primaryExpression1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primaryExpression1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicateCall_in_primaryExpression1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idList1205 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_idList1208 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_idList1214 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_41_in_idList1250 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_idList1256 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_43_in_idList1259 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_idList1265 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_42_in_idList1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1317 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_variableList1320 = new BitSet(new long[]{0x0000001FC0000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1326 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_41_in_variableList1362 = new BitSet(new long[]{0x0000001FC0000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1368 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_43_in_variableList1371 = new BitSet(new long[]{0x0000001FC0000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1377 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_42_in_variableList1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1428 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_expressionList1431 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1437 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_41_in_expressionList1472 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1478 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_43_in_expressionList1481 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1487 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_42_in_expressionList1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_functionHeader1542 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_functionHeader1544 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_functionHeader1546 = new BitSet(new long[]{0x0000021FC0000000L});
    public static final BitSet FOLLOW_variableList_in_functionHeader1548 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_functionHeader1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionHeader_in_functionDefinition1636 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_START_in_functionDefinition1638 = new BitSet(new long[]{0x0000011FE8000180L});
    public static final BitSet FOLLOW_functionBlock_in_functionDefinition1640 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_END_in_functionDefinition1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_language_block_in_functionBlock1737 = new BitSet(new long[]{0x0000011FE8000102L});
    public static final BitSet FOLLOW_functionCall_in_functionBlock1741 = new BitSet(new long[]{0x0000011FE8000102L});
    public static final BitSet FOLLOW_predicateCall_in_functionBlock1745 = new BitSet(new long[]{0x0000011FE8000102L});
    public static final BitSet FOLLOW_variableDeclaration_in_functionBlock1749 = new BitSet(new long[]{0x0000011FE8000102L});
    public static final BitSet FOLLOW_ID_in_functionCall1815 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_functionCall1817 = new BitSet(new long[]{0x0000030008000100L});
    public static final BitSet FOLLOW_expressionList_in_functionCall1819 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_functionCall1821 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NEWLINE_in_functionCall1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_predicateHeader1924 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_predicateHeader1926 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_predicateHeader1928 = new BitSet(new long[]{0x0000021FC0000000L});
    public static final BitSet FOLLOW_variableList_in_predicateHeader1934 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_predicateHeader1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicateHeader_in_predicateDefinition2030 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_START_in_predicateDefinition2032 = new BitSet(new long[]{0x0000411FE8000100L});
    public static final BitSet FOLLOW_predicateBlock_in_predicateDefinition2034 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_END_in_predicateDefinition2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionBlock_in_predicateBlock2130 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_predicateBlock2132 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_assignmentExpression_in_predicateBlock2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_predicateCall2184 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_predicateCall2186 = new BitSet(new long[]{0x0000030008000100L});
    public static final BitSet FOLLOW_expressionList_in_predicateCall2188 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_predicateCall2190 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NEWLINE_in_predicateCall2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_eventDefinition2283 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_eventDefinition2285 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NEWLINE_in_eventDefinition2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_announcement2342 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_announcement2344 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_announcement2346 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_announcement2348 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_assignmentExpression_in_announcement2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_constraintDefinition2374 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_constraintDefinition2376 = new BitSet(new long[]{0x0038000000000040L});
    public static final BitSet FOLLOW_constraintList_in_constraintDefinition2379 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_51_in_constraintDefinition2393 = new BitSet(new long[]{0x0000020000000100L});
    public static final BitSet FOLLOW_idList_in_constraintDefinition2399 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_START_in_constraintDefinition2413 = new BitSet(new long[]{0x0001301FC0000080L});
    public static final BitSet FOLLOW_variableDeclaration_in_constraintDefinition2434 = new BitSet(new long[]{0x0001301FC0000080L});
    public static final BitSet FOLLOW_functionHeader_in_constraintDefinition2438 = new BitSet(new long[]{0x0001301FC0000080L});
    public static final BitSet FOLLOW_predicateHeader_in_constraintDefinition2442 = new BitSet(new long[]{0x0001301FC0000080L});
    public static final BitSet FOLLOW_announcement_in_constraintDefinition2446 = new BitSet(new long[]{0x0001301FC0000080L});
    public static final BitSet FOLLOW_END_in_constraintDefinition2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_constraintList2583 = new BitSet(new long[]{0x0000020000000100L});
    public static final BitSet FOLLOW_idList_in_constraintList2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_constraintList2612 = new BitSet(new long[]{0x0000020000000100L});
    public static final BitSet FOLLOW_idList_in_constraintList2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_deviceDefinition2655 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_deviceDefinition2657 = new BitSet(new long[]{0x0030000000000040L});
    public static final BitSet FOLLOW_constraintList_in_deviceDefinition2660 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_START_in_deviceDefinition2674 = new BitSet(new long[]{0x0000301FC0000880L});
    public static final BitSet FOLLOW_variableDeclaration_in_deviceDefinition2695 = new BitSet(new long[]{0x0000301FC0000880L});
    public static final BitSet FOLLOW_functionDefinition_in_deviceDefinition2699 = new BitSet(new long[]{0x0000301FC0000880L});
    public static final BitSet FOLLOW_predicateDefinition_in_deviceDefinition2703 = new BitSet(new long[]{0x0000301FC0000880L});
    public static final BitSet FOLLOW_COMMENT_in_deviceDefinition2707 = new BitSet(new long[]{0x0000301FC0000880L});
    public static final BitSet FOLLOW_END_in_deviceDefinition2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_synpred9_celluloid938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred16_celluloid1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_synpred19_celluloid1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_synpred30_celluloid1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicateCall_in_synpred31_celluloid1745 = new BitSet(new long[]{0x0000000000000002L});

}