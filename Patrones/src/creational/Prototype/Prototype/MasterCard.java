package creational.Prototype.Prototype;

//ejemplo individual de como se usa la interfaz clonable, NO forma parte del patron.
public class MasterCard implements Cloneable{
    private String name;

    public MasterCard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    
}
