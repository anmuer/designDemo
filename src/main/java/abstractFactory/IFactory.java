package abstractFactory;

public interface IFactory {
    IUser createUser();
    IDepartment createDepart(); // 注意 抽象工厂在工厂接口新增了 IDepartment 接口
}
