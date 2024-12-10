package structural.adapter;

import structural.adapter.adapter.CreditCard;

public class App {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.pay("gold");
        //creditCard.pay("black");
    }
}
