package com.opcoach.datasample.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.opcoach.datasample.xtext.services.DataSampleDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataSampleDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Sample'", "'for '", "'{'", "'seed'", "'language'", "'badValueGeneratorNames'", "','", "'}'", "'In the root object generate '", "'-'", "'EPackage'", "'nsURI'", "'nsPrefix'", "'eAnnotations'", "'eClassifiers'", "'eSubpackages'", "'forField'", "'.'", "'use'", "'with errorRate='", "'% generated with '", "'abstract'", "'interface'", "'EClass'", "'instanceClassName'", "'instanceTypeName'", "'eSuperTypes'", "'('", "')'", "'eTypeParameters'", "'eOperations'", "'eStructuralFeatures'", "'eGenericSuperTypes'", "'EAnnotation'", "'source'", "'references'", "'details'", "'contents'", "'EStringToStringMapEntry'", "'key'", "'value'", "'EObject'", "'ETypeParameter'", "'eBounds'", "'EDataType'", "'serializable'", "'EEnum'", "'eLiterals'", "'EGenericType'", "'eTypeParameter'", "'eClassifier'", "'eUpperBound'", "'eTypeArguments'", "'eLowerBound'", "'true'", "'false'", "'EEnumLiteral'", "'literal'", "'Locale'", "'ReferenceGenerator'", "'badValueProportion'", "'randomSeed'", "'ID'", "'locale'", "'step'", "'badValueGenerator'", "'volatile'", "'transient'", "'unsettable'", "'derived'", "'iD'", "'EAttribute'", "'ordered'", "'unique'", "'lowerBound'", "'upperBound'", "'changeable'", "'defaultValueLiteral'", "'eType'", "'eGenericType'", "'containment'", "'EReference'", "'resolveProxies'", "'eOpposite'", "'eKeys'", "'EOperation'", "'eExceptions'", "'eParameters'", "'eGenericExceptions'", "'EParameter'", "'fr'", "'en'", "'de'", "'es'", "'it'"
    };
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int RULE_INT=6;
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


        public InternalDataSampleDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDataSampleDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDataSampleDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g"; }



     	private DataSampleDSLGrammarAccess grammarAccess;
     	
        public InternalDataSampleDSLParser(TokenStream input, DataSampleDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DataSample";	
       	}
       	
       	@Override
       	protected DataSampleDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDataSample"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:68:1: entryRuleDataSample returns [EObject current=null] : iv_ruleDataSample= ruleDataSample EOF ;
    public final EObject entryRuleDataSample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSample = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:69:2: (iv_ruleDataSample= ruleDataSample EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:70:2: iv_ruleDataSample= ruleDataSample EOF
            {
             newCompositeNode(grammarAccess.getDataSampleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataSample_in_entryRuleDataSample75);
            iv_ruleDataSample=ruleDataSample();

            state._fsp--;

             current =iv_ruleDataSample; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataSample85); 

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
    // $ANTLR end "entryRuleDataSample"


    // $ANTLR start "ruleDataSample"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:77:1: ruleDataSample returns [EObject current=null] : ( () otherlv_1= 'Sample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'for ' ( (lv_packageURI_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= 'seed' ( (lv_seed_7_0= ruleEInt ) ) otherlv_8= 'language' ( (lv_language_9_0= ruleLanguage ) ) (otherlv_10= 'badValueGeneratorNames' otherlv_11= '{' ( (lv_badValueGeneratorNames_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) ) )* otherlv_15= '}' )? otherlv_16= 'In the root object generate ' ( (lv_entityGenerators_17_0= ruleEntityGenerator2 ) ) (otherlv_18= ',' ( (lv_entityGenerators_19_0= ruleEntityGenerator2 ) ) )* ( (lv_fieldGenerators_20_0= ruleFieldGenerator2 ) ) (otherlv_21= ',' ( (lv_fieldGenerators_22_0= ruleFieldGenerator2 ) ) )* otherlv_23= '}' ) ;
    public final EObject ruleDataSample() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_packageURI_4_0 = null;

        AntlrDatatypeRuleToken lv_seed_7_0 = null;

        Enumerator lv_language_9_0 = null;

        AntlrDatatypeRuleToken lv_badValueGeneratorNames_12_0 = null;

        AntlrDatatypeRuleToken lv_badValueGeneratorNames_14_0 = null;

        EObject lv_entityGenerators_17_0 = null;

        EObject lv_entityGenerators_19_0 = null;

        EObject lv_fieldGenerators_20_0 = null;

        EObject lv_fieldGenerators_22_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:80:28: ( ( () otherlv_1= 'Sample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'for ' ( (lv_packageURI_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= 'seed' ( (lv_seed_7_0= ruleEInt ) ) otherlv_8= 'language' ( (lv_language_9_0= ruleLanguage ) ) (otherlv_10= 'badValueGeneratorNames' otherlv_11= '{' ( (lv_badValueGeneratorNames_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) ) )* otherlv_15= '}' )? otherlv_16= 'In the root object generate ' ( (lv_entityGenerators_17_0= ruleEntityGenerator2 ) ) (otherlv_18= ',' ( (lv_entityGenerators_19_0= ruleEntityGenerator2 ) ) )* ( (lv_fieldGenerators_20_0= ruleFieldGenerator2 ) ) (otherlv_21= ',' ( (lv_fieldGenerators_22_0= ruleFieldGenerator2 ) ) )* otherlv_23= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:81:1: ( () otherlv_1= 'Sample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'for ' ( (lv_packageURI_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= 'seed' ( (lv_seed_7_0= ruleEInt ) ) otherlv_8= 'language' ( (lv_language_9_0= ruleLanguage ) ) (otherlv_10= 'badValueGeneratorNames' otherlv_11= '{' ( (lv_badValueGeneratorNames_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) ) )* otherlv_15= '}' )? otherlv_16= 'In the root object generate ' ( (lv_entityGenerators_17_0= ruleEntityGenerator2 ) ) (otherlv_18= ',' ( (lv_entityGenerators_19_0= ruleEntityGenerator2 ) ) )* ( (lv_fieldGenerators_20_0= ruleFieldGenerator2 ) ) (otherlv_21= ',' ( (lv_fieldGenerators_22_0= ruleFieldGenerator2 ) ) )* otherlv_23= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:81:1: ( () otherlv_1= 'Sample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'for ' ( (lv_packageURI_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= 'seed' ( (lv_seed_7_0= ruleEInt ) ) otherlv_8= 'language' ( (lv_language_9_0= ruleLanguage ) ) (otherlv_10= 'badValueGeneratorNames' otherlv_11= '{' ( (lv_badValueGeneratorNames_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) ) )* otherlv_15= '}' )? otherlv_16= 'In the root object generate ' ( (lv_entityGenerators_17_0= ruleEntityGenerator2 ) ) (otherlv_18= ',' ( (lv_entityGenerators_19_0= ruleEntityGenerator2 ) ) )* ( (lv_fieldGenerators_20_0= ruleFieldGenerator2 ) ) (otherlv_21= ',' ( (lv_fieldGenerators_22_0= ruleFieldGenerator2 ) ) )* otherlv_23= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:81:2: () otherlv_1= 'Sample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'for ' ( (lv_packageURI_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= 'seed' ( (lv_seed_7_0= ruleEInt ) ) otherlv_8= 'language' ( (lv_language_9_0= ruleLanguage ) ) (otherlv_10= 'badValueGeneratorNames' otherlv_11= '{' ( (lv_badValueGeneratorNames_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) ) )* otherlv_15= '}' )? otherlv_16= 'In the root object generate ' ( (lv_entityGenerators_17_0= ruleEntityGenerator2 ) ) (otherlv_18= ',' ( (lv_entityGenerators_19_0= ruleEntityGenerator2 ) ) )* ( (lv_fieldGenerators_20_0= ruleFieldGenerator2 ) ) (otherlv_21= ',' ( (lv_fieldGenerators_22_0= ruleFieldGenerator2 ) ) )* otherlv_23= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:81:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDataSampleAccess().getDataSampleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleDataSample131); 

                	newLeafNode(otherlv_1, grammarAccess.getDataSampleAccess().getSampleKeyword_1());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:91:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:92:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:92:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:93:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDataSampleAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDataSample152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDataSample164); 

                	newLeafNode(otherlv_3, grammarAccess.getDataSampleAccess().getForKeyword_3());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:113:1: ( (lv_packageURI_4_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:114:1: (lv_packageURI_4_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:114:1: (lv_packageURI_4_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:115:3: lv_packageURI_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDataSampleAccess().getPackageURIEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDataSample185);
            lv_packageURI_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
            	        }
                   		set(
                   			current, 
                   			"packageURI",
                    		lv_packageURI_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDataSample197); 

                	newLeafNode(otherlv_5, grammarAccess.getDataSampleAccess().getLeftCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDataSample209); 

                	newLeafNode(otherlv_6, grammarAccess.getDataSampleAccess().getSeedKeyword_6());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:139:1: ( (lv_seed_7_0= ruleEInt ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:140:1: (lv_seed_7_0= ruleEInt )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:140:1: (lv_seed_7_0= ruleEInt )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:141:3: lv_seed_7_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getDataSampleAccess().getSeedEIntParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleDataSample230);
            lv_seed_7_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
            	        }
                   		set(
                   			current, 
                   			"seed",
                    		lv_seed_7_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDataSample242); 

                	newLeafNode(otherlv_8, grammarAccess.getDataSampleAccess().getLanguageKeyword_8());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:161:1: ( (lv_language_9_0= ruleLanguage ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:162:1: (lv_language_9_0= ruleLanguage )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:162:1: (lv_language_9_0= ruleLanguage )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:163:3: lv_language_9_0= ruleLanguage
            {
             
            	        newCompositeNode(grammarAccess.getDataSampleAccess().getLanguageLanguageEnumRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLanguage_in_ruleDataSample263);
            lv_language_9_0=ruleLanguage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
            	        }
                   		set(
                   			current, 
                   			"language",
                    		lv_language_9_0, 
                    		"Language");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:179:2: (otherlv_10= 'badValueGeneratorNames' otherlv_11= '{' ( (lv_badValueGeneratorNames_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) ) )* otherlv_15= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:179:4: otherlv_10= 'badValueGeneratorNames' otherlv_11= '{' ( (lv_badValueGeneratorNames_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDataSample276); 

                        	newLeafNode(otherlv_10, grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesKeyword_10_0());
                        
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDataSample288); 

                        	newLeafNode(otherlv_11, grammarAccess.getDataSampleAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:187:1: ( (lv_badValueGeneratorNames_12_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:188:1: (lv_badValueGeneratorNames_12_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:188:1: (lv_badValueGeneratorNames_12_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:189:3: lv_badValueGeneratorNames_12_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesEStringParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDataSample309);
                    lv_badValueGeneratorNames_12_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
                    	        }
                           		add(
                           			current, 
                           			"badValueGeneratorNames",
                            		lv_badValueGeneratorNames_12_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:205:2: (otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==17) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:205:4: otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDataSample322); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getDataSampleAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:209:1: ( (lv_badValueGeneratorNames_14_0= ruleEString ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:210:1: (lv_badValueGeneratorNames_14_0= ruleEString )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:210:1: (lv_badValueGeneratorNames_14_0= ruleEString )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:211:3: lv_badValueGeneratorNames_14_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesEStringParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDataSample343);
                    	    lv_badValueGeneratorNames_14_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"badValueGeneratorNames",
                    	            		lv_badValueGeneratorNames_14_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDataSample357); 

                        	newLeafNode(otherlv_15, grammarAccess.getDataSampleAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDataSample371); 

                	newLeafNode(otherlv_16, grammarAccess.getDataSampleAccess().getInTheRootObjectGenerateKeyword_11());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:235:1: ( (lv_entityGenerators_17_0= ruleEntityGenerator2 ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:236:1: (lv_entityGenerators_17_0= ruleEntityGenerator2 )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:236:1: (lv_entityGenerators_17_0= ruleEntityGenerator2 )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:237:3: lv_entityGenerators_17_0= ruleEntityGenerator2
            {
             
            	        newCompositeNode(grammarAccess.getDataSampleAccess().getEntityGeneratorsEntityGenerator2ParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEntityGenerator2_in_ruleDataSample392);
            lv_entityGenerators_17_0=ruleEntityGenerator2();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
            	        }
                   		add(
                   			current, 
                   			"entityGenerators",
                    		lv_entityGenerators_17_0, 
                    		"EntityGenerator2");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:253:2: (otherlv_18= ',' ( (lv_entityGenerators_19_0= ruleEntityGenerator2 ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:253:4: otherlv_18= ',' ( (lv_entityGenerators_19_0= ruleEntityGenerator2 ) )
            	    {
            	    otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDataSample405); 

            	        	newLeafNode(otherlv_18, grammarAccess.getDataSampleAccess().getCommaKeyword_13_0());
            	        
            	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:257:1: ( (lv_entityGenerators_19_0= ruleEntityGenerator2 ) )
            	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:258:1: (lv_entityGenerators_19_0= ruleEntityGenerator2 )
            	    {
            	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:258:1: (lv_entityGenerators_19_0= ruleEntityGenerator2 )
            	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:259:3: lv_entityGenerators_19_0= ruleEntityGenerator2
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataSampleAccess().getEntityGeneratorsEntityGenerator2ParserRuleCall_13_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEntityGenerator2_in_ruleDataSample426);
            	    lv_entityGenerators_19_0=ruleEntityGenerator2();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entityGenerators",
            	            		lv_entityGenerators_19_0, 
            	            		"EntityGenerator2");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:275:4: ( (lv_fieldGenerators_20_0= ruleFieldGenerator2 ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:276:1: (lv_fieldGenerators_20_0= ruleFieldGenerator2 )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:276:1: (lv_fieldGenerators_20_0= ruleFieldGenerator2 )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:277:3: lv_fieldGenerators_20_0= ruleFieldGenerator2
            {
             
            	        newCompositeNode(grammarAccess.getDataSampleAccess().getFieldGeneratorsFieldGenerator2ParserRuleCall_14_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFieldGenerator2_in_ruleDataSample449);
            lv_fieldGenerators_20_0=ruleFieldGenerator2();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
            	        }
                   		add(
                   			current, 
                   			"fieldGenerators",
                    		lv_fieldGenerators_20_0, 
                    		"FieldGenerator2");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:293:2: (otherlv_21= ',' ( (lv_fieldGenerators_22_0= ruleFieldGenerator2 ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:293:4: otherlv_21= ',' ( (lv_fieldGenerators_22_0= ruleFieldGenerator2 ) )
            	    {
            	    otherlv_21=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDataSample462); 

            	        	newLeafNode(otherlv_21, grammarAccess.getDataSampleAccess().getCommaKeyword_15_0());
            	        
            	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:297:1: ( (lv_fieldGenerators_22_0= ruleFieldGenerator2 ) )
            	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:298:1: (lv_fieldGenerators_22_0= ruleFieldGenerator2 )
            	    {
            	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:298:1: (lv_fieldGenerators_22_0= ruleFieldGenerator2 )
            	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:299:3: lv_fieldGenerators_22_0= ruleFieldGenerator2
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataSampleAccess().getFieldGeneratorsFieldGenerator2ParserRuleCall_15_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleFieldGenerator2_in_ruleDataSample483);
            	    lv_fieldGenerators_22_0=ruleFieldGenerator2();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fieldGenerators",
            	            		lv_fieldGenerators_22_0, 
            	            		"FieldGenerator2");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_23=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDataSample497); 

                	newLeafNode(otherlv_23, grammarAccess.getDataSampleAccess().getRightCurlyBracketKeyword_16());
                

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
    // $ANTLR end "ruleDataSample"


    // $ANTLR start "entryRuleEClassifier"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:327:1: entryRuleEClassifier returns [EObject current=null] : iv_ruleEClassifier= ruleEClassifier EOF ;
    public final EObject entryRuleEClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClassifier = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:328:2: (iv_ruleEClassifier= ruleEClassifier EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:329:2: iv_ruleEClassifier= ruleEClassifier EOF
            {
             newCompositeNode(grammarAccess.getEClassifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEClassifier_in_entryRuleEClassifier533);
            iv_ruleEClassifier=ruleEClassifier();

            state._fsp--;

             current =iv_ruleEClassifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEClassifier543); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:336:1: ruleEClassifier returns [EObject current=null] : (this_EClass_0= ruleEClass | this_EDataType_Impl_1= ruleEDataType_Impl | this_EEnum_2= ruleEEnum ) ;
    public final EObject ruleEClassifier() throws RecognitionException {
        EObject current = null;

        EObject this_EClass_0 = null;

        EObject this_EDataType_Impl_1 = null;

        EObject this_EEnum_2 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:339:28: ( (this_EClass_0= ruleEClass | this_EDataType_Impl_1= ruleEDataType_Impl | this_EEnum_2= ruleEEnum ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:340:1: (this_EClass_0= ruleEClass | this_EDataType_Impl_1= ruleEDataType_Impl | this_EEnum_2= ruleEEnum )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:340:1: (this_EClass_0= ruleEClass | this_EDataType_Impl_1= ruleEDataType_Impl | this_EEnum_2= ruleEEnum )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 32:
            case 33:
            case 34:
                {
                alt5=1;
                }
                break;
            case 55:
                {
                alt5=2;
                }
                break;
            case 57:
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
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:341:5: this_EClass_0= ruleEClass
                    {
                     
                            newCompositeNode(grammarAccess.getEClassifierAccess().getEClassParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEClass_in_ruleEClassifier590);
                    this_EClass_0=ruleEClass();

                    state._fsp--;

                     
                            current = this_EClass_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:351:5: this_EDataType_Impl_1= ruleEDataType_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getEClassifierAccess().getEDataType_ImplParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEDataType_Impl_in_ruleEClassifier617);
                    this_EDataType_Impl_1=ruleEDataType_Impl();

                    state._fsp--;

                     
                            current = this_EDataType_Impl_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:361:5: this_EEnum_2= ruleEEnum
                    {
                     
                            newCompositeNode(grammarAccess.getEClassifierAccess().getEEnumParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEEnum_in_ruleEClassifier644);
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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:379:1: entryRuleEStructuralFeature returns [EObject current=null] : iv_ruleEStructuralFeature= ruleEStructuralFeature EOF ;
    public final EObject entryRuleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStructuralFeature = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:380:2: (iv_ruleEStructuralFeature= ruleEStructuralFeature EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:381:2: iv_ruleEStructuralFeature= ruleEStructuralFeature EOF
            {
             newCompositeNode(grammarAccess.getEStructuralFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEStructuralFeature_in_entryRuleEStructuralFeature681);
            iv_ruleEStructuralFeature=ruleEStructuralFeature();

            state._fsp--;

             current =iv_ruleEStructuralFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEStructuralFeature691); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:388:1: ruleEStructuralFeature returns [EObject current=null] : (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) ;
    public final EObject ruleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject this_EAttribute_0 = null;

        EObject this_EReference_1 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:391:28: ( (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:392:1: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:392:1: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            int alt6=2;
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
                            int LA6_4 = input.LA(5);

                            if ( ((LA6_4>=91 && LA6_4<=92)) ) {
                                alt6=2;
                            }
                            else if ( ((LA6_4>=81 && LA6_4<=82)) ) {
                                alt6=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 4, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 81:
                        case 82:
                            {
                            alt6=1;
                            }
                            break;
                        case 91:
                        case 92:
                            {
                            alt6=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 80:
                        {
                        int LA6_4 = input.LA(4);

                        if ( ((LA6_4>=91 && LA6_4<=92)) ) {
                            alt6=2;
                        }
                        else if ( ((LA6_4>=81 && LA6_4<=82)) ) {
                            alt6=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 81:
                    case 82:
                        {
                        alt6=1;
                        }
                        break;
                    case 91:
                    case 92:
                        {
                        alt6=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case 79:
                    {
                    switch ( input.LA(3) ) {
                    case 80:
                        {
                        int LA6_4 = input.LA(4);

                        if ( ((LA6_4>=91 && LA6_4<=92)) ) {
                            alt6=2;
                        }
                        else if ( ((LA6_4>=81 && LA6_4<=82)) ) {
                            alt6=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 81:
                    case 82:
                        {
                        alt6=1;
                        }
                        break;
                    case 91:
                    case 92:
                        {
                        alt6=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 80:
                    {
                    int LA6_4 = input.LA(3);

                    if ( ((LA6_4>=91 && LA6_4<=92)) ) {
                        alt6=2;
                    }
                    else if ( ((LA6_4>=81 && LA6_4<=82)) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 81:
                case 82:
                    {
                    alt6=1;
                    }
                    break;
                case 91:
                case 92:
                    {
                    alt6=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

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
                        int LA6_4 = input.LA(4);

                        if ( ((LA6_4>=91 && LA6_4<=92)) ) {
                            alt6=2;
                        }
                        else if ( ((LA6_4>=81 && LA6_4<=82)) ) {
                            alt6=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 81:
                    case 82:
                        {
                        alt6=1;
                        }
                        break;
                    case 91:
                    case 92:
                        {
                        alt6=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 80:
                    {
                    int LA6_4 = input.LA(3);

                    if ( ((LA6_4>=91 && LA6_4<=92)) ) {
                        alt6=2;
                    }
                    else if ( ((LA6_4>=81 && LA6_4<=82)) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 81:
                case 82:
                    {
                    alt6=1;
                    }
                    break;
                case 91:
                case 92:
                    {
                    alt6=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }

                }
                break;
            case 79:
                {
                switch ( input.LA(2) ) {
                case 80:
                    {
                    int LA6_4 = input.LA(3);

                    if ( ((LA6_4>=91 && LA6_4<=92)) ) {
                        alt6=2;
                    }
                    else if ( ((LA6_4>=81 && LA6_4<=82)) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 81:
                case 82:
                    {
                    alt6=1;
                    }
                    break;
                case 91:
                case 92:
                    {
                    alt6=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }

                }
                break;
            case 80:
                {
                int LA6_4 = input.LA(2);

                if ( ((LA6_4>=91 && LA6_4<=92)) ) {
                    alt6=2;
                }
                else if ( ((LA6_4>=81 && LA6_4<=82)) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;
                }
                }
                break;
            case 81:
            case 82:
                {
                alt6=1;
                }
                break;
            case 91:
            case 92:
                {
                alt6=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:393:5: this_EAttribute_0= ruleEAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getEStructuralFeatureAccess().getEAttributeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEAttribute_in_ruleEStructuralFeature738);
                    this_EAttribute_0=ruleEAttribute();

                    state._fsp--;

                     
                            current = this_EAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:403:5: this_EReference_1= ruleEReference
                    {
                     
                            newCompositeNode(grammarAccess.getEStructuralFeatureAccess().getEReferenceParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEReference_in_ruleEStructuralFeature765);
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


    // $ANTLR start "entryRuleEString"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:419:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:420:2: (iv_ruleEString= ruleEString EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:421:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString801);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString812); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:428:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:431:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:432:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:432:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:432:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString852); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:440:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString878); 

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


    // $ANTLR start "entryRuleEInt"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:455:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:456:2: (iv_ruleEInt= ruleEInt EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:457:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt924);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt935); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:464:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:467:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:468:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:468:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:468:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:468:2: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:469:2: kw= '-'
                    {
                    kw=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEInt974); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt991); 

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


    // $ANTLR start "entryRuleEPackage"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:489:1: entryRuleEPackage returns [EObject current=null] : iv_ruleEPackage= ruleEPackage EOF ;
    public final EObject entryRuleEPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPackage = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:490:2: (iv_ruleEPackage= ruleEPackage EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:491:2: iv_ruleEPackage= ruleEPackage EOF
            {
             newCompositeNode(grammarAccess.getEPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEPackage_in_entryRuleEPackage1036);
            iv_ruleEPackage=ruleEPackage();

            state._fsp--;

             current =iv_ruleEPackage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEPackage1046); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:498:1: ruleEPackage returns [EObject current=null] : ( () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:501:28: ( ( () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:502:1: ( () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:502:1: ( () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:502:2: () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:502:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:503:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEPackageAccess().getEPackageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEPackage1092); 

                	newLeafNode(otherlv_1, grammarAccess.getEPackageAccess().getEPackageKeyword_1());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:512:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:513:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:513:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:514:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEPackageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEPackage1113);
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

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEPackage1125); 

                	newLeafNode(otherlv_3, grammarAccess.getEPackageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:534:1: (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:534:3: otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEPackage1138); 

                        	newLeafNode(otherlv_4, grammarAccess.getEPackageAccess().getNsURIKeyword_4_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:538:1: ( (lv_nsURI_5_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:539:1: (lv_nsURI_5_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:539:1: (lv_nsURI_5_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:540:3: lv_nsURI_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEPackageAccess().getNsURIEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEPackage1159);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:556:4: (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:556:6: otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEPackage1174); 

                        	newLeafNode(otherlv_6, grammarAccess.getEPackageAccess().getNsPrefixKeyword_5_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:560:1: ( (lv_nsPrefix_7_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:561:1: (lv_nsPrefix_7_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:561:1: (lv_nsPrefix_7_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:562:3: lv_nsPrefix_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEPackageAccess().getNsPrefixEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEPackage1195);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:578:4: (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:578:6: otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEPackage1210); 

                        	newLeafNode(otherlv_8, grammarAccess.getEPackageAccess().getEAnnotationsKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEPackage1222); 

                        	newLeafNode(otherlv_9, grammarAccess.getEPackageAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:586:1: ( (lv_eAnnotations_10_0= ruleEAnnotation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:587:1: (lv_eAnnotations_10_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:587:1: (lv_eAnnotations_10_0= ruleEAnnotation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:588:3: lv_eAnnotations_10_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEPackageAccess().getEAnnotationsEAnnotationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEPackage1243);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:604:2: (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==17) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:604:4: otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEPackage1256); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getEPackageAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:608:1: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:609:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:609:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:610:3: lv_eAnnotations_12_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEPackageAccess().getEAnnotationsEAnnotationParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEPackage1277);
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
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEPackage1291); 

                        	newLeafNode(otherlv_13, grammarAccess.getEPackageAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:630:3: (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:630:5: otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEPackage1306); 

                        	newLeafNode(otherlv_14, grammarAccess.getEPackageAccess().getEClassifiersKeyword_7_0());
                        
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEPackage1318); 

                        	newLeafNode(otherlv_15, grammarAccess.getEPackageAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:638:1: ( (lv_eClassifiers_16_0= ruleEClassifier ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:639:1: (lv_eClassifiers_16_0= ruleEClassifier )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:639:1: (lv_eClassifiers_16_0= ruleEClassifier )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:640:3: lv_eClassifiers_16_0= ruleEClassifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getEPackageAccess().getEClassifiersEClassifierParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEClassifier_in_ruleEPackage1339);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:656:2: (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==17) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:656:4: otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) )
                    	    {
                    	    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEPackage1352); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getEPackageAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:660:1: ( (lv_eClassifiers_18_0= ruleEClassifier ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:661:1: (lv_eClassifiers_18_0= ruleEClassifier )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:661:1: (lv_eClassifiers_18_0= ruleEClassifier )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:662:3: lv_eClassifiers_18_0= ruleEClassifier
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEPackageAccess().getEClassifiersEClassifierParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEClassifier_in_ruleEPackage1373);
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
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEPackage1387); 

                        	newLeafNode(otherlv_19, grammarAccess.getEPackageAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:682:3: (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:682:5: otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEPackage1402); 

                        	newLeafNode(otherlv_20, grammarAccess.getEPackageAccess().getESubpackagesKeyword_8_0());
                        
                    otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEPackage1414); 

                        	newLeafNode(otherlv_21, grammarAccess.getEPackageAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:690:1: ( (lv_eSubpackages_22_0= ruleEPackage ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:691:1: (lv_eSubpackages_22_0= ruleEPackage )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:691:1: (lv_eSubpackages_22_0= ruleEPackage )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:692:3: lv_eSubpackages_22_0= ruleEPackage
                    {
                     
                    	        newCompositeNode(grammarAccess.getEPackageAccess().getESubpackagesEPackageParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEPackage_in_ruleEPackage1435);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:708:2: (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==17) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:708:4: otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) )
                    	    {
                    	    otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEPackage1448); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getEPackageAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:712:1: ( (lv_eSubpackages_24_0= ruleEPackage ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:713:1: (lv_eSubpackages_24_0= ruleEPackage )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:713:1: (lv_eSubpackages_24_0= ruleEPackage )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:714:3: lv_eSubpackages_24_0= ruleEPackage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEPackageAccess().getESubpackagesEPackageParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEPackage_in_ruleEPackage1469);
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
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEPackage1483); 

                        	newLeafNode(otherlv_25, grammarAccess.getEPackageAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_26=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEPackage1497); 

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


    // $ANTLR start "entryRuleEntityGenerator2"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:746:1: entryRuleEntityGenerator2 returns [EObject current=null] : iv_ruleEntityGenerator2= ruleEntityGenerator2 EOF ;
    public final EObject entryRuleEntityGenerator2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityGenerator2 = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:747:2: (iv_ruleEntityGenerator2= ruleEntityGenerator2 EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:748:2: iv_ruleEntityGenerator2= ruleEntityGenerator2 EOF
            {
             newCompositeNode(grammarAccess.getEntityGenerator2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntityGenerator2_in_entryRuleEntityGenerator21533);
            iv_ruleEntityGenerator2=ruleEntityGenerator2();

            state._fsp--;

             current =iv_ruleEntityGenerator2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntityGenerator21543); 

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
    // $ANTLR end "entryRuleEntityGenerator2"


    // $ANTLR start "ruleEntityGenerator2"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:755:1: ruleEntityGenerator2 returns [EObject current=null] : ( () ( (lv_number_1_0= ruleEInt ) ) ( (lv_entityName_2_0= ruleEString ) ) ) ;
    public final EObject ruleEntityGenerator2() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_number_1_0 = null;

        AntlrDatatypeRuleToken lv_entityName_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:758:28: ( ( () ( (lv_number_1_0= ruleEInt ) ) ( (lv_entityName_2_0= ruleEString ) ) ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:759:1: ( () ( (lv_number_1_0= ruleEInt ) ) ( (lv_entityName_2_0= ruleEString ) ) )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:759:1: ( () ( (lv_number_1_0= ruleEInt ) ) ( (lv_entityName_2_0= ruleEString ) ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:759:2: () ( (lv_number_1_0= ruleEInt ) ) ( (lv_entityName_2_0= ruleEString ) )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:759:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:760:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntityGenerator2Access().getEntityGeneratorAction_0(),
                        current);
                

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:765:2: ( (lv_number_1_0= ruleEInt ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:766:1: (lv_number_1_0= ruleEInt )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:766:1: (lv_number_1_0= ruleEInt )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:767:3: lv_number_1_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getEntityGenerator2Access().getNumberEIntParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEntityGenerator21598);
            lv_number_1_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityGenerator2Rule());
            	        }
                   		set(
                   			current, 
                   			"number",
                    		lv_number_1_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:783:2: ( (lv_entityName_2_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:784:1: (lv_entityName_2_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:784:1: (lv_entityName_2_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:785:3: lv_entityName_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEntityGenerator2Access().getEntityNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEntityGenerator21619);
            lv_entityName_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityGenerator2Rule());
            	        }
                   		set(
                   			current, 
                   			"entityName",
                    		lv_entityName_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleEntityGenerator2"


    // $ANTLR start "entryRuleFieldGenerator2"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:811:1: entryRuleFieldGenerator2 returns [EObject current=null] : iv_ruleFieldGenerator2= ruleFieldGenerator2 EOF ;
    public final EObject entryRuleFieldGenerator2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldGenerator2 = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:812:2: (iv_ruleFieldGenerator2= ruleFieldGenerator2 EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:813:2: iv_ruleFieldGenerator2= ruleFieldGenerator2 EOF
            {
             newCompositeNode(grammarAccess.getFieldGenerator2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFieldGenerator2_in_entryRuleFieldGenerator21657);
            iv_ruleFieldGenerator2=ruleFieldGenerator2();

            state._fsp--;

             current =iv_ruleFieldGenerator2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFieldGenerator21667); 

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
    // $ANTLR end "entryRuleFieldGenerator2"


    // $ANTLR start "ruleFieldGenerator2"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:820:1: ruleFieldGenerator2 returns [EObject current=null] : (otherlv_0= 'forField' ( (lv_entityName_1_0= ruleEString ) ) otherlv_2= '.' ( (lv_fieldName_3_0= ruleEString ) ) otherlv_4= 'use' ( (lv_generatorName_5_0= ruleEString ) ) (otherlv_6= 'with errorRate=' ( (lv_errorRate_7_0= ruleEInt ) ) otherlv_8= '% generated with ' ( (lv_errorGeneratorName_9_0= ruleEString ) ) )? ) ;
    public final EObject ruleFieldGenerator2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_entityName_1_0 = null;

        AntlrDatatypeRuleToken lv_fieldName_3_0 = null;

        AntlrDatatypeRuleToken lv_generatorName_5_0 = null;

        AntlrDatatypeRuleToken lv_errorRate_7_0 = null;

        AntlrDatatypeRuleToken lv_errorGeneratorName_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:823:28: ( (otherlv_0= 'forField' ( (lv_entityName_1_0= ruleEString ) ) otherlv_2= '.' ( (lv_fieldName_3_0= ruleEString ) ) otherlv_4= 'use' ( (lv_generatorName_5_0= ruleEString ) ) (otherlv_6= 'with errorRate=' ( (lv_errorRate_7_0= ruleEInt ) ) otherlv_8= '% generated with ' ( (lv_errorGeneratorName_9_0= ruleEString ) ) )? ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:824:1: (otherlv_0= 'forField' ( (lv_entityName_1_0= ruleEString ) ) otherlv_2= '.' ( (lv_fieldName_3_0= ruleEString ) ) otherlv_4= 'use' ( (lv_generatorName_5_0= ruleEString ) ) (otherlv_6= 'with errorRate=' ( (lv_errorRate_7_0= ruleEInt ) ) otherlv_8= '% generated with ' ( (lv_errorGeneratorName_9_0= ruleEString ) ) )? )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:824:1: (otherlv_0= 'forField' ( (lv_entityName_1_0= ruleEString ) ) otherlv_2= '.' ( (lv_fieldName_3_0= ruleEString ) ) otherlv_4= 'use' ( (lv_generatorName_5_0= ruleEString ) ) (otherlv_6= 'with errorRate=' ( (lv_errorRate_7_0= ruleEInt ) ) otherlv_8= '% generated with ' ( (lv_errorGeneratorName_9_0= ruleEString ) ) )? )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:824:3: otherlv_0= 'forField' ( (lv_entityName_1_0= ruleEString ) ) otherlv_2= '.' ( (lv_fieldName_3_0= ruleEString ) ) otherlv_4= 'use' ( (lv_generatorName_5_0= ruleEString ) ) (otherlv_6= 'with errorRate=' ( (lv_errorRate_7_0= ruleEInt ) ) otherlv_8= '% generated with ' ( (lv_errorGeneratorName_9_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleFieldGenerator21704); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldGenerator2Access().getForFieldKeyword_0());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:828:1: ( (lv_entityName_1_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:829:1: (lv_entityName_1_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:829:1: (lv_entityName_1_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:830:3: lv_entityName_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFieldGenerator2Access().getEntityNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFieldGenerator21725);
            lv_entityName_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldGenerator2Rule());
            	        }
                   		set(
                   			current, 
                   			"entityName",
                    		lv_entityName_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFieldGenerator21737); 

                	newLeafNode(otherlv_2, grammarAccess.getFieldGenerator2Access().getFullStopKeyword_2());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:850:1: ( (lv_fieldName_3_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:851:1: (lv_fieldName_3_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:851:1: (lv_fieldName_3_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:852:3: lv_fieldName_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFieldGenerator2Access().getFieldNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFieldGenerator21758);
            lv_fieldName_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldGenerator2Rule());
            	        }
                   		set(
                   			current, 
                   			"fieldName",
                    		lv_fieldName_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFieldGenerator21770); 

                	newLeafNode(otherlv_4, grammarAccess.getFieldGenerator2Access().getUseKeyword_4());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:872:1: ( (lv_generatorName_5_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:873:1: (lv_generatorName_5_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:873:1: (lv_generatorName_5_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:874:3: lv_generatorName_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFieldGenerator2Access().getGeneratorNameEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFieldGenerator21791);
            lv_generatorName_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldGenerator2Rule());
            	        }
                   		set(
                   			current, 
                   			"generatorName",
                    		lv_generatorName_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:890:2: (otherlv_6= 'with errorRate=' ( (lv_errorRate_7_0= ruleEInt ) ) otherlv_8= '% generated with ' ( (lv_errorGeneratorName_9_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:890:4: otherlv_6= 'with errorRate=' ( (lv_errorRate_7_0= ruleEInt ) ) otherlv_8= '% generated with ' ( (lv_errorGeneratorName_9_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFieldGenerator21804); 

                        	newLeafNode(otherlv_6, grammarAccess.getFieldGenerator2Access().getWithErrorRateKeyword_6_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:894:1: ( (lv_errorRate_7_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:895:1: (lv_errorRate_7_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:895:1: (lv_errorRate_7_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:896:3: lv_errorRate_7_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldGenerator2Access().getErrorRateEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleFieldGenerator21825);
                    lv_errorRate_7_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldGenerator2Rule());
                    	        }
                           		set(
                           			current, 
                           			"errorRate",
                            		lv_errorRate_7_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleFieldGenerator21837); 

                        	newLeafNode(otherlv_8, grammarAccess.getFieldGenerator2Access().getGeneratedWithKeyword_6_2());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:916:1: ( (lv_errorGeneratorName_9_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:917:1: (lv_errorGeneratorName_9_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:917:1: (lv_errorGeneratorName_9_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:918:3: lv_errorGeneratorName_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldGenerator2Access().getErrorGeneratorNameEStringParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFieldGenerator21858);
                    lv_errorGeneratorName_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldGenerator2Rule());
                    	        }
                           		set(
                           			current, 
                           			"errorGeneratorName",
                            		lv_errorGeneratorName_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleFieldGenerator2"


    // $ANTLR start "entryRuleEClass"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:944:1: entryRuleEClass returns [EObject current=null] : iv_ruleEClass= ruleEClass EOF ;
    public final EObject entryRuleEClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClass = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:945:2: (iv_ruleEClass= ruleEClass EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:946:2: iv_ruleEClass= ruleEClass EOF
            {
             newCompositeNode(grammarAccess.getEClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEClass_in_entryRuleEClass1898);
            iv_ruleEClass=ruleEClass();

            state._fsp--;

             current =iv_ruleEClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEClass1908); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:953:1: ruleEClass returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:956:28: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:957:1: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:957:1: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:957:2: () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:957:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:958:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEClassAccess().getEClassAction_0(),
                        current);
                

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:963:2: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:964:1: (lv_abstract_1_0= 'abstract' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:964:1: (lv_abstract_1_0= 'abstract' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:965:3: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEClass1960); 

                            newLeafNode(lv_abstract_1_0, grammarAccess.getEClassAccess().getAbstractAbstractKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEClassRule());
                    	        }
                           		setWithLastConsumed(current, "abstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:978:3: ( (lv_interface_2_0= 'interface' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:979:1: (lv_interface_2_0= 'interface' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:979:1: (lv_interface_2_0= 'interface' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:980:3: lv_interface_2_0= 'interface'
                    {
                    lv_interface_2_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEClass1992); 

                            newLeafNode(lv_interface_2_0, grammarAccess.getEClassAccess().getInterfaceInterfaceKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEClassRule());
                    	        }
                           		setWithLastConsumed(current, "interface", true, "interface");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEClass2018); 

                	newLeafNode(otherlv_3, grammarAccess.getEClassAccess().getEClassKeyword_3());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:997:1: ( (lv_name_4_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:998:1: (lv_name_4_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:998:1: (lv_name_4_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:999:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEClassAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEClass2039);
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

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEClass2051); 

                	newLeafNode(otherlv_5, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_5());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1019:1: (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1019:3: otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEClass2064); 

                        	newLeafNode(otherlv_6, grammarAccess.getEClassAccess().getInstanceClassNameKeyword_6_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1023:1: ( (lv_instanceClassName_7_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1024:1: (lv_instanceClassName_7_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1024:1: (lv_instanceClassName_7_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1025:3: lv_instanceClassName_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getInstanceClassNameEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEClass2085);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1041:4: (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1041:6: otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEClass2100); 

                        	newLeafNode(otherlv_8, grammarAccess.getEClassAccess().getInstanceTypeNameKeyword_7_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1045:1: ( (lv_instanceTypeName_9_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1046:1: (lv_instanceTypeName_9_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1046:1: (lv_instanceTypeName_9_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1047:3: lv_instanceTypeName_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getInstanceTypeNameEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEClass2121);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1063:4: (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1063:6: otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEClass2136); 

                        	newLeafNode(otherlv_10, grammarAccess.getEClassAccess().getESuperTypesKeyword_8_0());
                        
                    otherlv_11=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleEClass2148); 

                        	newLeafNode(otherlv_11, grammarAccess.getEClassAccess().getLeftParenthesisKeyword_8_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1071:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1072:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1072:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1073:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEClassRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEClass2171);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1086:2: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==17) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1086:4: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEClass2184); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getEClassAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1090:1: ( ( ruleEString ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1091:1: ( ruleEString )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1091:1: ( ruleEString )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1092:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEClassRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEClass2207);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleEClass2221); 

                        	newLeafNode(otherlv_15, grammarAccess.getEClassAccess().getRightParenthesisKeyword_8_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1109:3: (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1109:5: otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEClass2236); 

                        	newLeafNode(otherlv_16, grammarAccess.getEClassAccess().getEAnnotationsKeyword_9_0());
                        
                    otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEClass2248); 

                        	newLeafNode(otherlv_17, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1117:1: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1118:1: (lv_eAnnotations_18_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1118:1: (lv_eAnnotations_18_0= ruleEAnnotation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1119:3: lv_eAnnotations_18_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getEAnnotationsEAnnotationParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEClass2269);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1135:2: (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==17) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1135:4: otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEClass2282); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getEClassAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1139:1: ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1140:1: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1140:1: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1141:3: lv_eAnnotations_20_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEClassAccess().getEAnnotationsEAnnotationParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEClass2303);
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
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEClass2317); 

                        	newLeafNode(otherlv_21, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1161:3: (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1161:5: otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleEClass2332); 

                        	newLeafNode(otherlv_22, grammarAccess.getEClassAccess().getETypeParametersKeyword_10_0());
                        
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEClass2344); 

                        	newLeafNode(otherlv_23, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1169:1: ( (lv_eTypeParameters_24_0= ruleETypeParameter ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1170:1: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1170:1: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1171:3: lv_eTypeParameters_24_0= ruleETypeParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getETypeParametersETypeParameterParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEClass2365);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1187:2: (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==17) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1187:4: otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_25=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEClass2378); 

                    	        	newLeafNode(otherlv_25, grammarAccess.getEClassAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1191:1: ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1192:1: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1192:1: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1193:3: lv_eTypeParameters_26_0= ruleETypeParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEClassAccess().getETypeParametersETypeParameterParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEClass2399);
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
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEClass2413); 

                        	newLeafNode(otherlv_27, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1213:3: (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1213:5: otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleEClass2428); 

                        	newLeafNode(otherlv_28, grammarAccess.getEClassAccess().getEOperationsKeyword_11_0());
                        
                    otherlv_29=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEClass2440); 

                        	newLeafNode(otherlv_29, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1221:1: ( (lv_eOperations_30_0= ruleEOperation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1222:1: (lv_eOperations_30_0= ruleEOperation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1222:1: (lv_eOperations_30_0= ruleEOperation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1223:3: lv_eOperations_30_0= ruleEOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getEOperationsEOperationParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEOperation_in_ruleEClass2461);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1239:2: (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==17) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1239:4: otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    {
                    	    otherlv_31=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEClass2474); 

                    	        	newLeafNode(otherlv_31, grammarAccess.getEClassAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1243:1: ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1244:1: (lv_eOperations_32_0= ruleEOperation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1244:1: (lv_eOperations_32_0= ruleEOperation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1245:3: lv_eOperations_32_0= ruleEOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEClassAccess().getEOperationsEOperationParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEOperation_in_ruleEClass2495);
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
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEClass2509); 

                        	newLeafNode(otherlv_33, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_11_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1265:3: (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1265:5: otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEClass2524); 

                        	newLeafNode(otherlv_34, grammarAccess.getEClassAccess().getEStructuralFeaturesKeyword_12_0());
                        
                    otherlv_35=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEClass2536); 

                        	newLeafNode(otherlv_35, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_12_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1273:1: ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1274:1: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1274:1: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1275:3: lv_eStructuralFeatures_36_0= ruleEStructuralFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getEStructuralFeaturesEStructuralFeatureParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEStructuralFeature_in_ruleEClass2557);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1291:2: (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==17) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1291:4: otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    {
                    	    otherlv_37=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEClass2570); 

                    	        	newLeafNode(otherlv_37, grammarAccess.getEClassAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1295:1: ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1296:1: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1296:1: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1297:3: lv_eStructuralFeatures_38_0= ruleEStructuralFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEClassAccess().getEStructuralFeaturesEStructuralFeatureParserRuleCall_12_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEStructuralFeature_in_ruleEClass2591);
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
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEClass2605); 

                        	newLeafNode(otherlv_39, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_12_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1317:3: (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1317:5: otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEClass2620); 

                        	newLeafNode(otherlv_40, grammarAccess.getEClassAccess().getEGenericSuperTypesKeyword_13_0());
                        
                    otherlv_41=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEClass2632); 

                        	newLeafNode(otherlv_41, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_13_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1325:1: ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1326:1: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1326:1: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1327:3: lv_eGenericSuperTypes_42_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getEGenericSuperTypesEGenericTypeParserRuleCall_13_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEClass2653);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1343:2: (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==17) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1343:4: otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEClass2666); 

                    	        	newLeafNode(otherlv_43, grammarAccess.getEClassAccess().getCommaKeyword_13_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1347:1: ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1348:1: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1348:1: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1349:3: lv_eGenericSuperTypes_44_0= ruleEGenericType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEClassAccess().getEGenericSuperTypesEGenericTypeParserRuleCall_13_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEClass2687);
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
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEClass2701); 

                        	newLeafNode(otherlv_45, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_13_4());
                        

                    }
                    break;

            }

            otherlv_46=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEClass2715); 

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


    // $ANTLR start "entryRuleEAnnotation"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1381:1: entryRuleEAnnotation returns [EObject current=null] : iv_ruleEAnnotation= ruleEAnnotation EOF ;
    public final EObject entryRuleEAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAnnotation = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1382:2: (iv_ruleEAnnotation= ruleEAnnotation EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1383:2: iv_ruleEAnnotation= ruleEAnnotation EOF
            {
             newCompositeNode(grammarAccess.getEAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_entryRuleEAnnotation2751);
            iv_ruleEAnnotation=ruleEAnnotation();

            state._fsp--;

             current =iv_ruleEAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEAnnotation2761); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1390:1: ruleEAnnotation returns [EObject current=null] : ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1393:28: ( ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1394:1: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1394:1: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1394:2: () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1394:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1395:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEAnnotationAccess().getEAnnotationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEAnnotation2807); 

                	newLeafNode(otherlv_1, grammarAccess.getEAnnotationAccess().getEAnnotationKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEAnnotation2819); 

                	newLeafNode(otherlv_2, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1408:1: (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==45) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1408:3: otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEAnnotation2832); 

                        	newLeafNode(otherlv_3, grammarAccess.getEAnnotationAccess().getSourceKeyword_3_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1412:1: ( (lv_source_4_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1413:1: (lv_source_4_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1413:1: (lv_source_4_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1414:3: lv_source_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getSourceEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEAnnotation2853);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1430:4: (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==46) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1430:6: otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEAnnotation2868); 

                        	newLeafNode(otherlv_5, grammarAccess.getEAnnotationAccess().getReferencesKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleEAnnotation2880); 

                        	newLeafNode(otherlv_6, grammarAccess.getEAnnotationAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1438:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1439:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1439:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1440:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAnnotationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEAnnotation2903);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1453:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==17) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1453:4: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEAnnotation2916); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getEAnnotationAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1457:1: ( ( ruleEString ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1458:1: ( ruleEString )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1458:1: ( ruleEString )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1459:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEAnnotationRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEAnnotation2939);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleEAnnotation2953); 

                        	newLeafNode(otherlv_10, grammarAccess.getEAnnotationAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1476:3: (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==24) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1476:5: otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEAnnotation2968); 

                        	newLeafNode(otherlv_11, grammarAccess.getEAnnotationAccess().getEAnnotationsKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEAnnotation2980); 

                        	newLeafNode(otherlv_12, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1484:1: ( (lv_eAnnotations_13_0= ruleEAnnotation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1485:1: (lv_eAnnotations_13_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1485:1: (lv_eAnnotations_13_0= ruleEAnnotation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1486:3: lv_eAnnotations_13_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getEAnnotationsEAnnotationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEAnnotation3001);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1502:2: (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==17) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1502:4: otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEAnnotation3014); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getEAnnotationAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1506:1: ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1507:1: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1507:1: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1508:3: lv_eAnnotations_15_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getEAnnotationsEAnnotationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEAnnotation3035);
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
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEAnnotation3049); 

                        	newLeafNode(otherlv_16, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1528:3: (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==47) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1528:5: otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEAnnotation3064); 

                        	newLeafNode(otherlv_17, grammarAccess.getEAnnotationAccess().getDetailsKeyword_6_0());
                        
                    otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEAnnotation3076); 

                        	newLeafNode(otherlv_18, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1536:1: ( (lv_details_19_0= ruleEStringToStringMapEntry ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1537:1: (lv_details_19_0= ruleEStringToStringMapEntry )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1537:1: (lv_details_19_0= ruleEStringToStringMapEntry )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1538:3: lv_details_19_0= ruleEStringToStringMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getDetailsEStringToStringMapEntryParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEStringToStringMapEntry_in_ruleEAnnotation3097);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1554:2: (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==17) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1554:4: otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    {
                    	    otherlv_20=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEAnnotation3110); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getEAnnotationAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1558:1: ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1559:1: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1559:1: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1560:3: lv_details_21_0= ruleEStringToStringMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getDetailsEStringToStringMapEntryParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEStringToStringMapEntry_in_ruleEAnnotation3131);
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
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEAnnotation3145); 

                        	newLeafNode(otherlv_22, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1580:3: (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==48) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1580:5: otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEAnnotation3160); 

                        	newLeafNode(otherlv_23, grammarAccess.getEAnnotationAccess().getContentsKeyword_7_0());
                        
                    otherlv_24=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEAnnotation3172); 

                        	newLeafNode(otherlv_24, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1588:1: ( (lv_contents_25_0= ruleEObject ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1589:1: (lv_contents_25_0= ruleEObject )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1589:1: (lv_contents_25_0= ruleEObject )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1590:3: lv_contents_25_0= ruleEObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getContentsEObjectParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEObject_in_ruleEAnnotation3193);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1606:2: (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==17) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1606:4: otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) )
                    	    {
                    	    otherlv_26=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEAnnotation3206); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getEAnnotationAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1610:1: ( (lv_contents_27_0= ruleEObject ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1611:1: (lv_contents_27_0= ruleEObject )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1611:1: (lv_contents_27_0= ruleEObject )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1612:3: lv_contents_27_0= ruleEObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getContentsEObjectParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEObject_in_ruleEAnnotation3227);
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
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEAnnotation3241); 

                        	newLeafNode(otherlv_28, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_29=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEAnnotation3255); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1644:1: entryRuleEStringToStringMapEntry returns [EObject current=null] : iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF ;
    public final EObject entryRuleEStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStringToStringMapEntry = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1645:2: (iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1646:2: iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF
            {
             newCompositeNode(grammarAccess.getEStringToStringMapEntryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEStringToStringMapEntry_in_entryRuleEStringToStringMapEntry3291);
            iv_ruleEStringToStringMapEntry=ruleEStringToStringMapEntry();

            state._fsp--;

             current =iv_ruleEStringToStringMapEntry; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEStringToStringMapEntry3301); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1653:1: ruleEStringToStringMapEntry returns [EObject current=null] : ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1656:28: ( ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1657:1: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1657:1: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1657:2: () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1657:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1658:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleEStringToStringMapEntry3347); 

                	newLeafNode(otherlv_1, grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEStringToStringMapEntry3359); 

                	newLeafNode(otherlv_2, grammarAccess.getEStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1671:1: (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==50) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1671:3: otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEStringToStringMapEntry3372); 

                        	newLeafNode(otherlv_3, grammarAccess.getEStringToStringMapEntryAccess().getKeyKeyword_3_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1675:1: ( (lv_key_4_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1676:1: (lv_key_4_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1676:1: (lv_key_4_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1677:3: lv_key_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEStringToStringMapEntry3393);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1693:4: (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==51) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1693:6: otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleEStringToStringMapEntry3408); 

                        	newLeafNode(otherlv_5, grammarAccess.getEStringToStringMapEntryAccess().getValueKeyword_4_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1697:1: ( (lv_value_6_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1698:1: (lv_value_6_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1698:1: (lv_value_6_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1699:3: lv_value_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEStringToStringMapEntryAccess().getValueEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEStringToStringMapEntry3429);
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

            otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEStringToStringMapEntry3443); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1727:1: entryRuleEObject returns [EObject current=null] : iv_ruleEObject= ruleEObject EOF ;
    public final EObject entryRuleEObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObject = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1728:2: (iv_ruleEObject= ruleEObject EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1729:2: iv_ruleEObject= ruleEObject EOF
            {
             newCompositeNode(grammarAccess.getEObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEObject_in_entryRuleEObject3479);
            iv_ruleEObject=ruleEObject();

            state._fsp--;

             current =iv_ruleEObject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEObject3489); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1736:1: ruleEObject returns [EObject current=null] : ( () otherlv_1= 'EObject' ) ;
    public final EObject ruleEObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1739:28: ( ( () otherlv_1= 'EObject' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1740:1: ( () otherlv_1= 'EObject' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1740:1: ( () otherlv_1= 'EObject' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1740:2: () otherlv_1= 'EObject'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1740:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1741:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEObjectAccess().getEObjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleEObject3535); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1758:1: entryRuleETypeParameter returns [EObject current=null] : iv_ruleETypeParameter= ruleETypeParameter EOF ;
    public final EObject entryRuleETypeParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETypeParameter = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1759:2: (iv_ruleETypeParameter= ruleETypeParameter EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1760:2: iv_ruleETypeParameter= ruleETypeParameter EOF
            {
             newCompositeNode(grammarAccess.getETypeParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_entryRuleETypeParameter3571);
            iv_ruleETypeParameter=ruleETypeParameter();

            state._fsp--;

             current =iv_ruleETypeParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleETypeParameter3581); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1767:1: ruleETypeParameter returns [EObject current=null] : ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1770:28: ( ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1771:1: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1771:1: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1771:2: () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1771:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1772:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getETypeParameterAccess().getETypeParameterAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleETypeParameter3627); 

                	newLeafNode(otherlv_1, grammarAccess.getETypeParameterAccess().getETypeParameterKeyword_1());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1781:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1782:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1782:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1783:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getETypeParameterAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleETypeParameter3648);
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

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleETypeParameter3660); 

                	newLeafNode(otherlv_3, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1803:1: (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==24) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1803:3: otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleETypeParameter3673); 

                        	newLeafNode(otherlv_4, grammarAccess.getETypeParameterAccess().getEAnnotationsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleETypeParameter3685); 

                        	newLeafNode(otherlv_5, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1811:1: ( (lv_eAnnotations_6_0= ruleEAnnotation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1812:1: (lv_eAnnotations_6_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1812:1: (lv_eAnnotations_6_0= ruleEAnnotation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1813:3: lv_eAnnotations_6_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getETypeParameterAccess().getEAnnotationsEAnnotationParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleETypeParameter3706);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1829:2: (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==17) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1829:4: otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleETypeParameter3719); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getETypeParameterAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1833:1: ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1834:1: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1834:1: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1835:3: lv_eAnnotations_8_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getETypeParameterAccess().getEAnnotationsEAnnotationParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleETypeParameter3740);
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
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleETypeParameter3754); 

                        	newLeafNode(otherlv_9, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1855:3: (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==54) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1855:5: otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleETypeParameter3769); 

                        	newLeafNode(otherlv_10, grammarAccess.getETypeParameterAccess().getEBoundsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleETypeParameter3781); 

                        	newLeafNode(otherlv_11, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1863:1: ( (lv_eBounds_12_0= ruleEGenericType ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1864:1: (lv_eBounds_12_0= ruleEGenericType )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1864:1: (lv_eBounds_12_0= ruleEGenericType )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1865:3: lv_eBounds_12_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getETypeParameterAccess().getEBoundsEGenericTypeParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleETypeParameter3802);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1881:2: (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==17) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1881:4: otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleETypeParameter3815); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getETypeParameterAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1885:1: ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1886:1: (lv_eBounds_14_0= ruleEGenericType )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1886:1: (lv_eBounds_14_0= ruleEGenericType )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1887:3: lv_eBounds_14_0= ruleEGenericType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getETypeParameterAccess().getEBoundsEGenericTypeParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleETypeParameter3836);
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
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleETypeParameter3850); 

                        	newLeafNode(otherlv_15, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleETypeParameter3864); 

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


    // $ANTLR start "entryRuleEDataType_Impl"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1919:1: entryRuleEDataType_Impl returns [EObject current=null] : iv_ruleEDataType_Impl= ruleEDataType_Impl EOF ;
    public final EObject entryRuleEDataType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataType_Impl = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1920:2: (iv_ruleEDataType_Impl= ruleEDataType_Impl EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1921:2: iv_ruleEDataType_Impl= ruleEDataType_Impl EOF
            {
             newCompositeNode(grammarAccess.getEDataType_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDataType_Impl_in_entryRuleEDataType_Impl3900);
            iv_ruleEDataType_Impl=ruleEDataType_Impl();

            state._fsp--;

             current =iv_ruleEDataType_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDataType_Impl3910); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1928:1: ruleEDataType_Impl returns [EObject current=null] : ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1931:28: ( ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1932:1: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1932:1: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1932:2: () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1932:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1933:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEDataType_ImplAccess().getEDataTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleEDataType_Impl3956); 

                	newLeafNode(otherlv_1, grammarAccess.getEDataType_ImplAccess().getEDataTypeKeyword_1());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1942:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1943:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1943:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1944:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEDataType_Impl3977);
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

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEDataType_Impl3989); 

                	newLeafNode(otherlv_3, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1964:1: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==35) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1964:3: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEDataType_Impl4002); 

                        	newLeafNode(otherlv_4, grammarAccess.getEDataType_ImplAccess().getInstanceClassNameKeyword_4_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1968:1: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1969:1: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1969:1: (lv_instanceClassName_5_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1970:3: lv_instanceClassName_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceClassNameEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEDataType_Impl4023);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1986:4: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==36) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1986:6: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEDataType_Impl4038); 

                        	newLeafNode(otherlv_6, grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameKeyword_5_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1990:1: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1991:1: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1991:1: (lv_instanceTypeName_7_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1992:3: lv_instanceTypeName_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEDataType_Impl4059);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2008:4: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==56) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2008:6: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleEDataType_Impl4074); 

                        	newLeafNode(otherlv_8, grammarAccess.getEDataType_ImplAccess().getSerializableKeyword_6_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2012:1: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2013:1: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2013:1: (lv_serializable_9_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2014:3: lv_serializable_9_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getSerializableEBooleanParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEDataType_Impl4095);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2030:4: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==24) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2030:6: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEDataType_Impl4110); 

                        	newLeafNode(otherlv_10, grammarAccess.getEDataType_ImplAccess().getEAnnotationsKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEDataType_Impl4122); 

                        	newLeafNode(otherlv_11, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2038:1: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2039:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2039:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2040:3: lv_eAnnotations_12_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getEAnnotationsEAnnotationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEDataType_Impl4143);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2056:2: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==17) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2056:4: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEDataType_Impl4156); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2060:1: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2061:1: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2061:1: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2062:3: lv_eAnnotations_14_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getEAnnotationsEAnnotationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEDataType_Impl4177);
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
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEDataType_Impl4191); 

                        	newLeafNode(otherlv_15, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2082:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==40) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2082:5: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleEDataType_Impl4206); 

                        	newLeafNode(otherlv_16, grammarAccess.getEDataType_ImplAccess().getETypeParametersKeyword_8_0());
                        
                    otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEDataType_Impl4218); 

                        	newLeafNode(otherlv_17, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2090:1: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2091:1: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2091:1: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2092:3: lv_eTypeParameters_18_0= ruleETypeParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getETypeParametersETypeParameterParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEDataType_Impl4239);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2108:2: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==17) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2108:4: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEDataType_Impl4252); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2112:1: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2113:1: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2113:1: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2114:3: lv_eTypeParameters_20_0= ruleETypeParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getETypeParametersETypeParameterParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEDataType_Impl4273);
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
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEDataType_Impl4287); 

                        	newLeafNode(otherlv_21, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_22=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEDataType_Impl4301); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2146:1: entryRuleEEnum returns [EObject current=null] : iv_ruleEEnum= ruleEEnum EOF ;
    public final EObject entryRuleEEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnum = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2147:2: (iv_ruleEEnum= ruleEEnum EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2148:2: iv_ruleEEnum= ruleEEnum EOF
            {
             newCompositeNode(grammarAccess.getEEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEEnum_in_entryRuleEEnum4337);
            iv_ruleEEnum=ruleEEnum();

            state._fsp--;

             current =iv_ruleEEnum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEEnum4347); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2155:1: ruleEEnum returns [EObject current=null] : ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2158:28: ( ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2159:1: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2159:1: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2159:2: () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2159:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2160:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEEnumAccess().getEEnumAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleEEnum4393); 

                	newLeafNode(otherlv_1, grammarAccess.getEEnumAccess().getEEnumKeyword_1());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2169:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2170:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2170:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2171:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEEnumAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEEnum4414);
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

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEEnum4426); 

                	newLeafNode(otherlv_3, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2191:1: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==35) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2191:3: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEEnum4439); 

                        	newLeafNode(otherlv_4, grammarAccess.getEEnumAccess().getInstanceClassNameKeyword_4_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2195:1: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2196:1: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2196:1: (lv_instanceClassName_5_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2197:3: lv_instanceClassName_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumAccess().getInstanceClassNameEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEEnum4460);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2213:4: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==36) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2213:6: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEEnum4475); 

                        	newLeafNode(otherlv_6, grammarAccess.getEEnumAccess().getInstanceTypeNameKeyword_5_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2217:1: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2218:1: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2218:1: (lv_instanceTypeName_7_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2219:3: lv_instanceTypeName_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEEnum4496);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2235:4: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==56) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2235:6: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleEEnum4511); 

                        	newLeafNode(otherlv_8, grammarAccess.getEEnumAccess().getSerializableKeyword_6_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2239:1: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2240:1: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2240:1: (lv_serializable_9_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2241:3: lv_serializable_9_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumAccess().getSerializableEBooleanParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEEnum4532);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2257:4: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==24) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2257:6: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEEnum4547); 

                        	newLeafNode(otherlv_10, grammarAccess.getEEnumAccess().getEAnnotationsKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEEnum4559); 

                        	newLeafNode(otherlv_11, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2265:1: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2266:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2266:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2267:3: lv_eAnnotations_12_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumAccess().getEAnnotationsEAnnotationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEEnum4580);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2283:2: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==17) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2283:4: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEEnum4593); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getEEnumAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2287:1: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2288:1: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2288:1: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2289:3: lv_eAnnotations_14_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEEnumAccess().getEAnnotationsEAnnotationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEEnum4614);
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
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEEnum4628); 

                        	newLeafNode(otherlv_15, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2309:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==40) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2309:5: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleEEnum4643); 

                        	newLeafNode(otherlv_16, grammarAccess.getEEnumAccess().getETypeParametersKeyword_8_0());
                        
                    otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEEnum4655); 

                        	newLeafNode(otherlv_17, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2317:1: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2318:1: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2318:1: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2319:3: lv_eTypeParameters_18_0= ruleETypeParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumAccess().getETypeParametersETypeParameterParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEEnum4676);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2335:2: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==17) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2335:4: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEEnum4689); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getEEnumAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2339:1: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2340:1: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2340:1: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2341:3: lv_eTypeParameters_20_0= ruleETypeParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEEnumAccess().getETypeParametersETypeParameterParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEEnum4710);
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
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEEnum4724); 

                        	newLeafNode(otherlv_21, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2361:3: (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==58) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2361:5: otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleEEnum4739); 

                        	newLeafNode(otherlv_22, grammarAccess.getEEnumAccess().getELiteralsKeyword_9_0());
                        
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEEnum4751); 

                        	newLeafNode(otherlv_23, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2369:1: ( (lv_eLiterals_24_0= ruleEEnumLiteral ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2370:1: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2370:1: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2371:3: lv_eLiterals_24_0= ruleEEnumLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumAccess().getELiteralsEEnumLiteralParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEEnumLiteral_in_ruleEEnum4772);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2387:2: (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==17) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2387:4: otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    {
                    	    otherlv_25=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEEnum4785); 

                    	        	newLeafNode(otherlv_25, grammarAccess.getEEnumAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2391:1: ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2392:1: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2392:1: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2393:3: lv_eLiterals_26_0= ruleEEnumLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEEnumAccess().getELiteralsEEnumLiteralParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEEnumLiteral_in_ruleEEnum4806);
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
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEEnum4820); 

                        	newLeafNode(otherlv_27, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_28=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEEnum4834); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2425:1: entryRuleEGenericType returns [EObject current=null] : iv_ruleEGenericType= ruleEGenericType EOF ;
    public final EObject entryRuleEGenericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGenericType = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2426:2: (iv_ruleEGenericType= ruleEGenericType EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2427:2: iv_ruleEGenericType= ruleEGenericType EOF
            {
             newCompositeNode(grammarAccess.getEGenericTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_entryRuleEGenericType4870);
            iv_ruleEGenericType=ruleEGenericType();

            state._fsp--;

             current =iv_ruleEGenericType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEGenericType4880); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2434:1: ruleEGenericType returns [EObject current=null] : ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2437:28: ( ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2438:1: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2438:1: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2438:2: () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2438:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2439:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEGenericTypeAccess().getEGenericTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleEGenericType4926); 

                	newLeafNode(otherlv_1, grammarAccess.getEGenericTypeAccess().getEGenericTypeKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEGenericType4938); 

                	newLeafNode(otherlv_2, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2452:1: (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==60) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2452:3: otherlv_3= 'eTypeParameter' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleEGenericType4951); 

                        	newLeafNode(otherlv_3, grammarAccess.getEGenericTypeAccess().getETypeParameterKeyword_3_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2456:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2457:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2457:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2458:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEGenericTypeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeParameterETypeParameterCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEGenericType4974);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2471:4: (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==61) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2471:6: otherlv_5= 'eClassifier' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleEGenericType4989); 

                        	newLeafNode(otherlv_5, grammarAccess.getEGenericTypeAccess().getEClassifierKeyword_4_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2475:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2476:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2476:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2477:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEGenericTypeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEGenericTypeAccess().getEClassifierEClassifierCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEGenericType5012);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2490:4: (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==62) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2490:6: otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    {
                    otherlv_7=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleEGenericType5027); 

                        	newLeafNode(otherlv_7, grammarAccess.getEGenericTypeAccess().getEUpperBoundKeyword_5_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2494:1: ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2495:1: (lv_eUpperBound_8_0= ruleEGenericType )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2495:1: (lv_eUpperBound_8_0= ruleEGenericType )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2496:3: lv_eUpperBound_8_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEGenericTypeAccess().getEUpperBoundEGenericTypeParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEGenericType5048);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2512:4: (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==63) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2512:6: otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleEGenericType5063); 

                        	newLeafNode(otherlv_9, grammarAccess.getEGenericTypeAccess().getETypeArgumentsKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEGenericType5075); 

                        	newLeafNode(otherlv_10, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2520:1: ( (lv_eTypeArguments_11_0= ruleEGenericType ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2521:1: (lv_eTypeArguments_11_0= ruleEGenericType )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2521:1: (lv_eTypeArguments_11_0= ruleEGenericType )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2522:3: lv_eTypeArguments_11_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeArgumentsEGenericTypeParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEGenericType5096);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2538:2: (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==17) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2538:4: otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEGenericType5109); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getEGenericTypeAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2542:1: ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2543:1: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2543:1: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2544:3: lv_eTypeArguments_13_0= ruleEGenericType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeArgumentsEGenericTypeParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEGenericType5130);
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
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEGenericType5144); 

                        	newLeafNode(otherlv_14, grammarAccess.getEGenericTypeAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2564:3: (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==64) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2564:5: otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    {
                    otherlv_15=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleEGenericType5159); 

                        	newLeafNode(otherlv_15, grammarAccess.getEGenericTypeAccess().getELowerBoundKeyword_7_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2568:1: ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2569:1: (lv_eLowerBound_16_0= ruleEGenericType )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2569:1: (lv_eLowerBound_16_0= ruleEGenericType )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2570:3: lv_eLowerBound_16_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEGenericTypeAccess().getELowerBoundEGenericTypeParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEGenericType5180);
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

            otherlv_17=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEGenericType5194); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2598:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2599:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2600:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean5231);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean5242); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2607:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2610:28: ( (kw= 'true' | kw= 'false' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2611:1: (kw= 'true' | kw= 'false' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2611:1: (kw= 'true' | kw= 'false' )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==65) ) {
                alt71=1;
            }
            else if ( (LA71_0==66) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2612:2: kw= 'true'
                    {
                    kw=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleEBoolean5280); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2619:2: kw= 'false'
                    {
                    kw=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleEBoolean5299); 

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


    // $ANTLR start "entryRuleEEnumLiteral"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2632:1: entryRuleEEnumLiteral returns [EObject current=null] : iv_ruleEEnumLiteral= ruleEEnumLiteral EOF ;
    public final EObject entryRuleEEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnumLiteral = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2633:2: (iv_ruleEEnumLiteral= ruleEEnumLiteral EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2634:2: iv_ruleEEnumLiteral= ruleEEnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getEEnumLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEEnumLiteral_in_entryRuleEEnumLiteral5339);
            iv_ruleEEnumLiteral=ruleEEnumLiteral();

            state._fsp--;

             current =iv_ruleEEnumLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEEnumLiteral5349); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2641:1: ruleEEnumLiteral returns [EObject current=null] : ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2644:28: ( ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2645:1: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2645:1: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2645:2: () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2645:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2646:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEEnumLiteralAccess().getEEnumLiteralAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleEEnumLiteral5395); 

                	newLeafNode(otherlv_1, grammarAccess.getEEnumLiteralAccess().getEEnumLiteralKeyword_1());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2655:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2656:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2656:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2657:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEEnumLiteralAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEEnumLiteral5416);
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

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEEnumLiteral5428); 

                	newLeafNode(otherlv_3, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2677:1: (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==51) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2677:3: otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleEEnumLiteral5441); 

                        	newLeafNode(otherlv_4, grammarAccess.getEEnumLiteralAccess().getValueKeyword_4_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2681:1: ( (lv_value_5_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2682:1: (lv_value_5_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2682:1: (lv_value_5_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2683:3: lv_value_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumLiteralAccess().getValueEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEEnumLiteral5462);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2699:4: (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==68) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2699:6: otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleEEnumLiteral5477); 

                        	newLeafNode(otherlv_6, grammarAccess.getEEnumLiteralAccess().getLiteralKeyword_5_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2703:1: ( (lv_literal_7_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2704:1: (lv_literal_7_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2704:1: (lv_literal_7_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2705:3: lv_literal_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumLiteralAccess().getLiteralEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEEnumLiteral5498);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2721:4: (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==24) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2721:6: otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEEnumLiteral5513); 

                        	newLeafNode(otherlv_8, grammarAccess.getEEnumLiteralAccess().getEAnnotationsKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEEnumLiteral5525); 

                        	newLeafNode(otherlv_9, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2729:1: ( (lv_eAnnotations_10_0= ruleEAnnotation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2730:1: (lv_eAnnotations_10_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2730:1: (lv_eAnnotations_10_0= ruleEAnnotation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2731:3: lv_eAnnotations_10_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumLiteralAccess().getEAnnotationsEAnnotationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEEnumLiteral5546);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2747:2: (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==17) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2747:4: otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEEnumLiteral5559); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getEEnumLiteralAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2751:1: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2752:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2752:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2753:3: lv_eAnnotations_12_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEEnumLiteralAccess().getEAnnotationsEAnnotationParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEEnumLiteral5580);
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
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEEnumLiteral5594); 

                        	newLeafNode(otherlv_13, grammarAccess.getEEnumLiteralAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEEnumLiteral5608); 

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


    // $ANTLR start "entryRuleELong"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2785:1: entryRuleELong returns [String current=null] : iv_ruleELong= ruleELong EOF ;
    public final String entryRuleELong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELong = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2786:2: (iv_ruleELong= ruleELong EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2787:2: iv_ruleELong= ruleELong EOF
            {
             newCompositeNode(grammarAccess.getELongRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleELong_in_entryRuleELong5645);
            iv_ruleELong=ruleELong();

            state._fsp--;

             current =iv_ruleELong.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleELong5656); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2794:1: ruleELong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleELong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2797:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2798:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2798:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2798:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2798:2: (kw= '-' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==20) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2799:2: kw= '-'
                    {
                    kw=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleELong5695); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleELong5712); 

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


    // $ANTLR start "entryRuleLocale"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2819:1: entryRuleLocale returns [String current=null] : iv_ruleLocale= ruleLocale EOF ;
    public final String entryRuleLocale() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLocale = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2820:2: (iv_ruleLocale= ruleLocale EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2821:2: iv_ruleLocale= ruleLocale EOF
            {
             newCompositeNode(grammarAccess.getLocaleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocale_in_entryRuleLocale5758);
            iv_ruleLocale=ruleLocale();

            state._fsp--;

             current =iv_ruleLocale.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocale5769); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2828:1: ruleLocale returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Locale' ;
    public final AntlrDatatypeRuleToken ruleLocale() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2831:28: (kw= 'Locale' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2833:2: kw= 'Locale'
            {
            kw=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleLocale5806); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2846:1: entryRuleReferenceGenerator returns [EObject current=null] : iv_ruleReferenceGenerator= ruleReferenceGenerator EOF ;
    public final EObject entryRuleReferenceGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceGenerator = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2847:2: (iv_ruleReferenceGenerator= ruleReferenceGenerator EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2848:2: iv_ruleReferenceGenerator= ruleReferenceGenerator EOF
            {
             newCompositeNode(grammarAccess.getReferenceGeneratorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReferenceGenerator_in_entryRuleReferenceGenerator5845);
            iv_ruleReferenceGenerator=ruleReferenceGenerator();

            state._fsp--;

             current =iv_ruleReferenceGenerator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReferenceGenerator5855); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2855:1: ruleReferenceGenerator returns [EObject current=null] : ( () otherlv_1= 'ReferenceGenerator' otherlv_2= '{' (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )? (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )? (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )? (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )? (otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) ) )? (otherlv_13= 'badValueGenerator' ( ( ruleEString ) ) )? otherlv_15= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2858:28: ( ( () otherlv_1= 'ReferenceGenerator' otherlv_2= '{' (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )? (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )? (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )? (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )? (otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) ) )? (otherlv_13= 'badValueGenerator' ( ( ruleEString ) ) )? otherlv_15= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2859:1: ( () otherlv_1= 'ReferenceGenerator' otherlv_2= '{' (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )? (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )? (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )? (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )? (otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) ) )? (otherlv_13= 'badValueGenerator' ( ( ruleEString ) ) )? otherlv_15= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2859:1: ( () otherlv_1= 'ReferenceGenerator' otherlv_2= '{' (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )? (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )? (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )? (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )? (otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) ) )? (otherlv_13= 'badValueGenerator' ( ( ruleEString ) ) )? otherlv_15= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2859:2: () otherlv_1= 'ReferenceGenerator' otherlv_2= '{' (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )? (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )? (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )? (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )? (otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) ) )? (otherlv_13= 'badValueGenerator' ( ( ruleEString ) ) )? otherlv_15= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2859:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2860:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReferenceGeneratorAccess().getReferenceGeneratorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleReferenceGenerator5901); 

                	newLeafNode(otherlv_1, grammarAccess.getReferenceGeneratorAccess().getReferenceGeneratorKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleReferenceGenerator5913); 

                	newLeafNode(otherlv_2, grammarAccess.getReferenceGeneratorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2873:1: (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==71) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2873:3: otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleReferenceGenerator5926); 

                        	newLeafNode(otherlv_3, grammarAccess.getReferenceGeneratorAccess().getBadValueProportionKeyword_3_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2877:1: ( (lv_badValueProportion_4_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2878:1: (lv_badValueProportion_4_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2878:1: (lv_badValueProportion_4_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2879:3: lv_badValueProportion_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferenceGeneratorAccess().getBadValueProportionEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleReferenceGenerator5947);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2895:4: (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==72) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2895:6: otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) )
                    {
                    otherlv_5=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleReferenceGenerator5962); 

                        	newLeafNode(otherlv_5, grammarAccess.getReferenceGeneratorAccess().getRandomSeedKeyword_4_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2899:1: ( (lv_randomSeed_6_0= ruleELong ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2900:1: (lv_randomSeed_6_0= ruleELong )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2900:1: (lv_randomSeed_6_0= ruleELong )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2901:3: lv_randomSeed_6_0= ruleELong
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferenceGeneratorAccess().getRandomSeedELongParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleELong_in_ruleReferenceGenerator5983);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2917:4: (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==73) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2917:6: otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleReferenceGenerator5998); 

                        	newLeafNode(otherlv_7, grammarAccess.getReferenceGeneratorAccess().getIDKeyword_5_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2921:1: ( (lv_ID_8_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2922:1: (lv_ID_8_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2922:1: (lv_ID_8_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2923:3: lv_ID_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferenceGeneratorAccess().getIDEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReferenceGenerator6019);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2939:4: (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==74) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2939:6: otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) )
                    {
                    otherlv_9=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleReferenceGenerator6034); 

                        	newLeafNode(otherlv_9, grammarAccess.getReferenceGeneratorAccess().getLocaleKeyword_6_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2943:1: ( (lv_locale_10_0= ruleLocale ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2944:1: (lv_locale_10_0= ruleLocale )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2944:1: (lv_locale_10_0= ruleLocale )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2945:3: lv_locale_10_0= ruleLocale
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferenceGeneratorAccess().getLocaleLocaleParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLocale_in_ruleReferenceGenerator6055);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2961:4: (otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==75) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2961:6: otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) )
                    {
                    otherlv_11=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleReferenceGenerator6070); 

                        	newLeafNode(otherlv_11, grammarAccess.getReferenceGeneratorAccess().getStepKeyword_7_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2965:1: ( (lv_step_12_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2966:1: (lv_step_12_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2966:1: (lv_step_12_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2967:3: lv_step_12_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferenceGeneratorAccess().getStepEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleReferenceGenerator6091);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2983:4: (otherlv_13= 'badValueGenerator' ( ( ruleEString ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==76) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2983:6: otherlv_13= 'badValueGenerator' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleReferenceGenerator6106); 

                        	newLeafNode(otherlv_13, grammarAccess.getReferenceGeneratorAccess().getBadValueGeneratorKeyword_8_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2987:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2988:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2988:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2989:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getReferenceGeneratorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getReferenceGeneratorAccess().getBadValueGeneratorValueGeneratorCrossReference_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReferenceGenerator6129);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleReferenceGenerator6143); 

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


    // $ANTLR start "entryRuleEAttribute"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3016:1: entryRuleEAttribute returns [EObject current=null] : iv_ruleEAttribute= ruleEAttribute EOF ;
    public final EObject entryRuleEAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttribute = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3017:2: (iv_ruleEAttribute= ruleEAttribute EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3018:2: iv_ruleEAttribute= ruleEAttribute EOF
            {
             newCompositeNode(grammarAccess.getEAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEAttribute_in_entryRuleEAttribute6181);
            iv_ruleEAttribute=ruleEAttribute();

            state._fsp--;

             current =iv_ruleEAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEAttribute6191); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3025:1: ruleEAttribute returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3028:28: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3029:1: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3029:1: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3029:2: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3029:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3030:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEAttributeAccess().getEAttributeAction_0(),
                        current);
                

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3035:2: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==77) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3036:1: (lv_volatile_1_0= 'volatile' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3036:1: (lv_volatile_1_0= 'volatile' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3037:3: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleEAttribute6243); 

                            newLeafNode(lv_volatile_1_0, grammarAccess.getEAttributeAccess().getVolatileVolatileKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "volatile", true, "volatile");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3050:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==78) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3051:1: (lv_transient_2_0= 'transient' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3051:1: (lv_transient_2_0= 'transient' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3052:3: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleEAttribute6275); 

                            newLeafNode(lv_transient_2_0, grammarAccess.getEAttributeAccess().getTransientTransientKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "transient", true, "transient");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3065:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==79) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3066:1: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3066:1: (lv_unsettable_3_0= 'unsettable' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3067:3: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleEAttribute6307); 

                            newLeafNode(lv_unsettable_3_0, grammarAccess.getEAttributeAccess().getUnsettableUnsettableKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "unsettable", true, "unsettable");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3080:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==80) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3081:1: (lv_derived_4_0= 'derived' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3081:1: (lv_derived_4_0= 'derived' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3082:3: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleEAttribute6339); 

                            newLeafNode(lv_derived_4_0, grammarAccess.getEAttributeAccess().getDerivedDerivedKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "derived", true, "derived");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3095:3: ( (lv_iD_5_0= 'iD' ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==81) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3096:1: (lv_iD_5_0= 'iD' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3096:1: (lv_iD_5_0= 'iD' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3097:3: lv_iD_5_0= 'iD'
                    {
                    lv_iD_5_0=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleEAttribute6371); 

                            newLeafNode(lv_iD_5_0, grammarAccess.getEAttributeAccess().getIDIDKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "iD", true, "iD");
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleEAttribute6397); 

                	newLeafNode(otherlv_6, grammarAccess.getEAttributeAccess().getEAttributeKeyword_6());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3114:1: ( (lv_name_7_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3115:1: (lv_name_7_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3115:1: (lv_name_7_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3116:3: lv_name_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEAttributeAccess().getNameEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEAttribute6418);
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

            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEAttribute6430); 

                	newLeafNode(otherlv_8, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_8());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3136:1: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==83) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3136:3: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleEAttribute6443); 

                        	newLeafNode(otherlv_9, grammarAccess.getEAttributeAccess().getOrderedKeyword_9_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3140:1: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3141:1: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3141:1: (lv_ordered_10_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3142:3: lv_ordered_10_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getOrderedEBooleanParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEAttribute6464);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3158:4: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==84) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3158:6: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleEAttribute6479); 

                        	newLeafNode(otherlv_11, grammarAccess.getEAttributeAccess().getUniqueKeyword_10_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3162:1: ( (lv_unique_12_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3163:1: (lv_unique_12_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3163:1: (lv_unique_12_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3164:3: lv_unique_12_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getUniqueEBooleanParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEAttribute6500);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3180:4: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==85) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3180:6: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleEAttribute6515); 

                        	newLeafNode(otherlv_13, grammarAccess.getEAttributeAccess().getLowerBoundKeyword_11_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3184:1: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3185:1: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3185:1: (lv_lowerBound_14_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3186:3: lv_lowerBound_14_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getLowerBoundEIntParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEAttribute6536);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3202:4: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==86) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3202:6: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleEAttribute6551); 

                        	newLeafNode(otherlv_15, grammarAccess.getEAttributeAccess().getUpperBoundKeyword_12_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3206:1: ( (lv_upperBound_16_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3207:1: (lv_upperBound_16_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3207:1: (lv_upperBound_16_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3208:3: lv_upperBound_16_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getUpperBoundEIntParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEAttribute6572);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3224:4: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==87) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3224:6: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleEAttribute6587); 

                        	newLeafNode(otherlv_17, grammarAccess.getEAttributeAccess().getChangeableKeyword_13_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3228:1: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3229:1: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3229:1: (lv_changeable_18_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3230:3: lv_changeable_18_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getChangeableEBooleanParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEAttribute6608);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3246:4: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==88) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3246:6: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleEAttribute6623); 

                        	newLeafNode(otherlv_19, grammarAccess.getEAttributeAccess().getDefaultValueLiteralKeyword_14_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3250:1: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3251:1: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3251:1: (lv_defaultValueLiteral_20_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3252:3: lv_defaultValueLiteral_20_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEAttribute6644);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3268:4: (otherlv_21= 'eType' ( ( ruleEString ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==89) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3268:6: otherlv_21= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_21=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleEAttribute6659); 

                        	newLeafNode(otherlv_21, grammarAccess.getEAttributeAccess().getETypeKeyword_15_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3272:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3273:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3273:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3274:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAttributeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getETypeEClassifierCrossReference_15_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEAttribute6682);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3287:4: (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==24) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3287:6: otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEAttribute6697); 

                        	newLeafNode(otherlv_23, grammarAccess.getEAttributeAccess().getEAnnotationsKeyword_16_0());
                        
                    otherlv_24=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEAttribute6709); 

                        	newLeafNode(otherlv_24, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_16_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3295:1: ( (lv_eAnnotations_25_0= ruleEAnnotation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3296:1: (lv_eAnnotations_25_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3296:1: (lv_eAnnotations_25_0= ruleEAnnotation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3297:3: lv_eAnnotations_25_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getEAnnotationsEAnnotationParserRuleCall_16_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEAttribute6730);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3313:2: (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==17) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3313:4: otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_26=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEAttribute6743); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getEAttributeAccess().getCommaKeyword_16_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3317:1: ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3318:1: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3318:1: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3319:3: lv_eAnnotations_27_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEAttributeAccess().getEAnnotationsEAnnotationParserRuleCall_16_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEAttribute6764);
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
                    	    break loop95;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEAttribute6778); 

                        	newLeafNode(otherlv_28, grammarAccess.getEAttributeAccess().getRightCurlyBracketKeyword_16_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3339:3: (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==90) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3339:5: otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    {
                    otherlv_29=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleEAttribute6793); 

                        	newLeafNode(otherlv_29, grammarAccess.getEAttributeAccess().getEGenericTypeKeyword_17_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3343:1: ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3344:1: (lv_eGenericType_30_0= ruleEGenericType )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3344:1: (lv_eGenericType_30_0= ruleEGenericType )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3345:3: lv_eGenericType_30_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getEGenericTypeEGenericTypeParserRuleCall_17_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEAttribute6814);
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

            otherlv_31=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEAttribute6828); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3373:1: entryRuleEReference returns [EObject current=null] : iv_ruleEReference= ruleEReference EOF ;
    public final EObject entryRuleEReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEReference = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3374:2: (iv_ruleEReference= ruleEReference EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3375:2: iv_ruleEReference= ruleEReference EOF
            {
             newCompositeNode(grammarAccess.getEReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEReference_in_entryRuleEReference6864);
            iv_ruleEReference=ruleEReference();

            state._fsp--;

             current =iv_ruleEReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEReference6874); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3382:1: ruleEReference returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3385:28: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3386:1: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3386:1: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3386:2: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3386:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3387:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEReferenceAccess().getEReferenceAction_0(),
                        current);
                

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3392:2: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==77) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3393:1: (lv_volatile_1_0= 'volatile' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3393:1: (lv_volatile_1_0= 'volatile' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3394:3: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleEReference6926); 

                            newLeafNode(lv_volatile_1_0, grammarAccess.getEReferenceAccess().getVolatileVolatileKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "volatile", true, "volatile");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3407:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==78) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3408:1: (lv_transient_2_0= 'transient' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3408:1: (lv_transient_2_0= 'transient' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3409:3: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleEReference6958); 

                            newLeafNode(lv_transient_2_0, grammarAccess.getEReferenceAccess().getTransientTransientKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "transient", true, "transient");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3422:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==79) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3423:1: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3423:1: (lv_unsettable_3_0= 'unsettable' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3424:3: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleEReference6990); 

                            newLeafNode(lv_unsettable_3_0, grammarAccess.getEReferenceAccess().getUnsettableUnsettableKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "unsettable", true, "unsettable");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3437:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==80) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3438:1: (lv_derived_4_0= 'derived' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3438:1: (lv_derived_4_0= 'derived' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3439:3: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleEReference7022); 

                            newLeafNode(lv_derived_4_0, grammarAccess.getEReferenceAccess().getDerivedDerivedKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "derived", true, "derived");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3452:3: ( (lv_containment_5_0= 'containment' ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==91) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3453:1: (lv_containment_5_0= 'containment' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3453:1: (lv_containment_5_0= 'containment' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3454:3: lv_containment_5_0= 'containment'
                    {
                    lv_containment_5_0=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleEReference7054); 

                            newLeafNode(lv_containment_5_0, grammarAccess.getEReferenceAccess().getContainmentContainmentKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "containment", true, "containment");
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleEReference7080); 

                	newLeafNode(otherlv_6, grammarAccess.getEReferenceAccess().getEReferenceKeyword_6());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3471:1: ( (lv_name_7_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3472:1: (lv_name_7_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3472:1: (lv_name_7_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3473:3: lv_name_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEReferenceAccess().getNameEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEReference7101);
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

            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEReference7113); 

                	newLeafNode(otherlv_8, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_8());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3493:1: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==83) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3493:3: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleEReference7126); 

                        	newLeafNode(otherlv_9, grammarAccess.getEReferenceAccess().getOrderedKeyword_9_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3497:1: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3498:1: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3498:1: (lv_ordered_10_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3499:3: lv_ordered_10_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getOrderedEBooleanParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEReference7147);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3515:4: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==84) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3515:6: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleEReference7162); 

                        	newLeafNode(otherlv_11, grammarAccess.getEReferenceAccess().getUniqueKeyword_10_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3519:1: ( (lv_unique_12_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3520:1: (lv_unique_12_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3520:1: (lv_unique_12_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3521:3: lv_unique_12_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getUniqueEBooleanParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEReference7183);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3537:4: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==85) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3537:6: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleEReference7198); 

                        	newLeafNode(otherlv_13, grammarAccess.getEReferenceAccess().getLowerBoundKeyword_11_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3541:1: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3542:1: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3542:1: (lv_lowerBound_14_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3543:3: lv_lowerBound_14_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getLowerBoundEIntParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEReference7219);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3559:4: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==86) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3559:6: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleEReference7234); 

                        	newLeafNode(otherlv_15, grammarAccess.getEReferenceAccess().getUpperBoundKeyword_12_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3563:1: ( (lv_upperBound_16_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3564:1: (lv_upperBound_16_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3564:1: (lv_upperBound_16_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3565:3: lv_upperBound_16_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getUpperBoundEIntParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEReference7255);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3581:4: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==87) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3581:6: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleEReference7270); 

                        	newLeafNode(otherlv_17, grammarAccess.getEReferenceAccess().getChangeableKeyword_13_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3585:1: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3586:1: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3586:1: (lv_changeable_18_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3587:3: lv_changeable_18_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getChangeableEBooleanParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEReference7291);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3603:4: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==88) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3603:6: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleEReference7306); 

                        	newLeafNode(otherlv_19, grammarAccess.getEReferenceAccess().getDefaultValueLiteralKeyword_14_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3607:1: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3608:1: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3608:1: (lv_defaultValueLiteral_20_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3609:3: lv_defaultValueLiteral_20_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEReference7327);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3625:4: (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==93) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3625:6: otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    {
                    otherlv_21=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleEReference7342); 

                        	newLeafNode(otherlv_21, grammarAccess.getEReferenceAccess().getResolveProxiesKeyword_15_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3629:1: ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3630:1: (lv_resolveProxies_22_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3630:1: (lv_resolveProxies_22_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3631:3: lv_resolveProxies_22_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getResolveProxiesEBooleanParserRuleCall_15_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEReference7363);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3647:4: (otherlv_23= 'eType' ( ( ruleEString ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==89) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3647:6: otherlv_23= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_23=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleEReference7378); 

                        	newLeafNode(otherlv_23, grammarAccess.getEReferenceAccess().getETypeKeyword_16_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3651:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3652:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3652:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3653:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getETypeEClassifierCrossReference_16_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEReference7401);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3666:4: (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==94) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3666:6: otherlv_25= 'eOpposite' ( ( ruleEString ) )
                    {
                    otherlv_25=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleEReference7416); 

                        	newLeafNode(otherlv_25, grammarAccess.getEReferenceAccess().getEOppositeKeyword_17_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3670:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3671:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3671:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3672:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getEOppositeEReferenceCrossReference_17_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEReference7439);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3685:4: (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==95) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3685:6: otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')'
                    {
                    otherlv_27=(Token)match(input,95,FollowSets000.FOLLOW_95_in_ruleEReference7454); 

                        	newLeafNode(otherlv_27, grammarAccess.getEReferenceAccess().getEKeysKeyword_18_0());
                        
                    otherlv_28=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleEReference7466); 

                        	newLeafNode(otherlv_28, grammarAccess.getEReferenceAccess().getLeftParenthesisKeyword_18_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3693:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3694:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3694:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3695:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEReference7489);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3708:2: (otherlv_30= ',' ( ( ruleEString ) ) )*
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==17) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3708:4: otherlv_30= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_30=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEReference7502); 

                    	        	newLeafNode(otherlv_30, grammarAccess.getEReferenceAccess().getCommaKeyword_18_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3712:1: ( ( ruleEString ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3713:1: ( ruleEString )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3713:1: ( ruleEString )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3714:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEReference7525);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop112;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleEReference7539); 

                        	newLeafNode(otherlv_32, grammarAccess.getEReferenceAccess().getRightParenthesisKeyword_18_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3731:3: (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==24) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3731:5: otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEReference7554); 

                        	newLeafNode(otherlv_33, grammarAccess.getEReferenceAccess().getEAnnotationsKeyword_19_0());
                        
                    otherlv_34=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEReference7566); 

                        	newLeafNode(otherlv_34, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_19_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3739:1: ( (lv_eAnnotations_35_0= ruleEAnnotation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3740:1: (lv_eAnnotations_35_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3740:1: (lv_eAnnotations_35_0= ruleEAnnotation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3741:3: lv_eAnnotations_35_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getEAnnotationsEAnnotationParserRuleCall_19_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEReference7587);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3757:2: (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==17) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3757:4: otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_36=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEReference7600); 

                    	        	newLeafNode(otherlv_36, grammarAccess.getEReferenceAccess().getCommaKeyword_19_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3761:1: ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3762:1: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3762:1: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3763:3: lv_eAnnotations_37_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEReferenceAccess().getEAnnotationsEAnnotationParserRuleCall_19_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEReference7621);
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
                    	    break loop114;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEReference7635); 

                        	newLeafNode(otherlv_38, grammarAccess.getEReferenceAccess().getRightCurlyBracketKeyword_19_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3783:3: (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==90) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3783:5: otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    {
                    otherlv_39=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleEReference7650); 

                        	newLeafNode(otherlv_39, grammarAccess.getEReferenceAccess().getEGenericTypeKeyword_20_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3787:1: ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3788:1: (lv_eGenericType_40_0= ruleEGenericType )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3788:1: (lv_eGenericType_40_0= ruleEGenericType )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3789:3: lv_eGenericType_40_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getEGenericTypeEGenericTypeParserRuleCall_20_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEReference7671);
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

            otherlv_41=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEReference7685); 

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


    // $ANTLR start "entryRuleEOperation"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3817:1: entryRuleEOperation returns [EObject current=null] : iv_ruleEOperation= ruleEOperation EOF ;
    public final EObject entryRuleEOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperation = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3818:2: (iv_ruleEOperation= ruleEOperation EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3819:2: iv_ruleEOperation= ruleEOperation EOF
            {
             newCompositeNode(grammarAccess.getEOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEOperation_in_entryRuleEOperation7721);
            iv_ruleEOperation=ruleEOperation();

            state._fsp--;

             current =iv_ruleEOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEOperation7731); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3826:1: ruleEOperation returns [EObject current=null] : ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3829:28: ( ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3830:1: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3830:1: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3830:2: () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3830:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3831:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEOperationAccess().getEOperationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,96,FollowSets000.FOLLOW_96_in_ruleEOperation7777); 

                	newLeafNode(otherlv_1, grammarAccess.getEOperationAccess().getEOperationKeyword_1());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3840:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3841:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3841:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3842:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEOperationAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEOperation7798);
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

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEOperation7810); 

                	newLeafNode(otherlv_3, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3862:1: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==83) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3862:3: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleEOperation7823); 

                        	newLeafNode(otherlv_4, grammarAccess.getEOperationAccess().getOrderedKeyword_4_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3866:1: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3867:1: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3867:1: (lv_ordered_5_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3868:3: lv_ordered_5_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getOrderedEBooleanParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEOperation7844);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3884:4: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==84) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3884:6: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleEOperation7859); 

                        	newLeafNode(otherlv_6, grammarAccess.getEOperationAccess().getUniqueKeyword_5_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3888:1: ( (lv_unique_7_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3889:1: (lv_unique_7_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3889:1: (lv_unique_7_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3890:3: lv_unique_7_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getUniqueEBooleanParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEOperation7880);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3906:4: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==85) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3906:6: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleEOperation7895); 

                        	newLeafNode(otherlv_8, grammarAccess.getEOperationAccess().getLowerBoundKeyword_6_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3910:1: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3911:1: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3911:1: (lv_lowerBound_9_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3912:3: lv_lowerBound_9_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getLowerBoundEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEOperation7916);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3928:4: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==86) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3928:6: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleEOperation7931); 

                        	newLeafNode(otherlv_10, grammarAccess.getEOperationAccess().getUpperBoundKeyword_7_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3932:1: ( (lv_upperBound_11_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3933:1: (lv_upperBound_11_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3933:1: (lv_upperBound_11_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3934:3: lv_upperBound_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getUpperBoundEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEOperation7952);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3950:4: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==89) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3950:6: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleEOperation7967); 

                        	newLeafNode(otherlv_12, grammarAccess.getEOperationAccess().getETypeKeyword_8_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3954:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3955:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3955:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3956:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEOperationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getETypeEClassifierCrossReference_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEOperation7990);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3969:4: (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==97) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3969:6: otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')'
                    {
                    otherlv_14=(Token)match(input,97,FollowSets000.FOLLOW_97_in_ruleEOperation8005); 

                        	newLeafNode(otherlv_14, grammarAccess.getEOperationAccess().getEExceptionsKeyword_9_0());
                        
                    otherlv_15=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleEOperation8017); 

                        	newLeafNode(otherlv_15, grammarAccess.getEOperationAccess().getLeftParenthesisKeyword_9_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3977:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3978:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3978:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3979:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEOperationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEOperation8040);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3992:2: (otherlv_17= ',' ( ( ruleEString ) ) )*
                    loop122:
                    do {
                        int alt122=2;
                        int LA122_0 = input.LA(1);

                        if ( (LA122_0==17) ) {
                            alt122=1;
                        }


                        switch (alt122) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3992:4: otherlv_17= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEOperation8053); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getEOperationAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3996:1: ( ( ruleEString ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3997:1: ( ruleEString )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3997:1: ( ruleEString )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3998:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEOperationRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEOperation8076);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop122;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleEOperation8090); 

                        	newLeafNode(otherlv_19, grammarAccess.getEOperationAccess().getRightParenthesisKeyword_9_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4015:3: (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==24) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4015:5: otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEOperation8105); 

                        	newLeafNode(otherlv_20, grammarAccess.getEOperationAccess().getEAnnotationsKeyword_10_0());
                        
                    otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEOperation8117); 

                        	newLeafNode(otherlv_21, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4023:1: ( (lv_eAnnotations_22_0= ruleEAnnotation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4024:1: (lv_eAnnotations_22_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4024:1: (lv_eAnnotations_22_0= ruleEAnnotation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4025:3: lv_eAnnotations_22_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getEAnnotationsEAnnotationParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEOperation8138);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4041:2: (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )*
                    loop124:
                    do {
                        int alt124=2;
                        int LA124_0 = input.LA(1);

                        if ( (LA124_0==17) ) {
                            alt124=1;
                        }


                        switch (alt124) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4041:4: otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEOperation8151); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getEOperationAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4045:1: ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4046:1: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4046:1: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4047:3: lv_eAnnotations_24_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEOperationAccess().getEAnnotationsEAnnotationParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEOperation8172);
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
                    	    break loop124;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEOperation8186); 

                        	newLeafNode(otherlv_25, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4067:3: (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==90) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4067:5: otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    {
                    otherlv_26=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleEOperation8201); 

                        	newLeafNode(otherlv_26, grammarAccess.getEOperationAccess().getEGenericTypeKeyword_11_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4071:1: ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4072:1: (lv_eGenericType_27_0= ruleEGenericType )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4072:1: (lv_eGenericType_27_0= ruleEGenericType )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4073:3: lv_eGenericType_27_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getEGenericTypeEGenericTypeParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEOperation8222);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4089:4: (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==40) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4089:6: otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleEOperation8237); 

                        	newLeafNode(otherlv_28, grammarAccess.getEOperationAccess().getETypeParametersKeyword_12_0());
                        
                    otherlv_29=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEOperation8249); 

                        	newLeafNode(otherlv_29, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_12_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4097:1: ( (lv_eTypeParameters_30_0= ruleETypeParameter ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4098:1: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4098:1: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4099:3: lv_eTypeParameters_30_0= ruleETypeParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getETypeParametersETypeParameterParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEOperation8270);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4115:2: (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )*
                    loop127:
                    do {
                        int alt127=2;
                        int LA127_0 = input.LA(1);

                        if ( (LA127_0==17) ) {
                            alt127=1;
                        }


                        switch (alt127) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4115:4: otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_31=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEOperation8283); 

                    	        	newLeafNode(otherlv_31, grammarAccess.getEOperationAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4119:1: ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4120:1: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4120:1: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4121:3: lv_eTypeParameters_32_0= ruleETypeParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEOperationAccess().getETypeParametersETypeParameterParserRuleCall_12_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEOperation8304);
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
                    	    break loop127;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEOperation8318); 

                        	newLeafNode(otherlv_33, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_12_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4141:3: (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==98) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4141:5: otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,98,FollowSets000.FOLLOW_98_in_ruleEOperation8333); 

                        	newLeafNode(otherlv_34, grammarAccess.getEOperationAccess().getEParametersKeyword_13_0());
                        
                    otherlv_35=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEOperation8345); 

                        	newLeafNode(otherlv_35, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_13_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4149:1: ( (lv_eParameters_36_0= ruleEParameter ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4150:1: (lv_eParameters_36_0= ruleEParameter )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4150:1: (lv_eParameters_36_0= ruleEParameter )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4151:3: lv_eParameters_36_0= ruleEParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getEParametersEParameterParserRuleCall_13_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEParameter_in_ruleEOperation8366);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4167:2: (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )*
                    loop129:
                    do {
                        int alt129=2;
                        int LA129_0 = input.LA(1);

                        if ( (LA129_0==17) ) {
                            alt129=1;
                        }


                        switch (alt129) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4167:4: otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    {
                    	    otherlv_37=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEOperation8379); 

                    	        	newLeafNode(otherlv_37, grammarAccess.getEOperationAccess().getCommaKeyword_13_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4171:1: ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4172:1: (lv_eParameters_38_0= ruleEParameter )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4172:1: (lv_eParameters_38_0= ruleEParameter )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4173:3: lv_eParameters_38_0= ruleEParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEOperationAccess().getEParametersEParameterParserRuleCall_13_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEParameter_in_ruleEOperation8400);
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
                    	    break loop129;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEOperation8414); 

                        	newLeafNode(otherlv_39, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_13_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4193:3: (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==99) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4193:5: otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,99,FollowSets000.FOLLOW_99_in_ruleEOperation8429); 

                        	newLeafNode(otherlv_40, grammarAccess.getEOperationAccess().getEGenericExceptionsKeyword_14_0());
                        
                    otherlv_41=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEOperation8441); 

                        	newLeafNode(otherlv_41, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_14_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4201:1: ( (lv_eGenericExceptions_42_0= ruleEGenericType ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4202:1: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4202:1: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4203:3: lv_eGenericExceptions_42_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getEGenericExceptionsEGenericTypeParserRuleCall_14_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEOperation8462);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4219:2: (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )*
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==17) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4219:4: otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEOperation8475); 

                    	        	newLeafNode(otherlv_43, grammarAccess.getEOperationAccess().getCommaKeyword_14_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4223:1: ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4224:1: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4224:1: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4225:3: lv_eGenericExceptions_44_0= ruleEGenericType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEOperationAccess().getEGenericExceptionsEGenericTypeParserRuleCall_14_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEOperation8496);
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
                    	    break loop131;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEOperation8510); 

                        	newLeafNode(otherlv_45, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_14_4());
                        

                    }
                    break;

            }

            otherlv_46=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEOperation8524); 

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


    // $ANTLR start "entryRuleEParameter"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4257:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4258:2: (iv_ruleEParameter= ruleEParameter EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4259:2: iv_ruleEParameter= ruleEParameter EOF
            {
             newCompositeNode(grammarAccess.getEParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEParameter_in_entryRuleEParameter8560);
            iv_ruleEParameter=ruleEParameter();

            state._fsp--;

             current =iv_ruleEParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEParameter8570); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4266:1: ruleEParameter returns [EObject current=null] : ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4269:28: ( ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4270:1: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4270:1: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4270:2: () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4270:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4271:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEParameterAccess().getEParameterAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,100,FollowSets000.FOLLOW_100_in_ruleEParameter8616); 

                	newLeafNode(otherlv_1, grammarAccess.getEParameterAccess().getEParameterKeyword_1());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4280:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4281:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4281:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4282:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEParameterAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEParameter8637);
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

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEParameter8649); 

                	newLeafNode(otherlv_3, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4302:1: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==83) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4302:3: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleEParameter8662); 

                        	newLeafNode(otherlv_4, grammarAccess.getEParameterAccess().getOrderedKeyword_4_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4306:1: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4307:1: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4307:1: (lv_ordered_5_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4308:3: lv_ordered_5_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEParameterAccess().getOrderedEBooleanParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEParameter8683);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4324:4: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==84) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4324:6: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleEParameter8698); 

                        	newLeafNode(otherlv_6, grammarAccess.getEParameterAccess().getUniqueKeyword_5_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4328:1: ( (lv_unique_7_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4329:1: (lv_unique_7_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4329:1: (lv_unique_7_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4330:3: lv_unique_7_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEParameterAccess().getUniqueEBooleanParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEParameter8719);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4346:4: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==85) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4346:6: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleEParameter8734); 

                        	newLeafNode(otherlv_8, grammarAccess.getEParameterAccess().getLowerBoundKeyword_6_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4350:1: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4351:1: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4351:1: (lv_lowerBound_9_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4352:3: lv_lowerBound_9_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEParameterAccess().getLowerBoundEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEParameter8755);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4368:4: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==86) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4368:6: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleEParameter8770); 

                        	newLeafNode(otherlv_10, grammarAccess.getEParameterAccess().getUpperBoundKeyword_7_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4372:1: ( (lv_upperBound_11_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4373:1: (lv_upperBound_11_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4373:1: (lv_upperBound_11_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4374:3: lv_upperBound_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEParameterAccess().getUpperBoundEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEParameter8791);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4390:4: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==89) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4390:6: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleEParameter8806); 

                        	newLeafNode(otherlv_12, grammarAccess.getEParameterAccess().getETypeKeyword_8_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4394:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4395:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4395:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4396:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEParameterRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEParameterAccess().getETypeEClassifierCrossReference_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEParameter8829);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4409:4: (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==24) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4409:6: otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEParameter8844); 

                        	newLeafNode(otherlv_14, grammarAccess.getEParameterAccess().getEAnnotationsKeyword_9_0());
                        
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEParameter8856); 

                        	newLeafNode(otherlv_15, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4417:1: ( (lv_eAnnotations_16_0= ruleEAnnotation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4418:1: (lv_eAnnotations_16_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4418:1: (lv_eAnnotations_16_0= ruleEAnnotation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4419:3: lv_eAnnotations_16_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEParameterAccess().getEAnnotationsEAnnotationParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEParameter8877);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4435:2: (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )*
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==17) ) {
                            alt138=1;
                        }


                        switch (alt138) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4435:4: otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEParameter8890); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getEParameterAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4439:1: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4440:1: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4440:1: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4441:3: lv_eAnnotations_18_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEParameterAccess().getEAnnotationsEAnnotationParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEParameter8911);
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
                    	    break loop138;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEParameter8925); 

                        	newLeafNode(otherlv_19, grammarAccess.getEParameterAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4461:3: (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==90) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4461:5: otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    {
                    otherlv_20=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleEParameter8940); 

                        	newLeafNode(otherlv_20, grammarAccess.getEParameterAccess().getEGenericTypeKeyword_10_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4465:1: ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4466:1: (lv_eGenericType_21_0= ruleEGenericType )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4466:1: (lv_eGenericType_21_0= ruleEGenericType )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4467:3: lv_eGenericType_21_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEParameterAccess().getEGenericTypeEGenericTypeParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEParameter8961);
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

            otherlv_22=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEParameter8975); 

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


    // $ANTLR start "ruleLanguage"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4495:1: ruleLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) ) ;
    public final Enumerator ruleLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4497:28: ( ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4498:1: ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4498:1: ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) )
            int alt141=5;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt141=1;
                }
                break;
            case 102:
                {
                alt141=2;
                }
                break;
            case 103:
                {
                alt141=3;
                }
                break;
            case 104:
                {
                alt141=4;
                }
                break;
            case 105:
                {
                alt141=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;
            }

            switch (alt141) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4498:2: (enumLiteral_0= 'fr' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4498:2: (enumLiteral_0= 'fr' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4498:4: enumLiteral_0= 'fr'
                    {
                    enumLiteral_0=(Token)match(input,101,FollowSets000.FOLLOW_101_in_ruleLanguage9025); 

                            current = grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4504:6: (enumLiteral_1= 'en' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4504:6: (enumLiteral_1= 'en' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4504:8: enumLiteral_1= 'en'
                    {
                    enumLiteral_1=(Token)match(input,102,FollowSets000.FOLLOW_102_in_ruleLanguage9042); 

                            current = grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4510:6: (enumLiteral_2= 'de' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4510:6: (enumLiteral_2= 'de' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4510:8: enumLiteral_2= 'de'
                    {
                    enumLiteral_2=(Token)match(input,103,FollowSets000.FOLLOW_103_in_ruleLanguage9059); 

                            current = grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4516:6: (enumLiteral_3= 'es' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4516:6: (enumLiteral_3= 'es' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4516:8: enumLiteral_3= 'es'
                    {
                    enumLiteral_3=(Token)match(input,104,FollowSets000.FOLLOW_104_in_ruleLanguage9076); 

                            current = grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4522:6: (enumLiteral_4= 'it' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4522:6: (enumLiteral_4= 'it' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4522:8: enumLiteral_4= 'it'
                    {
                    enumLiteral_4=(Token)match(input,105,FollowSets000.FOLLOW_105_in_ruleLanguage9093); 

                            current = grammarAccess.getLanguageAccess().getItEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getLanguageAccess().getItEnumLiteralDeclaration_4()); 
                        

                    }


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
    // $ANTLR end "ruleLanguage"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleDataSample_in_entryRuleDataSample75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataSample85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleDataSample131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDataSample152 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDataSample164 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDataSample185 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDataSample197 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDataSample209 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleDataSample230 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDataSample242 = new BitSet(new long[]{0x0000000000000000L,0x000003E000000000L});
        public static final BitSet FOLLOW_ruleLanguage_in_ruleDataSample263 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleDataSample276 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDataSample288 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDataSample309 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleDataSample322 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDataSample343 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleDataSample357 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleDataSample371 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_ruleEntityGenerator2_in_ruleDataSample392 = new BitSet(new long[]{0x0000000008020000L});
        public static final BitSet FOLLOW_17_in_ruleDataSample405 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_ruleEntityGenerator2_in_ruleDataSample426 = new BitSet(new long[]{0x0000000008020000L});
        public static final BitSet FOLLOW_ruleFieldGenerator2_in_ruleDataSample449 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleDataSample462 = new BitSet(new long[]{0x0000000008020000L});
        public static final BitSet FOLLOW_ruleFieldGenerator2_in_ruleDataSample483 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleDataSample497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEClassifier_in_entryRuleEClassifier533 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEClassifier543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEClass_in_ruleEClassifier590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDataType_Impl_in_ruleEClassifier617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEEnum_in_ruleEClassifier644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEStructuralFeature_in_entryRuleEStructuralFeature681 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEStructuralFeature691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAttribute_in_ruleEStructuralFeature738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEReference_in_ruleEStructuralFeature765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString801 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt924 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleEInt974 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEPackage_in_entryRuleEPackage1036 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEPackage1046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleEPackage1092 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEPackage1113 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEPackage1125 = new BitSet(new long[]{0x0000000007C40000L});
        public static final BitSet FOLLOW_22_in_ruleEPackage1138 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEPackage1159 = new BitSet(new long[]{0x0000000007840000L});
        public static final BitSet FOLLOW_23_in_ruleEPackage1174 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEPackage1195 = new BitSet(new long[]{0x0000000007040000L});
        public static final BitSet FOLLOW_24_in_ruleEPackage1210 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEPackage1222 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEPackage1243 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEPackage1256 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEPackage1277 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEPackage1291 = new BitSet(new long[]{0x0000000006040000L});
        public static final BitSet FOLLOW_25_in_ruleEPackage1306 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEPackage1318 = new BitSet(new long[]{0x0280000700000000L});
        public static final BitSet FOLLOW_ruleEClassifier_in_ruleEPackage1339 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEPackage1352 = new BitSet(new long[]{0x0280000700000000L});
        public static final BitSet FOLLOW_ruleEClassifier_in_ruleEPackage1373 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEPackage1387 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_26_in_ruleEPackage1402 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEPackage1414 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleEPackage_in_ruleEPackage1435 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEPackage1448 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleEPackage_in_ruleEPackage1469 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEPackage1483 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEPackage1497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityGenerator2_in_entryRuleEntityGenerator21533 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntityGenerator21543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEntityGenerator21598 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEntityGenerator21619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFieldGenerator2_in_entryRuleFieldGenerator21657 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFieldGenerator21667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleFieldGenerator21704 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFieldGenerator21725 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleFieldGenerator21737 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFieldGenerator21758 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleFieldGenerator21770 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFieldGenerator21791 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleFieldGenerator21804 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleFieldGenerator21825 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleFieldGenerator21837 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFieldGenerator21858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEClass_in_entryRuleEClass1898 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEClass1908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleEClass1960 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_33_in_ruleEClass1992 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleEClass2018 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEClass2039 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEClass2051 = new BitSet(new long[]{0x00000F3801040000L});
        public static final BitSet FOLLOW_35_in_ruleEClass2064 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEClass2085 = new BitSet(new long[]{0x00000F3001040000L});
        public static final BitSet FOLLOW_36_in_ruleEClass2100 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEClass2121 = new BitSet(new long[]{0x00000F2001040000L});
        public static final BitSet FOLLOW_37_in_ruleEClass2136 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleEClass2148 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEClass2171 = new BitSet(new long[]{0x0000008000020000L});
        public static final BitSet FOLLOW_17_in_ruleEClass2184 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEClass2207 = new BitSet(new long[]{0x0000008000020000L});
        public static final BitSet FOLLOW_39_in_ruleEClass2221 = new BitSet(new long[]{0x00000F0001040000L});
        public static final BitSet FOLLOW_24_in_ruleEClass2236 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEClass2248 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEClass2269 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEClass2282 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEClass2303 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEClass2317 = new BitSet(new long[]{0x00000F0000040000L});
        public static final BitSet FOLLOW_40_in_ruleEClass2332 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEClass2344 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEClass2365 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEClass2378 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEClass2399 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEClass2413 = new BitSet(new long[]{0x00000E0000040000L});
        public static final BitSet FOLLOW_41_in_ruleEClass2428 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEClass2440 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
        public static final BitSet FOLLOW_ruleEOperation_in_ruleEClass2461 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEClass2474 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
        public static final BitSet FOLLOW_ruleEOperation_in_ruleEClass2495 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEClass2509 = new BitSet(new long[]{0x00000C0000040000L});
        public static final BitSet FOLLOW_42_in_ruleEClass2524 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEClass2536 = new BitSet(new long[]{0x0000000000000000L,0x000000001807E000L});
        public static final BitSet FOLLOW_ruleEStructuralFeature_in_ruleEClass2557 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEClass2570 = new BitSet(new long[]{0x0000000000000000L,0x000000001807E000L});
        public static final BitSet FOLLOW_ruleEStructuralFeature_in_ruleEClass2591 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEClass2605 = new BitSet(new long[]{0x0000080000040000L});
        public static final BitSet FOLLOW_43_in_ruleEClass2620 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEClass2632 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEClass2653 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEClass2666 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEClass2687 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEClass2701 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEClass2715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_entryRuleEAnnotation2751 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEAnnotation2761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleEAnnotation2807 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEAnnotation2819 = new BitSet(new long[]{0x0001E00001040000L});
        public static final BitSet FOLLOW_45_in_ruleEAnnotation2832 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEAnnotation2853 = new BitSet(new long[]{0x0001C00001040000L});
        public static final BitSet FOLLOW_46_in_ruleEAnnotation2868 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleEAnnotation2880 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEAnnotation2903 = new BitSet(new long[]{0x0000008000020000L});
        public static final BitSet FOLLOW_17_in_ruleEAnnotation2916 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEAnnotation2939 = new BitSet(new long[]{0x0000008000020000L});
        public static final BitSet FOLLOW_39_in_ruleEAnnotation2953 = new BitSet(new long[]{0x0001800001040000L});
        public static final BitSet FOLLOW_24_in_ruleEAnnotation2968 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEAnnotation2980 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEAnnotation3001 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEAnnotation3014 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEAnnotation3035 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEAnnotation3049 = new BitSet(new long[]{0x0001800000040000L});
        public static final BitSet FOLLOW_47_in_ruleEAnnotation3064 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEAnnotation3076 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_ruleEStringToStringMapEntry_in_ruleEAnnotation3097 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEAnnotation3110 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_ruleEStringToStringMapEntry_in_ruleEAnnotation3131 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEAnnotation3145 = new BitSet(new long[]{0x0001000000040000L});
        public static final BitSet FOLLOW_48_in_ruleEAnnotation3160 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEAnnotation3172 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEObject_in_ruleEAnnotation3193 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEAnnotation3206 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEObject_in_ruleEAnnotation3227 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEAnnotation3241 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEAnnotation3255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEStringToStringMapEntry_in_entryRuleEStringToStringMapEntry3291 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEStringToStringMapEntry3301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleEStringToStringMapEntry3347 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEStringToStringMapEntry3359 = new BitSet(new long[]{0x000C000000040000L});
        public static final BitSet FOLLOW_50_in_ruleEStringToStringMapEntry3372 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEStringToStringMapEntry3393 = new BitSet(new long[]{0x0008000000040000L});
        public static final BitSet FOLLOW_51_in_ruleEStringToStringMapEntry3408 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEStringToStringMapEntry3429 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEStringToStringMapEntry3443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEObject_in_entryRuleEObject3479 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEObject3489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleEObject3535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_entryRuleETypeParameter3571 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleETypeParameter3581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleETypeParameter3627 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleETypeParameter3648 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleETypeParameter3660 = new BitSet(new long[]{0x0040000001040000L});
        public static final BitSet FOLLOW_24_in_ruleETypeParameter3673 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleETypeParameter3685 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleETypeParameter3706 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleETypeParameter3719 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleETypeParameter3740 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleETypeParameter3754 = new BitSet(new long[]{0x0040000000040000L});
        public static final BitSet FOLLOW_54_in_ruleETypeParameter3769 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleETypeParameter3781 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleETypeParameter3802 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleETypeParameter3815 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleETypeParameter3836 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleETypeParameter3850 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleETypeParameter3864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDataType_Impl_in_entryRuleEDataType_Impl3900 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDataType_Impl3910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleEDataType_Impl3956 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEDataType_Impl3977 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEDataType_Impl3989 = new BitSet(new long[]{0x0100011801040000L});
        public static final BitSet FOLLOW_35_in_ruleEDataType_Impl4002 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEDataType_Impl4023 = new BitSet(new long[]{0x0100011001040000L});
        public static final BitSet FOLLOW_36_in_ruleEDataType_Impl4038 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEDataType_Impl4059 = new BitSet(new long[]{0x0100010001040000L});
        public static final BitSet FOLLOW_56_in_ruleEDataType_Impl4074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEDataType_Impl4095 = new BitSet(new long[]{0x0000010001040000L});
        public static final BitSet FOLLOW_24_in_ruleEDataType_Impl4110 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEDataType_Impl4122 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEDataType_Impl4143 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEDataType_Impl4156 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEDataType_Impl4177 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEDataType_Impl4191 = new BitSet(new long[]{0x0000010000040000L});
        public static final BitSet FOLLOW_40_in_ruleEDataType_Impl4206 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEDataType_Impl4218 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEDataType_Impl4239 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEDataType_Impl4252 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEDataType_Impl4273 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEDataType_Impl4287 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEDataType_Impl4301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEEnum_in_entryRuleEEnum4337 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEEnum4347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleEEnum4393 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEEnum4414 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEEnum4426 = new BitSet(new long[]{0x0500011801040000L});
        public static final BitSet FOLLOW_35_in_ruleEEnum4439 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEEnum4460 = new BitSet(new long[]{0x0500011001040000L});
        public static final BitSet FOLLOW_36_in_ruleEEnum4475 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEEnum4496 = new BitSet(new long[]{0x0500010001040000L});
        public static final BitSet FOLLOW_56_in_ruleEEnum4511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEEnum4532 = new BitSet(new long[]{0x0400010001040000L});
        public static final BitSet FOLLOW_24_in_ruleEEnum4547 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEEnum4559 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEEnum4580 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEEnum4593 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEEnum4614 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEEnum4628 = new BitSet(new long[]{0x0400010000040000L});
        public static final BitSet FOLLOW_40_in_ruleEEnum4643 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEEnum4655 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEEnum4676 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEEnum4689 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEEnum4710 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEEnum4724 = new BitSet(new long[]{0x0400000000040000L});
        public static final BitSet FOLLOW_58_in_ruleEEnum4739 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEEnum4751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleEEnumLiteral_in_ruleEEnum4772 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEEnum4785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleEEnumLiteral_in_ruleEEnum4806 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEEnum4820 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEEnum4834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEGenericType_in_entryRuleEGenericType4870 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEGenericType4880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleEGenericType4926 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEGenericType4938 = new BitSet(new long[]{0xF000000000040000L,0x0000000000000001L});
        public static final BitSet FOLLOW_60_in_ruleEGenericType4951 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEGenericType4974 = new BitSet(new long[]{0xE000000000040000L,0x0000000000000001L});
        public static final BitSet FOLLOW_61_in_ruleEGenericType4989 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEGenericType5012 = new BitSet(new long[]{0xC000000000040000L,0x0000000000000001L});
        public static final BitSet FOLLOW_62_in_ruleEGenericType5027 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEGenericType5048 = new BitSet(new long[]{0x8000000000040000L,0x0000000000000001L});
        public static final BitSet FOLLOW_63_in_ruleEGenericType5063 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEGenericType5075 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEGenericType5096 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEGenericType5109 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEGenericType5130 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEGenericType5144 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000001L});
        public static final BitSet FOLLOW_64_in_ruleEGenericType5159 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEGenericType5180 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEGenericType5194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean5231 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean5242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleEBoolean5280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleEBoolean5299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEEnumLiteral_in_entryRuleEEnumLiteral5339 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEEnumLiteral5349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleEEnumLiteral5395 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEEnumLiteral5416 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEEnumLiteral5428 = new BitSet(new long[]{0x0008000001040000L,0x0000000000000010L});
        public static final BitSet FOLLOW_51_in_ruleEEnumLiteral5441 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEEnumLiteral5462 = new BitSet(new long[]{0x0000000001040000L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruleEEnumLiteral5477 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEEnumLiteral5498 = new BitSet(new long[]{0x0000000001040000L});
        public static final BitSet FOLLOW_24_in_ruleEEnumLiteral5513 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEEnumLiteral5525 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEEnumLiteral5546 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEEnumLiteral5559 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEEnumLiteral5580 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEEnumLiteral5594 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEEnumLiteral5608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleELong_in_entryRuleELong5645 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleELong5656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleELong5695 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleELong5712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocale_in_entryRuleLocale5758 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocale5769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleLocale5806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferenceGenerator_in_entryRuleReferenceGenerator5845 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReferenceGenerator5855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleReferenceGenerator5901 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleReferenceGenerator5913 = new BitSet(new long[]{0x0000000000040000L,0x0000000000001F80L});
        public static final BitSet FOLLOW_71_in_ruleReferenceGenerator5926 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleReferenceGenerator5947 = new BitSet(new long[]{0x0000000000040000L,0x0000000000001F00L});
        public static final BitSet FOLLOW_72_in_ruleReferenceGenerator5962 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_ruleELong_in_ruleReferenceGenerator5983 = new BitSet(new long[]{0x0000000000040000L,0x0000000000001E00L});
        public static final BitSet FOLLOW_73_in_ruleReferenceGenerator5998 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReferenceGenerator6019 = new BitSet(new long[]{0x0000000000040000L,0x0000000000001C00L});
        public static final BitSet FOLLOW_74_in_ruleReferenceGenerator6034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_ruleLocale_in_ruleReferenceGenerator6055 = new BitSet(new long[]{0x0000000000040000L,0x0000000000001800L});
        public static final BitSet FOLLOW_75_in_ruleReferenceGenerator6070 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleReferenceGenerator6091 = new BitSet(new long[]{0x0000000000040000L,0x0000000000001000L});
        public static final BitSet FOLLOW_76_in_ruleReferenceGenerator6106 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReferenceGenerator6129 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleReferenceGenerator6143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAttribute_in_entryRuleEAttribute6181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEAttribute6191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleEAttribute6243 = new BitSet(new long[]{0x0000000000000000L,0x000000000007C000L});
        public static final BitSet FOLLOW_78_in_ruleEAttribute6275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000078000L});
        public static final BitSet FOLLOW_79_in_ruleEAttribute6307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000070000L});
        public static final BitSet FOLLOW_80_in_ruleEAttribute6339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
        public static final BitSet FOLLOW_81_in_ruleEAttribute6371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_82_in_ruleEAttribute6397 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEAttribute6418 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEAttribute6430 = new BitSet(new long[]{0x0000000001040000L,0x0000000007F80000L});
        public static final BitSet FOLLOW_83_in_ruleEAttribute6443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEAttribute6464 = new BitSet(new long[]{0x0000000001040000L,0x0000000007F00000L});
        public static final BitSet FOLLOW_84_in_ruleEAttribute6479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEAttribute6500 = new BitSet(new long[]{0x0000000001040000L,0x0000000007E00000L});
        public static final BitSet FOLLOW_85_in_ruleEAttribute6515 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEAttribute6536 = new BitSet(new long[]{0x0000000001040000L,0x0000000007C00000L});
        public static final BitSet FOLLOW_86_in_ruleEAttribute6551 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEAttribute6572 = new BitSet(new long[]{0x0000000001040000L,0x0000000007800000L});
        public static final BitSet FOLLOW_87_in_ruleEAttribute6587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEAttribute6608 = new BitSet(new long[]{0x0000000001040000L,0x0000000007000000L});
        public static final BitSet FOLLOW_88_in_ruleEAttribute6623 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEAttribute6644 = new BitSet(new long[]{0x0000000001040000L,0x0000000006000000L});
        public static final BitSet FOLLOW_89_in_ruleEAttribute6659 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEAttribute6682 = new BitSet(new long[]{0x0000000001040000L,0x0000000004000000L});
        public static final BitSet FOLLOW_24_in_ruleEAttribute6697 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEAttribute6709 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEAttribute6730 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEAttribute6743 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEAttribute6764 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEAttribute6778 = new BitSet(new long[]{0x0000000000040000L,0x0000000004000000L});
        public static final BitSet FOLLOW_90_in_ruleEAttribute6793 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEAttribute6814 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEAttribute6828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEReference_in_entryRuleEReference6864 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEReference6874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleEReference6926 = new BitSet(new long[]{0x0000000000000000L,0x000000001801C000L});
        public static final BitSet FOLLOW_78_in_ruleEReference6958 = new BitSet(new long[]{0x0000000000000000L,0x0000000018018000L});
        public static final BitSet FOLLOW_79_in_ruleEReference6990 = new BitSet(new long[]{0x0000000000000000L,0x0000000018010000L});
        public static final BitSet FOLLOW_80_in_ruleEReference7022 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
        public static final BitSet FOLLOW_91_in_ruleEReference7054 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
        public static final BitSet FOLLOW_92_in_ruleEReference7080 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEReference7101 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEReference7113 = new BitSet(new long[]{0x0000000001040000L,0x00000000E7F80000L});
        public static final BitSet FOLLOW_83_in_ruleEReference7126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEReference7147 = new BitSet(new long[]{0x0000000001040000L,0x00000000E7F00000L});
        public static final BitSet FOLLOW_84_in_ruleEReference7162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEReference7183 = new BitSet(new long[]{0x0000000001040000L,0x00000000E7E00000L});
        public static final BitSet FOLLOW_85_in_ruleEReference7198 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEReference7219 = new BitSet(new long[]{0x0000000001040000L,0x00000000E7C00000L});
        public static final BitSet FOLLOW_86_in_ruleEReference7234 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEReference7255 = new BitSet(new long[]{0x0000000001040000L,0x00000000E7800000L});
        public static final BitSet FOLLOW_87_in_ruleEReference7270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEReference7291 = new BitSet(new long[]{0x0000000001040000L,0x00000000E7000000L});
        public static final BitSet FOLLOW_88_in_ruleEReference7306 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEReference7327 = new BitSet(new long[]{0x0000000001040000L,0x00000000E6000000L});
        public static final BitSet FOLLOW_93_in_ruleEReference7342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEReference7363 = new BitSet(new long[]{0x0000000001040000L,0x00000000C6000000L});
        public static final BitSet FOLLOW_89_in_ruleEReference7378 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEReference7401 = new BitSet(new long[]{0x0000000001040000L,0x00000000C4000000L});
        public static final BitSet FOLLOW_94_in_ruleEReference7416 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEReference7439 = new BitSet(new long[]{0x0000000001040000L,0x0000000084000000L});
        public static final BitSet FOLLOW_95_in_ruleEReference7454 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleEReference7466 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEReference7489 = new BitSet(new long[]{0x0000008000020000L});
        public static final BitSet FOLLOW_17_in_ruleEReference7502 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEReference7525 = new BitSet(new long[]{0x0000008000020000L});
        public static final BitSet FOLLOW_39_in_ruleEReference7539 = new BitSet(new long[]{0x0000000001040000L,0x0000000004000000L});
        public static final BitSet FOLLOW_24_in_ruleEReference7554 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEReference7566 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEReference7587 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEReference7600 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEReference7621 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEReference7635 = new BitSet(new long[]{0x0000000000040000L,0x0000000004000000L});
        public static final BitSet FOLLOW_90_in_ruleEReference7650 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEReference7671 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEReference7685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEOperation_in_entryRuleEOperation7721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEOperation7731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_96_in_ruleEOperation7777 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEOperation7798 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEOperation7810 = new BitSet(new long[]{0x0000010001040000L,0x0000000E06780000L});
        public static final BitSet FOLLOW_83_in_ruleEOperation7823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEOperation7844 = new BitSet(new long[]{0x0000010001040000L,0x0000000E06700000L});
        public static final BitSet FOLLOW_84_in_ruleEOperation7859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEOperation7880 = new BitSet(new long[]{0x0000010001040000L,0x0000000E06600000L});
        public static final BitSet FOLLOW_85_in_ruleEOperation7895 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEOperation7916 = new BitSet(new long[]{0x0000010001040000L,0x0000000E06400000L});
        public static final BitSet FOLLOW_86_in_ruleEOperation7931 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEOperation7952 = new BitSet(new long[]{0x0000010001040000L,0x0000000E06000000L});
        public static final BitSet FOLLOW_89_in_ruleEOperation7967 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEOperation7990 = new BitSet(new long[]{0x0000010001040000L,0x0000000E04000000L});
        public static final BitSet FOLLOW_97_in_ruleEOperation8005 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleEOperation8017 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEOperation8040 = new BitSet(new long[]{0x0000008000020000L});
        public static final BitSet FOLLOW_17_in_ruleEOperation8053 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEOperation8076 = new BitSet(new long[]{0x0000008000020000L});
        public static final BitSet FOLLOW_39_in_ruleEOperation8090 = new BitSet(new long[]{0x0000010001040000L,0x0000000C04000000L});
        public static final BitSet FOLLOW_24_in_ruleEOperation8105 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEOperation8117 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEOperation8138 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEOperation8151 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEOperation8172 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEOperation8186 = new BitSet(new long[]{0x0000010000040000L,0x0000000C04000000L});
        public static final BitSet FOLLOW_90_in_ruleEOperation8201 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEOperation8222 = new BitSet(new long[]{0x0000010000040000L,0x0000000C00000000L});
        public static final BitSet FOLLOW_40_in_ruleEOperation8237 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEOperation8249 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEOperation8270 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEOperation8283 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEOperation8304 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEOperation8318 = new BitSet(new long[]{0x0000000000040000L,0x0000000C00000000L});
        public static final BitSet FOLLOW_98_in_ruleEOperation8333 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEOperation8345 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
        public static final BitSet FOLLOW_ruleEParameter_in_ruleEOperation8366 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEOperation8379 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
        public static final BitSet FOLLOW_ruleEParameter_in_ruleEOperation8400 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEOperation8414 = new BitSet(new long[]{0x0000000000040000L,0x0000000800000000L});
        public static final BitSet FOLLOW_99_in_ruleEOperation8429 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEOperation8441 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEOperation8462 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEOperation8475 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEOperation8496 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEOperation8510 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEOperation8524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEParameter_in_entryRuleEParameter8560 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEParameter8570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_100_in_ruleEParameter8616 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEParameter8637 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEParameter8649 = new BitSet(new long[]{0x0000000001040000L,0x0000000006780000L});
        public static final BitSet FOLLOW_83_in_ruleEParameter8662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEParameter8683 = new BitSet(new long[]{0x0000000001040000L,0x0000000006700000L});
        public static final BitSet FOLLOW_84_in_ruleEParameter8698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEParameter8719 = new BitSet(new long[]{0x0000000001040000L,0x0000000006600000L});
        public static final BitSet FOLLOW_85_in_ruleEParameter8734 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEParameter8755 = new BitSet(new long[]{0x0000000001040000L,0x0000000006400000L});
        public static final BitSet FOLLOW_86_in_ruleEParameter8770 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEParameter8791 = new BitSet(new long[]{0x0000000001040000L,0x0000000006000000L});
        public static final BitSet FOLLOW_89_in_ruleEParameter8806 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEParameter8829 = new BitSet(new long[]{0x0000000001040000L,0x0000000004000000L});
        public static final BitSet FOLLOW_24_in_ruleEParameter8844 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEParameter8856 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEParameter8877 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEParameter8890 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEParameter8911 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEParameter8925 = new BitSet(new long[]{0x0000000000040000L,0x0000000004000000L});
        public static final BitSet FOLLOW_90_in_ruleEParameter8940 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEParameter8961 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEParameter8975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_101_in_ruleLanguage9025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_102_in_ruleLanguage9042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_103_in_ruleLanguage9059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_104_in_ruleLanguage9076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_105_in_ruleLanguage9093 = new BitSet(new long[]{0x0000000000000002L});
    }


}