package main;

import classes.PersonalSpital;
import classes.fabrica.FabricaPersonal;
import classes.fabrica.TipPersonal;

public class Main {
    public static void main(String[] args)  {

        FabricaPersonal fabricaPersonal= new FabricaPersonal();
        try {
            PersonalSpital medic=fabricaPersonal.createPersonalSpital(TipPersonal.MEDIC, "Popescu Maria", 5000);
            PersonalSpital asistent=fabricaPersonal.createPersonalSpital(TipPersonal.ASISTENT, "Ionescu Andreea", 4000);
            PersonalSpital brancardier=fabricaPersonal.createPersonalSpital(TipPersonal.BRANCARDIER, "Popa Laurentiu", 3000);

            medic.afisareDetalii();
            asistent.afisareDetalii();
            brancardier.afisareDetalii();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}