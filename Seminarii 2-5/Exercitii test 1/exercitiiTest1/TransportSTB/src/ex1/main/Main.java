package ex1.main;

import ex1.clase.FabricaSTB;
import ex1.clase.MijlocTransport;
import ex1.clase.TipSTB;

public class Main {

    public static void main(String[] args) {

        FabricaSTB fabricaSTB= new FabricaSTB();
        try {
            MijlocTransport microbuz=fabricaSTB.getMijlocTransport(TipSTB.MICROBUZ, 22, "albastru");
            MijlocTransport autobuz= fabricaSTB.getMijlocTransport(TipSTB.AUTOBUZ, 21, "alb");
            MijlocTransport troleibuz=fabricaSTB.getMijlocTransport(TipSTB.TROLEIBUZ, 24, "verde");

            microbuz.afisareDetalii();
            autobuz.afisareDetalii();
            troleibuz.afisareDetalii();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}