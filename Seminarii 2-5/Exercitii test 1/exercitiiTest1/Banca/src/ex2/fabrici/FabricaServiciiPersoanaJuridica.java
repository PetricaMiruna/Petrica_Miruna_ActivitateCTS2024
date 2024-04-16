package ex2.fabrici;

import ex2.clase.Serviciu;
import ex2.clase.ServiciuPersoanaJuridica;

public class FabricaServiciiPersoanaJuridica implements FabricaServicii{
    @Override
    public Serviciu getServiciu(String data, String denumire) {
        return new ServiciuPersoanaJuridica(data, denumire);
    }
}
