package observer;

public class Client {

    public static void main(String[] args){
        Boos boos = new Boos("boos");
        boos.attach(new StockObserver(boos,"workerA"));
        boos.attach(new StockObserver(boos,"workerB"));

        boos.notifyd();

    }

}
