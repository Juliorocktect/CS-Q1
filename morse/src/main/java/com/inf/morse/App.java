package com.inf.morse;

import com.inf.morse.include.BinaryTree;
import com.inf.morse.übung.Jarek;

import com.inf.morse.Karte.Karte;
import com.inf.morse.Schule.Schule;
import com.inf.morse.dalton.domino.IOManager;
import com.inf.morse.übung.Moritz;

public class App
{
    public static void main( String[] args )
    {
        Karte karte = new Karte();
        karte.findeWeg("menden","hangelar");
        Schule schule = new Schule();
        schule.ausgabeAllerKnoten();
        schule.ausgabeAllerWege();
        schule.ausgabeEntfernung("Treppenhaus","Treppenhaus2");
    }
}
