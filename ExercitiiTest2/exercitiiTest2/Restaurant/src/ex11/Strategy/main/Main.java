package ex11.Strategy.main;

import ex11.Strategy.clase.Cash;
import ex11.Strategy.clase.Client;

public class Main {
    public static void main(String[] args) {
        Client client= new Client("Dan");
        client.PlatesteNota(233);

        Client client1= new Client("Sara");
        client1.setModPlata(new Cash());
        client1.PlatesteNota(100);

    }
}