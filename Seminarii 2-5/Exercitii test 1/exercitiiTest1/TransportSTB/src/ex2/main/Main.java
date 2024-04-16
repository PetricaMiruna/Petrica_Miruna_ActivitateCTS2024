package ex2.main;

import ex2.clase.Autobuz;
import ex2.clase.Microbuz;
import ex2.clase.MijlocDeTransport;
import ex2.clase.Troleibuz;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> listaSoferi = new HashMap<>();
        listaSoferi.put(101,"Gabriel");
        listaSoferi.put(102,"Ionut");
        listaSoferi.put(103, "Codrin");

        MijlocDeTransport autobuz= new Autobuz(listaSoferi, 105);
        System.out.println(autobuz.toString());
        MijlocDeTransport microbuz= new Microbuz(18, 27);
        System.out.println(microbuz.toString());
        MijlocDeTransport troleibuz= new Troleibuz(24, 68);
        System.out.println(troleibuz.toString());

        MijlocDeTransport clonaAutobuz= autobuz.clone();
        System.out.println(clonaAutobuz.toString());
        MijlocDeTransport clonaMicrobuz= microbuz.clone();
        System.out.println(clonaMicrobuz.toString());
        MijlocDeTransport clonaTroleibuz= troleibuz.clone();
        System.out.println(clonaTroleibuz.toString());
    }
}
