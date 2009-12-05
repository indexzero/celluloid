// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g 2009-12-05 15:50:40

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class celluloidParser extends Parser {
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


        public celluloidParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public celluloidParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
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

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:12:21: ( 'in' LANGUAGE START language_block END )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:12:23: 'in' LANGUAGE START language_block END
            {
            match(input,28,FOLLOW_28_in_language_block_decl52); if (state.failed) return retval;
            match(input,LANGUAGE,FOLLOW_LANGUAGE_in_language_block_decl54); if (state.failed) return retval;
            match(input,START,FOLLOW_START_in_language_block_decl56); if (state.failed) return retval;
            pushFollow(FOLLOW_language_block_in_language_block_decl58);
            language_block();

            state._fsp--;
            if (state.failed) return retval;
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

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:14:21: ( '*' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:14:23: '*'
            {
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
        return retval;
    }
    // $ANTLR end "language_block"

    public static class variableDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:63:1: variableDeclaration : ( 'timeline' ID NEWLINE -> timelineDeclaration(name= $ID.text ) | type= ( 'time' | 'number' | 'string' | 'boolean' | 'input' | 'output' ) ID ( initializer )? ( NEWLINE )? -> variableDeclaration(type= $type.text name= $ID.text init= $initializer.st ));
    public final celluloidParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        celluloidParser.variableDeclaration_return retval = new celluloidParser.variableDeclaration_return();
        retval.start = input.LT(1);

        Token type=null;
        Token ID1=null;
        Token ID2=null;
        celluloidParser.initializer_return initializer3 = null;


        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:64:5: ( 'timeline' ID NEWLINE -> timelineDeclaration(name= $ID.text ) | type= ( 'time' | 'number' | 'string' | 'boolean' | 'input' | 'output' ) ID ( initializer )? ( NEWLINE )? -> variableDeclaration(type= $type.text name= $ID.text init= $initializer.st ))
            int alt4=2;
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

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:64:10: 'timeline' ID NEWLINE
                    {
                    match(input,30,FOLLOW_30_in_variableDeclaration650); if (state.failed) return retval;
                    ID1=(Token)match(input,ID,FOLLOW_ID_in_variableDeclaration652); if (state.failed) return retval;
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_variableDeclaration654); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 65:10: -> timelineDeclaration(name= $ID.text )
                      {
                          retval.st = templateLib.getInstanceOf("timelineDeclaration",
                        new STAttrMap().put("name",  (ID1!=null?ID1.getText():null) ));
                      }

                    }
                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:67:10: type= ( 'time' | 'number' | 'string' | 'boolean' | 'input' | 'output' ) ID ( initializer )? ( NEWLINE )?
                    {
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:67:17: ( 'time' | 'number' | 'string' | 'boolean' | 'input' | 'output' )
                    int alt1=6;
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

                        throw nvae;
                    }

                    switch (alt1) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:67:18: 'time'
                            {
                            match(input,31,FOLLOW_31_in_variableDeclaration700); if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:67:27: 'number'
                            {
                            match(input,32,FOLLOW_32_in_variableDeclaration704); if (state.failed) return retval;

                            }
                            break;
                        case 3 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:67:38: 'string'
                            {
                            match(input,33,FOLLOW_33_in_variableDeclaration708); if (state.failed) return retval;

                            }
                            break;
                        case 4 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:67:49: 'boolean'
                            {
                            match(input,34,FOLLOW_34_in_variableDeclaration712); if (state.failed) return retval;

                            }
                            break;
                        case 5 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:67:61: 'input'
                            {
                            match(input,35,FOLLOW_35_in_variableDeclaration716); if (state.failed) return retval;

                            }
                            break;
                        case 6 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:67:71: 'output'
                            {
                            match(input,36,FOLLOW_36_in_variableDeclaration720); if (state.failed) return retval;

                            }
                            break;

                    }

                    ID2=(Token)match(input,ID,FOLLOW_ID_in_variableDeclaration723); if (state.failed) return retval;
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:67:84: ( initializer )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==37) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: initializer
                            {
                            pushFollow(FOLLOW_initializer_in_variableDeclaration725);
                            initializer3=initializer();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:67:97: ( NEWLINE )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==NEWLINE) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: NEWLINE
                            {
                            match(input,NEWLINE,FOLLOW_NEWLINE_in_variableDeclaration728); if (state.failed) return retval;

                            }
                            break;

                    }



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 68:10: -> variableDeclaration(type= $type.text name= $ID.text init= $initializer.st )
                      {
                          retval.st = templateLib.getInstanceOf("variableDeclaration",
                        new STAttrMap().put("type",  (type!=null?type.getText():null) ).put("name",  (ID2!=null?ID2.getText():null) ).put("init",  (initializer3!=null?initializer3.st:null) ));
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
        return retval;
    }
    // $ANTLR end "variableDeclaration"

    public static class initializer_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "initializer"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:71:1: initializer : '=' assignmentExpression -> initializer();
    public final celluloidParser.initializer_return initializer() throws RecognitionException {
        celluloidParser.initializer_return retval = new celluloidParser.initializer_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:72:5: ( '=' assignmentExpression -> initializer())
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:72:10: '=' assignmentExpression
            {
            match(input,37,FOLLOW_37_in_initializer809); if (state.failed) return retval;
            pushFollow(FOLLOW_assignmentExpression_in_initializer811);
            assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 73:10: -> initializer()
              {
                  retval.st = templateLib.getInstanceOf("initializer");
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
        return retval;
    }
    // $ANTLR end "initializer"

    public static class assignmentExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignmentExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:77:1: assignmentExpression : ( logicalORExpression | primaryExpression ASSIGNMENT_OPERATOR assignmentExpression );
    public final celluloidParser.assignmentExpression_return assignmentExpression() throws RecognitionException {
        celluloidParser.assignmentExpression_return retval = new celluloidParser.assignmentExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:78:9: ( logicalORExpression | primaryExpression ASSIGNMENT_OPERATOR assignmentExpression )
            int alt5=2;
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

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:78:11: logicalORExpression
                    {
                    pushFollow(FOLLOW_logicalORExpression_in_assignmentExpression852);
                    logicalORExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:79:11: primaryExpression ASSIGNMENT_OPERATOR assignmentExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_assignmentExpression864);
                    primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,ASSIGNMENT_OPERATOR,FOLLOW_ASSIGNMENT_OPERATOR_in_assignmentExpression866); if (state.failed) return retval;
                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression868);
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
        return retval;
    }
    // $ANTLR end "assignmentExpression"

    public static class logicalORExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "logicalORExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:81:1: logicalORExpression : logicalANDExpression ( 'or' logicalANDExpression )* ;
    public final celluloidParser.logicalORExpression_return logicalORExpression() throws RecognitionException {
        celluloidParser.logicalORExpression_return retval = new celluloidParser.logicalORExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:82:9: ( logicalANDExpression ( 'or' logicalANDExpression )* )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:82:11: logicalANDExpression ( 'or' logicalANDExpression )*
            {
            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression908);
            logicalANDExpression();

            state._fsp--;
            if (state.failed) return retval;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:82:32: ( 'or' logicalANDExpression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==38) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:82:33: 'or' logicalANDExpression
            	    {
            	    match(input,38,FOLLOW_38_in_logicalORExpression911); if (state.failed) return retval;
            	    pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression913);
            	    logicalANDExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

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

    public static class logicalANDExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "logicalANDExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:84:1: logicalANDExpression : equalityExpression ( 'and' equalityExpression )* ;
    public final celluloidParser.logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        celluloidParser.logicalANDExpression_return retval = new celluloidParser.logicalANDExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:85:9: ( equalityExpression ( 'and' equalityExpression )* )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:85:11: equalityExpression ( 'and' equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_logicalANDExpression937);
            equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:85:30: ( 'and' equalityExpression )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==39) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:85:31: 'and' equalityExpression
            	    {
            	    match(input,39,FOLLOW_39_in_logicalANDExpression940); if (state.failed) return retval;
            	    pushFollow(FOLLOW_equalityExpression_in_logicalANDExpression942);
            	    equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:87:1: equalityExpression : relationalExpression ( EQUALITY_OPERATOR relationalExpression )* ;
    public final celluloidParser.equalityExpression_return equalityExpression() throws RecognitionException {
        celluloidParser.equalityExpression_return retval = new celluloidParser.equalityExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:88:9: ( relationalExpression ( EQUALITY_OPERATOR relationalExpression )* )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:88:12: relationalExpression ( EQUALITY_OPERATOR relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression968);
            relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:88:33: ( EQUALITY_OPERATOR relationalExpression )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==EQUALITY_OPERATOR) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:88:34: EQUALITY_OPERATOR relationalExpression
            	    {
            	    match(input,EQUALITY_OPERATOR,FOLLOW_EQUALITY_OPERATOR_in_equalityExpression971); if (state.failed) return retval;
            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression974);
            	    relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:90:1: relationalExpression : additiveExpression ( RELATIONAL_OPERATOR additiveExpression )* ;
    public final celluloidParser.relationalExpression_return relationalExpression() throws RecognitionException {
        celluloidParser.relationalExpression_return retval = new celluloidParser.relationalExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:91:9: ( additiveExpression ( RELATIONAL_OPERATOR additiveExpression )* )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:91:11: additiveExpression ( RELATIONAL_OPERATOR additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression997);
            additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:91:30: ( RELATIONAL_OPERATOR additiveExpression )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RELATIONAL_OPERATOR) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:91:31: RELATIONAL_OPERATOR additiveExpression
            	    {
            	    match(input,RELATIONAL_OPERATOR,FOLLOW_RELATIONAL_OPERATOR_in_relationalExpression1000); if (state.failed) return retval;
            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1003);
            	    additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:93:1: additiveExpression : multiplicativeExpression ( ADDITIVE_OPERATOR multiplicativeExpression )* ;
    public final celluloidParser.additiveExpression_return additiveExpression() throws RecognitionException {
        celluloidParser.additiveExpression_return retval = new celluloidParser.additiveExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:94:9: ( multiplicativeExpression ( ADDITIVE_OPERATOR multiplicativeExpression )* )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:94:11: multiplicativeExpression ( ADDITIVE_OPERATOR multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1027);
            multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:94:36: ( ADDITIVE_OPERATOR multiplicativeExpression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ADDITIVE_OPERATOR) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:94:37: ADDITIVE_OPERATOR multiplicativeExpression
            	    {
            	    match(input,ADDITIVE_OPERATOR,FOLLOW_ADDITIVE_OPERATOR_in_additiveExpression1030); if (state.failed) return retval;
            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1033);
            	    multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:96:1: multiplicativeExpression : primaryExpression ( MULTIPLICATIVE_OPERATOR primaryExpression )* ;
    public final celluloidParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        celluloidParser.multiplicativeExpression_return retval = new celluloidParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:97:2: ( primaryExpression ( MULTIPLICATIVE_OPERATOR primaryExpression )* )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:97:4: primaryExpression ( MULTIPLICATIVE_OPERATOR primaryExpression )*
            {
            pushFollow(FOLLOW_primaryExpression_in_multiplicativeExpression1045);
            primaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:97:22: ( MULTIPLICATIVE_OPERATOR primaryExpression )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==MULTIPLICATIVE_OPERATOR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:97:23: MULTIPLICATIVE_OPERATOR primaryExpression
            	    {
            	    match(input,MULTIPLICATIVE_OPERATOR,FOLLOW_MULTIPLICATIVE_OPERATOR_in_multiplicativeExpression1048); if (state.failed) return retval;
            	    pushFollow(FOLLOW_primaryExpression_in_multiplicativeExpression1051);
            	    primaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:99:1: primaryExpression : ( ID | 'new' ID '(' expressionList ')' | LITERAL | functionCall | predicateCall );
    public final celluloidParser.primaryExpression_return primaryExpression() throws RecognitionException {
        celluloidParser.primaryExpression_return retval = new celluloidParser.primaryExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:100:2: ( ID | 'new' ID '(' expressionList ')' | LITERAL | functionCall | predicateCall )
            int alt12=5;
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

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:100:4: ID
                    {
                    match(input,ID,FOLLOW_ID_in_primaryExpression1063); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:101:4: 'new' ID '(' expressionList ')'
                    {
                    match(input,40,FOLLOW_40_in_primaryExpression1068); if (state.failed) return retval;
                    match(input,ID,FOLLOW_ID_in_primaryExpression1070); if (state.failed) return retval;
                    match(input,41,FOLLOW_41_in_primaryExpression1072); if (state.failed) return retval;
                    pushFollow(FOLLOW_expressionList_in_primaryExpression1074);
                    expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,42,FOLLOW_42_in_primaryExpression1076); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:102:4: LITERAL
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_primaryExpression1081); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:103:4: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_primaryExpression1086);
                    functionCall();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:104:4: predicateCall
                    {
                    pushFollow(FOLLOW_predicateCall_in_primaryExpression1091);
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
        return retval;
    }
    // $ANTLR end "primaryExpression"

    public static class idList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "idList"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:113:1: idList : (ids+= ID ( ',' ids+= ID )* -> idList(ids= $ids ) | '(' ids+= ID ( ',' ids+= ID )* ')' -> idList(ids= $ids ));
    public final celluloidParser.idList_return idList() throws RecognitionException {
        celluloidParser.idList_return retval = new celluloidParser.idList_return();
        retval.start = input.LT(1);

        Token ids=null;
        List list_ids=null;

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:114:5: (ids+= ID ( ',' ids+= ID )* -> idList(ids= $ids ) | '(' ids+= ID ( ',' ids+= ID )* ')' -> idList(ids= $ids ))
            int alt15=2;
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

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:114:10: ids+= ID ( ',' ids+= ID )*
                    {
                    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1119); if (state.failed) return retval;
                    if (list_ids==null) list_ids=new ArrayList();
                    list_ids.add(ids);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:114:20: ( ',' ids+= ID )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==43) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:114:21: ',' ids+= ID
                    	    {
                    	    match(input,43,FOLLOW_43_in_idList1122); if (state.failed) return retval;
                    	    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1128); if (state.failed) return retval;
                    	    if (list_ids==null) list_ids=new ArrayList();
                    	    list_ids.add(ids);


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 115:10: -> idList(ids= $ids )
                      {
                          retval.st = templateLib.getInstanceOf("idList",
                        new STAttrMap().put("ids",  list_ids ));
                      }

                    }
                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:116:10: '(' ids+= ID ( ',' ids+= ID )* ')'
                    {
                    match(input,41,FOLLOW_41_in_idList1162); if (state.failed) return retval;
                    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1168); if (state.failed) return retval;
                    if (list_ids==null) list_ids=new ArrayList();
                    list_ids.add(ids);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:116:24: ( ',' ids+= ID )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==43) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:116:25: ',' ids+= ID
                    	    {
                    	    match(input,43,FOLLOW_43_in_idList1171); if (state.failed) return retval;
                    	    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1177); if (state.failed) return retval;
                    	    if (list_ids==null) list_ids=new ArrayList();
                    	    list_ids.add(ids);


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match(input,42,FOLLOW_42_in_idList1181); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 117:10: -> idList(ids= $ids )
                      {
                          retval.st = templateLib.getInstanceOf("idList",
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
        return retval;
    }
    // $ANTLR end "idList"

    public static class variableList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableList"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:120:1: variableList : (vars+= variableDeclaration ( ',' vars+= variableDeclaration )* -> variableList(vars= $vars ) | '(' vars+= variableDeclaration ( ',' vars+= variableDeclaration )* ')' -> variableList(vars= $vars ));
    public final celluloidParser.variableList_return variableList() throws RecognitionException {
        celluloidParser.variableList_return retval = new celluloidParser.variableList_return();
        retval.start = input.LT(1);

        List list_vars=null;
        RuleReturnScope vars = null;
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:121:5: (vars+= variableDeclaration ( ',' vars+= variableDeclaration )* -> variableList(vars= $vars ) | '(' vars+= variableDeclaration ( ',' vars+= variableDeclaration )* ')' -> variableList(vars= $vars ))
            int alt18=2;
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

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:121:10: vars+= variableDeclaration ( ',' vars+= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_variableList1227);
                    vars=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_vars==null) list_vars=new ArrayList();
                    list_vars.add(vars.getTemplate());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:121:38: ( ',' vars+= variableDeclaration )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==43) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:121:39: ',' vars+= variableDeclaration
                    	    {
                    	    match(input,43,FOLLOW_43_in_variableList1230); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_variableDeclaration_in_variableList1236);
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



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 122:10: -> variableList(vars= $vars )
                      {
                          retval.st = templateLib.getInstanceOf("variableList",
                        new STAttrMap().put("vars",  list_vars ));
                      }

                    }
                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:123:10: '(' vars+= variableDeclaration ( ',' vars+= variableDeclaration )* ')'
                    {
                    match(input,41,FOLLOW_41_in_variableList1270); if (state.failed) return retval;
                    pushFollow(FOLLOW_variableDeclaration_in_variableList1276);
                    vars=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_vars==null) list_vars=new ArrayList();
                    list_vars.add(vars.getTemplate());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:123:42: ( ',' vars+= variableDeclaration )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==43) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:123:43: ',' vars+= variableDeclaration
                    	    {
                    	    match(input,43,FOLLOW_43_in_variableList1279); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_variableDeclaration_in_variableList1285);
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

                    match(input,42,FOLLOW_42_in_variableList1289); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 124:10: -> variableList(vars= $vars )
                      {
                          retval.st = templateLib.getInstanceOf("variableList",
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
        return retval;
    }
    // $ANTLR end "variableList"

    public static class expressionList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expressionList"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:127:1: expressionList : (exps+= assignmentExpression ( ',' exps+= assignmentExpression )* -> expressionList(exps= $exps ) | '(' exps+= assignmentExpression ( ',' exps+= assignmentExpression )* ')' -> expressionList(exps= $exps ));
    public final celluloidParser.expressionList_return expressionList() throws RecognitionException {
        celluloidParser.expressionList_return retval = new celluloidParser.expressionList_return();
        retval.start = input.LT(1);

        List list_exps=null;
        RuleReturnScope exps = null;
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:128:5: (exps+= assignmentExpression ( ',' exps+= assignmentExpression )* -> expressionList(exps= $exps ) | '(' exps+= assignmentExpression ( ',' exps+= assignmentExpression )* ')' -> expressionList(exps= $exps ))
            int alt21=2;
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

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:128:10: exps+= assignmentExpression ( ',' exps+= assignmentExpression )*
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_expressionList1334);
                    exps=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_exps==null) list_exps=new ArrayList();
                    list_exps.add(exps.getTemplate());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:128:39: ( ',' exps+= assignmentExpression )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==43) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:128:40: ',' exps+= assignmentExpression
                    	    {
                    	    match(input,43,FOLLOW_43_in_expressionList1337); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_assignmentExpression_in_expressionList1343);
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



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 129:10: -> expressionList(exps= $exps )
                      {
                          retval.st = templateLib.getInstanceOf("expressionList",
                        new STAttrMap().put("exps",  list_exps ));
                      }

                    }
                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:130:10: '(' exps+= assignmentExpression ( ',' exps+= assignmentExpression )* ')'
                    {
                    match(input,41,FOLLOW_41_in_expressionList1376); if (state.failed) return retval;
                    pushFollow(FOLLOW_assignmentExpression_in_expressionList1382);
                    exps=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_exps==null) list_exps=new ArrayList();
                    list_exps.add(exps.getTemplate());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:130:43: ( ',' exps+= assignmentExpression )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==43) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:130:44: ',' exps+= assignmentExpression
                    	    {
                    	    match(input,43,FOLLOW_43_in_expressionList1385); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_assignmentExpression_in_expressionList1391);
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

                    match(input,42,FOLLOW_42_in_expressionList1395); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 131:10: -> expressionList(exps= $exps )
                      {
                          retval.st = templateLib.getInstanceOf("expressionList",
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
        return retval;
    }
    // $ANTLR end "expressionList"

    public static class functionHeader_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionHeader"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:137:1: functionHeader : 'function' ID '(' variableList ')' -> functionHeader(name= $ID.text args= $variableList.st );
    public final celluloidParser.functionHeader_return functionHeader() throws RecognitionException {
        celluloidParser.functionHeader_return retval = new celluloidParser.functionHeader_return();
        retval.start = input.LT(1);

        Token ID4=null;
        celluloidParser.variableList_return variableList5 = null;


        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:138:5: ( 'function' ID '(' variableList ')' -> functionHeader(name= $ID.text args= $variableList.st ))
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:138:10: 'function' ID '(' variableList ')'
            {
            match(input,44,FOLLOW_44_in_functionHeader1443); if (state.failed) return retval;
            ID4=(Token)match(input,ID,FOLLOW_ID_in_functionHeader1445); if (state.failed) return retval;
            match(input,41,FOLLOW_41_in_functionHeader1447); if (state.failed) return retval;
            pushFollow(FOLLOW_variableList_in_functionHeader1449);
            variableList5=variableList();

            state._fsp--;
            if (state.failed) return retval;
            match(input,42,FOLLOW_42_in_functionHeader1451); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 139:10: -> functionHeader(name= $ID.text args= $variableList.st )
              {
                  retval.st = templateLib.getInstanceOf("functionHeader",
                new STAttrMap().put("name",  (ID4!=null?ID4.getText():null) ).put("args",  (variableList5!=null?variableList5.st:null) ));
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
        return retval;
    }
    // $ANTLR end "functionHeader"

    public static class functionDefinition_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:141:1: functionDefinition : functionHeader START functionBlock END -> functionDefinition(header= $functionHeader.stblock= $functionBlock.st);
    public final celluloidParser.functionDefinition_return functionDefinition() throws RecognitionException {
        celluloidParser.functionDefinition_return retval = new celluloidParser.functionDefinition_return();
        retval.start = input.LT(1);

        celluloidParser.functionHeader_return functionHeader6 = null;

        celluloidParser.functionBlock_return functionBlock7 = null;


        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:141:20: ( functionHeader START functionBlock END -> functionDefinition(header= $functionHeader.stblock= $functionBlock.st))
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:141:22: functionHeader START functionBlock END
            {
            pushFollow(FOLLOW_functionHeader_in_functionDefinition1492);
            functionHeader6=functionHeader();

            state._fsp--;
            if (state.failed) return retval;
            match(input,START,FOLLOW_START_in_functionDefinition1494); if (state.failed) return retval;
            pushFollow(FOLLOW_functionBlock_in_functionDefinition1496);
            functionBlock7=functionBlock();

            state._fsp--;
            if (state.failed) return retval;
            match(input,END,FOLLOW_END_in_functionDefinition1498); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 142:10: -> functionDefinition(header= $functionHeader.stblock= $functionBlock.st)
              {
                  retval.st = templateLib.getInstanceOf("functionDefinition",
                new STAttrMap().put("header",  (functionHeader6!=null?functionHeader6.st:null)).put("block",  (functionBlock7!=null?functionBlock7.st:null)));
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
        return retval;
    }
    // $ANTLR end "functionDefinition"

    public static class functionBlock_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:144:1: functionBlock : ( language_block | functionCall | predicateCall | variableDeclaration )* -> functionBlock();
    public final celluloidParser.functionBlock_return functionBlock() throws RecognitionException {
        celluloidParser.functionBlock_return retval = new celluloidParser.functionBlock_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:145:5: ( ( language_block | functionCall | predicateCall | variableDeclaration )* -> functionBlock())
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:145:10: ( language_block | functionCall | predicateCall | variableDeclaration )*
            {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:145:10: ( language_block | functionCall | predicateCall | variableDeclaration )*
            loop22:
            do {
                int alt22=5;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:145:11: language_block
            	    {
            	    pushFollow(FOLLOW_language_block_in_functionBlock1555);
            	    language_block();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:145:28: functionCall
            	    {
            	    pushFollow(FOLLOW_functionCall_in_functionBlock1559);
            	    functionCall();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:145:43: predicateCall
            	    {
            	    pushFollow(FOLLOW_predicateCall_in_functionBlock1563);
            	    predicateCall();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:145:59: variableDeclaration
            	    {
            	    pushFollow(FOLLOW_variableDeclaration_in_functionBlock1567);
            	    variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);



            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 148:10: -> functionBlock()
              {
                  retval.st = templateLib.getInstanceOf("functionBlock");
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
        return retval;
    }
    // $ANTLR end "functionBlock"

    public static class functionCall_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionCall"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:150:1: functionCall : ID '(' expressionList ')' NEWLINE -> functionCall(name= $ID.text args= $expressionList.st );
    public final celluloidParser.functionCall_return functionCall() throws RecognitionException {
        celluloidParser.functionCall_return retval = new celluloidParser.functionCall_return();
        retval.start = input.LT(1);

        Token ID8=null;
        celluloidParser.expressionList_return expressionList9 = null;


        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:151:5: ( ID '(' expressionList ')' NEWLINE -> functionCall(name= $ID.text args= $expressionList.st ))
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:151:10: ID '(' expressionList ')' NEWLINE
            {
            ID8=(Token)match(input,ID,FOLLOW_ID_in_functionCall1629); if (state.failed) return retval;
            match(input,41,FOLLOW_41_in_functionCall1631); if (state.failed) return retval;
            pushFollow(FOLLOW_expressionList_in_functionCall1633);
            expressionList9=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            match(input,42,FOLLOW_42_in_functionCall1635); if (state.failed) return retval;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_functionCall1637); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 152:10: -> functionCall(name= $ID.text args= $expressionList.st )
              {
                  retval.st = templateLib.getInstanceOf("functionCall",
                new STAttrMap().put("name",  (ID8!=null?ID8.getText():null) ).put("args",  (expressionList9!=null?expressionList9.st:null) ));
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
        return retval;
    }
    // $ANTLR end "functionCall"

    public static class predicateHeader_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "predicateHeader"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:157:1: predicateHeader : 'predicate' ID '(' args= variableList ')' -> predicateHeader(name= $ID.text args= $variableList.st );
    public final celluloidParser.predicateHeader_return predicateHeader() throws RecognitionException {
        celluloidParser.predicateHeader_return retval = new celluloidParser.predicateHeader_return();
        retval.start = input.LT(1);

        Token ID10=null;
        celluloidParser.variableList_return args = null;


        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:158:5: ( 'predicate' ID '(' args= variableList ')' -> predicateHeader(name= $ID.text args= $variableList.st ))
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:158:10: 'predicate' ID '(' args= variableList ')'
            {
            match(input,45,FOLLOW_45_in_predicateHeader1692); if (state.failed) return retval;
            ID10=(Token)match(input,ID,FOLLOW_ID_in_predicateHeader1694); if (state.failed) return retval;
            match(input,41,FOLLOW_41_in_predicateHeader1696); if (state.failed) return retval;
            pushFollow(FOLLOW_variableList_in_predicateHeader1702);
            args=variableList();

            state._fsp--;
            if (state.failed) return retval;
            match(input,42,FOLLOW_42_in_predicateHeader1704); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 160:10: -> predicateHeader(name= $ID.text args= $variableList.st )
              {
                  retval.st = templateLib.getInstanceOf("predicateHeader",
                new STAttrMap().put("name",  (ID10!=null?ID10.getText():null) ).put("args",  (args!=null?args.st:null) ));
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
        return retval;
    }
    // $ANTLR end "predicateHeader"

    public static class predicateDefinition_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "predicateDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:162:1: predicateDefinition : predicateHeader START predicateBlock END -> predicateDefinition(header= $predicateHeader.stblock= $predicateBlock.st);
    public final celluloidParser.predicateDefinition_return predicateDefinition() throws RecognitionException {
        celluloidParser.predicateDefinition_return retval = new celluloidParser.predicateDefinition_return();
        retval.start = input.LT(1);

        celluloidParser.predicateHeader_return predicateHeader11 = null;

        celluloidParser.predicateBlock_return predicateBlock12 = null;


        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:163:5: ( predicateHeader START predicateBlock END -> predicateDefinition(header= $predicateHeader.stblock= $predicateBlock.st))
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:163:10: predicateHeader START predicateBlock END
            {
            pushFollow(FOLLOW_predicateHeader_in_predicateDefinition1763);
            predicateHeader11=predicateHeader();

            state._fsp--;
            if (state.failed) return retval;
            match(input,START,FOLLOW_START_in_predicateDefinition1765); if (state.failed) return retval;
            pushFollow(FOLLOW_predicateBlock_in_predicateDefinition1767);
            predicateBlock12=predicateBlock();

            state._fsp--;
            if (state.failed) return retval;
            match(input,END,FOLLOW_END_in_predicateDefinition1769); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 164:10: -> predicateDefinition(header= $predicateHeader.stblock= $predicateBlock.st)
              {
                  retval.st = templateLib.getInstanceOf("predicateDefinition",
                new STAttrMap().put("header",  (predicateHeader11!=null?predicateHeader11.st:null)).put("block",  (predicateBlock12!=null?predicateBlock12.st:null)));
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
        return retval;
    }
    // $ANTLR end "predicateDefinition"

    public static class predicateBlock_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "predicateBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:166:1: predicateBlock : functionBlock 'returns' assignmentExpression -> predicateBlock();
    public final celluloidParser.predicateBlock_return predicateBlock() throws RecognitionException {
        celluloidParser.predicateBlock_return retval = new celluloidParser.predicateBlock_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:167:5: ( functionBlock 'returns' assignmentExpression -> predicateBlock())
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:167:10: functionBlock 'returns' assignmentExpression
            {
            pushFollow(FOLLOW_functionBlock_in_predicateBlock1821);
            functionBlock();

            state._fsp--;
            if (state.failed) return retval;
            match(input,46,FOLLOW_46_in_predicateBlock1823); if (state.failed) return retval;
            pushFollow(FOLLOW_assignmentExpression_in_predicateBlock1825);
            assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 169:10: -> predicateBlock()
              {
                  retval.st = templateLib.getInstanceOf("predicateBlock");
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
        return retval;
    }
    // $ANTLR end "predicateBlock"

    public static class predicateCall_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "predicateCall"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:171:1: predicateCall : ID '(' expressionList ')' NEWLINE -> predicateCall(name= $ID.text args= $expressionList.st );
    public final celluloidParser.predicateCall_return predicateCall() throws RecognitionException {
        celluloidParser.predicateCall_return retval = new celluloidParser.predicateCall_return();
        retval.start = input.LT(1);

        Token ID13=null;
        celluloidParser.expressionList_return expressionList14 = null;


        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:172:5: ( ID '(' expressionList ')' NEWLINE -> predicateCall(name= $ID.text args= $expressionList.st ))
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:172:10: ID '(' expressionList ')' NEWLINE
            {
            ID13=(Token)match(input,ID,FOLLOW_ID_in_predicateCall1878); if (state.failed) return retval;
            match(input,41,FOLLOW_41_in_predicateCall1880); if (state.failed) return retval;
            pushFollow(FOLLOW_expressionList_in_predicateCall1882);
            expressionList14=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            match(input,42,FOLLOW_42_in_predicateCall1884); if (state.failed) return retval;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_predicateCall1886); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 173:10: -> predicateCall(name= $ID.text args= $expressionList.st )
              {
                  retval.st = templateLib.getInstanceOf("predicateCall",
                new STAttrMap().put("name",  (ID13!=null?ID13.getText():null) ).put("args",  (expressionList14!=null?expressionList14.st:null) ));
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
        return retval;
    }
    // $ANTLR end "predicateCall"

    public static class eventDefinition_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "eventDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:178:1: eventDefinition : 'event' ID NEWLINE -> eventDefinition(name= $ID.text );
    public final celluloidParser.eventDefinition_return eventDefinition() throws RecognitionException {
        celluloidParser.eventDefinition_return retval = new celluloidParser.eventDefinition_return();
        retval.start = input.LT(1);

        Token ID15=null;

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:179:5: ( 'event' ID NEWLINE -> eventDefinition(name= $ID.text ))
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:179:10: 'event' ID NEWLINE
            {
            match(input,47,FOLLOW_47_in_eventDefinition1937); if (state.failed) return retval;
            ID15=(Token)match(input,ID,FOLLOW_ID_in_eventDefinition1939); if (state.failed) return retval;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_eventDefinition1941); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 180:10: -> eventDefinition(name= $ID.text )
              {
                  retval.st = templateLib.getInstanceOf("eventDefinition",
                new STAttrMap().put("name",  (ID15!=null?ID15.getText():null) ));
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
        return retval;
    }
    // $ANTLR end "eventDefinition"

    public static class announcement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "announcement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:1: announcement : 'announce' ID 'when' ID assignmentExpression ;
    public final celluloidParser.announcement_return announcement() throws RecognitionException {
        celluloidParser.announcement_return retval = new celluloidParser.announcement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:187:5: ( 'announce' ID 'when' ID assignmentExpression )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:187:10: 'announce' ID 'when' ID assignmentExpression
            {
            match(input,48,FOLLOW_48_in_announcement1984); if (state.failed) return retval;
            match(input,ID,FOLLOW_ID_in_announcement1986); if (state.failed) return retval;
            match(input,49,FOLLOW_49_in_announcement1988); if (state.failed) return retval;
            match(input,ID,FOLLOW_ID_in_announcement1990); if (state.failed) return retval;
            pushFollow(FOLLOW_assignmentExpression_in_announcement1992);
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
        return retval;
    }
    // $ANTLR end "announcement"

    public static class constraintDefinition_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "constraintDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:192:1: constraintDefinition : 'constraint' ID ( constraintList )? ( 'announces' announces= idList )? START (members= ( variableDeclaration | functionHeader | predicateHeader | announcement ) )* END -> constraintDefinition(name= $ID.text requires= $constraintList.st );
    public final celluloidParser.constraintDefinition_return constraintDefinition() throws RecognitionException {
        celluloidParser.constraintDefinition_return retval = new celluloidParser.constraintDefinition_return();
        retval.start = input.LT(1);

        Token members=null;
        Token ID16=null;
        celluloidParser.idList_return announces = null;

        celluloidParser.constraintList_return constraintList17 = null;


        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:193:5: ( 'constraint' ID ( constraintList )? ( 'announces' announces= idList )? START (members= ( variableDeclaration | functionHeader | predicateHeader | announcement ) )* END -> constraintDefinition(name= $ID.text requires= $constraintList.st ))
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:193:10: 'constraint' ID ( constraintList )? ( 'announces' announces= idList )? START (members= ( variableDeclaration | functionHeader | predicateHeader | announcement ) )* END
            {
            match(input,50,FOLLOW_50_in_constraintDefinition2016); if (state.failed) return retval;
            ID16=(Token)match(input,ID,FOLLOW_ID_in_constraintDefinition2018); if (state.failed) return retval;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:193:26: ( constraintList )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=52 && LA23_0<=53)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:193:27: constraintList
                    {
                    pushFollow(FOLLOW_constraintList_in_constraintDefinition2021);
                    constraintList17=constraintList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:194:10: ( 'announces' announces= idList )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==51) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:194:11: 'announces' announces= idList
                    {
                    match(input,51,FOLLOW_51_in_constraintDefinition2035); if (state.failed) return retval;
                    pushFollow(FOLLOW_idList_in_constraintDefinition2041);
                    announces=idList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            match(input,START,FOLLOW_START_in_constraintDefinition2055); if (state.failed) return retval;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:196:22: (members= ( variableDeclaration | functionHeader | predicateHeader | announcement ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=30 && LA26_0<=36)||(LA26_0>=44 && LA26_0<=45)||LA26_0==48) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: members= ( variableDeclaration | functionHeader | predicateHeader | announcement )
            	    {
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:196:24: ( variableDeclaration | functionHeader | predicateHeader | announcement )
            	    int alt25=4;
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

            	        throw nvae;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:196:25: variableDeclaration
            	            {
            	            pushFollow(FOLLOW_variableDeclaration_in_constraintDefinition2076);
            	            variableDeclaration();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:196:47: functionHeader
            	            {
            	            pushFollow(FOLLOW_functionHeader_in_constraintDefinition2080);
            	            functionHeader();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:196:64: predicateHeader
            	            {
            	            pushFollow(FOLLOW_predicateHeader_in_constraintDefinition2084);
            	            predicateHeader();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:196:82: announcement
            	            {
            	            pushFollow(FOLLOW_announcement_in_constraintDefinition2088);
            	            announcement();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            match(input,END,FOLLOW_END_in_constraintDefinition2101); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 200:10: -> constraintDefinition(name= $ID.text requires= $constraintList.st )
              {
                  retval.st = templateLib.getInstanceOf("constraintDefinition",
                new STAttrMap().put("name",  (ID16!=null?ID16.getText():null) ).put("requires",  (constraintList17!=null?constraintList17.st:null) ));
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
        return retval;
    }
    // $ANTLR end "constraintDefinition"

    public static class constraintList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "constraintList"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:203:1: constraintList : ( 'requires' idList -> constraintList(ids= $idList.st ) | 'accepts' idList -> constraintList(ids= $idList.st ));
    public final celluloidParser.constraintList_return constraintList() throws RecognitionException {
        celluloidParser.constraintList_return retval = new celluloidParser.constraintList_return();
        retval.start = input.LT(1);

        celluloidParser.idList_return idList18 = null;

        celluloidParser.idList_return idList19 = null;


        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:204:2: ( 'requires' idList -> constraintList(ids= $idList.st ) | 'accepts' idList -> constraintList(ids= $idList.st ))
            int alt27=2;
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

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:204:7: 'requires' idList
                    {
                    match(input,52,FOLLOW_52_in_constraintList2180); if (state.failed) return retval;
                    pushFollow(FOLLOW_idList_in_constraintList2182);
                    idList18=idList();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 205:7: -> constraintList(ids= $idList.st )
                      {
                          retval.st = templateLib.getInstanceOf("constraintList",
                        new STAttrMap().put("ids",  (idList18!=null?idList18.st:null) ));
                      }

                    }
                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:206:7: 'accepts' idList
                    {
                    match(input,53,FOLLOW_53_in_constraintList2207); if (state.failed) return retval;
                    pushFollow(FOLLOW_idList_in_constraintList2209);
                    idList19=idList();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 207:7: -> constraintList(ids= $idList.st )
                      {
                          retval.st = templateLib.getInstanceOf("constraintList",
                        new STAttrMap().put("ids",  (idList19!=null?idList19.st:null) ));
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
        return retval;
    }
    // $ANTLR end "constraintList"

    public static class deviceDefinition_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "deviceDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:210:1: deviceDefinition : 'device' ID ( constraintList )? START (members= ( variableDeclaration | functionDefinition | predicateDefinition | COMMENT ) )* END -> deviceDefinition(name= $ID.text accepts= $constraintList.st );
    public final celluloidParser.deviceDefinition_return deviceDefinition() throws RecognitionException {
        celluloidParser.deviceDefinition_return retval = new celluloidParser.deviceDefinition_return();
        retval.start = input.LT(1);

        Token members=null;
        Token ID20=null;
        celluloidParser.constraintList_return constraintList21 = null;


        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:211:5: ( 'device' ID ( constraintList )? START (members= ( variableDeclaration | functionDefinition | predicateDefinition | COMMENT ) )* END -> deviceDefinition(name= $ID.text accepts= $constraintList.st ))
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:211:10: 'device' ID ( constraintList )? START (members= ( variableDeclaration | functionDefinition | predicateDefinition | COMMENT ) )* END
            {
            match(input,54,FOLLOW_54_in_deviceDefinition2248); if (state.failed) return retval;
            ID20=(Token)match(input,ID,FOLLOW_ID_in_deviceDefinition2250); if (state.failed) return retval;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:211:22: ( constraintList )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=52 && LA28_0<=53)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:211:23: constraintList
                    {
                    pushFollow(FOLLOW_constraintList_in_deviceDefinition2253);
                    constraintList21=constraintList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            match(input,START,FOLLOW_START_in_deviceDefinition2267); if (state.failed) return retval;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:213:22: (members= ( variableDeclaration | functionDefinition | predicateDefinition | COMMENT ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==COMMENT||(LA30_0>=30 && LA30_0<=36)||(LA30_0>=44 && LA30_0<=45)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: members= ( variableDeclaration | functionDefinition | predicateDefinition | COMMENT )
            	    {
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:213:24: ( variableDeclaration | functionDefinition | predicateDefinition | COMMENT )
            	    int alt29=4;
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

            	        throw nvae;
            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:213:25: variableDeclaration
            	            {
            	            pushFollow(FOLLOW_variableDeclaration_in_deviceDefinition2288);
            	            variableDeclaration();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:213:47: functionDefinition
            	            {
            	            pushFollow(FOLLOW_functionDefinition_in_deviceDefinition2292);
            	            functionDefinition();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:213:68: predicateDefinition
            	            {
            	            pushFollow(FOLLOW_predicateDefinition_in_deviceDefinition2296);
            	            predicateDefinition();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:213:90: COMMENT
            	            {
            	            match(input,COMMENT,FOLLOW_COMMENT_in_deviceDefinition2300); if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            match(input,END,FOLLOW_END_in_deviceDefinition2314); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 215:10: -> deviceDefinition(name= $ID.text accepts= $constraintList.st )
              {
                  retval.st = templateLib.getInstanceOf("deviceDefinition",
                new STAttrMap().put("name",  (ID20!=null?ID20.getText():null) ).put("accepts",  (constraintList21!=null?constraintList21.st:null) ));
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
        return retval;
    }
    // $ANTLR end "deviceDefinition"

    // $ANTLR start synpred9_celluloid
    public final void synpred9_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:78:11: ( logicalORExpression )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:78:11: logicalORExpression
        {
        pushFollow(FOLLOW_logicalORExpression_in_synpred9_celluloid852);
        logicalORExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_celluloid

    // $ANTLR start synpred16_celluloid
    public final void synpred16_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:100:4: ( ID )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:100:4: ID
        {
        match(input,ID,FOLLOW_ID_in_synpred16_celluloid1063); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_celluloid

    // $ANTLR start synpred19_celluloid
    public final void synpred19_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:103:4: ( functionCall )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:103:4: functionCall
        {
        pushFollow(FOLLOW_functionCall_in_synpred19_celluloid1086);
        functionCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_celluloid

    // $ANTLR start synpred30_celluloid
    public final void synpred30_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:145:28: ( functionCall )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:145:28: functionCall
        {
        pushFollow(FOLLOW_functionCall_in_synpred30_celluloid1559);
        functionCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_celluloid

    // $ANTLR start synpred31_celluloid
    public final void synpred31_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:145:43: ( predicateCall )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:145:43: predicateCall
        {
        pushFollow(FOLLOW_predicateCall_in_synpred31_celluloid1563);
        predicateCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_celluloid

    // Delegated rules

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
    public final boolean synpred30_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
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
            return "()* loopback of 145:10: ( language_block | functionCall | predicateCall | variableDeclaration )*";
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
    public static final BitSet FOLLOW_30_in_variableDeclaration650 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_variableDeclaration652 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NEWLINE_in_variableDeclaration654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_variableDeclaration700 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_32_in_variableDeclaration704 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_33_in_variableDeclaration708 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_34_in_variableDeclaration712 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_35_in_variableDeclaration716 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_36_in_variableDeclaration720 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_variableDeclaration723 = new BitSet(new long[]{0x0000002000000202L});
    public static final BitSet FOLLOW_initializer_in_variableDeclaration725 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_NEWLINE_in_variableDeclaration728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_initializer809 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_assignmentExpression_in_initializer811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_assignmentExpression852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_assignmentExpression864 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ASSIGNMENT_OPERATOR_in_assignmentExpression866 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression908 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_logicalORExpression911 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression913 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalANDExpression937 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_logicalANDExpression940 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalANDExpression942 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression968 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_EQUALITY_OPERATOR_in_equalityExpression971 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression974 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression997 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_RELATIONAL_OPERATOR_in_relationalExpression1000 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1003 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1027 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ADDITIVE_OPERATOR_in_additiveExpression1030 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1033 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_primaryExpression_in_multiplicativeExpression1045 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_MULTIPLICATIVE_OPERATOR_in_multiplicativeExpression1048 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_primaryExpression_in_multiplicativeExpression1051 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ID_in_primaryExpression1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_primaryExpression1068 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_primaryExpression1070 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_primaryExpression1072 = new BitSet(new long[]{0x0000030008000100L});
    public static final BitSet FOLLOW_expressionList_in_primaryExpression1074 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_primaryExpression1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_in_primaryExpression1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primaryExpression1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicateCall_in_primaryExpression1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idList1119 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_idList1122 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_idList1128 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_41_in_idList1162 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_idList1168 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_43_in_idList1171 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_idList1177 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_42_in_idList1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1227 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_variableList1230 = new BitSet(new long[]{0x0000001FC0000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1236 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_41_in_variableList1270 = new BitSet(new long[]{0x0000001FC0000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1276 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_43_in_variableList1279 = new BitSet(new long[]{0x0000001FC0000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1285 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_42_in_variableList1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1334 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_expressionList1337 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1343 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_41_in_expressionList1376 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1382 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_43_in_expressionList1385 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1391 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_42_in_expressionList1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_functionHeader1443 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_functionHeader1445 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_functionHeader1447 = new BitSet(new long[]{0x0000021FC0000000L});
    public static final BitSet FOLLOW_variableList_in_functionHeader1449 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_functionHeader1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionHeader_in_functionDefinition1492 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_START_in_functionDefinition1494 = new BitSet(new long[]{0x0000011FE8000180L});
    public static final BitSet FOLLOW_functionBlock_in_functionDefinition1496 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_END_in_functionDefinition1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_language_block_in_functionBlock1555 = new BitSet(new long[]{0x0000011FE8000102L});
    public static final BitSet FOLLOW_functionCall_in_functionBlock1559 = new BitSet(new long[]{0x0000011FE8000102L});
    public static final BitSet FOLLOW_predicateCall_in_functionBlock1563 = new BitSet(new long[]{0x0000011FE8000102L});
    public static final BitSet FOLLOW_variableDeclaration_in_functionBlock1567 = new BitSet(new long[]{0x0000011FE8000102L});
    public static final BitSet FOLLOW_ID_in_functionCall1629 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_functionCall1631 = new BitSet(new long[]{0x0000030008000100L});
    public static final BitSet FOLLOW_expressionList_in_functionCall1633 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_functionCall1635 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NEWLINE_in_functionCall1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_predicateHeader1692 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_predicateHeader1694 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_predicateHeader1696 = new BitSet(new long[]{0x0000021FC0000000L});
    public static final BitSet FOLLOW_variableList_in_predicateHeader1702 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_predicateHeader1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicateHeader_in_predicateDefinition1763 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_START_in_predicateDefinition1765 = new BitSet(new long[]{0x0000411FE8000100L});
    public static final BitSet FOLLOW_predicateBlock_in_predicateDefinition1767 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_END_in_predicateDefinition1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionBlock_in_predicateBlock1821 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_predicateBlock1823 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_assignmentExpression_in_predicateBlock1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_predicateCall1878 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_predicateCall1880 = new BitSet(new long[]{0x0000030008000100L});
    public static final BitSet FOLLOW_expressionList_in_predicateCall1882 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_predicateCall1884 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NEWLINE_in_predicateCall1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_eventDefinition1937 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_eventDefinition1939 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NEWLINE_in_eventDefinition1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_announcement1984 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_announcement1986 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_announcement1988 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_announcement1990 = new BitSet(new long[]{0x0000010008000100L});
    public static final BitSet FOLLOW_assignmentExpression_in_announcement1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_constraintDefinition2016 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_constraintDefinition2018 = new BitSet(new long[]{0x0038000000000040L});
    public static final BitSet FOLLOW_constraintList_in_constraintDefinition2021 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_51_in_constraintDefinition2035 = new BitSet(new long[]{0x0000020000000100L});
    public static final BitSet FOLLOW_idList_in_constraintDefinition2041 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_START_in_constraintDefinition2055 = new BitSet(new long[]{0x0001301FC0000080L});
    public static final BitSet FOLLOW_variableDeclaration_in_constraintDefinition2076 = new BitSet(new long[]{0x0001301FC0000080L});
    public static final BitSet FOLLOW_functionHeader_in_constraintDefinition2080 = new BitSet(new long[]{0x0001301FC0000080L});
    public static final BitSet FOLLOW_predicateHeader_in_constraintDefinition2084 = new BitSet(new long[]{0x0001301FC0000080L});
    public static final BitSet FOLLOW_announcement_in_constraintDefinition2088 = new BitSet(new long[]{0x0001301FC0000080L});
    public static final BitSet FOLLOW_END_in_constraintDefinition2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_constraintList2180 = new BitSet(new long[]{0x0000020000000100L});
    public static final BitSet FOLLOW_idList_in_constraintList2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_constraintList2207 = new BitSet(new long[]{0x0000020000000100L});
    public static final BitSet FOLLOW_idList_in_constraintList2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_deviceDefinition2248 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_deviceDefinition2250 = new BitSet(new long[]{0x0030000000000040L});
    public static final BitSet FOLLOW_constraintList_in_deviceDefinition2253 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_START_in_deviceDefinition2267 = new BitSet(new long[]{0x0000301FC0000880L});
    public static final BitSet FOLLOW_variableDeclaration_in_deviceDefinition2288 = new BitSet(new long[]{0x0000301FC0000880L});
    public static final BitSet FOLLOW_functionDefinition_in_deviceDefinition2292 = new BitSet(new long[]{0x0000301FC0000880L});
    public static final BitSet FOLLOW_predicateDefinition_in_deviceDefinition2296 = new BitSet(new long[]{0x0000301FC0000880L});
    public static final BitSet FOLLOW_COMMENT_in_deviceDefinition2300 = new BitSet(new long[]{0x0000301FC0000880L});
    public static final BitSet FOLLOW_END_in_deviceDefinition2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_synpred9_celluloid852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred16_celluloid1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_synpred19_celluloid1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_synpred30_celluloid1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicateCall_in_synpred31_celluloid1563 = new BitSet(new long[]{0x0000000000000002L});

}