package ex2.clase;

public class ServiciuPersoanaFizica extends Serviciu {

    public ServiciuPersoanaFizica() {
    }

    public ServiciuPersoanaFizica(String data, String denumire) {
        super(data, denumire);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Serviciu persoana fizica");
    }
}
