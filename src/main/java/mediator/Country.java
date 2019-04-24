package mediator;

public abstract class Country {

    protected UniteNations mediator;
    Country(UniteNations mediator){
        this.mediator = mediator;
    }

}
