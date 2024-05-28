package ex11.Strategy.clase;

public class Card implements ModPlata {

    @Override
    public void plateste(String numeClient, double valoare) {
        System.out.println("Clientul "+ numeClient+ " a facut o plata cu cardul in valoare de "+ valoare+ " ron");
    }
}
