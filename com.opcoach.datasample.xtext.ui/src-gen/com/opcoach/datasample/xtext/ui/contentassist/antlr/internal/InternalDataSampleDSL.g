/*
 * generated by Xtext
 */
grammar InternalDataSampleDSL;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package com.opcoach.datasample.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleDataSample
entryRuleDataSample 
:
{ before(grammarAccess.getDataSampleRule()); }
	 ruleDataSample
{ after(grammarAccess.getDataSampleRule()); } 
	 EOF 
;

// Rule DataSample
ruleDataSample
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDataSampleAccess().getGroup()); }
(rule__DataSample__Group__0)
{ after(grammarAccess.getDataSampleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEString
entryRuleEString 
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEStringAccess().getAlternatives()); }
(rule__EString__Alternatives)
{ after(grammarAccess.getEStringAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEInt
entryRuleEInt 
:
{ before(grammarAccess.getEIntRule()); }
	 ruleEInt
{ after(grammarAccess.getEIntRule()); } 
	 EOF 
;

// Rule EInt
ruleEInt
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEIntAccess().getGroup()); }
(rule__EInt__Group__0)
{ after(grammarAccess.getEIntAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEntityGenerator
entryRuleEntityGenerator 
:
{ before(grammarAccess.getEntityGeneratorRule()); }
	 ruleEntityGenerator
{ after(grammarAccess.getEntityGeneratorRule()); } 
	 EOF 
;

// Rule EntityGenerator
ruleEntityGenerator
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEntityGeneratorAccess().getGroup()); }
(rule__EntityGenerator__Group__0)
{ after(grammarAccess.getEntityGeneratorAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFieldGenerator
entryRuleFieldGenerator 
:
{ before(grammarAccess.getFieldGeneratorRule()); }
	 ruleFieldGenerator
{ after(grammarAccess.getFieldGeneratorRule()); } 
	 EOF 
;

// Rule FieldGenerator
ruleFieldGenerator
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFieldGeneratorAccess().getGroup()); }
(rule__FieldGenerator__Group__0)
{ after(grammarAccess.getFieldGeneratorAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleParameter
entryRuleParameter 
:
{ before(grammarAccess.getParameterRule()); }
	 ruleParameter
{ after(grammarAccess.getParameterRule()); } 
	 EOF 
;

// Rule Parameter
ruleParameter
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getParameterAccess().getGroup()); }
(rule__Parameter__Group__0)
{ after(grammarAccess.getParameterAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




// Rule Language
ruleLanguage
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLanguageAccess().getAlternatives()); }
(rule__Language__Alternatives)
{ after(grammarAccess.getLanguageAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__EString__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	RULE_STRING
{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Language__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0()); }
(	'fr' 
)
{ after(grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1()); }
(	'en' 
)
{ after(grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2()); }
(	'de' 
)
{ after(grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2()); }
)

    |(
{ before(grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3()); }
(	'es' 
)
{ after(grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3()); }
)

    |(
{ before(grammarAccess.getLanguageAccess().getItEnumLiteralDeclaration_4()); }
(	'it' 
)
{ after(grammarAccess.getLanguageAccess().getItEnumLiteralDeclaration_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__DataSample__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__0__Impl
	rule__DataSample__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getDataSampleAction_0()); }
(

)
{ after(grammarAccess.getDataSampleAccess().getDataSampleAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__1__Impl
	rule__DataSample__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getSampleKeyword_1()); }

	'Sample' 

{ after(grammarAccess.getDataSampleAccess().getSampleKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__2__Impl
	rule__DataSample__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getNameAssignment_2()); }
(rule__DataSample__NameAssignment_2)
{ after(grammarAccess.getDataSampleAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__3__Impl
	rule__DataSample__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getForKeyword_3()); }

	'for' 

{ after(grammarAccess.getDataSampleAccess().getForKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__4__Impl
	rule__DataSample__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getPackageURIAssignment_4()); }
(rule__DataSample__PackageURIAssignment_4)
{ after(grammarAccess.getDataSampleAccess().getPackageURIAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__5__Impl
	rule__DataSample__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getSeedKeyword_5()); }

	'seed' 

{ after(grammarAccess.getDataSampleAccess().getSeedKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__6__Impl
	rule__DataSample__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getSeedAssignment_6()); }
(rule__DataSample__SeedAssignment_6)
{ after(grammarAccess.getDataSampleAccess().getSeedAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__7__Impl
	rule__DataSample__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getLanguageKeyword_7()); }

	'language' 

{ after(grammarAccess.getDataSampleAccess().getLanguageKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__8__Impl
	rule__DataSample__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getLanguageAssignment_8()); }
(rule__DataSample__LanguageAssignment_8)
{ after(grammarAccess.getDataSampleAccess().getLanguageAssignment_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getEntityGeneratorsAssignment_9()); }
(rule__DataSample__EntityGeneratorsAssignment_9)*
{ after(grammarAccess.getDataSampleAccess().getEntityGeneratorsAssignment_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}






















rule__EInt__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EInt__Group__0__Impl
	rule__EInt__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
(
	'-' 
)?
{ after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EInt__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EInt__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
{ after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__EntityGenerator__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EntityGenerator__Group__0__Impl
	rule__EntityGenerator__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityGenerator__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityGeneratorAccess().getEntityGeneratorAction_0()); }
(

)
{ after(grammarAccess.getEntityGeneratorAccess().getEntityGeneratorAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EntityGenerator__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EntityGenerator__Group__1__Impl
	rule__EntityGenerator__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityGenerator__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityGeneratorAccess().getGenerateKeyword_1()); }

	'generate' 

{ after(grammarAccess.getEntityGeneratorAccess().getGenerateKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EntityGenerator__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EntityGenerator__Group__2__Impl
	rule__EntityGenerator__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityGenerator__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityGeneratorAccess().getNumberAssignment_2()); }
(rule__EntityGenerator__NumberAssignment_2)
{ after(grammarAccess.getEntityGeneratorAccess().getNumberAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EntityGenerator__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EntityGenerator__Group__3__Impl
	rule__EntityGenerator__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityGenerator__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityGeneratorAccess().getInstancesOfKeyword_3()); }

	'instancesOf' 

{ after(grammarAccess.getEntityGeneratorAccess().getInstancesOfKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EntityGenerator__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EntityGenerator__Group__4__Impl
	rule__EntityGenerator__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityGenerator__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityGeneratorAccess().getEntityNameAssignment_4()); }
(rule__EntityGenerator__EntityNameAssignment_4)
{ after(grammarAccess.getEntityGeneratorAccess().getEntityNameAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EntityGenerator__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EntityGenerator__Group__5__Impl
	rule__EntityGenerator__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityGenerator__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityGeneratorAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getEntityGeneratorAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EntityGenerator__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EntityGenerator__Group__6__Impl
	rule__EntityGenerator__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityGenerator__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityGeneratorAccess().getFieldGeneratorsAssignment_6()); }
(rule__EntityGenerator__FieldGeneratorsAssignment_6)*
{ after(grammarAccess.getEntityGeneratorAccess().getFieldGeneratorsAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EntityGenerator__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EntityGenerator__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityGenerator__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityGeneratorAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getEntityGeneratorAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__FieldGenerator__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator__Group__0__Impl
	rule__FieldGenerator__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGeneratorAccess().getFieldGeneratorAction_0()); }
(

)
{ after(grammarAccess.getFieldGeneratorAccess().getFieldGeneratorAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldGenerator__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator__Group__1__Impl
	rule__FieldGenerator__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGeneratorAccess().getForFieldKeyword_1()); }

	'forField' 

{ after(grammarAccess.getFieldGeneratorAccess().getForFieldKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldGenerator__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator__Group__2__Impl
	rule__FieldGenerator__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGeneratorAccess().getFieldNameAssignment_2()); }
(rule__FieldGenerator__FieldNameAssignment_2)
{ after(grammarAccess.getFieldGeneratorAccess().getFieldNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldGenerator__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator__Group__3__Impl
	rule__FieldGenerator__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGeneratorAccess().getUseKeyword_3()); }

	'use' 

{ after(grammarAccess.getFieldGeneratorAccess().getUseKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldGenerator__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator__Group__4__Impl
	rule__FieldGenerator__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGeneratorAccess().getGeneratorNameAssignment_4()); }
(rule__FieldGenerator__GeneratorNameAssignment_4)
{ after(grammarAccess.getFieldGeneratorAccess().getGeneratorNameAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldGenerator__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator__Group__5__Impl
	rule__FieldGenerator__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGeneratorAccess().getGroup_5()); }
(rule__FieldGenerator__Group_5__0)?
{ after(grammarAccess.getFieldGeneratorAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldGenerator__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGeneratorAccess().getGroup_6()); }
(rule__FieldGenerator__Group_6__0)?
{ after(grammarAccess.getFieldGeneratorAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__FieldGenerator__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator__Group_5__0__Impl
	rule__FieldGenerator__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGeneratorAccess().getLeftParenthesisKeyword_5_0()); }

	'(' 

{ after(grammarAccess.getFieldGeneratorAccess().getLeftParenthesisKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldGenerator__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator__Group_5__1__Impl
	rule__FieldGenerator__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGeneratorAccess().getParametersAssignment_5_1()); }
(rule__FieldGenerator__ParametersAssignment_5_1)
{ after(grammarAccess.getFieldGeneratorAccess().getParametersAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldGenerator__Group_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator__Group_5__2__Impl
	rule__FieldGenerator__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator__Group_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGeneratorAccess().getGroup_5_2()); }
(rule__FieldGenerator__Group_5_2__0)*
{ after(grammarAccess.getFieldGeneratorAccess().getGroup_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldGenerator__Group_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator__Group_5__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator__Group_5__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGeneratorAccess().getRightParenthesisKeyword_5_3()); }

	')' 

{ after(grammarAccess.getFieldGeneratorAccess().getRightParenthesisKeyword_5_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__FieldGenerator__Group_5_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator__Group_5_2__0__Impl
	rule__FieldGenerator__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator__Group_5_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGeneratorAccess().getCommaKeyword_5_2_0()); }

	',' 

{ after(grammarAccess.getFieldGeneratorAccess().getCommaKeyword_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldGenerator__Group_5_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator__Group_5_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator__Group_5_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGeneratorAccess().getParametersAssignment_5_2_1()); }
(rule__FieldGenerator__ParametersAssignment_5_2_1)
{ after(grammarAccess.getFieldGeneratorAccess().getParametersAssignment_5_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__FieldGenerator__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator__Group_6__0__Impl
	rule__FieldGenerator__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGeneratorAccess().getWithErrorRateKeyword_6_0()); }

	'withErrorRate=' 

{ after(grammarAccess.getFieldGeneratorAccess().getWithErrorRateKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldGenerator__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator__Group_6__1__Impl
	rule__FieldGenerator__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGeneratorAccess().getErrorRateAssignment_6_1()); }
(rule__FieldGenerator__ErrorRateAssignment_6_1)
{ after(grammarAccess.getFieldGeneratorAccess().getErrorRateAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldGenerator__Group_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator__Group_6__2__Impl
	rule__FieldGenerator__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator__Group_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGeneratorAccess().getGeneratedWithKeyword_6_2()); }

	'generatedWith' 

{ after(grammarAccess.getFieldGeneratorAccess().getGeneratedWithKeyword_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldGenerator__Group_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator__Group_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator__Group_6__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGeneratorAccess().getErrorGeneratorNameAssignment_6_3()); }
(rule__FieldGenerator__ErrorGeneratorNameAssignment_6_3)
{ after(grammarAccess.getFieldGeneratorAccess().getErrorGeneratorNameAssignment_6_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Parameter__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group__0__Impl
	rule__Parameter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getNameAssignment_0()); }
(rule__Parameter__NameAssignment_0)
{ after(grammarAccess.getParameterAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group__1__Impl
	rule__Parameter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getEqualsSignKeyword_1()); }

	'=' 

{ after(grammarAccess.getParameterAccess().getEqualsSignKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getValueAssignment_2()); }
(rule__Parameter__ValueAssignment_2)
{ after(grammarAccess.getParameterAccess().getValueAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__DataSample__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getNameEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getDataSampleAccess().getNameEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__PackageURIAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getPackageURIEStringParserRuleCall_4_0()); }
	ruleEString{ after(grammarAccess.getDataSampleAccess().getPackageURIEStringParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__SeedAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getSeedEIntParserRuleCall_6_0()); }
	ruleEInt{ after(grammarAccess.getDataSampleAccess().getSeedEIntParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__LanguageAssignment_8
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getLanguageLanguageEnumRuleCall_8_0()); }
	ruleLanguage{ after(grammarAccess.getDataSampleAccess().getLanguageLanguageEnumRuleCall_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__EntityGeneratorsAssignment_9
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getEntityGeneratorsEntityGeneratorParserRuleCall_9_0()); }
	ruleEntityGenerator{ after(grammarAccess.getDataSampleAccess().getEntityGeneratorsEntityGeneratorParserRuleCall_9_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EntityGenerator__NumberAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityGeneratorAccess().getNumberEIntParserRuleCall_2_0()); }
	ruleEInt{ after(grammarAccess.getEntityGeneratorAccess().getNumberEIntParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EntityGenerator__EntityNameAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityGeneratorAccess().getEntityNameEStringParserRuleCall_4_0()); }
	ruleEString{ after(grammarAccess.getEntityGeneratorAccess().getEntityNameEStringParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EntityGenerator__FieldGeneratorsAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityGeneratorAccess().getFieldGeneratorsFieldGeneratorParserRuleCall_6_0()); }
	ruleFieldGenerator{ after(grammarAccess.getEntityGeneratorAccess().getFieldGeneratorsFieldGeneratorParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator__FieldNameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getFieldGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator__GeneratorNameAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGeneratorAccess().getGeneratorNameEStringParserRuleCall_4_0()); }
	ruleEString{ after(grammarAccess.getFieldGeneratorAccess().getGeneratorNameEStringParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator__ParametersAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGeneratorAccess().getParametersParameterParserRuleCall_5_1_0()); }
	ruleParameter{ after(grammarAccess.getFieldGeneratorAccess().getParametersParameterParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator__ParametersAssignment_5_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGeneratorAccess().getParametersParameterParserRuleCall_5_2_1_0()); }
	ruleParameter{ after(grammarAccess.getFieldGeneratorAccess().getParametersParameterParserRuleCall_5_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator__ErrorRateAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGeneratorAccess().getErrorRateEIntParserRuleCall_6_1_0()); }
	ruleEInt{ after(grammarAccess.getFieldGeneratorAccess().getErrorRateEIntParserRuleCall_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator__ErrorGeneratorNameAssignment_6_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGeneratorAccess().getErrorGeneratorNameEStringParserRuleCall_6_3_0()); }
	ruleEString{ after(grammarAccess.getFieldGeneratorAccess().getErrorGeneratorNameEStringParserRuleCall_6_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__ValueAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getValueEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getParameterAccess().getValueEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


