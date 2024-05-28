package ex13.State.clase;

public class ArePINIntrodus implements Stare {
    protected ArePINIntrodus() {
    }

    @Override
    public void setStare(Bancomat bancomat) {
        bancomat.setStare(this);
    }
}
