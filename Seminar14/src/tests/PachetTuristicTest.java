package tests;

import clase.PachetTuristic;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import tests.categorii.CuMock;
import tests.dubluri.PersoanaFake;

import static org.junit.Assert.assertEquals;

public class PachetTuristicTest {

    @Category(CuMock.class)
    @Test
    public void valoareAplicaDiscountFake(){
        PersoanaFake client= new PersoanaFake();
        PachetTuristic pachetTuristic= new PachetTuristic(client, "Bucuresti", 30.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(27, pachetTuristic.getPret(), 0.01);
    }

    @Category(CuMock.class)
    @Test
    public void valoareNuAplicaDisountFake(){
        PersoanaFake client= new PersoanaFake();
        PachetTuristic pachetTuristic= new PachetTuristic(client, "Bucuresti", 30.0);
        client.setValoareGetVarsta(25);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(30, pachetTuristic.getPret(), 0.01);
    }

    @Category(CuMock.class)
    @Test
    public void aplicaDiscount100(){
        PersoanaFake client= new PersoanaFake();
        PachetTuristic pachetTuristic= new PachetTuristic(client, "Bucuresti", 30.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(100);
        assertEquals(0.0, pachetTuristic.getPret(), 0.01);
    }
}
