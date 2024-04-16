package ex1.clase;

public class FabricaSupaVita extends FabricaSupe{
    @Override
    public Supa getSupa() {
        return new SupaDeVita();
    }

    @Override
    public void pregatireSupa() {
        System.out.println("Se pregateste supa de vita");
    }
}
