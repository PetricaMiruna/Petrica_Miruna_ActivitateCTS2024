package ex3.clase;

import ex2.clase.Autobuz;

import java.io.BufferedReader;

public class AutobuzLinie implements IBuilder {

    private String sofer;
    private boolean areOpriri;
    private boolean deschideUsile;
    private String text;

    private static AutobuzLinie instanta = null;
    private AutobuzLinie(){
        AutobuzLinie autobuzLinie= new AutobuzLinie(false,false);
    }

    public AutobuzLinie(String sofer, boolean areOpriri, boolean deschideUsile, String text) {
        this.sofer = sofer;
        this.areOpriri = areOpriri;
        this.deschideUsile = deschideUsile;
        this.text = text;
    }

    public AutobuzLinie(boolean areOpriri, boolean deschideUsile) {
        this.areOpriri = areOpriri;
        this.deschideUsile = deschideUsile;
    }

    public void setSofer(String sofer) {
        this.sofer = sofer;
    }

    public void setAreOpriri(boolean areOpriri) {
        this.areOpriri = areOpriri;
    }

    public void setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSofer() {
        return sofer;
    }


    public boolean isAreOpriri() {
        return areOpriri;
    }

    public boolean isDeschideUsile() {
        return deschideUsile;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("sofer='").append(sofer).append('\'');
        sb.append(", areOpriri=").append(areOpriri);
        sb.append(", deschideUsile=").append(deschideUsile);
        sb.append(", text='").append(text).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static synchronized AutobuzLinie getInstanta(){
        if(instanta == null){
            instanta= new AutobuzLinie();
        }
        return instanta;
    }

    @Override
    public AutobuzLinie build() {
        return new AutobuzLinie(sofer,areOpriri, deschideUsile,text);
    }
}
