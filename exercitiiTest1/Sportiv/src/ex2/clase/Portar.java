package ex2.clase;

public class Portar extends Jucator {
    public Portar() {
    }

    public Portar(String nume, int varsta, int aniVechime) {
        super(nume, varsta, aniVechime);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Jucatorul cu numele "+ this.getNume()+ " este portar in varsta de "
                +this.getVarsta()+ " si are vechime de "+ this.getAniVechime()+ " ani");

    }
}
