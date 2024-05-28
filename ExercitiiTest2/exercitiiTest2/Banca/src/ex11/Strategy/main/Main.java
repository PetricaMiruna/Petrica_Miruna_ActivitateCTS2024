package ex11.Strategy.main;

import ex11.Strategy.clase.Client;
import ex11.Strategy.clase.VerificarePersoanaFizica;
import ex11.Strategy.clase.VerificarePersoanaJuridica;

public class Main {
    public static void main(String[] args) {

        Client client1= new Client("Laurentiu");
        Client client2= new Client("Ioana");
        Client client3= new Client("Catalina");

        client1.verificare();

        client2.setModVerificare(new VerificarePersoanaFizica());
        client2.verificare();

        client3.setModVerificare(new VerificarePersoanaJuridica());
        client3.verificare();
    }
}