package ex9.Proxy.clase;

public class Persoana {
    private String nume;
    private boolean areAsigurare;

    public Persoana(String nume, boolean areAsigurare) {
        this.nume = nume;
        this.areAsigurare = areAsigurare;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persoana{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", areAsigurare=").append(areAsigurare);
        sb.append('}');
        return sb.toString();
    }
}
