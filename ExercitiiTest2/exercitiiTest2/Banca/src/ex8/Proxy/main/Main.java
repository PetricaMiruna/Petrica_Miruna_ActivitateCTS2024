package ex8.Proxy.main;

import ex8.Proxy.clase.Cont;
import ex8.Proxy.clase.Credit;
import ex8.Proxy.clase.ProxyCont;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        Credit credit= new Credit(true, 100);
        Credit credit1= new Credit(false, 102);

        System.out.println("Fara nivel intermediar:");
        Cont cont=new Cont(credit);
        Cont cont1= new Cont(credit1);
        cont.creazaCont();
        cont1.creazaCont();

        System.out.println("Cu nivel intermediar:");
        ProxyCont proxyCont= new ProxyCont(cont);
        proxyCont.creazaCont();
        ProxyCont proxyCont1= new ProxyCont(cont1);
        proxyCont1.creazaCont();
    }
}
