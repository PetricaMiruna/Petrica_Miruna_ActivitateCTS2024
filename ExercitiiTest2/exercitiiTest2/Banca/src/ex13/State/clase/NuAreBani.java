package ex13.State.clase;

public class NuAreBani implements Stare{
    protected NuAreBani() {
    }

    @Override
    public void setStare(Bancomat bancomat) {

        bancomat.setStare(this);
    }
}
