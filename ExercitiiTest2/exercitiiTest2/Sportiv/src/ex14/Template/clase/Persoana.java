package ex14.Template.clase;

public class Persoana extends Template{
    private String nume;
    private int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public void asezareLaCoada() {
        System.out.println("Persoana "+ nume+ " este la coada");
    }

    @Override
    public void prezentareBilet() {

        System.out.println("Persoana "+ nume+"prezinta biletul");
    }

    @Override
    public boolean efectuareControl(Stadion stadion) {

        System.out.println("Lui "+ nume+ " i se efectueaza controlul");
        if(this.varsta<=stadion.getVarstaMinima()){

            return false;
        }
        else return true;
    }

    @Override
    public void intrareInStadion() {

        System.out.println("Persoana "+ nume+ " a intrat pe stadion");
    }

    @Override
    public void refuzareIntrare() {

        System.out.println("Persoana "+ nume+" nu are varsta minima pentru a intra pe stadion");
    }


}
