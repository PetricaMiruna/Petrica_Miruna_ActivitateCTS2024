package ex12.Observer.clase;

import ex12.Observer.client.Observer;

public interface Subject {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void notificaObservers(String mesaj);

}
