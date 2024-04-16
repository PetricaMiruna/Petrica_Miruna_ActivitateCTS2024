package ex1.clase;

public class Autobuz extends MijlocTransport {
    public Autobuz() {
    }

    public Autobuz(int nrLocuri, String culoare) {
        super(nrLocuri, culoare);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Autobuz");
    }
}
