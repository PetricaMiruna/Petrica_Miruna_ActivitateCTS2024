package ex1.main;

import ex1.clase.CategorieCredit;
import ex1.clase.Credit;
import ex1.clase.FabricaCredite;

public class Main {
    public static void main(String[] args) {
        FabricaCredite fabricaCredite= new FabricaCredite();
        try {
            Credit creditIpotecar=fabricaCredite.getCredit(CategorieCredit.IPOTECAR, 12, 7000);
            Credit creditNevoiPersonale= fabricaCredite.getCredit(CategorieCredit.NEVOI_PERSONALE, 6, 8000);

            creditIpotecar.afisareDetalii();
            creditNevoiPersonale.afisareDetalii();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}