package ex8.Proxy.clase;

public class Credit {
    private boolean inRON;
    private int nrCredit;

    public Credit(boolean inRON, int nrCredit) {
        this.inRON = inRON;
        this.nrCredit = nrCredit;
    }

    public boolean isInRON() {
        return inRON;
    }

    public int getNrCredit() {
        return nrCredit;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Credit{");
        sb.append("inRON=").append(inRON);
        sb.append(", nrCredit=").append(nrCredit);
        sb.append('}');
        return sb.toString();
    }
}
