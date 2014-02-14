package com.opcoach.dsgen.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.opcoach.dsgen.xtext.services.DSGenDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSGenDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DSGenModel'", "'{'", "'randomSeed'", "'language'", "'dsgenPackages'", "','", "'}'", "'badGenerators'", "'DSGenPackage'", "'ecorePackage'", "'dsgenClassifiers'", "'-'", "'BadValueGeneratorRegistry'", "'generators'", "'EPackage'", "'nsURI'", "'nsPrefix'", "'eAnnotations'", "'eClassifiers'", "'eSubpackages'", "'EAnnotation'", "'source'", "'references'", "'('", "')'", "'details'", "'contents'", "'EStringToStringMapEntry'", "'key'", "'value'", "'EObject'", "'ETypeParameter'", "'eBounds'", "'abstract'", "'interface'", "'EClass'", "'instanceClassName'", "'instanceTypeName'", "'eSuperTypes'", "'eTypeParameters'", "'eOperations'", "'eStructuralFeatures'", "'eGenericSuperTypes'", "'EDataType'", "'serializable'", "'EEnum'", "'eLiterals'", "'EGenericType'", "'eTypeParameter'", "'eClassifier'", "'eUpperBound'", "'eTypeArguments'", "'eLowerBound'", "'true'", "'false'", "'EOperation'", "'ordered'", "'unique'", "'lowerBound'", "'upperBound'", "'eType'", "'eExceptions'", "'eGenericType'", "'eParameters'", "'eGenericExceptions'", "'EParameter'", "'volatile'", "'transient'", "'unsettable'", "'derived'", "'iD'", "'EAttribute'", "'changeable'", "'defaultValueLiteral'", "'containment'", "'EReference'", "'resolveProxies'", "'eOpposite'", "'eKeys'", "'EEnumLiteral'", "'literal'", "'DSGenFeature'", "'ecoreFeature'", "'generator'", "'DSGenClass'", "'ecoreClass'", "'dsgenFeatures'", "'DSGenDataType'", "'dataType'", "'DSGenEnum'", "'ecoreEnum'", "'DSGenAttribute'", "'DSGenReference'", "'targetDSGenClass'", "'Locale'", "'ReferenceGenerator'", "'badValueProportion'", "'ID'", "'locale'", "'step'", "'badValueGenerator'", "'EObjectGenerator'"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=5;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=4;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalDSGenDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDSGenDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDSGenDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g"; }



     	private DSGenDSLGrammarAccess grammarAccess;
     	
        public InternalDSGenDSLParser(TokenStream input, DSGenDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DSGenModel";	
       	}
       	
       	@Override
       	protected DSGenDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDSGenModel"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:67:1: entryRuleDSGenModel returns [EObject current=null] : iv_ruleDSGenModel= ruleDSGenModel EOF ;
    public final EObject entryRuleDSGenModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSGenModel = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:68:2: (iv_ruleDSGenModel= ruleDSGenModel EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:69:2: iv_ruleDSGenModel= ruleDSGenModel EOF
            {
             newCompositeNode(grammarAccess.getDSGenModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDSGenModel_in_entryRuleDSGenModel75);
            iv_ruleDSGenModel=ruleDSGenModel();

            state._fsp--;

             current =iv_ruleDSGenModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDSGenModel85); 

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
    // $ANTLR end "entryRuleDSGenModel"


    // $ANTLR start "ruleDSGenModel"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:76:1: ruleDSGenModel returns [EObject current=null] : (otherlv_0= 'DSGenModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'randomSeed' ( (lv_randomSeed_4_0= ruleELong ) ) )? (otherlv_5= 'language' ( (lv_language_6_0= ruleEString ) ) )? (otherlv_7= 'dsgenPackages' otherlv_8= '{' ( (lv_dsgenPackages_9_0= ruleDSGenPackage ) ) (otherlv_10= ',' ( (lv_dsgenPackages_11_0= ruleDSGenPackage ) ) )* otherlv_12= '}' )? otherlv_13= 'badGenerators' ( (lv_badGenerators_14_0= ruleBadValueGeneratorRegistry ) ) otherlv_15= '}' ) ;
    public final EObject ruleDSGenModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_randomSeed_4_0 = null;

        AntlrDatatypeRuleToken lv_language_6_0 = null;

        EObject lv_dsgenPackages_9_0 = null;

        EObject lv_dsgenPackages_11_0 = null;

        EObject lv_badGenerators_14_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:79:28: ( (otherlv_0= 'DSGenModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'randomSeed' ( (lv_randomSeed_4_0= ruleELong ) ) )? (otherlv_5= 'language' ( (lv_language_6_0= ruleEString ) ) )? (otherlv_7= 'dsgenPackages' otherlv_8= '{' ( (lv_dsgenPackages_9_0= ruleDSGenPackage ) ) (otherlv_10= ',' ( (lv_dsgenPackages_11_0= ruleDSGenPackage ) ) )* otherlv_12= '}' )? otherlv_13= 'badGenerators' ( (lv_badGenerators_14_0= ruleBadValueGeneratorRegistry ) ) otherlv_15= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:80:1: (otherlv_0= 'DSGenModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'randomSeed' ( (lv_randomSeed_4_0= ruleELong ) ) )? (otherlv_5= 'language' ( (lv_language_6_0= ruleEString ) ) )? (otherlv_7= 'dsgenPackages' otherlv_8= '{' ( (lv_dsgenPackages_9_0= ruleDSGenPackage ) ) (otherlv_10= ',' ( (lv_dsgenPackages_11_0= ruleDSGenPackage ) ) )* otherlv_12= '}' )? otherlv_13= 'badGenerators' ( (lv_badGenerators_14_0= ruleBadValueGeneratorRegistry ) ) otherlv_15= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:80:1: (otherlv_0= 'DSGenModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'randomSeed' ( (lv_randomSeed_4_0= ruleELong ) ) )? (otherlv_5= 'language' ( (lv_language_6_0= ruleEString ) ) )? (otherlv_7= 'dsgenPackages' otherlv_8= '{' ( (lv_dsgenPackages_9_0= ruleDSGenPackage ) ) (otherlv_10= ',' ( (lv_dsgenPackages_11_0= ruleDSGenPackage ) ) )* otherlv_12= '}' )? otherlv_13= 'badGenerators' ( (lv_badGenerators_14_0= ruleBadValueGeneratorRegistry ) ) otherlv_15= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:80:3: otherlv_0= 'DSGenModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'randomSeed' ( (lv_randomSeed_4_0= ruleELong ) ) )? (otherlv_5= 'language' ( (lv_language_6_0= ruleEString ) ) )? (otherlv_7= 'dsgenPackages' otherlv_8= '{' ( (lv_dsgenPackages_9_0= ruleDSGenPackage ) ) (otherlv_10= ',' ( (lv_dsgenPackages_11_0= ruleDSGenPackage ) ) )* otherlv_12= '}' )? otherlv_13= 'badGenerators' ( (lv_badGenerators_14_0= ruleBadValueGeneratorRegistry ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleDSGenModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getDSGenModelAccess().getDSGenModelKeyword_0());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:84:1: ( (lv_name_1_0= ruleEString ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:85:1: (lv_name_1_0= ruleEString )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:85:1: (lv_name_1_0= ruleEString )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:86:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDSGenModelAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDSGenModel143);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSGenModelRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDSGenModel155); 

                	newLeafNode(otherlv_2, grammarAccess.getDSGenModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:106:1: (otherlv_3= 'randomSeed' ( (lv_randomSeed_4_0= ruleELong ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:106:3: otherlv_3= 'randomSeed' ( (lv_randomSeed_4_0= ruleELong ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDSGenModel168); 

                        	newLeafNode(otherlv_3, grammarAccess.getDSGenModelAccess().getRandomSeedKeyword_3_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:110:1: ( (lv_randomSeed_4_0= ruleELong ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:111:1: (lv_randomSeed_4_0= ruleELong )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:111:1: (lv_randomSeed_4_0= ruleELong )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:112:3: lv_randomSeed_4_0= ruleELong
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSGenModelAccess().getRandomSeedELongParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleELong_in_ruleDSGenModel189);
                    lv_randomSeed_4_0=ruleELong();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSGenModelRule());
                    	        }
                           		set(
                           			current, 
                           			"randomSeed",
                            		lv_randomSeed_4_0, 
                            		"ELong");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:128:4: (otherlv_5= 'language' ( (lv_language_6_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:128:6: otherlv_5= 'language' ( (lv_language_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDSGenModel204); 

                        	newLeafNode(otherlv_5, grammarAccess.getDSGenModelAccess().getLanguageKeyword_4_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:132:1: ( (lv_language_6_0= ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:133:1: (lv_language_6_0= ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:133:1: (lv_language_6_0= ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:134:3: lv_language_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSGenModelAccess().getLanguageEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDSGenModel225);
                    lv_language_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSGenModelRule());
                    	        }
                           		set(
                           			current, 
                           			"language",
                            		lv_language_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:150:4: (otherlv_7= 'dsgenPackages' otherlv_8= '{' ( (lv_dsgenPackages_9_0= ruleDSGenPackage ) ) (otherlv_10= ',' ( (lv_dsgenPackages_11_0= ruleDSGenPackage ) ) )* otherlv_12= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:150:6: otherlv_7= 'dsgenPackages' otherlv_8= '{' ( (lv_dsgenPackages_9_0= ruleDSGenPackage ) ) (otherlv_10= ',' ( (lv_dsgenPackages_11_0= ruleDSGenPackage ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDSGenModel240); 

                        	newLeafNode(otherlv_7, grammarAccess.getDSGenModelAccess().getDsgenPackagesKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDSGenModel252); 

                        	newLeafNode(otherlv_8, grammarAccess.getDSGenModelAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:158:1: ( (lv_dsgenPackages_9_0= ruleDSGenPackage ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:159:1: (lv_dsgenPackages_9_0= ruleDSGenPackage )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:159:1: (lv_dsgenPackages_9_0= ruleDSGenPackage )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:160:3: lv_dsgenPackages_9_0= ruleDSGenPackage
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSGenModelAccess().getDsgenPackagesDSGenPackageParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDSGenPackage_in_ruleDSGenModel273);
                    lv_dsgenPackages_9_0=ruleDSGenPackage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSGenModelRule());
                    	        }
                           		add(
                           			current, 
                           			"dsgenPackages",
                            		lv_dsgenPackages_9_0, 
                            		"DSGenPackage");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:176:2: (otherlv_10= ',' ( (lv_dsgenPackages_11_0= ruleDSGenPackage ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:176:4: otherlv_10= ',' ( (lv_dsgenPackages_11_0= ruleDSGenPackage ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDSGenModel286); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getDSGenModelAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:180:1: ( (lv_dsgenPackages_11_0= ruleDSGenPackage ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:181:1: (lv_dsgenPackages_11_0= ruleDSGenPackage )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:181:1: (lv_dsgenPackages_11_0= ruleDSGenPackage )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:182:3: lv_dsgenPackages_11_0= ruleDSGenPackage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDSGenModelAccess().getDsgenPackagesDSGenPackageParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDSGenPackage_in_ruleDSGenModel307);
                    	    lv_dsgenPackages_11_0=ruleDSGenPackage();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDSGenModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"dsgenPackages",
                    	            		lv_dsgenPackages_11_0, 
                    	            		"DSGenPackage");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDSGenModel321); 

                        	newLeafNode(otherlv_12, grammarAccess.getDSGenModelAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDSGenModel335); 

                	newLeafNode(otherlv_13, grammarAccess.getDSGenModelAccess().getBadGeneratorsKeyword_6());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:206:1: ( (lv_badGenerators_14_0= ruleBadValueGeneratorRegistry ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:207:1: (lv_badGenerators_14_0= ruleBadValueGeneratorRegistry )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:207:1: (lv_badGenerators_14_0= ruleBadValueGeneratorRegistry )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:208:3: lv_badGenerators_14_0= ruleBadValueGeneratorRegistry
            {
             
            	        newCompositeNode(grammarAccess.getDSGenModelAccess().getBadGeneratorsBadValueGeneratorRegistryParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBadValueGeneratorRegistry_in_ruleDSGenModel356);
            lv_badGenerators_14_0=ruleBadValueGeneratorRegistry();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSGenModelRule());
            	        }
                   		set(
                   			current, 
                   			"badGenerators",
                    		lv_badGenerators_14_0, 
                    		"BadValueGeneratorRegistry");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDSGenModel368); 

                	newLeafNode(otherlv_15, grammarAccess.getDSGenModelAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleDSGenModel"


    // $ANTLR start "entryRuleDSGenClassifier"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:236:1: entryRuleDSGenClassifier returns [EObject current=null] : iv_ruleDSGenClassifier= ruleDSGenClassifier EOF ;
    public final EObject entryRuleDSGenClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSGenClassifier = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:237:2: (iv_ruleDSGenClassifier= ruleDSGenClassifier EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:238:2: iv_ruleDSGenClassifier= ruleDSGenClassifier EOF
            {
             newCompositeNode(grammarAccess.getDSGenClassifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDSGenClassifier_in_entryRuleDSGenClassifier404);
            iv_ruleDSGenClassifier=ruleDSGenClassifier();

            state._fsp--;

             current =iv_ruleDSGenClassifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDSGenClassifier414); 

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
    // $ANTLR end "entryRuleDSGenClassifier"


    // $ANTLR start "ruleDSGenClassifier"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:245:1: ruleDSGenClassifier returns [EObject current=null] : (this_DSGenClass_0= ruleDSGenClass | this_DSGenDataType_Impl_1= ruleDSGenDataType_Impl | this_DSGenEnum_2= ruleDSGenEnum ) ;
    public final EObject ruleDSGenClassifier() throws RecognitionException {
        EObject current = null;

        EObject this_DSGenClass_0 = null;

        EObject this_DSGenDataType_Impl_1 = null;

        EObject this_DSGenEnum_2 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:248:28: ( (this_DSGenClass_0= ruleDSGenClass | this_DSGenDataType_Impl_1= ruleDSGenDataType_Impl | this_DSGenEnum_2= ruleDSGenEnum ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:249:1: (this_DSGenClass_0= ruleDSGenClass | this_DSGenDataType_Impl_1= ruleDSGenDataType_Impl | this_DSGenEnum_2= ruleDSGenEnum )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:249:1: (this_DSGenClass_0= ruleDSGenClass | this_DSGenDataType_Impl_1= ruleDSGenDataType_Impl | this_DSGenEnum_2= ruleDSGenEnum )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt5=1;
                }
                break;
            case 98:
                {
                alt5=2;
                }
                break;
            case 100:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:250:5: this_DSGenClass_0= ruleDSGenClass
                    {
                     
                            newCompositeNode(grammarAccess.getDSGenClassifierAccess().getDSGenClassParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDSGenClass_in_ruleDSGenClassifier461);
                    this_DSGenClass_0=ruleDSGenClass();

                    state._fsp--;

                     
                            current = this_DSGenClass_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:260:5: this_DSGenDataType_Impl_1= ruleDSGenDataType_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getDSGenClassifierAccess().getDSGenDataType_ImplParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDSGenDataType_Impl_in_ruleDSGenClassifier488);
                    this_DSGenDataType_Impl_1=ruleDSGenDataType_Impl();

                    state._fsp--;

                     
                            current = this_DSGenDataType_Impl_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:270:5: this_DSGenEnum_2= ruleDSGenEnum
                    {
                     
                            newCompositeNode(grammarAccess.getDSGenClassifierAccess().getDSGenEnumParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDSGenEnum_in_ruleDSGenClassifier515);
                    this_DSGenEnum_2=ruleDSGenEnum();

                    state._fsp--;

                     
                            current = this_DSGenEnum_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleDSGenClassifier"


    // $ANTLR start "entryRuleValueGenerator"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:286:1: entryRuleValueGenerator returns [EObject current=null] : iv_ruleValueGenerator= ruleValueGenerator EOF ;
    public final EObject entryRuleValueGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueGenerator = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:287:2: (iv_ruleValueGenerator= ruleValueGenerator EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:288:2: iv_ruleValueGenerator= ruleValueGenerator EOF
            {
             newCompositeNode(grammarAccess.getValueGeneratorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValueGenerator_in_entryRuleValueGenerator550);
            iv_ruleValueGenerator=ruleValueGenerator();

            state._fsp--;

             current =iv_ruleValueGenerator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValueGenerator560); 

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
    // $ANTLR end "entryRuleValueGenerator"


    // $ANTLR start "ruleValueGenerator"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:295:1: ruleValueGenerator returns [EObject current=null] : this_ReferenceGenerator_0= ruleReferenceGenerator ;
    public final EObject ruleValueGenerator() throws RecognitionException {
        EObject current = null;

        EObject this_ReferenceGenerator_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:298:28: (this_ReferenceGenerator_0= ruleReferenceGenerator )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:300:5: this_ReferenceGenerator_0= ruleReferenceGenerator
            {
             
                    newCompositeNode(grammarAccess.getValueGeneratorAccess().getReferenceGeneratorParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleReferenceGenerator_in_ruleValueGenerator606);
            this_ReferenceGenerator_0=ruleReferenceGenerator();

            state._fsp--;

             
                    current = this_ReferenceGenerator_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleValueGenerator"


    // $ANTLR start "entryRuleEClassifier"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:316:1: entryRuleEClassifier returns [EObject current=null] : iv_ruleEClassifier= ruleEClassifier EOF ;
    public final EObject entryRuleEClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClassifier = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:317:2: (iv_ruleEClassifier= ruleEClassifier EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:318:2: iv_ruleEClassifier= ruleEClassifier EOF
            {
             newCompositeNode(grammarAccess.getEClassifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEClassifier_in_entryRuleEClassifier640);
            iv_ruleEClassifier=ruleEClassifier();

            state._fsp--;

             current =iv_ruleEClassifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEClassifier650); 

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
    // $ANTLR end "entryRuleEClassifier"


    // $ANTLR start "ruleEClassifier"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:325:1: ruleEClassifier returns [EObject current=null] : (this_EClass_0= ruleEClass | this_EDataType_Impl_1= ruleEDataType_Impl | this_EEnum_2= ruleEEnum ) ;
    public final EObject ruleEClassifier() throws RecognitionException {
        EObject current = null;

        EObject this_EClass_0 = null;

        EObject this_EDataType_Impl_1 = null;

        EObject this_EEnum_2 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:328:28: ( (this_EClass_0= ruleEClass | this_EDataType_Impl_1= ruleEDataType_Impl | this_EEnum_2= ruleEEnum ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:329:1: (this_EClass_0= ruleEClass | this_EDataType_Impl_1= ruleEDataType_Impl | this_EEnum_2= ruleEEnum )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:329:1: (this_EClass_0= ruleEClass | this_EDataType_Impl_1= ruleEDataType_Impl | this_EEnum_2= ruleEEnum )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 44:
            case 45:
            case 46:
                {
                alt6=1;
                }
                break;
            case 54:
                {
                alt6=2;
                }
                break;
            case 56:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:330:5: this_EClass_0= ruleEClass
                    {
                     
                            newCompositeNode(grammarAccess.getEClassifierAccess().getEClassParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEClass_in_ruleEClassifier697);
                    this_EClass_0=ruleEClass();

                    state._fsp--;

                     
                            current = this_EClass_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:340:5: this_EDataType_Impl_1= ruleEDataType_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getEClassifierAccess().getEDataType_ImplParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEDataType_Impl_in_ruleEClassifier724);
                    this_EDataType_Impl_1=ruleEDataType_Impl();

                    state._fsp--;

                     
                            current = this_EDataType_Impl_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:350:5: this_EEnum_2= ruleEEnum
                    {
                     
                            newCompositeNode(grammarAccess.getEClassifierAccess().getEEnumParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEEnum_in_ruleEClassifier751);
                    this_EEnum_2=ruleEEnum();

                    state._fsp--;

                     
                            current = this_EEnum_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleEClassifier"


    // $ANTLR start "entryRuleEStructuralFeature"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:366:1: entryRuleEStructuralFeature returns [EObject current=null] : iv_ruleEStructuralFeature= ruleEStructuralFeature EOF ;
    public final EObject entryRuleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStructuralFeature = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:367:2: (iv_ruleEStructuralFeature= ruleEStructuralFeature EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:368:2: iv_ruleEStructuralFeature= ruleEStructuralFeature EOF
            {
             newCompositeNode(grammarAccess.getEStructuralFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEStructuralFeature_in_entryRuleEStructuralFeature786);
            iv_ruleEStructuralFeature=ruleEStructuralFeature();

            state._fsp--;

             current =iv_ruleEStructuralFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEStructuralFeature796); 

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
    // $ANTLR end "entryRuleEStructuralFeature"


    // $ANTLR start "ruleEStructuralFeature"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:375:1: ruleEStructuralFeature returns [EObject current=null] : (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) ;
    public final EObject ruleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject this_EAttribute_0 = null;

        EObject this_EReference_1 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:378:28: ( (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:379:1: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:379:1: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            int alt7=2;
            switch ( input.LA(1) ) {
            case 77:
                {
                switch ( input.LA(2) ) {
                case 78:
                    {
                    switch ( input.LA(3) ) {
                    case 79:
                        {
                        switch ( input.LA(4) ) {
                        case 80:
                            {
                            int LA7_4 = input.LA(5);

                            if ( ((LA7_4>=85 && LA7_4<=86)) ) {
                                alt7=2;
                            }
                            else if ( ((LA7_4>=81 && LA7_4<=82)) ) {
                                alt7=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 7, 4, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 85:
                        case 86:
                            {
                            alt7=2;
                            }
                            break;
                        case 81:
                        case 82:
                            {
                            alt7=1;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 80:
                        {
                        int LA7_4 = input.LA(4);

                        if ( ((LA7_4>=85 && LA7_4<=86)) ) {
                            alt7=2;
                        }
                        else if ( ((LA7_4>=81 && LA7_4<=82)) ) {
                            alt7=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 81:
                    case 82:
                        {
                        alt7=1;
                        }
                        break;
                    case 85:
                    case 86:
                        {
                        alt7=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case 79:
                    {
                    switch ( input.LA(3) ) {
                    case 80:
                        {
                        int LA7_4 = input.LA(4);

                        if ( ((LA7_4>=85 && LA7_4<=86)) ) {
                            alt7=2;
                        }
                        else if ( ((LA7_4>=81 && LA7_4<=82)) ) {
                            alt7=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 85:
                    case 86:
                        {
                        alt7=2;
                        }
                        break;
                    case 81:
                    case 82:
                        {
                        alt7=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 80:
                    {
                    int LA7_4 = input.LA(3);

                    if ( ((LA7_4>=85 && LA7_4<=86)) ) {
                        alt7=2;
                    }
                    else if ( ((LA7_4>=81 && LA7_4<=82)) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 81:
                case 82:
                    {
                    alt7=1;
                    }
                    break;
                case 85:
                case 86:
                    {
                    alt7=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }

                }
                break;
            case 78:
                {
                switch ( input.LA(2) ) {
                case 79:
                    {
                    switch ( input.LA(3) ) {
                    case 80:
                        {
                        int LA7_4 = input.LA(4);

                        if ( ((LA7_4>=85 && LA7_4<=86)) ) {
                            alt7=2;
                        }
                        else if ( ((LA7_4>=81 && LA7_4<=82)) ) {
                            alt7=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 85:
                    case 86:
                        {
                        alt7=2;
                        }
                        break;
                    case 81:
                    case 82:
                        {
                        alt7=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 80:
                    {
                    int LA7_4 = input.LA(3);

                    if ( ((LA7_4>=85 && LA7_4<=86)) ) {
                        alt7=2;
                    }
                    else if ( ((LA7_4>=81 && LA7_4<=82)) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 81:
                case 82:
                    {
                    alt7=1;
                    }
                    break;
                case 85:
                case 86:
                    {
                    alt7=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }

                }
                break;
            case 79:
                {
                switch ( input.LA(2) ) {
                case 80:
                    {
                    int LA7_4 = input.LA(3);

                    if ( ((LA7_4>=85 && LA7_4<=86)) ) {
                        alt7=2;
                    }
                    else if ( ((LA7_4>=81 && LA7_4<=82)) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 85:
                case 86:
                    {
                    alt7=2;
                    }
                    break;
                case 81:
                case 82:
                    {
                    alt7=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;
                }

                }
                break;
            case 80:
                {
                int LA7_4 = input.LA(2);

                if ( ((LA7_4>=85 && LA7_4<=86)) ) {
                    alt7=2;
                }
                else if ( ((LA7_4>=81 && LA7_4<=82)) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 4, input);

                    throw nvae;
                }
                }
                break;
            case 81:
            case 82:
                {
                alt7=1;
                }
                break;
            case 85:
            case 86:
                {
                alt7=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:380:5: this_EAttribute_0= ruleEAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getEStructuralFeatureAccess().getEAttributeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEAttribute_in_ruleEStructuralFeature843);
                    this_EAttribute_0=ruleEAttribute();

                    state._fsp--;

                     
                            current = this_EAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:390:5: this_EReference_1= ruleEReference
                    {
                     
                            newCompositeNode(grammarAccess.getEStructuralFeatureAccess().getEReferenceParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEReference_in_ruleEStructuralFeature870);
                    this_EReference_1=ruleEReference();

                    state._fsp--;

                     
                            current = this_EReference_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleEStructuralFeature"


    // $ANTLR start "entryRuleDSGenFeature"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:406:1: entryRuleDSGenFeature returns [EObject current=null] : iv_ruleDSGenFeature= ruleDSGenFeature EOF ;
    public final EObject entryRuleDSGenFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSGenFeature = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:407:2: (iv_ruleDSGenFeature= ruleDSGenFeature EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:408:2: iv_ruleDSGenFeature= ruleDSGenFeature EOF
            {
             newCompositeNode(grammarAccess.getDSGenFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDSGenFeature_in_entryRuleDSGenFeature905);
            iv_ruleDSGenFeature=ruleDSGenFeature();

            state._fsp--;

             current =iv_ruleDSGenFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDSGenFeature915); 

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
    // $ANTLR end "entryRuleDSGenFeature"


    // $ANTLR start "ruleDSGenFeature"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:415:1: ruleDSGenFeature returns [EObject current=null] : (this_DSGenFeature_Impl_0= ruleDSGenFeature_Impl | this_DSGenAttribute_1= ruleDSGenAttribute | this_DSGenReference_2= ruleDSGenReference ) ;
    public final EObject ruleDSGenFeature() throws RecognitionException {
        EObject current = null;

        EObject this_DSGenFeature_Impl_0 = null;

        EObject this_DSGenAttribute_1 = null;

        EObject this_DSGenReference_2 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:418:28: ( (this_DSGenFeature_Impl_0= ruleDSGenFeature_Impl | this_DSGenAttribute_1= ruleDSGenAttribute | this_DSGenReference_2= ruleDSGenReference ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:419:1: (this_DSGenFeature_Impl_0= ruleDSGenFeature_Impl | this_DSGenAttribute_1= ruleDSGenAttribute | this_DSGenReference_2= ruleDSGenReference )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:419:1: (this_DSGenFeature_Impl_0= ruleDSGenFeature_Impl | this_DSGenAttribute_1= ruleDSGenAttribute | this_DSGenReference_2= ruleDSGenReference )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt8=1;
                }
                break;
            case 102:
                {
                alt8=2;
                }
                break;
            case 103:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:420:5: this_DSGenFeature_Impl_0= ruleDSGenFeature_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getDSGenFeatureAccess().getDSGenFeature_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDSGenFeature_Impl_in_ruleDSGenFeature962);
                    this_DSGenFeature_Impl_0=ruleDSGenFeature_Impl();

                    state._fsp--;

                     
                            current = this_DSGenFeature_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:430:5: this_DSGenAttribute_1= ruleDSGenAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getDSGenFeatureAccess().getDSGenAttributeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDSGenAttribute_in_ruleDSGenFeature989);
                    this_DSGenAttribute_1=ruleDSGenAttribute();

                    state._fsp--;

                     
                            current = this_DSGenAttribute_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:440:5: this_DSGenReference_2= ruleDSGenReference
                    {
                     
                            newCompositeNode(grammarAccess.getDSGenFeatureAccess().getDSGenReferenceParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDSGenReference_in_ruleDSGenFeature1016);
                    this_DSGenReference_2=ruleDSGenReference();

                    state._fsp--;

                     
                            current = this_DSGenReference_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleDSGenFeature"


    // $ANTLR start "entryRuleDSGenPackage"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:458:1: entryRuleDSGenPackage returns [EObject current=null] : iv_ruleDSGenPackage= ruleDSGenPackage EOF ;
    public final EObject entryRuleDSGenPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSGenPackage = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:459:2: (iv_ruleDSGenPackage= ruleDSGenPackage EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:460:2: iv_ruleDSGenPackage= ruleDSGenPackage EOF
            {
             newCompositeNode(grammarAccess.getDSGenPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDSGenPackage_in_entryRuleDSGenPackage1053);
            iv_ruleDSGenPackage=ruleDSGenPackage();

            state._fsp--;

             current =iv_ruleDSGenPackage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDSGenPackage1063); 

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
    // $ANTLR end "entryRuleDSGenPackage"


    // $ANTLR start "ruleDSGenPackage"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:467:1: ruleDSGenPackage returns [EObject current=null] : (otherlv_0= 'DSGenPackage' otherlv_1= '{' otherlv_2= 'ecorePackage' ( ( ruleEString ) ) (otherlv_4= 'dsgenClassifiers' otherlv_5= '{' ( (lv_dsgenClassifiers_6_0= ruleDSGenClassifier ) ) (otherlv_7= ',' ( (lv_dsgenClassifiers_8_0= ruleDSGenClassifier ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleDSGenPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_dsgenClassifiers_6_0 = null;

        EObject lv_dsgenClassifiers_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:470:28: ( (otherlv_0= 'DSGenPackage' otherlv_1= '{' otherlv_2= 'ecorePackage' ( ( ruleEString ) ) (otherlv_4= 'dsgenClassifiers' otherlv_5= '{' ( (lv_dsgenClassifiers_6_0= ruleDSGenClassifier ) ) (otherlv_7= ',' ( (lv_dsgenClassifiers_8_0= ruleDSGenClassifier ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:471:1: (otherlv_0= 'DSGenPackage' otherlv_1= '{' otherlv_2= 'ecorePackage' ( ( ruleEString ) ) (otherlv_4= 'dsgenClassifiers' otherlv_5= '{' ( (lv_dsgenClassifiers_6_0= ruleDSGenClassifier ) ) (otherlv_7= ',' ( (lv_dsgenClassifiers_8_0= ruleDSGenClassifier ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:471:1: (otherlv_0= 'DSGenPackage' otherlv_1= '{' otherlv_2= 'ecorePackage' ( ( ruleEString ) ) (otherlv_4= 'dsgenClassifiers' otherlv_5= '{' ( (lv_dsgenClassifiers_6_0= ruleDSGenClassifier ) ) (otherlv_7= ',' ( (lv_dsgenClassifiers_8_0= ruleDSGenClassifier ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:471:3: otherlv_0= 'DSGenPackage' otherlv_1= '{' otherlv_2= 'ecorePackage' ( ( ruleEString ) ) (otherlv_4= 'dsgenClassifiers' otherlv_5= '{' ( (lv_dsgenClassifiers_6_0= ruleDSGenClassifier ) ) (otherlv_7= ',' ( (lv_dsgenClassifiers_8_0= ruleDSGenClassifier ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDSGenPackage1100); 

                	newLeafNode(otherlv_0, grammarAccess.getDSGenPackageAccess().getDSGenPackageKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDSGenPackage1112); 

                	newLeafNode(otherlv_1, grammarAccess.getDSGenPackageAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDSGenPackage1124); 

                	newLeafNode(otherlv_2, grammarAccess.getDSGenPackageAccess().getEcorePackageKeyword_2());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:483:1: ( ( ruleEString ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:484:1: ( ruleEString )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:484:1: ( ruleEString )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:485:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDSGenPackageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDSGenPackageAccess().getEcorePackageEPackageCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDSGenPackage1147);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:498:2: (otherlv_4= 'dsgenClassifiers' otherlv_5= '{' ( (lv_dsgenClassifiers_6_0= ruleDSGenClassifier ) ) (otherlv_7= ',' ( (lv_dsgenClassifiers_8_0= ruleDSGenClassifier ) ) )* otherlv_9= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:498:4: otherlv_4= 'dsgenClassifiers' otherlv_5= '{' ( (lv_dsgenClassifiers_6_0= ruleDSGenClassifier ) ) (otherlv_7= ',' ( (lv_dsgenClassifiers_8_0= ruleDSGenClassifier ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleDSGenPackage1160); 

                        	newLeafNode(otherlv_4, grammarAccess.getDSGenPackageAccess().getDsgenClassifiersKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDSGenPackage1172); 

                        	newLeafNode(otherlv_5, grammarAccess.getDSGenPackageAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:506:1: ( (lv_dsgenClassifiers_6_0= ruleDSGenClassifier ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:507:1: (lv_dsgenClassifiers_6_0= ruleDSGenClassifier )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:507:1: (lv_dsgenClassifiers_6_0= ruleDSGenClassifier )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:508:3: lv_dsgenClassifiers_6_0= ruleDSGenClassifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSGenPackageAccess().getDsgenClassifiersDSGenClassifierParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDSGenClassifier_in_ruleDSGenPackage1193);
                    lv_dsgenClassifiers_6_0=ruleDSGenClassifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSGenPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"dsgenClassifiers",
                            		lv_dsgenClassifiers_6_0, 
                            		"DSGenClassifier");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:524:2: (otherlv_7= ',' ( (lv_dsgenClassifiers_8_0= ruleDSGenClassifier ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:524:4: otherlv_7= ',' ( (lv_dsgenClassifiers_8_0= ruleDSGenClassifier ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDSGenPackage1206); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getDSGenPackageAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:528:1: ( (lv_dsgenClassifiers_8_0= ruleDSGenClassifier ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:529:1: (lv_dsgenClassifiers_8_0= ruleDSGenClassifier )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:529:1: (lv_dsgenClassifiers_8_0= ruleDSGenClassifier )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:530:3: lv_dsgenClassifiers_8_0= ruleDSGenClassifier
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDSGenPackageAccess().getDsgenClassifiersDSGenClassifierParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDSGenClassifier_in_ruleDSGenPackage1227);
                    	    lv_dsgenClassifiers_8_0=ruleDSGenClassifier();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDSGenPackageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"dsgenClassifiers",
                    	            		lv_dsgenClassifiers_8_0, 
                    	            		"DSGenClassifier");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDSGenPackage1241); 

                        	newLeafNode(otherlv_9, grammarAccess.getDSGenPackageAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDSGenPackage1255); 

                	newLeafNode(otherlv_10, grammarAccess.getDSGenPackageAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleDSGenPackage"


    // $ANTLR start "entryRuleELong"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:562:1: entryRuleELong returns [String current=null] : iv_ruleELong= ruleELong EOF ;
    public final String entryRuleELong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELong = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:563:2: (iv_ruleELong= ruleELong EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:564:2: iv_ruleELong= ruleELong EOF
            {
             newCompositeNode(grammarAccess.getELongRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleELong_in_entryRuleELong1292);
            iv_ruleELong=ruleELong();

            state._fsp--;

             current =iv_ruleELong.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleELong1303); 

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
    // $ANTLR end "entryRuleELong"


    // $ANTLR start "ruleELong"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:571:1: ruleELong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleELong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:574:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:575:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:575:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:575:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:575:2: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:576:2: kw= '-'
                    {
                    kw=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleELong1342); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleELong1359); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getELongAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleELong"


    // $ANTLR start "entryRuleEString"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:596:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:597:2: (iv_ruleEString= ruleEString EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:598:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1405);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1416); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:605:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:608:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:609:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:609:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:609:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1456); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:617:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1482); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleBadValueGeneratorRegistry"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:632:1: entryRuleBadValueGeneratorRegistry returns [EObject current=null] : iv_ruleBadValueGeneratorRegistry= ruleBadValueGeneratorRegistry EOF ;
    public final EObject entryRuleBadValueGeneratorRegistry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBadValueGeneratorRegistry = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:633:2: (iv_ruleBadValueGeneratorRegistry= ruleBadValueGeneratorRegistry EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:634:2: iv_ruleBadValueGeneratorRegistry= ruleBadValueGeneratorRegistry EOF
            {
             newCompositeNode(grammarAccess.getBadValueGeneratorRegistryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBadValueGeneratorRegistry_in_entryRuleBadValueGeneratorRegistry1527);
            iv_ruleBadValueGeneratorRegistry=ruleBadValueGeneratorRegistry();

            state._fsp--;

             current =iv_ruleBadValueGeneratorRegistry; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBadValueGeneratorRegistry1537); 

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
    // $ANTLR end "entryRuleBadValueGeneratorRegistry"


    // $ANTLR start "ruleBadValueGeneratorRegistry"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:641:1: ruleBadValueGeneratorRegistry returns [EObject current=null] : ( () otherlv_1= 'BadValueGeneratorRegistry' otherlv_2= '{' (otherlv_3= 'generators' otherlv_4= '{' ( (lv_generators_5_0= ruleValueGenerator ) ) (otherlv_6= ',' ( (lv_generators_7_0= ruleValueGenerator ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleBadValueGeneratorRegistry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_generators_5_0 = null;

        EObject lv_generators_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:644:28: ( ( () otherlv_1= 'BadValueGeneratorRegistry' otherlv_2= '{' (otherlv_3= 'generators' otherlv_4= '{' ( (lv_generators_5_0= ruleValueGenerator ) ) (otherlv_6= ',' ( (lv_generators_7_0= ruleValueGenerator ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:645:1: ( () otherlv_1= 'BadValueGeneratorRegistry' otherlv_2= '{' (otherlv_3= 'generators' otherlv_4= '{' ( (lv_generators_5_0= ruleValueGenerator ) ) (otherlv_6= ',' ( (lv_generators_7_0= ruleValueGenerator ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:645:1: ( () otherlv_1= 'BadValueGeneratorRegistry' otherlv_2= '{' (otherlv_3= 'generators' otherlv_4= '{' ( (lv_generators_5_0= ruleValueGenerator ) ) (otherlv_6= ',' ( (lv_generators_7_0= ruleValueGenerator ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:645:2: () otherlv_1= 'BadValueGeneratorRegistry' otherlv_2= '{' (otherlv_3= 'generators' otherlv_4= '{' ( (lv_generators_5_0= ruleValueGenerator ) ) (otherlv_6= ',' ( (lv_generators_7_0= ruleValueGenerator ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:645:2: ()
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:646:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBadValueGeneratorRegistryAccess().getBadValueGeneratorRegistryAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBadValueGeneratorRegistry1583); 

                	newLeafNode(otherlv_1, grammarAccess.getBadValueGeneratorRegistryAccess().getBadValueGeneratorRegistryKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBadValueGeneratorRegistry1595); 

                	newLeafNode(otherlv_2, grammarAccess.getBadValueGeneratorRegistryAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:659:1: (otherlv_3= 'generators' otherlv_4= '{' ( (lv_generators_5_0= ruleValueGenerator ) ) (otherlv_6= ',' ( (lv_generators_7_0= ruleValueGenerator ) ) )* otherlv_8= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:659:3: otherlv_3= 'generators' otherlv_4= '{' ( (lv_generators_5_0= ruleValueGenerator ) ) (otherlv_6= ',' ( (lv_generators_7_0= ruleValueGenerator ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleBadValueGeneratorRegistry1608); 

                        	newLeafNode(otherlv_3, grammarAccess.getBadValueGeneratorRegistryAccess().getGeneratorsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBadValueGeneratorRegistry1620); 

                        	newLeafNode(otherlv_4, grammarAccess.getBadValueGeneratorRegistryAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:667:1: ( (lv_generators_5_0= ruleValueGenerator ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:668:1: (lv_generators_5_0= ruleValueGenerator )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:668:1: (lv_generators_5_0= ruleValueGenerator )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:669:3: lv_generators_5_0= ruleValueGenerator
                    {
                     
                    	        newCompositeNode(grammarAccess.getBadValueGeneratorRegistryAccess().getGeneratorsValueGeneratorParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleValueGenerator_in_ruleBadValueGeneratorRegistry1641);
                    lv_generators_5_0=ruleValueGenerator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBadValueGeneratorRegistryRule());
                    	        }
                           		add(
                           			current, 
                           			"generators",
                            		lv_generators_5_0, 
                            		"ValueGenerator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:685:2: (otherlv_6= ',' ( (lv_generators_7_0= ruleValueGenerator ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==16) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:685:4: otherlv_6= ',' ( (lv_generators_7_0= ruleValueGenerator ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBadValueGeneratorRegistry1654); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getBadValueGeneratorRegistryAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:689:1: ( (lv_generators_7_0= ruleValueGenerator ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:690:1: (lv_generators_7_0= ruleValueGenerator )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:690:1: (lv_generators_7_0= ruleValueGenerator )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:691:3: lv_generators_7_0= ruleValueGenerator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBadValueGeneratorRegistryAccess().getGeneratorsValueGeneratorParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleValueGenerator_in_ruleBadValueGeneratorRegistry1675);
                    	    lv_generators_7_0=ruleValueGenerator();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBadValueGeneratorRegistryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"generators",
                    	            		lv_generators_7_0, 
                    	            		"ValueGenerator");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBadValueGeneratorRegistry1689); 

                        	newLeafNode(otherlv_8, grammarAccess.getBadValueGeneratorRegistryAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBadValueGeneratorRegistry1703); 

                	newLeafNode(otherlv_9, grammarAccess.getBadValueGeneratorRegistryAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleBadValueGeneratorRegistry"


    // $ANTLR start "entryRuleEPackage"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:723:1: entryRuleEPackage returns [EObject current=null] : iv_ruleEPackage= ruleEPackage EOF ;
    public final EObject entryRuleEPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPackage = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:724:2: (iv_ruleEPackage= ruleEPackage EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:725:2: iv_ruleEPackage= ruleEPackage EOF
            {
             newCompositeNode(grammarAccess.getEPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEPackage_in_entryRuleEPackage1739);
            iv_ruleEPackage=ruleEPackage();

            state._fsp--;

             current =iv_ruleEPackage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEPackage1749); 

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
    // $ANTLR end "entryRuleEPackage"


    // $ANTLR start "ruleEPackage"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:732:1: ruleEPackage returns [EObject current=null] : ( () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) ;
    public final EObject ruleEPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_nsURI_5_0 = null;

        AntlrDatatypeRuleToken lv_nsPrefix_7_0 = null;

        EObject lv_eAnnotations_10_0 = null;

        EObject lv_eAnnotations_12_0 = null;

        EObject lv_eClassifiers_16_0 = null;

        EObject lv_eClassifiers_18_0 = null;

        EObject lv_eSubpackages_22_0 = null;

        EObject lv_eSubpackages_24_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:735:28: ( ( () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:736:1: ( () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:736:1: ( () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:736:2: () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}'
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:736:2: ()
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:737:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEPackageAccess().getEPackageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEPackage1795); 

                	newLeafNode(otherlv_1, grammarAccess.getEPackageAccess().getEPackageKeyword_1());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:746:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:747:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:747:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:748:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEPackageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEPackage1816);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEPackageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEPackage1828); 

                	newLeafNode(otherlv_3, grammarAccess.getEPackageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:768:1: (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:768:3: otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEPackage1841); 

                        	newLeafNode(otherlv_4, grammarAccess.getEPackageAccess().getNsURIKeyword_4_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:772:1: ( (lv_nsURI_5_0= ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:773:1: (lv_nsURI_5_0= ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:773:1: (lv_nsURI_5_0= ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:774:3: lv_nsURI_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEPackageAccess().getNsURIEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEPackage1862);
                    lv_nsURI_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEPackageRule());
                    	        }
                           		set(
                           			current, 
                           			"nsURI",
                            		lv_nsURI_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:790:4: (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:790:6: otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEPackage1877); 

                        	newLeafNode(otherlv_6, grammarAccess.getEPackageAccess().getNsPrefixKeyword_5_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:794:1: ( (lv_nsPrefix_7_0= ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:795:1: (lv_nsPrefix_7_0= ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:795:1: (lv_nsPrefix_7_0= ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:796:3: lv_nsPrefix_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEPackageAccess().getNsPrefixEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEPackage1898);
                    lv_nsPrefix_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEPackageRule());
                    	        }
                           		set(
                           			current, 
                           			"nsPrefix",
                            		lv_nsPrefix_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:812:4: (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:812:6: otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEPackage1913); 

                        	newLeafNode(otherlv_8, grammarAccess.getEPackageAccess().getEAnnotationsKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEPackage1925); 

                        	newLeafNode(otherlv_9, grammarAccess.getEPackageAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:820:1: ( (lv_eAnnotations_10_0= ruleEAnnotation ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:821:1: (lv_eAnnotations_10_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:821:1: (lv_eAnnotations_10_0= ruleEAnnotation )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:822:3: lv_eAnnotations_10_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEPackageAccess().getEAnnotationsEAnnotationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEPackage1946);
                    lv_eAnnotations_10_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_10_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:838:2: (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==16) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:838:4: otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEPackage1959); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getEPackageAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:842:1: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:843:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:843:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:844:3: lv_eAnnotations_12_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEPackageAccess().getEAnnotationsEAnnotationParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEPackage1980);
                    	    lv_eAnnotations_12_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEPackageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_12_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEPackage1994); 

                        	newLeafNode(otherlv_13, grammarAccess.getEPackageAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:864:3: (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:864:5: otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEPackage2009); 

                        	newLeafNode(otherlv_14, grammarAccess.getEPackageAccess().getEClassifiersKeyword_7_0());
                        
                    otherlv_15=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEPackage2021); 

                        	newLeafNode(otherlv_15, grammarAccess.getEPackageAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:872:1: ( (lv_eClassifiers_16_0= ruleEClassifier ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:873:1: (lv_eClassifiers_16_0= ruleEClassifier )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:873:1: (lv_eClassifiers_16_0= ruleEClassifier )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:874:3: lv_eClassifiers_16_0= ruleEClassifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getEPackageAccess().getEClassifiersEClassifierParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEClassifier_in_ruleEPackage2042);
                    lv_eClassifiers_16_0=ruleEClassifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"eClassifiers",
                            		lv_eClassifiers_16_0, 
                            		"EClassifier");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:890:2: (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==16) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:890:4: otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEPackage2055); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getEPackageAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:894:1: ( (lv_eClassifiers_18_0= ruleEClassifier ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:895:1: (lv_eClassifiers_18_0= ruleEClassifier )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:895:1: (lv_eClassifiers_18_0= ruleEClassifier )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:896:3: lv_eClassifiers_18_0= ruleEClassifier
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEPackageAccess().getEClassifiersEClassifierParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEClassifier_in_ruleEPackage2076);
                    	    lv_eClassifiers_18_0=ruleEClassifier();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEPackageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eClassifiers",
                    	            		lv_eClassifiers_18_0, 
                    	            		"EClassifier");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEPackage2090); 

                        	newLeafNode(otherlv_19, grammarAccess.getEPackageAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:916:3: (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:916:5: otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEPackage2105); 

                        	newLeafNode(otherlv_20, grammarAccess.getEPackageAccess().getESubpackagesKeyword_8_0());
                        
                    otherlv_21=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEPackage2117); 

                        	newLeafNode(otherlv_21, grammarAccess.getEPackageAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:924:1: ( (lv_eSubpackages_22_0= ruleEPackage ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:925:1: (lv_eSubpackages_22_0= ruleEPackage )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:925:1: (lv_eSubpackages_22_0= ruleEPackage )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:926:3: lv_eSubpackages_22_0= ruleEPackage
                    {
                     
                    	        newCompositeNode(grammarAccess.getEPackageAccess().getESubpackagesEPackageParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEPackage_in_ruleEPackage2138);
                    lv_eSubpackages_22_0=ruleEPackage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"eSubpackages",
                            		lv_eSubpackages_22_0, 
                            		"EPackage");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:942:2: (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==16) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:942:4: otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) )
                    	    {
                    	    otherlv_23=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEPackage2151); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getEPackageAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:946:1: ( (lv_eSubpackages_24_0= ruleEPackage ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:947:1: (lv_eSubpackages_24_0= ruleEPackage )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:947:1: (lv_eSubpackages_24_0= ruleEPackage )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:948:3: lv_eSubpackages_24_0= ruleEPackage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEPackageAccess().getESubpackagesEPackageParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEPackage_in_ruleEPackage2172);
                    	    lv_eSubpackages_24_0=ruleEPackage();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEPackageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eSubpackages",
                    	            		lv_eSubpackages_24_0, 
                    	            		"EPackage");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEPackage2186); 

                        	newLeafNode(otherlv_25, grammarAccess.getEPackageAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_26=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEPackage2200); 

                	newLeafNode(otherlv_26, grammarAccess.getEPackageAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleEPackage"


    // $ANTLR start "entryRuleEAnnotation"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:980:1: entryRuleEAnnotation returns [EObject current=null] : iv_ruleEAnnotation= ruleEAnnotation EOF ;
    public final EObject entryRuleEAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAnnotation = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:981:2: (iv_ruleEAnnotation= ruleEAnnotation EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:982:2: iv_ruleEAnnotation= ruleEAnnotation EOF
            {
             newCompositeNode(grammarAccess.getEAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_entryRuleEAnnotation2236);
            iv_ruleEAnnotation=ruleEAnnotation();

            state._fsp--;

             current =iv_ruleEAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEAnnotation2246); 

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
    // $ANTLR end "entryRuleEAnnotation"


    // $ANTLR start "ruleEAnnotation"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:989:1: ruleEAnnotation returns [EObject current=null] : ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
    public final EObject ruleEAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_source_4_0 = null;

        EObject lv_eAnnotations_13_0 = null;

        EObject lv_eAnnotations_15_0 = null;

        EObject lv_details_19_0 = null;

        EObject lv_details_21_0 = null;

        EObject lv_contents_25_0 = null;

        EObject lv_contents_27_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:992:28: ( ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:993:1: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:993:1: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:993:2: () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:993:2: ()
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:994:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEAnnotationAccess().getEAnnotationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleEAnnotation2292); 

                	newLeafNode(otherlv_1, grammarAccess.getEAnnotationAccess().getEAnnotationKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEAnnotation2304); 

                	newLeafNode(otherlv_2, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1007:1: (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1007:3: otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEAnnotation2317); 

                        	newLeafNode(otherlv_3, grammarAccess.getEAnnotationAccess().getSourceKeyword_3_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1011:1: ( (lv_source_4_0= ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1012:1: (lv_source_4_0= ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1012:1: (lv_source_4_0= ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1013:3: lv_source_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getSourceEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEAnnotation2338);
                    lv_source_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"source",
                            		lv_source_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1029:4: (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1029:6: otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEAnnotation2353); 

                        	newLeafNode(otherlv_5, grammarAccess.getEAnnotationAccess().getReferencesKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEAnnotation2365); 

                        	newLeafNode(otherlv_6, grammarAccess.getEAnnotationAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1037:1: ( ( ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1038:1: ( ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1038:1: ( ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1039:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAnnotationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEAnnotation2388);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1052:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==16) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1052:4: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEAnnotation2401); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getEAnnotationAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1056:1: ( ( ruleEString ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1057:1: ( ruleEString )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1057:1: ( ruleEString )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1058:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEAnnotationRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEAnnotation2424);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEAnnotation2438); 

                        	newLeafNode(otherlv_10, grammarAccess.getEAnnotationAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1075:3: (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1075:5: otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEAnnotation2453); 

                        	newLeafNode(otherlv_11, grammarAccess.getEAnnotationAccess().getEAnnotationsKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEAnnotation2465); 

                        	newLeafNode(otherlv_12, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1083:1: ( (lv_eAnnotations_13_0= ruleEAnnotation ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1084:1: (lv_eAnnotations_13_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1084:1: (lv_eAnnotations_13_0= ruleEAnnotation )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1085:3: lv_eAnnotations_13_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getEAnnotationsEAnnotationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEAnnotation2486);
                    lv_eAnnotations_13_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_13_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1101:2: (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==16) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1101:4: otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEAnnotation2499); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getEAnnotationAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1105:1: ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1106:1: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1106:1: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1107:3: lv_eAnnotations_15_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getEAnnotationsEAnnotationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEAnnotation2520);
                    	    lv_eAnnotations_15_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_15_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEAnnotation2534); 

                        	newLeafNode(otherlv_16, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1127:3: (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1127:5: otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEAnnotation2549); 

                        	newLeafNode(otherlv_17, grammarAccess.getEAnnotationAccess().getDetailsKeyword_6_0());
                        
                    otherlv_18=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEAnnotation2561); 

                        	newLeafNode(otherlv_18, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1135:1: ( (lv_details_19_0= ruleEStringToStringMapEntry ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1136:1: (lv_details_19_0= ruleEStringToStringMapEntry )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1136:1: (lv_details_19_0= ruleEStringToStringMapEntry )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1137:3: lv_details_19_0= ruleEStringToStringMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getDetailsEStringToStringMapEntryParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEStringToStringMapEntry_in_ruleEAnnotation2582);
                    lv_details_19_0=ruleEStringToStringMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    	        }
                           		add(
                           			current, 
                           			"details",
                            		lv_details_19_0, 
                            		"EStringToStringMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1153:2: (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==16) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1153:4: otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    {
                    	    otherlv_20=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEAnnotation2595); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getEAnnotationAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1157:1: ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1158:1: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1158:1: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1159:3: lv_details_21_0= ruleEStringToStringMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getDetailsEStringToStringMapEntryParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEStringToStringMapEntry_in_ruleEAnnotation2616);
                    	    lv_details_21_0=ruleEStringToStringMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"details",
                    	            		lv_details_21_0, 
                    	            		"EStringToStringMapEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEAnnotation2630); 

                        	newLeafNode(otherlv_22, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1179:3: (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1179:5: otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEAnnotation2645); 

                        	newLeafNode(otherlv_23, grammarAccess.getEAnnotationAccess().getContentsKeyword_7_0());
                        
                    otherlv_24=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEAnnotation2657); 

                        	newLeafNode(otherlv_24, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1187:1: ( (lv_contents_25_0= ruleEObject ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1188:1: (lv_contents_25_0= ruleEObject )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1188:1: (lv_contents_25_0= ruleEObject )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1189:3: lv_contents_25_0= ruleEObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getContentsEObjectParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEObject_in_ruleEAnnotation2678);
                    lv_contents_25_0=ruleEObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    	        }
                           		add(
                           			current, 
                           			"contents",
                            		lv_contents_25_0, 
                            		"EObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1205:2: (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==16) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1205:4: otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) )
                    	    {
                    	    otherlv_26=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEAnnotation2691); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getEAnnotationAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1209:1: ( (lv_contents_27_0= ruleEObject ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1210:1: (lv_contents_27_0= ruleEObject )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1210:1: (lv_contents_27_0= ruleEObject )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1211:3: lv_contents_27_0= ruleEObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getContentsEObjectParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEObject_in_ruleEAnnotation2712);
                    	    lv_contents_27_0=ruleEObject();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"contents",
                    	            		lv_contents_27_0, 
                    	            		"EObject");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEAnnotation2726); 

                        	newLeafNode(otherlv_28, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_29=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEAnnotation2740); 

                	newLeafNode(otherlv_29, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleEAnnotation"


    // $ANTLR start "entryRuleEStringToStringMapEntry"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1243:1: entryRuleEStringToStringMapEntry returns [EObject current=null] : iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF ;
    public final EObject entryRuleEStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStringToStringMapEntry = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1244:2: (iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1245:2: iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF
            {
             newCompositeNode(grammarAccess.getEStringToStringMapEntryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEStringToStringMapEntry_in_entryRuleEStringToStringMapEntry2776);
            iv_ruleEStringToStringMapEntry=ruleEStringToStringMapEntry();

            state._fsp--;

             current =iv_ruleEStringToStringMapEntry; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEStringToStringMapEntry2786); 

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
    // $ANTLR end "entryRuleEStringToStringMapEntry"


    // $ANTLR start "ruleEStringToStringMapEntry"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1252:1: ruleEStringToStringMapEntry returns [EObject current=null] : ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleEStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_key_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1255:28: ( ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1256:1: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1256:1: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1256:2: () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1256:2: ()
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1257:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleEStringToStringMapEntry2832); 

                	newLeafNode(otherlv_1, grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEStringToStringMapEntry2844); 

                	newLeafNode(otherlv_2, grammarAccess.getEStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1270:1: (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1270:3: otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleEStringToStringMapEntry2857); 

                        	newLeafNode(otherlv_3, grammarAccess.getEStringToStringMapEntryAccess().getKeyKeyword_3_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1274:1: ( (lv_key_4_0= ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1275:1: (lv_key_4_0= ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1275:1: (lv_key_4_0= ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1276:3: lv_key_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEStringToStringMapEntry2878);
                    lv_key_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEStringToStringMapEntryRule());
                    	        }
                           		set(
                           			current, 
                           			"key",
                            		lv_key_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1292:4: (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1292:6: otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleEStringToStringMapEntry2893); 

                        	newLeafNode(otherlv_5, grammarAccess.getEStringToStringMapEntryAccess().getValueKeyword_4_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1296:1: ( (lv_value_6_0= ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1297:1: (lv_value_6_0= ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1297:1: (lv_value_6_0= ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1298:3: lv_value_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEStringToStringMapEntryAccess().getValueEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEStringToStringMapEntry2914);
                    lv_value_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEStringToStringMapEntryRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEStringToStringMapEntry2928); 

                	newLeafNode(otherlv_7, grammarAccess.getEStringToStringMapEntryAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEStringToStringMapEntry"


    // $ANTLR start "entryRuleEObject"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1326:1: entryRuleEObject returns [EObject current=null] : iv_ruleEObject= ruleEObject EOF ;
    public final EObject entryRuleEObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObject = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1327:2: (iv_ruleEObject= ruleEObject EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1328:2: iv_ruleEObject= ruleEObject EOF
            {
             newCompositeNode(grammarAccess.getEObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEObject_in_entryRuleEObject2964);
            iv_ruleEObject=ruleEObject();

            state._fsp--;

             current =iv_ruleEObject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEObject2974); 

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
    // $ANTLR end "entryRuleEObject"


    // $ANTLR start "ruleEObject"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1335:1: ruleEObject returns [EObject current=null] : ( () otherlv_1= 'EObject' ) ;
    public final EObject ruleEObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1338:28: ( ( () otherlv_1= 'EObject' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1339:1: ( () otherlv_1= 'EObject' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1339:1: ( () otherlv_1= 'EObject' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1339:2: () otherlv_1= 'EObject'
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1339:2: ()
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1340:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEObjectAccess().getEObjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleEObject3020); 

                	newLeafNode(otherlv_1, grammarAccess.getEObjectAccess().getEObjectKeyword_1());
                

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
    // $ANTLR end "ruleEObject"


    // $ANTLR start "entryRuleETypeParameter"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1357:1: entryRuleETypeParameter returns [EObject current=null] : iv_ruleETypeParameter= ruleETypeParameter EOF ;
    public final EObject entryRuleETypeParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETypeParameter = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1358:2: (iv_ruleETypeParameter= ruleETypeParameter EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1359:2: iv_ruleETypeParameter= ruleETypeParameter EOF
            {
             newCompositeNode(grammarAccess.getETypeParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_entryRuleETypeParameter3056);
            iv_ruleETypeParameter=ruleETypeParameter();

            state._fsp--;

             current =iv_ruleETypeParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleETypeParameter3066); 

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
    // $ANTLR end "entryRuleETypeParameter"


    // $ANTLR start "ruleETypeParameter"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1366:1: ruleETypeParameter returns [EObject current=null] : ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleETypeParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_eAnnotations_6_0 = null;

        EObject lv_eAnnotations_8_0 = null;

        EObject lv_eBounds_12_0 = null;

        EObject lv_eBounds_14_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1369:28: ( ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1370:1: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1370:1: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1370:2: () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1370:2: ()
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1371:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getETypeParameterAccess().getETypeParameterAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleETypeParameter3112); 

                	newLeafNode(otherlv_1, grammarAccess.getETypeParameterAccess().getETypeParameterKeyword_1());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1380:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1381:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1381:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1382:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getETypeParameterAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleETypeParameter3133);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETypeParameterRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleETypeParameter3145); 

                	newLeafNode(otherlv_3, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1402:1: (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==28) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1402:3: otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleETypeParameter3158); 

                        	newLeafNode(otherlv_4, grammarAccess.getETypeParameterAccess().getEAnnotationsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleETypeParameter3170); 

                        	newLeafNode(otherlv_5, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1410:1: ( (lv_eAnnotations_6_0= ruleEAnnotation ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1411:1: (lv_eAnnotations_6_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1411:1: (lv_eAnnotations_6_0= ruleEAnnotation )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1412:3: lv_eAnnotations_6_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getETypeParameterAccess().getEAnnotationsEAnnotationParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleETypeParameter3191);
                    lv_eAnnotations_6_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getETypeParameterRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_6_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1428:2: (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==16) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1428:4: otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleETypeParameter3204); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getETypeParameterAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1432:1: ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1433:1: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1433:1: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1434:3: lv_eAnnotations_8_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getETypeParameterAccess().getEAnnotationsEAnnotationParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleETypeParameter3225);
                    	    lv_eAnnotations_8_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getETypeParameterRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_8_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleETypeParameter3239); 

                        	newLeafNode(otherlv_9, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1454:3: (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==43) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1454:5: otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleETypeParameter3254); 

                        	newLeafNode(otherlv_10, grammarAccess.getETypeParameterAccess().getEBoundsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleETypeParameter3266); 

                        	newLeafNode(otherlv_11, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1462:1: ( (lv_eBounds_12_0= ruleEGenericType ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1463:1: (lv_eBounds_12_0= ruleEGenericType )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1463:1: (lv_eBounds_12_0= ruleEGenericType )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1464:3: lv_eBounds_12_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getETypeParameterAccess().getEBoundsEGenericTypeParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleETypeParameter3287);
                    lv_eBounds_12_0=ruleEGenericType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getETypeParameterRule());
                    	        }
                           		add(
                           			current, 
                           			"eBounds",
                            		lv_eBounds_12_0, 
                            		"EGenericType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1480:2: (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==16) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1480:4: otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleETypeParameter3300); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getETypeParameterAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1484:1: ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1485:1: (lv_eBounds_14_0= ruleEGenericType )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1485:1: (lv_eBounds_14_0= ruleEGenericType )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1486:3: lv_eBounds_14_0= ruleEGenericType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getETypeParameterAccess().getEBoundsEGenericTypeParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleETypeParameter3321);
                    	    lv_eBounds_14_0=ruleEGenericType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getETypeParameterRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eBounds",
                    	            		lv_eBounds_14_0, 
                    	            		"EGenericType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleETypeParameter3335); 

                        	newLeafNode(otherlv_15, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleETypeParameter3349); 

                	newLeafNode(otherlv_16, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleETypeParameter"


    // $ANTLR start "entryRuleEClass"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1518:1: entryRuleEClass returns [EObject current=null] : iv_ruleEClass= ruleEClass EOF ;
    public final EObject entryRuleEClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClass = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1519:2: (iv_ruleEClass= ruleEClass EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1520:2: iv_ruleEClass= ruleEClass EOF
            {
             newCompositeNode(grammarAccess.getEClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEClass_in_entryRuleEClass3385);
            iv_ruleEClass=ruleEClass();

            state._fsp--;

             current =iv_ruleEClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEClass3395); 

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
    // $ANTLR end "entryRuleEClass"


    // $ANTLR start "ruleEClass"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1527:1: ruleEClass returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
    public final EObject ruleEClass() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token lv_interface_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_7_0 = null;

        AntlrDatatypeRuleToken lv_instanceTypeName_9_0 = null;

        EObject lv_eAnnotations_18_0 = null;

        EObject lv_eAnnotations_20_0 = null;

        EObject lv_eTypeParameters_24_0 = null;

        EObject lv_eTypeParameters_26_0 = null;

        EObject lv_eOperations_30_0 = null;

        EObject lv_eOperations_32_0 = null;

        EObject lv_eStructuralFeatures_36_0 = null;

        EObject lv_eStructuralFeatures_38_0 = null;

        EObject lv_eGenericSuperTypes_42_0 = null;

        EObject lv_eGenericSuperTypes_44_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1530:28: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1531:1: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1531:1: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1531:2: () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1531:2: ()
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1532:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEClassAccess().getEClassAction_0(),
                        current);
                

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1537:2: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1538:1: (lv_abstract_1_0= 'abstract' )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1538:1: (lv_abstract_1_0= 'abstract' )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1539:3: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEClass3447); 

                            newLeafNode(lv_abstract_1_0, grammarAccess.getEClassAccess().getAbstractAbstractKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEClassRule());
                    	        }
                           		setWithLastConsumed(current, "abstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1552:3: ( (lv_interface_2_0= 'interface' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==45) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1553:1: (lv_interface_2_0= 'interface' )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1553:1: (lv_interface_2_0= 'interface' )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1554:3: lv_interface_2_0= 'interface'
                    {
                    lv_interface_2_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEClass3479); 

                            newLeafNode(lv_interface_2_0, grammarAccess.getEClassAccess().getInterfaceInterfaceKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEClassRule());
                    	        }
                           		setWithLastConsumed(current, "interface", true, "interface");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEClass3505); 

                	newLeafNode(otherlv_3, grammarAccess.getEClassAccess().getEClassKeyword_3());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1571:1: ( (lv_name_4_0= ruleEString ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1572:1: (lv_name_4_0= ruleEString )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1572:1: (lv_name_4_0= ruleEString )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1573:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEClassAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEClass3526);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEClassRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEClass3538); 

                	newLeafNode(otherlv_5, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_5());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1593:1: (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==47) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1593:3: otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEClass3551); 

                        	newLeafNode(otherlv_6, grammarAccess.getEClassAccess().getInstanceClassNameKeyword_6_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1597:1: ( (lv_instanceClassName_7_0= ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1598:1: (lv_instanceClassName_7_0= ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1598:1: (lv_instanceClassName_7_0= ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1599:3: lv_instanceClassName_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getInstanceClassNameEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEClass3572);
                    lv_instanceClassName_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEClassRule());
                    	        }
                           		set(
                           			current, 
                           			"instanceClassName",
                            		lv_instanceClassName_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1615:4: (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==48) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1615:6: otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEClass3587); 

                        	newLeafNode(otherlv_8, grammarAccess.getEClassAccess().getInstanceTypeNameKeyword_7_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1619:1: ( (lv_instanceTypeName_9_0= ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1620:1: (lv_instanceTypeName_9_0= ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1620:1: (lv_instanceTypeName_9_0= ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1621:3: lv_instanceTypeName_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getInstanceTypeNameEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEClass3608);
                    lv_instanceTypeName_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEClassRule());
                    	        }
                           		set(
                           			current, 
                           			"instanceTypeName",
                            		lv_instanceTypeName_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1637:4: (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==49) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1637:6: otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleEClass3623); 

                        	newLeafNode(otherlv_10, grammarAccess.getEClassAccess().getESuperTypesKeyword_8_0());
                        
                    otherlv_11=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEClass3635); 

                        	newLeafNode(otherlv_11, grammarAccess.getEClassAccess().getLeftParenthesisKeyword_8_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1645:1: ( ( ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1646:1: ( ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1646:1: ( ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1647:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEClassRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEClass3658);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1660:2: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==16) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1660:4: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEClass3671); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getEClassAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1664:1: ( ( ruleEString ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1665:1: ( ruleEString )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1665:1: ( ruleEString )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1666:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEClassRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEClass3694);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEClass3708); 

                        	newLeafNode(otherlv_15, grammarAccess.getEClassAccess().getRightParenthesisKeyword_8_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1683:3: (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==28) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1683:5: otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEClass3723); 

                        	newLeafNode(otherlv_16, grammarAccess.getEClassAccess().getEAnnotationsKeyword_9_0());
                        
                    otherlv_17=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEClass3735); 

                        	newLeafNode(otherlv_17, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1691:1: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1692:1: (lv_eAnnotations_18_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1692:1: (lv_eAnnotations_18_0= ruleEAnnotation )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1693:3: lv_eAnnotations_18_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getEAnnotationsEAnnotationParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEClass3756);
                    lv_eAnnotations_18_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEClassRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_18_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1709:2: (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==16) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1709:4: otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_19=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEClass3769); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getEClassAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1713:1: ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1714:1: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1714:1: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1715:3: lv_eAnnotations_20_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEClassAccess().getEAnnotationsEAnnotationParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEClass3790);
                    	    lv_eAnnotations_20_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_20_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEClass3804); 

                        	newLeafNode(otherlv_21, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1735:3: (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==50) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1735:5: otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEClass3819); 

                        	newLeafNode(otherlv_22, grammarAccess.getEClassAccess().getETypeParametersKeyword_10_0());
                        
                    otherlv_23=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEClass3831); 

                        	newLeafNode(otherlv_23, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1743:1: ( (lv_eTypeParameters_24_0= ruleETypeParameter ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1744:1: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1744:1: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1745:3: lv_eTypeParameters_24_0= ruleETypeParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getETypeParametersETypeParameterParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEClass3852);
                    lv_eTypeParameters_24_0=ruleETypeParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEClassRule());
                    	        }
                           		add(
                           			current, 
                           			"eTypeParameters",
                            		lv_eTypeParameters_24_0, 
                            		"ETypeParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1761:2: (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==16) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1761:4: otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_25=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEClass3865); 

                    	        	newLeafNode(otherlv_25, grammarAccess.getEClassAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1765:1: ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1766:1: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1766:1: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1767:3: lv_eTypeParameters_26_0= ruleETypeParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEClassAccess().getETypeParametersETypeParameterParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEClass3886);
                    	    lv_eTypeParameters_26_0=ruleETypeParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eTypeParameters",
                    	            		lv_eTypeParameters_26_0, 
                    	            		"ETypeParameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEClass3900); 

                        	newLeafNode(otherlv_27, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1787:3: (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==51) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1787:5: otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleEClass3915); 

                        	newLeafNode(otherlv_28, grammarAccess.getEClassAccess().getEOperationsKeyword_11_0());
                        
                    otherlv_29=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEClass3927); 

                        	newLeafNode(otherlv_29, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1795:1: ( (lv_eOperations_30_0= ruleEOperation ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1796:1: (lv_eOperations_30_0= ruleEOperation )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1796:1: (lv_eOperations_30_0= ruleEOperation )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1797:3: lv_eOperations_30_0= ruleEOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getEOperationsEOperationParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEOperation_in_ruleEClass3948);
                    lv_eOperations_30_0=ruleEOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEClassRule());
                    	        }
                           		add(
                           			current, 
                           			"eOperations",
                            		lv_eOperations_30_0, 
                            		"EOperation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1813:2: (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==16) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1813:4: otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    {
                    	    otherlv_31=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEClass3961); 

                    	        	newLeafNode(otherlv_31, grammarAccess.getEClassAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1817:1: ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1818:1: (lv_eOperations_32_0= ruleEOperation )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1818:1: (lv_eOperations_32_0= ruleEOperation )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1819:3: lv_eOperations_32_0= ruleEOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEClassAccess().getEOperationsEOperationParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEOperation_in_ruleEClass3982);
                    	    lv_eOperations_32_0=ruleEOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eOperations",
                    	            		lv_eOperations_32_0, 
                    	            		"EOperation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEClass3996); 

                        	newLeafNode(otherlv_33, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_11_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1839:3: (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==52) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1839:5: otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleEClass4011); 

                        	newLeafNode(otherlv_34, grammarAccess.getEClassAccess().getEStructuralFeaturesKeyword_12_0());
                        
                    otherlv_35=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEClass4023); 

                        	newLeafNode(otherlv_35, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_12_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1847:1: ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1848:1: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1848:1: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1849:3: lv_eStructuralFeatures_36_0= ruleEStructuralFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getEStructuralFeaturesEStructuralFeatureParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEStructuralFeature_in_ruleEClass4044);
                    lv_eStructuralFeatures_36_0=ruleEStructuralFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEClassRule());
                    	        }
                           		add(
                           			current, 
                           			"eStructuralFeatures",
                            		lv_eStructuralFeatures_36_0, 
                            		"EStructuralFeature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1865:2: (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==16) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1865:4: otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    {
                    	    otherlv_37=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEClass4057); 

                    	        	newLeafNode(otherlv_37, grammarAccess.getEClassAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1869:1: ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1870:1: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1870:1: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1871:3: lv_eStructuralFeatures_38_0= ruleEStructuralFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEClassAccess().getEStructuralFeaturesEStructuralFeatureParserRuleCall_12_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEStructuralFeature_in_ruleEClass4078);
                    	    lv_eStructuralFeatures_38_0=ruleEStructuralFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eStructuralFeatures",
                    	            		lv_eStructuralFeatures_38_0, 
                    	            		"EStructuralFeature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEClass4092); 

                        	newLeafNode(otherlv_39, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_12_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1891:3: (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==53) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1891:5: otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleEClass4107); 

                        	newLeafNode(otherlv_40, grammarAccess.getEClassAccess().getEGenericSuperTypesKeyword_13_0());
                        
                    otherlv_41=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEClass4119); 

                        	newLeafNode(otherlv_41, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_13_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1899:1: ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1900:1: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1900:1: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1901:3: lv_eGenericSuperTypes_42_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getEGenericSuperTypesEGenericTypeParserRuleCall_13_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEClass4140);
                    lv_eGenericSuperTypes_42_0=ruleEGenericType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEClassRule());
                    	        }
                           		add(
                           			current, 
                           			"eGenericSuperTypes",
                            		lv_eGenericSuperTypes_42_0, 
                            		"EGenericType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1917:2: (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==16) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1917:4: otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEClass4153); 

                    	        	newLeafNode(otherlv_43, grammarAccess.getEClassAccess().getCommaKeyword_13_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1921:1: ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1922:1: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1922:1: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1923:3: lv_eGenericSuperTypes_44_0= ruleEGenericType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEClassAccess().getEGenericSuperTypesEGenericTypeParserRuleCall_13_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEClass4174);
                    	    lv_eGenericSuperTypes_44_0=ruleEGenericType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eGenericSuperTypes",
                    	            		lv_eGenericSuperTypes_44_0, 
                    	            		"EGenericType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEClass4188); 

                        	newLeafNode(otherlv_45, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_13_4());
                        

                    }
                    break;

            }

            otherlv_46=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEClass4202); 

                	newLeafNode(otherlv_46, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_14());
                

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
    // $ANTLR end "ruleEClass"


    // $ANTLR start "entryRuleEDataType_Impl"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1955:1: entryRuleEDataType_Impl returns [EObject current=null] : iv_ruleEDataType_Impl= ruleEDataType_Impl EOF ;
    public final EObject entryRuleEDataType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataType_Impl = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1956:2: (iv_ruleEDataType_Impl= ruleEDataType_Impl EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1957:2: iv_ruleEDataType_Impl= ruleEDataType_Impl EOF
            {
             newCompositeNode(grammarAccess.getEDataType_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDataType_Impl_in_entryRuleEDataType_Impl4238);
            iv_ruleEDataType_Impl=ruleEDataType_Impl();

            state._fsp--;

             current =iv_ruleEDataType_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDataType_Impl4248); 

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
    // $ANTLR end "entryRuleEDataType_Impl"


    // $ANTLR start "ruleEDataType_Impl"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1964:1: ruleEDataType_Impl returns [EObject current=null] : ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleEDataType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_5_0 = null;

        AntlrDatatypeRuleToken lv_instanceTypeName_7_0 = null;

        AntlrDatatypeRuleToken lv_serializable_9_0 = null;

        EObject lv_eAnnotations_12_0 = null;

        EObject lv_eAnnotations_14_0 = null;

        EObject lv_eTypeParameters_18_0 = null;

        EObject lv_eTypeParameters_20_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1967:28: ( ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1968:1: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1968:1: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1968:2: () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1968:2: ()
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1969:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEDataType_ImplAccess().getEDataTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleEDataType_Impl4294); 

                	newLeafNode(otherlv_1, grammarAccess.getEDataType_ImplAccess().getEDataTypeKeyword_1());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1978:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1979:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1979:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:1980:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEDataType_Impl4315);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDataType_Impl4327); 

                	newLeafNode(otherlv_3, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2000:1: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==47) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2000:3: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEDataType_Impl4340); 

                        	newLeafNode(otherlv_4, grammarAccess.getEDataType_ImplAccess().getInstanceClassNameKeyword_4_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2004:1: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2005:1: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2005:1: (lv_instanceClassName_5_0= ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2006:3: lv_instanceClassName_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceClassNameEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEDataType_Impl4361);
                    lv_instanceClassName_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"instanceClassName",
                            		lv_instanceClassName_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2022:4: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==48) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2022:6: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEDataType_Impl4376); 

                        	newLeafNode(otherlv_6, grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameKeyword_5_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2026:1: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2027:1: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2027:1: (lv_instanceTypeName_7_0= ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2028:3: lv_instanceTypeName_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEDataType_Impl4397);
                    lv_instanceTypeName_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"instanceTypeName",
                            		lv_instanceTypeName_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2044:4: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==55) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2044:6: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleEDataType_Impl4412); 

                        	newLeafNode(otherlv_8, grammarAccess.getEDataType_ImplAccess().getSerializableKeyword_6_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2048:1: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2049:1: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2049:1: (lv_serializable_9_0= ruleEBoolean )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2050:3: lv_serializable_9_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getSerializableEBooleanParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEDataType_Impl4433);
                    lv_serializable_9_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"serializable",
                            		lv_serializable_9_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2066:4: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==28) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2066:6: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEDataType_Impl4448); 

                        	newLeafNode(otherlv_10, grammarAccess.getEDataType_ImplAccess().getEAnnotationsKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDataType_Impl4460); 

                        	newLeafNode(otherlv_11, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2074:1: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2075:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2075:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2076:3: lv_eAnnotations_12_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getEAnnotationsEAnnotationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEDataType_Impl4481);
                    lv_eAnnotations_12_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_12_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2092:2: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==16) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2092:4: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEDataType_Impl4494); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2096:1: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2097:1: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2097:1: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2098:3: lv_eAnnotations_14_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getEAnnotationsEAnnotationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEDataType_Impl4515);
                    	    lv_eAnnotations_14_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_14_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEDataType_Impl4529); 

                        	newLeafNode(otherlv_15, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2118:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==50) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2118:5: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEDataType_Impl4544); 

                        	newLeafNode(otherlv_16, grammarAccess.getEDataType_ImplAccess().getETypeParametersKeyword_8_0());
                        
                    otherlv_17=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDataType_Impl4556); 

                        	newLeafNode(otherlv_17, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2126:1: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2127:1: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2127:1: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2128:3: lv_eTypeParameters_18_0= ruleETypeParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getETypeParametersETypeParameterParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEDataType_Impl4577);
                    lv_eTypeParameters_18_0=ruleETypeParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"eTypeParameters",
                            		lv_eTypeParameters_18_0, 
                            		"ETypeParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2144:2: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==16) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2144:4: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEDataType_Impl4590); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2148:1: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2149:1: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2149:1: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2150:3: lv_eTypeParameters_20_0= ruleETypeParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getETypeParametersETypeParameterParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEDataType_Impl4611);
                    	    lv_eTypeParameters_20_0=ruleETypeParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eTypeParameters",
                    	            		lv_eTypeParameters_20_0, 
                    	            		"ETypeParameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEDataType_Impl4625); 

                        	newLeafNode(otherlv_21, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_22=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEDataType_Impl4639); 

                	newLeafNode(otherlv_22, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleEDataType_Impl"


    // $ANTLR start "entryRuleEEnum"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2182:1: entryRuleEEnum returns [EObject current=null] : iv_ruleEEnum= ruleEEnum EOF ;
    public final EObject entryRuleEEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnum = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2183:2: (iv_ruleEEnum= ruleEEnum EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2184:2: iv_ruleEEnum= ruleEEnum EOF
            {
             newCompositeNode(grammarAccess.getEEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEEnum_in_entryRuleEEnum4675);
            iv_ruleEEnum=ruleEEnum();

            state._fsp--;

             current =iv_ruleEEnum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEEnum4685); 

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
    // $ANTLR end "entryRuleEEnum"


    // $ANTLR start "ruleEEnum"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2191:1: ruleEEnum returns [EObject current=null] : ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
    public final EObject ruleEEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_5_0 = null;

        AntlrDatatypeRuleToken lv_instanceTypeName_7_0 = null;

        AntlrDatatypeRuleToken lv_serializable_9_0 = null;

        EObject lv_eAnnotations_12_0 = null;

        EObject lv_eAnnotations_14_0 = null;

        EObject lv_eTypeParameters_18_0 = null;

        EObject lv_eTypeParameters_20_0 = null;

        EObject lv_eLiterals_24_0 = null;

        EObject lv_eLiterals_26_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2194:28: ( ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2195:1: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2195:1: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2195:2: () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2195:2: ()
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2196:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEEnumAccess().getEEnumAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleEEnum4731); 

                	newLeafNode(otherlv_1, grammarAccess.getEEnumAccess().getEEnumKeyword_1());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2205:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2206:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2206:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2207:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEEnumAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEEnum4752);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEEnumRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEEnum4764); 

                	newLeafNode(otherlv_3, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2227:1: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==47) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2227:3: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEEnum4777); 

                        	newLeafNode(otherlv_4, grammarAccess.getEEnumAccess().getInstanceClassNameKeyword_4_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2231:1: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2232:1: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2232:1: (lv_instanceClassName_5_0= ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2233:3: lv_instanceClassName_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumAccess().getInstanceClassNameEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEEnum4798);
                    lv_instanceClassName_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	        }
                           		set(
                           			current, 
                           			"instanceClassName",
                            		lv_instanceClassName_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2249:4: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==48) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2249:6: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEEnum4813); 

                        	newLeafNode(otherlv_6, grammarAccess.getEEnumAccess().getInstanceTypeNameKeyword_5_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2253:1: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2254:1: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2254:1: (lv_instanceTypeName_7_0= ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2255:3: lv_instanceTypeName_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEEnum4834);
                    lv_instanceTypeName_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	        }
                           		set(
                           			current, 
                           			"instanceTypeName",
                            		lv_instanceTypeName_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2271:4: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==55) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2271:6: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleEEnum4849); 

                        	newLeafNode(otherlv_8, grammarAccess.getEEnumAccess().getSerializableKeyword_6_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2275:1: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2276:1: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2276:1: (lv_serializable_9_0= ruleEBoolean )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2277:3: lv_serializable_9_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumAccess().getSerializableEBooleanParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEEnum4870);
                    lv_serializable_9_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	        }
                           		set(
                           			current, 
                           			"serializable",
                            		lv_serializable_9_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2293:4: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==28) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2293:6: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEEnum4885); 

                        	newLeafNode(otherlv_10, grammarAccess.getEEnumAccess().getEAnnotationsKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEEnum4897); 

                        	newLeafNode(otherlv_11, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2301:1: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2302:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2302:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2303:3: lv_eAnnotations_12_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumAccess().getEAnnotationsEAnnotationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEEnum4918);
                    lv_eAnnotations_12_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_12_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2319:2: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==16) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2319:4: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEEnum4931); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getEEnumAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2323:1: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2324:1: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2324:1: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2325:3: lv_eAnnotations_14_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEEnumAccess().getEAnnotationsEAnnotationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEEnum4952);
                    	    lv_eAnnotations_14_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_14_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEEnum4966); 

                        	newLeafNode(otherlv_15, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2345:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==50) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2345:5: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEEnum4981); 

                        	newLeafNode(otherlv_16, grammarAccess.getEEnumAccess().getETypeParametersKeyword_8_0());
                        
                    otherlv_17=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEEnum4993); 

                        	newLeafNode(otherlv_17, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2353:1: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2354:1: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2354:1: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2355:3: lv_eTypeParameters_18_0= ruleETypeParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumAccess().getETypeParametersETypeParameterParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEEnum5014);
                    lv_eTypeParameters_18_0=ruleETypeParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	        }
                           		add(
                           			current, 
                           			"eTypeParameters",
                            		lv_eTypeParameters_18_0, 
                            		"ETypeParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2371:2: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==16) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2371:4: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEEnum5027); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getEEnumAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2375:1: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2376:1: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2376:1: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2377:3: lv_eTypeParameters_20_0= ruleETypeParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEEnumAccess().getETypeParametersETypeParameterParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEEnum5048);
                    	    lv_eTypeParameters_20_0=ruleETypeParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eTypeParameters",
                    	            		lv_eTypeParameters_20_0, 
                    	            		"ETypeParameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEEnum5062); 

                        	newLeafNode(otherlv_21, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2397:3: (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==57) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2397:5: otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleEEnum5077); 

                        	newLeafNode(otherlv_22, grammarAccess.getEEnumAccess().getELiteralsKeyword_9_0());
                        
                    otherlv_23=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEEnum5089); 

                        	newLeafNode(otherlv_23, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2405:1: ( (lv_eLiterals_24_0= ruleEEnumLiteral ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2406:1: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2406:1: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2407:3: lv_eLiterals_24_0= ruleEEnumLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumAccess().getELiteralsEEnumLiteralParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEEnumLiteral_in_ruleEEnum5110);
                    lv_eLiterals_24_0=ruleEEnumLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	        }
                           		add(
                           			current, 
                           			"eLiterals",
                            		lv_eLiterals_24_0, 
                            		"EEnumLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2423:2: (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==16) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2423:4: otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    {
                    	    otherlv_25=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEEnum5123); 

                    	        	newLeafNode(otherlv_25, grammarAccess.getEEnumAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2427:1: ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2428:1: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2428:1: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2429:3: lv_eLiterals_26_0= ruleEEnumLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEEnumAccess().getELiteralsEEnumLiteralParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEEnumLiteral_in_ruleEEnum5144);
                    	    lv_eLiterals_26_0=ruleEEnumLiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eLiterals",
                    	            		lv_eLiterals_26_0, 
                    	            		"EEnumLiteral");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEEnum5158); 

                        	newLeafNode(otherlv_27, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_28=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEEnum5172); 

                	newLeafNode(otherlv_28, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleEEnum"


    // $ANTLR start "entryRuleEGenericType"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2461:1: entryRuleEGenericType returns [EObject current=null] : iv_ruleEGenericType= ruleEGenericType EOF ;
    public final EObject entryRuleEGenericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGenericType = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2462:2: (iv_ruleEGenericType= ruleEGenericType EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2463:2: iv_ruleEGenericType= ruleEGenericType EOF
            {
             newCompositeNode(grammarAccess.getEGenericTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_entryRuleEGenericType5208);
            iv_ruleEGenericType=ruleEGenericType();

            state._fsp--;

             current =iv_ruleEGenericType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEGenericType5218); 

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
    // $ANTLR end "entryRuleEGenericType"


    // $ANTLR start "ruleEGenericType"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2470:1: ruleEGenericType returns [EObject current=null] : ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleEGenericType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_eUpperBound_8_0 = null;

        EObject lv_eTypeArguments_11_0 = null;

        EObject lv_eTypeArguments_13_0 = null;

        EObject lv_eLowerBound_16_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2473:28: ( ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2474:1: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2474:1: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2474:2: () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}'
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2474:2: ()
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2475:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEGenericTypeAccess().getEGenericTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleEGenericType5264); 

                	newLeafNode(otherlv_1, grammarAccess.getEGenericTypeAccess().getEGenericTypeKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEGenericType5276); 

                	newLeafNode(otherlv_2, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2488:1: (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==59) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2488:3: otherlv_3= 'eTypeParameter' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleEGenericType5289); 

                        	newLeafNode(otherlv_3, grammarAccess.getEGenericTypeAccess().getETypeParameterKeyword_3_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2492:1: ( ( ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2493:1: ( ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2493:1: ( ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2494:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEGenericTypeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeParameterETypeParameterCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEGenericType5312);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2507:4: (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==60) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2507:6: otherlv_5= 'eClassifier' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleEGenericType5327); 

                        	newLeafNode(otherlv_5, grammarAccess.getEGenericTypeAccess().getEClassifierKeyword_4_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2511:1: ( ( ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2512:1: ( ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2512:1: ( ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2513:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEGenericTypeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEGenericTypeAccess().getEClassifierEClassifierCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEGenericType5350);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2526:4: (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==61) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2526:6: otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    {
                    otherlv_7=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleEGenericType5365); 

                        	newLeafNode(otherlv_7, grammarAccess.getEGenericTypeAccess().getEUpperBoundKeyword_5_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2530:1: ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2531:1: (lv_eUpperBound_8_0= ruleEGenericType )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2531:1: (lv_eUpperBound_8_0= ruleEGenericType )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2532:3: lv_eUpperBound_8_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEGenericTypeAccess().getEUpperBoundEGenericTypeParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEGenericType5386);
                    lv_eUpperBound_8_0=ruleEGenericType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEGenericTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"eUpperBound",
                            		lv_eUpperBound_8_0, 
                            		"EGenericType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2548:4: (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==62) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2548:6: otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleEGenericType5401); 

                        	newLeafNode(otherlv_9, grammarAccess.getEGenericTypeAccess().getETypeArgumentsKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEGenericType5413); 

                        	newLeafNode(otherlv_10, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2556:1: ( (lv_eTypeArguments_11_0= ruleEGenericType ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2557:1: (lv_eTypeArguments_11_0= ruleEGenericType )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2557:1: (lv_eTypeArguments_11_0= ruleEGenericType )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2558:3: lv_eTypeArguments_11_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeArgumentsEGenericTypeParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEGenericType5434);
                    lv_eTypeArguments_11_0=ruleEGenericType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEGenericTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"eTypeArguments",
                            		lv_eTypeArguments_11_0, 
                            		"EGenericType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2574:2: (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==16) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2574:4: otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEGenericType5447); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getEGenericTypeAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2578:1: ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2579:1: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2579:1: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2580:3: lv_eTypeArguments_13_0= ruleEGenericType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeArgumentsEGenericTypeParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEGenericType5468);
                    	    lv_eTypeArguments_13_0=ruleEGenericType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEGenericTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eTypeArguments",
                    	            		lv_eTypeArguments_13_0, 
                    	            		"EGenericType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEGenericType5482); 

                        	newLeafNode(otherlv_14, grammarAccess.getEGenericTypeAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2600:3: (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==63) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2600:5: otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    {
                    otherlv_15=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleEGenericType5497); 

                        	newLeafNode(otherlv_15, grammarAccess.getEGenericTypeAccess().getELowerBoundKeyword_7_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2604:1: ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2605:1: (lv_eLowerBound_16_0= ruleEGenericType )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2605:1: (lv_eLowerBound_16_0= ruleEGenericType )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2606:3: lv_eLowerBound_16_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEGenericTypeAccess().getELowerBoundEGenericTypeParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEGenericType5518);
                    lv_eLowerBound_16_0=ruleEGenericType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEGenericTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"eLowerBound",
                            		lv_eLowerBound_16_0, 
                            		"EGenericType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEGenericType5532); 

                	newLeafNode(otherlv_17, grammarAccess.getEGenericTypeAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleEGenericType"


    // $ANTLR start "entryRuleEBoolean"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2634:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2635:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2636:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean5569);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean5580); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2643:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2646:28: ( (kw= 'true' | kw= 'false' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2647:1: (kw= 'true' | kw= 'false' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2647:1: (kw= 'true' | kw= 'false' )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==64) ) {
                alt76=1;
            }
            else if ( (LA76_0==65) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2648:2: kw= 'true'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleEBoolean5618); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2655:2: kw= 'false'
                    {
                    kw=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleEBoolean5637); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEOperation"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2668:1: entryRuleEOperation returns [EObject current=null] : iv_ruleEOperation= ruleEOperation EOF ;
    public final EObject entryRuleEOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperation = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2669:2: (iv_ruleEOperation= ruleEOperation EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2670:2: iv_ruleEOperation= ruleEOperation EOF
            {
             newCompositeNode(grammarAccess.getEOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEOperation_in_entryRuleEOperation5677);
            iv_ruleEOperation=ruleEOperation();

            state._fsp--;

             current =iv_ruleEOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEOperation5687); 

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
    // $ANTLR end "entryRuleEOperation"


    // $ANTLR start "ruleEOperation"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2677:1: ruleEOperation returns [EObject current=null] : ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
    public final EObject ruleEOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ordered_5_0 = null;

        AntlrDatatypeRuleToken lv_unique_7_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_9_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_11_0 = null;

        EObject lv_eAnnotations_22_0 = null;

        EObject lv_eAnnotations_24_0 = null;

        EObject lv_eGenericType_27_0 = null;

        EObject lv_eTypeParameters_30_0 = null;

        EObject lv_eTypeParameters_32_0 = null;

        EObject lv_eParameters_36_0 = null;

        EObject lv_eParameters_38_0 = null;

        EObject lv_eGenericExceptions_42_0 = null;

        EObject lv_eGenericExceptions_44_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2680:28: ( ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2681:1: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2681:1: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2681:2: () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2681:2: ()
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2682:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEOperationAccess().getEOperationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleEOperation5733); 

                	newLeafNode(otherlv_1, grammarAccess.getEOperationAccess().getEOperationKeyword_1());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2691:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2692:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2692:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2693:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEOperationAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEOperation5754);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEOperationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEOperation5766); 

                	newLeafNode(otherlv_3, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2713:1: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==67) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2713:3: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleEOperation5779); 

                        	newLeafNode(otherlv_4, grammarAccess.getEOperationAccess().getOrderedKeyword_4_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2717:1: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2718:1: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2718:1: (lv_ordered_5_0= ruleEBoolean )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2719:3: lv_ordered_5_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getOrderedEBooleanParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEOperation5800);
                    lv_ordered_5_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	        }
                           		set(
                           			current, 
                           			"ordered",
                            		lv_ordered_5_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2735:4: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==68) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2735:6: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleEOperation5815); 

                        	newLeafNode(otherlv_6, grammarAccess.getEOperationAccess().getUniqueKeyword_5_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2739:1: ( (lv_unique_7_0= ruleEBoolean ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2740:1: (lv_unique_7_0= ruleEBoolean )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2740:1: (lv_unique_7_0= ruleEBoolean )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2741:3: lv_unique_7_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getUniqueEBooleanParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEOperation5836);
                    lv_unique_7_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	        }
                           		set(
                           			current, 
                           			"unique",
                            		lv_unique_7_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2757:4: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==69) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2757:6: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleEOperation5851); 

                        	newLeafNode(otherlv_8, grammarAccess.getEOperationAccess().getLowerBoundKeyword_6_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2761:1: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2762:1: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2762:1: (lv_lowerBound_9_0= ruleEInt )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2763:3: lv_lowerBound_9_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getLowerBoundEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEOperation5872);
                    lv_lowerBound_9_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	        }
                           		set(
                           			current, 
                           			"lowerBound",
                            		lv_lowerBound_9_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2779:4: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==70) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2779:6: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleEOperation5887); 

                        	newLeafNode(otherlv_10, grammarAccess.getEOperationAccess().getUpperBoundKeyword_7_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2783:1: ( (lv_upperBound_11_0= ruleEInt ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2784:1: (lv_upperBound_11_0= ruleEInt )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2784:1: (lv_upperBound_11_0= ruleEInt )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2785:3: lv_upperBound_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getUpperBoundEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEOperation5908);
                    lv_upperBound_11_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	        }
                           		set(
                           			current, 
                           			"upperBound",
                            		lv_upperBound_11_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2801:4: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==71) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2801:6: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleEOperation5923); 

                        	newLeafNode(otherlv_12, grammarAccess.getEOperationAccess().getETypeKeyword_8_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2805:1: ( ( ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2806:1: ( ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2806:1: ( ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2807:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEOperationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getETypeEClassifierCrossReference_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEOperation5946);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2820:4: (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==72) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2820:6: otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')'
                    {
                    otherlv_14=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleEOperation5961); 

                        	newLeafNode(otherlv_14, grammarAccess.getEOperationAccess().getEExceptionsKeyword_9_0());
                        
                    otherlv_15=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEOperation5973); 

                        	newLeafNode(otherlv_15, grammarAccess.getEOperationAccess().getLeftParenthesisKeyword_9_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2828:1: ( ( ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2829:1: ( ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2829:1: ( ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2830:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEOperationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEOperation5996);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2843:2: (otherlv_17= ',' ( ( ruleEString ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==16) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2843:4: otherlv_17= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEOperation6009); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getEOperationAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2847:1: ( ( ruleEString ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2848:1: ( ruleEString )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2848:1: ( ruleEString )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2849:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEOperationRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEOperation6032);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEOperation6046); 

                        	newLeafNode(otherlv_19, grammarAccess.getEOperationAccess().getRightParenthesisKeyword_9_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2866:3: (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==28) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2866:5: otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEOperation6061); 

                        	newLeafNode(otherlv_20, grammarAccess.getEOperationAccess().getEAnnotationsKeyword_10_0());
                        
                    otherlv_21=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEOperation6073); 

                        	newLeafNode(otherlv_21, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2874:1: ( (lv_eAnnotations_22_0= ruleEAnnotation ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2875:1: (lv_eAnnotations_22_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2875:1: (lv_eAnnotations_22_0= ruleEAnnotation )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2876:3: lv_eAnnotations_22_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getEAnnotationsEAnnotationParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEOperation6094);
                    lv_eAnnotations_22_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_22_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2892:2: (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==16) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2892:4: otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_23=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEOperation6107); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getEOperationAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2896:1: ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2897:1: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2897:1: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2898:3: lv_eAnnotations_24_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEOperationAccess().getEAnnotationsEAnnotationParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEOperation6128);
                    	    lv_eAnnotations_24_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_24_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEOperation6142); 

                        	newLeafNode(otherlv_25, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2918:3: (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==73) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2918:5: otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    {
                    otherlv_26=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleEOperation6157); 

                        	newLeafNode(otherlv_26, grammarAccess.getEOperationAccess().getEGenericTypeKeyword_11_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2922:1: ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2923:1: (lv_eGenericType_27_0= ruleEGenericType )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2923:1: (lv_eGenericType_27_0= ruleEGenericType )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2924:3: lv_eGenericType_27_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getEGenericTypeEGenericTypeParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEOperation6178);
                    lv_eGenericType_27_0=ruleEGenericType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	        }
                           		set(
                           			current, 
                           			"eGenericType",
                            		lv_eGenericType_27_0, 
                            		"EGenericType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2940:4: (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==50) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2940:6: otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEOperation6193); 

                        	newLeafNode(otherlv_28, grammarAccess.getEOperationAccess().getETypeParametersKeyword_12_0());
                        
                    otherlv_29=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEOperation6205); 

                        	newLeafNode(otherlv_29, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_12_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2948:1: ( (lv_eTypeParameters_30_0= ruleETypeParameter ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2949:1: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2949:1: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2950:3: lv_eTypeParameters_30_0= ruleETypeParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getETypeParametersETypeParameterParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEOperation6226);
                    lv_eTypeParameters_30_0=ruleETypeParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	        }
                           		add(
                           			current, 
                           			"eTypeParameters",
                            		lv_eTypeParameters_30_0, 
                            		"ETypeParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2966:2: (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==16) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2966:4: otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_31=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEOperation6239); 

                    	        	newLeafNode(otherlv_31, grammarAccess.getEOperationAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2970:1: ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2971:1: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2971:1: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2972:3: lv_eTypeParameters_32_0= ruleETypeParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEOperationAccess().getETypeParametersETypeParameterParserRuleCall_12_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEOperation6260);
                    	    lv_eTypeParameters_32_0=ruleETypeParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eTypeParameters",
                    	            		lv_eTypeParameters_32_0, 
                    	            		"ETypeParameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEOperation6274); 

                        	newLeafNode(otherlv_33, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_12_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2992:3: (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==74) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:2992:5: otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleEOperation6289); 

                        	newLeafNode(otherlv_34, grammarAccess.getEOperationAccess().getEParametersKeyword_13_0());
                        
                    otherlv_35=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEOperation6301); 

                        	newLeafNode(otherlv_35, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_13_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3000:1: ( (lv_eParameters_36_0= ruleEParameter ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3001:1: (lv_eParameters_36_0= ruleEParameter )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3001:1: (lv_eParameters_36_0= ruleEParameter )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3002:3: lv_eParameters_36_0= ruleEParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getEParametersEParameterParserRuleCall_13_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEParameter_in_ruleEOperation6322);
                    lv_eParameters_36_0=ruleEParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	        }
                           		add(
                           			current, 
                           			"eParameters",
                            		lv_eParameters_36_0, 
                            		"EParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3018:2: (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==16) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3018:4: otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    {
                    	    otherlv_37=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEOperation6335); 

                    	        	newLeafNode(otherlv_37, grammarAccess.getEOperationAccess().getCommaKeyword_13_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3022:1: ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3023:1: (lv_eParameters_38_0= ruleEParameter )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3023:1: (lv_eParameters_38_0= ruleEParameter )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3024:3: lv_eParameters_38_0= ruleEParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEOperationAccess().getEParametersEParameterParserRuleCall_13_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEParameter_in_ruleEOperation6356);
                    	    lv_eParameters_38_0=ruleEParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eParameters",
                    	            		lv_eParameters_38_0, 
                    	            		"EParameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEOperation6370); 

                        	newLeafNode(otherlv_39, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_13_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3044:3: (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==75) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3044:5: otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleEOperation6385); 

                        	newLeafNode(otherlv_40, grammarAccess.getEOperationAccess().getEGenericExceptionsKeyword_14_0());
                        
                    otherlv_41=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEOperation6397); 

                        	newLeafNode(otherlv_41, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_14_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3052:1: ( (lv_eGenericExceptions_42_0= ruleEGenericType ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3053:1: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3053:1: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3054:3: lv_eGenericExceptions_42_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getEGenericExceptionsEGenericTypeParserRuleCall_14_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEOperation6418);
                    lv_eGenericExceptions_42_0=ruleEGenericType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	        }
                           		add(
                           			current, 
                           			"eGenericExceptions",
                            		lv_eGenericExceptions_42_0, 
                            		"EGenericType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3070:2: (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==16) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3070:4: otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEOperation6431); 

                    	        	newLeafNode(otherlv_43, grammarAccess.getEOperationAccess().getCommaKeyword_14_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3074:1: ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3075:1: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3075:1: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3076:3: lv_eGenericExceptions_44_0= ruleEGenericType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEOperationAccess().getEGenericExceptionsEGenericTypeParserRuleCall_14_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEOperation6452);
                    	    lv_eGenericExceptions_44_0=ruleEGenericType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eGenericExceptions",
                    	            		lv_eGenericExceptions_44_0, 
                    	            		"EGenericType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEOperation6466); 

                        	newLeafNode(otherlv_45, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_14_4());
                        

                    }
                    break;

            }

            otherlv_46=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEOperation6480); 

                	newLeafNode(otherlv_46, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_15());
                

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
    // $ANTLR end "ruleEOperation"


    // $ANTLR start "entryRuleEInt"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3108:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3109:2: (iv_ruleEInt= ruleEInt EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3110:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt6517);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt6528); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3117:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3120:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3121:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3121:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3121:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3121:2: (kw= '-' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==22) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3122:2: kw= '-'
                    {
                    kw=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEInt6567); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt6584); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEParameter"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3142:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3143:2: (iv_ruleEParameter= ruleEParameter EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3144:2: iv_ruleEParameter= ruleEParameter EOF
            {
             newCompositeNode(grammarAccess.getEParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEParameter_in_entryRuleEParameter6629);
            iv_ruleEParameter=ruleEParameter();

            state._fsp--;

             current =iv_ruleEParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEParameter6639); 

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
    // $ANTLR end "entryRuleEParameter"


    // $ANTLR start "ruleEParameter"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3151:1: ruleEParameter returns [EObject current=null] : ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) ;
    public final EObject ruleEParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ordered_5_0 = null;

        AntlrDatatypeRuleToken lv_unique_7_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_9_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_11_0 = null;

        EObject lv_eAnnotations_16_0 = null;

        EObject lv_eAnnotations_18_0 = null;

        EObject lv_eGenericType_21_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3154:28: ( ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3155:1: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3155:1: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3155:2: () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}'
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3155:2: ()
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3156:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEParameterAccess().getEParameterAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleEParameter6685); 

                	newLeafNode(otherlv_1, grammarAccess.getEParameterAccess().getEParameterKeyword_1());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3165:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3166:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3166:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3167:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEParameterAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEParameter6706);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEParameterRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEParameter6718); 

                	newLeafNode(otherlv_3, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3187:1: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==67) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3187:3: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleEParameter6731); 

                        	newLeafNode(otherlv_4, grammarAccess.getEParameterAccess().getOrderedKeyword_4_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3191:1: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3192:1: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3192:1: (lv_ordered_5_0= ruleEBoolean )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3193:3: lv_ordered_5_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEParameterAccess().getOrderedEBooleanParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEParameter6752);
                    lv_ordered_5_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"ordered",
                            		lv_ordered_5_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3209:4: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==68) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3209:6: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleEParameter6767); 

                        	newLeafNode(otherlv_6, grammarAccess.getEParameterAccess().getUniqueKeyword_5_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3213:1: ( (lv_unique_7_0= ruleEBoolean ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3214:1: (lv_unique_7_0= ruleEBoolean )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3214:1: (lv_unique_7_0= ruleEBoolean )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3215:3: lv_unique_7_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEParameterAccess().getUniqueEBooleanParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEParameter6788);
                    lv_unique_7_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"unique",
                            		lv_unique_7_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3231:4: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==69) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3231:6: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleEParameter6803); 

                        	newLeafNode(otherlv_8, grammarAccess.getEParameterAccess().getLowerBoundKeyword_6_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3235:1: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3236:1: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3236:1: (lv_lowerBound_9_0= ruleEInt )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3237:3: lv_lowerBound_9_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEParameterAccess().getLowerBoundEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEParameter6824);
                    lv_lowerBound_9_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"lowerBound",
                            		lv_lowerBound_9_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3253:4: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==70) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3253:6: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleEParameter6839); 

                        	newLeafNode(otherlv_10, grammarAccess.getEParameterAccess().getUpperBoundKeyword_7_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3257:1: ( (lv_upperBound_11_0= ruleEInt ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3258:1: (lv_upperBound_11_0= ruleEInt )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3258:1: (lv_upperBound_11_0= ruleEInt )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3259:3: lv_upperBound_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEParameterAccess().getUpperBoundEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEParameter6860);
                    lv_upperBound_11_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"upperBound",
                            		lv_upperBound_11_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3275:4: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==71) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3275:6: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleEParameter6875); 

                        	newLeafNode(otherlv_12, grammarAccess.getEParameterAccess().getETypeKeyword_8_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3279:1: ( ( ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3280:1: ( ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3280:1: ( ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3281:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEParameterRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEParameterAccess().getETypeEClassifierCrossReference_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEParameter6898);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3294:4: (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==28) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3294:6: otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEParameter6913); 

                        	newLeafNode(otherlv_14, grammarAccess.getEParameterAccess().getEAnnotationsKeyword_9_0());
                        
                    otherlv_15=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEParameter6925); 

                        	newLeafNode(otherlv_15, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3302:1: ( (lv_eAnnotations_16_0= ruleEAnnotation ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3303:1: (lv_eAnnotations_16_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3303:1: (lv_eAnnotations_16_0= ruleEAnnotation )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3304:3: lv_eAnnotations_16_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEParameterAccess().getEAnnotationsEAnnotationParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEParameter6946);
                    lv_eAnnotations_16_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEParameterRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_16_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3320:2: (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==16) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3320:4: otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEParameter6959); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getEParameterAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3324:1: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3325:1: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3325:1: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3326:3: lv_eAnnotations_18_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEParameterAccess().getEAnnotationsEAnnotationParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEParameter6980);
                    	    lv_eAnnotations_18_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEParameterRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_18_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop99;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEParameter6994); 

                        	newLeafNode(otherlv_19, grammarAccess.getEParameterAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3346:3: (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==73) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3346:5: otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    {
                    otherlv_20=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleEParameter7009); 

                        	newLeafNode(otherlv_20, grammarAccess.getEParameterAccess().getEGenericTypeKeyword_10_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3350:1: ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3351:1: (lv_eGenericType_21_0= ruleEGenericType )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3351:1: (lv_eGenericType_21_0= ruleEGenericType )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3352:3: lv_eGenericType_21_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEParameterAccess().getEGenericTypeEGenericTypeParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEParameter7030);
                    lv_eGenericType_21_0=ruleEGenericType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"eGenericType",
                            		lv_eGenericType_21_0, 
                            		"EGenericType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEParameter7044); 

                	newLeafNode(otherlv_22, grammarAccess.getEParameterAccess().getRightCurlyBracketKeyword_11());
                

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
    // $ANTLR end "ruleEParameter"


    // $ANTLR start "entryRuleEAttribute"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3380:1: entryRuleEAttribute returns [EObject current=null] : iv_ruleEAttribute= ruleEAttribute EOF ;
    public final EObject entryRuleEAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttribute = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3381:2: (iv_ruleEAttribute= ruleEAttribute EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3382:2: iv_ruleEAttribute= ruleEAttribute EOF
            {
             newCompositeNode(grammarAccess.getEAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEAttribute_in_entryRuleEAttribute7080);
            iv_ruleEAttribute=ruleEAttribute();

            state._fsp--;

             current =iv_ruleEAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEAttribute7090); 

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
    // $ANTLR end "entryRuleEAttribute"


    // $ANTLR start "ruleEAttribute"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3389:1: ruleEAttribute returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) ;
    public final EObject ruleEAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_volatile_1_0=null;
        Token lv_transient_2_0=null;
        Token lv_unsettable_3_0=null;
        Token lv_derived_4_0=null;
        Token lv_iD_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_name_7_0 = null;

        AntlrDatatypeRuleToken lv_ordered_10_0 = null;

        AntlrDatatypeRuleToken lv_unique_12_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_14_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_16_0 = null;

        AntlrDatatypeRuleToken lv_changeable_18_0 = null;

        AntlrDatatypeRuleToken lv_defaultValueLiteral_20_0 = null;

        EObject lv_eAnnotations_25_0 = null;

        EObject lv_eAnnotations_27_0 = null;

        EObject lv_eGenericType_30_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3392:28: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3393:1: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3393:1: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3393:2: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}'
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3393:2: ()
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3394:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEAttributeAccess().getEAttributeAction_0(),
                        current);
                

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3399:2: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==77) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3400:1: (lv_volatile_1_0= 'volatile' )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3400:1: (lv_volatile_1_0= 'volatile' )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3401:3: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleEAttribute7142); 

                            newLeafNode(lv_volatile_1_0, grammarAccess.getEAttributeAccess().getVolatileVolatileKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "volatile", true, "volatile");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3414:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==78) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3415:1: (lv_transient_2_0= 'transient' )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3415:1: (lv_transient_2_0= 'transient' )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3416:3: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleEAttribute7174); 

                            newLeafNode(lv_transient_2_0, grammarAccess.getEAttributeAccess().getTransientTransientKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "transient", true, "transient");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3429:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==79) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3430:1: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3430:1: (lv_unsettable_3_0= 'unsettable' )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3431:3: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleEAttribute7206); 

                            newLeafNode(lv_unsettable_3_0, grammarAccess.getEAttributeAccess().getUnsettableUnsettableKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "unsettable", true, "unsettable");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3444:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==80) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3445:1: (lv_derived_4_0= 'derived' )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3445:1: (lv_derived_4_0= 'derived' )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3446:3: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleEAttribute7238); 

                            newLeafNode(lv_derived_4_0, grammarAccess.getEAttributeAccess().getDerivedDerivedKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "derived", true, "derived");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3459:3: ( (lv_iD_5_0= 'iD' ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==81) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3460:1: (lv_iD_5_0= 'iD' )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3460:1: (lv_iD_5_0= 'iD' )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3461:3: lv_iD_5_0= 'iD'
                    {
                    lv_iD_5_0=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleEAttribute7270); 

                            newLeafNode(lv_iD_5_0, grammarAccess.getEAttributeAccess().getIDIDKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "iD", true, "iD");
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleEAttribute7296); 

                	newLeafNode(otherlv_6, grammarAccess.getEAttributeAccess().getEAttributeKeyword_6());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3478:1: ( (lv_name_7_0= ruleEString ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3479:1: (lv_name_7_0= ruleEString )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3479:1: (lv_name_7_0= ruleEString )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3480:3: lv_name_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEAttributeAccess().getNameEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEAttribute7317);
            lv_name_7_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_7_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEAttribute7329); 

                	newLeafNode(otherlv_8, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_8());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3500:1: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==67) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3500:3: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleEAttribute7342); 

                        	newLeafNode(otherlv_9, grammarAccess.getEAttributeAccess().getOrderedKeyword_9_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3504:1: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3505:1: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3505:1: (lv_ordered_10_0= ruleEBoolean )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3506:3: lv_ordered_10_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getOrderedEBooleanParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEAttribute7363);
                    lv_ordered_10_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"ordered",
                            		lv_ordered_10_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3522:4: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==68) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3522:6: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleEAttribute7378); 

                        	newLeafNode(otherlv_11, grammarAccess.getEAttributeAccess().getUniqueKeyword_10_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3526:1: ( (lv_unique_12_0= ruleEBoolean ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3527:1: (lv_unique_12_0= ruleEBoolean )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3527:1: (lv_unique_12_0= ruleEBoolean )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3528:3: lv_unique_12_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getUniqueEBooleanParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEAttribute7399);
                    lv_unique_12_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"unique",
                            		lv_unique_12_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3544:4: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==69) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3544:6: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleEAttribute7414); 

                        	newLeafNode(otherlv_13, grammarAccess.getEAttributeAccess().getLowerBoundKeyword_11_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3548:1: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3549:1: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3549:1: (lv_lowerBound_14_0= ruleEInt )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3550:3: lv_lowerBound_14_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getLowerBoundEIntParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEAttribute7435);
                    lv_lowerBound_14_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"lowerBound",
                            		lv_lowerBound_14_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3566:4: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==70) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3566:6: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleEAttribute7450); 

                        	newLeafNode(otherlv_15, grammarAccess.getEAttributeAccess().getUpperBoundKeyword_12_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3570:1: ( (lv_upperBound_16_0= ruleEInt ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3571:1: (lv_upperBound_16_0= ruleEInt )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3571:1: (lv_upperBound_16_0= ruleEInt )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3572:3: lv_upperBound_16_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getUpperBoundEIntParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEAttribute7471);
                    lv_upperBound_16_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"upperBound",
                            		lv_upperBound_16_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3588:4: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==83) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3588:6: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleEAttribute7486); 

                        	newLeafNode(otherlv_17, grammarAccess.getEAttributeAccess().getChangeableKeyword_13_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3592:1: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3593:1: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3593:1: (lv_changeable_18_0= ruleEBoolean )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3594:3: lv_changeable_18_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getChangeableEBooleanParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEAttribute7507);
                    lv_changeable_18_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"changeable",
                            		lv_changeable_18_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3610:4: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==84) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3610:6: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleEAttribute7522); 

                        	newLeafNode(otherlv_19, grammarAccess.getEAttributeAccess().getDefaultValueLiteralKeyword_14_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3614:1: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3615:1: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3615:1: (lv_defaultValueLiteral_20_0= ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3616:3: lv_defaultValueLiteral_20_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEAttribute7543);
                    lv_defaultValueLiteral_20_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"defaultValueLiteral",
                            		lv_defaultValueLiteral_20_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3632:4: (otherlv_21= 'eType' ( ( ruleEString ) ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==71) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3632:6: otherlv_21= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_21=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleEAttribute7558); 

                        	newLeafNode(otherlv_21, grammarAccess.getEAttributeAccess().getETypeKeyword_15_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3636:1: ( ( ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3637:1: ( ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3637:1: ( ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3638:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAttributeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getETypeEClassifierCrossReference_15_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEAttribute7581);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3651:4: (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==28) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3651:6: otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEAttribute7596); 

                        	newLeafNode(otherlv_23, grammarAccess.getEAttributeAccess().getEAnnotationsKeyword_16_0());
                        
                    otherlv_24=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEAttribute7608); 

                        	newLeafNode(otherlv_24, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_16_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3659:1: ( (lv_eAnnotations_25_0= ruleEAnnotation ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3660:1: (lv_eAnnotations_25_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3660:1: (lv_eAnnotations_25_0= ruleEAnnotation )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3661:3: lv_eAnnotations_25_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getEAnnotationsEAnnotationParserRuleCall_16_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEAttribute7629);
                    lv_eAnnotations_25_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_25_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3677:2: (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==16) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3677:4: otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_26=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEAttribute7642); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getEAttributeAccess().getCommaKeyword_16_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3681:1: ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3682:1: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3682:1: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3683:3: lv_eAnnotations_27_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEAttributeAccess().getEAnnotationsEAnnotationParserRuleCall_16_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEAttribute7663);
                    	    lv_eAnnotations_27_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_27_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop114;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEAttribute7677); 

                        	newLeafNode(otherlv_28, grammarAccess.getEAttributeAccess().getRightCurlyBracketKeyword_16_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3703:3: (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==73) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3703:5: otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    {
                    otherlv_29=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleEAttribute7692); 

                        	newLeafNode(otherlv_29, grammarAccess.getEAttributeAccess().getEGenericTypeKeyword_17_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3707:1: ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3708:1: (lv_eGenericType_30_0= ruleEGenericType )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3708:1: (lv_eGenericType_30_0= ruleEGenericType )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3709:3: lv_eGenericType_30_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getEGenericTypeEGenericTypeParserRuleCall_17_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEAttribute7713);
                    lv_eGenericType_30_0=ruleEGenericType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"eGenericType",
                            		lv_eGenericType_30_0, 
                            		"EGenericType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_31=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEAttribute7727); 

                	newLeafNode(otherlv_31, grammarAccess.getEAttributeAccess().getRightCurlyBracketKeyword_18());
                

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
    // $ANTLR end "ruleEAttribute"


    // $ANTLR start "entryRuleEReference"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3737:1: entryRuleEReference returns [EObject current=null] : iv_ruleEReference= ruleEReference EOF ;
    public final EObject entryRuleEReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEReference = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3738:2: (iv_ruleEReference= ruleEReference EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3739:2: iv_ruleEReference= ruleEReference EOF
            {
             newCompositeNode(grammarAccess.getEReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEReference_in_entryRuleEReference7763);
            iv_ruleEReference=ruleEReference();

            state._fsp--;

             current =iv_ruleEReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEReference7773); 

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
    // $ANTLR end "entryRuleEReference"


    // $ANTLR start "ruleEReference"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3746:1: ruleEReference returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) ;
    public final EObject ruleEReference() throws RecognitionException {
        EObject current = null;

        Token lv_volatile_1_0=null;
        Token lv_transient_2_0=null;
        Token lv_unsettable_3_0=null;
        Token lv_derived_4_0=null;
        Token lv_containment_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        AntlrDatatypeRuleToken lv_name_7_0 = null;

        AntlrDatatypeRuleToken lv_ordered_10_0 = null;

        AntlrDatatypeRuleToken lv_unique_12_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_14_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_16_0 = null;

        AntlrDatatypeRuleToken lv_changeable_18_0 = null;

        AntlrDatatypeRuleToken lv_defaultValueLiteral_20_0 = null;

        AntlrDatatypeRuleToken lv_resolveProxies_22_0 = null;

        EObject lv_eAnnotations_35_0 = null;

        EObject lv_eAnnotations_37_0 = null;

        EObject lv_eGenericType_40_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3749:28: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3750:1: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3750:1: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3750:2: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}'
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3750:2: ()
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3751:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEReferenceAccess().getEReferenceAction_0(),
                        current);
                

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3756:2: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==77) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3757:1: (lv_volatile_1_0= 'volatile' )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3757:1: (lv_volatile_1_0= 'volatile' )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3758:3: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleEReference7825); 

                            newLeafNode(lv_volatile_1_0, grammarAccess.getEReferenceAccess().getVolatileVolatileKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "volatile", true, "volatile");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3771:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==78) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3772:1: (lv_transient_2_0= 'transient' )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3772:1: (lv_transient_2_0= 'transient' )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3773:3: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleEReference7857); 

                            newLeafNode(lv_transient_2_0, grammarAccess.getEReferenceAccess().getTransientTransientKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "transient", true, "transient");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3786:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==79) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3787:1: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3787:1: (lv_unsettable_3_0= 'unsettable' )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3788:3: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleEReference7889); 

                            newLeafNode(lv_unsettable_3_0, grammarAccess.getEReferenceAccess().getUnsettableUnsettableKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "unsettable", true, "unsettable");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3801:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==80) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3802:1: (lv_derived_4_0= 'derived' )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3802:1: (lv_derived_4_0= 'derived' )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3803:3: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleEReference7921); 

                            newLeafNode(lv_derived_4_0, grammarAccess.getEReferenceAccess().getDerivedDerivedKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "derived", true, "derived");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3816:3: ( (lv_containment_5_0= 'containment' ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==85) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3817:1: (lv_containment_5_0= 'containment' )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3817:1: (lv_containment_5_0= 'containment' )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3818:3: lv_containment_5_0= 'containment'
                    {
                    lv_containment_5_0=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleEReference7953); 

                            newLeafNode(lv_containment_5_0, grammarAccess.getEReferenceAccess().getContainmentContainmentKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "containment", true, "containment");
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleEReference7979); 

                	newLeafNode(otherlv_6, grammarAccess.getEReferenceAccess().getEReferenceKeyword_6());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3835:1: ( (lv_name_7_0= ruleEString ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3836:1: (lv_name_7_0= ruleEString )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3836:1: (lv_name_7_0= ruleEString )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3837:3: lv_name_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEReferenceAccess().getNameEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEReference8000);
            lv_name_7_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_7_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEReference8012); 

                	newLeafNode(otherlv_8, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_8());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3857:1: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==67) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3857:3: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleEReference8025); 

                        	newLeafNode(otherlv_9, grammarAccess.getEReferenceAccess().getOrderedKeyword_9_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3861:1: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3862:1: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3862:1: (lv_ordered_10_0= ruleEBoolean )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3863:3: lv_ordered_10_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getOrderedEBooleanParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEReference8046);
                    lv_ordered_10_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"ordered",
                            		lv_ordered_10_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3879:4: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==68) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3879:6: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleEReference8061); 

                        	newLeafNode(otherlv_11, grammarAccess.getEReferenceAccess().getUniqueKeyword_10_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3883:1: ( (lv_unique_12_0= ruleEBoolean ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3884:1: (lv_unique_12_0= ruleEBoolean )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3884:1: (lv_unique_12_0= ruleEBoolean )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3885:3: lv_unique_12_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getUniqueEBooleanParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEReference8082);
                    lv_unique_12_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"unique",
                            		lv_unique_12_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3901:4: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==69) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3901:6: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleEReference8097); 

                        	newLeafNode(otherlv_13, grammarAccess.getEReferenceAccess().getLowerBoundKeyword_11_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3905:1: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3906:1: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3906:1: (lv_lowerBound_14_0= ruleEInt )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3907:3: lv_lowerBound_14_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getLowerBoundEIntParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEReference8118);
                    lv_lowerBound_14_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"lowerBound",
                            		lv_lowerBound_14_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3923:4: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==70) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3923:6: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleEReference8133); 

                        	newLeafNode(otherlv_15, grammarAccess.getEReferenceAccess().getUpperBoundKeyword_12_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3927:1: ( (lv_upperBound_16_0= ruleEInt ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3928:1: (lv_upperBound_16_0= ruleEInt )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3928:1: (lv_upperBound_16_0= ruleEInt )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3929:3: lv_upperBound_16_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getUpperBoundEIntParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEReference8154);
                    lv_upperBound_16_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"upperBound",
                            		lv_upperBound_16_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3945:4: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==83) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3945:6: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleEReference8169); 

                        	newLeafNode(otherlv_17, grammarAccess.getEReferenceAccess().getChangeableKeyword_13_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3949:1: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3950:1: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3950:1: (lv_changeable_18_0= ruleEBoolean )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3951:3: lv_changeable_18_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getChangeableEBooleanParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEReference8190);
                    lv_changeable_18_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"changeable",
                            		lv_changeable_18_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3967:4: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==84) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3967:6: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleEReference8205); 

                        	newLeafNode(otherlv_19, grammarAccess.getEReferenceAccess().getDefaultValueLiteralKeyword_14_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3971:1: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3972:1: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3972:1: (lv_defaultValueLiteral_20_0= ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3973:3: lv_defaultValueLiteral_20_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEReference8226);
                    lv_defaultValueLiteral_20_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"defaultValueLiteral",
                            		lv_defaultValueLiteral_20_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3989:4: (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==87) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3989:6: otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    {
                    otherlv_21=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleEReference8241); 

                        	newLeafNode(otherlv_21, grammarAccess.getEReferenceAccess().getResolveProxiesKeyword_15_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3993:1: ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3994:1: (lv_resolveProxies_22_0= ruleEBoolean )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3994:1: (lv_resolveProxies_22_0= ruleEBoolean )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:3995:3: lv_resolveProxies_22_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getResolveProxiesEBooleanParserRuleCall_15_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEReference8262);
                    lv_resolveProxies_22_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"resolveProxies",
                            		lv_resolveProxies_22_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4011:4: (otherlv_23= 'eType' ( ( ruleEString ) ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==71) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4011:6: otherlv_23= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_23=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleEReference8277); 

                        	newLeafNode(otherlv_23, grammarAccess.getEReferenceAccess().getETypeKeyword_16_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4015:1: ( ( ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4016:1: ( ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4016:1: ( ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4017:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getETypeEClassifierCrossReference_16_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEReference8300);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4030:4: (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==88) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4030:6: otherlv_25= 'eOpposite' ( ( ruleEString ) )
                    {
                    otherlv_25=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleEReference8315); 

                        	newLeafNode(otherlv_25, grammarAccess.getEReferenceAccess().getEOppositeKeyword_17_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4034:1: ( ( ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4035:1: ( ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4035:1: ( ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4036:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getEOppositeEReferenceCrossReference_17_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEReference8338);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4049:4: (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==89) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4049:6: otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')'
                    {
                    otherlv_27=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleEReference8353); 

                        	newLeafNode(otherlv_27, grammarAccess.getEReferenceAccess().getEKeysKeyword_18_0());
                        
                    otherlv_28=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEReference8365); 

                        	newLeafNode(otherlv_28, grammarAccess.getEReferenceAccess().getLeftParenthesisKeyword_18_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4057:1: ( ( ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4058:1: ( ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4058:1: ( ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4059:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEReference8388);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4072:2: (otherlv_30= ',' ( ( ruleEString ) ) )*
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==16) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4072:4: otherlv_30= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_30=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEReference8401); 

                    	        	newLeafNode(otherlv_30, grammarAccess.getEReferenceAccess().getCommaKeyword_18_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4076:1: ( ( ruleEString ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4077:1: ( ruleEString )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4077:1: ( ruleEString )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4078:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEReference8424);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop131;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEReference8438); 

                        	newLeafNode(otherlv_32, grammarAccess.getEReferenceAccess().getRightParenthesisKeyword_18_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4095:3: (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==28) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4095:5: otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEReference8453); 

                        	newLeafNode(otherlv_33, grammarAccess.getEReferenceAccess().getEAnnotationsKeyword_19_0());
                        
                    otherlv_34=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEReference8465); 

                        	newLeafNode(otherlv_34, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_19_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4103:1: ( (lv_eAnnotations_35_0= ruleEAnnotation ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4104:1: (lv_eAnnotations_35_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4104:1: (lv_eAnnotations_35_0= ruleEAnnotation )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4105:3: lv_eAnnotations_35_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getEAnnotationsEAnnotationParserRuleCall_19_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEReference8486);
                    lv_eAnnotations_35_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_35_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4121:2: (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )*
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( (LA133_0==16) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4121:4: otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_36=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEReference8499); 

                    	        	newLeafNode(otherlv_36, grammarAccess.getEReferenceAccess().getCommaKeyword_19_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4125:1: ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4126:1: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4126:1: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4127:3: lv_eAnnotations_37_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEReferenceAccess().getEAnnotationsEAnnotationParserRuleCall_19_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEReference8520);
                    	    lv_eAnnotations_37_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_37_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop133;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEReference8534); 

                        	newLeafNode(otherlv_38, grammarAccess.getEReferenceAccess().getRightCurlyBracketKeyword_19_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4147:3: (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==73) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4147:5: otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    {
                    otherlv_39=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleEReference8549); 

                        	newLeafNode(otherlv_39, grammarAccess.getEReferenceAccess().getEGenericTypeKeyword_20_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4151:1: ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4152:1: (lv_eGenericType_40_0= ruleEGenericType )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4152:1: (lv_eGenericType_40_0= ruleEGenericType )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4153:3: lv_eGenericType_40_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getEGenericTypeEGenericTypeParserRuleCall_20_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEReference8570);
                    lv_eGenericType_40_0=ruleEGenericType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"eGenericType",
                            		lv_eGenericType_40_0, 
                            		"EGenericType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_41=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEReference8584); 

                	newLeafNode(otherlv_41, grammarAccess.getEReferenceAccess().getRightCurlyBracketKeyword_21());
                

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
    // $ANTLR end "ruleEReference"


    // $ANTLR start "entryRuleEEnumLiteral"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4181:1: entryRuleEEnumLiteral returns [EObject current=null] : iv_ruleEEnumLiteral= ruleEEnumLiteral EOF ;
    public final EObject entryRuleEEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnumLiteral = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4182:2: (iv_ruleEEnumLiteral= ruleEEnumLiteral EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4183:2: iv_ruleEEnumLiteral= ruleEEnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getEEnumLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEEnumLiteral_in_entryRuleEEnumLiteral8620);
            iv_ruleEEnumLiteral=ruleEEnumLiteral();

            state._fsp--;

             current =iv_ruleEEnumLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEEnumLiteral8630); 

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
    // $ANTLR end "entryRuleEEnumLiteral"


    // $ANTLR start "ruleEEnumLiteral"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4190:1: ruleEEnumLiteral returns [EObject current=null] : ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleEEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_literal_7_0 = null;

        EObject lv_eAnnotations_10_0 = null;

        EObject lv_eAnnotations_12_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4193:28: ( ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4194:1: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4194:1: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4194:2: () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4194:2: ()
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4195:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEEnumLiteralAccess().getEEnumLiteralAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleEEnumLiteral8676); 

                	newLeafNode(otherlv_1, grammarAccess.getEEnumLiteralAccess().getEEnumLiteralKeyword_1());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4204:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4205:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4205:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4206:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEEnumLiteralAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEEnumLiteral8697);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEEnumLiteral8709); 

                	newLeafNode(otherlv_3, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4226:1: (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==40) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4226:3: otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleEEnumLiteral8722); 

                        	newLeafNode(otherlv_4, grammarAccess.getEEnumLiteralAccess().getValueKeyword_4_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4230:1: ( (lv_value_5_0= ruleEInt ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4231:1: (lv_value_5_0= ruleEInt )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4231:1: (lv_value_5_0= ruleEInt )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4232:3: lv_value_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumLiteralAccess().getValueEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEEnumLiteral8743);
                    lv_value_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4248:4: (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==91) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4248:6: otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleEEnumLiteral8758); 

                        	newLeafNode(otherlv_6, grammarAccess.getEEnumLiteralAccess().getLiteralKeyword_5_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4252:1: ( (lv_literal_7_0= ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4253:1: (lv_literal_7_0= ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4253:1: (lv_literal_7_0= ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4254:3: lv_literal_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumLiteralAccess().getLiteralEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEEnumLiteral8779);
                    lv_literal_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"literal",
                            		lv_literal_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4270:4: (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==28) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4270:6: otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEEnumLiteral8794); 

                        	newLeafNode(otherlv_8, grammarAccess.getEEnumLiteralAccess().getEAnnotationsKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEEnumLiteral8806); 

                        	newLeafNode(otherlv_9, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4278:1: ( (lv_eAnnotations_10_0= ruleEAnnotation ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4279:1: (lv_eAnnotations_10_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4279:1: (lv_eAnnotations_10_0= ruleEAnnotation )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4280:3: lv_eAnnotations_10_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumLiteralAccess().getEAnnotationsEAnnotationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEEnumLiteral8827);
                    lv_eAnnotations_10_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_10_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4296:2: (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )*
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==16) ) {
                            alt138=1;
                        }


                        switch (alt138) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4296:4: otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEEnumLiteral8840); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getEEnumLiteralAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4300:1: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4301:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4301:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4302:3: lv_eAnnotations_12_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEEnumLiteralAccess().getEAnnotationsEAnnotationParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEEnumLiteral8861);
                    	    lv_eAnnotations_12_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_12_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop138;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEEnumLiteral8875); 

                        	newLeafNode(otherlv_13, grammarAccess.getEEnumLiteralAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEEnumLiteral8889); 

                	newLeafNode(otherlv_14, grammarAccess.getEEnumLiteralAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleEEnumLiteral"


    // $ANTLR start "entryRuleDSGenFeature_Impl"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4334:1: entryRuleDSGenFeature_Impl returns [EObject current=null] : iv_ruleDSGenFeature_Impl= ruleDSGenFeature_Impl EOF ;
    public final EObject entryRuleDSGenFeature_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSGenFeature_Impl = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4335:2: (iv_ruleDSGenFeature_Impl= ruleDSGenFeature_Impl EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4336:2: iv_ruleDSGenFeature_Impl= ruleDSGenFeature_Impl EOF
            {
             newCompositeNode(grammarAccess.getDSGenFeature_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDSGenFeature_Impl_in_entryRuleDSGenFeature_Impl8925);
            iv_ruleDSGenFeature_Impl=ruleDSGenFeature_Impl();

            state._fsp--;

             current =iv_ruleDSGenFeature_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDSGenFeature_Impl8935); 

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
    // $ANTLR end "entryRuleDSGenFeature_Impl"


    // $ANTLR start "ruleDSGenFeature_Impl"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4343:1: ruleDSGenFeature_Impl returns [EObject current=null] : (otherlv_0= 'DSGenFeature' otherlv_1= '{' otherlv_2= 'ecoreFeature' ( ( ruleEString ) ) (otherlv_4= 'generator' ( (lv_generator_5_0= ruleValueGenerator ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleDSGenFeature_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_generator_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4346:28: ( (otherlv_0= 'DSGenFeature' otherlv_1= '{' otherlv_2= 'ecoreFeature' ( ( ruleEString ) ) (otherlv_4= 'generator' ( (lv_generator_5_0= ruleValueGenerator ) ) )? otherlv_6= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4347:1: (otherlv_0= 'DSGenFeature' otherlv_1= '{' otherlv_2= 'ecoreFeature' ( ( ruleEString ) ) (otherlv_4= 'generator' ( (lv_generator_5_0= ruleValueGenerator ) ) )? otherlv_6= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4347:1: (otherlv_0= 'DSGenFeature' otherlv_1= '{' otherlv_2= 'ecoreFeature' ( ( ruleEString ) ) (otherlv_4= 'generator' ( (lv_generator_5_0= ruleValueGenerator ) ) )? otherlv_6= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4347:3: otherlv_0= 'DSGenFeature' otherlv_1= '{' otherlv_2= 'ecoreFeature' ( ( ruleEString ) ) (otherlv_4= 'generator' ( (lv_generator_5_0= ruleValueGenerator ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleDSGenFeature_Impl8972); 

                	newLeafNode(otherlv_0, grammarAccess.getDSGenFeature_ImplAccess().getDSGenFeatureKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDSGenFeature_Impl8984); 

                	newLeafNode(otherlv_1, grammarAccess.getDSGenFeature_ImplAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleDSGenFeature_Impl8996); 

                	newLeafNode(otherlv_2, grammarAccess.getDSGenFeature_ImplAccess().getEcoreFeatureKeyword_2());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4359:1: ( ( ruleEString ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4360:1: ( ruleEString )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4360:1: ( ruleEString )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4361:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDSGenFeature_ImplRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDSGenFeature_ImplAccess().getEcoreFeatureEStructuralFeatureCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDSGenFeature_Impl9019);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4374:2: (otherlv_4= 'generator' ( (lv_generator_5_0= ruleValueGenerator ) ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==94) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4374:4: otherlv_4= 'generator' ( (lv_generator_5_0= ruleValueGenerator ) )
                    {
                    otherlv_4=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleDSGenFeature_Impl9032); 

                        	newLeafNode(otherlv_4, grammarAccess.getDSGenFeature_ImplAccess().getGeneratorKeyword_4_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4378:1: ( (lv_generator_5_0= ruleValueGenerator ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4379:1: (lv_generator_5_0= ruleValueGenerator )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4379:1: (lv_generator_5_0= ruleValueGenerator )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4380:3: lv_generator_5_0= ruleValueGenerator
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSGenFeature_ImplAccess().getGeneratorValueGeneratorParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleValueGenerator_in_ruleDSGenFeature_Impl9053);
                    lv_generator_5_0=ruleValueGenerator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSGenFeature_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"generator",
                            		lv_generator_5_0, 
                            		"ValueGenerator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDSGenFeature_Impl9067); 

                	newLeafNode(otherlv_6, grammarAccess.getDSGenFeature_ImplAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleDSGenFeature_Impl"


    // $ANTLR start "entryRuleDSGenClass"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4408:1: entryRuleDSGenClass returns [EObject current=null] : iv_ruleDSGenClass= ruleDSGenClass EOF ;
    public final EObject entryRuleDSGenClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSGenClass = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4409:2: (iv_ruleDSGenClass= ruleDSGenClass EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4410:2: iv_ruleDSGenClass= ruleDSGenClass EOF
            {
             newCompositeNode(grammarAccess.getDSGenClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDSGenClass_in_entryRuleDSGenClass9103);
            iv_ruleDSGenClass=ruleDSGenClass();

            state._fsp--;

             current =iv_ruleDSGenClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDSGenClass9113); 

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
    // $ANTLR end "entryRuleDSGenClass"


    // $ANTLR start "ruleDSGenClass"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4417:1: ruleDSGenClass returns [EObject current=null] : (otherlv_0= 'DSGenClass' otherlv_1= '{' otherlv_2= 'ecoreClass' ( ( ruleEString ) ) (otherlv_4= 'dsgenFeatures' otherlv_5= '{' ( (lv_dsgenFeatures_6_0= ruleDSGenFeature ) ) (otherlv_7= ',' ( (lv_dsgenFeatures_8_0= ruleDSGenFeature ) ) )* otherlv_9= '}' )? (otherlv_10= 'generator' ( (lv_generator_11_0= ruleEObjectGenerator ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleDSGenClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_dsgenFeatures_6_0 = null;

        EObject lv_dsgenFeatures_8_0 = null;

        EObject lv_generator_11_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4420:28: ( (otherlv_0= 'DSGenClass' otherlv_1= '{' otherlv_2= 'ecoreClass' ( ( ruleEString ) ) (otherlv_4= 'dsgenFeatures' otherlv_5= '{' ( (lv_dsgenFeatures_6_0= ruleDSGenFeature ) ) (otherlv_7= ',' ( (lv_dsgenFeatures_8_0= ruleDSGenFeature ) ) )* otherlv_9= '}' )? (otherlv_10= 'generator' ( (lv_generator_11_0= ruleEObjectGenerator ) ) )? otherlv_12= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4421:1: (otherlv_0= 'DSGenClass' otherlv_1= '{' otherlv_2= 'ecoreClass' ( ( ruleEString ) ) (otherlv_4= 'dsgenFeatures' otherlv_5= '{' ( (lv_dsgenFeatures_6_0= ruleDSGenFeature ) ) (otherlv_7= ',' ( (lv_dsgenFeatures_8_0= ruleDSGenFeature ) ) )* otherlv_9= '}' )? (otherlv_10= 'generator' ( (lv_generator_11_0= ruleEObjectGenerator ) ) )? otherlv_12= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4421:1: (otherlv_0= 'DSGenClass' otherlv_1= '{' otherlv_2= 'ecoreClass' ( ( ruleEString ) ) (otherlv_4= 'dsgenFeatures' otherlv_5= '{' ( (lv_dsgenFeatures_6_0= ruleDSGenFeature ) ) (otherlv_7= ',' ( (lv_dsgenFeatures_8_0= ruleDSGenFeature ) ) )* otherlv_9= '}' )? (otherlv_10= 'generator' ( (lv_generator_11_0= ruleEObjectGenerator ) ) )? otherlv_12= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4421:3: otherlv_0= 'DSGenClass' otherlv_1= '{' otherlv_2= 'ecoreClass' ( ( ruleEString ) ) (otherlv_4= 'dsgenFeatures' otherlv_5= '{' ( (lv_dsgenFeatures_6_0= ruleDSGenFeature ) ) (otherlv_7= ',' ( (lv_dsgenFeatures_8_0= ruleDSGenFeature ) ) )* otherlv_9= '}' )? (otherlv_10= 'generator' ( (lv_generator_11_0= ruleEObjectGenerator ) ) )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,95,FollowSets000.FOLLOW_95_in_ruleDSGenClass9150); 

                	newLeafNode(otherlv_0, grammarAccess.getDSGenClassAccess().getDSGenClassKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDSGenClass9162); 

                	newLeafNode(otherlv_1, grammarAccess.getDSGenClassAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,96,FollowSets000.FOLLOW_96_in_ruleDSGenClass9174); 

                	newLeafNode(otherlv_2, grammarAccess.getDSGenClassAccess().getEcoreClassKeyword_2());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4433:1: ( ( ruleEString ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4434:1: ( ruleEString )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4434:1: ( ruleEString )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4435:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDSGenClassRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDSGenClassAccess().getEcoreClassEClassCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDSGenClass9197);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4448:2: (otherlv_4= 'dsgenFeatures' otherlv_5= '{' ( (lv_dsgenFeatures_6_0= ruleDSGenFeature ) ) (otherlv_7= ',' ( (lv_dsgenFeatures_8_0= ruleDSGenFeature ) ) )* otherlv_9= '}' )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==97) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4448:4: otherlv_4= 'dsgenFeatures' otherlv_5= '{' ( (lv_dsgenFeatures_6_0= ruleDSGenFeature ) ) (otherlv_7= ',' ( (lv_dsgenFeatures_8_0= ruleDSGenFeature ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,97,FollowSets000.FOLLOW_97_in_ruleDSGenClass9210); 

                        	newLeafNode(otherlv_4, grammarAccess.getDSGenClassAccess().getDsgenFeaturesKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDSGenClass9222); 

                        	newLeafNode(otherlv_5, grammarAccess.getDSGenClassAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4456:1: ( (lv_dsgenFeatures_6_0= ruleDSGenFeature ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4457:1: (lv_dsgenFeatures_6_0= ruleDSGenFeature )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4457:1: (lv_dsgenFeatures_6_0= ruleDSGenFeature )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4458:3: lv_dsgenFeatures_6_0= ruleDSGenFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSGenClassAccess().getDsgenFeaturesDSGenFeatureParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDSGenFeature_in_ruleDSGenClass9243);
                    lv_dsgenFeatures_6_0=ruleDSGenFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSGenClassRule());
                    	        }
                           		add(
                           			current, 
                           			"dsgenFeatures",
                            		lv_dsgenFeatures_6_0, 
                            		"DSGenFeature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4474:2: (otherlv_7= ',' ( (lv_dsgenFeatures_8_0= ruleDSGenFeature ) ) )*
                    loop141:
                    do {
                        int alt141=2;
                        int LA141_0 = input.LA(1);

                        if ( (LA141_0==16) ) {
                            alt141=1;
                        }


                        switch (alt141) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4474:4: otherlv_7= ',' ( (lv_dsgenFeatures_8_0= ruleDSGenFeature ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDSGenClass9256); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getDSGenClassAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4478:1: ( (lv_dsgenFeatures_8_0= ruleDSGenFeature ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4479:1: (lv_dsgenFeatures_8_0= ruleDSGenFeature )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4479:1: (lv_dsgenFeatures_8_0= ruleDSGenFeature )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4480:3: lv_dsgenFeatures_8_0= ruleDSGenFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDSGenClassAccess().getDsgenFeaturesDSGenFeatureParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDSGenFeature_in_ruleDSGenClass9277);
                    	    lv_dsgenFeatures_8_0=ruleDSGenFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDSGenClassRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"dsgenFeatures",
                    	            		lv_dsgenFeatures_8_0, 
                    	            		"DSGenFeature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop141;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDSGenClass9291); 

                        	newLeafNode(otherlv_9, grammarAccess.getDSGenClassAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4500:3: (otherlv_10= 'generator' ( (lv_generator_11_0= ruleEObjectGenerator ) ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==94) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4500:5: otherlv_10= 'generator' ( (lv_generator_11_0= ruleEObjectGenerator ) )
                    {
                    otherlv_10=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleDSGenClass9306); 

                        	newLeafNode(otherlv_10, grammarAccess.getDSGenClassAccess().getGeneratorKeyword_5_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4504:1: ( (lv_generator_11_0= ruleEObjectGenerator ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4505:1: (lv_generator_11_0= ruleEObjectGenerator )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4505:1: (lv_generator_11_0= ruleEObjectGenerator )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4506:3: lv_generator_11_0= ruleEObjectGenerator
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSGenClassAccess().getGeneratorEObjectGeneratorParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEObjectGenerator_in_ruleDSGenClass9327);
                    lv_generator_11_0=ruleEObjectGenerator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSGenClassRule());
                    	        }
                           		set(
                           			current, 
                           			"generator",
                            		lv_generator_11_0, 
                            		"EObjectGenerator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDSGenClass9341); 

                	newLeafNode(otherlv_12, grammarAccess.getDSGenClassAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleDSGenClass"


    // $ANTLR start "entryRuleDSGenDataType_Impl"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4534:1: entryRuleDSGenDataType_Impl returns [EObject current=null] : iv_ruleDSGenDataType_Impl= ruleDSGenDataType_Impl EOF ;
    public final EObject entryRuleDSGenDataType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSGenDataType_Impl = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4535:2: (iv_ruleDSGenDataType_Impl= ruleDSGenDataType_Impl EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4536:2: iv_ruleDSGenDataType_Impl= ruleDSGenDataType_Impl EOF
            {
             newCompositeNode(grammarAccess.getDSGenDataType_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDSGenDataType_Impl_in_entryRuleDSGenDataType_Impl9377);
            iv_ruleDSGenDataType_Impl=ruleDSGenDataType_Impl();

            state._fsp--;

             current =iv_ruleDSGenDataType_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDSGenDataType_Impl9387); 

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
    // $ANTLR end "entryRuleDSGenDataType_Impl"


    // $ANTLR start "ruleDSGenDataType_Impl"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4543:1: ruleDSGenDataType_Impl returns [EObject current=null] : (otherlv_0= 'DSGenDataType' otherlv_1= '{' otherlv_2= 'ecoreClass' ( ( ruleEString ) ) otherlv_4= 'dataType' ( ( ruleEString ) ) (otherlv_6= 'dsgenFeatures' otherlv_7= '{' ( (lv_dsgenFeatures_8_0= ruleDSGenFeature ) ) (otherlv_9= ',' ( (lv_dsgenFeatures_10_0= ruleDSGenFeature ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleDSGenDataType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_dsgenFeatures_8_0 = null;

        EObject lv_dsgenFeatures_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4546:28: ( (otherlv_0= 'DSGenDataType' otherlv_1= '{' otherlv_2= 'ecoreClass' ( ( ruleEString ) ) otherlv_4= 'dataType' ( ( ruleEString ) ) (otherlv_6= 'dsgenFeatures' otherlv_7= '{' ( (lv_dsgenFeatures_8_0= ruleDSGenFeature ) ) (otherlv_9= ',' ( (lv_dsgenFeatures_10_0= ruleDSGenFeature ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4547:1: (otherlv_0= 'DSGenDataType' otherlv_1= '{' otherlv_2= 'ecoreClass' ( ( ruleEString ) ) otherlv_4= 'dataType' ( ( ruleEString ) ) (otherlv_6= 'dsgenFeatures' otherlv_7= '{' ( (lv_dsgenFeatures_8_0= ruleDSGenFeature ) ) (otherlv_9= ',' ( (lv_dsgenFeatures_10_0= ruleDSGenFeature ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4547:1: (otherlv_0= 'DSGenDataType' otherlv_1= '{' otherlv_2= 'ecoreClass' ( ( ruleEString ) ) otherlv_4= 'dataType' ( ( ruleEString ) ) (otherlv_6= 'dsgenFeatures' otherlv_7= '{' ( (lv_dsgenFeatures_8_0= ruleDSGenFeature ) ) (otherlv_9= ',' ( (lv_dsgenFeatures_10_0= ruleDSGenFeature ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4547:3: otherlv_0= 'DSGenDataType' otherlv_1= '{' otherlv_2= 'ecoreClass' ( ( ruleEString ) ) otherlv_4= 'dataType' ( ( ruleEString ) ) (otherlv_6= 'dsgenFeatures' otherlv_7= '{' ( (lv_dsgenFeatures_8_0= ruleDSGenFeature ) ) (otherlv_9= ',' ( (lv_dsgenFeatures_10_0= ruleDSGenFeature ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,98,FollowSets000.FOLLOW_98_in_ruleDSGenDataType_Impl9424); 

                	newLeafNode(otherlv_0, grammarAccess.getDSGenDataType_ImplAccess().getDSGenDataTypeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDSGenDataType_Impl9436); 

                	newLeafNode(otherlv_1, grammarAccess.getDSGenDataType_ImplAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,96,FollowSets000.FOLLOW_96_in_ruleDSGenDataType_Impl9448); 

                	newLeafNode(otherlv_2, grammarAccess.getDSGenDataType_ImplAccess().getEcoreClassKeyword_2());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4559:1: ( ( ruleEString ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4560:1: ( ruleEString )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4560:1: ( ruleEString )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4561:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDSGenDataType_ImplRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDSGenDataType_ImplAccess().getEcoreClassEClassCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDSGenDataType_Impl9471);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,99,FollowSets000.FOLLOW_99_in_ruleDSGenDataType_Impl9483); 

                	newLeafNode(otherlv_4, grammarAccess.getDSGenDataType_ImplAccess().getDataTypeKeyword_4());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4578:1: ( ( ruleEString ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4579:1: ( ruleEString )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4579:1: ( ruleEString )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4580:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDSGenDataType_ImplRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDSGenDataType_ImplAccess().getDataTypeEDataTypeCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDSGenDataType_Impl9506);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4593:2: (otherlv_6= 'dsgenFeatures' otherlv_7= '{' ( (lv_dsgenFeatures_8_0= ruleDSGenFeature ) ) (otherlv_9= ',' ( (lv_dsgenFeatures_10_0= ruleDSGenFeature ) ) )* otherlv_11= '}' )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==97) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4593:4: otherlv_6= 'dsgenFeatures' otherlv_7= '{' ( (lv_dsgenFeatures_8_0= ruleDSGenFeature ) ) (otherlv_9= ',' ( (lv_dsgenFeatures_10_0= ruleDSGenFeature ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,97,FollowSets000.FOLLOW_97_in_ruleDSGenDataType_Impl9519); 

                        	newLeafNode(otherlv_6, grammarAccess.getDSGenDataType_ImplAccess().getDsgenFeaturesKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDSGenDataType_Impl9531); 

                        	newLeafNode(otherlv_7, grammarAccess.getDSGenDataType_ImplAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4601:1: ( (lv_dsgenFeatures_8_0= ruleDSGenFeature ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4602:1: (lv_dsgenFeatures_8_0= ruleDSGenFeature )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4602:1: (lv_dsgenFeatures_8_0= ruleDSGenFeature )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4603:3: lv_dsgenFeatures_8_0= ruleDSGenFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSGenDataType_ImplAccess().getDsgenFeaturesDSGenFeatureParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDSGenFeature_in_ruleDSGenDataType_Impl9552);
                    lv_dsgenFeatures_8_0=ruleDSGenFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSGenDataType_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"dsgenFeatures",
                            		lv_dsgenFeatures_8_0, 
                            		"DSGenFeature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4619:2: (otherlv_9= ',' ( (lv_dsgenFeatures_10_0= ruleDSGenFeature ) ) )*
                    loop144:
                    do {
                        int alt144=2;
                        int LA144_0 = input.LA(1);

                        if ( (LA144_0==16) ) {
                            alt144=1;
                        }


                        switch (alt144) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4619:4: otherlv_9= ',' ( (lv_dsgenFeatures_10_0= ruleDSGenFeature ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDSGenDataType_Impl9565); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getDSGenDataType_ImplAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4623:1: ( (lv_dsgenFeatures_10_0= ruleDSGenFeature ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4624:1: (lv_dsgenFeatures_10_0= ruleDSGenFeature )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4624:1: (lv_dsgenFeatures_10_0= ruleDSGenFeature )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4625:3: lv_dsgenFeatures_10_0= ruleDSGenFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDSGenDataType_ImplAccess().getDsgenFeaturesDSGenFeatureParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDSGenFeature_in_ruleDSGenDataType_Impl9586);
                    	    lv_dsgenFeatures_10_0=ruleDSGenFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDSGenDataType_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"dsgenFeatures",
                    	            		lv_dsgenFeatures_10_0, 
                    	            		"DSGenFeature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop144;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDSGenDataType_Impl9600); 

                        	newLeafNode(otherlv_11, grammarAccess.getDSGenDataType_ImplAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDSGenDataType_Impl9614); 

                	newLeafNode(otherlv_12, grammarAccess.getDSGenDataType_ImplAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleDSGenDataType_Impl"


    // $ANTLR start "entryRuleDSGenEnum"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4657:1: entryRuleDSGenEnum returns [EObject current=null] : iv_ruleDSGenEnum= ruleDSGenEnum EOF ;
    public final EObject entryRuleDSGenEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSGenEnum = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4658:2: (iv_ruleDSGenEnum= ruleDSGenEnum EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4659:2: iv_ruleDSGenEnum= ruleDSGenEnum EOF
            {
             newCompositeNode(grammarAccess.getDSGenEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDSGenEnum_in_entryRuleDSGenEnum9650);
            iv_ruleDSGenEnum=ruleDSGenEnum();

            state._fsp--;

             current =iv_ruleDSGenEnum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDSGenEnum9660); 

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
    // $ANTLR end "entryRuleDSGenEnum"


    // $ANTLR start "ruleDSGenEnum"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4666:1: ruleDSGenEnum returns [EObject current=null] : (otherlv_0= 'DSGenEnum' otherlv_1= '{' otherlv_2= 'ecoreClass' ( ( ruleEString ) ) otherlv_4= 'dataType' ( ( ruleEString ) ) otherlv_6= 'ecoreEnum' ( ( ruleEString ) ) (otherlv_8= 'dsgenFeatures' otherlv_9= '{' ( (lv_dsgenFeatures_10_0= ruleDSGenFeature ) ) (otherlv_11= ',' ( (lv_dsgenFeatures_12_0= ruleDSGenFeature ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleDSGenEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_dsgenFeatures_10_0 = null;

        EObject lv_dsgenFeatures_12_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4669:28: ( (otherlv_0= 'DSGenEnum' otherlv_1= '{' otherlv_2= 'ecoreClass' ( ( ruleEString ) ) otherlv_4= 'dataType' ( ( ruleEString ) ) otherlv_6= 'ecoreEnum' ( ( ruleEString ) ) (otherlv_8= 'dsgenFeatures' otherlv_9= '{' ( (lv_dsgenFeatures_10_0= ruleDSGenFeature ) ) (otherlv_11= ',' ( (lv_dsgenFeatures_12_0= ruleDSGenFeature ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4670:1: (otherlv_0= 'DSGenEnum' otherlv_1= '{' otherlv_2= 'ecoreClass' ( ( ruleEString ) ) otherlv_4= 'dataType' ( ( ruleEString ) ) otherlv_6= 'ecoreEnum' ( ( ruleEString ) ) (otherlv_8= 'dsgenFeatures' otherlv_9= '{' ( (lv_dsgenFeatures_10_0= ruleDSGenFeature ) ) (otherlv_11= ',' ( (lv_dsgenFeatures_12_0= ruleDSGenFeature ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4670:1: (otherlv_0= 'DSGenEnum' otherlv_1= '{' otherlv_2= 'ecoreClass' ( ( ruleEString ) ) otherlv_4= 'dataType' ( ( ruleEString ) ) otherlv_6= 'ecoreEnum' ( ( ruleEString ) ) (otherlv_8= 'dsgenFeatures' otherlv_9= '{' ( (lv_dsgenFeatures_10_0= ruleDSGenFeature ) ) (otherlv_11= ',' ( (lv_dsgenFeatures_12_0= ruleDSGenFeature ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4670:3: otherlv_0= 'DSGenEnum' otherlv_1= '{' otherlv_2= 'ecoreClass' ( ( ruleEString ) ) otherlv_4= 'dataType' ( ( ruleEString ) ) otherlv_6= 'ecoreEnum' ( ( ruleEString ) ) (otherlv_8= 'dsgenFeatures' otherlv_9= '{' ( (lv_dsgenFeatures_10_0= ruleDSGenFeature ) ) (otherlv_11= ',' ( (lv_dsgenFeatures_12_0= ruleDSGenFeature ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,100,FollowSets000.FOLLOW_100_in_ruleDSGenEnum9697); 

                	newLeafNode(otherlv_0, grammarAccess.getDSGenEnumAccess().getDSGenEnumKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDSGenEnum9709); 

                	newLeafNode(otherlv_1, grammarAccess.getDSGenEnumAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,96,FollowSets000.FOLLOW_96_in_ruleDSGenEnum9721); 

                	newLeafNode(otherlv_2, grammarAccess.getDSGenEnumAccess().getEcoreClassKeyword_2());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4682:1: ( ( ruleEString ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4683:1: ( ruleEString )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4683:1: ( ruleEString )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4684:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDSGenEnumRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDSGenEnumAccess().getEcoreClassEClassCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDSGenEnum9744);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,99,FollowSets000.FOLLOW_99_in_ruleDSGenEnum9756); 

                	newLeafNode(otherlv_4, grammarAccess.getDSGenEnumAccess().getDataTypeKeyword_4());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4701:1: ( ( ruleEString ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4702:1: ( ruleEString )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4702:1: ( ruleEString )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4703:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDSGenEnumRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDSGenEnumAccess().getDataTypeEDataTypeCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDSGenEnum9779);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,101,FollowSets000.FOLLOW_101_in_ruleDSGenEnum9791); 

                	newLeafNode(otherlv_6, grammarAccess.getDSGenEnumAccess().getEcoreEnumKeyword_6());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4720:1: ( ( ruleEString ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4721:1: ( ruleEString )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4721:1: ( ruleEString )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4722:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDSGenEnumRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDSGenEnumAccess().getEcoreEnumEEnumCrossReference_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDSGenEnum9814);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4735:2: (otherlv_8= 'dsgenFeatures' otherlv_9= '{' ( (lv_dsgenFeatures_10_0= ruleDSGenFeature ) ) (otherlv_11= ',' ( (lv_dsgenFeatures_12_0= ruleDSGenFeature ) ) )* otherlv_13= '}' )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==97) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4735:4: otherlv_8= 'dsgenFeatures' otherlv_9= '{' ( (lv_dsgenFeatures_10_0= ruleDSGenFeature ) ) (otherlv_11= ',' ( (lv_dsgenFeatures_12_0= ruleDSGenFeature ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,97,FollowSets000.FOLLOW_97_in_ruleDSGenEnum9827); 

                        	newLeafNode(otherlv_8, grammarAccess.getDSGenEnumAccess().getDsgenFeaturesKeyword_8_0());
                        
                    otherlv_9=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDSGenEnum9839); 

                        	newLeafNode(otherlv_9, grammarAccess.getDSGenEnumAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4743:1: ( (lv_dsgenFeatures_10_0= ruleDSGenFeature ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4744:1: (lv_dsgenFeatures_10_0= ruleDSGenFeature )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4744:1: (lv_dsgenFeatures_10_0= ruleDSGenFeature )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4745:3: lv_dsgenFeatures_10_0= ruleDSGenFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSGenEnumAccess().getDsgenFeaturesDSGenFeatureParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDSGenFeature_in_ruleDSGenEnum9860);
                    lv_dsgenFeatures_10_0=ruleDSGenFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSGenEnumRule());
                    	        }
                           		add(
                           			current, 
                           			"dsgenFeatures",
                            		lv_dsgenFeatures_10_0, 
                            		"DSGenFeature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4761:2: (otherlv_11= ',' ( (lv_dsgenFeatures_12_0= ruleDSGenFeature ) ) )*
                    loop146:
                    do {
                        int alt146=2;
                        int LA146_0 = input.LA(1);

                        if ( (LA146_0==16) ) {
                            alt146=1;
                        }


                        switch (alt146) {
                    	case 1 :
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4761:4: otherlv_11= ',' ( (lv_dsgenFeatures_12_0= ruleDSGenFeature ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDSGenEnum9873); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getDSGenEnumAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4765:1: ( (lv_dsgenFeatures_12_0= ruleDSGenFeature ) )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4766:1: (lv_dsgenFeatures_12_0= ruleDSGenFeature )
                    	    {
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4766:1: (lv_dsgenFeatures_12_0= ruleDSGenFeature )
                    	    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4767:3: lv_dsgenFeatures_12_0= ruleDSGenFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDSGenEnumAccess().getDsgenFeaturesDSGenFeatureParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDSGenFeature_in_ruleDSGenEnum9894);
                    	    lv_dsgenFeatures_12_0=ruleDSGenFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDSGenEnumRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"dsgenFeatures",
                    	            		lv_dsgenFeatures_12_0, 
                    	            		"DSGenFeature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop146;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDSGenEnum9908); 

                        	newLeafNode(otherlv_13, grammarAccess.getDSGenEnumAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDSGenEnum9922); 

                	newLeafNode(otherlv_14, grammarAccess.getDSGenEnumAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleDSGenEnum"


    // $ANTLR start "entryRuleDSGenAttribute"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4799:1: entryRuleDSGenAttribute returns [EObject current=null] : iv_ruleDSGenAttribute= ruleDSGenAttribute EOF ;
    public final EObject entryRuleDSGenAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSGenAttribute = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4800:2: (iv_ruleDSGenAttribute= ruleDSGenAttribute EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4801:2: iv_ruleDSGenAttribute= ruleDSGenAttribute EOF
            {
             newCompositeNode(grammarAccess.getDSGenAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDSGenAttribute_in_entryRuleDSGenAttribute9958);
            iv_ruleDSGenAttribute=ruleDSGenAttribute();

            state._fsp--;

             current =iv_ruleDSGenAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDSGenAttribute9968); 

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
    // $ANTLR end "entryRuleDSGenAttribute"


    // $ANTLR start "ruleDSGenAttribute"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4808:1: ruleDSGenAttribute returns [EObject current=null] : (otherlv_0= 'DSGenAttribute' otherlv_1= '{' otherlv_2= 'ecoreFeature' ( ( ruleEString ) ) (otherlv_4= 'generator' ( (lv_generator_5_0= ruleValueGenerator ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleDSGenAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_generator_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4811:28: ( (otherlv_0= 'DSGenAttribute' otherlv_1= '{' otherlv_2= 'ecoreFeature' ( ( ruleEString ) ) (otherlv_4= 'generator' ( (lv_generator_5_0= ruleValueGenerator ) ) )? otherlv_6= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4812:1: (otherlv_0= 'DSGenAttribute' otherlv_1= '{' otherlv_2= 'ecoreFeature' ( ( ruleEString ) ) (otherlv_4= 'generator' ( (lv_generator_5_0= ruleValueGenerator ) ) )? otherlv_6= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4812:1: (otherlv_0= 'DSGenAttribute' otherlv_1= '{' otherlv_2= 'ecoreFeature' ( ( ruleEString ) ) (otherlv_4= 'generator' ( (lv_generator_5_0= ruleValueGenerator ) ) )? otherlv_6= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4812:3: otherlv_0= 'DSGenAttribute' otherlv_1= '{' otherlv_2= 'ecoreFeature' ( ( ruleEString ) ) (otherlv_4= 'generator' ( (lv_generator_5_0= ruleValueGenerator ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,102,FollowSets000.FOLLOW_102_in_ruleDSGenAttribute10005); 

                	newLeafNode(otherlv_0, grammarAccess.getDSGenAttributeAccess().getDSGenAttributeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDSGenAttribute10017); 

                	newLeafNode(otherlv_1, grammarAccess.getDSGenAttributeAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleDSGenAttribute10029); 

                	newLeafNode(otherlv_2, grammarAccess.getDSGenAttributeAccess().getEcoreFeatureKeyword_2());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4824:1: ( ( ruleEString ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4825:1: ( ruleEString )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4825:1: ( ruleEString )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4826:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDSGenAttributeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDSGenAttributeAccess().getEcoreFeatureEStructuralFeatureCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDSGenAttribute10052);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4839:2: (otherlv_4= 'generator' ( (lv_generator_5_0= ruleValueGenerator ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==94) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4839:4: otherlv_4= 'generator' ( (lv_generator_5_0= ruleValueGenerator ) )
                    {
                    otherlv_4=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleDSGenAttribute10065); 

                        	newLeafNode(otherlv_4, grammarAccess.getDSGenAttributeAccess().getGeneratorKeyword_4_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4843:1: ( (lv_generator_5_0= ruleValueGenerator ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4844:1: (lv_generator_5_0= ruleValueGenerator )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4844:1: (lv_generator_5_0= ruleValueGenerator )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4845:3: lv_generator_5_0= ruleValueGenerator
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSGenAttributeAccess().getGeneratorValueGeneratorParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleValueGenerator_in_ruleDSGenAttribute10086);
                    lv_generator_5_0=ruleValueGenerator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSGenAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"generator",
                            		lv_generator_5_0, 
                            		"ValueGenerator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDSGenAttribute10100); 

                	newLeafNode(otherlv_6, grammarAccess.getDSGenAttributeAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleDSGenAttribute"


    // $ANTLR start "entryRuleDSGenReference"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4873:1: entryRuleDSGenReference returns [EObject current=null] : iv_ruleDSGenReference= ruleDSGenReference EOF ;
    public final EObject entryRuleDSGenReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSGenReference = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4874:2: (iv_ruleDSGenReference= ruleDSGenReference EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4875:2: iv_ruleDSGenReference= ruleDSGenReference EOF
            {
             newCompositeNode(grammarAccess.getDSGenReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDSGenReference_in_entryRuleDSGenReference10136);
            iv_ruleDSGenReference=ruleDSGenReference();

            state._fsp--;

             current =iv_ruleDSGenReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDSGenReference10146); 

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
    // $ANTLR end "entryRuleDSGenReference"


    // $ANTLR start "ruleDSGenReference"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4882:1: ruleDSGenReference returns [EObject current=null] : (otherlv_0= 'DSGenReference' otherlv_1= '{' otherlv_2= 'ecoreFeature' ( ( ruleEString ) ) (otherlv_4= 'targetDSGenClass' ( ( ruleEString ) ) )? (otherlv_6= 'generator' ( (lv_generator_7_0= ruleValueGenerator ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleDSGenReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_generator_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4885:28: ( (otherlv_0= 'DSGenReference' otherlv_1= '{' otherlv_2= 'ecoreFeature' ( ( ruleEString ) ) (otherlv_4= 'targetDSGenClass' ( ( ruleEString ) ) )? (otherlv_6= 'generator' ( (lv_generator_7_0= ruleValueGenerator ) ) )? otherlv_8= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4886:1: (otherlv_0= 'DSGenReference' otherlv_1= '{' otherlv_2= 'ecoreFeature' ( ( ruleEString ) ) (otherlv_4= 'targetDSGenClass' ( ( ruleEString ) ) )? (otherlv_6= 'generator' ( (lv_generator_7_0= ruleValueGenerator ) ) )? otherlv_8= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4886:1: (otherlv_0= 'DSGenReference' otherlv_1= '{' otherlv_2= 'ecoreFeature' ( ( ruleEString ) ) (otherlv_4= 'targetDSGenClass' ( ( ruleEString ) ) )? (otherlv_6= 'generator' ( (lv_generator_7_0= ruleValueGenerator ) ) )? otherlv_8= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4886:3: otherlv_0= 'DSGenReference' otherlv_1= '{' otherlv_2= 'ecoreFeature' ( ( ruleEString ) ) (otherlv_4= 'targetDSGenClass' ( ( ruleEString ) ) )? (otherlv_6= 'generator' ( (lv_generator_7_0= ruleValueGenerator ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,103,FollowSets000.FOLLOW_103_in_ruleDSGenReference10183); 

                	newLeafNode(otherlv_0, grammarAccess.getDSGenReferenceAccess().getDSGenReferenceKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDSGenReference10195); 

                	newLeafNode(otherlv_1, grammarAccess.getDSGenReferenceAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleDSGenReference10207); 

                	newLeafNode(otherlv_2, grammarAccess.getDSGenReferenceAccess().getEcoreFeatureKeyword_2());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4898:1: ( ( ruleEString ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4899:1: ( ruleEString )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4899:1: ( ruleEString )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4900:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDSGenReferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDSGenReferenceAccess().getEcoreFeatureEStructuralFeatureCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDSGenReference10230);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4913:2: (otherlv_4= 'targetDSGenClass' ( ( ruleEString ) ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==104) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4913:4: otherlv_4= 'targetDSGenClass' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,104,FollowSets000.FOLLOW_104_in_ruleDSGenReference10243); 

                        	newLeafNode(otherlv_4, grammarAccess.getDSGenReferenceAccess().getTargetDSGenClassKeyword_4_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4917:1: ( ( ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4918:1: ( ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4918:1: ( ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4919:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDSGenReferenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getDSGenReferenceAccess().getTargetDSGenClassDSGenClassCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDSGenReference10266);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4932:4: (otherlv_6= 'generator' ( (lv_generator_7_0= ruleValueGenerator ) ) )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==94) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4932:6: otherlv_6= 'generator' ( (lv_generator_7_0= ruleValueGenerator ) )
                    {
                    otherlv_6=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleDSGenReference10281); 

                        	newLeafNode(otherlv_6, grammarAccess.getDSGenReferenceAccess().getGeneratorKeyword_5_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4936:1: ( (lv_generator_7_0= ruleValueGenerator ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4937:1: (lv_generator_7_0= ruleValueGenerator )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4937:1: (lv_generator_7_0= ruleValueGenerator )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4938:3: lv_generator_7_0= ruleValueGenerator
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSGenReferenceAccess().getGeneratorValueGeneratorParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleValueGenerator_in_ruleDSGenReference10302);
                    lv_generator_7_0=ruleValueGenerator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSGenReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"generator",
                            		lv_generator_7_0, 
                            		"ValueGenerator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDSGenReference10316); 

                	newLeafNode(otherlv_8, grammarAccess.getDSGenReferenceAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleDSGenReference"


    // $ANTLR start "entryRuleLocale"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4966:1: entryRuleLocale returns [String current=null] : iv_ruleLocale= ruleLocale EOF ;
    public final String entryRuleLocale() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLocale = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4967:2: (iv_ruleLocale= ruleLocale EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4968:2: iv_ruleLocale= ruleLocale EOF
            {
             newCompositeNode(grammarAccess.getLocaleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocale_in_entryRuleLocale10353);
            iv_ruleLocale=ruleLocale();

            state._fsp--;

             current =iv_ruleLocale.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocale10364); 

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
    // $ANTLR end "entryRuleLocale"


    // $ANTLR start "ruleLocale"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4975:1: ruleLocale returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Locale' ;
    public final AntlrDatatypeRuleToken ruleLocale() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4978:28: (kw= 'Locale' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4980:2: kw= 'Locale'
            {
            kw=(Token)match(input,105,FollowSets000.FOLLOW_105_in_ruleLocale10401); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLocaleAccess().getLocaleKeyword()); 
                

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
    // $ANTLR end "ruleLocale"


    // $ANTLR start "entryRuleReferenceGenerator"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4993:1: entryRuleReferenceGenerator returns [EObject current=null] : iv_ruleReferenceGenerator= ruleReferenceGenerator EOF ;
    public final EObject entryRuleReferenceGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceGenerator = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4994:2: (iv_ruleReferenceGenerator= ruleReferenceGenerator EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:4995:2: iv_ruleReferenceGenerator= ruleReferenceGenerator EOF
            {
             newCompositeNode(grammarAccess.getReferenceGeneratorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReferenceGenerator_in_entryRuleReferenceGenerator10440);
            iv_ruleReferenceGenerator=ruleReferenceGenerator();

            state._fsp--;

             current =iv_ruleReferenceGenerator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReferenceGenerator10450); 

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
    // $ANTLR end "entryRuleReferenceGenerator"


    // $ANTLR start "ruleReferenceGenerator"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5002:1: ruleReferenceGenerator returns [EObject current=null] : ( () otherlv_1= 'ReferenceGenerator' otherlv_2= '{' (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )? (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )? (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )? (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )? (otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) ) )? (otherlv_13= 'badValueGenerator' ( ( ruleEString ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleReferenceGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_badValueProportion_4_0 = null;

        AntlrDatatypeRuleToken lv_randomSeed_6_0 = null;

        AntlrDatatypeRuleToken lv_ID_8_0 = null;

        AntlrDatatypeRuleToken lv_locale_10_0 = null;

        AntlrDatatypeRuleToken lv_step_12_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5005:28: ( ( () otherlv_1= 'ReferenceGenerator' otherlv_2= '{' (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )? (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )? (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )? (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )? (otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) ) )? (otherlv_13= 'badValueGenerator' ( ( ruleEString ) ) )? otherlv_15= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5006:1: ( () otherlv_1= 'ReferenceGenerator' otherlv_2= '{' (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )? (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )? (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )? (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )? (otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) ) )? (otherlv_13= 'badValueGenerator' ( ( ruleEString ) ) )? otherlv_15= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5006:1: ( () otherlv_1= 'ReferenceGenerator' otherlv_2= '{' (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )? (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )? (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )? (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )? (otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) ) )? (otherlv_13= 'badValueGenerator' ( ( ruleEString ) ) )? otherlv_15= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5006:2: () otherlv_1= 'ReferenceGenerator' otherlv_2= '{' (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )? (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )? (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )? (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )? (otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) ) )? (otherlv_13= 'badValueGenerator' ( ( ruleEString ) ) )? otherlv_15= '}'
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5006:2: ()
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5007:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReferenceGeneratorAccess().getReferenceGeneratorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,106,FollowSets000.FOLLOW_106_in_ruleReferenceGenerator10496); 

                	newLeafNode(otherlv_1, grammarAccess.getReferenceGeneratorAccess().getReferenceGeneratorKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleReferenceGenerator10508); 

                	newLeafNode(otherlv_2, grammarAccess.getReferenceGeneratorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5020:1: (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==107) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5020:3: otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,107,FollowSets000.FOLLOW_107_in_ruleReferenceGenerator10521); 

                        	newLeafNode(otherlv_3, grammarAccess.getReferenceGeneratorAccess().getBadValueProportionKeyword_3_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5024:1: ( (lv_badValueProportion_4_0= ruleEInt ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5025:1: (lv_badValueProportion_4_0= ruleEInt )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5025:1: (lv_badValueProportion_4_0= ruleEInt )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5026:3: lv_badValueProportion_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferenceGeneratorAccess().getBadValueProportionEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleReferenceGenerator10542);
                    lv_badValueProportion_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReferenceGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"badValueProportion",
                            		lv_badValueProportion_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5042:4: (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==13) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5042:6: otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) )
                    {
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleReferenceGenerator10557); 

                        	newLeafNode(otherlv_5, grammarAccess.getReferenceGeneratorAccess().getRandomSeedKeyword_4_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5046:1: ( (lv_randomSeed_6_0= ruleELong ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5047:1: (lv_randomSeed_6_0= ruleELong )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5047:1: (lv_randomSeed_6_0= ruleELong )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5048:3: lv_randomSeed_6_0= ruleELong
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferenceGeneratorAccess().getRandomSeedELongParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleELong_in_ruleReferenceGenerator10578);
                    lv_randomSeed_6_0=ruleELong();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReferenceGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"randomSeed",
                            		lv_randomSeed_6_0, 
                            		"ELong");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5064:4: (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==108) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5064:6: otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,108,FollowSets000.FOLLOW_108_in_ruleReferenceGenerator10593); 

                        	newLeafNode(otherlv_7, grammarAccess.getReferenceGeneratorAccess().getIDKeyword_5_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5068:1: ( (lv_ID_8_0= ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5069:1: (lv_ID_8_0= ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5069:1: (lv_ID_8_0= ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5070:3: lv_ID_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferenceGeneratorAccess().getIDEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReferenceGenerator10614);
                    lv_ID_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReferenceGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"ID",
                            		lv_ID_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5086:4: (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==109) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5086:6: otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) )
                    {
                    otherlv_9=(Token)match(input,109,FollowSets000.FOLLOW_109_in_ruleReferenceGenerator10629); 

                        	newLeafNode(otherlv_9, grammarAccess.getReferenceGeneratorAccess().getLocaleKeyword_6_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5090:1: ( (lv_locale_10_0= ruleLocale ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5091:1: (lv_locale_10_0= ruleLocale )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5091:1: (lv_locale_10_0= ruleLocale )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5092:3: lv_locale_10_0= ruleLocale
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferenceGeneratorAccess().getLocaleLocaleParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLocale_in_ruleReferenceGenerator10650);
                    lv_locale_10_0=ruleLocale();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReferenceGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"locale",
                            		lv_locale_10_0, 
                            		"Locale");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5108:4: (otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) ) )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==110) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5108:6: otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) )
                    {
                    otherlv_11=(Token)match(input,110,FollowSets000.FOLLOW_110_in_ruleReferenceGenerator10665); 

                        	newLeafNode(otherlv_11, grammarAccess.getReferenceGeneratorAccess().getStepKeyword_7_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5112:1: ( (lv_step_12_0= ruleEInt ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5113:1: (lv_step_12_0= ruleEInt )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5113:1: (lv_step_12_0= ruleEInt )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5114:3: lv_step_12_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferenceGeneratorAccess().getStepEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleReferenceGenerator10686);
                    lv_step_12_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReferenceGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"step",
                            		lv_step_12_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5130:4: (otherlv_13= 'badValueGenerator' ( ( ruleEString ) ) )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==111) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5130:6: otherlv_13= 'badValueGenerator' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,111,FollowSets000.FOLLOW_111_in_ruleReferenceGenerator10701); 

                        	newLeafNode(otherlv_13, grammarAccess.getReferenceGeneratorAccess().getBadValueGeneratorKeyword_8_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5134:1: ( ( ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5135:1: ( ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5135:1: ( ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5136:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getReferenceGeneratorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getReferenceGeneratorAccess().getBadValueGeneratorValueGeneratorCrossReference_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReferenceGenerator10724);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleReferenceGenerator10738); 

                	newLeafNode(otherlv_15, grammarAccess.getReferenceGeneratorAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleReferenceGenerator"


    // $ANTLR start "entryRuleEObjectGenerator"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5163:1: entryRuleEObjectGenerator returns [EObject current=null] : iv_ruleEObjectGenerator= ruleEObjectGenerator EOF ;
    public final EObject entryRuleEObjectGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObjectGenerator = null;


        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5164:2: (iv_ruleEObjectGenerator= ruleEObjectGenerator EOF )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5165:2: iv_ruleEObjectGenerator= ruleEObjectGenerator EOF
            {
             newCompositeNode(grammarAccess.getEObjectGeneratorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEObjectGenerator_in_entryRuleEObjectGenerator10776);
            iv_ruleEObjectGenerator=ruleEObjectGenerator();

            state._fsp--;

             current =iv_ruleEObjectGenerator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEObjectGenerator10786); 

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
    // $ANTLR end "entryRuleEObjectGenerator"


    // $ANTLR start "ruleEObjectGenerator"
    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5172:1: ruleEObjectGenerator returns [EObject current=null] : ( () otherlv_1= 'EObjectGenerator' otherlv_2= '{' (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )? (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )? (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )? (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )? (otherlv_11= 'badValueGenerator' ( ( ruleEString ) ) )? (otherlv_13= 'targetDSGenClass' ( ( ruleEString ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleEObjectGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_badValueProportion_4_0 = null;

        AntlrDatatypeRuleToken lv_randomSeed_6_0 = null;

        AntlrDatatypeRuleToken lv_ID_8_0 = null;

        AntlrDatatypeRuleToken lv_locale_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5175:28: ( ( () otherlv_1= 'EObjectGenerator' otherlv_2= '{' (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )? (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )? (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )? (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )? (otherlv_11= 'badValueGenerator' ( ( ruleEString ) ) )? (otherlv_13= 'targetDSGenClass' ( ( ruleEString ) ) )? otherlv_15= '}' ) )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5176:1: ( () otherlv_1= 'EObjectGenerator' otherlv_2= '{' (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )? (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )? (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )? (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )? (otherlv_11= 'badValueGenerator' ( ( ruleEString ) ) )? (otherlv_13= 'targetDSGenClass' ( ( ruleEString ) ) )? otherlv_15= '}' )
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5176:1: ( () otherlv_1= 'EObjectGenerator' otherlv_2= '{' (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )? (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )? (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )? (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )? (otherlv_11= 'badValueGenerator' ( ( ruleEString ) ) )? (otherlv_13= 'targetDSGenClass' ( ( ruleEString ) ) )? otherlv_15= '}' )
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5176:2: () otherlv_1= 'EObjectGenerator' otherlv_2= '{' (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )? (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )? (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )? (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )? (otherlv_11= 'badValueGenerator' ( ( ruleEString ) ) )? (otherlv_13= 'targetDSGenClass' ( ( ruleEString ) ) )? otherlv_15= '}'
            {
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5176:2: ()
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5177:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEObjectGeneratorAccess().getEObjectGeneratorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,112,FollowSets000.FOLLOW_112_in_ruleEObjectGenerator10832); 

                	newLeafNode(otherlv_1, grammarAccess.getEObjectGeneratorAccess().getEObjectGeneratorKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEObjectGenerator10844); 

                	newLeafNode(otherlv_2, grammarAccess.getEObjectGeneratorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5190:1: (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==107) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5190:3: otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,107,FollowSets000.FOLLOW_107_in_ruleEObjectGenerator10857); 

                        	newLeafNode(otherlv_3, grammarAccess.getEObjectGeneratorAccess().getBadValueProportionKeyword_3_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5194:1: ( (lv_badValueProportion_4_0= ruleEInt ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5195:1: (lv_badValueProportion_4_0= ruleEInt )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5195:1: (lv_badValueProportion_4_0= ruleEInt )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5196:3: lv_badValueProportion_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEObjectGeneratorAccess().getBadValueProportionEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEObjectGenerator10878);
                    lv_badValueProportion_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEObjectGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"badValueProportion",
                            		lv_badValueProportion_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5212:4: (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==13) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5212:6: otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) )
                    {
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEObjectGenerator10893); 

                        	newLeafNode(otherlv_5, grammarAccess.getEObjectGeneratorAccess().getRandomSeedKeyword_4_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5216:1: ( (lv_randomSeed_6_0= ruleELong ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5217:1: (lv_randomSeed_6_0= ruleELong )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5217:1: (lv_randomSeed_6_0= ruleELong )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5218:3: lv_randomSeed_6_0= ruleELong
                    {
                     
                    	        newCompositeNode(grammarAccess.getEObjectGeneratorAccess().getRandomSeedELongParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleELong_in_ruleEObjectGenerator10914);
                    lv_randomSeed_6_0=ruleELong();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEObjectGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"randomSeed",
                            		lv_randomSeed_6_0, 
                            		"ELong");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5234:4: (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==108) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5234:6: otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,108,FollowSets000.FOLLOW_108_in_ruleEObjectGenerator10929); 

                        	newLeafNode(otherlv_7, grammarAccess.getEObjectGeneratorAccess().getIDKeyword_5_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5238:1: ( (lv_ID_8_0= ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5239:1: (lv_ID_8_0= ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5239:1: (lv_ID_8_0= ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5240:3: lv_ID_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEObjectGeneratorAccess().getIDEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEObjectGenerator10950);
                    lv_ID_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEObjectGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"ID",
                            		lv_ID_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5256:4: (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==109) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5256:6: otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) )
                    {
                    otherlv_9=(Token)match(input,109,FollowSets000.FOLLOW_109_in_ruleEObjectGenerator10965); 

                        	newLeafNode(otherlv_9, grammarAccess.getEObjectGeneratorAccess().getLocaleKeyword_6_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5260:1: ( (lv_locale_10_0= ruleLocale ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5261:1: (lv_locale_10_0= ruleLocale )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5261:1: (lv_locale_10_0= ruleLocale )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5262:3: lv_locale_10_0= ruleLocale
                    {
                     
                    	        newCompositeNode(grammarAccess.getEObjectGeneratorAccess().getLocaleLocaleParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLocale_in_ruleEObjectGenerator10986);
                    lv_locale_10_0=ruleLocale();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEObjectGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"locale",
                            		lv_locale_10_0, 
                            		"Locale");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5278:4: (otherlv_11= 'badValueGenerator' ( ( ruleEString ) ) )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==111) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5278:6: otherlv_11= 'badValueGenerator' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,111,FollowSets000.FOLLOW_111_in_ruleEObjectGenerator11001); 

                        	newLeafNode(otherlv_11, grammarAccess.getEObjectGeneratorAccess().getBadValueGeneratorKeyword_7_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5282:1: ( ( ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5283:1: ( ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5283:1: ( ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5284:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEObjectGeneratorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEObjectGeneratorAccess().getBadValueGeneratorValueGeneratorCrossReference_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEObjectGenerator11024);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5297:4: (otherlv_13= 'targetDSGenClass' ( ( ruleEString ) ) )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==104) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5297:6: otherlv_13= 'targetDSGenClass' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,104,FollowSets000.FOLLOW_104_in_ruleEObjectGenerator11039); 

                        	newLeafNode(otherlv_13, grammarAccess.getEObjectGeneratorAccess().getTargetDSGenClassKeyword_8_0());
                        
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5301:1: ( ( ruleEString ) )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5302:1: ( ruleEString )
                    {
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5302:1: ( ruleEString )
                    // ../com.opcoach.dsgen.xtext/src-gen/com/opcoach/dsgen/xtext/parser/antlr/internal/InternalDSGenDSL.g:5303:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEObjectGeneratorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEObjectGeneratorAccess().getTargetDSGenClassDSGenClassCrossReference_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEObjectGenerator11062);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEObjectGenerator11076); 

                	newLeafNode(otherlv_15, grammarAccess.getEObjectGeneratorAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleEObjectGenerator"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleDSGenModel_in_entryRuleDSGenModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDSGenModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleDSGenModel122 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDSGenModel143 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDSGenModel155 = new BitSet(new long[]{0x000000000004E000L});
        public static final BitSet FOLLOW_13_in_ruleDSGenModel168 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleELong_in_ruleDSGenModel189 = new BitSet(new long[]{0x000000000004C000L});
        public static final BitSet FOLLOW_14_in_ruleDSGenModel204 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDSGenModel225 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_15_in_ruleDSGenModel240 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDSGenModel252 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleDSGenPackage_in_ruleDSGenModel273 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleDSGenModel286 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleDSGenPackage_in_ruleDSGenModel307 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleDSGenModel321 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleDSGenModel335 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleBadValueGeneratorRegistry_in_ruleDSGenModel356 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDSGenModel368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDSGenClassifier_in_entryRuleDSGenClassifier404 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDSGenClassifier414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDSGenClass_in_ruleDSGenClassifier461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDSGenDataType_Impl_in_ruleDSGenClassifier488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDSGenEnum_in_ruleDSGenClassifier515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueGenerator_in_entryRuleValueGenerator550 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValueGenerator560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferenceGenerator_in_ruleValueGenerator606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEClassifier_in_entryRuleEClassifier640 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEClassifier650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEClass_in_ruleEClassifier697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDataType_Impl_in_ruleEClassifier724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEEnum_in_ruleEClassifier751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEStructuralFeature_in_entryRuleEStructuralFeature786 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEStructuralFeature796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAttribute_in_ruleEStructuralFeature843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEReference_in_ruleEStructuralFeature870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDSGenFeature_in_entryRuleDSGenFeature905 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDSGenFeature915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDSGenFeature_Impl_in_ruleDSGenFeature962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDSGenAttribute_in_ruleDSGenFeature989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDSGenReference_in_ruleDSGenFeature1016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDSGenPackage_in_entryRuleDSGenPackage1053 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDSGenPackage1063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleDSGenPackage1100 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDSGenPackage1112 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleDSGenPackage1124 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDSGenPackage1147 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_21_in_ruleDSGenPackage1160 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDSGenPackage1172 = new BitSet(new long[]{0x0000000000000000L,0x0000001480000000L});
        public static final BitSet FOLLOW_ruleDSGenClassifier_in_ruleDSGenPackage1193 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleDSGenPackage1206 = new BitSet(new long[]{0x0000000000000000L,0x0000001480000000L});
        public static final BitSet FOLLOW_ruleDSGenClassifier_in_ruleDSGenPackage1227 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleDSGenPackage1241 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDSGenPackage1255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleELong_in_entryRuleELong1292 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleELong1303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleELong1342 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleELong1359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1405 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBadValueGeneratorRegistry_in_entryRuleBadValueGeneratorRegistry1527 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBadValueGeneratorRegistry1537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleBadValueGeneratorRegistry1583 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBadValueGeneratorRegistry1595 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_24_in_ruleBadValueGeneratorRegistry1608 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBadValueGeneratorRegistry1620 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
        public static final BitSet FOLLOW_ruleValueGenerator_in_ruleBadValueGeneratorRegistry1641 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleBadValueGeneratorRegistry1654 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
        public static final BitSet FOLLOW_ruleValueGenerator_in_ruleBadValueGeneratorRegistry1675 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleBadValueGeneratorRegistry1689 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleBadValueGeneratorRegistry1703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEPackage_in_entryRuleEPackage1739 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEPackage1749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEPackage1795 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEPackage1816 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEPackage1828 = new BitSet(new long[]{0x000000007C020000L});
        public static final BitSet FOLLOW_26_in_ruleEPackage1841 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEPackage1862 = new BitSet(new long[]{0x0000000078020000L});
        public static final BitSet FOLLOW_27_in_ruleEPackage1877 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEPackage1898 = new BitSet(new long[]{0x0000000070020000L});
        public static final BitSet FOLLOW_28_in_ruleEPackage1913 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEPackage1925 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEPackage1946 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEPackage1959 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEPackage1980 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEPackage1994 = new BitSet(new long[]{0x0000000060020000L});
        public static final BitSet FOLLOW_29_in_ruleEPackage2009 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEPackage2021 = new BitSet(new long[]{0x0140700000000000L});
        public static final BitSet FOLLOW_ruleEClassifier_in_ruleEPackage2042 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEPackage2055 = new BitSet(new long[]{0x0140700000000000L});
        public static final BitSet FOLLOW_ruleEClassifier_in_ruleEPackage2076 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEPackage2090 = new BitSet(new long[]{0x0000000040020000L});
        public static final BitSet FOLLOW_30_in_ruleEPackage2105 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEPackage2117 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleEPackage_in_ruleEPackage2138 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEPackage2151 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleEPackage_in_ruleEPackage2172 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEPackage2186 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEPackage2200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_entryRuleEAnnotation2236 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEAnnotation2246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleEAnnotation2292 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEAnnotation2304 = new BitSet(new long[]{0x0000003310020000L});
        public static final BitSet FOLLOW_32_in_ruleEAnnotation2317 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEAnnotation2338 = new BitSet(new long[]{0x0000003210020000L});
        public static final BitSet FOLLOW_33_in_ruleEAnnotation2353 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleEAnnotation2365 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEAnnotation2388 = new BitSet(new long[]{0x0000000800010000L});
        public static final BitSet FOLLOW_16_in_ruleEAnnotation2401 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEAnnotation2424 = new BitSet(new long[]{0x0000000800010000L});
        public static final BitSet FOLLOW_35_in_ruleEAnnotation2438 = new BitSet(new long[]{0x0000003010020000L});
        public static final BitSet FOLLOW_28_in_ruleEAnnotation2453 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEAnnotation2465 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEAnnotation2486 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEAnnotation2499 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEAnnotation2520 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEAnnotation2534 = new BitSet(new long[]{0x0000003000020000L});
        public static final BitSet FOLLOW_36_in_ruleEAnnotation2549 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEAnnotation2561 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleEStringToStringMapEntry_in_ruleEAnnotation2582 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEAnnotation2595 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleEStringToStringMapEntry_in_ruleEAnnotation2616 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEAnnotation2630 = new BitSet(new long[]{0x0000002000020000L});
        public static final BitSet FOLLOW_37_in_ruleEAnnotation2645 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEAnnotation2657 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleEObject_in_ruleEAnnotation2678 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEAnnotation2691 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleEObject_in_ruleEAnnotation2712 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEAnnotation2726 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEAnnotation2740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEStringToStringMapEntry_in_entryRuleEStringToStringMapEntry2776 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEStringToStringMapEntry2786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleEStringToStringMapEntry2832 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEStringToStringMapEntry2844 = new BitSet(new long[]{0x0000018000020000L});
        public static final BitSet FOLLOW_39_in_ruleEStringToStringMapEntry2857 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEStringToStringMapEntry2878 = new BitSet(new long[]{0x0000010000020000L});
        public static final BitSet FOLLOW_40_in_ruleEStringToStringMapEntry2893 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEStringToStringMapEntry2914 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEStringToStringMapEntry2928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEObject_in_entryRuleEObject2964 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEObject2974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleEObject3020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_entryRuleETypeParameter3056 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleETypeParameter3066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleETypeParameter3112 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleETypeParameter3133 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleETypeParameter3145 = new BitSet(new long[]{0x0000080010020000L});
        public static final BitSet FOLLOW_28_in_ruleETypeParameter3158 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleETypeParameter3170 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleETypeParameter3191 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleETypeParameter3204 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleETypeParameter3225 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleETypeParameter3239 = new BitSet(new long[]{0x0000080000020000L});
        public static final BitSet FOLLOW_43_in_ruleETypeParameter3254 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleETypeParameter3266 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleETypeParameter3287 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleETypeParameter3300 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleETypeParameter3321 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleETypeParameter3335 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleETypeParameter3349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEClass_in_entryRuleEClass3385 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEClass3395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleEClass3447 = new BitSet(new long[]{0x0000600000000000L});
        public static final BitSet FOLLOW_45_in_ruleEClass3479 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleEClass3505 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEClass3526 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEClass3538 = new BitSet(new long[]{0x003F800010020000L});
        public static final BitSet FOLLOW_47_in_ruleEClass3551 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEClass3572 = new BitSet(new long[]{0x003F000010020000L});
        public static final BitSet FOLLOW_48_in_ruleEClass3587 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEClass3608 = new BitSet(new long[]{0x003E000010020000L});
        public static final BitSet FOLLOW_49_in_ruleEClass3623 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleEClass3635 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEClass3658 = new BitSet(new long[]{0x0000000800010000L});
        public static final BitSet FOLLOW_16_in_ruleEClass3671 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEClass3694 = new BitSet(new long[]{0x0000000800010000L});
        public static final BitSet FOLLOW_35_in_ruleEClass3708 = new BitSet(new long[]{0x003C000010020000L});
        public static final BitSet FOLLOW_28_in_ruleEClass3723 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEClass3735 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEClass3756 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEClass3769 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEClass3790 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEClass3804 = new BitSet(new long[]{0x003C000000020000L});
        public static final BitSet FOLLOW_50_in_ruleEClass3819 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEClass3831 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEClass3852 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEClass3865 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEClass3886 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEClass3900 = new BitSet(new long[]{0x0038000000020000L});
        public static final BitSet FOLLOW_51_in_ruleEClass3915 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEClass3927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleEOperation_in_ruleEClass3948 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEClass3961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleEOperation_in_ruleEClass3982 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEClass3996 = new BitSet(new long[]{0x0030000000020000L});
        public static final BitSet FOLLOW_52_in_ruleEClass4011 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEClass4023 = new BitSet(new long[]{0x0000000000000000L,0x000000000067E000L});
        public static final BitSet FOLLOW_ruleEStructuralFeature_in_ruleEClass4044 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEClass4057 = new BitSet(new long[]{0x0000000000000000L,0x000000000067E000L});
        public static final BitSet FOLLOW_ruleEStructuralFeature_in_ruleEClass4078 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEClass4092 = new BitSet(new long[]{0x0020000000020000L});
        public static final BitSet FOLLOW_53_in_ruleEClass4107 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEClass4119 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEClass4140 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEClass4153 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEClass4174 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEClass4188 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEClass4202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDataType_Impl_in_entryRuleEDataType_Impl4238 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDataType_Impl4248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleEDataType_Impl4294 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEDataType_Impl4315 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDataType_Impl4327 = new BitSet(new long[]{0x0085800010020000L});
        public static final BitSet FOLLOW_47_in_ruleEDataType_Impl4340 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEDataType_Impl4361 = new BitSet(new long[]{0x0085000010020000L});
        public static final BitSet FOLLOW_48_in_ruleEDataType_Impl4376 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEDataType_Impl4397 = new BitSet(new long[]{0x0084000010020000L});
        public static final BitSet FOLLOW_55_in_ruleEDataType_Impl4412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEDataType_Impl4433 = new BitSet(new long[]{0x0004000010020000L});
        public static final BitSet FOLLOW_28_in_ruleEDataType_Impl4448 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDataType_Impl4460 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEDataType_Impl4481 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEDataType_Impl4494 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEDataType_Impl4515 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEDataType_Impl4529 = new BitSet(new long[]{0x0004000000020000L});
        public static final BitSet FOLLOW_50_in_ruleEDataType_Impl4544 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDataType_Impl4556 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEDataType_Impl4577 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEDataType_Impl4590 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEDataType_Impl4611 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEDataType_Impl4625 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEDataType_Impl4639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEEnum_in_entryRuleEEnum4675 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEEnum4685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleEEnum4731 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEEnum4752 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEEnum4764 = new BitSet(new long[]{0x0285800010020000L});
        public static final BitSet FOLLOW_47_in_ruleEEnum4777 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEEnum4798 = new BitSet(new long[]{0x0285000010020000L});
        public static final BitSet FOLLOW_48_in_ruleEEnum4813 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEEnum4834 = new BitSet(new long[]{0x0284000010020000L});
        public static final BitSet FOLLOW_55_in_ruleEEnum4849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEEnum4870 = new BitSet(new long[]{0x0204000010020000L});
        public static final BitSet FOLLOW_28_in_ruleEEnum4885 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEEnum4897 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEEnum4918 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEEnum4931 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEEnum4952 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEEnum4966 = new BitSet(new long[]{0x0204000000020000L});
        public static final BitSet FOLLOW_50_in_ruleEEnum4981 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEEnum4993 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEEnum5014 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEEnum5027 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEEnum5048 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEEnum5062 = new BitSet(new long[]{0x0200000000020000L});
        public static final BitSet FOLLOW_57_in_ruleEEnum5077 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEEnum5089 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
        public static final BitSet FOLLOW_ruleEEnumLiteral_in_ruleEEnum5110 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEEnum5123 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
        public static final BitSet FOLLOW_ruleEEnumLiteral_in_ruleEEnum5144 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEEnum5158 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEEnum5172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEGenericType_in_entryRuleEGenericType5208 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEGenericType5218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleEGenericType5264 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEGenericType5276 = new BitSet(new long[]{0xF800000000020000L});
        public static final BitSet FOLLOW_59_in_ruleEGenericType5289 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEGenericType5312 = new BitSet(new long[]{0xF000000000020000L});
        public static final BitSet FOLLOW_60_in_ruleEGenericType5327 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEGenericType5350 = new BitSet(new long[]{0xE000000000020000L});
        public static final BitSet FOLLOW_61_in_ruleEGenericType5365 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEGenericType5386 = new BitSet(new long[]{0xC000000000020000L});
        public static final BitSet FOLLOW_62_in_ruleEGenericType5401 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEGenericType5413 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEGenericType5434 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEGenericType5447 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEGenericType5468 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEGenericType5482 = new BitSet(new long[]{0x8000000000020000L});
        public static final BitSet FOLLOW_63_in_ruleEGenericType5497 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEGenericType5518 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEGenericType5532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean5569 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean5580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleEBoolean5618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleEBoolean5637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEOperation_in_entryRuleEOperation5677 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEOperation5687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleEOperation5733 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEOperation5754 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEOperation5766 = new BitSet(new long[]{0x0004000010020000L,0x0000000000000FF8L});
        public static final BitSet FOLLOW_67_in_ruleEOperation5779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEOperation5800 = new BitSet(new long[]{0x0004000010020000L,0x0000000000000FF0L});
        public static final BitSet FOLLOW_68_in_ruleEOperation5815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEOperation5836 = new BitSet(new long[]{0x0004000010020000L,0x0000000000000FE0L});
        public static final BitSet FOLLOW_69_in_ruleEOperation5851 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEOperation5872 = new BitSet(new long[]{0x0004000010020000L,0x0000000000000FC0L});
        public static final BitSet FOLLOW_70_in_ruleEOperation5887 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEOperation5908 = new BitSet(new long[]{0x0004000010020000L,0x0000000000000F80L});
        public static final BitSet FOLLOW_71_in_ruleEOperation5923 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEOperation5946 = new BitSet(new long[]{0x0004000010020000L,0x0000000000000F00L});
        public static final BitSet FOLLOW_72_in_ruleEOperation5961 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleEOperation5973 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEOperation5996 = new BitSet(new long[]{0x0000000800010000L});
        public static final BitSet FOLLOW_16_in_ruleEOperation6009 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEOperation6032 = new BitSet(new long[]{0x0000000800010000L});
        public static final BitSet FOLLOW_35_in_ruleEOperation6046 = new BitSet(new long[]{0x0004000010020000L,0x0000000000000E00L});
        public static final BitSet FOLLOW_28_in_ruleEOperation6061 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEOperation6073 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEOperation6094 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEOperation6107 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEOperation6128 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEOperation6142 = new BitSet(new long[]{0x0004000000020000L,0x0000000000000E00L});
        public static final BitSet FOLLOW_73_in_ruleEOperation6157 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEOperation6178 = new BitSet(new long[]{0x0004000000020000L,0x0000000000000C00L});
        public static final BitSet FOLLOW_50_in_ruleEOperation6193 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEOperation6205 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEOperation6226 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEOperation6239 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEOperation6260 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEOperation6274 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000C00L});
        public static final BitSet FOLLOW_74_in_ruleEOperation6289 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEOperation6301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleEParameter_in_ruleEOperation6322 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEOperation6335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleEParameter_in_ruleEOperation6356 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEOperation6370 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000800L});
        public static final BitSet FOLLOW_75_in_ruleEOperation6385 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEOperation6397 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEOperation6418 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEOperation6431 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEOperation6452 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEOperation6466 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEOperation6480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt6517 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt6528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleEInt6567 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt6584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEParameter_in_entryRuleEParameter6629 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEParameter6639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleEParameter6685 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEParameter6706 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEParameter6718 = new BitSet(new long[]{0x0000000010020000L,0x00000000000002F8L});
        public static final BitSet FOLLOW_67_in_ruleEParameter6731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEParameter6752 = new BitSet(new long[]{0x0000000010020000L,0x00000000000002F0L});
        public static final BitSet FOLLOW_68_in_ruleEParameter6767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEParameter6788 = new BitSet(new long[]{0x0000000010020000L,0x00000000000002E0L});
        public static final BitSet FOLLOW_69_in_ruleEParameter6803 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEParameter6824 = new BitSet(new long[]{0x0000000010020000L,0x00000000000002C0L});
        public static final BitSet FOLLOW_70_in_ruleEParameter6839 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEParameter6860 = new BitSet(new long[]{0x0000000010020000L,0x0000000000000280L});
        public static final BitSet FOLLOW_71_in_ruleEParameter6875 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEParameter6898 = new BitSet(new long[]{0x0000000010020000L,0x0000000000000200L});
        public static final BitSet FOLLOW_28_in_ruleEParameter6913 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEParameter6925 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEParameter6946 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEParameter6959 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEParameter6980 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEParameter6994 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000200L});
        public static final BitSet FOLLOW_73_in_ruleEParameter7009 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEParameter7030 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEParameter7044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAttribute_in_entryRuleEAttribute7080 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEAttribute7090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleEAttribute7142 = new BitSet(new long[]{0x0000000000000000L,0x000000000007C000L});
        public static final BitSet FOLLOW_78_in_ruleEAttribute7174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000078000L});
        public static final BitSet FOLLOW_79_in_ruleEAttribute7206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000070000L});
        public static final BitSet FOLLOW_80_in_ruleEAttribute7238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
        public static final BitSet FOLLOW_81_in_ruleEAttribute7270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_82_in_ruleEAttribute7296 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEAttribute7317 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEAttribute7329 = new BitSet(new long[]{0x0000000010020000L,0x00000000001802F8L});
        public static final BitSet FOLLOW_67_in_ruleEAttribute7342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEAttribute7363 = new BitSet(new long[]{0x0000000010020000L,0x00000000001802F0L});
        public static final BitSet FOLLOW_68_in_ruleEAttribute7378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEAttribute7399 = new BitSet(new long[]{0x0000000010020000L,0x00000000001802E0L});
        public static final BitSet FOLLOW_69_in_ruleEAttribute7414 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEAttribute7435 = new BitSet(new long[]{0x0000000010020000L,0x00000000001802C0L});
        public static final BitSet FOLLOW_70_in_ruleEAttribute7450 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEAttribute7471 = new BitSet(new long[]{0x0000000010020000L,0x0000000000180280L});
        public static final BitSet FOLLOW_83_in_ruleEAttribute7486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEAttribute7507 = new BitSet(new long[]{0x0000000010020000L,0x0000000000100280L});
        public static final BitSet FOLLOW_84_in_ruleEAttribute7522 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEAttribute7543 = new BitSet(new long[]{0x0000000010020000L,0x0000000000000280L});
        public static final BitSet FOLLOW_71_in_ruleEAttribute7558 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEAttribute7581 = new BitSet(new long[]{0x0000000010020000L,0x0000000000000200L});
        public static final BitSet FOLLOW_28_in_ruleEAttribute7596 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEAttribute7608 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEAttribute7629 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEAttribute7642 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEAttribute7663 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEAttribute7677 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000200L});
        public static final BitSet FOLLOW_73_in_ruleEAttribute7692 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEAttribute7713 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEAttribute7727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEReference_in_entryRuleEReference7763 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEReference7773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleEReference7825 = new BitSet(new long[]{0x0000000000000000L,0x000000000061C000L});
        public static final BitSet FOLLOW_78_in_ruleEReference7857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000618000L});
        public static final BitSet FOLLOW_79_in_ruleEReference7889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000610000L});
        public static final BitSet FOLLOW_80_in_ruleEReference7921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000600000L});
        public static final BitSet FOLLOW_85_in_ruleEReference7953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
        public static final BitSet FOLLOW_86_in_ruleEReference7979 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEReference8000 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEReference8012 = new BitSet(new long[]{0x0000000010020000L,0x00000000039802F8L});
        public static final BitSet FOLLOW_67_in_ruleEReference8025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEReference8046 = new BitSet(new long[]{0x0000000010020000L,0x00000000039802F0L});
        public static final BitSet FOLLOW_68_in_ruleEReference8061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEReference8082 = new BitSet(new long[]{0x0000000010020000L,0x00000000039802E0L});
        public static final BitSet FOLLOW_69_in_ruleEReference8097 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEReference8118 = new BitSet(new long[]{0x0000000010020000L,0x00000000039802C0L});
        public static final BitSet FOLLOW_70_in_ruleEReference8133 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEReference8154 = new BitSet(new long[]{0x0000000010020000L,0x0000000003980280L});
        public static final BitSet FOLLOW_83_in_ruleEReference8169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEReference8190 = new BitSet(new long[]{0x0000000010020000L,0x0000000003900280L});
        public static final BitSet FOLLOW_84_in_ruleEReference8205 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEReference8226 = new BitSet(new long[]{0x0000000010020000L,0x0000000003800280L});
        public static final BitSet FOLLOW_87_in_ruleEReference8241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEReference8262 = new BitSet(new long[]{0x0000000010020000L,0x0000000003000280L});
        public static final BitSet FOLLOW_71_in_ruleEReference8277 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEReference8300 = new BitSet(new long[]{0x0000000010020000L,0x0000000003000200L});
        public static final BitSet FOLLOW_88_in_ruleEReference8315 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEReference8338 = new BitSet(new long[]{0x0000000010020000L,0x0000000002000200L});
        public static final BitSet FOLLOW_89_in_ruleEReference8353 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleEReference8365 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEReference8388 = new BitSet(new long[]{0x0000000800010000L});
        public static final BitSet FOLLOW_16_in_ruleEReference8401 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEReference8424 = new BitSet(new long[]{0x0000000800010000L});
        public static final BitSet FOLLOW_35_in_ruleEReference8438 = new BitSet(new long[]{0x0000000010020000L,0x0000000000000200L});
        public static final BitSet FOLLOW_28_in_ruleEReference8453 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEReference8465 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEReference8486 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEReference8499 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEReference8520 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEReference8534 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000200L});
        public static final BitSet FOLLOW_73_in_ruleEReference8549 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEReference8570 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEReference8584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEEnumLiteral_in_entryRuleEEnumLiteral8620 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEEnumLiteral8630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleEEnumLiteral8676 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEEnumLiteral8697 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEEnumLiteral8709 = new BitSet(new long[]{0x0000010010020000L,0x0000000008000000L});
        public static final BitSet FOLLOW_40_in_ruleEEnumLiteral8722 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEEnumLiteral8743 = new BitSet(new long[]{0x0000000010020000L,0x0000000008000000L});
        public static final BitSet FOLLOW_91_in_ruleEEnumLiteral8758 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEEnumLiteral8779 = new BitSet(new long[]{0x0000000010020000L});
        public static final BitSet FOLLOW_28_in_ruleEEnumLiteral8794 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEEnumLiteral8806 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEEnumLiteral8827 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleEEnumLiteral8840 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEEnumLiteral8861 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleEEnumLiteral8875 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEEnumLiteral8889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDSGenFeature_Impl_in_entryRuleDSGenFeature_Impl8925 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDSGenFeature_Impl8935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_92_in_ruleDSGenFeature_Impl8972 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDSGenFeature_Impl8984 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
        public static final BitSet FOLLOW_93_in_ruleDSGenFeature_Impl8996 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDSGenFeature_Impl9019 = new BitSet(new long[]{0x0000000000020000L,0x0000000040000000L});
        public static final BitSet FOLLOW_94_in_ruleDSGenFeature_Impl9032 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
        public static final BitSet FOLLOW_ruleValueGenerator_in_ruleDSGenFeature_Impl9053 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDSGenFeature_Impl9067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDSGenClass_in_entryRuleDSGenClass9103 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDSGenClass9113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_95_in_ruleDSGenClass9150 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDSGenClass9162 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
        public static final BitSet FOLLOW_96_in_ruleDSGenClass9174 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDSGenClass9197 = new BitSet(new long[]{0x0000000000020000L,0x0000000240000000L});
        public static final BitSet FOLLOW_97_in_ruleDSGenClass9210 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDSGenClass9222 = new BitSet(new long[]{0x0000000000000000L,0x000000C010000000L});
        public static final BitSet FOLLOW_ruleDSGenFeature_in_ruleDSGenClass9243 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleDSGenClass9256 = new BitSet(new long[]{0x0000000000000000L,0x000000C010000000L});
        public static final BitSet FOLLOW_ruleDSGenFeature_in_ruleDSGenClass9277 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleDSGenClass9291 = new BitSet(new long[]{0x0000000000020000L,0x0000000040000000L});
        public static final BitSet FOLLOW_94_in_ruleDSGenClass9306 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
        public static final BitSet FOLLOW_ruleEObjectGenerator_in_ruleDSGenClass9327 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDSGenClass9341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDSGenDataType_Impl_in_entryRuleDSGenDataType_Impl9377 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDSGenDataType_Impl9387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_98_in_ruleDSGenDataType_Impl9424 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDSGenDataType_Impl9436 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
        public static final BitSet FOLLOW_96_in_ruleDSGenDataType_Impl9448 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDSGenDataType_Impl9471 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
        public static final BitSet FOLLOW_99_in_ruleDSGenDataType_Impl9483 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDSGenDataType_Impl9506 = new BitSet(new long[]{0x0000000000020000L,0x0000000200000000L});
        public static final BitSet FOLLOW_97_in_ruleDSGenDataType_Impl9519 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDSGenDataType_Impl9531 = new BitSet(new long[]{0x0000000000000000L,0x000000C010000000L});
        public static final BitSet FOLLOW_ruleDSGenFeature_in_ruleDSGenDataType_Impl9552 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleDSGenDataType_Impl9565 = new BitSet(new long[]{0x0000000000000000L,0x000000C010000000L});
        public static final BitSet FOLLOW_ruleDSGenFeature_in_ruleDSGenDataType_Impl9586 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleDSGenDataType_Impl9600 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDSGenDataType_Impl9614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDSGenEnum_in_entryRuleDSGenEnum9650 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDSGenEnum9660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_100_in_ruleDSGenEnum9697 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDSGenEnum9709 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
        public static final BitSet FOLLOW_96_in_ruleDSGenEnum9721 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDSGenEnum9744 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
        public static final BitSet FOLLOW_99_in_ruleDSGenEnum9756 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDSGenEnum9779 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
        public static final BitSet FOLLOW_101_in_ruleDSGenEnum9791 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDSGenEnum9814 = new BitSet(new long[]{0x0000000000020000L,0x0000000200000000L});
        public static final BitSet FOLLOW_97_in_ruleDSGenEnum9827 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDSGenEnum9839 = new BitSet(new long[]{0x0000000000000000L,0x000000C010000000L});
        public static final BitSet FOLLOW_ruleDSGenFeature_in_ruleDSGenEnum9860 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleDSGenEnum9873 = new BitSet(new long[]{0x0000000000000000L,0x000000C010000000L});
        public static final BitSet FOLLOW_ruleDSGenFeature_in_ruleDSGenEnum9894 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleDSGenEnum9908 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDSGenEnum9922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDSGenAttribute_in_entryRuleDSGenAttribute9958 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDSGenAttribute9968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_102_in_ruleDSGenAttribute10005 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDSGenAttribute10017 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
        public static final BitSet FOLLOW_93_in_ruleDSGenAttribute10029 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDSGenAttribute10052 = new BitSet(new long[]{0x0000000000020000L,0x0000000040000000L});
        public static final BitSet FOLLOW_94_in_ruleDSGenAttribute10065 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
        public static final BitSet FOLLOW_ruleValueGenerator_in_ruleDSGenAttribute10086 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDSGenAttribute10100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDSGenReference_in_entryRuleDSGenReference10136 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDSGenReference10146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_103_in_ruleDSGenReference10183 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDSGenReference10195 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
        public static final BitSet FOLLOW_93_in_ruleDSGenReference10207 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDSGenReference10230 = new BitSet(new long[]{0x0000000000020000L,0x0000010040000000L});
        public static final BitSet FOLLOW_104_in_ruleDSGenReference10243 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDSGenReference10266 = new BitSet(new long[]{0x0000000000020000L,0x0000000040000000L});
        public static final BitSet FOLLOW_94_in_ruleDSGenReference10281 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
        public static final BitSet FOLLOW_ruleValueGenerator_in_ruleDSGenReference10302 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDSGenReference10316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocale_in_entryRuleLocale10353 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocale10364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_105_in_ruleLocale10401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferenceGenerator_in_entryRuleReferenceGenerator10440 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReferenceGenerator10450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_106_in_ruleReferenceGenerator10496 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleReferenceGenerator10508 = new BitSet(new long[]{0x0000000000022000L,0x0000F80000000000L});
        public static final BitSet FOLLOW_107_in_ruleReferenceGenerator10521 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleReferenceGenerator10542 = new BitSet(new long[]{0x0000000000022000L,0x0000F00000000000L});
        public static final BitSet FOLLOW_13_in_ruleReferenceGenerator10557 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleELong_in_ruleReferenceGenerator10578 = new BitSet(new long[]{0x0000000000020000L,0x0000F00000000000L});
        public static final BitSet FOLLOW_108_in_ruleReferenceGenerator10593 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReferenceGenerator10614 = new BitSet(new long[]{0x0000000000020000L,0x0000E00000000000L});
        public static final BitSet FOLLOW_109_in_ruleReferenceGenerator10629 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
        public static final BitSet FOLLOW_ruleLocale_in_ruleReferenceGenerator10650 = new BitSet(new long[]{0x0000000000020000L,0x0000C00000000000L});
        public static final BitSet FOLLOW_110_in_ruleReferenceGenerator10665 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleReferenceGenerator10686 = new BitSet(new long[]{0x0000000000020000L,0x0000800000000000L});
        public static final BitSet FOLLOW_111_in_ruleReferenceGenerator10701 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReferenceGenerator10724 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleReferenceGenerator10738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEObjectGenerator_in_entryRuleEObjectGenerator10776 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEObjectGenerator10786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_112_in_ruleEObjectGenerator10832 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEObjectGenerator10844 = new BitSet(new long[]{0x0000000000022000L,0x0000B90000000000L});
        public static final BitSet FOLLOW_107_in_ruleEObjectGenerator10857 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEObjectGenerator10878 = new BitSet(new long[]{0x0000000000022000L,0x0000B10000000000L});
        public static final BitSet FOLLOW_13_in_ruleEObjectGenerator10893 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleELong_in_ruleEObjectGenerator10914 = new BitSet(new long[]{0x0000000000020000L,0x0000B10000000000L});
        public static final BitSet FOLLOW_108_in_ruleEObjectGenerator10929 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEObjectGenerator10950 = new BitSet(new long[]{0x0000000000020000L,0x0000A10000000000L});
        public static final BitSet FOLLOW_109_in_ruleEObjectGenerator10965 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
        public static final BitSet FOLLOW_ruleLocale_in_ruleEObjectGenerator10986 = new BitSet(new long[]{0x0000000000020000L,0x0000810000000000L});
        public static final BitSet FOLLOW_111_in_ruleEObjectGenerator11001 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEObjectGenerator11024 = new BitSet(new long[]{0x0000000000020000L,0x0000010000000000L});
        public static final BitSet FOLLOW_104_in_ruleEObjectGenerator11039 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEObjectGenerator11062 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEObjectGenerator11076 = new BitSet(new long[]{0x0000000000000002L});
    }


}