package com.inf.morse;

import com.inf.morse.include.BinarySearchTree;

public class Benutzerverwaltung{
    
    private BinarySearchTree<Benutzerprofil> userbaum;

    public Benutzerverwaltung(){
        userbaum = new BinarySearchTree<>();
    }
    public Benutzerverwaltung(BinarySearchTree<Benutzerprofil> pUserbaum){
        userbaum =pUserbaum;
    }
    public void einfuegen(Benutzerprofil pBenutzer){
        userbaum.insert(pBenutzer);
    }
    public void entfernen(Benutzerprofil pBenutzerprofil){
        userbaum.remove(pBenutzerprofil);
    }
    private Benutzerprofil suchen(Benutzerprofil pBenutzer){
        return userbaum.search(pBenutzer);
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
    public int updatePasswort(Benutzerprofil pBenutzerprofil,int pAltePin,int pNeuePin)
    {
        if (suchen(pBenutzerprofil) == null)
            return -1;
        if (pruefen(pBenutzerprofil, pAltePin) == 1)
        {
            suchen(pBenutzerprofil).setPassword(pNeuePin);
            return 1;
        }
        return 0;
    }
    
}
