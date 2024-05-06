package com.inf.morse.benutzerkontenverwaltung;

public interface ComparableContent <ContentType>{
    public boolean isEqual(ContentType content); 

    public boolean isLess(ContentType content);
    
    public boolean isGreater(ContentType content);
}