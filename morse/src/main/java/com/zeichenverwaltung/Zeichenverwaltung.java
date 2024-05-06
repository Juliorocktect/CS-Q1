package com.zeichenverwaltung;

import com.inf.morse.include.BinarySearchTree;

public class Zeichenverwaltung {

    private BinarySearchTree<Zeichen> zeichenBaum;

    public Zeichenverwaltung(){
        zeichenBaum = new BinarySearchTree<Zeichen>();
    }

    public void leseText(String text){
        char akt;
        Zeichen z; 
        for (int i = 0; i<text.length(); i++){
            akt = text.charAt(i);
            z = zeichenBaum.search(new Zeichen(akt)); 
            if (z!= null)
                z.incAnzahl();
            else 
                zeichenBaum.insert(new Zeichen(akt));
        }
    }
    
}
