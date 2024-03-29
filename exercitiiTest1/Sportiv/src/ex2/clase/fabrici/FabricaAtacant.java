package ex2.clase.fabrici;

import ex2.clase.Atacant;
import ex2.clase.Jucator;

public class FabricaAtacant implements Fabrica {
    @Override
    public Jucator getJucator(String nume, int varsta, int aniVechime) {
        return new Atacant(nume,varsta,aniVechime);
    }
}
