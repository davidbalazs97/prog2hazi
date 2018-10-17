/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Katona {
    
    private int tamadoEro;
    private int vedoEro;

    public Katona(int tamadoEro, int vedoEro) {
        this.tamadoEro = tamadoEro;
        this.vedoEro = vedoEro;
    }
    
    public Katona()
    {
        this.tamadoEro=5;
        this.vedoEro =5;
    }

    public int getTamadoEro() {
        return tamadoEro;
    }

    public int getVedoEro() {
        return vedoEro;
    }

    public void setTamadoEro(int tamadoEro) {
        this.tamadoEro = tamadoEro;
    }

    public void setVedoEro(int vedoEro) {
        this.vedoEro = vedoEro;
    }

    @Override
    public String toString() {
        return "VE:" + vedoEro + " TE" + tamadoEro;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.tamadoEro;
        hash = 97 * hash + this.vedoEro;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Katona))
            return false;
        
        Katona k =(Katona)obj;
        
        return this.tamadoEro==k.tamadoEro && this.vedoEro==k.vedoEro;
        
    }
    
    
    
    
    
}
