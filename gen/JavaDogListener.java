// Generated from C:/Users/JA/Desktop/Compiler/gramma\JavaDog.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaDogParser}.
 */
public interface JavaDogListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaDogParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(JavaDogParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDogParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(JavaDogParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaDogParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(JavaDogParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDogParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(JavaDogParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaDogParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(JavaDogParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDogParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(JavaDogParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaDogParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(JavaDogParser.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDogParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(JavaDogParser.UnsignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaDogParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedReal(JavaDogParser.UnsignedRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDogParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedReal(JavaDogParser.UnsignedRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaDogParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(JavaDogParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDogParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(JavaDogParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaDogParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(JavaDogParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDogParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(JavaDogParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaDogParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(JavaDogParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDogParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(JavaDogParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaDogParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(JavaDogParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDogParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(JavaDogParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaDogParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(JavaDogParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDogParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(JavaDogParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaDogParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(JavaDogParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDogParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(JavaDogParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaDogParser#singleParameter}.
	 * @param ctx the parse tree
	 */
	void enterSingleParameter(JavaDogParser.SingleParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDogParser#singleParameter}.
	 * @param ctx the parse tree
	 */
	void exitSingleParameter(JavaDogParser.SingleParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaDogParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaDogParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDogParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaDogParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaDogParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(JavaDogParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDogParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(JavaDogParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaDogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaDogParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaDogParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaDogParser#expressionOperand}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOperand(JavaDogParser.ExpressionOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDogParser#expressionOperand}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOperand(JavaDogParser.ExpressionOperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaDogParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(JavaDogParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDogParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(JavaDogParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaDogParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JavaDogParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDogParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JavaDogParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaDogParser#singleArgument}.
	 * @param ctx the parse tree
	 */
	void enterSingleArgument(JavaDogParser.SingleArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDogParser#singleArgument}.
	 * @param ctx the parse tree
	 */
	void exitSingleArgument(JavaDogParser.SingleArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaDogParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JavaDogParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDogParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JavaDogParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaDogParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(JavaDogParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDogParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(JavaDogParser.OperatorContext ctx);
}