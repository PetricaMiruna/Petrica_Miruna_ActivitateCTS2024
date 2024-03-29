package ex4.main;

import ex4.clase.AbstractClient;
import ex4.clase.ClientPrototip;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> detaliiCont= new HashMap<>();
        detaliiCont.put("Client", "Popescu Ion");
        detaliiCont.put("Email", "ionpopescu@gmail.com");
        detaliiCont.put("Adresa", "Strada Maceselor nr.42");

        AbstractClient client= new ClientPrototip("Popescu Ion", 33, detaliiCont);
        AbstractClient clientClonat=client.clone();
        System.out.println(clientClonat.toString());
    }
}
