package ex3.clase;

public class Cont implements Builder {
    private boolean contDeSalariu;
    private boolean cardAtasat;
    private boolean internetBanking;

    public Cont(boolean contDeSalariu, boolean cardAtasat, boolean internetBanking) {
        this.contDeSalariu = contDeSalariu;
        this.cardAtasat = cardAtasat;
        this.internetBanking = internetBanking;
    }

    public void setContDeSalariu(boolean contDeSalariu) {
        this.contDeSalariu = contDeSalariu;
    }

    public void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    public void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("contDeSalariu=").append(contDeSalariu);
        sb.append(", cardAtasat=").append(cardAtasat);
        sb.append(", internetBanking=").append(internetBanking);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Cont build() {
        return new Cont(contDeSalariu, cardAtasat, internetBanking);
    }
}
