/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nyunyo
 */
public class Test {
    
    public static void main(String[] args) {
        
        RegularPolygon egy = new RegularPolygon();
        RegularPolygon ketto = new RegularPolygon(6,4);
        RegularPolygon harom = new RegularPolygon (10,4,5.6,7.8);
        System.out.println("Egy kerulete = " + egy.getPerimeter());
        System.out.println("Egy terulete = " + egy.getArea());
        System.out.println("Ketto kerulete = " + ketto.getPerimeter());
        System.out.println("Ketto terulete = " + ketto.getArea());
        System.out.println("Harom kerulete = " + harom.getPerimeter());
        System.out.println("Harom terulete = " + harom.getArea());
        
    }
    
}
