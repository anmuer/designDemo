package mediator;

public class Client {
    public static void main(String[] args){
        UniteNationsSecurityCouncil unsc = new UniteNationsSecurityCouncil();
        USA usa = new USA(unsc);
        Iraq iraq = new Iraq(unsc);

        unsc.setIraq(iraq);
        unsc.setUsa(usa);

        usa.declare("不准研制核武器，否则要发动战争！");
        iraq.declare("我们没有研制核武器，也不怕侵略。");

    }
}
