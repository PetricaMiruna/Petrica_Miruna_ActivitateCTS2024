package ex10.clase;

public abstract class ModPlata {

    String dataPlata;
    Double sumaPlata;

    public ModPlata() {
    }

    public ModPlata(String dataPlata, Double sumaPlata) {
        this.dataPlata = dataPlata;
        this.sumaPlata = sumaPlata;
    }

    public String getDataPlata() {
        return dataPlata;
    }

    public void setDataPlata(String dataPlata) {
        this.dataPlata = dataPlata;
    }

    public Double getSumaPlata() {
        return sumaPlata;
    }

    public void setSumaPlata(Double sumaPlata) {
        this.sumaPlata = sumaPlata;
    }

    public abstract void afisareDetalii();
}
