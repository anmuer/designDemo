package factory;

public class DivIFactory implements IFactory {
    public IOperation createOperation() {
        return  new OperationDiv();
    }
}
