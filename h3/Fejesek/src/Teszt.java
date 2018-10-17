
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
public class Teszt {
    
    private static void rendezGyerek(Gyerek[] d)
    {
        for(int i = 0; i<d.length-1;i++)
        {
            for(int j = i+1; j<d.length;j++)
            {
                if(d[j].getElőzőneve().equals(d[i].getSajátneve()) && j > i+1)
                {
                    Gyerek tmp = d[i+1];
                    d[i+1] = d[j];
                    d[j]=tmp;
                }
            }
        }
        
    }
    
    private static void Piroskék(Gyerek[] d, String ki)
    {
        int piros=0;
        int kék=0;
        for (int i =0;i<d.length;i++)
        {
            if(d[i].getSajátneve().equals(ki))
            {
                System.out.println(piros + " " + kék);
            }
            else 
                if (i%2==0)
                {
                    piros++;
                }
            else
                {
                    kék++;
                }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        String[] s = sor.split(";");
        
        int n = Integer.parseInt(s[0]);
        Gyerek[] d = new Gyerek[n];
        d[0] = new Gyerek(s[1], " ");
        String X = s[2];
        
        for(int i=1;i<n;i++)
        {
            sor=sc.nextLine();
            s=sor.split(";");
            d[i] = new Gyerek(s[0],s[1]);
        }
        
        rendezGyerek(d);
        for(Gyerek i : d)
        {
            System.out.println(i);
        }
        
        Piroskék(d,X);
        
        
    }
    
}
