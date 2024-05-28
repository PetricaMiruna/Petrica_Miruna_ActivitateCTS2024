package ex13.State.main;

import ex13.State.clase.Masa;

public class Main {
    public static void main(String[] args) {

        Masa masa1= new Masa(12);
        masa1.rezervaMasa();
        masa1.ocupaMasa();
        masa1.elibereazaMasa();

        Masa masa2= new Masa(15);
        masa2.elibereazaMasa();
        masa2.ocupaMasa();
        masa2.rezervaMasa();

        Masa masa3= new Masa(17);
        masa3.ocupaMasa();
        masa3.elibereazaMasa();
        masa3.rezervaMasa();
    }
}
