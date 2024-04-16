package ex1.clase;

public class FabricaCredite {
    public Credit getCredit(CategorieCredit categorieCredit, int perioada, double valoare) throws Exception {
        if(categorieCredit == CategorieCredit.IPOTECAR){
            CreditIpotecar creditIpotecar= new CreditIpotecar( perioada, valoare);
            return creditIpotecar;
        }
        if(categorieCredit == CategorieCredit.NEVOI_PERSONALE){
            CreditNevoiPersonale creditNevoiPersonale= new CreditNevoiPersonale(perioada, valoare);
            return creditNevoiPersonale;
        }
        throw new Exception("Alt tip de credit");
    }
}
