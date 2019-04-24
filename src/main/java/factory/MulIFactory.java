package factory;

public class MulIFactory implements IFactory {
    public IOperation createOperation() {
        return new OperationMul();
    }
}
