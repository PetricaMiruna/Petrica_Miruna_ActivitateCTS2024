package ex4.main;

import ex4.clase.Cont;
import ex4.clase.ContClient;
import ex4.clase.ContClientPremium;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> procenteReduceriPersonalizate= new HashMap<>();
        procenteReduceriPersonalizate.put("reducere la CCC", 5);
        procenteReduceriPersonalizate.put("reducere la Zara", 10);

        Cont contClientPrototype= new ContClient("Popescu Daniel", "5123456789102");
        Cont contClientClonat= contClientPrototype.clone();
        System.out.println(contClientClonat.toString());

        Cont contClientPremiumPrototype= new ContClientPremium("Minca Andreea", "6987654321098", procenteReduceriPersonalizate);
        Cont contClientPremiumClonat= contClientPremiumPrototype.clone();
        System.out.println(contClientPremiumClonat.toString());
    }
}
