package singleton;

public class Client {

    public static void main(String[] args){
        SingleObject object = SingleObject.getInstance();
        object.show();
    }
}
