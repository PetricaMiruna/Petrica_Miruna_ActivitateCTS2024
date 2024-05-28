package ex14.Template.clase;

public abstract class Template {
    public abstract void curataMasa();
    public abstract void aseazaServetelele();
    public abstract void aseazaTacamuri();
    public abstract void invitaPersoane(Persoana persoana);

    public final void ocupaMasa( Persoana persoana){
        curataMasa();
        aseazaServetelele();
        aseazaTacamuri();
        invitaPersoane(persoana);
    }
}
