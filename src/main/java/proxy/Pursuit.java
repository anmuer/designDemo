package proxy;

public class Pursuit implements GiveGift {

    Girl girl;
    public Pursuit(Girl girl){
        this.girl = girl;
    }

    public void giveDoll() {
        System.out.println("送你娃娃"+girl.name);
    }

    public void giveFlower() {
        System.out.println("送你花花"+girl.name);
    }

    public void giveChocolate() {
        System.out.println("送你巧克力"+girl.name);
    }
}
