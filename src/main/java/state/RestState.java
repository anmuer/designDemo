package state;

public class RestState extends State {
    public void working(Work w) {
        System.out.println(w.hour+" : 工作完成，下班啦");
    }
}
