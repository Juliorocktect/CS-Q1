package com.inf.morse.benutzerkontenverwaltung;

public class Benutzerprofil implements ComparableContent<Benutzerprofil>{
    private String name; 
    private String passwort; 

    public Benutzerprofil(String name, String passwort){
        this.name = name; 
        this.passwort = passwort; 
    }
}
