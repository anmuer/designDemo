package interpreter;

public class OrExpression implements IExpression {

    private IExpression expression1 = null;
    private IExpression expression2 = null;

    OrExpression(IExpression expression1, IExpression expression2){
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    public Boolean intepret(String context) {
        return expression1.intepret(context) || expression2.intepret(context);
    }
}
