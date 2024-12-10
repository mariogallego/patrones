package creational.Prototype.Prototype;

public interface PrototypeCard extends Cloneable{
    
    void getCard();

    PrototypeCard clone() throws CloneNotSupportedException;
}
