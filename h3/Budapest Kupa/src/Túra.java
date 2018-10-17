/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Túra {
    
    public int év;
    public int hónap;
    public int nap;
    public String név;
    public int[] táv;

    public Túra(int év, int hónap, int nap, String név, int[] táv) {
        this.év = év;
        this.hónap = hónap;
        this.nap = nap;
        this.név = név;
        this.táv = táv;
    }

    public int getÉv() {
        return év;
    }

    public void setÉv(int év) {
        this.év = év;
    }

    public int getHónap() {
        return hónap;
    }

    public void setHónap(int hónap) {
        this.hónap = hónap;
    }

    public int getNap() {
        return nap;
    }

    public void setNap(int nap) {
        this.nap = nap;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int[] getTáv() {
        return táv;
    }

    public void setTáv(int[] táv) {
        this.táv = táv;
    }
    

    @Override
    public String toString() {
        return év + " " + hónap + " " + nap + " " + név + " " + táv;
    }
    

   
    
    
    
}
