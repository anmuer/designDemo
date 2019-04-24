package facade;

public class Fund {

    Stock stock;
    Bond bond;
    Realty realty;
    Fund(){
        stock = new Stock();
        bond = new Bond();
        realty = new Realty();
    }
    void buyFund(){
        stock.buy();
        bond.buy();
        realty.buy();
    }
    void sellFund(){
        stock.sell();
        bond.sell();
        realty.sell();
    }
}
