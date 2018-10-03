/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nyunyo
 */
public class Rectangle {
    
    public double width;
    public double height;
    
    public Rectangle()
            {
                this.width = 1;
                this.height = 1;
                
            }
    
    public Rectangle(double a, double b)
    {
                this.width = a;
                this.height = b;
                
    }
    
    public double getArea()
    {
        return this.width*this.height;
    }
    
    public double getPerimeter()
    {
        return (2*this.width)+(2*this.height);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }
    
    
    
    
}
