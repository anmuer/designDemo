package visitor;

public interface IComputerPart {
    void accept(IComputerPartVisitor computerPartVisitor);
}
