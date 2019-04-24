package composite;

import java.util.ArrayList;
import java.util.List;

public class ConcreateCompany extends Company {

    private List<Company> children = new ArrayList<Company>();

    ConcreateCompany(String name) {
        super(name);
    }

    void add(Company c) {
        children.add(c);
    }

    void remove(Company c) {
        children.remove(c);
    }

    void display(int depth) {

        int depth_a = depth;
        while(depth_a>0){
            System.out.print("-");
            depth_a--;
        }
        System.out.println(name);

        for (Company company: children) {

            company.display(depth+2);

        }


    }

    void lineOfDuty() {

        for (Company company:children ) {
            company.lineOfDuty();
        }

    }
}
