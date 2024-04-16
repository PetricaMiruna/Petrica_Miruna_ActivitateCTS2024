package ex1.main;

import ex1.clase.FabricaSupaCiuperci;
import ex1.clase.FabricaSupaLegume;
import ex1.clase.FabricaSupe;
import ex1.clase.Supa;

public class Main {
    public static void main(String[] args) {
        FabricaSupe fabricaSupe=new FabricaSupaLegume();
        Supa supa=fabricaSupe.getSupa();
        fabricaSupe.pregatireSupa();

        System.out.println(supa.getClass().getSimpleName());
    }
}