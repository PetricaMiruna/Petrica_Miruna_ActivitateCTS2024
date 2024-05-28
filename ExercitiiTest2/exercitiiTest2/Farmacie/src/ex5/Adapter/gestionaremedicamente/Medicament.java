package ex5.Adapter.gestionaremedicamente;

public class Medicament {
    private String denumire;
    private int IDMedicament;

    public Medicament(String denumire, int IDMedicament) {
        this.denumire = denumire;
        this.IDMedicament = IDMedicament;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getIDMedicament() {
        return IDMedicament;
    }

    public void setIDMedicament(int IDMedicament) {
        this.IDMedicament = IDMedicament;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicament{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", IDMedicament=").append(IDMedicament);
        sb.append('}');
        return sb.toString();
    }
}
