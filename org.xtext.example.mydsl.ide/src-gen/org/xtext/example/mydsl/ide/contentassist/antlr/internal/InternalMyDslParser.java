package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Locations'", "'NPCs'", "'Items'", "'Actions'", "'Quests'", "'Story'", "':'", "'Desc'", "'Start'", "'Location'", "'Connections'", "'Player'", "'Inventory'", "'Attr'", "'='", "'Item'", "'NPC'", "'Action'", "'command'", "'effect'", "'PreCon'", "'WinCon'", "'Rewards'", "'EndDesc'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalMyDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStory"
    // InternalMyDsl.g:78:1: entryRuleStory : ruleStory EOF ;
    public final void entryRuleStory() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleStory EOF )
            // InternalMyDsl.g:80:1: ruleStory EOF
            {
             before(grammarAccess.getStoryRule()); 
            pushFollow(FOLLOW_1);
            ruleStory();

            state._fsp--;

             after(grammarAccess.getStoryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStory"


    // $ANTLR start "ruleStory"
    // InternalMyDsl.g:87:1: ruleStory : ( ( rule__Story__Group__0 ) ) ;
    public final void ruleStory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Story__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Story__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Story__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Story__Group__0 )
            {
             before(grammarAccess.getStoryAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Story__Group__0 )
            // InternalMyDsl.g:94:4: rule__Story__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Story__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStory"


    // $ANTLR start "entryRuleLocation"
    // InternalMyDsl.g:103:1: entryRuleLocation : ruleLocation EOF ;
    public final void entryRuleLocation() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleLocation EOF )
            // InternalMyDsl.g:105:1: ruleLocation EOF
            {
             before(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getLocationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalMyDsl.g:112:1: ruleLocation : ( ( rule__Location__Group__0 ) ) ;
    public final void ruleLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Location__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Location__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Location__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Location__Group__0 )
            {
             before(grammarAccess.getLocationAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Location__Group__0 )
            // InternalMyDsl.g:119:4: rule__Location__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Location__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRulePlayer"
    // InternalMyDsl.g:128:1: entryRulePlayer : rulePlayer EOF ;
    public final void entryRulePlayer() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( rulePlayer EOF )
            // InternalMyDsl.g:130:1: rulePlayer EOF
            {
             before(grammarAccess.getPlayerRule()); 
            pushFollow(FOLLOW_1);
            rulePlayer();

            state._fsp--;

             after(grammarAccess.getPlayerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePlayer"


    // $ANTLR start "rulePlayer"
    // InternalMyDsl.g:137:1: rulePlayer : ( ( rule__Player__Group__0 ) ) ;
    public final void rulePlayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Player__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Player__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Player__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Player__Group__0 )
            {
             before(grammarAccess.getPlayerAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Player__Group__0 )
            // InternalMyDsl.g:144:4: rule__Player__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlayer"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:153:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleAttribute EOF )
            // InternalMyDsl.g:155:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:162:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Attribute__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Attribute__Group__0 )
            // InternalMyDsl.g:169:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleItem"
    // InternalMyDsl.g:178:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleItem EOF )
            // InternalMyDsl.g:180:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalMyDsl.g:187:1: ruleItem : ( ( rule__Item__Group__0 ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Item__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Item__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Item__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Item__Group__0 )
            {
             before(grammarAccess.getItemAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Item__Group__0 )
            // InternalMyDsl.g:194:4: rule__Item__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Item__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleNPC"
    // InternalMyDsl.g:203:1: entryRuleNPC : ruleNPC EOF ;
    public final void entryRuleNPC() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleNPC EOF )
            // InternalMyDsl.g:205:1: ruleNPC EOF
            {
             before(grammarAccess.getNPCRule()); 
            pushFollow(FOLLOW_1);
            ruleNPC();

            state._fsp--;

             after(grammarAccess.getNPCRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNPC"


    // $ANTLR start "ruleNPC"
    // InternalMyDsl.g:212:1: ruleNPC : ( ( rule__NPC__Group__0 ) ) ;
    public final void ruleNPC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__NPC__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__NPC__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__NPC__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__NPC__Group__0 )
            {
             before(grammarAccess.getNPCAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__NPC__Group__0 )
            // InternalMyDsl.g:219:4: rule__NPC__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NPC__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNPCAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNPC"


    // $ANTLR start "entryRuleAction"
    // InternalMyDsl.g:228:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleAction EOF )
            // InternalMyDsl.g:230:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMyDsl.g:237:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Action__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Action__Group__0 )
            // InternalMyDsl.g:244:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleQuest"
    // InternalMyDsl.g:253:1: entryRuleQuest : ruleQuest EOF ;
    public final void entryRuleQuest() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleQuest EOF )
            // InternalMyDsl.g:255:1: ruleQuest EOF
            {
             before(grammarAccess.getQuestRule()); 
            pushFollow(FOLLOW_1);
            ruleQuest();

            state._fsp--;

             after(grammarAccess.getQuestRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuest"


    // $ANTLR start "ruleQuest"
    // InternalMyDsl.g:262:1: ruleQuest : ( ( rule__Quest__Group__0 ) ) ;
    public final void ruleQuest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Quest__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Quest__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Quest__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Quest__Group__0 )
            {
             before(grammarAccess.getQuestAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Quest__Group__0 )
            // InternalMyDsl.g:269:4: rule__Quest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Quest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuest"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDsl.g:277:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:281:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:282:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMyDsl.g:289:1: rule__Model__Group__0__Impl : ( ( rule__Model__StoryAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:293:1: ( ( ( rule__Model__StoryAssignment_0 ) ) )
            // InternalMyDsl.g:294:1: ( ( rule__Model__StoryAssignment_0 ) )
            {
            // InternalMyDsl.g:294:1: ( ( rule__Model__StoryAssignment_0 ) )
            // InternalMyDsl.g:295:2: ( rule__Model__StoryAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getStoryAssignment_0()); 
            // InternalMyDsl.g:296:2: ( rule__Model__StoryAssignment_0 )
            // InternalMyDsl.g:296:3: rule__Model__StoryAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__StoryAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getStoryAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMyDsl.g:304:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:308:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMyDsl.g:309:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMyDsl.g:316:1: rule__Model__Group__1__Impl : ( ( rule__Model__PlayerAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:320:1: ( ( ( rule__Model__PlayerAssignment_1 ) ) )
            // InternalMyDsl.g:321:1: ( ( rule__Model__PlayerAssignment_1 ) )
            {
            // InternalMyDsl.g:321:1: ( ( rule__Model__PlayerAssignment_1 ) )
            // InternalMyDsl.g:322:2: ( rule__Model__PlayerAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getPlayerAssignment_1()); 
            // InternalMyDsl.g:323:2: ( rule__Model__PlayerAssignment_1 )
            // InternalMyDsl.g:323:3: rule__Model__PlayerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__PlayerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPlayerAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalMyDsl.g:331:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:335:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalMyDsl.g:336:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalMyDsl.g:343:1: rule__Model__Group__2__Impl : ( 'Locations' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:347:1: ( ( 'Locations' ) )
            // InternalMyDsl.g:348:1: ( 'Locations' )
            {
            // InternalMyDsl.g:348:1: ( 'Locations' )
            // InternalMyDsl.g:349:2: 'Locations'
            {
             before(grammarAccess.getModelAccess().getLocationsKeyword_2()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLocationsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalMyDsl.g:358:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:362:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalMyDsl.g:363:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalMyDsl.g:370:1: rule__Model__Group__3__Impl : ( ( ( rule__Model__LocationsAssignment_3 ) ) ( ( rule__Model__LocationsAssignment_3 )* ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:374:1: ( ( ( ( rule__Model__LocationsAssignment_3 ) ) ( ( rule__Model__LocationsAssignment_3 )* ) ) )
            // InternalMyDsl.g:375:1: ( ( ( rule__Model__LocationsAssignment_3 ) ) ( ( rule__Model__LocationsAssignment_3 )* ) )
            {
            // InternalMyDsl.g:375:1: ( ( ( rule__Model__LocationsAssignment_3 ) ) ( ( rule__Model__LocationsAssignment_3 )* ) )
            // InternalMyDsl.g:376:2: ( ( rule__Model__LocationsAssignment_3 ) ) ( ( rule__Model__LocationsAssignment_3 )* )
            {
            // InternalMyDsl.g:376:2: ( ( rule__Model__LocationsAssignment_3 ) )
            // InternalMyDsl.g:377:3: ( rule__Model__LocationsAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getLocationsAssignment_3()); 
            // InternalMyDsl.g:378:3: ( rule__Model__LocationsAssignment_3 )
            // InternalMyDsl.g:378:4: rule__Model__LocationsAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__Model__LocationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getLocationsAssignment_3()); 

            }

            // InternalMyDsl.g:381:2: ( ( rule__Model__LocationsAssignment_3 )* )
            // InternalMyDsl.g:382:3: ( rule__Model__LocationsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getLocationsAssignment_3()); 
            // InternalMyDsl.g:383:3: ( rule__Model__LocationsAssignment_3 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:383:4: rule__Model__LocationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__LocationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getLocationsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalMyDsl.g:392:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:396:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalMyDsl.g:397:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalMyDsl.g:404:1: rule__Model__Group__4__Impl : ( 'NPCs' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:408:1: ( ( 'NPCs' ) )
            // InternalMyDsl.g:409:1: ( 'NPCs' )
            {
            // InternalMyDsl.g:409:1: ( 'NPCs' )
            // InternalMyDsl.g:410:2: 'NPCs'
            {
             before(grammarAccess.getModelAccess().getNPCsKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNPCsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalMyDsl.g:419:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:423:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalMyDsl.g:424:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalMyDsl.g:431:1: rule__Model__Group__5__Impl : ( ( rule__Model__NpcAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:435:1: ( ( ( rule__Model__NpcAssignment_5 )* ) )
            // InternalMyDsl.g:436:1: ( ( rule__Model__NpcAssignment_5 )* )
            {
            // InternalMyDsl.g:436:1: ( ( rule__Model__NpcAssignment_5 )* )
            // InternalMyDsl.g:437:2: ( rule__Model__NpcAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getNpcAssignment_5()); 
            // InternalMyDsl.g:438:2: ( rule__Model__NpcAssignment_5 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==27) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:438:3: rule__Model__NpcAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Model__NpcAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getNpcAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // InternalMyDsl.g:446:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:450:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalMyDsl.g:451:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // InternalMyDsl.g:458:1: rule__Model__Group__6__Impl : ( 'Items' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:462:1: ( ( 'Items' ) )
            // InternalMyDsl.g:463:1: ( 'Items' )
            {
            // InternalMyDsl.g:463:1: ( 'Items' )
            // InternalMyDsl.g:464:2: 'Items'
            {
             before(grammarAccess.getModelAccess().getItemsKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getItemsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // InternalMyDsl.g:473:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:477:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalMyDsl.g:478:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // InternalMyDsl.g:485:1: rule__Model__Group__7__Impl : ( ( rule__Model__ItemAssignment_7 )* ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:489:1: ( ( ( rule__Model__ItemAssignment_7 )* ) )
            // InternalMyDsl.g:490:1: ( ( rule__Model__ItemAssignment_7 )* )
            {
            // InternalMyDsl.g:490:1: ( ( rule__Model__ItemAssignment_7 )* )
            // InternalMyDsl.g:491:2: ( rule__Model__ItemAssignment_7 )*
            {
             before(grammarAccess.getModelAccess().getItemAssignment_7()); 
            // InternalMyDsl.g:492:2: ( rule__Model__ItemAssignment_7 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:492:3: rule__Model__ItemAssignment_7
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Model__ItemAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getItemAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Model__Group__8"
    // InternalMyDsl.g:500:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:504:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // InternalMyDsl.g:505:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__Model__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8"


    // $ANTLR start "rule__Model__Group__8__Impl"
    // InternalMyDsl.g:512:1: rule__Model__Group__8__Impl : ( 'Actions' ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:1: ( ( 'Actions' ) )
            // InternalMyDsl.g:517:1: ( 'Actions' )
            {
            // InternalMyDsl.g:517:1: ( 'Actions' )
            // InternalMyDsl.g:518:2: 'Actions'
            {
             before(grammarAccess.getModelAccess().getActionsKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getActionsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8__Impl"


    // $ANTLR start "rule__Model__Group__9"
    // InternalMyDsl.g:527:1: rule__Model__Group__9 : rule__Model__Group__9__Impl rule__Model__Group__10 ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:531:1: ( rule__Model__Group__9__Impl rule__Model__Group__10 )
            // InternalMyDsl.g:532:2: rule__Model__Group__9__Impl rule__Model__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__Model__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__9"


    // $ANTLR start "rule__Model__Group__9__Impl"
    // InternalMyDsl.g:539:1: rule__Model__Group__9__Impl : ( ( rule__Model__ActionAssignment_9 )* ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:543:1: ( ( ( rule__Model__ActionAssignment_9 )* ) )
            // InternalMyDsl.g:544:1: ( ( rule__Model__ActionAssignment_9 )* )
            {
            // InternalMyDsl.g:544:1: ( ( rule__Model__ActionAssignment_9 )* )
            // InternalMyDsl.g:545:2: ( rule__Model__ActionAssignment_9 )*
            {
             before(grammarAccess.getModelAccess().getActionAssignment_9()); 
            // InternalMyDsl.g:546:2: ( rule__Model__ActionAssignment_9 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==28) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:546:3: rule__Model__ActionAssignment_9
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Model__ActionAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getActionAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__9__Impl"


    // $ANTLR start "rule__Model__Group__10"
    // InternalMyDsl.g:554:1: rule__Model__Group__10 : rule__Model__Group__10__Impl rule__Model__Group__11 ;
    public final void rule__Model__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:558:1: ( rule__Model__Group__10__Impl rule__Model__Group__11 )
            // InternalMyDsl.g:559:2: rule__Model__Group__10__Impl rule__Model__Group__11
            {
            pushFollow(FOLLOW_14);
            rule__Model__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__10"


    // $ANTLR start "rule__Model__Group__10__Impl"
    // InternalMyDsl.g:566:1: rule__Model__Group__10__Impl : ( 'Quests' ) ;
    public final void rule__Model__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:570:1: ( ( 'Quests' ) )
            // InternalMyDsl.g:571:1: ( 'Quests' )
            {
            // InternalMyDsl.g:571:1: ( 'Quests' )
            // InternalMyDsl.g:572:2: 'Quests'
            {
             before(grammarAccess.getModelAccess().getQuestsKeyword_10()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getQuestsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__10__Impl"


    // $ANTLR start "rule__Model__Group__11"
    // InternalMyDsl.g:581:1: rule__Model__Group__11 : rule__Model__Group__11__Impl ;
    public final void rule__Model__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:585:1: ( rule__Model__Group__11__Impl )
            // InternalMyDsl.g:586:2: rule__Model__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__11"


    // $ANTLR start "rule__Model__Group__11__Impl"
    // InternalMyDsl.g:592:1: rule__Model__Group__11__Impl : ( ( rule__Model__QuestAssignment_11 )* ) ;
    public final void rule__Model__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:596:1: ( ( ( rule__Model__QuestAssignment_11 )* ) )
            // InternalMyDsl.g:597:1: ( ( rule__Model__QuestAssignment_11 )* )
            {
            // InternalMyDsl.g:597:1: ( ( rule__Model__QuestAssignment_11 )* )
            // InternalMyDsl.g:598:2: ( rule__Model__QuestAssignment_11 )*
            {
             before(grammarAccess.getModelAccess().getQuestAssignment_11()); 
            // InternalMyDsl.g:599:2: ( rule__Model__QuestAssignment_11 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:599:3: rule__Model__QuestAssignment_11
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Model__QuestAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getQuestAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__11__Impl"


    // $ANTLR start "rule__Story__Group__0"
    // InternalMyDsl.g:608:1: rule__Story__Group__0 : rule__Story__Group__0__Impl rule__Story__Group__1 ;
    public final void rule__Story__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:612:1: ( rule__Story__Group__0__Impl rule__Story__Group__1 )
            // InternalMyDsl.g:613:2: rule__Story__Group__0__Impl rule__Story__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Story__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__0"


    // $ANTLR start "rule__Story__Group__0__Impl"
    // InternalMyDsl.g:620:1: rule__Story__Group__0__Impl : ( 'Story' ) ;
    public final void rule__Story__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:624:1: ( ( 'Story' ) )
            // InternalMyDsl.g:625:1: ( 'Story' )
            {
            // InternalMyDsl.g:625:1: ( 'Story' )
            // InternalMyDsl.g:626:2: 'Story'
            {
             before(grammarAccess.getStoryAccess().getStoryKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getStoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__0__Impl"


    // $ANTLR start "rule__Story__Group__1"
    // InternalMyDsl.g:635:1: rule__Story__Group__1 : rule__Story__Group__1__Impl rule__Story__Group__2 ;
    public final void rule__Story__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:639:1: ( rule__Story__Group__1__Impl rule__Story__Group__2 )
            // InternalMyDsl.g:640:2: rule__Story__Group__1__Impl rule__Story__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Story__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__1"


    // $ANTLR start "rule__Story__Group__1__Impl"
    // InternalMyDsl.g:647:1: rule__Story__Group__1__Impl : ( ':' ) ;
    public final void rule__Story__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:651:1: ( ( ':' ) )
            // InternalMyDsl.g:652:1: ( ':' )
            {
            // InternalMyDsl.g:652:1: ( ':' )
            // InternalMyDsl.g:653:2: ':'
            {
             before(grammarAccess.getStoryAccess().getColonKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__1__Impl"


    // $ANTLR start "rule__Story__Group__2"
    // InternalMyDsl.g:662:1: rule__Story__Group__2 : rule__Story__Group__2__Impl rule__Story__Group__3 ;
    public final void rule__Story__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:1: ( rule__Story__Group__2__Impl rule__Story__Group__3 )
            // InternalMyDsl.g:667:2: rule__Story__Group__2__Impl rule__Story__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Story__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__2"


    // $ANTLR start "rule__Story__Group__2__Impl"
    // InternalMyDsl.g:674:1: rule__Story__Group__2__Impl : ( ( rule__Story__NameAssignment_2 ) ) ;
    public final void rule__Story__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:678:1: ( ( ( rule__Story__NameAssignment_2 ) ) )
            // InternalMyDsl.g:679:1: ( ( rule__Story__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:679:1: ( ( rule__Story__NameAssignment_2 ) )
            // InternalMyDsl.g:680:2: ( rule__Story__NameAssignment_2 )
            {
             before(grammarAccess.getStoryAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:681:2: ( rule__Story__NameAssignment_2 )
            // InternalMyDsl.g:681:3: rule__Story__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Story__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__2__Impl"


    // $ANTLR start "rule__Story__Group__3"
    // InternalMyDsl.g:689:1: rule__Story__Group__3 : rule__Story__Group__3__Impl rule__Story__Group__4 ;
    public final void rule__Story__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:693:1: ( rule__Story__Group__3__Impl rule__Story__Group__4 )
            // InternalMyDsl.g:694:2: rule__Story__Group__3__Impl rule__Story__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Story__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__3"


    // $ANTLR start "rule__Story__Group__3__Impl"
    // InternalMyDsl.g:701:1: rule__Story__Group__3__Impl : ( 'Desc' ) ;
    public final void rule__Story__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:705:1: ( ( 'Desc' ) )
            // InternalMyDsl.g:706:1: ( 'Desc' )
            {
            // InternalMyDsl.g:706:1: ( 'Desc' )
            // InternalMyDsl.g:707:2: 'Desc'
            {
             before(grammarAccess.getStoryAccess().getDescKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getDescKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__3__Impl"


    // $ANTLR start "rule__Story__Group__4"
    // InternalMyDsl.g:716:1: rule__Story__Group__4 : rule__Story__Group__4__Impl rule__Story__Group__5 ;
    public final void rule__Story__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:720:1: ( rule__Story__Group__4__Impl rule__Story__Group__5 )
            // InternalMyDsl.g:721:2: rule__Story__Group__4__Impl rule__Story__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Story__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__4"


    // $ANTLR start "rule__Story__Group__4__Impl"
    // InternalMyDsl.g:728:1: rule__Story__Group__4__Impl : ( ':' ) ;
    public final void rule__Story__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:732:1: ( ( ':' ) )
            // InternalMyDsl.g:733:1: ( ':' )
            {
            // InternalMyDsl.g:733:1: ( ':' )
            // InternalMyDsl.g:734:2: ':'
            {
             before(grammarAccess.getStoryAccess().getColonKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__4__Impl"


    // $ANTLR start "rule__Story__Group__5"
    // InternalMyDsl.g:743:1: rule__Story__Group__5 : rule__Story__Group__5__Impl rule__Story__Group__6 ;
    public final void rule__Story__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:747:1: ( rule__Story__Group__5__Impl rule__Story__Group__6 )
            // InternalMyDsl.g:748:2: rule__Story__Group__5__Impl rule__Story__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Story__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__5"


    // $ANTLR start "rule__Story__Group__5__Impl"
    // InternalMyDsl.g:755:1: rule__Story__Group__5__Impl : ( RULE_STRING ) ;
    public final void rule__Story__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:759:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:760:1: ( RULE_STRING )
            {
            // InternalMyDsl.g:760:1: ( RULE_STRING )
            // InternalMyDsl.g:761:2: RULE_STRING
            {
             before(grammarAccess.getStoryAccess().getSTRINGTerminalRuleCall_5()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getSTRINGTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__5__Impl"


    // $ANTLR start "rule__Story__Group__6"
    // InternalMyDsl.g:770:1: rule__Story__Group__6 : rule__Story__Group__6__Impl rule__Story__Group__7 ;
    public final void rule__Story__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:774:1: ( rule__Story__Group__6__Impl rule__Story__Group__7 )
            // InternalMyDsl.g:775:2: rule__Story__Group__6__Impl rule__Story__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Story__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__6"


    // $ANTLR start "rule__Story__Group__6__Impl"
    // InternalMyDsl.g:782:1: rule__Story__Group__6__Impl : ( 'Start' ) ;
    public final void rule__Story__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:786:1: ( ( 'Start' ) )
            // InternalMyDsl.g:787:1: ( 'Start' )
            {
            // InternalMyDsl.g:787:1: ( 'Start' )
            // InternalMyDsl.g:788:2: 'Start'
            {
             before(grammarAccess.getStoryAccess().getStartKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getStartKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__6__Impl"


    // $ANTLR start "rule__Story__Group__7"
    // InternalMyDsl.g:797:1: rule__Story__Group__7 : rule__Story__Group__7__Impl rule__Story__Group__8 ;
    public final void rule__Story__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:801:1: ( rule__Story__Group__7__Impl rule__Story__Group__8 )
            // InternalMyDsl.g:802:2: rule__Story__Group__7__Impl rule__Story__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__Story__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__7"


    // $ANTLR start "rule__Story__Group__7__Impl"
    // InternalMyDsl.g:809:1: rule__Story__Group__7__Impl : ( ':' ) ;
    public final void rule__Story__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:813:1: ( ( ':' ) )
            // InternalMyDsl.g:814:1: ( ':' )
            {
            // InternalMyDsl.g:814:1: ( ':' )
            // InternalMyDsl.g:815:2: ':'
            {
             before(grammarAccess.getStoryAccess().getColonKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__7__Impl"


    // $ANTLR start "rule__Story__Group__8"
    // InternalMyDsl.g:824:1: rule__Story__Group__8 : rule__Story__Group__8__Impl ;
    public final void rule__Story__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:828:1: ( rule__Story__Group__8__Impl )
            // InternalMyDsl.g:829:2: rule__Story__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Story__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__8"


    // $ANTLR start "rule__Story__Group__8__Impl"
    // InternalMyDsl.g:835:1: rule__Story__Group__8__Impl : ( ( rule__Story__StartLocationAssignment_8 ) ) ;
    public final void rule__Story__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:839:1: ( ( ( rule__Story__StartLocationAssignment_8 ) ) )
            // InternalMyDsl.g:840:1: ( ( rule__Story__StartLocationAssignment_8 ) )
            {
            // InternalMyDsl.g:840:1: ( ( rule__Story__StartLocationAssignment_8 ) )
            // InternalMyDsl.g:841:2: ( rule__Story__StartLocationAssignment_8 )
            {
             before(grammarAccess.getStoryAccess().getStartLocationAssignment_8()); 
            // InternalMyDsl.g:842:2: ( rule__Story__StartLocationAssignment_8 )
            // InternalMyDsl.g:842:3: rule__Story__StartLocationAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Story__StartLocationAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getStartLocationAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__8__Impl"


    // $ANTLR start "rule__Location__Group__0"
    // InternalMyDsl.g:851:1: rule__Location__Group__0 : rule__Location__Group__0__Impl rule__Location__Group__1 ;
    public final void rule__Location__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:855:1: ( rule__Location__Group__0__Impl rule__Location__Group__1 )
            // InternalMyDsl.g:856:2: rule__Location__Group__0__Impl rule__Location__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Location__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__0"


    // $ANTLR start "rule__Location__Group__0__Impl"
    // InternalMyDsl.g:863:1: rule__Location__Group__0__Impl : ( 'Location' ) ;
    public final void rule__Location__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:867:1: ( ( 'Location' ) )
            // InternalMyDsl.g:868:1: ( 'Location' )
            {
            // InternalMyDsl.g:868:1: ( 'Location' )
            // InternalMyDsl.g:869:2: 'Location'
            {
             before(grammarAccess.getLocationAccess().getLocationKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getLocationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__0__Impl"


    // $ANTLR start "rule__Location__Group__1"
    // InternalMyDsl.g:878:1: rule__Location__Group__1 : rule__Location__Group__1__Impl rule__Location__Group__2 ;
    public final void rule__Location__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:882:1: ( rule__Location__Group__1__Impl rule__Location__Group__2 )
            // InternalMyDsl.g:883:2: rule__Location__Group__1__Impl rule__Location__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Location__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__1"


    // $ANTLR start "rule__Location__Group__1__Impl"
    // InternalMyDsl.g:890:1: rule__Location__Group__1__Impl : ( ( rule__Location__NameAssignment_1 ) ) ;
    public final void rule__Location__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:894:1: ( ( ( rule__Location__NameAssignment_1 ) ) )
            // InternalMyDsl.g:895:1: ( ( rule__Location__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:895:1: ( ( rule__Location__NameAssignment_1 ) )
            // InternalMyDsl.g:896:2: ( rule__Location__NameAssignment_1 )
            {
             before(grammarAccess.getLocationAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:897:2: ( rule__Location__NameAssignment_1 )
            // InternalMyDsl.g:897:3: rule__Location__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Location__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__1__Impl"


    // $ANTLR start "rule__Location__Group__2"
    // InternalMyDsl.g:905:1: rule__Location__Group__2 : rule__Location__Group__2__Impl rule__Location__Group__3 ;
    public final void rule__Location__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:909:1: ( rule__Location__Group__2__Impl rule__Location__Group__3 )
            // InternalMyDsl.g:910:2: rule__Location__Group__2__Impl rule__Location__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Location__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__2"


    // $ANTLR start "rule__Location__Group__2__Impl"
    // InternalMyDsl.g:917:1: rule__Location__Group__2__Impl : ( 'NPCs' ) ;
    public final void rule__Location__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:921:1: ( ( 'NPCs' ) )
            // InternalMyDsl.g:922:1: ( 'NPCs' )
            {
            // InternalMyDsl.g:922:1: ( 'NPCs' )
            // InternalMyDsl.g:923:2: 'NPCs'
            {
             before(grammarAccess.getLocationAccess().getNPCsKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getNPCsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__2__Impl"


    // $ANTLR start "rule__Location__Group__3"
    // InternalMyDsl.g:932:1: rule__Location__Group__3 : rule__Location__Group__3__Impl rule__Location__Group__4 ;
    public final void rule__Location__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:936:1: ( rule__Location__Group__3__Impl rule__Location__Group__4 )
            // InternalMyDsl.g:937:2: rule__Location__Group__3__Impl rule__Location__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Location__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__3"


    // $ANTLR start "rule__Location__Group__3__Impl"
    // InternalMyDsl.g:944:1: rule__Location__Group__3__Impl : ( ( rule__Location__NPCsAssignment_3 )* ) ;
    public final void rule__Location__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:948:1: ( ( ( rule__Location__NPCsAssignment_3 )* ) )
            // InternalMyDsl.g:949:1: ( ( rule__Location__NPCsAssignment_3 )* )
            {
            // InternalMyDsl.g:949:1: ( ( rule__Location__NPCsAssignment_3 )* )
            // InternalMyDsl.g:950:2: ( rule__Location__NPCsAssignment_3 )*
            {
             before(grammarAccess.getLocationAccess().getNPCsAssignment_3()); 
            // InternalMyDsl.g:951:2: ( rule__Location__NPCsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:951:3: rule__Location__NPCsAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Location__NPCsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getLocationAccess().getNPCsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__3__Impl"


    // $ANTLR start "rule__Location__Group__4"
    // InternalMyDsl.g:959:1: rule__Location__Group__4 : rule__Location__Group__4__Impl rule__Location__Group__5 ;
    public final void rule__Location__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:963:1: ( rule__Location__Group__4__Impl rule__Location__Group__5 )
            // InternalMyDsl.g:964:2: rule__Location__Group__4__Impl rule__Location__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Location__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__4"


    // $ANTLR start "rule__Location__Group__4__Impl"
    // InternalMyDsl.g:971:1: rule__Location__Group__4__Impl : ( 'Items' ) ;
    public final void rule__Location__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:975:1: ( ( 'Items' ) )
            // InternalMyDsl.g:976:1: ( 'Items' )
            {
            // InternalMyDsl.g:976:1: ( 'Items' )
            // InternalMyDsl.g:977:2: 'Items'
            {
             before(grammarAccess.getLocationAccess().getItemsKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getItemsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__4__Impl"


    // $ANTLR start "rule__Location__Group__5"
    // InternalMyDsl.g:986:1: rule__Location__Group__5 : rule__Location__Group__5__Impl rule__Location__Group__6 ;
    public final void rule__Location__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:990:1: ( rule__Location__Group__5__Impl rule__Location__Group__6 )
            // InternalMyDsl.g:991:2: rule__Location__Group__5__Impl rule__Location__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Location__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__5"


    // $ANTLR start "rule__Location__Group__5__Impl"
    // InternalMyDsl.g:998:1: rule__Location__Group__5__Impl : ( ( rule__Location__ItemsAssignment_5 )* ) ;
    public final void rule__Location__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1002:1: ( ( ( rule__Location__ItemsAssignment_5 )* ) )
            // InternalMyDsl.g:1003:1: ( ( rule__Location__ItemsAssignment_5 )* )
            {
            // InternalMyDsl.g:1003:1: ( ( rule__Location__ItemsAssignment_5 )* )
            // InternalMyDsl.g:1004:2: ( rule__Location__ItemsAssignment_5 )*
            {
             before(grammarAccess.getLocationAccess().getItemsAssignment_5()); 
            // InternalMyDsl.g:1005:2: ( rule__Location__ItemsAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1005:3: rule__Location__ItemsAssignment_5
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Location__ItemsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getLocationAccess().getItemsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__5__Impl"


    // $ANTLR start "rule__Location__Group__6"
    // InternalMyDsl.g:1013:1: rule__Location__Group__6 : rule__Location__Group__6__Impl rule__Location__Group__7 ;
    public final void rule__Location__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1017:1: ( rule__Location__Group__6__Impl rule__Location__Group__7 )
            // InternalMyDsl.g:1018:2: rule__Location__Group__6__Impl rule__Location__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Location__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__6"


    // $ANTLR start "rule__Location__Group__6__Impl"
    // InternalMyDsl.g:1025:1: rule__Location__Group__6__Impl : ( 'Connections' ) ;
    public final void rule__Location__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1029:1: ( ( 'Connections' ) )
            // InternalMyDsl.g:1030:1: ( 'Connections' )
            {
            // InternalMyDsl.g:1030:1: ( 'Connections' )
            // InternalMyDsl.g:1031:2: 'Connections'
            {
             before(grammarAccess.getLocationAccess().getConnectionsKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getConnectionsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__6__Impl"


    // $ANTLR start "rule__Location__Group__7"
    // InternalMyDsl.g:1040:1: rule__Location__Group__7 : rule__Location__Group__7__Impl ;
    public final void rule__Location__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1044:1: ( rule__Location__Group__7__Impl )
            // InternalMyDsl.g:1045:2: rule__Location__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Location__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__7"


    // $ANTLR start "rule__Location__Group__7__Impl"
    // InternalMyDsl.g:1051:1: rule__Location__Group__7__Impl : ( ( rule__Location__ConnectionsAssignment_7 )* ) ;
    public final void rule__Location__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1055:1: ( ( ( rule__Location__ConnectionsAssignment_7 )* ) )
            // InternalMyDsl.g:1056:1: ( ( rule__Location__ConnectionsAssignment_7 )* )
            {
            // InternalMyDsl.g:1056:1: ( ( rule__Location__ConnectionsAssignment_7 )* )
            // InternalMyDsl.g:1057:2: ( rule__Location__ConnectionsAssignment_7 )*
            {
             before(grammarAccess.getLocationAccess().getConnectionsAssignment_7()); 
            // InternalMyDsl.g:1058:2: ( rule__Location__ConnectionsAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1058:3: rule__Location__ConnectionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Location__ConnectionsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getLocationAccess().getConnectionsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__7__Impl"


    // $ANTLR start "rule__Player__Group__0"
    // InternalMyDsl.g:1067:1: rule__Player__Group__0 : rule__Player__Group__0__Impl rule__Player__Group__1 ;
    public final void rule__Player__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1071:1: ( rule__Player__Group__0__Impl rule__Player__Group__1 )
            // InternalMyDsl.g:1072:2: rule__Player__Group__0__Impl rule__Player__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Player__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__0"


    // $ANTLR start "rule__Player__Group__0__Impl"
    // InternalMyDsl.g:1079:1: rule__Player__Group__0__Impl : ( 'Player' ) ;
    public final void rule__Player__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1083:1: ( ( 'Player' ) )
            // InternalMyDsl.g:1084:1: ( 'Player' )
            {
            // InternalMyDsl.g:1084:1: ( 'Player' )
            // InternalMyDsl.g:1085:2: 'Player'
            {
             before(grammarAccess.getPlayerAccess().getPlayerKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getPlayerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__0__Impl"


    // $ANTLR start "rule__Player__Group__1"
    // InternalMyDsl.g:1094:1: rule__Player__Group__1 : rule__Player__Group__1__Impl rule__Player__Group__2 ;
    public final void rule__Player__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1098:1: ( rule__Player__Group__1__Impl rule__Player__Group__2 )
            // InternalMyDsl.g:1099:2: rule__Player__Group__1__Impl rule__Player__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Player__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__1"


    // $ANTLR start "rule__Player__Group__1__Impl"
    // InternalMyDsl.g:1106:1: rule__Player__Group__1__Impl : ( ( rule__Player__NameAssignment_1 ) ) ;
    public final void rule__Player__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1110:1: ( ( ( rule__Player__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1111:1: ( ( rule__Player__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1111:1: ( ( rule__Player__NameAssignment_1 ) )
            // InternalMyDsl.g:1112:2: ( rule__Player__NameAssignment_1 )
            {
             before(grammarAccess.getPlayerAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1113:2: ( rule__Player__NameAssignment_1 )
            // InternalMyDsl.g:1113:3: rule__Player__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Player__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__1__Impl"


    // $ANTLR start "rule__Player__Group__2"
    // InternalMyDsl.g:1121:1: rule__Player__Group__2 : rule__Player__Group__2__Impl rule__Player__Group__3 ;
    public final void rule__Player__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1125:1: ( rule__Player__Group__2__Impl rule__Player__Group__3 )
            // InternalMyDsl.g:1126:2: rule__Player__Group__2__Impl rule__Player__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Player__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__2"


    // $ANTLR start "rule__Player__Group__2__Impl"
    // InternalMyDsl.g:1133:1: rule__Player__Group__2__Impl : ( 'Actions' ) ;
    public final void rule__Player__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1137:1: ( ( 'Actions' ) )
            // InternalMyDsl.g:1138:1: ( 'Actions' )
            {
            // InternalMyDsl.g:1138:1: ( 'Actions' )
            // InternalMyDsl.g:1139:2: 'Actions'
            {
             before(grammarAccess.getPlayerAccess().getActionsKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getActionsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__2__Impl"


    // $ANTLR start "rule__Player__Group__3"
    // InternalMyDsl.g:1148:1: rule__Player__Group__3 : rule__Player__Group__3__Impl rule__Player__Group__4 ;
    public final void rule__Player__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1152:1: ( rule__Player__Group__3__Impl rule__Player__Group__4 )
            // InternalMyDsl.g:1153:2: rule__Player__Group__3__Impl rule__Player__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Player__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__3"


    // $ANTLR start "rule__Player__Group__3__Impl"
    // InternalMyDsl.g:1160:1: rule__Player__Group__3__Impl : ( ( rule__Player__ActionsAssignment_3 )* ) ;
    public final void rule__Player__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1164:1: ( ( ( rule__Player__ActionsAssignment_3 )* ) )
            // InternalMyDsl.g:1165:1: ( ( rule__Player__ActionsAssignment_3 )* )
            {
            // InternalMyDsl.g:1165:1: ( ( rule__Player__ActionsAssignment_3 )* )
            // InternalMyDsl.g:1166:2: ( rule__Player__ActionsAssignment_3 )*
            {
             before(grammarAccess.getPlayerAccess().getActionsAssignment_3()); 
            // InternalMyDsl.g:1167:2: ( rule__Player__ActionsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1167:3: rule__Player__ActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Player__ActionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPlayerAccess().getActionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__3__Impl"


    // $ANTLR start "rule__Player__Group__4"
    // InternalMyDsl.g:1175:1: rule__Player__Group__4 : rule__Player__Group__4__Impl rule__Player__Group__5 ;
    public final void rule__Player__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1179:1: ( rule__Player__Group__4__Impl rule__Player__Group__5 )
            // InternalMyDsl.g:1180:2: rule__Player__Group__4__Impl rule__Player__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Player__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__4"


    // $ANTLR start "rule__Player__Group__4__Impl"
    // InternalMyDsl.g:1187:1: rule__Player__Group__4__Impl : ( 'Inventory' ) ;
    public final void rule__Player__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1191:1: ( ( 'Inventory' ) )
            // InternalMyDsl.g:1192:1: ( 'Inventory' )
            {
            // InternalMyDsl.g:1192:1: ( 'Inventory' )
            // InternalMyDsl.g:1193:2: 'Inventory'
            {
             before(grammarAccess.getPlayerAccess().getInventoryKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getInventoryKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__4__Impl"


    // $ANTLR start "rule__Player__Group__5"
    // InternalMyDsl.g:1202:1: rule__Player__Group__5 : rule__Player__Group__5__Impl rule__Player__Group__6 ;
    public final void rule__Player__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1206:1: ( rule__Player__Group__5__Impl rule__Player__Group__6 )
            // InternalMyDsl.g:1207:2: rule__Player__Group__5__Impl rule__Player__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__Player__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__5"


    // $ANTLR start "rule__Player__Group__5__Impl"
    // InternalMyDsl.g:1214:1: rule__Player__Group__5__Impl : ( ( rule__Player__ItemsAssignment_5 )* ) ;
    public final void rule__Player__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1218:1: ( ( ( rule__Player__ItemsAssignment_5 )* ) )
            // InternalMyDsl.g:1219:1: ( ( rule__Player__ItemsAssignment_5 )* )
            {
            // InternalMyDsl.g:1219:1: ( ( rule__Player__ItemsAssignment_5 )* )
            // InternalMyDsl.g:1220:2: ( rule__Player__ItemsAssignment_5 )*
            {
             before(grammarAccess.getPlayerAccess().getItemsAssignment_5()); 
            // InternalMyDsl.g:1221:2: ( rule__Player__ItemsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1221:3: rule__Player__ItemsAssignment_5
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Player__ItemsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPlayerAccess().getItemsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__5__Impl"


    // $ANTLR start "rule__Player__Group__6"
    // InternalMyDsl.g:1229:1: rule__Player__Group__6 : rule__Player__Group__6__Impl rule__Player__Group__7 ;
    public final void rule__Player__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1233:1: ( rule__Player__Group__6__Impl rule__Player__Group__7 )
            // InternalMyDsl.g:1234:2: rule__Player__Group__6__Impl rule__Player__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Player__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__6"


    // $ANTLR start "rule__Player__Group__6__Impl"
    // InternalMyDsl.g:1241:1: rule__Player__Group__6__Impl : ( 'Attr' ) ;
    public final void rule__Player__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1245:1: ( ( 'Attr' ) )
            // InternalMyDsl.g:1246:1: ( 'Attr' )
            {
            // InternalMyDsl.g:1246:1: ( 'Attr' )
            // InternalMyDsl.g:1247:2: 'Attr'
            {
             before(grammarAccess.getPlayerAccess().getAttrKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getAttrKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__6__Impl"


    // $ANTLR start "rule__Player__Group__7"
    // InternalMyDsl.g:1256:1: rule__Player__Group__7 : rule__Player__Group__7__Impl ;
    public final void rule__Player__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1260:1: ( rule__Player__Group__7__Impl )
            // InternalMyDsl.g:1261:2: rule__Player__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__7"


    // $ANTLR start "rule__Player__Group__7__Impl"
    // InternalMyDsl.g:1267:1: rule__Player__Group__7__Impl : ( ( rule__Player__AttrAssignment_7 )* ) ;
    public final void rule__Player__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1271:1: ( ( ( rule__Player__AttrAssignment_7 )* ) )
            // InternalMyDsl.g:1272:1: ( ( rule__Player__AttrAssignment_7 )* )
            {
            // InternalMyDsl.g:1272:1: ( ( rule__Player__AttrAssignment_7 )* )
            // InternalMyDsl.g:1273:2: ( rule__Player__AttrAssignment_7 )*
            {
             before(grammarAccess.getPlayerAccess().getAttrAssignment_7()); 
            // InternalMyDsl.g:1274:2: ( rule__Player__AttrAssignment_7 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1274:3: rule__Player__AttrAssignment_7
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Player__AttrAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPlayerAccess().getAttrAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__7__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalMyDsl.g:1283:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1287:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyDsl.g:1288:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalMyDsl.g:1295:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1299:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1300:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1300:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalMyDsl.g:1301:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1302:2: ( rule__Attribute__NameAssignment_0 )
            // InternalMyDsl.g:1302:3: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalMyDsl.g:1310:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1314:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMyDsl.g:1315:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalMyDsl.g:1322:1: rule__Attribute__Group__1__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1326:1: ( ( '=' ) )
            // InternalMyDsl.g:1327:1: ( '=' )
            {
            // InternalMyDsl.g:1327:1: ( '=' )
            // InternalMyDsl.g:1328:2: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalMyDsl.g:1337:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1341:1: ( rule__Attribute__Group__2__Impl )
            // InternalMyDsl.g:1342:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalMyDsl.g:1348:1: rule__Attribute__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1352:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1353:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1353:1: ( RULE_INT )
            // InternalMyDsl.g:1354:2: RULE_INT
            {
             before(grammarAccess.getAttributeAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Item__Group__0"
    // InternalMyDsl.g:1364:1: rule__Item__Group__0 : rule__Item__Group__0__Impl rule__Item__Group__1 ;
    public final void rule__Item__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1368:1: ( rule__Item__Group__0__Impl rule__Item__Group__1 )
            // InternalMyDsl.g:1369:2: rule__Item__Group__0__Impl rule__Item__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Item__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__0"


    // $ANTLR start "rule__Item__Group__0__Impl"
    // InternalMyDsl.g:1376:1: rule__Item__Group__0__Impl : ( 'Item' ) ;
    public final void rule__Item__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1380:1: ( ( 'Item' ) )
            // InternalMyDsl.g:1381:1: ( 'Item' )
            {
            // InternalMyDsl.g:1381:1: ( 'Item' )
            // InternalMyDsl.g:1382:2: 'Item'
            {
             before(grammarAccess.getItemAccess().getItemKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getItemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__0__Impl"


    // $ANTLR start "rule__Item__Group__1"
    // InternalMyDsl.g:1391:1: rule__Item__Group__1 : rule__Item__Group__1__Impl rule__Item__Group__2 ;
    public final void rule__Item__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1395:1: ( rule__Item__Group__1__Impl rule__Item__Group__2 )
            // InternalMyDsl.g:1396:2: rule__Item__Group__1__Impl rule__Item__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Item__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__1"


    // $ANTLR start "rule__Item__Group__1__Impl"
    // InternalMyDsl.g:1403:1: rule__Item__Group__1__Impl : ( ( rule__Item__NameAssignment_1 ) ) ;
    public final void rule__Item__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1407:1: ( ( ( rule__Item__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1408:1: ( ( rule__Item__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1408:1: ( ( rule__Item__NameAssignment_1 ) )
            // InternalMyDsl.g:1409:2: ( rule__Item__NameAssignment_1 )
            {
             before(grammarAccess.getItemAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1410:2: ( rule__Item__NameAssignment_1 )
            // InternalMyDsl.g:1410:3: rule__Item__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Item__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__1__Impl"


    // $ANTLR start "rule__Item__Group__2"
    // InternalMyDsl.g:1418:1: rule__Item__Group__2 : rule__Item__Group__2__Impl rule__Item__Group__3 ;
    public final void rule__Item__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1422:1: ( rule__Item__Group__2__Impl rule__Item__Group__3 )
            // InternalMyDsl.g:1423:2: rule__Item__Group__2__Impl rule__Item__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Item__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__2"


    // $ANTLR start "rule__Item__Group__2__Impl"
    // InternalMyDsl.g:1430:1: rule__Item__Group__2__Impl : ( 'Desc' ) ;
    public final void rule__Item__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1434:1: ( ( 'Desc' ) )
            // InternalMyDsl.g:1435:1: ( 'Desc' )
            {
            // InternalMyDsl.g:1435:1: ( 'Desc' )
            // InternalMyDsl.g:1436:2: 'Desc'
            {
             before(grammarAccess.getItemAccess().getDescKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getDescKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__2__Impl"


    // $ANTLR start "rule__Item__Group__3"
    // InternalMyDsl.g:1445:1: rule__Item__Group__3 : rule__Item__Group__3__Impl rule__Item__Group__4 ;
    public final void rule__Item__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1449:1: ( rule__Item__Group__3__Impl rule__Item__Group__4 )
            // InternalMyDsl.g:1450:2: rule__Item__Group__3__Impl rule__Item__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Item__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__3"


    // $ANTLR start "rule__Item__Group__3__Impl"
    // InternalMyDsl.g:1457:1: rule__Item__Group__3__Impl : ( RULE_STRING ) ;
    public final void rule__Item__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1461:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1462:1: ( RULE_STRING )
            {
            // InternalMyDsl.g:1462:1: ( RULE_STRING )
            // InternalMyDsl.g:1463:2: RULE_STRING
            {
             before(grammarAccess.getItemAccess().getSTRINGTerminalRuleCall_3()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getSTRINGTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__3__Impl"


    // $ANTLR start "rule__Item__Group__4"
    // InternalMyDsl.g:1472:1: rule__Item__Group__4 : rule__Item__Group__4__Impl rule__Item__Group__5 ;
    public final void rule__Item__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1476:1: ( rule__Item__Group__4__Impl rule__Item__Group__5 )
            // InternalMyDsl.g:1477:2: rule__Item__Group__4__Impl rule__Item__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Item__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__4"


    // $ANTLR start "rule__Item__Group__4__Impl"
    // InternalMyDsl.g:1484:1: rule__Item__Group__4__Impl : ( 'Actions' ) ;
    public final void rule__Item__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1488:1: ( ( 'Actions' ) )
            // InternalMyDsl.g:1489:1: ( 'Actions' )
            {
            // InternalMyDsl.g:1489:1: ( 'Actions' )
            // InternalMyDsl.g:1490:2: 'Actions'
            {
             before(grammarAccess.getItemAccess().getActionsKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getActionsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__4__Impl"


    // $ANTLR start "rule__Item__Group__5"
    // InternalMyDsl.g:1499:1: rule__Item__Group__5 : rule__Item__Group__5__Impl ;
    public final void rule__Item__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1503:1: ( rule__Item__Group__5__Impl )
            // InternalMyDsl.g:1504:2: rule__Item__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Item__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__5"


    // $ANTLR start "rule__Item__Group__5__Impl"
    // InternalMyDsl.g:1510:1: rule__Item__Group__5__Impl : ( ( rule__Item__ActionsAssignment_5 )* ) ;
    public final void rule__Item__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1514:1: ( ( ( rule__Item__ActionsAssignment_5 )* ) )
            // InternalMyDsl.g:1515:1: ( ( rule__Item__ActionsAssignment_5 )* )
            {
            // InternalMyDsl.g:1515:1: ( ( rule__Item__ActionsAssignment_5 )* )
            // InternalMyDsl.g:1516:2: ( rule__Item__ActionsAssignment_5 )*
            {
             before(grammarAccess.getItemAccess().getActionsAssignment_5()); 
            // InternalMyDsl.g:1517:2: ( rule__Item__ActionsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1517:3: rule__Item__ActionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Item__ActionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getItemAccess().getActionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__5__Impl"


    // $ANTLR start "rule__NPC__Group__0"
    // InternalMyDsl.g:1526:1: rule__NPC__Group__0 : rule__NPC__Group__0__Impl rule__NPC__Group__1 ;
    public final void rule__NPC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1530:1: ( rule__NPC__Group__0__Impl rule__NPC__Group__1 )
            // InternalMyDsl.g:1531:2: rule__NPC__Group__0__Impl rule__NPC__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__NPC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NPC__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NPC__Group__0"


    // $ANTLR start "rule__NPC__Group__0__Impl"
    // InternalMyDsl.g:1538:1: rule__NPC__Group__0__Impl : ( 'NPC' ) ;
    public final void rule__NPC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1542:1: ( ( 'NPC' ) )
            // InternalMyDsl.g:1543:1: ( 'NPC' )
            {
            // InternalMyDsl.g:1543:1: ( 'NPC' )
            // InternalMyDsl.g:1544:2: 'NPC'
            {
             before(grammarAccess.getNPCAccess().getNPCKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNPCAccess().getNPCKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NPC__Group__0__Impl"


    // $ANTLR start "rule__NPC__Group__1"
    // InternalMyDsl.g:1553:1: rule__NPC__Group__1 : rule__NPC__Group__1__Impl rule__NPC__Group__2 ;
    public final void rule__NPC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1557:1: ( rule__NPC__Group__1__Impl rule__NPC__Group__2 )
            // InternalMyDsl.g:1558:2: rule__NPC__Group__1__Impl rule__NPC__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__NPC__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NPC__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NPC__Group__1"


    // $ANTLR start "rule__NPC__Group__1__Impl"
    // InternalMyDsl.g:1565:1: rule__NPC__Group__1__Impl : ( ( rule__NPC__NameAssignment_1 ) ) ;
    public final void rule__NPC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1569:1: ( ( ( rule__NPC__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1570:1: ( ( rule__NPC__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1570:1: ( ( rule__NPC__NameAssignment_1 ) )
            // InternalMyDsl.g:1571:2: ( rule__NPC__NameAssignment_1 )
            {
             before(grammarAccess.getNPCAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1572:2: ( rule__NPC__NameAssignment_1 )
            // InternalMyDsl.g:1572:3: rule__NPC__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NPC__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNPCAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NPC__Group__1__Impl"


    // $ANTLR start "rule__NPC__Group__2"
    // InternalMyDsl.g:1580:1: rule__NPC__Group__2 : rule__NPC__Group__2__Impl rule__NPC__Group__3 ;
    public final void rule__NPC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1584:1: ( rule__NPC__Group__2__Impl rule__NPC__Group__3 )
            // InternalMyDsl.g:1585:2: rule__NPC__Group__2__Impl rule__NPC__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__NPC__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NPC__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NPC__Group__2"


    // $ANTLR start "rule__NPC__Group__2__Impl"
    // InternalMyDsl.g:1592:1: rule__NPC__Group__2__Impl : ( 'Inventory' ) ;
    public final void rule__NPC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1596:1: ( ( 'Inventory' ) )
            // InternalMyDsl.g:1597:1: ( 'Inventory' )
            {
            // InternalMyDsl.g:1597:1: ( 'Inventory' )
            // InternalMyDsl.g:1598:2: 'Inventory'
            {
             before(grammarAccess.getNPCAccess().getInventoryKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNPCAccess().getInventoryKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NPC__Group__2__Impl"


    // $ANTLR start "rule__NPC__Group__3"
    // InternalMyDsl.g:1607:1: rule__NPC__Group__3 : rule__NPC__Group__3__Impl rule__NPC__Group__4 ;
    public final void rule__NPC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1611:1: ( rule__NPC__Group__3__Impl rule__NPC__Group__4 )
            // InternalMyDsl.g:1612:2: rule__NPC__Group__3__Impl rule__NPC__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__NPC__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NPC__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NPC__Group__3"


    // $ANTLR start "rule__NPC__Group__3__Impl"
    // InternalMyDsl.g:1619:1: rule__NPC__Group__3__Impl : ( ( rule__NPC__ItemsAssignment_3 )* ) ;
    public final void rule__NPC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1623:1: ( ( ( rule__NPC__ItemsAssignment_3 )* ) )
            // InternalMyDsl.g:1624:1: ( ( rule__NPC__ItemsAssignment_3 )* )
            {
            // InternalMyDsl.g:1624:1: ( ( rule__NPC__ItemsAssignment_3 )* )
            // InternalMyDsl.g:1625:2: ( rule__NPC__ItemsAssignment_3 )*
            {
             before(grammarAccess.getNPCAccess().getItemsAssignment_3()); 
            // InternalMyDsl.g:1626:2: ( rule__NPC__ItemsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1626:3: rule__NPC__ItemsAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__NPC__ItemsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getNPCAccess().getItemsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NPC__Group__3__Impl"


    // $ANTLR start "rule__NPC__Group__4"
    // InternalMyDsl.g:1634:1: rule__NPC__Group__4 : rule__NPC__Group__4__Impl rule__NPC__Group__5 ;
    public final void rule__NPC__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1638:1: ( rule__NPC__Group__4__Impl rule__NPC__Group__5 )
            // InternalMyDsl.g:1639:2: rule__NPC__Group__4__Impl rule__NPC__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__NPC__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NPC__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NPC__Group__4"


    // $ANTLR start "rule__NPC__Group__4__Impl"
    // InternalMyDsl.g:1646:1: rule__NPC__Group__4__Impl : ( 'Actions' ) ;
    public final void rule__NPC__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1650:1: ( ( 'Actions' ) )
            // InternalMyDsl.g:1651:1: ( 'Actions' )
            {
            // InternalMyDsl.g:1651:1: ( 'Actions' )
            // InternalMyDsl.g:1652:2: 'Actions'
            {
             before(grammarAccess.getNPCAccess().getActionsKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNPCAccess().getActionsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NPC__Group__4__Impl"


    // $ANTLR start "rule__NPC__Group__5"
    // InternalMyDsl.g:1661:1: rule__NPC__Group__5 : rule__NPC__Group__5__Impl ;
    public final void rule__NPC__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1665:1: ( rule__NPC__Group__5__Impl )
            // InternalMyDsl.g:1666:2: rule__NPC__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NPC__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NPC__Group__5"


    // $ANTLR start "rule__NPC__Group__5__Impl"
    // InternalMyDsl.g:1672:1: rule__NPC__Group__5__Impl : ( ( rule__NPC__ActionsAssignment_5 )* ) ;
    public final void rule__NPC__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1676:1: ( ( ( rule__NPC__ActionsAssignment_5 )* ) )
            // InternalMyDsl.g:1677:1: ( ( rule__NPC__ActionsAssignment_5 )* )
            {
            // InternalMyDsl.g:1677:1: ( ( rule__NPC__ActionsAssignment_5 )* )
            // InternalMyDsl.g:1678:2: ( rule__NPC__ActionsAssignment_5 )*
            {
             before(grammarAccess.getNPCAccess().getActionsAssignment_5()); 
            // InternalMyDsl.g:1679:2: ( rule__NPC__ActionsAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1679:3: rule__NPC__ActionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__NPC__ActionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getNPCAccess().getActionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NPC__Group__5__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalMyDsl.g:1688:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1692:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalMyDsl.g:1693:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalMyDsl.g:1700:1: rule__Action__Group__0__Impl : ( 'Action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1704:1: ( ( 'Action' ) )
            // InternalMyDsl.g:1705:1: ( 'Action' )
            {
            // InternalMyDsl.g:1705:1: ( 'Action' )
            // InternalMyDsl.g:1706:2: 'Action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalMyDsl.g:1715:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1719:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalMyDsl.g:1720:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalMyDsl.g:1727:1: rule__Action__Group__1__Impl : ( ( rule__Action__NameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1731:1: ( ( ( rule__Action__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1732:1: ( ( rule__Action__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1732:1: ( ( rule__Action__NameAssignment_1 ) )
            // InternalMyDsl.g:1733:2: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1734:2: ( rule__Action__NameAssignment_1 )
            // InternalMyDsl.g:1734:3: rule__Action__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalMyDsl.g:1742:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1746:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalMyDsl.g:1747:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalMyDsl.g:1754:1: rule__Action__Group__2__Impl : ( 'command' ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1758:1: ( ( 'command' ) )
            // InternalMyDsl.g:1759:1: ( 'command' )
            {
            // InternalMyDsl.g:1759:1: ( 'command' )
            // InternalMyDsl.g:1760:2: 'command'
            {
             before(grammarAccess.getActionAccess().getCommandKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getCommandKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // InternalMyDsl.g:1769:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1773:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // InternalMyDsl.g:1774:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Action__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // InternalMyDsl.g:1781:1: rule__Action__Group__3__Impl : ( ':' ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1785:1: ( ( ':' ) )
            // InternalMyDsl.g:1786:1: ( ':' )
            {
            // InternalMyDsl.g:1786:1: ( ':' )
            // InternalMyDsl.g:1787:2: ':'
            {
             before(grammarAccess.getActionAccess().getColonKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group__4"
    // InternalMyDsl.g:1796:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1800:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // InternalMyDsl.g:1801:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Action__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4"


    // $ANTLR start "rule__Action__Group__4__Impl"
    // InternalMyDsl.g:1808:1: rule__Action__Group__4__Impl : ( RULE_STRING ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1812:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1813:1: ( RULE_STRING )
            {
            // InternalMyDsl.g:1813:1: ( RULE_STRING )
            // InternalMyDsl.g:1814:2: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getSTRINGTerminalRuleCall_4()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getSTRINGTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__5"
    // InternalMyDsl.g:1823:1: rule__Action__Group__5 : rule__Action__Group__5__Impl rule__Action__Group__6 ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1827:1: ( rule__Action__Group__5__Impl rule__Action__Group__6 )
            // InternalMyDsl.g:1828:2: rule__Action__Group__5__Impl rule__Action__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Action__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5"


    // $ANTLR start "rule__Action__Group__5__Impl"
    // InternalMyDsl.g:1835:1: rule__Action__Group__5__Impl : ( 'effect' ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1839:1: ( ( 'effect' ) )
            // InternalMyDsl.g:1840:1: ( 'effect' )
            {
            // InternalMyDsl.g:1840:1: ( 'effect' )
            // InternalMyDsl.g:1841:2: 'effect'
            {
             before(grammarAccess.getActionAccess().getEffectKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getEffectKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5__Impl"


    // $ANTLR start "rule__Action__Group__6"
    // InternalMyDsl.g:1850:1: rule__Action__Group__6 : rule__Action__Group__6__Impl rule__Action__Group__7 ;
    public final void rule__Action__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1854:1: ( rule__Action__Group__6__Impl rule__Action__Group__7 )
            // InternalMyDsl.g:1855:2: rule__Action__Group__6__Impl rule__Action__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Action__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__6"


    // $ANTLR start "rule__Action__Group__6__Impl"
    // InternalMyDsl.g:1862:1: rule__Action__Group__6__Impl : ( ':' ) ;
    public final void rule__Action__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1866:1: ( ( ':' ) )
            // InternalMyDsl.g:1867:1: ( ':' )
            {
            // InternalMyDsl.g:1867:1: ( ':' )
            // InternalMyDsl.g:1868:2: ':'
            {
             before(grammarAccess.getActionAccess().getColonKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__6__Impl"


    // $ANTLR start "rule__Action__Group__7"
    // InternalMyDsl.g:1877:1: rule__Action__Group__7 : rule__Action__Group__7__Impl ;
    public final void rule__Action__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1881:1: ( rule__Action__Group__7__Impl )
            // InternalMyDsl.g:1882:2: rule__Action__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__7"


    // $ANTLR start "rule__Action__Group__7__Impl"
    // InternalMyDsl.g:1888:1: rule__Action__Group__7__Impl : ( RULE_STRING ) ;
    public final void rule__Action__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1892:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1893:1: ( RULE_STRING )
            {
            // InternalMyDsl.g:1893:1: ( RULE_STRING )
            // InternalMyDsl.g:1894:2: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getSTRINGTerminalRuleCall_7()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getSTRINGTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__7__Impl"


    // $ANTLR start "rule__Quest__Group__0"
    // InternalMyDsl.g:1904:1: rule__Quest__Group__0 : rule__Quest__Group__0__Impl rule__Quest__Group__1 ;
    public final void rule__Quest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1908:1: ( rule__Quest__Group__0__Impl rule__Quest__Group__1 )
            // InternalMyDsl.g:1909:2: rule__Quest__Group__0__Impl rule__Quest__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Quest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__Group__0"


    // $ANTLR start "rule__Quest__Group__0__Impl"
    // InternalMyDsl.g:1916:1: rule__Quest__Group__0__Impl : ( ( rule__Quest__NameAssignment_0 ) ) ;
    public final void rule__Quest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1920:1: ( ( ( rule__Quest__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1921:1: ( ( rule__Quest__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1921:1: ( ( rule__Quest__NameAssignment_0 ) )
            // InternalMyDsl.g:1922:2: ( rule__Quest__NameAssignment_0 )
            {
             before(grammarAccess.getQuestAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1923:2: ( rule__Quest__NameAssignment_0 )
            // InternalMyDsl.g:1923:3: rule__Quest__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Quest__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQuestAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__Group__0__Impl"


    // $ANTLR start "rule__Quest__Group__1"
    // InternalMyDsl.g:1931:1: rule__Quest__Group__1 : rule__Quest__Group__1__Impl rule__Quest__Group__2 ;
    public final void rule__Quest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1935:1: ( rule__Quest__Group__1__Impl rule__Quest__Group__2 )
            // InternalMyDsl.g:1936:2: rule__Quest__Group__1__Impl rule__Quest__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Quest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quest__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__Group__1"


    // $ANTLR start "rule__Quest__Group__1__Impl"
    // InternalMyDsl.g:1943:1: rule__Quest__Group__1__Impl : ( 'Desc' ) ;
    public final void rule__Quest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1947:1: ( ( 'Desc' ) )
            // InternalMyDsl.g:1948:1: ( 'Desc' )
            {
            // InternalMyDsl.g:1948:1: ( 'Desc' )
            // InternalMyDsl.g:1949:2: 'Desc'
            {
             before(grammarAccess.getQuestAccess().getDescKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getQuestAccess().getDescKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__Group__1__Impl"


    // $ANTLR start "rule__Quest__Group__2"
    // InternalMyDsl.g:1958:1: rule__Quest__Group__2 : rule__Quest__Group__2__Impl rule__Quest__Group__3 ;
    public final void rule__Quest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1962:1: ( rule__Quest__Group__2__Impl rule__Quest__Group__3 )
            // InternalMyDsl.g:1963:2: rule__Quest__Group__2__Impl rule__Quest__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Quest__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quest__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__Group__2"


    // $ANTLR start "rule__Quest__Group__2__Impl"
    // InternalMyDsl.g:1970:1: rule__Quest__Group__2__Impl : ( RULE_STRING ) ;
    public final void rule__Quest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1974:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1975:1: ( RULE_STRING )
            {
            // InternalMyDsl.g:1975:1: ( RULE_STRING )
            // InternalMyDsl.g:1976:2: RULE_STRING
            {
             before(grammarAccess.getQuestAccess().getSTRINGTerminalRuleCall_2()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQuestAccess().getSTRINGTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__Group__2__Impl"


    // $ANTLR start "rule__Quest__Group__3"
    // InternalMyDsl.g:1985:1: rule__Quest__Group__3 : rule__Quest__Group__3__Impl rule__Quest__Group__4 ;
    public final void rule__Quest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1989:1: ( rule__Quest__Group__3__Impl rule__Quest__Group__4 )
            // InternalMyDsl.g:1990:2: rule__Quest__Group__3__Impl rule__Quest__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Quest__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quest__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__Group__3"


    // $ANTLR start "rule__Quest__Group__3__Impl"
    // InternalMyDsl.g:1997:1: rule__Quest__Group__3__Impl : ( 'PreCon' ) ;
    public final void rule__Quest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2001:1: ( ( 'PreCon' ) )
            // InternalMyDsl.g:2002:1: ( 'PreCon' )
            {
            // InternalMyDsl.g:2002:1: ( 'PreCon' )
            // InternalMyDsl.g:2003:2: 'PreCon'
            {
             before(grammarAccess.getQuestAccess().getPreConKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getQuestAccess().getPreConKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__Group__3__Impl"


    // $ANTLR start "rule__Quest__Group__4"
    // InternalMyDsl.g:2012:1: rule__Quest__Group__4 : rule__Quest__Group__4__Impl rule__Quest__Group__5 ;
    public final void rule__Quest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2016:1: ( rule__Quest__Group__4__Impl rule__Quest__Group__5 )
            // InternalMyDsl.g:2017:2: rule__Quest__Group__4__Impl rule__Quest__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__Quest__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quest__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__Group__4"


    // $ANTLR start "rule__Quest__Group__4__Impl"
    // InternalMyDsl.g:2024:1: rule__Quest__Group__4__Impl : ( RULE_STRING ) ;
    public final void rule__Quest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2028:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2029:1: ( RULE_STRING )
            {
            // InternalMyDsl.g:2029:1: ( RULE_STRING )
            // InternalMyDsl.g:2030:2: RULE_STRING
            {
             before(grammarAccess.getQuestAccess().getSTRINGTerminalRuleCall_4()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQuestAccess().getSTRINGTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__Group__4__Impl"


    // $ANTLR start "rule__Quest__Group__5"
    // InternalMyDsl.g:2039:1: rule__Quest__Group__5 : rule__Quest__Group__5__Impl rule__Quest__Group__6 ;
    public final void rule__Quest__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2043:1: ( rule__Quest__Group__5__Impl rule__Quest__Group__6 )
            // InternalMyDsl.g:2044:2: rule__Quest__Group__5__Impl rule__Quest__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Quest__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quest__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__Group__5"


    // $ANTLR start "rule__Quest__Group__5__Impl"
    // InternalMyDsl.g:2051:1: rule__Quest__Group__5__Impl : ( 'WinCon' ) ;
    public final void rule__Quest__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2055:1: ( ( 'WinCon' ) )
            // InternalMyDsl.g:2056:1: ( 'WinCon' )
            {
            // InternalMyDsl.g:2056:1: ( 'WinCon' )
            // InternalMyDsl.g:2057:2: 'WinCon'
            {
             before(grammarAccess.getQuestAccess().getWinConKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getQuestAccess().getWinConKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__Group__5__Impl"


    // $ANTLR start "rule__Quest__Group__6"
    // InternalMyDsl.g:2066:1: rule__Quest__Group__6 : rule__Quest__Group__6__Impl rule__Quest__Group__7 ;
    public final void rule__Quest__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2070:1: ( rule__Quest__Group__6__Impl rule__Quest__Group__7 )
            // InternalMyDsl.g:2071:2: rule__Quest__Group__6__Impl rule__Quest__Group__7
            {
            pushFollow(FOLLOW_33);
            rule__Quest__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quest__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__Group__6"


    // $ANTLR start "rule__Quest__Group__6__Impl"
    // InternalMyDsl.g:2078:1: rule__Quest__Group__6__Impl : ( RULE_STRING ) ;
    public final void rule__Quest__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2082:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2083:1: ( RULE_STRING )
            {
            // InternalMyDsl.g:2083:1: ( RULE_STRING )
            // InternalMyDsl.g:2084:2: RULE_STRING
            {
             before(grammarAccess.getQuestAccess().getSTRINGTerminalRuleCall_6()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQuestAccess().getSTRINGTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__Group__6__Impl"


    // $ANTLR start "rule__Quest__Group__7"
    // InternalMyDsl.g:2093:1: rule__Quest__Group__7 : rule__Quest__Group__7__Impl rule__Quest__Group__8 ;
    public final void rule__Quest__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2097:1: ( rule__Quest__Group__7__Impl rule__Quest__Group__8 )
            // InternalMyDsl.g:2098:2: rule__Quest__Group__7__Impl rule__Quest__Group__8
            {
            pushFollow(FOLLOW_34);
            rule__Quest__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quest__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__Group__7"


    // $ANTLR start "rule__Quest__Group__7__Impl"
    // InternalMyDsl.g:2105:1: rule__Quest__Group__7__Impl : ( 'Rewards' ) ;
    public final void rule__Quest__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2109:1: ( ( 'Rewards' ) )
            // InternalMyDsl.g:2110:1: ( 'Rewards' )
            {
            // InternalMyDsl.g:2110:1: ( 'Rewards' )
            // InternalMyDsl.g:2111:2: 'Rewards'
            {
             before(grammarAccess.getQuestAccess().getRewardsKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getQuestAccess().getRewardsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__Group__7__Impl"


    // $ANTLR start "rule__Quest__Group__8"
    // InternalMyDsl.g:2120:1: rule__Quest__Group__8 : rule__Quest__Group__8__Impl rule__Quest__Group__9 ;
    public final void rule__Quest__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2124:1: ( rule__Quest__Group__8__Impl rule__Quest__Group__9 )
            // InternalMyDsl.g:2125:2: rule__Quest__Group__8__Impl rule__Quest__Group__9
            {
            pushFollow(FOLLOW_34);
            rule__Quest__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quest__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__Group__8"


    // $ANTLR start "rule__Quest__Group__8__Impl"
    // InternalMyDsl.g:2132:1: rule__Quest__Group__8__Impl : ( ( rule__Quest__ItemsAssignment_8 )* ) ;
    public final void rule__Quest__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2136:1: ( ( ( rule__Quest__ItemsAssignment_8 )* ) )
            // InternalMyDsl.g:2137:1: ( ( rule__Quest__ItemsAssignment_8 )* )
            {
            // InternalMyDsl.g:2137:1: ( ( rule__Quest__ItemsAssignment_8 )* )
            // InternalMyDsl.g:2138:2: ( rule__Quest__ItemsAssignment_8 )*
            {
             before(grammarAccess.getQuestAccess().getItemsAssignment_8()); 
            // InternalMyDsl.g:2139:2: ( rule__Quest__ItemsAssignment_8 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:2139:3: rule__Quest__ItemsAssignment_8
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Quest__ItemsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getQuestAccess().getItemsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__Group__8__Impl"


    // $ANTLR start "rule__Quest__Group__9"
    // InternalMyDsl.g:2147:1: rule__Quest__Group__9 : rule__Quest__Group__9__Impl rule__Quest__Group__10 ;
    public final void rule__Quest__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2151:1: ( rule__Quest__Group__9__Impl rule__Quest__Group__10 )
            // InternalMyDsl.g:2152:2: rule__Quest__Group__9__Impl rule__Quest__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__Quest__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quest__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__Group__9"


    // $ANTLR start "rule__Quest__Group__9__Impl"
    // InternalMyDsl.g:2159:1: rule__Quest__Group__9__Impl : ( 'EndDesc' ) ;
    public final void rule__Quest__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2163:1: ( ( 'EndDesc' ) )
            // InternalMyDsl.g:2164:1: ( 'EndDesc' )
            {
            // InternalMyDsl.g:2164:1: ( 'EndDesc' )
            // InternalMyDsl.g:2165:2: 'EndDesc'
            {
             before(grammarAccess.getQuestAccess().getEndDescKeyword_9()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getQuestAccess().getEndDescKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__Group__9__Impl"


    // $ANTLR start "rule__Quest__Group__10"
    // InternalMyDsl.g:2174:1: rule__Quest__Group__10 : rule__Quest__Group__10__Impl ;
    public final void rule__Quest__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2178:1: ( rule__Quest__Group__10__Impl )
            // InternalMyDsl.g:2179:2: rule__Quest__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Quest__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__Group__10"


    // $ANTLR start "rule__Quest__Group__10__Impl"
    // InternalMyDsl.g:2185:1: rule__Quest__Group__10__Impl : ( RULE_STRING ) ;
    public final void rule__Quest__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2189:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2190:1: ( RULE_STRING )
            {
            // InternalMyDsl.g:2190:1: ( RULE_STRING )
            // InternalMyDsl.g:2191:2: RULE_STRING
            {
             before(grammarAccess.getQuestAccess().getSTRINGTerminalRuleCall_10()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQuestAccess().getSTRINGTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__Group__10__Impl"


    // $ANTLR start "rule__Model__StoryAssignment_0"
    // InternalMyDsl.g:2201:1: rule__Model__StoryAssignment_0 : ( ruleStory ) ;
    public final void rule__Model__StoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2205:1: ( ( ruleStory ) )
            // InternalMyDsl.g:2206:2: ( ruleStory )
            {
            // InternalMyDsl.g:2206:2: ( ruleStory )
            // InternalMyDsl.g:2207:3: ruleStory
            {
             before(grammarAccess.getModelAccess().getStoryStoryParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStory();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStoryStoryParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StoryAssignment_0"


    // $ANTLR start "rule__Model__PlayerAssignment_1"
    // InternalMyDsl.g:2216:1: rule__Model__PlayerAssignment_1 : ( rulePlayer ) ;
    public final void rule__Model__PlayerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2220:1: ( ( rulePlayer ) )
            // InternalMyDsl.g:2221:2: ( rulePlayer )
            {
            // InternalMyDsl.g:2221:2: ( rulePlayer )
            // InternalMyDsl.g:2222:3: rulePlayer
            {
             before(grammarAccess.getModelAccess().getPlayerPlayerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlayer();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPlayerPlayerParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PlayerAssignment_1"


    // $ANTLR start "rule__Model__LocationsAssignment_3"
    // InternalMyDsl.g:2231:1: rule__Model__LocationsAssignment_3 : ( ruleLocation ) ;
    public final void rule__Model__LocationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2235:1: ( ( ruleLocation ) )
            // InternalMyDsl.g:2236:2: ( ruleLocation )
            {
            // InternalMyDsl.g:2236:2: ( ruleLocation )
            // InternalMyDsl.g:2237:3: ruleLocation
            {
             before(grammarAccess.getModelAccess().getLocationsLocationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getModelAccess().getLocationsLocationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__LocationsAssignment_3"


    // $ANTLR start "rule__Model__NpcAssignment_5"
    // InternalMyDsl.g:2246:1: rule__Model__NpcAssignment_5 : ( ruleNPC ) ;
    public final void rule__Model__NpcAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2250:1: ( ( ruleNPC ) )
            // InternalMyDsl.g:2251:2: ( ruleNPC )
            {
            // InternalMyDsl.g:2251:2: ( ruleNPC )
            // InternalMyDsl.g:2252:3: ruleNPC
            {
             before(grammarAccess.getModelAccess().getNpcNPCParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleNPC();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNpcNPCParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NpcAssignment_5"


    // $ANTLR start "rule__Model__ItemAssignment_7"
    // InternalMyDsl.g:2261:1: rule__Model__ItemAssignment_7 : ( ruleItem ) ;
    public final void rule__Model__ItemAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2265:1: ( ( ruleItem ) )
            // InternalMyDsl.g:2266:2: ( ruleItem )
            {
            // InternalMyDsl.g:2266:2: ( ruleItem )
            // InternalMyDsl.g:2267:3: ruleItem
            {
             before(grammarAccess.getModelAccess().getItemItemParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getModelAccess().getItemItemParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ItemAssignment_7"


    // $ANTLR start "rule__Model__ActionAssignment_9"
    // InternalMyDsl.g:2276:1: rule__Model__ActionAssignment_9 : ( ruleAction ) ;
    public final void rule__Model__ActionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2280:1: ( ( ruleAction ) )
            // InternalMyDsl.g:2281:2: ( ruleAction )
            {
            // InternalMyDsl.g:2281:2: ( ruleAction )
            // InternalMyDsl.g:2282:3: ruleAction
            {
             before(grammarAccess.getModelAccess().getActionActionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getModelAccess().getActionActionParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ActionAssignment_9"


    // $ANTLR start "rule__Model__QuestAssignment_11"
    // InternalMyDsl.g:2291:1: rule__Model__QuestAssignment_11 : ( ruleQuest ) ;
    public final void rule__Model__QuestAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2295:1: ( ( ruleQuest ) )
            // InternalMyDsl.g:2296:2: ( ruleQuest )
            {
            // InternalMyDsl.g:2296:2: ( ruleQuest )
            // InternalMyDsl.g:2297:3: ruleQuest
            {
             before(grammarAccess.getModelAccess().getQuestQuestParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleQuest();

            state._fsp--;

             after(grammarAccess.getModelAccess().getQuestQuestParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__QuestAssignment_11"


    // $ANTLR start "rule__Story__NameAssignment_2"
    // InternalMyDsl.g:2306:1: rule__Story__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Story__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2310:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2311:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2311:2: ( RULE_ID )
            // InternalMyDsl.g:2312:3: RULE_ID
            {
             before(grammarAccess.getStoryAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__NameAssignment_2"


    // $ANTLR start "rule__Story__StartLocationAssignment_8"
    // InternalMyDsl.g:2321:1: rule__Story__StartLocationAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Story__StartLocationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2325:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2326:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2326:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2327:3: ( RULE_ID )
            {
             before(grammarAccess.getStoryAccess().getStartLocationLocationCrossReference_8_0()); 
            // InternalMyDsl.g:2328:3: ( RULE_ID )
            // InternalMyDsl.g:2329:4: RULE_ID
            {
             before(grammarAccess.getStoryAccess().getStartLocationLocationIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getStartLocationLocationIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getStoryAccess().getStartLocationLocationCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__StartLocationAssignment_8"


    // $ANTLR start "rule__Location__NameAssignment_1"
    // InternalMyDsl.g:2340:1: rule__Location__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Location__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2344:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2345:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2345:2: ( RULE_ID )
            // InternalMyDsl.g:2346:3: RULE_ID
            {
             before(grammarAccess.getLocationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__NameAssignment_1"


    // $ANTLR start "rule__Location__NPCsAssignment_3"
    // InternalMyDsl.g:2355:1: rule__Location__NPCsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Location__NPCsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2359:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2360:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2360:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2361:3: ( RULE_ID )
            {
             before(grammarAccess.getLocationAccess().getNPCsNPCCrossReference_3_0()); 
            // InternalMyDsl.g:2362:3: ( RULE_ID )
            // InternalMyDsl.g:2363:4: RULE_ID
            {
             before(grammarAccess.getLocationAccess().getNPCsNPCIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getNPCsNPCIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getLocationAccess().getNPCsNPCCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__NPCsAssignment_3"


    // $ANTLR start "rule__Location__ItemsAssignment_5"
    // InternalMyDsl.g:2374:1: rule__Location__ItemsAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Location__ItemsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2378:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2379:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2379:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2380:3: ( RULE_ID )
            {
             before(grammarAccess.getLocationAccess().getItemsItemCrossReference_5_0()); 
            // InternalMyDsl.g:2381:3: ( RULE_ID )
            // InternalMyDsl.g:2382:4: RULE_ID
            {
             before(grammarAccess.getLocationAccess().getItemsItemIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getItemsItemIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getLocationAccess().getItemsItemCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__ItemsAssignment_5"


    // $ANTLR start "rule__Location__ConnectionsAssignment_7"
    // InternalMyDsl.g:2393:1: rule__Location__ConnectionsAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Location__ConnectionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2397:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2398:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2398:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2399:3: ( RULE_ID )
            {
             before(grammarAccess.getLocationAccess().getConnectionsLocationCrossReference_7_0()); 
            // InternalMyDsl.g:2400:3: ( RULE_ID )
            // InternalMyDsl.g:2401:4: RULE_ID
            {
             before(grammarAccess.getLocationAccess().getConnectionsLocationIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getConnectionsLocationIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getLocationAccess().getConnectionsLocationCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__ConnectionsAssignment_7"


    // $ANTLR start "rule__Player__NameAssignment_1"
    // InternalMyDsl.g:2412:1: rule__Player__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Player__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2416:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2417:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2417:2: ( RULE_ID )
            // InternalMyDsl.g:2418:3: RULE_ID
            {
             before(grammarAccess.getPlayerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__NameAssignment_1"


    // $ANTLR start "rule__Player__ActionsAssignment_3"
    // InternalMyDsl.g:2427:1: rule__Player__ActionsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Player__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2431:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2432:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2432:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2433:3: ( RULE_ID )
            {
             before(grammarAccess.getPlayerAccess().getActionsActionCrossReference_3_0()); 
            // InternalMyDsl.g:2434:3: ( RULE_ID )
            // InternalMyDsl.g:2435:4: RULE_ID
            {
             before(grammarAccess.getPlayerAccess().getActionsActionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getActionsActionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPlayerAccess().getActionsActionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__ActionsAssignment_3"


    // $ANTLR start "rule__Player__ItemsAssignment_5"
    // InternalMyDsl.g:2446:1: rule__Player__ItemsAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Player__ItemsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2450:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2451:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2451:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2452:3: ( RULE_ID )
            {
             before(grammarAccess.getPlayerAccess().getItemsItemCrossReference_5_0()); 
            // InternalMyDsl.g:2453:3: ( RULE_ID )
            // InternalMyDsl.g:2454:4: RULE_ID
            {
             before(grammarAccess.getPlayerAccess().getItemsItemIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getItemsItemIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getPlayerAccess().getItemsItemCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__ItemsAssignment_5"


    // $ANTLR start "rule__Player__AttrAssignment_7"
    // InternalMyDsl.g:2465:1: rule__Player__AttrAssignment_7 : ( ruleAttribute ) ;
    public final void rule__Player__AttrAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2469:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:2470:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:2470:2: ( ruleAttribute )
            // InternalMyDsl.g:2471:3: ruleAttribute
            {
             before(grammarAccess.getPlayerAccess().getAttrAttributeParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getPlayerAccess().getAttrAttributeParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__AttrAssignment_7"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalMyDsl.g:2480:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2484:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2485:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2485:2: ( RULE_ID )
            // InternalMyDsl.g:2486:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Item__NameAssignment_1"
    // InternalMyDsl.g:2495:1: rule__Item__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Item__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2499:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2500:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2500:2: ( RULE_ID )
            // InternalMyDsl.g:2501:3: RULE_ID
            {
             before(grammarAccess.getItemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__NameAssignment_1"


    // $ANTLR start "rule__Item__ActionsAssignment_5"
    // InternalMyDsl.g:2510:1: rule__Item__ActionsAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Item__ActionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2514:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2515:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2515:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2516:3: ( RULE_ID )
            {
             before(grammarAccess.getItemAccess().getActionsActionCrossReference_5_0()); 
            // InternalMyDsl.g:2517:3: ( RULE_ID )
            // InternalMyDsl.g:2518:4: RULE_ID
            {
             before(grammarAccess.getItemAccess().getActionsActionIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getActionsActionIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getItemAccess().getActionsActionCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__ActionsAssignment_5"


    // $ANTLR start "rule__NPC__NameAssignment_1"
    // InternalMyDsl.g:2529:1: rule__NPC__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NPC__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2533:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2534:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2534:2: ( RULE_ID )
            // InternalMyDsl.g:2535:3: RULE_ID
            {
             before(grammarAccess.getNPCAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNPCAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NPC__NameAssignment_1"


    // $ANTLR start "rule__NPC__ItemsAssignment_3"
    // InternalMyDsl.g:2544:1: rule__NPC__ItemsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__NPC__ItemsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2548:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2549:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2549:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2550:3: ( RULE_ID )
            {
             before(grammarAccess.getNPCAccess().getItemsItemCrossReference_3_0()); 
            // InternalMyDsl.g:2551:3: ( RULE_ID )
            // InternalMyDsl.g:2552:4: RULE_ID
            {
             before(grammarAccess.getNPCAccess().getItemsItemIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNPCAccess().getItemsItemIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getNPCAccess().getItemsItemCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NPC__ItemsAssignment_3"


    // $ANTLR start "rule__NPC__ActionsAssignment_5"
    // InternalMyDsl.g:2563:1: rule__NPC__ActionsAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__NPC__ActionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2567:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2568:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2568:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2569:3: ( RULE_ID )
            {
             before(grammarAccess.getNPCAccess().getActionsActionCrossReference_5_0()); 
            // InternalMyDsl.g:2570:3: ( RULE_ID )
            // InternalMyDsl.g:2571:4: RULE_ID
            {
             before(grammarAccess.getNPCAccess().getActionsActionIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNPCAccess().getActionsActionIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getNPCAccess().getActionsActionCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NPC__ActionsAssignment_5"


    // $ANTLR start "rule__Action__NameAssignment_1"
    // InternalMyDsl.g:2582:1: rule__Action__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2586:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2587:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2587:2: ( RULE_ID )
            // InternalMyDsl.g:2588:3: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__NameAssignment_1"


    // $ANTLR start "rule__Quest__NameAssignment_0"
    // InternalMyDsl.g:2597:1: rule__Quest__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Quest__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2601:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2602:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2602:2: ( RULE_ID )
            // InternalMyDsl.g:2603:3: RULE_ID
            {
             before(grammarAccess.getQuestAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuestAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__NameAssignment_0"


    // $ANTLR start "rule__Quest__ItemsAssignment_8"
    // InternalMyDsl.g:2612:1: rule__Quest__ItemsAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Quest__ItemsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2616:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2617:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2617:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2618:3: ( RULE_ID )
            {
             before(grammarAccess.getQuestAccess().getItemsItemCrossReference_8_0()); 
            // InternalMyDsl.g:2619:3: ( RULE_ID )
            // InternalMyDsl.g:2620:4: RULE_ID
            {
             before(grammarAccess.getQuestAccess().getItemsItemIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuestAccess().getItemsItemIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getQuestAccess().getItemsItemCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quest__ItemsAssignment_8"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000040L});

}