package ex2.clase;

import ex1.clase.MijlocTransport;

import java.util.HashMap;
import java.util.Map;

public class Autobuz implements MijlocDeTransport {

    private Map<Integer, String> listaSoferi = new HashMap<>();
    private int numarAutobuz;

    public Autobuz() {
    }
    public Autobuz(Map<Integer, String> listaSoferi, int numarAutobuz) {
        this.listaSoferi = listaSoferi;
        this.numarAutobuz = numarAutobuz;
    }

    public Map<Integer, String> getListaSoferi() {
        return listaSoferi;
    }

    public void setListaSoferi(Map<Integer, String> listaSoferi) {
        this.listaSoferi = new HashMap<>();
        for(Integer id:listaSoferi.keySet()){
            this.listaSoferi.put(id, listaSoferi.get(id));
        }
    }

    public int getNumarAutobuz() {
        return numarAutobuz;
    }

    public void setNumarAutobuz(int numarAutobuz) {
        this.numarAutobuz = numarAutobuz;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("listaSoferi=").append(listaSoferi);
        sb.append(", numarAutobuz=").append(numarAutobuz);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public MijlocDeTransport clone() {
        Autobuz autobuz= new Autobuz();
        autobuz.setListaSoferi(this.listaSoferi);
        autobuz.setNumarAutobuz(this.numarAutobuz);
        return autobuz;
    }
}
