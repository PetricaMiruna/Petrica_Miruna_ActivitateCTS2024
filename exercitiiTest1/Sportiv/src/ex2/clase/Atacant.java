package ex2.clase;

public class Atacant extends Jucator {
    public Atacant() {
    }

    public Atacant(String nume, int varsta, int aniVechime) {
        super(nume, varsta, aniVechime);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Jucatorul cu numele "+ this.getNume()+ " este atacant in varsta de "
                +this.getVarsta()+ " si are vechime de "+ this.getAniVechime()+ " ani");

    }
}
