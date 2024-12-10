package creational.Prototype;

import creational.Prototype.Prototype.MasterCard;
import creational.Prototype.Prototype.PrototypeCard;
import creational.Prototype.Prototype.Impl.Amex;
import creational.Prototype.Prototype.Impl.Visa;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {

        PrototypeFactory.loadCard();
        PrototypeCard cardVisaClone = PrototypeFactory.getInstance(PrototypeFactory.CardType.VISA);
        cardVisaClone.getCard();

        PrototypeCard cardAmexClone = PrototypeFactory.getInstance(PrototypeFactory.CardType.AMEX);
        cardAmexClone.getCard();
        /* PrototypeCard card = new Visa();
        PrototypeCard clonecard = card.clone();
        card.getCard();
        clonecard.getCard();

        PrototypeCard cardamex = new Amex();
        PrototypeCard clonecardamex = cardamex.clone();
        cardamex.getCard();
        clonecardamex.getCard();

        MasterCard mc = new MasterCard("MC");
        MasterCard mcclone = (MasterCard)mc.clone();
        System.out.println(mcclone.getName()); */
    }
}
