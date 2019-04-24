package factory;


public class Client {

    public static void main(String[] arg){

        IFactory iFactory = new AddIFactory();
        IOperation add = iFactory.createOperation();
        System.out.println(add.doOperation(10,23));


    }
}
