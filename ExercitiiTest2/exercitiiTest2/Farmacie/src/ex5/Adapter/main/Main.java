package ex5.Adapter.main;

import ex5.Adapter.clase.VanzareGestionareMedicament;
import ex5.Adapter.gestionaremedicamente.GestionareMedicament;
import ex5.Adapter.gestionaremedicamente.Medicament;

public class Main {
    public static void main(String[] args) {

        Medicament medicament= new Medicament("Paracetamol", 433);

        GestionareMedicament gestionareMedicament= new GestionareMedicament(medicament);
        gestionareMedicament.verificaStocPentruMedicament(medicament,2);

        VanzareGestionareMedicament vanzareGestionareMedicament= new VanzareGestionareMedicament(medicament);
        vanzareGestionareMedicament.stareMedicament(medicament);
        vanzareGestionareMedicament.verificareDisponibilitate(3);

    }
}