package ex5.Adapter.gestionaremedicamente;

public class GestionareMedicament {
    Medicament medicament;

    public GestionareMedicament(Medicament medicament) {
        this.medicament = medicament;
    }


    public boolean verificaStocPentruMedicament(Medicament medicament, int nr){
        if(nr>10) {
            System.out.println("Nu exista stoc pentru medicamentul " + medicament.toString());
            return false;
        }
        else {
            System.out.println("Exista stoc pt medicamentul "+medicament.toString());

            return true;
        }
    }
}
