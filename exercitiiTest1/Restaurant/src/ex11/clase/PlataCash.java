package ex11.clase;

public class PlataCash extends Plata {

    private boolean includeBacsis;

    public PlataCash(String data, float suma) {
        super(data, suma);
    }

    public PlataCash() {
    }

    public PlataCash(String data, float suma, boolean includeBacsis) {
        super(data, suma);
        this.includeBacsis = includeBacsis;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlataCash{");
        sb.append("includeBacsis=").append(includeBacsis);
        sb.append('}');
        return sb.toString();
    }
}
