package simpleFactory.operation;

public class OperationDiv implements Operation {

    public double doOperation(double numberA, double numberB) {
        if(numberB == 0){
            System.out.println("除数不能为 0");
            return 0;
        }
        return numberA / numberB;
    }
}
