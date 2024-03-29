package ex2.clase;

public class Fundas extends Jucator {
    public Fundas() {
    }

    public Fundas(String nume, int varsta, int aniVechime) {
        super(nume, varsta, aniVechime);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Jucatorul cu numele "+ this.getNume()+ " este fundas in varsta de "
                +this.getVarsta()+ " si are vechime de "+ this.getAniVechime()+ " ani");

    }
}
