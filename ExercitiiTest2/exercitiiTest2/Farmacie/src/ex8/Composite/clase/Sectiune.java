package ex8.Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Item {
    private List<Item> items;
    private String nume;

    public Sectiune(String nume) {
        this.nume = nume;
        this.items= new ArrayList<>();
    }

    @Override
    public void adaugaItem(Item item) {
        items.add(item);
    }

    @Override
    public void stergeItem(Item item) {

        items.remove(item);
    }

    @Override
    public Item getItem(int index) {
        return items.get(index);
    }

    @Override
    public void afiseazaItem() {

        System.out.println("Categoria "+ nume);
        for(Item item:items){
            item.afiseazaItem();
        }
    }
}
