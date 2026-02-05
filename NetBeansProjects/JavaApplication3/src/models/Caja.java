package models;

import processing.core.PApplet;

public class Caja extends Figura{
    
    public Caja(){
        this(new Posicion(), new Dimension(100, 100), new Borde(), 255);
    }
    
    public Caja(Posicion posicion, Dimension dimension, Borde borde, int color){
        
        super(new Posicion(), new Dimension(100, 100), new Borde(), 255);
    }
}
