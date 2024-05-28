package ex11.Strategy.clase;

public class Card implements ModPlata {
    @Override
    public void plateste(double sumaPlata) {
        System.out.println("Plata in valoare de "+sumaPlata+" RON a fost efectuata cu cardul");
    }
}
