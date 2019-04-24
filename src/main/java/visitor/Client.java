package visitor;

public class Client {
    public static void main(String[] args){
        IComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartVisitor());
    }
}
