package creational.AbstractFactory;

import creational.AbstractFactory.AbstractProduct.Card.Card;
import creational.AbstractFactory.AbstractProduct.Payment.Payment;
import creational.AbstractFactory.Factory.AbstractFactory;
import creational.AbstractFactory.Factory.FactoryProvider;

public class App {
    public static void main(String[] args) {
        abstractFactoryMethod();
    }

    private static void abstractFactoryMethod() {
        System.out.println("CARD: ");
        AbstractFactory<Card> abstractCardFactory = FactoryProvider.createFactoryProvider("CARD");
        Card card = abstractCardFactory.create("VISA");
        System.out.println(card.getCardType());
        System.out.println(card.getCardNumber());


        System.out.println("PAYMENT: ");
        AbstractFactory<Payment> abstractPaymentFactory = FactoryProvider.createFactoryProvider("Payment");
        Payment payment = abstractPaymentFactory.create("CREDIT");
        System.out.println(payment.doPayment());
        
    }
}
