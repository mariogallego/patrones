package structural.facade.modules.impl;

import structural.facade.modules.Credit;

public class Silver implements Credit{

    @Override
    public void showCredit() {
      System.out.println("Tarjeta silver");
    }

}
