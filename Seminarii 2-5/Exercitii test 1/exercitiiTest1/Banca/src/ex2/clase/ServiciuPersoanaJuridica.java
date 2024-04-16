package ex2.clase;

public class ServiciuPersoanaJuridica extends Serviciu {
    public ServiciuPersoanaJuridica(String data, String denumire) {
        super(data, denumire);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Serviciu persoana juridica");
    }
}
