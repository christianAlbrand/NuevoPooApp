package models;

public class Posicion {
    private float x;
    private float y;
    
    public Posicion(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public Posicion() {
        this.x = 0;
        this.y = 0;
    }
    
    // Getters y Setters
    public float getX() {
        return this.x;
    }
    
    public void setX(float x) {
        this.x = x;
    }
    
    public float getY() {
        return this.y;
    }
    
    public void setY(float y) {
        this.y = y;
    }
    
    // Método para establecer ambas coordenadas a la vez
    public void setPosicion(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    // Método para mover la posición
    public void mover(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }
    
    @Override
    public String toString() {
        return "Posicion [x=" + x + ", y=" + y + "]";
    }
}