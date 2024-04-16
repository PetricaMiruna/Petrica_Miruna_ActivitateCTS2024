package ex4.clase;

public class ClientNou implements ClientAbstract{
    private String nume;
    private int varsta;

    public ClientNou(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public ClientNou() {
        this.nume="Necunoscut";
        this.varsta=23;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientNou{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public ClientAbstract clone() {
        ClientNou clientNou = new ClientNou();
        clientNou.setVarsta(this.varsta);
        clientNou.setNume(this.nume);
        return clientNou;

    }
}
