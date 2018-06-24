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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fr'", "'en'", "'de'", "'es'", "'it'", "'Sample'", "'for '", "'{'", "'seed'", "'language'", "'In the root object generate '", "'}'", "'badValueGeneratorNames'", "','", "'-'", "'forField'", "'.'", "'use'", "'with errorRate='", "'% generated with '"
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


    // $ANTLR start "entryRuleEntityGenerator2"
    // InternalDataSampleDSL.g:144:1: entryRuleEntityGenerator2 : ruleEntityGenerator2 EOF ;
    public final void entryRuleEntityGenerator2() throws RecognitionException {
        try {
            // InternalDataSampleDSL.g:145:1: ( ruleEntityGenerator2 EOF )
            // InternalDataSampleDSL.g:146:1: ruleEntityGenerator2 EOF
            {
             before(grammarAccess.getEntityGenerator2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEntityGenerator2();

            state._fsp--;

             after(grammarAccess.getEntityGenerator2Rule()); 
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
    // $ANTLR end "entryRuleEntityGenerator2"


    // $ANTLR start "ruleEntityGenerator2"
    // InternalDataSampleDSL.g:153:1: ruleEntityGenerator2 : ( ( rule__EntityGenerator2__Group__0 ) ) ;
    public final void ruleEntityGenerator2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:157:2: ( ( ( rule__EntityGenerator2__Group__0 ) ) )
            // InternalDataSampleDSL.g:158:1: ( ( rule__EntityGenerator2__Group__0 ) )
            {
            // InternalDataSampleDSL.g:158:1: ( ( rule__EntityGenerator2__Group__0 ) )
            // InternalDataSampleDSL.g:159:1: ( rule__EntityGenerator2__Group__0 )
            {
             before(grammarAccess.getEntityGenerator2Access().getGroup()); 
            // InternalDataSampleDSL.g:160:1: ( rule__EntityGenerator2__Group__0 )
            // InternalDataSampleDSL.g:160:2: rule__EntityGenerator2__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityGenerator2Access().getGroup()); 

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
    // $ANTLR end "ruleEntityGenerator2"


    // $ANTLR start "entryRuleFieldGenerator2"
    // InternalDataSampleDSL.g:174:1: entryRuleFieldGenerator2 : ruleFieldGenerator2 EOF ;
    public final void entryRuleFieldGenerator2() throws RecognitionException {
        try {
            // InternalDataSampleDSL.g:175:1: ( ruleFieldGenerator2 EOF )
            // InternalDataSampleDSL.g:176:1: ruleFieldGenerator2 EOF
            {
             before(grammarAccess.getFieldGenerator2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFieldGenerator2();

            state._fsp--;

             after(grammarAccess.getFieldGenerator2Rule()); 
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
    // $ANTLR end "entryRuleFieldGenerator2"


    // $ANTLR start "ruleFieldGenerator2"
    // InternalDataSampleDSL.g:183:1: ruleFieldGenerator2 : ( ( rule__FieldGenerator2__Group__0 ) ) ;
    public final void ruleFieldGenerator2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:187:2: ( ( ( rule__FieldGenerator2__Group__0 ) ) )
            // InternalDataSampleDSL.g:188:1: ( ( rule__FieldGenerator2__Group__0 ) )
            {
            // InternalDataSampleDSL.g:188:1: ( ( rule__FieldGenerator2__Group__0 ) )
            // InternalDataSampleDSL.g:189:1: ( rule__FieldGenerator2__Group__0 )
            {
             before(grammarAccess.getFieldGenerator2Access().getGroup()); 
            // InternalDataSampleDSL.g:190:1: ( rule__FieldGenerator2__Group__0 )
            // InternalDataSampleDSL.g:190:2: rule__FieldGenerator2__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldGenerator2Access().getGroup()); 

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
    // $ANTLR end "ruleFieldGenerator2"


    // $ANTLR start "ruleLanguage"
    // InternalDataSampleDSL.g:205:1: ruleLanguage : ( ( rule__Language__Alternatives ) ) ;
    public final void ruleLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:209:1: ( ( ( rule__Language__Alternatives ) ) )
            // InternalDataSampleDSL.g:210:1: ( ( rule__Language__Alternatives ) )
            {
            // InternalDataSampleDSL.g:210:1: ( ( rule__Language__Alternatives ) )
            // InternalDataSampleDSL.g:211:1: ( rule__Language__Alternatives )
            {
             before(grammarAccess.getLanguageAccess().getAlternatives()); 
            // InternalDataSampleDSL.g:212:1: ( rule__Language__Alternatives )
            // InternalDataSampleDSL.g:212:2: rule__Language__Alternatives
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
    // InternalDataSampleDSL.g:223:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:227:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalDataSampleDSL.g:228:1: ( RULE_STRING )
                    {
                    // InternalDataSampleDSL.g:228:1: ( RULE_STRING )
                    // InternalDataSampleDSL.g:229:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataSampleDSL.g:234:6: ( RULE_ID )
                    {
                    // InternalDataSampleDSL.g:234:6: ( RULE_ID )
                    // InternalDataSampleDSL.g:235:1: RULE_ID
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


    // $ANTLR start "rule__Language__Alternatives"
    // InternalDataSampleDSL.g:245:1: rule__Language__Alternatives : ( ( ( 'fr' ) ) | ( ( 'en' ) ) | ( ( 'de' ) ) | ( ( 'es' ) ) | ( ( 'it' ) ) );
    public final void rule__Language__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:249:1: ( ( ( 'fr' ) ) | ( ( 'en' ) ) | ( ( 'de' ) ) | ( ( 'es' ) ) | ( ( 'it' ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDataSampleDSL.g:250:1: ( ( 'fr' ) )
                    {
                    // InternalDataSampleDSL.g:250:1: ( ( 'fr' ) )
                    // InternalDataSampleDSL.g:251:1: ( 'fr' )
                    {
                     before(grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0()); 
                    // InternalDataSampleDSL.g:252:1: ( 'fr' )
                    // InternalDataSampleDSL.g:252:3: 'fr'
                    {
                    match(input,11,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataSampleDSL.g:257:6: ( ( 'en' ) )
                    {
                    // InternalDataSampleDSL.g:257:6: ( ( 'en' ) )
                    // InternalDataSampleDSL.g:258:1: ( 'en' )
                    {
                     before(grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1()); 
                    // InternalDataSampleDSL.g:259:1: ( 'en' )
                    // InternalDataSampleDSL.g:259:3: 'en'
                    {
                    match(input,12,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataSampleDSL.g:264:6: ( ( 'de' ) )
                    {
                    // InternalDataSampleDSL.g:264:6: ( ( 'de' ) )
                    // InternalDataSampleDSL.g:265:1: ( 'de' )
                    {
                     before(grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2()); 
                    // InternalDataSampleDSL.g:266:1: ( 'de' )
                    // InternalDataSampleDSL.g:266:3: 'de'
                    {
                    match(input,13,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataSampleDSL.g:271:6: ( ( 'es' ) )
                    {
                    // InternalDataSampleDSL.g:271:6: ( ( 'es' ) )
                    // InternalDataSampleDSL.g:272:1: ( 'es' )
                    {
                     before(grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3()); 
                    // InternalDataSampleDSL.g:273:1: ( 'es' )
                    // InternalDataSampleDSL.g:273:3: 'es'
                    {
                    match(input,14,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataSampleDSL.g:278:6: ( ( 'it' ) )
                    {
                    // InternalDataSampleDSL.g:278:6: ( ( 'it' ) )
                    // InternalDataSampleDSL.g:279:1: ( 'it' )
                    {
                     before(grammarAccess.getLanguageAccess().getItEnumLiteralDeclaration_4()); 
                    // InternalDataSampleDSL.g:280:1: ( 'it' )
                    // InternalDataSampleDSL.g:280:3: 'it'
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
    // InternalDataSampleDSL.g:292:1: rule__DataSample__Group__0 : rule__DataSample__Group__0__Impl rule__DataSample__Group__1 ;
    public final void rule__DataSample__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:296:1: ( rule__DataSample__Group__0__Impl rule__DataSample__Group__1 )
            // InternalDataSampleDSL.g:297:2: rule__DataSample__Group__0__Impl rule__DataSample__Group__1
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
    // InternalDataSampleDSL.g:304:1: rule__DataSample__Group__0__Impl : ( () ) ;
    public final void rule__DataSample__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:308:1: ( ( () ) )
            // InternalDataSampleDSL.g:309:1: ( () )
            {
            // InternalDataSampleDSL.g:309:1: ( () )
            // InternalDataSampleDSL.g:310:1: ()
            {
             before(grammarAccess.getDataSampleAccess().getDataSampleAction_0()); 
            // InternalDataSampleDSL.g:311:1: ()
            // InternalDataSampleDSL.g:313:1: 
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
    // InternalDataSampleDSL.g:323:1: rule__DataSample__Group__1 : rule__DataSample__Group__1__Impl rule__DataSample__Group__2 ;
    public final void rule__DataSample__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:327:1: ( rule__DataSample__Group__1__Impl rule__DataSample__Group__2 )
            // InternalDataSampleDSL.g:328:2: rule__DataSample__Group__1__Impl rule__DataSample__Group__2
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
    // InternalDataSampleDSL.g:335:1: rule__DataSample__Group__1__Impl : ( 'Sample' ) ;
    public final void rule__DataSample__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:339:1: ( ( 'Sample' ) )
            // InternalDataSampleDSL.g:340:1: ( 'Sample' )
            {
            // InternalDataSampleDSL.g:340:1: ( 'Sample' )
            // InternalDataSampleDSL.g:341:1: 'Sample'
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
    // InternalDataSampleDSL.g:354:1: rule__DataSample__Group__2 : rule__DataSample__Group__2__Impl rule__DataSample__Group__3 ;
    public final void rule__DataSample__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:358:1: ( rule__DataSample__Group__2__Impl rule__DataSample__Group__3 )
            // InternalDataSampleDSL.g:359:2: rule__DataSample__Group__2__Impl rule__DataSample__Group__3
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
    // InternalDataSampleDSL.g:366:1: rule__DataSample__Group__2__Impl : ( ( rule__DataSample__NameAssignment_2 ) ) ;
    public final void rule__DataSample__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:370:1: ( ( ( rule__DataSample__NameAssignment_2 ) ) )
            // InternalDataSampleDSL.g:371:1: ( ( rule__DataSample__NameAssignment_2 ) )
            {
            // InternalDataSampleDSL.g:371:1: ( ( rule__DataSample__NameAssignment_2 ) )
            // InternalDataSampleDSL.g:372:1: ( rule__DataSample__NameAssignment_2 )
            {
             before(grammarAccess.getDataSampleAccess().getNameAssignment_2()); 
            // InternalDataSampleDSL.g:373:1: ( rule__DataSample__NameAssignment_2 )
            // InternalDataSampleDSL.g:373:2: rule__DataSample__NameAssignment_2
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
    // InternalDataSampleDSL.g:383:1: rule__DataSample__Group__3 : rule__DataSample__Group__3__Impl rule__DataSample__Group__4 ;
    public final void rule__DataSample__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:387:1: ( rule__DataSample__Group__3__Impl rule__DataSample__Group__4 )
            // InternalDataSampleDSL.g:388:2: rule__DataSample__Group__3__Impl rule__DataSample__Group__4
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
    // InternalDataSampleDSL.g:395:1: rule__DataSample__Group__3__Impl : ( 'for ' ) ;
    public final void rule__DataSample__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:399:1: ( ( 'for ' ) )
            // InternalDataSampleDSL.g:400:1: ( 'for ' )
            {
            // InternalDataSampleDSL.g:400:1: ( 'for ' )
            // InternalDataSampleDSL.g:401:1: 'for '
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
    // InternalDataSampleDSL.g:414:1: rule__DataSample__Group__4 : rule__DataSample__Group__4__Impl rule__DataSample__Group__5 ;
    public final void rule__DataSample__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:418:1: ( rule__DataSample__Group__4__Impl rule__DataSample__Group__5 )
            // InternalDataSampleDSL.g:419:2: rule__DataSample__Group__4__Impl rule__DataSample__Group__5
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
    // InternalDataSampleDSL.g:426:1: rule__DataSample__Group__4__Impl : ( ( rule__DataSample__PackageURIAssignment_4 ) ) ;
    public final void rule__DataSample__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:430:1: ( ( ( rule__DataSample__PackageURIAssignment_4 ) ) )
            // InternalDataSampleDSL.g:431:1: ( ( rule__DataSample__PackageURIAssignment_4 ) )
            {
            // InternalDataSampleDSL.g:431:1: ( ( rule__DataSample__PackageURIAssignment_4 ) )
            // InternalDataSampleDSL.g:432:1: ( rule__DataSample__PackageURIAssignment_4 )
            {
             before(grammarAccess.getDataSampleAccess().getPackageURIAssignment_4()); 
            // InternalDataSampleDSL.g:433:1: ( rule__DataSample__PackageURIAssignment_4 )
            // InternalDataSampleDSL.g:433:2: rule__DataSample__PackageURIAssignment_4
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
    // InternalDataSampleDSL.g:443:1: rule__DataSample__Group__5 : rule__DataSample__Group__5__Impl rule__DataSample__Group__6 ;
    public final void rule__DataSample__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:447:1: ( rule__DataSample__Group__5__Impl rule__DataSample__Group__6 )
            // InternalDataSampleDSL.g:448:2: rule__DataSample__Group__5__Impl rule__DataSample__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalDataSampleDSL.g:455:1: rule__DataSample__Group__5__Impl : ( '{' ) ;
    public final void rule__DataSample__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:459:1: ( ( '{' ) )
            // InternalDataSampleDSL.g:460:1: ( '{' )
            {
            // InternalDataSampleDSL.g:460:1: ( '{' )
            // InternalDataSampleDSL.g:461:1: '{'
            {
             before(grammarAccess.getDataSampleAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataSampleAccess().getLeftCurlyBracketKeyword_5()); 

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
    // InternalDataSampleDSL.g:474:1: rule__DataSample__Group__6 : rule__DataSample__Group__6__Impl rule__DataSample__Group__7 ;
    public final void rule__DataSample__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:478:1: ( rule__DataSample__Group__6__Impl rule__DataSample__Group__7 )
            // InternalDataSampleDSL.g:479:2: rule__DataSample__Group__6__Impl rule__DataSample__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalDataSampleDSL.g:486:1: rule__DataSample__Group__6__Impl : ( 'seed' ) ;
    public final void rule__DataSample__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:490:1: ( ( 'seed' ) )
            // InternalDataSampleDSL.g:491:1: ( 'seed' )
            {
            // InternalDataSampleDSL.g:491:1: ( 'seed' )
            // InternalDataSampleDSL.g:492:1: 'seed'
            {
             before(grammarAccess.getDataSampleAccess().getSeedKeyword_6()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataSampleAccess().getSeedKeyword_6()); 

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
    // InternalDataSampleDSL.g:505:1: rule__DataSample__Group__7 : rule__DataSample__Group__7__Impl rule__DataSample__Group__8 ;
    public final void rule__DataSample__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:509:1: ( rule__DataSample__Group__7__Impl rule__DataSample__Group__8 )
            // InternalDataSampleDSL.g:510:2: rule__DataSample__Group__7__Impl rule__DataSample__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_9);
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
    // InternalDataSampleDSL.g:517:1: rule__DataSample__Group__7__Impl : ( ( rule__DataSample__SeedAssignment_7 ) ) ;
    public final void rule__DataSample__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:521:1: ( ( ( rule__DataSample__SeedAssignment_7 ) ) )
            // InternalDataSampleDSL.g:522:1: ( ( rule__DataSample__SeedAssignment_7 ) )
            {
            // InternalDataSampleDSL.g:522:1: ( ( rule__DataSample__SeedAssignment_7 ) )
            // InternalDataSampleDSL.g:523:1: ( rule__DataSample__SeedAssignment_7 )
            {
             before(grammarAccess.getDataSampleAccess().getSeedAssignment_7()); 
            // InternalDataSampleDSL.g:524:1: ( rule__DataSample__SeedAssignment_7 )
            // InternalDataSampleDSL.g:524:2: rule__DataSample__SeedAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__SeedAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDataSampleAccess().getSeedAssignment_7()); 

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
    // InternalDataSampleDSL.g:534:1: rule__DataSample__Group__8 : rule__DataSample__Group__8__Impl rule__DataSample__Group__9 ;
    public final void rule__DataSample__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:538:1: ( rule__DataSample__Group__8__Impl rule__DataSample__Group__9 )
            // InternalDataSampleDSL.g:539:2: rule__DataSample__Group__8__Impl rule__DataSample__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalDataSampleDSL.g:546:1: rule__DataSample__Group__8__Impl : ( 'language' ) ;
    public final void rule__DataSample__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:550:1: ( ( 'language' ) )
            // InternalDataSampleDSL.g:551:1: ( 'language' )
            {
            // InternalDataSampleDSL.g:551:1: ( 'language' )
            // InternalDataSampleDSL.g:552:1: 'language'
            {
             before(grammarAccess.getDataSampleAccess().getLanguageKeyword_8()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataSampleAccess().getLanguageKeyword_8()); 

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
    // InternalDataSampleDSL.g:565:1: rule__DataSample__Group__9 : rule__DataSample__Group__9__Impl rule__DataSample__Group__10 ;
    public final void rule__DataSample__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:569:1: ( rule__DataSample__Group__9__Impl rule__DataSample__Group__10 )
            // InternalDataSampleDSL.g:570:2: rule__DataSample__Group__9__Impl rule__DataSample__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_11);
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
    // InternalDataSampleDSL.g:577:1: rule__DataSample__Group__9__Impl : ( ( rule__DataSample__LanguageAssignment_9 ) ) ;
    public final void rule__DataSample__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:581:1: ( ( ( rule__DataSample__LanguageAssignment_9 ) ) )
            // InternalDataSampleDSL.g:582:1: ( ( rule__DataSample__LanguageAssignment_9 ) )
            {
            // InternalDataSampleDSL.g:582:1: ( ( rule__DataSample__LanguageAssignment_9 ) )
            // InternalDataSampleDSL.g:583:1: ( rule__DataSample__LanguageAssignment_9 )
            {
             before(grammarAccess.getDataSampleAccess().getLanguageAssignment_9()); 
            // InternalDataSampleDSL.g:584:1: ( rule__DataSample__LanguageAssignment_9 )
            // InternalDataSampleDSL.g:584:2: rule__DataSample__LanguageAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__LanguageAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getDataSampleAccess().getLanguageAssignment_9()); 

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
    // InternalDataSampleDSL.g:594:1: rule__DataSample__Group__10 : rule__DataSample__Group__10__Impl rule__DataSample__Group__11 ;
    public final void rule__DataSample__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:598:1: ( rule__DataSample__Group__10__Impl rule__DataSample__Group__11 )
            // InternalDataSampleDSL.g:599:2: rule__DataSample__Group__10__Impl rule__DataSample__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_11);
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
    // InternalDataSampleDSL.g:606:1: rule__DataSample__Group__10__Impl : ( ( rule__DataSample__Group_10__0 )? ) ;
    public final void rule__DataSample__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:610:1: ( ( ( rule__DataSample__Group_10__0 )? ) )
            // InternalDataSampleDSL.g:611:1: ( ( rule__DataSample__Group_10__0 )? )
            {
            // InternalDataSampleDSL.g:611:1: ( ( rule__DataSample__Group_10__0 )? )
            // InternalDataSampleDSL.g:612:1: ( rule__DataSample__Group_10__0 )?
            {
             before(grammarAccess.getDataSampleAccess().getGroup_10()); 
            // InternalDataSampleDSL.g:613:1: ( rule__DataSample__Group_10__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDataSampleDSL.g:613:2: rule__DataSample__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DataSample__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSampleAccess().getGroup_10()); 

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
    // InternalDataSampleDSL.g:623:1: rule__DataSample__Group__11 : rule__DataSample__Group__11__Impl rule__DataSample__Group__12 ;
    public final void rule__DataSample__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:627:1: ( rule__DataSample__Group__11__Impl rule__DataSample__Group__12 )
            // InternalDataSampleDSL.g:628:2: rule__DataSample__Group__11__Impl rule__DataSample__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DataSample__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__12();

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
    // InternalDataSampleDSL.g:635:1: rule__DataSample__Group__11__Impl : ( 'In the root object generate ' ) ;
    public final void rule__DataSample__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:639:1: ( ( 'In the root object generate ' ) )
            // InternalDataSampleDSL.g:640:1: ( 'In the root object generate ' )
            {
            // InternalDataSampleDSL.g:640:1: ( 'In the root object generate ' )
            // InternalDataSampleDSL.g:641:1: 'In the root object generate '
            {
             before(grammarAccess.getDataSampleAccess().getInTheRootObjectGenerateKeyword_11()); 
            match(input,21,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataSampleAccess().getInTheRootObjectGenerateKeyword_11()); 

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


    // $ANTLR start "rule__DataSample__Group__12"
    // InternalDataSampleDSL.g:654:1: rule__DataSample__Group__12 : rule__DataSample__Group__12__Impl rule__DataSample__Group__13 ;
    public final void rule__DataSample__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:658:1: ( rule__DataSample__Group__12__Impl rule__DataSample__Group__13 )
            // InternalDataSampleDSL.g:659:2: rule__DataSample__Group__12__Impl rule__DataSample__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__DataSample__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__13();

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
    // $ANTLR end "rule__DataSample__Group__12"


    // $ANTLR start "rule__DataSample__Group__12__Impl"
    // InternalDataSampleDSL.g:666:1: rule__DataSample__Group__12__Impl : ( ( rule__DataSample__EntityGeneratorsAssignment_12 ) ) ;
    public final void rule__DataSample__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:670:1: ( ( ( rule__DataSample__EntityGeneratorsAssignment_12 ) ) )
            // InternalDataSampleDSL.g:671:1: ( ( rule__DataSample__EntityGeneratorsAssignment_12 ) )
            {
            // InternalDataSampleDSL.g:671:1: ( ( rule__DataSample__EntityGeneratorsAssignment_12 ) )
            // InternalDataSampleDSL.g:672:1: ( rule__DataSample__EntityGeneratorsAssignment_12 )
            {
             before(grammarAccess.getDataSampleAccess().getEntityGeneratorsAssignment_12()); 
            // InternalDataSampleDSL.g:673:1: ( rule__DataSample__EntityGeneratorsAssignment_12 )
            // InternalDataSampleDSL.g:673:2: rule__DataSample__EntityGeneratorsAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__EntityGeneratorsAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getDataSampleAccess().getEntityGeneratorsAssignment_12()); 

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
    // $ANTLR end "rule__DataSample__Group__12__Impl"


    // $ANTLR start "rule__DataSample__Group__13"
    // InternalDataSampleDSL.g:683:1: rule__DataSample__Group__13 : rule__DataSample__Group__13__Impl rule__DataSample__Group__14 ;
    public final void rule__DataSample__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:687:1: ( rule__DataSample__Group__13__Impl rule__DataSample__Group__14 )
            // InternalDataSampleDSL.g:688:2: rule__DataSample__Group__13__Impl rule__DataSample__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__DataSample__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__14();

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
    // $ANTLR end "rule__DataSample__Group__13"


    // $ANTLR start "rule__DataSample__Group__13__Impl"
    // InternalDataSampleDSL.g:695:1: rule__DataSample__Group__13__Impl : ( ( rule__DataSample__Group_13__0 )* ) ;
    public final void rule__DataSample__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:699:1: ( ( ( rule__DataSample__Group_13__0 )* ) )
            // InternalDataSampleDSL.g:700:1: ( ( rule__DataSample__Group_13__0 )* )
            {
            // InternalDataSampleDSL.g:700:1: ( ( rule__DataSample__Group_13__0 )* )
            // InternalDataSampleDSL.g:701:1: ( rule__DataSample__Group_13__0 )*
            {
             before(grammarAccess.getDataSampleAccess().getGroup_13()); 
            // InternalDataSampleDSL.g:702:1: ( rule__DataSample__Group_13__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDataSampleDSL.g:702:2: rule__DataSample__Group_13__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    rule__DataSample__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getDataSampleAccess().getGroup_13()); 

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
    // $ANTLR end "rule__DataSample__Group__13__Impl"


    // $ANTLR start "rule__DataSample__Group__14"
    // InternalDataSampleDSL.g:712:1: rule__DataSample__Group__14 : rule__DataSample__Group__14__Impl rule__DataSample__Group__15 ;
    public final void rule__DataSample__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:716:1: ( rule__DataSample__Group__14__Impl rule__DataSample__Group__15 )
            // InternalDataSampleDSL.g:717:2: rule__DataSample__Group__14__Impl rule__DataSample__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__DataSample__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__15();

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
    // $ANTLR end "rule__DataSample__Group__14"


    // $ANTLR start "rule__DataSample__Group__14__Impl"
    // InternalDataSampleDSL.g:724:1: rule__DataSample__Group__14__Impl : ( ( rule__DataSample__FieldGeneratorsAssignment_14 ) ) ;
    public final void rule__DataSample__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:728:1: ( ( ( rule__DataSample__FieldGeneratorsAssignment_14 ) ) )
            // InternalDataSampleDSL.g:729:1: ( ( rule__DataSample__FieldGeneratorsAssignment_14 ) )
            {
            // InternalDataSampleDSL.g:729:1: ( ( rule__DataSample__FieldGeneratorsAssignment_14 ) )
            // InternalDataSampleDSL.g:730:1: ( rule__DataSample__FieldGeneratorsAssignment_14 )
            {
             before(grammarAccess.getDataSampleAccess().getFieldGeneratorsAssignment_14()); 
            // InternalDataSampleDSL.g:731:1: ( rule__DataSample__FieldGeneratorsAssignment_14 )
            // InternalDataSampleDSL.g:731:2: rule__DataSample__FieldGeneratorsAssignment_14
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__FieldGeneratorsAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getDataSampleAccess().getFieldGeneratorsAssignment_14()); 

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
    // $ANTLR end "rule__DataSample__Group__14__Impl"


    // $ANTLR start "rule__DataSample__Group__15"
    // InternalDataSampleDSL.g:741:1: rule__DataSample__Group__15 : rule__DataSample__Group__15__Impl rule__DataSample__Group__16 ;
    public final void rule__DataSample__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:745:1: ( rule__DataSample__Group__15__Impl rule__DataSample__Group__16 )
            // InternalDataSampleDSL.g:746:2: rule__DataSample__Group__15__Impl rule__DataSample__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__DataSample__Group__15__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__16();

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
    // $ANTLR end "rule__DataSample__Group__15"


    // $ANTLR start "rule__DataSample__Group__15__Impl"
    // InternalDataSampleDSL.g:753:1: rule__DataSample__Group__15__Impl : ( ( rule__DataSample__Group_15__0 )* ) ;
    public final void rule__DataSample__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:757:1: ( ( ( rule__DataSample__Group_15__0 )* ) )
            // InternalDataSampleDSL.g:758:1: ( ( rule__DataSample__Group_15__0 )* )
            {
            // InternalDataSampleDSL.g:758:1: ( ( rule__DataSample__Group_15__0 )* )
            // InternalDataSampleDSL.g:759:1: ( rule__DataSample__Group_15__0 )*
            {
             before(grammarAccess.getDataSampleAccess().getGroup_15()); 
            // InternalDataSampleDSL.g:760:1: ( rule__DataSample__Group_15__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDataSampleDSL.g:760:2: rule__DataSample__Group_15__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    rule__DataSample__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getDataSampleAccess().getGroup_15()); 

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
    // $ANTLR end "rule__DataSample__Group__15__Impl"


    // $ANTLR start "rule__DataSample__Group__16"
    // InternalDataSampleDSL.g:770:1: rule__DataSample__Group__16 : rule__DataSample__Group__16__Impl ;
    public final void rule__DataSample__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:774:1: ( rule__DataSample__Group__16__Impl )
            // InternalDataSampleDSL.g:775:2: rule__DataSample__Group__16__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__16__Impl();

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
    // $ANTLR end "rule__DataSample__Group__16"


    // $ANTLR start "rule__DataSample__Group__16__Impl"
    // InternalDataSampleDSL.g:781:1: rule__DataSample__Group__16__Impl : ( '}' ) ;
    public final void rule__DataSample__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:785:1: ( ( '}' ) )
            // InternalDataSampleDSL.g:786:1: ( '}' )
            {
            // InternalDataSampleDSL.g:786:1: ( '}' )
            // InternalDataSampleDSL.g:787:1: '}'
            {
             before(grammarAccess.getDataSampleAccess().getRightCurlyBracketKeyword_16()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataSampleAccess().getRightCurlyBracketKeyword_16()); 

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
    // $ANTLR end "rule__DataSample__Group__16__Impl"


    // $ANTLR start "rule__DataSample__Group_10__0"
    // InternalDataSampleDSL.g:834:1: rule__DataSample__Group_10__0 : rule__DataSample__Group_10__0__Impl rule__DataSample__Group_10__1 ;
    public final void rule__DataSample__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:838:1: ( rule__DataSample__Group_10__0__Impl rule__DataSample__Group_10__1 )
            // InternalDataSampleDSL.g:839:2: rule__DataSample__Group_10__0__Impl rule__DataSample__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__DataSample__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group_10__1();

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
    // $ANTLR end "rule__DataSample__Group_10__0"


    // $ANTLR start "rule__DataSample__Group_10__0__Impl"
    // InternalDataSampleDSL.g:846:1: rule__DataSample__Group_10__0__Impl : ( 'badValueGeneratorNames' ) ;
    public final void rule__DataSample__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:850:1: ( ( 'badValueGeneratorNames' ) )
            // InternalDataSampleDSL.g:851:1: ( 'badValueGeneratorNames' )
            {
            // InternalDataSampleDSL.g:851:1: ( 'badValueGeneratorNames' )
            // InternalDataSampleDSL.g:852:1: 'badValueGeneratorNames'
            {
             before(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesKeyword_10_0()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesKeyword_10_0()); 

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
    // $ANTLR end "rule__DataSample__Group_10__0__Impl"


    // $ANTLR start "rule__DataSample__Group_10__1"
    // InternalDataSampleDSL.g:865:1: rule__DataSample__Group_10__1 : rule__DataSample__Group_10__1__Impl rule__DataSample__Group_10__2 ;
    public final void rule__DataSample__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:869:1: ( rule__DataSample__Group_10__1__Impl rule__DataSample__Group_10__2 )
            // InternalDataSampleDSL.g:870:2: rule__DataSample__Group_10__1__Impl rule__DataSample__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__DataSample__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group_10__2();

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
    // $ANTLR end "rule__DataSample__Group_10__1"


    // $ANTLR start "rule__DataSample__Group_10__1__Impl"
    // InternalDataSampleDSL.g:877:1: rule__DataSample__Group_10__1__Impl : ( '{' ) ;
    public final void rule__DataSample__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:881:1: ( ( '{' ) )
            // InternalDataSampleDSL.g:882:1: ( '{' )
            {
            // InternalDataSampleDSL.g:882:1: ( '{' )
            // InternalDataSampleDSL.g:883:1: '{'
            {
             before(grammarAccess.getDataSampleAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataSampleAccess().getLeftCurlyBracketKeyword_10_1()); 

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
    // $ANTLR end "rule__DataSample__Group_10__1__Impl"


    // $ANTLR start "rule__DataSample__Group_10__2"
    // InternalDataSampleDSL.g:896:1: rule__DataSample__Group_10__2 : rule__DataSample__Group_10__2__Impl rule__DataSample__Group_10__3 ;
    public final void rule__DataSample__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:900:1: ( rule__DataSample__Group_10__2__Impl rule__DataSample__Group_10__3 )
            // InternalDataSampleDSL.g:901:2: rule__DataSample__Group_10__2__Impl rule__DataSample__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__DataSample__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group_10__3();

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
    // $ANTLR end "rule__DataSample__Group_10__2"


    // $ANTLR start "rule__DataSample__Group_10__2__Impl"
    // InternalDataSampleDSL.g:908:1: rule__DataSample__Group_10__2__Impl : ( ( rule__DataSample__BadValueGeneratorNamesAssignment_10_2 ) ) ;
    public final void rule__DataSample__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:912:1: ( ( ( rule__DataSample__BadValueGeneratorNamesAssignment_10_2 ) ) )
            // InternalDataSampleDSL.g:913:1: ( ( rule__DataSample__BadValueGeneratorNamesAssignment_10_2 ) )
            {
            // InternalDataSampleDSL.g:913:1: ( ( rule__DataSample__BadValueGeneratorNamesAssignment_10_2 ) )
            // InternalDataSampleDSL.g:914:1: ( rule__DataSample__BadValueGeneratorNamesAssignment_10_2 )
            {
             before(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesAssignment_10_2()); 
            // InternalDataSampleDSL.g:915:1: ( rule__DataSample__BadValueGeneratorNamesAssignment_10_2 )
            // InternalDataSampleDSL.g:915:2: rule__DataSample__BadValueGeneratorNamesAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__BadValueGeneratorNamesAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesAssignment_10_2()); 

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
    // $ANTLR end "rule__DataSample__Group_10__2__Impl"


    // $ANTLR start "rule__DataSample__Group_10__3"
    // InternalDataSampleDSL.g:925:1: rule__DataSample__Group_10__3 : rule__DataSample__Group_10__3__Impl rule__DataSample__Group_10__4 ;
    public final void rule__DataSample__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:929:1: ( rule__DataSample__Group_10__3__Impl rule__DataSample__Group_10__4 )
            // InternalDataSampleDSL.g:930:2: rule__DataSample__Group_10__3__Impl rule__DataSample__Group_10__4
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__DataSample__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group_10__4();

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
    // $ANTLR end "rule__DataSample__Group_10__3"


    // $ANTLR start "rule__DataSample__Group_10__3__Impl"
    // InternalDataSampleDSL.g:937:1: rule__DataSample__Group_10__3__Impl : ( ( rule__DataSample__Group_10_3__0 )* ) ;
    public final void rule__DataSample__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:941:1: ( ( ( rule__DataSample__Group_10_3__0 )* ) )
            // InternalDataSampleDSL.g:942:1: ( ( rule__DataSample__Group_10_3__0 )* )
            {
            // InternalDataSampleDSL.g:942:1: ( ( rule__DataSample__Group_10_3__0 )* )
            // InternalDataSampleDSL.g:943:1: ( rule__DataSample__Group_10_3__0 )*
            {
             before(grammarAccess.getDataSampleAccess().getGroup_10_3()); 
            // InternalDataSampleDSL.g:944:1: ( rule__DataSample__Group_10_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDataSampleDSL.g:944:2: rule__DataSample__Group_10_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    rule__DataSample__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDataSampleAccess().getGroup_10_3()); 

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
    // $ANTLR end "rule__DataSample__Group_10__3__Impl"


    // $ANTLR start "rule__DataSample__Group_10__4"
    // InternalDataSampleDSL.g:954:1: rule__DataSample__Group_10__4 : rule__DataSample__Group_10__4__Impl ;
    public final void rule__DataSample__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:958:1: ( rule__DataSample__Group_10__4__Impl )
            // InternalDataSampleDSL.g:959:2: rule__DataSample__Group_10__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group_10__4__Impl();

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
    // $ANTLR end "rule__DataSample__Group_10__4"


    // $ANTLR start "rule__DataSample__Group_10__4__Impl"
    // InternalDataSampleDSL.g:965:1: rule__DataSample__Group_10__4__Impl : ( '}' ) ;
    public final void rule__DataSample__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:969:1: ( ( '}' ) )
            // InternalDataSampleDSL.g:970:1: ( '}' )
            {
            // InternalDataSampleDSL.g:970:1: ( '}' )
            // InternalDataSampleDSL.g:971:1: '}'
            {
             before(grammarAccess.getDataSampleAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataSampleAccess().getRightCurlyBracketKeyword_10_4()); 

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
    // $ANTLR end "rule__DataSample__Group_10__4__Impl"


    // $ANTLR start "rule__DataSample__Group_10_3__0"
    // InternalDataSampleDSL.g:994:1: rule__DataSample__Group_10_3__0 : rule__DataSample__Group_10_3__0__Impl rule__DataSample__Group_10_3__1 ;
    public final void rule__DataSample__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:998:1: ( rule__DataSample__Group_10_3__0__Impl rule__DataSample__Group_10_3__1 )
            // InternalDataSampleDSL.g:999:2: rule__DataSample__Group_10_3__0__Impl rule__DataSample__Group_10_3__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__DataSample__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group_10_3__1();

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
    // $ANTLR end "rule__DataSample__Group_10_3__0"


    // $ANTLR start "rule__DataSample__Group_10_3__0__Impl"
    // InternalDataSampleDSL.g:1006:1: rule__DataSample__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__DataSample__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1010:1: ( ( ',' ) )
            // InternalDataSampleDSL.g:1011:1: ( ',' )
            {
            // InternalDataSampleDSL.g:1011:1: ( ',' )
            // InternalDataSampleDSL.g:1012:1: ','
            {
             before(grammarAccess.getDataSampleAccess().getCommaKeyword_10_3_0()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataSampleAccess().getCommaKeyword_10_3_0()); 

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
    // $ANTLR end "rule__DataSample__Group_10_3__0__Impl"


    // $ANTLR start "rule__DataSample__Group_10_3__1"
    // InternalDataSampleDSL.g:1025:1: rule__DataSample__Group_10_3__1 : rule__DataSample__Group_10_3__1__Impl ;
    public final void rule__DataSample__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1029:1: ( rule__DataSample__Group_10_3__1__Impl )
            // InternalDataSampleDSL.g:1030:2: rule__DataSample__Group_10_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group_10_3__1__Impl();

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
    // $ANTLR end "rule__DataSample__Group_10_3__1"


    // $ANTLR start "rule__DataSample__Group_10_3__1__Impl"
    // InternalDataSampleDSL.g:1036:1: rule__DataSample__Group_10_3__1__Impl : ( ( rule__DataSample__BadValueGeneratorNamesAssignment_10_3_1 ) ) ;
    public final void rule__DataSample__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1040:1: ( ( ( rule__DataSample__BadValueGeneratorNamesAssignment_10_3_1 ) ) )
            // InternalDataSampleDSL.g:1041:1: ( ( rule__DataSample__BadValueGeneratorNamesAssignment_10_3_1 ) )
            {
            // InternalDataSampleDSL.g:1041:1: ( ( rule__DataSample__BadValueGeneratorNamesAssignment_10_3_1 ) )
            // InternalDataSampleDSL.g:1042:1: ( rule__DataSample__BadValueGeneratorNamesAssignment_10_3_1 )
            {
             before(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesAssignment_10_3_1()); 
            // InternalDataSampleDSL.g:1043:1: ( rule__DataSample__BadValueGeneratorNamesAssignment_10_3_1 )
            // InternalDataSampleDSL.g:1043:2: rule__DataSample__BadValueGeneratorNamesAssignment_10_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__BadValueGeneratorNamesAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesAssignment_10_3_1()); 

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
    // $ANTLR end "rule__DataSample__Group_10_3__1__Impl"


    // $ANTLR start "rule__DataSample__Group_13__0"
    // InternalDataSampleDSL.g:1057:1: rule__DataSample__Group_13__0 : rule__DataSample__Group_13__0__Impl rule__DataSample__Group_13__1 ;
    public final void rule__DataSample__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1061:1: ( rule__DataSample__Group_13__0__Impl rule__DataSample__Group_13__1 )
            // InternalDataSampleDSL.g:1062:2: rule__DataSample__Group_13__0__Impl rule__DataSample__Group_13__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DataSample__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group_13__1();

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
    // $ANTLR end "rule__DataSample__Group_13__0"


    // $ANTLR start "rule__DataSample__Group_13__0__Impl"
    // InternalDataSampleDSL.g:1069:1: rule__DataSample__Group_13__0__Impl : ( ',' ) ;
    public final void rule__DataSample__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1073:1: ( ( ',' ) )
            // InternalDataSampleDSL.g:1074:1: ( ',' )
            {
            // InternalDataSampleDSL.g:1074:1: ( ',' )
            // InternalDataSampleDSL.g:1075:1: ','
            {
             before(grammarAccess.getDataSampleAccess().getCommaKeyword_13_0()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataSampleAccess().getCommaKeyword_13_0()); 

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
    // $ANTLR end "rule__DataSample__Group_13__0__Impl"


    // $ANTLR start "rule__DataSample__Group_13__1"
    // InternalDataSampleDSL.g:1088:1: rule__DataSample__Group_13__1 : rule__DataSample__Group_13__1__Impl ;
    public final void rule__DataSample__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1092:1: ( rule__DataSample__Group_13__1__Impl )
            // InternalDataSampleDSL.g:1093:2: rule__DataSample__Group_13__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group_13__1__Impl();

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
    // $ANTLR end "rule__DataSample__Group_13__1"


    // $ANTLR start "rule__DataSample__Group_13__1__Impl"
    // InternalDataSampleDSL.g:1099:1: rule__DataSample__Group_13__1__Impl : ( ( rule__DataSample__EntityGeneratorsAssignment_13_1 ) ) ;
    public final void rule__DataSample__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1103:1: ( ( ( rule__DataSample__EntityGeneratorsAssignment_13_1 ) ) )
            // InternalDataSampleDSL.g:1104:1: ( ( rule__DataSample__EntityGeneratorsAssignment_13_1 ) )
            {
            // InternalDataSampleDSL.g:1104:1: ( ( rule__DataSample__EntityGeneratorsAssignment_13_1 ) )
            // InternalDataSampleDSL.g:1105:1: ( rule__DataSample__EntityGeneratorsAssignment_13_1 )
            {
             before(grammarAccess.getDataSampleAccess().getEntityGeneratorsAssignment_13_1()); 
            // InternalDataSampleDSL.g:1106:1: ( rule__DataSample__EntityGeneratorsAssignment_13_1 )
            // InternalDataSampleDSL.g:1106:2: rule__DataSample__EntityGeneratorsAssignment_13_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__EntityGeneratorsAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSampleAccess().getEntityGeneratorsAssignment_13_1()); 

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
    // $ANTLR end "rule__DataSample__Group_13__1__Impl"


    // $ANTLR start "rule__DataSample__Group_15__0"
    // InternalDataSampleDSL.g:1120:1: rule__DataSample__Group_15__0 : rule__DataSample__Group_15__0__Impl rule__DataSample__Group_15__1 ;
    public final void rule__DataSample__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1124:1: ( rule__DataSample__Group_15__0__Impl rule__DataSample__Group_15__1 )
            // InternalDataSampleDSL.g:1125:2: rule__DataSample__Group_15__0__Impl rule__DataSample__Group_15__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__DataSample__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group_15__1();

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
    // $ANTLR end "rule__DataSample__Group_15__0"


    // $ANTLR start "rule__DataSample__Group_15__0__Impl"
    // InternalDataSampleDSL.g:1132:1: rule__DataSample__Group_15__0__Impl : ( ',' ) ;
    public final void rule__DataSample__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1136:1: ( ( ',' ) )
            // InternalDataSampleDSL.g:1137:1: ( ',' )
            {
            // InternalDataSampleDSL.g:1137:1: ( ',' )
            // InternalDataSampleDSL.g:1138:1: ','
            {
             before(grammarAccess.getDataSampleAccess().getCommaKeyword_15_0()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataSampleAccess().getCommaKeyword_15_0()); 

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
    // $ANTLR end "rule__DataSample__Group_15__0__Impl"


    // $ANTLR start "rule__DataSample__Group_15__1"
    // InternalDataSampleDSL.g:1151:1: rule__DataSample__Group_15__1 : rule__DataSample__Group_15__1__Impl ;
    public final void rule__DataSample__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1155:1: ( rule__DataSample__Group_15__1__Impl )
            // InternalDataSampleDSL.g:1156:2: rule__DataSample__Group_15__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group_15__1__Impl();

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
    // $ANTLR end "rule__DataSample__Group_15__1"


    // $ANTLR start "rule__DataSample__Group_15__1__Impl"
    // InternalDataSampleDSL.g:1162:1: rule__DataSample__Group_15__1__Impl : ( ( rule__DataSample__FieldGeneratorsAssignment_15_1 ) ) ;
    public final void rule__DataSample__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1166:1: ( ( ( rule__DataSample__FieldGeneratorsAssignment_15_1 ) ) )
            // InternalDataSampleDSL.g:1167:1: ( ( rule__DataSample__FieldGeneratorsAssignment_15_1 ) )
            {
            // InternalDataSampleDSL.g:1167:1: ( ( rule__DataSample__FieldGeneratorsAssignment_15_1 ) )
            // InternalDataSampleDSL.g:1168:1: ( rule__DataSample__FieldGeneratorsAssignment_15_1 )
            {
             before(grammarAccess.getDataSampleAccess().getFieldGeneratorsAssignment_15_1()); 
            // InternalDataSampleDSL.g:1169:1: ( rule__DataSample__FieldGeneratorsAssignment_15_1 )
            // InternalDataSampleDSL.g:1169:2: rule__DataSample__FieldGeneratorsAssignment_15_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__FieldGeneratorsAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSampleAccess().getFieldGeneratorsAssignment_15_1()); 

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
    // $ANTLR end "rule__DataSample__Group_15__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalDataSampleDSL.g:1183:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1187:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalDataSampleDSL.g:1188:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalDataSampleDSL.g:1195:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1199:1: ( ( ( '-' )? ) )
            // InternalDataSampleDSL.g:1200:1: ( ( '-' )? )
            {
            // InternalDataSampleDSL.g:1200:1: ( ( '-' )? )
            // InternalDataSampleDSL.g:1201:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalDataSampleDSL.g:1202:1: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDataSampleDSL.g:1203:2: '-'
                    {
                    match(input,25,FollowSets000.FOLLOW_2); 

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
    // InternalDataSampleDSL.g:1214:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1218:1: ( rule__EInt__Group__1__Impl )
            // InternalDataSampleDSL.g:1219:2: rule__EInt__Group__1__Impl
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
    // InternalDataSampleDSL.g:1225:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1229:1: ( ( RULE_INT ) )
            // InternalDataSampleDSL.g:1230:1: ( RULE_INT )
            {
            // InternalDataSampleDSL.g:1230:1: ( RULE_INT )
            // InternalDataSampleDSL.g:1231:1: RULE_INT
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


    // $ANTLR start "rule__EntityGenerator2__Group__0"
    // InternalDataSampleDSL.g:1246:1: rule__EntityGenerator2__Group__0 : rule__EntityGenerator2__Group__0__Impl rule__EntityGenerator2__Group__1 ;
    public final void rule__EntityGenerator2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1250:1: ( rule__EntityGenerator2__Group__0__Impl rule__EntityGenerator2__Group__1 )
            // InternalDataSampleDSL.g:1251:2: rule__EntityGenerator2__Group__0__Impl rule__EntityGenerator2__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__EntityGenerator2__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator2__Group__1();

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
    // $ANTLR end "rule__EntityGenerator2__Group__0"


    // $ANTLR start "rule__EntityGenerator2__Group__0__Impl"
    // InternalDataSampleDSL.g:1258:1: rule__EntityGenerator2__Group__0__Impl : ( () ) ;
    public final void rule__EntityGenerator2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1262:1: ( ( () ) )
            // InternalDataSampleDSL.g:1263:1: ( () )
            {
            // InternalDataSampleDSL.g:1263:1: ( () )
            // InternalDataSampleDSL.g:1264:1: ()
            {
             before(grammarAccess.getEntityGenerator2Access().getEntityGeneratorAction_0()); 
            // InternalDataSampleDSL.g:1265:1: ()
            // InternalDataSampleDSL.g:1267:1: 
            {
            }

             after(grammarAccess.getEntityGenerator2Access().getEntityGeneratorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator2__Group__0__Impl"


    // $ANTLR start "rule__EntityGenerator2__Group__1"
    // InternalDataSampleDSL.g:1277:1: rule__EntityGenerator2__Group__1 : rule__EntityGenerator2__Group__1__Impl rule__EntityGenerator2__Group__2 ;
    public final void rule__EntityGenerator2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1281:1: ( rule__EntityGenerator2__Group__1__Impl rule__EntityGenerator2__Group__2 )
            // InternalDataSampleDSL.g:1282:2: rule__EntityGenerator2__Group__1__Impl rule__EntityGenerator2__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__EntityGenerator2__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator2__Group__2();

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
    // $ANTLR end "rule__EntityGenerator2__Group__1"


    // $ANTLR start "rule__EntityGenerator2__Group__1__Impl"
    // InternalDataSampleDSL.g:1289:1: rule__EntityGenerator2__Group__1__Impl : ( ( rule__EntityGenerator2__NumberAssignment_1 ) ) ;
    public final void rule__EntityGenerator2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1293:1: ( ( ( rule__EntityGenerator2__NumberAssignment_1 ) ) )
            // InternalDataSampleDSL.g:1294:1: ( ( rule__EntityGenerator2__NumberAssignment_1 ) )
            {
            // InternalDataSampleDSL.g:1294:1: ( ( rule__EntityGenerator2__NumberAssignment_1 ) )
            // InternalDataSampleDSL.g:1295:1: ( rule__EntityGenerator2__NumberAssignment_1 )
            {
             before(grammarAccess.getEntityGenerator2Access().getNumberAssignment_1()); 
            // InternalDataSampleDSL.g:1296:1: ( rule__EntityGenerator2__NumberAssignment_1 )
            // InternalDataSampleDSL.g:1296:2: rule__EntityGenerator2__NumberAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator2__NumberAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityGenerator2Access().getNumberAssignment_1()); 

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
    // $ANTLR end "rule__EntityGenerator2__Group__1__Impl"


    // $ANTLR start "rule__EntityGenerator2__Group__2"
    // InternalDataSampleDSL.g:1306:1: rule__EntityGenerator2__Group__2 : rule__EntityGenerator2__Group__2__Impl ;
    public final void rule__EntityGenerator2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1310:1: ( rule__EntityGenerator2__Group__2__Impl )
            // InternalDataSampleDSL.g:1311:2: rule__EntityGenerator2__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator2__Group__2__Impl();

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
    // $ANTLR end "rule__EntityGenerator2__Group__2"


    // $ANTLR start "rule__EntityGenerator2__Group__2__Impl"
    // InternalDataSampleDSL.g:1317:1: rule__EntityGenerator2__Group__2__Impl : ( ( rule__EntityGenerator2__EntityNameAssignment_2 ) ) ;
    public final void rule__EntityGenerator2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1321:1: ( ( ( rule__EntityGenerator2__EntityNameAssignment_2 ) ) )
            // InternalDataSampleDSL.g:1322:1: ( ( rule__EntityGenerator2__EntityNameAssignment_2 ) )
            {
            // InternalDataSampleDSL.g:1322:1: ( ( rule__EntityGenerator2__EntityNameAssignment_2 ) )
            // InternalDataSampleDSL.g:1323:1: ( rule__EntityGenerator2__EntityNameAssignment_2 )
            {
             before(grammarAccess.getEntityGenerator2Access().getEntityNameAssignment_2()); 
            // InternalDataSampleDSL.g:1324:1: ( rule__EntityGenerator2__EntityNameAssignment_2 )
            // InternalDataSampleDSL.g:1324:2: rule__EntityGenerator2__EntityNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator2__EntityNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityGenerator2Access().getEntityNameAssignment_2()); 

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
    // $ANTLR end "rule__EntityGenerator2__Group__2__Impl"


    // $ANTLR start "rule__FieldGenerator2__Group__0"
    // InternalDataSampleDSL.g:1344:1: rule__FieldGenerator2__Group__0 : rule__FieldGenerator2__Group__0__Impl rule__FieldGenerator2__Group__1 ;
    public final void rule__FieldGenerator2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1348:1: ( rule__FieldGenerator2__Group__0__Impl rule__FieldGenerator2__Group__1 )
            // InternalDataSampleDSL.g:1349:2: rule__FieldGenerator2__Group__0__Impl rule__FieldGenerator2__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__FieldGenerator2__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator2__Group__1();

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
    // $ANTLR end "rule__FieldGenerator2__Group__0"


    // $ANTLR start "rule__FieldGenerator2__Group__0__Impl"
    // InternalDataSampleDSL.g:1356:1: rule__FieldGenerator2__Group__0__Impl : ( 'forField' ) ;
    public final void rule__FieldGenerator2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1360:1: ( ( 'forField' ) )
            // InternalDataSampleDSL.g:1361:1: ( 'forField' )
            {
            // InternalDataSampleDSL.g:1361:1: ( 'forField' )
            // InternalDataSampleDSL.g:1362:1: 'forField'
            {
             before(grammarAccess.getFieldGenerator2Access().getForFieldKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldGenerator2Access().getForFieldKeyword_0()); 

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
    // $ANTLR end "rule__FieldGenerator2__Group__0__Impl"


    // $ANTLR start "rule__FieldGenerator2__Group__1"
    // InternalDataSampleDSL.g:1375:1: rule__FieldGenerator2__Group__1 : rule__FieldGenerator2__Group__1__Impl rule__FieldGenerator2__Group__2 ;
    public final void rule__FieldGenerator2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1379:1: ( rule__FieldGenerator2__Group__1__Impl rule__FieldGenerator2__Group__2 )
            // InternalDataSampleDSL.g:1380:2: rule__FieldGenerator2__Group__1__Impl rule__FieldGenerator2__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__FieldGenerator2__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator2__Group__2();

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
    // $ANTLR end "rule__FieldGenerator2__Group__1"


    // $ANTLR start "rule__FieldGenerator2__Group__1__Impl"
    // InternalDataSampleDSL.g:1387:1: rule__FieldGenerator2__Group__1__Impl : ( ( rule__FieldGenerator2__EntityNameAssignment_1 ) ) ;
    public final void rule__FieldGenerator2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1391:1: ( ( ( rule__FieldGenerator2__EntityNameAssignment_1 ) ) )
            // InternalDataSampleDSL.g:1392:1: ( ( rule__FieldGenerator2__EntityNameAssignment_1 ) )
            {
            // InternalDataSampleDSL.g:1392:1: ( ( rule__FieldGenerator2__EntityNameAssignment_1 ) )
            // InternalDataSampleDSL.g:1393:1: ( rule__FieldGenerator2__EntityNameAssignment_1 )
            {
             before(grammarAccess.getFieldGenerator2Access().getEntityNameAssignment_1()); 
            // InternalDataSampleDSL.g:1394:1: ( rule__FieldGenerator2__EntityNameAssignment_1 )
            // InternalDataSampleDSL.g:1394:2: rule__FieldGenerator2__EntityNameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator2__EntityNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldGenerator2Access().getEntityNameAssignment_1()); 

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
    // $ANTLR end "rule__FieldGenerator2__Group__1__Impl"


    // $ANTLR start "rule__FieldGenerator2__Group__2"
    // InternalDataSampleDSL.g:1404:1: rule__FieldGenerator2__Group__2 : rule__FieldGenerator2__Group__2__Impl rule__FieldGenerator2__Group__3 ;
    public final void rule__FieldGenerator2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1408:1: ( rule__FieldGenerator2__Group__2__Impl rule__FieldGenerator2__Group__3 )
            // InternalDataSampleDSL.g:1409:2: rule__FieldGenerator2__Group__2__Impl rule__FieldGenerator2__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__FieldGenerator2__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator2__Group__3();

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
    // $ANTLR end "rule__FieldGenerator2__Group__2"


    // $ANTLR start "rule__FieldGenerator2__Group__2__Impl"
    // InternalDataSampleDSL.g:1416:1: rule__FieldGenerator2__Group__2__Impl : ( '.' ) ;
    public final void rule__FieldGenerator2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1420:1: ( ( '.' ) )
            // InternalDataSampleDSL.g:1421:1: ( '.' )
            {
            // InternalDataSampleDSL.g:1421:1: ( '.' )
            // InternalDataSampleDSL.g:1422:1: '.'
            {
             before(grammarAccess.getFieldGenerator2Access().getFullStopKeyword_2()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldGenerator2Access().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__FieldGenerator2__Group__2__Impl"


    // $ANTLR start "rule__FieldGenerator2__Group__3"
    // InternalDataSampleDSL.g:1435:1: rule__FieldGenerator2__Group__3 : rule__FieldGenerator2__Group__3__Impl rule__FieldGenerator2__Group__4 ;
    public final void rule__FieldGenerator2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1439:1: ( rule__FieldGenerator2__Group__3__Impl rule__FieldGenerator2__Group__4 )
            // InternalDataSampleDSL.g:1440:2: rule__FieldGenerator2__Group__3__Impl rule__FieldGenerator2__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__FieldGenerator2__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator2__Group__4();

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
    // $ANTLR end "rule__FieldGenerator2__Group__3"


    // $ANTLR start "rule__FieldGenerator2__Group__3__Impl"
    // InternalDataSampleDSL.g:1447:1: rule__FieldGenerator2__Group__3__Impl : ( ( rule__FieldGenerator2__FieldNameAssignment_3 ) ) ;
    public final void rule__FieldGenerator2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1451:1: ( ( ( rule__FieldGenerator2__FieldNameAssignment_3 ) ) )
            // InternalDataSampleDSL.g:1452:1: ( ( rule__FieldGenerator2__FieldNameAssignment_3 ) )
            {
            // InternalDataSampleDSL.g:1452:1: ( ( rule__FieldGenerator2__FieldNameAssignment_3 ) )
            // InternalDataSampleDSL.g:1453:1: ( rule__FieldGenerator2__FieldNameAssignment_3 )
            {
             before(grammarAccess.getFieldGenerator2Access().getFieldNameAssignment_3()); 
            // InternalDataSampleDSL.g:1454:1: ( rule__FieldGenerator2__FieldNameAssignment_3 )
            // InternalDataSampleDSL.g:1454:2: rule__FieldGenerator2__FieldNameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator2__FieldNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldGenerator2Access().getFieldNameAssignment_3()); 

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
    // $ANTLR end "rule__FieldGenerator2__Group__3__Impl"


    // $ANTLR start "rule__FieldGenerator2__Group__4"
    // InternalDataSampleDSL.g:1464:1: rule__FieldGenerator2__Group__4 : rule__FieldGenerator2__Group__4__Impl rule__FieldGenerator2__Group__5 ;
    public final void rule__FieldGenerator2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1468:1: ( rule__FieldGenerator2__Group__4__Impl rule__FieldGenerator2__Group__5 )
            // InternalDataSampleDSL.g:1469:2: rule__FieldGenerator2__Group__4__Impl rule__FieldGenerator2__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__FieldGenerator2__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator2__Group__5();

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
    // $ANTLR end "rule__FieldGenerator2__Group__4"


    // $ANTLR start "rule__FieldGenerator2__Group__4__Impl"
    // InternalDataSampleDSL.g:1476:1: rule__FieldGenerator2__Group__4__Impl : ( 'use' ) ;
    public final void rule__FieldGenerator2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1480:1: ( ( 'use' ) )
            // InternalDataSampleDSL.g:1481:1: ( 'use' )
            {
            // InternalDataSampleDSL.g:1481:1: ( 'use' )
            // InternalDataSampleDSL.g:1482:1: 'use'
            {
             before(grammarAccess.getFieldGenerator2Access().getUseKeyword_4()); 
            match(input,28,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldGenerator2Access().getUseKeyword_4()); 

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
    // $ANTLR end "rule__FieldGenerator2__Group__4__Impl"


    // $ANTLR start "rule__FieldGenerator2__Group__5"
    // InternalDataSampleDSL.g:1495:1: rule__FieldGenerator2__Group__5 : rule__FieldGenerator2__Group__5__Impl rule__FieldGenerator2__Group__6 ;
    public final void rule__FieldGenerator2__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1499:1: ( rule__FieldGenerator2__Group__5__Impl rule__FieldGenerator2__Group__6 )
            // InternalDataSampleDSL.g:1500:2: rule__FieldGenerator2__Group__5__Impl rule__FieldGenerator2__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__FieldGenerator2__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator2__Group__6();

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
    // $ANTLR end "rule__FieldGenerator2__Group__5"


    // $ANTLR start "rule__FieldGenerator2__Group__5__Impl"
    // InternalDataSampleDSL.g:1507:1: rule__FieldGenerator2__Group__5__Impl : ( ( rule__FieldGenerator2__GeneratorNameAssignment_5 ) ) ;
    public final void rule__FieldGenerator2__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1511:1: ( ( ( rule__FieldGenerator2__GeneratorNameAssignment_5 ) ) )
            // InternalDataSampleDSL.g:1512:1: ( ( rule__FieldGenerator2__GeneratorNameAssignment_5 ) )
            {
            // InternalDataSampleDSL.g:1512:1: ( ( rule__FieldGenerator2__GeneratorNameAssignment_5 ) )
            // InternalDataSampleDSL.g:1513:1: ( rule__FieldGenerator2__GeneratorNameAssignment_5 )
            {
             before(grammarAccess.getFieldGenerator2Access().getGeneratorNameAssignment_5()); 
            // InternalDataSampleDSL.g:1514:1: ( rule__FieldGenerator2__GeneratorNameAssignment_5 )
            // InternalDataSampleDSL.g:1514:2: rule__FieldGenerator2__GeneratorNameAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator2__GeneratorNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFieldGenerator2Access().getGeneratorNameAssignment_5()); 

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
    // $ANTLR end "rule__FieldGenerator2__Group__5__Impl"


    // $ANTLR start "rule__FieldGenerator2__Group__6"
    // InternalDataSampleDSL.g:1524:1: rule__FieldGenerator2__Group__6 : rule__FieldGenerator2__Group__6__Impl ;
    public final void rule__FieldGenerator2__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1528:1: ( rule__FieldGenerator2__Group__6__Impl )
            // InternalDataSampleDSL.g:1529:2: rule__FieldGenerator2__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator2__Group__6__Impl();

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
    // $ANTLR end "rule__FieldGenerator2__Group__6"


    // $ANTLR start "rule__FieldGenerator2__Group__6__Impl"
    // InternalDataSampleDSL.g:1535:1: rule__FieldGenerator2__Group__6__Impl : ( ( rule__FieldGenerator2__Group_6__0 )? ) ;
    public final void rule__FieldGenerator2__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1539:1: ( ( ( rule__FieldGenerator2__Group_6__0 )? ) )
            // InternalDataSampleDSL.g:1540:1: ( ( rule__FieldGenerator2__Group_6__0 )? )
            {
            // InternalDataSampleDSL.g:1540:1: ( ( rule__FieldGenerator2__Group_6__0 )? )
            // InternalDataSampleDSL.g:1541:1: ( rule__FieldGenerator2__Group_6__0 )?
            {
             before(grammarAccess.getFieldGenerator2Access().getGroup_6()); 
            // InternalDataSampleDSL.g:1542:1: ( rule__FieldGenerator2__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDataSampleDSL.g:1542:2: rule__FieldGenerator2__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__FieldGenerator2__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldGenerator2Access().getGroup_6()); 

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
    // $ANTLR end "rule__FieldGenerator2__Group__6__Impl"


    // $ANTLR start "rule__FieldGenerator2__Group_6__0"
    // InternalDataSampleDSL.g:1566:1: rule__FieldGenerator2__Group_6__0 : rule__FieldGenerator2__Group_6__0__Impl rule__FieldGenerator2__Group_6__1 ;
    public final void rule__FieldGenerator2__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1570:1: ( rule__FieldGenerator2__Group_6__0__Impl rule__FieldGenerator2__Group_6__1 )
            // InternalDataSampleDSL.g:1571:2: rule__FieldGenerator2__Group_6__0__Impl rule__FieldGenerator2__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__FieldGenerator2__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator2__Group_6__1();

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
    // $ANTLR end "rule__FieldGenerator2__Group_6__0"


    // $ANTLR start "rule__FieldGenerator2__Group_6__0__Impl"
    // InternalDataSampleDSL.g:1578:1: rule__FieldGenerator2__Group_6__0__Impl : ( 'with errorRate=' ) ;
    public final void rule__FieldGenerator2__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1582:1: ( ( 'with errorRate=' ) )
            // InternalDataSampleDSL.g:1583:1: ( 'with errorRate=' )
            {
            // InternalDataSampleDSL.g:1583:1: ( 'with errorRate=' )
            // InternalDataSampleDSL.g:1584:1: 'with errorRate='
            {
             before(grammarAccess.getFieldGenerator2Access().getWithErrorRateKeyword_6_0()); 
            match(input,29,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldGenerator2Access().getWithErrorRateKeyword_6_0()); 

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
    // $ANTLR end "rule__FieldGenerator2__Group_6__0__Impl"


    // $ANTLR start "rule__FieldGenerator2__Group_6__1"
    // InternalDataSampleDSL.g:1597:1: rule__FieldGenerator2__Group_6__1 : rule__FieldGenerator2__Group_6__1__Impl rule__FieldGenerator2__Group_6__2 ;
    public final void rule__FieldGenerator2__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1601:1: ( rule__FieldGenerator2__Group_6__1__Impl rule__FieldGenerator2__Group_6__2 )
            // InternalDataSampleDSL.g:1602:2: rule__FieldGenerator2__Group_6__1__Impl rule__FieldGenerator2__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__FieldGenerator2__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator2__Group_6__2();

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
    // $ANTLR end "rule__FieldGenerator2__Group_6__1"


    // $ANTLR start "rule__FieldGenerator2__Group_6__1__Impl"
    // InternalDataSampleDSL.g:1609:1: rule__FieldGenerator2__Group_6__1__Impl : ( ( rule__FieldGenerator2__ErrorRateAssignment_6_1 ) ) ;
    public final void rule__FieldGenerator2__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1613:1: ( ( ( rule__FieldGenerator2__ErrorRateAssignment_6_1 ) ) )
            // InternalDataSampleDSL.g:1614:1: ( ( rule__FieldGenerator2__ErrorRateAssignment_6_1 ) )
            {
            // InternalDataSampleDSL.g:1614:1: ( ( rule__FieldGenerator2__ErrorRateAssignment_6_1 ) )
            // InternalDataSampleDSL.g:1615:1: ( rule__FieldGenerator2__ErrorRateAssignment_6_1 )
            {
             before(grammarAccess.getFieldGenerator2Access().getErrorRateAssignment_6_1()); 
            // InternalDataSampleDSL.g:1616:1: ( rule__FieldGenerator2__ErrorRateAssignment_6_1 )
            // InternalDataSampleDSL.g:1616:2: rule__FieldGenerator2__ErrorRateAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator2__ErrorRateAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldGenerator2Access().getErrorRateAssignment_6_1()); 

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
    // $ANTLR end "rule__FieldGenerator2__Group_6__1__Impl"


    // $ANTLR start "rule__FieldGenerator2__Group_6__2"
    // InternalDataSampleDSL.g:1626:1: rule__FieldGenerator2__Group_6__2 : rule__FieldGenerator2__Group_6__2__Impl rule__FieldGenerator2__Group_6__3 ;
    public final void rule__FieldGenerator2__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1630:1: ( rule__FieldGenerator2__Group_6__2__Impl rule__FieldGenerator2__Group_6__3 )
            // InternalDataSampleDSL.g:1631:2: rule__FieldGenerator2__Group_6__2__Impl rule__FieldGenerator2__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__FieldGenerator2__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator2__Group_6__3();

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
    // $ANTLR end "rule__FieldGenerator2__Group_6__2"


    // $ANTLR start "rule__FieldGenerator2__Group_6__2__Impl"
    // InternalDataSampleDSL.g:1638:1: rule__FieldGenerator2__Group_6__2__Impl : ( '% generated with ' ) ;
    public final void rule__FieldGenerator2__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1642:1: ( ( '% generated with ' ) )
            // InternalDataSampleDSL.g:1643:1: ( '% generated with ' )
            {
            // InternalDataSampleDSL.g:1643:1: ( '% generated with ' )
            // InternalDataSampleDSL.g:1644:1: '% generated with '
            {
             before(grammarAccess.getFieldGenerator2Access().getGeneratedWithKeyword_6_2()); 
            match(input,30,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldGenerator2Access().getGeneratedWithKeyword_6_2()); 

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
    // $ANTLR end "rule__FieldGenerator2__Group_6__2__Impl"


    // $ANTLR start "rule__FieldGenerator2__Group_6__3"
    // InternalDataSampleDSL.g:1657:1: rule__FieldGenerator2__Group_6__3 : rule__FieldGenerator2__Group_6__3__Impl ;
    public final void rule__FieldGenerator2__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1661:1: ( rule__FieldGenerator2__Group_6__3__Impl )
            // InternalDataSampleDSL.g:1662:2: rule__FieldGenerator2__Group_6__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator2__Group_6__3__Impl();

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
    // $ANTLR end "rule__FieldGenerator2__Group_6__3"


    // $ANTLR start "rule__FieldGenerator2__Group_6__3__Impl"
    // InternalDataSampleDSL.g:1668:1: rule__FieldGenerator2__Group_6__3__Impl : ( ( rule__FieldGenerator2__ErrorGeneratorNameAssignment_6_3 ) ) ;
    public final void rule__FieldGenerator2__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1672:1: ( ( ( rule__FieldGenerator2__ErrorGeneratorNameAssignment_6_3 ) ) )
            // InternalDataSampleDSL.g:1673:1: ( ( rule__FieldGenerator2__ErrorGeneratorNameAssignment_6_3 ) )
            {
            // InternalDataSampleDSL.g:1673:1: ( ( rule__FieldGenerator2__ErrorGeneratorNameAssignment_6_3 ) )
            // InternalDataSampleDSL.g:1674:1: ( rule__FieldGenerator2__ErrorGeneratorNameAssignment_6_3 )
            {
             before(grammarAccess.getFieldGenerator2Access().getErrorGeneratorNameAssignment_6_3()); 
            // InternalDataSampleDSL.g:1675:1: ( rule__FieldGenerator2__ErrorGeneratorNameAssignment_6_3 )
            // InternalDataSampleDSL.g:1675:2: rule__FieldGenerator2__ErrorGeneratorNameAssignment_6_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator2__ErrorGeneratorNameAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldGenerator2Access().getErrorGeneratorNameAssignment_6_3()); 

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
    // $ANTLR end "rule__FieldGenerator2__Group_6__3__Impl"


    // $ANTLR start "rule__DataSample__NameAssignment_2"
    // InternalDataSampleDSL.g:1700:1: rule__DataSample__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DataSample__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1704:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:1705:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:1705:1: ( ruleEString )
            // InternalDataSampleDSL.g:1706:1: ruleEString
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
    // InternalDataSampleDSL.g:1715:1: rule__DataSample__PackageURIAssignment_4 : ( ruleEString ) ;
    public final void rule__DataSample__PackageURIAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1719:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:1720:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:1720:1: ( ruleEString )
            // InternalDataSampleDSL.g:1721:1: ruleEString
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


    // $ANTLR start "rule__DataSample__SeedAssignment_7"
    // InternalDataSampleDSL.g:1730:1: rule__DataSample__SeedAssignment_7 : ( ruleEInt ) ;
    public final void rule__DataSample__SeedAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1734:1: ( ( ruleEInt ) )
            // InternalDataSampleDSL.g:1735:1: ( ruleEInt )
            {
            // InternalDataSampleDSL.g:1735:1: ( ruleEInt )
            // InternalDataSampleDSL.g:1736:1: ruleEInt
            {
             before(grammarAccess.getDataSampleAccess().getSeedEIntParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDataSampleAccess().getSeedEIntParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__DataSample__SeedAssignment_7"


    // $ANTLR start "rule__DataSample__LanguageAssignment_9"
    // InternalDataSampleDSL.g:1745:1: rule__DataSample__LanguageAssignment_9 : ( ruleLanguage ) ;
    public final void rule__DataSample__LanguageAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1749:1: ( ( ruleLanguage ) )
            // InternalDataSampleDSL.g:1750:1: ( ruleLanguage )
            {
            // InternalDataSampleDSL.g:1750:1: ( ruleLanguage )
            // InternalDataSampleDSL.g:1751:1: ruleLanguage
            {
             before(grammarAccess.getDataSampleAccess().getLanguageLanguageEnumRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getDataSampleAccess().getLanguageLanguageEnumRuleCall_9_0()); 

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
    // $ANTLR end "rule__DataSample__LanguageAssignment_9"


    // $ANTLR start "rule__DataSample__BadValueGeneratorNamesAssignment_10_2"
    // InternalDataSampleDSL.g:1760:1: rule__DataSample__BadValueGeneratorNamesAssignment_10_2 : ( ruleEString ) ;
    public final void rule__DataSample__BadValueGeneratorNamesAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1764:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:1765:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:1765:1: ( ruleEString )
            // InternalDataSampleDSL.g:1766:1: ruleEString
            {
             before(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesEStringParserRuleCall_10_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesEStringParserRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__DataSample__BadValueGeneratorNamesAssignment_10_2"


    // $ANTLR start "rule__DataSample__BadValueGeneratorNamesAssignment_10_3_1"
    // InternalDataSampleDSL.g:1775:1: rule__DataSample__BadValueGeneratorNamesAssignment_10_3_1 : ( ruleEString ) ;
    public final void rule__DataSample__BadValueGeneratorNamesAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1779:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:1780:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:1780:1: ( ruleEString )
            // InternalDataSampleDSL.g:1781:1: ruleEString
            {
             before(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesEStringParserRuleCall_10_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesEStringParserRuleCall_10_3_1_0()); 

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
    // $ANTLR end "rule__DataSample__BadValueGeneratorNamesAssignment_10_3_1"


    // $ANTLR start "rule__DataSample__EntityGeneratorsAssignment_12"
    // InternalDataSampleDSL.g:1790:1: rule__DataSample__EntityGeneratorsAssignment_12 : ( ruleEntityGenerator2 ) ;
    public final void rule__DataSample__EntityGeneratorsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1794:1: ( ( ruleEntityGenerator2 ) )
            // InternalDataSampleDSL.g:1795:1: ( ruleEntityGenerator2 )
            {
            // InternalDataSampleDSL.g:1795:1: ( ruleEntityGenerator2 )
            // InternalDataSampleDSL.g:1796:1: ruleEntityGenerator2
            {
             before(grammarAccess.getDataSampleAccess().getEntityGeneratorsEntityGenerator2ParserRuleCall_12_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEntityGenerator2();

            state._fsp--;

             after(grammarAccess.getDataSampleAccess().getEntityGeneratorsEntityGenerator2ParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__DataSample__EntityGeneratorsAssignment_12"


    // $ANTLR start "rule__DataSample__EntityGeneratorsAssignment_13_1"
    // InternalDataSampleDSL.g:1805:1: rule__DataSample__EntityGeneratorsAssignment_13_1 : ( ruleEntityGenerator2 ) ;
    public final void rule__DataSample__EntityGeneratorsAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1809:1: ( ( ruleEntityGenerator2 ) )
            // InternalDataSampleDSL.g:1810:1: ( ruleEntityGenerator2 )
            {
            // InternalDataSampleDSL.g:1810:1: ( ruleEntityGenerator2 )
            // InternalDataSampleDSL.g:1811:1: ruleEntityGenerator2
            {
             before(grammarAccess.getDataSampleAccess().getEntityGeneratorsEntityGenerator2ParserRuleCall_13_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEntityGenerator2();

            state._fsp--;

             after(grammarAccess.getDataSampleAccess().getEntityGeneratorsEntityGenerator2ParserRuleCall_13_1_0()); 

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
    // $ANTLR end "rule__DataSample__EntityGeneratorsAssignment_13_1"


    // $ANTLR start "rule__DataSample__FieldGeneratorsAssignment_14"
    // InternalDataSampleDSL.g:1820:1: rule__DataSample__FieldGeneratorsAssignment_14 : ( ruleFieldGenerator2 ) ;
    public final void rule__DataSample__FieldGeneratorsAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1824:1: ( ( ruleFieldGenerator2 ) )
            // InternalDataSampleDSL.g:1825:1: ( ruleFieldGenerator2 )
            {
            // InternalDataSampleDSL.g:1825:1: ( ruleFieldGenerator2 )
            // InternalDataSampleDSL.g:1826:1: ruleFieldGenerator2
            {
             before(grammarAccess.getDataSampleAccess().getFieldGeneratorsFieldGenerator2ParserRuleCall_14_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFieldGenerator2();

            state._fsp--;

             after(grammarAccess.getDataSampleAccess().getFieldGeneratorsFieldGenerator2ParserRuleCall_14_0()); 

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
    // $ANTLR end "rule__DataSample__FieldGeneratorsAssignment_14"


    // $ANTLR start "rule__DataSample__FieldGeneratorsAssignment_15_1"
    // InternalDataSampleDSL.g:1835:1: rule__DataSample__FieldGeneratorsAssignment_15_1 : ( ruleFieldGenerator2 ) ;
    public final void rule__DataSample__FieldGeneratorsAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1839:1: ( ( ruleFieldGenerator2 ) )
            // InternalDataSampleDSL.g:1840:1: ( ruleFieldGenerator2 )
            {
            // InternalDataSampleDSL.g:1840:1: ( ruleFieldGenerator2 )
            // InternalDataSampleDSL.g:1841:1: ruleFieldGenerator2
            {
             before(grammarAccess.getDataSampleAccess().getFieldGeneratorsFieldGenerator2ParserRuleCall_15_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFieldGenerator2();

            state._fsp--;

             after(grammarAccess.getDataSampleAccess().getFieldGeneratorsFieldGenerator2ParserRuleCall_15_1_0()); 

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
    // $ANTLR end "rule__DataSample__FieldGeneratorsAssignment_15_1"


    // $ANTLR start "rule__EntityGenerator2__NumberAssignment_1"
    // InternalDataSampleDSL.g:1850:1: rule__EntityGenerator2__NumberAssignment_1 : ( ruleEInt ) ;
    public final void rule__EntityGenerator2__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1854:1: ( ( ruleEInt ) )
            // InternalDataSampleDSL.g:1855:1: ( ruleEInt )
            {
            // InternalDataSampleDSL.g:1855:1: ( ruleEInt )
            // InternalDataSampleDSL.g:1856:1: ruleEInt
            {
             before(grammarAccess.getEntityGenerator2Access().getNumberEIntParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEntityGenerator2Access().getNumberEIntParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EntityGenerator2__NumberAssignment_1"


    // $ANTLR start "rule__EntityGenerator2__EntityNameAssignment_2"
    // InternalDataSampleDSL.g:1865:1: rule__EntityGenerator2__EntityNameAssignment_2 : ( ruleEString ) ;
    public final void rule__EntityGenerator2__EntityNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1869:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:1870:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:1870:1: ( ruleEString )
            // InternalDataSampleDSL.g:1871:1: ruleEString
            {
             before(grammarAccess.getEntityGenerator2Access().getEntityNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntityGenerator2Access().getEntityNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__EntityGenerator2__EntityNameAssignment_2"


    // $ANTLR start "rule__FieldGenerator2__EntityNameAssignment_1"
    // InternalDataSampleDSL.g:1883:1: rule__FieldGenerator2__EntityNameAssignment_1 : ( ruleEString ) ;
    public final void rule__FieldGenerator2__EntityNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1887:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:1888:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:1888:1: ( ruleEString )
            // InternalDataSampleDSL.g:1889:1: ruleEString
            {
             before(grammarAccess.getFieldGenerator2Access().getEntityNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldGenerator2Access().getEntityNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FieldGenerator2__EntityNameAssignment_1"


    // $ANTLR start "rule__FieldGenerator2__FieldNameAssignment_3"
    // InternalDataSampleDSL.g:1898:1: rule__FieldGenerator2__FieldNameAssignment_3 : ( ruleEString ) ;
    public final void rule__FieldGenerator2__FieldNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1902:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:1903:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:1903:1: ( ruleEString )
            // InternalDataSampleDSL.g:1904:1: ruleEString
            {
             before(grammarAccess.getFieldGenerator2Access().getFieldNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldGenerator2Access().getFieldNameEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__FieldGenerator2__FieldNameAssignment_3"


    // $ANTLR start "rule__FieldGenerator2__GeneratorNameAssignment_5"
    // InternalDataSampleDSL.g:1913:1: rule__FieldGenerator2__GeneratorNameAssignment_5 : ( ruleEString ) ;
    public final void rule__FieldGenerator2__GeneratorNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1917:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:1918:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:1918:1: ( ruleEString )
            // InternalDataSampleDSL.g:1919:1: ruleEString
            {
             before(grammarAccess.getFieldGenerator2Access().getGeneratorNameEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldGenerator2Access().getGeneratorNameEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__FieldGenerator2__GeneratorNameAssignment_5"


    // $ANTLR start "rule__FieldGenerator2__ErrorRateAssignment_6_1"
    // InternalDataSampleDSL.g:1928:1: rule__FieldGenerator2__ErrorRateAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__FieldGenerator2__ErrorRateAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1932:1: ( ( ruleEInt ) )
            // InternalDataSampleDSL.g:1933:1: ( ruleEInt )
            {
            // InternalDataSampleDSL.g:1933:1: ( ruleEInt )
            // InternalDataSampleDSL.g:1934:1: ruleEInt
            {
             before(grammarAccess.getFieldGenerator2Access().getErrorRateEIntParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getFieldGenerator2Access().getErrorRateEIntParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__FieldGenerator2__ErrorRateAssignment_6_1"


    // $ANTLR start "rule__FieldGenerator2__ErrorGeneratorNameAssignment_6_3"
    // InternalDataSampleDSL.g:1943:1: rule__FieldGenerator2__ErrorGeneratorNameAssignment_6_3 : ( ruleEString ) ;
    public final void rule__FieldGenerator2__ErrorGeneratorNameAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1947:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:1948:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:1948:1: ( ruleEString )
            // InternalDataSampleDSL.g:1949:1: ruleEString
            {
             before(grammarAccess.getFieldGenerator2Access().getErrorGeneratorNameEStringParserRuleCall_6_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldGenerator2Access().getErrorGeneratorNameEStringParserRuleCall_6_3_0()); 

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
    // $ANTLR end "rule__FieldGenerator2__ErrorGeneratorNameAssignment_6_3"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000F800L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000005000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    }


}