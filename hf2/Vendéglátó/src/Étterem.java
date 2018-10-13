
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Étterem extends VendéglátóipariEgység {
    
    private String [] étlap;

    public Étterem(String[] étlap, String név, int férőhelyekSzáma, boolean dohányzó) {
        super(név, férőhelyekSzáma,dohányzó=false);
        this.étlap = étlap;
    }

    public String[] getÉtlap() {
        return étlap;
    }

    @Override
    public String toString() {
        return super.toString() + "Étterem"+Arrays.toString(étlap);
    }
    
    
    
   
    
    
}
