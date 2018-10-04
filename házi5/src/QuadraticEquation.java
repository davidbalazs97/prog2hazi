/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nyunyo
 */
public class QuadraticEquation {
    
    public double a;
    public double b;
    public double c;
    
    public QuadraticEquation(double g, double h, double j)
    {
        this.a = g;
        this.b = h;
        this.c = j;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    
    public double getDiscriminant()
    {
        return (this.b*this.b)-4*this.a*this.c;
    }
    
    public double getRoot1()
    {
        if (this.getDiscriminant()>0)
        {
            return -this.b-Math.sqrt(this.getDiscriminant())/2*this.a;
        }
        else
            return 0;
    }
    
    public double getRoot2()
    {
        if (this.getDiscriminant()>0)
        {
            return -this.b+Math.sqrt(this.getDiscriminant())/2*this.a;
        }
        else
            return 0;
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
    
}
