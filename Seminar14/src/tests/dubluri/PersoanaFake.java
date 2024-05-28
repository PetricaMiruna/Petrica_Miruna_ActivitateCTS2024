package tests.dubluri;

import clase.IPersoana;

public class PersoanaFake implements IPersoana {
    public String valoareGetSex;
    public int valoareGetVarsta;
    public boolean valoareCheckCNP;

    public void setValoareGetSex(String valoareGetSex) {
        this.valoareGetSex = valoareGetSex;
    }

    public void setValoareGetVarsta(int valoareGetVarsta) {
        this.valoareGetVarsta = valoareGetVarsta;
    }

    public void setValoareCheckCNP(boolean valoareCheckCNP) {
        this.valoareCheckCNP = valoareCheckCNP;
    }

    @Override
    public String getSex() {
        return valoareGetSex;
    }

    @Override
    public int getVarsta() {
        return valoareGetVarsta;
    }

    @Override
    public boolean checkCNP() {
        return valoareCheckCNP;
    }
}
