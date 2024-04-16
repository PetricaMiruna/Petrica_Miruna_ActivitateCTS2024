package ex4.main;

import ex4.clase.Reteta;
import ex4.clase.RetetaNurofen;
import ex4.clase.RetetaParacetamol;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map <String, Float> cantitatiSolutii=new HashMap<>();
        cantitatiSolutii.put("solutie 1", 10.2f);
        cantitatiSolutii.put("solutie 2", 12.5f);

        Reteta reteta= new RetetaParacetamol(cantitatiSolutii, "mod 1");
        Reteta retetaClonata=reteta.clone();
        System.out.println(retetaClonata.toString());

        Map<String, Double> cantitati= new HashMap<>();
        cantitati.put("ibuprofen", 14.3);
        cantitati.put("apa", 4.7);

        Reteta reteta1= new RetetaNurofen(cantitati,4);
        Reteta retetaClonata2= reteta1.clone();
        System.out.println(retetaClonata2.toString());

    }
}
