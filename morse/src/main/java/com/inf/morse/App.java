package com.inf.morse;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Morsecodebaum baum = new Morsecodebaum();
        String str = baum.morseCodeDecodieren("..- -. --.. -. ");
        System.out.println(str);
    }
}
