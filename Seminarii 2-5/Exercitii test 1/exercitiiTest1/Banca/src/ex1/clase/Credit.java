package ex1.clase;

public abstract class Credit {
    private int perioadaCredit;
    private double valoareCredit;

    public Credit() {
    }

    public Credit(int perioadaCredit, double valoareCredit) {
        this.perioadaCredit = perioadaCredit;
        this.valoareCredit = valoareCredit;
    }

    public int getPerioadaCredit() {
        return perioadaCredit;
    }

    public void setPerioadaCredit(int perioadaCredit) {
        this.perioadaCredit = perioadaCredit;
    }

    public double getValoareCredit() {
        return valoareCredit;
    }

    public void setValoareCredit(double valoareCredit) {
        this.valoareCredit = valoareCredit;
    }

    public abstract void afisareDetalii();
}
