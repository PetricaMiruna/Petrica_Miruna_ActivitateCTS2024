package ex11.Strategy.clase;

public class Cash implements ModPlata{
    @Override
    public void plateste(double sumaPlata) {
        System.out.println("Plata in valoare de "+sumaPlata+" RON a fost efectuata CASH");

    }
}
