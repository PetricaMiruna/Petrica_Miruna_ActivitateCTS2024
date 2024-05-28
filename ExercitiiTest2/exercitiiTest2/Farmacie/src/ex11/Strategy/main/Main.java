package ex11.Strategy.main;

import ex11.Strategy.clase.Card;
import ex11.Strategy.clase.Cash;
import ex11.Strategy.clase.Client;
import ex11.Strategy.clase.ModPlata;

public class Main {
    public static void main(String[] args) {

        Client client= new Client("Anemona");
        Client client1= new Client("Larisa");
        Client client2= new Client("Valentin");

        client.setModPlata(new Card());
        client.plateste(200);

        client1.setModPlata(new Cash());
        client1.plateste(150);

        client2.setModPlata(new Card());
        client2.plateste(133.5);


    }
}
