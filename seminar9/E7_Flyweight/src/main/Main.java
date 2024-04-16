package main;

import clase.Caracteristici;
import clase.Fabrica;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica= new Fabrica();
        Caracteristici caracteristici1=new Caracteristici(10, 15, "albastru");
        Caracteristici caracteristici2= new Caracteristici(12, 13, "alb");
        Caracteristici caracteristici3= new Caracteristici(11, 15, "rosu");
        Caracteristici caracteristici4= new Caracteristici(10,12, "verde");

        fabrica.getSpectator(10,10).deseneaza(caracteristici1);
        fabrica.getSpectator(20,10).deseneaza(caracteristici2);
        fabrica.getSpectator(10, 10).deseneaza(caracteristici3);
        fabrica.getSpectator(20,10).deseneaza(caracteristici4);
    }
}