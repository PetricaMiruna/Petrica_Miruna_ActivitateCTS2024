package ex3.main;

import ex3.clase.Rezervare;
import ex3.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare= new RezervareBuilder()
                .setMancareInclusa(true)
                .setScaunErgonomic(false)
                .setBauturaRacoritoareInclusa(true)
                .setMuzicaAmbientalaPersonalizata(false)
                .setGenMuzica(true)
                .build();

        Rezervare rezervare2=new RezervareBuilder()
                .setMancareInclusa(true)
                        .build();

        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());
    }
}
