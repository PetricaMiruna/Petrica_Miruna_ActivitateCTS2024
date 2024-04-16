package ex2.fabrici;

import ex2.clase.Medicament;
import ex2.clase.MedicamentRaceala;

public class FabricaMedicamentRaceala implements FabricaAbstracta{
    @Override
    public Medicament getMedicament(float pret, String denumire) {
      return new MedicamentRaceala();
    }
}
