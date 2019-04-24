package abstractFactory;

public class SqlServerFactory implements IFactory {
    public IUser createUser() {
        return new SqlserverUser();
    }

    public IDepartment createDepart() {
        return new SqlserverDepartment();
    }
}
