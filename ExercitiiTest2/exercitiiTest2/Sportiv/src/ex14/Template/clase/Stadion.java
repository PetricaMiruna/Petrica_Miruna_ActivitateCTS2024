package ex14.Template.clase;

public class Stadion {
    private String nume;
    private int varstaMinima;

    public Stadion(String nume, int varstaMinima) {
        this.nume = nume;
        this.varstaMinima = varstaMinima;
    }

    public String getNume() {
        return nume;
    }

    public int getVarstaMinima() {
        return varstaMinima;
    }
}
