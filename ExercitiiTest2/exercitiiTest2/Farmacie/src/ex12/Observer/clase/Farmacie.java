package ex12.Observer.clase;

import ex12.Observer.client.Observer;

import java.util.ArrayList;
import java.util.List;

public class Farmacie implements Subject {
    private String numeFarmacie;
    private List<Observer> observers;

    public Farmacie(String numeFarmacie) {
        this.numeFarmacie = numeFarmacie;
        this.observers= new ArrayList<>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notificaObserver(String mesaj) {

        for(Observer observer:observers){
            observer.receptioneazaMesaj(numeFarmacie+ ":" +mesaj);
        }
    }

    @Override
    public void stergeObserver(Observer observer) {

        observers.remove(observer);
    }

    public void notificaOfertaDePret(){
        notificaObserver("In farmacie s-au introds noi oferte de pret! Va asteptam!");

    }
}
