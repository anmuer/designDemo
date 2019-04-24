package visitor;

public class Mouse implements IComputerPart {
    public void accept(IComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
