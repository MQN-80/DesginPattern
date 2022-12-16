package InterpreterPattern;

public class WhereExpression implements Expression{
    private Expression expr1 = null;
    private Expression expr2 = null;
    private Expression expr3 = null;

    public WhereExpression(Expression expr1, Expression expr2, Expression expr3) {
        this.expr1 = expr1;
        this.expr2 = expr2;
        this.expr3 = expr3;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context)|| expr3.interpret(context);
    }
}
