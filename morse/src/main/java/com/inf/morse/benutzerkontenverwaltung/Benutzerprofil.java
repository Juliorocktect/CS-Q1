package com.inf.morse.benutzerkontenverwaltung;

public class Benutzerprofil implements ComparableContent<Benutzerprofil>{
  
    private String name;
    private int pw;
  
    public Benutzerprofil(String name, int pw){
        this.name = name; 
        this.pw = pw; 
    }
    
    public boolean isLess(Benutzerprofil benutzerprofil){
        return this.getName().compareTo(benutzerprofil.getName()) < 0; 
    }  
    
    public boolean isEqual(Benutzerprofil benutzerprofil){
        return this.getName().equals(benutzerprofil.getName());
    }
    
    public boolean isGreater(Benutzerprofil benutzerprofil){
        return this.getName().compareTo(benutzerprofil.getName()) > 0; 
    }
    
    public int getPw(){
        return pw;
    }
    
    public String getName(){
        return name;
    }
    
    public void setPw(int pw){
        this.pw = pw;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
}
