package abstractFactory;

public class Client {

    public static void main(String[] args){
        User user = new User();

        IFactory sqlserverFactory = new SqlServerFactory();
        IUser sqlserverUser = sqlserverFactory.createUser();
        sqlserverUser.insert(user);
        sqlserverUser.getUser(1);

        Department department = new Department();
        IFactory accessFactory = new AccessFactory();
        IDepartment accessDepartment = accessFactory.createDepart();
        accessDepartment.insert(department);
        accessDepartment.getDepartment(1);


    }

}
