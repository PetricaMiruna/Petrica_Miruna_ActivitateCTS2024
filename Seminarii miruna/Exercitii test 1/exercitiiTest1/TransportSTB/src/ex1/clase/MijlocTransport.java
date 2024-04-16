package ex1.clase;

public abstract class MijlocTransport {

    private int nrLocuri;
    private String culoare;

    public MijlocTransport() {
    }

    public MijlocTransport(int nrLocuri, String culoare) {
        this.nrLocuri = nrLocuri;
        this.culoare = culoare;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public abstract void afisareDetalii();
}
