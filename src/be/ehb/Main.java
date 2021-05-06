package be.ehb;

import be.ehb.vormen.Driehoek;
import be.ehb.vormen.GekleurdeVormDecorator;
import be.ehb.vormen.Vierkant;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Driehoek mDriehoek = new Driehoek();
        mDriehoek.teken();
        GekleurdeVormDecorator mGekleurdeDriehoek = new GekleurdeVormDecorator(mDriehoek);
        mGekleurdeDriehoek.teken();

        GekleurdeVormDecorator mGekleurdVierkant = new GekleurdeVormDecorator(new Vierkant());
        mGekleurdVierkant.setBackground("geel");
        mGekleurdVierkant.teken();


    }
}
