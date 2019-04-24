package decorator;

public class WearTie extends Decorator {
    public WearTie(String name) {
        super(name);
    }
    @Override
    public void show(){
        System.out.println("领带");
        super.show();
    }
}
