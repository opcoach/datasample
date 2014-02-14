/*
* generated by Xtext
*/
package com.opcoach.dsgen.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import com.opcoach.dsgen.xtext.services.DSGenDSLGrammarAccess;

public class DSGenDSLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private DSGenDSLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected com.opcoach.dsgen.xtext.parser.antlr.internal.InternalDSGenDSLParser createParser(XtextTokenStream stream) {
		return new com.opcoach.dsgen.xtext.parser.antlr.internal.InternalDSGenDSLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "DSGenModel";
	}
	
	public DSGenDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DSGenDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
