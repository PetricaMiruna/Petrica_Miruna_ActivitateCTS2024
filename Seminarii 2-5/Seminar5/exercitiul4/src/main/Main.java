package main;

import clase.Reteta;
import clase.RetetaAbstracta;
import clase.RetetaCrema;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> solutii1=new HashMap<>();
        solutii1.put("solutie1", 21.0);
        solutii1.put("solutie2", 34.44);
        Reteta reteta=new Reteta(solutii1, "Medicament1");
        RetetaAbstracta reteta2=reteta.clone();
        System.out.println(reteta2);

        RetetaAbstracta retetaCremaPrototip= new RetetaCrema(45, "Galbenele");
        RetetaAbstracta retetaCrema=retetaCremaPrototip.clone();
        System.out.println(retetaCrema);
    }
}