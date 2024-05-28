package ex9.Proxy.main;


import ex9.Proxy.clase.Internare;
import ex9.Proxy.clase.Persoana;
import ex9.Proxy.clase.ProxyInternare;

public class Main {
    public static void main(String[] args) {

        Persoana persoana= new Persoana("Alina", true);
        Persoana persoana1= new Persoana("Gabriel", false);

        System.out.println("Fara nivel intermediar:");
        Internare internare= new Internare(persoana);
        internare.internare();
        Internare internare1= new Internare(persoana1);
        internare1.internare();

        System.out.println("Cu nivel intermediar:");
        ProxyInternare proxyInternare= new ProxyInternare(internare);
        proxyInternare.internare();
        ProxyInternare proxyInternare1= new ProxyInternare(internare1);
        proxyInternare1.internare();;
    }
}
