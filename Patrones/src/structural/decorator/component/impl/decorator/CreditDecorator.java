package structural.decorator.component.impl.decorator;

import structural.decorator.component.Credit;

public abstract class CreditDecorator implements Credit{

    protected Credit decoratedCredit;

    public CreditDecorator(Credit decoratedCredit) {
        this.decoratedCredit = decoratedCredit;
    }

    @Override
    public void showCredit() {
       // decoratedCredit.showCredit();  
    }
    
    
}
