package com.inf.morse.zeichen;

import com.inf.morse.include.ComparableContent;

public class Buchstabe implements ComparableContent<Buchstabe>{
    public char buchstabe;
    public int anzahl;

    public Buchstabe(){anzahl = 0;}

    public Buchstabe(char pBuchstabe,int pAnzahl)
    {
        buchstabe = pBuchstabe;
        anzahl = pAnzahl;
    }

    public boolean isGreater(Buchstabe pBuchstabe){
        return buchstabe < pBuchstabe.buchstabe;
    }

    public boolean isLess(Buchstabe pBuchstabe){
        return buchstabe > pBuchstabe.buchstabe;
    }

    public boolean isEqual(Buchstabe pBuchstabe){
        return buchstabe == pBuchstabe.buchstabe;
    }    
}
