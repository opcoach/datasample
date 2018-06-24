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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Sample'", "'for '", "'{'", "'seed'", "'language'", "'badValueGeneratorNames'", "','", "'}'", "'In the root object generate '", "'-'", "'forField'", "'.'", "'use'", "'with errorRate='", "'% generated with '", "'fr'", "'en'", "'de'", "'es'", "'it'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=5;
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


        public InternalDataSampleDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDataSampleDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDataSampleDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDataSampleDSL.g"; }



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
    // InternalDataSampleDSL.g:68:1: entryRuleDataSample returns [EObject current=null] : iv_ruleDataSample= ruleDataSample EOF ;
    public final EObject entryRuleDataSample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSample = null;


        try {
            // InternalDataSampleDSL.g:69:2: (iv_ruleDataSample= ruleDataSample EOF )
            // InternalDataSampleDSL.g:70:2: iv_ruleDataSample= ruleDataSample EOF
            {
             newCompositeNode(grammarAccess.getDataSampleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDataSample=ruleDataSample();

            state._fsp--;

             current =iv_ruleDataSample; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDataSampleDSL.g:77:1: ruleDataSample returns [EObject current=null] : ( () otherlv_1= 'Sample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'for ' ( (lv_packageURI_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= 'seed' ( (lv_seed_7_0= ruleEInt ) ) otherlv_8= 'language' ( (lv_language_9_0= ruleLanguage ) ) (otherlv_10= 'badValueGeneratorNames' otherlv_11= '{' ( (lv_badValueGeneratorNames_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) ) )* otherlv_15= '}' )? otherlv_16= 'In the root object generate ' ( (lv_entityGenerators_17_0= ruleEntityGenerator2 ) ) (otherlv_18= ',' ( (lv_entityGenerators_19_0= ruleEntityGenerator2 ) ) )* ( (lv_fieldGenerators_20_0= ruleFieldGenerator2 ) ) (otherlv_21= ',' ( (lv_fieldGenerators_22_0= ruleFieldGenerator2 ) ) )* otherlv_23= '}' ) ;
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
            // InternalDataSampleDSL.g:80:28: ( ( () otherlv_1= 'Sample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'for ' ( (lv_packageURI_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= 'seed' ( (lv_seed_7_0= ruleEInt ) ) otherlv_8= 'language' ( (lv_language_9_0= ruleLanguage ) ) (otherlv_10= 'badValueGeneratorNames' otherlv_11= '{' ( (lv_badValueGeneratorNames_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) ) )* otherlv_15= '}' )? otherlv_16= 'In the root object generate ' ( (lv_entityGenerators_17_0= ruleEntityGenerator2 ) ) (otherlv_18= ',' ( (lv_entityGenerators_19_0= ruleEntityGenerator2 ) ) )* ( (lv_fieldGenerators_20_0= ruleFieldGenerator2 ) ) (otherlv_21= ',' ( (lv_fieldGenerators_22_0= ruleFieldGenerator2 ) ) )* otherlv_23= '}' ) )
            // InternalDataSampleDSL.g:81:1: ( () otherlv_1= 'Sample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'for ' ( (lv_packageURI_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= 'seed' ( (lv_seed_7_0= ruleEInt ) ) otherlv_8= 'language' ( (lv_language_9_0= ruleLanguage ) ) (otherlv_10= 'badValueGeneratorNames' otherlv_11= '{' ( (lv_badValueGeneratorNames_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) ) )* otherlv_15= '}' )? otherlv_16= 'In the root object generate ' ( (lv_entityGenerators_17_0= ruleEntityGenerator2 ) ) (otherlv_18= ',' ( (lv_entityGenerators_19_0= ruleEntityGenerator2 ) ) )* ( (lv_fieldGenerators_20_0= ruleFieldGenerator2 ) ) (otherlv_21= ',' ( (lv_fieldGenerators_22_0= ruleFieldGenerator2 ) ) )* otherlv_23= '}' )
            {
            // InternalDataSampleDSL.g:81:1: ( () otherlv_1= 'Sample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'for ' ( (lv_packageURI_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= 'seed' ( (lv_seed_7_0= ruleEInt ) ) otherlv_8= 'language' ( (lv_language_9_0= ruleLanguage ) ) (otherlv_10= 'badValueGeneratorNames' otherlv_11= '{' ( (lv_badValueGeneratorNames_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) ) )* otherlv_15= '}' )? otherlv_16= 'In the root object generate ' ( (lv_entityGenerators_17_0= ruleEntityGenerator2 ) ) (otherlv_18= ',' ( (lv_entityGenerators_19_0= ruleEntityGenerator2 ) ) )* ( (lv_fieldGenerators_20_0= ruleFieldGenerator2 ) ) (otherlv_21= ',' ( (lv_fieldGenerators_22_0= ruleFieldGenerator2 ) ) )* otherlv_23= '}' )
            // InternalDataSampleDSL.g:81:2: () otherlv_1= 'Sample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'for ' ( (lv_packageURI_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= 'seed' ( (lv_seed_7_0= ruleEInt ) ) otherlv_8= 'language' ( (lv_language_9_0= ruleLanguage ) ) (otherlv_10= 'badValueGeneratorNames' otherlv_11= '{' ( (lv_badValueGeneratorNames_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) ) )* otherlv_15= '}' )? otherlv_16= 'In the root object generate ' ( (lv_entityGenerators_17_0= ruleEntityGenerator2 ) ) (otherlv_18= ',' ( (lv_entityGenerators_19_0= ruleEntityGenerator2 ) ) )* ( (lv_fieldGenerators_20_0= ruleFieldGenerator2 ) ) (otherlv_21= ',' ( (lv_fieldGenerators_22_0= ruleFieldGenerator2 ) ) )* otherlv_23= '}'
            {
            // InternalDataSampleDSL.g:81:2: ()
            // InternalDataSampleDSL.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDataSampleAccess().getDataSampleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getDataSampleAccess().getSampleKeyword_1());
                
            // InternalDataSampleDSL.g:91:1: ( (lv_name_2_0= ruleEString ) )
            // InternalDataSampleDSL.g:92:1: (lv_name_2_0= ruleEString )
            {
            // InternalDataSampleDSL.g:92:1: (lv_name_2_0= ruleEString )
            // InternalDataSampleDSL.g:93:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDataSampleAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"com.opcoach.datasample.xtext.DataSampleDSL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_3, grammarAccess.getDataSampleAccess().getForKeyword_3());
                
            // InternalDataSampleDSL.g:113:1: ( (lv_packageURI_4_0= ruleEString ) )
            // InternalDataSampleDSL.g:114:1: (lv_packageURI_4_0= ruleEString )
            {
            // InternalDataSampleDSL.g:114:1: (lv_packageURI_4_0= ruleEString )
            // InternalDataSampleDSL.g:115:3: lv_packageURI_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDataSampleAccess().getPackageURIEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_5);
            lv_packageURI_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
            	        }
                   		set(
                   			current, 
                   			"packageURI",
                    		lv_packageURI_4_0, 
                    		"com.opcoach.datasample.xtext.DataSampleDSL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_6); 

                	newLeafNode(otherlv_5, grammarAccess.getDataSampleAccess().getLeftCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_6, grammarAccess.getDataSampleAccess().getSeedKeyword_6());
                
            // InternalDataSampleDSL.g:139:1: ( (lv_seed_7_0= ruleEInt ) )
            // InternalDataSampleDSL.g:140:1: (lv_seed_7_0= ruleEInt )
            {
            // InternalDataSampleDSL.g:140:1: (lv_seed_7_0= ruleEInt )
            // InternalDataSampleDSL.g:141:3: lv_seed_7_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getDataSampleAccess().getSeedEIntParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_8);
            lv_seed_7_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
            	        }
                   		set(
                   			current, 
                   			"seed",
                    		lv_seed_7_0, 
                    		"com.opcoach.datasample.xtext.DataSampleDSL.EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_9); 

                	newLeafNode(otherlv_8, grammarAccess.getDataSampleAccess().getLanguageKeyword_8());
                
            // InternalDataSampleDSL.g:161:1: ( (lv_language_9_0= ruleLanguage ) )
            // InternalDataSampleDSL.g:162:1: (lv_language_9_0= ruleLanguage )
            {
            // InternalDataSampleDSL.g:162:1: (lv_language_9_0= ruleLanguage )
            // InternalDataSampleDSL.g:163:3: lv_language_9_0= ruleLanguage
            {
             
            	        newCompositeNode(grammarAccess.getDataSampleAccess().getLanguageLanguageEnumRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_10);
            lv_language_9_0=ruleLanguage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
            	        }
                   		set(
                   			current, 
                   			"language",
                    		lv_language_9_0, 
                    		"com.opcoach.datasample.xtext.DataSampleDSL.Language");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDataSampleDSL.g:179:2: (otherlv_10= 'badValueGeneratorNames' otherlv_11= '{' ( (lv_badValueGeneratorNames_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) ) )* otherlv_15= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDataSampleDSL.g:179:4: otherlv_10= 'badValueGeneratorNames' otherlv_11= '{' ( (lv_badValueGeneratorNames_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_10, grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesKeyword_10_0());
                        
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_11, grammarAccess.getDataSampleAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // InternalDataSampleDSL.g:187:1: ( (lv_badValueGeneratorNames_12_0= ruleEString ) )
                    // InternalDataSampleDSL.g:188:1: (lv_badValueGeneratorNames_12_0= ruleEString )
                    {
                    // InternalDataSampleDSL.g:188:1: (lv_badValueGeneratorNames_12_0= ruleEString )
                    // InternalDataSampleDSL.g:189:3: lv_badValueGeneratorNames_12_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesEStringParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_badValueGeneratorNames_12_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
                    	        }
                           		add(
                           			current, 
                           			"badValueGeneratorNames",
                            		lv_badValueGeneratorNames_12_0, 
                            		"com.opcoach.datasample.xtext.DataSampleDSL.EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDataSampleDSL.g:205:2: (otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==17) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDataSampleDSL.g:205:4: otherlv_13= ',' ( (lv_badValueGeneratorNames_14_0= ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_3); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getDataSampleAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // InternalDataSampleDSL.g:209:1: ( (lv_badValueGeneratorNames_14_0= ruleEString ) )
                    	    // InternalDataSampleDSL.g:210:1: (lv_badValueGeneratorNames_14_0= ruleEString )
                    	    {
                    	    // InternalDataSampleDSL.g:210:1: (lv_badValueGeneratorNames_14_0= ruleEString )
                    	    // InternalDataSampleDSL.g:211:3: lv_badValueGeneratorNames_14_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesEStringParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_11);
                    	    lv_badValueGeneratorNames_14_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"badValueGeneratorNames",
                    	            		lv_badValueGeneratorNames_14_0, 
                    	            		"com.opcoach.datasample.xtext.DataSampleDSL.EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_12); 

                        	newLeafNode(otherlv_15, grammarAccess.getDataSampleAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_16, grammarAccess.getDataSampleAccess().getInTheRootObjectGenerateKeyword_11());
                
            // InternalDataSampleDSL.g:235:1: ( (lv_entityGenerators_17_0= ruleEntityGenerator2 ) )
            // InternalDataSampleDSL.g:236:1: (lv_entityGenerators_17_0= ruleEntityGenerator2 )
            {
            // InternalDataSampleDSL.g:236:1: (lv_entityGenerators_17_0= ruleEntityGenerator2 )
            // InternalDataSampleDSL.g:237:3: lv_entityGenerators_17_0= ruleEntityGenerator2
            {
             
            	        newCompositeNode(grammarAccess.getDataSampleAccess().getEntityGeneratorsEntityGenerator2ParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_13);
            lv_entityGenerators_17_0=ruleEntityGenerator2();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
            	        }
                   		add(
                   			current, 
                   			"entityGenerators",
                    		lv_entityGenerators_17_0, 
                    		"com.opcoach.datasample.xtext.DataSampleDSL.EntityGenerator2");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDataSampleDSL.g:253:2: (otherlv_18= ',' ( (lv_entityGenerators_19_0= ruleEntityGenerator2 ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDataSampleDSL.g:253:4: otherlv_18= ',' ( (lv_entityGenerators_19_0= ruleEntityGenerator2 ) )
            	    {
            	    otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_7); 

            	        	newLeafNode(otherlv_18, grammarAccess.getDataSampleAccess().getCommaKeyword_13_0());
            	        
            	    // InternalDataSampleDSL.g:257:1: ( (lv_entityGenerators_19_0= ruleEntityGenerator2 ) )
            	    // InternalDataSampleDSL.g:258:1: (lv_entityGenerators_19_0= ruleEntityGenerator2 )
            	    {
            	    // InternalDataSampleDSL.g:258:1: (lv_entityGenerators_19_0= ruleEntityGenerator2 )
            	    // InternalDataSampleDSL.g:259:3: lv_entityGenerators_19_0= ruleEntityGenerator2
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataSampleAccess().getEntityGeneratorsEntityGenerator2ParserRuleCall_13_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    lv_entityGenerators_19_0=ruleEntityGenerator2();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entityGenerators",
            	            		lv_entityGenerators_19_0, 
            	            		"com.opcoach.datasample.xtext.DataSampleDSL.EntityGenerator2");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalDataSampleDSL.g:275:4: ( (lv_fieldGenerators_20_0= ruleFieldGenerator2 ) )
            // InternalDataSampleDSL.g:276:1: (lv_fieldGenerators_20_0= ruleFieldGenerator2 )
            {
            // InternalDataSampleDSL.g:276:1: (lv_fieldGenerators_20_0= ruleFieldGenerator2 )
            // InternalDataSampleDSL.g:277:3: lv_fieldGenerators_20_0= ruleFieldGenerator2
            {
             
            	        newCompositeNode(grammarAccess.getDataSampleAccess().getFieldGeneratorsFieldGenerator2ParserRuleCall_14_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_11);
            lv_fieldGenerators_20_0=ruleFieldGenerator2();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
            	        }
                   		add(
                   			current, 
                   			"fieldGenerators",
                    		lv_fieldGenerators_20_0, 
                    		"com.opcoach.datasample.xtext.DataSampleDSL.FieldGenerator2");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDataSampleDSL.g:293:2: (otherlv_21= ',' ( (lv_fieldGenerators_22_0= ruleFieldGenerator2 ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDataSampleDSL.g:293:4: otherlv_21= ',' ( (lv_fieldGenerators_22_0= ruleFieldGenerator2 ) )
            	    {
            	    otherlv_21=(Token)match(input,17,FollowSets000.FOLLOW_13); 

            	        	newLeafNode(otherlv_21, grammarAccess.getDataSampleAccess().getCommaKeyword_15_0());
            	        
            	    // InternalDataSampleDSL.g:297:1: ( (lv_fieldGenerators_22_0= ruleFieldGenerator2 ) )
            	    // InternalDataSampleDSL.g:298:1: (lv_fieldGenerators_22_0= ruleFieldGenerator2 )
            	    {
            	    // InternalDataSampleDSL.g:298:1: (lv_fieldGenerators_22_0= ruleFieldGenerator2 )
            	    // InternalDataSampleDSL.g:299:3: lv_fieldGenerators_22_0= ruleFieldGenerator2
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataSampleAccess().getFieldGeneratorsFieldGenerator2ParserRuleCall_15_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    lv_fieldGenerators_22_0=ruleFieldGenerator2();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fieldGenerators",
            	            		lv_fieldGenerators_22_0, 
            	            		"com.opcoach.datasample.xtext.DataSampleDSL.FieldGenerator2");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_23=(Token)match(input,18,FollowSets000.FOLLOW_2); 

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


    // $ANTLR start "entryRuleEString"
    // InternalDataSampleDSL.g:327:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDataSampleDSL.g:328:2: (iv_ruleEString= ruleEString EOF )
            // InternalDataSampleDSL.g:329:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDataSampleDSL.g:336:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // InternalDataSampleDSL.g:339:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDataSampleDSL.g:340:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDataSampleDSL.g:340:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDataSampleDSL.g:340:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalDataSampleDSL.g:348:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

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
    // InternalDataSampleDSL.g:363:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDataSampleDSL.g:364:2: (iv_ruleEInt= ruleEInt EOF )
            // InternalDataSampleDSL.g:365:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDataSampleDSL.g:372:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalDataSampleDSL.g:375:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDataSampleDSL.g:376:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDataSampleDSL.g:376:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDataSampleDSL.g:376:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDataSampleDSL.g:376:2: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDataSampleDSL.g:377:2: kw= '-'
                    {
                    kw=(Token)match(input,20,FollowSets000.FOLLOW_14); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

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


    // $ANTLR start "entryRuleEntityGenerator2"
    // InternalDataSampleDSL.g:397:1: entryRuleEntityGenerator2 returns [EObject current=null] : iv_ruleEntityGenerator2= ruleEntityGenerator2 EOF ;
    public final EObject entryRuleEntityGenerator2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityGenerator2 = null;


        try {
            // InternalDataSampleDSL.g:398:2: (iv_ruleEntityGenerator2= ruleEntityGenerator2 EOF )
            // InternalDataSampleDSL.g:399:2: iv_ruleEntityGenerator2= ruleEntityGenerator2 EOF
            {
             newCompositeNode(grammarAccess.getEntityGenerator2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEntityGenerator2=ruleEntityGenerator2();

            state._fsp--;

             current =iv_ruleEntityGenerator2; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDataSampleDSL.g:406:1: ruleEntityGenerator2 returns [EObject current=null] : ( () ( (lv_number_1_0= ruleEInt ) ) ( (lv_entityName_2_0= ruleEString ) ) ) ;
    public final EObject ruleEntityGenerator2() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_number_1_0 = null;

        AntlrDatatypeRuleToken lv_entityName_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDataSampleDSL.g:409:28: ( ( () ( (lv_number_1_0= ruleEInt ) ) ( (lv_entityName_2_0= ruleEString ) ) ) )
            // InternalDataSampleDSL.g:410:1: ( () ( (lv_number_1_0= ruleEInt ) ) ( (lv_entityName_2_0= ruleEString ) ) )
            {
            // InternalDataSampleDSL.g:410:1: ( () ( (lv_number_1_0= ruleEInt ) ) ( (lv_entityName_2_0= ruleEString ) ) )
            // InternalDataSampleDSL.g:410:2: () ( (lv_number_1_0= ruleEInt ) ) ( (lv_entityName_2_0= ruleEString ) )
            {
            // InternalDataSampleDSL.g:410:2: ()
            // InternalDataSampleDSL.g:411:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntityGenerator2Access().getEntityGeneratorAction_0(),
                        current);
                

            }

            // InternalDataSampleDSL.g:416:2: ( (lv_number_1_0= ruleEInt ) )
            // InternalDataSampleDSL.g:417:1: (lv_number_1_0= ruleEInt )
            {
            // InternalDataSampleDSL.g:417:1: (lv_number_1_0= ruleEInt )
            // InternalDataSampleDSL.g:418:3: lv_number_1_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getEntityGenerator2Access().getNumberEIntParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_3);
            lv_number_1_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityGenerator2Rule());
            	        }
                   		set(
                   			current, 
                   			"number",
                    		lv_number_1_0, 
                    		"com.opcoach.datasample.xtext.DataSampleDSL.EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDataSampleDSL.g:434:2: ( (lv_entityName_2_0= ruleEString ) )
            // InternalDataSampleDSL.g:435:1: (lv_entityName_2_0= ruleEString )
            {
            // InternalDataSampleDSL.g:435:1: (lv_entityName_2_0= ruleEString )
            // InternalDataSampleDSL.g:436:3: lv_entityName_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEntityGenerator2Access().getEntityNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_entityName_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityGenerator2Rule());
            	        }
                   		set(
                   			current, 
                   			"entityName",
                    		lv_entityName_2_0, 
                    		"com.opcoach.datasample.xtext.DataSampleDSL.EString");
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
    // InternalDataSampleDSL.g:462:1: entryRuleFieldGenerator2 returns [EObject current=null] : iv_ruleFieldGenerator2= ruleFieldGenerator2 EOF ;
    public final EObject entryRuleFieldGenerator2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldGenerator2 = null;


        try {
            // InternalDataSampleDSL.g:463:2: (iv_ruleFieldGenerator2= ruleFieldGenerator2 EOF )
            // InternalDataSampleDSL.g:464:2: iv_ruleFieldGenerator2= ruleFieldGenerator2 EOF
            {
             newCompositeNode(grammarAccess.getFieldGenerator2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFieldGenerator2=ruleFieldGenerator2();

            state._fsp--;

             current =iv_ruleFieldGenerator2; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDataSampleDSL.g:471:1: ruleFieldGenerator2 returns [EObject current=null] : (otherlv_0= 'forField' ( (lv_entityName_1_0= ruleEString ) ) otherlv_2= '.' ( (lv_fieldName_3_0= ruleEString ) ) otherlv_4= 'use' ( (lv_generatorName_5_0= ruleEString ) ) (otherlv_6= 'with errorRate=' ( (lv_errorRate_7_0= ruleEInt ) ) otherlv_8= '% generated with ' ( (lv_errorGeneratorName_9_0= ruleEString ) ) )? ) ;
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
            // InternalDataSampleDSL.g:474:28: ( (otherlv_0= 'forField' ( (lv_entityName_1_0= ruleEString ) ) otherlv_2= '.' ( (lv_fieldName_3_0= ruleEString ) ) otherlv_4= 'use' ( (lv_generatorName_5_0= ruleEString ) ) (otherlv_6= 'with errorRate=' ( (lv_errorRate_7_0= ruleEInt ) ) otherlv_8= '% generated with ' ( (lv_errorGeneratorName_9_0= ruleEString ) ) )? ) )
            // InternalDataSampleDSL.g:475:1: (otherlv_0= 'forField' ( (lv_entityName_1_0= ruleEString ) ) otherlv_2= '.' ( (lv_fieldName_3_0= ruleEString ) ) otherlv_4= 'use' ( (lv_generatorName_5_0= ruleEString ) ) (otherlv_6= 'with errorRate=' ( (lv_errorRate_7_0= ruleEInt ) ) otherlv_8= '% generated with ' ( (lv_errorGeneratorName_9_0= ruleEString ) ) )? )
            {
            // InternalDataSampleDSL.g:475:1: (otherlv_0= 'forField' ( (lv_entityName_1_0= ruleEString ) ) otherlv_2= '.' ( (lv_fieldName_3_0= ruleEString ) ) otherlv_4= 'use' ( (lv_generatorName_5_0= ruleEString ) ) (otherlv_6= 'with errorRate=' ( (lv_errorRate_7_0= ruleEInt ) ) otherlv_8= '% generated with ' ( (lv_errorGeneratorName_9_0= ruleEString ) ) )? )
            // InternalDataSampleDSL.g:475:3: otherlv_0= 'forField' ( (lv_entityName_1_0= ruleEString ) ) otherlv_2= '.' ( (lv_fieldName_3_0= ruleEString ) ) otherlv_4= 'use' ( (lv_generatorName_5_0= ruleEString ) ) (otherlv_6= 'with errorRate=' ( (lv_errorRate_7_0= ruleEInt ) ) otherlv_8= '% generated with ' ( (lv_errorGeneratorName_9_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldGenerator2Access().getForFieldKeyword_0());
                
            // InternalDataSampleDSL.g:479:1: ( (lv_entityName_1_0= ruleEString ) )
            // InternalDataSampleDSL.g:480:1: (lv_entityName_1_0= ruleEString )
            {
            // InternalDataSampleDSL.g:480:1: (lv_entityName_1_0= ruleEString )
            // InternalDataSampleDSL.g:481:3: lv_entityName_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFieldGenerator2Access().getEntityNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_15);
            lv_entityName_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldGenerator2Rule());
            	        }
                   		set(
                   			current, 
                   			"entityName",
                    		lv_entityName_1_0, 
                    		"com.opcoach.datasample.xtext.DataSampleDSL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getFieldGenerator2Access().getFullStopKeyword_2());
                
            // InternalDataSampleDSL.g:501:1: ( (lv_fieldName_3_0= ruleEString ) )
            // InternalDataSampleDSL.g:502:1: (lv_fieldName_3_0= ruleEString )
            {
            // InternalDataSampleDSL.g:502:1: (lv_fieldName_3_0= ruleEString )
            // InternalDataSampleDSL.g:503:3: lv_fieldName_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFieldGenerator2Access().getFieldNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_16);
            lv_fieldName_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldGenerator2Rule());
            	        }
                   		set(
                   			current, 
                   			"fieldName",
                    		lv_fieldName_3_0, 
                    		"com.opcoach.datasample.xtext.DataSampleDSL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_4, grammarAccess.getFieldGenerator2Access().getUseKeyword_4());
                
            // InternalDataSampleDSL.g:523:1: ( (lv_generatorName_5_0= ruleEString ) )
            // InternalDataSampleDSL.g:524:1: (lv_generatorName_5_0= ruleEString )
            {
            // InternalDataSampleDSL.g:524:1: (lv_generatorName_5_0= ruleEString )
            // InternalDataSampleDSL.g:525:3: lv_generatorName_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFieldGenerator2Access().getGeneratorNameEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_17);
            lv_generatorName_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldGenerator2Rule());
            	        }
                   		set(
                   			current, 
                   			"generatorName",
                    		lv_generatorName_5_0, 
                    		"com.opcoach.datasample.xtext.DataSampleDSL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDataSampleDSL.g:541:2: (otherlv_6= 'with errorRate=' ( (lv_errorRate_7_0= ruleEInt ) ) otherlv_8= '% generated with ' ( (lv_errorGeneratorName_9_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDataSampleDSL.g:541:4: otherlv_6= 'with errorRate=' ( (lv_errorRate_7_0= ruleEInt ) ) otherlv_8= '% generated with ' ( (lv_errorGeneratorName_9_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_6, grammarAccess.getFieldGenerator2Access().getWithErrorRateKeyword_6_0());
                        
                    // InternalDataSampleDSL.g:545:1: ( (lv_errorRate_7_0= ruleEInt ) )
                    // InternalDataSampleDSL.g:546:1: (lv_errorRate_7_0= ruleEInt )
                    {
                    // InternalDataSampleDSL.g:546:1: (lv_errorRate_7_0= ruleEInt )
                    // InternalDataSampleDSL.g:547:3: lv_errorRate_7_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldGenerator2Access().getErrorRateEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_18);
                    lv_errorRate_7_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldGenerator2Rule());
                    	        }
                           		set(
                           			current, 
                           			"errorRate",
                            		lv_errorRate_7_0, 
                            		"com.opcoach.datasample.xtext.DataSampleDSL.EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_8, grammarAccess.getFieldGenerator2Access().getGeneratedWithKeyword_6_2());
                        
                    // InternalDataSampleDSL.g:567:1: ( (lv_errorGeneratorName_9_0= ruleEString ) )
                    // InternalDataSampleDSL.g:568:1: (lv_errorGeneratorName_9_0= ruleEString )
                    {
                    // InternalDataSampleDSL.g:568:1: (lv_errorGeneratorName_9_0= ruleEString )
                    // InternalDataSampleDSL.g:569:3: lv_errorGeneratorName_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldGenerator2Access().getErrorGeneratorNameEStringParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_errorGeneratorName_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldGenerator2Rule());
                    	        }
                           		set(
                           			current, 
                           			"errorGeneratorName",
                            		lv_errorGeneratorName_9_0, 
                            		"com.opcoach.datasample.xtext.DataSampleDSL.EString");
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


    // $ANTLR start "ruleLanguage"
    // InternalDataSampleDSL.g:595:1: ruleLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) ) ;
    public final Enumerator ruleLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // InternalDataSampleDSL.g:597:28: ( ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) ) )
            // InternalDataSampleDSL.g:598:1: ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) )
            {
            // InternalDataSampleDSL.g:598:1: ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt8=1;
                }
                break;
            case 27:
                {
                alt8=2;
                }
                break;
            case 28:
                {
                alt8=3;
                }
                break;
            case 29:
                {
                alt8=4;
                }
                break;
            case 30:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDataSampleDSL.g:598:2: (enumLiteral_0= 'fr' )
                    {
                    // InternalDataSampleDSL.g:598:2: (enumLiteral_0= 'fr' )
                    // InternalDataSampleDSL.g:598:4: enumLiteral_0= 'fr'
                    {
                    enumLiteral_0=(Token)match(input,26,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalDataSampleDSL.g:604:6: (enumLiteral_1= 'en' )
                    {
                    // InternalDataSampleDSL.g:604:6: (enumLiteral_1= 'en' )
                    // InternalDataSampleDSL.g:604:8: enumLiteral_1= 'en'
                    {
                    enumLiteral_1=(Token)match(input,27,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalDataSampleDSL.g:610:6: (enumLiteral_2= 'de' )
                    {
                    // InternalDataSampleDSL.g:610:6: (enumLiteral_2= 'de' )
                    // InternalDataSampleDSL.g:610:8: enumLiteral_2= 'de'
                    {
                    enumLiteral_2=(Token)match(input,28,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalDataSampleDSL.g:616:6: (enumLiteral_3= 'es' )
                    {
                    // InternalDataSampleDSL.g:616:6: (enumLiteral_3= 'es' )
                    // InternalDataSampleDSL.g:616:8: enumLiteral_3= 'es'
                    {
                    enumLiteral_3=(Token)match(input,29,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalDataSampleDSL.g:622:6: (enumLiteral_4= 'it' )
                    {
                    // InternalDataSampleDSL.g:622:6: (enumLiteral_4= 'it' )
                    // InternalDataSampleDSL.g:622:8: enumLiteral_4= 'it'
                    {
                    enumLiteral_4=(Token)match(input,30,FollowSets000.FOLLOW_2); 

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
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000007C000000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    }


}