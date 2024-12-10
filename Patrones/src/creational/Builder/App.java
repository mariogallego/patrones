package creational.Builder;

public class App {
    public static void main(String[] args) {

        Card card1 = new Card.CardBuiler("VISA", 1).build();
        System.out.println(card1.toString());

        Card card2 = new Card.CardBuiler("VISA", 1)
                .setName("M")
                .setExpires(1)
                .setRequired(true)
                .build();
        System.out.println(card2.toString());
    }
}
