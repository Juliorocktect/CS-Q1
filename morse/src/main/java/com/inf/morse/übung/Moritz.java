package com.inf.morse.übung;

import com.inf.morse.include.BinaryTree;
import com.inf.morse.include.Stack;

public class Moritz {
    private BinaryTree<Integer> bt;

    public Moritz() {
        BinaryTree<Integer> bt1 = new BinaryTree<>(4,new BinaryTree<>(7),new BinaryTree<>(11));
        BinaryTree<Integer> bt2 = new BinaryTree<>(8,new BinaryTree<>(9),new BinaryTree<>(0));
        bt = new BinaryTree<>(2,bt1,bt2);
    }

    //WLR
    //LWR
    //LRW

    public void preorder(){
        preorder(bt);
    }

    private void preorder(BinaryTree<Integer> pTree) {
        if (!pTree.isEmpty()) {
            System.out.print(pTree.getContent()+ "\t");
            preorder(pTree.getLeftTree());
            preorder(pTree.getRightTree());
        }
    }
    public void inorder(){
        inorder(bt);
    }
    private void inorder(BinaryTree<Integer> pTree) {
        if (!pTree.isEmpty()) {
            inorder(pTree.getLeftTree());
            System.out.print(pTree.getContent() + "\t");
            inorder(pTree.getRightTree());
        }
    }
    public void postorder(){
        postorder(bt);
    }
    private void postorder(BinaryTree<Integer> pTree) {
        if (!pTree.isEmpty()) {
            postorder(pTree.getLeftTree());
            postorder(pTree.getRightTree());
            System.out.print(pTree.getContent() + "\t");
        }
    }
    public void inorderNichtRekursiv(){
        wasTueIch(bt);
    }

    private void wasTueIch(BinaryTree<Integer> b){
        Stack<BinaryTree<Integer>> stapel = new Stack<BinaryTree<Integer>>();
        int i = 0;
        while (!stapel.isEmpty() || !b.isEmpty()){
            if(!b.isEmpty()){
                stapel.push(b);
                b = b.getLeftTree();
            }
            else{
                b = stapel.top();
                stapel.pop();
                System.out.println(b.getContent());
                i++;
                b = b.getRightTree();
            }
        }
        i--;
    }


}
