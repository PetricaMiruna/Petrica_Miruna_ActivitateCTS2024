package ex11.clase;

public class FabricaPlata {

   public Plata getPlata(TipPlata tipPlata, String data, double valoare) throws Exception {
        if(tipPlata == TipPlata.CASH) {
            PlataCash plataCash= new PlataCash(data, valoare);
            return plataCash;
        }
        if(tipPlata == TipPlata.CARD){
           PlataCard plataCard= new PlataCard(data, valoare);
           return plataCard;
        }
        throw new Exception("Nu s-a facut plata");
    }
}
