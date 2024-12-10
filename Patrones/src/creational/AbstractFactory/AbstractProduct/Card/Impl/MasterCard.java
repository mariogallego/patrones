package creational.AbstractFactory.AbstractProduct.Card.Impl;

import creational.AbstractFactory.AbstractProduct.Card.Card;

public class MasterCard implements Card{

    
    @Override
    public String getCardType() {
        return "MASTERCARD";
    }
    
    @Override
    public String getCardNumber() {
        return "0";
    }
}
