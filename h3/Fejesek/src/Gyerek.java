/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Gyerek {
    
    public String sajátneve;
    public String előzőneve;

    public Gyerek(String sajátneve, String előzőneve) {
        this.sajátneve = sajátneve;
        this.előzőneve = előzőneve;
    }
    
    public String getSajátneve() {
        return sajátneve;
    }

    public String getElőzőneve() {
        return előzőneve;
    }

    @Override
    public String toString() {
        return "Gyerek{" + "saj\u00e1tneve=" + sajátneve + ", el\u0151z\u0151neve=" + előzőneve + '}';
    }
    
    
    
    
}
