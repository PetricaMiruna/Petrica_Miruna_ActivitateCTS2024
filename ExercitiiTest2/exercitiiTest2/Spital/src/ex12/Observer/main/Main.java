package ex12.Observer.main;

import ex12.Observer.clase.Spital;
import ex12.Observer.pacient.Pacient;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Spital spital= new Spital("Spital Universitar");

        Pacient pacient1= new Pacient("Ramona");
        Pacient pacient2= new Pacient("Florica");
        Pacient pacient3= new Pacient("Daniel");
        Pacient pacient4= new Pacient("Ion");

        spital.adaugaObserver(pacient1);
        spital.adaugaObserver(pacient3);
        spital.notificaVirusNou();
        spital.stergeObserver(pacient1);
        spital.adaugaObserver(pacient2);
        spital.adaugaObserver(pacient4);
        spital.notificareEpidemieNoua();
    }
}