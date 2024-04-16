package ex10.clase;

public class PlataSMS extends ModPlata {

    Double taxaSMS;

    public PlataSMS(Double taxaSMS) {
        this.taxaSMS = taxaSMS;
    }

    public PlataSMS(String dataPlata, Double sumaPlata, Double taxaSMS) {
        super(dataPlata, sumaPlata);
        this.taxaSMS = taxaSMS;
    }

    public PlataSMS(String dataPlata, Double sumaPlata) {
        super(dataPlata, sumaPlata);
    }

    public Double getTaxaSMS() {
        return taxaSMS;
    }

    public void setTaxaSMS(Double taxaSMS) {
        this.taxaSMS = taxaSMS;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Plata prin sms, cu taxa suplimentara de "+ this.getTaxaSMS());
    }
}
