package ex11.Strategy.clase;

public class Cash implements ModPlata{
    @Override
    public void plateste(String numeClient, double valoare) {
        System.out.println("Clientul "+ numeClient+ " a facut o plata cash in valoare de "+ valoare+ " ron");
    }
}
