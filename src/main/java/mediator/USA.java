package mediator;

public class USA extends Country {
    USA(UniteNations mediator) {
        super(mediator);
    }

    void declare(String message){
        mediator.declare(message,this);
    }
    void getMessage(String message){
        System.out.println("美国获得对方信息："+message);
    }
}
