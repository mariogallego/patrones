package behavioral.Observer.Observer.Impl;

import behavioral.Observer.Semaforo;
import behavioral.Observer.Observer.Observer;

public class Peaton implements Observer{

    @Override
    public void update(Semaforo semaforo) {
        if(semaforo.getStatus().equals("ROJO_COCHE")){
            System.out.println("Semaforo verde peaton");
        }else{
            System.out.println("Semaforo rojo peaton");
        }
    }
    
}
