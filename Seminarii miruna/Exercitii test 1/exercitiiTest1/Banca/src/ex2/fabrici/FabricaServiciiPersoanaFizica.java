package ex2.fabrici;

import ex2.clase.Serviciu;
import ex2.clase.ServiciuPersoanaFizica;

public class FabricaServiciiPersoanaFizica implements FabricaServicii {

    @Override
    public Serviciu getServiciu(String data, String denumire) {
        return new ServiciuPersoanaFizica(data, denumire);
    }


}
