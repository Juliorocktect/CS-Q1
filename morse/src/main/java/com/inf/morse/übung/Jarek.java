package com.inf.morse.übung;

import com.inf.morse.include.BinarySearchTree;
import com.inf.morse.include.BinaryTree;
import com.inf.morse.übung.Number;

public class Jarek implements Juli{

    private BinarySearchTree<Number> suchbaum;

    private BinaryTree<Integer> keinSuchbaum;
    public Jarek(){
        suchbaum = new BinarySearchTree<Number>();
        suchbaum.insert(new Number(12));
        suchbaum.insert(new Number(654));
        suchbaum.insert(new Number(34653));
        suchbaum.insert(new Number(55));
        suchbaum.insert(new Number(1543));
        suchbaum.insert(new Number(15444));
        suchbaum.insert(new Number(525));
        BinaryTree<Integer> bt1 = new BinaryTree<>(12,new BinaryTree<>(3424),new BinaryTree<>(5454));
        BinaryTree<Integer> bt2 = new BinaryTree<>(34,new BinaryTree<>(45674),new BinaryTree<>(854));
        keinSuchbaum = new BinaryTree<>(44,bt1,bt2);
    }

    private int maximum(BinarySearchTree<Number> pTree){
         if (!pTree.isEmpty() && pTree.getRightTree().isEmpty()){
            return (int) pTree.getContent().number;
        }else{
            return maximum(pTree.getRightTree());
        }
    }
    public int maximum(){
        return maximum(suchbaum);
    }

    private int wasTueIch(BinaryTree<Integer> pTree,int pInt){
        if (!pTree.isEmpty()){
            if (pTree.getContent() > pInt){
                pInt = pTree.getContent();    
            }
            int l = wasTueIch(pTree.getLeftTree(), pInt);
            int r = wasTueIch(pTree.getRightTree(), pInt);
            if (l < r && r > pInt){
                pInt = r;
            }else if (l > pInt) {
                pInt = l;
            }
        }
        return pInt;
    }
    private void printTree(BinaryTree<Integer> pTree,int tiefe){
        if(pTree.isEmpty())
            return;
        for (int i = 0;i < tiefe; i++){
            System.out.println("-");
        }
        System.out.println(pTree.getContent()+ "\n");
        printTree(pTree.getLeftTree(), tiefe+1);
        printTree(pTree.getRightTree(), tiefe+1);
    }
    public void ausgabeKeinSuchbaum(){
        printTree(keinSuchbaum, 0);
    }
    public void ausgabeSuchbaum(){
        printBinarySearchTree(suchbaum,0);
    }
    private void printBinarySearchTree(BinarySearchTree<Number> pTree,int tiefe){
        if(pTree.isEmpty())
        return;
    for (int i = 0;i < tiefe; i++){
        System.out.println("-");
    }
    System.out.println(pTree.getContent().number);
    printBinarySearchTree(pTree.getLeftTree(), tiefe+1);
    printBinarySearchTree(pTree.getRightTree(), tiefe+1);
    }
    public int maximumKeinSuchbaum(){
        return maximumKeinSuchbaum(keinSuchbaum,Integer.MIN_VALUE);
    }    
    public void ausgeben(){
        System.out.println("Hallo");
    }

}
