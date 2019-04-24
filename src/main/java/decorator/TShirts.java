package decorator;

public class TShirts extends Decorator {
    public TShirts(String name) {
        super(name);
    }
    @Override
    public void show(){
        System.out.println("大T恤");
        super.show();
    }
}
