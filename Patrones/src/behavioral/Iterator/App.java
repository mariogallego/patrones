package behavioral.Iterator;


import behavioral.Iterator.Aggregate.List;
import behavioral.Iterator.Aggregate.Impl.CardList;
import behavioral.Iterator.Iterator.Iterator;

public class App {
    public static void main(String[] args) {

        Card[] cards = new Card[3];
        cards[0]=new Card("1");
        cards[1]=new Card("1");
        cards[2]=new Card("2");

        List list = new CardList(cards);
        Iterator iterator = list.iterator();

        while(iterator.hasNext()){
            Card tarjeta = (Card)iterator.next();
            System.out.println(tarjeta.getType());
        }
    }
}
