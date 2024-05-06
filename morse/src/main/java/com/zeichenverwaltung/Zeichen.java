package com.zeichenverwaltung;
import com.inf.morse.include.*;

public class Zeichen implements ComparableContent<Zeichen>{
    private char zeichen; 
    private int anzahl; 

    public Zeichen(char pZeichen){
        this.zeichen = pZeichen; 
        anzahl = 1; 
    }

    public char getZeichen(){return this.zeichen;}
    public int getAnzahl(){return this.anzahl;}
    public void incAnzahl(){anzahl++;}
    public boolean isGreater(Zeichen pZeichen){return zeichen > pZeichen.getZeichen();}
    public boolean isLess(Zeichen pZeichen){return zeichen < pZeichen.getZeichen();}
    public boolean isEqual(Zeichen pZeichen){return zeichen == pZeichen.getZeichen();}
}
