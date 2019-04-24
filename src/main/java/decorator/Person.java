package decorator;

public class Person {
    public String name;
    Person(String name){
        this.name = name;
    }
    public void show(){
        System.out.println("装扮的"+name);
    }

}
