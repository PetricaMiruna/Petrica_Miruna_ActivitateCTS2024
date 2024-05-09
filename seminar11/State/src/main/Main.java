package main;

import clase.Pacient;
import clase.Stare;
import clase.SubObservatie;

public class Main {
    public static void main(String[] args) {
        Pacient pacient= new Pacient(" Gheorghita");
        pacient.seAgraveazaStarea();
        pacient.vindecare();
        pacient.seImbunatatesteStarea();
        pacient.vindecare();


        Pacient pacient1= new Pacient("Ghita");
        pacient1.seAgraveazaStarea();
        pacient1.seImbunatatesteStarea();
        pacient1.vindecare();


    }
}