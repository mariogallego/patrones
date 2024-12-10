package structural.facade;

import structural.facade.facade.CreditMarket;

public class App {
    public static void main(String[] args) {
        CreditMarket creditMarket = new CreditMarket();
        creditMarket.showCreditGold();
        creditMarket.showCreditSilver();
        creditMarket.showCreditBlack();
        
    }
}
