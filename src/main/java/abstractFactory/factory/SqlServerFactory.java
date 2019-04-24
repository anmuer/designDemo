package abstractFactory.factory;

public class SqlServerFactory implements IFactory {
    public IUser createUser() {
        return new SqlserverUser();
    }
}
