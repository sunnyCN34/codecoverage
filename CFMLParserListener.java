package codecoverage;
// Generated from CFMLParser.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CFMLParser}.
 */
public interface CFMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CFMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(CFMLParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(CFMLParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFMLParser#cfmlComment}.
	 * @param ctx the parse tree
	 */
	void enterCfmlComment(CFMLParser.CfmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFMLParser#cfmlComment}.
	 * @param ctx the parse tree
	 */
	void exitCfmlComment(CFMLParser.CfmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFMLParser#cfmlCloseTag}.
	 * @param ctx the parse tree
	 */
	void enterCfmlCloseTag(CFMLParser.CfmlCloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFMLParser#cfmlCloseTag}.
	 * @param ctx the parse tree
	 */
	void exitCfmlCloseTag(CFMLParser.CfmlCloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFMLParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(CFMLParser.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFMLParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(CFMLParser.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(CFMLParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(CFMLParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFMLParser#cfmlElement}.
	 * @param ctx the parse tree
	 */
	void enterCfmlElement(CFMLParser.CfmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFMLParser#cfmlElement}.
	 * @param ctx the parse tree
	 */
	void exitCfmlElement(CFMLParser.CfmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFMLParser#cfset}.
	 * @param ctx the parse tree
	 */
	void enterCfset(CFMLParser.CfsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFMLParser#cfset}.
	 * @param ctx the parse tree
	 */
	void exitCfset(CFMLParser.CfsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFMLParser#cfexpression}.
	 * @param ctx the parse tree
	 */
	void enterCfexpression(CFMLParser.CfexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFMLParser#cfexpression}.
	 * @param ctx the parse tree
	 */
	void exitCfexpression(CFMLParser.CfexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(CFMLParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(CFMLParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(CFMLParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(CFMLParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFMLParser#htmlAttributeName}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeName(CFMLParser.HtmlAttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFMLParser#htmlAttributeName}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeName(CFMLParser.HtmlAttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFMLParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeValue(CFMLParser.HtmlAttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFMLParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeValue(CFMLParser.HtmlAttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFMLParser#htmlTagName}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagName(CFMLParser.HtmlTagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFMLParser#htmlTagName}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagName(CFMLParser.HtmlTagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(CFMLParser.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(CFMLParser.HtmlChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMisc(CFMLParser.HtmlMiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMisc(CFMLParser.HtmlMiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFMLParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(CFMLParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFMLParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(CFMLParser.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFMLParser#xhtmlCDATA}.
	 * @param ctx the parse tree
	 */
	void enterXhtmlCDATA(CFMLParser.XhtmlCDATAContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFMLParser#xhtmlCDATA}.
	 * @param ctx the parse tree
	 */
	void exitXhtmlCDATA(CFMLParser.XhtmlCDATAContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFMLParser#dtd}.
	 * @param ctx the parse tree
	 */
	void enterDtd(CFMLParser.DtdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFMLParser#dtd}.
	 * @param ctx the parse tree
	 */
	void exitDtd(CFMLParser.DtdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFMLParser#xml}.
	 * @param ctx the parse tree
	 */
	void enterXml(CFMLParser.XmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFMLParser#xml}.
	 * @param ctx the parse tree
	 */
	void exitXml(CFMLParser.XmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFMLParser#scriptlet}.
	 * @param ctx the parse tree
	 */
	void enterScriptlet(CFMLParser.ScriptletContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFMLParser#scriptlet}.
	 * @param ctx the parse tree
	 */
	void exitScriptlet(CFMLParser.ScriptletContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFMLParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(CFMLParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFMLParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(CFMLParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFMLParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(CFMLParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFMLParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(CFMLParser.StyleContext ctx);
}