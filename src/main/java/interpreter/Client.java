package interpreter;

public class Client {

    public static IExpression getMaleExpression(){
        IExpression robert = new TerminalExpression("Robert");
        IExpression john = new TerminalExpression("John");
        return new OrExpression(robert,john);
    }
    public static IExpression getMarriredWomanExpression(){
        IExpression julie = new TerminalExpression("Julie");
        IExpression married = new TerminalExpression("Merried");
        return new AndExpression(julie,married);
    }
    public static void main(String[] args){
        IExpression isMale = getMaleExpression();
        IExpression isMarriedWoman = getMarriredWomanExpression();
        System.out.println("John is male? "+isMale.intepret("John"));
        System.out.println("Julie is a married woman? "+isMarriedWoman.intepret("Married Julie"));
    }


}
