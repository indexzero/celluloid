// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g 2009-12-11 14:29:00

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class celluloidParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VARDEF", "ARG", "ARGS", "FUNC", "PRED", "CALL", "IF", "ELSEIF", "ELSE", "LISTENER", "EVERY", "COND", "RETURN", "INBLOCK", "LISTENBLOCK", "IFBLOCK", "FUNBLOCK", "CONBLOCK", "DEVBLOCK", "FUNHEAD", "PREDHEAD", "EVENT", "CONSTRAINT", "REQUIRES", "ANNOUNCES", "ANNOUNCEMENT", "ANNOUNCEMENTS", "DEVICE", "ACCEPTS", "BOOL", "TYPE", "LANGUAGE", "START", "END", "ID", "NEWLINE", "WS", "COMMENT", "EXPONENT", "NUMBER", "SECOND", "MINUTE", "HOUR", "DAY", "TIME", "ESC_SEQ", "CHAR", "STRING", "ASSIGNMENT_OPERATOR", "EQUALITY_OPERATOR", "RELATIONAL_OPERATOR", "ADDITIVE_OPERATOR", "MULTIPLICATIVE_OPERATOR", "LITERAL", "'in'", "'*'", "'timeline'", "'='", "'not'", "'or'", "'and'", "'new'", "'('", "')'", "','", "'if'", "'else if'", "'else'", "'when'", "'unless'", "'every'", "'function'", "'predicate'", "'return'", "'event'", "'announce'", "'constraint'", "'requires'", "'announces'", "'device'", "'accepts'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int EXPONENT=42;
    public static final int LISTENBLOCK=18;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int CHAR=50;
    public static final int DAY=47;
    public static final int ID=38;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int EQUALITY_OPERATOR=53;
    public static final int CONBLOCK=21;
    public static final int LISTENER=13;
    public static final int TYPE=34;
    public static final int IF=10;
    public static final int ACCEPTS=32;
    public static final int FUNHEAD=23;
    public static final int TIME=48;
    public static final int T__58=58;
    public static final int ESC_SEQ=49;
    public static final int ANNOUNCEMENT=29;
    public static final int ARG=5;
    public static final int T__59=59;
    public static final int FUNBLOCK=20;
    public static final int RETURN=16;
    public static final int DEVICE=31;
    public static final int ARGS=6;
    public static final int ANNOUNCEMENTS=30;
    public static final int MULTIPLICATIVE_OPERATOR=56;
    public static final int COMMENT=41;
    public static final int VARDEF=4;
    public static final int SECOND=44;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int IFBLOCK=19;
    public static final int PRED=8;
    public static final int ELSE=12;
    public static final int NUMBER=43;
    public static final int BOOL=33;
    public static final int EVERY=14;
    public static final int LITERAL=57;
    public static final int ADDITIVE_OPERATOR=55;
    public static final int HOUR=46;
    public static final int EVENT=25;
    public static final int T__84=84;
    public static final int RELATIONAL_OPERATOR=54;
    public static final int ELSEIF=11;
    public static final int WS=40;
    public static final int LANGUAGE=35;
    public static final int T__71=71;
    public static final int REQUIRES=27;
    public static final int T__72=72;
    public static final int NEWLINE=39;
    public static final int T__70=70;
    public static final int PREDHEAD=24;
    public static final int FUNC=7;
    public static final int ASSIGNMENT_OPERATOR=52;
    public static final int START=36;
    public static final int INBLOCK=17;
    public static final int ANNOUNCES=28;
    public static final int CALL=9;
    public static final int MINUTE=45;
    public static final int END=37;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int COND=15;
    public static final int CONSTRAINT=26;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int DEVBLOCK=22;
    public static final int T__79=79;
    public static final int STRING=51;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public celluloidParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public celluloidParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[105+1];
             
             
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


    public static class language_block_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "language_block_decl"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:51:1: language_block_decl : 'in' LANGUAGE START language_block END ;
    public final celluloidParser.language_block_decl_return language_block_decl() throws RecognitionException {
        celluloidParser.language_block_decl_return retval = new celluloidParser.language_block_decl_return();
        retval.start = input.LT(1);
        int language_block_decl_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal1=null;
        Token LANGUAGE2=null;
        Token START3=null;
        Token END5=null;
        celluloidParser.language_block_return language_block4 = null;


        Object string_literal1_tree=null;
        Object LANGUAGE2_tree=null;
        Object START3_tree=null;
        Object END5_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:51:21: ( 'in' LANGUAGE START language_block END )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:51:23: 'in' LANGUAGE START language_block END
            {
            root_0 = (Object)adaptor.nil();

            string_literal1=(Token)match(input,58,FOLLOW_58_in_language_block_decl259); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal1_tree = (Object)adaptor.create(string_literal1);
            adaptor.addChild(root_0, string_literal1_tree);
            }
            LANGUAGE2=(Token)match(input,LANGUAGE,FOLLOW_LANGUAGE_in_language_block_decl261); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LANGUAGE2_tree = (Object)adaptor.create(LANGUAGE2);
            adaptor.addChild(root_0, LANGUAGE2_tree);
            }
            START3=(Token)match(input,START,FOLLOW_START_in_language_block_decl263); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            START3_tree = (Object)adaptor.create(START3);
            adaptor.addChild(root_0, START3_tree);
            }
            pushFollow(FOLLOW_language_block_in_language_block_decl265);
            language_block4=language_block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, language_block4.getTree());
            END5=(Token)match(input,END,FOLLOW_END_in_language_block_decl267); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END5_tree = (Object)adaptor.create(END5);
            adaptor.addChild(root_0, END5_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 1, language_block_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "language_block_decl"

    public static class language_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "language_block"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:53:1: language_block : '*' ;
    public final celluloidParser.language_block_return language_block() throws RecognitionException {
        celluloidParser.language_block_return retval = new celluloidParser.language_block_return();
        retval.start = input.LT(1);
        int language_block_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal6=null;

        Object char_literal6_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:53:21: ( '*' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:53:23: '*'
            {
            root_0 = (Object)adaptor.nil();

            char_literal6=(Token)match(input,59,FOLLOW_59_in_language_block297); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal6_tree = (Object)adaptor.create(char_literal6);
            adaptor.addChild(root_0, char_literal6_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 2, language_block_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "language_block"

    public static class variableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:105:1: variableDeclaration : ( 'timeline' ID ( NEWLINE -> ^( VARDEF 'timeline' ID ) | -> ^( ARG 'timeline' ID ) ) | TYPE ID ( initializer )? ( NEWLINE -> ^( VARDEF TYPE ID ( initializer )? ) | -> ^( ARG TYPE ID ) ) );
    public final celluloidParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        celluloidParser.variableDeclaration_return retval = new celluloidParser.variableDeclaration_return();
        retval.start = input.LT(1);
        int variableDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal7=null;
        Token ID8=null;
        Token NEWLINE9=null;
        Token TYPE10=null;
        Token ID11=null;
        Token NEWLINE13=null;
        celluloidParser.initializer_return initializer12 = null;


        Object string_literal7_tree=null;
        Object ID8_tree=null;
        Object NEWLINE9_tree=null;
        Object TYPE10_tree=null;
        Object ID11_tree=null;
        Object NEWLINE13_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:106:5: ( 'timeline' ID ( NEWLINE -> ^( VARDEF 'timeline' ID ) | -> ^( ARG 'timeline' ID ) ) | TYPE ID ( initializer )? ( NEWLINE -> ^( VARDEF TYPE ID ( initializer )? ) | -> ^( ARG TYPE ID ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==60) ) {
                alt4=1;
            }
            else if ( (LA4_0==TYPE) ) {
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:106:10: 'timeline' ID ( NEWLINE -> ^( VARDEF 'timeline' ID ) | -> ^( ARG 'timeline' ID ) )
                    {
                    string_literal7=(Token)match(input,60,FOLLOW_60_in_variableDeclaration866); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_60.add(string_literal7);

                    ID8=(Token)match(input,ID,FOLLOW_ID_in_variableDeclaration868); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID8);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:107:10: ( NEWLINE -> ^( VARDEF 'timeline' ID ) | -> ^( ARG 'timeline' ID ) )
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==NEWLINE) ) {
                        int LA1_1 = input.LA(2);

                        if ( (synpred1_celluloid()) ) {
                            alt1=1;
                        }
                        else if ( (true) ) {
                            alt1=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_0==EOF||LA1_0==TYPE||(LA1_0>=END && LA1_0<=ID)||LA1_0==LITERAL||LA1_0==60||LA1_0==62||LA1_0==65||(LA1_0>=67 && LA1_0<=68)||(LA1_0>=75 && LA1_0<=77)||LA1_0==79) ) {
                        alt1=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }
                    switch (alt1) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:107:11: NEWLINE
                            {
                            NEWLINE9=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_variableDeclaration881); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE9);



                            // AST REWRITE
                            // elements: 60, ID
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 107:19: -> ^( VARDEF 'timeline' ID )
                            {
                                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:107:22: ^( VARDEF 'timeline' ID )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDEF, "VARDEF"), root_1);

                                adaptor.addChild(root_1, stream_60.nextNode());
                                adaptor.addChild(root_1, stream_ID.nextNode());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:108:19: 
                            {

                            // AST REWRITE
                            // elements: 60, ID
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 108:19: -> ^( ARG 'timeline' ID )
                            {
                                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:108:22: ^( ARG 'timeline' ID )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARG, "ARG"), root_1);

                                adaptor.addChild(root_1, stream_60.nextNode());
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:111:10: TYPE ID ( initializer )? ( NEWLINE -> ^( VARDEF TYPE ID ( initializer )? ) | -> ^( ARG TYPE ID ) )
                    {
                    TYPE10=(Token)match(input,TYPE,FOLLOW_TYPE_in_variableDeclaration951); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPE.add(TYPE10);

                    ID11=(Token)match(input,ID,FOLLOW_ID_in_variableDeclaration953); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID11);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:111:18: ( initializer )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==61) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: initializer
                            {
                            pushFollow(FOLLOW_initializer_in_variableDeclaration955);
                            initializer12=initializer();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_initializer.add(initializer12.getTree());

                            }
                            break;

                    }

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:112:10: ( NEWLINE -> ^( VARDEF TYPE ID ( initializer )? ) | -> ^( ARG TYPE ID ) )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==NEWLINE) ) {
                        int LA3_1 = input.LA(2);

                        if ( (synpred4_celluloid()) ) {
                            alt3=1;
                        }
                        else if ( (true) ) {
                            alt3=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA3_0==EOF||LA3_0==TYPE||(LA3_0>=END && LA3_0<=ID)||LA3_0==LITERAL||LA3_0==60||LA3_0==62||LA3_0==65||(LA3_0>=67 && LA3_0<=68)||(LA3_0>=75 && LA3_0<=77)||LA3_0==79) ) {
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
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:112:11: NEWLINE
                            {
                            NEWLINE13=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_variableDeclaration969); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE13);



                            // AST REWRITE
                            // elements: initializer, ID, TYPE
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 112:19: -> ^( VARDEF TYPE ID ( initializer )? )
                            {
                                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:112:22: ^( VARDEF TYPE ID ( initializer )? )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDEF, "VARDEF"), root_1);

                                adaptor.addChild(root_1, stream_TYPE.nextNode());
                                adaptor.addChild(root_1, stream_ID.nextNode());
                                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:112:39: ( initializer )?
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
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:113:19: 
                            {

                            // AST REWRITE
                            // elements: TYPE, ID
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 113:19: -> ^( ARG TYPE ID )
                            {
                                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:113:22: ^( ARG TYPE ID )
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
            if ( state.backtracking>0 ) { memoize(input, 3, variableDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableDeclaration"

    public static class initializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "initializer"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:117:1: initializer : '=' assignmentExpression ;
    public final celluloidParser.initializer_return initializer() throws RecognitionException {
        celluloidParser.initializer_return retval = new celluloidParser.initializer_return();
        retval.start = input.LT(1);
        int initializer_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal14=null;
        celluloidParser.assignmentExpression_return assignmentExpression15 = null;


        Object char_literal14_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:118:5: ( '=' assignmentExpression )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:118:10: '=' assignmentExpression
            {
            root_0 = (Object)adaptor.nil();

            char_literal14=(Token)match(input,61,FOLLOW_61_in_initializer1051); if (state.failed) return retval;
            pushFollow(FOLLOW_assignmentExpression_in_initializer1054);
            assignmentExpression15=assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression15.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 4, initializer_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "initializer"

    public static class assignmentExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignmentExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:122:1: assignmentExpression : ( logicalORExpression | primaryExpression ASSIGNMENT_OPERATOR assignmentExpression );
    public final celluloidParser.assignmentExpression_return assignmentExpression() throws RecognitionException {
        celluloidParser.assignmentExpression_return retval = new celluloidParser.assignmentExpression_return();
        retval.start = input.LT(1);
        int assignmentExpression_StartIndex = input.index();
        Object root_0 = null;

        Token ASSIGNMENT_OPERATOR18=null;
        celluloidParser.logicalORExpression_return logicalORExpression16 = null;

        celluloidParser.primaryExpression_return primaryExpression17 = null;

        celluloidParser.assignmentExpression_return assignmentExpression19 = null;


        Object ASSIGNMENT_OPERATOR18_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:123:9: ( logicalORExpression | primaryExpression ASSIGNMENT_OPERATOR assignmentExpression )
            int alt5=2;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt5=1;
                }
                break;
            case ID:
                {
                int LA5_2 = input.LA(2);

                if ( (synpred5_celluloid()) ) {
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
            case 65:
                {
                int LA5_3 = input.LA(2);

                if ( (synpred5_celluloid()) ) {
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
            case LITERAL:
                {
                int LA5_4 = input.LA(2);

                if ( (synpred5_celluloid()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:123:11: logicalORExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_logicalORExpression_in_assignmentExpression1110);
                    logicalORExpression16=logicalORExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalORExpression16.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:124:11: primaryExpression ASSIGNMENT_OPERATOR assignmentExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_assignmentExpression1122);
                    primaryExpression17=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpression17.getTree());
                    ASSIGNMENT_OPERATOR18=(Token)match(input,ASSIGNMENT_OPERATOR,FOLLOW_ASSIGNMENT_OPERATOR_in_assignmentExpression1124); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGNMENT_OPERATOR18_tree = (Object)adaptor.create(ASSIGNMENT_OPERATOR18);
                    adaptor.addChild(root_0, ASSIGNMENT_OPERATOR18_tree);
                    }
                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression1126);
                    assignmentExpression19=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression19.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 5, assignmentExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignmentExpression"

    public static class logicalORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalORExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:126:1: logicalORExpression : ( 'not' )? logicalANDExpression ( 'or' logicalORExpression )? ;
    public final celluloidParser.logicalORExpression_return logicalORExpression() throws RecognitionException {
        celluloidParser.logicalORExpression_return retval = new celluloidParser.logicalORExpression_return();
        retval.start = input.LT(1);
        int logicalORExpression_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal20=null;
        Token string_literal22=null;
        celluloidParser.logicalANDExpression_return logicalANDExpression21 = null;

        celluloidParser.logicalORExpression_return logicalORExpression23 = null;


        Object string_literal20_tree=null;
        Object string_literal22_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:127:9: ( ( 'not' )? logicalANDExpression ( 'or' logicalORExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:127:11: ( 'not' )? logicalANDExpression ( 'or' logicalORExpression )?
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:127:11: ( 'not' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==62) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: 'not'
                    {
                    string_literal20=(Token)match(input,62,FOLLOW_62_in_logicalORExpression1177); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal20_tree = (Object)adaptor.create(string_literal20);
                    adaptor.addChild(root_0, string_literal20_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression1180);
            logicalANDExpression21=logicalANDExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalANDExpression21.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:127:39: ( 'or' logicalORExpression )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==63) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:127:40: 'or' logicalORExpression
                    {
                    string_literal22=(Token)match(input,63,FOLLOW_63_in_logicalORExpression1183); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal22_tree = (Object)adaptor.create(string_literal22);
                    root_0 = (Object)adaptor.becomeRoot(string_literal22_tree, root_0);
                    }
                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1186);
                    logicalORExpression23=logicalORExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalORExpression23.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 6, logicalORExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicalORExpression"

    public static class logicalANDExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalANDExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:129:1: logicalANDExpression : equalityExpression ( 'and' logicalANDExpression )? ;
    public final celluloidParser.logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        celluloidParser.logicalANDExpression_return retval = new celluloidParser.logicalANDExpression_return();
        retval.start = input.LT(1);
        int logicalANDExpression_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal25=null;
        celluloidParser.equalityExpression_return equalityExpression24 = null;

        celluloidParser.logicalANDExpression_return logicalANDExpression26 = null;


        Object string_literal25_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:130:9: ( equalityExpression ( 'and' logicalANDExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:130:11: equalityExpression ( 'and' logicalANDExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_logicalANDExpression1207);
            equalityExpression24=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression24.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:130:30: ( 'and' logicalANDExpression )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==64) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:130:31: 'and' logicalANDExpression
                    {
                    string_literal25=(Token)match(input,64,FOLLOW_64_in_logicalANDExpression1210); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal25_tree = (Object)adaptor.create(string_literal25);
                    root_0 = (Object)adaptor.becomeRoot(string_literal25_tree, root_0);
                    }
                    pushFollow(FOLLOW_logicalANDExpression_in_logicalANDExpression1213);
                    logicalANDExpression26=logicalANDExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalANDExpression26.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 7, logicalANDExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicalANDExpression"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:132:1: equalityExpression : relationalExpression ( EQUALITY_OPERATOR equalityExpression )? ;
    public final celluloidParser.equalityExpression_return equalityExpression() throws RecognitionException {
        celluloidParser.equalityExpression_return retval = new celluloidParser.equalityExpression_return();
        retval.start = input.LT(1);
        int equalityExpression_StartIndex = input.index();
        Object root_0 = null;

        Token EQUALITY_OPERATOR28=null;
        celluloidParser.relationalExpression_return relationalExpression27 = null;

        celluloidParser.equalityExpression_return equalityExpression29 = null;


        Object EQUALITY_OPERATOR28_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:133:9: ( relationalExpression ( EQUALITY_OPERATOR equalityExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:133:12: relationalExpression ( EQUALITY_OPERATOR equalityExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1239);
            relationalExpression27=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression27.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:133:33: ( EQUALITY_OPERATOR equalityExpression )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==EQUALITY_OPERATOR) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:133:34: EQUALITY_OPERATOR equalityExpression
                    {
                    EQUALITY_OPERATOR28=(Token)match(input,EQUALITY_OPERATOR,FOLLOW_EQUALITY_OPERATOR_in_equalityExpression1242); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUALITY_OPERATOR28_tree = (Object)adaptor.create(EQUALITY_OPERATOR28);
                    root_0 = (Object)adaptor.becomeRoot(EQUALITY_OPERATOR28_tree, root_0);
                    }
                    pushFollow(FOLLOW_equalityExpression_in_equalityExpression1245);
                    equalityExpression29=equalityExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression29.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 8, equalityExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "equalityExpression"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:135:1: relationalExpression : additiveExpression ( RELATIONAL_OPERATOR relationalExpression )? ;
    public final celluloidParser.relationalExpression_return relationalExpression() throws RecognitionException {
        celluloidParser.relationalExpression_return retval = new celluloidParser.relationalExpression_return();
        retval.start = input.LT(1);
        int relationalExpression_StartIndex = input.index();
        Object root_0 = null;

        Token RELATIONAL_OPERATOR31=null;
        celluloidParser.additiveExpression_return additiveExpression30 = null;

        celluloidParser.relationalExpression_return relationalExpression32 = null;


        Object RELATIONAL_OPERATOR31_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:136:9: ( additiveExpression ( RELATIONAL_OPERATOR relationalExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:136:11: additiveExpression ( RELATIONAL_OPERATOR relationalExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1268);
            additiveExpression30=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression30.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:136:30: ( RELATIONAL_OPERATOR relationalExpression )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RELATIONAL_OPERATOR) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:136:31: RELATIONAL_OPERATOR relationalExpression
                    {
                    RELATIONAL_OPERATOR31=(Token)match(input,RELATIONAL_OPERATOR,FOLLOW_RELATIONAL_OPERATOR_in_relationalExpression1271); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RELATIONAL_OPERATOR31_tree = (Object)adaptor.create(RELATIONAL_OPERATOR31);
                    root_0 = (Object)adaptor.becomeRoot(RELATIONAL_OPERATOR31_tree, root_0);
                    }
                    pushFollow(FOLLOW_relationalExpression_in_relationalExpression1274);
                    relationalExpression32=relationalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression32.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 9, relationalExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "relationalExpression"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:138:1: additiveExpression : multiplicativeExpression ( ADDITIVE_OPERATOR additiveExpression )? ;
    public final celluloidParser.additiveExpression_return additiveExpression() throws RecognitionException {
        celluloidParser.additiveExpression_return retval = new celluloidParser.additiveExpression_return();
        retval.start = input.LT(1);
        int additiveExpression_StartIndex = input.index();
        Object root_0 = null;

        Token ADDITIVE_OPERATOR34=null;
        celluloidParser.multiplicativeExpression_return multiplicativeExpression33 = null;

        celluloidParser.additiveExpression_return additiveExpression35 = null;


        Object ADDITIVE_OPERATOR34_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:139:9: ( multiplicativeExpression ( ADDITIVE_OPERATOR additiveExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:139:11: multiplicativeExpression ( ADDITIVE_OPERATOR additiveExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1298);
            multiplicativeExpression33=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression33.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:139:36: ( ADDITIVE_OPERATOR additiveExpression )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ADDITIVE_OPERATOR) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:139:37: ADDITIVE_OPERATOR additiveExpression
                    {
                    ADDITIVE_OPERATOR34=(Token)match(input,ADDITIVE_OPERATOR,FOLLOW_ADDITIVE_OPERATOR_in_additiveExpression1301); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ADDITIVE_OPERATOR34_tree = (Object)adaptor.create(ADDITIVE_OPERATOR34);
                    root_0 = (Object)adaptor.becomeRoot(ADDITIVE_OPERATOR34_tree, root_0);
                    }
                    pushFollow(FOLLOW_additiveExpression_in_additiveExpression1304);
                    additiveExpression35=additiveExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression35.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 10, additiveExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:141:1: multiplicativeExpression : primaryExpression ( MULTIPLICATIVE_OPERATOR multiplicativeExpression )? ;
    public final celluloidParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        celluloidParser.multiplicativeExpression_return retval = new celluloidParser.multiplicativeExpression_return();
        retval.start = input.LT(1);
        int multiplicativeExpression_StartIndex = input.index();
        Object root_0 = null;

        Token MULTIPLICATIVE_OPERATOR37=null;
        celluloidParser.primaryExpression_return primaryExpression36 = null;

        celluloidParser.multiplicativeExpression_return multiplicativeExpression38 = null;


        Object MULTIPLICATIVE_OPERATOR37_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:142:2: ( primaryExpression ( MULTIPLICATIVE_OPERATOR multiplicativeExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:142:4: primaryExpression ( MULTIPLICATIVE_OPERATOR multiplicativeExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_primaryExpression_in_multiplicativeExpression1316);
            primaryExpression36=primaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpression36.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:142:22: ( MULTIPLICATIVE_OPERATOR multiplicativeExpression )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==MULTIPLICATIVE_OPERATOR) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:142:23: MULTIPLICATIVE_OPERATOR multiplicativeExpression
                    {
                    MULTIPLICATIVE_OPERATOR37=(Token)match(input,MULTIPLICATIVE_OPERATOR,FOLLOW_MULTIPLICATIVE_OPERATOR_in_multiplicativeExpression1319); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MULTIPLICATIVE_OPERATOR37_tree = (Object)adaptor.create(MULTIPLICATIVE_OPERATOR37);
                    root_0 = (Object)adaptor.becomeRoot(MULTIPLICATIVE_OPERATOR37_tree, root_0);
                    }
                    pushFollow(FOLLOW_multiplicativeExpression_in_multiplicativeExpression1322);
                    multiplicativeExpression38=multiplicativeExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression38.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 11, multiplicativeExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class primaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primaryExpression"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:144:1: primaryExpression : ( ID | 'new' ID '(' expressionList ')' | LITERAL | functionPredicateCall );
    public final celluloidParser.primaryExpression_return primaryExpression() throws RecognitionException {
        celluloidParser.primaryExpression_return retval = new celluloidParser.primaryExpression_return();
        retval.start = input.LT(1);
        int primaryExpression_StartIndex = input.index();
        Object root_0 = null;

        Token ID39=null;
        Token string_literal40=null;
        Token ID41=null;
        Token char_literal42=null;
        Token char_literal44=null;
        Token LITERAL45=null;
        celluloidParser.expressionList_return expressionList43 = null;

        celluloidParser.functionPredicateCall_return functionPredicateCall46 = null;


        Object ID39_tree=null;
        Object string_literal40_tree=null;
        Object ID41_tree=null;
        Object char_literal42_tree=null;
        Object char_literal44_tree=null;
        Object LITERAL45_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:145:2: ( ID | 'new' ID '(' expressionList ')' | LITERAL | functionPredicateCall )
            int alt13=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==66) ) {
                    alt13=4;
                }
                else if ( (LA13_1==EOF||LA13_1==TYPE||(LA13_1>=START && LA13_1<=NEWLINE)||(LA13_1>=ASSIGNMENT_OPERATOR && LA13_1<=LITERAL)||LA13_1==60||(LA13_1>=62 && LA13_1<=65)||(LA13_1>=67 && LA13_1<=68)||(LA13_1>=75 && LA13_1<=77)||LA13_1==79) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case 65:
                {
                alt13=2;
                }
                break;
            case LITERAL:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:145:4: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID39=(Token)match(input,ID,FOLLOW_ID_in_primaryExpression1334); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID39_tree = (Object)adaptor.create(ID39);
                    adaptor.addChild(root_0, ID39_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:146:4: 'new' ID '(' expressionList ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal40=(Token)match(input,65,FOLLOW_65_in_primaryExpression1339); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal40_tree = (Object)adaptor.create(string_literal40);
                    adaptor.addChild(root_0, string_literal40_tree);
                    }
                    ID41=(Token)match(input,ID,FOLLOW_ID_in_primaryExpression1341); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID41_tree = (Object)adaptor.create(ID41);
                    adaptor.addChild(root_0, ID41_tree);
                    }
                    char_literal42=(Token)match(input,66,FOLLOW_66_in_primaryExpression1343); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal42_tree = (Object)adaptor.create(char_literal42);
                    adaptor.addChild(root_0, char_literal42_tree);
                    }
                    pushFollow(FOLLOW_expressionList_in_primaryExpression1345);
                    expressionList43=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList43.getTree());
                    char_literal44=(Token)match(input,67,FOLLOW_67_in_primaryExpression1347); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal44_tree = (Object)adaptor.create(char_literal44);
                    adaptor.addChild(root_0, char_literal44_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:147:4: LITERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    LITERAL45=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_primaryExpression1352); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LITERAL45_tree = (Object)adaptor.create(LITERAL45);
                    adaptor.addChild(root_0, LITERAL45_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:148:4: functionPredicateCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionPredicateCall_in_primaryExpression1357);
                    functionPredicateCall46=functionPredicateCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionPredicateCall46.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 12, primaryExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primaryExpression"

    public static class idList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idList"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:157:1: idList : (ids+= ID ( ',' ids+= ID )* -> ( ID )+ | '(' ids+= ID ( ',' ids+= ID )* ')' -> ( ID )+ );
    public final celluloidParser.idList_return idList() throws RecognitionException {
        celluloidParser.idList_return retval = new celluloidParser.idList_return();
        retval.start = input.LT(1);
        int idList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal47=null;
        Token char_literal48=null;
        Token char_literal49=null;
        Token char_literal50=null;
        Token ids=null;
        List list_ids=null;

        Object char_literal47_tree=null;
        Object char_literal48_tree=null;
        Object char_literal49_tree=null;
        Object char_literal50_tree=null;
        Object ids_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:158:5: (ids+= ID ( ',' ids+= ID )* -> ( ID )+ | '(' ids+= ID ( ',' ids+= ID )* ')' -> ( ID )+ )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==66) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:158:10: ids+= ID ( ',' ids+= ID )*
                    {
                    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1385); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ids);

                    if (list_ids==null) list_ids=new ArrayList();
                    list_ids.add(ids);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:158:20: ( ',' ids+= ID )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==68) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:158:21: ',' ids+= ID
                    	    {
                    	    char_literal47=(Token)match(input,68,FOLLOW_68_in_idList1388); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_68.add(char_literal47);

                    	    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1394); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ids);

                    	    if (list_ids==null) list_ids=new ArrayList();
                    	    list_ids.add(ids);


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
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
                    // 158:37: -> ( ID )+
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:160:10: '(' ids+= ID ( ',' ids+= ID )* ')'
                    {
                    char_literal48=(Token)match(input,66,FOLLOW_66_in_idList1422); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_66.add(char_literal48);

                    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1428); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ids);

                    if (list_ids==null) list_ids=new ArrayList();
                    list_ids.add(ids);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:160:24: ( ',' ids+= ID )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==68) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:160:25: ',' ids+= ID
                    	    {
                    	    char_literal49=(Token)match(input,68,FOLLOW_68_in_idList1431); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_68.add(char_literal49);

                    	    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1437); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ids);

                    	    if (list_ids==null) list_ids=new ArrayList();
                    	    list_ids.add(ids);


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    char_literal50=(Token)match(input,67,FOLLOW_67_in_idList1441); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(char_literal50);



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
                    // 160:45: -> ( ID )+
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
            if ( state.backtracking>0 ) { memoize(input, 13, idList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "idList"

    public static class variableList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableList"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:164:1: variableList : (vars+= variableDeclaration ( ',' vars+= variableDeclaration )* -> ( variableDeclaration )+ | '(' vars+= variableDeclaration ( ',' vars+= variableDeclaration )* ')' -> ( variableDeclaration )+ );
    public final celluloidParser.variableList_return variableList() throws RecognitionException {
        celluloidParser.variableList_return retval = new celluloidParser.variableList_return();
        retval.start = input.LT(1);
        int variableList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal51=null;
        Token char_literal52=null;
        Token char_literal53=null;
        Token char_literal54=null;
        List list_vars=null;
        RuleReturnScope vars = null;
        Object char_literal51_tree=null;
        Object char_literal52_tree=null;
        Object char_literal53_tree=null;
        Object char_literal54_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:165:5: (vars+= variableDeclaration ( ',' vars+= variableDeclaration )* -> ( variableDeclaration )+ | '(' vars+= variableDeclaration ( ',' vars+= variableDeclaration )* ')' -> ( variableDeclaration )+ )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==TYPE||LA19_0==60) ) {
                alt19=1;
            }
            else if ( (LA19_0==66) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:165:10: vars+= variableDeclaration ( ',' vars+= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_variableList1482);
                    vars=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(vars.getTree());
                    if (list_vars==null) list_vars=new ArrayList();
                    list_vars.add(vars.getTree());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:165:38: ( ',' vars+= variableDeclaration )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==68) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:165:39: ',' vars+= variableDeclaration
                    	    {
                    	    char_literal51=(Token)match(input,68,FOLLOW_68_in_variableList1485); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_68.add(char_literal51);

                    	    pushFollow(FOLLOW_variableDeclaration_in_variableList1491);
                    	    vars=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_variableDeclaration.add(vars.getTree());
                    	    if (list_vars==null) list_vars=new ArrayList();
                    	    list_vars.add(vars.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
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
                    // 166:10: -> ( variableDeclaration )+
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:168:10: '(' vars+= variableDeclaration ( ',' vars+= variableDeclaration )* ')'
                    {
                    char_literal52=(Token)match(input,66,FOLLOW_66_in_variableList1529); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_66.add(char_literal52);

                    pushFollow(FOLLOW_variableDeclaration_in_variableList1535);
                    vars=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(vars.getTree());
                    if (list_vars==null) list_vars=new ArrayList();
                    list_vars.add(vars.getTree());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:168:42: ( ',' vars+= variableDeclaration )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==68) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:168:43: ',' vars+= variableDeclaration
                    	    {
                    	    char_literal53=(Token)match(input,68,FOLLOW_68_in_variableList1538); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_68.add(char_literal53);

                    	    pushFollow(FOLLOW_variableDeclaration_in_variableList1544);
                    	    vars=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_variableDeclaration.add(vars.getTree());
                    	    if (list_vars==null) list_vars=new ArrayList();
                    	    list_vars.add(vars.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    char_literal54=(Token)match(input,67,FOLLOW_67_in_variableList1548); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(char_literal54);



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
                    // 169:10: -> ( variableDeclaration )+
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
            if ( state.backtracking>0 ) { memoize(input, 14, variableList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableList"

    public static class expressionList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionList"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:173:1: expressionList : (exps+= assignmentExpression ( ',' exps+= assignmentExpression )* | '(' exps+= assignmentExpression ( ',' exps+= assignmentExpression )* ')' );
    public final celluloidParser.expressionList_return expressionList() throws RecognitionException {
        celluloidParser.expressionList_return retval = new celluloidParser.expressionList_return();
        retval.start = input.LT(1);
        int expressionList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal55=null;
        Token char_literal56=null;
        Token char_literal57=null;
        Token char_literal58=null;
        List list_exps=null;
        RuleReturnScope exps = null;
        Object char_literal55_tree=null;
        Object char_literal56_tree=null;
        Object char_literal57_tree=null;
        Object char_literal58_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:174:5: (exps+= assignmentExpression ( ',' exps+= assignmentExpression )* | '(' exps+= assignmentExpression ( ',' exps+= assignmentExpression )* ')' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ID||LA22_0==LITERAL||LA22_0==62||LA22_0==65) ) {
                alt22=1;
            }
            else if ( (LA22_0==66) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:174:10: exps+= assignmentExpression ( ',' exps+= assignmentExpression )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignmentExpression_in_expressionList1597);
                    exps=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exps.getTree());
                    if (list_exps==null) list_exps=new ArrayList();
                    list_exps.add(exps.getTree());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:174:39: ( ',' exps+= assignmentExpression )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==68) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:174:40: ',' exps+= assignmentExpression
                    	    {
                    	    char_literal55=(Token)match(input,68,FOLLOW_68_in_expressionList1600); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal55_tree = (Object)adaptor.create(char_literal55);
                    	    adaptor.addChild(root_0, char_literal55_tree);
                    	    }
                    	    pushFollow(FOLLOW_assignmentExpression_in_expressionList1606);
                    	    exps=assignmentExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exps.getTree());
                    	    if (list_exps==null) list_exps=new ArrayList();
                    	    list_exps.add(exps.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:176:10: '(' exps+= assignmentExpression ( ',' exps+= assignmentExpression )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal56=(Token)match(input,66,FOLLOW_66_in_expressionList1629); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal56_tree = (Object)adaptor.create(char_literal56);
                    adaptor.addChild(root_0, char_literal56_tree);
                    }
                    pushFollow(FOLLOW_assignmentExpression_in_expressionList1635);
                    exps=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exps.getTree());
                    if (list_exps==null) list_exps=new ArrayList();
                    list_exps.add(exps.getTree());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:176:43: ( ',' exps+= assignmentExpression )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==68) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:176:44: ',' exps+= assignmentExpression
                    	    {
                    	    char_literal57=(Token)match(input,68,FOLLOW_68_in_expressionList1638); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal57_tree = (Object)adaptor.create(char_literal57);
                    	    adaptor.addChild(root_0, char_literal57_tree);
                    	    }
                    	    pushFollow(FOLLOW_assignmentExpression_in_expressionList1644);
                    	    exps=assignmentExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exps.getTree());
                    	    if (list_exps==null) list_exps=new ArrayList();
                    	    list_exps.add(exps.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    char_literal58=(Token)match(input,67,FOLLOW_67_in_expressionList1648); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal58_tree = (Object)adaptor.create(char_literal58);
                    adaptor.addChild(root_0, char_literal58_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 15, expressionList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expressionList"

    public static class inStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:183:1: inStatement : 'in' ID START ( (statements+= ( ( assignmentExpression | ifStatement | whenStatement | everyStatement | constraintFunctionCall ) NEWLINE ) )+ )* END ;
    public final celluloidParser.inStatement_return inStatement() throws RecognitionException {
        celluloidParser.inStatement_return retval = new celluloidParser.inStatement_return();
        retval.start = input.LT(1);
        int inStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal59=null;
        Token ID60=null;
        Token START61=null;
        Token NEWLINE67=null;
        Token END68=null;
        Token statements=null;
        List list_statements=null;
        celluloidParser.assignmentExpression_return assignmentExpression62 = null;

        celluloidParser.ifStatement_return ifStatement63 = null;

        celluloidParser.whenStatement_return whenStatement64 = null;

        celluloidParser.everyStatement_return everyStatement65 = null;

        celluloidParser.constraintFunctionCall_return constraintFunctionCall66 = null;


        Object string_literal59_tree=null;
        Object ID60_tree=null;
        Object START61_tree=null;
        Object NEWLINE67_tree=null;
        Object END68_tree=null;
        Object statements_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:184:5: ( 'in' ID START ( (statements+= ( ( assignmentExpression | ifStatement | whenStatement | everyStatement | constraintFunctionCall ) NEWLINE ) )+ )* END )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:184:8: 'in' ID START ( (statements+= ( ( assignmentExpression | ifStatement | whenStatement | everyStatement | constraintFunctionCall ) NEWLINE ) )+ )* END
            {
            root_0 = (Object)adaptor.nil();

            string_literal59=(Token)match(input,58,FOLLOW_58_in_inStatement1679); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal59_tree = (Object)adaptor.create(string_literal59);
            adaptor.addChild(root_0, string_literal59_tree);
            }
            ID60=(Token)match(input,ID,FOLLOW_ID_in_inStatement1681); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID60_tree = (Object)adaptor.create(ID60);
            adaptor.addChild(root_0, ID60_tree);
            }
            START61=(Token)match(input,START,FOLLOW_START_in_inStatement1691); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            START61_tree = (Object)adaptor.create(START61);
            adaptor.addChild(root_0, START61_tree);
            }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:13: ( (statements+= ( ( assignmentExpression | ifStatement | whenStatement | everyStatement | constraintFunctionCall ) NEWLINE ) )+ )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==ID||LA25_0==LITERAL||LA25_0==62||LA25_0==65||LA25_0==69||(LA25_0>=72 && LA25_0<=74)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:14: (statements+= ( ( assignmentExpression | ifStatement | whenStatement | everyStatement | constraintFunctionCall ) NEWLINE ) )+
            	    {
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:25: (statements+= ( ( assignmentExpression | ifStatement | whenStatement | everyStatement | constraintFunctionCall ) NEWLINE ) )+
            	    int cnt24=0;
            	    loop24:
            	    do {
            	        int alt24=2;
            	        alt24 = dfa24.predict(input);
            	        switch (alt24) {
            	    	case 1 :
            	    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: statements+= ( ( assignmentExpression | ifStatement | whenStatement | everyStatement | constraintFunctionCall ) NEWLINE )
            	    	    {
            	    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:28: ( ( assignmentExpression | ifStatement | whenStatement | everyStatement | constraintFunctionCall ) NEWLINE )
            	    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:29: ( assignmentExpression | ifStatement | whenStatement | everyStatement | constraintFunctionCall ) NEWLINE
            	    	    {
            	    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:29: ( assignmentExpression | ifStatement | whenStatement | everyStatement | constraintFunctionCall )
            	    	    int alt23=5;
            	    	    switch ( input.LA(1) ) {
            	    	    case LITERAL:
            	    	    case 62:
            	    	    case 65:
            	    	        {
            	    	        alt23=1;
            	    	        }
            	    	        break;
            	    	    case ID:
            	    	        {
            	    	        int LA23_2 = input.LA(2);

            	    	        if ( (LA23_2==NEWLINE||(LA23_2>=ASSIGNMENT_OPERATOR && LA23_2<=MULTIPLICATIVE_OPERATOR)||(LA23_2>=63 && LA23_2<=64)||LA23_2==66) ) {
            	    	            alt23=1;
            	    	        }
            	    	        else if ( (LA23_2==ID) ) {
            	    	            alt23=5;
            	    	        }
            	    	        else {
            	    	            if (state.backtracking>0) {state.failed=true; return retval;}
            	    	            NoViableAltException nvae =
            	    	                new NoViableAltException("", 23, 2, input);

            	    	            throw nvae;
            	    	        }
            	    	        }
            	    	        break;
            	    	    case 69:
            	    	        {
            	    	        alt23=2;
            	    	        }
            	    	        break;
            	    	    case 72:
            	    	    case 73:
            	    	        {
            	    	        alt23=3;
            	    	        }
            	    	        break;
            	    	    case 74:
            	    	        {
            	    	        alt23=4;
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
            	    	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:30: assignmentExpression
            	    	            {
            	    	            pushFollow(FOLLOW_assignmentExpression_in_inStatement1712);
            	    	            assignmentExpression62=assignmentExpression();

            	    	            state._fsp--;
            	    	            if (state.failed) return retval;
            	    	            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression62.getTree());

            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:53: ifStatement
            	    	            {
            	    	            pushFollow(FOLLOW_ifStatement_in_inStatement1716);
            	    	            ifStatement63=ifStatement();

            	    	            state._fsp--;
            	    	            if (state.failed) return retval;
            	    	            if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement63.getTree());

            	    	            }
            	    	            break;
            	    	        case 3 :
            	    	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:67: whenStatement
            	    	            {
            	    	            pushFollow(FOLLOW_whenStatement_in_inStatement1720);
            	    	            whenStatement64=whenStatement();

            	    	            state._fsp--;
            	    	            if (state.failed) return retval;
            	    	            if ( state.backtracking==0 ) adaptor.addChild(root_0, whenStatement64.getTree());

            	    	            }
            	    	            break;
            	    	        case 4 :
            	    	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:83: everyStatement
            	    	            {
            	    	            pushFollow(FOLLOW_everyStatement_in_inStatement1724);
            	    	            everyStatement65=everyStatement();

            	    	            state._fsp--;
            	    	            if (state.failed) return retval;
            	    	            if ( state.backtracking==0 ) adaptor.addChild(root_0, everyStatement65.getTree());

            	    	            }
            	    	            break;
            	    	        case 5 :
            	    	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:100: constraintFunctionCall
            	    	            {
            	    	            pushFollow(FOLLOW_constraintFunctionCall_in_inStatement1728);
            	    	            constraintFunctionCall66=constraintFunctionCall();

            	    	            state._fsp--;
            	    	            if (state.failed) return retval;
            	    	            if ( state.backtracking==0 ) adaptor.addChild(root_0, constraintFunctionCall66.getTree());

            	    	            }
            	    	            break;

            	    	    }

            	    	    NEWLINE67=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_inStatement1731); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    NEWLINE67_tree = (Object)adaptor.create(NEWLINE67);
            	    	    adaptor.addChild(root_0, NEWLINE67_tree);
            	    	    }

            	    	    }


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


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            END68=(Token)match(input,END,FOLLOW_END_in_inStatement1758); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END68_tree = (Object)adaptor.create(END68);
            adaptor.addChild(root_0, END68_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 16, inStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inStatement"

    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:192:1: ifStatement : 'if' ifTest= logicalORExpression START (ifBlock+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )+ (elseifBlock+= elseIfStatement )* ( elseStatement )? END -> ^( IF $ifTest ^( IFBLOCK $ifBlock) ^( ELSEIF ( $elseifBlock)? ) ^( ELSE ( elseStatement )? ) ) ;
    public final celluloidParser.ifStatement_return ifStatement() throws RecognitionException {
        celluloidParser.ifStatement_return retval = new celluloidParser.ifStatement_return();
        retval.start = input.LT(1);
        int ifStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal69=null;
        Token START70=null;
        Token NEWLINE74=null;
        Token END76=null;
        Token ifBlock=null;
        List list_ifBlock=null;
        List list_elseifBlock=null;
        celluloidParser.logicalORExpression_return ifTest = null;

        celluloidParser.assignmentExpression_return assignmentExpression71 = null;

        celluloidParser.inStatement_return inStatement72 = null;

        celluloidParser.ifStatement_return ifStatement73 = null;

        celluloidParser.elseStatement_return elseStatement75 = null;

        RuleReturnScope elseifBlock = null;
        Object string_literal69_tree=null;
        Object START70_tree=null;
        Object NEWLINE74_tree=null;
        Object END76_tree=null;
        Object ifBlock_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        RewriteRuleSubtreeStream stream_inStatement=new RewriteRuleSubtreeStream(adaptor,"rule inStatement");
        RewriteRuleSubtreeStream stream_elseStatement=new RewriteRuleSubtreeStream(adaptor,"rule elseStatement");
        RewriteRuleSubtreeStream stream_logicalORExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalORExpression");
        RewriteRuleSubtreeStream stream_elseIfStatement=new RewriteRuleSubtreeStream(adaptor,"rule elseIfStatement");
        RewriteRuleSubtreeStream stream_ifStatement=new RewriteRuleSubtreeStream(adaptor,"rule ifStatement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:193:5: ( 'if' ifTest= logicalORExpression START (ifBlock+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )+ (elseifBlock+= elseIfStatement )* ( elseStatement )? END -> ^( IF $ifTest ^( IFBLOCK $ifBlock) ^( ELSEIF ( $elseifBlock)? ) ^( ELSE ( elseStatement )? ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:193:8: 'if' ifTest= logicalORExpression START (ifBlock+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )+ (elseifBlock+= elseIfStatement )* ( elseStatement )? END
            {
            string_literal69=(Token)match(input,69,FOLLOW_69_in_ifStatement1788); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_69.add(string_literal69);

            pushFollow(FOLLOW_logicalORExpression_in_ifStatement1794);
            ifTest=logicalORExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logicalORExpression.add(ifTest.getTree());
            START70=(Token)match(input,START,FOLLOW_START_in_ifStatement1804); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START70);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:195:13: (ifBlock+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==ID||(LA27_0>=LITERAL && LA27_0<=58)||LA27_0==62||LA27_0==65||LA27_0==69) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:195:14: ifBlock+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE
            	    {
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:195:25: ( assignmentExpression | inStatement | ifStatement )
            	    int alt26=3;
            	    switch ( input.LA(1) ) {
            	    case ID:
            	    case LITERAL:
            	    case 62:
            	    case 65:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case 58:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case 69:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:195:26: assignmentExpression
            	            {
            	            pushFollow(FOLLOW_assignmentExpression_in_ifStatement1824);
            	            assignmentExpression71=assignmentExpression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression71.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:195:49: inStatement
            	            {
            	            pushFollow(FOLLOW_inStatement_in_ifStatement1828);
            	            inStatement72=inStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_inStatement.add(inStatement72.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:195:63: ifStatement
            	            {
            	            pushFollow(FOLLOW_ifStatement_in_ifStatement1832);
            	            ifStatement73=ifStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_ifStatement.add(ifStatement73.getTree());

            	            }
            	            break;

            	    }

            	    NEWLINE74=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ifStatement1835); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE74);


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

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:196:13: (elseifBlock+= elseIfStatement )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==70) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:196:14: elseifBlock+= elseIfStatement
            	    {
            	    pushFollow(FOLLOW_elseIfStatement_in_ifStatement1857);
            	    elseifBlock=elseIfStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elseIfStatement.add(elseifBlock.getTree());
            	    if (list_elseifBlock==null) list_elseifBlock=new ArrayList();
            	    list_elseifBlock.add(elseifBlock.getTree());


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:197:13: ( elseStatement )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==71) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: elseStatement
                    {
                    pushFollow(FOLLOW_elseStatement_in_ifStatement1873);
                    elseStatement75=elseStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseStatement.add(elseStatement75.getTree());

                    }
                    break;

            }

            END76=(Token)match(input,END,FOLLOW_END_in_ifStatement1884); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END76);



            // AST REWRITE
            // elements: ifBlock, elseStatement, ifTest, elseifBlock
            // token labels: 
            // rule labels: retval, ifTest
            // token list labels: ifBlock
            // rule list labels: elseifBlock
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_ifBlock=new RewriteRuleTokenStream(adaptor,"token ifBlock", list_ifBlock);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ifTest=new RewriteRuleSubtreeStream(adaptor,"rule ifTest",ifTest!=null?ifTest.tree:null);
            RewriteRuleSubtreeStream stream_elseifBlock=new RewriteRuleSubtreeStream(adaptor,"token elseifBlock",list_elseifBlock);
            root_0 = (Object)adaptor.nil();
            // 199:9: -> ^( IF $ifTest ^( IFBLOCK $ifBlock) ^( ELSEIF ( $elseifBlock)? ) ^( ELSE ( elseStatement )? ) )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:199:12: ^( IF $ifTest ^( IFBLOCK $ifBlock) ^( ELSEIF ( $elseifBlock)? ) ^( ELSE ( elseStatement )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_ifTest.nextTree());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:199:25: ^( IFBLOCK $ifBlock)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IFBLOCK, "IFBLOCK"), root_2);

                adaptor.addChild(root_2, stream_ifBlock.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:199:45: ^( ELSEIF ( $elseifBlock)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSEIF, "ELSEIF"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:199:54: ( $elseifBlock)?
                if ( stream_elseifBlock.hasNext() ) {
                    adaptor.addChild(root_2, stream_elseifBlock.nextTree());

                }
                stream_elseifBlock.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:199:69: ^( ELSE ( elseStatement )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:199:76: ( elseStatement )?
                if ( stream_elseStatement.hasNext() ) {
                    adaptor.addChild(root_2, stream_elseStatement.nextTree());

                }
                stream_elseStatement.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 17, ifStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class elseIfStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseIfStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:202:1: elseIfStatement : 'else if' (elseIfTest= logicalORExpression NEWLINE ) (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )* -> ^( $elseIfTest ^( IFBLOCK $statements) ) ;
    public final celluloidParser.elseIfStatement_return elseIfStatement() throws RecognitionException {
        celluloidParser.elseIfStatement_return retval = new celluloidParser.elseIfStatement_return();
        retval.start = input.LT(1);
        int elseIfStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal77=null;
        Token NEWLINE78=null;
        Token NEWLINE82=null;
        Token statements=null;
        List list_statements=null;
        celluloidParser.logicalORExpression_return elseIfTest = null;

        celluloidParser.assignmentExpression_return assignmentExpression79 = null;

        celluloidParser.inStatement_return inStatement80 = null;

        celluloidParser.ifStatement_return ifStatement81 = null;


        Object string_literal77_tree=null;
        Object NEWLINE78_tree=null;
        Object NEWLINE82_tree=null;
        Object statements_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        RewriteRuleSubtreeStream stream_inStatement=new RewriteRuleSubtreeStream(adaptor,"rule inStatement");
        RewriteRuleSubtreeStream stream_logicalORExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalORExpression");
        RewriteRuleSubtreeStream stream_ifStatement=new RewriteRuleSubtreeStream(adaptor,"rule ifStatement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:203:2: ( 'else if' (elseIfTest= logicalORExpression NEWLINE ) (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )* -> ^( $elseIfTest ^( IFBLOCK $statements) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:203:6: 'else if' (elseIfTest= logicalORExpression NEWLINE ) (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )*
            {
            string_literal77=(Token)match(input,70,FOLLOW_70_in_elseIfStatement1948); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_70.add(string_literal77);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:203:16: (elseIfTest= logicalORExpression NEWLINE )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:203:17: elseIfTest= logicalORExpression NEWLINE
            {
            pushFollow(FOLLOW_logicalORExpression_in_elseIfStatement1955);
            elseIfTest=logicalORExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logicalORExpression.add(elseIfTest.getTree());
            NEWLINE78=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elseIfStatement1957); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE78);


            }

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:204:14: (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==ID||(LA31_0>=LITERAL && LA31_0<=58)||LA31_0==62||LA31_0==65||LA31_0==69) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:204:15: statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE
            	    {
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:204:29: ( assignmentExpression | inStatement | ifStatement )
            	    int alt30=3;
            	    switch ( input.LA(1) ) {
            	    case ID:
            	    case LITERAL:
            	    case 62:
            	    case 65:
            	        {
            	        alt30=1;
            	        }
            	        break;
            	    case 58:
            	        {
            	        alt30=2;
            	        }
            	        break;
            	    case 69:
            	        {
            	        alt30=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt30) {
            	        case 1 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:204:30: assignmentExpression
            	            {
            	            pushFollow(FOLLOW_assignmentExpression_in_elseIfStatement1980);
            	            assignmentExpression79=assignmentExpression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression79.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:204:53: inStatement
            	            {
            	            pushFollow(FOLLOW_inStatement_in_elseIfStatement1984);
            	            inStatement80=inStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_inStatement.add(inStatement80.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:204:67: ifStatement
            	            {
            	            pushFollow(FOLLOW_ifStatement_in_elseIfStatement1988);
            	            ifStatement81=ifStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_ifStatement.add(ifStatement81.getTree());

            	            }
            	            break;

            	    }

            	    NEWLINE82=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elseIfStatement1991); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE82);


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);



            // AST REWRITE
            // elements: elseIfTest, statements
            // token labels: 
            // rule labels: retval, elseIfTest
            // token list labels: statements
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_statements=new RewriteRuleTokenStream(adaptor,"token statements", list_statements);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_elseIfTest=new RewriteRuleSubtreeStream(adaptor,"rule elseIfTest",elseIfTest!=null?elseIfTest.tree:null);

            root_0 = (Object)adaptor.nil();
            // 205:14: -> ^( $elseIfTest ^( IFBLOCK $statements) )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:205:17: ^( $elseIfTest ^( IFBLOCK $statements) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_elseIfTest.nextNode(), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:205:31: ^( IFBLOCK $statements)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IFBLOCK, "IFBLOCK"), root_2);

                adaptor.addChild(root_2, stream_statements.nextNode());

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
            if ( state.backtracking>0 ) { memoize(input, 18, elseIfStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elseIfStatement"

    public static class elseStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:208:1: elseStatement : 'else' (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )* -> ^( IFBLOCK $statements) ;
    public final celluloidParser.elseStatement_return elseStatement() throws RecognitionException {
        celluloidParser.elseStatement_return retval = new celluloidParser.elseStatement_return();
        retval.start = input.LT(1);
        int elseStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal83=null;
        Token NEWLINE87=null;
        Token statements=null;
        List list_statements=null;
        celluloidParser.assignmentExpression_return assignmentExpression84 = null;

        celluloidParser.inStatement_return inStatement85 = null;

        celluloidParser.ifStatement_return ifStatement86 = null;


        Object string_literal83_tree=null;
        Object NEWLINE87_tree=null;
        Object statements_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        RewriteRuleSubtreeStream stream_inStatement=new RewriteRuleSubtreeStream(adaptor,"rule inStatement");
        RewriteRuleSubtreeStream stream_ifStatement=new RewriteRuleSubtreeStream(adaptor,"rule ifStatement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:209:2: ( 'else' (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )* -> ^( IFBLOCK $statements) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:209:6: 'else' (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )*
            {
            string_literal83=(Token)match(input,71,FOLLOW_71_in_elseStatement2035); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_71.add(string_literal83);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:209:13: (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==ID||(LA33_0>=LITERAL && LA33_0<=58)||LA33_0==62||LA33_0==65||LA33_0==69) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:209:14: statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE
            	    {
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:209:28: ( assignmentExpression | inStatement | ifStatement )
            	    int alt32=3;
            	    switch ( input.LA(1) ) {
            	    case ID:
            	    case LITERAL:
            	    case 62:
            	    case 65:
            	        {
            	        alt32=1;
            	        }
            	        break;
            	    case 58:
            	        {
            	        alt32=2;
            	        }
            	        break;
            	    case 69:
            	        {
            	        alt32=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt32) {
            	        case 1 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:209:29: assignmentExpression
            	            {
            	            pushFollow(FOLLOW_assignmentExpression_in_elseStatement2043);
            	            assignmentExpression84=assignmentExpression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression84.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:209:52: inStatement
            	            {
            	            pushFollow(FOLLOW_inStatement_in_elseStatement2047);
            	            inStatement85=inStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_inStatement.add(inStatement85.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:209:66: ifStatement
            	            {
            	            pushFollow(FOLLOW_ifStatement_in_elseStatement2051);
            	            ifStatement86=ifStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_ifStatement.add(ifStatement86.getTree());

            	            }
            	            break;

            	    }

            	    NEWLINE87=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elseStatement2054); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE87);


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);



            // AST REWRITE
            // elements: statements
            // token labels: 
            // rule labels: retval
            // token list labels: statements
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_statements=new RewriteRuleTokenStream(adaptor,"token statements", list_statements);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 210:14: -> ^( IFBLOCK $statements)
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:210:17: ^( IFBLOCK $statements)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IFBLOCK, "IFBLOCK"), root_1);

                adaptor.addChild(root_1, stream_statements.nextNode());

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
            if ( state.backtracking>0 ) { memoize(input, 19, elseStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elseStatement"

    public static class whenStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whenStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:213:1: whenStatement : cond= ( 'when' | 'unless' ) logicalORExpression START ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE )+ END -> ^( LISTENER EVERY ^( COND $cond logicalORExpression ) ^( LISTENBLOCK ( assignmentExpression )* ( constraintFunctionCall )* ( ifStatement )* ) ) ;
    public final celluloidParser.whenStatement_return whenStatement() throws RecognitionException {
        celluloidParser.whenStatement_return retval = new celluloidParser.whenStatement_return();
        retval.start = input.LT(1);
        int whenStatement_StartIndex = input.index();
        Object root_0 = null;

        Token cond=null;
        Token string_literal88=null;
        Token string_literal89=null;
        Token START91=null;
        Token NEWLINE95=null;
        Token END96=null;
        celluloidParser.logicalORExpression_return logicalORExpression90 = null;

        celluloidParser.assignmentExpression_return assignmentExpression92 = null;

        celluloidParser.constraintFunctionCall_return constraintFunctionCall93 = null;

        celluloidParser.ifStatement_return ifStatement94 = null;


        Object cond_tree=null;
        Object string_literal88_tree=null;
        Object string_literal89_tree=null;
        Object START91_tree=null;
        Object NEWLINE95_tree=null;
        Object END96_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_constraintFunctionCall=new RewriteRuleSubtreeStream(adaptor,"rule constraintFunctionCall");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        RewriteRuleSubtreeStream stream_logicalORExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalORExpression");
        RewriteRuleSubtreeStream stream_ifStatement=new RewriteRuleSubtreeStream(adaptor,"rule ifStatement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:214:5: (cond= ( 'when' | 'unless' ) logicalORExpression START ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE )+ END -> ^( LISTENER EVERY ^( COND $cond logicalORExpression ) ^( LISTENBLOCK ( assignmentExpression )* ( constraintFunctionCall )* ( ifStatement )* ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:214:9: cond= ( 'when' | 'unless' ) logicalORExpression START ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE )+ END
            {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:214:16: ( 'when' | 'unless' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==72) ) {
                alt34=1;
            }
            else if ( (LA34_0==73) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:214:17: 'when'
                    {
                    string_literal88=(Token)match(input,72,FOLLOW_72_in_whenStatement2099); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_72.add(string_literal88);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:214:26: 'unless'
                    {
                    string_literal89=(Token)match(input,73,FOLLOW_73_in_whenStatement2103); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_73.add(string_literal89);


                    }
                    break;

            }

            pushFollow(FOLLOW_logicalORExpression_in_whenStatement2106);
            logicalORExpression90=logicalORExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logicalORExpression.add(logicalORExpression90.getTree());
            START91=(Token)match(input,START,FOLLOW_START_in_whenStatement2116); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START91);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:216:6: ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==ID||LA36_0==LITERAL||LA36_0==62||LA36_0==65||LA36_0==69) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:216:7: ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE
            	    {
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:216:7: ( assignmentExpression | constraintFunctionCall | ifStatement )
            	    int alt35=3;
            	    switch ( input.LA(1) ) {
            	    case LITERAL:
            	    case 62:
            	    case 65:
            	        {
            	        alt35=1;
            	        }
            	        break;
            	    case ID:
            	        {
            	        int LA35_2 = input.LA(2);

            	        if ( (LA35_2==NEWLINE||(LA35_2>=ASSIGNMENT_OPERATOR && LA35_2<=MULTIPLICATIVE_OPERATOR)||(LA35_2>=63 && LA35_2<=64)||LA35_2==66) ) {
            	            alt35=1;
            	        }
            	        else if ( (LA35_2==ID) ) {
            	            alt35=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return retval;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 35, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 69:
            	        {
            	        alt35=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt35) {
            	        case 1 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:216:8: assignmentExpression
            	            {
            	            pushFollow(FOLLOW_assignmentExpression_in_whenStatement2125);
            	            assignmentExpression92=assignmentExpression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression92.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:216:31: constraintFunctionCall
            	            {
            	            pushFollow(FOLLOW_constraintFunctionCall_in_whenStatement2129);
            	            constraintFunctionCall93=constraintFunctionCall();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_constraintFunctionCall.add(constraintFunctionCall93.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:216:56: ifStatement
            	            {
            	            pushFollow(FOLLOW_ifStatement_in_whenStatement2133);
            	            ifStatement94=ifStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_ifStatement.add(ifStatement94.getTree());

            	            }
            	            break;

            	    }

            	    NEWLINE95=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_whenStatement2136); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE95);


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            END96=(Token)match(input,END,FOLLOW_END_in_whenStatement2149); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END96);



            // AST REWRITE
            // elements: logicalORExpression, cond, ifStatement, constraintFunctionCall, assignmentExpression
            // token labels: cond
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_cond=new RewriteRuleTokenStream(adaptor,"token cond",cond);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 218:9: -> ^( LISTENER EVERY ^( COND $cond logicalORExpression ) ^( LISTENBLOCK ( assignmentExpression )* ( constraintFunctionCall )* ( ifStatement )* ) )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:218:12: ^( LISTENER EVERY ^( COND $cond logicalORExpression ) ^( LISTENBLOCK ( assignmentExpression )* ( constraintFunctionCall )* ( ifStatement )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LISTENER, "LISTENER"), root_1);

                adaptor.addChild(root_1, (Object)adaptor.create(EVERY, "EVERY"));
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:218:29: ^( COND $cond logicalORExpression )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);

                adaptor.addChild(root_2, stream_cond.nextNode());
                adaptor.addChild(root_2, stream_logicalORExpression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:219:14: ^( LISTENBLOCK ( assignmentExpression )* ( constraintFunctionCall )* ( ifStatement )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(LISTENBLOCK, "LISTENBLOCK"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:219:28: ( assignmentExpression )*
                while ( stream_assignmentExpression.hasNext() ) {
                    adaptor.addChild(root_2, stream_assignmentExpression.nextTree());

                }
                stream_assignmentExpression.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:219:50: ( constraintFunctionCall )*
                while ( stream_constraintFunctionCall.hasNext() ) {
                    adaptor.addChild(root_2, stream_constraintFunctionCall.nextTree());

                }
                stream_constraintFunctionCall.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:219:74: ( ifStatement )*
                while ( stream_ifStatement.hasNext() ) {
                    adaptor.addChild(root_2, stream_ifStatement.nextTree());

                }
                stream_ifStatement.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 20, whenStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "whenStatement"

    public static class everyStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "everyStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:223:1: everyStatement : 'every' TIME (cond= ( 'when' | 'unless' ) logicalORExpression )? START ( (statements+= ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE ) )* ) END -> ^( LISTENER ^( EVERY TIME ) ^( COND ( $cond)? ( logicalORExpression )? ) ^( LISTENBLOCK ( assignmentExpression )* ( constraintFunctionCall )* ( ifStatement )* ) ) ;
    public final celluloidParser.everyStatement_return everyStatement() throws RecognitionException {
        celluloidParser.everyStatement_return retval = new celluloidParser.everyStatement_return();
        retval.start = input.LT(1);
        int everyStatement_StartIndex = input.index();
        Object root_0 = null;

        Token cond=null;
        Token string_literal97=null;
        Token TIME98=null;
        Token string_literal99=null;
        Token string_literal100=null;
        Token START102=null;
        Token NEWLINE106=null;
        Token END107=null;
        Token statements=null;
        List list_statements=null;
        celluloidParser.logicalORExpression_return logicalORExpression101 = null;

        celluloidParser.assignmentExpression_return assignmentExpression103 = null;

        celluloidParser.constraintFunctionCall_return constraintFunctionCall104 = null;

        celluloidParser.ifStatement_return ifStatement105 = null;


        Object cond_tree=null;
        Object string_literal97_tree=null;
        Object TIME98_tree=null;
        Object string_literal99_tree=null;
        Object string_literal100_tree=null;
        Object START102_tree=null;
        Object NEWLINE106_tree=null;
        Object END107_tree=null;
        Object statements_tree=null;
        RewriteRuleTokenStream stream_TIME=new RewriteRuleTokenStream(adaptor,"token TIME");
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_constraintFunctionCall=new RewriteRuleSubtreeStream(adaptor,"rule constraintFunctionCall");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        RewriteRuleSubtreeStream stream_logicalORExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalORExpression");
        RewriteRuleSubtreeStream stream_ifStatement=new RewriteRuleSubtreeStream(adaptor,"rule ifStatement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:224:5: ( 'every' TIME (cond= ( 'when' | 'unless' ) logicalORExpression )? START ( (statements+= ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE ) )* ) END -> ^( LISTENER ^( EVERY TIME ) ^( COND ( $cond)? ( logicalORExpression )? ) ^( LISTENBLOCK ( assignmentExpression )* ( constraintFunctionCall )* ( ifStatement )* ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:224:8: 'every' TIME (cond= ( 'when' | 'unless' ) logicalORExpression )? START ( (statements+= ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE ) )* ) END
            {
            string_literal97=(Token)match(input,74,FOLLOW_74_in_everyStatement2232); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_74.add(string_literal97);

            TIME98=(Token)match(input,TIME,FOLLOW_TIME_in_everyStatement2234); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TIME.add(TIME98);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:224:21: (cond= ( 'when' | 'unless' ) logicalORExpression )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=72 && LA38_0<=73)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:224:22: cond= ( 'when' | 'unless' ) logicalORExpression
                    {
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:224:29: ( 'when' | 'unless' )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==72) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==73) ) {
                        alt37=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:224:30: 'when'
                            {
                            string_literal99=(Token)match(input,72,FOLLOW_72_in_everyStatement2242); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_72.add(string_literal99);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:224:39: 'unless'
                            {
                            string_literal100=(Token)match(input,73,FOLLOW_73_in_everyStatement2246); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_73.add(string_literal100);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_logicalORExpression_in_everyStatement2249);
                    logicalORExpression101=logicalORExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logicalORExpression.add(logicalORExpression101.getTree());

                    }
                    break;

            }

            START102=(Token)match(input,START,FOLLOW_START_in_everyStatement2261); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START102);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:226:13: ( (statements+= ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE ) )* )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:226:14: (statements+= ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE ) )*
            {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:226:25: (statements+= ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==ID||LA40_0==LITERAL||LA40_0==62||LA40_0==65||LA40_0==69) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: statements+= ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE )
            	    {
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:226:28: ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE )
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:226:29: ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE
            	    {
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:226:29: ( assignmentExpression | constraintFunctionCall | ifStatement )
            	    int alt39=3;
            	    switch ( input.LA(1) ) {
            	    case LITERAL:
            	    case 62:
            	    case 65:
            	        {
            	        alt39=1;
            	        }
            	        break;
            	    case ID:
            	        {
            	        int LA39_2 = input.LA(2);

            	        if ( (LA39_2==NEWLINE||(LA39_2>=ASSIGNMENT_OPERATOR && LA39_2<=MULTIPLICATIVE_OPERATOR)||(LA39_2>=63 && LA39_2<=64)||LA39_2==66) ) {
            	            alt39=1;
            	        }
            	        else if ( (LA39_2==ID) ) {
            	            alt39=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return retval;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 39, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 69:
            	        {
            	        alt39=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt39) {
            	        case 1 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:226:30: assignmentExpression
            	            {
            	            pushFollow(FOLLOW_assignmentExpression_in_everyStatement2282);
            	            assignmentExpression103=assignmentExpression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression103.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:226:53: constraintFunctionCall
            	            {
            	            pushFollow(FOLLOW_constraintFunctionCall_in_everyStatement2286);
            	            constraintFunctionCall104=constraintFunctionCall();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_constraintFunctionCall.add(constraintFunctionCall104.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:226:78: ifStatement
            	            {
            	            pushFollow(FOLLOW_ifStatement_in_everyStatement2290);
            	            ifStatement105=ifStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_ifStatement.add(ifStatement105.getTree());

            	            }
            	            break;

            	    }

            	    NEWLINE106=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_everyStatement2293); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE106);


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            END107=(Token)match(input,END,FOLLOW_END_in_everyStatement2307); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END107);



            // AST REWRITE
            // elements: logicalORExpression, TIME, cond, assignmentExpression, ifStatement, constraintFunctionCall
            // token labels: cond
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_cond=new RewriteRuleTokenStream(adaptor,"token cond",cond);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 228:9: -> ^( LISTENER ^( EVERY TIME ) ^( COND ( $cond)? ( logicalORExpression )? ) ^( LISTENBLOCK ( assignmentExpression )* ( constraintFunctionCall )* ( ifStatement )* ) )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:228:12: ^( LISTENER ^( EVERY TIME ) ^( COND ( $cond)? ( logicalORExpression )? ) ^( LISTENBLOCK ( assignmentExpression )* ( constraintFunctionCall )* ( ifStatement )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LISTENER, "LISTENER"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:228:23: ^( EVERY TIME )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EVERY, "EVERY"), root_2);

                adaptor.addChild(root_2, stream_TIME.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:228:37: ^( COND ( $cond)? ( logicalORExpression )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:228:44: ( $cond)?
                if ( stream_cond.hasNext() ) {
                    adaptor.addChild(root_2, stream_cond.nextNode());

                }
                stream_cond.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:228:51: ( logicalORExpression )?
                if ( stream_logicalORExpression.hasNext() ) {
                    adaptor.addChild(root_2, stream_logicalORExpression.nextTree());

                }
                stream_logicalORExpression.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:229:14: ^( LISTENBLOCK ( assignmentExpression )* ( constraintFunctionCall )* ( ifStatement )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(LISTENBLOCK, "LISTENBLOCK"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:229:28: ( assignmentExpression )*
                while ( stream_assignmentExpression.hasNext() ) {
                    adaptor.addChild(root_2, stream_assignmentExpression.nextTree());

                }
                stream_assignmentExpression.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:229:50: ( constraintFunctionCall )*
                while ( stream_constraintFunctionCall.hasNext() ) {
                    adaptor.addChild(root_2, stream_constraintFunctionCall.nextTree());

                }
                stream_constraintFunctionCall.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:229:74: ( ifStatement )*
                while ( stream_ifStatement.hasNext() ) {
                    adaptor.addChild(root_2, stream_ifStatement.nextTree());

                }
                stream_ifStatement.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 21, everyStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "everyStatement"

    public static class constraintFunctionCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constraintFunctionCall"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:233:1: constraintFunctionCall : ID ID expressionList ;
    public final celluloidParser.constraintFunctionCall_return constraintFunctionCall() throws RecognitionException {
        celluloidParser.constraintFunctionCall_return retval = new celluloidParser.constraintFunctionCall_return();
        retval.start = input.LT(1);
        int constraintFunctionCall_StartIndex = input.index();
        Object root_0 = null;

        Token ID108=null;
        Token ID109=null;
        celluloidParser.expressionList_return expressionList110 = null;


        Object ID108_tree=null;
        Object ID109_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:234:5: ( ID ID expressionList )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:234:10: ID ID expressionList
            {
            root_0 = (Object)adaptor.nil();

            ID108=(Token)match(input,ID,FOLLOW_ID_in_constraintFunctionCall2398); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID108_tree = (Object)adaptor.create(ID108);
            adaptor.addChild(root_0, ID108_tree);
            }
            ID109=(Token)match(input,ID,FOLLOW_ID_in_constraintFunctionCall2400); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID109_tree = (Object)adaptor.create(ID109);
            adaptor.addChild(root_0, ID109_tree);
            }
            pushFollow(FOLLOW_expressionList_in_constraintFunctionCall2402);
            expressionList110=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList110.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 22, constraintFunctionCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constraintFunctionCall"

    public static class functionPredicateCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionPredicateCall"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:238:1: functionPredicateCall : ID '(' expressionList ')' ( NEWLINE )? -> ^( CALL ID ^( ARGS expressionList ) ) ;
    public final celluloidParser.functionPredicateCall_return functionPredicateCall() throws RecognitionException {
        celluloidParser.functionPredicateCall_return retval = new celluloidParser.functionPredicateCall_return();
        retval.start = input.LT(1);
        int functionPredicateCall_StartIndex = input.index();
        Object root_0 = null;

        Token ID111=null;
        Token char_literal112=null;
        Token char_literal114=null;
        Token NEWLINE115=null;
        celluloidParser.expressionList_return expressionList113 = null;


        Object ID111_tree=null;
        Object char_literal112_tree=null;
        Object char_literal114_tree=null;
        Object NEWLINE115_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:239:5: ( ID '(' expressionList ')' ( NEWLINE )? -> ^( CALL ID ^( ARGS expressionList ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:239:10: ID '(' expressionList ')' ( NEWLINE )?
            {
            ID111=(Token)match(input,ID,FOLLOW_ID_in_functionPredicateCall2435); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID111);

            char_literal112=(Token)match(input,66,FOLLOW_66_in_functionPredicateCall2437); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(char_literal112);

            pushFollow(FOLLOW_expressionList_in_functionPredicateCall2439);
            expressionList113=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expressionList.add(expressionList113.getTree());
            char_literal114=(Token)match(input,67,FOLLOW_67_in_functionPredicateCall2441); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(char_literal114);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:239:36: ( NEWLINE )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==NEWLINE) ) {
                int LA41_1 = input.LA(2);

                if ( (synpred53_celluloid()) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: NEWLINE
                    {
                    NEWLINE115=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_functionPredicateCall2443); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE115);


                    }
                    break;

            }



            // AST REWRITE
            // elements: ID, expressionList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 240:10: -> ^( CALL ID ^( ARGS expressionList ) )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:240:13: ^( CALL ID ^( ARGS expressionList ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:240:23: ^( ARGS expressionList )
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
            if ( state.backtracking>0 ) { memoize(input, 23, functionPredicateCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionPredicateCall"

    public static class functionHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionHeader"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:246:1: functionHeader : 'function' ID '(' variableList ')' NEWLINE -> ^( FUNHEAD ID variableList ) ;
    public final celluloidParser.functionHeader_return functionHeader() throws RecognitionException {
        celluloidParser.functionHeader_return retval = new celluloidParser.functionHeader_return();
        retval.start = input.LT(1);
        int functionHeader_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal116=null;
        Token ID117=null;
        Token char_literal118=null;
        Token char_literal120=null;
        Token NEWLINE121=null;
        celluloidParser.variableList_return variableList119 = null;


        Object string_literal116_tree=null;
        Object ID117_tree=null;
        Object char_literal118_tree=null;
        Object char_literal120_tree=null;
        Object NEWLINE121_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_variableList=new RewriteRuleSubtreeStream(adaptor,"rule variableList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:247:5: ( 'function' ID '(' variableList ')' NEWLINE -> ^( FUNHEAD ID variableList ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:247:10: 'function' ID '(' variableList ')' NEWLINE
            {
            string_literal116=(Token)match(input,75,FOLLOW_75_in_functionHeader2500); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_75.add(string_literal116);

            ID117=(Token)match(input,ID,FOLLOW_ID_in_functionHeader2502); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID117);

            char_literal118=(Token)match(input,66,FOLLOW_66_in_functionHeader2504); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(char_literal118);

            pushFollow(FOLLOW_variableList_in_functionHeader2506);
            variableList119=variableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableList.add(variableList119.getTree());
            char_literal120=(Token)match(input,67,FOLLOW_67_in_functionHeader2508); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(char_literal120);

            NEWLINE121=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_functionHeader2510); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE121);



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
            // 248:10: -> ^( FUNHEAD ID variableList )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:248:13: ^( FUNHEAD ID variableList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNHEAD, "FUNHEAD"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_variableList.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 24, functionHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionHeader"

    public static class functionBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:250:1: functionBlock : START (vars+= variableDeclaration | calls+= functionPredicateCall | exps+= ( assignmentExpression NEWLINE ) )* END -> ^( FUNBLOCK[$START, \"FUNCBLOCK\"] RETURN ( $vars)* ( $calls)* ( $exps)* ) ;
    public final celluloidParser.functionBlock_return functionBlock() throws RecognitionException {
        celluloidParser.functionBlock_return retval = new celluloidParser.functionBlock_return();
        retval.start = input.LT(1);
        int functionBlock_StartIndex = input.index();
        Object root_0 = null;

        Token START122=null;
        Token NEWLINE124=null;
        Token END125=null;
        Token exps=null;
        List list_exps=null;
        List list_vars=null;
        List list_calls=null;
        celluloidParser.assignmentExpression_return assignmentExpression123 = null;

        RuleReturnScope vars = null;
        RuleReturnScope calls = null;
        Object START122_tree=null;
        Object NEWLINE124_tree=null;
        Object END125_tree=null;
        Object exps_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_functionPredicateCall=new RewriteRuleSubtreeStream(adaptor,"rule functionPredicateCall");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:251:5: ( START (vars+= variableDeclaration | calls+= functionPredicateCall | exps+= ( assignmentExpression NEWLINE ) )* END -> ^( FUNBLOCK[$START, \"FUNCBLOCK\"] RETURN ( $vars)* ( $calls)* ( $exps)* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:251:10: START (vars+= variableDeclaration | calls+= functionPredicateCall | exps+= ( assignmentExpression NEWLINE ) )* END
            {
            START122=(Token)match(input,START,FOLLOW_START_in_functionBlock2554); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START122);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:252:12: (vars+= variableDeclaration | calls+= functionPredicateCall | exps+= ( assignmentExpression NEWLINE ) )*
            loop42:
            do {
                int alt42=4;
                switch ( input.LA(1) ) {
                case TYPE:
                case 60:
                    {
                    alt42=1;
                    }
                    break;
                case ID:
                    {
                    int LA42_4 = input.LA(2);

                    if ( (synpred55_celluloid()) ) {
                        alt42=2;
                    }
                    else if ( (synpred56_celluloid()) ) {
                        alt42=3;
                    }


                    }
                    break;
                case LITERAL:
                case 62:
                case 65:
                    {
                    alt42=3;
                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:252:14: vars+= variableDeclaration
            	    {
            	    pushFollow(FOLLOW_variableDeclaration_in_functionBlock2574);
            	    vars=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclaration.add(vars.getTree());
            	    if (list_vars==null) list_vars=new ArrayList();
            	    list_vars.add(vars.getTree());


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:252:44: calls+= functionPredicateCall
            	    {
            	    pushFollow(FOLLOW_functionPredicateCall_in_functionBlock2582);
            	    calls=functionPredicateCall();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_functionPredicateCall.add(calls.getTree());
            	    if (list_calls==null) list_calls=new ArrayList();
            	    list_calls.add(calls.getTree());


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:252:77: exps+= ( assignmentExpression NEWLINE )
            	    {
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:252:85: ( assignmentExpression NEWLINE )
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:252:86: assignmentExpression NEWLINE
            	    {
            	    pushFollow(FOLLOW_assignmentExpression_in_functionBlock2591);
            	    assignmentExpression123=assignmentExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression123.getTree());
            	    NEWLINE124=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_functionBlock2593); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE124);


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            END125=(Token)match(input,END,FOLLOW_END_in_functionBlock2609); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END125);



            // AST REWRITE
            // elements: exps, calls, vars
            // token labels: 
            // rule labels: retval
            // token list labels: exps
            // rule list labels: vars, calls
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_exps=new RewriteRuleTokenStream(adaptor,"token exps", list_exps);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"token vars",list_vars);
            RewriteRuleSubtreeStream stream_calls=new RewriteRuleSubtreeStream(adaptor,"token calls",list_calls);
            root_0 = (Object)adaptor.nil();
            // 254:10: -> ^( FUNBLOCK[$START, \"FUNCBLOCK\"] RETURN ( $vars)* ( $calls)* ( $exps)* )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:254:13: ^( FUNBLOCK[$START, \"FUNCBLOCK\"] RETURN ( $vars)* ( $calls)* ( $exps)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNBLOCK, START122, "FUNCBLOCK"), root_1);

                adaptor.addChild(root_1, (Object)adaptor.create(RETURN, "RETURN"));
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:254:52: ( $vars)*
                while ( stream_vars.hasNext() ) {
                    adaptor.addChild(root_1, stream_vars.nextTree());

                }
                stream_vars.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:254:59: ( $calls)*
                while ( stream_calls.hasNext() ) {
                    adaptor.addChild(root_1, stream_calls.nextTree());

                }
                stream_calls.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:254:67: ( $exps)*
                while ( stream_exps.hasNext() ) {
                    adaptor.addChild(root_1, stream_exps.nextNode());

                }
                stream_exps.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 25, functionBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionBlock"

    public static class functionDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:259:1: functionDefinition : 'function' ID '(' variableList ')' functionBlock -> ^( FUNC ID variableList ( functionBlock )? ) ;
    public final celluloidParser.functionDefinition_return functionDefinition() throws RecognitionException {
        celluloidParser.functionDefinition_return retval = new celluloidParser.functionDefinition_return();
        retval.start = input.LT(1);
        int functionDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal126=null;
        Token ID127=null;
        Token char_literal128=null;
        Token char_literal130=null;
        celluloidParser.variableList_return variableList129 = null;

        celluloidParser.functionBlock_return functionBlock131 = null;


        Object string_literal126_tree=null;
        Object ID127_tree=null;
        Object char_literal128_tree=null;
        Object char_literal130_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_variableList=new RewriteRuleSubtreeStream(adaptor,"rule variableList");
        RewriteRuleSubtreeStream stream_functionBlock=new RewriteRuleSubtreeStream(adaptor,"rule functionBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:260:5: ( 'function' ID '(' variableList ')' functionBlock -> ^( FUNC ID variableList ( functionBlock )? ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:260:10: 'function' ID '(' variableList ')' functionBlock
            {
            string_literal126=(Token)match(input,75,FOLLOW_75_in_functionDefinition2691); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_75.add(string_literal126);

            ID127=(Token)match(input,ID,FOLLOW_ID_in_functionDefinition2693); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID127);

            char_literal128=(Token)match(input,66,FOLLOW_66_in_functionDefinition2695); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(char_literal128);

            pushFollow(FOLLOW_variableList_in_functionDefinition2697);
            variableList129=variableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableList.add(variableList129.getTree());
            char_literal130=(Token)match(input,67,FOLLOW_67_in_functionDefinition2699); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(char_literal130);

            pushFollow(FOLLOW_functionBlock_in_functionDefinition2701);
            functionBlock131=functionBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionBlock.add(functionBlock131.getTree());


            // AST REWRITE
            // elements: functionBlock, ID, variableList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 261:10: -> ^( FUNC ID variableList ( functionBlock )? )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:261:13: ^( FUNC ID variableList ( functionBlock )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC, "FUNC"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_variableList.nextTree());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:261:36: ( functionBlock )?
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
            if ( state.backtracking>0 ) { memoize(input, 26, functionDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionDefinition"

    public static class predicateHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predicateHeader"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:267:1: predicateHeader : 'predicate' ID '(' variableList ')' NEWLINE -> ^( PREDHEAD ID variableList ) ;
    public final celluloidParser.predicateHeader_return predicateHeader() throws RecognitionException {
        celluloidParser.predicateHeader_return retval = new celluloidParser.predicateHeader_return();
        retval.start = input.LT(1);
        int predicateHeader_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal132=null;
        Token ID133=null;
        Token char_literal134=null;
        Token char_literal136=null;
        Token NEWLINE137=null;
        celluloidParser.variableList_return variableList135 = null;


        Object string_literal132_tree=null;
        Object ID133_tree=null;
        Object char_literal134_tree=null;
        Object char_literal136_tree=null;
        Object NEWLINE137_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_variableList=new RewriteRuleSubtreeStream(adaptor,"rule variableList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:268:5: ( 'predicate' ID '(' variableList ')' NEWLINE -> ^( PREDHEAD ID variableList ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:268:10: 'predicate' ID '(' variableList ')' NEWLINE
            {
            string_literal132=(Token)match(input,76,FOLLOW_76_in_predicateHeader2761); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_76.add(string_literal132);

            ID133=(Token)match(input,ID,FOLLOW_ID_in_predicateHeader2763); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID133);

            char_literal134=(Token)match(input,66,FOLLOW_66_in_predicateHeader2765); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(char_literal134);

            pushFollow(FOLLOW_variableList_in_predicateHeader2767);
            variableList135=variableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableList.add(variableList135.getTree());
            char_literal136=(Token)match(input,67,FOLLOW_67_in_predicateHeader2769); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(char_literal136);

            NEWLINE137=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_predicateHeader2771); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE137);



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
            // 269:10: -> ^( PREDHEAD ID variableList )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:269:13: ^( PREDHEAD ID variableList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PREDHEAD, "PREDHEAD"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_variableList.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 27, predicateHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "predicateHeader"

    public static class predicateDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predicateDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:273:1: predicateDefinition : 'predicate' ID '(' variableList ')' predicateBlock -> ^( PRED ID variableList predicateBlock ) ;
    public final celluloidParser.predicateDefinition_return predicateDefinition() throws RecognitionException {
        celluloidParser.predicateDefinition_return retval = new celluloidParser.predicateDefinition_return();
        retval.start = input.LT(1);
        int predicateDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal138=null;
        Token ID139=null;
        Token char_literal140=null;
        Token char_literal142=null;
        celluloidParser.variableList_return variableList141 = null;

        celluloidParser.predicateBlock_return predicateBlock143 = null;


        Object string_literal138_tree=null;
        Object ID139_tree=null;
        Object char_literal140_tree=null;
        Object char_literal142_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_predicateBlock=new RewriteRuleSubtreeStream(adaptor,"rule predicateBlock");
        RewriteRuleSubtreeStream stream_variableList=new RewriteRuleSubtreeStream(adaptor,"rule variableList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:274:5: ( 'predicate' ID '(' variableList ')' predicateBlock -> ^( PRED ID variableList predicateBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:274:10: 'predicate' ID '(' variableList ')' predicateBlock
            {
            string_literal138=(Token)match(input,76,FOLLOW_76_in_predicateDefinition2822); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_76.add(string_literal138);

            ID139=(Token)match(input,ID,FOLLOW_ID_in_predicateDefinition2824); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID139);

            char_literal140=(Token)match(input,66,FOLLOW_66_in_predicateDefinition2826); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(char_literal140);

            pushFollow(FOLLOW_variableList_in_predicateDefinition2828);
            variableList141=variableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableList.add(variableList141.getTree());
            char_literal142=(Token)match(input,67,FOLLOW_67_in_predicateDefinition2830); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(char_literal142);

            pushFollow(FOLLOW_predicateBlock_in_predicateDefinition2832);
            predicateBlock143=predicateBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_predicateBlock.add(predicateBlock143.getTree());


            // AST REWRITE
            // elements: predicateBlock, variableList, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 275:7: -> ^( PRED ID variableList predicateBlock )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:275:10: ^( PRED ID variableList predicateBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRED, "PRED"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_variableList.nextTree());
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
            if ( state.backtracking>0 ) { memoize(input, 28, predicateDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "predicateDefinition"

    public static class predicateBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predicateBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:278:1: predicateBlock : START (vars+= variableDeclaration | calls+= functionPredicateCall | exps+= ( assignmentExpression NEWLINE ) )* 'return' retexp= assignmentExpression NEWLINE END -> ^( FUNBLOCK[$START, \"FUNBLOCK\"] ^( RETURN $retexp) ( $vars)* ( $calls)* ( $exps)* ) ;
    public final celluloidParser.predicateBlock_return predicateBlock() throws RecognitionException {
        celluloidParser.predicateBlock_return retval = new celluloidParser.predicateBlock_return();
        retval.start = input.LT(1);
        int predicateBlock_StartIndex = input.index();
        Object root_0 = null;

        Token START144=null;
        Token NEWLINE146=null;
        Token string_literal147=null;
        Token NEWLINE148=null;
        Token END149=null;
        Token exps=null;
        List list_exps=null;
        List list_vars=null;
        List list_calls=null;
        celluloidParser.assignmentExpression_return retexp = null;

        celluloidParser.assignmentExpression_return assignmentExpression145 = null;

        RuleReturnScope vars = null;
        RuleReturnScope calls = null;
        Object START144_tree=null;
        Object NEWLINE146_tree=null;
        Object string_literal147_tree=null;
        Object NEWLINE148_tree=null;
        Object END149_tree=null;
        Object exps_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_functionPredicateCall=new RewriteRuleSubtreeStream(adaptor,"rule functionPredicateCall");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:279:5: ( START (vars+= variableDeclaration | calls+= functionPredicateCall | exps+= ( assignmentExpression NEWLINE ) )* 'return' retexp= assignmentExpression NEWLINE END -> ^( FUNBLOCK[$START, \"FUNBLOCK\"] ^( RETURN $retexp) ( $vars)* ( $calls)* ( $exps)* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:280:10: START (vars+= variableDeclaration | calls+= functionPredicateCall | exps+= ( assignmentExpression NEWLINE ) )* 'return' retexp= assignmentExpression NEWLINE END
            {
            START144=(Token)match(input,START,FOLLOW_START_in_predicateBlock2896); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START144);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:281:12: (vars+= variableDeclaration | calls+= functionPredicateCall | exps+= ( assignmentExpression NEWLINE ) )*
            loop43:
            do {
                int alt43=4;
                switch ( input.LA(1) ) {
                case TYPE:
                case 60:
                    {
                    alt43=1;
                    }
                    break;
                case ID:
                    {
                    int LA43_4 = input.LA(2);

                    if ( (synpred58_celluloid()) ) {
                        alt43=2;
                    }
                    else if ( (synpred59_celluloid()) ) {
                        alt43=3;
                    }


                    }
                    break;
                case LITERAL:
                case 62:
                case 65:
                    {
                    alt43=3;
                    }
                    break;

                }

                switch (alt43) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:281:14: vars+= variableDeclaration
            	    {
            	    pushFollow(FOLLOW_variableDeclaration_in_predicateBlock2915);
            	    vars=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclaration.add(vars.getTree());
            	    if (list_vars==null) list_vars=new ArrayList();
            	    list_vars.add(vars.getTree());


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:281:44: calls+= functionPredicateCall
            	    {
            	    pushFollow(FOLLOW_functionPredicateCall_in_predicateBlock2923);
            	    calls=functionPredicateCall();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_functionPredicateCall.add(calls.getTree());
            	    if (list_calls==null) list_calls=new ArrayList();
            	    list_calls.add(calls.getTree());


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:281:77: exps+= ( assignmentExpression NEWLINE )
            	    {
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:281:85: ( assignmentExpression NEWLINE )
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:281:86: assignmentExpression NEWLINE
            	    {
            	    pushFollow(FOLLOW_assignmentExpression_in_predicateBlock2932);
            	    assignmentExpression145=assignmentExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression145.getTree());
            	    NEWLINE146=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_predicateBlock2934); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE146);


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            string_literal147=(Token)match(input,77,FOLLOW_77_in_predicateBlock2951); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_77.add(string_literal147);

            pushFollow(FOLLOW_assignmentExpression_in_predicateBlock2957);
            retexp=assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignmentExpression.add(retexp.getTree());
            NEWLINE148=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_predicateBlock2959); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE148);

            END149=(Token)match(input,END,FOLLOW_END_in_predicateBlock2971); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END149);



            // AST REWRITE
            // elements: retexp, calls, vars, exps
            // token labels: 
            // rule labels: retexp, retval
            // token list labels: exps
            // rule list labels: vars, calls
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_exps=new RewriteRuleTokenStream(adaptor,"token exps", list_exps);
            RewriteRuleSubtreeStream stream_retexp=new RewriteRuleSubtreeStream(adaptor,"rule retexp",retexp!=null?retexp.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"token vars",list_vars);
            RewriteRuleSubtreeStream stream_calls=new RewriteRuleSubtreeStream(adaptor,"token calls",list_calls);
            root_0 = (Object)adaptor.nil();
            // 284:10: -> ^( FUNBLOCK[$START, \"FUNBLOCK\"] ^( RETURN $retexp) ( $vars)* ( $calls)* ( $exps)* )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:284:13: ^( FUNBLOCK[$START, \"FUNBLOCK\"] ^( RETURN $retexp) ( $vars)* ( $calls)* ( $exps)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNBLOCK, START144, "FUNBLOCK"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:284:44: ^( RETURN $retexp)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_2);

                adaptor.addChild(root_2, stream_retexp.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:284:62: ( $vars)*
                while ( stream_vars.hasNext() ) {
                    adaptor.addChild(root_1, stream_vars.nextTree());

                }
                stream_vars.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:284:69: ( $calls)*
                while ( stream_calls.hasNext() ) {
                    adaptor.addChild(root_1, stream_calls.nextTree());

                }
                stream_calls.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:284:77: ( $exps)*
                while ( stream_exps.hasNext() ) {
                    adaptor.addChild(root_1, stream_exps.nextNode());

                }
                stream_exps.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 29, predicateBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "predicateBlock"

    public static class eventDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eventDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:293:1: eventDefinition : 'event' ID NEWLINE -> ^( EVENT ID ) ;
    public final celluloidParser.eventDefinition_return eventDefinition() throws RecognitionException {
        celluloidParser.eventDefinition_return retval = new celluloidParser.eventDefinition_return();
        retval.start = input.LT(1);
        int eventDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal150=null;
        Token ID151=null;
        Token NEWLINE152=null;

        Object string_literal150_tree=null;
        Object ID151_tree=null;
        Object NEWLINE152_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:294:5: ( 'event' ID NEWLINE -> ^( EVENT ID ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:294:10: 'event' ID NEWLINE
            {
            string_literal150=(Token)match(input,78,FOLLOW_78_in_eventDefinition3053); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_78.add(string_literal150);

            ID151=(Token)match(input,ID,FOLLOW_ID_in_eventDefinition3055); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID151);

            NEWLINE152=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_eventDefinition3057); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE152);



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
            // 295:10: -> ^( EVENT ID )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:295:13: ^( EVENT ID )
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
            if ( state.backtracking>0 ) { memoize(input, 30, eventDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "eventDefinition"

    public static class announcementDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "announcementDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:302:1: announcementDeclaration : 'announce' eventName= ID 'when' functionName= ID (predicateExpr= variableDeclaration )? NEWLINE -> ^( ANNOUNCEMENT $eventName $functionName ( $predicateExpr)? ) ;
    public final celluloidParser.announcementDeclaration_return announcementDeclaration() throws RecognitionException {
        celluloidParser.announcementDeclaration_return retval = new celluloidParser.announcementDeclaration_return();
        retval.start = input.LT(1);
        int announcementDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token eventName=null;
        Token functionName=null;
        Token string_literal153=null;
        Token string_literal154=null;
        Token NEWLINE155=null;
        celluloidParser.variableDeclaration_return predicateExpr = null;


        Object eventName_tree=null;
        Object functionName_tree=null;
        Object string_literal153_tree=null;
        Object string_literal154_tree=null;
        Object NEWLINE155_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:303:5: ( 'announce' eventName= ID 'when' functionName= ID (predicateExpr= variableDeclaration )? NEWLINE -> ^( ANNOUNCEMENT $eventName $functionName ( $predicateExpr)? ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:304:10: 'announce' eventName= ID 'when' functionName= ID (predicateExpr= variableDeclaration )? NEWLINE
            {
            string_literal153=(Token)match(input,79,FOLLOW_79_in_announcementDeclaration3117); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_79.add(string_literal153);

            eventName=(Token)match(input,ID,FOLLOW_ID_in_announcementDeclaration3123); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(eventName);

            string_literal154=(Token)match(input,72,FOLLOW_72_in_announcementDeclaration3125); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_72.add(string_literal154);

            functionName=(Token)match(input,ID,FOLLOW_ID_in_announcementDeclaration3131); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(functionName);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:304:61: (predicateExpr= variableDeclaration )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==TYPE||LA44_0==60) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:304:62: predicateExpr= variableDeclaration
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_announcementDeclaration3138);
                    predicateExpr=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(predicateExpr.getTree());

                    }
                    break;

            }

            NEWLINE155=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_announcementDeclaration3142); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE155);



            // AST REWRITE
            // elements: predicateExpr, eventName, functionName
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
            // 305:10: -> ^( ANNOUNCEMENT $eventName $functionName ( $predicateExpr)? )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:305:13: ^( ANNOUNCEMENT $eventName $functionName ( $predicateExpr)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ANNOUNCEMENT, "ANNOUNCEMENT"), root_1);

                adaptor.addChild(root_1, stream_eventName.nextNode());
                adaptor.addChild(root_1, stream_functionName.nextNode());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:305:53: ( $predicateExpr)?
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
            if ( state.backtracking>0 ) { memoize(input, 31, announcementDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "announcementDeclaration"

    public static class constraintBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constraintBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:310:1: constraintBlock : START (vars+= variableDeclaration | preds+= predicateHeader | funcs+= functionHeader | announcements+= announcementDeclaration )* END -> ^( CONBLOCK ( $vars)* ( $preds)* ( $funcs)* ^( ANNOUNCEMENTS ( $announcements)* ) ) ;
    public final celluloidParser.constraintBlock_return constraintBlock() throws RecognitionException {
        celluloidParser.constraintBlock_return retval = new celluloidParser.constraintBlock_return();
        retval.start = input.LT(1);
        int constraintBlock_StartIndex = input.index();
        Object root_0 = null;

        Token START156=null;
        Token END157=null;
        List list_vars=null;
        List list_preds=null;
        List list_funcs=null;
        List list_announcements=null;
        RuleReturnScope vars = null;
        RuleReturnScope preds = null;
        RuleReturnScope funcs = null;
        RuleReturnScope announcements = null;
        Object START156_tree=null;
        Object END157_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_functionHeader=new RewriteRuleSubtreeStream(adaptor,"rule functionHeader");
        RewriteRuleSubtreeStream stream_predicateHeader=new RewriteRuleSubtreeStream(adaptor,"rule predicateHeader");
        RewriteRuleSubtreeStream stream_announcementDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule announcementDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:311:5: ( START (vars+= variableDeclaration | preds+= predicateHeader | funcs+= functionHeader | announcements+= announcementDeclaration )* END -> ^( CONBLOCK ( $vars)* ( $preds)* ( $funcs)* ^( ANNOUNCEMENTS ( $announcements)* ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:311:10: START (vars+= variableDeclaration | preds+= predicateHeader | funcs+= functionHeader | announcements+= announcementDeclaration )* END
            {
            START156=(Token)match(input,START,FOLLOW_START_in_constraintBlock3191); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START156);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:312:14: (vars+= variableDeclaration | preds+= predicateHeader | funcs+= functionHeader | announcements+= announcementDeclaration )*
            loop45:
            do {
                int alt45=5;
                switch ( input.LA(1) ) {
                case TYPE:
                case 60:
                    {
                    alt45=1;
                    }
                    break;
                case 76:
                    {
                    alt45=2;
                    }
                    break;
                case 75:
                    {
                    alt45=3;
                    }
                    break;
                case 79:
                    {
                    alt45=4;
                    }
                    break;

                }

                switch (alt45) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:312:15: vars+= variableDeclaration
            	    {
            	    pushFollow(FOLLOW_variableDeclaration_in_constraintBlock3212);
            	    vars=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclaration.add(vars.getTree());
            	    if (list_vars==null) list_vars=new ArrayList();
            	    list_vars.add(vars.getTree());


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:312:45: preds+= predicateHeader
            	    {
            	    pushFollow(FOLLOW_predicateHeader_in_constraintBlock3220);
            	    preds=predicateHeader();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_predicateHeader.add(preds.getTree());
            	    if (list_preds==null) list_preds=new ArrayList();
            	    list_preds.add(preds.getTree());


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:312:72: funcs+= functionHeader
            	    {
            	    pushFollow(FOLLOW_functionHeader_in_constraintBlock3228);
            	    funcs=functionHeader();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_functionHeader.add(funcs.getTree());
            	    if (list_funcs==null) list_funcs=new ArrayList();
            	    list_funcs.add(funcs.getTree());


            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:312:98: announcements+= announcementDeclaration
            	    {
            	    pushFollow(FOLLOW_announcementDeclaration_in_constraintBlock3236);
            	    announcements=announcementDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_announcementDeclaration.add(announcements.getTree());
            	    if (list_announcements==null) list_announcements=new ArrayList();
            	    list_announcements.add(announcements.getTree());


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            END157=(Token)match(input,END,FOLLOW_END_in_constraintBlock3249); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END157);



            // AST REWRITE
            // elements: announcements, funcs, preds, vars
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: vars, funcs, announcements, preds
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"token vars",list_vars);
            RewriteRuleSubtreeStream stream_funcs=new RewriteRuleSubtreeStream(adaptor,"token funcs",list_funcs);
            RewriteRuleSubtreeStream stream_announcements=new RewriteRuleSubtreeStream(adaptor,"token announcements",list_announcements);
            RewriteRuleSubtreeStream stream_preds=new RewriteRuleSubtreeStream(adaptor,"token preds",list_preds);
            root_0 = (Object)adaptor.nil();
            // 314:10: -> ^( CONBLOCK ( $vars)* ( $preds)* ( $funcs)* ^( ANNOUNCEMENTS ( $announcements)* ) )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:314:13: ^( CONBLOCK ( $vars)* ( $preds)* ( $funcs)* ^( ANNOUNCEMENTS ( $announcements)* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONBLOCK, "CONBLOCK"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:314:24: ( $vars)*
                while ( stream_vars.hasNext() ) {
                    adaptor.addChild(root_1, stream_vars.nextTree());

                }
                stream_vars.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:314:31: ( $preds)*
                while ( stream_preds.hasNext() ) {
                    adaptor.addChild(root_1, stream_preds.nextTree());

                }
                stream_preds.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:314:39: ( $funcs)*
                while ( stream_funcs.hasNext() ) {
                    adaptor.addChild(root_1, stream_funcs.nextTree());

                }
                stream_funcs.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:314:47: ^( ANNOUNCEMENTS ( $announcements)* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ANNOUNCEMENTS, "ANNOUNCEMENTS"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:314:63: ( $announcements)*
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
            if ( state.backtracking>0 ) { memoize(input, 32, constraintBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constraintBlock"

    public static class constraintDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constraintDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:317:1: constraintDefinition : 'constraint' ID ( 'requires' requires= idList )? ( 'announces' announces= idList )? constraintBlock -> ^( CONSTRAINT ID ^( REQUIRES ( $requires)? ) ^( ANNOUNCES ( $announces)? ) constraintBlock ) ;
    public final celluloidParser.constraintDefinition_return constraintDefinition() throws RecognitionException {
        celluloidParser.constraintDefinition_return retval = new celluloidParser.constraintDefinition_return();
        retval.start = input.LT(1);
        int constraintDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal158=null;
        Token ID159=null;
        Token string_literal160=null;
        Token string_literal161=null;
        celluloidParser.idList_return requires = null;

        celluloidParser.idList_return announces = null;

        celluloidParser.constraintBlock_return constraintBlock162 = null;


        Object string_literal158_tree=null;
        Object ID159_tree=null;
        Object string_literal160_tree=null;
        Object string_literal161_tree=null;
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_constraintBlock=new RewriteRuleSubtreeStream(adaptor,"rule constraintBlock");
        RewriteRuleSubtreeStream stream_idList=new RewriteRuleSubtreeStream(adaptor,"rule idList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:318:5: ( 'constraint' ID ( 'requires' requires= idList )? ( 'announces' announces= idList )? constraintBlock -> ^( CONSTRAINT ID ^( REQUIRES ( $requires)? ) ^( ANNOUNCES ( $announces)? ) constraintBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:318:10: 'constraint' ID ( 'requires' requires= idList )? ( 'announces' announces= idList )? constraintBlock
            {
            string_literal158=(Token)match(input,80,FOLLOW_80_in_constraintDefinition3311); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_80.add(string_literal158);

            ID159=(Token)match(input,ID,FOLLOW_ID_in_constraintDefinition3313); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID159);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:318:26: ( 'requires' requires= idList )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==81) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:318:27: 'requires' requires= idList
                    {
                    string_literal160=(Token)match(input,81,FOLLOW_81_in_constraintDefinition3316); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_81.add(string_literal160);

                    pushFollow(FOLLOW_idList_in_constraintDefinition3322);
                    requires=idList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_idList.add(requires.getTree());

                    }
                    break;

            }

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:319:10: ( 'announces' announces= idList )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==82) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:319:11: 'announces' announces= idList
                    {
                    string_literal161=(Token)match(input,82,FOLLOW_82_in_constraintDefinition3336); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_82.add(string_literal161);

                    pushFollow(FOLLOW_idList_in_constraintDefinition3342);
                    announces=idList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_idList.add(announces.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_constraintBlock_in_constraintDefinition3356);
            constraintBlock162=constraintBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_constraintBlock.add(constraintBlock162.getTree());


            // AST REWRITE
            // elements: requires, ID, announces, constraintBlock
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
            // 321:10: -> ^( CONSTRAINT ID ^( REQUIRES ( $requires)? ) ^( ANNOUNCES ( $announces)? ) constraintBlock )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:321:13: ^( CONSTRAINT ID ^( REQUIRES ( $requires)? ) ^( ANNOUNCES ( $announces)? ) constraintBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINT, "CONSTRAINT"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:321:29: ^( REQUIRES ( $requires)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(REQUIRES, "REQUIRES"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:321:40: ( $requires)?
                if ( stream_requires.hasNext() ) {
                    adaptor.addChild(root_2, stream_requires.nextTree());

                }
                stream_requires.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:321:52: ^( ANNOUNCES ( $announces)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ANNOUNCES, "ANNOUNCES"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:321:64: ( $announces)?
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
            if ( state.backtracking>0 ) { memoize(input, 33, constraintDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constraintDefinition"

    public static class deviceBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "deviceBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:327:1: deviceBlock : START (vars+= variableDeclaration | preds+= predicateDefinition | funcs+= functionDefinition )* END -> ^( DEVBLOCK ( $vars)* ( $preds)* ( $funcs)* ) ;
    public final celluloidParser.deviceBlock_return deviceBlock() throws RecognitionException {
        celluloidParser.deviceBlock_return retval = new celluloidParser.deviceBlock_return();
        retval.start = input.LT(1);
        int deviceBlock_StartIndex = input.index();
        Object root_0 = null;

        Token START163=null;
        Token END164=null;
        List list_vars=null;
        List list_preds=null;
        List list_funcs=null;
        RuleReturnScope vars = null;
        RuleReturnScope preds = null;
        RuleReturnScope funcs = null;
        Object START163_tree=null;
        Object END164_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_functionDefinition=new RewriteRuleSubtreeStream(adaptor,"rule functionDefinition");
        RewriteRuleSubtreeStream stream_predicateDefinition=new RewriteRuleSubtreeStream(adaptor,"rule predicateDefinition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:328:5: ( START (vars+= variableDeclaration | preds+= predicateDefinition | funcs+= functionDefinition )* END -> ^( DEVBLOCK ( $vars)* ( $preds)* ( $funcs)* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:328:10: START (vars+= variableDeclaration | preds+= predicateDefinition | funcs+= functionDefinition )* END
            {
            START163=(Token)match(input,START,FOLLOW_START_in_deviceBlock3445); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START163);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:329:14: (vars+= variableDeclaration | preds+= predicateDefinition | funcs+= functionDefinition )*
            loop48:
            do {
                int alt48=4;
                switch ( input.LA(1) ) {
                case TYPE:
                case 60:
                    {
                    alt48=1;
                    }
                    break;
                case 76:
                    {
                    alt48=2;
                    }
                    break;
                case 75:
                    {
                    alt48=3;
                    }
                    break;

                }

                switch (alt48) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:329:15: vars+= variableDeclaration
            	    {
            	    pushFollow(FOLLOW_variableDeclaration_in_deviceBlock3466);
            	    vars=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclaration.add(vars.getTree());
            	    if (list_vars==null) list_vars=new ArrayList();
            	    list_vars.add(vars.getTree());


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:329:45: preds+= predicateDefinition
            	    {
            	    pushFollow(FOLLOW_predicateDefinition_in_deviceBlock3474);
            	    preds=predicateDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_predicateDefinition.add(preds.getTree());
            	    if (list_preds==null) list_preds=new ArrayList();
            	    list_preds.add(preds.getTree());


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:329:76: funcs+= functionDefinition
            	    {
            	    pushFollow(FOLLOW_functionDefinition_in_deviceBlock3482);
            	    funcs=functionDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_functionDefinition.add(funcs.getTree());
            	    if (list_funcs==null) list_funcs=new ArrayList();
            	    list_funcs.add(funcs.getTree());


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            END164=(Token)match(input,END,FOLLOW_END_in_deviceBlock3496); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END164);



            // AST REWRITE
            // elements: preds, funcs, vars
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: vars, funcs, preds
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"token vars",list_vars);
            RewriteRuleSubtreeStream stream_funcs=new RewriteRuleSubtreeStream(adaptor,"token funcs",list_funcs);
            RewriteRuleSubtreeStream stream_preds=new RewriteRuleSubtreeStream(adaptor,"token preds",list_preds);
            root_0 = (Object)adaptor.nil();
            // 331:10: -> ^( DEVBLOCK ( $vars)* ( $preds)* ( $funcs)* )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:331:13: ^( DEVBLOCK ( $vars)* ( $preds)* ( $funcs)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEVBLOCK, "DEVBLOCK"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:331:24: ( $vars)*
                while ( stream_vars.hasNext() ) {
                    adaptor.addChild(root_1, stream_vars.nextTree());

                }
                stream_vars.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:331:31: ( $preds)*
                while ( stream_preds.hasNext() ) {
                    adaptor.addChild(root_1, stream_preds.nextTree());

                }
                stream_preds.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:331:39: ( $funcs)*
                while ( stream_funcs.hasNext() ) {
                    adaptor.addChild(root_1, stream_funcs.nextTree());

                }
                stream_funcs.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 34, deviceBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "deviceBlock"

    public static class deviceDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "deviceDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:333:1: deviceDefinition : 'device' ID ( 'accepts' accepts= idList )? deviceBlock -> ^( DEVICE ID ^( ACCEPTS ( $accepts)? ) deviceBlock ) ;
    public final celluloidParser.deviceDefinition_return deviceDefinition() throws RecognitionException {
        celluloidParser.deviceDefinition_return retval = new celluloidParser.deviceDefinition_return();
        retval.start = input.LT(1);
        int deviceDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal165=null;
        Token ID166=null;
        Token string_literal167=null;
        celluloidParser.idList_return accepts = null;

        celluloidParser.deviceBlock_return deviceBlock168 = null;


        Object string_literal165_tree=null;
        Object ID166_tree=null;
        Object string_literal167_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_idList=new RewriteRuleSubtreeStream(adaptor,"rule idList");
        RewriteRuleSubtreeStream stream_deviceBlock=new RewriteRuleSubtreeStream(adaptor,"rule deviceBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:334:5: ( 'device' ID ( 'accepts' accepts= idList )? deviceBlock -> ^( DEVICE ID ^( ACCEPTS ( $accepts)? ) deviceBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:334:10: 'device' ID ( 'accepts' accepts= idList )? deviceBlock
            {
            string_literal165=(Token)match(input,83,FOLLOW_83_in_deviceDefinition3548); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_83.add(string_literal165);

            ID166=(Token)match(input,ID,FOLLOW_ID_in_deviceDefinition3550); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID166);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:334:22: ( 'accepts' accepts= idList )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==84) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:334:23: 'accepts' accepts= idList
                    {
                    string_literal167=(Token)match(input,84,FOLLOW_84_in_deviceDefinition3553); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_84.add(string_literal167);

                    pushFollow(FOLLOW_idList_in_deviceDefinition3559);
                    accepts=idList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_idList.add(accepts.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_deviceBlock_in_deviceDefinition3563);
            deviceBlock168=deviceBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_deviceBlock.add(deviceBlock168.getTree());


            // AST REWRITE
            // elements: ID, deviceBlock, accepts
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
            // 335:10: -> ^( DEVICE ID ^( ACCEPTS ( $accepts)? ) deviceBlock )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:335:13: ^( DEVICE ID ^( ACCEPTS ( $accepts)? ) deviceBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEVICE, "DEVICE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:335:25: ^( ACCEPTS ( $accepts)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ACCEPTS, "ACCEPTS"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:335:35: ( $accepts)?
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
            if ( state.backtracking>0 ) { memoize(input, 35, deviceDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "deviceDefinition"

    // $ANTLR start synpred1_celluloid
    public final void synpred1_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:107:11: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:107:11: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred1_celluloid881); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_celluloid

    // $ANTLR start synpred4_celluloid
    public final void synpred4_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:112:11: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:112:11: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred4_celluloid969); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_celluloid

    // $ANTLR start synpred5_celluloid
    public final void synpred5_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:123:11: ( logicalORExpression )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:123:11: logicalORExpression
        {
        pushFollow(FOLLOW_logicalORExpression_in_synpred5_celluloid1110);
        logicalORExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_celluloid

    // $ANTLR start synpred30_celluloid
    public final void synpred30_celluloid_fragment() throws RecognitionException {   
        Token statements=null;
        List list_statements=null;

        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:25: (statements+= ( ( assignmentExpression | ifStatement | whenStatement | everyStatement | constraintFunctionCall ) NEWLINE ) )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:25: statements+= ( ( assignmentExpression | ifStatement | whenStatement | everyStatement | constraintFunctionCall ) NEWLINE )
        {
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:28: ( ( assignmentExpression | ifStatement | whenStatement | everyStatement | constraintFunctionCall ) NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:29: ( assignmentExpression | ifStatement | whenStatement | everyStatement | constraintFunctionCall ) NEWLINE
        {
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:29: ( assignmentExpression | ifStatement | whenStatement | everyStatement | constraintFunctionCall )
        int alt55=5;
        switch ( input.LA(1) ) {
        case LITERAL:
        case 62:
        case 65:
            {
            alt55=1;
            }
            break;
        case ID:
            {
            int LA55_2 = input.LA(2);

            if ( (LA55_2==NEWLINE||(LA55_2>=ASSIGNMENT_OPERATOR && LA55_2<=MULTIPLICATIVE_OPERATOR)||(LA55_2>=63 && LA55_2<=64)||LA55_2==66) ) {
                alt55=1;
            }
            else if ( (LA55_2==ID) ) {
                alt55=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 2, input);

                throw nvae;
            }
            }
            break;
        case 69:
            {
            alt55=2;
            }
            break;
        case 72:
        case 73:
            {
            alt55=3;
            }
            break;
        case 74:
            {
            alt55=4;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 55, 0, input);

            throw nvae;
        }

        switch (alt55) {
            case 1 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:30: assignmentExpression
                {
                pushFollow(FOLLOW_assignmentExpression_in_synpred30_celluloid1712);
                assignmentExpression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:53: ifStatement
                {
                pushFollow(FOLLOW_ifStatement_in_synpred30_celluloid1716);
                ifStatement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:67: whenStatement
                {
                pushFollow(FOLLOW_whenStatement_in_synpred30_celluloid1720);
                whenStatement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 4 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:83: everyStatement
                {
                pushFollow(FOLLOW_everyStatement_in_synpred30_celluloid1724);
                everyStatement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 5 :
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:186:100: constraintFunctionCall
                {
                pushFollow(FOLLOW_constraintFunctionCall_in_synpred30_celluloid1728);
                constraintFunctionCall();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred30_celluloid1731); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred30_celluloid

    // $ANTLR start synpred53_celluloid
    public final void synpred53_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:239:36: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:239:36: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred53_celluloid2443); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_celluloid

    // $ANTLR start synpred55_celluloid
    public final void synpred55_celluloid_fragment() throws RecognitionException {   
        List list_calls=null;
        RuleReturnScope calls = null;
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:252:44: (calls+= functionPredicateCall )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:252:44: calls+= functionPredicateCall
        {
        pushFollow(FOLLOW_functionPredicateCall_in_synpred55_celluloid2582);
        calls=functionPredicateCall();

        state._fsp--;
        if (state.failed) return ;
        if (list_calls==null) list_calls=new ArrayList();
        list_calls.add(calls);


        }
    }
    // $ANTLR end synpred55_celluloid

    // $ANTLR start synpred56_celluloid
    public final void synpred56_celluloid_fragment() throws RecognitionException {   
        Token exps=null;
        List list_exps=null;

        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:252:77: (exps+= ( assignmentExpression NEWLINE ) )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:252:77: exps+= ( assignmentExpression NEWLINE )
        {
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:252:85: ( assignmentExpression NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:252:86: assignmentExpression NEWLINE
        {
        pushFollow(FOLLOW_assignmentExpression_in_synpred56_celluloid2591);
        assignmentExpression();

        state._fsp--;
        if (state.failed) return ;
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred56_celluloid2593); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred56_celluloid

    // $ANTLR start synpred58_celluloid
    public final void synpred58_celluloid_fragment() throws RecognitionException {   
        List list_calls=null;
        RuleReturnScope calls = null;
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:281:44: (calls+= functionPredicateCall )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:281:44: calls+= functionPredicateCall
        {
        pushFollow(FOLLOW_functionPredicateCall_in_synpred58_celluloid2923);
        calls=functionPredicateCall();

        state._fsp--;
        if (state.failed) return ;
        if (list_calls==null) list_calls=new ArrayList();
        list_calls.add(calls);


        }
    }
    // $ANTLR end synpred58_celluloid

    // $ANTLR start synpred59_celluloid
    public final void synpred59_celluloid_fragment() throws RecognitionException {   
        Token exps=null;
        List list_exps=null;

        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:281:77: (exps+= ( assignmentExpression NEWLINE ) )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:281:77: exps+= ( assignmentExpression NEWLINE )
        {
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:281:85: ( assignmentExpression NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:281:86: assignmentExpression NEWLINE
        {
        pushFollow(FOLLOW_assignmentExpression_in_synpred59_celluloid2932);
        assignmentExpression();

        state._fsp--;
        if (state.failed) return ;
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred59_celluloid2934); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred59_celluloid

    // Delegated rules

    public final boolean synpred55_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_celluloid_fragment(); // can never throw exception
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
    public final boolean synpred56_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_celluloid_fragment(); // can never throw exception
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
    public final boolean synpred1_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_celluloid_fragment(); // can never throw exception
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
    public final boolean synpred5_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA24_eotS =
        "\13\uffff";
    static final String DFA24_eofS =
        "\13\uffff";
    static final String DFA24_minS =
        "\1\45\1\uffff\10\0\1\uffff";
    static final String DFA24_maxS =
        "\1\112\1\uffff\10\0\1\uffff";
    static final String DFA24_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA24_specialS =
        "\2\uffff\1\1\1\3\1\4\1\6\1\2\1\5\1\7\1\0\1\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1\1\3\22\uffff\1\5\4\uffff\1\2\2\uffff\1\4\3\uffff\1\6\2"+
            "\uffff\1\7\1\10\1\11",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "()+ loopback of 186:25: (statements+= ( ( assignmentExpression | ifStatement | whenStatement | everyStatement | constraintFunctionCall ) NEWLINE ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_9 = input.LA(1);

                         
                        int index24_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_celluloid()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index24_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_2 = input.LA(1);

                         
                        int index24_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_celluloid()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index24_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_6 = input.LA(1);

                         
                        int index24_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_celluloid()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index24_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA24_3 = input.LA(1);

                         
                        int index24_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_celluloid()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index24_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA24_4 = input.LA(1);

                         
                        int index24_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_celluloid()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index24_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA24_7 = input.LA(1);

                         
                        int index24_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_celluloid()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index24_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA24_5 = input.LA(1);

                         
                        int index24_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_celluloid()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index24_5);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA24_8 = input.LA(1);

                         
                        int index24_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_celluloid()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index24_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_58_in_language_block_decl259 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LANGUAGE_in_language_block_decl261 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_START_in_language_block_decl263 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_language_block_in_language_block_decl265 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_END_in_language_block_decl267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_language_block297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_variableDeclaration866 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_variableDeclaration868 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_variableDeclaration881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_variableDeclaration951 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_variableDeclaration953 = new BitSet(new long[]{0x2000008000000002L});
    public static final BitSet FOLLOW_initializer_in_variableDeclaration955 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_variableDeclaration969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_initializer1051 = new BitSet(new long[]{0x4200004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_initializer1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_assignmentExpression1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_assignmentExpression1122 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ASSIGNMENT_OPERATOR_in_assignmentExpression1124 = new BitSet(new long[]{0x4200004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_logicalORExpression1177 = new BitSet(new long[]{0x4200004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression1180 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_logicalORExpression1183 = new BitSet(new long[]{0x4200004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalANDExpression1207 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_logicalANDExpression1210 = new BitSet(new long[]{0x4200004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalANDExpression1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1239 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_EQUALITY_OPERATOR_in_equalityExpression1242 = new BitSet(new long[]{0x4200004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_equalityExpression1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1268 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_RELATIONAL_OPERATOR_in_relationalExpression1271 = new BitSet(new long[]{0x4200004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_relationalExpression1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1298 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ADDITIVE_OPERATOR_in_additiveExpression1301 = new BitSet(new long[]{0x4200004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_additiveExpression1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_multiplicativeExpression1316 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_MULTIPLICATIVE_OPERATOR_in_multiplicativeExpression1319 = new BitSet(new long[]{0x4200004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_multiplicativeExpression1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primaryExpression1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_primaryExpression1339 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_primaryExpression1341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_primaryExpression1343 = new BitSet(new long[]{0x4200004000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_expressionList_in_primaryExpression1345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_primaryExpression1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_in_primaryExpression1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionPredicateCall_in_primaryExpression1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idList1385 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_idList1388 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_idList1394 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_66_in_idList1422 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_idList1428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_68_in_idList1431 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_idList1437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_idList1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1482 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_variableList1485 = new BitSet(new long[]{0x1000000400000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1491 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_66_in_variableList1529 = new BitSet(new long[]{0x1000000400000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_68_in_variableList1538 = new BitSet(new long[]{0x1000000400000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_variableList1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1597 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_expressionList1600 = new BitSet(new long[]{0x4200004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1606 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_66_in_expressionList1629 = new BitSet(new long[]{0x4200004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_68_in_expressionList1638 = new BitSet(new long[]{0x4200004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_expressionList1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_inStatement1679 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_inStatement1681 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_START_in_inStatement1691 = new BitSet(new long[]{0x4200006000000000L,0x0000000000000722L});
    public static final BitSet FOLLOW_assignmentExpression_in_inStatement1712 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ifStatement_in_inStatement1716 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_whenStatement_in_inStatement1720 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_everyStatement_in_inStatement1724 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_constraintFunctionCall_in_inStatement1728 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_inStatement1731 = new BitSet(new long[]{0x4200006000000000L,0x0000000000000722L});
    public static final BitSet FOLLOW_END_in_inStatement1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ifStatement1788 = new BitSet(new long[]{0x4200004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_ifStatement1794 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_START_in_ifStatement1804 = new BitSet(new long[]{0x4600004000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_assignmentExpression_in_ifStatement1824 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_inStatement_in_ifStatement1828 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ifStatement_in_ifStatement1832 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_ifStatement1835 = new BitSet(new long[]{0x4600006000000000L,0x00000000000000E2L});
    public static final BitSet FOLLOW_elseIfStatement_in_ifStatement1857 = new BitSet(new long[]{0x0000002000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_elseStatement_in_ifStatement1873 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_END_in_ifStatement1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_elseIfStatement1948 = new BitSet(new long[]{0x4200004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_elseIfStatement1955 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_elseIfStatement1957 = new BitSet(new long[]{0x4600004000000002L,0x0000000000000022L});
    public static final BitSet FOLLOW_assignmentExpression_in_elseIfStatement1980 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_inStatement_in_elseIfStatement1984 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ifStatement_in_elseIfStatement1988 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_elseIfStatement1991 = new BitSet(new long[]{0x4600004000000002L,0x0000000000000022L});
    public static final BitSet FOLLOW_71_in_elseStatement2035 = new BitSet(new long[]{0x4600004000000002L,0x0000000000000022L});
    public static final BitSet FOLLOW_assignmentExpression_in_elseStatement2043 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_inStatement_in_elseStatement2047 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ifStatement_in_elseStatement2051 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_elseStatement2054 = new BitSet(new long[]{0x4600004000000002L,0x0000000000000022L});
    public static final BitSet FOLLOW_72_in_whenStatement2099 = new BitSet(new long[]{0x4200004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_whenStatement2103 = new BitSet(new long[]{0x4200004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_whenStatement2106 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_START_in_whenStatement2116 = new BitSet(new long[]{0x4200004000000000L,0x0000000000000722L});
    public static final BitSet FOLLOW_assignmentExpression_in_whenStatement2125 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_constraintFunctionCall_in_whenStatement2129 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ifStatement_in_whenStatement2133 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_whenStatement2136 = new BitSet(new long[]{0x4200006000000000L,0x0000000000000722L});
    public static final BitSet FOLLOW_END_in_whenStatement2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_everyStatement2232 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_TIME_in_everyStatement2234 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_72_in_everyStatement2242 = new BitSet(new long[]{0x4200004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_everyStatement2246 = new BitSet(new long[]{0x4200004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_everyStatement2249 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_START_in_everyStatement2261 = new BitSet(new long[]{0x4200006000000000L,0x0000000000000722L});
    public static final BitSet FOLLOW_assignmentExpression_in_everyStatement2282 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_constraintFunctionCall_in_everyStatement2286 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ifStatement_in_everyStatement2290 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_everyStatement2293 = new BitSet(new long[]{0x4200006000000000L,0x0000000000000722L});
    public static final BitSet FOLLOW_END_in_everyStatement2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_constraintFunctionCall2398 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_constraintFunctionCall2400 = new BitSet(new long[]{0x4200004000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_expressionList_in_constraintFunctionCall2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_functionPredicateCall2435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_functionPredicateCall2437 = new BitSet(new long[]{0x4200004000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_expressionList_in_functionPredicateCall2439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_functionPredicateCall2441 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_functionPredicateCall2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_functionHeader2500 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_functionHeader2502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_functionHeader2504 = new BitSet(new long[]{0x1000000400000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_variableList_in_functionHeader2506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_functionHeader2508 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_functionHeader2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_functionBlock2554 = new BitSet(new long[]{0x5200006400000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_functionBlock2574 = new BitSet(new long[]{0x5200006400000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_functionPredicateCall_in_functionBlock2582 = new BitSet(new long[]{0x5200006400000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_functionBlock2591 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_functionBlock2593 = new BitSet(new long[]{0x5200006400000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_functionBlock2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_functionDefinition2691 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_functionDefinition2693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_functionDefinition2695 = new BitSet(new long[]{0x1000000400000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_variableList_in_functionDefinition2697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_functionDefinition2699 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_functionBlock_in_functionDefinition2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_predicateHeader2761 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_predicateHeader2763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_predicateHeader2765 = new BitSet(new long[]{0x1000000400000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_variableList_in_predicateHeader2767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_predicateHeader2769 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_predicateHeader2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_predicateDefinition2822 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_predicateDefinition2824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_predicateDefinition2826 = new BitSet(new long[]{0x1000000400000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_variableList_in_predicateDefinition2828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_predicateDefinition2830 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_predicateBlock_in_predicateDefinition2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_predicateBlock2896 = new BitSet(new long[]{0x5200004400000000L,0x0000000000002002L});
    public static final BitSet FOLLOW_variableDeclaration_in_predicateBlock2915 = new BitSet(new long[]{0x5200004400000000L,0x0000000000002002L});
    public static final BitSet FOLLOW_functionPredicateCall_in_predicateBlock2923 = new BitSet(new long[]{0x5200004400000000L,0x0000000000002002L});
    public static final BitSet FOLLOW_assignmentExpression_in_predicateBlock2932 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_predicateBlock2934 = new BitSet(new long[]{0x5200004400000000L,0x0000000000002002L});
    public static final BitSet FOLLOW_77_in_predicateBlock2951 = new BitSet(new long[]{0x4200004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_predicateBlock2957 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_predicateBlock2959 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_END_in_predicateBlock2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_eventDefinition3053 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_eventDefinition3055 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_eventDefinition3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_announcementDeclaration3117 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_announcementDeclaration3123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_announcementDeclaration3125 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_announcementDeclaration3131 = new BitSet(new long[]{0x1000008400000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_announcementDeclaration3138 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_announcementDeclaration3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_constraintBlock3191 = new BitSet(new long[]{0x1000002400000000L,0x0000000000009800L});
    public static final BitSet FOLLOW_variableDeclaration_in_constraintBlock3212 = new BitSet(new long[]{0x1000002400000000L,0x0000000000009800L});
    public static final BitSet FOLLOW_predicateHeader_in_constraintBlock3220 = new BitSet(new long[]{0x1000002400000000L,0x0000000000009800L});
    public static final BitSet FOLLOW_functionHeader_in_constraintBlock3228 = new BitSet(new long[]{0x1000002400000000L,0x0000000000009800L});
    public static final BitSet FOLLOW_announcementDeclaration_in_constraintBlock3236 = new BitSet(new long[]{0x1000002400000000L,0x0000000000009800L});
    public static final BitSet FOLLOW_END_in_constraintBlock3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_constraintDefinition3311 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_constraintDefinition3313 = new BitSet(new long[]{0x0000001000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_81_in_constraintDefinition3316 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_idList_in_constraintDefinition3322 = new BitSet(new long[]{0x0000001000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_82_in_constraintDefinition3336 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_idList_in_constraintDefinition3342 = new BitSet(new long[]{0x0000001000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_constraintBlock_in_constraintDefinition3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_deviceBlock3445 = new BitSet(new long[]{0x1000002400000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_variableDeclaration_in_deviceBlock3466 = new BitSet(new long[]{0x1000002400000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_predicateDefinition_in_deviceBlock3474 = new BitSet(new long[]{0x1000002400000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_functionDefinition_in_deviceBlock3482 = new BitSet(new long[]{0x1000002400000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_END_in_deviceBlock3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_deviceDefinition3548 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_deviceDefinition3550 = new BitSet(new long[]{0x0000001000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_deviceDefinition3553 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_idList_in_deviceDefinition3559 = new BitSet(new long[]{0x0000001000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_deviceBlock_in_deviceDefinition3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred1_celluloid881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred4_celluloid969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_synpred5_celluloid1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_synpred30_celluloid1712 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ifStatement_in_synpred30_celluloid1716 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_whenStatement_in_synpred30_celluloid1720 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_everyStatement_in_synpred30_celluloid1724 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_constraintFunctionCall_in_synpred30_celluloid1728 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred30_celluloid1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred53_celluloid2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionPredicateCall_in_synpred55_celluloid2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_synpred56_celluloid2591 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred56_celluloid2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionPredicateCall_in_synpred58_celluloid2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_synpred59_celluloid2932 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred59_celluloid2934 = new BitSet(new long[]{0x0000000000000002L});

}