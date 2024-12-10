package behavioral.Command.Invoker;

import behavioral.Command.Command.Command;

public class CreditCarInvoker{

    private Command command;

    public CreditCarInvoker(){}

    public void setCommand(Command command){
        this.command = command;
    }

    public void run(){
        command.execute();
    }

}