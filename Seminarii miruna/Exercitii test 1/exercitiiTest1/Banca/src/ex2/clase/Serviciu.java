package ex2.clase;

public abstract class Serviciu {

    String data;
    String denumire;

    public Serviciu() {
    }

    public Serviciu(String data, String denumire) {
        this.data = data;
        this.denumire = denumire;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Serviciu{");
        sb.append("data='").append(data).append('\'');
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public abstract void afisareDetalii();
}
