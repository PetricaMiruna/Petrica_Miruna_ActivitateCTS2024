package ex2.main;

import ex2.clase.Medicament;
import ex2.clase.MedicamentRaceala;
import ex2.fabrici.FabricaAbstracta;
import ex2.fabrici.FabricaMedicamentBody;
import ex2.fabrici.FabricaMedicamentDurere;
import ex2.fabrici.FabricaMedicamentRaceala;

public class Main {

   public static void adaugareMedicament(FabricaAbstracta fabricaAbstracta, String nume, float pret){
       Medicament medicament=fabricaAbstracta.getMedicament(pret, nume);
       medicament.afiseazaTipMedicament();
   }
    public static void main(String[] args) {

        FabricaAbstracta fabricaAbstracta= new FabricaMedicamentRaceala();
        FabricaAbstracta fabricaAbstracta1= new FabricaMedicamentBody();
        FabricaAbstracta fabricaAbstracta2= new FabricaMedicamentDurere();

        Medicament medicamentRaceala= fabricaAbstracta.getMedicament(25, "Paracetamol");
        Medicament medicamentBody=fabricaAbstracta1.getMedicament(50, "crema de maini");
        Medicament medicamentDurere= fabricaAbstracta2.getMedicament(30, "Nurofen");

        medicamentRaceala.afiseazaTipMedicament();
        medicamentBody.afiseazaTipMedicament();
        medicamentDurere.afiseazaTipMedicament();

        adaugareMedicament(new FabricaMedicamentBody(), "crema de acnee", 45);
        adaugareMedicament(new FabricaMedicamentDurere(), "Ibuprofen", 30);






    }
}
