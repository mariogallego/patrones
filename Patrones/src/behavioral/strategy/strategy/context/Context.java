package behavioral.strategy.strategy.context;

import behavioral.strategy.strategy.StrategyTextFormatter;

public class Context {
    
    private StrategyTextFormatter strategy;

    public Context(StrategyTextFormatter strategy) {
        this.strategy = strategy;
    }

    public void publishText(String text){
        strategy.format(text);
    }


}
