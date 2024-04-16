package ex3.clase;

import ex3.clase.Supa;

public class SupaDeLegume extends Supa {
    private int nrLegume;

    public SupaDeLegume(String nume, float pret, int nrLegume) {
        super(nume, pret);
        this.nrLegume = nrLegume;
    }

    public SupaDeLegume() {
    }

    public int getNrLegume() {
        return nrLegume;
    }

    public void setNrLegume(int nrLegume) {
        this.nrLegume = nrLegume;
    }
}
