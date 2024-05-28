package ex10.Flyweight.clase;

import java.util.HashMap;

public class FabricaClient {
    private HashMap<Integer, Client> listaClienti;

    public FabricaClient() {
        listaClienti= new HashMap<>();
    }

    public IClient getClient(int nrAsigurare){
        if(listaClienti.containsKey(nrAsigurare)){
            return listaClienti.get(nrAsigurare);
        }
        else{
            IClient client= new Client("Radu", 144);
            listaClienti.put(nrAsigurare, (Client) client);
            return client;
        }
    }
}
