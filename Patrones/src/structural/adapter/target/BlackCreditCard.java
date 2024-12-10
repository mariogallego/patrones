package structural.adapter.target;

public class BlackCreditCard implements Secure{

    @Override
    public void payWithSecureLevelA() {
        System.out.println("BLACK SECURE A");
    }

    @Override
    public void payWithSecureLevelZ() {
        //not implement
    }
    
}
