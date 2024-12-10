package creational.Builder;

public class Card {
    
    private String type;
    private int number;
    private String name;
    private int expires;
    private boolean required;

    private Card (CardBuiler cardbuilder){
        this.type = cardbuilder.type;
        this.number = cardbuilder.number;
        this.name = cardbuilder.name;
        this.expires = cardbuilder.expires;
        this.required = cardbuilder.required;
    }

    public String getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getExpires() {
        return expires;
    }

    public boolean isRequired() {
        return required;
    }

    
    @Override
    public String toString() {
        return "Card [type=" + type + ", number=" + number + ", name=" + name + ", expires=" + expires + ", required="
                + required + "]";
    }

    
    public static class CardBuiler {
        private String type;
        private int number;
        private String name;
        private int expires;
        private boolean required;
        
        public CardBuiler(String type, int number){
            this.type = type;
            this.number = number;
        }

        public CardBuiler setName(String name){
            this.name = name;
            return this;
        }

        public CardBuiler setExpires(int expires){
            this.expires = expires;
            return this;
        }

        public CardBuiler setRequired(boolean required){
            this.required = required;
            return this;
        }

        public Card build(){
            return new Card(this);
        }
    }

}
