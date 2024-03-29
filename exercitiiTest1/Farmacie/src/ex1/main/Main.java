package ex1.main;

import ex1.clase.Categorie;
import ex1.clase.FabricaMedicamente;
import ex1.clase.Medicament;

public class Main {
    public static void main(String[] args) {
        FabricaMedicamente fabricaMedicamente=new FabricaMedicamente();
        try {
            Medicament medicament= fabricaMedicamente.getMedicament(Categorie.RACEALA);
            medicament.afiseazaTipMedicament();
            Medicament medicament1=fabricaMedicamente.getMedicament(Categorie.BODY);
            medicament1.afiseazaTipMedicament();
            Medicament medicament2=fabricaMedicamente.getMedicament(Categorie.DURERE);
            medicament2.afiseazaTipMedicament();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}