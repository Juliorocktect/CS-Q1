package com.inf.morse.zeichen;

import com.inf.morse.include.BinarySearchTree;
import com.inf.morse.zeichen.Zeichen;

public class Zeichenvwerwaltung implements Zeichen {
    private BinarySearchTree<Buchstabe> zeichenBaum;

    public Zeichenvwerwaltung(){
        zeichenBaum = new BinarySearchTree<>();
    }
    public void leseText(String pText){
        for (int i = 0;i < pText.length();i++){
            Buchstabe buchstabe = zeichenBaum.search(new Buchstabe(pText.charAt(i),0));
            if (buchstabe == null){
                zeichenBaum.insert(new Buchstabe(pText.charAt(i),0));
            }else {
                buchstabe.anzahl++;
            }
        }
    }

    public int gibAnzahl(char pBuchstabe)
    {
        Buchstabe b = zeichenBaum.search(new Buchstabe(pBuchstabe,0));
        if (b == null)
            return -1;
        return b.anzahl;
    }

}
