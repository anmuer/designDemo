package command;

public abstract class Command {

    protected Barbecuer barbecuer;

    Command(Barbecuer barbecuer){
        this.barbecuer = barbecuer;
    }
    abstract void excuteCommand();

}
