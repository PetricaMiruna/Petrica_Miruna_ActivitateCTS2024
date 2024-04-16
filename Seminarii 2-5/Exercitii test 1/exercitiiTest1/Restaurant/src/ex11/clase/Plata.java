package ex11.clase;

public abstract class Plata {
    private String data;
    private float suma;

    public Plata() {
    }

    public Plata(String data, float suma) {
        this.data = data;
        this.suma = suma;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }
}
