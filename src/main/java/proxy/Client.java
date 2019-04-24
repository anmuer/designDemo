package proxy;

public class Client {

    public static void main(String[] arg){

        Girl girl = new Girl("cai");
        Proxy proxy = new Proxy(girl);
        proxy.giveChocolate();
        proxy.giveDoll();
        proxy.giveFlower();

    }
}
