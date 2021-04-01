// Generated from /Users/thomas.hanlon/intellij/AntlerExamples/src/main/java/helloWorld/Help.g4 by ANTLR 4.9.1
package helloWorld;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelpParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(HelpParser.RContext ctx);
}