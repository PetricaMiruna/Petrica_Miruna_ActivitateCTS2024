package ex10.clase;

public class PlataCardCalatorii extends ModPlata {
    public PlataCardCalatorii() {
    }

    public PlataCardCalatorii(String dataPlata, Double sumaPlata) {
        super(dataPlata, sumaPlata);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Plata card calatorii");
    }
}
