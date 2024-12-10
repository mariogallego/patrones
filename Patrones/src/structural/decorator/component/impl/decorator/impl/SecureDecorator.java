package structural.decorator.component.impl.decorator.impl;

import structural.decorator.component.Credit;
import structural.decorator.component.impl.decorator.CreditDecorator;

public class SecureDecorator extends CreditDecorator{

    public SecureDecorator(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit() {
        decoratedCredit.showCredit();
        configSecure();
    }

    private void configSecure(){
     System.out.println("Tarjeta configurada seguridad");   
    }
    
}
