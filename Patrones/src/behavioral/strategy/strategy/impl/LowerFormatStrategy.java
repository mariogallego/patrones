package behavioral.strategy.strategy.impl;

import behavioral.strategy.strategy.StrategyTextFormatter;

public class LowerFormatStrategy implements StrategyTextFormatter{

    @Override
    public void format(String text) {
        System.out.println(text.toLowerCase());  
    }
    
}
