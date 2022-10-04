// Generated from fathi.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fathiParser}.
 */
public interface fathiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fathiParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(fathiParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link fathiParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(fathiParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link fathiParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(fathiParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link fathiParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(fathiParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link fathiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(fathiParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link fathiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(fathiParser.ExprContext ctx);
}