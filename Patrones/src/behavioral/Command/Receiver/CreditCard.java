package behavioral.Command.Receiver;

public class CreditCard {

    public void sendPinNumberToCustomer(){
        System.out.println("pin number enviado al cliente");
    }
    public void sendSMStoCustomerActivate(){
        System.out.println("sms enviado al cliente tarjeta activada");
    }
    public void activateCard(){
        System.out.println("tarjeta activada");
    }
    public void desactivateCard(){
        System.out.println("tarjeta desactivada");
    }
    public void sendSMStoCustomerDesactivate(){
        System.out.println("sms cliente tarjeta desactivada");
    }
}