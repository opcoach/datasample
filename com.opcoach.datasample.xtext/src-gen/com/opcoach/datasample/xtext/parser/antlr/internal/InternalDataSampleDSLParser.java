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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Sample'", "'for'", "'generateRootObject'", "'seed'", "'language'", "'-'", "'generate'", "'instancesOf'", "'{'", "'}'", "'forTheField'", "'use'", "'cardinality'", "'('", "','", "')'", "'withErrorRate='", "'generatedWith'", "'forTheComposition'", "'forTheAssociation'", "'='", "'fr'", "'en'", "'de'", "'es'", "'it'"
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
    // InternalDataSampleDSL.g:302:1: ruleEntityGenerator returns [EObject current=null] : ( () otherlv_1= 'generate' ( ( (lv_number_2_0= ruleEInt ) ) otherlv_3= 'instancesOf' )? ( (lv_entityName_4_0= ruleEString ) ) otherlv_5= '{' ( (lv_fieldGenerators_6_0= ruleFieldGenerator ) )* ( (lv_childGenerators_7_0= ruleChildrenGenerator ) )* ( (lv_associationGenerators_8_0= ruleAssociationGenerator ) )* otherlv_9= '}' ) ;
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
            // InternalDataSampleDSL.g:305:28: ( ( () otherlv_1= 'generate' ( ( (lv_number_2_0= ruleEInt ) ) otherlv_3= 'instancesOf' )? ( (lv_entityName_4_0= ruleEString ) ) otherlv_5= '{' ( (lv_fieldGenerators_6_0= ruleFieldGenerator ) )* ( (lv_childGenerators_7_0= ruleChildrenGenerator ) )* ( (lv_associationGenerators_8_0= ruleAssociationGenerator ) )* otherlv_9= '}' ) )
            // InternalDataSampleDSL.g:306:1: ( () otherlv_1= 'generate' ( ( (lv_number_2_0= ruleEInt ) ) otherlv_3= 'instancesOf' )? ( (lv_entityName_4_0= ruleEString ) ) otherlv_5= '{' ( (lv_fieldGenerators_6_0= ruleFieldGenerator ) )* ( (lv_childGenerators_7_0= ruleChildrenGenerator ) )* ( (lv_associationGenerators_8_0= ruleAssociationGenerator ) )* otherlv_9= '}' )
            {
            // InternalDataSampleDSL.g:306:1: ( () otherlv_1= 'generate' ( ( (lv_number_2_0= ruleEInt ) ) otherlv_3= 'instancesOf' )? ( (lv_entityName_4_0= ruleEString ) ) otherlv_5= '{' ( (lv_fieldGenerators_6_0= ruleFieldGenerator ) )* ( (lv_childGenerators_7_0= ruleChildrenGenerator ) )* ( (lv_associationGenerators_8_0= ruleAssociationGenerator ) )* otherlv_9= '}' )
            // InternalDataSampleDSL.g:306:2: () otherlv_1= 'generate' ( ( (lv_number_2_0= ruleEInt ) ) otherlv_3= 'instancesOf' )? ( (lv_entityName_4_0= ruleEString ) ) otherlv_5= '{' ( (lv_fieldGenerators_6_0= ruleFieldGenerator ) )* ( (lv_childGenerators_7_0= ruleChildrenGenerator ) )* ( (lv_associationGenerators_8_0= ruleAssociationGenerator ) )* otherlv_9= '}'
            {
            // InternalDataSampleDSL.g:306:2: ()
            // InternalDataSampleDSL.g:307:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntityGeneratorAccess().getEntityGeneratorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_12); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityGeneratorAccess().getGenerateKeyword_1());
                
            // InternalDataSampleDSL.g:316:1: ( ( (lv_number_2_0= ruleEInt ) ) otherlv_3= 'instancesOf' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDataSampleDSL.g:316:2: ( (lv_number_2_0= ruleEInt ) ) otherlv_3= 'instancesOf'
                    {
                    // InternalDataSampleDSL.g:316:2: ( (lv_number_2_0= ruleEInt ) )
                    // InternalDataSampleDSL.g:317:1: (lv_number_2_0= ruleEInt )
                    {
                    // InternalDataSampleDSL.g:317:1: (lv_number_2_0= ruleEInt )
                    // InternalDataSampleDSL.g:318:3: lv_number_2_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityGeneratorAccess().getNumberEIntParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_13);
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

                        	newLeafNode(otherlv_3, grammarAccess.getEntityGeneratorAccess().getInstancesOfKeyword_2_1());
                        

                    }
                    break;

            }

            // InternalDataSampleDSL.g:338:3: ( (lv_entityName_4_0= ruleEString ) )
            // InternalDataSampleDSL.g:339:1: (lv_entityName_4_0= ruleEString )
            {
            // InternalDataSampleDSL.g:339:1: (lv_entityName_4_0= ruleEString )
            // InternalDataSampleDSL.g:340:3: lv_entityName_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEntityGeneratorAccess().getEntityNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_14);
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

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_15); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityGeneratorAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalDataSampleDSL.g:360:1: ( (lv_fieldGenerators_6_0= ruleFieldGenerator ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDataSampleDSL.g:361:1: (lv_fieldGenerators_6_0= ruleFieldGenerator )
            	    {
            	    // InternalDataSampleDSL.g:361:1: (lv_fieldGenerators_6_0= ruleFieldGenerator )
            	    // InternalDataSampleDSL.g:362:3: lv_fieldGenerators_6_0= ruleFieldGenerator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityGeneratorAccess().getFieldGeneratorsFieldGeneratorParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_15);
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
            	    break loop5;
                }
            } while (true);

            // InternalDataSampleDSL.g:378:3: ( (lv_childGenerators_7_0= ruleChildrenGenerator ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDataSampleDSL.g:379:1: (lv_childGenerators_7_0= ruleChildrenGenerator )
            	    {
            	    // InternalDataSampleDSL.g:379:1: (lv_childGenerators_7_0= ruleChildrenGenerator )
            	    // InternalDataSampleDSL.g:380:3: lv_childGenerators_7_0= ruleChildrenGenerator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityGeneratorAccess().getChildGeneratorsChildrenGeneratorParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    lv_childGenerators_7_0=ruleChildrenGenerator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityGeneratorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"childGenerators",
            	            		lv_childGenerators_7_0, 
            	            		"com.opcoach.datasample.xtext.DataSampleDSL.ChildrenGenerator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalDataSampleDSL.g:396:3: ( (lv_associationGenerators_8_0= ruleAssociationGenerator ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==30) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDataSampleDSL.g:397:1: (lv_associationGenerators_8_0= ruleAssociationGenerator )
            	    {
            	    // InternalDataSampleDSL.g:397:1: (lv_associationGenerators_8_0= ruleAssociationGenerator )
            	    // InternalDataSampleDSL.g:398:3: lv_associationGenerators_8_0= ruleAssociationGenerator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityGeneratorAccess().getAssociationGeneratorsAssociationGeneratorParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_17);
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
            	    break loop7;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_2); 

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
    // InternalDataSampleDSL.g:426:1: entryRuleFieldGenerator returns [EObject current=null] : iv_ruleFieldGenerator= ruleFieldGenerator EOF ;
    public final EObject entryRuleFieldGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldGenerator = null;


        try {
            // InternalDataSampleDSL.g:427:2: (iv_ruleFieldGenerator= ruleFieldGenerator EOF )
            // InternalDataSampleDSL.g:428:2: iv_ruleFieldGenerator= ruleFieldGenerator EOF
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
    // InternalDataSampleDSL.g:435:1: ruleFieldGenerator returns [EObject current=null] : ( () otherlv_1= 'forTheField' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )? ) ;
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
            // InternalDataSampleDSL.g:438:28: ( ( () otherlv_1= 'forTheField' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )? ) )
            // InternalDataSampleDSL.g:439:1: ( () otherlv_1= 'forTheField' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )? )
            {
            // InternalDataSampleDSL.g:439:1: ( () otherlv_1= 'forTheField' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )? )
            // InternalDataSampleDSL.g:439:2: () otherlv_1= 'forTheField' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )?
            {
            // InternalDataSampleDSL.g:439:2: ()
            // InternalDataSampleDSL.g:440:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFieldGeneratorAccess().getFieldGeneratorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldGeneratorAccess().getForTheFieldKeyword_1());
                
            // InternalDataSampleDSL.g:449:1: ( (lv_fieldName_2_0= ruleEString ) )
            // InternalDataSampleDSL.g:450:1: (lv_fieldName_2_0= ruleEString )
            {
            // InternalDataSampleDSL.g:450:1: (lv_fieldName_2_0= ruleEString )
            // InternalDataSampleDSL.g:451:3: lv_fieldName_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_18);
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
                
            // InternalDataSampleDSL.g:471:1: ( (lv_generatorName_4_0= ruleEString ) )
            // InternalDataSampleDSL.g:472:1: (lv_generatorName_4_0= ruleEString )
            {
            // InternalDataSampleDSL.g:472:1: (lv_generatorName_4_0= ruleEString )
            // InternalDataSampleDSL.g:473:3: lv_generatorName_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getGeneratorNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_19);
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

            // InternalDataSampleDSL.g:489:2: (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDataSampleDSL.g:489:4: otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_5, grammarAccess.getFieldGeneratorAccess().getCardinalityKeyword_5_0());
                        
                    // InternalDataSampleDSL.g:493:1: ( (lv_number_6_0= ruleEInt ) )
                    // InternalDataSampleDSL.g:494:1: (lv_number_6_0= ruleEInt )
                    {
                    // InternalDataSampleDSL.g:494:1: (lv_number_6_0= ruleEInt )
                    // InternalDataSampleDSL.g:495:3: lv_number_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getNumberEIntParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_20);
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

            // InternalDataSampleDSL.g:511:4: (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDataSampleDSL.g:511:6: otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_21); 

                        	newLeafNode(otherlv_7, grammarAccess.getFieldGeneratorAccess().getLeftParenthesisKeyword_6_0());
                        
                    // InternalDataSampleDSL.g:515:1: ( (lv_parameters_8_0= ruleParameter ) )
                    // InternalDataSampleDSL.g:516:1: (lv_parameters_8_0= ruleParameter )
                    {
                    // InternalDataSampleDSL.g:516:1: (lv_parameters_8_0= ruleParameter )
                    // InternalDataSampleDSL.g:517:3: lv_parameters_8_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getParametersParameterParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_22);
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

                    // InternalDataSampleDSL.g:533:2: (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==25) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDataSampleDSL.g:533:4: otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) )
                    	    {
                    	    otherlv_9=(Token)match(input,25,FollowSets000.FOLLOW_21); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getFieldGeneratorAccess().getCommaKeyword_6_2_0());
                    	        
                    	    // InternalDataSampleDSL.g:537:1: ( (lv_parameters_10_0= ruleParameter ) )
                    	    // InternalDataSampleDSL.g:538:1: (lv_parameters_10_0= ruleParameter )
                    	    {
                    	    // InternalDataSampleDSL.g:538:1: (lv_parameters_10_0= ruleParameter )
                    	    // InternalDataSampleDSL.g:539:3: lv_parameters_10_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getParametersParameterParserRuleCall_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_22);
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
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,26,FollowSets000.FOLLOW_23); 

                        	newLeafNode(otherlv_11, grammarAccess.getFieldGeneratorAccess().getRightParenthesisKeyword_6_3());
                        

                    }
                    break;

            }

            // InternalDataSampleDSL.g:559:3: (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDataSampleDSL.g:559:5: otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,27,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_12, grammarAccess.getFieldGeneratorAccess().getWithErrorRateKeyword_7_0());
                        
                    // InternalDataSampleDSL.g:563:1: ( (lv_errorRate_13_0= ruleEInt ) )
                    // InternalDataSampleDSL.g:564:1: (lv_errorRate_13_0= ruleEInt )
                    {
                    // InternalDataSampleDSL.g:564:1: (lv_errorRate_13_0= ruleEInt )
                    // InternalDataSampleDSL.g:565:3: lv_errorRate_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldGeneratorAccess().getErrorRateEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_24);
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

                    otherlv_14=(Token)match(input,28,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_14, grammarAccess.getFieldGeneratorAccess().getGeneratedWithKeyword_7_2());
                        
                    // InternalDataSampleDSL.g:585:1: ( (lv_errorGeneratorName_15_0= ruleEString ) )
                    // InternalDataSampleDSL.g:586:1: (lv_errorGeneratorName_15_0= ruleEString )
                    {
                    // InternalDataSampleDSL.g:586:1: (lv_errorGeneratorName_15_0= ruleEString )
                    // InternalDataSampleDSL.g:587:3: lv_errorGeneratorName_15_0= ruleEString
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


    // $ANTLR start "entryRuleChildrenGenerator"
    // InternalDataSampleDSL.g:611:1: entryRuleChildrenGenerator returns [EObject current=null] : iv_ruleChildrenGenerator= ruleChildrenGenerator EOF ;
    public final EObject entryRuleChildrenGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildrenGenerator = null;


        try {
            // InternalDataSampleDSL.g:612:2: (iv_ruleChildrenGenerator= ruleChildrenGenerator EOF )
            // InternalDataSampleDSL.g:613:2: iv_ruleChildrenGenerator= ruleChildrenGenerator EOF
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
    // InternalDataSampleDSL.g:620:1: ruleChildrenGenerator returns [EObject current=null] : ( () otherlv_1= 'forTheComposition' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )? ) ;
    public final EObject ruleChildrenGenerator() throws RecognitionException {
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
            // InternalDataSampleDSL.g:623:28: ( ( () otherlv_1= 'forTheComposition' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )? ) )
            // InternalDataSampleDSL.g:624:1: ( () otherlv_1= 'forTheComposition' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )? )
            {
            // InternalDataSampleDSL.g:624:1: ( () otherlv_1= 'forTheComposition' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )? )
            // InternalDataSampleDSL.g:624:2: () otherlv_1= 'forTheComposition' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )?
            {
            // InternalDataSampleDSL.g:624:2: ()
            // InternalDataSampleDSL.g:625:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getChildrenGeneratorAccess().getChildrenGeneratorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getChildrenGeneratorAccess().getForTheCompositionKeyword_1());
                
            // InternalDataSampleDSL.g:634:1: ( (lv_fieldName_2_0= ruleEString ) )
            // InternalDataSampleDSL.g:635:1: (lv_fieldName_2_0= ruleEString )
            {
            // InternalDataSampleDSL.g:635:1: (lv_fieldName_2_0= ruleEString )
            // InternalDataSampleDSL.g:636:3: lv_fieldName_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getChildrenGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_18);
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

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_3, grammarAccess.getChildrenGeneratorAccess().getUseKeyword_3());
                
            // InternalDataSampleDSL.g:656:1: ( (lv_generatorName_4_0= ruleEString ) )
            // InternalDataSampleDSL.g:657:1: (lv_generatorName_4_0= ruleEString )
            {
            // InternalDataSampleDSL.g:657:1: (lv_generatorName_4_0= ruleEString )
            // InternalDataSampleDSL.g:658:3: lv_generatorName_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getChildrenGeneratorAccess().getGeneratorNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_19);
            lv_generatorName_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChildrenGeneratorRule());
            	        }
                   		set(
                   			current, 
                   			"generatorName",
                    		lv_generatorName_4_0, 
                    		"com.opcoach.datasample.xtext.DataSampleDSL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDataSampleDSL.g:674:2: (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDataSampleDSL.g:674:4: otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_5, grammarAccess.getChildrenGeneratorAccess().getCardinalityKeyword_5_0());
                        
                    // InternalDataSampleDSL.g:678:1: ( (lv_number_6_0= ruleEInt ) )
                    // InternalDataSampleDSL.g:679:1: (lv_number_6_0= ruleEInt )
                    {
                    // InternalDataSampleDSL.g:679:1: (lv_number_6_0= ruleEInt )
                    // InternalDataSampleDSL.g:680:3: lv_number_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getChildrenGeneratorAccess().getNumberEIntParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_20);
                    lv_number_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getChildrenGeneratorRule());
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

            // InternalDataSampleDSL.g:696:4: (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDataSampleDSL.g:696:6: otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_21); 

                        	newLeafNode(otherlv_7, grammarAccess.getChildrenGeneratorAccess().getLeftParenthesisKeyword_6_0());
                        
                    // InternalDataSampleDSL.g:700:1: ( (lv_parameters_8_0= ruleParameter ) )
                    // InternalDataSampleDSL.g:701:1: (lv_parameters_8_0= ruleParameter )
                    {
                    // InternalDataSampleDSL.g:701:1: (lv_parameters_8_0= ruleParameter )
                    // InternalDataSampleDSL.g:702:3: lv_parameters_8_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getChildrenGeneratorAccess().getParametersParameterParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_22);
                    lv_parameters_8_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getChildrenGeneratorRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_8_0, 
                            		"com.opcoach.datasample.xtext.DataSampleDSL.Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDataSampleDSL.g:718:2: (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==25) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDataSampleDSL.g:718:4: otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) )
                    	    {
                    	    otherlv_9=(Token)match(input,25,FollowSets000.FOLLOW_21); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getChildrenGeneratorAccess().getCommaKeyword_6_2_0());
                    	        
                    	    // InternalDataSampleDSL.g:722:1: ( (lv_parameters_10_0= ruleParameter ) )
                    	    // InternalDataSampleDSL.g:723:1: (lv_parameters_10_0= ruleParameter )
                    	    {
                    	    // InternalDataSampleDSL.g:723:1: (lv_parameters_10_0= ruleParameter )
                    	    // InternalDataSampleDSL.g:724:3: lv_parameters_10_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getChildrenGeneratorAccess().getParametersParameterParserRuleCall_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_22);
                    	    lv_parameters_10_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getChildrenGeneratorRule());
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
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,26,FollowSets000.FOLLOW_23); 

                        	newLeafNode(otherlv_11, grammarAccess.getChildrenGeneratorAccess().getRightParenthesisKeyword_6_3());
                        

                    }
                    break;

            }

            // InternalDataSampleDSL.g:744:3: (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDataSampleDSL.g:744:5: otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,27,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_12, grammarAccess.getChildrenGeneratorAccess().getWithErrorRateKeyword_7_0());
                        
                    // InternalDataSampleDSL.g:748:1: ( (lv_errorRate_13_0= ruleEInt ) )
                    // InternalDataSampleDSL.g:749:1: (lv_errorRate_13_0= ruleEInt )
                    {
                    // InternalDataSampleDSL.g:749:1: (lv_errorRate_13_0= ruleEInt )
                    // InternalDataSampleDSL.g:750:3: lv_errorRate_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getChildrenGeneratorAccess().getErrorRateEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_24);
                    lv_errorRate_13_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getChildrenGeneratorRule());
                    	        }
                           		set(
                           			current, 
                           			"errorRate",
                            		lv_errorRate_13_0, 
                            		"com.opcoach.datasample.xtext.DataSampleDSL.EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,28,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_14, grammarAccess.getChildrenGeneratorAccess().getGeneratedWithKeyword_7_2());
                        
                    // InternalDataSampleDSL.g:770:1: ( (lv_errorGeneratorName_15_0= ruleEString ) )
                    // InternalDataSampleDSL.g:771:1: (lv_errorGeneratorName_15_0= ruleEString )
                    {
                    // InternalDataSampleDSL.g:771:1: (lv_errorGeneratorName_15_0= ruleEString )
                    // InternalDataSampleDSL.g:772:3: lv_errorGeneratorName_15_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getChildrenGeneratorAccess().getErrorGeneratorNameEStringParserRuleCall_7_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_errorGeneratorName_15_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getChildrenGeneratorRule());
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
    // $ANTLR end "ruleChildrenGenerator"


    // $ANTLR start "entryRuleAssociationGenerator"
    // InternalDataSampleDSL.g:796:1: entryRuleAssociationGenerator returns [EObject current=null] : iv_ruleAssociationGenerator= ruleAssociationGenerator EOF ;
    public final EObject entryRuleAssociationGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationGenerator = null;


        try {
            // InternalDataSampleDSL.g:797:2: (iv_ruleAssociationGenerator= ruleAssociationGenerator EOF )
            // InternalDataSampleDSL.g:798:2: iv_ruleAssociationGenerator= ruleAssociationGenerator EOF
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
    // InternalDataSampleDSL.g:805:1: ruleAssociationGenerator returns [EObject current=null] : ( () otherlv_1= 'forTheAssociation' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )? ) ;
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
            // InternalDataSampleDSL.g:808:28: ( ( () otherlv_1= 'forTheAssociation' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )? ) )
            // InternalDataSampleDSL.g:809:1: ( () otherlv_1= 'forTheAssociation' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )? )
            {
            // InternalDataSampleDSL.g:809:1: ( () otherlv_1= 'forTheAssociation' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )? )
            // InternalDataSampleDSL.g:809:2: () otherlv_1= 'forTheAssociation' ( (lv_fieldName_2_0= ruleEString ) ) otherlv_3= 'use' ( (lv_generatorName_4_0= ruleEString ) ) (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )?
            {
            // InternalDataSampleDSL.g:809:2: ()
            // InternalDataSampleDSL.g:810:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAssociationGeneratorAccess().getAssociationGeneratorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getAssociationGeneratorAccess().getForTheAssociationKeyword_1());
                
            // InternalDataSampleDSL.g:819:1: ( (lv_fieldName_2_0= ruleEString ) )
            // InternalDataSampleDSL.g:820:1: (lv_fieldName_2_0= ruleEString )
            {
            // InternalDataSampleDSL.g:820:1: (lv_fieldName_2_0= ruleEString )
            // InternalDataSampleDSL.g:821:3: lv_fieldName_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAssociationGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_18);
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

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_3, grammarAccess.getAssociationGeneratorAccess().getUseKeyword_3());
                
            // InternalDataSampleDSL.g:841:1: ( (lv_generatorName_4_0= ruleEString ) )
            // InternalDataSampleDSL.g:842:1: (lv_generatorName_4_0= ruleEString )
            {
            // InternalDataSampleDSL.g:842:1: (lv_generatorName_4_0= ruleEString )
            // InternalDataSampleDSL.g:843:3: lv_generatorName_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAssociationGeneratorAccess().getGeneratorNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_19);
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

            // InternalDataSampleDSL.g:859:2: (otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDataSampleDSL.g:859:4: otherlv_5= 'cardinality' ( (lv_number_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssociationGeneratorAccess().getCardinalityKeyword_5_0());
                        
                    // InternalDataSampleDSL.g:863:1: ( (lv_number_6_0= ruleEInt ) )
                    // InternalDataSampleDSL.g:864:1: (lv_number_6_0= ruleEInt )
                    {
                    // InternalDataSampleDSL.g:864:1: (lv_number_6_0= ruleEInt )
                    // InternalDataSampleDSL.g:865:3: lv_number_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationGeneratorAccess().getNumberEIntParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_20);
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

            // InternalDataSampleDSL.g:881:4: (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDataSampleDSL.g:881:6: otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_21); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssociationGeneratorAccess().getLeftParenthesisKeyword_6_0());
                        
                    // InternalDataSampleDSL.g:885:1: ( (lv_parameters_8_0= ruleParameter ) )
                    // InternalDataSampleDSL.g:886:1: (lv_parameters_8_0= ruleParameter )
                    {
                    // InternalDataSampleDSL.g:886:1: (lv_parameters_8_0= ruleParameter )
                    // InternalDataSampleDSL.g:887:3: lv_parameters_8_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationGeneratorAccess().getParametersParameterParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_22);
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

                    // InternalDataSampleDSL.g:903:2: (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==25) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalDataSampleDSL.g:903:4: otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) )
                    	    {
                    	    otherlv_9=(Token)match(input,25,FollowSets000.FOLLOW_21); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getAssociationGeneratorAccess().getCommaKeyword_6_2_0());
                    	        
                    	    // InternalDataSampleDSL.g:907:1: ( (lv_parameters_10_0= ruleParameter ) )
                    	    // InternalDataSampleDSL.g:908:1: (lv_parameters_10_0= ruleParameter )
                    	    {
                    	    // InternalDataSampleDSL.g:908:1: (lv_parameters_10_0= ruleParameter )
                    	    // InternalDataSampleDSL.g:909:3: lv_parameters_10_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssociationGeneratorAccess().getParametersParameterParserRuleCall_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_22);
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

                    otherlv_11=(Token)match(input,26,FollowSets000.FOLLOW_23); 

                        	newLeafNode(otherlv_11, grammarAccess.getAssociationGeneratorAccess().getRightParenthesisKeyword_6_3());
                        

                    }
                    break;

            }

            // InternalDataSampleDSL.g:929:3: (otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDataSampleDSL.g:929:5: otherlv_12= 'withErrorRate=' ( (lv_errorRate_13_0= ruleEInt ) ) otherlv_14= 'generatedWith' ( (lv_errorGeneratorName_15_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,27,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_12, grammarAccess.getAssociationGeneratorAccess().getWithErrorRateKeyword_7_0());
                        
                    // InternalDataSampleDSL.g:933:1: ( (lv_errorRate_13_0= ruleEInt ) )
                    // InternalDataSampleDSL.g:934:1: (lv_errorRate_13_0= ruleEInt )
                    {
                    // InternalDataSampleDSL.g:934:1: (lv_errorRate_13_0= ruleEInt )
                    // InternalDataSampleDSL.g:935:3: lv_errorRate_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationGeneratorAccess().getErrorRateEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_24);
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

                    otherlv_14=(Token)match(input,28,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_14, grammarAccess.getAssociationGeneratorAccess().getGeneratedWithKeyword_7_2());
                        
                    // InternalDataSampleDSL.g:955:1: ( (lv_errorGeneratorName_15_0= ruleEString ) )
                    // InternalDataSampleDSL.g:956:1: (lv_errorGeneratorName_15_0= ruleEString )
                    {
                    // InternalDataSampleDSL.g:956:1: (lv_errorGeneratorName_15_0= ruleEString )
                    // InternalDataSampleDSL.g:957:3: lv_errorGeneratorName_15_0= ruleEString
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
    // InternalDataSampleDSL.g:981:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalDataSampleDSL.g:982:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalDataSampleDSL.g:983:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalDataSampleDSL.g:990:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDataSampleDSL.g:993:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) ) )
            // InternalDataSampleDSL.g:994:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) )
            {
            // InternalDataSampleDSL.g:994:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) )
            // InternalDataSampleDSL.g:994:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) )
            {
            // InternalDataSampleDSL.g:994:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDataSampleDSL.g:995:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDataSampleDSL.g:995:1: (lv_name_0_0= RULE_ID )
            // InternalDataSampleDSL.g:996:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_25); 

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

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getEqualsSignKeyword_1());
                
            // InternalDataSampleDSL.g:1016:1: ( (lv_value_2_0= ruleEString ) )
            // InternalDataSampleDSL.g:1017:1: (lv_value_2_0= ruleEString )
            {
            // InternalDataSampleDSL.g:1017:1: (lv_value_2_0= ruleEString )
            // InternalDataSampleDSL.g:1018:3: lv_value_2_0= ruleEString
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
    // InternalDataSampleDSL.g:1042:1: ruleLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) ) ;
    public final Enumerator ruleLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // InternalDataSampleDSL.g:1044:28: ( ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) ) )
            // InternalDataSampleDSL.g:1045:1: ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) )
            {
            // InternalDataSampleDSL.g:1045:1: ( (enumLiteral_0= 'fr' ) | (enumLiteral_1= 'en' ) | (enumLiteral_2= 'de' ) | (enumLiteral_3= 'es' ) | (enumLiteral_4= 'it' ) )
            int alt20=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt20=1;
                }
                break;
            case 33:
                {
                alt20=2;
                }
                break;
            case 34:
                {
                alt20=3;
                }
                break;
            case 35:
                {
                alt20=4;
                }
                break;
            case 36:
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
                    // InternalDataSampleDSL.g:1045:2: (enumLiteral_0= 'fr' )
                    {
                    // InternalDataSampleDSL.g:1045:2: (enumLiteral_0= 'fr' )
                    // InternalDataSampleDSL.g:1045:4: enumLiteral_0= 'fr'
                    {
                    enumLiteral_0=(Token)match(input,32,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalDataSampleDSL.g:1051:6: (enumLiteral_1= 'en' )
                    {
                    // InternalDataSampleDSL.g:1051:6: (enumLiteral_1= 'en' )
                    // InternalDataSampleDSL.g:1051:8: enumLiteral_1= 'en'
                    {
                    enumLiteral_1=(Token)match(input,33,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalDataSampleDSL.g:1057:6: (enumLiteral_2= 'de' )
                    {
                    // InternalDataSampleDSL.g:1057:6: (enumLiteral_2= 'de' )
                    // InternalDataSampleDSL.g:1057:8: enumLiteral_2= 'de'
                    {
                    enumLiteral_2=(Token)match(input,34,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalDataSampleDSL.g:1063:6: (enumLiteral_3= 'es' )
                    {
                    // InternalDataSampleDSL.g:1063:6: (enumLiteral_3= 'es' )
                    // InternalDataSampleDSL.g:1063:8: enumLiteral_3= 'es'
                    {
                    enumLiteral_3=(Token)match(input,35,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalDataSampleDSL.g:1069:6: (enumLiteral_4= 'it' )
                    {
                    // InternalDataSampleDSL.g:1069:6: (enumLiteral_4= 'it' )
                    // InternalDataSampleDSL.g:1069:8: enumLiteral_4= 'it'
                    {
                    enumLiteral_4=(Token)match(input,36,FollowSets000.FOLLOW_2); 

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
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001F00000000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010070L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000060300000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000060100000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040100000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000009800002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000009000002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000006000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    }


}