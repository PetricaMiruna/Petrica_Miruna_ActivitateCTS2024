package main;

import clase.Pacient;
import clase.SpitalPublic;

public class Main {
    public static void main(String[] args) {
        SpitalPublic spitalPublic= new SpitalPublic(" Coltea", 2);
        Pacient pacient= new Pacient("Andrei", 5);
        Pacient pacient1= new Pacient("David", 3);
        Pacient pacient2= new Pacient("Rares",1);

        spitalPublic.internare(pacient);
        spitalPublic.internare(pacient1);
        spitalPublic.internare(pacient2);


    }
}