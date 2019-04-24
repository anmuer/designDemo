package strategy;

import strategy.operation.OperationAdd;
import strategy.operation.OperationDiv;

public class Client {
    public static void main(String[] arg){
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(10,5));

        context = new Context(new OperationDiv());
        System.out.println(context.executeStrategy(10,5));
    }
}
