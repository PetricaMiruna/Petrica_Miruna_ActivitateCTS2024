package ex4.clase;

import java.util.HashMap;
import java.util.Map;

public class RetetaNurofen implements Reteta {
    private Map<String, Double> cantitatiSolutii= new HashMap<>();
    private double timpPreparare;

    public RetetaNurofen(Map<String, Double> cantitatiSolutii, double timpPreparare) {
        this.cantitatiSolutii = cantitatiSolutii;
        this.timpPreparare = timpPreparare;
    }

    public RetetaNurofen() {
    }
    public Map<String, Double> getCantitatiSolutii() {
        return cantitatiSolutii;
    }

    public void setCantitatiSolutii(Map<String, Double> cantitatiSolutii) {
        this.cantitatiSolutii = new HashMap<>();
        for( String solutie:cantitatiSolutii.keySet()){
            this.cantitatiSolutii.put(solutie, cantitatiSolutii.get(solutie));
        }
    }

    public double getTimpPreparare() {
        return timpPreparare;
    }

    public void setTimpPreparare(double timpPreparare) {
        this.timpPreparare = timpPreparare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RetetaNurofen{");
        sb.append("cantitatiSolutii=").append(cantitatiSolutii);
        sb.append(", timpPreparare=").append(timpPreparare);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Reteta clone() {
        RetetaNurofen retetaNurofen= new RetetaNurofen();
        retetaNurofen.setCantitatiSolutii(cantitatiSolutii);
        retetaNurofen.setTimpPreparare(timpPreparare);
        return retetaNurofen;
    }
}
