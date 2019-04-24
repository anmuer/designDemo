package builder;

public class Client {

    public static void main(String[] args){

        Builder builderA = new Product1();
        Director director = new Director();
        System.out.println("*************first product*************");
        director.construct(builderA);


        Builder builderB = new Product2();
        System.out.println("*************second product*************");
        director.construct(builderB);

    }
}
