package ex3.main;

import ex3.clase.Builder;
import ex3.clase.Factura;
import ex3.clase.FacturaBuilder;

public class Main {
    public static void main(String[] args) {


        Factura factura = new FacturaBuilder()
                .setCardFidelitate(true)
                .setCotaTVA(false)
                .setPlataCard(true)
                .setNrPungi(false)
                .build();

        System.out.println(factura.toString());
    }
}
