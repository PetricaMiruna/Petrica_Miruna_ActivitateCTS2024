package ex2.clase;

public abstract class Jucator {
    String nume;
    int varsta;
    int aniVechime;

    public Jucator() {
    }

    public Jucator(String nume, int varsta, int aniVechime) {
        this.nume = nume;
        this.varsta = varsta;
        this.aniVechime = aniVechime;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getAniVechime() {
        return aniVechime;
    }

    public void setAniVechime(int aniVechime) {
        this.aniVechime = aniVechime;
    }

    public abstract void afisareDetalii();
}
