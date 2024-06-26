package ex3.clase;

public class RezervareBuilder implements Builder {
    Rezervare rezervare;
    public RezervareBuilder() {
        rezervare=new Rezervare(false,false,
                false,false,false);
    }

    public RezervareBuilder setMancareInclusa(boolean mancareInclusa) {
        this.rezervare.setMancareInclusa(mancareInclusa);
        return this;
    }

    public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
        this.rezervare.setScaunErgonomic(scaunErgonomic);
        return this;
    }

    public RezervareBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.rezervare.setMuzicaAmbientalaPersonalizata(muzicaAmbientalaPersonalizata);
        return this;
    }

    public RezervareBuilder setBauturaRacoritoareInclusa(boolean bauturaRacoritoareInclusa) {
        this.rezervare.setBauturaRacoritoareInclusa(bauturaRacoritoareInclusa);
        return this;
    }

    public RezervareBuilder setGenMuzica(boolean genMuzica) {
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }
    @Override
    public Rezervare build() {
        return rezervare;
    }
}
