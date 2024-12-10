package structural.adapter.adapter;

public class CreditCard implements Payment{

    Adapter adapter;

    @Override
    public void pay(String type) {
        if(type.equals("gold")){
            adapter = new Adapter("gold");
            adapter.pay("gold");
        }else if (type.equals("black")){
            adapter = new Adapter("black");
            adapter.pay("black");
        }else{
            System.out.println("no se hace el pago");
        }
        
    }
    
}
