package ex2.clase;

import ex1.clase.MijlocTransport;

public class Troleibuz implements MijlocDeTransport {

    private int nrLocuri;
    private int nrTroleibuz;

    public Troleibuz() {
    }

    public Troleibuz(int nrLocuri, int nrTroleibuz) {
        this.nrLocuri = nrLocuri;
        this.nrTroleibuz = nrTroleibuz;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public int getNrTroleibuz() {
        return nrTroleibuz;
    }

    public void setNrTroleibuz(int nrTroleibuz) {
        this.nrTroleibuz = nrTroleibuz;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Troleibuz{");
        sb.append("nrLocuri=").append(nrLocuri);
        sb.append(", nrTroleibuz=").append(nrTroleibuz);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public MijlocDeTransport clone() {
        Troleibuz troleibuz= new Troleibuz();
        troleibuz.setNrTroleibuz(this.nrTroleibuz);
        troleibuz.setNrLocuri(this.nrLocuri);
        return troleibuz;
    }
}
