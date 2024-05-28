package ex13.State.main;

import ex13.State.clase.Bancomat;

public class Main {
    public static void main(String[] args) {

        Bancomat bancomat= new Bancomat(500);

        bancomat.introduCard();
        bancomat.extrageBani(100);
        bancomat.introduPIN();
        bancomat.extrageBani(300);
        bancomat.introduPIN();
        bancomat.extrageBani(300);

    }
}
