package ex4.clase;

public class ContClient implements Cont {

    String nume;
    String dateBuletin;

    public ContClient() {
    }

    public ContClient(String nume, String dateBuletin) {
        this.nume = nume;
        this.dateBuletin = dateBuletin;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDateBuletin() {
        return dateBuletin;
    }

    public void setDateBuletin(String dateBuletin) {
        this.dateBuletin = dateBuletin;
    }

    @Override
    public Cont clone() {
        ContClient contClient= new ContClient();
        contClient.setNume(this.nume);
        contClient.setDateBuletin(this.dateBuletin);
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContClient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", dateBuletin='").append(dateBuletin).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
