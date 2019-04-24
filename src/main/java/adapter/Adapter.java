package adapter;

public class Adapter extends Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    void request(String s){
        adaptee.request(s);
    }
}
