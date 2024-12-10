package behavioral.Iterator.Aggregate.Impl;

import behavioral.Iterator.Card;
import behavioral.Iterator.Aggregate.List;
import behavioral.Iterator.Iterator.Iterator;
import behavioral.Iterator.Iterator.Impl.CardIterator;

public class CardList implements List{

    private Card[] cards;

    public CardList(Card[] cards) {
        this.cards = cards;
    }

    @Override
    public Iterator iterator() {
        return new CardIterator(cards);
    }
    
}
