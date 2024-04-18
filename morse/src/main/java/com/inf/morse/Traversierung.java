package com.inf.morse;
import com.inf.morse.include.BinaryTree;

public interface Traversierung{
    //HA methoden
    void preOrder(BinaryTree<String> tree);
    public void postOrder(BinaryTree<String> tree);
    public void inOrder(BinaryTree<String> tree);
}