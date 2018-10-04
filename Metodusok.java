/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nyunyo
 */
public class Metodusok {
    
    
    public static void novekvo(int a, int b, int c)
    {
        int max, med, min;
        if( a > b ){
    if( a > c ){
    max = a;
        if( b > c ){
            med = b;
            min = c;
        }else{
            med = c;
            min = b;
            }
        }else{
            med = a;
            max = c;
            min = b;
            }
        }else{
            if( b > c ){
        max = b;
        if( a > c ){
            med = a;
             min = c;
        }else{
            med = c;
            min = a;
        }
        }else{
            med = b;
            max = c;
            min = a;
         }
        }   
        System.out.println(min + " , " + med + " , " + max);
        
        
    }
    
    public static void minmax(double a, double b, double c)
    {
        double min=0, aa, ba, ca, maxa=0;
        if (a<b && a<c)
        
            min = a;
            if(b<a && b<c)
                min = b;
                if(c<a && c<b)
                    min = b;
        
        
        if(a<0) aa=a*-1;
        else aa=a;
        if(b<0) ba=b*-1;
        else ba=b;
        if(c<0) ca=c*-1;
        else ca=c;
        
        if(aa>ba && aa>ca)
        
            maxa=aa;
        if(ba>aa && ba>ca)
                maxa=ba;
        if(ca>aa && ca>ba)
                    maxa=ca;
        
        System.out.println("A három szám minimuma" + min + "\nA három szám absz. maximuma " + maxa);
        
            
        
    }
    
    public static void negyszam(double a, double b,double c, double d)
    {
        System.out.println(a + "," + b + "," + c + "," + d);
        if (d>=0)
        {
            System.out.println("\n" + a + "," + c + "," + b + "," + d);
        }
        else System.out.println("\n" + a + "," + b + "," + d + "," + c);
    }
    
    public static boolean isHaromszog(double a, double b, double c)
    {
        if(a<0 || b<0 || c<0) return false;
        
        if(a+b>c && a+c>b && b+c>a) return true;
        else
        
        return false;
    }
    
    public static void szokoev(int ev1, int ev2)
    {
        
        int szokoszam=0;
        int i;
        if (ev1<ev2)
        {
            
            for(i=ev1;i<=ev2;i++)
            {
                if (i%4==0 && i%100!=0 || i%400==0)
                {
                    szokoszam=szokoszam+1;
                }
            }
            System.out.println("A két év közt " + szokoszam + " db szökőév van.");
        }
        else
        if (ev2<ev1)
        {
            for(i=ev2;i<=ev1;i++)
            {
               if(i%4==0 && i%100!=0 || i%400==0)
               {
                   szokoszam=szokoszam+1;
               }
            }
            System.out.println("A két év közt " + szokoszam + " db szökőév van.");
        }
        else
        if (ev2==ev1)
        {
            if(ev1%4==0 && ev1%100!=0 || ev1%400==0)
            {
                System.out.println("Az év szököév");
            }
            else System.out.println("Az év nem szökőév");
        }
        
        
    }
    
    public static void ertekeles(int jegy)
    {
        switch(jegy){
            case 1: System.out.println("Elégtelen");break;    
            case 2: System.out.println("Elégséges");break;
            case 3: System.out.println("Közepes");break;
            case 4: System.out.println("Jó");break;
            case 5: System.out.println("Kiváló");break;
            default: System.out.println("Ilyen nincs");
            break;
                    }
            
        
        
    }
    public static int osztas(int a, int b)
    {
        int hanyados=0;
        while(a>=b)
        {
            hanyados=hanyados+1;
            a=a-b;
        }
        return hanyados;
    }
    
    public static void isPrime(int a)
    {
        
        int i;
        int cnt=0;
        for(i=1;i<=Math.sqrt(a);i++)
        {
            if(a%i==0)
            {
                cnt=cnt+1;
            }
        }
        if(cnt==1)
        {
            System.out.println("prímszám");
        }else System.out.println("nem Prímszám");
        
    }
    public static void fibonacci(int n)
    {
        int a=0;
        int b=1;
        int c;
        int k;
        if(n==1)
        {
            System.out.println(a);
        }
        else
        if(n==2)
            System.out.println(a + " " + b);
        else
        {
            c=a+b;
            System.out.println(a + "," + b + "," + c);
            k=3;
            while(k<n)
            {
                a=b;
                b=c;
                c=a+b;
                System.out.println(c);
                k=k+1;
            }
        }   
        
        
    }
    public static void fibonacci2(int n)
    {
        int a = 1;
        int b = 0;
        int k;
        for(k=0;k<=n;k++)
        {
            System.out.println(b);
            b=a+b;
            a=b-a;
        }
    }
    
    public static int megfordit(int a)
    {
        int szj;
        int ujszam=0;
        int masolat;
        masolat=a;
        if(a>=9)
        {
            
        
        while(a>0)
        {
            
            
           ujszam=ujszam*10;
           ujszam=ujszam+a%10;
           a=a/10;
            
        }
        return ujszam;
        }
        else return 0;
    }
    
    public static int faktorialis(int a)
    {
        int i;
        int eredmeny=1;
        for(i=a;i>1;i--)
        {
            eredmeny=eredmeny*i;
        }
        return eredmeny;
    }
    
    public static void parameteresoszthatosag(int n1, int n2, int szam)
    {
        int i;
        
        if(n2>n1)
        {
        for(i=n1;i<n2;i++)
        {
            if(i%szam==0)
            {
                System.out.println(i + ",");
            }
        }
        }
         if(n1>n2)
        {
        for(i=n1;i>n2;i--)
        {
            if(i%szam==0)
            {
                System.out.println(i + ",");
            }
        }
        }
         if(n1==n2)
         {
             if(n1%szam==0) System.out.println(n1);
         }
         
         
                
        
    }
    
     public static int legkisebbfibonacci(int n)
                 {
                     int i;
                     int szam1=0;
                     int szam2=1;
                     int szam3=2;
                     do
                     {
                        szam1=szam2;
                        szam2=szam3;
                        szam3=szam1+szam2;
                         //System.out.println(szam3);
                     }while(szam1<n);
                     
                     return szam1;
                 }
     
    public static void kob()
     {
         int i;
         int osszeg=0;
         int masolat; 
         int e;
         for(i=1;i<1000;i++)
         {
           masolat = i;
           while(masolat!=0)
           {
              e = masolat%10;
	      osszeg += e*e*e;
	      masolat/=10;
           }
           if (i==osszeg) System.out.println(i);
           osszeg=0;
         }
     }
    public static void main(String[] args) {
        
       // novekvo(965,36625,7549);
       // minmax(3,-50,4);
        //negyszam(4,123,88,98);
        //isHaromszog(1,1,1);
        //szokoev(1900,2020);
        //ertekeles(4);
        //System.out.println(osztas(10,1));
       // isPrime(7);
       // fibonacci2(96);
        //System.out.println(megfordit(123456));
        //System.out.println(faktorialis(4));
       // parameteresoszthatosag(1,100,10);
        //System.out.println(legkisebbfibonacci(7));
        kob();
    }
    
}
