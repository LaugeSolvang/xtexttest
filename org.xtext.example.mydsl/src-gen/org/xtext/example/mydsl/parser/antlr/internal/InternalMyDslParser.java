package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Locations'", "'NPCs'", "'Items'", "'Actions'", "'Quests'", "'Story'", "':'", "'Desc'", "'Start'", "'Location'", "'Connections'", "'Player'", "'Inventory'", "'Attr'", "'='", "'Item'", "'NPC'", "'Action'", "'command'", "'effect'", "'PreCon'", "'WinCon'", "'Rewards'", "'EndDesc'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_story_0_0= ruleStory ) ) ( (lv_player_1_0= rulePlayer ) ) otherlv_2= 'Locations' ( (lv_locations_3_0= ruleLocation ) )+ otherlv_4= 'NPCs' ( (lv_npc_5_0= ruleNPC ) )* otherlv_6= 'Items' ( (lv_item_7_0= ruleItem ) )* otherlv_8= 'Actions' ( (lv_action_9_0= ruleAction ) )* otherlv_10= 'Quests' ( (lv_quest_11_0= ruleQuest ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_story_0_0 = null;

        EObject lv_player_1_0 = null;

        EObject lv_locations_3_0 = null;

        EObject lv_npc_5_0 = null;

        EObject lv_item_7_0 = null;

        EObject lv_action_9_0 = null;

        EObject lv_quest_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_story_0_0= ruleStory ) ) ( (lv_player_1_0= rulePlayer ) ) otherlv_2= 'Locations' ( (lv_locations_3_0= ruleLocation ) )+ otherlv_4= 'NPCs' ( (lv_npc_5_0= ruleNPC ) )* otherlv_6= 'Items' ( (lv_item_7_0= ruleItem ) )* otherlv_8= 'Actions' ( (lv_action_9_0= ruleAction ) )* otherlv_10= 'Quests' ( (lv_quest_11_0= ruleQuest ) )* ) )
            // InternalMyDsl.g:78:2: ( ( (lv_story_0_0= ruleStory ) ) ( (lv_player_1_0= rulePlayer ) ) otherlv_2= 'Locations' ( (lv_locations_3_0= ruleLocation ) )+ otherlv_4= 'NPCs' ( (lv_npc_5_0= ruleNPC ) )* otherlv_6= 'Items' ( (lv_item_7_0= ruleItem ) )* otherlv_8= 'Actions' ( (lv_action_9_0= ruleAction ) )* otherlv_10= 'Quests' ( (lv_quest_11_0= ruleQuest ) )* )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_story_0_0= ruleStory ) ) ( (lv_player_1_0= rulePlayer ) ) otherlv_2= 'Locations' ( (lv_locations_3_0= ruleLocation ) )+ otherlv_4= 'NPCs' ( (lv_npc_5_0= ruleNPC ) )* otherlv_6= 'Items' ( (lv_item_7_0= ruleItem ) )* otherlv_8= 'Actions' ( (lv_action_9_0= ruleAction ) )* otherlv_10= 'Quests' ( (lv_quest_11_0= ruleQuest ) )* )
            // InternalMyDsl.g:79:3: ( (lv_story_0_0= ruleStory ) ) ( (lv_player_1_0= rulePlayer ) ) otherlv_2= 'Locations' ( (lv_locations_3_0= ruleLocation ) )+ otherlv_4= 'NPCs' ( (lv_npc_5_0= ruleNPC ) )* otherlv_6= 'Items' ( (lv_item_7_0= ruleItem ) )* otherlv_8= 'Actions' ( (lv_action_9_0= ruleAction ) )* otherlv_10= 'Quests' ( (lv_quest_11_0= ruleQuest ) )*
            {
            // InternalMyDsl.g:79:3: ( (lv_story_0_0= ruleStory ) )
            // InternalMyDsl.g:80:4: (lv_story_0_0= ruleStory )
            {
            // InternalMyDsl.g:80:4: (lv_story_0_0= ruleStory )
            // InternalMyDsl.g:81:5: lv_story_0_0= ruleStory
            {

            					newCompositeNode(grammarAccess.getModelAccess().getStoryStoryParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_story_0_0=ruleStory();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"story",
            						lv_story_0_0,
            						"org.xtext.example.mydsl.MyDsl.Story");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:98:3: ( (lv_player_1_0= rulePlayer ) )
            // InternalMyDsl.g:99:4: (lv_player_1_0= rulePlayer )
            {
            // InternalMyDsl.g:99:4: (lv_player_1_0= rulePlayer )
            // InternalMyDsl.g:100:5: lv_player_1_0= rulePlayer
            {

            					newCompositeNode(grammarAccess.getModelAccess().getPlayerPlayerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_player_1_0=rulePlayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"player",
            						lv_player_1_0,
            						"org.xtext.example.mydsl.MyDsl.Player");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLocationsKeyword_2());
            		
            // InternalMyDsl.g:121:3: ( (lv_locations_3_0= ruleLocation ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:122:4: (lv_locations_3_0= ruleLocation )
            	    {
            	    // InternalMyDsl.g:122:4: (lv_locations_3_0= ruleLocation )
            	    // InternalMyDsl.g:123:5: lv_locations_3_0= ruleLocation
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getLocationsLocationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_locations_3_0=ruleLocation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"locations",
            	    						lv_locations_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Location");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getNPCsKeyword_4());
            		
            // InternalMyDsl.g:144:3: ( (lv_npc_5_0= ruleNPC ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==27) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:145:4: (lv_npc_5_0= ruleNPC )
            	    {
            	    // InternalMyDsl.g:145:4: (lv_npc_5_0= ruleNPC )
            	    // InternalMyDsl.g:146:5: lv_npc_5_0= ruleNPC
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getNpcNPCParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_npc_5_0=ruleNPC();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"npc",
            	    						lv_npc_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.NPC");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getItemsKeyword_6());
            		
            // InternalMyDsl.g:167:3: ( (lv_item_7_0= ruleItem ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:168:4: (lv_item_7_0= ruleItem )
            	    {
            	    // InternalMyDsl.g:168:4: (lv_item_7_0= ruleItem )
            	    // InternalMyDsl.g:169:5: lv_item_7_0= ruleItem
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getItemItemParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_item_7_0=ruleItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"item",
            	    						lv_item_7_0,
            	    						"org.xtext.example.mydsl.MyDsl.Item");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getModelAccess().getActionsKeyword_8());
            		
            // InternalMyDsl.g:190:3: ( (lv_action_9_0= ruleAction ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==28) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:191:4: (lv_action_9_0= ruleAction )
            	    {
            	    // InternalMyDsl.g:191:4: (lv_action_9_0= ruleAction )
            	    // InternalMyDsl.g:192:5: lv_action_9_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getActionActionParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_action_9_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"action",
            	    						lv_action_9_0,
            	    						"org.xtext.example.mydsl.MyDsl.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getModelAccess().getQuestsKeyword_10());
            		
            // InternalMyDsl.g:213:3: ( (lv_quest_11_0= ruleQuest ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:214:4: (lv_quest_11_0= ruleQuest )
            	    {
            	    // InternalMyDsl.g:214:4: (lv_quest_11_0= ruleQuest )
            	    // InternalMyDsl.g:215:5: lv_quest_11_0= ruleQuest
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getQuestQuestParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_quest_11_0=ruleQuest();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"quest",
            	    						lv_quest_11_0,
            	    						"org.xtext.example.mydsl.MyDsl.Quest");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStory"
    // InternalMyDsl.g:236:1: entryRuleStory returns [EObject current=null] : iv_ruleStory= ruleStory EOF ;
    public final EObject entryRuleStory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStory = null;


        try {
            // InternalMyDsl.g:236:46: (iv_ruleStory= ruleStory EOF )
            // InternalMyDsl.g:237:2: iv_ruleStory= ruleStory EOF
            {
             newCompositeNode(grammarAccess.getStoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStory=ruleStory();

            state._fsp--;

             current =iv_ruleStory; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStory"


    // $ANTLR start "ruleStory"
    // InternalMyDsl.g:243:1: ruleStory returns [EObject current=null] : (otherlv_0= 'Story' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Desc' otherlv_4= ':' this_STRING_5= RULE_STRING otherlv_6= 'Start' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ) ;
    public final EObject ruleStory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_STRING_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalMyDsl.g:249:2: ( (otherlv_0= 'Story' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Desc' otherlv_4= ':' this_STRING_5= RULE_STRING otherlv_6= 'Start' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ) )
            // InternalMyDsl.g:250:2: (otherlv_0= 'Story' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Desc' otherlv_4= ':' this_STRING_5= RULE_STRING otherlv_6= 'Start' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )
            {
            // InternalMyDsl.g:250:2: (otherlv_0= 'Story' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Desc' otherlv_4= ':' this_STRING_5= RULE_STRING otherlv_6= 'Start' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )
            // InternalMyDsl.g:251:3: otherlv_0= 'Story' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Desc' otherlv_4= ':' this_STRING_5= RULE_STRING otherlv_6= 'Start' otherlv_7= ':' ( (otherlv_8= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getStoryAccess().getStoryKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getStoryAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:259:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:260:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:260:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:261:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_2_0, grammarAccess.getStoryAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getStoryAccess().getDescKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getStoryAccess().getColonKeyword_4());
            		
            this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_15); 

            			newLeafNode(this_STRING_5, grammarAccess.getStoryAccess().getSTRINGTerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getStoryAccess().getStartKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getStoryAccess().getColonKeyword_7());
            		
            // InternalMyDsl.g:297:3: ( (otherlv_8= RULE_ID ) )
            // InternalMyDsl.g:298:4: (otherlv_8= RULE_ID )
            {
            // InternalMyDsl.g:298:4: (otherlv_8= RULE_ID )
            // InternalMyDsl.g:299:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoryRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_8, grammarAccess.getStoryAccess().getStartLocationLocationCrossReference_8_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStory"


    // $ANTLR start "entryRuleLocation"
    // InternalMyDsl.g:314:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalMyDsl.g:314:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalMyDsl.g:315:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalMyDsl.g:321:1: ruleLocation returns [EObject current=null] : (otherlv_0= 'Location' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'NPCs' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'Items' ( (otherlv_5= RULE_ID ) )* otherlv_6= 'Connections' ( (otherlv_7= RULE_ID ) )* ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:327:2: ( (otherlv_0= 'Location' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'NPCs' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'Items' ( (otherlv_5= RULE_ID ) )* otherlv_6= 'Connections' ( (otherlv_7= RULE_ID ) )* ) )
            // InternalMyDsl.g:328:2: (otherlv_0= 'Location' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'NPCs' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'Items' ( (otherlv_5= RULE_ID ) )* otherlv_6= 'Connections' ( (otherlv_7= RULE_ID ) )* )
            {
            // InternalMyDsl.g:328:2: (otherlv_0= 'Location' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'NPCs' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'Items' ( (otherlv_5= RULE_ID ) )* otherlv_6= 'Connections' ( (otherlv_7= RULE_ID ) )* )
            // InternalMyDsl.g:329:3: otherlv_0= 'Location' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'NPCs' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'Items' ( (otherlv_5= RULE_ID ) )* otherlv_6= 'Connections' ( (otherlv_7= RULE_ID ) )*
            {
            otherlv_0=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getLocationAccess().getLocationKeyword_0());
            		
            // InternalMyDsl.g:333:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:334:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:334:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:335:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLocationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getLocationAccess().getNPCsKeyword_2());
            		
            // InternalMyDsl.g:355:3: ( (otherlv_3= RULE_ID ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:356:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMyDsl.g:356:4: (otherlv_3= RULE_ID )
            	    // InternalMyDsl.g:357:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLocationRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    					newLeafNode(otherlv_3, grammarAccess.getLocationAccess().getNPCsNPCCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getLocationAccess().getItemsKeyword_4());
            		
            // InternalMyDsl.g:372:3: ( (otherlv_5= RULE_ID ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:373:4: (otherlv_5= RULE_ID )
            	    {
            	    // InternalMyDsl.g:373:4: (otherlv_5= RULE_ID )
            	    // InternalMyDsl.g:374:5: otherlv_5= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLocationRule());
            	    					}
            	    				
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_18); 

            	    					newLeafNode(otherlv_5, grammarAccess.getLocationAccess().getItemsItemCrossReference_5_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getLocationAccess().getConnectionsKeyword_6());
            		
            // InternalMyDsl.g:389:3: ( (otherlv_7= RULE_ID ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:390:4: (otherlv_7= RULE_ID )
            	    {
            	    // InternalMyDsl.g:390:4: (otherlv_7= RULE_ID )
            	    // InternalMyDsl.g:391:5: otherlv_7= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLocationRule());
            	    					}
            	    				
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    					newLeafNode(otherlv_7, grammarAccess.getLocationAccess().getConnectionsLocationCrossReference_7_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRulePlayer"
    // InternalMyDsl.g:406:1: entryRulePlayer returns [EObject current=null] : iv_rulePlayer= rulePlayer EOF ;
    public final EObject entryRulePlayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayer = null;


        try {
            // InternalMyDsl.g:406:47: (iv_rulePlayer= rulePlayer EOF )
            // InternalMyDsl.g:407:2: iv_rulePlayer= rulePlayer EOF
            {
             newCompositeNode(grammarAccess.getPlayerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlayer=rulePlayer();

            state._fsp--;

             current =iv_rulePlayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlayer"


    // $ANTLR start "rulePlayer"
    // InternalMyDsl.g:413:1: rulePlayer returns [EObject current=null] : (otherlv_0= 'Player' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Actions' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'Inventory' ( (otherlv_5= RULE_ID ) )* otherlv_6= 'Attr' ( (lv_attr_7_0= ruleAttribute ) )* ) ;
    public final EObject rulePlayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_attr_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:419:2: ( (otherlv_0= 'Player' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Actions' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'Inventory' ( (otherlv_5= RULE_ID ) )* otherlv_6= 'Attr' ( (lv_attr_7_0= ruleAttribute ) )* ) )
            // InternalMyDsl.g:420:2: (otherlv_0= 'Player' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Actions' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'Inventory' ( (otherlv_5= RULE_ID ) )* otherlv_6= 'Attr' ( (lv_attr_7_0= ruleAttribute ) )* )
            {
            // InternalMyDsl.g:420:2: (otherlv_0= 'Player' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Actions' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'Inventory' ( (otherlv_5= RULE_ID ) )* otherlv_6= 'Attr' ( (lv_attr_7_0= ruleAttribute ) )* )
            // InternalMyDsl.g:421:3: otherlv_0= 'Player' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Actions' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'Inventory' ( (otherlv_5= RULE_ID ) )* otherlv_6= 'Attr' ( (lv_attr_7_0= ruleAttribute ) )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getPlayerAccess().getPlayerKeyword_0());
            		
            // InternalMyDsl.g:425:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:426:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:426:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:427:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlayerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlayerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getPlayerAccess().getActionsKeyword_2());
            		
            // InternalMyDsl.g:447:3: ( (otherlv_3= RULE_ID ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:448:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMyDsl.g:448:4: (otherlv_3= RULE_ID )
            	    // InternalMyDsl.g:449:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getPlayerRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); 

            	    					newLeafNode(otherlv_3, grammarAccess.getPlayerAccess().getActionsActionCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getPlayerAccess().getInventoryKeyword_4());
            		
            // InternalMyDsl.g:464:3: ( (otherlv_5= RULE_ID ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:465:4: (otherlv_5= RULE_ID )
            	    {
            	    // InternalMyDsl.g:465:4: (otherlv_5= RULE_ID )
            	    // InternalMyDsl.g:466:5: otherlv_5= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getPlayerRule());
            	    					}
            	    				
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    					newLeafNode(otherlv_5, grammarAccess.getPlayerAccess().getItemsItemCrossReference_5_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getPlayerAccess().getAttrKeyword_6());
            		
            // InternalMyDsl.g:481:3: ( (lv_attr_7_0= ruleAttribute ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:482:4: (lv_attr_7_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:482:4: (lv_attr_7_0= ruleAttribute )
            	    // InternalMyDsl.g:483:5: lv_attr_7_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getPlayerAccess().getAttrAttributeParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_attr_7_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPlayerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attr",
            	    						lv_attr_7_0,
            	    						"org.xtext.example.mydsl.MyDsl.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlayer"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:504:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:504:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:505:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:511:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' this_INT_2= RULE_INT ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:517:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' this_INT_2= RULE_INT ) )
            // InternalMyDsl.g:518:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' this_INT_2= RULE_INT )
            {
            // InternalMyDsl.g:518:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' this_INT_2= RULE_INT )
            // InternalMyDsl.g:519:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' this_INT_2= RULE_INT
            {
            // InternalMyDsl.g:519:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:520:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:520:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:521:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			newLeafNode(this_INT_2, grammarAccess.getAttributeAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleItem"
    // InternalMyDsl.g:549:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // InternalMyDsl.g:549:45: (iv_ruleItem= ruleItem EOF )
            // InternalMyDsl.g:550:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalMyDsl.g:556:1: ruleItem returns [EObject current=null] : (otherlv_0= 'Item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Desc' this_STRING_3= RULE_STRING otherlv_4= 'Actions' ( (otherlv_5= RULE_ID ) )* ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_STRING_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:562:2: ( (otherlv_0= 'Item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Desc' this_STRING_3= RULE_STRING otherlv_4= 'Actions' ( (otherlv_5= RULE_ID ) )* ) )
            // InternalMyDsl.g:563:2: (otherlv_0= 'Item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Desc' this_STRING_3= RULE_STRING otherlv_4= 'Actions' ( (otherlv_5= RULE_ID ) )* )
            {
            // InternalMyDsl.g:563:2: (otherlv_0= 'Item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Desc' this_STRING_3= RULE_STRING otherlv_4= 'Actions' ( (otherlv_5= RULE_ID ) )* )
            // InternalMyDsl.g:564:3: otherlv_0= 'Item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Desc' this_STRING_3= RULE_STRING otherlv_4= 'Actions' ( (otherlv_5= RULE_ID ) )*
            {
            otherlv_0=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getItemAccess().getItemKeyword_0());
            		
            // InternalMyDsl.g:568:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:569:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:569:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:570:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getItemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getItemAccess().getDescKeyword_2());
            		
            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_19); 

            			newLeafNode(this_STRING_3, grammarAccess.getItemAccess().getSTRINGTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getItemAccess().getActionsKeyword_4());
            		
            // InternalMyDsl.g:598:3: ( (otherlv_5= RULE_ID ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:599:4: (otherlv_5= RULE_ID )
            	    {
            	    // InternalMyDsl.g:599:4: (otherlv_5= RULE_ID )
            	    // InternalMyDsl.g:600:5: otherlv_5= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getItemRule());
            	    					}
            	    				
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    					newLeafNode(otherlv_5, grammarAccess.getItemAccess().getActionsActionCrossReference_5_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleNPC"
    // InternalMyDsl.g:615:1: entryRuleNPC returns [EObject current=null] : iv_ruleNPC= ruleNPC EOF ;
    public final EObject entryRuleNPC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNPC = null;


        try {
            // InternalMyDsl.g:615:44: (iv_ruleNPC= ruleNPC EOF )
            // InternalMyDsl.g:616:2: iv_ruleNPC= ruleNPC EOF
            {
             newCompositeNode(grammarAccess.getNPCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNPC=ruleNPC();

            state._fsp--;

             current =iv_ruleNPC; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNPC"


    // $ANTLR start "ruleNPC"
    // InternalMyDsl.g:622:1: ruleNPC returns [EObject current=null] : (otherlv_0= 'NPC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Inventory' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'Actions' ( (otherlv_5= RULE_ID ) )* ) ;
    public final EObject ruleNPC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:628:2: ( (otherlv_0= 'NPC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Inventory' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'Actions' ( (otherlv_5= RULE_ID ) )* ) )
            // InternalMyDsl.g:629:2: (otherlv_0= 'NPC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Inventory' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'Actions' ( (otherlv_5= RULE_ID ) )* )
            {
            // InternalMyDsl.g:629:2: (otherlv_0= 'NPC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Inventory' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'Actions' ( (otherlv_5= RULE_ID ) )* )
            // InternalMyDsl.g:630:3: otherlv_0= 'NPC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Inventory' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'Actions' ( (otherlv_5= RULE_ID ) )*
            {
            otherlv_0=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getNPCAccess().getNPCKeyword_0());
            		
            // InternalMyDsl.g:634:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:635:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:635:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:636:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNPCAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNPCRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getNPCAccess().getInventoryKeyword_2());
            		
            // InternalMyDsl.g:656:3: ( (otherlv_3= RULE_ID ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:657:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMyDsl.g:657:4: (otherlv_3= RULE_ID )
            	    // InternalMyDsl.g:658:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getNPCRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    					newLeafNode(otherlv_3, grammarAccess.getNPCAccess().getItemsItemCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getNPCAccess().getActionsKeyword_4());
            		
            // InternalMyDsl.g:673:3: ( (otherlv_5= RULE_ID ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:674:4: (otherlv_5= RULE_ID )
            	    {
            	    // InternalMyDsl.g:674:4: (otherlv_5= RULE_ID )
            	    // InternalMyDsl.g:675:5: otherlv_5= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getNPCRule());
            	    					}
            	    				
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    					newLeafNode(otherlv_5, grammarAccess.getNPCAccess().getActionsActionCrossReference_5_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNPC"


    // $ANTLR start "entryRuleAction"
    // InternalMyDsl.g:690:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMyDsl.g:690:47: (iv_ruleAction= ruleAction EOF )
            // InternalMyDsl.g:691:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMyDsl.g:697:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'command' otherlv_3= ':' this_STRING_4= RULE_STRING otherlv_5= 'effect' otherlv_6= ':' this_STRING_7= RULE_STRING ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_STRING_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_STRING_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:703:2: ( (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'command' otherlv_3= ':' this_STRING_4= RULE_STRING otherlv_5= 'effect' otherlv_6= ':' this_STRING_7= RULE_STRING ) )
            // InternalMyDsl.g:704:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'command' otherlv_3= ':' this_STRING_4= RULE_STRING otherlv_5= 'effect' otherlv_6= ':' this_STRING_7= RULE_STRING )
            {
            // InternalMyDsl.g:704:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'command' otherlv_3= ':' this_STRING_4= RULE_STRING otherlv_5= 'effect' otherlv_6= ':' this_STRING_7= RULE_STRING )
            // InternalMyDsl.g:705:3: otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'command' otherlv_3= ':' this_STRING_4= RULE_STRING otherlv_5= 'effect' otherlv_6= ':' this_STRING_7= RULE_STRING
            {
            otherlv_0=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalMyDsl.g:709:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:710:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:710:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:711:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getCommandKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getActionAccess().getColonKeyword_3());
            		
            this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_27); 

            			newLeafNode(this_STRING_4, grammarAccess.getActionAccess().getSTRINGTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getActionAccess().getEffectKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getColonKeyword_6());
            		
            this_STRING_7=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(this_STRING_7, grammarAccess.getActionAccess().getSTRINGTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleQuest"
    // InternalMyDsl.g:755:1: entryRuleQuest returns [EObject current=null] : iv_ruleQuest= ruleQuest EOF ;
    public final EObject entryRuleQuest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuest = null;


        try {
            // InternalMyDsl.g:755:46: (iv_ruleQuest= ruleQuest EOF )
            // InternalMyDsl.g:756:2: iv_ruleQuest= ruleQuest EOF
            {
             newCompositeNode(grammarAccess.getQuestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuest=ruleQuest();

            state._fsp--;

             current =iv_ruleQuest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuest"


    // $ANTLR start "ruleQuest"
    // InternalMyDsl.g:762:1: ruleQuest returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Desc' this_STRING_2= RULE_STRING otherlv_3= 'PreCon' this_STRING_4= RULE_STRING otherlv_5= 'WinCon' this_STRING_6= RULE_STRING otherlv_7= 'Rewards' ( (otherlv_8= RULE_ID ) )* otherlv_9= 'EndDesc' this_STRING_10= RULE_STRING ) ;
    public final EObject ruleQuest() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_STRING_2=null;
        Token otherlv_3=null;
        Token this_STRING_4=null;
        Token otherlv_5=null;
        Token this_STRING_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token this_STRING_10=null;


        	enterRule();

        try {
            // InternalMyDsl.g:768:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Desc' this_STRING_2= RULE_STRING otherlv_3= 'PreCon' this_STRING_4= RULE_STRING otherlv_5= 'WinCon' this_STRING_6= RULE_STRING otherlv_7= 'Rewards' ( (otherlv_8= RULE_ID ) )* otherlv_9= 'EndDesc' this_STRING_10= RULE_STRING ) )
            // InternalMyDsl.g:769:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Desc' this_STRING_2= RULE_STRING otherlv_3= 'PreCon' this_STRING_4= RULE_STRING otherlv_5= 'WinCon' this_STRING_6= RULE_STRING otherlv_7= 'Rewards' ( (otherlv_8= RULE_ID ) )* otherlv_9= 'EndDesc' this_STRING_10= RULE_STRING )
            {
            // InternalMyDsl.g:769:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Desc' this_STRING_2= RULE_STRING otherlv_3= 'PreCon' this_STRING_4= RULE_STRING otherlv_5= 'WinCon' this_STRING_6= RULE_STRING otherlv_7= 'Rewards' ( (otherlv_8= RULE_ID ) )* otherlv_9= 'EndDesc' this_STRING_10= RULE_STRING )
            // InternalMyDsl.g:770:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Desc' this_STRING_2= RULE_STRING otherlv_3= 'PreCon' this_STRING_4= RULE_STRING otherlv_5= 'WinCon' this_STRING_6= RULE_STRING otherlv_7= 'Rewards' ( (otherlv_8= RULE_ID ) )* otherlv_9= 'EndDesc' this_STRING_10= RULE_STRING
            {
            // InternalMyDsl.g:770:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:771:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:771:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:772:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getQuestAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getQuestAccess().getDescKeyword_1());
            		
            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_28); 

            			newLeafNode(this_STRING_2, grammarAccess.getQuestAccess().getSTRINGTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getQuestAccess().getPreConKeyword_3());
            		
            this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_29); 

            			newLeafNode(this_STRING_4, grammarAccess.getQuestAccess().getSTRINGTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,32,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getQuestAccess().getWinConKeyword_5());
            		
            this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_30); 

            			newLeafNode(this_STRING_6, grammarAccess.getQuestAccess().getSTRINGTerminalRuleCall_6());
            		
            otherlv_7=(Token)match(input,33,FOLLOW_31); 

            			newLeafNode(otherlv_7, grammarAccess.getQuestAccess().getRewardsKeyword_7());
            		
            // InternalMyDsl.g:816:3: ( (otherlv_8= RULE_ID ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:817:4: (otherlv_8= RULE_ID )
            	    {
            	    // InternalMyDsl.g:817:4: (otherlv_8= RULE_ID )
            	    // InternalMyDsl.g:818:5: otherlv_8= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getQuestRule());
            	    					}
            	    				
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    					newLeafNode(otherlv_8, grammarAccess.getQuestAccess().getItemsItemCrossReference_8_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_9=(Token)match(input,34,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getQuestAccess().getEndDescKeyword_9());
            		
            this_STRING_10=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(this_STRING_10, grammarAccess.getQuestAccess().getSTRINGTerminalRuleCall_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuest"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000010L});

}