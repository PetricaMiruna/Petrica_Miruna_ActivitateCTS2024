package ex13.State.clase;

public class NuAreCard implements Stare {
    protected NuAreCard() {
    }

    @Override
    public void setStare(Bancomat bancomat) {
        bancomat.setStare(this);
    }
}
