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
    public static void rendezMaxSzállíthatóTeherCsökkenőleg(Teherautó[] teher){
        
        for(int i=0; i<teher.length-1; i++){
            
            for(int j=i+1; j<teher.length; j++) {
                
                
                if(teher[i].getMaxSzállíthatóTeher()<teher[j].getMaxSzállíthatóTeher()){
                    
                    
                    
                    
                    Teherautó tmp=teher[i];
                    teher[i]=teher[j];
                    teher[j]=tmp;

                }
              }
        }
       

    }
    
    public static Autó keresMaxMotorTeljesítmény(Autó[] auto){
        int max=10000000;
        int a=0;
        
        for(int i=0;i<auto.length;i++){
            
            
            if(auto[i].getMotorTeljesítmény()> max){
                
                max=auto[i].getMotorTeljesítmény();
                a=i;
            }
            
        }
        
        return auto[a];
    }

    
    
    public static void main(String[] args) {
        
           Autó[] auto = new Autó[]{
               new Autó("ergqe", 3101),
               new Autó("erbver", 3101),
                new Autó("23fq3", 3131),
               new Autó("q4fq   ", 3151),
               new Autó("6jme56m", 3171),
               new Teherautó(1540,"q5ghq",30400),
               new Teherautó(200,"rghq",3050),
               new Teherautó(20,"q34gf",3200),
               new Teherautó(1230,"q34gq3",3050),
               new Teherautó(1200,"3gtq34fg",3009)
             };
           
           Teherautó[] teher = new Teherautó[]{
              new Teherautó(10070,"rfgqwf",3034),
               new Teherautó(1600,"dfrrwt",5400),
               new Teherautó(1050,"rgqg",33400),
               new Teherautó(10003,"rthqwertg",654000),
               new Teherautó(2000,"erbq345",3060),
               new Teherautó(150,"5h24",30000),
               new Teherautó(1030,"g23",3050),
               new Teherautó(12300,"35g2345g",30400),
               new Teherautó(150,"35gq234",3065400),
               new Teherautó(10340,"34gq34",45000)
            };
           rendezMaxSzállíthatóTeherCsökkenőleg(teher);
           
           for(Teherautó t:teher){
            System.out.println(t);
        }
        
        System.out.println(keresMaxMotorTeljesítmény(auto));
        
         }
               
}
        
        
    
   