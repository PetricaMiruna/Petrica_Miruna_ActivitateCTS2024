package clase;

public class VanzareBilet implements Vanzare {
    private String meci;
    private int pret;
    @Override
    public void vanzare(Persoana persoana) {
        System.out.println("Persoana "+persoana.getNume()+
                " a cumparat bilet la meciul "+this.meci +" platind "+ this.pret+ " lei.");
    }

    public VanzareBilet(String meci, int pret) {
        this.meci = meci;
        this.pret = pret;
    }
}
