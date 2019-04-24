package composite;

public class FinanceDepartment extends Company {
    FinanceDepartment(String name) {
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
        System.out.println(name+" 公司财务收支管理");
    }
}
