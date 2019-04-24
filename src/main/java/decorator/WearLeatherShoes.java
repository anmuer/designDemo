package decorator;

public class WearLeatherShoes extends Decorator {
    public WearLeatherShoes(String name) {
        super(name);
    }
    @Override
    public void show(){
        System.out.println("皮鞋");
        super.show();
    }
}
