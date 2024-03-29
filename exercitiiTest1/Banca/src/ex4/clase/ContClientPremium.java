package ex4.clase;

import java.util.HashMap;
import java.util.Map;

public class ContClientPremium implements Cont {

    String nume;
    String CNP;
    Map<String, Integer> procenteReduceriPersonalizate=new HashMap<>();

    public ContClientPremium() {
    }

    public ContClientPremium(String nume, String CNP, Map<String, Integer> procenteReduceriPersonalizate) {
        this.nume = nume;
        this.CNP = CNP;
        this.procenteReduceriPersonalizate = procenteReduceriPersonalizate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public Map<String, Integer> getProcenteReduceriPersonalizate() {
        return procenteReduceriPersonalizate;
    }

    public void setProcenteReduceriPersonalizate(Map<String, Integer> procenteReduceriPersonalizate) {
        this.procenteReduceriPersonalizate= new HashMap<>();
        for(String reducere:procenteReduceriPersonalizate.keySet()){
            this.procenteReduceriPersonalizate.put(reducere,procenteReduceriPersonalizate.get(reducere));
        }
    }

    @Override
    public Cont clone() {
        ContClientPremium contClientPremium= new ContClientPremium();
        contClientPremium.setCNP(this.CNP);
        contClientPremium.setProcenteReduceriPersonalizate(this.procenteReduceriPersonalizate);
        return contClientPremium;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContClientPremium{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", CNP='").append(CNP).append('\'');
        sb.append(", procenteReduceriPersonalizate=").append(procenteReduceriPersonalizate);
        sb.append('}');
        return sb.toString();
    }
}
