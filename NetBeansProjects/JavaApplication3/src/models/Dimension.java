package models;

public class Dimension {
    private int ancho;
    private int alto;
    
    public Dimension(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public Dimension() {
        this.ancho = 0;
        this.alto = 0;
    }
    
    // Getters y Setters
    public int getAncho() {
        return this.ancho;
    }
    
    public void setAncho(int ancho) {
        if (ancho >= 0) {
            this.ancho = ancho;
        }
    }
    
    public int getAlto() {
        return this.alto;
    }
    
    public void setAlto(int alto) {
        if (alto >= 0) {
            this.alto = alto;
        }
    }
    
    // Método para establecer ambas dimensiones a la vez
    public void setDimension(int ancho, int alto) {
        setAncho(ancho);
        setAlto(alto);
    }
    
    @Override
    public String toString() {
        return "Dimension [ancho=" + ancho + ", alto=" + alto + "]";
    }
}