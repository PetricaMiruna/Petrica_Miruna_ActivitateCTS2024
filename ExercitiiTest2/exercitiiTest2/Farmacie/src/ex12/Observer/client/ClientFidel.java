package ex12.Observer.client;

public class ClientFidel implements Observer {
    private String nume;

    public ClientFidel(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println("Clientul "+ this.nume+ " a primit mesajul : " + mesaj);
    }
}
