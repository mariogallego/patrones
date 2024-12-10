package behavioral.strategy;

import behavioral.strategy.strategy.context.Context;
import behavioral.strategy.strategy.impl.LowerFormatStrategy;
import behavioral.strategy.strategy.impl.UpperFormatStrategy;

public class App{
    public static void main(String[] args) {
        Context context = new Context(new LowerFormatStrategy());
        context.publishText("HOLA");

        context = new Context(new UpperFormatStrategy());
        context.publishText("hola");
    }
}