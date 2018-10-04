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
        
    
    int a = 3;
    QuadraticEquation egy = new QuadraticEquation(1,2,3);
    QuadraticEquation ketto = new QuadraticEquation(2,3,4);
    QuadraticEquation harom = new QuadraticEquation(0,2,8);
    
    if(egy.getDiscriminant()>=0)
    {
        System.out.println("Az 'egy' egyenlet gyökei: " + egy.getRoot1() + " , " + egy.getRoot2());
    }
    else System.out.println("The equation has no roots");
     if(ketto.getDiscriminant()>=0)
    {
        System.out.println("A 'ketto' egyenlet gyökei: " + ketto.getRoot1() + " , " + ketto.getRoot2());
    }
     else System.out.println("The equation has no roots");
      if(harom.getDiscriminant()>=0)
    {
        System.out.println("A 'harom' egyenlet gyökei: " + harom.getRoot1() + " , " + harom.getRoot2());
    }
      else System.out.println("The equation has no roots");
    
    }
}
