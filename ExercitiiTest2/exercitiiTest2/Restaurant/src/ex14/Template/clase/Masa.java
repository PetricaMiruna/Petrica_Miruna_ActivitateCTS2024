package ex14.Template.clase;

public class Masa extends Template {
    private int nrMasa;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    @Override
    public void curataMasa() {
        System.out.println("Masa "+ nrMasa+ " a fost curatata");
    }

    @Override
    public void aseazaServetelele() {

        System.out.println("Pe masa "+ nrMasa+" au fost asezate servetelele");
    }

    @Override
    public void aseazaTacamuri() {

        System.out.println("Pe masa "+ nrMasa+ " au fost asezate tacamurile");
    }

    @Override
    public void invitaPersoane(Persoana persoana) {

        System.out.println( "Persoanele care au rezervarea pe numele "+persoana.getNume() +" sunt invitate la masa");
    }
}
