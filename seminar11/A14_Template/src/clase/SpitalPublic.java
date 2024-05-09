package clase;

public class SpitalPublic extends Template {
    private String numeSpital;
    private int nrPaturiLibere;

    public SpitalPublic(String numeSpital, int nrPaturiLibere) {
        this.numeSpital = numeSpital;
        this.nrPaturiLibere = nrPaturiLibere;
    }

    @Override
    protected void analizaSanatate(Pacient pacient) {

        pacient.setStareSanatate((pacient.getNume().length())%5 +1);
        System.out.println("Pacientul "+ pacient.getNume()+" are starea "+ pacient.getStareSanatate());
    }

    @Override
    protected int disponibilitatePaturi() {
        return nrPaturiLibere;
    }

    @Override
    protected void emitereFisa(Pacient pacient) {

        System.out.println("Pacientul "+ pacient.getNume()+ " este internat in spitalul "+ numeSpital);
        nrPaturiLibere--;

    }

    @Override
    protected void refuzaInternare(Pacient pacient) {
        System.out.println("Pacientul "+pacient.getNume()+" este trimis in alt spital, deoarece in spitalul "+numeSpital+ " nu avem locuri");

    }
}
