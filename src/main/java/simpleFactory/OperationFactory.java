package simpleFactory;

import strategy.operation.*;

public class OperationFactory {
    public static Operation createOperation(char operate){
       Operation oper = null;
       switch (operate){
           case '+':
               oper = new OperationAdd();
               break;
           case '-':
               oper = new OperationSub();
               break;
           case '*':
               oper = new OperationMul();
               break;
           case '/':
               oper = new OperationDiv();
               break;
       }
       return oper;
    }


}
