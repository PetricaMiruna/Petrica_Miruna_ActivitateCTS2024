package ex10.Flyweight.clase;

public class Client implements IClient{
    private String nume;
    private int nrAsigurare;

    public Client(String nume, int nrAsigurare) {
        this.nume = nume;
        this.nrAsigurare = nrAsigurare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrAsigurare() {
        return nrAsigurare;
    }

    public void setNrAsigurare(int nrAsigurare) {
        this.nrAsigurare = nrAsigurare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrAsigurare=").append(nrAsigurare);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void creeazaReteta(Reteta reteta) {

        System.out.println(this.toString() + reteta.toString());
    }
}
