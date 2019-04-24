package abstractFactory;

public class AccessDepartment implements IDepartment {

    public void insert(Department department) {
        System.out.println("在 Access数据库 中给Department表添加一条数据");
    }

    public Department getDepartment(int id) {
        System.out.println("在 Access数据库 中根据id查询出Department表中的数据");
        return null;
    }
}
