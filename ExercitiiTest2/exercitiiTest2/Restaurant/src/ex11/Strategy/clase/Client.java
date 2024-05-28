package ex11.Strategy.clase;

public class Client {
    private String numeClient;
    private ModPlata modPlata;

    public void PlatesteNota(double valoare){
        modPlata.plateste(this.numeClient, valoare);
    }

    public Client(String numeClient, ModPlata modPlata) {
        this.numeClient = numeClient;
        this.modPlata = modPlata;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public ModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public Client(String numeClient) {
        this.numeClient = numeClient;
        this.modPlata= new Card();
    }
}
