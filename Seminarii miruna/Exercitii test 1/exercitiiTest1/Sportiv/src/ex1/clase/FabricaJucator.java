package ex1.clase;

public class FabricaJucator {
    public Jucator getJucator(CategorieJucator categorieJucator, String nume, int varsta) throws Exception {
        if(categorieJucator == CategorieJucator.PORTAR) {
            return new Portar(nume, varsta);
        }
        if(categorieJucator == CategorieJucator.FUNDAS) {
            return new Fundas(nume, varsta);
        }
        if(categorieJucator == CategorieJucator.ATACANT){
            return new Atacant(nume, varsta);
        }
        throw new Exception("Niciuna dintre variante");
    }
}
