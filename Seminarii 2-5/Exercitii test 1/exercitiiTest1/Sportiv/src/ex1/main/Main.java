package ex1.main;

import ex1.clase.CategorieJucator;
import ex1.clase.FabricaJucator;
import ex1.clase.Jucator;

public class Main {
    public static void main(String[] args) {

        FabricaJucator fabricaJucator= new FabricaJucator();
        try {
            Jucator atacant=fabricaJucator.getJucator(CategorieJucator.ATACANT, "Denis", 21);
            Jucator fundas= fabricaJucator.getJucator(CategorieJucator.FUNDAS, "Cosmin", 22);
            Jucator portar=fabricaJucator.getJucator(CategorieJucator.PORTAR, "Adrian", 24);

            atacant.afisareDetalii();
            fundas.afisareDetalii();
            portar.afisareDetalii();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}