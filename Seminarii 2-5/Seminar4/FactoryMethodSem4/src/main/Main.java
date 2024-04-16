package main;

import classes.Asistent;
import classes.Medic;
import classes.PersonalSpital;
import classes.factory.*;

public class Main {

    public static void  prelucrarePersonal(FabricaPersonal fabricaPersonal, String nume, int salariu){
        PersonalSpital personalSpital= fabricaPersonal.createPersonal(nume, salariu);
        personalSpital.afisareDetalii();
    }
    public static void main(String[] args) {
        FabricaPersonal fabricaMedic=new FabricaMedic();
        FabricaPersonal fabricaAsistent=new FabricaAsistent();
        FabricaPersonal fabricaBrancardier=new FabricaBrancardier();

        PersonalSpital medic= fabricaMedic.createPersonal("Popescu Ion", 10000);
        PersonalSpital asistent= fabricaAsistent.createPersonal("Ionescu Andrei", 7000);
        PersonalSpital brancardier= fabricaBrancardier.createPersonal("Popa Diana", 6500);

        medic.afisareDetalii();
        asistent.afisareDetalii();
        brancardier.afisareDetalii();

        prelucrarePersonal(new FabricaMedic(), "Butacu Marin", 10000);
        prelucrarePersonal(new FabricaInfirmier(), "Ionescu Grigore", 5600);
    }
}