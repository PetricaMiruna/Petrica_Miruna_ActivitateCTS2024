package ex3.clase;

public class Factura implements Builder {
    private boolean numarPungi;
    private boolean plataCuCard;
    private boolean cardFidelitate;
    private boolean cotaTVA;

    public Factura(boolean numarPungi, boolean plataCuCard, boolean cardFidelitate, boolean cotaTVA) {
        this.numarPungi = numarPungi;
        this.plataCuCard = plataCuCard;
        this.cardFidelitate = cardFidelitate;
        this.cotaTVA = cotaTVA;
    }

    public void setNumarPungi(boolean numarPungi) {
        this.numarPungi = numarPungi;
    }

    public void setPlataCuCard(boolean plataCuCard) {
        this.plataCuCard = plataCuCard;
    }

    public void setCardFidelitate(boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
    }

    public void setCotaTVA(boolean cotaTVA) {
        this.cotaTVA = cotaTVA;
    }

    @Override
    public Factura build() {
        return new Factura(numarPungi,plataCuCard,cardFidelitate,cotaTVA);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Factura{");
        sb.append("numarPungi=").append(numarPungi);
        sb.append(", plataCuCard=").append(plataCuCard);
        sb.append(", cardFidelitate=").append(cardFidelitate);
        sb.append(", cotaTVA=").append(cotaTVA);
        sb.append('}');
        return sb.toString();
    }
}
