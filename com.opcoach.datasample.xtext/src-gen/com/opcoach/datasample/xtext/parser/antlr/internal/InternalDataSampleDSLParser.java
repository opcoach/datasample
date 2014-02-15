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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DataSample'", "'{'", "'seed'", "'language'", "'packageURI'", "'badValueGeneratorNames'", "','", "'}'", "'package'", "'rootEntity'", "'entityGenerators'", "'fieldGenerators'", "'-'", "'EPackage'", "'nsURI'", "'nsPrefix'", "'eAnnotations'", "'eClassifiers'", "'eSubpackages'", "'EntityGenerator'", "'number'", "'entityName'", "'entity'", "'FieldGenerator'", "'fieldName'", "'errorRate'", "'generatorName'", "'generator'", "'structuralFeature'", "'abstract'", "'interface'", "'EClass'", "'instanceClassName'", "'instanceTypeName'", "'eSuperTypes'", "'('", "')'", "'eTypeParameters'", "'eOperations'", "'eStructuralFeatures'", "'eGenericSuperTypes'", "'EAnnotation'", "'source'", "'references'", "'details'", "'contents'", "'EStringToStringMapEntry'", "'key'", "'value'", "'EObject'", "'ETypeParameter'", "'eBounds'", "'EDataType'", "'serializable'", "'EEnum'", "'eLiterals'", "'EGenericType'", "'eTypeParameter'", "'eClassifier'", "'eUpperBound'", "'eTypeArguments'", "'eLowerBound'", "'true'", "'false'", "'EEnumLiteral'", "'literal'", "'Locale'", "'ReferenceGenerator'", "'badValueProportion'", "'randomSeed'", "'ID'", "'locale'", "'step'", "'badValueGenerator'", "'volatile'", "'transient'", "'unsettable'", "'derived'", "'iD'", "'EAttribute'", "'ordered'", "'unique'", "'lowerBound'", "'upperBound'", "'changeable'", "'defaultValueLiteral'", "'eType'", "'eGenericType'", "'containment'", "'EReference'", "'resolveProxies'", "'eOpposite'", "'eKeys'", "'EOperation'", "'eExceptions'", "'eParameters'", "'eGenericExceptions'", "'EParameter'", "'fr'", "'en'", "'de'", "'es'", "'it'"
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
    public static final int RULE_INT=6;
    public static final int T__113=113;
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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:77:1: ruleDataSample returns [EObject current=null] : ( () otherlv_1= 'DataSample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'seed' ( (lv_seed_5_0= ruleEInt ) ) )? (otherlv_6= 'language' ( (lv_language_7_0= ruleLanguage ) ) )? (otherlv_8= 'packageURI' ( (lv_packageURI_9_0= ruleEString ) ) )? (otherlv_10= 'badValueGeneratorNames' otherlv_11= '{' ( (lv_badValueGeneratorNames_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'package' ( ( ruleEString ) ) )? (otherlv_18= 'rootEntity' ( ( ruleEString ) ) )? (otherlv_20= 'entityGenerators' otherlv_21= '{' ( (lv_entityGenerators_22_0= ruleEntityGenerator ) ) (otherlv_23= ',' ( (lv_entityGenerators_24_0= ruleEntityGenerator ) ) )* otherlv_25= '}' )? (otherlv_26= 'fieldGenerators' otherlv_27= '{' ( (lv_fieldGenerators_28_0= ruleFieldGenerator ) ) (otherlv_29= ',' ( (lv_fieldGenerators_30_0= ruleFieldGenerator ) ) )* otherlv_31= '}' )? otherlv_32= '}' ) ;
    public final EObject ruleDataSample() throws RecognitionException {
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
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_seed_5_0 = null;

        Enumerator lv_language_7_0 = null;

        AntlrDatatypeRuleToken lv_packageURI_9_0 = null;

        AntlrDatatypeRuleToken lv_badValueGeneratorNames_12_0 = null;

        AntlrDatatypeRuleToken lv_badValueGeneratorNames_14_0 = null;

        EObject lv_entityGenerators_22_0 = null;

        EObject lv_entityGenerators_24_0 = null;

        EObject lv_fieldGenerators_28_0 = null;

        EObject lv_fieldGenerators_30_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:80:28: ( ( () otherlv_1= 'DataSample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'seed' ( (lv_seed_5_0= ruleEInt ) ) )? (otherlv_6= 'language' ( (lv_language_7_0= ruleLanguage ) ) )? (otherlv_8= 'packageURI' ( (lv_packageURI_9_0= ruleEString ) ) )? (otherlv_10= 'badValueGeneratorNames' otherlv_11= '{' ( (lv_badValueGeneratorNames_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'package' ( ( ruleEString ) ) )? (otherlv_18= 'rootEntity' ( ( ruleEString ) ) )? (otherlv_20= 'entityGenerators' otherlv_21= '{' ( (lv_entityGenerators_22_0= ruleEntityGenerator ) ) (otherlv_23= ',' ( (lv_entityGenerators_24_0= ruleEntityGenerator ) ) )* otherlv_25= '}' )? (otherlv_26= 'fieldGenerators' otherlv_27= '{' ( (lv_fieldGenerators_28_0= ruleFieldGenerator ) ) (otherlv_29= ',' ( (lv_fieldGenerators_30_0= ruleFieldGenerator ) ) )* otherlv_31= '}' )? otherlv_32= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:81:1: ( () otherlv_1= 'DataSample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'seed' ( (lv_seed_5_0= ruleEInt ) ) )? (otherlv_6= 'language' ( (lv_language_7_0= ruleLanguage ) ) )? (otherlv_8= 'packageURI' ( (lv_packageURI_9_0= ruleEString ) ) )? (otherlv_10= 'badValueGeneratorNames' otherlv_11= '{' ( (lv_badValueGeneratorNames_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'package' ( ( ruleEString ) ) )? (otherlv_18= 'rootEntity' ( ( ruleEString ) ) )? (otherlv_20= 'entityGenerators' otherlv_21= '{' ( (lv_entityGenerators_22_0= ruleEntityGenerator ) ) (otherlv_23= ',' ( (lv_entityGenerators_24_0= ruleEntityGenerator ) ) )* otherlv_25= '}' )? (otherlv_26= 'fieldGenerators' otherlv_27= '{' ( (lv_fieldGenerators_28_0= ruleFieldGenerator ) ) (otherlv_29= ',' ( (lv_fieldGenerators_30_0= ruleFieldGenerator ) ) )* otherlv_31= '}' )? otherlv_32= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:81:1: ( () otherlv_1= 'DataSample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'seed' ( (lv_seed_5_0= ruleEInt ) ) )? (otherlv_6= 'language' ( (lv_language_7_0= ruleLanguage ) ) )? (otherlv_8= 'packageURI' ( (lv_packageURI_9_0= ruleEString ) ) )? (otherlv_10= 'badValueGeneratorNames' otherlv_11= '{' ( (lv_badValueGeneratorNames_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'package' ( ( ruleEString ) ) )? (otherlv_18= 'rootEntity' ( ( ruleEString ) ) )? (otherlv_20= 'entityGenerators' otherlv_21= '{' ( (lv_entityGenerators_22_0= ruleEntityGenerator ) ) (otherlv_23= ',' ( (lv_entityGenerators_24_0= ruleEntityGenerator ) ) )* otherlv_25= '}' )? (otherlv_26= 'fieldGenerators' otherlv_27= '{' ( (lv_fieldGenerators_28_0= ruleFieldGenerator ) ) (otherlv_29= ',' ( (lv_fieldGenerators_30_0= ruleFieldGenerator ) ) )* otherlv_31= '}' )? otherlv_32= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:81:2: () otherlv_1= 'DataSample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'seed' ( (lv_seed_5_0= ruleEInt ) ) )? (otherlv_6= 'language' ( (lv_language_7_0= ruleLanguage ) ) )? (otherlv_8= 'packageURI' ( (lv_packageURI_9_0= ruleEString ) ) )? (otherlv_10= 'badValueGeneratorNames' otherlv_11= '{' ( (lv_badValueGeneratorNames_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'package' ( ( ruleEString ) ) )? (otherlv_18= 'rootEntity' ( ( ruleEString ) ) )? (otherlv_20= 'entityGenerators' otherlv_21= '{' ( (lv_entityGenerators_22_0= ruleEntityGenerator ) ) (otherlv_23= ',' ( (lv_entityGenerators_24_0= ruleEntityGenerator ) ) )* otherlv_25= '}' )? (otherlv_26= 'fieldGenerators' otherlv_27= '{' ( (lv_fieldGenerators_28_0= ruleFieldGenerator ) ) (otherlv_29= ',' ( (lv_fieldGenerators_30_0= ruleFieldGenerator ) ) )* otherlv_31= '}' )? otherlv_32= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:81:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDataSampleAccess().getDataSampleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleDataSample131); 

                	newLeafNode(otherlv_1, grammarAccess.getDataSampleAccess().getDataSampleKeyword_1());
                
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

                	newLeafNode(otherlv_3, grammarAccess.getDataSampleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:113:1: (otherlv_4= 'seed' ( (lv_seed_5_0= ruleEInt ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:113:3: otherlv_4= 'seed' ( (lv_seed_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDataSample177); 

                        	newLeafNode(otherlv_4, grammarAccess.getDataSampleAccess().getSeedKeyword_4_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:117:1: ( (lv_seed_5_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:118:1: (lv_seed_5_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:118:1: (lv_seed_5_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:119:3: lv_seed_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataSampleAccess().getSeedEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleDataSample198);
                    lv_seed_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
                    	        }
                           		set(
                           			current, 
                           			"seed",
                            		lv_seed_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:135:4: (otherlv_6= 'language' ( (lv_language_7_0= ruleLanguage ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:135:6: otherlv_6= 'language' ( (lv_language_7_0= ruleLanguage ) )
                    {
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDataSample213); 

                        	newLeafNode(otherlv_6, grammarAccess.getDataSampleAccess().getLanguageKeyword_5_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:139:1: ( (lv_language_7_0= ruleLanguage ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:140:1: (lv_language_7_0= ruleLanguage )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:140:1: (lv_language_7_0= ruleLanguage )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:141:3: lv_language_7_0= ruleLanguage
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataSampleAccess().getLanguageLanguageEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLanguage_in_ruleDataSample234);
                    lv_language_7_0=ruleLanguage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
                    	        }
                           		set(
                           			current, 
                           			"language",
                            		lv_language_7_0, 
                            		"Language");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:157:4: (otherlv_8= 'packageURI' ( (lv_packageURI_9_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:157:6: otherlv_8= 'packageURI' ( (lv_packageURI_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDataSample249); 

                        	newLeafNode(otherlv_8, grammarAccess.getDataSampleAccess().getPackageURIKeyword_6_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:161:1: ( (lv_packageURI_9_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:162:1: (lv_packageURI_9_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:162:1: (lv_packageURI_9_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:163:3: lv_packageURI_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataSampleAccess().getPackageURIEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDataSample270);
                    lv_packageURI_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
                    	        }
                           		set(
                           			current, 
                           			"packageURI",
                            		lv_packageURI_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:179:4: (otherlv_10= 'badValueGeneratorNames' otherlv_11= '{' ( (lv_badValueGeneratorNames_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) ) )* otherlv_15= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:179:6: otherlv_10= 'badValueGeneratorNames' otherlv_11= '{' ( (lv_badValueGeneratorNames_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDataSample285); 

                        	newLeafNode(otherlv_10, grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDataSample297); 

                        	newLeafNode(otherlv_11, grammarAccess.getDataSampleAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:187:1: ( (lv_badValueGeneratorNames_12_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:188:1: (lv_badValueGeneratorNames_12_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:188:1: (lv_badValueGeneratorNames_12_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:189:3: lv_badValueGeneratorNames_12_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesEStringParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDataSample318);
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
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:205:4: otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDataSample331); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getDataSampleAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:209:1: ( (lv_badValueGeneratorNames_14_0= ruleEString ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:210:1: (lv_badValueGeneratorNames_14_0= ruleEString )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:210:1: (lv_badValueGeneratorNames_14_0= ruleEString )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:211:3: lv_badValueGeneratorNames_14_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesEStringParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDataSample352);
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
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDataSample366); 

                        	newLeafNode(otherlv_15, grammarAccess.getDataSampleAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:231:3: (otherlv_16= 'package' ( ( ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:231:5: otherlv_16= 'package' ( ( ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDataSample381); 

                        	newLeafNode(otherlv_16, grammarAccess.getDataSampleAccess().getPackageKeyword_8_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:235:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:236:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:236:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:237:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataSampleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getDataSampleAccess().getPackageEPackageCrossReference_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDataSample404);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:250:4: (otherlv_18= 'rootEntity' ( ( ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:250:6: otherlv_18= 'rootEntity' ( ( ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDataSample419); 

                        	newLeafNode(otherlv_18, grammarAccess.getDataSampleAccess().getRootEntityKeyword_9_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:254:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:255:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:255:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:256:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataSampleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getDataSampleAccess().getRootEntityEClassCrossReference_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDataSample442);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:269:4: (otherlv_20= 'entityGenerators' otherlv_21= '{' ( (lv_entityGenerators_22_0= ruleEntityGenerator ) ) (otherlv_23= ',' ( (lv_entityGenerators_24_0= ruleEntityGenerator ) ) )* otherlv_25= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:269:6: otherlv_20= 'entityGenerators' otherlv_21= '{' ( (lv_entityGenerators_22_0= ruleEntityGenerator ) ) (otherlv_23= ',' ( (lv_entityGenerators_24_0= ruleEntityGenerator ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleDataSample457); 

                        	newLeafNode(otherlv_20, grammarAccess.getDataSampleAccess().getEntityGeneratorsKeyword_10_0());
                        
                    otherlv_21=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDataSample469); 

                        	newLeafNode(otherlv_21, grammarAccess.getDataSampleAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:277:1: ( (lv_entityGenerators_22_0= ruleEntityGenerator ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:278:1: (lv_entityGenerators_22_0= ruleEntityGenerator )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:278:1: (lv_entityGenerators_22_0= ruleEntityGenerator )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:279:3: lv_entityGenerators_22_0= ruleEntityGenerator
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataSampleAccess().getEntityGeneratorsEntityGeneratorParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEntityGenerator_in_ruleDataSample490);
                    lv_entityGenerators_22_0=ruleEntityGenerator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
                    	        }
                           		add(
                           			current, 
                           			"entityGenerators",
                            		lv_entityGenerators_22_0, 
                            		"EntityGenerator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:295:2: (otherlv_23= ',' ( (lv_entityGenerators_24_0= ruleEntityGenerator ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==17) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:295:4: otherlv_23= ',' ( (lv_entityGenerators_24_0= ruleEntityGenerator ) )
                    	    {
                    	    otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDataSample503); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getDataSampleAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:299:1: ( (lv_entityGenerators_24_0= ruleEntityGenerator ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:300:1: (lv_entityGenerators_24_0= ruleEntityGenerator )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:300:1: (lv_entityGenerators_24_0= ruleEntityGenerator )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:301:3: lv_entityGenerators_24_0= ruleEntityGenerator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataSampleAccess().getEntityGeneratorsEntityGeneratorParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEntityGenerator_in_ruleDataSample524);
                    	    lv_entityGenerators_24_0=ruleEntityGenerator();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"entityGenerators",
                    	            		lv_entityGenerators_24_0, 
                    	            		"EntityGenerator");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDataSample538); 

                        	newLeafNode(otherlv_25, grammarAccess.getDataSampleAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:321:3: (otherlv_26= 'fieldGenerators' otherlv_27= '{' ( (lv_fieldGenerators_28_0= ruleFieldGenerator ) ) (otherlv_29= ',' ( (lv_fieldGenerators_30_0= ruleFieldGenerator ) ) )* otherlv_31= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:321:5: otherlv_26= 'fieldGenerators' otherlv_27= '{' ( (lv_fieldGenerators_28_0= ruleFieldGenerator ) ) (otherlv_29= ',' ( (lv_fieldGenerators_30_0= ruleFieldGenerator ) ) )* otherlv_31= '}'
                    {
                    otherlv_26=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleDataSample553); 

                        	newLeafNode(otherlv_26, grammarAccess.getDataSampleAccess().getFieldGeneratorsKeyword_11_0());
                        
                    otherlv_27=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDataSample565); 

                        	newLeafNode(otherlv_27, grammarAccess.getDataSampleAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:329:1: ( (lv_fieldGenerators_28_0= ruleFieldGenerator ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:330:1: (lv_fieldGenerators_28_0= ruleFieldGenerator )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:330:1: (lv_fieldGenerators_28_0= ruleFieldGenerator )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:331:3: lv_fieldGenerators_28_0= ruleFieldGenerator
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataSampleAccess().getFieldGeneratorsFieldGeneratorParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFieldGenerator_in_ruleDataSample586);
                    lv_fieldGenerators_28_0=ruleFieldGenerator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
                    	        }
                           		add(
                           			current, 
                           			"fieldGenerators",
                            		lv_fieldGenerators_28_0, 
                            		"FieldGenerator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:347:2: (otherlv_29= ',' ( (lv_fieldGenerators_30_0= ruleFieldGenerator ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==17) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:347:4: otherlv_29= ',' ( (lv_fieldGenerators_30_0= ruleFieldGenerator ) )
                    	    {
                    	    otherlv_29=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDataSample599); 

                    	        	newLeafNode(otherlv_29, grammarAccess.getDataSampleAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:351:1: ( (lv_fieldGenerators_30_0= ruleFieldGenerator ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:352:1: (lv_fieldGenerators_30_0= ruleFieldGenerator )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:352:1: (lv_fieldGenerators_30_0= ruleFieldGenerator )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:353:3: lv_fieldGenerators_30_0= ruleFieldGenerator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataSampleAccess().getFieldGeneratorsFieldGeneratorParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFieldGenerator_in_ruleDataSample620);
                    	    lv_fieldGenerators_30_0=ruleFieldGenerator();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"fieldGenerators",
                    	            		lv_fieldGenerators_30_0, 
                    	            		"FieldGenerator");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDataSample634); 

                        	newLeafNode(otherlv_31, grammarAccess.getDataSampleAccess().getRightCurlyBracketKeyword_11_4());
                        

                    }
                    break;

            }

            otherlv_32=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDataSample648); 

                	newLeafNode(otherlv_32, grammarAccess.getDataSampleAccess().getRightCurlyBracketKeyword_12());
                

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:385:1: entryRuleEClassifier returns [EObject current=null] : iv_ruleEClassifier= ruleEClassifier EOF ;
    public final EObject entryRuleEClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClassifier = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:386:2: (iv_ruleEClassifier= ruleEClassifier EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:387:2: iv_ruleEClassifier= ruleEClassifier EOF
            {
             newCompositeNode(grammarAccess.getEClassifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEClassifier_in_entryRuleEClassifier684);
            iv_ruleEClassifier=ruleEClassifier();

            state._fsp--;

             current =iv_ruleEClassifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEClassifier694); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:394:1: ruleEClassifier returns [EObject current=null] : (this_EClass_0= ruleEClass | this_EDataType_Impl_1= ruleEDataType_Impl | this_EEnum_2= ruleEEnum ) ;
    public final EObject ruleEClassifier() throws RecognitionException {
        EObject current = null;

        EObject this_EClass_0 = null;

        EObject this_EDataType_Impl_1 = null;

        EObject this_EEnum_2 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:397:28: ( (this_EClass_0= ruleEClass | this_EDataType_Impl_1= ruleEDataType_Impl | this_EEnum_2= ruleEEnum ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:398:1: (this_EClass_0= ruleEClass | this_EDataType_Impl_1= ruleEDataType_Impl | this_EEnum_2= ruleEEnum )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:398:1: (this_EClass_0= ruleEClass | this_EDataType_Impl_1= ruleEDataType_Impl | this_EEnum_2= ruleEEnum )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 40:
            case 41:
            case 42:
                {
                alt12=1;
                }
                break;
            case 63:
                {
                alt12=2;
                }
                break;
            case 65:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:399:5: this_EClass_0= ruleEClass
                    {
                     
                            newCompositeNode(grammarAccess.getEClassifierAccess().getEClassParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEClass_in_ruleEClassifier741);
                    this_EClass_0=ruleEClass();

                    state._fsp--;

                     
                            current = this_EClass_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:409:5: this_EDataType_Impl_1= ruleEDataType_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getEClassifierAccess().getEDataType_ImplParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEDataType_Impl_in_ruleEClassifier768);
                    this_EDataType_Impl_1=ruleEDataType_Impl();

                    state._fsp--;

                     
                            current = this_EDataType_Impl_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:419:5: this_EEnum_2= ruleEEnum
                    {
                     
                            newCompositeNode(grammarAccess.getEClassifierAccess().getEEnumParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEEnum_in_ruleEClassifier795);
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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:437:1: entryRuleEStructuralFeature returns [EObject current=null] : iv_ruleEStructuralFeature= ruleEStructuralFeature EOF ;
    public final EObject entryRuleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStructuralFeature = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:438:2: (iv_ruleEStructuralFeature= ruleEStructuralFeature EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:439:2: iv_ruleEStructuralFeature= ruleEStructuralFeature EOF
            {
             newCompositeNode(grammarAccess.getEStructuralFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEStructuralFeature_in_entryRuleEStructuralFeature832);
            iv_ruleEStructuralFeature=ruleEStructuralFeature();

            state._fsp--;

             current =iv_ruleEStructuralFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEStructuralFeature842); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:446:1: ruleEStructuralFeature returns [EObject current=null] : (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) ;
    public final EObject ruleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject this_EAttribute_0 = null;

        EObject this_EReference_1 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:449:28: ( (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:450:1: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:450:1: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            int alt13=2;
            switch ( input.LA(1) ) {
            case 85:
                {
                switch ( input.LA(2) ) {
                case 86:
                    {
                    switch ( input.LA(3) ) {
                    case 87:
                        {
                        switch ( input.LA(4) ) {
                        case 88:
                            {
                            int LA13_4 = input.LA(5);

                            if ( ((LA13_4>=99 && LA13_4<=100)) ) {
                                alt13=2;
                            }
                            else if ( ((LA13_4>=89 && LA13_4<=90)) ) {
                                alt13=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 4, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 99:
                        case 100:
                            {
                            alt13=2;
                            }
                            break;
                        case 89:
                        case 90:
                            {
                            alt13=1;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 88:
                        {
                        int LA13_4 = input.LA(4);

                        if ( ((LA13_4>=99 && LA13_4<=100)) ) {
                            alt13=2;
                        }
                        else if ( ((LA13_4>=89 && LA13_4<=90)) ) {
                            alt13=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 89:
                    case 90:
                        {
                        alt13=1;
                        }
                        break;
                    case 99:
                    case 100:
                        {
                        alt13=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case 87:
                    {
                    switch ( input.LA(3) ) {
                    case 88:
                        {
                        int LA13_4 = input.LA(4);

                        if ( ((LA13_4>=99 && LA13_4<=100)) ) {
                            alt13=2;
                        }
                        else if ( ((LA13_4>=89 && LA13_4<=90)) ) {
                            alt13=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 99:
                    case 100:
                        {
                        alt13=2;
                        }
                        break;
                    case 89:
                    case 90:
                        {
                        alt13=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 88:
                    {
                    int LA13_4 = input.LA(3);

                    if ( ((LA13_4>=99 && LA13_4<=100)) ) {
                        alt13=2;
                    }
                    else if ( ((LA13_4>=89 && LA13_4<=90)) ) {
                        alt13=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 99:
                case 100:
                    {
                    alt13=2;
                    }
                    break;
                case 89:
                case 90:
                    {
                    alt13=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }

                }
                break;
            case 86:
                {
                switch ( input.LA(2) ) {
                case 87:
                    {
                    switch ( input.LA(3) ) {
                    case 88:
                        {
                        int LA13_4 = input.LA(4);

                        if ( ((LA13_4>=99 && LA13_4<=100)) ) {
                            alt13=2;
                        }
                        else if ( ((LA13_4>=89 && LA13_4<=90)) ) {
                            alt13=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 99:
                    case 100:
                        {
                        alt13=2;
                        }
                        break;
                    case 89:
                    case 90:
                        {
                        alt13=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 88:
                    {
                    int LA13_4 = input.LA(3);

                    if ( ((LA13_4>=99 && LA13_4<=100)) ) {
                        alt13=2;
                    }
                    else if ( ((LA13_4>=89 && LA13_4<=90)) ) {
                        alt13=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 89:
                case 90:
                    {
                    alt13=1;
                    }
                    break;
                case 99:
                case 100:
                    {
                    alt13=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }

                }
                break;
            case 87:
                {
                switch ( input.LA(2) ) {
                case 88:
                    {
                    int LA13_4 = input.LA(3);

                    if ( ((LA13_4>=99 && LA13_4<=100)) ) {
                        alt13=2;
                    }
                    else if ( ((LA13_4>=89 && LA13_4<=90)) ) {
                        alt13=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 99:
                case 100:
                    {
                    alt13=2;
                    }
                    break;
                case 89:
                case 90:
                    {
                    alt13=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;
                }

                }
                break;
            case 88:
                {
                int LA13_4 = input.LA(2);

                if ( ((LA13_4>=99 && LA13_4<=100)) ) {
                    alt13=2;
                }
                else if ( ((LA13_4>=89 && LA13_4<=90)) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 4, input);

                    throw nvae;
                }
                }
                break;
            case 89:
            case 90:
                {
                alt13=1;
                }
                break;
            case 99:
            case 100:
                {
                alt13=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:451:5: this_EAttribute_0= ruleEAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getEStructuralFeatureAccess().getEAttributeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEAttribute_in_ruleEStructuralFeature889);
                    this_EAttribute_0=ruleEAttribute();

                    state._fsp--;

                     
                            current = this_EAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:461:5: this_EReference_1= ruleEReference
                    {
                     
                            newCompositeNode(grammarAccess.getEStructuralFeatureAccess().getEReferenceParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEReference_in_ruleEStructuralFeature916);
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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:477:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:478:2: (iv_ruleEString= ruleEString EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:479:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString952);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString963); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:486:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:489:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:490:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:490:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:490:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1003); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:498:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1029); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:513:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:514:2: (iv_ruleEInt= ruleEInt EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:515:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1075);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1086); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:522:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:525:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:526:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:526:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:526:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:526:2: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:527:2: kw= '-'
                    {
                    kw=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEInt1125); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1142); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:547:1: entryRuleEPackage returns [EObject current=null] : iv_ruleEPackage= ruleEPackage EOF ;
    public final EObject entryRuleEPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPackage = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:548:2: (iv_ruleEPackage= ruleEPackage EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:549:2: iv_ruleEPackage= ruleEPackage EOF
            {
             newCompositeNode(grammarAccess.getEPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEPackage_in_entryRuleEPackage1187);
            iv_ruleEPackage=ruleEPackage();

            state._fsp--;

             current =iv_ruleEPackage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEPackage1197); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:556:1: ruleEPackage returns [EObject current=null] : ( () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:559:28: ( ( () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:560:1: ( () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:560:1: ( () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:560:2: () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:560:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:561:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEPackageAccess().getEPackageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEPackage1243); 

                	newLeafNode(otherlv_1, grammarAccess.getEPackageAccess().getEPackageKeyword_1());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:570:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:571:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:571:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:572:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEPackageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEPackage1264);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEPackage1276); 

                	newLeafNode(otherlv_3, grammarAccess.getEPackageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:592:1: (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:592:3: otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEPackage1289); 

                        	newLeafNode(otherlv_4, grammarAccess.getEPackageAccess().getNsURIKeyword_4_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:596:1: ( (lv_nsURI_5_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:597:1: (lv_nsURI_5_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:597:1: (lv_nsURI_5_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:598:3: lv_nsURI_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEPackageAccess().getNsURIEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEPackage1310);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:614:4: (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:614:6: otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEPackage1325); 

                        	newLeafNode(otherlv_6, grammarAccess.getEPackageAccess().getNsPrefixKeyword_5_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:618:1: ( (lv_nsPrefix_7_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:619:1: (lv_nsPrefix_7_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:619:1: (lv_nsPrefix_7_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:620:3: lv_nsPrefix_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEPackageAccess().getNsPrefixEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEPackage1346);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:636:4: (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:636:6: otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEPackage1361); 

                        	newLeafNode(otherlv_8, grammarAccess.getEPackageAccess().getEAnnotationsKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEPackage1373); 

                        	newLeafNode(otherlv_9, grammarAccess.getEPackageAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:644:1: ( (lv_eAnnotations_10_0= ruleEAnnotation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:645:1: (lv_eAnnotations_10_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:645:1: (lv_eAnnotations_10_0= ruleEAnnotation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:646:3: lv_eAnnotations_10_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEPackageAccess().getEAnnotationsEAnnotationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEPackage1394);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:662:2: (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==17) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:662:4: otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEPackage1407); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getEPackageAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:666:1: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:667:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:667:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:668:3: lv_eAnnotations_12_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEPackageAccess().getEAnnotationsEAnnotationParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEPackage1428);
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
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEPackage1442); 

                        	newLeafNode(otherlv_13, grammarAccess.getEPackageAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:688:3: (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:688:5: otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEPackage1457); 

                        	newLeafNode(otherlv_14, grammarAccess.getEPackageAccess().getEClassifiersKeyword_7_0());
                        
                    otherlv_15=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEPackage1469); 

                        	newLeafNode(otherlv_15, grammarAccess.getEPackageAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:696:1: ( (lv_eClassifiers_16_0= ruleEClassifier ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:697:1: (lv_eClassifiers_16_0= ruleEClassifier )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:697:1: (lv_eClassifiers_16_0= ruleEClassifier )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:698:3: lv_eClassifiers_16_0= ruleEClassifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getEPackageAccess().getEClassifiersEClassifierParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEClassifier_in_ruleEPackage1490);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:714:2: (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==17) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:714:4: otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) )
                    	    {
                    	    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEPackage1503); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getEPackageAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:718:1: ( (lv_eClassifiers_18_0= ruleEClassifier ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:719:1: (lv_eClassifiers_18_0= ruleEClassifier )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:719:1: (lv_eClassifiers_18_0= ruleEClassifier )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:720:3: lv_eClassifiers_18_0= ruleEClassifier
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEPackageAccess().getEClassifiersEClassifierParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEClassifier_in_ruleEPackage1524);
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
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEPackage1538); 

                        	newLeafNode(otherlv_19, grammarAccess.getEPackageAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:740:3: (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:740:5: otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEPackage1553); 

                        	newLeafNode(otherlv_20, grammarAccess.getEPackageAccess().getESubpackagesKeyword_8_0());
                        
                    otherlv_21=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEPackage1565); 

                        	newLeafNode(otherlv_21, grammarAccess.getEPackageAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:748:1: ( (lv_eSubpackages_22_0= ruleEPackage ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:749:1: (lv_eSubpackages_22_0= ruleEPackage )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:749:1: (lv_eSubpackages_22_0= ruleEPackage )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:750:3: lv_eSubpackages_22_0= ruleEPackage
                    {
                     
                    	        newCompositeNode(grammarAccess.getEPackageAccess().getESubpackagesEPackageParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEPackage_in_ruleEPackage1586);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:766:2: (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==17) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:766:4: otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) )
                    	    {
                    	    otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEPackage1599); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getEPackageAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:770:1: ( (lv_eSubpackages_24_0= ruleEPackage ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:771:1: (lv_eSubpackages_24_0= ruleEPackage )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:771:1: (lv_eSubpackages_24_0= ruleEPackage )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:772:3: lv_eSubpackages_24_0= ruleEPackage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEPackageAccess().getESubpackagesEPackageParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEPackage_in_ruleEPackage1620);
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
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEPackage1634); 

                        	newLeafNode(otherlv_25, grammarAccess.getEPackageAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_26=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEPackage1648); 

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


    // $ANTLR start "entryRuleEntityGenerator"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:804:1: entryRuleEntityGenerator returns [EObject current=null] : iv_ruleEntityGenerator= ruleEntityGenerator EOF ;
    public final EObject entryRuleEntityGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityGenerator = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:805:2: (iv_ruleEntityGenerator= ruleEntityGenerator EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:806:2: iv_ruleEntityGenerator= ruleEntityGenerator EOF
            {
             newCompositeNode(grammarAccess.getEntityGeneratorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntityGenerator_in_entryRuleEntityGenerator1684);
            iv_ruleEntityGenerator=ruleEntityGenerator();

            state._fsp--;

             current =iv_ruleEntityGenerator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntityGenerator1694); 

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
    // $ANTLR end "entryRuleEntityGenerator"


    // $ANTLR start "ruleEntityGenerator"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:813:1: ruleEntityGenerator returns [EObject current=null] : ( () otherlv_1= 'EntityGenerator' otherlv_2= '{' (otherlv_3= 'number' ( (lv_number_4_0= ruleEInt ) ) )? (otherlv_5= 'entityName' ( (lv_entityName_6_0= ruleEString ) ) )? (otherlv_7= 'entity' ( ( ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleEntityGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_number_4_0 = null;

        AntlrDatatypeRuleToken lv_entityName_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:816:28: ( ( () otherlv_1= 'EntityGenerator' otherlv_2= '{' (otherlv_3= 'number' ( (lv_number_4_0= ruleEInt ) ) )? (otherlv_5= 'entityName' ( (lv_entityName_6_0= ruleEString ) ) )? (otherlv_7= 'entity' ( ( ruleEString ) ) )? otherlv_9= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:817:1: ( () otherlv_1= 'EntityGenerator' otherlv_2= '{' (otherlv_3= 'number' ( (lv_number_4_0= ruleEInt ) ) )? (otherlv_5= 'entityName' ( (lv_entityName_6_0= ruleEString ) ) )? (otherlv_7= 'entity' ( ( ruleEString ) ) )? otherlv_9= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:817:1: ( () otherlv_1= 'EntityGenerator' otherlv_2= '{' (otherlv_3= 'number' ( (lv_number_4_0= ruleEInt ) ) )? (otherlv_5= 'entityName' ( (lv_entityName_6_0= ruleEString ) ) )? (otherlv_7= 'entity' ( ( ruleEString ) ) )? otherlv_9= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:817:2: () otherlv_1= 'EntityGenerator' otherlv_2= '{' (otherlv_3= 'number' ( (lv_number_4_0= ruleEInt ) ) )? (otherlv_5= 'entityName' ( (lv_entityName_6_0= ruleEString ) ) )? (otherlv_7= 'entity' ( ( ruleEString ) ) )? otherlv_9= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:817:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:818:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntityGeneratorAccess().getEntityGeneratorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEntityGenerator1740); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityGeneratorAccess().getEntityGeneratorKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEntityGenerator1752); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityGeneratorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:831:1: (otherlv_3= 'number' ( (lv_number_4_0= ruleEInt ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:831:3: otherlv_3= 'number' ( (lv_number_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleEntityGenerator1765); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityGeneratorAccess().getNumberKeyword_3_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:835:1: ( (lv_number_4_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:836:1: (lv_number_4_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:836:1: (lv_number_4_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:837:3: lv_number_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityGeneratorAccess().getNumberEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEntityGenerator1786);
                    lv_number_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"number",
                            		lv_number_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:853:4: (otherlv_5= 'entityName' ( (lv_entityName_6_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:853:6: otherlv_5= 'entityName' ( (lv_entityName_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEntityGenerator1801); 

                        	newLeafNode(otherlv_5, grammarAccess.getEntityGeneratorAccess().getEntityNameKeyword_4_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:857:1: ( (lv_entityName_6_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:858:1: (lv_entityName_6_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:858:1: (lv_entityName_6_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:859:3: lv_entityName_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityGeneratorAccess().getEntityNameEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEntityGenerator1822);
                    lv_entityName_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"entityName",
                            		lv_entityName_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:875:4: (otherlv_7= 'entity' ( ( ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:875:6: otherlv_7= 'entity' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEntityGenerator1837); 

                        	newLeafNode(otherlv_7, grammarAccess.getEntityGeneratorAccess().getEntityKeyword_5_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:879:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:880:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:880:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:881:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityGeneratorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEntityGeneratorAccess().getEntityEClassCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEntityGenerator1860);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEntityGenerator1874); 

                	newLeafNode(otherlv_9, grammarAccess.getEntityGeneratorAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleEntityGenerator"


    // $ANTLR start "entryRuleFieldGenerator"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:906:1: entryRuleFieldGenerator returns [EObject current=null] : iv_ruleFieldGenerator= ruleFieldGenerator EOF ;
    public final EObject entryRuleFieldGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldGenerator = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:907:2: (iv_ruleFieldGenerator= ruleFieldGenerator EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:908:2: iv_ruleFieldGenerator= ruleFieldGenerator EOF
            {
             newCompositeNode(grammarAccess.getFieldGeneratorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFieldGenerator_in_entryRuleFieldGenerator1910);
            iv_ruleFieldGenerator=ruleFieldGenerator();

            state._fsp--;

             current =iv_ruleFieldGenerator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFieldGenerator1920); 

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
    // $ANTLR end "entryRuleFieldGenerator"


    // $ANTLR start "ruleFieldGenerator"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:915:1: ruleFieldGenerator returns [EObject current=null] : (otherlv_0= 'FieldGenerator' otherlv_1= '{' (otherlv_2= 'entityName' ( (lv_entityName_3_0= ruleEString ) ) )? (otherlv_4= 'fieldName' ( (lv_fieldName_5_0= ruleEString ) ) )? (otherlv_6= 'errorRate' ( (lv_errorRate_7_0= ruleEInt ) ) )? (otherlv_8= 'generatorName' ( (lv_generatorName_9_0= ruleEString ) ) )? otherlv_10= 'generator' ( ( ruleEString ) ) (otherlv_12= 'structuralFeature' ( ( ruleEString ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleFieldGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_entityName_3_0 = null;

        AntlrDatatypeRuleToken lv_fieldName_5_0 = null;

        AntlrDatatypeRuleToken lv_errorRate_7_0 = null;

        AntlrDatatypeRuleToken lv_generatorName_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:918:28: ( (otherlv_0= 'FieldGenerator' otherlv_1= '{' (otherlv_2= 'entityName' ( (lv_entityName_3_0= ruleEString ) ) )? (otherlv_4= 'fieldName' ( (lv_fieldName_5_0= ruleEString ) ) )? (otherlv_6= 'errorRate' ( (lv_errorRate_7_0= ruleEInt ) ) )? (otherlv_8= 'generatorName' ( (lv_generatorName_9_0= ruleEString ) ) )? otherlv_10= 'generator' ( ( ruleEString ) ) (otherlv_12= 'structuralFeature' ( ( ruleEString ) ) )? otherlv_14= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:919:1: (otherlv_0= 'FieldGenerator' otherlv_1= '{' (otherlv_2= 'entityName' ( (lv_entityName_3_0= ruleEString ) ) )? (otherlv_4= 'fieldName' ( (lv_fieldName_5_0= ruleEString ) ) )? (otherlv_6= 'errorRate' ( (lv_errorRate_7_0= ruleEInt ) ) )? (otherlv_8= 'generatorName' ( (lv_generatorName_9_0= ruleEString ) ) )? otherlv_10= 'generator' ( ( ruleEString ) ) (otherlv_12= 'structuralFeature' ( ( ruleEString ) ) )? otherlv_14= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:919:1: (otherlv_0= 'FieldGenerator' otherlv_1= '{' (otherlv_2= 'entityName' ( (lv_entityName_3_0= ruleEString ) ) )? (otherlv_4= 'fieldName' ( (lv_fieldName_5_0= ruleEString ) ) )? (otherlv_6= 'errorRate' ( (lv_errorRate_7_0= ruleEInt ) ) )? (otherlv_8= 'generatorName' ( (lv_generatorName_9_0= ruleEString ) ) )? otherlv_10= 'generator' ( ( ruleEString ) ) (otherlv_12= 'structuralFeature' ( ( ruleEString ) ) )? otherlv_14= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:919:3: otherlv_0= 'FieldGenerator' otherlv_1= '{' (otherlv_2= 'entityName' ( (lv_entityName_3_0= ruleEString ) ) )? (otherlv_4= 'fieldName' ( (lv_fieldName_5_0= ruleEString ) ) )? (otherlv_6= 'errorRate' ( (lv_errorRate_7_0= ruleEInt ) ) )? (otherlv_8= 'generatorName' ( (lv_generatorName_9_0= ruleEString ) ) )? otherlv_10= 'generator' ( ( ruleEString ) ) (otherlv_12= 'structuralFeature' ( ( ruleEString ) ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleFieldGenerator1957); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldGeneratorAccess().getFieldGeneratorKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFieldGenerator1969); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldGeneratorAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:927:1: (otherlv_2= 'entityName' ( (lv_entityName_3_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:927:3: otherlv_2= 'entityName' ( (lv_entityName_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleFieldGenerator1982); 

                        	newLeafNode(otherlv_2, grammarAccess.getFieldGeneratorAccess().getEntityNameKeyword_2_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:931:1: ( (lv_entityName_3_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:932:1: (lv_entityName_3_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:932:1: (lv_entityName_3_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:933:3: lv_entityName_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getEntityNameEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFieldGenerator2003);
                    lv_entityName_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"entityName",
                            		lv_entityName_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:949:4: (otherlv_4= 'fieldName' ( (lv_fieldName_5_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:949:6: otherlv_4= 'fieldName' ( (lv_fieldName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleFieldGenerator2018); 

                        	newLeafNode(otherlv_4, grammarAccess.getFieldGeneratorAccess().getFieldNameKeyword_3_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:953:1: ( (lv_fieldName_5_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:954:1: (lv_fieldName_5_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:954:1: (lv_fieldName_5_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:955:3: lv_fieldName_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getFieldNameEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFieldGenerator2039);
                    lv_fieldName_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"fieldName",
                            		lv_fieldName_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:971:4: (otherlv_6= 'errorRate' ( (lv_errorRate_7_0= ruleEInt ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:971:6: otherlv_6= 'errorRate' ( (lv_errorRate_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleFieldGenerator2054); 

                        	newLeafNode(otherlv_6, grammarAccess.getFieldGeneratorAccess().getErrorRateKeyword_4_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:975:1: ( (lv_errorRate_7_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:976:1: (lv_errorRate_7_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:976:1: (lv_errorRate_7_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:977:3: lv_errorRate_7_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getErrorRateEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleFieldGenerator2075);
                    lv_errorRate_7_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"errorRate",
                            		lv_errorRate_7_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:993:4: (otherlv_8= 'generatorName' ( (lv_generatorName_9_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:993:6: otherlv_8= 'generatorName' ( (lv_generatorName_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleFieldGenerator2090); 

                        	newLeafNode(otherlv_8, grammarAccess.getFieldGeneratorAccess().getGeneratorNameKeyword_5_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:997:1: ( (lv_generatorName_9_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:998:1: (lv_generatorName_9_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:998:1: (lv_generatorName_9_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:999:3: lv_generatorName_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getGeneratorNameEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFieldGenerator2111);
                    lv_generatorName_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"generatorName",
                            		lv_generatorName_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleFieldGenerator2125); 

                	newLeafNode(otherlv_10, grammarAccess.getFieldGeneratorAccess().getGeneratorKeyword_6());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1019:1: ( ( ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1020:1: ( ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1020:1: ( ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1021:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldGeneratorRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getGeneratorValueGeneratorCrossReference_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFieldGenerator2148);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1034:2: (otherlv_12= 'structuralFeature' ( ( ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1034:4: otherlv_12= 'structuralFeature' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleFieldGenerator2161); 

                        	newLeafNode(otherlv_12, grammarAccess.getFieldGeneratorAccess().getStructuralFeatureKeyword_8_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1038:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1039:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1039:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1040:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldGeneratorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getStructuralFeatureEStructuralFeatureCrossReference_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFieldGenerator2184);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFieldGenerator2198); 

                	newLeafNode(otherlv_14, grammarAccess.getFieldGeneratorAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleFieldGenerator"


    // $ANTLR start "entryRuleEClass"
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1065:1: entryRuleEClass returns [EObject current=null] : iv_ruleEClass= ruleEClass EOF ;
    public final EObject entryRuleEClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClass = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1066:2: (iv_ruleEClass= ruleEClass EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1067:2: iv_ruleEClass= ruleEClass EOF
            {
             newCompositeNode(grammarAccess.getEClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEClass_in_entryRuleEClass2234);
            iv_ruleEClass=ruleEClass();

            state._fsp--;

             current =iv_ruleEClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEClass2244); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1074:1: ruleEClass returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1077:28: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1078:1: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1078:1: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1078:2: () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1078:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1079:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEClassAccess().getEClassAction_0(),
                        current);
                

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1084:2: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==40) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1085:1: (lv_abstract_1_0= 'abstract' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1085:1: (lv_abstract_1_0= 'abstract' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1086:3: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleEClass2296); 

                            newLeafNode(lv_abstract_1_0, grammarAccess.getEClassAccess().getAbstractAbstractKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEClassRule());
                    	        }
                           		setWithLastConsumed(current, "abstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1099:3: ( (lv_interface_2_0= 'interface' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==41) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1100:1: (lv_interface_2_0= 'interface' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1100:1: (lv_interface_2_0= 'interface' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1101:3: lv_interface_2_0= 'interface'
                    {
                    lv_interface_2_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleEClass2328); 

                            newLeafNode(lv_interface_2_0, grammarAccess.getEClassAccess().getInterfaceInterfaceKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEClassRule());
                    	        }
                           		setWithLastConsumed(current, "interface", true, "interface");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEClass2354); 

                	newLeafNode(otherlv_3, grammarAccess.getEClassAccess().getEClassKeyword_3());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1118:1: ( (lv_name_4_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1119:1: (lv_name_4_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1119:1: (lv_name_4_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1120:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEClassAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEClass2375);
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

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEClass2387); 

                	newLeafNode(otherlv_5, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_5());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1140:1: (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==43) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1140:3: otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEClass2400); 

                        	newLeafNode(otherlv_6, grammarAccess.getEClassAccess().getInstanceClassNameKeyword_6_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1144:1: ( (lv_instanceClassName_7_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1145:1: (lv_instanceClassName_7_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1145:1: (lv_instanceClassName_7_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1146:3: lv_instanceClassName_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getInstanceClassNameEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEClass2421);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1162:4: (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==44) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1162:6: otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEClass2436); 

                        	newLeafNode(otherlv_8, grammarAccess.getEClassAccess().getInstanceTypeNameKeyword_7_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1166:1: ( (lv_instanceTypeName_9_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1167:1: (lv_instanceTypeName_9_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1167:1: (lv_instanceTypeName_9_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1168:3: lv_instanceTypeName_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getInstanceTypeNameEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEClass2457);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1184:4: (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==45) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1184:6: otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEClass2472); 

                        	newLeafNode(otherlv_10, grammarAccess.getEClassAccess().getESuperTypesKeyword_8_0());
                        
                    otherlv_11=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEClass2484); 

                        	newLeafNode(otherlv_11, grammarAccess.getEClassAccess().getLeftParenthesisKeyword_8_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1192:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1193:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1193:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1194:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEClassRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEClass2507);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1207:2: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==17) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1207:4: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEClass2520); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getEClassAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1211:1: ( ( ruleEString ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1212:1: ( ruleEString )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1212:1: ( ruleEString )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1213:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEClassRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEClass2543);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEClass2557); 

                        	newLeafNode(otherlv_15, grammarAccess.getEClassAccess().getRightParenthesisKeyword_8_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1230:3: (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==27) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1230:5: otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEClass2572); 

                        	newLeafNode(otherlv_16, grammarAccess.getEClassAccess().getEAnnotationsKeyword_9_0());
                        
                    otherlv_17=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEClass2584); 

                        	newLeafNode(otherlv_17, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1238:1: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1239:1: (lv_eAnnotations_18_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1239:1: (lv_eAnnotations_18_0= ruleEAnnotation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1240:3: lv_eAnnotations_18_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getEAnnotationsEAnnotationParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEClass2605);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1256:2: (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==17) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1256:4: otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEClass2618); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getEClassAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1260:1: ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1261:1: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1261:1: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1262:3: lv_eAnnotations_20_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEClassAccess().getEAnnotationsEAnnotationParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEClass2639);
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
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEClass2653); 

                        	newLeafNode(otherlv_21, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1282:3: (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==48) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1282:5: otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEClass2668); 

                        	newLeafNode(otherlv_22, grammarAccess.getEClassAccess().getETypeParametersKeyword_10_0());
                        
                    otherlv_23=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEClass2680); 

                        	newLeafNode(otherlv_23, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1290:1: ( (lv_eTypeParameters_24_0= ruleETypeParameter ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1291:1: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1291:1: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1292:3: lv_eTypeParameters_24_0= ruleETypeParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getETypeParametersETypeParameterParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEClass2701);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1308:2: (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==17) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1308:4: otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_25=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEClass2714); 

                    	        	newLeafNode(otherlv_25, grammarAccess.getEClassAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1312:1: ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1313:1: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1313:1: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1314:3: lv_eTypeParameters_26_0= ruleETypeParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEClassAccess().getETypeParametersETypeParameterParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEClass2735);
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
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEClass2749); 

                        	newLeafNode(otherlv_27, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1334:3: (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==49) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1334:5: otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleEClass2764); 

                        	newLeafNode(otherlv_28, grammarAccess.getEClassAccess().getEOperationsKeyword_11_0());
                        
                    otherlv_29=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEClass2776); 

                        	newLeafNode(otherlv_29, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1342:1: ( (lv_eOperations_30_0= ruleEOperation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1343:1: (lv_eOperations_30_0= ruleEOperation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1343:1: (lv_eOperations_30_0= ruleEOperation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1344:3: lv_eOperations_30_0= ruleEOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getEOperationsEOperationParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEOperation_in_ruleEClass2797);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1360:2: (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==17) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1360:4: otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    {
                    	    otherlv_31=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEClass2810); 

                    	        	newLeafNode(otherlv_31, grammarAccess.getEClassAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1364:1: ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1365:1: (lv_eOperations_32_0= ruleEOperation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1365:1: (lv_eOperations_32_0= ruleEOperation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1366:3: lv_eOperations_32_0= ruleEOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEClassAccess().getEOperationsEOperationParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEOperation_in_ruleEClass2831);
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
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEClass2845); 

                        	newLeafNode(otherlv_33, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_11_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1386:3: (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==50) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1386:5: otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEClass2860); 

                        	newLeafNode(otherlv_34, grammarAccess.getEClassAccess().getEStructuralFeaturesKeyword_12_0());
                        
                    otherlv_35=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEClass2872); 

                        	newLeafNode(otherlv_35, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_12_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1394:1: ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1395:1: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1395:1: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1396:3: lv_eStructuralFeatures_36_0= ruleEStructuralFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getEStructuralFeaturesEStructuralFeatureParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEStructuralFeature_in_ruleEClass2893);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1412:2: (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==17) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1412:4: otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    {
                    	    otherlv_37=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEClass2906); 

                    	        	newLeafNode(otherlv_37, grammarAccess.getEClassAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1416:1: ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1417:1: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1417:1: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1418:3: lv_eStructuralFeatures_38_0= ruleEStructuralFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEClassAccess().getEStructuralFeaturesEStructuralFeatureParserRuleCall_12_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEStructuralFeature_in_ruleEClass2927);
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
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEClass2941); 

                        	newLeafNode(otherlv_39, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_12_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1438:3: (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==51) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1438:5: otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleEClass2956); 

                        	newLeafNode(otherlv_40, grammarAccess.getEClassAccess().getEGenericSuperTypesKeyword_13_0());
                        
                    otherlv_41=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEClass2968); 

                        	newLeafNode(otherlv_41, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_13_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1446:1: ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1447:1: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1447:1: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1448:3: lv_eGenericSuperTypes_42_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEClassAccess().getEGenericSuperTypesEGenericTypeParserRuleCall_13_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEClass2989);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1464:2: (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==17) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1464:4: otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEClass3002); 

                    	        	newLeafNode(otherlv_43, grammarAccess.getEClassAccess().getCommaKeyword_13_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1468:1: ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1469:1: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1469:1: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1470:3: lv_eGenericSuperTypes_44_0= ruleEGenericType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEClassAccess().getEGenericSuperTypesEGenericTypeParserRuleCall_13_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEClass3023);
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
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEClass3037); 

                        	newLeafNode(otherlv_45, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_13_4());
                        

                    }
                    break;

            }

            otherlv_46=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEClass3051); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1502:1: entryRuleEAnnotation returns [EObject current=null] : iv_ruleEAnnotation= ruleEAnnotation EOF ;
    public final EObject entryRuleEAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAnnotation = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1503:2: (iv_ruleEAnnotation= ruleEAnnotation EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1504:2: iv_ruleEAnnotation= ruleEAnnotation EOF
            {
             newCompositeNode(grammarAccess.getEAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_entryRuleEAnnotation3087);
            iv_ruleEAnnotation=ruleEAnnotation();

            state._fsp--;

             current =iv_ruleEAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEAnnotation3097); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1511:1: ruleEAnnotation returns [EObject current=null] : ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1514:28: ( ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1515:1: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1515:1: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1515:2: () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1515:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1516:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEAnnotationAccess().getEAnnotationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleEAnnotation3143); 

                	newLeafNode(otherlv_1, grammarAccess.getEAnnotationAccess().getEAnnotationKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEAnnotation3155); 

                	newLeafNode(otherlv_2, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1529:1: (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==53) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1529:3: otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleEAnnotation3168); 

                        	newLeafNode(otherlv_3, grammarAccess.getEAnnotationAccess().getSourceKeyword_3_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1533:1: ( (lv_source_4_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1534:1: (lv_source_4_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1534:1: (lv_source_4_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1535:3: lv_source_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getSourceEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEAnnotation3189);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1551:4: (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==54) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1551:6: otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleEAnnotation3204); 

                        	newLeafNode(otherlv_5, grammarAccess.getEAnnotationAccess().getReferencesKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEAnnotation3216); 

                        	newLeafNode(otherlv_6, grammarAccess.getEAnnotationAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1559:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1560:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1560:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1561:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAnnotationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEAnnotation3239);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1574:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==17) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1574:4: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEAnnotation3252); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getEAnnotationAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1578:1: ( ( ruleEString ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1579:1: ( ruleEString )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1579:1: ( ruleEString )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1580:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEAnnotationRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEAnnotation3275);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEAnnotation3289); 

                        	newLeafNode(otherlv_10, grammarAccess.getEAnnotationAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1597:3: (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==27) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1597:5: otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEAnnotation3304); 

                        	newLeafNode(otherlv_11, grammarAccess.getEAnnotationAccess().getEAnnotationsKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEAnnotation3316); 

                        	newLeafNode(otherlv_12, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1605:1: ( (lv_eAnnotations_13_0= ruleEAnnotation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1606:1: (lv_eAnnotations_13_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1606:1: (lv_eAnnotations_13_0= ruleEAnnotation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1607:3: lv_eAnnotations_13_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getEAnnotationsEAnnotationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEAnnotation3337);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1623:2: (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==17) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1623:4: otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEAnnotation3350); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getEAnnotationAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1627:1: ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1628:1: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1628:1: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1629:3: lv_eAnnotations_15_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getEAnnotationsEAnnotationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEAnnotation3371);
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
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEAnnotation3385); 

                        	newLeafNode(otherlv_16, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1649:3: (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==55) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1649:5: otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleEAnnotation3400); 

                        	newLeafNode(otherlv_17, grammarAccess.getEAnnotationAccess().getDetailsKeyword_6_0());
                        
                    otherlv_18=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEAnnotation3412); 

                        	newLeafNode(otherlv_18, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1657:1: ( (lv_details_19_0= ruleEStringToStringMapEntry ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1658:1: (lv_details_19_0= ruleEStringToStringMapEntry )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1658:1: (lv_details_19_0= ruleEStringToStringMapEntry )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1659:3: lv_details_19_0= ruleEStringToStringMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getDetailsEStringToStringMapEntryParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEStringToStringMapEntry_in_ruleEAnnotation3433);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1675:2: (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==17) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1675:4: otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    {
                    	    otherlv_20=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEAnnotation3446); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getEAnnotationAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1679:1: ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1680:1: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1680:1: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1681:3: lv_details_21_0= ruleEStringToStringMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getDetailsEStringToStringMapEntryParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEStringToStringMapEntry_in_ruleEAnnotation3467);
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
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEAnnotation3481); 

                        	newLeafNode(otherlv_22, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1701:3: (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==56) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1701:5: otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleEAnnotation3496); 

                        	newLeafNode(otherlv_23, grammarAccess.getEAnnotationAccess().getContentsKeyword_7_0());
                        
                    otherlv_24=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEAnnotation3508); 

                        	newLeafNode(otherlv_24, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1709:1: ( (lv_contents_25_0= ruleEObject ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1710:1: (lv_contents_25_0= ruleEObject )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1710:1: (lv_contents_25_0= ruleEObject )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1711:3: lv_contents_25_0= ruleEObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getContentsEObjectParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEObject_in_ruleEAnnotation3529);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1727:2: (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==17) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1727:4: otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) )
                    	    {
                    	    otherlv_26=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEAnnotation3542); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getEAnnotationAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1731:1: ( (lv_contents_27_0= ruleEObject ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1732:1: (lv_contents_27_0= ruleEObject )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1732:1: (lv_contents_27_0= ruleEObject )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1733:3: lv_contents_27_0= ruleEObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getContentsEObjectParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEObject_in_ruleEAnnotation3563);
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
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEAnnotation3577); 

                        	newLeafNode(otherlv_28, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_29=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEAnnotation3591); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1765:1: entryRuleEStringToStringMapEntry returns [EObject current=null] : iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF ;
    public final EObject entryRuleEStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStringToStringMapEntry = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1766:2: (iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1767:2: iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF
            {
             newCompositeNode(grammarAccess.getEStringToStringMapEntryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEStringToStringMapEntry_in_entryRuleEStringToStringMapEntry3627);
            iv_ruleEStringToStringMapEntry=ruleEStringToStringMapEntry();

            state._fsp--;

             current =iv_ruleEStringToStringMapEntry; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEStringToStringMapEntry3637); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1774:1: ruleEStringToStringMapEntry returns [EObject current=null] : ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1777:28: ( ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1778:1: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1778:1: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1778:2: () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1778:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1779:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleEStringToStringMapEntry3683); 

                	newLeafNode(otherlv_1, grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEStringToStringMapEntry3695); 

                	newLeafNode(otherlv_2, grammarAccess.getEStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1792:1: (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==58) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1792:3: otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleEStringToStringMapEntry3708); 

                        	newLeafNode(otherlv_3, grammarAccess.getEStringToStringMapEntryAccess().getKeyKeyword_3_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1796:1: ( (lv_key_4_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1797:1: (lv_key_4_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1797:1: (lv_key_4_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1798:3: lv_key_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEStringToStringMapEntry3729);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1814:4: (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==59) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1814:6: otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleEStringToStringMapEntry3744); 

                        	newLeafNode(otherlv_5, grammarAccess.getEStringToStringMapEntryAccess().getValueKeyword_4_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1818:1: ( (lv_value_6_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1819:1: (lv_value_6_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1819:1: (lv_value_6_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1820:3: lv_value_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEStringToStringMapEntryAccess().getValueEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEStringToStringMapEntry3765);
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

            otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEStringToStringMapEntry3779); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1848:1: entryRuleEObject returns [EObject current=null] : iv_ruleEObject= ruleEObject EOF ;
    public final EObject entryRuleEObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObject = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1849:2: (iv_ruleEObject= ruleEObject EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1850:2: iv_ruleEObject= ruleEObject EOF
            {
             newCompositeNode(grammarAccess.getEObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEObject_in_entryRuleEObject3815);
            iv_ruleEObject=ruleEObject();

            state._fsp--;

             current =iv_ruleEObject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEObject3825); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1857:1: ruleEObject returns [EObject current=null] : ( () otherlv_1= 'EObject' ) ;
    public final EObject ruleEObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1860:28: ( ( () otherlv_1= 'EObject' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1861:1: ( () otherlv_1= 'EObject' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1861:1: ( () otherlv_1= 'EObject' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1861:2: () otherlv_1= 'EObject'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1861:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1862:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEObjectAccess().getEObjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleEObject3871); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1879:1: entryRuleETypeParameter returns [EObject current=null] : iv_ruleETypeParameter= ruleETypeParameter EOF ;
    public final EObject entryRuleETypeParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETypeParameter = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1880:2: (iv_ruleETypeParameter= ruleETypeParameter EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1881:2: iv_ruleETypeParameter= ruleETypeParameter EOF
            {
             newCompositeNode(grammarAccess.getETypeParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_entryRuleETypeParameter3907);
            iv_ruleETypeParameter=ruleETypeParameter();

            state._fsp--;

             current =iv_ruleETypeParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleETypeParameter3917); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1888:1: ruleETypeParameter returns [EObject current=null] : ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1891:28: ( ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1892:1: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1892:1: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1892:2: () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1892:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1893:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getETypeParameterAccess().getETypeParameterAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleETypeParameter3963); 

                	newLeafNode(otherlv_1, grammarAccess.getETypeParameterAccess().getETypeParameterKeyword_1());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1902:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1903:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1903:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1904:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getETypeParameterAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleETypeParameter3984);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleETypeParameter3996); 

                	newLeafNode(otherlv_3, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1924:1: (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==27) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1924:3: otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleETypeParameter4009); 

                        	newLeafNode(otherlv_4, grammarAccess.getETypeParameterAccess().getEAnnotationsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleETypeParameter4021); 

                        	newLeafNode(otherlv_5, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1932:1: ( (lv_eAnnotations_6_0= ruleEAnnotation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1933:1: (lv_eAnnotations_6_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1933:1: (lv_eAnnotations_6_0= ruleEAnnotation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1934:3: lv_eAnnotations_6_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getETypeParameterAccess().getEAnnotationsEAnnotationParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleETypeParameter4042);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1950:2: (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==17) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1950:4: otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleETypeParameter4055); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getETypeParameterAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1954:1: ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1955:1: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1955:1: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1956:3: lv_eAnnotations_8_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getETypeParameterAccess().getEAnnotationsEAnnotationParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleETypeParameter4076);
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
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleETypeParameter4090); 

                        	newLeafNode(otherlv_9, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1976:3: (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==62) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1976:5: otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleETypeParameter4105); 

                        	newLeafNode(otherlv_10, grammarAccess.getETypeParameterAccess().getEBoundsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleETypeParameter4117); 

                        	newLeafNode(otherlv_11, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1984:1: ( (lv_eBounds_12_0= ruleEGenericType ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1985:1: (lv_eBounds_12_0= ruleEGenericType )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1985:1: (lv_eBounds_12_0= ruleEGenericType )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:1986:3: lv_eBounds_12_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getETypeParameterAccess().getEBoundsEGenericTypeParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleETypeParameter4138);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2002:2: (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==17) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2002:4: otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleETypeParameter4151); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getETypeParameterAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2006:1: ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2007:1: (lv_eBounds_14_0= ruleEGenericType )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2007:1: (lv_eBounds_14_0= ruleEGenericType )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2008:3: lv_eBounds_14_0= ruleEGenericType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getETypeParameterAccess().getEBoundsEGenericTypeParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleETypeParameter4172);
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
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleETypeParameter4186); 

                        	newLeafNode(otherlv_15, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleETypeParameter4200); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2040:1: entryRuleEDataType_Impl returns [EObject current=null] : iv_ruleEDataType_Impl= ruleEDataType_Impl EOF ;
    public final EObject entryRuleEDataType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataType_Impl = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2041:2: (iv_ruleEDataType_Impl= ruleEDataType_Impl EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2042:2: iv_ruleEDataType_Impl= ruleEDataType_Impl EOF
            {
             newCompositeNode(grammarAccess.getEDataType_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDataType_Impl_in_entryRuleEDataType_Impl4236);
            iv_ruleEDataType_Impl=ruleEDataType_Impl();

            state._fsp--;

             current =iv_ruleEDataType_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDataType_Impl4246); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2049:1: ruleEDataType_Impl returns [EObject current=null] : ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2052:28: ( ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2053:1: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2053:1: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2053:2: () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2053:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2054:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEDataType_ImplAccess().getEDataTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleEDataType_Impl4292); 

                	newLeafNode(otherlv_1, grammarAccess.getEDataType_ImplAccess().getEDataTypeKeyword_1());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2063:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2064:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2064:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2065:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEDataType_Impl4313);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDataType_Impl4325); 

                	newLeafNode(otherlv_3, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2085:1: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==43) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2085:3: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEDataType_Impl4338); 

                        	newLeafNode(otherlv_4, grammarAccess.getEDataType_ImplAccess().getInstanceClassNameKeyword_4_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2089:1: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2090:1: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2090:1: (lv_instanceClassName_5_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2091:3: lv_instanceClassName_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceClassNameEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEDataType_Impl4359);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2107:4: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==44) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2107:6: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEDataType_Impl4374); 

                        	newLeafNode(otherlv_6, grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameKeyword_5_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2111:1: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2112:1: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2112:1: (lv_instanceTypeName_7_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2113:3: lv_instanceTypeName_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEDataType_Impl4395);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2129:4: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==64) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2129:6: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleEDataType_Impl4410); 

                        	newLeafNode(otherlv_8, grammarAccess.getEDataType_ImplAccess().getSerializableKeyword_6_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2133:1: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2134:1: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2134:1: (lv_serializable_9_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2135:3: lv_serializable_9_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getSerializableEBooleanParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEDataType_Impl4431);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2151:4: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==27) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2151:6: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEDataType_Impl4446); 

                        	newLeafNode(otherlv_10, grammarAccess.getEDataType_ImplAccess().getEAnnotationsKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDataType_Impl4458); 

                        	newLeafNode(otherlv_11, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2159:1: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2160:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2160:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2161:3: lv_eAnnotations_12_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getEAnnotationsEAnnotationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEDataType_Impl4479);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2177:2: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==17) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2177:4: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEDataType_Impl4492); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2181:1: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2182:1: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2182:1: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2183:3: lv_eAnnotations_14_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getEAnnotationsEAnnotationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEDataType_Impl4513);
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
                    	    break loop66;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEDataType_Impl4527); 

                        	newLeafNode(otherlv_15, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2203:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==48) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2203:5: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEDataType_Impl4542); 

                        	newLeafNode(otherlv_16, grammarAccess.getEDataType_ImplAccess().getETypeParametersKeyword_8_0());
                        
                    otherlv_17=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDataType_Impl4554); 

                        	newLeafNode(otherlv_17, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2211:1: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2212:1: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2212:1: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2213:3: lv_eTypeParameters_18_0= ruleETypeParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getETypeParametersETypeParameterParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEDataType_Impl4575);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2229:2: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==17) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2229:4: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEDataType_Impl4588); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2233:1: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2234:1: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2234:1: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2235:3: lv_eTypeParameters_20_0= ruleETypeParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEDataType_ImplAccess().getETypeParametersETypeParameterParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEDataType_Impl4609);
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
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEDataType_Impl4623); 

                        	newLeafNode(otherlv_21, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_22=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEDataType_Impl4637); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2267:1: entryRuleEEnum returns [EObject current=null] : iv_ruleEEnum= ruleEEnum EOF ;
    public final EObject entryRuleEEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnum = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2268:2: (iv_ruleEEnum= ruleEEnum EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2269:2: iv_ruleEEnum= ruleEEnum EOF
            {
             newCompositeNode(grammarAccess.getEEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEEnum_in_entryRuleEEnum4673);
            iv_ruleEEnum=ruleEEnum();

            state._fsp--;

             current =iv_ruleEEnum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEEnum4683); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2276:1: ruleEEnum returns [EObject current=null] : ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2279:28: ( ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2280:1: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2280:1: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2280:2: () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2280:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2281:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEEnumAccess().getEEnumAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleEEnum4729); 

                	newLeafNode(otherlv_1, grammarAccess.getEEnumAccess().getEEnumKeyword_1());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2290:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2291:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2291:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2292:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEEnumAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEEnum4750);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEEnum4762); 

                	newLeafNode(otherlv_3, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2312:1: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==43) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2312:3: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEEnum4775); 

                        	newLeafNode(otherlv_4, grammarAccess.getEEnumAccess().getInstanceClassNameKeyword_4_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2316:1: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2317:1: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2317:1: (lv_instanceClassName_5_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2318:3: lv_instanceClassName_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumAccess().getInstanceClassNameEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEEnum4796);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2334:4: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==44) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2334:6: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEEnum4811); 

                        	newLeafNode(otherlv_6, grammarAccess.getEEnumAccess().getInstanceTypeNameKeyword_5_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2338:1: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2339:1: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2339:1: (lv_instanceTypeName_7_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2340:3: lv_instanceTypeName_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEEnum4832);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2356:4: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==64) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2356:6: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleEEnum4847); 

                        	newLeafNode(otherlv_8, grammarAccess.getEEnumAccess().getSerializableKeyword_6_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2360:1: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2361:1: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2361:1: (lv_serializable_9_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2362:3: lv_serializable_9_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumAccess().getSerializableEBooleanParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEEnum4868);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2378:4: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==27) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2378:6: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEEnum4883); 

                        	newLeafNode(otherlv_10, grammarAccess.getEEnumAccess().getEAnnotationsKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEEnum4895); 

                        	newLeafNode(otherlv_11, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2386:1: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2387:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2387:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2388:3: lv_eAnnotations_12_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumAccess().getEAnnotationsEAnnotationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEEnum4916);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2404:2: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==17) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2404:4: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEEnum4929); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getEEnumAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2408:1: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2409:1: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2409:1: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2410:3: lv_eAnnotations_14_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEEnumAccess().getEAnnotationsEAnnotationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEEnum4950);
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
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEEnum4964); 

                        	newLeafNode(otherlv_15, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2430:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==48) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2430:5: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEEnum4979); 

                        	newLeafNode(otherlv_16, grammarAccess.getEEnumAccess().getETypeParametersKeyword_8_0());
                        
                    otherlv_17=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEEnum4991); 

                        	newLeafNode(otherlv_17, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2438:1: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2439:1: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2439:1: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2440:3: lv_eTypeParameters_18_0= ruleETypeParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumAccess().getETypeParametersETypeParameterParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEEnum5012);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2456:2: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==17) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2456:4: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEEnum5025); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getEEnumAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2460:1: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2461:1: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2461:1: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2462:3: lv_eTypeParameters_20_0= ruleETypeParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEEnumAccess().getETypeParametersETypeParameterParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEEnum5046);
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
                    	    break loop75;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEEnum5060); 

                        	newLeafNode(otherlv_21, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2482:3: (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==66) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2482:5: otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleEEnum5075); 

                        	newLeafNode(otherlv_22, grammarAccess.getEEnumAccess().getELiteralsKeyword_9_0());
                        
                    otherlv_23=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEEnum5087); 

                        	newLeafNode(otherlv_23, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2490:1: ( (lv_eLiterals_24_0= ruleEEnumLiteral ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2491:1: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2491:1: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2492:3: lv_eLiterals_24_0= ruleEEnumLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumAccess().getELiteralsEEnumLiteralParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEEnumLiteral_in_ruleEEnum5108);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2508:2: (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==17) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2508:4: otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    {
                    	    otherlv_25=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEEnum5121); 

                    	        	newLeafNode(otherlv_25, grammarAccess.getEEnumAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2512:1: ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2513:1: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2513:1: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2514:3: lv_eLiterals_26_0= ruleEEnumLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEEnumAccess().getELiteralsEEnumLiteralParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEEnumLiteral_in_ruleEEnum5142);
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
                    	    break loop77;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEEnum5156); 

                        	newLeafNode(otherlv_27, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_28=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEEnum5170); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2546:1: entryRuleEGenericType returns [EObject current=null] : iv_ruleEGenericType= ruleEGenericType EOF ;
    public final EObject entryRuleEGenericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGenericType = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2547:2: (iv_ruleEGenericType= ruleEGenericType EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2548:2: iv_ruleEGenericType= ruleEGenericType EOF
            {
             newCompositeNode(grammarAccess.getEGenericTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_entryRuleEGenericType5206);
            iv_ruleEGenericType=ruleEGenericType();

            state._fsp--;

             current =iv_ruleEGenericType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEGenericType5216); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2555:1: ruleEGenericType returns [EObject current=null] : ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2558:28: ( ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2559:1: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2559:1: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2559:2: () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2559:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2560:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEGenericTypeAccess().getEGenericTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleEGenericType5262); 

                	newLeafNode(otherlv_1, grammarAccess.getEGenericTypeAccess().getEGenericTypeKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEGenericType5274); 

                	newLeafNode(otherlv_2, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2573:1: (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==68) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2573:3: otherlv_3= 'eTypeParameter' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleEGenericType5287); 

                        	newLeafNode(otherlv_3, grammarAccess.getEGenericTypeAccess().getETypeParameterKeyword_3_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2577:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2578:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2578:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2579:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEGenericTypeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeParameterETypeParameterCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEGenericType5310);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2592:4: (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==69) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2592:6: otherlv_5= 'eClassifier' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleEGenericType5325); 

                        	newLeafNode(otherlv_5, grammarAccess.getEGenericTypeAccess().getEClassifierKeyword_4_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2596:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2597:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2597:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2598:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEGenericTypeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEGenericTypeAccess().getEClassifierEClassifierCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEGenericType5348);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2611:4: (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==70) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2611:6: otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    {
                    otherlv_7=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleEGenericType5363); 

                        	newLeafNode(otherlv_7, grammarAccess.getEGenericTypeAccess().getEUpperBoundKeyword_5_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2615:1: ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2616:1: (lv_eUpperBound_8_0= ruleEGenericType )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2616:1: (lv_eUpperBound_8_0= ruleEGenericType )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2617:3: lv_eUpperBound_8_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEGenericTypeAccess().getEUpperBoundEGenericTypeParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEGenericType5384);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2633:4: (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==71) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2633:6: otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleEGenericType5399); 

                        	newLeafNode(otherlv_9, grammarAccess.getEGenericTypeAccess().getETypeArgumentsKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEGenericType5411); 

                        	newLeafNode(otherlv_10, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2641:1: ( (lv_eTypeArguments_11_0= ruleEGenericType ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2642:1: (lv_eTypeArguments_11_0= ruleEGenericType )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2642:1: (lv_eTypeArguments_11_0= ruleEGenericType )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2643:3: lv_eTypeArguments_11_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeArgumentsEGenericTypeParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEGenericType5432);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2659:2: (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==17) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2659:4: otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEGenericType5445); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getEGenericTypeAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2663:1: ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2664:1: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2664:1: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2665:3: lv_eTypeArguments_13_0= ruleEGenericType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeArgumentsEGenericTypeParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEGenericType5466);
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
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEGenericType5480); 

                        	newLeafNode(otherlv_14, grammarAccess.getEGenericTypeAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2685:3: (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==72) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2685:5: otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    {
                    otherlv_15=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleEGenericType5495); 

                        	newLeafNode(otherlv_15, grammarAccess.getEGenericTypeAccess().getELowerBoundKeyword_7_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2689:1: ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2690:1: (lv_eLowerBound_16_0= ruleEGenericType )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2690:1: (lv_eLowerBound_16_0= ruleEGenericType )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2691:3: lv_eLowerBound_16_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEGenericTypeAccess().getELowerBoundEGenericTypeParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEGenericType5516);
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

            otherlv_17=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEGenericType5530); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2719:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2720:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2721:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean5567);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean5578); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2728:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2731:28: ( (kw= 'true' | kw= 'false' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2732:1: (kw= 'true' | kw= 'false' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2732:1: (kw= 'true' | kw= 'false' )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==73) ) {
                alt85=1;
            }
            else if ( (LA85_0==74) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2733:2: kw= 'true'
                    {
                    kw=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleEBoolean5616); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2740:2: kw= 'false'
                    {
                    kw=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleEBoolean5635); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2753:1: entryRuleEEnumLiteral returns [EObject current=null] : iv_ruleEEnumLiteral= ruleEEnumLiteral EOF ;
    public final EObject entryRuleEEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnumLiteral = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2754:2: (iv_ruleEEnumLiteral= ruleEEnumLiteral EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2755:2: iv_ruleEEnumLiteral= ruleEEnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getEEnumLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEEnumLiteral_in_entryRuleEEnumLiteral5675);
            iv_ruleEEnumLiteral=ruleEEnumLiteral();

            state._fsp--;

             current =iv_ruleEEnumLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEEnumLiteral5685); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2762:1: ruleEEnumLiteral returns [EObject current=null] : ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2765:28: ( ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2766:1: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2766:1: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2766:2: () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2766:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2767:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEEnumLiteralAccess().getEEnumLiteralAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleEEnumLiteral5731); 

                	newLeafNode(otherlv_1, grammarAccess.getEEnumLiteralAccess().getEEnumLiteralKeyword_1());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2776:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2777:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2777:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2778:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEEnumLiteralAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEEnumLiteral5752);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEEnumLiteral5764); 

                	newLeafNode(otherlv_3, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2798:1: (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==59) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2798:3: otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleEEnumLiteral5777); 

                        	newLeafNode(otherlv_4, grammarAccess.getEEnumLiteralAccess().getValueKeyword_4_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2802:1: ( (lv_value_5_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2803:1: (lv_value_5_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2803:1: (lv_value_5_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2804:3: lv_value_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumLiteralAccess().getValueEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEEnumLiteral5798);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2820:4: (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==76) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2820:6: otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleEEnumLiteral5813); 

                        	newLeafNode(otherlv_6, grammarAccess.getEEnumLiteralAccess().getLiteralKeyword_5_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2824:1: ( (lv_literal_7_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2825:1: (lv_literal_7_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2825:1: (lv_literal_7_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2826:3: lv_literal_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumLiteralAccess().getLiteralEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEEnumLiteral5834);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2842:4: (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==27) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2842:6: otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEEnumLiteral5849); 

                        	newLeafNode(otherlv_8, grammarAccess.getEEnumLiteralAccess().getEAnnotationsKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEEnumLiteral5861); 

                        	newLeafNode(otherlv_9, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2850:1: ( (lv_eAnnotations_10_0= ruleEAnnotation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2851:1: (lv_eAnnotations_10_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2851:1: (lv_eAnnotations_10_0= ruleEAnnotation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2852:3: lv_eAnnotations_10_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEEnumLiteralAccess().getEAnnotationsEAnnotationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEEnumLiteral5882);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2868:2: (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==17) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2868:4: otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEEnumLiteral5895); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getEEnumLiteralAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2872:1: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2873:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2873:1: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2874:3: lv_eAnnotations_12_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEEnumLiteralAccess().getEAnnotationsEAnnotationParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEEnumLiteral5916);
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
                    	    break loop88;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEEnumLiteral5930); 

                        	newLeafNode(otherlv_13, grammarAccess.getEEnumLiteralAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEEnumLiteral5944); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2906:1: entryRuleELong returns [String current=null] : iv_ruleELong= ruleELong EOF ;
    public final String entryRuleELong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELong = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2907:2: (iv_ruleELong= ruleELong EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2908:2: iv_ruleELong= ruleELong EOF
            {
             newCompositeNode(grammarAccess.getELongRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleELong_in_entryRuleELong5981);
            iv_ruleELong=ruleELong();

            state._fsp--;

             current =iv_ruleELong.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleELong5992); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2915:1: ruleELong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleELong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2918:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2919:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2919:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2919:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2919:2: (kw= '-' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==23) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2920:2: kw= '-'
                    {
                    kw=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleELong6031); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleELong6048); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2940:1: entryRuleLocale returns [String current=null] : iv_ruleLocale= ruleLocale EOF ;
    public final String entryRuleLocale() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLocale = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2941:2: (iv_ruleLocale= ruleLocale EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2942:2: iv_ruleLocale= ruleLocale EOF
            {
             newCompositeNode(grammarAccess.getLocaleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocale_in_entryRuleLocale6094);
            iv_ruleLocale=ruleLocale();

            state._fsp--;

             current =iv_ruleLocale.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocale6105); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2949:1: ruleLocale returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Locale' ;
    public final AntlrDatatypeRuleToken ruleLocale() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2952:28: (kw= 'Locale' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2954:2: kw= 'Locale'
            {
            kw=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleLocale6142); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2967:1: entryRuleReferenceGenerator returns [EObject current=null] : iv_ruleReferenceGenerator= ruleReferenceGenerator EOF ;
    public final EObject entryRuleReferenceGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceGenerator = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2968:2: (iv_ruleReferenceGenerator= ruleReferenceGenerator EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2969:2: iv_ruleReferenceGenerator= ruleReferenceGenerator EOF
            {
             newCompositeNode(grammarAccess.getReferenceGeneratorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReferenceGenerator_in_entryRuleReferenceGenerator6181);
            iv_ruleReferenceGenerator=ruleReferenceGenerator();

            state._fsp--;

             current =iv_ruleReferenceGenerator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReferenceGenerator6191); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2976:1: ruleReferenceGenerator returns [EObject current=null] : ( () otherlv_1= 'ReferenceGenerator' otherlv_2= '{' (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )? (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )? (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )? (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )? (otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) ) )? (otherlv_13= 'badValueGenerator' ( ( ruleEString ) ) )? otherlv_15= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2979:28: ( ( () otherlv_1= 'ReferenceGenerator' otherlv_2= '{' (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )? (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )? (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )? (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )? (otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) ) )? (otherlv_13= 'badValueGenerator' ( ( ruleEString ) ) )? otherlv_15= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2980:1: ( () otherlv_1= 'ReferenceGenerator' otherlv_2= '{' (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )? (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )? (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )? (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )? (otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) ) )? (otherlv_13= 'badValueGenerator' ( ( ruleEString ) ) )? otherlv_15= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2980:1: ( () otherlv_1= 'ReferenceGenerator' otherlv_2= '{' (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )? (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )? (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )? (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )? (otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) ) )? (otherlv_13= 'badValueGenerator' ( ( ruleEString ) ) )? otherlv_15= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2980:2: () otherlv_1= 'ReferenceGenerator' otherlv_2= '{' (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )? (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )? (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )? (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )? (otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) ) )? (otherlv_13= 'badValueGenerator' ( ( ruleEString ) ) )? otherlv_15= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2980:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2981:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReferenceGeneratorAccess().getReferenceGeneratorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleReferenceGenerator6237); 

                	newLeafNode(otherlv_1, grammarAccess.getReferenceGeneratorAccess().getReferenceGeneratorKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleReferenceGenerator6249); 

                	newLeafNode(otherlv_2, grammarAccess.getReferenceGeneratorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2994:1: (otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==79) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2994:3: otherlv_3= 'badValueProportion' ( (lv_badValueProportion_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleReferenceGenerator6262); 

                        	newLeafNode(otherlv_3, grammarAccess.getReferenceGeneratorAccess().getBadValueProportionKeyword_3_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2998:1: ( (lv_badValueProportion_4_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2999:1: (lv_badValueProportion_4_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:2999:1: (lv_badValueProportion_4_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3000:3: lv_badValueProportion_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferenceGeneratorAccess().getBadValueProportionEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleReferenceGenerator6283);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3016:4: (otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==80) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3016:6: otherlv_5= 'randomSeed' ( (lv_randomSeed_6_0= ruleELong ) )
                    {
                    otherlv_5=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleReferenceGenerator6298); 

                        	newLeafNode(otherlv_5, grammarAccess.getReferenceGeneratorAccess().getRandomSeedKeyword_4_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3020:1: ( (lv_randomSeed_6_0= ruleELong ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3021:1: (lv_randomSeed_6_0= ruleELong )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3021:1: (lv_randomSeed_6_0= ruleELong )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3022:3: lv_randomSeed_6_0= ruleELong
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferenceGeneratorAccess().getRandomSeedELongParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleELong_in_ruleReferenceGenerator6319);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3038:4: (otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==81) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3038:6: otherlv_7= 'ID' ( (lv_ID_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleReferenceGenerator6334); 

                        	newLeafNode(otherlv_7, grammarAccess.getReferenceGeneratorAccess().getIDKeyword_5_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3042:1: ( (lv_ID_8_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3043:1: (lv_ID_8_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3043:1: (lv_ID_8_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3044:3: lv_ID_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferenceGeneratorAccess().getIDEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReferenceGenerator6355);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3060:4: (otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==82) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3060:6: otherlv_9= 'locale' ( (lv_locale_10_0= ruleLocale ) )
                    {
                    otherlv_9=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleReferenceGenerator6370); 

                        	newLeafNode(otherlv_9, grammarAccess.getReferenceGeneratorAccess().getLocaleKeyword_6_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3064:1: ( (lv_locale_10_0= ruleLocale ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3065:1: (lv_locale_10_0= ruleLocale )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3065:1: (lv_locale_10_0= ruleLocale )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3066:3: lv_locale_10_0= ruleLocale
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferenceGeneratorAccess().getLocaleLocaleParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLocale_in_ruleReferenceGenerator6391);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3082:4: (otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==83) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3082:6: otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) )
                    {
                    otherlv_11=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleReferenceGenerator6406); 

                        	newLeafNode(otherlv_11, grammarAccess.getReferenceGeneratorAccess().getStepKeyword_7_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3086:1: ( (lv_step_12_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3087:1: (lv_step_12_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3087:1: (lv_step_12_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3088:3: lv_step_12_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferenceGeneratorAccess().getStepEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleReferenceGenerator6427);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3104:4: (otherlv_13= 'badValueGenerator' ( ( ruleEString ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==84) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3104:6: otherlv_13= 'badValueGenerator' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleReferenceGenerator6442); 

                        	newLeafNode(otherlv_13, grammarAccess.getReferenceGeneratorAccess().getBadValueGeneratorKeyword_8_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3108:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3109:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3109:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3110:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getReferenceGeneratorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getReferenceGeneratorAccess().getBadValueGeneratorValueGeneratorCrossReference_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReferenceGenerator6465);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleReferenceGenerator6479); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3137:1: entryRuleEAttribute returns [EObject current=null] : iv_ruleEAttribute= ruleEAttribute EOF ;
    public final EObject entryRuleEAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttribute = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3138:2: (iv_ruleEAttribute= ruleEAttribute EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3139:2: iv_ruleEAttribute= ruleEAttribute EOF
            {
             newCompositeNode(grammarAccess.getEAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEAttribute_in_entryRuleEAttribute6517);
            iv_ruleEAttribute=ruleEAttribute();

            state._fsp--;

             current =iv_ruleEAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEAttribute6527); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3146:1: ruleEAttribute returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3149:28: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3150:1: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3150:1: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3150:2: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3150:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3151:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEAttributeAccess().getEAttributeAction_0(),
                        current);
                

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3156:2: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==85) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3157:1: (lv_volatile_1_0= 'volatile' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3157:1: (lv_volatile_1_0= 'volatile' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3158:3: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleEAttribute6579); 

                            newLeafNode(lv_volatile_1_0, grammarAccess.getEAttributeAccess().getVolatileVolatileKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "volatile", true, "volatile");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3171:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==86) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3172:1: (lv_transient_2_0= 'transient' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3172:1: (lv_transient_2_0= 'transient' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3173:3: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleEAttribute6611); 

                            newLeafNode(lv_transient_2_0, grammarAccess.getEAttributeAccess().getTransientTransientKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "transient", true, "transient");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3186:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==87) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3187:1: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3187:1: (lv_unsettable_3_0= 'unsettable' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3188:3: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleEAttribute6643); 

                            newLeafNode(lv_unsettable_3_0, grammarAccess.getEAttributeAccess().getUnsettableUnsettableKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "unsettable", true, "unsettable");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3201:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==88) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3202:1: (lv_derived_4_0= 'derived' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3202:1: (lv_derived_4_0= 'derived' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3203:3: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleEAttribute6675); 

                            newLeafNode(lv_derived_4_0, grammarAccess.getEAttributeAccess().getDerivedDerivedKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "derived", true, "derived");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3216:3: ( (lv_iD_5_0= 'iD' ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==89) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3217:1: (lv_iD_5_0= 'iD' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3217:1: (lv_iD_5_0= 'iD' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3218:3: lv_iD_5_0= 'iD'
                    {
                    lv_iD_5_0=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleEAttribute6707); 

                            newLeafNode(lv_iD_5_0, grammarAccess.getEAttributeAccess().getIDIDKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "iD", true, "iD");
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleEAttribute6733); 

                	newLeafNode(otherlv_6, grammarAccess.getEAttributeAccess().getEAttributeKeyword_6());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3235:1: ( (lv_name_7_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3236:1: (lv_name_7_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3236:1: (lv_name_7_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3237:3: lv_name_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEAttributeAccess().getNameEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEAttribute6754);
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

            otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEAttribute6766); 

                	newLeafNode(otherlv_8, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_8());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3257:1: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==91) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3257:3: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleEAttribute6779); 

                        	newLeafNode(otherlv_9, grammarAccess.getEAttributeAccess().getOrderedKeyword_9_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3261:1: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3262:1: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3262:1: (lv_ordered_10_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3263:3: lv_ordered_10_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getOrderedEBooleanParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEAttribute6800);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3279:4: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==92) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3279:6: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleEAttribute6815); 

                        	newLeafNode(otherlv_11, grammarAccess.getEAttributeAccess().getUniqueKeyword_10_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3283:1: ( (lv_unique_12_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3284:1: (lv_unique_12_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3284:1: (lv_unique_12_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3285:3: lv_unique_12_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getUniqueEBooleanParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEAttribute6836);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3301:4: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==93) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3301:6: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleEAttribute6851); 

                        	newLeafNode(otherlv_13, grammarAccess.getEAttributeAccess().getLowerBoundKeyword_11_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3305:1: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3306:1: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3306:1: (lv_lowerBound_14_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3307:3: lv_lowerBound_14_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getLowerBoundEIntParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEAttribute6872);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3323:4: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==94) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3323:6: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleEAttribute6887); 

                        	newLeafNode(otherlv_15, grammarAccess.getEAttributeAccess().getUpperBoundKeyword_12_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3327:1: ( (lv_upperBound_16_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3328:1: (lv_upperBound_16_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3328:1: (lv_upperBound_16_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3329:3: lv_upperBound_16_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getUpperBoundEIntParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEAttribute6908);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3345:4: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==95) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3345:6: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,95,FollowSets000.FOLLOW_95_in_ruleEAttribute6923); 

                        	newLeafNode(otherlv_17, grammarAccess.getEAttributeAccess().getChangeableKeyword_13_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3349:1: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3350:1: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3350:1: (lv_changeable_18_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3351:3: lv_changeable_18_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getChangeableEBooleanParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEAttribute6944);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3367:4: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==96) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3367:6: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,96,FollowSets000.FOLLOW_96_in_ruleEAttribute6959); 

                        	newLeafNode(otherlv_19, grammarAccess.getEAttributeAccess().getDefaultValueLiteralKeyword_14_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3371:1: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3372:1: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3372:1: (lv_defaultValueLiteral_20_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3373:3: lv_defaultValueLiteral_20_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEAttribute6980);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3389:4: (otherlv_21= 'eType' ( ( ruleEString ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==97) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3389:6: otherlv_21= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_21=(Token)match(input,97,FollowSets000.FOLLOW_97_in_ruleEAttribute6995); 

                        	newLeafNode(otherlv_21, grammarAccess.getEAttributeAccess().getETypeKeyword_15_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3393:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3394:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3394:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3395:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAttributeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getETypeEClassifierCrossReference_15_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEAttribute7018);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3408:4: (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==27) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3408:6: otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEAttribute7033); 

                        	newLeafNode(otherlv_23, grammarAccess.getEAttributeAccess().getEAnnotationsKeyword_16_0());
                        
                    otherlv_24=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEAttribute7045); 

                        	newLeafNode(otherlv_24, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_16_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3416:1: ( (lv_eAnnotations_25_0= ruleEAnnotation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3417:1: (lv_eAnnotations_25_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3417:1: (lv_eAnnotations_25_0= ruleEAnnotation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3418:3: lv_eAnnotations_25_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getEAnnotationsEAnnotationParserRuleCall_16_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEAttribute7066);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3434:2: (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==17) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3434:4: otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_26=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEAttribute7079); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getEAttributeAccess().getCommaKeyword_16_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3438:1: ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3439:1: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3439:1: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3440:3: lv_eAnnotations_27_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEAttributeAccess().getEAnnotationsEAnnotationParserRuleCall_16_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEAttribute7100);
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
                    	    break loop109;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEAttribute7114); 

                        	newLeafNode(otherlv_28, grammarAccess.getEAttributeAccess().getRightCurlyBracketKeyword_16_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3460:3: (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==98) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3460:5: otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    {
                    otherlv_29=(Token)match(input,98,FollowSets000.FOLLOW_98_in_ruleEAttribute7129); 

                        	newLeafNode(otherlv_29, grammarAccess.getEAttributeAccess().getEGenericTypeKeyword_17_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3464:1: ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3465:1: (lv_eGenericType_30_0= ruleEGenericType )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3465:1: (lv_eGenericType_30_0= ruleEGenericType )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3466:3: lv_eGenericType_30_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAttributeAccess().getEGenericTypeEGenericTypeParserRuleCall_17_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEAttribute7150);
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

            otherlv_31=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEAttribute7164); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3494:1: entryRuleEReference returns [EObject current=null] : iv_ruleEReference= ruleEReference EOF ;
    public final EObject entryRuleEReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEReference = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3495:2: (iv_ruleEReference= ruleEReference EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3496:2: iv_ruleEReference= ruleEReference EOF
            {
             newCompositeNode(grammarAccess.getEReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEReference_in_entryRuleEReference7200);
            iv_ruleEReference=ruleEReference();

            state._fsp--;

             current =iv_ruleEReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEReference7210); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3503:1: ruleEReference returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3506:28: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3507:1: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3507:1: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3507:2: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3507:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3508:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEReferenceAccess().getEReferenceAction_0(),
                        current);
                

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3513:2: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==85) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3514:1: (lv_volatile_1_0= 'volatile' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3514:1: (lv_volatile_1_0= 'volatile' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3515:3: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleEReference7262); 

                            newLeafNode(lv_volatile_1_0, grammarAccess.getEReferenceAccess().getVolatileVolatileKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "volatile", true, "volatile");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3528:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==86) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3529:1: (lv_transient_2_0= 'transient' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3529:1: (lv_transient_2_0= 'transient' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3530:3: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleEReference7294); 

                            newLeafNode(lv_transient_2_0, grammarAccess.getEReferenceAccess().getTransientTransientKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "transient", true, "transient");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3543:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==87) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3544:1: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3544:1: (lv_unsettable_3_0= 'unsettable' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3545:3: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleEReference7326); 

                            newLeafNode(lv_unsettable_3_0, grammarAccess.getEReferenceAccess().getUnsettableUnsettableKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "unsettable", true, "unsettable");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3558:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==88) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3559:1: (lv_derived_4_0= 'derived' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3559:1: (lv_derived_4_0= 'derived' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3560:3: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleEReference7358); 

                            newLeafNode(lv_derived_4_0, grammarAccess.getEReferenceAccess().getDerivedDerivedKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "derived", true, "derived");
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3573:3: ( (lv_containment_5_0= 'containment' ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==99) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3574:1: (lv_containment_5_0= 'containment' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3574:1: (lv_containment_5_0= 'containment' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3575:3: lv_containment_5_0= 'containment'
                    {
                    lv_containment_5_0=(Token)match(input,99,FollowSets000.FOLLOW_99_in_ruleEReference7390); 

                            newLeafNode(lv_containment_5_0, grammarAccess.getEReferenceAccess().getContainmentContainmentKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "containment", true, "containment");
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,100,FollowSets000.FOLLOW_100_in_ruleEReference7416); 

                	newLeafNode(otherlv_6, grammarAccess.getEReferenceAccess().getEReferenceKeyword_6());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3592:1: ( (lv_name_7_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3593:1: (lv_name_7_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3593:1: (lv_name_7_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3594:3: lv_name_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEReferenceAccess().getNameEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEReference7437);
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

            otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEReference7449); 

                	newLeafNode(otherlv_8, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_8());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3614:1: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==91) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3614:3: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleEReference7462); 

                        	newLeafNode(otherlv_9, grammarAccess.getEReferenceAccess().getOrderedKeyword_9_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3618:1: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3619:1: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3619:1: (lv_ordered_10_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3620:3: lv_ordered_10_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getOrderedEBooleanParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEReference7483);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3636:4: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==92) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3636:6: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleEReference7498); 

                        	newLeafNode(otherlv_11, grammarAccess.getEReferenceAccess().getUniqueKeyword_10_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3640:1: ( (lv_unique_12_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3641:1: (lv_unique_12_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3641:1: (lv_unique_12_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3642:3: lv_unique_12_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getUniqueEBooleanParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEReference7519);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3658:4: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==93) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3658:6: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleEReference7534); 

                        	newLeafNode(otherlv_13, grammarAccess.getEReferenceAccess().getLowerBoundKeyword_11_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3662:1: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3663:1: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3663:1: (lv_lowerBound_14_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3664:3: lv_lowerBound_14_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getLowerBoundEIntParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEReference7555);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3680:4: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==94) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3680:6: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleEReference7570); 

                        	newLeafNode(otherlv_15, grammarAccess.getEReferenceAccess().getUpperBoundKeyword_12_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3684:1: ( (lv_upperBound_16_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3685:1: (lv_upperBound_16_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3685:1: (lv_upperBound_16_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3686:3: lv_upperBound_16_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getUpperBoundEIntParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEReference7591);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3702:4: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==95) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3702:6: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,95,FollowSets000.FOLLOW_95_in_ruleEReference7606); 

                        	newLeafNode(otherlv_17, grammarAccess.getEReferenceAccess().getChangeableKeyword_13_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3706:1: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3707:1: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3707:1: (lv_changeable_18_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3708:3: lv_changeable_18_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getChangeableEBooleanParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEReference7627);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3724:4: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==96) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3724:6: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,96,FollowSets000.FOLLOW_96_in_ruleEReference7642); 

                        	newLeafNode(otherlv_19, grammarAccess.getEReferenceAccess().getDefaultValueLiteralKeyword_14_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3728:1: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3729:1: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3729:1: (lv_defaultValueLiteral_20_0= ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3730:3: lv_defaultValueLiteral_20_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEReference7663);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3746:4: (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==101) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3746:6: otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    {
                    otherlv_21=(Token)match(input,101,FollowSets000.FOLLOW_101_in_ruleEReference7678); 

                        	newLeafNode(otherlv_21, grammarAccess.getEReferenceAccess().getResolveProxiesKeyword_15_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3750:1: ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3751:1: (lv_resolveProxies_22_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3751:1: (lv_resolveProxies_22_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3752:3: lv_resolveProxies_22_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getResolveProxiesEBooleanParserRuleCall_15_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEReference7699);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3768:4: (otherlv_23= 'eType' ( ( ruleEString ) ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==97) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3768:6: otherlv_23= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_23=(Token)match(input,97,FollowSets000.FOLLOW_97_in_ruleEReference7714); 

                        	newLeafNode(otherlv_23, grammarAccess.getEReferenceAccess().getETypeKeyword_16_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3772:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3773:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3773:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3774:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getETypeEClassifierCrossReference_16_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEReference7737);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3787:4: (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==102) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3787:6: otherlv_25= 'eOpposite' ( ( ruleEString ) )
                    {
                    otherlv_25=(Token)match(input,102,FollowSets000.FOLLOW_102_in_ruleEReference7752); 

                        	newLeafNode(otherlv_25, grammarAccess.getEReferenceAccess().getEOppositeKeyword_17_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3791:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3792:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3792:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3793:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getEOppositeEReferenceCrossReference_17_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEReference7775);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3806:4: (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==103) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3806:6: otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')'
                    {
                    otherlv_27=(Token)match(input,103,FollowSets000.FOLLOW_103_in_ruleEReference7790); 

                        	newLeafNode(otherlv_27, grammarAccess.getEReferenceAccess().getEKeysKeyword_18_0());
                        
                    otherlv_28=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEReference7802); 

                        	newLeafNode(otherlv_28, grammarAccess.getEReferenceAccess().getLeftParenthesisKeyword_18_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3814:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3815:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3815:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3816:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEReference7825);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3829:2: (otherlv_30= ',' ( ( ruleEString ) ) )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==17) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3829:4: otherlv_30= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_30=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEReference7838); 

                    	        	newLeafNode(otherlv_30, grammarAccess.getEReferenceAccess().getCommaKeyword_18_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3833:1: ( ( ruleEString ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3834:1: ( ruleEString )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3834:1: ( ruleEString )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3835:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEReferenceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEReference7861);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop126;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEReference7875); 

                        	newLeafNode(otherlv_32, grammarAccess.getEReferenceAccess().getRightParenthesisKeyword_18_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3852:3: (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==27) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3852:5: otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEReference7890); 

                        	newLeafNode(otherlv_33, grammarAccess.getEReferenceAccess().getEAnnotationsKeyword_19_0());
                        
                    otherlv_34=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEReference7902); 

                        	newLeafNode(otherlv_34, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_19_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3860:1: ( (lv_eAnnotations_35_0= ruleEAnnotation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3861:1: (lv_eAnnotations_35_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3861:1: (lv_eAnnotations_35_0= ruleEAnnotation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3862:3: lv_eAnnotations_35_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getEAnnotationsEAnnotationParserRuleCall_19_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEReference7923);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3878:2: (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==17) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3878:4: otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_36=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEReference7936); 

                    	        	newLeafNode(otherlv_36, grammarAccess.getEReferenceAccess().getCommaKeyword_19_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3882:1: ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3883:1: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3883:1: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3884:3: lv_eAnnotations_37_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEReferenceAccess().getEAnnotationsEAnnotationParserRuleCall_19_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEReference7957);
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
                    	    break loop128;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEReference7971); 

                        	newLeafNode(otherlv_38, grammarAccess.getEReferenceAccess().getRightCurlyBracketKeyword_19_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3904:3: (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==98) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3904:5: otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    {
                    otherlv_39=(Token)match(input,98,FollowSets000.FOLLOW_98_in_ruleEReference7986); 

                        	newLeafNode(otherlv_39, grammarAccess.getEReferenceAccess().getEGenericTypeKeyword_20_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3908:1: ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3909:1: (lv_eGenericType_40_0= ruleEGenericType )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3909:1: (lv_eGenericType_40_0= ruleEGenericType )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3910:3: lv_eGenericType_40_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEReferenceAccess().getEGenericTypeEGenericTypeParserRuleCall_20_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEReference8007);
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

            otherlv_41=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEReference8021); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3938:1: entryRuleEOperation returns [EObject current=null] : iv_ruleEOperation= ruleEOperation EOF ;
    public final EObject entryRuleEOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperation = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3939:2: (iv_ruleEOperation= ruleEOperation EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3940:2: iv_ruleEOperation= ruleEOperation EOF
            {
             newCompositeNode(grammarAccess.getEOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEOperation_in_entryRuleEOperation8057);
            iv_ruleEOperation=ruleEOperation();

            state._fsp--;

             current =iv_ruleEOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEOperation8067); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3947:1: ruleEOperation returns [EObject current=null] : ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3950:28: ( ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3951:1: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3951:1: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3951:2: () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3951:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3952:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEOperationAccess().getEOperationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,104,FollowSets000.FOLLOW_104_in_ruleEOperation8113); 

                	newLeafNode(otherlv_1, grammarAccess.getEOperationAccess().getEOperationKeyword_1());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3961:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3962:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3962:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3963:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEOperationAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEOperation8134);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEOperation8146); 

                	newLeafNode(otherlv_3, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3983:1: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==91) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3983:3: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleEOperation8159); 

                        	newLeafNode(otherlv_4, grammarAccess.getEOperationAccess().getOrderedKeyword_4_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3987:1: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3988:1: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3988:1: (lv_ordered_5_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:3989:3: lv_ordered_5_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getOrderedEBooleanParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEOperation8180);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4005:4: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==92) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4005:6: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleEOperation8195); 

                        	newLeafNode(otherlv_6, grammarAccess.getEOperationAccess().getUniqueKeyword_5_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4009:1: ( (lv_unique_7_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4010:1: (lv_unique_7_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4010:1: (lv_unique_7_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4011:3: lv_unique_7_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getUniqueEBooleanParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEOperation8216);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4027:4: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==93) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4027:6: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleEOperation8231); 

                        	newLeafNode(otherlv_8, grammarAccess.getEOperationAccess().getLowerBoundKeyword_6_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4031:1: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4032:1: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4032:1: (lv_lowerBound_9_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4033:3: lv_lowerBound_9_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getLowerBoundEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEOperation8252);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4049:4: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==94) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4049:6: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleEOperation8267); 

                        	newLeafNode(otherlv_10, grammarAccess.getEOperationAccess().getUpperBoundKeyword_7_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4053:1: ( (lv_upperBound_11_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4054:1: (lv_upperBound_11_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4054:1: (lv_upperBound_11_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4055:3: lv_upperBound_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getUpperBoundEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEOperation8288);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4071:4: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==97) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4071:6: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,97,FollowSets000.FOLLOW_97_in_ruleEOperation8303); 

                        	newLeafNode(otherlv_12, grammarAccess.getEOperationAccess().getETypeKeyword_8_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4075:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4076:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4076:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4077:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEOperationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getETypeEClassifierCrossReference_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEOperation8326);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4090:4: (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==105) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4090:6: otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')'
                    {
                    otherlv_14=(Token)match(input,105,FollowSets000.FOLLOW_105_in_ruleEOperation8341); 

                        	newLeafNode(otherlv_14, grammarAccess.getEOperationAccess().getEExceptionsKeyword_9_0());
                        
                    otherlv_15=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEOperation8353); 

                        	newLeafNode(otherlv_15, grammarAccess.getEOperationAccess().getLeftParenthesisKeyword_9_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4098:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4099:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4099:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4100:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEOperationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEOperation8376);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4113:2: (otherlv_17= ',' ( ( ruleEString ) ) )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==17) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4113:4: otherlv_17= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEOperation8389); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getEOperationAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4117:1: ( ( ruleEString ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4118:1: ( ruleEString )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4118:1: ( ruleEString )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4119:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEOperationRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEOperation8412);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop136;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEOperation8426); 

                        	newLeafNode(otherlv_19, grammarAccess.getEOperationAccess().getRightParenthesisKeyword_9_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4136:3: (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==27) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4136:5: otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEOperation8441); 

                        	newLeafNode(otherlv_20, grammarAccess.getEOperationAccess().getEAnnotationsKeyword_10_0());
                        
                    otherlv_21=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEOperation8453); 

                        	newLeafNode(otherlv_21, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4144:1: ( (lv_eAnnotations_22_0= ruleEAnnotation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4145:1: (lv_eAnnotations_22_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4145:1: (lv_eAnnotations_22_0= ruleEAnnotation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4146:3: lv_eAnnotations_22_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getEAnnotationsEAnnotationParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEOperation8474);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4162:2: (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )*
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==17) ) {
                            alt138=1;
                        }


                        switch (alt138) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4162:4: otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEOperation8487); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getEOperationAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4166:1: ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4167:1: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4167:1: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4168:3: lv_eAnnotations_24_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEOperationAccess().getEAnnotationsEAnnotationParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEOperation8508);
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
                    	    break loop138;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEOperation8522); 

                        	newLeafNode(otherlv_25, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4188:3: (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==98) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4188:5: otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    {
                    otherlv_26=(Token)match(input,98,FollowSets000.FOLLOW_98_in_ruleEOperation8537); 

                        	newLeafNode(otherlv_26, grammarAccess.getEOperationAccess().getEGenericTypeKeyword_11_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4192:1: ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4193:1: (lv_eGenericType_27_0= ruleEGenericType )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4193:1: (lv_eGenericType_27_0= ruleEGenericType )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4194:3: lv_eGenericType_27_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getEGenericTypeEGenericTypeParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEOperation8558);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4210:4: (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==48) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4210:6: otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEOperation8573); 

                        	newLeafNode(otherlv_28, grammarAccess.getEOperationAccess().getETypeParametersKeyword_12_0());
                        
                    otherlv_29=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEOperation8585); 

                        	newLeafNode(otherlv_29, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_12_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4218:1: ( (lv_eTypeParameters_30_0= ruleETypeParameter ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4219:1: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4219:1: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4220:3: lv_eTypeParameters_30_0= ruleETypeParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getETypeParametersETypeParameterParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEOperation8606);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4236:2: (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )*
                    loop141:
                    do {
                        int alt141=2;
                        int LA141_0 = input.LA(1);

                        if ( (LA141_0==17) ) {
                            alt141=1;
                        }


                        switch (alt141) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4236:4: otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_31=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEOperation8619); 

                    	        	newLeafNode(otherlv_31, grammarAccess.getEOperationAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4240:1: ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4241:1: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4241:1: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4242:3: lv_eTypeParameters_32_0= ruleETypeParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEOperationAccess().getETypeParametersETypeParameterParserRuleCall_12_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleETypeParameter_in_ruleEOperation8640);
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
                    	    break loop141;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEOperation8654); 

                        	newLeafNode(otherlv_33, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_12_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4262:3: (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==106) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4262:5: otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,106,FollowSets000.FOLLOW_106_in_ruleEOperation8669); 

                        	newLeafNode(otherlv_34, grammarAccess.getEOperationAccess().getEParametersKeyword_13_0());
                        
                    otherlv_35=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEOperation8681); 

                        	newLeafNode(otherlv_35, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_13_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4270:1: ( (lv_eParameters_36_0= ruleEParameter ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4271:1: (lv_eParameters_36_0= ruleEParameter )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4271:1: (lv_eParameters_36_0= ruleEParameter )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4272:3: lv_eParameters_36_0= ruleEParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getEParametersEParameterParserRuleCall_13_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEParameter_in_ruleEOperation8702);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4288:2: (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )*
                    loop143:
                    do {
                        int alt143=2;
                        int LA143_0 = input.LA(1);

                        if ( (LA143_0==17) ) {
                            alt143=1;
                        }


                        switch (alt143) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4288:4: otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    {
                    	    otherlv_37=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEOperation8715); 

                    	        	newLeafNode(otherlv_37, grammarAccess.getEOperationAccess().getCommaKeyword_13_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4292:1: ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4293:1: (lv_eParameters_38_0= ruleEParameter )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4293:1: (lv_eParameters_38_0= ruleEParameter )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4294:3: lv_eParameters_38_0= ruleEParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEOperationAccess().getEParametersEParameterParserRuleCall_13_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEParameter_in_ruleEOperation8736);
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
                    	    break loop143;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEOperation8750); 

                        	newLeafNode(otherlv_39, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_13_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4314:3: (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==107) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4314:5: otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,107,FollowSets000.FOLLOW_107_in_ruleEOperation8765); 

                        	newLeafNode(otherlv_40, grammarAccess.getEOperationAccess().getEGenericExceptionsKeyword_14_0());
                        
                    otherlv_41=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEOperation8777); 

                        	newLeafNode(otherlv_41, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_14_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4322:1: ( (lv_eGenericExceptions_42_0= ruleEGenericType ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4323:1: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4323:1: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4324:3: lv_eGenericExceptions_42_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEOperationAccess().getEGenericExceptionsEGenericTypeParserRuleCall_14_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEOperation8798);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4340:2: (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )*
                    loop145:
                    do {
                        int alt145=2;
                        int LA145_0 = input.LA(1);

                        if ( (LA145_0==17) ) {
                            alt145=1;
                        }


                        switch (alt145) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4340:4: otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEOperation8811); 

                    	        	newLeafNode(otherlv_43, grammarAccess.getEOperationAccess().getCommaKeyword_14_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4344:1: ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4345:1: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4345:1: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4346:3: lv_eGenericExceptions_44_0= ruleEGenericType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEOperationAccess().getEGenericExceptionsEGenericTypeParserRuleCall_14_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEOperation8832);
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
                    	    break loop145;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEOperation8846); 

                        	newLeafNode(otherlv_45, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_14_4());
                        

                    }
                    break;

            }

            otherlv_46=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEOperation8860); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4378:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4379:2: (iv_ruleEParameter= ruleEParameter EOF )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4380:2: iv_ruleEParameter= ruleEParameter EOF
            {
             newCompositeNode(grammarAccess.getEParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEParameter_in_entryRuleEParameter8896);
            iv_ruleEParameter=ruleEParameter();

            state._fsp--;

             current =iv_ruleEParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEParameter8906); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4387:1: ruleEParameter returns [EObject current=null] : ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) ;
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
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4390:28: ( ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4391:1: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4391:1: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4391:2: () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}'
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4391:2: ()
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4392:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEParameterAccess().getEParameterAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,108,FollowSets000.FOLLOW_108_in_ruleEParameter8952); 

                	newLeafNode(otherlv_1, grammarAccess.getEParameterAccess().getEParameterKeyword_1());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4401:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4402:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4402:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4403:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEParameterAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEParameter8973);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEParameter8985); 

                	newLeafNode(otherlv_3, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4423:1: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==91) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4423:3: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleEParameter8998); 

                        	newLeafNode(otherlv_4, grammarAccess.getEParameterAccess().getOrderedKeyword_4_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4427:1: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4428:1: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4428:1: (lv_ordered_5_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4429:3: lv_ordered_5_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEParameterAccess().getOrderedEBooleanParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEParameter9019);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4445:4: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==92) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4445:6: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleEParameter9034); 

                        	newLeafNode(otherlv_6, grammarAccess.getEParameterAccess().getUniqueKeyword_5_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4449:1: ( (lv_unique_7_0= ruleEBoolean ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4450:1: (lv_unique_7_0= ruleEBoolean )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4450:1: (lv_unique_7_0= ruleEBoolean )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4451:3: lv_unique_7_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getEParameterAccess().getUniqueEBooleanParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleEParameter9055);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4467:4: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==93) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4467:6: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleEParameter9070); 

                        	newLeafNode(otherlv_8, grammarAccess.getEParameterAccess().getLowerBoundKeyword_6_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4471:1: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4472:1: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4472:1: (lv_lowerBound_9_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4473:3: lv_lowerBound_9_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEParameterAccess().getLowerBoundEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEParameter9091);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4489:4: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==94) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4489:6: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleEParameter9106); 

                        	newLeafNode(otherlv_10, grammarAccess.getEParameterAccess().getUpperBoundKeyword_7_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4493:1: ( (lv_upperBound_11_0= ruleEInt ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4494:1: (lv_upperBound_11_0= ruleEInt )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4494:1: (lv_upperBound_11_0= ruleEInt )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4495:3: lv_upperBound_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEParameterAccess().getUpperBoundEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEParameter9127);
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

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4511:4: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==97) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4511:6: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,97,FollowSets000.FOLLOW_97_in_ruleEParameter9142); 

                        	newLeafNode(otherlv_12, grammarAccess.getEParameterAccess().getETypeKeyword_8_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4515:1: ( ( ruleEString ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4516:1: ( ruleEString )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4516:1: ( ruleEString )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4517:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEParameterRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEParameterAccess().getETypeEClassifierCrossReference_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEParameter9165);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4530:4: (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==27) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4530:6: otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEParameter9180); 

                        	newLeafNode(otherlv_14, grammarAccess.getEParameterAccess().getEAnnotationsKeyword_9_0());
                        
                    otherlv_15=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEParameter9192); 

                        	newLeafNode(otherlv_15, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4538:1: ( (lv_eAnnotations_16_0= ruleEAnnotation ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4539:1: (lv_eAnnotations_16_0= ruleEAnnotation )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4539:1: (lv_eAnnotations_16_0= ruleEAnnotation )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4540:3: lv_eAnnotations_16_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEParameterAccess().getEAnnotationsEAnnotationParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEParameter9213);
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

                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4556:2: (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )*
                    loop152:
                    do {
                        int alt152=2;
                        int LA152_0 = input.LA(1);

                        if ( (LA152_0==17) ) {
                            alt152=1;
                        }


                        switch (alt152) {
                    	case 1 :
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4556:4: otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEParameter9226); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getEParameterAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4560:1: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4561:1: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    {
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4561:1: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4562:3: lv_eAnnotations_18_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEParameterAccess().getEAnnotationsEAnnotationParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEParameter9247);
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
                    	    break loop152;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEParameter9261); 

                        	newLeafNode(otherlv_19, grammarAccess.getEParameterAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4582:3: (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==98) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4582:5: otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    {
                    otherlv_20=(Token)match(input,98,FollowSets000.FOLLOW_98_in_ruleEParameter9276); 

                        	newLeafNode(otherlv_20, grammarAccess.getEParameterAccess().getEGenericTypeKeyword_10_0());
                        
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4586:1: ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4587:1: (lv_eGenericType_21_0= ruleEGenericType )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4587:1: (lv_eGenericType_21_0= ruleEGenericType )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4588:3: lv_eGenericType_21_0= ruleEGenericType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEParameterAccess().getEGenericTypeEGenericTypeParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEGenericType_in_ruleEParameter9297);
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

            otherlv_22=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEParameter9311); 

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
    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4616:1: ruleLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) ) ;
    public final Enumerator ruleLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4618:28: ( ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) ) )
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4619:1: ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) )
            {
            // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4619:1: ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) )
            int alt155=5;
            switch ( input.LA(1) ) {
            case 109:
                {
                alt155=1;
                }
                break;
            case 110:
                {
                alt155=2;
                }
                break;
            case 111:
                {
                alt155=3;
                }
                break;
            case 112:
                {
                alt155=4;
                }
                break;
            case 113:
                {
                alt155=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 155, 0, input);

                throw nvae;
            }

            switch (alt155) {
                case 1 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4619:2: (enumLiteral_0= 'fr' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4619:2: (enumLiteral_0= 'fr' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4619:4: enumLiteral_0= 'fr'
                    {
                    enumLiteral_0=(Token)match(input,109,FollowSets000.FOLLOW_109_in_ruleLanguage9361); 

                            current = grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4625:6: (enumLiteral_1= 'en' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4625:6: (enumLiteral_1= 'en' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4625:8: enumLiteral_1= 'en'
                    {
                    enumLiteral_1=(Token)match(input,110,FollowSets000.FOLLOW_110_in_ruleLanguage9378); 

                            current = grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4631:6: (enumLiteral_2= 'de' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4631:6: (enumLiteral_2= 'de' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4631:8: enumLiteral_2= 'de'
                    {
                    enumLiteral_2=(Token)match(input,111,FollowSets000.FOLLOW_111_in_ruleLanguage9395); 

                            current = grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4637:6: (enumLiteral_3= 'es' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4637:6: (enumLiteral_3= 'es' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4637:8: enumLiteral_3= 'es'
                    {
                    enumLiteral_3=(Token)match(input,112,FollowSets000.FOLLOW_112_in_ruleLanguage9412); 

                            current = grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4643:6: (enumLiteral_4= 'it' )
                    {
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4643:6: (enumLiteral_4= 'it' )
                    // ../com.opcoach.datasample.xtext/src-gen/com/opcoach/datasample/xtext/parser/antlr/internal/InternalDataSampleDSL.g:4643:8: enumLiteral_4= 'it'
                    {
                    enumLiteral_4=(Token)match(input,113,FollowSets000.FOLLOW_113_in_ruleLanguage9429); 

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
        public static final BitSet FOLLOW_12_in_ruleDataSample164 = new BitSet(new long[]{0x00000000007DE000L});
        public static final BitSet FOLLOW_13_in_ruleDataSample177 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleDataSample198 = new BitSet(new long[]{0x00000000007DC000L});
        public static final BitSet FOLLOW_14_in_ruleDataSample213 = new BitSet(new long[]{0x0000000000000000L,0x0003E00000000000L});
        public static final BitSet FOLLOW_ruleLanguage_in_ruleDataSample234 = new BitSet(new long[]{0x00000000007D8000L});
        public static final BitSet FOLLOW_15_in_ruleDataSample249 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDataSample270 = new BitSet(new long[]{0x00000000007D0000L});
        public static final BitSet FOLLOW_16_in_ruleDataSample285 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDataSample297 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDataSample318 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleDataSample331 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDataSample352 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleDataSample366 = new BitSet(new long[]{0x00000000007C0000L});
        public static final BitSet FOLLOW_19_in_ruleDataSample381 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDataSample404 = new BitSet(new long[]{0x0000000000740000L});
        public static final BitSet FOLLOW_20_in_ruleDataSample419 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDataSample442 = new BitSet(new long[]{0x0000000000640000L});
        public static final BitSet FOLLOW_21_in_ruleDataSample457 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDataSample469 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleEntityGenerator_in_ruleDataSample490 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleDataSample503 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleEntityGenerator_in_ruleDataSample524 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleDataSample538 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleDataSample553 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDataSample565 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleFieldGenerator_in_ruleDataSample586 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleDataSample599 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleFieldGenerator_in_ruleDataSample620 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleDataSample634 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleDataSample648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEClassifier_in_entryRuleEClassifier684 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEClassifier694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEClass_in_ruleEClassifier741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDataType_Impl_in_ruleEClassifier768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEEnum_in_ruleEClassifier795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEStructuralFeature_in_entryRuleEStructuralFeature832 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEStructuralFeature842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAttribute_in_ruleEStructuralFeature889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEReference_in_ruleEStructuralFeature916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString952 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1075 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleEInt1125 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEPackage_in_entryRuleEPackage1187 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEPackage1197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleEPackage1243 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEPackage1264 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEPackage1276 = new BitSet(new long[]{0x000000003E040000L});
        public static final BitSet FOLLOW_25_in_ruleEPackage1289 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEPackage1310 = new BitSet(new long[]{0x000000003C040000L});
        public static final BitSet FOLLOW_26_in_ruleEPackage1325 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEPackage1346 = new BitSet(new long[]{0x0000000038040000L});
        public static final BitSet FOLLOW_27_in_ruleEPackage1361 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEPackage1373 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEPackage1394 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEPackage1407 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEPackage1428 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEPackage1442 = new BitSet(new long[]{0x0000000030040000L});
        public static final BitSet FOLLOW_28_in_ruleEPackage1457 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEPackage1469 = new BitSet(new long[]{0x8000070000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEClassifier_in_ruleEPackage1490 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEPackage1503 = new BitSet(new long[]{0x8000070000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEClassifier_in_ruleEPackage1524 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEPackage1538 = new BitSet(new long[]{0x0000000020040000L});
        public static final BitSet FOLLOW_29_in_ruleEPackage1553 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEPackage1565 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleEPackage_in_ruleEPackage1586 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEPackage1599 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleEPackage_in_ruleEPackage1620 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEPackage1634 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEPackage1648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityGenerator_in_entryRuleEntityGenerator1684 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntityGenerator1694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleEntityGenerator1740 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEntityGenerator1752 = new BitSet(new long[]{0x0000000380040000L});
        public static final BitSet FOLLOW_31_in_ruleEntityGenerator1765 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEntityGenerator1786 = new BitSet(new long[]{0x0000000300040000L});
        public static final BitSet FOLLOW_32_in_ruleEntityGenerator1801 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEntityGenerator1822 = new BitSet(new long[]{0x0000000200040000L});
        public static final BitSet FOLLOW_33_in_ruleEntityGenerator1837 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEntityGenerator1860 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEntityGenerator1874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFieldGenerator_in_entryRuleFieldGenerator1910 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFieldGenerator1920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleFieldGenerator1957 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFieldGenerator1969 = new BitSet(new long[]{0x0000007900000000L});
        public static final BitSet FOLLOW_32_in_ruleFieldGenerator1982 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFieldGenerator2003 = new BitSet(new long[]{0x0000007800000000L});
        public static final BitSet FOLLOW_35_in_ruleFieldGenerator2018 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFieldGenerator2039 = new BitSet(new long[]{0x0000007000000000L});
        public static final BitSet FOLLOW_36_in_ruleFieldGenerator2054 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleFieldGenerator2075 = new BitSet(new long[]{0x0000006000000000L});
        public static final BitSet FOLLOW_37_in_ruleFieldGenerator2090 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFieldGenerator2111 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleFieldGenerator2125 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFieldGenerator2148 = new BitSet(new long[]{0x0000008000040000L});
        public static final BitSet FOLLOW_39_in_ruleFieldGenerator2161 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFieldGenerator2184 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleFieldGenerator2198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEClass_in_entryRuleEClass2234 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEClass2244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleEClass2296 = new BitSet(new long[]{0x0000060000000000L});
        public static final BitSet FOLLOW_41_in_ruleEClass2328 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleEClass2354 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEClass2375 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEClass2387 = new BitSet(new long[]{0x000F380008040000L});
        public static final BitSet FOLLOW_43_in_ruleEClass2400 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEClass2421 = new BitSet(new long[]{0x000F300008040000L});
        public static final BitSet FOLLOW_44_in_ruleEClass2436 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEClass2457 = new BitSet(new long[]{0x000F200008040000L});
        public static final BitSet FOLLOW_45_in_ruleEClass2472 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleEClass2484 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEClass2507 = new BitSet(new long[]{0x0000800000020000L});
        public static final BitSet FOLLOW_17_in_ruleEClass2520 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEClass2543 = new BitSet(new long[]{0x0000800000020000L});
        public static final BitSet FOLLOW_47_in_ruleEClass2557 = new BitSet(new long[]{0x000F000008040000L});
        public static final BitSet FOLLOW_27_in_ruleEClass2572 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEClass2584 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEClass2605 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEClass2618 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEClass2639 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEClass2653 = new BitSet(new long[]{0x000F000000040000L});
        public static final BitSet FOLLOW_48_in_ruleEClass2668 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEClass2680 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEClass2701 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEClass2714 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEClass2735 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEClass2749 = new BitSet(new long[]{0x000E000000040000L});
        public static final BitSet FOLLOW_49_in_ruleEClass2764 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEClass2776 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
        public static final BitSet FOLLOW_ruleEOperation_in_ruleEClass2797 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEClass2810 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
        public static final BitSet FOLLOW_ruleEOperation_in_ruleEClass2831 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEClass2845 = new BitSet(new long[]{0x000C000000040000L});
        public static final BitSet FOLLOW_50_in_ruleEClass2860 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEClass2872 = new BitSet(new long[]{0x0000000000000000L,0x0000001807E00000L});
        public static final BitSet FOLLOW_ruleEStructuralFeature_in_ruleEClass2893 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEClass2906 = new BitSet(new long[]{0x0000000000000000L,0x0000001807E00000L});
        public static final BitSet FOLLOW_ruleEStructuralFeature_in_ruleEClass2927 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEClass2941 = new BitSet(new long[]{0x0008000000040000L});
        public static final BitSet FOLLOW_51_in_ruleEClass2956 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEClass2968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEClass2989 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEClass3002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEClass3023 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEClass3037 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEClass3051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_entryRuleEAnnotation3087 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEAnnotation3097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleEAnnotation3143 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEAnnotation3155 = new BitSet(new long[]{0x01E0000008040000L});
        public static final BitSet FOLLOW_53_in_ruleEAnnotation3168 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEAnnotation3189 = new BitSet(new long[]{0x01C0000008040000L});
        public static final BitSet FOLLOW_54_in_ruleEAnnotation3204 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleEAnnotation3216 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEAnnotation3239 = new BitSet(new long[]{0x0000800000020000L});
        public static final BitSet FOLLOW_17_in_ruleEAnnotation3252 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEAnnotation3275 = new BitSet(new long[]{0x0000800000020000L});
        public static final BitSet FOLLOW_47_in_ruleEAnnotation3289 = new BitSet(new long[]{0x0180000008040000L});
        public static final BitSet FOLLOW_27_in_ruleEAnnotation3304 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEAnnotation3316 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEAnnotation3337 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEAnnotation3350 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEAnnotation3371 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEAnnotation3385 = new BitSet(new long[]{0x0180000000040000L});
        public static final BitSet FOLLOW_55_in_ruleEAnnotation3400 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEAnnotation3412 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_ruleEStringToStringMapEntry_in_ruleEAnnotation3433 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEAnnotation3446 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_ruleEStringToStringMapEntry_in_ruleEAnnotation3467 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEAnnotation3481 = new BitSet(new long[]{0x0100000000040000L});
        public static final BitSet FOLLOW_56_in_ruleEAnnotation3496 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEAnnotation3508 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_ruleEObject_in_ruleEAnnotation3529 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEAnnotation3542 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_ruleEObject_in_ruleEAnnotation3563 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEAnnotation3577 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEAnnotation3591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEStringToStringMapEntry_in_entryRuleEStringToStringMapEntry3627 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEStringToStringMapEntry3637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleEStringToStringMapEntry3683 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEStringToStringMapEntry3695 = new BitSet(new long[]{0x0C00000000040000L});
        public static final BitSet FOLLOW_58_in_ruleEStringToStringMapEntry3708 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEStringToStringMapEntry3729 = new BitSet(new long[]{0x0800000000040000L});
        public static final BitSet FOLLOW_59_in_ruleEStringToStringMapEntry3744 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEStringToStringMapEntry3765 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEStringToStringMapEntry3779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEObject_in_entryRuleEObject3815 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEObject3825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleEObject3871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_entryRuleETypeParameter3907 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleETypeParameter3917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleETypeParameter3963 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleETypeParameter3984 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleETypeParameter3996 = new BitSet(new long[]{0x4000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleETypeParameter4009 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleETypeParameter4021 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleETypeParameter4042 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleETypeParameter4055 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleETypeParameter4076 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleETypeParameter4090 = new BitSet(new long[]{0x4000000000040000L});
        public static final BitSet FOLLOW_62_in_ruleETypeParameter4105 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleETypeParameter4117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleETypeParameter4138 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleETypeParameter4151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleETypeParameter4172 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleETypeParameter4186 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleETypeParameter4200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDataType_Impl_in_entryRuleEDataType_Impl4236 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDataType_Impl4246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleEDataType_Impl4292 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEDataType_Impl4313 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDataType_Impl4325 = new BitSet(new long[]{0x0001180008040000L,0x0000000000000001L});
        public static final BitSet FOLLOW_43_in_ruleEDataType_Impl4338 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEDataType_Impl4359 = new BitSet(new long[]{0x0001100008040000L,0x0000000000000001L});
        public static final BitSet FOLLOW_44_in_ruleEDataType_Impl4374 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEDataType_Impl4395 = new BitSet(new long[]{0x0001000008040000L,0x0000000000000001L});
        public static final BitSet FOLLOW_64_in_ruleEDataType_Impl4410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEDataType_Impl4431 = new BitSet(new long[]{0x0001000008040000L});
        public static final BitSet FOLLOW_27_in_ruleEDataType_Impl4446 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDataType_Impl4458 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEDataType_Impl4479 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEDataType_Impl4492 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEDataType_Impl4513 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEDataType_Impl4527 = new BitSet(new long[]{0x0001000000040000L});
        public static final BitSet FOLLOW_48_in_ruleEDataType_Impl4542 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDataType_Impl4554 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEDataType_Impl4575 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEDataType_Impl4588 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEDataType_Impl4609 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEDataType_Impl4623 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEDataType_Impl4637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEEnum_in_entryRuleEEnum4673 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEEnum4683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleEEnum4729 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEEnum4750 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEEnum4762 = new BitSet(new long[]{0x0001180008040000L,0x0000000000000005L});
        public static final BitSet FOLLOW_43_in_ruleEEnum4775 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEEnum4796 = new BitSet(new long[]{0x0001100008040000L,0x0000000000000005L});
        public static final BitSet FOLLOW_44_in_ruleEEnum4811 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEEnum4832 = new BitSet(new long[]{0x0001000008040000L,0x0000000000000005L});
        public static final BitSet FOLLOW_64_in_ruleEEnum4847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEEnum4868 = new BitSet(new long[]{0x0001000008040000L,0x0000000000000004L});
        public static final BitSet FOLLOW_27_in_ruleEEnum4883 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEEnum4895 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEEnum4916 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEEnum4929 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEEnum4950 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEEnum4964 = new BitSet(new long[]{0x0001000000040000L,0x0000000000000004L});
        public static final BitSet FOLLOW_48_in_ruleEEnum4979 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEEnum4991 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEEnum5012 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEEnum5025 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEEnum5046 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEEnum5060 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000004L});
        public static final BitSet FOLLOW_66_in_ruleEEnum5075 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEEnum5087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_ruleEEnumLiteral_in_ruleEEnum5108 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEEnum5121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_ruleEEnumLiteral_in_ruleEEnum5142 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEEnum5156 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEEnum5170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEGenericType_in_entryRuleEGenericType5206 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEGenericType5216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleEGenericType5262 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEGenericType5274 = new BitSet(new long[]{0x0000000000040000L,0x00000000000001F0L});
        public static final BitSet FOLLOW_68_in_ruleEGenericType5287 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEGenericType5310 = new BitSet(new long[]{0x0000000000040000L,0x00000000000001E0L});
        public static final BitSet FOLLOW_69_in_ruleEGenericType5325 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEGenericType5348 = new BitSet(new long[]{0x0000000000040000L,0x00000000000001C0L});
        public static final BitSet FOLLOW_70_in_ruleEGenericType5363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEGenericType5384 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000180L});
        public static final BitSet FOLLOW_71_in_ruleEGenericType5399 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEGenericType5411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEGenericType5432 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEGenericType5445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEGenericType5466 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEGenericType5480 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000100L});
        public static final BitSet FOLLOW_72_in_ruleEGenericType5495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEGenericType5516 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEGenericType5530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean5567 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean5578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleEBoolean5616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleEBoolean5635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEEnumLiteral_in_entryRuleEEnumLiteral5675 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEEnumLiteral5685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleEEnumLiteral5731 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEEnumLiteral5752 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEEnumLiteral5764 = new BitSet(new long[]{0x0800000008040000L,0x0000000000001000L});
        public static final BitSet FOLLOW_59_in_ruleEEnumLiteral5777 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEEnumLiteral5798 = new BitSet(new long[]{0x0000000008040000L,0x0000000000001000L});
        public static final BitSet FOLLOW_76_in_ruleEEnumLiteral5813 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEEnumLiteral5834 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleEEnumLiteral5849 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEEnumLiteral5861 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEEnumLiteral5882 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEEnumLiteral5895 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEEnumLiteral5916 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEEnumLiteral5930 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEEnumLiteral5944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleELong_in_entryRuleELong5981 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleELong5992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleELong6031 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleELong6048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocale_in_entryRuleLocale6094 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocale6105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleLocale6142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferenceGenerator_in_entryRuleReferenceGenerator6181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReferenceGenerator6191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleReferenceGenerator6237 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleReferenceGenerator6249 = new BitSet(new long[]{0x0000000000040000L,0x00000000001F8000L});
        public static final BitSet FOLLOW_79_in_ruleReferenceGenerator6262 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleReferenceGenerator6283 = new BitSet(new long[]{0x0000000000040000L,0x00000000001F0000L});
        public static final BitSet FOLLOW_80_in_ruleReferenceGenerator6298 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleELong_in_ruleReferenceGenerator6319 = new BitSet(new long[]{0x0000000000040000L,0x00000000001E0000L});
        public static final BitSet FOLLOW_81_in_ruleReferenceGenerator6334 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReferenceGenerator6355 = new BitSet(new long[]{0x0000000000040000L,0x00000000001C0000L});
        public static final BitSet FOLLOW_82_in_ruleReferenceGenerator6370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleLocale_in_ruleReferenceGenerator6391 = new BitSet(new long[]{0x0000000000040000L,0x0000000000180000L});
        public static final BitSet FOLLOW_83_in_ruleReferenceGenerator6406 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleReferenceGenerator6427 = new BitSet(new long[]{0x0000000000040000L,0x0000000000100000L});
        public static final BitSet FOLLOW_84_in_ruleReferenceGenerator6442 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReferenceGenerator6465 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleReferenceGenerator6479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAttribute_in_entryRuleEAttribute6517 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEAttribute6527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_ruleEAttribute6579 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
        public static final BitSet FOLLOW_86_in_ruleEAttribute6611 = new BitSet(new long[]{0x0000000000000000L,0x0000000007800000L});
        public static final BitSet FOLLOW_87_in_ruleEAttribute6643 = new BitSet(new long[]{0x0000000000000000L,0x0000000007000000L});
        public static final BitSet FOLLOW_88_in_ruleEAttribute6675 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
        public static final BitSet FOLLOW_89_in_ruleEAttribute6707 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
        public static final BitSet FOLLOW_90_in_ruleEAttribute6733 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEAttribute6754 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEAttribute6766 = new BitSet(new long[]{0x0000000008040000L,0x00000007F8000000L});
        public static final BitSet FOLLOW_91_in_ruleEAttribute6779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEAttribute6800 = new BitSet(new long[]{0x0000000008040000L,0x00000007F0000000L});
        public static final BitSet FOLLOW_92_in_ruleEAttribute6815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEAttribute6836 = new BitSet(new long[]{0x0000000008040000L,0x00000007E0000000L});
        public static final BitSet FOLLOW_93_in_ruleEAttribute6851 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEAttribute6872 = new BitSet(new long[]{0x0000000008040000L,0x00000007C0000000L});
        public static final BitSet FOLLOW_94_in_ruleEAttribute6887 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEAttribute6908 = new BitSet(new long[]{0x0000000008040000L,0x0000000780000000L});
        public static final BitSet FOLLOW_95_in_ruleEAttribute6923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEAttribute6944 = new BitSet(new long[]{0x0000000008040000L,0x0000000700000000L});
        public static final BitSet FOLLOW_96_in_ruleEAttribute6959 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEAttribute6980 = new BitSet(new long[]{0x0000000008040000L,0x0000000600000000L});
        public static final BitSet FOLLOW_97_in_ruleEAttribute6995 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEAttribute7018 = new BitSet(new long[]{0x0000000008040000L,0x0000000400000000L});
        public static final BitSet FOLLOW_27_in_ruleEAttribute7033 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEAttribute7045 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEAttribute7066 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEAttribute7079 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEAttribute7100 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEAttribute7114 = new BitSet(new long[]{0x0000000000040000L,0x0000000400000000L});
        public static final BitSet FOLLOW_98_in_ruleEAttribute7129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEAttribute7150 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEAttribute7164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEReference_in_entryRuleEReference7200 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEReference7210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_ruleEReference7262 = new BitSet(new long[]{0x0000000000000000L,0x0000001801C00000L});
        public static final BitSet FOLLOW_86_in_ruleEReference7294 = new BitSet(new long[]{0x0000000000000000L,0x0000001801800000L});
        public static final BitSet FOLLOW_87_in_ruleEReference7326 = new BitSet(new long[]{0x0000000000000000L,0x0000001801000000L});
        public static final BitSet FOLLOW_88_in_ruleEReference7358 = new BitSet(new long[]{0x0000000000000000L,0x0000001800000000L});
        public static final BitSet FOLLOW_99_in_ruleEReference7390 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
        public static final BitSet FOLLOW_100_in_ruleEReference7416 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEReference7437 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEReference7449 = new BitSet(new long[]{0x0000000008040000L,0x000000E7F8000000L});
        public static final BitSet FOLLOW_91_in_ruleEReference7462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEReference7483 = new BitSet(new long[]{0x0000000008040000L,0x000000E7F0000000L});
        public static final BitSet FOLLOW_92_in_ruleEReference7498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEReference7519 = new BitSet(new long[]{0x0000000008040000L,0x000000E7E0000000L});
        public static final BitSet FOLLOW_93_in_ruleEReference7534 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEReference7555 = new BitSet(new long[]{0x0000000008040000L,0x000000E7C0000000L});
        public static final BitSet FOLLOW_94_in_ruleEReference7570 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEReference7591 = new BitSet(new long[]{0x0000000008040000L,0x000000E780000000L});
        public static final BitSet FOLLOW_95_in_ruleEReference7606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEReference7627 = new BitSet(new long[]{0x0000000008040000L,0x000000E700000000L});
        public static final BitSet FOLLOW_96_in_ruleEReference7642 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEReference7663 = new BitSet(new long[]{0x0000000008040000L,0x000000E600000000L});
        public static final BitSet FOLLOW_101_in_ruleEReference7678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEReference7699 = new BitSet(new long[]{0x0000000008040000L,0x000000C600000000L});
        public static final BitSet FOLLOW_97_in_ruleEReference7714 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEReference7737 = new BitSet(new long[]{0x0000000008040000L,0x000000C400000000L});
        public static final BitSet FOLLOW_102_in_ruleEReference7752 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEReference7775 = new BitSet(new long[]{0x0000000008040000L,0x0000008400000000L});
        public static final BitSet FOLLOW_103_in_ruleEReference7790 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleEReference7802 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEReference7825 = new BitSet(new long[]{0x0000800000020000L});
        public static final BitSet FOLLOW_17_in_ruleEReference7838 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEReference7861 = new BitSet(new long[]{0x0000800000020000L});
        public static final BitSet FOLLOW_47_in_ruleEReference7875 = new BitSet(new long[]{0x0000000008040000L,0x0000000400000000L});
        public static final BitSet FOLLOW_27_in_ruleEReference7890 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEReference7902 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEReference7923 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEReference7936 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEReference7957 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEReference7971 = new BitSet(new long[]{0x0000000000040000L,0x0000000400000000L});
        public static final BitSet FOLLOW_98_in_ruleEReference7986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEReference8007 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEReference8021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEOperation_in_entryRuleEOperation8057 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEOperation8067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_104_in_ruleEOperation8113 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEOperation8134 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEOperation8146 = new BitSet(new long[]{0x0001000008040000L,0x00000E0678000000L});
        public static final BitSet FOLLOW_91_in_ruleEOperation8159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEOperation8180 = new BitSet(new long[]{0x0001000008040000L,0x00000E0670000000L});
        public static final BitSet FOLLOW_92_in_ruleEOperation8195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEOperation8216 = new BitSet(new long[]{0x0001000008040000L,0x00000E0660000000L});
        public static final BitSet FOLLOW_93_in_ruleEOperation8231 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEOperation8252 = new BitSet(new long[]{0x0001000008040000L,0x00000E0640000000L});
        public static final BitSet FOLLOW_94_in_ruleEOperation8267 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEOperation8288 = new BitSet(new long[]{0x0001000008040000L,0x00000E0600000000L});
        public static final BitSet FOLLOW_97_in_ruleEOperation8303 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEOperation8326 = new BitSet(new long[]{0x0001000008040000L,0x00000E0400000000L});
        public static final BitSet FOLLOW_105_in_ruleEOperation8341 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleEOperation8353 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEOperation8376 = new BitSet(new long[]{0x0000800000020000L});
        public static final BitSet FOLLOW_17_in_ruleEOperation8389 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEOperation8412 = new BitSet(new long[]{0x0000800000020000L});
        public static final BitSet FOLLOW_47_in_ruleEOperation8426 = new BitSet(new long[]{0x0001000008040000L,0x00000C0400000000L});
        public static final BitSet FOLLOW_27_in_ruleEOperation8441 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEOperation8453 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEOperation8474 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEOperation8487 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEOperation8508 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEOperation8522 = new BitSet(new long[]{0x0001000000040000L,0x00000C0400000000L});
        public static final BitSet FOLLOW_98_in_ruleEOperation8537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEOperation8558 = new BitSet(new long[]{0x0001000000040000L,0x00000C0000000000L});
        public static final BitSet FOLLOW_48_in_ruleEOperation8573 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEOperation8585 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEOperation8606 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEOperation8619 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_ruleETypeParameter_in_ruleEOperation8640 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEOperation8654 = new BitSet(new long[]{0x0000000000040000L,0x00000C0000000000L});
        public static final BitSet FOLLOW_106_in_ruleEOperation8669 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEOperation8681 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEParameter_in_ruleEOperation8702 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEOperation8715 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
        public static final BitSet FOLLOW_ruleEParameter_in_ruleEOperation8736 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEOperation8750 = new BitSet(new long[]{0x0000000000040000L,0x0000080000000000L});
        public static final BitSet FOLLOW_107_in_ruleEOperation8765 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEOperation8777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEOperation8798 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEOperation8811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEOperation8832 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEOperation8846 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEOperation8860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEParameter_in_entryRuleEParameter8896 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEParameter8906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_108_in_ruleEParameter8952 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEParameter8973 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEParameter8985 = new BitSet(new long[]{0x0000000008040000L,0x0000000678000000L});
        public static final BitSet FOLLOW_91_in_ruleEParameter8998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEParameter9019 = new BitSet(new long[]{0x0000000008040000L,0x0000000670000000L});
        public static final BitSet FOLLOW_92_in_ruleEParameter9034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleEParameter9055 = new BitSet(new long[]{0x0000000008040000L,0x0000000660000000L});
        public static final BitSet FOLLOW_93_in_ruleEParameter9070 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEParameter9091 = new BitSet(new long[]{0x0000000008040000L,0x0000000640000000L});
        public static final BitSet FOLLOW_94_in_ruleEParameter9106 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEParameter9127 = new BitSet(new long[]{0x0000000008040000L,0x0000000600000000L});
        public static final BitSet FOLLOW_97_in_ruleEParameter9142 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEParameter9165 = new BitSet(new long[]{0x0000000008040000L,0x0000000400000000L});
        public static final BitSet FOLLOW_27_in_ruleEParameter9180 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEParameter9192 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEParameter9213 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEParameter9226 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEParameter9247 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEParameter9261 = new BitSet(new long[]{0x0000000000040000L,0x0000000400000000L});
        public static final BitSet FOLLOW_98_in_ruleEParameter9276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleEGenericType_in_ruleEParameter9297 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEParameter9311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_109_in_ruleLanguage9361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_110_in_ruleLanguage9378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_111_in_ruleLanguage9395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_112_in_ruleLanguage9412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_113_in_ruleLanguage9429 = new BitSet(new long[]{0x0000000000000002L});
    }


}