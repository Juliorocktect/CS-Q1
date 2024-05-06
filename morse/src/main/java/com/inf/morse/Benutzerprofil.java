package com.inf.morse;
import com.inf.morse.include.*;

public class Benutzerprofil implements ComparableContent<Benutzerprofil>{
    private String name;
    private int password;

    public String getName() {
        return name;
    }
    public int getPassword() {
        return password;
    }
    Benutzerprofil(String pName,int pPassword){
        name = pName;
        password = pPassword;
    }
    public boolean isLess(Benutzerprofil pBenutzerprofil){
        return name.compareTo(pBenutzerprofil.getName()) < 0;
    }
    public boolean isGreater(Benutzerprofil pBenutzerprofil){
        return name.compareTo(pBenutzerprofil.getName()) > 0;
    }
    public boolean isEqual(Benutzerprofil pBenutzerprofil)
    {
        return name.compareTo(pBenutzerprofil.getName()) == 0;
    }
    public void setPassword(int password) {
        this.password = password;
    }
    public void setName(String name) {
        this.name = name;
    }

}
