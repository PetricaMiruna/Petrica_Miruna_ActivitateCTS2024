package ex11.Strategy.clase;

public class Client {
    String nume;
    ModVerificare modVerificare;

    public void verificare(){
        modVerificare.verificaActe(this.nume);
    }
    public Client(String nume, ModVerificare modVerificare) {
        this.nume = nume;
        this.modVerificare = modVerificare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public ModVerificare getModVerificare() {
        return modVerificare;
    }

    public void setModVerificare(ModVerificare modVerificare) {
        this.modVerificare = modVerificare;
    }

    public Client(String nume) {
        this.nume = nume;
        this.modVerificare= new VerificarePersoanaFizica();
    }
}
