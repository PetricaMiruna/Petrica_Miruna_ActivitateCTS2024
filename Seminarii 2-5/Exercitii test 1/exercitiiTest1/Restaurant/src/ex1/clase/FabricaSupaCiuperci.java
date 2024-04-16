package ex1.clase;

public class FabricaSupaCiuperci extends FabricaSupe{
    @Override
    public Supa getSupa() {
        return new SupaDeCiuperci();
    }
    @Override
    public void pregatireSupa(){
        System.out.println("Se pregateste supa de ciuperci");
    }
}
