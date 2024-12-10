package creational.Prototype;

import java.util.HashMap;
import java.util.Map;

import creational.Prototype.Prototype.PrototypeCard;
import creational.Prototype.Prototype.Impl.Amex;
import creational.Prototype.Prototype.Impl.Visa;

public class PrototypeFactory {
    
    public static class CardType{
        public static final String VISA = "visa";
        public static final String AMEX = "amex";
    }

    private static Map<String, PrototypeCard> prototypes = new HashMap<>();

    public static PrototypeCard getInstance (final String tipo) throws CloneNotSupportedException{
        return prototypes.get(tipo).clone();
    }

    public static void loadCard(){
        Visa visa = new Visa();
        visa.setName("visa");
        prototypes.put(CardType.VISA, visa);

        Amex amex = new Amex();
        amex.setName("amex");
        prototypes.put(CardType.AMEX, amex);
    }
}
