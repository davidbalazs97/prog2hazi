
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
public class kupateszt {
    
    
    public static Túra[] Rendez(Túra[] t)
    {
        for(int i=0;i<t.length-1;i++)
        {
            for(int j=1+1;j<t.length;j++)
            {
                int tav1=0;
                int tav2=0;
                for(int k=0;k<t[i].getTáv().length;k++)
                {
                    tav1=tav1+t[i].getTáv()[k];
                }
                 for(int k=0;k<t[j].getTáv().length;k++)
                {
                    tav2=tav2+t[j].getTáv()[k];
                }
                 
                 if(tav1<tav2)
                 {
                     Túra tmp = t[i];
                     t[i]=t[j];
                     t[j]=tmp;
                     
                 }
                 else if (tav1==tav2)
                 {
                     if(t[i].getNév().compareTo(t[j].getNév())>0)
                     {
                     Túra tmp = t[i];
                     t[i]=t[j];
                     t[j]=tmp;
                     }
                 }
                
                
            }
        }
        
        return t;
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
     int n= Integer.parseInt(sc.nextLine());
     Túra[] túrák = new Túra[n];
     
     for(int i=0;i<n;i++)
     {
         
         String sor=sc.nextLine();
         String[] s = sor.split(";");
         int[] arr=new int[s.length-4];
         for(int j=4;j<s.length;j++)
         {
             arr[j-4]=Integer.parseInt(s[j]);
         }
         túrák[i] = new Túra(Integer.parseInt(s[0]),Integer.parseInt(s[1]), Integer.parseInt(s[2]),s[3],arr);
         
     }
     
        Rendez(túrák);
        
        for(int i=0;i<2;i++)
        {
            System.out.println(túrák[i].getÉv() + " " +  túrák[i].getHónap()+ " " + " " +  túrák[i].getNap() + " " + " " +  túrák[i].getNév());
        }
     
}
    
    
}
