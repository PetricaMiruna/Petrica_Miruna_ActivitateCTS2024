package ex12.Observer.clase;

import ex12.Observer.client.Observer;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subject {
    private List<Observer> observers;
    private String numeRestaurant;

    public Restaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
        this.observers= new ArrayList<>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {

        observers.remove(observer);
    }

    @Override
    public void notificaObservers(String mesaj) {

        for (Observer observer:observers){
            observer.receptionareMesaj(mesaj);
        }

    }
    public void trimiteOfertaPret(){
        notificaObservers("Restaurantul "+ numeRestaurant+ " are noi oferte de pret!");
    }
    public void trimiteMeniuNou(){
        notificaObservers("Restaurantul "+numeRestaurant +" si-a actualizat meniul!");

    }
}
