package be.ehb.vormen;

//abstracte decorator, die kan uitgebreid
public abstract class VormDecorator implements Vorm{
    protected Vorm decoratedVorm;

    public VormDecorator(Vorm decoratedVorm) {
        this.decoratedVorm = decoratedVorm;
    }

    //verplicht dat de vorm sowieso deze methode gebruikt
    @Override
    public void teken() {
        decoratedVorm.teken();
    }
}
