/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Teherautó extends Autó {
    private int maxSzállíthatóTeher;

    public Teherautó(int maxSzállíthatóTeher, String rendszám, int motorTeljesítmény) {
        super(rendszám, motorTeljesítmény);
        this.maxSzállíthatóTeher = maxSzállíthatóTeher;
    }

    public int getMaxSzállíthatóTeher() {
        return maxSzállíthatóTeher;
    }

    @Override
    public String toString() {
        return "Teheraut\u00f3{" + "maxSz\u00e1ll\u00edthat\u00f3Teher=" + maxSzállíthatóTeher + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
    if(obj==null || !(obj instanceof Teherautó))
    {
        return false;
    }
    Teherautó teh = (Teherautó)obj;
    return super.equals(teh) && this.maxSzállíthatóTeher == teh.getMaxSzállíthatóTeher();
    
    }
    
    
   
    
    
}
