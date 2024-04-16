package ex2.main;

import ex2.clase.Builder;
import ex2.clase.Rezervare;
import ex2.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {

        Rezervare rezervare= new RezervareBuilder()
                .setAsezareLaGeam(false)
                .setDecorMasa(true)
                .setGenMuzica(false)
                .setScauneErgonomice(true)
                .build();

        System.out.println(rezervare.toString());
    }
}
