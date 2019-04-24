package command;

public class BakeMuttonCommand extends Command {
    BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    void excuteCommand() {
        barbecuer.bakeNutton();
    }
}
