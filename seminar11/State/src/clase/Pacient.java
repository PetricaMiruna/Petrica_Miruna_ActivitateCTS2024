package clase;

public class Pacient {
    private String nume;
    private Stare stare;

    public Pacient(String nume) {
        this.nume = nume;
        stare=new Internat();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Stare getStare() {
        return stare;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public void seAgraveazaStarea(){
        if (this.stare instanceof  Internat) {
            Stare subObservatie= new SubObservatie();
            subObservatie.setareStare(this);
            System.out.println("Starea de sanatate a pacientului "+ this.getNume()+ " s-a agravat");

        }
        else{
            System.out.println("Pacientul "+ this.getNume()+" nu este internat");
        }
    }

    public void seImbunatatesteStarea() {
        if(this.stare instanceof SubObservatie){
            Stare internare= new Internat();
            internare.setareStare(this);
            System.out.println("Sanatatea pacientului "+ this.getNume()+ " s-a imbunatatit");

        }
        else{
            System.out.println("Pacientul "+ this.getNume()+ " nu era in stare grava");
        }
    }

    public void vindecare(){
        if(this.stare instanceof Internat){
            Stare externat= new Externat();
            externat.setareStare(this);
            System.out.println("Pacientul "+ this.getNume()+ " a fost externat");

        }
        else{
            System.out.println("Pacientul "+ this.getNume()+" nu poate fi externat");
        }
    }
}
