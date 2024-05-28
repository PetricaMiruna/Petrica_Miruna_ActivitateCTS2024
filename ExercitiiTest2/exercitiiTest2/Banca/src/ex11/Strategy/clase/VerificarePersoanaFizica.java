package ex11.Strategy.clase;

public class VerificarePersoanaFizica implements ModVerificare {
    @Override
    public void verificaActe(String numeClient) {
        System.out.println("Persoanei fizice "+ numeClient+ " i-au fost verificate buletinul si adeverinta de la munca");

    }
}
