package ex11.main;

import ex11.clase.FabricaPlata;
import ex11.clase.Plata;
import ex11.clase.PlataCard;
import ex11.clase.TipPlata;

public class Main {
    public static void main(String[] args) {

        FabricaPlata fabricaPlata= new FabricaPlata();
        try {
            Plata plataCard=fabricaPlata.getPlata(TipPlata.CARD, "22.02.2024", 205);
            plataCard.afisareDetalii();
            Plata plataCash=fabricaPlata.getPlata(TipPlata.CASH, "15.03.2024", 120);
            plataCash.afisareDetalii();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

