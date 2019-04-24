package bridge;

public class Client {
    public static void main(String[] args){
        ISoftWare qq = new QQ();
        ISoftWare weChart = new WeChart();

        IBrand oppo = new Oppo();
        oppo.setSoft(qq);
        oppo.run();

        IBrand vivo = new Vivo();
        vivo.setSoft(weChart);
        vivo.run();
    }
}
