package ex10.Flyweight.main;

import ex10.Flyweight.clase.Client;
import ex10.Flyweight.clase.FabricaClient;
import ex10.Flyweight.clase.IClient;
import ex10.Flyweight.clase.Reteta;

public class Main {
    public static void main(String[] args) {

        FabricaClient fabricaClient= new FabricaClient();

        Reteta reteta= new Reteta(120,100,3);
        Reteta reteta1= new Reteta(125,75,2);

        IClient client= fabricaClient.getClient(112);
        client.creeazaReteta(reteta);
        fabricaClient.getClient(113).creeazaReteta(reteta1);
    }
}
