package factory;

public class AddIFactory implements IFactory {
    public IOperation createOperation() {
        return  new OperationAdd();
    }
}
