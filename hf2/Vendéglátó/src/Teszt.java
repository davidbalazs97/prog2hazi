/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Teszt {
    
    public static Kocsma[] adottItaltKínálóKocsmák(VendéglátóipariEgység[] vend, String italnev)
    {
        int cnt=0;
        for(int i=0;i<vend.length;i++)
        {
            if(vend[i] instanceof Kocsma)
            {
                Kocsma kocs =(Kocsma)vend[i];
                for(int j=0; j<kocs.getSörlap().length;j++)
                {
                    if(kocs.getSörlap()[j].equals(italnev))
                    {
                        cnt++;
                    }
                }
                
            }
            
        }
        
        Kocsma[] kocsma = new Kocsma[cnt];
        int n;
        for(int i=0;i<vend.length;i++)
        {
            if(vend[i] instanceof Kocsma)
            {
                
            }
        }
        
    }
    public static void main(String[] args) {
        
        VendéglátóipariEgység v[] = new VendéglátóipariEgység[10];
        v[0] = new Kocsma(new String[]{"fsdf","asda","bubu"}, "Kocsma1", 4, true);
        v[1] = new Kocsma(new String[]{"fsdf","asda"}, "Kocsma2", 4, true);
        v[2] = new Kocsma(new String[]{"fsdf","asda"}, "Kocsma3", 4, true);
        v[3] = new Kocsma(new String[]{"fsdf","asda"}, "Kocsma4", 4, true);
        v[4] = new Kocsma(new String[]{"fsdf","asda"}, "Kocsma5", 4, true);
        v[5] = new Étterem(new String[]{"kifli","kenyér"}, "Étterem1", 4, false);
        v[6] = new Étterem(new String[]{"kifli","kenyér"}, "Étterem2", 4, false);
        v[7] = new Étterem(new String[]{"kifli","kenyér"}, "Étterem3", 4, false);        
        v[8] = new Étterem(new String[]{"kifli","kenyér"}, "Étterem4", 4, false);
        v[9] = new Étterem(new String[]{"kifli","kenyér"}, "Étterem5", 4, false);
    }
    
}
