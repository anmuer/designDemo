package observer;

public class StockObserver implements IObserver{

    private String name;
    private String state;
    private Boos subject;

    public StockObserver(Boos subject,String name){
        this.subject = subject;
        this.name = name;
    }
    public void update() {
        state = subject.getState();
        System.out.println(state+"回来了，"+name+"快回工作岗位");
    }
}
