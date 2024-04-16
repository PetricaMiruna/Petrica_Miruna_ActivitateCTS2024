package ex10.clase;

public class FabricaPlata {
    public ModPlata getPlata(CategoriePlata categoriePlata, String data, double sumaPlata) throws Exception {
        if(categoriePlata == CategoriePlata.SMS){
            return new PlataSMS(data,sumaPlata);
        }
        if(categoriePlata == CategoriePlata.CARD_BANCAR){
            return new PlataCardBancar(data,sumaPlata);
        }
        if(categoriePlata == CategoriePlata.CARD_CALATORII){
            return new PlataCardCalatorii(data,sumaPlata);
        }

        throw new Exception("Alt tip de plata");
    }
}
