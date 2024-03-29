package ex1.clase;

public class SupaDeVita extends Supa {

    private int grameVita;

    public SupaDeVita(String nume, float pret, int grameVita) {
        super(nume, pret);
        this.grameVita = grameVita;
    }

    public SupaDeVita() {
    }

    public int getGrameVita() {
        return grameVita;
    }

    public void setGrameVita(int grameVita) {
        this.grameVita = grameVita;
    }
}
