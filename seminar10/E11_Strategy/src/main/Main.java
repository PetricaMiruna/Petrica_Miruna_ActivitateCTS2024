package main;

import clase.*;

public class Main {
    public static void main(String[] args) {

        Portar portar= new Portar();
        String suporter1="Gigel VIP";
        String suporter2="Gigel Peluza";
        String suporter3="Gigel Tribuna";


        portar.setStrategie(new VerificatorVIP());
        portar.verificaSuporter(suporter1);

        portar.setStrategie(new VerificatorPeluza());
        portar.verificaSuporter(suporter2);

        portar.setStrategie(new VerificatorTribuna());
        portar.verificaSuporter(suporter3);
    }
}