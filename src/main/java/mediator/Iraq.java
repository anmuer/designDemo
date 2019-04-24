package mediator;

public class Iraq extends Country {
    Iraq(UniteNations mediator) {
        super(mediator);
    }

    void declare(String message){
        mediator.declare(message,this);
    }
    void getMessage(String message){
        System.out.println("伊拉克获得对方信息："+message);
    }
}
