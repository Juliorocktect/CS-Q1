package com.inf.morse.übung;

import com.inf.morse.include.BinaryTree;

public class Momo {
    private BinaryTree<Integer> bt;

    public Momo(){
        BinaryTree<Integer> bt1 = new BinaryTree<>(2,new BinaryTree<>(4),new BinaryTree<>(5));
        BinaryTree<Integer> bt2 = new BinaryTree<>(2,new BinaryTree<>(13),new BinaryTree<>(12));
        bt = new BinaryTree<>(2,bt1,bt2);
    }
    
    public void zaehlen(BinaryTree<Integer> bt){

    }

}
