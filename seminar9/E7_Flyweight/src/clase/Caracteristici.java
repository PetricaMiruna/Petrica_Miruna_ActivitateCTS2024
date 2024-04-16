package clase;

public class Caracteristici {
    private int pozitieX;
    private int pozitieY;
    private String culoare;

    public Caracteristici(int pozitieX, int pozitieY, String culoare) {
        this.pozitieX = pozitieX;
        this.pozitieY = pozitieY;
        this.culoare = culoare;
    }

    public int getPozitieX() {
        return pozitieX;
    }

    public int getPozitieY() {
        return pozitieY;
    }

    public String getCuloare() {
        return culoare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Caracteristici{");
        sb.append("pozitieX=").append(pozitieX);
        sb.append(", pozitieY=").append(pozitieY);
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
