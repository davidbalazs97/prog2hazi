/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
import java.util.Arrays;
import java.util.Scanner;

public class Teszt {
    
    public static int mennyi(String s, char c)
    {
        int ennyi=0;
        
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)==c)
                ennyi++;
            
        return ennyi;
    
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        Turista[] t=new Turista[n];
        
        for(int i=0;i<n;i++)
        {
            
            String sor=sc.next();
            
            String[] s=sor.split(";");
            
            int kek=0;
            int egyeb=0;
            
            kek=mennyi(s[1],'K');
            
            egyeb=mennyi(s[1],'P')+mennyi(s[1],'S')+mennyi(s[1],'Z');
            
            Turista ti=new Turista(s[0],kek,egyeb);
            t[i]=ti;
        }
        
        Arrays.sort(t);
        
        for(int i=0;i<n;i++)
            System.out.println(t[i].getNev());
    }
    
}