/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
import java.util.Arrays;

public class Varosok implements Comparable<Varosok>{
    private String nev;
    private int ho;

    public Varosok(String nev, int ho) {
        this.nev = nev;
        this.ho = ho;
    }

    public String getNev() {
        return nev;
    }

    public int getHo() {
        return ho;
    }
    
    @Override
    public int compareTo(Varosok t)
    {
        int diff=Integer.compare(this.ho, t.ho);
        
        if(diff!=0)
            return -diff;
        
        return (this.nev.compareTo(t.nev));
    }

    @Override
    public String toString() {
        return nev + " (" + ho + ")";
    }
    
    
}