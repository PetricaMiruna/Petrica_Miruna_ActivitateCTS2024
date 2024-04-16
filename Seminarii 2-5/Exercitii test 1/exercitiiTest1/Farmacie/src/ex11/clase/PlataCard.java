package ex11.clase;

public class PlataCard extends Plata{

    private double comision;
    public PlataCard(String data, double valoare) {
        super(data, valoare);
    }

    public PlataCard(String data, double valoare, double comision) {
        super(data, valoare);
        this.comision = comision;
    }

    public PlataCard() {
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Plata din data de " + getData()+ " in valoare de " + getValoare()+" a fost facuta cu cardul");
    }
}
