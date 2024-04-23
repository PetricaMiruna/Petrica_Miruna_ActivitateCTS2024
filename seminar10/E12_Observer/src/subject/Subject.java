package subject;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void adaugaAbonat(Observer abonat) {
        observers.add(abonat);

    }

    public void stergeAbonat(Observer abonat) {
        observers.remove(abonat);
    }

    public void notificaAbonati(String mesaj) {

        for (Observer abonat:observers) {
            abonat.primesteNotificare(mesaj);
        }
    }

    public abstract void notificaMeciFotbal();
    public abstract void notificaMeciVolei();
    public abstract void notificaMeciHandbal();
}
