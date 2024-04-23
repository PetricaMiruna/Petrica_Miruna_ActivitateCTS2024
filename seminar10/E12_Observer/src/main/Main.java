package main;

import observer.Abonat;
import observer.Observer;
import observer.Vecin;
import subject.Sala;
import subject.Stadion;
import subject.Subject;

public class Main {
    public static void main(String[] args) {
        Observer abonat1=new Abonat("Gigel1");
        Observer abonat2= new Abonat("Gigel2");
        Observer abonat3= new Abonat("Gigel3");
        Observer vecin= new Vecin("Gigel vecin", 12);

        Subject sala= new Sala();
        sala.adaugaAbonat(abonat1);
        sala.adaugaAbonat(abonat2);
        sala.adaugaAbonat(abonat3);


        sala.notificaMeciFotbal();
        sala.stergeAbonat(abonat3);
        sala.adaugaAbonat(vecin);
        sala.notificaMeciVolei();

        Subject stadion= new Stadion();
        stadion.adaugaAbonat(abonat1);
        stadion.adaugaAbonat(vecin);

        ((Stadion)stadion).notificaConcert();

    }
}