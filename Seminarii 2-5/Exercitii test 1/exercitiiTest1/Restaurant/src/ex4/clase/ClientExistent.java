package ex4.clase;

import java.util.HashMap;
import java.util.Map;

public class ClientExistent implements ClientAbstract{

    private Map <Integer, String> comenzi= new HashMap<>();
    private String nume;

    public ClientExistent(Map<Integer, String> comenzi, String nume) {
        this.comenzi = comenzi;
        this.nume = nume;
    }

    public ClientExistent() {
        comenzi = null;
        nume= "Necunoscut";
    }

    public Map<Integer, String> getComenzi() {
        return comenzi;
    }

    public void setComenzi(Map<Integer, String> comenzi) {
        this.comenzi=new HashMap<>();

        for(Integer id:comenzi.keySet()){
            this.comenzi.put(id, comenzi.get(id));
        }
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public ClientAbstract clone() {

        ClientExistent clientExistent= new ClientExistent();
        clientExistent.setComenzi(this.comenzi);
        clientExistent.setNume(this.nume);
        return clientExistent;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientExistent{");
        sb.append("comenzi=").append(comenzi);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
