package memento;

public class Client {

    public static void main(String[] args){

        Player player = new Player();
        System.out.println("开始状态");
        player.display();

        System.out.println("玩半小时之后的状态：");
        player.play();
        player.save();
        player.recoverState();
        player.display();

    }


}
