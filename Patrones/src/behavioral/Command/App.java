package behavioral.Command;

import behavioral.Command.Command.Impl.CreditCardActivateCommand;
import behavioral.Command.Command.Impl.CreditCardDesactivateCommand;
import behavioral.Command.Invoker.CreditCarInvoker;
import behavioral.Command.Receiver.CreditCard;

public class App {
    public static void main(String[] args) {
        CreditCarInvoker invoker = new CreditCarInvoker();

        CreditCard crediCardActivate = new CreditCard();
        CreditCard crediCardDesactivate = new CreditCard();

        invoker.setCommand(new CreditCardActivateCommand(crediCardActivate));
        invoker.run();
        System.out.println("***********************");
        invoker.setCommand(new CreditCardDesactivateCommand(crediCardDesactivate));
        invoker.run();
    }
}
