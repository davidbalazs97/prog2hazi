/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nyunyo
 */
public class main {
    
    public static void main(String[] args) {
        LinearEquation egy = new LinearEquation(1,2,3,4,5,6);
        LinearEquation ketto = new LinearEquation(11,3,33,44,55,66);
        LinearEquation harom = new LinearEquation(111,222,333,444,555,666);
        if(egy.isSolveable()==true)
        {
            System.out.println("az egy megoldásai: " + egy.getX() + " , " + egy.getY());
        } else System.out.println("The equation has no solution");
        if(ketto.isSolveable()==true)
        {
            System.out.println("az ketto megoldásai: " + ketto.getX() + " , " + ketto.getY());
        }else System.out.println("The equation has no solution");
        if(harom.isSolveable()==true)
        {
            System.out.println("az harom megoldásai: " + harom.getX() + " , " + harom.getY());
        }else System.out.println("The equation has no solution");
              
                
               
    }
    
}
