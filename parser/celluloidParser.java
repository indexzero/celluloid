// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g 2009-12-16 18:13:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class celluloidParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VARDEF", "FUNC", "PRED", "ARG", "ARGS", "CALL", "IF", "ELSEIF", "ELSE", "LISTENER", "EVERY", "COND", "RETURN", "IN", "WHEN", "INBLOCK", "LISTENBLOCK", "IFBLOCK", "FUNBLOCK", "CONBLOCK", "DEVBLOCK", "FUNHEAD", "PREDHEAD", "EVENT", "CONSTRAINT", "REQUIRES", "ANNOUNCES", "ANNOUNCEMENT", "ANNOUNCEMENTS", "DEVICE", "ACCEPTS", "BOOL", "TYPE", "LANGUAGE", "START", "END", "ID", "NEWLINE", "WS", "COMMENT", "EXPONENT", "NUMBER", "SECOND", "MINUTE", "HOUR", "DAY", "TIME", "ESCAPE", "STRING", "CHAR", "ASSIGNMENT_OPERATOR", "EQUALITY_OPERATOR", "RELATIONAL_OPERATOR", "ADDITIVE_OPERATOR", "MULTIPLICATIVE_OPERATOR", "LITERAL", "'in'", "'*'", "'timeline'", "'='", "'not'", "'or'", "'and'", "'new'", "'('", "')'", "','", "'if'", "'else if'", "'else'", "'when'", "'unless'", "'every'", "'function'", "'predicate'", "'return'", "'event'", "'announce'", "'constraint'", "'requires'", "'announces'", "'device'", "'accepts'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int EXPONENT=44;
    public static final int LISTENBLOCK=20;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int CHAR=53;
    public static final int DAY=49;
    public static final int ID=40;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
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
    public static final int NUMBER=45;
    public static final int BOOL=35;
    public static final int EVERY=14;
    public static final int LITERAL=59;
    public static final int ADDITIVE_OPERATOR=57;
    public static final int HOUR=48;
    public static final int EVENT=27;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__86=86;
    public static final int RELATIONAL_OPERATOR=56;
    public static final int ELSEIF=11;
    public static final int WS=42;
    public static final int LANGUAGE=37;
    public static final int T__71=71;
    public static final int REQUIRES=29;
    public static final int T__72=72;
    public static final int NEWLINE=41;
    public static final int T__70=70;
    public static final int PREDHEAD=26;
    public static final int WHEN=18;
    public static final int FUNC=5;
    public static final int ASSIGNMENT_OPERATOR=54;
    public static final int START=38;
    public static final int INBLOCK=19;
    public static final int ANNOUNCES=30;
    public static final int CALL=9;
    public static final int MINUTE=47;
    public static final int END=39;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int COND=15;
    public static final int CONSTRAINT=28;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int DEVBLOCK=24;
    public static final int T__79=79;
    public static final int STRING=52;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public celluloidParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public celluloidParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[104+1];
             
             
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:58:1: language_block_decl : 'in' LANGUAGE START language_block END ;
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:58:21: ( 'in' LANGUAGE START language_block END )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:58:23: 'in' LANGUAGE START language_block END
            {
            root_0 = (Object)adaptor.nil();

            string_literal1=(Token)match(input,60,FOLLOW_60_in_language_block_decl281); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal1_tree = (Object)adaptor.create(string_literal1);
            adaptor.addChild(root_0, string_literal1_tree);
            }
            LANGUAGE2=(Token)match(input,LANGUAGE,FOLLOW_LANGUAGE_in_language_block_decl283); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LANGUAGE2_tree = (Object)adaptor.create(LANGUAGE2);
            adaptor.addChild(root_0, LANGUAGE2_tree);
            }
            START3=(Token)match(input,START,FOLLOW_START_in_language_block_decl285); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            START3_tree = (Object)adaptor.create(START3);
            adaptor.addChild(root_0, START3_tree);
            }
            pushFollow(FOLLOW_language_block_in_language_block_decl287);
            language_block4=language_block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, language_block4.getTree());
            END5=(Token)match(input,END,FOLLOW_END_in_language_block_decl289); if (state.failed) return retval;
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:60:1: language_block : '*' ;
    public final celluloidParser.language_block_return language_block() throws RecognitionException {
        celluloidParser.language_block_return retval = new celluloidParser.language_block_return();
        retval.start = input.LT(1);
        int language_block_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal6=null;

        Object char_literal6_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:60:21: ( '*' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:60:23: '*'
            {
            root_0 = (Object)adaptor.nil();

            char_literal6=(Token)match(input,61,FOLLOW_61_in_language_block319); if (state.failed) return retval;
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:113:1: variableDeclaration : ( 'timeline' ID ( NEWLINE -> ^( VARDEF 'timeline' ID ) | -> ^( ARG 'timeline' ID ) ) | TYPE ID ( initializer )? ( NEWLINE -> ^( VARDEF TYPE ID ( initializer )? ) | -> ^( ARG TYPE ID ) ) );
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
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:114:5: ( 'timeline' ID ( NEWLINE -> ^( VARDEF 'timeline' ID ) | -> ^( ARG 'timeline' ID ) ) | TYPE ID ( initializer )? ( NEWLINE -> ^( VARDEF TYPE ID ( initializer )? ) | -> ^( ARG TYPE ID ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==62) ) {
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:114:10: 'timeline' ID ( NEWLINE -> ^( VARDEF 'timeline' ID ) | -> ^( ARG 'timeline' ID ) )
                    {
                    string_literal7=(Token)match(input,62,FOLLOW_62_in_variableDeclaration893); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_62.add(string_literal7);

                    ID8=(Token)match(input,ID,FOLLOW_ID_in_variableDeclaration895); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID8);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:115:10: ( NEWLINE -> ^( VARDEF 'timeline' ID ) | -> ^( ARG 'timeline' ID ) )
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
                    else if ( (LA1_0==EOF||LA1_0==TYPE||(LA1_0>=END && LA1_0<=ID)||LA1_0==LITERAL||LA1_0==62||LA1_0==64||LA1_0==67||(LA1_0>=69 && LA1_0<=70)||(LA1_0>=77 && LA1_0<=79)||LA1_0==81) ) {
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
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:115:11: NEWLINE
                            {
                            NEWLINE9=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_variableDeclaration908); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE9);



                            // AST REWRITE
                            // elements: 62, ID
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 115:19: -> ^( VARDEF 'timeline' ID )
                            {
                                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:115:22: ^( VARDEF 'timeline' ID )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDEF, "VARDEF"), root_1);

                                adaptor.addChild(root_1, stream_62.nextNode());
                                adaptor.addChild(root_1, stream_ID.nextNode());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:116:19: 
                            {

                            // AST REWRITE
                            // elements: 62, ID
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 116:19: -> ^( ARG 'timeline' ID )
                            {
                                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:116:22: ^( ARG 'timeline' ID )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARG, "ARG"), root_1);

                                adaptor.addChild(root_1, stream_62.nextNode());
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:119:10: TYPE ID ( initializer )? ( NEWLINE -> ^( VARDEF TYPE ID ( initializer )? ) | -> ^( ARG TYPE ID ) )
                    {
                    TYPE10=(Token)match(input,TYPE,FOLLOW_TYPE_in_variableDeclaration978); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPE.add(TYPE10);

                    ID11=(Token)match(input,ID,FOLLOW_ID_in_variableDeclaration980); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID11);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:119:18: ( initializer )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==63) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: initializer
                            {
                            pushFollow(FOLLOW_initializer_in_variableDeclaration982);
                            initializer12=initializer();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_initializer.add(initializer12.getTree());

                            }
                            break;

                    }

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:120:10: ( NEWLINE -> ^( VARDEF TYPE ID ( initializer )? ) | -> ^( ARG TYPE ID ) )
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
                    else if ( (LA3_0==EOF||LA3_0==TYPE||(LA3_0>=END && LA3_0<=ID)||LA3_0==LITERAL||LA3_0==62||LA3_0==64||LA3_0==67||(LA3_0>=69 && LA3_0<=70)||(LA3_0>=77 && LA3_0<=79)||LA3_0==81) ) {
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
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:120:11: NEWLINE
                            {
                            NEWLINE13=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_variableDeclaration996); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE13);



                            // AST REWRITE
                            // elements: TYPE, initializer, ID
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 120:19: -> ^( VARDEF TYPE ID ( initializer )? )
                            {
                                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:120:22: ^( VARDEF TYPE ID ( initializer )? )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDEF, "VARDEF"), root_1);

                                adaptor.addChild(root_1, stream_TYPE.nextNode());
                                adaptor.addChild(root_1, stream_ID.nextNode());
                                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:120:39: ( initializer )?
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
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:121:19: 
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
                            // 121:19: -> ^( ARG TYPE ID )
                            {
                                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:121:22: ^( ARG TYPE ID )
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:125:1: initializer : '=' LITERAL ;
    public final celluloidParser.initializer_return initializer() throws RecognitionException {
        celluloidParser.initializer_return retval = new celluloidParser.initializer_return();
        retval.start = input.LT(1);
        int initializer_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal14=null;
        Token LITERAL15=null;

        Object char_literal14_tree=null;
        Object LITERAL15_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:126:5: ( '=' LITERAL )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:126:10: '=' LITERAL
            {
            root_0 = (Object)adaptor.nil();

            char_literal14=(Token)match(input,63,FOLLOW_63_in_initializer1078); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal14_tree = (Object)adaptor.create(char_literal14);
            adaptor.addChild(root_0, char_literal14_tree);
            }
            LITERAL15=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_initializer1080); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LITERAL15_tree = (Object)adaptor.create(LITERAL15);
            adaptor.addChild(root_0, LITERAL15_tree);
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:130:1: assignmentExpression : ( logicalORExpression | primaryExpression ASSIGNMENT_OPERATOR assignmentExpression );
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:131:9: ( logicalORExpression | primaryExpression ASSIGNMENT_OPERATOR assignmentExpression )
            int alt5=2;
            switch ( input.LA(1) ) {
            case 64:
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
            case 67:
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:131:11: logicalORExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_logicalORExpression_in_assignmentExpression1136);
                    logicalORExpression16=logicalORExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalORExpression16.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:132:11: primaryExpression ASSIGNMENT_OPERATOR assignmentExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_assignmentExpression1148);
                    primaryExpression17=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpression17.getTree());
                    ASSIGNMENT_OPERATOR18=(Token)match(input,ASSIGNMENT_OPERATOR,FOLLOW_ASSIGNMENT_OPERATOR_in_assignmentExpression1150); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGNMENT_OPERATOR18_tree = (Object)adaptor.create(ASSIGNMENT_OPERATOR18);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGNMENT_OPERATOR18_tree, root_0);
                    }
                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression1153);
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:134:1: logicalORExpression : ( 'not' )? logicalANDExpression ( 'or' logicalORExpression )? ;
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:135:9: ( ( 'not' )? logicalANDExpression ( 'or' logicalORExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:135:11: ( 'not' )? logicalANDExpression ( 'or' logicalORExpression )?
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:135:11: ( 'not' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==64) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: 'not'
                    {
                    string_literal20=(Token)match(input,64,FOLLOW_64_in_logicalORExpression1204); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal20_tree = (Object)adaptor.create(string_literal20);
                    adaptor.addChild(root_0, string_literal20_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression1207);
            logicalANDExpression21=logicalANDExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalANDExpression21.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:135:39: ( 'or' logicalORExpression )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==65) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:135:40: 'or' logicalORExpression
                    {
                    string_literal22=(Token)match(input,65,FOLLOW_65_in_logicalORExpression1210); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal22_tree = (Object)adaptor.create(string_literal22);
                    root_0 = (Object)adaptor.becomeRoot(string_literal22_tree, root_0);
                    }
                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1213);
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:137:1: logicalANDExpression : equalityExpression ( 'and' logicalANDExpression )? ;
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:138:9: ( equalityExpression ( 'and' logicalANDExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:138:11: equalityExpression ( 'and' logicalANDExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_logicalANDExpression1234);
            equalityExpression24=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression24.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:138:30: ( 'and' logicalANDExpression )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==66) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:138:31: 'and' logicalANDExpression
                    {
                    string_literal25=(Token)match(input,66,FOLLOW_66_in_logicalANDExpression1237); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal25_tree = (Object)adaptor.create(string_literal25);
                    root_0 = (Object)adaptor.becomeRoot(string_literal25_tree, root_0);
                    }
                    pushFollow(FOLLOW_logicalANDExpression_in_logicalANDExpression1240);
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:140:1: equalityExpression : relationalExpression ( EQUALITY_OPERATOR equalityExpression )? ;
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:141:9: ( relationalExpression ( EQUALITY_OPERATOR equalityExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:141:12: relationalExpression ( EQUALITY_OPERATOR equalityExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1266);
            relationalExpression27=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression27.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:141:33: ( EQUALITY_OPERATOR equalityExpression )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==EQUALITY_OPERATOR) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:141:34: EQUALITY_OPERATOR equalityExpression
                    {
                    EQUALITY_OPERATOR28=(Token)match(input,EQUALITY_OPERATOR,FOLLOW_EQUALITY_OPERATOR_in_equalityExpression1269); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUALITY_OPERATOR28_tree = (Object)adaptor.create(EQUALITY_OPERATOR28);
                    root_0 = (Object)adaptor.becomeRoot(EQUALITY_OPERATOR28_tree, root_0);
                    }
                    pushFollow(FOLLOW_equalityExpression_in_equalityExpression1272);
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:143:1: relationalExpression : additiveExpression ( RELATIONAL_OPERATOR relationalExpression )? ;
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:144:9: ( additiveExpression ( RELATIONAL_OPERATOR relationalExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:144:11: additiveExpression ( RELATIONAL_OPERATOR relationalExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1295);
            additiveExpression30=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression30.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:144:30: ( RELATIONAL_OPERATOR relationalExpression )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RELATIONAL_OPERATOR) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:144:31: RELATIONAL_OPERATOR relationalExpression
                    {
                    RELATIONAL_OPERATOR31=(Token)match(input,RELATIONAL_OPERATOR,FOLLOW_RELATIONAL_OPERATOR_in_relationalExpression1298); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RELATIONAL_OPERATOR31_tree = (Object)adaptor.create(RELATIONAL_OPERATOR31);
                    root_0 = (Object)adaptor.becomeRoot(RELATIONAL_OPERATOR31_tree, root_0);
                    }
                    pushFollow(FOLLOW_relationalExpression_in_relationalExpression1301);
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:146:1: additiveExpression : multiplicativeExpression ( ADDITIVE_OPERATOR additiveExpression )? ;
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:147:9: ( multiplicativeExpression ( ADDITIVE_OPERATOR additiveExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:147:11: multiplicativeExpression ( ADDITIVE_OPERATOR additiveExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1325);
            multiplicativeExpression33=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression33.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:147:36: ( ADDITIVE_OPERATOR additiveExpression )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ADDITIVE_OPERATOR) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:147:37: ADDITIVE_OPERATOR additiveExpression
                    {
                    ADDITIVE_OPERATOR34=(Token)match(input,ADDITIVE_OPERATOR,FOLLOW_ADDITIVE_OPERATOR_in_additiveExpression1328); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ADDITIVE_OPERATOR34_tree = (Object)adaptor.create(ADDITIVE_OPERATOR34);
                    root_0 = (Object)adaptor.becomeRoot(ADDITIVE_OPERATOR34_tree, root_0);
                    }
                    pushFollow(FOLLOW_additiveExpression_in_additiveExpression1331);
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:149:1: multiplicativeExpression : primaryExpression ( MULTIPLICATIVE_OPERATOR multiplicativeExpression )? ;
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:150:2: ( primaryExpression ( MULTIPLICATIVE_OPERATOR multiplicativeExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:150:4: primaryExpression ( MULTIPLICATIVE_OPERATOR multiplicativeExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_primaryExpression_in_multiplicativeExpression1343);
            primaryExpression36=primaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpression36.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:150:22: ( MULTIPLICATIVE_OPERATOR multiplicativeExpression )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==MULTIPLICATIVE_OPERATOR) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:150:23: MULTIPLICATIVE_OPERATOR multiplicativeExpression
                    {
                    MULTIPLICATIVE_OPERATOR37=(Token)match(input,MULTIPLICATIVE_OPERATOR,FOLLOW_MULTIPLICATIVE_OPERATOR_in_multiplicativeExpression1346); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MULTIPLICATIVE_OPERATOR37_tree = (Object)adaptor.create(MULTIPLICATIVE_OPERATOR37);
                    root_0 = (Object)adaptor.becomeRoot(MULTIPLICATIVE_OPERATOR37_tree, root_0);
                    }
                    pushFollow(FOLLOW_multiplicativeExpression_in_multiplicativeExpression1349);
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:152:1: primaryExpression : ( ID | 'new' ID '(' expressionList ')' | LITERAL | functionPredicateCall );
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:153:2: ( ID | 'new' ID '(' expressionList ')' | LITERAL | functionPredicateCall )
            int alt13=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==68) ) {
                    alt13=4;
                }
                else if ( (LA13_1==EOF||LA13_1==START||LA13_1==NEWLINE||(LA13_1>=ASSIGNMENT_OPERATOR && LA13_1<=MULTIPLICATIVE_OPERATOR)||(LA13_1>=65 && LA13_1<=66)||(LA13_1>=69 && LA13_1<=70)) ) {
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
            case 67:
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:153:4: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID39=(Token)match(input,ID,FOLLOW_ID_in_primaryExpression1361); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID39_tree = (Object)adaptor.create(ID39);
                    adaptor.addChild(root_0, ID39_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:154:4: 'new' ID '(' expressionList ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal40=(Token)match(input,67,FOLLOW_67_in_primaryExpression1366); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal40_tree = (Object)adaptor.create(string_literal40);
                    adaptor.addChild(root_0, string_literal40_tree);
                    }
                    ID41=(Token)match(input,ID,FOLLOW_ID_in_primaryExpression1368); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID41_tree = (Object)adaptor.create(ID41);
                    adaptor.addChild(root_0, ID41_tree);
                    }
                    char_literal42=(Token)match(input,68,FOLLOW_68_in_primaryExpression1370); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal42_tree = (Object)adaptor.create(char_literal42);
                    adaptor.addChild(root_0, char_literal42_tree);
                    }
                    pushFollow(FOLLOW_expressionList_in_primaryExpression1372);
                    expressionList43=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList43.getTree());
                    char_literal44=(Token)match(input,69,FOLLOW_69_in_primaryExpression1374); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal44_tree = (Object)adaptor.create(char_literal44);
                    adaptor.addChild(root_0, char_literal44_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:155:4: LITERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    LITERAL45=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_primaryExpression1379); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LITERAL45_tree = (Object)adaptor.create(LITERAL45);
                    adaptor.addChild(root_0, LITERAL45_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:156:4: functionPredicateCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionPredicateCall_in_primaryExpression1384);
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:165:1: idList : (ids+= ID ( ',' ids+= ID )* -> ( ID )+ | '(' ids+= ID ( ',' ids+= ID )* ')' -> ( ID )+ );
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
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:166:5: (ids+= ID ( ',' ids+= ID )* -> ( ID )+ | '(' ids+= ID ( ',' ids+= ID )* ')' -> ( ID )+ )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==68) ) {
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:166:10: ids+= ID ( ',' ids+= ID )*
                    {
                    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1412); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ids);

                    if (list_ids==null) list_ids=new ArrayList();
                    list_ids.add(ids);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:166:20: ( ',' ids+= ID )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==70) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:166:21: ',' ids+= ID
                    	    {
                    	    char_literal47=(Token)match(input,70,FOLLOW_70_in_idList1415); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_70.add(char_literal47);

                    	    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1421); if (state.failed) return retval; 
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
                    // 166:37: -> ( ID )+
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:168:10: '(' ids+= ID ( ',' ids+= ID )* ')'
                    {
                    char_literal48=(Token)match(input,68,FOLLOW_68_in_idList1449); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_68.add(char_literal48);

                    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1455); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ids);

                    if (list_ids==null) list_ids=new ArrayList();
                    list_ids.add(ids);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:168:24: ( ',' ids+= ID )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==70) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:168:25: ',' ids+= ID
                    	    {
                    	    char_literal49=(Token)match(input,70,FOLLOW_70_in_idList1458); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_70.add(char_literal49);

                    	    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1464); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ids);

                    	    if (list_ids==null) list_ids=new ArrayList();
                    	    list_ids.add(ids);


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    char_literal50=(Token)match(input,69,FOLLOW_69_in_idList1468); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_69.add(char_literal50);



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
                    // 168:45: -> ( ID )+
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:172:1: variableList : (vars+= variableDeclaration ( ',' vars+= variableDeclaration )* -> ( variableDeclaration )+ | '(' vars+= variableDeclaration ( ',' vars+= variableDeclaration )* ')' -> ( variableDeclaration )+ );
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
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:173:5: (vars+= variableDeclaration ( ',' vars+= variableDeclaration )* -> ( variableDeclaration )+ | '(' vars+= variableDeclaration ( ',' vars+= variableDeclaration )* ')' -> ( variableDeclaration )+ )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==TYPE||LA19_0==62) ) {
                alt19=1;
            }
            else if ( (LA19_0==68) ) {
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:173:10: vars+= variableDeclaration ( ',' vars+= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_variableList1509);
                    vars=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(vars.getTree());
                    if (list_vars==null) list_vars=new ArrayList();
                    list_vars.add(vars.getTree());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:173:38: ( ',' vars+= variableDeclaration )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==70) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:173:39: ',' vars+= variableDeclaration
                    	    {
                    	    char_literal51=(Token)match(input,70,FOLLOW_70_in_variableList1512); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_70.add(char_literal51);

                    	    pushFollow(FOLLOW_variableDeclaration_in_variableList1518);
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
                    // 174:10: -> ( variableDeclaration )+
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:176:10: '(' vars+= variableDeclaration ( ',' vars+= variableDeclaration )* ')'
                    {
                    char_literal52=(Token)match(input,68,FOLLOW_68_in_variableList1556); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_68.add(char_literal52);

                    pushFollow(FOLLOW_variableDeclaration_in_variableList1562);
                    vars=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(vars.getTree());
                    if (list_vars==null) list_vars=new ArrayList();
                    list_vars.add(vars.getTree());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:176:42: ( ',' vars+= variableDeclaration )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==70) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:176:43: ',' vars+= variableDeclaration
                    	    {
                    	    char_literal53=(Token)match(input,70,FOLLOW_70_in_variableList1565); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_70.add(char_literal53);

                    	    pushFollow(FOLLOW_variableDeclaration_in_variableList1571);
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

                    char_literal54=(Token)match(input,69,FOLLOW_69_in_variableList1575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_69.add(char_literal54);



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
                    // 177:10: -> ( variableDeclaration )+
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:181:1: expressionList : (exps+= assignmentExpression ( ',' exps+= assignmentExpression )* | '(' exps+= assignmentExpression ( ',' exps+= assignmentExpression )* ')' );
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:182:5: (exps+= assignmentExpression ( ',' exps+= assignmentExpression )* | '(' exps+= assignmentExpression ( ',' exps+= assignmentExpression )* ')' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ID||LA22_0==LITERAL||LA22_0==64||LA22_0==67) ) {
                alt22=1;
            }
            else if ( (LA22_0==68) ) {
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:182:10: exps+= assignmentExpression ( ',' exps+= assignmentExpression )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignmentExpression_in_expressionList1624);
                    exps=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exps.getTree());
                    if (list_exps==null) list_exps=new ArrayList();
                    list_exps.add(exps.getTree());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:182:39: ( ',' exps+= assignmentExpression )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==70) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:182:40: ',' exps+= assignmentExpression
                    	    {
                    	    char_literal55=(Token)match(input,70,FOLLOW_70_in_expressionList1627); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal55_tree = (Object)adaptor.create(char_literal55);
                    	    adaptor.addChild(root_0, char_literal55_tree);
                    	    }
                    	    pushFollow(FOLLOW_assignmentExpression_in_expressionList1633);
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:184:10: '(' exps+= assignmentExpression ( ',' exps+= assignmentExpression )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal56=(Token)match(input,68,FOLLOW_68_in_expressionList1656); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal56_tree = (Object)adaptor.create(char_literal56);
                    adaptor.addChild(root_0, char_literal56_tree);
                    }
                    pushFollow(FOLLOW_assignmentExpression_in_expressionList1662);
                    exps=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exps.getTree());
                    if (list_exps==null) list_exps=new ArrayList();
                    list_exps.add(exps.getTree());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:184:43: ( ',' exps+= assignmentExpression )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==70) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:184:44: ',' exps+= assignmentExpression
                    	    {
                    	    char_literal57=(Token)match(input,70,FOLLOW_70_in_expressionList1665); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal57_tree = (Object)adaptor.create(char_literal57);
                    	    adaptor.addChild(root_0, char_literal57_tree);
                    	    }
                    	    pushFollow(FOLLOW_assignmentExpression_in_expressionList1671);
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

                    char_literal58=(Token)match(input,69,FOLLOW_69_in_expressionList1675); if (state.failed) return retval;
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

    public static class inBlockDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:191:1: inBlockDeclaration : ( assignmentExpression NEWLINE | ifStatement NEWLINE | whenStatement NEWLINE | everyStatement NEWLINE | constraintFunctionCall NEWLINE );
    public final celluloidParser.inBlockDeclaration_return inBlockDeclaration() throws RecognitionException {
        celluloidParser.inBlockDeclaration_return retval = new celluloidParser.inBlockDeclaration_return();
        retval.start = input.LT(1);
        int inBlockDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token NEWLINE60=null;
        Token NEWLINE62=null;
        Token NEWLINE64=null;
        Token NEWLINE66=null;
        Token NEWLINE68=null;
        celluloidParser.assignmentExpression_return assignmentExpression59 = null;

        celluloidParser.ifStatement_return ifStatement61 = null;

        celluloidParser.whenStatement_return whenStatement63 = null;

        celluloidParser.everyStatement_return everyStatement65 = null;

        celluloidParser.constraintFunctionCall_return constraintFunctionCall67 = null;


        Object NEWLINE60_tree=null;
        Object NEWLINE62_tree=null;
        Object NEWLINE64_tree=null;
        Object NEWLINE66_tree=null;
        Object NEWLINE68_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:192:5: ( assignmentExpression NEWLINE | ifStatement NEWLINE | whenStatement NEWLINE | everyStatement NEWLINE | constraintFunctionCall NEWLINE )
            int alt23=5;
            switch ( input.LA(1) ) {
            case LITERAL:
            case 64:
            case 67:
                {
                alt23=1;
                }
                break;
            case ID:
                {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==NEWLINE||(LA23_2>=ASSIGNMENT_OPERATOR && LA23_2<=MULTIPLICATIVE_OPERATOR)||(LA23_2>=65 && LA23_2<=66)||LA23_2==68) ) {
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
            case 71:
                {
                alt23=2;
                }
                break;
            case 74:
            case 75:
                {
                alt23=3;
                }
                break;
            case 76:
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:192:7: assignmentExpression NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignmentExpression_in_inBlockDeclaration1705);
                    assignmentExpression59=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression59.getTree());
                    NEWLINE60=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_inBlockDeclaration1707); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE60_tree = (Object)adaptor.create(NEWLINE60);
                    adaptor.addChild(root_0, NEWLINE60_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:193:9: ifStatement NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_inBlockDeclaration1717);
                    ifStatement61=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement61.getTree());
                    NEWLINE62=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_inBlockDeclaration1719); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE62_tree = (Object)adaptor.create(NEWLINE62);
                    adaptor.addChild(root_0, NEWLINE62_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:194:9: whenStatement NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whenStatement_in_inBlockDeclaration1729);
                    whenStatement63=whenStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whenStatement63.getTree());
                    NEWLINE64=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_inBlockDeclaration1731); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE64_tree = (Object)adaptor.create(NEWLINE64);
                    adaptor.addChild(root_0, NEWLINE64_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:195:9: everyStatement NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_everyStatement_in_inBlockDeclaration1741);
                    everyStatement65=everyStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, everyStatement65.getTree());
                    NEWLINE66=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_inBlockDeclaration1743); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE66_tree = (Object)adaptor.create(NEWLINE66);
                    adaptor.addChild(root_0, NEWLINE66_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:196:9: constraintFunctionCall NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constraintFunctionCall_in_inBlockDeclaration1753);
                    constraintFunctionCall67=constraintFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constraintFunctionCall67.getTree());
                    NEWLINE68=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_inBlockDeclaration1755); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE68_tree = (Object)adaptor.create(NEWLINE68);
                    adaptor.addChild(root_0, NEWLINE68_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 16, inBlockDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inBlockDeclaration"

    public static class inBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:198:1: inBlock : START (block+= inBlockDeclaration )* END -> ^( INBLOCK ( $block)* ) ;
    public final celluloidParser.inBlock_return inBlock() throws RecognitionException {
        celluloidParser.inBlock_return retval = new celluloidParser.inBlock_return();
        retval.start = input.LT(1);
        int inBlock_StartIndex = input.index();
        Object root_0 = null;

        Token START69=null;
        Token END70=null;
        List list_block=null;
        RuleReturnScope block = null;
        Object START69_tree=null;
        Object END70_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_inBlockDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule inBlockDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:199:5: ( START (block+= inBlockDeclaration )* END -> ^( INBLOCK ( $block)* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:199:7: START (block+= inBlockDeclaration )* END
            {
            START69=(Token)match(input,START,FOLLOW_START_in_inBlock1772); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START69);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:200:13: (block+= inBlockDeclaration )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ID||LA24_0==LITERAL||LA24_0==64||LA24_0==67||LA24_0==71||(LA24_0>=74 && LA24_0<=76)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:200:14: block+= inBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_inBlockDeclaration_in_inBlock1791);
            	    block=inBlockDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_inBlockDeclaration.add(block.getTree());
            	    if (list_block==null) list_block=new ArrayList();
            	    list_block.add(block.getTree());


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            END70=(Token)match(input,END,FOLLOW_END_in_inBlock1803); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END70);



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
            // 202:9: -> ^( INBLOCK ( $block)* )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:202:12: ^( INBLOCK ( $block)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INBLOCK, "INBLOCK"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:202:22: ( $block)*
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
            if ( state.backtracking>0 ) { memoize(input, 17, inBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inBlock"

    public static class inStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:204:1: inStatement : 'in' ID inBlock -> ^( IN ID inBlock ) ;
    public final celluloidParser.inStatement_return inStatement() throws RecognitionException {
        celluloidParser.inStatement_return retval = new celluloidParser.inStatement_return();
        retval.start = input.LT(1);
        int inStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal71=null;
        Token ID72=null;
        celluloidParser.inBlock_return inBlock73 = null;


        Object string_literal71_tree=null;
        Object ID72_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_inBlock=new RewriteRuleSubtreeStream(adaptor,"rule inBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:205:5: ( 'in' ID inBlock -> ^( IN ID inBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:205:8: 'in' ID inBlock
            {
            string_literal71=(Token)match(input,60,FOLLOW_60_in_inStatement1838); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_60.add(string_literal71);

            ID72=(Token)match(input,ID,FOLLOW_ID_in_inStatement1840); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID72);

            pushFollow(FOLLOW_inBlock_in_inStatement1842);
            inBlock73=inBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inBlock.add(inBlock73.getTree());


            // AST REWRITE
            // elements: ID, inBlock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 206:9: -> ^( IN ID inBlock )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:206:12: ^( IN ID inBlock )
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
            if ( state.backtracking>0 ) { memoize(input, 18, inStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inStatement"

    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:210:1: ifStatement : 'if' ifTest= logicalORExpression START (ifBlock+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )+ (elseifBlock+= elseIfStatement )* ( elseStatement )? END -> ^( IF $ifTest ^( IFBLOCK $ifBlock) ^( ELSEIF ( $elseifBlock)? ) ^( ELSE ( elseStatement )? ) ) ;
    public final celluloidParser.ifStatement_return ifStatement() throws RecognitionException {
        celluloidParser.ifStatement_return retval = new celluloidParser.ifStatement_return();
        retval.start = input.LT(1);
        int ifStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal74=null;
        Token START75=null;
        Token NEWLINE79=null;
        Token END81=null;
        Token ifBlock=null;
        List list_ifBlock=null;
        List list_elseifBlock=null;
        celluloidParser.logicalORExpression_return ifTest = null;

        celluloidParser.assignmentExpression_return assignmentExpression76 = null;

        celluloidParser.inStatement_return inStatement77 = null;

        celluloidParser.ifStatement_return ifStatement78 = null;

        celluloidParser.elseStatement_return elseStatement80 = null;

        RuleReturnScope elseifBlock = null;
        Object string_literal74_tree=null;
        Object START75_tree=null;
        Object NEWLINE79_tree=null;
        Object END81_tree=null;
        Object ifBlock_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        RewriteRuleSubtreeStream stream_inStatement=new RewriteRuleSubtreeStream(adaptor,"rule inStatement");
        RewriteRuleSubtreeStream stream_elseStatement=new RewriteRuleSubtreeStream(adaptor,"rule elseStatement");
        RewriteRuleSubtreeStream stream_logicalORExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalORExpression");
        RewriteRuleSubtreeStream stream_elseIfStatement=new RewriteRuleSubtreeStream(adaptor,"rule elseIfStatement");
        RewriteRuleSubtreeStream stream_ifStatement=new RewriteRuleSubtreeStream(adaptor,"rule ifStatement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:211:5: ( 'if' ifTest= logicalORExpression START (ifBlock+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )+ (elseifBlock+= elseIfStatement )* ( elseStatement )? END -> ^( IF $ifTest ^( IFBLOCK $ifBlock) ^( ELSEIF ( $elseifBlock)? ) ^( ELSE ( elseStatement )? ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:211:8: 'if' ifTest= logicalORExpression START (ifBlock+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )+ (elseifBlock+= elseIfStatement )* ( elseStatement )? END
            {
            string_literal74=(Token)match(input,71,FOLLOW_71_in_ifStatement1890); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_71.add(string_literal74);

            pushFollow(FOLLOW_logicalORExpression_in_ifStatement1896);
            ifTest=logicalORExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logicalORExpression.add(ifTest.getTree());
            START75=(Token)match(input,START,FOLLOW_START_in_ifStatement1906); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START75);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:213:13: (ifBlock+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==ID||(LA26_0>=LITERAL && LA26_0<=60)||LA26_0==64||LA26_0==67||LA26_0==71) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:213:14: ifBlock+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE
            	    {
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:213:25: ( assignmentExpression | inStatement | ifStatement )
            	    int alt25=3;
            	    switch ( input.LA(1) ) {
            	    case ID:
            	    case LITERAL:
            	    case 64:
            	    case 67:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case 60:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case 71:
            	        {
            	        alt25=3;
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
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:213:26: assignmentExpression
            	            {
            	            pushFollow(FOLLOW_assignmentExpression_in_ifStatement1926);
            	            assignmentExpression76=assignmentExpression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression76.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:213:49: inStatement
            	            {
            	            pushFollow(FOLLOW_inStatement_in_ifStatement1930);
            	            inStatement77=inStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_inStatement.add(inStatement77.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:213:63: ifStatement
            	            {
            	            pushFollow(FOLLOW_ifStatement_in_ifStatement1934);
            	            ifStatement78=ifStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_ifStatement.add(ifStatement78.getTree());

            	            }
            	            break;

            	    }

            	    NEWLINE79=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ifStatement1937); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE79);


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:214:13: (elseifBlock+= elseIfStatement )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==72) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:214:14: elseifBlock+= elseIfStatement
            	    {
            	    pushFollow(FOLLOW_elseIfStatement_in_ifStatement1959);
            	    elseifBlock=elseIfStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elseIfStatement.add(elseifBlock.getTree());
            	    if (list_elseifBlock==null) list_elseifBlock=new ArrayList();
            	    list_elseifBlock.add(elseifBlock.getTree());


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:215:13: ( elseStatement )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==73) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: elseStatement
                    {
                    pushFollow(FOLLOW_elseStatement_in_ifStatement1975);
                    elseStatement80=elseStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseStatement.add(elseStatement80.getTree());

                    }
                    break;

            }

            END81=(Token)match(input,END,FOLLOW_END_in_ifStatement1986); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END81);



            // AST REWRITE
            // elements: elseStatement, elseifBlock, ifBlock, ifTest
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
            // 217:9: -> ^( IF $ifTest ^( IFBLOCK $ifBlock) ^( ELSEIF ( $elseifBlock)? ) ^( ELSE ( elseStatement )? ) )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:217:12: ^( IF $ifTest ^( IFBLOCK $ifBlock) ^( ELSEIF ( $elseifBlock)? ) ^( ELSE ( elseStatement )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_ifTest.nextTree());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:217:25: ^( IFBLOCK $ifBlock)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IFBLOCK, "IFBLOCK"), root_2);

                adaptor.addChild(root_2, stream_ifBlock.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:217:45: ^( ELSEIF ( $elseifBlock)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSEIF, "ELSEIF"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:217:54: ( $elseifBlock)?
                if ( stream_elseifBlock.hasNext() ) {
                    adaptor.addChild(root_2, stream_elseifBlock.nextTree());

                }
                stream_elseifBlock.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:217:69: ^( ELSE ( elseStatement )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:217:76: ( elseStatement )?
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
            if ( state.backtracking>0 ) { memoize(input, 19, ifStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class elseIfStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseIfStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:220:1: elseIfStatement : 'else if' (elseIfTest= logicalORExpression NEWLINE ) (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )* -> ^( $elseIfTest ^( IFBLOCK $statements) ) ;
    public final celluloidParser.elseIfStatement_return elseIfStatement() throws RecognitionException {
        celluloidParser.elseIfStatement_return retval = new celluloidParser.elseIfStatement_return();
        retval.start = input.LT(1);
        int elseIfStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal82=null;
        Token NEWLINE83=null;
        Token NEWLINE87=null;
        Token statements=null;
        List list_statements=null;
        celluloidParser.logicalORExpression_return elseIfTest = null;

        celluloidParser.assignmentExpression_return assignmentExpression84 = null;

        celluloidParser.inStatement_return inStatement85 = null;

        celluloidParser.ifStatement_return ifStatement86 = null;


        Object string_literal82_tree=null;
        Object NEWLINE83_tree=null;
        Object NEWLINE87_tree=null;
        Object statements_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        RewriteRuleSubtreeStream stream_inStatement=new RewriteRuleSubtreeStream(adaptor,"rule inStatement");
        RewriteRuleSubtreeStream stream_logicalORExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalORExpression");
        RewriteRuleSubtreeStream stream_ifStatement=new RewriteRuleSubtreeStream(adaptor,"rule ifStatement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:221:2: ( 'else if' (elseIfTest= logicalORExpression NEWLINE ) (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )* -> ^( $elseIfTest ^( IFBLOCK $statements) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:221:6: 'else if' (elseIfTest= logicalORExpression NEWLINE ) (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )*
            {
            string_literal82=(Token)match(input,72,FOLLOW_72_in_elseIfStatement2050); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_72.add(string_literal82);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:221:16: (elseIfTest= logicalORExpression NEWLINE )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:221:17: elseIfTest= logicalORExpression NEWLINE
            {
            pushFollow(FOLLOW_logicalORExpression_in_elseIfStatement2057);
            elseIfTest=logicalORExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logicalORExpression.add(elseIfTest.getTree());
            NEWLINE83=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elseIfStatement2059); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE83);


            }

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:222:14: (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==ID||(LA30_0>=LITERAL && LA30_0<=60)||LA30_0==64||LA30_0==67||LA30_0==71) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:222:15: statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE
            	    {
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:222:29: ( assignmentExpression | inStatement | ifStatement )
            	    int alt29=3;
            	    switch ( input.LA(1) ) {
            	    case ID:
            	    case LITERAL:
            	    case 64:
            	    case 67:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 60:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 71:
            	        {
            	        alt29=3;
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
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:222:30: assignmentExpression
            	            {
            	            pushFollow(FOLLOW_assignmentExpression_in_elseIfStatement2082);
            	            assignmentExpression84=assignmentExpression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression84.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:222:53: inStatement
            	            {
            	            pushFollow(FOLLOW_inStatement_in_elseIfStatement2086);
            	            inStatement85=inStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_inStatement.add(inStatement85.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:222:67: ifStatement
            	            {
            	            pushFollow(FOLLOW_ifStatement_in_elseIfStatement2090);
            	            ifStatement86=ifStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_ifStatement.add(ifStatement86.getTree());

            	            }
            	            break;

            	    }

            	    NEWLINE87=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elseIfStatement2093); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE87);


            	    }
            	    break;

            	default :
            	    break loop30;
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
            // 223:14: -> ^( $elseIfTest ^( IFBLOCK $statements) )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:223:17: ^( $elseIfTest ^( IFBLOCK $statements) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_elseIfTest.nextNode(), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:223:31: ^( IFBLOCK $statements)
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
            if ( state.backtracking>0 ) { memoize(input, 20, elseIfStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elseIfStatement"

    public static class elseStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:226:1: elseStatement : 'else' (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )* -> ^( IFBLOCK $statements) ;
    public final celluloidParser.elseStatement_return elseStatement() throws RecognitionException {
        celluloidParser.elseStatement_return retval = new celluloidParser.elseStatement_return();
        retval.start = input.LT(1);
        int elseStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal88=null;
        Token NEWLINE92=null;
        Token statements=null;
        List list_statements=null;
        celluloidParser.assignmentExpression_return assignmentExpression89 = null;

        celluloidParser.inStatement_return inStatement90 = null;

        celluloidParser.ifStatement_return ifStatement91 = null;


        Object string_literal88_tree=null;
        Object NEWLINE92_tree=null;
        Object statements_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        RewriteRuleSubtreeStream stream_inStatement=new RewriteRuleSubtreeStream(adaptor,"rule inStatement");
        RewriteRuleSubtreeStream stream_ifStatement=new RewriteRuleSubtreeStream(adaptor,"rule ifStatement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:227:2: ( 'else' (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )* -> ^( IFBLOCK $statements) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:227:6: 'else' (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )*
            {
            string_literal88=(Token)match(input,73,FOLLOW_73_in_elseStatement2137); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_73.add(string_literal88);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:227:13: (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==ID||(LA32_0>=LITERAL && LA32_0<=60)||LA32_0==64||LA32_0==67||LA32_0==71) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:227:14: statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE
            	    {
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:227:28: ( assignmentExpression | inStatement | ifStatement )
            	    int alt31=3;
            	    switch ( input.LA(1) ) {
            	    case ID:
            	    case LITERAL:
            	    case 64:
            	    case 67:
            	        {
            	        alt31=1;
            	        }
            	        break;
            	    case 60:
            	        {
            	        alt31=2;
            	        }
            	        break;
            	    case 71:
            	        {
            	        alt31=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt31) {
            	        case 1 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:227:29: assignmentExpression
            	            {
            	            pushFollow(FOLLOW_assignmentExpression_in_elseStatement2145);
            	            assignmentExpression89=assignmentExpression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression89.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:227:52: inStatement
            	            {
            	            pushFollow(FOLLOW_inStatement_in_elseStatement2149);
            	            inStatement90=inStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_inStatement.add(inStatement90.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:227:66: ifStatement
            	            {
            	            pushFollow(FOLLOW_ifStatement_in_elseStatement2153);
            	            ifStatement91=ifStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_ifStatement.add(ifStatement91.getTree());

            	            }
            	            break;

            	    }

            	    NEWLINE92=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elseStatement2156); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE92);


            	    }
            	    break;

            	default :
            	    break loop32;
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
            // 228:14: -> ^( IFBLOCK $statements)
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:228:17: ^( IFBLOCK $statements)
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
            if ( state.backtracking>0 ) { memoize(input, 21, elseStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elseStatement"

    public static class whenStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whenStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:231:1: whenStatement : cond= ( 'when' | 'unless' ) logicalORExpression START ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE )+ END -> ^( LISTENER EVERY ^( COND $cond logicalORExpression ) ^( LISTENBLOCK ( assignmentExpression )* ( constraintFunctionCall )* ( ifStatement )* ) ) ;
    public final celluloidParser.whenStatement_return whenStatement() throws RecognitionException {
        celluloidParser.whenStatement_return retval = new celluloidParser.whenStatement_return();
        retval.start = input.LT(1);
        int whenStatement_StartIndex = input.index();
        Object root_0 = null;

        Token cond=null;
        Token string_literal93=null;
        Token string_literal94=null;
        Token START96=null;
        Token NEWLINE100=null;
        Token END101=null;
        celluloidParser.logicalORExpression_return logicalORExpression95 = null;

        celluloidParser.assignmentExpression_return assignmentExpression97 = null;

        celluloidParser.constraintFunctionCall_return constraintFunctionCall98 = null;

        celluloidParser.ifStatement_return ifStatement99 = null;


        Object cond_tree=null;
        Object string_literal93_tree=null;
        Object string_literal94_tree=null;
        Object START96_tree=null;
        Object NEWLINE100_tree=null;
        Object END101_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_constraintFunctionCall=new RewriteRuleSubtreeStream(adaptor,"rule constraintFunctionCall");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        RewriteRuleSubtreeStream stream_logicalORExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalORExpression");
        RewriteRuleSubtreeStream stream_ifStatement=new RewriteRuleSubtreeStream(adaptor,"rule ifStatement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:232:5: (cond= ( 'when' | 'unless' ) logicalORExpression START ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE )+ END -> ^( LISTENER EVERY ^( COND $cond logicalORExpression ) ^( LISTENBLOCK ( assignmentExpression )* ( constraintFunctionCall )* ( ifStatement )* ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:232:9: cond= ( 'when' | 'unless' ) logicalORExpression START ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE )+ END
            {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:232:16: ( 'when' | 'unless' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==74) ) {
                alt33=1;
            }
            else if ( (LA33_0==75) ) {
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:232:17: 'when'
                    {
                    string_literal93=(Token)match(input,74,FOLLOW_74_in_whenStatement2201); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(string_literal93);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:232:26: 'unless'
                    {
                    string_literal94=(Token)match(input,75,FOLLOW_75_in_whenStatement2205); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(string_literal94);


                    }
                    break;

            }

            pushFollow(FOLLOW_logicalORExpression_in_whenStatement2208);
            logicalORExpression95=logicalORExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logicalORExpression.add(logicalORExpression95.getTree());
            START96=(Token)match(input,START,FOLLOW_START_in_whenStatement2218); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START96);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:234:6: ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==ID||LA35_0==LITERAL||LA35_0==64||LA35_0==67||LA35_0==71) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:234:7: ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE
            	    {
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:234:7: ( assignmentExpression | constraintFunctionCall | ifStatement )
            	    int alt34=3;
            	    switch ( input.LA(1) ) {
            	    case LITERAL:
            	    case 64:
            	    case 67:
            	        {
            	        alt34=1;
            	        }
            	        break;
            	    case ID:
            	        {
            	        int LA34_2 = input.LA(2);

            	        if ( (LA34_2==NEWLINE||(LA34_2>=ASSIGNMENT_OPERATOR && LA34_2<=MULTIPLICATIVE_OPERATOR)||(LA34_2>=65 && LA34_2<=66)||LA34_2==68) ) {
            	            alt34=1;
            	        }
            	        else if ( (LA34_2==ID) ) {
            	            alt34=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return retval;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 34, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 71:
            	        {
            	        alt34=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt34) {
            	        case 1 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:234:8: assignmentExpression
            	            {
            	            pushFollow(FOLLOW_assignmentExpression_in_whenStatement2227);
            	            assignmentExpression97=assignmentExpression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression97.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:234:31: constraintFunctionCall
            	            {
            	            pushFollow(FOLLOW_constraintFunctionCall_in_whenStatement2231);
            	            constraintFunctionCall98=constraintFunctionCall();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_constraintFunctionCall.add(constraintFunctionCall98.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:234:56: ifStatement
            	            {
            	            pushFollow(FOLLOW_ifStatement_in_whenStatement2235);
            	            ifStatement99=ifStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_ifStatement.add(ifStatement99.getTree());

            	            }
            	            break;

            	    }

            	    NEWLINE100=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_whenStatement2238); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE100);


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            END101=(Token)match(input,END,FOLLOW_END_in_whenStatement2251); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END101);



            // AST REWRITE
            // elements: logicalORExpression, cond, constraintFunctionCall, assignmentExpression, ifStatement
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
            // 236:9: -> ^( LISTENER EVERY ^( COND $cond logicalORExpression ) ^( LISTENBLOCK ( assignmentExpression )* ( constraintFunctionCall )* ( ifStatement )* ) )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:236:12: ^( LISTENER EVERY ^( COND $cond logicalORExpression ) ^( LISTENBLOCK ( assignmentExpression )* ( constraintFunctionCall )* ( ifStatement )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LISTENER, "LISTENER"), root_1);

                adaptor.addChild(root_1, (Object)adaptor.create(EVERY, "EVERY"));
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:236:29: ^( COND $cond logicalORExpression )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);

                adaptor.addChild(root_2, stream_cond.nextNode());
                adaptor.addChild(root_2, stream_logicalORExpression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:237:14: ^( LISTENBLOCK ( assignmentExpression )* ( constraintFunctionCall )* ( ifStatement )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(LISTENBLOCK, "LISTENBLOCK"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:237:28: ( assignmentExpression )*
                while ( stream_assignmentExpression.hasNext() ) {
                    adaptor.addChild(root_2, stream_assignmentExpression.nextTree());

                }
                stream_assignmentExpression.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:237:50: ( constraintFunctionCall )*
                while ( stream_constraintFunctionCall.hasNext() ) {
                    adaptor.addChild(root_2, stream_constraintFunctionCall.nextTree());

                }
                stream_constraintFunctionCall.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:237:74: ( ifStatement )*
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
            if ( state.backtracking>0 ) { memoize(input, 22, whenStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "whenStatement"

    public static class everyStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "everyStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:241:1: everyStatement : 'every' TIME (cond= ( 'when' | 'unless' ) logicalORExpression )? START ( (statements+= ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE ) )* ) END -> ^( LISTENER ^( EVERY TIME ) ^( COND ( $cond)? ( logicalORExpression )? ) ^( LISTENBLOCK ( assignmentExpression )* ( constraintFunctionCall )* ( ifStatement )* ) ) ;
    public final celluloidParser.everyStatement_return everyStatement() throws RecognitionException {
        celluloidParser.everyStatement_return retval = new celluloidParser.everyStatement_return();
        retval.start = input.LT(1);
        int everyStatement_StartIndex = input.index();
        Object root_0 = null;

        Token cond=null;
        Token string_literal102=null;
        Token TIME103=null;
        Token string_literal104=null;
        Token string_literal105=null;
        Token START107=null;
        Token NEWLINE111=null;
        Token END112=null;
        Token statements=null;
        List list_statements=null;
        celluloidParser.logicalORExpression_return logicalORExpression106 = null;

        celluloidParser.assignmentExpression_return assignmentExpression108 = null;

        celluloidParser.constraintFunctionCall_return constraintFunctionCall109 = null;

        celluloidParser.ifStatement_return ifStatement110 = null;


        Object cond_tree=null;
        Object string_literal102_tree=null;
        Object TIME103_tree=null;
        Object string_literal104_tree=null;
        Object string_literal105_tree=null;
        Object START107_tree=null;
        Object NEWLINE111_tree=null;
        Object END112_tree=null;
        Object statements_tree=null;
        RewriteRuleTokenStream stream_TIME=new RewriteRuleTokenStream(adaptor,"token TIME");
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_constraintFunctionCall=new RewriteRuleSubtreeStream(adaptor,"rule constraintFunctionCall");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        RewriteRuleSubtreeStream stream_logicalORExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalORExpression");
        RewriteRuleSubtreeStream stream_ifStatement=new RewriteRuleSubtreeStream(adaptor,"rule ifStatement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:242:5: ( 'every' TIME (cond= ( 'when' | 'unless' ) logicalORExpression )? START ( (statements+= ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE ) )* ) END -> ^( LISTENER ^( EVERY TIME ) ^( COND ( $cond)? ( logicalORExpression )? ) ^( LISTENBLOCK ( assignmentExpression )* ( constraintFunctionCall )* ( ifStatement )* ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:242:8: 'every' TIME (cond= ( 'when' | 'unless' ) logicalORExpression )? START ( (statements+= ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE ) )* ) END
            {
            string_literal102=(Token)match(input,76,FOLLOW_76_in_everyStatement2334); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_76.add(string_literal102);

            TIME103=(Token)match(input,TIME,FOLLOW_TIME_in_everyStatement2336); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TIME.add(TIME103);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:242:21: (cond= ( 'when' | 'unless' ) logicalORExpression )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=74 && LA37_0<=75)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:242:22: cond= ( 'when' | 'unless' ) logicalORExpression
                    {
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:242:29: ( 'when' | 'unless' )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==74) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==75) ) {
                        alt36=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:242:30: 'when'
                            {
                            string_literal104=(Token)match(input,74,FOLLOW_74_in_everyStatement2344); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_74.add(string_literal104);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:242:39: 'unless'
                            {
                            string_literal105=(Token)match(input,75,FOLLOW_75_in_everyStatement2348); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_75.add(string_literal105);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_logicalORExpression_in_everyStatement2351);
                    logicalORExpression106=logicalORExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logicalORExpression.add(logicalORExpression106.getTree());

                    }
                    break;

            }

            START107=(Token)match(input,START,FOLLOW_START_in_everyStatement2363); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START107);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:244:13: ( (statements+= ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE ) )* )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:244:14: (statements+= ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE ) )*
            {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:244:25: (statements+= ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==ID||LA39_0==LITERAL||LA39_0==64||LA39_0==67||LA39_0==71) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: statements+= ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE )
            	    {
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:244:28: ( ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE )
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:244:29: ( assignmentExpression | constraintFunctionCall | ifStatement ) NEWLINE
            	    {
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:244:29: ( assignmentExpression | constraintFunctionCall | ifStatement )
            	    int alt38=3;
            	    switch ( input.LA(1) ) {
            	    case LITERAL:
            	    case 64:
            	    case 67:
            	        {
            	        alt38=1;
            	        }
            	        break;
            	    case ID:
            	        {
            	        int LA38_2 = input.LA(2);

            	        if ( (LA38_2==NEWLINE||(LA38_2>=ASSIGNMENT_OPERATOR && LA38_2<=MULTIPLICATIVE_OPERATOR)||(LA38_2>=65 && LA38_2<=66)||LA38_2==68) ) {
            	            alt38=1;
            	        }
            	        else if ( (LA38_2==ID) ) {
            	            alt38=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return retval;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 38, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 71:
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
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:244:30: assignmentExpression
            	            {
            	            pushFollow(FOLLOW_assignmentExpression_in_everyStatement2384);
            	            assignmentExpression108=assignmentExpression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression108.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:244:53: constraintFunctionCall
            	            {
            	            pushFollow(FOLLOW_constraintFunctionCall_in_everyStatement2388);
            	            constraintFunctionCall109=constraintFunctionCall();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_constraintFunctionCall.add(constraintFunctionCall109.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:244:78: ifStatement
            	            {
            	            pushFollow(FOLLOW_ifStatement_in_everyStatement2392);
            	            ifStatement110=ifStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_ifStatement.add(ifStatement110.getTree());

            	            }
            	            break;

            	    }

            	    NEWLINE111=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_everyStatement2395); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE111);


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

            END112=(Token)match(input,END,FOLLOW_END_in_everyStatement2409); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END112);



            // AST REWRITE
            // elements: assignmentExpression, constraintFunctionCall, logicalORExpression, cond, ifStatement, TIME
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
            // 246:9: -> ^( LISTENER ^( EVERY TIME ) ^( COND ( $cond)? ( logicalORExpression )? ) ^( LISTENBLOCK ( assignmentExpression )* ( constraintFunctionCall )* ( ifStatement )* ) )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:246:12: ^( LISTENER ^( EVERY TIME ) ^( COND ( $cond)? ( logicalORExpression )? ) ^( LISTENBLOCK ( assignmentExpression )* ( constraintFunctionCall )* ( ifStatement )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LISTENER, "LISTENER"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:246:23: ^( EVERY TIME )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EVERY, "EVERY"), root_2);

                adaptor.addChild(root_2, stream_TIME.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:246:37: ^( COND ( $cond)? ( logicalORExpression )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:246:44: ( $cond)?
                if ( stream_cond.hasNext() ) {
                    adaptor.addChild(root_2, stream_cond.nextNode());

                }
                stream_cond.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:246:51: ( logicalORExpression )?
                if ( stream_logicalORExpression.hasNext() ) {
                    adaptor.addChild(root_2, stream_logicalORExpression.nextTree());

                }
                stream_logicalORExpression.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:247:14: ^( LISTENBLOCK ( assignmentExpression )* ( constraintFunctionCall )* ( ifStatement )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(LISTENBLOCK, "LISTENBLOCK"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:247:28: ( assignmentExpression )*
                while ( stream_assignmentExpression.hasNext() ) {
                    adaptor.addChild(root_2, stream_assignmentExpression.nextTree());

                }
                stream_assignmentExpression.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:247:50: ( constraintFunctionCall )*
                while ( stream_constraintFunctionCall.hasNext() ) {
                    adaptor.addChild(root_2, stream_constraintFunctionCall.nextTree());

                }
                stream_constraintFunctionCall.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:247:74: ( ifStatement )*
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
            if ( state.backtracking>0 ) { memoize(input, 23, everyStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "everyStatement"

    public static class constraintFunctionCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constraintFunctionCall"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:251:1: constraintFunctionCall : ID ID expressionList ;
    public final celluloidParser.constraintFunctionCall_return constraintFunctionCall() throws RecognitionException {
        celluloidParser.constraintFunctionCall_return retval = new celluloidParser.constraintFunctionCall_return();
        retval.start = input.LT(1);
        int constraintFunctionCall_StartIndex = input.index();
        Object root_0 = null;

        Token ID113=null;
        Token ID114=null;
        celluloidParser.expressionList_return expressionList115 = null;


        Object ID113_tree=null;
        Object ID114_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:252:5: ( ID ID expressionList )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:252:10: ID ID expressionList
            {
            root_0 = (Object)adaptor.nil();

            ID113=(Token)match(input,ID,FOLLOW_ID_in_constraintFunctionCall2500); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID113_tree = (Object)adaptor.create(ID113);
            adaptor.addChild(root_0, ID113_tree);
            }
            ID114=(Token)match(input,ID,FOLLOW_ID_in_constraintFunctionCall2502); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID114_tree = (Object)adaptor.create(ID114);
            adaptor.addChild(root_0, ID114_tree);
            }
            pushFollow(FOLLOW_expressionList_in_constraintFunctionCall2504);
            expressionList115=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList115.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 24, constraintFunctionCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constraintFunctionCall"

    public static class functionPredicateCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionPredicateCall"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:256:1: functionPredicateCall : ID '(' expressionList ')' ( NEWLINE )? -> ^( CALL ID ^( ARGS expressionList ) ) ;
    public final celluloidParser.functionPredicateCall_return functionPredicateCall() throws RecognitionException {
        celluloidParser.functionPredicateCall_return retval = new celluloidParser.functionPredicateCall_return();
        retval.start = input.LT(1);
        int functionPredicateCall_StartIndex = input.index();
        Object root_0 = null;

        Token ID116=null;
        Token char_literal117=null;
        Token char_literal119=null;
        Token NEWLINE120=null;
        celluloidParser.expressionList_return expressionList118 = null;


        Object ID116_tree=null;
        Object char_literal117_tree=null;
        Object char_literal119_tree=null;
        Object NEWLINE120_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:257:5: ( ID '(' expressionList ')' ( NEWLINE )? -> ^( CALL ID ^( ARGS expressionList ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:257:10: ID '(' expressionList ')' ( NEWLINE )?
            {
            ID116=(Token)match(input,ID,FOLLOW_ID_in_functionPredicateCall2537); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID116);

            char_literal117=(Token)match(input,68,FOLLOW_68_in_functionPredicateCall2539); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_68.add(char_literal117);

            pushFollow(FOLLOW_expressionList_in_functionPredicateCall2541);
            expressionList118=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expressionList.add(expressionList118.getTree());
            char_literal119=(Token)match(input,69,FOLLOW_69_in_functionPredicateCall2543); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_69.add(char_literal119);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:257:36: ( NEWLINE )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==NEWLINE) ) {
                int LA40_1 = input.LA(2);

                if ( (synpred51_celluloid()) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: NEWLINE
                    {
                    NEWLINE120=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_functionPredicateCall2545); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE120);


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
            // 258:10: -> ^( CALL ID ^( ARGS expressionList ) )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:258:13: ^( CALL ID ^( ARGS expressionList ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:258:23: ^( ARGS expressionList )
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
            if ( state.backtracking>0 ) { memoize(input, 25, functionPredicateCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionPredicateCall"

    public static class functionHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionHeader"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:264:1: functionHeader : 'function' ID '(' variableList ')' NEWLINE -> ^( FUNHEAD ID variableList ) ;
    public final celluloidParser.functionHeader_return functionHeader() throws RecognitionException {
        celluloidParser.functionHeader_return retval = new celluloidParser.functionHeader_return();
        retval.start = input.LT(1);
        int functionHeader_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal121=null;
        Token ID122=null;
        Token char_literal123=null;
        Token char_literal125=null;
        Token NEWLINE126=null;
        celluloidParser.variableList_return variableList124 = null;


        Object string_literal121_tree=null;
        Object ID122_tree=null;
        Object char_literal123_tree=null;
        Object char_literal125_tree=null;
        Object NEWLINE126_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_variableList=new RewriteRuleSubtreeStream(adaptor,"rule variableList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:265:5: ( 'function' ID '(' variableList ')' NEWLINE -> ^( FUNHEAD ID variableList ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:265:10: 'function' ID '(' variableList ')' NEWLINE
            {
            string_literal121=(Token)match(input,77,FOLLOW_77_in_functionHeader2602); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_77.add(string_literal121);

            ID122=(Token)match(input,ID,FOLLOW_ID_in_functionHeader2604); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID122);

            char_literal123=(Token)match(input,68,FOLLOW_68_in_functionHeader2606); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_68.add(char_literal123);

            pushFollow(FOLLOW_variableList_in_functionHeader2608);
            variableList124=variableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableList.add(variableList124.getTree());
            char_literal125=(Token)match(input,69,FOLLOW_69_in_functionHeader2610); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_69.add(char_literal125);

            NEWLINE126=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_functionHeader2612); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE126);



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
            // 266:10: -> ^( FUNHEAD ID variableList )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:266:13: ^( FUNHEAD ID variableList )
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
            if ( state.backtracking>0 ) { memoize(input, 26, functionHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionHeader"

    public static class functionPredicateBlockDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionPredicateBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:269:1: functionPredicateBlockDeclaration : ( variableDeclaration | functionPredicateCall | assignmentExpression NEWLINE );
    public final celluloidParser.functionPredicateBlockDeclaration_return functionPredicateBlockDeclaration() throws RecognitionException {
        celluloidParser.functionPredicateBlockDeclaration_return retval = new celluloidParser.functionPredicateBlockDeclaration_return();
        retval.start = input.LT(1);
        int functionPredicateBlockDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token NEWLINE130=null;
        celluloidParser.variableDeclaration_return variableDeclaration127 = null;

        celluloidParser.functionPredicateCall_return functionPredicateCall128 = null;

        celluloidParser.assignmentExpression_return assignmentExpression129 = null;


        Object NEWLINE130_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:270:5: ( variableDeclaration | functionPredicateCall | assignmentExpression NEWLINE )
            int alt41=3;
            switch ( input.LA(1) ) {
            case TYPE:
            case 62:
                {
                alt41=1;
                }
                break;
            case ID:
                {
                int LA41_3 = input.LA(2);

                if ( (synpred53_celluloid()) ) {
                    alt41=2;
                }
                else if ( (true) ) {
                    alt41=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 3, input);

                    throw nvae;
                }
                }
                break;
            case LITERAL:
            case 64:
            case 67:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:270:10: variableDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableDeclaration_in_functionPredicateBlockDeclaration2652);
                    variableDeclaration127=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration127.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:271:10: functionPredicateCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionPredicateCall_in_functionPredicateBlockDeclaration2663);
                    functionPredicateCall128=functionPredicateCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionPredicateCall128.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:272:10: assignmentExpression NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignmentExpression_in_functionPredicateBlockDeclaration2674);
                    assignmentExpression129=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression129.getTree());
                    NEWLINE130=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_functionPredicateBlockDeclaration2676); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE130_tree = (Object)adaptor.create(NEWLINE130);
                    adaptor.addChild(root_0, NEWLINE130_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 27, functionPredicateBlockDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionPredicateBlockDeclaration"

    public static class functionBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:274:1: functionBlock : START (block+= functionPredicateBlockDeclaration )* END -> ^( FUNBLOCK[$START, \"FUNCBLOCK\"] RETURN ( $block)* ) ;
    public final celluloidParser.functionBlock_return functionBlock() throws RecognitionException {
        celluloidParser.functionBlock_return retval = new celluloidParser.functionBlock_return();
        retval.start = input.LT(1);
        int functionBlock_StartIndex = input.index();
        Object root_0 = null;

        Token START131=null;
        Token END132=null;
        List list_block=null;
        RuleReturnScope block = null;
        Object START131_tree=null;
        Object END132_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_functionPredicateBlockDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule functionPredicateBlockDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:275:5: ( START (block+= functionPredicateBlockDeclaration )* END -> ^( FUNBLOCK[$START, \"FUNCBLOCK\"] RETURN ( $block)* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:275:10: START (block+= functionPredicateBlockDeclaration )* END
            {
            START131=(Token)match(input,START,FOLLOW_START_in_functionBlock2701); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START131);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:276:12: (block+= functionPredicateBlockDeclaration )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==TYPE||LA42_0==ID||LA42_0==LITERAL||LA42_0==62||LA42_0==64||LA42_0==67) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:276:14: block+= functionPredicateBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_functionPredicateBlockDeclaration_in_functionBlock2721);
            	    block=functionPredicateBlockDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_functionPredicateBlockDeclaration.add(block.getTree());
            	    if (list_block==null) list_block=new ArrayList();
            	    list_block.add(block.getTree());


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            END132=(Token)match(input,END,FOLLOW_END_in_functionBlock2736); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END132);



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
            // 278:10: -> ^( FUNBLOCK[$START, \"FUNCBLOCK\"] RETURN ( $block)* )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:278:13: ^( FUNBLOCK[$START, \"FUNCBLOCK\"] RETURN ( $block)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNBLOCK, START131, "FUNCBLOCK"), root_1);

                adaptor.addChild(root_1, (Object)adaptor.create(RETURN, "RETURN"));
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:278:52: ( $block)*
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
            if ( state.backtracking>0 ) { memoize(input, 28, functionBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionBlock"

    public static class functionDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:283:1: functionDefinition : 'function' ID '(' variableList ')' functionBlock -> ^( FUNC ID variableList ( functionBlock )? ) ;
    public final celluloidParser.functionDefinition_return functionDefinition() throws RecognitionException {
        celluloidParser.functionDefinition_return retval = new celluloidParser.functionDefinition_return();
        retval.start = input.LT(1);
        int functionDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal133=null;
        Token ID134=null;
        Token char_literal135=null;
        Token char_literal137=null;
        celluloidParser.variableList_return variableList136 = null;

        celluloidParser.functionBlock_return functionBlock138 = null;


        Object string_literal133_tree=null;
        Object ID134_tree=null;
        Object char_literal135_tree=null;
        Object char_literal137_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_variableList=new RewriteRuleSubtreeStream(adaptor,"rule variableList");
        RewriteRuleSubtreeStream stream_functionBlock=new RewriteRuleSubtreeStream(adaptor,"rule functionBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:284:5: ( 'function' ID '(' variableList ')' functionBlock -> ^( FUNC ID variableList ( functionBlock )? ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:284:10: 'function' ID '(' variableList ')' functionBlock
            {
            string_literal133=(Token)match(input,77,FOLLOW_77_in_functionDefinition2810); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_77.add(string_literal133);

            ID134=(Token)match(input,ID,FOLLOW_ID_in_functionDefinition2812); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID134);

            char_literal135=(Token)match(input,68,FOLLOW_68_in_functionDefinition2814); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_68.add(char_literal135);

            pushFollow(FOLLOW_variableList_in_functionDefinition2816);
            variableList136=variableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableList.add(variableList136.getTree());
            char_literal137=(Token)match(input,69,FOLLOW_69_in_functionDefinition2818); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_69.add(char_literal137);

            pushFollow(FOLLOW_functionBlock_in_functionDefinition2820);
            functionBlock138=functionBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionBlock.add(functionBlock138.getTree());


            // AST REWRITE
            // elements: ID, functionBlock, variableList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 285:10: -> ^( FUNC ID variableList ( functionBlock )? )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:285:13: ^( FUNC ID variableList ( functionBlock )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC, "FUNC"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_variableList.nextTree());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:285:36: ( functionBlock )?
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
            if ( state.backtracking>0 ) { memoize(input, 29, functionDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionDefinition"

    public static class predicateHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predicateHeader"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:291:1: predicateHeader : 'predicate' ID '(' variableList ')' NEWLINE -> ^( PREDHEAD ID variableList ) ;
    public final celluloidParser.predicateHeader_return predicateHeader() throws RecognitionException {
        celluloidParser.predicateHeader_return retval = new celluloidParser.predicateHeader_return();
        retval.start = input.LT(1);
        int predicateHeader_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal139=null;
        Token ID140=null;
        Token char_literal141=null;
        Token char_literal143=null;
        Token NEWLINE144=null;
        celluloidParser.variableList_return variableList142 = null;


        Object string_literal139_tree=null;
        Object ID140_tree=null;
        Object char_literal141_tree=null;
        Object char_literal143_tree=null;
        Object NEWLINE144_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_variableList=new RewriteRuleSubtreeStream(adaptor,"rule variableList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:292:5: ( 'predicate' ID '(' variableList ')' NEWLINE -> ^( PREDHEAD ID variableList ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:292:10: 'predicate' ID '(' variableList ')' NEWLINE
            {
            string_literal139=(Token)match(input,78,FOLLOW_78_in_predicateHeader2880); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_78.add(string_literal139);

            ID140=(Token)match(input,ID,FOLLOW_ID_in_predicateHeader2882); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID140);

            char_literal141=(Token)match(input,68,FOLLOW_68_in_predicateHeader2884); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_68.add(char_literal141);

            pushFollow(FOLLOW_variableList_in_predicateHeader2886);
            variableList142=variableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableList.add(variableList142.getTree());
            char_literal143=(Token)match(input,69,FOLLOW_69_in_predicateHeader2888); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_69.add(char_literal143);

            NEWLINE144=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_predicateHeader2890); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE144);



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
            // 293:10: -> ^( PREDHEAD ID variableList )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:293:13: ^( PREDHEAD ID variableList )
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
            if ( state.backtracking>0 ) { memoize(input, 30, predicateHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "predicateHeader"

    public static class predicateDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predicateDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:297:1: predicateDefinition : 'predicate' ID '(' variableList ')' predicateBlock -> ^( PRED ID variableList predicateBlock ) ;
    public final celluloidParser.predicateDefinition_return predicateDefinition() throws RecognitionException {
        celluloidParser.predicateDefinition_return retval = new celluloidParser.predicateDefinition_return();
        retval.start = input.LT(1);
        int predicateDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal145=null;
        Token ID146=null;
        Token char_literal147=null;
        Token char_literal149=null;
        celluloidParser.variableList_return variableList148 = null;

        celluloidParser.predicateBlock_return predicateBlock150 = null;


        Object string_literal145_tree=null;
        Object ID146_tree=null;
        Object char_literal147_tree=null;
        Object char_literal149_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_predicateBlock=new RewriteRuleSubtreeStream(adaptor,"rule predicateBlock");
        RewriteRuleSubtreeStream stream_variableList=new RewriteRuleSubtreeStream(adaptor,"rule variableList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:298:5: ( 'predicate' ID '(' variableList ')' predicateBlock -> ^( PRED ID variableList predicateBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:298:10: 'predicate' ID '(' variableList ')' predicateBlock
            {
            string_literal145=(Token)match(input,78,FOLLOW_78_in_predicateDefinition2941); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_78.add(string_literal145);

            ID146=(Token)match(input,ID,FOLLOW_ID_in_predicateDefinition2943); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID146);

            char_literal147=(Token)match(input,68,FOLLOW_68_in_predicateDefinition2945); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_68.add(char_literal147);

            pushFollow(FOLLOW_variableList_in_predicateDefinition2947);
            variableList148=variableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableList.add(variableList148.getTree());
            char_literal149=(Token)match(input,69,FOLLOW_69_in_predicateDefinition2949); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_69.add(char_literal149);

            pushFollow(FOLLOW_predicateBlock_in_predicateDefinition2951);
            predicateBlock150=predicateBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_predicateBlock.add(predicateBlock150.getTree());


            // AST REWRITE
            // elements: predicateBlock, ID, variableList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 299:7: -> ^( PRED ID variableList predicateBlock )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:299:10: ^( PRED ID variableList predicateBlock )
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
            if ( state.backtracking>0 ) { memoize(input, 31, predicateDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "predicateDefinition"

    public static class predicateBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predicateBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:302:1: predicateBlock : START (block+= functionPredicateBlockDeclaration )* 'return' retexp= assignmentExpression NEWLINE END -> ^( FUNBLOCK[$START, \"FUNBLOCK\"] ^( RETURN $retexp) ( $block)* ) ;
    public final celluloidParser.predicateBlock_return predicateBlock() throws RecognitionException {
        celluloidParser.predicateBlock_return retval = new celluloidParser.predicateBlock_return();
        retval.start = input.LT(1);
        int predicateBlock_StartIndex = input.index();
        Object root_0 = null;

        Token START151=null;
        Token string_literal152=null;
        Token NEWLINE153=null;
        Token END154=null;
        List list_block=null;
        celluloidParser.assignmentExpression_return retexp = null;

        RuleReturnScope block = null;
        Object START151_tree=null;
        Object string_literal152_tree=null;
        Object NEWLINE153_tree=null;
        Object END154_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_functionPredicateBlockDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule functionPredicateBlockDeclaration");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:303:5: ( START (block+= functionPredicateBlockDeclaration )* 'return' retexp= assignmentExpression NEWLINE END -> ^( FUNBLOCK[$START, \"FUNBLOCK\"] ^( RETURN $retexp) ( $block)* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:304:10: START (block+= functionPredicateBlockDeclaration )* 'return' retexp= assignmentExpression NEWLINE END
            {
            START151=(Token)match(input,START,FOLLOW_START_in_predicateBlock3015); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START151);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:305:12: (block+= functionPredicateBlockDeclaration )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==TYPE||LA43_0==ID||LA43_0==LITERAL||LA43_0==62||LA43_0==64||LA43_0==67) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:305:14: block+= functionPredicateBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_functionPredicateBlockDeclaration_in_predicateBlock3034);
            	    block=functionPredicateBlockDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_functionPredicateBlockDeclaration.add(block.getTree());
            	    if (list_block==null) list_block=new ArrayList();
            	    list_block.add(block.getTree());


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            string_literal152=(Token)match(input,79,FOLLOW_79_in_predicateBlock3051); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_79.add(string_literal152);

            pushFollow(FOLLOW_assignmentExpression_in_predicateBlock3057);
            retexp=assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignmentExpression.add(retexp.getTree());
            NEWLINE153=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_predicateBlock3059); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE153);

            END154=(Token)match(input,END,FOLLOW_END_in_predicateBlock3071); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END154);



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
            // 308:10: -> ^( FUNBLOCK[$START, \"FUNBLOCK\"] ^( RETURN $retexp) ( $block)* )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:308:13: ^( FUNBLOCK[$START, \"FUNBLOCK\"] ^( RETURN $retexp) ( $block)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNBLOCK, START151, "FUNBLOCK"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:308:44: ^( RETURN $retexp)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_2);

                adaptor.addChild(root_2, stream_retexp.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:308:62: ( $block)*
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
            if ( state.backtracking>0 ) { memoize(input, 32, predicateBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "predicateBlock"

    public static class eventDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eventDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:315:1: eventDefinition : 'event' ID NEWLINE -> ^( EVENT ID ) ;
    public final celluloidParser.eventDefinition_return eventDefinition() throws RecognitionException {
        celluloidParser.eventDefinition_return retval = new celluloidParser.eventDefinition_return();
        retval.start = input.LT(1);
        int eventDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal155=null;
        Token ID156=null;
        Token NEWLINE157=null;

        Object string_literal155_tree=null;
        Object ID156_tree=null;
        Object NEWLINE157_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:316:5: ( 'event' ID NEWLINE -> ^( EVENT ID ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:316:10: 'event' ID NEWLINE
            {
            string_literal155=(Token)match(input,80,FOLLOW_80_in_eventDefinition3142); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_80.add(string_literal155);

            ID156=(Token)match(input,ID,FOLLOW_ID_in_eventDefinition3144); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID156);

            NEWLINE157=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_eventDefinition3146); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE157);



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
            // 317:10: -> ^( EVENT ID )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:317:13: ^( EVENT ID )
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
            if ( state.backtracking>0 ) { memoize(input, 33, eventDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "eventDefinition"

    public static class announcementDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "announcementDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:323:1: announcementDeclaration : 'announce' eventName= ID 'when' functionName= ID (predicateExpr= variableDeclaration )? NEWLINE -> ^( ANNOUNCEMENT $eventName $functionName ( $predicateExpr)? ) ;
    public final celluloidParser.announcementDeclaration_return announcementDeclaration() throws RecognitionException {
        celluloidParser.announcementDeclaration_return retval = new celluloidParser.announcementDeclaration_return();
        retval.start = input.LT(1);
        int announcementDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token eventName=null;
        Token functionName=null;
        Token string_literal158=null;
        Token string_literal159=null;
        Token NEWLINE160=null;
        celluloidParser.variableDeclaration_return predicateExpr = null;


        Object eventName_tree=null;
        Object functionName_tree=null;
        Object string_literal158_tree=null;
        Object string_literal159_tree=null;
        Object NEWLINE160_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:324:5: ( 'announce' eventName= ID 'when' functionName= ID (predicateExpr= variableDeclaration )? NEWLINE -> ^( ANNOUNCEMENT $eventName $functionName ( $predicateExpr)? ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:325:10: 'announce' eventName= ID 'when' functionName= ID (predicateExpr= variableDeclaration )? NEWLINE
            {
            string_literal158=(Token)match(input,81,FOLLOW_81_in_announcementDeclaration3205); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_81.add(string_literal158);

            eventName=(Token)match(input,ID,FOLLOW_ID_in_announcementDeclaration3211); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(eventName);

            string_literal159=(Token)match(input,74,FOLLOW_74_in_announcementDeclaration3213); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_74.add(string_literal159);

            functionName=(Token)match(input,ID,FOLLOW_ID_in_announcementDeclaration3219); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(functionName);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:325:61: (predicateExpr= variableDeclaration )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==TYPE||LA44_0==62) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:325:62: predicateExpr= variableDeclaration
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_announcementDeclaration3226);
                    predicateExpr=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(predicateExpr.getTree());

                    }
                    break;

            }

            NEWLINE160=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_announcementDeclaration3230); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE160);



            // AST REWRITE
            // elements: functionName, eventName, predicateExpr
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
            // 326:10: -> ^( ANNOUNCEMENT $eventName $functionName ( $predicateExpr)? )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:326:13: ^( ANNOUNCEMENT $eventName $functionName ( $predicateExpr)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ANNOUNCEMENT, "ANNOUNCEMENT"), root_1);

                adaptor.addChild(root_1, stream_eventName.nextNode());
                adaptor.addChild(root_1, stream_functionName.nextNode());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:326:53: ( $predicateExpr)?
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
            if ( state.backtracking>0 ) { memoize(input, 34, announcementDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "announcementDeclaration"

    public static class constraintBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constraintBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:331:1: constraintBlock : START (vars+= variableDeclaration | preds+= predicateHeader | funcs+= functionHeader | announcements+= announcementDeclaration )* END -> ^( CONBLOCK ( $vars)* ( $preds)* ( $funcs)* ^( ANNOUNCEMENTS ( $announcements)* ) ) ;
    public final celluloidParser.constraintBlock_return constraintBlock() throws RecognitionException {
        celluloidParser.constraintBlock_return retval = new celluloidParser.constraintBlock_return();
        retval.start = input.LT(1);
        int constraintBlock_StartIndex = input.index();
        Object root_0 = null;

        Token START161=null;
        Token END162=null;
        List list_vars=null;
        List list_preds=null;
        List list_funcs=null;
        List list_announcements=null;
        RuleReturnScope vars = null;
        RuleReturnScope preds = null;
        RuleReturnScope funcs = null;
        RuleReturnScope announcements = null;
        Object START161_tree=null;
        Object END162_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_functionHeader=new RewriteRuleSubtreeStream(adaptor,"rule functionHeader");
        RewriteRuleSubtreeStream stream_predicateHeader=new RewriteRuleSubtreeStream(adaptor,"rule predicateHeader");
        RewriteRuleSubtreeStream stream_announcementDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule announcementDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:332:5: ( START (vars+= variableDeclaration | preds+= predicateHeader | funcs+= functionHeader | announcements+= announcementDeclaration )* END -> ^( CONBLOCK ( $vars)* ( $preds)* ( $funcs)* ^( ANNOUNCEMENTS ( $announcements)* ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:332:10: START (vars+= variableDeclaration | preds+= predicateHeader | funcs+= functionHeader | announcements+= announcementDeclaration )* END
            {
            START161=(Token)match(input,START,FOLLOW_START_in_constraintBlock3279); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START161);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:333:14: (vars+= variableDeclaration | preds+= predicateHeader | funcs+= functionHeader | announcements+= announcementDeclaration )*
            loop45:
            do {
                int alt45=5;
                switch ( input.LA(1) ) {
                case TYPE:
                case 62:
                    {
                    alt45=1;
                    }
                    break;
                case 78:
                    {
                    alt45=2;
                    }
                    break;
                case 77:
                    {
                    alt45=3;
                    }
                    break;
                case 81:
                    {
                    alt45=4;
                    }
                    break;

                }

                switch (alt45) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:333:15: vars+= variableDeclaration
            	    {
            	    pushFollow(FOLLOW_variableDeclaration_in_constraintBlock3300);
            	    vars=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclaration.add(vars.getTree());
            	    if (list_vars==null) list_vars=new ArrayList();
            	    list_vars.add(vars.getTree());


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:333:45: preds+= predicateHeader
            	    {
            	    pushFollow(FOLLOW_predicateHeader_in_constraintBlock3308);
            	    preds=predicateHeader();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_predicateHeader.add(preds.getTree());
            	    if (list_preds==null) list_preds=new ArrayList();
            	    list_preds.add(preds.getTree());


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:333:72: funcs+= functionHeader
            	    {
            	    pushFollow(FOLLOW_functionHeader_in_constraintBlock3316);
            	    funcs=functionHeader();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_functionHeader.add(funcs.getTree());
            	    if (list_funcs==null) list_funcs=new ArrayList();
            	    list_funcs.add(funcs.getTree());


            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:333:98: announcements+= announcementDeclaration
            	    {
            	    pushFollow(FOLLOW_announcementDeclaration_in_constraintBlock3324);
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

            END162=(Token)match(input,END,FOLLOW_END_in_constraintBlock3337); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END162);



            // AST REWRITE
            // elements: preds, vars, funcs, announcements
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
            // 335:10: -> ^( CONBLOCK ( $vars)* ( $preds)* ( $funcs)* ^( ANNOUNCEMENTS ( $announcements)* ) )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:335:13: ^( CONBLOCK ( $vars)* ( $preds)* ( $funcs)* ^( ANNOUNCEMENTS ( $announcements)* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONBLOCK, "CONBLOCK"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:335:24: ( $vars)*
                while ( stream_vars.hasNext() ) {
                    adaptor.addChild(root_1, stream_vars.nextTree());

                }
                stream_vars.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:335:31: ( $preds)*
                while ( stream_preds.hasNext() ) {
                    adaptor.addChild(root_1, stream_preds.nextTree());

                }
                stream_preds.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:335:39: ( $funcs)*
                while ( stream_funcs.hasNext() ) {
                    adaptor.addChild(root_1, stream_funcs.nextTree());

                }
                stream_funcs.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:335:47: ^( ANNOUNCEMENTS ( $announcements)* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ANNOUNCEMENTS, "ANNOUNCEMENTS"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:335:63: ( $announcements)*
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
            if ( state.backtracking>0 ) { memoize(input, 35, constraintBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constraintBlock"

    public static class constraintDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constraintDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:338:1: constraintDefinition : 'constraint' ID ( 'requires' requires= idList )? ( 'announces' announces= idList )? constraintBlock -> ^( CONSTRAINT ID ^( REQUIRES ( $requires)? ) ^( ANNOUNCES ( $announces)? ) constraintBlock ) ;
    public final celluloidParser.constraintDefinition_return constraintDefinition() throws RecognitionException {
        celluloidParser.constraintDefinition_return retval = new celluloidParser.constraintDefinition_return();
        retval.start = input.LT(1);
        int constraintDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal163=null;
        Token ID164=null;
        Token string_literal165=null;
        Token string_literal166=null;
        celluloidParser.idList_return requires = null;

        celluloidParser.idList_return announces = null;

        celluloidParser.constraintBlock_return constraintBlock167 = null;


        Object string_literal163_tree=null;
        Object ID164_tree=null;
        Object string_literal165_tree=null;
        Object string_literal166_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_constraintBlock=new RewriteRuleSubtreeStream(adaptor,"rule constraintBlock");
        RewriteRuleSubtreeStream stream_idList=new RewriteRuleSubtreeStream(adaptor,"rule idList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:339:5: ( 'constraint' ID ( 'requires' requires= idList )? ( 'announces' announces= idList )? constraintBlock -> ^( CONSTRAINT ID ^( REQUIRES ( $requires)? ) ^( ANNOUNCES ( $announces)? ) constraintBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:339:10: 'constraint' ID ( 'requires' requires= idList )? ( 'announces' announces= idList )? constraintBlock
            {
            string_literal163=(Token)match(input,82,FOLLOW_82_in_constraintDefinition3399); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_82.add(string_literal163);

            ID164=(Token)match(input,ID,FOLLOW_ID_in_constraintDefinition3401); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID164);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:339:26: ( 'requires' requires= idList )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==83) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:339:27: 'requires' requires= idList
                    {
                    string_literal165=(Token)match(input,83,FOLLOW_83_in_constraintDefinition3404); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_83.add(string_literal165);

                    pushFollow(FOLLOW_idList_in_constraintDefinition3410);
                    requires=idList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_idList.add(requires.getTree());

                    }
                    break;

            }

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:340:10: ( 'announces' announces= idList )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==84) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:340:11: 'announces' announces= idList
                    {
                    string_literal166=(Token)match(input,84,FOLLOW_84_in_constraintDefinition3424); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_84.add(string_literal166);

                    pushFollow(FOLLOW_idList_in_constraintDefinition3430);
                    announces=idList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_idList.add(announces.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_constraintBlock_in_constraintDefinition3444);
            constraintBlock167=constraintBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_constraintBlock.add(constraintBlock167.getTree());


            // AST REWRITE
            // elements: constraintBlock, ID, announces, requires
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
            // 342:10: -> ^( CONSTRAINT ID ^( REQUIRES ( $requires)? ) ^( ANNOUNCES ( $announces)? ) constraintBlock )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:342:13: ^( CONSTRAINT ID ^( REQUIRES ( $requires)? ) ^( ANNOUNCES ( $announces)? ) constraintBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINT, "CONSTRAINT"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:342:29: ^( REQUIRES ( $requires)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(REQUIRES, "REQUIRES"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:342:40: ( $requires)?
                if ( stream_requires.hasNext() ) {
                    adaptor.addChild(root_2, stream_requires.nextTree());

                }
                stream_requires.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:342:52: ^( ANNOUNCES ( $announces)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ANNOUNCES, "ANNOUNCES"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:342:64: ( $announces)?
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
            if ( state.backtracking>0 ) { memoize(input, 36, constraintDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constraintDefinition"

    public static class deviceBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "deviceBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:348:1: deviceBlock : START (vars+= variableDeclaration | preds+= predicateDefinition | funcs+= functionDefinition )* END -> ^( DEVBLOCK ( $vars)* ( $preds)* ( $funcs)* ) ;
    public final celluloidParser.deviceBlock_return deviceBlock() throws RecognitionException {
        celluloidParser.deviceBlock_return retval = new celluloidParser.deviceBlock_return();
        retval.start = input.LT(1);
        int deviceBlock_StartIndex = input.index();
        Object root_0 = null;

        Token START168=null;
        Token END169=null;
        List list_vars=null;
        List list_preds=null;
        List list_funcs=null;
        RuleReturnScope vars = null;
        RuleReturnScope preds = null;
        RuleReturnScope funcs = null;
        Object START168_tree=null;
        Object END169_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_functionDefinition=new RewriteRuleSubtreeStream(adaptor,"rule functionDefinition");
        RewriteRuleSubtreeStream stream_predicateDefinition=new RewriteRuleSubtreeStream(adaptor,"rule predicateDefinition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:349:5: ( START (vars+= variableDeclaration | preds+= predicateDefinition | funcs+= functionDefinition )* END -> ^( DEVBLOCK ( $vars)* ( $preds)* ( $funcs)* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:349:10: START (vars+= variableDeclaration | preds+= predicateDefinition | funcs+= functionDefinition )* END
            {
            START168=(Token)match(input,START,FOLLOW_START_in_deviceBlock3533); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START168);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:350:14: (vars+= variableDeclaration | preds+= predicateDefinition | funcs+= functionDefinition )*
            loop48:
            do {
                int alt48=4;
                switch ( input.LA(1) ) {
                case TYPE:
                case 62:
                    {
                    alt48=1;
                    }
                    break;
                case 78:
                    {
                    alt48=2;
                    }
                    break;
                case 77:
                    {
                    alt48=3;
                    }
                    break;

                }

                switch (alt48) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:350:15: vars+= variableDeclaration
            	    {
            	    pushFollow(FOLLOW_variableDeclaration_in_deviceBlock3554);
            	    vars=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclaration.add(vars.getTree());
            	    if (list_vars==null) list_vars=new ArrayList();
            	    list_vars.add(vars.getTree());


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:350:45: preds+= predicateDefinition
            	    {
            	    pushFollow(FOLLOW_predicateDefinition_in_deviceBlock3562);
            	    preds=predicateDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_predicateDefinition.add(preds.getTree());
            	    if (list_preds==null) list_preds=new ArrayList();
            	    list_preds.add(preds.getTree());


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:350:76: funcs+= functionDefinition
            	    {
            	    pushFollow(FOLLOW_functionDefinition_in_deviceBlock3570);
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

            END169=(Token)match(input,END,FOLLOW_END_in_deviceBlock3584); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END169);



            // AST REWRITE
            // elements: funcs, vars, preds
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
            // 352:10: -> ^( DEVBLOCK ( $vars)* ( $preds)* ( $funcs)* )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:352:13: ^( DEVBLOCK ( $vars)* ( $preds)* ( $funcs)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEVBLOCK, "DEVBLOCK"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:352:24: ( $vars)*
                while ( stream_vars.hasNext() ) {
                    adaptor.addChild(root_1, stream_vars.nextTree());

                }
                stream_vars.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:352:31: ( $preds)*
                while ( stream_preds.hasNext() ) {
                    adaptor.addChild(root_1, stream_preds.nextTree());

                }
                stream_preds.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:352:39: ( $funcs)*
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
            if ( state.backtracking>0 ) { memoize(input, 37, deviceBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "deviceBlock"

    public static class deviceDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "deviceDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:354:1: deviceDefinition : 'device' ID ( 'accepts' accepts= idList )? deviceBlock -> ^( DEVICE ID ^( ACCEPTS ( $accepts)? ) deviceBlock ) ;
    public final celluloidParser.deviceDefinition_return deviceDefinition() throws RecognitionException {
        celluloidParser.deviceDefinition_return retval = new celluloidParser.deviceDefinition_return();
        retval.start = input.LT(1);
        int deviceDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal170=null;
        Token ID171=null;
        Token string_literal172=null;
        celluloidParser.idList_return accepts = null;

        celluloidParser.deviceBlock_return deviceBlock173 = null;


        Object string_literal170_tree=null;
        Object ID171_tree=null;
        Object string_literal172_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_idList=new RewriteRuleSubtreeStream(adaptor,"rule idList");
        RewriteRuleSubtreeStream stream_deviceBlock=new RewriteRuleSubtreeStream(adaptor,"rule deviceBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:355:5: ( 'device' ID ( 'accepts' accepts= idList )? deviceBlock -> ^( DEVICE ID ^( ACCEPTS ( $accepts)? ) deviceBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:355:10: 'device' ID ( 'accepts' accepts= idList )? deviceBlock
            {
            string_literal170=(Token)match(input,85,FOLLOW_85_in_deviceDefinition3636); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_85.add(string_literal170);

            ID171=(Token)match(input,ID,FOLLOW_ID_in_deviceDefinition3638); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID171);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:355:22: ( 'accepts' accepts= idList )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==86) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:355:23: 'accepts' accepts= idList
                    {
                    string_literal172=(Token)match(input,86,FOLLOW_86_in_deviceDefinition3641); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_86.add(string_literal172);

                    pushFollow(FOLLOW_idList_in_deviceDefinition3647);
                    accepts=idList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_idList.add(accepts.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_deviceBlock_in_deviceDefinition3651);
            deviceBlock173=deviceBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_deviceBlock.add(deviceBlock173.getTree());


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
            // 356:10: -> ^( DEVICE ID ^( ACCEPTS ( $accepts)? ) deviceBlock )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:356:13: ^( DEVICE ID ^( ACCEPTS ( $accepts)? ) deviceBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEVICE, "DEVICE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:356:25: ^( ACCEPTS ( $accepts)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ACCEPTS, "ACCEPTS"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:356:35: ( $accepts)?
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
            if ( state.backtracking>0 ) { memoize(input, 38, deviceDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "deviceDefinition"

    // $ANTLR start synpred1_celluloid
    public final void synpred1_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:115:11: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:115:11: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred1_celluloid908); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_celluloid

    // $ANTLR start synpred4_celluloid
    public final void synpred4_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:120:11: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:120:11: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred4_celluloid996); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_celluloid

    // $ANTLR start synpred5_celluloid
    public final void synpred5_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:131:11: ( logicalORExpression )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:131:11: logicalORExpression
        {
        pushFollow(FOLLOW_logicalORExpression_in_synpred5_celluloid1136);
        logicalORExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_celluloid

    // $ANTLR start synpred51_celluloid
    public final void synpred51_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:257:36: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:257:36: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred51_celluloid2545); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_celluloid

    // $ANTLR start synpred53_celluloid
    public final void synpred53_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:271:10: ( functionPredicateCall )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:271:10: functionPredicateCall
        {
        pushFollow(FOLLOW_functionPredicateCall_in_synpred53_celluloid2663);
        functionPredicateCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_celluloid

    // Delegated rules

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
    public final boolean synpred51_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_celluloid_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_60_in_language_block_decl281 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LANGUAGE_in_language_block_decl283 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_START_in_language_block_decl285 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_language_block_in_language_block_decl287 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_END_in_language_block_decl289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_language_block319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_variableDeclaration893 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_variableDeclaration895 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_variableDeclaration908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_variableDeclaration978 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_variableDeclaration980 = new BitSet(new long[]{0x8000020000000002L});
    public static final BitSet FOLLOW_initializer_in_variableDeclaration982 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_variableDeclaration996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_initializer1078 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_LITERAL_in_initializer1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_assignmentExpression1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_assignmentExpression1148 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ASSIGNMENT_OPERATOR_in_assignmentExpression1150 = new BitSet(new long[]{0x0800010000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_logicalORExpression1204 = new BitSet(new long[]{0x0800010000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression1207 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_logicalORExpression1210 = new BitSet(new long[]{0x0800010000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalANDExpression1234 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_logicalANDExpression1237 = new BitSet(new long[]{0x0800010000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalANDExpression1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1266 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_EQUALITY_OPERATOR_in_equalityExpression1269 = new BitSet(new long[]{0x0800010000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_equalityExpression_in_equalityExpression1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1295 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_RELATIONAL_OPERATOR_in_relationalExpression1298 = new BitSet(new long[]{0x0800010000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_relationalExpression_in_relationalExpression1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1325 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ADDITIVE_OPERATOR_in_additiveExpression1328 = new BitSet(new long[]{0x0800010000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_additiveExpression_in_additiveExpression1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_multiplicativeExpression1343 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_MULTIPLICATIVE_OPERATOR_in_multiplicativeExpression1346 = new BitSet(new long[]{0x0800010000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_multiplicativeExpression1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primaryExpression1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_primaryExpression1366 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_primaryExpression1368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_primaryExpression1370 = new BitSet(new long[]{0x0800010000000000L,0x0000000000000019L});
    public static final BitSet FOLLOW_expressionList_in_primaryExpression1372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_primaryExpression1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_in_primaryExpression1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionPredicateCall_in_primaryExpression1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idList1412 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_idList1415 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_idList1421 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_68_in_idList1449 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_idList1455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_70_in_idList1458 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_idList1464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_idList1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1509 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_variableList1512 = new BitSet(new long[]{0x4000001000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1518 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_68_in_variableList1556 = new BitSet(new long[]{0x4000001000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_70_in_variableList1565 = new BitSet(new long[]{0x4000001000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_variableList1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1624 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_expressionList1627 = new BitSet(new long[]{0x0800010000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1633 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_68_in_expressionList1656 = new BitSet(new long[]{0x0800010000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_70_in_expressionList1665 = new BitSet(new long[]{0x0800010000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_expressionList1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_inBlockDeclaration1705 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_inBlockDeclaration1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_inBlockDeclaration1717 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_inBlockDeclaration1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whenStatement_in_inBlockDeclaration1729 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_inBlockDeclaration1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_everyStatement_in_inBlockDeclaration1741 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_inBlockDeclaration1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraintFunctionCall_in_inBlockDeclaration1753 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_inBlockDeclaration1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_inBlock1772 = new BitSet(new long[]{0x0800018000000000L,0x0000000000001C89L});
    public static final BitSet FOLLOW_inBlockDeclaration_in_inBlock1791 = new BitSet(new long[]{0x0800018000000000L,0x0000000000001C89L});
    public static final BitSet FOLLOW_END_in_inBlock1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_inStatement1838 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_inStatement1840 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_inBlock_in_inStatement1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ifStatement1890 = new BitSet(new long[]{0x0800010000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_logicalORExpression_in_ifStatement1896 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_START_in_ifStatement1906 = new BitSet(new long[]{0x1800010000000000L,0x0000000000000089L});
    public static final BitSet FOLLOW_assignmentExpression_in_ifStatement1926 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_inStatement_in_ifStatement1930 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ifStatement_in_ifStatement1934 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_ifStatement1937 = new BitSet(new long[]{0x1800018000000000L,0x0000000000000389L});
    public static final BitSet FOLLOW_elseIfStatement_in_ifStatement1959 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_elseStatement_in_ifStatement1975 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_END_in_ifStatement1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_elseIfStatement2050 = new BitSet(new long[]{0x0800010000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_logicalORExpression_in_elseIfStatement2057 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_elseIfStatement2059 = new BitSet(new long[]{0x1800010000000002L,0x0000000000000089L});
    public static final BitSet FOLLOW_assignmentExpression_in_elseIfStatement2082 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_inStatement_in_elseIfStatement2086 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ifStatement_in_elseIfStatement2090 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_elseIfStatement2093 = new BitSet(new long[]{0x1800010000000002L,0x0000000000000089L});
    public static final BitSet FOLLOW_73_in_elseStatement2137 = new BitSet(new long[]{0x1800010000000002L,0x0000000000000089L});
    public static final BitSet FOLLOW_assignmentExpression_in_elseStatement2145 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_inStatement_in_elseStatement2149 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ifStatement_in_elseStatement2153 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_elseStatement2156 = new BitSet(new long[]{0x1800010000000002L,0x0000000000000089L});
    public static final BitSet FOLLOW_74_in_whenStatement2201 = new BitSet(new long[]{0x0800010000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_75_in_whenStatement2205 = new BitSet(new long[]{0x0800010000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_logicalORExpression_in_whenStatement2208 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_START_in_whenStatement2218 = new BitSet(new long[]{0x0800010000000000L,0x0000000000001C89L});
    public static final BitSet FOLLOW_assignmentExpression_in_whenStatement2227 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_constraintFunctionCall_in_whenStatement2231 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ifStatement_in_whenStatement2235 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_whenStatement2238 = new BitSet(new long[]{0x0800018000000000L,0x0000000000001C89L});
    public static final BitSet FOLLOW_END_in_whenStatement2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_everyStatement2334 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TIME_in_everyStatement2336 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_74_in_everyStatement2344 = new BitSet(new long[]{0x0800010000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_75_in_everyStatement2348 = new BitSet(new long[]{0x0800010000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_logicalORExpression_in_everyStatement2351 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_START_in_everyStatement2363 = new BitSet(new long[]{0x0800018000000000L,0x0000000000001C89L});
    public static final BitSet FOLLOW_assignmentExpression_in_everyStatement2384 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_constraintFunctionCall_in_everyStatement2388 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ifStatement_in_everyStatement2392 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_everyStatement2395 = new BitSet(new long[]{0x0800018000000000L,0x0000000000001C89L});
    public static final BitSet FOLLOW_END_in_everyStatement2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_constraintFunctionCall2500 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_constraintFunctionCall2502 = new BitSet(new long[]{0x0800010000000000L,0x0000000000000019L});
    public static final BitSet FOLLOW_expressionList_in_constraintFunctionCall2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_functionPredicateCall2537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_functionPredicateCall2539 = new BitSet(new long[]{0x0800010000000000L,0x0000000000000019L});
    public static final BitSet FOLLOW_expressionList_in_functionPredicateCall2541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_functionPredicateCall2543 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_functionPredicateCall2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_functionHeader2602 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_functionHeader2604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_functionHeader2606 = new BitSet(new long[]{0x4000001000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_variableList_in_functionHeader2608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_functionHeader2610 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_functionHeader2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_functionPredicateBlockDeclaration2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionPredicateCall_in_functionPredicateBlockDeclaration2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_functionPredicateBlockDeclaration2674 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_functionPredicateBlockDeclaration2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_functionBlock2701 = new BitSet(new long[]{0x4800019000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_functionPredicateBlockDeclaration_in_functionBlock2721 = new BitSet(new long[]{0x4800019000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_END_in_functionBlock2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_functionDefinition2810 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_functionDefinition2812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_functionDefinition2814 = new BitSet(new long[]{0x4000001000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_variableList_in_functionDefinition2816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_functionDefinition2818 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_functionBlock_in_functionDefinition2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_predicateHeader2880 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_predicateHeader2882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_predicateHeader2884 = new BitSet(new long[]{0x4000001000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_variableList_in_predicateHeader2886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_predicateHeader2888 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_predicateHeader2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_predicateDefinition2941 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_predicateDefinition2943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_predicateDefinition2945 = new BitSet(new long[]{0x4000001000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_variableList_in_predicateDefinition2947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_predicateDefinition2949 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_predicateBlock_in_predicateDefinition2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_predicateBlock3015 = new BitSet(new long[]{0x4800011000000000L,0x0000000000008009L});
    public static final BitSet FOLLOW_functionPredicateBlockDeclaration_in_predicateBlock3034 = new BitSet(new long[]{0x4800011000000000L,0x0000000000008009L});
    public static final BitSet FOLLOW_79_in_predicateBlock3051 = new BitSet(new long[]{0x0800010000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_assignmentExpression_in_predicateBlock3057 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_predicateBlock3059 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_END_in_predicateBlock3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_eventDefinition3142 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_eventDefinition3144 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_eventDefinition3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_announcementDeclaration3205 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_announcementDeclaration3211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_announcementDeclaration3213 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_announcementDeclaration3219 = new BitSet(new long[]{0x4000021000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_announcementDeclaration3226 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_announcementDeclaration3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_constraintBlock3279 = new BitSet(new long[]{0x4000009000000000L,0x0000000000026000L});
    public static final BitSet FOLLOW_variableDeclaration_in_constraintBlock3300 = new BitSet(new long[]{0x4000009000000000L,0x0000000000026000L});
    public static final BitSet FOLLOW_predicateHeader_in_constraintBlock3308 = new BitSet(new long[]{0x4000009000000000L,0x0000000000026000L});
    public static final BitSet FOLLOW_functionHeader_in_constraintBlock3316 = new BitSet(new long[]{0x4000009000000000L,0x0000000000026000L});
    public static final BitSet FOLLOW_announcementDeclaration_in_constraintBlock3324 = new BitSet(new long[]{0x4000009000000000L,0x0000000000026000L});
    public static final BitSet FOLLOW_END_in_constraintBlock3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_constraintDefinition3399 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_constraintDefinition3401 = new BitSet(new long[]{0x0000004000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_83_in_constraintDefinition3404 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_idList_in_constraintDefinition3410 = new BitSet(new long[]{0x0000004000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_84_in_constraintDefinition3424 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_idList_in_constraintDefinition3430 = new BitSet(new long[]{0x0000004000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_constraintBlock_in_constraintDefinition3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_deviceBlock3533 = new BitSet(new long[]{0x4000009000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_variableDeclaration_in_deviceBlock3554 = new BitSet(new long[]{0x4000009000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_predicateDefinition_in_deviceBlock3562 = new BitSet(new long[]{0x4000009000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_functionDefinition_in_deviceBlock3570 = new BitSet(new long[]{0x4000009000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_END_in_deviceBlock3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_deviceDefinition3636 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_deviceDefinition3638 = new BitSet(new long[]{0x0000004000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_deviceDefinition3641 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_idList_in_deviceDefinition3647 = new BitSet(new long[]{0x0000004000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_deviceBlock_in_deviceDefinition3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred1_celluloid908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred4_celluloid996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_synpred5_celluloid1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred51_celluloid2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionPredicateCall_in_synpred53_celluloid2663 = new BitSet(new long[]{0x0000000000000002L});

}