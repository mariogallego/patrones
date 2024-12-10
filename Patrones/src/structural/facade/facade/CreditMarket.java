package structural.facade.facade;

import structural.facade.modules.Credit;
import structural.facade.modules.impl.Black;
import structural.facade.modules.impl.Gold;
import structural.facade.modules.impl.Silver;

public class CreditMarket {

    private Credit gold;
    private Credit silver;
    private Credit black;

    public CreditMarket() {
        this.gold = new Gold();
        this.silver = new Silver();
        this.black = new Black();
    }

    public void showCreditGold(){
        gold.showCredit();
    }

    public void showCreditSilver(){
        silver.showCredit();
    }

    public void showCreditBlack(){
        black.showCredit();
    }
}
