package command;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Waiter {

    private int chickenWing = 10;
    private int mutton = 10;

    private List<Command> orders = new ArrayList<Command>();

    void setOrders(Command command){
        if(chickenWing==0){
            System.out.println("服务员：不好意思，鸡翅没有了，请点别的");
        }else{
            orders.add(command);
            System.out.println("增加订单："+command.toString()+" "+new Date());
        }
    }

    void cancelOrder(Command command){
        orders.remove(command);
        System.out.println("取消订单："+command.toString()+" "+new Date());
    }

    public void notifyBarbecuer(){
        for (Command command: orders ) {
            command.excuteCommand();
        }
    }

}
