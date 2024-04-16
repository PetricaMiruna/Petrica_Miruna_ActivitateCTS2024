package ex10.main;

import ex10.clase.CategoriePlata;
import ex10.clase.FabricaPlata;
import ex10.clase.ModPlata;

public class Main {
    public static void main(String[] args) {


        FabricaPlata fabricaPlata= new FabricaPlata();
        try {
            ModPlata plataCardBancar= fabricaPlata.getPlata(CategoriePlata.CARD_BANCAR, "22.03.2024", 300);
            ModPlata plataCardCalatorii=fabricaPlata.getPlata(CategoriePlata.CARD_CALATORII, "23.01.2024", 500);

            plataCardBancar.afisareDetalii();
            plataCardCalatorii.afisareDetalii();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
