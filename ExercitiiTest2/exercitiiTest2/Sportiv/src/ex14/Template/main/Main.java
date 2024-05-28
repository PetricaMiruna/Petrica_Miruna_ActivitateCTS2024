package ex14.Template.main;

import ex14.Template.clase.Persoana;
import ex14.Template.clase.Stadion;

public class Main {
    public static void main(String[] args) {

        Persoana persoana= new Persoana("Dan", 23);
        Persoana persoana1= new Persoana("Alisa", 14);

        Stadion stadion= new Stadion("Giulesti", 18);

        persoana.ocupaLoc(stadion);
        persoana1.ocupaLoc(stadion);
    }
}