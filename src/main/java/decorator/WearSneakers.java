package decorator;

public class WearSneakers extends Decorator {
    public WearSneakers(String name) {
        super(name);
    }
    @Override
    public void show(){
        System.out.println("破球鞋");
        super.show();
    }
}
