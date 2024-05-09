package clase;

public class Pacient {
    private String nume;
    private int stareSanatate;


    public Pacient(String nume, int stareSanatate) {
        this.nume = nume;
        this.stareSanatate = stareSanatate;
    }

    public String getNume() {
        return nume;
    }

    public int getStareSanatate() {
        return stareSanatate;
    }

    public void setStareSanatate(int stareSanatate) {
        this.stareSanatate = stareSanatate;
    }
    // dificultatea starii
    //stare sanatate
    //verif dispon in salon
    //se emite fisa
}
