package strategy;

import strategy.operation.Operation;

public class Context {
    private Operation strategy;

    public Context(Operation strategy){
        this.strategy = strategy;
    }
    public double executeStrategy(double numberA, double numberB){
        return strategy.doOperation(numberA, numberB);
    }


}
