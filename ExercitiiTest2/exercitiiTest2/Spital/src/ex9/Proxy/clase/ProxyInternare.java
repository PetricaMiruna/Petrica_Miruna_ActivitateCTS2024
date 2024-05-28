package ex9.Proxy.clase;

public class ProxyInternare implements IInternare{
    private Internare internare;

    public ProxyInternare(Internare internare) {
        this.internare = internare;
    }
    public ProxyInternare(Persoana persoana) {
        this.internare = new Internare(persoana);
    }

    @Override
    public void internare() {
        if(internare.getPersoana().isAreAsigurare()){
            System.out.println("Persoana "+ internare.getPersoana().getNume()+" va fi internata deoarece are asigurare");

        }
        else{
            System.out.println("Persoana "+ internare.getPersoana().getNume()+" nu va fi internata deoarece nu are asigurare de sanatate");
        }
    }
}
