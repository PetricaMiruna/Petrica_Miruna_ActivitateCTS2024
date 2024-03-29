package ex2.clase;

public class Rezervare implements Builder{
    private boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorMasa;
    private boolean muzicaAmbientalaPersonalizata;
    private boolean genMuzica;

    public Rezervare(boolean asezareLaGeam, boolean scauneErgonomice, boolean decorMasa, boolean muzicaAmbientalaPersonalizata, boolean genMuzica) {
        this.asezareLaGeam = asezareLaGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorMasa = decorMasa;
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        this.genMuzica = genMuzica;
    }

    public void setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
    }

    public void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public void setDecorMasa(boolean decorMasa) {
        this.decorMasa = decorMasa;
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
        sb.append("asezareLaGeam=").append(asezareLaGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorMasa=").append(decorMasa);
        sb.append(", muzicaAmbientalaPersonalizata=").append(muzicaAmbientalaPersonalizata);
        sb.append(", genMuzica=").append(genMuzica);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Rezervare build() {
        return new Rezervare(asezareLaGeam,scauneErgonomice,decorMasa,muzicaAmbientalaPersonalizata,genMuzica);
    }
}
