package abstractFactory.factory;

public class Client {

    public static void main(String[] args){
        User user = new User();

        IFactory sqlserverFactory = new SqlServerFactory();
        IUser sqlserverUser = sqlserverFactory.createUser();
        sqlserverUser.insert(user);
        sqlserverUser.getUser(1);
    }

}
