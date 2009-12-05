// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g 2009-12-05 17:10:16

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOL", "TYPE", "LANGUAGE", "START", "END", "ID", "NEWLINE", "WS", "COMMENT", "EXPONENT", "NUMBER", "SECOND", "MINUTE", "HOUR", "DAY", "TIME", "ESC_SEQ", "CHAR", "STRING", "ASSIGNMENT_OPERATOR", "EQUALITY_OPERATOR", "RELATIONAL_OPERATOR", "ADDITIVE_OPERATOR", "MULTIPLICATIVE_OPERATOR", "LITERAL", "'in'", "'*'", "'timeline'", "'='", "'or'", "'and'", "'new'", "'('", "')'", "','", "'function'", "'predicate'", "'returns'", "'event'", "'announce'", "'when'", "'constraint'", "'announces'", "'requires'", "'accepts'", "'device'"
    };
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
    public static final int ASSIGNMENT_OPERATOR=23;
    public static final int START=7;
    public static final int END=8;
    public static final int MINUTE=16;
    public static final int STRING=22;

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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:13:1: language_block_decl : 'in' LANGUAGE START language_block END ;
    public final celluloidParser.language_block_decl_return language_block_decl() throws RecognitionException {
        celluloidParser.language_block_decl_return retval = new celluloidParser.language_block_decl_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:13:21: ( 'in' LANGUAGE START language_block END )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:13:23: 'in' LANGUAGE START language_block END
            {
            match(input,29,FOLLOW_29_in_language_block_decl85); if (state.failed) return retval;
            match(input,LANGUAGE,FOLLOW_LANGUAGE_in_language_block_decl87); if (state.failed) return retval;
            match(input,START,FOLLOW_START_in_language_block_decl89); if (state.failed) return retval;
            pushFollow(FOLLOW_language_block_in_language_block_decl91);
            language_block();

            state._fsp--;
            if (state.failed) return retval;
            match(input,END,FOLLOW_END_in_language_block_decl93); if (state.failed) return retval;

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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:15:1: language_block : '*' ;
    public final celluloidParser.language_block_return language_block() throws RecognitionException {
        celluloidParser.language_block_return retval = new celluloidParser.language_block_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:15:21: ( '*' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:15:23: '*'
            {
            match(input,30,FOLLOW_30_in_language_block123); if (state.failed) return retval;

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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:64:1: variableDeclaration : ( 'timeline' ID NEWLINE -> timelineDeclaration(name= $ID.text ) | TYPE ID ( initializer )? ( NEWLINE )? -> variableDeclaration(type= $TYPE.text name= $ID.text init= $initializer.st ));
    public final celluloidParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        celluloidParser.variableDeclaration_return retval = new celluloidParser.variableDeclaration_return();
        retval.start = input.LT(1);

        Token ID1=null;
        Token TYPE2=null;
        Token ID3=null;
        celluloidParser.initializer_return initializer4 = null;


        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:65:5: ( 'timeline' ID NEWLINE -> timelineDeclaration(name= $ID.text ) | TYPE ID ( initializer )? ( NEWLINE )? -> variableDeclaration(type= $TYPE.text name= $ID.text init= $initializer.st ))
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            else if ( (LA3_0==TYPE) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:65:10: 'timeline' ID NEWLINE
                    {
                    match(input,31,FOLLOW_31_in_variableDeclaration682); if (state.failed) return retval;
                    ID1=(Token)match(input,ID,FOLLOW_ID_in_variableDeclaration684); if (state.failed) return retval;
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_variableDeclaration686); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 66:10: -> timelineDeclaration(name= $ID.text )
                      {
                          retval.st = templateLib.getInstanceOf("timelineDeclaration",
                        new STAttrMap().put("name",  (ID1!=null?ID1.getText():null) ));
                      }

                    }
                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:68:10: TYPE ID ( initializer )? ( NEWLINE )?
                    {
                    TYPE2=(Token)match(input,TYPE,FOLLOW_TYPE_in_variableDeclaration727); if (state.failed) return retval;
                    ID3=(Token)match(input,ID,FOLLOW_ID_in_variableDeclaration729); if (state.failed) return retval;
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:68:18: ( initializer )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==32) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: initializer
                            {
                            pushFollow(FOLLOW_initializer_in_variableDeclaration731);
                            initializer4=initializer();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:68:31: ( NEWLINE )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==NEWLINE) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: NEWLINE
                            {
                            match(input,NEWLINE,FOLLOW_NEWLINE_in_variableDeclaration734); if (state.failed) return retval;

                            }
                            break;

                    }



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 69:10: -> variableDeclaration(type= $TYPE.text name= $ID.text init= $initializer.st )
                      {
                          retval.st = templateLib.getInstanceOf("variableDeclaration",
                        new STAttrMap().put("type",  (TYPE2!=null?TYPE2.getText():null) ).put("name",  (ID3!=null?ID3.getText():null) ).put("init",  (initializer4!=null?initializer4.st:null) ));
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:72:1: initializer : '=' assignmentExpression -> initializer();
    public final celluloidParser.initializer_return initializer() throws RecognitionException {
        celluloidParser.initializer_return retval = new celluloidParser.initializer_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:73:5: ( '=' assignmentExpression -> initializer())
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:73:10: '=' assignmentExpression
            {
            match(input,32,FOLLOW_32_in_initializer815); if (state.failed) return retval;
            pushFollow(FOLLOW_assignmentExpression_in_initializer817);
            assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 74:10: -> initializer()
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:78:1: assignmentExpression : ( logicalORExpression | primaryExpression ASSIGNMENT_OPERATOR assignmentExpression );
    public final celluloidParser.assignmentExpression_return assignmentExpression() throws RecognitionException {
        celluloidParser.assignmentExpression_return retval = new celluloidParser.assignmentExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:79:9: ( logicalORExpression | primaryExpression ASSIGNMENT_OPERATOR assignmentExpression )
            int alt4=2;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA4_1 = input.LA(2);

                if ( (synpred4_celluloid()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                int LA4_2 = input.LA(2);

                if ( (synpred4_celluloid()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case LITERAL:
                {
                int LA4_3 = input.LA(2);

                if ( (synpred4_celluloid()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:79:11: logicalORExpression
                    {
                    pushFollow(FOLLOW_logicalORExpression_in_assignmentExpression858);
                    logicalORExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:80:11: primaryExpression ASSIGNMENT_OPERATOR assignmentExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_assignmentExpression870);
                    primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,ASSIGNMENT_OPERATOR,FOLLOW_ASSIGNMENT_OPERATOR_in_assignmentExpression872); if (state.failed) return retval;
                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression874);
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:82:1: logicalORExpression : logicalANDExpression ( 'or' logicalANDExpression )* ;
    public final celluloidParser.logicalORExpression_return logicalORExpression() throws RecognitionException {
        celluloidParser.logicalORExpression_return retval = new celluloidParser.logicalORExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:83:9: ( logicalANDExpression ( 'or' logicalANDExpression )* )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:83:11: logicalANDExpression ( 'or' logicalANDExpression )*
            {
            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression914);
            logicalANDExpression();

            state._fsp--;
            if (state.failed) return retval;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:83:32: ( 'or' logicalANDExpression )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==33) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:83:33: 'or' logicalANDExpression
            	    {
            	    match(input,33,FOLLOW_33_in_logicalORExpression917); if (state.failed) return retval;
            	    pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression919);
            	    logicalANDExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:85:1: logicalANDExpression : equalityExpression ( 'and' equalityExpression )* ;
    public final celluloidParser.logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        celluloidParser.logicalANDExpression_return retval = new celluloidParser.logicalANDExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:86:9: ( equalityExpression ( 'and' equalityExpression )* )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:86:11: equalityExpression ( 'and' equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_logicalANDExpression943);
            equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:86:30: ( 'and' equalityExpression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==34) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:86:31: 'and' equalityExpression
            	    {
            	    match(input,34,FOLLOW_34_in_logicalANDExpression946); if (state.failed) return retval;
            	    pushFollow(FOLLOW_equalityExpression_in_logicalANDExpression948);
            	    equalityExpression();

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
    // $ANTLR end "logicalANDExpression"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "equalityExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:88:1: equalityExpression : relationalExpression ( EQUALITY_OPERATOR relationalExpression )* ;
    public final celluloidParser.equalityExpression_return equalityExpression() throws RecognitionException {
        celluloidParser.equalityExpression_return retval = new celluloidParser.equalityExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:89:9: ( relationalExpression ( EQUALITY_OPERATOR relationalExpression )* )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:89:12: relationalExpression ( EQUALITY_OPERATOR relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression974);
            relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:89:33: ( EQUALITY_OPERATOR relationalExpression )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==EQUALITY_OPERATOR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:89:34: EQUALITY_OPERATOR relationalExpression
            	    {
            	    match(input,EQUALITY_OPERATOR,FOLLOW_EQUALITY_OPERATOR_in_equalityExpression977); if (state.failed) return retval;
            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression980);
            	    relationalExpression();

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
    // $ANTLR end "equalityExpression"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "relationalExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:91:1: relationalExpression : additiveExpression ( RELATIONAL_OPERATOR additiveExpression )* ;
    public final celluloidParser.relationalExpression_return relationalExpression() throws RecognitionException {
        celluloidParser.relationalExpression_return retval = new celluloidParser.relationalExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:92:9: ( additiveExpression ( RELATIONAL_OPERATOR additiveExpression )* )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:92:11: additiveExpression ( RELATIONAL_OPERATOR additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1003);
            additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:92:30: ( RELATIONAL_OPERATOR additiveExpression )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RELATIONAL_OPERATOR) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:92:31: RELATIONAL_OPERATOR additiveExpression
            	    {
            	    match(input,RELATIONAL_OPERATOR,FOLLOW_RELATIONAL_OPERATOR_in_relationalExpression1006); if (state.failed) return retval;
            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1009);
            	    additiveExpression();

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
    // $ANTLR end "relationalExpression"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "additiveExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:94:1: additiveExpression : multiplicativeExpression ( ADDITIVE_OPERATOR multiplicativeExpression )* ;
    public final celluloidParser.additiveExpression_return additiveExpression() throws RecognitionException {
        celluloidParser.additiveExpression_return retval = new celluloidParser.additiveExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:95:9: ( multiplicativeExpression ( ADDITIVE_OPERATOR multiplicativeExpression )* )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:95:11: multiplicativeExpression ( ADDITIVE_OPERATOR multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1033);
            multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:95:36: ( ADDITIVE_OPERATOR multiplicativeExpression )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ADDITIVE_OPERATOR) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:95:37: ADDITIVE_OPERATOR multiplicativeExpression
            	    {
            	    match(input,ADDITIVE_OPERATOR,FOLLOW_ADDITIVE_OPERATOR_in_additiveExpression1036); if (state.failed) return retval;
            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1039);
            	    multiplicativeExpression();

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
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "multiplicativeExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:97:1: multiplicativeExpression : primaryExpression ( MULTIPLICATIVE_OPERATOR primaryExpression )* ;
    public final celluloidParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        celluloidParser.multiplicativeExpression_return retval = new celluloidParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:98:2: ( primaryExpression ( MULTIPLICATIVE_OPERATOR primaryExpression )* )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:98:4: primaryExpression ( MULTIPLICATIVE_OPERATOR primaryExpression )*
            {
            pushFollow(FOLLOW_primaryExpression_in_multiplicativeExpression1051);
            primaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:98:22: ( MULTIPLICATIVE_OPERATOR primaryExpression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==MULTIPLICATIVE_OPERATOR) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:98:23: MULTIPLICATIVE_OPERATOR primaryExpression
            	    {
            	    match(input,MULTIPLICATIVE_OPERATOR,FOLLOW_MULTIPLICATIVE_OPERATOR_in_multiplicativeExpression1054); if (state.failed) return retval;
            	    pushFollow(FOLLOW_primaryExpression_in_multiplicativeExpression1057);
            	    primaryExpression();

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
    // $ANTLR end "multiplicativeExpression"

    public static class primaryExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "primaryExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:100:1: primaryExpression : ( ID | 'new' ID '(' expressionList ')' | LITERAL | functionCall | predicateCall );
    public final celluloidParser.primaryExpression_return primaryExpression() throws RecognitionException {
        celluloidParser.primaryExpression_return retval = new celluloidParser.primaryExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:101:2: ( ID | 'new' ID '(' expressionList ')' | LITERAL | functionCall | predicateCall )
            int alt11=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA11_1 = input.LA(2);

                if ( (synpred11_celluloid()) ) {
                    alt11=1;
                }
                else if ( (synpred14_celluloid()) ) {
                    alt11=4;
                }
                else if ( (true) ) {
                    alt11=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                alt11=2;
                }
                break;
            case LITERAL:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:101:4: ID
                    {
                    match(input,ID,FOLLOW_ID_in_primaryExpression1069); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:102:4: 'new' ID '(' expressionList ')'
                    {
                    match(input,35,FOLLOW_35_in_primaryExpression1074); if (state.failed) return retval;
                    match(input,ID,FOLLOW_ID_in_primaryExpression1076); if (state.failed) return retval;
                    match(input,36,FOLLOW_36_in_primaryExpression1078); if (state.failed) return retval;
                    pushFollow(FOLLOW_expressionList_in_primaryExpression1080);
                    expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,37,FOLLOW_37_in_primaryExpression1082); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:103:4: LITERAL
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_primaryExpression1087); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:104:4: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_primaryExpression1092);
                    functionCall();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:105:4: predicateCall
                    {
                    pushFollow(FOLLOW_predicateCall_in_primaryExpression1097);
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:114:1: idList : (ids+= ID ( ',' ids+= ID )* -> idList(ids= $ids ) | '(' ids+= ID ( ',' ids+= ID )* ')' -> idList(ids= $ids ));
    public final celluloidParser.idList_return idList() throws RecognitionException {
        celluloidParser.idList_return retval = new celluloidParser.idList_return();
        retval.start = input.LT(1);

        Token ids=null;
        List list_ids=null;

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:115:5: (ids+= ID ( ',' ids+= ID )* -> idList(ids= $ids ) | '(' ids+= ID ( ',' ids+= ID )* ')' -> idList(ids= $ids ))
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==36) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:115:10: ids+= ID ( ',' ids+= ID )*
                    {
                    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1125); if (state.failed) return retval;
                    if (list_ids==null) list_ids=new ArrayList();
                    list_ids.add(ids);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:115:20: ( ',' ids+= ID )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==38) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:115:21: ',' ids+= ID
                    	    {
                    	    match(input,38,FOLLOW_38_in_idList1128); if (state.failed) return retval;
                    	    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1134); if (state.failed) return retval;
                    	    if (list_ids==null) list_ids=new ArrayList();
                    	    list_ids.add(ids);


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 116:10: -> idList(ids= $ids )
                      {
                          retval.st = templateLib.getInstanceOf("idList",
                        new STAttrMap().put("ids",  list_ids ));
                      }

                    }
                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:117:10: '(' ids+= ID ( ',' ids+= ID )* ')'
                    {
                    match(input,36,FOLLOW_36_in_idList1168); if (state.failed) return retval;
                    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1174); if (state.failed) return retval;
                    if (list_ids==null) list_ids=new ArrayList();
                    list_ids.add(ids);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:117:24: ( ',' ids+= ID )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==38) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:117:25: ',' ids+= ID
                    	    {
                    	    match(input,38,FOLLOW_38_in_idList1177); if (state.failed) return retval;
                    	    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1183); if (state.failed) return retval;
                    	    if (list_ids==null) list_ids=new ArrayList();
                    	    list_ids.add(ids);


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match(input,37,FOLLOW_37_in_idList1187); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 118:10: -> idList(ids= $ids )
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:121:1: variableList : (vars+= variableDeclaration ( ',' vars+= variableDeclaration )* -> variableList(vars= $vars ) | '(' vars+= variableDeclaration ( ',' vars+= variableDeclaration )* ')' -> variableList(vars= $vars ));
    public final celluloidParser.variableList_return variableList() throws RecognitionException {
        celluloidParser.variableList_return retval = new celluloidParser.variableList_return();
        retval.start = input.LT(1);

        List list_vars=null;
        RuleReturnScope vars = null;
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:122:5: (vars+= variableDeclaration ( ',' vars+= variableDeclaration )* -> variableList(vars= $vars ) | '(' vars+= variableDeclaration ( ',' vars+= variableDeclaration )* ')' -> variableList(vars= $vars ))
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==TYPE||LA17_0==31) ) {
                alt17=1;
            }
            else if ( (LA17_0==36) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:122:10: vars+= variableDeclaration ( ',' vars+= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_variableList1233);
                    vars=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_vars==null) list_vars=new ArrayList();
                    list_vars.add(vars.getTemplate());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:122:38: ( ',' vars+= variableDeclaration )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==38) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:122:39: ',' vars+= variableDeclaration
                    	    {
                    	    match(input,38,FOLLOW_38_in_variableList1236); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_variableDeclaration_in_variableList1242);
                    	    vars=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if (list_vars==null) list_vars=new ArrayList();
                    	    list_vars.add(vars.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 123:10: -> variableList(vars= $vars )
                      {
                          retval.st = templateLib.getInstanceOf("variableList",
                        new STAttrMap().put("vars",  list_vars ));
                      }

                    }
                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:124:10: '(' vars+= variableDeclaration ( ',' vars+= variableDeclaration )* ')'
                    {
                    match(input,36,FOLLOW_36_in_variableList1276); if (state.failed) return retval;
                    pushFollow(FOLLOW_variableDeclaration_in_variableList1282);
                    vars=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_vars==null) list_vars=new ArrayList();
                    list_vars.add(vars.getTemplate());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:124:42: ( ',' vars+= variableDeclaration )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==38) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:124:43: ',' vars+= variableDeclaration
                    	    {
                    	    match(input,38,FOLLOW_38_in_variableList1285); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_variableDeclaration_in_variableList1291);
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

                    match(input,37,FOLLOW_37_in_variableList1295); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 125:10: -> variableList(vars= $vars )
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:128:1: expressionList : (exps+= assignmentExpression ( ',' exps+= assignmentExpression )* -> expressionList(exps= $exps ) | '(' exps+= assignmentExpression ( ',' exps+= assignmentExpression )* ')' -> expressionList(exps= $exps ));
    public final celluloidParser.expressionList_return expressionList() throws RecognitionException {
        celluloidParser.expressionList_return retval = new celluloidParser.expressionList_return();
        retval.start = input.LT(1);

        List list_exps=null;
        RuleReturnScope exps = null;
        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:129:5: (exps+= assignmentExpression ( ',' exps+= assignmentExpression )* -> expressionList(exps= $exps ) | '(' exps+= assignmentExpression ( ',' exps+= assignmentExpression )* ')' -> expressionList(exps= $exps ))
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID||LA20_0==LITERAL||LA20_0==35) ) {
                alt20=1;
            }
            else if ( (LA20_0==36) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:129:10: exps+= assignmentExpression ( ',' exps+= assignmentExpression )*
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_expressionList1340);
                    exps=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_exps==null) list_exps=new ArrayList();
                    list_exps.add(exps.getTemplate());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:129:39: ( ',' exps+= assignmentExpression )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==38) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:129:40: ',' exps+= assignmentExpression
                    	    {
                    	    match(input,38,FOLLOW_38_in_expressionList1343); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_assignmentExpression_in_expressionList1349);
                    	    exps=assignmentExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if (list_exps==null) list_exps=new ArrayList();
                    	    list_exps.add(exps.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 130:10: -> expressionList(exps= $exps )
                      {
                          retval.st = templateLib.getInstanceOf("expressionList",
                        new STAttrMap().put("exps",  list_exps ));
                      }

                    }
                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:131:10: '(' exps+= assignmentExpression ( ',' exps+= assignmentExpression )* ')'
                    {
                    match(input,36,FOLLOW_36_in_expressionList1382); if (state.failed) return retval;
                    pushFollow(FOLLOW_assignmentExpression_in_expressionList1388);
                    exps=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_exps==null) list_exps=new ArrayList();
                    list_exps.add(exps.getTemplate());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:131:43: ( ',' exps+= assignmentExpression )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==38) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:131:44: ',' exps+= assignmentExpression
                    	    {
                    	    match(input,38,FOLLOW_38_in_expressionList1391); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_assignmentExpression_in_expressionList1397);
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

                    match(input,37,FOLLOW_37_in_expressionList1401); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 132:10: -> expressionList(exps= $exps )
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:138:1: functionHeader : 'function' ID '(' variableList ')' -> functionHeader(name= $ID.text args= $variableList.st );
    public final celluloidParser.functionHeader_return functionHeader() throws RecognitionException {
        celluloidParser.functionHeader_return retval = new celluloidParser.functionHeader_return();
        retval.start = input.LT(1);

        Token ID5=null;
        celluloidParser.variableList_return variableList6 = null;


        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:139:5: ( 'function' ID '(' variableList ')' -> functionHeader(name= $ID.text args= $variableList.st ))
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:139:10: 'function' ID '(' variableList ')'
            {
            match(input,39,FOLLOW_39_in_functionHeader1449); if (state.failed) return retval;
            ID5=(Token)match(input,ID,FOLLOW_ID_in_functionHeader1451); if (state.failed) return retval;
            match(input,36,FOLLOW_36_in_functionHeader1453); if (state.failed) return retval;
            pushFollow(FOLLOW_variableList_in_functionHeader1455);
            variableList6=variableList();

            state._fsp--;
            if (state.failed) return retval;
            match(input,37,FOLLOW_37_in_functionHeader1457); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 140:10: -> functionHeader(name= $ID.text args= $variableList.st )
              {
                  retval.st = templateLib.getInstanceOf("functionHeader",
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
        return retval;
    }
    // $ANTLR end "functionHeader"

    public static class functionDefinition_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:142:1: functionDefinition : functionHeader START functionBlock END -> functionDefinition(header= $functionHeader.stblock= $functionBlock.st);
    public final celluloidParser.functionDefinition_return functionDefinition() throws RecognitionException {
        celluloidParser.functionDefinition_return retval = new celluloidParser.functionDefinition_return();
        retval.start = input.LT(1);

        celluloidParser.functionHeader_return functionHeader7 = null;

        celluloidParser.functionBlock_return functionBlock8 = null;


        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:142:20: ( functionHeader START functionBlock END -> functionDefinition(header= $functionHeader.stblock= $functionBlock.st))
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:142:22: functionHeader START functionBlock END
            {
            pushFollow(FOLLOW_functionHeader_in_functionDefinition1498);
            functionHeader7=functionHeader();

            state._fsp--;
            if (state.failed) return retval;
            match(input,START,FOLLOW_START_in_functionDefinition1500); if (state.failed) return retval;
            pushFollow(FOLLOW_functionBlock_in_functionDefinition1502);
            functionBlock8=functionBlock();

            state._fsp--;
            if (state.failed) return retval;
            match(input,END,FOLLOW_END_in_functionDefinition1504); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 143:10: -> functionDefinition(header= $functionHeader.stblock= $functionBlock.st)
              {
                  retval.st = templateLib.getInstanceOf("functionDefinition",
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
        return retval;
    }
    // $ANTLR end "functionDefinition"

    public static class functionBlock_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:145:1: functionBlock : ( language_block | functionCall | predicateCall | variableDeclaration )* -> functionBlock();
    public final celluloidParser.functionBlock_return functionBlock() throws RecognitionException {
        celluloidParser.functionBlock_return retval = new celluloidParser.functionBlock_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:146:5: ( ( language_block | functionCall | predicateCall | variableDeclaration )* -> functionBlock())
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:146:10: ( language_block | functionCall | predicateCall | variableDeclaration )*
            {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:146:10: ( language_block | functionCall | predicateCall | variableDeclaration )*
            loop21:
            do {
                int alt21=5;
                switch ( input.LA(1) ) {
                case 30:
                    {
                    alt21=1;
                    }
                    break;
                case ID:
                    {
                    int LA21_4 = input.LA(2);

                    if ( (synpred25_celluloid()) ) {
                        alt21=2;
                    }
                    else if ( (synpred26_celluloid()) ) {
                        alt21=3;
                    }


                    }
                    break;
                case TYPE:
                case 31:
                    {
                    alt21=4;
                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:146:11: language_block
            	    {
            	    pushFollow(FOLLOW_language_block_in_functionBlock1561);
            	    language_block();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:146:28: functionCall
            	    {
            	    pushFollow(FOLLOW_functionCall_in_functionBlock1565);
            	    functionCall();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:146:43: predicateCall
            	    {
            	    pushFollow(FOLLOW_predicateCall_in_functionBlock1569);
            	    predicateCall();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:146:59: variableDeclaration
            	    {
            	    pushFollow(FOLLOW_variableDeclaration_in_functionBlock1573);
            	    variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);



            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 149:10: -> functionBlock()
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:151:1: functionCall : ID '(' expressionList ')' NEWLINE -> functionCall(name= $ID.text args= $expressionList.st );
    public final celluloidParser.functionCall_return functionCall() throws RecognitionException {
        celluloidParser.functionCall_return retval = new celluloidParser.functionCall_return();
        retval.start = input.LT(1);

        Token ID9=null;
        celluloidParser.expressionList_return expressionList10 = null;


        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:152:5: ( ID '(' expressionList ')' NEWLINE -> functionCall(name= $ID.text args= $expressionList.st ))
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:152:10: ID '(' expressionList ')' NEWLINE
            {
            ID9=(Token)match(input,ID,FOLLOW_ID_in_functionCall1635); if (state.failed) return retval;
            match(input,36,FOLLOW_36_in_functionCall1637); if (state.failed) return retval;
            pushFollow(FOLLOW_expressionList_in_functionCall1639);
            expressionList10=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            match(input,37,FOLLOW_37_in_functionCall1641); if (state.failed) return retval;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_functionCall1643); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 153:10: -> functionCall(name= $ID.text args= $expressionList.st )
              {
                  retval.st = templateLib.getInstanceOf("functionCall",
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
        return retval;
    }
    // $ANTLR end "functionCall"

    public static class predicateHeader_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "predicateHeader"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:158:1: predicateHeader : 'predicate' ID '(' args= variableList ')' -> predicateHeader(name= $ID.text args= $variableList.st );
    public final celluloidParser.predicateHeader_return predicateHeader() throws RecognitionException {
        celluloidParser.predicateHeader_return retval = new celluloidParser.predicateHeader_return();
        retval.start = input.LT(1);

        Token ID11=null;
        celluloidParser.variableList_return args = null;


        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:159:5: ( 'predicate' ID '(' args= variableList ')' -> predicateHeader(name= $ID.text args= $variableList.st ))
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:159:10: 'predicate' ID '(' args= variableList ')'
            {
            match(input,40,FOLLOW_40_in_predicateHeader1698); if (state.failed) return retval;
            ID11=(Token)match(input,ID,FOLLOW_ID_in_predicateHeader1700); if (state.failed) return retval;
            match(input,36,FOLLOW_36_in_predicateHeader1702); if (state.failed) return retval;
            pushFollow(FOLLOW_variableList_in_predicateHeader1708);
            args=variableList();

            state._fsp--;
            if (state.failed) return retval;
            match(input,37,FOLLOW_37_in_predicateHeader1710); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 160:10: -> predicateHeader(name= $ID.text args= $variableList.st )
              {
                  retval.st = templateLib.getInstanceOf("predicateHeader",
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

        celluloidParser.predicateHeader_return predicateHeader12 = null;

        celluloidParser.predicateBlock_return predicateBlock13 = null;


        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:163:5: ( predicateHeader START predicateBlock END -> predicateDefinition(header= $predicateHeader.stblock= $predicateBlock.st))
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:163:10: predicateHeader START predicateBlock END
            {
            pushFollow(FOLLOW_predicateHeader_in_predicateDefinition1759);
            predicateHeader12=predicateHeader();

            state._fsp--;
            if (state.failed) return retval;
            match(input,START,FOLLOW_START_in_predicateDefinition1761); if (state.failed) return retval;
            pushFollow(FOLLOW_predicateBlock_in_predicateDefinition1763);
            predicateBlock13=predicateBlock();

            state._fsp--;
            if (state.failed) return retval;
            match(input,END,FOLLOW_END_in_predicateDefinition1765); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 164:10: -> predicateDefinition(header= $predicateHeader.stblock= $predicateBlock.st)
              {
                  retval.st = templateLib.getInstanceOf("predicateDefinition",
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:168:10: functionBlock 'returns' assignmentExpression
            {
            pushFollow(FOLLOW_functionBlock_in_predicateBlock1827);
            functionBlock();

            state._fsp--;
            if (state.failed) return retval;
            match(input,41,FOLLOW_41_in_predicateBlock1829); if (state.failed) return retval;
            pushFollow(FOLLOW_assignmentExpression_in_predicateBlock1831);
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

        Token ID14=null;
        celluloidParser.expressionList_return expressionList15 = null;


        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:172:5: ( ID '(' expressionList ')' NEWLINE -> predicateCall(name= $ID.text args= $expressionList.st ))
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:172:10: ID '(' expressionList ')' NEWLINE
            {
            ID14=(Token)match(input,ID,FOLLOW_ID_in_predicateCall1874); if (state.failed) return retval;
            match(input,36,FOLLOW_36_in_predicateCall1876); if (state.failed) return retval;
            pushFollow(FOLLOW_expressionList_in_predicateCall1878);
            expressionList15=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            match(input,37,FOLLOW_37_in_predicateCall1880); if (state.failed) return retval;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_predicateCall1882); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 173:10: -> predicateCall(name= $ID.text args= $expressionList.st )
              {
                  retval.st = templateLib.getInstanceOf("predicateCall",
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

        Token ID16=null;

        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:179:5: ( 'event' ID NEWLINE -> eventDefinition(name= $ID.text ))
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:179:10: 'event' ID NEWLINE
            {
            match(input,42,FOLLOW_42_in_eventDefinition1933); if (state.failed) return retval;
            ID16=(Token)match(input,ID,FOLLOW_ID_in_eventDefinition1935); if (state.failed) return retval;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_eventDefinition1937); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 180:10: -> eventDefinition(name= $ID.text )
              {
                  retval.st = templateLib.getInstanceOf("eventDefinition",
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:188:10: 'announce' ID 'when' ID assignmentExpression
            {
            match(input,43,FOLLOW_43_in_announcement1990); if (state.failed) return retval;
            match(input,ID,FOLLOW_ID_in_announcement1992); if (state.failed) return retval;
            match(input,44,FOLLOW_44_in_announcement1994); if (state.failed) return retval;
            match(input,ID,FOLLOW_ID_in_announcement1996); if (state.failed) return retval;
            pushFollow(FOLLOW_assignmentExpression_in_announcement1998);
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:193:1: constraintDefinition : 'constraint' ID ( constraintList )? ( 'announces' announces= idList )? START (members= ( variableDeclaration | functionHeader | predicateHeader | announcement ) )* END -> constraintDefinition(name= $ID.text requires= $constraintList.st );
    public final celluloidParser.constraintDefinition_return constraintDefinition() throws RecognitionException {
        celluloidParser.constraintDefinition_return retval = new celluloidParser.constraintDefinition_return();
        retval.start = input.LT(1);

        Token members=null;
        Token ID17=null;
        celluloidParser.idList_return announces = null;

        celluloidParser.constraintList_return constraintList18 = null;


        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:194:5: ( 'constraint' ID ( constraintList )? ( 'announces' announces= idList )? START (members= ( variableDeclaration | functionHeader | predicateHeader | announcement ) )* END -> constraintDefinition(name= $ID.text requires= $constraintList.st ))
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:194:10: 'constraint' ID ( constraintList )? ( 'announces' announces= idList )? START (members= ( variableDeclaration | functionHeader | predicateHeader | announcement ) )* END
            {
            match(input,45,FOLLOW_45_in_constraintDefinition2022); if (state.failed) return retval;
            ID17=(Token)match(input,ID,FOLLOW_ID_in_constraintDefinition2024); if (state.failed) return retval;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:194:26: ( constraintList )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=47 && LA22_0<=48)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:194:27: constraintList
                    {
                    pushFollow(FOLLOW_constraintList_in_constraintDefinition2027);
                    constraintList18=constraintList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:195:10: ( 'announces' announces= idList )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==46) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:195:11: 'announces' announces= idList
                    {
                    match(input,46,FOLLOW_46_in_constraintDefinition2041); if (state.failed) return retval;
                    pushFollow(FOLLOW_idList_in_constraintDefinition2047);
                    announces=idList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            match(input,START,FOLLOW_START_in_constraintDefinition2061); if (state.failed) return retval;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:197:22: (members= ( variableDeclaration | functionHeader | predicateHeader | announcement ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==TYPE||LA25_0==31||(LA25_0>=39 && LA25_0<=40)||LA25_0==43) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: members= ( variableDeclaration | functionHeader | predicateHeader | announcement )
            	    {
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:197:24: ( variableDeclaration | functionHeader | predicateHeader | announcement )
            	    int alt24=4;
            	    switch ( input.LA(1) ) {
            	    case TYPE:
            	    case 31:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt24=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:197:25: variableDeclaration
            	            {
            	            pushFollow(FOLLOW_variableDeclaration_in_constraintDefinition2082);
            	            variableDeclaration();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:197:47: functionHeader
            	            {
            	            pushFollow(FOLLOW_functionHeader_in_constraintDefinition2086);
            	            functionHeader();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:197:64: predicateHeader
            	            {
            	            pushFollow(FOLLOW_predicateHeader_in_constraintDefinition2090);
            	            predicateHeader();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:197:82: announcement
            	            {
            	            pushFollow(FOLLOW_announcement_in_constraintDefinition2094);
            	            announcement();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            match(input,END,FOLLOW_END_in_constraintDefinition2107); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 200:10: -> constraintDefinition(name= $ID.text requires= $constraintList.st )
              {
                  retval.st = templateLib.getInstanceOf("constraintDefinition",
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

        celluloidParser.idList_return idList19 = null;

        celluloidParser.idList_return idList20 = null;


        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:204:2: ( 'requires' idList -> constraintList(ids= $idList.st ) | 'accepts' idList -> constraintList(ids= $idList.st ))
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==47) ) {
                alt26=1;
            }
            else if ( (LA26_0==48) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:204:7: 'requires' idList
                    {
                    match(input,47,FOLLOW_47_in_constraintList2176); if (state.failed) return retval;
                    pushFollow(FOLLOW_idList_in_constraintList2178);
                    idList19=idList();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 205:7: -> constraintList(ids= $idList.st )
                      {
                          retval.st = templateLib.getInstanceOf("constraintList",
                        new STAttrMap().put("ids",  (idList19!=null?idList19.st:null) ));
                      }

                    }
                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:206:7: 'accepts' idList
                    {
                    match(input,48,FOLLOW_48_in_constraintList2203); if (state.failed) return retval;
                    pushFollow(FOLLOW_idList_in_constraintList2205);
                    idList20=idList();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 207:7: -> constraintList(ids= $idList.st )
                      {
                          retval.st = templateLib.getInstanceOf("constraintList",
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
        Token ID21=null;
        celluloidParser.constraintList_return constraintList22 = null;


        try {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:211:5: ( 'device' ID ( constraintList )? START (members= ( variableDeclaration | functionDefinition | predicateDefinition | COMMENT ) )* END -> deviceDefinition(name= $ID.text accepts= $constraintList.st ))
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:211:10: 'device' ID ( constraintList )? START (members= ( variableDeclaration | functionDefinition | predicateDefinition | COMMENT ) )* END
            {
            match(input,49,FOLLOW_49_in_deviceDefinition2244); if (state.failed) return retval;
            ID21=(Token)match(input,ID,FOLLOW_ID_in_deviceDefinition2246); if (state.failed) return retval;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:211:22: ( constraintList )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=47 && LA27_0<=48)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:211:23: constraintList
                    {
                    pushFollow(FOLLOW_constraintList_in_deviceDefinition2249);
                    constraintList22=constraintList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            match(input,START,FOLLOW_START_in_deviceDefinition2263); if (state.failed) return retval;
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:213:22: (members= ( variableDeclaration | functionDefinition | predicateDefinition | COMMENT ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==TYPE||LA29_0==COMMENT||LA29_0==31||(LA29_0>=39 && LA29_0<=40)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: members= ( variableDeclaration | functionDefinition | predicateDefinition | COMMENT )
            	    {
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:213:24: ( variableDeclaration | functionDefinition | predicateDefinition | COMMENT )
            	    int alt28=4;
            	    switch ( input.LA(1) ) {
            	    case TYPE:
            	    case 31:
            	        {
            	        alt28=1;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt28=2;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt28=3;
            	        }
            	        break;
            	    case COMMENT:
            	        {
            	        alt28=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt28) {
            	        case 1 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:213:25: variableDeclaration
            	            {
            	            pushFollow(FOLLOW_variableDeclaration_in_deviceDefinition2284);
            	            variableDeclaration();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:213:47: functionDefinition
            	            {
            	            pushFollow(FOLLOW_functionDefinition_in_deviceDefinition2288);
            	            functionDefinition();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:213:68: predicateDefinition
            	            {
            	            pushFollow(FOLLOW_predicateDefinition_in_deviceDefinition2292);
            	            predicateDefinition();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:213:90: COMMENT
            	            {
            	            match(input,COMMENT,FOLLOW_COMMENT_in_deviceDefinition2296); if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            match(input,END,FOLLOW_END_in_deviceDefinition2310); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 215:10: -> deviceDefinition(name= $ID.text accepts= $constraintList.st )
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
        return retval;
    }
    // $ANTLR end "deviceDefinition"

    // $ANTLR start synpred4_celluloid
    public final void synpred4_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:79:11: ( logicalORExpression )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:79:11: logicalORExpression
        {
        pushFollow(FOLLOW_logicalORExpression_in_synpred4_celluloid858);
        logicalORExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_celluloid

    // $ANTLR start synpred11_celluloid
    public final void synpred11_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:101:4: ( ID )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:101:4: ID
        {
        match(input,ID,FOLLOW_ID_in_synpred11_celluloid1069); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_celluloid

    // $ANTLR start synpred14_celluloid
    public final void synpred14_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:104:4: ( functionCall )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:104:4: functionCall
        {
        pushFollow(FOLLOW_functionCall_in_synpred14_celluloid1092);
        functionCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_celluloid

    // $ANTLR start synpred25_celluloid
    public final void synpred25_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:146:28: ( functionCall )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:146:28: functionCall
        {
        pushFollow(FOLLOW_functionCall_in_synpred25_celluloid1565);
        functionCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_celluloid

    // $ANTLR start synpred26_celluloid
    public final void synpred26_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:146:43: ( predicateCall )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:146:43: predicateCall
        {
        pushFollow(FOLLOW_predicateCall_in_synpred26_celluloid1569);
        predicateCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_celluloid

    // Delegated rules

    public final boolean synpred26_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_celluloid_fragment(); // can never throw exception
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
    public final boolean synpred11_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_29_in_language_block_decl85 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LANGUAGE_in_language_block_decl87 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_START_in_language_block_decl89 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_language_block_in_language_block_decl91 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_END_in_language_block_decl93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_language_block123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_variableDeclaration682 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_variableDeclaration684 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_variableDeclaration686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_variableDeclaration727 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_variableDeclaration729 = new BitSet(new long[]{0x0000000100000402L});
    public static final BitSet FOLLOW_initializer_in_variableDeclaration731 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_NEWLINE_in_variableDeclaration734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_initializer815 = new BitSet(new long[]{0x0000000810000200L});
    public static final BitSet FOLLOW_assignmentExpression_in_initializer817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_assignmentExpression858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_assignmentExpression870 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ASSIGNMENT_OPERATOR_in_assignmentExpression872 = new BitSet(new long[]{0x0000000810000200L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression914 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_logicalORExpression917 = new BitSet(new long[]{0x0000000810000200L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression919 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalANDExpression943 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_logicalANDExpression946 = new BitSet(new long[]{0x0000000810000200L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalANDExpression948 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression974 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_EQUALITY_OPERATOR_in_equalityExpression977 = new BitSet(new long[]{0x0000000810000200L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression980 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1003 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RELATIONAL_OPERATOR_in_relationalExpression1006 = new BitSet(new long[]{0x0000000810000200L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1009 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1033 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ADDITIVE_OPERATOR_in_additiveExpression1036 = new BitSet(new long[]{0x0000000810000200L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1039 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_primaryExpression_in_multiplicativeExpression1051 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_MULTIPLICATIVE_OPERATOR_in_multiplicativeExpression1054 = new BitSet(new long[]{0x0000000810000200L});
    public static final BitSet FOLLOW_primaryExpression_in_multiplicativeExpression1057 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ID_in_primaryExpression1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_primaryExpression1074 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_primaryExpression1076 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_primaryExpression1078 = new BitSet(new long[]{0x0000001810000200L});
    public static final BitSet FOLLOW_expressionList_in_primaryExpression1080 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_primaryExpression1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_in_primaryExpression1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primaryExpression1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicateCall_in_primaryExpression1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idList1125 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_idList1128 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_idList1134 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_36_in_idList1168 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_idList1174 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_38_in_idList1177 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_idList1183 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_37_in_idList1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1233 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_variableList1236 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1242 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_36_in_variableList1276 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1282 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_38_in_variableList1285 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1291 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_37_in_variableList1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1340 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_expressionList1343 = new BitSet(new long[]{0x0000000810000200L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1349 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_36_in_expressionList1382 = new BitSet(new long[]{0x0000000810000200L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1388 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_38_in_expressionList1391 = new BitSet(new long[]{0x0000000810000200L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1397 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_37_in_expressionList1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_functionHeader1449 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_functionHeader1451 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_functionHeader1453 = new BitSet(new long[]{0x0000001080000020L});
    public static final BitSet FOLLOW_variableList_in_functionHeader1455 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_functionHeader1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionHeader_in_functionDefinition1498 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_START_in_functionDefinition1500 = new BitSet(new long[]{0x00000008D0000320L});
    public static final BitSet FOLLOW_functionBlock_in_functionDefinition1502 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_END_in_functionDefinition1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_language_block_in_functionBlock1561 = new BitSet(new long[]{0x00000008D0000222L});
    public static final BitSet FOLLOW_functionCall_in_functionBlock1565 = new BitSet(new long[]{0x00000008D0000222L});
    public static final BitSet FOLLOW_predicateCall_in_functionBlock1569 = new BitSet(new long[]{0x00000008D0000222L});
    public static final BitSet FOLLOW_variableDeclaration_in_functionBlock1573 = new BitSet(new long[]{0x00000008D0000222L});
    public static final BitSet FOLLOW_ID_in_functionCall1635 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_functionCall1637 = new BitSet(new long[]{0x0000001810000200L});
    public static final BitSet FOLLOW_expressionList_in_functionCall1639 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_functionCall1641 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_functionCall1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_predicateHeader1698 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_predicateHeader1700 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_predicateHeader1702 = new BitSet(new long[]{0x0000001080000020L});
    public static final BitSet FOLLOW_variableList_in_predicateHeader1708 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_predicateHeader1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicateHeader_in_predicateDefinition1759 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_START_in_predicateDefinition1761 = new BitSet(new long[]{0x00000208D0000220L});
    public static final BitSet FOLLOW_predicateBlock_in_predicateDefinition1763 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_END_in_predicateDefinition1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionBlock_in_predicateBlock1827 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_predicateBlock1829 = new BitSet(new long[]{0x0000000810000200L});
    public static final BitSet FOLLOW_assignmentExpression_in_predicateBlock1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_predicateCall1874 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_predicateCall1876 = new BitSet(new long[]{0x0000001810000200L});
    public static final BitSet FOLLOW_expressionList_in_predicateCall1878 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_predicateCall1880 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_predicateCall1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_eventDefinition1933 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_eventDefinition1935 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_eventDefinition1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_announcement1990 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_announcement1992 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_announcement1994 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_announcement1996 = new BitSet(new long[]{0x0000000810000200L});
    public static final BitSet FOLLOW_assignmentExpression_in_announcement1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_constraintDefinition2022 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_constraintDefinition2024 = new BitSet(new long[]{0x0001C00000000080L});
    public static final BitSet FOLLOW_constraintList_in_constraintDefinition2027 = new BitSet(new long[]{0x0000400000000080L});
    public static final BitSet FOLLOW_46_in_constraintDefinition2041 = new BitSet(new long[]{0x0000001000000200L});
    public static final BitSet FOLLOW_idList_in_constraintDefinition2047 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_START_in_constraintDefinition2061 = new BitSet(new long[]{0x0000098080000120L});
    public static final BitSet FOLLOW_variableDeclaration_in_constraintDefinition2082 = new BitSet(new long[]{0x0000098080000120L});
    public static final BitSet FOLLOW_functionHeader_in_constraintDefinition2086 = new BitSet(new long[]{0x0000098080000120L});
    public static final BitSet FOLLOW_predicateHeader_in_constraintDefinition2090 = new BitSet(new long[]{0x0000098080000120L});
    public static final BitSet FOLLOW_announcement_in_constraintDefinition2094 = new BitSet(new long[]{0x0000098080000120L});
    public static final BitSet FOLLOW_END_in_constraintDefinition2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_constraintList2176 = new BitSet(new long[]{0x0000001000000200L});
    public static final BitSet FOLLOW_idList_in_constraintList2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_constraintList2203 = new BitSet(new long[]{0x0000001000000200L});
    public static final BitSet FOLLOW_idList_in_constraintList2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_deviceDefinition2244 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_deviceDefinition2246 = new BitSet(new long[]{0x0001800000000080L});
    public static final BitSet FOLLOW_constraintList_in_deviceDefinition2249 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_START_in_deviceDefinition2263 = new BitSet(new long[]{0x0000018080001120L});
    public static final BitSet FOLLOW_variableDeclaration_in_deviceDefinition2284 = new BitSet(new long[]{0x0000018080001120L});
    public static final BitSet FOLLOW_functionDefinition_in_deviceDefinition2288 = new BitSet(new long[]{0x0000018080001120L});
    public static final BitSet FOLLOW_predicateDefinition_in_deviceDefinition2292 = new BitSet(new long[]{0x0000018080001120L});
    public static final BitSet FOLLOW_COMMENT_in_deviceDefinition2296 = new BitSet(new long[]{0x0000018080001120L});
    public static final BitSet FOLLOW_END_in_deviceDefinition2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_synpred4_celluloid858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred11_celluloid1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_synpred14_celluloid1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_synpred25_celluloid1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicateCall_in_synpred26_celluloid1569 = new BitSet(new long[]{0x0000000000000002L});

}