
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Hullamteszt {

    public static Hullámvasút[] Rendez (Hullámvasút[] h)
    {
        for(int i=0; i<h.length-1;i++)
        {
            for(int j = i+1; j<h.length;j++)
            {
              if(h[i].getVarakozasi_ido()>h[j].getVarakozasi_ido() && j>i+1)
              {
                  Hullámvasút tmp = h[i];
                  h[i]=h[j];
                  h[j]=tmp;
              }
            }
        }
        return h;
        
    }
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        Hullámvasút[] vasút = new Hullámvasút[n];
        for(int i=0;i<n;i++)
        {
            String sor= sc.nextLine();
            String[] s=sor.split(";");
            vasút[i] = new Hullámvasút(s[0],s[1],Integer.parseInt(s[2]),Integer.parseInt(s[3]));
        }
        
        Rendez(vasút);
        
        for(int i =0;i<n;i++)
        {
            System.out.println(vasút[i]);
        }
        
        
        
    }
    
    
    
    
    
}
