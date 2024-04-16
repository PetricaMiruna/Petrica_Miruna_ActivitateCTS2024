package ex3.main;

import ex3.clase.FabricaSupe;
import ex3.clase.Supa;
import ex3.clase.TipSupa;

public class Main {
    public static void main(String[] args) {
        FabricaSupe fabricaSupe = new FabricaSupe();
        try {
            Supa supa = fabricaSupe.getSupa(TipSupa.LEGUME);
            System.out.println(supa.getClass().getSimpleName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
