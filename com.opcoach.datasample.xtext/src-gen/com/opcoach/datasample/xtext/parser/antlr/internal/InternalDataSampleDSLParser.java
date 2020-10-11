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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Sample'", "'for'", "'generateRootObject'", "'seed'", "'language'", "'fileExtension'", "'rootGenerator'", "'-'", "'generate'", "'instancesOf'", "'{'", "'}'", "'forTheField'", "'use'", "'cardinality'", "'('", "','", "')'", "'withErrorRate='", "'generatedWith'", "'forTheComposition'", "'forTheAbstractComposition'", "'forTheAssociation'", "'='", "'fr'", "'en'", "'de'", "'es'", "'it'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    // InternalDataSampleDSL.g:77:1: ruleDataSample returns [EObject current=null] : ( () otherlv_1= 'Sample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'for' ( (lv_packageURI_4_0= ruleEString ) ) otherlv_5= 'generateRootObject' ( (lv_rootEntityName_6_0= ruleEString ) ) (otherlv_7= 'seed' ( (lv_seed_8_0= ruleEInt ) ) )? (otherlv_9= 'language' ( (lv_language_10_0= ruleLanguage ) ) )? (otherlv_11= 'fileExtension' ( (lv_fileExtension_12_0= ruleEString ) ) )? otherlv_13= 'rootGenerator' ( (lv_rootGenerator_14_0= ruleEntityGenerator ) ) ) ;
    public final EObject ruleDataSample() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_packageURI_4_0 = null;

        AntlrDatatypeRuleToken lv_rootEntityName_6_0 = null;

        AntlrDatatypeRuleToken lv_seed_8_0 = null;

        Enumerator lv_language_10_0 = null;

        AntlrDatatypeRuleToken lv_fileExtension_12_0 = null;

        EObject lv_rootGenerator_14_0 = null;


         enterRule(); 
            
        try {
            // InternalDataSampleDSL.g:80:28: ( ( () otherlv_1= 'Sample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'for' ( (lv_packageURI_4_0= ruleEString ) ) otherlv_5= 'generateRootObject' ( (lv_rootEntityName_6_0= ruleEString ) ) (otherlv_7= 'seed' ( (lv_seed_8_0= ruleEInt ) ) )? (otherlv_9= 'language' ( (lv_language_10_0= ruleLanguage ) ) )? (otherlv_11= 'fileExtension' ( (lv_fileExtension_12_0= ruleEString ) ) )? otherlv_13= 'rootGenerator' ( (lv_rootGenerator_14_0= ruleEntityGenerator ) ) ) )
            // InternalDataSampleDSL.g:81:1: ( () otherlv_1= 'Sample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'for' ( (lv_packageURI_4_0= ruleEString ) ) otherlv_5= 'generateRootObject' ( (lv_rootEntityName_6_0= ruleEString ) ) (otherlv_7= 'seed' ( (lv_seed_8_0= ruleEInt ) ) )? (otherlv_9= 'language' ( (lv_language_10_0= ruleLanguage ) ) )? (otherlv_11= 'fileExtension' ( (lv_fileExtension_12_0= ruleEString ) ) )? otherlv_13= 'rootGenerator' ( (lv_rootGenerator_14_0= ruleEntityGenerator ) ) )
            {
            // InternalDataSampleDSL.g:81:1: ( () otherlv_1= 'Sample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'for' ( (lv_packageURI_4_0= ruleEString ) ) otherlv_5= 'generateRootObject' ( (lv_rootEntityName_6_0= ruleEString ) ) (otherlv_7= 'seed' ( (lv_seed_8_0= ruleEInt ) ) )? (otherlv_9= 'language' ( (lv_language_10_0= ruleLanguage ) ) )? (otherlv_11= 'fileExtension' ( (lv_fileExtension_12_0= ruleEString ) ) )? otherlv_13= 'rootGenerator' ( (lv_rootGenerator_14_0= ruleEntityGenerator ) ) )
            // InternalDataSampleDSL.g:81:2: () otherlv_1= 'Sample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'for' ( (lv_packageURI_4_0= ruleEString ) ) otherlv_5= 'generateRootObject' ( (lv_rootEntityName_6_0= ruleEString ) ) (otherlv_7= 'seed' ( (lv_seed_8_0= ruleEInt ) ) )? (otherlv_9= 'language' ( (lv_language_10_0= ruleLanguage ) ) )? (otherlv_11= 'fileExtension' ( (lv_fileExtension_12_0= ruleEString ) ) )? otherlv_13= 'rootGenerator' ( (lv_rootGenerator_14_0= ruleEntityGenerator ) )
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

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_5, grammarAccess.getDataSampleAccess().getGenerateRootObjectKeyword_5());
                
            // InternalDataSampleDSL.g:135:1: ( (lv_rootEntityName_6_0= ruleEString ) )
            // InternalDataSampleDSL.g:136:1: (lv_rootEntityName_6_0= ruleEString )
            {
            // InternalDataSampleDSL.g:136:1: (lv_rootEntityName_6_0= ruleEString )
            // InternalDataSampleDSL.g:137:3: lv_rootEntityName_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDataSampleAccess().getRootEntityNameEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_6);
            lv_rootEntityName_6_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
            	        }
                   		set(
                   			current, 
                   			"rootEntityName",
                    		lv_rootEntityName_6_0, 
                    		"com.opcoach.datasample.xtext.DataSampleDSL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDataSampleDSL.g:153:2: (otherlv_7= 'seed' ( (lv_seed_8_0= ruleEInt ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDataSampleDSL.g:153:4: otherlv_7= 'seed' ( (lv_seed_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_7, grammarAccess.getDataSampleAccess().getSeedKeyword_7_0());
                        
                    // InternalDataSampleDSL.g:157:1: ( (lv_seed_8_0= ruleEInt ) )
                    // InternalDataSampleDSL.g:158:1: (lv_seed_8_0= ruleEInt )
                    {
                    // InternalDataSampleDSL.g:158:1: (lv_seed_8_0= ruleEInt )
                    // InternalDataSampleDSL.g:159:3: lv_seed_8_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataSampleAccess().getSeedEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_seed_8_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
                    	        }
                           		set(
                           			current, 
                           			"seed",
                            		lv_seed_8_0, 
                            		"com.opcoach.datasample.xtext.DataSampleDSL.EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDataSampleDSL.g:175:4: (otherlv_9= 'language' ( (lv_language_10_0= ruleLanguage ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDataSampleDSL.g:175:6: otherlv_9= 'language' ( (lv_language_10_0= ruleLanguage ) )
                    {
                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_9); 

                        	newLeafNode(otherlv_9, grammarAccess.getDataSampleAccess().getLanguageKeyword_8_0());
                        
                    // InternalDataSampleDSL.g:179:1: ( (lv_language_10_0= ruleLanguage ) )
                    // InternalDataSampleDSL.g:180:1: (lv_language_10_0= ruleLanguage )
                    {
                    // InternalDataSampleDSL.g:180:1: (lv_language_10_0= ruleLanguage )
                    // InternalDataSampleDSL.g:181:3: lv_language_10_0= ruleLanguage
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataSampleAccess().getLanguageLanguageEnumRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_10);
                    lv_language_10_0=ruleLanguage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
                    	        }
                           		set(
                           			current, 
                           			"language",
                            		lv_language_10_0, 
                            		"com.opcoach.datasample.xtext.DataSampleDSL.Language");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDataSampleDSL.g:197:4: (otherlv_11= 'fileExtension' ( (lv_fileExtension_12_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDataSampleDSL.g:197:6: otherlv_11= 'fileExtension' ( (lv_fileExtension_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_11, grammarAccess.getDataSampleAccess().getFileExtensionKeyword_9_0());
                        
                    // InternalDataSampleDSL.g:201:1: ( (lv_fileExtension_12_0= ruleEString ) )
                    // InternalDataSampleDSL.g:202:1: (lv_fileExtension_12_0= ruleEString )
                    {
                    // InternalDataSampleDSL.g:202:1: (lv_fileExtension_12_0= ruleEString )
                    // InternalDataSampleDSL.g:203:3: lv_fileExtension_12_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataSampleAccess().getFileExtensionEStringParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_fileExtension_12_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
                    	        }
                           		set(
                           			current, 
                           			"fileExtension",
                            		lv_fileExtension_12_0, 
                            		"com.opcoach.datasample.xtext.DataSampleDSL.EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_12); 

                	newLeafNode(otherlv_13, grammarAccess.getDataSampleAccess().getRootGeneratorKeyword_10());
                
            // InternalDataSampleDSL.g:223:1: ( (lv_rootGenerator_14_0= ruleEntityGenerator ) )
            // InternalDataSampleDSL.g:224:1: (lv_rootGenerator_14_0= ruleEntityGenerator )
            {
            // InternalDataSampleDSL.g:224:1: (lv_rootGenerator_14_0= ruleEntityGenerator )
            // InternalDataSampleDSL.g:225:3: lv_rootGenerator_14_0= ruleEntityGenerator
            {
             
            	        newCompositeNode(grammarAccess.getDataSampleAccess().getRootGeneratorEntityGeneratorParserRuleCall_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_rootGenerator_14_0=ruleEntityGenerator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
            	        }
                   		set(
                   			current, 
                   			"rootGenerator",
                    		lv_rootGenerator_14_0, 
                    		"com.opcoach.datasample.xtext.DataSampleDSL.EntityGenerator");
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
    // $ANTLR end "ruleDataSample"


    // $ANTLR start "entryRuleEString"
    // InternalDataSampleDSL.g:249:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDataSampleDSL.g:250:2: (iv_ruleEString= ruleEString EOF )
            // InternalDataSampleDSL.g:251:2: iv_ruleEString= ruleEString EOF
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
    // InternalDataSampleDSL.g:258:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // InternalDataSampleDSL.g:261:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDataSampleDSL.g:262:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDataSampleDSL.g:262:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDataSampleDSL.g:262:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalDataSampleDSL.g:270:10: this_ID_1= RULE_ID
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
    // InternalDataSampleDSL.g:285:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDataSampleDSL.g:286:2: (iv_ruleEInt= ruleEInt EOF )
            // InternalDataSampleDSL.g:287:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalDataSampleDSL.g:294:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalDataSampleDSL.g:297:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDataSampleDSL.g:298:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDataSampleDSL.g:298:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDataSampleDSL.g:298:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDataSampleDSL.g:298:2: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDataSampleDSL.g:299:2: kw= '-'
                    {
                    kw=(Token)match(input,18,FollowSets000.FOLLOW_13); 

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


    // $ANTLR start "entryRuleEntityGenerator"
    // InternalDataSampleDSL.g:319:1: entryRuleEntityGenerator returns [EObject current=null] : iv_ruleEntityGenerator= ruleEntityGenerator EOF ;
    public final EObject entryRuleEntityGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityGenerator = null;


        try {
            // InternalDataSampleDSL.g:320:2: (iv_ruleEntityGenerator= ruleEntityGenerator EOF )
            // InternalDataSampleDSL.g:321:2: iv_ruleEntityGenerator= ruleEntityGenerator EOF
            {
             newCompositeNode(grammarAccess.getEntityGeneratorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEntityGenerator=ruleEntityGenerator();

            state._fsp--;

             current =iv_ruleEntityGenerator; 
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
    // $ANTLR end "entryRuleEntityGenerator"


    // $ANTLR start "ruleEntityGenerator"
    // InternalDataSampleDSL.g:328:1: ruleEntityGenerator returns [EObject current=null] : ( () otherlv_1= 'generate' ( ( (lv_number_2_0= ruleEInt ) ) otherlv_3= 'instancesOf' )? ( (lv_entityName_4_0= ruleEString ) ) otherlv_5= '{' ( (lv_fieldGenerators_6_0= ruleFieldGenerator ) )* ( (lv_childGenerators_7_0= ruleChild ) )* ( (lv_associationGenerators_8_0= ruleAssociationGenerator ) )* otherlv_9= '}' ) ;
    public final EObject ruleEntityGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_number_2_0 = null;

        AntlrDatatypeRuleToken lv_entityName_4_0 = null;

        EObject lv_fieldGenerators_6_0 = null;

        EObject lv_childGenerators_7_0 = null;

        EObject lv_associationGenerators_8_0 = null;


         enterRule(); 
            
        try {
            // InternalDataSampleDSL.g:331:28: ( ( () otherlv_1= 'generate' ( ( (lv_number_2_0= ruleEInt ) ) otherlv_3= 'instancesOf' )? ( (lv_entityName_4_0= ruleEString ) ) otherlv_5= '{' ( (lv_fieldGenerators_6_0= ruleFieldGenerator ) )* ( (lv_childGenerators_7_0= ruleChild ) )* ( (lv_associationGenerators_8_0= ruleAssociationGenerator ) )* otherlv_9= '}' ) )
            // InternalDataSampleDSL.g:332:1: ( () otherlv_1= 'generate' ( ( (lv_number_2_0= ruleEInt ) ) otherlv_3= 'instancesOf' )? ( (lv_entityName_4_0= ruleEString ) ) otherlv_5= '{' ( (lv_fieldGenerators_6_0= ruleFieldGenerator ) )* ( (lv_childGenerators_7_0= ruleChild ) )* ( (lv_associationGenerators_8_0= ruleAssociationGenerator ) )* otherlv_9= '}' )
            {
            // InternalDataSampleDSL.g:332:1: ( () otherlv_1= 'generate' ( ( (lv_number_2_0= ruleEInt ) ) otherlv_3= 'instancesOf' )? ( (lv_entityName_4_0= ruleEString ) ) otherlv_5= '{' ( (lv_fieldGenerators_6_0= ruleFieldGenerator ) )* ( (lv_childGenerators_7_0= ruleChild ) )* ( (lv_associationGenerators_8_0= ruleAssociationGenerator ) )* otherlv_9= '}' )
            // InternalDataSampleDSL.g:332:2: () otherlv_1= 'generate' ( ( (lv_number_2_0= ruleEInt ) ) otherlv_3= 'instancesOf' )? ( (lv_entityName_4_0= ruleEString ) ) otherlv_5= '{' ( (lv_fieldGenerators_6_0= ruleFieldGenerator ) )* ( (lv_childGenerators_7_0= ruleChild ) )* ( (lv_associationGenerators_8_0= ruleAssociationGenerator ) )* otherlv_9= '}'
            {
            // InternalDataSampleDSL.g:332:2: ()
            // InternalDataSampleDSL.g:333:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntityGeneratorAccess().getEntityGeneratorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_14); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityGeneratorAccess().getGenerateKeyword_1());
                
            // InternalDataSampleDSL.g:342:1: ( ( (lv_number_2_0= ruleEInt ) ) otherlv_3= 'instancesOf' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT||LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDataSampleDSL.g:342:2: ( (lv_number_2_0= ruleEInt ) ) otherlv_3= 'instancesOf'
                    {
                    // InternalDataSampleDSL.g:342:2: ( (lv_number_2_0= ruleEInt ) )
                    // InternalDataSampleDSL.g:343:1: (lv_number_2_0= ruleEInt )
                    {
                    // InternalDataSampleDSL.g:343:1: (lv_number_2_0= ruleEInt )
                    // InternalDataSampleDSL.g:344:3: lv_number_2_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityGeneratorAccess().getNumberEIntParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_number_2_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"number",
                            		lv_number_2_0, 
                            		"com.opcoach.datasample.xtext.DataSampleDSL.EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityGeneratorAccess().getInstancesOfKeyword_2_1());
                        

                    }
                    break;

            }

            // InternalDataSampleDSL.g:364:3: ( (lv_entityName_4_0= ruleEString ) )
            // InternalDataSampleDSL.g:365:1: (lv_entityName_4_0= ruleEString )
            {
            // InternalDataSampleDSL.g:365:1: (lv_entityName_4_0= ruleEString )
            // InternalDataSampleDSL.g:366:3: lv_entityName_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEntityGeneratorAccess().getEntityNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_16);
            lv_entityName_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityGeneratorRule());
            	        }
                   		set(
                   			current, 
                   			"entityName",
                    		lv_entityName_4_0, 
                    		"com.opcoach.datasample.xtext.DataSampleDSL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_17); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityGeneratorAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalDataSampleDSL.g:386:1: ( (lv_fieldGenerators_6_0= ruleFieldGenerator ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDataSampleDSL.g:387:1: (lv_fieldGenerators_6_0= ruleFieldGenerator )
            	    {
            	    // InternalDataSampleDSL.g:387:1: (lv_fieldGenerators_6_0= ruleFieldGenerator )
            	    // InternalDataSampleDSL.g:388:3: lv_fieldGenerators_6_0= ruleFieldGenerator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityGeneratorAccess().getFieldGeneratorsFieldGeneratorParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    lv_fieldGenerators_6_0=ruleFieldGenerator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityGeneratorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fieldGenerators",
            	            		lv_fieldGenerators_6_0, 
            	            		"com.opcoach.datasample.xtext.DataSampleDSL.FieldGenerator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalDataSampleDSL.g:404:3: ( (lv_childGenerators_7_0= ruleChild ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=31 && LA8_0<=32)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDataSampleDSL.g:405:1: (lv_childGenerators_7_0= ruleChild )
            	    {
            	    // InternalDataSampleDSL.g:405:1: (lv_childGenerators_7_0= ruleChild )
            	    // InternalDataSampleDSL.g:406:3: lv_childGenerators_7_0= ruleChild
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityGeneratorAccess().getChildGeneratorsChildParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_childGenerators_7_0=ruleChild();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityGeneratorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"childGenerators",
            	            		lv_childGenerators_7_0, 
            	            		"com.opcoach.datasample.xtext.DataSampleDSL.Child");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalDataSampleDSL.g:422:3: ( (lv_associationGenerators_8_0= ruleAssociationGenerator ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==33) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDataSampleDSL.g:423:1: (lv_associationGenerators_8_0= ruleAssociationGenerator )
            	    {
            	    // InternalDataSampleDSL.g:423:1: (lv_associationGenerators_8_0= ruleAssociationGenerator )
            	    // InternalDataSampleDSL.g:424:3: lv_associationGenerators_8_0= ruleAssociationGenerator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityGeneratorAccess().getAssociationGeneratorsAssociationGeneratorParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    lv_associationGenerators_8_0=ruleAssociationGenerator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityGeneratorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"associationGenerators",
            	            		lv_associationGenerators_8_0, 
            	            		"com.opcoach.datasample.xtext.DataSampleDSL.AssociationGenerator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_9, grammarAccess.getEntityGeneratorAccess().getRightCurlyBracketKeyword_8());
                

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
    // InternalDataSampleDSL.g:452:1: entryRuleFieldGenerator returns [EObject current=null] : iv_ruleFieldGenerator= ruleFieldGenerator EOF ;
    public final EObject entryRuleFieldGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldGenerator = null;


        try {
            // InternalDataSampleDSL.g:453:2: (iv_ruleFieldGenerator= ruleFieldGenerator EOF )
            // InternalDataSampleDSL.g:454:2: iv_ruleFieldGenerator= ruleFieldGenerator EOF
            {
             newCompositeNode(grammarAccess.getFieldGeneratorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFieldGenerator=ruleFieldGenerator();

            state._fsp--;

             current =iv_ruleFieldGenerator; 
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
    // $ANTLR end "entryRuleFieldGenerator"


    // $ANTLR start "ruleFieldGenerator"
    // InternalDataSampleDSL.g:461:1: ruleFieldGenerator returns [EObject current=null] : ( () otherlv_1= 'forTheField' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )? ) ;
    public final EObject ruleFieldGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_fieldName_2_0 = null;

        AntlrDatatypeRuleToken lv_generatorName_4_0 = null;

        AntlrDatatypeRuleToken lv_number_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_parameters_10_0 = null;

        AntlrDatatypeRuleToken lv_errorRate_13_0 = null;

        AntlrDatatypeRuleToken lv_errorGeneratorName_15_0 = null;


         enterRule(); 
            
        try {
            // InternalDataSampleDSL.g:464:28: ( ( () otherlv_1= 'forTheField' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )? ) )
            // InternalDataSampleDSL.g:465:1: ( () otherlv_1= 'forTheField' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )? )
            {
            // InternalDataSampleDSL.g:465:1: ( () otherlv_1= 'forTheField' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )? )
            // InternalDataSampleDSL.g:465:2: () otherlv_1= 'forTheField' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )?
            {
            // InternalDataSampleDSL.g:465:2: ()
            // InternalDataSampleDSL.g:466:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFieldGeneratorAccess().getFieldGeneratorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldGeneratorAccess().getForTheFieldKeyword_1());
                
            // InternalDataSampleDSL.g:475:1: ( (lv_fieldName_2_0= ruleEString ) )
            // InternalDataSampleDSL.g:476:1: (lv_fieldName_2_0= ruleEString )
            {
            // InternalDataSampleDSL.g:476:1: (lv_fieldName_2_0= ruleEString )
            // InternalDataSampleDSL.g:477:3: lv_fieldName_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_20);
            lv_fieldName_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldGeneratorRule());
            	        }
                   		set(
                   			current, 
                   			"fieldName",
                    		lv_fieldName_2_0, 
                    		"com.opcoach.datasample.xtext.DataSampleDSL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_3, grammarAccess.getFieldGeneratorAccess().getUseKeyword_3());
                
            // InternalDataSampleDSL.g:497:1: ( (lv_generatorName_4_0= ruleEString ) )
            // InternalDataSampleDSL.g:498:1: (lv_generatorName_4_0= ruleEString )
            {
            // InternalDataSampleDSL.g:498:1: (lv_generatorName_4_0= ruleEString )
            // InternalDataSampleDSL.g:499:3: lv_generatorName_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getGeneratorNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_21);
            lv_generatorName_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldGeneratorRule());
            	        }
                   		set(
                   			current, 
                   			"generatorName",
                    		lv_generatorName_4_0, 
                    		"com.opcoach.datasample.xtext.DataSampleDSL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDataSampleDSL.g:515:2: (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDataSampleDSL.g:515:4: otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_5, grammarAccess.getFieldGeneratorAccess().getCardinalityKeyword_5_0());
                        
                    // InternalDataSampleDSL.g:519:1: ( (lv_number_6_0= ruleEInt ) )
                    // InternalDataSampleDSL.g:520:1: (lv_number_6_0= ruleEInt )
                    {
                    // InternalDataSampleDSL.g:520:1: (lv_number_6_0= ruleEInt )
                    // InternalDataSampleDSL.g:521:3: lv_number_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getNumberEIntParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_22);
                    lv_number_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"number",
                            		lv_number_6_0, 
                            		"com.opcoach.datasample.xtext.DataSampleDSL.EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDataSampleDSL.g:537:4: (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDataSampleDSL.g:537:6: otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,26,FollowSets000.FOLLOW_23); 

                        	newLeafNode(otherlv_7, grammarAccess.getFieldGeneratorAccess().getLeftParenthesisKeyword_6_0());
                        
                    // InternalDataSampleDSL.g:541:1: ( (lv_parameters_8_0= ruleParameter ) )
                    // InternalDataSampleDSL.g:542:1: (lv_parameters_8_0= ruleParameter )
                    {
                    // InternalDataSampleDSL.g:542:1: (lv_parameters_8_0= ruleParameter )
                    // InternalDataSampleDSL.g:543:3: lv_parameters_8_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getParametersParameterParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_24);
                    lv_parameters_8_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldGeneratorRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_8_0, 
                            		"com.opcoach.datasample.xtext.DataSampleDSL.Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDataSampleDSL.g:559:2: (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==27) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalDataSampleDSL.g:559:4: otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) )
                    	    {
                    	    otherlv_9=(Token)match(input,27,FollowSets000.FOLLOW_23); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getFieldGeneratorAccess().getCommaKeyword_6_2_0());
                    	        
                    	    // InternalDataSampleDSL.g:563:1: ( (lv_parameters_10_0= ruleParameter ) )
                    	    // InternalDataSampleDSL.g:564:1: (lv_parameters_10_0= ruleParameter )
                    	    {
                    	    // InternalDataSampleDSL.g:564:1: (lv_parameters_10_0= ruleParameter )
                    	    // InternalDataSampleDSL.g:565:3: lv_parameters_10_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getParametersParameterParserRuleCall_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_24);
                    	    lv_parameters_10_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFieldGeneratorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_10_0, 
                    	            		"com.opcoach.datasample.xtext.DataSampleDSL.Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,28,FollowSets000.FOLLOW_25); 

                        	newLeafNode(otherlv_11, grammarAccess.getFieldGeneratorAccess().getRightParenthesisKeyword_6_3());
                        

                    }
                    break;

            }

            // InternalDataSampleDSL.g:585:3: (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDataSampleDSL.g:585:5: otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,29,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_12, grammarAccess.getFieldGeneratorAccess().getWithErrorRateKeyword_7_0());
                        
                    // InternalDataSampleDSL.g:589:1: ( (lv_errorRate_13_0= ruleEInt ) )
                    // InternalDataSampleDSL.g:590:1: (lv_errorRate_13_0= ruleEInt )
                    {
                    // InternalDataSampleDSL.g:590:1: (lv_errorRate_13_0= ruleEInt )
                    // InternalDataSampleDSL.g:591:3: lv_errorRate_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getErrorRateEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_errorRate_13_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"errorRate",
                            		lv_errorRate_13_0, 
                            		"com.opcoach.datasample.xtext.DataSampleDSL.EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,30,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_14, grammarAccess.getFieldGeneratorAccess().getGeneratedWithKeyword_7_2());
                        
                    // InternalDataSampleDSL.g:611:1: ( (lv_errorGeneratorName_15_0= ruleEString ) )
                    // InternalDataSampleDSL.g:612:1: (lv_errorGeneratorName_15_0= ruleEString )
                    {
                    // InternalDataSampleDSL.g:612:1: (lv_errorGeneratorName_15_0= ruleEString )
                    // InternalDataSampleDSL.g:613:3: lv_errorGeneratorName_15_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getErrorGeneratorNameEStringParserRuleCall_7_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_errorGeneratorName_15_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"errorGeneratorName",
                            		lv_errorGeneratorName_15_0, 
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
    // $ANTLR end "ruleFieldGenerator"


    // $ANTLR start "entryRuleChild"
    // InternalDataSampleDSL.g:637:1: entryRuleChild returns [EObject current=null] : iv_ruleChild= ruleChild EOF ;
    public final EObject entryRuleChild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild = null;


        try {
            // InternalDataSampleDSL.g:638:2: (iv_ruleChild= ruleChild EOF )
            // InternalDataSampleDSL.g:639:2: iv_ruleChild= ruleChild EOF
            {
             newCompositeNode(grammarAccess.getChildRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild=ruleChild();

            state._fsp--;

             current =iv_ruleChild; 
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
    // $ANTLR end "entryRuleChild"


    // $ANTLR start "ruleChild"
    // InternalDataSampleDSL.g:646:1: ruleChild returns [EObject current=null] : (this_ChildrenGenerator_0= ruleChildrenGenerator | this_PolymorphicChildrenGenerator_1= rulePolymorphicChildrenGenerator ) ;
    public final EObject ruleChild() throws RecognitionException {
        EObject current = null;

        EObject this_ChildrenGenerator_0 = null;

        EObject this_PolymorphicChildrenGenerator_1 = null;


         enterRule(); 
            
        try {
            // InternalDataSampleDSL.g:649:28: ( (this_ChildrenGenerator_0= ruleChildrenGenerator | this_PolymorphicChildrenGenerator_1= rulePolymorphicChildrenGenerator ) )
            // InternalDataSampleDSL.g:650:1: (this_ChildrenGenerator_0= ruleChildrenGenerator | this_PolymorphicChildrenGenerator_1= rulePolymorphicChildrenGenerator )
            {
            // InternalDataSampleDSL.g:650:1: (this_ChildrenGenerator_0= ruleChildrenGenerator | this_PolymorphicChildrenGenerator_1= rulePolymorphicChildrenGenerator )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            else if ( (LA14_0==32) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDataSampleDSL.g:651:5: this_ChildrenGenerator_0= ruleChildrenGenerator
                    {
                     
                            newCompositeNode(grammarAccess.getChildAccess().getChildrenGeneratorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ChildrenGenerator_0=ruleChildrenGenerator();

                    state._fsp--;

                     
                            current = this_ChildrenGenerator_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalDataSampleDSL.g:661:5: this_PolymorphicChildrenGenerator_1= rulePolymorphicChildrenGenerator
                    {
                     
                            newCompositeNode(grammarAccess.getChildAccess().getPolymorphicChildrenGeneratorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PolymorphicChildrenGenerator_1=rulePolymorphicChildrenGenerator();

                    state._fsp--;

                     
                            current = this_PolymorphicChildrenGenerator_1; 
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
    // $ANTLR end "ruleChild"


    // $ANTLR start "entryRuleChildrenGenerator"
    // InternalDataSampleDSL.g:677:1: entryRuleChildrenGenerator returns [EObject current=null] : iv_ruleChildrenGenerator= ruleChildrenGenerator EOF ;
    public final EObject entryRuleChildrenGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildrenGenerator = null;


        try {
            // InternalDataSampleDSL.g:678:2: (iv_ruleChildrenGenerator= ruleChildrenGenerator EOF )
            // InternalDataSampleDSL.g:679:2: iv_ruleChildrenGenerator= ruleChildrenGenerator EOF
            {
             newCompositeNode(grammarAccess.getChildrenGeneratorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChildrenGenerator=ruleChildrenGenerator();

            state._fsp--;

             current =iv_ruleChildrenGenerator; 
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
    // $ANTLR end "entryRuleChildrenGenerator"


    // $ANTLR start "ruleChildrenGenerator"
    // InternalDataSampleDSL.g:686:1: ruleChildrenGenerator returns [EObject current=null] : ( () otherlv_1= 'forTheComposition' ( (lv_fieldName_2_0= ruleEString ) ) ( (lv_delegatedEntityGenerator_3_0= ruleEntityGenerator ) ) ) ;
    public final EObject ruleChildrenGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_fieldName_2_0 = null;

        EObject lv_delegatedEntityGenerator_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDataSampleDSL.g:689:28: ( ( () otherlv_1= 'forTheComposition' ( (lv_fieldName_2_0= ruleEString ) ) ( (lv_delegatedEntityGenerator_3_0= ruleEntityGenerator ) ) ) )
            // InternalDataSampleDSL.g:690:1: ( () otherlv_1= 'forTheComposition' ( (lv_fieldName_2_0= ruleEString ) ) ( (lv_delegatedEntityGenerator_3_0= ruleEntityGenerator ) ) )
            {
            // InternalDataSampleDSL.g:690:1: ( () otherlv_1= 'forTheComposition' ( (lv_fieldName_2_0= ruleEString ) ) ( (lv_delegatedEntityGenerator_3_0= ruleEntityGenerator ) ) )
            // InternalDataSampleDSL.g:690:2: () otherlv_1= 'forTheComposition' ( (lv_fieldName_2_0= ruleEString ) ) ( (lv_delegatedEntityGenerator_3_0= ruleEntityGenerator ) )
            {
            // InternalDataSampleDSL.g:690:2: ()
            // InternalDataSampleDSL.g:691:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getChildrenGeneratorAccess().getChildrenGeneratorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getChildrenGeneratorAccess().getForTheCompositionKeyword_1());
                
            // InternalDataSampleDSL.g:700:1: ( (lv_fieldName_2_0= ruleEString ) )
            // InternalDataSampleDSL.g:701:1: (lv_fieldName_2_0= ruleEString )
            {
            // InternalDataSampleDSL.g:701:1: (lv_fieldName_2_0= ruleEString )
            // InternalDataSampleDSL.g:702:3: lv_fieldName_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getChildrenGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_12);
            lv_fieldName_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChildrenGeneratorRule());
            	        }
                   		set(
                   			current, 
                   			"fieldName",
                    		lv_fieldName_2_0, 
                    		"com.opcoach.datasample.xtext.DataSampleDSL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDataSampleDSL.g:718:2: ( (lv_delegatedEntityGenerator_3_0= ruleEntityGenerator ) )
            // InternalDataSampleDSL.g:719:1: (lv_delegatedEntityGenerator_3_0= ruleEntityGenerator )
            {
            // InternalDataSampleDSL.g:719:1: (lv_delegatedEntityGenerator_3_0= ruleEntityGenerator )
            // InternalDataSampleDSL.g:720:3: lv_delegatedEntityGenerator_3_0= ruleEntityGenerator
            {
             
            	        newCompositeNode(grammarAccess.getChildrenGeneratorAccess().getDelegatedEntityGeneratorEntityGeneratorParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_delegatedEntityGenerator_3_0=ruleEntityGenerator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChildrenGeneratorRule());
            	        }
                   		set(
                   			current, 
                   			"delegatedEntityGenerator",
                    		lv_delegatedEntityGenerator_3_0, 
                    		"com.opcoach.datasample.xtext.DataSampleDSL.EntityGenerator");
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
    // $ANTLR end "ruleChildrenGenerator"


    // $ANTLR start "entryRulePolymorphicChildrenGenerator"
    // InternalDataSampleDSL.g:744:1: entryRulePolymorphicChildrenGenerator returns [EObject current=null] : iv_rulePolymorphicChildrenGenerator= rulePolymorphicChildrenGenerator EOF ;
    public final EObject entryRulePolymorphicChildrenGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolymorphicChildrenGenerator = null;


        try {
            // InternalDataSampleDSL.g:745:2: (iv_rulePolymorphicChildrenGenerator= rulePolymorphicChildrenGenerator EOF )
            // InternalDataSampleDSL.g:746:2: iv_rulePolymorphicChildrenGenerator= rulePolymorphicChildrenGenerator EOF
            {
             newCompositeNode(grammarAccess.getPolymorphicChildrenGeneratorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePolymorphicChildrenGenerator=rulePolymorphicChildrenGenerator();

            state._fsp--;

             current =iv_rulePolymorphicChildrenGenerator; 
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
    // $ANTLR end "entryRulePolymorphicChildrenGenerator"


    // $ANTLR start "rulePolymorphicChildrenGenerator"
    // InternalDataSampleDSL.g:753:1: rulePolymorphicChildrenGenerator returns [EObject current=null] : ( () otherlv_1= 'forTheAbstractComposition' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' otherlv_4= '{' ( (lv_childrenGenerators_5_0= ruleEntityGenerator ) )* otherlv_6= '}' ) ;
    public final EObject rulePolymorphicChildrenGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_fieldName_2_0 = null;

        EObject lv_childrenGenerators_5_0 = null;


         enterRule(); 
            
        try {
            // InternalDataSampleDSL.g:756:28: ( ( () otherlv_1= 'forTheAbstractComposition' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' otherlv_4= '{' ( (lv_childrenGenerators_5_0= ruleEntityGenerator ) )* otherlv_6= '}' ) )
            // InternalDataSampleDSL.g:757:1: ( () otherlv_1= 'forTheAbstractComposition' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' otherlv_4= '{' ( (lv_childrenGenerators_5_0= ruleEntityGenerator ) )* otherlv_6= '}' )
            {
            // InternalDataSampleDSL.g:757:1: ( () otherlv_1= 'forTheAbstractComposition' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' otherlv_4= '{' ( (lv_childrenGenerators_5_0= ruleEntityGenerator ) )* otherlv_6= '}' )
            // InternalDataSampleDSL.g:757:2: () otherlv_1= 'forTheAbstractComposition' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' otherlv_4= '{' ( (lv_childrenGenerators_5_0= ruleEntityGenerator ) )* otherlv_6= '}'
            {
            // InternalDataSampleDSL.g:757:2: ()
            // InternalDataSampleDSL.g:758:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPolymorphicChildrenGeneratorAccess().getPolymorphicChildrenGeneratorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getPolymorphicChildrenGeneratorAccess().getForTheAbstractCompositionKeyword_1());
                
            // InternalDataSampleDSL.g:767:1: ( (lv_fieldName_2_0= ruleEString ) )
            // InternalDataSampleDSL.g:768:1: (lv_fieldName_2_0= ruleEString )
            {
            // InternalDataSampleDSL.g:768:1: (lv_fieldName_2_0= ruleEString )
            // InternalDataSampleDSL.g:769:3: lv_fieldName_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPolymorphicChildrenGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_20);
            lv_fieldName_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPolymorphicChildrenGeneratorRule());
            	        }
                   		set(
                   			current, 
                   			"fieldName",
                    		lv_fieldName_2_0, 
                    		"com.opcoach.datasample.xtext.DataSampleDSL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_3, grammarAccess.getPolymorphicChildrenGeneratorAccess().getUseKeyword_3());
                
            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_27); 

                	newLeafNode(otherlv_4, grammarAccess.getPolymorphicChildrenGeneratorAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalDataSampleDSL.g:793:1: ( (lv_childrenGenerators_5_0= ruleEntityGenerator ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDataSampleDSL.g:794:1: (lv_childrenGenerators_5_0= ruleEntityGenerator )
            	    {
            	    // InternalDataSampleDSL.g:794:1: (lv_childrenGenerators_5_0= ruleEntityGenerator )
            	    // InternalDataSampleDSL.g:795:3: lv_childrenGenerators_5_0= ruleEntityGenerator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolymorphicChildrenGeneratorAccess().getChildrenGeneratorsEntityGeneratorParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    lv_childrenGenerators_5_0=ruleEntityGenerator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolymorphicChildrenGeneratorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"childrenGenerators",
            	            		lv_childrenGenerators_5_0, 
            	            		"com.opcoach.datasample.xtext.DataSampleDSL.EntityGenerator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getPolymorphicChildrenGeneratorAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "rulePolymorphicChildrenGenerator"


    // $ANTLR start "entryRuleAssociationGenerator"
    // InternalDataSampleDSL.g:823:1: entryRuleAssociationGenerator returns [EObject current=null] : iv_ruleAssociationGenerator= ruleAssociationGenerator EOF ;
    public final EObject entryRuleAssociationGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationGenerator = null;


        try {
            // InternalDataSampleDSL.g:824:2: (iv_ruleAssociationGenerator= ruleAssociationGenerator EOF )
            // InternalDataSampleDSL.g:825:2: iv_ruleAssociationGenerator= ruleAssociationGenerator EOF
            {
             newCompositeNode(grammarAccess.getAssociationGeneratorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAssociationGenerator=ruleAssociationGenerator();

            state._fsp--;

             current =iv_ruleAssociationGenerator; 
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
    // $ANTLR end "entryRuleAssociationGenerator"


    // $ANTLR start "ruleAssociationGenerator"
    // InternalDataSampleDSL.g:832:1: ruleAssociationGenerator returns [EObject current=null] : ( () otherlv_1= 'forTheAssociation' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )? ) ;
    public final EObject ruleAssociationGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_fieldName_2_0 = null;

        AntlrDatatypeRuleToken lv_generatorName_4_0 = null;

        AntlrDatatypeRuleToken lv_number_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_parameters_10_0 = null;

        AntlrDatatypeRuleToken lv_errorRate_13_0 = null;

        AntlrDatatypeRuleToken lv_errorGeneratorName_15_0 = null;


         enterRule(); 
            
        try {
            // InternalDataSampleDSL.g:835:28: ( ( () otherlv_1= 'forTheAssociation' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )? ) )
            // InternalDataSampleDSL.g:836:1: ( () otherlv_1= 'forTheAssociation' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )? )
            {
            // InternalDataSampleDSL.g:836:1: ( () otherlv_1= 'forTheAssociation' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )? )
            // InternalDataSampleDSL.g:836:2: () otherlv_1= 'forTheAssociation' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )?
            {
            // InternalDataSampleDSL.g:836:2: ()
            // InternalDataSampleDSL.g:837:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAssociationGeneratorAccess().getAssociationGeneratorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getAssociationGeneratorAccess().getForTheAssociationKeyword_1());
                
            // InternalDataSampleDSL.g:846:1: ( (lv_fieldName_2_0= ruleEString ) )
            // InternalDataSampleDSL.g:847:1: (lv_fieldName_2_0= ruleEString )
            {
            // InternalDataSampleDSL.g:847:1: (lv_fieldName_2_0= ruleEString )
            // InternalDataSampleDSL.g:848:3: lv_fieldName_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAssociationGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_20);
            lv_fieldName_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssociationGeneratorRule());
            	        }
                   		set(
                   			current, 
                   			"fieldName",
                    		lv_fieldName_2_0, 
                    		"com.opcoach.datasample.xtext.DataSampleDSL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_3, grammarAccess.getAssociationGeneratorAccess().getUseKeyword_3());
                
            // InternalDataSampleDSL.g:868:1: ( (lv_generatorName_4_0= ruleEString ) )
            // InternalDataSampleDSL.g:869:1: (lv_generatorName_4_0= ruleEString )
            {
            // InternalDataSampleDSL.g:869:1: (lv_generatorName_4_0= ruleEString )
            // InternalDataSampleDSL.g:870:3: lv_generatorName_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAssociationGeneratorAccess().getGeneratorNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_21);
            lv_generatorName_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssociationGeneratorRule());
            	        }
                   		set(
                   			current, 
                   			"generatorName",
                    		lv_generatorName_4_0, 
                    		"com.opcoach.datasample.xtext.DataSampleDSL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDataSampleDSL.g:886:2: (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDataSampleDSL.g:886:4: otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssociationGeneratorAccess().getCardinalityKeyword_5_0());
                        
                    // InternalDataSampleDSL.g:890:1: ( (lv_number_6_0= ruleEInt ) )
                    // InternalDataSampleDSL.g:891:1: (lv_number_6_0= ruleEInt )
                    {
                    // InternalDataSampleDSL.g:891:1: (lv_number_6_0= ruleEInt )
                    // InternalDataSampleDSL.g:892:3: lv_number_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationGeneratorAccess().getNumberEIntParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_22);
                    lv_number_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssociationGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"number",
                            		lv_number_6_0, 
                            		"com.opcoach.datasample.xtext.DataSampleDSL.EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDataSampleDSL.g:908:4: (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDataSampleDSL.g:908:6: otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,26,FollowSets000.FOLLOW_23); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssociationGeneratorAccess().getLeftParenthesisKeyword_6_0());
                        
                    // InternalDataSampleDSL.g:912:1: ( (lv_parameters_8_0= ruleParameter ) )
                    // InternalDataSampleDSL.g:913:1: (lv_parameters_8_0= ruleParameter )
                    {
                    // InternalDataSampleDSL.g:913:1: (lv_parameters_8_0= ruleParameter )
                    // InternalDataSampleDSL.g:914:3: lv_parameters_8_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationGeneratorAccess().getParametersParameterParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_24);
                    lv_parameters_8_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssociationGeneratorRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_8_0, 
                            		"com.opcoach.datasample.xtext.DataSampleDSL.Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDataSampleDSL.g:930:2: (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==27) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalDataSampleDSL.g:930:4: otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) )
                    	    {
                    	    otherlv_9=(Token)match(input,27,FollowSets000.FOLLOW_23); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getAssociationGeneratorAccess().getCommaKeyword_6_2_0());
                    	        
                    	    // InternalDataSampleDSL.g:934:1: ( (lv_parameters_10_0= ruleParameter ) )
                    	    // InternalDataSampleDSL.g:935:1: (lv_parameters_10_0= ruleParameter )
                    	    {
                    	    // InternalDataSampleDSL.g:935:1: (lv_parameters_10_0= ruleParameter )
                    	    // InternalDataSampleDSL.g:936:3: lv_parameters_10_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssociationGeneratorAccess().getParametersParameterParserRuleCall_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_24);
                    	    lv_parameters_10_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssociationGeneratorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_10_0, 
                    	            		"com.opcoach.datasample.xtext.DataSampleDSL.Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,28,FollowSets000.FOLLOW_25); 

                        	newLeafNode(otherlv_11, grammarAccess.getAssociationGeneratorAccess().getRightParenthesisKeyword_6_3());
                        

                    }
                    break;

            }

            // InternalDataSampleDSL.g:956:3: (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDataSampleDSL.g:956:5: otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,29,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_12, grammarAccess.getAssociationGeneratorAccess().getWithErrorRateKeyword_7_0());
                        
                    // InternalDataSampleDSL.g:960:1: ( (lv_errorRate_13_0= ruleEInt ) )
                    // InternalDataSampleDSL.g:961:1: (lv_errorRate_13_0= ruleEInt )
                    {
                    // InternalDataSampleDSL.g:961:1: (lv_errorRate_13_0= ruleEInt )
                    // InternalDataSampleDSL.g:962:3: lv_errorRate_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationGeneratorAccess().getErrorRateEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_errorRate_13_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssociationGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"errorRate",
                            		lv_errorRate_13_0, 
                            		"com.opcoach.datasample.xtext.DataSampleDSL.EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,30,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_14, grammarAccess.getAssociationGeneratorAccess().getGeneratedWithKeyword_7_2());
                        
                    // InternalDataSampleDSL.g:982:1: ( (lv_errorGeneratorName_15_0= ruleEString ) )
                    // InternalDataSampleDSL.g:983:1: (lv_errorGeneratorName_15_0= ruleEString )
                    {
                    // InternalDataSampleDSL.g:983:1: (lv_errorGeneratorName_15_0= ruleEString )
                    // InternalDataSampleDSL.g:984:3: lv_errorGeneratorName_15_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationGeneratorAccess().getErrorGeneratorNameEStringParserRuleCall_7_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_errorGeneratorName_15_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssociationGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"errorGeneratorName",
                            		lv_errorGeneratorName_15_0, 
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
    // $ANTLR end "ruleAssociationGenerator"


    // $ANTLR start "entryRuleParameter"
    // InternalDataSampleDSL.g:1008:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalDataSampleDSL.g:1009:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalDataSampleDSL.g:1010:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalDataSampleDSL.g:1017:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDataSampleDSL.g:1020:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) ) )
            // InternalDataSampleDSL.g:1021:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) )
            {
            // InternalDataSampleDSL.g:1021:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) )
            // InternalDataSampleDSL.g:1021:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) )
            {
            // InternalDataSampleDSL.g:1021:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDataSampleDSL.g:1022:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDataSampleDSL.g:1022:1: (lv_name_0_0= RULE_ID )
            // InternalDataSampleDSL.g:1023:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_28); 

            			newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getEqualsSignKeyword_1());
                
            // InternalDataSampleDSL.g:1043:1: ( (lv_value_2_0= ruleEString ) )
            // InternalDataSampleDSL.g:1044:1: (lv_value_2_0= ruleEString )
            {
            // InternalDataSampleDSL.g:1044:1: (lv_value_2_0= ruleEString )
            // InternalDataSampleDSL.g:1045:3: lv_value_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getValueEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "ruleLanguage"
    // InternalDataSampleDSL.g:1069:1: ruleLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) ) ;
    public final Enumerator ruleLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // InternalDataSampleDSL.g:1071:28: ( ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) ) )
            // InternalDataSampleDSL.g:1072:1: ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) )
            {
            // InternalDataSampleDSL.g:1072:1: ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) )
            int alt20=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt20=1;
                }
                break;
            case 36:
                {
                alt20=2;
                }
                break;
            case 37:
                {
                alt20=3;
                }
                break;
            case 38:
                {
                alt20=4;
                }
                break;
            case 39:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalDataSampleDSL.g:1072:2: (enumLiteral_0= 'fr' )
                    {
                    // InternalDataSampleDSL.g:1072:2: (enumLiteral_0= 'fr' )
                    // InternalDataSampleDSL.g:1072:4: enumLiteral_0= 'fr'
                    {
                    enumLiteral_0=(Token)match(input,35,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalDataSampleDSL.g:1078:6: (enumLiteral_1= 'en' )
                    {
                    // InternalDataSampleDSL.g:1078:6: (enumLiteral_1= 'en' )
                    // InternalDataSampleDSL.g:1078:8: enumLiteral_1= 'en'
                    {
                    enumLiteral_1=(Token)match(input,36,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalDataSampleDSL.g:1084:6: (enumLiteral_2= 'de' )
                    {
                    // InternalDataSampleDSL.g:1084:6: (enumLiteral_2= 'de' )
                    // InternalDataSampleDSL.g:1084:8: enumLiteral_2= 'de'
                    {
                    enumLiteral_2=(Token)match(input,37,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalDataSampleDSL.g:1090:6: (enumLiteral_3= 'es' )
                    {
                    // InternalDataSampleDSL.g:1090:6: (enumLiteral_3= 'es' )
                    // InternalDataSampleDSL.g:1090:8: enumLiteral_3= 'es'
                    {
                    enumLiteral_3=(Token)match(input,38,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalDataSampleDSL.g:1096:6: (enumLiteral_4= 'it' )
                    {
                    // InternalDataSampleDSL.g:1096:6: (enumLiteral_4= 'it' )
                    // InternalDataSampleDSL.g:1096:8: enumLiteral_4= 'it'
                    {
                    enumLiteral_4=(Token)match(input,39,FollowSets000.FOLLOW_2); 

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
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003C000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040040L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000038000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000F800000000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040070L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000380C00000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000380400000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200400000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000026000002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000024000002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000480000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    }


}