package com.inf.morse.dalton.domino;

import com.inf.morse.include.BinaryTree;
import com.inf.morse.include.Stack;

public class IOManager {

    public String erstelleSpeicherZeichenkette(BinaryTree<Integer> pFigur){
        String ergebnis = "";
        Stack<BinaryTree<Integer>> speicher = new Stack<>();
        speicher.push(pFigur);
        while(!speicher.isEmpty())
        {
            BinaryTree<Integer> aktuell = null;
            aktuell = speicher.top();
            speicher.pop();
            ergebnis += aktuell.getContent() + ",";
            if (!aktuell.getLeftTree().isEmpty() && !aktuell.getRightTree().isEmpty()){
                speicher.push(aktuell.getRightTree());
                speicher.push(aktuell.getLeftTree());

            }else{
                ergebnis += "#, ";
            }
            System.out.println(aktuell.getContent() + "," + ergebnis);
        }
        return ergebnis;
    }
}