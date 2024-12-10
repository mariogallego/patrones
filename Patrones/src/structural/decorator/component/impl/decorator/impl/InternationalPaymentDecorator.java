package structural.decorator.component.impl.decorator.impl;

import structural.decorator.component.Credit;
import structural.decorator.component.impl.decorator.CreditDecorator;

public class InternationalPaymentDecorator extends CreditDecorator{

    public InternationalPaymentDecorator(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit() {
        decoratedCredit.showCredit();
        configInternationalPayment();
    }

    private void configInternationalPayment(){
        System.out.println("tarjeta configurada pagos internacionales");
    }
    
}
