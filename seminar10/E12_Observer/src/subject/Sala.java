package subject;

public class Sala extends Subject {

    @Override
    public void notificaMeciFotbal() {
        String mesaj= "Va avea loc un meci de fotbal pe data de 23 la ora 18";
        notificaAbonati(mesaj);

    }

    @Override
    public void notificaMeciVolei() {

        String mesaj= "Va avea loc un meci de volei pe data de 24 la ora 17";
        notificaAbonati(mesaj);
    }

    @Override
    public void notificaMeciHandbal() {

        String mesaj= "Va avea loc un meci de handbal pe data de 23 la ora 15";
        notificaAbonati(mesaj);
    }
}
