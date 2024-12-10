package creational.AbstractFactory.AbstractProduct.Payment.Impl;

import creational.AbstractFactory.AbstractProduct.Payment.Payment;

public class Debit implements Payment{

    @Override
    public String doPayment() {
        return "DEBIT";
    }
    
}
