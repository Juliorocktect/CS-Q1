package com.inf.morse;
import com.inf.morse.include.BinaryTree;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
public class MorsecodebaumTest{
    @Test
    void decodeCharTest(){
        Morsecodebaum m = new Morsecodebaum();
        assertTrue(m.decodeToChar("..-.").equals("F"));
    }
    @Test
    @Disabled
    void erzeugeMorseCodeTest(){
        Morsecodebaum m = new Morsecodebaum();
        assertTrue(true);
    }
    @Test
    @Disabled
    void morseCodierenTest(){
        Morsecodebaum m = new Morsecodebaum();
        assertTrue(true);
    }
}


