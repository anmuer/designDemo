package decorator;

public class BigTrouser extends Decorator {
    public BigTrouser(String name) {
        super(name);
    }
    @Override
    public void show(){
        System.out.println("垮裤");
        super.show();
    }
}
