package ex2.clase.fabrici;

import ex2.clase.Jucator;

public interface Fabrica {
    Jucator getJucator(String nume, int varsta, int aniVechime);
}
