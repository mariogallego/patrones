package structural.decorator.component.impl;

import structural.decorator.component.Credit;

public class Black implements Credit{

    @Override
    public void showCredit() {
       System.out.println("1000");
    }
    
}
