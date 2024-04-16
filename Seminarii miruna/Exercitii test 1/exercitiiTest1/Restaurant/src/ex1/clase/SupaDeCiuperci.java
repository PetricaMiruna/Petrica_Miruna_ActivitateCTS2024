package ex1.clase;

public class SupaDeCiuperci extends Supa {
    private int grCiuperci;

    public int getGrCiuperci() {
        return grCiuperci;
    }

    public void setGrCiuperci(int grCiuperci) {
        this.grCiuperci = grCiuperci;
    }

    public SupaDeCiuperci(String nume, float pret, int grCiuperci) {
        super(nume, pret);
        this.grCiuperci = grCiuperci;
    }

    public SupaDeCiuperci() {
    }
}
