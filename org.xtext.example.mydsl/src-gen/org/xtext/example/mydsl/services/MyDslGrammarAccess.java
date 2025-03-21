/*
 * generated by Xtext 2.36.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cStoryAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cStoryStoryParserRuleCall_0_0 = (RuleCall)cStoryAssignment_0.eContents().get(0);
		private final Assignment cPlayerAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPlayerPlayerParserRuleCall_1_0 = (RuleCall)cPlayerAssignment_1.eContents().get(0);
		private final Keyword cLocationsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLocationsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLocationsLocationParserRuleCall_3_0 = (RuleCall)cLocationsAssignment_3.eContents().get(0);
		private final Keyword cNPCsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cNpcAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cNpcNPCParserRuleCall_5_0 = (RuleCall)cNpcAssignment_5.eContents().get(0);
		private final Keyword cItemsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cItemAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cItemItemParserRuleCall_7_0 = (RuleCall)cItemAssignment_7.eContents().get(0);
		private final Keyword cActionsKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cActionAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cActionActionParserRuleCall_9_0 = (RuleCall)cActionAssignment_9.eContents().get(0);
		private final Keyword cQuestsKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cQuestAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cQuestQuestParserRuleCall_11_0 = (RuleCall)cQuestAssignment_11.eContents().get(0);
		
		//Model:
		//    story=Story
		//    player=Player
		//    'Locations' locations+=Location+
		//    'NPCs' npc+=NPC*
		//    'Items' item+=Item*
		//    'Actions'action+=Action*
		//    'Quests' quest+=Quest*
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//story=Story
		//player=Player
		//'Locations' locations+=Location+
		//'NPCs' npc+=NPC*
		//'Items' item+=Item*
		//'Actions'action+=Action*
		//'Quests' quest+=Quest*
		public Group getGroup() { return cGroup; }
		
		//story=Story
		public Assignment getStoryAssignment_0() { return cStoryAssignment_0; }
		
		//Story
		public RuleCall getStoryStoryParserRuleCall_0_0() { return cStoryStoryParserRuleCall_0_0; }
		
		//player=Player
		public Assignment getPlayerAssignment_1() { return cPlayerAssignment_1; }
		
		//Player
		public RuleCall getPlayerPlayerParserRuleCall_1_0() { return cPlayerPlayerParserRuleCall_1_0; }
		
		//'Locations'
		public Keyword getLocationsKeyword_2() { return cLocationsKeyword_2; }
		
		//locations+=Location+
		public Assignment getLocationsAssignment_3() { return cLocationsAssignment_3; }
		
		//Location
		public RuleCall getLocationsLocationParserRuleCall_3_0() { return cLocationsLocationParserRuleCall_3_0; }
		
		//'NPCs'
		public Keyword getNPCsKeyword_4() { return cNPCsKeyword_4; }
		
		//npc+=NPC*
		public Assignment getNpcAssignment_5() { return cNpcAssignment_5; }
		
		//NPC
		public RuleCall getNpcNPCParserRuleCall_5_0() { return cNpcNPCParserRuleCall_5_0; }
		
		//'Items'
		public Keyword getItemsKeyword_6() { return cItemsKeyword_6; }
		
		//item+=Item*
		public Assignment getItemAssignment_7() { return cItemAssignment_7; }
		
		//Item
		public RuleCall getItemItemParserRuleCall_7_0() { return cItemItemParserRuleCall_7_0; }
		
		//'Actions'
		public Keyword getActionsKeyword_8() { return cActionsKeyword_8; }
		
		//action+=Action*
		public Assignment getActionAssignment_9() { return cActionAssignment_9; }
		
		//Action
		public RuleCall getActionActionParserRuleCall_9_0() { return cActionActionParserRuleCall_9_0; }
		
		//'Quests'
		public Keyword getQuestsKeyword_10() { return cQuestsKeyword_10; }
		
		//quest+=Quest*
		public Assignment getQuestAssignment_11() { return cQuestAssignment_11; }
		
		//Quest
		public RuleCall getQuestQuestParserRuleCall_11_0() { return cQuestQuestParserRuleCall_11_0; }
	}
	public class StoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Story");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStoryKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cDescKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final RuleCall cSTRINGTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Keyword cStartKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cStartLocationAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cStartLocationLocationCrossReference_8_0 = (CrossReference)cStartLocationAssignment_8.eContents().get(0);
		private final RuleCall cStartLocationLocationIDTerminalRuleCall_8_0_1 = (RuleCall)cStartLocationLocationCrossReference_8_0.eContents().get(1);
		
		//Story:
		//    'Story' ':' name=ID 'Desc' ':' STRING 'Start' ':' startLocation=[Location];
		@Override public ParserRule getRule() { return rule; }
		
		//'Story' ':' name=ID 'Desc' ':' STRING 'Start' ':' startLocation=[Location]
		public Group getGroup() { return cGroup; }
		
		//'Story'
		public Keyword getStoryKeyword_0() { return cStoryKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'Desc'
		public Keyword getDescKeyword_3() { return cDescKeyword_3; }
		
		//':'
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_5() { return cSTRINGTerminalRuleCall_5; }
		
		//'Start'
		public Keyword getStartKeyword_6() { return cStartKeyword_6; }
		
		//':'
		public Keyword getColonKeyword_7() { return cColonKeyword_7; }
		
		//startLocation=[Location]
		public Assignment getStartLocationAssignment_8() { return cStartLocationAssignment_8; }
		
		//[Location]
		public CrossReference getStartLocationLocationCrossReference_8_0() { return cStartLocationLocationCrossReference_8_0; }
		
		//ID
		public RuleCall getStartLocationLocationIDTerminalRuleCall_8_0_1() { return cStartLocationLocationIDTerminalRuleCall_8_0_1; }
	}
	public class LocationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Location");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLocationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cNPCsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNPCsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cNPCsNPCCrossReference_3_0 = (CrossReference)cNPCsAssignment_3.eContents().get(0);
		private final RuleCall cNPCsNPCIDTerminalRuleCall_3_0_1 = (RuleCall)cNPCsNPCCrossReference_3_0.eContents().get(1);
		private final Keyword cItemsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cItemsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cItemsItemCrossReference_5_0 = (CrossReference)cItemsAssignment_5.eContents().get(0);
		private final RuleCall cItemsItemIDTerminalRuleCall_5_0_1 = (RuleCall)cItemsItemCrossReference_5_0.eContents().get(1);
		private final Keyword cConnectionsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cConnectionsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cConnectionsLocationCrossReference_7_0 = (CrossReference)cConnectionsAssignment_7.eContents().get(0);
		private final RuleCall cConnectionsLocationIDTerminalRuleCall_7_0_1 = (RuleCall)cConnectionsLocationCrossReference_7_0.eContents().get(1);
		
		//Location:
		//    'Location' name = ID 'NPCs' NPCs+=[NPC]* 'Items' Items+=[Item]* 'Connections' Connections+=[Location]*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Location' name = ID 'NPCs' NPCs+=[NPC]* 'Items' Items+=[Item]* 'Connections' Connections+=[Location]*
		public Group getGroup() { return cGroup; }
		
		//'Location'
		public Keyword getLocationKeyword_0() { return cLocationKeyword_0; }
		
		//name = ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'NPCs'
		public Keyword getNPCsKeyword_2() { return cNPCsKeyword_2; }
		
		//NPCs+=[NPC]*
		public Assignment getNPCsAssignment_3() { return cNPCsAssignment_3; }
		
		//[NPC]
		public CrossReference getNPCsNPCCrossReference_3_0() { return cNPCsNPCCrossReference_3_0; }
		
		//ID
		public RuleCall getNPCsNPCIDTerminalRuleCall_3_0_1() { return cNPCsNPCIDTerminalRuleCall_3_0_1; }
		
		//'Items'
		public Keyword getItemsKeyword_4() { return cItemsKeyword_4; }
		
		//Items+=[Item]*
		public Assignment getItemsAssignment_5() { return cItemsAssignment_5; }
		
		//[Item]
		public CrossReference getItemsItemCrossReference_5_0() { return cItemsItemCrossReference_5_0; }
		
		//ID
		public RuleCall getItemsItemIDTerminalRuleCall_5_0_1() { return cItemsItemIDTerminalRuleCall_5_0_1; }
		
		//'Connections'
		public Keyword getConnectionsKeyword_6() { return cConnectionsKeyword_6; }
		
		//Connections+=[Location]*
		public Assignment getConnectionsAssignment_7() { return cConnectionsAssignment_7; }
		
		//[Location]
		public CrossReference getConnectionsLocationCrossReference_7_0() { return cConnectionsLocationCrossReference_7_0; }
		
		//ID
		public RuleCall getConnectionsLocationIDTerminalRuleCall_7_0_1() { return cConnectionsLocationIDTerminalRuleCall_7_0_1; }
	}
	public class PlayerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Player");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPlayerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cActionsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cActionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cActionsActionCrossReference_3_0 = (CrossReference)cActionsAssignment_3.eContents().get(0);
		private final RuleCall cActionsActionIDTerminalRuleCall_3_0_1 = (RuleCall)cActionsActionCrossReference_3_0.eContents().get(1);
		private final Keyword cInventoryKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cItemsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cItemsItemCrossReference_5_0 = (CrossReference)cItemsAssignment_5.eContents().get(0);
		private final RuleCall cItemsItemIDTerminalRuleCall_5_0_1 = (RuleCall)cItemsItemCrossReference_5_0.eContents().get(1);
		private final Keyword cAttrKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cAttrAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cAttrAttributeParserRuleCall_7_0 = (RuleCall)cAttrAssignment_7.eContents().get(0);
		
		//Player:
		//    'Player' name=ID 'Actions' actions+=[Action]* 'Inventory' items+=[Item]* 'Attr' attr+=Attribute*;
		@Override public ParserRule getRule() { return rule; }
		
		//'Player' name=ID 'Actions' actions+=[Action]* 'Inventory' items+=[Item]* 'Attr' attr+=Attribute*
		public Group getGroup() { return cGroup; }
		
		//'Player'
		public Keyword getPlayerKeyword_0() { return cPlayerKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'Actions'
		public Keyword getActionsKeyword_2() { return cActionsKeyword_2; }
		
		//actions+=[Action]*
		public Assignment getActionsAssignment_3() { return cActionsAssignment_3; }
		
		//[Action]
		public CrossReference getActionsActionCrossReference_3_0() { return cActionsActionCrossReference_3_0; }
		
		//ID
		public RuleCall getActionsActionIDTerminalRuleCall_3_0_1() { return cActionsActionIDTerminalRuleCall_3_0_1; }
		
		//'Inventory'
		public Keyword getInventoryKeyword_4() { return cInventoryKeyword_4; }
		
		//items+=[Item]*
		public Assignment getItemsAssignment_5() { return cItemsAssignment_5; }
		
		//[Item]
		public CrossReference getItemsItemCrossReference_5_0() { return cItemsItemCrossReference_5_0; }
		
		//ID
		public RuleCall getItemsItemIDTerminalRuleCall_5_0_1() { return cItemsItemIDTerminalRuleCall_5_0_1; }
		
		//'Attr'
		public Keyword getAttrKeyword_6() { return cAttrKeyword_6; }
		
		//attr+=Attribute*
		public Assignment getAttrAssignment_7() { return cAttrAssignment_7; }
		
		//Attribute
		public RuleCall getAttrAttributeParserRuleCall_7_0() { return cAttrAttributeParserRuleCall_7_0; }
	}
	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//Attribute:
		//    name=ID '=' INT;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID '=' INT
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2() { return cINTTerminalRuleCall_2; }
	}
	public class ItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Item");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cItemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cDescKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cSTRINGTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cActionsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cActionsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cActionsActionCrossReference_5_0 = (CrossReference)cActionsAssignment_5.eContents().get(0);
		private final RuleCall cActionsActionIDTerminalRuleCall_5_0_1 = (RuleCall)cActionsActionCrossReference_5_0.eContents().get(1);
		
		//Item:
		//    'Item' name=ID 'Desc' STRING 'Actions' actions+=[Action]*;
		@Override public ParserRule getRule() { return rule; }
		
		//'Item' name=ID 'Desc' STRING 'Actions' actions+=[Action]*
		public Group getGroup() { return cGroup; }
		
		//'Item'
		public Keyword getItemKeyword_0() { return cItemKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'Desc'
		public Keyword getDescKeyword_2() { return cDescKeyword_2; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_3() { return cSTRINGTerminalRuleCall_3; }
		
		//'Actions'
		public Keyword getActionsKeyword_4() { return cActionsKeyword_4; }
		
		//actions+=[Action]*
		public Assignment getActionsAssignment_5() { return cActionsAssignment_5; }
		
		//[Action]
		public CrossReference getActionsActionCrossReference_5_0() { return cActionsActionCrossReference_5_0; }
		
		//ID
		public RuleCall getActionsActionIDTerminalRuleCall_5_0_1() { return cActionsActionIDTerminalRuleCall_5_0_1; }
	}
	public class NPCElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.NPC");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNPCKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cInventoryKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cItemsItemCrossReference_3_0 = (CrossReference)cItemsAssignment_3.eContents().get(0);
		private final RuleCall cItemsItemIDTerminalRuleCall_3_0_1 = (RuleCall)cItemsItemCrossReference_3_0.eContents().get(1);
		private final Keyword cActionsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cActionsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cActionsActionCrossReference_5_0 = (CrossReference)cActionsAssignment_5.eContents().get(0);
		private final RuleCall cActionsActionIDTerminalRuleCall_5_0_1 = (RuleCall)cActionsActionCrossReference_5_0.eContents().get(1);
		
		//NPC:
		//    'NPC' name=ID 'Inventory' Items+=[Item]* 'Actions' actions+=[Action]*;
		@Override public ParserRule getRule() { return rule; }
		
		//'NPC' name=ID 'Inventory' Items+=[Item]* 'Actions' actions+=[Action]*
		public Group getGroup() { return cGroup; }
		
		//'NPC'
		public Keyword getNPCKeyword_0() { return cNPCKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'Inventory'
		public Keyword getInventoryKeyword_2() { return cInventoryKeyword_2; }
		
		//Items+=[Item]*
		public Assignment getItemsAssignment_3() { return cItemsAssignment_3; }
		
		//[Item]
		public CrossReference getItemsItemCrossReference_3_0() { return cItemsItemCrossReference_3_0; }
		
		//ID
		public RuleCall getItemsItemIDTerminalRuleCall_3_0_1() { return cItemsItemIDTerminalRuleCall_3_0_1; }
		
		//'Actions'
		public Keyword getActionsKeyword_4() { return cActionsKeyword_4; }
		
		//actions+=[Action]*
		public Assignment getActionsAssignment_5() { return cActionsAssignment_5; }
		
		//[Action]
		public CrossReference getActionsActionCrossReference_5_0() { return cActionsActionCrossReference_5_0; }
		
		//ID
		public RuleCall getActionsActionIDTerminalRuleCall_5_0_1() { return cActionsActionIDTerminalRuleCall_5_0_1; }
	}
	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Action");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cActionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cCommandKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final RuleCall cSTRINGTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Keyword cEffectKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cColonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final RuleCall cSTRINGTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		
		//Action:
		//    'Action' name=ID 'command' ':' STRING 'effect' ':' STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'Action' name=ID 'command' ':' STRING 'effect' ':' STRING
		public Group getGroup() { return cGroup; }
		
		//'Action'
		public Keyword getActionKeyword_0() { return cActionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'command'
		public Keyword getCommandKeyword_2() { return cCommandKeyword_2; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_4() { return cSTRINGTerminalRuleCall_4; }
		
		//'effect'
		public Keyword getEffectKeyword_5() { return cEffectKeyword_5; }
		
		//':'
		public Keyword getColonKeyword_6() { return cColonKeyword_6; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_7() { return cSTRINGTerminalRuleCall_7; }
	}
	public class QuestElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Quest");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cDescKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cPreConKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final RuleCall cSTRINGTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Keyword cWinConKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final RuleCall cSTRINGTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Keyword cRewardsKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cItemsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cItemsItemCrossReference_8_0 = (CrossReference)cItemsAssignment_8.eContents().get(0);
		private final RuleCall cItemsItemIDTerminalRuleCall_8_0_1 = (RuleCall)cItemsItemCrossReference_8_0.eContents().get(1);
		private final Keyword cEndDescKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final RuleCall cSTRINGTerminalRuleCall_10 = (RuleCall)cGroup.eContents().get(10);
		
		//Quest:
		//    name=ID 'Desc' STRING 'PreCon' STRING 'WinCon' STRING 'Rewards' Items+=[Item]* 'EndDesc' STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID 'Desc' STRING 'PreCon' STRING 'WinCon' STRING 'Rewards' Items+=[Item]* 'EndDesc' STRING
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'Desc'
		public Keyword getDescKeyword_1() { return cDescKeyword_1; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_2() { return cSTRINGTerminalRuleCall_2; }
		
		//'PreCon'
		public Keyword getPreConKeyword_3() { return cPreConKeyword_3; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_4() { return cSTRINGTerminalRuleCall_4; }
		
		//'WinCon'
		public Keyword getWinConKeyword_5() { return cWinConKeyword_5; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_6() { return cSTRINGTerminalRuleCall_6; }
		
		//'Rewards'
		public Keyword getRewardsKeyword_7() { return cRewardsKeyword_7; }
		
		//Items+=[Item]*
		public Assignment getItemsAssignment_8() { return cItemsAssignment_8; }
		
		//[Item]
		public CrossReference getItemsItemCrossReference_8_0() { return cItemsItemCrossReference_8_0; }
		
		//ID
		public RuleCall getItemsItemIDTerminalRuleCall_8_0_1() { return cItemsItemIDTerminalRuleCall_8_0_1; }
		
		//'EndDesc'
		public Keyword getEndDescKeyword_9() { return cEndDescKeyword_9; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_10() { return cSTRINGTerminalRuleCall_10; }
	}
	
	
	private final ModelElements pModel;
	private final StoryElements pStory;
	private final LocationElements pLocation;
	private final PlayerElements pPlayer;
	private final AttributeElements pAttribute;
	private final ItemElements pItem;
	private final NPCElements pNPC;
	private final ActionElements pAction;
	private final QuestElements pQuest;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pStory = new StoryElements();
		this.pLocation = new LocationElements();
		this.pPlayer = new PlayerElements();
		this.pAttribute = new AttributeElements();
		this.pItem = new ItemElements();
		this.pNPC = new NPCElements();
		this.pAction = new ActionElements();
		this.pQuest = new QuestElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//    story=Story
	//    player=Player
	//    'Locations' locations+=Location+
	//    'NPCs' npc+=NPC*
	//    'Items' item+=Item*
	//    'Actions'action+=Action*
	//    'Quests' quest+=Quest*
	//    ;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Story:
	//    'Story' ':' name=ID 'Desc' ':' STRING 'Start' ':' startLocation=[Location];
	public StoryElements getStoryAccess() {
		return pStory;
	}
	
	public ParserRule getStoryRule() {
		return getStoryAccess().getRule();
	}
	
	//Location:
	//    'Location' name = ID 'NPCs' NPCs+=[NPC]* 'Items' Items+=[Item]* 'Connections' Connections+=[Location]*
	//;
	public LocationElements getLocationAccess() {
		return pLocation;
	}
	
	public ParserRule getLocationRule() {
		return getLocationAccess().getRule();
	}
	
	//Player:
	//    'Player' name=ID 'Actions' actions+=[Action]* 'Inventory' items+=[Item]* 'Attr' attr+=Attribute*;
	public PlayerElements getPlayerAccess() {
		return pPlayer;
	}
	
	public ParserRule getPlayerRule() {
		return getPlayerAccess().getRule();
	}
	
	//Attribute:
	//    name=ID '=' INT;
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}
	
	//Item:
	//    'Item' name=ID 'Desc' STRING 'Actions' actions+=[Action]*;
	public ItemElements getItemAccess() {
		return pItem;
	}
	
	public ParserRule getItemRule() {
		return getItemAccess().getRule();
	}
	
	//NPC:
	//    'NPC' name=ID 'Inventory' Items+=[Item]* 'Actions' actions+=[Action]*;
	public NPCElements getNPCAccess() {
		return pNPC;
	}
	
	public ParserRule getNPCRule() {
		return getNPCAccess().getRule();
	}
	
	//Action:
	//    'Action' name=ID 'command' ':' STRING 'effect' ':' STRING;
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}
	
	//Quest:
	//    name=ID 'Desc' STRING 'PreCon' STRING 'WinCon' STRING 'Rewards' Items+=[Item]* 'EndDesc' STRING
	//;
	public QuestElements getQuestAccess() {
		return pQuest;
	}
	
	public ParserRule getQuestRule() {
		return getQuestAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
