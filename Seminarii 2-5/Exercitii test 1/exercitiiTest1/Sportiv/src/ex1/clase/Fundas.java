package ex1.clase;

public class Fundas extends Jucator {
    public Fundas() {
    }

    public Fundas(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Jucatorul cu numele "+ this.getNume()+ " este fundas");
    }
}
