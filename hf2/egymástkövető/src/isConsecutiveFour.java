
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
public class isConsecutiveFour {
        public static boolean isConsecutiveFour(int[] values) {
        
       int count = 0;
       int db = 0;
       
       for (int i=0; i<values.length; i++){
            db++;
       }
       
       if (db<4){
           
           return false;
       } 
       
       else {
            
           for (int i=0; i<values.length; i++){
               
                for (int j=0; j<values.length; j++){
                    
                    if (values[i]==values[j]){
                        
                        count++;
                    }
                }
            }
            if (count<4){
                
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n=0;
        
        while(sc.hasNextInt()){
            
            int k=sc.nextInt();
            
            if (k==0){
                
                break;
            }
            
            n++;

        }
        
        int[] t=new int[n];
        System.out.println(isConsecutiveFour(t));
    }
}
    

