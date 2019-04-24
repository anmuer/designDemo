package decorator;

public class Client {
    public static void main(String[] arg){

        Person cc = new Person("cai");
        System.out.println("first decorator");

        TShirts shirts = new TShirts("cai");
        BigTrouser trouser = new BigTrouser("cai");
        WearSneakers sneakers = new WearSneakers("cai");

        shirts.decoratorPerson(cc);
        trouser.decoratorPerson(shirts);
        sneakers.decoratorPerson(trouser);
        sneakers.show();
    }
}
