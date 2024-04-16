package ex1.clase;

public class FabricaMedicamente {
    public Medicament getMedicament(Categorie categorie) throws Exception {
        if(categorie == Categorie.RACEALA){
            return  new MedicamentRaceala();
        }
        if(categorie == Categorie.DURERE){
            return new MedicamentDurere();
        }
        if(categorie == Categorie.BODY){
            return new MedicamentBody();
        }

        throw new Exception("Alt tip de medicament");

    }
}
