package behavioral.Observer;

import behavioral.Observer.Observer.Observer;
import behavioral.Observer.Observer.Impl.Coche;
import behavioral.Observer.Observer.Impl.Peaton;
import behavioral.Observer.Subject.Subject;
import behavioral.Observer.Subject.Impl.MessagePublisher;

public class App {
    public static void main(String[] args) {
        Observer peaton = new Peaton();
        Observer coche = new Coche();

        Subject messagePublisher = new MessagePublisher();
        messagePublisher.attach(peaton);
        messagePublisher.attach(coche);

        messagePublisher.notifyUpdate(new Semaforo("ROJO_COCHE"));

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            
        }
        messagePublisher.notifyUpdate(new Semaforo("VERDE_COCHE"));
    }
}
