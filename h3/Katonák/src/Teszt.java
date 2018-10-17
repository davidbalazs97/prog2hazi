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
    
    public static Katona megkuzd(Katona k1, Katona k2)
    {
      
        Katona winner = new Katona();
        if(k1.getTamadoEro()>k2.getVedoEro())
        {
            winner = k1;
        }
        else
            if(k2.getTamadoEro()>k1.getVedoEro())
            {
                winner = k2;
            }
                else
                if(k2.getTamadoEro()==k1.getTamadoEro() && k2.getVedoEro()==k1.getVedoEro())
                {
                    winner = k1;
                }
        //System.out.println("A két katona: k1:" + k1.toString() + " k2:" + k2.toString());
        return winner;
        
    }
    
    public static void main(String[] args) {
        
        
        Landzsas egy = new Landzsas(30, 20);
        Nyilas ketto = new Nyilas(20, 10, 20);
        Nyilas harom = new Nyilas(200, 100, 230);
        Katona gy1 = megkuzd(egy,ketto);
        System.out.println(gy1);
        Katona gy2 = megkuzd(gy1,harom);
        System.out.println(gy2);
        
    }
    
}
