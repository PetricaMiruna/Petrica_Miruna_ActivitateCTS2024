package ex3.clase;

public abstract class Supa {
    private String nume;
    private float pret;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public Supa(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public Supa() {
    }
}
