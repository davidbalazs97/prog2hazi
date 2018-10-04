/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nyunyo
 */
import java.util.Date;
import java.util.Objects;
public class Ital {
    
    protected String név;
    protected String kiszerelés;
    private static int ár=10;
    protected Date gyártásiDátum;

    public Ital(String név, String kiszerelés, Date gyártásiDátum) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.gyártásiDátum = gyártásiDátum;
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public static int getÁr() {
        return ár;
    }

    public Date getGyártásiDátum() {
        return gyártásiDátum;
    }

    public static void setÁr(int ár) {
        Ital.ár = ár;
    }

    @Override
    public String toString() {
        return this.getNév() + " " + this.getKiszerelés() + " " + ár + "FT "; 
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.név);
        hash = 31 * hash + Objects.hashCode(this.kiszerelés);
        hash = 31 * hash + Objects.hashCode(this.gyártásiDátum);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ital other = (Ital) obj;
        return true;
    }

   
  
    
    
    
    

    
}
