package ex8.Composite.clase;

public class Subsectiune implements Item {
    private String nume;

    public Subsectiune(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaItem(Item item) throws Exception {
        throw new Exception("Nu este implementata");
    }

    @Override
    public void stergeItem(Item item) throws Exception {

        throw new Exception("Nu este implementata");
    }

    @Override
    public Item getItem(int index) throws Exception {
        throw new Exception("Nu este implementata");
    }

    @Override
    public void afiseazaItem() {

        System.out.println("Subsectiune: "+ nume);
    }
}
