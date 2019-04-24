package proxy;

public class Proxy implements GiveGift {

    Pursuit pursuit;
    public Proxy(Girl girl){
        this.pursuit = new Pursuit(girl);
    }

    public void giveDoll() {
        pursuit.giveDoll();
    }

    public void giveFlower() {
        pursuit.giveFlower();
    }

    public void giveChocolate() {
        pursuit.giveChocolate();
    }

}
