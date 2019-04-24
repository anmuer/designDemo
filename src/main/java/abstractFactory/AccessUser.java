package abstractFactory;

public class AccessUser implements IUser {
    public void insert(User user) {
        System.out.println("在 Access数据库 中给User表中插入一条数据");
    }

    public User getUser(int id) {
        System.out.println("在 Access数据库 中根据id查询出User表中的数据");
        return null;
    }
}
