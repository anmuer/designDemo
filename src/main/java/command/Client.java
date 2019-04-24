package command;

public class Client {

    public static void main(String[] args){

        Barbecuer boy = new Barbecuer();
        Command mutton1 = new BakeMuttonCommand(boy);
        Command mutton2 = new BakeMuttonCommand(boy);
        Command chickenWing = new BakeChickenWingCommand(boy);

        Waiter girl = new Waiter();
        girl.setOrders(mutton1);
        girl.setOrders(mutton2);
        girl.setOrders(chickenWing);

        girl.notifyBarbecuer();

        girl.cancelOrder(mutton2);

        girl.notifyBarbecuer();
    }

}
