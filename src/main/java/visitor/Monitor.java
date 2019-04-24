package visitor;

public class Monitor implements IComputerPart {
    public void accept(IComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
