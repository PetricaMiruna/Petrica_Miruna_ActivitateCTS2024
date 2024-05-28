package ex8.Proxy.clase;

public class ProxyCont implements ICont {
    private Cont cont;

    public ProxyCont(Cont cont) {
        this.cont = cont;
    }

    @Override
    public void creazaCont() {
        if(cont.getCredit().isInRON()){
            System.out.println("Creditul "+ cont.getCredit().getNrCredit()+ " a fost creat cu succes");

        }else{
            System.out.println("Creditul "+ cont.getCredit().getNrCredit()+ " nu poate fi creat deoarece nu este in RON");
        }
    }
}
