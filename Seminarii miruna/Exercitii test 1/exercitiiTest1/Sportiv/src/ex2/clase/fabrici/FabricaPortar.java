package ex2.clase.fabrici;

import ex2.clase.Jucator;
import ex2.clase.Portar;

public class FabricaPortar implements Fabrica{
    @Override
    public Jucator getJucator(String nume, int varsta, int aniVechime) {
        return new Portar(nume,varsta,aniVechime);
    }
}
