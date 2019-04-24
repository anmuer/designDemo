package bridge;

public class Oppo implements IBrand {

    private ISoftWare softWare;

    public void setSoft(ISoftWare soft) {
        this.softWare = soft;
    }

    public void run() {
        System.out.println("OPPO 品牌手机");
        softWare.run();
    }
}
