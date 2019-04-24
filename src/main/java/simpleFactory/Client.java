package simpleFactory;

import strategy.operation.Operation;

public class Client {
    public static void main(String[] arg){

        Operation operation = OperationFactory.createOperation('+');
        System.out.println(operation.doOperation(10,5));

    }
}
