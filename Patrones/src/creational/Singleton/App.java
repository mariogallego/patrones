package creational.Singleton;

public class App {
    public static void main(String[] args) { 
        Card.getINSTANCE().setCardNumber("1");
        System.out.println(Card.getINSTANCE().getCardNumber());
       
    }
}
