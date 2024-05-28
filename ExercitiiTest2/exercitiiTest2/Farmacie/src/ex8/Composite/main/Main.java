package ex8.Composite.main;

import ex8.Composite.clase.Item;
import ex8.Composite.clase.Sectiune;
import ex8.Composite.clase.Subsectiune;

public class Main {
    public static void main(String[] args) {

        Item sectiune= new Sectiune("Raceala");
        Item sectiune1= new Sectiune("Durere");
        Item sectiune2= new Sectiune("Antibiotice");

        Item subsectiune= new Subsectiune("Fervex");
        Item subsectiune1= new Subsectiune("Coldrex");
        Item subsectiune2= new Subsectiune("Meltus");

        Item subsectiune3= new Subsectiune("Nurofen");
        Item subsectiune4= new Subsectiune("Paracetamol");

        Item subsectiune5= new Subsectiune("Augmentin");

        try {
            sectiune.adaugaItem(subsectiune);
            sectiune.adaugaItem(subsectiune1);
            sectiune.adaugaItem(subsectiune2);

            sectiune1.adaugaItem(subsectiune3);
            sectiune1.adaugaItem(subsectiune4);

            sectiune2.adaugaItem(subsectiune5);

            sectiune.afiseazaItem();
            sectiune1.afiseazaItem();
            sectiune2.afiseazaItem();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
