package creational.FactoryMethod;
import creational.FactoryMethod.Product.Payment;
import creational.FactoryMethod.Product.TypePayment;
import creational.FactoryMethod.creator.PaymentFactory;


public class App {
    public static void main(String[] args) throws Exception {
        factoryMethod();
    }

    private static void factoryMethod(){
        Payment payment = PaymentFactory.buildPayment(TypePayment.GOOGLEPAY);
        payment.doPayment();
    }
}
