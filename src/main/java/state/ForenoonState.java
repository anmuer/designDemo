package state;

public class ForenoonState extends State {
    public void working(Work w) {
        if(w.hour < 12){
            System.out.println(w.hour+" : 上午精神抖擞");
        }else{
            w.setState(new NoonState());
            w.writeProgram();
        }
    }
}
