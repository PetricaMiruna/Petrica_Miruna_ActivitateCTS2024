package ex3.clase;

public class Rezervare implements Builder {
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacoritoareInclusa;
    private boolean muzicaAmbientalaPersonalizata;
    private boolean genMuzica;

    public Rezervare() {
    }

    public Rezervare(boolean mancareInclusa, boolean scaunErgonomic, boolean bauturaRacoritoareInclusa, boolean muzicaAmbientalaPersonalizata, boolean genMuzica) {
        this.mancareInclusa = mancareInclusa;
        this.scaunErgonomic = scaunErgonomic;
        this.bauturaRacoritoareInclusa = bauturaRacoritoareInclusa;
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        this.genMuzica = genMuzica;
    }

    public void setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public void setBauturaRacoritoareInclusa(boolean bauturaRacoritoareInclusa) {
        this.bauturaRacoritoareInclusa = bauturaRacoritoareInclusa;
    }

    public void setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
    }

    public void setGenMuzica(boolean genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("mancareInclusa=").append(mancareInclusa);
        sb.append(", scaunErgonomic=").append(scaunErgonomic);
        sb.append(", bauturaRacoritoareInclusa=").append(bauturaRacoritoareInclusa);
        sb.append(", muzicaAmbientalaPersonalizata=").append(muzicaAmbientalaPersonalizata);
        sb.append(", genMuzica=").append(genMuzica);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Rezervare build() {
        return new Rezervare(mancareInclusa,scaunErgonomic,
                bauturaRacoritoareInclusa,muzicaAmbientalaPersonalizata,genMuzica);
    }
}
