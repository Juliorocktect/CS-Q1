package com.inf.morse.übung;

import com.inf.morse.include.ComparableContent;

public class Number implements ComparableContent<Number> {

    public Integer number;
    public Number(int pInt){
        number = pInt;
    }
    public Number(Integer pInteger){
        number= pInteger;
    }

    public boolean isLess(Number pNumber){
        return number < pNumber.number;
    }
    public boolean isGreater(Number pNumber){
        return number > pNumber.number;
    }
    public boolean isEqual(Number pNumber)
    {
        return number == pNumber.number;
    }
}