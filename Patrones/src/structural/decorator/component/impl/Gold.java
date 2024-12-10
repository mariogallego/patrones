package structural.decorator.component.impl;

import structural.decorator.component.Credit;

public class Gold implements Credit{

    @Override
    public void showCredit() {
       System.out.println("50000");
    }
    
}
