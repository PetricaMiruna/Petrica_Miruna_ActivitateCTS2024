package ex14.Template.main;

import ex14.Template.clase.Masa;
import ex14.Template.clase.Persoana;

public class Main {
    public static void main(String[] args) {

        Masa masa= new Masa(20);

        Persoana persoana=new Persoana("Gabriel");


        masa.ocupaMasa(persoana);




    }
}
