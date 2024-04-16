package ex2.main;

import ex2.clase.Serviciu;
import ex2.fabrici.FabricaServicii;
import ex2.fabrici.FabricaServiciiPersoanaFizica;
import ex2.fabrici.FabricaServiciiPersoanaJuridica;

public class Main {

    public static void prelucrareServicii( FabricaServicii fabricaServicii, String data, String denumire){
        Serviciu serviciu= fabricaServicii.getServiciu(data, denumire);
        serviciu.afisareDetalii();
    }
    public static void main(String[] args) {

        FabricaServicii fabricaServicii= new FabricaServiciiPersoanaFizica();
        Serviciu serviciuPersFizica=fabricaServicii.getServiciu("11.02.2024", "serviciu pers. fiz.");

        FabricaServicii fabricaServicii1= new FabricaServiciiPersoanaJuridica();
        Serviciu serviciuPersJuridica=fabricaServicii1.getServiciu("25.02.2024", "serviciu pers. juridica");

        serviciuPersFizica.afisareDetalii();
        System.out.println(serviciuPersFizica.toString());
        serviciuPersJuridica.afisareDetalii();
        System.out.println(serviciuPersJuridica.toString());


        prelucrareServicii(new FabricaServiciiPersoanaFizica(), "20.01.2024", "serviciu persoana fizica");
    }
}
