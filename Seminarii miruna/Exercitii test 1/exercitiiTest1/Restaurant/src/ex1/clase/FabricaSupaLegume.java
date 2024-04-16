package ex1.clase;

public class FabricaSupaLegume extends FabricaSupe{
    @Override
    public Supa getSupa() {
        return new SupaDeLegume();
    }

    @Override
    public void pregatireSupa() {
        System.out.println("Se pregateste supa de legume");
    }
}
