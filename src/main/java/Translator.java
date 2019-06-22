public class Translator extends JavaDogBaseVisitor<String> {

    @Override
    public String visitIdentifier(JavaDogParser.IdentifierContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitString(JavaDogParser.StringContext ctx) {
        return ctx.STRING_REGEX().getText();
    }

    @Override
    public String visitUnsignedNumber(JavaDogParser.UnsignedNumberContext ctx) {
        return super.visitUnsignedNumber(ctx);
    }

    @Override
    public String visitUnsignedInteger(JavaDogParser.UnsignedIntegerContext ctx) {
        return super.visitUnsignedInteger(ctx);
    }

    @Override
    public String visitUnsignedReal(JavaDogParser.UnsignedRealContext ctx) {
        return super.visitUnsignedReal(ctx);
    }

    @Override
    public String visitRoot(JavaDogParser.RootContext ctx) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(visitBody(ctx.body()));
        return stringBuilder.toString();
    }

    @Override
    public String visitBody(JavaDogParser.BodyContext ctx) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(visitChildren(ctx));
        return stringBuilder.toString();
    }

    @Override
    public String visitComment(JavaDogParser.CommentContext ctx) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("//");
        stringBuilder.append(" ");
        for(int i = 0 ; i< ctx.REGEX_ID().size(); i++){
            stringBuilder.append(ctx.REGEX_ID().get(i));
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    @Override
    public String visitFunctionBody(JavaDogParser.FunctionBodyContext ctx) {
        return super.visitFunctionBody(ctx);
    }

    @Override
    public String visitDeclaration(JavaDogParser.DeclarationContext ctx) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(visitVarDeclaration(ctx.varDeclaration()));
        return stringBuilder.toString();
    }

    @Override
    public String visitVarDeclaration(JavaDogParser.VarDeclarationContext ctx) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("var");
        stringBuilder.append(" ");
        stringBuilder.append(ctx.identifier().getText());
        stringBuilder.append(";");
        return stringBuilder.toString();
    }

    @Override
    public String visitFunctionDefinition(JavaDogParser.FunctionDefinitionContext ctx) {
        return super.visitFunctionDefinition(ctx);
    }

    @Override
    public String visitParameters(JavaDogParser.ParametersContext ctx) {
        return super.visitParameters(ctx);
    }

    @Override
    public String visitSingleParameter(JavaDogParser.SingleParameterContext ctx) {
        return super.visitSingleParameter(ctx);
    }

    @Override
    public String visitStatement(JavaDogParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public String visitAssignmentStatement(JavaDogParser.AssignmentStatementContext ctx) {
        return super.visitAssignmentStatement(ctx);
    }

    @Override
    public String visitInstruction(JavaDogParser.InstructionContext ctx) {
        return super.visitInstruction(ctx);
    }

    @Override
    public String visitIfStatement(JavaDogParser.IfStatementContext ctx) {
        return super.visitIfStatement(ctx);
    }

    @Override
    public String visitWhileLoop(JavaDogParser.WhileLoopContext ctx) {
        return super.visitWhileLoop(ctx);
    }

    @Override
    public String visitReturnStatement(JavaDogParser.ReturnStatementContext ctx) {
        return super.visitReturnStatement(ctx);
    }

    @Override
    public String visitBoolValue(JavaDogParser.BoolValueContext ctx) {
        return super.visitBoolValue(ctx);
    }

    @Override
    public String visitExpression(JavaDogParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public String visitExpressionOperand(JavaDogParser.ExpressionOperandContext ctx) {
        return super.visitExpressionOperand(ctx);
    }

    @Override
    public String visitFunctionCall(JavaDogParser.FunctionCallContext ctx) {
        return super.visitFunctionCall(ctx);
    }

    @Override
    public String visitArguments(JavaDogParser.ArgumentsContext ctx) {
        return super.visitArguments(ctx);
    }

    @Override
    public String visitSingleArgument(JavaDogParser.SingleArgumentContext ctx) {
        return super.visitSingleArgument(ctx);
    }

    @Override
    public String visitValue(JavaDogParser.ValueContext ctx) {
        return super.visitValue(ctx);
    }

    @Override
    public String visitOperator(JavaDogParser.OperatorContext ctx) {
        return super.visitOperator(ctx);
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if (aggregate == null) {
            return nextResult;
        }

        if (nextResult == null) {
            return aggregate;
        }

        StringBuilder sb = new StringBuilder(aggregate);
        sb.append(nextResult);

        return sb.toString();
    }
}