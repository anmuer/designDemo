package mediator;

public class UniteNationsSecurityCouncil extends UniteNations {

    private USA usa;
    private Iraq iraq;


    public void setUsa(USA usa) {
        this.usa = usa;
    }

    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }

    void declare(String message, Country colleague) {
        if(usa == colleague){
            iraq.getMessage(message);
        }else{
            usa.getMessage(message);
        }
    }
}
