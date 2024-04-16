package clase;

public class ProxyVarsta implements Vanzare {

    private Vanzare vanzareBilet;
    private static int varstaMinima=14;

    public static void setVarstaMinima(int varstaMinima) {
        ProxyVarsta.varstaMinima = varstaMinima;
    }

    public ProxyVarsta(Vanzare vanzareBilet) {
        this.vanzareBilet = vanzareBilet;
    }

    @Override
    public void vanzare(Persoana persoana) {
        if(persoana.getVarsta()>=varstaMinima) {
            vanzareBilet.vanzare(persoana);
        }
        else {
            System.out.println("Persoana are varsta de " + persoana.getVarsta() +" ani si nu poate achizitiona biletul");
        }
    }
}
