package ex13.State.clase;

public class Masa {
    private int nrMasa;
    private Stare stare;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        this.stare=new Libera();
    }


    public void rezervaMasa(){
        if(stare instanceof Libera){
            System.out.println("Masa cu numarul "+ nrMasa+ " a fost rezervata");
            this.stare= new Rezervata();
        } else{
            System.out.println("Masa cu numarul "+ nrMasa+ " nu poate fi rezervata");
        }
    }

    public void ocupaMasa(){
        if(!(stare instanceof Ocupata)){
            System.out.println("Masa cu numarul "+ nrMasa+ " a fost ocupata");
            stare= new Ocupata();
        }
        else{
            System.out.println("Masa cu numarul "+ nrMasa+ " este deja ocupata");

        }
    }

    public void elibereazaMasa(){
        if(!(stare instanceof Libera)){
            System.out.println("Masa cu numarul "+ nrMasa+ " a fost eliberata");
            stare=new Libera();
        }else{
            System.out.println("Masa cu numarul "+ nrMasa+ " este deja libera");
        }
    }

}
