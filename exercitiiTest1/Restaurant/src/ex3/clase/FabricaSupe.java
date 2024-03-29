package ex3.clase;

public class FabricaSupe {
    public Supa getSupa(TipSupa tip) throws Exception {
        if(tip == TipSupa.LEGUME) {
            return new SupaDeLegume();
        }
        if(tip == TipSupa.CIUPERCI) {
            return new SupaDeCiuperci();
        }
        if(tip == TipSupa.VITA) {
            return new SupaDeVita();
        }
        throw new Exception("Alta supa");
    }
}
