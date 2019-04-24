package state;

public class EveningState extends State {
    public void working(Work w) {
        if(w.finish){
            w.setState(new RestState());
            w.writeProgram();
        }else{
            if(w.hour<23)
                System.out.println(w.hour+" : 加班，疲劳至极，不管了回家睡觉");
        }
    }
}
