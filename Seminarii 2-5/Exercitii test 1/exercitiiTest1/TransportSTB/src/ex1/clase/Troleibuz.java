package ex1.clase;

import ex1.main.Main;

public class Troleibuz extends MijlocTransport {
    public Troleibuz() {
    }

    public Troleibuz(int nrLocuri, String culoare) {
        super(nrLocuri, culoare);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Troleibuz");
    }
}
