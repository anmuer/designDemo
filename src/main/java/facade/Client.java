package facade;

public class Client {
    public static void main(String[] args){
        Fund fund = new Fund();
        fund.buyFund();
        fund.sellFund();
    }
}
