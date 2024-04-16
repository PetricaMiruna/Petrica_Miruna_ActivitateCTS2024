package ex10.clase;

public class PlataCardBancar extends ModPlata {

    private int comision;

    public PlataCardBancar(int comision) {
        this.comision = comision;
    }

    public PlataCardBancar(String dataPlata, Double sumaPlata, int comision) {
        super(dataPlata, sumaPlata);
        this.comision = comision;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public PlataCardBancar(String dataPlata, Double sumaPlata) {
        super(dataPlata, sumaPlata);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Plata card bancar, comision "+ this.getComision());
    }
}
