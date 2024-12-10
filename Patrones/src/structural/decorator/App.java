package structural.decorator;

import structural.decorator.component.Credit;
import structural.decorator.component.impl.Black;
import structural.decorator.component.impl.Gold;
import structural.decorator.component.impl.decorator.impl.InternationalPaymentDecorator;
import structural.decorator.component.impl.decorator.impl.SecureDecorator;

public class App {
    public static void main(String[] args) {
       /*  Credit gold = new Gold();

        Credit blackInternationalPayment = new Black();
        blackInternationalPayment = new InternationalPaymentDecorator(blackInternationalPayment);

        System.out.println("------");
        gold.showCredit();

        System.out.println("------");
        blackInternationalPayment.showCredit(); */





        Credit goldSecureInternational = new Gold();
        goldSecureInternational = new SecureDecorator(goldSecureInternational);
        goldSecureInternational = new InternationalPaymentDecorator(goldSecureInternational);
             

        System.out.println("------");
        goldSecureInternational.showCredit();

    }
}
