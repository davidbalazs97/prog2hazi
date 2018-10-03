/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nyunyo
 */

public class RegularPolygon {
    
    private int n;
    private double side;
    private double x;
    private double y;
    
    public RegularPolygon()
    {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
        
    }
    
    public RegularPolygon(int a, double b)
    {
        this.n = a;
        this.side = b;
        this.x = 0;
        this.y = 0;
    }
    
    public RegularPolygon (int a, double b, double c, double d)
    {
        this.n=a;
        this.side=b;
        this.x=c;
        this.y=d;
        
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double getPerimeter()
    {
       // this.n=n;
        //this.side=side;
        return this.n*this.side;
    }
    
    public double getArea()
    {
        
        return ((this.side*this.side)*this.n)/4*Math.tan(180/this.n); //ezt a képletet találtam a neten 
    }

    @Override
    public String toString() {
        return "RegularPolygon{" + "n=" + n + ", side=" + side + ", x=" + x + ", y=" + y + '}';
    }
    
    
}
