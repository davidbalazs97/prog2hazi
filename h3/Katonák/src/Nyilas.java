/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Nyilas extends Katona {
    
    private int lotav;

    public int getLotav() {
        return lotav;
    }

    public void setLotav(int lotav) {
        this.lotav = lotav;
    }
    
   public int getTamadoEro()
   {
       return super.getTamadoEro()+lotav;
   }
   
   public Nyilas(int tamadoEro, int vedekezoEro, int lotav)
   {
       super(tamadoEro,vedekezoEro);
       this.lotav=lotav;
   }

    @Override
    public String toString() {
        return " NYilas TE: " + this.getTamadoEro() + " Nyilas VE: " + super.getVedoEro();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.lotav;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj==null || !(obj instanceof Nyilas))
           return false;
       
       Nyilas ny = (Nyilas)obj;
       
       return (this.getTamadoEro()+this.lotav)==ny.getTamadoEro();
        
    }
   
   
   
   
    
}
