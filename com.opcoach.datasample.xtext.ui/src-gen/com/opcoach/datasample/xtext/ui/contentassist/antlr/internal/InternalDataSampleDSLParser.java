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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fr'", "'en'", "'de'", "'es'", "'it'", "'Sample'", "'for'", "'generateRootObject'", "'rootGenerator'", "'seed'", "'language'", "'fileExtension'", "'-'", "'generate'", "'{'", "'}'", "'instancesOf'", "'forTheField'", "'use'", "'cardinality'", "'('", "')'", "','", "'withErrorRate='", "'generatedWith'", "'forTheComposition'", "'forTheAbstractComposition'", "'forTheAssociation'", "'='"
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


    // $ANTLR start "entryRuleChild"
    // InternalDataSampleDSL.g:200:1: entryRuleChild : ruleChild EOF ;
    public final void entryRuleChild() throws RecognitionException {
        try {
            // InternalDataSampleDSL.g:201:1: ( ruleChild EOF )
            // InternalDataSampleDSL.g:202:1: ruleChild EOF
            {
             before(grammarAccess.getChildRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleChild();

            state._fsp--;

             after(grammarAccess.getChildRule()); 
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
    // $ANTLR end "entryRuleChild"


    // $ANTLR start "ruleChild"
    // InternalDataSampleDSL.g:209:1: ruleChild : ( ( rule__Child__Alternatives ) ) ;
    public final void ruleChild() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:213:2: ( ( ( rule__Child__Alternatives ) ) )
            // InternalDataSampleDSL.g:214:1: ( ( rule__Child__Alternatives ) )
            {
            // InternalDataSampleDSL.g:214:1: ( ( rule__Child__Alternatives ) )
            // InternalDataSampleDSL.g:215:1: ( rule__Child__Alternatives )
            {
             before(grammarAccess.getChildAccess().getAlternatives()); 
            // InternalDataSampleDSL.g:216:1: ( rule__Child__Alternatives )
            // InternalDataSampleDSL.g:216:2: rule__Child__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Child__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getChildAccess().getAlternatives()); 

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
    // $ANTLR end "ruleChild"


    // $ANTLR start "entryRuleChildrenGenerator"
    // InternalDataSampleDSL.g:228:1: entryRuleChildrenGenerator : ruleChildrenGenerator EOF ;
    public final void entryRuleChildrenGenerator() throws RecognitionException {
        try {
            // InternalDataSampleDSL.g:229:1: ( ruleChildrenGenerator EOF )
            // InternalDataSampleDSL.g:230:1: ruleChildrenGenerator EOF
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
    // InternalDataSampleDSL.g:237:1: ruleChildrenGenerator : ( ( rule__ChildrenGenerator__Group__0 ) ) ;
    public final void ruleChildrenGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:241:2: ( ( ( rule__ChildrenGenerator__Group__0 ) ) )
            // InternalDataSampleDSL.g:242:1: ( ( rule__ChildrenGenerator__Group__0 ) )
            {
            // InternalDataSampleDSL.g:242:1: ( ( rule__ChildrenGenerator__Group__0 ) )
            // InternalDataSampleDSL.g:243:1: ( rule__ChildrenGenerator__Group__0 )
            {
             before(grammarAccess.getChildrenGeneratorAccess().getGroup()); 
            // InternalDataSampleDSL.g:244:1: ( rule__ChildrenGenerator__Group__0 )
            // InternalDataSampleDSL.g:244:2: rule__ChildrenGenerator__Group__0
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


    // $ANTLR start "entryRulePolymorphicChildrenGenerator"
    // InternalDataSampleDSL.g:256:1: entryRulePolymorphicChildrenGenerator : rulePolymorphicChildrenGenerator EOF ;
    public final void entryRulePolymorphicChildrenGenerator() throws RecognitionException {
        try {
            // InternalDataSampleDSL.g:257:1: ( rulePolymorphicChildrenGenerator EOF )
            // InternalDataSampleDSL.g:258:1: rulePolymorphicChildrenGenerator EOF
            {
             before(grammarAccess.getPolymorphicChildrenGeneratorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePolymorphicChildrenGenerator();

            state._fsp--;

             after(grammarAccess.getPolymorphicChildrenGeneratorRule()); 
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
    // $ANTLR end "entryRulePolymorphicChildrenGenerator"


    // $ANTLR start "rulePolymorphicChildrenGenerator"
    // InternalDataSampleDSL.g:265:1: rulePolymorphicChildrenGenerator : ( ( rule__PolymorphicChildrenGenerator__Group__0 ) ) ;
    public final void rulePolymorphicChildrenGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:269:2: ( ( ( rule__PolymorphicChildrenGenerator__Group__0 ) ) )
            // InternalDataSampleDSL.g:270:1: ( ( rule__PolymorphicChildrenGenerator__Group__0 ) )
            {
            // InternalDataSampleDSL.g:270:1: ( ( rule__PolymorphicChildrenGenerator__Group__0 ) )
            // InternalDataSampleDSL.g:271:1: ( rule__PolymorphicChildrenGenerator__Group__0 )
            {
             before(grammarAccess.getPolymorphicChildrenGeneratorAccess().getGroup()); 
            // InternalDataSampleDSL.g:272:1: ( rule__PolymorphicChildrenGenerator__Group__0 )
            // InternalDataSampleDSL.g:272:2: rule__PolymorphicChildrenGenerator__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PolymorphicChildrenGenerator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolymorphicChildrenGeneratorAccess().getGroup()); 

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
    // $ANTLR end "rulePolymorphicChildrenGenerator"


    // $ANTLR start "entryRuleAssociationGenerator"
    // InternalDataSampleDSL.g:284:1: entryRuleAssociationGenerator : ruleAssociationGenerator EOF ;
    public final void entryRuleAssociationGenerator() throws RecognitionException {
        try {
            // InternalDataSampleDSL.g:285:1: ( ruleAssociationGenerator EOF )
            // InternalDataSampleDSL.g:286:1: ruleAssociationGenerator EOF
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
    // InternalDataSampleDSL.g:293:1: ruleAssociationGenerator : ( ( rule__AssociationGenerator__Group__0 ) ) ;
    public final void ruleAssociationGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:297:2: ( ( ( rule__AssociationGenerator__Group__0 ) ) )
            // InternalDataSampleDSL.g:298:1: ( ( rule__AssociationGenerator__Group__0 ) )
            {
            // InternalDataSampleDSL.g:298:1: ( ( rule__AssociationGenerator__Group__0 ) )
            // InternalDataSampleDSL.g:299:1: ( rule__AssociationGenerator__Group__0 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getGroup()); 
            // InternalDataSampleDSL.g:300:1: ( rule__AssociationGenerator__Group__0 )
            // InternalDataSampleDSL.g:300:2: rule__AssociationGenerator__Group__0
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
    // InternalDataSampleDSL.g:312:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalDataSampleDSL.g:313:1: ( ruleParameter EOF )
            // InternalDataSampleDSL.g:314:1: ruleParameter EOF
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
    // InternalDataSampleDSL.g:321:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:325:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalDataSampleDSL.g:326:1: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalDataSampleDSL.g:326:1: ( ( rule__Parameter__Group__0 ) )
            // InternalDataSampleDSL.g:327:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalDataSampleDSL.g:328:1: ( rule__Parameter__Group__0 )
            // InternalDataSampleDSL.g:328:2: rule__Parameter__Group__0
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
    // InternalDataSampleDSL.g:341:1: ruleLanguage : ( ( rule__Language__Alternatives ) ) ;
    public final void ruleLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:345:1: ( ( ( rule__Language__Alternatives ) ) )
            // InternalDataSampleDSL.g:346:1: ( ( rule__Language__Alternatives ) )
            {
            // InternalDataSampleDSL.g:346:1: ( ( rule__Language__Alternatives ) )
            // InternalDataSampleDSL.g:347:1: ( rule__Language__Alternatives )
            {
             before(grammarAccess.getLanguageAccess().getAlternatives()); 
            // InternalDataSampleDSL.g:348:1: ( rule__Language__Alternatives )
            // InternalDataSampleDSL.g:348:2: rule__Language__Alternatives
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
    // InternalDataSampleDSL.g:359:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:363:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalDataSampleDSL.g:364:1: ( RULE_STRING )
                    {
                    // InternalDataSampleDSL.g:364:1: ( RULE_STRING )
                    // InternalDataSampleDSL.g:365:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataSampleDSL.g:370:6: ( RULE_ID )
                    {
                    // InternalDataSampleDSL.g:370:6: ( RULE_ID )
                    // InternalDataSampleDSL.g:371:1: RULE_ID
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


    // $ANTLR start "rule__Child__Alternatives"
    // InternalDataSampleDSL.g:381:1: rule__Child__Alternatives : ( ( ruleChildrenGenerator ) | ( rulePolymorphicChildrenGenerator ) );
    public final void rule__Child__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:385:1: ( ( ruleChildrenGenerator ) | ( rulePolymorphicChildrenGenerator ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==36) ) {
                alt2=1;
            }
            else if ( (LA2_0==37) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDataSampleDSL.g:386:1: ( ruleChildrenGenerator )
                    {
                    // InternalDataSampleDSL.g:386:1: ( ruleChildrenGenerator )
                    // InternalDataSampleDSL.g:387:1: ruleChildrenGenerator
                    {
                     before(grammarAccess.getChildAccess().getChildrenGeneratorParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleChildrenGenerator();

                    state._fsp--;

                     after(grammarAccess.getChildAccess().getChildrenGeneratorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataSampleDSL.g:392:6: ( rulePolymorphicChildrenGenerator )
                    {
                    // InternalDataSampleDSL.g:392:6: ( rulePolymorphicChildrenGenerator )
                    // InternalDataSampleDSL.g:393:1: rulePolymorphicChildrenGenerator
                    {
                     before(grammarAccess.getChildAccess().getPolymorphicChildrenGeneratorParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePolymorphicChildrenGenerator();

                    state._fsp--;

                     after(grammarAccess.getChildAccess().getPolymorphicChildrenGeneratorParserRuleCall_1()); 

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
    // $ANTLR end "rule__Child__Alternatives"


    // $ANTLR start "rule__Language__Alternatives"
    // InternalDataSampleDSL.g:403:1: rule__Language__Alternatives : ( ( ( 'fr' ) ) | ( ( 'en' ) ) | ( ( 'de' ) ) | ( ( 'es' ) ) | ( ( 'it' ) ) );
    public final void rule__Language__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:407:1: ( ( ( 'fr' ) ) | ( ( 'en' ) ) | ( ( 'de' ) ) | ( ( 'es' ) ) | ( ( 'it' ) ) )
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
                    // InternalDataSampleDSL.g:408:1: ( ( 'fr' ) )
                    {
                    // InternalDataSampleDSL.g:408:1: ( ( 'fr' ) )
                    // InternalDataSampleDSL.g:409:1: ( 'fr' )
                    {
                     before(grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0()); 
                    // InternalDataSampleDSL.g:410:1: ( 'fr' )
                    // InternalDataSampleDSL.g:410:3: 'fr'
                    {
                    match(input,11,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataSampleDSL.g:415:6: ( ( 'en' ) )
                    {
                    // InternalDataSampleDSL.g:415:6: ( ( 'en' ) )
                    // InternalDataSampleDSL.g:416:1: ( 'en' )
                    {
                     before(grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1()); 
                    // InternalDataSampleDSL.g:417:1: ( 'en' )
                    // InternalDataSampleDSL.g:417:3: 'en'
                    {
                    match(input,12,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataSampleDSL.g:422:6: ( ( 'de' ) )
                    {
                    // InternalDataSampleDSL.g:422:6: ( ( 'de' ) )
                    // InternalDataSampleDSL.g:423:1: ( 'de' )
                    {
                     before(grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2()); 
                    // InternalDataSampleDSL.g:424:1: ( 'de' )
                    // InternalDataSampleDSL.g:424:3: 'de'
                    {
                    match(input,13,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataSampleDSL.g:429:6: ( ( 'es' ) )
                    {
                    // InternalDataSampleDSL.g:429:6: ( ( 'es' ) )
                    // InternalDataSampleDSL.g:430:1: ( 'es' )
                    {
                     before(grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3()); 
                    // InternalDataSampleDSL.g:431:1: ( 'es' )
                    // InternalDataSampleDSL.g:431:3: 'es'
                    {
                    match(input,14,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataSampleDSL.g:436:6: ( ( 'it' ) )
                    {
                    // InternalDataSampleDSL.g:436:6: ( ( 'it' ) )
                    // InternalDataSampleDSL.g:437:1: ( 'it' )
                    {
                     before(grammarAccess.getLanguageAccess().getItEnumLiteralDeclaration_4()); 
                    // InternalDataSampleDSL.g:438:1: ( 'it' )
                    // InternalDataSampleDSL.g:438:3: 'it'
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
    // InternalDataSampleDSL.g:450:1: rule__DataSample__Group__0 : rule__DataSample__Group__0__Impl rule__DataSample__Group__1 ;
    public final void rule__DataSample__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:454:1: ( rule__DataSample__Group__0__Impl rule__DataSample__Group__1 )
            // InternalDataSampleDSL.g:455:2: rule__DataSample__Group__0__Impl rule__DataSample__Group__1
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
    // InternalDataSampleDSL.g:462:1: rule__DataSample__Group__0__Impl : ( () ) ;
    public final void rule__DataSample__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:466:1: ( ( () ) )
            // InternalDataSampleDSL.g:467:1: ( () )
            {
            // InternalDataSampleDSL.g:467:1: ( () )
            // InternalDataSampleDSL.g:468:1: ()
            {
             before(grammarAccess.getDataSampleAccess().getDataSampleAction_0()); 
            // InternalDataSampleDSL.g:469:1: ()
            // InternalDataSampleDSL.g:471:1: 
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
    // InternalDataSampleDSL.g:481:1: rule__DataSample__Group__1 : rule__DataSample__Group__1__Impl rule__DataSample__Group__2 ;
    public final void rule__DataSample__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:485:1: ( rule__DataSample__Group__1__Impl rule__DataSample__Group__2 )
            // InternalDataSampleDSL.g:486:2: rule__DataSample__Group__1__Impl rule__DataSample__Group__2
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
    // InternalDataSampleDSL.g:493:1: rule__DataSample__Group__1__Impl : ( 'Sample' ) ;
    public final void rule__DataSample__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:497:1: ( ( 'Sample' ) )
            // InternalDataSampleDSL.g:498:1: ( 'Sample' )
            {
            // InternalDataSampleDSL.g:498:1: ( 'Sample' )
            // InternalDataSampleDSL.g:499:1: 'Sample'
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
    // InternalDataSampleDSL.g:512:1: rule__DataSample__Group__2 : rule__DataSample__Group__2__Impl rule__DataSample__Group__3 ;
    public final void rule__DataSample__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:516:1: ( rule__DataSample__Group__2__Impl rule__DataSample__Group__3 )
            // InternalDataSampleDSL.g:517:2: rule__DataSample__Group__2__Impl rule__DataSample__Group__3
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
    // InternalDataSampleDSL.g:524:1: rule__DataSample__Group__2__Impl : ( ( rule__DataSample__NameAssignment_2 ) ) ;
    public final void rule__DataSample__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:528:1: ( ( ( rule__DataSample__NameAssignment_2 ) ) )
            // InternalDataSampleDSL.g:529:1: ( ( rule__DataSample__NameAssignment_2 ) )
            {
            // InternalDataSampleDSL.g:529:1: ( ( rule__DataSample__NameAssignment_2 ) )
            // InternalDataSampleDSL.g:530:1: ( rule__DataSample__NameAssignment_2 )
            {
             before(grammarAccess.getDataSampleAccess().getNameAssignment_2()); 
            // InternalDataSampleDSL.g:531:1: ( rule__DataSample__NameAssignment_2 )
            // InternalDataSampleDSL.g:531:2: rule__DataSample__NameAssignment_2
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
    // InternalDataSampleDSL.g:541:1: rule__DataSample__Group__3 : rule__DataSample__Group__3__Impl rule__DataSample__Group__4 ;
    public final void rule__DataSample__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:545:1: ( rule__DataSample__Group__3__Impl rule__DataSample__Group__4 )
            // InternalDataSampleDSL.g:546:2: rule__DataSample__Group__3__Impl rule__DataSample__Group__4
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
    // InternalDataSampleDSL.g:553:1: rule__DataSample__Group__3__Impl : ( 'for' ) ;
    public final void rule__DataSample__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:557:1: ( ( 'for' ) )
            // InternalDataSampleDSL.g:558:1: ( 'for' )
            {
            // InternalDataSampleDSL.g:558:1: ( 'for' )
            // InternalDataSampleDSL.g:559:1: 'for'
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
    // InternalDataSampleDSL.g:572:1: rule__DataSample__Group__4 : rule__DataSample__Group__4__Impl rule__DataSample__Group__5 ;
    public final void rule__DataSample__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:576:1: ( rule__DataSample__Group__4__Impl rule__DataSample__Group__5 )
            // InternalDataSampleDSL.g:577:2: rule__DataSample__Group__4__Impl rule__DataSample__Group__5
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
    // InternalDataSampleDSL.g:584:1: rule__DataSample__Group__4__Impl : ( ( rule__DataSample__PackageURIAssignment_4 ) ) ;
    public final void rule__DataSample__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:588:1: ( ( ( rule__DataSample__PackageURIAssignment_4 ) ) )
            // InternalDataSampleDSL.g:589:1: ( ( rule__DataSample__PackageURIAssignment_4 ) )
            {
            // InternalDataSampleDSL.g:589:1: ( ( rule__DataSample__PackageURIAssignment_4 ) )
            // InternalDataSampleDSL.g:590:1: ( rule__DataSample__PackageURIAssignment_4 )
            {
             before(grammarAccess.getDataSampleAccess().getPackageURIAssignment_4()); 
            // InternalDataSampleDSL.g:591:1: ( rule__DataSample__PackageURIAssignment_4 )
            // InternalDataSampleDSL.g:591:2: rule__DataSample__PackageURIAssignment_4
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
    // InternalDataSampleDSL.g:601:1: rule__DataSample__Group__5 : rule__DataSample__Group__5__Impl rule__DataSample__Group__6 ;
    public final void rule__DataSample__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:605:1: ( rule__DataSample__Group__5__Impl rule__DataSample__Group__6 )
            // InternalDataSampleDSL.g:606:2: rule__DataSample__Group__5__Impl rule__DataSample__Group__6
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
    // InternalDataSampleDSL.g:613:1: rule__DataSample__Group__5__Impl : ( 'generateRootObject' ) ;
    public final void rule__DataSample__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:617:1: ( ( 'generateRootObject' ) )
            // InternalDataSampleDSL.g:618:1: ( 'generateRootObject' )
            {
            // InternalDataSampleDSL.g:618:1: ( 'generateRootObject' )
            // InternalDataSampleDSL.g:619:1: 'generateRootObject'
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
    // InternalDataSampleDSL.g:632:1: rule__DataSample__Group__6 : rule__DataSample__Group__6__Impl rule__DataSample__Group__7 ;
    public final void rule__DataSample__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:636:1: ( rule__DataSample__Group__6__Impl rule__DataSample__Group__7 )
            // InternalDataSampleDSL.g:637:2: rule__DataSample__Group__6__Impl rule__DataSample__Group__7
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
    // InternalDataSampleDSL.g:644:1: rule__DataSample__Group__6__Impl : ( ( rule__DataSample__RootEntityNameAssignment_6 ) ) ;
    public final void rule__DataSample__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:648:1: ( ( ( rule__DataSample__RootEntityNameAssignment_6 ) ) )
            // InternalDataSampleDSL.g:649:1: ( ( rule__DataSample__RootEntityNameAssignment_6 ) )
            {
            // InternalDataSampleDSL.g:649:1: ( ( rule__DataSample__RootEntityNameAssignment_6 ) )
            // InternalDataSampleDSL.g:650:1: ( rule__DataSample__RootEntityNameAssignment_6 )
            {
             before(grammarAccess.getDataSampleAccess().getRootEntityNameAssignment_6()); 
            // InternalDataSampleDSL.g:651:1: ( rule__DataSample__RootEntityNameAssignment_6 )
            // InternalDataSampleDSL.g:651:2: rule__DataSample__RootEntityNameAssignment_6
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
    // InternalDataSampleDSL.g:661:1: rule__DataSample__Group__7 : rule__DataSample__Group__7__Impl rule__DataSample__Group__8 ;
    public final void rule__DataSample__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:665:1: ( rule__DataSample__Group__7__Impl rule__DataSample__Group__8 )
            // InternalDataSampleDSL.g:666:2: rule__DataSample__Group__7__Impl rule__DataSample__Group__8
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
    // InternalDataSampleDSL.g:673:1: rule__DataSample__Group__7__Impl : ( ( rule__DataSample__Group_7__0 )? ) ;
    public final void rule__DataSample__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:677:1: ( ( ( rule__DataSample__Group_7__0 )? ) )
            // InternalDataSampleDSL.g:678:1: ( ( rule__DataSample__Group_7__0 )? )
            {
            // InternalDataSampleDSL.g:678:1: ( ( rule__DataSample__Group_7__0 )? )
            // InternalDataSampleDSL.g:679:1: ( rule__DataSample__Group_7__0 )?
            {
             before(grammarAccess.getDataSampleAccess().getGroup_7()); 
            // InternalDataSampleDSL.g:680:1: ( rule__DataSample__Group_7__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDataSampleDSL.g:680:2: rule__DataSample__Group_7__0
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
    // InternalDataSampleDSL.g:690:1: rule__DataSample__Group__8 : rule__DataSample__Group__8__Impl rule__DataSample__Group__9 ;
    public final void rule__DataSample__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:694:1: ( rule__DataSample__Group__8__Impl rule__DataSample__Group__9 )
            // InternalDataSampleDSL.g:695:2: rule__DataSample__Group__8__Impl rule__DataSample__Group__9
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
    // InternalDataSampleDSL.g:702:1: rule__DataSample__Group__8__Impl : ( ( rule__DataSample__Group_8__0 )? ) ;
    public final void rule__DataSample__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:706:1: ( ( ( rule__DataSample__Group_8__0 )? ) )
            // InternalDataSampleDSL.g:707:1: ( ( rule__DataSample__Group_8__0 )? )
            {
            // InternalDataSampleDSL.g:707:1: ( ( rule__DataSample__Group_8__0 )? )
            // InternalDataSampleDSL.g:708:1: ( rule__DataSample__Group_8__0 )?
            {
             before(grammarAccess.getDataSampleAccess().getGroup_8()); 
            // InternalDataSampleDSL.g:709:1: ( rule__DataSample__Group_8__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDataSampleDSL.g:709:2: rule__DataSample__Group_8__0
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
    // InternalDataSampleDSL.g:719:1: rule__DataSample__Group__9 : rule__DataSample__Group__9__Impl rule__DataSample__Group__10 ;
    public final void rule__DataSample__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:723:1: ( rule__DataSample__Group__9__Impl rule__DataSample__Group__10 )
            // InternalDataSampleDSL.g:724:2: rule__DataSample__Group__9__Impl rule__DataSample__Group__10
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
    // InternalDataSampleDSL.g:731:1: rule__DataSample__Group__9__Impl : ( ( rule__DataSample__Group_9__0 )? ) ;
    public final void rule__DataSample__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:735:1: ( ( ( rule__DataSample__Group_9__0 )? ) )
            // InternalDataSampleDSL.g:736:1: ( ( rule__DataSample__Group_9__0 )? )
            {
            // InternalDataSampleDSL.g:736:1: ( ( rule__DataSample__Group_9__0 )? )
            // InternalDataSampleDSL.g:737:1: ( rule__DataSample__Group_9__0 )?
            {
             before(grammarAccess.getDataSampleAccess().getGroup_9()); 
            // InternalDataSampleDSL.g:738:1: ( rule__DataSample__Group_9__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDataSampleDSL.g:738:2: rule__DataSample__Group_9__0
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
    // InternalDataSampleDSL.g:748:1: rule__DataSample__Group__10 : rule__DataSample__Group__10__Impl rule__DataSample__Group__11 ;
    public final void rule__DataSample__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:752:1: ( rule__DataSample__Group__10__Impl rule__DataSample__Group__11 )
            // InternalDataSampleDSL.g:753:2: rule__DataSample__Group__10__Impl rule__DataSample__Group__11
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
    // InternalDataSampleDSL.g:760:1: rule__DataSample__Group__10__Impl : ( 'rootGenerator' ) ;
    public final void rule__DataSample__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:764:1: ( ( 'rootGenerator' ) )
            // InternalDataSampleDSL.g:765:1: ( 'rootGenerator' )
            {
            // InternalDataSampleDSL.g:765:1: ( 'rootGenerator' )
            // InternalDataSampleDSL.g:766:1: 'rootGenerator'
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
    // InternalDataSampleDSL.g:779:1: rule__DataSample__Group__11 : rule__DataSample__Group__11__Impl ;
    public final void rule__DataSample__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:783:1: ( rule__DataSample__Group__11__Impl )
            // InternalDataSampleDSL.g:784:2: rule__DataSample__Group__11__Impl
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
    // InternalDataSampleDSL.g:790:1: rule__DataSample__Group__11__Impl : ( ( rule__DataSample__RootGeneratorAssignment_11 ) ) ;
    public final void rule__DataSample__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:794:1: ( ( ( rule__DataSample__RootGeneratorAssignment_11 ) ) )
            // InternalDataSampleDSL.g:795:1: ( ( rule__DataSample__RootGeneratorAssignment_11 ) )
            {
            // InternalDataSampleDSL.g:795:1: ( ( rule__DataSample__RootGeneratorAssignment_11 ) )
            // InternalDataSampleDSL.g:796:1: ( rule__DataSample__RootGeneratorAssignment_11 )
            {
             before(grammarAccess.getDataSampleAccess().getRootGeneratorAssignment_11()); 
            // InternalDataSampleDSL.g:797:1: ( rule__DataSample__RootGeneratorAssignment_11 )
            // InternalDataSampleDSL.g:797:2: rule__DataSample__RootGeneratorAssignment_11
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
    // InternalDataSampleDSL.g:831:1: rule__DataSample__Group_7__0 : rule__DataSample__Group_7__0__Impl rule__DataSample__Group_7__1 ;
    public final void rule__DataSample__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:835:1: ( rule__DataSample__Group_7__0__Impl rule__DataSample__Group_7__1 )
            // InternalDataSampleDSL.g:836:2: rule__DataSample__Group_7__0__Impl rule__DataSample__Group_7__1
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
    // InternalDataSampleDSL.g:843:1: rule__DataSample__Group_7__0__Impl : ( 'seed' ) ;
    public final void rule__DataSample__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:847:1: ( ( 'seed' ) )
            // InternalDataSampleDSL.g:848:1: ( 'seed' )
            {
            // InternalDataSampleDSL.g:848:1: ( 'seed' )
            // InternalDataSampleDSL.g:849:1: 'seed'
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
    // InternalDataSampleDSL.g:862:1: rule__DataSample__Group_7__1 : rule__DataSample__Group_7__1__Impl ;
    public final void rule__DataSample__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:866:1: ( rule__DataSample__Group_7__1__Impl )
            // InternalDataSampleDSL.g:867:2: rule__DataSample__Group_7__1__Impl
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
    // InternalDataSampleDSL.g:873:1: rule__DataSample__Group_7__1__Impl : ( ( rule__DataSample__SeedAssignment_7_1 ) ) ;
    public final void rule__DataSample__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:877:1: ( ( ( rule__DataSample__SeedAssignment_7_1 ) ) )
            // InternalDataSampleDSL.g:878:1: ( ( rule__DataSample__SeedAssignment_7_1 ) )
            {
            // InternalDataSampleDSL.g:878:1: ( ( rule__DataSample__SeedAssignment_7_1 ) )
            // InternalDataSampleDSL.g:879:1: ( rule__DataSample__SeedAssignment_7_1 )
            {
             before(grammarAccess.getDataSampleAccess().getSeedAssignment_7_1()); 
            // InternalDataSampleDSL.g:880:1: ( rule__DataSample__SeedAssignment_7_1 )
            // InternalDataSampleDSL.g:880:2: rule__DataSample__SeedAssignment_7_1
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
    // InternalDataSampleDSL.g:894:1: rule__DataSample__Group_8__0 : rule__DataSample__Group_8__0__Impl rule__DataSample__Group_8__1 ;
    public final void rule__DataSample__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:898:1: ( rule__DataSample__Group_8__0__Impl rule__DataSample__Group_8__1 )
            // InternalDataSampleDSL.g:899:2: rule__DataSample__Group_8__0__Impl rule__DataSample__Group_8__1
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
    // InternalDataSampleDSL.g:906:1: rule__DataSample__Group_8__0__Impl : ( 'language' ) ;
    public final void rule__DataSample__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:910:1: ( ( 'language' ) )
            // InternalDataSampleDSL.g:911:1: ( 'language' )
            {
            // InternalDataSampleDSL.g:911:1: ( 'language' )
            // InternalDataSampleDSL.g:912:1: 'language'
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
    // InternalDataSampleDSL.g:925:1: rule__DataSample__Group_8__1 : rule__DataSample__Group_8__1__Impl ;
    public final void rule__DataSample__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:929:1: ( rule__DataSample__Group_8__1__Impl )
            // InternalDataSampleDSL.g:930:2: rule__DataSample__Group_8__1__Impl
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
    // InternalDataSampleDSL.g:936:1: rule__DataSample__Group_8__1__Impl : ( ( rule__DataSample__LanguageAssignment_8_1 ) ) ;
    public final void rule__DataSample__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:940:1: ( ( ( rule__DataSample__LanguageAssignment_8_1 ) ) )
            // InternalDataSampleDSL.g:941:1: ( ( rule__DataSample__LanguageAssignment_8_1 ) )
            {
            // InternalDataSampleDSL.g:941:1: ( ( rule__DataSample__LanguageAssignment_8_1 ) )
            // InternalDataSampleDSL.g:942:1: ( rule__DataSample__LanguageAssignment_8_1 )
            {
             before(grammarAccess.getDataSampleAccess().getLanguageAssignment_8_1()); 
            // InternalDataSampleDSL.g:943:1: ( rule__DataSample__LanguageAssignment_8_1 )
            // InternalDataSampleDSL.g:943:2: rule__DataSample__LanguageAssignment_8_1
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
    // InternalDataSampleDSL.g:957:1: rule__DataSample__Group_9__0 : rule__DataSample__Group_9__0__Impl rule__DataSample__Group_9__1 ;
    public final void rule__DataSample__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:961:1: ( rule__DataSample__Group_9__0__Impl rule__DataSample__Group_9__1 )
            // InternalDataSampleDSL.g:962:2: rule__DataSample__Group_9__0__Impl rule__DataSample__Group_9__1
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
    // InternalDataSampleDSL.g:969:1: rule__DataSample__Group_9__0__Impl : ( 'fileExtension' ) ;
    public final void rule__DataSample__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:973:1: ( ( 'fileExtension' ) )
            // InternalDataSampleDSL.g:974:1: ( 'fileExtension' )
            {
            // InternalDataSampleDSL.g:974:1: ( 'fileExtension' )
            // InternalDataSampleDSL.g:975:1: 'fileExtension'
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
    // InternalDataSampleDSL.g:988:1: rule__DataSample__Group_9__1 : rule__DataSample__Group_9__1__Impl ;
    public final void rule__DataSample__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:992:1: ( rule__DataSample__Group_9__1__Impl )
            // InternalDataSampleDSL.g:993:2: rule__DataSample__Group_9__1__Impl
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
    // InternalDataSampleDSL.g:999:1: rule__DataSample__Group_9__1__Impl : ( ( rule__DataSample__FileExtensionAssignment_9_1 ) ) ;
    public final void rule__DataSample__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1003:1: ( ( ( rule__DataSample__FileExtensionAssignment_9_1 ) ) )
            // InternalDataSampleDSL.g:1004:1: ( ( rule__DataSample__FileExtensionAssignment_9_1 ) )
            {
            // InternalDataSampleDSL.g:1004:1: ( ( rule__DataSample__FileExtensionAssignment_9_1 ) )
            // InternalDataSampleDSL.g:1005:1: ( rule__DataSample__FileExtensionAssignment_9_1 )
            {
             before(grammarAccess.getDataSampleAccess().getFileExtensionAssignment_9_1()); 
            // InternalDataSampleDSL.g:1006:1: ( rule__DataSample__FileExtensionAssignment_9_1 )
            // InternalDataSampleDSL.g:1006:2: rule__DataSample__FileExtensionAssignment_9_1
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
    // InternalDataSampleDSL.g:1020:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1024:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalDataSampleDSL.g:1025:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalDataSampleDSL.g:1032:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1036:1: ( ( ( '-' )? ) )
            // InternalDataSampleDSL.g:1037:1: ( ( '-' )? )
            {
            // InternalDataSampleDSL.g:1037:1: ( ( '-' )? )
            // InternalDataSampleDSL.g:1038:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalDataSampleDSL.g:1039:1: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDataSampleDSL.g:1040:2: '-'
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
    // InternalDataSampleDSL.g:1051:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1055:1: ( rule__EInt__Group__1__Impl )
            // InternalDataSampleDSL.g:1056:2: rule__EInt__Group__1__Impl
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
    // InternalDataSampleDSL.g:1062:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1066:1: ( ( RULE_INT ) )
            // InternalDataSampleDSL.g:1067:1: ( RULE_INT )
            {
            // InternalDataSampleDSL.g:1067:1: ( RULE_INT )
            // InternalDataSampleDSL.g:1068:1: RULE_INT
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
    // InternalDataSampleDSL.g:1083:1: rule__EntityGenerator__Group__0 : rule__EntityGenerator__Group__0__Impl rule__EntityGenerator__Group__1 ;
    public final void rule__EntityGenerator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1087:1: ( rule__EntityGenerator__Group__0__Impl rule__EntityGenerator__Group__1 )
            // InternalDataSampleDSL.g:1088:2: rule__EntityGenerator__Group__0__Impl rule__EntityGenerator__Group__1
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
    // InternalDataSampleDSL.g:1095:1: rule__EntityGenerator__Group__0__Impl : ( () ) ;
    public final void rule__EntityGenerator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1099:1: ( ( () ) )
            // InternalDataSampleDSL.g:1100:1: ( () )
            {
            // InternalDataSampleDSL.g:1100:1: ( () )
            // InternalDataSampleDSL.g:1101:1: ()
            {
             before(grammarAccess.getEntityGeneratorAccess().getEntityGeneratorAction_0()); 
            // InternalDataSampleDSL.g:1102:1: ()
            // InternalDataSampleDSL.g:1104:1: 
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
    // InternalDataSampleDSL.g:1114:1: rule__EntityGenerator__Group__1 : rule__EntityGenerator__Group__1__Impl rule__EntityGenerator__Group__2 ;
    public final void rule__EntityGenerator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1118:1: ( rule__EntityGenerator__Group__1__Impl rule__EntityGenerator__Group__2 )
            // InternalDataSampleDSL.g:1119:2: rule__EntityGenerator__Group__1__Impl rule__EntityGenerator__Group__2
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
    // InternalDataSampleDSL.g:1126:1: rule__EntityGenerator__Group__1__Impl : ( 'generate' ) ;
    public final void rule__EntityGenerator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1130:1: ( ( 'generate' ) )
            // InternalDataSampleDSL.g:1131:1: ( 'generate' )
            {
            // InternalDataSampleDSL.g:1131:1: ( 'generate' )
            // InternalDataSampleDSL.g:1132:1: 'generate'
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
    // InternalDataSampleDSL.g:1145:1: rule__EntityGenerator__Group__2 : rule__EntityGenerator__Group__2__Impl rule__EntityGenerator__Group__3 ;
    public final void rule__EntityGenerator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1149:1: ( rule__EntityGenerator__Group__2__Impl rule__EntityGenerator__Group__3 )
            // InternalDataSampleDSL.g:1150:2: rule__EntityGenerator__Group__2__Impl rule__EntityGenerator__Group__3
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
    // InternalDataSampleDSL.g:1157:1: rule__EntityGenerator__Group__2__Impl : ( ( rule__EntityGenerator__Group_2__0 )? ) ;
    public final void rule__EntityGenerator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1161:1: ( ( ( rule__EntityGenerator__Group_2__0 )? ) )
            // InternalDataSampleDSL.g:1162:1: ( ( rule__EntityGenerator__Group_2__0 )? )
            {
            // InternalDataSampleDSL.g:1162:1: ( ( rule__EntityGenerator__Group_2__0 )? )
            // InternalDataSampleDSL.g:1163:1: ( rule__EntityGenerator__Group_2__0 )?
            {
             before(grammarAccess.getEntityGeneratorAccess().getGroup_2()); 
            // InternalDataSampleDSL.g:1164:1: ( rule__EntityGenerator__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT||LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDataSampleDSL.g:1164:2: rule__EntityGenerator__Group_2__0
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
    // InternalDataSampleDSL.g:1174:1: rule__EntityGenerator__Group__3 : rule__EntityGenerator__Group__3__Impl rule__EntityGenerator__Group__4 ;
    public final void rule__EntityGenerator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1178:1: ( rule__EntityGenerator__Group__3__Impl rule__EntityGenerator__Group__4 )
            // InternalDataSampleDSL.g:1179:2: rule__EntityGenerator__Group__3__Impl rule__EntityGenerator__Group__4
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
    // InternalDataSampleDSL.g:1186:1: rule__EntityGenerator__Group__3__Impl : ( ( rule__EntityGenerator__EntityNameAssignment_3 ) ) ;
    public final void rule__EntityGenerator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1190:1: ( ( ( rule__EntityGenerator__EntityNameAssignment_3 ) ) )
            // InternalDataSampleDSL.g:1191:1: ( ( rule__EntityGenerator__EntityNameAssignment_3 ) )
            {
            // InternalDataSampleDSL.g:1191:1: ( ( rule__EntityGenerator__EntityNameAssignment_3 ) )
            // InternalDataSampleDSL.g:1192:1: ( rule__EntityGenerator__EntityNameAssignment_3 )
            {
             before(grammarAccess.getEntityGeneratorAccess().getEntityNameAssignment_3()); 
            // InternalDataSampleDSL.g:1193:1: ( rule__EntityGenerator__EntityNameAssignment_3 )
            // InternalDataSampleDSL.g:1193:2: rule__EntityGenerator__EntityNameAssignment_3
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
    // InternalDataSampleDSL.g:1203:1: rule__EntityGenerator__Group__4 : rule__EntityGenerator__Group__4__Impl rule__EntityGenerator__Group__5 ;
    public final void rule__EntityGenerator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1207:1: ( rule__EntityGenerator__Group__4__Impl rule__EntityGenerator__Group__5 )
            // InternalDataSampleDSL.g:1208:2: rule__EntityGenerator__Group__4__Impl rule__EntityGenerator__Group__5
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
    // InternalDataSampleDSL.g:1215:1: rule__EntityGenerator__Group__4__Impl : ( '{' ) ;
    public final void rule__EntityGenerator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1219:1: ( ( '{' ) )
            // InternalDataSampleDSL.g:1220:1: ( '{' )
            {
            // InternalDataSampleDSL.g:1220:1: ( '{' )
            // InternalDataSampleDSL.g:1221:1: '{'
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
    // InternalDataSampleDSL.g:1234:1: rule__EntityGenerator__Group__5 : rule__EntityGenerator__Group__5__Impl rule__EntityGenerator__Group__6 ;
    public final void rule__EntityGenerator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1238:1: ( rule__EntityGenerator__Group__5__Impl rule__EntityGenerator__Group__6 )
            // InternalDataSampleDSL.g:1239:2: rule__EntityGenerator__Group__5__Impl rule__EntityGenerator__Group__6
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
    // InternalDataSampleDSL.g:1246:1: rule__EntityGenerator__Group__5__Impl : ( ( rule__EntityGenerator__FieldGeneratorsAssignment_5 )* ) ;
    public final void rule__EntityGenerator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1250:1: ( ( ( rule__EntityGenerator__FieldGeneratorsAssignment_5 )* ) )
            // InternalDataSampleDSL.g:1251:1: ( ( rule__EntityGenerator__FieldGeneratorsAssignment_5 )* )
            {
            // InternalDataSampleDSL.g:1251:1: ( ( rule__EntityGenerator__FieldGeneratorsAssignment_5 )* )
            // InternalDataSampleDSL.g:1252:1: ( rule__EntityGenerator__FieldGeneratorsAssignment_5 )*
            {
             before(grammarAccess.getEntityGeneratorAccess().getFieldGeneratorsAssignment_5()); 
            // InternalDataSampleDSL.g:1253:1: ( rule__EntityGenerator__FieldGeneratorsAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDataSampleDSL.g:1253:2: rule__EntityGenerator__FieldGeneratorsAssignment_5
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
    // InternalDataSampleDSL.g:1263:1: rule__EntityGenerator__Group__6 : rule__EntityGenerator__Group__6__Impl rule__EntityGenerator__Group__7 ;
    public final void rule__EntityGenerator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1267:1: ( rule__EntityGenerator__Group__6__Impl rule__EntityGenerator__Group__7 )
            // InternalDataSampleDSL.g:1268:2: rule__EntityGenerator__Group__6__Impl rule__EntityGenerator__Group__7
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
    // InternalDataSampleDSL.g:1275:1: rule__EntityGenerator__Group__6__Impl : ( ( rule__EntityGenerator__ChildGeneratorsAssignment_6 )* ) ;
    public final void rule__EntityGenerator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1279:1: ( ( ( rule__EntityGenerator__ChildGeneratorsAssignment_6 )* ) )
            // InternalDataSampleDSL.g:1280:1: ( ( rule__EntityGenerator__ChildGeneratorsAssignment_6 )* )
            {
            // InternalDataSampleDSL.g:1280:1: ( ( rule__EntityGenerator__ChildGeneratorsAssignment_6 )* )
            // InternalDataSampleDSL.g:1281:1: ( rule__EntityGenerator__ChildGeneratorsAssignment_6 )*
            {
             before(grammarAccess.getEntityGeneratorAccess().getChildGeneratorsAssignment_6()); 
            // InternalDataSampleDSL.g:1282:1: ( rule__EntityGenerator__ChildGeneratorsAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=36 && LA10_0<=37)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDataSampleDSL.g:1282:2: rule__EntityGenerator__ChildGeneratorsAssignment_6
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
    // InternalDataSampleDSL.g:1292:1: rule__EntityGenerator__Group__7 : rule__EntityGenerator__Group__7__Impl rule__EntityGenerator__Group__8 ;
    public final void rule__EntityGenerator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1296:1: ( rule__EntityGenerator__Group__7__Impl rule__EntityGenerator__Group__8 )
            // InternalDataSampleDSL.g:1297:2: rule__EntityGenerator__Group__7__Impl rule__EntityGenerator__Group__8
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
    // InternalDataSampleDSL.g:1304:1: rule__EntityGenerator__Group__7__Impl : ( ( rule__EntityGenerator__AssociationGeneratorsAssignment_7 )* ) ;
    public final void rule__EntityGenerator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1308:1: ( ( ( rule__EntityGenerator__AssociationGeneratorsAssignment_7 )* ) )
            // InternalDataSampleDSL.g:1309:1: ( ( rule__EntityGenerator__AssociationGeneratorsAssignment_7 )* )
            {
            // InternalDataSampleDSL.g:1309:1: ( ( rule__EntityGenerator__AssociationGeneratorsAssignment_7 )* )
            // InternalDataSampleDSL.g:1310:1: ( rule__EntityGenerator__AssociationGeneratorsAssignment_7 )*
            {
             before(grammarAccess.getEntityGeneratorAccess().getAssociationGeneratorsAssignment_7()); 
            // InternalDataSampleDSL.g:1311:1: ( rule__EntityGenerator__AssociationGeneratorsAssignment_7 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==38) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDataSampleDSL.g:1311:2: rule__EntityGenerator__AssociationGeneratorsAssignment_7
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
    // InternalDataSampleDSL.g:1321:1: rule__EntityGenerator__Group__8 : rule__EntityGenerator__Group__8__Impl ;
    public final void rule__EntityGenerator__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1325:1: ( rule__EntityGenerator__Group__8__Impl )
            // InternalDataSampleDSL.g:1326:2: rule__EntityGenerator__Group__8__Impl
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
    // InternalDataSampleDSL.g:1332:1: rule__EntityGenerator__Group__8__Impl : ( '}' ) ;
    public final void rule__EntityGenerator__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1336:1: ( ( '}' ) )
            // InternalDataSampleDSL.g:1337:1: ( '}' )
            {
            // InternalDataSampleDSL.g:1337:1: ( '}' )
            // InternalDataSampleDSL.g:1338:1: '}'
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
    // InternalDataSampleDSL.g:1369:1: rule__EntityGenerator__Group_2__0 : rule__EntityGenerator__Group_2__0__Impl rule__EntityGenerator__Group_2__1 ;
    public final void rule__EntityGenerator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1373:1: ( rule__EntityGenerator__Group_2__0__Impl rule__EntityGenerator__Group_2__1 )
            // InternalDataSampleDSL.g:1374:2: rule__EntityGenerator__Group_2__0__Impl rule__EntityGenerator__Group_2__1
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
    // InternalDataSampleDSL.g:1381:1: rule__EntityGenerator__Group_2__0__Impl : ( ( rule__EntityGenerator__NumberAssignment_2_0 ) ) ;
    public final void rule__EntityGenerator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1385:1: ( ( ( rule__EntityGenerator__NumberAssignment_2_0 ) ) )
            // InternalDataSampleDSL.g:1386:1: ( ( rule__EntityGenerator__NumberAssignment_2_0 ) )
            {
            // InternalDataSampleDSL.g:1386:1: ( ( rule__EntityGenerator__NumberAssignment_2_0 ) )
            // InternalDataSampleDSL.g:1387:1: ( rule__EntityGenerator__NumberAssignment_2_0 )
            {
             before(grammarAccess.getEntityGeneratorAccess().getNumberAssignment_2_0()); 
            // InternalDataSampleDSL.g:1388:1: ( rule__EntityGenerator__NumberAssignment_2_0 )
            // InternalDataSampleDSL.g:1388:2: rule__EntityGenerator__NumberAssignment_2_0
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
    // InternalDataSampleDSL.g:1398:1: rule__EntityGenerator__Group_2__1 : rule__EntityGenerator__Group_2__1__Impl ;
    public final void rule__EntityGenerator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1402:1: ( rule__EntityGenerator__Group_2__1__Impl )
            // InternalDataSampleDSL.g:1403:2: rule__EntityGenerator__Group_2__1__Impl
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
    // InternalDataSampleDSL.g:1409:1: rule__EntityGenerator__Group_2__1__Impl : ( 'instancesOf' ) ;
    public final void rule__EntityGenerator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1413:1: ( ( 'instancesOf' ) )
            // InternalDataSampleDSL.g:1414:1: ( 'instancesOf' )
            {
            // InternalDataSampleDSL.g:1414:1: ( 'instancesOf' )
            // InternalDataSampleDSL.g:1415:1: 'instancesOf'
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
    // InternalDataSampleDSL.g:1432:1: rule__FieldGenerator__Group__0 : rule__FieldGenerator__Group__0__Impl rule__FieldGenerator__Group__1 ;
    public final void rule__FieldGenerator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1436:1: ( rule__FieldGenerator__Group__0__Impl rule__FieldGenerator__Group__1 )
            // InternalDataSampleDSL.g:1437:2: rule__FieldGenerator__Group__0__Impl rule__FieldGenerator__Group__1
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
    // InternalDataSampleDSL.g:1444:1: rule__FieldGenerator__Group__0__Impl : ( () ) ;
    public final void rule__FieldGenerator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1448:1: ( ( () ) )
            // InternalDataSampleDSL.g:1449:1: ( () )
            {
            // InternalDataSampleDSL.g:1449:1: ( () )
            // InternalDataSampleDSL.g:1450:1: ()
            {
             before(grammarAccess.getFieldGeneratorAccess().getFieldGeneratorAction_0()); 
            // InternalDataSampleDSL.g:1451:1: ()
            // InternalDataSampleDSL.g:1453:1: 
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
    // InternalDataSampleDSL.g:1463:1: rule__FieldGenerator__Group__1 : rule__FieldGenerator__Group__1__Impl rule__FieldGenerator__Group__2 ;
    public final void rule__FieldGenerator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1467:1: ( rule__FieldGenerator__Group__1__Impl rule__FieldGenerator__Group__2 )
            // InternalDataSampleDSL.g:1468:2: rule__FieldGenerator__Group__1__Impl rule__FieldGenerator__Group__2
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
    // InternalDataSampleDSL.g:1475:1: rule__FieldGenerator__Group__1__Impl : ( 'forTheField' ) ;
    public final void rule__FieldGenerator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1479:1: ( ( 'forTheField' ) )
            // InternalDataSampleDSL.g:1480:1: ( 'forTheField' )
            {
            // InternalDataSampleDSL.g:1480:1: ( 'forTheField' )
            // InternalDataSampleDSL.g:1481:1: 'forTheField'
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
    // InternalDataSampleDSL.g:1494:1: rule__FieldGenerator__Group__2 : rule__FieldGenerator__Group__2__Impl rule__FieldGenerator__Group__3 ;
    public final void rule__FieldGenerator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1498:1: ( rule__FieldGenerator__Group__2__Impl rule__FieldGenerator__Group__3 )
            // InternalDataSampleDSL.g:1499:2: rule__FieldGenerator__Group__2__Impl rule__FieldGenerator__Group__3
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
    // InternalDataSampleDSL.g:1506:1: rule__FieldGenerator__Group__2__Impl : ( ( rule__FieldGenerator__FieldNameAssignment_2 ) ) ;
    public final void rule__FieldGenerator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1510:1: ( ( ( rule__FieldGenerator__FieldNameAssignment_2 ) ) )
            // InternalDataSampleDSL.g:1511:1: ( ( rule__FieldGenerator__FieldNameAssignment_2 ) )
            {
            // InternalDataSampleDSL.g:1511:1: ( ( rule__FieldGenerator__FieldNameAssignment_2 ) )
            // InternalDataSampleDSL.g:1512:1: ( rule__FieldGenerator__FieldNameAssignment_2 )
            {
             before(grammarAccess.getFieldGeneratorAccess().getFieldNameAssignment_2()); 
            // InternalDataSampleDSL.g:1513:1: ( rule__FieldGenerator__FieldNameAssignment_2 )
            // InternalDataSampleDSL.g:1513:2: rule__FieldGenerator__FieldNameAssignment_2
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
    // InternalDataSampleDSL.g:1523:1: rule__FieldGenerator__Group__3 : rule__FieldGenerator__Group__3__Impl rule__FieldGenerator__Group__4 ;
    public final void rule__FieldGenerator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1527:1: ( rule__FieldGenerator__Group__3__Impl rule__FieldGenerator__Group__4 )
            // InternalDataSampleDSL.g:1528:2: rule__FieldGenerator__Group__3__Impl rule__FieldGenerator__Group__4
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
    // InternalDataSampleDSL.g:1535:1: rule__FieldGenerator__Group__3__Impl : ( 'use' ) ;
    public final void rule__FieldGenerator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1539:1: ( ( 'use' ) )
            // InternalDataSampleDSL.g:1540:1: ( 'use' )
            {
            // InternalDataSampleDSL.g:1540:1: ( 'use' )
            // InternalDataSampleDSL.g:1541:1: 'use'
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
    // InternalDataSampleDSL.g:1554:1: rule__FieldGenerator__Group__4 : rule__FieldGenerator__Group__4__Impl rule__FieldGenerator__Group__5 ;
    public final void rule__FieldGenerator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1558:1: ( rule__FieldGenerator__Group__4__Impl rule__FieldGenerator__Group__5 )
            // InternalDataSampleDSL.g:1559:2: rule__FieldGenerator__Group__4__Impl rule__FieldGenerator__Group__5
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
    // InternalDataSampleDSL.g:1566:1: rule__FieldGenerator__Group__4__Impl : ( ( rule__FieldGenerator__GeneratorNameAssignment_4 ) ) ;
    public final void rule__FieldGenerator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1570:1: ( ( ( rule__FieldGenerator__GeneratorNameAssignment_4 ) ) )
            // InternalDataSampleDSL.g:1571:1: ( ( rule__FieldGenerator__GeneratorNameAssignment_4 ) )
            {
            // InternalDataSampleDSL.g:1571:1: ( ( rule__FieldGenerator__GeneratorNameAssignment_4 ) )
            // InternalDataSampleDSL.g:1572:1: ( rule__FieldGenerator__GeneratorNameAssignment_4 )
            {
             before(grammarAccess.getFieldGeneratorAccess().getGeneratorNameAssignment_4()); 
            // InternalDataSampleDSL.g:1573:1: ( rule__FieldGenerator__GeneratorNameAssignment_4 )
            // InternalDataSampleDSL.g:1573:2: rule__FieldGenerator__GeneratorNameAssignment_4
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
    // InternalDataSampleDSL.g:1583:1: rule__FieldGenerator__Group__5 : rule__FieldGenerator__Group__5__Impl rule__FieldGenerator__Group__6 ;
    public final void rule__FieldGenerator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1587:1: ( rule__FieldGenerator__Group__5__Impl rule__FieldGenerator__Group__6 )
            // InternalDataSampleDSL.g:1588:2: rule__FieldGenerator__Group__5__Impl rule__FieldGenerator__Group__6
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
    // InternalDataSampleDSL.g:1595:1: rule__FieldGenerator__Group__5__Impl : ( ( rule__FieldGenerator__Group_5__0 )? ) ;
    public final void rule__FieldGenerator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1599:1: ( ( ( rule__FieldGenerator__Group_5__0 )? ) )
            // InternalDataSampleDSL.g:1600:1: ( ( rule__FieldGenerator__Group_5__0 )? )
            {
            // InternalDataSampleDSL.g:1600:1: ( ( rule__FieldGenerator__Group_5__0 )? )
            // InternalDataSampleDSL.g:1601:1: ( rule__FieldGenerator__Group_5__0 )?
            {
             before(grammarAccess.getFieldGeneratorAccess().getGroup_5()); 
            // InternalDataSampleDSL.g:1602:1: ( rule__FieldGenerator__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDataSampleDSL.g:1602:2: rule__FieldGenerator__Group_5__0
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
    // InternalDataSampleDSL.g:1612:1: rule__FieldGenerator__Group__6 : rule__FieldGenerator__Group__6__Impl rule__FieldGenerator__Group__7 ;
    public final void rule__FieldGenerator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1616:1: ( rule__FieldGenerator__Group__6__Impl rule__FieldGenerator__Group__7 )
            // InternalDataSampleDSL.g:1617:2: rule__FieldGenerator__Group__6__Impl rule__FieldGenerator__Group__7
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
    // InternalDataSampleDSL.g:1624:1: rule__FieldGenerator__Group__6__Impl : ( ( rule__FieldGenerator__Group_6__0 )? ) ;
    public final void rule__FieldGenerator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1628:1: ( ( ( rule__FieldGenerator__Group_6__0 )? ) )
            // InternalDataSampleDSL.g:1629:1: ( ( rule__FieldGenerator__Group_6__0 )? )
            {
            // InternalDataSampleDSL.g:1629:1: ( ( rule__FieldGenerator__Group_6__0 )? )
            // InternalDataSampleDSL.g:1630:1: ( rule__FieldGenerator__Group_6__0 )?
            {
             before(grammarAccess.getFieldGeneratorAccess().getGroup_6()); 
            // InternalDataSampleDSL.g:1631:1: ( rule__FieldGenerator__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDataSampleDSL.g:1631:2: rule__FieldGenerator__Group_6__0
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
    // InternalDataSampleDSL.g:1641:1: rule__FieldGenerator__Group__7 : rule__FieldGenerator__Group__7__Impl ;
    public final void rule__FieldGenerator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1645:1: ( rule__FieldGenerator__Group__7__Impl )
            // InternalDataSampleDSL.g:1646:2: rule__FieldGenerator__Group__7__Impl
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
    // InternalDataSampleDSL.g:1652:1: rule__FieldGenerator__Group__7__Impl : ( ( rule__FieldGenerator__Group_7__0 )? ) ;
    public final void rule__FieldGenerator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1656:1: ( ( ( rule__FieldGenerator__Group_7__0 )? ) )
            // InternalDataSampleDSL.g:1657:1: ( ( rule__FieldGenerator__Group_7__0 )? )
            {
            // InternalDataSampleDSL.g:1657:1: ( ( rule__FieldGenerator__Group_7__0 )? )
            // InternalDataSampleDSL.g:1658:1: ( rule__FieldGenerator__Group_7__0 )?
            {
             before(grammarAccess.getFieldGeneratorAccess().getGroup_7()); 
            // InternalDataSampleDSL.g:1659:1: ( rule__FieldGenerator__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDataSampleDSL.g:1659:2: rule__FieldGenerator__Group_7__0
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
    // InternalDataSampleDSL.g:1685:1: rule__FieldGenerator__Group_5__0 : rule__FieldGenerator__Group_5__0__Impl rule__FieldGenerator__Group_5__1 ;
    public final void rule__FieldGenerator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1689:1: ( rule__FieldGenerator__Group_5__0__Impl rule__FieldGenerator__Group_5__1 )
            // InternalDataSampleDSL.g:1690:2: rule__FieldGenerator__Group_5__0__Impl rule__FieldGenerator__Group_5__1
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
    // InternalDataSampleDSL.g:1697:1: rule__FieldGenerator__Group_5__0__Impl : ( 'cardinality' ) ;
    public final void rule__FieldGenerator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1701:1: ( ( 'cardinality' ) )
            // InternalDataSampleDSL.g:1702:1: ( 'cardinality' )
            {
            // InternalDataSampleDSL.g:1702:1: ( 'cardinality' )
            // InternalDataSampleDSL.g:1703:1: 'cardinality'
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
    // InternalDataSampleDSL.g:1716:1: rule__FieldGenerator__Group_5__1 : rule__FieldGenerator__Group_5__1__Impl ;
    public final void rule__FieldGenerator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1720:1: ( rule__FieldGenerator__Group_5__1__Impl )
            // InternalDataSampleDSL.g:1721:2: rule__FieldGenerator__Group_5__1__Impl
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
    // InternalDataSampleDSL.g:1727:1: rule__FieldGenerator__Group_5__1__Impl : ( ( rule__FieldGenerator__NumberAssignment_5_1 ) ) ;
    public final void rule__FieldGenerator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1731:1: ( ( ( rule__FieldGenerator__NumberAssignment_5_1 ) ) )
            // InternalDataSampleDSL.g:1732:1: ( ( rule__FieldGenerator__NumberAssignment_5_1 ) )
            {
            // InternalDataSampleDSL.g:1732:1: ( ( rule__FieldGenerator__NumberAssignment_5_1 ) )
            // InternalDataSampleDSL.g:1733:1: ( rule__FieldGenerator__NumberAssignment_5_1 )
            {
             before(grammarAccess.getFieldGeneratorAccess().getNumberAssignment_5_1()); 
            // InternalDataSampleDSL.g:1734:1: ( rule__FieldGenerator__NumberAssignment_5_1 )
            // InternalDataSampleDSL.g:1734:2: rule__FieldGenerator__NumberAssignment_5_1
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
    // InternalDataSampleDSL.g:1748:1: rule__FieldGenerator__Group_6__0 : rule__FieldGenerator__Group_6__0__Impl rule__FieldGenerator__Group_6__1 ;
    public final void rule__FieldGenerator__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1752:1: ( rule__FieldGenerator__Group_6__0__Impl rule__FieldGenerator__Group_6__1 )
            // InternalDataSampleDSL.g:1753:2: rule__FieldGenerator__Group_6__0__Impl rule__FieldGenerator__Group_6__1
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
    // InternalDataSampleDSL.g:1760:1: rule__FieldGenerator__Group_6__0__Impl : ( '(' ) ;
    public final void rule__FieldGenerator__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1764:1: ( ( '(' ) )
            // InternalDataSampleDSL.g:1765:1: ( '(' )
            {
            // InternalDataSampleDSL.g:1765:1: ( '(' )
            // InternalDataSampleDSL.g:1766:1: '('
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
    // InternalDataSampleDSL.g:1779:1: rule__FieldGenerator__Group_6__1 : rule__FieldGenerator__Group_6__1__Impl rule__FieldGenerator__Group_6__2 ;
    public final void rule__FieldGenerator__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1783:1: ( rule__FieldGenerator__Group_6__1__Impl rule__FieldGenerator__Group_6__2 )
            // InternalDataSampleDSL.g:1784:2: rule__FieldGenerator__Group_6__1__Impl rule__FieldGenerator__Group_6__2
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
    // InternalDataSampleDSL.g:1791:1: rule__FieldGenerator__Group_6__1__Impl : ( ( rule__FieldGenerator__ParametersAssignment_6_1 ) ) ;
    public final void rule__FieldGenerator__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1795:1: ( ( ( rule__FieldGenerator__ParametersAssignment_6_1 ) ) )
            // InternalDataSampleDSL.g:1796:1: ( ( rule__FieldGenerator__ParametersAssignment_6_1 ) )
            {
            // InternalDataSampleDSL.g:1796:1: ( ( rule__FieldGenerator__ParametersAssignment_6_1 ) )
            // InternalDataSampleDSL.g:1797:1: ( rule__FieldGenerator__ParametersAssignment_6_1 )
            {
             before(grammarAccess.getFieldGeneratorAccess().getParametersAssignment_6_1()); 
            // InternalDataSampleDSL.g:1798:1: ( rule__FieldGenerator__ParametersAssignment_6_1 )
            // InternalDataSampleDSL.g:1798:2: rule__FieldGenerator__ParametersAssignment_6_1
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
    // InternalDataSampleDSL.g:1808:1: rule__FieldGenerator__Group_6__2 : rule__FieldGenerator__Group_6__2__Impl rule__FieldGenerator__Group_6__3 ;
    public final void rule__FieldGenerator__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1812:1: ( rule__FieldGenerator__Group_6__2__Impl rule__FieldGenerator__Group_6__3 )
            // InternalDataSampleDSL.g:1813:2: rule__FieldGenerator__Group_6__2__Impl rule__FieldGenerator__Group_6__3
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
    // InternalDataSampleDSL.g:1820:1: rule__FieldGenerator__Group_6__2__Impl : ( ( rule__FieldGenerator__Group_6_2__0 )* ) ;
    public final void rule__FieldGenerator__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1824:1: ( ( ( rule__FieldGenerator__Group_6_2__0 )* ) )
            // InternalDataSampleDSL.g:1825:1: ( ( rule__FieldGenerator__Group_6_2__0 )* )
            {
            // InternalDataSampleDSL.g:1825:1: ( ( rule__FieldGenerator__Group_6_2__0 )* )
            // InternalDataSampleDSL.g:1826:1: ( rule__FieldGenerator__Group_6_2__0 )*
            {
             before(grammarAccess.getFieldGeneratorAccess().getGroup_6_2()); 
            // InternalDataSampleDSL.g:1827:1: ( rule__FieldGenerator__Group_6_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDataSampleDSL.g:1827:2: rule__FieldGenerator__Group_6_2__0
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
    // InternalDataSampleDSL.g:1837:1: rule__FieldGenerator__Group_6__3 : rule__FieldGenerator__Group_6__3__Impl ;
    public final void rule__FieldGenerator__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1841:1: ( rule__FieldGenerator__Group_6__3__Impl )
            // InternalDataSampleDSL.g:1842:2: rule__FieldGenerator__Group_6__3__Impl
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
    // InternalDataSampleDSL.g:1848:1: rule__FieldGenerator__Group_6__3__Impl : ( ')' ) ;
    public final void rule__FieldGenerator__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1852:1: ( ( ')' ) )
            // InternalDataSampleDSL.g:1853:1: ( ')' )
            {
            // InternalDataSampleDSL.g:1853:1: ( ')' )
            // InternalDataSampleDSL.g:1854:1: ')'
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
    // InternalDataSampleDSL.g:1875:1: rule__FieldGenerator__Group_6_2__0 : rule__FieldGenerator__Group_6_2__0__Impl rule__FieldGenerator__Group_6_2__1 ;
    public final void rule__FieldGenerator__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1879:1: ( rule__FieldGenerator__Group_6_2__0__Impl rule__FieldGenerator__Group_6_2__1 )
            // InternalDataSampleDSL.g:1880:2: rule__FieldGenerator__Group_6_2__0__Impl rule__FieldGenerator__Group_6_2__1
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
    // InternalDataSampleDSL.g:1887:1: rule__FieldGenerator__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__FieldGenerator__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1891:1: ( ( ',' ) )
            // InternalDataSampleDSL.g:1892:1: ( ',' )
            {
            // InternalDataSampleDSL.g:1892:1: ( ',' )
            // InternalDataSampleDSL.g:1893:1: ','
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
    // InternalDataSampleDSL.g:1906:1: rule__FieldGenerator__Group_6_2__1 : rule__FieldGenerator__Group_6_2__1__Impl ;
    public final void rule__FieldGenerator__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1910:1: ( rule__FieldGenerator__Group_6_2__1__Impl )
            // InternalDataSampleDSL.g:1911:2: rule__FieldGenerator__Group_6_2__1__Impl
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
    // InternalDataSampleDSL.g:1917:1: rule__FieldGenerator__Group_6_2__1__Impl : ( ( rule__FieldGenerator__ParametersAssignment_6_2_1 ) ) ;
    public final void rule__FieldGenerator__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1921:1: ( ( ( rule__FieldGenerator__ParametersAssignment_6_2_1 ) ) )
            // InternalDataSampleDSL.g:1922:1: ( ( rule__FieldGenerator__ParametersAssignment_6_2_1 ) )
            {
            // InternalDataSampleDSL.g:1922:1: ( ( rule__FieldGenerator__ParametersAssignment_6_2_1 ) )
            // InternalDataSampleDSL.g:1923:1: ( rule__FieldGenerator__ParametersAssignment_6_2_1 )
            {
             before(grammarAccess.getFieldGeneratorAccess().getParametersAssignment_6_2_1()); 
            // InternalDataSampleDSL.g:1924:1: ( rule__FieldGenerator__ParametersAssignment_6_2_1 )
            // InternalDataSampleDSL.g:1924:2: rule__FieldGenerator__ParametersAssignment_6_2_1
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
    // InternalDataSampleDSL.g:1938:1: rule__FieldGenerator__Group_7__0 : rule__FieldGenerator__Group_7__0__Impl rule__FieldGenerator__Group_7__1 ;
    public final void rule__FieldGenerator__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1942:1: ( rule__FieldGenerator__Group_7__0__Impl rule__FieldGenerator__Group_7__1 )
            // InternalDataSampleDSL.g:1943:2: rule__FieldGenerator__Group_7__0__Impl rule__FieldGenerator__Group_7__1
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
    // InternalDataSampleDSL.g:1950:1: rule__FieldGenerator__Group_7__0__Impl : ( 'withErrorRate=' ) ;
    public final void rule__FieldGenerator__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1954:1: ( ( 'withErrorRate=' ) )
            // InternalDataSampleDSL.g:1955:1: ( 'withErrorRate=' )
            {
            // InternalDataSampleDSL.g:1955:1: ( 'withErrorRate=' )
            // InternalDataSampleDSL.g:1956:1: 'withErrorRate='
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
    // InternalDataSampleDSL.g:1969:1: rule__FieldGenerator__Group_7__1 : rule__FieldGenerator__Group_7__1__Impl rule__FieldGenerator__Group_7__2 ;
    public final void rule__FieldGenerator__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1973:1: ( rule__FieldGenerator__Group_7__1__Impl rule__FieldGenerator__Group_7__2 )
            // InternalDataSampleDSL.g:1974:2: rule__FieldGenerator__Group_7__1__Impl rule__FieldGenerator__Group_7__2
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
    // InternalDataSampleDSL.g:1981:1: rule__FieldGenerator__Group_7__1__Impl : ( ( rule__FieldGenerator__ErrorRateAssignment_7_1 ) ) ;
    public final void rule__FieldGenerator__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1985:1: ( ( ( rule__FieldGenerator__ErrorRateAssignment_7_1 ) ) )
            // InternalDataSampleDSL.g:1986:1: ( ( rule__FieldGenerator__ErrorRateAssignment_7_1 ) )
            {
            // InternalDataSampleDSL.g:1986:1: ( ( rule__FieldGenerator__ErrorRateAssignment_7_1 ) )
            // InternalDataSampleDSL.g:1987:1: ( rule__FieldGenerator__ErrorRateAssignment_7_1 )
            {
             before(grammarAccess.getFieldGeneratorAccess().getErrorRateAssignment_7_1()); 
            // InternalDataSampleDSL.g:1988:1: ( rule__FieldGenerator__ErrorRateAssignment_7_1 )
            // InternalDataSampleDSL.g:1988:2: rule__FieldGenerator__ErrorRateAssignment_7_1
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
    // InternalDataSampleDSL.g:1998:1: rule__FieldGenerator__Group_7__2 : rule__FieldGenerator__Group_7__2__Impl rule__FieldGenerator__Group_7__3 ;
    public final void rule__FieldGenerator__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2002:1: ( rule__FieldGenerator__Group_7__2__Impl rule__FieldGenerator__Group_7__3 )
            // InternalDataSampleDSL.g:2003:2: rule__FieldGenerator__Group_7__2__Impl rule__FieldGenerator__Group_7__3
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
    // InternalDataSampleDSL.g:2010:1: rule__FieldGenerator__Group_7__2__Impl : ( 'generatedWith' ) ;
    public final void rule__FieldGenerator__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2014:1: ( ( 'generatedWith' ) )
            // InternalDataSampleDSL.g:2015:1: ( 'generatedWith' )
            {
            // InternalDataSampleDSL.g:2015:1: ( 'generatedWith' )
            // InternalDataSampleDSL.g:2016:1: 'generatedWith'
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
    // InternalDataSampleDSL.g:2029:1: rule__FieldGenerator__Group_7__3 : rule__FieldGenerator__Group_7__3__Impl ;
    public final void rule__FieldGenerator__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2033:1: ( rule__FieldGenerator__Group_7__3__Impl )
            // InternalDataSampleDSL.g:2034:2: rule__FieldGenerator__Group_7__3__Impl
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
    // InternalDataSampleDSL.g:2040:1: rule__FieldGenerator__Group_7__3__Impl : ( ( rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3 ) ) ;
    public final void rule__FieldGenerator__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2044:1: ( ( ( rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3 ) ) )
            // InternalDataSampleDSL.g:2045:1: ( ( rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3 ) )
            {
            // InternalDataSampleDSL.g:2045:1: ( ( rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3 ) )
            // InternalDataSampleDSL.g:2046:1: ( rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3 )
            {
             before(grammarAccess.getFieldGeneratorAccess().getErrorGeneratorNameAssignment_7_3()); 
            // InternalDataSampleDSL.g:2047:1: ( rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3 )
            // InternalDataSampleDSL.g:2047:2: rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3
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
    // InternalDataSampleDSL.g:2065:1: rule__ChildrenGenerator__Group__0 : rule__ChildrenGenerator__Group__0__Impl rule__ChildrenGenerator__Group__1 ;
    public final void rule__ChildrenGenerator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2069:1: ( rule__ChildrenGenerator__Group__0__Impl rule__ChildrenGenerator__Group__1 )
            // InternalDataSampleDSL.g:2070:2: rule__ChildrenGenerator__Group__0__Impl rule__ChildrenGenerator__Group__1
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
    // InternalDataSampleDSL.g:2077:1: rule__ChildrenGenerator__Group__0__Impl : ( () ) ;
    public final void rule__ChildrenGenerator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2081:1: ( ( () ) )
            // InternalDataSampleDSL.g:2082:1: ( () )
            {
            // InternalDataSampleDSL.g:2082:1: ( () )
            // InternalDataSampleDSL.g:2083:1: ()
            {
             before(grammarAccess.getChildrenGeneratorAccess().getChildrenGeneratorAction_0()); 
            // InternalDataSampleDSL.g:2084:1: ()
            // InternalDataSampleDSL.g:2086:1: 
            {
            }

             after(grammarAccess.getChildrenGeneratorAccess().getChildrenGeneratorAction_0()); 

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
    // InternalDataSampleDSL.g:2096:1: rule__ChildrenGenerator__Group__1 : rule__ChildrenGenerator__Group__1__Impl rule__ChildrenGenerator__Group__2 ;
    public final void rule__ChildrenGenerator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2100:1: ( rule__ChildrenGenerator__Group__1__Impl rule__ChildrenGenerator__Group__2 )
            // InternalDataSampleDSL.g:2101:2: rule__ChildrenGenerator__Group__1__Impl rule__ChildrenGenerator__Group__2
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
    // InternalDataSampleDSL.g:2108:1: rule__ChildrenGenerator__Group__1__Impl : ( 'forTheComposition' ) ;
    public final void rule__ChildrenGenerator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2112:1: ( ( 'forTheComposition' ) )
            // InternalDataSampleDSL.g:2113:1: ( 'forTheComposition' )
            {
            // InternalDataSampleDSL.g:2113:1: ( 'forTheComposition' )
            // InternalDataSampleDSL.g:2114:1: 'forTheComposition'
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
    // InternalDataSampleDSL.g:2127:1: rule__ChildrenGenerator__Group__2 : rule__ChildrenGenerator__Group__2__Impl rule__ChildrenGenerator__Group__3 ;
    public final void rule__ChildrenGenerator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2131:1: ( rule__ChildrenGenerator__Group__2__Impl rule__ChildrenGenerator__Group__3 )
            // InternalDataSampleDSL.g:2132:2: rule__ChildrenGenerator__Group__2__Impl rule__ChildrenGenerator__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalDataSampleDSL.g:2139:1: rule__ChildrenGenerator__Group__2__Impl : ( ( rule__ChildrenGenerator__FieldNameAssignment_2 ) ) ;
    public final void rule__ChildrenGenerator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2143:1: ( ( ( rule__ChildrenGenerator__FieldNameAssignment_2 ) ) )
            // InternalDataSampleDSL.g:2144:1: ( ( rule__ChildrenGenerator__FieldNameAssignment_2 ) )
            {
            // InternalDataSampleDSL.g:2144:1: ( ( rule__ChildrenGenerator__FieldNameAssignment_2 ) )
            // InternalDataSampleDSL.g:2145:1: ( rule__ChildrenGenerator__FieldNameAssignment_2 )
            {
             before(grammarAccess.getChildrenGeneratorAccess().getFieldNameAssignment_2()); 
            // InternalDataSampleDSL.g:2146:1: ( rule__ChildrenGenerator__FieldNameAssignment_2 )
            // InternalDataSampleDSL.g:2146:2: rule__ChildrenGenerator__FieldNameAssignment_2
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
    // InternalDataSampleDSL.g:2156:1: rule__ChildrenGenerator__Group__3 : rule__ChildrenGenerator__Group__3__Impl ;
    public final void rule__ChildrenGenerator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2160:1: ( rule__ChildrenGenerator__Group__3__Impl )
            // InternalDataSampleDSL.g:2161:2: rule__ChildrenGenerator__Group__3__Impl
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
    // InternalDataSampleDSL.g:2167:1: rule__ChildrenGenerator__Group__3__Impl : ( ( rule__ChildrenGenerator__DelegatedEntityGeneratorAssignment_3 ) ) ;
    public final void rule__ChildrenGenerator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2171:1: ( ( ( rule__ChildrenGenerator__DelegatedEntityGeneratorAssignment_3 ) ) )
            // InternalDataSampleDSL.g:2172:1: ( ( rule__ChildrenGenerator__DelegatedEntityGeneratorAssignment_3 ) )
            {
            // InternalDataSampleDSL.g:2172:1: ( ( rule__ChildrenGenerator__DelegatedEntityGeneratorAssignment_3 ) )
            // InternalDataSampleDSL.g:2173:1: ( rule__ChildrenGenerator__DelegatedEntityGeneratorAssignment_3 )
            {
             before(grammarAccess.getChildrenGeneratorAccess().getDelegatedEntityGeneratorAssignment_3()); 
            // InternalDataSampleDSL.g:2174:1: ( rule__ChildrenGenerator__DelegatedEntityGeneratorAssignment_3 )
            // InternalDataSampleDSL.g:2174:2: rule__ChildrenGenerator__DelegatedEntityGeneratorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__DelegatedEntityGeneratorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChildrenGeneratorAccess().getDelegatedEntityGeneratorAssignment_3()); 

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


    // $ANTLR start "rule__PolymorphicChildrenGenerator__Group__0"
    // InternalDataSampleDSL.g:2192:1: rule__PolymorphicChildrenGenerator__Group__0 : rule__PolymorphicChildrenGenerator__Group__0__Impl rule__PolymorphicChildrenGenerator__Group__1 ;
    public final void rule__PolymorphicChildrenGenerator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2196:1: ( rule__PolymorphicChildrenGenerator__Group__0__Impl rule__PolymorphicChildrenGenerator__Group__1 )
            // InternalDataSampleDSL.g:2197:2: rule__PolymorphicChildrenGenerator__Group__0__Impl rule__PolymorphicChildrenGenerator__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__PolymorphicChildrenGenerator__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PolymorphicChildrenGenerator__Group__1();

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
    // $ANTLR end "rule__PolymorphicChildrenGenerator__Group__0"


    // $ANTLR start "rule__PolymorphicChildrenGenerator__Group__0__Impl"
    // InternalDataSampleDSL.g:2204:1: rule__PolymorphicChildrenGenerator__Group__0__Impl : ( () ) ;
    public final void rule__PolymorphicChildrenGenerator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2208:1: ( ( () ) )
            // InternalDataSampleDSL.g:2209:1: ( () )
            {
            // InternalDataSampleDSL.g:2209:1: ( () )
            // InternalDataSampleDSL.g:2210:1: ()
            {
             before(grammarAccess.getPolymorphicChildrenGeneratorAccess().getPolymorphicChildrenGeneratorAction_0()); 
            // InternalDataSampleDSL.g:2211:1: ()
            // InternalDataSampleDSL.g:2213:1: 
            {
            }

             after(grammarAccess.getPolymorphicChildrenGeneratorAccess().getPolymorphicChildrenGeneratorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolymorphicChildrenGenerator__Group__0__Impl"


    // $ANTLR start "rule__PolymorphicChildrenGenerator__Group__1"
    // InternalDataSampleDSL.g:2223:1: rule__PolymorphicChildrenGenerator__Group__1 : rule__PolymorphicChildrenGenerator__Group__1__Impl rule__PolymorphicChildrenGenerator__Group__2 ;
    public final void rule__PolymorphicChildrenGenerator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2227:1: ( rule__PolymorphicChildrenGenerator__Group__1__Impl rule__PolymorphicChildrenGenerator__Group__2 )
            // InternalDataSampleDSL.g:2228:2: rule__PolymorphicChildrenGenerator__Group__1__Impl rule__PolymorphicChildrenGenerator__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__PolymorphicChildrenGenerator__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PolymorphicChildrenGenerator__Group__2();

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
    // $ANTLR end "rule__PolymorphicChildrenGenerator__Group__1"


    // $ANTLR start "rule__PolymorphicChildrenGenerator__Group__1__Impl"
    // InternalDataSampleDSL.g:2235:1: rule__PolymorphicChildrenGenerator__Group__1__Impl : ( 'forTheAbstractComposition' ) ;
    public final void rule__PolymorphicChildrenGenerator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2239:1: ( ( 'forTheAbstractComposition' ) )
            // InternalDataSampleDSL.g:2240:1: ( 'forTheAbstractComposition' )
            {
            // InternalDataSampleDSL.g:2240:1: ( 'forTheAbstractComposition' )
            // InternalDataSampleDSL.g:2241:1: 'forTheAbstractComposition'
            {
             before(grammarAccess.getPolymorphicChildrenGeneratorAccess().getForTheAbstractCompositionKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPolymorphicChildrenGeneratorAccess().getForTheAbstractCompositionKeyword_1()); 

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
    // $ANTLR end "rule__PolymorphicChildrenGenerator__Group__1__Impl"


    // $ANTLR start "rule__PolymorphicChildrenGenerator__Group__2"
    // InternalDataSampleDSL.g:2254:1: rule__PolymorphicChildrenGenerator__Group__2 : rule__PolymorphicChildrenGenerator__Group__2__Impl rule__PolymorphicChildrenGenerator__Group__3 ;
    public final void rule__PolymorphicChildrenGenerator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2258:1: ( rule__PolymorphicChildrenGenerator__Group__2__Impl rule__PolymorphicChildrenGenerator__Group__3 )
            // InternalDataSampleDSL.g:2259:2: rule__PolymorphicChildrenGenerator__Group__2__Impl rule__PolymorphicChildrenGenerator__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__PolymorphicChildrenGenerator__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PolymorphicChildrenGenerator__Group__3();

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
    // $ANTLR end "rule__PolymorphicChildrenGenerator__Group__2"


    // $ANTLR start "rule__PolymorphicChildrenGenerator__Group__2__Impl"
    // InternalDataSampleDSL.g:2266:1: rule__PolymorphicChildrenGenerator__Group__2__Impl : ( ( rule__PolymorphicChildrenGenerator__FieldNameAssignment_2 ) ) ;
    public final void rule__PolymorphicChildrenGenerator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2270:1: ( ( ( rule__PolymorphicChildrenGenerator__FieldNameAssignment_2 ) ) )
            // InternalDataSampleDSL.g:2271:1: ( ( rule__PolymorphicChildrenGenerator__FieldNameAssignment_2 ) )
            {
            // InternalDataSampleDSL.g:2271:1: ( ( rule__PolymorphicChildrenGenerator__FieldNameAssignment_2 ) )
            // InternalDataSampleDSL.g:2272:1: ( rule__PolymorphicChildrenGenerator__FieldNameAssignment_2 )
            {
             before(grammarAccess.getPolymorphicChildrenGeneratorAccess().getFieldNameAssignment_2()); 
            // InternalDataSampleDSL.g:2273:1: ( rule__PolymorphicChildrenGenerator__FieldNameAssignment_2 )
            // InternalDataSampleDSL.g:2273:2: rule__PolymorphicChildrenGenerator__FieldNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PolymorphicChildrenGenerator__FieldNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPolymorphicChildrenGeneratorAccess().getFieldNameAssignment_2()); 

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
    // $ANTLR end "rule__PolymorphicChildrenGenerator__Group__2__Impl"


    // $ANTLR start "rule__PolymorphicChildrenGenerator__Group__3"
    // InternalDataSampleDSL.g:2283:1: rule__PolymorphicChildrenGenerator__Group__3 : rule__PolymorphicChildrenGenerator__Group__3__Impl rule__PolymorphicChildrenGenerator__Group__4 ;
    public final void rule__PolymorphicChildrenGenerator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2287:1: ( rule__PolymorphicChildrenGenerator__Group__3__Impl rule__PolymorphicChildrenGenerator__Group__4 )
            // InternalDataSampleDSL.g:2288:2: rule__PolymorphicChildrenGenerator__Group__3__Impl rule__PolymorphicChildrenGenerator__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__PolymorphicChildrenGenerator__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PolymorphicChildrenGenerator__Group__4();

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
    // $ANTLR end "rule__PolymorphicChildrenGenerator__Group__3"


    // $ANTLR start "rule__PolymorphicChildrenGenerator__Group__3__Impl"
    // InternalDataSampleDSL.g:2295:1: rule__PolymorphicChildrenGenerator__Group__3__Impl : ( 'use' ) ;
    public final void rule__PolymorphicChildrenGenerator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2299:1: ( ( 'use' ) )
            // InternalDataSampleDSL.g:2300:1: ( 'use' )
            {
            // InternalDataSampleDSL.g:2300:1: ( 'use' )
            // InternalDataSampleDSL.g:2301:1: 'use'
            {
             before(grammarAccess.getPolymorphicChildrenGeneratorAccess().getUseKeyword_3()); 
            match(input,29,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPolymorphicChildrenGeneratorAccess().getUseKeyword_3()); 

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
    // $ANTLR end "rule__PolymorphicChildrenGenerator__Group__3__Impl"


    // $ANTLR start "rule__PolymorphicChildrenGenerator__Group__4"
    // InternalDataSampleDSL.g:2314:1: rule__PolymorphicChildrenGenerator__Group__4 : rule__PolymorphicChildrenGenerator__Group__4__Impl rule__PolymorphicChildrenGenerator__Group__5 ;
    public final void rule__PolymorphicChildrenGenerator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2318:1: ( rule__PolymorphicChildrenGenerator__Group__4__Impl rule__PolymorphicChildrenGenerator__Group__5 )
            // InternalDataSampleDSL.g:2319:2: rule__PolymorphicChildrenGenerator__Group__4__Impl rule__PolymorphicChildrenGenerator__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__PolymorphicChildrenGenerator__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PolymorphicChildrenGenerator__Group__5();

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
    // $ANTLR end "rule__PolymorphicChildrenGenerator__Group__4"


    // $ANTLR start "rule__PolymorphicChildrenGenerator__Group__4__Impl"
    // InternalDataSampleDSL.g:2326:1: rule__PolymorphicChildrenGenerator__Group__4__Impl : ( '{' ) ;
    public final void rule__PolymorphicChildrenGenerator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2330:1: ( ( '{' ) )
            // InternalDataSampleDSL.g:2331:1: ( '{' )
            {
            // InternalDataSampleDSL.g:2331:1: ( '{' )
            // InternalDataSampleDSL.g:2332:1: '{'
            {
             before(grammarAccess.getPolymorphicChildrenGeneratorAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPolymorphicChildrenGeneratorAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__PolymorphicChildrenGenerator__Group__4__Impl"


    // $ANTLR start "rule__PolymorphicChildrenGenerator__Group__5"
    // InternalDataSampleDSL.g:2345:1: rule__PolymorphicChildrenGenerator__Group__5 : rule__PolymorphicChildrenGenerator__Group__5__Impl rule__PolymorphicChildrenGenerator__Group__6 ;
    public final void rule__PolymorphicChildrenGenerator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2349:1: ( rule__PolymorphicChildrenGenerator__Group__5__Impl rule__PolymorphicChildrenGenerator__Group__6 )
            // InternalDataSampleDSL.g:2350:2: rule__PolymorphicChildrenGenerator__Group__5__Impl rule__PolymorphicChildrenGenerator__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__PolymorphicChildrenGenerator__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PolymorphicChildrenGenerator__Group__6();

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
    // $ANTLR end "rule__PolymorphicChildrenGenerator__Group__5"


    // $ANTLR start "rule__PolymorphicChildrenGenerator__Group__5__Impl"
    // InternalDataSampleDSL.g:2357:1: rule__PolymorphicChildrenGenerator__Group__5__Impl : ( ( rule__PolymorphicChildrenGenerator__ChildrenGeneratorsAssignment_5 )* ) ;
    public final void rule__PolymorphicChildrenGenerator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2361:1: ( ( ( rule__PolymorphicChildrenGenerator__ChildrenGeneratorsAssignment_5 )* ) )
            // InternalDataSampleDSL.g:2362:1: ( ( rule__PolymorphicChildrenGenerator__ChildrenGeneratorsAssignment_5 )* )
            {
            // InternalDataSampleDSL.g:2362:1: ( ( rule__PolymorphicChildrenGenerator__ChildrenGeneratorsAssignment_5 )* )
            // InternalDataSampleDSL.g:2363:1: ( rule__PolymorphicChildrenGenerator__ChildrenGeneratorsAssignment_5 )*
            {
             before(grammarAccess.getPolymorphicChildrenGeneratorAccess().getChildrenGeneratorsAssignment_5()); 
            // InternalDataSampleDSL.g:2364:1: ( rule__PolymorphicChildrenGenerator__ChildrenGeneratorsAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDataSampleDSL.g:2364:2: rule__PolymorphicChildrenGenerator__ChildrenGeneratorsAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__PolymorphicChildrenGenerator__ChildrenGeneratorsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getPolymorphicChildrenGeneratorAccess().getChildrenGeneratorsAssignment_5()); 

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
    // $ANTLR end "rule__PolymorphicChildrenGenerator__Group__5__Impl"


    // $ANTLR start "rule__PolymorphicChildrenGenerator__Group__6"
    // InternalDataSampleDSL.g:2374:1: rule__PolymorphicChildrenGenerator__Group__6 : rule__PolymorphicChildrenGenerator__Group__6__Impl ;
    public final void rule__PolymorphicChildrenGenerator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2378:1: ( rule__PolymorphicChildrenGenerator__Group__6__Impl )
            // InternalDataSampleDSL.g:2379:2: rule__PolymorphicChildrenGenerator__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PolymorphicChildrenGenerator__Group__6__Impl();

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
    // $ANTLR end "rule__PolymorphicChildrenGenerator__Group__6"


    // $ANTLR start "rule__PolymorphicChildrenGenerator__Group__6__Impl"
    // InternalDataSampleDSL.g:2385:1: rule__PolymorphicChildrenGenerator__Group__6__Impl : ( '}' ) ;
    public final void rule__PolymorphicChildrenGenerator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2389:1: ( ( '}' ) )
            // InternalDataSampleDSL.g:2390:1: ( '}' )
            {
            // InternalDataSampleDSL.g:2390:1: ( '}' )
            // InternalDataSampleDSL.g:2391:1: '}'
            {
             before(grammarAccess.getPolymorphicChildrenGeneratorAccess().getRightCurlyBracketKeyword_6()); 
            match(input,26,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPolymorphicChildrenGeneratorAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__PolymorphicChildrenGenerator__Group__6__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group__0"
    // InternalDataSampleDSL.g:2418:1: rule__AssociationGenerator__Group__0 : rule__AssociationGenerator__Group__0__Impl rule__AssociationGenerator__Group__1 ;
    public final void rule__AssociationGenerator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2422:1: ( rule__AssociationGenerator__Group__0__Impl rule__AssociationGenerator__Group__1 )
            // InternalDataSampleDSL.g:2423:2: rule__AssociationGenerator__Group__0__Impl rule__AssociationGenerator__Group__1
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
    // InternalDataSampleDSL.g:2430:1: rule__AssociationGenerator__Group__0__Impl : ( () ) ;
    public final void rule__AssociationGenerator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2434:1: ( ( () ) )
            // InternalDataSampleDSL.g:2435:1: ( () )
            {
            // InternalDataSampleDSL.g:2435:1: ( () )
            // InternalDataSampleDSL.g:2436:1: ()
            {
             before(grammarAccess.getAssociationGeneratorAccess().getAssociationGeneratorAction_0()); 
            // InternalDataSampleDSL.g:2437:1: ()
            // InternalDataSampleDSL.g:2439:1: 
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
    // InternalDataSampleDSL.g:2449:1: rule__AssociationGenerator__Group__1 : rule__AssociationGenerator__Group__1__Impl rule__AssociationGenerator__Group__2 ;
    public final void rule__AssociationGenerator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2453:1: ( rule__AssociationGenerator__Group__1__Impl rule__AssociationGenerator__Group__2 )
            // InternalDataSampleDSL.g:2454:2: rule__AssociationGenerator__Group__1__Impl rule__AssociationGenerator__Group__2
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
    // InternalDataSampleDSL.g:2461:1: rule__AssociationGenerator__Group__1__Impl : ( 'forTheAssociation' ) ;
    public final void rule__AssociationGenerator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2465:1: ( ( 'forTheAssociation' ) )
            // InternalDataSampleDSL.g:2466:1: ( 'forTheAssociation' )
            {
            // InternalDataSampleDSL.g:2466:1: ( 'forTheAssociation' )
            // InternalDataSampleDSL.g:2467:1: 'forTheAssociation'
            {
             before(grammarAccess.getAssociationGeneratorAccess().getForTheAssociationKeyword_1()); 
            match(input,38,FollowSets000.FOLLOW_2); 
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
    // InternalDataSampleDSL.g:2480:1: rule__AssociationGenerator__Group__2 : rule__AssociationGenerator__Group__2__Impl rule__AssociationGenerator__Group__3 ;
    public final void rule__AssociationGenerator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2484:1: ( rule__AssociationGenerator__Group__2__Impl rule__AssociationGenerator__Group__3 )
            // InternalDataSampleDSL.g:2485:2: rule__AssociationGenerator__Group__2__Impl rule__AssociationGenerator__Group__3
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
    // InternalDataSampleDSL.g:2492:1: rule__AssociationGenerator__Group__2__Impl : ( ( rule__AssociationGenerator__FieldNameAssignment_2 ) ) ;
    public final void rule__AssociationGenerator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2496:1: ( ( ( rule__AssociationGenerator__FieldNameAssignment_2 ) ) )
            // InternalDataSampleDSL.g:2497:1: ( ( rule__AssociationGenerator__FieldNameAssignment_2 ) )
            {
            // InternalDataSampleDSL.g:2497:1: ( ( rule__AssociationGenerator__FieldNameAssignment_2 ) )
            // InternalDataSampleDSL.g:2498:1: ( rule__AssociationGenerator__FieldNameAssignment_2 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getFieldNameAssignment_2()); 
            // InternalDataSampleDSL.g:2499:1: ( rule__AssociationGenerator__FieldNameAssignment_2 )
            // InternalDataSampleDSL.g:2499:2: rule__AssociationGenerator__FieldNameAssignment_2
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
    // InternalDataSampleDSL.g:2509:1: rule__AssociationGenerator__Group__3 : rule__AssociationGenerator__Group__3__Impl rule__AssociationGenerator__Group__4 ;
    public final void rule__AssociationGenerator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2513:1: ( rule__AssociationGenerator__Group__3__Impl rule__AssociationGenerator__Group__4 )
            // InternalDataSampleDSL.g:2514:2: rule__AssociationGenerator__Group__3__Impl rule__AssociationGenerator__Group__4
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
    // InternalDataSampleDSL.g:2521:1: rule__AssociationGenerator__Group__3__Impl : ( 'use' ) ;
    public final void rule__AssociationGenerator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2525:1: ( ( 'use' ) )
            // InternalDataSampleDSL.g:2526:1: ( 'use' )
            {
            // InternalDataSampleDSL.g:2526:1: ( 'use' )
            // InternalDataSampleDSL.g:2527:1: 'use'
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
    // InternalDataSampleDSL.g:2540:1: rule__AssociationGenerator__Group__4 : rule__AssociationGenerator__Group__4__Impl rule__AssociationGenerator__Group__5 ;
    public final void rule__AssociationGenerator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2544:1: ( rule__AssociationGenerator__Group__4__Impl rule__AssociationGenerator__Group__5 )
            // InternalDataSampleDSL.g:2545:2: rule__AssociationGenerator__Group__4__Impl rule__AssociationGenerator__Group__5
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
    // InternalDataSampleDSL.g:2552:1: rule__AssociationGenerator__Group__4__Impl : ( ( rule__AssociationGenerator__GeneratorNameAssignment_4 ) ) ;
    public final void rule__AssociationGenerator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2556:1: ( ( ( rule__AssociationGenerator__GeneratorNameAssignment_4 ) ) )
            // InternalDataSampleDSL.g:2557:1: ( ( rule__AssociationGenerator__GeneratorNameAssignment_4 ) )
            {
            // InternalDataSampleDSL.g:2557:1: ( ( rule__AssociationGenerator__GeneratorNameAssignment_4 ) )
            // InternalDataSampleDSL.g:2558:1: ( rule__AssociationGenerator__GeneratorNameAssignment_4 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getGeneratorNameAssignment_4()); 
            // InternalDataSampleDSL.g:2559:1: ( rule__AssociationGenerator__GeneratorNameAssignment_4 )
            // InternalDataSampleDSL.g:2559:2: rule__AssociationGenerator__GeneratorNameAssignment_4
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
    // InternalDataSampleDSL.g:2569:1: rule__AssociationGenerator__Group__5 : rule__AssociationGenerator__Group__5__Impl rule__AssociationGenerator__Group__6 ;
    public final void rule__AssociationGenerator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2573:1: ( rule__AssociationGenerator__Group__5__Impl rule__AssociationGenerator__Group__6 )
            // InternalDataSampleDSL.g:2574:2: rule__AssociationGenerator__Group__5__Impl rule__AssociationGenerator__Group__6
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
    // InternalDataSampleDSL.g:2581:1: rule__AssociationGenerator__Group__5__Impl : ( ( rule__AssociationGenerator__Group_5__0 )? ) ;
    public final void rule__AssociationGenerator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2585:1: ( ( ( rule__AssociationGenerator__Group_5__0 )? ) )
            // InternalDataSampleDSL.g:2586:1: ( ( rule__AssociationGenerator__Group_5__0 )? )
            {
            // InternalDataSampleDSL.g:2586:1: ( ( rule__AssociationGenerator__Group_5__0 )? )
            // InternalDataSampleDSL.g:2587:1: ( rule__AssociationGenerator__Group_5__0 )?
            {
             before(grammarAccess.getAssociationGeneratorAccess().getGroup_5()); 
            // InternalDataSampleDSL.g:2588:1: ( rule__AssociationGenerator__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDataSampleDSL.g:2588:2: rule__AssociationGenerator__Group_5__0
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
    // InternalDataSampleDSL.g:2598:1: rule__AssociationGenerator__Group__6 : rule__AssociationGenerator__Group__6__Impl rule__AssociationGenerator__Group__7 ;
    public final void rule__AssociationGenerator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2602:1: ( rule__AssociationGenerator__Group__6__Impl rule__AssociationGenerator__Group__7 )
            // InternalDataSampleDSL.g:2603:2: rule__AssociationGenerator__Group__6__Impl rule__AssociationGenerator__Group__7
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
    // InternalDataSampleDSL.g:2610:1: rule__AssociationGenerator__Group__6__Impl : ( ( rule__AssociationGenerator__Group_6__0 )? ) ;
    public final void rule__AssociationGenerator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2614:1: ( ( ( rule__AssociationGenerator__Group_6__0 )? ) )
            // InternalDataSampleDSL.g:2615:1: ( ( rule__AssociationGenerator__Group_6__0 )? )
            {
            // InternalDataSampleDSL.g:2615:1: ( ( rule__AssociationGenerator__Group_6__0 )? )
            // InternalDataSampleDSL.g:2616:1: ( rule__AssociationGenerator__Group_6__0 )?
            {
             before(grammarAccess.getAssociationGeneratorAccess().getGroup_6()); 
            // InternalDataSampleDSL.g:2617:1: ( rule__AssociationGenerator__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDataSampleDSL.g:2617:2: rule__AssociationGenerator__Group_6__0
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
    // InternalDataSampleDSL.g:2627:1: rule__AssociationGenerator__Group__7 : rule__AssociationGenerator__Group__7__Impl ;
    public final void rule__AssociationGenerator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2631:1: ( rule__AssociationGenerator__Group__7__Impl )
            // InternalDataSampleDSL.g:2632:2: rule__AssociationGenerator__Group__7__Impl
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
    // InternalDataSampleDSL.g:2638:1: rule__AssociationGenerator__Group__7__Impl : ( ( rule__AssociationGenerator__Group_7__0 )? ) ;
    public final void rule__AssociationGenerator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2642:1: ( ( ( rule__AssociationGenerator__Group_7__0 )? ) )
            // InternalDataSampleDSL.g:2643:1: ( ( rule__AssociationGenerator__Group_7__0 )? )
            {
            // InternalDataSampleDSL.g:2643:1: ( ( rule__AssociationGenerator__Group_7__0 )? )
            // InternalDataSampleDSL.g:2644:1: ( rule__AssociationGenerator__Group_7__0 )?
            {
             before(grammarAccess.getAssociationGeneratorAccess().getGroup_7()); 
            // InternalDataSampleDSL.g:2645:1: ( rule__AssociationGenerator__Group_7__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDataSampleDSL.g:2645:2: rule__AssociationGenerator__Group_7__0
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
    // InternalDataSampleDSL.g:2671:1: rule__AssociationGenerator__Group_5__0 : rule__AssociationGenerator__Group_5__0__Impl rule__AssociationGenerator__Group_5__1 ;
    public final void rule__AssociationGenerator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2675:1: ( rule__AssociationGenerator__Group_5__0__Impl rule__AssociationGenerator__Group_5__1 )
            // InternalDataSampleDSL.g:2676:2: rule__AssociationGenerator__Group_5__0__Impl rule__AssociationGenerator__Group_5__1
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
    // InternalDataSampleDSL.g:2683:1: rule__AssociationGenerator__Group_5__0__Impl : ( 'cardinality' ) ;
    public final void rule__AssociationGenerator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2687:1: ( ( 'cardinality' ) )
            // InternalDataSampleDSL.g:2688:1: ( 'cardinality' )
            {
            // InternalDataSampleDSL.g:2688:1: ( 'cardinality' )
            // InternalDataSampleDSL.g:2689:1: 'cardinality'
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
    // InternalDataSampleDSL.g:2702:1: rule__AssociationGenerator__Group_5__1 : rule__AssociationGenerator__Group_5__1__Impl ;
    public final void rule__AssociationGenerator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2706:1: ( rule__AssociationGenerator__Group_5__1__Impl )
            // InternalDataSampleDSL.g:2707:2: rule__AssociationGenerator__Group_5__1__Impl
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
    // InternalDataSampleDSL.g:2713:1: rule__AssociationGenerator__Group_5__1__Impl : ( ( rule__AssociationGenerator__NumberAssignment_5_1 ) ) ;
    public final void rule__AssociationGenerator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2717:1: ( ( ( rule__AssociationGenerator__NumberAssignment_5_1 ) ) )
            // InternalDataSampleDSL.g:2718:1: ( ( rule__AssociationGenerator__NumberAssignment_5_1 ) )
            {
            // InternalDataSampleDSL.g:2718:1: ( ( rule__AssociationGenerator__NumberAssignment_5_1 ) )
            // InternalDataSampleDSL.g:2719:1: ( rule__AssociationGenerator__NumberAssignment_5_1 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getNumberAssignment_5_1()); 
            // InternalDataSampleDSL.g:2720:1: ( rule__AssociationGenerator__NumberAssignment_5_1 )
            // InternalDataSampleDSL.g:2720:2: rule__AssociationGenerator__NumberAssignment_5_1
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
    // InternalDataSampleDSL.g:2734:1: rule__AssociationGenerator__Group_6__0 : rule__AssociationGenerator__Group_6__0__Impl rule__AssociationGenerator__Group_6__1 ;
    public final void rule__AssociationGenerator__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2738:1: ( rule__AssociationGenerator__Group_6__0__Impl rule__AssociationGenerator__Group_6__1 )
            // InternalDataSampleDSL.g:2739:2: rule__AssociationGenerator__Group_6__0__Impl rule__AssociationGenerator__Group_6__1
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
    // InternalDataSampleDSL.g:2746:1: rule__AssociationGenerator__Group_6__0__Impl : ( '(' ) ;
    public final void rule__AssociationGenerator__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2750:1: ( ( '(' ) )
            // InternalDataSampleDSL.g:2751:1: ( '(' )
            {
            // InternalDataSampleDSL.g:2751:1: ( '(' )
            // InternalDataSampleDSL.g:2752:1: '('
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
    // InternalDataSampleDSL.g:2765:1: rule__AssociationGenerator__Group_6__1 : rule__AssociationGenerator__Group_6__1__Impl rule__AssociationGenerator__Group_6__2 ;
    public final void rule__AssociationGenerator__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2769:1: ( rule__AssociationGenerator__Group_6__1__Impl rule__AssociationGenerator__Group_6__2 )
            // InternalDataSampleDSL.g:2770:2: rule__AssociationGenerator__Group_6__1__Impl rule__AssociationGenerator__Group_6__2
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
    // InternalDataSampleDSL.g:2777:1: rule__AssociationGenerator__Group_6__1__Impl : ( ( rule__AssociationGenerator__ParametersAssignment_6_1 ) ) ;
    public final void rule__AssociationGenerator__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2781:1: ( ( ( rule__AssociationGenerator__ParametersAssignment_6_1 ) ) )
            // InternalDataSampleDSL.g:2782:1: ( ( rule__AssociationGenerator__ParametersAssignment_6_1 ) )
            {
            // InternalDataSampleDSL.g:2782:1: ( ( rule__AssociationGenerator__ParametersAssignment_6_1 ) )
            // InternalDataSampleDSL.g:2783:1: ( rule__AssociationGenerator__ParametersAssignment_6_1 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getParametersAssignment_6_1()); 
            // InternalDataSampleDSL.g:2784:1: ( rule__AssociationGenerator__ParametersAssignment_6_1 )
            // InternalDataSampleDSL.g:2784:2: rule__AssociationGenerator__ParametersAssignment_6_1
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
    // InternalDataSampleDSL.g:2794:1: rule__AssociationGenerator__Group_6__2 : rule__AssociationGenerator__Group_6__2__Impl rule__AssociationGenerator__Group_6__3 ;
    public final void rule__AssociationGenerator__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2798:1: ( rule__AssociationGenerator__Group_6__2__Impl rule__AssociationGenerator__Group_6__3 )
            // InternalDataSampleDSL.g:2799:2: rule__AssociationGenerator__Group_6__2__Impl rule__AssociationGenerator__Group_6__3
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
    // InternalDataSampleDSL.g:2806:1: rule__AssociationGenerator__Group_6__2__Impl : ( ( rule__AssociationGenerator__Group_6_2__0 )* ) ;
    public final void rule__AssociationGenerator__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2810:1: ( ( ( rule__AssociationGenerator__Group_6_2__0 )* ) )
            // InternalDataSampleDSL.g:2811:1: ( ( rule__AssociationGenerator__Group_6_2__0 )* )
            {
            // InternalDataSampleDSL.g:2811:1: ( ( rule__AssociationGenerator__Group_6_2__0 )* )
            // InternalDataSampleDSL.g:2812:1: ( rule__AssociationGenerator__Group_6_2__0 )*
            {
             before(grammarAccess.getAssociationGeneratorAccess().getGroup_6_2()); 
            // InternalDataSampleDSL.g:2813:1: ( rule__AssociationGenerator__Group_6_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDataSampleDSL.g:2813:2: rule__AssociationGenerator__Group_6_2__0
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
    // InternalDataSampleDSL.g:2823:1: rule__AssociationGenerator__Group_6__3 : rule__AssociationGenerator__Group_6__3__Impl ;
    public final void rule__AssociationGenerator__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2827:1: ( rule__AssociationGenerator__Group_6__3__Impl )
            // InternalDataSampleDSL.g:2828:2: rule__AssociationGenerator__Group_6__3__Impl
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
    // InternalDataSampleDSL.g:2834:1: rule__AssociationGenerator__Group_6__3__Impl : ( ')' ) ;
    public final void rule__AssociationGenerator__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2838:1: ( ( ')' ) )
            // InternalDataSampleDSL.g:2839:1: ( ')' )
            {
            // InternalDataSampleDSL.g:2839:1: ( ')' )
            // InternalDataSampleDSL.g:2840:1: ')'
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
    // InternalDataSampleDSL.g:2861:1: rule__AssociationGenerator__Group_6_2__0 : rule__AssociationGenerator__Group_6_2__0__Impl rule__AssociationGenerator__Group_6_2__1 ;
    public final void rule__AssociationGenerator__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2865:1: ( rule__AssociationGenerator__Group_6_2__0__Impl rule__AssociationGenerator__Group_6_2__1 )
            // InternalDataSampleDSL.g:2866:2: rule__AssociationGenerator__Group_6_2__0__Impl rule__AssociationGenerator__Group_6_2__1
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
    // InternalDataSampleDSL.g:2873:1: rule__AssociationGenerator__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__AssociationGenerator__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2877:1: ( ( ',' ) )
            // InternalDataSampleDSL.g:2878:1: ( ',' )
            {
            // InternalDataSampleDSL.g:2878:1: ( ',' )
            // InternalDataSampleDSL.g:2879:1: ','
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
    // InternalDataSampleDSL.g:2892:1: rule__AssociationGenerator__Group_6_2__1 : rule__AssociationGenerator__Group_6_2__1__Impl ;
    public final void rule__AssociationGenerator__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2896:1: ( rule__AssociationGenerator__Group_6_2__1__Impl )
            // InternalDataSampleDSL.g:2897:2: rule__AssociationGenerator__Group_6_2__1__Impl
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
    // InternalDataSampleDSL.g:2903:1: rule__AssociationGenerator__Group_6_2__1__Impl : ( ( rule__AssociationGenerator__ParametersAssignment_6_2_1 ) ) ;
    public final void rule__AssociationGenerator__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2907:1: ( ( ( rule__AssociationGenerator__ParametersAssignment_6_2_1 ) ) )
            // InternalDataSampleDSL.g:2908:1: ( ( rule__AssociationGenerator__ParametersAssignment_6_2_1 ) )
            {
            // InternalDataSampleDSL.g:2908:1: ( ( rule__AssociationGenerator__ParametersAssignment_6_2_1 ) )
            // InternalDataSampleDSL.g:2909:1: ( rule__AssociationGenerator__ParametersAssignment_6_2_1 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getParametersAssignment_6_2_1()); 
            // InternalDataSampleDSL.g:2910:1: ( rule__AssociationGenerator__ParametersAssignment_6_2_1 )
            // InternalDataSampleDSL.g:2910:2: rule__AssociationGenerator__ParametersAssignment_6_2_1
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
    // InternalDataSampleDSL.g:2924:1: rule__AssociationGenerator__Group_7__0 : rule__AssociationGenerator__Group_7__0__Impl rule__AssociationGenerator__Group_7__1 ;
    public final void rule__AssociationGenerator__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2928:1: ( rule__AssociationGenerator__Group_7__0__Impl rule__AssociationGenerator__Group_7__1 )
            // InternalDataSampleDSL.g:2929:2: rule__AssociationGenerator__Group_7__0__Impl rule__AssociationGenerator__Group_7__1
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
    // InternalDataSampleDSL.g:2936:1: rule__AssociationGenerator__Group_7__0__Impl : ( 'withErrorRate=' ) ;
    public final void rule__AssociationGenerator__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2940:1: ( ( 'withErrorRate=' ) )
            // InternalDataSampleDSL.g:2941:1: ( 'withErrorRate=' )
            {
            // InternalDataSampleDSL.g:2941:1: ( 'withErrorRate=' )
            // InternalDataSampleDSL.g:2942:1: 'withErrorRate='
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
    // InternalDataSampleDSL.g:2955:1: rule__AssociationGenerator__Group_7__1 : rule__AssociationGenerator__Group_7__1__Impl rule__AssociationGenerator__Group_7__2 ;
    public final void rule__AssociationGenerator__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2959:1: ( rule__AssociationGenerator__Group_7__1__Impl rule__AssociationGenerator__Group_7__2 )
            // InternalDataSampleDSL.g:2960:2: rule__AssociationGenerator__Group_7__1__Impl rule__AssociationGenerator__Group_7__2
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
    // InternalDataSampleDSL.g:2967:1: rule__AssociationGenerator__Group_7__1__Impl : ( ( rule__AssociationGenerator__ErrorRateAssignment_7_1 ) ) ;
    public final void rule__AssociationGenerator__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2971:1: ( ( ( rule__AssociationGenerator__ErrorRateAssignment_7_1 ) ) )
            // InternalDataSampleDSL.g:2972:1: ( ( rule__AssociationGenerator__ErrorRateAssignment_7_1 ) )
            {
            // InternalDataSampleDSL.g:2972:1: ( ( rule__AssociationGenerator__ErrorRateAssignment_7_1 ) )
            // InternalDataSampleDSL.g:2973:1: ( rule__AssociationGenerator__ErrorRateAssignment_7_1 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getErrorRateAssignment_7_1()); 
            // InternalDataSampleDSL.g:2974:1: ( rule__AssociationGenerator__ErrorRateAssignment_7_1 )
            // InternalDataSampleDSL.g:2974:2: rule__AssociationGenerator__ErrorRateAssignment_7_1
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
    // InternalDataSampleDSL.g:2984:1: rule__AssociationGenerator__Group_7__2 : rule__AssociationGenerator__Group_7__2__Impl rule__AssociationGenerator__Group_7__3 ;
    public final void rule__AssociationGenerator__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2988:1: ( rule__AssociationGenerator__Group_7__2__Impl rule__AssociationGenerator__Group_7__3 )
            // InternalDataSampleDSL.g:2989:2: rule__AssociationGenerator__Group_7__2__Impl rule__AssociationGenerator__Group_7__3
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
    // InternalDataSampleDSL.g:2996:1: rule__AssociationGenerator__Group_7__2__Impl : ( 'generatedWith' ) ;
    public final void rule__AssociationGenerator__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3000:1: ( ( 'generatedWith' ) )
            // InternalDataSampleDSL.g:3001:1: ( 'generatedWith' )
            {
            // InternalDataSampleDSL.g:3001:1: ( 'generatedWith' )
            // InternalDataSampleDSL.g:3002:1: 'generatedWith'
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
    // InternalDataSampleDSL.g:3015:1: rule__AssociationGenerator__Group_7__3 : rule__AssociationGenerator__Group_7__3__Impl ;
    public final void rule__AssociationGenerator__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3019:1: ( rule__AssociationGenerator__Group_7__3__Impl )
            // InternalDataSampleDSL.g:3020:2: rule__AssociationGenerator__Group_7__3__Impl
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
    // InternalDataSampleDSL.g:3026:1: rule__AssociationGenerator__Group_7__3__Impl : ( ( rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3 ) ) ;
    public final void rule__AssociationGenerator__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3030:1: ( ( ( rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3 ) ) )
            // InternalDataSampleDSL.g:3031:1: ( ( rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3 ) )
            {
            // InternalDataSampleDSL.g:3031:1: ( ( rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3 ) )
            // InternalDataSampleDSL.g:3032:1: ( rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getErrorGeneratorNameAssignment_7_3()); 
            // InternalDataSampleDSL.g:3033:1: ( rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3 )
            // InternalDataSampleDSL.g:3033:2: rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3
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
    // InternalDataSampleDSL.g:3051:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3055:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalDataSampleDSL.g:3056:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalDataSampleDSL.g:3063:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3067:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalDataSampleDSL.g:3068:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalDataSampleDSL.g:3068:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalDataSampleDSL.g:3069:1: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalDataSampleDSL.g:3070:1: ( rule__Parameter__NameAssignment_0 )
            // InternalDataSampleDSL.g:3070:2: rule__Parameter__NameAssignment_0
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
    // InternalDataSampleDSL.g:3080:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3084:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalDataSampleDSL.g:3085:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalDataSampleDSL.g:3092:1: rule__Parameter__Group__1__Impl : ( '=' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3096:1: ( ( '=' ) )
            // InternalDataSampleDSL.g:3097:1: ( '=' )
            {
            // InternalDataSampleDSL.g:3097:1: ( '=' )
            // InternalDataSampleDSL.g:3098:1: '='
            {
             before(grammarAccess.getParameterAccess().getEqualsSignKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_2); 
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
    // InternalDataSampleDSL.g:3111:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3115:1: ( rule__Parameter__Group__2__Impl )
            // InternalDataSampleDSL.g:3116:2: rule__Parameter__Group__2__Impl
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
    // InternalDataSampleDSL.g:3122:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__ValueAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3126:1: ( ( ( rule__Parameter__ValueAssignment_2 ) ) )
            // InternalDataSampleDSL.g:3127:1: ( ( rule__Parameter__ValueAssignment_2 ) )
            {
            // InternalDataSampleDSL.g:3127:1: ( ( rule__Parameter__ValueAssignment_2 ) )
            // InternalDataSampleDSL.g:3128:1: ( rule__Parameter__ValueAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getValueAssignment_2()); 
            // InternalDataSampleDSL.g:3129:1: ( rule__Parameter__ValueAssignment_2 )
            // InternalDataSampleDSL.g:3129:2: rule__Parameter__ValueAssignment_2
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
    // InternalDataSampleDSL.g:3146:1: rule__DataSample__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DataSample__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3150:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3151:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3151:1: ( ruleEString )
            // InternalDataSampleDSL.g:3152:1: ruleEString
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
    // InternalDataSampleDSL.g:3161:1: rule__DataSample__PackageURIAssignment_4 : ( ruleEString ) ;
    public final void rule__DataSample__PackageURIAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3165:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3166:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3166:1: ( ruleEString )
            // InternalDataSampleDSL.g:3167:1: ruleEString
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
    // InternalDataSampleDSL.g:3176:1: rule__DataSample__RootEntityNameAssignment_6 : ( ruleEString ) ;
    public final void rule__DataSample__RootEntityNameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3180:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3181:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3181:1: ( ruleEString )
            // InternalDataSampleDSL.g:3182:1: ruleEString
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
    // InternalDataSampleDSL.g:3191:1: rule__DataSample__SeedAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__DataSample__SeedAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3195:1: ( ( ruleEInt ) )
            // InternalDataSampleDSL.g:3196:1: ( ruleEInt )
            {
            // InternalDataSampleDSL.g:3196:1: ( ruleEInt )
            // InternalDataSampleDSL.g:3197:1: ruleEInt
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
    // InternalDataSampleDSL.g:3206:1: rule__DataSample__LanguageAssignment_8_1 : ( ruleLanguage ) ;
    public final void rule__DataSample__LanguageAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3210:1: ( ( ruleLanguage ) )
            // InternalDataSampleDSL.g:3211:1: ( ruleLanguage )
            {
            // InternalDataSampleDSL.g:3211:1: ( ruleLanguage )
            // InternalDataSampleDSL.g:3212:1: ruleLanguage
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
    // InternalDataSampleDSL.g:3221:1: rule__DataSample__FileExtensionAssignment_9_1 : ( ruleEString ) ;
    public final void rule__DataSample__FileExtensionAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3225:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3226:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3226:1: ( ruleEString )
            // InternalDataSampleDSL.g:3227:1: ruleEString
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
    // InternalDataSampleDSL.g:3236:1: rule__DataSample__RootGeneratorAssignment_11 : ( ruleEntityGenerator ) ;
    public final void rule__DataSample__RootGeneratorAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3240:1: ( ( ruleEntityGenerator ) )
            // InternalDataSampleDSL.g:3241:1: ( ruleEntityGenerator )
            {
            // InternalDataSampleDSL.g:3241:1: ( ruleEntityGenerator )
            // InternalDataSampleDSL.g:3242:1: ruleEntityGenerator
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
    // InternalDataSampleDSL.g:3251:1: rule__EntityGenerator__NumberAssignment_2_0 : ( ruleEInt ) ;
    public final void rule__EntityGenerator__NumberAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3255:1: ( ( ruleEInt ) )
            // InternalDataSampleDSL.g:3256:1: ( ruleEInt )
            {
            // InternalDataSampleDSL.g:3256:1: ( ruleEInt )
            // InternalDataSampleDSL.g:3257:1: ruleEInt
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
    // InternalDataSampleDSL.g:3266:1: rule__EntityGenerator__EntityNameAssignment_3 : ( ruleEString ) ;
    public final void rule__EntityGenerator__EntityNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3270:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3271:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3271:1: ( ruleEString )
            // InternalDataSampleDSL.g:3272:1: ruleEString
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
    // InternalDataSampleDSL.g:3281:1: rule__EntityGenerator__FieldGeneratorsAssignment_5 : ( ruleFieldGenerator ) ;
    public final void rule__EntityGenerator__FieldGeneratorsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3285:1: ( ( ruleFieldGenerator ) )
            // InternalDataSampleDSL.g:3286:1: ( ruleFieldGenerator )
            {
            // InternalDataSampleDSL.g:3286:1: ( ruleFieldGenerator )
            // InternalDataSampleDSL.g:3287:1: ruleFieldGenerator
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
    // InternalDataSampleDSL.g:3296:1: rule__EntityGenerator__ChildGeneratorsAssignment_6 : ( ruleChild ) ;
    public final void rule__EntityGenerator__ChildGeneratorsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3300:1: ( ( ruleChild ) )
            // InternalDataSampleDSL.g:3301:1: ( ruleChild )
            {
            // InternalDataSampleDSL.g:3301:1: ( ruleChild )
            // InternalDataSampleDSL.g:3302:1: ruleChild
            {
             before(grammarAccess.getEntityGeneratorAccess().getChildGeneratorsChildParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleChild();

            state._fsp--;

             after(grammarAccess.getEntityGeneratorAccess().getChildGeneratorsChildParserRuleCall_6_0()); 

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
    // InternalDataSampleDSL.g:3311:1: rule__EntityGenerator__AssociationGeneratorsAssignment_7 : ( ruleAssociationGenerator ) ;
    public final void rule__EntityGenerator__AssociationGeneratorsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3315:1: ( ( ruleAssociationGenerator ) )
            // InternalDataSampleDSL.g:3316:1: ( ruleAssociationGenerator )
            {
            // InternalDataSampleDSL.g:3316:1: ( ruleAssociationGenerator )
            // InternalDataSampleDSL.g:3317:1: ruleAssociationGenerator
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
    // InternalDataSampleDSL.g:3326:1: rule__FieldGenerator__FieldNameAssignment_2 : ( ruleEString ) ;
    public final void rule__FieldGenerator__FieldNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3330:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3331:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3331:1: ( ruleEString )
            // InternalDataSampleDSL.g:3332:1: ruleEString
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
    // InternalDataSampleDSL.g:3341:1: rule__FieldGenerator__GeneratorNameAssignment_4 : ( ruleEString ) ;
    public final void rule__FieldGenerator__GeneratorNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3345:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3346:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3346:1: ( ruleEString )
            // InternalDataSampleDSL.g:3347:1: ruleEString
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
    // InternalDataSampleDSL.g:3356:1: rule__FieldGenerator__NumberAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__FieldGenerator__NumberAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3360:1: ( ( ruleEInt ) )
            // InternalDataSampleDSL.g:3361:1: ( ruleEInt )
            {
            // InternalDataSampleDSL.g:3361:1: ( ruleEInt )
            // InternalDataSampleDSL.g:3362:1: ruleEInt
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
    // InternalDataSampleDSL.g:3371:1: rule__FieldGenerator__ParametersAssignment_6_1 : ( ruleParameter ) ;
    public final void rule__FieldGenerator__ParametersAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3375:1: ( ( ruleParameter ) )
            // InternalDataSampleDSL.g:3376:1: ( ruleParameter )
            {
            // InternalDataSampleDSL.g:3376:1: ( ruleParameter )
            // InternalDataSampleDSL.g:3377:1: ruleParameter
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
    // InternalDataSampleDSL.g:3386:1: rule__FieldGenerator__ParametersAssignment_6_2_1 : ( ruleParameter ) ;
    public final void rule__FieldGenerator__ParametersAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3390:1: ( ( ruleParameter ) )
            // InternalDataSampleDSL.g:3391:1: ( ruleParameter )
            {
            // InternalDataSampleDSL.g:3391:1: ( ruleParameter )
            // InternalDataSampleDSL.g:3392:1: ruleParameter
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
    // InternalDataSampleDSL.g:3401:1: rule__FieldGenerator__ErrorRateAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__FieldGenerator__ErrorRateAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3405:1: ( ( ruleEInt ) )
            // InternalDataSampleDSL.g:3406:1: ( ruleEInt )
            {
            // InternalDataSampleDSL.g:3406:1: ( ruleEInt )
            // InternalDataSampleDSL.g:3407:1: ruleEInt
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
    // InternalDataSampleDSL.g:3416:1: rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3 : ( ruleEString ) ;
    public final void rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3420:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3421:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3421:1: ( ruleEString )
            // InternalDataSampleDSL.g:3422:1: ruleEString
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
    // InternalDataSampleDSL.g:3431:1: rule__ChildrenGenerator__FieldNameAssignment_2 : ( ruleEString ) ;
    public final void rule__ChildrenGenerator__FieldNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3435:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3436:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3436:1: ( ruleEString )
            // InternalDataSampleDSL.g:3437:1: ruleEString
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


    // $ANTLR start "rule__ChildrenGenerator__DelegatedEntityGeneratorAssignment_3"
    // InternalDataSampleDSL.g:3446:1: rule__ChildrenGenerator__DelegatedEntityGeneratorAssignment_3 : ( ruleEntityGenerator ) ;
    public final void rule__ChildrenGenerator__DelegatedEntityGeneratorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3450:1: ( ( ruleEntityGenerator ) )
            // InternalDataSampleDSL.g:3451:1: ( ruleEntityGenerator )
            {
            // InternalDataSampleDSL.g:3451:1: ( ruleEntityGenerator )
            // InternalDataSampleDSL.g:3452:1: ruleEntityGenerator
            {
             before(grammarAccess.getChildrenGeneratorAccess().getDelegatedEntityGeneratorEntityGeneratorParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEntityGenerator();

            state._fsp--;

             after(grammarAccess.getChildrenGeneratorAccess().getDelegatedEntityGeneratorEntityGeneratorParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ChildrenGenerator__DelegatedEntityGeneratorAssignment_3"


    // $ANTLR start "rule__PolymorphicChildrenGenerator__FieldNameAssignment_2"
    // InternalDataSampleDSL.g:3461:1: rule__PolymorphicChildrenGenerator__FieldNameAssignment_2 : ( ruleEString ) ;
    public final void rule__PolymorphicChildrenGenerator__FieldNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3465:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3466:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3466:1: ( ruleEString )
            // InternalDataSampleDSL.g:3467:1: ruleEString
            {
             before(grammarAccess.getPolymorphicChildrenGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPolymorphicChildrenGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PolymorphicChildrenGenerator__FieldNameAssignment_2"


    // $ANTLR start "rule__PolymorphicChildrenGenerator__ChildrenGeneratorsAssignment_5"
    // InternalDataSampleDSL.g:3476:1: rule__PolymorphicChildrenGenerator__ChildrenGeneratorsAssignment_5 : ( ruleEntityGenerator ) ;
    public final void rule__PolymorphicChildrenGenerator__ChildrenGeneratorsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3480:1: ( ( ruleEntityGenerator ) )
            // InternalDataSampleDSL.g:3481:1: ( ruleEntityGenerator )
            {
            // InternalDataSampleDSL.g:3481:1: ( ruleEntityGenerator )
            // InternalDataSampleDSL.g:3482:1: ruleEntityGenerator
            {
             before(grammarAccess.getPolymorphicChildrenGeneratorAccess().getChildrenGeneratorsEntityGeneratorParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEntityGenerator();

            state._fsp--;

             after(grammarAccess.getPolymorphicChildrenGeneratorAccess().getChildrenGeneratorsEntityGeneratorParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__PolymorphicChildrenGenerator__ChildrenGeneratorsAssignment_5"


    // $ANTLR start "rule__AssociationGenerator__FieldNameAssignment_2"
    // InternalDataSampleDSL.g:3491:1: rule__AssociationGenerator__FieldNameAssignment_2 : ( ruleEString ) ;
    public final void rule__AssociationGenerator__FieldNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3495:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3496:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3496:1: ( ruleEString )
            // InternalDataSampleDSL.g:3497:1: ruleEString
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
    // InternalDataSampleDSL.g:3506:1: rule__AssociationGenerator__GeneratorNameAssignment_4 : ( ruleEString ) ;
    public final void rule__AssociationGenerator__GeneratorNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3510:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3511:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3511:1: ( ruleEString )
            // InternalDataSampleDSL.g:3512:1: ruleEString
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
    // InternalDataSampleDSL.g:3521:1: rule__AssociationGenerator__NumberAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__AssociationGenerator__NumberAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3525:1: ( ( ruleEInt ) )
            // InternalDataSampleDSL.g:3526:1: ( ruleEInt )
            {
            // InternalDataSampleDSL.g:3526:1: ( ruleEInt )
            // InternalDataSampleDSL.g:3527:1: ruleEInt
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
    // InternalDataSampleDSL.g:3536:1: rule__AssociationGenerator__ParametersAssignment_6_1 : ( ruleParameter ) ;
    public final void rule__AssociationGenerator__ParametersAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3540:1: ( ( ruleParameter ) )
            // InternalDataSampleDSL.g:3541:1: ( ruleParameter )
            {
            // InternalDataSampleDSL.g:3541:1: ( ruleParameter )
            // InternalDataSampleDSL.g:3542:1: ruleParameter
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
    // InternalDataSampleDSL.g:3551:1: rule__AssociationGenerator__ParametersAssignment_6_2_1 : ( ruleParameter ) ;
    public final void rule__AssociationGenerator__ParametersAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3555:1: ( ( ruleParameter ) )
            // InternalDataSampleDSL.g:3556:1: ( ruleParameter )
            {
            // InternalDataSampleDSL.g:3556:1: ( ruleParameter )
            // InternalDataSampleDSL.g:3557:1: ruleParameter
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
    // InternalDataSampleDSL.g:3566:1: rule__AssociationGenerator__ErrorRateAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__AssociationGenerator__ErrorRateAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3570:1: ( ( ruleEInt ) )
            // InternalDataSampleDSL.g:3571:1: ( ruleEInt )
            {
            // InternalDataSampleDSL.g:3571:1: ( ruleEInt )
            // InternalDataSampleDSL.g:3572:1: ruleEInt
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
    // InternalDataSampleDSL.g:3581:1: rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3 : ( ruleEString ) ;
    public final void rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3585:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3586:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3586:1: ( ruleEString )
            // InternalDataSampleDSL.g:3587:1: ruleEString
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
    // InternalDataSampleDSL.g:3596:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3600:1: ( ( RULE_ID ) )
            // InternalDataSampleDSL.g:3601:1: ( RULE_ID )
            {
            // InternalDataSampleDSL.g:3601:1: ( RULE_ID )
            // InternalDataSampleDSL.g:3602:1: RULE_ID
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
    // InternalDataSampleDSL.g:3611:1: rule__Parameter__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__Parameter__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3615:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3616:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3616:1: ( ruleEString )
            // InternalDataSampleDSL.g:3617:1: ruleEString
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
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000007014000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000003000000002L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000004C0000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000003000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000005000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    }


}