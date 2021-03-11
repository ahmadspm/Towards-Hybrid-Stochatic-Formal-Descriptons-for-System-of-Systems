package org.xtext.sosModeling.archModeling.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.sosModeling.archModeling.services.SFDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSFDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ModelElements'", "'Constituient-System'", "'{'", "'}'", "'CSbehaviorsis'", "'functinoalaity'", "'['", "']'", "'provides'", "'requires'", "'PublicInteface'", "';'", "'('", "')'", "','", "'port'", "'.'", "'Collaborate'", "'instance'", "'='", "'new'", "'()'", "'attach'", "'detach'", "'bind'", "'Decide'", "'if'", "'=>'", "'or'", "'else'", "'end;'", "'iterate'", "'TRate'", "'StochasticCconstraints'", "'Tell'", "'Ask'", "'trait'", "'Mediator'", "'Med_Role'", "'SoS_Arch_Caoliton'", "'SoS has AEs'", "'SoS-Properties'", "'stirng'", "'int'", "'float'", "'boolean'", "'type'", "'void'", "'true'", "'false'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'mod'", "'!'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSFDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSFDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSFDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSFDSL.g"; }



     	private SFDSLGrammarAccess grammarAccess;

        public InternalSFDSLParser(TokenStream input, SFDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "StochasticModeling";
       	}

       	@Override
       	protected SFDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStochasticModeling"
    // InternalSFDSL.g:64:1: entryRuleStochasticModeling returns [EObject current=null] : iv_ruleStochasticModeling= ruleStochasticModeling EOF ;
    public final EObject entryRuleStochasticModeling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStochasticModeling = null;


        try {
            // InternalSFDSL.g:64:59: (iv_ruleStochasticModeling= ruleStochasticModeling EOF )
            // InternalSFDSL.g:65:2: iv_ruleStochasticModeling= ruleStochasticModeling EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStochasticModelingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStochasticModeling=ruleStochasticModeling();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStochasticModeling; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStochasticModeling"


    // $ANTLR start "ruleStochasticModeling"
    // InternalSFDSL.g:71:1: ruleStochasticModeling returns [EObject current=null] : ( (lv_StochasticModelElements_0_0= ruleModelElementsDecaration ) ) ;
    public final EObject ruleStochasticModeling() throws RecognitionException {
        EObject current = null;

        EObject lv_StochasticModelElements_0_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:77:2: ( ( (lv_StochasticModelElements_0_0= ruleModelElementsDecaration ) ) )
            // InternalSFDSL.g:78:2: ( (lv_StochasticModelElements_0_0= ruleModelElementsDecaration ) )
            {
            // InternalSFDSL.g:78:2: ( (lv_StochasticModelElements_0_0= ruleModelElementsDecaration ) )
            // InternalSFDSL.g:79:3: (lv_StochasticModelElements_0_0= ruleModelElementsDecaration )
            {
            // InternalSFDSL.g:79:3: (lv_StochasticModelElements_0_0= ruleModelElementsDecaration )
            // InternalSFDSL.g:80:4: lv_StochasticModelElements_0_0= ruleModelElementsDecaration
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getStochasticModelingAccess().getStochasticModelElementsModelElementsDecarationParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_StochasticModelElements_0_0=ruleModelElementsDecaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getStochasticModelingRule());
              				}
              				add(
              					current,
              					"StochasticModelElements",
              					lv_StochasticModelElements_0_0,
              					"org.xtext.sosModeling.archModeling.SFDSL.ModelElementsDecaration");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStochasticModeling"


    // $ANTLR start "entryRuleModelElementsDecaration"
    // InternalSFDSL.g:100:1: entryRuleModelElementsDecaration returns [EObject current=null] : iv_ruleModelElementsDecaration= ruleModelElementsDecaration EOF ;
    public final EObject entryRuleModelElementsDecaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElementsDecaration = null;


        try {
            // InternalSFDSL.g:100:64: (iv_ruleModelElementsDecaration= ruleModelElementsDecaration EOF )
            // InternalSFDSL.g:101:2: iv_ruleModelElementsDecaration= ruleModelElementsDecaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelElementsDecarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModelElementsDecaration=ruleModelElementsDecaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelElementsDecaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModelElementsDecaration"


    // $ANTLR start "ruleModelElementsDecaration"
    // InternalSFDSL.g:107:1: ruleModelElementsDecaration returns [EObject current=null] : ( () ( (lv_AbstractArchModel_1_0= ruleAbsArchDecl ) )* ( (lv_ConstiuenetSystemSDesign_2_0= ruleCSDecl ) )* ( (lv_MediatorDesign_3_0= ruleMedDecl ) )* ( (lv_ConcurrentConstraints_4_0= ruleCConsDecl ) )* ( (lv_ArchitecutreElementsBehaviors_5_0= ruleAElementsBehaviorRoutines ) )* otherlv_6= 'ModelElements' ( (lv_name_7_0= ruleQualifiedName ) ) ( (lv_Interfce_8_0= rulepublicinterfaeceDef ) ) ( (lv_ArchTraits_9_0= ruletraitDeclaration ) )* ) ;
    public final EObject ruleModelElementsDecaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        EObject lv_AbstractArchModel_1_0 = null;

        EObject lv_ConstiuenetSystemSDesign_2_0 = null;

        EObject lv_MediatorDesign_3_0 = null;

        EObject lv_ConcurrentConstraints_4_0 = null;

        EObject lv_ArchitecutreElementsBehaviors_5_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        EObject lv_Interfce_8_0 = null;

        EObject lv_ArchTraits_9_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:113:2: ( ( () ( (lv_AbstractArchModel_1_0= ruleAbsArchDecl ) )* ( (lv_ConstiuenetSystemSDesign_2_0= ruleCSDecl ) )* ( (lv_MediatorDesign_3_0= ruleMedDecl ) )* ( (lv_ConcurrentConstraints_4_0= ruleCConsDecl ) )* ( (lv_ArchitecutreElementsBehaviors_5_0= ruleAElementsBehaviorRoutines ) )* otherlv_6= 'ModelElements' ( (lv_name_7_0= ruleQualifiedName ) ) ( (lv_Interfce_8_0= rulepublicinterfaeceDef ) ) ( (lv_ArchTraits_9_0= ruletraitDeclaration ) )* ) )
            // InternalSFDSL.g:114:2: ( () ( (lv_AbstractArchModel_1_0= ruleAbsArchDecl ) )* ( (lv_ConstiuenetSystemSDesign_2_0= ruleCSDecl ) )* ( (lv_MediatorDesign_3_0= ruleMedDecl ) )* ( (lv_ConcurrentConstraints_4_0= ruleCConsDecl ) )* ( (lv_ArchitecutreElementsBehaviors_5_0= ruleAElementsBehaviorRoutines ) )* otherlv_6= 'ModelElements' ( (lv_name_7_0= ruleQualifiedName ) ) ( (lv_Interfce_8_0= rulepublicinterfaeceDef ) ) ( (lv_ArchTraits_9_0= ruletraitDeclaration ) )* )
            {
            // InternalSFDSL.g:114:2: ( () ( (lv_AbstractArchModel_1_0= ruleAbsArchDecl ) )* ( (lv_ConstiuenetSystemSDesign_2_0= ruleCSDecl ) )* ( (lv_MediatorDesign_3_0= ruleMedDecl ) )* ( (lv_ConcurrentConstraints_4_0= ruleCConsDecl ) )* ( (lv_ArchitecutreElementsBehaviors_5_0= ruleAElementsBehaviorRoutines ) )* otherlv_6= 'ModelElements' ( (lv_name_7_0= ruleQualifiedName ) ) ( (lv_Interfce_8_0= rulepublicinterfaeceDef ) ) ( (lv_ArchTraits_9_0= ruletraitDeclaration ) )* )
            // InternalSFDSL.g:115:3: () ( (lv_AbstractArchModel_1_0= ruleAbsArchDecl ) )* ( (lv_ConstiuenetSystemSDesign_2_0= ruleCSDecl ) )* ( (lv_MediatorDesign_3_0= ruleMedDecl ) )* ( (lv_ConcurrentConstraints_4_0= ruleCConsDecl ) )* ( (lv_ArchitecutreElementsBehaviors_5_0= ruleAElementsBehaviorRoutines ) )* otherlv_6= 'ModelElements' ( (lv_name_7_0= ruleQualifiedName ) ) ( (lv_Interfce_8_0= rulepublicinterfaeceDef ) ) ( (lv_ArchTraits_9_0= ruletraitDeclaration ) )*
            {
            // InternalSFDSL.g:115:3: ()
            // InternalSFDSL.g:116:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getModelElementsDecarationAccess().getModelElementsDecarationAction_0(),
              					current);
              			
            }

            }

            // InternalSFDSL.g:122:3: ( (lv_AbstractArchModel_1_0= ruleAbsArchDecl ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==50) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSFDSL.g:123:4: (lv_AbstractArchModel_1_0= ruleAbsArchDecl )
            	    {
            	    // InternalSFDSL.g:123:4: (lv_AbstractArchModel_1_0= ruleAbsArchDecl )
            	    // InternalSFDSL.g:124:5: lv_AbstractArchModel_1_0= ruleAbsArchDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelElementsDecarationAccess().getAbstractArchModelAbsArchDeclParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_AbstractArchModel_1_0=ruleAbsArchDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelElementsDecarationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"AbstractArchModel",
            	      						lv_AbstractArchModel_1_0,
            	      						"org.xtext.sosModeling.archModeling.SFDSL.AbsArchDecl");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSFDSL.g:141:3: ( (lv_ConstiuenetSystemSDesign_2_0= ruleCSDecl ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSFDSL.g:142:4: (lv_ConstiuenetSystemSDesign_2_0= ruleCSDecl )
            	    {
            	    // InternalSFDSL.g:142:4: (lv_ConstiuenetSystemSDesign_2_0= ruleCSDecl )
            	    // InternalSFDSL.g:143:5: lv_ConstiuenetSystemSDesign_2_0= ruleCSDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelElementsDecarationAccess().getConstiuenetSystemSDesignCSDeclParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_ConstiuenetSystemSDesign_2_0=ruleCSDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelElementsDecarationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ConstiuenetSystemSDesign",
            	      						lv_ConstiuenetSystemSDesign_2_0,
            	      						"org.xtext.sosModeling.archModeling.SFDSL.CSDecl");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalSFDSL.g:160:3: ( (lv_MediatorDesign_3_0= ruleMedDecl ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==48) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSFDSL.g:161:4: (lv_MediatorDesign_3_0= ruleMedDecl )
            	    {
            	    // InternalSFDSL.g:161:4: (lv_MediatorDesign_3_0= ruleMedDecl )
            	    // InternalSFDSL.g:162:5: lv_MediatorDesign_3_0= ruleMedDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelElementsDecarationAccess().getMediatorDesignMedDeclParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_MediatorDesign_3_0=ruleMedDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelElementsDecarationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"MediatorDesign",
            	      						lv_MediatorDesign_3_0,
            	      						"org.xtext.sosModeling.archModeling.SFDSL.MedDecl");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalSFDSL.g:179:3: ( (lv_ConcurrentConstraints_4_0= ruleCConsDecl ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=44 && LA4_0<=45)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSFDSL.g:180:4: (lv_ConcurrentConstraints_4_0= ruleCConsDecl )
            	    {
            	    // InternalSFDSL.g:180:4: (lv_ConcurrentConstraints_4_0= ruleCConsDecl )
            	    // InternalSFDSL.g:181:5: lv_ConcurrentConstraints_4_0= ruleCConsDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelElementsDecarationAccess().getConcurrentConstraintsCConsDeclParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_ConcurrentConstraints_4_0=ruleCConsDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelElementsDecarationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ConcurrentConstraints",
            	      						lv_ConcurrentConstraints_4_0,
            	      						"org.xtext.sosModeling.archModeling.SFDSL.CConsDecl");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalSFDSL.g:198:3: ( (lv_ArchitecutreElementsBehaviors_5_0= ruleAElementsBehaviorRoutines ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSFDSL.g:199:4: (lv_ArchitecutreElementsBehaviors_5_0= ruleAElementsBehaviorRoutines )
            	    {
            	    // InternalSFDSL.g:199:4: (lv_ArchitecutreElementsBehaviors_5_0= ruleAElementsBehaviorRoutines )
            	    // InternalSFDSL.g:200:5: lv_ArchitecutreElementsBehaviors_5_0= ruleAElementsBehaviorRoutines
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelElementsDecarationAccess().getArchitecutreElementsBehaviorsAElementsBehaviorRoutinesParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_ArchitecutreElementsBehaviors_5_0=ruleAElementsBehaviorRoutines();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelElementsDecarationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ArchitecutreElementsBehaviors",
            	      						lv_ArchitecutreElementsBehaviors_5_0,
            	      						"org.xtext.sosModeling.archModeling.SFDSL.AElementsBehaviorRoutines");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,11,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getModelElementsDecarationAccess().getModelElementsKeyword_6());
              		
            }
            // InternalSFDSL.g:221:3: ( (lv_name_7_0= ruleQualifiedName ) )
            // InternalSFDSL.g:222:4: (lv_name_7_0= ruleQualifiedName )
            {
            // InternalSFDSL.g:222:4: (lv_name_7_0= ruleQualifiedName )
            // InternalSFDSL.g:223:5: lv_name_7_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelElementsDecarationAccess().getNameQualifiedNameParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_name_7_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelElementsDecarationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_7_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:240:3: ( (lv_Interfce_8_0= rulepublicinterfaeceDef ) )
            // InternalSFDSL.g:241:4: (lv_Interfce_8_0= rulepublicinterfaeceDef )
            {
            // InternalSFDSL.g:241:4: (lv_Interfce_8_0= rulepublicinterfaeceDef )
            // InternalSFDSL.g:242:5: lv_Interfce_8_0= rulepublicinterfaeceDef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelElementsDecarationAccess().getInterfcePublicinterfaeceDefParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_Interfce_8_0=rulepublicinterfaeceDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelElementsDecarationRule());
              					}
              					add(
              						current,
              						"Interfce",
              						lv_Interfce_8_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.publicinterfaeceDef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:259:3: ( (lv_ArchTraits_9_0= ruletraitDeclaration ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==47) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSFDSL.g:260:4: (lv_ArchTraits_9_0= ruletraitDeclaration )
            	    {
            	    // InternalSFDSL.g:260:4: (lv_ArchTraits_9_0= ruletraitDeclaration )
            	    // InternalSFDSL.g:261:5: lv_ArchTraits_9_0= ruletraitDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelElementsDecarationAccess().getArchTraitsTraitDeclarationParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_ArchTraits_9_0=ruletraitDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelElementsDecarationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ArchTraits",
            	      						lv_ArchTraits_9_0,
            	      						"org.xtext.sosModeling.archModeling.SFDSL.traitDeclaration");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModelElementsDecaration"


    // $ANTLR start "entryRuleCSDecl"
    // InternalSFDSL.g:282:1: entryRuleCSDecl returns [EObject current=null] : iv_ruleCSDecl= ruleCSDecl EOF ;
    public final EObject entryRuleCSDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSDecl = null;


        try {
            // InternalSFDSL.g:282:47: (iv_ruleCSDecl= ruleCSDecl EOF )
            // InternalSFDSL.g:283:2: iv_ruleCSDecl= ruleCSDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCSDecl=ruleCSDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCSDecl"


    // $ANTLR start "ruleCSDecl"
    // InternalSFDSL.g:289:1: ruleCSDecl returns [EObject current=null] : (otherlv_0= 'Constituient-System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_CSDesignConsists_3_0= ruleCSMembersDefintion ) ) otherlv_4= '}' ) ;
    public final EObject ruleCSDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_CSDesignConsists_3_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:295:2: ( (otherlv_0= 'Constituient-System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_CSDesignConsists_3_0= ruleCSMembersDefintion ) ) otherlv_4= '}' ) )
            // InternalSFDSL.g:296:2: (otherlv_0= 'Constituient-System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_CSDesignConsists_3_0= ruleCSMembersDefintion ) ) otherlv_4= '}' )
            {
            // InternalSFDSL.g:296:2: (otherlv_0= 'Constituient-System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_CSDesignConsists_3_0= ruleCSMembersDefintion ) ) otherlv_4= '}' )
            // InternalSFDSL.g:297:3: otherlv_0= 'Constituient-System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_CSDesignConsists_3_0= ruleCSMembersDefintion ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCSDeclAccess().getConstituientSystemKeyword_0());
              		
            }
            // InternalSFDSL.g:301:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSFDSL.g:302:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSFDSL.g:302:4: (lv_name_1_0= RULE_ID )
            // InternalSFDSL.g:303:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getCSDeclAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCSDeclRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCSDeclAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalSFDSL.g:323:3: ( (lv_CSDesignConsists_3_0= ruleCSMembersDefintion ) )
            // InternalSFDSL.g:324:4: (lv_CSDesignConsists_3_0= ruleCSMembersDefintion )
            {
            // InternalSFDSL.g:324:4: (lv_CSDesignConsists_3_0= ruleCSMembersDefintion )
            // InternalSFDSL.g:325:5: lv_CSDesignConsists_3_0= ruleCSMembersDefintion
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCSDeclAccess().getCSDesignConsistsCSMembersDefintionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_CSDesignConsists_3_0=ruleCSMembersDefintion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCSDeclRule());
              					}
              					add(
              						current,
              						"CSDesignConsists",
              						lv_CSDesignConsists_3_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.CSMembersDefintion");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getCSDeclAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCSDecl"


    // $ANTLR start "entryRuleCSMembersDefintion"
    // InternalSFDSL.g:350:1: entryRuleCSMembersDefintion returns [EObject current=null] : iv_ruleCSMembersDefintion= ruleCSMembersDefintion EOF ;
    public final EObject entryRuleCSMembersDefintion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSMembersDefintion = null;


        try {
            // InternalSFDSL.g:350:59: (iv_ruleCSMembersDefintion= ruleCSMembersDefintion EOF )
            // InternalSFDSL.g:351:2: iv_ruleCSMembersDefintion= ruleCSMembersDefintion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSMembersDefintionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCSMembersDefintion=ruleCSMembersDefintion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSMembersDefintion; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCSMembersDefintion"


    // $ANTLR start "ruleCSMembersDefintion"
    // InternalSFDSL.g:357:1: ruleCSMembersDefintion returns [EObject current=null] : ( ( (lv_Ports_0_0= ruleProtDeclaration ) ) ( (lv_AActions_1_0= ruleAElementsBehaviorRoutines ) ) ( (lv_CSConConstraints_2_0= ruleCConsDecl ) )? ( (lv_CSCoreBehavior_3_0= ruleStochsticBehaviors ) )* ) ;
    public final EObject ruleCSMembersDefintion() throws RecognitionException {
        EObject current = null;

        EObject lv_Ports_0_0 = null;

        EObject lv_AActions_1_0 = null;

        EObject lv_CSConConstraints_2_0 = null;

        EObject lv_CSCoreBehavior_3_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:363:2: ( ( ( (lv_Ports_0_0= ruleProtDeclaration ) ) ( (lv_AActions_1_0= ruleAElementsBehaviorRoutines ) ) ( (lv_CSConConstraints_2_0= ruleCConsDecl ) )? ( (lv_CSCoreBehavior_3_0= ruleStochsticBehaviors ) )* ) )
            // InternalSFDSL.g:364:2: ( ( (lv_Ports_0_0= ruleProtDeclaration ) ) ( (lv_AActions_1_0= ruleAElementsBehaviorRoutines ) ) ( (lv_CSConConstraints_2_0= ruleCConsDecl ) )? ( (lv_CSCoreBehavior_3_0= ruleStochsticBehaviors ) )* )
            {
            // InternalSFDSL.g:364:2: ( ( (lv_Ports_0_0= ruleProtDeclaration ) ) ( (lv_AActions_1_0= ruleAElementsBehaviorRoutines ) ) ( (lv_CSConConstraints_2_0= ruleCConsDecl ) )? ( (lv_CSCoreBehavior_3_0= ruleStochsticBehaviors ) )* )
            // InternalSFDSL.g:365:3: ( (lv_Ports_0_0= ruleProtDeclaration ) ) ( (lv_AActions_1_0= ruleAElementsBehaviorRoutines ) ) ( (lv_CSConConstraints_2_0= ruleCConsDecl ) )? ( (lv_CSCoreBehavior_3_0= ruleStochsticBehaviors ) )*
            {
            // InternalSFDSL.g:365:3: ( (lv_Ports_0_0= ruleProtDeclaration ) )
            // InternalSFDSL.g:366:4: (lv_Ports_0_0= ruleProtDeclaration )
            {
            // InternalSFDSL.g:366:4: (lv_Ports_0_0= ruleProtDeclaration )
            // InternalSFDSL.g:367:5: lv_Ports_0_0= ruleProtDeclaration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCSMembersDefintionAccess().getPortsProtDeclarationParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_Ports_0_0=ruleProtDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCSMembersDefintionRule());
              					}
              					add(
              						current,
              						"Ports",
              						lv_Ports_0_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.ProtDeclaration");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:384:3: ( (lv_AActions_1_0= ruleAElementsBehaviorRoutines ) )
            // InternalSFDSL.g:385:4: (lv_AActions_1_0= ruleAElementsBehaviorRoutines )
            {
            // InternalSFDSL.g:385:4: (lv_AActions_1_0= ruleAElementsBehaviorRoutines )
            // InternalSFDSL.g:386:5: lv_AActions_1_0= ruleAElementsBehaviorRoutines
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCSMembersDefintionAccess().getAActionsAElementsBehaviorRoutinesParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_AActions_1_0=ruleAElementsBehaviorRoutines();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCSMembersDefintionRule());
              					}
              					add(
              						current,
              						"AActions",
              						lv_AActions_1_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.AElementsBehaviorRoutines");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:403:3: ( (lv_CSConConstraints_2_0= ruleCConsDecl ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=44 && LA7_0<=45)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSFDSL.g:404:4: (lv_CSConConstraints_2_0= ruleCConsDecl )
                    {
                    // InternalSFDSL.g:404:4: (lv_CSConConstraints_2_0= ruleCConsDecl )
                    // InternalSFDSL.g:405:5: lv_CSConConstraints_2_0= ruleCConsDecl
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCSMembersDefintionAccess().getCSConConstraintsCConsDeclParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
                    lv_CSConConstraints_2_0=ruleCConsDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCSMembersDefintionRule());
                      					}
                      					add(
                      						current,
                      						"CSConConstraints",
                      						lv_CSConConstraints_2_0,
                      						"org.xtext.sosModeling.archModeling.SFDSL.CConsDecl");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSFDSL.g:422:3: ( (lv_CSCoreBehavior_3_0= ruleStochsticBehaviors ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSFDSL.g:423:4: (lv_CSCoreBehavior_3_0= ruleStochsticBehaviors )
            	    {
            	    // InternalSFDSL.g:423:4: (lv_CSCoreBehavior_3_0= ruleStochsticBehaviors )
            	    // InternalSFDSL.g:424:5: lv_CSCoreBehavior_3_0= ruleStochsticBehaviors
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCSMembersDefintionAccess().getCSCoreBehaviorStochsticBehaviorsParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_CSCoreBehavior_3_0=ruleStochsticBehaviors();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCSMembersDefintionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"CSCoreBehavior",
            	      						lv_CSCoreBehavior_3_0,
            	      						"org.xtext.sosModeling.archModeling.SFDSL.StochsticBehaviors");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCSMembersDefintion"


    // $ANTLR start "entryRuleStochsticBehaviors"
    // InternalSFDSL.g:445:1: entryRuleStochsticBehaviors returns [EObject current=null] : iv_ruleStochsticBehaviors= ruleStochsticBehaviors EOF ;
    public final EObject entryRuleStochsticBehaviors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStochsticBehaviors = null;


        try {
            // InternalSFDSL.g:445:59: (iv_ruleStochsticBehaviors= ruleStochsticBehaviors EOF )
            // InternalSFDSL.g:446:2: iv_ruleStochsticBehaviors= ruleStochsticBehaviors EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStochsticBehaviorsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStochsticBehaviors=ruleStochsticBehaviors();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStochsticBehaviors; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStochsticBehaviors"


    // $ANTLR start "ruleStochsticBehaviors"
    // InternalSFDSL.g:452:1: ruleStochsticBehaviors returns [EObject current=null] : (otherlv_0= 'CSbehaviorsis' otherlv_1= 'functinoalaity' ( (lv_type_2_0= ruletypes ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_paramsDecl_4_0= ruleformalParameters ) ) (otherlv_5= '[' otherlv_6= ']' )* otherlv_7= '{' ( (lv_functions_8_0= ruleAElementsBehaviorRoutines ) ) otherlv_9= '}' ) ;
    public final EObject ruleStochsticBehaviors() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;

        EObject lv_paramsDecl_4_0 = null;

        EObject lv_functions_8_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:458:2: ( (otherlv_0= 'CSbehaviorsis' otherlv_1= 'functinoalaity' ( (lv_type_2_0= ruletypes ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_paramsDecl_4_0= ruleformalParameters ) ) (otherlv_5= '[' otherlv_6= ']' )* otherlv_7= '{' ( (lv_functions_8_0= ruleAElementsBehaviorRoutines ) ) otherlv_9= '}' ) )
            // InternalSFDSL.g:459:2: (otherlv_0= 'CSbehaviorsis' otherlv_1= 'functinoalaity' ( (lv_type_2_0= ruletypes ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_paramsDecl_4_0= ruleformalParameters ) ) (otherlv_5= '[' otherlv_6= ']' )* otherlv_7= '{' ( (lv_functions_8_0= ruleAElementsBehaviorRoutines ) ) otherlv_9= '}' )
            {
            // InternalSFDSL.g:459:2: (otherlv_0= 'CSbehaviorsis' otherlv_1= 'functinoalaity' ( (lv_type_2_0= ruletypes ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_paramsDecl_4_0= ruleformalParameters ) ) (otherlv_5= '[' otherlv_6= ']' )* otherlv_7= '{' ( (lv_functions_8_0= ruleAElementsBehaviorRoutines ) ) otherlv_9= '}' )
            // InternalSFDSL.g:460:3: otherlv_0= 'CSbehaviorsis' otherlv_1= 'functinoalaity' ( (lv_type_2_0= ruletypes ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_paramsDecl_4_0= ruleformalParameters ) ) (otherlv_5= '[' otherlv_6= ']' )* otherlv_7= '{' ( (lv_functions_8_0= ruleAElementsBehaviorRoutines ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStochsticBehaviorsAccess().getCSbehaviorsisKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStochsticBehaviorsAccess().getFunctinoalaityKeyword_1());
              		
            }
            // InternalSFDSL.g:468:3: ( (lv_type_2_0= ruletypes ) )
            // InternalSFDSL.g:469:4: (lv_type_2_0= ruletypes )
            {
            // InternalSFDSL.g:469:4: (lv_type_2_0= ruletypes )
            // InternalSFDSL.g:470:5: lv_type_2_0= ruletypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStochsticBehaviorsAccess().getTypeTypesParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_type_2_0=ruletypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStochsticBehaviorsRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.types");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:487:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSFDSL.g:488:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSFDSL.g:488:4: (lv_name_3_0= RULE_ID )
            // InternalSFDSL.g:489:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getStochsticBehaviorsAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStochsticBehaviorsRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSFDSL.g:505:3: ( (lv_paramsDecl_4_0= ruleformalParameters ) )
            // InternalSFDSL.g:506:4: (lv_paramsDecl_4_0= ruleformalParameters )
            {
            // InternalSFDSL.g:506:4: (lv_paramsDecl_4_0= ruleformalParameters )
            // InternalSFDSL.g:507:5: lv_paramsDecl_4_0= ruleformalParameters
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStochsticBehaviorsAccess().getParamsDeclFormalParametersParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_paramsDecl_4_0=ruleformalParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStochsticBehaviorsRule());
              					}
              					set(
              						current,
              						"paramsDecl",
              						lv_paramsDecl_4_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.formalParameters");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:524:3: (otherlv_5= '[' otherlv_6= ']' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSFDSL.g:525:4: otherlv_5= '[' otherlv_6= ']'
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getStochsticBehaviorsAccess().getLeftSquareBracketKeyword_5_0());
            	      			
            	    }
            	    otherlv_6=(Token)match(input,18,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getStochsticBehaviorsAccess().getRightSquareBracketKeyword_5_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getStochsticBehaviorsAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalSFDSL.g:538:3: ( (lv_functions_8_0= ruleAElementsBehaviorRoutines ) )
            // InternalSFDSL.g:539:4: (lv_functions_8_0= ruleAElementsBehaviorRoutines )
            {
            // InternalSFDSL.g:539:4: (lv_functions_8_0= ruleAElementsBehaviorRoutines )
            // InternalSFDSL.g:540:5: lv_functions_8_0= ruleAElementsBehaviorRoutines
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStochsticBehaviorsAccess().getFunctionsAElementsBehaviorRoutinesParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_functions_8_0=ruleAElementsBehaviorRoutines();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStochsticBehaviorsRule());
              					}
              					add(
              						current,
              						"functions",
              						lv_functions_8_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.AElementsBehaviorRoutines");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getStochsticBehaviorsAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStochsticBehaviors"


    // $ANTLR start "entryRuleportandRoleType"
    // InternalSFDSL.g:565:1: entryRuleportandRoleType returns [String current=null] : iv_ruleportandRoleType= ruleportandRoleType EOF ;
    public final String entryRuleportandRoleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleportandRoleType = null;


        try {
            // InternalSFDSL.g:565:55: (iv_ruleportandRoleType= ruleportandRoleType EOF )
            // InternalSFDSL.g:566:2: iv_ruleportandRoleType= ruleportandRoleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPortandRoleTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleportandRoleType=ruleportandRoleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleportandRoleType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleportandRoleType"


    // $ANTLR start "ruleportandRoleType"
    // InternalSFDSL.g:572:1: ruleportandRoleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' | kw= 'requires' ) ;
    public final AntlrDatatypeRuleToken ruleportandRoleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSFDSL.g:578:2: ( (kw= 'provides' | kw= 'requires' ) )
            // InternalSFDSL.g:579:2: (kw= 'provides' | kw= 'requires' )
            {
            // InternalSFDSL.g:579:2: (kw= 'provides' | kw= 'requires' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            else if ( (LA10_0==20) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSFDSL.g:580:3: kw= 'provides'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPortandRoleTypeAccess().getProvidesKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSFDSL.g:586:3: kw= 'requires'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPortandRoleTypeAccess().getRequiresKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleportandRoleType"


    // $ANTLR start "entryRulepublicinterfaeceDef"
    // InternalSFDSL.g:595:1: entryRulepublicinterfaeceDef returns [EObject current=null] : iv_rulepublicinterfaeceDef= rulepublicinterfaeceDef EOF ;
    public final EObject entryRulepublicinterfaeceDef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepublicinterfaeceDef = null;


        try {
            // InternalSFDSL.g:595:60: (iv_rulepublicinterfaeceDef= rulepublicinterfaeceDef EOF )
            // InternalSFDSL.g:596:2: iv_rulepublicinterfaeceDef= rulepublicinterfaeceDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPublicinterfaeceDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulepublicinterfaeceDef=rulepublicinterfaeceDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepublicinterfaeceDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulepublicinterfaeceDef"


    // $ANTLR start "rulepublicinterfaeceDef"
    // InternalSFDSL.g:602:1: rulepublicinterfaeceDef returns [EObject current=null] : (otherlv_0= 'PublicInteface' ( (lv_Name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_paramsDecl_3_0= ruleformalParameters ) ) (otherlv_4= '[' otherlv_5= ']' )* otherlv_6= ';' ) ;
    public final EObject rulepublicinterfaeceDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_Name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_paramsDecl_3_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:608:2: ( (otherlv_0= 'PublicInteface' ( (lv_Name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_paramsDecl_3_0= ruleformalParameters ) ) (otherlv_4= '[' otherlv_5= ']' )* otherlv_6= ';' ) )
            // InternalSFDSL.g:609:2: (otherlv_0= 'PublicInteface' ( (lv_Name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_paramsDecl_3_0= ruleformalParameters ) ) (otherlv_4= '[' otherlv_5= ']' )* otherlv_6= ';' )
            {
            // InternalSFDSL.g:609:2: (otherlv_0= 'PublicInteface' ( (lv_Name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_paramsDecl_3_0= ruleformalParameters ) ) (otherlv_4= '[' otherlv_5= ']' )* otherlv_6= ';' )
            // InternalSFDSL.g:610:3: otherlv_0= 'PublicInteface' ( (lv_Name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_paramsDecl_3_0= ruleformalParameters ) ) (otherlv_4= '[' otherlv_5= ']' )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPublicinterfaeceDefAccess().getPublicIntefaceKeyword_0());
              		
            }
            // InternalSFDSL.g:614:3: ( (lv_Name_1_0= RULE_ID ) )
            // InternalSFDSL.g:615:4: (lv_Name_1_0= RULE_ID )
            {
            // InternalSFDSL.g:615:4: (lv_Name_1_0= RULE_ID )
            // InternalSFDSL.g:616:5: lv_Name_1_0= RULE_ID
            {
            lv_Name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_Name_1_0, grammarAccess.getPublicinterfaeceDefAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPublicinterfaeceDefRule());
              					}
              					setWithLastConsumed(
              						current,
              						"Name",
              						lv_Name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPublicinterfaeceDefAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalSFDSL.g:636:3: ( (lv_paramsDecl_3_0= ruleformalParameters ) )
            // InternalSFDSL.g:637:4: (lv_paramsDecl_3_0= ruleformalParameters )
            {
            // InternalSFDSL.g:637:4: (lv_paramsDecl_3_0= ruleformalParameters )
            // InternalSFDSL.g:638:5: lv_paramsDecl_3_0= ruleformalParameters
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPublicinterfaeceDefAccess().getParamsDeclFormalParametersParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_paramsDecl_3_0=ruleformalParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPublicinterfaeceDefRule());
              					}
              					set(
              						current,
              						"paramsDecl",
              						lv_paramsDecl_3_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.formalParameters");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:655:3: (otherlv_4= '[' otherlv_5= ']' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSFDSL.g:656:4: otherlv_4= '[' otherlv_5= ']'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getPublicinterfaeceDefAccess().getLeftSquareBracketKeyword_4_0());
            	      			
            	    }
            	    otherlv_5=(Token)match(input,18,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getPublicinterfaeceDefAccess().getRightSquareBracketKeyword_4_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getPublicinterfaeceDefAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulepublicinterfaeceDef"


    // $ANTLR start "entryRuleformalParameters"
    // InternalSFDSL.g:673:1: entryRuleformalParameters returns [EObject current=null] : iv_ruleformalParameters= ruleformalParameters EOF ;
    public final EObject entryRuleformalParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformalParameters = null;


        try {
            // InternalSFDSL.g:673:57: (iv_ruleformalParameters= ruleformalParameters EOF )
            // InternalSFDSL.g:674:2: iv_ruleformalParameters= ruleformalParameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalParametersRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleformalParameters=ruleformalParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleformalParameters; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleformalParameters"


    // $ANTLR start "ruleformalParameters"
    // InternalSFDSL.g:680:1: ruleformalParameters returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_paramsDecl_2_0= ruleformalParameterList ) )? otherlv_3= ')' ) ;
    public final EObject ruleformalParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_paramsDecl_2_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:686:2: ( ( () otherlv_1= '(' ( (lv_paramsDecl_2_0= ruleformalParameterList ) )? otherlv_3= ')' ) )
            // InternalSFDSL.g:687:2: ( () otherlv_1= '(' ( (lv_paramsDecl_2_0= ruleformalParameterList ) )? otherlv_3= ')' )
            {
            // InternalSFDSL.g:687:2: ( () otherlv_1= '(' ( (lv_paramsDecl_2_0= ruleformalParameterList ) )? otherlv_3= ')' )
            // InternalSFDSL.g:688:3: () otherlv_1= '(' ( (lv_paramsDecl_2_0= ruleformalParameterList ) )? otherlv_3= ')'
            {
            // InternalSFDSL.g:688:3: ()
            // InternalSFDSL.g:689:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFormalParametersAccess().getFormalParametersAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFormalParametersAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSFDSL.g:699:3: ( (lv_paramsDecl_2_0= ruleformalParameterList ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=53 && LA12_0<=58)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSFDSL.g:700:4: (lv_paramsDecl_2_0= ruleformalParameterList )
                    {
                    // InternalSFDSL.g:700:4: (lv_paramsDecl_2_0= ruleformalParameterList )
                    // InternalSFDSL.g:701:5: lv_paramsDecl_2_0= ruleformalParameterList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFormalParametersAccess().getParamsDeclFormalParameterListParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_24);
                    lv_paramsDecl_2_0=ruleformalParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFormalParametersRule());
                      					}
                      					add(
                      						current,
                      						"paramsDecl",
                      						lv_paramsDecl_2_0,
                      						"org.xtext.sosModeling.archModeling.SFDSL.formalParameterList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFormalParametersAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleformalParameters"


    // $ANTLR start "entryRuleformalParameterList"
    // InternalSFDSL.g:726:1: entryRuleformalParameterList returns [EObject current=null] : iv_ruleformalParameterList= ruleformalParameterList EOF ;
    public final EObject entryRuleformalParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformalParameterList = null;


        try {
            // InternalSFDSL.g:726:60: (iv_ruleformalParameterList= ruleformalParameterList EOF )
            // InternalSFDSL.g:727:2: iv_ruleformalParameterList= ruleformalParameterList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalParameterListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleformalParameterList=ruleformalParameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleformalParameterList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleformalParameterList"


    // $ANTLR start "ruleformalParameterList"
    // InternalSFDSL.g:733:1: ruleformalParameterList returns [EObject current=null] : ( ( (lv_paramDecl_0_0= ruleformalParameter ) ) otherlv_1= ',' ( (lv_paramsDecl_2_0= ruleformalParameter ) )* ) ;
    public final EObject ruleformalParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_paramDecl_0_0 = null;

        EObject lv_paramsDecl_2_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:739:2: ( ( ( (lv_paramDecl_0_0= ruleformalParameter ) ) otherlv_1= ',' ( (lv_paramsDecl_2_0= ruleformalParameter ) )* ) )
            // InternalSFDSL.g:740:2: ( ( (lv_paramDecl_0_0= ruleformalParameter ) ) otherlv_1= ',' ( (lv_paramsDecl_2_0= ruleformalParameter ) )* )
            {
            // InternalSFDSL.g:740:2: ( ( (lv_paramDecl_0_0= ruleformalParameter ) ) otherlv_1= ',' ( (lv_paramsDecl_2_0= ruleformalParameter ) )* )
            // InternalSFDSL.g:741:3: ( (lv_paramDecl_0_0= ruleformalParameter ) ) otherlv_1= ',' ( (lv_paramsDecl_2_0= ruleformalParameter ) )*
            {
            // InternalSFDSL.g:741:3: ( (lv_paramDecl_0_0= ruleformalParameter ) )
            // InternalSFDSL.g:742:4: (lv_paramDecl_0_0= ruleformalParameter )
            {
            // InternalSFDSL.g:742:4: (lv_paramDecl_0_0= ruleformalParameter )
            // InternalSFDSL.g:743:5: lv_paramDecl_0_0= ruleformalParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFormalParameterListAccess().getParamDeclFormalParameterParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_paramDecl_0_0=ruleformalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFormalParameterListRule());
              					}
              					set(
              						current,
              						"paramDecl",
              						lv_paramDecl_0_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.formalParameter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFormalParameterListAccess().getCommaKeyword_1());
              		
            }
            // InternalSFDSL.g:764:3: ( (lv_paramsDecl_2_0= ruleformalParameter ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=53 && LA13_0<=58)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSFDSL.g:765:4: (lv_paramsDecl_2_0= ruleformalParameter )
            	    {
            	    // InternalSFDSL.g:765:4: (lv_paramsDecl_2_0= ruleformalParameter )
            	    // InternalSFDSL.g:766:5: lv_paramsDecl_2_0= ruleformalParameter
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFormalParameterListAccess().getParamsDeclFormalParameterParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_paramsDecl_2_0=ruleformalParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFormalParameterListRule());
            	      					}
            	      					add(
            	      						current,
            	      						"paramsDecl",
            	      						lv_paramsDecl_2_0,
            	      						"org.xtext.sosModeling.archModeling.SFDSL.formalParameter");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleformalParameterList"


    // $ANTLR start "entryRuleformalParameter"
    // InternalSFDSL.g:787:1: entryRuleformalParameter returns [EObject current=null] : iv_ruleformalParameter= ruleformalParameter EOF ;
    public final EObject entryRuleformalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformalParameter = null;


        try {
            // InternalSFDSL.g:787:56: (iv_ruleformalParameter= ruleformalParameter EOF )
            // InternalSFDSL.g:788:2: iv_ruleformalParameter= ruleformalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleformalParameter=ruleformalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleformalParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleformalParameter"


    // $ANTLR start "ruleformalParameter"
    // InternalSFDSL.g:794:1: ruleformalParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruletypes ) ) ( (lv_name_1_0= rulevariableDeclaratorId ) ) ) ;
    public final EObject ruleformalParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:800:2: ( ( ( (lv_type_0_0= ruletypes ) ) ( (lv_name_1_0= rulevariableDeclaratorId ) ) ) )
            // InternalSFDSL.g:801:2: ( ( (lv_type_0_0= ruletypes ) ) ( (lv_name_1_0= rulevariableDeclaratorId ) ) )
            {
            // InternalSFDSL.g:801:2: ( ( (lv_type_0_0= ruletypes ) ) ( (lv_name_1_0= rulevariableDeclaratorId ) ) )
            // InternalSFDSL.g:802:3: ( (lv_type_0_0= ruletypes ) ) ( (lv_name_1_0= rulevariableDeclaratorId ) )
            {
            // InternalSFDSL.g:802:3: ( (lv_type_0_0= ruletypes ) )
            // InternalSFDSL.g:803:4: (lv_type_0_0= ruletypes )
            {
            // InternalSFDSL.g:803:4: (lv_type_0_0= ruletypes )
            // InternalSFDSL.g:804:5: lv_type_0_0= ruletypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFormalParameterAccess().getTypeTypesParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_type_0_0=ruletypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFormalParameterRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.types");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:821:3: ( (lv_name_1_0= rulevariableDeclaratorId ) )
            // InternalSFDSL.g:822:4: (lv_name_1_0= rulevariableDeclaratorId )
            {
            // InternalSFDSL.g:822:4: (lv_name_1_0= rulevariableDeclaratorId )
            // InternalSFDSL.g:823:5: lv_name_1_0= rulevariableDeclaratorId
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFormalParameterAccess().getNameVariableDeclaratorIdParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_1_0=rulevariableDeclaratorId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFormalParameterRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.variableDeclaratorId");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleformalParameter"


    // $ANTLR start "entryRulevariableDeclaratorId"
    // InternalSFDSL.g:844:1: entryRulevariableDeclaratorId returns [EObject current=null] : iv_rulevariableDeclaratorId= rulevariableDeclaratorId EOF ;
    public final EObject entryRulevariableDeclaratorId() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariableDeclaratorId = null;


        try {
            // InternalSFDSL.g:844:61: (iv_rulevariableDeclaratorId= rulevariableDeclaratorId EOF )
            // InternalSFDSL.g:845:2: iv_rulevariableDeclaratorId= rulevariableDeclaratorId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclaratorIdRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevariableDeclaratorId=rulevariableDeclaratorId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariableDeclaratorId; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulevariableDeclaratorId"


    // $ANTLR start "rulevariableDeclaratorId"
    // InternalSFDSL.g:851:1: rulevariableDeclaratorId returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' otherlv_2= ']' )* otherlv_3= '}' ) ;
    public final EObject rulevariableDeclaratorId() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSFDSL.g:857:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' otherlv_2= ']' )* otherlv_3= '}' ) )
            // InternalSFDSL.g:858:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' otherlv_2= ']' )* otherlv_3= '}' )
            {
            // InternalSFDSL.g:858:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' otherlv_2= ']' )* otherlv_3= '}' )
            // InternalSFDSL.g:859:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' otherlv_2= ']' )* otherlv_3= '}'
            {
            // InternalSFDSL.g:859:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSFDSL.g:860:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSFDSL.g:860:4: (lv_name_0_0= RULE_ID )
            // InternalSFDSL.g:861:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getVariableDeclaratorIdAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVariableDeclaratorIdRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSFDSL.g:877:3: (otherlv_1= '[' otherlv_2= ']' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSFDSL.g:878:4: otherlv_1= '[' otherlv_2= ']'
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getVariableDeclaratorIdAccess().getLeftSquareBracketKeyword_1_0());
            	      			
            	    }
            	    otherlv_2=(Token)match(input,18,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getVariableDeclaratorIdAccess().getRightSquareBracketKeyword_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVariableDeclaratorIdAccess().getRightCurlyBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulevariableDeclaratorId"


    // $ANTLR start "entryRuleProtDeclaration"
    // InternalSFDSL.g:895:1: entryRuleProtDeclaration returns [EObject current=null] : iv_ruleProtDeclaration= ruleProtDeclaration EOF ;
    public final EObject entryRuleProtDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtDeclaration = null;


        try {
            // InternalSFDSL.g:895:56: (iv_ruleProtDeclaration= ruleProtDeclaration EOF )
            // InternalSFDSL.g:896:2: iv_ruleProtDeclaration= ruleProtDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtDeclaration=ruleProtDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProtDeclaration"


    // $ANTLR start "ruleProtDeclaration"
    // InternalSFDSL.g:902:1: ruleProtDeclaration returns [EObject current=null] : ( () ( (lv_porttype_1_0= ruleportandRoleType ) ) otherlv_2= 'port' ( (otherlv_3= RULE_ID ) ) ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject ruleProtDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        AntlrDatatypeRuleToken lv_porttype_1_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:908:2: ( ( () ( (lv_porttype_1_0= ruleportandRoleType ) ) otherlv_2= 'port' ( (otherlv_3= RULE_ID ) ) ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalSFDSL.g:909:2: ( () ( (lv_porttype_1_0= ruleportandRoleType ) ) otherlv_2= 'port' ( (otherlv_3= RULE_ID ) ) ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalSFDSL.g:909:2: ( () ( (lv_porttype_1_0= ruleportandRoleType ) ) otherlv_2= 'port' ( (otherlv_3= RULE_ID ) ) ( (lv_name_4_0= RULE_ID ) ) )
            // InternalSFDSL.g:910:3: () ( (lv_porttype_1_0= ruleportandRoleType ) ) otherlv_2= 'port' ( (otherlv_3= RULE_ID ) ) ( (lv_name_4_0= RULE_ID ) )
            {
            // InternalSFDSL.g:910:3: ()
            // InternalSFDSL.g:911:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtDeclarationAccess().getProtDeclarationAction_0(),
              					current);
              			
            }

            }

            // InternalSFDSL.g:917:3: ( (lv_porttype_1_0= ruleportandRoleType ) )
            // InternalSFDSL.g:918:4: (lv_porttype_1_0= ruleportandRoleType )
            {
            // InternalSFDSL.g:918:4: (lv_porttype_1_0= ruleportandRoleType )
            // InternalSFDSL.g:919:5: lv_porttype_1_0= ruleportandRoleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProtDeclarationAccess().getPorttypePortandRoleTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_porttype_1_0=ruleportandRoleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProtDeclarationRule());
              					}
              					set(
              						current,
              						"porttype",
              						lv_porttype_1_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.portandRoleType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtDeclarationAccess().getPortKeyword_2());
              		
            }
            // InternalSFDSL.g:940:3: ( (otherlv_3= RULE_ID ) )
            // InternalSFDSL.g:941:4: (otherlv_3= RULE_ID )
            {
            // InternalSFDSL.g:941:4: (otherlv_3= RULE_ID )
            // InternalSFDSL.g:942:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getProtDeclarationRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getProtDeclarationAccess().getPubliicIntractionpointarePublicinterfaeceDefCrossReference_3_0());
              				
            }

            }


            }

            // InternalSFDSL.g:953:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalSFDSL.g:954:4: (lv_name_4_0= RULE_ID )
            {
            // InternalSFDSL.g:954:4: (lv_name_4_0= RULE_ID )
            // InternalSFDSL.g:955:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getProtDeclarationAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getProtDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProtDeclaration"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSFDSL.g:975:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSFDSL.g:975:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSFDSL.g:976:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSFDSL.g:982:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' (this_ID_2= RULE_ID )* ) ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSFDSL.g:988:2: ( (this_ID_0= RULE_ID (kw= '.' (this_ID_2= RULE_ID )* ) ) )
            // InternalSFDSL.g:989:2: (this_ID_0= RULE_ID (kw= '.' (this_ID_2= RULE_ID )* ) )
            {
            // InternalSFDSL.g:989:2: (this_ID_0= RULE_ID (kw= '.' (this_ID_2= RULE_ID )* ) )
            // InternalSFDSL.g:990:3: this_ID_0= RULE_ID (kw= '.' (this_ID_2= RULE_ID )* )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalSFDSL.g:997:3: (kw= '.' (this_ID_2= RULE_ID )* )
            // InternalSFDSL.g:998:4: kw= '.' (this_ID_2= RULE_ID )*
            {
            kw=(Token)match(input,27,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(kw);
              				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
              			
            }
            // InternalSFDSL.g:1003:4: (this_ID_2= RULE_ID )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSFDSL.g:1004:5: this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(this_ID_2);
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      				
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleAElementsBehaviorRoutines"
    // InternalSFDSL.g:1017:1: entryRuleAElementsBehaviorRoutines returns [EObject current=null] : iv_ruleAElementsBehaviorRoutines= ruleAElementsBehaviorRoutines EOF ;
    public final EObject entryRuleAElementsBehaviorRoutines() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAElementsBehaviorRoutines = null;


        try {
            // InternalSFDSL.g:1017:66: (iv_ruleAElementsBehaviorRoutines= ruleAElementsBehaviorRoutines EOF )
            // InternalSFDSL.g:1018:2: iv_ruleAElementsBehaviorRoutines= ruleAElementsBehaviorRoutines EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAElementsBehaviorRoutinesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAElementsBehaviorRoutines=ruleAElementsBehaviorRoutines();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAElementsBehaviorRoutines; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAElementsBehaviorRoutines"


    // $ANTLR start "ruleAElementsBehaviorRoutines"
    // InternalSFDSL.g:1024:1: ruleAElementsBehaviorRoutines returns [EObject current=null] : ( () ( (lv_CollaborativeActions_1_0= ruleCColActions ) )+ ( (lv_CaolitionBinding_2_0= ruleattachCSs ) ) ( (lv_RemoveElements_3_0= ruledetachCSs ) ) ( (lv_ConnectElenents_4_0= ruleBindElements ) ) ( (lv_ControlDecisions_5_0= ruleControlDecisions ) ) ( (lv_ActionReates_6_0= ruleExponentialRates ) ) ( (lv_AddElements_7_0= ruleAddAElements ) ) ( (lv_HSFtypes_8_0= ruleExpression ) ) ) ;
    public final EObject ruleAElementsBehaviorRoutines() throws RecognitionException {
        EObject current = null;

        EObject lv_CollaborativeActions_1_0 = null;

        EObject lv_CaolitionBinding_2_0 = null;

        EObject lv_RemoveElements_3_0 = null;

        EObject lv_ConnectElenents_4_0 = null;

        EObject lv_ControlDecisions_5_0 = null;

        EObject lv_ActionReates_6_0 = null;

        EObject lv_AddElements_7_0 = null;

        EObject lv_HSFtypes_8_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:1030:2: ( ( () ( (lv_CollaborativeActions_1_0= ruleCColActions ) )+ ( (lv_CaolitionBinding_2_0= ruleattachCSs ) ) ( (lv_RemoveElements_3_0= ruledetachCSs ) ) ( (lv_ConnectElenents_4_0= ruleBindElements ) ) ( (lv_ControlDecisions_5_0= ruleControlDecisions ) ) ( (lv_ActionReates_6_0= ruleExponentialRates ) ) ( (lv_AddElements_7_0= ruleAddAElements ) ) ( (lv_HSFtypes_8_0= ruleExpression ) ) ) )
            // InternalSFDSL.g:1031:2: ( () ( (lv_CollaborativeActions_1_0= ruleCColActions ) )+ ( (lv_CaolitionBinding_2_0= ruleattachCSs ) ) ( (lv_RemoveElements_3_0= ruledetachCSs ) ) ( (lv_ConnectElenents_4_0= ruleBindElements ) ) ( (lv_ControlDecisions_5_0= ruleControlDecisions ) ) ( (lv_ActionReates_6_0= ruleExponentialRates ) ) ( (lv_AddElements_7_0= ruleAddAElements ) ) ( (lv_HSFtypes_8_0= ruleExpression ) ) )
            {
            // InternalSFDSL.g:1031:2: ( () ( (lv_CollaborativeActions_1_0= ruleCColActions ) )+ ( (lv_CaolitionBinding_2_0= ruleattachCSs ) ) ( (lv_RemoveElements_3_0= ruledetachCSs ) ) ( (lv_ConnectElenents_4_0= ruleBindElements ) ) ( (lv_ControlDecisions_5_0= ruleControlDecisions ) ) ( (lv_ActionReates_6_0= ruleExponentialRates ) ) ( (lv_AddElements_7_0= ruleAddAElements ) ) ( (lv_HSFtypes_8_0= ruleExpression ) ) )
            // InternalSFDSL.g:1032:3: () ( (lv_CollaborativeActions_1_0= ruleCColActions ) )+ ( (lv_CaolitionBinding_2_0= ruleattachCSs ) ) ( (lv_RemoveElements_3_0= ruledetachCSs ) ) ( (lv_ConnectElenents_4_0= ruleBindElements ) ) ( (lv_ControlDecisions_5_0= ruleControlDecisions ) ) ( (lv_ActionReates_6_0= ruleExponentialRates ) ) ( (lv_AddElements_7_0= ruleAddAElements ) ) ( (lv_HSFtypes_8_0= ruleExpression ) )
            {
            // InternalSFDSL.g:1032:3: ()
            // InternalSFDSL.g:1033:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAElementsBehaviorRoutinesAccess().getAElementsBehaviorRoutinesAction_0(),
              					current);
              			
            }

            }

            // InternalSFDSL.g:1039:3: ( (lv_CollaborativeActions_1_0= ruleCColActions ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSFDSL.g:1040:4: (lv_CollaborativeActions_1_0= ruleCColActions )
            	    {
            	    // InternalSFDSL.g:1040:4: (lv_CollaborativeActions_1_0= ruleCColActions )
            	    // InternalSFDSL.g:1041:5: lv_CollaborativeActions_1_0= ruleCColActions
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAElementsBehaviorRoutinesAccess().getCollaborativeActionsCColActionsParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_CollaborativeActions_1_0=ruleCColActions();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAElementsBehaviorRoutinesRule());
            	      					}
            	      					add(
            	      						current,
            	      						"CollaborativeActions",
            	      						lv_CollaborativeActions_1_0,
            	      						"org.xtext.sosModeling.archModeling.SFDSL.CColActions");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            // InternalSFDSL.g:1058:3: ( (lv_CaolitionBinding_2_0= ruleattachCSs ) )
            // InternalSFDSL.g:1059:4: (lv_CaolitionBinding_2_0= ruleattachCSs )
            {
            // InternalSFDSL.g:1059:4: (lv_CaolitionBinding_2_0= ruleattachCSs )
            // InternalSFDSL.g:1060:5: lv_CaolitionBinding_2_0= ruleattachCSs
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAElementsBehaviorRoutinesAccess().getCaolitionBindingAttachCSsParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_32);
            lv_CaolitionBinding_2_0=ruleattachCSs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAElementsBehaviorRoutinesRule());
              					}
              					add(
              						current,
              						"CaolitionBinding",
              						lv_CaolitionBinding_2_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.attachCSs");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:1077:3: ( (lv_RemoveElements_3_0= ruledetachCSs ) )
            // InternalSFDSL.g:1078:4: (lv_RemoveElements_3_0= ruledetachCSs )
            {
            // InternalSFDSL.g:1078:4: (lv_RemoveElements_3_0= ruledetachCSs )
            // InternalSFDSL.g:1079:5: lv_RemoveElements_3_0= ruledetachCSs
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAElementsBehaviorRoutinesAccess().getRemoveElementsDetachCSsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_RemoveElements_3_0=ruledetachCSs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAElementsBehaviorRoutinesRule());
              					}
              					add(
              						current,
              						"RemoveElements",
              						lv_RemoveElements_3_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.detachCSs");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:1096:3: ( (lv_ConnectElenents_4_0= ruleBindElements ) )
            // InternalSFDSL.g:1097:4: (lv_ConnectElenents_4_0= ruleBindElements )
            {
            // InternalSFDSL.g:1097:4: (lv_ConnectElenents_4_0= ruleBindElements )
            // InternalSFDSL.g:1098:5: lv_ConnectElenents_4_0= ruleBindElements
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAElementsBehaviorRoutinesAccess().getConnectElenentsBindElementsParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_34);
            lv_ConnectElenents_4_0=ruleBindElements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAElementsBehaviorRoutinesRule());
              					}
              					add(
              						current,
              						"ConnectElenents",
              						lv_ConnectElenents_4_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.BindElements");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:1115:3: ( (lv_ControlDecisions_5_0= ruleControlDecisions ) )
            // InternalSFDSL.g:1116:4: (lv_ControlDecisions_5_0= ruleControlDecisions )
            {
            // InternalSFDSL.g:1116:4: (lv_ControlDecisions_5_0= ruleControlDecisions )
            // InternalSFDSL.g:1117:5: lv_ControlDecisions_5_0= ruleControlDecisions
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAElementsBehaviorRoutinesAccess().getControlDecisionsControlDecisionsParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_ControlDecisions_5_0=ruleControlDecisions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAElementsBehaviorRoutinesRule());
              					}
              					add(
              						current,
              						"ControlDecisions",
              						lv_ControlDecisions_5_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.ControlDecisions");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:1134:3: ( (lv_ActionReates_6_0= ruleExponentialRates ) )
            // InternalSFDSL.g:1135:4: (lv_ActionReates_6_0= ruleExponentialRates )
            {
            // InternalSFDSL.g:1135:4: (lv_ActionReates_6_0= ruleExponentialRates )
            // InternalSFDSL.g:1136:5: lv_ActionReates_6_0= ruleExponentialRates
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAElementsBehaviorRoutinesAccess().getActionReatesExponentialRatesParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_36);
            lv_ActionReates_6_0=ruleExponentialRates();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAElementsBehaviorRoutinesRule());
              					}
              					add(
              						current,
              						"ActionReates",
              						lv_ActionReates_6_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.ExponentialRates");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:1153:3: ( (lv_AddElements_7_0= ruleAddAElements ) )
            // InternalSFDSL.g:1154:4: (lv_AddElements_7_0= ruleAddAElements )
            {
            // InternalSFDSL.g:1154:4: (lv_AddElements_7_0= ruleAddAElements )
            // InternalSFDSL.g:1155:5: lv_AddElements_7_0= ruleAddAElements
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAElementsBehaviorRoutinesAccess().getAddElementsAddAElementsParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_AddElements_7_0=ruleAddAElements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAElementsBehaviorRoutinesRule());
              					}
              					add(
              						current,
              						"AddElements",
              						lv_AddElements_7_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.AddAElements");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:1172:3: ( (lv_HSFtypes_8_0= ruleExpression ) )
            // InternalSFDSL.g:1173:4: (lv_HSFtypes_8_0= ruleExpression )
            {
            // InternalSFDSL.g:1173:4: (lv_HSFtypes_8_0= ruleExpression )
            // InternalSFDSL.g:1174:5: lv_HSFtypes_8_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAElementsBehaviorRoutinesAccess().getHSFtypesExpressionParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_HSFtypes_8_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAElementsBehaviorRoutinesRule());
              					}
              					set(
              						current,
              						"HSFtypes",
              						lv_HSFtypes_8_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAElementsBehaviorRoutines"


    // $ANTLR start "entryRuleCColActions"
    // InternalSFDSL.g:1195:1: entryRuleCColActions returns [EObject current=null] : iv_ruleCColActions= ruleCColActions EOF ;
    public final EObject entryRuleCColActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCColActions = null;


        try {
            // InternalSFDSL.g:1195:52: (iv_ruleCColActions= ruleCColActions EOF )
            // InternalSFDSL.g:1196:2: iv_ruleCColActions= ruleCColActions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCColActionsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCColActions=ruleCColActions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCColActions; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCColActions"


    // $ANTLR start "ruleCColActions"
    // InternalSFDSL.g:1202:1: ruleCColActions returns [EObject current=null] : (otherlv_0= 'Collaborate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruletypes ) ) ( (lv_paramsDecl_3_0= ruleformalParameters ) ) (otherlv_4= '[' otherlv_5= ']' )* otherlv_6= '{' ( (lv_methodBody_7_0= rulefunctinality ) )+ otherlv_8= '}' ) ;
    public final EObject ruleCColActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;

        EObject lv_paramsDecl_3_0 = null;

        EObject lv_methodBody_7_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:1208:2: ( (otherlv_0= 'Collaborate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruletypes ) ) ( (lv_paramsDecl_3_0= ruleformalParameters ) ) (otherlv_4= '[' otherlv_5= ']' )* otherlv_6= '{' ( (lv_methodBody_7_0= rulefunctinality ) )+ otherlv_8= '}' ) )
            // InternalSFDSL.g:1209:2: (otherlv_0= 'Collaborate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruletypes ) ) ( (lv_paramsDecl_3_0= ruleformalParameters ) ) (otherlv_4= '[' otherlv_5= ']' )* otherlv_6= '{' ( (lv_methodBody_7_0= rulefunctinality ) )+ otherlv_8= '}' )
            {
            // InternalSFDSL.g:1209:2: (otherlv_0= 'Collaborate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruletypes ) ) ( (lv_paramsDecl_3_0= ruleformalParameters ) ) (otherlv_4= '[' otherlv_5= ']' )* otherlv_6= '{' ( (lv_methodBody_7_0= rulefunctinality ) )+ otherlv_8= '}' )
            // InternalSFDSL.g:1210:3: otherlv_0= 'Collaborate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruletypes ) ) ( (lv_paramsDecl_3_0= ruleformalParameters ) ) (otherlv_4= '[' otherlv_5= ']' )* otherlv_6= '{' ( (lv_methodBody_7_0= rulefunctinality ) )+ otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCColActionsAccess().getCollaborateKeyword_0());
              		
            }
            // InternalSFDSL.g:1214:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSFDSL.g:1215:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSFDSL.g:1215:4: (lv_name_1_0= RULE_ID )
            // InternalSFDSL.g:1216:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getCColActionsAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCColActionsRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSFDSL.g:1232:3: ( (lv_type_2_0= ruletypes ) )
            // InternalSFDSL.g:1233:4: (lv_type_2_0= ruletypes )
            {
            // InternalSFDSL.g:1233:4: (lv_type_2_0= ruletypes )
            // InternalSFDSL.g:1234:5: lv_type_2_0= ruletypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCColActionsAccess().getTypeTypesParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_type_2_0=ruletypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCColActionsRule());
              					}
              					add(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.types");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:1251:3: ( (lv_paramsDecl_3_0= ruleformalParameters ) )
            // InternalSFDSL.g:1252:4: (lv_paramsDecl_3_0= ruleformalParameters )
            {
            // InternalSFDSL.g:1252:4: (lv_paramsDecl_3_0= ruleformalParameters )
            // InternalSFDSL.g:1253:5: lv_paramsDecl_3_0= ruleformalParameters
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCColActionsAccess().getParamsDeclFormalParametersParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_paramsDecl_3_0=ruleformalParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCColActionsRule());
              					}
              					add(
              						current,
              						"paramsDecl",
              						lv_paramsDecl_3_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.formalParameters");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:1270:3: (otherlv_4= '[' otherlv_5= ']' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==17) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSFDSL.g:1271:4: otherlv_4= '[' otherlv_5= ']'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getCColActionsAccess().getLeftSquareBracketKeyword_4_0());
            	      			
            	    }
            	    otherlv_5=(Token)match(input,18,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getCColActionsAccess().getRightSquareBracketKeyword_4_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getCColActionsAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalSFDSL.g:1284:3: ( (lv_methodBody_7_0= rulefunctinality ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==28) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSFDSL.g:1285:4: (lv_methodBody_7_0= rulefunctinality )
            	    {
            	    // InternalSFDSL.g:1285:4: (lv_methodBody_7_0= rulefunctinality )
            	    // InternalSFDSL.g:1286:5: lv_methodBody_7_0= rulefunctinality
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCColActionsAccess().getMethodBodyFunctinalityParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_38);
            	    lv_methodBody_7_0=rulefunctinality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCColActionsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"methodBody",
            	      						lv_methodBody_7_0,
            	      						"org.xtext.sosModeling.archModeling.SFDSL.functinality");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getCColActionsAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCColActions"


    // $ANTLR start "entryRulefunctinality"
    // InternalSFDSL.g:1311:1: entryRulefunctinality returns [EObject current=null] : iv_rulefunctinality= rulefunctinality EOF ;
    public final EObject entryRulefunctinality() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunctinality = null;


        try {
            // InternalSFDSL.g:1311:53: (iv_rulefunctinality= rulefunctinality EOF )
            // InternalSFDSL.g:1312:2: iv_rulefunctinality= rulefunctinality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctinalityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefunctinality=rulefunctinality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunctinality; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulefunctinality"


    // $ANTLR start "rulefunctinality"
    // InternalSFDSL.g:1318:1: rulefunctinality returns [EObject current=null] : ( () ( (lv_functions_1_0= ruleAElementsBehaviorRoutines ) )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject rulefunctinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_functions_1_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:1324:2: ( ( () ( (lv_functions_1_0= ruleAElementsBehaviorRoutines ) )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalSFDSL.g:1325:2: ( () ( (lv_functions_1_0= ruleAElementsBehaviorRoutines ) )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalSFDSL.g:1325:2: ( () ( (lv_functions_1_0= ruleAElementsBehaviorRoutines ) )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )
            // InternalSFDSL.g:1326:3: () ( (lv_functions_1_0= ruleAElementsBehaviorRoutines ) )* ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) )
            {
            // InternalSFDSL.g:1326:3: ()
            // InternalSFDSL.g:1327:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFunctinalityAccess().getFunctinalityAction_0(),
              					current);
              			
            }

            }

            // InternalSFDSL.g:1333:3: ( (lv_functions_1_0= ruleAElementsBehaviorRoutines ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSFDSL.g:1334:4: (lv_functions_1_0= ruleAElementsBehaviorRoutines )
            	    {
            	    // InternalSFDSL.g:1334:4: (lv_functions_1_0= ruleAElementsBehaviorRoutines )
            	    // InternalSFDSL.g:1335:5: lv_functions_1_0= ruleAElementsBehaviorRoutines
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFunctinalityAccess().getFunctionsAElementsBehaviorRoutinesParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_37);
            	    lv_functions_1_0=ruleAElementsBehaviorRoutines();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFunctinalityRule());
            	      					}
            	      					add(
            	      						current,
            	      						"functions",
            	      						lv_functions_1_0,
            	      						"org.xtext.sosModeling.archModeling.SFDSL.AElementsBehaviorRoutines");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalSFDSL.g:1352:3: ( (otherlv_2= RULE_ID ) )
            // InternalSFDSL.g:1353:4: (otherlv_2= RULE_ID )
            {
            // InternalSFDSL.g:1353:4: (otherlv_2= RULE_ID )
            // InternalSFDSL.g:1354:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctinalityRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getFunctinalityAccess().getActionsFunctinalityCrossReference_2_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFunctinalityAccess().getFullStopKeyword_3());
              		
            }
            // InternalSFDSL.g:1369:3: ( (otherlv_4= RULE_ID ) )
            // InternalSFDSL.g:1370:4: (otherlv_4= RULE_ID )
            {
            // InternalSFDSL.g:1370:4: (otherlv_4= RULE_ID )
            // InternalSFDSL.g:1371:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctinalityRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getFunctinalityAccess().getTargetExponentialRatesCrossReference_4_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulefunctinality"


    // $ANTLR start "entryRuleAddAElements"
    // InternalSFDSL.g:1386:1: entryRuleAddAElements returns [EObject current=null] : iv_ruleAddAElements= ruleAddAElements EOF ;
    public final EObject entryRuleAddAElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddAElements = null;


        try {
            // InternalSFDSL.g:1386:53: (iv_ruleAddAElements= ruleAddAElements EOF )
            // InternalSFDSL.g:1387:2: iv_ruleAddAElements= ruleAddAElements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddAElementsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddAElements=ruleAddAElements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddAElements; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAddAElements"


    // $ANTLR start "ruleAddAElements"
    // InternalSFDSL.g:1393:1: ruleAddAElements returns [EObject current=null] : ( () otherlv_1= 'instance' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'new' ( (lv_type_5_0= RULE_ID ) ) otherlv_6= '()' otherlv_7= ';' ) ;
    public final EObject ruleAddAElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalSFDSL.g:1399:2: ( ( () otherlv_1= 'instance' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'new' ( (lv_type_5_0= RULE_ID ) ) otherlv_6= '()' otherlv_7= ';' ) )
            // InternalSFDSL.g:1400:2: ( () otherlv_1= 'instance' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'new' ( (lv_type_5_0= RULE_ID ) ) otherlv_6= '()' otherlv_7= ';' )
            {
            // InternalSFDSL.g:1400:2: ( () otherlv_1= 'instance' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'new' ( (lv_type_5_0= RULE_ID ) ) otherlv_6= '()' otherlv_7= ';' )
            // InternalSFDSL.g:1401:3: () otherlv_1= 'instance' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'new' ( (lv_type_5_0= RULE_ID ) ) otherlv_6= '()' otherlv_7= ';'
            {
            // InternalSFDSL.g:1401:3: ()
            // InternalSFDSL.g:1402:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAddAElementsAccess().getAddAElementsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAddAElementsAccess().getInstanceKeyword_1());
              		
            }
            // InternalSFDSL.g:1412:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSFDSL.g:1413:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSFDSL.g:1413:4: (lv_name_2_0= RULE_ID )
            // InternalSFDSL.g:1414:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getAddAElementsAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAddAElementsRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAddAElementsAccess().getEqualsSignKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,31,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAddAElementsAccess().getNewKeyword_4());
              		
            }
            // InternalSFDSL.g:1438:3: ( (lv_type_5_0= RULE_ID ) )
            // InternalSFDSL.g:1439:4: (lv_type_5_0= RULE_ID )
            {
            // InternalSFDSL.g:1439:4: (lv_type_5_0= RULE_ID )
            // InternalSFDSL.g:1440:5: lv_type_5_0= RULE_ID
            {
            lv_type_5_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_type_5_0, grammarAccess.getAddAElementsAccess().getTypeIDTerminalRuleCall_5_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAddAElementsRule());
              					}
              					setWithLastConsumed(
              						current,
              						"type",
              						lv_type_5_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_6=(Token)match(input,32,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getAddAElementsAccess().getLeftParenthesisRightParenthesisKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getAddAElementsAccess().getSemicolonKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAddAElements"


    // $ANTLR start "entryRuleattachCSs"
    // InternalSFDSL.g:1468:1: entryRuleattachCSs returns [EObject current=null] : iv_ruleattachCSs= ruleattachCSs EOF ;
    public final EObject entryRuleattachCSs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleattachCSs = null;


        try {
            // InternalSFDSL.g:1468:50: (iv_ruleattachCSs= ruleattachCSs EOF )
            // InternalSFDSL.g:1469:2: iv_ruleattachCSs= ruleattachCSs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttachCSsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleattachCSs=ruleattachCSs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleattachCSs; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleattachCSs"


    // $ANTLR start "ruleattachCSs"
    // InternalSFDSL.g:1475:1: ruleattachCSs returns [EObject current=null] : (otherlv_0= 'attach' otherlv_1= '(' ( (lv_attachParam1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_attachParam2_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleattachCSs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_attachParam1_2_0 = null;

        EObject lv_attachParam2_4_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:1481:2: ( (otherlv_0= 'attach' otherlv_1= '(' ( (lv_attachParam1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_attachParam2_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalSFDSL.g:1482:2: (otherlv_0= 'attach' otherlv_1= '(' ( (lv_attachParam1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_attachParam2_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalSFDSL.g:1482:2: (otherlv_0= 'attach' otherlv_1= '(' ( (lv_attachParam1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_attachParam2_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalSFDSL.g:1483:3: otherlv_0= 'attach' otherlv_1= '(' ( (lv_attachParam1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_attachParam2_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAttachCSsAccess().getAttachKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,23,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAttachCSsAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSFDSL.g:1491:3: ( (lv_attachParam1_2_0= ruleExpression ) )
            // InternalSFDSL.g:1492:4: (lv_attachParam1_2_0= ruleExpression )
            {
            // InternalSFDSL.g:1492:4: (lv_attachParam1_2_0= ruleExpression )
            // InternalSFDSL.g:1493:5: lv_attachParam1_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttachCSsAccess().getAttachParam1ExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_attachParam1_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttachCSsRule());
              					}
              					add(
              						current,
              						"attachParam1",
              						lv_attachParam1_2_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAttachCSsAccess().getCommaKeyword_3());
              		
            }
            // InternalSFDSL.g:1514:3: ( (lv_attachParam2_4_0= ruleExpression ) )
            // InternalSFDSL.g:1515:4: (lv_attachParam2_4_0= ruleExpression )
            {
            // InternalSFDSL.g:1515:4: (lv_attachParam2_4_0= ruleExpression )
            // InternalSFDSL.g:1516:5: lv_attachParam2_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttachCSsAccess().getAttachParam2ExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_attachParam2_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttachCSsRule());
              					}
              					add(
              						current,
              						"attachParam2",
              						lv_attachParam2_4_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAttachCSsAccess().getRightParenthesisKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getAttachCSsAccess().getSemicolonKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleattachCSs"


    // $ANTLR start "entryRuledetachCSs"
    // InternalSFDSL.g:1545:1: entryRuledetachCSs returns [EObject current=null] : iv_ruledetachCSs= ruledetachCSs EOF ;
    public final EObject entryRuledetachCSs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledetachCSs = null;


        try {
            // InternalSFDSL.g:1545:50: (iv_ruledetachCSs= ruledetachCSs EOF )
            // InternalSFDSL.g:1546:2: iv_ruledetachCSs= ruledetachCSs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDetachCSsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledetachCSs=ruledetachCSs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledetachCSs; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuledetachCSs"


    // $ANTLR start "ruledetachCSs"
    // InternalSFDSL.g:1552:1: ruledetachCSs returns [EObject current=null] : ( () otherlv_1= 'detach' otherlv_2= '(' ( (lv_detachParam1_3_0= ruleExpression ) ) otherlv_4= ',' ( (lv_detachParam2_5_0= ruleExpression ) ) otherlv_6= ')' otherlv_7= ';' ) ;
    public final EObject ruledetachCSs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_detachParam1_3_0 = null;

        EObject lv_detachParam2_5_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:1558:2: ( ( () otherlv_1= 'detach' otherlv_2= '(' ( (lv_detachParam1_3_0= ruleExpression ) ) otherlv_4= ',' ( (lv_detachParam2_5_0= ruleExpression ) ) otherlv_6= ')' otherlv_7= ';' ) )
            // InternalSFDSL.g:1559:2: ( () otherlv_1= 'detach' otherlv_2= '(' ( (lv_detachParam1_3_0= ruleExpression ) ) otherlv_4= ',' ( (lv_detachParam2_5_0= ruleExpression ) ) otherlv_6= ')' otherlv_7= ';' )
            {
            // InternalSFDSL.g:1559:2: ( () otherlv_1= 'detach' otherlv_2= '(' ( (lv_detachParam1_3_0= ruleExpression ) ) otherlv_4= ',' ( (lv_detachParam2_5_0= ruleExpression ) ) otherlv_6= ')' otherlv_7= ';' )
            // InternalSFDSL.g:1560:3: () otherlv_1= 'detach' otherlv_2= '(' ( (lv_detachParam1_3_0= ruleExpression ) ) otherlv_4= ',' ( (lv_detachParam2_5_0= ruleExpression ) ) otherlv_6= ')' otherlv_7= ';'
            {
            // InternalSFDSL.g:1560:3: ()
            // InternalSFDSL.g:1561:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDetachCSsAccess().getDetachCSsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDetachCSsAccess().getDetachKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDetachCSsAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalSFDSL.g:1575:3: ( (lv_detachParam1_3_0= ruleExpression ) )
            // InternalSFDSL.g:1576:4: (lv_detachParam1_3_0= ruleExpression )
            {
            // InternalSFDSL.g:1576:4: (lv_detachParam1_3_0= ruleExpression )
            // InternalSFDSL.g:1577:5: lv_detachParam1_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDetachCSsAccess().getDetachParam1ExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_detachParam1_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDetachCSsRule());
              					}
              					add(
              						current,
              						"detachParam1",
              						lv_detachParam1_3_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDetachCSsAccess().getCommaKeyword_4());
              		
            }
            // InternalSFDSL.g:1598:3: ( (lv_detachParam2_5_0= ruleExpression ) )
            // InternalSFDSL.g:1599:4: (lv_detachParam2_5_0= ruleExpression )
            {
            // InternalSFDSL.g:1599:4: (lv_detachParam2_5_0= ruleExpression )
            // InternalSFDSL.g:1600:5: lv_detachParam2_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDetachCSsAccess().getDetachParam2ExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_detachParam2_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDetachCSsRule());
              					}
              					add(
              						current,
              						"detachParam2",
              						lv_detachParam2_5_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDetachCSsAccess().getRightParenthesisKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDetachCSsAccess().getSemicolonKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruledetachCSs"


    // $ANTLR start "entryRuleBindElements"
    // InternalSFDSL.g:1629:1: entryRuleBindElements returns [EObject current=null] : iv_ruleBindElements= ruleBindElements EOF ;
    public final EObject entryRuleBindElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindElements = null;


        try {
            // InternalSFDSL.g:1629:53: (iv_ruleBindElements= ruleBindElements EOF )
            // InternalSFDSL.g:1630:2: iv_ruleBindElements= ruleBindElements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindElementsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBindElements=ruleBindElements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBindElements; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBindElements"


    // $ANTLR start "ruleBindElements"
    // InternalSFDSL.g:1636:1: ruleBindElements returns [EObject current=null] : ( () otherlv_1= 'bind' otherlv_2= '(' ( (lv_bindParam1_3_0= ruleExpression ) ) otherlv_4= ',' ( (lv_bindParam2_5_0= ruleExpression ) ) otherlv_6= ')' otherlv_7= ';' ) ;
    public final EObject ruleBindElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_bindParam1_3_0 = null;

        EObject lv_bindParam2_5_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:1642:2: ( ( () otherlv_1= 'bind' otherlv_2= '(' ( (lv_bindParam1_3_0= ruleExpression ) ) otherlv_4= ',' ( (lv_bindParam2_5_0= ruleExpression ) ) otherlv_6= ')' otherlv_7= ';' ) )
            // InternalSFDSL.g:1643:2: ( () otherlv_1= 'bind' otherlv_2= '(' ( (lv_bindParam1_3_0= ruleExpression ) ) otherlv_4= ',' ( (lv_bindParam2_5_0= ruleExpression ) ) otherlv_6= ')' otherlv_7= ';' )
            {
            // InternalSFDSL.g:1643:2: ( () otherlv_1= 'bind' otherlv_2= '(' ( (lv_bindParam1_3_0= ruleExpression ) ) otherlv_4= ',' ( (lv_bindParam2_5_0= ruleExpression ) ) otherlv_6= ')' otherlv_7= ';' )
            // InternalSFDSL.g:1644:3: () otherlv_1= 'bind' otherlv_2= '(' ( (lv_bindParam1_3_0= ruleExpression ) ) otherlv_4= ',' ( (lv_bindParam2_5_0= ruleExpression ) ) otherlv_6= ')' otherlv_7= ';'
            {
            // InternalSFDSL.g:1644:3: ()
            // InternalSFDSL.g:1645:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBindElementsAccess().getBindElementsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBindElementsAccess().getBindKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBindElementsAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalSFDSL.g:1659:3: ( (lv_bindParam1_3_0= ruleExpression ) )
            // InternalSFDSL.g:1660:4: (lv_bindParam1_3_0= ruleExpression )
            {
            // InternalSFDSL.g:1660:4: (lv_bindParam1_3_0= ruleExpression )
            // InternalSFDSL.g:1661:5: lv_bindParam1_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBindElementsAccess().getBindParam1ExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_bindParam1_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBindElementsRule());
              					}
              					add(
              						current,
              						"bindParam1",
              						lv_bindParam1_3_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBindElementsAccess().getCommaKeyword_4());
              		
            }
            // InternalSFDSL.g:1682:3: ( (lv_bindParam2_5_0= ruleExpression ) )
            // InternalSFDSL.g:1683:4: (lv_bindParam2_5_0= ruleExpression )
            {
            // InternalSFDSL.g:1683:4: (lv_bindParam2_5_0= ruleExpression )
            // InternalSFDSL.g:1684:5: lv_bindParam2_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBindElementsAccess().getBindParam2ExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_bindParam2_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBindElementsRule());
              					}
              					add(
              						current,
              						"bindParam2",
              						lv_bindParam2_5_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getBindElementsAccess().getRightParenthesisKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getBindElementsAccess().getSemicolonKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBindElements"


    // $ANTLR start "entryRuleControlDecisions"
    // InternalSFDSL.g:1713:1: entryRuleControlDecisions returns [EObject current=null] : iv_ruleControlDecisions= ruleControlDecisions EOF ;
    public final EObject entryRuleControlDecisions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlDecisions = null;


        try {
            // InternalSFDSL.g:1713:57: (iv_ruleControlDecisions= ruleControlDecisions EOF )
            // InternalSFDSL.g:1714:2: iv_ruleControlDecisions= ruleControlDecisions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getControlDecisionsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleControlDecisions=ruleControlDecisions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleControlDecisions; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleControlDecisions"


    // $ANTLR start "ruleControlDecisions"
    // InternalSFDSL.g:1720:1: ruleControlDecisions returns [EObject current=null] : ( () otherlv_1= 'Decide' otherlv_2= '{' (otherlv_3= 'if' ( (lv_expressionDecl_4_0= ruleAElementsBehaviorRoutines ) ) otherlv_5= '=>' )? ( (lv_statementDecl1_6_0= ruleAElementsBehaviorRoutines ) )+ otherlv_7= '}' (otherlv_8= 'or' otherlv_9= '{' (otherlv_10= 'else' ( ( ( ruleAElementsBehaviorRoutines ) )=> (lv_expressionOrDecl_11_0= ruleAElementsBehaviorRoutines ) ) otherlv_12= '=>' )? ( (lv_statementDecl2_13_0= ruleAElementsBehaviorRoutines ) )+ otherlv_14= '}' )* otherlv_15= 'end;' (otherlv_16= 'iterate' otherlv_17= '{' ( ( ( ruleAElementsBehaviorRoutines ) )=> (lv_expressionOrDecl_18_0= ruleAElementsBehaviorRoutines ) ) otherlv_19= '=>' )? ( (lv_statementDecl2_20_0= ruleAElementsBehaviorRoutines ) )+ otherlv_21= '}' ) ;
    public final EObject ruleControlDecisions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_expressionDecl_4_0 = null;

        EObject lv_statementDecl1_6_0 = null;

        EObject lv_expressionOrDecl_11_0 = null;

        EObject lv_statementDecl2_13_0 = null;

        EObject lv_expressionOrDecl_18_0 = null;

        EObject lv_statementDecl2_20_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:1726:2: ( ( () otherlv_1= 'Decide' otherlv_2= '{' (otherlv_3= 'if' ( (lv_expressionDecl_4_0= ruleAElementsBehaviorRoutines ) ) otherlv_5= '=>' )? ( (lv_statementDecl1_6_0= ruleAElementsBehaviorRoutines ) )+ otherlv_7= '}' (otherlv_8= 'or' otherlv_9= '{' (otherlv_10= 'else' ( ( ( ruleAElementsBehaviorRoutines ) )=> (lv_expressionOrDecl_11_0= ruleAElementsBehaviorRoutines ) ) otherlv_12= '=>' )? ( (lv_statementDecl2_13_0= ruleAElementsBehaviorRoutines ) )+ otherlv_14= '}' )* otherlv_15= 'end;' (otherlv_16= 'iterate' otherlv_17= '{' ( ( ( ruleAElementsBehaviorRoutines ) )=> (lv_expressionOrDecl_18_0= ruleAElementsBehaviorRoutines ) ) otherlv_19= '=>' )? ( (lv_statementDecl2_20_0= ruleAElementsBehaviorRoutines ) )+ otherlv_21= '}' ) )
            // InternalSFDSL.g:1727:2: ( () otherlv_1= 'Decide' otherlv_2= '{' (otherlv_3= 'if' ( (lv_expressionDecl_4_0= ruleAElementsBehaviorRoutines ) ) otherlv_5= '=>' )? ( (lv_statementDecl1_6_0= ruleAElementsBehaviorRoutines ) )+ otherlv_7= '}' (otherlv_8= 'or' otherlv_9= '{' (otherlv_10= 'else' ( ( ( ruleAElementsBehaviorRoutines ) )=> (lv_expressionOrDecl_11_0= ruleAElementsBehaviorRoutines ) ) otherlv_12= '=>' )? ( (lv_statementDecl2_13_0= ruleAElementsBehaviorRoutines ) )+ otherlv_14= '}' )* otherlv_15= 'end;' (otherlv_16= 'iterate' otherlv_17= '{' ( ( ( ruleAElementsBehaviorRoutines ) )=> (lv_expressionOrDecl_18_0= ruleAElementsBehaviorRoutines ) ) otherlv_19= '=>' )? ( (lv_statementDecl2_20_0= ruleAElementsBehaviorRoutines ) )+ otherlv_21= '}' )
            {
            // InternalSFDSL.g:1727:2: ( () otherlv_1= 'Decide' otherlv_2= '{' (otherlv_3= 'if' ( (lv_expressionDecl_4_0= ruleAElementsBehaviorRoutines ) ) otherlv_5= '=>' )? ( (lv_statementDecl1_6_0= ruleAElementsBehaviorRoutines ) )+ otherlv_7= '}' (otherlv_8= 'or' otherlv_9= '{' (otherlv_10= 'else' ( ( ( ruleAElementsBehaviorRoutines ) )=> (lv_expressionOrDecl_11_0= ruleAElementsBehaviorRoutines ) ) otherlv_12= '=>' )? ( (lv_statementDecl2_13_0= ruleAElementsBehaviorRoutines ) )+ otherlv_14= '}' )* otherlv_15= 'end;' (otherlv_16= 'iterate' otherlv_17= '{' ( ( ( ruleAElementsBehaviorRoutines ) )=> (lv_expressionOrDecl_18_0= ruleAElementsBehaviorRoutines ) ) otherlv_19= '=>' )? ( (lv_statementDecl2_20_0= ruleAElementsBehaviorRoutines ) )+ otherlv_21= '}' )
            // InternalSFDSL.g:1728:3: () otherlv_1= 'Decide' otherlv_2= '{' (otherlv_3= 'if' ( (lv_expressionDecl_4_0= ruleAElementsBehaviorRoutines ) ) otherlv_5= '=>' )? ( (lv_statementDecl1_6_0= ruleAElementsBehaviorRoutines ) )+ otherlv_7= '}' (otherlv_8= 'or' otherlv_9= '{' (otherlv_10= 'else' ( ( ( ruleAElementsBehaviorRoutines ) )=> (lv_expressionOrDecl_11_0= ruleAElementsBehaviorRoutines ) ) otherlv_12= '=>' )? ( (lv_statementDecl2_13_0= ruleAElementsBehaviorRoutines ) )+ otherlv_14= '}' )* otherlv_15= 'end;' (otherlv_16= 'iterate' otherlv_17= '{' ( ( ( ruleAElementsBehaviorRoutines ) )=> (lv_expressionOrDecl_18_0= ruleAElementsBehaviorRoutines ) ) otherlv_19= '=>' )? ( (lv_statementDecl2_20_0= ruleAElementsBehaviorRoutines ) )+ otherlv_21= '}'
            {
            // InternalSFDSL.g:1728:3: ()
            // InternalSFDSL.g:1729:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getControlDecisionsAccess().getControlDecisionsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getControlDecisionsAccess().getDecideKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,13,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getControlDecisionsAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalSFDSL.g:1743:3: (otherlv_3= 'if' ( (lv_expressionDecl_4_0= ruleAElementsBehaviorRoutines ) ) otherlv_5= '=>' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSFDSL.g:1744:4: otherlv_3= 'if' ( (lv_expressionDecl_4_0= ruleAElementsBehaviorRoutines ) ) otherlv_5= '=>'
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getControlDecisionsAccess().getIfKeyword_3_0());
                      			
                    }
                    // InternalSFDSL.g:1748:4: ( (lv_expressionDecl_4_0= ruleAElementsBehaviorRoutines ) )
                    // InternalSFDSL.g:1749:5: (lv_expressionDecl_4_0= ruleAElementsBehaviorRoutines )
                    {
                    // InternalSFDSL.g:1749:5: (lv_expressionDecl_4_0= ruleAElementsBehaviorRoutines )
                    // InternalSFDSL.g:1750:6: lv_expressionDecl_4_0= ruleAElementsBehaviorRoutines
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getControlDecisionsAccess().getExpressionDeclAElementsBehaviorRoutinesParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_44);
                    lv_expressionDecl_4_0=ruleAElementsBehaviorRoutines();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getControlDecisionsRule());
                      						}
                      						set(
                      							current,
                      							"expressionDecl",
                      							lv_expressionDecl_4_0,
                      							"org.xtext.sosModeling.archModeling.SFDSL.AElementsBehaviorRoutines");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,38,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getControlDecisionsAccess().getEqualsSignGreaterThanSignKeyword_3_2());
                      			
                    }

                    }
                    break;

            }

            // InternalSFDSL.g:1772:3: ( (lv_statementDecl1_6_0= ruleAElementsBehaviorRoutines ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==28) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSFDSL.g:1773:4: (lv_statementDecl1_6_0= ruleAElementsBehaviorRoutines )
            	    {
            	    // InternalSFDSL.g:1773:4: (lv_statementDecl1_6_0= ruleAElementsBehaviorRoutines )
            	    // InternalSFDSL.g:1774:5: lv_statementDecl1_6_0= ruleAElementsBehaviorRoutines
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getControlDecisionsAccess().getStatementDecl1AElementsBehaviorRoutinesParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_statementDecl1_6_0=ruleAElementsBehaviorRoutines();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getControlDecisionsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statementDecl1",
            	      						lv_statementDecl1_6_0,
            	      						"org.xtext.sosModeling.archModeling.SFDSL.AElementsBehaviorRoutines");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getControlDecisionsAccess().getRightCurlyBracketKeyword_5());
              		
            }
            // InternalSFDSL.g:1795:3: (otherlv_8= 'or' otherlv_9= '{' (otherlv_10= 'else' ( ( ( ruleAElementsBehaviorRoutines ) )=> (lv_expressionOrDecl_11_0= ruleAElementsBehaviorRoutines ) ) otherlv_12= '=>' )? ( (lv_statementDecl2_13_0= ruleAElementsBehaviorRoutines ) )+ otherlv_14= '}' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSFDSL.g:1796:4: otherlv_8= 'or' otherlv_9= '{' (otherlv_10= 'else' ( ( ( ruleAElementsBehaviorRoutines ) )=> (lv_expressionOrDecl_11_0= ruleAElementsBehaviorRoutines ) ) otherlv_12= '=>' )? ( (lv_statementDecl2_13_0= ruleAElementsBehaviorRoutines ) )+ otherlv_14= '}'
            	    {
            	    otherlv_8=(Token)match(input,39,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_8, grammarAccess.getControlDecisionsAccess().getOrKeyword_6_0());
            	      			
            	    }
            	    otherlv_9=(Token)match(input,13,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_9, grammarAccess.getControlDecisionsAccess().getLeftCurlyBracketKeyword_6_1());
            	      			
            	    }
            	    // InternalSFDSL.g:1804:4: (otherlv_10= 'else' ( ( ( ruleAElementsBehaviorRoutines ) )=> (lv_expressionOrDecl_11_0= ruleAElementsBehaviorRoutines ) ) otherlv_12= '=>' )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==40) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalSFDSL.g:1805:5: otherlv_10= 'else' ( ( ( ruleAElementsBehaviorRoutines ) )=> (lv_expressionOrDecl_11_0= ruleAElementsBehaviorRoutines ) ) otherlv_12= '=>'
            	            {
            	            otherlv_10=(Token)match(input,40,FOLLOW_14); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_10, grammarAccess.getControlDecisionsAccess().getElseKeyword_6_2_0());
            	              				
            	            }
            	            // InternalSFDSL.g:1809:5: ( ( ( ruleAElementsBehaviorRoutines ) )=> (lv_expressionOrDecl_11_0= ruleAElementsBehaviorRoutines ) )
            	            // InternalSFDSL.g:1810:6: ( ( ruleAElementsBehaviorRoutines ) )=> (lv_expressionOrDecl_11_0= ruleAElementsBehaviorRoutines )
            	            {
            	            // InternalSFDSL.g:1814:6: (lv_expressionOrDecl_11_0= ruleAElementsBehaviorRoutines )
            	            // InternalSFDSL.g:1815:7: lv_expressionOrDecl_11_0= ruleAElementsBehaviorRoutines
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getControlDecisionsAccess().getExpressionOrDeclAElementsBehaviorRoutinesParserRuleCall_6_2_1_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_44);
            	            lv_expressionOrDecl_11_0=ruleAElementsBehaviorRoutines();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getControlDecisionsRule());
            	              							}
            	              							add(
            	              								current,
            	              								"expressionOrDecl",
            	              								lv_expressionOrDecl_11_0,
            	              								"org.xtext.sosModeling.archModeling.SFDSL.AElementsBehaviorRoutines");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }


            	            }

            	            otherlv_12=(Token)match(input,38,FOLLOW_14); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_12, grammarAccess.getControlDecisionsAccess().getEqualsSignGreaterThanSignKeyword_6_2_2());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalSFDSL.g:1837:4: ( (lv_statementDecl2_13_0= ruleAElementsBehaviorRoutines ) )+
            	    int cnt23=0;
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==28) ) {
            	            alt23=1;
            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // InternalSFDSL.g:1838:5: (lv_statementDecl2_13_0= ruleAElementsBehaviorRoutines )
            	    	    {
            	    	    // InternalSFDSL.g:1838:5: (lv_statementDecl2_13_0= ruleAElementsBehaviorRoutines )
            	    	    // InternalSFDSL.g:1839:6: lv_statementDecl2_13_0= ruleAElementsBehaviorRoutines
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      						newCompositeNode(grammarAccess.getControlDecisionsAccess().getStatementDecl2AElementsBehaviorRoutinesParserRuleCall_6_3_0());
            	    	      					
            	    	    }
            	    	    pushFollow(FOLLOW_45);
            	    	    lv_statementDecl2_13_0=ruleAElementsBehaviorRoutines();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						if (current==null) {
            	    	      							current = createModelElementForParent(grammarAccess.getControlDecisionsRule());
            	    	      						}
            	    	      						add(
            	    	      							current,
            	    	      							"statementDecl2",
            	    	      							lv_statementDecl2_13_0,
            	    	      							"org.xtext.sosModeling.archModeling.SFDSL.AElementsBehaviorRoutines");
            	    	      						afterParserOrEnumRuleCall();
            	    	      					
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt23 >= 1 ) break loop23;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(23, input);
            	                throw eee;
            	        }
            	        cnt23++;
            	    } while (true);

            	    otherlv_14=(Token)match(input,14,FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_14, grammarAccess.getControlDecisionsAccess().getRightCurlyBracketKeyword_6_4());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_15=(Token)match(input,41,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getControlDecisionsAccess().getEndKeyword_7());
              		
            }
            // InternalSFDSL.g:1865:3: (otherlv_16= 'iterate' otherlv_17= '{' ( ( ( ruleAElementsBehaviorRoutines ) )=> (lv_expressionOrDecl_18_0= ruleAElementsBehaviorRoutines ) ) otherlv_19= '=>' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSFDSL.g:1866:4: otherlv_16= 'iterate' otherlv_17= '{' ( ( ( ruleAElementsBehaviorRoutines ) )=> (lv_expressionOrDecl_18_0= ruleAElementsBehaviorRoutines ) ) otherlv_19= '=>'
                    {
                    otherlv_16=(Token)match(input,42,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getControlDecisionsAccess().getIterateKeyword_8_0());
                      			
                    }
                    otherlv_17=(Token)match(input,13,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getControlDecisionsAccess().getLeftCurlyBracketKeyword_8_1());
                      			
                    }
                    // InternalSFDSL.g:1874:4: ( ( ( ruleAElementsBehaviorRoutines ) )=> (lv_expressionOrDecl_18_0= ruleAElementsBehaviorRoutines ) )
                    // InternalSFDSL.g:1875:5: ( ( ruleAElementsBehaviorRoutines ) )=> (lv_expressionOrDecl_18_0= ruleAElementsBehaviorRoutines )
                    {
                    // InternalSFDSL.g:1879:5: (lv_expressionOrDecl_18_0= ruleAElementsBehaviorRoutines )
                    // InternalSFDSL.g:1880:6: lv_expressionOrDecl_18_0= ruleAElementsBehaviorRoutines
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getControlDecisionsAccess().getExpressionOrDeclAElementsBehaviorRoutinesParserRuleCall_8_2_0());
                      					
                    }
                    pushFollow(FOLLOW_44);
                    lv_expressionOrDecl_18_0=ruleAElementsBehaviorRoutines();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getControlDecisionsRule());
                      						}
                      						add(
                      							current,
                      							"expressionOrDecl",
                      							lv_expressionOrDecl_18_0,
                      							"org.xtext.sosModeling.archModeling.SFDSL.AElementsBehaviorRoutines");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_19=(Token)match(input,38,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getControlDecisionsAccess().getEqualsSignGreaterThanSignKeyword_8_3());
                      			
                    }

                    }
                    break;

            }

            // InternalSFDSL.g:1902:3: ( (lv_statementDecl2_20_0= ruleAElementsBehaviorRoutines ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==28) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSFDSL.g:1903:4: (lv_statementDecl2_20_0= ruleAElementsBehaviorRoutines )
            	    {
            	    // InternalSFDSL.g:1903:4: (lv_statementDecl2_20_0= ruleAElementsBehaviorRoutines )
            	    // InternalSFDSL.g:1904:5: lv_statementDecl2_20_0= ruleAElementsBehaviorRoutines
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getControlDecisionsAccess().getStatementDecl2AElementsBehaviorRoutinesParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_statementDecl2_20_0=ruleAElementsBehaviorRoutines();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getControlDecisionsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statementDecl2",
            	      						lv_statementDecl2_20_0,
            	      						"org.xtext.sosModeling.archModeling.SFDSL.AElementsBehaviorRoutines");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_21=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getControlDecisionsAccess().getRightCurlyBracketKeyword_10());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleControlDecisions"


    // $ANTLR start "entryRuleExponentialRates"
    // InternalSFDSL.g:1929:1: entryRuleExponentialRates returns [EObject current=null] : iv_ruleExponentialRates= ruleExponentialRates EOF ;
    public final EObject entryRuleExponentialRates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialRates = null;


        try {
            // InternalSFDSL.g:1929:57: (iv_ruleExponentialRates= ruleExponentialRates EOF )
            // InternalSFDSL.g:1930:2: iv_ruleExponentialRates= ruleExponentialRates EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialRatesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExponentialRates=ruleExponentialRates();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialRates; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExponentialRates"


    // $ANTLR start "ruleExponentialRates"
    // InternalSFDSL.g:1936:1: ruleExponentialRates returns [EObject current=null] : ( ( () otherlv_1= 'TRate' ( (lv_delayValue_2_0= RULE_INT ) ) otherlv_3= '.' this_INT_4= RULE_INT otherlv_5= ';' ) | ( (lv_ExponentialRates_6_0= ruleExpression ) ) ) ;
    public final EObject ruleExponentialRates() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_delayValue_2_0=null;
        Token otherlv_3=null;
        Token this_INT_4=null;
        Token otherlv_5=null;
        EObject lv_ExponentialRates_6_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:1942:2: ( ( ( () otherlv_1= 'TRate' ( (lv_delayValue_2_0= RULE_INT ) ) otherlv_3= '.' this_INT_4= RULE_INT otherlv_5= ';' ) | ( (lv_ExponentialRates_6_0= ruleExpression ) ) ) )
            // InternalSFDSL.g:1943:2: ( ( () otherlv_1= 'TRate' ( (lv_delayValue_2_0= RULE_INT ) ) otherlv_3= '.' this_INT_4= RULE_INT otherlv_5= ';' ) | ( (lv_ExponentialRates_6_0= ruleExpression ) ) )
            {
            // InternalSFDSL.g:1943:2: ( ( () otherlv_1= 'TRate' ( (lv_delayValue_2_0= RULE_INT ) ) otherlv_3= '.' this_INT_4= RULE_INT otherlv_5= ';' ) | ( (lv_ExponentialRates_6_0= ruleExpression ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==43) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_STRING)||LA27_0==23||(LA27_0>=59 && LA27_0<=60)||LA27_0==74) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalSFDSL.g:1944:3: ( () otherlv_1= 'TRate' ( (lv_delayValue_2_0= RULE_INT ) ) otherlv_3= '.' this_INT_4= RULE_INT otherlv_5= ';' )
                    {
                    // InternalSFDSL.g:1944:3: ( () otherlv_1= 'TRate' ( (lv_delayValue_2_0= RULE_INT ) ) otherlv_3= '.' this_INT_4= RULE_INT otherlv_5= ';' )
                    // InternalSFDSL.g:1945:4: () otherlv_1= 'TRate' ( (lv_delayValue_2_0= RULE_INT ) ) otherlv_3= '.' this_INT_4= RULE_INT otherlv_5= ';'
                    {
                    // InternalSFDSL.g:1945:4: ()
                    // InternalSFDSL.g:1946:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getExponentialRatesAccess().getExponentialRatesAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,43,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getExponentialRatesAccess().getTRateKeyword_0_1());
                      			
                    }
                    // InternalSFDSL.g:1956:4: ( (lv_delayValue_2_0= RULE_INT ) )
                    // InternalSFDSL.g:1957:5: (lv_delayValue_2_0= RULE_INT )
                    {
                    // InternalSFDSL.g:1957:5: (lv_delayValue_2_0= RULE_INT )
                    // InternalSFDSL.g:1958:6: lv_delayValue_2_0= RULE_INT
                    {
                    lv_delayValue_2_0=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_delayValue_2_0, grammarAccess.getExponentialRatesAccess().getDelayValueINTTerminalRuleCall_0_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExponentialRatesRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"delayValue",
                      							lv_delayValue_2_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,27,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getExponentialRatesAccess().getFullStopKeyword_0_3());
                      			
                    }
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_4, grammarAccess.getExponentialRatesAccess().getINTTerminalRuleCall_0_4());
                      			
                    }
                    otherlv_5=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getExponentialRatesAccess().getSemicolonKeyword_0_5());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSFDSL.g:1988:3: ( (lv_ExponentialRates_6_0= ruleExpression ) )
                    {
                    // InternalSFDSL.g:1988:3: ( (lv_ExponentialRates_6_0= ruleExpression ) )
                    // InternalSFDSL.g:1989:4: (lv_ExponentialRates_6_0= ruleExpression )
                    {
                    // InternalSFDSL.g:1989:4: (lv_ExponentialRates_6_0= ruleExpression )
                    // InternalSFDSL.g:1990:5: lv_ExponentialRates_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExponentialRatesAccess().getExponentialRatesExpressionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_ExponentialRates_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExponentialRatesRule());
                      					}
                      					set(
                      						current,
                      						"ExponentialRates",
                      						lv_ExponentialRates_6_0,
                      						"org.xtext.sosModeling.archModeling.SFDSL.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExponentialRates"


    // $ANTLR start "entryRuleCConsDecl"
    // InternalSFDSL.g:2011:1: entryRuleCConsDecl returns [EObject current=null] : iv_ruleCConsDecl= ruleCConsDecl EOF ;
    public final EObject entryRuleCConsDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCConsDecl = null;


        try {
            // InternalSFDSL.g:2011:50: (iv_ruleCConsDecl= ruleCConsDecl EOF )
            // InternalSFDSL.g:2012:2: iv_ruleCConsDecl= ruleCConsDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCConsDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCConsDecl=ruleCConsDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCConsDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCConsDecl"


    // $ANTLR start "ruleCConsDecl"
    // InternalSFDSL.g:2018:1: ruleCConsDecl returns [EObject current=null] : ( ( () otherlv_1= 'StochasticCconstraints' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Askconstraints_4_0= ruleAskopeator ) ) ) | ( ( (lv_Tellconstraints_5_0= ruleTelloperator ) ) otherlv_6= '}' ) ) ;
    public final EObject ruleCConsDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_Askconstraints_4_0 = null;

        EObject lv_Tellconstraints_5_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:2024:2: ( ( ( () otherlv_1= 'StochasticCconstraints' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Askconstraints_4_0= ruleAskopeator ) ) ) | ( ( (lv_Tellconstraints_5_0= ruleTelloperator ) ) otherlv_6= '}' ) ) )
            // InternalSFDSL.g:2025:2: ( ( () otherlv_1= 'StochasticCconstraints' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Askconstraints_4_0= ruleAskopeator ) ) ) | ( ( (lv_Tellconstraints_5_0= ruleTelloperator ) ) otherlv_6= '}' ) )
            {
            // InternalSFDSL.g:2025:2: ( ( () otherlv_1= 'StochasticCconstraints' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Askconstraints_4_0= ruleAskopeator ) ) ) | ( ( (lv_Tellconstraints_5_0= ruleTelloperator ) ) otherlv_6= '}' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==44) ) {
                alt28=1;
            }
            else if ( (LA28_0==45) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalSFDSL.g:2026:3: ( () otherlv_1= 'StochasticCconstraints' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Askconstraints_4_0= ruleAskopeator ) ) )
                    {
                    // InternalSFDSL.g:2026:3: ( () otherlv_1= 'StochasticCconstraints' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Askconstraints_4_0= ruleAskopeator ) ) )
                    // InternalSFDSL.g:2027:4: () otherlv_1= 'StochasticCconstraints' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Askconstraints_4_0= ruleAskopeator ) )
                    {
                    // InternalSFDSL.g:2027:4: ()
                    // InternalSFDSL.g:2028:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getCConsDeclAccess().getCConsDeclAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,44,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCConsDeclAccess().getStochasticCconstraintsKeyword_0_1());
                      			
                    }
                    // InternalSFDSL.g:2038:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalSFDSL.g:2039:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalSFDSL.g:2039:5: (lv_name_2_0= RULE_ID )
                    // InternalSFDSL.g:2040:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_2_0, grammarAccess.getCConsDeclAccess().getNameIDTerminalRuleCall_0_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCConsDeclRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,13,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getCConsDeclAccess().getLeftCurlyBracketKeyword_0_3());
                      			
                    }
                    // InternalSFDSL.g:2060:4: ( (lv_Askconstraints_4_0= ruleAskopeator ) )
                    // InternalSFDSL.g:2061:5: (lv_Askconstraints_4_0= ruleAskopeator )
                    {
                    // InternalSFDSL.g:2061:5: (lv_Askconstraints_4_0= ruleAskopeator )
                    // InternalSFDSL.g:2062:6: lv_Askconstraints_4_0= ruleAskopeator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCConsDeclAccess().getAskconstraintsAskopeatorParserRuleCall_0_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_Askconstraints_4_0=ruleAskopeator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCConsDeclRule());
                      						}
                      						add(
                      							current,
                      							"Askconstraints",
                      							lv_Askconstraints_4_0,
                      							"org.xtext.sosModeling.archModeling.SFDSL.Askopeator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSFDSL.g:2081:3: ( ( (lv_Tellconstraints_5_0= ruleTelloperator ) ) otherlv_6= '}' )
                    {
                    // InternalSFDSL.g:2081:3: ( ( (lv_Tellconstraints_5_0= ruleTelloperator ) ) otherlv_6= '}' )
                    // InternalSFDSL.g:2082:4: ( (lv_Tellconstraints_5_0= ruleTelloperator ) ) otherlv_6= '}'
                    {
                    // InternalSFDSL.g:2082:4: ( (lv_Tellconstraints_5_0= ruleTelloperator ) )
                    // InternalSFDSL.g:2083:5: (lv_Tellconstraints_5_0= ruleTelloperator )
                    {
                    // InternalSFDSL.g:2083:5: (lv_Tellconstraints_5_0= ruleTelloperator )
                    // InternalSFDSL.g:2084:6: lv_Tellconstraints_5_0= ruleTelloperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCConsDeclAccess().getTellconstraintsTelloperatorParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_Tellconstraints_5_0=ruleTelloperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCConsDeclRule());
                      						}
                      						add(
                      							current,
                      							"Tellconstraints",
                      							lv_Tellconstraints_5_0,
                      							"org.xtext.sosModeling.archModeling.SFDSL.Telloperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getCConsDeclAccess().getRightCurlyBracketKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCConsDecl"


    // $ANTLR start "entryRuleTelloperator"
    // InternalSFDSL.g:2110:1: entryRuleTelloperator returns [EObject current=null] : iv_ruleTelloperator= ruleTelloperator EOF ;
    public final EObject entryRuleTelloperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTelloperator = null;


        try {
            // InternalSFDSL.g:2110:53: (iv_ruleTelloperator= ruleTelloperator EOF )
            // InternalSFDSL.g:2111:2: iv_ruleTelloperator= ruleTelloperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTelloperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTelloperator=ruleTelloperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTelloperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTelloperator"


    // $ANTLR start "ruleTelloperator"
    // InternalSFDSL.g:2117:1: ruleTelloperator returns [EObject current=null] : ( () (otherlv_1= 'Tell' otherlv_2= '(' ( (lv_ConstraintShareDate_3_0= ruletypes ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) ) ;
    public final EObject ruleTelloperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_ConstraintShareDate_3_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:2123:2: ( ( () (otherlv_1= 'Tell' otherlv_2= '(' ( (lv_ConstraintShareDate_3_0= ruletypes ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) ) )
            // InternalSFDSL.g:2124:2: ( () (otherlv_1= 'Tell' otherlv_2= '(' ( (lv_ConstraintShareDate_3_0= ruletypes ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) )
            {
            // InternalSFDSL.g:2124:2: ( () (otherlv_1= 'Tell' otherlv_2= '(' ( (lv_ConstraintShareDate_3_0= ruletypes ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) )
            // InternalSFDSL.g:2125:3: () (otherlv_1= 'Tell' otherlv_2= '(' ( (lv_ConstraintShareDate_3_0= ruletypes ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' )
            {
            // InternalSFDSL.g:2125:3: ()
            // InternalSFDSL.g:2126:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTelloperatorAccess().getTelloperatorAction_0(),
              					current);
              			
            }

            }

            // InternalSFDSL.g:2132:3: (otherlv_1= 'Tell' otherlv_2= '(' ( (lv_ConstraintShareDate_3_0= ruletypes ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' )
            // InternalSFDSL.g:2133:4: otherlv_1= 'Tell' otherlv_2= '(' ( (lv_ConstraintShareDate_3_0= ruletypes ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')'
            {
            otherlv_1=(Token)match(input,45,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getTelloperatorAccess().getTellKeyword_1_0());
              			
            }
            otherlv_2=(Token)match(input,23,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getTelloperatorAccess().getLeftParenthesisKeyword_1_1());
              			
            }
            // InternalSFDSL.g:2141:4: ( (lv_ConstraintShareDate_3_0= ruletypes ) )
            // InternalSFDSL.g:2142:5: (lv_ConstraintShareDate_3_0= ruletypes )
            {
            // InternalSFDSL.g:2142:5: (lv_ConstraintShareDate_3_0= ruletypes )
            // InternalSFDSL.g:2143:6: lv_ConstraintShareDate_3_0= ruletypes
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getTelloperatorAccess().getConstraintShareDateTypesParserRuleCall_1_2_0());
              					
            }
            pushFollow(FOLLOW_29);
            lv_ConstraintShareDate_3_0=ruletypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getTelloperatorRule());
              						}
              						set(
              							current,
              							"ConstraintShareDate",
              							lv_ConstraintShareDate_3_0,
              							"org.xtext.sosModeling.archModeling.SFDSL.types");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getTelloperatorAccess().getFullStopKeyword_1_3());
              			
            }
            // InternalSFDSL.g:2164:4: ( (otherlv_5= RULE_ID ) )
            // InternalSFDSL.g:2165:5: (otherlv_5= RULE_ID )
            {
            // InternalSFDSL.g:2165:5: (otherlv_5= RULE_ID )
            // InternalSFDSL.g:2166:6: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getTelloperatorRule());
              						}
              					
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_5, grammarAccess.getTelloperatorAccess().getRateExponentialRatesCrossReference_1_4_0());
              					
            }

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_6, grammarAccess.getTelloperatorAccess().getRightParenthesisKeyword_1_5());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTelloperator"


    // $ANTLR start "entryRuleAskopeator"
    // InternalSFDSL.g:2186:1: entryRuleAskopeator returns [EObject current=null] : iv_ruleAskopeator= ruleAskopeator EOF ;
    public final EObject entryRuleAskopeator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAskopeator = null;


        try {
            // InternalSFDSL.g:2186:51: (iv_ruleAskopeator= ruleAskopeator EOF )
            // InternalSFDSL.g:2187:2: iv_ruleAskopeator= ruleAskopeator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAskopeatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAskopeator=ruleAskopeator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAskopeator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAskopeator"


    // $ANTLR start "ruleAskopeator"
    // InternalSFDSL.g:2193:1: ruleAskopeator returns [EObject current=null] : ( () (otherlv_1= 'Ask' otherlv_2= '(' ( (lv_ConstraintData_3_0= ruletypes ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) ) ;
    public final EObject ruleAskopeator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_ConstraintData_3_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:2199:2: ( ( () (otherlv_1= 'Ask' otherlv_2= '(' ( (lv_ConstraintData_3_0= ruletypes ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) ) )
            // InternalSFDSL.g:2200:2: ( () (otherlv_1= 'Ask' otherlv_2= '(' ( (lv_ConstraintData_3_0= ruletypes ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) )
            {
            // InternalSFDSL.g:2200:2: ( () (otherlv_1= 'Ask' otherlv_2= '(' ( (lv_ConstraintData_3_0= ruletypes ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) )
            // InternalSFDSL.g:2201:3: () (otherlv_1= 'Ask' otherlv_2= '(' ( (lv_ConstraintData_3_0= ruletypes ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' )
            {
            // InternalSFDSL.g:2201:3: ()
            // InternalSFDSL.g:2202:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAskopeatorAccess().getAskopeatorAction_0(),
              					current);
              			
            }

            }

            // InternalSFDSL.g:2208:3: (otherlv_1= 'Ask' otherlv_2= '(' ( (lv_ConstraintData_3_0= ruletypes ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' )
            // InternalSFDSL.g:2209:4: otherlv_1= 'Ask' otherlv_2= '(' ( (lv_ConstraintData_3_0= ruletypes ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')'
            {
            otherlv_1=(Token)match(input,46,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getAskopeatorAccess().getAskKeyword_1_0());
              			
            }
            otherlv_2=(Token)match(input,23,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getAskopeatorAccess().getLeftParenthesisKeyword_1_1());
              			
            }
            // InternalSFDSL.g:2217:4: ( (lv_ConstraintData_3_0= ruletypes ) )
            // InternalSFDSL.g:2218:5: (lv_ConstraintData_3_0= ruletypes )
            {
            // InternalSFDSL.g:2218:5: (lv_ConstraintData_3_0= ruletypes )
            // InternalSFDSL.g:2219:6: lv_ConstraintData_3_0= ruletypes
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getAskopeatorAccess().getConstraintDataTypesParserRuleCall_1_2_0());
              					
            }
            pushFollow(FOLLOW_29);
            lv_ConstraintData_3_0=ruletypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getAskopeatorRule());
              						}
              						set(
              							current,
              							"ConstraintData",
              							lv_ConstraintData_3_0,
              							"org.xtext.sosModeling.archModeling.SFDSL.types");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getAskopeatorAccess().getFullStopKeyword_1_3());
              			
            }
            // InternalSFDSL.g:2240:4: ( (otherlv_5= RULE_ID ) )
            // InternalSFDSL.g:2241:5: (otherlv_5= RULE_ID )
            {
            // InternalSFDSL.g:2241:5: (otherlv_5= RULE_ID )
            // InternalSFDSL.g:2242:6: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getAskopeatorRule());
              						}
              					
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_5, grammarAccess.getAskopeatorAccess().getRateExponentialRatesCrossReference_1_4_0());
              					
            }

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_6, grammarAccess.getAskopeatorAccess().getRightParenthesisKeyword_1_5());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAskopeator"


    // $ANTLR start "entryRuletraitDeclaration"
    // InternalSFDSL.g:2262:1: entryRuletraitDeclaration returns [EObject current=null] : iv_ruletraitDeclaration= ruletraitDeclaration EOF ;
    public final EObject entryRuletraitDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletraitDeclaration = null;


        try {
            // InternalSFDSL.g:2262:57: (iv_ruletraitDeclaration= ruletraitDeclaration EOF )
            // InternalSFDSL.g:2263:2: iv_ruletraitDeclaration= ruletraitDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraitDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletraitDeclaration=ruletraitDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletraitDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuletraitDeclaration"


    // $ANTLR start "ruletraitDeclaration"
    // InternalSFDSL.g:2269:1: ruletraitDeclaration returns [EObject current=null] : (otherlv_0= 'trait' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= ruleProtDeclaration ) ) ( (lv_roles_4_0= ruleMedRoleDeclaration ) ) otherlv_5= '}' ) ;
    public final EObject ruletraitDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_ports_3_0 = null;

        EObject lv_roles_4_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:2275:2: ( (otherlv_0= 'trait' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= ruleProtDeclaration ) ) ( (lv_roles_4_0= ruleMedRoleDeclaration ) ) otherlv_5= '}' ) )
            // InternalSFDSL.g:2276:2: (otherlv_0= 'trait' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= ruleProtDeclaration ) ) ( (lv_roles_4_0= ruleMedRoleDeclaration ) ) otherlv_5= '}' )
            {
            // InternalSFDSL.g:2276:2: (otherlv_0= 'trait' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= ruleProtDeclaration ) ) ( (lv_roles_4_0= ruleMedRoleDeclaration ) ) otherlv_5= '}' )
            // InternalSFDSL.g:2277:3: otherlv_0= 'trait' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= ruleProtDeclaration ) ) ( (lv_roles_4_0= ruleMedRoleDeclaration ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTraitDeclarationAccess().getTraitKeyword_0());
              		
            }
            // InternalSFDSL.g:2281:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSFDSL.g:2282:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSFDSL.g:2282:4: (lv_name_1_0= RULE_ID )
            // InternalSFDSL.g:2283:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getTraitDeclarationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTraitDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTraitDeclarationAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalSFDSL.g:2303:3: ( (lv_ports_3_0= ruleProtDeclaration ) )
            // InternalSFDSL.g:2304:4: (lv_ports_3_0= ruleProtDeclaration )
            {
            // InternalSFDSL.g:2304:4: (lv_ports_3_0= ruleProtDeclaration )
            // InternalSFDSL.g:2305:5: lv_ports_3_0= ruleProtDeclaration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTraitDeclarationAccess().getPortsProtDeclarationParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_ports_3_0=ruleProtDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTraitDeclarationRule());
              					}
              					add(
              						current,
              						"ports",
              						lv_ports_3_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.ProtDeclaration");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:2322:3: ( (lv_roles_4_0= ruleMedRoleDeclaration ) )
            // InternalSFDSL.g:2323:4: (lv_roles_4_0= ruleMedRoleDeclaration )
            {
            // InternalSFDSL.g:2323:4: (lv_roles_4_0= ruleMedRoleDeclaration )
            // InternalSFDSL.g:2324:5: lv_roles_4_0= ruleMedRoleDeclaration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTraitDeclarationAccess().getRolesMedRoleDeclarationParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_roles_4_0=ruleMedRoleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTraitDeclarationRule());
              					}
              					add(
              						current,
              						"roles",
              						lv_roles_4_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.MedRoleDeclaration");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTraitDeclarationAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruletraitDeclaration"


    // $ANTLR start "entryRuleMedDecl"
    // InternalSFDSL.g:2349:1: entryRuleMedDecl returns [EObject current=null] : iv_ruleMedDecl= ruleMedDecl EOF ;
    public final EObject entryRuleMedDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMedDecl = null;


        try {
            // InternalSFDSL.g:2349:48: (iv_ruleMedDecl= ruleMedDecl EOF )
            // InternalSFDSL.g:2350:2: iv_ruleMedDecl= ruleMedDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMedDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMedDecl=ruleMedDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMedDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMedDecl"


    // $ANTLR start "ruleMedDecl"
    // InternalSFDSL.g:2356:1: ruleMedDecl returns [EObject current=null] : (otherlv_0= 'Mediator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_MedRoles_3_0= ruleMedRoleDeclaration ) ) ( (lv_AActions_4_0= ruleAElementsBehaviorRoutines ) ) ( (lv_CSConConstraints_5_0= ruleCConsDecl ) ) ( (lv_MedCoreBehavior_6_0= ruleStochsticBehaviors ) )* otherlv_7= '}' ) ;
    public final EObject ruleMedDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_MedRoles_3_0 = null;

        EObject lv_AActions_4_0 = null;

        EObject lv_CSConConstraints_5_0 = null;

        EObject lv_MedCoreBehavior_6_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:2362:2: ( (otherlv_0= 'Mediator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_MedRoles_3_0= ruleMedRoleDeclaration ) ) ( (lv_AActions_4_0= ruleAElementsBehaviorRoutines ) ) ( (lv_CSConConstraints_5_0= ruleCConsDecl ) ) ( (lv_MedCoreBehavior_6_0= ruleStochsticBehaviors ) )* otherlv_7= '}' ) )
            // InternalSFDSL.g:2363:2: (otherlv_0= 'Mediator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_MedRoles_3_0= ruleMedRoleDeclaration ) ) ( (lv_AActions_4_0= ruleAElementsBehaviorRoutines ) ) ( (lv_CSConConstraints_5_0= ruleCConsDecl ) ) ( (lv_MedCoreBehavior_6_0= ruleStochsticBehaviors ) )* otherlv_7= '}' )
            {
            // InternalSFDSL.g:2363:2: (otherlv_0= 'Mediator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_MedRoles_3_0= ruleMedRoleDeclaration ) ) ( (lv_AActions_4_0= ruleAElementsBehaviorRoutines ) ) ( (lv_CSConConstraints_5_0= ruleCConsDecl ) ) ( (lv_MedCoreBehavior_6_0= ruleStochsticBehaviors ) )* otherlv_7= '}' )
            // InternalSFDSL.g:2364:3: otherlv_0= 'Mediator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_MedRoles_3_0= ruleMedRoleDeclaration ) ) ( (lv_AActions_4_0= ruleAElementsBehaviorRoutines ) ) ( (lv_CSConConstraints_5_0= ruleCConsDecl ) ) ( (lv_MedCoreBehavior_6_0= ruleStochsticBehaviors ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMedDeclAccess().getMediatorKeyword_0());
              		
            }
            // InternalSFDSL.g:2368:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSFDSL.g:2369:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSFDSL.g:2369:4: (lv_name_1_0= RULE_ID )
            // InternalSFDSL.g:2370:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMedDeclAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMedDeclRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMedDeclAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalSFDSL.g:2390:3: ( (lv_MedRoles_3_0= ruleMedRoleDeclaration ) )
            // InternalSFDSL.g:2391:4: (lv_MedRoles_3_0= ruleMedRoleDeclaration )
            {
            // InternalSFDSL.g:2391:4: (lv_MedRoles_3_0= ruleMedRoleDeclaration )
            // InternalSFDSL.g:2392:5: lv_MedRoles_3_0= ruleMedRoleDeclaration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMedDeclAccess().getMedRolesMedRoleDeclarationParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_MedRoles_3_0=ruleMedRoleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMedDeclRule());
              					}
              					add(
              						current,
              						"MedRoles",
              						lv_MedRoles_3_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.MedRoleDeclaration");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:2409:3: ( (lv_AActions_4_0= ruleAElementsBehaviorRoutines ) )
            // InternalSFDSL.g:2410:4: (lv_AActions_4_0= ruleAElementsBehaviorRoutines )
            {
            // InternalSFDSL.g:2410:4: (lv_AActions_4_0= ruleAElementsBehaviorRoutines )
            // InternalSFDSL.g:2411:5: lv_AActions_4_0= ruleAElementsBehaviorRoutines
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMedDeclAccess().getAActionsAElementsBehaviorRoutinesParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_51);
            lv_AActions_4_0=ruleAElementsBehaviorRoutines();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMedDeclRule());
              					}
              					add(
              						current,
              						"AActions",
              						lv_AActions_4_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.AElementsBehaviorRoutines");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:2428:3: ( (lv_CSConConstraints_5_0= ruleCConsDecl ) )
            // InternalSFDSL.g:2429:4: (lv_CSConConstraints_5_0= ruleCConsDecl )
            {
            // InternalSFDSL.g:2429:4: (lv_CSConConstraints_5_0= ruleCConsDecl )
            // InternalSFDSL.g:2430:5: lv_CSConConstraints_5_0= ruleCConsDecl
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMedDeclAccess().getCSConConstraintsCConsDeclParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_52);
            lv_CSConConstraints_5_0=ruleCConsDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMedDeclRule());
              					}
              					add(
              						current,
              						"CSConConstraints",
              						lv_CSConConstraints_5_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.CConsDecl");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:2447:3: ( (lv_MedCoreBehavior_6_0= ruleStochsticBehaviors ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==15) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSFDSL.g:2448:4: (lv_MedCoreBehavior_6_0= ruleStochsticBehaviors )
            	    {
            	    // InternalSFDSL.g:2448:4: (lv_MedCoreBehavior_6_0= ruleStochsticBehaviors )
            	    // InternalSFDSL.g:2449:5: lv_MedCoreBehavior_6_0= ruleStochsticBehaviors
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMedDeclAccess().getMedCoreBehaviorStochsticBehaviorsParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_52);
            	    lv_MedCoreBehavior_6_0=ruleStochsticBehaviors();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMedDeclRule());
            	      					}
            	      					add(
            	      						current,
            	      						"MedCoreBehavior",
            	      						lv_MedCoreBehavior_6_0,
            	      						"org.xtext.sosModeling.archModeling.SFDSL.StochsticBehaviors");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getMedDeclAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMedDecl"


    // $ANTLR start "entryRuleMedRoleDeclaration"
    // InternalSFDSL.g:2474:1: entryRuleMedRoleDeclaration returns [EObject current=null] : iv_ruleMedRoleDeclaration= ruleMedRoleDeclaration EOF ;
    public final EObject entryRuleMedRoleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMedRoleDeclaration = null;


        try {
            // InternalSFDSL.g:2474:59: (iv_ruleMedRoleDeclaration= ruleMedRoleDeclaration EOF )
            // InternalSFDSL.g:2475:2: iv_ruleMedRoleDeclaration= ruleMedRoleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMedRoleDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMedRoleDeclaration=ruleMedRoleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMedRoleDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMedRoleDeclaration"


    // $ANTLR start "ruleMedRoleDeclaration"
    // InternalSFDSL.g:2481:1: ruleMedRoleDeclaration returns [EObject current=null] : ( ( (lv_MediationRoles_0_0= ruleDefineMediationRoles ) ) otherlv_1= 'Med_Role' ) ;
    public final EObject ruleMedRoleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_MediationRoles_0_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:2487:2: ( ( ( (lv_MediationRoles_0_0= ruleDefineMediationRoles ) ) otherlv_1= 'Med_Role' ) )
            // InternalSFDSL.g:2488:2: ( ( (lv_MediationRoles_0_0= ruleDefineMediationRoles ) ) otherlv_1= 'Med_Role' )
            {
            // InternalSFDSL.g:2488:2: ( ( (lv_MediationRoles_0_0= ruleDefineMediationRoles ) ) otherlv_1= 'Med_Role' )
            // InternalSFDSL.g:2489:3: ( (lv_MediationRoles_0_0= ruleDefineMediationRoles ) ) otherlv_1= 'Med_Role'
            {
            // InternalSFDSL.g:2489:3: ( (lv_MediationRoles_0_0= ruleDefineMediationRoles ) )
            // InternalSFDSL.g:2490:4: (lv_MediationRoles_0_0= ruleDefineMediationRoles )
            {
            // InternalSFDSL.g:2490:4: (lv_MediationRoles_0_0= ruleDefineMediationRoles )
            // InternalSFDSL.g:2491:5: lv_MediationRoles_0_0= ruleDefineMediationRoles
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMedRoleDeclarationAccess().getMediationRolesDefineMediationRolesParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_53);
            lv_MediationRoles_0_0=ruleDefineMediationRoles();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMedRoleDeclarationRule());
              					}
              					add(
              						current,
              						"MediationRoles",
              						lv_MediationRoles_0_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.DefineMediationRoles");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMedRoleDeclarationAccess().getMed_RoleKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMedRoleDeclaration"


    // $ANTLR start "entryRuleDefineMediationRoles"
    // InternalSFDSL.g:2516:1: entryRuleDefineMediationRoles returns [EObject current=null] : iv_ruleDefineMediationRoles= ruleDefineMediationRoles EOF ;
    public final EObject entryRuleDefineMediationRoles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineMediationRoles = null;


        try {
            // InternalSFDSL.g:2516:61: (iv_ruleDefineMediationRoles= ruleDefineMediationRoles EOF )
            // InternalSFDSL.g:2517:2: iv_ruleDefineMediationRoles= ruleDefineMediationRoles EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefineMediationRolesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefineMediationRoles=ruleDefineMediationRoles();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefineMediationRoles; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefineMediationRoles"


    // $ANTLR start "ruleDefineMediationRoles"
    // InternalSFDSL.g:2523:1: ruleDefineMediationRoles returns [EObject current=null] : ( () ( (lv_type_1_0= ruleportandRoleType ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleDefineMediationRoles() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:2529:2: ( ( () ( (lv_type_1_0= ruleportandRoleType ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalSFDSL.g:2530:2: ( () ( (lv_type_1_0= ruleportandRoleType ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalSFDSL.g:2530:2: ( () ( (lv_type_1_0= ruleportandRoleType ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) )
            // InternalSFDSL.g:2531:3: () ( (lv_type_1_0= ruleportandRoleType ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) )
            {
            // InternalSFDSL.g:2531:3: ()
            // InternalSFDSL.g:2532:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDefineMediationRolesAccess().getDefineMediationRolesAction_0(),
              					current);
              			
            }

            }

            // InternalSFDSL.g:2538:3: ( (lv_type_1_0= ruleportandRoleType ) )
            // InternalSFDSL.g:2539:4: (lv_type_1_0= ruleportandRoleType )
            {
            // InternalSFDSL.g:2539:4: (lv_type_1_0= ruleportandRoleType )
            // InternalSFDSL.g:2540:5: lv_type_1_0= ruleportandRoleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefineMediationRolesAccess().getTypePortandRoleTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_type_1_0=ruleportandRoleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefineMediationRolesRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.portandRoleType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:2557:3: ( (otherlv_2= RULE_ID ) )
            // InternalSFDSL.g:2558:4: (otherlv_2= RULE_ID )
            {
            // InternalSFDSL.g:2558:4: (otherlv_2= RULE_ID )
            // InternalSFDSL.g:2559:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDefineMediationRolesRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDefineMediationRolesAccess().getPubliicIntractionpointarePublicinterfaeceDefCrossReference_2_0());
              				
            }

            }


            }

            // InternalSFDSL.g:2570:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSFDSL.g:2571:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSFDSL.g:2571:4: (lv_name_3_0= RULE_ID )
            // InternalSFDSL.g:2572:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getDefineMediationRolesAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDefineMediationRolesRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDefineMediationRoles"


    // $ANTLR start "entryRuleAbsArchDecl"
    // InternalSFDSL.g:2592:1: entryRuleAbsArchDecl returns [EObject current=null] : iv_ruleAbsArchDecl= ruleAbsArchDecl EOF ;
    public final EObject entryRuleAbsArchDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsArchDecl = null;


        try {
            // InternalSFDSL.g:2592:52: (iv_ruleAbsArchDecl= ruleAbsArchDecl EOF )
            // InternalSFDSL.g:2593:2: iv_ruleAbsArchDecl= ruleAbsArchDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsArchDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbsArchDecl=ruleAbsArchDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsArchDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAbsArchDecl"


    // $ANTLR start "ruleAbsArchDecl"
    // InternalSFDSL.g:2599:1: ruleAbsArchDecl returns [EObject current=null] : (otherlv_0= 'SoS_Arch_Caoliton' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SoS has AEs' otherlv_4= '{' ( (lv_Mediators_5_0= ruleMedDecl ) ) ( (lv_Constitients_6_0= ruleCSDecl ) ) otherlv_7= '}' ( (lv_AbstractCoaltion_8_0= ruleAElementsBehaviorRoutines ) ) ( (lv_GlobalProps_9_0= ruleGlobalProperties ) ) ) ;
    public final EObject ruleAbsArchDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_Mediators_5_0 = null;

        EObject lv_Constitients_6_0 = null;

        EObject lv_AbstractCoaltion_8_0 = null;

        EObject lv_GlobalProps_9_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:2605:2: ( (otherlv_0= 'SoS_Arch_Caoliton' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SoS has AEs' otherlv_4= '{' ( (lv_Mediators_5_0= ruleMedDecl ) ) ( (lv_Constitients_6_0= ruleCSDecl ) ) otherlv_7= '}' ( (lv_AbstractCoaltion_8_0= ruleAElementsBehaviorRoutines ) ) ( (lv_GlobalProps_9_0= ruleGlobalProperties ) ) ) )
            // InternalSFDSL.g:2606:2: (otherlv_0= 'SoS_Arch_Caoliton' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SoS has AEs' otherlv_4= '{' ( (lv_Mediators_5_0= ruleMedDecl ) ) ( (lv_Constitients_6_0= ruleCSDecl ) ) otherlv_7= '}' ( (lv_AbstractCoaltion_8_0= ruleAElementsBehaviorRoutines ) ) ( (lv_GlobalProps_9_0= ruleGlobalProperties ) ) )
            {
            // InternalSFDSL.g:2606:2: (otherlv_0= 'SoS_Arch_Caoliton' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SoS has AEs' otherlv_4= '{' ( (lv_Mediators_5_0= ruleMedDecl ) ) ( (lv_Constitients_6_0= ruleCSDecl ) ) otherlv_7= '}' ( (lv_AbstractCoaltion_8_0= ruleAElementsBehaviorRoutines ) ) ( (lv_GlobalProps_9_0= ruleGlobalProperties ) ) )
            // InternalSFDSL.g:2607:3: otherlv_0= 'SoS_Arch_Caoliton' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SoS has AEs' otherlv_4= '{' ( (lv_Mediators_5_0= ruleMedDecl ) ) ( (lv_Constitients_6_0= ruleCSDecl ) ) otherlv_7= '}' ( (lv_AbstractCoaltion_8_0= ruleAElementsBehaviorRoutines ) ) ( (lv_GlobalProps_9_0= ruleGlobalProperties ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAbsArchDeclAccess().getSoS_Arch_CaolitonKeyword_0());
              		
            }
            // InternalSFDSL.g:2611:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSFDSL.g:2612:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSFDSL.g:2612:4: (lv_name_1_0= RULE_ID )
            // InternalSFDSL.g:2613:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getAbsArchDeclAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAbsArchDeclRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAbsArchDeclAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,51,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAbsArchDeclAccess().getSoSHasAEsKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,13,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAbsArchDeclAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalSFDSL.g:2641:3: ( (lv_Mediators_5_0= ruleMedDecl ) )
            // InternalSFDSL.g:2642:4: (lv_Mediators_5_0= ruleMedDecl )
            {
            // InternalSFDSL.g:2642:4: (lv_Mediators_5_0= ruleMedDecl )
            // InternalSFDSL.g:2643:5: lv_Mediators_5_0= ruleMedDecl
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAbsArchDeclAccess().getMediatorsMedDeclParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_56);
            lv_Mediators_5_0=ruleMedDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAbsArchDeclRule());
              					}
              					add(
              						current,
              						"Mediators",
              						lv_Mediators_5_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.MedDecl");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:2660:3: ( (lv_Constitients_6_0= ruleCSDecl ) )
            // InternalSFDSL.g:2661:4: (lv_Constitients_6_0= ruleCSDecl )
            {
            // InternalSFDSL.g:2661:4: (lv_Constitients_6_0= ruleCSDecl )
            // InternalSFDSL.g:2662:5: lv_Constitients_6_0= ruleCSDecl
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAbsArchDeclAccess().getConstitientsCSDeclParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_Constitients_6_0=ruleCSDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAbsArchDeclRule());
              					}
              					add(
              						current,
              						"Constitients",
              						lv_Constitients_6_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.CSDecl");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getAbsArchDeclAccess().getRightCurlyBracketKeyword_7());
              		
            }
            // InternalSFDSL.g:2683:3: ( (lv_AbstractCoaltion_8_0= ruleAElementsBehaviorRoutines ) )
            // InternalSFDSL.g:2684:4: (lv_AbstractCoaltion_8_0= ruleAElementsBehaviorRoutines )
            {
            // InternalSFDSL.g:2684:4: (lv_AbstractCoaltion_8_0= ruleAElementsBehaviorRoutines )
            // InternalSFDSL.g:2685:5: lv_AbstractCoaltion_8_0= ruleAElementsBehaviorRoutines
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAbsArchDeclAccess().getAbstractCoaltionAElementsBehaviorRoutinesParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_AbstractCoaltion_8_0=ruleAElementsBehaviorRoutines();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAbsArchDeclRule());
              					}
              					add(
              						current,
              						"AbstractCoaltion",
              						lv_AbstractCoaltion_8_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.AElementsBehaviorRoutines");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:2702:3: ( (lv_GlobalProps_9_0= ruleGlobalProperties ) )
            // InternalSFDSL.g:2703:4: (lv_GlobalProps_9_0= ruleGlobalProperties )
            {
            // InternalSFDSL.g:2703:4: (lv_GlobalProps_9_0= ruleGlobalProperties )
            // InternalSFDSL.g:2704:5: lv_GlobalProps_9_0= ruleGlobalProperties
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAbsArchDeclAccess().getGlobalPropsGlobalPropertiesParserRuleCall_9_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_GlobalProps_9_0=ruleGlobalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAbsArchDeclRule());
              					}
              					add(
              						current,
              						"GlobalProps",
              						lv_GlobalProps_9_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.GlobalProperties");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAbsArchDecl"


    // $ANTLR start "entryRuleGlobalProperties"
    // InternalSFDSL.g:2725:1: entryRuleGlobalProperties returns [EObject current=null] : iv_ruleGlobalProperties= ruleGlobalProperties EOF ;
    public final EObject entryRuleGlobalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalProperties = null;


        try {
            // InternalSFDSL.g:2725:57: (iv_ruleGlobalProperties= ruleGlobalProperties EOF )
            // InternalSFDSL.g:2726:2: iv_ruleGlobalProperties= ruleGlobalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGlobalProperties=ruleGlobalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGlobalProperties; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGlobalProperties"


    // $ANTLR start "ruleGlobalProperties"
    // InternalSFDSL.g:2732:1: ruleGlobalProperties returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'SoS-Properties' ( (lv_PropertyType_2_0= ruletypes ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_attrinit_5_0= ruleinitVals ) ) otherlv_6= '}' ) ;
    public final EObject ruleGlobalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_PropertyType_2_0 = null;

        EObject lv_attrinit_5_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:2738:2: ( (otherlv_0= '{' otherlv_1= 'SoS-Properties' ( (lv_PropertyType_2_0= ruletypes ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_attrinit_5_0= ruleinitVals ) ) otherlv_6= '}' ) )
            // InternalSFDSL.g:2739:2: (otherlv_0= '{' otherlv_1= 'SoS-Properties' ( (lv_PropertyType_2_0= ruletypes ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_attrinit_5_0= ruleinitVals ) ) otherlv_6= '}' )
            {
            // InternalSFDSL.g:2739:2: (otherlv_0= '{' otherlv_1= 'SoS-Properties' ( (lv_PropertyType_2_0= ruletypes ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_attrinit_5_0= ruleinitVals ) ) otherlv_6= '}' )
            // InternalSFDSL.g:2740:3: otherlv_0= '{' otherlv_1= 'SoS-Properties' ( (lv_PropertyType_2_0= ruletypes ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_attrinit_5_0= ruleinitVals ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGlobalPropertiesAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,52,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGlobalPropertiesAccess().getSoSPropertiesKeyword_1());
              		
            }
            // InternalSFDSL.g:2748:3: ( (lv_PropertyType_2_0= ruletypes ) )
            // InternalSFDSL.g:2749:4: (lv_PropertyType_2_0= ruletypes )
            {
            // InternalSFDSL.g:2749:4: (lv_PropertyType_2_0= ruletypes )
            // InternalSFDSL.g:2750:5: lv_PropertyType_2_0= ruletypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGlobalPropertiesAccess().getPropertyTypeTypesParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_PropertyType_2_0=ruletypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGlobalPropertiesRule());
              					}
              					set(
              						current,
              						"PropertyType",
              						lv_PropertyType_2_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.types");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSFDSL.g:2767:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSFDSL.g:2768:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSFDSL.g:2768:4: (lv_name_3_0= RULE_ID )
            // InternalSFDSL.g:2769:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getGlobalPropertiesAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGlobalPropertiesRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGlobalPropertiesAccess().getEqualsSignKeyword_4());
              		
            }
            // InternalSFDSL.g:2789:3: ( (lv_attrinit_5_0= ruleinitVals ) )
            // InternalSFDSL.g:2790:4: (lv_attrinit_5_0= ruleinitVals )
            {
            // InternalSFDSL.g:2790:4: (lv_attrinit_5_0= ruleinitVals )
            // InternalSFDSL.g:2791:5: lv_attrinit_5_0= ruleinitVals
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGlobalPropertiesAccess().getAttrinitInitValsParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_attrinit_5_0=ruleinitVals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGlobalPropertiesRule());
              					}
              					set(
              						current,
              						"attrinit",
              						lv_attrinit_5_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.initVals");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGlobalPropertiesAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGlobalProperties"


    // $ANTLR start "entryRuletypes"
    // InternalSFDSL.g:2816:1: entryRuletypes returns [String current=null] : iv_ruletypes= ruletypes EOF ;
    public final String entryRuletypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletypes = null;


        try {
            // InternalSFDSL.g:2816:45: (iv_ruletypes= ruletypes EOF )
            // InternalSFDSL.g:2817:2: iv_ruletypes= ruletypes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletypes=ruletypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletypes.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuletypes"


    // $ANTLR start "ruletypes"
    // InternalSFDSL.g:2823:1: ruletypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'stirng' | kw= 'int' | kw= 'float' | kw= 'boolean' | kw= 'type' | kw= 'void' ) ;
    public final AntlrDatatypeRuleToken ruletypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSFDSL.g:2829:2: ( (kw= 'stirng' | kw= 'int' | kw= 'float' | kw= 'boolean' | kw= 'type' | kw= 'void' ) )
            // InternalSFDSL.g:2830:2: (kw= 'stirng' | kw= 'int' | kw= 'float' | kw= 'boolean' | kw= 'type' | kw= 'void' )
            {
            // InternalSFDSL.g:2830:2: (kw= 'stirng' | kw= 'int' | kw= 'float' | kw= 'boolean' | kw= 'type' | kw= 'void' )
            int alt30=6;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt30=1;
                }
                break;
            case 54:
                {
                alt30=2;
                }
                break;
            case 55:
                {
                alt30=3;
                }
                break;
            case 56:
                {
                alt30=4;
                }
                break;
            case 57:
                {
                alt30=5;
                }
                break;
            case 58:
                {
                alt30=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalSFDSL.g:2831:3: kw= 'stirng'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getStirngKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSFDSL.g:2837:3: kw= 'int'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getIntKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSFDSL.g:2843:3: kw= 'float'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getFloatKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSFDSL.g:2849:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getBooleanKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSFDSL.g:2855:3: kw= 'type'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getTypeKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSFDSL.g:2861:3: kw= 'void'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getVoidKeyword_5());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruletypes"


    // $ANTLR start "entryRuleinitVals"
    // InternalSFDSL.g:2870:1: entryRuleinitVals returns [EObject current=null] : iv_ruleinitVals= ruleinitVals EOF ;
    public final EObject entryRuleinitVals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinitVals = null;


        try {
            // InternalSFDSL.g:2870:49: (iv_ruleinitVals= ruleinitVals EOF )
            // InternalSFDSL.g:2871:2: iv_ruleinitVals= ruleinitVals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitValsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleinitVals=ruleinitVals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinitVals; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleinitVals"


    // $ANTLR start "ruleinitVals"
    // InternalSFDSL.g:2877:1: ruleinitVals returns [EObject current=null] : ( ( () this_STRING_1= RULE_STRING ) | ( () this_INT_3= RULE_INT ) | this_FLOAT_4= ruleFLOAT | ( () ruleBoolean ) ) ;
    public final EObject ruleinitVals() throws RecognitionException {
        EObject current = null;

        Token this_STRING_1=null;
        Token this_INT_3=null;
        EObject this_FLOAT_4 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:2883:2: ( ( ( () this_STRING_1= RULE_STRING ) | ( () this_INT_3= RULE_INT ) | this_FLOAT_4= ruleFLOAT | ( () ruleBoolean ) ) )
            // InternalSFDSL.g:2884:2: ( ( () this_STRING_1= RULE_STRING ) | ( () this_INT_3= RULE_INT ) | this_FLOAT_4= ruleFLOAT | ( () ruleBoolean ) )
            {
            // InternalSFDSL.g:2884:2: ( ( () this_STRING_1= RULE_STRING ) | ( () this_INT_3= RULE_INT ) | this_FLOAT_4= ruleFLOAT | ( () ruleBoolean ) )
            int alt31=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt31=1;
                }
                break;
            case RULE_INT:
                {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==EOF||LA31_2==14) ) {
                    alt31=2;
                }
                else if ( (LA31_2==27) ) {
                    alt31=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;
                }
                }
                break;
            case 59:
            case 60:
                {
                alt31=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalSFDSL.g:2885:3: ( () this_STRING_1= RULE_STRING )
                    {
                    // InternalSFDSL.g:2885:3: ( () this_STRING_1= RULE_STRING )
                    // InternalSFDSL.g:2886:4: () this_STRING_1= RULE_STRING
                    {
                    // InternalSFDSL.g:2886:4: ()
                    // InternalSFDSL.g:2887:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInitValsAccess().getInitValsAction_0_0(),
                      						current);
                      				
                    }

                    }

                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_STRING_1, grammarAccess.getInitValsAccess().getSTRINGTerminalRuleCall_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSFDSL.g:2899:3: ( () this_INT_3= RULE_INT )
                    {
                    // InternalSFDSL.g:2899:3: ( () this_INT_3= RULE_INT )
                    // InternalSFDSL.g:2900:4: () this_INT_3= RULE_INT
                    {
                    // InternalSFDSL.g:2900:4: ()
                    // InternalSFDSL.g:2901:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInitValsAccess().getInitValsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_3, grammarAccess.getInitValsAccess().getINTTerminalRuleCall_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSFDSL.g:2913:3: this_FLOAT_4= ruleFLOAT
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInitValsAccess().getFLOATParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FLOAT_4=ruleFLOAT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FLOAT_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSFDSL.g:2922:3: ( () ruleBoolean )
                    {
                    // InternalSFDSL.g:2922:3: ( () ruleBoolean )
                    // InternalSFDSL.g:2923:4: () ruleBoolean
                    {
                    // InternalSFDSL.g:2923:4: ()
                    // InternalSFDSL.g:2924:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInitValsAccess().getInitValsAction_3_0(),
                      						current);
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getInitValsAccess().getBooleanParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleinitVals"


    // $ANTLR start "entryRuleBoolean"
    // InternalSFDSL.g:2942:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalSFDSL.g:2942:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalSFDSL.g:2943:2: iv_ruleBoolean= ruleBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalSFDSL.g:2949:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSFDSL.g:2955:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalSFDSL.g:2956:2: (kw= 'true' | kw= 'false' )
            {
            // InternalSFDSL.g:2956:2: (kw= 'true' | kw= 'false' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==59) ) {
                alt32=1;
            }
            else if ( (LA32_0==60) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalSFDSL.g:2957:3: kw= 'true'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSFDSL.g:2963:3: kw= 'false'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleFLOAT"
    // InternalSFDSL.g:2972:1: entryRuleFLOAT returns [EObject current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final EObject entryRuleFLOAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFLOAT = null;


        try {
            // InternalSFDSL.g:2972:46: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalSFDSL.g:2973:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFLOATRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFLOAT; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalSFDSL.g:2979:1: ruleFLOAT returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT ) ;
    public final EObject ruleFLOAT() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalSFDSL.g:2985:2: ( ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT ) )
            // InternalSFDSL.g:2986:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT )
            {
            // InternalSFDSL.g:2986:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT )
            // InternalSFDSL.g:2987:3: ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' this_INT_2= RULE_INT
            {
            // InternalSFDSL.g:2987:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalSFDSL.g:2988:4: (lv_value_0_0= RULE_INT )
            {
            // InternalSFDSL.g:2988:4: (lv_value_0_0= RULE_INT )
            // InternalSFDSL.g:2989:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_0_0, grammarAccess.getFLOATAccess().getValueINTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFLOATRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_0_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFLOATAccess().getFullStopKeyword_1());
              		
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_2, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRuleExpression"
    // InternalSFDSL.g:3017:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSFDSL.g:3017:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSFDSL.g:3018:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSFDSL.g:3024:1: ruleExpression returns [EObject current=null] : this_LogicalExpression_0= ruleLogicalExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalExpression_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:3030:2: (this_LogicalExpression_0= ruleLogicalExpression )
            // InternalSFDSL.g:3031:2: this_LogicalExpression_0= ruleLogicalExpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getLogicalExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_LogicalExpression_0=ruleLogicalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_LogicalExpression_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLogicalExpression"
    // InternalSFDSL.g:3042:1: entryRuleLogicalExpression returns [EObject current=null] : iv_ruleLogicalExpression= ruleLogicalExpression EOF ;
    public final EObject entryRuleLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalExpression = null;


        try {
            // InternalSFDSL.g:3042:58: (iv_ruleLogicalExpression= ruleLogicalExpression EOF )
            // InternalSFDSL.g:3043:2: iv_ruleLogicalExpression= ruleLogicalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalExpression=ruleLogicalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalExpression"


    // $ANTLR start "ruleLogicalExpression"
    // InternalSFDSL.g:3049:1: ruleLogicalExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleLogicalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_EqualityExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:3055:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalSFDSL.g:3056:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalSFDSL.g:3056:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            // InternalSFDSL.g:3057:3: this_EqualityExpression_0= ruleEqualityExpression ( () ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalExpressionAccess().getEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_59);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSFDSL.g:3065:3: ( () ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=61 && LA34_0<=62)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSFDSL.g:3066:4: () ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalSFDSL.g:3066:4: ()
            	    // InternalSFDSL.g:3067:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getLogicalExpressionAccess().getLogicalExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSFDSL.g:3073:4: ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) )
            	    // InternalSFDSL.g:3074:5: ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) )
            	    {
            	    // InternalSFDSL.g:3074:5: ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) )
            	    // InternalSFDSL.g:3075:6: (lv_op_2_1= '||' | lv_op_2_2= '&&' )
            	    {
            	    // InternalSFDSL.g:3075:6: (lv_op_2_1= '||' | lv_op_2_2= '&&' )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==61) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==62) ) {
            	        alt33=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalSFDSL.g:3076:7: lv_op_2_1= '||'
            	            {
            	            lv_op_2_1=(Token)match(input,61,FOLLOW_35); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getLogicalExpressionAccess().getOpVerticalLineVerticalLineKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getLogicalExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalSFDSL.g:3087:7: lv_op_2_2= '&&'
            	            {
            	            lv_op_2_2=(Token)match(input,62,FOLLOW_35); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getLogicalExpressionAccess().getOpAmpersandAmpersandKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getLogicalExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalSFDSL.g:3100:4: ( (lv_right_3_0= ruleEqualityExpression ) )
            	    // InternalSFDSL.g:3101:5: (lv_right_3_0= ruleEqualityExpression )
            	    {
            	    // InternalSFDSL.g:3101:5: (lv_right_3_0= ruleEqualityExpression )
            	    // InternalSFDSL.g:3102:6: lv_right_3_0= ruleEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_59);
            	    lv_right_3_0=ruleEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLogicalExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.sosModeling.archModeling.SFDSL.EqualityExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLogicalExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalSFDSL.g:3124:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalSFDSL.g:3124:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalSFDSL.g:3125:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualityExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalSFDSL.g:3131:1: ruleEqualityExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:3137:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) )
            // InternalSFDSL.g:3138:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            {
            // InternalSFDSL.g:3138:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            // InternalSFDSL.g:3139:3: this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_60);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_RelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSFDSL.g:3147:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=63 && LA36_0<=64)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSFDSL.g:3148:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) )
            	    {
            	    // InternalSFDSL.g:3148:4: ()
            	    // InternalSFDSL.g:3149:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSFDSL.g:3155:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalSFDSL.g:3156:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalSFDSL.g:3156:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalSFDSL.g:3157:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalSFDSL.g:3157:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==63) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==64) ) {
            	        alt35=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalSFDSL.g:3158:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,63,FOLLOW_35); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getEqualityExpressionAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalSFDSL.g:3169:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,64,FOLLOW_35); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getEqualityExpressionAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalSFDSL.g:3182:4: ( (lv_right_3_0= ruleRelationalExpression ) )
            	    // InternalSFDSL.g:3183:5: (lv_right_3_0= ruleRelationalExpression )
            	    {
            	    // InternalSFDSL.g:3183:5: (lv_right_3_0= ruleRelationalExpression )
            	    // InternalSFDSL.g:3184:6: lv_right_3_0= ruleRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightRelationalExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_60);
            	    lv_right_3_0=ruleRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.sosModeling.archModeling.SFDSL.RelationalExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalSFDSL.g:3206:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalSFDSL.g:3206:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalSFDSL.g:3207:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // InternalSFDSL.g:3213:1: ruleRelationalExpression returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_ArithmeticExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:3219:2: ( (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )* ) )
            // InternalSFDSL.g:3220:2: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )* )
            {
            // InternalSFDSL.g:3220:2: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )* )
            // InternalSFDSL.g:3221:3: this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getArithmeticExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_61);
            this_ArithmeticExpression_0=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ArithmeticExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSFDSL.g:3229:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=65 && LA38_0<=68)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalSFDSL.g:3230:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleArithmeticExpression ) )
            	    {
            	    // InternalSFDSL.g:3230:4: ()
            	    // InternalSFDSL.g:3231:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSFDSL.g:3237:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalSFDSL.g:3238:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalSFDSL.g:3238:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalSFDSL.g:3239:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalSFDSL.g:3239:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt37=4;
            	    switch ( input.LA(1) ) {
            	    case 65:
            	        {
            	        alt37=1;
            	        }
            	        break;
            	    case 66:
            	        {
            	        alt37=2;
            	        }
            	        break;
            	    case 67:
            	        {
            	        alt37=3;
            	        }
            	        break;
            	    case 68:
            	        {
            	        alt37=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt37) {
            	        case 1 :
            	            // InternalSFDSL.g:3240:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,65,FOLLOW_35); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getRelationalExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalSFDSL.g:3251:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,66,FOLLOW_35); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getRelationalExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalSFDSL.g:3262:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,67,FOLLOW_35); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_3, grammarAccess.getRelationalExpressionAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalSFDSL.g:3273:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,68,FOLLOW_35); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_4, grammarAccess.getRelationalExpressionAccess().getOpLessThanSignKeyword_1_1_0_3());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalSFDSL.g:3286:4: ( (lv_right_3_0= ruleArithmeticExpression ) )
            	    // InternalSFDSL.g:3287:5: (lv_right_3_0= ruleArithmeticExpression )
            	    {
            	    // InternalSFDSL.g:3287:5: (lv_right_3_0= ruleArithmeticExpression )
            	    // InternalSFDSL.g:3288:6: lv_right_3_0= ruleArithmeticExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightArithmeticExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_61);
            	    lv_right_3_0=ruleArithmeticExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.sosModeling.archModeling.SFDSL.ArithmeticExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleArithmeticExpression"
    // InternalSFDSL.g:3310:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // InternalSFDSL.g:3310:61: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // InternalSFDSL.g:3311:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArithmeticExpression"


    // $ANTLR start "ruleArithmeticExpression"
    // InternalSFDSL.g:3317:1: ruleArithmeticExpression returns [EObject current=null] : (this_Term_0= ruleTerm ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleTerm ) ) )* ) ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        Token lv_op_4_0=null;
        EObject this_Term_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:3323:2: ( (this_Term_0= ruleTerm ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleTerm ) ) )* ) )
            // InternalSFDSL.g:3324:2: (this_Term_0= ruleTerm ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleTerm ) ) )* )
            {
            // InternalSFDSL.g:3324:2: (this_Term_0= ruleTerm ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleTerm ) ) )* )
            // InternalSFDSL.g:3325:3: this_Term_0= ruleTerm ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleTerm ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getTermParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_62);
            this_Term_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Term_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSFDSL.g:3333:3: ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleTerm ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=69 && LA40_0<=70)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalSFDSL.g:3334:4: ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleTerm ) )
            	    {
            	    // InternalSFDSL.g:3334:4: ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) )
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==69) ) {
            	        alt39=1;
            	    }
            	    else if ( (LA39_0==70) ) {
            	        alt39=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // InternalSFDSL.g:3335:5: ( () ( (lv_op_2_0= '+' ) ) )
            	            {
            	            // InternalSFDSL.g:3335:5: ( () ( (lv_op_2_0= '+' ) ) )
            	            // InternalSFDSL.g:3336:6: () ( (lv_op_2_0= '+' ) )
            	            {
            	            // InternalSFDSL.g:3336:6: ()
            	            // InternalSFDSL.g:3337:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getArithmeticExpressionAccess().getSumOperationLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            // InternalSFDSL.g:3343:6: ( (lv_op_2_0= '+' ) )
            	            // InternalSFDSL.g:3344:7: (lv_op_2_0= '+' )
            	            {
            	            // InternalSFDSL.g:3344:7: (lv_op_2_0= '+' )
            	            // InternalSFDSL.g:3345:8: lv_op_2_0= '+'
            	            {
            	            lv_op_2_0=(Token)match(input,69,FOLLOW_35); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_0, grammarAccess.getArithmeticExpressionAccess().getOpPlusSignKeyword_1_0_0_1_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getArithmeticExpressionRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_0, "+");
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalSFDSL.g:3359:5: ( () ( (lv_op_4_0= '-' ) ) )
            	            {
            	            // InternalSFDSL.g:3359:5: ( () ( (lv_op_4_0= '-' ) ) )
            	            // InternalSFDSL.g:3360:6: () ( (lv_op_4_0= '-' ) )
            	            {
            	            // InternalSFDSL.g:3360:6: ()
            	            // InternalSFDSL.g:3361:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getArithmeticExpressionAccess().getMinusOperationLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            // InternalSFDSL.g:3367:6: ( (lv_op_4_0= '-' ) )
            	            // InternalSFDSL.g:3368:7: (lv_op_4_0= '-' )
            	            {
            	            // InternalSFDSL.g:3368:7: (lv_op_4_0= '-' )
            	            // InternalSFDSL.g:3369:8: lv_op_4_0= '-'
            	            {
            	            lv_op_4_0=(Token)match(input,70,FOLLOW_35); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_4_0, grammarAccess.getArithmeticExpressionAccess().getOpHyphenMinusKeyword_1_0_1_1_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getArithmeticExpressionRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_4_0, "-");
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalSFDSL.g:3383:4: ( (lv_right_5_0= ruleTerm ) )
            	    // InternalSFDSL.g:3384:5: (lv_right_5_0= ruleTerm )
            	    {
            	    // InternalSFDSL.g:3384:5: (lv_right_5_0= ruleTerm )
            	    // InternalSFDSL.g:3385:6: lv_right_5_0= ruleTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getRightTermParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_62);
            	    lv_right_5_0=ruleTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getArithmeticExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"org.xtext.sosModeling.archModeling.SFDSL.Term");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArithmeticExpression"


    // $ANTLR start "entryRuleTerm"
    // InternalSFDSL.g:3407:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalSFDSL.g:3407:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalSFDSL.g:3408:2: iv_ruleTerm= ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalSFDSL.g:3414:1: ruleTerm returns [EObject current=null] : (this_Factor_0= ruleFactor ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= ruleFactor ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:3420:2: ( (this_Factor_0= ruleFactor ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= ruleFactor ) ) )* ) )
            // InternalSFDSL.g:3421:2: (this_Factor_0= ruleFactor ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= ruleFactor ) ) )* )
            {
            // InternalSFDSL.g:3421:2: (this_Factor_0= ruleFactor ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= ruleFactor ) ) )* )
            // InternalSFDSL.g:3422:3: this_Factor_0= ruleFactor ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= ruleFactor ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_63);
            this_Factor_0=ruleFactor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Factor_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSFDSL.g:3430:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= ruleFactor ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=71 && LA42_0<=73)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalSFDSL.g:3431:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= ruleFactor ) )
            	    {
            	    // InternalSFDSL.g:3431:4: ()
            	    // InternalSFDSL.g:3432:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getTermAccess().getTermLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSFDSL.g:3438:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) )
            	    // InternalSFDSL.g:3439:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) )
            	    {
            	    // InternalSFDSL.g:3439:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) )
            	    // InternalSFDSL.g:3440:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' )
            	    {
            	    // InternalSFDSL.g:3440:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' )
            	    int alt41=3;
            	    switch ( input.LA(1) ) {
            	    case 71:
            	        {
            	        alt41=1;
            	        }
            	        break;
            	    case 72:
            	        {
            	        alt41=2;
            	        }
            	        break;
            	    case 73:
            	        {
            	        alt41=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt41) {
            	        case 1 :
            	            // InternalSFDSL.g:3441:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,71,FOLLOW_35); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getTermAccess().getOpAsteriskKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getTermRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalSFDSL.g:3452:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,72,FOLLOW_35); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getTermAccess().getOpSolidusKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getTermRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalSFDSL.g:3463:7: lv_op_2_3= 'mod'
            	            {
            	            lv_op_2_3=(Token)match(input,73,FOLLOW_35); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_3, grammarAccess.getTermAccess().getOpModKeyword_1_1_0_2());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getTermRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalSFDSL.g:3476:4: ( (lv_right_3_0= ruleFactor ) )
            	    // InternalSFDSL.g:3477:5: (lv_right_3_0= ruleFactor )
            	    {
            	    // InternalSFDSL.g:3477:5: (lv_right_3_0= ruleFactor )
            	    // InternalSFDSL.g:3478:6: lv_right_3_0= ruleFactor
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTermAccess().getRightFactorParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_63);
            	    lv_right_3_0=ruleFactor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTermRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.sosModeling.archModeling.SFDSL.Factor");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleFactor"
    // InternalSFDSL.g:3500:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalSFDSL.g:3500:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalSFDSL.g:3501:2: iv_ruleFactor= ruleFactor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFactorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFactor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalSFDSL.g:3507:1: ruleFactor returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_UnaryExpression_3= ruleUnaryExpression | this_AtomicElement_4= ruleAtomicElement ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_UnaryExpression_3 = null;

        EObject this_AtomicElement_4 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:3513:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_UnaryExpression_3= ruleUnaryExpression | this_AtomicElement_4= ruleAtomicElement ) )
            // InternalSFDSL.g:3514:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_UnaryExpression_3= ruleUnaryExpression | this_AtomicElement_4= ruleAtomicElement )
            {
            // InternalSFDSL.g:3514:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_UnaryExpression_3= ruleUnaryExpression | this_AtomicElement_4= ruleAtomicElement )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt43=1;
                }
                break;
            case 74:
                {
                alt43=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 59:
            case 60:
                {
                alt43=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalSFDSL.g:3515:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalSFDSL.g:3515:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalSFDSL.g:3516:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFactorAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_24);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSFDSL.g:3534:3: this_UnaryExpression_3= ruleUnaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFactorAccess().getUnaryExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnaryExpression_3=ruleUnaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnaryExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSFDSL.g:3543:3: this_AtomicElement_4= ruleAtomicElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFactorAccess().getAtomicElementParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AtomicElement_4=ruleAtomicElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AtomicElement_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalSFDSL.g:3555:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalSFDSL.g:3555:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalSFDSL.g:3556:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalSFDSL.g:3562:1: ruleUnaryExpression returns [EObject current=null] : ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomicElement ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:3568:2: ( ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomicElement ) ) ) )
            // InternalSFDSL.g:3569:2: ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomicElement ) ) )
            {
            // InternalSFDSL.g:3569:2: ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomicElement ) ) )
            // InternalSFDSL.g:3570:3: () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomicElement ) )
            {
            // InternalSFDSL.g:3570:3: ()
            // InternalSFDSL.g:3571:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUnaryExpressionAccess().getNegationExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalSFDSL.g:3577:3: ( ( '!' )=>otherlv_1= '!' )
            // InternalSFDSL.g:3578:4: ( '!' )=>otherlv_1= '!'
            {
            otherlv_1=(Token)match(input,74,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_1());
              			
            }

            }

            // InternalSFDSL.g:3584:3: ( (lv_expression_2_0= ruleAtomicElement ) )
            // InternalSFDSL.g:3585:4: (lv_expression_2_0= ruleAtomicElement )
            {
            // InternalSFDSL.g:3585:4: (lv_expression_2_0= ruleAtomicElement )
            // InternalSFDSL.g:3586:5: lv_expression_2_0= ruleAtomicElement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExpressionAtomicElementParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleAtomicElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.AtomicElement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleAtomicElement"
    // InternalSFDSL.g:3607:1: entryRuleAtomicElement returns [EObject current=null] : iv_ruleAtomicElement= ruleAtomicElement EOF ;
    public final EObject entryRuleAtomicElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicElement = null;


        try {
            // InternalSFDSL.g:3607:54: (iv_ruleAtomicElement= ruleAtomicElement EOF )
            // InternalSFDSL.g:3608:2: iv_ruleAtomicElement= ruleAtomicElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomicElement=ruleAtomicElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAtomicElement"


    // $ANTLR start "ruleAtomicElement"
    // InternalSFDSL.g:3614:1: ruleAtomicElement returns [EObject current=null] : (this_LiteralElement_0= ruleLiteralElement | ( () ( (lv_variable_2_0= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomicElement() throws RecognitionException {
        EObject current = null;

        Token lv_variable_2_0=null;
        EObject this_LiteralElement_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:3620:2: ( (this_LiteralElement_0= ruleLiteralElement | ( () ( (lv_variable_2_0= RULE_ID ) ) ) ) )
            // InternalSFDSL.g:3621:2: (this_LiteralElement_0= ruleLiteralElement | ( () ( (lv_variable_2_0= RULE_ID ) ) ) )
            {
            // InternalSFDSL.g:3621:2: (this_LiteralElement_0= ruleLiteralElement | ( () ( (lv_variable_2_0= RULE_ID ) ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_INT && LA44_0<=RULE_STRING)||(LA44_0>=59 && LA44_0<=60)) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_ID) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalSFDSL.g:3622:3: this_LiteralElement_0= ruleLiteralElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicElementAccess().getLiteralElementParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralElement_0=ruleLiteralElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LiteralElement_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSFDSL.g:3631:3: ( () ( (lv_variable_2_0= RULE_ID ) ) )
                    {
                    // InternalSFDSL.g:3631:3: ( () ( (lv_variable_2_0= RULE_ID ) ) )
                    // InternalSFDSL.g:3632:4: () ( (lv_variable_2_0= RULE_ID ) )
                    {
                    // InternalSFDSL.g:3632:4: ()
                    // InternalSFDSL.g:3633:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicElementAccess().getVariableRefAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSFDSL.g:3639:4: ( (lv_variable_2_0= RULE_ID ) )
                    // InternalSFDSL.g:3640:5: (lv_variable_2_0= RULE_ID )
                    {
                    // InternalSFDSL.g:3640:5: (lv_variable_2_0= RULE_ID )
                    // InternalSFDSL.g:3641:6: lv_variable_2_0= RULE_ID
                    {
                    lv_variable_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_variable_2_0, grammarAccess.getAtomicElementAccess().getVariableIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicElementRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"variable",
                      							lv_variable_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAtomicElement"


    // $ANTLR start "entryRuleLiteralElement"
    // InternalSFDSL.g:3662:1: entryRuleLiteralElement returns [EObject current=null] : iv_ruleLiteralElement= ruleLiteralElement EOF ;
    public final EObject entryRuleLiteralElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralElement = null;


        try {
            // InternalSFDSL.g:3662:55: (iv_ruleLiteralElement= ruleLiteralElement EOF )
            // InternalSFDSL.g:3663:2: iv_ruleLiteralElement= ruleLiteralElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralElement=ruleLiteralElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralElement"


    // $ANTLR start "ruleLiteralElement"
    // InternalSFDSL.g:3669:1: ruleLiteralElement returns [EObject current=null] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) ;
    public final EObject ruleLiteralElement() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerLiteral_0 = null;

        EObject this_RealLiteral_1 = null;

        EObject this_StringLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:3675:2: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) )
            // InternalSFDSL.g:3676:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            {
            // InternalSFDSL.g:3676:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            int alt45=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==EOF||LA45_1==RULE_ID||LA45_1==11||(LA45_1>=13 && LA45_1<=15)||(LA45_1>=24 && LA45_1<=25)||(LA45_1>=28 && LA45_1<=29)||LA45_1==38||(LA45_1>=44 && LA45_1<=45)||(LA45_1>=61 && LA45_1<=73)) ) {
                    alt45=1;
                }
                else if ( (LA45_1==27) ) {
                    alt45=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt45=3;
                }
                break;
            case 59:
            case 60:
                {
                alt45=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalSFDSL.g:3677:3: this_IntegerLiteral_0= ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralElementAccess().getIntegerLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntegerLiteral_0=ruleIntegerLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSFDSL.g:3686:3: this_RealLiteral_1= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralElementAccess().getRealLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RealLiteral_1=ruleRealLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RealLiteral_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSFDSL.g:3695:3: this_StringLiteral_2= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralElementAccess().getStringLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_2=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringLiteral_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSFDSL.g:3704:3: this_BooleanLiteral_3= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralElementAccess().getBooleanLiteralParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_3=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanLiteral_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLiteralElement"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalSFDSL.g:3716:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // InternalSFDSL.g:3716:55: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalSFDSL.g:3717:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalSFDSL.g:3723:1: ruleIntegerLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalSFDSL.g:3729:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalSFDSL.g:3730:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalSFDSL.g:3730:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalSFDSL.g:3731:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalSFDSL.g:3731:3: ()
            // InternalSFDSL.g:3732:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIntegerLiteralAccess().getIntegerLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalSFDSL.g:3738:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalSFDSL.g:3739:4: (lv_value_1_0= RULE_INT )
            {
            // InternalSFDSL.g:3739:4: (lv_value_1_0= RULE_INT )
            // InternalSFDSL.g:3740:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIntegerLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalSFDSL.g:3760:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalSFDSL.g:3760:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalSFDSL.g:3761:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalSFDSL.g:3767:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleFLOAT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalSFDSL.g:3773:2: ( ( () ( (lv_value_1_0= ruleFLOAT ) ) ) )
            // InternalSFDSL.g:3774:2: ( () ( (lv_value_1_0= ruleFLOAT ) ) )
            {
            // InternalSFDSL.g:3774:2: ( () ( (lv_value_1_0= ruleFLOAT ) ) )
            // InternalSFDSL.g:3775:3: () ( (lv_value_1_0= ruleFLOAT ) )
            {
            // InternalSFDSL.g:3775:3: ()
            // InternalSFDSL.g:3776:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalSFDSL.g:3782:3: ( (lv_value_1_0= ruleFLOAT ) )
            // InternalSFDSL.g:3783:4: (lv_value_1_0= ruleFLOAT )
            {
            // InternalSFDSL.g:3783:4: (lv_value_1_0= ruleFLOAT )
            // InternalSFDSL.g:3784:5: lv_value_1_0= ruleFLOAT
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRealLiteralAccess().getValueFLOATParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleFLOAT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRealLiteralRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.xtext.sosModeling.archModeling.SFDSL.FLOAT");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalSFDSL.g:3805:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalSFDSL.g:3805:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalSFDSL.g:3806:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalSFDSL.g:3812:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalSFDSL.g:3818:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalSFDSL.g:3819:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalSFDSL.g:3819:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalSFDSL.g:3820:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalSFDSL.g:3820:3: ()
            // InternalSFDSL.g:3821:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalSFDSL.g:3827:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalSFDSL.g:3828:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalSFDSL.g:3828:4: (lv_value_1_0= RULE_STRING )
            // InternalSFDSL.g:3829:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStringLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalSFDSL.g:3849:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalSFDSL.g:3849:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalSFDSL.g:3850:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalSFDSL.g:3856:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;


        	enterRule();

        try {
            // InternalSFDSL.g:3862:2: ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) )
            // InternalSFDSL.g:3863:2: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
            {
            // InternalSFDSL.g:3863:2: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
            // InternalSFDSL.g:3864:3: () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
            {
            // InternalSFDSL.g:3864:3: ()
            // InternalSFDSL.g:3865:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalSFDSL.g:3871:3: ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
            // InternalSFDSL.g:3872:4: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
            {
            // InternalSFDSL.g:3872:4: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
            // InternalSFDSL.g:3873:5: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
            {
            // InternalSFDSL.g:3873:5: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==59) ) {
                alt46=1;
            }
            else if ( (LA46_0==60) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalSFDSL.g:3874:6: lv_value_1_1= 'true'
                    {
                    lv_value_1_1=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_1, grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBooleanLiteralRule());
                      						}
                      						setWithLastConsumed(current, "value", lv_value_1_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalSFDSL.g:3885:6: lv_value_1_2= 'false'
                    {
                    lv_value_1_2=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_2, grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBooleanLiteralRule());
                      						}
                      						setWithLastConsumed(current, "value", lv_value_1_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanLiteral"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0005300010001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0001300010001800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0001300010000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000300010000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000300000008002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x07E0000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x07E0000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x07E0000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x1800080000800070L,0x0000000000000400L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000010004010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000002010000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000010010000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000040010000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x1800000000000060L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000002L,0x000000000000001EL});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000380L});

}