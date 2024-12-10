package creational.AbstractFactory.Factory.Impl;

import creational.AbstractFactory.AbstractProduct.Payment.Payment;
import creational.AbstractFactory.AbstractProduct.Payment.Impl.Credit;
import creational.AbstractFactory.AbstractProduct.Payment.Impl.Debit;
import creational.AbstractFactory.Factory.AbstractFactory;

public class PaymentFactory implements AbstractFactory<Payment>{

    @Override
    public Payment create(String type) {
        if ("CREDIT".equals(type)){
            return new Credit();
        }else if ("DEBIT".equals(type)){
            return new Debit();
        }
        return null;
    }
    
}
