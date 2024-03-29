package ex1.clase;

public class CreditIpotecar extends Credit {
    public CreditIpotecar() {
    }

    public CreditIpotecar(int perioadaCredit, double valoareCredit) {
        super(perioadaCredit, valoareCredit);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Credit ipotecar pe o perioada de "+ this.getPerioadaCredit()+" luni, cu valoarea de "+this.getValoareCredit()+" lei");
    }
}
