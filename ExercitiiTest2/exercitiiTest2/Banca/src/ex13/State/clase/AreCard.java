package ex13.State.clase;

public class AreCard implements Stare {
    protected AreCard() {
    }

    @Override
    public void setStare(Bancomat bancomat) {
        bancomat.setStare(this);
    }
}
