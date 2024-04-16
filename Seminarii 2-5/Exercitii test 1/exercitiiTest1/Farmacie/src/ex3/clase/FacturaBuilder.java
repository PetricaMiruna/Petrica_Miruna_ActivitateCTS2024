package ex3.clase;

public class FacturaBuilder implements Builder {
    Factura factura;

    public FacturaBuilder() {
        factura = new Factura(false,false,false,false);
    }

    public FacturaBuilder setNrPungi(boolean nrPungi) {
        this.factura.setNumarPungi(nrPungi);
        return this;
    }

    public FacturaBuilder setPlataCard(boolean plataCuCard) {
        this.factura.setPlataCuCard(plataCuCard);
        return this;
    }

    public FacturaBuilder setCardFidelitate(boolean cardFidelitate){
        this.factura.setCardFidelitate(cardFidelitate);
        return this;
    }

    public FacturaBuilder setCotaTVA(boolean cotaTVA){
        this.factura.setCotaTVA(cotaTVA);
        return this;
    }
    @Override
    public Factura build() {
        return factura;
    }
}
