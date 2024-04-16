package ex11.clase;

public abstract class Plata {

    private String data;
    private double valoare;

    public Plata(String data, double valoare) {
        this.data = data;
        this.valoare = valoare;
    }

    public Plata() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValoare() {
        return valoare;
    }

    public void setValoare(double valoare) {
        this.valoare = valoare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Plata{");
        sb.append("data='").append(data).append('\'');
        sb.append(", valoare=").append(valoare);
        sb.append('}');
        return sb.toString();
    }

    public abstract void afisareDetalii();
}
