// Generated from C:/Users/JA/Desktop/Compiler/gramma\JavaDog.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaDogParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaDogVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaDogParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(JavaDogParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaDogParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(JavaDogParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaDogParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(JavaDogParser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaDogParser#unsignedInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedInteger(JavaDogParser.UnsignedIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaDogParser#unsignedReal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedReal(JavaDogParser.UnsignedRealContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaDogParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(JavaDogParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaDogParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(JavaDogParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaDogParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(JavaDogParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaDogParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(JavaDogParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaDogParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(JavaDogParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaDogParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(JavaDogParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaDogParser#singleParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleParameter(JavaDogParser.SingleParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaDogParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaDogParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaDogParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(JavaDogParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaDogParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaDogParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaDogParser#expressionOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOperand(JavaDogParser.ExpressionOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaDogParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(JavaDogParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaDogParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(JavaDogParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaDogParser#singleArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleArgument(JavaDogParser.SingleArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaDogParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(JavaDogParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaDogParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(JavaDogParser.OperatorContext ctx);
}