package ex5.Adapter.clase;

import ex5.Adapter.gestionaremedicamente.GestionareMedicament;
import ex5.Adapter.gestionaremedicamente.Medicament;

public class VanzareGestionareMedicament extends GestionareMedicament implements vanzareMedicament {
    public VanzareGestionareMedicament(Medicament medicament) {
        super(medicament);
    }

    @Override
    public void stareMedicament(Medicament medicament) {
        System.out.println(super.toString());

    }

    @Override
    public boolean verificareDisponibilitate(int nr) {
        return false;
    }

}
