package ex1.clase;

public abstract class FabricaSupe {
    public abstract Supa getSupa();

    public void pregatireSupa(){
        System.out.println("Se pregateste supa");
    }

    //daca e abstracta trebuie implementa in clasele derivate
    //daca nu e abstracta poti/nu sa o implenetzi
}
