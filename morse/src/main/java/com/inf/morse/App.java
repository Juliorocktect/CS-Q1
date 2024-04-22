package com.inf.morse;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Morsecodebaum baum = new Morsecodebaum();
        String str = baum.morseCodeDecodieren("..-. ");
        //System.out.println(str);
        //baum.preOrderPrint();
        System.out.println(baum.erzeugeMorsecode('H'));
    }
}
