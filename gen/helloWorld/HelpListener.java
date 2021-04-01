// Generated from /Users/thomas.hanlon/intellij/AntlerExamples/src/main/java/helloWorld/Help.g4 by ANTLR 4.9.1
package helloWorld;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelpParser}.
 */
public interface HelpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelpParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(HelpParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelpParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(HelpParser.RContext ctx);
}