/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import processing.core.PApplet;

    
    
public class Figura {
    
    protected Posicion posicion;
    protected Dimension dimension;
    protected int color;
    protected Borde borde;
    
    public Figura(){
        this(new Posicion(), new Dimension(100, 100), new Borde(), 255);
    }
    
    public Figura(Posicion posicion, Dimension dimension, Borde borde, int color){
        this.posicion = posicion;
        this.dimension = dimension;
        this.borde = borde;
        this.color = color;
    }
    public Posicion getPosicion(){
        return this.posicion;
    }
    
    public Dimension getDimension(){
        return this.dimension;
    }
    
    public Borde getBorde(){
        return this.borde;
    }
  
    
    public int getColor(){
        return this.color;
    }
    
    
    public void setPosicion(Posicion nuevaPosicion){
        this.posicion = nuevaPosicion;
    }
    
    public void setDimension (Dimension nuevaDimension){
        this.dimension = nuevaDimension; 
    }
    
    public void setBorde (Borde nuevoBorde){
        this.borde = nuevoBorde;
    }
    
    
    public void setColor(int nuevoValor){
        this.color = nuevoValor;
    }
    
    public void dibujar(PApplet p){
        configuraPropiedades(p);
        p.rect(this.posicion.getX(), this.posicion.getY(), this.dimension.getAncho(), this.dimension.getAlto());
        
    }
    
    public void configuraPropiedades(PApplet p){
        p.stroke(this.borde.getColor());
        p.strokeWeight(this.borde.getAncho());
        p.fill(this.color);
        
        
    }
    
    public void moverHorizontal(){
        float xNueva = this.posicion.getX() + 1;
        this.posicion.setX(xNueva);
    }
}
