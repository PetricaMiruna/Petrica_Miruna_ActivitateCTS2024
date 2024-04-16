package ex3.clase;

public class AutobuzBuilder implements IBuilder {

    AutobuzLinie autobuzLinie;
    public AutobuzBuilder() {
        autobuzLinie= new AutobuzLinie(false,false);
    }
    public AutobuzBuilder setSofer(String sofer){
        autobuzLinie.setSofer(sofer);
        return this;
    }

    public AutobuzBuilder setOpriri(boolean areOpriri){
        autobuzLinie.setAreOpriri(areOpriri);
        return this;
    }

    public AutobuzBuilder setDeschide(boolean deschide){
        autobuzLinie.setDeschideUsile(deschide);
        return this;
    }

    public AutobuzBuilder setText(String text){
        autobuzLinie.setText(text);
        return this;
    }
    @Override
    public AutobuzLinie build() {
        return autobuzLinie;
    }
}
