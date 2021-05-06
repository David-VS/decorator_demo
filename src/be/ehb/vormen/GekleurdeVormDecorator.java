package be.ehb.vormen;

public class GekleurdeVormDecorator extends VormDecorator {

    private String kleur;

    public GekleurdeVormDecorator(Vorm decoratedVorm) {
        super(decoratedVorm);
        setBackground("blauw");
    }

    @Override
    public void teken() {
        decoratedVorm.teken();
        System.out.println("kleur is " + kleur);
    }

    public void setBackground(String kleur){
        this.kleur = kleur;
        System.out.println("kleur is " + kleur);
    }
}
