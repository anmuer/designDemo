package command;

public class BakeChickenWingCommand extends Command {
    BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    void excuteCommand() {
        barbecuer.bakeChickenWing();
    }
}
