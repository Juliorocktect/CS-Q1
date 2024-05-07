package com.inf.morse.zeichen;

import com.inf.morse.include.BinarySearchTree;

public interface Zeichen {
    BinarySearchTree<Buchstabe> zeichenBaum = new BinarySearchTree<>();
    void leseText(String pText);
    int gibAnzahl(char pBuchstabe);
}
