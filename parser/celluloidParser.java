// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g 2009-12-17 04:34:07

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class celluloidParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VARDEF", "FUNC", "PRED", "ARG", "ARGS", "CALL", "PROGRAM", "EVENTS", "CONSTRAINTS", "DEVICES", "FUNCTIONS", "IF", "ELSEIF", "ELSE", "LISTENER", "EVERY", "COND", "RETURN", "IN", "WHEN", "PROGBLOCK", "INBLOCK", "LISTENBLOCK", "IFBLOCK", "FUNBLOCK", "CONBLOCK", "DEVBLOCK", "FUNHEAD", "PREDHEAD", "EVENT", "CONSTRAINT", "REQUIRES", "ANNOUNCES", "ANNOUNCEMENT", "ANNOUNCEMENTS", "DEVICE", "ACCEPTS", "BOOL", "TYPE", "LANGUAGE", "START", "END", "ID", "NEWLINE", "WS", "COMMENT", "EXPONENT", "NUMBER", "SECOND", "MINUTE", "HOUR", "DAY", "TIME", "ESCAPE", "STRING", "CHAR", "ASSIGNMENT_OPERATOR", "EQUALITY_OPERATOR", "RELATIONAL_OPERATOR", "ADDITIVE_OPERATOR", "MULTIPLICATIVE_OPERATOR", "LITERAL", "'in'", "'*'", "'timeline'", "'='", "'not'", "'or'", "'and'", "'new'", "'('", "')'", "','", "'if'", "'else if'", "'else'", "'when'", "'unless'", "'every'", "'function'", "'predicate'", "'return'", "'event'", "'announce'", "'constraint'", "'requires'", "'announces'", "'device'", "'accepts'"
    };
    public static final int LISTENBLOCK=26;
    public static final int EXPONENT=50;
    public static final int FUNCTIONS=14;
    public static final int CHAR=59;
    public static final int DAY=55;
    public static final int EOF=-1;
    public static final int LISTENER=18;
    public static final int CONBLOCK=29;
    public static final int TYPE=42;
    public static final int ACCEPTS=40;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int ARG=7;
    public static final int ESCAPE=57;
    public static final int RETURN=21;
    public static final int ARGS=8;
    public static final int MULTIPLICATIVE_OPERATOR=64;
    public static final int VARDEF=4;
    public static final int COMMENT=49;
    public static final int T__80=80;
    public static final int SECOND=52;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int ELSE=17;
    public static final int BOOL=41;
    public static final int NUMBER=51;
    public static final int EVERY=19;
    public static final int T__85=85;
    public static final int ADDITIVE_OPERATOR=63;
    public static final int T__84=84;
    public static final int EVENTS=11;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int T__71=71;
    public static final int LANGUAGE=43;
    public static final int WS=48;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int FUNC=5;
    public static final int INBLOCK=25;
    public static final int ASSIGNMENT_OPERATOR=60;
    public static final int ANNOUNCES=36;
    public static final int CALL=9;
    public static final int T__76=76;
    public static final int END=45;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int CONSTRAINT=34;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int DEVBLOCK=30;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int CONSTRAINTS=12;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int ID=46;
    public static final int EQUALITY_OPERATOR=61;
    public static final int IF=15;
    public static final int FUNHEAD=31;
    public static final int TIME=56;
    public static final int PROGBLOCK=24;
    public static final int IN=22;
    public static final int ANNOUNCEMENT=37;
    public static final int FUNBLOCK=28;
    public static final int DEVICE=39;
    public static final int ANNOUNCEMENTS=38;
    public static final int IFBLOCK=27;
    public static final int PRED=6;
    public static final int LITERAL=65;
    public static final int DEVICES=13;
    public static final int EVENT=33;
    public static final int HOUR=54;
    public static final int RELATIONAL_OPERATOR=62;
    public static final int ELSEIF=16;
    public static final int REQUIRES=35;
    public static final int NEWLINE=47;
    public static final int WHEN=23;
    public static final int PREDHEAD=32;
    public static final int START=44;
    public static final int PROGRAM=10;
    public static final int MINUTE=53;
    public static final int COND=20;
    public static final int STRING=58;

    // delegates
    // delegators


        public celluloidParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public celluloidParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[122+1];
             
             
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:64:1: language_block_decl : 'in' LANGUAGE START language_block END ;
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:64:21: ( 'in' LANGUAGE START language_block END )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:64:23: 'in' LANGUAGE START language_block END
            {
            root_0 = (Object)adaptor.nil();

            string_literal1=(Token)match(input,66,FOLLOW_66_in_language_block_decl311); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal1_tree = (Object)adaptor.create(string_literal1);
            adaptor.addChild(root_0, string_literal1_tree);
            }
            LANGUAGE2=(Token)match(input,LANGUAGE,FOLLOW_LANGUAGE_in_language_block_decl313); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LANGUAGE2_tree = (Object)adaptor.create(LANGUAGE2);
            adaptor.addChild(root_0, LANGUAGE2_tree);
            }
            START3=(Token)match(input,START,FOLLOW_START_in_language_block_decl315); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            START3_tree = (Object)adaptor.create(START3);
            adaptor.addChild(root_0, START3_tree);
            }
            pushFollow(FOLLOW_language_block_in_language_block_decl317);
            language_block4=language_block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, language_block4.getTree());
            END5=(Token)match(input,END,FOLLOW_END_in_language_block_decl319); if (state.failed) return retval;
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:66:1: language_block : '*' ;
    public final celluloidParser.language_block_return language_block() throws RecognitionException {
        celluloidParser.language_block_return retval = new celluloidParser.language_block_return();
        retval.start = input.LT(1);
        int language_block_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal6=null;

        Object char_literal6_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:66:21: ( '*' )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:66:23: '*'
            {
            root_0 = (Object)adaptor.nil();

            char_literal6=(Token)match(input,67,FOLLOW_67_in_language_block349); if (state.failed) return retval;
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:119:1: variableDeclaration : ( 'timeline' ID ( NEWLINE -> ^( VARDEF 'timeline' ID ) | -> ^( ARG 'timeline' ID ) ) | TYPE ID ( initializer )? ( NEWLINE -> ^( VARDEF TYPE ID ( initializer )? ) | -> ^( ARG TYPE ID ) ) );
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
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:120:5: ( 'timeline' ID ( NEWLINE -> ^( VARDEF 'timeline' ID ) | -> ^( ARG 'timeline' ID ) ) | TYPE ID ( initializer )? ( NEWLINE -> ^( VARDEF TYPE ID ( initializer )? ) | -> ^( ARG TYPE ID ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==68) ) {
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:120:10: 'timeline' ID ( NEWLINE -> ^( VARDEF 'timeline' ID ) | -> ^( ARG 'timeline' ID ) )
                    {
                    string_literal7=(Token)match(input,68,FOLLOW_68_in_variableDeclaration923); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_68.add(string_literal7);

                    ID8=(Token)match(input,ID,FOLLOW_ID_in_variableDeclaration925); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID8);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:121:10: ( NEWLINE -> ^( VARDEF 'timeline' ID ) | -> ^( ARG 'timeline' ID ) )
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
                    else if ( (LA1_0==EOF||LA1_0==TYPE||(LA1_0>=END && LA1_0<=ID)||(LA1_0>=LITERAL && LA1_0<=66)||LA1_0==68||LA1_0==70||LA1_0==73||(LA1_0>=75 && LA1_0<=76)||(LA1_0>=83 && LA1_0<=85)||LA1_0==87) ) {
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
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:121:11: NEWLINE
                            {
                            NEWLINE9=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_variableDeclaration938); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE9);



                            // AST REWRITE
                            // elements: ID, 68
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 121:19: -> ^( VARDEF 'timeline' ID )
                            {
                                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:121:22: ^( VARDEF 'timeline' ID )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDEF, "VARDEF"), root_1);

                                adaptor.addChild(root_1, stream_68.nextNode());
                                adaptor.addChild(root_1, stream_ID.nextNode());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:122:19: 
                            {

                            // AST REWRITE
                            // elements: 68, ID
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 122:19: -> ^( ARG 'timeline' ID )
                            {
                                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:122:22: ^( ARG 'timeline' ID )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARG, "ARG"), root_1);

                                adaptor.addChild(root_1, stream_68.nextNode());
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:125:10: TYPE ID ( initializer )? ( NEWLINE -> ^( VARDEF TYPE ID ( initializer )? ) | -> ^( ARG TYPE ID ) )
                    {
                    TYPE10=(Token)match(input,TYPE,FOLLOW_TYPE_in_variableDeclaration1008); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPE.add(TYPE10);

                    ID11=(Token)match(input,ID,FOLLOW_ID_in_variableDeclaration1010); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID11);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:125:18: ( initializer )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==69) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: initializer
                            {
                            pushFollow(FOLLOW_initializer_in_variableDeclaration1012);
                            initializer12=initializer();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_initializer.add(initializer12.getTree());

                            }
                            break;

                    }

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:126:10: ( NEWLINE -> ^( VARDEF TYPE ID ( initializer )? ) | -> ^( ARG TYPE ID ) )
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
                    else if ( (LA3_0==EOF||LA3_0==TYPE||(LA3_0>=END && LA3_0<=ID)||(LA3_0>=LITERAL && LA3_0<=66)||LA3_0==68||LA3_0==70||LA3_0==73||(LA3_0>=75 && LA3_0<=76)||(LA3_0>=83 && LA3_0<=85)||LA3_0==87) ) {
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
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:126:11: NEWLINE
                            {
                            NEWLINE13=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_variableDeclaration1026); if (state.failed) return retval; 
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
                            // 126:19: -> ^( VARDEF TYPE ID ( initializer )? )
                            {
                                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:126:22: ^( VARDEF TYPE ID ( initializer )? )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDEF, "VARDEF"), root_1);

                                adaptor.addChild(root_1, stream_TYPE.nextNode());
                                adaptor.addChild(root_1, stream_ID.nextNode());
                                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:126:39: ( initializer )?
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
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:127:19: 
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
                            // 127:19: -> ^( ARG TYPE ID )
                            {
                                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:127:22: ^( ARG TYPE ID )
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:131:1: initializer : '=' LITERAL ;
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:132:5: ( '=' LITERAL )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:132:10: '=' LITERAL
            {
            root_0 = (Object)adaptor.nil();

            char_literal14=(Token)match(input,69,FOLLOW_69_in_initializer1108); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal14_tree = (Object)adaptor.create(char_literal14);
            adaptor.addChild(root_0, char_literal14_tree);
            }
            LITERAL15=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_initializer1110); if (state.failed) return retval;
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:136:1: assignmentExpression : ( logicalORExpression | primaryExpression ASSIGNMENT_OPERATOR assignmentExpression );
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:137:9: ( logicalORExpression | primaryExpression ASSIGNMENT_OPERATOR assignmentExpression )
            int alt5=2;
            switch ( input.LA(1) ) {
            case 70:
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
            case 73:
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:137:11: logicalORExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_logicalORExpression_in_assignmentExpression1166);
                    logicalORExpression16=logicalORExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalORExpression16.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:138:11: primaryExpression ASSIGNMENT_OPERATOR assignmentExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_assignmentExpression1178);
                    primaryExpression17=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpression17.getTree());
                    ASSIGNMENT_OPERATOR18=(Token)match(input,ASSIGNMENT_OPERATOR,FOLLOW_ASSIGNMENT_OPERATOR_in_assignmentExpression1180); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGNMENT_OPERATOR18_tree = (Object)adaptor.create(ASSIGNMENT_OPERATOR18);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGNMENT_OPERATOR18_tree, root_0);
                    }
                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression1183);
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:140:1: logicalORExpression : ( 'not' )? logicalANDExpression ( 'or' logicalORExpression )? ;
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:141:9: ( ( 'not' )? logicalANDExpression ( 'or' logicalORExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:141:11: ( 'not' )? logicalANDExpression ( 'or' logicalORExpression )?
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:141:11: ( 'not' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==70) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: 'not'
                    {
                    string_literal20=(Token)match(input,70,FOLLOW_70_in_logicalORExpression1234); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal20_tree = (Object)adaptor.create(string_literal20);
                    adaptor.addChild(root_0, string_literal20_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression1237);
            logicalANDExpression21=logicalANDExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalANDExpression21.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:141:39: ( 'or' logicalORExpression )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==71) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:141:40: 'or' logicalORExpression
                    {
                    string_literal22=(Token)match(input,71,FOLLOW_71_in_logicalORExpression1240); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal22_tree = (Object)adaptor.create(string_literal22);
                    root_0 = (Object)adaptor.becomeRoot(string_literal22_tree, root_0);
                    }
                    pushFollow(FOLLOW_logicalORExpression_in_logicalORExpression1243);
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:143:1: logicalANDExpression : equalityExpression ( 'and' logicalANDExpression )? ;
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:144:9: ( equalityExpression ( 'and' logicalANDExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:144:11: equalityExpression ( 'and' logicalANDExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_logicalANDExpression1264);
            equalityExpression24=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression24.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:144:30: ( 'and' logicalANDExpression )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==72) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:144:31: 'and' logicalANDExpression
                    {
                    string_literal25=(Token)match(input,72,FOLLOW_72_in_logicalANDExpression1267); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal25_tree = (Object)adaptor.create(string_literal25);
                    root_0 = (Object)adaptor.becomeRoot(string_literal25_tree, root_0);
                    }
                    pushFollow(FOLLOW_logicalANDExpression_in_logicalANDExpression1270);
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:146:1: equalityExpression : relationalExpression ( EQUALITY_OPERATOR equalityExpression )? ;
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:147:9: ( relationalExpression ( EQUALITY_OPERATOR equalityExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:147:12: relationalExpression ( EQUALITY_OPERATOR equalityExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1296);
            relationalExpression27=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression27.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:147:33: ( EQUALITY_OPERATOR equalityExpression )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==EQUALITY_OPERATOR) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:147:34: EQUALITY_OPERATOR equalityExpression
                    {
                    EQUALITY_OPERATOR28=(Token)match(input,EQUALITY_OPERATOR,FOLLOW_EQUALITY_OPERATOR_in_equalityExpression1299); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUALITY_OPERATOR28_tree = (Object)adaptor.create(EQUALITY_OPERATOR28);
                    root_0 = (Object)adaptor.becomeRoot(EQUALITY_OPERATOR28_tree, root_0);
                    }
                    pushFollow(FOLLOW_equalityExpression_in_equalityExpression1302);
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:149:1: relationalExpression : additiveExpression ( RELATIONAL_OPERATOR relationalExpression )? ;
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:150:9: ( additiveExpression ( RELATIONAL_OPERATOR relationalExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:150:11: additiveExpression ( RELATIONAL_OPERATOR relationalExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1325);
            additiveExpression30=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression30.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:150:30: ( RELATIONAL_OPERATOR relationalExpression )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RELATIONAL_OPERATOR) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:150:31: RELATIONAL_OPERATOR relationalExpression
                    {
                    RELATIONAL_OPERATOR31=(Token)match(input,RELATIONAL_OPERATOR,FOLLOW_RELATIONAL_OPERATOR_in_relationalExpression1328); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RELATIONAL_OPERATOR31_tree = (Object)adaptor.create(RELATIONAL_OPERATOR31);
                    root_0 = (Object)adaptor.becomeRoot(RELATIONAL_OPERATOR31_tree, root_0);
                    }
                    pushFollow(FOLLOW_relationalExpression_in_relationalExpression1331);
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:152:1: additiveExpression : multiplicativeExpression ( ADDITIVE_OPERATOR additiveExpression )? ;
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:153:9: ( multiplicativeExpression ( ADDITIVE_OPERATOR additiveExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:153:11: multiplicativeExpression ( ADDITIVE_OPERATOR additiveExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1355);
            multiplicativeExpression33=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression33.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:153:36: ( ADDITIVE_OPERATOR additiveExpression )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ADDITIVE_OPERATOR) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:153:37: ADDITIVE_OPERATOR additiveExpression
                    {
                    ADDITIVE_OPERATOR34=(Token)match(input,ADDITIVE_OPERATOR,FOLLOW_ADDITIVE_OPERATOR_in_additiveExpression1358); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ADDITIVE_OPERATOR34_tree = (Object)adaptor.create(ADDITIVE_OPERATOR34);
                    root_0 = (Object)adaptor.becomeRoot(ADDITIVE_OPERATOR34_tree, root_0);
                    }
                    pushFollow(FOLLOW_additiveExpression_in_additiveExpression1361);
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:155:1: multiplicativeExpression : primaryExpression ( MULTIPLICATIVE_OPERATOR multiplicativeExpression )? ;
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:156:2: ( primaryExpression ( MULTIPLICATIVE_OPERATOR multiplicativeExpression )? )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:156:4: primaryExpression ( MULTIPLICATIVE_OPERATOR multiplicativeExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_primaryExpression_in_multiplicativeExpression1373);
            primaryExpression36=primaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpression36.getTree());
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:156:22: ( MULTIPLICATIVE_OPERATOR multiplicativeExpression )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==MULTIPLICATIVE_OPERATOR) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:156:23: MULTIPLICATIVE_OPERATOR multiplicativeExpression
                    {
                    MULTIPLICATIVE_OPERATOR37=(Token)match(input,MULTIPLICATIVE_OPERATOR,FOLLOW_MULTIPLICATIVE_OPERATOR_in_multiplicativeExpression1376); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MULTIPLICATIVE_OPERATOR37_tree = (Object)adaptor.create(MULTIPLICATIVE_OPERATOR37);
                    root_0 = (Object)adaptor.becomeRoot(MULTIPLICATIVE_OPERATOR37_tree, root_0);
                    }
                    pushFollow(FOLLOW_multiplicativeExpression_in_multiplicativeExpression1379);
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:158:1: primaryExpression : ( ID | 'new' ID '(' expressionList ')' | LITERAL | functionPredicateCall );
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:159:2: ( ID | 'new' ID '(' expressionList ')' | LITERAL | functionPredicateCall )
            int alt13=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==74) ) {
                    alt13=4;
                }
                else if ( (LA13_1==EOF||LA13_1==START||LA13_1==NEWLINE||(LA13_1>=ASSIGNMENT_OPERATOR && LA13_1<=MULTIPLICATIVE_OPERATOR)||(LA13_1>=71 && LA13_1<=72)||(LA13_1>=75 && LA13_1<=76)) ) {
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
            case 73:
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:159:4: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID39=(Token)match(input,ID,FOLLOW_ID_in_primaryExpression1391); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID39_tree = (Object)adaptor.create(ID39);
                    adaptor.addChild(root_0, ID39_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:160:4: 'new' ID '(' expressionList ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal40=(Token)match(input,73,FOLLOW_73_in_primaryExpression1396); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal40_tree = (Object)adaptor.create(string_literal40);
                    adaptor.addChild(root_0, string_literal40_tree);
                    }
                    ID41=(Token)match(input,ID,FOLLOW_ID_in_primaryExpression1398); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID41_tree = (Object)adaptor.create(ID41);
                    adaptor.addChild(root_0, ID41_tree);
                    }
                    char_literal42=(Token)match(input,74,FOLLOW_74_in_primaryExpression1400); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal42_tree = (Object)adaptor.create(char_literal42);
                    adaptor.addChild(root_0, char_literal42_tree);
                    }
                    pushFollow(FOLLOW_expressionList_in_primaryExpression1402);
                    expressionList43=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList43.getTree());
                    char_literal44=(Token)match(input,75,FOLLOW_75_in_primaryExpression1404); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal44_tree = (Object)adaptor.create(char_literal44);
                    adaptor.addChild(root_0, char_literal44_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:161:4: LITERAL
                    {
                    root_0 = (Object)adaptor.nil();

                    LITERAL45=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_primaryExpression1409); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LITERAL45_tree = (Object)adaptor.create(LITERAL45);
                    adaptor.addChild(root_0, LITERAL45_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:162:4: functionPredicateCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionPredicateCall_in_primaryExpression1414);
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:171:1: idList : (ids+= ID ( ',' ids+= ID )* -> ( ID )+ | '(' ids+= ID ( ',' ids+= ID )* ')' -> ( ID )+ );
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
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:172:5: (ids+= ID ( ',' ids+= ID )* -> ( ID )+ | '(' ids+= ID ( ',' ids+= ID )* ')' -> ( ID )+ )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==74) ) {
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:172:10: ids+= ID ( ',' ids+= ID )*
                    {
                    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1442); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ids);

                    if (list_ids==null) list_ids=new ArrayList();
                    list_ids.add(ids);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:172:20: ( ',' ids+= ID )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==76) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:172:21: ',' ids+= ID
                    	    {
                    	    char_literal47=(Token)match(input,76,FOLLOW_76_in_idList1445); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_76.add(char_literal47);

                    	    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1451); if (state.failed) return retval; 
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
                    // 172:37: -> ( ID )+
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:174:10: '(' ids+= ID ( ',' ids+= ID )* ')'
                    {
                    char_literal48=(Token)match(input,74,FOLLOW_74_in_idList1479); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(char_literal48);

                    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1485); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ids);

                    if (list_ids==null) list_ids=new ArrayList();
                    list_ids.add(ids);

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:174:24: ( ',' ids+= ID )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==76) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:174:25: ',' ids+= ID
                    	    {
                    	    char_literal49=(Token)match(input,76,FOLLOW_76_in_idList1488); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_76.add(char_literal49);

                    	    ids=(Token)match(input,ID,FOLLOW_ID_in_idList1494); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ids);

                    	    if (list_ids==null) list_ids=new ArrayList();
                    	    list_ids.add(ids);


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    char_literal50=(Token)match(input,75,FOLLOW_75_in_idList1498); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(char_literal50);



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
                    // 174:45: -> ( ID )+
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:178:1: variableList : (vars+= variableDeclaration ( ',' vars+= variableDeclaration )* -> ( variableDeclaration )+ | '(' vars+= variableDeclaration ( ',' vars+= variableDeclaration )* ')' -> ( variableDeclaration )+ );
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
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:179:5: (vars+= variableDeclaration ( ',' vars+= variableDeclaration )* -> ( variableDeclaration )+ | '(' vars+= variableDeclaration ( ',' vars+= variableDeclaration )* ')' -> ( variableDeclaration )+ )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==TYPE||LA19_0==68) ) {
                alt19=1;
            }
            else if ( (LA19_0==74) ) {
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:179:10: vars+= variableDeclaration ( ',' vars+= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_variableList1539);
                    vars=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(vars.getTree());
                    if (list_vars==null) list_vars=new ArrayList();
                    list_vars.add(vars.getTree());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:179:38: ( ',' vars+= variableDeclaration )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==76) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:179:39: ',' vars+= variableDeclaration
                    	    {
                    	    char_literal51=(Token)match(input,76,FOLLOW_76_in_variableList1542); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_76.add(char_literal51);

                    	    pushFollow(FOLLOW_variableDeclaration_in_variableList1548);
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
                    // 180:10: -> ( variableDeclaration )+
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:182:10: '(' vars+= variableDeclaration ( ',' vars+= variableDeclaration )* ')'
                    {
                    char_literal52=(Token)match(input,74,FOLLOW_74_in_variableList1586); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(char_literal52);

                    pushFollow(FOLLOW_variableDeclaration_in_variableList1592);
                    vars=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(vars.getTree());
                    if (list_vars==null) list_vars=new ArrayList();
                    list_vars.add(vars.getTree());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:182:42: ( ',' vars+= variableDeclaration )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==76) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:182:43: ',' vars+= variableDeclaration
                    	    {
                    	    char_literal53=(Token)match(input,76,FOLLOW_76_in_variableList1595); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_76.add(char_literal53);

                    	    pushFollow(FOLLOW_variableDeclaration_in_variableList1601);
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

                    char_literal54=(Token)match(input,75,FOLLOW_75_in_variableList1605); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(char_literal54);



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
                    // 183:10: -> ( variableDeclaration )+
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:187:1: expressionList : (exps+= assignmentExpression ( ',' exps+= assignmentExpression )* | '(' exps+= assignmentExpression ( ',' exps+= assignmentExpression )* ')' );
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:188:5: (exps+= assignmentExpression ( ',' exps+= assignmentExpression )* | '(' exps+= assignmentExpression ( ',' exps+= assignmentExpression )* ')' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ID||LA22_0==LITERAL||LA22_0==70||LA22_0==73) ) {
                alt22=1;
            }
            else if ( (LA22_0==74) ) {
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:188:10: exps+= assignmentExpression ( ',' exps+= assignmentExpression )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignmentExpression_in_expressionList1654);
                    exps=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exps.getTree());
                    if (list_exps==null) list_exps=new ArrayList();
                    list_exps.add(exps.getTree());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:188:39: ( ',' exps+= assignmentExpression )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==76) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:188:40: ',' exps+= assignmentExpression
                    	    {
                    	    char_literal55=(Token)match(input,76,FOLLOW_76_in_expressionList1657); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal55_tree = (Object)adaptor.create(char_literal55);
                    	    adaptor.addChild(root_0, char_literal55_tree);
                    	    }
                    	    pushFollow(FOLLOW_assignmentExpression_in_expressionList1663);
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:190:10: '(' exps+= assignmentExpression ( ',' exps+= assignmentExpression )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal56=(Token)match(input,74,FOLLOW_74_in_expressionList1686); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal56_tree = (Object)adaptor.create(char_literal56);
                    adaptor.addChild(root_0, char_literal56_tree);
                    }
                    pushFollow(FOLLOW_assignmentExpression_in_expressionList1692);
                    exps=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exps.getTree());
                    if (list_exps==null) list_exps=new ArrayList();
                    list_exps.add(exps.getTree());

                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:190:43: ( ',' exps+= assignmentExpression )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==76) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:190:44: ',' exps+= assignmentExpression
                    	    {
                    	    char_literal57=(Token)match(input,76,FOLLOW_76_in_expressionList1695); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal57_tree = (Object)adaptor.create(char_literal57);
                    	    adaptor.addChild(root_0, char_literal57_tree);
                    	    }
                    	    pushFollow(FOLLOW_assignmentExpression_in_expressionList1701);
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

                    char_literal58=(Token)match(input,75,FOLLOW_75_in_expressionList1705); if (state.failed) return retval;
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:197:1: inBlockDeclaration : ( assignmentExpression NEWLINE | ifStatement NEWLINE | whenStatement NEWLINE | everyStatement NEWLINE | constraintFunctionCall NEWLINE );
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
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:198:5: ( assignmentExpression NEWLINE | ifStatement NEWLINE | whenStatement NEWLINE | everyStatement NEWLINE | constraintFunctionCall NEWLINE )
            int alt23=5;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:198:7: assignmentExpression NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignmentExpression_in_inBlockDeclaration1735);
                    assignmentExpression59=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression59.getTree());
                    NEWLINE60=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_inBlockDeclaration1737); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE60_tree = (Object)adaptor.create(NEWLINE60);
                    adaptor.addChild(root_0, NEWLINE60_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:199:9: ifStatement NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_inBlockDeclaration1747);
                    ifStatement61=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement61.getTree());
                    NEWLINE62=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_inBlockDeclaration1749); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE62_tree = (Object)adaptor.create(NEWLINE62);
                    adaptor.addChild(root_0, NEWLINE62_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:200:9: whenStatement NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whenStatement_in_inBlockDeclaration1759);
                    whenStatement63=whenStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whenStatement63.getTree());
                    NEWLINE64=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_inBlockDeclaration1761); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE64_tree = (Object)adaptor.create(NEWLINE64);
                    adaptor.addChild(root_0, NEWLINE64_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:201:9: everyStatement NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_everyStatement_in_inBlockDeclaration1771);
                    everyStatement65=everyStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, everyStatement65.getTree());
                    NEWLINE66=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_inBlockDeclaration1773); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE66_tree = (Object)adaptor.create(NEWLINE66);
                    adaptor.addChild(root_0, NEWLINE66_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:202:9: constraintFunctionCall NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constraintFunctionCall_in_inBlockDeclaration1783);
                    constraintFunctionCall67=constraintFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constraintFunctionCall67.getTree());
                    NEWLINE68=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_inBlockDeclaration1785); if (state.failed) return retval;
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:204:1: inBlock : START (block+= inBlockDeclaration | NEWLINE )* END -> ^( INBLOCK ( $block)* ) ;
    public final celluloidParser.inBlock_return inBlock() throws RecognitionException {
        celluloidParser.inBlock_return retval = new celluloidParser.inBlock_return();
        retval.start = input.LT(1);
        int inBlock_StartIndex = input.index();
        Object root_0 = null;

        Token START69=null;
        Token NEWLINE70=null;
        Token END71=null;
        List list_block=null;
        RuleReturnScope block = null;
        Object START69_tree=null;
        Object NEWLINE70_tree=null;
        Object END71_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_inBlockDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule inBlockDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:205:5: ( START (block+= inBlockDeclaration | NEWLINE )* END -> ^( INBLOCK ( $block)* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:205:7: START (block+= inBlockDeclaration | NEWLINE )* END
            {
            START69=(Token)match(input,START,FOLLOW_START_in_inBlock1802); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START69);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:206:13: (block+= inBlockDeclaration | NEWLINE )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ID||LA24_0==LITERAL||LA24_0==70||LA24_0==73||LA24_0==77||(LA24_0>=80 && LA24_0<=82)) ) {
                    alt24=1;
                }
                else if ( (LA24_0==NEWLINE) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:206:14: block+= inBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_inBlockDeclaration_in_inBlock1821);
            	    block=inBlockDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_inBlockDeclaration.add(block.getTree());
            	    if (list_block==null) list_block=new ArrayList();
            	    list_block.add(block.getTree());


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:206:44: NEWLINE
            	    {
            	    NEWLINE70=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_inBlock1825); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE70);


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            END71=(Token)match(input,END,FOLLOW_END_in_inBlock1837); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END71);



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
            // 208:9: -> ^( INBLOCK ( $block)* )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:208:12: ^( INBLOCK ( $block)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INBLOCK, "INBLOCK"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:208:22: ( $block)*
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:210:1: inStatement : 'in' ID inBlock -> ^( IN ID inBlock ) ;
    public final celluloidParser.inStatement_return inStatement() throws RecognitionException {
        celluloidParser.inStatement_return retval = new celluloidParser.inStatement_return();
        retval.start = input.LT(1);
        int inStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal72=null;
        Token ID73=null;
        celluloidParser.inBlock_return inBlock74 = null;


        Object string_literal72_tree=null;
        Object ID73_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_inBlock=new RewriteRuleSubtreeStream(adaptor,"rule inBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:211:5: ( 'in' ID inBlock -> ^( IN ID inBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:211:8: 'in' ID inBlock
            {
            string_literal72=(Token)match(input,66,FOLLOW_66_in_inStatement1872); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(string_literal72);

            ID73=(Token)match(input,ID,FOLLOW_ID_in_inStatement1874); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID73);

            pushFollow(FOLLOW_inBlock_in_inStatement1876);
            inBlock74=inBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inBlock.add(inBlock74.getTree());


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
            // 212:9: -> ^( IN ID inBlock )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:212:12: ^( IN ID inBlock )
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:216:1: ifStatement : 'if' ifTest= logicalORExpression START (ifBlock+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )+ (elseifBlock+= elseIfStatement )* ( elseStatement )? END -> ^( IF $ifTest ^( IFBLOCK $ifBlock) ^( ELSEIF ( $elseifBlock)? ) ^( ELSE ( elseStatement )? ) ) ;
    public final celluloidParser.ifStatement_return ifStatement() throws RecognitionException {
        celluloidParser.ifStatement_return retval = new celluloidParser.ifStatement_return();
        retval.start = input.LT(1);
        int ifStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal75=null;
        Token START76=null;
        Token NEWLINE80=null;
        Token END82=null;
        Token ifBlock=null;
        List list_ifBlock=null;
        List list_elseifBlock=null;
        celluloidParser.logicalORExpression_return ifTest = null;

        celluloidParser.assignmentExpression_return assignmentExpression77 = null;

        celluloidParser.inStatement_return inStatement78 = null;

        celluloidParser.ifStatement_return ifStatement79 = null;

        celluloidParser.elseStatement_return elseStatement81 = null;

        RuleReturnScope elseifBlock = null;
        Object string_literal75_tree=null;
        Object START76_tree=null;
        Object NEWLINE80_tree=null;
        Object END82_tree=null;
        Object ifBlock_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        RewriteRuleSubtreeStream stream_inStatement=new RewriteRuleSubtreeStream(adaptor,"rule inStatement");
        RewriteRuleSubtreeStream stream_elseStatement=new RewriteRuleSubtreeStream(adaptor,"rule elseStatement");
        RewriteRuleSubtreeStream stream_logicalORExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalORExpression");
        RewriteRuleSubtreeStream stream_elseIfStatement=new RewriteRuleSubtreeStream(adaptor,"rule elseIfStatement");
        RewriteRuleSubtreeStream stream_ifStatement=new RewriteRuleSubtreeStream(adaptor,"rule ifStatement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:217:5: ( 'if' ifTest= logicalORExpression START (ifBlock+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )+ (elseifBlock+= elseIfStatement )* ( elseStatement )? END -> ^( IF $ifTest ^( IFBLOCK $ifBlock) ^( ELSEIF ( $elseifBlock)? ) ^( ELSE ( elseStatement )? ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:217:8: 'if' ifTest= logicalORExpression START (ifBlock+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )+ (elseifBlock+= elseIfStatement )* ( elseStatement )? END
            {
            string_literal75=(Token)match(input,77,FOLLOW_77_in_ifStatement1924); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_77.add(string_literal75);

            pushFollow(FOLLOW_logicalORExpression_in_ifStatement1930);
            ifTest=logicalORExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logicalORExpression.add(ifTest.getTree());
            START76=(Token)match(input,START,FOLLOW_START_in_ifStatement1940); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START76);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:219:13: (ifBlock+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==ID||(LA26_0>=LITERAL && LA26_0<=66)||LA26_0==70||LA26_0==73||LA26_0==77) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:219:14: ifBlock+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE
            	    {
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:219:25: ( assignmentExpression | inStatement | ifStatement )
            	    int alt25=3;
            	    switch ( input.LA(1) ) {
            	    case ID:
            	    case LITERAL:
            	    case 70:
            	    case 73:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case 66:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case 77:
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
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:219:26: assignmentExpression
            	            {
            	            pushFollow(FOLLOW_assignmentExpression_in_ifStatement1960);
            	            assignmentExpression77=assignmentExpression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression77.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:219:49: inStatement
            	            {
            	            pushFollow(FOLLOW_inStatement_in_ifStatement1964);
            	            inStatement78=inStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_inStatement.add(inStatement78.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:219:63: ifStatement
            	            {
            	            pushFollow(FOLLOW_ifStatement_in_ifStatement1968);
            	            ifStatement79=ifStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_ifStatement.add(ifStatement79.getTree());

            	            }
            	            break;

            	    }

            	    NEWLINE80=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ifStatement1971); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE80);


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

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:220:13: (elseifBlock+= elseIfStatement )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==78) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:220:14: elseifBlock+= elseIfStatement
            	    {
            	    pushFollow(FOLLOW_elseIfStatement_in_ifStatement1993);
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

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:221:13: ( elseStatement )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==79) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: elseStatement
                    {
                    pushFollow(FOLLOW_elseStatement_in_ifStatement2009);
                    elseStatement81=elseStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseStatement.add(elseStatement81.getTree());

                    }
                    break;

            }

            END82=(Token)match(input,END,FOLLOW_END_in_ifStatement2020); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END82);



            // AST REWRITE
            // elements: ifTest, elseifBlock, ifBlock, elseStatement
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
            // 223:9: -> ^( IF $ifTest ^( IFBLOCK $ifBlock) ^( ELSEIF ( $elseifBlock)? ) ^( ELSE ( elseStatement )? ) )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:223:12: ^( IF $ifTest ^( IFBLOCK $ifBlock) ^( ELSEIF ( $elseifBlock)? ) ^( ELSE ( elseStatement )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_ifTest.nextTree());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:223:25: ^( IFBLOCK $ifBlock)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IFBLOCK, "IFBLOCK"), root_2);

                adaptor.addChild(root_2, stream_ifBlock.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:223:45: ^( ELSEIF ( $elseifBlock)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSEIF, "ELSEIF"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:223:54: ( $elseifBlock)?
                if ( stream_elseifBlock.hasNext() ) {
                    adaptor.addChild(root_2, stream_elseifBlock.nextTree());

                }
                stream_elseifBlock.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:223:69: ^( ELSE ( elseStatement )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:223:76: ( elseStatement )?
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:226:1: elseIfStatement : 'else if' (elseIfTest= logicalORExpression NEWLINE ) (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )* -> ^( $elseIfTest ^( IFBLOCK $statements) ) ;
    public final celluloidParser.elseIfStatement_return elseIfStatement() throws RecognitionException {
        celluloidParser.elseIfStatement_return retval = new celluloidParser.elseIfStatement_return();
        retval.start = input.LT(1);
        int elseIfStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal83=null;
        Token NEWLINE84=null;
        Token NEWLINE88=null;
        Token statements=null;
        List list_statements=null;
        celluloidParser.logicalORExpression_return elseIfTest = null;

        celluloidParser.assignmentExpression_return assignmentExpression85 = null;

        celluloidParser.inStatement_return inStatement86 = null;

        celluloidParser.ifStatement_return ifStatement87 = null;


        Object string_literal83_tree=null;
        Object NEWLINE84_tree=null;
        Object NEWLINE88_tree=null;
        Object statements_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        RewriteRuleSubtreeStream stream_inStatement=new RewriteRuleSubtreeStream(adaptor,"rule inStatement");
        RewriteRuleSubtreeStream stream_logicalORExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalORExpression");
        RewriteRuleSubtreeStream stream_ifStatement=new RewriteRuleSubtreeStream(adaptor,"rule ifStatement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:227:5: ( 'else if' (elseIfTest= logicalORExpression NEWLINE ) (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )* -> ^( $elseIfTest ^( IFBLOCK $statements) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:227:9: 'else if' (elseIfTest= logicalORExpression NEWLINE ) (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )*
            {
            string_literal83=(Token)match(input,78,FOLLOW_78_in_elseIfStatement2087); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_78.add(string_literal83);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:227:19: (elseIfTest= logicalORExpression NEWLINE )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:227:20: elseIfTest= logicalORExpression NEWLINE
            {
            pushFollow(FOLLOW_logicalORExpression_in_elseIfStatement2094);
            elseIfTest=logicalORExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logicalORExpression.add(elseIfTest.getTree());
            NEWLINE84=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elseIfStatement2096); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE84);


            }

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:228:9: (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==ID||(LA30_0>=LITERAL && LA30_0<=66)||LA30_0==70||LA30_0==73||LA30_0==77) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:228:10: statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE
            	    {
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:228:24: ( assignmentExpression | inStatement | ifStatement )
            	    int alt29=3;
            	    switch ( input.LA(1) ) {
            	    case ID:
            	    case LITERAL:
            	    case 70:
            	    case 73:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 66:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 77:
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
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:228:25: assignmentExpression
            	            {
            	            pushFollow(FOLLOW_assignmentExpression_in_elseIfStatement2114);
            	            assignmentExpression85=assignmentExpression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression85.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:228:48: inStatement
            	            {
            	            pushFollow(FOLLOW_inStatement_in_elseIfStatement2118);
            	            inStatement86=inStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_inStatement.add(inStatement86.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:228:62: ifStatement
            	            {
            	            pushFollow(FOLLOW_ifStatement_in_elseIfStatement2122);
            	            ifStatement87=ifStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_ifStatement.add(ifStatement87.getTree());

            	            }
            	            break;

            	    }

            	    NEWLINE88=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elseIfStatement2125); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE88);


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);



            // AST REWRITE
            // elements: statements, elseIfTest
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
            // 229:9: -> ^( $elseIfTest ^( IFBLOCK $statements) )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:229:12: ^( $elseIfTest ^( IFBLOCK $statements) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_elseIfTest.nextNode(), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:229:26: ^( IFBLOCK $statements)
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
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:232:1: elseStatement : 'else' (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )* -> ^( IFBLOCK $statements) ;
    public final celluloidParser.elseStatement_return elseStatement() throws RecognitionException {
        celluloidParser.elseStatement_return retval = new celluloidParser.elseStatement_return();
        retval.start = input.LT(1);
        int elseStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal89=null;
        Token NEWLINE93=null;
        Token statements=null;
        List list_statements=null;
        celluloidParser.assignmentExpression_return assignmentExpression90 = null;

        celluloidParser.inStatement_return inStatement91 = null;

        celluloidParser.ifStatement_return ifStatement92 = null;


        Object string_literal89_tree=null;
        Object NEWLINE93_tree=null;
        Object statements_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        RewriteRuleSubtreeStream stream_inStatement=new RewriteRuleSubtreeStream(adaptor,"rule inStatement");
        RewriteRuleSubtreeStream stream_ifStatement=new RewriteRuleSubtreeStream(adaptor,"rule ifStatement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:233:5: ( 'else' (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )* -> ^( IFBLOCK $statements) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:233:9: 'else' (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )*
            {
            string_literal89=(Token)match(input,79,FOLLOW_79_in_elseStatement2170); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_79.add(string_literal89);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:233:16: (statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==ID||(LA32_0>=LITERAL && LA32_0<=66)||LA32_0==70||LA32_0==73||LA32_0==77) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:233:17: statements+= ( assignmentExpression | inStatement | ifStatement ) NEWLINE
            	    {
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:233:31: ( assignmentExpression | inStatement | ifStatement )
            	    int alt31=3;
            	    switch ( input.LA(1) ) {
            	    case ID:
            	    case LITERAL:
            	    case 70:
            	    case 73:
            	        {
            	        alt31=1;
            	        }
            	        break;
            	    case 66:
            	        {
            	        alt31=2;
            	        }
            	        break;
            	    case 77:
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
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:233:32: assignmentExpression
            	            {
            	            pushFollow(FOLLOW_assignmentExpression_in_elseStatement2178);
            	            assignmentExpression90=assignmentExpression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression90.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:233:55: inStatement
            	            {
            	            pushFollow(FOLLOW_inStatement_in_elseStatement2182);
            	            inStatement91=inStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_inStatement.add(inStatement91.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:233:69: ifStatement
            	            {
            	            pushFollow(FOLLOW_ifStatement_in_elseStatement2186);
            	            ifStatement92=ifStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_ifStatement.add(ifStatement92.getTree());

            	            }
            	            break;

            	    }

            	    NEWLINE93=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_elseStatement2189); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE93);


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
            // 234:9: -> ^( IFBLOCK $statements)
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:234:12: ^( IFBLOCK $statements)
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

    public static class listenerBlockDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listenerBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:237:1: listenerBlockDeclaration : ( assignmentExpression | constraintFunctionCall | ifStatement | constraintFunctionCall ) NEWLINE ;
    public final celluloidParser.listenerBlockDeclaration_return listenerBlockDeclaration() throws RecognitionException {
        celluloidParser.listenerBlockDeclaration_return retval = new celluloidParser.listenerBlockDeclaration_return();
        retval.start = input.LT(1);
        int listenerBlockDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token NEWLINE98=null;
        celluloidParser.assignmentExpression_return assignmentExpression94 = null;

        celluloidParser.constraintFunctionCall_return constraintFunctionCall95 = null;

        celluloidParser.ifStatement_return ifStatement96 = null;

        celluloidParser.constraintFunctionCall_return constraintFunctionCall97 = null;


        Object NEWLINE98_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:238:5: ( ( assignmentExpression | constraintFunctionCall | ifStatement | constraintFunctionCall ) NEWLINE )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:238:10: ( assignmentExpression | constraintFunctionCall | ifStatement | constraintFunctionCall ) NEWLINE
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:238:10: ( assignmentExpression | constraintFunctionCall | ifStatement | constraintFunctionCall )
            int alt33=4;
            switch ( input.LA(1) ) {
            case LITERAL:
            case 70:
            case 73:
                {
                alt33=1;
                }
                break;
            case ID:
                {
                int LA33_2 = input.LA(2);

                if ( (synpred42_celluloid()) ) {
                    alt33=1;
                }
                else if ( (synpred43_celluloid()) ) {
                    alt33=2;
                }
                else if ( (true) ) {
                    alt33=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;
                }
                }
                break;
            case 77:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:238:11: assignmentExpression
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_listenerBlockDeclaration2229);
                    assignmentExpression94=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression94.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:239:14: constraintFunctionCall
                    {
                    pushFollow(FOLLOW_constraintFunctionCall_in_listenerBlockDeclaration2245);
                    constraintFunctionCall95=constraintFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constraintFunctionCall95.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:240:14: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_listenerBlockDeclaration2261);
                    ifStatement96=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement96.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:241:14: constraintFunctionCall
                    {
                    pushFollow(FOLLOW_constraintFunctionCall_in_listenerBlockDeclaration2276);
                    constraintFunctionCall97=constraintFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constraintFunctionCall97.getTree());

                    }
                    break;

            }

            NEWLINE98=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_listenerBlockDeclaration2289); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NEWLINE98_tree = (Object)adaptor.create(NEWLINE98);
            adaptor.addChild(root_0, NEWLINE98_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 22, listenerBlockDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "listenerBlockDeclaration"

    public static class listenerBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listenerBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:244:1: listenerBlock : START (block+= listenerBlockDeclaration )* END -> ^( LISTENBLOCK ( $block)* ) ;
    public final celluloidParser.listenerBlock_return listenerBlock() throws RecognitionException {
        celluloidParser.listenerBlock_return retval = new celluloidParser.listenerBlock_return();
        retval.start = input.LT(1);
        int listenerBlock_StartIndex = input.index();
        Object root_0 = null;

        Token START99=null;
        Token END100=null;
        List list_block=null;
        RuleReturnScope block = null;
        Object START99_tree=null;
        Object END100_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_listenerBlockDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule listenerBlockDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:245:5: ( START (block+= listenerBlockDeclaration )* END -> ^( LISTENBLOCK ( $block)* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:245:8: START (block+= listenerBlockDeclaration )* END
            {
            START99=(Token)match(input,START,FOLLOW_START_in_listenerBlock2306); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START99);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:246:12: (block+= listenerBlockDeclaration )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ID||LA34_0==LITERAL||LA34_0==70||LA34_0==73||LA34_0==77) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:246:13: block+= listenerBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_listenerBlockDeclaration_in_listenerBlock2324);
            	    block=listenerBlockDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_listenerBlockDeclaration.add(block.getTree());
            	    if (list_block==null) list_block=new ArrayList();
            	    list_block.add(block.getTree());


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            END100=(Token)match(input,END,FOLLOW_END_in_listenerBlock2335); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END100);



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
            // 248:8: -> ^( LISTENBLOCK ( $block)* )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:248:11: ^( LISTENBLOCK ( $block)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LISTENBLOCK, "LISTENBLOCK"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:248:25: ( $block)*
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
            if ( state.backtracking>0 ) { memoize(input, 23, listenerBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "listenerBlock"

    public static class whenStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whenStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:250:1: whenStatement : cond= ( 'when' | 'unless' ) logicalORExpression listenerBlock -> ^( LISTENER EVERY ^( COND $cond logicalORExpression ) listenerBlock ) ;
    public final celluloidParser.whenStatement_return whenStatement() throws RecognitionException {
        celluloidParser.whenStatement_return retval = new celluloidParser.whenStatement_return();
        retval.start = input.LT(1);
        int whenStatement_StartIndex = input.index();
        Object root_0 = null;

        Token cond=null;
        Token string_literal101=null;
        Token string_literal102=null;
        celluloidParser.logicalORExpression_return logicalORExpression103 = null;

        celluloidParser.listenerBlock_return listenerBlock104 = null;


        Object cond_tree=null;
        Object string_literal101_tree=null;
        Object string_literal102_tree=null;
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_listenerBlock=new RewriteRuleSubtreeStream(adaptor,"rule listenerBlock");
        RewriteRuleSubtreeStream stream_logicalORExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalORExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:251:5: (cond= ( 'when' | 'unless' ) logicalORExpression listenerBlock -> ^( LISTENER EVERY ^( COND $cond logicalORExpression ) listenerBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:251:9: cond= ( 'when' | 'unless' ) logicalORExpression listenerBlock
            {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:251:16: ( 'when' | 'unless' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==80) ) {
                alt35=1;
            }
            else if ( (LA35_0==81) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:251:17: 'when'
                    {
                    string_literal101=(Token)match(input,80,FOLLOW_80_in_whenStatement2376); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_80.add(string_literal101);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:251:26: 'unless'
                    {
                    string_literal102=(Token)match(input,81,FOLLOW_81_in_whenStatement2380); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_81.add(string_literal102);


                    }
                    break;

            }

            pushFollow(FOLLOW_logicalORExpression_in_whenStatement2383);
            logicalORExpression103=logicalORExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logicalORExpression.add(logicalORExpression103.getTree());
            pushFollow(FOLLOW_listenerBlock_in_whenStatement2385);
            listenerBlock104=listenerBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_listenerBlock.add(listenerBlock104.getTree());


            // AST REWRITE
            // elements: cond, logicalORExpression, listenerBlock
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
            // 252:9: -> ^( LISTENER EVERY ^( COND $cond logicalORExpression ) listenerBlock )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:252:12: ^( LISTENER EVERY ^( COND $cond logicalORExpression ) listenerBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LISTENER, "LISTENER"), root_1);

                adaptor.addChild(root_1, (Object)adaptor.create(EVERY, "EVERY"));
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:252:29: ^( COND $cond logicalORExpression )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);

                adaptor.addChild(root_2, stream_cond.nextNode());
                adaptor.addChild(root_2, stream_logicalORExpression.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 24, whenStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "whenStatement"

    public static class everyStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "everyStatement"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:255:1: everyStatement : 'every' TIME (cond= ( 'when' | 'unless' ) logicalORExpression )? listenerBlock -> ^( LISTENER ^( EVERY TIME ) ^( COND ( $cond)? ( logicalORExpression )? ) listenerBlock ) ;
    public final celluloidParser.everyStatement_return everyStatement() throws RecognitionException {
        celluloidParser.everyStatement_return retval = new celluloidParser.everyStatement_return();
        retval.start = input.LT(1);
        int everyStatement_StartIndex = input.index();
        Object root_0 = null;

        Token cond=null;
        Token string_literal105=null;
        Token TIME106=null;
        Token string_literal107=null;
        Token string_literal108=null;
        celluloidParser.logicalORExpression_return logicalORExpression109 = null;

        celluloidParser.listenerBlock_return listenerBlock110 = null;


        Object cond_tree=null;
        Object string_literal105_tree=null;
        Object TIME106_tree=null;
        Object string_literal107_tree=null;
        Object string_literal108_tree=null;
        RewriteRuleTokenStream stream_TIME=new RewriteRuleTokenStream(adaptor,"token TIME");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_listenerBlock=new RewriteRuleSubtreeStream(adaptor,"rule listenerBlock");
        RewriteRuleSubtreeStream stream_logicalORExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalORExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:256:5: ( 'every' TIME (cond= ( 'when' | 'unless' ) logicalORExpression )? listenerBlock -> ^( LISTENER ^( EVERY TIME ) ^( COND ( $cond)? ( logicalORExpression )? ) listenerBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:256:8: 'every' TIME (cond= ( 'when' | 'unless' ) logicalORExpression )? listenerBlock
            {
            string_literal105=(Token)match(input,82,FOLLOW_82_in_everyStatement2438); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_82.add(string_literal105);

            TIME106=(Token)match(input,TIME,FOLLOW_TIME_in_everyStatement2440); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TIME.add(TIME106);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:256:21: (cond= ( 'when' | 'unless' ) logicalORExpression )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=80 && LA37_0<=81)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:256:22: cond= ( 'when' | 'unless' ) logicalORExpression
                    {
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:256:29: ( 'when' | 'unless' )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==80) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==81) ) {
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
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:256:30: 'when'
                            {
                            string_literal107=(Token)match(input,80,FOLLOW_80_in_everyStatement2448); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_80.add(string_literal107);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:256:39: 'unless'
                            {
                            string_literal108=(Token)match(input,81,FOLLOW_81_in_everyStatement2452); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_81.add(string_literal108);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_logicalORExpression_in_everyStatement2455);
                    logicalORExpression109=logicalORExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logicalORExpression.add(logicalORExpression109.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_listenerBlock_in_everyStatement2459);
            listenerBlock110=listenerBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_listenerBlock.add(listenerBlock110.getTree());


            // AST REWRITE
            // elements: cond, listenerBlock, logicalORExpression, TIME
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
            // 257:9: -> ^( LISTENER ^( EVERY TIME ) ^( COND ( $cond)? ( logicalORExpression )? ) listenerBlock )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:257:12: ^( LISTENER ^( EVERY TIME ) ^( COND ( $cond)? ( logicalORExpression )? ) listenerBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LISTENER, "LISTENER"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:257:23: ^( EVERY TIME )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EVERY, "EVERY"), root_2);

                adaptor.addChild(root_2, stream_TIME.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:257:37: ^( COND ( $cond)? ( logicalORExpression )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:257:44: ( $cond)?
                if ( stream_cond.hasNext() ) {
                    adaptor.addChild(root_2, stream_cond.nextNode());

                }
                stream_cond.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:257:51: ( logicalORExpression )?
                if ( stream_logicalORExpression.hasNext() ) {
                    adaptor.addChild(root_2, stream_logicalORExpression.nextTree());

                }
                stream_logicalORExpression.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 25, everyStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "everyStatement"

    public static class constraintFunctionCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constraintFunctionCall"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:261:1: constraintFunctionCall : ID idList expressionList ;
    public final celluloidParser.constraintFunctionCall_return constraintFunctionCall() throws RecognitionException {
        celluloidParser.constraintFunctionCall_return retval = new celluloidParser.constraintFunctionCall_return();
        retval.start = input.LT(1);
        int constraintFunctionCall_StartIndex = input.index();
        Object root_0 = null;

        Token ID111=null;
        celluloidParser.idList_return idList112 = null;

        celluloidParser.expressionList_return expressionList113 = null;


        Object ID111_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:262:5: ( ID idList expressionList )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:262:10: ID idList expressionList
            {
            root_0 = (Object)adaptor.nil();

            ID111=(Token)match(input,ID,FOLLOW_ID_in_constraintFunctionCall2526); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID111_tree = (Object)adaptor.create(ID111);
            adaptor.addChild(root_0, ID111_tree);
            }
            pushFollow(FOLLOW_idList_in_constraintFunctionCall2528);
            idList112=idList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, idList112.getTree());
            pushFollow(FOLLOW_expressionList_in_constraintFunctionCall2530);
            expressionList113=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList113.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 26, constraintFunctionCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constraintFunctionCall"

    public static class functionPredicateCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionPredicateCall"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:266:1: functionPredicateCall : ID '(' expressionList ')' ( NEWLINE )? -> ^( CALL ID ^( ARGS expressionList ) ) ;
    public final celluloidParser.functionPredicateCall_return functionPredicateCall() throws RecognitionException {
        celluloidParser.functionPredicateCall_return retval = new celluloidParser.functionPredicateCall_return();
        retval.start = input.LT(1);
        int functionPredicateCall_StartIndex = input.index();
        Object root_0 = null;

        Token ID114=null;
        Token char_literal115=null;
        Token char_literal117=null;
        Token NEWLINE118=null;
        celluloidParser.expressionList_return expressionList116 = null;


        Object ID114_tree=null;
        Object char_literal115_tree=null;
        Object char_literal117_tree=null;
        Object NEWLINE118_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:267:5: ( ID '(' expressionList ')' ( NEWLINE )? -> ^( CALL ID ^( ARGS expressionList ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:267:10: ID '(' expressionList ')' ( NEWLINE )?
            {
            ID114=(Token)match(input,ID,FOLLOW_ID_in_functionPredicateCall2563); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID114);

            char_literal115=(Token)match(input,74,FOLLOW_74_in_functionPredicateCall2565); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_74.add(char_literal115);

            pushFollow(FOLLOW_expressionList_in_functionPredicateCall2567);
            expressionList116=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expressionList.add(expressionList116.getTree());
            char_literal117=(Token)match(input,75,FOLLOW_75_in_functionPredicateCall2569); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_75.add(char_literal117);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:267:36: ( NEWLINE )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==NEWLINE) ) {
                int LA38_1 = input.LA(2);

                if ( (synpred49_celluloid()) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: NEWLINE
                    {
                    NEWLINE118=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_functionPredicateCall2571); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE118);


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
            // 268:10: -> ^( CALL ID ^( ARGS expressionList ) )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:268:13: ^( CALL ID ^( ARGS expressionList ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:268:23: ^( ARGS expressionList )
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
            if ( state.backtracking>0 ) { memoize(input, 27, functionPredicateCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionPredicateCall"

    public static class functionHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionHeader"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:274:1: functionHeader : 'function' ID '(' variableList ')' NEWLINE -> ^( FUNHEAD ID variableList ) ;
    public final celluloidParser.functionHeader_return functionHeader() throws RecognitionException {
        celluloidParser.functionHeader_return retval = new celluloidParser.functionHeader_return();
        retval.start = input.LT(1);
        int functionHeader_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal119=null;
        Token ID120=null;
        Token char_literal121=null;
        Token char_literal123=null;
        Token NEWLINE124=null;
        celluloidParser.variableList_return variableList122 = null;


        Object string_literal119_tree=null;
        Object ID120_tree=null;
        Object char_literal121_tree=null;
        Object char_literal123_tree=null;
        Object NEWLINE124_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_variableList=new RewriteRuleSubtreeStream(adaptor,"rule variableList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:275:5: ( 'function' ID '(' variableList ')' NEWLINE -> ^( FUNHEAD ID variableList ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:275:10: 'function' ID '(' variableList ')' NEWLINE
            {
            string_literal119=(Token)match(input,83,FOLLOW_83_in_functionHeader2628); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_83.add(string_literal119);

            ID120=(Token)match(input,ID,FOLLOW_ID_in_functionHeader2630); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID120);

            char_literal121=(Token)match(input,74,FOLLOW_74_in_functionHeader2632); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_74.add(char_literal121);

            pushFollow(FOLLOW_variableList_in_functionHeader2634);
            variableList122=variableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableList.add(variableList122.getTree());
            char_literal123=(Token)match(input,75,FOLLOW_75_in_functionHeader2636); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_75.add(char_literal123);

            NEWLINE124=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_functionHeader2638); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE124);



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
            // 276:10: -> ^( FUNHEAD ID variableList )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:276:13: ^( FUNHEAD ID variableList )
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
            if ( state.backtracking>0 ) { memoize(input, 28, functionHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionHeader"

    public static class functionPredicateBlockDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionPredicateBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:279:1: functionPredicateBlockDeclaration : ( variableDeclaration | functionPredicateCall | inStatement | assignmentExpression NEWLINE );
    public final celluloidParser.functionPredicateBlockDeclaration_return functionPredicateBlockDeclaration() throws RecognitionException {
        celluloidParser.functionPredicateBlockDeclaration_return retval = new celluloidParser.functionPredicateBlockDeclaration_return();
        retval.start = input.LT(1);
        int functionPredicateBlockDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token NEWLINE129=null;
        celluloidParser.variableDeclaration_return variableDeclaration125 = null;

        celluloidParser.functionPredicateCall_return functionPredicateCall126 = null;

        celluloidParser.inStatement_return inStatement127 = null;

        celluloidParser.assignmentExpression_return assignmentExpression128 = null;


        Object NEWLINE129_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:280:5: ( variableDeclaration | functionPredicateCall | inStatement | assignmentExpression NEWLINE )
            int alt39=4;
            switch ( input.LA(1) ) {
            case TYPE:
            case 68:
                {
                alt39=1;
                }
                break;
            case ID:
                {
                int LA39_3 = input.LA(2);

                if ( (synpred51_celluloid()) ) {
                    alt39=2;
                }
                else if ( (true) ) {
                    alt39=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 3, input);

                    throw nvae;
                }
                }
                break;
            case 66:
                {
                alt39=3;
                }
                break;
            case LITERAL:
            case 70:
            case 73:
                {
                alt39=4;
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
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:280:10: variableDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableDeclaration_in_functionPredicateBlockDeclaration2678);
                    variableDeclaration125=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration125.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:281:10: functionPredicateCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionPredicateCall_in_functionPredicateBlockDeclaration2689);
                    functionPredicateCall126=functionPredicateCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionPredicateCall126.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:282:10: inStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_inStatement_in_functionPredicateBlockDeclaration2700);
                    inStatement127=inStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inStatement127.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:283:10: assignmentExpression NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignmentExpression_in_functionPredicateBlockDeclaration2711);
                    assignmentExpression128=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression128.getTree());
                    NEWLINE129=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_functionPredicateBlockDeclaration2713); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE129_tree = (Object)adaptor.create(NEWLINE129);
                    adaptor.addChild(root_0, NEWLINE129_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 29, functionPredicateBlockDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionPredicateBlockDeclaration"

    public static class functionBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:285:1: functionBlock : START (block+= functionPredicateBlockDeclaration | NEWLINE )* END -> ^( FUNBLOCK[$START, \"FUNCBLOCK\"] RETURN ( $block)* ) ;
    public final celluloidParser.functionBlock_return functionBlock() throws RecognitionException {
        celluloidParser.functionBlock_return retval = new celluloidParser.functionBlock_return();
        retval.start = input.LT(1);
        int functionBlock_StartIndex = input.index();
        Object root_0 = null;

        Token START130=null;
        Token NEWLINE131=null;
        Token END132=null;
        List list_block=null;
        RuleReturnScope block = null;
        Object START130_tree=null;
        Object NEWLINE131_tree=null;
        Object END132_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_functionPredicateBlockDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule functionPredicateBlockDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:286:5: ( START (block+= functionPredicateBlockDeclaration | NEWLINE )* END -> ^( FUNBLOCK[$START, \"FUNCBLOCK\"] RETURN ( $block)* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:286:10: START (block+= functionPredicateBlockDeclaration | NEWLINE )* END
            {
            START130=(Token)match(input,START,FOLLOW_START_in_functionBlock2738); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START130);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:287:12: (block+= functionPredicateBlockDeclaration | NEWLINE )*
            loop40:
            do {
                int alt40=3;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==TYPE||LA40_0==ID||(LA40_0>=LITERAL && LA40_0<=66)||LA40_0==68||LA40_0==70||LA40_0==73) ) {
                    alt40=1;
                }
                else if ( (LA40_0==NEWLINE) ) {
                    alt40=2;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:287:14: block+= functionPredicateBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_functionPredicateBlockDeclaration_in_functionBlock2758);
            	    block=functionPredicateBlockDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_functionPredicateBlockDeclaration.add(block.getTree());
            	    if (list_block==null) list_block=new ArrayList();
            	    list_block.add(block.getTree());


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:287:59: NEWLINE
            	    {
            	    NEWLINE131=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_functionBlock2762); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE131);


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            END132=(Token)match(input,END,FOLLOW_END_in_functionBlock2777); if (state.failed) return retval; 
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
            // 289:10: -> ^( FUNBLOCK[$START, \"FUNCBLOCK\"] RETURN ( $block)* )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:289:13: ^( FUNBLOCK[$START, \"FUNCBLOCK\"] RETURN ( $block)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNBLOCK, START130, "FUNCBLOCK"), root_1);

                adaptor.addChild(root_1, (Object)adaptor.create(RETURN, "RETURN"));
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:289:52: ( $block)*
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
            if ( state.backtracking>0 ) { memoize(input, 30, functionBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionBlock"

    public static class functionDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:294:1: functionDefinition : 'function' ID '(' variableList ')' functionBlock -> ^( FUNC ID variableList ( functionBlock )? ) ;
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
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_variableList=new RewriteRuleSubtreeStream(adaptor,"rule variableList");
        RewriteRuleSubtreeStream stream_functionBlock=new RewriteRuleSubtreeStream(adaptor,"rule functionBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:295:5: ( 'function' ID '(' variableList ')' functionBlock -> ^( FUNC ID variableList ( functionBlock )? ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:295:10: 'function' ID '(' variableList ')' functionBlock
            {
            string_literal133=(Token)match(input,83,FOLLOW_83_in_functionDefinition2851); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_83.add(string_literal133);

            ID134=(Token)match(input,ID,FOLLOW_ID_in_functionDefinition2853); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID134);

            char_literal135=(Token)match(input,74,FOLLOW_74_in_functionDefinition2855); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_74.add(char_literal135);

            pushFollow(FOLLOW_variableList_in_functionDefinition2857);
            variableList136=variableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableList.add(variableList136.getTree());
            char_literal137=(Token)match(input,75,FOLLOW_75_in_functionDefinition2859); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_75.add(char_literal137);

            pushFollow(FOLLOW_functionBlock_in_functionDefinition2861);
            functionBlock138=functionBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionBlock.add(functionBlock138.getTree());


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
            // 296:10: -> ^( FUNC ID variableList ( functionBlock )? )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:296:13: ^( FUNC ID variableList ( functionBlock )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC, "FUNC"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_variableList.nextTree());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:296:36: ( functionBlock )?
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
            if ( state.backtracking>0 ) { memoize(input, 31, functionDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionDefinition"

    public static class predicateHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predicateHeader"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:302:1: predicateHeader : 'predicate' ID '(' variableList ')' NEWLINE -> ^( PREDHEAD ID variableList ) ;
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
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_variableList=new RewriteRuleSubtreeStream(adaptor,"rule variableList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:303:5: ( 'predicate' ID '(' variableList ')' NEWLINE -> ^( PREDHEAD ID variableList ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:303:10: 'predicate' ID '(' variableList ')' NEWLINE
            {
            string_literal139=(Token)match(input,84,FOLLOW_84_in_predicateHeader2921); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_84.add(string_literal139);

            ID140=(Token)match(input,ID,FOLLOW_ID_in_predicateHeader2923); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID140);

            char_literal141=(Token)match(input,74,FOLLOW_74_in_predicateHeader2925); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_74.add(char_literal141);

            pushFollow(FOLLOW_variableList_in_predicateHeader2927);
            variableList142=variableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableList.add(variableList142.getTree());
            char_literal143=(Token)match(input,75,FOLLOW_75_in_predicateHeader2929); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_75.add(char_literal143);

            NEWLINE144=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_predicateHeader2931); if (state.failed) return retval; 
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
            // 304:10: -> ^( PREDHEAD ID variableList )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:304:13: ^( PREDHEAD ID variableList )
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
            if ( state.backtracking>0 ) { memoize(input, 32, predicateHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "predicateHeader"

    public static class predicateDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predicateDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:308:1: predicateDefinition : 'predicate' ID '(' variableList ')' predicateBlock -> ^( PRED ID variableList predicateBlock ) ;
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
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_predicateBlock=new RewriteRuleSubtreeStream(adaptor,"rule predicateBlock");
        RewriteRuleSubtreeStream stream_variableList=new RewriteRuleSubtreeStream(adaptor,"rule variableList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:309:5: ( 'predicate' ID '(' variableList ')' predicateBlock -> ^( PRED ID variableList predicateBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:309:10: 'predicate' ID '(' variableList ')' predicateBlock
            {
            string_literal145=(Token)match(input,84,FOLLOW_84_in_predicateDefinition2982); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_84.add(string_literal145);

            ID146=(Token)match(input,ID,FOLLOW_ID_in_predicateDefinition2984); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID146);

            char_literal147=(Token)match(input,74,FOLLOW_74_in_predicateDefinition2986); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_74.add(char_literal147);

            pushFollow(FOLLOW_variableList_in_predicateDefinition2988);
            variableList148=variableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableList.add(variableList148.getTree());
            char_literal149=(Token)match(input,75,FOLLOW_75_in_predicateDefinition2990); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_75.add(char_literal149);

            pushFollow(FOLLOW_predicateBlock_in_predicateDefinition2992);
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
            // 310:7: -> ^( PRED ID variableList predicateBlock )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:310:10: ^( PRED ID variableList predicateBlock )
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
            if ( state.backtracking>0 ) { memoize(input, 33, predicateDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "predicateDefinition"

    public static class predicateBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predicateBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:313:1: predicateBlock : START (block+= functionPredicateBlockDeclaration | NEWLINE )* 'return' retexp= assignmentExpression NEWLINE END -> ^( FUNBLOCK[$START, \"FUNBLOCK\"] ^( RETURN $retexp) ( $block)* ) ;
    public final celluloidParser.predicateBlock_return predicateBlock() throws RecognitionException {
        celluloidParser.predicateBlock_return retval = new celluloidParser.predicateBlock_return();
        retval.start = input.LT(1);
        int predicateBlock_StartIndex = input.index();
        Object root_0 = null;

        Token START151=null;
        Token NEWLINE152=null;
        Token string_literal153=null;
        Token NEWLINE154=null;
        Token END155=null;
        List list_block=null;
        celluloidParser.assignmentExpression_return retexp = null;

        RuleReturnScope block = null;
        Object START151_tree=null;
        Object NEWLINE152_tree=null;
        Object string_literal153_tree=null;
        Object NEWLINE154_tree=null;
        Object END155_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_functionPredicateBlockDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule functionPredicateBlockDeclaration");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:314:5: ( START (block+= functionPredicateBlockDeclaration | NEWLINE )* 'return' retexp= assignmentExpression NEWLINE END -> ^( FUNBLOCK[$START, \"FUNBLOCK\"] ^( RETURN $retexp) ( $block)* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:315:10: START (block+= functionPredicateBlockDeclaration | NEWLINE )* 'return' retexp= assignmentExpression NEWLINE END
            {
            START151=(Token)match(input,START,FOLLOW_START_in_predicateBlock3056); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START151);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:316:12: (block+= functionPredicateBlockDeclaration | NEWLINE )*
            loop41:
            do {
                int alt41=3;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==TYPE||LA41_0==ID||(LA41_0>=LITERAL && LA41_0<=66)||LA41_0==68||LA41_0==70||LA41_0==73) ) {
                    alt41=1;
                }
                else if ( (LA41_0==NEWLINE) ) {
                    alt41=2;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:316:14: block+= functionPredicateBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_functionPredicateBlockDeclaration_in_predicateBlock3075);
            	    block=functionPredicateBlockDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_functionPredicateBlockDeclaration.add(block.getTree());
            	    if (list_block==null) list_block=new ArrayList();
            	    list_block.add(block.getTree());


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:316:59: NEWLINE
            	    {
            	    NEWLINE152=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_predicateBlock3079); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE152);


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            string_literal153=(Token)match(input,85,FOLLOW_85_in_predicateBlock3096); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_85.add(string_literal153);

            pushFollow(FOLLOW_assignmentExpression_in_predicateBlock3102);
            retexp=assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignmentExpression.add(retexp.getTree());
            NEWLINE154=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_predicateBlock3104); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE154);

            END155=(Token)match(input,END,FOLLOW_END_in_predicateBlock3116); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END155);



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
            // 319:10: -> ^( FUNBLOCK[$START, \"FUNBLOCK\"] ^( RETURN $retexp) ( $block)* )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:319:13: ^( FUNBLOCK[$START, \"FUNBLOCK\"] ^( RETURN $retexp) ( $block)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNBLOCK, START151, "FUNBLOCK"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:319:44: ^( RETURN $retexp)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_2);

                adaptor.addChild(root_2, stream_retexp.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:319:62: ( $block)*
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
            if ( state.backtracking>0 ) { memoize(input, 34, predicateBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "predicateBlock"

    public static class eventDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eventDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:326:1: eventDefinition : 'event' ID NEWLINE -> ^( EVENT ID ) ;
    public final celluloidParser.eventDefinition_return eventDefinition() throws RecognitionException {
        celluloidParser.eventDefinition_return retval = new celluloidParser.eventDefinition_return();
        retval.start = input.LT(1);
        int eventDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal156=null;
        Token ID157=null;
        Token NEWLINE158=null;

        Object string_literal156_tree=null;
        Object ID157_tree=null;
        Object NEWLINE158_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:327:5: ( 'event' ID NEWLINE -> ^( EVENT ID ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:327:10: 'event' ID NEWLINE
            {
            string_literal156=(Token)match(input,86,FOLLOW_86_in_eventDefinition3187); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_86.add(string_literal156);

            ID157=(Token)match(input,ID,FOLLOW_ID_in_eventDefinition3189); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID157);

            NEWLINE158=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_eventDefinition3191); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE158);



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
            // 328:10: -> ^( EVENT ID )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:328:13: ^( EVENT ID )
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
            if ( state.backtracking>0 ) { memoize(input, 35, eventDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "eventDefinition"

    public static class announcementDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "announcementDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:334:1: announcementDeclaration : 'announce' eventName= ID 'when' functionName= ID (predicateExpr= variableDeclaration )? NEWLINE -> ^( ANNOUNCEMENT $eventName $functionName ( $predicateExpr)? ) ;
    public final celluloidParser.announcementDeclaration_return announcementDeclaration() throws RecognitionException {
        celluloidParser.announcementDeclaration_return retval = new celluloidParser.announcementDeclaration_return();
        retval.start = input.LT(1);
        int announcementDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token eventName=null;
        Token functionName=null;
        Token string_literal159=null;
        Token string_literal160=null;
        Token NEWLINE161=null;
        celluloidParser.variableDeclaration_return predicateExpr = null;


        Object eventName_tree=null;
        Object functionName_tree=null;
        Object string_literal159_tree=null;
        Object string_literal160_tree=null;
        Object NEWLINE161_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:335:5: ( 'announce' eventName= ID 'when' functionName= ID (predicateExpr= variableDeclaration )? NEWLINE -> ^( ANNOUNCEMENT $eventName $functionName ( $predicateExpr)? ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:336:10: 'announce' eventName= ID 'when' functionName= ID (predicateExpr= variableDeclaration )? NEWLINE
            {
            string_literal159=(Token)match(input,87,FOLLOW_87_in_announcementDeclaration3250); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_87.add(string_literal159);

            eventName=(Token)match(input,ID,FOLLOW_ID_in_announcementDeclaration3256); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(eventName);

            string_literal160=(Token)match(input,80,FOLLOW_80_in_announcementDeclaration3258); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_80.add(string_literal160);

            functionName=(Token)match(input,ID,FOLLOW_ID_in_announcementDeclaration3264); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(functionName);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:336:61: (predicateExpr= variableDeclaration )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==TYPE||LA42_0==68) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:336:62: predicateExpr= variableDeclaration
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_announcementDeclaration3271);
                    predicateExpr=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(predicateExpr.getTree());

                    }
                    break;

            }

            NEWLINE161=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_announcementDeclaration3275); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE161);



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
            // 337:10: -> ^( ANNOUNCEMENT $eventName $functionName ( $predicateExpr)? )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:337:13: ^( ANNOUNCEMENT $eventName $functionName ( $predicateExpr)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ANNOUNCEMENT, "ANNOUNCEMENT"), root_1);

                adaptor.addChild(root_1, stream_eventName.nextNode());
                adaptor.addChild(root_1, stream_functionName.nextNode());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:337:53: ( $predicateExpr)?
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
            if ( state.backtracking>0 ) { memoize(input, 36, announcementDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "announcementDeclaration"

    public static class constraintBlockDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constraintBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:342:1: constraintBlockDeclaration : ( variableDeclaration | predicateHeader | functionHeader );
    public final celluloidParser.constraintBlockDeclaration_return constraintBlockDeclaration() throws RecognitionException {
        celluloidParser.constraintBlockDeclaration_return retval = new celluloidParser.constraintBlockDeclaration_return();
        retval.start = input.LT(1);
        int constraintBlockDeclaration_StartIndex = input.index();
        Object root_0 = null;

        celluloidParser.variableDeclaration_return variableDeclaration162 = null;

        celluloidParser.predicateHeader_return predicateHeader163 = null;

        celluloidParser.functionHeader_return functionHeader164 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:343:5: ( variableDeclaration | predicateHeader | functionHeader )
            int alt43=3;
            switch ( input.LA(1) ) {
            case TYPE:
            case 68:
                {
                alt43=1;
                }
                break;
            case 84:
                {
                alt43=2;
                }
                break;
            case 83:
                {
                alt43=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:343:7: variableDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableDeclaration_in_constraintBlockDeclaration3320);
                    variableDeclaration162=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration162.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:344:9: predicateHeader
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_predicateHeader_in_constraintBlockDeclaration3331);
                    predicateHeader163=predicateHeader();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, predicateHeader163.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:345:9: functionHeader
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionHeader_in_constraintBlockDeclaration3342);
                    functionHeader164=functionHeader();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionHeader164.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 37, constraintBlockDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constraintBlockDeclaration"

    public static class constraintBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constraintBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:347:1: constraintBlock : START (block+= constraintBlockDeclaration | announcements+= announcementDeclaration )* END -> ^( CONBLOCK ( $block)* ^( ANNOUNCEMENTS ( $announcements)* ) ) ;
    public final celluloidParser.constraintBlock_return constraintBlock() throws RecognitionException {
        celluloidParser.constraintBlock_return retval = new celluloidParser.constraintBlock_return();
        retval.start = input.LT(1);
        int constraintBlock_StartIndex = input.index();
        Object root_0 = null;

        Token START165=null;
        Token END166=null;
        List list_block=null;
        List list_announcements=null;
        RuleReturnScope block = null;
        RuleReturnScope announcements = null;
        Object START165_tree=null;
        Object END166_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_announcementDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule announcementDeclaration");
        RewriteRuleSubtreeStream stream_constraintBlockDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule constraintBlockDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:348:5: ( START (block+= constraintBlockDeclaration | announcements+= announcementDeclaration )* END -> ^( CONBLOCK ( $block)* ^( ANNOUNCEMENTS ( $announcements)* ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:348:10: START (block+= constraintBlockDeclaration | announcements+= announcementDeclaration )* END
            {
            START165=(Token)match(input,START,FOLLOW_START_in_constraintBlock3363); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START165);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:349:14: (block+= constraintBlockDeclaration | announcements+= announcementDeclaration )*
            loop44:
            do {
                int alt44=3;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==TYPE||LA44_0==68||(LA44_0>=83 && LA44_0<=84)) ) {
                    alt44=1;
                }
                else if ( (LA44_0==87) ) {
                    alt44=2;
                }


                switch (alt44) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:349:15: block+= constraintBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_constraintBlockDeclaration_in_constraintBlock3384);
            	    block=constraintBlockDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_constraintBlockDeclaration.add(block.getTree());
            	    if (list_block==null) list_block=new ArrayList();
            	    list_block.add(block.getTree());


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:349:53: announcements+= announcementDeclaration
            	    {
            	    pushFollow(FOLLOW_announcementDeclaration_in_constraintBlock3392);
            	    announcements=announcementDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_announcementDeclaration.add(announcements.getTree());
            	    if (list_announcements==null) list_announcements=new ArrayList();
            	    list_announcements.add(announcements.getTree());


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            END166=(Token)match(input,END,FOLLOW_END_in_constraintBlock3405); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END166);



            // AST REWRITE
            // elements: block, announcements
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
            // 351:10: -> ^( CONBLOCK ( $block)* ^( ANNOUNCEMENTS ( $announcements)* ) )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:351:13: ^( CONBLOCK ( $block)* ^( ANNOUNCEMENTS ( $announcements)* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONBLOCK, "CONBLOCK"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:351:24: ( $block)*
                while ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:351:32: ^( ANNOUNCEMENTS ( $announcements)* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ANNOUNCEMENTS, "ANNOUNCEMENTS"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:351:48: ( $announcements)*
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
            if ( state.backtracking>0 ) { memoize(input, 38, constraintBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constraintBlock"

    public static class constraintDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constraintDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:354:1: constraintDefinition : 'constraint' ID ( 'requires' requires= idList )? ( 'announces' announces= idList )? constraintBlock -> ^( CONSTRAINT ID ^( REQUIRES ( $requires)? ) ^( ANNOUNCES ( $announces)? ) constraintBlock ) ;
    public final celluloidParser.constraintDefinition_return constraintDefinition() throws RecognitionException {
        celluloidParser.constraintDefinition_return retval = new celluloidParser.constraintDefinition_return();
        retval.start = input.LT(1);
        int constraintDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal167=null;
        Token ID168=null;
        Token string_literal169=null;
        Token string_literal170=null;
        celluloidParser.idList_return requires = null;

        celluloidParser.idList_return announces = null;

        celluloidParser.constraintBlock_return constraintBlock171 = null;


        Object string_literal167_tree=null;
        Object ID168_tree=null;
        Object string_literal169_tree=null;
        Object string_literal170_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_constraintBlock=new RewriteRuleSubtreeStream(adaptor,"rule constraintBlock");
        RewriteRuleSubtreeStream stream_idList=new RewriteRuleSubtreeStream(adaptor,"rule idList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:355:5: ( 'constraint' ID ( 'requires' requires= idList )? ( 'announces' announces= idList )? constraintBlock -> ^( CONSTRAINT ID ^( REQUIRES ( $requires)? ) ^( ANNOUNCES ( $announces)? ) constraintBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:355:10: 'constraint' ID ( 'requires' requires= idList )? ( 'announces' announces= idList )? constraintBlock
            {
            string_literal167=(Token)match(input,88,FOLLOW_88_in_constraintDefinition3459); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_88.add(string_literal167);

            ID168=(Token)match(input,ID,FOLLOW_ID_in_constraintDefinition3461); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID168);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:355:26: ( 'requires' requires= idList )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==89) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:355:27: 'requires' requires= idList
                    {
                    string_literal169=(Token)match(input,89,FOLLOW_89_in_constraintDefinition3464); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_89.add(string_literal169);

                    pushFollow(FOLLOW_idList_in_constraintDefinition3470);
                    requires=idList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_idList.add(requires.getTree());

                    }
                    break;

            }

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:356:10: ( 'announces' announces= idList )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==90) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:356:11: 'announces' announces= idList
                    {
                    string_literal170=(Token)match(input,90,FOLLOW_90_in_constraintDefinition3484); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_90.add(string_literal170);

                    pushFollow(FOLLOW_idList_in_constraintDefinition3490);
                    announces=idList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_idList.add(announces.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_constraintBlock_in_constraintDefinition3504);
            constraintBlock171=constraintBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_constraintBlock.add(constraintBlock171.getTree());


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
            // 358:10: -> ^( CONSTRAINT ID ^( REQUIRES ( $requires)? ) ^( ANNOUNCES ( $announces)? ) constraintBlock )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:358:13: ^( CONSTRAINT ID ^( REQUIRES ( $requires)? ) ^( ANNOUNCES ( $announces)? ) constraintBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINT, "CONSTRAINT"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:358:29: ^( REQUIRES ( $requires)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(REQUIRES, "REQUIRES"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:358:40: ( $requires)?
                if ( stream_requires.hasNext() ) {
                    adaptor.addChild(root_2, stream_requires.nextTree());

                }
                stream_requires.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:358:52: ^( ANNOUNCES ( $announces)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ANNOUNCES, "ANNOUNCES"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:358:64: ( $announces)?
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
            if ( state.backtracking>0 ) { memoize(input, 39, constraintDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constraintDefinition"

    public static class deviceBlockDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "deviceBlockDeclaration"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:363:1: deviceBlockDeclaration : ( variableDeclaration | predicateDefinition | functionDefinition );
    public final celluloidParser.deviceBlockDeclaration_return deviceBlockDeclaration() throws RecognitionException {
        celluloidParser.deviceBlockDeclaration_return retval = new celluloidParser.deviceBlockDeclaration_return();
        retval.start = input.LT(1);
        int deviceBlockDeclaration_StartIndex = input.index();
        Object root_0 = null;

        celluloidParser.variableDeclaration_return variableDeclaration172 = null;

        celluloidParser.predicateDefinition_return predicateDefinition173 = null;

        celluloidParser.functionDefinition_return functionDefinition174 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:364:5: ( variableDeclaration | predicateDefinition | functionDefinition )
            int alt47=3;
            switch ( input.LA(1) ) {
            case TYPE:
            case 68:
                {
                alt47=1;
                }
                break;
            case 84:
                {
                alt47=2;
                }
                break;
            case 83:
                {
                alt47=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:364:10: variableDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableDeclaration_in_deviceBlockDeclaration3591);
                    variableDeclaration172=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration172.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:365:10: predicateDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_predicateDefinition_in_deviceBlockDeclaration3603);
                    predicateDefinition173=predicateDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, predicateDefinition173.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:366:10: functionDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionDefinition_in_deviceBlockDeclaration3615);
                    functionDefinition174=functionDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDefinition174.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 40, deviceBlockDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "deviceBlockDeclaration"

    public static class deviceBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "deviceBlock"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:368:1: deviceBlock : START (block+= deviceBlockDeclaration )* END -> ^( DEVBLOCK ( $block)* ) ;
    public final celluloidParser.deviceBlock_return deviceBlock() throws RecognitionException {
        celluloidParser.deviceBlock_return retval = new celluloidParser.deviceBlock_return();
        retval.start = input.LT(1);
        int deviceBlock_StartIndex = input.index();
        Object root_0 = null;

        Token START175=null;
        Token END176=null;
        List list_block=null;
        RuleReturnScope block = null;
        Object START175_tree=null;
        Object END176_tree=null;
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_deviceBlockDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule deviceBlockDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:369:5: ( START (block+= deviceBlockDeclaration )* END -> ^( DEVBLOCK ( $block)* ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:369:10: START (block+= deviceBlockDeclaration )* END
            {
            START175=(Token)match(input,START,FOLLOW_START_in_deviceBlock3635); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_START.add(START175);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:370:15: (block+= deviceBlockDeclaration )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==TYPE||LA48_0==68||(LA48_0>=83 && LA48_0<=84)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:370:16: block+= deviceBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_deviceBlockDeclaration_in_deviceBlock3657);
            	    block=deviceBlockDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_deviceBlockDeclaration.add(block.getTree());
            	    if (list_block==null) list_block=new ArrayList();
            	    list_block.add(block.getTree());


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            END176=(Token)match(input,END,FOLLOW_END_in_deviceBlock3670); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END176);



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
            // 372:10: -> ^( DEVBLOCK ( $block)* )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:372:13: ^( DEVBLOCK ( $block)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEVBLOCK, "DEVBLOCK"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:372:24: ( $block)*
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
            if ( state.backtracking>0 ) { memoize(input, 41, deviceBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "deviceBlock"

    public static class deviceDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "deviceDefinition"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:374:1: deviceDefinition : 'device' ID ( 'accepts' accepts= idList )? deviceBlock -> ^( DEVICE ID ^( ACCEPTS ( $accepts)? ) deviceBlock ) ;
    public final celluloidParser.deviceDefinition_return deviceDefinition() throws RecognitionException {
        celluloidParser.deviceDefinition_return retval = new celluloidParser.deviceDefinition_return();
        retval.start = input.LT(1);
        int deviceDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal177=null;
        Token ID178=null;
        Token string_literal179=null;
        celluloidParser.idList_return accepts = null;

        celluloidParser.deviceBlock_return deviceBlock180 = null;


        Object string_literal177_tree=null;
        Object ID178_tree=null;
        Object string_literal179_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_idList=new RewriteRuleSubtreeStream(adaptor,"rule idList");
        RewriteRuleSubtreeStream stream_deviceBlock=new RewriteRuleSubtreeStream(adaptor,"rule deviceBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:375:5: ( 'device' ID ( 'accepts' accepts= idList )? deviceBlock -> ^( DEVICE ID ^( ACCEPTS ( $accepts)? ) deviceBlock ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:375:10: 'device' ID ( 'accepts' accepts= idList )? deviceBlock
            {
            string_literal177=(Token)match(input,91,FOLLOW_91_in_deviceDefinition3714); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_91.add(string_literal177);

            ID178=(Token)match(input,ID,FOLLOW_ID_in_deviceDefinition3716); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID178);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:375:22: ( 'accepts' accepts= idList )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==92) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:375:23: 'accepts' accepts= idList
                    {
                    string_literal179=(Token)match(input,92,FOLLOW_92_in_deviceDefinition3719); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(string_literal179);

                    pushFollow(FOLLOW_idList_in_deviceDefinition3725);
                    accepts=idList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_idList.add(accepts.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_deviceBlock_in_deviceDefinition3729);
            deviceBlock180=deviceBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_deviceBlock.add(deviceBlock180.getTree());


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
            // 376:10: -> ^( DEVICE ID ^( ACCEPTS ( $accepts)? ) deviceBlock )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:376:13: ^( DEVICE ID ^( ACCEPTS ( $accepts)? ) deviceBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEVICE, "DEVICE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:376:25: ^( ACCEPTS ( $accepts)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ACCEPTS, "ACCEPTS"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:376:35: ( $accepts)?
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
            if ( state.backtracking>0 ) { memoize(input, 42, deviceDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "deviceDefinition"

    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:383:1: program : (events+= eventDefinition NEWLINE )* ( NEWLINE )* (constraints+= constraintDefinition NEWLINE )* ( NEWLINE )* (devices+= deviceDefinition NEWLINE )* ( NEWLINE )* (functionsPredicates+= functionDefinition | functionsPredicates+= predicateDefinition | NEWLINE )* ( NEWLINE )* (block+= functionPredicateBlockDeclaration )* ( NEWLINE )* -> ^( PROGRAM ^( EVENTS ( $events)* ) ^( CONSTRAINTS ( $constraints)* ) ^( DEVICES ( $devices)* ) ^( FUNCTIONS ( $functionsPredicates)* ) ^( PROGBLOCK ( $block)* ) ) ;
    public final celluloidParser.program_return program() throws RecognitionException {
        celluloidParser.program_return retval = new celluloidParser.program_return();
        retval.start = input.LT(1);
        int program_StartIndex = input.index();
        Object root_0 = null;

        Token NEWLINE181=null;
        Token NEWLINE182=null;
        Token NEWLINE183=null;
        Token NEWLINE184=null;
        Token NEWLINE185=null;
        Token NEWLINE186=null;
        Token NEWLINE187=null;
        Token NEWLINE188=null;
        Token NEWLINE189=null;
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
        Object NEWLINE181_tree=null;
        Object NEWLINE182_tree=null;
        Object NEWLINE183_tree=null;
        Object NEWLINE184_tree=null;
        Object NEWLINE185_tree=null;
        Object NEWLINE186_tree=null;
        Object NEWLINE187_tree=null;
        Object NEWLINE188_tree=null;
        Object NEWLINE189_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_functionPredicateBlockDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule functionPredicateBlockDeclaration");
        RewriteRuleSubtreeStream stream_functionDefinition=new RewriteRuleSubtreeStream(adaptor,"rule functionDefinition");
        RewriteRuleSubtreeStream stream_predicateDefinition=new RewriteRuleSubtreeStream(adaptor,"rule predicateDefinition");
        RewriteRuleSubtreeStream stream_deviceDefinition=new RewriteRuleSubtreeStream(adaptor,"rule deviceDefinition");
        RewriteRuleSubtreeStream stream_constraintDefinition=new RewriteRuleSubtreeStream(adaptor,"rule constraintDefinition");
        RewriteRuleSubtreeStream stream_eventDefinition=new RewriteRuleSubtreeStream(adaptor,"rule eventDefinition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:384:5: ( (events+= eventDefinition NEWLINE )* ( NEWLINE )* (constraints+= constraintDefinition NEWLINE )* ( NEWLINE )* (devices+= deviceDefinition NEWLINE )* ( NEWLINE )* (functionsPredicates+= functionDefinition | functionsPredicates+= predicateDefinition | NEWLINE )* ( NEWLINE )* (block+= functionPredicateBlockDeclaration )* ( NEWLINE )* -> ^( PROGRAM ^( EVENTS ( $events)* ) ^( CONSTRAINTS ( $constraints)* ) ^( DEVICES ( $devices)* ) ^( FUNCTIONS ( $functionsPredicates)* ) ^( PROGBLOCK ( $block)* ) ) )
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:384:10: (events+= eventDefinition NEWLINE )* ( NEWLINE )* (constraints+= constraintDefinition NEWLINE )* ( NEWLINE )* (devices+= deviceDefinition NEWLINE )* ( NEWLINE )* (functionsPredicates+= functionDefinition | functionsPredicates+= predicateDefinition | NEWLINE )* ( NEWLINE )* (block+= functionPredicateBlockDeclaration )* ( NEWLINE )*
            {
            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:384:10: (events+= eventDefinition NEWLINE )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==86) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:384:11: events+= eventDefinition NEWLINE
            	    {
            	    pushFollow(FOLLOW_eventDefinition_in_program3795);
            	    events=eventDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_eventDefinition.add(events.getTree());
            	    if (list_events==null) list_events=new ArrayList();
            	    list_events.add(events.getTree());

            	    NEWLINE181=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_program3797); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE181);


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:385:10: ( NEWLINE )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==NEWLINE) ) {
                    int LA51_2 = input.LA(2);

                    if ( (synpred69_celluloid()) ) {
                        alt51=1;
                    }


                }


                switch (alt51) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: NEWLINE
            	    {
            	    NEWLINE182=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_program3811); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE182);


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:386:10: (constraints+= constraintDefinition NEWLINE )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==88) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:386:11: constraints+= constraintDefinition NEWLINE
            	    {
            	    pushFollow(FOLLOW_constraintDefinition_in_program3828);
            	    constraints=constraintDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_constraintDefinition.add(constraints.getTree());
            	    if (list_constraints==null) list_constraints=new ArrayList();
            	    list_constraints.add(constraints.getTree());

            	    NEWLINE183=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_program3830); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE183);


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:387:10: ( NEWLINE )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==NEWLINE) ) {
                    int LA53_2 = input.LA(2);

                    if ( (synpred71_celluloid()) ) {
                        alt53=1;
                    }


                }


                switch (alt53) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: NEWLINE
            	    {
            	    NEWLINE184=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_program3843); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE184);


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:388:10: (devices+= deviceDefinition NEWLINE )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==91) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:388:11: devices+= deviceDefinition NEWLINE
            	    {
            	    pushFollow(FOLLOW_deviceDefinition_in_program3861);
            	    devices=deviceDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_deviceDefinition.add(devices.getTree());
            	    if (list_devices==null) list_devices=new ArrayList();
            	    list_devices.add(devices.getTree());

            	    NEWLINE185=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_program3863); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE185);


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:389:10: ( NEWLINE )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==NEWLINE) ) {
                    int LA55_2 = input.LA(2);

                    if ( (synpred73_celluloid()) ) {
                        alt55=1;
                    }


                }


                switch (alt55) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: NEWLINE
            	    {
            	    NEWLINE186=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_program3876); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE186);


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:390:10: (functionsPredicates+= functionDefinition | functionsPredicates+= predicateDefinition | NEWLINE )*
            loop56:
            do {
                int alt56=4;
                switch ( input.LA(1) ) {
                case NEWLINE:
                    {
                    int LA56_1 = input.LA(2);

                    if ( (synpred76_celluloid()) ) {
                        alt56=3;
                    }


                    }
                    break;
                case 83:
                    {
                    alt56=1;
                    }
                    break;
                case 84:
                    {
                    alt56=2;
                    }
                    break;

                }

                switch (alt56) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:390:11: functionsPredicates+= functionDefinition
            	    {
            	    pushFollow(FOLLOW_functionDefinition_in_program3893);
            	    functionsPredicates=functionDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_functionDefinition.add(functionsPredicates.getTree());
            	    if (list_functionsPredicates==null) list_functionsPredicates=new ArrayList();
            	    list_functionsPredicates.add(functionsPredicates.getTree());


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:391:13: functionsPredicates+= predicateDefinition
            	    {
            	    pushFollow(FOLLOW_predicateDefinition_in_program3912);
            	    functionsPredicates=predicateDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_predicateDefinition.add(functionsPredicates.getTree());
            	    if (list_functionsPredicates==null) list_functionsPredicates=new ArrayList();
            	    list_functionsPredicates.add(functionsPredicates.getTree());


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:392:13: NEWLINE
            	    {
            	    NEWLINE187=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_program3926); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE187);


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:393:10: ( NEWLINE )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==NEWLINE) ) {
                    int LA57_2 = input.LA(2);

                    if ( (synpred77_celluloid()) ) {
                        alt57=1;
                    }


                }


                switch (alt57) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: NEWLINE
            	    {
            	    NEWLINE188=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_program3939); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE188);


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:394:10: (block+= functionPredicateBlockDeclaration )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==TYPE||LA58_0==ID||(LA58_0>=LITERAL && LA58_0<=66)||LA58_0==68||LA58_0==70||LA58_0==73) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:394:11: block+= functionPredicateBlockDeclaration
            	    {
            	    pushFollow(FOLLOW_functionPredicateBlockDeclaration_in_program3956);
            	    block=functionPredicateBlockDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_functionPredicateBlockDeclaration.add(block.getTree());
            	    if (list_block==null) list_block=new ArrayList();
            	    list_block.add(block.getTree());


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:395:10: ( NEWLINE )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==NEWLINE) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:0:0: NEWLINE
            	    {
            	    NEWLINE189=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_program3969); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE189);


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);



            // AST REWRITE
            // elements: devices, block, functionsPredicates, events, constraints
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
            // 396:10: -> ^( PROGRAM ^( EVENTS ( $events)* ) ^( CONSTRAINTS ( $constraints)* ) ^( DEVICES ( $devices)* ) ^( FUNCTIONS ( $functionsPredicates)* ) ^( PROGBLOCK ( $block)* ) )
            {
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:396:13: ^( PROGRAM ^( EVENTS ( $events)* ) ^( CONSTRAINTS ( $constraints)* ) ^( DEVICES ( $devices)* ) ^( FUNCTIONS ( $functionsPredicates)* ) ^( PROGBLOCK ( $block)* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:397:17: ^( EVENTS ( $events)* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EVENTS, "EVENTS"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:397:26: ( $events)*
                while ( stream_events.hasNext() ) {
                    adaptor.addChild(root_2, stream_events.nextTree());

                }
                stream_events.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:398:17: ^( CONSTRAINTS ( $constraints)* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:398:31: ( $constraints)*
                while ( stream_constraints.hasNext() ) {
                    adaptor.addChild(root_2, stream_constraints.nextTree());

                }
                stream_constraints.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:399:17: ^( DEVICES ( $devices)* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEVICES, "DEVICES"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:399:27: ( $devices)*
                while ( stream_devices.hasNext() ) {
                    adaptor.addChild(root_2, stream_devices.nextTree());

                }
                stream_devices.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:400:17: ^( FUNCTIONS ( $functionsPredicates)* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTIONS, "FUNCTIONS"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:400:29: ( $functionsPredicates)*
                while ( stream_functionsPredicates.hasNext() ) {
                    adaptor.addChild(root_2, stream_functionsPredicates.nextTree());

                }
                stream_functionsPredicates.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:401:17: ^( PROGBLOCK ( $block)* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGBLOCK, "PROGBLOCK"), root_2);

                // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:401:29: ( $block)*
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
            if ( state.backtracking>0 ) { memoize(input, 43, program_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "program"

    // $ANTLR start synpred1_celluloid
    public final void synpred1_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:121:11: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:121:11: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred1_celluloid938); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_celluloid

    // $ANTLR start synpred4_celluloid
    public final void synpred4_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:126:11: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:126:11: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred4_celluloid1026); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_celluloid

    // $ANTLR start synpred5_celluloid
    public final void synpred5_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:137:11: ( logicalORExpression )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:137:11: logicalORExpression
        {
        pushFollow(FOLLOW_logicalORExpression_in_synpred5_celluloid1166);
        logicalORExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_celluloid

    // $ANTLR start synpred42_celluloid
    public final void synpred42_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:238:11: ( assignmentExpression )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:238:11: assignmentExpression
        {
        pushFollow(FOLLOW_assignmentExpression_in_synpred42_celluloid2229);
        assignmentExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_celluloid

    // $ANTLR start synpred43_celluloid
    public final void synpred43_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:239:14: ( constraintFunctionCall )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:239:14: constraintFunctionCall
        {
        pushFollow(FOLLOW_constraintFunctionCall_in_synpred43_celluloid2245);
        constraintFunctionCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_celluloid

    // $ANTLR start synpred49_celluloid
    public final void synpred49_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:267:36: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:267:36: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred49_celluloid2571); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_celluloid

    // $ANTLR start synpred51_celluloid
    public final void synpred51_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:281:10: ( functionPredicateCall )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:281:10: functionPredicateCall
        {
        pushFollow(FOLLOW_functionPredicateCall_in_synpred51_celluloid2689);
        functionPredicateCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_celluloid

    // $ANTLR start synpred69_celluloid
    public final void synpred69_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:385:10: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:385:10: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred69_celluloid3811); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_celluloid

    // $ANTLR start synpred71_celluloid
    public final void synpred71_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:387:10: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:387:10: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred71_celluloid3843); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_celluloid

    // $ANTLR start synpred73_celluloid
    public final void synpred73_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:389:10: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:389:10: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred73_celluloid3876); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_celluloid

    // $ANTLR start synpred76_celluloid
    public final void synpred76_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:392:13: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:392:13: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred76_celluloid3926); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred76_celluloid

    // $ANTLR start synpred77_celluloid
    public final void synpred77_celluloid_fragment() throws RecognitionException {   
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:393:10: ( NEWLINE )
        // C:\\Users\\Charlie\\Self\\GitHub\\celluloid\\parser\\celluloid.g:393:10: NEWLINE
        {
        match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred77_celluloid3939); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred77_celluloid

    // Delegated rules

    public final boolean synpred43_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_celluloid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred77_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_celluloid_fragment(); // can never throw exception
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
    public final boolean synpred76_celluloid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_celluloid_fragment(); // can never throw exception
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


    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA23_eotS =
        "\14\uffff";
    static final String DFA23_eofS =
        "\14\uffff";
    static final String DFA23_minS =
        "\1\56\1\uffff\1\56\3\uffff\1\56\1\uffff\1\74\2\56\1\74";
    static final String DFA23_maxS =
        "\1\122\1\uffff\1\112\3\uffff\1\112\1\uffff\1\114\1\111\1\112\1"+
        "\114";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\uffff\1\5\4\uffff";
    static final String DFA23_specialS =
        "\14\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\2\22\uffff\1\1\4\uffff\1\1\2\uffff\1\1\3\uffff\1\3\2\uffff"+
            "\2\4\1\5",
            "",
            "\1\7\1\1\14\uffff\5\1\6\uffff\2\1\1\uffff\1\6",
            "",
            "",
            "",
            "\1\10\22\uffff\1\1\4\uffff\1\1\2\uffff\2\1",
            "",
            "\5\1\6\uffff\2\1\1\uffff\1\1\1\12\1\11",
            "\1\13\22\uffff\1\1\4\uffff\1\1\2\uffff\1\1",
            "\1\7\1\1\14\uffff\5\1\1\7\4\uffff\1\7\2\1\2\7",
            "\5\1\6\uffff\2\1\1\uffff\1\1\1\12\1\11"
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "197:1: inBlockDeclaration : ( assignmentExpression NEWLINE | ifStatement NEWLINE | whenStatement NEWLINE | everyStatement NEWLINE | constraintFunctionCall NEWLINE );";
        }
    }
 

    public static final BitSet FOLLOW_66_in_language_block_decl311 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LANGUAGE_in_language_block_decl313 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_START_in_language_block_decl315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_language_block_in_language_block_decl317 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_END_in_language_block_decl319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_language_block349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_variableDeclaration923 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_variableDeclaration925 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_variableDeclaration938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_variableDeclaration1008 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_variableDeclaration1010 = new BitSet(new long[]{0x0000800000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_initializer_in_variableDeclaration1012 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_variableDeclaration1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_initializer1108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_in_initializer1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_assignmentExpression1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_assignmentExpression1178 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ASSIGNMENT_OPERATOR_in_assignmentExpression1180 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000242L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_logicalORExpression1234 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000242L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression1237 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_logicalORExpression1240 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000242L});
    public static final BitSet FOLLOW_logicalORExpression_in_logicalORExpression1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalANDExpression1264 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_logicalANDExpression1267 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000242L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalANDExpression1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1296 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_EQUALITY_OPERATOR_in_equalityExpression1299 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000242L});
    public static final BitSet FOLLOW_equalityExpression_in_equalityExpression1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1325 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_RELATIONAL_OPERATOR_in_relationalExpression1328 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000242L});
    public static final BitSet FOLLOW_relationalExpression_in_relationalExpression1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1355 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ADDITIVE_OPERATOR_in_additiveExpression1358 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000242L});
    public static final BitSet FOLLOW_additiveExpression_in_additiveExpression1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_multiplicativeExpression1373 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_MULTIPLICATIVE_OPERATOR_in_multiplicativeExpression1376 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000242L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_multiplicativeExpression1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primaryExpression1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_primaryExpression1396 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_primaryExpression1398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_primaryExpression1400 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000642L});
    public static final BitSet FOLLOW_expressionList_in_primaryExpression1402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_primaryExpression1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_in_primaryExpression1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionPredicateCall_in_primaryExpression1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idList1442 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_idList1445 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_idList1451 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_74_in_idList1479 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_idList1485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_76_in_idList1488 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_idList1494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_idList1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1539 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_variableList1542 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1548 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_74_in_variableList1586 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_76_in_variableList1595 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableList1601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_variableList1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1654 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_expressionList1657 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000242L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1663 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_74_in_expressionList1686 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000242L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_76_in_expressionList1695 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000242L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_expressionList1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_inBlockDeclaration1735 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_inBlockDeclaration1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_inBlockDeclaration1747 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_inBlockDeclaration1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whenStatement_in_inBlockDeclaration1759 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_inBlockDeclaration1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_everyStatement_in_inBlockDeclaration1771 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_inBlockDeclaration1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraintFunctionCall_in_inBlockDeclaration1783 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_inBlockDeclaration1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_inBlock1802 = new BitSet(new long[]{0x0000E00000000000L,0x0000000000072242L});
    public static final BitSet FOLLOW_inBlockDeclaration_in_inBlock1821 = new BitSet(new long[]{0x0000E00000000000L,0x0000000000072242L});
    public static final BitSet FOLLOW_NEWLINE_in_inBlock1825 = new BitSet(new long[]{0x0000E00000000000L,0x0000000000072242L});
    public static final BitSet FOLLOW_END_in_inBlock1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_inStatement1872 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_inStatement1874 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_inBlock_in_inStatement1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ifStatement1924 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000242L});
    public static final BitSet FOLLOW_logicalORExpression_in_ifStatement1930 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_START_in_ifStatement1940 = new BitSet(new long[]{0x0000400000000000L,0x0000000000002246L});
    public static final BitSet FOLLOW_assignmentExpression_in_ifStatement1960 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_inStatement_in_ifStatement1964 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ifStatement_in_ifStatement1968 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_ifStatement1971 = new BitSet(new long[]{0x0000600000000000L,0x000000000000E246L});
    public static final BitSet FOLLOW_elseIfStatement_in_ifStatement1993 = new BitSet(new long[]{0x0000200000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_elseStatement_in_ifStatement2009 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_END_in_ifStatement2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_elseIfStatement2087 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000242L});
    public static final BitSet FOLLOW_logicalORExpression_in_elseIfStatement2094 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_elseIfStatement2096 = new BitSet(new long[]{0x0000400000000002L,0x0000000000002246L});
    public static final BitSet FOLLOW_assignmentExpression_in_elseIfStatement2114 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_inStatement_in_elseIfStatement2118 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ifStatement_in_elseIfStatement2122 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_elseIfStatement2125 = new BitSet(new long[]{0x0000400000000002L,0x0000000000002246L});
    public static final BitSet FOLLOW_79_in_elseStatement2170 = new BitSet(new long[]{0x0000400000000002L,0x0000000000002246L});
    public static final BitSet FOLLOW_assignmentExpression_in_elseStatement2178 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_inStatement_in_elseStatement2182 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ifStatement_in_elseStatement2186 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_elseStatement2189 = new BitSet(new long[]{0x0000400000000002L,0x0000000000002246L});
    public static final BitSet FOLLOW_assignmentExpression_in_listenerBlockDeclaration2229 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_constraintFunctionCall_in_listenerBlockDeclaration2245 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ifStatement_in_listenerBlockDeclaration2261 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_constraintFunctionCall_in_listenerBlockDeclaration2276 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_listenerBlockDeclaration2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_listenerBlock2306 = new BitSet(new long[]{0x0000600000000000L,0x0000000000072242L});
    public static final BitSet FOLLOW_listenerBlockDeclaration_in_listenerBlock2324 = new BitSet(new long[]{0x0000600000000000L,0x0000000000072242L});
    public static final BitSet FOLLOW_END_in_listenerBlock2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_whenStatement2376 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000242L});
    public static final BitSet FOLLOW_81_in_whenStatement2380 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000242L});
    public static final BitSet FOLLOW_logicalORExpression_in_whenStatement2383 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_listenerBlock_in_whenStatement2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_everyStatement2438 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_TIME_in_everyStatement2440 = new BitSet(new long[]{0x0000100000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_80_in_everyStatement2448 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000242L});
    public static final BitSet FOLLOW_81_in_everyStatement2452 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000242L});
    public static final BitSet FOLLOW_logicalORExpression_in_everyStatement2455 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_listenerBlock_in_everyStatement2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_constraintFunctionCall2526 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_idList_in_constraintFunctionCall2528 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000642L});
    public static final BitSet FOLLOW_expressionList_in_constraintFunctionCall2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_functionPredicateCall2563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_functionPredicateCall2565 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000642L});
    public static final BitSet FOLLOW_expressionList_in_functionPredicateCall2567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_functionPredicateCall2569 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_functionPredicateCall2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_functionHeader2628 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_functionHeader2630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_functionHeader2632 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_variableList_in_functionHeader2634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_functionHeader2636 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_functionHeader2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_functionPredicateBlockDeclaration2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionPredicateCall_in_functionPredicateBlockDeclaration2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inStatement_in_functionPredicateBlockDeclaration2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_functionPredicateBlockDeclaration2711 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_functionPredicateBlockDeclaration2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_functionBlock2738 = new BitSet(new long[]{0x0000E40000000000L,0x0000000000000256L});
    public static final BitSet FOLLOW_functionPredicateBlockDeclaration_in_functionBlock2758 = new BitSet(new long[]{0x0000E40000000000L,0x0000000000000256L});
    public static final BitSet FOLLOW_NEWLINE_in_functionBlock2762 = new BitSet(new long[]{0x0000E40000000000L,0x0000000000000256L});
    public static final BitSet FOLLOW_END_in_functionBlock2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_functionDefinition2851 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_functionDefinition2853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_functionDefinition2855 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_variableList_in_functionDefinition2857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_functionDefinition2859 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_functionBlock_in_functionDefinition2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_predicateHeader2921 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_predicateHeader2923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_predicateHeader2925 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_variableList_in_predicateHeader2927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_predicateHeader2929 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_predicateHeader2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_predicateDefinition2982 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_predicateDefinition2984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_predicateDefinition2986 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_variableList_in_predicateDefinition2988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_predicateDefinition2990 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_predicateBlock_in_predicateDefinition2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_predicateBlock3056 = new BitSet(new long[]{0x0000C40000000000L,0x0000000000200256L});
    public static final BitSet FOLLOW_functionPredicateBlockDeclaration_in_predicateBlock3075 = new BitSet(new long[]{0x0000C40000000000L,0x0000000000200256L});
    public static final BitSet FOLLOW_NEWLINE_in_predicateBlock3079 = new BitSet(new long[]{0x0000C40000000000L,0x0000000000200256L});
    public static final BitSet FOLLOW_85_in_predicateBlock3096 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000242L});
    public static final BitSet FOLLOW_assignmentExpression_in_predicateBlock3102 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_predicateBlock3104 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_END_in_predicateBlock3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_eventDefinition3187 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_eventDefinition3189 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_eventDefinition3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_announcementDeclaration3250 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_announcementDeclaration3256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_announcementDeclaration3258 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_announcementDeclaration3264 = new BitSet(new long[]{0x0000840000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclaration_in_announcementDeclaration3271 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_announcementDeclaration3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_constraintBlockDeclaration3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicateHeader_in_constraintBlockDeclaration3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionHeader_in_constraintBlockDeclaration3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_constraintBlock3363 = new BitSet(new long[]{0x0000240000000000L,0x0000000000980010L});
    public static final BitSet FOLLOW_constraintBlockDeclaration_in_constraintBlock3384 = new BitSet(new long[]{0x0000240000000000L,0x0000000000980010L});
    public static final BitSet FOLLOW_announcementDeclaration_in_constraintBlock3392 = new BitSet(new long[]{0x0000240000000000L,0x0000000000980010L});
    public static final BitSet FOLLOW_END_in_constraintBlock3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_constraintDefinition3459 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_constraintDefinition3461 = new BitSet(new long[]{0x0000100000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_89_in_constraintDefinition3464 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_idList_in_constraintDefinition3470 = new BitSet(new long[]{0x0000100000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_90_in_constraintDefinition3484 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_idList_in_constraintDefinition3490 = new BitSet(new long[]{0x0000100000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_constraintBlock_in_constraintDefinition3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_deviceBlockDeclaration3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicateDefinition_in_deviceBlockDeclaration3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDefinition_in_deviceBlockDeclaration3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_deviceBlock3635 = new BitSet(new long[]{0x0000240000000000L,0x0000000000180010L});
    public static final BitSet FOLLOW_deviceBlockDeclaration_in_deviceBlock3657 = new BitSet(new long[]{0x0000240000000000L,0x0000000000180010L});
    public static final BitSet FOLLOW_END_in_deviceBlock3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_deviceDefinition3714 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_deviceDefinition3716 = new BitSet(new long[]{0x0000100000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_deviceDefinition3719 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_idList_in_deviceDefinition3725 = new BitSet(new long[]{0x0000100000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_deviceBlock_in_deviceDefinition3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eventDefinition_in_program3795 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_program3797 = new BitSet(new long[]{0x0000C40000000002L,0x0000000009580256L});
    public static final BitSet FOLLOW_NEWLINE_in_program3811 = new BitSet(new long[]{0x0000C40000000002L,0x0000000009180256L});
    public static final BitSet FOLLOW_constraintDefinition_in_program3828 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_program3830 = new BitSet(new long[]{0x0000C40000000002L,0x0000000009180256L});
    public static final BitSet FOLLOW_NEWLINE_in_program3843 = new BitSet(new long[]{0x0000C40000000002L,0x0000000008180256L});
    public static final BitSet FOLLOW_deviceDefinition_in_program3861 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_program3863 = new BitSet(new long[]{0x0000C40000000002L,0x0000000008180256L});
    public static final BitSet FOLLOW_NEWLINE_in_program3876 = new BitSet(new long[]{0x0000C40000000002L,0x0000000000180256L});
    public static final BitSet FOLLOW_functionDefinition_in_program3893 = new BitSet(new long[]{0x0000C40000000002L,0x0000000000180256L});
    public static final BitSet FOLLOW_predicateDefinition_in_program3912 = new BitSet(new long[]{0x0000C40000000002L,0x0000000000180256L});
    public static final BitSet FOLLOW_NEWLINE_in_program3926 = new BitSet(new long[]{0x0000C40000000002L,0x0000000000180256L});
    public static final BitSet FOLLOW_NEWLINE_in_program3939 = new BitSet(new long[]{0x0000C40000000002L,0x0000000000000256L});
    public static final BitSet FOLLOW_functionPredicateBlockDeclaration_in_program3956 = new BitSet(new long[]{0x0000C40000000002L,0x0000000000000256L});
    public static final BitSet FOLLOW_NEWLINE_in_program3969 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred1_celluloid938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred4_celluloid1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_synpred5_celluloid1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_synpred42_celluloid2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraintFunctionCall_in_synpred43_celluloid2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred49_celluloid2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionPredicateCall_in_synpred51_celluloid2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred69_celluloid3811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred71_celluloid3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred73_celluloid3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred76_celluloid3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred77_celluloid3939 = new BitSet(new long[]{0x0000000000000002L});

}