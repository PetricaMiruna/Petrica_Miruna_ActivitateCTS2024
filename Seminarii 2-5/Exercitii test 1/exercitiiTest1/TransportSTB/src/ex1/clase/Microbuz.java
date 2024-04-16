package ex1.clase;

public class Microbuz extends MijlocTransport {
    public Microbuz() {
    }

    public Microbuz(int nrLocuri, String culoare) {
        super(nrLocuri, culoare);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Microbuz");
    }
}
