package state;

public class Work {
    int hour;
    Boolean finish;
    State state;

    Work(){
        this.state = new ForenoonState();
    }

    void setState(State state){
      this.state = state;
    }
    void writeProgram(){
        state.working(this);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public Boolean getFinish() {
        return finish;
    }

    public void setFinish(Boolean finish) {
        this.finish = finish;
    }
}
