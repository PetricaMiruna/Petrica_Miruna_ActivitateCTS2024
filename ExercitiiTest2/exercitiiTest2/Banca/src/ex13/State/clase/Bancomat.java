package ex13.State.clase;

public class Bancomat {
    private double sumaRamasa;
    private Stare stare;

    public Bancomat(double sumaRamasa) {
        this.sumaRamasa = sumaRamasa;
        this.stare= new NuAreCard();
    }

    public double getSumaRamasa() {
        return sumaRamasa;
    }

    public void setSumaRamasa(double sumaRamasa) {
        this.sumaRamasa = sumaRamasa;
    }

    public Stare getStare() {
        return stare;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    public void introduCard(){
        if(stare instanceof NuAreCard){
            Stare areCard= new AreCard();
            areCard.setStare(this);
            System.out.println("Bancomatul are cardul introdus");
        }else{
            System.out.println("Nu se poate introduce cardul");
        }
    }

    public void introduPIN(){
        if(stare instanceof AreCard){
            Stare arePinIntrodus= new ArePINIntrodus();
            arePinIntrodus.setStare(this);
            System.out.println(" Bancomatul are pin introdus");

        }
        else{
            System.out.println("Nu se poate introduce pinul");
        }
    }
    public void extrageBani(double sumaCeruta){
        if(stare instanceof ArePINIntrodus) {
            if (this.sumaRamasa >= sumaCeruta) {
                sumaRamasa -= sumaCeruta;
                System.out.println("S-a eliberat suma " + sumaCeruta);
                Stare nuAreCard = new NuAreCard();
                nuAreCard.setStare(this);
            } else {
                Stare nuAreBani = new NuAreBani();
                nuAreBani.setStare(this);
                System.out.println("Bancomatul nu are bani");
            }
        }else{
            System.out.println("Nu se pot extrage bani fara introducerea pinului");
        }
    }
}
