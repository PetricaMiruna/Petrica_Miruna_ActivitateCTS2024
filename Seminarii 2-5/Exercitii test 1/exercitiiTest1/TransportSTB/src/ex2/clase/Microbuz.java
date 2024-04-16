package ex2.clase;

import ex1.clase.MijlocTransport;

public class Microbuz implements MijlocDeTransport {

    private int nrLocuri;
    private int numarMicrobuz;

    public Microbuz() {
    }

    public Microbuz(int nrLocuri, int numarMicrobuz) {
        this.nrLocuri = nrLocuri;
        this.numarMicrobuz = numarMicrobuz;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public int getNumarMicrobuz() {
        return numarMicrobuz;
    }

    public void setNumarMicrobuz(int numarMicrobuz) {
        this.numarMicrobuz = numarMicrobuz;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Microbuz{");
        sb.append("nrLocuri=").append(nrLocuri);
        sb.append(", numarMicrobuz=").append(numarMicrobuz);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public MijlocDeTransport clone() {
        Microbuz microbuz= new Microbuz();
        microbuz.setNumarMicrobuz(this.numarMicrobuz);
        microbuz.setNrLocuri(this.nrLocuri);
        return microbuz;
    }
}
