package simpleFactory.operation;

public class OperationAdd implements Operation {
    public double doOperation(double numberA, double numberB) {
        return  numberA+numberB;
    }
}
