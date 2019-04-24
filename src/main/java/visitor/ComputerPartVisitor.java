package visitor;

public class ComputerPartVisitor implements IComputerPartVisitor {
    public void visit(Computer computer) {
        System.out.println("computer");
    }

    public void visit(Mouse mouse) {
        System.out.println("mouse");
    }

    public void visit(Keyboard keyboard) {
        System.out.println("keyboard");
    }

    public void visit(Monitor monitor) {
        System.out.println("monitor");
    }
}
