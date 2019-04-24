package state;

public class NoonState extends State {
    public void working(Work w) {
        if(w.hour < 13){
            System.out.println(w.hour+" : 中午饿了，吃饭，睡觉");
        }else{
            w.setState(new AfternoonState());
            w.writeProgram();
        }
    }
}
