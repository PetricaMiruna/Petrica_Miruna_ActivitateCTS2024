package ex2.clase;

public abstract class Medicament {
    private float pret;
    private String denumire;

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public abstract void afiseazaTipMedicament();
}
