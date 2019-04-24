package decorator;

public class Decorator extends Person {

    Person person;

    Decorator(String name) {
        super(name);
    }

    void decoratorPerson(Person person){
        this.person = person;
    }

    @Override
    public void show(){
        if(person != null){
            person.show();
        }
    }

}
