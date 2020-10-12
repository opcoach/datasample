package com.opcoach.datasample.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.opcoach.datasample.xtext.services.DataSampleDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataSampleDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fr'", "'en'", "'de'", "'es'", "'it'", "'Sample'", "'for'", "'generateRootObject'", "'rootGenerator'", "'seed'", "'language'", "'fileExtension'", "'-'", "'generate'", "'{'", "'}'", "'instancesOf'", "'forTheField'", "'use'", "'cardinality'", "'('", "')'", "','", "'withErrorRate='", "'generatedWith'", "'forTheComposition'", "'forTheAssociation'", "'='"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
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
     	
        public void setGrammarAccess(DataSampleDSLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleDataSample"
    // InternalDataSampleDSL.g:60:1: entryRuleDataSample : ruleDataSample EOF ;
    public final void entryRuleDataSample() throws RecognitionException {
        try {
            // InternalDataSampleDSL.g:61:1: ( ruleDataSample EOF )
            // InternalDataSampleDSL.g:62:1: ruleDataSample EOF
            {
             before(grammarAccess.getDataSampleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDataSample();

            state._fsp--;

             after(grammarAccess.getDataSampleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleDataSample"


    // $ANTLR start "ruleDataSample"
    // InternalDataSampleDSL.g:69:1: ruleDataSample : ( ( rule__DataSample__Group__0 ) ) ;
    public final void ruleDataSample() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:73:2: ( ( ( rule__DataSample__Group__0 ) ) )
            // InternalDataSampleDSL.g:74:1: ( ( rule__DataSample__Group__0 ) )
            {
            // InternalDataSampleDSL.g:74:1: ( ( rule__DataSample__Group__0 ) )
            // InternalDataSampleDSL.g:75:1: ( rule__DataSample__Group__0 )
            {
             before(grammarAccess.getDataSampleAccess().getGroup()); 
            // InternalDataSampleDSL.g:76:1: ( rule__DataSample__Group__0 )
            // InternalDataSampleDSL.g:76:2: rule__DataSample__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataSampleAccess().getGroup()); 

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
    // $ANTLR end "ruleDataSample"


    // $ANTLR start "entryRuleEString"
    // InternalDataSampleDSL.g:88:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDataSampleDSL.g:89:1: ( ruleEString EOF )
            // InternalDataSampleDSL.g:90:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDataSampleDSL.g:97:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:101:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDataSampleDSL.g:102:1: ( ( rule__EString__Alternatives ) )
            {
            // InternalDataSampleDSL.g:102:1: ( ( rule__EString__Alternatives ) )
            // InternalDataSampleDSL.g:103:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDataSampleDSL.g:104:1: ( rule__EString__Alternatives )
            // InternalDataSampleDSL.g:104:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalDataSampleDSL.g:116:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalDataSampleDSL.g:117:1: ( ruleEInt EOF )
            // InternalDataSampleDSL.g:118:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDataSampleDSL.g:125:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:129:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalDataSampleDSL.g:130:1: ( ( rule__EInt__Group__0 ) )
            {
            // InternalDataSampleDSL.g:130:1: ( ( rule__EInt__Group__0 ) )
            // InternalDataSampleDSL.g:131:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalDataSampleDSL.g:132:1: ( rule__EInt__Group__0 )
            // InternalDataSampleDSL.g:132:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEntityGenerator"
    // InternalDataSampleDSL.g:144:1: entryRuleEntityGenerator : ruleEntityGenerator EOF ;
    public final void entryRuleEntityGenerator() throws RecognitionException {
        try {
            // InternalDataSampleDSL.g:145:1: ( ruleEntityGenerator EOF )
            // InternalDataSampleDSL.g:146:1: ruleEntityGenerator EOF
            {
             before(grammarAccess.getEntityGeneratorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEntityGenerator();

            state._fsp--;

             after(grammarAccess.getEntityGeneratorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntityGenerator"


    // $ANTLR start "ruleEntityGenerator"
    // InternalDataSampleDSL.g:153:1: ruleEntityGenerator : ( ( rule__EntityGenerator__Group__0 ) ) ;
    public final void ruleEntityGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:157:2: ( ( ( rule__EntityGenerator__Group__0 ) ) )
            // InternalDataSampleDSL.g:158:1: ( ( rule__EntityGenerator__Group__0 ) )
            {
            // InternalDataSampleDSL.g:158:1: ( ( rule__EntityGenerator__Group__0 ) )
            // InternalDataSampleDSL.g:159:1: ( rule__EntityGenerator__Group__0 )
            {
             before(grammarAccess.getEntityGeneratorAccess().getGroup()); 
            // InternalDataSampleDSL.g:160:1: ( rule__EntityGenerator__Group__0 )
            // InternalDataSampleDSL.g:160:2: rule__EntityGenerator__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityGeneratorAccess().getGroup()); 

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
    // $ANTLR end "ruleEntityGenerator"


    // $ANTLR start "entryRuleFieldGenerator"
    // InternalDataSampleDSL.g:172:1: entryRuleFieldGenerator : ruleFieldGenerator EOF ;
    public final void entryRuleFieldGenerator() throws RecognitionException {
        try {
            // InternalDataSampleDSL.g:173:1: ( ruleFieldGenerator EOF )
            // InternalDataSampleDSL.g:174:1: ruleFieldGenerator EOF
            {
             before(grammarAccess.getFieldGeneratorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFieldGenerator();

            state._fsp--;

             after(grammarAccess.getFieldGeneratorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleFieldGenerator"


    // $ANTLR start "ruleFieldGenerator"
    // InternalDataSampleDSL.g:181:1: ruleFieldGenerator : ( ( rule__FieldGenerator__Group__0 ) ) ;
    public final void ruleFieldGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:185:2: ( ( ( rule__FieldGenerator__Group__0 ) ) )
            // InternalDataSampleDSL.g:186:1: ( ( rule__FieldGenerator__Group__0 ) )
            {
            // InternalDataSampleDSL.g:186:1: ( ( rule__FieldGenerator__Group__0 ) )
            // InternalDataSampleDSL.g:187:1: ( rule__FieldGenerator__Group__0 )
            {
             before(grammarAccess.getFieldGeneratorAccess().getGroup()); 
            // InternalDataSampleDSL.g:188:1: ( rule__FieldGenerator__Group__0 )
            // InternalDataSampleDSL.g:188:2: rule__FieldGenerator__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldGeneratorAccess().getGroup()); 

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
    // $ANTLR end "ruleFieldGenerator"


    // $ANTLR start "entryRuleChildrenGenerator"
    // InternalDataSampleDSL.g:200:1: entryRuleChildrenGenerator : ruleChildrenGenerator EOF ;
    public final void entryRuleChildrenGenerator() throws RecognitionException {
        try {
            // InternalDataSampleDSL.g:201:1: ( ruleChildrenGenerator EOF )
            // InternalDataSampleDSL.g:202:1: ruleChildrenGenerator EOF
            {
             before(grammarAccess.getChildrenGeneratorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleChildrenGenerator();

            state._fsp--;

             after(grammarAccess.getChildrenGeneratorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleChildrenGenerator"


    // $ANTLR start "ruleChildrenGenerator"
    // InternalDataSampleDSL.g:209:1: ruleChildrenGenerator : ( ( rule__ChildrenGenerator__Group__0 ) ) ;
    public final void ruleChildrenGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:213:2: ( ( ( rule__ChildrenGenerator__Group__0 ) ) )
            // InternalDataSampleDSL.g:214:1: ( ( rule__ChildrenGenerator__Group__0 ) )
            {
            // InternalDataSampleDSL.g:214:1: ( ( rule__ChildrenGenerator__Group__0 ) )
            // InternalDataSampleDSL.g:215:1: ( rule__ChildrenGenerator__Group__0 )
            {
             before(grammarAccess.getChildrenGeneratorAccess().getGroup()); 
            // InternalDataSampleDSL.g:216:1: ( rule__ChildrenGenerator__Group__0 )
            // InternalDataSampleDSL.g:216:2: rule__ChildrenGenerator__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChildrenGeneratorAccess().getGroup()); 

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
    // $ANTLR end "ruleChildrenGenerator"


    // $ANTLR start "entryRuleAssociationGenerator"
    // InternalDataSampleDSL.g:228:1: entryRuleAssociationGenerator : ruleAssociationGenerator EOF ;
    public final void entryRuleAssociationGenerator() throws RecognitionException {
        try {
            // InternalDataSampleDSL.g:229:1: ( ruleAssociationGenerator EOF )
            // InternalDataSampleDSL.g:230:1: ruleAssociationGenerator EOF
            {
             before(grammarAccess.getAssociationGeneratorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAssociationGenerator();

            state._fsp--;

             after(grammarAccess.getAssociationGeneratorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssociationGenerator"


    // $ANTLR start "ruleAssociationGenerator"
    // InternalDataSampleDSL.g:237:1: ruleAssociationGenerator : ( ( rule__AssociationGenerator__Group__0 ) ) ;
    public final void ruleAssociationGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:241:2: ( ( ( rule__AssociationGenerator__Group__0 ) ) )
            // InternalDataSampleDSL.g:242:1: ( ( rule__AssociationGenerator__Group__0 ) )
            {
            // InternalDataSampleDSL.g:242:1: ( ( rule__AssociationGenerator__Group__0 ) )
            // InternalDataSampleDSL.g:243:1: ( rule__AssociationGenerator__Group__0 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getGroup()); 
            // InternalDataSampleDSL.g:244:1: ( rule__AssociationGenerator__Group__0 )
            // InternalDataSampleDSL.g:244:2: rule__AssociationGenerator__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationGeneratorAccess().getGroup()); 

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
    // $ANTLR end "ruleAssociationGenerator"


    // $ANTLR start "entryRuleParameter"
    // InternalDataSampleDSL.g:256:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalDataSampleDSL.g:257:1: ( ruleParameter EOF )
            // InternalDataSampleDSL.g:258:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalDataSampleDSL.g:265:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:269:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalDataSampleDSL.g:270:1: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalDataSampleDSL.g:270:1: ( ( rule__Parameter__Group__0 ) )
            // InternalDataSampleDSL.g:271:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalDataSampleDSL.g:272:1: ( rule__Parameter__Group__0 )
            // InternalDataSampleDSL.g:272:2: rule__Parameter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "ruleLanguage"
    // InternalDataSampleDSL.g:285:1: ruleLanguage : ( ( rule__Language__Alternatives ) ) ;
    public final void ruleLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:289:1: ( ( ( rule__Language__Alternatives ) ) )
            // InternalDataSampleDSL.g:290:1: ( ( rule__Language__Alternatives ) )
            {
            // InternalDataSampleDSL.g:290:1: ( ( rule__Language__Alternatives ) )
            // InternalDataSampleDSL.g:291:1: ( rule__Language__Alternatives )
            {
             before(grammarAccess.getLanguageAccess().getAlternatives()); 
            // InternalDataSampleDSL.g:292:1: ( rule__Language__Alternatives )
            // InternalDataSampleDSL.g:292:2: rule__Language__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Language__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDataSampleDSL.g:303:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:307:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDataSampleDSL.g:308:1: ( RULE_STRING )
                    {
                    // InternalDataSampleDSL.g:308:1: ( RULE_STRING )
                    // InternalDataSampleDSL.g:309:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataSampleDSL.g:314:6: ( RULE_ID )
                    {
                    // InternalDataSampleDSL.g:314:6: ( RULE_ID )
                    // InternalDataSampleDSL.g:315:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__ChildrenGenerator__Alternatives_3"
    // InternalDataSampleDSL.g:325:1: rule__ChildrenGenerator__Alternatives_3 : ( ( ( rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_0 ) ) | ( ( rule__ChildrenGenerator__Group_3_1__0 ) ) );
    public final void rule__ChildrenGenerator__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:329:1: ( ( ( rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_0 ) ) | ( ( rule__ChildrenGenerator__Group_3_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24) ) {
                alt2=1;
            }
            else if ( (LA2_0==29) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDataSampleDSL.g:330:1: ( ( rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_0 ) )
                    {
                    // InternalDataSampleDSL.g:330:1: ( ( rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_0 ) )
                    // InternalDataSampleDSL.g:331:1: ( rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_0 )
                    {
                     before(grammarAccess.getChildrenGeneratorAccess().getChildrenGeneratorsAssignment_3_0()); 
                    // InternalDataSampleDSL.g:332:1: ( rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_0 )
                    // InternalDataSampleDSL.g:332:2: rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChildrenGeneratorAccess().getChildrenGeneratorsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataSampleDSL.g:336:6: ( ( rule__ChildrenGenerator__Group_3_1__0 ) )
                    {
                    // InternalDataSampleDSL.g:336:6: ( ( rule__ChildrenGenerator__Group_3_1__0 ) )
                    // InternalDataSampleDSL.g:337:1: ( rule__ChildrenGenerator__Group_3_1__0 )
                    {
                     before(grammarAccess.getChildrenGeneratorAccess().getGroup_3_1()); 
                    // InternalDataSampleDSL.g:338:1: ( rule__ChildrenGenerator__Group_3_1__0 )
                    // InternalDataSampleDSL.g:338:2: rule__ChildrenGenerator__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ChildrenGenerator__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChildrenGeneratorAccess().getGroup_3_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__ChildrenGenerator__Alternatives_3"


    // $ANTLR start "rule__Language__Alternatives"
    // InternalDataSampleDSL.g:347:1: rule__Language__Alternatives : ( ( ( 'fr' ) ) | ( ( 'en' ) ) | ( ( 'de' ) ) | ( ( 'es' ) ) | ( ( 'it' ) ) );
    public final void rule__Language__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:351:1: ( ( ( 'fr' ) ) | ( ( 'en' ) ) | ( ( 'de' ) ) | ( ( 'es' ) ) | ( ( 'it' ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDataSampleDSL.g:352:1: ( ( 'fr' ) )
                    {
                    // InternalDataSampleDSL.g:352:1: ( ( 'fr' ) )
                    // InternalDataSampleDSL.g:353:1: ( 'fr' )
                    {
                     before(grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0()); 
                    // InternalDataSampleDSL.g:354:1: ( 'fr' )
                    // InternalDataSampleDSL.g:354:3: 'fr'
                    {
                    match(input,11,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataSampleDSL.g:359:6: ( ( 'en' ) )
                    {
                    // InternalDataSampleDSL.g:359:6: ( ( 'en' ) )
                    // InternalDataSampleDSL.g:360:1: ( 'en' )
                    {
                     before(grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1()); 
                    // InternalDataSampleDSL.g:361:1: ( 'en' )
                    // InternalDataSampleDSL.g:361:3: 'en'
                    {
                    match(input,12,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataSampleDSL.g:366:6: ( ( 'de' ) )
                    {
                    // InternalDataSampleDSL.g:366:6: ( ( 'de' ) )
                    // InternalDataSampleDSL.g:367:1: ( 'de' )
                    {
                     before(grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2()); 
                    // InternalDataSampleDSL.g:368:1: ( 'de' )
                    // InternalDataSampleDSL.g:368:3: 'de'
                    {
                    match(input,13,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataSampleDSL.g:373:6: ( ( 'es' ) )
                    {
                    // InternalDataSampleDSL.g:373:6: ( ( 'es' ) )
                    // InternalDataSampleDSL.g:374:1: ( 'es' )
                    {
                     before(grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3()); 
                    // InternalDataSampleDSL.g:375:1: ( 'es' )
                    // InternalDataSampleDSL.g:375:3: 'es'
                    {
                    match(input,14,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataSampleDSL.g:380:6: ( ( 'it' ) )
                    {
                    // InternalDataSampleDSL.g:380:6: ( ( 'it' ) )
                    // InternalDataSampleDSL.g:381:1: ( 'it' )
                    {
                     before(grammarAccess.getLanguageAccess().getItEnumLiteralDeclaration_4()); 
                    // InternalDataSampleDSL.g:382:1: ( 'it' )
                    // InternalDataSampleDSL.g:382:3: 'it'
                    {
                    match(input,15,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageAccess().getItEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Language__Alternatives"


    // $ANTLR start "rule__DataSample__Group__0"
    // InternalDataSampleDSL.g:394:1: rule__DataSample__Group__0 : rule__DataSample__Group__0__Impl rule__DataSample__Group__1 ;
    public final void rule__DataSample__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:398:1: ( rule__DataSample__Group__0__Impl rule__DataSample__Group__1 )
            // InternalDataSampleDSL.g:399:2: rule__DataSample__Group__0__Impl rule__DataSample__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__DataSample__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__1();

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
    // $ANTLR end "rule__DataSample__Group__0"


    // $ANTLR start "rule__DataSample__Group__0__Impl"
    // InternalDataSampleDSL.g:406:1: rule__DataSample__Group__0__Impl : ( () ) ;
    public final void rule__DataSample__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:410:1: ( ( () ) )
            // InternalDataSampleDSL.g:411:1: ( () )
            {
            // InternalDataSampleDSL.g:411:1: ( () )
            // InternalDataSampleDSL.g:412:1: ()
            {
             before(grammarAccess.getDataSampleAccess().getDataSampleAction_0()); 
            // InternalDataSampleDSL.g:413:1: ()
            // InternalDataSampleDSL.g:415:1: 
            {
            }

             after(grammarAccess.getDataSampleAccess().getDataSampleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__0__Impl"


    // $ANTLR start "rule__DataSample__Group__1"
    // InternalDataSampleDSL.g:425:1: rule__DataSample__Group__1 : rule__DataSample__Group__1__Impl rule__DataSample__Group__2 ;
    public final void rule__DataSample__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:429:1: ( rule__DataSample__Group__1__Impl rule__DataSample__Group__2 )
            // InternalDataSampleDSL.g:430:2: rule__DataSample__Group__1__Impl rule__DataSample__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__DataSample__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__2();

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
    // $ANTLR end "rule__DataSample__Group__1"


    // $ANTLR start "rule__DataSample__Group__1__Impl"
    // InternalDataSampleDSL.g:437:1: rule__DataSample__Group__1__Impl : ( 'Sample' ) ;
    public final void rule__DataSample__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:441:1: ( ( 'Sample' ) )
            // InternalDataSampleDSL.g:442:1: ( 'Sample' )
            {
            // InternalDataSampleDSL.g:442:1: ( 'Sample' )
            // InternalDataSampleDSL.g:443:1: 'Sample'
            {
             before(grammarAccess.getDataSampleAccess().getSampleKeyword_1()); 
            match(input,16,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataSampleAccess().getSampleKeyword_1()); 

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
    // $ANTLR end "rule__DataSample__Group__1__Impl"


    // $ANTLR start "rule__DataSample__Group__2"
    // InternalDataSampleDSL.g:456:1: rule__DataSample__Group__2 : rule__DataSample__Group__2__Impl rule__DataSample__Group__3 ;
    public final void rule__DataSample__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:460:1: ( rule__DataSample__Group__2__Impl rule__DataSample__Group__3 )
            // InternalDataSampleDSL.g:461:2: rule__DataSample__Group__2__Impl rule__DataSample__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__DataSample__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__3();

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
    // $ANTLR end "rule__DataSample__Group__2"


    // $ANTLR start "rule__DataSample__Group__2__Impl"
    // InternalDataSampleDSL.g:468:1: rule__DataSample__Group__2__Impl : ( ( rule__DataSample__NameAssignment_2 ) ) ;
    public final void rule__DataSample__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:472:1: ( ( ( rule__DataSample__NameAssignment_2 ) ) )
            // InternalDataSampleDSL.g:473:1: ( ( rule__DataSample__NameAssignment_2 ) )
            {
            // InternalDataSampleDSL.g:473:1: ( ( rule__DataSample__NameAssignment_2 ) )
            // InternalDataSampleDSL.g:474:1: ( rule__DataSample__NameAssignment_2 )
            {
             before(grammarAccess.getDataSampleAccess().getNameAssignment_2()); 
            // InternalDataSampleDSL.g:475:1: ( rule__DataSample__NameAssignment_2 )
            // InternalDataSampleDSL.g:475:2: rule__DataSample__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataSampleAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__DataSample__Group__2__Impl"


    // $ANTLR start "rule__DataSample__Group__3"
    // InternalDataSampleDSL.g:485:1: rule__DataSample__Group__3 : rule__DataSample__Group__3__Impl rule__DataSample__Group__4 ;
    public final void rule__DataSample__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:489:1: ( rule__DataSample__Group__3__Impl rule__DataSample__Group__4 )
            // InternalDataSampleDSL.g:490:2: rule__DataSample__Group__3__Impl rule__DataSample__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__DataSample__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__4();

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
    // $ANTLR end "rule__DataSample__Group__3"


    // $ANTLR start "rule__DataSample__Group__3__Impl"
    // InternalDataSampleDSL.g:497:1: rule__DataSample__Group__3__Impl : ( 'for' ) ;
    public final void rule__DataSample__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:501:1: ( ( 'for' ) )
            // InternalDataSampleDSL.g:502:1: ( 'for' )
            {
            // InternalDataSampleDSL.g:502:1: ( 'for' )
            // InternalDataSampleDSL.g:503:1: 'for'
            {
             before(grammarAccess.getDataSampleAccess().getForKeyword_3()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataSampleAccess().getForKeyword_3()); 

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
    // $ANTLR end "rule__DataSample__Group__3__Impl"


    // $ANTLR start "rule__DataSample__Group__4"
    // InternalDataSampleDSL.g:516:1: rule__DataSample__Group__4 : rule__DataSample__Group__4__Impl rule__DataSample__Group__5 ;
    public final void rule__DataSample__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:520:1: ( rule__DataSample__Group__4__Impl rule__DataSample__Group__5 )
            // InternalDataSampleDSL.g:521:2: rule__DataSample__Group__4__Impl rule__DataSample__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__DataSample__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__5();

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
    // $ANTLR end "rule__DataSample__Group__4"


    // $ANTLR start "rule__DataSample__Group__4__Impl"
    // InternalDataSampleDSL.g:528:1: rule__DataSample__Group__4__Impl : ( ( rule__DataSample__PackageURIAssignment_4 ) ) ;
    public final void rule__DataSample__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:532:1: ( ( ( rule__DataSample__PackageURIAssignment_4 ) ) )
            // InternalDataSampleDSL.g:533:1: ( ( rule__DataSample__PackageURIAssignment_4 ) )
            {
            // InternalDataSampleDSL.g:533:1: ( ( rule__DataSample__PackageURIAssignment_4 ) )
            // InternalDataSampleDSL.g:534:1: ( rule__DataSample__PackageURIAssignment_4 )
            {
             before(grammarAccess.getDataSampleAccess().getPackageURIAssignment_4()); 
            // InternalDataSampleDSL.g:535:1: ( rule__DataSample__PackageURIAssignment_4 )
            // InternalDataSampleDSL.g:535:2: rule__DataSample__PackageURIAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__PackageURIAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDataSampleAccess().getPackageURIAssignment_4()); 

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
    // $ANTLR end "rule__DataSample__Group__4__Impl"


    // $ANTLR start "rule__DataSample__Group__5"
    // InternalDataSampleDSL.g:545:1: rule__DataSample__Group__5 : rule__DataSample__Group__5__Impl rule__DataSample__Group__6 ;
    public final void rule__DataSample__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:549:1: ( rule__DataSample__Group__5__Impl rule__DataSample__Group__6 )
            // InternalDataSampleDSL.g:550:2: rule__DataSample__Group__5__Impl rule__DataSample__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__DataSample__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__6();

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
    // $ANTLR end "rule__DataSample__Group__5"


    // $ANTLR start "rule__DataSample__Group__5__Impl"
    // InternalDataSampleDSL.g:557:1: rule__DataSample__Group__5__Impl : ( 'generateRootObject' ) ;
    public final void rule__DataSample__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:561:1: ( ( 'generateRootObject' ) )
            // InternalDataSampleDSL.g:562:1: ( 'generateRootObject' )
            {
            // InternalDataSampleDSL.g:562:1: ( 'generateRootObject' )
            // InternalDataSampleDSL.g:563:1: 'generateRootObject'
            {
             before(grammarAccess.getDataSampleAccess().getGenerateRootObjectKeyword_5()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataSampleAccess().getGenerateRootObjectKeyword_5()); 

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
    // $ANTLR end "rule__DataSample__Group__5__Impl"


    // $ANTLR start "rule__DataSample__Group__6"
    // InternalDataSampleDSL.g:576:1: rule__DataSample__Group__6 : rule__DataSample__Group__6__Impl rule__DataSample__Group__7 ;
    public final void rule__DataSample__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:580:1: ( rule__DataSample__Group__6__Impl rule__DataSample__Group__7 )
            // InternalDataSampleDSL.g:581:2: rule__DataSample__Group__6__Impl rule__DataSample__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__DataSample__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__7();

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
    // $ANTLR end "rule__DataSample__Group__6"


    // $ANTLR start "rule__DataSample__Group__6__Impl"
    // InternalDataSampleDSL.g:588:1: rule__DataSample__Group__6__Impl : ( ( rule__DataSample__RootEntityNameAssignment_6 ) ) ;
    public final void rule__DataSample__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:592:1: ( ( ( rule__DataSample__RootEntityNameAssignment_6 ) ) )
            // InternalDataSampleDSL.g:593:1: ( ( rule__DataSample__RootEntityNameAssignment_6 ) )
            {
            // InternalDataSampleDSL.g:593:1: ( ( rule__DataSample__RootEntityNameAssignment_6 ) )
            // InternalDataSampleDSL.g:594:1: ( rule__DataSample__RootEntityNameAssignment_6 )
            {
             before(grammarAccess.getDataSampleAccess().getRootEntityNameAssignment_6()); 
            // InternalDataSampleDSL.g:595:1: ( rule__DataSample__RootEntityNameAssignment_6 )
            // InternalDataSampleDSL.g:595:2: rule__DataSample__RootEntityNameAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__RootEntityNameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDataSampleAccess().getRootEntityNameAssignment_6()); 

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
    // $ANTLR end "rule__DataSample__Group__6__Impl"


    // $ANTLR start "rule__DataSample__Group__7"
    // InternalDataSampleDSL.g:605:1: rule__DataSample__Group__7 : rule__DataSample__Group__7__Impl rule__DataSample__Group__8 ;
    public final void rule__DataSample__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:609:1: ( rule__DataSample__Group__7__Impl rule__DataSample__Group__8 )
            // InternalDataSampleDSL.g:610:2: rule__DataSample__Group__7__Impl rule__DataSample__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__DataSample__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__8();

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
    // $ANTLR end "rule__DataSample__Group__7"


    // $ANTLR start "rule__DataSample__Group__7__Impl"
    // InternalDataSampleDSL.g:617:1: rule__DataSample__Group__7__Impl : ( ( rule__DataSample__Group_7__0 )? ) ;
    public final void rule__DataSample__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:621:1: ( ( ( rule__DataSample__Group_7__0 )? ) )
            // InternalDataSampleDSL.g:622:1: ( ( rule__DataSample__Group_7__0 )? )
            {
            // InternalDataSampleDSL.g:622:1: ( ( rule__DataSample__Group_7__0 )? )
            // InternalDataSampleDSL.g:623:1: ( rule__DataSample__Group_7__0 )?
            {
             before(grammarAccess.getDataSampleAccess().getGroup_7()); 
            // InternalDataSampleDSL.g:624:1: ( rule__DataSample__Group_7__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDataSampleDSL.g:624:2: rule__DataSample__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DataSample__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSampleAccess().getGroup_7()); 

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
    // $ANTLR end "rule__DataSample__Group__7__Impl"


    // $ANTLR start "rule__DataSample__Group__8"
    // InternalDataSampleDSL.g:634:1: rule__DataSample__Group__8 : rule__DataSample__Group__8__Impl rule__DataSample__Group__9 ;
    public final void rule__DataSample__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:638:1: ( rule__DataSample__Group__8__Impl rule__DataSample__Group__9 )
            // InternalDataSampleDSL.g:639:2: rule__DataSample__Group__8__Impl rule__DataSample__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__DataSample__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__9();

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
    // $ANTLR end "rule__DataSample__Group__8"


    // $ANTLR start "rule__DataSample__Group__8__Impl"
    // InternalDataSampleDSL.g:646:1: rule__DataSample__Group__8__Impl : ( ( rule__DataSample__Group_8__0 )? ) ;
    public final void rule__DataSample__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:650:1: ( ( ( rule__DataSample__Group_8__0 )? ) )
            // InternalDataSampleDSL.g:651:1: ( ( rule__DataSample__Group_8__0 )? )
            {
            // InternalDataSampleDSL.g:651:1: ( ( rule__DataSample__Group_8__0 )? )
            // InternalDataSampleDSL.g:652:1: ( rule__DataSample__Group_8__0 )?
            {
             before(grammarAccess.getDataSampleAccess().getGroup_8()); 
            // InternalDataSampleDSL.g:653:1: ( rule__DataSample__Group_8__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDataSampleDSL.g:653:2: rule__DataSample__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DataSample__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSampleAccess().getGroup_8()); 

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
    // $ANTLR end "rule__DataSample__Group__8__Impl"


    // $ANTLR start "rule__DataSample__Group__9"
    // InternalDataSampleDSL.g:663:1: rule__DataSample__Group__9 : rule__DataSample__Group__9__Impl rule__DataSample__Group__10 ;
    public final void rule__DataSample__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:667:1: ( rule__DataSample__Group__9__Impl rule__DataSample__Group__10 )
            // InternalDataSampleDSL.g:668:2: rule__DataSample__Group__9__Impl rule__DataSample__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__DataSample__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__10();

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
    // $ANTLR end "rule__DataSample__Group__9"


    // $ANTLR start "rule__DataSample__Group__9__Impl"
    // InternalDataSampleDSL.g:675:1: rule__DataSample__Group__9__Impl : ( ( rule__DataSample__Group_9__0 )? ) ;
    public final void rule__DataSample__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:679:1: ( ( ( rule__DataSample__Group_9__0 )? ) )
            // InternalDataSampleDSL.g:680:1: ( ( rule__DataSample__Group_9__0 )? )
            {
            // InternalDataSampleDSL.g:680:1: ( ( rule__DataSample__Group_9__0 )? )
            // InternalDataSampleDSL.g:681:1: ( rule__DataSample__Group_9__0 )?
            {
             before(grammarAccess.getDataSampleAccess().getGroup_9()); 
            // InternalDataSampleDSL.g:682:1: ( rule__DataSample__Group_9__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDataSampleDSL.g:682:2: rule__DataSample__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DataSample__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSampleAccess().getGroup_9()); 

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
    // $ANTLR end "rule__DataSample__Group__9__Impl"


    // $ANTLR start "rule__DataSample__Group__10"
    // InternalDataSampleDSL.g:692:1: rule__DataSample__Group__10 : rule__DataSample__Group__10__Impl rule__DataSample__Group__11 ;
    public final void rule__DataSample__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:696:1: ( rule__DataSample__Group__10__Impl rule__DataSample__Group__11 )
            // InternalDataSampleDSL.g:697:2: rule__DataSample__Group__10__Impl rule__DataSample__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DataSample__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__11();

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
    // $ANTLR end "rule__DataSample__Group__10"


    // $ANTLR start "rule__DataSample__Group__10__Impl"
    // InternalDataSampleDSL.g:704:1: rule__DataSample__Group__10__Impl : ( 'rootGenerator' ) ;
    public final void rule__DataSample__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:708:1: ( ( 'rootGenerator' ) )
            // InternalDataSampleDSL.g:709:1: ( 'rootGenerator' )
            {
            // InternalDataSampleDSL.g:709:1: ( 'rootGenerator' )
            // InternalDataSampleDSL.g:710:1: 'rootGenerator'
            {
             before(grammarAccess.getDataSampleAccess().getRootGeneratorKeyword_10()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataSampleAccess().getRootGeneratorKeyword_10()); 

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
    // $ANTLR end "rule__DataSample__Group__10__Impl"


    // $ANTLR start "rule__DataSample__Group__11"
    // InternalDataSampleDSL.g:723:1: rule__DataSample__Group__11 : rule__DataSample__Group__11__Impl ;
    public final void rule__DataSample__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:727:1: ( rule__DataSample__Group__11__Impl )
            // InternalDataSampleDSL.g:728:2: rule__DataSample__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__11__Impl();

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
    // $ANTLR end "rule__DataSample__Group__11"


    // $ANTLR start "rule__DataSample__Group__11__Impl"
    // InternalDataSampleDSL.g:734:1: rule__DataSample__Group__11__Impl : ( ( rule__DataSample__RootGeneratorAssignment_11 ) ) ;
    public final void rule__DataSample__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:738:1: ( ( ( rule__DataSample__RootGeneratorAssignment_11 ) ) )
            // InternalDataSampleDSL.g:739:1: ( ( rule__DataSample__RootGeneratorAssignment_11 ) )
            {
            // InternalDataSampleDSL.g:739:1: ( ( rule__DataSample__RootGeneratorAssignment_11 ) )
            // InternalDataSampleDSL.g:740:1: ( rule__DataSample__RootGeneratorAssignment_11 )
            {
             before(grammarAccess.getDataSampleAccess().getRootGeneratorAssignment_11()); 
            // InternalDataSampleDSL.g:741:1: ( rule__DataSample__RootGeneratorAssignment_11 )
            // InternalDataSampleDSL.g:741:2: rule__DataSample__RootGeneratorAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__RootGeneratorAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getDataSampleAccess().getRootGeneratorAssignment_11()); 

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
    // $ANTLR end "rule__DataSample__Group__11__Impl"


    // $ANTLR start "rule__DataSample__Group_7__0"
    // InternalDataSampleDSL.g:775:1: rule__DataSample__Group_7__0 : rule__DataSample__Group_7__0__Impl rule__DataSample__Group_7__1 ;
    public final void rule__DataSample__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:779:1: ( rule__DataSample__Group_7__0__Impl rule__DataSample__Group_7__1 )
            // InternalDataSampleDSL.g:780:2: rule__DataSample__Group_7__0__Impl rule__DataSample__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DataSample__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group_7__1();

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
    // $ANTLR end "rule__DataSample__Group_7__0"


    // $ANTLR start "rule__DataSample__Group_7__0__Impl"
    // InternalDataSampleDSL.g:787:1: rule__DataSample__Group_7__0__Impl : ( 'seed' ) ;
    public final void rule__DataSample__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:791:1: ( ( 'seed' ) )
            // InternalDataSampleDSL.g:792:1: ( 'seed' )
            {
            // InternalDataSampleDSL.g:792:1: ( 'seed' )
            // InternalDataSampleDSL.g:793:1: 'seed'
            {
             before(grammarAccess.getDataSampleAccess().getSeedKeyword_7_0()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataSampleAccess().getSeedKeyword_7_0()); 

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
    // $ANTLR end "rule__DataSample__Group_7__0__Impl"


    // $ANTLR start "rule__DataSample__Group_7__1"
    // InternalDataSampleDSL.g:806:1: rule__DataSample__Group_7__1 : rule__DataSample__Group_7__1__Impl ;
    public final void rule__DataSample__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:810:1: ( rule__DataSample__Group_7__1__Impl )
            // InternalDataSampleDSL.g:811:2: rule__DataSample__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group_7__1__Impl();

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
    // $ANTLR end "rule__DataSample__Group_7__1"


    // $ANTLR start "rule__DataSample__Group_7__1__Impl"
    // InternalDataSampleDSL.g:817:1: rule__DataSample__Group_7__1__Impl : ( ( rule__DataSample__SeedAssignment_7_1 ) ) ;
    public final void rule__DataSample__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:821:1: ( ( ( rule__DataSample__SeedAssignment_7_1 ) ) )
            // InternalDataSampleDSL.g:822:1: ( ( rule__DataSample__SeedAssignment_7_1 ) )
            {
            // InternalDataSampleDSL.g:822:1: ( ( rule__DataSample__SeedAssignment_7_1 ) )
            // InternalDataSampleDSL.g:823:1: ( rule__DataSample__SeedAssignment_7_1 )
            {
             before(grammarAccess.getDataSampleAccess().getSeedAssignment_7_1()); 
            // InternalDataSampleDSL.g:824:1: ( rule__DataSample__SeedAssignment_7_1 )
            // InternalDataSampleDSL.g:824:2: rule__DataSample__SeedAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__SeedAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSampleAccess().getSeedAssignment_7_1()); 

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
    // $ANTLR end "rule__DataSample__Group_7__1__Impl"


    // $ANTLR start "rule__DataSample__Group_8__0"
    // InternalDataSampleDSL.g:838:1: rule__DataSample__Group_8__0 : rule__DataSample__Group_8__0__Impl rule__DataSample__Group_8__1 ;
    public final void rule__DataSample__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:842:1: ( rule__DataSample__Group_8__0__Impl rule__DataSample__Group_8__1 )
            // InternalDataSampleDSL.g:843:2: rule__DataSample__Group_8__0__Impl rule__DataSample__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__DataSample__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group_8__1();

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
    // $ANTLR end "rule__DataSample__Group_8__0"


    // $ANTLR start "rule__DataSample__Group_8__0__Impl"
    // InternalDataSampleDSL.g:850:1: rule__DataSample__Group_8__0__Impl : ( 'language' ) ;
    public final void rule__DataSample__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:854:1: ( ( 'language' ) )
            // InternalDataSampleDSL.g:855:1: ( 'language' )
            {
            // InternalDataSampleDSL.g:855:1: ( 'language' )
            // InternalDataSampleDSL.g:856:1: 'language'
            {
             before(grammarAccess.getDataSampleAccess().getLanguageKeyword_8_0()); 
            match(input,21,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataSampleAccess().getLanguageKeyword_8_0()); 

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
    // $ANTLR end "rule__DataSample__Group_8__0__Impl"


    // $ANTLR start "rule__DataSample__Group_8__1"
    // InternalDataSampleDSL.g:869:1: rule__DataSample__Group_8__1 : rule__DataSample__Group_8__1__Impl ;
    public final void rule__DataSample__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:873:1: ( rule__DataSample__Group_8__1__Impl )
            // InternalDataSampleDSL.g:874:2: rule__DataSample__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group_8__1__Impl();

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
    // $ANTLR end "rule__DataSample__Group_8__1"


    // $ANTLR start "rule__DataSample__Group_8__1__Impl"
    // InternalDataSampleDSL.g:880:1: rule__DataSample__Group_8__1__Impl : ( ( rule__DataSample__LanguageAssignment_8_1 ) ) ;
    public final void rule__DataSample__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:884:1: ( ( ( rule__DataSample__LanguageAssignment_8_1 ) ) )
            // InternalDataSampleDSL.g:885:1: ( ( rule__DataSample__LanguageAssignment_8_1 ) )
            {
            // InternalDataSampleDSL.g:885:1: ( ( rule__DataSample__LanguageAssignment_8_1 ) )
            // InternalDataSampleDSL.g:886:1: ( rule__DataSample__LanguageAssignment_8_1 )
            {
             before(grammarAccess.getDataSampleAccess().getLanguageAssignment_8_1()); 
            // InternalDataSampleDSL.g:887:1: ( rule__DataSample__LanguageAssignment_8_1 )
            // InternalDataSampleDSL.g:887:2: rule__DataSample__LanguageAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__LanguageAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSampleAccess().getLanguageAssignment_8_1()); 

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
    // $ANTLR end "rule__DataSample__Group_8__1__Impl"


    // $ANTLR start "rule__DataSample__Group_9__0"
    // InternalDataSampleDSL.g:901:1: rule__DataSample__Group_9__0 : rule__DataSample__Group_9__0__Impl rule__DataSample__Group_9__1 ;
    public final void rule__DataSample__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:905:1: ( rule__DataSample__Group_9__0__Impl rule__DataSample__Group_9__1 )
            // InternalDataSampleDSL.g:906:2: rule__DataSample__Group_9__0__Impl rule__DataSample__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__DataSample__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group_9__1();

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
    // $ANTLR end "rule__DataSample__Group_9__0"


    // $ANTLR start "rule__DataSample__Group_9__0__Impl"
    // InternalDataSampleDSL.g:913:1: rule__DataSample__Group_9__0__Impl : ( 'fileExtension' ) ;
    public final void rule__DataSample__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:917:1: ( ( 'fileExtension' ) )
            // InternalDataSampleDSL.g:918:1: ( 'fileExtension' )
            {
            // InternalDataSampleDSL.g:918:1: ( 'fileExtension' )
            // InternalDataSampleDSL.g:919:1: 'fileExtension'
            {
             before(grammarAccess.getDataSampleAccess().getFileExtensionKeyword_9_0()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataSampleAccess().getFileExtensionKeyword_9_0()); 

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
    // $ANTLR end "rule__DataSample__Group_9__0__Impl"


    // $ANTLR start "rule__DataSample__Group_9__1"
    // InternalDataSampleDSL.g:932:1: rule__DataSample__Group_9__1 : rule__DataSample__Group_9__1__Impl ;
    public final void rule__DataSample__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:936:1: ( rule__DataSample__Group_9__1__Impl )
            // InternalDataSampleDSL.g:937:2: rule__DataSample__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group_9__1__Impl();

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
    // $ANTLR end "rule__DataSample__Group_9__1"


    // $ANTLR start "rule__DataSample__Group_9__1__Impl"
    // InternalDataSampleDSL.g:943:1: rule__DataSample__Group_9__1__Impl : ( ( rule__DataSample__FileExtensionAssignment_9_1 ) ) ;
    public final void rule__DataSample__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:947:1: ( ( ( rule__DataSample__FileExtensionAssignment_9_1 ) ) )
            // InternalDataSampleDSL.g:948:1: ( ( rule__DataSample__FileExtensionAssignment_9_1 ) )
            {
            // InternalDataSampleDSL.g:948:1: ( ( rule__DataSample__FileExtensionAssignment_9_1 ) )
            // InternalDataSampleDSL.g:949:1: ( rule__DataSample__FileExtensionAssignment_9_1 )
            {
             before(grammarAccess.getDataSampleAccess().getFileExtensionAssignment_9_1()); 
            // InternalDataSampleDSL.g:950:1: ( rule__DataSample__FileExtensionAssignment_9_1 )
            // InternalDataSampleDSL.g:950:2: rule__DataSample__FileExtensionAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__FileExtensionAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSampleAccess().getFileExtensionAssignment_9_1()); 

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
    // $ANTLR end "rule__DataSample__Group_9__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalDataSampleDSL.g:964:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:968:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalDataSampleDSL.g:969:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalDataSampleDSL.g:976:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:980:1: ( ( ( '-' )? ) )
            // InternalDataSampleDSL.g:981:1: ( ( '-' )? )
            {
            // InternalDataSampleDSL.g:981:1: ( ( '-' )? )
            // InternalDataSampleDSL.g:982:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalDataSampleDSL.g:983:1: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDataSampleDSL.g:984:2: '-'
                    {
                    match(input,23,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalDataSampleDSL.g:995:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:999:1: ( rule__EInt__Group__1__Impl )
            // InternalDataSampleDSL.g:1000:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalDataSampleDSL.g:1006:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1010:1: ( ( RULE_INT ) )
            // InternalDataSampleDSL.g:1011:1: ( RULE_INT )
            {
            // InternalDataSampleDSL.g:1011:1: ( RULE_INT )
            // InternalDataSampleDSL.g:1012:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__EntityGenerator__Group__0"
    // InternalDataSampleDSL.g:1027:1: rule__EntityGenerator__Group__0 : rule__EntityGenerator__Group__0__Impl rule__EntityGenerator__Group__1 ;
    public final void rule__EntityGenerator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1031:1: ( rule__EntityGenerator__Group__0__Impl rule__EntityGenerator__Group__1 )
            // InternalDataSampleDSL.g:1032:2: rule__EntityGenerator__Group__0__Impl rule__EntityGenerator__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__EntityGenerator__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__Group__1();

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
    // $ANTLR end "rule__EntityGenerator__Group__0"


    // $ANTLR start "rule__EntityGenerator__Group__0__Impl"
    // InternalDataSampleDSL.g:1039:1: rule__EntityGenerator__Group__0__Impl : ( () ) ;
    public final void rule__EntityGenerator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1043:1: ( ( () ) )
            // InternalDataSampleDSL.g:1044:1: ( () )
            {
            // InternalDataSampleDSL.g:1044:1: ( () )
            // InternalDataSampleDSL.g:1045:1: ()
            {
             before(grammarAccess.getEntityGeneratorAccess().getEntityGeneratorAction_0()); 
            // InternalDataSampleDSL.g:1046:1: ()
            // InternalDataSampleDSL.g:1048:1: 
            {
            }

             after(grammarAccess.getEntityGeneratorAccess().getEntityGeneratorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__Group__0__Impl"


    // $ANTLR start "rule__EntityGenerator__Group__1"
    // InternalDataSampleDSL.g:1058:1: rule__EntityGenerator__Group__1 : rule__EntityGenerator__Group__1__Impl rule__EntityGenerator__Group__2 ;
    public final void rule__EntityGenerator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1062:1: ( rule__EntityGenerator__Group__1__Impl rule__EntityGenerator__Group__2 )
            // InternalDataSampleDSL.g:1063:2: rule__EntityGenerator__Group__1__Impl rule__EntityGenerator__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__EntityGenerator__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__Group__2();

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
    // $ANTLR end "rule__EntityGenerator__Group__1"


    // $ANTLR start "rule__EntityGenerator__Group__1__Impl"
    // InternalDataSampleDSL.g:1070:1: rule__EntityGenerator__Group__1__Impl : ( 'generate' ) ;
    public final void rule__EntityGenerator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1074:1: ( ( 'generate' ) )
            // InternalDataSampleDSL.g:1075:1: ( 'generate' )
            {
            // InternalDataSampleDSL.g:1075:1: ( 'generate' )
            // InternalDataSampleDSL.g:1076:1: 'generate'
            {
             before(grammarAccess.getEntityGeneratorAccess().getGenerateKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEntityGeneratorAccess().getGenerateKeyword_1()); 

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
    // $ANTLR end "rule__EntityGenerator__Group__1__Impl"


    // $ANTLR start "rule__EntityGenerator__Group__2"
    // InternalDataSampleDSL.g:1089:1: rule__EntityGenerator__Group__2 : rule__EntityGenerator__Group__2__Impl rule__EntityGenerator__Group__3 ;
    public final void rule__EntityGenerator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1093:1: ( rule__EntityGenerator__Group__2__Impl rule__EntityGenerator__Group__3 )
            // InternalDataSampleDSL.g:1094:2: rule__EntityGenerator__Group__2__Impl rule__EntityGenerator__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__EntityGenerator__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__Group__3();

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
    // $ANTLR end "rule__EntityGenerator__Group__2"


    // $ANTLR start "rule__EntityGenerator__Group__2__Impl"
    // InternalDataSampleDSL.g:1101:1: rule__EntityGenerator__Group__2__Impl : ( ( rule__EntityGenerator__Group_2__0 )? ) ;
    public final void rule__EntityGenerator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1105:1: ( ( ( rule__EntityGenerator__Group_2__0 )? ) )
            // InternalDataSampleDSL.g:1106:1: ( ( rule__EntityGenerator__Group_2__0 )? )
            {
            // InternalDataSampleDSL.g:1106:1: ( ( rule__EntityGenerator__Group_2__0 )? )
            // InternalDataSampleDSL.g:1107:1: ( rule__EntityGenerator__Group_2__0 )?
            {
             before(grammarAccess.getEntityGeneratorAccess().getGroup_2()); 
            // InternalDataSampleDSL.g:1108:1: ( rule__EntityGenerator__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT||LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDataSampleDSL.g:1108:2: rule__EntityGenerator__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__EntityGenerator__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityGeneratorAccess().getGroup_2()); 

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
    // $ANTLR end "rule__EntityGenerator__Group__2__Impl"


    // $ANTLR start "rule__EntityGenerator__Group__3"
    // InternalDataSampleDSL.g:1118:1: rule__EntityGenerator__Group__3 : rule__EntityGenerator__Group__3__Impl rule__EntityGenerator__Group__4 ;
    public final void rule__EntityGenerator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1122:1: ( rule__EntityGenerator__Group__3__Impl rule__EntityGenerator__Group__4 )
            // InternalDataSampleDSL.g:1123:2: rule__EntityGenerator__Group__3__Impl rule__EntityGenerator__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__EntityGenerator__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__Group__4();

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
    // $ANTLR end "rule__EntityGenerator__Group__3"


    // $ANTLR start "rule__EntityGenerator__Group__3__Impl"
    // InternalDataSampleDSL.g:1130:1: rule__EntityGenerator__Group__3__Impl : ( ( rule__EntityGenerator__EntityNameAssignment_3 ) ) ;
    public final void rule__EntityGenerator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1134:1: ( ( ( rule__EntityGenerator__EntityNameAssignment_3 ) ) )
            // InternalDataSampleDSL.g:1135:1: ( ( rule__EntityGenerator__EntityNameAssignment_3 ) )
            {
            // InternalDataSampleDSL.g:1135:1: ( ( rule__EntityGenerator__EntityNameAssignment_3 ) )
            // InternalDataSampleDSL.g:1136:1: ( rule__EntityGenerator__EntityNameAssignment_3 )
            {
             before(grammarAccess.getEntityGeneratorAccess().getEntityNameAssignment_3()); 
            // InternalDataSampleDSL.g:1137:1: ( rule__EntityGenerator__EntityNameAssignment_3 )
            // InternalDataSampleDSL.g:1137:2: rule__EntityGenerator__EntityNameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__EntityNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityGeneratorAccess().getEntityNameAssignment_3()); 

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
    // $ANTLR end "rule__EntityGenerator__Group__3__Impl"


    // $ANTLR start "rule__EntityGenerator__Group__4"
    // InternalDataSampleDSL.g:1147:1: rule__EntityGenerator__Group__4 : rule__EntityGenerator__Group__4__Impl rule__EntityGenerator__Group__5 ;
    public final void rule__EntityGenerator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1151:1: ( rule__EntityGenerator__Group__4__Impl rule__EntityGenerator__Group__5 )
            // InternalDataSampleDSL.g:1152:2: rule__EntityGenerator__Group__4__Impl rule__EntityGenerator__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__EntityGenerator__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__Group__5();

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
    // $ANTLR end "rule__EntityGenerator__Group__4"


    // $ANTLR start "rule__EntityGenerator__Group__4__Impl"
    // InternalDataSampleDSL.g:1159:1: rule__EntityGenerator__Group__4__Impl : ( '{' ) ;
    public final void rule__EntityGenerator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1163:1: ( ( '{' ) )
            // InternalDataSampleDSL.g:1164:1: ( '{' )
            {
            // InternalDataSampleDSL.g:1164:1: ( '{' )
            // InternalDataSampleDSL.g:1165:1: '{'
            {
             before(grammarAccess.getEntityGeneratorAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEntityGeneratorAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__EntityGenerator__Group__4__Impl"


    // $ANTLR start "rule__EntityGenerator__Group__5"
    // InternalDataSampleDSL.g:1178:1: rule__EntityGenerator__Group__5 : rule__EntityGenerator__Group__5__Impl rule__EntityGenerator__Group__6 ;
    public final void rule__EntityGenerator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1182:1: ( rule__EntityGenerator__Group__5__Impl rule__EntityGenerator__Group__6 )
            // InternalDataSampleDSL.g:1183:2: rule__EntityGenerator__Group__5__Impl rule__EntityGenerator__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__EntityGenerator__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__Group__6();

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
    // $ANTLR end "rule__EntityGenerator__Group__5"


    // $ANTLR start "rule__EntityGenerator__Group__5__Impl"
    // InternalDataSampleDSL.g:1190:1: rule__EntityGenerator__Group__5__Impl : ( ( rule__EntityGenerator__FieldGeneratorsAssignment_5 )* ) ;
    public final void rule__EntityGenerator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1194:1: ( ( ( rule__EntityGenerator__FieldGeneratorsAssignment_5 )* ) )
            // InternalDataSampleDSL.g:1195:1: ( ( rule__EntityGenerator__FieldGeneratorsAssignment_5 )* )
            {
            // InternalDataSampleDSL.g:1195:1: ( ( rule__EntityGenerator__FieldGeneratorsAssignment_5 )* )
            // InternalDataSampleDSL.g:1196:1: ( rule__EntityGenerator__FieldGeneratorsAssignment_5 )*
            {
             before(grammarAccess.getEntityGeneratorAccess().getFieldGeneratorsAssignment_5()); 
            // InternalDataSampleDSL.g:1197:1: ( rule__EntityGenerator__FieldGeneratorsAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDataSampleDSL.g:1197:2: rule__EntityGenerator__FieldGeneratorsAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    rule__EntityGenerator__FieldGeneratorsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEntityGeneratorAccess().getFieldGeneratorsAssignment_5()); 

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
    // $ANTLR end "rule__EntityGenerator__Group__5__Impl"


    // $ANTLR start "rule__EntityGenerator__Group__6"
    // InternalDataSampleDSL.g:1207:1: rule__EntityGenerator__Group__6 : rule__EntityGenerator__Group__6__Impl rule__EntityGenerator__Group__7 ;
    public final void rule__EntityGenerator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1211:1: ( rule__EntityGenerator__Group__6__Impl rule__EntityGenerator__Group__7 )
            // InternalDataSampleDSL.g:1212:2: rule__EntityGenerator__Group__6__Impl rule__EntityGenerator__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__EntityGenerator__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__Group__7();

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
    // $ANTLR end "rule__EntityGenerator__Group__6"


    // $ANTLR start "rule__EntityGenerator__Group__6__Impl"
    // InternalDataSampleDSL.g:1219:1: rule__EntityGenerator__Group__6__Impl : ( ( rule__EntityGenerator__ChildGeneratorsAssignment_6 )* ) ;
    public final void rule__EntityGenerator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1223:1: ( ( ( rule__EntityGenerator__ChildGeneratorsAssignment_6 )* ) )
            // InternalDataSampleDSL.g:1224:1: ( ( rule__EntityGenerator__ChildGeneratorsAssignment_6 )* )
            {
            // InternalDataSampleDSL.g:1224:1: ( ( rule__EntityGenerator__ChildGeneratorsAssignment_6 )* )
            // InternalDataSampleDSL.g:1225:1: ( rule__EntityGenerator__ChildGeneratorsAssignment_6 )*
            {
             before(grammarAccess.getEntityGeneratorAccess().getChildGeneratorsAssignment_6()); 
            // InternalDataSampleDSL.g:1226:1: ( rule__EntityGenerator__ChildGeneratorsAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDataSampleDSL.g:1226:2: rule__EntityGenerator__ChildGeneratorsAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    rule__EntityGenerator__ChildGeneratorsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getEntityGeneratorAccess().getChildGeneratorsAssignment_6()); 

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
    // $ANTLR end "rule__EntityGenerator__Group__6__Impl"


    // $ANTLR start "rule__EntityGenerator__Group__7"
    // InternalDataSampleDSL.g:1236:1: rule__EntityGenerator__Group__7 : rule__EntityGenerator__Group__7__Impl rule__EntityGenerator__Group__8 ;
    public final void rule__EntityGenerator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1240:1: ( rule__EntityGenerator__Group__7__Impl rule__EntityGenerator__Group__8 )
            // InternalDataSampleDSL.g:1241:2: rule__EntityGenerator__Group__7__Impl rule__EntityGenerator__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__EntityGenerator__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__Group__8();

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
    // $ANTLR end "rule__EntityGenerator__Group__7"


    // $ANTLR start "rule__EntityGenerator__Group__7__Impl"
    // InternalDataSampleDSL.g:1248:1: rule__EntityGenerator__Group__7__Impl : ( ( rule__EntityGenerator__AssociationGeneratorsAssignment_7 )* ) ;
    public final void rule__EntityGenerator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1252:1: ( ( ( rule__EntityGenerator__AssociationGeneratorsAssignment_7 )* ) )
            // InternalDataSampleDSL.g:1253:1: ( ( rule__EntityGenerator__AssociationGeneratorsAssignment_7 )* )
            {
            // InternalDataSampleDSL.g:1253:1: ( ( rule__EntityGenerator__AssociationGeneratorsAssignment_7 )* )
            // InternalDataSampleDSL.g:1254:1: ( rule__EntityGenerator__AssociationGeneratorsAssignment_7 )*
            {
             before(grammarAccess.getEntityGeneratorAccess().getAssociationGeneratorsAssignment_7()); 
            // InternalDataSampleDSL.g:1255:1: ( rule__EntityGenerator__AssociationGeneratorsAssignment_7 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==37) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDataSampleDSL.g:1255:2: rule__EntityGenerator__AssociationGeneratorsAssignment_7
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__EntityGenerator__AssociationGeneratorsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getEntityGeneratorAccess().getAssociationGeneratorsAssignment_7()); 

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
    // $ANTLR end "rule__EntityGenerator__Group__7__Impl"


    // $ANTLR start "rule__EntityGenerator__Group__8"
    // InternalDataSampleDSL.g:1265:1: rule__EntityGenerator__Group__8 : rule__EntityGenerator__Group__8__Impl ;
    public final void rule__EntityGenerator__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1269:1: ( rule__EntityGenerator__Group__8__Impl )
            // InternalDataSampleDSL.g:1270:2: rule__EntityGenerator__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__Group__8__Impl();

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
    // $ANTLR end "rule__EntityGenerator__Group__8"


    // $ANTLR start "rule__EntityGenerator__Group__8__Impl"
    // InternalDataSampleDSL.g:1276:1: rule__EntityGenerator__Group__8__Impl : ( '}' ) ;
    public final void rule__EntityGenerator__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1280:1: ( ( '}' ) )
            // InternalDataSampleDSL.g:1281:1: ( '}' )
            {
            // InternalDataSampleDSL.g:1281:1: ( '}' )
            // InternalDataSampleDSL.g:1282:1: '}'
            {
             before(grammarAccess.getEntityGeneratorAccess().getRightCurlyBracketKeyword_8()); 
            match(input,26,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEntityGeneratorAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__EntityGenerator__Group__8__Impl"


    // $ANTLR start "rule__EntityGenerator__Group_2__0"
    // InternalDataSampleDSL.g:1313:1: rule__EntityGenerator__Group_2__0 : rule__EntityGenerator__Group_2__0__Impl rule__EntityGenerator__Group_2__1 ;
    public final void rule__EntityGenerator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1317:1: ( rule__EntityGenerator__Group_2__0__Impl rule__EntityGenerator__Group_2__1 )
            // InternalDataSampleDSL.g:1318:2: rule__EntityGenerator__Group_2__0__Impl rule__EntityGenerator__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__EntityGenerator__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__Group_2__1();

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
    // $ANTLR end "rule__EntityGenerator__Group_2__0"


    // $ANTLR start "rule__EntityGenerator__Group_2__0__Impl"
    // InternalDataSampleDSL.g:1325:1: rule__EntityGenerator__Group_2__0__Impl : ( ( rule__EntityGenerator__NumberAssignment_2_0 ) ) ;
    public final void rule__EntityGenerator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1329:1: ( ( ( rule__EntityGenerator__NumberAssignment_2_0 ) ) )
            // InternalDataSampleDSL.g:1330:1: ( ( rule__EntityGenerator__NumberAssignment_2_0 ) )
            {
            // InternalDataSampleDSL.g:1330:1: ( ( rule__EntityGenerator__NumberAssignment_2_0 ) )
            // InternalDataSampleDSL.g:1331:1: ( rule__EntityGenerator__NumberAssignment_2_0 )
            {
             before(grammarAccess.getEntityGeneratorAccess().getNumberAssignment_2_0()); 
            // InternalDataSampleDSL.g:1332:1: ( rule__EntityGenerator__NumberAssignment_2_0 )
            // InternalDataSampleDSL.g:1332:2: rule__EntityGenerator__NumberAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__NumberAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityGeneratorAccess().getNumberAssignment_2_0()); 

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
    // $ANTLR end "rule__EntityGenerator__Group_2__0__Impl"


    // $ANTLR start "rule__EntityGenerator__Group_2__1"
    // InternalDataSampleDSL.g:1342:1: rule__EntityGenerator__Group_2__1 : rule__EntityGenerator__Group_2__1__Impl ;
    public final void rule__EntityGenerator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1346:1: ( rule__EntityGenerator__Group_2__1__Impl )
            // InternalDataSampleDSL.g:1347:2: rule__EntityGenerator__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__Group_2__1__Impl();

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
    // $ANTLR end "rule__EntityGenerator__Group_2__1"


    // $ANTLR start "rule__EntityGenerator__Group_2__1__Impl"
    // InternalDataSampleDSL.g:1353:1: rule__EntityGenerator__Group_2__1__Impl : ( 'instancesOf' ) ;
    public final void rule__EntityGenerator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1357:1: ( ( 'instancesOf' ) )
            // InternalDataSampleDSL.g:1358:1: ( 'instancesOf' )
            {
            // InternalDataSampleDSL.g:1358:1: ( 'instancesOf' )
            // InternalDataSampleDSL.g:1359:1: 'instancesOf'
            {
             before(grammarAccess.getEntityGeneratorAccess().getInstancesOfKeyword_2_1()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEntityGeneratorAccess().getInstancesOfKeyword_2_1()); 

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
    // $ANTLR end "rule__EntityGenerator__Group_2__1__Impl"


    // $ANTLR start "rule__FieldGenerator__Group__0"
    // InternalDataSampleDSL.g:1376:1: rule__FieldGenerator__Group__0 : rule__FieldGenerator__Group__0__Impl rule__FieldGenerator__Group__1 ;
    public final void rule__FieldGenerator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1380:1: ( rule__FieldGenerator__Group__0__Impl rule__FieldGenerator__Group__1 )
            // InternalDataSampleDSL.g:1381:2: rule__FieldGenerator__Group__0__Impl rule__FieldGenerator__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__FieldGenerator__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group__1();

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
    // $ANTLR end "rule__FieldGenerator__Group__0"


    // $ANTLR start "rule__FieldGenerator__Group__0__Impl"
    // InternalDataSampleDSL.g:1388:1: rule__FieldGenerator__Group__0__Impl : ( () ) ;
    public final void rule__FieldGenerator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1392:1: ( ( () ) )
            // InternalDataSampleDSL.g:1393:1: ( () )
            {
            // InternalDataSampleDSL.g:1393:1: ( () )
            // InternalDataSampleDSL.g:1394:1: ()
            {
             before(grammarAccess.getFieldGeneratorAccess().getFieldGeneratorAction_0()); 
            // InternalDataSampleDSL.g:1395:1: ()
            // InternalDataSampleDSL.g:1397:1: 
            {
            }

             after(grammarAccess.getFieldGeneratorAccess().getFieldGeneratorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group__0__Impl"


    // $ANTLR start "rule__FieldGenerator__Group__1"
    // InternalDataSampleDSL.g:1407:1: rule__FieldGenerator__Group__1 : rule__FieldGenerator__Group__1__Impl rule__FieldGenerator__Group__2 ;
    public final void rule__FieldGenerator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1411:1: ( rule__FieldGenerator__Group__1__Impl rule__FieldGenerator__Group__2 )
            // InternalDataSampleDSL.g:1412:2: rule__FieldGenerator__Group__1__Impl rule__FieldGenerator__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__FieldGenerator__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group__2();

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
    // $ANTLR end "rule__FieldGenerator__Group__1"


    // $ANTLR start "rule__FieldGenerator__Group__1__Impl"
    // InternalDataSampleDSL.g:1419:1: rule__FieldGenerator__Group__1__Impl : ( 'forTheField' ) ;
    public final void rule__FieldGenerator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1423:1: ( ( 'forTheField' ) )
            // InternalDataSampleDSL.g:1424:1: ( 'forTheField' )
            {
            // InternalDataSampleDSL.g:1424:1: ( 'forTheField' )
            // InternalDataSampleDSL.g:1425:1: 'forTheField'
            {
             before(grammarAccess.getFieldGeneratorAccess().getForTheFieldKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldGeneratorAccess().getForTheFieldKeyword_1()); 

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
    // $ANTLR end "rule__FieldGenerator__Group__1__Impl"


    // $ANTLR start "rule__FieldGenerator__Group__2"
    // InternalDataSampleDSL.g:1438:1: rule__FieldGenerator__Group__2 : rule__FieldGenerator__Group__2__Impl rule__FieldGenerator__Group__3 ;
    public final void rule__FieldGenerator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1442:1: ( rule__FieldGenerator__Group__2__Impl rule__FieldGenerator__Group__3 )
            // InternalDataSampleDSL.g:1443:2: rule__FieldGenerator__Group__2__Impl rule__FieldGenerator__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__FieldGenerator__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group__3();

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
    // $ANTLR end "rule__FieldGenerator__Group__2"


    // $ANTLR start "rule__FieldGenerator__Group__2__Impl"
    // InternalDataSampleDSL.g:1450:1: rule__FieldGenerator__Group__2__Impl : ( ( rule__FieldGenerator__FieldNameAssignment_2 ) ) ;
    public final void rule__FieldGenerator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1454:1: ( ( ( rule__FieldGenerator__FieldNameAssignment_2 ) ) )
            // InternalDataSampleDSL.g:1455:1: ( ( rule__FieldGenerator__FieldNameAssignment_2 ) )
            {
            // InternalDataSampleDSL.g:1455:1: ( ( rule__FieldGenerator__FieldNameAssignment_2 ) )
            // InternalDataSampleDSL.g:1456:1: ( rule__FieldGenerator__FieldNameAssignment_2 )
            {
             before(grammarAccess.getFieldGeneratorAccess().getFieldNameAssignment_2()); 
            // InternalDataSampleDSL.g:1457:1: ( rule__FieldGenerator__FieldNameAssignment_2 )
            // InternalDataSampleDSL.g:1457:2: rule__FieldGenerator__FieldNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__FieldNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldGeneratorAccess().getFieldNameAssignment_2()); 

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
    // $ANTLR end "rule__FieldGenerator__Group__2__Impl"


    // $ANTLR start "rule__FieldGenerator__Group__3"
    // InternalDataSampleDSL.g:1467:1: rule__FieldGenerator__Group__3 : rule__FieldGenerator__Group__3__Impl rule__FieldGenerator__Group__4 ;
    public final void rule__FieldGenerator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1471:1: ( rule__FieldGenerator__Group__3__Impl rule__FieldGenerator__Group__4 )
            // InternalDataSampleDSL.g:1472:2: rule__FieldGenerator__Group__3__Impl rule__FieldGenerator__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__FieldGenerator__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group__4();

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
    // $ANTLR end "rule__FieldGenerator__Group__3"


    // $ANTLR start "rule__FieldGenerator__Group__3__Impl"
    // InternalDataSampleDSL.g:1479:1: rule__FieldGenerator__Group__3__Impl : ( 'use' ) ;
    public final void rule__FieldGenerator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1483:1: ( ( 'use' ) )
            // InternalDataSampleDSL.g:1484:1: ( 'use' )
            {
            // InternalDataSampleDSL.g:1484:1: ( 'use' )
            // InternalDataSampleDSL.g:1485:1: 'use'
            {
             before(grammarAccess.getFieldGeneratorAccess().getUseKeyword_3()); 
            match(input,29,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldGeneratorAccess().getUseKeyword_3()); 

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
    // $ANTLR end "rule__FieldGenerator__Group__3__Impl"


    // $ANTLR start "rule__FieldGenerator__Group__4"
    // InternalDataSampleDSL.g:1498:1: rule__FieldGenerator__Group__4 : rule__FieldGenerator__Group__4__Impl rule__FieldGenerator__Group__5 ;
    public final void rule__FieldGenerator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1502:1: ( rule__FieldGenerator__Group__4__Impl rule__FieldGenerator__Group__5 )
            // InternalDataSampleDSL.g:1503:2: rule__FieldGenerator__Group__4__Impl rule__FieldGenerator__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__FieldGenerator__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group__5();

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
    // $ANTLR end "rule__FieldGenerator__Group__4"


    // $ANTLR start "rule__FieldGenerator__Group__4__Impl"
    // InternalDataSampleDSL.g:1510:1: rule__FieldGenerator__Group__4__Impl : ( ( rule__FieldGenerator__GeneratorNameAssignment_4 ) ) ;
    public final void rule__FieldGenerator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1514:1: ( ( ( rule__FieldGenerator__GeneratorNameAssignment_4 ) ) )
            // InternalDataSampleDSL.g:1515:1: ( ( rule__FieldGenerator__GeneratorNameAssignment_4 ) )
            {
            // InternalDataSampleDSL.g:1515:1: ( ( rule__FieldGenerator__GeneratorNameAssignment_4 ) )
            // InternalDataSampleDSL.g:1516:1: ( rule__FieldGenerator__GeneratorNameAssignment_4 )
            {
             before(grammarAccess.getFieldGeneratorAccess().getGeneratorNameAssignment_4()); 
            // InternalDataSampleDSL.g:1517:1: ( rule__FieldGenerator__GeneratorNameAssignment_4 )
            // InternalDataSampleDSL.g:1517:2: rule__FieldGenerator__GeneratorNameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__GeneratorNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFieldGeneratorAccess().getGeneratorNameAssignment_4()); 

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
    // $ANTLR end "rule__FieldGenerator__Group__4__Impl"


    // $ANTLR start "rule__FieldGenerator__Group__5"
    // InternalDataSampleDSL.g:1527:1: rule__FieldGenerator__Group__5 : rule__FieldGenerator__Group__5__Impl rule__FieldGenerator__Group__6 ;
    public final void rule__FieldGenerator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1531:1: ( rule__FieldGenerator__Group__5__Impl rule__FieldGenerator__Group__6 )
            // InternalDataSampleDSL.g:1532:2: rule__FieldGenerator__Group__5__Impl rule__FieldGenerator__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__FieldGenerator__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group__6();

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
    // $ANTLR end "rule__FieldGenerator__Group__5"


    // $ANTLR start "rule__FieldGenerator__Group__5__Impl"
    // InternalDataSampleDSL.g:1539:1: rule__FieldGenerator__Group__5__Impl : ( ( rule__FieldGenerator__Group_5__0 )? ) ;
    public final void rule__FieldGenerator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1543:1: ( ( ( rule__FieldGenerator__Group_5__0 )? ) )
            // InternalDataSampleDSL.g:1544:1: ( ( rule__FieldGenerator__Group_5__0 )? )
            {
            // InternalDataSampleDSL.g:1544:1: ( ( rule__FieldGenerator__Group_5__0 )? )
            // InternalDataSampleDSL.g:1545:1: ( rule__FieldGenerator__Group_5__0 )?
            {
             before(grammarAccess.getFieldGeneratorAccess().getGroup_5()); 
            // InternalDataSampleDSL.g:1546:1: ( rule__FieldGenerator__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDataSampleDSL.g:1546:2: rule__FieldGenerator__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__FieldGenerator__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldGeneratorAccess().getGroup_5()); 

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
    // $ANTLR end "rule__FieldGenerator__Group__5__Impl"


    // $ANTLR start "rule__FieldGenerator__Group__6"
    // InternalDataSampleDSL.g:1556:1: rule__FieldGenerator__Group__6 : rule__FieldGenerator__Group__6__Impl rule__FieldGenerator__Group__7 ;
    public final void rule__FieldGenerator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1560:1: ( rule__FieldGenerator__Group__6__Impl rule__FieldGenerator__Group__7 )
            // InternalDataSampleDSL.g:1561:2: rule__FieldGenerator__Group__6__Impl rule__FieldGenerator__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__FieldGenerator__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group__7();

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
    // $ANTLR end "rule__FieldGenerator__Group__6"


    // $ANTLR start "rule__FieldGenerator__Group__6__Impl"
    // InternalDataSampleDSL.g:1568:1: rule__FieldGenerator__Group__6__Impl : ( ( rule__FieldGenerator__Group_6__0 )? ) ;
    public final void rule__FieldGenerator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1572:1: ( ( ( rule__FieldGenerator__Group_6__0 )? ) )
            // InternalDataSampleDSL.g:1573:1: ( ( rule__FieldGenerator__Group_6__0 )? )
            {
            // InternalDataSampleDSL.g:1573:1: ( ( rule__FieldGenerator__Group_6__0 )? )
            // InternalDataSampleDSL.g:1574:1: ( rule__FieldGenerator__Group_6__0 )?
            {
             before(grammarAccess.getFieldGeneratorAccess().getGroup_6()); 
            // InternalDataSampleDSL.g:1575:1: ( rule__FieldGenerator__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDataSampleDSL.g:1575:2: rule__FieldGenerator__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__FieldGenerator__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldGeneratorAccess().getGroup_6()); 

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
    // $ANTLR end "rule__FieldGenerator__Group__6__Impl"


    // $ANTLR start "rule__FieldGenerator__Group__7"
    // InternalDataSampleDSL.g:1585:1: rule__FieldGenerator__Group__7 : rule__FieldGenerator__Group__7__Impl ;
    public final void rule__FieldGenerator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1589:1: ( rule__FieldGenerator__Group__7__Impl )
            // InternalDataSampleDSL.g:1590:2: rule__FieldGenerator__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group__7__Impl();

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
    // $ANTLR end "rule__FieldGenerator__Group__7"


    // $ANTLR start "rule__FieldGenerator__Group__7__Impl"
    // InternalDataSampleDSL.g:1596:1: rule__FieldGenerator__Group__7__Impl : ( ( rule__FieldGenerator__Group_7__0 )? ) ;
    public final void rule__FieldGenerator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1600:1: ( ( ( rule__FieldGenerator__Group_7__0 )? ) )
            // InternalDataSampleDSL.g:1601:1: ( ( rule__FieldGenerator__Group_7__0 )? )
            {
            // InternalDataSampleDSL.g:1601:1: ( ( rule__FieldGenerator__Group_7__0 )? )
            // InternalDataSampleDSL.g:1602:1: ( rule__FieldGenerator__Group_7__0 )?
            {
             before(grammarAccess.getFieldGeneratorAccess().getGroup_7()); 
            // InternalDataSampleDSL.g:1603:1: ( rule__FieldGenerator__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDataSampleDSL.g:1603:2: rule__FieldGenerator__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__FieldGenerator__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldGeneratorAccess().getGroup_7()); 

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
    // $ANTLR end "rule__FieldGenerator__Group__7__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_5__0"
    // InternalDataSampleDSL.g:1629:1: rule__FieldGenerator__Group_5__0 : rule__FieldGenerator__Group_5__0__Impl rule__FieldGenerator__Group_5__1 ;
    public final void rule__FieldGenerator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1633:1: ( rule__FieldGenerator__Group_5__0__Impl rule__FieldGenerator__Group_5__1 )
            // InternalDataSampleDSL.g:1634:2: rule__FieldGenerator__Group_5__0__Impl rule__FieldGenerator__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__FieldGenerator__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_5__1();

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
    // $ANTLR end "rule__FieldGenerator__Group_5__0"


    // $ANTLR start "rule__FieldGenerator__Group_5__0__Impl"
    // InternalDataSampleDSL.g:1641:1: rule__FieldGenerator__Group_5__0__Impl : ( 'cardinality' ) ;
    public final void rule__FieldGenerator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1645:1: ( ( 'cardinality' ) )
            // InternalDataSampleDSL.g:1646:1: ( 'cardinality' )
            {
            // InternalDataSampleDSL.g:1646:1: ( 'cardinality' )
            // InternalDataSampleDSL.g:1647:1: 'cardinality'
            {
             before(grammarAccess.getFieldGeneratorAccess().getCardinalityKeyword_5_0()); 
            match(input,30,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldGeneratorAccess().getCardinalityKeyword_5_0()); 

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
    // $ANTLR end "rule__FieldGenerator__Group_5__0__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_5__1"
    // InternalDataSampleDSL.g:1660:1: rule__FieldGenerator__Group_5__1 : rule__FieldGenerator__Group_5__1__Impl ;
    public final void rule__FieldGenerator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1664:1: ( rule__FieldGenerator__Group_5__1__Impl )
            // InternalDataSampleDSL.g:1665:2: rule__FieldGenerator__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_5__1__Impl();

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
    // $ANTLR end "rule__FieldGenerator__Group_5__1"


    // $ANTLR start "rule__FieldGenerator__Group_5__1__Impl"
    // InternalDataSampleDSL.g:1671:1: rule__FieldGenerator__Group_5__1__Impl : ( ( rule__FieldGenerator__NumberAssignment_5_1 ) ) ;
    public final void rule__FieldGenerator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1675:1: ( ( ( rule__FieldGenerator__NumberAssignment_5_1 ) ) )
            // InternalDataSampleDSL.g:1676:1: ( ( rule__FieldGenerator__NumberAssignment_5_1 ) )
            {
            // InternalDataSampleDSL.g:1676:1: ( ( rule__FieldGenerator__NumberAssignment_5_1 ) )
            // InternalDataSampleDSL.g:1677:1: ( rule__FieldGenerator__NumberAssignment_5_1 )
            {
             before(grammarAccess.getFieldGeneratorAccess().getNumberAssignment_5_1()); 
            // InternalDataSampleDSL.g:1678:1: ( rule__FieldGenerator__NumberAssignment_5_1 )
            // InternalDataSampleDSL.g:1678:2: rule__FieldGenerator__NumberAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__NumberAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldGeneratorAccess().getNumberAssignment_5_1()); 

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
    // $ANTLR end "rule__FieldGenerator__Group_5__1__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_6__0"
    // InternalDataSampleDSL.g:1692:1: rule__FieldGenerator__Group_6__0 : rule__FieldGenerator__Group_6__0__Impl rule__FieldGenerator__Group_6__1 ;
    public final void rule__FieldGenerator__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1696:1: ( rule__FieldGenerator__Group_6__0__Impl rule__FieldGenerator__Group_6__1 )
            // InternalDataSampleDSL.g:1697:2: rule__FieldGenerator__Group_6__0__Impl rule__FieldGenerator__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__FieldGenerator__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_6__1();

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
    // $ANTLR end "rule__FieldGenerator__Group_6__0"


    // $ANTLR start "rule__FieldGenerator__Group_6__0__Impl"
    // InternalDataSampleDSL.g:1704:1: rule__FieldGenerator__Group_6__0__Impl : ( '(' ) ;
    public final void rule__FieldGenerator__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1708:1: ( ( '(' ) )
            // InternalDataSampleDSL.g:1709:1: ( '(' )
            {
            // InternalDataSampleDSL.g:1709:1: ( '(' )
            // InternalDataSampleDSL.g:1710:1: '('
            {
             before(grammarAccess.getFieldGeneratorAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,31,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldGeneratorAccess().getLeftParenthesisKeyword_6_0()); 

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
    // $ANTLR end "rule__FieldGenerator__Group_6__0__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_6__1"
    // InternalDataSampleDSL.g:1723:1: rule__FieldGenerator__Group_6__1 : rule__FieldGenerator__Group_6__1__Impl rule__FieldGenerator__Group_6__2 ;
    public final void rule__FieldGenerator__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1727:1: ( rule__FieldGenerator__Group_6__1__Impl rule__FieldGenerator__Group_6__2 )
            // InternalDataSampleDSL.g:1728:2: rule__FieldGenerator__Group_6__1__Impl rule__FieldGenerator__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__FieldGenerator__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_6__2();

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
    // $ANTLR end "rule__FieldGenerator__Group_6__1"


    // $ANTLR start "rule__FieldGenerator__Group_6__1__Impl"
    // InternalDataSampleDSL.g:1735:1: rule__FieldGenerator__Group_6__1__Impl : ( ( rule__FieldGenerator__ParametersAssignment_6_1 ) ) ;
    public final void rule__FieldGenerator__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1739:1: ( ( ( rule__FieldGenerator__ParametersAssignment_6_1 ) ) )
            // InternalDataSampleDSL.g:1740:1: ( ( rule__FieldGenerator__ParametersAssignment_6_1 ) )
            {
            // InternalDataSampleDSL.g:1740:1: ( ( rule__FieldGenerator__ParametersAssignment_6_1 ) )
            // InternalDataSampleDSL.g:1741:1: ( rule__FieldGenerator__ParametersAssignment_6_1 )
            {
             before(grammarAccess.getFieldGeneratorAccess().getParametersAssignment_6_1()); 
            // InternalDataSampleDSL.g:1742:1: ( rule__FieldGenerator__ParametersAssignment_6_1 )
            // InternalDataSampleDSL.g:1742:2: rule__FieldGenerator__ParametersAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__ParametersAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldGeneratorAccess().getParametersAssignment_6_1()); 

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
    // $ANTLR end "rule__FieldGenerator__Group_6__1__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_6__2"
    // InternalDataSampleDSL.g:1752:1: rule__FieldGenerator__Group_6__2 : rule__FieldGenerator__Group_6__2__Impl rule__FieldGenerator__Group_6__3 ;
    public final void rule__FieldGenerator__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1756:1: ( rule__FieldGenerator__Group_6__2__Impl rule__FieldGenerator__Group_6__3 )
            // InternalDataSampleDSL.g:1757:2: rule__FieldGenerator__Group_6__2__Impl rule__FieldGenerator__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__FieldGenerator__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_6__3();

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
    // $ANTLR end "rule__FieldGenerator__Group_6__2"


    // $ANTLR start "rule__FieldGenerator__Group_6__2__Impl"
    // InternalDataSampleDSL.g:1764:1: rule__FieldGenerator__Group_6__2__Impl : ( ( rule__FieldGenerator__Group_6_2__0 )* ) ;
    public final void rule__FieldGenerator__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1768:1: ( ( ( rule__FieldGenerator__Group_6_2__0 )* ) )
            // InternalDataSampleDSL.g:1769:1: ( ( rule__FieldGenerator__Group_6_2__0 )* )
            {
            // InternalDataSampleDSL.g:1769:1: ( ( rule__FieldGenerator__Group_6_2__0 )* )
            // InternalDataSampleDSL.g:1770:1: ( rule__FieldGenerator__Group_6_2__0 )*
            {
             before(grammarAccess.getFieldGeneratorAccess().getGroup_6_2()); 
            // InternalDataSampleDSL.g:1771:1: ( rule__FieldGenerator__Group_6_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDataSampleDSL.g:1771:2: rule__FieldGenerator__Group_6_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    rule__FieldGenerator__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getFieldGeneratorAccess().getGroup_6_2()); 

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
    // $ANTLR end "rule__FieldGenerator__Group_6__2__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_6__3"
    // InternalDataSampleDSL.g:1781:1: rule__FieldGenerator__Group_6__3 : rule__FieldGenerator__Group_6__3__Impl ;
    public final void rule__FieldGenerator__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1785:1: ( rule__FieldGenerator__Group_6__3__Impl )
            // InternalDataSampleDSL.g:1786:2: rule__FieldGenerator__Group_6__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_6__3__Impl();

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
    // $ANTLR end "rule__FieldGenerator__Group_6__3"


    // $ANTLR start "rule__FieldGenerator__Group_6__3__Impl"
    // InternalDataSampleDSL.g:1792:1: rule__FieldGenerator__Group_6__3__Impl : ( ')' ) ;
    public final void rule__FieldGenerator__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1796:1: ( ( ')' ) )
            // InternalDataSampleDSL.g:1797:1: ( ')' )
            {
            // InternalDataSampleDSL.g:1797:1: ( ')' )
            // InternalDataSampleDSL.g:1798:1: ')'
            {
             before(grammarAccess.getFieldGeneratorAccess().getRightParenthesisKeyword_6_3()); 
            match(input,32,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldGeneratorAccess().getRightParenthesisKeyword_6_3()); 

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
    // $ANTLR end "rule__FieldGenerator__Group_6__3__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_6_2__0"
    // InternalDataSampleDSL.g:1819:1: rule__FieldGenerator__Group_6_2__0 : rule__FieldGenerator__Group_6_2__0__Impl rule__FieldGenerator__Group_6_2__1 ;
    public final void rule__FieldGenerator__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1823:1: ( rule__FieldGenerator__Group_6_2__0__Impl rule__FieldGenerator__Group_6_2__1 )
            // InternalDataSampleDSL.g:1824:2: rule__FieldGenerator__Group_6_2__0__Impl rule__FieldGenerator__Group_6_2__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__FieldGenerator__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_6_2__1();

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
    // $ANTLR end "rule__FieldGenerator__Group_6_2__0"


    // $ANTLR start "rule__FieldGenerator__Group_6_2__0__Impl"
    // InternalDataSampleDSL.g:1831:1: rule__FieldGenerator__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__FieldGenerator__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1835:1: ( ( ',' ) )
            // InternalDataSampleDSL.g:1836:1: ( ',' )
            {
            // InternalDataSampleDSL.g:1836:1: ( ',' )
            // InternalDataSampleDSL.g:1837:1: ','
            {
             before(grammarAccess.getFieldGeneratorAccess().getCommaKeyword_6_2_0()); 
            match(input,33,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldGeneratorAccess().getCommaKeyword_6_2_0()); 

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
    // $ANTLR end "rule__FieldGenerator__Group_6_2__0__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_6_2__1"
    // InternalDataSampleDSL.g:1850:1: rule__FieldGenerator__Group_6_2__1 : rule__FieldGenerator__Group_6_2__1__Impl ;
    public final void rule__FieldGenerator__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1854:1: ( rule__FieldGenerator__Group_6_2__1__Impl )
            // InternalDataSampleDSL.g:1855:2: rule__FieldGenerator__Group_6_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_6_2__1__Impl();

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
    // $ANTLR end "rule__FieldGenerator__Group_6_2__1"


    // $ANTLR start "rule__FieldGenerator__Group_6_2__1__Impl"
    // InternalDataSampleDSL.g:1861:1: rule__FieldGenerator__Group_6_2__1__Impl : ( ( rule__FieldGenerator__ParametersAssignment_6_2_1 ) ) ;
    public final void rule__FieldGenerator__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1865:1: ( ( ( rule__FieldGenerator__ParametersAssignment_6_2_1 ) ) )
            // InternalDataSampleDSL.g:1866:1: ( ( rule__FieldGenerator__ParametersAssignment_6_2_1 ) )
            {
            // InternalDataSampleDSL.g:1866:1: ( ( rule__FieldGenerator__ParametersAssignment_6_2_1 ) )
            // InternalDataSampleDSL.g:1867:1: ( rule__FieldGenerator__ParametersAssignment_6_2_1 )
            {
             before(grammarAccess.getFieldGeneratorAccess().getParametersAssignment_6_2_1()); 
            // InternalDataSampleDSL.g:1868:1: ( rule__FieldGenerator__ParametersAssignment_6_2_1 )
            // InternalDataSampleDSL.g:1868:2: rule__FieldGenerator__ParametersAssignment_6_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__ParametersAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldGeneratorAccess().getParametersAssignment_6_2_1()); 

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
    // $ANTLR end "rule__FieldGenerator__Group_6_2__1__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_7__0"
    // InternalDataSampleDSL.g:1882:1: rule__FieldGenerator__Group_7__0 : rule__FieldGenerator__Group_7__0__Impl rule__FieldGenerator__Group_7__1 ;
    public final void rule__FieldGenerator__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1886:1: ( rule__FieldGenerator__Group_7__0__Impl rule__FieldGenerator__Group_7__1 )
            // InternalDataSampleDSL.g:1887:2: rule__FieldGenerator__Group_7__0__Impl rule__FieldGenerator__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__FieldGenerator__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_7__1();

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
    // $ANTLR end "rule__FieldGenerator__Group_7__0"


    // $ANTLR start "rule__FieldGenerator__Group_7__0__Impl"
    // InternalDataSampleDSL.g:1894:1: rule__FieldGenerator__Group_7__0__Impl : ( 'withErrorRate=' ) ;
    public final void rule__FieldGenerator__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1898:1: ( ( 'withErrorRate=' ) )
            // InternalDataSampleDSL.g:1899:1: ( 'withErrorRate=' )
            {
            // InternalDataSampleDSL.g:1899:1: ( 'withErrorRate=' )
            // InternalDataSampleDSL.g:1900:1: 'withErrorRate='
            {
             before(grammarAccess.getFieldGeneratorAccess().getWithErrorRateKeyword_7_0()); 
            match(input,34,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldGeneratorAccess().getWithErrorRateKeyword_7_0()); 

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
    // $ANTLR end "rule__FieldGenerator__Group_7__0__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_7__1"
    // InternalDataSampleDSL.g:1913:1: rule__FieldGenerator__Group_7__1 : rule__FieldGenerator__Group_7__1__Impl rule__FieldGenerator__Group_7__2 ;
    public final void rule__FieldGenerator__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1917:1: ( rule__FieldGenerator__Group_7__1__Impl rule__FieldGenerator__Group_7__2 )
            // InternalDataSampleDSL.g:1918:2: rule__FieldGenerator__Group_7__1__Impl rule__FieldGenerator__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__FieldGenerator__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_7__2();

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
    // $ANTLR end "rule__FieldGenerator__Group_7__1"


    // $ANTLR start "rule__FieldGenerator__Group_7__1__Impl"
    // InternalDataSampleDSL.g:1925:1: rule__FieldGenerator__Group_7__1__Impl : ( ( rule__FieldGenerator__ErrorRateAssignment_7_1 ) ) ;
    public final void rule__FieldGenerator__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1929:1: ( ( ( rule__FieldGenerator__ErrorRateAssignment_7_1 ) ) )
            // InternalDataSampleDSL.g:1930:1: ( ( rule__FieldGenerator__ErrorRateAssignment_7_1 ) )
            {
            // InternalDataSampleDSL.g:1930:1: ( ( rule__FieldGenerator__ErrorRateAssignment_7_1 ) )
            // InternalDataSampleDSL.g:1931:1: ( rule__FieldGenerator__ErrorRateAssignment_7_1 )
            {
             before(grammarAccess.getFieldGeneratorAccess().getErrorRateAssignment_7_1()); 
            // InternalDataSampleDSL.g:1932:1: ( rule__FieldGenerator__ErrorRateAssignment_7_1 )
            // InternalDataSampleDSL.g:1932:2: rule__FieldGenerator__ErrorRateAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__ErrorRateAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldGeneratorAccess().getErrorRateAssignment_7_1()); 

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
    // $ANTLR end "rule__FieldGenerator__Group_7__1__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_7__2"
    // InternalDataSampleDSL.g:1942:1: rule__FieldGenerator__Group_7__2 : rule__FieldGenerator__Group_7__2__Impl rule__FieldGenerator__Group_7__3 ;
    public final void rule__FieldGenerator__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1946:1: ( rule__FieldGenerator__Group_7__2__Impl rule__FieldGenerator__Group_7__3 )
            // InternalDataSampleDSL.g:1947:2: rule__FieldGenerator__Group_7__2__Impl rule__FieldGenerator__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__FieldGenerator__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_7__3();

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
    // $ANTLR end "rule__FieldGenerator__Group_7__2"


    // $ANTLR start "rule__FieldGenerator__Group_7__2__Impl"
    // InternalDataSampleDSL.g:1954:1: rule__FieldGenerator__Group_7__2__Impl : ( 'generatedWith' ) ;
    public final void rule__FieldGenerator__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1958:1: ( ( 'generatedWith' ) )
            // InternalDataSampleDSL.g:1959:1: ( 'generatedWith' )
            {
            // InternalDataSampleDSL.g:1959:1: ( 'generatedWith' )
            // InternalDataSampleDSL.g:1960:1: 'generatedWith'
            {
             before(grammarAccess.getFieldGeneratorAccess().getGeneratedWithKeyword_7_2()); 
            match(input,35,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldGeneratorAccess().getGeneratedWithKeyword_7_2()); 

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
    // $ANTLR end "rule__FieldGenerator__Group_7__2__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_7__3"
    // InternalDataSampleDSL.g:1973:1: rule__FieldGenerator__Group_7__3 : rule__FieldGenerator__Group_7__3__Impl ;
    public final void rule__FieldGenerator__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1977:1: ( rule__FieldGenerator__Group_7__3__Impl )
            // InternalDataSampleDSL.g:1978:2: rule__FieldGenerator__Group_7__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_7__3__Impl();

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
    // $ANTLR end "rule__FieldGenerator__Group_7__3"


    // $ANTLR start "rule__FieldGenerator__Group_7__3__Impl"
    // InternalDataSampleDSL.g:1984:1: rule__FieldGenerator__Group_7__3__Impl : ( ( rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3 ) ) ;
    public final void rule__FieldGenerator__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1988:1: ( ( ( rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3 ) ) )
            // InternalDataSampleDSL.g:1989:1: ( ( rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3 ) )
            {
            // InternalDataSampleDSL.g:1989:1: ( ( rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3 ) )
            // InternalDataSampleDSL.g:1990:1: ( rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3 )
            {
             before(grammarAccess.getFieldGeneratorAccess().getErrorGeneratorNameAssignment_7_3()); 
            // InternalDataSampleDSL.g:1991:1: ( rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3 )
            // InternalDataSampleDSL.g:1991:2: rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldGeneratorAccess().getErrorGeneratorNameAssignment_7_3()); 

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
    // $ANTLR end "rule__FieldGenerator__Group_7__3__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group__0"
    // InternalDataSampleDSL.g:2009:1: rule__ChildrenGenerator__Group__0 : rule__ChildrenGenerator__Group__0__Impl rule__ChildrenGenerator__Group__1 ;
    public final void rule__ChildrenGenerator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2013:1: ( rule__ChildrenGenerator__Group__0__Impl rule__ChildrenGenerator__Group__1 )
            // InternalDataSampleDSL.g:2014:2: rule__ChildrenGenerator__Group__0__Impl rule__ChildrenGenerator__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__ChildrenGenerator__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group__1();

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
    // $ANTLR end "rule__ChildrenGenerator__Group__0"


    // $ANTLR start "rule__ChildrenGenerator__Group__0__Impl"
    // InternalDataSampleDSL.g:2021:1: rule__ChildrenGenerator__Group__0__Impl : ( () ) ;
    public final void rule__ChildrenGenerator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2025:1: ( ( () ) )
            // InternalDataSampleDSL.g:2026:1: ( () )
            {
            // InternalDataSampleDSL.g:2026:1: ( () )
            // InternalDataSampleDSL.g:2027:1: ()
            {
             before(grammarAccess.getChildrenGeneratorAccess().getPolymorphicChildrenGeneratorAction_0()); 
            // InternalDataSampleDSL.g:2028:1: ()
            // InternalDataSampleDSL.g:2030:1: 
            {
            }

             after(grammarAccess.getChildrenGeneratorAccess().getPolymorphicChildrenGeneratorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group__0__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group__1"
    // InternalDataSampleDSL.g:2040:1: rule__ChildrenGenerator__Group__1 : rule__ChildrenGenerator__Group__1__Impl rule__ChildrenGenerator__Group__2 ;
    public final void rule__ChildrenGenerator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2044:1: ( rule__ChildrenGenerator__Group__1__Impl rule__ChildrenGenerator__Group__2 )
            // InternalDataSampleDSL.g:2045:2: rule__ChildrenGenerator__Group__1__Impl rule__ChildrenGenerator__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__ChildrenGenerator__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group__2();

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
    // $ANTLR end "rule__ChildrenGenerator__Group__1"


    // $ANTLR start "rule__ChildrenGenerator__Group__1__Impl"
    // InternalDataSampleDSL.g:2052:1: rule__ChildrenGenerator__Group__1__Impl : ( 'forTheComposition' ) ;
    public final void rule__ChildrenGenerator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2056:1: ( ( 'forTheComposition' ) )
            // InternalDataSampleDSL.g:2057:1: ( 'forTheComposition' )
            {
            // InternalDataSampleDSL.g:2057:1: ( 'forTheComposition' )
            // InternalDataSampleDSL.g:2058:1: 'forTheComposition'
            {
             before(grammarAccess.getChildrenGeneratorAccess().getForTheCompositionKeyword_1()); 
            match(input,36,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getChildrenGeneratorAccess().getForTheCompositionKeyword_1()); 

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
    // $ANTLR end "rule__ChildrenGenerator__Group__1__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group__2"
    // InternalDataSampleDSL.g:2071:1: rule__ChildrenGenerator__Group__2 : rule__ChildrenGenerator__Group__2__Impl rule__ChildrenGenerator__Group__3 ;
    public final void rule__ChildrenGenerator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2075:1: ( rule__ChildrenGenerator__Group__2__Impl rule__ChildrenGenerator__Group__3 )
            // InternalDataSampleDSL.g:2076:2: rule__ChildrenGenerator__Group__2__Impl rule__ChildrenGenerator__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__ChildrenGenerator__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group__3();

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
    // $ANTLR end "rule__ChildrenGenerator__Group__2"


    // $ANTLR start "rule__ChildrenGenerator__Group__2__Impl"
    // InternalDataSampleDSL.g:2083:1: rule__ChildrenGenerator__Group__2__Impl : ( ( rule__ChildrenGenerator__FieldNameAssignment_2 ) ) ;
    public final void rule__ChildrenGenerator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2087:1: ( ( ( rule__ChildrenGenerator__FieldNameAssignment_2 ) ) )
            // InternalDataSampleDSL.g:2088:1: ( ( rule__ChildrenGenerator__FieldNameAssignment_2 ) )
            {
            // InternalDataSampleDSL.g:2088:1: ( ( rule__ChildrenGenerator__FieldNameAssignment_2 ) )
            // InternalDataSampleDSL.g:2089:1: ( rule__ChildrenGenerator__FieldNameAssignment_2 )
            {
             before(grammarAccess.getChildrenGeneratorAccess().getFieldNameAssignment_2()); 
            // InternalDataSampleDSL.g:2090:1: ( rule__ChildrenGenerator__FieldNameAssignment_2 )
            // InternalDataSampleDSL.g:2090:2: rule__ChildrenGenerator__FieldNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__FieldNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChildrenGeneratorAccess().getFieldNameAssignment_2()); 

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
    // $ANTLR end "rule__ChildrenGenerator__Group__2__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group__3"
    // InternalDataSampleDSL.g:2100:1: rule__ChildrenGenerator__Group__3 : rule__ChildrenGenerator__Group__3__Impl ;
    public final void rule__ChildrenGenerator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2104:1: ( rule__ChildrenGenerator__Group__3__Impl )
            // InternalDataSampleDSL.g:2105:2: rule__ChildrenGenerator__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group__3__Impl();

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
    // $ANTLR end "rule__ChildrenGenerator__Group__3"


    // $ANTLR start "rule__ChildrenGenerator__Group__3__Impl"
    // InternalDataSampleDSL.g:2111:1: rule__ChildrenGenerator__Group__3__Impl : ( ( rule__ChildrenGenerator__Alternatives_3 ) ) ;
    public final void rule__ChildrenGenerator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2115:1: ( ( ( rule__ChildrenGenerator__Alternatives_3 ) ) )
            // InternalDataSampleDSL.g:2116:1: ( ( rule__ChildrenGenerator__Alternatives_3 ) )
            {
            // InternalDataSampleDSL.g:2116:1: ( ( rule__ChildrenGenerator__Alternatives_3 ) )
            // InternalDataSampleDSL.g:2117:1: ( rule__ChildrenGenerator__Alternatives_3 )
            {
             before(grammarAccess.getChildrenGeneratorAccess().getAlternatives_3()); 
            // InternalDataSampleDSL.g:2118:1: ( rule__ChildrenGenerator__Alternatives_3 )
            // InternalDataSampleDSL.g:2118:2: rule__ChildrenGenerator__Alternatives_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getChildrenGeneratorAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__ChildrenGenerator__Group__3__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group_3_1__0"
    // InternalDataSampleDSL.g:2136:1: rule__ChildrenGenerator__Group_3_1__0 : rule__ChildrenGenerator__Group_3_1__0__Impl rule__ChildrenGenerator__Group_3_1__1 ;
    public final void rule__ChildrenGenerator__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2140:1: ( rule__ChildrenGenerator__Group_3_1__0__Impl rule__ChildrenGenerator__Group_3_1__1 )
            // InternalDataSampleDSL.g:2141:2: rule__ChildrenGenerator__Group_3_1__0__Impl rule__ChildrenGenerator__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__ChildrenGenerator__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group_3_1__1();

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
    // $ANTLR end "rule__ChildrenGenerator__Group_3_1__0"


    // $ANTLR start "rule__ChildrenGenerator__Group_3_1__0__Impl"
    // InternalDataSampleDSL.g:2148:1: rule__ChildrenGenerator__Group_3_1__0__Impl : ( 'use' ) ;
    public final void rule__ChildrenGenerator__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2152:1: ( ( 'use' ) )
            // InternalDataSampleDSL.g:2153:1: ( 'use' )
            {
            // InternalDataSampleDSL.g:2153:1: ( 'use' )
            // InternalDataSampleDSL.g:2154:1: 'use'
            {
             before(grammarAccess.getChildrenGeneratorAccess().getUseKeyword_3_1_0()); 
            match(input,29,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getChildrenGeneratorAccess().getUseKeyword_3_1_0()); 

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
    // $ANTLR end "rule__ChildrenGenerator__Group_3_1__0__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group_3_1__1"
    // InternalDataSampleDSL.g:2167:1: rule__ChildrenGenerator__Group_3_1__1 : rule__ChildrenGenerator__Group_3_1__1__Impl rule__ChildrenGenerator__Group_3_1__2 ;
    public final void rule__ChildrenGenerator__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2171:1: ( rule__ChildrenGenerator__Group_3_1__1__Impl rule__ChildrenGenerator__Group_3_1__2 )
            // InternalDataSampleDSL.g:2172:2: rule__ChildrenGenerator__Group_3_1__1__Impl rule__ChildrenGenerator__Group_3_1__2
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__ChildrenGenerator__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group_3_1__2();

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
    // $ANTLR end "rule__ChildrenGenerator__Group_3_1__1"


    // $ANTLR start "rule__ChildrenGenerator__Group_3_1__1__Impl"
    // InternalDataSampleDSL.g:2179:1: rule__ChildrenGenerator__Group_3_1__1__Impl : ( '{' ) ;
    public final void rule__ChildrenGenerator__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2183:1: ( ( '{' ) )
            // InternalDataSampleDSL.g:2184:1: ( '{' )
            {
            // InternalDataSampleDSL.g:2184:1: ( '{' )
            // InternalDataSampleDSL.g:2185:1: '{'
            {
             before(grammarAccess.getChildrenGeneratorAccess().getLeftCurlyBracketKeyword_3_1_1()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getChildrenGeneratorAccess().getLeftCurlyBracketKeyword_3_1_1()); 

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
    // $ANTLR end "rule__ChildrenGenerator__Group_3_1__1__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group_3_1__2"
    // InternalDataSampleDSL.g:2198:1: rule__ChildrenGenerator__Group_3_1__2 : rule__ChildrenGenerator__Group_3_1__2__Impl rule__ChildrenGenerator__Group_3_1__3 ;
    public final void rule__ChildrenGenerator__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2202:1: ( rule__ChildrenGenerator__Group_3_1__2__Impl rule__ChildrenGenerator__Group_3_1__3 )
            // InternalDataSampleDSL.g:2203:2: rule__ChildrenGenerator__Group_3_1__2__Impl rule__ChildrenGenerator__Group_3_1__3
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__ChildrenGenerator__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group_3_1__3();

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
    // $ANTLR end "rule__ChildrenGenerator__Group_3_1__2"


    // $ANTLR start "rule__ChildrenGenerator__Group_3_1__2__Impl"
    // InternalDataSampleDSL.g:2210:1: rule__ChildrenGenerator__Group_3_1__2__Impl : ( ( rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_1_2 )* ) ;
    public final void rule__ChildrenGenerator__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2214:1: ( ( ( rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_1_2 )* ) )
            // InternalDataSampleDSL.g:2215:1: ( ( rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_1_2 )* )
            {
            // InternalDataSampleDSL.g:2215:1: ( ( rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_1_2 )* )
            // InternalDataSampleDSL.g:2216:1: ( rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_1_2 )*
            {
             before(grammarAccess.getChildrenGeneratorAccess().getChildrenGeneratorsAssignment_3_1_2()); 
            // InternalDataSampleDSL.g:2217:1: ( rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_1_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDataSampleDSL.g:2217:2: rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_1_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getChildrenGeneratorAccess().getChildrenGeneratorsAssignment_3_1_2()); 

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
    // $ANTLR end "rule__ChildrenGenerator__Group_3_1__2__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group_3_1__3"
    // InternalDataSampleDSL.g:2227:1: rule__ChildrenGenerator__Group_3_1__3 : rule__ChildrenGenerator__Group_3_1__3__Impl ;
    public final void rule__ChildrenGenerator__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2231:1: ( rule__ChildrenGenerator__Group_3_1__3__Impl )
            // InternalDataSampleDSL.g:2232:2: rule__ChildrenGenerator__Group_3_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group_3_1__3__Impl();

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
    // $ANTLR end "rule__ChildrenGenerator__Group_3_1__3"


    // $ANTLR start "rule__ChildrenGenerator__Group_3_1__3__Impl"
    // InternalDataSampleDSL.g:2238:1: rule__ChildrenGenerator__Group_3_1__3__Impl : ( '}' ) ;
    public final void rule__ChildrenGenerator__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2242:1: ( ( '}' ) )
            // InternalDataSampleDSL.g:2243:1: ( '}' )
            {
            // InternalDataSampleDSL.g:2243:1: ( '}' )
            // InternalDataSampleDSL.g:2244:1: '}'
            {
             before(grammarAccess.getChildrenGeneratorAccess().getRightCurlyBracketKeyword_3_1_3()); 
            match(input,26,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getChildrenGeneratorAccess().getRightCurlyBracketKeyword_3_1_3()); 

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
    // $ANTLR end "rule__ChildrenGenerator__Group_3_1__3__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group__0"
    // InternalDataSampleDSL.g:2265:1: rule__AssociationGenerator__Group__0 : rule__AssociationGenerator__Group__0__Impl rule__AssociationGenerator__Group__1 ;
    public final void rule__AssociationGenerator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2269:1: ( rule__AssociationGenerator__Group__0__Impl rule__AssociationGenerator__Group__1 )
            // InternalDataSampleDSL.g:2270:2: rule__AssociationGenerator__Group__0__Impl rule__AssociationGenerator__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__AssociationGenerator__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group__1();

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
    // $ANTLR end "rule__AssociationGenerator__Group__0"


    // $ANTLR start "rule__AssociationGenerator__Group__0__Impl"
    // InternalDataSampleDSL.g:2277:1: rule__AssociationGenerator__Group__0__Impl : ( () ) ;
    public final void rule__AssociationGenerator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2281:1: ( ( () ) )
            // InternalDataSampleDSL.g:2282:1: ( () )
            {
            // InternalDataSampleDSL.g:2282:1: ( () )
            // InternalDataSampleDSL.g:2283:1: ()
            {
             before(grammarAccess.getAssociationGeneratorAccess().getAssociationGeneratorAction_0()); 
            // InternalDataSampleDSL.g:2284:1: ()
            // InternalDataSampleDSL.g:2286:1: 
            {
            }

             after(grammarAccess.getAssociationGeneratorAccess().getAssociationGeneratorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group__0__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group__1"
    // InternalDataSampleDSL.g:2296:1: rule__AssociationGenerator__Group__1 : rule__AssociationGenerator__Group__1__Impl rule__AssociationGenerator__Group__2 ;
    public final void rule__AssociationGenerator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2300:1: ( rule__AssociationGenerator__Group__1__Impl rule__AssociationGenerator__Group__2 )
            // InternalDataSampleDSL.g:2301:2: rule__AssociationGenerator__Group__1__Impl rule__AssociationGenerator__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__AssociationGenerator__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group__2();

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
    // $ANTLR end "rule__AssociationGenerator__Group__1"


    // $ANTLR start "rule__AssociationGenerator__Group__1__Impl"
    // InternalDataSampleDSL.g:2308:1: rule__AssociationGenerator__Group__1__Impl : ( 'forTheAssociation' ) ;
    public final void rule__AssociationGenerator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2312:1: ( ( 'forTheAssociation' ) )
            // InternalDataSampleDSL.g:2313:1: ( 'forTheAssociation' )
            {
            // InternalDataSampleDSL.g:2313:1: ( 'forTheAssociation' )
            // InternalDataSampleDSL.g:2314:1: 'forTheAssociation'
            {
             before(grammarAccess.getAssociationGeneratorAccess().getForTheAssociationKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssociationGeneratorAccess().getForTheAssociationKeyword_1()); 

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
    // $ANTLR end "rule__AssociationGenerator__Group__1__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group__2"
    // InternalDataSampleDSL.g:2327:1: rule__AssociationGenerator__Group__2 : rule__AssociationGenerator__Group__2__Impl rule__AssociationGenerator__Group__3 ;
    public final void rule__AssociationGenerator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2331:1: ( rule__AssociationGenerator__Group__2__Impl rule__AssociationGenerator__Group__3 )
            // InternalDataSampleDSL.g:2332:2: rule__AssociationGenerator__Group__2__Impl rule__AssociationGenerator__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__AssociationGenerator__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group__3();

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
    // $ANTLR end "rule__AssociationGenerator__Group__2"


    // $ANTLR start "rule__AssociationGenerator__Group__2__Impl"
    // InternalDataSampleDSL.g:2339:1: rule__AssociationGenerator__Group__2__Impl : ( ( rule__AssociationGenerator__FieldNameAssignment_2 ) ) ;
    public final void rule__AssociationGenerator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2343:1: ( ( ( rule__AssociationGenerator__FieldNameAssignment_2 ) ) )
            // InternalDataSampleDSL.g:2344:1: ( ( rule__AssociationGenerator__FieldNameAssignment_2 ) )
            {
            // InternalDataSampleDSL.g:2344:1: ( ( rule__AssociationGenerator__FieldNameAssignment_2 ) )
            // InternalDataSampleDSL.g:2345:1: ( rule__AssociationGenerator__FieldNameAssignment_2 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getFieldNameAssignment_2()); 
            // InternalDataSampleDSL.g:2346:1: ( rule__AssociationGenerator__FieldNameAssignment_2 )
            // InternalDataSampleDSL.g:2346:2: rule__AssociationGenerator__FieldNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__FieldNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationGeneratorAccess().getFieldNameAssignment_2()); 

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
    // $ANTLR end "rule__AssociationGenerator__Group__2__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group__3"
    // InternalDataSampleDSL.g:2356:1: rule__AssociationGenerator__Group__3 : rule__AssociationGenerator__Group__3__Impl rule__AssociationGenerator__Group__4 ;
    public final void rule__AssociationGenerator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2360:1: ( rule__AssociationGenerator__Group__3__Impl rule__AssociationGenerator__Group__4 )
            // InternalDataSampleDSL.g:2361:2: rule__AssociationGenerator__Group__3__Impl rule__AssociationGenerator__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__AssociationGenerator__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group__4();

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
    // $ANTLR end "rule__AssociationGenerator__Group__3"


    // $ANTLR start "rule__AssociationGenerator__Group__3__Impl"
    // InternalDataSampleDSL.g:2368:1: rule__AssociationGenerator__Group__3__Impl : ( 'use' ) ;
    public final void rule__AssociationGenerator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2372:1: ( ( 'use' ) )
            // InternalDataSampleDSL.g:2373:1: ( 'use' )
            {
            // InternalDataSampleDSL.g:2373:1: ( 'use' )
            // InternalDataSampleDSL.g:2374:1: 'use'
            {
             before(grammarAccess.getAssociationGeneratorAccess().getUseKeyword_3()); 
            match(input,29,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssociationGeneratorAccess().getUseKeyword_3()); 

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
    // $ANTLR end "rule__AssociationGenerator__Group__3__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group__4"
    // InternalDataSampleDSL.g:2387:1: rule__AssociationGenerator__Group__4 : rule__AssociationGenerator__Group__4__Impl rule__AssociationGenerator__Group__5 ;
    public final void rule__AssociationGenerator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2391:1: ( rule__AssociationGenerator__Group__4__Impl rule__AssociationGenerator__Group__5 )
            // InternalDataSampleDSL.g:2392:2: rule__AssociationGenerator__Group__4__Impl rule__AssociationGenerator__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__AssociationGenerator__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group__5();

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
    // $ANTLR end "rule__AssociationGenerator__Group__4"


    // $ANTLR start "rule__AssociationGenerator__Group__4__Impl"
    // InternalDataSampleDSL.g:2399:1: rule__AssociationGenerator__Group__4__Impl : ( ( rule__AssociationGenerator__GeneratorNameAssignment_4 ) ) ;
    public final void rule__AssociationGenerator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2403:1: ( ( ( rule__AssociationGenerator__GeneratorNameAssignment_4 ) ) )
            // InternalDataSampleDSL.g:2404:1: ( ( rule__AssociationGenerator__GeneratorNameAssignment_4 ) )
            {
            // InternalDataSampleDSL.g:2404:1: ( ( rule__AssociationGenerator__GeneratorNameAssignment_4 ) )
            // InternalDataSampleDSL.g:2405:1: ( rule__AssociationGenerator__GeneratorNameAssignment_4 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getGeneratorNameAssignment_4()); 
            // InternalDataSampleDSL.g:2406:1: ( rule__AssociationGenerator__GeneratorNameAssignment_4 )
            // InternalDataSampleDSL.g:2406:2: rule__AssociationGenerator__GeneratorNameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__GeneratorNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssociationGeneratorAccess().getGeneratorNameAssignment_4()); 

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
    // $ANTLR end "rule__AssociationGenerator__Group__4__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group__5"
    // InternalDataSampleDSL.g:2416:1: rule__AssociationGenerator__Group__5 : rule__AssociationGenerator__Group__5__Impl rule__AssociationGenerator__Group__6 ;
    public final void rule__AssociationGenerator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2420:1: ( rule__AssociationGenerator__Group__5__Impl rule__AssociationGenerator__Group__6 )
            // InternalDataSampleDSL.g:2421:2: rule__AssociationGenerator__Group__5__Impl rule__AssociationGenerator__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__AssociationGenerator__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group__6();

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
    // $ANTLR end "rule__AssociationGenerator__Group__5"


    // $ANTLR start "rule__AssociationGenerator__Group__5__Impl"
    // InternalDataSampleDSL.g:2428:1: rule__AssociationGenerator__Group__5__Impl : ( ( rule__AssociationGenerator__Group_5__0 )? ) ;
    public final void rule__AssociationGenerator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2432:1: ( ( ( rule__AssociationGenerator__Group_5__0 )? ) )
            // InternalDataSampleDSL.g:2433:1: ( ( rule__AssociationGenerator__Group_5__0 )? )
            {
            // InternalDataSampleDSL.g:2433:1: ( ( rule__AssociationGenerator__Group_5__0 )? )
            // InternalDataSampleDSL.g:2434:1: ( rule__AssociationGenerator__Group_5__0 )?
            {
             before(grammarAccess.getAssociationGeneratorAccess().getGroup_5()); 
            // InternalDataSampleDSL.g:2435:1: ( rule__AssociationGenerator__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDataSampleDSL.g:2435:2: rule__AssociationGenerator__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AssociationGenerator__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationGeneratorAccess().getGroup_5()); 

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
    // $ANTLR end "rule__AssociationGenerator__Group__5__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group__6"
    // InternalDataSampleDSL.g:2445:1: rule__AssociationGenerator__Group__6 : rule__AssociationGenerator__Group__6__Impl rule__AssociationGenerator__Group__7 ;
    public final void rule__AssociationGenerator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2449:1: ( rule__AssociationGenerator__Group__6__Impl rule__AssociationGenerator__Group__7 )
            // InternalDataSampleDSL.g:2450:2: rule__AssociationGenerator__Group__6__Impl rule__AssociationGenerator__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__AssociationGenerator__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group__7();

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
    // $ANTLR end "rule__AssociationGenerator__Group__6"


    // $ANTLR start "rule__AssociationGenerator__Group__6__Impl"
    // InternalDataSampleDSL.g:2457:1: rule__AssociationGenerator__Group__6__Impl : ( ( rule__AssociationGenerator__Group_6__0 )? ) ;
    public final void rule__AssociationGenerator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2461:1: ( ( ( rule__AssociationGenerator__Group_6__0 )? ) )
            // InternalDataSampleDSL.g:2462:1: ( ( rule__AssociationGenerator__Group_6__0 )? )
            {
            // InternalDataSampleDSL.g:2462:1: ( ( rule__AssociationGenerator__Group_6__0 )? )
            // InternalDataSampleDSL.g:2463:1: ( rule__AssociationGenerator__Group_6__0 )?
            {
             before(grammarAccess.getAssociationGeneratorAccess().getGroup_6()); 
            // InternalDataSampleDSL.g:2464:1: ( rule__AssociationGenerator__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDataSampleDSL.g:2464:2: rule__AssociationGenerator__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AssociationGenerator__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationGeneratorAccess().getGroup_6()); 

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
    // $ANTLR end "rule__AssociationGenerator__Group__6__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group__7"
    // InternalDataSampleDSL.g:2474:1: rule__AssociationGenerator__Group__7 : rule__AssociationGenerator__Group__7__Impl ;
    public final void rule__AssociationGenerator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2478:1: ( rule__AssociationGenerator__Group__7__Impl )
            // InternalDataSampleDSL.g:2479:2: rule__AssociationGenerator__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group__7__Impl();

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
    // $ANTLR end "rule__AssociationGenerator__Group__7"


    // $ANTLR start "rule__AssociationGenerator__Group__7__Impl"
    // InternalDataSampleDSL.g:2485:1: rule__AssociationGenerator__Group__7__Impl : ( ( rule__AssociationGenerator__Group_7__0 )? ) ;
    public final void rule__AssociationGenerator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2489:1: ( ( ( rule__AssociationGenerator__Group_7__0 )? ) )
            // InternalDataSampleDSL.g:2490:1: ( ( rule__AssociationGenerator__Group_7__0 )? )
            {
            // InternalDataSampleDSL.g:2490:1: ( ( rule__AssociationGenerator__Group_7__0 )? )
            // InternalDataSampleDSL.g:2491:1: ( rule__AssociationGenerator__Group_7__0 )?
            {
             before(grammarAccess.getAssociationGeneratorAccess().getGroup_7()); 
            // InternalDataSampleDSL.g:2492:1: ( rule__AssociationGenerator__Group_7__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDataSampleDSL.g:2492:2: rule__AssociationGenerator__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AssociationGenerator__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationGeneratorAccess().getGroup_7()); 

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
    // $ANTLR end "rule__AssociationGenerator__Group__7__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_5__0"
    // InternalDataSampleDSL.g:2518:1: rule__AssociationGenerator__Group_5__0 : rule__AssociationGenerator__Group_5__0__Impl rule__AssociationGenerator__Group_5__1 ;
    public final void rule__AssociationGenerator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2522:1: ( rule__AssociationGenerator__Group_5__0__Impl rule__AssociationGenerator__Group_5__1 )
            // InternalDataSampleDSL.g:2523:2: rule__AssociationGenerator__Group_5__0__Impl rule__AssociationGenerator__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__AssociationGenerator__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_5__1();

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
    // $ANTLR end "rule__AssociationGenerator__Group_5__0"


    // $ANTLR start "rule__AssociationGenerator__Group_5__0__Impl"
    // InternalDataSampleDSL.g:2530:1: rule__AssociationGenerator__Group_5__0__Impl : ( 'cardinality' ) ;
    public final void rule__AssociationGenerator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2534:1: ( ( 'cardinality' ) )
            // InternalDataSampleDSL.g:2535:1: ( 'cardinality' )
            {
            // InternalDataSampleDSL.g:2535:1: ( 'cardinality' )
            // InternalDataSampleDSL.g:2536:1: 'cardinality'
            {
             before(grammarAccess.getAssociationGeneratorAccess().getCardinalityKeyword_5_0()); 
            match(input,30,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssociationGeneratorAccess().getCardinalityKeyword_5_0()); 

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
    // $ANTLR end "rule__AssociationGenerator__Group_5__0__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_5__1"
    // InternalDataSampleDSL.g:2549:1: rule__AssociationGenerator__Group_5__1 : rule__AssociationGenerator__Group_5__1__Impl ;
    public final void rule__AssociationGenerator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2553:1: ( rule__AssociationGenerator__Group_5__1__Impl )
            // InternalDataSampleDSL.g:2554:2: rule__AssociationGenerator__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_5__1__Impl();

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
    // $ANTLR end "rule__AssociationGenerator__Group_5__1"


    // $ANTLR start "rule__AssociationGenerator__Group_5__1__Impl"
    // InternalDataSampleDSL.g:2560:1: rule__AssociationGenerator__Group_5__1__Impl : ( ( rule__AssociationGenerator__NumberAssignment_5_1 ) ) ;
    public final void rule__AssociationGenerator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2564:1: ( ( ( rule__AssociationGenerator__NumberAssignment_5_1 ) ) )
            // InternalDataSampleDSL.g:2565:1: ( ( rule__AssociationGenerator__NumberAssignment_5_1 ) )
            {
            // InternalDataSampleDSL.g:2565:1: ( ( rule__AssociationGenerator__NumberAssignment_5_1 ) )
            // InternalDataSampleDSL.g:2566:1: ( rule__AssociationGenerator__NumberAssignment_5_1 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getNumberAssignment_5_1()); 
            // InternalDataSampleDSL.g:2567:1: ( rule__AssociationGenerator__NumberAssignment_5_1 )
            // InternalDataSampleDSL.g:2567:2: rule__AssociationGenerator__NumberAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__NumberAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationGeneratorAccess().getNumberAssignment_5_1()); 

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
    // $ANTLR end "rule__AssociationGenerator__Group_5__1__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_6__0"
    // InternalDataSampleDSL.g:2581:1: rule__AssociationGenerator__Group_6__0 : rule__AssociationGenerator__Group_6__0__Impl rule__AssociationGenerator__Group_6__1 ;
    public final void rule__AssociationGenerator__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2585:1: ( rule__AssociationGenerator__Group_6__0__Impl rule__AssociationGenerator__Group_6__1 )
            // InternalDataSampleDSL.g:2586:2: rule__AssociationGenerator__Group_6__0__Impl rule__AssociationGenerator__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__AssociationGenerator__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_6__1();

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
    // $ANTLR end "rule__AssociationGenerator__Group_6__0"


    // $ANTLR start "rule__AssociationGenerator__Group_6__0__Impl"
    // InternalDataSampleDSL.g:2593:1: rule__AssociationGenerator__Group_6__0__Impl : ( '(' ) ;
    public final void rule__AssociationGenerator__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2597:1: ( ( '(' ) )
            // InternalDataSampleDSL.g:2598:1: ( '(' )
            {
            // InternalDataSampleDSL.g:2598:1: ( '(' )
            // InternalDataSampleDSL.g:2599:1: '('
            {
             before(grammarAccess.getAssociationGeneratorAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,31,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssociationGeneratorAccess().getLeftParenthesisKeyword_6_0()); 

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
    // $ANTLR end "rule__AssociationGenerator__Group_6__0__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_6__1"
    // InternalDataSampleDSL.g:2612:1: rule__AssociationGenerator__Group_6__1 : rule__AssociationGenerator__Group_6__1__Impl rule__AssociationGenerator__Group_6__2 ;
    public final void rule__AssociationGenerator__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2616:1: ( rule__AssociationGenerator__Group_6__1__Impl rule__AssociationGenerator__Group_6__2 )
            // InternalDataSampleDSL.g:2617:2: rule__AssociationGenerator__Group_6__1__Impl rule__AssociationGenerator__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__AssociationGenerator__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_6__2();

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
    // $ANTLR end "rule__AssociationGenerator__Group_6__1"


    // $ANTLR start "rule__AssociationGenerator__Group_6__1__Impl"
    // InternalDataSampleDSL.g:2624:1: rule__AssociationGenerator__Group_6__1__Impl : ( ( rule__AssociationGenerator__ParametersAssignment_6_1 ) ) ;
    public final void rule__AssociationGenerator__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2628:1: ( ( ( rule__AssociationGenerator__ParametersAssignment_6_1 ) ) )
            // InternalDataSampleDSL.g:2629:1: ( ( rule__AssociationGenerator__ParametersAssignment_6_1 ) )
            {
            // InternalDataSampleDSL.g:2629:1: ( ( rule__AssociationGenerator__ParametersAssignment_6_1 ) )
            // InternalDataSampleDSL.g:2630:1: ( rule__AssociationGenerator__ParametersAssignment_6_1 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getParametersAssignment_6_1()); 
            // InternalDataSampleDSL.g:2631:1: ( rule__AssociationGenerator__ParametersAssignment_6_1 )
            // InternalDataSampleDSL.g:2631:2: rule__AssociationGenerator__ParametersAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__ParametersAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationGeneratorAccess().getParametersAssignment_6_1()); 

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
    // $ANTLR end "rule__AssociationGenerator__Group_6__1__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_6__2"
    // InternalDataSampleDSL.g:2641:1: rule__AssociationGenerator__Group_6__2 : rule__AssociationGenerator__Group_6__2__Impl rule__AssociationGenerator__Group_6__3 ;
    public final void rule__AssociationGenerator__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2645:1: ( rule__AssociationGenerator__Group_6__2__Impl rule__AssociationGenerator__Group_6__3 )
            // InternalDataSampleDSL.g:2646:2: rule__AssociationGenerator__Group_6__2__Impl rule__AssociationGenerator__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__AssociationGenerator__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_6__3();

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
    // $ANTLR end "rule__AssociationGenerator__Group_6__2"


    // $ANTLR start "rule__AssociationGenerator__Group_6__2__Impl"
    // InternalDataSampleDSL.g:2653:1: rule__AssociationGenerator__Group_6__2__Impl : ( ( rule__AssociationGenerator__Group_6_2__0 )* ) ;
    public final void rule__AssociationGenerator__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2657:1: ( ( ( rule__AssociationGenerator__Group_6_2__0 )* ) )
            // InternalDataSampleDSL.g:2658:1: ( ( rule__AssociationGenerator__Group_6_2__0 )* )
            {
            // InternalDataSampleDSL.g:2658:1: ( ( rule__AssociationGenerator__Group_6_2__0 )* )
            // InternalDataSampleDSL.g:2659:1: ( rule__AssociationGenerator__Group_6_2__0 )*
            {
             before(grammarAccess.getAssociationGeneratorAccess().getGroup_6_2()); 
            // InternalDataSampleDSL.g:2660:1: ( rule__AssociationGenerator__Group_6_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDataSampleDSL.g:2660:2: rule__AssociationGenerator__Group_6_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    rule__AssociationGenerator__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getAssociationGeneratorAccess().getGroup_6_2()); 

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
    // $ANTLR end "rule__AssociationGenerator__Group_6__2__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_6__3"
    // InternalDataSampleDSL.g:2670:1: rule__AssociationGenerator__Group_6__3 : rule__AssociationGenerator__Group_6__3__Impl ;
    public final void rule__AssociationGenerator__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2674:1: ( rule__AssociationGenerator__Group_6__3__Impl )
            // InternalDataSampleDSL.g:2675:2: rule__AssociationGenerator__Group_6__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_6__3__Impl();

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
    // $ANTLR end "rule__AssociationGenerator__Group_6__3"


    // $ANTLR start "rule__AssociationGenerator__Group_6__3__Impl"
    // InternalDataSampleDSL.g:2681:1: rule__AssociationGenerator__Group_6__3__Impl : ( ')' ) ;
    public final void rule__AssociationGenerator__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2685:1: ( ( ')' ) )
            // InternalDataSampleDSL.g:2686:1: ( ')' )
            {
            // InternalDataSampleDSL.g:2686:1: ( ')' )
            // InternalDataSampleDSL.g:2687:1: ')'
            {
             before(grammarAccess.getAssociationGeneratorAccess().getRightParenthesisKeyword_6_3()); 
            match(input,32,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssociationGeneratorAccess().getRightParenthesisKeyword_6_3()); 

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
    // $ANTLR end "rule__AssociationGenerator__Group_6__3__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_6_2__0"
    // InternalDataSampleDSL.g:2708:1: rule__AssociationGenerator__Group_6_2__0 : rule__AssociationGenerator__Group_6_2__0__Impl rule__AssociationGenerator__Group_6_2__1 ;
    public final void rule__AssociationGenerator__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2712:1: ( rule__AssociationGenerator__Group_6_2__0__Impl rule__AssociationGenerator__Group_6_2__1 )
            // InternalDataSampleDSL.g:2713:2: rule__AssociationGenerator__Group_6_2__0__Impl rule__AssociationGenerator__Group_6_2__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__AssociationGenerator__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_6_2__1();

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
    // $ANTLR end "rule__AssociationGenerator__Group_6_2__0"


    // $ANTLR start "rule__AssociationGenerator__Group_6_2__0__Impl"
    // InternalDataSampleDSL.g:2720:1: rule__AssociationGenerator__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__AssociationGenerator__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2724:1: ( ( ',' ) )
            // InternalDataSampleDSL.g:2725:1: ( ',' )
            {
            // InternalDataSampleDSL.g:2725:1: ( ',' )
            // InternalDataSampleDSL.g:2726:1: ','
            {
             before(grammarAccess.getAssociationGeneratorAccess().getCommaKeyword_6_2_0()); 
            match(input,33,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssociationGeneratorAccess().getCommaKeyword_6_2_0()); 

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
    // $ANTLR end "rule__AssociationGenerator__Group_6_2__0__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_6_2__1"
    // InternalDataSampleDSL.g:2739:1: rule__AssociationGenerator__Group_6_2__1 : rule__AssociationGenerator__Group_6_2__1__Impl ;
    public final void rule__AssociationGenerator__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2743:1: ( rule__AssociationGenerator__Group_6_2__1__Impl )
            // InternalDataSampleDSL.g:2744:2: rule__AssociationGenerator__Group_6_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_6_2__1__Impl();

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
    // $ANTLR end "rule__AssociationGenerator__Group_6_2__1"


    // $ANTLR start "rule__AssociationGenerator__Group_6_2__1__Impl"
    // InternalDataSampleDSL.g:2750:1: rule__AssociationGenerator__Group_6_2__1__Impl : ( ( rule__AssociationGenerator__ParametersAssignment_6_2_1 ) ) ;
    public final void rule__AssociationGenerator__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2754:1: ( ( ( rule__AssociationGenerator__ParametersAssignment_6_2_1 ) ) )
            // InternalDataSampleDSL.g:2755:1: ( ( rule__AssociationGenerator__ParametersAssignment_6_2_1 ) )
            {
            // InternalDataSampleDSL.g:2755:1: ( ( rule__AssociationGenerator__ParametersAssignment_6_2_1 ) )
            // InternalDataSampleDSL.g:2756:1: ( rule__AssociationGenerator__ParametersAssignment_6_2_1 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getParametersAssignment_6_2_1()); 
            // InternalDataSampleDSL.g:2757:1: ( rule__AssociationGenerator__ParametersAssignment_6_2_1 )
            // InternalDataSampleDSL.g:2757:2: rule__AssociationGenerator__ParametersAssignment_6_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__ParametersAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationGeneratorAccess().getParametersAssignment_6_2_1()); 

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
    // $ANTLR end "rule__AssociationGenerator__Group_6_2__1__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_7__0"
    // InternalDataSampleDSL.g:2771:1: rule__AssociationGenerator__Group_7__0 : rule__AssociationGenerator__Group_7__0__Impl rule__AssociationGenerator__Group_7__1 ;
    public final void rule__AssociationGenerator__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2775:1: ( rule__AssociationGenerator__Group_7__0__Impl rule__AssociationGenerator__Group_7__1 )
            // InternalDataSampleDSL.g:2776:2: rule__AssociationGenerator__Group_7__0__Impl rule__AssociationGenerator__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__AssociationGenerator__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_7__1();

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
    // $ANTLR end "rule__AssociationGenerator__Group_7__0"


    // $ANTLR start "rule__AssociationGenerator__Group_7__0__Impl"
    // InternalDataSampleDSL.g:2783:1: rule__AssociationGenerator__Group_7__0__Impl : ( 'withErrorRate=' ) ;
    public final void rule__AssociationGenerator__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2787:1: ( ( 'withErrorRate=' ) )
            // InternalDataSampleDSL.g:2788:1: ( 'withErrorRate=' )
            {
            // InternalDataSampleDSL.g:2788:1: ( 'withErrorRate=' )
            // InternalDataSampleDSL.g:2789:1: 'withErrorRate='
            {
             before(grammarAccess.getAssociationGeneratorAccess().getWithErrorRateKeyword_7_0()); 
            match(input,34,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssociationGeneratorAccess().getWithErrorRateKeyword_7_0()); 

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
    // $ANTLR end "rule__AssociationGenerator__Group_7__0__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_7__1"
    // InternalDataSampleDSL.g:2802:1: rule__AssociationGenerator__Group_7__1 : rule__AssociationGenerator__Group_7__1__Impl rule__AssociationGenerator__Group_7__2 ;
    public final void rule__AssociationGenerator__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2806:1: ( rule__AssociationGenerator__Group_7__1__Impl rule__AssociationGenerator__Group_7__2 )
            // InternalDataSampleDSL.g:2807:2: rule__AssociationGenerator__Group_7__1__Impl rule__AssociationGenerator__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__AssociationGenerator__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_7__2();

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
    // $ANTLR end "rule__AssociationGenerator__Group_7__1"


    // $ANTLR start "rule__AssociationGenerator__Group_7__1__Impl"
    // InternalDataSampleDSL.g:2814:1: rule__AssociationGenerator__Group_7__1__Impl : ( ( rule__AssociationGenerator__ErrorRateAssignment_7_1 ) ) ;
    public final void rule__AssociationGenerator__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2818:1: ( ( ( rule__AssociationGenerator__ErrorRateAssignment_7_1 ) ) )
            // InternalDataSampleDSL.g:2819:1: ( ( rule__AssociationGenerator__ErrorRateAssignment_7_1 ) )
            {
            // InternalDataSampleDSL.g:2819:1: ( ( rule__AssociationGenerator__ErrorRateAssignment_7_1 ) )
            // InternalDataSampleDSL.g:2820:1: ( rule__AssociationGenerator__ErrorRateAssignment_7_1 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getErrorRateAssignment_7_1()); 
            // InternalDataSampleDSL.g:2821:1: ( rule__AssociationGenerator__ErrorRateAssignment_7_1 )
            // InternalDataSampleDSL.g:2821:2: rule__AssociationGenerator__ErrorRateAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__ErrorRateAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationGeneratorAccess().getErrorRateAssignment_7_1()); 

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
    // $ANTLR end "rule__AssociationGenerator__Group_7__1__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_7__2"
    // InternalDataSampleDSL.g:2831:1: rule__AssociationGenerator__Group_7__2 : rule__AssociationGenerator__Group_7__2__Impl rule__AssociationGenerator__Group_7__3 ;
    public final void rule__AssociationGenerator__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2835:1: ( rule__AssociationGenerator__Group_7__2__Impl rule__AssociationGenerator__Group_7__3 )
            // InternalDataSampleDSL.g:2836:2: rule__AssociationGenerator__Group_7__2__Impl rule__AssociationGenerator__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__AssociationGenerator__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_7__3();

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
    // $ANTLR end "rule__AssociationGenerator__Group_7__2"


    // $ANTLR start "rule__AssociationGenerator__Group_7__2__Impl"
    // InternalDataSampleDSL.g:2843:1: rule__AssociationGenerator__Group_7__2__Impl : ( 'generatedWith' ) ;
    public final void rule__AssociationGenerator__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2847:1: ( ( 'generatedWith' ) )
            // InternalDataSampleDSL.g:2848:1: ( 'generatedWith' )
            {
            // InternalDataSampleDSL.g:2848:1: ( 'generatedWith' )
            // InternalDataSampleDSL.g:2849:1: 'generatedWith'
            {
             before(grammarAccess.getAssociationGeneratorAccess().getGeneratedWithKeyword_7_2()); 
            match(input,35,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssociationGeneratorAccess().getGeneratedWithKeyword_7_2()); 

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
    // $ANTLR end "rule__AssociationGenerator__Group_7__2__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_7__3"
    // InternalDataSampleDSL.g:2862:1: rule__AssociationGenerator__Group_7__3 : rule__AssociationGenerator__Group_7__3__Impl ;
    public final void rule__AssociationGenerator__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2866:1: ( rule__AssociationGenerator__Group_7__3__Impl )
            // InternalDataSampleDSL.g:2867:2: rule__AssociationGenerator__Group_7__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_7__3__Impl();

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
    // $ANTLR end "rule__AssociationGenerator__Group_7__3"


    // $ANTLR start "rule__AssociationGenerator__Group_7__3__Impl"
    // InternalDataSampleDSL.g:2873:1: rule__AssociationGenerator__Group_7__3__Impl : ( ( rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3 ) ) ;
    public final void rule__AssociationGenerator__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2877:1: ( ( ( rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3 ) ) )
            // InternalDataSampleDSL.g:2878:1: ( ( rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3 ) )
            {
            // InternalDataSampleDSL.g:2878:1: ( ( rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3 ) )
            // InternalDataSampleDSL.g:2879:1: ( rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getErrorGeneratorNameAssignment_7_3()); 
            // InternalDataSampleDSL.g:2880:1: ( rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3 )
            // InternalDataSampleDSL.g:2880:2: rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getAssociationGeneratorAccess().getErrorGeneratorNameAssignment_7_3()); 

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
    // $ANTLR end "rule__AssociationGenerator__Group_7__3__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalDataSampleDSL.g:2898:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2902:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalDataSampleDSL.g:2903:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalDataSampleDSL.g:2910:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2914:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalDataSampleDSL.g:2915:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalDataSampleDSL.g:2915:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalDataSampleDSL.g:2916:1: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalDataSampleDSL.g:2917:1: ( rule__Parameter__NameAssignment_0 )
            // InternalDataSampleDSL.g:2917:2: rule__Parameter__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalDataSampleDSL.g:2927:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2931:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalDataSampleDSL.g:2932:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalDataSampleDSL.g:2939:1: rule__Parameter__Group__1__Impl : ( '=' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2943:1: ( ( '=' ) )
            // InternalDataSampleDSL.g:2944:1: ( '=' )
            {
            // InternalDataSampleDSL.g:2944:1: ( '=' )
            // InternalDataSampleDSL.g:2945:1: '='
            {
             before(grammarAccess.getParameterAccess().getEqualsSignKeyword_1()); 
            match(input,38,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalDataSampleDSL.g:2958:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2962:1: ( rule__Parameter__Group__2__Impl )
            // InternalDataSampleDSL.g:2963:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group__2__Impl();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalDataSampleDSL.g:2969:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__ValueAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2973:1: ( ( ( rule__Parameter__ValueAssignment_2 ) ) )
            // InternalDataSampleDSL.g:2974:1: ( ( rule__Parameter__ValueAssignment_2 ) )
            {
            // InternalDataSampleDSL.g:2974:1: ( ( rule__Parameter__ValueAssignment_2 ) )
            // InternalDataSampleDSL.g:2975:1: ( rule__Parameter__ValueAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getValueAssignment_2()); 
            // InternalDataSampleDSL.g:2976:1: ( rule__Parameter__ValueAssignment_2 )
            // InternalDataSampleDSL.g:2976:2: rule__Parameter__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__DataSample__NameAssignment_2"
    // InternalDataSampleDSL.g:2993:1: rule__DataSample__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DataSample__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2997:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:2998:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:2998:1: ( ruleEString )
            // InternalDataSampleDSL.g:2999:1: ruleEString
            {
             before(grammarAccess.getDataSampleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataSampleAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DataSample__NameAssignment_2"


    // $ANTLR start "rule__DataSample__PackageURIAssignment_4"
    // InternalDataSampleDSL.g:3008:1: rule__DataSample__PackageURIAssignment_4 : ( ruleEString ) ;
    public final void rule__DataSample__PackageURIAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3012:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3013:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3013:1: ( ruleEString )
            // InternalDataSampleDSL.g:3014:1: ruleEString
            {
             before(grammarAccess.getDataSampleAccess().getPackageURIEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataSampleAccess().getPackageURIEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__DataSample__PackageURIAssignment_4"


    // $ANTLR start "rule__DataSample__RootEntityNameAssignment_6"
    // InternalDataSampleDSL.g:3023:1: rule__DataSample__RootEntityNameAssignment_6 : ( ruleEString ) ;
    public final void rule__DataSample__RootEntityNameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3027:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3028:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3028:1: ( ruleEString )
            // InternalDataSampleDSL.g:3029:1: ruleEString
            {
             before(grammarAccess.getDataSampleAccess().getRootEntityNameEStringParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataSampleAccess().getRootEntityNameEStringParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__DataSample__RootEntityNameAssignment_6"


    // $ANTLR start "rule__DataSample__SeedAssignment_7_1"
    // InternalDataSampleDSL.g:3038:1: rule__DataSample__SeedAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__DataSample__SeedAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3042:1: ( ( ruleEInt ) )
            // InternalDataSampleDSL.g:3043:1: ( ruleEInt )
            {
            // InternalDataSampleDSL.g:3043:1: ( ruleEInt )
            // InternalDataSampleDSL.g:3044:1: ruleEInt
            {
             before(grammarAccess.getDataSampleAccess().getSeedEIntParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDataSampleAccess().getSeedEIntParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__DataSample__SeedAssignment_7_1"


    // $ANTLR start "rule__DataSample__LanguageAssignment_8_1"
    // InternalDataSampleDSL.g:3053:1: rule__DataSample__LanguageAssignment_8_1 : ( ruleLanguage ) ;
    public final void rule__DataSample__LanguageAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3057:1: ( ( ruleLanguage ) )
            // InternalDataSampleDSL.g:3058:1: ( ruleLanguage )
            {
            // InternalDataSampleDSL.g:3058:1: ( ruleLanguage )
            // InternalDataSampleDSL.g:3059:1: ruleLanguage
            {
             before(grammarAccess.getDataSampleAccess().getLanguageLanguageEnumRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getDataSampleAccess().getLanguageLanguageEnumRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__DataSample__LanguageAssignment_8_1"


    // $ANTLR start "rule__DataSample__FileExtensionAssignment_9_1"
    // InternalDataSampleDSL.g:3068:1: rule__DataSample__FileExtensionAssignment_9_1 : ( ruleEString ) ;
    public final void rule__DataSample__FileExtensionAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3072:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3073:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3073:1: ( ruleEString )
            // InternalDataSampleDSL.g:3074:1: ruleEString
            {
             before(grammarAccess.getDataSampleAccess().getFileExtensionEStringParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataSampleAccess().getFileExtensionEStringParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__DataSample__FileExtensionAssignment_9_1"


    // $ANTLR start "rule__DataSample__RootGeneratorAssignment_11"
    // InternalDataSampleDSL.g:3083:1: rule__DataSample__RootGeneratorAssignment_11 : ( ruleEntityGenerator ) ;
    public final void rule__DataSample__RootGeneratorAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3087:1: ( ( ruleEntityGenerator ) )
            // InternalDataSampleDSL.g:3088:1: ( ruleEntityGenerator )
            {
            // InternalDataSampleDSL.g:3088:1: ( ruleEntityGenerator )
            // InternalDataSampleDSL.g:3089:1: ruleEntityGenerator
            {
             before(grammarAccess.getDataSampleAccess().getRootGeneratorEntityGeneratorParserRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEntityGenerator();

            state._fsp--;

             after(grammarAccess.getDataSampleAccess().getRootGeneratorEntityGeneratorParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__DataSample__RootGeneratorAssignment_11"


    // $ANTLR start "rule__EntityGenerator__NumberAssignment_2_0"
    // InternalDataSampleDSL.g:3098:1: rule__EntityGenerator__NumberAssignment_2_0 : ( ruleEInt ) ;
    public final void rule__EntityGenerator__NumberAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3102:1: ( ( ruleEInt ) )
            // InternalDataSampleDSL.g:3103:1: ( ruleEInt )
            {
            // InternalDataSampleDSL.g:3103:1: ( ruleEInt )
            // InternalDataSampleDSL.g:3104:1: ruleEInt
            {
             before(grammarAccess.getEntityGeneratorAccess().getNumberEIntParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEntityGeneratorAccess().getNumberEIntParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__EntityGenerator__NumberAssignment_2_0"


    // $ANTLR start "rule__EntityGenerator__EntityNameAssignment_3"
    // InternalDataSampleDSL.g:3113:1: rule__EntityGenerator__EntityNameAssignment_3 : ( ruleEString ) ;
    public final void rule__EntityGenerator__EntityNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3117:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3118:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3118:1: ( ruleEString )
            // InternalDataSampleDSL.g:3119:1: ruleEString
            {
             before(grammarAccess.getEntityGeneratorAccess().getEntityNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntityGeneratorAccess().getEntityNameEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__EntityGenerator__EntityNameAssignment_3"


    // $ANTLR start "rule__EntityGenerator__FieldGeneratorsAssignment_5"
    // InternalDataSampleDSL.g:3128:1: rule__EntityGenerator__FieldGeneratorsAssignment_5 : ( ruleFieldGenerator ) ;
    public final void rule__EntityGenerator__FieldGeneratorsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3132:1: ( ( ruleFieldGenerator ) )
            // InternalDataSampleDSL.g:3133:1: ( ruleFieldGenerator )
            {
            // InternalDataSampleDSL.g:3133:1: ( ruleFieldGenerator )
            // InternalDataSampleDSL.g:3134:1: ruleFieldGenerator
            {
             before(grammarAccess.getEntityGeneratorAccess().getFieldGeneratorsFieldGeneratorParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFieldGenerator();

            state._fsp--;

             after(grammarAccess.getEntityGeneratorAccess().getFieldGeneratorsFieldGeneratorParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__EntityGenerator__FieldGeneratorsAssignment_5"


    // $ANTLR start "rule__EntityGenerator__ChildGeneratorsAssignment_6"
    // InternalDataSampleDSL.g:3143:1: rule__EntityGenerator__ChildGeneratorsAssignment_6 : ( ruleChildrenGenerator ) ;
    public final void rule__EntityGenerator__ChildGeneratorsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3147:1: ( ( ruleChildrenGenerator ) )
            // InternalDataSampleDSL.g:3148:1: ( ruleChildrenGenerator )
            {
            // InternalDataSampleDSL.g:3148:1: ( ruleChildrenGenerator )
            // InternalDataSampleDSL.g:3149:1: ruleChildrenGenerator
            {
             before(grammarAccess.getEntityGeneratorAccess().getChildGeneratorsChildrenGeneratorParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleChildrenGenerator();

            state._fsp--;

             after(grammarAccess.getEntityGeneratorAccess().getChildGeneratorsChildrenGeneratorParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__EntityGenerator__ChildGeneratorsAssignment_6"


    // $ANTLR start "rule__EntityGenerator__AssociationGeneratorsAssignment_7"
    // InternalDataSampleDSL.g:3158:1: rule__EntityGenerator__AssociationGeneratorsAssignment_7 : ( ruleAssociationGenerator ) ;
    public final void rule__EntityGenerator__AssociationGeneratorsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3162:1: ( ( ruleAssociationGenerator ) )
            // InternalDataSampleDSL.g:3163:1: ( ruleAssociationGenerator )
            {
            // InternalDataSampleDSL.g:3163:1: ( ruleAssociationGenerator )
            // InternalDataSampleDSL.g:3164:1: ruleAssociationGenerator
            {
             before(grammarAccess.getEntityGeneratorAccess().getAssociationGeneratorsAssociationGeneratorParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAssociationGenerator();

            state._fsp--;

             after(grammarAccess.getEntityGeneratorAccess().getAssociationGeneratorsAssociationGeneratorParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__EntityGenerator__AssociationGeneratorsAssignment_7"


    // $ANTLR start "rule__FieldGenerator__FieldNameAssignment_2"
    // InternalDataSampleDSL.g:3173:1: rule__FieldGenerator__FieldNameAssignment_2 : ( ruleEString ) ;
    public final void rule__FieldGenerator__FieldNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3177:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3178:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3178:1: ( ruleEString )
            // InternalDataSampleDSL.g:3179:1: ruleEString
            {
             before(grammarAccess.getFieldGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FieldGenerator__FieldNameAssignment_2"


    // $ANTLR start "rule__FieldGenerator__GeneratorNameAssignment_4"
    // InternalDataSampleDSL.g:3188:1: rule__FieldGenerator__GeneratorNameAssignment_4 : ( ruleEString ) ;
    public final void rule__FieldGenerator__GeneratorNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3192:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3193:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3193:1: ( ruleEString )
            // InternalDataSampleDSL.g:3194:1: ruleEString
            {
             before(grammarAccess.getFieldGeneratorAccess().getGeneratorNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldGeneratorAccess().getGeneratorNameEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__FieldGenerator__GeneratorNameAssignment_4"


    // $ANTLR start "rule__FieldGenerator__NumberAssignment_5_1"
    // InternalDataSampleDSL.g:3203:1: rule__FieldGenerator__NumberAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__FieldGenerator__NumberAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3207:1: ( ( ruleEInt ) )
            // InternalDataSampleDSL.g:3208:1: ( ruleEInt )
            {
            // InternalDataSampleDSL.g:3208:1: ( ruleEInt )
            // InternalDataSampleDSL.g:3209:1: ruleEInt
            {
             before(grammarAccess.getFieldGeneratorAccess().getNumberEIntParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getFieldGeneratorAccess().getNumberEIntParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__FieldGenerator__NumberAssignment_5_1"


    // $ANTLR start "rule__FieldGenerator__ParametersAssignment_6_1"
    // InternalDataSampleDSL.g:3218:1: rule__FieldGenerator__ParametersAssignment_6_1 : ( ruleParameter ) ;
    public final void rule__FieldGenerator__ParametersAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3222:1: ( ( ruleParameter ) )
            // InternalDataSampleDSL.g:3223:1: ( ruleParameter )
            {
            // InternalDataSampleDSL.g:3223:1: ( ruleParameter )
            // InternalDataSampleDSL.g:3224:1: ruleParameter
            {
             before(grammarAccess.getFieldGeneratorAccess().getParametersParameterParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getFieldGeneratorAccess().getParametersParameterParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__FieldGenerator__ParametersAssignment_6_1"


    // $ANTLR start "rule__FieldGenerator__ParametersAssignment_6_2_1"
    // InternalDataSampleDSL.g:3233:1: rule__FieldGenerator__ParametersAssignment_6_2_1 : ( ruleParameter ) ;
    public final void rule__FieldGenerator__ParametersAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3237:1: ( ( ruleParameter ) )
            // InternalDataSampleDSL.g:3238:1: ( ruleParameter )
            {
            // InternalDataSampleDSL.g:3238:1: ( ruleParameter )
            // InternalDataSampleDSL.g:3239:1: ruleParameter
            {
             before(grammarAccess.getFieldGeneratorAccess().getParametersParameterParserRuleCall_6_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getFieldGeneratorAccess().getParametersParameterParserRuleCall_6_2_1_0()); 

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
    // $ANTLR end "rule__FieldGenerator__ParametersAssignment_6_2_1"


    // $ANTLR start "rule__FieldGenerator__ErrorRateAssignment_7_1"
    // InternalDataSampleDSL.g:3248:1: rule__FieldGenerator__ErrorRateAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__FieldGenerator__ErrorRateAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3252:1: ( ( ruleEInt ) )
            // InternalDataSampleDSL.g:3253:1: ( ruleEInt )
            {
            // InternalDataSampleDSL.g:3253:1: ( ruleEInt )
            // InternalDataSampleDSL.g:3254:1: ruleEInt
            {
             before(grammarAccess.getFieldGeneratorAccess().getErrorRateEIntParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getFieldGeneratorAccess().getErrorRateEIntParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__FieldGenerator__ErrorRateAssignment_7_1"


    // $ANTLR start "rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3"
    // InternalDataSampleDSL.g:3263:1: rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3 : ( ruleEString ) ;
    public final void rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3267:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3268:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3268:1: ( ruleEString )
            // InternalDataSampleDSL.g:3269:1: ruleEString
            {
             before(grammarAccess.getFieldGeneratorAccess().getErrorGeneratorNameEStringParserRuleCall_7_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldGeneratorAccess().getErrorGeneratorNameEStringParserRuleCall_7_3_0()); 

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
    // $ANTLR end "rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3"


    // $ANTLR start "rule__ChildrenGenerator__FieldNameAssignment_2"
    // InternalDataSampleDSL.g:3278:1: rule__ChildrenGenerator__FieldNameAssignment_2 : ( ruleEString ) ;
    public final void rule__ChildrenGenerator__FieldNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3282:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3283:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3283:1: ( ruleEString )
            // InternalDataSampleDSL.g:3284:1: ruleEString
            {
             before(grammarAccess.getChildrenGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChildrenGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ChildrenGenerator__FieldNameAssignment_2"


    // $ANTLR start "rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_0"
    // InternalDataSampleDSL.g:3293:1: rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_0 : ( ruleEntityGenerator ) ;
    public final void rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3297:1: ( ( ruleEntityGenerator ) )
            // InternalDataSampleDSL.g:3298:1: ( ruleEntityGenerator )
            {
            // InternalDataSampleDSL.g:3298:1: ( ruleEntityGenerator )
            // InternalDataSampleDSL.g:3299:1: ruleEntityGenerator
            {
             before(grammarAccess.getChildrenGeneratorAccess().getChildrenGeneratorsEntityGeneratorParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEntityGenerator();

            state._fsp--;

             after(grammarAccess.getChildrenGeneratorAccess().getChildrenGeneratorsEntityGeneratorParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_0"


    // $ANTLR start "rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_1_2"
    // InternalDataSampleDSL.g:3308:1: rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_1_2 : ( ruleEntityGenerator ) ;
    public final void rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3312:1: ( ( ruleEntityGenerator ) )
            // InternalDataSampleDSL.g:3313:1: ( ruleEntityGenerator )
            {
            // InternalDataSampleDSL.g:3313:1: ( ruleEntityGenerator )
            // InternalDataSampleDSL.g:3314:1: ruleEntityGenerator
            {
             before(grammarAccess.getChildrenGeneratorAccess().getChildrenGeneratorsEntityGeneratorParserRuleCall_3_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEntityGenerator();

            state._fsp--;

             after(grammarAccess.getChildrenGeneratorAccess().getChildrenGeneratorsEntityGeneratorParserRuleCall_3_1_2_0()); 

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
    // $ANTLR end "rule__ChildrenGenerator__ChildrenGeneratorsAssignment_3_1_2"


    // $ANTLR start "rule__AssociationGenerator__FieldNameAssignment_2"
    // InternalDataSampleDSL.g:3323:1: rule__AssociationGenerator__FieldNameAssignment_2 : ( ruleEString ) ;
    public final void rule__AssociationGenerator__FieldNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3327:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3328:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3328:1: ( ruleEString )
            // InternalDataSampleDSL.g:3329:1: ruleEString
            {
             before(grammarAccess.getAssociationGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssociationGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AssociationGenerator__FieldNameAssignment_2"


    // $ANTLR start "rule__AssociationGenerator__GeneratorNameAssignment_4"
    // InternalDataSampleDSL.g:3338:1: rule__AssociationGenerator__GeneratorNameAssignment_4 : ( ruleEString ) ;
    public final void rule__AssociationGenerator__GeneratorNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3342:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3343:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3343:1: ( ruleEString )
            // InternalDataSampleDSL.g:3344:1: ruleEString
            {
             before(grammarAccess.getAssociationGeneratorAccess().getGeneratorNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssociationGeneratorAccess().getGeneratorNameEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__AssociationGenerator__GeneratorNameAssignment_4"


    // $ANTLR start "rule__AssociationGenerator__NumberAssignment_5_1"
    // InternalDataSampleDSL.g:3353:1: rule__AssociationGenerator__NumberAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__AssociationGenerator__NumberAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3357:1: ( ( ruleEInt ) )
            // InternalDataSampleDSL.g:3358:1: ( ruleEInt )
            {
            // InternalDataSampleDSL.g:3358:1: ( ruleEInt )
            // InternalDataSampleDSL.g:3359:1: ruleEInt
            {
             before(grammarAccess.getAssociationGeneratorAccess().getNumberEIntParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAssociationGeneratorAccess().getNumberEIntParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__AssociationGenerator__NumberAssignment_5_1"


    // $ANTLR start "rule__AssociationGenerator__ParametersAssignment_6_1"
    // InternalDataSampleDSL.g:3368:1: rule__AssociationGenerator__ParametersAssignment_6_1 : ( ruleParameter ) ;
    public final void rule__AssociationGenerator__ParametersAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3372:1: ( ( ruleParameter ) )
            // InternalDataSampleDSL.g:3373:1: ( ruleParameter )
            {
            // InternalDataSampleDSL.g:3373:1: ( ruleParameter )
            // InternalDataSampleDSL.g:3374:1: ruleParameter
            {
             before(grammarAccess.getAssociationGeneratorAccess().getParametersParameterParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getAssociationGeneratorAccess().getParametersParameterParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__AssociationGenerator__ParametersAssignment_6_1"


    // $ANTLR start "rule__AssociationGenerator__ParametersAssignment_6_2_1"
    // InternalDataSampleDSL.g:3383:1: rule__AssociationGenerator__ParametersAssignment_6_2_1 : ( ruleParameter ) ;
    public final void rule__AssociationGenerator__ParametersAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3387:1: ( ( ruleParameter ) )
            // InternalDataSampleDSL.g:3388:1: ( ruleParameter )
            {
            // InternalDataSampleDSL.g:3388:1: ( ruleParameter )
            // InternalDataSampleDSL.g:3389:1: ruleParameter
            {
             before(grammarAccess.getAssociationGeneratorAccess().getParametersParameterParserRuleCall_6_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getAssociationGeneratorAccess().getParametersParameterParserRuleCall_6_2_1_0()); 

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
    // $ANTLR end "rule__AssociationGenerator__ParametersAssignment_6_2_1"


    // $ANTLR start "rule__AssociationGenerator__ErrorRateAssignment_7_1"
    // InternalDataSampleDSL.g:3398:1: rule__AssociationGenerator__ErrorRateAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__AssociationGenerator__ErrorRateAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3402:1: ( ( ruleEInt ) )
            // InternalDataSampleDSL.g:3403:1: ( ruleEInt )
            {
            // InternalDataSampleDSL.g:3403:1: ( ruleEInt )
            // InternalDataSampleDSL.g:3404:1: ruleEInt
            {
             before(grammarAccess.getAssociationGeneratorAccess().getErrorRateEIntParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAssociationGeneratorAccess().getErrorRateEIntParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__AssociationGenerator__ErrorRateAssignment_7_1"


    // $ANTLR start "rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3"
    // InternalDataSampleDSL.g:3413:1: rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3 : ( ruleEString ) ;
    public final void rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3417:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3418:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3418:1: ( ruleEString )
            // InternalDataSampleDSL.g:3419:1: ruleEString
            {
             before(grammarAccess.getAssociationGeneratorAccess().getErrorGeneratorNameEStringParserRuleCall_7_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssociationGeneratorAccess().getErrorGeneratorNameEStringParserRuleCall_7_3_0()); 

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
    // $ANTLR end "rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalDataSampleDSL.g:3428:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3432:1: ( ( RULE_ID ) )
            // InternalDataSampleDSL.g:3433:1: ( RULE_ID )
            {
            // InternalDataSampleDSL.g:3433:1: ( RULE_ID )
            // InternalDataSampleDSL.g:3434:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__ValueAssignment_2"
    // InternalDataSampleDSL.g:3443:1: rule__Parameter__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__Parameter__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3447:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3448:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3448:1: ( ruleEString )
            // InternalDataSampleDSL.g:3449:1: ruleEString
            {
             before(grammarAccess.getParameterAccess().getValueEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getValueEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Parameter__ValueAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000780000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000F800L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800070L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000003014000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000004C0000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000021000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000005000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    }


}