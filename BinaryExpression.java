package calculator;

abstract class BinaryExpression implements Expression {

    private final Expression lft;
    private final Expression rht;
    private final String operator;


    public BinaryExpression(Expression lft, Expression rht, String operator) {
        this.lft = lft;
        this.rht = rht;
        this.operator = operator;
    }

    protected abstract double _applyOperator(double lft, double rht);

    public String toString()
    {
        return "(" + lft + " " + operator + " " + rht + ")";
    }

    public double evaluate(final Bindings bindings)
    {
        return _applyOperator(lft.evaluate(bindings),rht.evaluate(bindings));
    }


}
