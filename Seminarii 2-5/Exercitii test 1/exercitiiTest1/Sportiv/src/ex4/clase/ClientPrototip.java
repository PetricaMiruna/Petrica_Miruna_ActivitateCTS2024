package ex4.clase;

import java.util.HashMap;
import java.util.Map;

public class ClientPrototip implements AbstractClient {

    private String nume;
    private int varsta;
    Map<String, String> detaliiCont = new HashMap<>();

    public ClientPrototip() {
    }

    public ClientPrototip(String nume, int varsta, Map<String, String> detaliiCont) {
        this.nume = nume;
        this.varsta = varsta;
        this.detaliiCont = detaliiCont;
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

    public Map<String, String> getDetaliiCont() {
        return detaliiCont;
    }

    public void setDetaliiCont(Map<String, String> detaliiCont) {
        this.detaliiCont = new HashMap<>();
        for(String detaliu:detaliiCont.keySet()){
            this.detaliiCont.put(detaliu, detaliiCont.get(detaliu));
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientPrototip{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", detaliiCont=").append(detaliiCont);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public AbstractClient clone() {
        ClientPrototip clientPrototip= new ClientPrototip();
        clientPrototip.setNume(this.nume);
        clientPrototip.setVarsta(this.varsta);
        clientPrototip.setDetaliiCont(this.detaliiCont);
        return clientPrototip;
    }
}
