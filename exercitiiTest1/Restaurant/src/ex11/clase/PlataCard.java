package ex11.clase;

public class PlataCard extends Plata {

    private int comision;

    public PlataCard(String data, float suma) {
        super(data, suma);
    }

    public PlataCard() {
    }

    public PlataCard(String data, float suma, int comision) {
        super(data, suma);
        this.comision = comision;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlataCard{");
        sb.append("comision=").append(comision);
        sb.append('}');
        return sb.toString();
    }
}
