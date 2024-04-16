package ex11.clase;

public class FabricaPlata {

    public Plata getPlata(TipPlata tip) throws Exception {
        if(tip == TipPlata.CASH){
            return new PlataCash();
        }
        if(tip == TipPlata.CARD)
            return new PlataCard();
        throw new Exception("Nu s-a ales tipul de plata");
    }


}
