package state;

public class Client {
    public static void main(String[] args){
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();

        work.setHour(12);
        work.writeProgram();

        work.setHour(14);
        work.writeProgram();

        work.setFinish(false);
        work.setHour(22);
        work.writeProgram();

        work.setHour(19);
        work.setFinish(true);
        work.writeProgram();


    }
}
