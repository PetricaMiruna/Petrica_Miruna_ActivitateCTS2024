package ex9.Proxy.clase;

public class Internare implements IInternare {
    private Persoana persoana;

    public Persoana getPersoana() {
        return persoana;
    }

    public Internare(Persoana persoana) {
        this.persoana = persoana;
    }

    @Override
    public void internare() {
        System.out.println("Persoana "+ persoana.getNume()+ " va fi internata");
    }
}
