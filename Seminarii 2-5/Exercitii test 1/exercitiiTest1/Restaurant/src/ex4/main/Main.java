package ex4.main;

import ex4.clase.ClientAbstract;
import ex4.clase.ClientExistent;
import ex4.clase.ClientNou;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> comenzi= new HashMap<>();
        comenzi.put(12, "12.03.2024");
        comenzi.put(23, "15.03.2024");

        ClientAbstract clientAbstract= new ClientNou();
        ClientAbstract clientNouClonat=clientAbstract.clone();
        System.out.println(clientNouClonat.toString());

        ClientAbstract clientAbstract1= new ClientExistent(comenzi, "Gigel");
        ClientAbstract clientExistentClonat= clientAbstract1.clone();
        System.out.println(clientExistentClonat);

    }
}
