package ex12.Observer.pacient;

public class Pacient implements Observer {
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println("Pacientul "+ this.nume+ " a primit mesajul " + mesaj);
    }
}
