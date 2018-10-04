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
        Rectangle egy = new Rectangle(4,40);
        Rectangle ketto = new Rectangle(3.5,35.9);
        System.out.println("egy szélessége: " + egy.width);
        System.out.println("egy magassága: " + egy.height);
        System.out.println("egy területe: " + egy.getArea());
        System.out.println("egy kerülete: " + egy.getPerimeter());
        System.out.println("kettő szélessége: " + ketto.width);
        System.out.println("kettő magassága: " + ketto.height);
        System.out.println("kettő területe: " + ketto.getArea());
        System.out.println("kettő kerülete: " + ketto.getPerimeter() );
        
        
        
                 
    }
    
}
