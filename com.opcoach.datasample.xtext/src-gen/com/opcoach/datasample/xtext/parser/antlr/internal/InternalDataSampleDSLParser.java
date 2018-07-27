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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Sample'", "'for'", "'generateRootObject'", "'seed'", "'language'", "'-'", "'generate'", "'instancesOf'", "'{'", "'}'", "'forField'", "'use'", "'('", "','", "')'", "'withErrorRate='", "'generatedWith'", "'='", "'fr'", "'en'", "'de'", "'es'", "'it'"
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
    public static final int T__13=13;
    public static final int T__14=14;
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
    // InternalDataSampleDSL.g:77:1: ruleDataSample returns [EObject current=null] : ( () otherlv_1= 'Sample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'for' ( (lv_packageURI_4_0= ruleEString ) ) otherlv_5= 'generateRootObject' ( (lv_rootEntityName_6_0= ruleEString ) ) otherlv_7= 'seed' ( (lv_seed_8_0= ruleEInt ) ) otherlv_9= 'language' ( (lv_language_10_0= ruleLanguage ) ) ( (lv_entityGenerators_11_0= ruleEntityGenerator ) )* ) ;
    public final EObject ruleDataSample() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_packageURI_4_0 = null;

        AntlrDatatypeRuleToken lv_rootEntityName_6_0 = null;

        AntlrDatatypeRuleToken lv_seed_8_0 = null;

        Enumerator lv_language_10_0 = null;

        EObject lv_entityGenerators_11_0 = null;


         enterRule(); 
            
        try {
            // InternalDataSampleDSL.g:80:28: ( ( () otherlv_1= 'Sample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'for' ( (lv_packageURI_4_0= ruleEString ) ) otherlv_5= 'generateRootObject' ( (lv_rootEntityName_6_0= ruleEString ) ) otherlv_7= 'seed' ( (lv_seed_8_0= ruleEInt ) ) otherlv_9= 'language' ( (lv_language_10_0= ruleLanguage ) ) ( (lv_entityGenerators_11_0= ruleEntityGenerator ) )* ) )
            // InternalDataSampleDSL.g:81:1: ( () otherlv_1= 'Sample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'for' ( (lv_packageURI_4_0= ruleEString ) ) otherlv_5= 'generateRootObject' ( (lv_rootEntityName_6_0= ruleEString ) ) otherlv_7= 'seed' ( (lv_seed_8_0= ruleEInt ) ) otherlv_9= 'language' ( (lv_language_10_0= ruleLanguage ) ) ( (lv_entityGenerators_11_0= ruleEntityGenerator ) )* )
            {
            // InternalDataSampleDSL.g:81:1: ( () otherlv_1= 'Sample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'for' ( (lv_packageURI_4_0= ruleEString ) ) otherlv_5= 'generateRootObject' ( (lv_rootEntityName_6_0= ruleEString ) ) otherlv_7= 'seed' ( (lv_seed_8_0= ruleEInt ) ) otherlv_9= 'language' ( (lv_language_10_0= ruleLanguage ) ) ( (lv_entityGenerators_11_0= ruleEntityGenerator ) )* )
            // InternalDataSampleDSL.g:81:2: () otherlv_1= 'Sample' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'for' ( (lv_packageURI_4_0= ruleEString ) ) otherlv_5= 'generateRootObject' ( (lv_rootEntityName_6_0= ruleEString ) ) otherlv_7= 'seed' ( (lv_seed_8_0= ruleEInt ) ) otherlv_9= 'language' ( (lv_language_10_0= ruleLanguage ) ) ( (lv_entityGenerators_11_0= ruleEntityGenerator ) )*
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

            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_7, grammarAccess.getDataSampleAccess().getSeedKeyword_7());
                
            // InternalDataSampleDSL.g:157:1: ( (lv_seed_8_0= ruleEInt ) )
            // InternalDataSampleDSL.g:158:1: (lv_seed_8_0= ruleEInt )
            {
            // InternalDataSampleDSL.g:158:1: (lv_seed_8_0= ruleEInt )
            // InternalDataSampleDSL.g:159:3: lv_seed_8_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getDataSampleAccess().getSeedEIntParserRuleCall_8_0()); 
            	    
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

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_9); 

                	newLeafNode(otherlv_9, grammarAccess.getDataSampleAccess().getLanguageKeyword_9());
                
            // InternalDataSampleDSL.g:179:1: ( (lv_language_10_0= ruleLanguage ) )
            // InternalDataSampleDSL.g:180:1: (lv_language_10_0= ruleLanguage )
            {
            // InternalDataSampleDSL.g:180:1: (lv_language_10_0= ruleLanguage )
            // InternalDataSampleDSL.g:181:3: lv_language_10_0= ruleLanguage
            {
             
            	        newCompositeNode(grammarAccess.getDataSampleAccess().getLanguageLanguageEnumRuleCall_10_0()); 
            	    
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

            // InternalDataSampleDSL.g:197:2: ( (lv_entityGenerators_11_0= ruleEntityGenerator ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDataSampleDSL.g:198:1: (lv_entityGenerators_11_0= ruleEntityGenerator )
            	    {
            	    // InternalDataSampleDSL.g:198:1: (lv_entityGenerators_11_0= ruleEntityGenerator )
            	    // InternalDataSampleDSL.g:199:3: lv_entityGenerators_11_0= ruleEntityGenerator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataSampleAccess().getEntityGeneratorsEntityGeneratorParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    lv_entityGenerators_11_0=ruleEntityGenerator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataSampleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entityGenerators",
            	            		lv_entityGenerators_11_0, 
            	            		"com.opcoach.datasample.xtext.DataSampleDSL.EntityGenerator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleDataSample"


    // $ANTLR start "entryRuleEString"
    // InternalDataSampleDSL.g:223:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDataSampleDSL.g:224:2: (iv_ruleEString= ruleEString EOF )
            // InternalDataSampleDSL.g:225:2: iv_ruleEString= ruleEString EOF
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
    // InternalDataSampleDSL.g:232:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // InternalDataSampleDSL.g:235:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDataSampleDSL.g:236:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDataSampleDSL.g:236:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDataSampleDSL.g:236:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalDataSampleDSL.g:244:10: this_ID_1= RULE_ID
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
    // InternalDataSampleDSL.g:259:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDataSampleDSL.g:260:2: (iv_ruleEInt= ruleEInt EOF )
            // InternalDataSampleDSL.g:261:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalDataSampleDSL.g:268:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalDataSampleDSL.g:271:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDataSampleDSL.g:272:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDataSampleDSL.g:272:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDataSampleDSL.g:272:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDataSampleDSL.g:272:2: (kw= '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDataSampleDSL.g:273:2: kw= '-'
                    {
                    kw=(Token)match(input,16,FollowSets000.FOLLOW_11); 

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
    // InternalDataSampleDSL.g:293:1: entryRuleEntityGenerator returns [EObject current=null] : iv_ruleEntityGenerator= ruleEntityGenerator EOF ;
    public final EObject entryRuleEntityGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityGenerator = null;


        try {
            // InternalDataSampleDSL.g:294:2: (iv_ruleEntityGenerator= ruleEntityGenerator EOF )
            // InternalDataSampleDSL.g:295:2: iv_ruleEntityGenerator= ruleEntityGenerator EOF
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
    // InternalDataSampleDSL.g:302:1: ruleEntityGenerator returns [EObject current=null] : ( () otherlv_1= 'generate' ( (lv_number_2_0= ruleEInt ) ) otherlv_3= 'instancesOf' ( (lv_entityName_4_0= ruleEString ) ) otherlv_5= '{' ( (lv_fieldGenerators_6_0= ruleFieldGenerator ) )* ( (lv_childGenerators_7_0= ruleEntityGenerator ) )* otherlv_8= '}' ) ;
    public final EObject ruleEntityGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_number_2_0 = null;

        AntlrDatatypeRuleToken lv_entityName_4_0 = null;

        EObject lv_fieldGenerators_6_0 = null;

        EObject lv_childGenerators_7_0 = null;


         enterRule(); 
            
        try {
            // InternalDataSampleDSL.g:305:28: ( ( () otherlv_1= 'generate' ( (lv_number_2_0= ruleEInt ) ) otherlv_3= 'instancesOf' ( (lv_entityName_4_0= ruleEString ) ) otherlv_5= '{' ( (lv_fieldGenerators_6_0= ruleFieldGenerator ) )* ( (lv_childGenerators_7_0= ruleEntityGenerator ) )* otherlv_8= '}' ) )
            // InternalDataSampleDSL.g:306:1: ( () otherlv_1= 'generate' ( (lv_number_2_0= ruleEInt ) ) otherlv_3= 'instancesOf' ( (lv_entityName_4_0= ruleEString ) ) otherlv_5= '{' ( (lv_fieldGenerators_6_0= ruleFieldGenerator ) )* ( (lv_childGenerators_7_0= ruleEntityGenerator ) )* otherlv_8= '}' )
            {
            // InternalDataSampleDSL.g:306:1: ( () otherlv_1= 'generate' ( (lv_number_2_0= ruleEInt ) ) otherlv_3= 'instancesOf' ( (lv_entityName_4_0= ruleEString ) ) otherlv_5= '{' ( (lv_fieldGenerators_6_0= ruleFieldGenerator ) )* ( (lv_childGenerators_7_0= ruleEntityGenerator ) )* otherlv_8= '}' )
            // InternalDataSampleDSL.g:306:2: () otherlv_1= 'generate' ( (lv_number_2_0= ruleEInt ) ) otherlv_3= 'instancesOf' ( (lv_entityName_4_0= ruleEString ) ) otherlv_5= '{' ( (lv_fieldGenerators_6_0= ruleFieldGenerator ) )* ( (lv_childGenerators_7_0= ruleEntityGenerator ) )* otherlv_8= '}'
            {
            // InternalDataSampleDSL.g:306:2: ()
            // InternalDataSampleDSL.g:307:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntityGeneratorAccess().getEntityGeneratorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityGeneratorAccess().getGenerateKeyword_1());
                
            // InternalDataSampleDSL.g:316:1: ( (lv_number_2_0= ruleEInt ) )
            // InternalDataSampleDSL.g:317:1: (lv_number_2_0= ruleEInt )
            {
            // InternalDataSampleDSL.g:317:1: (lv_number_2_0= ruleEInt )
            // InternalDataSampleDSL.g:318:3: lv_number_2_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getEntityGeneratorAccess().getNumberEIntParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_12);
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

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_3, grammarAccess.getEntityGeneratorAccess().getInstancesOfKeyword_3());
                
            // InternalDataSampleDSL.g:338:1: ( (lv_entityName_4_0= ruleEString ) )
            // InternalDataSampleDSL.g:339:1: (lv_entityName_4_0= ruleEString )
            {
            // InternalDataSampleDSL.g:339:1: (lv_entityName_4_0= ruleEString )
            // InternalDataSampleDSL.g:340:3: lv_entityName_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEntityGeneratorAccess().getEntityNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_13);
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

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_14); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityGeneratorAccess().getLeftCurlyBracketKeyword_5());
                
            // InternalDataSampleDSL.g:360:1: ( (lv_fieldGenerators_6_0= ruleFieldGenerator ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDataSampleDSL.g:361:1: (lv_fieldGenerators_6_0= ruleFieldGenerator )
            	    {
            	    // InternalDataSampleDSL.g:361:1: (lv_fieldGenerators_6_0= ruleFieldGenerator )
            	    // InternalDataSampleDSL.g:362:3: lv_fieldGenerators_6_0= ruleFieldGenerator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityGeneratorAccess().getFieldGeneratorsFieldGeneratorParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_14);
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
            	    break loop4;
                }
            } while (true);

            // InternalDataSampleDSL.g:378:3: ( (lv_childGenerators_7_0= ruleEntityGenerator ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDataSampleDSL.g:379:1: (lv_childGenerators_7_0= ruleEntityGenerator )
            	    {
            	    // InternalDataSampleDSL.g:379:1: (lv_childGenerators_7_0= ruleEntityGenerator )
            	    // InternalDataSampleDSL.g:380:3: lv_childGenerators_7_0= ruleEntityGenerator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityGeneratorAccess().getChildGeneratorsEntityGeneratorParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    lv_childGenerators_7_0=ruleEntityGenerator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityGeneratorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"childGenerators",
            	            		lv_childGenerators_7_0, 
            	            		"com.opcoach.datasample.xtext.DataSampleDSL.EntityGenerator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_8, grammarAccess.getEntityGeneratorAccess().getRightCurlyBracketKeyword_8());
                

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
    // InternalDataSampleDSL.g:408:1: entryRuleFieldGenerator returns [EObject current=null] : iv_ruleFieldGenerator= ruleFieldGenerator EOF ;
    public final EObject entryRuleFieldGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldGenerator = null;


        try {
            // InternalDataSampleDSL.g:409:2: (iv_ruleFieldGenerator= ruleFieldGenerator EOF )
            // InternalDataSampleDSL.g:410:2: iv_ruleFieldGenerator= ruleFieldGenerator EOF
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
    // InternalDataSampleDSL.g:417:1: ruleFieldGenerator returns [EObject current=null] : ( () otherlv_1= 'forField' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= '(' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= ')' )? (otherlv_10= 'withErrorRate=' ( (lv_errorRate_11_0= ruleEInt ) ) otherlv_12= 'generatedWith' ( (lv_errorGeneratorName_13_0= ruleEString ) ) )? ) ;
    public final EObject ruleFieldGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_fieldName_2_0 = null;

        AntlrDatatypeRuleToken lv_generatorName_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;

        AntlrDatatypeRuleToken lv_errorRate_11_0 = null;

        AntlrDatatypeRuleToken lv_errorGeneratorName_13_0 = null;


         enterRule(); 
            
        try {
            // InternalDataSampleDSL.g:420:28: ( ( () otherlv_1= 'forField' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= '(' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= ')' )? (otherlv_10= 'withErrorRate=' ( (lv_errorRate_11_0= ruleEInt ) ) otherlv_12= 'generatedWith' ( (lv_errorGeneratorName_13_0= ruleEString ) ) )? ) )
            // InternalDataSampleDSL.g:421:1: ( () otherlv_1= 'forField' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= '(' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= ')' )? (otherlv_10= 'withErrorRate=' ( (lv_errorRate_11_0= ruleEInt ) ) otherlv_12= 'generatedWith' ( (lv_errorGeneratorName_13_0= ruleEString ) ) )? )
            {
            // InternalDataSampleDSL.g:421:1: ( () otherlv_1= 'forField' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= '(' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= ')' )? (otherlv_10= 'withErrorRate=' ( (lv_errorRate_11_0= ruleEInt ) ) otherlv_12= 'generatedWith' ( (lv_errorGeneratorName_13_0= ruleEString ) ) )? )
            // InternalDataSampleDSL.g:421:2: () otherlv_1= 'forField' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= '(' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= ')' )? (otherlv_10= 'withErrorRate=' ( (lv_errorRate_11_0= ruleEInt ) ) otherlv_12= 'generatedWith' ( (lv_errorGeneratorName_13_0= ruleEString ) ) )?
            {
            // InternalDataSampleDSL.g:421:2: ()
            // InternalDataSampleDSL.g:422:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFieldGeneratorAccess().getFieldGeneratorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldGeneratorAccess().getForFieldKeyword_1());
                
            // InternalDataSampleDSL.g:431:1: ( (lv_fieldName_2_0= ruleEString ) )
            // InternalDataSampleDSL.g:432:1: (lv_fieldName_2_0= ruleEString )
            {
            // InternalDataSampleDSL.g:432:1: (lv_fieldName_2_0= ruleEString )
            // InternalDataSampleDSL.g:433:3: lv_fieldName_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_16);
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

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_3, grammarAccess.getFieldGeneratorAccess().getUseKeyword_3());
                
            // InternalDataSampleDSL.g:453:1: ( (lv_generatorName_4_0= ruleEString ) )
            // InternalDataSampleDSL.g:454:1: (lv_generatorName_4_0= ruleEString )
            {
            // InternalDataSampleDSL.g:454:1: (lv_generatorName_4_0= ruleEString )
            // InternalDataSampleDSL.g:455:3: lv_generatorName_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getGeneratorNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_17);
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

            // InternalDataSampleDSL.g:471:2: (otherlv_5= '(' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDataSampleDSL.g:471:4: otherlv_5= '(' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= ')'
                    {
                    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_18); 

                        	newLeafNode(otherlv_5, grammarAccess.getFieldGeneratorAccess().getLeftParenthesisKeyword_5_0());
                        
                    // InternalDataSampleDSL.g:475:1: ( (lv_parameters_6_0= ruleParameter ) )
                    // InternalDataSampleDSL.g:476:1: (lv_parameters_6_0= ruleParameter )
                    {
                    // InternalDataSampleDSL.g:476:1: (lv_parameters_6_0= ruleParameter )
                    // InternalDataSampleDSL.g:477:3: lv_parameters_6_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getParametersParameterParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_19);
                    lv_parameters_6_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldGeneratorRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_6_0, 
                            		"com.opcoach.datasample.xtext.DataSampleDSL.Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDataSampleDSL.g:493:2: (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==24) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDataSampleDSL.g:493:4: otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_18); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getFieldGeneratorAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // InternalDataSampleDSL.g:497:1: ( (lv_parameters_8_0= ruleParameter ) )
                    	    // InternalDataSampleDSL.g:498:1: (lv_parameters_8_0= ruleParameter )
                    	    {
                    	    // InternalDataSampleDSL.g:498:1: (lv_parameters_8_0= ruleParameter )
                    	    // InternalDataSampleDSL.g:499:3: lv_parameters_8_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getParametersParameterParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_19);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,25,FollowSets000.FOLLOW_20); 

                        	newLeafNode(otherlv_9, grammarAccess.getFieldGeneratorAccess().getRightParenthesisKeyword_5_3());
                        

                    }
                    break;

            }

            // InternalDataSampleDSL.g:519:3: (otherlv_10= 'withErrorRate=' ( (lv_errorRate_11_0= ruleEInt ) ) otherlv_12= 'generatedWith' ( (lv_errorGeneratorName_13_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDataSampleDSL.g:519:5: otherlv_10= 'withErrorRate=' ( (lv_errorRate_11_0= ruleEInt ) ) otherlv_12= 'generatedWith' ( (lv_errorGeneratorName_13_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_10, grammarAccess.getFieldGeneratorAccess().getWithErrorRateKeyword_6_0());
                        
                    // InternalDataSampleDSL.g:523:1: ( (lv_errorRate_11_0= ruleEInt ) )
                    // InternalDataSampleDSL.g:524:1: (lv_errorRate_11_0= ruleEInt )
                    {
                    // InternalDataSampleDSL.g:524:1: (lv_errorRate_11_0= ruleEInt )
                    // InternalDataSampleDSL.g:525:3: lv_errorRate_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getErrorRateEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_21);
                    lv_errorRate_11_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"errorRate",
                            		lv_errorRate_11_0, 
                            		"com.opcoach.datasample.xtext.DataSampleDSL.EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,27,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_12, grammarAccess.getFieldGeneratorAccess().getGeneratedWithKeyword_6_2());
                        
                    // InternalDataSampleDSL.g:545:1: ( (lv_errorGeneratorName_13_0= ruleEString ) )
                    // InternalDataSampleDSL.g:546:1: (lv_errorGeneratorName_13_0= ruleEString )
                    {
                    // InternalDataSampleDSL.g:546:1: (lv_errorGeneratorName_13_0= ruleEString )
                    // InternalDataSampleDSL.g:547:3: lv_errorGeneratorName_13_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getErrorGeneratorNameEStringParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_errorGeneratorName_13_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"errorGeneratorName",
                            		lv_errorGeneratorName_13_0, 
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


    // $ANTLR start "entryRuleParameter"
    // InternalDataSampleDSL.g:571:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalDataSampleDSL.g:572:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalDataSampleDSL.g:573:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalDataSampleDSL.g:580:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDataSampleDSL.g:583:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) ) )
            // InternalDataSampleDSL.g:584:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) )
            {
            // InternalDataSampleDSL.g:584:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) )
            // InternalDataSampleDSL.g:584:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) )
            {
            // InternalDataSampleDSL.g:584:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDataSampleDSL.g:585:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDataSampleDSL.g:585:1: (lv_name_0_0= RULE_ID )
            // InternalDataSampleDSL.g:586:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); 

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

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getEqualsSignKeyword_1());
                
            // InternalDataSampleDSL.g:606:1: ( (lv_value_2_0= ruleEString ) )
            // InternalDataSampleDSL.g:607:1: (lv_value_2_0= ruleEString )
            {
            // InternalDataSampleDSL.g:607:1: (lv_value_2_0= ruleEString )
            // InternalDataSampleDSL.g:608:3: lv_value_2_0= ruleEString
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
    // InternalDataSampleDSL.g:632:1: ruleLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) ) ;
    public final Enumerator ruleLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // InternalDataSampleDSL.g:634:28: ( ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) ) )
            // InternalDataSampleDSL.g:635:1: ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) )
            {
            // InternalDataSampleDSL.g:635:1: ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt9=1;
                }
                break;
            case 30:
                {
                alt9=2;
                }
                break;
            case 31:
                {
                alt9=3;
                }
                break;
            case 32:
                {
                alt9=4;
                }
                break;
            case 33:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDataSampleDSL.g:635:2: (enumLiteral_0= 'fr' )
                    {
                    // InternalDataSampleDSL.g:635:2: (enumLiteral_0= 'fr' )
                    // InternalDataSampleDSL.g:635:4: enumLiteral_0= 'fr'
                    {
                    enumLiteral_0=(Token)match(input,29,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalDataSampleDSL.g:641:6: (enumLiteral_1= 'en' )
                    {
                    // InternalDataSampleDSL.g:641:6: (enumLiteral_1= 'en' )
                    // InternalDataSampleDSL.g:641:8: enumLiteral_1= 'en'
                    {
                    enumLiteral_1=(Token)match(input,30,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalDataSampleDSL.g:647:6: (enumLiteral_2= 'de' )
                    {
                    // InternalDataSampleDSL.g:647:6: (enumLiteral_2= 'de' )
                    // InternalDataSampleDSL.g:647:8: enumLiteral_2= 'de'
                    {
                    enumLiteral_2=(Token)match(input,31,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalDataSampleDSL.g:653:6: (enumLiteral_3= 'es' )
                    {
                    // InternalDataSampleDSL.g:653:6: (enumLiteral_3= 'es' )
                    // InternalDataSampleDSL.g:653:8: enumLiteral_3= 'es'
                    {
                    enumLiteral_3=(Token)match(input,32,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalDataSampleDSL.g:659:6: (enumLiteral_4= 'it' )
                    {
                    // InternalDataSampleDSL.g:659:6: (enumLiteral_4= 'it' )
                    // InternalDataSampleDSL.g:659:8: enumLiteral_4= 'it'
                    {
                    enumLiteral_4=(Token)match(input,33,FollowSets000.FOLLOW_2); 

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
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010040L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000003E0000000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000320000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004800002L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    }


}