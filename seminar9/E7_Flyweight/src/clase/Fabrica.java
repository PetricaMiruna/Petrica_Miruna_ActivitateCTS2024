package clase;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {

    private Map <String,Flyweight> spectatori;

    public Fabrica() {
        this.spectatori=new HashMap<String, Flyweight>();
    }

    public Flyweight getSpectator(int latime, int inaltime) {
        String cheie = " "+inaltime +" "+ latime;
        Flyweight flyweight= spectatori.get(cheie);
        if(flyweight==null) {
            flyweight= new Spectator(inaltime, latime);
            spectatori.put(cheie, flyweight);
        }
        return flyweight;

    }
}
