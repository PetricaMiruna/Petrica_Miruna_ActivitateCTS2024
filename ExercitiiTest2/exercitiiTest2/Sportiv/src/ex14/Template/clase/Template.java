package ex14.Template.clase;

public abstract class Template {
    //: Se așază la coada,
    // Se prezinta biletul,
    // Se face controlul corporal,
    // Se intra in stadion, Se ocupa locul.

    public abstract void asezareLaCoada();
    public abstract void prezentareBilet();
    public abstract boolean efectuareControl(Stadion stadion);
    public abstract void intrareInStadion();
    public abstract void refuzareIntrare();
    public final void ocupaLoc(Stadion stadion){
       asezareLaCoada();
       prezentareBilet();
       if(efectuareControl(stadion)){
           intrareInStadion();
       }
       else{
           refuzareIntrare();
       }
    }

}
