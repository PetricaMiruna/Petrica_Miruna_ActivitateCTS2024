package ex12.Observer.main;

import ex12.Observer.clase.Farmacie;
import ex12.Observer.client.ClientFidel;

public class Main {
    public static void main(String[] args) {

        Farmacie farmacie= new Farmacie("Farmacia Dona");

        ClientFidel clientFidel1= new ClientFidel("Mara");
        ClientFidel clientFidel2= new ClientFidel("Andreea");
        ClientFidel clientFidel3= new ClientFidel("Denisa");

        farmacie.adaugaObserver(clientFidel1);
        farmacie.adaugaObserver(clientFidel2);
        farmacie.notificaOfertaDePret();
        farmacie.stergeObserver(clientFidel2);
        farmacie.adaugaObserver(clientFidel3);
        farmacie.notificaOfertaDePret();
    }
}
