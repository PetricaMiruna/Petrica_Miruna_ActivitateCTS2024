package ex10.Flyweight.clase;

public class Reteta {
    private int nrReteta;
    private double sumaDePlata;
    private int numarMedicamente;

    public Reteta(int nrReteta, double sumaDePlata, int numarMedicamente) {
        this.nrReteta = nrReteta;
        this.sumaDePlata = sumaDePlata;
        this.numarMedicamente = numarMedicamente;
    }

    public int getNrReteta() {
        return nrReteta;
    }

    public void setNrReteta(int nrReteta) {
        this.nrReteta = nrReteta;
    }

    public double getSumaDePlata() {
        return sumaDePlata;
    }

    public void setSumaDePlata(double sumaDePlata) {
        this.sumaDePlata = sumaDePlata;
    }

    public int getNumarMedicamente() {
        return numarMedicamente;
    }

    public void setNumarMedicamente(int numarMedicamente) {
        this.numarMedicamente = numarMedicamente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("nrReteta=").append(nrReteta);
        sb.append(", sumaDePlata=").append(sumaDePlata);
        sb.append(", numarMedicamente=").append(numarMedicamente);
        sb.append('}');
        return sb.toString();
    }
}
