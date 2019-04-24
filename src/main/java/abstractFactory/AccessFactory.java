package abstractFactory;

public class AccessFactory implements IFactory {
    public IUser createUser() {
        return new AccessUser();
    }

    public IDepartment createDepart() {
        return new AccessDepartment();
    }
}
