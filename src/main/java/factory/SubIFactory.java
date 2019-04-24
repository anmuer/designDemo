package factory;

public class SubIFactory implements IFactory {
    public IOperation createOperation() {
        return  new OperationSub();
    }
}
