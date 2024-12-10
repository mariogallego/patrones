package creational.FactoryMethod.Product.Impl;

import creational.FactoryMethod.Product.Payment;

public class CardPayment implements Payment{

    @Override
    public void doPayment() {
        System.out.println("Pagando con credit card");
    }
    
}
