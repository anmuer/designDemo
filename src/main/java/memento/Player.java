package memento;

public class Player {

    private int vit = 100;
    private int atk = 100;
    private int def = 100;
    RoleStateManager roleStateManager = new RoleStateManager();

    void recoverState(){
        this.vit = roleStateManager.getRoleStateMemento().getVit();
        this.atk = roleStateManager.getRoleStateMemento().getAtk();
        this.def = roleStateManager.getRoleStateMemento().getDef();
    }

    void save(){
        roleStateManager.setRoleStateMemento(new RoleStateMemento(vit,atk,def));
    }

    void play(){
        this.vit = 50;
        this.atk = 50;
        this.def = 50;
    }

    void display(){
        System.out.println("体力："+this.vit);
        System.out.println("攻击力："+this.atk);
        System.out.println("防御力："+this.def);
    }

}
