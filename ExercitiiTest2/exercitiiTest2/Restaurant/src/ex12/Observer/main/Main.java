package ex12.Observer.main;

import ex12.Observer.clase.Restaurant;
import ex12.Observer.clase.Subject;
import ex12.Observer.client.ClientFidel;
import ex12.Observer.client.Observer;

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant= new Restaurant("Nuba");

        ClientFidel clientFidel= new ClientFidel("Denisa");
        ClientFidel clientFidel1= new ClientFidel("Dariana");
        ClientFidel clientFidel2= new ClientFidel("Dorian");

        restaurant.adaugaObserver(clientFidel);
        restaurant.adaugaObserver(clientFidel2);
        restaurant.trimiteOfertaPret();
        restaurant.stergeObserver(clientFidel);
        restaurant.adaugaObserver(clientFidel2);
        restaurant.trimiteMeniuNou();

    }
}
