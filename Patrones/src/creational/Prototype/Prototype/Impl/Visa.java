package creational.Prototype.Prototype.Impl;

import creational.Prototype.Prototype.PrototypeCard;

public class Visa implements PrototypeCard{
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        return (Visa)super.clone();
    }

    @Override
    public void getCard() {
        System.out.println("VISA");
    }

    
}
