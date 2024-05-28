package ex8.Proxy.clase;

public class Cont implements ICont {
    private Credit credit;

    public Credit getCredit() {
        return credit;
    }

    public Cont(Credit credit) {
        this.credit = credit;
    }

    @Override
    public void creazaCont() {
        System.out.println("Creditul "+ credit.getNrCredit()+ " a fost creat");
    }
}
