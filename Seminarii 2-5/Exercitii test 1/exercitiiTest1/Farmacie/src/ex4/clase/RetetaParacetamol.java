package ex4.clase;

import java.util.HashMap;
import java.util.Map;

public class RetetaParacetamol implements Reteta {

    private Map<String, Float> cantitatiSolutii;
    private String modPreparare;

    public RetetaParacetamol() {
    }

    public RetetaParacetamol(Map<String, Float> cantitatiSolutii, String modPreparare) {
        this.cantitatiSolutii = cantitatiSolutii;
        this.modPreparare = modPreparare;
    }

    public void setCantitatiSolutii(Map<String, Float> cantitatiSolutii) {
        this.cantitatiSolutii= new HashMap<>();
        for(String solutie:cantitatiSolutii.keySet()){
            this.cantitatiSolutii.put(solutie,cantitatiSolutii.get(solutie));
        }
    }

    public void setModPreparare(String modPreparare) {
        this.modPreparare = modPreparare;
    }

    @Override
    public Reteta clone() {
        RetetaParacetamol retetaParacetamol= new RetetaParacetamol();
        retetaParacetamol.setCantitatiSolutii(cantitatiSolutii);
        retetaParacetamol.setModPreparare(modPreparare);
        return  retetaParacetamol;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RetetaParacetamol{");
        sb.append("cantitatiSolutii=").append(cantitatiSolutii);
        sb.append(", modPreparare='").append(modPreparare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
