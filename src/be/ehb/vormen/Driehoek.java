package be.ehb.vormen;

//concrete klasse waar decorator rond kan
public class Driehoek implements Vorm {
    @Override
    public void teken() {
        System.out.println("teken driehoek");
    }
}
