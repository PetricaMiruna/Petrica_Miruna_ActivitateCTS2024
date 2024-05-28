package ex11.Strategy.clase;

public class VerificarePersoanaJuridica implements ModVerificare {
    @Override
    public void verificaActe(String numeClient) {
        System.out.println("Persoanei juridice "+ numeClient+ " i-au fost verificate actele de infiintare si dovada inregistrarii ");

    }
}
