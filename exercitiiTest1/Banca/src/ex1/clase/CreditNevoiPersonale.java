package ex1.clase;

public class CreditNevoiPersonale extends Credit {
    public CreditNevoiPersonale() {
    }

    public CreditNevoiPersonale(int perioadaCredit, double valoareCredit) {
        super(perioadaCredit, valoareCredit);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Credit de nevoi personale pe o perioada de "+ this.getPerioadaCredit()+" luni, cu valoarea de "+this.getValoareCredit()+ " lei");


    }
}
