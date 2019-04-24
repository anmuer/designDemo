package abstractFactory;

public class SqlserverUser implements IUser {
    public void insert(User user) {
        System.out.println("在SQL Server中给User表添加一条数据");
    }

    public User getUser(int id) {
        System.out.println("在SQL Server中根据id查询出User表中的数据");
        return null;
    }
}
