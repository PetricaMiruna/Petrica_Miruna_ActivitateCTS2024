package ex11.clase;

public class PlataCash extends Plata {

    boolean includeRecompensa;

    public PlataCash(String data, double valoare) {
        super(data, valoare);
    }

    public PlataCash() {
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Plata din data de " + this.getData()+ " in valoare de " + this.getValoare()+" a fost facuta cu cash");
    }
}
