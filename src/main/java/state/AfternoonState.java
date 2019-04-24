package state;

public class AfternoonState extends State {
    public void working(Work w) {
        if(w.hour < 17){
            System.out.println(w.hour+" : 下午状态还不错，继续努力");
        }else{
            w.setState(new EveningState());
            w.writeProgram();
        }
    }
}
