package ex1.clase;

public class FabricaSTB {
    public MijlocTransport getMijlocTransport(TipSTB tipSTB, int nrLocuri, String culoare) throws Exception {
        if(tipSTB == TipSTB.TROLEIBUZ){
            return new Troleibuz(nrLocuri,culoare);
        }
        if(tipSTB == TipSTB.AUTOBUZ) {
            return new Autobuz(nrLocuri, culoare);
        }
        if(tipSTB == TipSTB.MICROBUZ){
            return new Microbuz(nrLocuri,culoare);
        }
        throw new Exception("Alt mijloc de transport");
    }
}
