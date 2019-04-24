package singleton;

public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject(){} // 构造方法为private类就不会被实例化

    static SingleObject getInstance(){
        return instance;
    }
    public void show(){
        System.out.println("hello cc! ");
    }
}
