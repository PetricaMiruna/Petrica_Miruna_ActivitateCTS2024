package ex5.Adapter.clase;

import ex5.Adapter.gestionaremedicamente.Medicament;

public interface vanzareMedicament {
    public void stareMedicament(Medicament medicament);
    public boolean verificareDisponibilitate(int nr);

}
