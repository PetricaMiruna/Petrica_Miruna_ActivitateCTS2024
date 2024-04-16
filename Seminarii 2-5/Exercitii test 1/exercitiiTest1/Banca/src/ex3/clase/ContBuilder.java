package ex3.clase;

public class ContBuilder implements Builder {
    Cont cont;
    public ContBuilder() {
        cont= new Cont(false,false,false);
    }

    public ContBuilder setContDeSalariu(boolean contDeSalariu){
        this.cont.setContDeSalariu(contDeSalariu);
        return this;
    }

    public ContBuilder setCardAtasat(boolean cardAtasat){
        this.cont.setCardAtasat(cardAtasat);
        return this;
    }

    public ContBuilder setInternetBanking(boolean internetBanking){
        this.cont.setInternetBanking(internetBanking);
        return this;
    }

    @Override
    public Cont build() {
        return cont;
    }
}
