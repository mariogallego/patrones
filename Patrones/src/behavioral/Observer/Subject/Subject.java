package behavioral.Observer.Subject;

import behavioral.Observer.Semaforo;
import behavioral.Observer.Observer.Observer;

public interface Subject {
    void attach(Observer o);
    void dettach(Observer o);
    void notifyUpdate(Semaforo semaforo);
}
