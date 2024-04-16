package ex11.main;

import ex11.clase.FabricaPlata;
import ex11.clase.Plata;
import ex11.clase.PlataCash;
import ex11.clase.TipPlata;

public class Main {
    public static void main(String[] args)  {

        FabricaPlata fabricaPlata= new FabricaPlata();
        try {
            Plata plata=fabricaPlata.getPlata(TipPlata.CARD);
            System.out.println(plata.toString());
            Plata plata1=fabricaPlata.getPlata(TipPlata.CASH);
            System.out.println(plata1.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
