package creational.AbstractFactory.Factory;

import creational.AbstractFactory.Factory.Impl.CardFactory;
import creational.AbstractFactory.Factory.Impl.PaymentFactory;

public class FactoryProvider {
    
    public static AbstractFactory createFactoryProvider(String typeFactory){
        if("CARD".equals(typeFactory)){
            return new CardFactory();
        } else if ("PAYMENT".equals(typeFactory)){
            return new PaymentFactory();
        }
        return null;
    }
}
