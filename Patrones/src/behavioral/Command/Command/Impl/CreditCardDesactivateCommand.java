package behavioral.Command.Command.Impl;

import behavioral.Command.Command.Command;
import behavioral.Command.Receiver.CreditCard;

public class CreditCardDesactivateCommand implements Command{

    private CreditCard creditCard;

    public CreditCardDesactivateCommand(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void execute() {
        creditCard.desactivateCard();
        creditCard.sendSMStoCustomerDesactivate();
    }
    
}
