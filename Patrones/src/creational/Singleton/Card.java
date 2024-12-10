package creational.Singleton;

public class Card {

    private static Card INSTANCE;

    private String cardNumber;

    private Card(){}
    
    //synchronized --> evita que si hay dos hilos entre dos veces para que no se cree la instancia dos veces si no una
    public synchronized static Card getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE = new Card();
        }
        return INSTANCE;
    }


    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    
}
