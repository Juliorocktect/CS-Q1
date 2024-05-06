package com.inf.morse.benutzerkontenverwaltung;

import com.inf.morse.include.BinarySearchTree;

public class Benutzerverwaltung{
    
    private BinarySearchTree<Benutzerprofil> userbaum;

    public Benutzerverwaltung(){
        userbaum = new BinarySearchTree<>();
    }
    public Benutzerverwaltung(BinarySearchTree<Benutzerprofil> pUserbaum){
        userbaum =pUserbaum;
    }
    public void einfuegen(String pName, int pPasswort){
        Benutzerprofil neu = new Benutzerprofil(pName, pPasswort); 
        userbaum.insert(neu);
    }
    public void entfernen(String pName, int pPasswort){
        Benutzerprofil neu = new Benutzerprofil(pName, pPasswort);
        userbaum.remove(neu);
    }
    private Benutzerprofil suchen(String pName){
        Benutzerprofil dummy = new Benutzerprofil(pName, -1);
        return userbaum.search(dummy);
    }
    public int pruefen(Benutzerprofil pBenutzer,int pPasswort){
        if (suchen(pBenutzer) == null)
            return -1;
        if (suchen(pBenutzer).getPassword() == pPasswort){
            return 1;
        } else {
            return 0;
        }
    }
    
}
