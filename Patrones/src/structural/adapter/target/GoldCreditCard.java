package structural.adapter.target;

public class GoldCreditCard implements Secure{

    @Override
    public void payWithSecureLevelA() {
        //not implement
    }

    @Override
    public void payWithSecureLevelZ() {
        System.out.println("GOLD SEGURIDAD Z");
    }
    
}
