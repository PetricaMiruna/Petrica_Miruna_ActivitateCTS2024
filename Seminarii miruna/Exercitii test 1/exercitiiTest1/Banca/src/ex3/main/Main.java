package ex3.main;

import ex3.clase.Cont;
import ex3.clase.ContBuilder;

public class Main {
    public static void main(String[] args) {

        Cont cont= new ContBuilder()
                .setContDeSalariu(true)
                .setCardAtasat(false)
                .setInternetBanking(false)
                .build();
        System.out.println(cont.toString());


    }
}
