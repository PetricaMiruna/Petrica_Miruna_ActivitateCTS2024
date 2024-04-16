package ex2.main;

import ex2.clase.Jucator;
import ex2.clase.fabrici.Fabrica;
import ex2.clase.fabrici.FabricaAtacant;
import ex2.clase.fabrici.FabricaFundas;
import ex2.clase.fabrici.FabricaPortar;

public class Main {

    public static Jucator creareJucator(Fabrica fabrica, String nume, int varsta, int aniVechime){
        Jucator jucator=fabrica.getJucator(nume, varsta, aniVechime);
        return jucator;

    }
    public static void main(String[] args) {

        Fabrica fabrica= new FabricaAtacant();
        Jucator atacant=fabrica.getJucator("Adrian", 23, 6);
        Fabrica fabrica1= new FabricaFundas();
        Jucator fundas=fabrica1.getJucator("Dan", 21,3);
        Fabrica fabrica2= new FabricaPortar();
        Jucator portar= fabrica2.getJucator("Ovidiu", 24,8);

        atacant.afisareDetalii();
        fundas.afisareDetalii();
        portar.afisareDetalii();

        Jucator jucator=creareJucator(new FabricaPortar(), "Ionut", 20,2);
        jucator.afisareDetalii();





    }
}
