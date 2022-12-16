package InterpreterPattern;

public class TogetherExpression implements Expression{
    private Expression expr1 = null;
    private Expression expr2 = null;

    public TogetherExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
