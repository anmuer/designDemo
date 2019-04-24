package visitor;

public class Computer implements IComputerPart {
    IComputerPart[] parts;
    Computer(){
        parts = new IComputerPart[]{new Monitor(),new Keyboard(),new Mouse()};
    }
    public void accept(IComputerPartVisitor computerPartVisitor) {
        for(int i=0; i<parts.length; i++){
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
