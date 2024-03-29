package ex1.clase;

public class Atacant extends Jucator {
    public Atacant() {
    }

    public Atacant(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Jucatorul cu numele "+ this.getNume()+ " este atacant");
    }
}
