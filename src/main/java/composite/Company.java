package composite;


abstract class Company {

    String name;
    Company(String name){
        this.name = name;
    }

    abstract void add(Company c);
    abstract void remove(Company c);
    abstract void display(int depth);
    abstract void lineOfDuty();

}
