package behavioral.Command.Command.Impl;

import behavioral.Command.Command.Command;
import behavioral.Command.Receiver.CreditCard;

public class CreditCardActivateCommand implements Command{
    
    private CreditCard creditCard;

    public CreditCardActivateCommand(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void execute() {
        creditCard.sendPinNumberToCustomer();
        creditCard.activateCard();
        creditCard.sendSMStoCustomerActivate();
    }
}
