package bridge;

public class Vivo implements IBrand {

    private ISoftWare softWare;

    public void setSoft(ISoftWare soft) {
        this.softWare = soft;
    }

    public void run() {
        System.out.println("VIVO 品牌手机");
        softWare.run();
    }
}
