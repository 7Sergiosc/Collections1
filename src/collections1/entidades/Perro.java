package collections1.entidades;

import java.util.ArrayList;

public class Perro {
    public String raza;

    public Perro(String raza) {
        this.raza = raza;
    }


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return " Raza: " + raza;
    }
    
    
    
}
