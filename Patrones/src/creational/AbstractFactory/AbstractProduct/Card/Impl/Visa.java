package creational.AbstractFactory.AbstractProduct.Card.Impl;

import creational.AbstractFactory.AbstractProduct.Card.Card;

public class Visa implements Card{

    
    @Override
    public String getCardType() {
        return "VISA";
    }
    
    @Override
    public String getCardNumber() {
        return "1";
    }
}
