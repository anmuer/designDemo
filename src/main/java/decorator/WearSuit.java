package decorator;

public class WearSuit extends Decorator {
    public WearSuit(String name) {
        super(name);
    }
    @Override
    public void show(){
        System.out.println("西装");
        super.show();
    }
}
