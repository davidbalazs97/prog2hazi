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
    
    public static void main(String[] args) {
        
    
    Triangle hszg = new Triangle(1,1.5,1,"Yellow", true);
    System.out.println("terület:" + hszg.getArea() + " " + " szín:" + hszg.getColor() + " " + " kitöltve:" + hszg.isFilled());
    
}
}
