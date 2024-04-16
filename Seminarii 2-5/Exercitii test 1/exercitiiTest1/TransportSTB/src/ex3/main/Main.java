package ex3.main;

import ex3.clase.AutobuzBuilder;
import ex3.clase.AutobuzLinie;

public class Main {
    public static void main(String[] args) {
//
//        AutobuzLinie autobuzLinie= AutobuzLinie.getInstanta();
//        System.out.println(autobuzLinie.getClass().getSimpleName());
//        AutobuzLinie autobuzLinie1=AutobuzLinie.getInstanta();
//        System.out.println(autobuzLinie == autobuzLinie1);

        AutobuzLinie autobuzLinie= new AutobuzBuilder()
                .setSofer("Dan")
                .setText("Piata Victoriei")
                .build();


        System.out.println(autobuzLinie.toString());


    }
}
