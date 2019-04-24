package interpreter;

public class TerminalExpression implements IExpression {

    private String data;

    TerminalExpression(String data){
        this.data = data;
    }

    public Boolean intepret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
