package com.inf.morse;

import com.inf.morse.include.BinaryTree;
import com.inf.morse.übung.Jarek;
import com.inf.morse.dalton.domino.IOManager;
import com.inf.morse.übung.Moritz;

public class App
{
    public static void main( String[] args )
    {
        /*
        BinaryTree<Integer> b1 = new BinaryTree<>(2);
        BinaryTree<Integer> b2 = new BinaryTree<>(6);
        BinaryTree<Integer> b3 = new BinaryTree<>(2,b2,b1);
        BinaryTree<Integer> b4 = new BinaryTree<>(5);
        BinaryTree<Integer> b5 = new BinaryTree<>(3,b4,b3);
        BinaryTree<Integer> b6 = new BinaryTree<>(15);
        BinaryTree<Integer> b7 = new BinaryTree<>(4,b5,b6);
        IOManager manager = new IOManager();
        System.out.println(manager.erstelleSpeicherZeichenkette(b7));
        */
        Jarek jarek = new Jarek();
        System.out.println(jarek.maximum());
        System.out.println(jarek.maximumKeinSuchbaum());
        System.out.println((boolean) ('b' < 'c'));
        Moritz motiz = new Moritz();
        motiz.preorder();
        System.out.println("\n");
        motiz.inorder();
        System.out.println("\n");
        motiz.postorder();
        System.out.println("\n");
        motiz.inorderNichtRekursiv();
    }
}
