package composite;

public class HRDepartment extends Company {
    HRDepartment(String name) {
        super(name);
    }

    void add(Company c) {

    }

    void remove(Company c) {

    }

    void display(int depth) {
        while(depth>0){
            System.out.print("-");
            depth--;
        }
        System.out.println(name);
    }

    void lineOfDuty() {
        System.out.println(name+" 员工招聘培训管理");
    }
}
