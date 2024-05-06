package com.inf.morse;

import com.inf.morse.include.BinaryTree;


public class Domino {
    private BinaryTree<Integer> bt = new BinaryTree<Integer>();

    public Domino()
    {
        BinaryTree<Integer> bt2 = new BinaryTree<>(4,new BinaryTree<>(12),new BinaryTree<>(4));
        BinaryTree<Integer> bt3 = new BinaryTree<>(4,new BinaryTree<>(3),bt2);
        BinaryTree<Integer> bt4 = new BinaryTree<>(7,new BinaryTree<>(11),bt3);
        bt.setLeftTree(bt4);
        BinaryTree<Integer> bt5 = new BinaryTree<>(4,new BinaryTree<>(4),new BinaryTree<>(12));
        BinaryTree<Integer> bt6 = new BinaryTree<>(4,bt5,new BinaryTree<>(3));
        BinaryTree<Integer> bt7 = new BinaryTree<>(7,bt6,new BinaryTree<>(11));
        bt.setRightTree(bt7);
    }

    public int ermittleAnzahlVerzweigungen(BinaryTree<Integer> tree){
        if (tree.isEmpty()){
            return 0; 
        }
        if (!tree.getLeftTree().isEmpty() && !tree.getRightTree().isEmpty()){
            return 2;
        }
        return ermittleAnzahlVerzweigungen(tree.getLeftTree()) + ermittleAnzahlVerzweigungen(tree.getRightTree());
    }

    public void aufrufen(){
        ermittleAnzahlVerzweigungen(bt);
    }

    public void aufrufenZwei(){
        anzahl(bt,0);
    }
    public void anzahl(BinaryTree<Integer> tree,int anzahl){
        if(tree.isEmpty())
            return;
        if (!tree.getLeftTree().isEmpty() && !tree.getRightTree().isEmpty())
        {
            anzahl(tree.getLeftTree(),anzahl+2);
            anzahl(tree.getRightTree(),anzahl+2);
        }else {
            anzahl(tree.getLeftTree(),anzahl);
            anzahl(tree.getRightTree(),anzahl);
        }
    }

    


}