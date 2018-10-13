/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
import java.util.Date;
public class GeometricShape {
    
    private String color;
    private boolean filled;
    private Date DateCreated;

    public GeometricShape() {
        this.color = "Brown";
        this.filled = filled;
        this.DateCreated= new Date();
        
    }

    public GeometricShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.DateCreated= new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isFilled()
    {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return DateCreated;
    }

    @Override
    public String toString() {
        return "was created on " + getDateCreated() + "\n" + "color:" + getColor() + "\n Filled:" + isFilled();
    }
    
    
}
