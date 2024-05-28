package ex12.Observer.clase;

import ex12.Observer.pacient.Observer;

import java.util.ArrayList;
import java.util.List;

public class Spital implements Subject {

    private String numeSpital;
    private List<Observer> observers;

    public Spital(String numeSpital) {
        this.numeSpital = numeSpital;
        observers= new ArrayList<>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notificaObserver(String mesaj) {

        for(Observer observer:observers){
            observer.receptioneazaMesaj(numeSpital + ": "+mesaj);
        }
    }

    @Override
    public void stergeObserver(Observer observer) {

        observers.remove(observer);
    }

    public void notificaVirusNou(){
        notificaObserver(" A aparut un virus nou in oras");

    }

    public void notificareEpidemieNoua(){
        notificaObserver("Atentie! In oras este o noua epidemie");

    }
}
