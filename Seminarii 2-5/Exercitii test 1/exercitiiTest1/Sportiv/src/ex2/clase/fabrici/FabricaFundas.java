package ex2.clase.fabrici;

import ex2.clase.Fundas;
import ex2.clase.Jucator;

public class FabricaFundas implements Fabrica {
    @Override
    public Jucator getJucator(String nume, int varsta, int aniVechime) {
        return new Fundas(nume, varsta, aniVechime);
    }
}
