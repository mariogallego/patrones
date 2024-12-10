package creational.AbstractFactory.Factory.Impl;

import creational.AbstractFactory.AbstractProduct.Card.Card;
import creational.AbstractFactory.AbstractProduct.Card.Impl.MasterCard;
import creational.AbstractFactory.AbstractProduct.Card.Impl.Visa;
import creational.AbstractFactory.Factory.AbstractFactory;

public class CardFactory implements AbstractFactory<Card>{

    @Override
    public Card create(String type) {
        if("VISA".equals(type)){
            return new Visa();
        }
        return new MasterCard();
    }
  
}
