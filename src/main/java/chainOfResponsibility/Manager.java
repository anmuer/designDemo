package chainOfResponsibility;

public abstract class Manager {

    protected String name;
    protected Manager superior;

    Manager(String name){
        this.name = name;
    }
    void setSuperior(Manager superior){
        this.superior = superior;
    }
    abstract void requestApplications(Request request);

}
