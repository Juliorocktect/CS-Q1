package com.inf.morse;

public class App 
{
    public static void main( String[] args )
    {
        Morsecodebaum baum = new Morsecodebaum();
        //System.out.println(str);
        //baum.preOrderPrint();
        System.out.println(baum.erzeugeMorsecode('H'));
        Domino domino = new Domino(); 
        domino.aufrufenZwei();
    }
}
