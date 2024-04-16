package ex1.clase;

public class Portar extends Jucator {

    private int nrGoluriAparate;
    public Portar() {
        this.nrGoluriAparate=2;
    }

    public Portar(String nume, int varsta) {
        super(nume, varsta);
    }

    public Portar(String nume, int varsta, int nrGoluriAparate) {
        super(nume, varsta);
        this.nrGoluriAparate = nrGoluriAparate;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Jucatorul cu numele "+ this.getNume()+ " este portar");
    }
}
