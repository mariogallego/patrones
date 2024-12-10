package structural.facade.modules.impl;

import structural.facade.modules.Credit;

public class Black implements Credit{

    @Override
    public void showCredit() {
        System.out.println("Trajeta black"); 
    }
    
}
