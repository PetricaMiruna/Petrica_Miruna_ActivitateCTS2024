package ex12.Observer.clase;

import ex12.Observer.client.Observer;

public interface Subject {
    public void adaugaObserver(Observer observer);
    public void notificaObserver(String mesaj);
    public void stergeObserver(Observer observer);

}
