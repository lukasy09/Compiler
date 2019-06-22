import java.util.List;

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
        stringBuilder.append("\n");
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        stringBuilder.append("function");
        stringBuilder.append(" ");
        stringBuilder.append(ctx.identifier().getText());
        stringBuilder.append(ctx.parameters().getText());
        stringBuilder.append("{");
        stringBuilder.append("\n");
        stringBuilder.append(this.visitFunctionBody(ctx.functionBody()));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Override
    public String visitParameters(JavaDogParser.ParametersContext ctx) {
        return super.visitParameters(ctx);
    }

    @Override
    public String visitSingleParameter(JavaDogParser.SingleParameterContext ctx) {
        return super.visitSingleParameter(ctx);
    }

    public String visitStatement(List<JavaDogParser.StatementContext> ctxList) {
        StringBuilder stringBuilder = new StringBuilder();
        for (JavaDogParser.StatementContext ctx: ctxList) {
            for (int i = 0; i < ctx.getChildCount(); i++) {
                if (ctx.getChild(i) instanceof JavaDogParser.AssignmentStatementContext) {
                    stringBuilder.append(this.visitAssignmentStatement((JavaDogParser.AssignmentStatementContext) ctx.getChild(i)));
                } else if (ctx.getChild(i) instanceof JavaDogParser.FunctionCallContext) {
                    stringBuilder.append(this.visitFunctionCall((JavaDogParser.FunctionCallContext) ctx.getChild(i)));
                } else if (ctx.getChild(i) instanceof JavaDogParser.InstructionContext) {
                    stringBuilder.append(this.visitInstruction((JavaDogParser.InstructionContext) ctx.getChild(i)));
                } else if (ctx.getChild(i) instanceof JavaDogParser.ReturnStatementContext) {
                    stringBuilder.append(this.visitReturnStatement((JavaDogParser.ReturnStatementContext) ctx.getChild(i)));
                }
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String visitAssignmentStatement(JavaDogParser.AssignmentStatementContext ctx) {
        StringBuilder stringBuilder = new StringBuilder();
        if (ctx.VAR() != null) {
            stringBuilder.append("var");
            stringBuilder.append(" ");
        }
        stringBuilder.append(ctx.identifier().getText());
        stringBuilder.append(" ");
        stringBuilder.append(ctx.ASSIGN());
        stringBuilder.append(" ");
        if(ctx.expression() != null){
            stringBuilder.append(ctx.expression().getText());
        }else{
            stringBuilder.append(ctx.functionCall().getText());
        }
        stringBuilder.append(";");
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    @Override
    public String visitInstruction(JavaDogParser.InstructionContext ctx) {
        return super.visitInstruction(ctx);
    }

    @Override
    public String visitIfStatement(JavaDogParser.IfStatementContext ctx) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("if");
        stringBuilder.append("(");
        if(ctx.boolValue() != null){
            stringBuilder.append(this.visitBoolValue(ctx.boolValue()));
        }
        if(ctx.expression() != null){
            stringBuilder.append(ctx.expression().getText());
        }
        stringBuilder.append(")");
        stringBuilder.append("{");
        for(int i =0; i<ctx.statement().size(); i++){
            stringBuilder.append(this.visitStatement(ctx.statement(i)));
        }
        stringBuilder.append("}");

        return stringBuilder.toString();
    }

    @Override
    public String visitWhileLoop(JavaDogParser.WhileLoopContext ctx) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("while");
        stringBuilder.append("(");
        stringBuilder.append(visitBoolValue(ctx.boolValue()));
        stringBuilder.append(")");
        stringBuilder.append("{");
        stringBuilder.append("\n");
        stringBuilder.append(this.visitStatement(ctx.statement()));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Override
    public String visitReturnStatement(JavaDogParser.ReturnStatementContext ctx) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("return");
        stringBuilder.append(" ");

        if(ctx.expression() != null){
            stringBuilder.append(ctx.expression().getText());
        }else if(ctx.identifier() != null){
            stringBuilder.append(ctx.identifier().getText());
        }else if(ctx.value() != null){
            stringBuilder.append(ctx.value().getText());
        }else{
            stringBuilder.append(ctx.functionCall().getText());
        }
        stringBuilder.append(";");
        return stringBuilder.toString();
    }

    @Override
    public String visitBoolValue(JavaDogParser.BoolValueContext ctx) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ctx.expressionOperand().get(0).getText());
        stringBuilder.append(" ");
        if(ctx.operator().getText().equals("and")){
            stringBuilder.append("&&");
        }else if(ctx.operator().getText().equals("or")){
            stringBuilder.append("||");

        }else{
            stringBuilder.append(ctx.operator().getText());
        }

        stringBuilder.append(" ");
        stringBuilder.append(ctx.expressionOperand().get(1).getText());
        return stringBuilder.toString();
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
