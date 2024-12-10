package creational.FactoryMethod.creator;

import creational.FactoryMethod.Product.Payment;
import creational.FactoryMethod.Product.TypePayment;
import creational.FactoryMethod.Product.Impl.CardPayment;
import creational.FactoryMethod.Product.Impl.GooglePayment;

public class PaymentFactory {

    public static Payment buildPayment(TypePayment typePayment){
            switch(typePayment){
                case GOOGLEPAY:
                    return new GooglePayment();
                case CARD:
                    return new CardPayment();
                default:
                    return new CardPayment();
            }
    }
}
